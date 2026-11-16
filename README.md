# `pfm-contracts`

> **Repositório #01 da Topologia Oficial Multi-Repo (14 Repositórios) — PFM Core Banking (`Sorobanerp`)**

- **Descrição**: Single Source of Truth (SSoT) para Contratos Assíncronos Apache Kafka (Protobuf v3), Contratos Síncronos gRPC HTTP/2 (`pfm-core-ledger-java` e `pfm-forecast-engine-go`) e Especificações OpenAPI 3.1.
- **Stack Homologada (ADR-001 / ADR-003)**: `Buf CLI v2, Protobuf v3, gRPC HTTP/2, Apache Kafka, OpenAPI 3.1`
- **Targets de Codegen**: **Golang**, **Java 25 LTS** e **Python 3.12+**
- **Arquitetura**: Hexagonal Architecture (Ports & Adapters) & Zero-Trust Multi-Tenancy (ADR-006)
- **Documentação Executiva, C4, ADRs, PRD & SRE**: [https://sorobanerp.github.io/pfm-docs/](https://sorobanerp.github.io/pfm-docs/)

---

## 1. Estrutura do Repositório

```text
pfm-contracts/
├── buf.yaml                              # Configuração de módulo Buf v2 (lint STANDARD & breaking FILE)
├── buf.gen.yaml                          # Pipeline de codegen multi-linguagem (Go, Java 25 LTS, Python)
├── Makefile                              # Automação: make lint, make generate, make breaking, make format
├── proto/
│   └── pfm/
│       └── v1/
│           ├── ledger_events.proto       # Eventos Assíncronos Apache Kafka (particionados por tenant_id)
│           ├── core_ledger_service.proto # Contrato gRPC exposto pelo pfm-core-ledger-java
│           └── forecast_service.proto    # Contrato gRPC exposto pelo pfm-forecast-engine-go
├── gen/                                  # SDKs / Stubs gerados automaticamente via `make generate`
│   ├── go/pfm/v1/                        # Pacote Go (pfmv1) + gRPC stubs
│   ├── java/com/sorobanerp/pfm/v1/       # Classes Java 25 LTS + gRPC Service stubs
│   └── python/pfm/v1/                    # Módulos Python (_pb2.py, _pb2.pyi, _pb2_grpc.py)
├── openapi/v1/                           # Contratos REST BFF / Edge Gateway
└── schemas/kafka/v1/                     # Metadados auxiliares de governança do Schema Registry
```

---

## 2. Catálogo de Contratos Protobuf v3 (`pfm.v1`)

### 2.1. Eventos Assíncronos do Apache Kafka (`proto/pfm/v1/ledger_events.proto`)

Todos os eventos seguem três invariantes arquiteturais inegociáveis:
1. **Isolamento Multi-Tenant & Ordenação Causal**: Particionamento obrigatório no Kafka pela chave `tenant_id`.
2. **Precisão Monetária Exata (IEEE 754 Free)**: Todos os valores financeiros, quantidades fracionárias e taxas utilizam `string` decimal exata (ex: `"1450.99"`), prevenindo erros de ponto flutuante e mapeando diretamente para `BigDecimal` (Java 25), `shopspring/decimal` (Go) e `decimal.Decimal` (Python).
3. **Idempotência Determinística**: Todo evento carrega um hash SHA-256 em `idempotency_key` para deduplicação transacional (`Inbox/Outbox Pattern`).

| Mensagem Protobuf | Tópico Kafka | Produtor Principal | Consumidor(es) |
| :--- | :--- | :--- | :--- |
| `StatementTransactionExtractedEvent` | `statement.raw.extracted` | `pfm-ingestion-worker-py` | `pfm-categorization-ai-py`, `pfm-core-ledger-java` |
| `TransactionCategorizedEvent` | `tx.categorized` | `pfm-categorization-ai-py` | `pfm-core-ledger-java`, `pfm-analytics-clickhouse` |
| `ReceiptItemsExtractedEvent` | `receipt.items.extracted` | `pfm-nfce-scraper-py` | `pfm-core-ledger-java` |
| `LedgerEntryCommittedEvent` | `ledger.entry.committed` | `pfm-core-ledger-java` | `pfm-forecast-engine-go`, `pfm-notification-service` |

### 2.2. Contrato gRPC do Core Ledger (`proto/pfm/v1/core_ledger_service.proto`)

Exposto pelo microsserviço **`pfm-core-ledger-java`** (Java 25 LTS + Spring Boot 4):
- `ProcessReceipt(ProcessReceiptRequest) returns (ProcessReceiptResponse)`: Conciliação determinística/fuzzy entre cupom fiscal eletrônico (NFC-e / SEFAZ) e lançamentos da fatura de cartão de crédito, além de detecção automática de inflação de preços **>10% por código de barras EAN** em relação ao histórico de compras.
- `GetTenantFinancialSummary(GetTenantFinancialSummaryRequest) returns (GetTenantFinancialSummaryResponse)`: Consolidação em baixa latência da **Matriz Multi-Cartões**, **Fatura Atual**, projeção **M+1** e linha do tempo de **Comprometimento Futuro da Renda**.

### 2.3. Contrato gRPC do Motor de Forecast (`proto/pfm/v1/forecast_service.proto`)

Exposto pelo microsserviço **`pfm-forecast-engine-go`** (Golang):
- `SimulateContractAmortization(SimulateContractRequest) returns (SimulateContractResponse)`: Simulação matemática de alta precisão para contratos **SAC**, **Tabela Price** e **Consórcio**, comparando estratégias de amortização extraordinária (**Redução de Prazo** vs. **Redução de Parcela**), número de meses eliminados, economia líquida de juros/taxas e ROI efetivo.

---

## 3. Política de Versionamento Semântico (SemVer 2.0.0) & Evolução de Schemas

Os contratos deste repositório seguem rigorosamente **Semantic Versioning (`MAJOR.MINOR.PATCH`)** aliado ao controle de pacote Protobuf (`pfm.v1`, `pfm.v2`, etc.) e verificação automatizada via `buf breaking`.

### 3.1. Regras de Versão (`vMAJOR.MINOR.PATCH`)

- **`MAJOR` (`v1.0.0` -> `v2.0.0` / pacote `pfm.v2`)**:
  - Alterações incompatíveis com versões anteriores (*Breaking Changes*).
  - Exige a criação de um novo namespace de diretório e pacote (`proto/pfm/v2/`) mantendo o `pfm.v1` ativo durante a janela de depreciação (mínimo de 2 Sprints) para suportar *rolling upgrades* sem downtime.
  - Exemplos: remover ou renomear um RPC, alterar o tipo de um campo existente, alterar o número de tag Protobuf ou mudar a chave de particionamento de um tópico Kafka.
- **`MINOR` (`v1.0.0` -> `v1.1.0`)**:
  - Evoluções retrocompatíveis (*Backward & Forward Compatible*).
  - Exemplos: adicionar novos campos opcionais ao final de uma `message` com novas tags numéricas, adicionar novos valores a um `enum`, adicionar um novo método RPC a um `service` existente ou criar um novo evento de domínio.
- **`PATCH` (`v1.0.0` -> `v1.0.1`)**:
  - Correções de documentação, comentários em `.proto`, ajustes em opções de empacotamento que não alterem o *wire format* binário nem a assinatura pública dos SDKs.

### 3.2. Regras Invioláveis de Compatibilidade Binária Protobuf v3

1. **Jamais reutilize números de campo (Field Tags)**: Ao deprecar um campo, marque-o com `reserved <tag_number>;` e `reserved "<field_name>";`.
2. **Jamais altere o tipo primitivo de um campo existente**: Qualquer mudança de tipo requer um novo campo com nova tag numérica.
3. **Valores Monetários sempre em `string`**: É proibido introduzir tipos `float` ou `double` para grandezas financeiras ou taxas percentuais.
4. **Gate de CI/CD**: Todo Pull Request executa obrigatoriamente `make lint` e `make breaking` comparando contra a branch `main`.

---

## 4. Como Validar e Gerar Código

Pré-requisito: [Buf CLI](https://buf.build/docs/installation) instalado no `PATH`.

```bash
# 1. Executar linting estático e formatação dos contratos Protobuf v3
make lint
make format

# 2. Gerar stubs Protobuf v3 + gRPC para Golang, Java 25 LTS e Python
make generate

# 3. Verificar ausência de breaking changes contra a branch main
make breaking
```

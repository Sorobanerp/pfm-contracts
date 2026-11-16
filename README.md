# `pfm-contracts`

> **Repositório #01 da Topologia Oficial Multi-Repo (14 Repositórios) — PFM Core Banking (`Sorobanerp`)**

- **Descrição**: PFM Core Banking — Single Source of Truth for REST (OpenAPI 3.1), gRPC (Protobuf v3) and Kafka Event Schemas
- **Stack Homologada (ADR-001)**: `OpenAPI 3.1, Protobuf v3, JSON Schema / Avro`
- **Arquitetura**: Hexagonal Architecture (Ports & Adapters) / Zero-Trust Multitenancy (ADR-006)
- **Documentação Executiva, C4, ADRs, PRD & SRE**: [https://sorobanerp.github.io/pfm-docs/](https://sorobanerp.github.io/pfm-docs/)
- **Repositório de Documentação**: [Sorobanerp/pfm-docs](https://github.com/Sorobanerp/pfm-docs)

---

## Estrutura de Diretórios Inicial

```text
pfm-contracts/
├── openapi/v1/
├── proto/pfm/v1/
├── schemas/kafka/v1/
└── README.md
```

## Governança & Contratos (DoR / DoD V2)

Consulte as especificações completas no portal de documentação:
- [ADRs V2 (ADR-001 a ADR-007)](https://sorobanerp.github.io/pfm-docs/architecture/adrs/)
- [Modelo C4 & Topologia de 14 Repositórios](https://sorobanerp.github.io/pfm-docs/architecture/c4-model/)
- [PRD Core Banking & Regras RN01–RN06](https://sorobanerp.github.io/pfm-docs/product/prd-core-banking/)
- [Backlog Scrum & Cenários BDD Gherkin](https://sorobanerp.github.io/pfm-docs/product/backlog-bdd/)

from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class EventMetadata(_message.Message):
    __slots__ = ("event_id", "idempotency_key", "tenant_id", "occurred_at", "trace_id", "producer", "schema_version")
    EVENT_ID_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    OCCURRED_AT_FIELD_NUMBER: _ClassVar[int]
    TRACE_ID_FIELD_NUMBER: _ClassVar[int]
    PRODUCER_FIELD_NUMBER: _ClassVar[int]
    SCHEMA_VERSION_FIELD_NUMBER: _ClassVar[int]
    event_id: str
    idempotency_key: str
    tenant_id: str
    occurred_at: str
    trace_id: str
    producer: str
    schema_version: str
    def __init__(self, event_id: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., tenant_id: _Optional[str] = ..., occurred_at: _Optional[str] = ..., trace_id: _Optional[str] = ..., producer: _Optional[str] = ..., schema_version: _Optional[str] = ...) -> None: ...

class StatementTransactionExtractedEvent(_message.Message):
    __slots__ = ("tenant_id", "idempotency_key", "metadata", "statement_id", "account_id", "card_last_four", "transaction_date", "raw_description", "amount", "currency", "installment_number", "total_installments")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    METADATA_FIELD_NUMBER: _ClassVar[int]
    STATEMENT_ID_FIELD_NUMBER: _ClassVar[int]
    ACCOUNT_ID_FIELD_NUMBER: _ClassVar[int]
    CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    TRANSACTION_DATE_FIELD_NUMBER: _ClassVar[int]
    RAW_DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    INSTALLMENT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    TOTAL_INSTALLMENTS_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    idempotency_key: str
    metadata: EventMetadata
    statement_id: str
    account_id: str
    card_last_four: str
    transaction_date: str
    raw_description: str
    amount: str
    currency: str
    installment_number: int
    total_installments: int
    def __init__(self, tenant_id: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., metadata: _Optional[_Union[EventMetadata, _Mapping]] = ..., statement_id: _Optional[str] = ..., account_id: _Optional[str] = ..., card_last_four: _Optional[str] = ..., transaction_date: _Optional[str] = ..., raw_description: _Optional[str] = ..., amount: _Optional[str] = ..., currency: _Optional[str] = ..., installment_number: _Optional[int] = ..., total_installments: _Optional[int] = ...) -> None: ...

class TransactionCategorizedEvent(_message.Message):
    __slots__ = ("tenant_id", "idempotency_key", "metadata", "transaction_id", "normalized_merchant", "category_code", "category_name", "amount", "currency", "confidence_score", "classification_source")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    METADATA_FIELD_NUMBER: _ClassVar[int]
    TRANSACTION_ID_FIELD_NUMBER: _ClassVar[int]
    NORMALIZED_MERCHANT_FIELD_NUMBER: _ClassVar[int]
    CATEGORY_CODE_FIELD_NUMBER: _ClassVar[int]
    CATEGORY_NAME_FIELD_NUMBER: _ClassVar[int]
    AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_SCORE_FIELD_NUMBER: _ClassVar[int]
    CLASSIFICATION_SOURCE_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    idempotency_key: str
    metadata: EventMetadata
    transaction_id: str
    normalized_merchant: str
    category_code: str
    category_name: str
    amount: str
    currency: str
    confidence_score: str
    classification_source: str
    def __init__(self, tenant_id: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., metadata: _Optional[_Union[EventMetadata, _Mapping]] = ..., transaction_id: _Optional[str] = ..., normalized_merchant: _Optional[str] = ..., category_code: _Optional[str] = ..., category_name: _Optional[str] = ..., amount: _Optional[str] = ..., currency: _Optional[str] = ..., confidence_score: _Optional[str] = ..., classification_source: _Optional[str] = ...) -> None: ...

class ExtractedReceiptItem(_message.Message):
    __slots__ = ("item_sequence", "ean", "description", "quantity", "unit_of_measure", "unit_price", "total_price", "ncm_code")
    ITEM_SEQUENCE_FIELD_NUMBER: _ClassVar[int]
    EAN_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    QUANTITY_FIELD_NUMBER: _ClassVar[int]
    UNIT_OF_MEASURE_FIELD_NUMBER: _ClassVar[int]
    UNIT_PRICE_FIELD_NUMBER: _ClassVar[int]
    TOTAL_PRICE_FIELD_NUMBER: _ClassVar[int]
    NCM_CODE_FIELD_NUMBER: _ClassVar[int]
    item_sequence: int
    ean: str
    description: str
    quantity: str
    unit_of_measure: str
    unit_price: str
    total_price: str
    ncm_code: str
    def __init__(self, item_sequence: _Optional[int] = ..., ean: _Optional[str] = ..., description: _Optional[str] = ..., quantity: _Optional[str] = ..., unit_of_measure: _Optional[str] = ..., unit_price: _Optional[str] = ..., total_price: _Optional[str] = ..., ncm_code: _Optional[str] = ...) -> None: ...

class ReceiptItemsExtractedEvent(_message.Message):
    __slots__ = ("tenant_id", "idempotency_key", "metadata", "receipt_id", "access_key", "merchant_tax_id", "merchant_name", "issued_at", "total_amount", "discount_amount", "currency", "payment_method", "items")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    METADATA_FIELD_NUMBER: _ClassVar[int]
    RECEIPT_ID_FIELD_NUMBER: _ClassVar[int]
    ACCESS_KEY_FIELD_NUMBER: _ClassVar[int]
    MERCHANT_TAX_ID_FIELD_NUMBER: _ClassVar[int]
    MERCHANT_NAME_FIELD_NUMBER: _ClassVar[int]
    ISSUED_AT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    DISCOUNT_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_METHOD_FIELD_NUMBER: _ClassVar[int]
    ITEMS_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    idempotency_key: str
    metadata: EventMetadata
    receipt_id: str
    access_key: str
    merchant_tax_id: str
    merchant_name: str
    issued_at: str
    total_amount: str
    discount_amount: str
    currency: str
    payment_method: str
    items: _containers.RepeatedCompositeFieldContainer[ExtractedReceiptItem]
    def __init__(self, tenant_id: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., metadata: _Optional[_Union[EventMetadata, _Mapping]] = ..., receipt_id: _Optional[str] = ..., access_key: _Optional[str] = ..., merchant_tax_id: _Optional[str] = ..., merchant_name: _Optional[str] = ..., issued_at: _Optional[str] = ..., total_amount: _Optional[str] = ..., discount_amount: _Optional[str] = ..., currency: _Optional[str] = ..., payment_method: _Optional[str] = ..., items: _Optional[_Iterable[_Union[ExtractedReceiptItem, _Mapping]]] = ...) -> None: ...

class LedgerPostingLine(_message.Message):
    __slots__ = ("account_code", "direction", "amount", "currency")
    ACCOUNT_CODE_FIELD_NUMBER: _ClassVar[int]
    DIRECTION_FIELD_NUMBER: _ClassVar[int]
    AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    account_code: str
    direction: str
    amount: str
    currency: str
    def __init__(self, account_code: _Optional[str] = ..., direction: _Optional[str] = ..., amount: _Optional[str] = ..., currency: _Optional[str] = ...) -> None: ...

class LedgerEntryCommittedEvent(_message.Message):
    __slots__ = ("tenant_id", "idempotency_key", "metadata", "journal_entry_id", "source_reference_id", "posting_date", "total_amount", "currency", "postings", "resulting_balance")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    METADATA_FIELD_NUMBER: _ClassVar[int]
    JOURNAL_ENTRY_ID_FIELD_NUMBER: _ClassVar[int]
    SOURCE_REFERENCE_ID_FIELD_NUMBER: _ClassVar[int]
    POSTING_DATE_FIELD_NUMBER: _ClassVar[int]
    TOTAL_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    POSTINGS_FIELD_NUMBER: _ClassVar[int]
    RESULTING_BALANCE_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    idempotency_key: str
    metadata: EventMetadata
    journal_entry_id: str
    source_reference_id: str
    posting_date: str
    total_amount: str
    currency: str
    postings: _containers.RepeatedCompositeFieldContainer[LedgerPostingLine]
    resulting_balance: str
    def __init__(self, tenant_id: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., metadata: _Optional[_Union[EventMetadata, _Mapping]] = ..., journal_entry_id: _Optional[str] = ..., source_reference_id: _Optional[str] = ..., posting_date: _Optional[str] = ..., total_amount: _Optional[str] = ..., currency: _Optional[str] = ..., postings: _Optional[_Iterable[_Union[LedgerPostingLine, _Mapping]]] = ..., resulting_balance: _Optional[str] = ...) -> None: ...

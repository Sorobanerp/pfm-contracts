from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ReceiptLineItemInput(_message.Message):
    __slots__ = ("item_sequence", "ean", "description", "quantity", "unit_of_measure", "unit_price", "total_price")
    ITEM_SEQUENCE_FIELD_NUMBER: _ClassVar[int]
    EAN_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    QUANTITY_FIELD_NUMBER: _ClassVar[int]
    UNIT_OF_MEASURE_FIELD_NUMBER: _ClassVar[int]
    UNIT_PRICE_FIELD_NUMBER: _ClassVar[int]
    TOTAL_PRICE_FIELD_NUMBER: _ClassVar[int]
    item_sequence: int
    ean: str
    description: str
    quantity: str
    unit_of_measure: str
    unit_price: str
    total_price: str
    def __init__(self, item_sequence: _Optional[int] = ..., ean: _Optional[str] = ..., description: _Optional[str] = ..., quantity: _Optional[str] = ..., unit_of_measure: _Optional[str] = ..., unit_price: _Optional[str] = ..., total_price: _Optional[str] = ...) -> None: ...

class ProcessReceiptRequest(_message.Message):
    __slots__ = ("tenant_id", "idempotency_key", "access_key", "merchant_tax_id", "merchant_name", "issued_at", "total_amount", "currency", "card_id", "items")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    ACCESS_KEY_FIELD_NUMBER: _ClassVar[int]
    MERCHANT_TAX_ID_FIELD_NUMBER: _ClassVar[int]
    MERCHANT_NAME_FIELD_NUMBER: _ClassVar[int]
    ISSUED_AT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    CARD_ID_FIELD_NUMBER: _ClassVar[int]
    ITEMS_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    idempotency_key: str
    access_key: str
    merchant_tax_id: str
    merchant_name: str
    issued_at: str
    total_amount: str
    currency: str
    card_id: str
    items: _containers.RepeatedCompositeFieldContainer[ReceiptLineItemInput]
    def __init__(self, tenant_id: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., access_key: _Optional[str] = ..., merchant_tax_id: _Optional[str] = ..., merchant_name: _Optional[str] = ..., issued_at: _Optional[str] = ..., total_amount: _Optional[str] = ..., currency: _Optional[str] = ..., card_id: _Optional[str] = ..., items: _Optional[_Iterable[_Union[ReceiptLineItemInput, _Mapping]]] = ...) -> None: ...

class EanInflationAlert(_message.Message):
    __slots__ = ("ean", "description", "previous_unit_price", "current_unit_price", "inflation_percentage", "previous_purchase_date", "previous_merchant_name")
    EAN_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    PREVIOUS_UNIT_PRICE_FIELD_NUMBER: _ClassVar[int]
    CURRENT_UNIT_PRICE_FIELD_NUMBER: _ClassVar[int]
    INFLATION_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    PREVIOUS_PURCHASE_DATE_FIELD_NUMBER: _ClassVar[int]
    PREVIOUS_MERCHANT_NAME_FIELD_NUMBER: _ClassVar[int]
    ean: str
    description: str
    previous_unit_price: str
    current_unit_price: str
    inflation_percentage: str
    previous_purchase_date: str
    previous_merchant_name: str
    def __init__(self, ean: _Optional[str] = ..., description: _Optional[str] = ..., previous_unit_price: _Optional[str] = ..., current_unit_price: _Optional[str] = ..., inflation_percentage: _Optional[str] = ..., previous_purchase_date: _Optional[str] = ..., previous_merchant_name: _Optional[str] = ...) -> None: ...

class ProcessReceiptResponse(_message.Message):
    __slots__ = ("receipt_id", "reconciliation_status", "matched_transaction_id", "journal_entry_id", "match_confidence", "has_inflation_alerts", "inflation_alerts")
    RECEIPT_ID_FIELD_NUMBER: _ClassVar[int]
    RECONCILIATION_STATUS_FIELD_NUMBER: _ClassVar[int]
    MATCHED_TRANSACTION_ID_FIELD_NUMBER: _ClassVar[int]
    JOURNAL_ENTRY_ID_FIELD_NUMBER: _ClassVar[int]
    MATCH_CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    HAS_INFLATION_ALERTS_FIELD_NUMBER: _ClassVar[int]
    INFLATION_ALERTS_FIELD_NUMBER: _ClassVar[int]
    receipt_id: str
    reconciliation_status: str
    matched_transaction_id: str
    journal_entry_id: str
    match_confidence: str
    has_inflation_alerts: bool
    inflation_alerts: _containers.RepeatedCompositeFieldContainer[EanInflationAlert]
    def __init__(self, receipt_id: _Optional[str] = ..., reconciliation_status: _Optional[str] = ..., matched_transaction_id: _Optional[str] = ..., journal_entry_id: _Optional[str] = ..., match_confidence: _Optional[str] = ..., has_inflation_alerts: _Optional[bool] = ..., inflation_alerts: _Optional[_Iterable[_Union[EanInflationAlert, _Mapping]]] = ...) -> None: ...

class GetTenantFinancialSummaryRequest(_message.Message):
    __slots__ = ("tenant_id", "reference_month", "currency")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    REFERENCE_MONTH_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    reference_month: str
    currency: str
    def __init__(self, tenant_id: _Optional[str] = ..., reference_month: _Optional[str] = ..., currency: _Optional[str] = ...) -> None: ...

class CreditCardMatrixEntry(_message.Message):
    __slots__ = ("card_id", "card_name", "card_last_four", "credit_limit", "available_limit", "current_invoice_amount", "next_month_invoice_amount", "future_committed_amount", "closing_day", "due_day")
    CARD_ID_FIELD_NUMBER: _ClassVar[int]
    CARD_NAME_FIELD_NUMBER: _ClassVar[int]
    CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    CREDIT_LIMIT_FIELD_NUMBER: _ClassVar[int]
    AVAILABLE_LIMIT_FIELD_NUMBER: _ClassVar[int]
    CURRENT_INVOICE_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    NEXT_MONTH_INVOICE_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    FUTURE_COMMITTED_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CLOSING_DAY_FIELD_NUMBER: _ClassVar[int]
    DUE_DAY_FIELD_NUMBER: _ClassVar[int]
    card_id: str
    card_name: str
    card_last_four: str
    credit_limit: str
    available_limit: str
    current_invoice_amount: str
    next_month_invoice_amount: str
    future_committed_amount: str
    closing_day: int
    due_day: int
    def __init__(self, card_id: _Optional[str] = ..., card_name: _Optional[str] = ..., card_last_four: _Optional[str] = ..., credit_limit: _Optional[str] = ..., available_limit: _Optional[str] = ..., current_invoice_amount: _Optional[str] = ..., next_month_invoice_amount: _Optional[str] = ..., future_committed_amount: _Optional[str] = ..., closing_day: _Optional[int] = ..., due_day: _Optional[int] = ...) -> None: ...

class FutureCommitmentBucket(_message.Message):
    __slots__ = ("competence_month", "cards_installments_amount", "contracts_amount", "total_committed_amount", "income_commitment_percentage")
    COMPETENCE_MONTH_FIELD_NUMBER: _ClassVar[int]
    CARDS_INSTALLMENTS_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CONTRACTS_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_COMMITTED_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    INCOME_COMMITMENT_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    competence_month: str
    cards_installments_amount: str
    contracts_amount: str
    total_committed_amount: str
    income_commitment_percentage: str
    def __init__(self, competence_month: _Optional[str] = ..., cards_installments_amount: _Optional[str] = ..., contracts_amount: _Optional[str] = ..., total_committed_amount: _Optional[str] = ..., income_commitment_percentage: _Optional[str] = ...) -> None: ...

class GetTenantFinancialSummaryResponse(_message.Message):
    __slots__ = ("tenant_id", "reference_month", "currency", "total_current_invoice", "total_next_month_invoice", "total_future_commitment", "current_income_commitment_pct", "card_matrix", "future_commitment_timeline")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    REFERENCE_MONTH_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    TOTAL_CURRENT_INVOICE_FIELD_NUMBER: _ClassVar[int]
    TOTAL_NEXT_MONTH_INVOICE_FIELD_NUMBER: _ClassVar[int]
    TOTAL_FUTURE_COMMITMENT_FIELD_NUMBER: _ClassVar[int]
    CURRENT_INCOME_COMMITMENT_PCT_FIELD_NUMBER: _ClassVar[int]
    CARD_MATRIX_FIELD_NUMBER: _ClassVar[int]
    FUTURE_COMMITMENT_TIMELINE_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    reference_month: str
    currency: str
    total_current_invoice: str
    total_next_month_invoice: str
    total_future_commitment: str
    current_income_commitment_pct: str
    card_matrix: _containers.RepeatedCompositeFieldContainer[CreditCardMatrixEntry]
    future_commitment_timeline: _containers.RepeatedCompositeFieldContainer[FutureCommitmentBucket]
    def __init__(self, tenant_id: _Optional[str] = ..., reference_month: _Optional[str] = ..., currency: _Optional[str] = ..., total_current_invoice: _Optional[str] = ..., total_next_month_invoice: _Optional[str] = ..., total_future_commitment: _Optional[str] = ..., current_income_commitment_pct: _Optional[str] = ..., card_matrix: _Optional[_Iterable[_Union[CreditCardMatrixEntry, _Mapping]]] = ..., future_commitment_timeline: _Optional[_Iterable[_Union[FutureCommitmentBucket, _Mapping]]] = ...) -> None: ...

from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class AmortizationSystem(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    AMORTIZATION_SYSTEM_UNSPECIFIED: _ClassVar[AmortizationSystem]
    AMORTIZATION_SYSTEM_SAC: _ClassVar[AmortizationSystem]
    AMORTIZATION_SYSTEM_PRICE: _ClassVar[AmortizationSystem]
    AMORTIZATION_SYSTEM_CONSORCIO: _ClassVar[AmortizationSystem]

class PrepaymentStrategy(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    PREPAYMENT_STRATEGY_UNSPECIFIED: _ClassVar[PrepaymentStrategy]
    PREPAYMENT_STRATEGY_REDUCE_TERM: _ClassVar[PrepaymentStrategy]
    PREPAYMENT_STRATEGY_REDUCE_INSTALLMENT: _ClassVar[PrepaymentStrategy]
AMORTIZATION_SYSTEM_UNSPECIFIED: AmortizationSystem
AMORTIZATION_SYSTEM_SAC: AmortizationSystem
AMORTIZATION_SYSTEM_PRICE: AmortizationSystem
AMORTIZATION_SYSTEM_CONSORCIO: AmortizationSystem
PREPAYMENT_STRATEGY_UNSPECIFIED: PrepaymentStrategy
PREPAYMENT_STRATEGY_REDUCE_TERM: PrepaymentStrategy
PREPAYMENT_STRATEGY_REDUCE_INSTALLMENT: PrepaymentStrategy

class SimulateContractRequest(_message.Message):
    __slots__ = ("tenant_id", "contract_id", "amortization_system", "prepayment_strategy", "outstanding_balance", "remaining_installments", "monthly_interest_rate", "consorcio_admin_fee_rate", "monthly_insurance_and_fees", "extra_amortization_amount", "currency")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    CONTRACT_ID_FIELD_NUMBER: _ClassVar[int]
    AMORTIZATION_SYSTEM_FIELD_NUMBER: _ClassVar[int]
    PREPAYMENT_STRATEGY_FIELD_NUMBER: _ClassVar[int]
    OUTSTANDING_BALANCE_FIELD_NUMBER: _ClassVar[int]
    REMAINING_INSTALLMENTS_FIELD_NUMBER: _ClassVar[int]
    MONTHLY_INTEREST_RATE_FIELD_NUMBER: _ClassVar[int]
    CONSORCIO_ADMIN_FEE_RATE_FIELD_NUMBER: _ClassVar[int]
    MONTHLY_INSURANCE_AND_FEES_FIELD_NUMBER: _ClassVar[int]
    EXTRA_AMORTIZATION_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    contract_id: str
    amortization_system: AmortizationSystem
    prepayment_strategy: PrepaymentStrategy
    outstanding_balance: str
    remaining_installments: int
    monthly_interest_rate: str
    consorcio_admin_fee_rate: str
    monthly_insurance_and_fees: str
    extra_amortization_amount: str
    currency: str
    def __init__(self, tenant_id: _Optional[str] = ..., contract_id: _Optional[str] = ..., amortization_system: _Optional[_Union[AmortizationSystem, str]] = ..., prepayment_strategy: _Optional[_Union[PrepaymentStrategy, str]] = ..., outstanding_balance: _Optional[str] = ..., remaining_installments: _Optional[int] = ..., monthly_interest_rate: _Optional[str] = ..., consorcio_admin_fee_rate: _Optional[str] = ..., monthly_insurance_and_fees: _Optional[str] = ..., extra_amortization_amount: _Optional[str] = ..., currency: _Optional[str] = ...) -> None: ...

class AmortizationScheduleInstallment(_message.Message):
    __slots__ = ("installment_number", "due_month", "principal_amount", "interest_amount", "fees_amount", "total_installment_amount", "remaining_balance")
    INSTALLMENT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    DUE_MONTH_FIELD_NUMBER: _ClassVar[int]
    PRINCIPAL_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    INTEREST_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    FEES_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_INSTALLMENT_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    REMAINING_BALANCE_FIELD_NUMBER: _ClassVar[int]
    installment_number: int
    due_month: str
    principal_amount: str
    interest_amount: str
    fees_amount: str
    total_installment_amount: str
    remaining_balance: str
    def __init__(self, installment_number: _Optional[int] = ..., due_month: _Optional[str] = ..., principal_amount: _Optional[str] = ..., interest_amount: _Optional[str] = ..., fees_amount: _Optional[str] = ..., total_installment_amount: _Optional[str] = ..., remaining_balance: _Optional[str] = ...) -> None: ...

class ScheduleSummaryMetrics(_message.Message):
    __slots__ = ("total_installments", "first_installment_amount", "last_installment_amount", "total_interest_paid", "total_fees_paid", "total_paid")
    TOTAL_INSTALLMENTS_FIELD_NUMBER: _ClassVar[int]
    FIRST_INSTALLMENT_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    LAST_INSTALLMENT_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_INTEREST_PAID_FIELD_NUMBER: _ClassVar[int]
    TOTAL_FEES_PAID_FIELD_NUMBER: _ClassVar[int]
    TOTAL_PAID_FIELD_NUMBER: _ClassVar[int]
    total_installments: int
    first_installment_amount: str
    last_installment_amount: str
    total_interest_paid: str
    total_fees_paid: str
    total_paid: str
    def __init__(self, total_installments: _Optional[int] = ..., first_installment_amount: _Optional[str] = ..., last_installment_amount: _Optional[str] = ..., total_interest_paid: _Optional[str] = ..., total_fees_paid: _Optional[str] = ..., total_paid: _Optional[str] = ...) -> None: ...

class SimulateContractResponse(_message.Message):
    __slots__ = ("tenant_id", "contract_id", "amortization_system", "prepayment_strategy", "original_summary", "simulated_summary", "installments_reduced", "monthly_installment_reduction", "interest_savings_amount", "effective_roi_percentage", "original_schedule", "simulated_schedule")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    CONTRACT_ID_FIELD_NUMBER: _ClassVar[int]
    AMORTIZATION_SYSTEM_FIELD_NUMBER: _ClassVar[int]
    PREPAYMENT_STRATEGY_FIELD_NUMBER: _ClassVar[int]
    ORIGINAL_SUMMARY_FIELD_NUMBER: _ClassVar[int]
    SIMULATED_SUMMARY_FIELD_NUMBER: _ClassVar[int]
    INSTALLMENTS_REDUCED_FIELD_NUMBER: _ClassVar[int]
    MONTHLY_INSTALLMENT_REDUCTION_FIELD_NUMBER: _ClassVar[int]
    INTEREST_SAVINGS_AMOUNT_FIELD_NUMBER: _ClassVar[int]
    EFFECTIVE_ROI_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    ORIGINAL_SCHEDULE_FIELD_NUMBER: _ClassVar[int]
    SIMULATED_SCHEDULE_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    contract_id: str
    amortization_system: AmortizationSystem
    prepayment_strategy: PrepaymentStrategy
    original_summary: ScheduleSummaryMetrics
    simulated_summary: ScheduleSummaryMetrics
    installments_reduced: int
    monthly_installment_reduction: str
    interest_savings_amount: str
    effective_roi_percentage: str
    original_schedule: _containers.RepeatedCompositeFieldContainer[AmortizationScheduleInstallment]
    simulated_schedule: _containers.RepeatedCompositeFieldContainer[AmortizationScheduleInstallment]
    def __init__(self, tenant_id: _Optional[str] = ..., contract_id: _Optional[str] = ..., amortization_system: _Optional[_Union[AmortizationSystem, str]] = ..., prepayment_strategy: _Optional[_Union[PrepaymentStrategy, str]] = ..., original_summary: _Optional[_Union[ScheduleSummaryMetrics, _Mapping]] = ..., simulated_summary: _Optional[_Union[ScheduleSummaryMetrics, _Mapping]] = ..., installments_reduced: _Optional[int] = ..., monthly_installment_reduction: _Optional[str] = ..., interest_savings_amount: _Optional[str] = ..., effective_roi_percentage: _Optional[str] = ..., original_schedule: _Optional[_Iterable[_Union[AmortizationScheduleInstallment, _Mapping]]] = ..., simulated_schedule: _Optional[_Iterable[_Union[AmortizationScheduleInstallment, _Mapping]]] = ...) -> None: ...

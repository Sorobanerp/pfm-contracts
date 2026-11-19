from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class SubscriptionPlan(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    SUBSCRIPTION_PLAN_UNSPECIFIED: _ClassVar[SubscriptionPlan]
    SUBSCRIPTION_PLAN_FREE: _ClassVar[SubscriptionPlan]
    SUBSCRIPTION_PLAN_INDIVIDUAL_PRO: _ClassVar[SubscriptionPlan]
    SUBSCRIPTION_PLAN_FAMILY_PLUS: _ClassVar[SubscriptionPlan]

class SubscriptionStatus(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    SUBSCRIPTION_STATUS_UNSPECIFIED: _ClassVar[SubscriptionStatus]
    SUBSCRIPTION_STATUS_TRIAL: _ClassVar[SubscriptionStatus]
    SUBSCRIPTION_STATUS_ACTIVE: _ClassVar[SubscriptionStatus]
    SUBSCRIPTION_STATUS_PAST_DUE: _ClassVar[SubscriptionStatus]
    SUBSCRIPTION_STATUS_SUSPENDED: _ClassVar[SubscriptionStatus]
SUBSCRIPTION_PLAN_UNSPECIFIED: SubscriptionPlan
SUBSCRIPTION_PLAN_FREE: SubscriptionPlan
SUBSCRIPTION_PLAN_INDIVIDUAL_PRO: SubscriptionPlan
SUBSCRIPTION_PLAN_FAMILY_PLUS: SubscriptionPlan
SUBSCRIPTION_STATUS_UNSPECIFIED: SubscriptionStatus
SUBSCRIPTION_STATUS_TRIAL: SubscriptionStatus
SUBSCRIPTION_STATUS_ACTIVE: SubscriptionStatus
SUBSCRIPTION_STATUS_PAST_DUE: SubscriptionStatus
SUBSCRIPTION_STATUS_SUSPENDED: SubscriptionStatus

class TenantSummary(_message.Message):
    __slots__ = ("tenant_id", "name", "plan", "status", "max_members", "max_cards", "monthly_pdf_quota", "used_pdf_quota", "created_at", "updated_at")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    PLAN_FIELD_NUMBER: _ClassVar[int]
    STATUS_FIELD_NUMBER: _ClassVar[int]
    MAX_MEMBERS_FIELD_NUMBER: _ClassVar[int]
    MAX_CARDS_FIELD_NUMBER: _ClassVar[int]
    MONTHLY_PDF_QUOTA_FIELD_NUMBER: _ClassVar[int]
    USED_PDF_QUOTA_FIELD_NUMBER: _ClassVar[int]
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    UPDATED_AT_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    name: str
    plan: SubscriptionPlan
    status: SubscriptionStatus
    max_members: int
    max_cards: int
    monthly_pdf_quota: int
    used_pdf_quota: int
    created_at: str
    updated_at: str
    def __init__(self, tenant_id: _Optional[str] = ..., name: _Optional[str] = ..., plan: _Optional[_Union[SubscriptionPlan, str]] = ..., status: _Optional[_Union[SubscriptionStatus, str]] = ..., max_members: _Optional[int] = ..., max_cards: _Optional[int] = ..., monthly_pdf_quota: _Optional[int] = ..., used_pdf_quota: _Optional[int] = ..., created_at: _Optional[str] = ..., updated_at: _Optional[str] = ...) -> None: ...

class ListTenantsRequest(_message.Message):
    __slots__ = ("page_size", "page_token", "status_filter", "plan_filter")
    PAGE_SIZE_FIELD_NUMBER: _ClassVar[int]
    PAGE_TOKEN_FIELD_NUMBER: _ClassVar[int]
    STATUS_FILTER_FIELD_NUMBER: _ClassVar[int]
    PLAN_FILTER_FIELD_NUMBER: _ClassVar[int]
    page_size: int
    page_token: str
    status_filter: SubscriptionStatus
    plan_filter: SubscriptionPlan
    def __init__(self, page_size: _Optional[int] = ..., page_token: _Optional[str] = ..., status_filter: _Optional[_Union[SubscriptionStatus, str]] = ..., plan_filter: _Optional[_Union[SubscriptionPlan, str]] = ...) -> None: ...

class ListTenantsResponse(_message.Message):
    __slots__ = ("tenants", "next_page_token", "total_count")
    TENANTS_FIELD_NUMBER: _ClassVar[int]
    NEXT_PAGE_TOKEN_FIELD_NUMBER: _ClassVar[int]
    TOTAL_COUNT_FIELD_NUMBER: _ClassVar[int]
    tenants: _containers.RepeatedCompositeFieldContainer[TenantSummary]
    next_page_token: str
    total_count: int
    def __init__(self, tenants: _Optional[_Iterable[_Union[TenantSummary, _Mapping]]] = ..., next_page_token: _Optional[str] = ..., total_count: _Optional[int] = ...) -> None: ...

class ChangeTenantPlanRequest(_message.Message):
    __slots__ = ("tenant_id", "new_plan")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    NEW_PLAN_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    new_plan: SubscriptionPlan
    def __init__(self, tenant_id: _Optional[str] = ..., new_plan: _Optional[_Union[SubscriptionPlan, str]] = ...) -> None: ...

class ChangeTenantPlanResponse(_message.Message):
    __slots__ = ("tenant_id", "plan", "max_members", "max_cards", "monthly_pdf_quota", "updated_at")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    PLAN_FIELD_NUMBER: _ClassVar[int]
    MAX_MEMBERS_FIELD_NUMBER: _ClassVar[int]
    MAX_CARDS_FIELD_NUMBER: _ClassVar[int]
    MONTHLY_PDF_QUOTA_FIELD_NUMBER: _ClassVar[int]
    UPDATED_AT_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    plan: SubscriptionPlan
    max_members: int
    max_cards: int
    monthly_pdf_quota: int
    updated_at: str
    def __init__(self, tenant_id: _Optional[str] = ..., plan: _Optional[_Union[SubscriptionPlan, str]] = ..., max_members: _Optional[int] = ..., max_cards: _Optional[int] = ..., monthly_pdf_quota: _Optional[int] = ..., updated_at: _Optional[str] = ...) -> None: ...

class UpdateSubscriptionStatusRequest(_message.Message):
    __slots__ = ("tenant_id", "new_status", "reason")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    NEW_STATUS_FIELD_NUMBER: _ClassVar[int]
    REASON_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    new_status: SubscriptionStatus
    reason: str
    def __init__(self, tenant_id: _Optional[str] = ..., new_status: _Optional[_Union[SubscriptionStatus, str]] = ..., reason: _Optional[str] = ...) -> None: ...

class UpdateSubscriptionStatusResponse(_message.Message):
    __slots__ = ("tenant_id", "status", "updated_at")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    STATUS_FIELD_NUMBER: _ClassVar[int]
    UPDATED_AT_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    status: SubscriptionStatus
    updated_at: str
    def __init__(self, tenant_id: _Optional[str] = ..., status: _Optional[_Union[SubscriptionStatus, str]] = ..., updated_at: _Optional[str] = ...) -> None: ...

class GetPlatformMetricsRequest(_message.Message):
    __slots__ = ("period",)
    PERIOD_FIELD_NUMBER: _ClassVar[int]
    period: str
    def __init__(self, period: _Optional[str] = ...) -> None: ...

class GetPlatformMetricsResponse(_message.Message):
    __slots__ = ("total_tenants", "active_tenants", "trial_tenants", "past_due_tenants", "suspended_tenants", "total_transactions_processed", "total_ai_tokens_consumed", "total_pdf_statements_imported", "generated_at")
    TOTAL_TENANTS_FIELD_NUMBER: _ClassVar[int]
    ACTIVE_TENANTS_FIELD_NUMBER: _ClassVar[int]
    TRIAL_TENANTS_FIELD_NUMBER: _ClassVar[int]
    PAST_DUE_TENANTS_FIELD_NUMBER: _ClassVar[int]
    SUSPENDED_TENANTS_FIELD_NUMBER: _ClassVar[int]
    TOTAL_TRANSACTIONS_PROCESSED_FIELD_NUMBER: _ClassVar[int]
    TOTAL_AI_TOKENS_CONSUMED_FIELD_NUMBER: _ClassVar[int]
    TOTAL_PDF_STATEMENTS_IMPORTED_FIELD_NUMBER: _ClassVar[int]
    GENERATED_AT_FIELD_NUMBER: _ClassVar[int]
    total_tenants: int
    active_tenants: int
    trial_tenants: int
    past_due_tenants: int
    suspended_tenants: int
    total_transactions_processed: int
    total_ai_tokens_consumed: int
    total_pdf_statements_imported: int
    generated_at: str
    def __init__(self, total_tenants: _Optional[int] = ..., active_tenants: _Optional[int] = ..., trial_tenants: _Optional[int] = ..., past_due_tenants: _Optional[int] = ..., suspended_tenants: _Optional[int] = ..., total_transactions_processed: _Optional[int] = ..., total_ai_tokens_consumed: _Optional[int] = ..., total_pdf_statements_imported: _Optional[int] = ..., generated_at: _Optional[str] = ...) -> None: ...

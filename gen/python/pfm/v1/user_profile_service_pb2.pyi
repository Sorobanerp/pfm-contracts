from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class FamilyRole(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    FAMILY_ROLE_UNSPECIFIED: _ClassVar[FamilyRole]
    FAMILY_ROLE_OWNER: _ClassVar[FamilyRole]
    FAMILY_ROLE_MEMBER: _ClassVar[FamilyRole]
    FAMILY_ROLE_VIEWER: _ClassVar[FamilyRole]
FAMILY_ROLE_UNSPECIFIED: FamilyRole
FAMILY_ROLE_OWNER: FamilyRole
FAMILY_ROLE_MEMBER: FamilyRole
FAMILY_ROLE_VIEWER: FamilyRole

class UserProfile(_message.Message):
    __slots__ = ("user_id", "tenant_id", "full_name", "email", "role", "spending_allowance", "created_at", "updated_at")
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    FULL_NAME_FIELD_NUMBER: _ClassVar[int]
    EMAIL_FIELD_NUMBER: _ClassVar[int]
    ROLE_FIELD_NUMBER: _ClassVar[int]
    SPENDING_ALLOWANCE_FIELD_NUMBER: _ClassVar[int]
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    UPDATED_AT_FIELD_NUMBER: _ClassVar[int]
    user_id: str
    tenant_id: str
    full_name: str
    email: str
    role: FamilyRole
    spending_allowance: str
    created_at: str
    updated_at: str
    def __init__(self, user_id: _Optional[str] = ..., tenant_id: _Optional[str] = ..., full_name: _Optional[str] = ..., email: _Optional[str] = ..., role: _Optional[_Union[FamilyRole, str]] = ..., spending_allowance: _Optional[str] = ..., created_at: _Optional[str] = ..., updated_at: _Optional[str] = ...) -> None: ...

class GetUserProfileRequest(_message.Message):
    __slots__ = ("tenant_id", "user_id")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    user_id: str
    def __init__(self, tenant_id: _Optional[str] = ..., user_id: _Optional[str] = ...) -> None: ...

class GetUserProfileResponse(_message.Message):
    __slots__ = ("profile",)
    PROFILE_FIELD_NUMBER: _ClassVar[int]
    profile: UserProfile
    def __init__(self, profile: _Optional[_Union[UserProfile, _Mapping]] = ...) -> None: ...

class UpdateUserProfileRequest(_message.Message):
    __slots__ = ("tenant_id", "user_id", "full_name")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    FULL_NAME_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    user_id: str
    full_name: str
    def __init__(self, tenant_id: _Optional[str] = ..., user_id: _Optional[str] = ..., full_name: _Optional[str] = ...) -> None: ...

class UpdateUserProfileResponse(_message.Message):
    __slots__ = ("profile",)
    PROFILE_FIELD_NUMBER: _ClassVar[int]
    profile: UserProfile
    def __init__(self, profile: _Optional[_Union[UserProfile, _Mapping]] = ...) -> None: ...

class FamilyMember(_message.Message):
    __slots__ = ("member_id", "tenant_id", "email", "full_name", "role", "spending_allowance", "status", "invited_at", "joined_at")
    MEMBER_ID_FIELD_NUMBER: _ClassVar[int]
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    EMAIL_FIELD_NUMBER: _ClassVar[int]
    FULL_NAME_FIELD_NUMBER: _ClassVar[int]
    ROLE_FIELD_NUMBER: _ClassVar[int]
    SPENDING_ALLOWANCE_FIELD_NUMBER: _ClassVar[int]
    STATUS_FIELD_NUMBER: _ClassVar[int]
    INVITED_AT_FIELD_NUMBER: _ClassVar[int]
    JOINED_AT_FIELD_NUMBER: _ClassVar[int]
    member_id: str
    tenant_id: str
    email: str
    full_name: str
    role: FamilyRole
    spending_allowance: str
    status: str
    invited_at: str
    joined_at: str
    def __init__(self, member_id: _Optional[str] = ..., tenant_id: _Optional[str] = ..., email: _Optional[str] = ..., full_name: _Optional[str] = ..., role: _Optional[_Union[FamilyRole, str]] = ..., spending_allowance: _Optional[str] = ..., status: _Optional[str] = ..., invited_at: _Optional[str] = ..., joined_at: _Optional[str] = ...) -> None: ...

class ListFamilyMembersRequest(_message.Message):
    __slots__ = ("tenant_id",)
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    def __init__(self, tenant_id: _Optional[str] = ...) -> None: ...

class ListFamilyMembersResponse(_message.Message):
    __slots__ = ("members",)
    MEMBERS_FIELD_NUMBER: _ClassVar[int]
    members: _containers.RepeatedCompositeFieldContainer[FamilyMember]
    def __init__(self, members: _Optional[_Iterable[_Union[FamilyMember, _Mapping]]] = ...) -> None: ...

class InviteFamilyMemberRequest(_message.Message):
    __slots__ = ("tenant_id", "email", "full_name", "role", "spending_allowance")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    EMAIL_FIELD_NUMBER: _ClassVar[int]
    FULL_NAME_FIELD_NUMBER: _ClassVar[int]
    ROLE_FIELD_NUMBER: _ClassVar[int]
    SPENDING_ALLOWANCE_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    email: str
    full_name: str
    role: FamilyRole
    spending_allowance: str
    def __init__(self, tenant_id: _Optional[str] = ..., email: _Optional[str] = ..., full_name: _Optional[str] = ..., role: _Optional[_Union[FamilyRole, str]] = ..., spending_allowance: _Optional[str] = ...) -> None: ...

class InviteFamilyMemberResponse(_message.Message):
    __slots__ = ("member", "invitation_token", "expires_at")
    MEMBER_FIELD_NUMBER: _ClassVar[int]
    INVITATION_TOKEN_FIELD_NUMBER: _ClassVar[int]
    EXPIRES_AT_FIELD_NUMBER: _ClassVar[int]
    member: FamilyMember
    invitation_token: str
    expires_at: str
    def __init__(self, member: _Optional[_Union[FamilyMember, _Mapping]] = ..., invitation_token: _Optional[str] = ..., expires_at: _Optional[str] = ...) -> None: ...

class RemoveFamilyMemberRequest(_message.Message):
    __slots__ = ("tenant_id", "member_id")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    MEMBER_ID_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    member_id: str
    def __init__(self, tenant_id: _Optional[str] = ..., member_id: _Optional[str] = ...) -> None: ...

class RemoveFamilyMemberResponse(_message.Message):
    __slots__ = ("tenant_id", "member_id", "removed")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    MEMBER_ID_FIELD_NUMBER: _ClassVar[int]
    REMOVED_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    member_id: str
    removed: bool
    def __init__(self, tenant_id: _Optional[str] = ..., member_id: _Optional[str] = ..., removed: _Optional[bool] = ...) -> None: ...

class CategoryBudget(_message.Message):
    __slots__ = ("category_id", "category_name", "monthly_cap", "alert_threshold_percentage")
    CATEGORY_ID_FIELD_NUMBER: _ClassVar[int]
    CATEGORY_NAME_FIELD_NUMBER: _ClassVar[int]
    MONTHLY_CAP_FIELD_NUMBER: _ClassVar[int]
    ALERT_THRESHOLD_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    category_id: str
    category_name: str
    monthly_cap: str
    alert_threshold_percentage: int
    def __init__(self, category_id: _Optional[str] = ..., category_name: _Optional[str] = ..., monthly_cap: _Optional[str] = ..., alert_threshold_percentage: _Optional[int] = ...) -> None: ...

class GetCategoryBudgetsRequest(_message.Message):
    __slots__ = ("tenant_id",)
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    def __init__(self, tenant_id: _Optional[str] = ...) -> None: ...

class GetCategoryBudgetsResponse(_message.Message):
    __slots__ = ("budgets",)
    BUDGETS_FIELD_NUMBER: _ClassVar[int]
    budgets: _containers.RepeatedCompositeFieldContainer[CategoryBudget]
    def __init__(self, budgets: _Optional[_Iterable[_Union[CategoryBudget, _Mapping]]] = ...) -> None: ...

class SetCategoryBudgetRequest(_message.Message):
    __slots__ = ("tenant_id", "category_id", "category_name", "monthly_cap", "alert_threshold_percentage")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    CATEGORY_ID_FIELD_NUMBER: _ClassVar[int]
    CATEGORY_NAME_FIELD_NUMBER: _ClassVar[int]
    MONTHLY_CAP_FIELD_NUMBER: _ClassVar[int]
    ALERT_THRESHOLD_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    category_id: str
    category_name: str
    monthly_cap: str
    alert_threshold_percentage: int
    def __init__(self, tenant_id: _Optional[str] = ..., category_id: _Optional[str] = ..., category_name: _Optional[str] = ..., monthly_cap: _Optional[str] = ..., alert_threshold_percentage: _Optional[int] = ...) -> None: ...

class SetCategoryBudgetResponse(_message.Message):
    __slots__ = ("budget",)
    BUDGET_FIELD_NUMBER: _ClassVar[int]
    budget: CategoryBudget
    def __init__(self, budget: _Optional[_Union[CategoryBudget, _Mapping]] = ...) -> None: ...

class SetCardPdfPasswordRequest(_message.Message):
    __slots__ = ("tenant_id", "card_id", "password")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    CARD_ID_FIELD_NUMBER: _ClassVar[int]
    PASSWORD_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    card_id: str
    password: str
    def __init__(self, tenant_id: _Optional[str] = ..., card_id: _Optional[str] = ..., password: _Optional[str] = ...) -> None: ...

class SetCardPdfPasswordResponse(_message.Message):
    __slots__ = ("tenant_id", "card_id", "stored", "key_id")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    CARD_ID_FIELD_NUMBER: _ClassVar[int]
    STORED_FIELD_NUMBER: _ClassVar[int]
    KEY_ID_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    card_id: str
    stored: bool
    key_id: str
    def __init__(self, tenant_id: _Optional[str] = ..., card_id: _Optional[str] = ..., stored: _Optional[bool] = ..., key_id: _Optional[str] = ...) -> None: ...

class ExportUserDataRequest(_message.Message):
    __slots__ = ("tenant_id", "user_id", "format")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    FORMAT_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    user_id: str
    format: str
    def __init__(self, tenant_id: _Optional[str] = ..., user_id: _Optional[str] = ..., format: _Optional[str] = ...) -> None: ...

class ExportUserDataResponse(_message.Message):
    __slots__ = ("tenant_id", "export_id", "download_url", "expires_at", "checksum_sha256")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    EXPORT_ID_FIELD_NUMBER: _ClassVar[int]
    DOWNLOAD_URL_FIELD_NUMBER: _ClassVar[int]
    EXPIRES_AT_FIELD_NUMBER: _ClassVar[int]
    CHECKSUM_SHA256_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    export_id: str
    download_url: str
    expires_at: str
    checksum_sha256: str
    def __init__(self, tenant_id: _Optional[str] = ..., export_id: _Optional[str] = ..., download_url: _Optional[str] = ..., expires_at: _Optional[str] = ..., checksum_sha256: _Optional[str] = ...) -> None: ...

class RequestCryptoShreddingRequest(_message.Message):
    __slots__ = ("tenant_id", "user_id", "confirmation_phrase", "mfa_token")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    USER_ID_FIELD_NUMBER: _ClassVar[int]
    CONFIRMATION_PHRASE_FIELD_NUMBER: _ClassVar[int]
    MFA_TOKEN_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    user_id: str
    confirmation_phrase: str
    mfa_token: str
    def __init__(self, tenant_id: _Optional[str] = ..., user_id: _Optional[str] = ..., confirmation_phrase: _Optional[str] = ..., mfa_token: _Optional[str] = ...) -> None: ...

class RequestCryptoShreddingResponse(_message.Message):
    __slots__ = ("tenant_id", "request_id", "status", "destroyed_key_id", "shredded_at")
    TENANT_ID_FIELD_NUMBER: _ClassVar[int]
    REQUEST_ID_FIELD_NUMBER: _ClassVar[int]
    STATUS_FIELD_NUMBER: _ClassVar[int]
    DESTROYED_KEY_ID_FIELD_NUMBER: _ClassVar[int]
    SHREDDED_AT_FIELD_NUMBER: _ClassVar[int]
    tenant_id: str
    request_id: str
    status: str
    destroyed_key_id: str
    shredded_at: str
    def __init__(self, tenant_id: _Optional[str] = ..., request_id: _Optional[str] = ..., status: _Optional[str] = ..., destroyed_key_id: _Optional[str] = ..., shredded_at: _Optional[str] = ...) -> None: ...

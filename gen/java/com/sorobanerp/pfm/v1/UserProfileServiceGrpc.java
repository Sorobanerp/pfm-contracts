package com.sorobanerp.pfm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UserProfileServiceGrpc {

  private UserProfileServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pfm.v1.UserProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetUserProfileRequest,
      com.sorobanerp.pfm.v1.GetUserProfileResponse> getGetUserProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserProfile",
      requestType = com.sorobanerp.pfm.v1.GetUserProfileRequest.class,
      responseType = com.sorobanerp.pfm.v1.GetUserProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetUserProfileRequest,
      com.sorobanerp.pfm.v1.GetUserProfileResponse> getGetUserProfileMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetUserProfileRequest, com.sorobanerp.pfm.v1.GetUserProfileResponse> getGetUserProfileMethod;
    if ((getGetUserProfileMethod = UserProfileServiceGrpc.getGetUserProfileMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getGetUserProfileMethod = UserProfileServiceGrpc.getGetUserProfileMethod) == null) {
          UserProfileServiceGrpc.getGetUserProfileMethod = getGetUserProfileMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.GetUserProfileRequest, com.sorobanerp.pfm.v1.GetUserProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetUserProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetUserProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("GetUserProfile"))
              .build();
        }
      }
    }
    return getGetUserProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.UpdateUserProfileRequest,
      com.sorobanerp.pfm.v1.UpdateUserProfileResponse> getUpdateUserProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserProfile",
      requestType = com.sorobanerp.pfm.v1.UpdateUserProfileRequest.class,
      responseType = com.sorobanerp.pfm.v1.UpdateUserProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.UpdateUserProfileRequest,
      com.sorobanerp.pfm.v1.UpdateUserProfileResponse> getUpdateUserProfileMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.UpdateUserProfileRequest, com.sorobanerp.pfm.v1.UpdateUserProfileResponse> getUpdateUserProfileMethod;
    if ((getUpdateUserProfileMethod = UserProfileServiceGrpc.getUpdateUserProfileMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getUpdateUserProfileMethod = UserProfileServiceGrpc.getUpdateUserProfileMethod) == null) {
          UserProfileServiceGrpc.getUpdateUserProfileMethod = getUpdateUserProfileMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.UpdateUserProfileRequest, com.sorobanerp.pfm.v1.UpdateUserProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.UpdateUserProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.UpdateUserProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("UpdateUserProfile"))
              .build();
        }
      }
    }
    return getUpdateUserProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ListFamilyMembersRequest,
      com.sorobanerp.pfm.v1.ListFamilyMembersResponse> getListFamilyMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFamilyMembers",
      requestType = com.sorobanerp.pfm.v1.ListFamilyMembersRequest.class,
      responseType = com.sorobanerp.pfm.v1.ListFamilyMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ListFamilyMembersRequest,
      com.sorobanerp.pfm.v1.ListFamilyMembersResponse> getListFamilyMembersMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ListFamilyMembersRequest, com.sorobanerp.pfm.v1.ListFamilyMembersResponse> getListFamilyMembersMethod;
    if ((getListFamilyMembersMethod = UserProfileServiceGrpc.getListFamilyMembersMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getListFamilyMembersMethod = UserProfileServiceGrpc.getListFamilyMembersMethod) == null) {
          UserProfileServiceGrpc.getListFamilyMembersMethod = getListFamilyMembersMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.ListFamilyMembersRequest, com.sorobanerp.pfm.v1.ListFamilyMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFamilyMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ListFamilyMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ListFamilyMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("ListFamilyMembers"))
              .build();
        }
      }
    }
    return getListFamilyMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.InviteFamilyMemberRequest,
      com.sorobanerp.pfm.v1.InviteFamilyMemberResponse> getInviteFamilyMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InviteFamilyMember",
      requestType = com.sorobanerp.pfm.v1.InviteFamilyMemberRequest.class,
      responseType = com.sorobanerp.pfm.v1.InviteFamilyMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.InviteFamilyMemberRequest,
      com.sorobanerp.pfm.v1.InviteFamilyMemberResponse> getInviteFamilyMemberMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.InviteFamilyMemberRequest, com.sorobanerp.pfm.v1.InviteFamilyMemberResponse> getInviteFamilyMemberMethod;
    if ((getInviteFamilyMemberMethod = UserProfileServiceGrpc.getInviteFamilyMemberMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getInviteFamilyMemberMethod = UserProfileServiceGrpc.getInviteFamilyMemberMethod) == null) {
          UserProfileServiceGrpc.getInviteFamilyMemberMethod = getInviteFamilyMemberMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.InviteFamilyMemberRequest, com.sorobanerp.pfm.v1.InviteFamilyMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InviteFamilyMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.InviteFamilyMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.InviteFamilyMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("InviteFamilyMember"))
              .build();
        }
      }
    }
    return getInviteFamilyMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest,
      com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse> getRemoveFamilyMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFamilyMember",
      requestType = com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest.class,
      responseType = com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest,
      com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse> getRemoveFamilyMemberMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest, com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse> getRemoveFamilyMemberMethod;
    if ((getRemoveFamilyMemberMethod = UserProfileServiceGrpc.getRemoveFamilyMemberMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getRemoveFamilyMemberMethod = UserProfileServiceGrpc.getRemoveFamilyMemberMethod) == null) {
          UserProfileServiceGrpc.getRemoveFamilyMemberMethod = getRemoveFamilyMemberMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest, com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFamilyMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("RemoveFamilyMember"))
              .build();
        }
      }
    }
    return getRemoveFamilyMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest,
      com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse> getGetCategoryBudgetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCategoryBudgets",
      requestType = com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest.class,
      responseType = com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest,
      com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse> getGetCategoryBudgetsMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest, com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse> getGetCategoryBudgetsMethod;
    if ((getGetCategoryBudgetsMethod = UserProfileServiceGrpc.getGetCategoryBudgetsMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getGetCategoryBudgetsMethod = UserProfileServiceGrpc.getGetCategoryBudgetsMethod) == null) {
          UserProfileServiceGrpc.getGetCategoryBudgetsMethod = getGetCategoryBudgetsMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest, com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCategoryBudgets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("GetCategoryBudgets"))
              .build();
        }
      }
    }
    return getGetCategoryBudgetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SetCategoryBudgetRequest,
      com.sorobanerp.pfm.v1.SetCategoryBudgetResponse> getSetCategoryBudgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCategoryBudget",
      requestType = com.sorobanerp.pfm.v1.SetCategoryBudgetRequest.class,
      responseType = com.sorobanerp.pfm.v1.SetCategoryBudgetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SetCategoryBudgetRequest,
      com.sorobanerp.pfm.v1.SetCategoryBudgetResponse> getSetCategoryBudgetMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SetCategoryBudgetRequest, com.sorobanerp.pfm.v1.SetCategoryBudgetResponse> getSetCategoryBudgetMethod;
    if ((getSetCategoryBudgetMethod = UserProfileServiceGrpc.getSetCategoryBudgetMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getSetCategoryBudgetMethod = UserProfileServiceGrpc.getSetCategoryBudgetMethod) == null) {
          UserProfileServiceGrpc.getSetCategoryBudgetMethod = getSetCategoryBudgetMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.SetCategoryBudgetRequest, com.sorobanerp.pfm.v1.SetCategoryBudgetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCategoryBudget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.SetCategoryBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.SetCategoryBudgetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("SetCategoryBudget"))
              .build();
        }
      }
    }
    return getSetCategoryBudgetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest,
      com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse> getSetCardPdfPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCardPdfPassword",
      requestType = com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest.class,
      responseType = com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest,
      com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse> getSetCardPdfPasswordMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest, com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse> getSetCardPdfPasswordMethod;
    if ((getSetCardPdfPasswordMethod = UserProfileServiceGrpc.getSetCardPdfPasswordMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getSetCardPdfPasswordMethod = UserProfileServiceGrpc.getSetCardPdfPasswordMethod) == null) {
          UserProfileServiceGrpc.getSetCardPdfPasswordMethod = getSetCardPdfPasswordMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest, com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCardPdfPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("SetCardPdfPassword"))
              .build();
        }
      }
    }
    return getSetCardPdfPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ExportUserDataRequest,
      com.sorobanerp.pfm.v1.ExportUserDataResponse> getExportUserDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportUserData",
      requestType = com.sorobanerp.pfm.v1.ExportUserDataRequest.class,
      responseType = com.sorobanerp.pfm.v1.ExportUserDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ExportUserDataRequest,
      com.sorobanerp.pfm.v1.ExportUserDataResponse> getExportUserDataMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ExportUserDataRequest, com.sorobanerp.pfm.v1.ExportUserDataResponse> getExportUserDataMethod;
    if ((getExportUserDataMethod = UserProfileServiceGrpc.getExportUserDataMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getExportUserDataMethod = UserProfileServiceGrpc.getExportUserDataMethod) == null) {
          UserProfileServiceGrpc.getExportUserDataMethod = getExportUserDataMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.ExportUserDataRequest, com.sorobanerp.pfm.v1.ExportUserDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportUserData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ExportUserDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ExportUserDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("ExportUserData"))
              .build();
        }
      }
    }
    return getExportUserDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest,
      com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse> getRequestCryptoShreddingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestCryptoShredding",
      requestType = com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest.class,
      responseType = com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest,
      com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse> getRequestCryptoShreddingMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest, com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse> getRequestCryptoShreddingMethod;
    if ((getRequestCryptoShreddingMethod = UserProfileServiceGrpc.getRequestCryptoShreddingMethod) == null) {
      synchronized (UserProfileServiceGrpc.class) {
        if ((getRequestCryptoShreddingMethod = UserProfileServiceGrpc.getRequestCryptoShreddingMethod) == null) {
          UserProfileServiceGrpc.getRequestCryptoShreddingMethod = getRequestCryptoShreddingMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest, com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestCryptoShredding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileServiceMethodDescriptorSupplier("RequestCryptoShredding"))
              .build();
        }
      }
    }
    return getRequestCryptoShreddingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserProfileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceStub>() {
        @java.lang.Override
        public UserProfileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileServiceStub(channel, callOptions);
        }
      };
    return UserProfileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserProfileServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceBlockingV2Stub>() {
        @java.lang.Override
        public UserProfileServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UserProfileServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceBlockingStub>() {
        @java.lang.Override
        public UserProfileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileServiceBlockingStub(channel, callOptions);
        }
      };
    return UserProfileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileServiceFutureStub>() {
        @java.lang.Override
        public UserProfileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileServiceFutureStub(channel, callOptions);
        }
      };
    return UserProfileServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Retrieves user profile within the tenant.
     * </pre>
     */
    default void getUserProfile(com.sorobanerp.pfm.v1.GetUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetUserProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates user profile information.
     * </pre>
     */
    default void updateUserProfile(com.sorobanerp.pfm.v1.UpdateUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.UpdateUserProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all members within a tenant's family account.
     * </pre>
     */
    default void listFamilyMembers(com.sorobanerp.pfm.v1.ListFamilyMembersRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ListFamilyMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFamilyMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invites a new family member with a specified role (OWNER, MEMBER, VIEWER).
     * </pre>
     */
    default void inviteFamilyMember(com.sorobanerp.pfm.v1.InviteFamilyMemberRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.InviteFamilyMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInviteFamilyMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a member from the tenant's family account.
     * </pre>
     */
    default void removeFamilyMember(com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFamilyMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves category budget caps and alert thresholds.
     * </pre>
     */
    default void getCategoryBudgets(com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoryBudgetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets or updates a category budget cap.
     * </pre>
     */
    default void setCategoryBudget(com.sorobanerp.pfm.v1.SetCategoryBudgetRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SetCategoryBudgetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCategoryBudgetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stores an encrypted PDF statement password for automated unlocking via KMS.
     * </pre>
     */
    default void setCardPdfPassword(com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCardPdfPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a complete data export under LGPD.
     * </pre>
     */
    default void exportUserData(com.sorobanerp.pfm.v1.ExportUserDataRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ExportUserDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportUserDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Executes cryptographic deletion (Crypto-Shredding) of tenant's KMS DEK.
     * </pre>
     */
    default void requestCryptoShredding(com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestCryptoShreddingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserProfileService.
   */
  public static abstract class UserProfileServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserProfileServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserProfileService.
   */
  public static final class UserProfileServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserProfileServiceStub> {
    private UserProfileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves user profile within the tenant.
     * </pre>
     */
    public void getUserProfile(com.sorobanerp.pfm.v1.GetUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetUserProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates user profile information.
     * </pre>
     */
    public void updateUserProfile(com.sorobanerp.pfm.v1.UpdateUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.UpdateUserProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all members within a tenant's family account.
     * </pre>
     */
    public void listFamilyMembers(com.sorobanerp.pfm.v1.ListFamilyMembersRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ListFamilyMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFamilyMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invites a new family member with a specified role (OWNER, MEMBER, VIEWER).
     * </pre>
     */
    public void inviteFamilyMember(com.sorobanerp.pfm.v1.InviteFamilyMemberRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.InviteFamilyMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInviteFamilyMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a member from the tenant's family account.
     * </pre>
     */
    public void removeFamilyMember(com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFamilyMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves category budget caps and alert thresholds.
     * </pre>
     */
    public void getCategoryBudgets(com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCategoryBudgetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets or updates a category budget cap.
     * </pre>
     */
    public void setCategoryBudget(com.sorobanerp.pfm.v1.SetCategoryBudgetRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SetCategoryBudgetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCategoryBudgetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stores an encrypted PDF statement password for automated unlocking via KMS.
     * </pre>
     */
    public void setCardPdfPassword(com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCardPdfPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a complete data export under LGPD.
     * </pre>
     */
    public void exportUserData(com.sorobanerp.pfm.v1.ExportUserDataRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ExportUserDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportUserDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Executes cryptographic deletion (Crypto-Shredding) of tenant's KMS DEK.
     * </pre>
     */
    public void requestCryptoShredding(com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestCryptoShreddingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserProfileService.
   */
  public static final class UserProfileServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserProfileServiceBlockingV2Stub> {
    private UserProfileServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves user profile within the tenant.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetUserProfileResponse getUserProfile(com.sorobanerp.pfm.v1.GetUserProfileRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates user profile information.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.UpdateUserProfileResponse updateUserProfile(com.sorobanerp.pfm.v1.UpdateUserProfileRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateUserProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all members within a tenant's family account.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ListFamilyMembersResponse listFamilyMembers(com.sorobanerp.pfm.v1.ListFamilyMembersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListFamilyMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invites a new family member with a specified role (OWNER, MEMBER, VIEWER).
     * </pre>
     */
    public com.sorobanerp.pfm.v1.InviteFamilyMemberResponse inviteFamilyMember(com.sorobanerp.pfm.v1.InviteFamilyMemberRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getInviteFamilyMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a member from the tenant's family account.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse removeFamilyMember(com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveFamilyMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves category budget caps and alert thresholds.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse getCategoryBudgets(com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCategoryBudgetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets or updates a category budget cap.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.SetCategoryBudgetResponse setCategoryBudget(com.sorobanerp.pfm.v1.SetCategoryBudgetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetCategoryBudgetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stores an encrypted PDF statement password for automated unlocking via KMS.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse setCardPdfPassword(com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetCardPdfPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a complete data export under LGPD.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ExportUserDataResponse exportUserData(com.sorobanerp.pfm.v1.ExportUserDataRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExportUserDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes cryptographic deletion (Crypto-Shredding) of tenant's KMS DEK.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse requestCryptoShredding(com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRequestCryptoShreddingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UserProfileService.
   */
  public static final class UserProfileServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserProfileServiceBlockingStub> {
    private UserProfileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves user profile within the tenant.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetUserProfileResponse getUserProfile(com.sorobanerp.pfm.v1.GetUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates user profile information.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.UpdateUserProfileResponse updateUserProfile(com.sorobanerp.pfm.v1.UpdateUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all members within a tenant's family account.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ListFamilyMembersResponse listFamilyMembers(com.sorobanerp.pfm.v1.ListFamilyMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFamilyMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invites a new family member with a specified role (OWNER, MEMBER, VIEWER).
     * </pre>
     */
    public com.sorobanerp.pfm.v1.InviteFamilyMemberResponse inviteFamilyMember(com.sorobanerp.pfm.v1.InviteFamilyMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInviteFamilyMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a member from the tenant's family account.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse removeFamilyMember(com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFamilyMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves category budget caps and alert thresholds.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse getCategoryBudgets(com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCategoryBudgetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets or updates a category budget cap.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.SetCategoryBudgetResponse setCategoryBudget(com.sorobanerp.pfm.v1.SetCategoryBudgetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCategoryBudgetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stores an encrypted PDF statement password for automated unlocking via KMS.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse setCardPdfPassword(com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCardPdfPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a complete data export under LGPD.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ExportUserDataResponse exportUserData(com.sorobanerp.pfm.v1.ExportUserDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportUserDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes cryptographic deletion (Crypto-Shredding) of tenant's KMS DEK.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse requestCryptoShredding(com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestCryptoShreddingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserProfileService.
   */
  public static final class UserProfileServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserProfileServiceFutureStub> {
    private UserProfileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves user profile within the tenant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.GetUserProfileResponse> getUserProfile(
        com.sorobanerp.pfm.v1.GetUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates user profile information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.UpdateUserProfileResponse> updateUserProfile(
        com.sorobanerp.pfm.v1.UpdateUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all members within a tenant's family account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.ListFamilyMembersResponse> listFamilyMembers(
        com.sorobanerp.pfm.v1.ListFamilyMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFamilyMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Invites a new family member with a specified role (OWNER, MEMBER, VIEWER).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.InviteFamilyMemberResponse> inviteFamilyMember(
        com.sorobanerp.pfm.v1.InviteFamilyMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInviteFamilyMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a member from the tenant's family account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse> removeFamilyMember(
        com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFamilyMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves category budget caps and alert thresholds.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse> getCategoryBudgets(
        com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCategoryBudgetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets or updates a category budget cap.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.SetCategoryBudgetResponse> setCategoryBudget(
        com.sorobanerp.pfm.v1.SetCategoryBudgetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCategoryBudgetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stores an encrypted PDF statement password for automated unlocking via KMS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse> setCardPdfPassword(
        com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCardPdfPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a complete data export under LGPD.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.ExportUserDataResponse> exportUserData(
        com.sorobanerp.pfm.v1.ExportUserDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportUserDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Executes cryptographic deletion (Crypto-Shredding) of tenant's KMS DEK.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse> requestCryptoShredding(
        com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestCryptoShreddingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_PROFILE = 0;
  private static final int METHODID_UPDATE_USER_PROFILE = 1;
  private static final int METHODID_LIST_FAMILY_MEMBERS = 2;
  private static final int METHODID_INVITE_FAMILY_MEMBER = 3;
  private static final int METHODID_REMOVE_FAMILY_MEMBER = 4;
  private static final int METHODID_GET_CATEGORY_BUDGETS = 5;
  private static final int METHODID_SET_CATEGORY_BUDGET = 6;
  private static final int METHODID_SET_CARD_PDF_PASSWORD = 7;
  private static final int METHODID_EXPORT_USER_DATA = 8;
  private static final int METHODID_REQUEST_CRYPTO_SHREDDING = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_PROFILE:
          serviceImpl.getUserProfile((com.sorobanerp.pfm.v1.GetUserProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetUserProfileResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_PROFILE:
          serviceImpl.updateUserProfile((com.sorobanerp.pfm.v1.UpdateUserProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.UpdateUserProfileResponse>) responseObserver);
          break;
        case METHODID_LIST_FAMILY_MEMBERS:
          serviceImpl.listFamilyMembers((com.sorobanerp.pfm.v1.ListFamilyMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ListFamilyMembersResponse>) responseObserver);
          break;
        case METHODID_INVITE_FAMILY_MEMBER:
          serviceImpl.inviteFamilyMember((com.sorobanerp.pfm.v1.InviteFamilyMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.InviteFamilyMemberResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FAMILY_MEMBER:
          serviceImpl.removeFamilyMember((com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse>) responseObserver);
          break;
        case METHODID_GET_CATEGORY_BUDGETS:
          serviceImpl.getCategoryBudgets((com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse>) responseObserver);
          break;
        case METHODID_SET_CATEGORY_BUDGET:
          serviceImpl.setCategoryBudget((com.sorobanerp.pfm.v1.SetCategoryBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SetCategoryBudgetResponse>) responseObserver);
          break;
        case METHODID_SET_CARD_PDF_PASSWORD:
          serviceImpl.setCardPdfPassword((com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse>) responseObserver);
          break;
        case METHODID_EXPORT_USER_DATA:
          serviceImpl.exportUserData((com.sorobanerp.pfm.v1.ExportUserDataRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ExportUserDataResponse>) responseObserver);
          break;
        case METHODID_REQUEST_CRYPTO_SHREDDING:
          serviceImpl.requestCryptoShredding((com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetUserProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.GetUserProfileRequest,
              com.sorobanerp.pfm.v1.GetUserProfileResponse>(
                service, METHODID_GET_USER_PROFILE)))
        .addMethod(
          getUpdateUserProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.UpdateUserProfileRequest,
              com.sorobanerp.pfm.v1.UpdateUserProfileResponse>(
                service, METHODID_UPDATE_USER_PROFILE)))
        .addMethod(
          getListFamilyMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.ListFamilyMembersRequest,
              com.sorobanerp.pfm.v1.ListFamilyMembersResponse>(
                service, METHODID_LIST_FAMILY_MEMBERS)))
        .addMethod(
          getInviteFamilyMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.InviteFamilyMemberRequest,
              com.sorobanerp.pfm.v1.InviteFamilyMemberResponse>(
                service, METHODID_INVITE_FAMILY_MEMBER)))
        .addMethod(
          getRemoveFamilyMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.RemoveFamilyMemberRequest,
              com.sorobanerp.pfm.v1.RemoveFamilyMemberResponse>(
                service, METHODID_REMOVE_FAMILY_MEMBER)))
        .addMethod(
          getGetCategoryBudgetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.GetCategoryBudgetsRequest,
              com.sorobanerp.pfm.v1.GetCategoryBudgetsResponse>(
                service, METHODID_GET_CATEGORY_BUDGETS)))
        .addMethod(
          getSetCategoryBudgetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.SetCategoryBudgetRequest,
              com.sorobanerp.pfm.v1.SetCategoryBudgetResponse>(
                service, METHODID_SET_CATEGORY_BUDGET)))
        .addMethod(
          getSetCardPdfPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.SetCardPdfPasswordRequest,
              com.sorobanerp.pfm.v1.SetCardPdfPasswordResponse>(
                service, METHODID_SET_CARD_PDF_PASSWORD)))
        .addMethod(
          getExportUserDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.ExportUserDataRequest,
              com.sorobanerp.pfm.v1.ExportUserDataResponse>(
                service, METHODID_EXPORT_USER_DATA)))
        .addMethod(
          getRequestCryptoShreddingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.RequestCryptoShreddingRequest,
              com.sorobanerp.pfm.v1.RequestCryptoShreddingResponse>(
                service, METHODID_REQUEST_CRYPTO_SHREDDING)))
        .build();
  }

  private static abstract class UserProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sorobanerp.pfm.v1.UserProfileServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserProfileService");
    }
  }

  private static final class UserProfileServiceFileDescriptorSupplier
      extends UserProfileServiceBaseDescriptorSupplier {
    UserProfileServiceFileDescriptorSupplier() {}
  }

  private static final class UserProfileServiceMethodDescriptorSupplier
      extends UserProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserProfileServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserProfileServiceFileDescriptorSupplier())
              .addMethod(getGetUserProfileMethod())
              .addMethod(getUpdateUserProfileMethod())
              .addMethod(getListFamilyMembersMethod())
              .addMethod(getInviteFamilyMemberMethod())
              .addMethod(getRemoveFamilyMemberMethod())
              .addMethod(getGetCategoryBudgetsMethod())
              .addMethod(getSetCategoryBudgetMethod())
              .addMethod(getSetCardPdfPasswordMethod())
              .addMethod(getExportUserDataMethod())
              .addMethod(getRequestCryptoShreddingMethod())
              .build();
        }
      }
    }
    return result;
  }
}

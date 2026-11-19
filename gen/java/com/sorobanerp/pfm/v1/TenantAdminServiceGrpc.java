package com.sorobanerp.pfm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class TenantAdminServiceGrpc {

  private TenantAdminServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pfm.v1.TenantAdminService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ListTenantsRequest,
      com.sorobanerp.pfm.v1.ListTenantsResponse> getListTenantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTenants",
      requestType = com.sorobanerp.pfm.v1.ListTenantsRequest.class,
      responseType = com.sorobanerp.pfm.v1.ListTenantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ListTenantsRequest,
      com.sorobanerp.pfm.v1.ListTenantsResponse> getListTenantsMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ListTenantsRequest, com.sorobanerp.pfm.v1.ListTenantsResponse> getListTenantsMethod;
    if ((getListTenantsMethod = TenantAdminServiceGrpc.getListTenantsMethod) == null) {
      synchronized (TenantAdminServiceGrpc.class) {
        if ((getListTenantsMethod = TenantAdminServiceGrpc.getListTenantsMethod) == null) {
          TenantAdminServiceGrpc.getListTenantsMethod = getListTenantsMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.ListTenantsRequest, com.sorobanerp.pfm.v1.ListTenantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTenants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ListTenantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ListTenantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantAdminServiceMethodDescriptorSupplier("ListTenants"))
              .build();
        }
      }
    }
    return getListTenantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ChangeTenantPlanRequest,
      com.sorobanerp.pfm.v1.ChangeTenantPlanResponse> getChangeTenantPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeTenantPlan",
      requestType = com.sorobanerp.pfm.v1.ChangeTenantPlanRequest.class,
      responseType = com.sorobanerp.pfm.v1.ChangeTenantPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ChangeTenantPlanRequest,
      com.sorobanerp.pfm.v1.ChangeTenantPlanResponse> getChangeTenantPlanMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ChangeTenantPlanRequest, com.sorobanerp.pfm.v1.ChangeTenantPlanResponse> getChangeTenantPlanMethod;
    if ((getChangeTenantPlanMethod = TenantAdminServiceGrpc.getChangeTenantPlanMethod) == null) {
      synchronized (TenantAdminServiceGrpc.class) {
        if ((getChangeTenantPlanMethod = TenantAdminServiceGrpc.getChangeTenantPlanMethod) == null) {
          TenantAdminServiceGrpc.getChangeTenantPlanMethod = getChangeTenantPlanMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.ChangeTenantPlanRequest, com.sorobanerp.pfm.v1.ChangeTenantPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeTenantPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ChangeTenantPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ChangeTenantPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantAdminServiceMethodDescriptorSupplier("ChangeTenantPlan"))
              .build();
        }
      }
    }
    return getChangeTenantPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest,
      com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse> getUpdateSubscriptionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSubscriptionStatus",
      requestType = com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest.class,
      responseType = com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest,
      com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse> getUpdateSubscriptionStatusMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest, com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse> getUpdateSubscriptionStatusMethod;
    if ((getUpdateSubscriptionStatusMethod = TenantAdminServiceGrpc.getUpdateSubscriptionStatusMethod) == null) {
      synchronized (TenantAdminServiceGrpc.class) {
        if ((getUpdateSubscriptionStatusMethod = TenantAdminServiceGrpc.getUpdateSubscriptionStatusMethod) == null) {
          TenantAdminServiceGrpc.getUpdateSubscriptionStatusMethod = getUpdateSubscriptionStatusMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest, com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSubscriptionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantAdminServiceMethodDescriptorSupplier("UpdateSubscriptionStatus"))
              .build();
        }
      }
    }
    return getUpdateSubscriptionStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetPlatformMetricsRequest,
      com.sorobanerp.pfm.v1.GetPlatformMetricsResponse> getGetPlatformMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlatformMetrics",
      requestType = com.sorobanerp.pfm.v1.GetPlatformMetricsRequest.class,
      responseType = com.sorobanerp.pfm.v1.GetPlatformMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetPlatformMetricsRequest,
      com.sorobanerp.pfm.v1.GetPlatformMetricsResponse> getGetPlatformMetricsMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetPlatformMetricsRequest, com.sorobanerp.pfm.v1.GetPlatformMetricsResponse> getGetPlatformMetricsMethod;
    if ((getGetPlatformMetricsMethod = TenantAdminServiceGrpc.getGetPlatformMetricsMethod) == null) {
      synchronized (TenantAdminServiceGrpc.class) {
        if ((getGetPlatformMetricsMethod = TenantAdminServiceGrpc.getGetPlatformMetricsMethod) == null) {
          TenantAdminServiceGrpc.getGetPlatformMetricsMethod = getGetPlatformMetricsMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.GetPlatformMetricsRequest, com.sorobanerp.pfm.v1.GetPlatformMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlatformMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetPlatformMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetPlatformMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenantAdminServiceMethodDescriptorSupplier("GetPlatformMetrics"))
              .build();
        }
      }
    }
    return getGetPlatformMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TenantAdminServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceStub>() {
        @java.lang.Override
        public TenantAdminServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenantAdminServiceStub(channel, callOptions);
        }
      };
    return TenantAdminServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TenantAdminServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceBlockingV2Stub>() {
        @java.lang.Override
        public TenantAdminServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenantAdminServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return TenantAdminServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TenantAdminServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceBlockingStub>() {
        @java.lang.Override
        public TenantAdminServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenantAdminServiceBlockingStub(channel, callOptions);
        }
      };
    return TenantAdminServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TenantAdminServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenantAdminServiceFutureStub>() {
        @java.lang.Override
        public TenantAdminServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenantAdminServiceFutureStub(channel, callOptions);
        }
      };
    return TenantAdminServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists tenants with subscription, status, and quota metadata.
     * </pre>
     */
    default void listTenants(com.sorobanerp.pfm.v1.ListTenantsRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ListTenantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTenantsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Changes a tenant's subscription plan.
     * </pre>
     */
    default void changeTenantPlan(com.sorobanerp.pfm.v1.ChangeTenantPlanRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ChangeTenantPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeTenantPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a tenant's subscription status.
     * </pre>
     */
    default void updateSubscriptionStatus(com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSubscriptionStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves aggregated platform operational metrics without PII.
     * </pre>
     */
    default void getPlatformMetrics(com.sorobanerp.pfm.v1.GetPlatformMetricsRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetPlatformMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlatformMetricsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TenantAdminService.
   */
  public static abstract class TenantAdminServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TenantAdminServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TenantAdminService.
   */
  public static final class TenantAdminServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TenantAdminServiceStub> {
    private TenantAdminServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenantAdminServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenantAdminServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists tenants with subscription, status, and quota metadata.
     * </pre>
     */
    public void listTenants(com.sorobanerp.pfm.v1.ListTenantsRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ListTenantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTenantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Changes a tenant's subscription plan.
     * </pre>
     */
    public void changeTenantPlan(com.sorobanerp.pfm.v1.ChangeTenantPlanRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ChangeTenantPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeTenantPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a tenant's subscription status.
     * </pre>
     */
    public void updateSubscriptionStatus(com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSubscriptionStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves aggregated platform operational metrics without PII.
     * </pre>
     */
    public void getPlatformMetrics(com.sorobanerp.pfm.v1.GetPlatformMetricsRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetPlatformMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlatformMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TenantAdminService.
   */
  public static final class TenantAdminServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TenantAdminServiceBlockingV2Stub> {
    private TenantAdminServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenantAdminServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenantAdminServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists tenants with subscription, status, and quota metadata.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ListTenantsResponse listTenants(com.sorobanerp.pfm.v1.ListTenantsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListTenantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes a tenant's subscription plan.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ChangeTenantPlanResponse changeTenantPlan(com.sorobanerp.pfm.v1.ChangeTenantPlanRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getChangeTenantPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a tenant's subscription status.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse updateSubscriptionStatus(com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateSubscriptionStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves aggregated platform operational metrics without PII.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetPlatformMetricsResponse getPlatformMetrics(com.sorobanerp.pfm.v1.GetPlatformMetricsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPlatformMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TenantAdminService.
   */
  public static final class TenantAdminServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TenantAdminServiceBlockingStub> {
    private TenantAdminServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenantAdminServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenantAdminServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists tenants with subscription, status, and quota metadata.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ListTenantsResponse listTenants(com.sorobanerp.pfm.v1.ListTenantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTenantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes a tenant's subscription plan.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ChangeTenantPlanResponse changeTenantPlan(com.sorobanerp.pfm.v1.ChangeTenantPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeTenantPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a tenant's subscription status.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse updateSubscriptionStatus(com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSubscriptionStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves aggregated platform operational metrics without PII.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetPlatformMetricsResponse getPlatformMetrics(com.sorobanerp.pfm.v1.GetPlatformMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlatformMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TenantAdminService.
   */
  public static final class TenantAdminServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TenantAdminServiceFutureStub> {
    private TenantAdminServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenantAdminServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenantAdminServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists tenants with subscription, status, and quota metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.ListTenantsResponse> listTenants(
        com.sorobanerp.pfm.v1.ListTenantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTenantsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Changes a tenant's subscription plan.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.ChangeTenantPlanResponse> changeTenantPlan(
        com.sorobanerp.pfm.v1.ChangeTenantPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeTenantPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a tenant's subscription status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse> updateSubscriptionStatus(
        com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSubscriptionStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves aggregated platform operational metrics without PII.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.GetPlatformMetricsResponse> getPlatformMetrics(
        com.sorobanerp.pfm.v1.GetPlatformMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlatformMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_TENANTS = 0;
  private static final int METHODID_CHANGE_TENANT_PLAN = 1;
  private static final int METHODID_UPDATE_SUBSCRIPTION_STATUS = 2;
  private static final int METHODID_GET_PLATFORM_METRICS = 3;

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
        case METHODID_LIST_TENANTS:
          serviceImpl.listTenants((com.sorobanerp.pfm.v1.ListTenantsRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ListTenantsResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TENANT_PLAN:
          serviceImpl.changeTenantPlan((com.sorobanerp.pfm.v1.ChangeTenantPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ChangeTenantPlanResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SUBSCRIPTION_STATUS:
          serviceImpl.updateSubscriptionStatus((com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse>) responseObserver);
          break;
        case METHODID_GET_PLATFORM_METRICS:
          serviceImpl.getPlatformMetrics((com.sorobanerp.pfm.v1.GetPlatformMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetPlatformMetricsResponse>) responseObserver);
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
          getListTenantsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.ListTenantsRequest,
              com.sorobanerp.pfm.v1.ListTenantsResponse>(
                service, METHODID_LIST_TENANTS)))
        .addMethod(
          getChangeTenantPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.ChangeTenantPlanRequest,
              com.sorobanerp.pfm.v1.ChangeTenantPlanResponse>(
                service, METHODID_CHANGE_TENANT_PLAN)))
        .addMethod(
          getUpdateSubscriptionStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.UpdateSubscriptionStatusRequest,
              com.sorobanerp.pfm.v1.UpdateSubscriptionStatusResponse>(
                service, METHODID_UPDATE_SUBSCRIPTION_STATUS)))
        .addMethod(
          getGetPlatformMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.GetPlatformMetricsRequest,
              com.sorobanerp.pfm.v1.GetPlatformMetricsResponse>(
                service, METHODID_GET_PLATFORM_METRICS)))
        .build();
  }

  private static abstract class TenantAdminServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TenantAdminServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sorobanerp.pfm.v1.TenantAdminServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TenantAdminService");
    }
  }

  private static final class TenantAdminServiceFileDescriptorSupplier
      extends TenantAdminServiceBaseDescriptorSupplier {
    TenantAdminServiceFileDescriptorSupplier() {}
  }

  private static final class TenantAdminServiceMethodDescriptorSupplier
      extends TenantAdminServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TenantAdminServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TenantAdminServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TenantAdminServiceFileDescriptorSupplier())
              .addMethod(getListTenantsMethod())
              .addMethod(getChangeTenantPlanMethod())
              .addMethod(getUpdateSubscriptionStatusMethod())
              .addMethod(getGetPlatformMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

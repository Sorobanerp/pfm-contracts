package com.sorobanerp.pfm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class CoreLedgerServiceGrpc {

  private CoreLedgerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pfm.v1.CoreLedgerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ProcessReceiptRequest,
      com.sorobanerp.pfm.v1.ProcessReceiptResponse> getProcessReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessReceipt",
      requestType = com.sorobanerp.pfm.v1.ProcessReceiptRequest.class,
      responseType = com.sorobanerp.pfm.v1.ProcessReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ProcessReceiptRequest,
      com.sorobanerp.pfm.v1.ProcessReceiptResponse> getProcessReceiptMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.ProcessReceiptRequest, com.sorobanerp.pfm.v1.ProcessReceiptResponse> getProcessReceiptMethod;
    if ((getProcessReceiptMethod = CoreLedgerServiceGrpc.getProcessReceiptMethod) == null) {
      synchronized (CoreLedgerServiceGrpc.class) {
        if ((getProcessReceiptMethod = CoreLedgerServiceGrpc.getProcessReceiptMethod) == null) {
          CoreLedgerServiceGrpc.getProcessReceiptMethod = getProcessReceiptMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.ProcessReceiptRequest, com.sorobanerp.pfm.v1.ProcessReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ProcessReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.ProcessReceiptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreLedgerServiceMethodDescriptorSupplier("ProcessReceipt"))
              .build();
        }
      }
    }
    return getProcessReceiptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest,
      com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse> getGetTenantFinancialSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTenantFinancialSummary",
      requestType = com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest.class,
      responseType = com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest,
      com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse> getGetTenantFinancialSummaryMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest, com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse> getGetTenantFinancialSummaryMethod;
    if ((getGetTenantFinancialSummaryMethod = CoreLedgerServiceGrpc.getGetTenantFinancialSummaryMethod) == null) {
      synchronized (CoreLedgerServiceGrpc.class) {
        if ((getGetTenantFinancialSummaryMethod = CoreLedgerServiceGrpc.getGetTenantFinancialSummaryMethod) == null) {
          CoreLedgerServiceGrpc.getGetTenantFinancialSummaryMethod = getGetTenantFinancialSummaryMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest, com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTenantFinancialSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreLedgerServiceMethodDescriptorSupplier("GetTenantFinancialSummary"))
              .build();
        }
      }
    }
    return getGetTenantFinancialSummaryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreLedgerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceStub>() {
        @java.lang.Override
        public CoreLedgerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreLedgerServiceStub(channel, callOptions);
        }
      };
    return CoreLedgerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CoreLedgerServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceBlockingV2Stub>() {
        @java.lang.Override
        public CoreLedgerServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreLedgerServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CoreLedgerServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreLedgerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceBlockingStub>() {
        @java.lang.Override
        public CoreLedgerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreLedgerServiceBlockingStub(channel, callOptions);
        }
      };
    return CoreLedgerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreLedgerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreLedgerServiceFutureStub>() {
        @java.lang.Override
        public CoreLedgerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreLedgerServiceFutureStub(channel, callOptions);
        }
      };
    return CoreLedgerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Reconciles an extracted NFC-e fiscal receipt against credit card statement transactions
     * and detects item-level price inflation (&gt;10% unit price increase per EAN barcode).
     * </pre>
     */
    default void processReceipt(com.sorobanerp.pfm.v1.ProcessReceiptRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ProcessReceiptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessReceiptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the consolidated Multi-Card Matrix, Current Invoice, M+1 Forecast,
     * and Future Income Commitment summary for a tenant.
     * </pre>
     */
    default void getTenantFinancialSummary(com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTenantFinancialSummaryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CoreLedgerService.
   */
  public static abstract class CoreLedgerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CoreLedgerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CoreLedgerService.
   */
  public static final class CoreLedgerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CoreLedgerServiceStub> {
    private CoreLedgerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreLedgerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreLedgerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reconciles an extracted NFC-e fiscal receipt against credit card statement transactions
     * and detects item-level price inflation (&gt;10% unit price increase per EAN barcode).
     * </pre>
     */
    public void processReceipt(com.sorobanerp.pfm.v1.ProcessReceiptRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ProcessReceiptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessReceiptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the consolidated Multi-Card Matrix, Current Invoice, M+1 Forecast,
     * and Future Income Commitment summary for a tenant.
     * </pre>
     */
    public void getTenantFinancialSummary(com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTenantFinancialSummaryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CoreLedgerService.
   */
  public static final class CoreLedgerServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CoreLedgerServiceBlockingV2Stub> {
    private CoreLedgerServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreLedgerServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreLedgerServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Reconciles an extracted NFC-e fiscal receipt against credit card statement transactions
     * and detects item-level price inflation (&gt;10% unit price increase per EAN barcode).
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ProcessReceiptResponse processReceipt(com.sorobanerp.pfm.v1.ProcessReceiptRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getProcessReceiptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the consolidated Multi-Card Matrix, Current Invoice, M+1 Forecast,
     * and Future Income Commitment summary for a tenant.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse getTenantFinancialSummary(com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetTenantFinancialSummaryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CoreLedgerService.
   */
  public static final class CoreLedgerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CoreLedgerServiceBlockingStub> {
    private CoreLedgerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreLedgerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreLedgerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reconciles an extracted NFC-e fiscal receipt against credit card statement transactions
     * and detects item-level price inflation (&gt;10% unit price increase per EAN barcode).
     * </pre>
     */
    public com.sorobanerp.pfm.v1.ProcessReceiptResponse processReceipt(com.sorobanerp.pfm.v1.ProcessReceiptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessReceiptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the consolidated Multi-Card Matrix, Current Invoice, M+1 Forecast,
     * and Future Income Commitment summary for a tenant.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse getTenantFinancialSummary(com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTenantFinancialSummaryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CoreLedgerService.
   */
  public static final class CoreLedgerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CoreLedgerServiceFutureStub> {
    private CoreLedgerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreLedgerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreLedgerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reconciles an extracted NFC-e fiscal receipt against credit card statement transactions
     * and detects item-level price inflation (&gt;10% unit price increase per EAN barcode).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.ProcessReceiptResponse> processReceipt(
        com.sorobanerp.pfm.v1.ProcessReceiptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessReceiptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the consolidated Multi-Card Matrix, Current Invoice, M+1 Forecast,
     * and Future Income Commitment summary for a tenant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse> getTenantFinancialSummary(
        com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTenantFinancialSummaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_RECEIPT = 0;
  private static final int METHODID_GET_TENANT_FINANCIAL_SUMMARY = 1;

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
        case METHODID_PROCESS_RECEIPT:
          serviceImpl.processReceipt((com.sorobanerp.pfm.v1.ProcessReceiptRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.ProcessReceiptResponse>) responseObserver);
          break;
        case METHODID_GET_TENANT_FINANCIAL_SUMMARY:
          serviceImpl.getTenantFinancialSummary((com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse>) responseObserver);
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
          getProcessReceiptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.ProcessReceiptRequest,
              com.sorobanerp.pfm.v1.ProcessReceiptResponse>(
                service, METHODID_PROCESS_RECEIPT)))
        .addMethod(
          getGetTenantFinancialSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.GetTenantFinancialSummaryRequest,
              com.sorobanerp.pfm.v1.GetTenantFinancialSummaryResponse>(
                service, METHODID_GET_TENANT_FINANCIAL_SUMMARY)))
        .build();
  }

  private static abstract class CoreLedgerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoreLedgerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sorobanerp.pfm.v1.CoreLedgerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoreLedgerService");
    }
  }

  private static final class CoreLedgerServiceFileDescriptorSupplier
      extends CoreLedgerServiceBaseDescriptorSupplier {
    CoreLedgerServiceFileDescriptorSupplier() {}
  }

  private static final class CoreLedgerServiceMethodDescriptorSupplier
      extends CoreLedgerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CoreLedgerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CoreLedgerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreLedgerServiceFileDescriptorSupplier())
              .addMethod(getProcessReceiptMethod())
              .addMethod(getGetTenantFinancialSummaryMethod())
              .build();
        }
      }
    }
    return result;
  }
}

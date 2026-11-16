package com.sorobanerp.pfm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ForecastServiceGrpc {

  private ForecastServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pfm.v1.ForecastService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SimulateContractRequest,
      com.sorobanerp.pfm.v1.SimulateContractResponse> getSimulateContractAmortizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimulateContractAmortization",
      requestType = com.sorobanerp.pfm.v1.SimulateContractRequest.class,
      responseType = com.sorobanerp.pfm.v1.SimulateContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SimulateContractRequest,
      com.sorobanerp.pfm.v1.SimulateContractResponse> getSimulateContractAmortizationMethod() {
    io.grpc.MethodDescriptor<com.sorobanerp.pfm.v1.SimulateContractRequest, com.sorobanerp.pfm.v1.SimulateContractResponse> getSimulateContractAmortizationMethod;
    if ((getSimulateContractAmortizationMethod = ForecastServiceGrpc.getSimulateContractAmortizationMethod) == null) {
      synchronized (ForecastServiceGrpc.class) {
        if ((getSimulateContractAmortizationMethod = ForecastServiceGrpc.getSimulateContractAmortizationMethod) == null) {
          ForecastServiceGrpc.getSimulateContractAmortizationMethod = getSimulateContractAmortizationMethod =
              io.grpc.MethodDescriptor.<com.sorobanerp.pfm.v1.SimulateContractRequest, com.sorobanerp.pfm.v1.SimulateContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimulateContractAmortization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.SimulateContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sorobanerp.pfm.v1.SimulateContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ForecastServiceMethodDescriptorSupplier("SimulateContractAmortization"))
              .build();
        }
      }
    }
    return getSimulateContractAmortizationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ForecastServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ForecastServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ForecastServiceStub>() {
        @java.lang.Override
        public ForecastServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ForecastServiceStub(channel, callOptions);
        }
      };
    return ForecastServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ForecastServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ForecastServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ForecastServiceBlockingV2Stub>() {
        @java.lang.Override
        public ForecastServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ForecastServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ForecastServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ForecastServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ForecastServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ForecastServiceBlockingStub>() {
        @java.lang.Override
        public ForecastServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ForecastServiceBlockingStub(channel, callOptions);
        }
      };
    return ForecastServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ForecastServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ForecastServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ForecastServiceFutureStub>() {
        @java.lang.Override
        public ForecastServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ForecastServiceFutureStub(channel, callOptions);
        }
      };
    return ForecastServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simulates contract amortization schedules and extra-payment strategies (term reduction vs.
     * installment reduction) across SAC, Price, and Consorcio modalities, calculating net interest savings.
     * </pre>
     */
    default void simulateContractAmortization(com.sorobanerp.pfm.v1.SimulateContractRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SimulateContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimulateContractAmortizationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ForecastService.
   */
  public static abstract class ForecastServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ForecastServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ForecastService.
   */
  public static final class ForecastServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ForecastServiceStub> {
    private ForecastServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForecastServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ForecastServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simulates contract amortization schedules and extra-payment strategies (term reduction vs.
     * installment reduction) across SAC, Price, and Consorcio modalities, calculating net interest savings.
     * </pre>
     */
    public void simulateContractAmortization(com.sorobanerp.pfm.v1.SimulateContractRequest request,
        io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SimulateContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimulateContractAmortizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ForecastService.
   */
  public static final class ForecastServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ForecastServiceBlockingV2Stub> {
    private ForecastServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForecastServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ForecastServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Simulates contract amortization schedules and extra-payment strategies (term reduction vs.
     * installment reduction) across SAC, Price, and Consorcio modalities, calculating net interest savings.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.SimulateContractResponse simulateContractAmortization(com.sorobanerp.pfm.v1.SimulateContractRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSimulateContractAmortizationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ForecastService.
   */
  public static final class ForecastServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ForecastServiceBlockingStub> {
    private ForecastServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForecastServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ForecastServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simulates contract amortization schedules and extra-payment strategies (term reduction vs.
     * installment reduction) across SAC, Price, and Consorcio modalities, calculating net interest savings.
     * </pre>
     */
    public com.sorobanerp.pfm.v1.SimulateContractResponse simulateContractAmortization(com.sorobanerp.pfm.v1.SimulateContractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimulateContractAmortizationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ForecastService.
   */
  public static final class ForecastServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ForecastServiceFutureStub> {
    private ForecastServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForecastServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ForecastServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simulates contract amortization schedules and extra-payment strategies (term reduction vs.
     * installment reduction) across SAC, Price, and Consorcio modalities, calculating net interest savings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sorobanerp.pfm.v1.SimulateContractResponse> simulateContractAmortization(
        com.sorobanerp.pfm.v1.SimulateContractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimulateContractAmortizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMULATE_CONTRACT_AMORTIZATION = 0;

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
        case METHODID_SIMULATE_CONTRACT_AMORTIZATION:
          serviceImpl.simulateContractAmortization((com.sorobanerp.pfm.v1.SimulateContractRequest) request,
              (io.grpc.stub.StreamObserver<com.sorobanerp.pfm.v1.SimulateContractResponse>) responseObserver);
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
          getSimulateContractAmortizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sorobanerp.pfm.v1.SimulateContractRequest,
              com.sorobanerp.pfm.v1.SimulateContractResponse>(
                service, METHODID_SIMULATE_CONTRACT_AMORTIZATION)))
        .build();
  }

  private static abstract class ForecastServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ForecastServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sorobanerp.pfm.v1.ForecastServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ForecastService");
    }
  }

  private static final class ForecastServiceFileDescriptorSupplier
      extends ForecastServiceBaseDescriptorSupplier {
    ForecastServiceFileDescriptorSupplier() {}
  }

  private static final class ForecastServiceMethodDescriptorSupplier
      extends ForecastServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ForecastServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ForecastServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ForecastServiceFileDescriptorSupplier())
              .addMethod(getSimulateContractAmortizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}

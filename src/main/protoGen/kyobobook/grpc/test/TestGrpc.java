package kyobobook.grpc.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: Test.proto")
public final class TestGrpc {

  private TestGrpc() {}

  public static final String SERVICE_NAME = "Test";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      kyobobook.grpc.test.TestResponse> getSelectDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectData",
      requestType = com.google.protobuf.Empty.class,
      responseType = kyobobook.grpc.test.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      kyobobook.grpc.test.TestResponse> getSelectDataMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, kyobobook.grpc.test.TestResponse> getSelectDataMethod;
    if ((getSelectDataMethod = TestGrpc.getSelectDataMethod) == null) {
      synchronized (TestGrpc.class) {
        if ((getSelectDataMethod = TestGrpc.getSelectDataMethod) == null) {
          TestGrpc.getSelectDataMethod = getSelectDataMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, kyobobook.grpc.test.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.test.TestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestMethodDescriptorSupplier("SelectData"))
              .build();
        }
      }
    }
    return getSelectDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.test.TestRequest,
      kyobobook.grpc.test.TestResponse> getGetDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetData",
      requestType = kyobobook.grpc.test.TestRequest.class,
      responseType = kyobobook.grpc.test.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.test.TestRequest,
      kyobobook.grpc.test.TestResponse> getGetDataMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.test.TestRequest, kyobobook.grpc.test.TestResponse> getGetDataMethod;
    if ((getGetDataMethod = TestGrpc.getGetDataMethod) == null) {
      synchronized (TestGrpc.class) {
        if ((getGetDataMethod = TestGrpc.getGetDataMethod) == null) {
          TestGrpc.getGetDataMethod = getGetDataMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.test.TestRequest, kyobobook.grpc.test.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.test.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.test.TestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestMethodDescriptorSupplier("GetData"))
              .build();
        }
      }
    }
    return getGetDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestStub>() {
        @java.lang.Override
        public TestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestStub(channel, callOptions);
        }
      };
    return TestStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestBlockingStub>() {
        @java.lang.Override
        public TestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestBlockingStub(channel, callOptions);
        }
      };
    return TestBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestFutureStub>() {
        @java.lang.Override
        public TestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestFutureStub(channel, callOptions);
        }
      };
    return TestFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestImplBase implements io.grpc.BindableService {

    /**
     */
    public void selectData(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectDataMethod(), responseObserver);
    }

    /**
     */
    public void getData(kyobobook.grpc.test.TestRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSelectDataMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                kyobobook.grpc.test.TestResponse>(
                  this, METHODID_SELECT_DATA)))
          .addMethod(
            getGetDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.test.TestRequest,
                kyobobook.grpc.test.TestResponse>(
                  this, METHODID_GET_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class TestStub extends io.grpc.stub.AbstractAsyncStub<TestStub> {
    private TestStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestStub(channel, callOptions);
    }

    /**
     */
    public void selectData(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSelectDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getData(kyobobook.grpc.test.TestRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestBlockingStub> {
    private TestBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<kyobobook.grpc.test.TestResponse> selectData(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSelectDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.test.TestResponse getData(kyobobook.grpc.test.TestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestFutureStub extends io.grpc.stub.AbstractFutureStub<TestFutureStub> {
    private TestFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.test.TestResponse> getData(
        kyobobook.grpc.test.TestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SELECT_DATA = 0;
  private static final int METHODID_GET_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELECT_DATA:
          serviceImpl.selectData((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse>) responseObserver);
          break;
        case METHODID_GET_DATA:
          serviceImpl.getData((kyobobook.grpc.test.TestRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.test.TestResponse>) responseObserver);
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

  private static abstract class TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyobobook.grpc.test.TestProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Test");
    }
  }

  private static final class TestFileDescriptorSupplier
      extends TestBaseDescriptorSupplier {
    TestFileDescriptorSupplier() {}
  }

  private static final class TestMethodDescriptorSupplier
      extends TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestFileDescriptorSupplier())
              .addMethod(getSelectDataMethod())
              .addMethod(getGetDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package kyobobook.grpc.sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: Sample.proto")
public final class SampleGrpc {

  private SampleGrpc() {}

  public static final String SERVICE_NAME = "Sample";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.SampleResponse> getSelectGrpcSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectGrpcSample",
      requestType = kyobobook.grpc.sample.SampleRequest.class,
      responseType = kyobobook.grpc.sample.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.SampleResponse> getSelectGrpcSampleMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.SampleResponse> getSelectGrpcSampleMethod;
    if ((getSelectGrpcSampleMethod = SampleGrpc.getSelectGrpcSampleMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getSelectGrpcSampleMethod = SampleGrpc.getSelectGrpcSampleMethod) == null) {
          SampleGrpc.getSelectGrpcSampleMethod = getSelectGrpcSampleMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectGrpcSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleMethodDescriptorSupplier("SelectGrpcSample"))
              .build();
        }
      }
    }
    return getSelectGrpcSampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.SampleResponse> getGetGrpcSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGrpcSample",
      requestType = kyobobook.grpc.sample.SampleRequest.class,
      responseType = kyobobook.grpc.sample.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.SampleResponse> getGetGrpcSampleMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.SampleResponse> getGetGrpcSampleMethod;
    if ((getGetGrpcSampleMethod = SampleGrpc.getGetGrpcSampleMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getGetGrpcSampleMethod = SampleGrpc.getGetGrpcSampleMethod) == null) {
          SampleGrpc.getGetGrpcSampleMethod = getGetGrpcSampleMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGrpcSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleMethodDescriptorSupplier("GetGrpcSample"))
              .build();
        }
      }
    }
    return getGetGrpcSampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.ResponseResult> getInsertGrpcSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertGrpcSample",
      requestType = kyobobook.grpc.sample.SampleRequest.class,
      responseType = kyobobook.grpc.sample.ResponseResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.ResponseResult> getInsertGrpcSampleMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.ResponseResult> getInsertGrpcSampleMethod;
    if ((getInsertGrpcSampleMethod = SampleGrpc.getInsertGrpcSampleMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getInsertGrpcSampleMethod = SampleGrpc.getInsertGrpcSampleMethod) == null) {
          SampleGrpc.getInsertGrpcSampleMethod = getInsertGrpcSampleMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.ResponseResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertGrpcSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.ResponseResult.getDefaultInstance()))
              .setSchemaDescriptor(new SampleMethodDescriptorSupplier("InsertGrpcSample"))
              .build();
        }
      }
    }
    return getInsertGrpcSampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.ResponseResult> getUpdateGrpcSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGrpcSample",
      requestType = kyobobook.grpc.sample.SampleRequest.class,
      responseType = kyobobook.grpc.sample.ResponseResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.ResponseResult> getUpdateGrpcSampleMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.ResponseResult> getUpdateGrpcSampleMethod;
    if ((getUpdateGrpcSampleMethod = SampleGrpc.getUpdateGrpcSampleMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getUpdateGrpcSampleMethod = SampleGrpc.getUpdateGrpcSampleMethod) == null) {
          SampleGrpc.getUpdateGrpcSampleMethod = getUpdateGrpcSampleMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.ResponseResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGrpcSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.ResponseResult.getDefaultInstance()))
              .setSchemaDescriptor(new SampleMethodDescriptorSupplier("UpdateGrpcSample"))
              .build();
        }
      }
    }
    return getUpdateGrpcSampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.ResponseResult> getDeleteGrpcSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGrpcSample",
      requestType = kyobobook.grpc.sample.SampleRequest.class,
      responseType = kyobobook.grpc.sample.ResponseResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest,
      kyobobook.grpc.sample.ResponseResult> getDeleteGrpcSampleMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.ResponseResult> getDeleteGrpcSampleMethod;
    if ((getDeleteGrpcSampleMethod = SampleGrpc.getDeleteGrpcSampleMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getDeleteGrpcSampleMethod = SampleGrpc.getDeleteGrpcSampleMethod) == null) {
          SampleGrpc.getDeleteGrpcSampleMethod = getDeleteGrpcSampleMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.sample.SampleRequest, kyobobook.grpc.sample.ResponseResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGrpcSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.ResponseResult.getDefaultInstance()))
              .setSchemaDescriptor(new SampleMethodDescriptorSupplier("DeleteGrpcSample"))
              .build();
        }
      }
    }
    return getDeleteGrpcSampleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleStub>() {
        @java.lang.Override
        public SampleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleStub(channel, callOptions);
        }
      };
    return SampleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub>() {
        @java.lang.Override
        public SampleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleBlockingStub(channel, callOptions);
        }
      };
    return SampleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub>() {
        @java.lang.Override
        public SampleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleFutureStub(channel, callOptions);
        }
      };
    return SampleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SampleImplBase implements io.grpc.BindableService {

    /**
     */
    public void selectGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectGrpcSampleMethod(), responseObserver);
    }

    /**
     */
    public void getGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGrpcSampleMethod(), responseObserver);
    }

    /**
     */
    public void insertGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertGrpcSampleMethod(), responseObserver);
    }

    /**
     */
    public void updateGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGrpcSampleMethod(), responseObserver);
    }

    /**
     */
    public void deleteGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGrpcSampleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSelectGrpcSampleMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                kyobobook.grpc.sample.SampleRequest,
                kyobobook.grpc.sample.SampleResponse>(
                  this, METHODID_SELECT_GRPC_SAMPLE)))
          .addMethod(
            getGetGrpcSampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.sample.SampleRequest,
                kyobobook.grpc.sample.SampleResponse>(
                  this, METHODID_GET_GRPC_SAMPLE)))
          .addMethod(
            getInsertGrpcSampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.sample.SampleRequest,
                kyobobook.grpc.sample.ResponseResult>(
                  this, METHODID_INSERT_GRPC_SAMPLE)))
          .addMethod(
            getUpdateGrpcSampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.sample.SampleRequest,
                kyobobook.grpc.sample.ResponseResult>(
                  this, METHODID_UPDATE_GRPC_SAMPLE)))
          .addMethod(
            getDeleteGrpcSampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.sample.SampleRequest,
                kyobobook.grpc.sample.ResponseResult>(
                  this, METHODID_DELETE_GRPC_SAMPLE)))
          .build();
    }
  }

  /**
   */
  public static final class SampleStub extends io.grpc.stub.AbstractAsyncStub<SampleStub> {
    private SampleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleStub(channel, callOptions);
    }

    /**
     */
    public void selectGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSelectGrpcSampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGrpcSampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertGrpcSampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGrpcSampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGrpcSample(kyobobook.grpc.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGrpcSampleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SampleBlockingStub extends io.grpc.stub.AbstractBlockingStub<SampleBlockingStub> {
    private SampleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<kyobobook.grpc.sample.SampleResponse> selectGrpcSample(
        kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSelectGrpcSampleMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.SampleResponse getGrpcSample(kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGrpcSampleMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.ResponseResult insertGrpcSample(kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertGrpcSampleMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.ResponseResult updateGrpcSample(kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGrpcSampleMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.ResponseResult deleteGrpcSample(kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGrpcSampleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SampleFutureStub extends io.grpc.stub.AbstractFutureStub<SampleFutureStub> {
    private SampleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.SampleResponse> getGrpcSample(
        kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGrpcSampleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.ResponseResult> insertGrpcSample(
        kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertGrpcSampleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.ResponseResult> updateGrpcSample(
        kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGrpcSampleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.ResponseResult> deleteGrpcSample(
        kyobobook.grpc.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGrpcSampleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SELECT_GRPC_SAMPLE = 0;
  private static final int METHODID_GET_GRPC_SAMPLE = 1;
  private static final int METHODID_INSERT_GRPC_SAMPLE = 2;
  private static final int METHODID_UPDATE_GRPC_SAMPLE = 3;
  private static final int METHODID_DELETE_GRPC_SAMPLE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELECT_GRPC_SAMPLE:
          serviceImpl.selectGrpcSample((kyobobook.grpc.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.SampleResponse>) responseObserver);
          break;
        case METHODID_GET_GRPC_SAMPLE:
          serviceImpl.getGrpcSample((kyobobook.grpc.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.SampleResponse>) responseObserver);
          break;
        case METHODID_INSERT_GRPC_SAMPLE:
          serviceImpl.insertGrpcSample((kyobobook.grpc.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult>) responseObserver);
          break;
        case METHODID_UPDATE_GRPC_SAMPLE:
          serviceImpl.updateGrpcSample((kyobobook.grpc.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult>) responseObserver);
          break;
        case METHODID_DELETE_GRPC_SAMPLE:
          serviceImpl.deleteGrpcSample((kyobobook.grpc.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult>) responseObserver);
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

  private static abstract class SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyobobook.grpc.sample.SampleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sample");
    }
  }

  private static final class SampleFileDescriptorSupplier
      extends SampleBaseDescriptorSupplier {
    SampleFileDescriptorSupplier() {}
  }

  private static final class SampleMethodDescriptorSupplier
      extends SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleMethodDescriptorSupplier(String methodName) {
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
      synchronized (SampleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleFileDescriptorSupplier())
              .addMethod(getSelectGrpcSampleMethod())
              .addMethod(getGetGrpcSampleMethod())
              .addMethod(getInsertGrpcSampleMethod())
              .addMethod(getUpdateGrpcSampleMethod())
              .addMethod(getDeleteGrpcSampleMethod())
              .build();
        }
      }
    }
    return result;
  }
}

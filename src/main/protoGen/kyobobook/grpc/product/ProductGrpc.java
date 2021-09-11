package kyobobook.grpc.product;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: Product.proto")
public final class ProductGrpc {

  private ProductGrpc() {}

  public static final String SERVICE_NAME = "Product";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.product.ProductResponse> getGetProductDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductDetail",
      requestType = kyobobook.grpc.product.ProductRequest.class,
      responseType = kyobobook.grpc.product.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.product.ProductResponse> getGetProductDetailMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.product.ProductResponse> getGetProductDetailMethod;
    if ((getGetProductDetailMethod = ProductGrpc.getGetProductDetailMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getGetProductDetailMethod = ProductGrpc.getGetProductDetailMethod) == null) {
          ProductGrpc.getGetProductDetailMethod = getGetProductDetailMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.product.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.product.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.product.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("GetProductDetail"))
              .build();
        }
      }
    }
    return getGetProductDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getInsertProductBkrvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertProductBkrv",
      requestType = kyobobook.grpc.product.ProductRequest.class,
      responseType = kyobobook.grpc.sample.ResponseResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getInsertProductBkrvMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult> getInsertProductBkrvMethod;
    if ((getInsertProductBkrvMethod = ProductGrpc.getInsertProductBkrvMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getInsertProductBkrvMethod = ProductGrpc.getInsertProductBkrvMethod) == null) {
          ProductGrpc.getInsertProductBkrvMethod = getInsertProductBkrvMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertProductBkrv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.product.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.ResponseResult.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("InsertProductBkrv"))
              .build();
        }
      }
    }
    return getInsertProductBkrvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getInsertProductCtntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertProductCtnt",
      requestType = kyobobook.grpc.product.ProductRequest.class,
      responseType = kyobobook.grpc.sample.ResponseResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getInsertProductCtntMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult> getInsertProductCtntMethod;
    if ((getInsertProductCtntMethod = ProductGrpc.getInsertProductCtntMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getInsertProductCtntMethod = ProductGrpc.getInsertProductCtntMethod) == null) {
          ProductGrpc.getInsertProductCtntMethod = getInsertProductCtntMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertProductCtnt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.product.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.ResponseResult.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("InsertProductCtnt"))
              .build();
        }
      }
    }
    return getInsertProductCtntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getUpdateProductDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProductDetail",
      requestType = kyobobook.grpc.product.ProductRequest.class,
      responseType = kyobobook.grpc.sample.ResponseResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getUpdateProductDetailMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult> getUpdateProductDetailMethod;
    if ((getUpdateProductDetailMethod = ProductGrpc.getUpdateProductDetailMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getUpdateProductDetailMethod = ProductGrpc.getUpdateProductDetailMethod) == null) {
          ProductGrpc.getUpdateProductDetailMethod = getUpdateProductDetailMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProductDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.product.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.ResponseResult.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("UpdateProductDetail"))
              .build();
        }
      }
    }
    return getUpdateProductDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getDeleteProductDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProductDetail",
      requestType = kyobobook.grpc.product.ProductRequest.class,
      responseType = kyobobook.grpc.sample.ResponseResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest,
      kyobobook.grpc.sample.ResponseResult> getDeleteProductDetailMethod() {
    io.grpc.MethodDescriptor<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult> getDeleteProductDetailMethod;
    if ((getDeleteProductDetailMethod = ProductGrpc.getDeleteProductDetailMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getDeleteProductDetailMethod = ProductGrpc.getDeleteProductDetailMethod) == null) {
          ProductGrpc.getDeleteProductDetailMethod = getDeleteProductDetailMethod =
              io.grpc.MethodDescriptor.<kyobobook.grpc.product.ProductRequest, kyobobook.grpc.sample.ResponseResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProductDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.product.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyobobook.grpc.sample.ResponseResult.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("DeleteProductDetail"))
              .build();
        }
      }
    }
    return getDeleteProductDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductStub>() {
        @java.lang.Override
        public ProductStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductStub(channel, callOptions);
        }
      };
    return ProductStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductBlockingStub>() {
        @java.lang.Override
        public ProductBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductBlockingStub(channel, callOptions);
        }
      };
    return ProductBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductFutureStub>() {
        @java.lang.Override
        public ProductFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductFutureStub(channel, callOptions);
        }
      };
    return ProductFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductDetail(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductDetailMethod(), responseObserver);
    }

    /**
     */
    public void insertProductBkrv(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertProductBkrvMethod(), responseObserver);
    }

    /**
     */
    public void insertProductCtnt(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertProductCtntMethod(), responseObserver);
    }

    /**
     */
    public void updateProductDetail(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductDetailMethod(), responseObserver);
    }

    /**
     */
    public void deleteProductDetail(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductDetailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.product.ProductRequest,
                kyobobook.grpc.product.ProductResponse>(
                  this, METHODID_GET_PRODUCT_DETAIL)))
          .addMethod(
            getInsertProductBkrvMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.product.ProductRequest,
                kyobobook.grpc.sample.ResponseResult>(
                  this, METHODID_INSERT_PRODUCT_BKRV)))
          .addMethod(
            getInsertProductCtntMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.product.ProductRequest,
                kyobobook.grpc.sample.ResponseResult>(
                  this, METHODID_INSERT_PRODUCT_CTNT)))
          .addMethod(
            getUpdateProductDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.product.ProductRequest,
                kyobobook.grpc.sample.ResponseResult>(
                  this, METHODID_UPDATE_PRODUCT_DETAIL)))
          .addMethod(
            getDeleteProductDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                kyobobook.grpc.product.ProductRequest,
                kyobobook.grpc.sample.ResponseResult>(
                  this, METHODID_DELETE_PRODUCT_DETAIL)))
          .build();
    }
  }

  /**
   */
  public static final class ProductStub extends io.grpc.stub.AbstractAsyncStub<ProductStub> {
    private ProductStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductStub(channel, callOptions);
    }

    /**
     */
    public void getProductDetail(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertProductBkrv(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertProductBkrvMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertProductCtnt(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertProductCtntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProductDetail(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProductDetail(kyobobook.grpc.product.ProductRequest request,
        io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductBlockingStub> {
    private ProductBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductBlockingStub(channel, callOptions);
    }

    /**
     */
    public kyobobook.grpc.product.ProductResponse getProductDetail(kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.ResponseResult insertProductBkrv(kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertProductBkrvMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.ResponseResult insertProductCtnt(kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertProductCtntMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.ResponseResult updateProductDetail(kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public kyobobook.grpc.sample.ResponseResult deleteProductDetail(kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductFutureStub extends io.grpc.stub.AbstractFutureStub<ProductFutureStub> {
    private ProductFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.product.ProductResponse> getProductDetail(
        kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.ResponseResult> insertProductBkrv(
        kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertProductBkrvMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.ResponseResult> insertProductCtnt(
        kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertProductCtntMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.ResponseResult> updateProductDetail(
        kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kyobobook.grpc.sample.ResponseResult> deleteProductDetail(
        kyobobook.grpc.product.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_DETAIL = 0;
  private static final int METHODID_INSERT_PRODUCT_BKRV = 1;
  private static final int METHODID_INSERT_PRODUCT_CTNT = 2;
  private static final int METHODID_UPDATE_PRODUCT_DETAIL = 3;
  private static final int METHODID_DELETE_PRODUCT_DETAIL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_DETAIL:
          serviceImpl.getProductDetail((kyobobook.grpc.product.ProductRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.product.ProductResponse>) responseObserver);
          break;
        case METHODID_INSERT_PRODUCT_BKRV:
          serviceImpl.insertProductBkrv((kyobobook.grpc.product.ProductRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult>) responseObserver);
          break;
        case METHODID_INSERT_PRODUCT_CTNT:
          serviceImpl.insertProductCtnt((kyobobook.grpc.product.ProductRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT_DETAIL:
          serviceImpl.updateProductDetail((kyobobook.grpc.product.ProductRequest) request,
              (io.grpc.stub.StreamObserver<kyobobook.grpc.sample.ResponseResult>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT_DETAIL:
          serviceImpl.deleteProductDetail((kyobobook.grpc.product.ProductRequest) request,
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

  private static abstract class ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyobobook.grpc.product.ProductProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Product");
    }
  }

  private static final class ProductFileDescriptorSupplier
      extends ProductBaseDescriptorSupplier {
    ProductFileDescriptorSupplier() {}
  }

  private static final class ProductMethodDescriptorSupplier
      extends ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductFileDescriptorSupplier())
              .addMethod(getGetProductDetailMethod())
              .addMethod(getInsertProductBkrvMethod())
              .addMethod(getInsertProductCtntMethod())
              .addMethod(getUpdateProductDetailMethod())
              .addMethod(getDeleteProductDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}

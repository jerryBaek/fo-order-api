// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package kyobobook.grpc.product;

/**
 * Protobuf type {@code ProductResponse}
 */
public  final class ProductResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProductResponse)
    ProductResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductResponse.newBuilder() to construct.
  private ProductResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            kyobobook.grpc.product.ProductFieldEntry.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(kyobobook.grpc.product.ProductFieldEntry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            kyobobook.grpc.sample.ResponseResult.Builder subBuilder = null;
            if (responseResult_ != null) {
              subBuilder = responseResult_.toBuilder();
            }
            responseResult_ = input.readMessage(kyobobook.grpc.sample.ResponseResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(responseResult_);
              responseResult_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kyobobook.grpc.product.ProductProto.internal_static_ProductResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kyobobook.grpc.product.ProductProto.internal_static_ProductResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kyobobook.grpc.product.ProductResponse.class, kyobobook.grpc.product.ProductResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private kyobobook.grpc.product.ProductFieldEntry result_;
  /**
   * <code>.ProductFieldEntry result = 1;</code>
   */
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.ProductFieldEntry result = 1;</code>
   */
  public kyobobook.grpc.product.ProductFieldEntry getResult() {
    return result_ == null ? kyobobook.grpc.product.ProductFieldEntry.getDefaultInstance() : result_;
  }
  /**
   * <code>.ProductFieldEntry result = 1;</code>
   */
  public kyobobook.grpc.product.ProductFieldEntryOrBuilder getResultOrBuilder() {
    return getResult();
  }

  public static final int RESPONSERESULT_FIELD_NUMBER = 2;
  private kyobobook.grpc.sample.ResponseResult responseResult_;
  /**
   * <code>.ResponseResult responseResult = 2;</code>
   */
  public boolean hasResponseResult() {
    return responseResult_ != null;
  }
  /**
   * <code>.ResponseResult responseResult = 2;</code>
   */
  public kyobobook.grpc.sample.ResponseResult getResponseResult() {
    return responseResult_ == null ? kyobobook.grpc.sample.ResponseResult.getDefaultInstance() : responseResult_;
  }
  /**
   * <code>.ResponseResult responseResult = 2;</code>
   */
  public kyobobook.grpc.sample.ResponseResultOrBuilder getResponseResultOrBuilder() {
    return getResponseResult();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    if (responseResult_ != null) {
      output.writeMessage(2, getResponseResult());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
    }
    if (responseResult_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResponseResult());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof kyobobook.grpc.product.ProductResponse)) {
      return super.equals(obj);
    }
    kyobobook.grpc.product.ProductResponse other = (kyobobook.grpc.product.ProductResponse) obj;

    boolean result = true;
    result = result && (hasResult() == other.hasResult());
    if (hasResult()) {
      result = result && getResult()
          .equals(other.getResult());
    }
    result = result && (hasResponseResult() == other.hasResponseResult());
    if (hasResponseResult()) {
      result = result && getResponseResult()
          .equals(other.getResponseResult());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    if (hasResponseResult()) {
      hash = (37 * hash) + RESPONSERESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResponseResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kyobobook.grpc.product.ProductResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kyobobook.grpc.product.ProductResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kyobobook.grpc.product.ProductResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kyobobook.grpc.product.ProductResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kyobobook.grpc.product.ProductResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ProductResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProductResponse)
      kyobobook.grpc.product.ProductResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kyobobook.grpc.product.ProductProto.internal_static_ProductResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kyobobook.grpc.product.ProductProto.internal_static_ProductResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kyobobook.grpc.product.ProductResponse.class, kyobobook.grpc.product.ProductResponse.Builder.class);
    }

    // Construct using kyobobook.grpc.product.ProductResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      if (responseResultBuilder_ == null) {
        responseResult_ = null;
      } else {
        responseResult_ = null;
        responseResultBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kyobobook.grpc.product.ProductProto.internal_static_ProductResponse_descriptor;
    }

    public kyobobook.grpc.product.ProductResponse getDefaultInstanceForType() {
      return kyobobook.grpc.product.ProductResponse.getDefaultInstance();
    }

    public kyobobook.grpc.product.ProductResponse build() {
      kyobobook.grpc.product.ProductResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kyobobook.grpc.product.ProductResponse buildPartial() {
      kyobobook.grpc.product.ProductResponse result = new kyobobook.grpc.product.ProductResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (responseResultBuilder_ == null) {
        result.responseResult_ = responseResult_;
      } else {
        result.responseResult_ = responseResultBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kyobobook.grpc.product.ProductResponse) {
        return mergeFrom((kyobobook.grpc.product.ProductResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kyobobook.grpc.product.ProductResponse other) {
      if (other == kyobobook.grpc.product.ProductResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.hasResponseResult()) {
        mergeResponseResult(other.getResponseResult());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      kyobobook.grpc.product.ProductResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kyobobook.grpc.product.ProductResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private kyobobook.grpc.product.ProductFieldEntry result_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kyobobook.grpc.product.ProductFieldEntry, kyobobook.grpc.product.ProductFieldEntry.Builder, kyobobook.grpc.product.ProductFieldEntryOrBuilder> resultBuilder_;
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public kyobobook.grpc.product.ProductFieldEntry getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? kyobobook.grpc.product.ProductFieldEntry.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public Builder setResult(kyobobook.grpc.product.ProductFieldEntry value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public Builder setResult(
        kyobobook.grpc.product.ProductFieldEntry.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public Builder mergeResult(kyobobook.grpc.product.ProductFieldEntry value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            kyobobook.grpc.product.ProductFieldEntry.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public kyobobook.grpc.product.ProductFieldEntry.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    public kyobobook.grpc.product.ProductFieldEntryOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            kyobobook.grpc.product.ProductFieldEntry.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.ProductFieldEntry result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kyobobook.grpc.product.ProductFieldEntry, kyobobook.grpc.product.ProductFieldEntry.Builder, kyobobook.grpc.product.ProductFieldEntryOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kyobobook.grpc.product.ProductFieldEntry, kyobobook.grpc.product.ProductFieldEntry.Builder, kyobobook.grpc.product.ProductFieldEntryOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private kyobobook.grpc.sample.ResponseResult responseResult_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kyobobook.grpc.sample.ResponseResult, kyobobook.grpc.sample.ResponseResult.Builder, kyobobook.grpc.sample.ResponseResultOrBuilder> responseResultBuilder_;
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public boolean hasResponseResult() {
      return responseResultBuilder_ != null || responseResult_ != null;
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public kyobobook.grpc.sample.ResponseResult getResponseResult() {
      if (responseResultBuilder_ == null) {
        return responseResult_ == null ? kyobobook.grpc.sample.ResponseResult.getDefaultInstance() : responseResult_;
      } else {
        return responseResultBuilder_.getMessage();
      }
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public Builder setResponseResult(kyobobook.grpc.sample.ResponseResult value) {
      if (responseResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseResult_ = value;
        onChanged();
      } else {
        responseResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public Builder setResponseResult(
        kyobobook.grpc.sample.ResponseResult.Builder builderForValue) {
      if (responseResultBuilder_ == null) {
        responseResult_ = builderForValue.build();
        onChanged();
      } else {
        responseResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public Builder mergeResponseResult(kyobobook.grpc.sample.ResponseResult value) {
      if (responseResultBuilder_ == null) {
        if (responseResult_ != null) {
          responseResult_ =
            kyobobook.grpc.sample.ResponseResult.newBuilder(responseResult_).mergeFrom(value).buildPartial();
        } else {
          responseResult_ = value;
        }
        onChanged();
      } else {
        responseResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public Builder clearResponseResult() {
      if (responseResultBuilder_ == null) {
        responseResult_ = null;
        onChanged();
      } else {
        responseResult_ = null;
        responseResultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public kyobobook.grpc.sample.ResponseResult.Builder getResponseResultBuilder() {
      
      onChanged();
      return getResponseResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    public kyobobook.grpc.sample.ResponseResultOrBuilder getResponseResultOrBuilder() {
      if (responseResultBuilder_ != null) {
        return responseResultBuilder_.getMessageOrBuilder();
      } else {
        return responseResult_ == null ?
            kyobobook.grpc.sample.ResponseResult.getDefaultInstance() : responseResult_;
      }
    }
    /**
     * <code>.ResponseResult responseResult = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kyobobook.grpc.sample.ResponseResult, kyobobook.grpc.sample.ResponseResult.Builder, kyobobook.grpc.sample.ResponseResultOrBuilder> 
        getResponseResultFieldBuilder() {
      if (responseResultBuilder_ == null) {
        responseResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kyobobook.grpc.sample.ResponseResult, kyobobook.grpc.sample.ResponseResult.Builder, kyobobook.grpc.sample.ResponseResultOrBuilder>(
                getResponseResult(),
                getParentForChildren(),
                isClean());
        responseResult_ = null;
      }
      return responseResultBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ProductResponse)
  }

  // @@protoc_insertion_point(class_scope:ProductResponse)
  private static final kyobobook.grpc.product.ProductResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kyobobook.grpc.product.ProductResponse();
  }

  public static kyobobook.grpc.product.ProductResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductResponse>
      PARSER = new com.google.protobuf.AbstractParser<ProductResponse>() {
    public ProductResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductResponse> getParserForType() {
    return PARSER;
  }

  public kyobobook.grpc.product.ProductResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

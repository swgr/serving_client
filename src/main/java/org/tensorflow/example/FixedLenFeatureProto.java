// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example_parser_configuration.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.FixedLenFeatureProto}
 */
public  final class FixedLenFeatureProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.FixedLenFeatureProto)
    FixedLenFeatureProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FixedLenFeatureProto.newBuilder() to construct.
  private FixedLenFeatureProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FixedLenFeatureProto() {
    dtype_ = 0;
    valuesOutputTensorName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FixedLenFeatureProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          case 8: {
            int rawValue = input.readEnum();

            dtype_ = rawValue;
            break;
          }
          case 18: {
            org.tensorflow.framework.TensorShapeProto.Builder subBuilder = null;
            if (shape_ != null) {
              subBuilder = shape_.toBuilder();
            }
            shape_ = input.readMessage(org.tensorflow.framework.TensorShapeProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(shape_);
              shape_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            org.tensorflow.framework.TensorProto.Builder subBuilder = null;
            if (defaultValue_ != null) {
              subBuilder = defaultValue_.toBuilder();
            }
            defaultValue_ = input.readMessage(org.tensorflow.framework.TensorProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(defaultValue_);
              defaultValue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            valuesOutputTensorName_ = s;
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
    return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.FixedLenFeatureProto.class, org.tensorflow.example.FixedLenFeatureProto.Builder.class);
  }

  public static final int DTYPE_FIELD_NUMBER = 1;
  private int dtype_;
  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   */
  public int getDtypeValue() {
    return dtype_;
  }
  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   */
  public org.tensorflow.framework.DataType getDtype() {
    org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.valueOf(dtype_);
    return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
  }

  public static final int SHAPE_FIELD_NUMBER = 2;
  private org.tensorflow.framework.TensorShapeProto shape_;
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  public boolean hasShape() {
    return shape_ != null;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  public org.tensorflow.framework.TensorShapeProto getShape() {
    return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
    return getShape();
  }

  public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
  private org.tensorflow.framework.TensorProto defaultValue_;
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   */
  public boolean hasDefaultValue() {
    return defaultValue_ != null;
  }
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   */
  public org.tensorflow.framework.TensorProto getDefaultValue() {
    return defaultValue_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : defaultValue_;
  }
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   */
  public org.tensorflow.framework.TensorProtoOrBuilder getDefaultValueOrBuilder() {
    return getDefaultValue();
  }

  public static final int VALUES_OUTPUT_TENSOR_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object valuesOutputTensorName_;
  /**
   * <code>string values_output_tensor_name = 4;</code>
   */
  public java.lang.String getValuesOutputTensorName() {
    java.lang.Object ref = valuesOutputTensorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valuesOutputTensorName_ = s;
      return s;
    }
  }
  /**
   * <code>string values_output_tensor_name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getValuesOutputTensorNameBytes() {
    java.lang.Object ref = valuesOutputTensorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valuesOutputTensorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      output.writeEnum(1, dtype_);
    }
    if (shape_ != null) {
      output.writeMessage(2, getShape());
    }
    if (defaultValue_ != null) {
      output.writeMessage(3, getDefaultValue());
    }
    if (!getValuesOutputTensorNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, valuesOutputTensorName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dtype_);
    }
    if (shape_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShape());
    }
    if (defaultValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDefaultValue());
    }
    if (!getValuesOutputTensorNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, valuesOutputTensorName_);
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
    if (!(obj instanceof org.tensorflow.example.FixedLenFeatureProto)) {
      return super.equals(obj);
    }
    org.tensorflow.example.FixedLenFeatureProto other = (org.tensorflow.example.FixedLenFeatureProto) obj;

    boolean result = true;
    result = result && dtype_ == other.dtype_;
    result = result && (hasShape() == other.hasShape());
    if (hasShape()) {
      result = result && getShape()
          .equals(other.getShape());
    }
    result = result && (hasDefaultValue() == other.hasDefaultValue());
    if (hasDefaultValue()) {
      result = result && getDefaultValue()
          .equals(other.getDefaultValue());
    }
    result = result && getValuesOutputTensorName()
        .equals(other.getValuesOutputTensorName());
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
    hash = (37 * hash) + DTYPE_FIELD_NUMBER;
    hash = (53 * hash) + dtype_;
    if (hasShape()) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShape().hashCode();
    }
    if (hasDefaultValue()) {
      hash = (37 * hash) + DEFAULT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultValue().hashCode();
    }
    hash = (37 * hash) + VALUES_OUTPUT_TENSOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getValuesOutputTensorName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FixedLenFeatureProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.FixedLenFeatureProto prototype) {
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
   * Protobuf type {@code tensorflow.FixedLenFeatureProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.FixedLenFeatureProto)
      org.tensorflow.example.FixedLenFeatureProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.FixedLenFeatureProto.class, org.tensorflow.example.FixedLenFeatureProto.Builder.class);
    }

    // Construct using org.tensorflow.example.FixedLenFeatureProto.newBuilder()
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
      dtype_ = 0;

      if (shapeBuilder_ == null) {
        shape_ = null;
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }
      valuesOutputTensorName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
    }

    public org.tensorflow.example.FixedLenFeatureProto getDefaultInstanceForType() {
      return org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
    }

    public org.tensorflow.example.FixedLenFeatureProto build() {
      org.tensorflow.example.FixedLenFeatureProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.example.FixedLenFeatureProto buildPartial() {
      org.tensorflow.example.FixedLenFeatureProto result = new org.tensorflow.example.FixedLenFeatureProto(this);
      result.dtype_ = dtype_;
      if (shapeBuilder_ == null) {
        result.shape_ = shape_;
      } else {
        result.shape_ = shapeBuilder_.build();
      }
      if (defaultValueBuilder_ == null) {
        result.defaultValue_ = defaultValue_;
      } else {
        result.defaultValue_ = defaultValueBuilder_.build();
      }
      result.valuesOutputTensorName_ = valuesOutputTensorName_;
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
      if (other instanceof org.tensorflow.example.FixedLenFeatureProto) {
        return mergeFrom((org.tensorflow.example.FixedLenFeatureProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.FixedLenFeatureProto other) {
      if (other == org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance()) return this;
      if (other.dtype_ != 0) {
        setDtypeValue(other.getDtypeValue());
      }
      if (other.hasShape()) {
        mergeShape(other.getShape());
      }
      if (other.hasDefaultValue()) {
        mergeDefaultValue(other.getDefaultValue());
      }
      if (!other.getValuesOutputTensorName().isEmpty()) {
        valuesOutputTensorName_ = other.valuesOutputTensorName_;
        onChanged();
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
      org.tensorflow.example.FixedLenFeatureProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.example.FixedLenFeatureProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dtype_ = 0;
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     */
    public int getDtypeValue() {
      return dtype_;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     */
    public Builder setDtypeValue(int value) {
      dtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     */
    public org.tensorflow.framework.DataType getDtype() {
      org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.valueOf(dtype_);
      return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     */
    public Builder setDtype(org.tensorflow.framework.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     */
    public Builder clearDtype() {
      
      dtype_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.TensorShapeProto shape_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> shapeBuilder_;
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public boolean hasShape() {
      return shapeBuilder_ != null || shape_ != null;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProto getShape() {
      if (shapeBuilder_ == null) {
        return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      } else {
        return shapeBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shape_ = value;
        onChanged();
      } else {
        shapeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(
        org.tensorflow.framework.TensorShapeProto.Builder builderForValue) {
      if (shapeBuilder_ == null) {
        shape_ = builderForValue.build();
        onChanged();
      } else {
        shapeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder mergeShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (shape_ != null) {
          shape_ =
            org.tensorflow.framework.TensorShapeProto.newBuilder(shape_).mergeFrom(value).buildPartial();
        } else {
          shape_ = value;
        }
        onChanged();
      } else {
        shapeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder clearShape() {
      if (shapeBuilder_ == null) {
        shape_ = null;
        onChanged();
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProto.Builder getShapeBuilder() {
      
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
      if (shapeBuilder_ != null) {
        return shapeBuilder_.getMessageOrBuilder();
      } else {
        return shape_ == null ?
            org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> 
        getShapeFieldBuilder() {
      if (shapeBuilder_ == null) {
        shapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder>(
                getShape(),
                getParentForChildren(),
                isClean());
        shape_ = null;
      }
      return shapeBuilder_;
    }

    private org.tensorflow.framework.TensorProto defaultValue_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> defaultValueBuilder_;
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public boolean hasDefaultValue() {
      return defaultValueBuilder_ != null || defaultValue_ != null;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public org.tensorflow.framework.TensorProto getDefaultValue() {
      if (defaultValueBuilder_ == null) {
        return defaultValue_ == null ? org.tensorflow.framework.TensorProto.getDefaultInstance() : defaultValue_;
      } else {
        return defaultValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder setDefaultValue(org.tensorflow.framework.TensorProto value) {
      if (defaultValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultValue_ = value;
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder setDefaultValue(
        org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = builderForValue.build();
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder mergeDefaultValue(org.tensorflow.framework.TensorProto value) {
      if (defaultValueBuilder_ == null) {
        if (defaultValue_ != null) {
          defaultValue_ =
            org.tensorflow.framework.TensorProto.newBuilder(defaultValue_).mergeFrom(value).buildPartial();
        } else {
          defaultValue_ = value;
        }
        onChanged();
      } else {
        defaultValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder clearDefaultValue() {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
        onChanged();
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder getDefaultValueBuilder() {
      
      onChanged();
      return getDefaultValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public org.tensorflow.framework.TensorProtoOrBuilder getDefaultValueOrBuilder() {
      if (defaultValueBuilder_ != null) {
        return defaultValueBuilder_.getMessageOrBuilder();
      } else {
        return defaultValue_ == null ?
            org.tensorflow.framework.TensorProto.getDefaultInstance() : defaultValue_;
      }
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> 
        getDefaultValueFieldBuilder() {
      if (defaultValueBuilder_ == null) {
        defaultValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder>(
                getDefaultValue(),
                getParentForChildren(),
                isClean());
        defaultValue_ = null;
      }
      return defaultValueBuilder_;
    }

    private java.lang.Object valuesOutputTensorName_ = "";
    /**
     * <code>string values_output_tensor_name = 4;</code>
     */
    public java.lang.String getValuesOutputTensorName() {
      java.lang.Object ref = valuesOutputTensorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valuesOutputTensorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getValuesOutputTensorNameBytes() {
      java.lang.Object ref = valuesOutputTensorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valuesOutputTensorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     */
    public Builder setValuesOutputTensorName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valuesOutputTensorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     */
    public Builder clearValuesOutputTensorName() {
      
      valuesOutputTensorName_ = getDefaultInstance().getValuesOutputTensorName();
      onChanged();
      return this;
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     */
    public Builder setValuesOutputTensorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valuesOutputTensorName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.FixedLenFeatureProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.FixedLenFeatureProto)
  private static final org.tensorflow.example.FixedLenFeatureProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.FixedLenFeatureProto();
  }

  public static org.tensorflow.example.FixedLenFeatureProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FixedLenFeatureProto>
      PARSER = new com.google.protobuf.AbstractParser<FixedLenFeatureProto>() {
    public FixedLenFeatureProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FixedLenFeatureProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FixedLenFeatureProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FixedLenFeatureProto> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.example.FixedLenFeatureProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


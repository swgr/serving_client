// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.ListDevicesResponse}
 */
public  final class ListDevicesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ListDevicesResponse)
    ListDevicesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDevicesResponse.newBuilder() to construct.
  private ListDevicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDevicesResponse() {
    localDevice_ = java.util.Collections.emptyList();
    remoteDevice_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDevicesResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              localDevice_ = new java.util.ArrayList<org.tensorflow.framework.DeviceAttributes>();
              mutable_bitField0_ |= 0x00000001;
            }
            localDevice_.add(
                input.readMessage(org.tensorflow.framework.DeviceAttributes.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              remoteDevice_ = new java.util.ArrayList<org.tensorflow.framework.DeviceAttributes>();
              mutable_bitField0_ |= 0x00000002;
            }
            remoteDevice_.add(
                input.readMessage(org.tensorflow.framework.DeviceAttributes.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        localDevice_ = java.util.Collections.unmodifiableList(localDevice_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        remoteDevice_ = java.util.Collections.unmodifiableList(remoteDevice_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ListDevicesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ListDevicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.ListDevicesResponse.class, org.tensorflow.distruntime.ListDevicesResponse.Builder.class);
  }

  public static final int LOCAL_DEVICE_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.framework.DeviceAttributes> localDevice_;
  /**
   * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
   */
  public java.util.List<org.tensorflow.framework.DeviceAttributes> getLocalDeviceList() {
    return localDevice_;
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.DeviceAttributesOrBuilder> 
      getLocalDeviceOrBuilderList() {
    return localDevice_;
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
   */
  public int getLocalDeviceCount() {
    return localDevice_.size();
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
   */
  public org.tensorflow.framework.DeviceAttributes getLocalDevice(int index) {
    return localDevice_.get(index);
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
   */
  public org.tensorflow.framework.DeviceAttributesOrBuilder getLocalDeviceOrBuilder(
      int index) {
    return localDevice_.get(index);
  }

  public static final int REMOTE_DEVICE_FIELD_NUMBER = 2;
  private java.util.List<org.tensorflow.framework.DeviceAttributes> remoteDevice_;
  /**
   * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
   */
  public java.util.List<org.tensorflow.framework.DeviceAttributes> getRemoteDeviceList() {
    return remoteDevice_;
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.DeviceAttributesOrBuilder> 
      getRemoteDeviceOrBuilderList() {
    return remoteDevice_;
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
   */
  public int getRemoteDeviceCount() {
    return remoteDevice_.size();
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
   */
  public org.tensorflow.framework.DeviceAttributes getRemoteDevice(int index) {
    return remoteDevice_.get(index);
  }
  /**
   * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
   */
  public org.tensorflow.framework.DeviceAttributesOrBuilder getRemoteDeviceOrBuilder(
      int index) {
    return remoteDevice_.get(index);
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
    for (int i = 0; i < localDevice_.size(); i++) {
      output.writeMessage(1, localDevice_.get(i));
    }
    for (int i = 0; i < remoteDevice_.size(); i++) {
      output.writeMessage(2, remoteDevice_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < localDevice_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, localDevice_.get(i));
    }
    for (int i = 0; i < remoteDevice_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, remoteDevice_.get(i));
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
    if (!(obj instanceof org.tensorflow.distruntime.ListDevicesResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.ListDevicesResponse other = (org.tensorflow.distruntime.ListDevicesResponse) obj;

    boolean result = true;
    result = result && getLocalDeviceList()
        .equals(other.getLocalDeviceList());
    result = result && getRemoteDeviceList()
        .equals(other.getRemoteDeviceList());
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
    if (getLocalDeviceCount() > 0) {
      hash = (37 * hash) + LOCAL_DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getLocalDeviceList().hashCode();
    }
    if (getRemoteDeviceCount() > 0) {
      hash = (37 * hash) + REMOTE_DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getRemoteDeviceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ListDevicesResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.ListDevicesResponse prototype) {
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
   * Protobuf type {@code tensorflow.ListDevicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ListDevicesResponse)
      org.tensorflow.distruntime.ListDevicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ListDevicesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ListDevicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.ListDevicesResponse.class, org.tensorflow.distruntime.ListDevicesResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.ListDevicesResponse.newBuilder()
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
        getLocalDeviceFieldBuilder();
        getRemoteDeviceFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (localDeviceBuilder_ == null) {
        localDevice_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        localDeviceBuilder_.clear();
      }
      if (remoteDeviceBuilder_ == null) {
        remoteDevice_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        remoteDeviceBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ListDevicesResponse_descriptor;
    }

    public org.tensorflow.distruntime.ListDevicesResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.ListDevicesResponse.getDefaultInstance();
    }

    public org.tensorflow.distruntime.ListDevicesResponse build() {
      org.tensorflow.distruntime.ListDevicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.distruntime.ListDevicesResponse buildPartial() {
      org.tensorflow.distruntime.ListDevicesResponse result = new org.tensorflow.distruntime.ListDevicesResponse(this);
      int from_bitField0_ = bitField0_;
      if (localDeviceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          localDevice_ = java.util.Collections.unmodifiableList(localDevice_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.localDevice_ = localDevice_;
      } else {
        result.localDevice_ = localDeviceBuilder_.build();
      }
      if (remoteDeviceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          remoteDevice_ = java.util.Collections.unmodifiableList(remoteDevice_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.remoteDevice_ = remoteDevice_;
      } else {
        result.remoteDevice_ = remoteDeviceBuilder_.build();
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
      if (other instanceof org.tensorflow.distruntime.ListDevicesResponse) {
        return mergeFrom((org.tensorflow.distruntime.ListDevicesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.ListDevicesResponse other) {
      if (other == org.tensorflow.distruntime.ListDevicesResponse.getDefaultInstance()) return this;
      if (localDeviceBuilder_ == null) {
        if (!other.localDevice_.isEmpty()) {
          if (localDevice_.isEmpty()) {
            localDevice_ = other.localDevice_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLocalDeviceIsMutable();
            localDevice_.addAll(other.localDevice_);
          }
          onChanged();
        }
      } else {
        if (!other.localDevice_.isEmpty()) {
          if (localDeviceBuilder_.isEmpty()) {
            localDeviceBuilder_.dispose();
            localDeviceBuilder_ = null;
            localDevice_ = other.localDevice_;
            bitField0_ = (bitField0_ & ~0x00000001);
            localDeviceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLocalDeviceFieldBuilder() : null;
          } else {
            localDeviceBuilder_.addAllMessages(other.localDevice_);
          }
        }
      }
      if (remoteDeviceBuilder_ == null) {
        if (!other.remoteDevice_.isEmpty()) {
          if (remoteDevice_.isEmpty()) {
            remoteDevice_ = other.remoteDevice_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRemoteDeviceIsMutable();
            remoteDevice_.addAll(other.remoteDevice_);
          }
          onChanged();
        }
      } else {
        if (!other.remoteDevice_.isEmpty()) {
          if (remoteDeviceBuilder_.isEmpty()) {
            remoteDeviceBuilder_.dispose();
            remoteDeviceBuilder_ = null;
            remoteDevice_ = other.remoteDevice_;
            bitField0_ = (bitField0_ & ~0x00000002);
            remoteDeviceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRemoteDeviceFieldBuilder() : null;
          } else {
            remoteDeviceBuilder_.addAllMessages(other.remoteDevice_);
          }
        }
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
      org.tensorflow.distruntime.ListDevicesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.ListDevicesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.framework.DeviceAttributes> localDevice_ =
      java.util.Collections.emptyList();
    private void ensureLocalDeviceIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        localDevice_ = new java.util.ArrayList<org.tensorflow.framework.DeviceAttributes>(localDevice_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DeviceAttributes, org.tensorflow.framework.DeviceAttributes.Builder, org.tensorflow.framework.DeviceAttributesOrBuilder> localDeviceBuilder_;

    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.DeviceAttributes> getLocalDeviceList() {
      if (localDeviceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(localDevice_);
      } else {
        return localDeviceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public int getLocalDeviceCount() {
      if (localDeviceBuilder_ == null) {
        return localDevice_.size();
      } else {
        return localDeviceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public org.tensorflow.framework.DeviceAttributes getLocalDevice(int index) {
      if (localDeviceBuilder_ == null) {
        return localDevice_.get(index);
      } else {
        return localDeviceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder setLocalDevice(
        int index, org.tensorflow.framework.DeviceAttributes value) {
      if (localDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocalDeviceIsMutable();
        localDevice_.set(index, value);
        onChanged();
      } else {
        localDeviceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder setLocalDevice(
        int index, org.tensorflow.framework.DeviceAttributes.Builder builderForValue) {
      if (localDeviceBuilder_ == null) {
        ensureLocalDeviceIsMutable();
        localDevice_.set(index, builderForValue.build());
        onChanged();
      } else {
        localDeviceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder addLocalDevice(org.tensorflow.framework.DeviceAttributes value) {
      if (localDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocalDeviceIsMutable();
        localDevice_.add(value);
        onChanged();
      } else {
        localDeviceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder addLocalDevice(
        int index, org.tensorflow.framework.DeviceAttributes value) {
      if (localDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocalDeviceIsMutable();
        localDevice_.add(index, value);
        onChanged();
      } else {
        localDeviceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder addLocalDevice(
        org.tensorflow.framework.DeviceAttributes.Builder builderForValue) {
      if (localDeviceBuilder_ == null) {
        ensureLocalDeviceIsMutable();
        localDevice_.add(builderForValue.build());
        onChanged();
      } else {
        localDeviceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder addLocalDevice(
        int index, org.tensorflow.framework.DeviceAttributes.Builder builderForValue) {
      if (localDeviceBuilder_ == null) {
        ensureLocalDeviceIsMutable();
        localDevice_.add(index, builderForValue.build());
        onChanged();
      } else {
        localDeviceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder addAllLocalDevice(
        java.lang.Iterable<? extends org.tensorflow.framework.DeviceAttributes> values) {
      if (localDeviceBuilder_ == null) {
        ensureLocalDeviceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, localDevice_);
        onChanged();
      } else {
        localDeviceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder clearLocalDevice() {
      if (localDeviceBuilder_ == null) {
        localDevice_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        localDeviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public Builder removeLocalDevice(int index) {
      if (localDeviceBuilder_ == null) {
        ensureLocalDeviceIsMutable();
        localDevice_.remove(index);
        onChanged();
      } else {
        localDeviceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public org.tensorflow.framework.DeviceAttributes.Builder getLocalDeviceBuilder(
        int index) {
      return getLocalDeviceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public org.tensorflow.framework.DeviceAttributesOrBuilder getLocalDeviceOrBuilder(
        int index) {
      if (localDeviceBuilder_ == null) {
        return localDevice_.get(index);  } else {
        return localDeviceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.DeviceAttributesOrBuilder> 
         getLocalDeviceOrBuilderList() {
      if (localDeviceBuilder_ != null) {
        return localDeviceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(localDevice_);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public org.tensorflow.framework.DeviceAttributes.Builder addLocalDeviceBuilder() {
      return getLocalDeviceFieldBuilder().addBuilder(
          org.tensorflow.framework.DeviceAttributes.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public org.tensorflow.framework.DeviceAttributes.Builder addLocalDeviceBuilder(
        int index) {
      return getLocalDeviceFieldBuilder().addBuilder(
          index, org.tensorflow.framework.DeviceAttributes.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes local_device = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.DeviceAttributes.Builder> 
         getLocalDeviceBuilderList() {
      return getLocalDeviceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DeviceAttributes, org.tensorflow.framework.DeviceAttributes.Builder, org.tensorflow.framework.DeviceAttributesOrBuilder> 
        getLocalDeviceFieldBuilder() {
      if (localDeviceBuilder_ == null) {
        localDeviceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.DeviceAttributes, org.tensorflow.framework.DeviceAttributes.Builder, org.tensorflow.framework.DeviceAttributesOrBuilder>(
                localDevice_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        localDevice_ = null;
      }
      return localDeviceBuilder_;
    }

    private java.util.List<org.tensorflow.framework.DeviceAttributes> remoteDevice_ =
      java.util.Collections.emptyList();
    private void ensureRemoteDeviceIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        remoteDevice_ = new java.util.ArrayList<org.tensorflow.framework.DeviceAttributes>(remoteDevice_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DeviceAttributes, org.tensorflow.framework.DeviceAttributes.Builder, org.tensorflow.framework.DeviceAttributesOrBuilder> remoteDeviceBuilder_;

    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public java.util.List<org.tensorflow.framework.DeviceAttributes> getRemoteDeviceList() {
      if (remoteDeviceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(remoteDevice_);
      } else {
        return remoteDeviceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public int getRemoteDeviceCount() {
      if (remoteDeviceBuilder_ == null) {
        return remoteDevice_.size();
      } else {
        return remoteDeviceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public org.tensorflow.framework.DeviceAttributes getRemoteDevice(int index) {
      if (remoteDeviceBuilder_ == null) {
        return remoteDevice_.get(index);
      } else {
        return remoteDeviceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder setRemoteDevice(
        int index, org.tensorflow.framework.DeviceAttributes value) {
      if (remoteDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemoteDeviceIsMutable();
        remoteDevice_.set(index, value);
        onChanged();
      } else {
        remoteDeviceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder setRemoteDevice(
        int index, org.tensorflow.framework.DeviceAttributes.Builder builderForValue) {
      if (remoteDeviceBuilder_ == null) {
        ensureRemoteDeviceIsMutable();
        remoteDevice_.set(index, builderForValue.build());
        onChanged();
      } else {
        remoteDeviceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder addRemoteDevice(org.tensorflow.framework.DeviceAttributes value) {
      if (remoteDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemoteDeviceIsMutable();
        remoteDevice_.add(value);
        onChanged();
      } else {
        remoteDeviceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder addRemoteDevice(
        int index, org.tensorflow.framework.DeviceAttributes value) {
      if (remoteDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemoteDeviceIsMutable();
        remoteDevice_.add(index, value);
        onChanged();
      } else {
        remoteDeviceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder addRemoteDevice(
        org.tensorflow.framework.DeviceAttributes.Builder builderForValue) {
      if (remoteDeviceBuilder_ == null) {
        ensureRemoteDeviceIsMutable();
        remoteDevice_.add(builderForValue.build());
        onChanged();
      } else {
        remoteDeviceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder addRemoteDevice(
        int index, org.tensorflow.framework.DeviceAttributes.Builder builderForValue) {
      if (remoteDeviceBuilder_ == null) {
        ensureRemoteDeviceIsMutable();
        remoteDevice_.add(index, builderForValue.build());
        onChanged();
      } else {
        remoteDeviceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder addAllRemoteDevice(
        java.lang.Iterable<? extends org.tensorflow.framework.DeviceAttributes> values) {
      if (remoteDeviceBuilder_ == null) {
        ensureRemoteDeviceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, remoteDevice_);
        onChanged();
      } else {
        remoteDeviceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder clearRemoteDevice() {
      if (remoteDeviceBuilder_ == null) {
        remoteDevice_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        remoteDeviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public Builder removeRemoteDevice(int index) {
      if (remoteDeviceBuilder_ == null) {
        ensureRemoteDeviceIsMutable();
        remoteDevice_.remove(index);
        onChanged();
      } else {
        remoteDeviceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public org.tensorflow.framework.DeviceAttributes.Builder getRemoteDeviceBuilder(
        int index) {
      return getRemoteDeviceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public org.tensorflow.framework.DeviceAttributesOrBuilder getRemoteDeviceOrBuilder(
        int index) {
      if (remoteDeviceBuilder_ == null) {
        return remoteDevice_.get(index);  } else {
        return remoteDeviceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.DeviceAttributesOrBuilder> 
         getRemoteDeviceOrBuilderList() {
      if (remoteDeviceBuilder_ != null) {
        return remoteDeviceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(remoteDevice_);
      }
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public org.tensorflow.framework.DeviceAttributes.Builder addRemoteDeviceBuilder() {
      return getRemoteDeviceFieldBuilder().addBuilder(
          org.tensorflow.framework.DeviceAttributes.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public org.tensorflow.framework.DeviceAttributes.Builder addRemoteDeviceBuilder(
        int index) {
      return getRemoteDeviceFieldBuilder().addBuilder(
          index, org.tensorflow.framework.DeviceAttributes.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.DeviceAttributes remote_device = 2;</code>
     */
    public java.util.List<org.tensorflow.framework.DeviceAttributes.Builder> 
         getRemoteDeviceBuilderList() {
      return getRemoteDeviceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DeviceAttributes, org.tensorflow.framework.DeviceAttributes.Builder, org.tensorflow.framework.DeviceAttributesOrBuilder> 
        getRemoteDeviceFieldBuilder() {
      if (remoteDeviceBuilder_ == null) {
        remoteDeviceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.DeviceAttributes, org.tensorflow.framework.DeviceAttributes.Builder, org.tensorflow.framework.DeviceAttributesOrBuilder>(
                remoteDevice_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        remoteDevice_ = null;
      }
      return remoteDeviceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.ListDevicesResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ListDevicesResponse)
  private static final org.tensorflow.distruntime.ListDevicesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.ListDevicesResponse();
  }

  public static org.tensorflow.distruntime.ListDevicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDevicesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDevicesResponse>() {
    public ListDevicesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListDevicesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDevicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDevicesResponse> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.distruntime.ListDevicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


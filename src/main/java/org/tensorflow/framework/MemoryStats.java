// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/step_stats.proto

package org.tensorflow.framework;

/**
 * <pre>
 * For memory tracking.
 * </pre>
 *
 * Protobuf type {@code tensorflow.MemoryStats}
 */
public  final class MemoryStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.MemoryStats)
    MemoryStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemoryStats.newBuilder() to construct.
  private MemoryStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemoryStats() {
    hostTempMemorySize_ = 0L;
    deviceTempMemorySize_ = 0L;
    hostPersistentMemorySize_ = 0L;
    devicePersistentMemorySize_ = 0L;
    hostPersistentTensorAllocIds_ = java.util.Collections.emptyList();
    devicePersistentTensorAllocIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemoryStats(
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

            hostTempMemorySize_ = input.readInt64();
            break;
          }
          case 16: {

            deviceTempMemorySize_ = input.readInt64();
            break;
          }
          case 24: {

            hostPersistentMemorySize_ = input.readInt64();
            break;
          }
          case 32: {

            devicePersistentMemorySize_ = input.readInt64();
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              hostPersistentTensorAllocIds_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000010;
            }
            hostPersistentTensorAllocIds_.add(input.readInt64());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010) && input.getBytesUntilLimit() > 0) {
              hostPersistentTensorAllocIds_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000010;
            }
            while (input.getBytesUntilLimit() > 0) {
              hostPersistentTensorAllocIds_.add(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 48: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              devicePersistentTensorAllocIds_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000020;
            }
            devicePersistentTensorAllocIds_.add(input.readInt64());
            break;
          }
          case 50: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
              devicePersistentTensorAllocIds_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000020;
            }
            while (input.getBytesUntilLimit() > 0) {
              devicePersistentTensorAllocIds_.add(input.readInt64());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        hostPersistentTensorAllocIds_ = java.util.Collections.unmodifiableList(hostPersistentTensorAllocIds_);
      }
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        devicePersistentTensorAllocIds_ = java.util.Collections.unmodifiableList(devicePersistentTensorAllocIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_MemoryStats_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_MemoryStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.MemoryStats.class, org.tensorflow.framework.MemoryStats.Builder.class);
  }

  private int bitField0_;
  public static final int HOST_TEMP_MEMORY_SIZE_FIELD_NUMBER = 1;
  private long hostTempMemorySize_;
  /**
   * <code>int64 host_temp_memory_size = 1;</code>
   */
  public long getHostTempMemorySize() {
    return hostTempMemorySize_;
  }

  public static final int DEVICE_TEMP_MEMORY_SIZE_FIELD_NUMBER = 2;
  private long deviceTempMemorySize_;
  /**
   * <code>int64 device_temp_memory_size = 2;</code>
   */
  public long getDeviceTempMemorySize() {
    return deviceTempMemorySize_;
  }

  public static final int HOST_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER = 3;
  private long hostPersistentMemorySize_;
  /**
   * <code>int64 host_persistent_memory_size = 3;</code>
   */
  public long getHostPersistentMemorySize() {
    return hostPersistentMemorySize_;
  }

  public static final int DEVICE_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER = 4;
  private long devicePersistentMemorySize_;
  /**
   * <code>int64 device_persistent_memory_size = 4;</code>
   */
  public long getDevicePersistentMemorySize() {
    return devicePersistentMemorySize_;
  }

  public static final int HOST_PERSISTENT_TENSOR_ALLOC_IDS_FIELD_NUMBER = 5;
  private java.util.List<java.lang.Long> hostPersistentTensorAllocIds_;
  /**
   * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
   */
  public java.util.List<java.lang.Long>
      getHostPersistentTensorAllocIdsList() {
    return hostPersistentTensorAllocIds_;
  }
  /**
   * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
   */
  public int getHostPersistentTensorAllocIdsCount() {
    return hostPersistentTensorAllocIds_.size();
  }
  /**
   * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
   */
  public long getHostPersistentTensorAllocIds(int index) {
    return hostPersistentTensorAllocIds_.get(index);
  }
  private int hostPersistentTensorAllocIdsMemoizedSerializedSize = -1;

  public static final int DEVICE_PERSISTENT_TENSOR_ALLOC_IDS_FIELD_NUMBER = 6;
  private java.util.List<java.lang.Long> devicePersistentTensorAllocIds_;
  /**
   * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
   */
  public java.util.List<java.lang.Long>
      getDevicePersistentTensorAllocIdsList() {
    return devicePersistentTensorAllocIds_;
  }
  /**
   * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
   */
  public int getDevicePersistentTensorAllocIdsCount() {
    return devicePersistentTensorAllocIds_.size();
  }
  /**
   * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
   */
  public long getDevicePersistentTensorAllocIds(int index) {
    return devicePersistentTensorAllocIds_.get(index);
  }
  private int devicePersistentTensorAllocIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (hostTempMemorySize_ != 0L) {
      output.writeInt64(1, hostTempMemorySize_);
    }
    if (deviceTempMemorySize_ != 0L) {
      output.writeInt64(2, deviceTempMemorySize_);
    }
    if (hostPersistentMemorySize_ != 0L) {
      output.writeInt64(3, hostPersistentMemorySize_);
    }
    if (devicePersistentMemorySize_ != 0L) {
      output.writeInt64(4, devicePersistentMemorySize_);
    }
    if (getHostPersistentTensorAllocIdsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(hostPersistentTensorAllocIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < hostPersistentTensorAllocIds_.size(); i++) {
      output.writeInt64NoTag(hostPersistentTensorAllocIds_.get(i));
    }
    if (getDevicePersistentTensorAllocIdsList().size() > 0) {
      output.writeUInt32NoTag(50);
      output.writeUInt32NoTag(devicePersistentTensorAllocIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < devicePersistentTensorAllocIds_.size(); i++) {
      output.writeInt64NoTag(devicePersistentTensorAllocIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hostTempMemorySize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, hostTempMemorySize_);
    }
    if (deviceTempMemorySize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, deviceTempMemorySize_);
    }
    if (hostPersistentMemorySize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, hostPersistentMemorySize_);
    }
    if (devicePersistentMemorySize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, devicePersistentMemorySize_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hostPersistentTensorAllocIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(hostPersistentTensorAllocIds_.get(i));
      }
      size += dataSize;
      if (!getHostPersistentTensorAllocIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      hostPersistentTensorAllocIdsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < devicePersistentTensorAllocIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(devicePersistentTensorAllocIds_.get(i));
      }
      size += dataSize;
      if (!getDevicePersistentTensorAllocIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      devicePersistentTensorAllocIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.framework.MemoryStats)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.MemoryStats other = (org.tensorflow.framework.MemoryStats) obj;

    boolean result = true;
    result = result && (getHostTempMemorySize()
        == other.getHostTempMemorySize());
    result = result && (getDeviceTempMemorySize()
        == other.getDeviceTempMemorySize());
    result = result && (getHostPersistentMemorySize()
        == other.getHostPersistentMemorySize());
    result = result && (getDevicePersistentMemorySize()
        == other.getDevicePersistentMemorySize());
    result = result && getHostPersistentTensorAllocIdsList()
        .equals(other.getHostPersistentTensorAllocIdsList());
    result = result && getDevicePersistentTensorAllocIdsList()
        .equals(other.getDevicePersistentTensorAllocIdsList());
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
    hash = (37 * hash) + HOST_TEMP_MEMORY_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHostTempMemorySize());
    hash = (37 * hash) + DEVICE_TEMP_MEMORY_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDeviceTempMemorySize());
    hash = (37 * hash) + HOST_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHostPersistentMemorySize());
    hash = (37 * hash) + DEVICE_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDevicePersistentMemorySize());
    if (getHostPersistentTensorAllocIdsCount() > 0) {
      hash = (37 * hash) + HOST_PERSISTENT_TENSOR_ALLOC_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getHostPersistentTensorAllocIdsList().hashCode();
    }
    if (getDevicePersistentTensorAllocIdsCount() > 0) {
      hash = (37 * hash) + DEVICE_PERSISTENT_TENSOR_ALLOC_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDevicePersistentTensorAllocIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.MemoryStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.MemoryStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.MemoryStats parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.MemoryStats prototype) {
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
   * <pre>
   * For memory tracking.
   * </pre>
   *
   * Protobuf type {@code tensorflow.MemoryStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.MemoryStats)
      org.tensorflow.framework.MemoryStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_MemoryStats_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_MemoryStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.MemoryStats.class, org.tensorflow.framework.MemoryStats.Builder.class);
    }

    // Construct using org.tensorflow.framework.MemoryStats.newBuilder()
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
      hostTempMemorySize_ = 0L;

      deviceTempMemorySize_ = 0L;

      hostPersistentMemorySize_ = 0L;

      devicePersistentMemorySize_ = 0L;

      hostPersistentTensorAllocIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000010);
      devicePersistentTensorAllocIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_MemoryStats_descriptor;
    }

    public org.tensorflow.framework.MemoryStats getDefaultInstanceForType() {
      return org.tensorflow.framework.MemoryStats.getDefaultInstance();
    }

    public org.tensorflow.framework.MemoryStats build() {
      org.tensorflow.framework.MemoryStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.MemoryStats buildPartial() {
      org.tensorflow.framework.MemoryStats result = new org.tensorflow.framework.MemoryStats(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.hostTempMemorySize_ = hostTempMemorySize_;
      result.deviceTempMemorySize_ = deviceTempMemorySize_;
      result.hostPersistentMemorySize_ = hostPersistentMemorySize_;
      result.devicePersistentMemorySize_ = devicePersistentMemorySize_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        hostPersistentTensorAllocIds_ = java.util.Collections.unmodifiableList(hostPersistentTensorAllocIds_);
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.hostPersistentTensorAllocIds_ = hostPersistentTensorAllocIds_;
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        devicePersistentTensorAllocIds_ = java.util.Collections.unmodifiableList(devicePersistentTensorAllocIds_);
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.devicePersistentTensorAllocIds_ = devicePersistentTensorAllocIds_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.tensorflow.framework.MemoryStats) {
        return mergeFrom((org.tensorflow.framework.MemoryStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.MemoryStats other) {
      if (other == org.tensorflow.framework.MemoryStats.getDefaultInstance()) return this;
      if (other.getHostTempMemorySize() != 0L) {
        setHostTempMemorySize(other.getHostTempMemorySize());
      }
      if (other.getDeviceTempMemorySize() != 0L) {
        setDeviceTempMemorySize(other.getDeviceTempMemorySize());
      }
      if (other.getHostPersistentMemorySize() != 0L) {
        setHostPersistentMemorySize(other.getHostPersistentMemorySize());
      }
      if (other.getDevicePersistentMemorySize() != 0L) {
        setDevicePersistentMemorySize(other.getDevicePersistentMemorySize());
      }
      if (!other.hostPersistentTensorAllocIds_.isEmpty()) {
        if (hostPersistentTensorAllocIds_.isEmpty()) {
          hostPersistentTensorAllocIds_ = other.hostPersistentTensorAllocIds_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureHostPersistentTensorAllocIdsIsMutable();
          hostPersistentTensorAllocIds_.addAll(other.hostPersistentTensorAllocIds_);
        }
        onChanged();
      }
      if (!other.devicePersistentTensorAllocIds_.isEmpty()) {
        if (devicePersistentTensorAllocIds_.isEmpty()) {
          devicePersistentTensorAllocIds_ = other.devicePersistentTensorAllocIds_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureDevicePersistentTensorAllocIdsIsMutable();
          devicePersistentTensorAllocIds_.addAll(other.devicePersistentTensorAllocIds_);
        }
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
      org.tensorflow.framework.MemoryStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.MemoryStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long hostTempMemorySize_ ;
    /**
     * <code>int64 host_temp_memory_size = 1;</code>
     */
    public long getHostTempMemorySize() {
      return hostTempMemorySize_;
    }
    /**
     * <code>int64 host_temp_memory_size = 1;</code>
     */
    public Builder setHostTempMemorySize(long value) {
      
      hostTempMemorySize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 host_temp_memory_size = 1;</code>
     */
    public Builder clearHostTempMemorySize() {
      
      hostTempMemorySize_ = 0L;
      onChanged();
      return this;
    }

    private long deviceTempMemorySize_ ;
    /**
     * <code>int64 device_temp_memory_size = 2;</code>
     */
    public long getDeviceTempMemorySize() {
      return deviceTempMemorySize_;
    }
    /**
     * <code>int64 device_temp_memory_size = 2;</code>
     */
    public Builder setDeviceTempMemorySize(long value) {
      
      deviceTempMemorySize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 device_temp_memory_size = 2;</code>
     */
    public Builder clearDeviceTempMemorySize() {
      
      deviceTempMemorySize_ = 0L;
      onChanged();
      return this;
    }

    private long hostPersistentMemorySize_ ;
    /**
     * <code>int64 host_persistent_memory_size = 3;</code>
     */
    public long getHostPersistentMemorySize() {
      return hostPersistentMemorySize_;
    }
    /**
     * <code>int64 host_persistent_memory_size = 3;</code>
     */
    public Builder setHostPersistentMemorySize(long value) {
      
      hostPersistentMemorySize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 host_persistent_memory_size = 3;</code>
     */
    public Builder clearHostPersistentMemorySize() {
      
      hostPersistentMemorySize_ = 0L;
      onChanged();
      return this;
    }

    private long devicePersistentMemorySize_ ;
    /**
     * <code>int64 device_persistent_memory_size = 4;</code>
     */
    public long getDevicePersistentMemorySize() {
      return devicePersistentMemorySize_;
    }
    /**
     * <code>int64 device_persistent_memory_size = 4;</code>
     */
    public Builder setDevicePersistentMemorySize(long value) {
      
      devicePersistentMemorySize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 device_persistent_memory_size = 4;</code>
     */
    public Builder clearDevicePersistentMemorySize() {
      
      devicePersistentMemorySize_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Long> hostPersistentTensorAllocIds_ = java.util.Collections.emptyList();
    private void ensureHostPersistentTensorAllocIdsIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        hostPersistentTensorAllocIds_ = new java.util.ArrayList<java.lang.Long>(hostPersistentTensorAllocIds_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
     */
    public java.util.List<java.lang.Long>
        getHostPersistentTensorAllocIdsList() {
      return java.util.Collections.unmodifiableList(hostPersistentTensorAllocIds_);
    }
    /**
     * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
     */
    public int getHostPersistentTensorAllocIdsCount() {
      return hostPersistentTensorAllocIds_.size();
    }
    /**
     * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
     */
    public long getHostPersistentTensorAllocIds(int index) {
      return hostPersistentTensorAllocIds_.get(index);
    }
    /**
     * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
     */
    public Builder setHostPersistentTensorAllocIds(
        int index, long value) {
      ensureHostPersistentTensorAllocIdsIsMutable();
      hostPersistentTensorAllocIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
     */
    public Builder addHostPersistentTensorAllocIds(long value) {
      ensureHostPersistentTensorAllocIdsIsMutable();
      hostPersistentTensorAllocIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
     */
    public Builder addAllHostPersistentTensorAllocIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureHostPersistentTensorAllocIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hostPersistentTensorAllocIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 host_persistent_tensor_alloc_ids = 5;</code>
     */
    public Builder clearHostPersistentTensorAllocIds() {
      hostPersistentTensorAllocIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Long> devicePersistentTensorAllocIds_ = java.util.Collections.emptyList();
    private void ensureDevicePersistentTensorAllocIdsIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        devicePersistentTensorAllocIds_ = new java.util.ArrayList<java.lang.Long>(devicePersistentTensorAllocIds_);
        bitField0_ |= 0x00000020;
       }
    }
    /**
     * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
     */
    public java.util.List<java.lang.Long>
        getDevicePersistentTensorAllocIdsList() {
      return java.util.Collections.unmodifiableList(devicePersistentTensorAllocIds_);
    }
    /**
     * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
     */
    public int getDevicePersistentTensorAllocIdsCount() {
      return devicePersistentTensorAllocIds_.size();
    }
    /**
     * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
     */
    public long getDevicePersistentTensorAllocIds(int index) {
      return devicePersistentTensorAllocIds_.get(index);
    }
    /**
     * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
     */
    public Builder setDevicePersistentTensorAllocIds(
        int index, long value) {
      ensureDevicePersistentTensorAllocIdsIsMutable();
      devicePersistentTensorAllocIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
     */
    public Builder addDevicePersistentTensorAllocIds(long value) {
      ensureDevicePersistentTensorAllocIdsIsMutable();
      devicePersistentTensorAllocIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
     */
    public Builder addAllDevicePersistentTensorAllocIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureDevicePersistentTensorAllocIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, devicePersistentTensorAllocIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 device_persistent_tensor_alloc_ids = 6;</code>
     */
    public Builder clearDevicePersistentTensorAllocIds() {
      devicePersistentTensorAllocIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.MemoryStats)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.MemoryStats)
  private static final org.tensorflow.framework.MemoryStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.MemoryStats();
  }

  public static org.tensorflow.framework.MemoryStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemoryStats>
      PARSER = new com.google.protobuf.AbstractParser<MemoryStats>() {
    public MemoryStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MemoryStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemoryStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemoryStats> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.MemoryStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


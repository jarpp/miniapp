// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jump.proto

package com.huya.ig.jump.protocol;

/**
 * <pre>
 * 游戏开始事件
 * </pre>
 *
 * Protobuf type {@code pb.GameStartNotice}
 */
public  final class GameStartNotice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.GameStartNotice)
    GameStartNoticeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameStartNotice.newBuilder() to construct.
  private GameStartNotice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameStartNotice() {
    gameDuration_ = 0;
    platforms_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GameStartNotice(
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
          case 8: {

            gameDuration_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              platforms_ = new java.util.ArrayList<com.huya.ig.jump.protocol.Platform>();
              mutable_bitField0_ |= 0x00000002;
            }
            platforms_.add(
                input.readMessage(com.huya.ig.jump.protocol.Platform.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        platforms_ = java.util.Collections.unmodifiableList(platforms_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameStartNotice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameStartNotice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.huya.ig.jump.protocol.GameStartNotice.class, com.huya.ig.jump.protocol.GameStartNotice.Builder.class);
  }

  private int bitField0_;
  public static final int GAMEDURATION_FIELD_NUMBER = 1;
  private int gameDuration_;
  /**
   * <pre>
   * 游戏时长，单位秒
   * </pre>
   *
   * <code>int32 gameDuration = 1;</code>
   */
  public int getGameDuration() {
    return gameDuration_;
  }

  public static final int PLATFORMS_FIELD_NUMBER = 2;
  private java.util.List<com.huya.ig.jump.protocol.Platform> platforms_;
  /**
   * <pre>
   *  站台
   * </pre>
   *
   * <code>repeated .pb.Platform platforms = 2;</code>
   */
  public java.util.List<com.huya.ig.jump.protocol.Platform> getPlatformsList() {
    return platforms_;
  }
  /**
   * <pre>
   *  站台
   * </pre>
   *
   * <code>repeated .pb.Platform platforms = 2;</code>
   */
  public java.util.List<? extends com.huya.ig.jump.protocol.PlatformOrBuilder> 
      getPlatformsOrBuilderList() {
    return platforms_;
  }
  /**
   * <pre>
   *  站台
   * </pre>
   *
   * <code>repeated .pb.Platform platforms = 2;</code>
   */
  public int getPlatformsCount() {
    return platforms_.size();
  }
  /**
   * <pre>
   *  站台
   * </pre>
   *
   * <code>repeated .pb.Platform platforms = 2;</code>
   */
  public com.huya.ig.jump.protocol.Platform getPlatforms(int index) {
    return platforms_.get(index);
  }
  /**
   * <pre>
   *  站台
   * </pre>
   *
   * <code>repeated .pb.Platform platforms = 2;</code>
   */
  public com.huya.ig.jump.protocol.PlatformOrBuilder getPlatformsOrBuilder(
      int index) {
    return platforms_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (gameDuration_ != 0) {
      output.writeInt32(1, gameDuration_);
    }
    for (int i = 0; i < platforms_.size(); i++) {
      output.writeMessage(2, platforms_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gameDuration_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, gameDuration_);
    }
    for (int i = 0; i < platforms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, platforms_.get(i));
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
    if (!(obj instanceof com.huya.ig.jump.protocol.GameStartNotice)) {
      return super.equals(obj);
    }
    com.huya.ig.jump.protocol.GameStartNotice other = (com.huya.ig.jump.protocol.GameStartNotice) obj;

    boolean result = true;
    result = result && (getGameDuration()
        == other.getGameDuration());
    result = result && getPlatformsList()
        .equals(other.getPlatformsList());
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
    hash = (37 * hash) + GAMEDURATION_FIELD_NUMBER;
    hash = (53 * hash) + getGameDuration();
    if (getPlatformsCount() > 0) {
      hash = (37 * hash) + PLATFORMS_FIELD_NUMBER;
      hash = (53 * hash) + getPlatformsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.GameStartNotice parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.huya.ig.jump.protocol.GameStartNotice prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * 游戏开始事件
   * </pre>
   *
   * Protobuf type {@code pb.GameStartNotice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.GameStartNotice)
      com.huya.ig.jump.protocol.GameStartNoticeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameStartNotice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameStartNotice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.huya.ig.jump.protocol.GameStartNotice.class, com.huya.ig.jump.protocol.GameStartNotice.Builder.class);
    }

    // Construct using com.huya.ig.jump.protocol.GameStartNotice.newBuilder()
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
        getPlatformsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      gameDuration_ = 0;

      if (platformsBuilder_ == null) {
        platforms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        platformsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameStartNotice_descriptor;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.GameStartNotice getDefaultInstanceForType() {
      return com.huya.ig.jump.protocol.GameStartNotice.getDefaultInstance();
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.GameStartNotice build() {
      com.huya.ig.jump.protocol.GameStartNotice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.GameStartNotice buildPartial() {
      com.huya.ig.jump.protocol.GameStartNotice result = new com.huya.ig.jump.protocol.GameStartNotice(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.gameDuration_ = gameDuration_;
      if (platformsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          platforms_ = java.util.Collections.unmodifiableList(platforms_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.platforms_ = platforms_;
      } else {
        result.platforms_ = platformsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.huya.ig.jump.protocol.GameStartNotice) {
        return mergeFrom((com.huya.ig.jump.protocol.GameStartNotice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.huya.ig.jump.protocol.GameStartNotice other) {
      if (other == com.huya.ig.jump.protocol.GameStartNotice.getDefaultInstance()) return this;
      if (other.getGameDuration() != 0) {
        setGameDuration(other.getGameDuration());
      }
      if (platformsBuilder_ == null) {
        if (!other.platforms_.isEmpty()) {
          if (platforms_.isEmpty()) {
            platforms_ = other.platforms_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePlatformsIsMutable();
            platforms_.addAll(other.platforms_);
          }
          onChanged();
        }
      } else {
        if (!other.platforms_.isEmpty()) {
          if (platformsBuilder_.isEmpty()) {
            platformsBuilder_.dispose();
            platformsBuilder_ = null;
            platforms_ = other.platforms_;
            bitField0_ = (bitField0_ & ~0x00000002);
            platformsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlatformsFieldBuilder() : null;
          } else {
            platformsBuilder_.addAllMessages(other.platforms_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.huya.ig.jump.protocol.GameStartNotice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.huya.ig.jump.protocol.GameStartNotice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int gameDuration_ ;
    /**
     * <pre>
     * 游戏时长，单位秒
     * </pre>
     *
     * <code>int32 gameDuration = 1;</code>
     */
    public int getGameDuration() {
      return gameDuration_;
    }
    /**
     * <pre>
     * 游戏时长，单位秒
     * </pre>
     *
     * <code>int32 gameDuration = 1;</code>
     */
    public Builder setGameDuration(int value) {
      
      gameDuration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 游戏时长，单位秒
     * </pre>
     *
     * <code>int32 gameDuration = 1;</code>
     */
    public Builder clearGameDuration() {
      
      gameDuration_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.huya.ig.jump.protocol.Platform> platforms_ =
      java.util.Collections.emptyList();
    private void ensurePlatformsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        platforms_ = new java.util.ArrayList<com.huya.ig.jump.protocol.Platform>(platforms_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.huya.ig.jump.protocol.Platform, com.huya.ig.jump.protocol.Platform.Builder, com.huya.ig.jump.protocol.PlatformOrBuilder> platformsBuilder_;

    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public java.util.List<com.huya.ig.jump.protocol.Platform> getPlatformsList() {
      if (platformsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(platforms_);
      } else {
        return platformsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public int getPlatformsCount() {
      if (platformsBuilder_ == null) {
        return platforms_.size();
      } else {
        return platformsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public com.huya.ig.jump.protocol.Platform getPlatforms(int index) {
      if (platformsBuilder_ == null) {
        return platforms_.get(index);
      } else {
        return platformsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder setPlatforms(
        int index, com.huya.ig.jump.protocol.Platform value) {
      if (platformsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformsIsMutable();
        platforms_.set(index, value);
        onChanged();
      } else {
        platformsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder setPlatforms(
        int index, com.huya.ig.jump.protocol.Platform.Builder builderForValue) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.set(index, builderForValue.build());
        onChanged();
      } else {
        platformsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder addPlatforms(com.huya.ig.jump.protocol.Platform value) {
      if (platformsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformsIsMutable();
        platforms_.add(value);
        onChanged();
      } else {
        platformsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder addPlatforms(
        int index, com.huya.ig.jump.protocol.Platform value) {
      if (platformsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformsIsMutable();
        platforms_.add(index, value);
        onChanged();
      } else {
        platformsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder addPlatforms(
        com.huya.ig.jump.protocol.Platform.Builder builderForValue) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.add(builderForValue.build());
        onChanged();
      } else {
        platformsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder addPlatforms(
        int index, com.huya.ig.jump.protocol.Platform.Builder builderForValue) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.add(index, builderForValue.build());
        onChanged();
      } else {
        platformsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder addAllPlatforms(
        java.lang.Iterable<? extends com.huya.ig.jump.protocol.Platform> values) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, platforms_);
        onChanged();
      } else {
        platformsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder clearPlatforms() {
      if (platformsBuilder_ == null) {
        platforms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        platformsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public Builder removePlatforms(int index) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.remove(index);
        onChanged();
      } else {
        platformsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public com.huya.ig.jump.protocol.Platform.Builder getPlatformsBuilder(
        int index) {
      return getPlatformsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public com.huya.ig.jump.protocol.PlatformOrBuilder getPlatformsOrBuilder(
        int index) {
      if (platformsBuilder_ == null) {
        return platforms_.get(index);  } else {
        return platformsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public java.util.List<? extends com.huya.ig.jump.protocol.PlatformOrBuilder> 
         getPlatformsOrBuilderList() {
      if (platformsBuilder_ != null) {
        return platformsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(platforms_);
      }
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public com.huya.ig.jump.protocol.Platform.Builder addPlatformsBuilder() {
      return getPlatformsFieldBuilder().addBuilder(
          com.huya.ig.jump.protocol.Platform.getDefaultInstance());
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public com.huya.ig.jump.protocol.Platform.Builder addPlatformsBuilder(
        int index) {
      return getPlatformsFieldBuilder().addBuilder(
          index, com.huya.ig.jump.protocol.Platform.getDefaultInstance());
    }
    /**
     * <pre>
     *  站台
     * </pre>
     *
     * <code>repeated .pb.Platform platforms = 2;</code>
     */
    public java.util.List<com.huya.ig.jump.protocol.Platform.Builder> 
         getPlatformsBuilderList() {
      return getPlatformsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.huya.ig.jump.protocol.Platform, com.huya.ig.jump.protocol.Platform.Builder, com.huya.ig.jump.protocol.PlatformOrBuilder> 
        getPlatformsFieldBuilder() {
      if (platformsBuilder_ == null) {
        platformsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.huya.ig.jump.protocol.Platform, com.huya.ig.jump.protocol.Platform.Builder, com.huya.ig.jump.protocol.PlatformOrBuilder>(
                platforms_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        platforms_ = null;
      }
      return platformsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pb.GameStartNotice)
  }

  // @@protoc_insertion_point(class_scope:pb.GameStartNotice)
  private static final com.huya.ig.jump.protocol.GameStartNotice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.huya.ig.jump.protocol.GameStartNotice();
  }

  public static com.huya.ig.jump.protocol.GameStartNotice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameStartNotice>
      PARSER = new com.google.protobuf.AbstractParser<GameStartNotice>() {
    @java.lang.Override
    public GameStartNotice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GameStartNotice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GameStartNotice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameStartNotice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.huya.ig.jump.protocol.GameStartNotice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jump.proto

package com.huya.ig.jump.protocol;

/**
 * Protobuf type {@code pb.JumpNotice}
 */
public  final class JumpNotice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.JumpNotice)
    JumpNoticeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JumpNotice.newBuilder() to construct.
  private JumpNotice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JumpNotice() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JumpNotice(
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
          case 10: {
            com.huya.ig.jump.protocol.Player.Builder subBuilder = null;
            if (player_ != null) {
              subBuilder = player_.toBuilder();
            }
            player_ = input.readMessage(com.huya.ig.jump.protocol.Player.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(player_);
              player_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.huya.ig.jump.protocol.JumpCmd.Builder subBuilder = null;
            if (cmd_ != null) {
              subBuilder = cmd_.toBuilder();
            }
            cmd_ = input.readMessage(com.huya.ig.jump.protocol.JumpCmd.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cmd_);
              cmd_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_JumpNotice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_JumpNotice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.huya.ig.jump.protocol.JumpNotice.class, com.huya.ig.jump.protocol.JumpNotice.Builder.class);
  }

  public static final int PLAYER_FIELD_NUMBER = 1;
  private com.huya.ig.jump.protocol.Player player_;
  /**
   * <code>.pb.Player player = 1;</code>
   */
  public boolean hasPlayer() {
    return player_ != null;
  }
  /**
   * <code>.pb.Player player = 1;</code>
   */
  public com.huya.ig.jump.protocol.Player getPlayer() {
    return player_ == null ? com.huya.ig.jump.protocol.Player.getDefaultInstance() : player_;
  }
  /**
   * <code>.pb.Player player = 1;</code>
   */
  public com.huya.ig.jump.protocol.PlayerOrBuilder getPlayerOrBuilder() {
    return getPlayer();
  }

  public static final int CMD_FIELD_NUMBER = 2;
  private com.huya.ig.jump.protocol.JumpCmd cmd_;
  /**
   * <code>.pb.JumpCmd cmd = 2;</code>
   */
  public boolean hasCmd() {
    return cmd_ != null;
  }
  /**
   * <code>.pb.JumpCmd cmd = 2;</code>
   */
  public com.huya.ig.jump.protocol.JumpCmd getCmd() {
    return cmd_ == null ? com.huya.ig.jump.protocol.JumpCmd.getDefaultInstance() : cmd_;
  }
  /**
   * <code>.pb.JumpCmd cmd = 2;</code>
   */
  public com.huya.ig.jump.protocol.JumpCmdOrBuilder getCmdOrBuilder() {
    return getCmd();
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
    if (player_ != null) {
      output.writeMessage(1, getPlayer());
    }
    if (cmd_ != null) {
      output.writeMessage(2, getCmd());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (player_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlayer());
    }
    if (cmd_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCmd());
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
    if (!(obj instanceof com.huya.ig.jump.protocol.JumpNotice)) {
      return super.equals(obj);
    }
    com.huya.ig.jump.protocol.JumpNotice other = (com.huya.ig.jump.protocol.JumpNotice) obj;

    boolean result = true;
    result = result && (hasPlayer() == other.hasPlayer());
    if (hasPlayer()) {
      result = result && getPlayer()
          .equals(other.getPlayer());
    }
    result = result && (hasCmd() == other.hasCmd());
    if (hasCmd()) {
      result = result && getCmd()
          .equals(other.getCmd());
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
    if (hasPlayer()) {
      hash = (37 * hash) + PLAYER_FIELD_NUMBER;
      hash = (53 * hash) + getPlayer().hashCode();
    }
    if (hasCmd()) {
      hash = (37 * hash) + CMD_FIELD_NUMBER;
      hash = (53 * hash) + getCmd().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.JumpNotice parseFrom(
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
  public static Builder newBuilder(com.huya.ig.jump.protocol.JumpNotice prototype) {
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
   * Protobuf type {@code pb.JumpNotice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.JumpNotice)
      com.huya.ig.jump.protocol.JumpNoticeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_JumpNotice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_JumpNotice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.huya.ig.jump.protocol.JumpNotice.class, com.huya.ig.jump.protocol.JumpNotice.Builder.class);
    }

    // Construct using com.huya.ig.jump.protocol.JumpNotice.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (playerBuilder_ == null) {
        player_ = null;
      } else {
        player_ = null;
        playerBuilder_ = null;
      }
      if (cmdBuilder_ == null) {
        cmd_ = null;
      } else {
        cmd_ = null;
        cmdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_JumpNotice_descriptor;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.JumpNotice getDefaultInstanceForType() {
      return com.huya.ig.jump.protocol.JumpNotice.getDefaultInstance();
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.JumpNotice build() {
      com.huya.ig.jump.protocol.JumpNotice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.JumpNotice buildPartial() {
      com.huya.ig.jump.protocol.JumpNotice result = new com.huya.ig.jump.protocol.JumpNotice(this);
      if (playerBuilder_ == null) {
        result.player_ = player_;
      } else {
        result.player_ = playerBuilder_.build();
      }
      if (cmdBuilder_ == null) {
        result.cmd_ = cmd_;
      } else {
        result.cmd_ = cmdBuilder_.build();
      }
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
      if (other instanceof com.huya.ig.jump.protocol.JumpNotice) {
        return mergeFrom((com.huya.ig.jump.protocol.JumpNotice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.huya.ig.jump.protocol.JumpNotice other) {
      if (other == com.huya.ig.jump.protocol.JumpNotice.getDefaultInstance()) return this;
      if (other.hasPlayer()) {
        mergePlayer(other.getPlayer());
      }
      if (other.hasCmd()) {
        mergeCmd(other.getCmd());
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
      com.huya.ig.jump.protocol.JumpNotice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.huya.ig.jump.protocol.JumpNotice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.huya.ig.jump.protocol.Player player_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.huya.ig.jump.protocol.Player, com.huya.ig.jump.protocol.Player.Builder, com.huya.ig.jump.protocol.PlayerOrBuilder> playerBuilder_;
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public boolean hasPlayer() {
      return playerBuilder_ != null || player_ != null;
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public com.huya.ig.jump.protocol.Player getPlayer() {
      if (playerBuilder_ == null) {
        return player_ == null ? com.huya.ig.jump.protocol.Player.getDefaultInstance() : player_;
      } else {
        return playerBuilder_.getMessage();
      }
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public Builder setPlayer(com.huya.ig.jump.protocol.Player value) {
      if (playerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        player_ = value;
        onChanged();
      } else {
        playerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public Builder setPlayer(
        com.huya.ig.jump.protocol.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        player_ = builderForValue.build();
        onChanged();
      } else {
        playerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public Builder mergePlayer(com.huya.ig.jump.protocol.Player value) {
      if (playerBuilder_ == null) {
        if (player_ != null) {
          player_ =
            com.huya.ig.jump.protocol.Player.newBuilder(player_).mergeFrom(value).buildPartial();
        } else {
          player_ = value;
        }
        onChanged();
      } else {
        playerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public Builder clearPlayer() {
      if (playerBuilder_ == null) {
        player_ = null;
        onChanged();
      } else {
        player_ = null;
        playerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public com.huya.ig.jump.protocol.Player.Builder getPlayerBuilder() {
      
      onChanged();
      return getPlayerFieldBuilder().getBuilder();
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    public com.huya.ig.jump.protocol.PlayerOrBuilder getPlayerOrBuilder() {
      if (playerBuilder_ != null) {
        return playerBuilder_.getMessageOrBuilder();
      } else {
        return player_ == null ?
            com.huya.ig.jump.protocol.Player.getDefaultInstance() : player_;
      }
    }
    /**
     * <code>.pb.Player player = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.huya.ig.jump.protocol.Player, com.huya.ig.jump.protocol.Player.Builder, com.huya.ig.jump.protocol.PlayerOrBuilder> 
        getPlayerFieldBuilder() {
      if (playerBuilder_ == null) {
        playerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.huya.ig.jump.protocol.Player, com.huya.ig.jump.protocol.Player.Builder, com.huya.ig.jump.protocol.PlayerOrBuilder>(
                getPlayer(),
                getParentForChildren(),
                isClean());
        player_ = null;
      }
      return playerBuilder_;
    }

    private com.huya.ig.jump.protocol.JumpCmd cmd_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.huya.ig.jump.protocol.JumpCmd, com.huya.ig.jump.protocol.JumpCmd.Builder, com.huya.ig.jump.protocol.JumpCmdOrBuilder> cmdBuilder_;
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public boolean hasCmd() {
      return cmdBuilder_ != null || cmd_ != null;
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public com.huya.ig.jump.protocol.JumpCmd getCmd() {
      if (cmdBuilder_ == null) {
        return cmd_ == null ? com.huya.ig.jump.protocol.JumpCmd.getDefaultInstance() : cmd_;
      } else {
        return cmdBuilder_.getMessage();
      }
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public Builder setCmd(com.huya.ig.jump.protocol.JumpCmd value) {
      if (cmdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cmd_ = value;
        onChanged();
      } else {
        cmdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public Builder setCmd(
        com.huya.ig.jump.protocol.JumpCmd.Builder builderForValue) {
      if (cmdBuilder_ == null) {
        cmd_ = builderForValue.build();
        onChanged();
      } else {
        cmdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public Builder mergeCmd(com.huya.ig.jump.protocol.JumpCmd value) {
      if (cmdBuilder_ == null) {
        if (cmd_ != null) {
          cmd_ =
            com.huya.ig.jump.protocol.JumpCmd.newBuilder(cmd_).mergeFrom(value).buildPartial();
        } else {
          cmd_ = value;
        }
        onChanged();
      } else {
        cmdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public Builder clearCmd() {
      if (cmdBuilder_ == null) {
        cmd_ = null;
        onChanged();
      } else {
        cmd_ = null;
        cmdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public com.huya.ig.jump.protocol.JumpCmd.Builder getCmdBuilder() {
      
      onChanged();
      return getCmdFieldBuilder().getBuilder();
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    public com.huya.ig.jump.protocol.JumpCmdOrBuilder getCmdOrBuilder() {
      if (cmdBuilder_ != null) {
        return cmdBuilder_.getMessageOrBuilder();
      } else {
        return cmd_ == null ?
            com.huya.ig.jump.protocol.JumpCmd.getDefaultInstance() : cmd_;
      }
    }
    /**
     * <code>.pb.JumpCmd cmd = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.huya.ig.jump.protocol.JumpCmd, com.huya.ig.jump.protocol.JumpCmd.Builder, com.huya.ig.jump.protocol.JumpCmdOrBuilder> 
        getCmdFieldBuilder() {
      if (cmdBuilder_ == null) {
        cmdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.huya.ig.jump.protocol.JumpCmd, com.huya.ig.jump.protocol.JumpCmd.Builder, com.huya.ig.jump.protocol.JumpCmdOrBuilder>(
                getCmd(),
                getParentForChildren(),
                isClean());
        cmd_ = null;
      }
      return cmdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pb.JumpNotice)
  }

  // @@protoc_insertion_point(class_scope:pb.JumpNotice)
  private static final com.huya.ig.jump.protocol.JumpNotice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.huya.ig.jump.protocol.JumpNotice();
  }

  public static com.huya.ig.jump.protocol.JumpNotice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JumpNotice>
      PARSER = new com.google.protobuf.AbstractParser<JumpNotice>() {
    @java.lang.Override
    public JumpNotice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JumpNotice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JumpNotice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JumpNotice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.huya.ig.jump.protocol.JumpNotice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestContactsInfoTask.proto

package Jubo.JuLiao.IM.Wx.Proto;

public final class RequestContactsInfoTask {
  private RequestContactsInfoTask() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestContactsInfoTaskMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTaskMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *微信唯一Id
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
     */
    java.lang.String getWeChatId();
    /**
     * <pre>
     *微信唯一Id
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
     */
    com.google.protobuf.ByteString
        getWeChatIdBytes();

    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    java.util.List<java.lang.String>
        getContactsList();
    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    int getContactsCount();
    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    java.lang.String getContacts(int index);
    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    com.google.protobuf.ByteString
        getContactsBytes(int index);
  }
  /**
   * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTaskMessage}
   */
  public  static final class RequestContactsInfoTaskMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTaskMessage)
      RequestContactsInfoTaskMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestContactsInfoTaskMessage.newBuilder() to construct.
    private RequestContactsInfoTaskMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestContactsInfoTaskMessage() {
      weChatId_ = "";
      contacts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestContactsInfoTaskMessage(
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
              java.lang.String s = input.readStringRequireUtf8();

              weChatId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                contacts_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              contacts_.add(s);
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
          contacts_ = contacts_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage.class, Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage.Builder.class);
    }

    private int bitField0_;
    public static final int WECHATID_FIELD_NUMBER = 1;
    private volatile java.lang.Object weChatId_;
    /**
     * <pre>
     *微信唯一Id
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
     */
    public java.lang.String getWeChatId() {
      java.lang.Object ref = weChatId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        weChatId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *微信唯一Id
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getWeChatIdBytes() {
      java.lang.Object ref = weChatId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        weChatId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTACTS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList contacts_;
    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getContactsList() {
      return contacts_;
    }
    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    public int getContactsCount() {
      return contacts_.size();
    }
    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    public java.lang.String getContacts(int index) {
      return contacts_.get(index);
    }
    /**
     * <pre>
     * 联系人username列表，
     * </pre>
     *
     * <code>repeated string Contacts = 2;</code>
     */
    public com.google.protobuf.ByteString
        getContactsBytes(int index) {
      return contacts_.getByteString(index);
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
      if (!getWeChatIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, weChatId_);
      }
      for (int i = 0; i < contacts_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, contacts_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getWeChatIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, weChatId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < contacts_.size(); i++) {
          dataSize += computeStringSizeNoTag(contacts_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getContactsList().size();
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
      if (!(obj instanceof Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage)) {
        return super.equals(obj);
      }
      Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage other = (Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage) obj;

      boolean result = true;
      result = result && getWeChatId()
          .equals(other.getWeChatId());
      result = result && getContactsList()
          .equals(other.getContactsList());
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
      hash = (37 * hash) + WECHATID_FIELD_NUMBER;
      hash = (53 * hash) + getWeChatId().hashCode();
      if (getContactsCount() > 0) {
        hash = (37 * hash) + CONTACTS_FIELD_NUMBER;
        hash = (53 * hash) + getContactsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parseFrom(
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
    public static Builder newBuilder(Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage prototype) {
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
     * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTaskMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTaskMessage)
        Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage.class, Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage.Builder.class);
      }

      // Construct using Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage.newBuilder()
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
        weChatId_ = "";

        contacts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_descriptor;
      }

      public Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage getDefaultInstanceForType() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage.getDefaultInstance();
      }

      public Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage build() {
        Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage buildPartial() {
        Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage result = new Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.weChatId_ = weChatId_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          contacts_ = contacts_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.contacts_ = contacts_;
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
        if (other instanceof Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage) {
          return mergeFrom((Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage other) {
        if (other == Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage.getDefaultInstance()) return this;
        if (!other.getWeChatId().isEmpty()) {
          weChatId_ = other.weChatId_;
          onChanged();
        }
        if (!other.contacts_.isEmpty()) {
          if (contacts_.isEmpty()) {
            contacts_ = other.contacts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureContactsIsMutable();
            contacts_.addAll(other.contacts_);
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
        Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object weChatId_ = "";
      /**
       * <pre>
       *微信唯一Id
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
       */
      public java.lang.String getWeChatId() {
        java.lang.Object ref = weChatId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          weChatId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *微信唯一Id
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getWeChatIdBytes() {
        java.lang.Object ref = weChatId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          weChatId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *微信唯一Id
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
       */
      public Builder setWeChatId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        weChatId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信唯一Id
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
       */
      public Builder clearWeChatId() {
        
        weChatId_ = getDefaultInstance().getWeChatId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *微信唯一Id
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
       */
      public Builder setWeChatIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        weChatId_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList contacts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureContactsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          contacts_ = new com.google.protobuf.LazyStringArrayList(contacts_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getContactsList() {
        return contacts_.getUnmodifiableView();
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public int getContactsCount() {
        return contacts_.size();
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public java.lang.String getContacts(int index) {
        return contacts_.get(index);
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public com.google.protobuf.ByteString
          getContactsBytes(int index) {
        return contacts_.getByteString(index);
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public Builder setContacts(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContactsIsMutable();
        contacts_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public Builder addContacts(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContactsIsMutable();
        contacts_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public Builder addAllContacts(
          java.lang.Iterable<java.lang.String> values) {
        ensureContactsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contacts_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public Builder clearContacts() {
        contacts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 联系人username列表，
       * </pre>
       *
       * <code>repeated string Contacts = 2;</code>
       */
      public Builder addContactsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureContactsIsMutable();
        contacts_.add(value);
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


      // @@protoc_insertion_point(builder_scope:Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTaskMessage)
    }

    // @@protoc_insertion_point(class_scope:Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTaskMessage)
    private static final Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage();
    }

    public static Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestContactsInfoTaskMessage>
        PARSER = new com.google.protobuf.AbstractParser<RequestContactsInfoTaskMessage>() {
      public RequestContactsInfoTaskMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestContactsInfoTaskMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestContactsInfoTaskMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestContactsInfoTaskMessage> getParserForType() {
      return PARSER;
    }

    public Jubo.JuLiao.IM.Wx.Proto.RequestContactsInfoTask.RequestContactsInfoTaskMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RequestContactsInfoTask.proto\022\027Jubo.Ju" +
      "Liao.IM.Wx.Proto\"D\n\036RequestContactsInfoT" +
      "askMessage\022\020\n\010WeChatId\030\001 \001(\t\022\020\n\010Contacts" +
      "\030\002 \003(\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestContactsInfoTaskMessage_descriptor,
        new java.lang.String[] { "WeChatId", "Contacts", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

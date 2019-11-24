package com.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: Message.proto")
public final class messageServiceGrpc {

  private messageServiceGrpc() {}

  public static final String SERVICE_NAME = "protobuf.messageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.Message,
      com.proto.None> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = com.proto.Message.class,
      responseType = com.proto.None.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.Message,
      com.proto.None> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.proto.Message, com.proto.None> getSendMessageMethod;
    if ((getSendMessageMethod = messageServiceGrpc.getSendMessageMethod) == null) {
      synchronized (messageServiceGrpc.class) {
        if ((getSendMessageMethod = messageServiceGrpc.getSendMessageMethod) == null) {
          messageServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<com.proto.Message, com.proto.None>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.None.getDefaultInstance()))
              .setSchemaDescriptor(new messageServiceMethodDescriptorSupplier("sendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.Message,
      com.proto.Message> getReceiveMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "receiveMessages",
      requestType = com.proto.Message.class,
      responseType = com.proto.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.Message,
      com.proto.Message> getReceiveMessagesMethod() {
    io.grpc.MethodDescriptor<com.proto.Message, com.proto.Message> getReceiveMessagesMethod;
    if ((getReceiveMessagesMethod = messageServiceGrpc.getReceiveMessagesMethod) == null) {
      synchronized (messageServiceGrpc.class) {
        if ((getReceiveMessagesMethod = messageServiceGrpc.getReceiveMessagesMethod) == null) {
          messageServiceGrpc.getReceiveMessagesMethod = getReceiveMessagesMethod =
              io.grpc.MethodDescriptor.<com.proto.Message, com.proto.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "receiveMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.Message.getDefaultInstance()))
              .setSchemaDescriptor(new messageServiceMethodDescriptorSupplier("receiveMessages"))
              .build();
        }
      }
    }
    return getReceiveMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.Message,
      com.proto.Message> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "disconnect",
      requestType = com.proto.Message.class,
      responseType = com.proto.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.Message,
      com.proto.Message> getDisconnectMethod() {
    io.grpc.MethodDescriptor<com.proto.Message, com.proto.Message> getDisconnectMethod;
    if ((getDisconnectMethod = messageServiceGrpc.getDisconnectMethod) == null) {
      synchronized (messageServiceGrpc.class) {
        if ((getDisconnectMethod = messageServiceGrpc.getDisconnectMethod) == null) {
          messageServiceGrpc.getDisconnectMethod = getDisconnectMethod =
              io.grpc.MethodDescriptor.<com.proto.Message, com.proto.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.Message.getDefaultInstance()))
              .setSchemaDescriptor(new messageServiceMethodDescriptorSupplier("disconnect"))
              .build();
        }
      }
    }
    return getDisconnectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static messageServiceStub newStub(io.grpc.Channel channel) {
    return new messageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static messageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new messageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static messageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new messageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class messageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMessage(com.proto.Message request,
        io.grpc.stub.StreamObserver<com.proto.None> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    public void receiveMessages(com.proto.Message request,
        io.grpc.stub.StreamObserver<com.proto.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getReceiveMessagesMethod(), responseObserver);
    }

    /**
     */
    public void disconnect(com.proto.Message request,
        io.grpc.stub.StreamObserver<com.proto.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getDisconnectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.Message,
                com.proto.None>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getReceiveMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.Message,
                com.proto.Message>(
                  this, METHODID_RECEIVE_MESSAGES)))
          .addMethod(
            getDisconnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.Message,
                com.proto.Message>(
                  this, METHODID_DISCONNECT)))
          .build();
    }
  }

  /**
   */
  public static final class messageServiceStub extends io.grpc.stub.AbstractStub<messageServiceStub> {
    private messageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected messageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(com.proto.Message request,
        io.grpc.stub.StreamObserver<com.proto.None> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void receiveMessages(com.proto.Message request,
        io.grpc.stub.StreamObserver<com.proto.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReceiveMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disconnect(com.proto.Message request,
        io.grpc.stub.StreamObserver<com.proto.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class messageServiceBlockingStub extends io.grpc.stub.AbstractStub<messageServiceBlockingStub> {
    private messageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected messageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.None sendMessage(com.proto.Message request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.Message> receiveMessages(
        com.proto.Message request) {
      return blockingServerStreamingCall(
          getChannel(), getReceiveMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.Message disconnect(com.proto.Message request) {
      return blockingUnaryCall(
          getChannel(), getDisconnectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class messageServiceFutureStub extends io.grpc.stub.AbstractStub<messageServiceFutureStub> {
    private messageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected messageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.None> sendMessage(
        com.proto.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.Message> disconnect(
        com.proto.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_RECEIVE_MESSAGES = 1;
  private static final int METHODID_DISCONNECT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final messageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(messageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.proto.Message) request,
              (io.grpc.stub.StreamObserver<com.proto.None>) responseObserver);
          break;
        case METHODID_RECEIVE_MESSAGES:
          serviceImpl.receiveMessages((com.proto.Message) request,
              (io.grpc.stub.StreamObserver<com.proto.Message>) responseObserver);
          break;
        case METHODID_DISCONNECT:
          serviceImpl.disconnect((com.proto.Message) request,
              (io.grpc.stub.StreamObserver<com.proto.Message>) responseObserver);
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

  private static abstract class messageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    messageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.MessageProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("messageService");
    }
  }

  private static final class messageServiceFileDescriptorSupplier
      extends messageServiceBaseDescriptorSupplier {
    messageServiceFileDescriptorSupplier() {}
  }

  private static final class messageServiceMethodDescriptorSupplier
      extends messageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    messageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (messageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new messageServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getReceiveMessagesMethod())
              .addMethod(getDisconnectMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package com.peakwork.api.accommodation.v1;

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
 * <pre>
 * The BaseDataService is used to send various base data, i.e. static meta information, about the accommodation
 * portfolio to Peakwork in order to distribute it. Base data contains various entities, like accommodations, rooms or
 * boards. These entities contain meta information, that is shared among all distribution partners. This means,
 * when a supplier sends base data for an accommodation, the distribution partners will all see the same base data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: accommodation-api.proto")
public final class BaseDataServiceGrpc {

  private BaseDataServiceGrpc() {}

  public static final String SERVICE_NAME = "peakwork.api.accommodation.v1.BaseDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.AccommodationRequest,
      com.google.rpc.Status> getUpsertAccommodationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertAccommodation",
      requestType = com.peakwork.api.accommodation.v1.AccommodationRequest.class,
      responseType = com.google.rpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.AccommodationRequest,
      com.google.rpc.Status> getUpsertAccommodationMethod() {
    io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.AccommodationRequest, com.google.rpc.Status> getUpsertAccommodationMethod;
    if ((getUpsertAccommodationMethod = BaseDataServiceGrpc.getUpsertAccommodationMethod) == null) {
      synchronized (BaseDataServiceGrpc.class) {
        if ((getUpsertAccommodationMethod = BaseDataServiceGrpc.getUpsertAccommodationMethod) == null) {
          BaseDataServiceGrpc.getUpsertAccommodationMethod = getUpsertAccommodationMethod = 
              io.grpc.MethodDescriptor.<com.peakwork.api.accommodation.v1.AccommodationRequest, com.google.rpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "peakwork.api.accommodation.v1.BaseDataService", "UpsertAccommodation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.peakwork.api.accommodation.v1.AccommodationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.rpc.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new BaseDataServiceMethodDescriptorSupplier("UpsertAccommodation"))
                  .build();
          }
        }
     }
     return getUpsertAccommodationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.RateRequest,
      com.google.rpc.Status> getUpsertRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertRate",
      requestType = com.peakwork.api.accommodation.v1.RateRequest.class,
      responseType = com.google.rpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.RateRequest,
      com.google.rpc.Status> getUpsertRateMethod() {
    io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.RateRequest, com.google.rpc.Status> getUpsertRateMethod;
    if ((getUpsertRateMethod = BaseDataServiceGrpc.getUpsertRateMethod) == null) {
      synchronized (BaseDataServiceGrpc.class) {
        if ((getUpsertRateMethod = BaseDataServiceGrpc.getUpsertRateMethod) == null) {
          BaseDataServiceGrpc.getUpsertRateMethod = getUpsertRateMethod = 
              io.grpc.MethodDescriptor.<com.peakwork.api.accommodation.v1.RateRequest, com.google.rpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "peakwork.api.accommodation.v1.BaseDataService", "UpsertRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.peakwork.api.accommodation.v1.RateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.rpc.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new BaseDataServiceMethodDescriptorSupplier("UpsertRate"))
                  .build();
          }
        }
     }
     return getUpsertRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.RoomRequest,
      com.google.rpc.Status> getUpsertRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertRoom",
      requestType = com.peakwork.api.accommodation.v1.RoomRequest.class,
      responseType = com.google.rpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.RoomRequest,
      com.google.rpc.Status> getUpsertRoomMethod() {
    io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.RoomRequest, com.google.rpc.Status> getUpsertRoomMethod;
    if ((getUpsertRoomMethod = BaseDataServiceGrpc.getUpsertRoomMethod) == null) {
      synchronized (BaseDataServiceGrpc.class) {
        if ((getUpsertRoomMethod = BaseDataServiceGrpc.getUpsertRoomMethod) == null) {
          BaseDataServiceGrpc.getUpsertRoomMethod = getUpsertRoomMethod = 
              io.grpc.MethodDescriptor.<com.peakwork.api.accommodation.v1.RoomRequest, com.google.rpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "peakwork.api.accommodation.v1.BaseDataService", "UpsertRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.peakwork.api.accommodation.v1.RoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.rpc.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new BaseDataServiceMethodDescriptorSupplier("UpsertRoom"))
                  .build();
          }
        }
     }
     return getUpsertRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.BoardRequest,
      com.google.rpc.Status> getUpsertBoardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertBoard",
      requestType = com.peakwork.api.accommodation.v1.BoardRequest.class,
      responseType = com.google.rpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.BoardRequest,
      com.google.rpc.Status> getUpsertBoardMethod() {
    io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.BoardRequest, com.google.rpc.Status> getUpsertBoardMethod;
    if ((getUpsertBoardMethod = BaseDataServiceGrpc.getUpsertBoardMethod) == null) {
      synchronized (BaseDataServiceGrpc.class) {
        if ((getUpsertBoardMethod = BaseDataServiceGrpc.getUpsertBoardMethod) == null) {
          BaseDataServiceGrpc.getUpsertBoardMethod = getUpsertBoardMethod = 
              io.grpc.MethodDescriptor.<com.peakwork.api.accommodation.v1.BoardRequest, com.google.rpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "peakwork.api.accommodation.v1.BaseDataService", "UpsertBoard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.peakwork.api.accommodation.v1.BoardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.rpc.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new BaseDataServiceMethodDescriptorSupplier("UpsertBoard"))
                  .build();
          }
        }
     }
     return getUpsertBoardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BaseDataServiceStub newStub(io.grpc.Channel channel) {
    return new BaseDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BaseDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BaseDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BaseDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BaseDataServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The BaseDataService is used to send various base data, i.e. static meta information, about the accommodation
   * portfolio to Peakwork in order to distribute it. Base data contains various entities, like accommodations, rooms or
   * boards. These entities contain meta information, that is shared among all distribution partners. This means,
   * when a supplier sends base data for an accommodation, the distribution partners will all see the same base data.
   * </pre>
   */
  public static abstract class BaseDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a new accommodation entity for the supplier.
     * If an accommodation with the same identity already exists, its content is replaced by the new data.
     * See Accommodation for further information about the accommodation entity and how it is identified.
     * </pre>
     */
    public void upsertAccommodation(com.peakwork.api.accommodation.v1.AccommodationRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertAccommodationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate entity for the supplier.
     * If a rate with the same identity already exists, its content is replaced by the new data.
     * See Rate for further information about the rate entity and how it is identified.
     * </pre>
     */
    public void upsertRate(com.peakwork.api.accommodation.v1.RateRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new room entity for the supplier.
     * If a room with the same identity already exists, its content is replaced by the new data.
     * See Room for further information about the room entity and how it is identified.
     * </pre>
     */
    public void upsertRoom(com.peakwork.api.accommodation.v1.RoomRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new board entity for the supplier.
     * If a board with the same identity already exists, its content is replaced by the new data.
     * See Board for further information about the board entity and how it is identified.
     * </pre>
     */
    public void upsertBoard(com.peakwork.api.accommodation.v1.BoardRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertBoardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpsertAccommodationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.peakwork.api.accommodation.v1.AccommodationRequest,
                com.google.rpc.Status>(
                  this, METHODID_UPSERT_ACCOMMODATION)))
          .addMethod(
            getUpsertRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.peakwork.api.accommodation.v1.RateRequest,
                com.google.rpc.Status>(
                  this, METHODID_UPSERT_RATE)))
          .addMethod(
            getUpsertRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.peakwork.api.accommodation.v1.RoomRequest,
                com.google.rpc.Status>(
                  this, METHODID_UPSERT_ROOM)))
          .addMethod(
            getUpsertBoardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.peakwork.api.accommodation.v1.BoardRequest,
                com.google.rpc.Status>(
                  this, METHODID_UPSERT_BOARD)))
          .build();
    }
  }

  /**
   * <pre>
   * The BaseDataService is used to send various base data, i.e. static meta information, about the accommodation
   * portfolio to Peakwork in order to distribute it. Base data contains various entities, like accommodations, rooms or
   * boards. These entities contain meta information, that is shared among all distribution partners. This means,
   * when a supplier sends base data for an accommodation, the distribution partners will all see the same base data.
   * </pre>
   */
  public static final class BaseDataServiceStub extends io.grpc.stub.AbstractStub<BaseDataServiceStub> {
    private BaseDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BaseDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BaseDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new accommodation entity for the supplier.
     * If an accommodation with the same identity already exists, its content is replaced by the new data.
     * See Accommodation for further information about the accommodation entity and how it is identified.
     * </pre>
     */
    public void upsertAccommodation(com.peakwork.api.accommodation.v1.AccommodationRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertAccommodationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate entity for the supplier.
     * If a rate with the same identity already exists, its content is replaced by the new data.
     * See Rate for further information about the rate entity and how it is identified.
     * </pre>
     */
    public void upsertRate(com.peakwork.api.accommodation.v1.RateRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new room entity for the supplier.
     * If a room with the same identity already exists, its content is replaced by the new data.
     * See Room for further information about the room entity and how it is identified.
     * </pre>
     */
    public void upsertRoom(com.peakwork.api.accommodation.v1.RoomRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new board entity for the supplier.
     * If a board with the same identity already exists, its content is replaced by the new data.
     * See Board for further information about the board entity and how it is identified.
     * </pre>
     */
    public void upsertBoard(com.peakwork.api.accommodation.v1.BoardRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertBoardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The BaseDataService is used to send various base data, i.e. static meta information, about the accommodation
   * portfolio to Peakwork in order to distribute it. Base data contains various entities, like accommodations, rooms or
   * boards. These entities contain meta information, that is shared among all distribution partners. This means,
   * when a supplier sends base data for an accommodation, the distribution partners will all see the same base data.
   * </pre>
   */
  public static final class BaseDataServiceBlockingStub extends io.grpc.stub.AbstractStub<BaseDataServiceBlockingStub> {
    private BaseDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BaseDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BaseDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new accommodation entity for the supplier.
     * If an accommodation with the same identity already exists, its content is replaced by the new data.
     * See Accommodation for further information about the accommodation entity and how it is identified.
     * </pre>
     */
    public com.google.rpc.Status upsertAccommodation(com.peakwork.api.accommodation.v1.AccommodationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertAccommodationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new rate entity for the supplier.
     * If a rate with the same identity already exists, its content is replaced by the new data.
     * See Rate for further information about the rate entity and how it is identified.
     * </pre>
     */
    public com.google.rpc.Status upsertRate(com.peakwork.api.accommodation.v1.RateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new room entity for the supplier.
     * If a room with the same identity already exists, its content is replaced by the new data.
     * See Room for further information about the room entity and how it is identified.
     * </pre>
     */
    public com.google.rpc.Status upsertRoom(com.peakwork.api.accommodation.v1.RoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertRoomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new board entity for the supplier.
     * If a board with the same identity already exists, its content is replaced by the new data.
     * See Board for further information about the board entity and how it is identified.
     * </pre>
     */
    public com.google.rpc.Status upsertBoard(com.peakwork.api.accommodation.v1.BoardRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertBoardMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The BaseDataService is used to send various base data, i.e. static meta information, about the accommodation
   * portfolio to Peakwork in order to distribute it. Base data contains various entities, like accommodations, rooms or
   * boards. These entities contain meta information, that is shared among all distribution partners. This means,
   * when a supplier sends base data for an accommodation, the distribution partners will all see the same base data.
   * </pre>
   */
  public static final class BaseDataServiceFutureStub extends io.grpc.stub.AbstractStub<BaseDataServiceFutureStub> {
    private BaseDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BaseDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BaseDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new accommodation entity for the supplier.
     * If an accommodation with the same identity already exists, its content is replaced by the new data.
     * See Accommodation for further information about the accommodation entity and how it is identified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.rpc.Status> upsertAccommodation(
        com.peakwork.api.accommodation.v1.AccommodationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertAccommodationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new rate entity for the supplier.
     * If a rate with the same identity already exists, its content is replaced by the new data.
     * See Rate for further information about the rate entity and how it is identified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.rpc.Status> upsertRate(
        com.peakwork.api.accommodation.v1.RateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new room entity for the supplier.
     * If a room with the same identity already exists, its content is replaced by the new data.
     * See Room for further information about the room entity and how it is identified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.rpc.Status> upsertRoom(
        com.peakwork.api.accommodation.v1.RoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertRoomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new board entity for the supplier.
     * If a board with the same identity already exists, its content is replaced by the new data.
     * See Board for further information about the board entity and how it is identified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.rpc.Status> upsertBoard(
        com.peakwork.api.accommodation.v1.BoardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertBoardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPSERT_ACCOMMODATION = 0;
  private static final int METHODID_UPSERT_RATE = 1;
  private static final int METHODID_UPSERT_ROOM = 2;
  private static final int METHODID_UPSERT_BOARD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BaseDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BaseDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPSERT_ACCOMMODATION:
          serviceImpl.upsertAccommodation((com.peakwork.api.accommodation.v1.AccommodationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.rpc.Status>) responseObserver);
          break;
        case METHODID_UPSERT_RATE:
          serviceImpl.upsertRate((com.peakwork.api.accommodation.v1.RateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.rpc.Status>) responseObserver);
          break;
        case METHODID_UPSERT_ROOM:
          serviceImpl.upsertRoom((com.peakwork.api.accommodation.v1.RoomRequest) request,
              (io.grpc.stub.StreamObserver<com.google.rpc.Status>) responseObserver);
          break;
        case METHODID_UPSERT_BOARD:
          serviceImpl.upsertBoard((com.peakwork.api.accommodation.v1.BoardRequest) request,
              (io.grpc.stub.StreamObserver<com.google.rpc.Status>) responseObserver);
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

  private static abstract class BaseDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BaseDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.peakwork.api.accommodation.v1.AccommodationApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BaseDataService");
    }
  }

  private static final class BaseDataServiceFileDescriptorSupplier
      extends BaseDataServiceBaseDescriptorSupplier {
    BaseDataServiceFileDescriptorSupplier() {}
  }

  private static final class BaseDataServiceMethodDescriptorSupplier
      extends BaseDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BaseDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BaseDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BaseDataServiceFileDescriptorSupplier())
              .addMethod(getUpsertAccommodationMethod())
              .addMethod(getUpsertRateMethod())
              .addMethod(getUpsertRoomMethod())
              .addMethod(getUpsertBoardMethod())
              .build();
        }
      }
    }
    return result;
  }
}

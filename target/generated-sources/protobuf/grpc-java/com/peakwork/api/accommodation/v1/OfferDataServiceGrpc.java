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
 * The OfferDataService is used to send various offer information about the accommodation portfolio to Peakwork in
 * order to distribute it. Offers contain information about the pricing and availability of the portfolio and can be
 * shared by multiple partners or supplied specifically for single partners (as opposed to base data). This means,
 * that a supplier can send different offer data, e.g. prices, to be used by different partners, while all partners
 * share the same basic information about the portfolio.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: accommodation-api.proto")
public final class OfferDataServiceGrpc {

  private OfferDataServiceGrpc() {}

  public static final String SERVICE_NAME = "peakwork.api.accommodation.v1.OfferDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest,
      com.google.rpc.Status> getUpsertAccommodationOfferDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertAccommodationOfferData",
      requestType = com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest.class,
      responseType = com.google.rpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest,
      com.google.rpc.Status> getUpsertAccommodationOfferDataMethod() {
    io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest, com.google.rpc.Status> getUpsertAccommodationOfferDataMethod;
    if ((getUpsertAccommodationOfferDataMethod = OfferDataServiceGrpc.getUpsertAccommodationOfferDataMethod) == null) {
      synchronized (OfferDataServiceGrpc.class) {
        if ((getUpsertAccommodationOfferDataMethod = OfferDataServiceGrpc.getUpsertAccommodationOfferDataMethod) == null) {
          OfferDataServiceGrpc.getUpsertAccommodationOfferDataMethod = getUpsertAccommodationOfferDataMethod = 
              io.grpc.MethodDescriptor.<com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest, com.google.rpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "peakwork.api.accommodation.v1.OfferDataService", "UpsertAccommodationOfferData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.rpc.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new OfferDataServiceMethodDescriptorSupplier("UpsertAccommodationOfferData"))
                  .build();
          }
        }
     }
     return getUpsertAccommodationOfferDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest,
      com.google.rpc.Status> getUpsertGroupOfferDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertGroupOfferData",
      requestType = com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest.class,
      responseType = com.google.rpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest,
      com.google.rpc.Status> getUpsertGroupOfferDataMethod() {
    io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest, com.google.rpc.Status> getUpsertGroupOfferDataMethod;
    if ((getUpsertGroupOfferDataMethod = OfferDataServiceGrpc.getUpsertGroupOfferDataMethod) == null) {
      synchronized (OfferDataServiceGrpc.class) {
        if ((getUpsertGroupOfferDataMethod = OfferDataServiceGrpc.getUpsertGroupOfferDataMethod) == null) {
          OfferDataServiceGrpc.getUpsertGroupOfferDataMethod = getUpsertGroupOfferDataMethod = 
              io.grpc.MethodDescriptor.<com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest, com.google.rpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "peakwork.api.accommodation.v1.OfferDataService", "UpsertGroupOfferData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.rpc.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new OfferDataServiceMethodDescriptorSupplier("UpsertGroupOfferData"))
                  .build();
          }
        }
     }
     return getUpsertGroupOfferDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest,
      com.google.rpc.Status> getUpsertSingleOfferDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertSingleOfferData",
      requestType = com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest.class,
      responseType = com.google.rpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest,
      com.google.rpc.Status> getUpsertSingleOfferDataMethod() {
    io.grpc.MethodDescriptor<com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest, com.google.rpc.Status> getUpsertSingleOfferDataMethod;
    if ((getUpsertSingleOfferDataMethod = OfferDataServiceGrpc.getUpsertSingleOfferDataMethod) == null) {
      synchronized (OfferDataServiceGrpc.class) {
        if ((getUpsertSingleOfferDataMethod = OfferDataServiceGrpc.getUpsertSingleOfferDataMethod) == null) {
          OfferDataServiceGrpc.getUpsertSingleOfferDataMethod = getUpsertSingleOfferDataMethod = 
              io.grpc.MethodDescriptor.<com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest, com.google.rpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "peakwork.api.accommodation.v1.OfferDataService", "UpsertSingleOfferData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.rpc.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new OfferDataServiceMethodDescriptorSupplier("UpsertSingleOfferData"))
                  .build();
          }
        }
     }
     return getUpsertSingleOfferDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OfferDataServiceStub newStub(io.grpc.Channel channel) {
    return new OfferDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OfferDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OfferDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OfferDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OfferDataServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The OfferDataService is used to send various offer information about the accommodation portfolio to Peakwork in
   * order to distribute it. Offers contain information about the pricing and availability of the portfolio and can be
   * shared by multiple partners or supplied specifically for single partners (as opposed to base data). This means,
   * that a supplier can send different offer data, e.g. prices, to be used by different partners, while all partners
   * share the same basic information about the portfolio.
   * </pre>
   */
  public static abstract class OfferDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * for a supplier.
     * If offer information for the given accommodation/rate combination already exists, all information is replaced by
     * the new data. Offer data for the same accommodation but a different rate is not replaced. Analogously, offer data
     * for the same rate but a different accommodation is also not replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate combination, that are not
     * delivered again in that call.
     * UpsertAccommodationOfferData is the highest level on which to update offer data. It is meant for for the following
     * scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on an accommodation level
     * - a supplier wants to reset the offer data of an accommodation
     * - a supplier wants to remove offer data of an accommodation implicitly by explicitly delivering all available
     *   offer data
     * UpsertAccommodationOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertGroupOfferData and UpsertSingleOfferData for information on how to update offer data on lower levels
     * without replacing all offer data for an accommodation/rate combination.
     * </pre>
     */
    public void upsertAccommodationOfferData(com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertAccommodationOfferDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board combination already exists, all information is
     * replaced by the new data. Offer data for the same combination but e.g. for a different room or board is not
     * replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate/room/board combination,
     * that are not delivered again in the call.
     * UpsertGroupOfferData is meant for for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier wants to reset the offer data of a room or board for an accommodation
     * - a supplier wants to remove offer data of a room or board implicitly by explicitly delivering all available
     *   offer data for that room or board
     * UpsertGroupOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertAccommodationOfferData and UpsertSingleOfferData for information on how to update offer data on
     * different levels with different replacement mechanisms.
     * </pre>
     */
    public void upsertGroupOfferData(com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertGroupOfferDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * - arrival date
     * - length of stay
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board/arrival-date/length-of-stay combination already
     * exists, all information is replaced by the new data. Offer data for the same combination but e.g. for a different
     * arrival date or length of stay is not replaced.
     * UpsertSingleOfferData is meant for for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * - a booking system detected, that the cached price/availability does not match the live data
     * UpsertSingleOfferData is not intended for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier wants to remove offer data
     * See UpsertAccommodationOfferData and UpsertGroupOfferData for information on how to update offer data on
     * higher levels with different replacement mechanisms.
     * </pre>
     */
    public void upsertSingleOfferData(com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertSingleOfferDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpsertAccommodationOfferDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest,
                com.google.rpc.Status>(
                  this, METHODID_UPSERT_ACCOMMODATION_OFFER_DATA)))
          .addMethod(
            getUpsertGroupOfferDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest,
                com.google.rpc.Status>(
                  this, METHODID_UPSERT_GROUP_OFFER_DATA)))
          .addMethod(
            getUpsertSingleOfferDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest,
                com.google.rpc.Status>(
                  this, METHODID_UPSERT_SINGLE_OFFER_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * The OfferDataService is used to send various offer information about the accommodation portfolio to Peakwork in
   * order to distribute it. Offers contain information about the pricing and availability of the portfolio and can be
   * shared by multiple partners or supplied specifically for single partners (as opposed to base data). This means,
   * that a supplier can send different offer data, e.g. prices, to be used by different partners, while all partners
   * share the same basic information about the portfolio.
   * </pre>
   */
  public static final class OfferDataServiceStub extends io.grpc.stub.AbstractStub<OfferDataServiceStub> {
    private OfferDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OfferDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfferDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OfferDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * for a supplier.
     * If offer information for the given accommodation/rate combination already exists, all information is replaced by
     * the new data. Offer data for the same accommodation but a different rate is not replaced. Analogously, offer data
     * for the same rate but a different accommodation is also not replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate combination, that are not
     * delivered again in that call.
     * UpsertAccommodationOfferData is the highest level on which to update offer data. It is meant for for the following
     * scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on an accommodation level
     * - a supplier wants to reset the offer data of an accommodation
     * - a supplier wants to remove offer data of an accommodation implicitly by explicitly delivering all available
     *   offer data
     * UpsertAccommodationOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertGroupOfferData and UpsertSingleOfferData for information on how to update offer data on lower levels
     * without replacing all offer data for an accommodation/rate combination.
     * </pre>
     */
    public void upsertAccommodationOfferData(com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertAccommodationOfferDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board combination already exists, all information is
     * replaced by the new data. Offer data for the same combination but e.g. for a different room or board is not
     * replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate/room/board combination,
     * that are not delivered again in the call.
     * UpsertGroupOfferData is meant for for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier wants to reset the offer data of a room or board for an accommodation
     * - a supplier wants to remove offer data of a room or board implicitly by explicitly delivering all available
     *   offer data for that room or board
     * UpsertGroupOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertAccommodationOfferData and UpsertSingleOfferData for information on how to update offer data on
     * different levels with different replacement mechanisms.
     * </pre>
     */
    public void upsertGroupOfferData(com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertGroupOfferDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * - arrival date
     * - length of stay
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board/arrival-date/length-of-stay combination already
     * exists, all information is replaced by the new data. Offer data for the same combination but e.g. for a different
     * arrival date or length of stay is not replaced.
     * UpsertSingleOfferData is meant for for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * - a booking system detected, that the cached price/availability does not match the live data
     * UpsertSingleOfferData is not intended for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier wants to remove offer data
     * See UpsertAccommodationOfferData and UpsertGroupOfferData for information on how to update offer data on
     * higher levels with different replacement mechanisms.
     * </pre>
     */
    public void upsertSingleOfferData(com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.google.rpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertSingleOfferDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The OfferDataService is used to send various offer information about the accommodation portfolio to Peakwork in
   * order to distribute it. Offers contain information about the pricing and availability of the portfolio and can be
   * shared by multiple partners or supplied specifically for single partners (as opposed to base data). This means,
   * that a supplier can send different offer data, e.g. prices, to be used by different partners, while all partners
   * share the same basic information about the portfolio.
   * </pre>
   */
  public static final class OfferDataServiceBlockingStub extends io.grpc.stub.AbstractStub<OfferDataServiceBlockingStub> {
    private OfferDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OfferDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfferDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OfferDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * for a supplier.
     * If offer information for the given accommodation/rate combination already exists, all information is replaced by
     * the new data. Offer data for the same accommodation but a different rate is not replaced. Analogously, offer data
     * for the same rate but a different accommodation is also not replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate combination, that are not
     * delivered again in that call.
     * UpsertAccommodationOfferData is the highest level on which to update offer data. It is meant for for the following
     * scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on an accommodation level
     * - a supplier wants to reset the offer data of an accommodation
     * - a supplier wants to remove offer data of an accommodation implicitly by explicitly delivering all available
     *   offer data
     * UpsertAccommodationOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertGroupOfferData and UpsertSingleOfferData for information on how to update offer data on lower levels
     * without replacing all offer data for an accommodation/rate combination.
     * </pre>
     */
    public com.google.rpc.Status upsertAccommodationOfferData(com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertAccommodationOfferDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board combination already exists, all information is
     * replaced by the new data. Offer data for the same combination but e.g. for a different room or board is not
     * replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate/room/board combination,
     * that are not delivered again in the call.
     * UpsertGroupOfferData is meant for for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier wants to reset the offer data of a room or board for an accommodation
     * - a supplier wants to remove offer data of a room or board implicitly by explicitly delivering all available
     *   offer data for that room or board
     * UpsertGroupOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertAccommodationOfferData and UpsertSingleOfferData for information on how to update offer data on
     * different levels with different replacement mechanisms.
     * </pre>
     */
    public com.google.rpc.Status upsertGroupOfferData(com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertGroupOfferDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * - arrival date
     * - length of stay
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board/arrival-date/length-of-stay combination already
     * exists, all information is replaced by the new data. Offer data for the same combination but e.g. for a different
     * arrival date or length of stay is not replaced.
     * UpsertSingleOfferData is meant for for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * - a booking system detected, that the cached price/availability does not match the live data
     * UpsertSingleOfferData is not intended for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier wants to remove offer data
     * See UpsertAccommodationOfferData and UpsertGroupOfferData for information on how to update offer data on
     * higher levels with different replacement mechanisms.
     * </pre>
     */
    public com.google.rpc.Status upsertSingleOfferData(com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertSingleOfferDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The OfferDataService is used to send various offer information about the accommodation portfolio to Peakwork in
   * order to distribute it. Offers contain information about the pricing and availability of the portfolio and can be
   * shared by multiple partners or supplied specifically for single partners (as opposed to base data). This means,
   * that a supplier can send different offer data, e.g. prices, to be used by different partners, while all partners
   * share the same basic information about the portfolio.
   * </pre>
   */
  public static final class OfferDataServiceFutureStub extends io.grpc.stub.AbstractStub<OfferDataServiceFutureStub> {
    private OfferDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OfferDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OfferDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OfferDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * for a supplier.
     * If offer information for the given accommodation/rate combination already exists, all information is replaced by
     * the new data. Offer data for the same accommodation but a different rate is not replaced. Analogously, offer data
     * for the same rate but a different accommodation is also not replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate combination, that are not
     * delivered again in that call.
     * UpsertAccommodationOfferData is the highest level on which to update offer data. It is meant for for the following
     * scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on an accommodation level
     * - a supplier wants to reset the offer data of an accommodation
     * - a supplier wants to remove offer data of an accommodation implicitly by explicitly delivering all available
     *   offer data
     * UpsertAccommodationOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertGroupOfferData and UpsertSingleOfferData for information on how to update offer data on lower levels
     * without replacing all offer data for an accommodation/rate combination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.rpc.Status> upsertAccommodationOfferData(
        com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertAccommodationOfferDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board combination already exists, all information is
     * replaced by the new data. Offer data for the same combination but e.g. for a different room or board is not
     * replaced.
     * This implicitly removes all previously existing offer data of the accommodation/rate/room/board combination,
     * that are not delivered again in the call.
     * UpsertGroupOfferData is meant for for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier's system produces updates of price information on a room or board level for an accommodation
     * - a supplier wants to reset the offer data of a room or board for an accommodation
     * - a supplier wants to remove offer data of a room or board implicitly by explicitly delivering all available
     *   offer data for that room or board
     * UpsertGroupOfferData is not intended for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * See UpsertAccommodationOfferData and UpsertSingleOfferData for information on how to update offer data on
     * different levels with different replacement mechanisms.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.rpc.Status> upsertGroupOfferData(
        com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertGroupOfferDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remark: This call is not yet fully supported!
     * Creates offer data for a given combination of:
     * - accommodation
     * - rate
     * - room
     * - board
     * - arrival date
     * - length of stay
     * for a supplier.
     * If offer information for the given accommodation/rate/room/board/arrival-date/length-of-stay combination already
     * exists, all information is replaced by the new data. Offer data for the same combination but e.g. for a different
     * arrival date or length of stay is not replaced.
     * UpsertSingleOfferData is meant for for the following scenarios:
     * - a single price/allotment has changed
     * - a supplier's system produces updates of price information on arrival date or length of stay level
     * - a booking system detected, that the cached price/availability does not match the live data
     * UpsertSingleOfferData is not intended for the following scenarios:
     * - a supplier wants to run an initial import of the portfolio offer data
     * - a supplier wants to remove offer data
     * See UpsertAccommodationOfferData and UpsertGroupOfferData for information on how to update offer data on
     * higher levels with different replacement mechanisms.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.rpc.Status> upsertSingleOfferData(
        com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertSingleOfferDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPSERT_ACCOMMODATION_OFFER_DATA = 0;
  private static final int METHODID_UPSERT_GROUP_OFFER_DATA = 1;
  private static final int METHODID_UPSERT_SINGLE_OFFER_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OfferDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OfferDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPSERT_ACCOMMODATION_OFFER_DATA:
          serviceImpl.upsertAccommodationOfferData((com.peakwork.api.accommodation.v1.AccommodationOfferDataDeliveryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.rpc.Status>) responseObserver);
          break;
        case METHODID_UPSERT_GROUP_OFFER_DATA:
          serviceImpl.upsertGroupOfferData((com.peakwork.api.accommodation.v1.GroupOfferDataDeliveryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.rpc.Status>) responseObserver);
          break;
        case METHODID_UPSERT_SINGLE_OFFER_DATA:
          serviceImpl.upsertSingleOfferData((com.peakwork.api.accommodation.v1.SingleOfferDataDeliveryRequest) request,
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

  private static abstract class OfferDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OfferDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.peakwork.api.accommodation.v1.AccommodationApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OfferDataService");
    }
  }

  private static final class OfferDataServiceFileDescriptorSupplier
      extends OfferDataServiceBaseDescriptorSupplier {
    OfferDataServiceFileDescriptorSupplier() {}
  }

  private static final class OfferDataServiceMethodDescriptorSupplier
      extends OfferDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OfferDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OfferDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OfferDataServiceFileDescriptorSupplier())
              .addMethod(getUpsertAccommodationOfferDataMethod())
              .addMethod(getUpsertGroupOfferDataMethod())
              .addMethod(getUpsertSingleOfferDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}

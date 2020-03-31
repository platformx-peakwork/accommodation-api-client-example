// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basedata.proto

package com.peakwork.api.accommodation.v1.basedata;

public final class Basedata {
  private Basedata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_NameEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_NameEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_BookingPayloadEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_BookingPayloadEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Coordinates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Coordinates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Rate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Rate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Rate_BookingPayloadEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Rate_BookingPayloadEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Room_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Room_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Room_NameEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Room_NameEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Room_BookingPayloadEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Room_BookingPayloadEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Occupancy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Occupancy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Board_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Board_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Board_NameEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Board_NameEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_peakwork_api_accommodation_v1_basedata_Board_BookingPayloadEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_peakwork_api_accommodation_v1_basedata_Board_BookingPayloadEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016basedata.proto\022&peakwork.api.accommoda" +
      "tion.v1.basedata\032\034google/api/annotations" +
      ".proto\032\027google/rpc/status.proto\032\014common." +
      "proto\"\204\004\n\rAccommodation\022!\n\031supplier_acco" +
      "mmodation_id\030\001 \001(\t\022M\n\004name\030\002 \003(\0132?.peakw" +
      "ork.api.accommodation.v1.basedata.Accomm" +
      "odation.NameEntry\022@\n\007address\030\003 \001(\0132/.pea" +
      "kwork.api.accommodation.v1.basedata.Addr" +
      "ess\022H\n\013coordinates\030\004 \001(\01323.peakwork.api." +
      "accommodation.v1.basedata.Coordinates\022\030\n" +
      "\020arrival_airports\030\005 \003(\t\022\023\n\013star_rating\030\006" +
      " \001(\001\022b\n\017booking_payload\030\007 \003(\0132I.peakwork" +
      ".api.accommodation.v1.basedata.Accommoda" +
      "tion.BookingPayloadEntry\032+\n\tNameEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0325\n\023Booking" +
      "PayloadEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      ":\0028\001\"J\n\007Address\022\014\n\004city\030\001 \001(\t\022\016\n\006street\030" +
      "\002 \001(\t\022\020\n\010zip_code\030\003 \001(\t\022\017\n\007country\030\004 \001(\t" +
      "\"2\n\013Coordinates\022\020\n\010latitude\030\005 \001(\001\022\021\n\tlon" +
      "gitude\030\006 \001(\001\"\363\002\n\004Rate\022\027\n\017rate_identifier" +
      "\030\001 \001(\t\022?\n\014global_types\030\002 \003(\0132).peakwork." +
      "api.accommodation.v1.GlobalType\022Y\n\017booki" +
      "ng_payload\030\003 \003(\0132@.peakwork.api.accommod" +
      "ation.v1.basedata.Rate.BookingPayloadEnt" +
      "ry\022\022\n\nrefundable\030\004 \001(\010\022S\n\020target_compani" +
      "es\030\005 \003(\01629.peakwork.api.accommodation.v1" +
      ".basedata.TargetCompanyType\022\026\n\016target_co" +
      "untry\030\006 \003(\t\0325\n\023BookingPayloadEntry\022\013\n\003ke" +
      "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\253\003\n\004Room\022\027\n\017r" +
      "oom_identifier\030\001 \001(\t\022D\n\004name\030\002 \003(\01326.pea" +
      "kwork.api.accommodation.v1.basedata.Room" +
      ".NameEntry\022?\n\014global_types\030\003 \003(\0132).peakw" +
      "ork.api.accommodation.v1.GlobalType\022Y\n\017b" +
      "ooking_payload\030\004 \003(\0132@.peakwork.api.acco" +
      "mmodation.v1.basedata.Room.BookingPayloa" +
      "dEntry\022D\n\toccupancy\030\005 \001(\01321.peakwork.api" +
      ".accommodation.v1.basedata.Occupancy\032+\n\t" +
      "NameEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\0325\n\023BookingPayloadEntry\022\013\n\003key\030\001 \001(\t\022\r\n" +
      "\005value\030\002 \001(\t:\0028\001\"\350\001\n\tOccupancy\022\017\n\007min_pa" +
      "x\030\001 \001(\005\022\017\n\007max_pax\030\002 \001(\005\022\022\n\nmin_adults\030\003" +
      " \001(\005\022\022\n\nmax_adults\030\004 \001(\005\022\024\n\014min_children" +
      "\030\005 \001(\005\022\024\n\014max_children\030\006 \001(\005\022\025\n\rmin_chil" +
      "d_age\030\007 \001(\005\022\025\n\rmax_child_age\030\010 \001(\005\022\023\n\013ma" +
      "x_infants\030\t \001(\005\022\"\n\032infants_apply_to_occu" +
      "pancy\030\n \001(\010\"\351\002\n\005Board\022\030\n\020board_identifie" +
      "r\030\001 \001(\t\022E\n\004name\030\002 \003(\01327.peakwork.api.acc" +
      "ommodation.v1.basedata.Board.NameEntry\022?" +
      "\n\014global_types\030\003 \003(\0132).peakwork.api.acco" +
      "mmodation.v1.GlobalType\022Z\n\017booking_paylo" +
      "ad\030\004 \003(\0132A.peakwork.api.accommodation.v1" +
      ".basedata.Board.BookingPayloadEntry\032+\n\tN" +
      "ameEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "\0325\n\023BookingPayloadEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001*:\n\021TargetCompanyType\022\n\n\006" +
      "TOUROP\020\000\022\020\n\014METASEARCHER\020\001\022\007\n\003OTA\020\002B.\n*c" +
      "om.peakwork.api.accommodation.v1.basedat" +
      "aP\001b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.peakwork.api.accommodation.v1.common.Common.getDescriptor(),
        }, assigner);
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_descriptor,
        new java.lang.String[] { "SupplierAccommodationId", "Name", "Address", "Coordinates", "ArrivalAirports", "StarRating", "BookingPayload", });
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_NameEntry_descriptor =
      internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_descriptor.getNestedTypes().get(0);
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_NameEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_NameEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_BookingPayloadEntry_descriptor =
      internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_descriptor.getNestedTypes().get(1);
    internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_BookingPayloadEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Accommodation_BookingPayloadEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_peakwork_api_accommodation_v1_basedata_Address_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_peakwork_api_accommodation_v1_basedata_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Address_descriptor,
        new java.lang.String[] { "City", "Street", "ZipCode", "Country", });
    internal_static_peakwork_api_accommodation_v1_basedata_Coordinates_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_peakwork_api_accommodation_v1_basedata_Coordinates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Coordinates_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    internal_static_peakwork_api_accommodation_v1_basedata_Rate_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_peakwork_api_accommodation_v1_basedata_Rate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Rate_descriptor,
        new java.lang.String[] { "RateIdentifier", "GlobalTypes", "BookingPayload", "Refundable", "TargetCompanies", "TargetCountry", });
    internal_static_peakwork_api_accommodation_v1_basedata_Rate_BookingPayloadEntry_descriptor =
      internal_static_peakwork_api_accommodation_v1_basedata_Rate_descriptor.getNestedTypes().get(0);
    internal_static_peakwork_api_accommodation_v1_basedata_Rate_BookingPayloadEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Rate_BookingPayloadEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_peakwork_api_accommodation_v1_basedata_Room_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_peakwork_api_accommodation_v1_basedata_Room_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Room_descriptor,
        new java.lang.String[] { "RoomIdentifier", "Name", "GlobalTypes", "BookingPayload", "Occupancy", });
    internal_static_peakwork_api_accommodation_v1_basedata_Room_NameEntry_descriptor =
      internal_static_peakwork_api_accommodation_v1_basedata_Room_descriptor.getNestedTypes().get(0);
    internal_static_peakwork_api_accommodation_v1_basedata_Room_NameEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Room_NameEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_peakwork_api_accommodation_v1_basedata_Room_BookingPayloadEntry_descriptor =
      internal_static_peakwork_api_accommodation_v1_basedata_Room_descriptor.getNestedTypes().get(1);
    internal_static_peakwork_api_accommodation_v1_basedata_Room_BookingPayloadEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Room_BookingPayloadEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_peakwork_api_accommodation_v1_basedata_Occupancy_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_peakwork_api_accommodation_v1_basedata_Occupancy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Occupancy_descriptor,
        new java.lang.String[] { "MinPax", "MaxPax", "MinAdults", "MaxAdults", "MinChildren", "MaxChildren", "MinChildAge", "MaxChildAge", "MaxInfants", "InfantsApplyToOccupancy", });
    internal_static_peakwork_api_accommodation_v1_basedata_Board_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_peakwork_api_accommodation_v1_basedata_Board_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Board_descriptor,
        new java.lang.String[] { "BoardIdentifier", "Name", "GlobalTypes", "BookingPayload", });
    internal_static_peakwork_api_accommodation_v1_basedata_Board_NameEntry_descriptor =
      internal_static_peakwork_api_accommodation_v1_basedata_Board_descriptor.getNestedTypes().get(0);
    internal_static_peakwork_api_accommodation_v1_basedata_Board_NameEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Board_NameEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_peakwork_api_accommodation_v1_basedata_Board_BookingPayloadEntry_descriptor =
      internal_static_peakwork_api_accommodation_v1_basedata_Board_descriptor.getNestedTypes().get(1);
    internal_static_peakwork_api_accommodation_v1_basedata_Board_BookingPayloadEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_peakwork_api_accommodation_v1_basedata_Board_BookingPayloadEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.peakwork.api.accommodation.v1.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

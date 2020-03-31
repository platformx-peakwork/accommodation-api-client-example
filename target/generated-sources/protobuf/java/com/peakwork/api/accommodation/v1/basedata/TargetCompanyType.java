// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basedata.proto

package com.peakwork.api.accommodation.v1.basedata;

/**
 * <pre>
 * Enumeration of possible company types
 * </pre>
 *
 * Protobuf enum {@code peakwork.api.accommodation.v1.basedata.TargetCompanyType}
 */
public enum TargetCompanyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * A company acting as a tour operator.
   * </pre>
   *
   * <code>TOUROP = 0;</code>
   */
  TOUROP(0),
  /**
   * <pre>
   * A company acting as a meta searcher.
   * </pre>
   *
   * <code>METASEARCHER = 1;</code>
   */
  METASEARCHER(1),
  /**
   * <pre>
   * A company acting as an online travel agency.
   * </pre>
   *
   * <code>OTA = 2;</code>
   */
  OTA(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * A company acting as a tour operator.
   * </pre>
   *
   * <code>TOUROP = 0;</code>
   */
  public static final int TOUROP_VALUE = 0;
  /**
   * <pre>
   * A company acting as a meta searcher.
   * </pre>
   *
   * <code>METASEARCHER = 1;</code>
   */
  public static final int METASEARCHER_VALUE = 1;
  /**
   * <pre>
   * A company acting as an online travel agency.
   * </pre>
   *
   * <code>OTA = 2;</code>
   */
  public static final int OTA_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TargetCompanyType valueOf(int value) {
    return forNumber(value);
  }

  public static TargetCompanyType forNumber(int value) {
    switch (value) {
      case 0: return TOUROP;
      case 1: return METASEARCHER;
      case 2: return OTA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TargetCompanyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TargetCompanyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TargetCompanyType>() {
          public TargetCompanyType findValueByNumber(int number) {
            return TargetCompanyType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.peakwork.api.accommodation.v1.basedata.Basedata.getDescriptor().getEnumTypes().get(0);
  }

  private static final TargetCompanyType[] VALUES = values();

  public static TargetCompanyType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TargetCompanyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:peakwork.api.accommodation.v1.basedata.TargetCompanyType)
}


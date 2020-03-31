// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: offerdata.proto

package com.peakwork.api.accommodation.v1.offerdata;

public interface PersonPriceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:peakwork.api.accommodation.v1.offerdata.PersonPrice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * optional - default: 0 - The price, that applies to the set of persons given by the person filters.
   * </pre>
   *
   * <code>double person_price = 1;</code>
   */
  double getPersonPrice();

  /**
   * <pre>
   * optional - List of person filters, which constitutes the set of persons, that the given price is applied to. The
   * PersonPrice applies to a given person, if at least 1 of the PersonFilter entries applies to the person. See
   * PersonFilter on when a PersonFilter applies to a person.
   * If not given, the price is valid for all persons.
   * </pre>
   *
   * <code>repeated .peakwork.api.accommodation.v1.offerdata.PersonFilter person_filters = 2;</code>
   */
  java.util.List<com.peakwork.api.accommodation.v1.offerdata.PersonFilter> 
      getPersonFiltersList();
  /**
   * <pre>
   * optional - List of person filters, which constitutes the set of persons, that the given price is applied to. The
   * PersonPrice applies to a given person, if at least 1 of the PersonFilter entries applies to the person. See
   * PersonFilter on when a PersonFilter applies to a person.
   * If not given, the price is valid for all persons.
   * </pre>
   *
   * <code>repeated .peakwork.api.accommodation.v1.offerdata.PersonFilter person_filters = 2;</code>
   */
  com.peakwork.api.accommodation.v1.offerdata.PersonFilter getPersonFilters(int index);
  /**
   * <pre>
   * optional - List of person filters, which constitutes the set of persons, that the given price is applied to. The
   * PersonPrice applies to a given person, if at least 1 of the PersonFilter entries applies to the person. See
   * PersonFilter on when a PersonFilter applies to a person.
   * If not given, the price is valid for all persons.
   * </pre>
   *
   * <code>repeated .peakwork.api.accommodation.v1.offerdata.PersonFilter person_filters = 2;</code>
   */
  int getPersonFiltersCount();
  /**
   * <pre>
   * optional - List of person filters, which constitutes the set of persons, that the given price is applied to. The
   * PersonPrice applies to a given person, if at least 1 of the PersonFilter entries applies to the person. See
   * PersonFilter on when a PersonFilter applies to a person.
   * If not given, the price is valid for all persons.
   * </pre>
   *
   * <code>repeated .peakwork.api.accommodation.v1.offerdata.PersonFilter person_filters = 2;</code>
   */
  java.util.List<? extends com.peakwork.api.accommodation.v1.offerdata.PersonFilterOrBuilder> 
      getPersonFiltersOrBuilderList();
  /**
   * <pre>
   * optional - List of person filters, which constitutes the set of persons, that the given price is applied to. The
   * PersonPrice applies to a given person, if at least 1 of the PersonFilter entries applies to the person. See
   * PersonFilter on when a PersonFilter applies to a person.
   * If not given, the price is valid for all persons.
   * </pre>
   *
   * <code>repeated .peakwork.api.accommodation.v1.offerdata.PersonFilter person_filters = 2;</code>
   */
  com.peakwork.api.accommodation.v1.offerdata.PersonFilterOrBuilder getPersonFiltersOrBuilder(
      int index);
}

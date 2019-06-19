// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ListTableSpecsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ListTableSpecsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The table specs read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TableSpec table_specs = 1;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.TableSpec> 
      getTableSpecsList();
  /**
   * <pre>
   * The table specs read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TableSpec table_specs = 1;</code>
   */
  com.google.cloud.automl.v1beta1.TableSpec getTableSpecs(int index);
  /**
   * <pre>
   * The table specs read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TableSpec table_specs = 1;</code>
   */
  int getTableSpecsCount();
  /**
   * <pre>
   * The table specs read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TableSpec table_specs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.TableSpecOrBuilder> 
      getTableSpecsOrBuilderList();
  /**
   * <pre>
   * The table specs read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TableSpec table_specs = 1;</code>
   */
  com.google.cloud.automl.v1beta1.TableSpecOrBuilder getTableSpecsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListTableSpecsRequest.page_token][google.cloud.automl.v1beta1.ListTableSpecsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListTableSpecsRequest.page_token][google.cloud.automl.v1beta1.ListTableSpecsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}

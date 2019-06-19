// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/tables.proto

package com.google.cloud.automl.v1beta1;

public interface TablesModelColumnInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TablesModelColumnInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the ColumnSpec describing the column. Not
   * populated when this proto is outputted to BigQuery.
   * </pre>
   *
   * <code>string column_spec_name = 1;</code>
   */
  java.lang.String getColumnSpecName();
  /**
   * <pre>
   * Output only. The name of the ColumnSpec describing the column. Not
   * populated when this proto is outputted to BigQuery.
   * </pre>
   *
   * <code>string column_spec_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getColumnSpecNameBytes();

  /**
   * <pre>
   * Output only. The display name of the column (same as the display_name of
   * its ColumnSpec).
   * </pre>
   *
   * <code>string column_display_name = 2;</code>
   */
  java.lang.String getColumnDisplayName();
  /**
   * <pre>
   * Output only. The display name of the column (same as the display_name of
   * its ColumnSpec).
   * </pre>
   *
   * <code>string column_display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getColumnDisplayNameBytes();

  /**
   * <pre>
   * Output only.
   * When given as part of a Model (always populated):
   * Measurement of how much model predictions correctness on the TEST data
   * depend on values in this column. A value between 0 and 1, higher means
   * higher influence. These values are normalized - for all input feature
   * columns of a given model they add to 1.
   * When given back by Predict (populated iff
   * [feature_importance
   * param][google.cloud.automl.v1beta1.PredictRequest.params] is set) or Batch
   * Predict (populated iff
   * [feature_importance][google.cloud.automl.v1beta1.PredictRequest.params]
   * param is set):
   * Measurement of how impactful for the prediction returned for the given row
   * the value in this column was. A value between 0 and 1, higher means larger
   * impact. These values are normalized - for all input feature columns of a
   * single predicted row they add to 1.
   * </pre>
   *
   * <code>float feature_importance = 3;</code>
   */
  float getFeatureImportance();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

public interface RowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.Row)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input Only.
   * The resource IDs of the column specs describing the columns of the row.
   * If set must contain, but possibly in a different order, all input feature
   * [column_spec_ids][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * Note: The below `values` field must match order of this field, if this
   * field is set.
   * </pre>
   *
   * <code>repeated string column_spec_ids = 2;</code>
   */
  java.util.List<java.lang.String>
      getColumnSpecIdsList();
  /**
   * <pre>
   * Input Only.
   * The resource IDs of the column specs describing the columns of the row.
   * If set must contain, but possibly in a different order, all input feature
   * [column_spec_ids][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * Note: The below `values` field must match order of this field, if this
   * field is set.
   * </pre>
   *
   * <code>repeated string column_spec_ids = 2;</code>
   */
  int getColumnSpecIdsCount();
  /**
   * <pre>
   * Input Only.
   * The resource IDs of the column specs describing the columns of the row.
   * If set must contain, but possibly in a different order, all input feature
   * [column_spec_ids][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * Note: The below `values` field must match order of this field, if this
   * field is set.
   * </pre>
   *
   * <code>repeated string column_spec_ids = 2;</code>
   */
  java.lang.String getColumnSpecIds(int index);
  /**
   * <pre>
   * Input Only.
   * The resource IDs of the column specs describing the columns of the row.
   * If set must contain, but possibly in a different order, all input feature
   * [column_spec_ids][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * Note: The below `values` field must match order of this field, if this
   * field is set.
   * </pre>
   *
   * <code>repeated string column_spec_ids = 2;</code>
   */
  com.google.protobuf.ByteString
      getColumnSpecIdsBytes(int index);

  /**
   * <pre>
   * Input Only.
   * The values of the row cells, given in the same order as the
   * column_spec_ids, or, if not set, then in the same order as input feature
   * [column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value values = 3;</code>
   */
  java.util.List<com.google.protobuf.Value> 
      getValuesList();
  /**
   * <pre>
   * Input Only.
   * The values of the row cells, given in the same order as the
   * column_spec_ids, or, if not set, then in the same order as input feature
   * [column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value values = 3;</code>
   */
  com.google.protobuf.Value getValues(int index);
  /**
   * <pre>
   * Input Only.
   * The values of the row cells, given in the same order as the
   * column_spec_ids, or, if not set, then in the same order as input feature
   * [column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value values = 3;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * Input Only.
   * The values of the row cells, given in the same order as the
   * column_spec_ids, or, if not set, then in the same order as input feature
   * [column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value values = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * Input Only.
   * The values of the row cells, given in the same order as the
   * column_spec_ids, or, if not set, then in the same order as input feature
   * [column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * of the Model this row is being passed to.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value values = 3;</code>
   */
  com.google.protobuf.ValueOrBuilder getValuesOrBuilder(
      int index);
}

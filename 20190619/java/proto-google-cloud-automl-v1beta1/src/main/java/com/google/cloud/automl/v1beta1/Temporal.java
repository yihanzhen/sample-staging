// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/temporal.proto

package com.google.cloud.automl.v1beta1;

public final class Temporal {
  private Temporal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TimeSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TimeSegment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/automl/v1beta1/temporal.p" +
      "roto\022\033google.cloud.automl.v1beta1\032\036googl" +
      "e/protobuf/duration.proto\032\034google/api/an" +
      "notations.proto\"w\n\013TimeSegment\0224\n\021start_" +
      "time_offset\030\001 \001(\0132\031.google.protobuf.Dura" +
      "tion\0222\n\017end_time_offset\030\002 \001(\0132\031.google.p" +
      "rotobuf.DurationB\204\001\n\037com.google.cloud.au" +
      "toml.v1beta1P\001ZAgoogle.golang.org/genpro" +
      "to/googleapis/cloud/automl/v1beta1;autom" +
      "l\312\002\033Google\\Cloud\\AutoMl\\V1beta1b\006proto3"
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
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_automl_v1beta1_TimeSegment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TimeSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TimeSegment_descriptor,
        new java.lang.String[] { "StartTimeOffset", "EndTimeOffset", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

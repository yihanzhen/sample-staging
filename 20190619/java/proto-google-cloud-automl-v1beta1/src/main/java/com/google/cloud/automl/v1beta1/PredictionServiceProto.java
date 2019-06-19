// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/prediction_service.proto

package com.google.cloud.automl.v1beta1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/automl/v1beta1/prediction" +
      "_service.proto\022\033google.cloud.automl.v1be" +
      "ta1\032\034google/api/annotations.proto\0324googl" +
      "e/cloud/automl/v1beta1/annotation_payloa" +
      "d.proto\032,google/cloud/automl/v1beta1/dat" +
      "a_items.proto\032$google/cloud/automl/v1bet" +
      "a1/io.proto\032,google/cloud/automl/v1beta1" +
      "/operations.proto\032#google/longrunning/op" +
      "erations.proto\032\027google/api/client.proto\"" +
      "\324\001\n\016PredictRequest\022\014\n\004name\030\001 \001(\t\022<\n\007payl" +
      "oad\030\002 \001(\0132+.google.cloud.automl.v1beta1." +
      "ExamplePayload\022G\n\006params\030\003 \003(\01327.google." +
      "cloud.automl.v1beta1.PredictRequest.Para" +
      "msEntry\032-\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\t:\0028\001\"\321\001\n\017PredictResponse\022?\n\007pa" +
      "yload\030\001 \003(\0132..google.cloud.automl.v1beta" +
      "1.AnnotationPayload\022L\n\010metadata\030\002 \003(\0132:." +
      "google.cloud.automl.v1beta1.PredictRespo" +
      "nse.MetadataEntry\032/\n\rMetadataEntry\022\013\n\003ke" +
      "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\272\002\n\023BatchPred" +
      "ictRequest\022\014\n\004name\030\001 \001(\t\022J\n\014input_config" +
      "\030\003 \001(\01324.google.cloud.automl.v1beta1.Bat" +
      "chPredictInputConfig\022L\n\routput_config\030\004 " +
      "\001(\01325.google.cloud.automl.v1beta1.BatchP" +
      "redictOutputConfig\022L\n\006params\030\005 \003(\0132<.goo" +
      "gle.cloud.automl.v1beta1.BatchPredictReq" +
      "uest.ParamsEntry\032-\n\013ParamsEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\024\n\022BatchPredictR" +
      "esult2\264\003\n\021PredictionService\022\250\001\n\007Predict\022" +
      "+.google.cloud.automl.v1beta1.PredictReq" +
      "uest\032,.google.cloud.automl.v1beta1.Predi" +
      "ctResponse\"B\202\323\344\223\002<\"7/v1beta1/{name=proje" +
      "cts/*/locations/*/models/*}:predict:\001*\022\250" +
      "\001\n\014BatchPredict\0220.google.cloud.automl.v1" +
      "beta1.BatchPredictRequest\032\035.google.longr" +
      "unning.Operation\"G\202\323\344\223\002A\"</v1beta1/{name" +
      "=projects/*/locations/*/models/*}:batchP" +
      "redict:\001*\032I\312A\025automl.googleapis.com\322A.ht" +
      "tps://www.googleapis.com/auth/cloud-plat" +
      "formB\234\001\n\037com.google.cloud.automl.v1beta1" +
      "B\026PredictionServiceProtoP\001ZAgoogle.golan" +
      "g.org/genproto/googleapis/cloud/automl/v" +
      "1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1be" +
      "ta1b\006proto3"
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
          com.google.cloud.automl.v1beta1.AnnotationPayloadOuterClass.getDescriptor(),
          com.google.cloud.automl.v1beta1.DataItems.getDescriptor(),
          com.google.cloud.automl.v1beta1.Io.getDescriptor(),
          com.google.cloud.automl.v1beta1.Operations.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_PredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor,
        new java.lang.String[] { "Name", "Payload", "Params", });
    internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_PredictResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor,
        new java.lang.String[] { "Payload", "Metadata", });
    internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor,
        new java.lang.String[] { "Name", "InputConfig", "OutputConfig", "Params", });
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_BatchPredictResult_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1beta1.AnnotationPayloadOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.DataItems.getDescriptor();
    com.google.cloud.automl.v1beta1.Io.getDescriptor();
    com.google.cloud.automl.v1beta1.Operations.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/completion_service.proto

package com.google.cloud.talent.v4beta1;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/talent/v4beta1/completion" +
      "_service.proto\022\033google.cloud.talent.v4be" +
      "ta1\032\034google/api/annotations.proto\032(googl" +
      "e/cloud/talent/v4beta1/common.proto\"\302\003\n\024" +
      "CompleteQueryRequest\022\016\n\006parent\030\001 \001(\t\022\r\n\005" +
      "query\030\002 \001(\t\022\026\n\016language_codes\030\003 \003(\t\022\021\n\tp" +
      "age_size\030\004 \001(\005\022\017\n\007company\030\005 \001(\t\022P\n\005scope" +
      "\030\006 \001(\0162A.google.cloud.talent.v4beta1.Com" +
      "pleteQueryRequest.CompletionScope\022N\n\004typ" +
      "e\030\007 \001(\0162@.google.cloud.talent.v4beta1.Co" +
      "mpleteQueryRequest.CompletionType\"K\n\017Com" +
      "pletionScope\022 \n\034COMPLETION_SCOPE_UNSPECI" +
      "FIED\020\000\022\n\n\006TENANT\020\001\022\n\n\006PUBLIC\020\002\"`\n\016Comple" +
      "tionType\022\037\n\033COMPLETION_TYPE_UNSPECIFIED\020" +
      "\000\022\r\n\tJOB_TITLE\020\001\022\020\n\014COMPANY_NAME\020\002\022\014\n\010CO" +
      "MBINED\020\003\"\305\002\n\025CompleteQueryResponse\022_\n\022co" +
      "mpletion_results\030\001 \003(\0132C.google.cloud.ta" +
      "lent.v4beta1.CompleteQueryResponse.Compl" +
      "etionResult\022?\n\010metadata\030\002 \001(\0132-.google.c" +
      "loud.talent.v4beta1.ResponseMetadata\032\211\001\n" +
      "\020CompletionResult\022\022\n\nsuggestion\030\001 \001(\t\022N\n" +
      "\004type\030\002 \001(\0162@.google.cloud.talent.v4beta" +
      "1.CompleteQueryRequest.CompletionType\022\021\n" +
      "\timage_uri\030\003 \001(\t2\347\001\n\nCompletion\022\330\001\n\rComp" +
      "leteQuery\0221.google.cloud.talent.v4beta1." +
      "CompleteQueryRequest\0322.google.cloud.tale" +
      "nt.v4beta1.CompleteQueryResponse\"`\202\323\344\223\002Z" +
      "\022//v4beta1/{parent=projects/*/tenants/*}" +
      ":completeZ\'\022%/v4beta1/{parent=projects/*" +
      "}:completeB\204\001\n\037com.google.cloud.talent.v" +
      "4beta1B\026CompletionServiceProtoP\001ZAgoogle" +
      ".golang.org/genproto/googleapis/cloud/ta" +
      "lent/v4beta1;talent\242\002\003CTSb\006proto3"
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
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor,
        new java.lang.String[] { "Parent", "Query", "LanguageCodes", "PageSize", "Company", "Scope", "Type", });
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor,
        new java.lang.String[] { "CompletionResults", "Metadata", });
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor =
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor,
        new java.lang.String[] { "Suggestion", "Type", "ImageUri", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

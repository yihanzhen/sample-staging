// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/application_service.proto

package com.google.cloud.talent.v4beta1;

public final class ApplicationServiceProto {
  private ApplicationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/talent/v4beta1/applicatio" +
      "n_service.proto\022\033google.cloud.talent.v4b" +
      "eta1\032\034google/api/annotations.proto\032-goog" +
      "le/cloud/talent/v4beta1/application.prot" +
      "o\032(google/cloud/talent/v4beta1/common.pr" +
      "oto\032\033google/protobuf/empty.proto\032 google" +
      "/protobuf/field_mask.proto\"i\n\030CreateAppl" +
      "icationRequest\022\016\n\006parent\030\001 \001(\t\022=\n\013applic" +
      "ation\030\002 \001(\0132(.google.cloud.talent.v4beta" +
      "1.Application\"%\n\025GetApplicationRequest\022\014" +
      "\n\004name\030\001 \001(\t\"\212\001\n\030UpdateApplicationReques" +
      "t\022=\n\013application\030\001 \001(\0132(.google.cloud.ta" +
      "lent.v4beta1.Application\022/\n\013update_mask\030" +
      "\002 \001(\0132\032.google.protobuf.FieldMask\"(\n\030Del" +
      "eteApplicationRequest\022\014\n\004name\030\001 \001(\t\"P\n\027L" +
      "istApplicationsRequest\022\016\n\006parent\030\001 \001(\t\022\022" +
      "\n\npage_token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\"\264\001" +
      "\n\030ListApplicationsResponse\022>\n\014applicatio" +
      "ns\030\001 \003(\0132(.google.cloud.talent.v4beta1.A" +
      "pplication\022\027\n\017next_page_token\030\002 \001(\t\022?\n\010m" +
      "etadata\030\003 \001(\0132-.google.cloud.talent.v4be" +
      "ta1.ResponseMetadata2\324\007\n\022ApplicationServ" +
      "ice\022\277\001\n\021CreateApplication\0225.google.cloud" +
      ".talent.v4beta1.CreateApplicationRequest" +
      "\032(.google.cloud.talent.v4beta1.Applicati" +
      "on\"I\202\323\344\223\002C\">/v4beta1/{parent=projects/*/" +
      "tenants/*/profiles/*}/applications:\001*\022\266\001" +
      "\n\016GetApplication\0222.google.cloud.talent.v" +
      "4beta1.GetApplicationRequest\032(.google.cl" +
      "oud.talent.v4beta1.Application\"F\202\323\344\223\002@\022>" +
      "/v4beta1/{name=projects/*/tenants/*/prof" +
      "iles/*/applications/*}\022\313\001\n\021UpdateApplica" +
      "tion\0225.google.cloud.talent.v4beta1.Updat" +
      "eApplicationRequest\032(.google.cloud.talen" +
      "t.v4beta1.Application\"U\202\323\344\223\002O2J/v4beta1/" +
      "{application.name=projects/*/tenants/*/p" +
      "rofiles/*/applications/*}:\001*\022\252\001\n\021DeleteA" +
      "pplication\0225.google.cloud.talent.v4beta1" +
      ".DeleteApplicationRequest\032\026.google.proto" +
      "buf.Empty\"F\202\323\344\223\002@*>/v4beta1/{name=projec" +
      "ts/*/tenants/*/profiles/*/applications/*" +
      "}\022\307\001\n\020ListApplications\0224.google.cloud.ta" +
      "lent.v4beta1.ListApplicationsRequest\0325.g" +
      "oogle.cloud.talent.v4beta1.ListApplicati" +
      "onsResponse\"F\202\323\344\223\002@\022>/v4beta1/{parent=pr" +
      "ojects/*/tenants/*/profiles/*}/applicati" +
      "onsB\205\001\n\037com.google.cloud.talent.v4beta1B" +
      "\027ApplicationServiceProtoP\001ZAgoogle.golan" +
      "g.org/genproto/googleapis/cloud/talent/v" +
      "4beta1;talent\242\002\003CTSb\006proto3"
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
          com.google.cloud.talent.v4beta1.ApplicationResourceProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor,
        new java.lang.String[] { "Parent", "Application", });
    internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_GetApplicationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor,
        new java.lang.String[] { "Application", "UpdateMask", });
    internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_DeleteApplicationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListApplicationsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageToken", "PageSize", });
    internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListApplicationsResponse_descriptor,
        new java.lang.String[] { "Applications", "NextPageToken", "Metadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ApplicationResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
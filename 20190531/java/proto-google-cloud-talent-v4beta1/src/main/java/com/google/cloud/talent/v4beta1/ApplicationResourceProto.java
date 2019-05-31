// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/application.proto

package com.google.cloud.talent.v4beta1;

public final class ApplicationResourceProto {
  private ApplicationResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_Application_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Application_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/talent/v4beta1/applicatio" +
      "n.proto\022\033google.cloud.talent.v4beta1\032(go" +
      "ogle/cloud/talent/v4beta1/common.proto\032%" +
      "google/cloud/talent/v4beta1/job.proto\032\037g" +
      "oogle/protobuf/timestamp.proto\032\036google/p" +
      "rotobuf/wrappers.proto\032\026google/type/date" +
      ".proto\032\034google/api/annotations.proto\"\302\007\n" +
      "\013Application\022\014\n\004name\030\001 \001(\t\022\023\n\013external_i" +
      "d\030\037 \001(\t\022\017\n\007profile\030\002 \001(\t\022\013\n\003job\030\004 \001(\t\022\017\n" +
      "\007company\030\005 \001(\t\022+\n\020application_date\030\007 \001(\013" +
      "2\021.google.type.Date\022H\n\005stage\030\013 \001(\01629.goo" +
      "gle.cloud.talent.v4beta1.Application.App" +
      "licationStage\022H\n\005state\030\r \001(\01629.google.cl" +
      "oud.talent.v4beta1.Application.Applicati" +
      "onState\022:\n\ninterviews\030\020 \003(\0132&.google.clo" +
      "ud.talent.v4beta1.Interview\022,\n\010referral\030" +
      "\022 \001(\0132\032.google.protobuf.BoolValue\022/\n\013cre" +
      "ate_time\030\023 \001(\0132\032.google.protobuf.Timesta" +
      "mp\022/\n\013update_time\030\024 \001(\0132\032.google.protobu" +
      "f.Timestamp\022\025\n\routcome_notes\030\025 \001(\t\0225\n\007ou" +
      "tcome\030\026 \001(\0162$.google.cloud.talent.v4beta" +
      "1.Outcome\022,\n\010is_match\030\034 \001(\0132\032.google.pro" +
      "tobuf.BoolValue\022\031\n\021job_title_snippet\030\035 \001" +
      "(\t\"\220\001\n\020ApplicationState\022!\n\035APPLICATION_S" +
      "TATE_UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\026\n\022C" +
      "ANDIDATE_WITHDREW\020\002\022\025\n\021EMPLOYER_WITHDREW" +
      "\020\003\022\r\n\tCOMPLETED\020\004\022\n\n\006CLOSED\020\005\"\251\001\n\020Applic" +
      "ationStage\022!\n\035APPLICATION_STAGE_UNSPECIF" +
      "IED\020\000\022\007\n\003NEW\020\001\022\n\n\006SCREEN\020\002\022\031\n\025HIRING_MAN" +
      "AGER_REVIEW\020\003\022\r\n\tINTERVIEW\020\004\022\022\n\016OFFER_EX" +
      "TENDED\020\005\022\022\n\016OFFER_ACCEPTED\020\006\022\013\n\007STARTED\020" +
      "\007B\206\001\n\037com.google.cloud.talent.v4beta1B\030A" +
      "pplicationResourceProtoP\001ZAgoogle.golang" +
      ".org/genproto/googleapis/cloud/talent/v4" +
      "beta1;talent\242\002\003CTSb\006proto3"
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
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_talent_v4beta1_Application_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Application_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_Application_descriptor,
        new java.lang.String[] { "Name", "ExternalId", "Profile", "Job", "Company", "ApplicationDate", "Stage", "State", "Interviews", "Referral", "CreateTime", "UpdateTime", "OutcomeNotes", "Outcome", "IsMatch", "JobTitleSnippet", });
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
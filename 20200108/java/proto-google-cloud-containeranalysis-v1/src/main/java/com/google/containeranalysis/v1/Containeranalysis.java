// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1/containeranalysis.proto

package com.google.containeranalysis.v1;

public final class Containeranalysis {
  private Containeranalysis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/devtools/containeranalysis/v1/c" +
      "ontaineranalysis.proto\022$google.devtools." +
      "containeranalysis.v1\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\036goo" +
      "gle/iam/v1/iam_policy.proto\032\032google/iam/" +
      "v1/policy.proto\032\037google/protobuf/timesta" +
      "mp.proto2\221\006\n\021ContainerAnalysis\022\322\001\n\014SetIa" +
      "mPolicy\022\".google.iam.v1.SetIamPolicyRequ" +
      "est\032\025.google.iam.v1.Policy\"\206\001\202\323\344\223\002n\"./v1" +
      "/{resource=projects/*/notes/*}:setIamPol" +
      "icy:\001*Z9\"4/v1/{resource=projects/*/occur" +
      "rences/*}:setIamPolicy:\001*\332A\017resource,pol" +
      "icy\022\312\001\n\014GetIamPolicy\022\".google.iam.v1.Get" +
      "IamPolicyRequest\032\025.google.iam.v1.Policy\"" +
      "\177\202\323\344\223\002n\"./v1/{resource=projects/*/notes/" +
      "*}:getIamPolicy:\001*Z9\"4/v1/{resource=proj" +
      "ects/*/occurrences/*}:getIamPolicy:\001*\332A\010" +
      "resource\022\203\002\n\022TestIamPermissions\022(.google" +
      ".iam.v1.TestIamPermissionsRequest\032).goog" +
      "le.iam.v1.TestIamPermissionsResponse\"\227\001\202" +
      "\323\344\223\002z\"4/v1/{resource=projects/*/notes/*}" +
      ":testIamPermissions:\001*Z?\":/v1/{resource=" +
      "projects/*/occurrences/*}:testIamPermiss" +
      "ions:\001*\332A\024resource,permissions\032T\312A conta" +
      "ineranalysis.googleapis.com\322A.https://ww" +
      "w.googleapis.com/auth/cloud-platformB\324\001\n" +
      "\037com.google.containeranalysis.v1P\001ZUgoog" +
      "le.golang.org/genproto/googleapis/devtoo" +
      "ls/containeranalysis/v1;containeranalysi" +
      "s\242\002\003GCA\252\002*Google.Cloud.DevTools.Containe" +
      "rAnalysis.V1\352\002$Google::Cloud::ContainerA" +
      "nalysis::V1b\006proto3"
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
          com.google.api.ClientProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface SkillFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.SkillFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The skill name. For example, "java", "j2ee", and so on.
   * </pre>
   *
   * <code>string skill = 1;</code>
   */
  java.lang.String getSkill();
  /**
   * <pre>
   * Required.
   * The skill name. For example, "java", "j2ee", and so on.
   * </pre>
   *
   * <code>string skill = 1;</code>
   */
  com.google.protobuf.ByteString
      getSkillBytes();

  /**
   * <pre>
   * Optional.
   * Whether to apply negation to the filter so profiles matching the filter
   * are excluded.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   */
  boolean getNegated();
}

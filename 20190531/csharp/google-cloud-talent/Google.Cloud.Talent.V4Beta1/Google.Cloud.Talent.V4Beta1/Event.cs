// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: google/cloud/talent/v4beta1/event.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Google.Cloud.Talent.V4Beta1 {

  /// <summary>Holder for reflection information generated from google/cloud/talent/v4beta1/event.proto</summary>
  public static partial class EventReflection {

    #region Descriptor
    /// <summary>File descriptor for google/cloud/talent/v4beta1/event.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static EventReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Cidnb29nbGUvY2xvdWQvdGFsZW50L3Y0YmV0YTEvZXZlbnQucHJvdG8SG2dv",
            "b2dsZS5jbG91ZC50YWxlbnQudjRiZXRhMRocZ29vZ2xlL2FwaS9hbm5vdGF0",
            "aW9ucy5wcm90bxofZ29vZ2xlL3Byb3RvYnVmL3RpbWVzdGFtcC5wcm90byKC",
            "AgoLQ2xpZW50RXZlbnQSEgoKcmVxdWVzdF9pZBgBIAEoCRIQCghldmVudF9p",
            "ZBgCIAEoCRIvCgtjcmVhdGVfdGltZRgEIAEoCzIaLmdvb2dsZS5wcm90b2J1",
            "Zi5UaW1lc3RhbXASOgoJam9iX2V2ZW50GAUgASgLMiUuZ29vZ2xlLmNsb3Vk",
            "LnRhbGVudC52NGJldGExLkpvYkV2ZW50SAASQgoNcHJvZmlsZV9ldmVudBgG",
            "IAEoCzIpLmdvb2dsZS5jbG91ZC50YWxlbnQudjRiZXRhMS5Qcm9maWxlRXZl",
            "bnRIABITCgtldmVudF9ub3RlcxgJIAEoCUIHCgVldmVudCLvAwoISm9iRXZl",
            "bnQSQAoEdHlwZRgBIAEoDjIyLmdvb2dsZS5jbG91ZC50YWxlbnQudjRiZXRh",
            "MS5Kb2JFdmVudC5Kb2JFdmVudFR5cGUSDAoEam9icxgCIAMoCSKSAwoMSm9i",
            "RXZlbnRUeXBlEh4KGkpPQl9FVkVOVF9UWVBFX1VOU1BFQ0lGSUVEEAASDgoK",
            "SU1QUkVTU0lPThABEggKBFZJRVcQAhIRCg1WSUVXX1JFRElSRUNUEAMSFQoR",
            "QVBQTElDQVRJT05fU1RBUlQQBBIWChJBUFBMSUNBVElPTl9GSU5JU0gQBRIg",
            "ChxBUFBMSUNBVElPTl9RVUlDS19TVUJNSVNTSU9OEAYSGAoUQVBQTElDQVRJ",
            "T05fUkVESVJFQ1QQBxIhCh1BUFBMSUNBVElPTl9TVEFSVF9GUk9NX1NFQVJD",
            "SBAIEiQKIEFQUExJQ0FUSU9OX1JFRElSRUNUX0ZST01fU0VBUkNIEAkSHgoa",
            "QVBQTElDQVRJT05fQ09NUEFOWV9TVUJNSVQQChIMCghCT09LTUFSSxALEhAK",
            "DE5PVElGSUNBVElPThAMEgkKBUhJUkVEEA0SCwoHU0VOVF9DVhAOEhUKEUlO",
            "VEVSVklFV19HUkFOVEVEEA8SEgoOTk9UX0lOVEVSRVNURUQQECLYAQoMUHJv",
            "ZmlsZUV2ZW50EkgKBHR5cGUYASABKA4yOi5nb29nbGUuY2xvdWQudGFsZW50",
            "LnY0YmV0YTEuUHJvZmlsZUV2ZW50LlByb2ZpbGVFdmVudFR5cGUSEAoIcHJv",
            "ZmlsZXMYAiADKAkSDAoEam9icxgGIAMoCSJeChBQcm9maWxlRXZlbnRUeXBl",
            "EiIKHlBST0ZJTEVfRVZFTlRfVFlQRV9VTlNQRUNJRklFRBAAEg4KCklNUFJF",
            "U1NJT04QARIICgRWSUVXEAISDAoIQk9PS01BUksQA0J4Ch9jb20uZ29vZ2xl",
            "LmNsb3VkLnRhbGVudC52NGJldGExQgpFdmVudFByb3RvUAFaQWdvb2dsZS5n",
            "b2xhbmcub3JnL2dlbnByb3RvL2dvb2dsZWFwaXMvY2xvdWQvdGFsZW50L3Y0",
            "YmV0YTE7dGFsZW50ogIDQ1RTYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Google.Api.AnnotationsReflection.Descriptor, global::Google.Protobuf.WellKnownTypes.TimestampReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Google.Cloud.Talent.V4Beta1.ClientEvent), global::Google.Cloud.Talent.V4Beta1.ClientEvent.Parser, new[]{ "RequestId", "EventId", "CreateTime", "JobEvent", "ProfileEvent", "EventNotes" }, new[]{ "Event" }, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Google.Cloud.Talent.V4Beta1.JobEvent), global::Google.Cloud.Talent.V4Beta1.JobEvent.Parser, new[]{ "Type", "Jobs" }, null, new[]{ typeof(global::Google.Cloud.Talent.V4Beta1.JobEvent.Types.JobEventType) }, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Google.Cloud.Talent.V4Beta1.ProfileEvent), global::Google.Cloud.Talent.V4Beta1.ProfileEvent.Parser, new[]{ "Type", "Profiles", "Jobs" }, null, new[]{ typeof(global::Google.Cloud.Talent.V4Beta1.ProfileEvent.Types.ProfileEventType) }, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// An event issued when an end user interacts with the application that
  /// implements Cloud Talent Solution. Providing this information improves the
  /// quality of search and recommendation for the API clients, enabling the
  /// service to perform optimally. The number of events sent must be consistent
  /// with other calls, such as job searches, issued to the service by the client.
  /// </summary>
  public sealed partial class ClientEvent : pb::IMessage<ClientEvent> {
    private static readonly pb::MessageParser<ClientEvent> _parser = new pb::MessageParser<ClientEvent>(() => new ClientEvent());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<ClientEvent> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Google.Cloud.Talent.V4Beta1.EventReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ClientEvent() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ClientEvent(ClientEvent other) : this() {
      requestId_ = other.requestId_;
      eventId_ = other.eventId_;
      createTime_ = other.createTime_ != null ? other.createTime_.Clone() : null;
      eventNotes_ = other.eventNotes_;
      switch (other.EventCase) {
        case EventOneofCase.JobEvent:
          JobEvent = other.JobEvent.Clone();
          break;
        case EventOneofCase.ProfileEvent:
          ProfileEvent = other.ProfileEvent.Clone();
          break;
      }

      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ClientEvent Clone() {
      return new ClientEvent(this);
    }

    /// <summary>Field number for the "request_id" field.</summary>
    public const int RequestIdFieldNumber = 1;
    private string requestId_ = "";
    /// <summary>
    /// Required.
    ///
    /// A unique ID generated in the API responses. It can be found in
    /// [ResponseMetadata.request_id][google.cloud.talent.v4beta1.ResponseMetadata.request_id].
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string RequestId {
      get { return requestId_; }
      set {
        requestId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "event_id" field.</summary>
    public const int EventIdFieldNumber = 2;
    private string eventId_ = "";
    /// <summary>
    /// Required.
    ///
    /// A unique identifier, generated by the client application.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string EventId {
      get { return eventId_; }
      set {
        eventId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "create_time" field.</summary>
    public const int CreateTimeFieldNumber = 4;
    private global::Google.Protobuf.WellKnownTypes.Timestamp createTime_;
    /// <summary>
    /// Required.
    ///
    /// The timestamp of the event.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Protobuf.WellKnownTypes.Timestamp CreateTime {
      get { return createTime_; }
      set {
        createTime_ = value;
      }
    }

    /// <summary>Field number for the "job_event" field.</summary>
    public const int JobEventFieldNumber = 5;
    /// <summary>
    /// An event issued when a job seeker interacts with the application that
    /// implements Cloud Talent Solution.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Cloud.Talent.V4Beta1.JobEvent JobEvent {
      get { return eventCase_ == EventOneofCase.JobEvent ? (global::Google.Cloud.Talent.V4Beta1.JobEvent) event_ : null; }
      set {
        event_ = value;
        eventCase_ = value == null ? EventOneofCase.None : EventOneofCase.JobEvent;
      }
    }

    /// <summary>Field number for the "profile_event" field.</summary>
    public const int ProfileEventFieldNumber = 6;
    /// <summary>
    /// An event issued when a profile searcher interacts with the application
    /// that implements Cloud Talent Solution.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Cloud.Talent.V4Beta1.ProfileEvent ProfileEvent {
      get { return eventCase_ == EventOneofCase.ProfileEvent ? (global::Google.Cloud.Talent.V4Beta1.ProfileEvent) event_ : null; }
      set {
        event_ = value;
        eventCase_ = value == null ? EventOneofCase.None : EventOneofCase.ProfileEvent;
      }
    }

    /// <summary>Field number for the "event_notes" field.</summary>
    public const int EventNotesFieldNumber = 9;
    private string eventNotes_ = "";
    /// <summary>
    /// Optional.
    ///
    /// Notes about the event provided by recruiters or other users, for example,
    /// feedback on why a profile was bookmarked.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string EventNotes {
      get { return eventNotes_; }
      set {
        eventNotes_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    private object event_;
    /// <summary>Enum of possible cases for the "event" oneof.</summary>
    public enum EventOneofCase {
      None = 0,
      JobEvent = 5,
      ProfileEvent = 6,
    }
    private EventOneofCase eventCase_ = EventOneofCase.None;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public EventOneofCase EventCase {
      get { return eventCase_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void ClearEvent() {
      eventCase_ = EventOneofCase.None;
      event_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as ClientEvent);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(ClientEvent other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (RequestId != other.RequestId) return false;
      if (EventId != other.EventId) return false;
      if (!object.Equals(CreateTime, other.CreateTime)) return false;
      if (!object.Equals(JobEvent, other.JobEvent)) return false;
      if (!object.Equals(ProfileEvent, other.ProfileEvent)) return false;
      if (EventNotes != other.EventNotes) return false;
      if (EventCase != other.EventCase) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (RequestId.Length != 0) hash ^= RequestId.GetHashCode();
      if (EventId.Length != 0) hash ^= EventId.GetHashCode();
      if (createTime_ != null) hash ^= CreateTime.GetHashCode();
      if (eventCase_ == EventOneofCase.JobEvent) hash ^= JobEvent.GetHashCode();
      if (eventCase_ == EventOneofCase.ProfileEvent) hash ^= ProfileEvent.GetHashCode();
      if (EventNotes.Length != 0) hash ^= EventNotes.GetHashCode();
      hash ^= (int) eventCase_;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (RequestId.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(RequestId);
      }
      if (EventId.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(EventId);
      }
      if (createTime_ != null) {
        output.WriteRawTag(34);
        output.WriteMessage(CreateTime);
      }
      if (eventCase_ == EventOneofCase.JobEvent) {
        output.WriteRawTag(42);
        output.WriteMessage(JobEvent);
      }
      if (eventCase_ == EventOneofCase.ProfileEvent) {
        output.WriteRawTag(50);
        output.WriteMessage(ProfileEvent);
      }
      if (EventNotes.Length != 0) {
        output.WriteRawTag(74);
        output.WriteString(EventNotes);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (RequestId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(RequestId);
      }
      if (EventId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(EventId);
      }
      if (createTime_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(CreateTime);
      }
      if (eventCase_ == EventOneofCase.JobEvent) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(JobEvent);
      }
      if (eventCase_ == EventOneofCase.ProfileEvent) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(ProfileEvent);
      }
      if (EventNotes.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(EventNotes);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(ClientEvent other) {
      if (other == null) {
        return;
      }
      if (other.RequestId.Length != 0) {
        RequestId = other.RequestId;
      }
      if (other.EventId.Length != 0) {
        EventId = other.EventId;
      }
      if (other.createTime_ != null) {
        if (createTime_ == null) {
          CreateTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        CreateTime.MergeFrom(other.CreateTime);
      }
      if (other.EventNotes.Length != 0) {
        EventNotes = other.EventNotes;
      }
      switch (other.EventCase) {
        case EventOneofCase.JobEvent:
          if (JobEvent == null) {
            JobEvent = new global::Google.Cloud.Talent.V4Beta1.JobEvent();
          }
          JobEvent.MergeFrom(other.JobEvent);
          break;
        case EventOneofCase.ProfileEvent:
          if (ProfileEvent == null) {
            ProfileEvent = new global::Google.Cloud.Talent.V4Beta1.ProfileEvent();
          }
          ProfileEvent.MergeFrom(other.ProfileEvent);
          break;
      }

      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            RequestId = input.ReadString();
            break;
          }
          case 18: {
            EventId = input.ReadString();
            break;
          }
          case 34: {
            if (createTime_ == null) {
              CreateTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(CreateTime);
            break;
          }
          case 42: {
            global::Google.Cloud.Talent.V4Beta1.JobEvent subBuilder = new global::Google.Cloud.Talent.V4Beta1.JobEvent();
            if (eventCase_ == EventOneofCase.JobEvent) {
              subBuilder.MergeFrom(JobEvent);
            }
            input.ReadMessage(subBuilder);
            JobEvent = subBuilder;
            break;
          }
          case 50: {
            global::Google.Cloud.Talent.V4Beta1.ProfileEvent subBuilder = new global::Google.Cloud.Talent.V4Beta1.ProfileEvent();
            if (eventCase_ == EventOneofCase.ProfileEvent) {
              subBuilder.MergeFrom(ProfileEvent);
            }
            input.ReadMessage(subBuilder);
            ProfileEvent = subBuilder;
            break;
          }
          case 74: {
            EventNotes = input.ReadString();
            break;
          }
        }
      }
    }

  }

  /// <summary>
  /// An event issued when a job seeker interacts with the application that
  /// implements Cloud Talent Solution.
  /// </summary>
  public sealed partial class JobEvent : pb::IMessage<JobEvent> {
    private static readonly pb::MessageParser<JobEvent> _parser = new pb::MessageParser<JobEvent>(() => new JobEvent());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<JobEvent> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Google.Cloud.Talent.V4Beta1.EventReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public JobEvent() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public JobEvent(JobEvent other) : this() {
      type_ = other.type_;
      jobs_ = other.jobs_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public JobEvent Clone() {
      return new JobEvent(this);
    }

    /// <summary>Field number for the "type" field.</summary>
    public const int TypeFieldNumber = 1;
    private global::Google.Cloud.Talent.V4Beta1.JobEvent.Types.JobEventType type_ = 0;
    /// <summary>
    /// Required.
    ///
    /// The type of the event (see [JobEventType][google.cloud.talent.v4beta1.JobEvent.JobEventType]).
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Cloud.Talent.V4Beta1.JobEvent.Types.JobEventType Type {
      get { return type_; }
      set {
        type_ = value;
      }
    }

    /// <summary>Field number for the "jobs" field.</summary>
    public const int JobsFieldNumber = 2;
    private static readonly pb::FieldCodec<string> _repeated_jobs_codec
        = pb::FieldCodec.ForString(18);
    private readonly pbc::RepeatedField<string> jobs_ = new pbc::RepeatedField<string>();
    /// <summary>
    /// Required.
    ///
    /// The [job name(s)][google.cloud.talent.v4beta1.Job.name] associated with this event.
    /// For example, if this is an [impression][google.cloud.talent.v4beta1.JobEvent.JobEventType.IMPRESSION] event,
    /// this field contains the identifiers of all jobs shown to the job seeker.
    /// If this was a [view][google.cloud.talent.v4beta1.JobEvent.JobEventType.VIEW] event, this field contains the
    /// identifier of the viewed job.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> Jobs {
      get { return jobs_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as JobEvent);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(JobEvent other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Type != other.Type) return false;
      if(!jobs_.Equals(other.jobs_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Type != 0) hash ^= Type.GetHashCode();
      hash ^= jobs_.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (Type != 0) {
        output.WriteRawTag(8);
        output.WriteEnum((int) Type);
      }
      jobs_.WriteTo(output, _repeated_jobs_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Type != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Type);
      }
      size += jobs_.CalculateSize(_repeated_jobs_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(JobEvent other) {
      if (other == null) {
        return;
      }
      if (other.Type != 0) {
        Type = other.Type;
      }
      jobs_.Add(other.jobs_);
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            Type = (global::Google.Cloud.Talent.V4Beta1.JobEvent.Types.JobEventType) input.ReadEnum();
            break;
          }
          case 18: {
            jobs_.AddEntriesFrom(input, _repeated_jobs_codec);
            break;
          }
        }
      }
    }

    #region Nested types
    /// <summary>Container for nested types declared in the JobEvent message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static partial class Types {
      /// <summary>
      /// An enumeration of an event attributed to the behavior of the end user,
      /// such as a job seeker.
      /// </summary>
      public enum JobEventType {
        /// <summary>
        /// The event is unspecified by other provided values.
        /// </summary>
        [pbr::OriginalName("JOB_EVENT_TYPE_UNSPECIFIED")] Unspecified = 0,
        /// <summary>
        /// The job seeker or other entity interacting with the service has
        /// had a job rendered in their view, such as in a list of search results in
        /// a compressed or clipped format. This event is typically associated with
        /// the viewing of a jobs list on a single page by a job seeker.
        /// </summary>
        [pbr::OriginalName("IMPRESSION")] Impression = 1,
        /// <summary>
        /// The job seeker, or other entity interacting with the service, has
        /// viewed the details of a job, including the full description. This
        /// event doesn't apply to the viewing a snippet of a job appearing as a
        /// part of the job search results. Viewing a snippet is associated with an
        /// [impression][google.cloud.talent.v4beta1.JobEvent.JobEventType.IMPRESSION]).
        /// </summary>
        [pbr::OriginalName("VIEW")] View = 2,
        /// <summary>
        /// The job seeker or other entity interacting with the service
        /// performed an action to view a job and was redirected to a different
        /// website for job.
        /// </summary>
        [pbr::OriginalName("VIEW_REDIRECT")] ViewRedirect = 3,
        /// <summary>
        /// The job seeker or other entity interacting with the service
        /// began the process or demonstrated the intention of applying for a job.
        /// </summary>
        [pbr::OriginalName("APPLICATION_START")] ApplicationStart = 4,
        /// <summary>
        /// The job seeker or other entity interacting with the service
        /// submitted an application for a job.
        /// </summary>
        [pbr::OriginalName("APPLICATION_FINISH")] ApplicationFinish = 5,
        /// <summary>
        /// The job seeker or other entity interacting with the service
        /// submitted an application for a job with a single click without
        /// entering information. If a job seeker performs this action, send only
        /// this event to the service. Do not also send
        /// [JobEventType.APPLICATION_START][google.cloud.talent.v4beta1.JobEvent.JobEventType.APPLICATION_START] or [JobEventType.APPLICATION_FINISH][google.cloud.talent.v4beta1.JobEvent.JobEventType.APPLICATION_FINISH]
        /// events.
        /// </summary>
        [pbr::OriginalName("APPLICATION_QUICK_SUBMISSION")] ApplicationQuickSubmission = 6,
        /// <summary>
        /// The job seeker or other entity interacting with the service
        /// performed an action to apply to a job and was redirected to a different
        /// website to complete the application.
        /// </summary>
        [pbr::OriginalName("APPLICATION_REDIRECT")] ApplicationRedirect = 7,
        /// <summary>
        /// The job seeker or other entity interacting with the service began the
        /// process or demonstrated the intention of applying for a job from the
        /// search results page without viewing the details of the job posting.
        /// If sending this event, JobEventType.VIEW event shouldn't be sent.
        /// </summary>
        [pbr::OriginalName("APPLICATION_START_FROM_SEARCH")] ApplicationStartFromSearch = 8,
        /// <summary>
        /// The job seeker, or other entity interacting with the service, performs an
        /// action with a single click from the search results page to apply to a job
        /// (without viewing the details of the job posting), and is redirected
        /// to a different website to complete the application. If a candidate
        /// performs this action, send only this event to the service. Do not also
        /// send [JobEventType.APPLICATION_START][google.cloud.talent.v4beta1.JobEvent.JobEventType.APPLICATION_START],
        /// [JobEventType.APPLICATION_FINISH][google.cloud.talent.v4beta1.JobEvent.JobEventType.APPLICATION_FINISH] or [JobEventType.VIEW][google.cloud.talent.v4beta1.JobEvent.JobEventType.VIEW] events.
        /// </summary>
        [pbr::OriginalName("APPLICATION_REDIRECT_FROM_SEARCH")] ApplicationRedirectFromSearch = 9,
        /// <summary>
        /// This event should be used when a company submits an application
        /// on behalf of a job seeker. This event is intended for use by staffing
        /// agencies attempting to place candidates.
        /// </summary>
        [pbr::OriginalName("APPLICATION_COMPANY_SUBMIT")] ApplicationCompanySubmit = 10,
        /// <summary>
        /// The job seeker or other entity interacting with the service demonstrated
        /// an interest in a job by bookmarking or saving it.
        /// </summary>
        [pbr::OriginalName("BOOKMARK")] Bookmark = 11,
        /// <summary>
        /// The job seeker or other entity interacting with the service was
        /// sent a notification, such as an email alert or device notification,
        /// containing one or more jobs listings generated by the service.
        /// </summary>
        [pbr::OriginalName("NOTIFICATION")] Notification = 12,
        /// <summary>
        /// The job seeker or other entity interacting with the service was
        /// employed by the hiring entity (employer). Send this event
        /// only if the job seeker was hired through an application that was
        /// initiated by a search conducted through the Cloud Talent Solution
        /// service.
        /// </summary>
        [pbr::OriginalName("HIRED")] Hired = 13,
        /// <summary>
        /// A recruiter or staffing agency submitted an application on behalf of the
        /// candidate after interacting with the service to identify a suitable job
        /// posting.
        /// </summary>
        [pbr::OriginalName("SENT_CV")] SentCv = 14,
        /// <summary>
        /// The entity interacting with the service (for example, the job seeker),
        /// was granted an initial interview by the hiring entity (employer). This
        /// event should only be sent if the job seeker was granted an interview as
        /// part of an application that was initiated by a search conducted through /
        /// recommendation provided by the Cloud Talent Solution service.
        /// </summary>
        [pbr::OriginalName("INTERVIEW_GRANTED")] InterviewGranted = 15,
        /// <summary>
        /// The job seeker or other entity interacting with the service showed
        /// no interest in the job.
        /// </summary>
        [pbr::OriginalName("NOT_INTERESTED")] NotInterested = 16,
      }

    }
    #endregion

  }

  /// <summary>
  /// An event issued when a profile searcher interacts with the application
  /// that implements Cloud Talent Solution.
  /// </summary>
  public sealed partial class ProfileEvent : pb::IMessage<ProfileEvent> {
    private static readonly pb::MessageParser<ProfileEvent> _parser = new pb::MessageParser<ProfileEvent>(() => new ProfileEvent());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<ProfileEvent> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Google.Cloud.Talent.V4Beta1.EventReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ProfileEvent() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ProfileEvent(ProfileEvent other) : this() {
      type_ = other.type_;
      profiles_ = other.profiles_.Clone();
      jobs_ = other.jobs_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ProfileEvent Clone() {
      return new ProfileEvent(this);
    }

    /// <summary>Field number for the "type" field.</summary>
    public const int TypeFieldNumber = 1;
    private global::Google.Cloud.Talent.V4Beta1.ProfileEvent.Types.ProfileEventType type_ = 0;
    /// <summary>
    /// Required.
    ///
    /// Type of event.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Cloud.Talent.V4Beta1.ProfileEvent.Types.ProfileEventType Type {
      get { return type_; }
      set {
        type_ = value;
      }
    }

    /// <summary>Field number for the "profiles" field.</summary>
    public const int ProfilesFieldNumber = 2;
    private static readonly pb::FieldCodec<string> _repeated_profiles_codec
        = pb::FieldCodec.ForString(18);
    private readonly pbc::RepeatedField<string> profiles_ = new pbc::RepeatedField<string>();
    /// <summary>
    /// Required.
    ///
    /// The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated with this client event.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> Profiles {
      get { return profiles_; }
    }

    /// <summary>Field number for the "jobs" field.</summary>
    public const int JobsFieldNumber = 6;
    private static readonly pb::FieldCodec<string> _repeated_jobs_codec
        = pb::FieldCodec.ForString(50);
    private readonly pbc::RepeatedField<string> jobs_ = new pbc::RepeatedField<string>();
    /// <summary>
    /// Optional.
    ///
    /// The job ID associated with this client event if there is one. Leave it
    /// empty if the event isn't associated with a job.
    ///
    /// The job ID should be consistent with the
    /// [JobApplication.job.requisition_id][] in the profile.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> Jobs {
      get { return jobs_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as ProfileEvent);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(ProfileEvent other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Type != other.Type) return false;
      if(!profiles_.Equals(other.profiles_)) return false;
      if(!jobs_.Equals(other.jobs_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Type != 0) hash ^= Type.GetHashCode();
      hash ^= profiles_.GetHashCode();
      hash ^= jobs_.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (Type != 0) {
        output.WriteRawTag(8);
        output.WriteEnum((int) Type);
      }
      profiles_.WriteTo(output, _repeated_profiles_codec);
      jobs_.WriteTo(output, _repeated_jobs_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Type != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Type);
      }
      size += profiles_.CalculateSize(_repeated_profiles_codec);
      size += jobs_.CalculateSize(_repeated_jobs_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(ProfileEvent other) {
      if (other == null) {
        return;
      }
      if (other.Type != 0) {
        Type = other.Type;
      }
      profiles_.Add(other.profiles_);
      jobs_.Add(other.jobs_);
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            Type = (global::Google.Cloud.Talent.V4Beta1.ProfileEvent.Types.ProfileEventType) input.ReadEnum();
            break;
          }
          case 18: {
            profiles_.AddEntriesFrom(input, _repeated_profiles_codec);
            break;
          }
          case 50: {
            jobs_.AddEntriesFrom(input, _repeated_jobs_codec);
            break;
          }
        }
      }
    }

    #region Nested types
    /// <summary>Container for nested types declared in the ProfileEvent message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static partial class Types {
      /// <summary>
      /// The enum represents types of client events for a candidate profile.
      /// </summary>
      public enum ProfileEventType {
        /// <summary>
        /// Default value.
        /// </summary>
        [pbr::OriginalName("PROFILE_EVENT_TYPE_UNSPECIFIED")] Unspecified = 0,
        /// <summary>
        /// The profile is displayed.
        /// </summary>
        [pbr::OriginalName("IMPRESSION")] Impression = 1,
        /// <summary>
        /// The profile is viewed.
        /// </summary>
        [pbr::OriginalName("VIEW")] View = 2,
        /// <summary>
        /// The profile is bookmarked.
        /// </summary>
        [pbr::OriginalName("BOOKMARK")] Bookmark = 3,
      }

    }
    #endregion

  }

  #endregion

}

#endregion Designer generated code

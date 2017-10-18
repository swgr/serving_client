// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/summary.proto

package org.tensorflow.framework;

public final class SummaryProtos {
  private SummaryProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SummaryDescription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SummaryDescription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_HistogramProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_HistogramProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SummaryMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SummaryMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SummaryMetadata_PluginData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SummaryMetadata_PluginData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_Image_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_Audio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_Audio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_Value_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'tensorflow/core/framework/summary.prot" +
      "o\022\ntensorflow\032&tensorflow/core/framework" +
      "/tensor.proto\"\'\n\022SummaryDescription\022\021\n\tt" +
      "ype_hint\030\001 \001(\t\"\207\001\n\016HistogramProto\022\013\n\003min" +
      "\030\001 \001(\001\022\013\n\003max\030\002 \001(\001\022\013\n\003num\030\003 \001(\001\022\013\n\003sum\030" +
      "\004 \001(\001\022\023\n\013sum_squares\030\005 \001(\001\022\030\n\014bucket_lim" +
      "it\030\006 \003(\001B\002\020\001\022\022\n\006bucket\030\007 \003(\001B\002\020\001\"\265\001\n\017Sum" +
      "maryMetadata\022;\n\013plugin_data\030\001 \001(\0132&.tens" +
      "orflow.SummaryMetadata.PluginData\022\024\n\014dis" +
      "play_name\030\002 \001(\t\022\033\n\023summary_description\030\003",
      " \001(\t\0322\n\nPluginData\022\023\n\013plugin_name\030\001 \001(\t\022" +
      "\017\n\007content\030\002 \001(\014\"\336\004\n\007Summary\022(\n\005value\030\001 " +
      "\003(\0132\031.tensorflow.Summary.Value\032X\n\005Image\022" +
      "\016\n\006height\030\001 \001(\005\022\r\n\005width\030\002 \001(\005\022\022\n\ncolors" +
      "pace\030\003 \001(\005\022\034\n\024encoded_image_string\030\004 \001(\014" +
      "\032}\n\005Audio\022\023\n\013sample_rate\030\001 \001(\002\022\024\n\014num_ch" +
      "annels\030\002 \001(\003\022\025\n\rlength_frames\030\003 \001(\003\022\034\n\024e" +
      "ncoded_audio_string\030\004 \001(\014\022\024\n\014content_typ" +
      "e\030\005 \001(\t\032\317\002\n\005Value\022\021\n\tnode_name\030\007 \001(\t\022\013\n\003" +
      "tag\030\001 \001(\t\022-\n\010metadata\030\t \001(\0132\033.tensorflow",
      ".SummaryMetadata\022\026\n\014simple_value\030\002 \001(\002H\000" +
      "\022&\n\034obsolete_old_style_histogram\030\003 \001(\014H\000" +
      "\022*\n\005image\030\004 \001(\0132\031.tensorflow.Summary.Ima" +
      "geH\000\022+\n\005histo\030\005 \001(\0132\032.tensorflow.Histogr" +
      "amProtoH\000\022*\n\005audio\030\006 \001(\0132\031.tensorflow.Su" +
      "mmary.AudioH\000\022)\n\006tensor\030\010 \001(\0132\027.tensorfl" +
      "ow.TensorProtoH\000B\007\n\005valueB.\n\030org.tensorf" +
      "low.frameworkB\rSummaryProtosP\001\370\001\001b\006proto" +
      "3"
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
          org.tensorflow.framework.TensorProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_SummaryDescription_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_SummaryDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SummaryDescription_descriptor,
        new java.lang.String[] { "TypeHint", });
    internal_static_tensorflow_HistogramProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_HistogramProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_HistogramProto_descriptor,
        new java.lang.String[] { "Min", "Max", "Num", "Sum", "SumSquares", "BucketLimit", "Bucket", });
    internal_static_tensorflow_SummaryMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_SummaryMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SummaryMetadata_descriptor,
        new java.lang.String[] { "PluginData", "DisplayName", "SummaryDescription", });
    internal_static_tensorflow_SummaryMetadata_PluginData_descriptor =
      internal_static_tensorflow_SummaryMetadata_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_SummaryMetadata_PluginData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SummaryMetadata_PluginData_descriptor,
        new java.lang.String[] { "PluginName", "Content", });
    internal_static_tensorflow_Summary_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_Summary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_Summary_Image_descriptor =
      internal_static_tensorflow_Summary_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_Summary_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_Image_descriptor,
        new java.lang.String[] { "Height", "Width", "Colorspace", "EncodedImageString", });
    internal_static_tensorflow_Summary_Audio_descriptor =
      internal_static_tensorflow_Summary_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_Summary_Audio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_Audio_descriptor,
        new java.lang.String[] { "SampleRate", "NumChannels", "LengthFrames", "EncodedAudioString", "ContentType", });
    internal_static_tensorflow_Summary_Value_descriptor =
      internal_static_tensorflow_Summary_descriptor.getNestedTypes().get(2);
    internal_static_tensorflow_Summary_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_Value_descriptor,
        new java.lang.String[] { "NodeName", "Tag", "Metadata", "SimpleValue", "ObsoleteOldStyleHistogram", "Image", "Histo", "Audio", "Tensor", "Value", });
    org.tensorflow.framework.TensorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

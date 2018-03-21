// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface VideoAnnotationResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  java.lang.String getInputUri();
  /**
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getInputUriBytes();

  /**
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.LabelAnnotation> 
      getSegmentLabelAnnotationsList();
  /**
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.LabelAnnotation getSegmentLabelAnnotations(int index);
  /**
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  int getSegmentLabelAnnotationsCount();
  /**
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.LabelAnnotationOrBuilder> 
      getSegmentLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.LabelAnnotationOrBuilder getSegmentLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.LabelAnnotation> 
      getShotLabelAnnotationsList();
  /**
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.LabelAnnotation getShotLabelAnnotations(int index);
  /**
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  int getShotLabelAnnotationsCount();
  /**
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.LabelAnnotationOrBuilder> 
      getShotLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.LabelAnnotationOrBuilder getShotLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.LabelAnnotation> 
      getFrameLabelAnnotationsList();
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.LabelAnnotation getFrameLabelAnnotations(int index);
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  int getFrameLabelAnnotationsCount();
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.LabelAnnotationOrBuilder> 
      getFrameLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.LabelAnnotationOrBuilder getFrameLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotation> 
      getFaceDetectionAnnotationsList();
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotation getFaceDetectionAnnotations(int index);
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  int getFaceDetectionAnnotationsCount();
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotationOrBuilder> 
      getFaceDetectionAnnotationsOrBuilderList();
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.FaceDetectionAnnotationOrBuilder getFaceDetectionAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.VideoSegment shot_annotations = 6;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.VideoSegment> 
      getShotAnnotationsList();
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.VideoSegment shot_annotations = 6;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.VideoSegment getShotAnnotations(int index);
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.VideoSegment shot_annotations = 6;</code>
   */
  int getShotAnnotationsCount();
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.VideoSegment shot_annotations = 6;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.VideoSegmentOrBuilder> 
      getShotAnnotationsOrBuilderList();
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.VideoSegment shot_annotations = 6;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.VideoSegmentOrBuilder getShotAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation explicit_annotation = 7;</code>
   */
  boolean hasExplicitAnnotation();
  /**
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation explicit_annotation = 7;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation getExplicitAnnotation();
  /**
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation explicit_annotation = 7;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotationOrBuilder getExplicitAnnotationOrBuilder();

  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription> 
      getSpeechTranscriptionsList();
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription getSpeechTranscriptions(int index);
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  int getSpeechTranscriptionsCount();
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.SpeechTranscriptionOrBuilder> 
      getSpeechTranscriptionsOrBuilderList();
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.SpeechTranscriptionOrBuilder getSpeechTranscriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  boolean hasError();
  /**
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
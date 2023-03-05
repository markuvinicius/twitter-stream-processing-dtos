package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaEntityDTO {

    @JsonProperty
    private double id;

    @JsonProperty
    private String type;

    @JsonProperty
    private String mediaUrl;

    @JsonProperty
    private List<MediaEntityMetaDataDTO> sizes;

    @JsonProperty
    private String MediaUrlHttps;

    @JsonProperty
    private int videoAspectRatioWidth;

    @JsonProperty
    private int videoAspectRatioHeight;

    @JsonProperty
    private double videoDurationMillis;

    @JsonProperty
    private MediaEntityVariantDTO[] videoVariants;

    @JsonProperty
    private String extAltText;

    @JsonProperty
    private String url;

    @JsonProperty
    private String text;

    @JsonProperty
    private String expandedUrl;

    @JsonProperty
    private int start;

    @JsonProperty
    private int end;

    @JsonProperty
    private String displayUrl;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public List<MediaEntityMetaDataDTO> getSizes() {
        return sizes;
    }

    public void setSizes(List<MediaEntityMetaDataDTO> sizes) {
        this.sizes = sizes;
    }

    public String getMediaUrlHttps() {
        return MediaUrlHttps;
    }

    public void setMediaUrlHttps(String mediaUrlHttps) {
        MediaUrlHttps = mediaUrlHttps;
    }

    public int getVideoAspectRatioWidth() {
        return videoAspectRatioWidth;
    }

    public void setVideoAspectRatioWidth(int videoAspectRatioWidth) {
        this.videoAspectRatioWidth = videoAspectRatioWidth;
    }

    public int getVideoAspectRatioHeight() {
        return videoAspectRatioHeight;
    }

    public void setVideoAspectRatioHeight(int videoAspectRatioHeight) {
        this.videoAspectRatioHeight = videoAspectRatioHeight;
    }

    public double getVideoDurationMillis() {
        return videoDurationMillis;
    }

    public void setVideoDurationMillis(double videoDurationMillis) {
        this.videoDurationMillis = videoDurationMillis;
    }

    public MediaEntityVariantDTO[] getVideoVariants() {
        return videoVariants;
    }

    public void setVideoVariants(MediaEntityVariantDTO[] videoVariants) {
        this.videoVariants = videoVariants;
    }

    public String getExtAltText() {
        return extAltText;
    }

    public void setExtAltText(String extAltText) {
        this.extAltText = extAltText;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }
}

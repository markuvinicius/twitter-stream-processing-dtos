package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtendedMediaEntityDTO {

    @JsonProperty
    private int videoAspectRatioWidth;

    @JsonProperty
    private int videoAspectRatioHeight;

    @JsonProperty
    private int videoDurationMillis;

    @JsonProperty
    private MediaEntityVariantDTO[] videoVariants;

    @JsonProperty
    private String extAllText;

    @JsonProperty
    private double id;

    @JsonProperty
    private String type;

    @JsonProperty
    private String mediaUrl;

    @JsonProperty
    private Map<Integer,MediaEntitySizeDTO> sizes;

    @JsonProperty
    private String mediaUrlHttps;

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

    public int getVideoDurationMillis() {
        return videoDurationMillis;
    }

    public void setVideoDurationMillis(int videoDurationMillis) {
        this.videoDurationMillis = videoDurationMillis;
    }

    public MediaEntityVariantDTO[] getVideoVariants() {
        return videoVariants;
    }

    public void setVideoVariants(MediaEntityVariantDTO[] videoVariants) {
        this.videoVariants = videoVariants;
    }

    public String getExtAllText() {
        return extAllText;
    }

    public void setExtAllText(String extAllText) {
        this.extAllText = extAllText;
    }

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

    public Map<Integer, MediaEntitySizeDTO> getSizes() {
        return sizes;
    }

    public void setSizes(Map<Integer, MediaEntitySizeDTO> sizes) {
        this.sizes = sizes;
    }

    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    public void setMediaUrlHttps(String mediaUrlHttps) {
        this.mediaUrlHttps = mediaUrlHttps;
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

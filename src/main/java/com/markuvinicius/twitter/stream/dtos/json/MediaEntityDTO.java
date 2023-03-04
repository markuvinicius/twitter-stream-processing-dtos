package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private Map<Integer, MediaEntitySizeDTO> sizes;

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
}

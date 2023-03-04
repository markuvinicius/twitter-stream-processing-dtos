package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaEntityVariantDTO {

    @JsonProperty
    private String url;

    @JsonProperty
    private int bitRate;

    @JsonProperty
    private String contentType;
}

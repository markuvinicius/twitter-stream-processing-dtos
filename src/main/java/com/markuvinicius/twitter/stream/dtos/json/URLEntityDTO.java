package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class URLEntityDTO {
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

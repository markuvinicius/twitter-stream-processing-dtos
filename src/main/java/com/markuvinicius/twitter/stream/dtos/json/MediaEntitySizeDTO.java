package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaEntitySizeDTO {

    @JsonProperty
    private int resize;

    @JsonProperty
    private int width;

    @JsonProperty
    private int height;
}

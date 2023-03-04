package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HashTagEntityDTO {

    @JsonProperty
    private String text;

    @JsonProperty
    private int start;

    @JsonProperty
    private int end;
}

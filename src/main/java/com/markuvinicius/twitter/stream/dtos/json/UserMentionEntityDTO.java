package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserMentionEntityDTO {
    @JsonProperty
    private String name;

    @JsonProperty
    private double id;

    @JsonProperty
    private String text;

    @JsonProperty
    private String screenName;

    @JsonProperty
    private int start;

    @JsonProperty
    private int end;
}

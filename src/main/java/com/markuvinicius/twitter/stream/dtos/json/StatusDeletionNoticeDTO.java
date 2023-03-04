package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusDeletionNoticeDTO {
    @JsonProperty
    private double statusId;

    @JsonProperty
    private double userId;
}

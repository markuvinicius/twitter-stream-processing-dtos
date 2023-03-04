package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusDeletionNoticeDTO {
    @JsonProperty
    private double statusId;

    @JsonProperty
    private double userId;

    public double getStatusId() {
        return statusId;
    }

    public void setStatusId(double statusId) {
        this.statusId = statusId;
    }

    public double getUserId() {
        return userId;
    }

    public void setUserId(double userId) {
        this.userId = userId;
    }
}

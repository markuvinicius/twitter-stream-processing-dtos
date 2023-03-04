package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceDTO {

    @JsonProperty
    private String name;

    @JsonProperty
    private String streetAddress;

    @JsonProperty
    private String countryCode;

    @JsonProperty
    private String id;

    @JsonProperty
    private String country;

    @JsonProperty
    private String placeType;

    @JsonProperty
    private String url;

    @JsonProperty
    private String fullName;
}

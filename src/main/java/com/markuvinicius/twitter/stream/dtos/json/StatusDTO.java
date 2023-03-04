package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusDTO {

    @JsonProperty
    private long createdAt;

    @JsonProperty
    private double id;

    @JsonProperty
    private String text;

    @JsonProperty
    private String source;

    @JsonProperty
    private boolean truncated;

    @JsonProperty
    private double inReplyToStatusId;

    @JsonProperty
    private double inReplyToUserId;

    @JsonProperty
    private String inReplyToScreenName;

    @JsonProperty
    private GeoLocationDTO geoLocation;

    @JsonProperty
    private PlaceDTO place;

    @JsonProperty
    private boolean favorited;

    @JsonProperty
    private boolean retweeted;

    @JsonProperty
    private int favoriteCount;

    @JsonProperty
    private UserDTO user;

    @JsonProperty
    private boolean retweet;

    @JsonProperty
    private double[] contributors;

    @JsonProperty
    private int retweetCount;

    @JsonProperty
    private boolean retweetedByMe;

    @JsonProperty
    private int currentUserRetweetId;

    @JsonProperty
    private boolean possibleSensitive;

    @JsonProperty
    private String lang;

    @JsonProperty
    private String[] withheldInCountries;

    @JsonProperty
    private HashTagEntityDTO[] hashTagEntities;

    @JsonProperty
    private UserMentionEntityDTO[] userMentions;

    @JsonProperty
    private MediaEntityDTO[] mediaEntities;

    @JsonProperty
    private SymbolEntityDTO[] symbolEntities;

    @JsonProperty
    private URLEntityDTO[] urlEntities;
}

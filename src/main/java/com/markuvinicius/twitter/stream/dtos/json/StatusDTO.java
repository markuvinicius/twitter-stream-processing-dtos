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
    private boolean possiblySensitive;

    @JsonProperty
    private String lang;

    @JsonProperty
    private String[] withheldInCountries;

    @JsonProperty
    private HashTagEntityDTO[] hashTagEntities;

    @JsonProperty
    private UserMentionEntityDTO[] userMentionEntities;

    @JsonProperty
    private MediaEntityDTO[] mediaEntities;

    @JsonProperty
    private SymbolEntityDTO[] symbolEntities;

    @JsonProperty
    private URLEntityDTO[] urlEntities;

    @JsonProperty
    private double retweetedStatusId;

    @JsonProperty
    private double retweetedUserId;

    @JsonProperty
    private double quotedStatusId;

    @JsonProperty
    private double quotedUserId;

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public double getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(double inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public double getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(double inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public GeoLocationDTO getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocationDTO geoLocation) {
        this.geoLocation = geoLocation;
    }

    public PlaceDTO getPlace() {
        return place;
    }

    public void setPlace(PlaceDTO place) {
        this.place = place;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public boolean isRetweet() {
        return retweet;
    }

    public void setRetweet(boolean retweet) {
        this.retweet = retweet;
    }

    public double[] getContributors() {
        return contributors;
    }

    public void setContributors(double[] contributors) {
        this.contributors = contributors;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    public boolean isRetweetedByMe() {
        return retweetedByMe;
    }

    public void setRetweetedByMe(boolean retweetedByMe) {
        this.retweetedByMe = retweetedByMe;
    }

    public int getCurrentUserRetweetId() {
        return currentUserRetweetId;
    }

    public void setCurrentUserRetweetId(int currentUserRetweetId) {
        this.currentUserRetweetId = currentUserRetweetId;
    }

    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String[] getWithheldInCountries() {
        return withheldInCountries;
    }

    public void setWithheldInCountries(String[] withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }

    public HashTagEntityDTO[] getHashTagEntities() {
        return hashTagEntities;
    }

    public void setHashTagEntities(HashTagEntityDTO[] hashTagEntities) {
        this.hashTagEntities = hashTagEntities;
    }

    public UserMentionEntityDTO[] getUserMentionEntities() {
        return userMentionEntities;
    }

    public void setUserMentionEntities(UserMentionEntityDTO[] userMentionEntities) {
        this.userMentionEntities = userMentionEntities;
    }

    public MediaEntityDTO[] getMediaEntities() {
        return mediaEntities;
    }

    public void setMediaEntities(MediaEntityDTO[] mediaEntities) {
        this.mediaEntities = mediaEntities;
    }

    public SymbolEntityDTO[] getSymbolEntities() {
        return symbolEntities;
    }

    public void setSymbolEntities(SymbolEntityDTO[] symbolEntities) {
        this.symbolEntities = symbolEntities;
    }

    public URLEntityDTO[] getUrlEntities() {
        return urlEntities;
    }

    public void setUrlEntities(URLEntityDTO[] urlEntities) {
        this.urlEntities = urlEntities;
    }

    public double getRetweetedStatusId() {
        return retweetedStatusId;
    }

    public void setRetweetedStatusId(double retweetedStatusId) {
        this.retweetedStatusId = retweetedStatusId;
    }

    public double getRetweetedUserId() {
        return retweetedUserId;
    }

    public void setRetweetedUserId(double retweetedUserId) {
        this.retweetedUserId = retweetedUserId;
    }

    public double getQuotedStatusId() {
        return quotedStatusId;
    }

    public void setQuotedStatusId(double quotedStatusId) {
        this.quotedStatusId = quotedStatusId;
    }

    public double getQuotedUserId() {
        return quotedUserId;
    }

    public void setQuotedUserId(double quotedUserId) {
        this.quotedUserId = quotedUserId;
    }
}

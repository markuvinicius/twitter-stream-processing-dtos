package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    @JsonProperty
    private double id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String screenName;

    @JsonProperty
    private String location;

    @JsonProperty
    private String description;

    @JsonProperty
    private boolean contributorsEnabled;

    @JsonProperty
    private String profileImageUrl;

    @JsonProperty
    private String biggerProfileImageURL;

    @JsonProperty
    private String miniProfileImageURL;

    @JsonProperty
    private String originalProfileImageURL;

    @JsonProperty
    private String profileImageURLHttps;

    @JsonProperty
    private String biggerProfileImageURLHttps;

    @JsonProperty
    private String miniProfileImageURLHttps;

    @JsonProperty
    private String originalProfileImageURLHttps;

    @JsonProperty
    private boolean defaultProfileImage;

    @JsonProperty
    private String url;

    @JsonProperty(required = false)
    private boolean isProtected;

    @JsonProperty
    private int followersCount;

    @JsonProperty
    private String profileBackgroundColor;

    @JsonProperty
    private String profileTextColor;

    @JsonProperty
    private String profileLinkColor;

    @JsonProperty
    private String profileSidebarFillColor;

    @JsonProperty
    private String profileSidebarBorderColor;

    @JsonProperty
    private boolean profileUseBackgroundImage;

    @JsonProperty
    private boolean defaultProfile;

    @JsonProperty
    private boolean showAllInlineMedia;

    @JsonProperty
    private int friendsCount;

    @JsonProperty
    private long createdAt;

    @JsonProperty
    private int favouritesCount;

    @JsonProperty
    private int utcOffset;

    @JsonProperty
    private String timeZone;

    @JsonProperty
    private String profileBackgroundImageURL;

    @JsonProperty
    private String profileBackgroundImageUrlHttps;

    @JsonProperty
    private String profileBannerURL;

    @JsonProperty
    private String profileBannerRetinaURL;

    @JsonProperty
    private String profileBannerIPadURL;

    @JsonProperty
    private String profileBannerIPadRetinaURL;

    @JsonProperty
    private String profileBannerMobileURL;

    @JsonProperty
    private String profileBannerMobileRetinaURL;

    @JsonProperty
    private boolean profileBackgroundTiled;

    @JsonProperty
    private String lang;

    @JsonProperty
    private int statusesCount;

    @JsonProperty
    private boolean geoEnabled;

    @JsonProperty
    private boolean verified;

    @JsonProperty
    private boolean translator;

    @JsonProperty
    private int listedCount;

    @JsonProperty
    private boolean followRequestSent;

    @JsonProperty
    private String[] withheldInCountries;


    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getBiggerProfileImageURL() {
        return biggerProfileImageURL;
    }

    public void setBiggerProfileImageURL(String biggerProfileImageURL) {
        this.biggerProfileImageURL = biggerProfileImageURL;
    }

    public String getMiniProfileImageURL() {
        return miniProfileImageURL;
    }

    public void setMiniProfileImageURL(String miniProfileImageURL) {
        this.miniProfileImageURL = miniProfileImageURL;
    }

    public String getOriginalProfileImageURL() {
        return originalProfileImageURL;
    }

    public void setOriginalProfileImageURL(String originalProfileImageURL) {
        this.originalProfileImageURL = originalProfileImageURL;
    }

    public String getProfileImageURLHttps() {
        return profileImageURLHttps;
    }

    public void setProfileImageURLHttps(String profileImageURLHttps) {
        this.profileImageURLHttps = profileImageURLHttps;
    }

    public String getBiggerProfileImageURLHttps() {
        return biggerProfileImageURLHttps;
    }

    public void setBiggerProfileImageURLHttps(String biggerProfileImageURLHttps) {
        this.biggerProfileImageURLHttps = biggerProfileImageURLHttps;
    }

    public String getMiniProfileImageURLHttps() {
        return miniProfileImageURLHttps;
    }

    public void setMiniProfileImageURLHttps(String miniProfileImageURLHttps) {
        this.miniProfileImageURLHttps = miniProfileImageURLHttps;
    }

    public String getOriginalProfileImageURLHttps() {
        return originalProfileImageURLHttps;
    }

    public void setOriginalProfileImageURLHttps(String originalProfileImageURLHttps) {
        this.originalProfileImageURLHttps = originalProfileImageURLHttps;
    }

    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public boolean isShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    public void setShowAllInlineMedia(boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(int favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public int getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getProfileBackgroundImageURL() {
        return profileBackgroundImageURL;
    }

    public void setProfileBackgroundImageURL(String profileBackgroundImageURL) {
        this.profileBackgroundImageURL = profileBackgroundImageURL;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public String getProfileBannerURL() {
        return profileBannerURL;
    }

    public void setProfileBannerURL(String profileBannerURL) {
        this.profileBannerURL = profileBannerURL;
    }

    public String getProfileBannerRetinaURL() {
        return profileBannerRetinaURL;
    }

    public void setProfileBannerRetinaURL(String profileBannerRetinaURL) {
        this.profileBannerRetinaURL = profileBannerRetinaURL;
    }

    public String getProfileBannerIPadURL() {
        return profileBannerIPadURL;
    }

    public void setProfileBannerIPadURL(String profileBannerIPadURL) {
        this.profileBannerIPadURL = profileBannerIPadURL;
    }

    public String getProfileBannerIPadRetinaURL() {
        return profileBannerIPadRetinaURL;
    }

    public void setProfileBannerIPadRetinaURL(String profileBannerIPadRetinaURL) {
        this.profileBannerIPadRetinaURL = profileBannerIPadRetinaURL;
    }

    public String getProfileBannerMobileURL() {
        return profileBannerMobileURL;
    }

    public void setProfileBannerMobileURL(String profileBannerMobileURL) {
        this.profileBannerMobileURL = profileBannerMobileURL;
    }

    public String getProfileBannerMobileRetinaURL() {
        return profileBannerMobileRetinaURL;
    }

    public void setProfileBannerMobileRetinaURL(String profileBannerMobileRetinaURL) {
        this.profileBannerMobileRetinaURL = profileBannerMobileRetinaURL;
    }

    public boolean isProfileBackgroundTiled() {
        return profileBackgroundTiled;
    }

    public void setProfileBackgroundTiled(boolean profileBackgroundTiled) {
        this.profileBackgroundTiled = profileBackgroundTiled;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(int statusesCount) {
        this.statusesCount = statusesCount;
    }

    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isTranslator() {
        return translator;
    }

    public void setTranslator(boolean translator) {
        this.translator = translator;
    }

    public int getListedCount() {
        return listedCount;
    }

    public void setListedCount(int listedCount) {
        this.listedCount = listedCount;
    }

    public boolean isFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public String[] getWithheldInCountries() {
        return withheldInCountries;
    }

    public void setWithheldInCountries(String[] withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }
}

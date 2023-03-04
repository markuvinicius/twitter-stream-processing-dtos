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

    public int getResize() {
        return resize;
    }

    public void setResize(int resize) {
        this.resize = resize;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

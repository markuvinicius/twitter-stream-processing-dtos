package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaEntityMetaDataDTO {

    @JsonProperty
    private int index;

    @JsonProperty
    private MediaEntitySizeDTO size;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public MediaEntitySizeDTO getSize() {
        return size;
    }

    public void setSize(MediaEntitySizeDTO size) {
        this.size = size;
    }
}

package com.markuvinicius.twitter.stream.json;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

public class JsonSerDe<T> implements Serde<T> {

    private final Class<T> type;

    public JsonSerDe(Class<T> type) {
        this.type = type;
    }


    @Override
    public Serializer<T> serializer() {
        return new JsonSerializer<>();
    }

    @Override
    public Deserializer<T> deserializer() {
        return new JsonDeserializer<T>(type);
    }
}

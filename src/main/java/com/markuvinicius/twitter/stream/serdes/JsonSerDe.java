package com.markuvinicius.twitter.stream.serdes;

import com.markuvinicius.twitter.stream.json.JsonDeserializer;
import com.markuvinicius.twitter.stream.json.JsonSerializer;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;

public class JsonSerDe<T> implements ISerde<T> {

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

    @Override
    public Serde<T> getSerde() {
        return Serdes.serdeFrom( this.serializer(), this.deserializer());
    }
}

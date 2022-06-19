package com.markuvinicius.twitter.stream.serdes;

import org.apache.kafka.common.serialization.Serde;

public interface ISerde<T> extends Serde<T>{
    Serde<T> getSerde();
}

package com.markuvinicius.twitter.stream.dtos.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class MediaEntityDTOTest {

    private ObjectMapper mapper;

    public MediaEntityDTOTest() {
        mapper = new ObjectMapper()
                .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void testSerialization() throws JsonProcessingException {
        String inputJson = "\n" +
                "{  \n" +
                "      \"Id\": 1632025880565370881,\n" +
                "      \"Type\": \"video\",\n" +
                "      \"MediaURL\": \"http://pbs.twimg.com/ext_tw_video_thumb/1632025880565370881/pu/img/0d3JP_dLWXCw7WAm.jpg\",\n" +
                "      \"Sizes\": [\n" +
                "        [\n" +
                "          0,\n" +
                "          {\n" +
                "            \"Resize\": 101,\n" +
                "            \"Width\": 150,\n" +
                "            \"Height\": 150\n" +
                "          }\n" +
                "        ],\n" +
                "        [\n" +
                "          1,\n" +
                "          {\n" +
                "            \"Resize\": 100,\n" +
                "            \"Width\": 680,\n" +
                "            \"Height\": 383\n" +
                "          }\n" +
                "        ]\n" +
                "      ],\n" +
                "      \"MediaURLHttps\": \"https://pbs.twimg.com/ext_tw_video_thumb/1632025880565370881/pu/img/0d3JP_dLWXCw7WAm.jpg\",\n" +
                "      \"VideoAspectRatioWidth\": 16,\n" +
                "      \"VideoAspectRatioHeight\": 9,\n" +
                "      \"VideoDurationMillis\": 334700,\n" +
                "      \"VideoVariants\": [\n" +
                "        {\n" +
                "          \"Url\": \"https://video.twimg.com/ext_tw_video/1632025880565370881/pu/vid/1280x720/-H37PXYzwwu76VYM.mp4?tag=12\",\n" +
                "          \"Bitrate\": 2176000,\n" +
                "          \"ContentType\": \"video/mp4\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"Url\": \"https://video.twimg.com/ext_tw_video/1632025880565370881/pu/vid/480x270/nKl82rJaJNRQACAt.mp4?tag=12\",\n" +
                "          \"Bitrate\": 256000,\n" +
                "          \"ContentType\": \"video/mp4\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"Url\": \"https://video.twimg.com/ext_tw_video/1632025880565370881/pu/pl/Gx9uXesgpfZ7AYt-.m3u8?tag=12&container=fmp4\",\n" +
                "          \"Bitrate\": 0,\n" +
                "          \"ContentType\": \"application/x-mpegURL\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"Url\": \"https://video.twimg.com/ext_tw_video/1632025880565370881/pu/vid/640x360/2PLJcAiuQhjDSBhT.mp4?tag=12\",\n" +
                "          \"Bitrate\": 832000,\n" +
                "          \"ContentType\": \"video/mp4\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"ExtAltText\": null,\n" +
                "      \"URL\": \"https://t.co/OVQ78BjQ9I\",\n" +
                "      \"Text\": \"https://t.co/OVQ78BjQ9I\",\n" +
                "      \"ExpandedURL\": \"https://twitter.com/GayerGus/status/1632026191187066880/video/1\",\n" +
                "      \"Start\": 98,\n" +
                "      \"End\": 121,\n" +
                "      \"DisplayURL\": \"pic.twitter.com/OVQ78BjQ9I\"\n" +
                "}";

        MediaEntityDTO mediaEntityDTO = mapper.readValue(inputJson, MediaEntityDTO.class);


    }

}

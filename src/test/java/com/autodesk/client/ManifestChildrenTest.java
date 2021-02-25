package com.autodesk.client;

import com.autodesk.client.model.ManifestChildren;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import junit.framework.TestCase;

public class ManifestChildrenTest extends TestCase {

    /**
     * phaseNames kan zowel een JsArray zijn als een JsString
     */
    public void testPhaseNames() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        objectMapper.registerModule(new JodaModule());
        objectMapper.setDateFormat(ApiClient.buildDefaultDateFormat());

        objectMapper.readerFor(ManifestChildren.class).readValue("{\"phaseNames\": \"New Construction\"}");

        objectMapper.readerFor(ManifestChildren.class).readValue(
                "{\"phaseNames\": [\n" +
                        "                        \"New Construction\",\n" +
                        "                        \"Unfolded\"\n" +
                        "                    ]}");


    }
}

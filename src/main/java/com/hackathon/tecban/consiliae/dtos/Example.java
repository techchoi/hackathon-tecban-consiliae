package com.hackathon.tecban.consiliae.dtos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Data",
    "Links",
    "Meta"
})
public class Example {

    @JsonProperty("Data")
    private Data data;
    @JsonProperty("Links")
    private Links links;
    @JsonProperty("Meta")
    private Meta meta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Data")
    public Data getData() {
        return data;
    }

    @JsonProperty("Data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("Links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("Meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("Meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

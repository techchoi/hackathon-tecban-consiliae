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
    "Amount",
    "CreditDebitIndicator",
    "Type"
})
public class Balance {

    @JsonProperty("Amount")
    private Amount_ amount;
    @JsonProperty("CreditDebitIndicator")
    private String creditDebitIndicator;
    @JsonProperty("Type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Amount")
    public Amount_ getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Amount_ amount) {
        this.amount = amount;
    }

    @JsonProperty("CreditDebitIndicator")
    public String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    @JsonProperty("CreditDebitIndicator")
    public void setCreditDebitIndicator(String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
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


package com.backbase.training.rest.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "cashIn",
    "cashOut",
    "totalPortfolioValue",
    "valueChangeRate"
})
public class Datapoint {

    @JsonProperty("cashIn")
    private Long cashIn;
    @JsonProperty("cashOut")
    private Long cashOut;
    @JsonProperty("totalPortfolioValue")
    private Double totalPortfolioValue;
    @JsonProperty("valueChangeRate")
    private Double valueChangeRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The cashIn
     */
    @JsonProperty("cashIn")
    public Long getCashIn() {
        return cashIn;
    }

    /**
     * 
     * @param cashIn
     *     The cashIn
     */
    @JsonProperty("cashIn")
    public void setCashIn(Long cashIn) {
        this.cashIn = cashIn;
    }

    /**
     * 
     * @return
     *     The cashOut
     */
    @JsonProperty("cashOut")
    public Long getCashOut() {
        return cashOut;
    }

    /**
     * 
     * @param cashOut
     *     The cashOut
     */
    @JsonProperty("cashOut")
    public void setCashOut(Long cashOut) {
        this.cashOut = cashOut;
    }

    /**
     * 
     * @return
     *     The totalPortfolioValue
     */
    @JsonProperty("totalPortfolioValue")
    public Double getTotalPortfolioValue() {
        return totalPortfolioValue;
    }

    /**
     * 
     * @param totalPortfolioValue
     *     The totalPortfolioValue
     */
    @JsonProperty("totalPortfolioValue")
    public void setTotalPortfolioValue(Double totalPortfolioValue) {
        this.totalPortfolioValue = totalPortfolioValue;
    }

    /**
     * 
     * @return
     *     The valueChangeRate
     */
    @JsonProperty("valueChangeRate")
    public Double getValueChangeRate() {
        return valueChangeRate;
    }

    /**
     * 
     * @param valueChangeRate
     *     The valueChangeRate
     */
    @JsonProperty("valueChangeRate")
    public void setValueChangeRate(Double valueChangeRate) {
        this.valueChangeRate = valueChangeRate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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

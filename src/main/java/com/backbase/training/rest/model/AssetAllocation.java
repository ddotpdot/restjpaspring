
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
    "equities",
    "bonds",
    "cash",
    "other"
})
public class AssetAllocation {

    @JsonProperty("equities")
    private Double equities;
    @JsonProperty("bonds")
    private Double bonds;
    @JsonProperty("cash")
    private Double cash;
    @JsonProperty("other")
    private Double other;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The equities
     */
    @JsonProperty("equities")
    public Double getEquities() {
        return equities;
    }

    /**
     * 
     * @param equities
     *     The equities
     */
    @JsonProperty("equities")
    public void setEquities(Double equities) {
        this.equities = equities;
    }

    /**
     * 
     * @return
     *     The bonds
     */
    @JsonProperty("bonds")
    public Double getBonds() {
        return bonds;
    }

    /**
     * 
     * @param bonds
     *     The bonds
     */
    @JsonProperty("bonds")
    public void setBonds(Double bonds) {
        this.bonds = bonds;
    }

    /**
     * 
     * @return
     *     The cash
     */
    @JsonProperty("cash")
    public Double getCash() {
        return cash;
    }

    /**
     * 
     * @param cash
     *     The cash
     */
    @JsonProperty("cash")
    public void setCash(Double cash) {
        this.cash = cash;
    }

    /**
     * 
     * @return
     *     The other
     */
    @JsonProperty("other")
    public Double getOther() {
        return other;
    }

    /**
     * 
     * @param other
     *     The other
     */
    @JsonProperty("other")
    public void setOther(Double other) {
        this.other = other;
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

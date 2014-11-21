
package com.backbase.training.rest.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "yearly",
    "monthly"
})
public class TotalPortfolioValueOverPeriod {

    @JsonProperty("yearly")
    private List<Yearly> yearly = new ArrayList<Yearly>();
    @JsonProperty("monthly")
    private List<Monthly> monthly = new ArrayList<Monthly>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The yearly
     */
    @JsonProperty("yearly")
    public List<Yearly> getYearly() {
        return yearly;
    }

    /**
     * 
     * @param yearly
     *     The yearly
     */
    @JsonProperty("yearly")
    public void setYearly(List<Yearly> yearly) {
        this.yearly = yearly;
    }

    /**
     * 
     * @return
     *     The monthly
     */
    @JsonProperty("monthly")
    public List<Monthly> getMonthly() {
        return monthly;
    }

    /**
     * 
     * @param monthly
     *     The monthly
     */
    @JsonProperty("monthly")
    public void setMonthly(List<Monthly> monthly) {
        this.monthly = monthly;
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

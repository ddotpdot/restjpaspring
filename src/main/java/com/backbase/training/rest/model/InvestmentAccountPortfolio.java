
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
    "accountId",
    "performanceAvailable",
    "totalPortfolioValueOverPeriod",
    "allocations"
})
public class InvestmentAccountPortfolio {

    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("performanceAvailable")
    private Boolean performanceAvailable;
    @JsonProperty("totalPortfolioValueOverPeriod")
    private TotalPortfolioValueOverPeriod totalPortfolioValueOverPeriod;
    @JsonProperty("allocations")
    private List<Allocation> allocations = new ArrayList<Allocation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The accountId
     */
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The accountId
     */
    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     The performanceAvailable
     */
    @JsonProperty("performanceAvailable")
    public Boolean getPerformanceAvailable() {
        return performanceAvailable;
    }

    /**
     * 
     * @param performanceAvailable
     *     The performanceAvailable
     */
    @JsonProperty("performanceAvailable")
    public void setPerformanceAvailable(Boolean performanceAvailable) {
        this.performanceAvailable = performanceAvailable;
    }

    /**
     * 
     * @return
     *     The totalPortfolioValueOverPeriod
     */
    @JsonProperty("totalPortfolioValueOverPeriod")
    public TotalPortfolioValueOverPeriod getTotalPortfolioValueOverPeriod() {
        return totalPortfolioValueOverPeriod;
    }

    /**
     * 
     * @param totalPortfolioValueOverPeriod
     *     The totalPortfolioValueOverPeriod
     */
    @JsonProperty("totalPortfolioValueOverPeriod")
    public void setTotalPortfolioValueOverPeriod(TotalPortfolioValueOverPeriod totalPortfolioValueOverPeriod) {
        this.totalPortfolioValueOverPeriod = totalPortfolioValueOverPeriod;
    }

    /**
     * 
     * @return
     *     The allocations
     */
    @JsonProperty("allocations")
    public List<Allocation> getAllocations() {
        return allocations;
    }

    /**
     * 
     * @param allocations
     *     The allocations
     */
    @JsonProperty("allocations")
    public void setAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
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

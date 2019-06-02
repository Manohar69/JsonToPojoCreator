
package com.humana.hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalSvcLineChargeAmt",
    "svcLineOutOfBalance",
    "totalSvcLinePaid",
    "totalChargePaidAndAdjustments",
    "svcLinesOutOfBalance"
})
public class BalancingReport {

    @JsonProperty("totalSvcLineChargeAmt")
    private String totalSvcLineChargeAmt;
    @JsonProperty("svcLineOutOfBalance")
    private String svcLineOutOfBalance;
    @JsonProperty("totalSvcLinePaid")
    private String totalSvcLinePaid;
    @JsonProperty("totalChargePaidAndAdjustments")
    private String totalChargePaidAndAdjustments;
    @JsonProperty("svcLinesOutOfBalance")
    private List<SvcLinesOutOfBalance> svcLinesOutOfBalance = new ArrayList<SvcLinesOutOfBalance>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalSvcLineChargeAmt")
    public String getTotalSvcLineChargeAmt() {
        return totalSvcLineChargeAmt;
    }

    @JsonProperty("totalSvcLineChargeAmt")
    public void setTotalSvcLineChargeAmt(String totalSvcLineChargeAmt) {
        this.totalSvcLineChargeAmt = totalSvcLineChargeAmt;
    }

    public BalancingReport withTotalSvcLineChargeAmt(String totalSvcLineChargeAmt) {
        this.totalSvcLineChargeAmt = totalSvcLineChargeAmt;
        return this;
    }

    @JsonProperty("svcLineOutOfBalance")
    public String getSvcLineOutOfBalance() {
        return svcLineOutOfBalance;
    }

    @JsonProperty("svcLineOutOfBalance")
    public void setSvcLineOutOfBalance(String svcLineOutOfBalance) {
        this.svcLineOutOfBalance = svcLineOutOfBalance;
    }

    public BalancingReport withSvcLineOutOfBalance(String svcLineOutOfBalance) {
        this.svcLineOutOfBalance = svcLineOutOfBalance;
        return this;
    }

    @JsonProperty("totalSvcLinePaid")
    public String getTotalSvcLinePaid() {
        return totalSvcLinePaid;
    }

    @JsonProperty("totalSvcLinePaid")
    public void setTotalSvcLinePaid(String totalSvcLinePaid) {
        this.totalSvcLinePaid = totalSvcLinePaid;
    }

    public BalancingReport withTotalSvcLinePaid(String totalSvcLinePaid) {
        this.totalSvcLinePaid = totalSvcLinePaid;
        return this;
    }

    @JsonProperty("totalChargePaidAndAdjustments")
    public String getTotalChargePaidAndAdjustments() {
        return totalChargePaidAndAdjustments;
    }

    @JsonProperty("totalChargePaidAndAdjustments")
    public void setTotalChargePaidAndAdjustments(String totalChargePaidAndAdjustments) {
        this.totalChargePaidAndAdjustments = totalChargePaidAndAdjustments;
    }

    public BalancingReport withTotalChargePaidAndAdjustments(String totalChargePaidAndAdjustments) {
        this.totalChargePaidAndAdjustments = totalChargePaidAndAdjustments;
        return this;
    }

    @JsonProperty("svcLinesOutOfBalance")
    public List<SvcLinesOutOfBalance> getSvcLinesOutOfBalance() {
        return svcLinesOutOfBalance;
    }

    @JsonProperty("svcLinesOutOfBalance")
    public void setSvcLinesOutOfBalance(List<SvcLinesOutOfBalance> svcLinesOutOfBalance) {
        this.svcLinesOutOfBalance = svcLinesOutOfBalance;
    }

    public BalancingReport withSvcLinesOutOfBalance(List<SvcLinesOutOfBalance> svcLinesOutOfBalance) {
        this.svcLinesOutOfBalance = svcLinesOutOfBalance;
        return this;
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

    public BalancingReport withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalSvcLineChargeAmt).append(svcLineOutOfBalance).append(totalSvcLinePaid).append(totalChargePaidAndAdjustments).append(svcLinesOutOfBalance).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalancingReport) == false) {
            return false;
        }
        BalancingReport rhs = ((BalancingReport) other);
        return new EqualsBuilder().append(totalSvcLineChargeAmt, rhs.totalSvcLineChargeAmt).append(svcLineOutOfBalance, rhs.svcLineOutOfBalance).append(totalSvcLinePaid, rhs.totalSvcLinePaid).append(totalChargePaidAndAdjustments, rhs.totalChargePaidAndAdjustments).append(svcLinesOutOfBalance, rhs.svcLinesOutOfBalance).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

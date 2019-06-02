
package com.humana.hero;

import java.util.HashMap;
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
    "dbInfoSourceId",
    "billingPrvHierLevel",
    "billingPrvName",
    "payToAddrName",
    "payToPlanName"
})
public class Provider {

    @JsonProperty("dbInfoSourceId")
    private Integer dbInfoSourceId;
    @JsonProperty("billingPrvHierLevel")
    private BillingPrvHierLevel billingPrvHierLevel;
    @JsonProperty("billingPrvName")
    private BillingPrvName billingPrvName;
    @JsonProperty("payToAddrName")
    private PayToAddrName payToAddrName;
    @JsonProperty("payToPlanName")
    private PayToPlanName payToPlanName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbInfoSourceId")
    public Integer getDbInfoSourceId() {
        return dbInfoSourceId;
    }

    @JsonProperty("dbInfoSourceId")
    public void setDbInfoSourceId(Integer dbInfoSourceId) {
        this.dbInfoSourceId = dbInfoSourceId;
    }

    public Provider withDbInfoSourceId(Integer dbInfoSourceId) {
        this.dbInfoSourceId = dbInfoSourceId;
        return this;
    }

    @JsonProperty("billingPrvHierLevel")
    public BillingPrvHierLevel getBillingPrvHierLevel() {
        return billingPrvHierLevel;
    }

    @JsonProperty("billingPrvHierLevel")
    public void setBillingPrvHierLevel(BillingPrvHierLevel billingPrvHierLevel) {
        this.billingPrvHierLevel = billingPrvHierLevel;
    }

    public Provider withBillingPrvHierLevel(BillingPrvHierLevel billingPrvHierLevel) {
        this.billingPrvHierLevel = billingPrvHierLevel;
        return this;
    }

    @JsonProperty("billingPrvName")
    public BillingPrvName getBillingPrvName() {
        return billingPrvName;
    }

    @JsonProperty("billingPrvName")
    public void setBillingPrvName(BillingPrvName billingPrvName) {
        this.billingPrvName = billingPrvName;
    }

    public Provider withBillingPrvName(BillingPrvName billingPrvName) {
        this.billingPrvName = billingPrvName;
        return this;
    }

    @JsonProperty("payToAddrName")
    public PayToAddrName getPayToAddrName() {
        return payToAddrName;
    }

    @JsonProperty("payToAddrName")
    public void setPayToAddrName(PayToAddrName payToAddrName) {
        this.payToAddrName = payToAddrName;
    }

    public Provider withPayToAddrName(PayToAddrName payToAddrName) {
        this.payToAddrName = payToAddrName;
        return this;
    }

    @JsonProperty("payToPlanName")
    public PayToPlanName getPayToPlanName() {
        return payToPlanName;
    }

    @JsonProperty("payToPlanName")
    public void setPayToPlanName(PayToPlanName payToPlanName) {
        this.payToPlanName = payToPlanName;
    }

    public Provider withPayToPlanName(PayToPlanName payToPlanName) {
        this.payToPlanName = payToPlanName;
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

    public Provider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbInfoSourceId).append(billingPrvHierLevel).append(billingPrvName).append(payToAddrName).append(payToPlanName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Provider) == false) {
            return false;
        }
        Provider rhs = ((Provider) other);
        return new EqualsBuilder().append(dbInfoSourceId, rhs.dbInfoSourceId).append(billingPrvHierLevel, rhs.billingPrvHierLevel).append(billingPrvName, rhs.billingPrvName).append(payToAddrName, rhs.payToAddrName).append(payToPlanName, rhs.payToPlanName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

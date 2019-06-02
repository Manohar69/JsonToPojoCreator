
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
    "ref01_billingProviderUpinQlfr",
    "ref02_billingProviderUpinNo"
})
public class RefBillingProviderUpin {

    @JsonProperty("ref01_billingProviderUpinQlfr")
    private String ref01BillingProviderUpinQlfr;
    @JsonProperty("ref02_billingProviderUpinNo")
    private String ref02BillingProviderUpinNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_billingProviderUpinQlfr")
    public String getRef01BillingProviderUpinQlfr() {
        return ref01BillingProviderUpinQlfr;
    }

    @JsonProperty("ref01_billingProviderUpinQlfr")
    public void setRef01BillingProviderUpinQlfr(String ref01BillingProviderUpinQlfr) {
        this.ref01BillingProviderUpinQlfr = ref01BillingProviderUpinQlfr;
    }

    public RefBillingProviderUpin withRef01BillingProviderUpinQlfr(String ref01BillingProviderUpinQlfr) {
        this.ref01BillingProviderUpinQlfr = ref01BillingProviderUpinQlfr;
        return this;
    }

    @JsonProperty("ref02_billingProviderUpinNo")
    public String getRef02BillingProviderUpinNo() {
        return ref02BillingProviderUpinNo;
    }

    @JsonProperty("ref02_billingProviderUpinNo")
    public void setRef02BillingProviderUpinNo(String ref02BillingProviderUpinNo) {
        this.ref02BillingProviderUpinNo = ref02BillingProviderUpinNo;
    }

    public RefBillingProviderUpin withRef02BillingProviderUpinNo(String ref02BillingProviderUpinNo) {
        this.ref02BillingProviderUpinNo = ref02BillingProviderUpinNo;
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

    public RefBillingProviderUpin withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01BillingProviderUpinQlfr).append(ref02BillingProviderUpinNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefBillingProviderUpin) == false) {
            return false;
        }
        RefBillingProviderUpin rhs = ((RefBillingProviderUpin) other);
        return new EqualsBuilder().append(ref01BillingProviderUpinQlfr, rhs.ref01BillingProviderUpinQlfr).append(ref02BillingProviderUpinNo, rhs.ref02BillingProviderUpinNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

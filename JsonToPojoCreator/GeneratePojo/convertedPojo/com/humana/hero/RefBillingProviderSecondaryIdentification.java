
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
    "ref01_billingProviderNoQlfr",
    "ref02_billingProviderCommercialNo",
    "ref02_billingProviderLocationNo"
})
public class RefBillingProviderSecondaryIdentification {

    @JsonProperty("ref01_billingProviderNoQlfr")
    private String ref01BillingProviderNoQlfr;
    @JsonProperty("ref02_billingProviderCommercialNo")
    private String ref02BillingProviderCommercialNo;
    @JsonProperty("ref02_billingProviderLocationNo")
    private String ref02BillingProviderLocationNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_billingProviderNoQlfr")
    public String getRef01BillingProviderNoQlfr() {
        return ref01BillingProviderNoQlfr;
    }

    @JsonProperty("ref01_billingProviderNoQlfr")
    public void setRef01BillingProviderNoQlfr(String ref01BillingProviderNoQlfr) {
        this.ref01BillingProviderNoQlfr = ref01BillingProviderNoQlfr;
    }

    public RefBillingProviderSecondaryIdentification withRef01BillingProviderNoQlfr(String ref01BillingProviderNoQlfr) {
        this.ref01BillingProviderNoQlfr = ref01BillingProviderNoQlfr;
        return this;
    }

    @JsonProperty("ref02_billingProviderCommercialNo")
    public String getRef02BillingProviderCommercialNo() {
        return ref02BillingProviderCommercialNo;
    }

    @JsonProperty("ref02_billingProviderCommercialNo")
    public void setRef02BillingProviderCommercialNo(String ref02BillingProviderCommercialNo) {
        this.ref02BillingProviderCommercialNo = ref02BillingProviderCommercialNo;
    }

    public RefBillingProviderSecondaryIdentification withRef02BillingProviderCommercialNo(String ref02BillingProviderCommercialNo) {
        this.ref02BillingProviderCommercialNo = ref02BillingProviderCommercialNo;
        return this;
    }

    @JsonProperty("ref02_billingProviderLocationNo")
    public String getRef02BillingProviderLocationNo() {
        return ref02BillingProviderLocationNo;
    }

    @JsonProperty("ref02_billingProviderLocationNo")
    public void setRef02BillingProviderLocationNo(String ref02BillingProviderLocationNo) {
        this.ref02BillingProviderLocationNo = ref02BillingProviderLocationNo;
    }

    public RefBillingProviderSecondaryIdentification withRef02BillingProviderLocationNo(String ref02BillingProviderLocationNo) {
        this.ref02BillingProviderLocationNo = ref02BillingProviderLocationNo;
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

    public RefBillingProviderSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01BillingProviderNoQlfr).append(ref02BillingProviderCommercialNo).append(ref02BillingProviderLocationNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefBillingProviderSecondaryIdentification) == false) {
            return false;
        }
        RefBillingProviderSecondaryIdentification rhs = ((RefBillingProviderSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01BillingProviderNoQlfr, rhs.ref01BillingProviderNoQlfr).append(ref02BillingProviderCommercialNo, rhs.ref02BillingProviderCommercialNo).append(ref02BillingProviderLocationNo, rhs.ref02BillingProviderLocationNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

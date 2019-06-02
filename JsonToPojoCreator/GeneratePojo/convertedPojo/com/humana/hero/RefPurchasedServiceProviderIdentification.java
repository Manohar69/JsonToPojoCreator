
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
    "ref01_purchasedServiceProviderSecondaryIdQlfr",
    "ref02_purchasedServiceProviderSecondaryId",
    "ref04_purchasedServiceProviderSecondaryPayerIdNoCode",
    "ref04_01_purchasedServiceProviderSecondaryPayerIdNoQlfr",
    "ref04_02_purchasedServiceProviderSecondaryPayerIdNo"
})
public class RefPurchasedServiceProviderIdentification {

    @JsonProperty("ref01_purchasedServiceProviderSecondaryIdQlfr")
    private String ref01PurchasedServiceProviderSecondaryIdQlfr;
    @JsonProperty("ref02_purchasedServiceProviderSecondaryId")
    private String ref02PurchasedServiceProviderSecondaryId;
    @JsonProperty("ref04_purchasedServiceProviderSecondaryPayerIdNoCode")
    private String ref04PurchasedServiceProviderSecondaryPayerIdNoCode;
    @JsonProperty("ref04_01_purchasedServiceProviderSecondaryPayerIdNoQlfr")
    private String ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr;
    @JsonProperty("ref04_02_purchasedServiceProviderSecondaryPayerIdNo")
    private String ref0402PurchasedServiceProviderSecondaryPayerIdNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_purchasedServiceProviderSecondaryIdQlfr")
    public String getRef01PurchasedServiceProviderSecondaryIdQlfr() {
        return ref01PurchasedServiceProviderSecondaryIdQlfr;
    }

    @JsonProperty("ref01_purchasedServiceProviderSecondaryIdQlfr")
    public void setRef01PurchasedServiceProviderSecondaryIdQlfr(String ref01PurchasedServiceProviderSecondaryIdQlfr) {
        this.ref01PurchasedServiceProviderSecondaryIdQlfr = ref01PurchasedServiceProviderSecondaryIdQlfr;
    }

    public RefPurchasedServiceProviderIdentification withRef01PurchasedServiceProviderSecondaryIdQlfr(String ref01PurchasedServiceProviderSecondaryIdQlfr) {
        this.ref01PurchasedServiceProviderSecondaryIdQlfr = ref01PurchasedServiceProviderSecondaryIdQlfr;
        return this;
    }

    @JsonProperty("ref02_purchasedServiceProviderSecondaryId")
    public String getRef02PurchasedServiceProviderSecondaryId() {
        return ref02PurchasedServiceProviderSecondaryId;
    }

    @JsonProperty("ref02_purchasedServiceProviderSecondaryId")
    public void setRef02PurchasedServiceProviderSecondaryId(String ref02PurchasedServiceProviderSecondaryId) {
        this.ref02PurchasedServiceProviderSecondaryId = ref02PurchasedServiceProviderSecondaryId;
    }

    public RefPurchasedServiceProviderIdentification withRef02PurchasedServiceProviderSecondaryId(String ref02PurchasedServiceProviderSecondaryId) {
        this.ref02PurchasedServiceProviderSecondaryId = ref02PurchasedServiceProviderSecondaryId;
        return this;
    }

    @JsonProperty("ref04_purchasedServiceProviderSecondaryPayerIdNoCode")
    public String getRef04PurchasedServiceProviderSecondaryPayerIdNoCode() {
        return ref04PurchasedServiceProviderSecondaryPayerIdNoCode;
    }

    @JsonProperty("ref04_purchasedServiceProviderSecondaryPayerIdNoCode")
    public void setRef04PurchasedServiceProviderSecondaryPayerIdNoCode(String ref04PurchasedServiceProviderSecondaryPayerIdNoCode) {
        this.ref04PurchasedServiceProviderSecondaryPayerIdNoCode = ref04PurchasedServiceProviderSecondaryPayerIdNoCode;
    }

    public RefPurchasedServiceProviderIdentification withRef04PurchasedServiceProviderSecondaryPayerIdNoCode(String ref04PurchasedServiceProviderSecondaryPayerIdNoCode) {
        this.ref04PurchasedServiceProviderSecondaryPayerIdNoCode = ref04PurchasedServiceProviderSecondaryPayerIdNoCode;
        return this;
    }

    @JsonProperty("ref04_01_purchasedServiceProviderSecondaryPayerIdNoQlfr")
    public String getRef0401PurchasedServiceProviderSecondaryPayerIdNoQlfr() {
        return ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr;
    }

    @JsonProperty("ref04_01_purchasedServiceProviderSecondaryPayerIdNoQlfr")
    public void setRef0401PurchasedServiceProviderSecondaryPayerIdNoQlfr(String ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr) {
        this.ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr = ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr;
    }

    public RefPurchasedServiceProviderIdentification withRef0401PurchasedServiceProviderSecondaryPayerIdNoQlfr(String ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr) {
        this.ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr = ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr;
        return this;
    }

    @JsonProperty("ref04_02_purchasedServiceProviderSecondaryPayerIdNo")
    public String getRef0402PurchasedServiceProviderSecondaryPayerIdNo() {
        return ref0402PurchasedServiceProviderSecondaryPayerIdNo;
    }

    @JsonProperty("ref04_02_purchasedServiceProviderSecondaryPayerIdNo")
    public void setRef0402PurchasedServiceProviderSecondaryPayerIdNo(String ref0402PurchasedServiceProviderSecondaryPayerIdNo) {
        this.ref0402PurchasedServiceProviderSecondaryPayerIdNo = ref0402PurchasedServiceProviderSecondaryPayerIdNo;
    }

    public RefPurchasedServiceProviderIdentification withRef0402PurchasedServiceProviderSecondaryPayerIdNo(String ref0402PurchasedServiceProviderSecondaryPayerIdNo) {
        this.ref0402PurchasedServiceProviderSecondaryPayerIdNo = ref0402PurchasedServiceProviderSecondaryPayerIdNo;
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

    public RefPurchasedServiceProviderIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01PurchasedServiceProviderSecondaryIdQlfr).append(ref02PurchasedServiceProviderSecondaryId).append(ref04PurchasedServiceProviderSecondaryPayerIdNoCode).append(ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr).append(ref0402PurchasedServiceProviderSecondaryPayerIdNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefPurchasedServiceProviderIdentification) == false) {
            return false;
        }
        RefPurchasedServiceProviderIdentification rhs = ((RefPurchasedServiceProviderIdentification) other);
        return new EqualsBuilder().append(ref01PurchasedServiceProviderSecondaryIdQlfr, rhs.ref01PurchasedServiceProviderSecondaryIdQlfr).append(ref02PurchasedServiceProviderSecondaryId, rhs.ref02PurchasedServiceProviderSecondaryId).append(ref04PurchasedServiceProviderSecondaryPayerIdNoCode, rhs.ref04PurchasedServiceProviderSecondaryPayerIdNoCode).append(ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr, rhs.ref0401PurchasedServiceProviderSecondaryPayerIdNoQlfr).append(ref0402PurchasedServiceProviderSecondaryPayerIdNo, rhs.ref0402PurchasedServiceProviderSecondaryPayerIdNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

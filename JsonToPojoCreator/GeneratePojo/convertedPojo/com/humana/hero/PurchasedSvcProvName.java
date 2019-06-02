
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
    "nm101_purchasedServiceProviderCode",
    "nm102_purchasedServiceProviderQlfr",
    "nm108_purchasedServiceProviderIdentificationCodeQlfr",
    "nm109_purchasedServiceProviderIdentifier",
    "ref_purchasedServiceProviderIdentification"
})
public class PurchasedSvcProvName {

    @JsonProperty("nm101_purchasedServiceProviderCode")
    private String nm101PurchasedServiceProviderCode;
    @JsonProperty("nm102_purchasedServiceProviderQlfr")
    private String nm102PurchasedServiceProviderQlfr;
    @JsonProperty("nm108_purchasedServiceProviderIdentificationCodeQlfr")
    private String nm108PurchasedServiceProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_purchasedServiceProviderIdentifier")
    private String nm109PurchasedServiceProviderIdentifier;
    @JsonProperty("ref_purchasedServiceProviderIdentification")
    private List<RefPurchasedServiceProviderIdentification> refPurchasedServiceProviderIdentification = new ArrayList<RefPurchasedServiceProviderIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_purchasedServiceProviderCode")
    public String getNm101PurchasedServiceProviderCode() {
        return nm101PurchasedServiceProviderCode;
    }

    @JsonProperty("nm101_purchasedServiceProviderCode")
    public void setNm101PurchasedServiceProviderCode(String nm101PurchasedServiceProviderCode) {
        this.nm101PurchasedServiceProviderCode = nm101PurchasedServiceProviderCode;
    }

    public PurchasedSvcProvName withNm101PurchasedServiceProviderCode(String nm101PurchasedServiceProviderCode) {
        this.nm101PurchasedServiceProviderCode = nm101PurchasedServiceProviderCode;
        return this;
    }

    @JsonProperty("nm102_purchasedServiceProviderQlfr")
    public String getNm102PurchasedServiceProviderQlfr() {
        return nm102PurchasedServiceProviderQlfr;
    }

    @JsonProperty("nm102_purchasedServiceProviderQlfr")
    public void setNm102PurchasedServiceProviderQlfr(String nm102PurchasedServiceProviderQlfr) {
        this.nm102PurchasedServiceProviderQlfr = nm102PurchasedServiceProviderQlfr;
    }

    public PurchasedSvcProvName withNm102PurchasedServiceProviderQlfr(String nm102PurchasedServiceProviderQlfr) {
        this.nm102PurchasedServiceProviderQlfr = nm102PurchasedServiceProviderQlfr;
        return this;
    }

    @JsonProperty("nm108_purchasedServiceProviderIdentificationCodeQlfr")
    public String getNm108PurchasedServiceProviderIdentificationCodeQlfr() {
        return nm108PurchasedServiceProviderIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_purchasedServiceProviderIdentificationCodeQlfr")
    public void setNm108PurchasedServiceProviderIdentificationCodeQlfr(String nm108PurchasedServiceProviderIdentificationCodeQlfr) {
        this.nm108PurchasedServiceProviderIdentificationCodeQlfr = nm108PurchasedServiceProviderIdentificationCodeQlfr;
    }

    public PurchasedSvcProvName withNm108PurchasedServiceProviderIdentificationCodeQlfr(String nm108PurchasedServiceProviderIdentificationCodeQlfr) {
        this.nm108PurchasedServiceProviderIdentificationCodeQlfr = nm108PurchasedServiceProviderIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_purchasedServiceProviderIdentifier")
    public String getNm109PurchasedServiceProviderIdentifier() {
        return nm109PurchasedServiceProviderIdentifier;
    }

    @JsonProperty("nm109_purchasedServiceProviderIdentifier")
    public void setNm109PurchasedServiceProviderIdentifier(String nm109PurchasedServiceProviderIdentifier) {
        this.nm109PurchasedServiceProviderIdentifier = nm109PurchasedServiceProviderIdentifier;
    }

    public PurchasedSvcProvName withNm109PurchasedServiceProviderIdentifier(String nm109PurchasedServiceProviderIdentifier) {
        this.nm109PurchasedServiceProviderIdentifier = nm109PurchasedServiceProviderIdentifier;
        return this;
    }

    @JsonProperty("ref_purchasedServiceProviderIdentification")
    public List<RefPurchasedServiceProviderIdentification> getRefPurchasedServiceProviderIdentification() {
        return refPurchasedServiceProviderIdentification;
    }

    @JsonProperty("ref_purchasedServiceProviderIdentification")
    public void setRefPurchasedServiceProviderIdentification(List<RefPurchasedServiceProviderIdentification> refPurchasedServiceProviderIdentification) {
        this.refPurchasedServiceProviderIdentification = refPurchasedServiceProviderIdentification;
    }

    public PurchasedSvcProvName withRefPurchasedServiceProviderIdentification(List<RefPurchasedServiceProviderIdentification> refPurchasedServiceProviderIdentification) {
        this.refPurchasedServiceProviderIdentification = refPurchasedServiceProviderIdentification;
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

    public PurchasedSvcProvName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101PurchasedServiceProviderCode).append(nm102PurchasedServiceProviderQlfr).append(nm108PurchasedServiceProviderIdentificationCodeQlfr).append(nm109PurchasedServiceProviderIdentifier).append(refPurchasedServiceProviderIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchasedSvcProvName) == false) {
            return false;
        }
        PurchasedSvcProvName rhs = ((PurchasedSvcProvName) other);
        return new EqualsBuilder().append(nm101PurchasedServiceProviderCode, rhs.nm101PurchasedServiceProviderCode).append(nm102PurchasedServiceProviderQlfr, rhs.nm102PurchasedServiceProviderQlfr).append(nm108PurchasedServiceProviderIdentificationCodeQlfr, rhs.nm108PurchasedServiceProviderIdentificationCodeQlfr).append(nm109PurchasedServiceProviderIdentifier, rhs.nm109PurchasedServiceProviderIdentifier).append(refPurchasedServiceProviderIdentification, rhs.refPurchasedServiceProviderIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

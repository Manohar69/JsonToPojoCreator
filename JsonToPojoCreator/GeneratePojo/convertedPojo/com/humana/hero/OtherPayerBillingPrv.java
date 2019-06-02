
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
    "nm01_otherPayerBillingProviderCode",
    "nm02_otherPayerBillingProviderQlfr",
    "ref_otherPayerBillingProvider"
})
public class OtherPayerBillingPrv {

    @JsonProperty("nm01_otherPayerBillingProviderCode")
    private String nm01OtherPayerBillingProviderCode;
    @JsonProperty("nm02_otherPayerBillingProviderQlfr")
    private String nm02OtherPayerBillingProviderQlfr;
    @JsonProperty("ref_otherPayerBillingProvider")
    private List<RefOtherPayerBillingProvider> refOtherPayerBillingProvider = new ArrayList<RefOtherPayerBillingProvider>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm01_otherPayerBillingProviderCode")
    public String getNm01OtherPayerBillingProviderCode() {
        return nm01OtherPayerBillingProviderCode;
    }

    @JsonProperty("nm01_otherPayerBillingProviderCode")
    public void setNm01OtherPayerBillingProviderCode(String nm01OtherPayerBillingProviderCode) {
        this.nm01OtherPayerBillingProviderCode = nm01OtherPayerBillingProviderCode;
    }

    public OtherPayerBillingPrv withNm01OtherPayerBillingProviderCode(String nm01OtherPayerBillingProviderCode) {
        this.nm01OtherPayerBillingProviderCode = nm01OtherPayerBillingProviderCode;
        return this;
    }

    @JsonProperty("nm02_otherPayerBillingProviderQlfr")
    public String getNm02OtherPayerBillingProviderQlfr() {
        return nm02OtherPayerBillingProviderQlfr;
    }

    @JsonProperty("nm02_otherPayerBillingProviderQlfr")
    public void setNm02OtherPayerBillingProviderQlfr(String nm02OtherPayerBillingProviderQlfr) {
        this.nm02OtherPayerBillingProviderQlfr = nm02OtherPayerBillingProviderQlfr;
    }

    public OtherPayerBillingPrv withNm02OtherPayerBillingProviderQlfr(String nm02OtherPayerBillingProviderQlfr) {
        this.nm02OtherPayerBillingProviderQlfr = nm02OtherPayerBillingProviderQlfr;
        return this;
    }

    @JsonProperty("ref_otherPayerBillingProvider")
    public List<RefOtherPayerBillingProvider> getRefOtherPayerBillingProvider() {
        return refOtherPayerBillingProvider;
    }

    @JsonProperty("ref_otherPayerBillingProvider")
    public void setRefOtherPayerBillingProvider(List<RefOtherPayerBillingProvider> refOtherPayerBillingProvider) {
        this.refOtherPayerBillingProvider = refOtherPayerBillingProvider;
    }

    public OtherPayerBillingPrv withRefOtherPayerBillingProvider(List<RefOtherPayerBillingProvider> refOtherPayerBillingProvider) {
        this.refOtherPayerBillingProvider = refOtherPayerBillingProvider;
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

    public OtherPayerBillingPrv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm01OtherPayerBillingProviderCode).append(nm02OtherPayerBillingProviderQlfr).append(refOtherPayerBillingProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerBillingPrv) == false) {
            return false;
        }
        OtherPayerBillingPrv rhs = ((OtherPayerBillingPrv) other);
        return new EqualsBuilder().append(nm01OtherPayerBillingProviderCode, rhs.nm01OtherPayerBillingProviderCode).append(nm02OtherPayerBillingProviderQlfr, rhs.nm02OtherPayerBillingProviderQlfr).append(refOtherPayerBillingProvider, rhs.refOtherPayerBillingProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

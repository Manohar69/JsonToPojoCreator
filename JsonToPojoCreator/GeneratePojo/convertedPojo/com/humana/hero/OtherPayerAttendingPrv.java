
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
    "nm101_otherPayerAttendingProviderQlfr",
    "nm102_otherPayerAttendingProvider",
    "ref_otherPayerAttendingProvider"
})
public class OtherPayerAttendingPrv {

    @JsonProperty("nm101_otherPayerAttendingProviderQlfr")
    private String nm101OtherPayerAttendingProviderQlfr;
    @JsonProperty("nm102_otherPayerAttendingProvider")
    private String nm102OtherPayerAttendingProvider;
    @JsonProperty("ref_otherPayerAttendingProvider")
    private List<RefOtherPayerAttendingProvider> refOtherPayerAttendingProvider = new ArrayList<RefOtherPayerAttendingProvider>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherPayerAttendingProviderQlfr")
    public String getNm101OtherPayerAttendingProviderQlfr() {
        return nm101OtherPayerAttendingProviderQlfr;
    }

    @JsonProperty("nm101_otherPayerAttendingProviderQlfr")
    public void setNm101OtherPayerAttendingProviderQlfr(String nm101OtherPayerAttendingProviderQlfr) {
        this.nm101OtherPayerAttendingProviderQlfr = nm101OtherPayerAttendingProviderQlfr;
    }

    public OtherPayerAttendingPrv withNm101OtherPayerAttendingProviderQlfr(String nm101OtherPayerAttendingProviderQlfr) {
        this.nm101OtherPayerAttendingProviderQlfr = nm101OtherPayerAttendingProviderQlfr;
        return this;
    }

    @JsonProperty("nm102_otherPayerAttendingProvider")
    public String getNm102OtherPayerAttendingProvider() {
        return nm102OtherPayerAttendingProvider;
    }

    @JsonProperty("nm102_otherPayerAttendingProvider")
    public void setNm102OtherPayerAttendingProvider(String nm102OtherPayerAttendingProvider) {
        this.nm102OtherPayerAttendingProvider = nm102OtherPayerAttendingProvider;
    }

    public OtherPayerAttendingPrv withNm102OtherPayerAttendingProvider(String nm102OtherPayerAttendingProvider) {
        this.nm102OtherPayerAttendingProvider = nm102OtherPayerAttendingProvider;
        return this;
    }

    @JsonProperty("ref_otherPayerAttendingProvider")
    public List<RefOtherPayerAttendingProvider> getRefOtherPayerAttendingProvider() {
        return refOtherPayerAttendingProvider;
    }

    @JsonProperty("ref_otherPayerAttendingProvider")
    public void setRefOtherPayerAttendingProvider(List<RefOtherPayerAttendingProvider> refOtherPayerAttendingProvider) {
        this.refOtherPayerAttendingProvider = refOtherPayerAttendingProvider;
    }

    public OtherPayerAttendingPrv withRefOtherPayerAttendingProvider(List<RefOtherPayerAttendingProvider> refOtherPayerAttendingProvider) {
        this.refOtherPayerAttendingProvider = refOtherPayerAttendingProvider;
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

    public OtherPayerAttendingPrv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherPayerAttendingProviderQlfr).append(nm102OtherPayerAttendingProvider).append(refOtherPayerAttendingProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerAttendingPrv) == false) {
            return false;
        }
        OtherPayerAttendingPrv rhs = ((OtherPayerAttendingPrv) other);
        return new EqualsBuilder().append(nm101OtherPayerAttendingProviderQlfr, rhs.nm101OtherPayerAttendingProviderQlfr).append(nm102OtherPayerAttendingProvider, rhs.nm102OtherPayerAttendingProvider).append(refOtherPayerAttendingProvider, rhs.refOtherPayerAttendingProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

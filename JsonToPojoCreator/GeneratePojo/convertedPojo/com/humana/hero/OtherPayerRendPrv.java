
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
    "nm101_otherPayerRenderingProviderQlfr",
    "nm102_otherPayerRenderingProvider",
    "ref_otherPayerRenderingProvider"
})
public class OtherPayerRendPrv {

    @JsonProperty("nm101_otherPayerRenderingProviderQlfr")
    private String nm101OtherPayerRenderingProviderQlfr;
    @JsonProperty("nm102_otherPayerRenderingProvider")
    private String nm102OtherPayerRenderingProvider;
    @JsonProperty("ref_otherPayerRenderingProvider")
    private List<RefOtherPayerRenderingProvider> refOtherPayerRenderingProvider = new ArrayList<RefOtherPayerRenderingProvider>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherPayerRenderingProviderQlfr")
    public String getNm101OtherPayerRenderingProviderQlfr() {
        return nm101OtherPayerRenderingProviderQlfr;
    }

    @JsonProperty("nm101_otherPayerRenderingProviderQlfr")
    public void setNm101OtherPayerRenderingProviderQlfr(String nm101OtherPayerRenderingProviderQlfr) {
        this.nm101OtherPayerRenderingProviderQlfr = nm101OtherPayerRenderingProviderQlfr;
    }

    public OtherPayerRendPrv withNm101OtherPayerRenderingProviderQlfr(String nm101OtherPayerRenderingProviderQlfr) {
        this.nm101OtherPayerRenderingProviderQlfr = nm101OtherPayerRenderingProviderQlfr;
        return this;
    }

    @JsonProperty("nm102_otherPayerRenderingProvider")
    public String getNm102OtherPayerRenderingProvider() {
        return nm102OtherPayerRenderingProvider;
    }

    @JsonProperty("nm102_otherPayerRenderingProvider")
    public void setNm102OtherPayerRenderingProvider(String nm102OtherPayerRenderingProvider) {
        this.nm102OtherPayerRenderingProvider = nm102OtherPayerRenderingProvider;
    }

    public OtherPayerRendPrv withNm102OtherPayerRenderingProvider(String nm102OtherPayerRenderingProvider) {
        this.nm102OtherPayerRenderingProvider = nm102OtherPayerRenderingProvider;
        return this;
    }

    @JsonProperty("ref_otherPayerRenderingProvider")
    public List<RefOtherPayerRenderingProvider> getRefOtherPayerRenderingProvider() {
        return refOtherPayerRenderingProvider;
    }

    @JsonProperty("ref_otherPayerRenderingProvider")
    public void setRefOtherPayerRenderingProvider(List<RefOtherPayerRenderingProvider> refOtherPayerRenderingProvider) {
        this.refOtherPayerRenderingProvider = refOtherPayerRenderingProvider;
    }

    public OtherPayerRendPrv withRefOtherPayerRenderingProvider(List<RefOtherPayerRenderingProvider> refOtherPayerRenderingProvider) {
        this.refOtherPayerRenderingProvider = refOtherPayerRenderingProvider;
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

    public OtherPayerRendPrv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherPayerRenderingProviderQlfr).append(nm102OtherPayerRenderingProvider).append(refOtherPayerRenderingProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerRendPrv) == false) {
            return false;
        }
        OtherPayerRendPrv rhs = ((OtherPayerRendPrv) other);
        return new EqualsBuilder().append(nm101OtherPayerRenderingProviderQlfr, rhs.nm101OtherPayerRenderingProviderQlfr).append(nm102OtherPayerRenderingProvider, rhs.nm102OtherPayerRenderingProvider).append(refOtherPayerRenderingProvider, rhs.refOtherPayerRenderingProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

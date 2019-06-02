
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
    "nm101_otherPayerReferringProviderQlfrCode",
    "nm102_otherPayerReferringProviderTypeQlfr",
    "ref_otherPayerReferringProvider"
})
public class NmOtherPayerReferringProvider {

    @JsonProperty("nm101_otherPayerReferringProviderQlfrCode")
    private String nm101OtherPayerReferringProviderQlfrCode;
    @JsonProperty("nm102_otherPayerReferringProviderTypeQlfr")
    private String nm102OtherPayerReferringProviderTypeQlfr;
    @JsonProperty("ref_otherPayerReferringProvider")
    private List<RefOtherPayerReferringProvider> refOtherPayerReferringProvider = new ArrayList<RefOtherPayerReferringProvider>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherPayerReferringProviderQlfrCode")
    public String getNm101OtherPayerReferringProviderQlfrCode() {
        return nm101OtherPayerReferringProviderQlfrCode;
    }

    @JsonProperty("nm101_otherPayerReferringProviderQlfrCode")
    public void setNm101OtherPayerReferringProviderQlfrCode(String nm101OtherPayerReferringProviderQlfrCode) {
        this.nm101OtherPayerReferringProviderQlfrCode = nm101OtherPayerReferringProviderQlfrCode;
    }

    public NmOtherPayerReferringProvider withNm101OtherPayerReferringProviderQlfrCode(String nm101OtherPayerReferringProviderQlfrCode) {
        this.nm101OtherPayerReferringProviderQlfrCode = nm101OtherPayerReferringProviderQlfrCode;
        return this;
    }

    @JsonProperty("nm102_otherPayerReferringProviderTypeQlfr")
    public String getNm102OtherPayerReferringProviderTypeQlfr() {
        return nm102OtherPayerReferringProviderTypeQlfr;
    }

    @JsonProperty("nm102_otherPayerReferringProviderTypeQlfr")
    public void setNm102OtherPayerReferringProviderTypeQlfr(String nm102OtherPayerReferringProviderTypeQlfr) {
        this.nm102OtherPayerReferringProviderTypeQlfr = nm102OtherPayerReferringProviderTypeQlfr;
    }

    public NmOtherPayerReferringProvider withNm102OtherPayerReferringProviderTypeQlfr(String nm102OtherPayerReferringProviderTypeQlfr) {
        this.nm102OtherPayerReferringProviderTypeQlfr = nm102OtherPayerReferringProviderTypeQlfr;
        return this;
    }

    @JsonProperty("ref_otherPayerReferringProvider")
    public List<RefOtherPayerReferringProvider> getRefOtherPayerReferringProvider() {
        return refOtherPayerReferringProvider;
    }

    @JsonProperty("ref_otherPayerReferringProvider")
    public void setRefOtherPayerReferringProvider(List<RefOtherPayerReferringProvider> refOtherPayerReferringProvider) {
        this.refOtherPayerReferringProvider = refOtherPayerReferringProvider;
    }

    public NmOtherPayerReferringProvider withRefOtherPayerReferringProvider(List<RefOtherPayerReferringProvider> refOtherPayerReferringProvider) {
        this.refOtherPayerReferringProvider = refOtherPayerReferringProvider;
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

    public NmOtherPayerReferringProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherPayerReferringProviderQlfrCode).append(nm102OtherPayerReferringProviderTypeQlfr).append(refOtherPayerReferringProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NmOtherPayerReferringProvider) == false) {
            return false;
        }
        NmOtherPayerReferringProvider rhs = ((NmOtherPayerReferringProvider) other);
        return new EqualsBuilder().append(nm101OtherPayerReferringProviderQlfrCode, rhs.nm101OtherPayerReferringProviderQlfrCode).append(nm102OtherPayerReferringProviderTypeQlfr, rhs.nm102OtherPayerReferringProviderTypeQlfr).append(refOtherPayerReferringProvider, rhs.refOtherPayerReferringProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

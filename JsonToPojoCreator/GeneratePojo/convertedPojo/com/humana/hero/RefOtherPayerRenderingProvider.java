
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
    "ref01_otherPayerRenderingProviderQlfr",
    "ref02_otherPayerReferringProvider"
})
public class RefOtherPayerRenderingProvider {

    @JsonProperty("ref01_otherPayerRenderingProviderQlfr")
    private String ref01OtherPayerRenderingProviderQlfr;
    @JsonProperty("ref02_otherPayerReferringProvider")
    private String ref02OtherPayerReferringProvider;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerRenderingProviderQlfr")
    public String getRef01OtherPayerRenderingProviderQlfr() {
        return ref01OtherPayerRenderingProviderQlfr;
    }

    @JsonProperty("ref01_otherPayerRenderingProviderQlfr")
    public void setRef01OtherPayerRenderingProviderQlfr(String ref01OtherPayerRenderingProviderQlfr) {
        this.ref01OtherPayerRenderingProviderQlfr = ref01OtherPayerRenderingProviderQlfr;
    }

    public RefOtherPayerRenderingProvider withRef01OtherPayerRenderingProviderQlfr(String ref01OtherPayerRenderingProviderQlfr) {
        this.ref01OtherPayerRenderingProviderQlfr = ref01OtherPayerRenderingProviderQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerReferringProvider")
    public String getRef02OtherPayerReferringProvider() {
        return ref02OtherPayerReferringProvider;
    }

    @JsonProperty("ref02_otherPayerReferringProvider")
    public void setRef02OtherPayerReferringProvider(String ref02OtherPayerReferringProvider) {
        this.ref02OtherPayerReferringProvider = ref02OtherPayerReferringProvider;
    }

    public RefOtherPayerRenderingProvider withRef02OtherPayerReferringProvider(String ref02OtherPayerReferringProvider) {
        this.ref02OtherPayerReferringProvider = ref02OtherPayerReferringProvider;
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

    public RefOtherPayerRenderingProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerRenderingProviderQlfr).append(ref02OtherPayerReferringProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerRenderingProvider) == false) {
            return false;
        }
        RefOtherPayerRenderingProvider rhs = ((RefOtherPayerRenderingProvider) other);
        return new EqualsBuilder().append(ref01OtherPayerRenderingProviderQlfr, rhs.ref01OtherPayerRenderingProviderQlfr).append(ref02OtherPayerReferringProvider, rhs.ref02OtherPayerReferringProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

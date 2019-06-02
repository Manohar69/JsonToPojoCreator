
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
    "ref01_otherPayerReferringProviderQlfr",
    "ref02_otherPayereferringProvider"
})
public class RefOtherPayerReferringProvider {

    @JsonProperty("ref01_otherPayerReferringProviderQlfr")
    private String ref01OtherPayerReferringProviderQlfr;
    @JsonProperty("ref02_otherPayereferringProvider")
    private String ref02OtherPayereferringProvider;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerReferringProviderQlfr")
    public String getRef01OtherPayerReferringProviderQlfr() {
        return ref01OtherPayerReferringProviderQlfr;
    }

    @JsonProperty("ref01_otherPayerReferringProviderQlfr")
    public void setRef01OtherPayerReferringProviderQlfr(String ref01OtherPayerReferringProviderQlfr) {
        this.ref01OtherPayerReferringProviderQlfr = ref01OtherPayerReferringProviderQlfr;
    }

    public RefOtherPayerReferringProvider withRef01OtherPayerReferringProviderQlfr(String ref01OtherPayerReferringProviderQlfr) {
        this.ref01OtherPayerReferringProviderQlfr = ref01OtherPayerReferringProviderQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayereferringProvider")
    public String getRef02OtherPayereferringProvider() {
        return ref02OtherPayereferringProvider;
    }

    @JsonProperty("ref02_otherPayereferringProvider")
    public void setRef02OtherPayereferringProvider(String ref02OtherPayereferringProvider) {
        this.ref02OtherPayereferringProvider = ref02OtherPayereferringProvider;
    }

    public RefOtherPayerReferringProvider withRef02OtherPayereferringProvider(String ref02OtherPayereferringProvider) {
        this.ref02OtherPayereferringProvider = ref02OtherPayereferringProvider;
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

    public RefOtherPayerReferringProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerReferringProviderQlfr).append(ref02OtherPayereferringProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerReferringProvider) == false) {
            return false;
        }
        RefOtherPayerReferringProvider rhs = ((RefOtherPayerReferringProvider) other);
        return new EqualsBuilder().append(ref01OtherPayerReferringProviderQlfr, rhs.ref01OtherPayerReferringProviderQlfr).append(ref02OtherPayereferringProvider, rhs.ref02OtherPayereferringProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

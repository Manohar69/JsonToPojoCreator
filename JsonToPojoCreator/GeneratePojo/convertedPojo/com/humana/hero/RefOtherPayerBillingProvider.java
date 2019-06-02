
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
    "ref01_otherPayerBillingProviderQlfr",
    "ref02_otherPayerBillingProvider"
})
public class RefOtherPayerBillingProvider {

    @JsonProperty("ref01_otherPayerBillingProviderQlfr")
    private String ref01OtherPayerBillingProviderQlfr;
    @JsonProperty("ref02_otherPayerBillingProvider")
    private String ref02OtherPayerBillingProvider;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerBillingProviderQlfr")
    public String getRef01OtherPayerBillingProviderQlfr() {
        return ref01OtherPayerBillingProviderQlfr;
    }

    @JsonProperty("ref01_otherPayerBillingProviderQlfr")
    public void setRef01OtherPayerBillingProviderQlfr(String ref01OtherPayerBillingProviderQlfr) {
        this.ref01OtherPayerBillingProviderQlfr = ref01OtherPayerBillingProviderQlfr;
    }

    public RefOtherPayerBillingProvider withRef01OtherPayerBillingProviderQlfr(String ref01OtherPayerBillingProviderQlfr) {
        this.ref01OtherPayerBillingProviderQlfr = ref01OtherPayerBillingProviderQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerBillingProvider")
    public String getRef02OtherPayerBillingProvider() {
        return ref02OtherPayerBillingProvider;
    }

    @JsonProperty("ref02_otherPayerBillingProvider")
    public void setRef02OtherPayerBillingProvider(String ref02OtherPayerBillingProvider) {
        this.ref02OtherPayerBillingProvider = ref02OtherPayerBillingProvider;
    }

    public RefOtherPayerBillingProvider withRef02OtherPayerBillingProvider(String ref02OtherPayerBillingProvider) {
        this.ref02OtherPayerBillingProvider = ref02OtherPayerBillingProvider;
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

    public RefOtherPayerBillingProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerBillingProviderQlfr).append(ref02OtherPayerBillingProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerBillingProvider) == false) {
            return false;
        }
        RefOtherPayerBillingProvider rhs = ((RefOtherPayerBillingProvider) other);
        return new EqualsBuilder().append(ref01OtherPayerBillingProviderQlfr, rhs.ref01OtherPayerBillingProviderQlfr).append(ref02OtherPayerBillingProvider, rhs.ref02OtherPayerBillingProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

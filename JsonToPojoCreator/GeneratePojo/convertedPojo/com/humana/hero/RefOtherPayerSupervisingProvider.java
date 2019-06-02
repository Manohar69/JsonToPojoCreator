
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
    "ref01_otherPayerSupervisingProviderQlfr",
    "ref02_otherPayerSupervisingProvider"
})
public class RefOtherPayerSupervisingProvider {

    @JsonProperty("ref01_otherPayerSupervisingProviderQlfr")
    private String ref01OtherPayerSupervisingProviderQlfr;
    @JsonProperty("ref02_otherPayerSupervisingProvider")
    private String ref02OtherPayerSupervisingProvider;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerSupervisingProviderQlfr")
    public String getRef01OtherPayerSupervisingProviderQlfr() {
        return ref01OtherPayerSupervisingProviderQlfr;
    }

    @JsonProperty("ref01_otherPayerSupervisingProviderQlfr")
    public void setRef01OtherPayerSupervisingProviderQlfr(String ref01OtherPayerSupervisingProviderQlfr) {
        this.ref01OtherPayerSupervisingProviderQlfr = ref01OtherPayerSupervisingProviderQlfr;
    }

    public RefOtherPayerSupervisingProvider withRef01OtherPayerSupervisingProviderQlfr(String ref01OtherPayerSupervisingProviderQlfr) {
        this.ref01OtherPayerSupervisingProviderQlfr = ref01OtherPayerSupervisingProviderQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerSupervisingProvider")
    public String getRef02OtherPayerSupervisingProvider() {
        return ref02OtherPayerSupervisingProvider;
    }

    @JsonProperty("ref02_otherPayerSupervisingProvider")
    public void setRef02OtherPayerSupervisingProvider(String ref02OtherPayerSupervisingProvider) {
        this.ref02OtherPayerSupervisingProvider = ref02OtherPayerSupervisingProvider;
    }

    public RefOtherPayerSupervisingProvider withRef02OtherPayerSupervisingProvider(String ref02OtherPayerSupervisingProvider) {
        this.ref02OtherPayerSupervisingProvider = ref02OtherPayerSupervisingProvider;
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

    public RefOtherPayerSupervisingProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerSupervisingProviderQlfr).append(ref02OtherPayerSupervisingProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerSupervisingProvider) == false) {
            return false;
        }
        RefOtherPayerSupervisingProvider rhs = ((RefOtherPayerSupervisingProvider) other);
        return new EqualsBuilder().append(ref01OtherPayerSupervisingProviderQlfr, rhs.ref01OtherPayerSupervisingProviderQlfr).append(ref02OtherPayerSupervisingProvider, rhs.ref02OtherPayerSupervisingProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "ref01_otherPayerAttendingProviderSecondaryQlfr",
    "ref02_otherPayerAttendingProviderSecondaryIdentifier"
})
public class RefOtherPayerAttendingProvider {

    @JsonProperty("ref01_otherPayerAttendingProviderSecondaryQlfr")
    private String ref01OtherPayerAttendingProviderSecondaryQlfr;
    @JsonProperty("ref02_otherPayerAttendingProviderSecondaryIdentifier")
    private String ref02OtherPayerAttendingProviderSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerAttendingProviderSecondaryQlfr")
    public String getRef01OtherPayerAttendingProviderSecondaryQlfr() {
        return ref01OtherPayerAttendingProviderSecondaryQlfr;
    }

    @JsonProperty("ref01_otherPayerAttendingProviderSecondaryQlfr")
    public void setRef01OtherPayerAttendingProviderSecondaryQlfr(String ref01OtherPayerAttendingProviderSecondaryQlfr) {
        this.ref01OtherPayerAttendingProviderSecondaryQlfr = ref01OtherPayerAttendingProviderSecondaryQlfr;
    }

    public RefOtherPayerAttendingProvider withRef01OtherPayerAttendingProviderSecondaryQlfr(String ref01OtherPayerAttendingProviderSecondaryQlfr) {
        this.ref01OtherPayerAttendingProviderSecondaryQlfr = ref01OtherPayerAttendingProviderSecondaryQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerAttendingProviderSecondaryIdentifier")
    public String getRef02OtherPayerAttendingProviderSecondaryIdentifier() {
        return ref02OtherPayerAttendingProviderSecondaryIdentifier;
    }

    @JsonProperty("ref02_otherPayerAttendingProviderSecondaryIdentifier")
    public void setRef02OtherPayerAttendingProviderSecondaryIdentifier(String ref02OtherPayerAttendingProviderSecondaryIdentifier) {
        this.ref02OtherPayerAttendingProviderSecondaryIdentifier = ref02OtherPayerAttendingProviderSecondaryIdentifier;
    }

    public RefOtherPayerAttendingProvider withRef02OtherPayerAttendingProviderSecondaryIdentifier(String ref02OtherPayerAttendingProviderSecondaryIdentifier) {
        this.ref02OtherPayerAttendingProviderSecondaryIdentifier = ref02OtherPayerAttendingProviderSecondaryIdentifier;
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

    public RefOtherPayerAttendingProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerAttendingProviderSecondaryQlfr).append(ref02OtherPayerAttendingProviderSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerAttendingProvider) == false) {
            return false;
        }
        RefOtherPayerAttendingProvider rhs = ((RefOtherPayerAttendingProvider) other);
        return new EqualsBuilder().append(ref01OtherPayerAttendingProviderSecondaryQlfr, rhs.ref01OtherPayerAttendingProviderSecondaryQlfr).append(ref02OtherPayerAttendingProviderSecondaryIdentifier, rhs.ref02OtherPayerAttendingProviderSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

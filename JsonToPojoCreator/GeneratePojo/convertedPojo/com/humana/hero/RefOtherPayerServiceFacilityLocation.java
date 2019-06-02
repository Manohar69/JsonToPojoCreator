
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
    "ref01_otherPayerServiceFacilityLocationQlfr",
    "ref02_otherPayerserviceFacilityLocationIdentifier"
})
public class RefOtherPayerServiceFacilityLocation {

    @JsonProperty("ref01_otherPayerServiceFacilityLocationQlfr")
    private String ref01OtherPayerServiceFacilityLocationQlfr;
    @JsonProperty("ref02_otherPayerserviceFacilityLocationIdentifier")
    private String ref02OtherPayerserviceFacilityLocationIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerServiceFacilityLocationQlfr")
    public String getRef01OtherPayerServiceFacilityLocationQlfr() {
        return ref01OtherPayerServiceFacilityLocationQlfr;
    }

    @JsonProperty("ref01_otherPayerServiceFacilityLocationQlfr")
    public void setRef01OtherPayerServiceFacilityLocationQlfr(String ref01OtherPayerServiceFacilityLocationQlfr) {
        this.ref01OtherPayerServiceFacilityLocationQlfr = ref01OtherPayerServiceFacilityLocationQlfr;
    }

    public RefOtherPayerServiceFacilityLocation withRef01OtherPayerServiceFacilityLocationQlfr(String ref01OtherPayerServiceFacilityLocationQlfr) {
        this.ref01OtherPayerServiceFacilityLocationQlfr = ref01OtherPayerServiceFacilityLocationQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerserviceFacilityLocationIdentifier")
    public String getRef02OtherPayerserviceFacilityLocationIdentifier() {
        return ref02OtherPayerserviceFacilityLocationIdentifier;
    }

    @JsonProperty("ref02_otherPayerserviceFacilityLocationIdentifier")
    public void setRef02OtherPayerserviceFacilityLocationIdentifier(String ref02OtherPayerserviceFacilityLocationIdentifier) {
        this.ref02OtherPayerserviceFacilityLocationIdentifier = ref02OtherPayerserviceFacilityLocationIdentifier;
    }

    public RefOtherPayerServiceFacilityLocation withRef02OtherPayerserviceFacilityLocationIdentifier(String ref02OtherPayerserviceFacilityLocationIdentifier) {
        this.ref02OtherPayerserviceFacilityLocationIdentifier = ref02OtherPayerserviceFacilityLocationIdentifier;
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

    public RefOtherPayerServiceFacilityLocation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerServiceFacilityLocationQlfr).append(ref02OtherPayerserviceFacilityLocationIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerServiceFacilityLocation) == false) {
            return false;
        }
        RefOtherPayerServiceFacilityLocation rhs = ((RefOtherPayerServiceFacilityLocation) other);
        return new EqualsBuilder().append(ref01OtherPayerServiceFacilityLocationQlfr, rhs.ref01OtherPayerServiceFacilityLocationQlfr).append(ref02OtherPayerserviceFacilityLocationIdentifier, rhs.ref02OtherPayerserviceFacilityLocationIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

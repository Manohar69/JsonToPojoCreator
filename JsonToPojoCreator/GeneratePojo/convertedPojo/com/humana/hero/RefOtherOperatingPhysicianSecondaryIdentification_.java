
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
    "ref01_otherOperatingPhysicianSecondaryIdentificationQlfr",
    "ref02_otherOperatingPhysicianSecondaryIdentifier"
})
public class RefOtherOperatingPhysicianSecondaryIdentification_ {

    @JsonProperty("ref01_otherOperatingPhysicianSecondaryIdentificationQlfr")
    private String ref01OtherOperatingPhysicianSecondaryIdentificationQlfr;
    @JsonProperty("ref02_otherOperatingPhysicianSecondaryIdentifier")
    private String ref02OtherOperatingPhysicianSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherOperatingPhysicianSecondaryIdentificationQlfr")
    public String getRef01OtherOperatingPhysicianSecondaryIdentificationQlfr() {
        return ref01OtherOperatingPhysicianSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_otherOperatingPhysicianSecondaryIdentificationQlfr")
    public void setRef01OtherOperatingPhysicianSecondaryIdentificationQlfr(String ref01OtherOperatingPhysicianSecondaryIdentificationQlfr) {
        this.ref01OtherOperatingPhysicianSecondaryIdentificationQlfr = ref01OtherOperatingPhysicianSecondaryIdentificationQlfr;
    }

    public RefOtherOperatingPhysicianSecondaryIdentification_ withRef01OtherOperatingPhysicianSecondaryIdentificationQlfr(String ref01OtherOperatingPhysicianSecondaryIdentificationQlfr) {
        this.ref01OtherOperatingPhysicianSecondaryIdentificationQlfr = ref01OtherOperatingPhysicianSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_otherOperatingPhysicianSecondaryIdentifier")
    public String getRef02OtherOperatingPhysicianSecondaryIdentifier() {
        return ref02OtherOperatingPhysicianSecondaryIdentifier;
    }

    @JsonProperty("ref02_otherOperatingPhysicianSecondaryIdentifier")
    public void setRef02OtherOperatingPhysicianSecondaryIdentifier(String ref02OtherOperatingPhysicianSecondaryIdentifier) {
        this.ref02OtherOperatingPhysicianSecondaryIdentifier = ref02OtherOperatingPhysicianSecondaryIdentifier;
    }

    public RefOtherOperatingPhysicianSecondaryIdentification_ withRef02OtherOperatingPhysicianSecondaryIdentifier(String ref02OtherOperatingPhysicianSecondaryIdentifier) {
        this.ref02OtherOperatingPhysicianSecondaryIdentifier = ref02OtherOperatingPhysicianSecondaryIdentifier;
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

    public RefOtherOperatingPhysicianSecondaryIdentification_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherOperatingPhysicianSecondaryIdentificationQlfr).append(ref02OtherOperatingPhysicianSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherOperatingPhysicianSecondaryIdentification_) == false) {
            return false;
        }
        RefOtherOperatingPhysicianSecondaryIdentification_ rhs = ((RefOtherOperatingPhysicianSecondaryIdentification_) other);
        return new EqualsBuilder().append(ref01OtherOperatingPhysicianSecondaryIdentificationQlfr, rhs.ref01OtherOperatingPhysicianSecondaryIdentificationQlfr).append(ref02OtherOperatingPhysicianSecondaryIdentifier, rhs.ref02OtherOperatingPhysicianSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

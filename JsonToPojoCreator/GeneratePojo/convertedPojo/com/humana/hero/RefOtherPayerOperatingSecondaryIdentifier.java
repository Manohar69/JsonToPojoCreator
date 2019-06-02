
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
    "ref01_otherPayerOperatingSecondaryIdentificationQlfr",
    "ref02_otherPayerOperatingSecondaryIdentifier"
})
public class RefOtherPayerOperatingSecondaryIdentifier {

    @JsonProperty("ref01_otherPayerOperatingSecondaryIdentificationQlfr")
    private String ref01OtherPayerOperatingSecondaryIdentificationQlfr;
    @JsonProperty("ref02_otherPayerOperatingSecondaryIdentifier")
    private String ref02OtherPayerOperatingSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerOperatingSecondaryIdentificationQlfr")
    public String getRef01OtherPayerOperatingSecondaryIdentificationQlfr() {
        return ref01OtherPayerOperatingSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_otherPayerOperatingSecondaryIdentificationQlfr")
    public void setRef01OtherPayerOperatingSecondaryIdentificationQlfr(String ref01OtherPayerOperatingSecondaryIdentificationQlfr) {
        this.ref01OtherPayerOperatingSecondaryIdentificationQlfr = ref01OtherPayerOperatingSecondaryIdentificationQlfr;
    }

    public RefOtherPayerOperatingSecondaryIdentifier withRef01OtherPayerOperatingSecondaryIdentificationQlfr(String ref01OtherPayerOperatingSecondaryIdentificationQlfr) {
        this.ref01OtherPayerOperatingSecondaryIdentificationQlfr = ref01OtherPayerOperatingSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerOperatingSecondaryIdentifier")
    public String getRef02OtherPayerOperatingSecondaryIdentifier() {
        return ref02OtherPayerOperatingSecondaryIdentifier;
    }

    @JsonProperty("ref02_otherPayerOperatingSecondaryIdentifier")
    public void setRef02OtherPayerOperatingSecondaryIdentifier(String ref02OtherPayerOperatingSecondaryIdentifier) {
        this.ref02OtherPayerOperatingSecondaryIdentifier = ref02OtherPayerOperatingSecondaryIdentifier;
    }

    public RefOtherPayerOperatingSecondaryIdentifier withRef02OtherPayerOperatingSecondaryIdentifier(String ref02OtherPayerOperatingSecondaryIdentifier) {
        this.ref02OtherPayerOperatingSecondaryIdentifier = ref02OtherPayerOperatingSecondaryIdentifier;
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

    public RefOtherPayerOperatingSecondaryIdentifier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerOperatingSecondaryIdentificationQlfr).append(ref02OtherPayerOperatingSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerOperatingSecondaryIdentifier) == false) {
            return false;
        }
        RefOtherPayerOperatingSecondaryIdentifier rhs = ((RefOtherPayerOperatingSecondaryIdentifier) other);
        return new EqualsBuilder().append(ref01OtherPayerOperatingSecondaryIdentificationQlfr, rhs.ref01OtherPayerOperatingSecondaryIdentificationQlfr).append(ref02OtherPayerOperatingSecondaryIdentifier, rhs.ref02OtherPayerOperatingSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "ref01_otherPayerOtherOperatingSecondaryIdentificationQlfr",
    "ref02_otherPayerOtherOperatingSecondaryIdentifier"
})
public class RefOtherPayerOtherOperatingSecondaryIdentifier {

    @JsonProperty("ref01_otherPayerOtherOperatingSecondaryIdentificationQlfr")
    private String ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr;
    @JsonProperty("ref02_otherPayerOtherOperatingSecondaryIdentifier")
    private String ref02OtherPayerOtherOperatingSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerOtherOperatingSecondaryIdentificationQlfr")
    public String getRef01OtherPayerOtherOperatingSecondaryIdentificationQlfr() {
        return ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_otherPayerOtherOperatingSecondaryIdentificationQlfr")
    public void setRef01OtherPayerOtherOperatingSecondaryIdentificationQlfr(String ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr) {
        this.ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr = ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr;
    }

    public RefOtherPayerOtherOperatingSecondaryIdentifier withRef01OtherPayerOtherOperatingSecondaryIdentificationQlfr(String ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr) {
        this.ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr = ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerOtherOperatingSecondaryIdentifier")
    public String getRef02OtherPayerOtherOperatingSecondaryIdentifier() {
        return ref02OtherPayerOtherOperatingSecondaryIdentifier;
    }

    @JsonProperty("ref02_otherPayerOtherOperatingSecondaryIdentifier")
    public void setRef02OtherPayerOtherOperatingSecondaryIdentifier(String ref02OtherPayerOtherOperatingSecondaryIdentifier) {
        this.ref02OtherPayerOtherOperatingSecondaryIdentifier = ref02OtherPayerOtherOperatingSecondaryIdentifier;
    }

    public RefOtherPayerOtherOperatingSecondaryIdentifier withRef02OtherPayerOtherOperatingSecondaryIdentifier(String ref02OtherPayerOtherOperatingSecondaryIdentifier) {
        this.ref02OtherPayerOtherOperatingSecondaryIdentifier = ref02OtherPayerOtherOperatingSecondaryIdentifier;
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

    public RefOtherPayerOtherOperatingSecondaryIdentifier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr).append(ref02OtherPayerOtherOperatingSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerOtherOperatingSecondaryIdentifier) == false) {
            return false;
        }
        RefOtherPayerOtherOperatingSecondaryIdentifier rhs = ((RefOtherPayerOtherOperatingSecondaryIdentifier) other);
        return new EqualsBuilder().append(ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr, rhs.ref01OtherPayerOtherOperatingSecondaryIdentificationQlfr).append(ref02OtherPayerOtherOperatingSecondaryIdentifier, rhs.ref02OtherPayerOtherOperatingSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

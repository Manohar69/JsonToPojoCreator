
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
    "ref01_otherInsuredSecondaryIdentifierQlfr",
    "ref02_otherInsuredSecondaryIdentifier"
})
public class RefOtherInsuredSecondaryIdentifier {

    @JsonProperty("ref01_otherInsuredSecondaryIdentifierQlfr")
    private String ref01OtherInsuredSecondaryIdentifierQlfr;
    @JsonProperty("ref02_otherInsuredSecondaryIdentifier")
    private String ref02OtherInsuredSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherInsuredSecondaryIdentifierQlfr")
    public String getRef01OtherInsuredSecondaryIdentifierQlfr() {
        return ref01OtherInsuredSecondaryIdentifierQlfr;
    }

    @JsonProperty("ref01_otherInsuredSecondaryIdentifierQlfr")
    public void setRef01OtherInsuredSecondaryIdentifierQlfr(String ref01OtherInsuredSecondaryIdentifierQlfr) {
        this.ref01OtherInsuredSecondaryIdentifierQlfr = ref01OtherInsuredSecondaryIdentifierQlfr;
    }

    public RefOtherInsuredSecondaryIdentifier withRef01OtherInsuredSecondaryIdentifierQlfr(String ref01OtherInsuredSecondaryIdentifierQlfr) {
        this.ref01OtherInsuredSecondaryIdentifierQlfr = ref01OtherInsuredSecondaryIdentifierQlfr;
        return this;
    }

    @JsonProperty("ref02_otherInsuredSecondaryIdentifier")
    public String getRef02OtherInsuredSecondaryIdentifier() {
        return ref02OtherInsuredSecondaryIdentifier;
    }

    @JsonProperty("ref02_otherInsuredSecondaryIdentifier")
    public void setRef02OtherInsuredSecondaryIdentifier(String ref02OtherInsuredSecondaryIdentifier) {
        this.ref02OtherInsuredSecondaryIdentifier = ref02OtherInsuredSecondaryIdentifier;
    }

    public RefOtherInsuredSecondaryIdentifier withRef02OtherInsuredSecondaryIdentifier(String ref02OtherInsuredSecondaryIdentifier) {
        this.ref02OtherInsuredSecondaryIdentifier = ref02OtherInsuredSecondaryIdentifier;
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

    public RefOtherInsuredSecondaryIdentifier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherInsuredSecondaryIdentifierQlfr).append(ref02OtherInsuredSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherInsuredSecondaryIdentifier) == false) {
            return false;
        }
        RefOtherInsuredSecondaryIdentifier rhs = ((RefOtherInsuredSecondaryIdentifier) other);
        return new EqualsBuilder().append(ref01OtherInsuredSecondaryIdentifierQlfr, rhs.ref01OtherInsuredSecondaryIdentifierQlfr).append(ref02OtherInsuredSecondaryIdentifier, rhs.ref02OtherInsuredSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

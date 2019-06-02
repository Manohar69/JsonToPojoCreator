
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
    "ref01_otherPayerSecondaryIdentifierQlfr",
    "ref02_otherPayerSecondaryIdentifier"
})
public class RefOtherPayerSecondaryIdentifier {

    @JsonProperty("ref01_otherPayerSecondaryIdentifierQlfr")
    private String ref01OtherPayerSecondaryIdentifierQlfr;
    @JsonProperty("ref02_otherPayerSecondaryIdentifier")
    private String ref02OtherPayerSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerSecondaryIdentifierQlfr")
    public String getRef01OtherPayerSecondaryIdentifierQlfr() {
        return ref01OtherPayerSecondaryIdentifierQlfr;
    }

    @JsonProperty("ref01_otherPayerSecondaryIdentifierQlfr")
    public void setRef01OtherPayerSecondaryIdentifierQlfr(String ref01OtherPayerSecondaryIdentifierQlfr) {
        this.ref01OtherPayerSecondaryIdentifierQlfr = ref01OtherPayerSecondaryIdentifierQlfr;
    }

    public RefOtherPayerSecondaryIdentifier withRef01OtherPayerSecondaryIdentifierQlfr(String ref01OtherPayerSecondaryIdentifierQlfr) {
        this.ref01OtherPayerSecondaryIdentifierQlfr = ref01OtherPayerSecondaryIdentifierQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerSecondaryIdentifier")
    public String getRef02OtherPayerSecondaryIdentifier() {
        return ref02OtherPayerSecondaryIdentifier;
    }

    @JsonProperty("ref02_otherPayerSecondaryIdentifier")
    public void setRef02OtherPayerSecondaryIdentifier(String ref02OtherPayerSecondaryIdentifier) {
        this.ref02OtherPayerSecondaryIdentifier = ref02OtherPayerSecondaryIdentifier;
    }

    public RefOtherPayerSecondaryIdentifier withRef02OtherPayerSecondaryIdentifier(String ref02OtherPayerSecondaryIdentifier) {
        this.ref02OtherPayerSecondaryIdentifier = ref02OtherPayerSecondaryIdentifier;
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

    public RefOtherPayerSecondaryIdentifier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerSecondaryIdentifierQlfr).append(ref02OtherPayerSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerSecondaryIdentifier) == false) {
            return false;
        }
        RefOtherPayerSecondaryIdentifier rhs = ((RefOtherPayerSecondaryIdentifier) other);
        return new EqualsBuilder().append(ref01OtherPayerSecondaryIdentifierQlfr, rhs.ref01OtherPayerSecondaryIdentifierQlfr).append(ref02OtherPayerSecondaryIdentifier, rhs.ref02OtherPayerSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

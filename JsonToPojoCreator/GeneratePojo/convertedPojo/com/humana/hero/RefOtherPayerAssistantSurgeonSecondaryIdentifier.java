
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
    "ref01_otherPayerAssistantSurgeonSecondaryIdentifierQlfr",
    "ref02_otherPayerAssistantSurgeonSecondaryIdentifier"
})
public class RefOtherPayerAssistantSurgeonSecondaryIdentifier {

    @JsonProperty("ref01_otherPayerAssistantSurgeonSecondaryIdentifierQlfr")
    private String ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr;
    @JsonProperty("ref02_otherPayerAssistantSurgeonSecondaryIdentifier")
    private String ref02OtherPayerAssistantSurgeonSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_otherPayerAssistantSurgeonSecondaryIdentifierQlfr")
    public String getRef01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr() {
        return ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr;
    }

    @JsonProperty("ref01_otherPayerAssistantSurgeonSecondaryIdentifierQlfr")
    public void setRef01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr(String ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr) {
        this.ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr = ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr;
    }

    public RefOtherPayerAssistantSurgeonSecondaryIdentifier withRef01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr(String ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr) {
        this.ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr = ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerAssistantSurgeonSecondaryIdentifier")
    public String getRef02OtherPayerAssistantSurgeonSecondaryIdentifier() {
        return ref02OtherPayerAssistantSurgeonSecondaryIdentifier;
    }

    @JsonProperty("ref02_otherPayerAssistantSurgeonSecondaryIdentifier")
    public void setRef02OtherPayerAssistantSurgeonSecondaryIdentifier(String ref02OtherPayerAssistantSurgeonSecondaryIdentifier) {
        this.ref02OtherPayerAssistantSurgeonSecondaryIdentifier = ref02OtherPayerAssistantSurgeonSecondaryIdentifier;
    }

    public RefOtherPayerAssistantSurgeonSecondaryIdentifier withRef02OtherPayerAssistantSurgeonSecondaryIdentifier(String ref02OtherPayerAssistantSurgeonSecondaryIdentifier) {
        this.ref02OtherPayerAssistantSurgeonSecondaryIdentifier = ref02OtherPayerAssistantSurgeonSecondaryIdentifier;
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

    public RefOtherPayerAssistantSurgeonSecondaryIdentifier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr).append(ref02OtherPayerAssistantSurgeonSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOtherPayerAssistantSurgeonSecondaryIdentifier) == false) {
            return false;
        }
        RefOtherPayerAssistantSurgeonSecondaryIdentifier rhs = ((RefOtherPayerAssistantSurgeonSecondaryIdentifier) other);
        return new EqualsBuilder().append(ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr, rhs.ref01OtherPayerAssistantSurgeonSecondaryIdentifierQlfr).append(ref02OtherPayerAssistantSurgeonSecondaryIdentifier, rhs.ref02OtherPayerAssistantSurgeonSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "ref01_assistantSurgeonSecondaryIdentificationQlfr",
    "ref02_assistantSurgeonSecondaryIdentifier"
})
public class RefAssistantSurgeonSecondaryIdentification {

    @JsonProperty("ref01_assistantSurgeonSecondaryIdentificationQlfr")
    private String ref01AssistantSurgeonSecondaryIdentificationQlfr;
    @JsonProperty("ref02_assistantSurgeonSecondaryIdentifier")
    private String ref02AssistantSurgeonSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_assistantSurgeonSecondaryIdentificationQlfr")
    public String getRef01AssistantSurgeonSecondaryIdentificationQlfr() {
        return ref01AssistantSurgeonSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_assistantSurgeonSecondaryIdentificationQlfr")
    public void setRef01AssistantSurgeonSecondaryIdentificationQlfr(String ref01AssistantSurgeonSecondaryIdentificationQlfr) {
        this.ref01AssistantSurgeonSecondaryIdentificationQlfr = ref01AssistantSurgeonSecondaryIdentificationQlfr;
    }

    public RefAssistantSurgeonSecondaryIdentification withRef01AssistantSurgeonSecondaryIdentificationQlfr(String ref01AssistantSurgeonSecondaryIdentificationQlfr) {
        this.ref01AssistantSurgeonSecondaryIdentificationQlfr = ref01AssistantSurgeonSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_assistantSurgeonSecondaryIdentifier")
    public String getRef02AssistantSurgeonSecondaryIdentifier() {
        return ref02AssistantSurgeonSecondaryIdentifier;
    }

    @JsonProperty("ref02_assistantSurgeonSecondaryIdentifier")
    public void setRef02AssistantSurgeonSecondaryIdentifier(String ref02AssistantSurgeonSecondaryIdentifier) {
        this.ref02AssistantSurgeonSecondaryIdentifier = ref02AssistantSurgeonSecondaryIdentifier;
    }

    public RefAssistantSurgeonSecondaryIdentification withRef02AssistantSurgeonSecondaryIdentifier(String ref02AssistantSurgeonSecondaryIdentifier) {
        this.ref02AssistantSurgeonSecondaryIdentifier = ref02AssistantSurgeonSecondaryIdentifier;
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

    public RefAssistantSurgeonSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01AssistantSurgeonSecondaryIdentificationQlfr).append(ref02AssistantSurgeonSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefAssistantSurgeonSecondaryIdentification) == false) {
            return false;
        }
        RefAssistantSurgeonSecondaryIdentification rhs = ((RefAssistantSurgeonSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01AssistantSurgeonSecondaryIdentificationQlfr, rhs.ref01AssistantSurgeonSecondaryIdentificationQlfr).append(ref02AssistantSurgeonSecondaryIdentifier, rhs.ref02AssistantSurgeonSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

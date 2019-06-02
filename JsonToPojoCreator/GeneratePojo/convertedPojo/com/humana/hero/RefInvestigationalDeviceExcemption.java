
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
    "ref01_investigationalDeviceExemptionIdentifierQlfr",
    "ref02_investigationalDeviceExemptionIdentifier"
})
public class RefInvestigationalDeviceExcemption {

    @JsonProperty("ref01_investigationalDeviceExemptionIdentifierQlfr")
    private String ref01InvestigationalDeviceExemptionIdentifierQlfr;
    @JsonProperty("ref02_investigationalDeviceExemptionIdentifier")
    private String ref02InvestigationalDeviceExemptionIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_investigationalDeviceExemptionIdentifierQlfr")
    public String getRef01InvestigationalDeviceExemptionIdentifierQlfr() {
        return ref01InvestigationalDeviceExemptionIdentifierQlfr;
    }

    @JsonProperty("ref01_investigationalDeviceExemptionIdentifierQlfr")
    public void setRef01InvestigationalDeviceExemptionIdentifierQlfr(String ref01InvestigationalDeviceExemptionIdentifierQlfr) {
        this.ref01InvestigationalDeviceExemptionIdentifierQlfr = ref01InvestigationalDeviceExemptionIdentifierQlfr;
    }

    public RefInvestigationalDeviceExcemption withRef01InvestigationalDeviceExemptionIdentifierQlfr(String ref01InvestigationalDeviceExemptionIdentifierQlfr) {
        this.ref01InvestigationalDeviceExemptionIdentifierQlfr = ref01InvestigationalDeviceExemptionIdentifierQlfr;
        return this;
    }

    @JsonProperty("ref02_investigationalDeviceExemptionIdentifier")
    public String getRef02InvestigationalDeviceExemptionIdentifier() {
        return ref02InvestigationalDeviceExemptionIdentifier;
    }

    @JsonProperty("ref02_investigationalDeviceExemptionIdentifier")
    public void setRef02InvestigationalDeviceExemptionIdentifier(String ref02InvestigationalDeviceExemptionIdentifier) {
        this.ref02InvestigationalDeviceExemptionIdentifier = ref02InvestigationalDeviceExemptionIdentifier;
    }

    public RefInvestigationalDeviceExcemption withRef02InvestigationalDeviceExemptionIdentifier(String ref02InvestigationalDeviceExemptionIdentifier) {
        this.ref02InvestigationalDeviceExemptionIdentifier = ref02InvestigationalDeviceExemptionIdentifier;
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

    public RefInvestigationalDeviceExcemption withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01InvestigationalDeviceExemptionIdentifierQlfr).append(ref02InvestigationalDeviceExemptionIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefInvestigationalDeviceExcemption) == false) {
            return false;
        }
        RefInvestigationalDeviceExcemption rhs = ((RefInvestigationalDeviceExcemption) other);
        return new EqualsBuilder().append(ref01InvestigationalDeviceExemptionIdentifierQlfr, rhs.ref01InvestigationalDeviceExemptionIdentifierQlfr).append(ref02InvestigationalDeviceExemptionIdentifier, rhs.ref02InvestigationalDeviceExemptionIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

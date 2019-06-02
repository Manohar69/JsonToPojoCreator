
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
    "ref01_labFacilityIdQlfr",
    "ref02_labFacilityIdentificationCode"
})
public class RefServiceFacilityLocation {

    @JsonProperty("ref01_labFacilityIdQlfr")
    private String ref01LabFacilityIdQlfr;
    @JsonProperty("ref02_labFacilityIdentificationCode")
    private String ref02LabFacilityIdentificationCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_labFacilityIdQlfr")
    public String getRef01LabFacilityIdQlfr() {
        return ref01LabFacilityIdQlfr;
    }

    @JsonProperty("ref01_labFacilityIdQlfr")
    public void setRef01LabFacilityIdQlfr(String ref01LabFacilityIdQlfr) {
        this.ref01LabFacilityIdQlfr = ref01LabFacilityIdQlfr;
    }

    public RefServiceFacilityLocation withRef01LabFacilityIdQlfr(String ref01LabFacilityIdQlfr) {
        this.ref01LabFacilityIdQlfr = ref01LabFacilityIdQlfr;
        return this;
    }

    @JsonProperty("ref02_labFacilityIdentificationCode")
    public String getRef02LabFacilityIdentificationCode() {
        return ref02LabFacilityIdentificationCode;
    }

    @JsonProperty("ref02_labFacilityIdentificationCode")
    public void setRef02LabFacilityIdentificationCode(String ref02LabFacilityIdentificationCode) {
        this.ref02LabFacilityIdentificationCode = ref02LabFacilityIdentificationCode;
    }

    public RefServiceFacilityLocation withRef02LabFacilityIdentificationCode(String ref02LabFacilityIdentificationCode) {
        this.ref02LabFacilityIdentificationCode = ref02LabFacilityIdentificationCode;
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

    public RefServiceFacilityLocation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01LabFacilityIdQlfr).append(ref02LabFacilityIdentificationCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefServiceFacilityLocation) == false) {
            return false;
        }
        RefServiceFacilityLocation rhs = ((RefServiceFacilityLocation) other);
        return new EqualsBuilder().append(ref01LabFacilityIdQlfr, rhs.ref01LabFacilityIdQlfr).append(ref02LabFacilityIdentificationCode, rhs.ref02LabFacilityIdentificationCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

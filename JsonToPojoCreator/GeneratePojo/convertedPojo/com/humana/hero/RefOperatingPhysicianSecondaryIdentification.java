
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
    "ref01_operatingPhysicianSecondaryIdentificationQlfr",
    "ref02_operatingPhysicianSecondaryIdentifier",
    "ref04_operatingPhysicianSecondaryRefIdentifierCode",
    "ref04_01_operatingPhysiciaPayerIdentificationNoQlfr",
    "ref04_02_operatingPhysiciaOtherPayerPrimaryIdentifier"
})
public class RefOperatingPhysicianSecondaryIdentification {

    @JsonProperty("ref01_operatingPhysicianSecondaryIdentificationQlfr")
    private String ref01OperatingPhysicianSecondaryIdentificationQlfr;
    @JsonProperty("ref02_operatingPhysicianSecondaryIdentifier")
    private String ref02OperatingPhysicianSecondaryIdentifier;
    @JsonProperty("ref04_operatingPhysicianSecondaryRefIdentifierCode")
    private String ref04OperatingPhysicianSecondaryRefIdentifierCode;
    @JsonProperty("ref04_01_operatingPhysiciaPayerIdentificationNoQlfr")
    private String ref0401OperatingPhysiciaPayerIdentificationNoQlfr;
    @JsonProperty("ref04_02_operatingPhysiciaOtherPayerPrimaryIdentifier")
    private String ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_operatingPhysicianSecondaryIdentificationQlfr")
    public String getRef01OperatingPhysicianSecondaryIdentificationQlfr() {
        return ref01OperatingPhysicianSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_operatingPhysicianSecondaryIdentificationQlfr")
    public void setRef01OperatingPhysicianSecondaryIdentificationQlfr(String ref01OperatingPhysicianSecondaryIdentificationQlfr) {
        this.ref01OperatingPhysicianSecondaryIdentificationQlfr = ref01OperatingPhysicianSecondaryIdentificationQlfr;
    }

    public RefOperatingPhysicianSecondaryIdentification withRef01OperatingPhysicianSecondaryIdentificationQlfr(String ref01OperatingPhysicianSecondaryIdentificationQlfr) {
        this.ref01OperatingPhysicianSecondaryIdentificationQlfr = ref01OperatingPhysicianSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_operatingPhysicianSecondaryIdentifier")
    public String getRef02OperatingPhysicianSecondaryIdentifier() {
        return ref02OperatingPhysicianSecondaryIdentifier;
    }

    @JsonProperty("ref02_operatingPhysicianSecondaryIdentifier")
    public void setRef02OperatingPhysicianSecondaryIdentifier(String ref02OperatingPhysicianSecondaryIdentifier) {
        this.ref02OperatingPhysicianSecondaryIdentifier = ref02OperatingPhysicianSecondaryIdentifier;
    }

    public RefOperatingPhysicianSecondaryIdentification withRef02OperatingPhysicianSecondaryIdentifier(String ref02OperatingPhysicianSecondaryIdentifier) {
        this.ref02OperatingPhysicianSecondaryIdentifier = ref02OperatingPhysicianSecondaryIdentifier;
        return this;
    }

    @JsonProperty("ref04_operatingPhysicianSecondaryRefIdentifierCode")
    public String getRef04OperatingPhysicianSecondaryRefIdentifierCode() {
        return ref04OperatingPhysicianSecondaryRefIdentifierCode;
    }

    @JsonProperty("ref04_operatingPhysicianSecondaryRefIdentifierCode")
    public void setRef04OperatingPhysicianSecondaryRefIdentifierCode(String ref04OperatingPhysicianSecondaryRefIdentifierCode) {
        this.ref04OperatingPhysicianSecondaryRefIdentifierCode = ref04OperatingPhysicianSecondaryRefIdentifierCode;
    }

    public RefOperatingPhysicianSecondaryIdentification withRef04OperatingPhysicianSecondaryRefIdentifierCode(String ref04OperatingPhysicianSecondaryRefIdentifierCode) {
        this.ref04OperatingPhysicianSecondaryRefIdentifierCode = ref04OperatingPhysicianSecondaryRefIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_operatingPhysiciaPayerIdentificationNoQlfr")
    public String getRef0401OperatingPhysiciaPayerIdentificationNoQlfr() {
        return ref0401OperatingPhysiciaPayerIdentificationNoQlfr;
    }

    @JsonProperty("ref04_01_operatingPhysiciaPayerIdentificationNoQlfr")
    public void setRef0401OperatingPhysiciaPayerIdentificationNoQlfr(String ref0401OperatingPhysiciaPayerIdentificationNoQlfr) {
        this.ref0401OperatingPhysiciaPayerIdentificationNoQlfr = ref0401OperatingPhysiciaPayerIdentificationNoQlfr;
    }

    public RefOperatingPhysicianSecondaryIdentification withRef0401OperatingPhysiciaPayerIdentificationNoQlfr(String ref0401OperatingPhysiciaPayerIdentificationNoQlfr) {
        this.ref0401OperatingPhysiciaPayerIdentificationNoQlfr = ref0401OperatingPhysiciaPayerIdentificationNoQlfr;
        return this;
    }

    @JsonProperty("ref04_02_operatingPhysiciaOtherPayerPrimaryIdentifier")
    public String getRef0402OperatingPhysiciaOtherPayerPrimaryIdentifier() {
        return ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier;
    }

    @JsonProperty("ref04_02_operatingPhysiciaOtherPayerPrimaryIdentifier")
    public void setRef0402OperatingPhysiciaOtherPayerPrimaryIdentifier(String ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier) {
        this.ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier = ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier;
    }

    public RefOperatingPhysicianSecondaryIdentification withRef0402OperatingPhysiciaOtherPayerPrimaryIdentifier(String ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier) {
        this.ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier = ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier;
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

    public RefOperatingPhysicianSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OperatingPhysicianSecondaryIdentificationQlfr).append(ref02OperatingPhysicianSecondaryIdentifier).append(ref04OperatingPhysicianSecondaryRefIdentifierCode).append(ref0401OperatingPhysiciaPayerIdentificationNoQlfr).append(ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOperatingPhysicianSecondaryIdentification) == false) {
            return false;
        }
        RefOperatingPhysicianSecondaryIdentification rhs = ((RefOperatingPhysicianSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01OperatingPhysicianSecondaryIdentificationQlfr, rhs.ref01OperatingPhysicianSecondaryIdentificationQlfr).append(ref02OperatingPhysicianSecondaryIdentifier, rhs.ref02OperatingPhysicianSecondaryIdentifier).append(ref04OperatingPhysicianSecondaryRefIdentifierCode, rhs.ref04OperatingPhysicianSecondaryRefIdentifierCode).append(ref0401OperatingPhysiciaPayerIdentificationNoQlfr, rhs.ref0401OperatingPhysiciaPayerIdentificationNoQlfr).append(ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier, rhs.ref0402OperatingPhysiciaOtherPayerPrimaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

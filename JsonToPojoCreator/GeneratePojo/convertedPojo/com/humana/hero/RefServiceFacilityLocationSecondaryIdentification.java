
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
    "ref01_serviceFacilityLocationSecondaryIdentificationQlfr",
    "ref02_serviceFacilityLocationSecondaryIdentifier",
    "ref04_serviceFaciltyLocationSecondaryPayerIdNoIdentifierCode",
    "ref04_01_serviceFaciltyLocationSecondaryPayerIdentificationNo",
    "ref04_02_serviceFaciltyLocationSecondaryPayerIdentificationNoQlfr"
})
public class RefServiceFacilityLocationSecondaryIdentification {

    @JsonProperty("ref01_serviceFacilityLocationSecondaryIdentificationQlfr")
    private String ref01ServiceFacilityLocationSecondaryIdentificationQlfr;
    @JsonProperty("ref02_serviceFacilityLocationSecondaryIdentifier")
    private String ref02ServiceFacilityLocationSecondaryIdentifier;
    @JsonProperty("ref04_serviceFaciltyLocationSecondaryPayerIdNoIdentifierCode")
    private String ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode;
    @JsonProperty("ref04_01_serviceFaciltyLocationSecondaryPayerIdentificationNo")
    private String ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo;
    @JsonProperty("ref04_02_serviceFaciltyLocationSecondaryPayerIdentificationNoQlfr")
    private String ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_serviceFacilityLocationSecondaryIdentificationQlfr")
    public String getRef01ServiceFacilityLocationSecondaryIdentificationQlfr() {
        return ref01ServiceFacilityLocationSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_serviceFacilityLocationSecondaryIdentificationQlfr")
    public void setRef01ServiceFacilityLocationSecondaryIdentificationQlfr(String ref01ServiceFacilityLocationSecondaryIdentificationQlfr) {
        this.ref01ServiceFacilityLocationSecondaryIdentificationQlfr = ref01ServiceFacilityLocationSecondaryIdentificationQlfr;
    }

    public RefServiceFacilityLocationSecondaryIdentification withRef01ServiceFacilityLocationSecondaryIdentificationQlfr(String ref01ServiceFacilityLocationSecondaryIdentificationQlfr) {
        this.ref01ServiceFacilityLocationSecondaryIdentificationQlfr = ref01ServiceFacilityLocationSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_serviceFacilityLocationSecondaryIdentifier")
    public String getRef02ServiceFacilityLocationSecondaryIdentifier() {
        return ref02ServiceFacilityLocationSecondaryIdentifier;
    }

    @JsonProperty("ref02_serviceFacilityLocationSecondaryIdentifier")
    public void setRef02ServiceFacilityLocationSecondaryIdentifier(String ref02ServiceFacilityLocationSecondaryIdentifier) {
        this.ref02ServiceFacilityLocationSecondaryIdentifier = ref02ServiceFacilityLocationSecondaryIdentifier;
    }

    public RefServiceFacilityLocationSecondaryIdentification withRef02ServiceFacilityLocationSecondaryIdentifier(String ref02ServiceFacilityLocationSecondaryIdentifier) {
        this.ref02ServiceFacilityLocationSecondaryIdentifier = ref02ServiceFacilityLocationSecondaryIdentifier;
        return this;
    }

    @JsonProperty("ref04_serviceFaciltyLocationSecondaryPayerIdNoIdentifierCode")
    public String getRef04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode() {
        return ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode;
    }

    @JsonProperty("ref04_serviceFaciltyLocationSecondaryPayerIdNoIdentifierCode")
    public void setRef04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode(String ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode) {
        this.ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode = ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode;
    }

    public RefServiceFacilityLocationSecondaryIdentification withRef04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode(String ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode) {
        this.ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode = ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_serviceFaciltyLocationSecondaryPayerIdentificationNo")
    public String getRef0401ServiceFaciltyLocationSecondaryPayerIdentificationNo() {
        return ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo;
    }

    @JsonProperty("ref04_01_serviceFaciltyLocationSecondaryPayerIdentificationNo")
    public void setRef0401ServiceFaciltyLocationSecondaryPayerIdentificationNo(String ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo) {
        this.ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo = ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo;
    }

    public RefServiceFacilityLocationSecondaryIdentification withRef0401ServiceFaciltyLocationSecondaryPayerIdentificationNo(String ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo) {
        this.ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo = ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo;
        return this;
    }

    @JsonProperty("ref04_02_serviceFaciltyLocationSecondaryPayerIdentificationNoQlfr")
    public String getRef0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr() {
        return ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr;
    }

    @JsonProperty("ref04_02_serviceFaciltyLocationSecondaryPayerIdentificationNoQlfr")
    public void setRef0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr(String ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr) {
        this.ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr = ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr;
    }

    public RefServiceFacilityLocationSecondaryIdentification withRef0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr(String ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr) {
        this.ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr = ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr;
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

    public RefServiceFacilityLocationSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01ServiceFacilityLocationSecondaryIdentificationQlfr).append(ref02ServiceFacilityLocationSecondaryIdentifier).append(ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode).append(ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo).append(ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefServiceFacilityLocationSecondaryIdentification) == false) {
            return false;
        }
        RefServiceFacilityLocationSecondaryIdentification rhs = ((RefServiceFacilityLocationSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01ServiceFacilityLocationSecondaryIdentificationQlfr, rhs.ref01ServiceFacilityLocationSecondaryIdentificationQlfr).append(ref02ServiceFacilityLocationSecondaryIdentifier, rhs.ref02ServiceFacilityLocationSecondaryIdentifier).append(ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode, rhs.ref04ServiceFaciltyLocationSecondaryPayerIdNoIdentifierCode).append(ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo, rhs.ref0401ServiceFaciltyLocationSecondaryPayerIdentificationNo).append(ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr, rhs.ref0402ServiceFaciltyLocationSecondaryPayerIdentificationNoQlfr).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

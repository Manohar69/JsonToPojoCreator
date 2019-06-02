
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
    "ref01_predeterminationOfBenefitsIdentificationQlfr",
    "ref02_predeterminationOfBenefitsIdentifier",
    "ref04_predeterminationOfBenefitsReferenceIdentifier",
    "ref04_01_predeterminationOfBenefitsPayerIdentificationNo",
    "ref04_02_predeterminationOfBenefitsOtherPayerPrimaryIdentifier"
})
public class RefPredeterminationOfBenefitsIdentification {

    @JsonProperty("ref01_predeterminationOfBenefitsIdentificationQlfr")
    private String ref01PredeterminationOfBenefitsIdentificationQlfr;
    @JsonProperty("ref02_predeterminationOfBenefitsIdentifier")
    private String ref02PredeterminationOfBenefitsIdentifier;
    @JsonProperty("ref04_predeterminationOfBenefitsReferenceIdentifier")
    private String ref04PredeterminationOfBenefitsReferenceIdentifier;
    @JsonProperty("ref04_01_predeterminationOfBenefitsPayerIdentificationNo")
    private String ref0401PredeterminationOfBenefitsPayerIdentificationNo;
    @JsonProperty("ref04_02_predeterminationOfBenefitsOtherPayerPrimaryIdentifier")
    private String ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_predeterminationOfBenefitsIdentificationQlfr")
    public String getRef01PredeterminationOfBenefitsIdentificationQlfr() {
        return ref01PredeterminationOfBenefitsIdentificationQlfr;
    }

    @JsonProperty("ref01_predeterminationOfBenefitsIdentificationQlfr")
    public void setRef01PredeterminationOfBenefitsIdentificationQlfr(String ref01PredeterminationOfBenefitsIdentificationQlfr) {
        this.ref01PredeterminationOfBenefitsIdentificationQlfr = ref01PredeterminationOfBenefitsIdentificationQlfr;
    }

    public RefPredeterminationOfBenefitsIdentification withRef01PredeterminationOfBenefitsIdentificationQlfr(String ref01PredeterminationOfBenefitsIdentificationQlfr) {
        this.ref01PredeterminationOfBenefitsIdentificationQlfr = ref01PredeterminationOfBenefitsIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_predeterminationOfBenefitsIdentifier")
    public String getRef02PredeterminationOfBenefitsIdentifier() {
        return ref02PredeterminationOfBenefitsIdentifier;
    }

    @JsonProperty("ref02_predeterminationOfBenefitsIdentifier")
    public void setRef02PredeterminationOfBenefitsIdentifier(String ref02PredeterminationOfBenefitsIdentifier) {
        this.ref02PredeterminationOfBenefitsIdentifier = ref02PredeterminationOfBenefitsIdentifier;
    }

    public RefPredeterminationOfBenefitsIdentification withRef02PredeterminationOfBenefitsIdentifier(String ref02PredeterminationOfBenefitsIdentifier) {
        this.ref02PredeterminationOfBenefitsIdentifier = ref02PredeterminationOfBenefitsIdentifier;
        return this;
    }

    @JsonProperty("ref04_predeterminationOfBenefitsReferenceIdentifier")
    public String getRef04PredeterminationOfBenefitsReferenceIdentifier() {
        return ref04PredeterminationOfBenefitsReferenceIdentifier;
    }

    @JsonProperty("ref04_predeterminationOfBenefitsReferenceIdentifier")
    public void setRef04PredeterminationOfBenefitsReferenceIdentifier(String ref04PredeterminationOfBenefitsReferenceIdentifier) {
        this.ref04PredeterminationOfBenefitsReferenceIdentifier = ref04PredeterminationOfBenefitsReferenceIdentifier;
    }

    public RefPredeterminationOfBenefitsIdentification withRef04PredeterminationOfBenefitsReferenceIdentifier(String ref04PredeterminationOfBenefitsReferenceIdentifier) {
        this.ref04PredeterminationOfBenefitsReferenceIdentifier = ref04PredeterminationOfBenefitsReferenceIdentifier;
        return this;
    }

    @JsonProperty("ref04_01_predeterminationOfBenefitsPayerIdentificationNo")
    public String getRef0401PredeterminationOfBenefitsPayerIdentificationNo() {
        return ref0401PredeterminationOfBenefitsPayerIdentificationNo;
    }

    @JsonProperty("ref04_01_predeterminationOfBenefitsPayerIdentificationNo")
    public void setRef0401PredeterminationOfBenefitsPayerIdentificationNo(String ref0401PredeterminationOfBenefitsPayerIdentificationNo) {
        this.ref0401PredeterminationOfBenefitsPayerIdentificationNo = ref0401PredeterminationOfBenefitsPayerIdentificationNo;
    }

    public RefPredeterminationOfBenefitsIdentification withRef0401PredeterminationOfBenefitsPayerIdentificationNo(String ref0401PredeterminationOfBenefitsPayerIdentificationNo) {
        this.ref0401PredeterminationOfBenefitsPayerIdentificationNo = ref0401PredeterminationOfBenefitsPayerIdentificationNo;
        return this;
    }

    @JsonProperty("ref04_02_predeterminationOfBenefitsOtherPayerPrimaryIdentifier")
    public String getRef0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier() {
        return ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier;
    }

    @JsonProperty("ref04_02_predeterminationOfBenefitsOtherPayerPrimaryIdentifier")
    public void setRef0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier(String ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier) {
        this.ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier = ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier;
    }

    public RefPredeterminationOfBenefitsIdentification withRef0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier(String ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier) {
        this.ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier = ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier;
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

    public RefPredeterminationOfBenefitsIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01PredeterminationOfBenefitsIdentificationQlfr).append(ref02PredeterminationOfBenefitsIdentifier).append(ref04PredeterminationOfBenefitsReferenceIdentifier).append(ref0401PredeterminationOfBenefitsPayerIdentificationNo).append(ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefPredeterminationOfBenefitsIdentification) == false) {
            return false;
        }
        RefPredeterminationOfBenefitsIdentification rhs = ((RefPredeterminationOfBenefitsIdentification) other);
        return new EqualsBuilder().append(ref01PredeterminationOfBenefitsIdentificationQlfr, rhs.ref01PredeterminationOfBenefitsIdentificationQlfr).append(ref02PredeterminationOfBenefitsIdentifier, rhs.ref02PredeterminationOfBenefitsIdentifier).append(ref04PredeterminationOfBenefitsReferenceIdentifier, rhs.ref04PredeterminationOfBenefitsReferenceIdentifier).append(ref0401PredeterminationOfBenefitsPayerIdentificationNo, rhs.ref0401PredeterminationOfBenefitsPayerIdentificationNo).append(ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier, rhs.ref0402PredeterminationOfBenefitsOtherPayerPrimaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

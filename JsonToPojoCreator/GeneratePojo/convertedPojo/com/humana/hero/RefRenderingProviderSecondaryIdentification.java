
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
    "ref01_renderingProviderSecondaryQlfr",
    "ref02_renderingProviderSecondaryIdentification",
    "ref04_referenceIdentifierCode",
    "ref04_01_payerIdentificationNo",
    "ref04_02_otherPayerPrimaryIdentifier"
})
public class RefRenderingProviderSecondaryIdentification {

    @JsonProperty("ref01_renderingProviderSecondaryQlfr")
    private String ref01RenderingProviderSecondaryQlfr;
    @JsonProperty("ref02_renderingProviderSecondaryIdentification")
    private String ref02RenderingProviderSecondaryIdentification;
    @JsonProperty("ref04_referenceIdentifierCode")
    private String ref04ReferenceIdentifierCode;
    @JsonProperty("ref04_01_payerIdentificationNo")
    private String ref0401PayerIdentificationNo;
    @JsonProperty("ref04_02_otherPayerPrimaryIdentifier")
    private String ref0402OtherPayerPrimaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_renderingProviderSecondaryQlfr")
    public String getRef01RenderingProviderSecondaryQlfr() {
        return ref01RenderingProviderSecondaryQlfr;
    }

    @JsonProperty("ref01_renderingProviderSecondaryQlfr")
    public void setRef01RenderingProviderSecondaryQlfr(String ref01RenderingProviderSecondaryQlfr) {
        this.ref01RenderingProviderSecondaryQlfr = ref01RenderingProviderSecondaryQlfr;
    }

    public RefRenderingProviderSecondaryIdentification withRef01RenderingProviderSecondaryQlfr(String ref01RenderingProviderSecondaryQlfr) {
        this.ref01RenderingProviderSecondaryQlfr = ref01RenderingProviderSecondaryQlfr;
        return this;
    }

    @JsonProperty("ref02_renderingProviderSecondaryIdentification")
    public String getRef02RenderingProviderSecondaryIdentification() {
        return ref02RenderingProviderSecondaryIdentification;
    }

    @JsonProperty("ref02_renderingProviderSecondaryIdentification")
    public void setRef02RenderingProviderSecondaryIdentification(String ref02RenderingProviderSecondaryIdentification) {
        this.ref02RenderingProviderSecondaryIdentification = ref02RenderingProviderSecondaryIdentification;
    }

    public RefRenderingProviderSecondaryIdentification withRef02RenderingProviderSecondaryIdentification(String ref02RenderingProviderSecondaryIdentification) {
        this.ref02RenderingProviderSecondaryIdentification = ref02RenderingProviderSecondaryIdentification;
        return this;
    }

    @JsonProperty("ref04_referenceIdentifierCode")
    public String getRef04ReferenceIdentifierCode() {
        return ref04ReferenceIdentifierCode;
    }

    @JsonProperty("ref04_referenceIdentifierCode")
    public void setRef04ReferenceIdentifierCode(String ref04ReferenceIdentifierCode) {
        this.ref04ReferenceIdentifierCode = ref04ReferenceIdentifierCode;
    }

    public RefRenderingProviderSecondaryIdentification withRef04ReferenceIdentifierCode(String ref04ReferenceIdentifierCode) {
        this.ref04ReferenceIdentifierCode = ref04ReferenceIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_payerIdentificationNo")
    public String getRef0401PayerIdentificationNo() {
        return ref0401PayerIdentificationNo;
    }

    @JsonProperty("ref04_01_payerIdentificationNo")
    public void setRef0401PayerIdentificationNo(String ref0401PayerIdentificationNo) {
        this.ref0401PayerIdentificationNo = ref0401PayerIdentificationNo;
    }

    public RefRenderingProviderSecondaryIdentification withRef0401PayerIdentificationNo(String ref0401PayerIdentificationNo) {
        this.ref0401PayerIdentificationNo = ref0401PayerIdentificationNo;
        return this;
    }

    @JsonProperty("ref04_02_otherPayerPrimaryIdentifier")
    public String getRef0402OtherPayerPrimaryIdentifier() {
        return ref0402OtherPayerPrimaryIdentifier;
    }

    @JsonProperty("ref04_02_otherPayerPrimaryIdentifier")
    public void setRef0402OtherPayerPrimaryIdentifier(String ref0402OtherPayerPrimaryIdentifier) {
        this.ref0402OtherPayerPrimaryIdentifier = ref0402OtherPayerPrimaryIdentifier;
    }

    public RefRenderingProviderSecondaryIdentification withRef0402OtherPayerPrimaryIdentifier(String ref0402OtherPayerPrimaryIdentifier) {
        this.ref0402OtherPayerPrimaryIdentifier = ref0402OtherPayerPrimaryIdentifier;
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

    public RefRenderingProviderSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01RenderingProviderSecondaryQlfr).append(ref02RenderingProviderSecondaryIdentification).append(ref04ReferenceIdentifierCode).append(ref0401PayerIdentificationNo).append(ref0402OtherPayerPrimaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefRenderingProviderSecondaryIdentification) == false) {
            return false;
        }
        RefRenderingProviderSecondaryIdentification rhs = ((RefRenderingProviderSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01RenderingProviderSecondaryQlfr, rhs.ref01RenderingProviderSecondaryQlfr).append(ref02RenderingProviderSecondaryIdentification, rhs.ref02RenderingProviderSecondaryIdentification).append(ref04ReferenceIdentifierCode, rhs.ref04ReferenceIdentifierCode).append(ref0401PayerIdentificationNo, rhs.ref0401PayerIdentificationNo).append(ref0402OtherPayerPrimaryIdentifier, rhs.ref0402OtherPayerPrimaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

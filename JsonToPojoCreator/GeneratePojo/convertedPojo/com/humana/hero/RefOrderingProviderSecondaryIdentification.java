
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
    "ref01_orderingProviderSecondaryIdentificationQlfr",
    "ref02_orderingProviderSecondaryIdentification",
    "ref04_orderingProviderSecondaryIdentifierCode",
    "ref04_01_orderingProviderSecondaryIdentificationQlfr",
    "ref04_02_orderingProviderSecondaryIdentifierNo"
})
public class RefOrderingProviderSecondaryIdentification {

    @JsonProperty("ref01_orderingProviderSecondaryIdentificationQlfr")
    private String ref01OrderingProviderSecondaryIdentificationQlfr;
    @JsonProperty("ref02_orderingProviderSecondaryIdentification")
    private String ref02OrderingProviderSecondaryIdentification;
    @JsonProperty("ref04_orderingProviderSecondaryIdentifierCode")
    private String ref04OrderingProviderSecondaryIdentifierCode;
    @JsonProperty("ref04_01_orderingProviderSecondaryIdentificationQlfr")
    private String ref0401OrderingProviderSecondaryIdentificationQlfr;
    @JsonProperty("ref04_02_orderingProviderSecondaryIdentifierNo")
    private String ref0402OrderingProviderSecondaryIdentifierNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_orderingProviderSecondaryIdentificationQlfr")
    public String getRef01OrderingProviderSecondaryIdentificationQlfr() {
        return ref01OrderingProviderSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_orderingProviderSecondaryIdentificationQlfr")
    public void setRef01OrderingProviderSecondaryIdentificationQlfr(String ref01OrderingProviderSecondaryIdentificationQlfr) {
        this.ref01OrderingProviderSecondaryIdentificationQlfr = ref01OrderingProviderSecondaryIdentificationQlfr;
    }

    public RefOrderingProviderSecondaryIdentification withRef01OrderingProviderSecondaryIdentificationQlfr(String ref01OrderingProviderSecondaryIdentificationQlfr) {
        this.ref01OrderingProviderSecondaryIdentificationQlfr = ref01OrderingProviderSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_orderingProviderSecondaryIdentification")
    public String getRef02OrderingProviderSecondaryIdentification() {
        return ref02OrderingProviderSecondaryIdentification;
    }

    @JsonProperty("ref02_orderingProviderSecondaryIdentification")
    public void setRef02OrderingProviderSecondaryIdentification(String ref02OrderingProviderSecondaryIdentification) {
        this.ref02OrderingProviderSecondaryIdentification = ref02OrderingProviderSecondaryIdentification;
    }

    public RefOrderingProviderSecondaryIdentification withRef02OrderingProviderSecondaryIdentification(String ref02OrderingProviderSecondaryIdentification) {
        this.ref02OrderingProviderSecondaryIdentification = ref02OrderingProviderSecondaryIdentification;
        return this;
    }

    @JsonProperty("ref04_orderingProviderSecondaryIdentifierCode")
    public String getRef04OrderingProviderSecondaryIdentifierCode() {
        return ref04OrderingProviderSecondaryIdentifierCode;
    }

    @JsonProperty("ref04_orderingProviderSecondaryIdentifierCode")
    public void setRef04OrderingProviderSecondaryIdentifierCode(String ref04OrderingProviderSecondaryIdentifierCode) {
        this.ref04OrderingProviderSecondaryIdentifierCode = ref04OrderingProviderSecondaryIdentifierCode;
    }

    public RefOrderingProviderSecondaryIdentification withRef04OrderingProviderSecondaryIdentifierCode(String ref04OrderingProviderSecondaryIdentifierCode) {
        this.ref04OrderingProviderSecondaryIdentifierCode = ref04OrderingProviderSecondaryIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_orderingProviderSecondaryIdentificationQlfr")
    public String getRef0401OrderingProviderSecondaryIdentificationQlfr() {
        return ref0401OrderingProviderSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref04_01_orderingProviderSecondaryIdentificationQlfr")
    public void setRef0401OrderingProviderSecondaryIdentificationQlfr(String ref0401OrderingProviderSecondaryIdentificationQlfr) {
        this.ref0401OrderingProviderSecondaryIdentificationQlfr = ref0401OrderingProviderSecondaryIdentificationQlfr;
    }

    public RefOrderingProviderSecondaryIdentification withRef0401OrderingProviderSecondaryIdentificationQlfr(String ref0401OrderingProviderSecondaryIdentificationQlfr) {
        this.ref0401OrderingProviderSecondaryIdentificationQlfr = ref0401OrderingProviderSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref04_02_orderingProviderSecondaryIdentifierNo")
    public String getRef0402OrderingProviderSecondaryIdentifierNo() {
        return ref0402OrderingProviderSecondaryIdentifierNo;
    }

    @JsonProperty("ref04_02_orderingProviderSecondaryIdentifierNo")
    public void setRef0402OrderingProviderSecondaryIdentifierNo(String ref0402OrderingProviderSecondaryIdentifierNo) {
        this.ref0402OrderingProviderSecondaryIdentifierNo = ref0402OrderingProviderSecondaryIdentifierNo;
    }

    public RefOrderingProviderSecondaryIdentification withRef0402OrderingProviderSecondaryIdentifierNo(String ref0402OrderingProviderSecondaryIdentifierNo) {
        this.ref0402OrderingProviderSecondaryIdentifierNo = ref0402OrderingProviderSecondaryIdentifierNo;
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

    public RefOrderingProviderSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01OrderingProviderSecondaryIdentificationQlfr).append(ref02OrderingProviderSecondaryIdentification).append(ref04OrderingProviderSecondaryIdentifierCode).append(ref0401OrderingProviderSecondaryIdentificationQlfr).append(ref0402OrderingProviderSecondaryIdentifierNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefOrderingProviderSecondaryIdentification) == false) {
            return false;
        }
        RefOrderingProviderSecondaryIdentification rhs = ((RefOrderingProviderSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01OrderingProviderSecondaryIdentificationQlfr, rhs.ref01OrderingProviderSecondaryIdentificationQlfr).append(ref02OrderingProviderSecondaryIdentification, rhs.ref02OrderingProviderSecondaryIdentification).append(ref04OrderingProviderSecondaryIdentifierCode, rhs.ref04OrderingProviderSecondaryIdentifierCode).append(ref0401OrderingProviderSecondaryIdentificationQlfr, rhs.ref0401OrderingProviderSecondaryIdentificationQlfr).append(ref0402OrderingProviderSecondaryIdentifierNo, rhs.ref0402OrderingProviderSecondaryIdentifierNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

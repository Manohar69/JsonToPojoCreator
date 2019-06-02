
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
    "ref01_priorAuthorizationNoQlfr",
    "ref02_priorAuthorizationNo",
    "ref04_priorAuthorizationOtherPayerPrimaryRefIdentifierCode",
    "ref04_01_priorAuthorizationOtherPayerPrimaryQlfr",
    "ref04_02_priorauthorizationOtherPayerPrimaryIdentifier"
})
public class RefPriorAuthorization {

    @JsonProperty("ref01_priorAuthorizationNoQlfr")
    private String ref01PriorAuthorizationNoQlfr;
    @JsonProperty("ref02_priorAuthorizationNo")
    private String ref02PriorAuthorizationNo;
    @JsonProperty("ref04_priorAuthorizationOtherPayerPrimaryRefIdentifierCode")
    private String ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode;
    @JsonProperty("ref04_01_priorAuthorizationOtherPayerPrimaryQlfr")
    private String ref0401PriorAuthorizationOtherPayerPrimaryQlfr;
    @JsonProperty("ref04_02_priorauthorizationOtherPayerPrimaryIdentifier")
    private String ref0402PriorauthorizationOtherPayerPrimaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_priorAuthorizationNoQlfr")
    public String getRef01PriorAuthorizationNoQlfr() {
        return ref01PriorAuthorizationNoQlfr;
    }

    @JsonProperty("ref01_priorAuthorizationNoQlfr")
    public void setRef01PriorAuthorizationNoQlfr(String ref01PriorAuthorizationNoQlfr) {
        this.ref01PriorAuthorizationNoQlfr = ref01PriorAuthorizationNoQlfr;
    }

    public RefPriorAuthorization withRef01PriorAuthorizationNoQlfr(String ref01PriorAuthorizationNoQlfr) {
        this.ref01PriorAuthorizationNoQlfr = ref01PriorAuthorizationNoQlfr;
        return this;
    }

    @JsonProperty("ref02_priorAuthorizationNo")
    public String getRef02PriorAuthorizationNo() {
        return ref02PriorAuthorizationNo;
    }

    @JsonProperty("ref02_priorAuthorizationNo")
    public void setRef02PriorAuthorizationNo(String ref02PriorAuthorizationNo) {
        this.ref02PriorAuthorizationNo = ref02PriorAuthorizationNo;
    }

    public RefPriorAuthorization withRef02PriorAuthorizationNo(String ref02PriorAuthorizationNo) {
        this.ref02PriorAuthorizationNo = ref02PriorAuthorizationNo;
        return this;
    }

    @JsonProperty("ref04_priorAuthorizationOtherPayerPrimaryRefIdentifierCode")
    public String getRef04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode() {
        return ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode;
    }

    @JsonProperty("ref04_priorAuthorizationOtherPayerPrimaryRefIdentifierCode")
    public void setRef04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode(String ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode) {
        this.ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode = ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode;
    }

    public RefPriorAuthorization withRef04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode(String ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode) {
        this.ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode = ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_priorAuthorizationOtherPayerPrimaryQlfr")
    public String getRef0401PriorAuthorizationOtherPayerPrimaryQlfr() {
        return ref0401PriorAuthorizationOtherPayerPrimaryQlfr;
    }

    @JsonProperty("ref04_01_priorAuthorizationOtherPayerPrimaryQlfr")
    public void setRef0401PriorAuthorizationOtherPayerPrimaryQlfr(String ref0401PriorAuthorizationOtherPayerPrimaryQlfr) {
        this.ref0401PriorAuthorizationOtherPayerPrimaryQlfr = ref0401PriorAuthorizationOtherPayerPrimaryQlfr;
    }

    public RefPriorAuthorization withRef0401PriorAuthorizationOtherPayerPrimaryQlfr(String ref0401PriorAuthorizationOtherPayerPrimaryQlfr) {
        this.ref0401PriorAuthorizationOtherPayerPrimaryQlfr = ref0401PriorAuthorizationOtherPayerPrimaryQlfr;
        return this;
    }

    @JsonProperty("ref04_02_priorauthorizationOtherPayerPrimaryIdentifier")
    public String getRef0402PriorauthorizationOtherPayerPrimaryIdentifier() {
        return ref0402PriorauthorizationOtherPayerPrimaryIdentifier;
    }

    @JsonProperty("ref04_02_priorauthorizationOtherPayerPrimaryIdentifier")
    public void setRef0402PriorauthorizationOtherPayerPrimaryIdentifier(String ref0402PriorauthorizationOtherPayerPrimaryIdentifier) {
        this.ref0402PriorauthorizationOtherPayerPrimaryIdentifier = ref0402PriorauthorizationOtherPayerPrimaryIdentifier;
    }

    public RefPriorAuthorization withRef0402PriorauthorizationOtherPayerPrimaryIdentifier(String ref0402PriorauthorizationOtherPayerPrimaryIdentifier) {
        this.ref0402PriorauthorizationOtherPayerPrimaryIdentifier = ref0402PriorauthorizationOtherPayerPrimaryIdentifier;
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

    public RefPriorAuthorization withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01PriorAuthorizationNoQlfr).append(ref02PriorAuthorizationNo).append(ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode).append(ref0401PriorAuthorizationOtherPayerPrimaryQlfr).append(ref0402PriorauthorizationOtherPayerPrimaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefPriorAuthorization) == false) {
            return false;
        }
        RefPriorAuthorization rhs = ((RefPriorAuthorization) other);
        return new EqualsBuilder().append(ref01PriorAuthorizationNoQlfr, rhs.ref01PriorAuthorizationNoQlfr).append(ref02PriorAuthorizationNo, rhs.ref02PriorAuthorizationNo).append(ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode, rhs.ref04PriorAuthorizationOtherPayerPrimaryRefIdentifierCode).append(ref0401PriorAuthorizationOtherPayerPrimaryQlfr, rhs.ref0401PriorAuthorizationOtherPayerPrimaryQlfr).append(ref0402PriorauthorizationOtherPayerPrimaryIdentifier, rhs.ref0402PriorauthorizationOtherPayerPrimaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

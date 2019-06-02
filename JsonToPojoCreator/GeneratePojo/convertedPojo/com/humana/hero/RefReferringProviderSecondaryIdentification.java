
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
    "ref01_referringProviderSecondaryIdentificationQlfr",
    "ref02_referringProviderSecondaryIdentification",
    "ref04_referringProviderSecondaryIdentifierCode",
    "ref04_01_referringProviderSecondaryIdentificationQlfr",
    "ref04_02_referringProviderSecondaryIdentifierNo"
})
public class RefReferringProviderSecondaryIdentification {

    @JsonProperty("ref01_referringProviderSecondaryIdentificationQlfr")
    private String ref01ReferringProviderSecondaryIdentificationQlfr;
    @JsonProperty("ref02_referringProviderSecondaryIdentification")
    private String ref02ReferringProviderSecondaryIdentification;
    @JsonProperty("ref04_referringProviderSecondaryIdentifierCode")
    private String ref04ReferringProviderSecondaryIdentifierCode;
    @JsonProperty("ref04_01_referringProviderSecondaryIdentificationQlfr")
    private String ref0401ReferringProviderSecondaryIdentificationQlfr;
    @JsonProperty("ref04_02_referringProviderSecondaryIdentifierNo")
    private String ref0402ReferringProviderSecondaryIdentifierNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_referringProviderSecondaryIdentificationQlfr")
    public String getRef01ReferringProviderSecondaryIdentificationQlfr() {
        return ref01ReferringProviderSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_referringProviderSecondaryIdentificationQlfr")
    public void setRef01ReferringProviderSecondaryIdentificationQlfr(String ref01ReferringProviderSecondaryIdentificationQlfr) {
        this.ref01ReferringProviderSecondaryIdentificationQlfr = ref01ReferringProviderSecondaryIdentificationQlfr;
    }

    public RefReferringProviderSecondaryIdentification withRef01ReferringProviderSecondaryIdentificationQlfr(String ref01ReferringProviderSecondaryIdentificationQlfr) {
        this.ref01ReferringProviderSecondaryIdentificationQlfr = ref01ReferringProviderSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_referringProviderSecondaryIdentification")
    public String getRef02ReferringProviderSecondaryIdentification() {
        return ref02ReferringProviderSecondaryIdentification;
    }

    @JsonProperty("ref02_referringProviderSecondaryIdentification")
    public void setRef02ReferringProviderSecondaryIdentification(String ref02ReferringProviderSecondaryIdentification) {
        this.ref02ReferringProviderSecondaryIdentification = ref02ReferringProviderSecondaryIdentification;
    }

    public RefReferringProviderSecondaryIdentification withRef02ReferringProviderSecondaryIdentification(String ref02ReferringProviderSecondaryIdentification) {
        this.ref02ReferringProviderSecondaryIdentification = ref02ReferringProviderSecondaryIdentification;
        return this;
    }

    @JsonProperty("ref04_referringProviderSecondaryIdentifierCode")
    public String getRef04ReferringProviderSecondaryIdentifierCode() {
        return ref04ReferringProviderSecondaryIdentifierCode;
    }

    @JsonProperty("ref04_referringProviderSecondaryIdentifierCode")
    public void setRef04ReferringProviderSecondaryIdentifierCode(String ref04ReferringProviderSecondaryIdentifierCode) {
        this.ref04ReferringProviderSecondaryIdentifierCode = ref04ReferringProviderSecondaryIdentifierCode;
    }

    public RefReferringProviderSecondaryIdentification withRef04ReferringProviderSecondaryIdentifierCode(String ref04ReferringProviderSecondaryIdentifierCode) {
        this.ref04ReferringProviderSecondaryIdentifierCode = ref04ReferringProviderSecondaryIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_referringProviderSecondaryIdentificationQlfr")
    public String getRef0401ReferringProviderSecondaryIdentificationQlfr() {
        return ref0401ReferringProviderSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref04_01_referringProviderSecondaryIdentificationQlfr")
    public void setRef0401ReferringProviderSecondaryIdentificationQlfr(String ref0401ReferringProviderSecondaryIdentificationQlfr) {
        this.ref0401ReferringProviderSecondaryIdentificationQlfr = ref0401ReferringProviderSecondaryIdentificationQlfr;
    }

    public RefReferringProviderSecondaryIdentification withRef0401ReferringProviderSecondaryIdentificationQlfr(String ref0401ReferringProviderSecondaryIdentificationQlfr) {
        this.ref0401ReferringProviderSecondaryIdentificationQlfr = ref0401ReferringProviderSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref04_02_referringProviderSecondaryIdentifierNo")
    public String getRef0402ReferringProviderSecondaryIdentifierNo() {
        return ref0402ReferringProviderSecondaryIdentifierNo;
    }

    @JsonProperty("ref04_02_referringProviderSecondaryIdentifierNo")
    public void setRef0402ReferringProviderSecondaryIdentifierNo(String ref0402ReferringProviderSecondaryIdentifierNo) {
        this.ref0402ReferringProviderSecondaryIdentifierNo = ref0402ReferringProviderSecondaryIdentifierNo;
    }

    public RefReferringProviderSecondaryIdentification withRef0402ReferringProviderSecondaryIdentifierNo(String ref0402ReferringProviderSecondaryIdentifierNo) {
        this.ref0402ReferringProviderSecondaryIdentifierNo = ref0402ReferringProviderSecondaryIdentifierNo;
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

    public RefReferringProviderSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01ReferringProviderSecondaryIdentificationQlfr).append(ref02ReferringProviderSecondaryIdentification).append(ref04ReferringProviderSecondaryIdentifierCode).append(ref0401ReferringProviderSecondaryIdentificationQlfr).append(ref0402ReferringProviderSecondaryIdentifierNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefReferringProviderSecondaryIdentification) == false) {
            return false;
        }
        RefReferringProviderSecondaryIdentification rhs = ((RefReferringProviderSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01ReferringProviderSecondaryIdentificationQlfr, rhs.ref01ReferringProviderSecondaryIdentificationQlfr).append(ref02ReferringProviderSecondaryIdentification, rhs.ref02ReferringProviderSecondaryIdentification).append(ref04ReferringProviderSecondaryIdentifierCode, rhs.ref04ReferringProviderSecondaryIdentifierCode).append(ref0401ReferringProviderSecondaryIdentificationQlfr, rhs.ref0401ReferringProviderSecondaryIdentificationQlfr).append(ref0402ReferringProviderSecondaryIdentifierNo, rhs.ref0402ReferringProviderSecondaryIdentifierNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

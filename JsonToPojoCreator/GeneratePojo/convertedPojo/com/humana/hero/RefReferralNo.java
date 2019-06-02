
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
    "ref01_referralNoQlfr",
    "ref02_referralNo",
    "ref04_referralIdentifierCode",
    "ref04_01_referralOtherPayerPrimaryIdIdentity",
    "ref04_02_referralOtherPayerPrimaryId"
})
public class RefReferralNo {

    @JsonProperty("ref01_referralNoQlfr")
    private String ref01ReferralNoQlfr;
    @JsonProperty("ref02_referralNo")
    private String ref02ReferralNo;
    @JsonProperty("ref04_referralIdentifierCode")
    private String ref04ReferralIdentifierCode;
    @JsonProperty("ref04_01_referralOtherPayerPrimaryIdIdentity")
    private String ref0401ReferralOtherPayerPrimaryIdIdentity;
    @JsonProperty("ref04_02_referralOtherPayerPrimaryId")
    private String ref0402ReferralOtherPayerPrimaryId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_referralNoQlfr")
    public String getRef01ReferralNoQlfr() {
        return ref01ReferralNoQlfr;
    }

    @JsonProperty("ref01_referralNoQlfr")
    public void setRef01ReferralNoQlfr(String ref01ReferralNoQlfr) {
        this.ref01ReferralNoQlfr = ref01ReferralNoQlfr;
    }

    public RefReferralNo withRef01ReferralNoQlfr(String ref01ReferralNoQlfr) {
        this.ref01ReferralNoQlfr = ref01ReferralNoQlfr;
        return this;
    }

    @JsonProperty("ref02_referralNo")
    public String getRef02ReferralNo() {
        return ref02ReferralNo;
    }

    @JsonProperty("ref02_referralNo")
    public void setRef02ReferralNo(String ref02ReferralNo) {
        this.ref02ReferralNo = ref02ReferralNo;
    }

    public RefReferralNo withRef02ReferralNo(String ref02ReferralNo) {
        this.ref02ReferralNo = ref02ReferralNo;
        return this;
    }

    @JsonProperty("ref04_referralIdentifierCode")
    public String getRef04ReferralIdentifierCode() {
        return ref04ReferralIdentifierCode;
    }

    @JsonProperty("ref04_referralIdentifierCode")
    public void setRef04ReferralIdentifierCode(String ref04ReferralIdentifierCode) {
        this.ref04ReferralIdentifierCode = ref04ReferralIdentifierCode;
    }

    public RefReferralNo withRef04ReferralIdentifierCode(String ref04ReferralIdentifierCode) {
        this.ref04ReferralIdentifierCode = ref04ReferralIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_referralOtherPayerPrimaryIdIdentity")
    public String getRef0401ReferralOtherPayerPrimaryIdIdentity() {
        return ref0401ReferralOtherPayerPrimaryIdIdentity;
    }

    @JsonProperty("ref04_01_referralOtherPayerPrimaryIdIdentity")
    public void setRef0401ReferralOtherPayerPrimaryIdIdentity(String ref0401ReferralOtherPayerPrimaryIdIdentity) {
        this.ref0401ReferralOtherPayerPrimaryIdIdentity = ref0401ReferralOtherPayerPrimaryIdIdentity;
    }

    public RefReferralNo withRef0401ReferralOtherPayerPrimaryIdIdentity(String ref0401ReferralOtherPayerPrimaryIdIdentity) {
        this.ref0401ReferralOtherPayerPrimaryIdIdentity = ref0401ReferralOtherPayerPrimaryIdIdentity;
        return this;
    }

    @JsonProperty("ref04_02_referralOtherPayerPrimaryId")
    public String getRef0402ReferralOtherPayerPrimaryId() {
        return ref0402ReferralOtherPayerPrimaryId;
    }

    @JsonProperty("ref04_02_referralOtherPayerPrimaryId")
    public void setRef0402ReferralOtherPayerPrimaryId(String ref0402ReferralOtherPayerPrimaryId) {
        this.ref0402ReferralOtherPayerPrimaryId = ref0402ReferralOtherPayerPrimaryId;
    }

    public RefReferralNo withRef0402ReferralOtherPayerPrimaryId(String ref0402ReferralOtherPayerPrimaryId) {
        this.ref0402ReferralOtherPayerPrimaryId = ref0402ReferralOtherPayerPrimaryId;
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

    public RefReferralNo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01ReferralNoQlfr).append(ref02ReferralNo).append(ref04ReferralIdentifierCode).append(ref0401ReferralOtherPayerPrimaryIdIdentity).append(ref0402ReferralOtherPayerPrimaryId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefReferralNo) == false) {
            return false;
        }
        RefReferralNo rhs = ((RefReferralNo) other);
        return new EqualsBuilder().append(ref01ReferralNoQlfr, rhs.ref01ReferralNoQlfr).append(ref02ReferralNo, rhs.ref02ReferralNo).append(ref04ReferralIdentifierCode, rhs.ref04ReferralIdentifierCode).append(ref0401ReferralOtherPayerPrimaryIdIdentity, rhs.ref0401ReferralOtherPayerPrimaryIdIdentity).append(ref0402ReferralOtherPayerPrimaryId, rhs.ref0402ReferralOtherPayerPrimaryId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


package com.humana.hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "nm101_otherOperatingPhysicianCode",
    "nm102_otherOperatingPhysicianNameQlfr",
    "nm103_otherOperatingPhysicianLastName",
    "nm104_otherOperatingPhysicianFirstName",
    "nm105_otherOperatingPhysicianMiddleName",
    "nm107_otherOperatingPhysicianSuffix",
    "nm108_otherOperatingPhysicianIdentificationCodeQlfr",
    "nm109_otherOperatingPhysicianIdentifier",
    "ref_otherOperatingPhysicianSecondaryIdentification"
})
public class OtherOperatingPhysicianName {

    @JsonProperty("nm101_otherOperatingPhysicianCode")
    private String nm101OtherOperatingPhysicianCode;
    @JsonProperty("nm102_otherOperatingPhysicianNameQlfr")
    private String nm102OtherOperatingPhysicianNameQlfr;
    @JsonProperty("nm103_otherOperatingPhysicianLastName")
    private String nm103OtherOperatingPhysicianLastName;
    @JsonProperty("nm104_otherOperatingPhysicianFirstName")
    private String nm104OtherOperatingPhysicianFirstName;
    @JsonProperty("nm105_otherOperatingPhysicianMiddleName")
    private String nm105OtherOperatingPhysicianMiddleName;
    @JsonProperty("nm107_otherOperatingPhysicianSuffix")
    private String nm107OtherOperatingPhysicianSuffix;
    @JsonProperty("nm108_otherOperatingPhysicianIdentificationCodeQlfr")
    private String nm108OtherOperatingPhysicianIdentificationCodeQlfr;
    @JsonProperty("nm109_otherOperatingPhysicianIdentifier")
    private String nm109OtherOperatingPhysicianIdentifier;
    @JsonProperty("ref_otherOperatingPhysicianSecondaryIdentification")
    private List<RefOtherOperatingPhysicianSecondaryIdentification> refOtherOperatingPhysicianSecondaryIdentification = new ArrayList<RefOtherOperatingPhysicianSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherOperatingPhysicianCode")
    public String getNm101OtherOperatingPhysicianCode() {
        return nm101OtherOperatingPhysicianCode;
    }

    @JsonProperty("nm101_otherOperatingPhysicianCode")
    public void setNm101OtherOperatingPhysicianCode(String nm101OtherOperatingPhysicianCode) {
        this.nm101OtherOperatingPhysicianCode = nm101OtherOperatingPhysicianCode;
    }

    public OtherOperatingPhysicianName withNm101OtherOperatingPhysicianCode(String nm101OtherOperatingPhysicianCode) {
        this.nm101OtherOperatingPhysicianCode = nm101OtherOperatingPhysicianCode;
        return this;
    }

    @JsonProperty("nm102_otherOperatingPhysicianNameQlfr")
    public String getNm102OtherOperatingPhysicianNameQlfr() {
        return nm102OtherOperatingPhysicianNameQlfr;
    }

    @JsonProperty("nm102_otherOperatingPhysicianNameQlfr")
    public void setNm102OtherOperatingPhysicianNameQlfr(String nm102OtherOperatingPhysicianNameQlfr) {
        this.nm102OtherOperatingPhysicianNameQlfr = nm102OtherOperatingPhysicianNameQlfr;
    }

    public OtherOperatingPhysicianName withNm102OtherOperatingPhysicianNameQlfr(String nm102OtherOperatingPhysicianNameQlfr) {
        this.nm102OtherOperatingPhysicianNameQlfr = nm102OtherOperatingPhysicianNameQlfr;
        return this;
    }

    @JsonProperty("nm103_otherOperatingPhysicianLastName")
    public String getNm103OtherOperatingPhysicianLastName() {
        return nm103OtherOperatingPhysicianLastName;
    }

    @JsonProperty("nm103_otherOperatingPhysicianLastName")
    public void setNm103OtherOperatingPhysicianLastName(String nm103OtherOperatingPhysicianLastName) {
        this.nm103OtherOperatingPhysicianLastName = nm103OtherOperatingPhysicianLastName;
    }

    public OtherOperatingPhysicianName withNm103OtherOperatingPhysicianLastName(String nm103OtherOperatingPhysicianLastName) {
        this.nm103OtherOperatingPhysicianLastName = nm103OtherOperatingPhysicianLastName;
        return this;
    }

    @JsonProperty("nm104_otherOperatingPhysicianFirstName")
    public String getNm104OtherOperatingPhysicianFirstName() {
        return nm104OtherOperatingPhysicianFirstName;
    }

    @JsonProperty("nm104_otherOperatingPhysicianFirstName")
    public void setNm104OtherOperatingPhysicianFirstName(String nm104OtherOperatingPhysicianFirstName) {
        this.nm104OtherOperatingPhysicianFirstName = nm104OtherOperatingPhysicianFirstName;
    }

    public OtherOperatingPhysicianName withNm104OtherOperatingPhysicianFirstName(String nm104OtherOperatingPhysicianFirstName) {
        this.nm104OtherOperatingPhysicianFirstName = nm104OtherOperatingPhysicianFirstName;
        return this;
    }

    @JsonProperty("nm105_otherOperatingPhysicianMiddleName")
    public String getNm105OtherOperatingPhysicianMiddleName() {
        return nm105OtherOperatingPhysicianMiddleName;
    }

    @JsonProperty("nm105_otherOperatingPhysicianMiddleName")
    public void setNm105OtherOperatingPhysicianMiddleName(String nm105OtherOperatingPhysicianMiddleName) {
        this.nm105OtherOperatingPhysicianMiddleName = nm105OtherOperatingPhysicianMiddleName;
    }

    public OtherOperatingPhysicianName withNm105OtherOperatingPhysicianMiddleName(String nm105OtherOperatingPhysicianMiddleName) {
        this.nm105OtherOperatingPhysicianMiddleName = nm105OtherOperatingPhysicianMiddleName;
        return this;
    }

    @JsonProperty("nm107_otherOperatingPhysicianSuffix")
    public String getNm107OtherOperatingPhysicianSuffix() {
        return nm107OtherOperatingPhysicianSuffix;
    }

    @JsonProperty("nm107_otherOperatingPhysicianSuffix")
    public void setNm107OtherOperatingPhysicianSuffix(String nm107OtherOperatingPhysicianSuffix) {
        this.nm107OtherOperatingPhysicianSuffix = nm107OtherOperatingPhysicianSuffix;
    }

    public OtherOperatingPhysicianName withNm107OtherOperatingPhysicianSuffix(String nm107OtherOperatingPhysicianSuffix) {
        this.nm107OtherOperatingPhysicianSuffix = nm107OtherOperatingPhysicianSuffix;
        return this;
    }

    @JsonProperty("nm108_otherOperatingPhysicianIdentificationCodeQlfr")
    public String getNm108OtherOperatingPhysicianIdentificationCodeQlfr() {
        return nm108OtherOperatingPhysicianIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_otherOperatingPhysicianIdentificationCodeQlfr")
    public void setNm108OtherOperatingPhysicianIdentificationCodeQlfr(String nm108OtherOperatingPhysicianIdentificationCodeQlfr) {
        this.nm108OtherOperatingPhysicianIdentificationCodeQlfr = nm108OtherOperatingPhysicianIdentificationCodeQlfr;
    }

    public OtherOperatingPhysicianName withNm108OtherOperatingPhysicianIdentificationCodeQlfr(String nm108OtherOperatingPhysicianIdentificationCodeQlfr) {
        this.nm108OtherOperatingPhysicianIdentificationCodeQlfr = nm108OtherOperatingPhysicianIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_otherOperatingPhysicianIdentifier")
    public String getNm109OtherOperatingPhysicianIdentifier() {
        return nm109OtherOperatingPhysicianIdentifier;
    }

    @JsonProperty("nm109_otherOperatingPhysicianIdentifier")
    public void setNm109OtherOperatingPhysicianIdentifier(String nm109OtherOperatingPhysicianIdentifier) {
        this.nm109OtherOperatingPhysicianIdentifier = nm109OtherOperatingPhysicianIdentifier;
    }

    public OtherOperatingPhysicianName withNm109OtherOperatingPhysicianIdentifier(String nm109OtherOperatingPhysicianIdentifier) {
        this.nm109OtherOperatingPhysicianIdentifier = nm109OtherOperatingPhysicianIdentifier;
        return this;
    }

    @JsonProperty("ref_otherOperatingPhysicianSecondaryIdentification")
    public List<RefOtherOperatingPhysicianSecondaryIdentification> getRefOtherOperatingPhysicianSecondaryIdentification() {
        return refOtherOperatingPhysicianSecondaryIdentification;
    }

    @JsonProperty("ref_otherOperatingPhysicianSecondaryIdentification")
    public void setRefOtherOperatingPhysicianSecondaryIdentification(List<RefOtherOperatingPhysicianSecondaryIdentification> refOtherOperatingPhysicianSecondaryIdentification) {
        this.refOtherOperatingPhysicianSecondaryIdentification = refOtherOperatingPhysicianSecondaryIdentification;
    }

    public OtherOperatingPhysicianName withRefOtherOperatingPhysicianSecondaryIdentification(List<RefOtherOperatingPhysicianSecondaryIdentification> refOtherOperatingPhysicianSecondaryIdentification) {
        this.refOtherOperatingPhysicianSecondaryIdentification = refOtherOperatingPhysicianSecondaryIdentification;
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

    public OtherOperatingPhysicianName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherOperatingPhysicianCode).append(nm102OtherOperatingPhysicianNameQlfr).append(nm103OtherOperatingPhysicianLastName).append(nm104OtherOperatingPhysicianFirstName).append(nm105OtherOperatingPhysicianMiddleName).append(nm107OtherOperatingPhysicianSuffix).append(nm108OtherOperatingPhysicianIdentificationCodeQlfr).append(nm109OtherOperatingPhysicianIdentifier).append(refOtherOperatingPhysicianSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherOperatingPhysicianName) == false) {
            return false;
        }
        OtherOperatingPhysicianName rhs = ((OtherOperatingPhysicianName) other);
        return new EqualsBuilder().append(nm101OtherOperatingPhysicianCode, rhs.nm101OtherOperatingPhysicianCode).append(nm102OtherOperatingPhysicianNameQlfr, rhs.nm102OtherOperatingPhysicianNameQlfr).append(nm103OtherOperatingPhysicianLastName, rhs.nm103OtherOperatingPhysicianLastName).append(nm104OtherOperatingPhysicianFirstName, rhs.nm104OtherOperatingPhysicianFirstName).append(nm105OtherOperatingPhysicianMiddleName, rhs.nm105OtherOperatingPhysicianMiddleName).append(nm107OtherOperatingPhysicianSuffix, rhs.nm107OtherOperatingPhysicianSuffix).append(nm108OtherOperatingPhysicianIdentificationCodeQlfr, rhs.nm108OtherOperatingPhysicianIdentificationCodeQlfr).append(nm109OtherOperatingPhysicianIdentifier, rhs.nm109OtherOperatingPhysicianIdentifier).append(refOtherOperatingPhysicianSecondaryIdentification, rhs.refOtherOperatingPhysicianSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

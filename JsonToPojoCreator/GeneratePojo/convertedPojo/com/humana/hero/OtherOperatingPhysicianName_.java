
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
    "nm101_otherOperatingPhysicianIdentifierCode",
    "nm102_otherOperatingPhysicianTypeQlfr",
    "nm103_otherOperatingPhysicianLastOrganizationName",
    "nm104_otherOperatingPhysicianFirstName",
    "nm105_otherOperatingPhysicianMiddleName",
    "nm107_otherOperatingPhysicianSuffix",
    "nm108_otherOperatingPhysicianIdentificationCodeQlfr",
    "nm109_otherOperatingPhysicianIdentifier",
    "ref_otherOperatingPhysicianSecondaryIdentification"
})
public class OtherOperatingPhysicianName_ {

    @JsonProperty("nm101_otherOperatingPhysicianIdentifierCode")
    private String nm101OtherOperatingPhysicianIdentifierCode;
    @JsonProperty("nm102_otherOperatingPhysicianTypeQlfr")
    private String nm102OtherOperatingPhysicianTypeQlfr;
    @JsonProperty("nm103_otherOperatingPhysicianLastOrganizationName")
    private String nm103OtherOperatingPhysicianLastOrganizationName;
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
    private List<RefOtherOperatingPhysicianSecondaryIdentification_> refOtherOperatingPhysicianSecondaryIdentification = new ArrayList<RefOtherOperatingPhysicianSecondaryIdentification_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherOperatingPhysicianIdentifierCode")
    public String getNm101OtherOperatingPhysicianIdentifierCode() {
        return nm101OtherOperatingPhysicianIdentifierCode;
    }

    @JsonProperty("nm101_otherOperatingPhysicianIdentifierCode")
    public void setNm101OtherOperatingPhysicianIdentifierCode(String nm101OtherOperatingPhysicianIdentifierCode) {
        this.nm101OtherOperatingPhysicianIdentifierCode = nm101OtherOperatingPhysicianIdentifierCode;
    }

    public OtherOperatingPhysicianName_ withNm101OtherOperatingPhysicianIdentifierCode(String nm101OtherOperatingPhysicianIdentifierCode) {
        this.nm101OtherOperatingPhysicianIdentifierCode = nm101OtherOperatingPhysicianIdentifierCode;
        return this;
    }

    @JsonProperty("nm102_otherOperatingPhysicianTypeQlfr")
    public String getNm102OtherOperatingPhysicianTypeQlfr() {
        return nm102OtherOperatingPhysicianTypeQlfr;
    }

    @JsonProperty("nm102_otherOperatingPhysicianTypeQlfr")
    public void setNm102OtherOperatingPhysicianTypeQlfr(String nm102OtherOperatingPhysicianTypeQlfr) {
        this.nm102OtherOperatingPhysicianTypeQlfr = nm102OtherOperatingPhysicianTypeQlfr;
    }

    public OtherOperatingPhysicianName_ withNm102OtherOperatingPhysicianTypeQlfr(String nm102OtherOperatingPhysicianTypeQlfr) {
        this.nm102OtherOperatingPhysicianTypeQlfr = nm102OtherOperatingPhysicianTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_otherOperatingPhysicianLastOrganizationName")
    public String getNm103OtherOperatingPhysicianLastOrganizationName() {
        return nm103OtherOperatingPhysicianLastOrganizationName;
    }

    @JsonProperty("nm103_otherOperatingPhysicianLastOrganizationName")
    public void setNm103OtherOperatingPhysicianLastOrganizationName(String nm103OtherOperatingPhysicianLastOrganizationName) {
        this.nm103OtherOperatingPhysicianLastOrganizationName = nm103OtherOperatingPhysicianLastOrganizationName;
    }

    public OtherOperatingPhysicianName_ withNm103OtherOperatingPhysicianLastOrganizationName(String nm103OtherOperatingPhysicianLastOrganizationName) {
        this.nm103OtherOperatingPhysicianLastOrganizationName = nm103OtherOperatingPhysicianLastOrganizationName;
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

    public OtherOperatingPhysicianName_ withNm104OtherOperatingPhysicianFirstName(String nm104OtherOperatingPhysicianFirstName) {
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

    public OtherOperatingPhysicianName_ withNm105OtherOperatingPhysicianMiddleName(String nm105OtherOperatingPhysicianMiddleName) {
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

    public OtherOperatingPhysicianName_ withNm107OtherOperatingPhysicianSuffix(String nm107OtherOperatingPhysicianSuffix) {
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

    public OtherOperatingPhysicianName_ withNm108OtherOperatingPhysicianIdentificationCodeQlfr(String nm108OtherOperatingPhysicianIdentificationCodeQlfr) {
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

    public OtherOperatingPhysicianName_ withNm109OtherOperatingPhysicianIdentifier(String nm109OtherOperatingPhysicianIdentifier) {
        this.nm109OtherOperatingPhysicianIdentifier = nm109OtherOperatingPhysicianIdentifier;
        return this;
    }

    @JsonProperty("ref_otherOperatingPhysicianSecondaryIdentification")
    public List<RefOtherOperatingPhysicianSecondaryIdentification_> getRefOtherOperatingPhysicianSecondaryIdentification() {
        return refOtherOperatingPhysicianSecondaryIdentification;
    }

    @JsonProperty("ref_otherOperatingPhysicianSecondaryIdentification")
    public void setRefOtherOperatingPhysicianSecondaryIdentification(List<RefOtherOperatingPhysicianSecondaryIdentification_> refOtherOperatingPhysicianSecondaryIdentification) {
        this.refOtherOperatingPhysicianSecondaryIdentification = refOtherOperatingPhysicianSecondaryIdentification;
    }

    public OtherOperatingPhysicianName_ withRefOtherOperatingPhysicianSecondaryIdentification(List<RefOtherOperatingPhysicianSecondaryIdentification_> refOtherOperatingPhysicianSecondaryIdentification) {
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

    public OtherOperatingPhysicianName_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherOperatingPhysicianIdentifierCode).append(nm102OtherOperatingPhysicianTypeQlfr).append(nm103OtherOperatingPhysicianLastOrganizationName).append(nm104OtherOperatingPhysicianFirstName).append(nm105OtherOperatingPhysicianMiddleName).append(nm107OtherOperatingPhysicianSuffix).append(nm108OtherOperatingPhysicianIdentificationCodeQlfr).append(nm109OtherOperatingPhysicianIdentifier).append(refOtherOperatingPhysicianSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherOperatingPhysicianName_) == false) {
            return false;
        }
        OtherOperatingPhysicianName_ rhs = ((OtherOperatingPhysicianName_) other);
        return new EqualsBuilder().append(nm101OtherOperatingPhysicianIdentifierCode, rhs.nm101OtherOperatingPhysicianIdentifierCode).append(nm102OtherOperatingPhysicianTypeQlfr, rhs.nm102OtherOperatingPhysicianTypeQlfr).append(nm103OtherOperatingPhysicianLastOrganizationName, rhs.nm103OtherOperatingPhysicianLastOrganizationName).append(nm104OtherOperatingPhysicianFirstName, rhs.nm104OtherOperatingPhysicianFirstName).append(nm105OtherOperatingPhysicianMiddleName, rhs.nm105OtherOperatingPhysicianMiddleName).append(nm107OtherOperatingPhysicianSuffix, rhs.nm107OtherOperatingPhysicianSuffix).append(nm108OtherOperatingPhysicianIdentificationCodeQlfr, rhs.nm108OtherOperatingPhysicianIdentificationCodeQlfr).append(nm109OtherOperatingPhysicianIdentifier, rhs.nm109OtherOperatingPhysicianIdentifier).append(refOtherOperatingPhysicianSecondaryIdentification, rhs.refOtherOperatingPhysicianSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "nm101_operatingPhysicianIdentifierCode",
    "nm102_operatingPhysicianTypeQlfr",
    "nm103_operatingPhysicianLastOrganizationName",
    "nm104_operatingPhysicianFirstName",
    "nm105_operatingPhysicianMiddleName",
    "nm107_operatingPhysicianSuffix",
    "nm108_operatingPhysicianIdentificationCodeQlfr",
    "nm109_operatingPhysicianIdentifier",
    "ref_operatingPhysicianSecondaryIdentification"
})
public class OperatingPhysicanName {

    @JsonProperty("nm101_operatingPhysicianIdentifierCode")
    private String nm101OperatingPhysicianIdentifierCode;
    @JsonProperty("nm102_operatingPhysicianTypeQlfr")
    private String nm102OperatingPhysicianTypeQlfr;
    @JsonProperty("nm103_operatingPhysicianLastOrganizationName")
    private String nm103OperatingPhysicianLastOrganizationName;
    @JsonProperty("nm104_operatingPhysicianFirstName")
    private String nm104OperatingPhysicianFirstName;
    @JsonProperty("nm105_operatingPhysicianMiddleName")
    private String nm105OperatingPhysicianMiddleName;
    @JsonProperty("nm107_operatingPhysicianSuffix")
    private String nm107OperatingPhysicianSuffix;
    @JsonProperty("nm108_operatingPhysicianIdentificationCodeQlfr")
    private String nm108OperatingPhysicianIdentificationCodeQlfr;
    @JsonProperty("nm109_operatingPhysicianIdentifier")
    private String nm109OperatingPhysicianIdentifier;
    @JsonProperty("ref_operatingPhysicianSecondaryIdentification")
    private List<RefOperatingPhysicianSecondaryIdentification_> refOperatingPhysicianSecondaryIdentification = new ArrayList<RefOperatingPhysicianSecondaryIdentification_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_operatingPhysicianIdentifierCode")
    public String getNm101OperatingPhysicianIdentifierCode() {
        return nm101OperatingPhysicianIdentifierCode;
    }

    @JsonProperty("nm101_operatingPhysicianIdentifierCode")
    public void setNm101OperatingPhysicianIdentifierCode(String nm101OperatingPhysicianIdentifierCode) {
        this.nm101OperatingPhysicianIdentifierCode = nm101OperatingPhysicianIdentifierCode;
    }

    public OperatingPhysicanName withNm101OperatingPhysicianIdentifierCode(String nm101OperatingPhysicianIdentifierCode) {
        this.nm101OperatingPhysicianIdentifierCode = nm101OperatingPhysicianIdentifierCode;
        return this;
    }

    @JsonProperty("nm102_operatingPhysicianTypeQlfr")
    public String getNm102OperatingPhysicianTypeQlfr() {
        return nm102OperatingPhysicianTypeQlfr;
    }

    @JsonProperty("nm102_operatingPhysicianTypeQlfr")
    public void setNm102OperatingPhysicianTypeQlfr(String nm102OperatingPhysicianTypeQlfr) {
        this.nm102OperatingPhysicianTypeQlfr = nm102OperatingPhysicianTypeQlfr;
    }

    public OperatingPhysicanName withNm102OperatingPhysicianTypeQlfr(String nm102OperatingPhysicianTypeQlfr) {
        this.nm102OperatingPhysicianTypeQlfr = nm102OperatingPhysicianTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_operatingPhysicianLastOrganizationName")
    public String getNm103OperatingPhysicianLastOrganizationName() {
        return nm103OperatingPhysicianLastOrganizationName;
    }

    @JsonProperty("nm103_operatingPhysicianLastOrganizationName")
    public void setNm103OperatingPhysicianLastOrganizationName(String nm103OperatingPhysicianLastOrganizationName) {
        this.nm103OperatingPhysicianLastOrganizationName = nm103OperatingPhysicianLastOrganizationName;
    }

    public OperatingPhysicanName withNm103OperatingPhysicianLastOrganizationName(String nm103OperatingPhysicianLastOrganizationName) {
        this.nm103OperatingPhysicianLastOrganizationName = nm103OperatingPhysicianLastOrganizationName;
        return this;
    }

    @JsonProperty("nm104_operatingPhysicianFirstName")
    public String getNm104OperatingPhysicianFirstName() {
        return nm104OperatingPhysicianFirstName;
    }

    @JsonProperty("nm104_operatingPhysicianFirstName")
    public void setNm104OperatingPhysicianFirstName(String nm104OperatingPhysicianFirstName) {
        this.nm104OperatingPhysicianFirstName = nm104OperatingPhysicianFirstName;
    }

    public OperatingPhysicanName withNm104OperatingPhysicianFirstName(String nm104OperatingPhysicianFirstName) {
        this.nm104OperatingPhysicianFirstName = nm104OperatingPhysicianFirstName;
        return this;
    }

    @JsonProperty("nm105_operatingPhysicianMiddleName")
    public String getNm105OperatingPhysicianMiddleName() {
        return nm105OperatingPhysicianMiddleName;
    }

    @JsonProperty("nm105_operatingPhysicianMiddleName")
    public void setNm105OperatingPhysicianMiddleName(String nm105OperatingPhysicianMiddleName) {
        this.nm105OperatingPhysicianMiddleName = nm105OperatingPhysicianMiddleName;
    }

    public OperatingPhysicanName withNm105OperatingPhysicianMiddleName(String nm105OperatingPhysicianMiddleName) {
        this.nm105OperatingPhysicianMiddleName = nm105OperatingPhysicianMiddleName;
        return this;
    }

    @JsonProperty("nm107_operatingPhysicianSuffix")
    public String getNm107OperatingPhysicianSuffix() {
        return nm107OperatingPhysicianSuffix;
    }

    @JsonProperty("nm107_operatingPhysicianSuffix")
    public void setNm107OperatingPhysicianSuffix(String nm107OperatingPhysicianSuffix) {
        this.nm107OperatingPhysicianSuffix = nm107OperatingPhysicianSuffix;
    }

    public OperatingPhysicanName withNm107OperatingPhysicianSuffix(String nm107OperatingPhysicianSuffix) {
        this.nm107OperatingPhysicianSuffix = nm107OperatingPhysicianSuffix;
        return this;
    }

    @JsonProperty("nm108_operatingPhysicianIdentificationCodeQlfr")
    public String getNm108OperatingPhysicianIdentificationCodeQlfr() {
        return nm108OperatingPhysicianIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_operatingPhysicianIdentificationCodeQlfr")
    public void setNm108OperatingPhysicianIdentificationCodeQlfr(String nm108OperatingPhysicianIdentificationCodeQlfr) {
        this.nm108OperatingPhysicianIdentificationCodeQlfr = nm108OperatingPhysicianIdentificationCodeQlfr;
    }

    public OperatingPhysicanName withNm108OperatingPhysicianIdentificationCodeQlfr(String nm108OperatingPhysicianIdentificationCodeQlfr) {
        this.nm108OperatingPhysicianIdentificationCodeQlfr = nm108OperatingPhysicianIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_operatingPhysicianIdentifier")
    public String getNm109OperatingPhysicianIdentifier() {
        return nm109OperatingPhysicianIdentifier;
    }

    @JsonProperty("nm109_operatingPhysicianIdentifier")
    public void setNm109OperatingPhysicianIdentifier(String nm109OperatingPhysicianIdentifier) {
        this.nm109OperatingPhysicianIdentifier = nm109OperatingPhysicianIdentifier;
    }

    public OperatingPhysicanName withNm109OperatingPhysicianIdentifier(String nm109OperatingPhysicianIdentifier) {
        this.nm109OperatingPhysicianIdentifier = nm109OperatingPhysicianIdentifier;
        return this;
    }

    @JsonProperty("ref_operatingPhysicianSecondaryIdentification")
    public List<RefOperatingPhysicianSecondaryIdentification_> getRefOperatingPhysicianSecondaryIdentification() {
        return refOperatingPhysicianSecondaryIdentification;
    }

    @JsonProperty("ref_operatingPhysicianSecondaryIdentification")
    public void setRefOperatingPhysicianSecondaryIdentification(List<RefOperatingPhysicianSecondaryIdentification_> refOperatingPhysicianSecondaryIdentification) {
        this.refOperatingPhysicianSecondaryIdentification = refOperatingPhysicianSecondaryIdentification;
    }

    public OperatingPhysicanName withRefOperatingPhysicianSecondaryIdentification(List<RefOperatingPhysicianSecondaryIdentification_> refOperatingPhysicianSecondaryIdentification) {
        this.refOperatingPhysicianSecondaryIdentification = refOperatingPhysicianSecondaryIdentification;
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

    public OperatingPhysicanName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OperatingPhysicianIdentifierCode).append(nm102OperatingPhysicianTypeQlfr).append(nm103OperatingPhysicianLastOrganizationName).append(nm104OperatingPhysicianFirstName).append(nm105OperatingPhysicianMiddleName).append(nm107OperatingPhysicianSuffix).append(nm108OperatingPhysicianIdentificationCodeQlfr).append(nm109OperatingPhysicianIdentifier).append(refOperatingPhysicianSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatingPhysicanName) == false) {
            return false;
        }
        OperatingPhysicanName rhs = ((OperatingPhysicanName) other);
        return new EqualsBuilder().append(nm101OperatingPhysicianIdentifierCode, rhs.nm101OperatingPhysicianIdentifierCode).append(nm102OperatingPhysicianTypeQlfr, rhs.nm102OperatingPhysicianTypeQlfr).append(nm103OperatingPhysicianLastOrganizationName, rhs.nm103OperatingPhysicianLastOrganizationName).append(nm104OperatingPhysicianFirstName, rhs.nm104OperatingPhysicianFirstName).append(nm105OperatingPhysicianMiddleName, rhs.nm105OperatingPhysicianMiddleName).append(nm107OperatingPhysicianSuffix, rhs.nm107OperatingPhysicianSuffix).append(nm108OperatingPhysicianIdentificationCodeQlfr, rhs.nm108OperatingPhysicianIdentificationCodeQlfr).append(nm109OperatingPhysicianIdentifier, rhs.nm109OperatingPhysicianIdentifier).append(refOperatingPhysicianSecondaryIdentification, rhs.refOperatingPhysicianSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

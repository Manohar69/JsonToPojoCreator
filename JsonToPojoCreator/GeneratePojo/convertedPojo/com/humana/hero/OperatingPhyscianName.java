
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
    "nm101_operatingPhysicianCode",
    "nm102_operatingPhysicianCodeQlfr",
    "nm103_operatingPhysicianLastName",
    "nm104_operatingPhysicianFirstName",
    "nm105_operatingPhysicianMiddleName",
    "nm107_operatingPhysicianNameSuffix",
    "nm108_operatingPhysicianIdentificationCodeQlfr",
    "nm109_operatingPhysicianIdentifier",
    "ref_operatingPhysicianSecondaryIdentification"
})
public class OperatingPhyscianName {

    @JsonProperty("nm101_operatingPhysicianCode")
    private String nm101OperatingPhysicianCode;
    @JsonProperty("nm102_operatingPhysicianCodeQlfr")
    private String nm102OperatingPhysicianCodeQlfr;
    @JsonProperty("nm103_operatingPhysicianLastName")
    private String nm103OperatingPhysicianLastName;
    @JsonProperty("nm104_operatingPhysicianFirstName")
    private String nm104OperatingPhysicianFirstName;
    @JsonProperty("nm105_operatingPhysicianMiddleName")
    private String nm105OperatingPhysicianMiddleName;
    @JsonProperty("nm107_operatingPhysicianNameSuffix")
    private String nm107OperatingPhysicianNameSuffix;
    @JsonProperty("nm108_operatingPhysicianIdentificationCodeQlfr")
    private String nm108OperatingPhysicianIdentificationCodeQlfr;
    @JsonProperty("nm109_operatingPhysicianIdentifier")
    private String nm109OperatingPhysicianIdentifier;
    @JsonProperty("ref_operatingPhysicianSecondaryIdentification")
    private List<RefOperatingPhysicianSecondaryIdentification> refOperatingPhysicianSecondaryIdentification = new ArrayList<RefOperatingPhysicianSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_operatingPhysicianCode")
    public String getNm101OperatingPhysicianCode() {
        return nm101OperatingPhysicianCode;
    }

    @JsonProperty("nm101_operatingPhysicianCode")
    public void setNm101OperatingPhysicianCode(String nm101OperatingPhysicianCode) {
        this.nm101OperatingPhysicianCode = nm101OperatingPhysicianCode;
    }

    public OperatingPhyscianName withNm101OperatingPhysicianCode(String nm101OperatingPhysicianCode) {
        this.nm101OperatingPhysicianCode = nm101OperatingPhysicianCode;
        return this;
    }

    @JsonProperty("nm102_operatingPhysicianCodeQlfr")
    public String getNm102OperatingPhysicianCodeQlfr() {
        return nm102OperatingPhysicianCodeQlfr;
    }

    @JsonProperty("nm102_operatingPhysicianCodeQlfr")
    public void setNm102OperatingPhysicianCodeQlfr(String nm102OperatingPhysicianCodeQlfr) {
        this.nm102OperatingPhysicianCodeQlfr = nm102OperatingPhysicianCodeQlfr;
    }

    public OperatingPhyscianName withNm102OperatingPhysicianCodeQlfr(String nm102OperatingPhysicianCodeQlfr) {
        this.nm102OperatingPhysicianCodeQlfr = nm102OperatingPhysicianCodeQlfr;
        return this;
    }

    @JsonProperty("nm103_operatingPhysicianLastName")
    public String getNm103OperatingPhysicianLastName() {
        return nm103OperatingPhysicianLastName;
    }

    @JsonProperty("nm103_operatingPhysicianLastName")
    public void setNm103OperatingPhysicianLastName(String nm103OperatingPhysicianLastName) {
        this.nm103OperatingPhysicianLastName = nm103OperatingPhysicianLastName;
    }

    public OperatingPhyscianName withNm103OperatingPhysicianLastName(String nm103OperatingPhysicianLastName) {
        this.nm103OperatingPhysicianLastName = nm103OperatingPhysicianLastName;
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

    public OperatingPhyscianName withNm104OperatingPhysicianFirstName(String nm104OperatingPhysicianFirstName) {
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

    public OperatingPhyscianName withNm105OperatingPhysicianMiddleName(String nm105OperatingPhysicianMiddleName) {
        this.nm105OperatingPhysicianMiddleName = nm105OperatingPhysicianMiddleName;
        return this;
    }

    @JsonProperty("nm107_operatingPhysicianNameSuffix")
    public String getNm107OperatingPhysicianNameSuffix() {
        return nm107OperatingPhysicianNameSuffix;
    }

    @JsonProperty("nm107_operatingPhysicianNameSuffix")
    public void setNm107OperatingPhysicianNameSuffix(String nm107OperatingPhysicianNameSuffix) {
        this.nm107OperatingPhysicianNameSuffix = nm107OperatingPhysicianNameSuffix;
    }

    public OperatingPhyscianName withNm107OperatingPhysicianNameSuffix(String nm107OperatingPhysicianNameSuffix) {
        this.nm107OperatingPhysicianNameSuffix = nm107OperatingPhysicianNameSuffix;
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

    public OperatingPhyscianName withNm108OperatingPhysicianIdentificationCodeQlfr(String nm108OperatingPhysicianIdentificationCodeQlfr) {
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

    public OperatingPhyscianName withNm109OperatingPhysicianIdentifier(String nm109OperatingPhysicianIdentifier) {
        this.nm109OperatingPhysicianIdentifier = nm109OperatingPhysicianIdentifier;
        return this;
    }

    @JsonProperty("ref_operatingPhysicianSecondaryIdentification")
    public List<RefOperatingPhysicianSecondaryIdentification> getRefOperatingPhysicianSecondaryIdentification() {
        return refOperatingPhysicianSecondaryIdentification;
    }

    @JsonProperty("ref_operatingPhysicianSecondaryIdentification")
    public void setRefOperatingPhysicianSecondaryIdentification(List<RefOperatingPhysicianSecondaryIdentification> refOperatingPhysicianSecondaryIdentification) {
        this.refOperatingPhysicianSecondaryIdentification = refOperatingPhysicianSecondaryIdentification;
    }

    public OperatingPhyscianName withRefOperatingPhysicianSecondaryIdentification(List<RefOperatingPhysicianSecondaryIdentification> refOperatingPhysicianSecondaryIdentification) {
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

    public OperatingPhyscianName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OperatingPhysicianCode).append(nm102OperatingPhysicianCodeQlfr).append(nm103OperatingPhysicianLastName).append(nm104OperatingPhysicianFirstName).append(nm105OperatingPhysicianMiddleName).append(nm107OperatingPhysicianNameSuffix).append(nm108OperatingPhysicianIdentificationCodeQlfr).append(nm109OperatingPhysicianIdentifier).append(refOperatingPhysicianSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatingPhyscianName) == false) {
            return false;
        }
        OperatingPhyscianName rhs = ((OperatingPhyscianName) other);
        return new EqualsBuilder().append(nm101OperatingPhysicianCode, rhs.nm101OperatingPhysicianCode).append(nm102OperatingPhysicianCodeQlfr, rhs.nm102OperatingPhysicianCodeQlfr).append(nm103OperatingPhysicianLastName, rhs.nm103OperatingPhysicianLastName).append(nm104OperatingPhysicianFirstName, rhs.nm104OperatingPhysicianFirstName).append(nm105OperatingPhysicianMiddleName, rhs.nm105OperatingPhysicianMiddleName).append(nm107OperatingPhysicianNameSuffix, rhs.nm107OperatingPhysicianNameSuffix).append(nm108OperatingPhysicianIdentificationCodeQlfr, rhs.nm108OperatingPhysicianIdentificationCodeQlfr).append(nm109OperatingPhysicianIdentifier, rhs.nm109OperatingPhysicianIdentifier).append(refOperatingPhysicianSecondaryIdentification, rhs.refOperatingPhysicianSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

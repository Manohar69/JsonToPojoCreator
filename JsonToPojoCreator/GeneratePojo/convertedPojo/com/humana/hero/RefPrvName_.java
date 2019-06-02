
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
    "nm101_referringProviderEntityIdentifierCode",
    "nm102_referringProviderTypeQlfr",
    "nm103_referringProviderLastName",
    "nm104_referringProviderFirstName",
    "nm105_referringProviderMiddleName",
    "nm107_referringProviderSuffix",
    "nm108_referringProviderIdentificationCodeQlfr",
    "nm109_referringProviderIdentificationCode",
    "ref_referringProviderSecondaryIdentification"
})
public class RefPrvName_ {

    @JsonProperty("nm101_referringProviderEntityIdentifierCode")
    private String nm101ReferringProviderEntityIdentifierCode;
    @JsonProperty("nm102_referringProviderTypeQlfr")
    private String nm102ReferringProviderTypeQlfr;
    @JsonProperty("nm103_referringProviderLastName")
    private String nm103ReferringProviderLastName;
    @JsonProperty("nm104_referringProviderFirstName")
    private String nm104ReferringProviderFirstName;
    @JsonProperty("nm105_referringProviderMiddleName")
    private String nm105ReferringProviderMiddleName;
    @JsonProperty("nm107_referringProviderSuffix")
    private String nm107ReferringProviderSuffix;
    @JsonProperty("nm108_referringProviderIdentificationCodeQlfr")
    private String nm108ReferringProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_referringProviderIdentificationCode")
    private String nm109ReferringProviderIdentificationCode;
    @JsonProperty("ref_referringProviderSecondaryIdentification")
    private List<RefReferringProviderSecondaryIdentification> refReferringProviderSecondaryIdentification = new ArrayList<RefReferringProviderSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_referringProviderEntityIdentifierCode")
    public String getNm101ReferringProviderEntityIdentifierCode() {
        return nm101ReferringProviderEntityIdentifierCode;
    }

    @JsonProperty("nm101_referringProviderEntityIdentifierCode")
    public void setNm101ReferringProviderEntityIdentifierCode(String nm101ReferringProviderEntityIdentifierCode) {
        this.nm101ReferringProviderEntityIdentifierCode = nm101ReferringProviderEntityIdentifierCode;
    }

    public RefPrvName_ withNm101ReferringProviderEntityIdentifierCode(String nm101ReferringProviderEntityIdentifierCode) {
        this.nm101ReferringProviderEntityIdentifierCode = nm101ReferringProviderEntityIdentifierCode;
        return this;
    }

    @JsonProperty("nm102_referringProviderTypeQlfr")
    public String getNm102ReferringProviderTypeQlfr() {
        return nm102ReferringProviderTypeQlfr;
    }

    @JsonProperty("nm102_referringProviderTypeQlfr")
    public void setNm102ReferringProviderTypeQlfr(String nm102ReferringProviderTypeQlfr) {
        this.nm102ReferringProviderTypeQlfr = nm102ReferringProviderTypeQlfr;
    }

    public RefPrvName_ withNm102ReferringProviderTypeQlfr(String nm102ReferringProviderTypeQlfr) {
        this.nm102ReferringProviderTypeQlfr = nm102ReferringProviderTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_referringProviderLastName")
    public String getNm103ReferringProviderLastName() {
        return nm103ReferringProviderLastName;
    }

    @JsonProperty("nm103_referringProviderLastName")
    public void setNm103ReferringProviderLastName(String nm103ReferringProviderLastName) {
        this.nm103ReferringProviderLastName = nm103ReferringProviderLastName;
    }

    public RefPrvName_ withNm103ReferringProviderLastName(String nm103ReferringProviderLastName) {
        this.nm103ReferringProviderLastName = nm103ReferringProviderLastName;
        return this;
    }

    @JsonProperty("nm104_referringProviderFirstName")
    public String getNm104ReferringProviderFirstName() {
        return nm104ReferringProviderFirstName;
    }

    @JsonProperty("nm104_referringProviderFirstName")
    public void setNm104ReferringProviderFirstName(String nm104ReferringProviderFirstName) {
        this.nm104ReferringProviderFirstName = nm104ReferringProviderFirstName;
    }

    public RefPrvName_ withNm104ReferringProviderFirstName(String nm104ReferringProviderFirstName) {
        this.nm104ReferringProviderFirstName = nm104ReferringProviderFirstName;
        return this;
    }

    @JsonProperty("nm105_referringProviderMiddleName")
    public String getNm105ReferringProviderMiddleName() {
        return nm105ReferringProviderMiddleName;
    }

    @JsonProperty("nm105_referringProviderMiddleName")
    public void setNm105ReferringProviderMiddleName(String nm105ReferringProviderMiddleName) {
        this.nm105ReferringProviderMiddleName = nm105ReferringProviderMiddleName;
    }

    public RefPrvName_ withNm105ReferringProviderMiddleName(String nm105ReferringProviderMiddleName) {
        this.nm105ReferringProviderMiddleName = nm105ReferringProviderMiddleName;
        return this;
    }

    @JsonProperty("nm107_referringProviderSuffix")
    public String getNm107ReferringProviderSuffix() {
        return nm107ReferringProviderSuffix;
    }

    @JsonProperty("nm107_referringProviderSuffix")
    public void setNm107ReferringProviderSuffix(String nm107ReferringProviderSuffix) {
        this.nm107ReferringProviderSuffix = nm107ReferringProviderSuffix;
    }

    public RefPrvName_ withNm107ReferringProviderSuffix(String nm107ReferringProviderSuffix) {
        this.nm107ReferringProviderSuffix = nm107ReferringProviderSuffix;
        return this;
    }

    @JsonProperty("nm108_referringProviderIdentificationCodeQlfr")
    public String getNm108ReferringProviderIdentificationCodeQlfr() {
        return nm108ReferringProviderIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_referringProviderIdentificationCodeQlfr")
    public void setNm108ReferringProviderIdentificationCodeQlfr(String nm108ReferringProviderIdentificationCodeQlfr) {
        this.nm108ReferringProviderIdentificationCodeQlfr = nm108ReferringProviderIdentificationCodeQlfr;
    }

    public RefPrvName_ withNm108ReferringProviderIdentificationCodeQlfr(String nm108ReferringProviderIdentificationCodeQlfr) {
        this.nm108ReferringProviderIdentificationCodeQlfr = nm108ReferringProviderIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_referringProviderIdentificationCode")
    public String getNm109ReferringProviderIdentificationCode() {
        return nm109ReferringProviderIdentificationCode;
    }

    @JsonProperty("nm109_referringProviderIdentificationCode")
    public void setNm109ReferringProviderIdentificationCode(String nm109ReferringProviderIdentificationCode) {
        this.nm109ReferringProviderIdentificationCode = nm109ReferringProviderIdentificationCode;
    }

    public RefPrvName_ withNm109ReferringProviderIdentificationCode(String nm109ReferringProviderIdentificationCode) {
        this.nm109ReferringProviderIdentificationCode = nm109ReferringProviderIdentificationCode;
        return this;
    }

    @JsonProperty("ref_referringProviderSecondaryIdentification")
    public List<RefReferringProviderSecondaryIdentification> getRefReferringProviderSecondaryIdentification() {
        return refReferringProviderSecondaryIdentification;
    }

    @JsonProperty("ref_referringProviderSecondaryIdentification")
    public void setRefReferringProviderSecondaryIdentification(List<RefReferringProviderSecondaryIdentification> refReferringProviderSecondaryIdentification) {
        this.refReferringProviderSecondaryIdentification = refReferringProviderSecondaryIdentification;
    }

    public RefPrvName_ withRefReferringProviderSecondaryIdentification(List<RefReferringProviderSecondaryIdentification> refReferringProviderSecondaryIdentification) {
        this.refReferringProviderSecondaryIdentification = refReferringProviderSecondaryIdentification;
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

    public RefPrvName_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101ReferringProviderEntityIdentifierCode).append(nm102ReferringProviderTypeQlfr).append(nm103ReferringProviderLastName).append(nm104ReferringProviderFirstName).append(nm105ReferringProviderMiddleName).append(nm107ReferringProviderSuffix).append(nm108ReferringProviderIdentificationCodeQlfr).append(nm109ReferringProviderIdentificationCode).append(refReferringProviderSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefPrvName_) == false) {
            return false;
        }
        RefPrvName_ rhs = ((RefPrvName_) other);
        return new EqualsBuilder().append(nm101ReferringProviderEntityIdentifierCode, rhs.nm101ReferringProviderEntityIdentifierCode).append(nm102ReferringProviderTypeQlfr, rhs.nm102ReferringProviderTypeQlfr).append(nm103ReferringProviderLastName, rhs.nm103ReferringProviderLastName).append(nm104ReferringProviderFirstName, rhs.nm104ReferringProviderFirstName).append(nm105ReferringProviderMiddleName, rhs.nm105ReferringProviderMiddleName).append(nm107ReferringProviderSuffix, rhs.nm107ReferringProviderSuffix).append(nm108ReferringProviderIdentificationCodeQlfr, rhs.nm108ReferringProviderIdentificationCodeQlfr).append(nm109ReferringProviderIdentificationCode, rhs.nm109ReferringProviderIdentificationCode).append(refReferringProviderSecondaryIdentification, rhs.refReferringProviderSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

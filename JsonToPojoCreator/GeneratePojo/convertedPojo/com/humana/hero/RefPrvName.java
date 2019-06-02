
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
    "nm101_referringProviderCode",
    "nm102_referringProviderCodeQlfr",
    "nm103_referringProviderLastName",
    "nm104_referringProviderFirstName",
    "nm105_referringProviderMiddleName",
    "nm107_referringProviderNameSuffix",
    "nm108_referringProviderIdentificationCodeQlfr",
    "nm109_referringProviderIdentifier",
    "prv01_referringProviderSpecialityInfo",
    "prv02_referringProviderSpecialityTaxonomyCodeQlfr",
    "prv03_referringProviderSpecialityTaxonomyCode",
    "ref_ReferringProviderName"
})
public class RefPrvName {

    @JsonProperty("nm101_referringProviderCode")
    private String nm101ReferringProviderCode;
    @JsonProperty("nm102_referringProviderCodeQlfr")
    private String nm102ReferringProviderCodeQlfr;
    @JsonProperty("nm103_referringProviderLastName")
    private String nm103ReferringProviderLastName;
    @JsonProperty("nm104_referringProviderFirstName")
    private String nm104ReferringProviderFirstName;
    @JsonProperty("nm105_referringProviderMiddleName")
    private String nm105ReferringProviderMiddleName;
    @JsonProperty("nm107_referringProviderNameSuffix")
    private String nm107ReferringProviderNameSuffix;
    @JsonProperty("nm108_referringProviderIdentificationCodeQlfr")
    private String nm108ReferringProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_referringProviderIdentifier")
    private String nm109ReferringProviderIdentifier;
    @JsonProperty("prv01_referringProviderSpecialityInfo")
    private String prv01ReferringProviderSpecialityInfo;
    @JsonProperty("prv02_referringProviderSpecialityTaxonomyCodeQlfr")
    private String prv02ReferringProviderSpecialityTaxonomyCodeQlfr;
    @JsonProperty("prv03_referringProviderSpecialityTaxonomyCode")
    private String prv03ReferringProviderSpecialityTaxonomyCode;
    @JsonProperty("ref_ReferringProviderName")
    private List<RefReferringProviderName> refReferringProviderName = new ArrayList<RefReferringProviderName>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_referringProviderCode")
    public String getNm101ReferringProviderCode() {
        return nm101ReferringProviderCode;
    }

    @JsonProperty("nm101_referringProviderCode")
    public void setNm101ReferringProviderCode(String nm101ReferringProviderCode) {
        this.nm101ReferringProviderCode = nm101ReferringProviderCode;
    }

    public RefPrvName withNm101ReferringProviderCode(String nm101ReferringProviderCode) {
        this.nm101ReferringProviderCode = nm101ReferringProviderCode;
        return this;
    }

    @JsonProperty("nm102_referringProviderCodeQlfr")
    public String getNm102ReferringProviderCodeQlfr() {
        return nm102ReferringProviderCodeQlfr;
    }

    @JsonProperty("nm102_referringProviderCodeQlfr")
    public void setNm102ReferringProviderCodeQlfr(String nm102ReferringProviderCodeQlfr) {
        this.nm102ReferringProviderCodeQlfr = nm102ReferringProviderCodeQlfr;
    }

    public RefPrvName withNm102ReferringProviderCodeQlfr(String nm102ReferringProviderCodeQlfr) {
        this.nm102ReferringProviderCodeQlfr = nm102ReferringProviderCodeQlfr;
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

    public RefPrvName withNm103ReferringProviderLastName(String nm103ReferringProviderLastName) {
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

    public RefPrvName withNm104ReferringProviderFirstName(String nm104ReferringProviderFirstName) {
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

    public RefPrvName withNm105ReferringProviderMiddleName(String nm105ReferringProviderMiddleName) {
        this.nm105ReferringProviderMiddleName = nm105ReferringProviderMiddleName;
        return this;
    }

    @JsonProperty("nm107_referringProviderNameSuffix")
    public String getNm107ReferringProviderNameSuffix() {
        return nm107ReferringProviderNameSuffix;
    }

    @JsonProperty("nm107_referringProviderNameSuffix")
    public void setNm107ReferringProviderNameSuffix(String nm107ReferringProviderNameSuffix) {
        this.nm107ReferringProviderNameSuffix = nm107ReferringProviderNameSuffix;
    }

    public RefPrvName withNm107ReferringProviderNameSuffix(String nm107ReferringProviderNameSuffix) {
        this.nm107ReferringProviderNameSuffix = nm107ReferringProviderNameSuffix;
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

    public RefPrvName withNm108ReferringProviderIdentificationCodeQlfr(String nm108ReferringProviderIdentificationCodeQlfr) {
        this.nm108ReferringProviderIdentificationCodeQlfr = nm108ReferringProviderIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_referringProviderIdentifier")
    public String getNm109ReferringProviderIdentifier() {
        return nm109ReferringProviderIdentifier;
    }

    @JsonProperty("nm109_referringProviderIdentifier")
    public void setNm109ReferringProviderIdentifier(String nm109ReferringProviderIdentifier) {
        this.nm109ReferringProviderIdentifier = nm109ReferringProviderIdentifier;
    }

    public RefPrvName withNm109ReferringProviderIdentifier(String nm109ReferringProviderIdentifier) {
        this.nm109ReferringProviderIdentifier = nm109ReferringProviderIdentifier;
        return this;
    }

    @JsonProperty("prv01_referringProviderSpecialityInfo")
    public String getPrv01ReferringProviderSpecialityInfo() {
        return prv01ReferringProviderSpecialityInfo;
    }

    @JsonProperty("prv01_referringProviderSpecialityInfo")
    public void setPrv01ReferringProviderSpecialityInfo(String prv01ReferringProviderSpecialityInfo) {
        this.prv01ReferringProviderSpecialityInfo = prv01ReferringProviderSpecialityInfo;
    }

    public RefPrvName withPrv01ReferringProviderSpecialityInfo(String prv01ReferringProviderSpecialityInfo) {
        this.prv01ReferringProviderSpecialityInfo = prv01ReferringProviderSpecialityInfo;
        return this;
    }

    @JsonProperty("prv02_referringProviderSpecialityTaxonomyCodeQlfr")
    public String getPrv02ReferringProviderSpecialityTaxonomyCodeQlfr() {
        return prv02ReferringProviderSpecialityTaxonomyCodeQlfr;
    }

    @JsonProperty("prv02_referringProviderSpecialityTaxonomyCodeQlfr")
    public void setPrv02ReferringProviderSpecialityTaxonomyCodeQlfr(String prv02ReferringProviderSpecialityTaxonomyCodeQlfr) {
        this.prv02ReferringProviderSpecialityTaxonomyCodeQlfr = prv02ReferringProviderSpecialityTaxonomyCodeQlfr;
    }

    public RefPrvName withPrv02ReferringProviderSpecialityTaxonomyCodeQlfr(String prv02ReferringProviderSpecialityTaxonomyCodeQlfr) {
        this.prv02ReferringProviderSpecialityTaxonomyCodeQlfr = prv02ReferringProviderSpecialityTaxonomyCodeQlfr;
        return this;
    }

    @JsonProperty("prv03_referringProviderSpecialityTaxonomyCode")
    public String getPrv03ReferringProviderSpecialityTaxonomyCode() {
        return prv03ReferringProviderSpecialityTaxonomyCode;
    }

    @JsonProperty("prv03_referringProviderSpecialityTaxonomyCode")
    public void setPrv03ReferringProviderSpecialityTaxonomyCode(String prv03ReferringProviderSpecialityTaxonomyCode) {
        this.prv03ReferringProviderSpecialityTaxonomyCode = prv03ReferringProviderSpecialityTaxonomyCode;
    }

    public RefPrvName withPrv03ReferringProviderSpecialityTaxonomyCode(String prv03ReferringProviderSpecialityTaxonomyCode) {
        this.prv03ReferringProviderSpecialityTaxonomyCode = prv03ReferringProviderSpecialityTaxonomyCode;
        return this;
    }

    @JsonProperty("ref_ReferringProviderName")
    public List<RefReferringProviderName> getRefReferringProviderName() {
        return refReferringProviderName;
    }

    @JsonProperty("ref_ReferringProviderName")
    public void setRefReferringProviderName(List<RefReferringProviderName> refReferringProviderName) {
        this.refReferringProviderName = refReferringProviderName;
    }

    public RefPrvName withRefReferringProviderName(List<RefReferringProviderName> refReferringProviderName) {
        this.refReferringProviderName = refReferringProviderName;
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

    public RefPrvName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101ReferringProviderCode).append(nm102ReferringProviderCodeQlfr).append(nm103ReferringProviderLastName).append(nm104ReferringProviderFirstName).append(nm105ReferringProviderMiddleName).append(nm107ReferringProviderNameSuffix).append(nm108ReferringProviderIdentificationCodeQlfr).append(nm109ReferringProviderIdentifier).append(prv01ReferringProviderSpecialityInfo).append(prv02ReferringProviderSpecialityTaxonomyCodeQlfr).append(prv03ReferringProviderSpecialityTaxonomyCode).append(refReferringProviderName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefPrvName) == false) {
            return false;
        }
        RefPrvName rhs = ((RefPrvName) other);
        return new EqualsBuilder().append(nm101ReferringProviderCode, rhs.nm101ReferringProviderCode).append(nm102ReferringProviderCodeQlfr, rhs.nm102ReferringProviderCodeQlfr).append(nm103ReferringProviderLastName, rhs.nm103ReferringProviderLastName).append(nm104ReferringProviderFirstName, rhs.nm104ReferringProviderFirstName).append(nm105ReferringProviderMiddleName, rhs.nm105ReferringProviderMiddleName).append(nm107ReferringProviderNameSuffix, rhs.nm107ReferringProviderNameSuffix).append(nm108ReferringProviderIdentificationCodeQlfr, rhs.nm108ReferringProviderIdentificationCodeQlfr).append(nm109ReferringProviderIdentifier, rhs.nm109ReferringProviderIdentifier).append(prv01ReferringProviderSpecialityInfo, rhs.prv01ReferringProviderSpecialityInfo).append(prv02ReferringProviderSpecialityTaxonomyCodeQlfr, rhs.prv02ReferringProviderSpecialityTaxonomyCodeQlfr).append(prv03ReferringProviderSpecialityTaxonomyCode, rhs.prv03ReferringProviderSpecialityTaxonomyCode).append(refReferringProviderName, rhs.refReferringProviderName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "nm101_billingProviderName",
    "nm102_billingProviderTypeQlfr",
    "nm103_billingProviderLastOrOrganizationName",
    "nm104_billingProviderFirstName",
    "nm105_billingProviderMiddleName",
    "nm107_billingProviderNameSuffix",
    "nm108_billingProviderIdentificationCodeQlfr",
    "nm109_billingProviderIdentificatinoCode",
    "n301_billingProviderAddressLine1",
    "n302_billingProviderAddressLine2",
    "n401_billingProviderCity",
    "n402_billingProviderStateCode",
    "n403_billingProviderZipCode",
    "n404_billingProviderCountryCode",
    "n407_billingProviderCountrySubdivisionCode",
    "ref01_billingProviderTaxIdentificationNoQlfr",
    "ref02_billingProviderTaxIdentificationNo",
    "ref_billingProviderUpin",
    "per_billingProviderContactInfo"
})
public class BillingPrvName {

    @JsonProperty("nm101_billingProviderName")
    private String nm101BillingProviderName;
    @JsonProperty("nm102_billingProviderTypeQlfr")
    private String nm102BillingProviderTypeQlfr;
    @JsonProperty("nm103_billingProviderLastOrOrganizationName")
    private String nm103BillingProviderLastOrOrganizationName;
    @JsonProperty("nm104_billingProviderFirstName")
    private String nm104BillingProviderFirstName;
    @JsonProperty("nm105_billingProviderMiddleName")
    private String nm105BillingProviderMiddleName;
    @JsonProperty("nm107_billingProviderNameSuffix")
    private String nm107BillingProviderNameSuffix;
    @JsonProperty("nm108_billingProviderIdentificationCodeQlfr")
    private String nm108BillingProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_billingProviderIdentificatinoCode")
    private String nm109BillingProviderIdentificatinoCode;
    @JsonProperty("n301_billingProviderAddressLine1")
    private String n301BillingProviderAddressLine1;
    @JsonProperty("n302_billingProviderAddressLine2")
    private String n302BillingProviderAddressLine2;
    @JsonProperty("n401_billingProviderCity")
    private String n401BillingProviderCity;
    @JsonProperty("n402_billingProviderStateCode")
    private String n402BillingProviderStateCode;
    @JsonProperty("n403_billingProviderZipCode")
    private String n403BillingProviderZipCode;
    @JsonProperty("n404_billingProviderCountryCode")
    private String n404BillingProviderCountryCode;
    @JsonProperty("n407_billingProviderCountrySubdivisionCode")
    private String n407BillingProviderCountrySubdivisionCode;
    @JsonProperty("ref01_billingProviderTaxIdentificationNoQlfr")
    private String ref01BillingProviderTaxIdentificationNoQlfr;
    @JsonProperty("ref02_billingProviderTaxIdentificationNo")
    private String ref02BillingProviderTaxIdentificationNo;
    @JsonProperty("ref_billingProviderUpin")
    private List<RefBillingProviderUpin> refBillingProviderUpin = new ArrayList<RefBillingProviderUpin>();
    @JsonProperty("per_billingProviderContactInfo")
    private List<PerBillingProviderContactInfo> perBillingProviderContactInfo = new ArrayList<PerBillingProviderContactInfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_billingProviderName")
    public String getNm101BillingProviderName() {
        return nm101BillingProviderName;
    }

    @JsonProperty("nm101_billingProviderName")
    public void setNm101BillingProviderName(String nm101BillingProviderName) {
        this.nm101BillingProviderName = nm101BillingProviderName;
    }

    public BillingPrvName withNm101BillingProviderName(String nm101BillingProviderName) {
        this.nm101BillingProviderName = nm101BillingProviderName;
        return this;
    }

    @JsonProperty("nm102_billingProviderTypeQlfr")
    public String getNm102BillingProviderTypeQlfr() {
        return nm102BillingProviderTypeQlfr;
    }

    @JsonProperty("nm102_billingProviderTypeQlfr")
    public void setNm102BillingProviderTypeQlfr(String nm102BillingProviderTypeQlfr) {
        this.nm102BillingProviderTypeQlfr = nm102BillingProviderTypeQlfr;
    }

    public BillingPrvName withNm102BillingProviderTypeQlfr(String nm102BillingProviderTypeQlfr) {
        this.nm102BillingProviderTypeQlfr = nm102BillingProviderTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_billingProviderLastOrOrganizationName")
    public String getNm103BillingProviderLastOrOrganizationName() {
        return nm103BillingProviderLastOrOrganizationName;
    }

    @JsonProperty("nm103_billingProviderLastOrOrganizationName")
    public void setNm103BillingProviderLastOrOrganizationName(String nm103BillingProviderLastOrOrganizationName) {
        this.nm103BillingProviderLastOrOrganizationName = nm103BillingProviderLastOrOrganizationName;
    }

    public BillingPrvName withNm103BillingProviderLastOrOrganizationName(String nm103BillingProviderLastOrOrganizationName) {
        this.nm103BillingProviderLastOrOrganizationName = nm103BillingProviderLastOrOrganizationName;
        return this;
    }

    @JsonProperty("nm104_billingProviderFirstName")
    public String getNm104BillingProviderFirstName() {
        return nm104BillingProviderFirstName;
    }

    @JsonProperty("nm104_billingProviderFirstName")
    public void setNm104BillingProviderFirstName(String nm104BillingProviderFirstName) {
        this.nm104BillingProviderFirstName = nm104BillingProviderFirstName;
    }

    public BillingPrvName withNm104BillingProviderFirstName(String nm104BillingProviderFirstName) {
        this.nm104BillingProviderFirstName = nm104BillingProviderFirstName;
        return this;
    }

    @JsonProperty("nm105_billingProviderMiddleName")
    public String getNm105BillingProviderMiddleName() {
        return nm105BillingProviderMiddleName;
    }

    @JsonProperty("nm105_billingProviderMiddleName")
    public void setNm105BillingProviderMiddleName(String nm105BillingProviderMiddleName) {
        this.nm105BillingProviderMiddleName = nm105BillingProviderMiddleName;
    }

    public BillingPrvName withNm105BillingProviderMiddleName(String nm105BillingProviderMiddleName) {
        this.nm105BillingProviderMiddleName = nm105BillingProviderMiddleName;
        return this;
    }

    @JsonProperty("nm107_billingProviderNameSuffix")
    public String getNm107BillingProviderNameSuffix() {
        return nm107BillingProviderNameSuffix;
    }

    @JsonProperty("nm107_billingProviderNameSuffix")
    public void setNm107BillingProviderNameSuffix(String nm107BillingProviderNameSuffix) {
        this.nm107BillingProviderNameSuffix = nm107BillingProviderNameSuffix;
    }

    public BillingPrvName withNm107BillingProviderNameSuffix(String nm107BillingProviderNameSuffix) {
        this.nm107BillingProviderNameSuffix = nm107BillingProviderNameSuffix;
        return this;
    }

    @JsonProperty("nm108_billingProviderIdentificationCodeQlfr")
    public String getNm108BillingProviderIdentificationCodeQlfr() {
        return nm108BillingProviderIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_billingProviderIdentificationCodeQlfr")
    public void setNm108BillingProviderIdentificationCodeQlfr(String nm108BillingProviderIdentificationCodeQlfr) {
        this.nm108BillingProviderIdentificationCodeQlfr = nm108BillingProviderIdentificationCodeQlfr;
    }

    public BillingPrvName withNm108BillingProviderIdentificationCodeQlfr(String nm108BillingProviderIdentificationCodeQlfr) {
        this.nm108BillingProviderIdentificationCodeQlfr = nm108BillingProviderIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_billingProviderIdentificatinoCode")
    public String getNm109BillingProviderIdentificatinoCode() {
        return nm109BillingProviderIdentificatinoCode;
    }

    @JsonProperty("nm109_billingProviderIdentificatinoCode")
    public void setNm109BillingProviderIdentificatinoCode(String nm109BillingProviderIdentificatinoCode) {
        this.nm109BillingProviderIdentificatinoCode = nm109BillingProviderIdentificatinoCode;
    }

    public BillingPrvName withNm109BillingProviderIdentificatinoCode(String nm109BillingProviderIdentificatinoCode) {
        this.nm109BillingProviderIdentificatinoCode = nm109BillingProviderIdentificatinoCode;
        return this;
    }

    @JsonProperty("n301_billingProviderAddressLine1")
    public String getN301BillingProviderAddressLine1() {
        return n301BillingProviderAddressLine1;
    }

    @JsonProperty("n301_billingProviderAddressLine1")
    public void setN301BillingProviderAddressLine1(String n301BillingProviderAddressLine1) {
        this.n301BillingProviderAddressLine1 = n301BillingProviderAddressLine1;
    }

    public BillingPrvName withN301BillingProviderAddressLine1(String n301BillingProviderAddressLine1) {
        this.n301BillingProviderAddressLine1 = n301BillingProviderAddressLine1;
        return this;
    }

    @JsonProperty("n302_billingProviderAddressLine2")
    public String getN302BillingProviderAddressLine2() {
        return n302BillingProviderAddressLine2;
    }

    @JsonProperty("n302_billingProviderAddressLine2")
    public void setN302BillingProviderAddressLine2(String n302BillingProviderAddressLine2) {
        this.n302BillingProviderAddressLine2 = n302BillingProviderAddressLine2;
    }

    public BillingPrvName withN302BillingProviderAddressLine2(String n302BillingProviderAddressLine2) {
        this.n302BillingProviderAddressLine2 = n302BillingProviderAddressLine2;
        return this;
    }

    @JsonProperty("n401_billingProviderCity")
    public String getN401BillingProviderCity() {
        return n401BillingProviderCity;
    }

    @JsonProperty("n401_billingProviderCity")
    public void setN401BillingProviderCity(String n401BillingProviderCity) {
        this.n401BillingProviderCity = n401BillingProviderCity;
    }

    public BillingPrvName withN401BillingProviderCity(String n401BillingProviderCity) {
        this.n401BillingProviderCity = n401BillingProviderCity;
        return this;
    }

    @JsonProperty("n402_billingProviderStateCode")
    public String getN402BillingProviderStateCode() {
        return n402BillingProviderStateCode;
    }

    @JsonProperty("n402_billingProviderStateCode")
    public void setN402BillingProviderStateCode(String n402BillingProviderStateCode) {
        this.n402BillingProviderStateCode = n402BillingProviderStateCode;
    }

    public BillingPrvName withN402BillingProviderStateCode(String n402BillingProviderStateCode) {
        this.n402BillingProviderStateCode = n402BillingProviderStateCode;
        return this;
    }

    @JsonProperty("n403_billingProviderZipCode")
    public String getN403BillingProviderZipCode() {
        return n403BillingProviderZipCode;
    }

    @JsonProperty("n403_billingProviderZipCode")
    public void setN403BillingProviderZipCode(String n403BillingProviderZipCode) {
        this.n403BillingProviderZipCode = n403BillingProviderZipCode;
    }

    public BillingPrvName withN403BillingProviderZipCode(String n403BillingProviderZipCode) {
        this.n403BillingProviderZipCode = n403BillingProviderZipCode;
        return this;
    }

    @JsonProperty("n404_billingProviderCountryCode")
    public String getN404BillingProviderCountryCode() {
        return n404BillingProviderCountryCode;
    }

    @JsonProperty("n404_billingProviderCountryCode")
    public void setN404BillingProviderCountryCode(String n404BillingProviderCountryCode) {
        this.n404BillingProviderCountryCode = n404BillingProviderCountryCode;
    }

    public BillingPrvName withN404BillingProviderCountryCode(String n404BillingProviderCountryCode) {
        this.n404BillingProviderCountryCode = n404BillingProviderCountryCode;
        return this;
    }

    @JsonProperty("n407_billingProviderCountrySubdivisionCode")
    public String getN407BillingProviderCountrySubdivisionCode() {
        return n407BillingProviderCountrySubdivisionCode;
    }

    @JsonProperty("n407_billingProviderCountrySubdivisionCode")
    public void setN407BillingProviderCountrySubdivisionCode(String n407BillingProviderCountrySubdivisionCode) {
        this.n407BillingProviderCountrySubdivisionCode = n407BillingProviderCountrySubdivisionCode;
    }

    public BillingPrvName withN407BillingProviderCountrySubdivisionCode(String n407BillingProviderCountrySubdivisionCode) {
        this.n407BillingProviderCountrySubdivisionCode = n407BillingProviderCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("ref01_billingProviderTaxIdentificationNoQlfr")
    public String getRef01BillingProviderTaxIdentificationNoQlfr() {
        return ref01BillingProviderTaxIdentificationNoQlfr;
    }

    @JsonProperty("ref01_billingProviderTaxIdentificationNoQlfr")
    public void setRef01BillingProviderTaxIdentificationNoQlfr(String ref01BillingProviderTaxIdentificationNoQlfr) {
        this.ref01BillingProviderTaxIdentificationNoQlfr = ref01BillingProviderTaxIdentificationNoQlfr;
    }

    public BillingPrvName withRef01BillingProviderTaxIdentificationNoQlfr(String ref01BillingProviderTaxIdentificationNoQlfr) {
        this.ref01BillingProviderTaxIdentificationNoQlfr = ref01BillingProviderTaxIdentificationNoQlfr;
        return this;
    }

    @JsonProperty("ref02_billingProviderTaxIdentificationNo")
    public String getRef02BillingProviderTaxIdentificationNo() {
        return ref02BillingProviderTaxIdentificationNo;
    }

    @JsonProperty("ref02_billingProviderTaxIdentificationNo")
    public void setRef02BillingProviderTaxIdentificationNo(String ref02BillingProviderTaxIdentificationNo) {
        this.ref02BillingProviderTaxIdentificationNo = ref02BillingProviderTaxIdentificationNo;
    }

    public BillingPrvName withRef02BillingProviderTaxIdentificationNo(String ref02BillingProviderTaxIdentificationNo) {
        this.ref02BillingProviderTaxIdentificationNo = ref02BillingProviderTaxIdentificationNo;
        return this;
    }

    @JsonProperty("ref_billingProviderUpin")
    public List<RefBillingProviderUpin> getRefBillingProviderUpin() {
        return refBillingProviderUpin;
    }

    @JsonProperty("ref_billingProviderUpin")
    public void setRefBillingProviderUpin(List<RefBillingProviderUpin> refBillingProviderUpin) {
        this.refBillingProviderUpin = refBillingProviderUpin;
    }

    public BillingPrvName withRefBillingProviderUpin(List<RefBillingProviderUpin> refBillingProviderUpin) {
        this.refBillingProviderUpin = refBillingProviderUpin;
        return this;
    }

    @JsonProperty("per_billingProviderContactInfo")
    public List<PerBillingProviderContactInfo> getPerBillingProviderContactInfo() {
        return perBillingProviderContactInfo;
    }

    @JsonProperty("per_billingProviderContactInfo")
    public void setPerBillingProviderContactInfo(List<PerBillingProviderContactInfo> perBillingProviderContactInfo) {
        this.perBillingProviderContactInfo = perBillingProviderContactInfo;
    }

    public BillingPrvName withPerBillingProviderContactInfo(List<PerBillingProviderContactInfo> perBillingProviderContactInfo) {
        this.perBillingProviderContactInfo = perBillingProviderContactInfo;
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

    public BillingPrvName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101BillingProviderName).append(nm102BillingProviderTypeQlfr).append(nm103BillingProviderLastOrOrganizationName).append(nm104BillingProviderFirstName).append(nm105BillingProviderMiddleName).append(nm107BillingProviderNameSuffix).append(nm108BillingProviderIdentificationCodeQlfr).append(nm109BillingProviderIdentificatinoCode).append(n301BillingProviderAddressLine1).append(n302BillingProviderAddressLine2).append(n401BillingProviderCity).append(n402BillingProviderStateCode).append(n403BillingProviderZipCode).append(n404BillingProviderCountryCode).append(n407BillingProviderCountrySubdivisionCode).append(ref01BillingProviderTaxIdentificationNoQlfr).append(ref02BillingProviderTaxIdentificationNo).append(refBillingProviderUpin).append(perBillingProviderContactInfo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingPrvName) == false) {
            return false;
        }
        BillingPrvName rhs = ((BillingPrvName) other);
        return new EqualsBuilder().append(nm101BillingProviderName, rhs.nm101BillingProviderName).append(nm102BillingProviderTypeQlfr, rhs.nm102BillingProviderTypeQlfr).append(nm103BillingProviderLastOrOrganizationName, rhs.nm103BillingProviderLastOrOrganizationName).append(nm104BillingProviderFirstName, rhs.nm104BillingProviderFirstName).append(nm105BillingProviderMiddleName, rhs.nm105BillingProviderMiddleName).append(nm107BillingProviderNameSuffix, rhs.nm107BillingProviderNameSuffix).append(nm108BillingProviderIdentificationCodeQlfr, rhs.nm108BillingProviderIdentificationCodeQlfr).append(nm109BillingProviderIdentificatinoCode, rhs.nm109BillingProviderIdentificatinoCode).append(n301BillingProviderAddressLine1, rhs.n301BillingProviderAddressLine1).append(n302BillingProviderAddressLine2, rhs.n302BillingProviderAddressLine2).append(n401BillingProviderCity, rhs.n401BillingProviderCity).append(n402BillingProviderStateCode, rhs.n402BillingProviderStateCode).append(n403BillingProviderZipCode, rhs.n403BillingProviderZipCode).append(n404BillingProviderCountryCode, rhs.n404BillingProviderCountryCode).append(n407BillingProviderCountrySubdivisionCode, rhs.n407BillingProviderCountrySubdivisionCode).append(ref01BillingProviderTaxIdentificationNoQlfr, rhs.ref01BillingProviderTaxIdentificationNoQlfr).append(ref02BillingProviderTaxIdentificationNo, rhs.ref02BillingProviderTaxIdentificationNo).append(refBillingProviderUpin, rhs.refBillingProviderUpin).append(perBillingProviderContactInfo, rhs.perBillingProviderContactInfo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

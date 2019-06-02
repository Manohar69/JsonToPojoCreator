
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
    "nm101_subscriberIdentificationCode",
    "nm102_subscriberTypeQlfr",
    "nm103_subscriberLastOrOrganizationName",
    "nm104_subscriberFirstName",
    "nm105_subscriberMiddleName",
    "nm107_subscriberSuffix",
    "nm108_subscriberIdentificationCodeQlfr",
    "nm109_subscriberIdentificationCode",
    "n301_subscriberAddressLine1",
    "n302_subscriberAddressLine2",
    "n401_subscriberCity",
    "n402_subscriberStateCode",
    "n403_subscriberZipCode",
    "n404_subscriberCountryCode",
    "n407_subscriberCountrySubdivisionCode",
    "dmg01_subscriberBirthDateQlfr",
    "dmg02_subscriberBirthDate",
    "dmg03_subscriberGenderCode",
    "ref01_subscriberSocialSecurityNoQlfr",
    "ref02_subscriberSocialSecurityNo",
    "ref01_propertyCasualtyClaimNoQlfr",
    "ref02_propertyCasualtyClaimNo",
    "per01_subscriberContactFunctionalCode",
    "per02_subscriberContactName",
    "per03_subscriberPhoneNoQlfr",
    "per04_subscriberPhoneNo",
    "per05_subscriberPhoneNoExtQlfr",
    "per06_subscriberPhoneNoExtNo"
})
public class SubscriberName {

    @JsonProperty("nm101_subscriberIdentificationCode")
    private String nm101SubscriberIdentificationCode;
    @JsonProperty("nm102_subscriberTypeQlfr")
    private String nm102SubscriberTypeQlfr;
    @JsonProperty("nm103_subscriberLastOrOrganizationName")
    private String nm103SubscriberLastOrOrganizationName;
    @JsonProperty("nm104_subscriberFirstName")
    private String nm104SubscriberFirstName;
    @JsonProperty("nm105_subscriberMiddleName")
    private String nm105SubscriberMiddleName;
    @JsonProperty("nm107_subscriberSuffix")
    private String nm107SubscriberSuffix;
    @JsonProperty("nm108_subscriberIdentificationCodeQlfr")
    private String nm108SubscriberIdentificationCodeQlfr;
    @JsonProperty("nm109_subscriberIdentificationCode")
    private String nm109SubscriberIdentificationCode;
    @JsonProperty("n301_subscriberAddressLine1")
    private String n301SubscriberAddressLine1;
    @JsonProperty("n302_subscriberAddressLine2")
    private String n302SubscriberAddressLine2;
    @JsonProperty("n401_subscriberCity")
    private String n401SubscriberCity;
    @JsonProperty("n402_subscriberStateCode")
    private String n402SubscriberStateCode;
    @JsonProperty("n403_subscriberZipCode")
    private String n403SubscriberZipCode;
    @JsonProperty("n404_subscriberCountryCode")
    private String n404SubscriberCountryCode;
    @JsonProperty("n407_subscriberCountrySubdivisionCode")
    private String n407SubscriberCountrySubdivisionCode;
    @JsonProperty("dmg01_subscriberBirthDateQlfr")
    private String dmg01SubscriberBirthDateQlfr;
    @JsonProperty("dmg02_subscriberBirthDate")
    private String dmg02SubscriberBirthDate;
    @JsonProperty("dmg03_subscriberGenderCode")
    private String dmg03SubscriberGenderCode;
    @JsonProperty("ref01_subscriberSocialSecurityNoQlfr")
    private String ref01SubscriberSocialSecurityNoQlfr;
    @JsonProperty("ref02_subscriberSocialSecurityNo")
    private String ref02SubscriberSocialSecurityNo;
    @JsonProperty("ref01_propertyCasualtyClaimNoQlfr")
    private String ref01PropertyCasualtyClaimNoQlfr;
    @JsonProperty("ref02_propertyCasualtyClaimNo")
    private String ref02PropertyCasualtyClaimNo;
    @JsonProperty("per01_subscriberContactFunctionalCode")
    private String per01SubscriberContactFunctionalCode;
    @JsonProperty("per02_subscriberContactName")
    private String per02SubscriberContactName;
    @JsonProperty("per03_subscriberPhoneNoQlfr")
    private String per03SubscriberPhoneNoQlfr;
    @JsonProperty("per04_subscriberPhoneNo")
    private String per04SubscriberPhoneNo;
    @JsonProperty("per05_subscriberPhoneNoExtQlfr")
    private String per05SubscriberPhoneNoExtQlfr;
    @JsonProperty("per06_subscriberPhoneNoExtNo")
    private String per06SubscriberPhoneNoExtNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_subscriberIdentificationCode")
    public String getNm101SubscriberIdentificationCode() {
        return nm101SubscriberIdentificationCode;
    }

    @JsonProperty("nm101_subscriberIdentificationCode")
    public void setNm101SubscriberIdentificationCode(String nm101SubscriberIdentificationCode) {
        this.nm101SubscriberIdentificationCode = nm101SubscriberIdentificationCode;
    }

    public SubscriberName withNm101SubscriberIdentificationCode(String nm101SubscriberIdentificationCode) {
        this.nm101SubscriberIdentificationCode = nm101SubscriberIdentificationCode;
        return this;
    }

    @JsonProperty("nm102_subscriberTypeQlfr")
    public String getNm102SubscriberTypeQlfr() {
        return nm102SubscriberTypeQlfr;
    }

    @JsonProperty("nm102_subscriberTypeQlfr")
    public void setNm102SubscriberTypeQlfr(String nm102SubscriberTypeQlfr) {
        this.nm102SubscriberTypeQlfr = nm102SubscriberTypeQlfr;
    }

    public SubscriberName withNm102SubscriberTypeQlfr(String nm102SubscriberTypeQlfr) {
        this.nm102SubscriberTypeQlfr = nm102SubscriberTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_subscriberLastOrOrganizationName")
    public String getNm103SubscriberLastOrOrganizationName() {
        return nm103SubscriberLastOrOrganizationName;
    }

    @JsonProperty("nm103_subscriberLastOrOrganizationName")
    public void setNm103SubscriberLastOrOrganizationName(String nm103SubscriberLastOrOrganizationName) {
        this.nm103SubscriberLastOrOrganizationName = nm103SubscriberLastOrOrganizationName;
    }

    public SubscriberName withNm103SubscriberLastOrOrganizationName(String nm103SubscriberLastOrOrganizationName) {
        this.nm103SubscriberLastOrOrganizationName = nm103SubscriberLastOrOrganizationName;
        return this;
    }

    @JsonProperty("nm104_subscriberFirstName")
    public String getNm104SubscriberFirstName() {
        return nm104SubscriberFirstName;
    }

    @JsonProperty("nm104_subscriberFirstName")
    public void setNm104SubscriberFirstName(String nm104SubscriberFirstName) {
        this.nm104SubscriberFirstName = nm104SubscriberFirstName;
    }

    public SubscriberName withNm104SubscriberFirstName(String nm104SubscriberFirstName) {
        this.nm104SubscriberFirstName = nm104SubscriberFirstName;
        return this;
    }

    @JsonProperty("nm105_subscriberMiddleName")
    public String getNm105SubscriberMiddleName() {
        return nm105SubscriberMiddleName;
    }

    @JsonProperty("nm105_subscriberMiddleName")
    public void setNm105SubscriberMiddleName(String nm105SubscriberMiddleName) {
        this.nm105SubscriberMiddleName = nm105SubscriberMiddleName;
    }

    public SubscriberName withNm105SubscriberMiddleName(String nm105SubscriberMiddleName) {
        this.nm105SubscriberMiddleName = nm105SubscriberMiddleName;
        return this;
    }

    @JsonProperty("nm107_subscriberSuffix")
    public String getNm107SubscriberSuffix() {
        return nm107SubscriberSuffix;
    }

    @JsonProperty("nm107_subscriberSuffix")
    public void setNm107SubscriberSuffix(String nm107SubscriberSuffix) {
        this.nm107SubscriberSuffix = nm107SubscriberSuffix;
    }

    public SubscriberName withNm107SubscriberSuffix(String nm107SubscriberSuffix) {
        this.nm107SubscriberSuffix = nm107SubscriberSuffix;
        return this;
    }

    @JsonProperty("nm108_subscriberIdentificationCodeQlfr")
    public String getNm108SubscriberIdentificationCodeQlfr() {
        return nm108SubscriberIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_subscriberIdentificationCodeQlfr")
    public void setNm108SubscriberIdentificationCodeQlfr(String nm108SubscriberIdentificationCodeQlfr) {
        this.nm108SubscriberIdentificationCodeQlfr = nm108SubscriberIdentificationCodeQlfr;
    }

    public SubscriberName withNm108SubscriberIdentificationCodeQlfr(String nm108SubscriberIdentificationCodeQlfr) {
        this.nm108SubscriberIdentificationCodeQlfr = nm108SubscriberIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_subscriberIdentificationCode")
    public String getNm109SubscriberIdentificationCode() {
        return nm109SubscriberIdentificationCode;
    }

    @JsonProperty("nm109_subscriberIdentificationCode")
    public void setNm109SubscriberIdentificationCode(String nm109SubscriberIdentificationCode) {
        this.nm109SubscriberIdentificationCode = nm109SubscriberIdentificationCode;
    }

    public SubscriberName withNm109SubscriberIdentificationCode(String nm109SubscriberIdentificationCode) {
        this.nm109SubscriberIdentificationCode = nm109SubscriberIdentificationCode;
        return this;
    }

    @JsonProperty("n301_subscriberAddressLine1")
    public String getN301SubscriberAddressLine1() {
        return n301SubscriberAddressLine1;
    }

    @JsonProperty("n301_subscriberAddressLine1")
    public void setN301SubscriberAddressLine1(String n301SubscriberAddressLine1) {
        this.n301SubscriberAddressLine1 = n301SubscriberAddressLine1;
    }

    public SubscriberName withN301SubscriberAddressLine1(String n301SubscriberAddressLine1) {
        this.n301SubscriberAddressLine1 = n301SubscriberAddressLine1;
        return this;
    }

    @JsonProperty("n302_subscriberAddressLine2")
    public String getN302SubscriberAddressLine2() {
        return n302SubscriberAddressLine2;
    }

    @JsonProperty("n302_subscriberAddressLine2")
    public void setN302SubscriberAddressLine2(String n302SubscriberAddressLine2) {
        this.n302SubscriberAddressLine2 = n302SubscriberAddressLine2;
    }

    public SubscriberName withN302SubscriberAddressLine2(String n302SubscriberAddressLine2) {
        this.n302SubscriberAddressLine2 = n302SubscriberAddressLine2;
        return this;
    }

    @JsonProperty("n401_subscriberCity")
    public String getN401SubscriberCity() {
        return n401SubscriberCity;
    }

    @JsonProperty("n401_subscriberCity")
    public void setN401SubscriberCity(String n401SubscriberCity) {
        this.n401SubscriberCity = n401SubscriberCity;
    }

    public SubscriberName withN401SubscriberCity(String n401SubscriberCity) {
        this.n401SubscriberCity = n401SubscriberCity;
        return this;
    }

    @JsonProperty("n402_subscriberStateCode")
    public String getN402SubscriberStateCode() {
        return n402SubscriberStateCode;
    }

    @JsonProperty("n402_subscriberStateCode")
    public void setN402SubscriberStateCode(String n402SubscriberStateCode) {
        this.n402SubscriberStateCode = n402SubscriberStateCode;
    }

    public SubscriberName withN402SubscriberStateCode(String n402SubscriberStateCode) {
        this.n402SubscriberStateCode = n402SubscriberStateCode;
        return this;
    }

    @JsonProperty("n403_subscriberZipCode")
    public String getN403SubscriberZipCode() {
        return n403SubscriberZipCode;
    }

    @JsonProperty("n403_subscriberZipCode")
    public void setN403SubscriberZipCode(String n403SubscriberZipCode) {
        this.n403SubscriberZipCode = n403SubscriberZipCode;
    }

    public SubscriberName withN403SubscriberZipCode(String n403SubscriberZipCode) {
        this.n403SubscriberZipCode = n403SubscriberZipCode;
        return this;
    }

    @JsonProperty("n404_subscriberCountryCode")
    public String getN404SubscriberCountryCode() {
        return n404SubscriberCountryCode;
    }

    @JsonProperty("n404_subscriberCountryCode")
    public void setN404SubscriberCountryCode(String n404SubscriberCountryCode) {
        this.n404SubscriberCountryCode = n404SubscriberCountryCode;
    }

    public SubscriberName withN404SubscriberCountryCode(String n404SubscriberCountryCode) {
        this.n404SubscriberCountryCode = n404SubscriberCountryCode;
        return this;
    }

    @JsonProperty("n407_subscriberCountrySubdivisionCode")
    public String getN407SubscriberCountrySubdivisionCode() {
        return n407SubscriberCountrySubdivisionCode;
    }

    @JsonProperty("n407_subscriberCountrySubdivisionCode")
    public void setN407SubscriberCountrySubdivisionCode(String n407SubscriberCountrySubdivisionCode) {
        this.n407SubscriberCountrySubdivisionCode = n407SubscriberCountrySubdivisionCode;
    }

    public SubscriberName withN407SubscriberCountrySubdivisionCode(String n407SubscriberCountrySubdivisionCode) {
        this.n407SubscriberCountrySubdivisionCode = n407SubscriberCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("dmg01_subscriberBirthDateQlfr")
    public String getDmg01SubscriberBirthDateQlfr() {
        return dmg01SubscriberBirthDateQlfr;
    }

    @JsonProperty("dmg01_subscriberBirthDateQlfr")
    public void setDmg01SubscriberBirthDateQlfr(String dmg01SubscriberBirthDateQlfr) {
        this.dmg01SubscriberBirthDateQlfr = dmg01SubscriberBirthDateQlfr;
    }

    public SubscriberName withDmg01SubscriberBirthDateQlfr(String dmg01SubscriberBirthDateQlfr) {
        this.dmg01SubscriberBirthDateQlfr = dmg01SubscriberBirthDateQlfr;
        return this;
    }

    @JsonProperty("dmg02_subscriberBirthDate")
    public String getDmg02SubscriberBirthDate() {
        return dmg02SubscriberBirthDate;
    }

    @JsonProperty("dmg02_subscriberBirthDate")
    public void setDmg02SubscriberBirthDate(String dmg02SubscriberBirthDate) {
        this.dmg02SubscriberBirthDate = dmg02SubscriberBirthDate;
    }

    public SubscriberName withDmg02SubscriberBirthDate(String dmg02SubscriberBirthDate) {
        this.dmg02SubscriberBirthDate = dmg02SubscriberBirthDate;
        return this;
    }

    @JsonProperty("dmg03_subscriberGenderCode")
    public String getDmg03SubscriberGenderCode() {
        return dmg03SubscriberGenderCode;
    }

    @JsonProperty("dmg03_subscriberGenderCode")
    public void setDmg03SubscriberGenderCode(String dmg03SubscriberGenderCode) {
        this.dmg03SubscriberGenderCode = dmg03SubscriberGenderCode;
    }

    public SubscriberName withDmg03SubscriberGenderCode(String dmg03SubscriberGenderCode) {
        this.dmg03SubscriberGenderCode = dmg03SubscriberGenderCode;
        return this;
    }

    @JsonProperty("ref01_subscriberSocialSecurityNoQlfr")
    public String getRef01SubscriberSocialSecurityNoQlfr() {
        return ref01SubscriberSocialSecurityNoQlfr;
    }

    @JsonProperty("ref01_subscriberSocialSecurityNoQlfr")
    public void setRef01SubscriberSocialSecurityNoQlfr(String ref01SubscriberSocialSecurityNoQlfr) {
        this.ref01SubscriberSocialSecurityNoQlfr = ref01SubscriberSocialSecurityNoQlfr;
    }

    public SubscriberName withRef01SubscriberSocialSecurityNoQlfr(String ref01SubscriberSocialSecurityNoQlfr) {
        this.ref01SubscriberSocialSecurityNoQlfr = ref01SubscriberSocialSecurityNoQlfr;
        return this;
    }

    @JsonProperty("ref02_subscriberSocialSecurityNo")
    public String getRef02SubscriberSocialSecurityNo() {
        return ref02SubscriberSocialSecurityNo;
    }

    @JsonProperty("ref02_subscriberSocialSecurityNo")
    public void setRef02SubscriberSocialSecurityNo(String ref02SubscriberSocialSecurityNo) {
        this.ref02SubscriberSocialSecurityNo = ref02SubscriberSocialSecurityNo;
    }

    public SubscriberName withRef02SubscriberSocialSecurityNo(String ref02SubscriberSocialSecurityNo) {
        this.ref02SubscriberSocialSecurityNo = ref02SubscriberSocialSecurityNo;
        return this;
    }

    @JsonProperty("ref01_propertyCasualtyClaimNoQlfr")
    public String getRef01PropertyCasualtyClaimNoQlfr() {
        return ref01PropertyCasualtyClaimNoQlfr;
    }

    @JsonProperty("ref01_propertyCasualtyClaimNoQlfr")
    public void setRef01PropertyCasualtyClaimNoQlfr(String ref01PropertyCasualtyClaimNoQlfr) {
        this.ref01PropertyCasualtyClaimNoQlfr = ref01PropertyCasualtyClaimNoQlfr;
    }

    public SubscriberName withRef01PropertyCasualtyClaimNoQlfr(String ref01PropertyCasualtyClaimNoQlfr) {
        this.ref01PropertyCasualtyClaimNoQlfr = ref01PropertyCasualtyClaimNoQlfr;
        return this;
    }

    @JsonProperty("ref02_propertyCasualtyClaimNo")
    public String getRef02PropertyCasualtyClaimNo() {
        return ref02PropertyCasualtyClaimNo;
    }

    @JsonProperty("ref02_propertyCasualtyClaimNo")
    public void setRef02PropertyCasualtyClaimNo(String ref02PropertyCasualtyClaimNo) {
        this.ref02PropertyCasualtyClaimNo = ref02PropertyCasualtyClaimNo;
    }

    public SubscriberName withRef02PropertyCasualtyClaimNo(String ref02PropertyCasualtyClaimNo) {
        this.ref02PropertyCasualtyClaimNo = ref02PropertyCasualtyClaimNo;
        return this;
    }

    @JsonProperty("per01_subscriberContactFunctionalCode")
    public String getPer01SubscriberContactFunctionalCode() {
        return per01SubscriberContactFunctionalCode;
    }

    @JsonProperty("per01_subscriberContactFunctionalCode")
    public void setPer01SubscriberContactFunctionalCode(String per01SubscriberContactFunctionalCode) {
        this.per01SubscriberContactFunctionalCode = per01SubscriberContactFunctionalCode;
    }

    public SubscriberName withPer01SubscriberContactFunctionalCode(String per01SubscriberContactFunctionalCode) {
        this.per01SubscriberContactFunctionalCode = per01SubscriberContactFunctionalCode;
        return this;
    }

    @JsonProperty("per02_subscriberContactName")
    public String getPer02SubscriberContactName() {
        return per02SubscriberContactName;
    }

    @JsonProperty("per02_subscriberContactName")
    public void setPer02SubscriberContactName(String per02SubscriberContactName) {
        this.per02SubscriberContactName = per02SubscriberContactName;
    }

    public SubscriberName withPer02SubscriberContactName(String per02SubscriberContactName) {
        this.per02SubscriberContactName = per02SubscriberContactName;
        return this;
    }

    @JsonProperty("per03_subscriberPhoneNoQlfr")
    public String getPer03SubscriberPhoneNoQlfr() {
        return per03SubscriberPhoneNoQlfr;
    }

    @JsonProperty("per03_subscriberPhoneNoQlfr")
    public void setPer03SubscriberPhoneNoQlfr(String per03SubscriberPhoneNoQlfr) {
        this.per03SubscriberPhoneNoQlfr = per03SubscriberPhoneNoQlfr;
    }

    public SubscriberName withPer03SubscriberPhoneNoQlfr(String per03SubscriberPhoneNoQlfr) {
        this.per03SubscriberPhoneNoQlfr = per03SubscriberPhoneNoQlfr;
        return this;
    }

    @JsonProperty("per04_subscriberPhoneNo")
    public String getPer04SubscriberPhoneNo() {
        return per04SubscriberPhoneNo;
    }

    @JsonProperty("per04_subscriberPhoneNo")
    public void setPer04SubscriberPhoneNo(String per04SubscriberPhoneNo) {
        this.per04SubscriberPhoneNo = per04SubscriberPhoneNo;
    }

    public SubscriberName withPer04SubscriberPhoneNo(String per04SubscriberPhoneNo) {
        this.per04SubscriberPhoneNo = per04SubscriberPhoneNo;
        return this;
    }

    @JsonProperty("per05_subscriberPhoneNoExtQlfr")
    public String getPer05SubscriberPhoneNoExtQlfr() {
        return per05SubscriberPhoneNoExtQlfr;
    }

    @JsonProperty("per05_subscriberPhoneNoExtQlfr")
    public void setPer05SubscriberPhoneNoExtQlfr(String per05SubscriberPhoneNoExtQlfr) {
        this.per05SubscriberPhoneNoExtQlfr = per05SubscriberPhoneNoExtQlfr;
    }

    public SubscriberName withPer05SubscriberPhoneNoExtQlfr(String per05SubscriberPhoneNoExtQlfr) {
        this.per05SubscriberPhoneNoExtQlfr = per05SubscriberPhoneNoExtQlfr;
        return this;
    }

    @JsonProperty("per06_subscriberPhoneNoExtNo")
    public String getPer06SubscriberPhoneNoExtNo() {
        return per06SubscriberPhoneNoExtNo;
    }

    @JsonProperty("per06_subscriberPhoneNoExtNo")
    public void setPer06SubscriberPhoneNoExtNo(String per06SubscriberPhoneNoExtNo) {
        this.per06SubscriberPhoneNoExtNo = per06SubscriberPhoneNoExtNo;
    }

    public SubscriberName withPer06SubscriberPhoneNoExtNo(String per06SubscriberPhoneNoExtNo) {
        this.per06SubscriberPhoneNoExtNo = per06SubscriberPhoneNoExtNo;
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

    public SubscriberName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101SubscriberIdentificationCode).append(nm102SubscriberTypeQlfr).append(nm103SubscriberLastOrOrganizationName).append(nm104SubscriberFirstName).append(nm105SubscriberMiddleName).append(nm107SubscriberSuffix).append(nm108SubscriberIdentificationCodeQlfr).append(nm109SubscriberIdentificationCode).append(n301SubscriberAddressLine1).append(n302SubscriberAddressLine2).append(n401SubscriberCity).append(n402SubscriberStateCode).append(n403SubscriberZipCode).append(n404SubscriberCountryCode).append(n407SubscriberCountrySubdivisionCode).append(dmg01SubscriberBirthDateQlfr).append(dmg02SubscriberBirthDate).append(dmg03SubscriberGenderCode).append(ref01SubscriberSocialSecurityNoQlfr).append(ref02SubscriberSocialSecurityNo).append(ref01PropertyCasualtyClaimNoQlfr).append(ref02PropertyCasualtyClaimNo).append(per01SubscriberContactFunctionalCode).append(per02SubscriberContactName).append(per03SubscriberPhoneNoQlfr).append(per04SubscriberPhoneNo).append(per05SubscriberPhoneNoExtQlfr).append(per06SubscriberPhoneNoExtNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriberName) == false) {
            return false;
        }
        SubscriberName rhs = ((SubscriberName) other);
        return new EqualsBuilder().append(nm101SubscriberIdentificationCode, rhs.nm101SubscriberIdentificationCode).append(nm102SubscriberTypeQlfr, rhs.nm102SubscriberTypeQlfr).append(nm103SubscriberLastOrOrganizationName, rhs.nm103SubscriberLastOrOrganizationName).append(nm104SubscriberFirstName, rhs.nm104SubscriberFirstName).append(nm105SubscriberMiddleName, rhs.nm105SubscriberMiddleName).append(nm107SubscriberSuffix, rhs.nm107SubscriberSuffix).append(nm108SubscriberIdentificationCodeQlfr, rhs.nm108SubscriberIdentificationCodeQlfr).append(nm109SubscriberIdentificationCode, rhs.nm109SubscriberIdentificationCode).append(n301SubscriberAddressLine1, rhs.n301SubscriberAddressLine1).append(n302SubscriberAddressLine2, rhs.n302SubscriberAddressLine2).append(n401SubscriberCity, rhs.n401SubscriberCity).append(n402SubscriberStateCode, rhs.n402SubscriberStateCode).append(n403SubscriberZipCode, rhs.n403SubscriberZipCode).append(n404SubscriberCountryCode, rhs.n404SubscriberCountryCode).append(n407SubscriberCountrySubdivisionCode, rhs.n407SubscriberCountrySubdivisionCode).append(dmg01SubscriberBirthDateQlfr, rhs.dmg01SubscriberBirthDateQlfr).append(dmg02SubscriberBirthDate, rhs.dmg02SubscriberBirthDate).append(dmg03SubscriberGenderCode, rhs.dmg03SubscriberGenderCode).append(ref01SubscriberSocialSecurityNoQlfr, rhs.ref01SubscriberSocialSecurityNoQlfr).append(ref02SubscriberSocialSecurityNo, rhs.ref02SubscriberSocialSecurityNo).append(ref01PropertyCasualtyClaimNoQlfr, rhs.ref01PropertyCasualtyClaimNoQlfr).append(ref02PropertyCasualtyClaimNo, rhs.ref02PropertyCasualtyClaimNo).append(per01SubscriberContactFunctionalCode, rhs.per01SubscriberContactFunctionalCode).append(per02SubscriberContactName, rhs.per02SubscriberContactName).append(per03SubscriberPhoneNoQlfr, rhs.per03SubscriberPhoneNoQlfr).append(per04SubscriberPhoneNo, rhs.per04SubscriberPhoneNo).append(per05SubscriberPhoneNoExtQlfr, rhs.per05SubscriberPhoneNoExtQlfr).append(per06SubscriberPhoneNoExtNo, rhs.per06SubscriberPhoneNoExtNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

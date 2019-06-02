
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
    "nm101_patientIdentifierCode",
    "nm102_patientTypeQlfr",
    "nm103_patientLastOrOrganizationName",
    "nm104_patientFirstName",
    "nm105_patientMiddleName",
    "nm107_patientSuffix",
    "n301_patientAddressLine1",
    "n302_patientAddressLine2",
    "n401_patientCity",
    "n402_patientStateCode",
    "n403_patientZipCode",
    "n404_patientCountryCode",
    "n407_patientCountrySubdivisionCode",
    "dmg01_patientBirthDateQlfr",
    "dmg02_patientBirthDate",
    "dmg03_patientGenderCode",
    "ref01_propertyCasualtyClaimNoQlfr",
    "ref02_propertyCasualtyClaimNo",
    "ref01_propertyCasualtyPatientIdentificationQlfr",
    "ref02_propertyCasualtyPatientIdentification",
    "per01_patientInfoContact",
    "per02_patientContactName",
    "per03_patientPhoneNoQlfr",
    "per04_patientPhoneNo",
    "per05_patientPhoneExtNoQlfr",
    "per06_patientPhoneExtNo"
})
public class PatientName {

    @JsonProperty("nm101_patientIdentifierCode")
    private String nm101PatientIdentifierCode;
    @JsonProperty("nm102_patientTypeQlfr")
    private String nm102PatientTypeQlfr;
    @JsonProperty("nm103_patientLastOrOrganizationName")
    private String nm103PatientLastOrOrganizationName;
    @JsonProperty("nm104_patientFirstName")
    private String nm104PatientFirstName;
    @JsonProperty("nm105_patientMiddleName")
    private String nm105PatientMiddleName;
    @JsonProperty("nm107_patientSuffix")
    private String nm107PatientSuffix;
    @JsonProperty("n301_patientAddressLine1")
    private String n301PatientAddressLine1;
    @JsonProperty("n302_patientAddressLine2")
    private String n302PatientAddressLine2;
    @JsonProperty("n401_patientCity")
    private String n401PatientCity;
    @JsonProperty("n402_patientStateCode")
    private String n402PatientStateCode;
    @JsonProperty("n403_patientZipCode")
    private String n403PatientZipCode;
    @JsonProperty("n404_patientCountryCode")
    private String n404PatientCountryCode;
    @JsonProperty("n407_patientCountrySubdivisionCode")
    private String n407PatientCountrySubdivisionCode;
    @JsonProperty("dmg01_patientBirthDateQlfr")
    private String dmg01PatientBirthDateQlfr;
    @JsonProperty("dmg02_patientBirthDate")
    private String dmg02PatientBirthDate;
    @JsonProperty("dmg03_patientGenderCode")
    private String dmg03PatientGenderCode;
    @JsonProperty("ref01_propertyCasualtyClaimNoQlfr")
    private String ref01PropertyCasualtyClaimNoQlfr;
    @JsonProperty("ref02_propertyCasualtyClaimNo")
    private String ref02PropertyCasualtyClaimNo;
    @JsonProperty("ref01_propertyCasualtyPatientIdentificationQlfr")
    private String ref01PropertyCasualtyPatientIdentificationQlfr;
    @JsonProperty("ref02_propertyCasualtyPatientIdentification")
    private String ref02PropertyCasualtyPatientIdentification;
    @JsonProperty("per01_patientInfoContact")
    private String per01PatientInfoContact;
    @JsonProperty("per02_patientContactName")
    private String per02PatientContactName;
    @JsonProperty("per03_patientPhoneNoQlfr")
    private String per03PatientPhoneNoQlfr;
    @JsonProperty("per04_patientPhoneNo")
    private String per04PatientPhoneNo;
    @JsonProperty("per05_patientPhoneExtNoQlfr")
    private String per05PatientPhoneExtNoQlfr;
    @JsonProperty("per06_patientPhoneExtNo")
    private String per06PatientPhoneExtNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_patientIdentifierCode")
    public String getNm101PatientIdentifierCode() {
        return nm101PatientIdentifierCode;
    }

    @JsonProperty("nm101_patientIdentifierCode")
    public void setNm101PatientIdentifierCode(String nm101PatientIdentifierCode) {
        this.nm101PatientIdentifierCode = nm101PatientIdentifierCode;
    }

    public PatientName withNm101PatientIdentifierCode(String nm101PatientIdentifierCode) {
        this.nm101PatientIdentifierCode = nm101PatientIdentifierCode;
        return this;
    }

    @JsonProperty("nm102_patientTypeQlfr")
    public String getNm102PatientTypeQlfr() {
        return nm102PatientTypeQlfr;
    }

    @JsonProperty("nm102_patientTypeQlfr")
    public void setNm102PatientTypeQlfr(String nm102PatientTypeQlfr) {
        this.nm102PatientTypeQlfr = nm102PatientTypeQlfr;
    }

    public PatientName withNm102PatientTypeQlfr(String nm102PatientTypeQlfr) {
        this.nm102PatientTypeQlfr = nm102PatientTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_patientLastOrOrganizationName")
    public String getNm103PatientLastOrOrganizationName() {
        return nm103PatientLastOrOrganizationName;
    }

    @JsonProperty("nm103_patientLastOrOrganizationName")
    public void setNm103PatientLastOrOrganizationName(String nm103PatientLastOrOrganizationName) {
        this.nm103PatientLastOrOrganizationName = nm103PatientLastOrOrganizationName;
    }

    public PatientName withNm103PatientLastOrOrganizationName(String nm103PatientLastOrOrganizationName) {
        this.nm103PatientLastOrOrganizationName = nm103PatientLastOrOrganizationName;
        return this;
    }

    @JsonProperty("nm104_patientFirstName")
    public String getNm104PatientFirstName() {
        return nm104PatientFirstName;
    }

    @JsonProperty("nm104_patientFirstName")
    public void setNm104PatientFirstName(String nm104PatientFirstName) {
        this.nm104PatientFirstName = nm104PatientFirstName;
    }

    public PatientName withNm104PatientFirstName(String nm104PatientFirstName) {
        this.nm104PatientFirstName = nm104PatientFirstName;
        return this;
    }

    @JsonProperty("nm105_patientMiddleName")
    public String getNm105PatientMiddleName() {
        return nm105PatientMiddleName;
    }

    @JsonProperty("nm105_patientMiddleName")
    public void setNm105PatientMiddleName(String nm105PatientMiddleName) {
        this.nm105PatientMiddleName = nm105PatientMiddleName;
    }

    public PatientName withNm105PatientMiddleName(String nm105PatientMiddleName) {
        this.nm105PatientMiddleName = nm105PatientMiddleName;
        return this;
    }

    @JsonProperty("nm107_patientSuffix")
    public String getNm107PatientSuffix() {
        return nm107PatientSuffix;
    }

    @JsonProperty("nm107_patientSuffix")
    public void setNm107PatientSuffix(String nm107PatientSuffix) {
        this.nm107PatientSuffix = nm107PatientSuffix;
    }

    public PatientName withNm107PatientSuffix(String nm107PatientSuffix) {
        this.nm107PatientSuffix = nm107PatientSuffix;
        return this;
    }

    @JsonProperty("n301_patientAddressLine1")
    public String getN301PatientAddressLine1() {
        return n301PatientAddressLine1;
    }

    @JsonProperty("n301_patientAddressLine1")
    public void setN301PatientAddressLine1(String n301PatientAddressLine1) {
        this.n301PatientAddressLine1 = n301PatientAddressLine1;
    }

    public PatientName withN301PatientAddressLine1(String n301PatientAddressLine1) {
        this.n301PatientAddressLine1 = n301PatientAddressLine1;
        return this;
    }

    @JsonProperty("n302_patientAddressLine2")
    public String getN302PatientAddressLine2() {
        return n302PatientAddressLine2;
    }

    @JsonProperty("n302_patientAddressLine2")
    public void setN302PatientAddressLine2(String n302PatientAddressLine2) {
        this.n302PatientAddressLine2 = n302PatientAddressLine2;
    }

    public PatientName withN302PatientAddressLine2(String n302PatientAddressLine2) {
        this.n302PatientAddressLine2 = n302PatientAddressLine2;
        return this;
    }

    @JsonProperty("n401_patientCity")
    public String getN401PatientCity() {
        return n401PatientCity;
    }

    @JsonProperty("n401_patientCity")
    public void setN401PatientCity(String n401PatientCity) {
        this.n401PatientCity = n401PatientCity;
    }

    public PatientName withN401PatientCity(String n401PatientCity) {
        this.n401PatientCity = n401PatientCity;
        return this;
    }

    @JsonProperty("n402_patientStateCode")
    public String getN402PatientStateCode() {
        return n402PatientStateCode;
    }

    @JsonProperty("n402_patientStateCode")
    public void setN402PatientStateCode(String n402PatientStateCode) {
        this.n402PatientStateCode = n402PatientStateCode;
    }

    public PatientName withN402PatientStateCode(String n402PatientStateCode) {
        this.n402PatientStateCode = n402PatientStateCode;
        return this;
    }

    @JsonProperty("n403_patientZipCode")
    public String getN403PatientZipCode() {
        return n403PatientZipCode;
    }

    @JsonProperty("n403_patientZipCode")
    public void setN403PatientZipCode(String n403PatientZipCode) {
        this.n403PatientZipCode = n403PatientZipCode;
    }

    public PatientName withN403PatientZipCode(String n403PatientZipCode) {
        this.n403PatientZipCode = n403PatientZipCode;
        return this;
    }

    @JsonProperty("n404_patientCountryCode")
    public String getN404PatientCountryCode() {
        return n404PatientCountryCode;
    }

    @JsonProperty("n404_patientCountryCode")
    public void setN404PatientCountryCode(String n404PatientCountryCode) {
        this.n404PatientCountryCode = n404PatientCountryCode;
    }

    public PatientName withN404PatientCountryCode(String n404PatientCountryCode) {
        this.n404PatientCountryCode = n404PatientCountryCode;
        return this;
    }

    @JsonProperty("n407_patientCountrySubdivisionCode")
    public String getN407PatientCountrySubdivisionCode() {
        return n407PatientCountrySubdivisionCode;
    }

    @JsonProperty("n407_patientCountrySubdivisionCode")
    public void setN407PatientCountrySubdivisionCode(String n407PatientCountrySubdivisionCode) {
        this.n407PatientCountrySubdivisionCode = n407PatientCountrySubdivisionCode;
    }

    public PatientName withN407PatientCountrySubdivisionCode(String n407PatientCountrySubdivisionCode) {
        this.n407PatientCountrySubdivisionCode = n407PatientCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("dmg01_patientBirthDateQlfr")
    public String getDmg01PatientBirthDateQlfr() {
        return dmg01PatientBirthDateQlfr;
    }

    @JsonProperty("dmg01_patientBirthDateQlfr")
    public void setDmg01PatientBirthDateQlfr(String dmg01PatientBirthDateQlfr) {
        this.dmg01PatientBirthDateQlfr = dmg01PatientBirthDateQlfr;
    }

    public PatientName withDmg01PatientBirthDateQlfr(String dmg01PatientBirthDateQlfr) {
        this.dmg01PatientBirthDateQlfr = dmg01PatientBirthDateQlfr;
        return this;
    }

    @JsonProperty("dmg02_patientBirthDate")
    public String getDmg02PatientBirthDate() {
        return dmg02PatientBirthDate;
    }

    @JsonProperty("dmg02_patientBirthDate")
    public void setDmg02PatientBirthDate(String dmg02PatientBirthDate) {
        this.dmg02PatientBirthDate = dmg02PatientBirthDate;
    }

    public PatientName withDmg02PatientBirthDate(String dmg02PatientBirthDate) {
        this.dmg02PatientBirthDate = dmg02PatientBirthDate;
        return this;
    }

    @JsonProperty("dmg03_patientGenderCode")
    public String getDmg03PatientGenderCode() {
        return dmg03PatientGenderCode;
    }

    @JsonProperty("dmg03_patientGenderCode")
    public void setDmg03PatientGenderCode(String dmg03PatientGenderCode) {
        this.dmg03PatientGenderCode = dmg03PatientGenderCode;
    }

    public PatientName withDmg03PatientGenderCode(String dmg03PatientGenderCode) {
        this.dmg03PatientGenderCode = dmg03PatientGenderCode;
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

    public PatientName withRef01PropertyCasualtyClaimNoQlfr(String ref01PropertyCasualtyClaimNoQlfr) {
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

    public PatientName withRef02PropertyCasualtyClaimNo(String ref02PropertyCasualtyClaimNo) {
        this.ref02PropertyCasualtyClaimNo = ref02PropertyCasualtyClaimNo;
        return this;
    }

    @JsonProperty("ref01_propertyCasualtyPatientIdentificationQlfr")
    public String getRef01PropertyCasualtyPatientIdentificationQlfr() {
        return ref01PropertyCasualtyPatientIdentificationQlfr;
    }

    @JsonProperty("ref01_propertyCasualtyPatientIdentificationQlfr")
    public void setRef01PropertyCasualtyPatientIdentificationQlfr(String ref01PropertyCasualtyPatientIdentificationQlfr) {
        this.ref01PropertyCasualtyPatientIdentificationQlfr = ref01PropertyCasualtyPatientIdentificationQlfr;
    }

    public PatientName withRef01PropertyCasualtyPatientIdentificationQlfr(String ref01PropertyCasualtyPatientIdentificationQlfr) {
        this.ref01PropertyCasualtyPatientIdentificationQlfr = ref01PropertyCasualtyPatientIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_propertyCasualtyPatientIdentification")
    public String getRef02PropertyCasualtyPatientIdentification() {
        return ref02PropertyCasualtyPatientIdentification;
    }

    @JsonProperty("ref02_propertyCasualtyPatientIdentification")
    public void setRef02PropertyCasualtyPatientIdentification(String ref02PropertyCasualtyPatientIdentification) {
        this.ref02PropertyCasualtyPatientIdentification = ref02PropertyCasualtyPatientIdentification;
    }

    public PatientName withRef02PropertyCasualtyPatientIdentification(String ref02PropertyCasualtyPatientIdentification) {
        this.ref02PropertyCasualtyPatientIdentification = ref02PropertyCasualtyPatientIdentification;
        return this;
    }

    @JsonProperty("per01_patientInfoContact")
    public String getPer01PatientInfoContact() {
        return per01PatientInfoContact;
    }

    @JsonProperty("per01_patientInfoContact")
    public void setPer01PatientInfoContact(String per01PatientInfoContact) {
        this.per01PatientInfoContact = per01PatientInfoContact;
    }

    public PatientName withPer01PatientInfoContact(String per01PatientInfoContact) {
        this.per01PatientInfoContact = per01PatientInfoContact;
        return this;
    }

    @JsonProperty("per02_patientContactName")
    public String getPer02PatientContactName() {
        return per02PatientContactName;
    }

    @JsonProperty("per02_patientContactName")
    public void setPer02PatientContactName(String per02PatientContactName) {
        this.per02PatientContactName = per02PatientContactName;
    }

    public PatientName withPer02PatientContactName(String per02PatientContactName) {
        this.per02PatientContactName = per02PatientContactName;
        return this;
    }

    @JsonProperty("per03_patientPhoneNoQlfr")
    public String getPer03PatientPhoneNoQlfr() {
        return per03PatientPhoneNoQlfr;
    }

    @JsonProperty("per03_patientPhoneNoQlfr")
    public void setPer03PatientPhoneNoQlfr(String per03PatientPhoneNoQlfr) {
        this.per03PatientPhoneNoQlfr = per03PatientPhoneNoQlfr;
    }

    public PatientName withPer03PatientPhoneNoQlfr(String per03PatientPhoneNoQlfr) {
        this.per03PatientPhoneNoQlfr = per03PatientPhoneNoQlfr;
        return this;
    }

    @JsonProperty("per04_patientPhoneNo")
    public String getPer04PatientPhoneNo() {
        return per04PatientPhoneNo;
    }

    @JsonProperty("per04_patientPhoneNo")
    public void setPer04PatientPhoneNo(String per04PatientPhoneNo) {
        this.per04PatientPhoneNo = per04PatientPhoneNo;
    }

    public PatientName withPer04PatientPhoneNo(String per04PatientPhoneNo) {
        this.per04PatientPhoneNo = per04PatientPhoneNo;
        return this;
    }

    @JsonProperty("per05_patientPhoneExtNoQlfr")
    public String getPer05PatientPhoneExtNoQlfr() {
        return per05PatientPhoneExtNoQlfr;
    }

    @JsonProperty("per05_patientPhoneExtNoQlfr")
    public void setPer05PatientPhoneExtNoQlfr(String per05PatientPhoneExtNoQlfr) {
        this.per05PatientPhoneExtNoQlfr = per05PatientPhoneExtNoQlfr;
    }

    public PatientName withPer05PatientPhoneExtNoQlfr(String per05PatientPhoneExtNoQlfr) {
        this.per05PatientPhoneExtNoQlfr = per05PatientPhoneExtNoQlfr;
        return this;
    }

    @JsonProperty("per06_patientPhoneExtNo")
    public String getPer06PatientPhoneExtNo() {
        return per06PatientPhoneExtNo;
    }

    @JsonProperty("per06_patientPhoneExtNo")
    public void setPer06PatientPhoneExtNo(String per06PatientPhoneExtNo) {
        this.per06PatientPhoneExtNo = per06PatientPhoneExtNo;
    }

    public PatientName withPer06PatientPhoneExtNo(String per06PatientPhoneExtNo) {
        this.per06PatientPhoneExtNo = per06PatientPhoneExtNo;
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

    public PatientName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101PatientIdentifierCode).append(nm102PatientTypeQlfr).append(nm103PatientLastOrOrganizationName).append(nm104PatientFirstName).append(nm105PatientMiddleName).append(nm107PatientSuffix).append(n301PatientAddressLine1).append(n302PatientAddressLine2).append(n401PatientCity).append(n402PatientStateCode).append(n403PatientZipCode).append(n404PatientCountryCode).append(n407PatientCountrySubdivisionCode).append(dmg01PatientBirthDateQlfr).append(dmg02PatientBirthDate).append(dmg03PatientGenderCode).append(ref01PropertyCasualtyClaimNoQlfr).append(ref02PropertyCasualtyClaimNo).append(ref01PropertyCasualtyPatientIdentificationQlfr).append(ref02PropertyCasualtyPatientIdentification).append(per01PatientInfoContact).append(per02PatientContactName).append(per03PatientPhoneNoQlfr).append(per04PatientPhoneNo).append(per05PatientPhoneExtNoQlfr).append(per06PatientPhoneExtNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatientName) == false) {
            return false;
        }
        PatientName rhs = ((PatientName) other);
        return new EqualsBuilder().append(nm101PatientIdentifierCode, rhs.nm101PatientIdentifierCode).append(nm102PatientTypeQlfr, rhs.nm102PatientTypeQlfr).append(nm103PatientLastOrOrganizationName, rhs.nm103PatientLastOrOrganizationName).append(nm104PatientFirstName, rhs.nm104PatientFirstName).append(nm105PatientMiddleName, rhs.nm105PatientMiddleName).append(nm107PatientSuffix, rhs.nm107PatientSuffix).append(n301PatientAddressLine1, rhs.n301PatientAddressLine1).append(n302PatientAddressLine2, rhs.n302PatientAddressLine2).append(n401PatientCity, rhs.n401PatientCity).append(n402PatientStateCode, rhs.n402PatientStateCode).append(n403PatientZipCode, rhs.n403PatientZipCode).append(n404PatientCountryCode, rhs.n404PatientCountryCode).append(n407PatientCountrySubdivisionCode, rhs.n407PatientCountrySubdivisionCode).append(dmg01PatientBirthDateQlfr, rhs.dmg01PatientBirthDateQlfr).append(dmg02PatientBirthDate, rhs.dmg02PatientBirthDate).append(dmg03PatientGenderCode, rhs.dmg03PatientGenderCode).append(ref01PropertyCasualtyClaimNoQlfr, rhs.ref01PropertyCasualtyClaimNoQlfr).append(ref02PropertyCasualtyClaimNo, rhs.ref02PropertyCasualtyClaimNo).append(ref01PropertyCasualtyPatientIdentificationQlfr, rhs.ref01PropertyCasualtyPatientIdentificationQlfr).append(ref02PropertyCasualtyPatientIdentification, rhs.ref02PropertyCasualtyPatientIdentification).append(per01PatientInfoContact, rhs.per01PatientInfoContact).append(per02PatientContactName, rhs.per02PatientContactName).append(per03PatientPhoneNoQlfr, rhs.per03PatientPhoneNoQlfr).append(per04PatientPhoneNo, rhs.per04PatientPhoneNo).append(per05PatientPhoneExtNoQlfr, rhs.per05PatientPhoneExtNoQlfr).append(per06PatientPhoneExtNo, rhs.per06PatientPhoneExtNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "nm101_otherInsuredEntityTypeCode",
    "nm102_otherInsuredEntityTypeQlfr",
    "nm103_otherInsuredLastName",
    "nm104_otherInsuredFirstName",
    "nm105_otherInsuredMiddleName",
    "nm107_otherInsuredSuffix",
    "nm108_otherInsuredIdQlfr",
    "nm109_otherInsuredId",
    "n301_otherInsuredAddressLine1",
    "n302_otherInsuredAddressLine2",
    "n401_otherInsuredCity",
    "n402_otherInsuredStateCode",
    "n403_otherInsuredZipCode",
    "n404_otherInsuredCountryCode",
    "n407_otherInsuredCountrySubdivisionCode",
    "ref_otherInsuredSecondaryIdentifier"
})
public class OtherSubscriberName {

    @JsonProperty("nm101_otherInsuredEntityTypeCode")
    private String nm101OtherInsuredEntityTypeCode;
    @JsonProperty("nm102_otherInsuredEntityTypeQlfr")
    private String nm102OtherInsuredEntityTypeQlfr;
    @JsonProperty("nm103_otherInsuredLastName")
    private String nm103OtherInsuredLastName;
    @JsonProperty("nm104_otherInsuredFirstName")
    private String nm104OtherInsuredFirstName;
    @JsonProperty("nm105_otherInsuredMiddleName")
    private String nm105OtherInsuredMiddleName;
    @JsonProperty("nm107_otherInsuredSuffix")
    private String nm107OtherInsuredSuffix;
    @JsonProperty("nm108_otherInsuredIdQlfr")
    private String nm108OtherInsuredIdQlfr;
    @JsonProperty("nm109_otherInsuredId")
    private String nm109OtherInsuredId;
    @JsonProperty("n301_otherInsuredAddressLine1")
    private String n301OtherInsuredAddressLine1;
    @JsonProperty("n302_otherInsuredAddressLine2")
    private String n302OtherInsuredAddressLine2;
    @JsonProperty("n401_otherInsuredCity")
    private String n401OtherInsuredCity;
    @JsonProperty("n402_otherInsuredStateCode")
    private String n402OtherInsuredStateCode;
    @JsonProperty("n403_otherInsuredZipCode")
    private String n403OtherInsuredZipCode;
    @JsonProperty("n404_otherInsuredCountryCode")
    private String n404OtherInsuredCountryCode;
    @JsonProperty("n407_otherInsuredCountrySubdivisionCode")
    private String n407OtherInsuredCountrySubdivisionCode;
    @JsonProperty("ref_otherInsuredSecondaryIdentifier")
    private List<RefOtherInsuredSecondaryIdentifier> refOtherInsuredSecondaryIdentifier = new ArrayList<RefOtherInsuredSecondaryIdentifier>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherInsuredEntityTypeCode")
    public String getNm101OtherInsuredEntityTypeCode() {
        return nm101OtherInsuredEntityTypeCode;
    }

    @JsonProperty("nm101_otherInsuredEntityTypeCode")
    public void setNm101OtherInsuredEntityTypeCode(String nm101OtherInsuredEntityTypeCode) {
        this.nm101OtherInsuredEntityTypeCode = nm101OtherInsuredEntityTypeCode;
    }

    public OtherSubscriberName withNm101OtherInsuredEntityTypeCode(String nm101OtherInsuredEntityTypeCode) {
        this.nm101OtherInsuredEntityTypeCode = nm101OtherInsuredEntityTypeCode;
        return this;
    }

    @JsonProperty("nm102_otherInsuredEntityTypeQlfr")
    public String getNm102OtherInsuredEntityTypeQlfr() {
        return nm102OtherInsuredEntityTypeQlfr;
    }

    @JsonProperty("nm102_otherInsuredEntityTypeQlfr")
    public void setNm102OtherInsuredEntityTypeQlfr(String nm102OtherInsuredEntityTypeQlfr) {
        this.nm102OtherInsuredEntityTypeQlfr = nm102OtherInsuredEntityTypeQlfr;
    }

    public OtherSubscriberName withNm102OtherInsuredEntityTypeQlfr(String nm102OtherInsuredEntityTypeQlfr) {
        this.nm102OtherInsuredEntityTypeQlfr = nm102OtherInsuredEntityTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_otherInsuredLastName")
    public String getNm103OtherInsuredLastName() {
        return nm103OtherInsuredLastName;
    }

    @JsonProperty("nm103_otherInsuredLastName")
    public void setNm103OtherInsuredLastName(String nm103OtherInsuredLastName) {
        this.nm103OtherInsuredLastName = nm103OtherInsuredLastName;
    }

    public OtherSubscriberName withNm103OtherInsuredLastName(String nm103OtherInsuredLastName) {
        this.nm103OtherInsuredLastName = nm103OtherInsuredLastName;
        return this;
    }

    @JsonProperty("nm104_otherInsuredFirstName")
    public String getNm104OtherInsuredFirstName() {
        return nm104OtherInsuredFirstName;
    }

    @JsonProperty("nm104_otherInsuredFirstName")
    public void setNm104OtherInsuredFirstName(String nm104OtherInsuredFirstName) {
        this.nm104OtherInsuredFirstName = nm104OtherInsuredFirstName;
    }

    public OtherSubscriberName withNm104OtherInsuredFirstName(String nm104OtherInsuredFirstName) {
        this.nm104OtherInsuredFirstName = nm104OtherInsuredFirstName;
        return this;
    }

    @JsonProperty("nm105_otherInsuredMiddleName")
    public String getNm105OtherInsuredMiddleName() {
        return nm105OtherInsuredMiddleName;
    }

    @JsonProperty("nm105_otherInsuredMiddleName")
    public void setNm105OtherInsuredMiddleName(String nm105OtherInsuredMiddleName) {
        this.nm105OtherInsuredMiddleName = nm105OtherInsuredMiddleName;
    }

    public OtherSubscriberName withNm105OtherInsuredMiddleName(String nm105OtherInsuredMiddleName) {
        this.nm105OtherInsuredMiddleName = nm105OtherInsuredMiddleName;
        return this;
    }

    @JsonProperty("nm107_otherInsuredSuffix")
    public String getNm107OtherInsuredSuffix() {
        return nm107OtherInsuredSuffix;
    }

    @JsonProperty("nm107_otherInsuredSuffix")
    public void setNm107OtherInsuredSuffix(String nm107OtherInsuredSuffix) {
        this.nm107OtherInsuredSuffix = nm107OtherInsuredSuffix;
    }

    public OtherSubscriberName withNm107OtherInsuredSuffix(String nm107OtherInsuredSuffix) {
        this.nm107OtherInsuredSuffix = nm107OtherInsuredSuffix;
        return this;
    }

    @JsonProperty("nm108_otherInsuredIdQlfr")
    public String getNm108OtherInsuredIdQlfr() {
        return nm108OtherInsuredIdQlfr;
    }

    @JsonProperty("nm108_otherInsuredIdQlfr")
    public void setNm108OtherInsuredIdQlfr(String nm108OtherInsuredIdQlfr) {
        this.nm108OtherInsuredIdQlfr = nm108OtherInsuredIdQlfr;
    }

    public OtherSubscriberName withNm108OtherInsuredIdQlfr(String nm108OtherInsuredIdQlfr) {
        this.nm108OtherInsuredIdQlfr = nm108OtherInsuredIdQlfr;
        return this;
    }

    @JsonProperty("nm109_otherInsuredId")
    public String getNm109OtherInsuredId() {
        return nm109OtherInsuredId;
    }

    @JsonProperty("nm109_otherInsuredId")
    public void setNm109OtherInsuredId(String nm109OtherInsuredId) {
        this.nm109OtherInsuredId = nm109OtherInsuredId;
    }

    public OtherSubscriberName withNm109OtherInsuredId(String nm109OtherInsuredId) {
        this.nm109OtherInsuredId = nm109OtherInsuredId;
        return this;
    }

    @JsonProperty("n301_otherInsuredAddressLine1")
    public String getN301OtherInsuredAddressLine1() {
        return n301OtherInsuredAddressLine1;
    }

    @JsonProperty("n301_otherInsuredAddressLine1")
    public void setN301OtherInsuredAddressLine1(String n301OtherInsuredAddressLine1) {
        this.n301OtherInsuredAddressLine1 = n301OtherInsuredAddressLine1;
    }

    public OtherSubscriberName withN301OtherInsuredAddressLine1(String n301OtherInsuredAddressLine1) {
        this.n301OtherInsuredAddressLine1 = n301OtherInsuredAddressLine1;
        return this;
    }

    @JsonProperty("n302_otherInsuredAddressLine2")
    public String getN302OtherInsuredAddressLine2() {
        return n302OtherInsuredAddressLine2;
    }

    @JsonProperty("n302_otherInsuredAddressLine2")
    public void setN302OtherInsuredAddressLine2(String n302OtherInsuredAddressLine2) {
        this.n302OtherInsuredAddressLine2 = n302OtherInsuredAddressLine2;
    }

    public OtherSubscriberName withN302OtherInsuredAddressLine2(String n302OtherInsuredAddressLine2) {
        this.n302OtherInsuredAddressLine2 = n302OtherInsuredAddressLine2;
        return this;
    }

    @JsonProperty("n401_otherInsuredCity")
    public String getN401OtherInsuredCity() {
        return n401OtherInsuredCity;
    }

    @JsonProperty("n401_otherInsuredCity")
    public void setN401OtherInsuredCity(String n401OtherInsuredCity) {
        this.n401OtherInsuredCity = n401OtherInsuredCity;
    }

    public OtherSubscriberName withN401OtherInsuredCity(String n401OtherInsuredCity) {
        this.n401OtherInsuredCity = n401OtherInsuredCity;
        return this;
    }

    @JsonProperty("n402_otherInsuredStateCode")
    public String getN402OtherInsuredStateCode() {
        return n402OtherInsuredStateCode;
    }

    @JsonProperty("n402_otherInsuredStateCode")
    public void setN402OtherInsuredStateCode(String n402OtherInsuredStateCode) {
        this.n402OtherInsuredStateCode = n402OtherInsuredStateCode;
    }

    public OtherSubscriberName withN402OtherInsuredStateCode(String n402OtherInsuredStateCode) {
        this.n402OtherInsuredStateCode = n402OtherInsuredStateCode;
        return this;
    }

    @JsonProperty("n403_otherInsuredZipCode")
    public String getN403OtherInsuredZipCode() {
        return n403OtherInsuredZipCode;
    }

    @JsonProperty("n403_otherInsuredZipCode")
    public void setN403OtherInsuredZipCode(String n403OtherInsuredZipCode) {
        this.n403OtherInsuredZipCode = n403OtherInsuredZipCode;
    }

    public OtherSubscriberName withN403OtherInsuredZipCode(String n403OtherInsuredZipCode) {
        this.n403OtherInsuredZipCode = n403OtherInsuredZipCode;
        return this;
    }

    @JsonProperty("n404_otherInsuredCountryCode")
    public String getN404OtherInsuredCountryCode() {
        return n404OtherInsuredCountryCode;
    }

    @JsonProperty("n404_otherInsuredCountryCode")
    public void setN404OtherInsuredCountryCode(String n404OtherInsuredCountryCode) {
        this.n404OtherInsuredCountryCode = n404OtherInsuredCountryCode;
    }

    public OtherSubscriberName withN404OtherInsuredCountryCode(String n404OtherInsuredCountryCode) {
        this.n404OtherInsuredCountryCode = n404OtherInsuredCountryCode;
        return this;
    }

    @JsonProperty("n407_otherInsuredCountrySubdivisionCode")
    public String getN407OtherInsuredCountrySubdivisionCode() {
        return n407OtherInsuredCountrySubdivisionCode;
    }

    @JsonProperty("n407_otherInsuredCountrySubdivisionCode")
    public void setN407OtherInsuredCountrySubdivisionCode(String n407OtherInsuredCountrySubdivisionCode) {
        this.n407OtherInsuredCountrySubdivisionCode = n407OtherInsuredCountrySubdivisionCode;
    }

    public OtherSubscriberName withN407OtherInsuredCountrySubdivisionCode(String n407OtherInsuredCountrySubdivisionCode) {
        this.n407OtherInsuredCountrySubdivisionCode = n407OtherInsuredCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("ref_otherInsuredSecondaryIdentifier")
    public List<RefOtherInsuredSecondaryIdentifier> getRefOtherInsuredSecondaryIdentifier() {
        return refOtherInsuredSecondaryIdentifier;
    }

    @JsonProperty("ref_otherInsuredSecondaryIdentifier")
    public void setRefOtherInsuredSecondaryIdentifier(List<RefOtherInsuredSecondaryIdentifier> refOtherInsuredSecondaryIdentifier) {
        this.refOtherInsuredSecondaryIdentifier = refOtherInsuredSecondaryIdentifier;
    }

    public OtherSubscriberName withRefOtherInsuredSecondaryIdentifier(List<RefOtherInsuredSecondaryIdentifier> refOtherInsuredSecondaryIdentifier) {
        this.refOtherInsuredSecondaryIdentifier = refOtherInsuredSecondaryIdentifier;
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

    public OtherSubscriberName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherInsuredEntityTypeCode).append(nm102OtherInsuredEntityTypeQlfr).append(nm103OtherInsuredLastName).append(nm104OtherInsuredFirstName).append(nm105OtherInsuredMiddleName).append(nm107OtherInsuredSuffix).append(nm108OtherInsuredIdQlfr).append(nm109OtherInsuredId).append(n301OtherInsuredAddressLine1).append(n302OtherInsuredAddressLine2).append(n401OtherInsuredCity).append(n402OtherInsuredStateCode).append(n403OtherInsuredZipCode).append(n404OtherInsuredCountryCode).append(n407OtherInsuredCountrySubdivisionCode).append(refOtherInsuredSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherSubscriberName) == false) {
            return false;
        }
        OtherSubscriberName rhs = ((OtherSubscriberName) other);
        return new EqualsBuilder().append(nm101OtherInsuredEntityTypeCode, rhs.nm101OtherInsuredEntityTypeCode).append(nm102OtherInsuredEntityTypeQlfr, rhs.nm102OtherInsuredEntityTypeQlfr).append(nm103OtherInsuredLastName, rhs.nm103OtherInsuredLastName).append(nm104OtherInsuredFirstName, rhs.nm104OtherInsuredFirstName).append(nm105OtherInsuredMiddleName, rhs.nm105OtherInsuredMiddleName).append(nm107OtherInsuredSuffix, rhs.nm107OtherInsuredSuffix).append(nm108OtherInsuredIdQlfr, rhs.nm108OtherInsuredIdQlfr).append(nm109OtherInsuredId, rhs.nm109OtherInsuredId).append(n301OtherInsuredAddressLine1, rhs.n301OtherInsuredAddressLine1).append(n302OtherInsuredAddressLine2, rhs.n302OtherInsuredAddressLine2).append(n401OtherInsuredCity, rhs.n401OtherInsuredCity).append(n402OtherInsuredStateCode, rhs.n402OtherInsuredStateCode).append(n403OtherInsuredZipCode, rhs.n403OtherInsuredZipCode).append(n404OtherInsuredCountryCode, rhs.n404OtherInsuredCountryCode).append(n407OtherInsuredCountrySubdivisionCode, rhs.n407OtherInsuredCountrySubdivisionCode).append(refOtherInsuredSecondaryIdentifier, rhs.refOtherInsuredSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

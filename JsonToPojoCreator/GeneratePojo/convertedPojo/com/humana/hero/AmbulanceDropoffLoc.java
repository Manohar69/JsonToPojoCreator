
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
    "nm101_ambulanceDropoffLocationEntityCode",
    "nm102_ambulanceDropoffLocationEntityCodeQlfr",
    "nm103_ambulanceDropoffLocationLastOrOrganizationName",
    "n301_ambulanceDropoffAddress1",
    "n302_ambulanceDropoffAddress2",
    "n401_ambulanceDropoffCity",
    "n402_ambulanceDropoffStateCode",
    "n403_ambulanceDropoffZipCode",
    "n404_ambulanceDropoffCountryCode",
    "n407_ambulanceDropoffCountrySubdivisionCode"
})
public class AmbulanceDropoffLoc {

    @JsonProperty("nm101_ambulanceDropoffLocationEntityCode")
    private String nm101AmbulanceDropoffLocationEntityCode;
    @JsonProperty("nm102_ambulanceDropoffLocationEntityCodeQlfr")
    private String nm102AmbulanceDropoffLocationEntityCodeQlfr;
    @JsonProperty("nm103_ambulanceDropoffLocationLastOrOrganizationName")
    private String nm103AmbulanceDropoffLocationLastOrOrganizationName;
    @JsonProperty("n301_ambulanceDropoffAddress1")
    private String n301AmbulanceDropoffAddress1;
    @JsonProperty("n302_ambulanceDropoffAddress2")
    private String n302AmbulanceDropoffAddress2;
    @JsonProperty("n401_ambulanceDropoffCity")
    private String n401AmbulanceDropoffCity;
    @JsonProperty("n402_ambulanceDropoffStateCode")
    private String n402AmbulanceDropoffStateCode;
    @JsonProperty("n403_ambulanceDropoffZipCode")
    private String n403AmbulanceDropoffZipCode;
    @JsonProperty("n404_ambulanceDropoffCountryCode")
    private String n404AmbulanceDropoffCountryCode;
    @JsonProperty("n407_ambulanceDropoffCountrySubdivisionCode")
    private String n407AmbulanceDropoffCountrySubdivisionCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_ambulanceDropoffLocationEntityCode")
    public String getNm101AmbulanceDropoffLocationEntityCode() {
        return nm101AmbulanceDropoffLocationEntityCode;
    }

    @JsonProperty("nm101_ambulanceDropoffLocationEntityCode")
    public void setNm101AmbulanceDropoffLocationEntityCode(String nm101AmbulanceDropoffLocationEntityCode) {
        this.nm101AmbulanceDropoffLocationEntityCode = nm101AmbulanceDropoffLocationEntityCode;
    }

    public AmbulanceDropoffLoc withNm101AmbulanceDropoffLocationEntityCode(String nm101AmbulanceDropoffLocationEntityCode) {
        this.nm101AmbulanceDropoffLocationEntityCode = nm101AmbulanceDropoffLocationEntityCode;
        return this;
    }

    @JsonProperty("nm102_ambulanceDropoffLocationEntityCodeQlfr")
    public String getNm102AmbulanceDropoffLocationEntityCodeQlfr() {
        return nm102AmbulanceDropoffLocationEntityCodeQlfr;
    }

    @JsonProperty("nm102_ambulanceDropoffLocationEntityCodeQlfr")
    public void setNm102AmbulanceDropoffLocationEntityCodeQlfr(String nm102AmbulanceDropoffLocationEntityCodeQlfr) {
        this.nm102AmbulanceDropoffLocationEntityCodeQlfr = nm102AmbulanceDropoffLocationEntityCodeQlfr;
    }

    public AmbulanceDropoffLoc withNm102AmbulanceDropoffLocationEntityCodeQlfr(String nm102AmbulanceDropoffLocationEntityCodeQlfr) {
        this.nm102AmbulanceDropoffLocationEntityCodeQlfr = nm102AmbulanceDropoffLocationEntityCodeQlfr;
        return this;
    }

    @JsonProperty("nm103_ambulanceDropoffLocationLastOrOrganizationName")
    public String getNm103AmbulanceDropoffLocationLastOrOrganizationName() {
        return nm103AmbulanceDropoffLocationLastOrOrganizationName;
    }

    @JsonProperty("nm103_ambulanceDropoffLocationLastOrOrganizationName")
    public void setNm103AmbulanceDropoffLocationLastOrOrganizationName(String nm103AmbulanceDropoffLocationLastOrOrganizationName) {
        this.nm103AmbulanceDropoffLocationLastOrOrganizationName = nm103AmbulanceDropoffLocationLastOrOrganizationName;
    }

    public AmbulanceDropoffLoc withNm103AmbulanceDropoffLocationLastOrOrganizationName(String nm103AmbulanceDropoffLocationLastOrOrganizationName) {
        this.nm103AmbulanceDropoffLocationLastOrOrganizationName = nm103AmbulanceDropoffLocationLastOrOrganizationName;
        return this;
    }

    @JsonProperty("n301_ambulanceDropoffAddress1")
    public String getN301AmbulanceDropoffAddress1() {
        return n301AmbulanceDropoffAddress1;
    }

    @JsonProperty("n301_ambulanceDropoffAddress1")
    public void setN301AmbulanceDropoffAddress1(String n301AmbulanceDropoffAddress1) {
        this.n301AmbulanceDropoffAddress1 = n301AmbulanceDropoffAddress1;
    }

    public AmbulanceDropoffLoc withN301AmbulanceDropoffAddress1(String n301AmbulanceDropoffAddress1) {
        this.n301AmbulanceDropoffAddress1 = n301AmbulanceDropoffAddress1;
        return this;
    }

    @JsonProperty("n302_ambulanceDropoffAddress2")
    public String getN302AmbulanceDropoffAddress2() {
        return n302AmbulanceDropoffAddress2;
    }

    @JsonProperty("n302_ambulanceDropoffAddress2")
    public void setN302AmbulanceDropoffAddress2(String n302AmbulanceDropoffAddress2) {
        this.n302AmbulanceDropoffAddress2 = n302AmbulanceDropoffAddress2;
    }

    public AmbulanceDropoffLoc withN302AmbulanceDropoffAddress2(String n302AmbulanceDropoffAddress2) {
        this.n302AmbulanceDropoffAddress2 = n302AmbulanceDropoffAddress2;
        return this;
    }

    @JsonProperty("n401_ambulanceDropoffCity")
    public String getN401AmbulanceDropoffCity() {
        return n401AmbulanceDropoffCity;
    }

    @JsonProperty("n401_ambulanceDropoffCity")
    public void setN401AmbulanceDropoffCity(String n401AmbulanceDropoffCity) {
        this.n401AmbulanceDropoffCity = n401AmbulanceDropoffCity;
    }

    public AmbulanceDropoffLoc withN401AmbulanceDropoffCity(String n401AmbulanceDropoffCity) {
        this.n401AmbulanceDropoffCity = n401AmbulanceDropoffCity;
        return this;
    }

    @JsonProperty("n402_ambulanceDropoffStateCode")
    public String getN402AmbulanceDropoffStateCode() {
        return n402AmbulanceDropoffStateCode;
    }

    @JsonProperty("n402_ambulanceDropoffStateCode")
    public void setN402AmbulanceDropoffStateCode(String n402AmbulanceDropoffStateCode) {
        this.n402AmbulanceDropoffStateCode = n402AmbulanceDropoffStateCode;
    }

    public AmbulanceDropoffLoc withN402AmbulanceDropoffStateCode(String n402AmbulanceDropoffStateCode) {
        this.n402AmbulanceDropoffStateCode = n402AmbulanceDropoffStateCode;
        return this;
    }

    @JsonProperty("n403_ambulanceDropoffZipCode")
    public String getN403AmbulanceDropoffZipCode() {
        return n403AmbulanceDropoffZipCode;
    }

    @JsonProperty("n403_ambulanceDropoffZipCode")
    public void setN403AmbulanceDropoffZipCode(String n403AmbulanceDropoffZipCode) {
        this.n403AmbulanceDropoffZipCode = n403AmbulanceDropoffZipCode;
    }

    public AmbulanceDropoffLoc withN403AmbulanceDropoffZipCode(String n403AmbulanceDropoffZipCode) {
        this.n403AmbulanceDropoffZipCode = n403AmbulanceDropoffZipCode;
        return this;
    }

    @JsonProperty("n404_ambulanceDropoffCountryCode")
    public String getN404AmbulanceDropoffCountryCode() {
        return n404AmbulanceDropoffCountryCode;
    }

    @JsonProperty("n404_ambulanceDropoffCountryCode")
    public void setN404AmbulanceDropoffCountryCode(String n404AmbulanceDropoffCountryCode) {
        this.n404AmbulanceDropoffCountryCode = n404AmbulanceDropoffCountryCode;
    }

    public AmbulanceDropoffLoc withN404AmbulanceDropoffCountryCode(String n404AmbulanceDropoffCountryCode) {
        this.n404AmbulanceDropoffCountryCode = n404AmbulanceDropoffCountryCode;
        return this;
    }

    @JsonProperty("n407_ambulanceDropoffCountrySubdivisionCode")
    public String getN407AmbulanceDropoffCountrySubdivisionCode() {
        return n407AmbulanceDropoffCountrySubdivisionCode;
    }

    @JsonProperty("n407_ambulanceDropoffCountrySubdivisionCode")
    public void setN407AmbulanceDropoffCountrySubdivisionCode(String n407AmbulanceDropoffCountrySubdivisionCode) {
        this.n407AmbulanceDropoffCountrySubdivisionCode = n407AmbulanceDropoffCountrySubdivisionCode;
    }

    public AmbulanceDropoffLoc withN407AmbulanceDropoffCountrySubdivisionCode(String n407AmbulanceDropoffCountrySubdivisionCode) {
        this.n407AmbulanceDropoffCountrySubdivisionCode = n407AmbulanceDropoffCountrySubdivisionCode;
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

    public AmbulanceDropoffLoc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101AmbulanceDropoffLocationEntityCode).append(nm102AmbulanceDropoffLocationEntityCodeQlfr).append(nm103AmbulanceDropoffLocationLastOrOrganizationName).append(n301AmbulanceDropoffAddress1).append(n302AmbulanceDropoffAddress2).append(n401AmbulanceDropoffCity).append(n402AmbulanceDropoffStateCode).append(n403AmbulanceDropoffZipCode).append(n404AmbulanceDropoffCountryCode).append(n407AmbulanceDropoffCountrySubdivisionCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmbulanceDropoffLoc) == false) {
            return false;
        }
        AmbulanceDropoffLoc rhs = ((AmbulanceDropoffLoc) other);
        return new EqualsBuilder().append(nm101AmbulanceDropoffLocationEntityCode, rhs.nm101AmbulanceDropoffLocationEntityCode).append(nm102AmbulanceDropoffLocationEntityCodeQlfr, rhs.nm102AmbulanceDropoffLocationEntityCodeQlfr).append(nm103AmbulanceDropoffLocationLastOrOrganizationName, rhs.nm103AmbulanceDropoffLocationLastOrOrganizationName).append(n301AmbulanceDropoffAddress1, rhs.n301AmbulanceDropoffAddress1).append(n302AmbulanceDropoffAddress2, rhs.n302AmbulanceDropoffAddress2).append(n401AmbulanceDropoffCity, rhs.n401AmbulanceDropoffCity).append(n402AmbulanceDropoffStateCode, rhs.n402AmbulanceDropoffStateCode).append(n403AmbulanceDropoffZipCode, rhs.n403AmbulanceDropoffZipCode).append(n404AmbulanceDropoffCountryCode, rhs.n404AmbulanceDropoffCountryCode).append(n407AmbulanceDropoffCountrySubdivisionCode, rhs.n407AmbulanceDropoffCountrySubdivisionCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

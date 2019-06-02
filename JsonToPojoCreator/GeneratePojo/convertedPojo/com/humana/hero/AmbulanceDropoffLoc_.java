
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
    "nm101_ambulanceDropOffLocationCode",
    "nm102_ambulanceDropOffLocationCodeQlfr",
    "nm103_ambulanceDropoffLocation",
    "n301_ambulanceDropOffAddressLine1",
    "n302_ambulanceDropOffAddressLine2",
    "n401_ambulanceDropoffCity",
    "n402_ambulanceDropoffStateCode",
    "n403_ambulanceDropoffZipCode",
    "n404_ambulanceDropoffCountryCode",
    "n407_ambulanceDropoffCountrySubdivisionCode"
})
public class AmbulanceDropoffLoc_ {

    @JsonProperty("nm101_ambulanceDropOffLocationCode")
    private String nm101AmbulanceDropOffLocationCode;
    @JsonProperty("nm102_ambulanceDropOffLocationCodeQlfr")
    private String nm102AmbulanceDropOffLocationCodeQlfr;
    @JsonProperty("nm103_ambulanceDropoffLocation")
    private String nm103AmbulanceDropoffLocation;
    @JsonProperty("n301_ambulanceDropOffAddressLine1")
    private String n301AmbulanceDropOffAddressLine1;
    @JsonProperty("n302_ambulanceDropOffAddressLine2")
    private String n302AmbulanceDropOffAddressLine2;
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

    @JsonProperty("nm101_ambulanceDropOffLocationCode")
    public String getNm101AmbulanceDropOffLocationCode() {
        return nm101AmbulanceDropOffLocationCode;
    }

    @JsonProperty("nm101_ambulanceDropOffLocationCode")
    public void setNm101AmbulanceDropOffLocationCode(String nm101AmbulanceDropOffLocationCode) {
        this.nm101AmbulanceDropOffLocationCode = nm101AmbulanceDropOffLocationCode;
    }

    public AmbulanceDropoffLoc_ withNm101AmbulanceDropOffLocationCode(String nm101AmbulanceDropOffLocationCode) {
        this.nm101AmbulanceDropOffLocationCode = nm101AmbulanceDropOffLocationCode;
        return this;
    }

    @JsonProperty("nm102_ambulanceDropOffLocationCodeQlfr")
    public String getNm102AmbulanceDropOffLocationCodeQlfr() {
        return nm102AmbulanceDropOffLocationCodeQlfr;
    }

    @JsonProperty("nm102_ambulanceDropOffLocationCodeQlfr")
    public void setNm102AmbulanceDropOffLocationCodeQlfr(String nm102AmbulanceDropOffLocationCodeQlfr) {
        this.nm102AmbulanceDropOffLocationCodeQlfr = nm102AmbulanceDropOffLocationCodeQlfr;
    }

    public AmbulanceDropoffLoc_ withNm102AmbulanceDropOffLocationCodeQlfr(String nm102AmbulanceDropOffLocationCodeQlfr) {
        this.nm102AmbulanceDropOffLocationCodeQlfr = nm102AmbulanceDropOffLocationCodeQlfr;
        return this;
    }

    @JsonProperty("nm103_ambulanceDropoffLocation")
    public String getNm103AmbulanceDropoffLocation() {
        return nm103AmbulanceDropoffLocation;
    }

    @JsonProperty("nm103_ambulanceDropoffLocation")
    public void setNm103AmbulanceDropoffLocation(String nm103AmbulanceDropoffLocation) {
        this.nm103AmbulanceDropoffLocation = nm103AmbulanceDropoffLocation;
    }

    public AmbulanceDropoffLoc_ withNm103AmbulanceDropoffLocation(String nm103AmbulanceDropoffLocation) {
        this.nm103AmbulanceDropoffLocation = nm103AmbulanceDropoffLocation;
        return this;
    }

    @JsonProperty("n301_ambulanceDropOffAddressLine1")
    public String getN301AmbulanceDropOffAddressLine1() {
        return n301AmbulanceDropOffAddressLine1;
    }

    @JsonProperty("n301_ambulanceDropOffAddressLine1")
    public void setN301AmbulanceDropOffAddressLine1(String n301AmbulanceDropOffAddressLine1) {
        this.n301AmbulanceDropOffAddressLine1 = n301AmbulanceDropOffAddressLine1;
    }

    public AmbulanceDropoffLoc_ withN301AmbulanceDropOffAddressLine1(String n301AmbulanceDropOffAddressLine1) {
        this.n301AmbulanceDropOffAddressLine1 = n301AmbulanceDropOffAddressLine1;
        return this;
    }

    @JsonProperty("n302_ambulanceDropOffAddressLine2")
    public String getN302AmbulanceDropOffAddressLine2() {
        return n302AmbulanceDropOffAddressLine2;
    }

    @JsonProperty("n302_ambulanceDropOffAddressLine2")
    public void setN302AmbulanceDropOffAddressLine2(String n302AmbulanceDropOffAddressLine2) {
        this.n302AmbulanceDropOffAddressLine2 = n302AmbulanceDropOffAddressLine2;
    }

    public AmbulanceDropoffLoc_ withN302AmbulanceDropOffAddressLine2(String n302AmbulanceDropOffAddressLine2) {
        this.n302AmbulanceDropOffAddressLine2 = n302AmbulanceDropOffAddressLine2;
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

    public AmbulanceDropoffLoc_ withN401AmbulanceDropoffCity(String n401AmbulanceDropoffCity) {
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

    public AmbulanceDropoffLoc_ withN402AmbulanceDropoffStateCode(String n402AmbulanceDropoffStateCode) {
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

    public AmbulanceDropoffLoc_ withN403AmbulanceDropoffZipCode(String n403AmbulanceDropoffZipCode) {
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

    public AmbulanceDropoffLoc_ withN404AmbulanceDropoffCountryCode(String n404AmbulanceDropoffCountryCode) {
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

    public AmbulanceDropoffLoc_ withN407AmbulanceDropoffCountrySubdivisionCode(String n407AmbulanceDropoffCountrySubdivisionCode) {
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

    public AmbulanceDropoffLoc_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101AmbulanceDropOffLocationCode).append(nm102AmbulanceDropOffLocationCodeQlfr).append(nm103AmbulanceDropoffLocation).append(n301AmbulanceDropOffAddressLine1).append(n302AmbulanceDropOffAddressLine2).append(n401AmbulanceDropoffCity).append(n402AmbulanceDropoffStateCode).append(n403AmbulanceDropoffZipCode).append(n404AmbulanceDropoffCountryCode).append(n407AmbulanceDropoffCountrySubdivisionCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmbulanceDropoffLoc_) == false) {
            return false;
        }
        AmbulanceDropoffLoc_ rhs = ((AmbulanceDropoffLoc_) other);
        return new EqualsBuilder().append(nm101AmbulanceDropOffLocationCode, rhs.nm101AmbulanceDropOffLocationCode).append(nm102AmbulanceDropOffLocationCodeQlfr, rhs.nm102AmbulanceDropOffLocationCodeQlfr).append(nm103AmbulanceDropoffLocation, rhs.nm103AmbulanceDropoffLocation).append(n301AmbulanceDropOffAddressLine1, rhs.n301AmbulanceDropOffAddressLine1).append(n302AmbulanceDropOffAddressLine2, rhs.n302AmbulanceDropOffAddressLine2).append(n401AmbulanceDropoffCity, rhs.n401AmbulanceDropoffCity).append(n402AmbulanceDropoffStateCode, rhs.n402AmbulanceDropoffStateCode).append(n403AmbulanceDropoffZipCode, rhs.n403AmbulanceDropoffZipCode).append(n404AmbulanceDropoffCountryCode, rhs.n404AmbulanceDropoffCountryCode).append(n407AmbulanceDropoffCountrySubdivisionCode, rhs.n407AmbulanceDropoffCountrySubdivisionCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

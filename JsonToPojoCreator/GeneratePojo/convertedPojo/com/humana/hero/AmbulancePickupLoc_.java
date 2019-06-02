
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
    "nm101_ambulancePickupLocationCode",
    "nm102_ambulancePickuplocationCodeQlfr",
    "n301_ambulancePickupAddressLine1",
    "n302_ambulancePickupAddressLine2",
    "n401_ambulancePickupCity",
    "n402_ambulancePickupStateCode",
    "n403_ambulancePickupZipCode",
    "n404_ambulancePickupCountryCode",
    "n407_ambulancePickupcountrySubdivisionCode"
})
public class AmbulancePickupLoc_ {

    @JsonProperty("nm101_ambulancePickupLocationCode")
    private String nm101AmbulancePickupLocationCode;
    @JsonProperty("nm102_ambulancePickuplocationCodeQlfr")
    private String nm102AmbulancePickuplocationCodeQlfr;
    @JsonProperty("n301_ambulancePickupAddressLine1")
    private String n301AmbulancePickupAddressLine1;
    @JsonProperty("n302_ambulancePickupAddressLine2")
    private String n302AmbulancePickupAddressLine2;
    @JsonProperty("n401_ambulancePickupCity")
    private String n401AmbulancePickupCity;
    @JsonProperty("n402_ambulancePickupStateCode")
    private String n402AmbulancePickupStateCode;
    @JsonProperty("n403_ambulancePickupZipCode")
    private String n403AmbulancePickupZipCode;
    @JsonProperty("n404_ambulancePickupCountryCode")
    private String n404AmbulancePickupCountryCode;
    @JsonProperty("n407_ambulancePickupcountrySubdivisionCode")
    private String n407AmbulancePickupcountrySubdivisionCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_ambulancePickupLocationCode")
    public String getNm101AmbulancePickupLocationCode() {
        return nm101AmbulancePickupLocationCode;
    }

    @JsonProperty("nm101_ambulancePickupLocationCode")
    public void setNm101AmbulancePickupLocationCode(String nm101AmbulancePickupLocationCode) {
        this.nm101AmbulancePickupLocationCode = nm101AmbulancePickupLocationCode;
    }

    public AmbulancePickupLoc_ withNm101AmbulancePickupLocationCode(String nm101AmbulancePickupLocationCode) {
        this.nm101AmbulancePickupLocationCode = nm101AmbulancePickupLocationCode;
        return this;
    }

    @JsonProperty("nm102_ambulancePickuplocationCodeQlfr")
    public String getNm102AmbulancePickuplocationCodeQlfr() {
        return nm102AmbulancePickuplocationCodeQlfr;
    }

    @JsonProperty("nm102_ambulancePickuplocationCodeQlfr")
    public void setNm102AmbulancePickuplocationCodeQlfr(String nm102AmbulancePickuplocationCodeQlfr) {
        this.nm102AmbulancePickuplocationCodeQlfr = nm102AmbulancePickuplocationCodeQlfr;
    }

    public AmbulancePickupLoc_ withNm102AmbulancePickuplocationCodeQlfr(String nm102AmbulancePickuplocationCodeQlfr) {
        this.nm102AmbulancePickuplocationCodeQlfr = nm102AmbulancePickuplocationCodeQlfr;
        return this;
    }

    @JsonProperty("n301_ambulancePickupAddressLine1")
    public String getN301AmbulancePickupAddressLine1() {
        return n301AmbulancePickupAddressLine1;
    }

    @JsonProperty("n301_ambulancePickupAddressLine1")
    public void setN301AmbulancePickupAddressLine1(String n301AmbulancePickupAddressLine1) {
        this.n301AmbulancePickupAddressLine1 = n301AmbulancePickupAddressLine1;
    }

    public AmbulancePickupLoc_ withN301AmbulancePickupAddressLine1(String n301AmbulancePickupAddressLine1) {
        this.n301AmbulancePickupAddressLine1 = n301AmbulancePickupAddressLine1;
        return this;
    }

    @JsonProperty("n302_ambulancePickupAddressLine2")
    public String getN302AmbulancePickupAddressLine2() {
        return n302AmbulancePickupAddressLine2;
    }

    @JsonProperty("n302_ambulancePickupAddressLine2")
    public void setN302AmbulancePickupAddressLine2(String n302AmbulancePickupAddressLine2) {
        this.n302AmbulancePickupAddressLine2 = n302AmbulancePickupAddressLine2;
    }

    public AmbulancePickupLoc_ withN302AmbulancePickupAddressLine2(String n302AmbulancePickupAddressLine2) {
        this.n302AmbulancePickupAddressLine2 = n302AmbulancePickupAddressLine2;
        return this;
    }

    @JsonProperty("n401_ambulancePickupCity")
    public String getN401AmbulancePickupCity() {
        return n401AmbulancePickupCity;
    }

    @JsonProperty("n401_ambulancePickupCity")
    public void setN401AmbulancePickupCity(String n401AmbulancePickupCity) {
        this.n401AmbulancePickupCity = n401AmbulancePickupCity;
    }

    public AmbulancePickupLoc_ withN401AmbulancePickupCity(String n401AmbulancePickupCity) {
        this.n401AmbulancePickupCity = n401AmbulancePickupCity;
        return this;
    }

    @JsonProperty("n402_ambulancePickupStateCode")
    public String getN402AmbulancePickupStateCode() {
        return n402AmbulancePickupStateCode;
    }

    @JsonProperty("n402_ambulancePickupStateCode")
    public void setN402AmbulancePickupStateCode(String n402AmbulancePickupStateCode) {
        this.n402AmbulancePickupStateCode = n402AmbulancePickupStateCode;
    }

    public AmbulancePickupLoc_ withN402AmbulancePickupStateCode(String n402AmbulancePickupStateCode) {
        this.n402AmbulancePickupStateCode = n402AmbulancePickupStateCode;
        return this;
    }

    @JsonProperty("n403_ambulancePickupZipCode")
    public String getN403AmbulancePickupZipCode() {
        return n403AmbulancePickupZipCode;
    }

    @JsonProperty("n403_ambulancePickupZipCode")
    public void setN403AmbulancePickupZipCode(String n403AmbulancePickupZipCode) {
        this.n403AmbulancePickupZipCode = n403AmbulancePickupZipCode;
    }

    public AmbulancePickupLoc_ withN403AmbulancePickupZipCode(String n403AmbulancePickupZipCode) {
        this.n403AmbulancePickupZipCode = n403AmbulancePickupZipCode;
        return this;
    }

    @JsonProperty("n404_ambulancePickupCountryCode")
    public String getN404AmbulancePickupCountryCode() {
        return n404AmbulancePickupCountryCode;
    }

    @JsonProperty("n404_ambulancePickupCountryCode")
    public void setN404AmbulancePickupCountryCode(String n404AmbulancePickupCountryCode) {
        this.n404AmbulancePickupCountryCode = n404AmbulancePickupCountryCode;
    }

    public AmbulancePickupLoc_ withN404AmbulancePickupCountryCode(String n404AmbulancePickupCountryCode) {
        this.n404AmbulancePickupCountryCode = n404AmbulancePickupCountryCode;
        return this;
    }

    @JsonProperty("n407_ambulancePickupcountrySubdivisionCode")
    public String getN407AmbulancePickupcountrySubdivisionCode() {
        return n407AmbulancePickupcountrySubdivisionCode;
    }

    @JsonProperty("n407_ambulancePickupcountrySubdivisionCode")
    public void setN407AmbulancePickupcountrySubdivisionCode(String n407AmbulancePickupcountrySubdivisionCode) {
        this.n407AmbulancePickupcountrySubdivisionCode = n407AmbulancePickupcountrySubdivisionCode;
    }

    public AmbulancePickupLoc_ withN407AmbulancePickupcountrySubdivisionCode(String n407AmbulancePickupcountrySubdivisionCode) {
        this.n407AmbulancePickupcountrySubdivisionCode = n407AmbulancePickupcountrySubdivisionCode;
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

    public AmbulancePickupLoc_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101AmbulancePickupLocationCode).append(nm102AmbulancePickuplocationCodeQlfr).append(n301AmbulancePickupAddressLine1).append(n302AmbulancePickupAddressLine2).append(n401AmbulancePickupCity).append(n402AmbulancePickupStateCode).append(n403AmbulancePickupZipCode).append(n404AmbulancePickupCountryCode).append(n407AmbulancePickupcountrySubdivisionCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmbulancePickupLoc_) == false) {
            return false;
        }
        AmbulancePickupLoc_ rhs = ((AmbulancePickupLoc_) other);
        return new EqualsBuilder().append(nm101AmbulancePickupLocationCode, rhs.nm101AmbulancePickupLocationCode).append(nm102AmbulancePickuplocationCodeQlfr, rhs.nm102AmbulancePickuplocationCodeQlfr).append(n301AmbulancePickupAddressLine1, rhs.n301AmbulancePickupAddressLine1).append(n302AmbulancePickupAddressLine2, rhs.n302AmbulancePickupAddressLine2).append(n401AmbulancePickupCity, rhs.n401AmbulancePickupCity).append(n402AmbulancePickupStateCode, rhs.n402AmbulancePickupStateCode).append(n403AmbulancePickupZipCode, rhs.n403AmbulancePickupZipCode).append(n404AmbulancePickupCountryCode, rhs.n404AmbulancePickupCountryCode).append(n407AmbulancePickupcountrySubdivisionCode, rhs.n407AmbulancePickupcountrySubdivisionCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "nm101_labFacilityNameIdentifierCode",
    "nm102_labFacilityTypeQlfr",
    "nm103_labFacilityName",
    "nm108_labFacilityCodeQlfr",
    "nm109_labFacilityIdentifier",
    "n301_labFacilityAddressLine1",
    "n302_labFacilityAddressLine2",
    "n401_labFacilityCity",
    "n402_labFacilityStateCode",
    "n403_labFacilityZipCode",
    "n404_labFacilityCountryCode",
    "n407_labFacilityCountrySubdivisionCode",
    "ref_serviceFacilityLocation",
    "per01_labFacilityFunctionCode",
    "per02_labFacilityContactName",
    "per03_labFacilityTelephoneNoQlfr",
    "per04_labFacilityTelephoneNo",
    "per05_labFacilityExtNoQlfr",
    "per06_labFacilityExtNo"
})
public class SvcFacilityLocation {

    @JsonProperty("nm101_labFacilityNameIdentifierCode")
    private String nm101LabFacilityNameIdentifierCode;
    @JsonProperty("nm102_labFacilityTypeQlfr")
    private String nm102LabFacilityTypeQlfr;
    @JsonProperty("nm103_labFacilityName")
    private String nm103LabFacilityName;
    @JsonProperty("nm108_labFacilityCodeQlfr")
    private String nm108LabFacilityCodeQlfr;
    @JsonProperty("nm109_labFacilityIdentifier")
    private String nm109LabFacilityIdentifier;
    @JsonProperty("n301_labFacilityAddressLine1")
    private String n301LabFacilityAddressLine1;
    @JsonProperty("n302_labFacilityAddressLine2")
    private String n302LabFacilityAddressLine2;
    @JsonProperty("n401_labFacilityCity")
    private String n401LabFacilityCity;
    @JsonProperty("n402_labFacilityStateCode")
    private String n402LabFacilityStateCode;
    @JsonProperty("n403_labFacilityZipCode")
    private String n403LabFacilityZipCode;
    @JsonProperty("n404_labFacilityCountryCode")
    private String n404LabFacilityCountryCode;
    @JsonProperty("n407_labFacilityCountrySubdivisionCode")
    private String n407LabFacilityCountrySubdivisionCode;
    @JsonProperty("ref_serviceFacilityLocation")
    private List<RefServiceFacilityLocation> refServiceFacilityLocation = new ArrayList<RefServiceFacilityLocation>();
    @JsonProperty("per01_labFacilityFunctionCode")
    private String per01LabFacilityFunctionCode;
    @JsonProperty("per02_labFacilityContactName")
    private String per02LabFacilityContactName;
    @JsonProperty("per03_labFacilityTelephoneNoQlfr")
    private String per03LabFacilityTelephoneNoQlfr;
    @JsonProperty("per04_labFacilityTelephoneNo")
    private String per04LabFacilityTelephoneNo;
    @JsonProperty("per05_labFacilityExtNoQlfr")
    private String per05LabFacilityExtNoQlfr;
    @JsonProperty("per06_labFacilityExtNo")
    private String per06LabFacilityExtNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_labFacilityNameIdentifierCode")
    public String getNm101LabFacilityNameIdentifierCode() {
        return nm101LabFacilityNameIdentifierCode;
    }

    @JsonProperty("nm101_labFacilityNameIdentifierCode")
    public void setNm101LabFacilityNameIdentifierCode(String nm101LabFacilityNameIdentifierCode) {
        this.nm101LabFacilityNameIdentifierCode = nm101LabFacilityNameIdentifierCode;
    }

    public SvcFacilityLocation withNm101LabFacilityNameIdentifierCode(String nm101LabFacilityNameIdentifierCode) {
        this.nm101LabFacilityNameIdentifierCode = nm101LabFacilityNameIdentifierCode;
        return this;
    }

    @JsonProperty("nm102_labFacilityTypeQlfr")
    public String getNm102LabFacilityTypeQlfr() {
        return nm102LabFacilityTypeQlfr;
    }

    @JsonProperty("nm102_labFacilityTypeQlfr")
    public void setNm102LabFacilityTypeQlfr(String nm102LabFacilityTypeQlfr) {
        this.nm102LabFacilityTypeQlfr = nm102LabFacilityTypeQlfr;
    }

    public SvcFacilityLocation withNm102LabFacilityTypeQlfr(String nm102LabFacilityTypeQlfr) {
        this.nm102LabFacilityTypeQlfr = nm102LabFacilityTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_labFacilityName")
    public String getNm103LabFacilityName() {
        return nm103LabFacilityName;
    }

    @JsonProperty("nm103_labFacilityName")
    public void setNm103LabFacilityName(String nm103LabFacilityName) {
        this.nm103LabFacilityName = nm103LabFacilityName;
    }

    public SvcFacilityLocation withNm103LabFacilityName(String nm103LabFacilityName) {
        this.nm103LabFacilityName = nm103LabFacilityName;
        return this;
    }

    @JsonProperty("nm108_labFacilityCodeQlfr")
    public String getNm108LabFacilityCodeQlfr() {
        return nm108LabFacilityCodeQlfr;
    }

    @JsonProperty("nm108_labFacilityCodeQlfr")
    public void setNm108LabFacilityCodeQlfr(String nm108LabFacilityCodeQlfr) {
        this.nm108LabFacilityCodeQlfr = nm108LabFacilityCodeQlfr;
    }

    public SvcFacilityLocation withNm108LabFacilityCodeQlfr(String nm108LabFacilityCodeQlfr) {
        this.nm108LabFacilityCodeQlfr = nm108LabFacilityCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_labFacilityIdentifier")
    public String getNm109LabFacilityIdentifier() {
        return nm109LabFacilityIdentifier;
    }

    @JsonProperty("nm109_labFacilityIdentifier")
    public void setNm109LabFacilityIdentifier(String nm109LabFacilityIdentifier) {
        this.nm109LabFacilityIdentifier = nm109LabFacilityIdentifier;
    }

    public SvcFacilityLocation withNm109LabFacilityIdentifier(String nm109LabFacilityIdentifier) {
        this.nm109LabFacilityIdentifier = nm109LabFacilityIdentifier;
        return this;
    }

    @JsonProperty("n301_labFacilityAddressLine1")
    public String getN301LabFacilityAddressLine1() {
        return n301LabFacilityAddressLine1;
    }

    @JsonProperty("n301_labFacilityAddressLine1")
    public void setN301LabFacilityAddressLine1(String n301LabFacilityAddressLine1) {
        this.n301LabFacilityAddressLine1 = n301LabFacilityAddressLine1;
    }

    public SvcFacilityLocation withN301LabFacilityAddressLine1(String n301LabFacilityAddressLine1) {
        this.n301LabFacilityAddressLine1 = n301LabFacilityAddressLine1;
        return this;
    }

    @JsonProperty("n302_labFacilityAddressLine2")
    public String getN302LabFacilityAddressLine2() {
        return n302LabFacilityAddressLine2;
    }

    @JsonProperty("n302_labFacilityAddressLine2")
    public void setN302LabFacilityAddressLine2(String n302LabFacilityAddressLine2) {
        this.n302LabFacilityAddressLine2 = n302LabFacilityAddressLine2;
    }

    public SvcFacilityLocation withN302LabFacilityAddressLine2(String n302LabFacilityAddressLine2) {
        this.n302LabFacilityAddressLine2 = n302LabFacilityAddressLine2;
        return this;
    }

    @JsonProperty("n401_labFacilityCity")
    public String getN401LabFacilityCity() {
        return n401LabFacilityCity;
    }

    @JsonProperty("n401_labFacilityCity")
    public void setN401LabFacilityCity(String n401LabFacilityCity) {
        this.n401LabFacilityCity = n401LabFacilityCity;
    }

    public SvcFacilityLocation withN401LabFacilityCity(String n401LabFacilityCity) {
        this.n401LabFacilityCity = n401LabFacilityCity;
        return this;
    }

    @JsonProperty("n402_labFacilityStateCode")
    public String getN402LabFacilityStateCode() {
        return n402LabFacilityStateCode;
    }

    @JsonProperty("n402_labFacilityStateCode")
    public void setN402LabFacilityStateCode(String n402LabFacilityStateCode) {
        this.n402LabFacilityStateCode = n402LabFacilityStateCode;
    }

    public SvcFacilityLocation withN402LabFacilityStateCode(String n402LabFacilityStateCode) {
        this.n402LabFacilityStateCode = n402LabFacilityStateCode;
        return this;
    }

    @JsonProperty("n403_labFacilityZipCode")
    public String getN403LabFacilityZipCode() {
        return n403LabFacilityZipCode;
    }

    @JsonProperty("n403_labFacilityZipCode")
    public void setN403LabFacilityZipCode(String n403LabFacilityZipCode) {
        this.n403LabFacilityZipCode = n403LabFacilityZipCode;
    }

    public SvcFacilityLocation withN403LabFacilityZipCode(String n403LabFacilityZipCode) {
        this.n403LabFacilityZipCode = n403LabFacilityZipCode;
        return this;
    }

    @JsonProperty("n404_labFacilityCountryCode")
    public String getN404LabFacilityCountryCode() {
        return n404LabFacilityCountryCode;
    }

    @JsonProperty("n404_labFacilityCountryCode")
    public void setN404LabFacilityCountryCode(String n404LabFacilityCountryCode) {
        this.n404LabFacilityCountryCode = n404LabFacilityCountryCode;
    }

    public SvcFacilityLocation withN404LabFacilityCountryCode(String n404LabFacilityCountryCode) {
        this.n404LabFacilityCountryCode = n404LabFacilityCountryCode;
        return this;
    }

    @JsonProperty("n407_labFacilityCountrySubdivisionCode")
    public String getN407LabFacilityCountrySubdivisionCode() {
        return n407LabFacilityCountrySubdivisionCode;
    }

    @JsonProperty("n407_labFacilityCountrySubdivisionCode")
    public void setN407LabFacilityCountrySubdivisionCode(String n407LabFacilityCountrySubdivisionCode) {
        this.n407LabFacilityCountrySubdivisionCode = n407LabFacilityCountrySubdivisionCode;
    }

    public SvcFacilityLocation withN407LabFacilityCountrySubdivisionCode(String n407LabFacilityCountrySubdivisionCode) {
        this.n407LabFacilityCountrySubdivisionCode = n407LabFacilityCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("ref_serviceFacilityLocation")
    public List<RefServiceFacilityLocation> getRefServiceFacilityLocation() {
        return refServiceFacilityLocation;
    }

    @JsonProperty("ref_serviceFacilityLocation")
    public void setRefServiceFacilityLocation(List<RefServiceFacilityLocation> refServiceFacilityLocation) {
        this.refServiceFacilityLocation = refServiceFacilityLocation;
    }

    public SvcFacilityLocation withRefServiceFacilityLocation(List<RefServiceFacilityLocation> refServiceFacilityLocation) {
        this.refServiceFacilityLocation = refServiceFacilityLocation;
        return this;
    }

    @JsonProperty("per01_labFacilityFunctionCode")
    public String getPer01LabFacilityFunctionCode() {
        return per01LabFacilityFunctionCode;
    }

    @JsonProperty("per01_labFacilityFunctionCode")
    public void setPer01LabFacilityFunctionCode(String per01LabFacilityFunctionCode) {
        this.per01LabFacilityFunctionCode = per01LabFacilityFunctionCode;
    }

    public SvcFacilityLocation withPer01LabFacilityFunctionCode(String per01LabFacilityFunctionCode) {
        this.per01LabFacilityFunctionCode = per01LabFacilityFunctionCode;
        return this;
    }

    @JsonProperty("per02_labFacilityContactName")
    public String getPer02LabFacilityContactName() {
        return per02LabFacilityContactName;
    }

    @JsonProperty("per02_labFacilityContactName")
    public void setPer02LabFacilityContactName(String per02LabFacilityContactName) {
        this.per02LabFacilityContactName = per02LabFacilityContactName;
    }

    public SvcFacilityLocation withPer02LabFacilityContactName(String per02LabFacilityContactName) {
        this.per02LabFacilityContactName = per02LabFacilityContactName;
        return this;
    }

    @JsonProperty("per03_labFacilityTelephoneNoQlfr")
    public String getPer03LabFacilityTelephoneNoQlfr() {
        return per03LabFacilityTelephoneNoQlfr;
    }

    @JsonProperty("per03_labFacilityTelephoneNoQlfr")
    public void setPer03LabFacilityTelephoneNoQlfr(String per03LabFacilityTelephoneNoQlfr) {
        this.per03LabFacilityTelephoneNoQlfr = per03LabFacilityTelephoneNoQlfr;
    }

    public SvcFacilityLocation withPer03LabFacilityTelephoneNoQlfr(String per03LabFacilityTelephoneNoQlfr) {
        this.per03LabFacilityTelephoneNoQlfr = per03LabFacilityTelephoneNoQlfr;
        return this;
    }

    @JsonProperty("per04_labFacilityTelephoneNo")
    public String getPer04LabFacilityTelephoneNo() {
        return per04LabFacilityTelephoneNo;
    }

    @JsonProperty("per04_labFacilityTelephoneNo")
    public void setPer04LabFacilityTelephoneNo(String per04LabFacilityTelephoneNo) {
        this.per04LabFacilityTelephoneNo = per04LabFacilityTelephoneNo;
    }

    public SvcFacilityLocation withPer04LabFacilityTelephoneNo(String per04LabFacilityTelephoneNo) {
        this.per04LabFacilityTelephoneNo = per04LabFacilityTelephoneNo;
        return this;
    }

    @JsonProperty("per05_labFacilityExtNoQlfr")
    public String getPer05LabFacilityExtNoQlfr() {
        return per05LabFacilityExtNoQlfr;
    }

    @JsonProperty("per05_labFacilityExtNoQlfr")
    public void setPer05LabFacilityExtNoQlfr(String per05LabFacilityExtNoQlfr) {
        this.per05LabFacilityExtNoQlfr = per05LabFacilityExtNoQlfr;
    }

    public SvcFacilityLocation withPer05LabFacilityExtNoQlfr(String per05LabFacilityExtNoQlfr) {
        this.per05LabFacilityExtNoQlfr = per05LabFacilityExtNoQlfr;
        return this;
    }

    @JsonProperty("per06_labFacilityExtNo")
    public String getPer06LabFacilityExtNo() {
        return per06LabFacilityExtNo;
    }

    @JsonProperty("per06_labFacilityExtNo")
    public void setPer06LabFacilityExtNo(String per06LabFacilityExtNo) {
        this.per06LabFacilityExtNo = per06LabFacilityExtNo;
    }

    public SvcFacilityLocation withPer06LabFacilityExtNo(String per06LabFacilityExtNo) {
        this.per06LabFacilityExtNo = per06LabFacilityExtNo;
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

    public SvcFacilityLocation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101LabFacilityNameIdentifierCode).append(nm102LabFacilityTypeQlfr).append(nm103LabFacilityName).append(nm108LabFacilityCodeQlfr).append(nm109LabFacilityIdentifier).append(n301LabFacilityAddressLine1).append(n302LabFacilityAddressLine2).append(n401LabFacilityCity).append(n402LabFacilityStateCode).append(n403LabFacilityZipCode).append(n404LabFacilityCountryCode).append(n407LabFacilityCountrySubdivisionCode).append(refServiceFacilityLocation).append(per01LabFacilityFunctionCode).append(per02LabFacilityContactName).append(per03LabFacilityTelephoneNoQlfr).append(per04LabFacilityTelephoneNo).append(per05LabFacilityExtNoQlfr).append(per06LabFacilityExtNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SvcFacilityLocation) == false) {
            return false;
        }
        SvcFacilityLocation rhs = ((SvcFacilityLocation) other);
        return new EqualsBuilder().append(nm101LabFacilityNameIdentifierCode, rhs.nm101LabFacilityNameIdentifierCode).append(nm102LabFacilityTypeQlfr, rhs.nm102LabFacilityTypeQlfr).append(nm103LabFacilityName, rhs.nm103LabFacilityName).append(nm108LabFacilityCodeQlfr, rhs.nm108LabFacilityCodeQlfr).append(nm109LabFacilityIdentifier, rhs.nm109LabFacilityIdentifier).append(n301LabFacilityAddressLine1, rhs.n301LabFacilityAddressLine1).append(n302LabFacilityAddressLine2, rhs.n302LabFacilityAddressLine2).append(n401LabFacilityCity, rhs.n401LabFacilityCity).append(n402LabFacilityStateCode, rhs.n402LabFacilityStateCode).append(n403LabFacilityZipCode, rhs.n403LabFacilityZipCode).append(n404LabFacilityCountryCode, rhs.n404LabFacilityCountryCode).append(n407LabFacilityCountrySubdivisionCode, rhs.n407LabFacilityCountrySubdivisionCode).append(refServiceFacilityLocation, rhs.refServiceFacilityLocation).append(per01LabFacilityFunctionCode, rhs.per01LabFacilityFunctionCode).append(per02LabFacilityContactName, rhs.per02LabFacilityContactName).append(per03LabFacilityTelephoneNoQlfr, rhs.per03LabFacilityTelephoneNoQlfr).append(per04LabFacilityTelephoneNo, rhs.per04LabFacilityTelephoneNo).append(per05LabFacilityExtNoQlfr, rhs.per05LabFacilityExtNoQlfr).append(per06LabFacilityExtNo, rhs.per06LabFacilityExtNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

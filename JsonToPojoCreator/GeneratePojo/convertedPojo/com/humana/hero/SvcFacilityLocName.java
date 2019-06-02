
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
    "nm101_serviceFacilityIdentityCode",
    "nm102_serviceFacilityTypeQlfr",
    "nm103_serviceFacilityName",
    "nm108_serviceFacilityIdentificationCodeQlfr",
    "nm109_serviceFacilityIdentificationCode",
    "n301_serviceFacilityAddressLine1",
    "n302_serviceFacilityAddressLine2",
    "n401_serviceFacilityCity",
    "n402_serviceFacilityStateCode",
    "n403_serviceFacilityZipCode",
    "n404_serviceFacilityCountryCode",
    "n407_serviceFacilityCountrySubdivisionCode",
    "ref_serviceFacilityLocationSecondaryIdentification"
})
public class SvcFacilityLocName {

    @JsonProperty("nm101_serviceFacilityIdentityCode")
    private String nm101ServiceFacilityIdentityCode;
    @JsonProperty("nm102_serviceFacilityTypeQlfr")
    private String nm102ServiceFacilityTypeQlfr;
    @JsonProperty("nm103_serviceFacilityName")
    private String nm103ServiceFacilityName;
    @JsonProperty("nm108_serviceFacilityIdentificationCodeQlfr")
    private String nm108ServiceFacilityIdentificationCodeQlfr;
    @JsonProperty("nm109_serviceFacilityIdentificationCode")
    private String nm109ServiceFacilityIdentificationCode;
    @JsonProperty("n301_serviceFacilityAddressLine1")
    private String n301ServiceFacilityAddressLine1;
    @JsonProperty("n302_serviceFacilityAddressLine2")
    private String n302ServiceFacilityAddressLine2;
    @JsonProperty("n401_serviceFacilityCity")
    private String n401ServiceFacilityCity;
    @JsonProperty("n402_serviceFacilityStateCode")
    private String n402ServiceFacilityStateCode;
    @JsonProperty("n403_serviceFacilityZipCode")
    private String n403ServiceFacilityZipCode;
    @JsonProperty("n404_serviceFacilityCountryCode")
    private String n404ServiceFacilityCountryCode;
    @JsonProperty("n407_serviceFacilityCountrySubdivisionCode")
    private String n407ServiceFacilityCountrySubdivisionCode;
    @JsonProperty("ref_serviceFacilityLocationSecondaryIdentification")
    private List<RefServiceFacilityLocationSecondaryIdentification> refServiceFacilityLocationSecondaryIdentification = new ArrayList<RefServiceFacilityLocationSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_serviceFacilityIdentityCode")
    public String getNm101ServiceFacilityIdentityCode() {
        return nm101ServiceFacilityIdentityCode;
    }

    @JsonProperty("nm101_serviceFacilityIdentityCode")
    public void setNm101ServiceFacilityIdentityCode(String nm101ServiceFacilityIdentityCode) {
        this.nm101ServiceFacilityIdentityCode = nm101ServiceFacilityIdentityCode;
    }

    public SvcFacilityLocName withNm101ServiceFacilityIdentityCode(String nm101ServiceFacilityIdentityCode) {
        this.nm101ServiceFacilityIdentityCode = nm101ServiceFacilityIdentityCode;
        return this;
    }

    @JsonProperty("nm102_serviceFacilityTypeQlfr")
    public String getNm102ServiceFacilityTypeQlfr() {
        return nm102ServiceFacilityTypeQlfr;
    }

    @JsonProperty("nm102_serviceFacilityTypeQlfr")
    public void setNm102ServiceFacilityTypeQlfr(String nm102ServiceFacilityTypeQlfr) {
        this.nm102ServiceFacilityTypeQlfr = nm102ServiceFacilityTypeQlfr;
    }

    public SvcFacilityLocName withNm102ServiceFacilityTypeQlfr(String nm102ServiceFacilityTypeQlfr) {
        this.nm102ServiceFacilityTypeQlfr = nm102ServiceFacilityTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_serviceFacilityName")
    public String getNm103ServiceFacilityName() {
        return nm103ServiceFacilityName;
    }

    @JsonProperty("nm103_serviceFacilityName")
    public void setNm103ServiceFacilityName(String nm103ServiceFacilityName) {
        this.nm103ServiceFacilityName = nm103ServiceFacilityName;
    }

    public SvcFacilityLocName withNm103ServiceFacilityName(String nm103ServiceFacilityName) {
        this.nm103ServiceFacilityName = nm103ServiceFacilityName;
        return this;
    }

    @JsonProperty("nm108_serviceFacilityIdentificationCodeQlfr")
    public String getNm108ServiceFacilityIdentificationCodeQlfr() {
        return nm108ServiceFacilityIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_serviceFacilityIdentificationCodeQlfr")
    public void setNm108ServiceFacilityIdentificationCodeQlfr(String nm108ServiceFacilityIdentificationCodeQlfr) {
        this.nm108ServiceFacilityIdentificationCodeQlfr = nm108ServiceFacilityIdentificationCodeQlfr;
    }

    public SvcFacilityLocName withNm108ServiceFacilityIdentificationCodeQlfr(String nm108ServiceFacilityIdentificationCodeQlfr) {
        this.nm108ServiceFacilityIdentificationCodeQlfr = nm108ServiceFacilityIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_serviceFacilityIdentificationCode")
    public String getNm109ServiceFacilityIdentificationCode() {
        return nm109ServiceFacilityIdentificationCode;
    }

    @JsonProperty("nm109_serviceFacilityIdentificationCode")
    public void setNm109ServiceFacilityIdentificationCode(String nm109ServiceFacilityIdentificationCode) {
        this.nm109ServiceFacilityIdentificationCode = nm109ServiceFacilityIdentificationCode;
    }

    public SvcFacilityLocName withNm109ServiceFacilityIdentificationCode(String nm109ServiceFacilityIdentificationCode) {
        this.nm109ServiceFacilityIdentificationCode = nm109ServiceFacilityIdentificationCode;
        return this;
    }

    @JsonProperty("n301_serviceFacilityAddressLine1")
    public String getN301ServiceFacilityAddressLine1() {
        return n301ServiceFacilityAddressLine1;
    }

    @JsonProperty("n301_serviceFacilityAddressLine1")
    public void setN301ServiceFacilityAddressLine1(String n301ServiceFacilityAddressLine1) {
        this.n301ServiceFacilityAddressLine1 = n301ServiceFacilityAddressLine1;
    }

    public SvcFacilityLocName withN301ServiceFacilityAddressLine1(String n301ServiceFacilityAddressLine1) {
        this.n301ServiceFacilityAddressLine1 = n301ServiceFacilityAddressLine1;
        return this;
    }

    @JsonProperty("n302_serviceFacilityAddressLine2")
    public String getN302ServiceFacilityAddressLine2() {
        return n302ServiceFacilityAddressLine2;
    }

    @JsonProperty("n302_serviceFacilityAddressLine2")
    public void setN302ServiceFacilityAddressLine2(String n302ServiceFacilityAddressLine2) {
        this.n302ServiceFacilityAddressLine2 = n302ServiceFacilityAddressLine2;
    }

    public SvcFacilityLocName withN302ServiceFacilityAddressLine2(String n302ServiceFacilityAddressLine2) {
        this.n302ServiceFacilityAddressLine2 = n302ServiceFacilityAddressLine2;
        return this;
    }

    @JsonProperty("n401_serviceFacilityCity")
    public String getN401ServiceFacilityCity() {
        return n401ServiceFacilityCity;
    }

    @JsonProperty("n401_serviceFacilityCity")
    public void setN401ServiceFacilityCity(String n401ServiceFacilityCity) {
        this.n401ServiceFacilityCity = n401ServiceFacilityCity;
    }

    public SvcFacilityLocName withN401ServiceFacilityCity(String n401ServiceFacilityCity) {
        this.n401ServiceFacilityCity = n401ServiceFacilityCity;
        return this;
    }

    @JsonProperty("n402_serviceFacilityStateCode")
    public String getN402ServiceFacilityStateCode() {
        return n402ServiceFacilityStateCode;
    }

    @JsonProperty("n402_serviceFacilityStateCode")
    public void setN402ServiceFacilityStateCode(String n402ServiceFacilityStateCode) {
        this.n402ServiceFacilityStateCode = n402ServiceFacilityStateCode;
    }

    public SvcFacilityLocName withN402ServiceFacilityStateCode(String n402ServiceFacilityStateCode) {
        this.n402ServiceFacilityStateCode = n402ServiceFacilityStateCode;
        return this;
    }

    @JsonProperty("n403_serviceFacilityZipCode")
    public String getN403ServiceFacilityZipCode() {
        return n403ServiceFacilityZipCode;
    }

    @JsonProperty("n403_serviceFacilityZipCode")
    public void setN403ServiceFacilityZipCode(String n403ServiceFacilityZipCode) {
        this.n403ServiceFacilityZipCode = n403ServiceFacilityZipCode;
    }

    public SvcFacilityLocName withN403ServiceFacilityZipCode(String n403ServiceFacilityZipCode) {
        this.n403ServiceFacilityZipCode = n403ServiceFacilityZipCode;
        return this;
    }

    @JsonProperty("n404_serviceFacilityCountryCode")
    public String getN404ServiceFacilityCountryCode() {
        return n404ServiceFacilityCountryCode;
    }

    @JsonProperty("n404_serviceFacilityCountryCode")
    public void setN404ServiceFacilityCountryCode(String n404ServiceFacilityCountryCode) {
        this.n404ServiceFacilityCountryCode = n404ServiceFacilityCountryCode;
    }

    public SvcFacilityLocName withN404ServiceFacilityCountryCode(String n404ServiceFacilityCountryCode) {
        this.n404ServiceFacilityCountryCode = n404ServiceFacilityCountryCode;
        return this;
    }

    @JsonProperty("n407_serviceFacilityCountrySubdivisionCode")
    public String getN407ServiceFacilityCountrySubdivisionCode() {
        return n407ServiceFacilityCountrySubdivisionCode;
    }

    @JsonProperty("n407_serviceFacilityCountrySubdivisionCode")
    public void setN407ServiceFacilityCountrySubdivisionCode(String n407ServiceFacilityCountrySubdivisionCode) {
        this.n407ServiceFacilityCountrySubdivisionCode = n407ServiceFacilityCountrySubdivisionCode;
    }

    public SvcFacilityLocName withN407ServiceFacilityCountrySubdivisionCode(String n407ServiceFacilityCountrySubdivisionCode) {
        this.n407ServiceFacilityCountrySubdivisionCode = n407ServiceFacilityCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("ref_serviceFacilityLocationSecondaryIdentification")
    public List<RefServiceFacilityLocationSecondaryIdentification> getRefServiceFacilityLocationSecondaryIdentification() {
        return refServiceFacilityLocationSecondaryIdentification;
    }

    @JsonProperty("ref_serviceFacilityLocationSecondaryIdentification")
    public void setRefServiceFacilityLocationSecondaryIdentification(List<RefServiceFacilityLocationSecondaryIdentification> refServiceFacilityLocationSecondaryIdentification) {
        this.refServiceFacilityLocationSecondaryIdentification = refServiceFacilityLocationSecondaryIdentification;
    }

    public SvcFacilityLocName withRefServiceFacilityLocationSecondaryIdentification(List<RefServiceFacilityLocationSecondaryIdentification> refServiceFacilityLocationSecondaryIdentification) {
        this.refServiceFacilityLocationSecondaryIdentification = refServiceFacilityLocationSecondaryIdentification;
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

    public SvcFacilityLocName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101ServiceFacilityIdentityCode).append(nm102ServiceFacilityTypeQlfr).append(nm103ServiceFacilityName).append(nm108ServiceFacilityIdentificationCodeQlfr).append(nm109ServiceFacilityIdentificationCode).append(n301ServiceFacilityAddressLine1).append(n302ServiceFacilityAddressLine2).append(n401ServiceFacilityCity).append(n402ServiceFacilityStateCode).append(n403ServiceFacilityZipCode).append(n404ServiceFacilityCountryCode).append(n407ServiceFacilityCountrySubdivisionCode).append(refServiceFacilityLocationSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SvcFacilityLocName) == false) {
            return false;
        }
        SvcFacilityLocName rhs = ((SvcFacilityLocName) other);
        return new EqualsBuilder().append(nm101ServiceFacilityIdentityCode, rhs.nm101ServiceFacilityIdentityCode).append(nm102ServiceFacilityTypeQlfr, rhs.nm102ServiceFacilityTypeQlfr).append(nm103ServiceFacilityName, rhs.nm103ServiceFacilityName).append(nm108ServiceFacilityIdentificationCodeQlfr, rhs.nm108ServiceFacilityIdentificationCodeQlfr).append(nm109ServiceFacilityIdentificationCode, rhs.nm109ServiceFacilityIdentificationCode).append(n301ServiceFacilityAddressLine1, rhs.n301ServiceFacilityAddressLine1).append(n302ServiceFacilityAddressLine2, rhs.n302ServiceFacilityAddressLine2).append(n401ServiceFacilityCity, rhs.n401ServiceFacilityCity).append(n402ServiceFacilityStateCode, rhs.n402ServiceFacilityStateCode).append(n403ServiceFacilityZipCode, rhs.n403ServiceFacilityZipCode).append(n404ServiceFacilityCountryCode, rhs.n404ServiceFacilityCountryCode).append(n407ServiceFacilityCountrySubdivisionCode, rhs.n407ServiceFacilityCountrySubdivisionCode).append(refServiceFacilityLocationSecondaryIdentification, rhs.refServiceFacilityLocationSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

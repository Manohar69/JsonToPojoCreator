
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
    "nm101_payToPlanCode",
    "nm102_payToPlanCodeQlfr",
    "nm103_payToPlanLastOrOrganizationName",
    "nm108_payToPlanIdentificationCodeQlfr",
    "nm109_payToPlanPrimaryIdenfier",
    "n301_payToPlanAddressLine1",
    "n302_payToPlanAddressLine2",
    "n401_payToPlanCity",
    "n402_payToPlanStateCode",
    "n403_payToPlanZipCode",
    "n404_payToPlanCountryCode",
    "n407_payToPlanCountrySubdivisionCode",
    "ref01_payToPlanSecondaryIdentificationQlfr",
    "ref02_payToPlanSecondaryIdentifier",
    "ref01_payToPlanTaxIdentificationQlfr",
    "ref02_payToPlanTaxIdentificationNo"
})
public class PayToPlanName {

    @JsonProperty("nm101_payToPlanCode")
    private String nm101PayToPlanCode;
    @JsonProperty("nm102_payToPlanCodeQlfr")
    private String nm102PayToPlanCodeQlfr;
    @JsonProperty("nm103_payToPlanLastOrOrganizationName")
    private String nm103PayToPlanLastOrOrganizationName;
    @JsonProperty("nm108_payToPlanIdentificationCodeQlfr")
    private String nm108PayToPlanIdentificationCodeQlfr;
    @JsonProperty("nm109_payToPlanPrimaryIdenfier")
    private String nm109PayToPlanPrimaryIdenfier;
    @JsonProperty("n301_payToPlanAddressLine1")
    private String n301PayToPlanAddressLine1;
    @JsonProperty("n302_payToPlanAddressLine2")
    private String n302PayToPlanAddressLine2;
    @JsonProperty("n401_payToPlanCity")
    private String n401PayToPlanCity;
    @JsonProperty("n402_payToPlanStateCode")
    private String n402PayToPlanStateCode;
    @JsonProperty("n403_payToPlanZipCode")
    private String n403PayToPlanZipCode;
    @JsonProperty("n404_payToPlanCountryCode")
    private String n404PayToPlanCountryCode;
    @JsonProperty("n407_payToPlanCountrySubdivisionCode")
    private String n407PayToPlanCountrySubdivisionCode;
    @JsonProperty("ref01_payToPlanSecondaryIdentificationQlfr")
    private String ref01PayToPlanSecondaryIdentificationQlfr;
    @JsonProperty("ref02_payToPlanSecondaryIdentifier")
    private String ref02PayToPlanSecondaryIdentifier;
    @JsonProperty("ref01_payToPlanTaxIdentificationQlfr")
    private String ref01PayToPlanTaxIdentificationQlfr;
    @JsonProperty("ref02_payToPlanTaxIdentificationNo")
    private String ref02PayToPlanTaxIdentificationNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_payToPlanCode")
    public String getNm101PayToPlanCode() {
        return nm101PayToPlanCode;
    }

    @JsonProperty("nm101_payToPlanCode")
    public void setNm101PayToPlanCode(String nm101PayToPlanCode) {
        this.nm101PayToPlanCode = nm101PayToPlanCode;
    }

    public PayToPlanName withNm101PayToPlanCode(String nm101PayToPlanCode) {
        this.nm101PayToPlanCode = nm101PayToPlanCode;
        return this;
    }

    @JsonProperty("nm102_payToPlanCodeQlfr")
    public String getNm102PayToPlanCodeQlfr() {
        return nm102PayToPlanCodeQlfr;
    }

    @JsonProperty("nm102_payToPlanCodeQlfr")
    public void setNm102PayToPlanCodeQlfr(String nm102PayToPlanCodeQlfr) {
        this.nm102PayToPlanCodeQlfr = nm102PayToPlanCodeQlfr;
    }

    public PayToPlanName withNm102PayToPlanCodeQlfr(String nm102PayToPlanCodeQlfr) {
        this.nm102PayToPlanCodeQlfr = nm102PayToPlanCodeQlfr;
        return this;
    }

    @JsonProperty("nm103_payToPlanLastOrOrganizationName")
    public String getNm103PayToPlanLastOrOrganizationName() {
        return nm103PayToPlanLastOrOrganizationName;
    }

    @JsonProperty("nm103_payToPlanLastOrOrganizationName")
    public void setNm103PayToPlanLastOrOrganizationName(String nm103PayToPlanLastOrOrganizationName) {
        this.nm103PayToPlanLastOrOrganizationName = nm103PayToPlanLastOrOrganizationName;
    }

    public PayToPlanName withNm103PayToPlanLastOrOrganizationName(String nm103PayToPlanLastOrOrganizationName) {
        this.nm103PayToPlanLastOrOrganizationName = nm103PayToPlanLastOrOrganizationName;
        return this;
    }

    @JsonProperty("nm108_payToPlanIdentificationCodeQlfr")
    public String getNm108PayToPlanIdentificationCodeQlfr() {
        return nm108PayToPlanIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_payToPlanIdentificationCodeQlfr")
    public void setNm108PayToPlanIdentificationCodeQlfr(String nm108PayToPlanIdentificationCodeQlfr) {
        this.nm108PayToPlanIdentificationCodeQlfr = nm108PayToPlanIdentificationCodeQlfr;
    }

    public PayToPlanName withNm108PayToPlanIdentificationCodeQlfr(String nm108PayToPlanIdentificationCodeQlfr) {
        this.nm108PayToPlanIdentificationCodeQlfr = nm108PayToPlanIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_payToPlanPrimaryIdenfier")
    public String getNm109PayToPlanPrimaryIdenfier() {
        return nm109PayToPlanPrimaryIdenfier;
    }

    @JsonProperty("nm109_payToPlanPrimaryIdenfier")
    public void setNm109PayToPlanPrimaryIdenfier(String nm109PayToPlanPrimaryIdenfier) {
        this.nm109PayToPlanPrimaryIdenfier = nm109PayToPlanPrimaryIdenfier;
    }

    public PayToPlanName withNm109PayToPlanPrimaryIdenfier(String nm109PayToPlanPrimaryIdenfier) {
        this.nm109PayToPlanPrimaryIdenfier = nm109PayToPlanPrimaryIdenfier;
        return this;
    }

    @JsonProperty("n301_payToPlanAddressLine1")
    public String getN301PayToPlanAddressLine1() {
        return n301PayToPlanAddressLine1;
    }

    @JsonProperty("n301_payToPlanAddressLine1")
    public void setN301PayToPlanAddressLine1(String n301PayToPlanAddressLine1) {
        this.n301PayToPlanAddressLine1 = n301PayToPlanAddressLine1;
    }

    public PayToPlanName withN301PayToPlanAddressLine1(String n301PayToPlanAddressLine1) {
        this.n301PayToPlanAddressLine1 = n301PayToPlanAddressLine1;
        return this;
    }

    @JsonProperty("n302_payToPlanAddressLine2")
    public String getN302PayToPlanAddressLine2() {
        return n302PayToPlanAddressLine2;
    }

    @JsonProperty("n302_payToPlanAddressLine2")
    public void setN302PayToPlanAddressLine2(String n302PayToPlanAddressLine2) {
        this.n302PayToPlanAddressLine2 = n302PayToPlanAddressLine2;
    }

    public PayToPlanName withN302PayToPlanAddressLine2(String n302PayToPlanAddressLine2) {
        this.n302PayToPlanAddressLine2 = n302PayToPlanAddressLine2;
        return this;
    }

    @JsonProperty("n401_payToPlanCity")
    public String getN401PayToPlanCity() {
        return n401PayToPlanCity;
    }

    @JsonProperty("n401_payToPlanCity")
    public void setN401PayToPlanCity(String n401PayToPlanCity) {
        this.n401PayToPlanCity = n401PayToPlanCity;
    }

    public PayToPlanName withN401PayToPlanCity(String n401PayToPlanCity) {
        this.n401PayToPlanCity = n401PayToPlanCity;
        return this;
    }

    @JsonProperty("n402_payToPlanStateCode")
    public String getN402PayToPlanStateCode() {
        return n402PayToPlanStateCode;
    }

    @JsonProperty("n402_payToPlanStateCode")
    public void setN402PayToPlanStateCode(String n402PayToPlanStateCode) {
        this.n402PayToPlanStateCode = n402PayToPlanStateCode;
    }

    public PayToPlanName withN402PayToPlanStateCode(String n402PayToPlanStateCode) {
        this.n402PayToPlanStateCode = n402PayToPlanStateCode;
        return this;
    }

    @JsonProperty("n403_payToPlanZipCode")
    public String getN403PayToPlanZipCode() {
        return n403PayToPlanZipCode;
    }

    @JsonProperty("n403_payToPlanZipCode")
    public void setN403PayToPlanZipCode(String n403PayToPlanZipCode) {
        this.n403PayToPlanZipCode = n403PayToPlanZipCode;
    }

    public PayToPlanName withN403PayToPlanZipCode(String n403PayToPlanZipCode) {
        this.n403PayToPlanZipCode = n403PayToPlanZipCode;
        return this;
    }

    @JsonProperty("n404_payToPlanCountryCode")
    public String getN404PayToPlanCountryCode() {
        return n404PayToPlanCountryCode;
    }

    @JsonProperty("n404_payToPlanCountryCode")
    public void setN404PayToPlanCountryCode(String n404PayToPlanCountryCode) {
        this.n404PayToPlanCountryCode = n404PayToPlanCountryCode;
    }

    public PayToPlanName withN404PayToPlanCountryCode(String n404PayToPlanCountryCode) {
        this.n404PayToPlanCountryCode = n404PayToPlanCountryCode;
        return this;
    }

    @JsonProperty("n407_payToPlanCountrySubdivisionCode")
    public String getN407PayToPlanCountrySubdivisionCode() {
        return n407PayToPlanCountrySubdivisionCode;
    }

    @JsonProperty("n407_payToPlanCountrySubdivisionCode")
    public void setN407PayToPlanCountrySubdivisionCode(String n407PayToPlanCountrySubdivisionCode) {
        this.n407PayToPlanCountrySubdivisionCode = n407PayToPlanCountrySubdivisionCode;
    }

    public PayToPlanName withN407PayToPlanCountrySubdivisionCode(String n407PayToPlanCountrySubdivisionCode) {
        this.n407PayToPlanCountrySubdivisionCode = n407PayToPlanCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("ref01_payToPlanSecondaryIdentificationQlfr")
    public String getRef01PayToPlanSecondaryIdentificationQlfr() {
        return ref01PayToPlanSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_payToPlanSecondaryIdentificationQlfr")
    public void setRef01PayToPlanSecondaryIdentificationQlfr(String ref01PayToPlanSecondaryIdentificationQlfr) {
        this.ref01PayToPlanSecondaryIdentificationQlfr = ref01PayToPlanSecondaryIdentificationQlfr;
    }

    public PayToPlanName withRef01PayToPlanSecondaryIdentificationQlfr(String ref01PayToPlanSecondaryIdentificationQlfr) {
        this.ref01PayToPlanSecondaryIdentificationQlfr = ref01PayToPlanSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_payToPlanSecondaryIdentifier")
    public String getRef02PayToPlanSecondaryIdentifier() {
        return ref02PayToPlanSecondaryIdentifier;
    }

    @JsonProperty("ref02_payToPlanSecondaryIdentifier")
    public void setRef02PayToPlanSecondaryIdentifier(String ref02PayToPlanSecondaryIdentifier) {
        this.ref02PayToPlanSecondaryIdentifier = ref02PayToPlanSecondaryIdentifier;
    }

    public PayToPlanName withRef02PayToPlanSecondaryIdentifier(String ref02PayToPlanSecondaryIdentifier) {
        this.ref02PayToPlanSecondaryIdentifier = ref02PayToPlanSecondaryIdentifier;
        return this;
    }

    @JsonProperty("ref01_payToPlanTaxIdentificationQlfr")
    public String getRef01PayToPlanTaxIdentificationQlfr() {
        return ref01PayToPlanTaxIdentificationQlfr;
    }

    @JsonProperty("ref01_payToPlanTaxIdentificationQlfr")
    public void setRef01PayToPlanTaxIdentificationQlfr(String ref01PayToPlanTaxIdentificationQlfr) {
        this.ref01PayToPlanTaxIdentificationQlfr = ref01PayToPlanTaxIdentificationQlfr;
    }

    public PayToPlanName withRef01PayToPlanTaxIdentificationQlfr(String ref01PayToPlanTaxIdentificationQlfr) {
        this.ref01PayToPlanTaxIdentificationQlfr = ref01PayToPlanTaxIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_payToPlanTaxIdentificationNo")
    public String getRef02PayToPlanTaxIdentificationNo() {
        return ref02PayToPlanTaxIdentificationNo;
    }

    @JsonProperty("ref02_payToPlanTaxIdentificationNo")
    public void setRef02PayToPlanTaxIdentificationNo(String ref02PayToPlanTaxIdentificationNo) {
        this.ref02PayToPlanTaxIdentificationNo = ref02PayToPlanTaxIdentificationNo;
    }

    public PayToPlanName withRef02PayToPlanTaxIdentificationNo(String ref02PayToPlanTaxIdentificationNo) {
        this.ref02PayToPlanTaxIdentificationNo = ref02PayToPlanTaxIdentificationNo;
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

    public PayToPlanName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101PayToPlanCode).append(nm102PayToPlanCodeQlfr).append(nm103PayToPlanLastOrOrganizationName).append(nm108PayToPlanIdentificationCodeQlfr).append(nm109PayToPlanPrimaryIdenfier).append(n301PayToPlanAddressLine1).append(n302PayToPlanAddressLine2).append(n401PayToPlanCity).append(n402PayToPlanStateCode).append(n403PayToPlanZipCode).append(n404PayToPlanCountryCode).append(n407PayToPlanCountrySubdivisionCode).append(ref01PayToPlanSecondaryIdentificationQlfr).append(ref02PayToPlanSecondaryIdentifier).append(ref01PayToPlanTaxIdentificationQlfr).append(ref02PayToPlanTaxIdentificationNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayToPlanName) == false) {
            return false;
        }
        PayToPlanName rhs = ((PayToPlanName) other);
        return new EqualsBuilder().append(nm101PayToPlanCode, rhs.nm101PayToPlanCode).append(nm102PayToPlanCodeQlfr, rhs.nm102PayToPlanCodeQlfr).append(nm103PayToPlanLastOrOrganizationName, rhs.nm103PayToPlanLastOrOrganizationName).append(nm108PayToPlanIdentificationCodeQlfr, rhs.nm108PayToPlanIdentificationCodeQlfr).append(nm109PayToPlanPrimaryIdenfier, rhs.nm109PayToPlanPrimaryIdenfier).append(n301PayToPlanAddressLine1, rhs.n301PayToPlanAddressLine1).append(n302PayToPlanAddressLine2, rhs.n302PayToPlanAddressLine2).append(n401PayToPlanCity, rhs.n401PayToPlanCity).append(n402PayToPlanStateCode, rhs.n402PayToPlanStateCode).append(n403PayToPlanZipCode, rhs.n403PayToPlanZipCode).append(n404PayToPlanCountryCode, rhs.n404PayToPlanCountryCode).append(n407PayToPlanCountrySubdivisionCode, rhs.n407PayToPlanCountrySubdivisionCode).append(ref01PayToPlanSecondaryIdentificationQlfr, rhs.ref01PayToPlanSecondaryIdentificationQlfr).append(ref02PayToPlanSecondaryIdentifier, rhs.ref02PayToPlanSecondaryIdentifier).append(ref01PayToPlanTaxIdentificationQlfr, rhs.ref01PayToPlanTaxIdentificationQlfr).append(ref02PayToPlanTaxIdentificationNo, rhs.ref02PayToPlanTaxIdentificationNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

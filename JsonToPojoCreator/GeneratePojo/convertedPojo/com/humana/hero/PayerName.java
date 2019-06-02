
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
    "nm101_payerCode",
    "nm102_payerTypeQlfr",
    "nm103_payerLastOrOrganizatioName",
    "nm108_payerIdentificationCodeQlfr",
    "nm109_payerIdentificationCode",
    "n301_payerAddressLine1",
    "n302_payerAddressLine2",
    "n401_payerCity",
    "n402_payerStateCode",
    "n403_payerZipCode",
    "n404_payerCountryCode",
    "n407_payerCountrySubdivisionCode",
    "ref_payerSecondaryIdentification",
    "ref_billingProviderSecondaryIdentification"
})
public class PayerName {

    @JsonProperty("nm101_payerCode")
    private String nm101PayerCode;
    @JsonProperty("nm102_payerTypeQlfr")
    private String nm102PayerTypeQlfr;
    @JsonProperty("nm103_payerLastOrOrganizatioName")
    private String nm103PayerLastOrOrganizatioName;
    @JsonProperty("nm108_payerIdentificationCodeQlfr")
    private String nm108PayerIdentificationCodeQlfr;
    @JsonProperty("nm109_payerIdentificationCode")
    private String nm109PayerIdentificationCode;
    @JsonProperty("n301_payerAddressLine1")
    private String n301PayerAddressLine1;
    @JsonProperty("n302_payerAddressLine2")
    private String n302PayerAddressLine2;
    @JsonProperty("n401_payerCity")
    private String n401PayerCity;
    @JsonProperty("n402_payerStateCode")
    private String n402PayerStateCode;
    @JsonProperty("n403_payerZipCode")
    private String n403PayerZipCode;
    @JsonProperty("n404_payerCountryCode")
    private String n404PayerCountryCode;
    @JsonProperty("n407_payerCountrySubdivisionCode")
    private String n407PayerCountrySubdivisionCode;
    @JsonProperty("ref_payerSecondaryIdentification")
    private List<RefPayerSecondaryIdentification> refPayerSecondaryIdentification = new ArrayList<RefPayerSecondaryIdentification>();
    @JsonProperty("ref_billingProviderSecondaryIdentification")
    private List<RefBillingProviderSecondaryIdentification> refBillingProviderSecondaryIdentification = new ArrayList<RefBillingProviderSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_payerCode")
    public String getNm101PayerCode() {
        return nm101PayerCode;
    }

    @JsonProperty("nm101_payerCode")
    public void setNm101PayerCode(String nm101PayerCode) {
        this.nm101PayerCode = nm101PayerCode;
    }

    public PayerName withNm101PayerCode(String nm101PayerCode) {
        this.nm101PayerCode = nm101PayerCode;
        return this;
    }

    @JsonProperty("nm102_payerTypeQlfr")
    public String getNm102PayerTypeQlfr() {
        return nm102PayerTypeQlfr;
    }

    @JsonProperty("nm102_payerTypeQlfr")
    public void setNm102PayerTypeQlfr(String nm102PayerTypeQlfr) {
        this.nm102PayerTypeQlfr = nm102PayerTypeQlfr;
    }

    public PayerName withNm102PayerTypeQlfr(String nm102PayerTypeQlfr) {
        this.nm102PayerTypeQlfr = nm102PayerTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_payerLastOrOrganizatioName")
    public String getNm103PayerLastOrOrganizatioName() {
        return nm103PayerLastOrOrganizatioName;
    }

    @JsonProperty("nm103_payerLastOrOrganizatioName")
    public void setNm103PayerLastOrOrganizatioName(String nm103PayerLastOrOrganizatioName) {
        this.nm103PayerLastOrOrganizatioName = nm103PayerLastOrOrganizatioName;
    }

    public PayerName withNm103PayerLastOrOrganizatioName(String nm103PayerLastOrOrganizatioName) {
        this.nm103PayerLastOrOrganizatioName = nm103PayerLastOrOrganizatioName;
        return this;
    }

    @JsonProperty("nm108_payerIdentificationCodeQlfr")
    public String getNm108PayerIdentificationCodeQlfr() {
        return nm108PayerIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_payerIdentificationCodeQlfr")
    public void setNm108PayerIdentificationCodeQlfr(String nm108PayerIdentificationCodeQlfr) {
        this.nm108PayerIdentificationCodeQlfr = nm108PayerIdentificationCodeQlfr;
    }

    public PayerName withNm108PayerIdentificationCodeQlfr(String nm108PayerIdentificationCodeQlfr) {
        this.nm108PayerIdentificationCodeQlfr = nm108PayerIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_payerIdentificationCode")
    public String getNm109PayerIdentificationCode() {
        return nm109PayerIdentificationCode;
    }

    @JsonProperty("nm109_payerIdentificationCode")
    public void setNm109PayerIdentificationCode(String nm109PayerIdentificationCode) {
        this.nm109PayerIdentificationCode = nm109PayerIdentificationCode;
    }

    public PayerName withNm109PayerIdentificationCode(String nm109PayerIdentificationCode) {
        this.nm109PayerIdentificationCode = nm109PayerIdentificationCode;
        return this;
    }

    @JsonProperty("n301_payerAddressLine1")
    public String getN301PayerAddressLine1() {
        return n301PayerAddressLine1;
    }

    @JsonProperty("n301_payerAddressLine1")
    public void setN301PayerAddressLine1(String n301PayerAddressLine1) {
        this.n301PayerAddressLine1 = n301PayerAddressLine1;
    }

    public PayerName withN301PayerAddressLine1(String n301PayerAddressLine1) {
        this.n301PayerAddressLine1 = n301PayerAddressLine1;
        return this;
    }

    @JsonProperty("n302_payerAddressLine2")
    public String getN302PayerAddressLine2() {
        return n302PayerAddressLine2;
    }

    @JsonProperty("n302_payerAddressLine2")
    public void setN302PayerAddressLine2(String n302PayerAddressLine2) {
        this.n302PayerAddressLine2 = n302PayerAddressLine2;
    }

    public PayerName withN302PayerAddressLine2(String n302PayerAddressLine2) {
        this.n302PayerAddressLine2 = n302PayerAddressLine2;
        return this;
    }

    @JsonProperty("n401_payerCity")
    public String getN401PayerCity() {
        return n401PayerCity;
    }

    @JsonProperty("n401_payerCity")
    public void setN401PayerCity(String n401PayerCity) {
        this.n401PayerCity = n401PayerCity;
    }

    public PayerName withN401PayerCity(String n401PayerCity) {
        this.n401PayerCity = n401PayerCity;
        return this;
    }

    @JsonProperty("n402_payerStateCode")
    public String getN402PayerStateCode() {
        return n402PayerStateCode;
    }

    @JsonProperty("n402_payerStateCode")
    public void setN402PayerStateCode(String n402PayerStateCode) {
        this.n402PayerStateCode = n402PayerStateCode;
    }

    public PayerName withN402PayerStateCode(String n402PayerStateCode) {
        this.n402PayerStateCode = n402PayerStateCode;
        return this;
    }

    @JsonProperty("n403_payerZipCode")
    public String getN403PayerZipCode() {
        return n403PayerZipCode;
    }

    @JsonProperty("n403_payerZipCode")
    public void setN403PayerZipCode(String n403PayerZipCode) {
        this.n403PayerZipCode = n403PayerZipCode;
    }

    public PayerName withN403PayerZipCode(String n403PayerZipCode) {
        this.n403PayerZipCode = n403PayerZipCode;
        return this;
    }

    @JsonProperty("n404_payerCountryCode")
    public String getN404PayerCountryCode() {
        return n404PayerCountryCode;
    }

    @JsonProperty("n404_payerCountryCode")
    public void setN404PayerCountryCode(String n404PayerCountryCode) {
        this.n404PayerCountryCode = n404PayerCountryCode;
    }

    public PayerName withN404PayerCountryCode(String n404PayerCountryCode) {
        this.n404PayerCountryCode = n404PayerCountryCode;
        return this;
    }

    @JsonProperty("n407_payerCountrySubdivisionCode")
    public String getN407PayerCountrySubdivisionCode() {
        return n407PayerCountrySubdivisionCode;
    }

    @JsonProperty("n407_payerCountrySubdivisionCode")
    public void setN407PayerCountrySubdivisionCode(String n407PayerCountrySubdivisionCode) {
        this.n407PayerCountrySubdivisionCode = n407PayerCountrySubdivisionCode;
    }

    public PayerName withN407PayerCountrySubdivisionCode(String n407PayerCountrySubdivisionCode) {
        this.n407PayerCountrySubdivisionCode = n407PayerCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("ref_payerSecondaryIdentification")
    public List<RefPayerSecondaryIdentification> getRefPayerSecondaryIdentification() {
        return refPayerSecondaryIdentification;
    }

    @JsonProperty("ref_payerSecondaryIdentification")
    public void setRefPayerSecondaryIdentification(List<RefPayerSecondaryIdentification> refPayerSecondaryIdentification) {
        this.refPayerSecondaryIdentification = refPayerSecondaryIdentification;
    }

    public PayerName withRefPayerSecondaryIdentification(List<RefPayerSecondaryIdentification> refPayerSecondaryIdentification) {
        this.refPayerSecondaryIdentification = refPayerSecondaryIdentification;
        return this;
    }

    @JsonProperty("ref_billingProviderSecondaryIdentification")
    public List<RefBillingProviderSecondaryIdentification> getRefBillingProviderSecondaryIdentification() {
        return refBillingProviderSecondaryIdentification;
    }

    @JsonProperty("ref_billingProviderSecondaryIdentification")
    public void setRefBillingProviderSecondaryIdentification(List<RefBillingProviderSecondaryIdentification> refBillingProviderSecondaryIdentification) {
        this.refBillingProviderSecondaryIdentification = refBillingProviderSecondaryIdentification;
    }

    public PayerName withRefBillingProviderSecondaryIdentification(List<RefBillingProviderSecondaryIdentification> refBillingProviderSecondaryIdentification) {
        this.refBillingProviderSecondaryIdentification = refBillingProviderSecondaryIdentification;
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

    public PayerName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101PayerCode).append(nm102PayerTypeQlfr).append(nm103PayerLastOrOrganizatioName).append(nm108PayerIdentificationCodeQlfr).append(nm109PayerIdentificationCode).append(n301PayerAddressLine1).append(n302PayerAddressLine2).append(n401PayerCity).append(n402PayerStateCode).append(n403PayerZipCode).append(n404PayerCountryCode).append(n407PayerCountrySubdivisionCode).append(refPayerSecondaryIdentification).append(refBillingProviderSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayerName) == false) {
            return false;
        }
        PayerName rhs = ((PayerName) other);
        return new EqualsBuilder().append(nm101PayerCode, rhs.nm101PayerCode).append(nm102PayerTypeQlfr, rhs.nm102PayerTypeQlfr).append(nm103PayerLastOrOrganizatioName, rhs.nm103PayerLastOrOrganizatioName).append(nm108PayerIdentificationCodeQlfr, rhs.nm108PayerIdentificationCodeQlfr).append(nm109PayerIdentificationCode, rhs.nm109PayerIdentificationCode).append(n301PayerAddressLine1, rhs.n301PayerAddressLine1).append(n302PayerAddressLine2, rhs.n302PayerAddressLine2).append(n401PayerCity, rhs.n401PayerCity).append(n402PayerStateCode, rhs.n402PayerStateCode).append(n403PayerZipCode, rhs.n403PayerZipCode).append(n404PayerCountryCode, rhs.n404PayerCountryCode).append(n407PayerCountrySubdivisionCode, rhs.n407PayerCountrySubdivisionCode).append(refPayerSecondaryIdentification, rhs.refPayerSecondaryIdentification).append(refBillingProviderSecondaryIdentification, rhs.refBillingProviderSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

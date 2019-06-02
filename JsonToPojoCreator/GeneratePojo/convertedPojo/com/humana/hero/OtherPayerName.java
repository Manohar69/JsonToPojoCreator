
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
    "nm101_otherPayerOrganizationNameIdentificationCode",
    "nm102_otherPayerOrganizationNameTypeQlfr",
    "nm103_otherPayerOrganizationName",
    "nm108_otherPayerCodeQlfr",
    "nm109_otherPayerPrimaryIdentifier",
    "n301_otherPayerAddressLine1",
    "n302_otherPayerAddressLine2",
    "n401_otherPayerCity",
    "n402_otherPayerStateCode",
    "n403_otherPayerZipCode",
    "n404_otherPayerCountryCode",
    "n407_otherPayerCountrySubdivisionCode",
    "dtp01_otherPayerPaymentDateQlfr",
    "dtp02_otherPayerPaymentDateFormatQlfr",
    "dtp03_otherPayerPaymentDate",
    "ref_otherPayerSecondaryIdentifier",
    "ref01_otherPayerPriorAuthorizationNoQlfr",
    "ref02_otherPayerPriorAuthorizationNo",
    "ref01_otherPayerReferralNoQlfr",
    "ref02_otherPayerReferralNo",
    "ref01_otherPayerClaimAdjustmentIndicatorQlfr",
    "ref02_otherPayerClaimAdjustmentIndicator",
    "ref01_otherPayerPredeterminationOfBenefitsIdentificationNoQlfr",
    "ref02_otherPayerPredeterminationOfBenefitsIdentifier",
    "ref01_otherPayerClaimControlNoQlfr",
    "ref02_otherPayerClaimControlNo"
})
public class OtherPayerName {

    @JsonProperty("nm101_otherPayerOrganizationNameIdentificationCode")
    private String nm101OtherPayerOrganizationNameIdentificationCode;
    @JsonProperty("nm102_otherPayerOrganizationNameTypeQlfr")
    private String nm102OtherPayerOrganizationNameTypeQlfr;
    @JsonProperty("nm103_otherPayerOrganizationName")
    private String nm103OtherPayerOrganizationName;
    @JsonProperty("nm108_otherPayerCodeQlfr")
    private String nm108OtherPayerCodeQlfr;
    @JsonProperty("nm109_otherPayerPrimaryIdentifier")
    private String nm109OtherPayerPrimaryIdentifier;
    @JsonProperty("n301_otherPayerAddressLine1")
    private String n301OtherPayerAddressLine1;
    @JsonProperty("n302_otherPayerAddressLine2")
    private String n302OtherPayerAddressLine2;
    @JsonProperty("n401_otherPayerCity")
    private String n401OtherPayerCity;
    @JsonProperty("n402_otherPayerStateCode")
    private String n402OtherPayerStateCode;
    @JsonProperty("n403_otherPayerZipCode")
    private String n403OtherPayerZipCode;
    @JsonProperty("n404_otherPayerCountryCode")
    private String n404OtherPayerCountryCode;
    @JsonProperty("n407_otherPayerCountrySubdivisionCode")
    private String n407OtherPayerCountrySubdivisionCode;
    @JsonProperty("dtp01_otherPayerPaymentDateQlfr")
    private String dtp01OtherPayerPaymentDateQlfr;
    @JsonProperty("dtp02_otherPayerPaymentDateFormatQlfr")
    private String dtp02OtherPayerPaymentDateFormatQlfr;
    @JsonProperty("dtp03_otherPayerPaymentDate")
    private String dtp03OtherPayerPaymentDate;
    @JsonProperty("ref_otherPayerSecondaryIdentifier")
    private List<RefOtherPayerSecondaryIdentifier> refOtherPayerSecondaryIdentifier = new ArrayList<RefOtherPayerSecondaryIdentifier>();
    @JsonProperty("ref01_otherPayerPriorAuthorizationNoQlfr")
    private String ref01OtherPayerPriorAuthorizationNoQlfr;
    @JsonProperty("ref02_otherPayerPriorAuthorizationNo")
    private String ref02OtherPayerPriorAuthorizationNo;
    @JsonProperty("ref01_otherPayerReferralNoQlfr")
    private String ref01OtherPayerReferralNoQlfr;
    @JsonProperty("ref02_otherPayerReferralNo")
    private String ref02OtherPayerReferralNo;
    @JsonProperty("ref01_otherPayerClaimAdjustmentIndicatorQlfr")
    private String ref01OtherPayerClaimAdjustmentIndicatorQlfr;
    @JsonProperty("ref02_otherPayerClaimAdjustmentIndicator")
    private String ref02OtherPayerClaimAdjustmentIndicator;
    @JsonProperty("ref01_otherPayerPredeterminationOfBenefitsIdentificationNoQlfr")
    private String ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr;
    @JsonProperty("ref02_otherPayerPredeterminationOfBenefitsIdentifier")
    private String ref02OtherPayerPredeterminationOfBenefitsIdentifier;
    @JsonProperty("ref01_otherPayerClaimControlNoQlfr")
    private String ref01OtherPayerClaimControlNoQlfr;
    @JsonProperty("ref02_otherPayerClaimControlNo")
    private String ref02OtherPayerClaimControlNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherPayerOrganizationNameIdentificationCode")
    public String getNm101OtherPayerOrganizationNameIdentificationCode() {
        return nm101OtherPayerOrganizationNameIdentificationCode;
    }

    @JsonProperty("nm101_otherPayerOrganizationNameIdentificationCode")
    public void setNm101OtherPayerOrganizationNameIdentificationCode(String nm101OtherPayerOrganizationNameIdentificationCode) {
        this.nm101OtherPayerOrganizationNameIdentificationCode = nm101OtherPayerOrganizationNameIdentificationCode;
    }

    public OtherPayerName withNm101OtherPayerOrganizationNameIdentificationCode(String nm101OtherPayerOrganizationNameIdentificationCode) {
        this.nm101OtherPayerOrganizationNameIdentificationCode = nm101OtherPayerOrganizationNameIdentificationCode;
        return this;
    }

    @JsonProperty("nm102_otherPayerOrganizationNameTypeQlfr")
    public String getNm102OtherPayerOrganizationNameTypeQlfr() {
        return nm102OtherPayerOrganizationNameTypeQlfr;
    }

    @JsonProperty("nm102_otherPayerOrganizationNameTypeQlfr")
    public void setNm102OtherPayerOrganizationNameTypeQlfr(String nm102OtherPayerOrganizationNameTypeQlfr) {
        this.nm102OtherPayerOrganizationNameTypeQlfr = nm102OtherPayerOrganizationNameTypeQlfr;
    }

    public OtherPayerName withNm102OtherPayerOrganizationNameTypeQlfr(String nm102OtherPayerOrganizationNameTypeQlfr) {
        this.nm102OtherPayerOrganizationNameTypeQlfr = nm102OtherPayerOrganizationNameTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_otherPayerOrganizationName")
    public String getNm103OtherPayerOrganizationName() {
        return nm103OtherPayerOrganizationName;
    }

    @JsonProperty("nm103_otherPayerOrganizationName")
    public void setNm103OtherPayerOrganizationName(String nm103OtherPayerOrganizationName) {
        this.nm103OtherPayerOrganizationName = nm103OtherPayerOrganizationName;
    }

    public OtherPayerName withNm103OtherPayerOrganizationName(String nm103OtherPayerOrganizationName) {
        this.nm103OtherPayerOrganizationName = nm103OtherPayerOrganizationName;
        return this;
    }

    @JsonProperty("nm108_otherPayerCodeQlfr")
    public String getNm108OtherPayerCodeQlfr() {
        return nm108OtherPayerCodeQlfr;
    }

    @JsonProperty("nm108_otherPayerCodeQlfr")
    public void setNm108OtherPayerCodeQlfr(String nm108OtherPayerCodeQlfr) {
        this.nm108OtherPayerCodeQlfr = nm108OtherPayerCodeQlfr;
    }

    public OtherPayerName withNm108OtherPayerCodeQlfr(String nm108OtherPayerCodeQlfr) {
        this.nm108OtherPayerCodeQlfr = nm108OtherPayerCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_otherPayerPrimaryIdentifier")
    public String getNm109OtherPayerPrimaryIdentifier() {
        return nm109OtherPayerPrimaryIdentifier;
    }

    @JsonProperty("nm109_otherPayerPrimaryIdentifier")
    public void setNm109OtherPayerPrimaryIdentifier(String nm109OtherPayerPrimaryIdentifier) {
        this.nm109OtherPayerPrimaryIdentifier = nm109OtherPayerPrimaryIdentifier;
    }

    public OtherPayerName withNm109OtherPayerPrimaryIdentifier(String nm109OtherPayerPrimaryIdentifier) {
        this.nm109OtherPayerPrimaryIdentifier = nm109OtherPayerPrimaryIdentifier;
        return this;
    }

    @JsonProperty("n301_otherPayerAddressLine1")
    public String getN301OtherPayerAddressLine1() {
        return n301OtherPayerAddressLine1;
    }

    @JsonProperty("n301_otherPayerAddressLine1")
    public void setN301OtherPayerAddressLine1(String n301OtherPayerAddressLine1) {
        this.n301OtherPayerAddressLine1 = n301OtherPayerAddressLine1;
    }

    public OtherPayerName withN301OtherPayerAddressLine1(String n301OtherPayerAddressLine1) {
        this.n301OtherPayerAddressLine1 = n301OtherPayerAddressLine1;
        return this;
    }

    @JsonProperty("n302_otherPayerAddressLine2")
    public String getN302OtherPayerAddressLine2() {
        return n302OtherPayerAddressLine2;
    }

    @JsonProperty("n302_otherPayerAddressLine2")
    public void setN302OtherPayerAddressLine2(String n302OtherPayerAddressLine2) {
        this.n302OtherPayerAddressLine2 = n302OtherPayerAddressLine2;
    }

    public OtherPayerName withN302OtherPayerAddressLine2(String n302OtherPayerAddressLine2) {
        this.n302OtherPayerAddressLine2 = n302OtherPayerAddressLine2;
        return this;
    }

    @JsonProperty("n401_otherPayerCity")
    public String getN401OtherPayerCity() {
        return n401OtherPayerCity;
    }

    @JsonProperty("n401_otherPayerCity")
    public void setN401OtherPayerCity(String n401OtherPayerCity) {
        this.n401OtherPayerCity = n401OtherPayerCity;
    }

    public OtherPayerName withN401OtherPayerCity(String n401OtherPayerCity) {
        this.n401OtherPayerCity = n401OtherPayerCity;
        return this;
    }

    @JsonProperty("n402_otherPayerStateCode")
    public String getN402OtherPayerStateCode() {
        return n402OtherPayerStateCode;
    }

    @JsonProperty("n402_otherPayerStateCode")
    public void setN402OtherPayerStateCode(String n402OtherPayerStateCode) {
        this.n402OtherPayerStateCode = n402OtherPayerStateCode;
    }

    public OtherPayerName withN402OtherPayerStateCode(String n402OtherPayerStateCode) {
        this.n402OtherPayerStateCode = n402OtherPayerStateCode;
        return this;
    }

    @JsonProperty("n403_otherPayerZipCode")
    public String getN403OtherPayerZipCode() {
        return n403OtherPayerZipCode;
    }

    @JsonProperty("n403_otherPayerZipCode")
    public void setN403OtherPayerZipCode(String n403OtherPayerZipCode) {
        this.n403OtherPayerZipCode = n403OtherPayerZipCode;
    }

    public OtherPayerName withN403OtherPayerZipCode(String n403OtherPayerZipCode) {
        this.n403OtherPayerZipCode = n403OtherPayerZipCode;
        return this;
    }

    @JsonProperty("n404_otherPayerCountryCode")
    public String getN404OtherPayerCountryCode() {
        return n404OtherPayerCountryCode;
    }

    @JsonProperty("n404_otherPayerCountryCode")
    public void setN404OtherPayerCountryCode(String n404OtherPayerCountryCode) {
        this.n404OtherPayerCountryCode = n404OtherPayerCountryCode;
    }

    public OtherPayerName withN404OtherPayerCountryCode(String n404OtherPayerCountryCode) {
        this.n404OtherPayerCountryCode = n404OtherPayerCountryCode;
        return this;
    }

    @JsonProperty("n407_otherPayerCountrySubdivisionCode")
    public String getN407OtherPayerCountrySubdivisionCode() {
        return n407OtherPayerCountrySubdivisionCode;
    }

    @JsonProperty("n407_otherPayerCountrySubdivisionCode")
    public void setN407OtherPayerCountrySubdivisionCode(String n407OtherPayerCountrySubdivisionCode) {
        this.n407OtherPayerCountrySubdivisionCode = n407OtherPayerCountrySubdivisionCode;
    }

    public OtherPayerName withN407OtherPayerCountrySubdivisionCode(String n407OtherPayerCountrySubdivisionCode) {
        this.n407OtherPayerCountrySubdivisionCode = n407OtherPayerCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("dtp01_otherPayerPaymentDateQlfr")
    public String getDtp01OtherPayerPaymentDateQlfr() {
        return dtp01OtherPayerPaymentDateQlfr;
    }

    @JsonProperty("dtp01_otherPayerPaymentDateQlfr")
    public void setDtp01OtherPayerPaymentDateQlfr(String dtp01OtherPayerPaymentDateQlfr) {
        this.dtp01OtherPayerPaymentDateQlfr = dtp01OtherPayerPaymentDateQlfr;
    }

    public OtherPayerName withDtp01OtherPayerPaymentDateQlfr(String dtp01OtherPayerPaymentDateQlfr) {
        this.dtp01OtherPayerPaymentDateQlfr = dtp01OtherPayerPaymentDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_otherPayerPaymentDateFormatQlfr")
    public String getDtp02OtherPayerPaymentDateFormatQlfr() {
        return dtp02OtherPayerPaymentDateFormatQlfr;
    }

    @JsonProperty("dtp02_otherPayerPaymentDateFormatQlfr")
    public void setDtp02OtherPayerPaymentDateFormatQlfr(String dtp02OtherPayerPaymentDateFormatQlfr) {
        this.dtp02OtherPayerPaymentDateFormatQlfr = dtp02OtherPayerPaymentDateFormatQlfr;
    }

    public OtherPayerName withDtp02OtherPayerPaymentDateFormatQlfr(String dtp02OtherPayerPaymentDateFormatQlfr) {
        this.dtp02OtherPayerPaymentDateFormatQlfr = dtp02OtherPayerPaymentDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_otherPayerPaymentDate")
    public String getDtp03OtherPayerPaymentDate() {
        return dtp03OtherPayerPaymentDate;
    }

    @JsonProperty("dtp03_otherPayerPaymentDate")
    public void setDtp03OtherPayerPaymentDate(String dtp03OtherPayerPaymentDate) {
        this.dtp03OtherPayerPaymentDate = dtp03OtherPayerPaymentDate;
    }

    public OtherPayerName withDtp03OtherPayerPaymentDate(String dtp03OtherPayerPaymentDate) {
        this.dtp03OtherPayerPaymentDate = dtp03OtherPayerPaymentDate;
        return this;
    }

    @JsonProperty("ref_otherPayerSecondaryIdentifier")
    public List<RefOtherPayerSecondaryIdentifier> getRefOtherPayerSecondaryIdentifier() {
        return refOtherPayerSecondaryIdentifier;
    }

    @JsonProperty("ref_otherPayerSecondaryIdentifier")
    public void setRefOtherPayerSecondaryIdentifier(List<RefOtherPayerSecondaryIdentifier> refOtherPayerSecondaryIdentifier) {
        this.refOtherPayerSecondaryIdentifier = refOtherPayerSecondaryIdentifier;
    }

    public OtherPayerName withRefOtherPayerSecondaryIdentifier(List<RefOtherPayerSecondaryIdentifier> refOtherPayerSecondaryIdentifier) {
        this.refOtherPayerSecondaryIdentifier = refOtherPayerSecondaryIdentifier;
        return this;
    }

    @JsonProperty("ref01_otherPayerPriorAuthorizationNoQlfr")
    public String getRef01OtherPayerPriorAuthorizationNoQlfr() {
        return ref01OtherPayerPriorAuthorizationNoQlfr;
    }

    @JsonProperty("ref01_otherPayerPriorAuthorizationNoQlfr")
    public void setRef01OtherPayerPriorAuthorizationNoQlfr(String ref01OtherPayerPriorAuthorizationNoQlfr) {
        this.ref01OtherPayerPriorAuthorizationNoQlfr = ref01OtherPayerPriorAuthorizationNoQlfr;
    }

    public OtherPayerName withRef01OtherPayerPriorAuthorizationNoQlfr(String ref01OtherPayerPriorAuthorizationNoQlfr) {
        this.ref01OtherPayerPriorAuthorizationNoQlfr = ref01OtherPayerPriorAuthorizationNoQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerPriorAuthorizationNo")
    public String getRef02OtherPayerPriorAuthorizationNo() {
        return ref02OtherPayerPriorAuthorizationNo;
    }

    @JsonProperty("ref02_otherPayerPriorAuthorizationNo")
    public void setRef02OtherPayerPriorAuthorizationNo(String ref02OtherPayerPriorAuthorizationNo) {
        this.ref02OtherPayerPriorAuthorizationNo = ref02OtherPayerPriorAuthorizationNo;
    }

    public OtherPayerName withRef02OtherPayerPriorAuthorizationNo(String ref02OtherPayerPriorAuthorizationNo) {
        this.ref02OtherPayerPriorAuthorizationNo = ref02OtherPayerPriorAuthorizationNo;
        return this;
    }

    @JsonProperty("ref01_otherPayerReferralNoQlfr")
    public String getRef01OtherPayerReferralNoQlfr() {
        return ref01OtherPayerReferralNoQlfr;
    }

    @JsonProperty("ref01_otherPayerReferralNoQlfr")
    public void setRef01OtherPayerReferralNoQlfr(String ref01OtherPayerReferralNoQlfr) {
        this.ref01OtherPayerReferralNoQlfr = ref01OtherPayerReferralNoQlfr;
    }

    public OtherPayerName withRef01OtherPayerReferralNoQlfr(String ref01OtherPayerReferralNoQlfr) {
        this.ref01OtherPayerReferralNoQlfr = ref01OtherPayerReferralNoQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerReferralNo")
    public String getRef02OtherPayerReferralNo() {
        return ref02OtherPayerReferralNo;
    }

    @JsonProperty("ref02_otherPayerReferralNo")
    public void setRef02OtherPayerReferralNo(String ref02OtherPayerReferralNo) {
        this.ref02OtherPayerReferralNo = ref02OtherPayerReferralNo;
    }

    public OtherPayerName withRef02OtherPayerReferralNo(String ref02OtherPayerReferralNo) {
        this.ref02OtherPayerReferralNo = ref02OtherPayerReferralNo;
        return this;
    }

    @JsonProperty("ref01_otherPayerClaimAdjustmentIndicatorQlfr")
    public String getRef01OtherPayerClaimAdjustmentIndicatorQlfr() {
        return ref01OtherPayerClaimAdjustmentIndicatorQlfr;
    }

    @JsonProperty("ref01_otherPayerClaimAdjustmentIndicatorQlfr")
    public void setRef01OtherPayerClaimAdjustmentIndicatorQlfr(String ref01OtherPayerClaimAdjustmentIndicatorQlfr) {
        this.ref01OtherPayerClaimAdjustmentIndicatorQlfr = ref01OtherPayerClaimAdjustmentIndicatorQlfr;
    }

    public OtherPayerName withRef01OtherPayerClaimAdjustmentIndicatorQlfr(String ref01OtherPayerClaimAdjustmentIndicatorQlfr) {
        this.ref01OtherPayerClaimAdjustmentIndicatorQlfr = ref01OtherPayerClaimAdjustmentIndicatorQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerClaimAdjustmentIndicator")
    public String getRef02OtherPayerClaimAdjustmentIndicator() {
        return ref02OtherPayerClaimAdjustmentIndicator;
    }

    @JsonProperty("ref02_otherPayerClaimAdjustmentIndicator")
    public void setRef02OtherPayerClaimAdjustmentIndicator(String ref02OtherPayerClaimAdjustmentIndicator) {
        this.ref02OtherPayerClaimAdjustmentIndicator = ref02OtherPayerClaimAdjustmentIndicator;
    }

    public OtherPayerName withRef02OtherPayerClaimAdjustmentIndicator(String ref02OtherPayerClaimAdjustmentIndicator) {
        this.ref02OtherPayerClaimAdjustmentIndicator = ref02OtherPayerClaimAdjustmentIndicator;
        return this;
    }

    @JsonProperty("ref01_otherPayerPredeterminationOfBenefitsIdentificationNoQlfr")
    public String getRef01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr() {
        return ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr;
    }

    @JsonProperty("ref01_otherPayerPredeterminationOfBenefitsIdentificationNoQlfr")
    public void setRef01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr(String ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr) {
        this.ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr = ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr;
    }

    public OtherPayerName withRef01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr(String ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr) {
        this.ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr = ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerPredeterminationOfBenefitsIdentifier")
    public String getRef02OtherPayerPredeterminationOfBenefitsIdentifier() {
        return ref02OtherPayerPredeterminationOfBenefitsIdentifier;
    }

    @JsonProperty("ref02_otherPayerPredeterminationOfBenefitsIdentifier")
    public void setRef02OtherPayerPredeterminationOfBenefitsIdentifier(String ref02OtherPayerPredeterminationOfBenefitsIdentifier) {
        this.ref02OtherPayerPredeterminationOfBenefitsIdentifier = ref02OtherPayerPredeterminationOfBenefitsIdentifier;
    }

    public OtherPayerName withRef02OtherPayerPredeterminationOfBenefitsIdentifier(String ref02OtherPayerPredeterminationOfBenefitsIdentifier) {
        this.ref02OtherPayerPredeterminationOfBenefitsIdentifier = ref02OtherPayerPredeterminationOfBenefitsIdentifier;
        return this;
    }

    @JsonProperty("ref01_otherPayerClaimControlNoQlfr")
    public String getRef01OtherPayerClaimControlNoQlfr() {
        return ref01OtherPayerClaimControlNoQlfr;
    }

    @JsonProperty("ref01_otherPayerClaimControlNoQlfr")
    public void setRef01OtherPayerClaimControlNoQlfr(String ref01OtherPayerClaimControlNoQlfr) {
        this.ref01OtherPayerClaimControlNoQlfr = ref01OtherPayerClaimControlNoQlfr;
    }

    public OtherPayerName withRef01OtherPayerClaimControlNoQlfr(String ref01OtherPayerClaimControlNoQlfr) {
        this.ref01OtherPayerClaimControlNoQlfr = ref01OtherPayerClaimControlNoQlfr;
        return this;
    }

    @JsonProperty("ref02_otherPayerClaimControlNo")
    public String getRef02OtherPayerClaimControlNo() {
        return ref02OtherPayerClaimControlNo;
    }

    @JsonProperty("ref02_otherPayerClaimControlNo")
    public void setRef02OtherPayerClaimControlNo(String ref02OtherPayerClaimControlNo) {
        this.ref02OtherPayerClaimControlNo = ref02OtherPayerClaimControlNo;
    }

    public OtherPayerName withRef02OtherPayerClaimControlNo(String ref02OtherPayerClaimControlNo) {
        this.ref02OtherPayerClaimControlNo = ref02OtherPayerClaimControlNo;
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

    public OtherPayerName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherPayerOrganizationNameIdentificationCode).append(nm102OtherPayerOrganizationNameTypeQlfr).append(nm103OtherPayerOrganizationName).append(nm108OtherPayerCodeQlfr).append(nm109OtherPayerPrimaryIdentifier).append(n301OtherPayerAddressLine1).append(n302OtherPayerAddressLine2).append(n401OtherPayerCity).append(n402OtherPayerStateCode).append(n403OtherPayerZipCode).append(n404OtherPayerCountryCode).append(n407OtherPayerCountrySubdivisionCode).append(dtp01OtherPayerPaymentDateQlfr).append(dtp02OtherPayerPaymentDateFormatQlfr).append(dtp03OtherPayerPaymentDate).append(refOtherPayerSecondaryIdentifier).append(ref01OtherPayerPriorAuthorizationNoQlfr).append(ref02OtherPayerPriorAuthorizationNo).append(ref01OtherPayerReferralNoQlfr).append(ref02OtherPayerReferralNo).append(ref01OtherPayerClaimAdjustmentIndicatorQlfr).append(ref02OtherPayerClaimAdjustmentIndicator).append(ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr).append(ref02OtherPayerPredeterminationOfBenefitsIdentifier).append(ref01OtherPayerClaimControlNoQlfr).append(ref02OtherPayerClaimControlNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerName) == false) {
            return false;
        }
        OtherPayerName rhs = ((OtherPayerName) other);
        return new EqualsBuilder().append(nm101OtherPayerOrganizationNameIdentificationCode, rhs.nm101OtherPayerOrganizationNameIdentificationCode).append(nm102OtherPayerOrganizationNameTypeQlfr, rhs.nm102OtherPayerOrganizationNameTypeQlfr).append(nm103OtherPayerOrganizationName, rhs.nm103OtherPayerOrganizationName).append(nm108OtherPayerCodeQlfr, rhs.nm108OtherPayerCodeQlfr).append(nm109OtherPayerPrimaryIdentifier, rhs.nm109OtherPayerPrimaryIdentifier).append(n301OtherPayerAddressLine1, rhs.n301OtherPayerAddressLine1).append(n302OtherPayerAddressLine2, rhs.n302OtherPayerAddressLine2).append(n401OtherPayerCity, rhs.n401OtherPayerCity).append(n402OtherPayerStateCode, rhs.n402OtherPayerStateCode).append(n403OtherPayerZipCode, rhs.n403OtherPayerZipCode).append(n404OtherPayerCountryCode, rhs.n404OtherPayerCountryCode).append(n407OtherPayerCountrySubdivisionCode, rhs.n407OtherPayerCountrySubdivisionCode).append(dtp01OtherPayerPaymentDateQlfr, rhs.dtp01OtherPayerPaymentDateQlfr).append(dtp02OtherPayerPaymentDateFormatQlfr, rhs.dtp02OtherPayerPaymentDateFormatQlfr).append(dtp03OtherPayerPaymentDate, rhs.dtp03OtherPayerPaymentDate).append(refOtherPayerSecondaryIdentifier, rhs.refOtherPayerSecondaryIdentifier).append(ref01OtherPayerPriorAuthorizationNoQlfr, rhs.ref01OtherPayerPriorAuthorizationNoQlfr).append(ref02OtherPayerPriorAuthorizationNo, rhs.ref02OtherPayerPriorAuthorizationNo).append(ref01OtherPayerReferralNoQlfr, rhs.ref01OtherPayerReferralNoQlfr).append(ref02OtherPayerReferralNo, rhs.ref02OtherPayerReferralNo).append(ref01OtherPayerClaimAdjustmentIndicatorQlfr, rhs.ref01OtherPayerClaimAdjustmentIndicatorQlfr).append(ref02OtherPayerClaimAdjustmentIndicator, rhs.ref02OtherPayerClaimAdjustmentIndicator).append(ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr, rhs.ref01OtherPayerPredeterminationOfBenefitsIdentificationNoQlfr).append(ref02OtherPayerPredeterminationOfBenefitsIdentifier, rhs.ref02OtherPayerPredeterminationOfBenefitsIdentifier).append(ref01OtherPayerClaimControlNoQlfr, rhs.ref01OtherPayerClaimControlNoQlfr).append(ref02OtherPayerClaimControlNo, rhs.ref02OtherPayerClaimControlNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

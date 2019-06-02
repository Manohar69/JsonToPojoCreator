
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
    "nm101_orderingProviderNameCode",
    "nm102_orderingProviderNameQlfr",
    "nm103_orderingProviderLastName",
    "nm104_orderingProviderFirstName",
    "nm105_orderingProviderMiddleName",
    "nm107_orderingProviderSuffix",
    "nm108_orderingProviderIdentificationCodeQlfr",
    "nm109_orderingProviderIdentificationCode",
    "n301_orderingProviderAddressLine1",
    "n302_orderingProviderAddressLine2",
    "n401_orderingProviderCity",
    "n402_orderingProviderStateCode",
    "n403_orderingProviderZipCode",
    "n404_orderingProviderCountryCode",
    "n407_orderingProviderCountrySubdivisionCode",
    "ref_orderingProviderSecondaryIdentification",
    "per01_orderingProviderContactNameCode",
    "per02_orderingProviderContactName",
    "per03_orderingProviderCommunicationNoQlfr1",
    "per04_orderingProviderCommunicationNo1",
    "per05_orderingProviderCommunicationNoQlfr2",
    "per06_orderingProviderCommunicationNo2",
    "per07_orderingProviderCommunicationNoQlfr3",
    "per08_orderingProviderCommunicationNo3"
})
public class OrderingPrvName {

    @JsonProperty("nm101_orderingProviderNameCode")
    private String nm101OrderingProviderNameCode;
    @JsonProperty("nm102_orderingProviderNameQlfr")
    private String nm102OrderingProviderNameQlfr;
    @JsonProperty("nm103_orderingProviderLastName")
    private String nm103OrderingProviderLastName;
    @JsonProperty("nm104_orderingProviderFirstName")
    private String nm104OrderingProviderFirstName;
    @JsonProperty("nm105_orderingProviderMiddleName")
    private String nm105OrderingProviderMiddleName;
    @JsonProperty("nm107_orderingProviderSuffix")
    private String nm107OrderingProviderSuffix;
    @JsonProperty("nm108_orderingProviderIdentificationCodeQlfr")
    private String nm108OrderingProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_orderingProviderIdentificationCode")
    private String nm109OrderingProviderIdentificationCode;
    @JsonProperty("n301_orderingProviderAddressLine1")
    private String n301OrderingProviderAddressLine1;
    @JsonProperty("n302_orderingProviderAddressLine2")
    private String n302OrderingProviderAddressLine2;
    @JsonProperty("n401_orderingProviderCity")
    private String n401OrderingProviderCity;
    @JsonProperty("n402_orderingProviderStateCode")
    private String n402OrderingProviderStateCode;
    @JsonProperty("n403_orderingProviderZipCode")
    private String n403OrderingProviderZipCode;
    @JsonProperty("n404_orderingProviderCountryCode")
    private String n404OrderingProviderCountryCode;
    @JsonProperty("n407_orderingProviderCountrySubdivisionCode")
    private String n407OrderingProviderCountrySubdivisionCode;
    @JsonProperty("ref_orderingProviderSecondaryIdentification")
    private List<RefOrderingProviderSecondaryIdentification> refOrderingProviderSecondaryIdentification = new ArrayList<RefOrderingProviderSecondaryIdentification>();
    @JsonProperty("per01_orderingProviderContactNameCode")
    private String per01OrderingProviderContactNameCode;
    @JsonProperty("per02_orderingProviderContactName")
    private String per02OrderingProviderContactName;
    @JsonProperty("per03_orderingProviderCommunicationNoQlfr1")
    private String per03OrderingProviderCommunicationNoQlfr1;
    @JsonProperty("per04_orderingProviderCommunicationNo1")
    private String per04OrderingProviderCommunicationNo1;
    @JsonProperty("per05_orderingProviderCommunicationNoQlfr2")
    private String per05OrderingProviderCommunicationNoQlfr2;
    @JsonProperty("per06_orderingProviderCommunicationNo2")
    private String per06OrderingProviderCommunicationNo2;
    @JsonProperty("per07_orderingProviderCommunicationNoQlfr3")
    private String per07OrderingProviderCommunicationNoQlfr3;
    @JsonProperty("per08_orderingProviderCommunicationNo3")
    private String per08OrderingProviderCommunicationNo3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_orderingProviderNameCode")
    public String getNm101OrderingProviderNameCode() {
        return nm101OrderingProviderNameCode;
    }

    @JsonProperty("nm101_orderingProviderNameCode")
    public void setNm101OrderingProviderNameCode(String nm101OrderingProviderNameCode) {
        this.nm101OrderingProviderNameCode = nm101OrderingProviderNameCode;
    }

    public OrderingPrvName withNm101OrderingProviderNameCode(String nm101OrderingProviderNameCode) {
        this.nm101OrderingProviderNameCode = nm101OrderingProviderNameCode;
        return this;
    }

    @JsonProperty("nm102_orderingProviderNameQlfr")
    public String getNm102OrderingProviderNameQlfr() {
        return nm102OrderingProviderNameQlfr;
    }

    @JsonProperty("nm102_orderingProviderNameQlfr")
    public void setNm102OrderingProviderNameQlfr(String nm102OrderingProviderNameQlfr) {
        this.nm102OrderingProviderNameQlfr = nm102OrderingProviderNameQlfr;
    }

    public OrderingPrvName withNm102OrderingProviderNameQlfr(String nm102OrderingProviderNameQlfr) {
        this.nm102OrderingProviderNameQlfr = nm102OrderingProviderNameQlfr;
        return this;
    }

    @JsonProperty("nm103_orderingProviderLastName")
    public String getNm103OrderingProviderLastName() {
        return nm103OrderingProviderLastName;
    }

    @JsonProperty("nm103_orderingProviderLastName")
    public void setNm103OrderingProviderLastName(String nm103OrderingProviderLastName) {
        this.nm103OrderingProviderLastName = nm103OrderingProviderLastName;
    }

    public OrderingPrvName withNm103OrderingProviderLastName(String nm103OrderingProviderLastName) {
        this.nm103OrderingProviderLastName = nm103OrderingProviderLastName;
        return this;
    }

    @JsonProperty("nm104_orderingProviderFirstName")
    public String getNm104OrderingProviderFirstName() {
        return nm104OrderingProviderFirstName;
    }

    @JsonProperty("nm104_orderingProviderFirstName")
    public void setNm104OrderingProviderFirstName(String nm104OrderingProviderFirstName) {
        this.nm104OrderingProviderFirstName = nm104OrderingProviderFirstName;
    }

    public OrderingPrvName withNm104OrderingProviderFirstName(String nm104OrderingProviderFirstName) {
        this.nm104OrderingProviderFirstName = nm104OrderingProviderFirstName;
        return this;
    }

    @JsonProperty("nm105_orderingProviderMiddleName")
    public String getNm105OrderingProviderMiddleName() {
        return nm105OrderingProviderMiddleName;
    }

    @JsonProperty("nm105_orderingProviderMiddleName")
    public void setNm105OrderingProviderMiddleName(String nm105OrderingProviderMiddleName) {
        this.nm105OrderingProviderMiddleName = nm105OrderingProviderMiddleName;
    }

    public OrderingPrvName withNm105OrderingProviderMiddleName(String nm105OrderingProviderMiddleName) {
        this.nm105OrderingProviderMiddleName = nm105OrderingProviderMiddleName;
        return this;
    }

    @JsonProperty("nm107_orderingProviderSuffix")
    public String getNm107OrderingProviderSuffix() {
        return nm107OrderingProviderSuffix;
    }

    @JsonProperty("nm107_orderingProviderSuffix")
    public void setNm107OrderingProviderSuffix(String nm107OrderingProviderSuffix) {
        this.nm107OrderingProviderSuffix = nm107OrderingProviderSuffix;
    }

    public OrderingPrvName withNm107OrderingProviderSuffix(String nm107OrderingProviderSuffix) {
        this.nm107OrderingProviderSuffix = nm107OrderingProviderSuffix;
        return this;
    }

    @JsonProperty("nm108_orderingProviderIdentificationCodeQlfr")
    public String getNm108OrderingProviderIdentificationCodeQlfr() {
        return nm108OrderingProviderIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_orderingProviderIdentificationCodeQlfr")
    public void setNm108OrderingProviderIdentificationCodeQlfr(String nm108OrderingProviderIdentificationCodeQlfr) {
        this.nm108OrderingProviderIdentificationCodeQlfr = nm108OrderingProviderIdentificationCodeQlfr;
    }

    public OrderingPrvName withNm108OrderingProviderIdentificationCodeQlfr(String nm108OrderingProviderIdentificationCodeQlfr) {
        this.nm108OrderingProviderIdentificationCodeQlfr = nm108OrderingProviderIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_orderingProviderIdentificationCode")
    public String getNm109OrderingProviderIdentificationCode() {
        return nm109OrderingProviderIdentificationCode;
    }

    @JsonProperty("nm109_orderingProviderIdentificationCode")
    public void setNm109OrderingProviderIdentificationCode(String nm109OrderingProviderIdentificationCode) {
        this.nm109OrderingProviderIdentificationCode = nm109OrderingProviderIdentificationCode;
    }

    public OrderingPrvName withNm109OrderingProviderIdentificationCode(String nm109OrderingProviderIdentificationCode) {
        this.nm109OrderingProviderIdentificationCode = nm109OrderingProviderIdentificationCode;
        return this;
    }

    @JsonProperty("n301_orderingProviderAddressLine1")
    public String getN301OrderingProviderAddressLine1() {
        return n301OrderingProviderAddressLine1;
    }

    @JsonProperty("n301_orderingProviderAddressLine1")
    public void setN301OrderingProviderAddressLine1(String n301OrderingProviderAddressLine1) {
        this.n301OrderingProviderAddressLine1 = n301OrderingProviderAddressLine1;
    }

    public OrderingPrvName withN301OrderingProviderAddressLine1(String n301OrderingProviderAddressLine1) {
        this.n301OrderingProviderAddressLine1 = n301OrderingProviderAddressLine1;
        return this;
    }

    @JsonProperty("n302_orderingProviderAddressLine2")
    public String getN302OrderingProviderAddressLine2() {
        return n302OrderingProviderAddressLine2;
    }

    @JsonProperty("n302_orderingProviderAddressLine2")
    public void setN302OrderingProviderAddressLine2(String n302OrderingProviderAddressLine2) {
        this.n302OrderingProviderAddressLine2 = n302OrderingProviderAddressLine2;
    }

    public OrderingPrvName withN302OrderingProviderAddressLine2(String n302OrderingProviderAddressLine2) {
        this.n302OrderingProviderAddressLine2 = n302OrderingProviderAddressLine2;
        return this;
    }

    @JsonProperty("n401_orderingProviderCity")
    public String getN401OrderingProviderCity() {
        return n401OrderingProviderCity;
    }

    @JsonProperty("n401_orderingProviderCity")
    public void setN401OrderingProviderCity(String n401OrderingProviderCity) {
        this.n401OrderingProviderCity = n401OrderingProviderCity;
    }

    public OrderingPrvName withN401OrderingProviderCity(String n401OrderingProviderCity) {
        this.n401OrderingProviderCity = n401OrderingProviderCity;
        return this;
    }

    @JsonProperty("n402_orderingProviderStateCode")
    public String getN402OrderingProviderStateCode() {
        return n402OrderingProviderStateCode;
    }

    @JsonProperty("n402_orderingProviderStateCode")
    public void setN402OrderingProviderStateCode(String n402OrderingProviderStateCode) {
        this.n402OrderingProviderStateCode = n402OrderingProviderStateCode;
    }

    public OrderingPrvName withN402OrderingProviderStateCode(String n402OrderingProviderStateCode) {
        this.n402OrderingProviderStateCode = n402OrderingProviderStateCode;
        return this;
    }

    @JsonProperty("n403_orderingProviderZipCode")
    public String getN403OrderingProviderZipCode() {
        return n403OrderingProviderZipCode;
    }

    @JsonProperty("n403_orderingProviderZipCode")
    public void setN403OrderingProviderZipCode(String n403OrderingProviderZipCode) {
        this.n403OrderingProviderZipCode = n403OrderingProviderZipCode;
    }

    public OrderingPrvName withN403OrderingProviderZipCode(String n403OrderingProviderZipCode) {
        this.n403OrderingProviderZipCode = n403OrderingProviderZipCode;
        return this;
    }

    @JsonProperty("n404_orderingProviderCountryCode")
    public String getN404OrderingProviderCountryCode() {
        return n404OrderingProviderCountryCode;
    }

    @JsonProperty("n404_orderingProviderCountryCode")
    public void setN404OrderingProviderCountryCode(String n404OrderingProviderCountryCode) {
        this.n404OrderingProviderCountryCode = n404OrderingProviderCountryCode;
    }

    public OrderingPrvName withN404OrderingProviderCountryCode(String n404OrderingProviderCountryCode) {
        this.n404OrderingProviderCountryCode = n404OrderingProviderCountryCode;
        return this;
    }

    @JsonProperty("n407_orderingProviderCountrySubdivisionCode")
    public String getN407OrderingProviderCountrySubdivisionCode() {
        return n407OrderingProviderCountrySubdivisionCode;
    }

    @JsonProperty("n407_orderingProviderCountrySubdivisionCode")
    public void setN407OrderingProviderCountrySubdivisionCode(String n407OrderingProviderCountrySubdivisionCode) {
        this.n407OrderingProviderCountrySubdivisionCode = n407OrderingProviderCountrySubdivisionCode;
    }

    public OrderingPrvName withN407OrderingProviderCountrySubdivisionCode(String n407OrderingProviderCountrySubdivisionCode) {
        this.n407OrderingProviderCountrySubdivisionCode = n407OrderingProviderCountrySubdivisionCode;
        return this;
    }

    @JsonProperty("ref_orderingProviderSecondaryIdentification")
    public List<RefOrderingProviderSecondaryIdentification> getRefOrderingProviderSecondaryIdentification() {
        return refOrderingProviderSecondaryIdentification;
    }

    @JsonProperty("ref_orderingProviderSecondaryIdentification")
    public void setRefOrderingProviderSecondaryIdentification(List<RefOrderingProviderSecondaryIdentification> refOrderingProviderSecondaryIdentification) {
        this.refOrderingProviderSecondaryIdentification = refOrderingProviderSecondaryIdentification;
    }

    public OrderingPrvName withRefOrderingProviderSecondaryIdentification(List<RefOrderingProviderSecondaryIdentification> refOrderingProviderSecondaryIdentification) {
        this.refOrderingProviderSecondaryIdentification = refOrderingProviderSecondaryIdentification;
        return this;
    }

    @JsonProperty("per01_orderingProviderContactNameCode")
    public String getPer01OrderingProviderContactNameCode() {
        return per01OrderingProviderContactNameCode;
    }

    @JsonProperty("per01_orderingProviderContactNameCode")
    public void setPer01OrderingProviderContactNameCode(String per01OrderingProviderContactNameCode) {
        this.per01OrderingProviderContactNameCode = per01OrderingProviderContactNameCode;
    }

    public OrderingPrvName withPer01OrderingProviderContactNameCode(String per01OrderingProviderContactNameCode) {
        this.per01OrderingProviderContactNameCode = per01OrderingProviderContactNameCode;
        return this;
    }

    @JsonProperty("per02_orderingProviderContactName")
    public String getPer02OrderingProviderContactName() {
        return per02OrderingProviderContactName;
    }

    @JsonProperty("per02_orderingProviderContactName")
    public void setPer02OrderingProviderContactName(String per02OrderingProviderContactName) {
        this.per02OrderingProviderContactName = per02OrderingProviderContactName;
    }

    public OrderingPrvName withPer02OrderingProviderContactName(String per02OrderingProviderContactName) {
        this.per02OrderingProviderContactName = per02OrderingProviderContactName;
        return this;
    }

    @JsonProperty("per03_orderingProviderCommunicationNoQlfr1")
    public String getPer03OrderingProviderCommunicationNoQlfr1() {
        return per03OrderingProviderCommunicationNoQlfr1;
    }

    @JsonProperty("per03_orderingProviderCommunicationNoQlfr1")
    public void setPer03OrderingProviderCommunicationNoQlfr1(String per03OrderingProviderCommunicationNoQlfr1) {
        this.per03OrderingProviderCommunicationNoQlfr1 = per03OrderingProviderCommunicationNoQlfr1;
    }

    public OrderingPrvName withPer03OrderingProviderCommunicationNoQlfr1(String per03OrderingProviderCommunicationNoQlfr1) {
        this.per03OrderingProviderCommunicationNoQlfr1 = per03OrderingProviderCommunicationNoQlfr1;
        return this;
    }

    @JsonProperty("per04_orderingProviderCommunicationNo1")
    public String getPer04OrderingProviderCommunicationNo1() {
        return per04OrderingProviderCommunicationNo1;
    }

    @JsonProperty("per04_orderingProviderCommunicationNo1")
    public void setPer04OrderingProviderCommunicationNo1(String per04OrderingProviderCommunicationNo1) {
        this.per04OrderingProviderCommunicationNo1 = per04OrderingProviderCommunicationNo1;
    }

    public OrderingPrvName withPer04OrderingProviderCommunicationNo1(String per04OrderingProviderCommunicationNo1) {
        this.per04OrderingProviderCommunicationNo1 = per04OrderingProviderCommunicationNo1;
        return this;
    }

    @JsonProperty("per05_orderingProviderCommunicationNoQlfr2")
    public String getPer05OrderingProviderCommunicationNoQlfr2() {
        return per05OrderingProviderCommunicationNoQlfr2;
    }

    @JsonProperty("per05_orderingProviderCommunicationNoQlfr2")
    public void setPer05OrderingProviderCommunicationNoQlfr2(String per05OrderingProviderCommunicationNoQlfr2) {
        this.per05OrderingProviderCommunicationNoQlfr2 = per05OrderingProviderCommunicationNoQlfr2;
    }

    public OrderingPrvName withPer05OrderingProviderCommunicationNoQlfr2(String per05OrderingProviderCommunicationNoQlfr2) {
        this.per05OrderingProviderCommunicationNoQlfr2 = per05OrderingProviderCommunicationNoQlfr2;
        return this;
    }

    @JsonProperty("per06_orderingProviderCommunicationNo2")
    public String getPer06OrderingProviderCommunicationNo2() {
        return per06OrderingProviderCommunicationNo2;
    }

    @JsonProperty("per06_orderingProviderCommunicationNo2")
    public void setPer06OrderingProviderCommunicationNo2(String per06OrderingProviderCommunicationNo2) {
        this.per06OrderingProviderCommunicationNo2 = per06OrderingProviderCommunicationNo2;
    }

    public OrderingPrvName withPer06OrderingProviderCommunicationNo2(String per06OrderingProviderCommunicationNo2) {
        this.per06OrderingProviderCommunicationNo2 = per06OrderingProviderCommunicationNo2;
        return this;
    }

    @JsonProperty("per07_orderingProviderCommunicationNoQlfr3")
    public String getPer07OrderingProviderCommunicationNoQlfr3() {
        return per07OrderingProviderCommunicationNoQlfr3;
    }

    @JsonProperty("per07_orderingProviderCommunicationNoQlfr3")
    public void setPer07OrderingProviderCommunicationNoQlfr3(String per07OrderingProviderCommunicationNoQlfr3) {
        this.per07OrderingProviderCommunicationNoQlfr3 = per07OrderingProviderCommunicationNoQlfr3;
    }

    public OrderingPrvName withPer07OrderingProviderCommunicationNoQlfr3(String per07OrderingProviderCommunicationNoQlfr3) {
        this.per07OrderingProviderCommunicationNoQlfr3 = per07OrderingProviderCommunicationNoQlfr3;
        return this;
    }

    @JsonProperty("per08_orderingProviderCommunicationNo3")
    public String getPer08OrderingProviderCommunicationNo3() {
        return per08OrderingProviderCommunicationNo3;
    }

    @JsonProperty("per08_orderingProviderCommunicationNo3")
    public void setPer08OrderingProviderCommunicationNo3(String per08OrderingProviderCommunicationNo3) {
        this.per08OrderingProviderCommunicationNo3 = per08OrderingProviderCommunicationNo3;
    }

    public OrderingPrvName withPer08OrderingProviderCommunicationNo3(String per08OrderingProviderCommunicationNo3) {
        this.per08OrderingProviderCommunicationNo3 = per08OrderingProviderCommunicationNo3;
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

    public OrderingPrvName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OrderingProviderNameCode).append(nm102OrderingProviderNameQlfr).append(nm103OrderingProviderLastName).append(nm104OrderingProviderFirstName).append(nm105OrderingProviderMiddleName).append(nm107OrderingProviderSuffix).append(nm108OrderingProviderIdentificationCodeQlfr).append(nm109OrderingProviderIdentificationCode).append(n301OrderingProviderAddressLine1).append(n302OrderingProviderAddressLine2).append(n401OrderingProviderCity).append(n402OrderingProviderStateCode).append(n403OrderingProviderZipCode).append(n404OrderingProviderCountryCode).append(n407OrderingProviderCountrySubdivisionCode).append(refOrderingProviderSecondaryIdentification).append(per01OrderingProviderContactNameCode).append(per02OrderingProviderContactName).append(per03OrderingProviderCommunicationNoQlfr1).append(per04OrderingProviderCommunicationNo1).append(per05OrderingProviderCommunicationNoQlfr2).append(per06OrderingProviderCommunicationNo2).append(per07OrderingProviderCommunicationNoQlfr3).append(per08OrderingProviderCommunicationNo3).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderingPrvName) == false) {
            return false;
        }
        OrderingPrvName rhs = ((OrderingPrvName) other);
        return new EqualsBuilder().append(nm101OrderingProviderNameCode, rhs.nm101OrderingProviderNameCode).append(nm102OrderingProviderNameQlfr, rhs.nm102OrderingProviderNameQlfr).append(nm103OrderingProviderLastName, rhs.nm103OrderingProviderLastName).append(nm104OrderingProviderFirstName, rhs.nm104OrderingProviderFirstName).append(nm105OrderingProviderMiddleName, rhs.nm105OrderingProviderMiddleName).append(nm107OrderingProviderSuffix, rhs.nm107OrderingProviderSuffix).append(nm108OrderingProviderIdentificationCodeQlfr, rhs.nm108OrderingProviderIdentificationCodeQlfr).append(nm109OrderingProviderIdentificationCode, rhs.nm109OrderingProviderIdentificationCode).append(n301OrderingProviderAddressLine1, rhs.n301OrderingProviderAddressLine1).append(n302OrderingProviderAddressLine2, rhs.n302OrderingProviderAddressLine2).append(n401OrderingProviderCity, rhs.n401OrderingProviderCity).append(n402OrderingProviderStateCode, rhs.n402OrderingProviderStateCode).append(n403OrderingProviderZipCode, rhs.n403OrderingProviderZipCode).append(n404OrderingProviderCountryCode, rhs.n404OrderingProviderCountryCode).append(n407OrderingProviderCountrySubdivisionCode, rhs.n407OrderingProviderCountrySubdivisionCode).append(refOrderingProviderSecondaryIdentification, rhs.refOrderingProviderSecondaryIdentification).append(per01OrderingProviderContactNameCode, rhs.per01OrderingProviderContactNameCode).append(per02OrderingProviderContactName, rhs.per02OrderingProviderContactName).append(per03OrderingProviderCommunicationNoQlfr1, rhs.per03OrderingProviderCommunicationNoQlfr1).append(per04OrderingProviderCommunicationNo1, rhs.per04OrderingProviderCommunicationNo1).append(per05OrderingProviderCommunicationNoQlfr2, rhs.per05OrderingProviderCommunicationNoQlfr2).append(per06OrderingProviderCommunicationNo2, rhs.per06OrderingProviderCommunicationNo2).append(per07OrderingProviderCommunicationNoQlfr3, rhs.per07OrderingProviderCommunicationNoQlfr3).append(per08OrderingProviderCommunicationNo3, rhs.per08OrderingProviderCommunicationNo3).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

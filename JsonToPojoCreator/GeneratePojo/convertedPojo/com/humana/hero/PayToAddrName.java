
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
    "nm101_payToProviderTypeCode",
    "nm102_payToProviderTypeQlfr",
    "n301_payToProviderAddressLine1",
    "n302_payToProviderAddressLine2",
    "n401_payToProviderCity",
    "n402_payToProviderStateCode",
    "n403_payToProviderZipCode",
    "n404_payToProviderCountryCode",
    "n407_payToProviderCountrySubdivisionCode"
})
public class PayToAddrName {

    @JsonProperty("nm101_payToProviderTypeCode")
    private String nm101PayToProviderTypeCode;
    @JsonProperty("nm102_payToProviderTypeQlfr")
    private String nm102PayToProviderTypeQlfr;
    @JsonProperty("n301_payToProviderAddressLine1")
    private String n301PayToProviderAddressLine1;
    @JsonProperty("n302_payToProviderAddressLine2")
    private String n302PayToProviderAddressLine2;
    @JsonProperty("n401_payToProviderCity")
    private String n401PayToProviderCity;
    @JsonProperty("n402_payToProviderStateCode")
    private String n402PayToProviderStateCode;
    @JsonProperty("n403_payToProviderZipCode")
    private String n403PayToProviderZipCode;
    @JsonProperty("n404_payToProviderCountryCode")
    private String n404PayToProviderCountryCode;
    @JsonProperty("n407_payToProviderCountrySubdivisionCode")
    private String n407PayToProviderCountrySubdivisionCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_payToProviderTypeCode")
    public String getNm101PayToProviderTypeCode() {
        return nm101PayToProviderTypeCode;
    }

    @JsonProperty("nm101_payToProviderTypeCode")
    public void setNm101PayToProviderTypeCode(String nm101PayToProviderTypeCode) {
        this.nm101PayToProviderTypeCode = nm101PayToProviderTypeCode;
    }

    public PayToAddrName withNm101PayToProviderTypeCode(String nm101PayToProviderTypeCode) {
        this.nm101PayToProviderTypeCode = nm101PayToProviderTypeCode;
        return this;
    }

    @JsonProperty("nm102_payToProviderTypeQlfr")
    public String getNm102PayToProviderTypeQlfr() {
        return nm102PayToProviderTypeQlfr;
    }

    @JsonProperty("nm102_payToProviderTypeQlfr")
    public void setNm102PayToProviderTypeQlfr(String nm102PayToProviderTypeQlfr) {
        this.nm102PayToProviderTypeQlfr = nm102PayToProviderTypeQlfr;
    }

    public PayToAddrName withNm102PayToProviderTypeQlfr(String nm102PayToProviderTypeQlfr) {
        this.nm102PayToProviderTypeQlfr = nm102PayToProviderTypeQlfr;
        return this;
    }

    @JsonProperty("n301_payToProviderAddressLine1")
    public String getN301PayToProviderAddressLine1() {
        return n301PayToProviderAddressLine1;
    }

    @JsonProperty("n301_payToProviderAddressLine1")
    public void setN301PayToProviderAddressLine1(String n301PayToProviderAddressLine1) {
        this.n301PayToProviderAddressLine1 = n301PayToProviderAddressLine1;
    }

    public PayToAddrName withN301PayToProviderAddressLine1(String n301PayToProviderAddressLine1) {
        this.n301PayToProviderAddressLine1 = n301PayToProviderAddressLine1;
        return this;
    }

    @JsonProperty("n302_payToProviderAddressLine2")
    public String getN302PayToProviderAddressLine2() {
        return n302PayToProviderAddressLine2;
    }

    @JsonProperty("n302_payToProviderAddressLine2")
    public void setN302PayToProviderAddressLine2(String n302PayToProviderAddressLine2) {
        this.n302PayToProviderAddressLine2 = n302PayToProviderAddressLine2;
    }

    public PayToAddrName withN302PayToProviderAddressLine2(String n302PayToProviderAddressLine2) {
        this.n302PayToProviderAddressLine2 = n302PayToProviderAddressLine2;
        return this;
    }

    @JsonProperty("n401_payToProviderCity")
    public String getN401PayToProviderCity() {
        return n401PayToProviderCity;
    }

    @JsonProperty("n401_payToProviderCity")
    public void setN401PayToProviderCity(String n401PayToProviderCity) {
        this.n401PayToProviderCity = n401PayToProviderCity;
    }

    public PayToAddrName withN401PayToProviderCity(String n401PayToProviderCity) {
        this.n401PayToProviderCity = n401PayToProviderCity;
        return this;
    }

    @JsonProperty("n402_payToProviderStateCode")
    public String getN402PayToProviderStateCode() {
        return n402PayToProviderStateCode;
    }

    @JsonProperty("n402_payToProviderStateCode")
    public void setN402PayToProviderStateCode(String n402PayToProviderStateCode) {
        this.n402PayToProviderStateCode = n402PayToProviderStateCode;
    }

    public PayToAddrName withN402PayToProviderStateCode(String n402PayToProviderStateCode) {
        this.n402PayToProviderStateCode = n402PayToProviderStateCode;
        return this;
    }

    @JsonProperty("n403_payToProviderZipCode")
    public String getN403PayToProviderZipCode() {
        return n403PayToProviderZipCode;
    }

    @JsonProperty("n403_payToProviderZipCode")
    public void setN403PayToProviderZipCode(String n403PayToProviderZipCode) {
        this.n403PayToProviderZipCode = n403PayToProviderZipCode;
    }

    public PayToAddrName withN403PayToProviderZipCode(String n403PayToProviderZipCode) {
        this.n403PayToProviderZipCode = n403PayToProviderZipCode;
        return this;
    }

    @JsonProperty("n404_payToProviderCountryCode")
    public String getN404PayToProviderCountryCode() {
        return n404PayToProviderCountryCode;
    }

    @JsonProperty("n404_payToProviderCountryCode")
    public void setN404PayToProviderCountryCode(String n404PayToProviderCountryCode) {
        this.n404PayToProviderCountryCode = n404PayToProviderCountryCode;
    }

    public PayToAddrName withN404PayToProviderCountryCode(String n404PayToProviderCountryCode) {
        this.n404PayToProviderCountryCode = n404PayToProviderCountryCode;
        return this;
    }

    @JsonProperty("n407_payToProviderCountrySubdivisionCode")
    public String getN407PayToProviderCountrySubdivisionCode() {
        return n407PayToProviderCountrySubdivisionCode;
    }

    @JsonProperty("n407_payToProviderCountrySubdivisionCode")
    public void setN407PayToProviderCountrySubdivisionCode(String n407PayToProviderCountrySubdivisionCode) {
        this.n407PayToProviderCountrySubdivisionCode = n407PayToProviderCountrySubdivisionCode;
    }

    public PayToAddrName withN407PayToProviderCountrySubdivisionCode(String n407PayToProviderCountrySubdivisionCode) {
        this.n407PayToProviderCountrySubdivisionCode = n407PayToProviderCountrySubdivisionCode;
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

    public PayToAddrName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101PayToProviderTypeCode).append(nm102PayToProviderTypeQlfr).append(n301PayToProviderAddressLine1).append(n302PayToProviderAddressLine2).append(n401PayToProviderCity).append(n402PayToProviderStateCode).append(n403PayToProviderZipCode).append(n404PayToProviderCountryCode).append(n407PayToProviderCountrySubdivisionCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayToAddrName) == false) {
            return false;
        }
        PayToAddrName rhs = ((PayToAddrName) other);
        return new EqualsBuilder().append(nm101PayToProviderTypeCode, rhs.nm101PayToProviderTypeCode).append(nm102PayToProviderTypeQlfr, rhs.nm102PayToProviderTypeQlfr).append(n301PayToProviderAddressLine1, rhs.n301PayToProviderAddressLine1).append(n302PayToProviderAddressLine2, rhs.n302PayToProviderAddressLine2).append(n401PayToProviderCity, rhs.n401PayToProviderCity).append(n402PayToProviderStateCode, rhs.n402PayToProviderStateCode).append(n403PayToProviderZipCode, rhs.n403PayToProviderZipCode).append(n404PayToProviderCountryCode, rhs.n404PayToProviderCountryCode).append(n407PayToProviderCountrySubdivisionCode, rhs.n407PayToProviderCountrySubdivisionCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

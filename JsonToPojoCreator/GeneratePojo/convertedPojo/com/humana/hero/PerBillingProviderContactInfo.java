
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
    "per01_billingProviderInformationContact",
    "per02_billingProviderContactName",
    "per03_billingProviderCommunicationNoQlfr1",
    "per04_billingProviderPhoneNo",
    "per05_billingProviderCommunicationNoQlfr2",
    "per06_billingProviderFaxNo",
    "per07_billingProviderCommunicationNoQlfr3",
    "per08_billingProviderEmail"
})
public class PerBillingProviderContactInfo {

    @JsonProperty("per01_billingProviderInformationContact")
    private String per01BillingProviderInformationContact;
    @JsonProperty("per02_billingProviderContactName")
    private String per02BillingProviderContactName;
    @JsonProperty("per03_billingProviderCommunicationNoQlfr1")
    private String per03BillingProviderCommunicationNoQlfr1;
    @JsonProperty("per04_billingProviderPhoneNo")
    private String per04BillingProviderPhoneNo;
    @JsonProperty("per05_billingProviderCommunicationNoQlfr2")
    private String per05BillingProviderCommunicationNoQlfr2;
    @JsonProperty("per06_billingProviderFaxNo")
    private String per06BillingProviderFaxNo;
    @JsonProperty("per07_billingProviderCommunicationNoQlfr3")
    private String per07BillingProviderCommunicationNoQlfr3;
    @JsonProperty("per08_billingProviderEmail")
    private String per08BillingProviderEmail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("per01_billingProviderInformationContact")
    public String getPer01BillingProviderInformationContact() {
        return per01BillingProviderInformationContact;
    }

    @JsonProperty("per01_billingProviderInformationContact")
    public void setPer01BillingProviderInformationContact(String per01BillingProviderInformationContact) {
        this.per01BillingProviderInformationContact = per01BillingProviderInformationContact;
    }

    public PerBillingProviderContactInfo withPer01BillingProviderInformationContact(String per01BillingProviderInformationContact) {
        this.per01BillingProviderInformationContact = per01BillingProviderInformationContact;
        return this;
    }

    @JsonProperty("per02_billingProviderContactName")
    public String getPer02BillingProviderContactName() {
        return per02BillingProviderContactName;
    }

    @JsonProperty("per02_billingProviderContactName")
    public void setPer02BillingProviderContactName(String per02BillingProviderContactName) {
        this.per02BillingProviderContactName = per02BillingProviderContactName;
    }

    public PerBillingProviderContactInfo withPer02BillingProviderContactName(String per02BillingProviderContactName) {
        this.per02BillingProviderContactName = per02BillingProviderContactName;
        return this;
    }

    @JsonProperty("per03_billingProviderCommunicationNoQlfr1")
    public String getPer03BillingProviderCommunicationNoQlfr1() {
        return per03BillingProviderCommunicationNoQlfr1;
    }

    @JsonProperty("per03_billingProviderCommunicationNoQlfr1")
    public void setPer03BillingProviderCommunicationNoQlfr1(String per03BillingProviderCommunicationNoQlfr1) {
        this.per03BillingProviderCommunicationNoQlfr1 = per03BillingProviderCommunicationNoQlfr1;
    }

    public PerBillingProviderContactInfo withPer03BillingProviderCommunicationNoQlfr1(String per03BillingProviderCommunicationNoQlfr1) {
        this.per03BillingProviderCommunicationNoQlfr1 = per03BillingProviderCommunicationNoQlfr1;
        return this;
    }

    @JsonProperty("per04_billingProviderPhoneNo")
    public String getPer04BillingProviderPhoneNo() {
        return per04BillingProviderPhoneNo;
    }

    @JsonProperty("per04_billingProviderPhoneNo")
    public void setPer04BillingProviderPhoneNo(String per04BillingProviderPhoneNo) {
        this.per04BillingProviderPhoneNo = per04BillingProviderPhoneNo;
    }

    public PerBillingProviderContactInfo withPer04BillingProviderPhoneNo(String per04BillingProviderPhoneNo) {
        this.per04BillingProviderPhoneNo = per04BillingProviderPhoneNo;
        return this;
    }

    @JsonProperty("per05_billingProviderCommunicationNoQlfr2")
    public String getPer05BillingProviderCommunicationNoQlfr2() {
        return per05BillingProviderCommunicationNoQlfr2;
    }

    @JsonProperty("per05_billingProviderCommunicationNoQlfr2")
    public void setPer05BillingProviderCommunicationNoQlfr2(String per05BillingProviderCommunicationNoQlfr2) {
        this.per05BillingProviderCommunicationNoQlfr2 = per05BillingProviderCommunicationNoQlfr2;
    }

    public PerBillingProviderContactInfo withPer05BillingProviderCommunicationNoQlfr2(String per05BillingProviderCommunicationNoQlfr2) {
        this.per05BillingProviderCommunicationNoQlfr2 = per05BillingProviderCommunicationNoQlfr2;
        return this;
    }

    @JsonProperty("per06_billingProviderFaxNo")
    public String getPer06BillingProviderFaxNo() {
        return per06BillingProviderFaxNo;
    }

    @JsonProperty("per06_billingProviderFaxNo")
    public void setPer06BillingProviderFaxNo(String per06BillingProviderFaxNo) {
        this.per06BillingProviderFaxNo = per06BillingProviderFaxNo;
    }

    public PerBillingProviderContactInfo withPer06BillingProviderFaxNo(String per06BillingProviderFaxNo) {
        this.per06BillingProviderFaxNo = per06BillingProviderFaxNo;
        return this;
    }

    @JsonProperty("per07_billingProviderCommunicationNoQlfr3")
    public String getPer07BillingProviderCommunicationNoQlfr3() {
        return per07BillingProviderCommunicationNoQlfr3;
    }

    @JsonProperty("per07_billingProviderCommunicationNoQlfr3")
    public void setPer07BillingProviderCommunicationNoQlfr3(String per07BillingProviderCommunicationNoQlfr3) {
        this.per07BillingProviderCommunicationNoQlfr3 = per07BillingProviderCommunicationNoQlfr3;
    }

    public PerBillingProviderContactInfo withPer07BillingProviderCommunicationNoQlfr3(String per07BillingProviderCommunicationNoQlfr3) {
        this.per07BillingProviderCommunicationNoQlfr3 = per07BillingProviderCommunicationNoQlfr3;
        return this;
    }

    @JsonProperty("per08_billingProviderEmail")
    public String getPer08BillingProviderEmail() {
        return per08BillingProviderEmail;
    }

    @JsonProperty("per08_billingProviderEmail")
    public void setPer08BillingProviderEmail(String per08BillingProviderEmail) {
        this.per08BillingProviderEmail = per08BillingProviderEmail;
    }

    public PerBillingProviderContactInfo withPer08BillingProviderEmail(String per08BillingProviderEmail) {
        this.per08BillingProviderEmail = per08BillingProviderEmail;
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

    public PerBillingProviderContactInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(per01BillingProviderInformationContact).append(per02BillingProviderContactName).append(per03BillingProviderCommunicationNoQlfr1).append(per04BillingProviderPhoneNo).append(per05BillingProviderCommunicationNoQlfr2).append(per06BillingProviderFaxNo).append(per07BillingProviderCommunicationNoQlfr3).append(per08BillingProviderEmail).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PerBillingProviderContactInfo) == false) {
            return false;
        }
        PerBillingProviderContactInfo rhs = ((PerBillingProviderContactInfo) other);
        return new EqualsBuilder().append(per01BillingProviderInformationContact, rhs.per01BillingProviderInformationContact).append(per02BillingProviderContactName, rhs.per02BillingProviderContactName).append(per03BillingProviderCommunicationNoQlfr1, rhs.per03BillingProviderCommunicationNoQlfr1).append(per04BillingProviderPhoneNo, rhs.per04BillingProviderPhoneNo).append(per05BillingProviderCommunicationNoQlfr2, rhs.per05BillingProviderCommunicationNoQlfr2).append(per06BillingProviderFaxNo, rhs.per06BillingProviderFaxNo).append(per07BillingProviderCommunicationNoQlfr3, rhs.per07BillingProviderCommunicationNoQlfr3).append(per08BillingProviderEmail, rhs.per08BillingProviderEmail).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

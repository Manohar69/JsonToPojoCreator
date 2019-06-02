
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
    "per01_submitterContactFunctionCode",
    "per02_submitterContactName",
    "per03_submitterCommunicationNoQlfr1",
    "per04_submitterCommunicationNo1",
    "per05_submitterCommunicationNoQlfr2",
    "per06_submitterCommunicationNo2",
    "per07_submitterCommunicationNoQlfr3",
    "per08_submitterCommunicationNo3"
})
public class PerSubmitterEDIContactInfo {

    @JsonProperty("per01_submitterContactFunctionCode")
    private String per01SubmitterContactFunctionCode;
    @JsonProperty("per02_submitterContactName")
    private String per02SubmitterContactName;
    @JsonProperty("per03_submitterCommunicationNoQlfr1")
    private String per03SubmitterCommunicationNoQlfr1;
    @JsonProperty("per04_submitterCommunicationNo1")
    private String per04SubmitterCommunicationNo1;
    @JsonProperty("per05_submitterCommunicationNoQlfr2")
    private String per05SubmitterCommunicationNoQlfr2;
    @JsonProperty("per06_submitterCommunicationNo2")
    private String per06SubmitterCommunicationNo2;
    @JsonProperty("per07_submitterCommunicationNoQlfr3")
    private String per07SubmitterCommunicationNoQlfr3;
    @JsonProperty("per08_submitterCommunicationNo3")
    private String per08SubmitterCommunicationNo3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("per01_submitterContactFunctionCode")
    public String getPer01SubmitterContactFunctionCode() {
        return per01SubmitterContactFunctionCode;
    }

    @JsonProperty("per01_submitterContactFunctionCode")
    public void setPer01SubmitterContactFunctionCode(String per01SubmitterContactFunctionCode) {
        this.per01SubmitterContactFunctionCode = per01SubmitterContactFunctionCode;
    }

    public PerSubmitterEDIContactInfo withPer01SubmitterContactFunctionCode(String per01SubmitterContactFunctionCode) {
        this.per01SubmitterContactFunctionCode = per01SubmitterContactFunctionCode;
        return this;
    }

    @JsonProperty("per02_submitterContactName")
    public String getPer02SubmitterContactName() {
        return per02SubmitterContactName;
    }

    @JsonProperty("per02_submitterContactName")
    public void setPer02SubmitterContactName(String per02SubmitterContactName) {
        this.per02SubmitterContactName = per02SubmitterContactName;
    }

    public PerSubmitterEDIContactInfo withPer02SubmitterContactName(String per02SubmitterContactName) {
        this.per02SubmitterContactName = per02SubmitterContactName;
        return this;
    }

    @JsonProperty("per03_submitterCommunicationNoQlfr1")
    public String getPer03SubmitterCommunicationNoQlfr1() {
        return per03SubmitterCommunicationNoQlfr1;
    }

    @JsonProperty("per03_submitterCommunicationNoQlfr1")
    public void setPer03SubmitterCommunicationNoQlfr1(String per03SubmitterCommunicationNoQlfr1) {
        this.per03SubmitterCommunicationNoQlfr1 = per03SubmitterCommunicationNoQlfr1;
    }

    public PerSubmitterEDIContactInfo withPer03SubmitterCommunicationNoQlfr1(String per03SubmitterCommunicationNoQlfr1) {
        this.per03SubmitterCommunicationNoQlfr1 = per03SubmitterCommunicationNoQlfr1;
        return this;
    }

    @JsonProperty("per04_submitterCommunicationNo1")
    public String getPer04SubmitterCommunicationNo1() {
        return per04SubmitterCommunicationNo1;
    }

    @JsonProperty("per04_submitterCommunicationNo1")
    public void setPer04SubmitterCommunicationNo1(String per04SubmitterCommunicationNo1) {
        this.per04SubmitterCommunicationNo1 = per04SubmitterCommunicationNo1;
    }

    public PerSubmitterEDIContactInfo withPer04SubmitterCommunicationNo1(String per04SubmitterCommunicationNo1) {
        this.per04SubmitterCommunicationNo1 = per04SubmitterCommunicationNo1;
        return this;
    }

    @JsonProperty("per05_submitterCommunicationNoQlfr2")
    public String getPer05SubmitterCommunicationNoQlfr2() {
        return per05SubmitterCommunicationNoQlfr2;
    }

    @JsonProperty("per05_submitterCommunicationNoQlfr2")
    public void setPer05SubmitterCommunicationNoQlfr2(String per05SubmitterCommunicationNoQlfr2) {
        this.per05SubmitterCommunicationNoQlfr2 = per05SubmitterCommunicationNoQlfr2;
    }

    public PerSubmitterEDIContactInfo withPer05SubmitterCommunicationNoQlfr2(String per05SubmitterCommunicationNoQlfr2) {
        this.per05SubmitterCommunicationNoQlfr2 = per05SubmitterCommunicationNoQlfr2;
        return this;
    }

    @JsonProperty("per06_submitterCommunicationNo2")
    public String getPer06SubmitterCommunicationNo2() {
        return per06SubmitterCommunicationNo2;
    }

    @JsonProperty("per06_submitterCommunicationNo2")
    public void setPer06SubmitterCommunicationNo2(String per06SubmitterCommunicationNo2) {
        this.per06SubmitterCommunicationNo2 = per06SubmitterCommunicationNo2;
    }

    public PerSubmitterEDIContactInfo withPer06SubmitterCommunicationNo2(String per06SubmitterCommunicationNo2) {
        this.per06SubmitterCommunicationNo2 = per06SubmitterCommunicationNo2;
        return this;
    }

    @JsonProperty("per07_submitterCommunicationNoQlfr3")
    public String getPer07SubmitterCommunicationNoQlfr3() {
        return per07SubmitterCommunicationNoQlfr3;
    }

    @JsonProperty("per07_submitterCommunicationNoQlfr3")
    public void setPer07SubmitterCommunicationNoQlfr3(String per07SubmitterCommunicationNoQlfr3) {
        this.per07SubmitterCommunicationNoQlfr3 = per07SubmitterCommunicationNoQlfr3;
    }

    public PerSubmitterEDIContactInfo withPer07SubmitterCommunicationNoQlfr3(String per07SubmitterCommunicationNoQlfr3) {
        this.per07SubmitterCommunicationNoQlfr3 = per07SubmitterCommunicationNoQlfr3;
        return this;
    }

    @JsonProperty("per08_submitterCommunicationNo3")
    public String getPer08SubmitterCommunicationNo3() {
        return per08SubmitterCommunicationNo3;
    }

    @JsonProperty("per08_submitterCommunicationNo3")
    public void setPer08SubmitterCommunicationNo3(String per08SubmitterCommunicationNo3) {
        this.per08SubmitterCommunicationNo3 = per08SubmitterCommunicationNo3;
    }

    public PerSubmitterEDIContactInfo withPer08SubmitterCommunicationNo3(String per08SubmitterCommunicationNo3) {
        this.per08SubmitterCommunicationNo3 = per08SubmitterCommunicationNo3;
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

    public PerSubmitterEDIContactInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(per01SubmitterContactFunctionCode).append(per02SubmitterContactName).append(per03SubmitterCommunicationNoQlfr1).append(per04SubmitterCommunicationNo1).append(per05SubmitterCommunicationNoQlfr2).append(per06SubmitterCommunicationNo2).append(per07SubmitterCommunicationNoQlfr3).append(per08SubmitterCommunicationNo3).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PerSubmitterEDIContactInfo) == false) {
            return false;
        }
        PerSubmitterEDIContactInfo rhs = ((PerSubmitterEDIContactInfo) other);
        return new EqualsBuilder().append(per01SubmitterContactFunctionCode, rhs.per01SubmitterContactFunctionCode).append(per02SubmitterContactName, rhs.per02SubmitterContactName).append(per03SubmitterCommunicationNoQlfr1, rhs.per03SubmitterCommunicationNoQlfr1).append(per04SubmitterCommunicationNo1, rhs.per04SubmitterCommunicationNo1).append(per05SubmitterCommunicationNoQlfr2, rhs.per05SubmitterCommunicationNoQlfr2).append(per06SubmitterCommunicationNo2, rhs.per06SubmitterCommunicationNo2).append(per07SubmitterCommunicationNoQlfr3, rhs.per07SubmitterCommunicationNoQlfr3).append(per08SubmitterCommunicationNo3, rhs.per08SubmitterCommunicationNo3).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

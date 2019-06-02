
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
    "mea01_testResultReferenceIdentificationCode",
    "mea02_testResultQlfr",
    "mea03_testResultValue"
})
public class MeaTestResult {

    @JsonProperty("mea01_testResultReferenceIdentificationCode")
    private String mea01TestResultReferenceIdentificationCode;
    @JsonProperty("mea02_testResultQlfr")
    private String mea02TestResultQlfr;
    @JsonProperty("mea03_testResultValue")
    private String mea03TestResultValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mea01_testResultReferenceIdentificationCode")
    public String getMea01TestResultReferenceIdentificationCode() {
        return mea01TestResultReferenceIdentificationCode;
    }

    @JsonProperty("mea01_testResultReferenceIdentificationCode")
    public void setMea01TestResultReferenceIdentificationCode(String mea01TestResultReferenceIdentificationCode) {
        this.mea01TestResultReferenceIdentificationCode = mea01TestResultReferenceIdentificationCode;
    }

    public MeaTestResult withMea01TestResultReferenceIdentificationCode(String mea01TestResultReferenceIdentificationCode) {
        this.mea01TestResultReferenceIdentificationCode = mea01TestResultReferenceIdentificationCode;
        return this;
    }

    @JsonProperty("mea02_testResultQlfr")
    public String getMea02TestResultQlfr() {
        return mea02TestResultQlfr;
    }

    @JsonProperty("mea02_testResultQlfr")
    public void setMea02TestResultQlfr(String mea02TestResultQlfr) {
        this.mea02TestResultQlfr = mea02TestResultQlfr;
    }

    public MeaTestResult withMea02TestResultQlfr(String mea02TestResultQlfr) {
        this.mea02TestResultQlfr = mea02TestResultQlfr;
        return this;
    }

    @JsonProperty("mea03_testResultValue")
    public String getMea03TestResultValue() {
        return mea03TestResultValue;
    }

    @JsonProperty("mea03_testResultValue")
    public void setMea03TestResultValue(String mea03TestResultValue) {
        this.mea03TestResultValue = mea03TestResultValue;
    }

    public MeaTestResult withMea03TestResultValue(String mea03TestResultValue) {
        this.mea03TestResultValue = mea03TestResultValue;
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

    public MeaTestResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mea01TestResultReferenceIdentificationCode).append(mea02TestResultQlfr).append(mea03TestResultValue).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeaTestResult) == false) {
            return false;
        }
        MeaTestResult rhs = ((MeaTestResult) other);
        return new EqualsBuilder().append(mea01TestResultReferenceIdentificationCode, rhs.mea01TestResultReferenceIdentificationCode).append(mea02TestResultQlfr, rhs.mea02TestResultQlfr).append(mea03TestResultValue, rhs.mea03TestResultValue).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

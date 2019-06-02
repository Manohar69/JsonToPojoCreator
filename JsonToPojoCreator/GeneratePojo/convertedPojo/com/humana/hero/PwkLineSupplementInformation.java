
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
    "pwk01_lineSupplementAttachReportTypeCode",
    "pwk02_lineSupplementAttachTransmissionCode",
    "pwk05_lineSupplementAttachControlNoQlfr",
    "pwk06_lineSupplementAttachControlNo"
})
public class PwkLineSupplementInformation {

    @JsonProperty("pwk01_lineSupplementAttachReportTypeCode")
    private String pwk01LineSupplementAttachReportTypeCode;
    @JsonProperty("pwk02_lineSupplementAttachTransmissionCode")
    private String pwk02LineSupplementAttachTransmissionCode;
    @JsonProperty("pwk05_lineSupplementAttachControlNoQlfr")
    private String pwk05LineSupplementAttachControlNoQlfr;
    @JsonProperty("pwk06_lineSupplementAttachControlNo")
    private String pwk06LineSupplementAttachControlNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pwk01_lineSupplementAttachReportTypeCode")
    public String getPwk01LineSupplementAttachReportTypeCode() {
        return pwk01LineSupplementAttachReportTypeCode;
    }

    @JsonProperty("pwk01_lineSupplementAttachReportTypeCode")
    public void setPwk01LineSupplementAttachReportTypeCode(String pwk01LineSupplementAttachReportTypeCode) {
        this.pwk01LineSupplementAttachReportTypeCode = pwk01LineSupplementAttachReportTypeCode;
    }

    public PwkLineSupplementInformation withPwk01LineSupplementAttachReportTypeCode(String pwk01LineSupplementAttachReportTypeCode) {
        this.pwk01LineSupplementAttachReportTypeCode = pwk01LineSupplementAttachReportTypeCode;
        return this;
    }

    @JsonProperty("pwk02_lineSupplementAttachTransmissionCode")
    public String getPwk02LineSupplementAttachTransmissionCode() {
        return pwk02LineSupplementAttachTransmissionCode;
    }

    @JsonProperty("pwk02_lineSupplementAttachTransmissionCode")
    public void setPwk02LineSupplementAttachTransmissionCode(String pwk02LineSupplementAttachTransmissionCode) {
        this.pwk02LineSupplementAttachTransmissionCode = pwk02LineSupplementAttachTransmissionCode;
    }

    public PwkLineSupplementInformation withPwk02LineSupplementAttachTransmissionCode(String pwk02LineSupplementAttachTransmissionCode) {
        this.pwk02LineSupplementAttachTransmissionCode = pwk02LineSupplementAttachTransmissionCode;
        return this;
    }

    @JsonProperty("pwk05_lineSupplementAttachControlNoQlfr")
    public String getPwk05LineSupplementAttachControlNoQlfr() {
        return pwk05LineSupplementAttachControlNoQlfr;
    }

    @JsonProperty("pwk05_lineSupplementAttachControlNoQlfr")
    public void setPwk05LineSupplementAttachControlNoQlfr(String pwk05LineSupplementAttachControlNoQlfr) {
        this.pwk05LineSupplementAttachControlNoQlfr = pwk05LineSupplementAttachControlNoQlfr;
    }

    public PwkLineSupplementInformation withPwk05LineSupplementAttachControlNoQlfr(String pwk05LineSupplementAttachControlNoQlfr) {
        this.pwk05LineSupplementAttachControlNoQlfr = pwk05LineSupplementAttachControlNoQlfr;
        return this;
    }

    @JsonProperty("pwk06_lineSupplementAttachControlNo")
    public String getPwk06LineSupplementAttachControlNo() {
        return pwk06LineSupplementAttachControlNo;
    }

    @JsonProperty("pwk06_lineSupplementAttachControlNo")
    public void setPwk06LineSupplementAttachControlNo(String pwk06LineSupplementAttachControlNo) {
        this.pwk06LineSupplementAttachControlNo = pwk06LineSupplementAttachControlNo;
    }

    public PwkLineSupplementInformation withPwk06LineSupplementAttachControlNo(String pwk06LineSupplementAttachControlNo) {
        this.pwk06LineSupplementAttachControlNo = pwk06LineSupplementAttachControlNo;
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

    public PwkLineSupplementInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pwk01LineSupplementAttachReportTypeCode).append(pwk02LineSupplementAttachTransmissionCode).append(pwk05LineSupplementAttachControlNoQlfr).append(pwk06LineSupplementAttachControlNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PwkLineSupplementInformation) == false) {
            return false;
        }
        PwkLineSupplementInformation rhs = ((PwkLineSupplementInformation) other);
        return new EqualsBuilder().append(pwk01LineSupplementAttachReportTypeCode, rhs.pwk01LineSupplementAttachReportTypeCode).append(pwk02LineSupplementAttachTransmissionCode, rhs.pwk02LineSupplementAttachTransmissionCode).append(pwk05LineSupplementAttachControlNoQlfr, rhs.pwk05LineSupplementAttachControlNoQlfr).append(pwk06LineSupplementAttachControlNo, rhs.pwk06LineSupplementAttachControlNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

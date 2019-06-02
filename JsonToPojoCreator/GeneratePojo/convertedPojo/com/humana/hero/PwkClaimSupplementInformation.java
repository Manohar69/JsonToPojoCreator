
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
    "pwk01_attachmentReportTypeCode",
    "pwk02_attachmentTransmissionCode",
    "pwk05_attachmentControlNoQlfr",
    "pwk06_attachmentControlNo"
})
public class PwkClaimSupplementInformation {

    @JsonProperty("pwk01_attachmentReportTypeCode")
    private String pwk01AttachmentReportTypeCode;
    @JsonProperty("pwk02_attachmentTransmissionCode")
    private String pwk02AttachmentTransmissionCode;
    @JsonProperty("pwk05_attachmentControlNoQlfr")
    private String pwk05AttachmentControlNoQlfr;
    @JsonProperty("pwk06_attachmentControlNo")
    private String pwk06AttachmentControlNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pwk01_attachmentReportTypeCode")
    public String getPwk01AttachmentReportTypeCode() {
        return pwk01AttachmentReportTypeCode;
    }

    @JsonProperty("pwk01_attachmentReportTypeCode")
    public void setPwk01AttachmentReportTypeCode(String pwk01AttachmentReportTypeCode) {
        this.pwk01AttachmentReportTypeCode = pwk01AttachmentReportTypeCode;
    }

    public PwkClaimSupplementInformation withPwk01AttachmentReportTypeCode(String pwk01AttachmentReportTypeCode) {
        this.pwk01AttachmentReportTypeCode = pwk01AttachmentReportTypeCode;
        return this;
    }

    @JsonProperty("pwk02_attachmentTransmissionCode")
    public String getPwk02AttachmentTransmissionCode() {
        return pwk02AttachmentTransmissionCode;
    }

    @JsonProperty("pwk02_attachmentTransmissionCode")
    public void setPwk02AttachmentTransmissionCode(String pwk02AttachmentTransmissionCode) {
        this.pwk02AttachmentTransmissionCode = pwk02AttachmentTransmissionCode;
    }

    public PwkClaimSupplementInformation withPwk02AttachmentTransmissionCode(String pwk02AttachmentTransmissionCode) {
        this.pwk02AttachmentTransmissionCode = pwk02AttachmentTransmissionCode;
        return this;
    }

    @JsonProperty("pwk05_attachmentControlNoQlfr")
    public String getPwk05AttachmentControlNoQlfr() {
        return pwk05AttachmentControlNoQlfr;
    }

    @JsonProperty("pwk05_attachmentControlNoQlfr")
    public void setPwk05AttachmentControlNoQlfr(String pwk05AttachmentControlNoQlfr) {
        this.pwk05AttachmentControlNoQlfr = pwk05AttachmentControlNoQlfr;
    }

    public PwkClaimSupplementInformation withPwk05AttachmentControlNoQlfr(String pwk05AttachmentControlNoQlfr) {
        this.pwk05AttachmentControlNoQlfr = pwk05AttachmentControlNoQlfr;
        return this;
    }

    @JsonProperty("pwk06_attachmentControlNo")
    public String getPwk06AttachmentControlNo() {
        return pwk06AttachmentControlNo;
    }

    @JsonProperty("pwk06_attachmentControlNo")
    public void setPwk06AttachmentControlNo(String pwk06AttachmentControlNo) {
        this.pwk06AttachmentControlNo = pwk06AttachmentControlNo;
    }

    public PwkClaimSupplementInformation withPwk06AttachmentControlNo(String pwk06AttachmentControlNo) {
        this.pwk06AttachmentControlNo = pwk06AttachmentControlNo;
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

    public PwkClaimSupplementInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pwk01AttachmentReportTypeCode).append(pwk02AttachmentTransmissionCode).append(pwk05AttachmentControlNoQlfr).append(pwk06AttachmentControlNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PwkClaimSupplementInformation) == false) {
            return false;
        }
        PwkClaimSupplementInformation rhs = ((PwkClaimSupplementInformation) other);
        return new EqualsBuilder().append(pwk01AttachmentReportTypeCode, rhs.pwk01AttachmentReportTypeCode).append(pwk02AttachmentTransmissionCode, rhs.pwk02AttachmentTransmissionCode).append(pwk05AttachmentControlNoQlfr, rhs.pwk05AttachmentControlNoQlfr).append(pwk06AttachmentControlNo, rhs.pwk06AttachmentControlNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

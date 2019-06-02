
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
    "frm01_questionNoLetter",
    "frm02_questionResponseCode",
    "frm03_questionResponse",
    "frm04_questionResponseDate",
    "frm05_questionResponsePercent"
})
public class FrmSupportingInformation {

    @JsonProperty("frm01_questionNoLetter")
    private String frm01QuestionNoLetter;
    @JsonProperty("frm02_questionResponseCode")
    private String frm02QuestionResponseCode;
    @JsonProperty("frm03_questionResponse")
    private String frm03QuestionResponse;
    @JsonProperty("frm04_questionResponseDate")
    private String frm04QuestionResponseDate;
    @JsonProperty("frm05_questionResponsePercent")
    private String frm05QuestionResponsePercent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("frm01_questionNoLetter")
    public String getFrm01QuestionNoLetter() {
        return frm01QuestionNoLetter;
    }

    @JsonProperty("frm01_questionNoLetter")
    public void setFrm01QuestionNoLetter(String frm01QuestionNoLetter) {
        this.frm01QuestionNoLetter = frm01QuestionNoLetter;
    }

    public FrmSupportingInformation withFrm01QuestionNoLetter(String frm01QuestionNoLetter) {
        this.frm01QuestionNoLetter = frm01QuestionNoLetter;
        return this;
    }

    @JsonProperty("frm02_questionResponseCode")
    public String getFrm02QuestionResponseCode() {
        return frm02QuestionResponseCode;
    }

    @JsonProperty("frm02_questionResponseCode")
    public void setFrm02QuestionResponseCode(String frm02QuestionResponseCode) {
        this.frm02QuestionResponseCode = frm02QuestionResponseCode;
    }

    public FrmSupportingInformation withFrm02QuestionResponseCode(String frm02QuestionResponseCode) {
        this.frm02QuestionResponseCode = frm02QuestionResponseCode;
        return this;
    }

    @JsonProperty("frm03_questionResponse")
    public String getFrm03QuestionResponse() {
        return frm03QuestionResponse;
    }

    @JsonProperty("frm03_questionResponse")
    public void setFrm03QuestionResponse(String frm03QuestionResponse) {
        this.frm03QuestionResponse = frm03QuestionResponse;
    }

    public FrmSupportingInformation withFrm03QuestionResponse(String frm03QuestionResponse) {
        this.frm03QuestionResponse = frm03QuestionResponse;
        return this;
    }

    @JsonProperty("frm04_questionResponseDate")
    public String getFrm04QuestionResponseDate() {
        return frm04QuestionResponseDate;
    }

    @JsonProperty("frm04_questionResponseDate")
    public void setFrm04QuestionResponseDate(String frm04QuestionResponseDate) {
        this.frm04QuestionResponseDate = frm04QuestionResponseDate;
    }

    public FrmSupportingInformation withFrm04QuestionResponseDate(String frm04QuestionResponseDate) {
        this.frm04QuestionResponseDate = frm04QuestionResponseDate;
        return this;
    }

    @JsonProperty("frm05_questionResponsePercent")
    public String getFrm05QuestionResponsePercent() {
        return frm05QuestionResponsePercent;
    }

    @JsonProperty("frm05_questionResponsePercent")
    public void setFrm05QuestionResponsePercent(String frm05QuestionResponsePercent) {
        this.frm05QuestionResponsePercent = frm05QuestionResponsePercent;
    }

    public FrmSupportingInformation withFrm05QuestionResponsePercent(String frm05QuestionResponsePercent) {
        this.frm05QuestionResponsePercent = frm05QuestionResponsePercent;
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

    public FrmSupportingInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(frm01QuestionNoLetter).append(frm02QuestionResponseCode).append(frm03QuestionResponse).append(frm04QuestionResponseDate).append(frm05QuestionResponsePercent).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FrmSupportingInformation) == false) {
            return false;
        }
        FrmSupportingInformation rhs = ((FrmSupportingInformation) other);
        return new EqualsBuilder().append(frm01QuestionNoLetter, rhs.frm01QuestionNoLetter).append(frm02QuestionResponseCode, rhs.frm02QuestionResponseCode).append(frm03QuestionResponse, rhs.frm03QuestionResponse).append(frm04QuestionResponseDate, rhs.frm04QuestionResponseDate).append(frm05QuestionResponsePercent, rhs.frm05QuestionResponsePercent).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

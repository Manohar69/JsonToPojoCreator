
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
    "crc01_patientVisionCodeCategory",
    "crc02_patientVisionConditionIndicator",
    "crc03_patientVisionConditionCode1",
    "crc04_patientVisionConditionCode2",
    "crc05_patientVisionConditionCode3",
    "crc06_patientVisionConditionCode4",
    "crc07_patientVisionConditionCode5"
})
public class CrcPatientVisionCondition {

    @JsonProperty("crc01_patientVisionCodeCategory")
    private String crc01PatientVisionCodeCategory;
    @JsonProperty("crc02_patientVisionConditionIndicator")
    private String crc02PatientVisionConditionIndicator;
    @JsonProperty("crc03_patientVisionConditionCode1")
    private String crc03PatientVisionConditionCode1;
    @JsonProperty("crc04_patientVisionConditionCode2")
    private String crc04PatientVisionConditionCode2;
    @JsonProperty("crc05_patientVisionConditionCode3")
    private String crc05PatientVisionConditionCode3;
    @JsonProperty("crc06_patientVisionConditionCode4")
    private String crc06PatientVisionConditionCode4;
    @JsonProperty("crc07_patientVisionConditionCode5")
    private String crc07PatientVisionConditionCode5;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("crc01_patientVisionCodeCategory")
    public String getCrc01PatientVisionCodeCategory() {
        return crc01PatientVisionCodeCategory;
    }

    @JsonProperty("crc01_patientVisionCodeCategory")
    public void setCrc01PatientVisionCodeCategory(String crc01PatientVisionCodeCategory) {
        this.crc01PatientVisionCodeCategory = crc01PatientVisionCodeCategory;
    }

    public CrcPatientVisionCondition withCrc01PatientVisionCodeCategory(String crc01PatientVisionCodeCategory) {
        this.crc01PatientVisionCodeCategory = crc01PatientVisionCodeCategory;
        return this;
    }

    @JsonProperty("crc02_patientVisionConditionIndicator")
    public String getCrc02PatientVisionConditionIndicator() {
        return crc02PatientVisionConditionIndicator;
    }

    @JsonProperty("crc02_patientVisionConditionIndicator")
    public void setCrc02PatientVisionConditionIndicator(String crc02PatientVisionConditionIndicator) {
        this.crc02PatientVisionConditionIndicator = crc02PatientVisionConditionIndicator;
    }

    public CrcPatientVisionCondition withCrc02PatientVisionConditionIndicator(String crc02PatientVisionConditionIndicator) {
        this.crc02PatientVisionConditionIndicator = crc02PatientVisionConditionIndicator;
        return this;
    }

    @JsonProperty("crc03_patientVisionConditionCode1")
    public String getCrc03PatientVisionConditionCode1() {
        return crc03PatientVisionConditionCode1;
    }

    @JsonProperty("crc03_patientVisionConditionCode1")
    public void setCrc03PatientVisionConditionCode1(String crc03PatientVisionConditionCode1) {
        this.crc03PatientVisionConditionCode1 = crc03PatientVisionConditionCode1;
    }

    public CrcPatientVisionCondition withCrc03PatientVisionConditionCode1(String crc03PatientVisionConditionCode1) {
        this.crc03PatientVisionConditionCode1 = crc03PatientVisionConditionCode1;
        return this;
    }

    @JsonProperty("crc04_patientVisionConditionCode2")
    public String getCrc04PatientVisionConditionCode2() {
        return crc04PatientVisionConditionCode2;
    }

    @JsonProperty("crc04_patientVisionConditionCode2")
    public void setCrc04PatientVisionConditionCode2(String crc04PatientVisionConditionCode2) {
        this.crc04PatientVisionConditionCode2 = crc04PatientVisionConditionCode2;
    }

    public CrcPatientVisionCondition withCrc04PatientVisionConditionCode2(String crc04PatientVisionConditionCode2) {
        this.crc04PatientVisionConditionCode2 = crc04PatientVisionConditionCode2;
        return this;
    }

    @JsonProperty("crc05_patientVisionConditionCode3")
    public String getCrc05PatientVisionConditionCode3() {
        return crc05PatientVisionConditionCode3;
    }

    @JsonProperty("crc05_patientVisionConditionCode3")
    public void setCrc05PatientVisionConditionCode3(String crc05PatientVisionConditionCode3) {
        this.crc05PatientVisionConditionCode3 = crc05PatientVisionConditionCode3;
    }

    public CrcPatientVisionCondition withCrc05PatientVisionConditionCode3(String crc05PatientVisionConditionCode3) {
        this.crc05PatientVisionConditionCode3 = crc05PatientVisionConditionCode3;
        return this;
    }

    @JsonProperty("crc06_patientVisionConditionCode4")
    public String getCrc06PatientVisionConditionCode4() {
        return crc06PatientVisionConditionCode4;
    }

    @JsonProperty("crc06_patientVisionConditionCode4")
    public void setCrc06PatientVisionConditionCode4(String crc06PatientVisionConditionCode4) {
        this.crc06PatientVisionConditionCode4 = crc06PatientVisionConditionCode4;
    }

    public CrcPatientVisionCondition withCrc06PatientVisionConditionCode4(String crc06PatientVisionConditionCode4) {
        this.crc06PatientVisionConditionCode4 = crc06PatientVisionConditionCode4;
        return this;
    }

    @JsonProperty("crc07_patientVisionConditionCode5")
    public String getCrc07PatientVisionConditionCode5() {
        return crc07PatientVisionConditionCode5;
    }

    @JsonProperty("crc07_patientVisionConditionCode5")
    public void setCrc07PatientVisionConditionCode5(String crc07PatientVisionConditionCode5) {
        this.crc07PatientVisionConditionCode5 = crc07PatientVisionConditionCode5;
    }

    public CrcPatientVisionCondition withCrc07PatientVisionConditionCode5(String crc07PatientVisionConditionCode5) {
        this.crc07PatientVisionConditionCode5 = crc07PatientVisionConditionCode5;
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

    public CrcPatientVisionCondition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(crc01PatientVisionCodeCategory).append(crc02PatientVisionConditionIndicator).append(crc03PatientVisionConditionCode1).append(crc04PatientVisionConditionCode2).append(crc05PatientVisionConditionCode3).append(crc06PatientVisionConditionCode4).append(crc07PatientVisionConditionCode5).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrcPatientVisionCondition) == false) {
            return false;
        }
        CrcPatientVisionCondition rhs = ((CrcPatientVisionCondition) other);
        return new EqualsBuilder().append(crc01PatientVisionCodeCategory, rhs.crc01PatientVisionCodeCategory).append(crc02PatientVisionConditionIndicator, rhs.crc02PatientVisionConditionIndicator).append(crc03PatientVisionConditionCode1, rhs.crc03PatientVisionConditionCode1).append(crc04PatientVisionConditionCode2, rhs.crc04PatientVisionConditionCode2).append(crc05PatientVisionConditionCode3, rhs.crc05PatientVisionConditionCode3).append(crc06PatientVisionConditionCode4, rhs.crc06PatientVisionConditionCode4).append(crc07PatientVisionConditionCode5, rhs.crc07PatientVisionConditionCode5).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

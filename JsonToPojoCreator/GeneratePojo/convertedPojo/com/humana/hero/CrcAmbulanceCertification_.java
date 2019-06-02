
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
    "crc01_ambulanceCertificationConditionCode",
    "crc02_ambulanceCertificationConditionIndicator",
    "crc03_ambulanceCertificationConditionCode1",
    "crc04_ambulanceCertificationConditionCode2",
    "crc05_ambulanceCertificationConditionCode3",
    "crc06_ambulanceCertificationConditionCode4",
    "crc07_ambulanceCertificationConditionCode5"
})
public class CrcAmbulanceCertification_ {

    @JsonProperty("crc01_ambulanceCertificationConditionCode")
    private String crc01AmbulanceCertificationConditionCode;
    @JsonProperty("crc02_ambulanceCertificationConditionIndicator")
    private String crc02AmbulanceCertificationConditionIndicator;
    @JsonProperty("crc03_ambulanceCertificationConditionCode1")
    private String crc03AmbulanceCertificationConditionCode1;
    @JsonProperty("crc04_ambulanceCertificationConditionCode2")
    private String crc04AmbulanceCertificationConditionCode2;
    @JsonProperty("crc05_ambulanceCertificationConditionCode3")
    private String crc05AmbulanceCertificationConditionCode3;
    @JsonProperty("crc06_ambulanceCertificationConditionCode4")
    private String crc06AmbulanceCertificationConditionCode4;
    @JsonProperty("crc07_ambulanceCertificationConditionCode5")
    private String crc07AmbulanceCertificationConditionCode5;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("crc01_ambulanceCertificationConditionCode")
    public String getCrc01AmbulanceCertificationConditionCode() {
        return crc01AmbulanceCertificationConditionCode;
    }

    @JsonProperty("crc01_ambulanceCertificationConditionCode")
    public void setCrc01AmbulanceCertificationConditionCode(String crc01AmbulanceCertificationConditionCode) {
        this.crc01AmbulanceCertificationConditionCode = crc01AmbulanceCertificationConditionCode;
    }

    public CrcAmbulanceCertification_ withCrc01AmbulanceCertificationConditionCode(String crc01AmbulanceCertificationConditionCode) {
        this.crc01AmbulanceCertificationConditionCode = crc01AmbulanceCertificationConditionCode;
        return this;
    }

    @JsonProperty("crc02_ambulanceCertificationConditionIndicator")
    public String getCrc02AmbulanceCertificationConditionIndicator() {
        return crc02AmbulanceCertificationConditionIndicator;
    }

    @JsonProperty("crc02_ambulanceCertificationConditionIndicator")
    public void setCrc02AmbulanceCertificationConditionIndicator(String crc02AmbulanceCertificationConditionIndicator) {
        this.crc02AmbulanceCertificationConditionIndicator = crc02AmbulanceCertificationConditionIndicator;
    }

    public CrcAmbulanceCertification_ withCrc02AmbulanceCertificationConditionIndicator(String crc02AmbulanceCertificationConditionIndicator) {
        this.crc02AmbulanceCertificationConditionIndicator = crc02AmbulanceCertificationConditionIndicator;
        return this;
    }

    @JsonProperty("crc03_ambulanceCertificationConditionCode1")
    public String getCrc03AmbulanceCertificationConditionCode1() {
        return crc03AmbulanceCertificationConditionCode1;
    }

    @JsonProperty("crc03_ambulanceCertificationConditionCode1")
    public void setCrc03AmbulanceCertificationConditionCode1(String crc03AmbulanceCertificationConditionCode1) {
        this.crc03AmbulanceCertificationConditionCode1 = crc03AmbulanceCertificationConditionCode1;
    }

    public CrcAmbulanceCertification_ withCrc03AmbulanceCertificationConditionCode1(String crc03AmbulanceCertificationConditionCode1) {
        this.crc03AmbulanceCertificationConditionCode1 = crc03AmbulanceCertificationConditionCode1;
        return this;
    }

    @JsonProperty("crc04_ambulanceCertificationConditionCode2")
    public String getCrc04AmbulanceCertificationConditionCode2() {
        return crc04AmbulanceCertificationConditionCode2;
    }

    @JsonProperty("crc04_ambulanceCertificationConditionCode2")
    public void setCrc04AmbulanceCertificationConditionCode2(String crc04AmbulanceCertificationConditionCode2) {
        this.crc04AmbulanceCertificationConditionCode2 = crc04AmbulanceCertificationConditionCode2;
    }

    public CrcAmbulanceCertification_ withCrc04AmbulanceCertificationConditionCode2(String crc04AmbulanceCertificationConditionCode2) {
        this.crc04AmbulanceCertificationConditionCode2 = crc04AmbulanceCertificationConditionCode2;
        return this;
    }

    @JsonProperty("crc05_ambulanceCertificationConditionCode3")
    public String getCrc05AmbulanceCertificationConditionCode3() {
        return crc05AmbulanceCertificationConditionCode3;
    }

    @JsonProperty("crc05_ambulanceCertificationConditionCode3")
    public void setCrc05AmbulanceCertificationConditionCode3(String crc05AmbulanceCertificationConditionCode3) {
        this.crc05AmbulanceCertificationConditionCode3 = crc05AmbulanceCertificationConditionCode3;
    }

    public CrcAmbulanceCertification_ withCrc05AmbulanceCertificationConditionCode3(String crc05AmbulanceCertificationConditionCode3) {
        this.crc05AmbulanceCertificationConditionCode3 = crc05AmbulanceCertificationConditionCode3;
        return this;
    }

    @JsonProperty("crc06_ambulanceCertificationConditionCode4")
    public String getCrc06AmbulanceCertificationConditionCode4() {
        return crc06AmbulanceCertificationConditionCode4;
    }

    @JsonProperty("crc06_ambulanceCertificationConditionCode4")
    public void setCrc06AmbulanceCertificationConditionCode4(String crc06AmbulanceCertificationConditionCode4) {
        this.crc06AmbulanceCertificationConditionCode4 = crc06AmbulanceCertificationConditionCode4;
    }

    public CrcAmbulanceCertification_ withCrc06AmbulanceCertificationConditionCode4(String crc06AmbulanceCertificationConditionCode4) {
        this.crc06AmbulanceCertificationConditionCode4 = crc06AmbulanceCertificationConditionCode4;
        return this;
    }

    @JsonProperty("crc07_ambulanceCertificationConditionCode5")
    public String getCrc07AmbulanceCertificationConditionCode5() {
        return crc07AmbulanceCertificationConditionCode5;
    }

    @JsonProperty("crc07_ambulanceCertificationConditionCode5")
    public void setCrc07AmbulanceCertificationConditionCode5(String crc07AmbulanceCertificationConditionCode5) {
        this.crc07AmbulanceCertificationConditionCode5 = crc07AmbulanceCertificationConditionCode5;
    }

    public CrcAmbulanceCertification_ withCrc07AmbulanceCertificationConditionCode5(String crc07AmbulanceCertificationConditionCode5) {
        this.crc07AmbulanceCertificationConditionCode5 = crc07AmbulanceCertificationConditionCode5;
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

    public CrcAmbulanceCertification_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(crc01AmbulanceCertificationConditionCode).append(crc02AmbulanceCertificationConditionIndicator).append(crc03AmbulanceCertificationConditionCode1).append(crc04AmbulanceCertificationConditionCode2).append(crc05AmbulanceCertificationConditionCode3).append(crc06AmbulanceCertificationConditionCode4).append(crc07AmbulanceCertificationConditionCode5).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrcAmbulanceCertification_) == false) {
            return false;
        }
        CrcAmbulanceCertification_ rhs = ((CrcAmbulanceCertification_) other);
        return new EqualsBuilder().append(crc01AmbulanceCertificationConditionCode, rhs.crc01AmbulanceCertificationConditionCode).append(crc02AmbulanceCertificationConditionIndicator, rhs.crc02AmbulanceCertificationConditionIndicator).append(crc03AmbulanceCertificationConditionCode1, rhs.crc03AmbulanceCertificationConditionCode1).append(crc04AmbulanceCertificationConditionCode2, rhs.crc04AmbulanceCertificationConditionCode2).append(crc05AmbulanceCertificationConditionCode3, rhs.crc05AmbulanceCertificationConditionCode3).append(crc06AmbulanceCertificationConditionCode4, rhs.crc06AmbulanceCertificationConditionCode4).append(crc07AmbulanceCertificationConditionCode5, rhs.crc07AmbulanceCertificationConditionCode5).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

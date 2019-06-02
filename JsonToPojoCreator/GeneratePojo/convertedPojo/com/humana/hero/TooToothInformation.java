
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
    "too01_universalNationalToothDesignationSystem",
    "too02_toothCode",
    "too03_toothSurface",
    "too03_01_toothSurfaceCode1",
    "too03_02_toothSurfaceCode2",
    "too03_03_toothSurfaceCode3",
    "too03_04_toothSurfaceCode4",
    "too03_05_toothSurfaceCode5"
})
public class TooToothInformation {

    @JsonProperty("too01_universalNationalToothDesignationSystem")
    private String too01UniversalNationalToothDesignationSystem;
    @JsonProperty("too02_toothCode")
    private String too02ToothCode;
    @JsonProperty("too03_toothSurface")
    private String too03ToothSurface;
    @JsonProperty("too03_01_toothSurfaceCode1")
    private String too0301ToothSurfaceCode1;
    @JsonProperty("too03_02_toothSurfaceCode2")
    private String too0302ToothSurfaceCode2;
    @JsonProperty("too03_03_toothSurfaceCode3")
    private String too0303ToothSurfaceCode3;
    @JsonProperty("too03_04_toothSurfaceCode4")
    private String too0304ToothSurfaceCode4;
    @JsonProperty("too03_05_toothSurfaceCode5")
    private String too0305ToothSurfaceCode5;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("too01_universalNationalToothDesignationSystem")
    public String getToo01UniversalNationalToothDesignationSystem() {
        return too01UniversalNationalToothDesignationSystem;
    }

    @JsonProperty("too01_universalNationalToothDesignationSystem")
    public void setToo01UniversalNationalToothDesignationSystem(String too01UniversalNationalToothDesignationSystem) {
        this.too01UniversalNationalToothDesignationSystem = too01UniversalNationalToothDesignationSystem;
    }

    public TooToothInformation withToo01UniversalNationalToothDesignationSystem(String too01UniversalNationalToothDesignationSystem) {
        this.too01UniversalNationalToothDesignationSystem = too01UniversalNationalToothDesignationSystem;
        return this;
    }

    @JsonProperty("too02_toothCode")
    public String getToo02ToothCode() {
        return too02ToothCode;
    }

    @JsonProperty("too02_toothCode")
    public void setToo02ToothCode(String too02ToothCode) {
        this.too02ToothCode = too02ToothCode;
    }

    public TooToothInformation withToo02ToothCode(String too02ToothCode) {
        this.too02ToothCode = too02ToothCode;
        return this;
    }

    @JsonProperty("too03_toothSurface")
    public String getToo03ToothSurface() {
        return too03ToothSurface;
    }

    @JsonProperty("too03_toothSurface")
    public void setToo03ToothSurface(String too03ToothSurface) {
        this.too03ToothSurface = too03ToothSurface;
    }

    public TooToothInformation withToo03ToothSurface(String too03ToothSurface) {
        this.too03ToothSurface = too03ToothSurface;
        return this;
    }

    @JsonProperty("too03_01_toothSurfaceCode1")
    public String getToo0301ToothSurfaceCode1() {
        return too0301ToothSurfaceCode1;
    }

    @JsonProperty("too03_01_toothSurfaceCode1")
    public void setToo0301ToothSurfaceCode1(String too0301ToothSurfaceCode1) {
        this.too0301ToothSurfaceCode1 = too0301ToothSurfaceCode1;
    }

    public TooToothInformation withToo0301ToothSurfaceCode1(String too0301ToothSurfaceCode1) {
        this.too0301ToothSurfaceCode1 = too0301ToothSurfaceCode1;
        return this;
    }

    @JsonProperty("too03_02_toothSurfaceCode2")
    public String getToo0302ToothSurfaceCode2() {
        return too0302ToothSurfaceCode2;
    }

    @JsonProperty("too03_02_toothSurfaceCode2")
    public void setToo0302ToothSurfaceCode2(String too0302ToothSurfaceCode2) {
        this.too0302ToothSurfaceCode2 = too0302ToothSurfaceCode2;
    }

    public TooToothInformation withToo0302ToothSurfaceCode2(String too0302ToothSurfaceCode2) {
        this.too0302ToothSurfaceCode2 = too0302ToothSurfaceCode2;
        return this;
    }

    @JsonProperty("too03_03_toothSurfaceCode3")
    public String getToo0303ToothSurfaceCode3() {
        return too0303ToothSurfaceCode3;
    }

    @JsonProperty("too03_03_toothSurfaceCode3")
    public void setToo0303ToothSurfaceCode3(String too0303ToothSurfaceCode3) {
        this.too0303ToothSurfaceCode3 = too0303ToothSurfaceCode3;
    }

    public TooToothInformation withToo0303ToothSurfaceCode3(String too0303ToothSurfaceCode3) {
        this.too0303ToothSurfaceCode3 = too0303ToothSurfaceCode3;
        return this;
    }

    @JsonProperty("too03_04_toothSurfaceCode4")
    public String getToo0304ToothSurfaceCode4() {
        return too0304ToothSurfaceCode4;
    }

    @JsonProperty("too03_04_toothSurfaceCode4")
    public void setToo0304ToothSurfaceCode4(String too0304ToothSurfaceCode4) {
        this.too0304ToothSurfaceCode4 = too0304ToothSurfaceCode4;
    }

    public TooToothInformation withToo0304ToothSurfaceCode4(String too0304ToothSurfaceCode4) {
        this.too0304ToothSurfaceCode4 = too0304ToothSurfaceCode4;
        return this;
    }

    @JsonProperty("too03_05_toothSurfaceCode5")
    public String getToo0305ToothSurfaceCode5() {
        return too0305ToothSurfaceCode5;
    }

    @JsonProperty("too03_05_toothSurfaceCode5")
    public void setToo0305ToothSurfaceCode5(String too0305ToothSurfaceCode5) {
        this.too0305ToothSurfaceCode5 = too0305ToothSurfaceCode5;
    }

    public TooToothInformation withToo0305ToothSurfaceCode5(String too0305ToothSurfaceCode5) {
        this.too0305ToothSurfaceCode5 = too0305ToothSurfaceCode5;
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

    public TooToothInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(too01UniversalNationalToothDesignationSystem).append(too02ToothCode).append(too03ToothSurface).append(too0301ToothSurfaceCode1).append(too0302ToothSurfaceCode2).append(too0303ToothSurfaceCode3).append(too0304ToothSurfaceCode4).append(too0305ToothSurfaceCode5).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TooToothInformation) == false) {
            return false;
        }
        TooToothInformation rhs = ((TooToothInformation) other);
        return new EqualsBuilder().append(too01UniversalNationalToothDesignationSystem, rhs.too01UniversalNationalToothDesignationSystem).append(too02ToothCode, rhs.too02ToothCode).append(too03ToothSurface, rhs.too03ToothSurface).append(too0301ToothSurfaceCode1, rhs.too0301ToothSurfaceCode1).append(too0302ToothSurfaceCode2, rhs.too0302ToothSurfaceCode2).append(too0303ToothSurfaceCode3, rhs.too0303ToothSurfaceCode3).append(too0304ToothSurfaceCode4, rhs.too0304ToothSurfaceCode4).append(too0305ToothSurfaceCode5, rhs.too0305ToothSurfaceCode5).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

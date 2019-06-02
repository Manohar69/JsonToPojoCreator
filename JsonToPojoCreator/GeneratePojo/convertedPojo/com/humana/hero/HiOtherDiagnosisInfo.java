
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
    "hi01_otherDiagnosisInfo1",
    "hi01_01_otherDiagnosisInfoQlfrCode1",
    "hi01_02_otherDiagnosisInfoCode1",
    "hi01_09_otherDiagnosisInfoPresentOnAdmissionIndicator1",
    "hi02_otherDiagnosisInfo2",
    "hi02_01_otherDiagnosisInfoQlfrCode2",
    "hi02_02_otherDiagnosisInfoCode2",
    "hi02_09_otherDiagnosisInfoPresentOnAdmissionIndicator2",
    "hi03_otherDiagnosisInfo3",
    "hi03_01_otherDiagnosisInfoQlfrCode3",
    "hi03_02_otherDiagnosisInfoCode3",
    "hi03_09_otherDiagnosisInfoPresentOnAdmissionIndicator3",
    "hi04_otherDiagnosisInfo4",
    "hi04_01_otherDiagnosisInfoQlfrCode4",
    "hi04_02_otherDiagnosisInfoCode4",
    "hi04_09_otherDiagnosisInfoPresentOnAdmissionIndicator4",
    "hi05_otherDiagnosisInfo5",
    "hi05_01_otherDiagnosisInfoQlfrCode5",
    "hi05_02_otherDiagnosisInfoCode5",
    "hi05_09_otherDiagnosisInfoPresentOnAdmissionIndicator5",
    "hi06_otherDiagnosisInfo6",
    "hi06_01_otherDiagnosisInfoQlfrCode6",
    "hi06_02_otherDiagnosisInfoCode6",
    "hi06_09_otherDiagnosisInfoPresentOnAdmissionIndicator6",
    "hi07_otherDiagnosisInfo7",
    "hi07_01_otherDiagnosisInfoQlfrCode7",
    "hi07_02_otherDiagnosisInfoCode7",
    "hi07_09_otherDiagnosisInfoPresentOnAdmissionIndicator7",
    "hi08_otherDiagnosisInfo8",
    "hi08_01_otherDiagnosisInfoQlfrCode8",
    "hi08_02_otherDiagnosisInfoCode8",
    "hi08_09_otherDiagnosisInfoPresentOnAdmissionIndicator8",
    "hi09_otherDiagnosisInfo9",
    "hi09_01_otherDiagnosisInfoQlfrCode9",
    "hi09_02_otherDiagnosisInfoCode9",
    "hi09_09_otherDiagnosisInfoPresentOnAdmissionIndicator9",
    "hi10_otherDiagnosisInfo10",
    "hi10_01_otherDiagnosisInfoQlfrCode10",
    "hi10_02_otherDiagnosisInfoCode10",
    "hi10_09_otherDiagnosisInfoPresentOnAdmissionIndicator10",
    "hi11_otherDiagnosisInfo11",
    "hi11_01_otherDiagnosisInfoQlfrCode11",
    "hi11_02_otherDiagnosisInfoCode11",
    "hi11_09_otherDiagnosisInfoPresentOnAdmissionIndicator11",
    "hi12_otherDiagnosisInfo12",
    "hi12_01_otherDiagnosisInfoQlfrCode12",
    "hi12_02_otherDiagnosisInfoCode12",
    "hi12_09_otherDiagnosisInfoPresentOnAdmissionIndicator12"
})
public class HiOtherDiagnosisInfo {

    @JsonProperty("hi01_otherDiagnosisInfo1")
    private String hi01OtherDiagnosisInfo1;
    @JsonProperty("hi01_01_otherDiagnosisInfoQlfrCode1")
    private String hi0101OtherDiagnosisInfoQlfrCode1;
    @JsonProperty("hi01_02_otherDiagnosisInfoCode1")
    private String hi0102OtherDiagnosisInfoCode1;
    @JsonProperty("hi01_09_otherDiagnosisInfoPresentOnAdmissionIndicator1")
    private String hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1;
    @JsonProperty("hi02_otherDiagnosisInfo2")
    private String hi02OtherDiagnosisInfo2;
    @JsonProperty("hi02_01_otherDiagnosisInfoQlfrCode2")
    private String hi0201OtherDiagnosisInfoQlfrCode2;
    @JsonProperty("hi02_02_otherDiagnosisInfoCode2")
    private String hi0202OtherDiagnosisInfoCode2;
    @JsonProperty("hi02_09_otherDiagnosisInfoPresentOnAdmissionIndicator2")
    private String hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2;
    @JsonProperty("hi03_otherDiagnosisInfo3")
    private String hi03OtherDiagnosisInfo3;
    @JsonProperty("hi03_01_otherDiagnosisInfoQlfrCode3")
    private String hi0301OtherDiagnosisInfoQlfrCode3;
    @JsonProperty("hi03_02_otherDiagnosisInfoCode3")
    private String hi0302OtherDiagnosisInfoCode3;
    @JsonProperty("hi03_09_otherDiagnosisInfoPresentOnAdmissionIndicator3")
    private String hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3;
    @JsonProperty("hi04_otherDiagnosisInfo4")
    private String hi04OtherDiagnosisInfo4;
    @JsonProperty("hi04_01_otherDiagnosisInfoQlfrCode4")
    private String hi0401OtherDiagnosisInfoQlfrCode4;
    @JsonProperty("hi04_02_otherDiagnosisInfoCode4")
    private String hi0402OtherDiagnosisInfoCode4;
    @JsonProperty("hi04_09_otherDiagnosisInfoPresentOnAdmissionIndicator4")
    private String hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4;
    @JsonProperty("hi05_otherDiagnosisInfo5")
    private String hi05OtherDiagnosisInfo5;
    @JsonProperty("hi05_01_otherDiagnosisInfoQlfrCode5")
    private String hi0501OtherDiagnosisInfoQlfrCode5;
    @JsonProperty("hi05_02_otherDiagnosisInfoCode5")
    private String hi0502OtherDiagnosisInfoCode5;
    @JsonProperty("hi05_09_otherDiagnosisInfoPresentOnAdmissionIndicator5")
    private String hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5;
    @JsonProperty("hi06_otherDiagnosisInfo6")
    private String hi06OtherDiagnosisInfo6;
    @JsonProperty("hi06_01_otherDiagnosisInfoQlfrCode6")
    private String hi0601OtherDiagnosisInfoQlfrCode6;
    @JsonProperty("hi06_02_otherDiagnosisInfoCode6")
    private String hi0602OtherDiagnosisInfoCode6;
    @JsonProperty("hi06_09_otherDiagnosisInfoPresentOnAdmissionIndicator6")
    private String hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6;
    @JsonProperty("hi07_otherDiagnosisInfo7")
    private String hi07OtherDiagnosisInfo7;
    @JsonProperty("hi07_01_otherDiagnosisInfoQlfrCode7")
    private String hi0701OtherDiagnosisInfoQlfrCode7;
    @JsonProperty("hi07_02_otherDiagnosisInfoCode7")
    private String hi0702OtherDiagnosisInfoCode7;
    @JsonProperty("hi07_09_otherDiagnosisInfoPresentOnAdmissionIndicator7")
    private String hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7;
    @JsonProperty("hi08_otherDiagnosisInfo8")
    private String hi08OtherDiagnosisInfo8;
    @JsonProperty("hi08_01_otherDiagnosisInfoQlfrCode8")
    private String hi0801OtherDiagnosisInfoQlfrCode8;
    @JsonProperty("hi08_02_otherDiagnosisInfoCode8")
    private String hi0802OtherDiagnosisInfoCode8;
    @JsonProperty("hi08_09_otherDiagnosisInfoPresentOnAdmissionIndicator8")
    private String hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8;
    @JsonProperty("hi09_otherDiagnosisInfo9")
    private String hi09OtherDiagnosisInfo9;
    @JsonProperty("hi09_01_otherDiagnosisInfoQlfrCode9")
    private String hi0901OtherDiagnosisInfoQlfrCode9;
    @JsonProperty("hi09_02_otherDiagnosisInfoCode9")
    private String hi0902OtherDiagnosisInfoCode9;
    @JsonProperty("hi09_09_otherDiagnosisInfoPresentOnAdmissionIndicator9")
    private String hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9;
    @JsonProperty("hi10_otherDiagnosisInfo10")
    private String hi10OtherDiagnosisInfo10;
    @JsonProperty("hi10_01_otherDiagnosisInfoQlfrCode10")
    private String hi1001OtherDiagnosisInfoQlfrCode10;
    @JsonProperty("hi10_02_otherDiagnosisInfoCode10")
    private String hi1002OtherDiagnosisInfoCode10;
    @JsonProperty("hi10_09_otherDiagnosisInfoPresentOnAdmissionIndicator10")
    private String hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10;
    @JsonProperty("hi11_otherDiagnosisInfo11")
    private String hi11OtherDiagnosisInfo11;
    @JsonProperty("hi11_01_otherDiagnosisInfoQlfrCode11")
    private String hi1101OtherDiagnosisInfoQlfrCode11;
    @JsonProperty("hi11_02_otherDiagnosisInfoCode11")
    private String hi1102OtherDiagnosisInfoCode11;
    @JsonProperty("hi11_09_otherDiagnosisInfoPresentOnAdmissionIndicator11")
    private String hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11;
    @JsonProperty("hi12_otherDiagnosisInfo12")
    private String hi12OtherDiagnosisInfo12;
    @JsonProperty("hi12_01_otherDiagnosisInfoQlfrCode12")
    private String hi1201OtherDiagnosisInfoQlfrCode12;
    @JsonProperty("hi12_02_otherDiagnosisInfoCode12")
    private String hi1202OtherDiagnosisInfoCode12;
    @JsonProperty("hi12_09_otherDiagnosisInfoPresentOnAdmissionIndicator12")
    private String hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hi01_otherDiagnosisInfo1")
    public String getHi01OtherDiagnosisInfo1() {
        return hi01OtherDiagnosisInfo1;
    }

    @JsonProperty("hi01_otherDiagnosisInfo1")
    public void setHi01OtherDiagnosisInfo1(String hi01OtherDiagnosisInfo1) {
        this.hi01OtherDiagnosisInfo1 = hi01OtherDiagnosisInfo1;
    }

    public HiOtherDiagnosisInfo withHi01OtherDiagnosisInfo1(String hi01OtherDiagnosisInfo1) {
        this.hi01OtherDiagnosisInfo1 = hi01OtherDiagnosisInfo1;
        return this;
    }

    @JsonProperty("hi01_01_otherDiagnosisInfoQlfrCode1")
    public String getHi0101OtherDiagnosisInfoQlfrCode1() {
        return hi0101OtherDiagnosisInfoQlfrCode1;
    }

    @JsonProperty("hi01_01_otherDiagnosisInfoQlfrCode1")
    public void setHi0101OtherDiagnosisInfoQlfrCode1(String hi0101OtherDiagnosisInfoQlfrCode1) {
        this.hi0101OtherDiagnosisInfoQlfrCode1 = hi0101OtherDiagnosisInfoQlfrCode1;
    }

    public HiOtherDiagnosisInfo withHi0101OtherDiagnosisInfoQlfrCode1(String hi0101OtherDiagnosisInfoQlfrCode1) {
        this.hi0101OtherDiagnosisInfoQlfrCode1 = hi0101OtherDiagnosisInfoQlfrCode1;
        return this;
    }

    @JsonProperty("hi01_02_otherDiagnosisInfoCode1")
    public String getHi0102OtherDiagnosisInfoCode1() {
        return hi0102OtherDiagnosisInfoCode1;
    }

    @JsonProperty("hi01_02_otherDiagnosisInfoCode1")
    public void setHi0102OtherDiagnosisInfoCode1(String hi0102OtherDiagnosisInfoCode1) {
        this.hi0102OtherDiagnosisInfoCode1 = hi0102OtherDiagnosisInfoCode1;
    }

    public HiOtherDiagnosisInfo withHi0102OtherDiagnosisInfoCode1(String hi0102OtherDiagnosisInfoCode1) {
        this.hi0102OtherDiagnosisInfoCode1 = hi0102OtherDiagnosisInfoCode1;
        return this;
    }

    @JsonProperty("hi01_09_otherDiagnosisInfoPresentOnAdmissionIndicator1")
    public String getHi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1() {
        return hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1;
    }

    @JsonProperty("hi01_09_otherDiagnosisInfoPresentOnAdmissionIndicator1")
    public void setHi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1(String hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1) {
        this.hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1 = hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1;
    }

    public HiOtherDiagnosisInfo withHi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1(String hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1) {
        this.hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1 = hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1;
        return this;
    }

    @JsonProperty("hi02_otherDiagnosisInfo2")
    public String getHi02OtherDiagnosisInfo2() {
        return hi02OtherDiagnosisInfo2;
    }

    @JsonProperty("hi02_otherDiagnosisInfo2")
    public void setHi02OtherDiagnosisInfo2(String hi02OtherDiagnosisInfo2) {
        this.hi02OtherDiagnosisInfo2 = hi02OtherDiagnosisInfo2;
    }

    public HiOtherDiagnosisInfo withHi02OtherDiagnosisInfo2(String hi02OtherDiagnosisInfo2) {
        this.hi02OtherDiagnosisInfo2 = hi02OtherDiagnosisInfo2;
        return this;
    }

    @JsonProperty("hi02_01_otherDiagnosisInfoQlfrCode2")
    public String getHi0201OtherDiagnosisInfoQlfrCode2() {
        return hi0201OtherDiagnosisInfoQlfrCode2;
    }

    @JsonProperty("hi02_01_otherDiagnosisInfoQlfrCode2")
    public void setHi0201OtherDiagnosisInfoQlfrCode2(String hi0201OtherDiagnosisInfoQlfrCode2) {
        this.hi0201OtherDiagnosisInfoQlfrCode2 = hi0201OtherDiagnosisInfoQlfrCode2;
    }

    public HiOtherDiagnosisInfo withHi0201OtherDiagnosisInfoQlfrCode2(String hi0201OtherDiagnosisInfoQlfrCode2) {
        this.hi0201OtherDiagnosisInfoQlfrCode2 = hi0201OtherDiagnosisInfoQlfrCode2;
        return this;
    }

    @JsonProperty("hi02_02_otherDiagnosisInfoCode2")
    public String getHi0202OtherDiagnosisInfoCode2() {
        return hi0202OtherDiagnosisInfoCode2;
    }

    @JsonProperty("hi02_02_otherDiagnosisInfoCode2")
    public void setHi0202OtherDiagnosisInfoCode2(String hi0202OtherDiagnosisInfoCode2) {
        this.hi0202OtherDiagnosisInfoCode2 = hi0202OtherDiagnosisInfoCode2;
    }

    public HiOtherDiagnosisInfo withHi0202OtherDiagnosisInfoCode2(String hi0202OtherDiagnosisInfoCode2) {
        this.hi0202OtherDiagnosisInfoCode2 = hi0202OtherDiagnosisInfoCode2;
        return this;
    }

    @JsonProperty("hi02_09_otherDiagnosisInfoPresentOnAdmissionIndicator2")
    public String getHi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2() {
        return hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2;
    }

    @JsonProperty("hi02_09_otherDiagnosisInfoPresentOnAdmissionIndicator2")
    public void setHi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2(String hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2) {
        this.hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2 = hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2;
    }

    public HiOtherDiagnosisInfo withHi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2(String hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2) {
        this.hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2 = hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2;
        return this;
    }

    @JsonProperty("hi03_otherDiagnosisInfo3")
    public String getHi03OtherDiagnosisInfo3() {
        return hi03OtherDiagnosisInfo3;
    }

    @JsonProperty("hi03_otherDiagnosisInfo3")
    public void setHi03OtherDiagnosisInfo3(String hi03OtherDiagnosisInfo3) {
        this.hi03OtherDiagnosisInfo3 = hi03OtherDiagnosisInfo3;
    }

    public HiOtherDiagnosisInfo withHi03OtherDiagnosisInfo3(String hi03OtherDiagnosisInfo3) {
        this.hi03OtherDiagnosisInfo3 = hi03OtherDiagnosisInfo3;
        return this;
    }

    @JsonProperty("hi03_01_otherDiagnosisInfoQlfrCode3")
    public String getHi0301OtherDiagnosisInfoQlfrCode3() {
        return hi0301OtherDiagnosisInfoQlfrCode3;
    }

    @JsonProperty("hi03_01_otherDiagnosisInfoQlfrCode3")
    public void setHi0301OtherDiagnosisInfoQlfrCode3(String hi0301OtherDiagnosisInfoQlfrCode3) {
        this.hi0301OtherDiagnosisInfoQlfrCode3 = hi0301OtherDiagnosisInfoQlfrCode3;
    }

    public HiOtherDiagnosisInfo withHi0301OtherDiagnosisInfoQlfrCode3(String hi0301OtherDiagnosisInfoQlfrCode3) {
        this.hi0301OtherDiagnosisInfoQlfrCode3 = hi0301OtherDiagnosisInfoQlfrCode3;
        return this;
    }

    @JsonProperty("hi03_02_otherDiagnosisInfoCode3")
    public String getHi0302OtherDiagnosisInfoCode3() {
        return hi0302OtherDiagnosisInfoCode3;
    }

    @JsonProperty("hi03_02_otherDiagnosisInfoCode3")
    public void setHi0302OtherDiagnosisInfoCode3(String hi0302OtherDiagnosisInfoCode3) {
        this.hi0302OtherDiagnosisInfoCode3 = hi0302OtherDiagnosisInfoCode3;
    }

    public HiOtherDiagnosisInfo withHi0302OtherDiagnosisInfoCode3(String hi0302OtherDiagnosisInfoCode3) {
        this.hi0302OtherDiagnosisInfoCode3 = hi0302OtherDiagnosisInfoCode3;
        return this;
    }

    @JsonProperty("hi03_09_otherDiagnosisInfoPresentOnAdmissionIndicator3")
    public String getHi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3() {
        return hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3;
    }

    @JsonProperty("hi03_09_otherDiagnosisInfoPresentOnAdmissionIndicator3")
    public void setHi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3(String hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3) {
        this.hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3 = hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3;
    }

    public HiOtherDiagnosisInfo withHi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3(String hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3) {
        this.hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3 = hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3;
        return this;
    }

    @JsonProperty("hi04_otherDiagnosisInfo4")
    public String getHi04OtherDiagnosisInfo4() {
        return hi04OtherDiagnosisInfo4;
    }

    @JsonProperty("hi04_otherDiagnosisInfo4")
    public void setHi04OtherDiagnosisInfo4(String hi04OtherDiagnosisInfo4) {
        this.hi04OtherDiagnosisInfo4 = hi04OtherDiagnosisInfo4;
    }

    public HiOtherDiagnosisInfo withHi04OtherDiagnosisInfo4(String hi04OtherDiagnosisInfo4) {
        this.hi04OtherDiagnosisInfo4 = hi04OtherDiagnosisInfo4;
        return this;
    }

    @JsonProperty("hi04_01_otherDiagnosisInfoQlfrCode4")
    public String getHi0401OtherDiagnosisInfoQlfrCode4() {
        return hi0401OtherDiagnosisInfoQlfrCode4;
    }

    @JsonProperty("hi04_01_otherDiagnosisInfoQlfrCode4")
    public void setHi0401OtherDiagnosisInfoQlfrCode4(String hi0401OtherDiagnosisInfoQlfrCode4) {
        this.hi0401OtherDiagnosisInfoQlfrCode4 = hi0401OtherDiagnosisInfoQlfrCode4;
    }

    public HiOtherDiagnosisInfo withHi0401OtherDiagnosisInfoQlfrCode4(String hi0401OtherDiagnosisInfoQlfrCode4) {
        this.hi0401OtherDiagnosisInfoQlfrCode4 = hi0401OtherDiagnosisInfoQlfrCode4;
        return this;
    }

    @JsonProperty("hi04_02_otherDiagnosisInfoCode4")
    public String getHi0402OtherDiagnosisInfoCode4() {
        return hi0402OtherDiagnosisInfoCode4;
    }

    @JsonProperty("hi04_02_otherDiagnosisInfoCode4")
    public void setHi0402OtherDiagnosisInfoCode4(String hi0402OtherDiagnosisInfoCode4) {
        this.hi0402OtherDiagnosisInfoCode4 = hi0402OtherDiagnosisInfoCode4;
    }

    public HiOtherDiagnosisInfo withHi0402OtherDiagnosisInfoCode4(String hi0402OtherDiagnosisInfoCode4) {
        this.hi0402OtherDiagnosisInfoCode4 = hi0402OtherDiagnosisInfoCode4;
        return this;
    }

    @JsonProperty("hi04_09_otherDiagnosisInfoPresentOnAdmissionIndicator4")
    public String getHi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4() {
        return hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4;
    }

    @JsonProperty("hi04_09_otherDiagnosisInfoPresentOnAdmissionIndicator4")
    public void setHi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4(String hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4) {
        this.hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4 = hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4;
    }

    public HiOtherDiagnosisInfo withHi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4(String hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4) {
        this.hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4 = hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4;
        return this;
    }

    @JsonProperty("hi05_otherDiagnosisInfo5")
    public String getHi05OtherDiagnosisInfo5() {
        return hi05OtherDiagnosisInfo5;
    }

    @JsonProperty("hi05_otherDiagnosisInfo5")
    public void setHi05OtherDiagnosisInfo5(String hi05OtherDiagnosisInfo5) {
        this.hi05OtherDiagnosisInfo5 = hi05OtherDiagnosisInfo5;
    }

    public HiOtherDiagnosisInfo withHi05OtherDiagnosisInfo5(String hi05OtherDiagnosisInfo5) {
        this.hi05OtherDiagnosisInfo5 = hi05OtherDiagnosisInfo5;
        return this;
    }

    @JsonProperty("hi05_01_otherDiagnosisInfoQlfrCode5")
    public String getHi0501OtherDiagnosisInfoQlfrCode5() {
        return hi0501OtherDiagnosisInfoQlfrCode5;
    }

    @JsonProperty("hi05_01_otherDiagnosisInfoQlfrCode5")
    public void setHi0501OtherDiagnosisInfoQlfrCode5(String hi0501OtherDiagnosisInfoQlfrCode5) {
        this.hi0501OtherDiagnosisInfoQlfrCode5 = hi0501OtherDiagnosisInfoQlfrCode5;
    }

    public HiOtherDiagnosisInfo withHi0501OtherDiagnosisInfoQlfrCode5(String hi0501OtherDiagnosisInfoQlfrCode5) {
        this.hi0501OtherDiagnosisInfoQlfrCode5 = hi0501OtherDiagnosisInfoQlfrCode5;
        return this;
    }

    @JsonProperty("hi05_02_otherDiagnosisInfoCode5")
    public String getHi0502OtherDiagnosisInfoCode5() {
        return hi0502OtherDiagnosisInfoCode5;
    }

    @JsonProperty("hi05_02_otherDiagnosisInfoCode5")
    public void setHi0502OtherDiagnosisInfoCode5(String hi0502OtherDiagnosisInfoCode5) {
        this.hi0502OtherDiagnosisInfoCode5 = hi0502OtherDiagnosisInfoCode5;
    }

    public HiOtherDiagnosisInfo withHi0502OtherDiagnosisInfoCode5(String hi0502OtherDiagnosisInfoCode5) {
        this.hi0502OtherDiagnosisInfoCode5 = hi0502OtherDiagnosisInfoCode5;
        return this;
    }

    @JsonProperty("hi05_09_otherDiagnosisInfoPresentOnAdmissionIndicator5")
    public String getHi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5() {
        return hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5;
    }

    @JsonProperty("hi05_09_otherDiagnosisInfoPresentOnAdmissionIndicator5")
    public void setHi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5(String hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5) {
        this.hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5 = hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5;
    }

    public HiOtherDiagnosisInfo withHi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5(String hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5) {
        this.hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5 = hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5;
        return this;
    }

    @JsonProperty("hi06_otherDiagnosisInfo6")
    public String getHi06OtherDiagnosisInfo6() {
        return hi06OtherDiagnosisInfo6;
    }

    @JsonProperty("hi06_otherDiagnosisInfo6")
    public void setHi06OtherDiagnosisInfo6(String hi06OtherDiagnosisInfo6) {
        this.hi06OtherDiagnosisInfo6 = hi06OtherDiagnosisInfo6;
    }

    public HiOtherDiagnosisInfo withHi06OtherDiagnosisInfo6(String hi06OtherDiagnosisInfo6) {
        this.hi06OtherDiagnosisInfo6 = hi06OtherDiagnosisInfo6;
        return this;
    }

    @JsonProperty("hi06_01_otherDiagnosisInfoQlfrCode6")
    public String getHi0601OtherDiagnosisInfoQlfrCode6() {
        return hi0601OtherDiagnosisInfoQlfrCode6;
    }

    @JsonProperty("hi06_01_otherDiagnosisInfoQlfrCode6")
    public void setHi0601OtherDiagnosisInfoQlfrCode6(String hi0601OtherDiagnosisInfoQlfrCode6) {
        this.hi0601OtherDiagnosisInfoQlfrCode6 = hi0601OtherDiagnosisInfoQlfrCode6;
    }

    public HiOtherDiagnosisInfo withHi0601OtherDiagnosisInfoQlfrCode6(String hi0601OtherDiagnosisInfoQlfrCode6) {
        this.hi0601OtherDiagnosisInfoQlfrCode6 = hi0601OtherDiagnosisInfoQlfrCode6;
        return this;
    }

    @JsonProperty("hi06_02_otherDiagnosisInfoCode6")
    public String getHi0602OtherDiagnosisInfoCode6() {
        return hi0602OtherDiagnosisInfoCode6;
    }

    @JsonProperty("hi06_02_otherDiagnosisInfoCode6")
    public void setHi0602OtherDiagnosisInfoCode6(String hi0602OtherDiagnosisInfoCode6) {
        this.hi0602OtherDiagnosisInfoCode6 = hi0602OtherDiagnosisInfoCode6;
    }

    public HiOtherDiagnosisInfo withHi0602OtherDiagnosisInfoCode6(String hi0602OtherDiagnosisInfoCode6) {
        this.hi0602OtherDiagnosisInfoCode6 = hi0602OtherDiagnosisInfoCode6;
        return this;
    }

    @JsonProperty("hi06_09_otherDiagnosisInfoPresentOnAdmissionIndicator6")
    public String getHi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6() {
        return hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6;
    }

    @JsonProperty("hi06_09_otherDiagnosisInfoPresentOnAdmissionIndicator6")
    public void setHi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6(String hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6) {
        this.hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6 = hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6;
    }

    public HiOtherDiagnosisInfo withHi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6(String hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6) {
        this.hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6 = hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6;
        return this;
    }

    @JsonProperty("hi07_otherDiagnosisInfo7")
    public String getHi07OtherDiagnosisInfo7() {
        return hi07OtherDiagnosisInfo7;
    }

    @JsonProperty("hi07_otherDiagnosisInfo7")
    public void setHi07OtherDiagnosisInfo7(String hi07OtherDiagnosisInfo7) {
        this.hi07OtherDiagnosisInfo7 = hi07OtherDiagnosisInfo7;
    }

    public HiOtherDiagnosisInfo withHi07OtherDiagnosisInfo7(String hi07OtherDiagnosisInfo7) {
        this.hi07OtherDiagnosisInfo7 = hi07OtherDiagnosisInfo7;
        return this;
    }

    @JsonProperty("hi07_01_otherDiagnosisInfoQlfrCode7")
    public String getHi0701OtherDiagnosisInfoQlfrCode7() {
        return hi0701OtherDiagnosisInfoQlfrCode7;
    }

    @JsonProperty("hi07_01_otherDiagnosisInfoQlfrCode7")
    public void setHi0701OtherDiagnosisInfoQlfrCode7(String hi0701OtherDiagnosisInfoQlfrCode7) {
        this.hi0701OtherDiagnosisInfoQlfrCode7 = hi0701OtherDiagnosisInfoQlfrCode7;
    }

    public HiOtherDiagnosisInfo withHi0701OtherDiagnosisInfoQlfrCode7(String hi0701OtherDiagnosisInfoQlfrCode7) {
        this.hi0701OtherDiagnosisInfoQlfrCode7 = hi0701OtherDiagnosisInfoQlfrCode7;
        return this;
    }

    @JsonProperty("hi07_02_otherDiagnosisInfoCode7")
    public String getHi0702OtherDiagnosisInfoCode7() {
        return hi0702OtherDiagnosisInfoCode7;
    }

    @JsonProperty("hi07_02_otherDiagnosisInfoCode7")
    public void setHi0702OtherDiagnosisInfoCode7(String hi0702OtherDiagnosisInfoCode7) {
        this.hi0702OtherDiagnosisInfoCode7 = hi0702OtherDiagnosisInfoCode7;
    }

    public HiOtherDiagnosisInfo withHi0702OtherDiagnosisInfoCode7(String hi0702OtherDiagnosisInfoCode7) {
        this.hi0702OtherDiagnosisInfoCode7 = hi0702OtherDiagnosisInfoCode7;
        return this;
    }

    @JsonProperty("hi07_09_otherDiagnosisInfoPresentOnAdmissionIndicator7")
    public String getHi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7() {
        return hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7;
    }

    @JsonProperty("hi07_09_otherDiagnosisInfoPresentOnAdmissionIndicator7")
    public void setHi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7(String hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7) {
        this.hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7 = hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7;
    }

    public HiOtherDiagnosisInfo withHi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7(String hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7) {
        this.hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7 = hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7;
        return this;
    }

    @JsonProperty("hi08_otherDiagnosisInfo8")
    public String getHi08OtherDiagnosisInfo8() {
        return hi08OtherDiagnosisInfo8;
    }

    @JsonProperty("hi08_otherDiagnosisInfo8")
    public void setHi08OtherDiagnosisInfo8(String hi08OtherDiagnosisInfo8) {
        this.hi08OtherDiagnosisInfo8 = hi08OtherDiagnosisInfo8;
    }

    public HiOtherDiagnosisInfo withHi08OtherDiagnosisInfo8(String hi08OtherDiagnosisInfo8) {
        this.hi08OtherDiagnosisInfo8 = hi08OtherDiagnosisInfo8;
        return this;
    }

    @JsonProperty("hi08_01_otherDiagnosisInfoQlfrCode8")
    public String getHi0801OtherDiagnosisInfoQlfrCode8() {
        return hi0801OtherDiagnosisInfoQlfrCode8;
    }

    @JsonProperty("hi08_01_otherDiagnosisInfoQlfrCode8")
    public void setHi0801OtherDiagnosisInfoQlfrCode8(String hi0801OtherDiagnosisInfoQlfrCode8) {
        this.hi0801OtherDiagnosisInfoQlfrCode8 = hi0801OtherDiagnosisInfoQlfrCode8;
    }

    public HiOtherDiagnosisInfo withHi0801OtherDiagnosisInfoQlfrCode8(String hi0801OtherDiagnosisInfoQlfrCode8) {
        this.hi0801OtherDiagnosisInfoQlfrCode8 = hi0801OtherDiagnosisInfoQlfrCode8;
        return this;
    }

    @JsonProperty("hi08_02_otherDiagnosisInfoCode8")
    public String getHi0802OtherDiagnosisInfoCode8() {
        return hi0802OtherDiagnosisInfoCode8;
    }

    @JsonProperty("hi08_02_otherDiagnosisInfoCode8")
    public void setHi0802OtherDiagnosisInfoCode8(String hi0802OtherDiagnosisInfoCode8) {
        this.hi0802OtherDiagnosisInfoCode8 = hi0802OtherDiagnosisInfoCode8;
    }

    public HiOtherDiagnosisInfo withHi0802OtherDiagnosisInfoCode8(String hi0802OtherDiagnosisInfoCode8) {
        this.hi0802OtherDiagnosisInfoCode8 = hi0802OtherDiagnosisInfoCode8;
        return this;
    }

    @JsonProperty("hi08_09_otherDiagnosisInfoPresentOnAdmissionIndicator8")
    public String getHi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8() {
        return hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8;
    }

    @JsonProperty("hi08_09_otherDiagnosisInfoPresentOnAdmissionIndicator8")
    public void setHi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8(String hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8) {
        this.hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8 = hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8;
    }

    public HiOtherDiagnosisInfo withHi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8(String hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8) {
        this.hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8 = hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8;
        return this;
    }

    @JsonProperty("hi09_otherDiagnosisInfo9")
    public String getHi09OtherDiagnosisInfo9() {
        return hi09OtherDiagnosisInfo9;
    }

    @JsonProperty("hi09_otherDiagnosisInfo9")
    public void setHi09OtherDiagnosisInfo9(String hi09OtherDiagnosisInfo9) {
        this.hi09OtherDiagnosisInfo9 = hi09OtherDiagnosisInfo9;
    }

    public HiOtherDiagnosisInfo withHi09OtherDiagnosisInfo9(String hi09OtherDiagnosisInfo9) {
        this.hi09OtherDiagnosisInfo9 = hi09OtherDiagnosisInfo9;
        return this;
    }

    @JsonProperty("hi09_01_otherDiagnosisInfoQlfrCode9")
    public String getHi0901OtherDiagnosisInfoQlfrCode9() {
        return hi0901OtherDiagnosisInfoQlfrCode9;
    }

    @JsonProperty("hi09_01_otherDiagnosisInfoQlfrCode9")
    public void setHi0901OtherDiagnosisInfoQlfrCode9(String hi0901OtherDiagnosisInfoQlfrCode9) {
        this.hi0901OtherDiagnosisInfoQlfrCode9 = hi0901OtherDiagnosisInfoQlfrCode9;
    }

    public HiOtherDiagnosisInfo withHi0901OtherDiagnosisInfoQlfrCode9(String hi0901OtherDiagnosisInfoQlfrCode9) {
        this.hi0901OtherDiagnosisInfoQlfrCode9 = hi0901OtherDiagnosisInfoQlfrCode9;
        return this;
    }

    @JsonProperty("hi09_02_otherDiagnosisInfoCode9")
    public String getHi0902OtherDiagnosisInfoCode9() {
        return hi0902OtherDiagnosisInfoCode9;
    }

    @JsonProperty("hi09_02_otherDiagnosisInfoCode9")
    public void setHi0902OtherDiagnosisInfoCode9(String hi0902OtherDiagnosisInfoCode9) {
        this.hi0902OtherDiagnosisInfoCode9 = hi0902OtherDiagnosisInfoCode9;
    }

    public HiOtherDiagnosisInfo withHi0902OtherDiagnosisInfoCode9(String hi0902OtherDiagnosisInfoCode9) {
        this.hi0902OtherDiagnosisInfoCode9 = hi0902OtherDiagnosisInfoCode9;
        return this;
    }

    @JsonProperty("hi09_09_otherDiagnosisInfoPresentOnAdmissionIndicator9")
    public String getHi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9() {
        return hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9;
    }

    @JsonProperty("hi09_09_otherDiagnosisInfoPresentOnAdmissionIndicator9")
    public void setHi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9(String hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9) {
        this.hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9 = hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9;
    }

    public HiOtherDiagnosisInfo withHi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9(String hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9) {
        this.hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9 = hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9;
        return this;
    }

    @JsonProperty("hi10_otherDiagnosisInfo10")
    public String getHi10OtherDiagnosisInfo10() {
        return hi10OtherDiagnosisInfo10;
    }

    @JsonProperty("hi10_otherDiagnosisInfo10")
    public void setHi10OtherDiagnosisInfo10(String hi10OtherDiagnosisInfo10) {
        this.hi10OtherDiagnosisInfo10 = hi10OtherDiagnosisInfo10;
    }

    public HiOtherDiagnosisInfo withHi10OtherDiagnosisInfo10(String hi10OtherDiagnosisInfo10) {
        this.hi10OtherDiagnosisInfo10 = hi10OtherDiagnosisInfo10;
        return this;
    }

    @JsonProperty("hi10_01_otherDiagnosisInfoQlfrCode10")
    public String getHi1001OtherDiagnosisInfoQlfrCode10() {
        return hi1001OtherDiagnosisInfoQlfrCode10;
    }

    @JsonProperty("hi10_01_otherDiagnosisInfoQlfrCode10")
    public void setHi1001OtherDiagnosisInfoQlfrCode10(String hi1001OtherDiagnosisInfoQlfrCode10) {
        this.hi1001OtherDiagnosisInfoQlfrCode10 = hi1001OtherDiagnosisInfoQlfrCode10;
    }

    public HiOtherDiagnosisInfo withHi1001OtherDiagnosisInfoQlfrCode10(String hi1001OtherDiagnosisInfoQlfrCode10) {
        this.hi1001OtherDiagnosisInfoQlfrCode10 = hi1001OtherDiagnosisInfoQlfrCode10;
        return this;
    }

    @JsonProperty("hi10_02_otherDiagnosisInfoCode10")
    public String getHi1002OtherDiagnosisInfoCode10() {
        return hi1002OtherDiagnosisInfoCode10;
    }

    @JsonProperty("hi10_02_otherDiagnosisInfoCode10")
    public void setHi1002OtherDiagnosisInfoCode10(String hi1002OtherDiagnosisInfoCode10) {
        this.hi1002OtherDiagnosisInfoCode10 = hi1002OtherDiagnosisInfoCode10;
    }

    public HiOtherDiagnosisInfo withHi1002OtherDiagnosisInfoCode10(String hi1002OtherDiagnosisInfoCode10) {
        this.hi1002OtherDiagnosisInfoCode10 = hi1002OtherDiagnosisInfoCode10;
        return this;
    }

    @JsonProperty("hi10_09_otherDiagnosisInfoPresentOnAdmissionIndicator10")
    public String getHi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10() {
        return hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10;
    }

    @JsonProperty("hi10_09_otherDiagnosisInfoPresentOnAdmissionIndicator10")
    public void setHi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10(String hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10) {
        this.hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10 = hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10;
    }

    public HiOtherDiagnosisInfo withHi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10(String hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10) {
        this.hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10 = hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10;
        return this;
    }

    @JsonProperty("hi11_otherDiagnosisInfo11")
    public String getHi11OtherDiagnosisInfo11() {
        return hi11OtherDiagnosisInfo11;
    }

    @JsonProperty("hi11_otherDiagnosisInfo11")
    public void setHi11OtherDiagnosisInfo11(String hi11OtherDiagnosisInfo11) {
        this.hi11OtherDiagnosisInfo11 = hi11OtherDiagnosisInfo11;
    }

    public HiOtherDiagnosisInfo withHi11OtherDiagnosisInfo11(String hi11OtherDiagnosisInfo11) {
        this.hi11OtherDiagnosisInfo11 = hi11OtherDiagnosisInfo11;
        return this;
    }

    @JsonProperty("hi11_01_otherDiagnosisInfoQlfrCode11")
    public String getHi1101OtherDiagnosisInfoQlfrCode11() {
        return hi1101OtherDiagnosisInfoQlfrCode11;
    }

    @JsonProperty("hi11_01_otherDiagnosisInfoQlfrCode11")
    public void setHi1101OtherDiagnosisInfoQlfrCode11(String hi1101OtherDiagnosisInfoQlfrCode11) {
        this.hi1101OtherDiagnosisInfoQlfrCode11 = hi1101OtherDiagnosisInfoQlfrCode11;
    }

    public HiOtherDiagnosisInfo withHi1101OtherDiagnosisInfoQlfrCode11(String hi1101OtherDiagnosisInfoQlfrCode11) {
        this.hi1101OtherDiagnosisInfoQlfrCode11 = hi1101OtherDiagnosisInfoQlfrCode11;
        return this;
    }

    @JsonProperty("hi11_02_otherDiagnosisInfoCode11")
    public String getHi1102OtherDiagnosisInfoCode11() {
        return hi1102OtherDiagnosisInfoCode11;
    }

    @JsonProperty("hi11_02_otherDiagnosisInfoCode11")
    public void setHi1102OtherDiagnosisInfoCode11(String hi1102OtherDiagnosisInfoCode11) {
        this.hi1102OtherDiagnosisInfoCode11 = hi1102OtherDiagnosisInfoCode11;
    }

    public HiOtherDiagnosisInfo withHi1102OtherDiagnosisInfoCode11(String hi1102OtherDiagnosisInfoCode11) {
        this.hi1102OtherDiagnosisInfoCode11 = hi1102OtherDiagnosisInfoCode11;
        return this;
    }

    @JsonProperty("hi11_09_otherDiagnosisInfoPresentOnAdmissionIndicator11")
    public String getHi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11() {
        return hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11;
    }

    @JsonProperty("hi11_09_otherDiagnosisInfoPresentOnAdmissionIndicator11")
    public void setHi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11(String hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11) {
        this.hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11 = hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11;
    }

    public HiOtherDiagnosisInfo withHi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11(String hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11) {
        this.hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11 = hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11;
        return this;
    }

    @JsonProperty("hi12_otherDiagnosisInfo12")
    public String getHi12OtherDiagnosisInfo12() {
        return hi12OtherDiagnosisInfo12;
    }

    @JsonProperty("hi12_otherDiagnosisInfo12")
    public void setHi12OtherDiagnosisInfo12(String hi12OtherDiagnosisInfo12) {
        this.hi12OtherDiagnosisInfo12 = hi12OtherDiagnosisInfo12;
    }

    public HiOtherDiagnosisInfo withHi12OtherDiagnosisInfo12(String hi12OtherDiagnosisInfo12) {
        this.hi12OtherDiagnosisInfo12 = hi12OtherDiagnosisInfo12;
        return this;
    }

    @JsonProperty("hi12_01_otherDiagnosisInfoQlfrCode12")
    public String getHi1201OtherDiagnosisInfoQlfrCode12() {
        return hi1201OtherDiagnosisInfoQlfrCode12;
    }

    @JsonProperty("hi12_01_otherDiagnosisInfoQlfrCode12")
    public void setHi1201OtherDiagnosisInfoQlfrCode12(String hi1201OtherDiagnosisInfoQlfrCode12) {
        this.hi1201OtherDiagnosisInfoQlfrCode12 = hi1201OtherDiagnosisInfoQlfrCode12;
    }

    public HiOtherDiagnosisInfo withHi1201OtherDiagnosisInfoQlfrCode12(String hi1201OtherDiagnosisInfoQlfrCode12) {
        this.hi1201OtherDiagnosisInfoQlfrCode12 = hi1201OtherDiagnosisInfoQlfrCode12;
        return this;
    }

    @JsonProperty("hi12_02_otherDiagnosisInfoCode12")
    public String getHi1202OtherDiagnosisInfoCode12() {
        return hi1202OtherDiagnosisInfoCode12;
    }

    @JsonProperty("hi12_02_otherDiagnosisInfoCode12")
    public void setHi1202OtherDiagnosisInfoCode12(String hi1202OtherDiagnosisInfoCode12) {
        this.hi1202OtherDiagnosisInfoCode12 = hi1202OtherDiagnosisInfoCode12;
    }

    public HiOtherDiagnosisInfo withHi1202OtherDiagnosisInfoCode12(String hi1202OtherDiagnosisInfoCode12) {
        this.hi1202OtherDiagnosisInfoCode12 = hi1202OtherDiagnosisInfoCode12;
        return this;
    }

    @JsonProperty("hi12_09_otherDiagnosisInfoPresentOnAdmissionIndicator12")
    public String getHi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12() {
        return hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12;
    }

    @JsonProperty("hi12_09_otherDiagnosisInfoPresentOnAdmissionIndicator12")
    public void setHi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12(String hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12) {
        this.hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12 = hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12;
    }

    public HiOtherDiagnosisInfo withHi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12(String hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12) {
        this.hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12 = hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12;
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

    public HiOtherDiagnosisInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hi01OtherDiagnosisInfo1).append(hi0101OtherDiagnosisInfoQlfrCode1).append(hi0102OtherDiagnosisInfoCode1).append(hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1).append(hi02OtherDiagnosisInfo2).append(hi0201OtherDiagnosisInfoQlfrCode2).append(hi0202OtherDiagnosisInfoCode2).append(hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2).append(hi03OtherDiagnosisInfo3).append(hi0301OtherDiagnosisInfoQlfrCode3).append(hi0302OtherDiagnosisInfoCode3).append(hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3).append(hi04OtherDiagnosisInfo4).append(hi0401OtherDiagnosisInfoQlfrCode4).append(hi0402OtherDiagnosisInfoCode4).append(hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4).append(hi05OtherDiagnosisInfo5).append(hi0501OtherDiagnosisInfoQlfrCode5).append(hi0502OtherDiagnosisInfoCode5).append(hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5).append(hi06OtherDiagnosisInfo6).append(hi0601OtherDiagnosisInfoQlfrCode6).append(hi0602OtherDiagnosisInfoCode6).append(hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6).append(hi07OtherDiagnosisInfo7).append(hi0701OtherDiagnosisInfoQlfrCode7).append(hi0702OtherDiagnosisInfoCode7).append(hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7).append(hi08OtherDiagnosisInfo8).append(hi0801OtherDiagnosisInfoQlfrCode8).append(hi0802OtherDiagnosisInfoCode8).append(hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8).append(hi09OtherDiagnosisInfo9).append(hi0901OtherDiagnosisInfoQlfrCode9).append(hi0902OtherDiagnosisInfoCode9).append(hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9).append(hi10OtherDiagnosisInfo10).append(hi1001OtherDiagnosisInfoQlfrCode10).append(hi1002OtherDiagnosisInfoCode10).append(hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10).append(hi11OtherDiagnosisInfo11).append(hi1101OtherDiagnosisInfoQlfrCode11).append(hi1102OtherDiagnosisInfoCode11).append(hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11).append(hi12OtherDiagnosisInfo12).append(hi1201OtherDiagnosisInfoQlfrCode12).append(hi1202OtherDiagnosisInfoCode12).append(hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiOtherDiagnosisInfo) == false) {
            return false;
        }
        HiOtherDiagnosisInfo rhs = ((HiOtherDiagnosisInfo) other);
        return new EqualsBuilder().append(hi01OtherDiagnosisInfo1, rhs.hi01OtherDiagnosisInfo1).append(hi0101OtherDiagnosisInfoQlfrCode1, rhs.hi0101OtherDiagnosisInfoQlfrCode1).append(hi0102OtherDiagnosisInfoCode1, rhs.hi0102OtherDiagnosisInfoCode1).append(hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1, rhs.hi0109OtherDiagnosisInfoPresentOnAdmissionIndicator1).append(hi02OtherDiagnosisInfo2, rhs.hi02OtherDiagnosisInfo2).append(hi0201OtherDiagnosisInfoQlfrCode2, rhs.hi0201OtherDiagnosisInfoQlfrCode2).append(hi0202OtherDiagnosisInfoCode2, rhs.hi0202OtherDiagnosisInfoCode2).append(hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2, rhs.hi0209OtherDiagnosisInfoPresentOnAdmissionIndicator2).append(hi03OtherDiagnosisInfo3, rhs.hi03OtherDiagnosisInfo3).append(hi0301OtherDiagnosisInfoQlfrCode3, rhs.hi0301OtherDiagnosisInfoQlfrCode3).append(hi0302OtherDiagnosisInfoCode3, rhs.hi0302OtherDiagnosisInfoCode3).append(hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3, rhs.hi0309OtherDiagnosisInfoPresentOnAdmissionIndicator3).append(hi04OtherDiagnosisInfo4, rhs.hi04OtherDiagnosisInfo4).append(hi0401OtherDiagnosisInfoQlfrCode4, rhs.hi0401OtherDiagnosisInfoQlfrCode4).append(hi0402OtherDiagnosisInfoCode4, rhs.hi0402OtherDiagnosisInfoCode4).append(hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4, rhs.hi0409OtherDiagnosisInfoPresentOnAdmissionIndicator4).append(hi05OtherDiagnosisInfo5, rhs.hi05OtherDiagnosisInfo5).append(hi0501OtherDiagnosisInfoQlfrCode5, rhs.hi0501OtherDiagnosisInfoQlfrCode5).append(hi0502OtherDiagnosisInfoCode5, rhs.hi0502OtherDiagnosisInfoCode5).append(hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5, rhs.hi0509OtherDiagnosisInfoPresentOnAdmissionIndicator5).append(hi06OtherDiagnosisInfo6, rhs.hi06OtherDiagnosisInfo6).append(hi0601OtherDiagnosisInfoQlfrCode6, rhs.hi0601OtherDiagnosisInfoQlfrCode6).append(hi0602OtherDiagnosisInfoCode6, rhs.hi0602OtherDiagnosisInfoCode6).append(hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6, rhs.hi0609OtherDiagnosisInfoPresentOnAdmissionIndicator6).append(hi07OtherDiagnosisInfo7, rhs.hi07OtherDiagnosisInfo7).append(hi0701OtherDiagnosisInfoQlfrCode7, rhs.hi0701OtherDiagnosisInfoQlfrCode7).append(hi0702OtherDiagnosisInfoCode7, rhs.hi0702OtherDiagnosisInfoCode7).append(hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7, rhs.hi0709OtherDiagnosisInfoPresentOnAdmissionIndicator7).append(hi08OtherDiagnosisInfo8, rhs.hi08OtherDiagnosisInfo8).append(hi0801OtherDiagnosisInfoQlfrCode8, rhs.hi0801OtherDiagnosisInfoQlfrCode8).append(hi0802OtherDiagnosisInfoCode8, rhs.hi0802OtherDiagnosisInfoCode8).append(hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8, rhs.hi0809OtherDiagnosisInfoPresentOnAdmissionIndicator8).append(hi09OtherDiagnosisInfo9, rhs.hi09OtherDiagnosisInfo9).append(hi0901OtherDiagnosisInfoQlfrCode9, rhs.hi0901OtherDiagnosisInfoQlfrCode9).append(hi0902OtherDiagnosisInfoCode9, rhs.hi0902OtherDiagnosisInfoCode9).append(hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9, rhs.hi0909OtherDiagnosisInfoPresentOnAdmissionIndicator9).append(hi10OtherDiagnosisInfo10, rhs.hi10OtherDiagnosisInfo10).append(hi1001OtherDiagnosisInfoQlfrCode10, rhs.hi1001OtherDiagnosisInfoQlfrCode10).append(hi1002OtherDiagnosisInfoCode10, rhs.hi1002OtherDiagnosisInfoCode10).append(hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10, rhs.hi1009OtherDiagnosisInfoPresentOnAdmissionIndicator10).append(hi11OtherDiagnosisInfo11, rhs.hi11OtherDiagnosisInfo11).append(hi1101OtherDiagnosisInfoQlfrCode11, rhs.hi1101OtherDiagnosisInfoQlfrCode11).append(hi1102OtherDiagnosisInfoCode11, rhs.hi1102OtherDiagnosisInfoCode11).append(hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11, rhs.hi1109OtherDiagnosisInfoPresentOnAdmissionIndicator11).append(hi12OtherDiagnosisInfo12, rhs.hi12OtherDiagnosisInfo12).append(hi1201OtherDiagnosisInfoQlfrCode12, rhs.hi1201OtherDiagnosisInfoQlfrCode12).append(hi1202OtherDiagnosisInfoCode12, rhs.hi1202OtherDiagnosisInfoCode12).append(hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12, rhs.hi1209OtherDiagnosisInfoPresentOnAdmissionIndicator12).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

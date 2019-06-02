
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
    "hi01_occurrenceInfo1",
    "hi01_01_occurrenceInfoQlfr1",
    "hi01_02_occurrenceInfoCode1",
    "hi01_03_occurrenceInfoDateFormatQlfr1",
    "hi01_04_occurrenceInfoDate1",
    "hi02_occurrenceInfo2",
    "hi02_01_occurrenceInfoQlfr2",
    "hi02_02_occurrenceInfoCode2",
    "hi02_03_occurrenceInfoDateFormatQlfr2",
    "hi02_04_occurrenceInfoDate2",
    "hi03_occurrenceInfo3",
    "hi03_01_occurrenceInfoQlfr3",
    "hi03_02_occurrenceInfoCode3",
    "hi03_03_occurrenceInfoDateFormatQlfr3",
    "hi03_04_occurrenceInfoDate3",
    "hi04_occurrenceInfo4",
    "hi04_01_occurrenceInfoQlfr4",
    "hi04_02_occurrenceInfoCode4",
    "hi04_03_occurrenceInfoDateFormatQlfr4",
    "hi04_04_occurrenceInfoDate4",
    "hi05_occurrenceInfo5",
    "hi05_01_occurrenceInfoQlfr5",
    "hi05_02_occurrenceInfoCode5",
    "hi05_03_occurrenceInfoDateFormatQlfr5",
    "hi05_04_occurrenceInfoDate5",
    "hi06_occurrenceInfo6",
    "hi06_01_occurrenceInfoQlfr6",
    "hi06_02_occurrenceInfoCode6",
    "hi06_03_occurrenceInfoDateFormatQlfr6",
    "hi06_04_occurrenceInfoDate6",
    "hi07_occurrenceInfo7",
    "hi07_01_occurrenceInfoQlfr7",
    "hi07_02_occurrenceInfoCode7",
    "hi07_03_occurrenceInfoDateFormatQlfr7",
    "hi07_04_occurrenceInfoDate7",
    "hi08_occurrenceInfo8",
    "hi08_01_occurrenceInfoQlfr8",
    "hi08_02_occurrenceInfoCode8",
    "hi08_03_occurrenceInfoDateFormatQlfr8",
    "hi08_04_occurrenceInfoDate8",
    "hi09_occurrenceInfo9",
    "hi09_01_occurrenceInfoQlfr9",
    "hi09_02_occurrenceInfoCode9",
    "hi09_03_occurrenceInfoDateFormatQlfr9",
    "hi09_04_occurrenceInfoDate9",
    "hi10_occurrenceInfo10",
    "hi10_01_occurrenceInfoQlfr10",
    "hi10_02_occurrenceInfoCode10",
    "hi10_03_occurrenceInfoDateFormatQlfr10",
    "hi10_04_occurrenceInfoDate10",
    "hi11_occurrenceInfo11",
    "hi11_01_occurrenceInfoQlfr11",
    "hi11_02_occurrenceInfoCode11",
    "hi11_03_occurrenceInfoDateFormatQlfr11",
    "hi11_04_occurrenceInfoDate11",
    "hi12_occurrenceInfo12",
    "hi12_01_occurrenceInfoQlfr12",
    "hi12_02_occurrenceInfoCode12",
    "hi12_03_occurrenceInfoDateFormatQlfr12",
    "hi12_04_occurrenceInfoDate12"
})
public class HiOccurrenceInfo {

    @JsonProperty("hi01_occurrenceInfo1")
    private String hi01OccurrenceInfo1;
    @JsonProperty("hi01_01_occurrenceInfoQlfr1")
    private String hi0101OccurrenceInfoQlfr1;
    @JsonProperty("hi01_02_occurrenceInfoCode1")
    private String hi0102OccurrenceInfoCode1;
    @JsonProperty("hi01_03_occurrenceInfoDateFormatQlfr1")
    private String hi0103OccurrenceInfoDateFormatQlfr1;
    @JsonProperty("hi01_04_occurrenceInfoDate1")
    private String hi0104OccurrenceInfoDate1;
    @JsonProperty("hi02_occurrenceInfo2")
    private String hi02OccurrenceInfo2;
    @JsonProperty("hi02_01_occurrenceInfoQlfr2")
    private String hi0201OccurrenceInfoQlfr2;
    @JsonProperty("hi02_02_occurrenceInfoCode2")
    private String hi0202OccurrenceInfoCode2;
    @JsonProperty("hi02_03_occurrenceInfoDateFormatQlfr2")
    private String hi0203OccurrenceInfoDateFormatQlfr2;
    @JsonProperty("hi02_04_occurrenceInfoDate2")
    private String hi0204OccurrenceInfoDate2;
    @JsonProperty("hi03_occurrenceInfo3")
    private String hi03OccurrenceInfo3;
    @JsonProperty("hi03_01_occurrenceInfoQlfr3")
    private String hi0301OccurrenceInfoQlfr3;
    @JsonProperty("hi03_02_occurrenceInfoCode3")
    private String hi0302OccurrenceInfoCode3;
    @JsonProperty("hi03_03_occurrenceInfoDateFormatQlfr3")
    private String hi0303OccurrenceInfoDateFormatQlfr3;
    @JsonProperty("hi03_04_occurrenceInfoDate3")
    private String hi0304OccurrenceInfoDate3;
    @JsonProperty("hi04_occurrenceInfo4")
    private String hi04OccurrenceInfo4;
    @JsonProperty("hi04_01_occurrenceInfoQlfr4")
    private String hi0401OccurrenceInfoQlfr4;
    @JsonProperty("hi04_02_occurrenceInfoCode4")
    private String hi0402OccurrenceInfoCode4;
    @JsonProperty("hi04_03_occurrenceInfoDateFormatQlfr4")
    private String hi0403OccurrenceInfoDateFormatQlfr4;
    @JsonProperty("hi04_04_occurrenceInfoDate4")
    private String hi0404OccurrenceInfoDate4;
    @JsonProperty("hi05_occurrenceInfo5")
    private String hi05OccurrenceInfo5;
    @JsonProperty("hi05_01_occurrenceInfoQlfr5")
    private String hi0501OccurrenceInfoQlfr5;
    @JsonProperty("hi05_02_occurrenceInfoCode5")
    private String hi0502OccurrenceInfoCode5;
    @JsonProperty("hi05_03_occurrenceInfoDateFormatQlfr5")
    private String hi0503OccurrenceInfoDateFormatQlfr5;
    @JsonProperty("hi05_04_occurrenceInfoDate5")
    private String hi0504OccurrenceInfoDate5;
    @JsonProperty("hi06_occurrenceInfo6")
    private String hi06OccurrenceInfo6;
    @JsonProperty("hi06_01_occurrenceInfoQlfr6")
    private String hi0601OccurrenceInfoQlfr6;
    @JsonProperty("hi06_02_occurrenceInfoCode6")
    private String hi0602OccurrenceInfoCode6;
    @JsonProperty("hi06_03_occurrenceInfoDateFormatQlfr6")
    private String hi0603OccurrenceInfoDateFormatQlfr6;
    @JsonProperty("hi06_04_occurrenceInfoDate6")
    private String hi0604OccurrenceInfoDate6;
    @JsonProperty("hi07_occurrenceInfo7")
    private String hi07OccurrenceInfo7;
    @JsonProperty("hi07_01_occurrenceInfoQlfr7")
    private String hi0701OccurrenceInfoQlfr7;
    @JsonProperty("hi07_02_occurrenceInfoCode7")
    private String hi0702OccurrenceInfoCode7;
    @JsonProperty("hi07_03_occurrenceInfoDateFormatQlfr7")
    private String hi0703OccurrenceInfoDateFormatQlfr7;
    @JsonProperty("hi07_04_occurrenceInfoDate7")
    private String hi0704OccurrenceInfoDate7;
    @JsonProperty("hi08_occurrenceInfo8")
    private String hi08OccurrenceInfo8;
    @JsonProperty("hi08_01_occurrenceInfoQlfr8")
    private String hi0801OccurrenceInfoQlfr8;
    @JsonProperty("hi08_02_occurrenceInfoCode8")
    private String hi0802OccurrenceInfoCode8;
    @JsonProperty("hi08_03_occurrenceInfoDateFormatQlfr8")
    private String hi0803OccurrenceInfoDateFormatQlfr8;
    @JsonProperty("hi08_04_occurrenceInfoDate8")
    private String hi0804OccurrenceInfoDate8;
    @JsonProperty("hi09_occurrenceInfo9")
    private String hi09OccurrenceInfo9;
    @JsonProperty("hi09_01_occurrenceInfoQlfr9")
    private String hi0901OccurrenceInfoQlfr9;
    @JsonProperty("hi09_02_occurrenceInfoCode9")
    private String hi0902OccurrenceInfoCode9;
    @JsonProperty("hi09_03_occurrenceInfoDateFormatQlfr9")
    private String hi0903OccurrenceInfoDateFormatQlfr9;
    @JsonProperty("hi09_04_occurrenceInfoDate9")
    private String hi0904OccurrenceInfoDate9;
    @JsonProperty("hi10_occurrenceInfo10")
    private String hi10OccurrenceInfo10;
    @JsonProperty("hi10_01_occurrenceInfoQlfr10")
    private String hi1001OccurrenceInfoQlfr10;
    @JsonProperty("hi10_02_occurrenceInfoCode10")
    private String hi1002OccurrenceInfoCode10;
    @JsonProperty("hi10_03_occurrenceInfoDateFormatQlfr10")
    private String hi1003OccurrenceInfoDateFormatQlfr10;
    @JsonProperty("hi10_04_occurrenceInfoDate10")
    private String hi1004OccurrenceInfoDate10;
    @JsonProperty("hi11_occurrenceInfo11")
    private String hi11OccurrenceInfo11;
    @JsonProperty("hi11_01_occurrenceInfoQlfr11")
    private String hi1101OccurrenceInfoQlfr11;
    @JsonProperty("hi11_02_occurrenceInfoCode11")
    private String hi1102OccurrenceInfoCode11;
    @JsonProperty("hi11_03_occurrenceInfoDateFormatQlfr11")
    private String hi1103OccurrenceInfoDateFormatQlfr11;
    @JsonProperty("hi11_04_occurrenceInfoDate11")
    private String hi1104OccurrenceInfoDate11;
    @JsonProperty("hi12_occurrenceInfo12")
    private String hi12OccurrenceInfo12;
    @JsonProperty("hi12_01_occurrenceInfoQlfr12")
    private String hi1201OccurrenceInfoQlfr12;
    @JsonProperty("hi12_02_occurrenceInfoCode12")
    private String hi1202OccurrenceInfoCode12;
    @JsonProperty("hi12_03_occurrenceInfoDateFormatQlfr12")
    private String hi1203OccurrenceInfoDateFormatQlfr12;
    @JsonProperty("hi12_04_occurrenceInfoDate12")
    private String hi1204OccurrenceInfoDate12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hi01_occurrenceInfo1")
    public String getHi01OccurrenceInfo1() {
        return hi01OccurrenceInfo1;
    }

    @JsonProperty("hi01_occurrenceInfo1")
    public void setHi01OccurrenceInfo1(String hi01OccurrenceInfo1) {
        this.hi01OccurrenceInfo1 = hi01OccurrenceInfo1;
    }

    public HiOccurrenceInfo withHi01OccurrenceInfo1(String hi01OccurrenceInfo1) {
        this.hi01OccurrenceInfo1 = hi01OccurrenceInfo1;
        return this;
    }

    @JsonProperty("hi01_01_occurrenceInfoQlfr1")
    public String getHi0101OccurrenceInfoQlfr1() {
        return hi0101OccurrenceInfoQlfr1;
    }

    @JsonProperty("hi01_01_occurrenceInfoQlfr1")
    public void setHi0101OccurrenceInfoQlfr1(String hi0101OccurrenceInfoQlfr1) {
        this.hi0101OccurrenceInfoQlfr1 = hi0101OccurrenceInfoQlfr1;
    }

    public HiOccurrenceInfo withHi0101OccurrenceInfoQlfr1(String hi0101OccurrenceInfoQlfr1) {
        this.hi0101OccurrenceInfoQlfr1 = hi0101OccurrenceInfoQlfr1;
        return this;
    }

    @JsonProperty("hi01_02_occurrenceInfoCode1")
    public String getHi0102OccurrenceInfoCode1() {
        return hi0102OccurrenceInfoCode1;
    }

    @JsonProperty("hi01_02_occurrenceInfoCode1")
    public void setHi0102OccurrenceInfoCode1(String hi0102OccurrenceInfoCode1) {
        this.hi0102OccurrenceInfoCode1 = hi0102OccurrenceInfoCode1;
    }

    public HiOccurrenceInfo withHi0102OccurrenceInfoCode1(String hi0102OccurrenceInfoCode1) {
        this.hi0102OccurrenceInfoCode1 = hi0102OccurrenceInfoCode1;
        return this;
    }

    @JsonProperty("hi01_03_occurrenceInfoDateFormatQlfr1")
    public String getHi0103OccurrenceInfoDateFormatQlfr1() {
        return hi0103OccurrenceInfoDateFormatQlfr1;
    }

    @JsonProperty("hi01_03_occurrenceInfoDateFormatQlfr1")
    public void setHi0103OccurrenceInfoDateFormatQlfr1(String hi0103OccurrenceInfoDateFormatQlfr1) {
        this.hi0103OccurrenceInfoDateFormatQlfr1 = hi0103OccurrenceInfoDateFormatQlfr1;
    }

    public HiOccurrenceInfo withHi0103OccurrenceInfoDateFormatQlfr1(String hi0103OccurrenceInfoDateFormatQlfr1) {
        this.hi0103OccurrenceInfoDateFormatQlfr1 = hi0103OccurrenceInfoDateFormatQlfr1;
        return this;
    }

    @JsonProperty("hi01_04_occurrenceInfoDate1")
    public String getHi0104OccurrenceInfoDate1() {
        return hi0104OccurrenceInfoDate1;
    }

    @JsonProperty("hi01_04_occurrenceInfoDate1")
    public void setHi0104OccurrenceInfoDate1(String hi0104OccurrenceInfoDate1) {
        this.hi0104OccurrenceInfoDate1 = hi0104OccurrenceInfoDate1;
    }

    public HiOccurrenceInfo withHi0104OccurrenceInfoDate1(String hi0104OccurrenceInfoDate1) {
        this.hi0104OccurrenceInfoDate1 = hi0104OccurrenceInfoDate1;
        return this;
    }

    @JsonProperty("hi02_occurrenceInfo2")
    public String getHi02OccurrenceInfo2() {
        return hi02OccurrenceInfo2;
    }

    @JsonProperty("hi02_occurrenceInfo2")
    public void setHi02OccurrenceInfo2(String hi02OccurrenceInfo2) {
        this.hi02OccurrenceInfo2 = hi02OccurrenceInfo2;
    }

    public HiOccurrenceInfo withHi02OccurrenceInfo2(String hi02OccurrenceInfo2) {
        this.hi02OccurrenceInfo2 = hi02OccurrenceInfo2;
        return this;
    }

    @JsonProperty("hi02_01_occurrenceInfoQlfr2")
    public String getHi0201OccurrenceInfoQlfr2() {
        return hi0201OccurrenceInfoQlfr2;
    }

    @JsonProperty("hi02_01_occurrenceInfoQlfr2")
    public void setHi0201OccurrenceInfoQlfr2(String hi0201OccurrenceInfoQlfr2) {
        this.hi0201OccurrenceInfoQlfr2 = hi0201OccurrenceInfoQlfr2;
    }

    public HiOccurrenceInfo withHi0201OccurrenceInfoQlfr2(String hi0201OccurrenceInfoQlfr2) {
        this.hi0201OccurrenceInfoQlfr2 = hi0201OccurrenceInfoQlfr2;
        return this;
    }

    @JsonProperty("hi02_02_occurrenceInfoCode2")
    public String getHi0202OccurrenceInfoCode2() {
        return hi0202OccurrenceInfoCode2;
    }

    @JsonProperty("hi02_02_occurrenceInfoCode2")
    public void setHi0202OccurrenceInfoCode2(String hi0202OccurrenceInfoCode2) {
        this.hi0202OccurrenceInfoCode2 = hi0202OccurrenceInfoCode2;
    }

    public HiOccurrenceInfo withHi0202OccurrenceInfoCode2(String hi0202OccurrenceInfoCode2) {
        this.hi0202OccurrenceInfoCode2 = hi0202OccurrenceInfoCode2;
        return this;
    }

    @JsonProperty("hi02_03_occurrenceInfoDateFormatQlfr2")
    public String getHi0203OccurrenceInfoDateFormatQlfr2() {
        return hi0203OccurrenceInfoDateFormatQlfr2;
    }

    @JsonProperty("hi02_03_occurrenceInfoDateFormatQlfr2")
    public void setHi0203OccurrenceInfoDateFormatQlfr2(String hi0203OccurrenceInfoDateFormatQlfr2) {
        this.hi0203OccurrenceInfoDateFormatQlfr2 = hi0203OccurrenceInfoDateFormatQlfr2;
    }

    public HiOccurrenceInfo withHi0203OccurrenceInfoDateFormatQlfr2(String hi0203OccurrenceInfoDateFormatQlfr2) {
        this.hi0203OccurrenceInfoDateFormatQlfr2 = hi0203OccurrenceInfoDateFormatQlfr2;
        return this;
    }

    @JsonProperty("hi02_04_occurrenceInfoDate2")
    public String getHi0204OccurrenceInfoDate2() {
        return hi0204OccurrenceInfoDate2;
    }

    @JsonProperty("hi02_04_occurrenceInfoDate2")
    public void setHi0204OccurrenceInfoDate2(String hi0204OccurrenceInfoDate2) {
        this.hi0204OccurrenceInfoDate2 = hi0204OccurrenceInfoDate2;
    }

    public HiOccurrenceInfo withHi0204OccurrenceInfoDate2(String hi0204OccurrenceInfoDate2) {
        this.hi0204OccurrenceInfoDate2 = hi0204OccurrenceInfoDate2;
        return this;
    }

    @JsonProperty("hi03_occurrenceInfo3")
    public String getHi03OccurrenceInfo3() {
        return hi03OccurrenceInfo3;
    }

    @JsonProperty("hi03_occurrenceInfo3")
    public void setHi03OccurrenceInfo3(String hi03OccurrenceInfo3) {
        this.hi03OccurrenceInfo3 = hi03OccurrenceInfo3;
    }

    public HiOccurrenceInfo withHi03OccurrenceInfo3(String hi03OccurrenceInfo3) {
        this.hi03OccurrenceInfo3 = hi03OccurrenceInfo3;
        return this;
    }

    @JsonProperty("hi03_01_occurrenceInfoQlfr3")
    public String getHi0301OccurrenceInfoQlfr3() {
        return hi0301OccurrenceInfoQlfr3;
    }

    @JsonProperty("hi03_01_occurrenceInfoQlfr3")
    public void setHi0301OccurrenceInfoQlfr3(String hi0301OccurrenceInfoQlfr3) {
        this.hi0301OccurrenceInfoQlfr3 = hi0301OccurrenceInfoQlfr3;
    }

    public HiOccurrenceInfo withHi0301OccurrenceInfoQlfr3(String hi0301OccurrenceInfoQlfr3) {
        this.hi0301OccurrenceInfoQlfr3 = hi0301OccurrenceInfoQlfr3;
        return this;
    }

    @JsonProperty("hi03_02_occurrenceInfoCode3")
    public String getHi0302OccurrenceInfoCode3() {
        return hi0302OccurrenceInfoCode3;
    }

    @JsonProperty("hi03_02_occurrenceInfoCode3")
    public void setHi0302OccurrenceInfoCode3(String hi0302OccurrenceInfoCode3) {
        this.hi0302OccurrenceInfoCode3 = hi0302OccurrenceInfoCode3;
    }

    public HiOccurrenceInfo withHi0302OccurrenceInfoCode3(String hi0302OccurrenceInfoCode3) {
        this.hi0302OccurrenceInfoCode3 = hi0302OccurrenceInfoCode3;
        return this;
    }

    @JsonProperty("hi03_03_occurrenceInfoDateFormatQlfr3")
    public String getHi0303OccurrenceInfoDateFormatQlfr3() {
        return hi0303OccurrenceInfoDateFormatQlfr3;
    }

    @JsonProperty("hi03_03_occurrenceInfoDateFormatQlfr3")
    public void setHi0303OccurrenceInfoDateFormatQlfr3(String hi0303OccurrenceInfoDateFormatQlfr3) {
        this.hi0303OccurrenceInfoDateFormatQlfr3 = hi0303OccurrenceInfoDateFormatQlfr3;
    }

    public HiOccurrenceInfo withHi0303OccurrenceInfoDateFormatQlfr3(String hi0303OccurrenceInfoDateFormatQlfr3) {
        this.hi0303OccurrenceInfoDateFormatQlfr3 = hi0303OccurrenceInfoDateFormatQlfr3;
        return this;
    }

    @JsonProperty("hi03_04_occurrenceInfoDate3")
    public String getHi0304OccurrenceInfoDate3() {
        return hi0304OccurrenceInfoDate3;
    }

    @JsonProperty("hi03_04_occurrenceInfoDate3")
    public void setHi0304OccurrenceInfoDate3(String hi0304OccurrenceInfoDate3) {
        this.hi0304OccurrenceInfoDate3 = hi0304OccurrenceInfoDate3;
    }

    public HiOccurrenceInfo withHi0304OccurrenceInfoDate3(String hi0304OccurrenceInfoDate3) {
        this.hi0304OccurrenceInfoDate3 = hi0304OccurrenceInfoDate3;
        return this;
    }

    @JsonProperty("hi04_occurrenceInfo4")
    public String getHi04OccurrenceInfo4() {
        return hi04OccurrenceInfo4;
    }

    @JsonProperty("hi04_occurrenceInfo4")
    public void setHi04OccurrenceInfo4(String hi04OccurrenceInfo4) {
        this.hi04OccurrenceInfo4 = hi04OccurrenceInfo4;
    }

    public HiOccurrenceInfo withHi04OccurrenceInfo4(String hi04OccurrenceInfo4) {
        this.hi04OccurrenceInfo4 = hi04OccurrenceInfo4;
        return this;
    }

    @JsonProperty("hi04_01_occurrenceInfoQlfr4")
    public String getHi0401OccurrenceInfoQlfr4() {
        return hi0401OccurrenceInfoQlfr4;
    }

    @JsonProperty("hi04_01_occurrenceInfoQlfr4")
    public void setHi0401OccurrenceInfoQlfr4(String hi0401OccurrenceInfoQlfr4) {
        this.hi0401OccurrenceInfoQlfr4 = hi0401OccurrenceInfoQlfr4;
    }

    public HiOccurrenceInfo withHi0401OccurrenceInfoQlfr4(String hi0401OccurrenceInfoQlfr4) {
        this.hi0401OccurrenceInfoQlfr4 = hi0401OccurrenceInfoQlfr4;
        return this;
    }

    @JsonProperty("hi04_02_occurrenceInfoCode4")
    public String getHi0402OccurrenceInfoCode4() {
        return hi0402OccurrenceInfoCode4;
    }

    @JsonProperty("hi04_02_occurrenceInfoCode4")
    public void setHi0402OccurrenceInfoCode4(String hi0402OccurrenceInfoCode4) {
        this.hi0402OccurrenceInfoCode4 = hi0402OccurrenceInfoCode4;
    }

    public HiOccurrenceInfo withHi0402OccurrenceInfoCode4(String hi0402OccurrenceInfoCode4) {
        this.hi0402OccurrenceInfoCode4 = hi0402OccurrenceInfoCode4;
        return this;
    }

    @JsonProperty("hi04_03_occurrenceInfoDateFormatQlfr4")
    public String getHi0403OccurrenceInfoDateFormatQlfr4() {
        return hi0403OccurrenceInfoDateFormatQlfr4;
    }

    @JsonProperty("hi04_03_occurrenceInfoDateFormatQlfr4")
    public void setHi0403OccurrenceInfoDateFormatQlfr4(String hi0403OccurrenceInfoDateFormatQlfr4) {
        this.hi0403OccurrenceInfoDateFormatQlfr4 = hi0403OccurrenceInfoDateFormatQlfr4;
    }

    public HiOccurrenceInfo withHi0403OccurrenceInfoDateFormatQlfr4(String hi0403OccurrenceInfoDateFormatQlfr4) {
        this.hi0403OccurrenceInfoDateFormatQlfr4 = hi0403OccurrenceInfoDateFormatQlfr4;
        return this;
    }

    @JsonProperty("hi04_04_occurrenceInfoDate4")
    public String getHi0404OccurrenceInfoDate4() {
        return hi0404OccurrenceInfoDate4;
    }

    @JsonProperty("hi04_04_occurrenceInfoDate4")
    public void setHi0404OccurrenceInfoDate4(String hi0404OccurrenceInfoDate4) {
        this.hi0404OccurrenceInfoDate4 = hi0404OccurrenceInfoDate4;
    }

    public HiOccurrenceInfo withHi0404OccurrenceInfoDate4(String hi0404OccurrenceInfoDate4) {
        this.hi0404OccurrenceInfoDate4 = hi0404OccurrenceInfoDate4;
        return this;
    }

    @JsonProperty("hi05_occurrenceInfo5")
    public String getHi05OccurrenceInfo5() {
        return hi05OccurrenceInfo5;
    }

    @JsonProperty("hi05_occurrenceInfo5")
    public void setHi05OccurrenceInfo5(String hi05OccurrenceInfo5) {
        this.hi05OccurrenceInfo5 = hi05OccurrenceInfo5;
    }

    public HiOccurrenceInfo withHi05OccurrenceInfo5(String hi05OccurrenceInfo5) {
        this.hi05OccurrenceInfo5 = hi05OccurrenceInfo5;
        return this;
    }

    @JsonProperty("hi05_01_occurrenceInfoQlfr5")
    public String getHi0501OccurrenceInfoQlfr5() {
        return hi0501OccurrenceInfoQlfr5;
    }

    @JsonProperty("hi05_01_occurrenceInfoQlfr5")
    public void setHi0501OccurrenceInfoQlfr5(String hi0501OccurrenceInfoQlfr5) {
        this.hi0501OccurrenceInfoQlfr5 = hi0501OccurrenceInfoQlfr5;
    }

    public HiOccurrenceInfo withHi0501OccurrenceInfoQlfr5(String hi0501OccurrenceInfoQlfr5) {
        this.hi0501OccurrenceInfoQlfr5 = hi0501OccurrenceInfoQlfr5;
        return this;
    }

    @JsonProperty("hi05_02_occurrenceInfoCode5")
    public String getHi0502OccurrenceInfoCode5() {
        return hi0502OccurrenceInfoCode5;
    }

    @JsonProperty("hi05_02_occurrenceInfoCode5")
    public void setHi0502OccurrenceInfoCode5(String hi0502OccurrenceInfoCode5) {
        this.hi0502OccurrenceInfoCode5 = hi0502OccurrenceInfoCode5;
    }

    public HiOccurrenceInfo withHi0502OccurrenceInfoCode5(String hi0502OccurrenceInfoCode5) {
        this.hi0502OccurrenceInfoCode5 = hi0502OccurrenceInfoCode5;
        return this;
    }

    @JsonProperty("hi05_03_occurrenceInfoDateFormatQlfr5")
    public String getHi0503OccurrenceInfoDateFormatQlfr5() {
        return hi0503OccurrenceInfoDateFormatQlfr5;
    }

    @JsonProperty("hi05_03_occurrenceInfoDateFormatQlfr5")
    public void setHi0503OccurrenceInfoDateFormatQlfr5(String hi0503OccurrenceInfoDateFormatQlfr5) {
        this.hi0503OccurrenceInfoDateFormatQlfr5 = hi0503OccurrenceInfoDateFormatQlfr5;
    }

    public HiOccurrenceInfo withHi0503OccurrenceInfoDateFormatQlfr5(String hi0503OccurrenceInfoDateFormatQlfr5) {
        this.hi0503OccurrenceInfoDateFormatQlfr5 = hi0503OccurrenceInfoDateFormatQlfr5;
        return this;
    }

    @JsonProperty("hi05_04_occurrenceInfoDate5")
    public String getHi0504OccurrenceInfoDate5() {
        return hi0504OccurrenceInfoDate5;
    }

    @JsonProperty("hi05_04_occurrenceInfoDate5")
    public void setHi0504OccurrenceInfoDate5(String hi0504OccurrenceInfoDate5) {
        this.hi0504OccurrenceInfoDate5 = hi0504OccurrenceInfoDate5;
    }

    public HiOccurrenceInfo withHi0504OccurrenceInfoDate5(String hi0504OccurrenceInfoDate5) {
        this.hi0504OccurrenceInfoDate5 = hi0504OccurrenceInfoDate5;
        return this;
    }

    @JsonProperty("hi06_occurrenceInfo6")
    public String getHi06OccurrenceInfo6() {
        return hi06OccurrenceInfo6;
    }

    @JsonProperty("hi06_occurrenceInfo6")
    public void setHi06OccurrenceInfo6(String hi06OccurrenceInfo6) {
        this.hi06OccurrenceInfo6 = hi06OccurrenceInfo6;
    }

    public HiOccurrenceInfo withHi06OccurrenceInfo6(String hi06OccurrenceInfo6) {
        this.hi06OccurrenceInfo6 = hi06OccurrenceInfo6;
        return this;
    }

    @JsonProperty("hi06_01_occurrenceInfoQlfr6")
    public String getHi0601OccurrenceInfoQlfr6() {
        return hi0601OccurrenceInfoQlfr6;
    }

    @JsonProperty("hi06_01_occurrenceInfoQlfr6")
    public void setHi0601OccurrenceInfoQlfr6(String hi0601OccurrenceInfoQlfr6) {
        this.hi0601OccurrenceInfoQlfr6 = hi0601OccurrenceInfoQlfr6;
    }

    public HiOccurrenceInfo withHi0601OccurrenceInfoQlfr6(String hi0601OccurrenceInfoQlfr6) {
        this.hi0601OccurrenceInfoQlfr6 = hi0601OccurrenceInfoQlfr6;
        return this;
    }

    @JsonProperty("hi06_02_occurrenceInfoCode6")
    public String getHi0602OccurrenceInfoCode6() {
        return hi0602OccurrenceInfoCode6;
    }

    @JsonProperty("hi06_02_occurrenceInfoCode6")
    public void setHi0602OccurrenceInfoCode6(String hi0602OccurrenceInfoCode6) {
        this.hi0602OccurrenceInfoCode6 = hi0602OccurrenceInfoCode6;
    }

    public HiOccurrenceInfo withHi0602OccurrenceInfoCode6(String hi0602OccurrenceInfoCode6) {
        this.hi0602OccurrenceInfoCode6 = hi0602OccurrenceInfoCode6;
        return this;
    }

    @JsonProperty("hi06_03_occurrenceInfoDateFormatQlfr6")
    public String getHi0603OccurrenceInfoDateFormatQlfr6() {
        return hi0603OccurrenceInfoDateFormatQlfr6;
    }

    @JsonProperty("hi06_03_occurrenceInfoDateFormatQlfr6")
    public void setHi0603OccurrenceInfoDateFormatQlfr6(String hi0603OccurrenceInfoDateFormatQlfr6) {
        this.hi0603OccurrenceInfoDateFormatQlfr6 = hi0603OccurrenceInfoDateFormatQlfr6;
    }

    public HiOccurrenceInfo withHi0603OccurrenceInfoDateFormatQlfr6(String hi0603OccurrenceInfoDateFormatQlfr6) {
        this.hi0603OccurrenceInfoDateFormatQlfr6 = hi0603OccurrenceInfoDateFormatQlfr6;
        return this;
    }

    @JsonProperty("hi06_04_occurrenceInfoDate6")
    public String getHi0604OccurrenceInfoDate6() {
        return hi0604OccurrenceInfoDate6;
    }

    @JsonProperty("hi06_04_occurrenceInfoDate6")
    public void setHi0604OccurrenceInfoDate6(String hi0604OccurrenceInfoDate6) {
        this.hi0604OccurrenceInfoDate6 = hi0604OccurrenceInfoDate6;
    }

    public HiOccurrenceInfo withHi0604OccurrenceInfoDate6(String hi0604OccurrenceInfoDate6) {
        this.hi0604OccurrenceInfoDate6 = hi0604OccurrenceInfoDate6;
        return this;
    }

    @JsonProperty("hi07_occurrenceInfo7")
    public String getHi07OccurrenceInfo7() {
        return hi07OccurrenceInfo7;
    }

    @JsonProperty("hi07_occurrenceInfo7")
    public void setHi07OccurrenceInfo7(String hi07OccurrenceInfo7) {
        this.hi07OccurrenceInfo7 = hi07OccurrenceInfo7;
    }

    public HiOccurrenceInfo withHi07OccurrenceInfo7(String hi07OccurrenceInfo7) {
        this.hi07OccurrenceInfo7 = hi07OccurrenceInfo7;
        return this;
    }

    @JsonProperty("hi07_01_occurrenceInfoQlfr7")
    public String getHi0701OccurrenceInfoQlfr7() {
        return hi0701OccurrenceInfoQlfr7;
    }

    @JsonProperty("hi07_01_occurrenceInfoQlfr7")
    public void setHi0701OccurrenceInfoQlfr7(String hi0701OccurrenceInfoQlfr7) {
        this.hi0701OccurrenceInfoQlfr7 = hi0701OccurrenceInfoQlfr7;
    }

    public HiOccurrenceInfo withHi0701OccurrenceInfoQlfr7(String hi0701OccurrenceInfoQlfr7) {
        this.hi0701OccurrenceInfoQlfr7 = hi0701OccurrenceInfoQlfr7;
        return this;
    }

    @JsonProperty("hi07_02_occurrenceInfoCode7")
    public String getHi0702OccurrenceInfoCode7() {
        return hi0702OccurrenceInfoCode7;
    }

    @JsonProperty("hi07_02_occurrenceInfoCode7")
    public void setHi0702OccurrenceInfoCode7(String hi0702OccurrenceInfoCode7) {
        this.hi0702OccurrenceInfoCode7 = hi0702OccurrenceInfoCode7;
    }

    public HiOccurrenceInfo withHi0702OccurrenceInfoCode7(String hi0702OccurrenceInfoCode7) {
        this.hi0702OccurrenceInfoCode7 = hi0702OccurrenceInfoCode7;
        return this;
    }

    @JsonProperty("hi07_03_occurrenceInfoDateFormatQlfr7")
    public String getHi0703OccurrenceInfoDateFormatQlfr7() {
        return hi0703OccurrenceInfoDateFormatQlfr7;
    }

    @JsonProperty("hi07_03_occurrenceInfoDateFormatQlfr7")
    public void setHi0703OccurrenceInfoDateFormatQlfr7(String hi0703OccurrenceInfoDateFormatQlfr7) {
        this.hi0703OccurrenceInfoDateFormatQlfr7 = hi0703OccurrenceInfoDateFormatQlfr7;
    }

    public HiOccurrenceInfo withHi0703OccurrenceInfoDateFormatQlfr7(String hi0703OccurrenceInfoDateFormatQlfr7) {
        this.hi0703OccurrenceInfoDateFormatQlfr7 = hi0703OccurrenceInfoDateFormatQlfr7;
        return this;
    }

    @JsonProperty("hi07_04_occurrenceInfoDate7")
    public String getHi0704OccurrenceInfoDate7() {
        return hi0704OccurrenceInfoDate7;
    }

    @JsonProperty("hi07_04_occurrenceInfoDate7")
    public void setHi0704OccurrenceInfoDate7(String hi0704OccurrenceInfoDate7) {
        this.hi0704OccurrenceInfoDate7 = hi0704OccurrenceInfoDate7;
    }

    public HiOccurrenceInfo withHi0704OccurrenceInfoDate7(String hi0704OccurrenceInfoDate7) {
        this.hi0704OccurrenceInfoDate7 = hi0704OccurrenceInfoDate7;
        return this;
    }

    @JsonProperty("hi08_occurrenceInfo8")
    public String getHi08OccurrenceInfo8() {
        return hi08OccurrenceInfo8;
    }

    @JsonProperty("hi08_occurrenceInfo8")
    public void setHi08OccurrenceInfo8(String hi08OccurrenceInfo8) {
        this.hi08OccurrenceInfo8 = hi08OccurrenceInfo8;
    }

    public HiOccurrenceInfo withHi08OccurrenceInfo8(String hi08OccurrenceInfo8) {
        this.hi08OccurrenceInfo8 = hi08OccurrenceInfo8;
        return this;
    }

    @JsonProperty("hi08_01_occurrenceInfoQlfr8")
    public String getHi0801OccurrenceInfoQlfr8() {
        return hi0801OccurrenceInfoQlfr8;
    }

    @JsonProperty("hi08_01_occurrenceInfoQlfr8")
    public void setHi0801OccurrenceInfoQlfr8(String hi0801OccurrenceInfoQlfr8) {
        this.hi0801OccurrenceInfoQlfr8 = hi0801OccurrenceInfoQlfr8;
    }

    public HiOccurrenceInfo withHi0801OccurrenceInfoQlfr8(String hi0801OccurrenceInfoQlfr8) {
        this.hi0801OccurrenceInfoQlfr8 = hi0801OccurrenceInfoQlfr8;
        return this;
    }

    @JsonProperty("hi08_02_occurrenceInfoCode8")
    public String getHi0802OccurrenceInfoCode8() {
        return hi0802OccurrenceInfoCode8;
    }

    @JsonProperty("hi08_02_occurrenceInfoCode8")
    public void setHi0802OccurrenceInfoCode8(String hi0802OccurrenceInfoCode8) {
        this.hi0802OccurrenceInfoCode8 = hi0802OccurrenceInfoCode8;
    }

    public HiOccurrenceInfo withHi0802OccurrenceInfoCode8(String hi0802OccurrenceInfoCode8) {
        this.hi0802OccurrenceInfoCode8 = hi0802OccurrenceInfoCode8;
        return this;
    }

    @JsonProperty("hi08_03_occurrenceInfoDateFormatQlfr8")
    public String getHi0803OccurrenceInfoDateFormatQlfr8() {
        return hi0803OccurrenceInfoDateFormatQlfr8;
    }

    @JsonProperty("hi08_03_occurrenceInfoDateFormatQlfr8")
    public void setHi0803OccurrenceInfoDateFormatQlfr8(String hi0803OccurrenceInfoDateFormatQlfr8) {
        this.hi0803OccurrenceInfoDateFormatQlfr8 = hi0803OccurrenceInfoDateFormatQlfr8;
    }

    public HiOccurrenceInfo withHi0803OccurrenceInfoDateFormatQlfr8(String hi0803OccurrenceInfoDateFormatQlfr8) {
        this.hi0803OccurrenceInfoDateFormatQlfr8 = hi0803OccurrenceInfoDateFormatQlfr8;
        return this;
    }

    @JsonProperty("hi08_04_occurrenceInfoDate8")
    public String getHi0804OccurrenceInfoDate8() {
        return hi0804OccurrenceInfoDate8;
    }

    @JsonProperty("hi08_04_occurrenceInfoDate8")
    public void setHi0804OccurrenceInfoDate8(String hi0804OccurrenceInfoDate8) {
        this.hi0804OccurrenceInfoDate8 = hi0804OccurrenceInfoDate8;
    }

    public HiOccurrenceInfo withHi0804OccurrenceInfoDate8(String hi0804OccurrenceInfoDate8) {
        this.hi0804OccurrenceInfoDate8 = hi0804OccurrenceInfoDate8;
        return this;
    }

    @JsonProperty("hi09_occurrenceInfo9")
    public String getHi09OccurrenceInfo9() {
        return hi09OccurrenceInfo9;
    }

    @JsonProperty("hi09_occurrenceInfo9")
    public void setHi09OccurrenceInfo9(String hi09OccurrenceInfo9) {
        this.hi09OccurrenceInfo9 = hi09OccurrenceInfo9;
    }

    public HiOccurrenceInfo withHi09OccurrenceInfo9(String hi09OccurrenceInfo9) {
        this.hi09OccurrenceInfo9 = hi09OccurrenceInfo9;
        return this;
    }

    @JsonProperty("hi09_01_occurrenceInfoQlfr9")
    public String getHi0901OccurrenceInfoQlfr9() {
        return hi0901OccurrenceInfoQlfr9;
    }

    @JsonProperty("hi09_01_occurrenceInfoQlfr9")
    public void setHi0901OccurrenceInfoQlfr9(String hi0901OccurrenceInfoQlfr9) {
        this.hi0901OccurrenceInfoQlfr9 = hi0901OccurrenceInfoQlfr9;
    }

    public HiOccurrenceInfo withHi0901OccurrenceInfoQlfr9(String hi0901OccurrenceInfoQlfr9) {
        this.hi0901OccurrenceInfoQlfr9 = hi0901OccurrenceInfoQlfr9;
        return this;
    }

    @JsonProperty("hi09_02_occurrenceInfoCode9")
    public String getHi0902OccurrenceInfoCode9() {
        return hi0902OccurrenceInfoCode9;
    }

    @JsonProperty("hi09_02_occurrenceInfoCode9")
    public void setHi0902OccurrenceInfoCode9(String hi0902OccurrenceInfoCode9) {
        this.hi0902OccurrenceInfoCode9 = hi0902OccurrenceInfoCode9;
    }

    public HiOccurrenceInfo withHi0902OccurrenceInfoCode9(String hi0902OccurrenceInfoCode9) {
        this.hi0902OccurrenceInfoCode9 = hi0902OccurrenceInfoCode9;
        return this;
    }

    @JsonProperty("hi09_03_occurrenceInfoDateFormatQlfr9")
    public String getHi0903OccurrenceInfoDateFormatQlfr9() {
        return hi0903OccurrenceInfoDateFormatQlfr9;
    }

    @JsonProperty("hi09_03_occurrenceInfoDateFormatQlfr9")
    public void setHi0903OccurrenceInfoDateFormatQlfr9(String hi0903OccurrenceInfoDateFormatQlfr9) {
        this.hi0903OccurrenceInfoDateFormatQlfr9 = hi0903OccurrenceInfoDateFormatQlfr9;
    }

    public HiOccurrenceInfo withHi0903OccurrenceInfoDateFormatQlfr9(String hi0903OccurrenceInfoDateFormatQlfr9) {
        this.hi0903OccurrenceInfoDateFormatQlfr9 = hi0903OccurrenceInfoDateFormatQlfr9;
        return this;
    }

    @JsonProperty("hi09_04_occurrenceInfoDate9")
    public String getHi0904OccurrenceInfoDate9() {
        return hi0904OccurrenceInfoDate9;
    }

    @JsonProperty("hi09_04_occurrenceInfoDate9")
    public void setHi0904OccurrenceInfoDate9(String hi0904OccurrenceInfoDate9) {
        this.hi0904OccurrenceInfoDate9 = hi0904OccurrenceInfoDate9;
    }

    public HiOccurrenceInfo withHi0904OccurrenceInfoDate9(String hi0904OccurrenceInfoDate9) {
        this.hi0904OccurrenceInfoDate9 = hi0904OccurrenceInfoDate9;
        return this;
    }

    @JsonProperty("hi10_occurrenceInfo10")
    public String getHi10OccurrenceInfo10() {
        return hi10OccurrenceInfo10;
    }

    @JsonProperty("hi10_occurrenceInfo10")
    public void setHi10OccurrenceInfo10(String hi10OccurrenceInfo10) {
        this.hi10OccurrenceInfo10 = hi10OccurrenceInfo10;
    }

    public HiOccurrenceInfo withHi10OccurrenceInfo10(String hi10OccurrenceInfo10) {
        this.hi10OccurrenceInfo10 = hi10OccurrenceInfo10;
        return this;
    }

    @JsonProperty("hi10_01_occurrenceInfoQlfr10")
    public String getHi1001OccurrenceInfoQlfr10() {
        return hi1001OccurrenceInfoQlfr10;
    }

    @JsonProperty("hi10_01_occurrenceInfoQlfr10")
    public void setHi1001OccurrenceInfoQlfr10(String hi1001OccurrenceInfoQlfr10) {
        this.hi1001OccurrenceInfoQlfr10 = hi1001OccurrenceInfoQlfr10;
    }

    public HiOccurrenceInfo withHi1001OccurrenceInfoQlfr10(String hi1001OccurrenceInfoQlfr10) {
        this.hi1001OccurrenceInfoQlfr10 = hi1001OccurrenceInfoQlfr10;
        return this;
    }

    @JsonProperty("hi10_02_occurrenceInfoCode10")
    public String getHi1002OccurrenceInfoCode10() {
        return hi1002OccurrenceInfoCode10;
    }

    @JsonProperty("hi10_02_occurrenceInfoCode10")
    public void setHi1002OccurrenceInfoCode10(String hi1002OccurrenceInfoCode10) {
        this.hi1002OccurrenceInfoCode10 = hi1002OccurrenceInfoCode10;
    }

    public HiOccurrenceInfo withHi1002OccurrenceInfoCode10(String hi1002OccurrenceInfoCode10) {
        this.hi1002OccurrenceInfoCode10 = hi1002OccurrenceInfoCode10;
        return this;
    }

    @JsonProperty("hi10_03_occurrenceInfoDateFormatQlfr10")
    public String getHi1003OccurrenceInfoDateFormatQlfr10() {
        return hi1003OccurrenceInfoDateFormatQlfr10;
    }

    @JsonProperty("hi10_03_occurrenceInfoDateFormatQlfr10")
    public void setHi1003OccurrenceInfoDateFormatQlfr10(String hi1003OccurrenceInfoDateFormatQlfr10) {
        this.hi1003OccurrenceInfoDateFormatQlfr10 = hi1003OccurrenceInfoDateFormatQlfr10;
    }

    public HiOccurrenceInfo withHi1003OccurrenceInfoDateFormatQlfr10(String hi1003OccurrenceInfoDateFormatQlfr10) {
        this.hi1003OccurrenceInfoDateFormatQlfr10 = hi1003OccurrenceInfoDateFormatQlfr10;
        return this;
    }

    @JsonProperty("hi10_04_occurrenceInfoDate10")
    public String getHi1004OccurrenceInfoDate10() {
        return hi1004OccurrenceInfoDate10;
    }

    @JsonProperty("hi10_04_occurrenceInfoDate10")
    public void setHi1004OccurrenceInfoDate10(String hi1004OccurrenceInfoDate10) {
        this.hi1004OccurrenceInfoDate10 = hi1004OccurrenceInfoDate10;
    }

    public HiOccurrenceInfo withHi1004OccurrenceInfoDate10(String hi1004OccurrenceInfoDate10) {
        this.hi1004OccurrenceInfoDate10 = hi1004OccurrenceInfoDate10;
        return this;
    }

    @JsonProperty("hi11_occurrenceInfo11")
    public String getHi11OccurrenceInfo11() {
        return hi11OccurrenceInfo11;
    }

    @JsonProperty("hi11_occurrenceInfo11")
    public void setHi11OccurrenceInfo11(String hi11OccurrenceInfo11) {
        this.hi11OccurrenceInfo11 = hi11OccurrenceInfo11;
    }

    public HiOccurrenceInfo withHi11OccurrenceInfo11(String hi11OccurrenceInfo11) {
        this.hi11OccurrenceInfo11 = hi11OccurrenceInfo11;
        return this;
    }

    @JsonProperty("hi11_01_occurrenceInfoQlfr11")
    public String getHi1101OccurrenceInfoQlfr11() {
        return hi1101OccurrenceInfoQlfr11;
    }

    @JsonProperty("hi11_01_occurrenceInfoQlfr11")
    public void setHi1101OccurrenceInfoQlfr11(String hi1101OccurrenceInfoQlfr11) {
        this.hi1101OccurrenceInfoQlfr11 = hi1101OccurrenceInfoQlfr11;
    }

    public HiOccurrenceInfo withHi1101OccurrenceInfoQlfr11(String hi1101OccurrenceInfoQlfr11) {
        this.hi1101OccurrenceInfoQlfr11 = hi1101OccurrenceInfoQlfr11;
        return this;
    }

    @JsonProperty("hi11_02_occurrenceInfoCode11")
    public String getHi1102OccurrenceInfoCode11() {
        return hi1102OccurrenceInfoCode11;
    }

    @JsonProperty("hi11_02_occurrenceInfoCode11")
    public void setHi1102OccurrenceInfoCode11(String hi1102OccurrenceInfoCode11) {
        this.hi1102OccurrenceInfoCode11 = hi1102OccurrenceInfoCode11;
    }

    public HiOccurrenceInfo withHi1102OccurrenceInfoCode11(String hi1102OccurrenceInfoCode11) {
        this.hi1102OccurrenceInfoCode11 = hi1102OccurrenceInfoCode11;
        return this;
    }

    @JsonProperty("hi11_03_occurrenceInfoDateFormatQlfr11")
    public String getHi1103OccurrenceInfoDateFormatQlfr11() {
        return hi1103OccurrenceInfoDateFormatQlfr11;
    }

    @JsonProperty("hi11_03_occurrenceInfoDateFormatQlfr11")
    public void setHi1103OccurrenceInfoDateFormatQlfr11(String hi1103OccurrenceInfoDateFormatQlfr11) {
        this.hi1103OccurrenceInfoDateFormatQlfr11 = hi1103OccurrenceInfoDateFormatQlfr11;
    }

    public HiOccurrenceInfo withHi1103OccurrenceInfoDateFormatQlfr11(String hi1103OccurrenceInfoDateFormatQlfr11) {
        this.hi1103OccurrenceInfoDateFormatQlfr11 = hi1103OccurrenceInfoDateFormatQlfr11;
        return this;
    }

    @JsonProperty("hi11_04_occurrenceInfoDate11")
    public String getHi1104OccurrenceInfoDate11() {
        return hi1104OccurrenceInfoDate11;
    }

    @JsonProperty("hi11_04_occurrenceInfoDate11")
    public void setHi1104OccurrenceInfoDate11(String hi1104OccurrenceInfoDate11) {
        this.hi1104OccurrenceInfoDate11 = hi1104OccurrenceInfoDate11;
    }

    public HiOccurrenceInfo withHi1104OccurrenceInfoDate11(String hi1104OccurrenceInfoDate11) {
        this.hi1104OccurrenceInfoDate11 = hi1104OccurrenceInfoDate11;
        return this;
    }

    @JsonProperty("hi12_occurrenceInfo12")
    public String getHi12OccurrenceInfo12() {
        return hi12OccurrenceInfo12;
    }

    @JsonProperty("hi12_occurrenceInfo12")
    public void setHi12OccurrenceInfo12(String hi12OccurrenceInfo12) {
        this.hi12OccurrenceInfo12 = hi12OccurrenceInfo12;
    }

    public HiOccurrenceInfo withHi12OccurrenceInfo12(String hi12OccurrenceInfo12) {
        this.hi12OccurrenceInfo12 = hi12OccurrenceInfo12;
        return this;
    }

    @JsonProperty("hi12_01_occurrenceInfoQlfr12")
    public String getHi1201OccurrenceInfoQlfr12() {
        return hi1201OccurrenceInfoQlfr12;
    }

    @JsonProperty("hi12_01_occurrenceInfoQlfr12")
    public void setHi1201OccurrenceInfoQlfr12(String hi1201OccurrenceInfoQlfr12) {
        this.hi1201OccurrenceInfoQlfr12 = hi1201OccurrenceInfoQlfr12;
    }

    public HiOccurrenceInfo withHi1201OccurrenceInfoQlfr12(String hi1201OccurrenceInfoQlfr12) {
        this.hi1201OccurrenceInfoQlfr12 = hi1201OccurrenceInfoQlfr12;
        return this;
    }

    @JsonProperty("hi12_02_occurrenceInfoCode12")
    public String getHi1202OccurrenceInfoCode12() {
        return hi1202OccurrenceInfoCode12;
    }

    @JsonProperty("hi12_02_occurrenceInfoCode12")
    public void setHi1202OccurrenceInfoCode12(String hi1202OccurrenceInfoCode12) {
        this.hi1202OccurrenceInfoCode12 = hi1202OccurrenceInfoCode12;
    }

    public HiOccurrenceInfo withHi1202OccurrenceInfoCode12(String hi1202OccurrenceInfoCode12) {
        this.hi1202OccurrenceInfoCode12 = hi1202OccurrenceInfoCode12;
        return this;
    }

    @JsonProperty("hi12_03_occurrenceInfoDateFormatQlfr12")
    public String getHi1203OccurrenceInfoDateFormatQlfr12() {
        return hi1203OccurrenceInfoDateFormatQlfr12;
    }

    @JsonProperty("hi12_03_occurrenceInfoDateFormatQlfr12")
    public void setHi1203OccurrenceInfoDateFormatQlfr12(String hi1203OccurrenceInfoDateFormatQlfr12) {
        this.hi1203OccurrenceInfoDateFormatQlfr12 = hi1203OccurrenceInfoDateFormatQlfr12;
    }

    public HiOccurrenceInfo withHi1203OccurrenceInfoDateFormatQlfr12(String hi1203OccurrenceInfoDateFormatQlfr12) {
        this.hi1203OccurrenceInfoDateFormatQlfr12 = hi1203OccurrenceInfoDateFormatQlfr12;
        return this;
    }

    @JsonProperty("hi12_04_occurrenceInfoDate12")
    public String getHi1204OccurrenceInfoDate12() {
        return hi1204OccurrenceInfoDate12;
    }

    @JsonProperty("hi12_04_occurrenceInfoDate12")
    public void setHi1204OccurrenceInfoDate12(String hi1204OccurrenceInfoDate12) {
        this.hi1204OccurrenceInfoDate12 = hi1204OccurrenceInfoDate12;
    }

    public HiOccurrenceInfo withHi1204OccurrenceInfoDate12(String hi1204OccurrenceInfoDate12) {
        this.hi1204OccurrenceInfoDate12 = hi1204OccurrenceInfoDate12;
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

    public HiOccurrenceInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hi01OccurrenceInfo1).append(hi0101OccurrenceInfoQlfr1).append(hi0102OccurrenceInfoCode1).append(hi0103OccurrenceInfoDateFormatQlfr1).append(hi0104OccurrenceInfoDate1).append(hi02OccurrenceInfo2).append(hi0201OccurrenceInfoQlfr2).append(hi0202OccurrenceInfoCode2).append(hi0203OccurrenceInfoDateFormatQlfr2).append(hi0204OccurrenceInfoDate2).append(hi03OccurrenceInfo3).append(hi0301OccurrenceInfoQlfr3).append(hi0302OccurrenceInfoCode3).append(hi0303OccurrenceInfoDateFormatQlfr3).append(hi0304OccurrenceInfoDate3).append(hi04OccurrenceInfo4).append(hi0401OccurrenceInfoQlfr4).append(hi0402OccurrenceInfoCode4).append(hi0403OccurrenceInfoDateFormatQlfr4).append(hi0404OccurrenceInfoDate4).append(hi05OccurrenceInfo5).append(hi0501OccurrenceInfoQlfr5).append(hi0502OccurrenceInfoCode5).append(hi0503OccurrenceInfoDateFormatQlfr5).append(hi0504OccurrenceInfoDate5).append(hi06OccurrenceInfo6).append(hi0601OccurrenceInfoQlfr6).append(hi0602OccurrenceInfoCode6).append(hi0603OccurrenceInfoDateFormatQlfr6).append(hi0604OccurrenceInfoDate6).append(hi07OccurrenceInfo7).append(hi0701OccurrenceInfoQlfr7).append(hi0702OccurrenceInfoCode7).append(hi0703OccurrenceInfoDateFormatQlfr7).append(hi0704OccurrenceInfoDate7).append(hi08OccurrenceInfo8).append(hi0801OccurrenceInfoQlfr8).append(hi0802OccurrenceInfoCode8).append(hi0803OccurrenceInfoDateFormatQlfr8).append(hi0804OccurrenceInfoDate8).append(hi09OccurrenceInfo9).append(hi0901OccurrenceInfoQlfr9).append(hi0902OccurrenceInfoCode9).append(hi0903OccurrenceInfoDateFormatQlfr9).append(hi0904OccurrenceInfoDate9).append(hi10OccurrenceInfo10).append(hi1001OccurrenceInfoQlfr10).append(hi1002OccurrenceInfoCode10).append(hi1003OccurrenceInfoDateFormatQlfr10).append(hi1004OccurrenceInfoDate10).append(hi11OccurrenceInfo11).append(hi1101OccurrenceInfoQlfr11).append(hi1102OccurrenceInfoCode11).append(hi1103OccurrenceInfoDateFormatQlfr11).append(hi1104OccurrenceInfoDate11).append(hi12OccurrenceInfo12).append(hi1201OccurrenceInfoQlfr12).append(hi1202OccurrenceInfoCode12).append(hi1203OccurrenceInfoDateFormatQlfr12).append(hi1204OccurrenceInfoDate12).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiOccurrenceInfo) == false) {
            return false;
        }
        HiOccurrenceInfo rhs = ((HiOccurrenceInfo) other);
        return new EqualsBuilder().append(hi01OccurrenceInfo1, rhs.hi01OccurrenceInfo1).append(hi0101OccurrenceInfoQlfr1, rhs.hi0101OccurrenceInfoQlfr1).append(hi0102OccurrenceInfoCode1, rhs.hi0102OccurrenceInfoCode1).append(hi0103OccurrenceInfoDateFormatQlfr1, rhs.hi0103OccurrenceInfoDateFormatQlfr1).append(hi0104OccurrenceInfoDate1, rhs.hi0104OccurrenceInfoDate1).append(hi02OccurrenceInfo2, rhs.hi02OccurrenceInfo2).append(hi0201OccurrenceInfoQlfr2, rhs.hi0201OccurrenceInfoQlfr2).append(hi0202OccurrenceInfoCode2, rhs.hi0202OccurrenceInfoCode2).append(hi0203OccurrenceInfoDateFormatQlfr2, rhs.hi0203OccurrenceInfoDateFormatQlfr2).append(hi0204OccurrenceInfoDate2, rhs.hi0204OccurrenceInfoDate2).append(hi03OccurrenceInfo3, rhs.hi03OccurrenceInfo3).append(hi0301OccurrenceInfoQlfr3, rhs.hi0301OccurrenceInfoQlfr3).append(hi0302OccurrenceInfoCode3, rhs.hi0302OccurrenceInfoCode3).append(hi0303OccurrenceInfoDateFormatQlfr3, rhs.hi0303OccurrenceInfoDateFormatQlfr3).append(hi0304OccurrenceInfoDate3, rhs.hi0304OccurrenceInfoDate3).append(hi04OccurrenceInfo4, rhs.hi04OccurrenceInfo4).append(hi0401OccurrenceInfoQlfr4, rhs.hi0401OccurrenceInfoQlfr4).append(hi0402OccurrenceInfoCode4, rhs.hi0402OccurrenceInfoCode4).append(hi0403OccurrenceInfoDateFormatQlfr4, rhs.hi0403OccurrenceInfoDateFormatQlfr4).append(hi0404OccurrenceInfoDate4, rhs.hi0404OccurrenceInfoDate4).append(hi05OccurrenceInfo5, rhs.hi05OccurrenceInfo5).append(hi0501OccurrenceInfoQlfr5, rhs.hi0501OccurrenceInfoQlfr5).append(hi0502OccurrenceInfoCode5, rhs.hi0502OccurrenceInfoCode5).append(hi0503OccurrenceInfoDateFormatQlfr5, rhs.hi0503OccurrenceInfoDateFormatQlfr5).append(hi0504OccurrenceInfoDate5, rhs.hi0504OccurrenceInfoDate5).append(hi06OccurrenceInfo6, rhs.hi06OccurrenceInfo6).append(hi0601OccurrenceInfoQlfr6, rhs.hi0601OccurrenceInfoQlfr6).append(hi0602OccurrenceInfoCode6, rhs.hi0602OccurrenceInfoCode6).append(hi0603OccurrenceInfoDateFormatQlfr6, rhs.hi0603OccurrenceInfoDateFormatQlfr6).append(hi0604OccurrenceInfoDate6, rhs.hi0604OccurrenceInfoDate6).append(hi07OccurrenceInfo7, rhs.hi07OccurrenceInfo7).append(hi0701OccurrenceInfoQlfr7, rhs.hi0701OccurrenceInfoQlfr7).append(hi0702OccurrenceInfoCode7, rhs.hi0702OccurrenceInfoCode7).append(hi0703OccurrenceInfoDateFormatQlfr7, rhs.hi0703OccurrenceInfoDateFormatQlfr7).append(hi0704OccurrenceInfoDate7, rhs.hi0704OccurrenceInfoDate7).append(hi08OccurrenceInfo8, rhs.hi08OccurrenceInfo8).append(hi0801OccurrenceInfoQlfr8, rhs.hi0801OccurrenceInfoQlfr8).append(hi0802OccurrenceInfoCode8, rhs.hi0802OccurrenceInfoCode8).append(hi0803OccurrenceInfoDateFormatQlfr8, rhs.hi0803OccurrenceInfoDateFormatQlfr8).append(hi0804OccurrenceInfoDate8, rhs.hi0804OccurrenceInfoDate8).append(hi09OccurrenceInfo9, rhs.hi09OccurrenceInfo9).append(hi0901OccurrenceInfoQlfr9, rhs.hi0901OccurrenceInfoQlfr9).append(hi0902OccurrenceInfoCode9, rhs.hi0902OccurrenceInfoCode9).append(hi0903OccurrenceInfoDateFormatQlfr9, rhs.hi0903OccurrenceInfoDateFormatQlfr9).append(hi0904OccurrenceInfoDate9, rhs.hi0904OccurrenceInfoDate9).append(hi10OccurrenceInfo10, rhs.hi10OccurrenceInfo10).append(hi1001OccurrenceInfoQlfr10, rhs.hi1001OccurrenceInfoQlfr10).append(hi1002OccurrenceInfoCode10, rhs.hi1002OccurrenceInfoCode10).append(hi1003OccurrenceInfoDateFormatQlfr10, rhs.hi1003OccurrenceInfoDateFormatQlfr10).append(hi1004OccurrenceInfoDate10, rhs.hi1004OccurrenceInfoDate10).append(hi11OccurrenceInfo11, rhs.hi11OccurrenceInfo11).append(hi1101OccurrenceInfoQlfr11, rhs.hi1101OccurrenceInfoQlfr11).append(hi1102OccurrenceInfoCode11, rhs.hi1102OccurrenceInfoCode11).append(hi1103OccurrenceInfoDateFormatQlfr11, rhs.hi1103OccurrenceInfoDateFormatQlfr11).append(hi1104OccurrenceInfoDate11, rhs.hi1104OccurrenceInfoDate11).append(hi12OccurrenceInfo12, rhs.hi12OccurrenceInfo12).append(hi1201OccurrenceInfoQlfr12, rhs.hi1201OccurrenceInfoQlfr12).append(hi1202OccurrenceInfoCode12, rhs.hi1202OccurrenceInfoCode12).append(hi1203OccurrenceInfoDateFormatQlfr12, rhs.hi1203OccurrenceInfoDateFormatQlfr12).append(hi1204OccurrenceInfoDate12, rhs.hi1204OccurrenceInfoDate12).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "hi01_occurrenceSpanInfo1",
    "hi01_01_occurrenceSpanInfoQlfr1",
    "hi01_02_occurrenceSpanInfoCode1",
    "hi01_03_occurrenceSpanInfoDateFormatQlfr1",
    "hi01_04_occurrenceSpanInfoDate1",
    "hi02_occurrenceSpanInfo2",
    "hi02_01_occurrenceSpanInfoQlfr2",
    "hi02_02_occurrenceSpanInfoCode2",
    "hi02_03_occurrenceSpanInfoDateFormatQlfr2",
    "hi02_04_occurrenceSpanInfoDate2",
    "hi03_occurrenceSpanInfo3",
    "hi03_01_occurrenceSpanInfoQlfr3",
    "hi03_02_occurrenceSpanInfoCode3",
    "hi03_03_occurrenceSpanInfoDateFormatQlfr3",
    "hi03_04_occurrenceSpanInfoDate3",
    "hi04_occurrenceSpanInfo4",
    "hi04_01_occurrenceSpanInfoQlfr4",
    "hi04_02_occurrenceSpanInfoCode4",
    "hi04_03_occurrenceSpanInfoDateFormatQlfr4",
    "hi04_04_occurrenceSpanInfoDate4",
    "hi05_occurrenceSpanInfo5",
    "hi05_01_occurrenceSpanInfoQlfr5",
    "hi05_02_occurrenceSpanInfoCode5",
    "hi05_03_occurrenceSpanInfoDateFormatQlfr5",
    "hi05_04_occurrenceSpanInfoDate5",
    "hi06_occurrenceSpanInfo6",
    "hi06_01_occurrenceSpanInfoQlfr6",
    "hi06_02_occurrenceSpanInfoCode6",
    "hi06_03_occurrenceSpanInfoDateFormatQlfr6",
    "hi06_04_occurrenceSpanInfoDate6",
    "hi07_occurrenceSpanInfo7",
    "hi07_01_occurrenceSpanInfoQlfr7",
    "hi07_02_occurrenceSpanInfoCode7",
    "hi07_03_occurrenceSpanInfoDateFormatQlfr7",
    "hi07_04_occurrenceSpanInfoDate7",
    "hi08_occurrenceSpanInfo8",
    "hi08_01_occurrenceSpanInfoQlfr8",
    "hi08_02_occurrenceSpanInfoCode8",
    "hi08_03_occurrenceSpanInfoDateFormatQlfr8",
    "hi08_04_occurrenceSpanInfoDate8",
    "hi09_occurrenceSpanInfo9",
    "hi09_01_occurrenceSpanInfoQlfr9",
    "hi09_02_occurrenceSpanInfoCode9",
    "hi09_03_occurrenceSpanInfoDateFormatQlfr9",
    "hi09_04_occurrenceSpanInfoDate9",
    "hi10_occurrenceSpanInfo10",
    "hi10_01_occurrenceSpanInfoQlfr10",
    "hi10_02_occurrenceSpanInfoCode10",
    "hi10_03_occurrenceSpanInfoDateFormatQlfr10",
    "hi10_04_occurrenceSpanInfoDate10",
    "hi11_occurrenceSpanInfo11",
    "hi11_01_occurrenceSpanInfoQlfr11",
    "hi11_02_occurrenceSpanInfoCode11",
    "hi11_03_occurrenceSpanInfoDateFormatQlfr11",
    "hi11_04_occurrenceSpanInfoDate11",
    "hi12_occurrenceSpanInfo12",
    "hi12_01_occurrenceSpanInfoQlfr12",
    "hi12_02_occurrenceSpanInfoCode12",
    "hi12_03_occurrenceSpanInfoDateFormatQlfr12",
    "hi12_04_occurrenceSpanInfoDate12"
})
public class HiOccurrenceSpanInfo {

    @JsonProperty("hi01_occurrenceSpanInfo1")
    private String hi01OccurrenceSpanInfo1;
    @JsonProperty("hi01_01_occurrenceSpanInfoQlfr1")
    private String hi0101OccurrenceSpanInfoQlfr1;
    @JsonProperty("hi01_02_occurrenceSpanInfoCode1")
    private String hi0102OccurrenceSpanInfoCode1;
    @JsonProperty("hi01_03_occurrenceSpanInfoDateFormatQlfr1")
    private String hi0103OccurrenceSpanInfoDateFormatQlfr1;
    @JsonProperty("hi01_04_occurrenceSpanInfoDate1")
    private String hi0104OccurrenceSpanInfoDate1;
    @JsonProperty("hi02_occurrenceSpanInfo2")
    private String hi02OccurrenceSpanInfo2;
    @JsonProperty("hi02_01_occurrenceSpanInfoQlfr2")
    private String hi0201OccurrenceSpanInfoQlfr2;
    @JsonProperty("hi02_02_occurrenceSpanInfoCode2")
    private String hi0202OccurrenceSpanInfoCode2;
    @JsonProperty("hi02_03_occurrenceSpanInfoDateFormatQlfr2")
    private String hi0203OccurrenceSpanInfoDateFormatQlfr2;
    @JsonProperty("hi02_04_occurrenceSpanInfoDate2")
    private String hi0204OccurrenceSpanInfoDate2;
    @JsonProperty("hi03_occurrenceSpanInfo3")
    private String hi03OccurrenceSpanInfo3;
    @JsonProperty("hi03_01_occurrenceSpanInfoQlfr3")
    private String hi0301OccurrenceSpanInfoQlfr3;
    @JsonProperty("hi03_02_occurrenceSpanInfoCode3")
    private String hi0302OccurrenceSpanInfoCode3;
    @JsonProperty("hi03_03_occurrenceSpanInfoDateFormatQlfr3")
    private String hi0303OccurrenceSpanInfoDateFormatQlfr3;
    @JsonProperty("hi03_04_occurrenceSpanInfoDate3")
    private String hi0304OccurrenceSpanInfoDate3;
    @JsonProperty("hi04_occurrenceSpanInfo4")
    private String hi04OccurrenceSpanInfo4;
    @JsonProperty("hi04_01_occurrenceSpanInfoQlfr4")
    private String hi0401OccurrenceSpanInfoQlfr4;
    @JsonProperty("hi04_02_occurrenceSpanInfoCode4")
    private String hi0402OccurrenceSpanInfoCode4;
    @JsonProperty("hi04_03_occurrenceSpanInfoDateFormatQlfr4")
    private String hi0403OccurrenceSpanInfoDateFormatQlfr4;
    @JsonProperty("hi04_04_occurrenceSpanInfoDate4")
    private String hi0404OccurrenceSpanInfoDate4;
    @JsonProperty("hi05_occurrenceSpanInfo5")
    private String hi05OccurrenceSpanInfo5;
    @JsonProperty("hi05_01_occurrenceSpanInfoQlfr5")
    private String hi0501OccurrenceSpanInfoQlfr5;
    @JsonProperty("hi05_02_occurrenceSpanInfoCode5")
    private String hi0502OccurrenceSpanInfoCode5;
    @JsonProperty("hi05_03_occurrenceSpanInfoDateFormatQlfr5")
    private String hi0503OccurrenceSpanInfoDateFormatQlfr5;
    @JsonProperty("hi05_04_occurrenceSpanInfoDate5")
    private String hi0504OccurrenceSpanInfoDate5;
    @JsonProperty("hi06_occurrenceSpanInfo6")
    private String hi06OccurrenceSpanInfo6;
    @JsonProperty("hi06_01_occurrenceSpanInfoQlfr6")
    private String hi0601OccurrenceSpanInfoQlfr6;
    @JsonProperty("hi06_02_occurrenceSpanInfoCode6")
    private String hi0602OccurrenceSpanInfoCode6;
    @JsonProperty("hi06_03_occurrenceSpanInfoDateFormatQlfr6")
    private String hi0603OccurrenceSpanInfoDateFormatQlfr6;
    @JsonProperty("hi06_04_occurrenceSpanInfoDate6")
    private String hi0604OccurrenceSpanInfoDate6;
    @JsonProperty("hi07_occurrenceSpanInfo7")
    private String hi07OccurrenceSpanInfo7;
    @JsonProperty("hi07_01_occurrenceSpanInfoQlfr7")
    private String hi0701OccurrenceSpanInfoQlfr7;
    @JsonProperty("hi07_02_occurrenceSpanInfoCode7")
    private String hi0702OccurrenceSpanInfoCode7;
    @JsonProperty("hi07_03_occurrenceSpanInfoDateFormatQlfr7")
    private String hi0703OccurrenceSpanInfoDateFormatQlfr7;
    @JsonProperty("hi07_04_occurrenceSpanInfoDate7")
    private String hi0704OccurrenceSpanInfoDate7;
    @JsonProperty("hi08_occurrenceSpanInfo8")
    private String hi08OccurrenceSpanInfo8;
    @JsonProperty("hi08_01_occurrenceSpanInfoQlfr8")
    private String hi0801OccurrenceSpanInfoQlfr8;
    @JsonProperty("hi08_02_occurrenceSpanInfoCode8")
    private String hi0802OccurrenceSpanInfoCode8;
    @JsonProperty("hi08_03_occurrenceSpanInfoDateFormatQlfr8")
    private String hi0803OccurrenceSpanInfoDateFormatQlfr8;
    @JsonProperty("hi08_04_occurrenceSpanInfoDate8")
    private String hi0804OccurrenceSpanInfoDate8;
    @JsonProperty("hi09_occurrenceSpanInfo9")
    private String hi09OccurrenceSpanInfo9;
    @JsonProperty("hi09_01_occurrenceSpanInfoQlfr9")
    private String hi0901OccurrenceSpanInfoQlfr9;
    @JsonProperty("hi09_02_occurrenceSpanInfoCode9")
    private String hi0902OccurrenceSpanInfoCode9;
    @JsonProperty("hi09_03_occurrenceSpanInfoDateFormatQlfr9")
    private String hi0903OccurrenceSpanInfoDateFormatQlfr9;
    @JsonProperty("hi09_04_occurrenceSpanInfoDate9")
    private String hi0904OccurrenceSpanInfoDate9;
    @JsonProperty("hi10_occurrenceSpanInfo10")
    private String hi10OccurrenceSpanInfo10;
    @JsonProperty("hi10_01_occurrenceSpanInfoQlfr10")
    private String hi1001OccurrenceSpanInfoQlfr10;
    @JsonProperty("hi10_02_occurrenceSpanInfoCode10")
    private String hi1002OccurrenceSpanInfoCode10;
    @JsonProperty("hi10_03_occurrenceSpanInfoDateFormatQlfr10")
    private String hi1003OccurrenceSpanInfoDateFormatQlfr10;
    @JsonProperty("hi10_04_occurrenceSpanInfoDate10")
    private String hi1004OccurrenceSpanInfoDate10;
    @JsonProperty("hi11_occurrenceSpanInfo11")
    private String hi11OccurrenceSpanInfo11;
    @JsonProperty("hi11_01_occurrenceSpanInfoQlfr11")
    private String hi1101OccurrenceSpanInfoQlfr11;
    @JsonProperty("hi11_02_occurrenceSpanInfoCode11")
    private String hi1102OccurrenceSpanInfoCode11;
    @JsonProperty("hi11_03_occurrenceSpanInfoDateFormatQlfr11")
    private String hi1103OccurrenceSpanInfoDateFormatQlfr11;
    @JsonProperty("hi11_04_occurrenceSpanInfoDate11")
    private String hi1104OccurrenceSpanInfoDate11;
    @JsonProperty("hi12_occurrenceSpanInfo12")
    private String hi12OccurrenceSpanInfo12;
    @JsonProperty("hi12_01_occurrenceSpanInfoQlfr12")
    private String hi1201OccurrenceSpanInfoQlfr12;
    @JsonProperty("hi12_02_occurrenceSpanInfoCode12")
    private String hi1202OccurrenceSpanInfoCode12;
    @JsonProperty("hi12_03_occurrenceSpanInfoDateFormatQlfr12")
    private String hi1203OccurrenceSpanInfoDateFormatQlfr12;
    @JsonProperty("hi12_04_occurrenceSpanInfoDate12")
    private String hi1204OccurrenceSpanInfoDate12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hi01_occurrenceSpanInfo1")
    public String getHi01OccurrenceSpanInfo1() {
        return hi01OccurrenceSpanInfo1;
    }

    @JsonProperty("hi01_occurrenceSpanInfo1")
    public void setHi01OccurrenceSpanInfo1(String hi01OccurrenceSpanInfo1) {
        this.hi01OccurrenceSpanInfo1 = hi01OccurrenceSpanInfo1;
    }

    public HiOccurrenceSpanInfo withHi01OccurrenceSpanInfo1(String hi01OccurrenceSpanInfo1) {
        this.hi01OccurrenceSpanInfo1 = hi01OccurrenceSpanInfo1;
        return this;
    }

    @JsonProperty("hi01_01_occurrenceSpanInfoQlfr1")
    public String getHi0101OccurrenceSpanInfoQlfr1() {
        return hi0101OccurrenceSpanInfoQlfr1;
    }

    @JsonProperty("hi01_01_occurrenceSpanInfoQlfr1")
    public void setHi0101OccurrenceSpanInfoQlfr1(String hi0101OccurrenceSpanInfoQlfr1) {
        this.hi0101OccurrenceSpanInfoQlfr1 = hi0101OccurrenceSpanInfoQlfr1;
    }

    public HiOccurrenceSpanInfo withHi0101OccurrenceSpanInfoQlfr1(String hi0101OccurrenceSpanInfoQlfr1) {
        this.hi0101OccurrenceSpanInfoQlfr1 = hi0101OccurrenceSpanInfoQlfr1;
        return this;
    }

    @JsonProperty("hi01_02_occurrenceSpanInfoCode1")
    public String getHi0102OccurrenceSpanInfoCode1() {
        return hi0102OccurrenceSpanInfoCode1;
    }

    @JsonProperty("hi01_02_occurrenceSpanInfoCode1")
    public void setHi0102OccurrenceSpanInfoCode1(String hi0102OccurrenceSpanInfoCode1) {
        this.hi0102OccurrenceSpanInfoCode1 = hi0102OccurrenceSpanInfoCode1;
    }

    public HiOccurrenceSpanInfo withHi0102OccurrenceSpanInfoCode1(String hi0102OccurrenceSpanInfoCode1) {
        this.hi0102OccurrenceSpanInfoCode1 = hi0102OccurrenceSpanInfoCode1;
        return this;
    }

    @JsonProperty("hi01_03_occurrenceSpanInfoDateFormatQlfr1")
    public String getHi0103OccurrenceSpanInfoDateFormatQlfr1() {
        return hi0103OccurrenceSpanInfoDateFormatQlfr1;
    }

    @JsonProperty("hi01_03_occurrenceSpanInfoDateFormatQlfr1")
    public void setHi0103OccurrenceSpanInfoDateFormatQlfr1(String hi0103OccurrenceSpanInfoDateFormatQlfr1) {
        this.hi0103OccurrenceSpanInfoDateFormatQlfr1 = hi0103OccurrenceSpanInfoDateFormatQlfr1;
    }

    public HiOccurrenceSpanInfo withHi0103OccurrenceSpanInfoDateFormatQlfr1(String hi0103OccurrenceSpanInfoDateFormatQlfr1) {
        this.hi0103OccurrenceSpanInfoDateFormatQlfr1 = hi0103OccurrenceSpanInfoDateFormatQlfr1;
        return this;
    }

    @JsonProperty("hi01_04_occurrenceSpanInfoDate1")
    public String getHi0104OccurrenceSpanInfoDate1() {
        return hi0104OccurrenceSpanInfoDate1;
    }

    @JsonProperty("hi01_04_occurrenceSpanInfoDate1")
    public void setHi0104OccurrenceSpanInfoDate1(String hi0104OccurrenceSpanInfoDate1) {
        this.hi0104OccurrenceSpanInfoDate1 = hi0104OccurrenceSpanInfoDate1;
    }

    public HiOccurrenceSpanInfo withHi0104OccurrenceSpanInfoDate1(String hi0104OccurrenceSpanInfoDate1) {
        this.hi0104OccurrenceSpanInfoDate1 = hi0104OccurrenceSpanInfoDate1;
        return this;
    }

    @JsonProperty("hi02_occurrenceSpanInfo2")
    public String getHi02OccurrenceSpanInfo2() {
        return hi02OccurrenceSpanInfo2;
    }

    @JsonProperty("hi02_occurrenceSpanInfo2")
    public void setHi02OccurrenceSpanInfo2(String hi02OccurrenceSpanInfo2) {
        this.hi02OccurrenceSpanInfo2 = hi02OccurrenceSpanInfo2;
    }

    public HiOccurrenceSpanInfo withHi02OccurrenceSpanInfo2(String hi02OccurrenceSpanInfo2) {
        this.hi02OccurrenceSpanInfo2 = hi02OccurrenceSpanInfo2;
        return this;
    }

    @JsonProperty("hi02_01_occurrenceSpanInfoQlfr2")
    public String getHi0201OccurrenceSpanInfoQlfr2() {
        return hi0201OccurrenceSpanInfoQlfr2;
    }

    @JsonProperty("hi02_01_occurrenceSpanInfoQlfr2")
    public void setHi0201OccurrenceSpanInfoQlfr2(String hi0201OccurrenceSpanInfoQlfr2) {
        this.hi0201OccurrenceSpanInfoQlfr2 = hi0201OccurrenceSpanInfoQlfr2;
    }

    public HiOccurrenceSpanInfo withHi0201OccurrenceSpanInfoQlfr2(String hi0201OccurrenceSpanInfoQlfr2) {
        this.hi0201OccurrenceSpanInfoQlfr2 = hi0201OccurrenceSpanInfoQlfr2;
        return this;
    }

    @JsonProperty("hi02_02_occurrenceSpanInfoCode2")
    public String getHi0202OccurrenceSpanInfoCode2() {
        return hi0202OccurrenceSpanInfoCode2;
    }

    @JsonProperty("hi02_02_occurrenceSpanInfoCode2")
    public void setHi0202OccurrenceSpanInfoCode2(String hi0202OccurrenceSpanInfoCode2) {
        this.hi0202OccurrenceSpanInfoCode2 = hi0202OccurrenceSpanInfoCode2;
    }

    public HiOccurrenceSpanInfo withHi0202OccurrenceSpanInfoCode2(String hi0202OccurrenceSpanInfoCode2) {
        this.hi0202OccurrenceSpanInfoCode2 = hi0202OccurrenceSpanInfoCode2;
        return this;
    }

    @JsonProperty("hi02_03_occurrenceSpanInfoDateFormatQlfr2")
    public String getHi0203OccurrenceSpanInfoDateFormatQlfr2() {
        return hi0203OccurrenceSpanInfoDateFormatQlfr2;
    }

    @JsonProperty("hi02_03_occurrenceSpanInfoDateFormatQlfr2")
    public void setHi0203OccurrenceSpanInfoDateFormatQlfr2(String hi0203OccurrenceSpanInfoDateFormatQlfr2) {
        this.hi0203OccurrenceSpanInfoDateFormatQlfr2 = hi0203OccurrenceSpanInfoDateFormatQlfr2;
    }

    public HiOccurrenceSpanInfo withHi0203OccurrenceSpanInfoDateFormatQlfr2(String hi0203OccurrenceSpanInfoDateFormatQlfr2) {
        this.hi0203OccurrenceSpanInfoDateFormatQlfr2 = hi0203OccurrenceSpanInfoDateFormatQlfr2;
        return this;
    }

    @JsonProperty("hi02_04_occurrenceSpanInfoDate2")
    public String getHi0204OccurrenceSpanInfoDate2() {
        return hi0204OccurrenceSpanInfoDate2;
    }

    @JsonProperty("hi02_04_occurrenceSpanInfoDate2")
    public void setHi0204OccurrenceSpanInfoDate2(String hi0204OccurrenceSpanInfoDate2) {
        this.hi0204OccurrenceSpanInfoDate2 = hi0204OccurrenceSpanInfoDate2;
    }

    public HiOccurrenceSpanInfo withHi0204OccurrenceSpanInfoDate2(String hi0204OccurrenceSpanInfoDate2) {
        this.hi0204OccurrenceSpanInfoDate2 = hi0204OccurrenceSpanInfoDate2;
        return this;
    }

    @JsonProperty("hi03_occurrenceSpanInfo3")
    public String getHi03OccurrenceSpanInfo3() {
        return hi03OccurrenceSpanInfo3;
    }

    @JsonProperty("hi03_occurrenceSpanInfo3")
    public void setHi03OccurrenceSpanInfo3(String hi03OccurrenceSpanInfo3) {
        this.hi03OccurrenceSpanInfo3 = hi03OccurrenceSpanInfo3;
    }

    public HiOccurrenceSpanInfo withHi03OccurrenceSpanInfo3(String hi03OccurrenceSpanInfo3) {
        this.hi03OccurrenceSpanInfo3 = hi03OccurrenceSpanInfo3;
        return this;
    }

    @JsonProperty("hi03_01_occurrenceSpanInfoQlfr3")
    public String getHi0301OccurrenceSpanInfoQlfr3() {
        return hi0301OccurrenceSpanInfoQlfr3;
    }

    @JsonProperty("hi03_01_occurrenceSpanInfoQlfr3")
    public void setHi0301OccurrenceSpanInfoQlfr3(String hi0301OccurrenceSpanInfoQlfr3) {
        this.hi0301OccurrenceSpanInfoQlfr3 = hi0301OccurrenceSpanInfoQlfr3;
    }

    public HiOccurrenceSpanInfo withHi0301OccurrenceSpanInfoQlfr3(String hi0301OccurrenceSpanInfoQlfr3) {
        this.hi0301OccurrenceSpanInfoQlfr3 = hi0301OccurrenceSpanInfoQlfr3;
        return this;
    }

    @JsonProperty("hi03_02_occurrenceSpanInfoCode3")
    public String getHi0302OccurrenceSpanInfoCode3() {
        return hi0302OccurrenceSpanInfoCode3;
    }

    @JsonProperty("hi03_02_occurrenceSpanInfoCode3")
    public void setHi0302OccurrenceSpanInfoCode3(String hi0302OccurrenceSpanInfoCode3) {
        this.hi0302OccurrenceSpanInfoCode3 = hi0302OccurrenceSpanInfoCode3;
    }

    public HiOccurrenceSpanInfo withHi0302OccurrenceSpanInfoCode3(String hi0302OccurrenceSpanInfoCode3) {
        this.hi0302OccurrenceSpanInfoCode3 = hi0302OccurrenceSpanInfoCode3;
        return this;
    }

    @JsonProperty("hi03_03_occurrenceSpanInfoDateFormatQlfr3")
    public String getHi0303OccurrenceSpanInfoDateFormatQlfr3() {
        return hi0303OccurrenceSpanInfoDateFormatQlfr3;
    }

    @JsonProperty("hi03_03_occurrenceSpanInfoDateFormatQlfr3")
    public void setHi0303OccurrenceSpanInfoDateFormatQlfr3(String hi0303OccurrenceSpanInfoDateFormatQlfr3) {
        this.hi0303OccurrenceSpanInfoDateFormatQlfr3 = hi0303OccurrenceSpanInfoDateFormatQlfr3;
    }

    public HiOccurrenceSpanInfo withHi0303OccurrenceSpanInfoDateFormatQlfr3(String hi0303OccurrenceSpanInfoDateFormatQlfr3) {
        this.hi0303OccurrenceSpanInfoDateFormatQlfr3 = hi0303OccurrenceSpanInfoDateFormatQlfr3;
        return this;
    }

    @JsonProperty("hi03_04_occurrenceSpanInfoDate3")
    public String getHi0304OccurrenceSpanInfoDate3() {
        return hi0304OccurrenceSpanInfoDate3;
    }

    @JsonProperty("hi03_04_occurrenceSpanInfoDate3")
    public void setHi0304OccurrenceSpanInfoDate3(String hi0304OccurrenceSpanInfoDate3) {
        this.hi0304OccurrenceSpanInfoDate3 = hi0304OccurrenceSpanInfoDate3;
    }

    public HiOccurrenceSpanInfo withHi0304OccurrenceSpanInfoDate3(String hi0304OccurrenceSpanInfoDate3) {
        this.hi0304OccurrenceSpanInfoDate3 = hi0304OccurrenceSpanInfoDate3;
        return this;
    }

    @JsonProperty("hi04_occurrenceSpanInfo4")
    public String getHi04OccurrenceSpanInfo4() {
        return hi04OccurrenceSpanInfo4;
    }

    @JsonProperty("hi04_occurrenceSpanInfo4")
    public void setHi04OccurrenceSpanInfo4(String hi04OccurrenceSpanInfo4) {
        this.hi04OccurrenceSpanInfo4 = hi04OccurrenceSpanInfo4;
    }

    public HiOccurrenceSpanInfo withHi04OccurrenceSpanInfo4(String hi04OccurrenceSpanInfo4) {
        this.hi04OccurrenceSpanInfo4 = hi04OccurrenceSpanInfo4;
        return this;
    }

    @JsonProperty("hi04_01_occurrenceSpanInfoQlfr4")
    public String getHi0401OccurrenceSpanInfoQlfr4() {
        return hi0401OccurrenceSpanInfoQlfr4;
    }

    @JsonProperty("hi04_01_occurrenceSpanInfoQlfr4")
    public void setHi0401OccurrenceSpanInfoQlfr4(String hi0401OccurrenceSpanInfoQlfr4) {
        this.hi0401OccurrenceSpanInfoQlfr4 = hi0401OccurrenceSpanInfoQlfr4;
    }

    public HiOccurrenceSpanInfo withHi0401OccurrenceSpanInfoQlfr4(String hi0401OccurrenceSpanInfoQlfr4) {
        this.hi0401OccurrenceSpanInfoQlfr4 = hi0401OccurrenceSpanInfoQlfr4;
        return this;
    }

    @JsonProperty("hi04_02_occurrenceSpanInfoCode4")
    public String getHi0402OccurrenceSpanInfoCode4() {
        return hi0402OccurrenceSpanInfoCode4;
    }

    @JsonProperty("hi04_02_occurrenceSpanInfoCode4")
    public void setHi0402OccurrenceSpanInfoCode4(String hi0402OccurrenceSpanInfoCode4) {
        this.hi0402OccurrenceSpanInfoCode4 = hi0402OccurrenceSpanInfoCode4;
    }

    public HiOccurrenceSpanInfo withHi0402OccurrenceSpanInfoCode4(String hi0402OccurrenceSpanInfoCode4) {
        this.hi0402OccurrenceSpanInfoCode4 = hi0402OccurrenceSpanInfoCode4;
        return this;
    }

    @JsonProperty("hi04_03_occurrenceSpanInfoDateFormatQlfr4")
    public String getHi0403OccurrenceSpanInfoDateFormatQlfr4() {
        return hi0403OccurrenceSpanInfoDateFormatQlfr4;
    }

    @JsonProperty("hi04_03_occurrenceSpanInfoDateFormatQlfr4")
    public void setHi0403OccurrenceSpanInfoDateFormatQlfr4(String hi0403OccurrenceSpanInfoDateFormatQlfr4) {
        this.hi0403OccurrenceSpanInfoDateFormatQlfr4 = hi0403OccurrenceSpanInfoDateFormatQlfr4;
    }

    public HiOccurrenceSpanInfo withHi0403OccurrenceSpanInfoDateFormatQlfr4(String hi0403OccurrenceSpanInfoDateFormatQlfr4) {
        this.hi0403OccurrenceSpanInfoDateFormatQlfr4 = hi0403OccurrenceSpanInfoDateFormatQlfr4;
        return this;
    }

    @JsonProperty("hi04_04_occurrenceSpanInfoDate4")
    public String getHi0404OccurrenceSpanInfoDate4() {
        return hi0404OccurrenceSpanInfoDate4;
    }

    @JsonProperty("hi04_04_occurrenceSpanInfoDate4")
    public void setHi0404OccurrenceSpanInfoDate4(String hi0404OccurrenceSpanInfoDate4) {
        this.hi0404OccurrenceSpanInfoDate4 = hi0404OccurrenceSpanInfoDate4;
    }

    public HiOccurrenceSpanInfo withHi0404OccurrenceSpanInfoDate4(String hi0404OccurrenceSpanInfoDate4) {
        this.hi0404OccurrenceSpanInfoDate4 = hi0404OccurrenceSpanInfoDate4;
        return this;
    }

    @JsonProperty("hi05_occurrenceSpanInfo5")
    public String getHi05OccurrenceSpanInfo5() {
        return hi05OccurrenceSpanInfo5;
    }

    @JsonProperty("hi05_occurrenceSpanInfo5")
    public void setHi05OccurrenceSpanInfo5(String hi05OccurrenceSpanInfo5) {
        this.hi05OccurrenceSpanInfo5 = hi05OccurrenceSpanInfo5;
    }

    public HiOccurrenceSpanInfo withHi05OccurrenceSpanInfo5(String hi05OccurrenceSpanInfo5) {
        this.hi05OccurrenceSpanInfo5 = hi05OccurrenceSpanInfo5;
        return this;
    }

    @JsonProperty("hi05_01_occurrenceSpanInfoQlfr5")
    public String getHi0501OccurrenceSpanInfoQlfr5() {
        return hi0501OccurrenceSpanInfoQlfr5;
    }

    @JsonProperty("hi05_01_occurrenceSpanInfoQlfr5")
    public void setHi0501OccurrenceSpanInfoQlfr5(String hi0501OccurrenceSpanInfoQlfr5) {
        this.hi0501OccurrenceSpanInfoQlfr5 = hi0501OccurrenceSpanInfoQlfr5;
    }

    public HiOccurrenceSpanInfo withHi0501OccurrenceSpanInfoQlfr5(String hi0501OccurrenceSpanInfoQlfr5) {
        this.hi0501OccurrenceSpanInfoQlfr5 = hi0501OccurrenceSpanInfoQlfr5;
        return this;
    }

    @JsonProperty("hi05_02_occurrenceSpanInfoCode5")
    public String getHi0502OccurrenceSpanInfoCode5() {
        return hi0502OccurrenceSpanInfoCode5;
    }

    @JsonProperty("hi05_02_occurrenceSpanInfoCode5")
    public void setHi0502OccurrenceSpanInfoCode5(String hi0502OccurrenceSpanInfoCode5) {
        this.hi0502OccurrenceSpanInfoCode5 = hi0502OccurrenceSpanInfoCode5;
    }

    public HiOccurrenceSpanInfo withHi0502OccurrenceSpanInfoCode5(String hi0502OccurrenceSpanInfoCode5) {
        this.hi0502OccurrenceSpanInfoCode5 = hi0502OccurrenceSpanInfoCode5;
        return this;
    }

    @JsonProperty("hi05_03_occurrenceSpanInfoDateFormatQlfr5")
    public String getHi0503OccurrenceSpanInfoDateFormatQlfr5() {
        return hi0503OccurrenceSpanInfoDateFormatQlfr5;
    }

    @JsonProperty("hi05_03_occurrenceSpanInfoDateFormatQlfr5")
    public void setHi0503OccurrenceSpanInfoDateFormatQlfr5(String hi0503OccurrenceSpanInfoDateFormatQlfr5) {
        this.hi0503OccurrenceSpanInfoDateFormatQlfr5 = hi0503OccurrenceSpanInfoDateFormatQlfr5;
    }

    public HiOccurrenceSpanInfo withHi0503OccurrenceSpanInfoDateFormatQlfr5(String hi0503OccurrenceSpanInfoDateFormatQlfr5) {
        this.hi0503OccurrenceSpanInfoDateFormatQlfr5 = hi0503OccurrenceSpanInfoDateFormatQlfr5;
        return this;
    }

    @JsonProperty("hi05_04_occurrenceSpanInfoDate5")
    public String getHi0504OccurrenceSpanInfoDate5() {
        return hi0504OccurrenceSpanInfoDate5;
    }

    @JsonProperty("hi05_04_occurrenceSpanInfoDate5")
    public void setHi0504OccurrenceSpanInfoDate5(String hi0504OccurrenceSpanInfoDate5) {
        this.hi0504OccurrenceSpanInfoDate5 = hi0504OccurrenceSpanInfoDate5;
    }

    public HiOccurrenceSpanInfo withHi0504OccurrenceSpanInfoDate5(String hi0504OccurrenceSpanInfoDate5) {
        this.hi0504OccurrenceSpanInfoDate5 = hi0504OccurrenceSpanInfoDate5;
        return this;
    }

    @JsonProperty("hi06_occurrenceSpanInfo6")
    public String getHi06OccurrenceSpanInfo6() {
        return hi06OccurrenceSpanInfo6;
    }

    @JsonProperty("hi06_occurrenceSpanInfo6")
    public void setHi06OccurrenceSpanInfo6(String hi06OccurrenceSpanInfo6) {
        this.hi06OccurrenceSpanInfo6 = hi06OccurrenceSpanInfo6;
    }

    public HiOccurrenceSpanInfo withHi06OccurrenceSpanInfo6(String hi06OccurrenceSpanInfo6) {
        this.hi06OccurrenceSpanInfo6 = hi06OccurrenceSpanInfo6;
        return this;
    }

    @JsonProperty("hi06_01_occurrenceSpanInfoQlfr6")
    public String getHi0601OccurrenceSpanInfoQlfr6() {
        return hi0601OccurrenceSpanInfoQlfr6;
    }

    @JsonProperty("hi06_01_occurrenceSpanInfoQlfr6")
    public void setHi0601OccurrenceSpanInfoQlfr6(String hi0601OccurrenceSpanInfoQlfr6) {
        this.hi0601OccurrenceSpanInfoQlfr6 = hi0601OccurrenceSpanInfoQlfr6;
    }

    public HiOccurrenceSpanInfo withHi0601OccurrenceSpanInfoQlfr6(String hi0601OccurrenceSpanInfoQlfr6) {
        this.hi0601OccurrenceSpanInfoQlfr6 = hi0601OccurrenceSpanInfoQlfr6;
        return this;
    }

    @JsonProperty("hi06_02_occurrenceSpanInfoCode6")
    public String getHi0602OccurrenceSpanInfoCode6() {
        return hi0602OccurrenceSpanInfoCode6;
    }

    @JsonProperty("hi06_02_occurrenceSpanInfoCode6")
    public void setHi0602OccurrenceSpanInfoCode6(String hi0602OccurrenceSpanInfoCode6) {
        this.hi0602OccurrenceSpanInfoCode6 = hi0602OccurrenceSpanInfoCode6;
    }

    public HiOccurrenceSpanInfo withHi0602OccurrenceSpanInfoCode6(String hi0602OccurrenceSpanInfoCode6) {
        this.hi0602OccurrenceSpanInfoCode6 = hi0602OccurrenceSpanInfoCode6;
        return this;
    }

    @JsonProperty("hi06_03_occurrenceSpanInfoDateFormatQlfr6")
    public String getHi0603OccurrenceSpanInfoDateFormatQlfr6() {
        return hi0603OccurrenceSpanInfoDateFormatQlfr6;
    }

    @JsonProperty("hi06_03_occurrenceSpanInfoDateFormatQlfr6")
    public void setHi0603OccurrenceSpanInfoDateFormatQlfr6(String hi0603OccurrenceSpanInfoDateFormatQlfr6) {
        this.hi0603OccurrenceSpanInfoDateFormatQlfr6 = hi0603OccurrenceSpanInfoDateFormatQlfr6;
    }

    public HiOccurrenceSpanInfo withHi0603OccurrenceSpanInfoDateFormatQlfr6(String hi0603OccurrenceSpanInfoDateFormatQlfr6) {
        this.hi0603OccurrenceSpanInfoDateFormatQlfr6 = hi0603OccurrenceSpanInfoDateFormatQlfr6;
        return this;
    }

    @JsonProperty("hi06_04_occurrenceSpanInfoDate6")
    public String getHi0604OccurrenceSpanInfoDate6() {
        return hi0604OccurrenceSpanInfoDate6;
    }

    @JsonProperty("hi06_04_occurrenceSpanInfoDate6")
    public void setHi0604OccurrenceSpanInfoDate6(String hi0604OccurrenceSpanInfoDate6) {
        this.hi0604OccurrenceSpanInfoDate6 = hi0604OccurrenceSpanInfoDate6;
    }

    public HiOccurrenceSpanInfo withHi0604OccurrenceSpanInfoDate6(String hi0604OccurrenceSpanInfoDate6) {
        this.hi0604OccurrenceSpanInfoDate6 = hi0604OccurrenceSpanInfoDate6;
        return this;
    }

    @JsonProperty("hi07_occurrenceSpanInfo7")
    public String getHi07OccurrenceSpanInfo7() {
        return hi07OccurrenceSpanInfo7;
    }

    @JsonProperty("hi07_occurrenceSpanInfo7")
    public void setHi07OccurrenceSpanInfo7(String hi07OccurrenceSpanInfo7) {
        this.hi07OccurrenceSpanInfo7 = hi07OccurrenceSpanInfo7;
    }

    public HiOccurrenceSpanInfo withHi07OccurrenceSpanInfo7(String hi07OccurrenceSpanInfo7) {
        this.hi07OccurrenceSpanInfo7 = hi07OccurrenceSpanInfo7;
        return this;
    }

    @JsonProperty("hi07_01_occurrenceSpanInfoQlfr7")
    public String getHi0701OccurrenceSpanInfoQlfr7() {
        return hi0701OccurrenceSpanInfoQlfr7;
    }

    @JsonProperty("hi07_01_occurrenceSpanInfoQlfr7")
    public void setHi0701OccurrenceSpanInfoQlfr7(String hi0701OccurrenceSpanInfoQlfr7) {
        this.hi0701OccurrenceSpanInfoQlfr7 = hi0701OccurrenceSpanInfoQlfr7;
    }

    public HiOccurrenceSpanInfo withHi0701OccurrenceSpanInfoQlfr7(String hi0701OccurrenceSpanInfoQlfr7) {
        this.hi0701OccurrenceSpanInfoQlfr7 = hi0701OccurrenceSpanInfoQlfr7;
        return this;
    }

    @JsonProperty("hi07_02_occurrenceSpanInfoCode7")
    public String getHi0702OccurrenceSpanInfoCode7() {
        return hi0702OccurrenceSpanInfoCode7;
    }

    @JsonProperty("hi07_02_occurrenceSpanInfoCode7")
    public void setHi0702OccurrenceSpanInfoCode7(String hi0702OccurrenceSpanInfoCode7) {
        this.hi0702OccurrenceSpanInfoCode7 = hi0702OccurrenceSpanInfoCode7;
    }

    public HiOccurrenceSpanInfo withHi0702OccurrenceSpanInfoCode7(String hi0702OccurrenceSpanInfoCode7) {
        this.hi0702OccurrenceSpanInfoCode7 = hi0702OccurrenceSpanInfoCode7;
        return this;
    }

    @JsonProperty("hi07_03_occurrenceSpanInfoDateFormatQlfr7")
    public String getHi0703OccurrenceSpanInfoDateFormatQlfr7() {
        return hi0703OccurrenceSpanInfoDateFormatQlfr7;
    }

    @JsonProperty("hi07_03_occurrenceSpanInfoDateFormatQlfr7")
    public void setHi0703OccurrenceSpanInfoDateFormatQlfr7(String hi0703OccurrenceSpanInfoDateFormatQlfr7) {
        this.hi0703OccurrenceSpanInfoDateFormatQlfr7 = hi0703OccurrenceSpanInfoDateFormatQlfr7;
    }

    public HiOccurrenceSpanInfo withHi0703OccurrenceSpanInfoDateFormatQlfr7(String hi0703OccurrenceSpanInfoDateFormatQlfr7) {
        this.hi0703OccurrenceSpanInfoDateFormatQlfr7 = hi0703OccurrenceSpanInfoDateFormatQlfr7;
        return this;
    }

    @JsonProperty("hi07_04_occurrenceSpanInfoDate7")
    public String getHi0704OccurrenceSpanInfoDate7() {
        return hi0704OccurrenceSpanInfoDate7;
    }

    @JsonProperty("hi07_04_occurrenceSpanInfoDate7")
    public void setHi0704OccurrenceSpanInfoDate7(String hi0704OccurrenceSpanInfoDate7) {
        this.hi0704OccurrenceSpanInfoDate7 = hi0704OccurrenceSpanInfoDate7;
    }

    public HiOccurrenceSpanInfo withHi0704OccurrenceSpanInfoDate7(String hi0704OccurrenceSpanInfoDate7) {
        this.hi0704OccurrenceSpanInfoDate7 = hi0704OccurrenceSpanInfoDate7;
        return this;
    }

    @JsonProperty("hi08_occurrenceSpanInfo8")
    public String getHi08OccurrenceSpanInfo8() {
        return hi08OccurrenceSpanInfo8;
    }

    @JsonProperty("hi08_occurrenceSpanInfo8")
    public void setHi08OccurrenceSpanInfo8(String hi08OccurrenceSpanInfo8) {
        this.hi08OccurrenceSpanInfo8 = hi08OccurrenceSpanInfo8;
    }

    public HiOccurrenceSpanInfo withHi08OccurrenceSpanInfo8(String hi08OccurrenceSpanInfo8) {
        this.hi08OccurrenceSpanInfo8 = hi08OccurrenceSpanInfo8;
        return this;
    }

    @JsonProperty("hi08_01_occurrenceSpanInfoQlfr8")
    public String getHi0801OccurrenceSpanInfoQlfr8() {
        return hi0801OccurrenceSpanInfoQlfr8;
    }

    @JsonProperty("hi08_01_occurrenceSpanInfoQlfr8")
    public void setHi0801OccurrenceSpanInfoQlfr8(String hi0801OccurrenceSpanInfoQlfr8) {
        this.hi0801OccurrenceSpanInfoQlfr8 = hi0801OccurrenceSpanInfoQlfr8;
    }

    public HiOccurrenceSpanInfo withHi0801OccurrenceSpanInfoQlfr8(String hi0801OccurrenceSpanInfoQlfr8) {
        this.hi0801OccurrenceSpanInfoQlfr8 = hi0801OccurrenceSpanInfoQlfr8;
        return this;
    }

    @JsonProperty("hi08_02_occurrenceSpanInfoCode8")
    public String getHi0802OccurrenceSpanInfoCode8() {
        return hi0802OccurrenceSpanInfoCode8;
    }

    @JsonProperty("hi08_02_occurrenceSpanInfoCode8")
    public void setHi0802OccurrenceSpanInfoCode8(String hi0802OccurrenceSpanInfoCode8) {
        this.hi0802OccurrenceSpanInfoCode8 = hi0802OccurrenceSpanInfoCode8;
    }

    public HiOccurrenceSpanInfo withHi0802OccurrenceSpanInfoCode8(String hi0802OccurrenceSpanInfoCode8) {
        this.hi0802OccurrenceSpanInfoCode8 = hi0802OccurrenceSpanInfoCode8;
        return this;
    }

    @JsonProperty("hi08_03_occurrenceSpanInfoDateFormatQlfr8")
    public String getHi0803OccurrenceSpanInfoDateFormatQlfr8() {
        return hi0803OccurrenceSpanInfoDateFormatQlfr8;
    }

    @JsonProperty("hi08_03_occurrenceSpanInfoDateFormatQlfr8")
    public void setHi0803OccurrenceSpanInfoDateFormatQlfr8(String hi0803OccurrenceSpanInfoDateFormatQlfr8) {
        this.hi0803OccurrenceSpanInfoDateFormatQlfr8 = hi0803OccurrenceSpanInfoDateFormatQlfr8;
    }

    public HiOccurrenceSpanInfo withHi0803OccurrenceSpanInfoDateFormatQlfr8(String hi0803OccurrenceSpanInfoDateFormatQlfr8) {
        this.hi0803OccurrenceSpanInfoDateFormatQlfr8 = hi0803OccurrenceSpanInfoDateFormatQlfr8;
        return this;
    }

    @JsonProperty("hi08_04_occurrenceSpanInfoDate8")
    public String getHi0804OccurrenceSpanInfoDate8() {
        return hi0804OccurrenceSpanInfoDate8;
    }

    @JsonProperty("hi08_04_occurrenceSpanInfoDate8")
    public void setHi0804OccurrenceSpanInfoDate8(String hi0804OccurrenceSpanInfoDate8) {
        this.hi0804OccurrenceSpanInfoDate8 = hi0804OccurrenceSpanInfoDate8;
    }

    public HiOccurrenceSpanInfo withHi0804OccurrenceSpanInfoDate8(String hi0804OccurrenceSpanInfoDate8) {
        this.hi0804OccurrenceSpanInfoDate8 = hi0804OccurrenceSpanInfoDate8;
        return this;
    }

    @JsonProperty("hi09_occurrenceSpanInfo9")
    public String getHi09OccurrenceSpanInfo9() {
        return hi09OccurrenceSpanInfo9;
    }

    @JsonProperty("hi09_occurrenceSpanInfo9")
    public void setHi09OccurrenceSpanInfo9(String hi09OccurrenceSpanInfo9) {
        this.hi09OccurrenceSpanInfo9 = hi09OccurrenceSpanInfo9;
    }

    public HiOccurrenceSpanInfo withHi09OccurrenceSpanInfo9(String hi09OccurrenceSpanInfo9) {
        this.hi09OccurrenceSpanInfo9 = hi09OccurrenceSpanInfo9;
        return this;
    }

    @JsonProperty("hi09_01_occurrenceSpanInfoQlfr9")
    public String getHi0901OccurrenceSpanInfoQlfr9() {
        return hi0901OccurrenceSpanInfoQlfr9;
    }

    @JsonProperty("hi09_01_occurrenceSpanInfoQlfr9")
    public void setHi0901OccurrenceSpanInfoQlfr9(String hi0901OccurrenceSpanInfoQlfr9) {
        this.hi0901OccurrenceSpanInfoQlfr9 = hi0901OccurrenceSpanInfoQlfr9;
    }

    public HiOccurrenceSpanInfo withHi0901OccurrenceSpanInfoQlfr9(String hi0901OccurrenceSpanInfoQlfr9) {
        this.hi0901OccurrenceSpanInfoQlfr9 = hi0901OccurrenceSpanInfoQlfr9;
        return this;
    }

    @JsonProperty("hi09_02_occurrenceSpanInfoCode9")
    public String getHi0902OccurrenceSpanInfoCode9() {
        return hi0902OccurrenceSpanInfoCode9;
    }

    @JsonProperty("hi09_02_occurrenceSpanInfoCode9")
    public void setHi0902OccurrenceSpanInfoCode9(String hi0902OccurrenceSpanInfoCode9) {
        this.hi0902OccurrenceSpanInfoCode9 = hi0902OccurrenceSpanInfoCode9;
    }

    public HiOccurrenceSpanInfo withHi0902OccurrenceSpanInfoCode9(String hi0902OccurrenceSpanInfoCode9) {
        this.hi0902OccurrenceSpanInfoCode9 = hi0902OccurrenceSpanInfoCode9;
        return this;
    }

    @JsonProperty("hi09_03_occurrenceSpanInfoDateFormatQlfr9")
    public String getHi0903OccurrenceSpanInfoDateFormatQlfr9() {
        return hi0903OccurrenceSpanInfoDateFormatQlfr9;
    }

    @JsonProperty("hi09_03_occurrenceSpanInfoDateFormatQlfr9")
    public void setHi0903OccurrenceSpanInfoDateFormatQlfr9(String hi0903OccurrenceSpanInfoDateFormatQlfr9) {
        this.hi0903OccurrenceSpanInfoDateFormatQlfr9 = hi0903OccurrenceSpanInfoDateFormatQlfr9;
    }

    public HiOccurrenceSpanInfo withHi0903OccurrenceSpanInfoDateFormatQlfr9(String hi0903OccurrenceSpanInfoDateFormatQlfr9) {
        this.hi0903OccurrenceSpanInfoDateFormatQlfr9 = hi0903OccurrenceSpanInfoDateFormatQlfr9;
        return this;
    }

    @JsonProperty("hi09_04_occurrenceSpanInfoDate9")
    public String getHi0904OccurrenceSpanInfoDate9() {
        return hi0904OccurrenceSpanInfoDate9;
    }

    @JsonProperty("hi09_04_occurrenceSpanInfoDate9")
    public void setHi0904OccurrenceSpanInfoDate9(String hi0904OccurrenceSpanInfoDate9) {
        this.hi0904OccurrenceSpanInfoDate9 = hi0904OccurrenceSpanInfoDate9;
    }

    public HiOccurrenceSpanInfo withHi0904OccurrenceSpanInfoDate9(String hi0904OccurrenceSpanInfoDate9) {
        this.hi0904OccurrenceSpanInfoDate9 = hi0904OccurrenceSpanInfoDate9;
        return this;
    }

    @JsonProperty("hi10_occurrenceSpanInfo10")
    public String getHi10OccurrenceSpanInfo10() {
        return hi10OccurrenceSpanInfo10;
    }

    @JsonProperty("hi10_occurrenceSpanInfo10")
    public void setHi10OccurrenceSpanInfo10(String hi10OccurrenceSpanInfo10) {
        this.hi10OccurrenceSpanInfo10 = hi10OccurrenceSpanInfo10;
    }

    public HiOccurrenceSpanInfo withHi10OccurrenceSpanInfo10(String hi10OccurrenceSpanInfo10) {
        this.hi10OccurrenceSpanInfo10 = hi10OccurrenceSpanInfo10;
        return this;
    }

    @JsonProperty("hi10_01_occurrenceSpanInfoQlfr10")
    public String getHi1001OccurrenceSpanInfoQlfr10() {
        return hi1001OccurrenceSpanInfoQlfr10;
    }

    @JsonProperty("hi10_01_occurrenceSpanInfoQlfr10")
    public void setHi1001OccurrenceSpanInfoQlfr10(String hi1001OccurrenceSpanInfoQlfr10) {
        this.hi1001OccurrenceSpanInfoQlfr10 = hi1001OccurrenceSpanInfoQlfr10;
    }

    public HiOccurrenceSpanInfo withHi1001OccurrenceSpanInfoQlfr10(String hi1001OccurrenceSpanInfoQlfr10) {
        this.hi1001OccurrenceSpanInfoQlfr10 = hi1001OccurrenceSpanInfoQlfr10;
        return this;
    }

    @JsonProperty("hi10_02_occurrenceSpanInfoCode10")
    public String getHi1002OccurrenceSpanInfoCode10() {
        return hi1002OccurrenceSpanInfoCode10;
    }

    @JsonProperty("hi10_02_occurrenceSpanInfoCode10")
    public void setHi1002OccurrenceSpanInfoCode10(String hi1002OccurrenceSpanInfoCode10) {
        this.hi1002OccurrenceSpanInfoCode10 = hi1002OccurrenceSpanInfoCode10;
    }

    public HiOccurrenceSpanInfo withHi1002OccurrenceSpanInfoCode10(String hi1002OccurrenceSpanInfoCode10) {
        this.hi1002OccurrenceSpanInfoCode10 = hi1002OccurrenceSpanInfoCode10;
        return this;
    }

    @JsonProperty("hi10_03_occurrenceSpanInfoDateFormatQlfr10")
    public String getHi1003OccurrenceSpanInfoDateFormatQlfr10() {
        return hi1003OccurrenceSpanInfoDateFormatQlfr10;
    }

    @JsonProperty("hi10_03_occurrenceSpanInfoDateFormatQlfr10")
    public void setHi1003OccurrenceSpanInfoDateFormatQlfr10(String hi1003OccurrenceSpanInfoDateFormatQlfr10) {
        this.hi1003OccurrenceSpanInfoDateFormatQlfr10 = hi1003OccurrenceSpanInfoDateFormatQlfr10;
    }

    public HiOccurrenceSpanInfo withHi1003OccurrenceSpanInfoDateFormatQlfr10(String hi1003OccurrenceSpanInfoDateFormatQlfr10) {
        this.hi1003OccurrenceSpanInfoDateFormatQlfr10 = hi1003OccurrenceSpanInfoDateFormatQlfr10;
        return this;
    }

    @JsonProperty("hi10_04_occurrenceSpanInfoDate10")
    public String getHi1004OccurrenceSpanInfoDate10() {
        return hi1004OccurrenceSpanInfoDate10;
    }

    @JsonProperty("hi10_04_occurrenceSpanInfoDate10")
    public void setHi1004OccurrenceSpanInfoDate10(String hi1004OccurrenceSpanInfoDate10) {
        this.hi1004OccurrenceSpanInfoDate10 = hi1004OccurrenceSpanInfoDate10;
    }

    public HiOccurrenceSpanInfo withHi1004OccurrenceSpanInfoDate10(String hi1004OccurrenceSpanInfoDate10) {
        this.hi1004OccurrenceSpanInfoDate10 = hi1004OccurrenceSpanInfoDate10;
        return this;
    }

    @JsonProperty("hi11_occurrenceSpanInfo11")
    public String getHi11OccurrenceSpanInfo11() {
        return hi11OccurrenceSpanInfo11;
    }

    @JsonProperty("hi11_occurrenceSpanInfo11")
    public void setHi11OccurrenceSpanInfo11(String hi11OccurrenceSpanInfo11) {
        this.hi11OccurrenceSpanInfo11 = hi11OccurrenceSpanInfo11;
    }

    public HiOccurrenceSpanInfo withHi11OccurrenceSpanInfo11(String hi11OccurrenceSpanInfo11) {
        this.hi11OccurrenceSpanInfo11 = hi11OccurrenceSpanInfo11;
        return this;
    }

    @JsonProperty("hi11_01_occurrenceSpanInfoQlfr11")
    public String getHi1101OccurrenceSpanInfoQlfr11() {
        return hi1101OccurrenceSpanInfoQlfr11;
    }

    @JsonProperty("hi11_01_occurrenceSpanInfoQlfr11")
    public void setHi1101OccurrenceSpanInfoQlfr11(String hi1101OccurrenceSpanInfoQlfr11) {
        this.hi1101OccurrenceSpanInfoQlfr11 = hi1101OccurrenceSpanInfoQlfr11;
    }

    public HiOccurrenceSpanInfo withHi1101OccurrenceSpanInfoQlfr11(String hi1101OccurrenceSpanInfoQlfr11) {
        this.hi1101OccurrenceSpanInfoQlfr11 = hi1101OccurrenceSpanInfoQlfr11;
        return this;
    }

    @JsonProperty("hi11_02_occurrenceSpanInfoCode11")
    public String getHi1102OccurrenceSpanInfoCode11() {
        return hi1102OccurrenceSpanInfoCode11;
    }

    @JsonProperty("hi11_02_occurrenceSpanInfoCode11")
    public void setHi1102OccurrenceSpanInfoCode11(String hi1102OccurrenceSpanInfoCode11) {
        this.hi1102OccurrenceSpanInfoCode11 = hi1102OccurrenceSpanInfoCode11;
    }

    public HiOccurrenceSpanInfo withHi1102OccurrenceSpanInfoCode11(String hi1102OccurrenceSpanInfoCode11) {
        this.hi1102OccurrenceSpanInfoCode11 = hi1102OccurrenceSpanInfoCode11;
        return this;
    }

    @JsonProperty("hi11_03_occurrenceSpanInfoDateFormatQlfr11")
    public String getHi1103OccurrenceSpanInfoDateFormatQlfr11() {
        return hi1103OccurrenceSpanInfoDateFormatQlfr11;
    }

    @JsonProperty("hi11_03_occurrenceSpanInfoDateFormatQlfr11")
    public void setHi1103OccurrenceSpanInfoDateFormatQlfr11(String hi1103OccurrenceSpanInfoDateFormatQlfr11) {
        this.hi1103OccurrenceSpanInfoDateFormatQlfr11 = hi1103OccurrenceSpanInfoDateFormatQlfr11;
    }

    public HiOccurrenceSpanInfo withHi1103OccurrenceSpanInfoDateFormatQlfr11(String hi1103OccurrenceSpanInfoDateFormatQlfr11) {
        this.hi1103OccurrenceSpanInfoDateFormatQlfr11 = hi1103OccurrenceSpanInfoDateFormatQlfr11;
        return this;
    }

    @JsonProperty("hi11_04_occurrenceSpanInfoDate11")
    public String getHi1104OccurrenceSpanInfoDate11() {
        return hi1104OccurrenceSpanInfoDate11;
    }

    @JsonProperty("hi11_04_occurrenceSpanInfoDate11")
    public void setHi1104OccurrenceSpanInfoDate11(String hi1104OccurrenceSpanInfoDate11) {
        this.hi1104OccurrenceSpanInfoDate11 = hi1104OccurrenceSpanInfoDate11;
    }

    public HiOccurrenceSpanInfo withHi1104OccurrenceSpanInfoDate11(String hi1104OccurrenceSpanInfoDate11) {
        this.hi1104OccurrenceSpanInfoDate11 = hi1104OccurrenceSpanInfoDate11;
        return this;
    }

    @JsonProperty("hi12_occurrenceSpanInfo12")
    public String getHi12OccurrenceSpanInfo12() {
        return hi12OccurrenceSpanInfo12;
    }

    @JsonProperty("hi12_occurrenceSpanInfo12")
    public void setHi12OccurrenceSpanInfo12(String hi12OccurrenceSpanInfo12) {
        this.hi12OccurrenceSpanInfo12 = hi12OccurrenceSpanInfo12;
    }

    public HiOccurrenceSpanInfo withHi12OccurrenceSpanInfo12(String hi12OccurrenceSpanInfo12) {
        this.hi12OccurrenceSpanInfo12 = hi12OccurrenceSpanInfo12;
        return this;
    }

    @JsonProperty("hi12_01_occurrenceSpanInfoQlfr12")
    public String getHi1201OccurrenceSpanInfoQlfr12() {
        return hi1201OccurrenceSpanInfoQlfr12;
    }

    @JsonProperty("hi12_01_occurrenceSpanInfoQlfr12")
    public void setHi1201OccurrenceSpanInfoQlfr12(String hi1201OccurrenceSpanInfoQlfr12) {
        this.hi1201OccurrenceSpanInfoQlfr12 = hi1201OccurrenceSpanInfoQlfr12;
    }

    public HiOccurrenceSpanInfo withHi1201OccurrenceSpanInfoQlfr12(String hi1201OccurrenceSpanInfoQlfr12) {
        this.hi1201OccurrenceSpanInfoQlfr12 = hi1201OccurrenceSpanInfoQlfr12;
        return this;
    }

    @JsonProperty("hi12_02_occurrenceSpanInfoCode12")
    public String getHi1202OccurrenceSpanInfoCode12() {
        return hi1202OccurrenceSpanInfoCode12;
    }

    @JsonProperty("hi12_02_occurrenceSpanInfoCode12")
    public void setHi1202OccurrenceSpanInfoCode12(String hi1202OccurrenceSpanInfoCode12) {
        this.hi1202OccurrenceSpanInfoCode12 = hi1202OccurrenceSpanInfoCode12;
    }

    public HiOccurrenceSpanInfo withHi1202OccurrenceSpanInfoCode12(String hi1202OccurrenceSpanInfoCode12) {
        this.hi1202OccurrenceSpanInfoCode12 = hi1202OccurrenceSpanInfoCode12;
        return this;
    }

    @JsonProperty("hi12_03_occurrenceSpanInfoDateFormatQlfr12")
    public String getHi1203OccurrenceSpanInfoDateFormatQlfr12() {
        return hi1203OccurrenceSpanInfoDateFormatQlfr12;
    }

    @JsonProperty("hi12_03_occurrenceSpanInfoDateFormatQlfr12")
    public void setHi1203OccurrenceSpanInfoDateFormatQlfr12(String hi1203OccurrenceSpanInfoDateFormatQlfr12) {
        this.hi1203OccurrenceSpanInfoDateFormatQlfr12 = hi1203OccurrenceSpanInfoDateFormatQlfr12;
    }

    public HiOccurrenceSpanInfo withHi1203OccurrenceSpanInfoDateFormatQlfr12(String hi1203OccurrenceSpanInfoDateFormatQlfr12) {
        this.hi1203OccurrenceSpanInfoDateFormatQlfr12 = hi1203OccurrenceSpanInfoDateFormatQlfr12;
        return this;
    }

    @JsonProperty("hi12_04_occurrenceSpanInfoDate12")
    public String getHi1204OccurrenceSpanInfoDate12() {
        return hi1204OccurrenceSpanInfoDate12;
    }

    @JsonProperty("hi12_04_occurrenceSpanInfoDate12")
    public void setHi1204OccurrenceSpanInfoDate12(String hi1204OccurrenceSpanInfoDate12) {
        this.hi1204OccurrenceSpanInfoDate12 = hi1204OccurrenceSpanInfoDate12;
    }

    public HiOccurrenceSpanInfo withHi1204OccurrenceSpanInfoDate12(String hi1204OccurrenceSpanInfoDate12) {
        this.hi1204OccurrenceSpanInfoDate12 = hi1204OccurrenceSpanInfoDate12;
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

    public HiOccurrenceSpanInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hi01OccurrenceSpanInfo1).append(hi0101OccurrenceSpanInfoQlfr1).append(hi0102OccurrenceSpanInfoCode1).append(hi0103OccurrenceSpanInfoDateFormatQlfr1).append(hi0104OccurrenceSpanInfoDate1).append(hi02OccurrenceSpanInfo2).append(hi0201OccurrenceSpanInfoQlfr2).append(hi0202OccurrenceSpanInfoCode2).append(hi0203OccurrenceSpanInfoDateFormatQlfr2).append(hi0204OccurrenceSpanInfoDate2).append(hi03OccurrenceSpanInfo3).append(hi0301OccurrenceSpanInfoQlfr3).append(hi0302OccurrenceSpanInfoCode3).append(hi0303OccurrenceSpanInfoDateFormatQlfr3).append(hi0304OccurrenceSpanInfoDate3).append(hi04OccurrenceSpanInfo4).append(hi0401OccurrenceSpanInfoQlfr4).append(hi0402OccurrenceSpanInfoCode4).append(hi0403OccurrenceSpanInfoDateFormatQlfr4).append(hi0404OccurrenceSpanInfoDate4).append(hi05OccurrenceSpanInfo5).append(hi0501OccurrenceSpanInfoQlfr5).append(hi0502OccurrenceSpanInfoCode5).append(hi0503OccurrenceSpanInfoDateFormatQlfr5).append(hi0504OccurrenceSpanInfoDate5).append(hi06OccurrenceSpanInfo6).append(hi0601OccurrenceSpanInfoQlfr6).append(hi0602OccurrenceSpanInfoCode6).append(hi0603OccurrenceSpanInfoDateFormatQlfr6).append(hi0604OccurrenceSpanInfoDate6).append(hi07OccurrenceSpanInfo7).append(hi0701OccurrenceSpanInfoQlfr7).append(hi0702OccurrenceSpanInfoCode7).append(hi0703OccurrenceSpanInfoDateFormatQlfr7).append(hi0704OccurrenceSpanInfoDate7).append(hi08OccurrenceSpanInfo8).append(hi0801OccurrenceSpanInfoQlfr8).append(hi0802OccurrenceSpanInfoCode8).append(hi0803OccurrenceSpanInfoDateFormatQlfr8).append(hi0804OccurrenceSpanInfoDate8).append(hi09OccurrenceSpanInfo9).append(hi0901OccurrenceSpanInfoQlfr9).append(hi0902OccurrenceSpanInfoCode9).append(hi0903OccurrenceSpanInfoDateFormatQlfr9).append(hi0904OccurrenceSpanInfoDate9).append(hi10OccurrenceSpanInfo10).append(hi1001OccurrenceSpanInfoQlfr10).append(hi1002OccurrenceSpanInfoCode10).append(hi1003OccurrenceSpanInfoDateFormatQlfr10).append(hi1004OccurrenceSpanInfoDate10).append(hi11OccurrenceSpanInfo11).append(hi1101OccurrenceSpanInfoQlfr11).append(hi1102OccurrenceSpanInfoCode11).append(hi1103OccurrenceSpanInfoDateFormatQlfr11).append(hi1104OccurrenceSpanInfoDate11).append(hi12OccurrenceSpanInfo12).append(hi1201OccurrenceSpanInfoQlfr12).append(hi1202OccurrenceSpanInfoCode12).append(hi1203OccurrenceSpanInfoDateFormatQlfr12).append(hi1204OccurrenceSpanInfoDate12).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiOccurrenceSpanInfo) == false) {
            return false;
        }
        HiOccurrenceSpanInfo rhs = ((HiOccurrenceSpanInfo) other);
        return new EqualsBuilder().append(hi01OccurrenceSpanInfo1, rhs.hi01OccurrenceSpanInfo1).append(hi0101OccurrenceSpanInfoQlfr1, rhs.hi0101OccurrenceSpanInfoQlfr1).append(hi0102OccurrenceSpanInfoCode1, rhs.hi0102OccurrenceSpanInfoCode1).append(hi0103OccurrenceSpanInfoDateFormatQlfr1, rhs.hi0103OccurrenceSpanInfoDateFormatQlfr1).append(hi0104OccurrenceSpanInfoDate1, rhs.hi0104OccurrenceSpanInfoDate1).append(hi02OccurrenceSpanInfo2, rhs.hi02OccurrenceSpanInfo2).append(hi0201OccurrenceSpanInfoQlfr2, rhs.hi0201OccurrenceSpanInfoQlfr2).append(hi0202OccurrenceSpanInfoCode2, rhs.hi0202OccurrenceSpanInfoCode2).append(hi0203OccurrenceSpanInfoDateFormatQlfr2, rhs.hi0203OccurrenceSpanInfoDateFormatQlfr2).append(hi0204OccurrenceSpanInfoDate2, rhs.hi0204OccurrenceSpanInfoDate2).append(hi03OccurrenceSpanInfo3, rhs.hi03OccurrenceSpanInfo3).append(hi0301OccurrenceSpanInfoQlfr3, rhs.hi0301OccurrenceSpanInfoQlfr3).append(hi0302OccurrenceSpanInfoCode3, rhs.hi0302OccurrenceSpanInfoCode3).append(hi0303OccurrenceSpanInfoDateFormatQlfr3, rhs.hi0303OccurrenceSpanInfoDateFormatQlfr3).append(hi0304OccurrenceSpanInfoDate3, rhs.hi0304OccurrenceSpanInfoDate3).append(hi04OccurrenceSpanInfo4, rhs.hi04OccurrenceSpanInfo4).append(hi0401OccurrenceSpanInfoQlfr4, rhs.hi0401OccurrenceSpanInfoQlfr4).append(hi0402OccurrenceSpanInfoCode4, rhs.hi0402OccurrenceSpanInfoCode4).append(hi0403OccurrenceSpanInfoDateFormatQlfr4, rhs.hi0403OccurrenceSpanInfoDateFormatQlfr4).append(hi0404OccurrenceSpanInfoDate4, rhs.hi0404OccurrenceSpanInfoDate4).append(hi05OccurrenceSpanInfo5, rhs.hi05OccurrenceSpanInfo5).append(hi0501OccurrenceSpanInfoQlfr5, rhs.hi0501OccurrenceSpanInfoQlfr5).append(hi0502OccurrenceSpanInfoCode5, rhs.hi0502OccurrenceSpanInfoCode5).append(hi0503OccurrenceSpanInfoDateFormatQlfr5, rhs.hi0503OccurrenceSpanInfoDateFormatQlfr5).append(hi0504OccurrenceSpanInfoDate5, rhs.hi0504OccurrenceSpanInfoDate5).append(hi06OccurrenceSpanInfo6, rhs.hi06OccurrenceSpanInfo6).append(hi0601OccurrenceSpanInfoQlfr6, rhs.hi0601OccurrenceSpanInfoQlfr6).append(hi0602OccurrenceSpanInfoCode6, rhs.hi0602OccurrenceSpanInfoCode6).append(hi0603OccurrenceSpanInfoDateFormatQlfr6, rhs.hi0603OccurrenceSpanInfoDateFormatQlfr6).append(hi0604OccurrenceSpanInfoDate6, rhs.hi0604OccurrenceSpanInfoDate6).append(hi07OccurrenceSpanInfo7, rhs.hi07OccurrenceSpanInfo7).append(hi0701OccurrenceSpanInfoQlfr7, rhs.hi0701OccurrenceSpanInfoQlfr7).append(hi0702OccurrenceSpanInfoCode7, rhs.hi0702OccurrenceSpanInfoCode7).append(hi0703OccurrenceSpanInfoDateFormatQlfr7, rhs.hi0703OccurrenceSpanInfoDateFormatQlfr7).append(hi0704OccurrenceSpanInfoDate7, rhs.hi0704OccurrenceSpanInfoDate7).append(hi08OccurrenceSpanInfo8, rhs.hi08OccurrenceSpanInfo8).append(hi0801OccurrenceSpanInfoQlfr8, rhs.hi0801OccurrenceSpanInfoQlfr8).append(hi0802OccurrenceSpanInfoCode8, rhs.hi0802OccurrenceSpanInfoCode8).append(hi0803OccurrenceSpanInfoDateFormatQlfr8, rhs.hi0803OccurrenceSpanInfoDateFormatQlfr8).append(hi0804OccurrenceSpanInfoDate8, rhs.hi0804OccurrenceSpanInfoDate8).append(hi09OccurrenceSpanInfo9, rhs.hi09OccurrenceSpanInfo9).append(hi0901OccurrenceSpanInfoQlfr9, rhs.hi0901OccurrenceSpanInfoQlfr9).append(hi0902OccurrenceSpanInfoCode9, rhs.hi0902OccurrenceSpanInfoCode9).append(hi0903OccurrenceSpanInfoDateFormatQlfr9, rhs.hi0903OccurrenceSpanInfoDateFormatQlfr9).append(hi0904OccurrenceSpanInfoDate9, rhs.hi0904OccurrenceSpanInfoDate9).append(hi10OccurrenceSpanInfo10, rhs.hi10OccurrenceSpanInfo10).append(hi1001OccurrenceSpanInfoQlfr10, rhs.hi1001OccurrenceSpanInfoQlfr10).append(hi1002OccurrenceSpanInfoCode10, rhs.hi1002OccurrenceSpanInfoCode10).append(hi1003OccurrenceSpanInfoDateFormatQlfr10, rhs.hi1003OccurrenceSpanInfoDateFormatQlfr10).append(hi1004OccurrenceSpanInfoDate10, rhs.hi1004OccurrenceSpanInfoDate10).append(hi11OccurrenceSpanInfo11, rhs.hi11OccurrenceSpanInfo11).append(hi1101OccurrenceSpanInfoQlfr11, rhs.hi1101OccurrenceSpanInfoQlfr11).append(hi1102OccurrenceSpanInfoCode11, rhs.hi1102OccurrenceSpanInfoCode11).append(hi1103OccurrenceSpanInfoDateFormatQlfr11, rhs.hi1103OccurrenceSpanInfoDateFormatQlfr11).append(hi1104OccurrenceSpanInfoDate11, rhs.hi1104OccurrenceSpanInfoDate11).append(hi12OccurrenceSpanInfo12, rhs.hi12OccurrenceSpanInfo12).append(hi1201OccurrenceSpanInfoQlfr12, rhs.hi1201OccurrenceSpanInfoQlfr12).append(hi1202OccurrenceSpanInfoCode12, rhs.hi1202OccurrenceSpanInfoCode12).append(hi1203OccurrenceSpanInfoDateFormatQlfr12, rhs.hi1203OccurrenceSpanInfoDateFormatQlfr12).append(hi1204OccurrenceSpanInfoDate12, rhs.hi1204OccurrenceSpanInfoDate12).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

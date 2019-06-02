
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
    "hi01_otherProcedureInfo1",
    "hi01_01_otherProcedureInfoQlfr1",
    "hi01_02_otherProcedureCode1",
    "hi01_03_otherProcedureDateFormatQlfr1",
    "hi01_04_otherProcedureDate1",
    "hi02_otherProcedureInfo2",
    "hi02_01_otherProcedureInfoQlfr2",
    "hi02_02_otherProcedureCode2",
    "hi02_03_otherProcedureDateFormatQlfr2",
    "hi02_04_otherProcedureDate2",
    "hi03_otherProcedureInfo3",
    "hi03_01_otherProcedureInfoQlfr3",
    "hi03_02_otherProcedureCode3",
    "hi03_03_otherProcedureDateFormatQlfr3",
    "hi03_04_otherProcedureDate3",
    "hi04_otherProcedureInfo4",
    "hi04_01_otherProcedureInfoQlfr4",
    "hi04_02_otherProcedureCode4",
    "hi04_03_otherProcedureDateFormatQlfr4",
    "hi04_04_otherProcedureDate4",
    "hi05_otherProcedureInfo5",
    "hi05_01_otherProcedureInfoQlfr5",
    "hi05_02_otherProcedureCode5",
    "hi05_03_otherProcedureDateFormatQlfr5",
    "hi05_04_otherProcedureDate5",
    "hi06_otherProcedureInfo6",
    "hi06_01_otherProcedureInfoQlfr6",
    "hi06_02_otherProcedureCode6",
    "hi06_03_otherProcedureDateFormatQlfr6",
    "hi06_04_otherProcedureDate6",
    "hi07_otherProcedureInfo7",
    "hi07_01_otherProcedureInfoQlfr7",
    "hi07_02_otherProcedureCode7",
    "hi07_03_otherProcedureDateFormatQlfr7",
    "hi07_04_otherProcedureDate7",
    "hi08_otherProcedureInfo8",
    "hi08_01_otherProcedureInfoQlfr8",
    "hi08_02_otherProcedureCode8",
    "hi08_03_otherProcedureDateFormatQlfr8",
    "hi08_04_otherProcedureDate8",
    "hi09_otherProcedureInfo9",
    "hi09_01_otherProcedureInfoQlfr9",
    "hi09_02_otherProcedureCode9",
    "hi09_03_otherProcedureDateFormatQlfr9",
    "hi09_04_otherProcedureDate9",
    "hi10_otherProcedureInfo10",
    "hi10_01_otherProcedureInfoQlfr10",
    "hi10_02_otherProcedureCode10",
    "hi10_03_otherProcedureDateFormatQlfr10",
    "hi10_04_otherProcedureDate10",
    "hi11_otherProcedureInfo11",
    "hi11_01_otherProcedureInfoQlfr11",
    "hi11_02_otherProcedureCode11",
    "hi11_03_otherProcedureDateFormatQlfr11",
    "hi11_04_otherProcedureDate11",
    "hi12_otherProcedureInfo12",
    "hi12_01_otherProcedureInfoQlfr12",
    "hi12_02_otherProcedureCode12",
    "hi12_03_otherProcedureDateFormatQlfr12",
    "hi12_04_otherProcedureDate12"
})
public class HiOtherProcedureInfo {

    @JsonProperty("hi01_otherProcedureInfo1")
    private String hi01OtherProcedureInfo1;
    @JsonProperty("hi01_01_otherProcedureInfoQlfr1")
    private String hi0101OtherProcedureInfoQlfr1;
    @JsonProperty("hi01_02_otherProcedureCode1")
    private String hi0102OtherProcedureCode1;
    @JsonProperty("hi01_03_otherProcedureDateFormatQlfr1")
    private String hi0103OtherProcedureDateFormatQlfr1;
    @JsonProperty("hi01_04_otherProcedureDate1")
    private String hi0104OtherProcedureDate1;
    @JsonProperty("hi02_otherProcedureInfo2")
    private String hi02OtherProcedureInfo2;
    @JsonProperty("hi02_01_otherProcedureInfoQlfr2")
    private String hi0201OtherProcedureInfoQlfr2;
    @JsonProperty("hi02_02_otherProcedureCode2")
    private String hi0202OtherProcedureCode2;
    @JsonProperty("hi02_03_otherProcedureDateFormatQlfr2")
    private String hi0203OtherProcedureDateFormatQlfr2;
    @JsonProperty("hi02_04_otherProcedureDate2")
    private String hi0204OtherProcedureDate2;
    @JsonProperty("hi03_otherProcedureInfo3")
    private String hi03OtherProcedureInfo3;
    @JsonProperty("hi03_01_otherProcedureInfoQlfr3")
    private String hi0301OtherProcedureInfoQlfr3;
    @JsonProperty("hi03_02_otherProcedureCode3")
    private String hi0302OtherProcedureCode3;
    @JsonProperty("hi03_03_otherProcedureDateFormatQlfr3")
    private String hi0303OtherProcedureDateFormatQlfr3;
    @JsonProperty("hi03_04_otherProcedureDate3")
    private String hi0304OtherProcedureDate3;
    @JsonProperty("hi04_otherProcedureInfo4")
    private String hi04OtherProcedureInfo4;
    @JsonProperty("hi04_01_otherProcedureInfoQlfr4")
    private String hi0401OtherProcedureInfoQlfr4;
    @JsonProperty("hi04_02_otherProcedureCode4")
    private String hi0402OtherProcedureCode4;
    @JsonProperty("hi04_03_otherProcedureDateFormatQlfr4")
    private String hi0403OtherProcedureDateFormatQlfr4;
    @JsonProperty("hi04_04_otherProcedureDate4")
    private String hi0404OtherProcedureDate4;
    @JsonProperty("hi05_otherProcedureInfo5")
    private String hi05OtherProcedureInfo5;
    @JsonProperty("hi05_01_otherProcedureInfoQlfr5")
    private String hi0501OtherProcedureInfoQlfr5;
    @JsonProperty("hi05_02_otherProcedureCode5")
    private String hi0502OtherProcedureCode5;
    @JsonProperty("hi05_03_otherProcedureDateFormatQlfr5")
    private String hi0503OtherProcedureDateFormatQlfr5;
    @JsonProperty("hi05_04_otherProcedureDate5")
    private String hi0504OtherProcedureDate5;
    @JsonProperty("hi06_otherProcedureInfo6")
    private String hi06OtherProcedureInfo6;
    @JsonProperty("hi06_01_otherProcedureInfoQlfr6")
    private String hi0601OtherProcedureInfoQlfr6;
    @JsonProperty("hi06_02_otherProcedureCode6")
    private String hi0602OtherProcedureCode6;
    @JsonProperty("hi06_03_otherProcedureDateFormatQlfr6")
    private String hi0603OtherProcedureDateFormatQlfr6;
    @JsonProperty("hi06_04_otherProcedureDate6")
    private String hi0604OtherProcedureDate6;
    @JsonProperty("hi07_otherProcedureInfo7")
    private String hi07OtherProcedureInfo7;
    @JsonProperty("hi07_01_otherProcedureInfoQlfr7")
    private String hi0701OtherProcedureInfoQlfr7;
    @JsonProperty("hi07_02_otherProcedureCode7")
    private String hi0702OtherProcedureCode7;
    @JsonProperty("hi07_03_otherProcedureDateFormatQlfr7")
    private String hi0703OtherProcedureDateFormatQlfr7;
    @JsonProperty("hi07_04_otherProcedureDate7")
    private String hi0704OtherProcedureDate7;
    @JsonProperty("hi08_otherProcedureInfo8")
    private String hi08OtherProcedureInfo8;
    @JsonProperty("hi08_01_otherProcedureInfoQlfr8")
    private String hi0801OtherProcedureInfoQlfr8;
    @JsonProperty("hi08_02_otherProcedureCode8")
    private String hi0802OtherProcedureCode8;
    @JsonProperty("hi08_03_otherProcedureDateFormatQlfr8")
    private String hi0803OtherProcedureDateFormatQlfr8;
    @JsonProperty("hi08_04_otherProcedureDate8")
    private String hi0804OtherProcedureDate8;
    @JsonProperty("hi09_otherProcedureInfo9")
    private String hi09OtherProcedureInfo9;
    @JsonProperty("hi09_01_otherProcedureInfoQlfr9")
    private String hi0901OtherProcedureInfoQlfr9;
    @JsonProperty("hi09_02_otherProcedureCode9")
    private String hi0902OtherProcedureCode9;
    @JsonProperty("hi09_03_otherProcedureDateFormatQlfr9")
    private String hi0903OtherProcedureDateFormatQlfr9;
    @JsonProperty("hi09_04_otherProcedureDate9")
    private String hi0904OtherProcedureDate9;
    @JsonProperty("hi10_otherProcedureInfo10")
    private String hi10OtherProcedureInfo10;
    @JsonProperty("hi10_01_otherProcedureInfoQlfr10")
    private String hi1001OtherProcedureInfoQlfr10;
    @JsonProperty("hi10_02_otherProcedureCode10")
    private String hi1002OtherProcedureCode10;
    @JsonProperty("hi10_03_otherProcedureDateFormatQlfr10")
    private String hi1003OtherProcedureDateFormatQlfr10;
    @JsonProperty("hi10_04_otherProcedureDate10")
    private String hi1004OtherProcedureDate10;
    @JsonProperty("hi11_otherProcedureInfo11")
    private String hi11OtherProcedureInfo11;
    @JsonProperty("hi11_01_otherProcedureInfoQlfr11")
    private String hi1101OtherProcedureInfoQlfr11;
    @JsonProperty("hi11_02_otherProcedureCode11")
    private String hi1102OtherProcedureCode11;
    @JsonProperty("hi11_03_otherProcedureDateFormatQlfr11")
    private String hi1103OtherProcedureDateFormatQlfr11;
    @JsonProperty("hi11_04_otherProcedureDate11")
    private String hi1104OtherProcedureDate11;
    @JsonProperty("hi12_otherProcedureInfo12")
    private String hi12OtherProcedureInfo12;
    @JsonProperty("hi12_01_otherProcedureInfoQlfr12")
    private String hi1201OtherProcedureInfoQlfr12;
    @JsonProperty("hi12_02_otherProcedureCode12")
    private String hi1202OtherProcedureCode12;
    @JsonProperty("hi12_03_otherProcedureDateFormatQlfr12")
    private String hi1203OtherProcedureDateFormatQlfr12;
    @JsonProperty("hi12_04_otherProcedureDate12")
    private String hi1204OtherProcedureDate12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hi01_otherProcedureInfo1")
    public String getHi01OtherProcedureInfo1() {
        return hi01OtherProcedureInfo1;
    }

    @JsonProperty("hi01_otherProcedureInfo1")
    public void setHi01OtherProcedureInfo1(String hi01OtherProcedureInfo1) {
        this.hi01OtherProcedureInfo1 = hi01OtherProcedureInfo1;
    }

    public HiOtherProcedureInfo withHi01OtherProcedureInfo1(String hi01OtherProcedureInfo1) {
        this.hi01OtherProcedureInfo1 = hi01OtherProcedureInfo1;
        return this;
    }

    @JsonProperty("hi01_01_otherProcedureInfoQlfr1")
    public String getHi0101OtherProcedureInfoQlfr1() {
        return hi0101OtherProcedureInfoQlfr1;
    }

    @JsonProperty("hi01_01_otherProcedureInfoQlfr1")
    public void setHi0101OtherProcedureInfoQlfr1(String hi0101OtherProcedureInfoQlfr1) {
        this.hi0101OtherProcedureInfoQlfr1 = hi0101OtherProcedureInfoQlfr1;
    }

    public HiOtherProcedureInfo withHi0101OtherProcedureInfoQlfr1(String hi0101OtherProcedureInfoQlfr1) {
        this.hi0101OtherProcedureInfoQlfr1 = hi0101OtherProcedureInfoQlfr1;
        return this;
    }

    @JsonProperty("hi01_02_otherProcedureCode1")
    public String getHi0102OtherProcedureCode1() {
        return hi0102OtherProcedureCode1;
    }

    @JsonProperty("hi01_02_otherProcedureCode1")
    public void setHi0102OtherProcedureCode1(String hi0102OtherProcedureCode1) {
        this.hi0102OtherProcedureCode1 = hi0102OtherProcedureCode1;
    }

    public HiOtherProcedureInfo withHi0102OtherProcedureCode1(String hi0102OtherProcedureCode1) {
        this.hi0102OtherProcedureCode1 = hi0102OtherProcedureCode1;
        return this;
    }

    @JsonProperty("hi01_03_otherProcedureDateFormatQlfr1")
    public String getHi0103OtherProcedureDateFormatQlfr1() {
        return hi0103OtherProcedureDateFormatQlfr1;
    }

    @JsonProperty("hi01_03_otherProcedureDateFormatQlfr1")
    public void setHi0103OtherProcedureDateFormatQlfr1(String hi0103OtherProcedureDateFormatQlfr1) {
        this.hi0103OtherProcedureDateFormatQlfr1 = hi0103OtherProcedureDateFormatQlfr1;
    }

    public HiOtherProcedureInfo withHi0103OtherProcedureDateFormatQlfr1(String hi0103OtherProcedureDateFormatQlfr1) {
        this.hi0103OtherProcedureDateFormatQlfr1 = hi0103OtherProcedureDateFormatQlfr1;
        return this;
    }

    @JsonProperty("hi01_04_otherProcedureDate1")
    public String getHi0104OtherProcedureDate1() {
        return hi0104OtherProcedureDate1;
    }

    @JsonProperty("hi01_04_otherProcedureDate1")
    public void setHi0104OtherProcedureDate1(String hi0104OtherProcedureDate1) {
        this.hi0104OtherProcedureDate1 = hi0104OtherProcedureDate1;
    }

    public HiOtherProcedureInfo withHi0104OtherProcedureDate1(String hi0104OtherProcedureDate1) {
        this.hi0104OtherProcedureDate1 = hi0104OtherProcedureDate1;
        return this;
    }

    @JsonProperty("hi02_otherProcedureInfo2")
    public String getHi02OtherProcedureInfo2() {
        return hi02OtherProcedureInfo2;
    }

    @JsonProperty("hi02_otherProcedureInfo2")
    public void setHi02OtherProcedureInfo2(String hi02OtherProcedureInfo2) {
        this.hi02OtherProcedureInfo2 = hi02OtherProcedureInfo2;
    }

    public HiOtherProcedureInfo withHi02OtherProcedureInfo2(String hi02OtherProcedureInfo2) {
        this.hi02OtherProcedureInfo2 = hi02OtherProcedureInfo2;
        return this;
    }

    @JsonProperty("hi02_01_otherProcedureInfoQlfr2")
    public String getHi0201OtherProcedureInfoQlfr2() {
        return hi0201OtherProcedureInfoQlfr2;
    }

    @JsonProperty("hi02_01_otherProcedureInfoQlfr2")
    public void setHi0201OtherProcedureInfoQlfr2(String hi0201OtherProcedureInfoQlfr2) {
        this.hi0201OtherProcedureInfoQlfr2 = hi0201OtherProcedureInfoQlfr2;
    }

    public HiOtherProcedureInfo withHi0201OtherProcedureInfoQlfr2(String hi0201OtherProcedureInfoQlfr2) {
        this.hi0201OtherProcedureInfoQlfr2 = hi0201OtherProcedureInfoQlfr2;
        return this;
    }

    @JsonProperty("hi02_02_otherProcedureCode2")
    public String getHi0202OtherProcedureCode2() {
        return hi0202OtherProcedureCode2;
    }

    @JsonProperty("hi02_02_otherProcedureCode2")
    public void setHi0202OtherProcedureCode2(String hi0202OtherProcedureCode2) {
        this.hi0202OtherProcedureCode2 = hi0202OtherProcedureCode2;
    }

    public HiOtherProcedureInfo withHi0202OtherProcedureCode2(String hi0202OtherProcedureCode2) {
        this.hi0202OtherProcedureCode2 = hi0202OtherProcedureCode2;
        return this;
    }

    @JsonProperty("hi02_03_otherProcedureDateFormatQlfr2")
    public String getHi0203OtherProcedureDateFormatQlfr2() {
        return hi0203OtherProcedureDateFormatQlfr2;
    }

    @JsonProperty("hi02_03_otherProcedureDateFormatQlfr2")
    public void setHi0203OtherProcedureDateFormatQlfr2(String hi0203OtherProcedureDateFormatQlfr2) {
        this.hi0203OtherProcedureDateFormatQlfr2 = hi0203OtherProcedureDateFormatQlfr2;
    }

    public HiOtherProcedureInfo withHi0203OtherProcedureDateFormatQlfr2(String hi0203OtherProcedureDateFormatQlfr2) {
        this.hi0203OtherProcedureDateFormatQlfr2 = hi0203OtherProcedureDateFormatQlfr2;
        return this;
    }

    @JsonProperty("hi02_04_otherProcedureDate2")
    public String getHi0204OtherProcedureDate2() {
        return hi0204OtherProcedureDate2;
    }

    @JsonProperty("hi02_04_otherProcedureDate2")
    public void setHi0204OtherProcedureDate2(String hi0204OtherProcedureDate2) {
        this.hi0204OtherProcedureDate2 = hi0204OtherProcedureDate2;
    }

    public HiOtherProcedureInfo withHi0204OtherProcedureDate2(String hi0204OtherProcedureDate2) {
        this.hi0204OtherProcedureDate2 = hi0204OtherProcedureDate2;
        return this;
    }

    @JsonProperty("hi03_otherProcedureInfo3")
    public String getHi03OtherProcedureInfo3() {
        return hi03OtherProcedureInfo3;
    }

    @JsonProperty("hi03_otherProcedureInfo3")
    public void setHi03OtherProcedureInfo3(String hi03OtherProcedureInfo3) {
        this.hi03OtherProcedureInfo3 = hi03OtherProcedureInfo3;
    }

    public HiOtherProcedureInfo withHi03OtherProcedureInfo3(String hi03OtherProcedureInfo3) {
        this.hi03OtherProcedureInfo3 = hi03OtherProcedureInfo3;
        return this;
    }

    @JsonProperty("hi03_01_otherProcedureInfoQlfr3")
    public String getHi0301OtherProcedureInfoQlfr3() {
        return hi0301OtherProcedureInfoQlfr3;
    }

    @JsonProperty("hi03_01_otherProcedureInfoQlfr3")
    public void setHi0301OtherProcedureInfoQlfr3(String hi0301OtherProcedureInfoQlfr3) {
        this.hi0301OtherProcedureInfoQlfr3 = hi0301OtherProcedureInfoQlfr3;
    }

    public HiOtherProcedureInfo withHi0301OtherProcedureInfoQlfr3(String hi0301OtherProcedureInfoQlfr3) {
        this.hi0301OtherProcedureInfoQlfr3 = hi0301OtherProcedureInfoQlfr3;
        return this;
    }

    @JsonProperty("hi03_02_otherProcedureCode3")
    public String getHi0302OtherProcedureCode3() {
        return hi0302OtherProcedureCode3;
    }

    @JsonProperty("hi03_02_otherProcedureCode3")
    public void setHi0302OtherProcedureCode3(String hi0302OtherProcedureCode3) {
        this.hi0302OtherProcedureCode3 = hi0302OtherProcedureCode3;
    }

    public HiOtherProcedureInfo withHi0302OtherProcedureCode3(String hi0302OtherProcedureCode3) {
        this.hi0302OtherProcedureCode3 = hi0302OtherProcedureCode3;
        return this;
    }

    @JsonProperty("hi03_03_otherProcedureDateFormatQlfr3")
    public String getHi0303OtherProcedureDateFormatQlfr3() {
        return hi0303OtherProcedureDateFormatQlfr3;
    }

    @JsonProperty("hi03_03_otherProcedureDateFormatQlfr3")
    public void setHi0303OtherProcedureDateFormatQlfr3(String hi0303OtherProcedureDateFormatQlfr3) {
        this.hi0303OtherProcedureDateFormatQlfr3 = hi0303OtherProcedureDateFormatQlfr3;
    }

    public HiOtherProcedureInfo withHi0303OtherProcedureDateFormatQlfr3(String hi0303OtherProcedureDateFormatQlfr3) {
        this.hi0303OtherProcedureDateFormatQlfr3 = hi0303OtherProcedureDateFormatQlfr3;
        return this;
    }

    @JsonProperty("hi03_04_otherProcedureDate3")
    public String getHi0304OtherProcedureDate3() {
        return hi0304OtherProcedureDate3;
    }

    @JsonProperty("hi03_04_otherProcedureDate3")
    public void setHi0304OtherProcedureDate3(String hi0304OtherProcedureDate3) {
        this.hi0304OtherProcedureDate3 = hi0304OtherProcedureDate3;
    }

    public HiOtherProcedureInfo withHi0304OtherProcedureDate3(String hi0304OtherProcedureDate3) {
        this.hi0304OtherProcedureDate3 = hi0304OtherProcedureDate3;
        return this;
    }

    @JsonProperty("hi04_otherProcedureInfo4")
    public String getHi04OtherProcedureInfo4() {
        return hi04OtherProcedureInfo4;
    }

    @JsonProperty("hi04_otherProcedureInfo4")
    public void setHi04OtherProcedureInfo4(String hi04OtherProcedureInfo4) {
        this.hi04OtherProcedureInfo4 = hi04OtherProcedureInfo4;
    }

    public HiOtherProcedureInfo withHi04OtherProcedureInfo4(String hi04OtherProcedureInfo4) {
        this.hi04OtherProcedureInfo4 = hi04OtherProcedureInfo4;
        return this;
    }

    @JsonProperty("hi04_01_otherProcedureInfoQlfr4")
    public String getHi0401OtherProcedureInfoQlfr4() {
        return hi0401OtherProcedureInfoQlfr4;
    }

    @JsonProperty("hi04_01_otherProcedureInfoQlfr4")
    public void setHi0401OtherProcedureInfoQlfr4(String hi0401OtherProcedureInfoQlfr4) {
        this.hi0401OtherProcedureInfoQlfr4 = hi0401OtherProcedureInfoQlfr4;
    }

    public HiOtherProcedureInfo withHi0401OtherProcedureInfoQlfr4(String hi0401OtherProcedureInfoQlfr4) {
        this.hi0401OtherProcedureInfoQlfr4 = hi0401OtherProcedureInfoQlfr4;
        return this;
    }

    @JsonProperty("hi04_02_otherProcedureCode4")
    public String getHi0402OtherProcedureCode4() {
        return hi0402OtherProcedureCode4;
    }

    @JsonProperty("hi04_02_otherProcedureCode4")
    public void setHi0402OtherProcedureCode4(String hi0402OtherProcedureCode4) {
        this.hi0402OtherProcedureCode4 = hi0402OtherProcedureCode4;
    }

    public HiOtherProcedureInfo withHi0402OtherProcedureCode4(String hi0402OtherProcedureCode4) {
        this.hi0402OtherProcedureCode4 = hi0402OtherProcedureCode4;
        return this;
    }

    @JsonProperty("hi04_03_otherProcedureDateFormatQlfr4")
    public String getHi0403OtherProcedureDateFormatQlfr4() {
        return hi0403OtherProcedureDateFormatQlfr4;
    }

    @JsonProperty("hi04_03_otherProcedureDateFormatQlfr4")
    public void setHi0403OtherProcedureDateFormatQlfr4(String hi0403OtherProcedureDateFormatQlfr4) {
        this.hi0403OtherProcedureDateFormatQlfr4 = hi0403OtherProcedureDateFormatQlfr4;
    }

    public HiOtherProcedureInfo withHi0403OtherProcedureDateFormatQlfr4(String hi0403OtherProcedureDateFormatQlfr4) {
        this.hi0403OtherProcedureDateFormatQlfr4 = hi0403OtherProcedureDateFormatQlfr4;
        return this;
    }

    @JsonProperty("hi04_04_otherProcedureDate4")
    public String getHi0404OtherProcedureDate4() {
        return hi0404OtherProcedureDate4;
    }

    @JsonProperty("hi04_04_otherProcedureDate4")
    public void setHi0404OtherProcedureDate4(String hi0404OtherProcedureDate4) {
        this.hi0404OtherProcedureDate4 = hi0404OtherProcedureDate4;
    }

    public HiOtherProcedureInfo withHi0404OtherProcedureDate4(String hi0404OtherProcedureDate4) {
        this.hi0404OtherProcedureDate4 = hi0404OtherProcedureDate4;
        return this;
    }

    @JsonProperty("hi05_otherProcedureInfo5")
    public String getHi05OtherProcedureInfo5() {
        return hi05OtherProcedureInfo5;
    }

    @JsonProperty("hi05_otherProcedureInfo5")
    public void setHi05OtherProcedureInfo5(String hi05OtherProcedureInfo5) {
        this.hi05OtherProcedureInfo5 = hi05OtherProcedureInfo5;
    }

    public HiOtherProcedureInfo withHi05OtherProcedureInfo5(String hi05OtherProcedureInfo5) {
        this.hi05OtherProcedureInfo5 = hi05OtherProcedureInfo5;
        return this;
    }

    @JsonProperty("hi05_01_otherProcedureInfoQlfr5")
    public String getHi0501OtherProcedureInfoQlfr5() {
        return hi0501OtherProcedureInfoQlfr5;
    }

    @JsonProperty("hi05_01_otherProcedureInfoQlfr5")
    public void setHi0501OtherProcedureInfoQlfr5(String hi0501OtherProcedureInfoQlfr5) {
        this.hi0501OtherProcedureInfoQlfr5 = hi0501OtherProcedureInfoQlfr5;
    }

    public HiOtherProcedureInfo withHi0501OtherProcedureInfoQlfr5(String hi0501OtherProcedureInfoQlfr5) {
        this.hi0501OtherProcedureInfoQlfr5 = hi0501OtherProcedureInfoQlfr5;
        return this;
    }

    @JsonProperty("hi05_02_otherProcedureCode5")
    public String getHi0502OtherProcedureCode5() {
        return hi0502OtherProcedureCode5;
    }

    @JsonProperty("hi05_02_otherProcedureCode5")
    public void setHi0502OtherProcedureCode5(String hi0502OtherProcedureCode5) {
        this.hi0502OtherProcedureCode5 = hi0502OtherProcedureCode5;
    }

    public HiOtherProcedureInfo withHi0502OtherProcedureCode5(String hi0502OtherProcedureCode5) {
        this.hi0502OtherProcedureCode5 = hi0502OtherProcedureCode5;
        return this;
    }

    @JsonProperty("hi05_03_otherProcedureDateFormatQlfr5")
    public String getHi0503OtherProcedureDateFormatQlfr5() {
        return hi0503OtherProcedureDateFormatQlfr5;
    }

    @JsonProperty("hi05_03_otherProcedureDateFormatQlfr5")
    public void setHi0503OtherProcedureDateFormatQlfr5(String hi0503OtherProcedureDateFormatQlfr5) {
        this.hi0503OtherProcedureDateFormatQlfr5 = hi0503OtherProcedureDateFormatQlfr5;
    }

    public HiOtherProcedureInfo withHi0503OtherProcedureDateFormatQlfr5(String hi0503OtherProcedureDateFormatQlfr5) {
        this.hi0503OtherProcedureDateFormatQlfr5 = hi0503OtherProcedureDateFormatQlfr5;
        return this;
    }

    @JsonProperty("hi05_04_otherProcedureDate5")
    public String getHi0504OtherProcedureDate5() {
        return hi0504OtherProcedureDate5;
    }

    @JsonProperty("hi05_04_otherProcedureDate5")
    public void setHi0504OtherProcedureDate5(String hi0504OtherProcedureDate5) {
        this.hi0504OtherProcedureDate5 = hi0504OtherProcedureDate5;
    }

    public HiOtherProcedureInfo withHi0504OtherProcedureDate5(String hi0504OtherProcedureDate5) {
        this.hi0504OtherProcedureDate5 = hi0504OtherProcedureDate5;
        return this;
    }

    @JsonProperty("hi06_otherProcedureInfo6")
    public String getHi06OtherProcedureInfo6() {
        return hi06OtherProcedureInfo6;
    }

    @JsonProperty("hi06_otherProcedureInfo6")
    public void setHi06OtherProcedureInfo6(String hi06OtherProcedureInfo6) {
        this.hi06OtherProcedureInfo6 = hi06OtherProcedureInfo6;
    }

    public HiOtherProcedureInfo withHi06OtherProcedureInfo6(String hi06OtherProcedureInfo6) {
        this.hi06OtherProcedureInfo6 = hi06OtherProcedureInfo6;
        return this;
    }

    @JsonProperty("hi06_01_otherProcedureInfoQlfr6")
    public String getHi0601OtherProcedureInfoQlfr6() {
        return hi0601OtherProcedureInfoQlfr6;
    }

    @JsonProperty("hi06_01_otherProcedureInfoQlfr6")
    public void setHi0601OtherProcedureInfoQlfr6(String hi0601OtherProcedureInfoQlfr6) {
        this.hi0601OtherProcedureInfoQlfr6 = hi0601OtherProcedureInfoQlfr6;
    }

    public HiOtherProcedureInfo withHi0601OtherProcedureInfoQlfr6(String hi0601OtherProcedureInfoQlfr6) {
        this.hi0601OtherProcedureInfoQlfr6 = hi0601OtherProcedureInfoQlfr6;
        return this;
    }

    @JsonProperty("hi06_02_otherProcedureCode6")
    public String getHi0602OtherProcedureCode6() {
        return hi0602OtherProcedureCode6;
    }

    @JsonProperty("hi06_02_otherProcedureCode6")
    public void setHi0602OtherProcedureCode6(String hi0602OtherProcedureCode6) {
        this.hi0602OtherProcedureCode6 = hi0602OtherProcedureCode6;
    }

    public HiOtherProcedureInfo withHi0602OtherProcedureCode6(String hi0602OtherProcedureCode6) {
        this.hi0602OtherProcedureCode6 = hi0602OtherProcedureCode6;
        return this;
    }

    @JsonProperty("hi06_03_otherProcedureDateFormatQlfr6")
    public String getHi0603OtherProcedureDateFormatQlfr6() {
        return hi0603OtherProcedureDateFormatQlfr6;
    }

    @JsonProperty("hi06_03_otherProcedureDateFormatQlfr6")
    public void setHi0603OtherProcedureDateFormatQlfr6(String hi0603OtherProcedureDateFormatQlfr6) {
        this.hi0603OtherProcedureDateFormatQlfr6 = hi0603OtherProcedureDateFormatQlfr6;
    }

    public HiOtherProcedureInfo withHi0603OtherProcedureDateFormatQlfr6(String hi0603OtherProcedureDateFormatQlfr6) {
        this.hi0603OtherProcedureDateFormatQlfr6 = hi0603OtherProcedureDateFormatQlfr6;
        return this;
    }

    @JsonProperty("hi06_04_otherProcedureDate6")
    public String getHi0604OtherProcedureDate6() {
        return hi0604OtherProcedureDate6;
    }

    @JsonProperty("hi06_04_otherProcedureDate6")
    public void setHi0604OtherProcedureDate6(String hi0604OtherProcedureDate6) {
        this.hi0604OtherProcedureDate6 = hi0604OtherProcedureDate6;
    }

    public HiOtherProcedureInfo withHi0604OtherProcedureDate6(String hi0604OtherProcedureDate6) {
        this.hi0604OtherProcedureDate6 = hi0604OtherProcedureDate6;
        return this;
    }

    @JsonProperty("hi07_otherProcedureInfo7")
    public String getHi07OtherProcedureInfo7() {
        return hi07OtherProcedureInfo7;
    }

    @JsonProperty("hi07_otherProcedureInfo7")
    public void setHi07OtherProcedureInfo7(String hi07OtherProcedureInfo7) {
        this.hi07OtherProcedureInfo7 = hi07OtherProcedureInfo7;
    }

    public HiOtherProcedureInfo withHi07OtherProcedureInfo7(String hi07OtherProcedureInfo7) {
        this.hi07OtherProcedureInfo7 = hi07OtherProcedureInfo7;
        return this;
    }

    @JsonProperty("hi07_01_otherProcedureInfoQlfr7")
    public String getHi0701OtherProcedureInfoQlfr7() {
        return hi0701OtherProcedureInfoQlfr7;
    }

    @JsonProperty("hi07_01_otherProcedureInfoQlfr7")
    public void setHi0701OtherProcedureInfoQlfr7(String hi0701OtherProcedureInfoQlfr7) {
        this.hi0701OtherProcedureInfoQlfr7 = hi0701OtherProcedureInfoQlfr7;
    }

    public HiOtherProcedureInfo withHi0701OtherProcedureInfoQlfr7(String hi0701OtherProcedureInfoQlfr7) {
        this.hi0701OtherProcedureInfoQlfr7 = hi0701OtherProcedureInfoQlfr7;
        return this;
    }

    @JsonProperty("hi07_02_otherProcedureCode7")
    public String getHi0702OtherProcedureCode7() {
        return hi0702OtherProcedureCode7;
    }

    @JsonProperty("hi07_02_otherProcedureCode7")
    public void setHi0702OtherProcedureCode7(String hi0702OtherProcedureCode7) {
        this.hi0702OtherProcedureCode7 = hi0702OtherProcedureCode7;
    }

    public HiOtherProcedureInfo withHi0702OtherProcedureCode7(String hi0702OtherProcedureCode7) {
        this.hi0702OtherProcedureCode7 = hi0702OtherProcedureCode7;
        return this;
    }

    @JsonProperty("hi07_03_otherProcedureDateFormatQlfr7")
    public String getHi0703OtherProcedureDateFormatQlfr7() {
        return hi0703OtherProcedureDateFormatQlfr7;
    }

    @JsonProperty("hi07_03_otherProcedureDateFormatQlfr7")
    public void setHi0703OtherProcedureDateFormatQlfr7(String hi0703OtherProcedureDateFormatQlfr7) {
        this.hi0703OtherProcedureDateFormatQlfr7 = hi0703OtherProcedureDateFormatQlfr7;
    }

    public HiOtherProcedureInfo withHi0703OtherProcedureDateFormatQlfr7(String hi0703OtherProcedureDateFormatQlfr7) {
        this.hi0703OtherProcedureDateFormatQlfr7 = hi0703OtherProcedureDateFormatQlfr7;
        return this;
    }

    @JsonProperty("hi07_04_otherProcedureDate7")
    public String getHi0704OtherProcedureDate7() {
        return hi0704OtherProcedureDate7;
    }

    @JsonProperty("hi07_04_otherProcedureDate7")
    public void setHi0704OtherProcedureDate7(String hi0704OtherProcedureDate7) {
        this.hi0704OtherProcedureDate7 = hi0704OtherProcedureDate7;
    }

    public HiOtherProcedureInfo withHi0704OtherProcedureDate7(String hi0704OtherProcedureDate7) {
        this.hi0704OtherProcedureDate7 = hi0704OtherProcedureDate7;
        return this;
    }

    @JsonProperty("hi08_otherProcedureInfo8")
    public String getHi08OtherProcedureInfo8() {
        return hi08OtherProcedureInfo8;
    }

    @JsonProperty("hi08_otherProcedureInfo8")
    public void setHi08OtherProcedureInfo8(String hi08OtherProcedureInfo8) {
        this.hi08OtherProcedureInfo8 = hi08OtherProcedureInfo8;
    }

    public HiOtherProcedureInfo withHi08OtherProcedureInfo8(String hi08OtherProcedureInfo8) {
        this.hi08OtherProcedureInfo8 = hi08OtherProcedureInfo8;
        return this;
    }

    @JsonProperty("hi08_01_otherProcedureInfoQlfr8")
    public String getHi0801OtherProcedureInfoQlfr8() {
        return hi0801OtherProcedureInfoQlfr8;
    }

    @JsonProperty("hi08_01_otherProcedureInfoQlfr8")
    public void setHi0801OtherProcedureInfoQlfr8(String hi0801OtherProcedureInfoQlfr8) {
        this.hi0801OtherProcedureInfoQlfr8 = hi0801OtherProcedureInfoQlfr8;
    }

    public HiOtherProcedureInfo withHi0801OtherProcedureInfoQlfr8(String hi0801OtherProcedureInfoQlfr8) {
        this.hi0801OtherProcedureInfoQlfr8 = hi0801OtherProcedureInfoQlfr8;
        return this;
    }

    @JsonProperty("hi08_02_otherProcedureCode8")
    public String getHi0802OtherProcedureCode8() {
        return hi0802OtherProcedureCode8;
    }

    @JsonProperty("hi08_02_otherProcedureCode8")
    public void setHi0802OtherProcedureCode8(String hi0802OtherProcedureCode8) {
        this.hi0802OtherProcedureCode8 = hi0802OtherProcedureCode8;
    }

    public HiOtherProcedureInfo withHi0802OtherProcedureCode8(String hi0802OtherProcedureCode8) {
        this.hi0802OtherProcedureCode8 = hi0802OtherProcedureCode8;
        return this;
    }

    @JsonProperty("hi08_03_otherProcedureDateFormatQlfr8")
    public String getHi0803OtherProcedureDateFormatQlfr8() {
        return hi0803OtherProcedureDateFormatQlfr8;
    }

    @JsonProperty("hi08_03_otherProcedureDateFormatQlfr8")
    public void setHi0803OtherProcedureDateFormatQlfr8(String hi0803OtherProcedureDateFormatQlfr8) {
        this.hi0803OtherProcedureDateFormatQlfr8 = hi0803OtherProcedureDateFormatQlfr8;
    }

    public HiOtherProcedureInfo withHi0803OtherProcedureDateFormatQlfr8(String hi0803OtherProcedureDateFormatQlfr8) {
        this.hi0803OtherProcedureDateFormatQlfr8 = hi0803OtherProcedureDateFormatQlfr8;
        return this;
    }

    @JsonProperty("hi08_04_otherProcedureDate8")
    public String getHi0804OtherProcedureDate8() {
        return hi0804OtherProcedureDate8;
    }

    @JsonProperty("hi08_04_otherProcedureDate8")
    public void setHi0804OtherProcedureDate8(String hi0804OtherProcedureDate8) {
        this.hi0804OtherProcedureDate8 = hi0804OtherProcedureDate8;
    }

    public HiOtherProcedureInfo withHi0804OtherProcedureDate8(String hi0804OtherProcedureDate8) {
        this.hi0804OtherProcedureDate8 = hi0804OtherProcedureDate8;
        return this;
    }

    @JsonProperty("hi09_otherProcedureInfo9")
    public String getHi09OtherProcedureInfo9() {
        return hi09OtherProcedureInfo9;
    }

    @JsonProperty("hi09_otherProcedureInfo9")
    public void setHi09OtherProcedureInfo9(String hi09OtherProcedureInfo9) {
        this.hi09OtherProcedureInfo9 = hi09OtherProcedureInfo9;
    }

    public HiOtherProcedureInfo withHi09OtherProcedureInfo9(String hi09OtherProcedureInfo9) {
        this.hi09OtherProcedureInfo9 = hi09OtherProcedureInfo9;
        return this;
    }

    @JsonProperty("hi09_01_otherProcedureInfoQlfr9")
    public String getHi0901OtherProcedureInfoQlfr9() {
        return hi0901OtherProcedureInfoQlfr9;
    }

    @JsonProperty("hi09_01_otherProcedureInfoQlfr9")
    public void setHi0901OtherProcedureInfoQlfr9(String hi0901OtherProcedureInfoQlfr9) {
        this.hi0901OtherProcedureInfoQlfr9 = hi0901OtherProcedureInfoQlfr9;
    }

    public HiOtherProcedureInfo withHi0901OtherProcedureInfoQlfr9(String hi0901OtherProcedureInfoQlfr9) {
        this.hi0901OtherProcedureInfoQlfr9 = hi0901OtherProcedureInfoQlfr9;
        return this;
    }

    @JsonProperty("hi09_02_otherProcedureCode9")
    public String getHi0902OtherProcedureCode9() {
        return hi0902OtherProcedureCode9;
    }

    @JsonProperty("hi09_02_otherProcedureCode9")
    public void setHi0902OtherProcedureCode9(String hi0902OtherProcedureCode9) {
        this.hi0902OtherProcedureCode9 = hi0902OtherProcedureCode9;
    }

    public HiOtherProcedureInfo withHi0902OtherProcedureCode9(String hi0902OtherProcedureCode9) {
        this.hi0902OtherProcedureCode9 = hi0902OtherProcedureCode9;
        return this;
    }

    @JsonProperty("hi09_03_otherProcedureDateFormatQlfr9")
    public String getHi0903OtherProcedureDateFormatQlfr9() {
        return hi0903OtherProcedureDateFormatQlfr9;
    }

    @JsonProperty("hi09_03_otherProcedureDateFormatQlfr9")
    public void setHi0903OtherProcedureDateFormatQlfr9(String hi0903OtherProcedureDateFormatQlfr9) {
        this.hi0903OtherProcedureDateFormatQlfr9 = hi0903OtherProcedureDateFormatQlfr9;
    }

    public HiOtherProcedureInfo withHi0903OtherProcedureDateFormatQlfr9(String hi0903OtherProcedureDateFormatQlfr9) {
        this.hi0903OtherProcedureDateFormatQlfr9 = hi0903OtherProcedureDateFormatQlfr9;
        return this;
    }

    @JsonProperty("hi09_04_otherProcedureDate9")
    public String getHi0904OtherProcedureDate9() {
        return hi0904OtherProcedureDate9;
    }

    @JsonProperty("hi09_04_otherProcedureDate9")
    public void setHi0904OtherProcedureDate9(String hi0904OtherProcedureDate9) {
        this.hi0904OtherProcedureDate9 = hi0904OtherProcedureDate9;
    }

    public HiOtherProcedureInfo withHi0904OtherProcedureDate9(String hi0904OtherProcedureDate9) {
        this.hi0904OtherProcedureDate9 = hi0904OtherProcedureDate9;
        return this;
    }

    @JsonProperty("hi10_otherProcedureInfo10")
    public String getHi10OtherProcedureInfo10() {
        return hi10OtherProcedureInfo10;
    }

    @JsonProperty("hi10_otherProcedureInfo10")
    public void setHi10OtherProcedureInfo10(String hi10OtherProcedureInfo10) {
        this.hi10OtherProcedureInfo10 = hi10OtherProcedureInfo10;
    }

    public HiOtherProcedureInfo withHi10OtherProcedureInfo10(String hi10OtherProcedureInfo10) {
        this.hi10OtherProcedureInfo10 = hi10OtherProcedureInfo10;
        return this;
    }

    @JsonProperty("hi10_01_otherProcedureInfoQlfr10")
    public String getHi1001OtherProcedureInfoQlfr10() {
        return hi1001OtherProcedureInfoQlfr10;
    }

    @JsonProperty("hi10_01_otherProcedureInfoQlfr10")
    public void setHi1001OtherProcedureInfoQlfr10(String hi1001OtherProcedureInfoQlfr10) {
        this.hi1001OtherProcedureInfoQlfr10 = hi1001OtherProcedureInfoQlfr10;
    }

    public HiOtherProcedureInfo withHi1001OtherProcedureInfoQlfr10(String hi1001OtherProcedureInfoQlfr10) {
        this.hi1001OtherProcedureInfoQlfr10 = hi1001OtherProcedureInfoQlfr10;
        return this;
    }

    @JsonProperty("hi10_02_otherProcedureCode10")
    public String getHi1002OtherProcedureCode10() {
        return hi1002OtherProcedureCode10;
    }

    @JsonProperty("hi10_02_otherProcedureCode10")
    public void setHi1002OtherProcedureCode10(String hi1002OtherProcedureCode10) {
        this.hi1002OtherProcedureCode10 = hi1002OtherProcedureCode10;
    }

    public HiOtherProcedureInfo withHi1002OtherProcedureCode10(String hi1002OtherProcedureCode10) {
        this.hi1002OtherProcedureCode10 = hi1002OtherProcedureCode10;
        return this;
    }

    @JsonProperty("hi10_03_otherProcedureDateFormatQlfr10")
    public String getHi1003OtherProcedureDateFormatQlfr10() {
        return hi1003OtherProcedureDateFormatQlfr10;
    }

    @JsonProperty("hi10_03_otherProcedureDateFormatQlfr10")
    public void setHi1003OtherProcedureDateFormatQlfr10(String hi1003OtherProcedureDateFormatQlfr10) {
        this.hi1003OtherProcedureDateFormatQlfr10 = hi1003OtherProcedureDateFormatQlfr10;
    }

    public HiOtherProcedureInfo withHi1003OtherProcedureDateFormatQlfr10(String hi1003OtherProcedureDateFormatQlfr10) {
        this.hi1003OtherProcedureDateFormatQlfr10 = hi1003OtherProcedureDateFormatQlfr10;
        return this;
    }

    @JsonProperty("hi10_04_otherProcedureDate10")
    public String getHi1004OtherProcedureDate10() {
        return hi1004OtherProcedureDate10;
    }

    @JsonProperty("hi10_04_otherProcedureDate10")
    public void setHi1004OtherProcedureDate10(String hi1004OtherProcedureDate10) {
        this.hi1004OtherProcedureDate10 = hi1004OtherProcedureDate10;
    }

    public HiOtherProcedureInfo withHi1004OtherProcedureDate10(String hi1004OtherProcedureDate10) {
        this.hi1004OtherProcedureDate10 = hi1004OtherProcedureDate10;
        return this;
    }

    @JsonProperty("hi11_otherProcedureInfo11")
    public String getHi11OtherProcedureInfo11() {
        return hi11OtherProcedureInfo11;
    }

    @JsonProperty("hi11_otherProcedureInfo11")
    public void setHi11OtherProcedureInfo11(String hi11OtherProcedureInfo11) {
        this.hi11OtherProcedureInfo11 = hi11OtherProcedureInfo11;
    }

    public HiOtherProcedureInfo withHi11OtherProcedureInfo11(String hi11OtherProcedureInfo11) {
        this.hi11OtherProcedureInfo11 = hi11OtherProcedureInfo11;
        return this;
    }

    @JsonProperty("hi11_01_otherProcedureInfoQlfr11")
    public String getHi1101OtherProcedureInfoQlfr11() {
        return hi1101OtherProcedureInfoQlfr11;
    }

    @JsonProperty("hi11_01_otherProcedureInfoQlfr11")
    public void setHi1101OtherProcedureInfoQlfr11(String hi1101OtherProcedureInfoQlfr11) {
        this.hi1101OtherProcedureInfoQlfr11 = hi1101OtherProcedureInfoQlfr11;
    }

    public HiOtherProcedureInfo withHi1101OtherProcedureInfoQlfr11(String hi1101OtherProcedureInfoQlfr11) {
        this.hi1101OtherProcedureInfoQlfr11 = hi1101OtherProcedureInfoQlfr11;
        return this;
    }

    @JsonProperty("hi11_02_otherProcedureCode11")
    public String getHi1102OtherProcedureCode11() {
        return hi1102OtherProcedureCode11;
    }

    @JsonProperty("hi11_02_otherProcedureCode11")
    public void setHi1102OtherProcedureCode11(String hi1102OtherProcedureCode11) {
        this.hi1102OtherProcedureCode11 = hi1102OtherProcedureCode11;
    }

    public HiOtherProcedureInfo withHi1102OtherProcedureCode11(String hi1102OtherProcedureCode11) {
        this.hi1102OtherProcedureCode11 = hi1102OtherProcedureCode11;
        return this;
    }

    @JsonProperty("hi11_03_otherProcedureDateFormatQlfr11")
    public String getHi1103OtherProcedureDateFormatQlfr11() {
        return hi1103OtherProcedureDateFormatQlfr11;
    }

    @JsonProperty("hi11_03_otherProcedureDateFormatQlfr11")
    public void setHi1103OtherProcedureDateFormatQlfr11(String hi1103OtherProcedureDateFormatQlfr11) {
        this.hi1103OtherProcedureDateFormatQlfr11 = hi1103OtherProcedureDateFormatQlfr11;
    }

    public HiOtherProcedureInfo withHi1103OtherProcedureDateFormatQlfr11(String hi1103OtherProcedureDateFormatQlfr11) {
        this.hi1103OtherProcedureDateFormatQlfr11 = hi1103OtherProcedureDateFormatQlfr11;
        return this;
    }

    @JsonProperty("hi11_04_otherProcedureDate11")
    public String getHi1104OtherProcedureDate11() {
        return hi1104OtherProcedureDate11;
    }

    @JsonProperty("hi11_04_otherProcedureDate11")
    public void setHi1104OtherProcedureDate11(String hi1104OtherProcedureDate11) {
        this.hi1104OtherProcedureDate11 = hi1104OtherProcedureDate11;
    }

    public HiOtherProcedureInfo withHi1104OtherProcedureDate11(String hi1104OtherProcedureDate11) {
        this.hi1104OtherProcedureDate11 = hi1104OtherProcedureDate11;
        return this;
    }

    @JsonProperty("hi12_otherProcedureInfo12")
    public String getHi12OtherProcedureInfo12() {
        return hi12OtherProcedureInfo12;
    }

    @JsonProperty("hi12_otherProcedureInfo12")
    public void setHi12OtherProcedureInfo12(String hi12OtherProcedureInfo12) {
        this.hi12OtherProcedureInfo12 = hi12OtherProcedureInfo12;
    }

    public HiOtherProcedureInfo withHi12OtherProcedureInfo12(String hi12OtherProcedureInfo12) {
        this.hi12OtherProcedureInfo12 = hi12OtherProcedureInfo12;
        return this;
    }

    @JsonProperty("hi12_01_otherProcedureInfoQlfr12")
    public String getHi1201OtherProcedureInfoQlfr12() {
        return hi1201OtherProcedureInfoQlfr12;
    }

    @JsonProperty("hi12_01_otherProcedureInfoQlfr12")
    public void setHi1201OtherProcedureInfoQlfr12(String hi1201OtherProcedureInfoQlfr12) {
        this.hi1201OtherProcedureInfoQlfr12 = hi1201OtherProcedureInfoQlfr12;
    }

    public HiOtherProcedureInfo withHi1201OtherProcedureInfoQlfr12(String hi1201OtherProcedureInfoQlfr12) {
        this.hi1201OtherProcedureInfoQlfr12 = hi1201OtherProcedureInfoQlfr12;
        return this;
    }

    @JsonProperty("hi12_02_otherProcedureCode12")
    public String getHi1202OtherProcedureCode12() {
        return hi1202OtherProcedureCode12;
    }

    @JsonProperty("hi12_02_otherProcedureCode12")
    public void setHi1202OtherProcedureCode12(String hi1202OtherProcedureCode12) {
        this.hi1202OtherProcedureCode12 = hi1202OtherProcedureCode12;
    }

    public HiOtherProcedureInfo withHi1202OtherProcedureCode12(String hi1202OtherProcedureCode12) {
        this.hi1202OtherProcedureCode12 = hi1202OtherProcedureCode12;
        return this;
    }

    @JsonProperty("hi12_03_otherProcedureDateFormatQlfr12")
    public String getHi1203OtherProcedureDateFormatQlfr12() {
        return hi1203OtherProcedureDateFormatQlfr12;
    }

    @JsonProperty("hi12_03_otherProcedureDateFormatQlfr12")
    public void setHi1203OtherProcedureDateFormatQlfr12(String hi1203OtherProcedureDateFormatQlfr12) {
        this.hi1203OtherProcedureDateFormatQlfr12 = hi1203OtherProcedureDateFormatQlfr12;
    }

    public HiOtherProcedureInfo withHi1203OtherProcedureDateFormatQlfr12(String hi1203OtherProcedureDateFormatQlfr12) {
        this.hi1203OtherProcedureDateFormatQlfr12 = hi1203OtherProcedureDateFormatQlfr12;
        return this;
    }

    @JsonProperty("hi12_04_otherProcedureDate12")
    public String getHi1204OtherProcedureDate12() {
        return hi1204OtherProcedureDate12;
    }

    @JsonProperty("hi12_04_otherProcedureDate12")
    public void setHi1204OtherProcedureDate12(String hi1204OtherProcedureDate12) {
        this.hi1204OtherProcedureDate12 = hi1204OtherProcedureDate12;
    }

    public HiOtherProcedureInfo withHi1204OtherProcedureDate12(String hi1204OtherProcedureDate12) {
        this.hi1204OtherProcedureDate12 = hi1204OtherProcedureDate12;
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

    public HiOtherProcedureInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hi01OtherProcedureInfo1).append(hi0101OtherProcedureInfoQlfr1).append(hi0102OtherProcedureCode1).append(hi0103OtherProcedureDateFormatQlfr1).append(hi0104OtherProcedureDate1).append(hi02OtherProcedureInfo2).append(hi0201OtherProcedureInfoQlfr2).append(hi0202OtherProcedureCode2).append(hi0203OtherProcedureDateFormatQlfr2).append(hi0204OtherProcedureDate2).append(hi03OtherProcedureInfo3).append(hi0301OtherProcedureInfoQlfr3).append(hi0302OtherProcedureCode3).append(hi0303OtherProcedureDateFormatQlfr3).append(hi0304OtherProcedureDate3).append(hi04OtherProcedureInfo4).append(hi0401OtherProcedureInfoQlfr4).append(hi0402OtherProcedureCode4).append(hi0403OtherProcedureDateFormatQlfr4).append(hi0404OtherProcedureDate4).append(hi05OtherProcedureInfo5).append(hi0501OtherProcedureInfoQlfr5).append(hi0502OtherProcedureCode5).append(hi0503OtherProcedureDateFormatQlfr5).append(hi0504OtherProcedureDate5).append(hi06OtherProcedureInfo6).append(hi0601OtherProcedureInfoQlfr6).append(hi0602OtherProcedureCode6).append(hi0603OtherProcedureDateFormatQlfr6).append(hi0604OtherProcedureDate6).append(hi07OtherProcedureInfo7).append(hi0701OtherProcedureInfoQlfr7).append(hi0702OtherProcedureCode7).append(hi0703OtherProcedureDateFormatQlfr7).append(hi0704OtherProcedureDate7).append(hi08OtherProcedureInfo8).append(hi0801OtherProcedureInfoQlfr8).append(hi0802OtherProcedureCode8).append(hi0803OtherProcedureDateFormatQlfr8).append(hi0804OtherProcedureDate8).append(hi09OtherProcedureInfo9).append(hi0901OtherProcedureInfoQlfr9).append(hi0902OtherProcedureCode9).append(hi0903OtherProcedureDateFormatQlfr9).append(hi0904OtherProcedureDate9).append(hi10OtherProcedureInfo10).append(hi1001OtherProcedureInfoQlfr10).append(hi1002OtherProcedureCode10).append(hi1003OtherProcedureDateFormatQlfr10).append(hi1004OtherProcedureDate10).append(hi11OtherProcedureInfo11).append(hi1101OtherProcedureInfoQlfr11).append(hi1102OtherProcedureCode11).append(hi1103OtherProcedureDateFormatQlfr11).append(hi1104OtherProcedureDate11).append(hi12OtherProcedureInfo12).append(hi1201OtherProcedureInfoQlfr12).append(hi1202OtherProcedureCode12).append(hi1203OtherProcedureDateFormatQlfr12).append(hi1204OtherProcedureDate12).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiOtherProcedureInfo) == false) {
            return false;
        }
        HiOtherProcedureInfo rhs = ((HiOtherProcedureInfo) other);
        return new EqualsBuilder().append(hi01OtherProcedureInfo1, rhs.hi01OtherProcedureInfo1).append(hi0101OtherProcedureInfoQlfr1, rhs.hi0101OtherProcedureInfoQlfr1).append(hi0102OtherProcedureCode1, rhs.hi0102OtherProcedureCode1).append(hi0103OtherProcedureDateFormatQlfr1, rhs.hi0103OtherProcedureDateFormatQlfr1).append(hi0104OtherProcedureDate1, rhs.hi0104OtherProcedureDate1).append(hi02OtherProcedureInfo2, rhs.hi02OtherProcedureInfo2).append(hi0201OtherProcedureInfoQlfr2, rhs.hi0201OtherProcedureInfoQlfr2).append(hi0202OtherProcedureCode2, rhs.hi0202OtherProcedureCode2).append(hi0203OtherProcedureDateFormatQlfr2, rhs.hi0203OtherProcedureDateFormatQlfr2).append(hi0204OtherProcedureDate2, rhs.hi0204OtherProcedureDate2).append(hi03OtherProcedureInfo3, rhs.hi03OtherProcedureInfo3).append(hi0301OtherProcedureInfoQlfr3, rhs.hi0301OtherProcedureInfoQlfr3).append(hi0302OtherProcedureCode3, rhs.hi0302OtherProcedureCode3).append(hi0303OtherProcedureDateFormatQlfr3, rhs.hi0303OtherProcedureDateFormatQlfr3).append(hi0304OtherProcedureDate3, rhs.hi0304OtherProcedureDate3).append(hi04OtherProcedureInfo4, rhs.hi04OtherProcedureInfo4).append(hi0401OtherProcedureInfoQlfr4, rhs.hi0401OtherProcedureInfoQlfr4).append(hi0402OtherProcedureCode4, rhs.hi0402OtherProcedureCode4).append(hi0403OtherProcedureDateFormatQlfr4, rhs.hi0403OtherProcedureDateFormatQlfr4).append(hi0404OtherProcedureDate4, rhs.hi0404OtherProcedureDate4).append(hi05OtherProcedureInfo5, rhs.hi05OtherProcedureInfo5).append(hi0501OtherProcedureInfoQlfr5, rhs.hi0501OtherProcedureInfoQlfr5).append(hi0502OtherProcedureCode5, rhs.hi0502OtherProcedureCode5).append(hi0503OtherProcedureDateFormatQlfr5, rhs.hi0503OtherProcedureDateFormatQlfr5).append(hi0504OtherProcedureDate5, rhs.hi0504OtherProcedureDate5).append(hi06OtherProcedureInfo6, rhs.hi06OtherProcedureInfo6).append(hi0601OtherProcedureInfoQlfr6, rhs.hi0601OtherProcedureInfoQlfr6).append(hi0602OtherProcedureCode6, rhs.hi0602OtherProcedureCode6).append(hi0603OtherProcedureDateFormatQlfr6, rhs.hi0603OtherProcedureDateFormatQlfr6).append(hi0604OtherProcedureDate6, rhs.hi0604OtherProcedureDate6).append(hi07OtherProcedureInfo7, rhs.hi07OtherProcedureInfo7).append(hi0701OtherProcedureInfoQlfr7, rhs.hi0701OtherProcedureInfoQlfr7).append(hi0702OtherProcedureCode7, rhs.hi0702OtherProcedureCode7).append(hi0703OtherProcedureDateFormatQlfr7, rhs.hi0703OtherProcedureDateFormatQlfr7).append(hi0704OtherProcedureDate7, rhs.hi0704OtherProcedureDate7).append(hi08OtherProcedureInfo8, rhs.hi08OtherProcedureInfo8).append(hi0801OtherProcedureInfoQlfr8, rhs.hi0801OtherProcedureInfoQlfr8).append(hi0802OtherProcedureCode8, rhs.hi0802OtherProcedureCode8).append(hi0803OtherProcedureDateFormatQlfr8, rhs.hi0803OtherProcedureDateFormatQlfr8).append(hi0804OtherProcedureDate8, rhs.hi0804OtherProcedureDate8).append(hi09OtherProcedureInfo9, rhs.hi09OtherProcedureInfo9).append(hi0901OtherProcedureInfoQlfr9, rhs.hi0901OtherProcedureInfoQlfr9).append(hi0902OtherProcedureCode9, rhs.hi0902OtherProcedureCode9).append(hi0903OtherProcedureDateFormatQlfr9, rhs.hi0903OtherProcedureDateFormatQlfr9).append(hi0904OtherProcedureDate9, rhs.hi0904OtherProcedureDate9).append(hi10OtherProcedureInfo10, rhs.hi10OtherProcedureInfo10).append(hi1001OtherProcedureInfoQlfr10, rhs.hi1001OtherProcedureInfoQlfr10).append(hi1002OtherProcedureCode10, rhs.hi1002OtherProcedureCode10).append(hi1003OtherProcedureDateFormatQlfr10, rhs.hi1003OtherProcedureDateFormatQlfr10).append(hi1004OtherProcedureDate10, rhs.hi1004OtherProcedureDate10).append(hi11OtherProcedureInfo11, rhs.hi11OtherProcedureInfo11).append(hi1101OtherProcedureInfoQlfr11, rhs.hi1101OtherProcedureInfoQlfr11).append(hi1102OtherProcedureCode11, rhs.hi1102OtherProcedureCode11).append(hi1103OtherProcedureDateFormatQlfr11, rhs.hi1103OtherProcedureDateFormatQlfr11).append(hi1104OtherProcedureDate11, rhs.hi1104OtherProcedureDate11).append(hi12OtherProcedureInfo12, rhs.hi12OtherProcedureInfo12).append(hi1201OtherProcedureInfoQlfr12, rhs.hi1201OtherProcedureInfoQlfr12).append(hi1202OtherProcedureCode12, rhs.hi1202OtherProcedureCode12).append(hi1203OtherProcedureDateFormatQlfr12, rhs.hi1203OtherProcedureDateFormatQlfr12).append(hi1204OtherProcedureDate12, rhs.hi1204OtherProcedureDate12).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

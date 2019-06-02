
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
    "hi01_treatmentCodeInfo1",
    "hi01_01_treatmentCodeInfoQlfr1",
    "hi01_02_treatmentCode1",
    "hi02_treatmentCodeInfo2",
    "hi02_01_treatmentCodeInfoQlfr2",
    "hi02_02_treatmentCode2",
    "hi03_treatmentCodeInfo3",
    "hi03_01_treatmentCodeInfoQlfr3",
    "hi03_02_treatmentCode3",
    "hi04_treatmentCodeInfo4",
    "hi04_01_treatmentCodeInfoQlfr4",
    "hi04_02_treatmentCode4",
    "hi05_treatmentCodeInfo5",
    "hi05_01_treatmentCodeInfoQlfr5",
    "hi05_02_treatmentCode5",
    "hi06_treatmentCodeInfo6",
    "hi06_01_treatmentCodeInfoQlfr6",
    "hi06_02_treatmentCode6",
    "hi07_treatmentCodeInfo7",
    "hi07_01_treatmentCodeInfoQlfr7",
    "hi07_02_treatmentCode7",
    "hi08_treatmentCodeInfo8",
    "hi08_01_treatmentCodeInfoQlfr8",
    "hi08_02_treatmentCode8",
    "hi09_treatmentCodeInfo9",
    "hi09_01_treatmentCodeInfoQlfr9",
    "hi09_02_treatmentCode9",
    "hi10_treatmentCodeInfo10",
    "hi10_01_treatmentCodeInfoQlfr10",
    "hi10_02_treatmentCode10",
    "hi11_treatmentCodeInfo11",
    "hi11_01_treatmentCodeInfoQlfr11",
    "hi11_02_treatmentCode11",
    "hi12_treatmentCodeInfo12",
    "hi12_01_treatmentCodeInfoQlfr12",
    "hi12_02_treatmentCode12"
})
public class HiTreatmentCodeInfo {

    @JsonProperty("hi01_treatmentCodeInfo1")
    private String hi01TreatmentCodeInfo1;
    @JsonProperty("hi01_01_treatmentCodeInfoQlfr1")
    private String hi0101TreatmentCodeInfoQlfr1;
    @JsonProperty("hi01_02_treatmentCode1")
    private String hi0102TreatmentCode1;
    @JsonProperty("hi02_treatmentCodeInfo2")
    private String hi02TreatmentCodeInfo2;
    @JsonProperty("hi02_01_treatmentCodeInfoQlfr2")
    private String hi0201TreatmentCodeInfoQlfr2;
    @JsonProperty("hi02_02_treatmentCode2")
    private String hi0202TreatmentCode2;
    @JsonProperty("hi03_treatmentCodeInfo3")
    private String hi03TreatmentCodeInfo3;
    @JsonProperty("hi03_01_treatmentCodeInfoQlfr3")
    private String hi0301TreatmentCodeInfoQlfr3;
    @JsonProperty("hi03_02_treatmentCode3")
    private String hi0302TreatmentCode3;
    @JsonProperty("hi04_treatmentCodeInfo4")
    private String hi04TreatmentCodeInfo4;
    @JsonProperty("hi04_01_treatmentCodeInfoQlfr4")
    private String hi0401TreatmentCodeInfoQlfr4;
    @JsonProperty("hi04_02_treatmentCode4")
    private String hi0402TreatmentCode4;
    @JsonProperty("hi05_treatmentCodeInfo5")
    private String hi05TreatmentCodeInfo5;
    @JsonProperty("hi05_01_treatmentCodeInfoQlfr5")
    private String hi0501TreatmentCodeInfoQlfr5;
    @JsonProperty("hi05_02_treatmentCode5")
    private String hi0502TreatmentCode5;
    @JsonProperty("hi06_treatmentCodeInfo6")
    private String hi06TreatmentCodeInfo6;
    @JsonProperty("hi06_01_treatmentCodeInfoQlfr6")
    private String hi0601TreatmentCodeInfoQlfr6;
    @JsonProperty("hi06_02_treatmentCode6")
    private String hi0602TreatmentCode6;
    @JsonProperty("hi07_treatmentCodeInfo7")
    private String hi07TreatmentCodeInfo7;
    @JsonProperty("hi07_01_treatmentCodeInfoQlfr7")
    private String hi0701TreatmentCodeInfoQlfr7;
    @JsonProperty("hi07_02_treatmentCode7")
    private String hi0702TreatmentCode7;
    @JsonProperty("hi08_treatmentCodeInfo8")
    private String hi08TreatmentCodeInfo8;
    @JsonProperty("hi08_01_treatmentCodeInfoQlfr8")
    private String hi0801TreatmentCodeInfoQlfr8;
    @JsonProperty("hi08_02_treatmentCode8")
    private String hi0802TreatmentCode8;
    @JsonProperty("hi09_treatmentCodeInfo9")
    private String hi09TreatmentCodeInfo9;
    @JsonProperty("hi09_01_treatmentCodeInfoQlfr9")
    private String hi0901TreatmentCodeInfoQlfr9;
    @JsonProperty("hi09_02_treatmentCode9")
    private String hi0902TreatmentCode9;
    @JsonProperty("hi10_treatmentCodeInfo10")
    private String hi10TreatmentCodeInfo10;
    @JsonProperty("hi10_01_treatmentCodeInfoQlfr10")
    private String hi1001TreatmentCodeInfoQlfr10;
    @JsonProperty("hi10_02_treatmentCode10")
    private String hi1002TreatmentCode10;
    @JsonProperty("hi11_treatmentCodeInfo11")
    private String hi11TreatmentCodeInfo11;
    @JsonProperty("hi11_01_treatmentCodeInfoQlfr11")
    private String hi1101TreatmentCodeInfoQlfr11;
    @JsonProperty("hi11_02_treatmentCode11")
    private String hi1102TreatmentCode11;
    @JsonProperty("hi12_treatmentCodeInfo12")
    private String hi12TreatmentCodeInfo12;
    @JsonProperty("hi12_01_treatmentCodeInfoQlfr12")
    private String hi1201TreatmentCodeInfoQlfr12;
    @JsonProperty("hi12_02_treatmentCode12")
    private String hi1202TreatmentCode12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hi01_treatmentCodeInfo1")
    public String getHi01TreatmentCodeInfo1() {
        return hi01TreatmentCodeInfo1;
    }

    @JsonProperty("hi01_treatmentCodeInfo1")
    public void setHi01TreatmentCodeInfo1(String hi01TreatmentCodeInfo1) {
        this.hi01TreatmentCodeInfo1 = hi01TreatmentCodeInfo1;
    }

    public HiTreatmentCodeInfo withHi01TreatmentCodeInfo1(String hi01TreatmentCodeInfo1) {
        this.hi01TreatmentCodeInfo1 = hi01TreatmentCodeInfo1;
        return this;
    }

    @JsonProperty("hi01_01_treatmentCodeInfoQlfr1")
    public String getHi0101TreatmentCodeInfoQlfr1() {
        return hi0101TreatmentCodeInfoQlfr1;
    }

    @JsonProperty("hi01_01_treatmentCodeInfoQlfr1")
    public void setHi0101TreatmentCodeInfoQlfr1(String hi0101TreatmentCodeInfoQlfr1) {
        this.hi0101TreatmentCodeInfoQlfr1 = hi0101TreatmentCodeInfoQlfr1;
    }

    public HiTreatmentCodeInfo withHi0101TreatmentCodeInfoQlfr1(String hi0101TreatmentCodeInfoQlfr1) {
        this.hi0101TreatmentCodeInfoQlfr1 = hi0101TreatmentCodeInfoQlfr1;
        return this;
    }

    @JsonProperty("hi01_02_treatmentCode1")
    public String getHi0102TreatmentCode1() {
        return hi0102TreatmentCode1;
    }

    @JsonProperty("hi01_02_treatmentCode1")
    public void setHi0102TreatmentCode1(String hi0102TreatmentCode1) {
        this.hi0102TreatmentCode1 = hi0102TreatmentCode1;
    }

    public HiTreatmentCodeInfo withHi0102TreatmentCode1(String hi0102TreatmentCode1) {
        this.hi0102TreatmentCode1 = hi0102TreatmentCode1;
        return this;
    }

    @JsonProperty("hi02_treatmentCodeInfo2")
    public String getHi02TreatmentCodeInfo2() {
        return hi02TreatmentCodeInfo2;
    }

    @JsonProperty("hi02_treatmentCodeInfo2")
    public void setHi02TreatmentCodeInfo2(String hi02TreatmentCodeInfo2) {
        this.hi02TreatmentCodeInfo2 = hi02TreatmentCodeInfo2;
    }

    public HiTreatmentCodeInfo withHi02TreatmentCodeInfo2(String hi02TreatmentCodeInfo2) {
        this.hi02TreatmentCodeInfo2 = hi02TreatmentCodeInfo2;
        return this;
    }

    @JsonProperty("hi02_01_treatmentCodeInfoQlfr2")
    public String getHi0201TreatmentCodeInfoQlfr2() {
        return hi0201TreatmentCodeInfoQlfr2;
    }

    @JsonProperty("hi02_01_treatmentCodeInfoQlfr2")
    public void setHi0201TreatmentCodeInfoQlfr2(String hi0201TreatmentCodeInfoQlfr2) {
        this.hi0201TreatmentCodeInfoQlfr2 = hi0201TreatmentCodeInfoQlfr2;
    }

    public HiTreatmentCodeInfo withHi0201TreatmentCodeInfoQlfr2(String hi0201TreatmentCodeInfoQlfr2) {
        this.hi0201TreatmentCodeInfoQlfr2 = hi0201TreatmentCodeInfoQlfr2;
        return this;
    }

    @JsonProperty("hi02_02_treatmentCode2")
    public String getHi0202TreatmentCode2() {
        return hi0202TreatmentCode2;
    }

    @JsonProperty("hi02_02_treatmentCode2")
    public void setHi0202TreatmentCode2(String hi0202TreatmentCode2) {
        this.hi0202TreatmentCode2 = hi0202TreatmentCode2;
    }

    public HiTreatmentCodeInfo withHi0202TreatmentCode2(String hi0202TreatmentCode2) {
        this.hi0202TreatmentCode2 = hi0202TreatmentCode2;
        return this;
    }

    @JsonProperty("hi03_treatmentCodeInfo3")
    public String getHi03TreatmentCodeInfo3() {
        return hi03TreatmentCodeInfo3;
    }

    @JsonProperty("hi03_treatmentCodeInfo3")
    public void setHi03TreatmentCodeInfo3(String hi03TreatmentCodeInfo3) {
        this.hi03TreatmentCodeInfo3 = hi03TreatmentCodeInfo3;
    }

    public HiTreatmentCodeInfo withHi03TreatmentCodeInfo3(String hi03TreatmentCodeInfo3) {
        this.hi03TreatmentCodeInfo3 = hi03TreatmentCodeInfo3;
        return this;
    }

    @JsonProperty("hi03_01_treatmentCodeInfoQlfr3")
    public String getHi0301TreatmentCodeInfoQlfr3() {
        return hi0301TreatmentCodeInfoQlfr3;
    }

    @JsonProperty("hi03_01_treatmentCodeInfoQlfr3")
    public void setHi0301TreatmentCodeInfoQlfr3(String hi0301TreatmentCodeInfoQlfr3) {
        this.hi0301TreatmentCodeInfoQlfr3 = hi0301TreatmentCodeInfoQlfr3;
    }

    public HiTreatmentCodeInfo withHi0301TreatmentCodeInfoQlfr3(String hi0301TreatmentCodeInfoQlfr3) {
        this.hi0301TreatmentCodeInfoQlfr3 = hi0301TreatmentCodeInfoQlfr3;
        return this;
    }

    @JsonProperty("hi03_02_treatmentCode3")
    public String getHi0302TreatmentCode3() {
        return hi0302TreatmentCode3;
    }

    @JsonProperty("hi03_02_treatmentCode3")
    public void setHi0302TreatmentCode3(String hi0302TreatmentCode3) {
        this.hi0302TreatmentCode3 = hi0302TreatmentCode3;
    }

    public HiTreatmentCodeInfo withHi0302TreatmentCode3(String hi0302TreatmentCode3) {
        this.hi0302TreatmentCode3 = hi0302TreatmentCode3;
        return this;
    }

    @JsonProperty("hi04_treatmentCodeInfo4")
    public String getHi04TreatmentCodeInfo4() {
        return hi04TreatmentCodeInfo4;
    }

    @JsonProperty("hi04_treatmentCodeInfo4")
    public void setHi04TreatmentCodeInfo4(String hi04TreatmentCodeInfo4) {
        this.hi04TreatmentCodeInfo4 = hi04TreatmentCodeInfo4;
    }

    public HiTreatmentCodeInfo withHi04TreatmentCodeInfo4(String hi04TreatmentCodeInfo4) {
        this.hi04TreatmentCodeInfo4 = hi04TreatmentCodeInfo4;
        return this;
    }

    @JsonProperty("hi04_01_treatmentCodeInfoQlfr4")
    public String getHi0401TreatmentCodeInfoQlfr4() {
        return hi0401TreatmentCodeInfoQlfr4;
    }

    @JsonProperty("hi04_01_treatmentCodeInfoQlfr4")
    public void setHi0401TreatmentCodeInfoQlfr4(String hi0401TreatmentCodeInfoQlfr4) {
        this.hi0401TreatmentCodeInfoQlfr4 = hi0401TreatmentCodeInfoQlfr4;
    }

    public HiTreatmentCodeInfo withHi0401TreatmentCodeInfoQlfr4(String hi0401TreatmentCodeInfoQlfr4) {
        this.hi0401TreatmentCodeInfoQlfr4 = hi0401TreatmentCodeInfoQlfr4;
        return this;
    }

    @JsonProperty("hi04_02_treatmentCode4")
    public String getHi0402TreatmentCode4() {
        return hi0402TreatmentCode4;
    }

    @JsonProperty("hi04_02_treatmentCode4")
    public void setHi0402TreatmentCode4(String hi0402TreatmentCode4) {
        this.hi0402TreatmentCode4 = hi0402TreatmentCode4;
    }

    public HiTreatmentCodeInfo withHi0402TreatmentCode4(String hi0402TreatmentCode4) {
        this.hi0402TreatmentCode4 = hi0402TreatmentCode4;
        return this;
    }

    @JsonProperty("hi05_treatmentCodeInfo5")
    public String getHi05TreatmentCodeInfo5() {
        return hi05TreatmentCodeInfo5;
    }

    @JsonProperty("hi05_treatmentCodeInfo5")
    public void setHi05TreatmentCodeInfo5(String hi05TreatmentCodeInfo5) {
        this.hi05TreatmentCodeInfo5 = hi05TreatmentCodeInfo5;
    }

    public HiTreatmentCodeInfo withHi05TreatmentCodeInfo5(String hi05TreatmentCodeInfo5) {
        this.hi05TreatmentCodeInfo5 = hi05TreatmentCodeInfo5;
        return this;
    }

    @JsonProperty("hi05_01_treatmentCodeInfoQlfr5")
    public String getHi0501TreatmentCodeInfoQlfr5() {
        return hi0501TreatmentCodeInfoQlfr5;
    }

    @JsonProperty("hi05_01_treatmentCodeInfoQlfr5")
    public void setHi0501TreatmentCodeInfoQlfr5(String hi0501TreatmentCodeInfoQlfr5) {
        this.hi0501TreatmentCodeInfoQlfr5 = hi0501TreatmentCodeInfoQlfr5;
    }

    public HiTreatmentCodeInfo withHi0501TreatmentCodeInfoQlfr5(String hi0501TreatmentCodeInfoQlfr5) {
        this.hi0501TreatmentCodeInfoQlfr5 = hi0501TreatmentCodeInfoQlfr5;
        return this;
    }

    @JsonProperty("hi05_02_treatmentCode5")
    public String getHi0502TreatmentCode5() {
        return hi0502TreatmentCode5;
    }

    @JsonProperty("hi05_02_treatmentCode5")
    public void setHi0502TreatmentCode5(String hi0502TreatmentCode5) {
        this.hi0502TreatmentCode5 = hi0502TreatmentCode5;
    }

    public HiTreatmentCodeInfo withHi0502TreatmentCode5(String hi0502TreatmentCode5) {
        this.hi0502TreatmentCode5 = hi0502TreatmentCode5;
        return this;
    }

    @JsonProperty("hi06_treatmentCodeInfo6")
    public String getHi06TreatmentCodeInfo6() {
        return hi06TreatmentCodeInfo6;
    }

    @JsonProperty("hi06_treatmentCodeInfo6")
    public void setHi06TreatmentCodeInfo6(String hi06TreatmentCodeInfo6) {
        this.hi06TreatmentCodeInfo6 = hi06TreatmentCodeInfo6;
    }

    public HiTreatmentCodeInfo withHi06TreatmentCodeInfo6(String hi06TreatmentCodeInfo6) {
        this.hi06TreatmentCodeInfo6 = hi06TreatmentCodeInfo6;
        return this;
    }

    @JsonProperty("hi06_01_treatmentCodeInfoQlfr6")
    public String getHi0601TreatmentCodeInfoQlfr6() {
        return hi0601TreatmentCodeInfoQlfr6;
    }

    @JsonProperty("hi06_01_treatmentCodeInfoQlfr6")
    public void setHi0601TreatmentCodeInfoQlfr6(String hi0601TreatmentCodeInfoQlfr6) {
        this.hi0601TreatmentCodeInfoQlfr6 = hi0601TreatmentCodeInfoQlfr6;
    }

    public HiTreatmentCodeInfo withHi0601TreatmentCodeInfoQlfr6(String hi0601TreatmentCodeInfoQlfr6) {
        this.hi0601TreatmentCodeInfoQlfr6 = hi0601TreatmentCodeInfoQlfr6;
        return this;
    }

    @JsonProperty("hi06_02_treatmentCode6")
    public String getHi0602TreatmentCode6() {
        return hi0602TreatmentCode6;
    }

    @JsonProperty("hi06_02_treatmentCode6")
    public void setHi0602TreatmentCode6(String hi0602TreatmentCode6) {
        this.hi0602TreatmentCode6 = hi0602TreatmentCode6;
    }

    public HiTreatmentCodeInfo withHi0602TreatmentCode6(String hi0602TreatmentCode6) {
        this.hi0602TreatmentCode6 = hi0602TreatmentCode6;
        return this;
    }

    @JsonProperty("hi07_treatmentCodeInfo7")
    public String getHi07TreatmentCodeInfo7() {
        return hi07TreatmentCodeInfo7;
    }

    @JsonProperty("hi07_treatmentCodeInfo7")
    public void setHi07TreatmentCodeInfo7(String hi07TreatmentCodeInfo7) {
        this.hi07TreatmentCodeInfo7 = hi07TreatmentCodeInfo7;
    }

    public HiTreatmentCodeInfo withHi07TreatmentCodeInfo7(String hi07TreatmentCodeInfo7) {
        this.hi07TreatmentCodeInfo7 = hi07TreatmentCodeInfo7;
        return this;
    }

    @JsonProperty("hi07_01_treatmentCodeInfoQlfr7")
    public String getHi0701TreatmentCodeInfoQlfr7() {
        return hi0701TreatmentCodeInfoQlfr7;
    }

    @JsonProperty("hi07_01_treatmentCodeInfoQlfr7")
    public void setHi0701TreatmentCodeInfoQlfr7(String hi0701TreatmentCodeInfoQlfr7) {
        this.hi0701TreatmentCodeInfoQlfr7 = hi0701TreatmentCodeInfoQlfr7;
    }

    public HiTreatmentCodeInfo withHi0701TreatmentCodeInfoQlfr7(String hi0701TreatmentCodeInfoQlfr7) {
        this.hi0701TreatmentCodeInfoQlfr7 = hi0701TreatmentCodeInfoQlfr7;
        return this;
    }

    @JsonProperty("hi07_02_treatmentCode7")
    public String getHi0702TreatmentCode7() {
        return hi0702TreatmentCode7;
    }

    @JsonProperty("hi07_02_treatmentCode7")
    public void setHi0702TreatmentCode7(String hi0702TreatmentCode7) {
        this.hi0702TreatmentCode7 = hi0702TreatmentCode7;
    }

    public HiTreatmentCodeInfo withHi0702TreatmentCode7(String hi0702TreatmentCode7) {
        this.hi0702TreatmentCode7 = hi0702TreatmentCode7;
        return this;
    }

    @JsonProperty("hi08_treatmentCodeInfo8")
    public String getHi08TreatmentCodeInfo8() {
        return hi08TreatmentCodeInfo8;
    }

    @JsonProperty("hi08_treatmentCodeInfo8")
    public void setHi08TreatmentCodeInfo8(String hi08TreatmentCodeInfo8) {
        this.hi08TreatmentCodeInfo8 = hi08TreatmentCodeInfo8;
    }

    public HiTreatmentCodeInfo withHi08TreatmentCodeInfo8(String hi08TreatmentCodeInfo8) {
        this.hi08TreatmentCodeInfo8 = hi08TreatmentCodeInfo8;
        return this;
    }

    @JsonProperty("hi08_01_treatmentCodeInfoQlfr8")
    public String getHi0801TreatmentCodeInfoQlfr8() {
        return hi0801TreatmentCodeInfoQlfr8;
    }

    @JsonProperty("hi08_01_treatmentCodeInfoQlfr8")
    public void setHi0801TreatmentCodeInfoQlfr8(String hi0801TreatmentCodeInfoQlfr8) {
        this.hi0801TreatmentCodeInfoQlfr8 = hi0801TreatmentCodeInfoQlfr8;
    }

    public HiTreatmentCodeInfo withHi0801TreatmentCodeInfoQlfr8(String hi0801TreatmentCodeInfoQlfr8) {
        this.hi0801TreatmentCodeInfoQlfr8 = hi0801TreatmentCodeInfoQlfr8;
        return this;
    }

    @JsonProperty("hi08_02_treatmentCode8")
    public String getHi0802TreatmentCode8() {
        return hi0802TreatmentCode8;
    }

    @JsonProperty("hi08_02_treatmentCode8")
    public void setHi0802TreatmentCode8(String hi0802TreatmentCode8) {
        this.hi0802TreatmentCode8 = hi0802TreatmentCode8;
    }

    public HiTreatmentCodeInfo withHi0802TreatmentCode8(String hi0802TreatmentCode8) {
        this.hi0802TreatmentCode8 = hi0802TreatmentCode8;
        return this;
    }

    @JsonProperty("hi09_treatmentCodeInfo9")
    public String getHi09TreatmentCodeInfo9() {
        return hi09TreatmentCodeInfo9;
    }

    @JsonProperty("hi09_treatmentCodeInfo9")
    public void setHi09TreatmentCodeInfo9(String hi09TreatmentCodeInfo9) {
        this.hi09TreatmentCodeInfo9 = hi09TreatmentCodeInfo9;
    }

    public HiTreatmentCodeInfo withHi09TreatmentCodeInfo9(String hi09TreatmentCodeInfo9) {
        this.hi09TreatmentCodeInfo9 = hi09TreatmentCodeInfo9;
        return this;
    }

    @JsonProperty("hi09_01_treatmentCodeInfoQlfr9")
    public String getHi0901TreatmentCodeInfoQlfr9() {
        return hi0901TreatmentCodeInfoQlfr9;
    }

    @JsonProperty("hi09_01_treatmentCodeInfoQlfr9")
    public void setHi0901TreatmentCodeInfoQlfr9(String hi0901TreatmentCodeInfoQlfr9) {
        this.hi0901TreatmentCodeInfoQlfr9 = hi0901TreatmentCodeInfoQlfr9;
    }

    public HiTreatmentCodeInfo withHi0901TreatmentCodeInfoQlfr9(String hi0901TreatmentCodeInfoQlfr9) {
        this.hi0901TreatmentCodeInfoQlfr9 = hi0901TreatmentCodeInfoQlfr9;
        return this;
    }

    @JsonProperty("hi09_02_treatmentCode9")
    public String getHi0902TreatmentCode9() {
        return hi0902TreatmentCode9;
    }

    @JsonProperty("hi09_02_treatmentCode9")
    public void setHi0902TreatmentCode9(String hi0902TreatmentCode9) {
        this.hi0902TreatmentCode9 = hi0902TreatmentCode9;
    }

    public HiTreatmentCodeInfo withHi0902TreatmentCode9(String hi0902TreatmentCode9) {
        this.hi0902TreatmentCode9 = hi0902TreatmentCode9;
        return this;
    }

    @JsonProperty("hi10_treatmentCodeInfo10")
    public String getHi10TreatmentCodeInfo10() {
        return hi10TreatmentCodeInfo10;
    }

    @JsonProperty("hi10_treatmentCodeInfo10")
    public void setHi10TreatmentCodeInfo10(String hi10TreatmentCodeInfo10) {
        this.hi10TreatmentCodeInfo10 = hi10TreatmentCodeInfo10;
    }

    public HiTreatmentCodeInfo withHi10TreatmentCodeInfo10(String hi10TreatmentCodeInfo10) {
        this.hi10TreatmentCodeInfo10 = hi10TreatmentCodeInfo10;
        return this;
    }

    @JsonProperty("hi10_01_treatmentCodeInfoQlfr10")
    public String getHi1001TreatmentCodeInfoQlfr10() {
        return hi1001TreatmentCodeInfoQlfr10;
    }

    @JsonProperty("hi10_01_treatmentCodeInfoQlfr10")
    public void setHi1001TreatmentCodeInfoQlfr10(String hi1001TreatmentCodeInfoQlfr10) {
        this.hi1001TreatmentCodeInfoQlfr10 = hi1001TreatmentCodeInfoQlfr10;
    }

    public HiTreatmentCodeInfo withHi1001TreatmentCodeInfoQlfr10(String hi1001TreatmentCodeInfoQlfr10) {
        this.hi1001TreatmentCodeInfoQlfr10 = hi1001TreatmentCodeInfoQlfr10;
        return this;
    }

    @JsonProperty("hi10_02_treatmentCode10")
    public String getHi1002TreatmentCode10() {
        return hi1002TreatmentCode10;
    }

    @JsonProperty("hi10_02_treatmentCode10")
    public void setHi1002TreatmentCode10(String hi1002TreatmentCode10) {
        this.hi1002TreatmentCode10 = hi1002TreatmentCode10;
    }

    public HiTreatmentCodeInfo withHi1002TreatmentCode10(String hi1002TreatmentCode10) {
        this.hi1002TreatmentCode10 = hi1002TreatmentCode10;
        return this;
    }

    @JsonProperty("hi11_treatmentCodeInfo11")
    public String getHi11TreatmentCodeInfo11() {
        return hi11TreatmentCodeInfo11;
    }

    @JsonProperty("hi11_treatmentCodeInfo11")
    public void setHi11TreatmentCodeInfo11(String hi11TreatmentCodeInfo11) {
        this.hi11TreatmentCodeInfo11 = hi11TreatmentCodeInfo11;
    }

    public HiTreatmentCodeInfo withHi11TreatmentCodeInfo11(String hi11TreatmentCodeInfo11) {
        this.hi11TreatmentCodeInfo11 = hi11TreatmentCodeInfo11;
        return this;
    }

    @JsonProperty("hi11_01_treatmentCodeInfoQlfr11")
    public String getHi1101TreatmentCodeInfoQlfr11() {
        return hi1101TreatmentCodeInfoQlfr11;
    }

    @JsonProperty("hi11_01_treatmentCodeInfoQlfr11")
    public void setHi1101TreatmentCodeInfoQlfr11(String hi1101TreatmentCodeInfoQlfr11) {
        this.hi1101TreatmentCodeInfoQlfr11 = hi1101TreatmentCodeInfoQlfr11;
    }

    public HiTreatmentCodeInfo withHi1101TreatmentCodeInfoQlfr11(String hi1101TreatmentCodeInfoQlfr11) {
        this.hi1101TreatmentCodeInfoQlfr11 = hi1101TreatmentCodeInfoQlfr11;
        return this;
    }

    @JsonProperty("hi11_02_treatmentCode11")
    public String getHi1102TreatmentCode11() {
        return hi1102TreatmentCode11;
    }

    @JsonProperty("hi11_02_treatmentCode11")
    public void setHi1102TreatmentCode11(String hi1102TreatmentCode11) {
        this.hi1102TreatmentCode11 = hi1102TreatmentCode11;
    }

    public HiTreatmentCodeInfo withHi1102TreatmentCode11(String hi1102TreatmentCode11) {
        this.hi1102TreatmentCode11 = hi1102TreatmentCode11;
        return this;
    }

    @JsonProperty("hi12_treatmentCodeInfo12")
    public String getHi12TreatmentCodeInfo12() {
        return hi12TreatmentCodeInfo12;
    }

    @JsonProperty("hi12_treatmentCodeInfo12")
    public void setHi12TreatmentCodeInfo12(String hi12TreatmentCodeInfo12) {
        this.hi12TreatmentCodeInfo12 = hi12TreatmentCodeInfo12;
    }

    public HiTreatmentCodeInfo withHi12TreatmentCodeInfo12(String hi12TreatmentCodeInfo12) {
        this.hi12TreatmentCodeInfo12 = hi12TreatmentCodeInfo12;
        return this;
    }

    @JsonProperty("hi12_01_treatmentCodeInfoQlfr12")
    public String getHi1201TreatmentCodeInfoQlfr12() {
        return hi1201TreatmentCodeInfoQlfr12;
    }

    @JsonProperty("hi12_01_treatmentCodeInfoQlfr12")
    public void setHi1201TreatmentCodeInfoQlfr12(String hi1201TreatmentCodeInfoQlfr12) {
        this.hi1201TreatmentCodeInfoQlfr12 = hi1201TreatmentCodeInfoQlfr12;
    }

    public HiTreatmentCodeInfo withHi1201TreatmentCodeInfoQlfr12(String hi1201TreatmentCodeInfoQlfr12) {
        this.hi1201TreatmentCodeInfoQlfr12 = hi1201TreatmentCodeInfoQlfr12;
        return this;
    }

    @JsonProperty("hi12_02_treatmentCode12")
    public String getHi1202TreatmentCode12() {
        return hi1202TreatmentCode12;
    }

    @JsonProperty("hi12_02_treatmentCode12")
    public void setHi1202TreatmentCode12(String hi1202TreatmentCode12) {
        this.hi1202TreatmentCode12 = hi1202TreatmentCode12;
    }

    public HiTreatmentCodeInfo withHi1202TreatmentCode12(String hi1202TreatmentCode12) {
        this.hi1202TreatmentCode12 = hi1202TreatmentCode12;
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

    public HiTreatmentCodeInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hi01TreatmentCodeInfo1).append(hi0101TreatmentCodeInfoQlfr1).append(hi0102TreatmentCode1).append(hi02TreatmentCodeInfo2).append(hi0201TreatmentCodeInfoQlfr2).append(hi0202TreatmentCode2).append(hi03TreatmentCodeInfo3).append(hi0301TreatmentCodeInfoQlfr3).append(hi0302TreatmentCode3).append(hi04TreatmentCodeInfo4).append(hi0401TreatmentCodeInfoQlfr4).append(hi0402TreatmentCode4).append(hi05TreatmentCodeInfo5).append(hi0501TreatmentCodeInfoQlfr5).append(hi0502TreatmentCode5).append(hi06TreatmentCodeInfo6).append(hi0601TreatmentCodeInfoQlfr6).append(hi0602TreatmentCode6).append(hi07TreatmentCodeInfo7).append(hi0701TreatmentCodeInfoQlfr7).append(hi0702TreatmentCode7).append(hi08TreatmentCodeInfo8).append(hi0801TreatmentCodeInfoQlfr8).append(hi0802TreatmentCode8).append(hi09TreatmentCodeInfo9).append(hi0901TreatmentCodeInfoQlfr9).append(hi0902TreatmentCode9).append(hi10TreatmentCodeInfo10).append(hi1001TreatmentCodeInfoQlfr10).append(hi1002TreatmentCode10).append(hi11TreatmentCodeInfo11).append(hi1101TreatmentCodeInfoQlfr11).append(hi1102TreatmentCode11).append(hi12TreatmentCodeInfo12).append(hi1201TreatmentCodeInfoQlfr12).append(hi1202TreatmentCode12).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiTreatmentCodeInfo) == false) {
            return false;
        }
        HiTreatmentCodeInfo rhs = ((HiTreatmentCodeInfo) other);
        return new EqualsBuilder().append(hi01TreatmentCodeInfo1, rhs.hi01TreatmentCodeInfo1).append(hi0101TreatmentCodeInfoQlfr1, rhs.hi0101TreatmentCodeInfoQlfr1).append(hi0102TreatmentCode1, rhs.hi0102TreatmentCode1).append(hi02TreatmentCodeInfo2, rhs.hi02TreatmentCodeInfo2).append(hi0201TreatmentCodeInfoQlfr2, rhs.hi0201TreatmentCodeInfoQlfr2).append(hi0202TreatmentCode2, rhs.hi0202TreatmentCode2).append(hi03TreatmentCodeInfo3, rhs.hi03TreatmentCodeInfo3).append(hi0301TreatmentCodeInfoQlfr3, rhs.hi0301TreatmentCodeInfoQlfr3).append(hi0302TreatmentCode3, rhs.hi0302TreatmentCode3).append(hi04TreatmentCodeInfo4, rhs.hi04TreatmentCodeInfo4).append(hi0401TreatmentCodeInfoQlfr4, rhs.hi0401TreatmentCodeInfoQlfr4).append(hi0402TreatmentCode4, rhs.hi0402TreatmentCode4).append(hi05TreatmentCodeInfo5, rhs.hi05TreatmentCodeInfo5).append(hi0501TreatmentCodeInfoQlfr5, rhs.hi0501TreatmentCodeInfoQlfr5).append(hi0502TreatmentCode5, rhs.hi0502TreatmentCode5).append(hi06TreatmentCodeInfo6, rhs.hi06TreatmentCodeInfo6).append(hi0601TreatmentCodeInfoQlfr6, rhs.hi0601TreatmentCodeInfoQlfr6).append(hi0602TreatmentCode6, rhs.hi0602TreatmentCode6).append(hi07TreatmentCodeInfo7, rhs.hi07TreatmentCodeInfo7).append(hi0701TreatmentCodeInfoQlfr7, rhs.hi0701TreatmentCodeInfoQlfr7).append(hi0702TreatmentCode7, rhs.hi0702TreatmentCode7).append(hi08TreatmentCodeInfo8, rhs.hi08TreatmentCodeInfo8).append(hi0801TreatmentCodeInfoQlfr8, rhs.hi0801TreatmentCodeInfoQlfr8).append(hi0802TreatmentCode8, rhs.hi0802TreatmentCode8).append(hi09TreatmentCodeInfo9, rhs.hi09TreatmentCodeInfo9).append(hi0901TreatmentCodeInfoQlfr9, rhs.hi0901TreatmentCodeInfoQlfr9).append(hi0902TreatmentCode9, rhs.hi0902TreatmentCode9).append(hi10TreatmentCodeInfo10, rhs.hi10TreatmentCodeInfo10).append(hi1001TreatmentCodeInfoQlfr10, rhs.hi1001TreatmentCodeInfoQlfr10).append(hi1002TreatmentCode10, rhs.hi1002TreatmentCode10).append(hi11TreatmentCodeInfo11, rhs.hi11TreatmentCodeInfo11).append(hi1101TreatmentCodeInfoQlfr11, rhs.hi1101TreatmentCodeInfoQlfr11).append(hi1102TreatmentCode11, rhs.hi1102TreatmentCode11).append(hi12TreatmentCodeInfo12, rhs.hi12TreatmentCodeInfo12).append(hi1201TreatmentCodeInfoQlfr12, rhs.hi1201TreatmentCodeInfoQlfr12).append(hi1202TreatmentCode12, rhs.hi1202TreatmentCode12).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

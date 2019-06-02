
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
    "hi01_conditionCode1",
    "hi01_01_conditionCode1",
    "hi01_02_conditionCode1",
    "hi02_conditionCode2",
    "hi02_01_conditionCode2",
    "hi02_02_conditionCode2",
    "hi03_conditionCode3",
    "hi03_01_conditionCode3",
    "hi03_02_conditionCode3",
    "hi04_conditionCode4",
    "hi04_01_conditionCode4",
    "hi04_02_conditionCode4",
    "hi05_conditionCode5",
    "hi05_01_conditionCode5",
    "hi05_02_conditionCode5",
    "hi06_conditionCode6",
    "hi06_01_conditionCode6",
    "hi06_02_conditionCode6",
    "hi07_conditionCode7",
    "hi07_01_conditionCode7",
    "hi07_02_conditionCode7",
    "hi08_conditionCode8",
    "hi08_01_conditionCode8",
    "hi08_02_conditionCode8",
    "hi09_conditionCode9",
    "hi09_01_conditionCode9",
    "hi09_02_conditionCode9",
    "hi10_conditionCode10",
    "hi10_01_conditionCode10",
    "hi10_02_conditionCode10",
    "hi11_conditionCode11",
    "hi11_01_conditionCode11",
    "hi11_02_conditionCode11",
    "hi12_conditionCode12",
    "hi12_01_conditionCode12",
    "hi12_02_conditionCode12"
})
public class HiConditionCode {

    @JsonProperty("hi01_conditionCode1")
    private String hi01ConditionCode1;
    @JsonProperty("hi01_01_conditionCode1")
    private String hi0101ConditionCode1;
    @JsonProperty("hi01_02_conditionCode1")
    private String hi0102ConditionCode1;
    @JsonProperty("hi02_conditionCode2")
    private String hi02ConditionCode2;
    @JsonProperty("hi02_01_conditionCode2")
    private String hi0201ConditionCode2;
    @JsonProperty("hi02_02_conditionCode2")
    private String hi0202ConditionCode2;
    @JsonProperty("hi03_conditionCode3")
    private String hi03ConditionCode3;
    @JsonProperty("hi03_01_conditionCode3")
    private String hi0301ConditionCode3;
    @JsonProperty("hi03_02_conditionCode3")
    private String hi0302ConditionCode3;
    @JsonProperty("hi04_conditionCode4")
    private String hi04ConditionCode4;
    @JsonProperty("hi04_01_conditionCode4")
    private String hi0401ConditionCode4;
    @JsonProperty("hi04_02_conditionCode4")
    private String hi0402ConditionCode4;
    @JsonProperty("hi05_conditionCode5")
    private String hi05ConditionCode5;
    @JsonProperty("hi05_01_conditionCode5")
    private String hi0501ConditionCode5;
    @JsonProperty("hi05_02_conditionCode5")
    private String hi0502ConditionCode5;
    @JsonProperty("hi06_conditionCode6")
    private String hi06ConditionCode6;
    @JsonProperty("hi06_01_conditionCode6")
    private String hi0601ConditionCode6;
    @JsonProperty("hi06_02_conditionCode6")
    private String hi0602ConditionCode6;
    @JsonProperty("hi07_conditionCode7")
    private String hi07ConditionCode7;
    @JsonProperty("hi07_01_conditionCode7")
    private String hi0701ConditionCode7;
    @JsonProperty("hi07_02_conditionCode7")
    private String hi0702ConditionCode7;
    @JsonProperty("hi08_conditionCode8")
    private String hi08ConditionCode8;
    @JsonProperty("hi08_01_conditionCode8")
    private String hi0801ConditionCode8;
    @JsonProperty("hi08_02_conditionCode8")
    private String hi0802ConditionCode8;
    @JsonProperty("hi09_conditionCode9")
    private String hi09ConditionCode9;
    @JsonProperty("hi09_01_conditionCode9")
    private String hi0901ConditionCode9;
    @JsonProperty("hi09_02_conditionCode9")
    private String hi0902ConditionCode9;
    @JsonProperty("hi10_conditionCode10")
    private String hi10ConditionCode10;
    @JsonProperty("hi10_01_conditionCode10")
    private String hi1001ConditionCode10;
    @JsonProperty("hi10_02_conditionCode10")
    private String hi1002ConditionCode10;
    @JsonProperty("hi11_conditionCode11")
    private String hi11ConditionCode11;
    @JsonProperty("hi11_01_conditionCode11")
    private String hi1101ConditionCode11;
    @JsonProperty("hi11_02_conditionCode11")
    private String hi1102ConditionCode11;
    @JsonProperty("hi12_conditionCode12")
    private String hi12ConditionCode12;
    @JsonProperty("hi12_01_conditionCode12")
    private String hi1201ConditionCode12;
    @JsonProperty("hi12_02_conditionCode12")
    private String hi1202ConditionCode12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hi01_conditionCode1")
    public String getHi01ConditionCode1() {
        return hi01ConditionCode1;
    }

    @JsonProperty("hi01_conditionCode1")
    public void setHi01ConditionCode1(String hi01ConditionCode1) {
        this.hi01ConditionCode1 = hi01ConditionCode1;
    }

    public HiConditionCode withHi01ConditionCode1(String hi01ConditionCode1) {
        this.hi01ConditionCode1 = hi01ConditionCode1;
        return this;
    }

    @JsonProperty("hi01_01_conditionCode1")
    public String getHi0101ConditionCode1() {
        return hi0101ConditionCode1;
    }

    @JsonProperty("hi01_01_conditionCode1")
    public void setHi0101ConditionCode1(String hi0101ConditionCode1) {
        this.hi0101ConditionCode1 = hi0101ConditionCode1;
    }

    public HiConditionCode withHi0101ConditionCode1(String hi0101ConditionCode1) {
        this.hi0101ConditionCode1 = hi0101ConditionCode1;
        return this;
    }

    @JsonProperty("hi01_02_conditionCode1")
    public String getHi0102ConditionCode1() {
        return hi0102ConditionCode1;
    }

    @JsonProperty("hi01_02_conditionCode1")
    public void setHi0102ConditionCode1(String hi0102ConditionCode1) {
        this.hi0102ConditionCode1 = hi0102ConditionCode1;
    }

    public HiConditionCode withHi0102ConditionCode1(String hi0102ConditionCode1) {
        this.hi0102ConditionCode1 = hi0102ConditionCode1;
        return this;
    }

    @JsonProperty("hi02_conditionCode2")
    public String getHi02ConditionCode2() {
        return hi02ConditionCode2;
    }

    @JsonProperty("hi02_conditionCode2")
    public void setHi02ConditionCode2(String hi02ConditionCode2) {
        this.hi02ConditionCode2 = hi02ConditionCode2;
    }

    public HiConditionCode withHi02ConditionCode2(String hi02ConditionCode2) {
        this.hi02ConditionCode2 = hi02ConditionCode2;
        return this;
    }

    @JsonProperty("hi02_01_conditionCode2")
    public String getHi0201ConditionCode2() {
        return hi0201ConditionCode2;
    }

    @JsonProperty("hi02_01_conditionCode2")
    public void setHi0201ConditionCode2(String hi0201ConditionCode2) {
        this.hi0201ConditionCode2 = hi0201ConditionCode2;
    }

    public HiConditionCode withHi0201ConditionCode2(String hi0201ConditionCode2) {
        this.hi0201ConditionCode2 = hi0201ConditionCode2;
        return this;
    }

    @JsonProperty("hi02_02_conditionCode2")
    public String getHi0202ConditionCode2() {
        return hi0202ConditionCode2;
    }

    @JsonProperty("hi02_02_conditionCode2")
    public void setHi0202ConditionCode2(String hi0202ConditionCode2) {
        this.hi0202ConditionCode2 = hi0202ConditionCode2;
    }

    public HiConditionCode withHi0202ConditionCode2(String hi0202ConditionCode2) {
        this.hi0202ConditionCode2 = hi0202ConditionCode2;
        return this;
    }

    @JsonProperty("hi03_conditionCode3")
    public String getHi03ConditionCode3() {
        return hi03ConditionCode3;
    }

    @JsonProperty("hi03_conditionCode3")
    public void setHi03ConditionCode3(String hi03ConditionCode3) {
        this.hi03ConditionCode3 = hi03ConditionCode3;
    }

    public HiConditionCode withHi03ConditionCode3(String hi03ConditionCode3) {
        this.hi03ConditionCode3 = hi03ConditionCode3;
        return this;
    }

    @JsonProperty("hi03_01_conditionCode3")
    public String getHi0301ConditionCode3() {
        return hi0301ConditionCode3;
    }

    @JsonProperty("hi03_01_conditionCode3")
    public void setHi0301ConditionCode3(String hi0301ConditionCode3) {
        this.hi0301ConditionCode3 = hi0301ConditionCode3;
    }

    public HiConditionCode withHi0301ConditionCode3(String hi0301ConditionCode3) {
        this.hi0301ConditionCode3 = hi0301ConditionCode3;
        return this;
    }

    @JsonProperty("hi03_02_conditionCode3")
    public String getHi0302ConditionCode3() {
        return hi0302ConditionCode3;
    }

    @JsonProperty("hi03_02_conditionCode3")
    public void setHi0302ConditionCode3(String hi0302ConditionCode3) {
        this.hi0302ConditionCode3 = hi0302ConditionCode3;
    }

    public HiConditionCode withHi0302ConditionCode3(String hi0302ConditionCode3) {
        this.hi0302ConditionCode3 = hi0302ConditionCode3;
        return this;
    }

    @JsonProperty("hi04_conditionCode4")
    public String getHi04ConditionCode4() {
        return hi04ConditionCode4;
    }

    @JsonProperty("hi04_conditionCode4")
    public void setHi04ConditionCode4(String hi04ConditionCode4) {
        this.hi04ConditionCode4 = hi04ConditionCode4;
    }

    public HiConditionCode withHi04ConditionCode4(String hi04ConditionCode4) {
        this.hi04ConditionCode4 = hi04ConditionCode4;
        return this;
    }

    @JsonProperty("hi04_01_conditionCode4")
    public String getHi0401ConditionCode4() {
        return hi0401ConditionCode4;
    }

    @JsonProperty("hi04_01_conditionCode4")
    public void setHi0401ConditionCode4(String hi0401ConditionCode4) {
        this.hi0401ConditionCode4 = hi0401ConditionCode4;
    }

    public HiConditionCode withHi0401ConditionCode4(String hi0401ConditionCode4) {
        this.hi0401ConditionCode4 = hi0401ConditionCode4;
        return this;
    }

    @JsonProperty("hi04_02_conditionCode4")
    public String getHi0402ConditionCode4() {
        return hi0402ConditionCode4;
    }

    @JsonProperty("hi04_02_conditionCode4")
    public void setHi0402ConditionCode4(String hi0402ConditionCode4) {
        this.hi0402ConditionCode4 = hi0402ConditionCode4;
    }

    public HiConditionCode withHi0402ConditionCode4(String hi0402ConditionCode4) {
        this.hi0402ConditionCode4 = hi0402ConditionCode4;
        return this;
    }

    @JsonProperty("hi05_conditionCode5")
    public String getHi05ConditionCode5() {
        return hi05ConditionCode5;
    }

    @JsonProperty("hi05_conditionCode5")
    public void setHi05ConditionCode5(String hi05ConditionCode5) {
        this.hi05ConditionCode5 = hi05ConditionCode5;
    }

    public HiConditionCode withHi05ConditionCode5(String hi05ConditionCode5) {
        this.hi05ConditionCode5 = hi05ConditionCode5;
        return this;
    }

    @JsonProperty("hi05_01_conditionCode5")
    public String getHi0501ConditionCode5() {
        return hi0501ConditionCode5;
    }

    @JsonProperty("hi05_01_conditionCode5")
    public void setHi0501ConditionCode5(String hi0501ConditionCode5) {
        this.hi0501ConditionCode5 = hi0501ConditionCode5;
    }

    public HiConditionCode withHi0501ConditionCode5(String hi0501ConditionCode5) {
        this.hi0501ConditionCode5 = hi0501ConditionCode5;
        return this;
    }

    @JsonProperty("hi05_02_conditionCode5")
    public String getHi0502ConditionCode5() {
        return hi0502ConditionCode5;
    }

    @JsonProperty("hi05_02_conditionCode5")
    public void setHi0502ConditionCode5(String hi0502ConditionCode5) {
        this.hi0502ConditionCode5 = hi0502ConditionCode5;
    }

    public HiConditionCode withHi0502ConditionCode5(String hi0502ConditionCode5) {
        this.hi0502ConditionCode5 = hi0502ConditionCode5;
        return this;
    }

    @JsonProperty("hi06_conditionCode6")
    public String getHi06ConditionCode6() {
        return hi06ConditionCode6;
    }

    @JsonProperty("hi06_conditionCode6")
    public void setHi06ConditionCode6(String hi06ConditionCode6) {
        this.hi06ConditionCode6 = hi06ConditionCode6;
    }

    public HiConditionCode withHi06ConditionCode6(String hi06ConditionCode6) {
        this.hi06ConditionCode6 = hi06ConditionCode6;
        return this;
    }

    @JsonProperty("hi06_01_conditionCode6")
    public String getHi0601ConditionCode6() {
        return hi0601ConditionCode6;
    }

    @JsonProperty("hi06_01_conditionCode6")
    public void setHi0601ConditionCode6(String hi0601ConditionCode6) {
        this.hi0601ConditionCode6 = hi0601ConditionCode6;
    }

    public HiConditionCode withHi0601ConditionCode6(String hi0601ConditionCode6) {
        this.hi0601ConditionCode6 = hi0601ConditionCode6;
        return this;
    }

    @JsonProperty("hi06_02_conditionCode6")
    public String getHi0602ConditionCode6() {
        return hi0602ConditionCode6;
    }

    @JsonProperty("hi06_02_conditionCode6")
    public void setHi0602ConditionCode6(String hi0602ConditionCode6) {
        this.hi0602ConditionCode6 = hi0602ConditionCode6;
    }

    public HiConditionCode withHi0602ConditionCode6(String hi0602ConditionCode6) {
        this.hi0602ConditionCode6 = hi0602ConditionCode6;
        return this;
    }

    @JsonProperty("hi07_conditionCode7")
    public String getHi07ConditionCode7() {
        return hi07ConditionCode7;
    }

    @JsonProperty("hi07_conditionCode7")
    public void setHi07ConditionCode7(String hi07ConditionCode7) {
        this.hi07ConditionCode7 = hi07ConditionCode7;
    }

    public HiConditionCode withHi07ConditionCode7(String hi07ConditionCode7) {
        this.hi07ConditionCode7 = hi07ConditionCode7;
        return this;
    }

    @JsonProperty("hi07_01_conditionCode7")
    public String getHi0701ConditionCode7() {
        return hi0701ConditionCode7;
    }

    @JsonProperty("hi07_01_conditionCode7")
    public void setHi0701ConditionCode7(String hi0701ConditionCode7) {
        this.hi0701ConditionCode7 = hi0701ConditionCode7;
    }

    public HiConditionCode withHi0701ConditionCode7(String hi0701ConditionCode7) {
        this.hi0701ConditionCode7 = hi0701ConditionCode7;
        return this;
    }

    @JsonProperty("hi07_02_conditionCode7")
    public String getHi0702ConditionCode7() {
        return hi0702ConditionCode7;
    }

    @JsonProperty("hi07_02_conditionCode7")
    public void setHi0702ConditionCode7(String hi0702ConditionCode7) {
        this.hi0702ConditionCode7 = hi0702ConditionCode7;
    }

    public HiConditionCode withHi0702ConditionCode7(String hi0702ConditionCode7) {
        this.hi0702ConditionCode7 = hi0702ConditionCode7;
        return this;
    }

    @JsonProperty("hi08_conditionCode8")
    public String getHi08ConditionCode8() {
        return hi08ConditionCode8;
    }

    @JsonProperty("hi08_conditionCode8")
    public void setHi08ConditionCode8(String hi08ConditionCode8) {
        this.hi08ConditionCode8 = hi08ConditionCode8;
    }

    public HiConditionCode withHi08ConditionCode8(String hi08ConditionCode8) {
        this.hi08ConditionCode8 = hi08ConditionCode8;
        return this;
    }

    @JsonProperty("hi08_01_conditionCode8")
    public String getHi0801ConditionCode8() {
        return hi0801ConditionCode8;
    }

    @JsonProperty("hi08_01_conditionCode8")
    public void setHi0801ConditionCode8(String hi0801ConditionCode8) {
        this.hi0801ConditionCode8 = hi0801ConditionCode8;
    }

    public HiConditionCode withHi0801ConditionCode8(String hi0801ConditionCode8) {
        this.hi0801ConditionCode8 = hi0801ConditionCode8;
        return this;
    }

    @JsonProperty("hi08_02_conditionCode8")
    public String getHi0802ConditionCode8() {
        return hi0802ConditionCode8;
    }

    @JsonProperty("hi08_02_conditionCode8")
    public void setHi0802ConditionCode8(String hi0802ConditionCode8) {
        this.hi0802ConditionCode8 = hi0802ConditionCode8;
    }

    public HiConditionCode withHi0802ConditionCode8(String hi0802ConditionCode8) {
        this.hi0802ConditionCode8 = hi0802ConditionCode8;
        return this;
    }

    @JsonProperty("hi09_conditionCode9")
    public String getHi09ConditionCode9() {
        return hi09ConditionCode9;
    }

    @JsonProperty("hi09_conditionCode9")
    public void setHi09ConditionCode9(String hi09ConditionCode9) {
        this.hi09ConditionCode9 = hi09ConditionCode9;
    }

    public HiConditionCode withHi09ConditionCode9(String hi09ConditionCode9) {
        this.hi09ConditionCode9 = hi09ConditionCode9;
        return this;
    }

    @JsonProperty("hi09_01_conditionCode9")
    public String getHi0901ConditionCode9() {
        return hi0901ConditionCode9;
    }

    @JsonProperty("hi09_01_conditionCode9")
    public void setHi0901ConditionCode9(String hi0901ConditionCode9) {
        this.hi0901ConditionCode9 = hi0901ConditionCode9;
    }

    public HiConditionCode withHi0901ConditionCode9(String hi0901ConditionCode9) {
        this.hi0901ConditionCode9 = hi0901ConditionCode9;
        return this;
    }

    @JsonProperty("hi09_02_conditionCode9")
    public String getHi0902ConditionCode9() {
        return hi0902ConditionCode9;
    }

    @JsonProperty("hi09_02_conditionCode9")
    public void setHi0902ConditionCode9(String hi0902ConditionCode9) {
        this.hi0902ConditionCode9 = hi0902ConditionCode9;
    }

    public HiConditionCode withHi0902ConditionCode9(String hi0902ConditionCode9) {
        this.hi0902ConditionCode9 = hi0902ConditionCode9;
        return this;
    }

    @JsonProperty("hi10_conditionCode10")
    public String getHi10ConditionCode10() {
        return hi10ConditionCode10;
    }

    @JsonProperty("hi10_conditionCode10")
    public void setHi10ConditionCode10(String hi10ConditionCode10) {
        this.hi10ConditionCode10 = hi10ConditionCode10;
    }

    public HiConditionCode withHi10ConditionCode10(String hi10ConditionCode10) {
        this.hi10ConditionCode10 = hi10ConditionCode10;
        return this;
    }

    @JsonProperty("hi10_01_conditionCode10")
    public String getHi1001ConditionCode10() {
        return hi1001ConditionCode10;
    }

    @JsonProperty("hi10_01_conditionCode10")
    public void setHi1001ConditionCode10(String hi1001ConditionCode10) {
        this.hi1001ConditionCode10 = hi1001ConditionCode10;
    }

    public HiConditionCode withHi1001ConditionCode10(String hi1001ConditionCode10) {
        this.hi1001ConditionCode10 = hi1001ConditionCode10;
        return this;
    }

    @JsonProperty("hi10_02_conditionCode10")
    public String getHi1002ConditionCode10() {
        return hi1002ConditionCode10;
    }

    @JsonProperty("hi10_02_conditionCode10")
    public void setHi1002ConditionCode10(String hi1002ConditionCode10) {
        this.hi1002ConditionCode10 = hi1002ConditionCode10;
    }

    public HiConditionCode withHi1002ConditionCode10(String hi1002ConditionCode10) {
        this.hi1002ConditionCode10 = hi1002ConditionCode10;
        return this;
    }

    @JsonProperty("hi11_conditionCode11")
    public String getHi11ConditionCode11() {
        return hi11ConditionCode11;
    }

    @JsonProperty("hi11_conditionCode11")
    public void setHi11ConditionCode11(String hi11ConditionCode11) {
        this.hi11ConditionCode11 = hi11ConditionCode11;
    }

    public HiConditionCode withHi11ConditionCode11(String hi11ConditionCode11) {
        this.hi11ConditionCode11 = hi11ConditionCode11;
        return this;
    }

    @JsonProperty("hi11_01_conditionCode11")
    public String getHi1101ConditionCode11() {
        return hi1101ConditionCode11;
    }

    @JsonProperty("hi11_01_conditionCode11")
    public void setHi1101ConditionCode11(String hi1101ConditionCode11) {
        this.hi1101ConditionCode11 = hi1101ConditionCode11;
    }

    public HiConditionCode withHi1101ConditionCode11(String hi1101ConditionCode11) {
        this.hi1101ConditionCode11 = hi1101ConditionCode11;
        return this;
    }

    @JsonProperty("hi11_02_conditionCode11")
    public String getHi1102ConditionCode11() {
        return hi1102ConditionCode11;
    }

    @JsonProperty("hi11_02_conditionCode11")
    public void setHi1102ConditionCode11(String hi1102ConditionCode11) {
        this.hi1102ConditionCode11 = hi1102ConditionCode11;
    }

    public HiConditionCode withHi1102ConditionCode11(String hi1102ConditionCode11) {
        this.hi1102ConditionCode11 = hi1102ConditionCode11;
        return this;
    }

    @JsonProperty("hi12_conditionCode12")
    public String getHi12ConditionCode12() {
        return hi12ConditionCode12;
    }

    @JsonProperty("hi12_conditionCode12")
    public void setHi12ConditionCode12(String hi12ConditionCode12) {
        this.hi12ConditionCode12 = hi12ConditionCode12;
    }

    public HiConditionCode withHi12ConditionCode12(String hi12ConditionCode12) {
        this.hi12ConditionCode12 = hi12ConditionCode12;
        return this;
    }

    @JsonProperty("hi12_01_conditionCode12")
    public String getHi1201ConditionCode12() {
        return hi1201ConditionCode12;
    }

    @JsonProperty("hi12_01_conditionCode12")
    public void setHi1201ConditionCode12(String hi1201ConditionCode12) {
        this.hi1201ConditionCode12 = hi1201ConditionCode12;
    }

    public HiConditionCode withHi1201ConditionCode12(String hi1201ConditionCode12) {
        this.hi1201ConditionCode12 = hi1201ConditionCode12;
        return this;
    }

    @JsonProperty("hi12_02_conditionCode12")
    public String getHi1202ConditionCode12() {
        return hi1202ConditionCode12;
    }

    @JsonProperty("hi12_02_conditionCode12")
    public void setHi1202ConditionCode12(String hi1202ConditionCode12) {
        this.hi1202ConditionCode12 = hi1202ConditionCode12;
    }

    public HiConditionCode withHi1202ConditionCode12(String hi1202ConditionCode12) {
        this.hi1202ConditionCode12 = hi1202ConditionCode12;
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

    public HiConditionCode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hi01ConditionCode1).append(hi0101ConditionCode1).append(hi0102ConditionCode1).append(hi02ConditionCode2).append(hi0201ConditionCode2).append(hi0202ConditionCode2).append(hi03ConditionCode3).append(hi0301ConditionCode3).append(hi0302ConditionCode3).append(hi04ConditionCode4).append(hi0401ConditionCode4).append(hi0402ConditionCode4).append(hi05ConditionCode5).append(hi0501ConditionCode5).append(hi0502ConditionCode5).append(hi06ConditionCode6).append(hi0601ConditionCode6).append(hi0602ConditionCode6).append(hi07ConditionCode7).append(hi0701ConditionCode7).append(hi0702ConditionCode7).append(hi08ConditionCode8).append(hi0801ConditionCode8).append(hi0802ConditionCode8).append(hi09ConditionCode9).append(hi0901ConditionCode9).append(hi0902ConditionCode9).append(hi10ConditionCode10).append(hi1001ConditionCode10).append(hi1002ConditionCode10).append(hi11ConditionCode11).append(hi1101ConditionCode11).append(hi1102ConditionCode11).append(hi12ConditionCode12).append(hi1201ConditionCode12).append(hi1202ConditionCode12).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiConditionCode) == false) {
            return false;
        }
        HiConditionCode rhs = ((HiConditionCode) other);
        return new EqualsBuilder().append(hi01ConditionCode1, rhs.hi01ConditionCode1).append(hi0101ConditionCode1, rhs.hi0101ConditionCode1).append(hi0102ConditionCode1, rhs.hi0102ConditionCode1).append(hi02ConditionCode2, rhs.hi02ConditionCode2).append(hi0201ConditionCode2, rhs.hi0201ConditionCode2).append(hi0202ConditionCode2, rhs.hi0202ConditionCode2).append(hi03ConditionCode3, rhs.hi03ConditionCode3).append(hi0301ConditionCode3, rhs.hi0301ConditionCode3).append(hi0302ConditionCode3, rhs.hi0302ConditionCode3).append(hi04ConditionCode4, rhs.hi04ConditionCode4).append(hi0401ConditionCode4, rhs.hi0401ConditionCode4).append(hi0402ConditionCode4, rhs.hi0402ConditionCode4).append(hi05ConditionCode5, rhs.hi05ConditionCode5).append(hi0501ConditionCode5, rhs.hi0501ConditionCode5).append(hi0502ConditionCode5, rhs.hi0502ConditionCode5).append(hi06ConditionCode6, rhs.hi06ConditionCode6).append(hi0601ConditionCode6, rhs.hi0601ConditionCode6).append(hi0602ConditionCode6, rhs.hi0602ConditionCode6).append(hi07ConditionCode7, rhs.hi07ConditionCode7).append(hi0701ConditionCode7, rhs.hi0701ConditionCode7).append(hi0702ConditionCode7, rhs.hi0702ConditionCode7).append(hi08ConditionCode8, rhs.hi08ConditionCode8).append(hi0801ConditionCode8, rhs.hi0801ConditionCode8).append(hi0802ConditionCode8, rhs.hi0802ConditionCode8).append(hi09ConditionCode9, rhs.hi09ConditionCode9).append(hi0901ConditionCode9, rhs.hi0901ConditionCode9).append(hi0902ConditionCode9, rhs.hi0902ConditionCode9).append(hi10ConditionCode10, rhs.hi10ConditionCode10).append(hi1001ConditionCode10, rhs.hi1001ConditionCode10).append(hi1002ConditionCode10, rhs.hi1002ConditionCode10).append(hi11ConditionCode11, rhs.hi11ConditionCode11).append(hi1101ConditionCode11, rhs.hi1101ConditionCode11).append(hi1102ConditionCode11, rhs.hi1102ConditionCode11).append(hi12ConditionCode12, rhs.hi12ConditionCode12).append(hi1201ConditionCode12, rhs.hi1201ConditionCode12).append(hi1202ConditionCode12, rhs.hi1202ConditionCode12).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

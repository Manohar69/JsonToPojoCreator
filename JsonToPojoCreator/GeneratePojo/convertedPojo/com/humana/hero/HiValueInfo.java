
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
    "hi01_valueInfo1",
    "hi01_01_valueInfoQlfr1",
    "hi01_02_valueCode1",
    "hi01_05_valueCodeAmount1",
    "hi02_valueInfo2",
    "hi02_01_valueInfoQlfr2",
    "hi02_02_valueCode2",
    "hi02_05_valueCodeAmount2",
    "hi03_valueInfo3",
    "hi03_01_valueInfoQlfr3",
    "hi03_02_valueCode3",
    "hi03_05_valueCodeAmount3",
    "hi04_valueInfo4",
    "hi04_01_valueInfoQlfr4",
    "hi04_02_valueCode4",
    "hi04_05_valueCodeAmount4",
    "hi05_valueInfo5",
    "hi05_01_valueInfoQlfr5",
    "hi05_02_valueCode5",
    "hi05_05_valueCodeAmount5",
    "hi06_valueInfo6",
    "hi06_01_valueInfoQlfr6",
    "hi06_02_valueCode6",
    "hi06_05_valueCodeAmount6",
    "hi07_valueInfo7",
    "hi07_01_valueInfoQlfr7",
    "hi07_02_valueCode7",
    "hi07_05_valueCodeAmount7",
    "hi08_valueInfo8",
    "hi08_01_valueInfoQlfr8",
    "hi08_02_valueCode8",
    "hi08_05_valueCodeAmount8",
    "hi09_valueInfo9",
    "hi09_01_valueInfoQlfr9",
    "hi09_02_valueCode9",
    "hi09_05_valueCodeAmount9",
    "hi10_valueInfo10",
    "hi10_01_valueInfoQlfr10",
    "hi10_02_valueCode10",
    "hi10_05_valueCodeAmount10",
    "hi11_valueInfo11",
    "hi11_01_valueInfoQlfr11",
    "hi11_02_valueCode11",
    "hi11_05_valueCodeAmount11",
    "hi12_valueInfo12",
    "hi12_01_valueInfoQlfr12",
    "hi12_02_valueCode12",
    "hi12_05_valueCodeAmount12"
})
public class HiValueInfo {

    @JsonProperty("hi01_valueInfo1")
    private String hi01ValueInfo1;
    @JsonProperty("hi01_01_valueInfoQlfr1")
    private String hi0101ValueInfoQlfr1;
    @JsonProperty("hi01_02_valueCode1")
    private String hi0102ValueCode1;
    @JsonProperty("hi01_05_valueCodeAmount1")
    private String hi0105ValueCodeAmount1;
    @JsonProperty("hi02_valueInfo2")
    private String hi02ValueInfo2;
    @JsonProperty("hi02_01_valueInfoQlfr2")
    private String hi0201ValueInfoQlfr2;
    @JsonProperty("hi02_02_valueCode2")
    private String hi0202ValueCode2;
    @JsonProperty("hi02_05_valueCodeAmount2")
    private String hi0205ValueCodeAmount2;
    @JsonProperty("hi03_valueInfo3")
    private String hi03ValueInfo3;
    @JsonProperty("hi03_01_valueInfoQlfr3")
    private String hi0301ValueInfoQlfr3;
    @JsonProperty("hi03_02_valueCode3")
    private String hi0302ValueCode3;
    @JsonProperty("hi03_05_valueCodeAmount3")
    private String hi0305ValueCodeAmount3;
    @JsonProperty("hi04_valueInfo4")
    private String hi04ValueInfo4;
    @JsonProperty("hi04_01_valueInfoQlfr4")
    private String hi0401ValueInfoQlfr4;
    @JsonProperty("hi04_02_valueCode4")
    private String hi0402ValueCode4;
    @JsonProperty("hi04_05_valueCodeAmount4")
    private String hi0405ValueCodeAmount4;
    @JsonProperty("hi05_valueInfo5")
    private String hi05ValueInfo5;
    @JsonProperty("hi05_01_valueInfoQlfr5")
    private String hi0501ValueInfoQlfr5;
    @JsonProperty("hi05_02_valueCode5")
    private String hi0502ValueCode5;
    @JsonProperty("hi05_05_valueCodeAmount5")
    private String hi0505ValueCodeAmount5;
    @JsonProperty("hi06_valueInfo6")
    private String hi06ValueInfo6;
    @JsonProperty("hi06_01_valueInfoQlfr6")
    private String hi0601ValueInfoQlfr6;
    @JsonProperty("hi06_02_valueCode6")
    private String hi0602ValueCode6;
    @JsonProperty("hi06_05_valueCodeAmount6")
    private String hi0605ValueCodeAmount6;
    @JsonProperty("hi07_valueInfo7")
    private String hi07ValueInfo7;
    @JsonProperty("hi07_01_valueInfoQlfr7")
    private String hi0701ValueInfoQlfr7;
    @JsonProperty("hi07_02_valueCode7")
    private String hi0702ValueCode7;
    @JsonProperty("hi07_05_valueCodeAmount7")
    private String hi0705ValueCodeAmount7;
    @JsonProperty("hi08_valueInfo8")
    private String hi08ValueInfo8;
    @JsonProperty("hi08_01_valueInfoQlfr8")
    private String hi0801ValueInfoQlfr8;
    @JsonProperty("hi08_02_valueCode8")
    private String hi0802ValueCode8;
    @JsonProperty("hi08_05_valueCodeAmount8")
    private String hi0805ValueCodeAmount8;
    @JsonProperty("hi09_valueInfo9")
    private String hi09ValueInfo9;
    @JsonProperty("hi09_01_valueInfoQlfr9")
    private String hi0901ValueInfoQlfr9;
    @JsonProperty("hi09_02_valueCode9")
    private String hi0902ValueCode9;
    @JsonProperty("hi09_05_valueCodeAmount9")
    private String hi0905ValueCodeAmount9;
    @JsonProperty("hi10_valueInfo10")
    private String hi10ValueInfo10;
    @JsonProperty("hi10_01_valueInfoQlfr10")
    private String hi1001ValueInfoQlfr10;
    @JsonProperty("hi10_02_valueCode10")
    private String hi1002ValueCode10;
    @JsonProperty("hi10_05_valueCodeAmount10")
    private String hi1005ValueCodeAmount10;
    @JsonProperty("hi11_valueInfo11")
    private String hi11ValueInfo11;
    @JsonProperty("hi11_01_valueInfoQlfr11")
    private String hi1101ValueInfoQlfr11;
    @JsonProperty("hi11_02_valueCode11")
    private String hi1102ValueCode11;
    @JsonProperty("hi11_05_valueCodeAmount11")
    private String hi1105ValueCodeAmount11;
    @JsonProperty("hi12_valueInfo12")
    private String hi12ValueInfo12;
    @JsonProperty("hi12_01_valueInfoQlfr12")
    private String hi1201ValueInfoQlfr12;
    @JsonProperty("hi12_02_valueCode12")
    private String hi1202ValueCode12;
    @JsonProperty("hi12_05_valueCodeAmount12")
    private String hi1205ValueCodeAmount12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hi01_valueInfo1")
    public String getHi01ValueInfo1() {
        return hi01ValueInfo1;
    }

    @JsonProperty("hi01_valueInfo1")
    public void setHi01ValueInfo1(String hi01ValueInfo1) {
        this.hi01ValueInfo1 = hi01ValueInfo1;
    }

    public HiValueInfo withHi01ValueInfo1(String hi01ValueInfo1) {
        this.hi01ValueInfo1 = hi01ValueInfo1;
        return this;
    }

    @JsonProperty("hi01_01_valueInfoQlfr1")
    public String getHi0101ValueInfoQlfr1() {
        return hi0101ValueInfoQlfr1;
    }

    @JsonProperty("hi01_01_valueInfoQlfr1")
    public void setHi0101ValueInfoQlfr1(String hi0101ValueInfoQlfr1) {
        this.hi0101ValueInfoQlfr1 = hi0101ValueInfoQlfr1;
    }

    public HiValueInfo withHi0101ValueInfoQlfr1(String hi0101ValueInfoQlfr1) {
        this.hi0101ValueInfoQlfr1 = hi0101ValueInfoQlfr1;
        return this;
    }

    @JsonProperty("hi01_02_valueCode1")
    public String getHi0102ValueCode1() {
        return hi0102ValueCode1;
    }

    @JsonProperty("hi01_02_valueCode1")
    public void setHi0102ValueCode1(String hi0102ValueCode1) {
        this.hi0102ValueCode1 = hi0102ValueCode1;
    }

    public HiValueInfo withHi0102ValueCode1(String hi0102ValueCode1) {
        this.hi0102ValueCode1 = hi0102ValueCode1;
        return this;
    }

    @JsonProperty("hi01_05_valueCodeAmount1")
    public String getHi0105ValueCodeAmount1() {
        return hi0105ValueCodeAmount1;
    }

    @JsonProperty("hi01_05_valueCodeAmount1")
    public void setHi0105ValueCodeAmount1(String hi0105ValueCodeAmount1) {
        this.hi0105ValueCodeAmount1 = hi0105ValueCodeAmount1;
    }

    public HiValueInfo withHi0105ValueCodeAmount1(String hi0105ValueCodeAmount1) {
        this.hi0105ValueCodeAmount1 = hi0105ValueCodeAmount1;
        return this;
    }

    @JsonProperty("hi02_valueInfo2")
    public String getHi02ValueInfo2() {
        return hi02ValueInfo2;
    }

    @JsonProperty("hi02_valueInfo2")
    public void setHi02ValueInfo2(String hi02ValueInfo2) {
        this.hi02ValueInfo2 = hi02ValueInfo2;
    }

    public HiValueInfo withHi02ValueInfo2(String hi02ValueInfo2) {
        this.hi02ValueInfo2 = hi02ValueInfo2;
        return this;
    }

    @JsonProperty("hi02_01_valueInfoQlfr2")
    public String getHi0201ValueInfoQlfr2() {
        return hi0201ValueInfoQlfr2;
    }

    @JsonProperty("hi02_01_valueInfoQlfr2")
    public void setHi0201ValueInfoQlfr2(String hi0201ValueInfoQlfr2) {
        this.hi0201ValueInfoQlfr2 = hi0201ValueInfoQlfr2;
    }

    public HiValueInfo withHi0201ValueInfoQlfr2(String hi0201ValueInfoQlfr2) {
        this.hi0201ValueInfoQlfr2 = hi0201ValueInfoQlfr2;
        return this;
    }

    @JsonProperty("hi02_02_valueCode2")
    public String getHi0202ValueCode2() {
        return hi0202ValueCode2;
    }

    @JsonProperty("hi02_02_valueCode2")
    public void setHi0202ValueCode2(String hi0202ValueCode2) {
        this.hi0202ValueCode2 = hi0202ValueCode2;
    }

    public HiValueInfo withHi0202ValueCode2(String hi0202ValueCode2) {
        this.hi0202ValueCode2 = hi0202ValueCode2;
        return this;
    }

    @JsonProperty("hi02_05_valueCodeAmount2")
    public String getHi0205ValueCodeAmount2() {
        return hi0205ValueCodeAmount2;
    }

    @JsonProperty("hi02_05_valueCodeAmount2")
    public void setHi0205ValueCodeAmount2(String hi0205ValueCodeAmount2) {
        this.hi0205ValueCodeAmount2 = hi0205ValueCodeAmount2;
    }

    public HiValueInfo withHi0205ValueCodeAmount2(String hi0205ValueCodeAmount2) {
        this.hi0205ValueCodeAmount2 = hi0205ValueCodeAmount2;
        return this;
    }

    @JsonProperty("hi03_valueInfo3")
    public String getHi03ValueInfo3() {
        return hi03ValueInfo3;
    }

    @JsonProperty("hi03_valueInfo3")
    public void setHi03ValueInfo3(String hi03ValueInfo3) {
        this.hi03ValueInfo3 = hi03ValueInfo3;
    }

    public HiValueInfo withHi03ValueInfo3(String hi03ValueInfo3) {
        this.hi03ValueInfo3 = hi03ValueInfo3;
        return this;
    }

    @JsonProperty("hi03_01_valueInfoQlfr3")
    public String getHi0301ValueInfoQlfr3() {
        return hi0301ValueInfoQlfr3;
    }

    @JsonProperty("hi03_01_valueInfoQlfr3")
    public void setHi0301ValueInfoQlfr3(String hi0301ValueInfoQlfr3) {
        this.hi0301ValueInfoQlfr3 = hi0301ValueInfoQlfr3;
    }

    public HiValueInfo withHi0301ValueInfoQlfr3(String hi0301ValueInfoQlfr3) {
        this.hi0301ValueInfoQlfr3 = hi0301ValueInfoQlfr3;
        return this;
    }

    @JsonProperty("hi03_02_valueCode3")
    public String getHi0302ValueCode3() {
        return hi0302ValueCode3;
    }

    @JsonProperty("hi03_02_valueCode3")
    public void setHi0302ValueCode3(String hi0302ValueCode3) {
        this.hi0302ValueCode3 = hi0302ValueCode3;
    }

    public HiValueInfo withHi0302ValueCode3(String hi0302ValueCode3) {
        this.hi0302ValueCode3 = hi0302ValueCode3;
        return this;
    }

    @JsonProperty("hi03_05_valueCodeAmount3")
    public String getHi0305ValueCodeAmount3() {
        return hi0305ValueCodeAmount3;
    }

    @JsonProperty("hi03_05_valueCodeAmount3")
    public void setHi0305ValueCodeAmount3(String hi0305ValueCodeAmount3) {
        this.hi0305ValueCodeAmount3 = hi0305ValueCodeAmount3;
    }

    public HiValueInfo withHi0305ValueCodeAmount3(String hi0305ValueCodeAmount3) {
        this.hi0305ValueCodeAmount3 = hi0305ValueCodeAmount3;
        return this;
    }

    @JsonProperty("hi04_valueInfo4")
    public String getHi04ValueInfo4() {
        return hi04ValueInfo4;
    }

    @JsonProperty("hi04_valueInfo4")
    public void setHi04ValueInfo4(String hi04ValueInfo4) {
        this.hi04ValueInfo4 = hi04ValueInfo4;
    }

    public HiValueInfo withHi04ValueInfo4(String hi04ValueInfo4) {
        this.hi04ValueInfo4 = hi04ValueInfo4;
        return this;
    }

    @JsonProperty("hi04_01_valueInfoQlfr4")
    public String getHi0401ValueInfoQlfr4() {
        return hi0401ValueInfoQlfr4;
    }

    @JsonProperty("hi04_01_valueInfoQlfr4")
    public void setHi0401ValueInfoQlfr4(String hi0401ValueInfoQlfr4) {
        this.hi0401ValueInfoQlfr4 = hi0401ValueInfoQlfr4;
    }

    public HiValueInfo withHi0401ValueInfoQlfr4(String hi0401ValueInfoQlfr4) {
        this.hi0401ValueInfoQlfr4 = hi0401ValueInfoQlfr4;
        return this;
    }

    @JsonProperty("hi04_02_valueCode4")
    public String getHi0402ValueCode4() {
        return hi0402ValueCode4;
    }

    @JsonProperty("hi04_02_valueCode4")
    public void setHi0402ValueCode4(String hi0402ValueCode4) {
        this.hi0402ValueCode4 = hi0402ValueCode4;
    }

    public HiValueInfo withHi0402ValueCode4(String hi0402ValueCode4) {
        this.hi0402ValueCode4 = hi0402ValueCode4;
        return this;
    }

    @JsonProperty("hi04_05_valueCodeAmount4")
    public String getHi0405ValueCodeAmount4() {
        return hi0405ValueCodeAmount4;
    }

    @JsonProperty("hi04_05_valueCodeAmount4")
    public void setHi0405ValueCodeAmount4(String hi0405ValueCodeAmount4) {
        this.hi0405ValueCodeAmount4 = hi0405ValueCodeAmount4;
    }

    public HiValueInfo withHi0405ValueCodeAmount4(String hi0405ValueCodeAmount4) {
        this.hi0405ValueCodeAmount4 = hi0405ValueCodeAmount4;
        return this;
    }

    @JsonProperty("hi05_valueInfo5")
    public String getHi05ValueInfo5() {
        return hi05ValueInfo5;
    }

    @JsonProperty("hi05_valueInfo5")
    public void setHi05ValueInfo5(String hi05ValueInfo5) {
        this.hi05ValueInfo5 = hi05ValueInfo5;
    }

    public HiValueInfo withHi05ValueInfo5(String hi05ValueInfo5) {
        this.hi05ValueInfo5 = hi05ValueInfo5;
        return this;
    }

    @JsonProperty("hi05_01_valueInfoQlfr5")
    public String getHi0501ValueInfoQlfr5() {
        return hi0501ValueInfoQlfr5;
    }

    @JsonProperty("hi05_01_valueInfoQlfr5")
    public void setHi0501ValueInfoQlfr5(String hi0501ValueInfoQlfr5) {
        this.hi0501ValueInfoQlfr5 = hi0501ValueInfoQlfr5;
    }

    public HiValueInfo withHi0501ValueInfoQlfr5(String hi0501ValueInfoQlfr5) {
        this.hi0501ValueInfoQlfr5 = hi0501ValueInfoQlfr5;
        return this;
    }

    @JsonProperty("hi05_02_valueCode5")
    public String getHi0502ValueCode5() {
        return hi0502ValueCode5;
    }

    @JsonProperty("hi05_02_valueCode5")
    public void setHi0502ValueCode5(String hi0502ValueCode5) {
        this.hi0502ValueCode5 = hi0502ValueCode5;
    }

    public HiValueInfo withHi0502ValueCode5(String hi0502ValueCode5) {
        this.hi0502ValueCode5 = hi0502ValueCode5;
        return this;
    }

    @JsonProperty("hi05_05_valueCodeAmount5")
    public String getHi0505ValueCodeAmount5() {
        return hi0505ValueCodeAmount5;
    }

    @JsonProperty("hi05_05_valueCodeAmount5")
    public void setHi0505ValueCodeAmount5(String hi0505ValueCodeAmount5) {
        this.hi0505ValueCodeAmount5 = hi0505ValueCodeAmount5;
    }

    public HiValueInfo withHi0505ValueCodeAmount5(String hi0505ValueCodeAmount5) {
        this.hi0505ValueCodeAmount5 = hi0505ValueCodeAmount5;
        return this;
    }

    @JsonProperty("hi06_valueInfo6")
    public String getHi06ValueInfo6() {
        return hi06ValueInfo6;
    }

    @JsonProperty("hi06_valueInfo6")
    public void setHi06ValueInfo6(String hi06ValueInfo6) {
        this.hi06ValueInfo6 = hi06ValueInfo6;
    }

    public HiValueInfo withHi06ValueInfo6(String hi06ValueInfo6) {
        this.hi06ValueInfo6 = hi06ValueInfo6;
        return this;
    }

    @JsonProperty("hi06_01_valueInfoQlfr6")
    public String getHi0601ValueInfoQlfr6() {
        return hi0601ValueInfoQlfr6;
    }

    @JsonProperty("hi06_01_valueInfoQlfr6")
    public void setHi0601ValueInfoQlfr6(String hi0601ValueInfoQlfr6) {
        this.hi0601ValueInfoQlfr6 = hi0601ValueInfoQlfr6;
    }

    public HiValueInfo withHi0601ValueInfoQlfr6(String hi0601ValueInfoQlfr6) {
        this.hi0601ValueInfoQlfr6 = hi0601ValueInfoQlfr6;
        return this;
    }

    @JsonProperty("hi06_02_valueCode6")
    public String getHi0602ValueCode6() {
        return hi0602ValueCode6;
    }

    @JsonProperty("hi06_02_valueCode6")
    public void setHi0602ValueCode6(String hi0602ValueCode6) {
        this.hi0602ValueCode6 = hi0602ValueCode6;
    }

    public HiValueInfo withHi0602ValueCode6(String hi0602ValueCode6) {
        this.hi0602ValueCode6 = hi0602ValueCode6;
        return this;
    }

    @JsonProperty("hi06_05_valueCodeAmount6")
    public String getHi0605ValueCodeAmount6() {
        return hi0605ValueCodeAmount6;
    }

    @JsonProperty("hi06_05_valueCodeAmount6")
    public void setHi0605ValueCodeAmount6(String hi0605ValueCodeAmount6) {
        this.hi0605ValueCodeAmount6 = hi0605ValueCodeAmount6;
    }

    public HiValueInfo withHi0605ValueCodeAmount6(String hi0605ValueCodeAmount6) {
        this.hi0605ValueCodeAmount6 = hi0605ValueCodeAmount6;
        return this;
    }

    @JsonProperty("hi07_valueInfo7")
    public String getHi07ValueInfo7() {
        return hi07ValueInfo7;
    }

    @JsonProperty("hi07_valueInfo7")
    public void setHi07ValueInfo7(String hi07ValueInfo7) {
        this.hi07ValueInfo7 = hi07ValueInfo7;
    }

    public HiValueInfo withHi07ValueInfo7(String hi07ValueInfo7) {
        this.hi07ValueInfo7 = hi07ValueInfo7;
        return this;
    }

    @JsonProperty("hi07_01_valueInfoQlfr7")
    public String getHi0701ValueInfoQlfr7() {
        return hi0701ValueInfoQlfr7;
    }

    @JsonProperty("hi07_01_valueInfoQlfr7")
    public void setHi0701ValueInfoQlfr7(String hi0701ValueInfoQlfr7) {
        this.hi0701ValueInfoQlfr7 = hi0701ValueInfoQlfr7;
    }

    public HiValueInfo withHi0701ValueInfoQlfr7(String hi0701ValueInfoQlfr7) {
        this.hi0701ValueInfoQlfr7 = hi0701ValueInfoQlfr7;
        return this;
    }

    @JsonProperty("hi07_02_valueCode7")
    public String getHi0702ValueCode7() {
        return hi0702ValueCode7;
    }

    @JsonProperty("hi07_02_valueCode7")
    public void setHi0702ValueCode7(String hi0702ValueCode7) {
        this.hi0702ValueCode7 = hi0702ValueCode7;
    }

    public HiValueInfo withHi0702ValueCode7(String hi0702ValueCode7) {
        this.hi0702ValueCode7 = hi0702ValueCode7;
        return this;
    }

    @JsonProperty("hi07_05_valueCodeAmount7")
    public String getHi0705ValueCodeAmount7() {
        return hi0705ValueCodeAmount7;
    }

    @JsonProperty("hi07_05_valueCodeAmount7")
    public void setHi0705ValueCodeAmount7(String hi0705ValueCodeAmount7) {
        this.hi0705ValueCodeAmount7 = hi0705ValueCodeAmount7;
    }

    public HiValueInfo withHi0705ValueCodeAmount7(String hi0705ValueCodeAmount7) {
        this.hi0705ValueCodeAmount7 = hi0705ValueCodeAmount7;
        return this;
    }

    @JsonProperty("hi08_valueInfo8")
    public String getHi08ValueInfo8() {
        return hi08ValueInfo8;
    }

    @JsonProperty("hi08_valueInfo8")
    public void setHi08ValueInfo8(String hi08ValueInfo8) {
        this.hi08ValueInfo8 = hi08ValueInfo8;
    }

    public HiValueInfo withHi08ValueInfo8(String hi08ValueInfo8) {
        this.hi08ValueInfo8 = hi08ValueInfo8;
        return this;
    }

    @JsonProperty("hi08_01_valueInfoQlfr8")
    public String getHi0801ValueInfoQlfr8() {
        return hi0801ValueInfoQlfr8;
    }

    @JsonProperty("hi08_01_valueInfoQlfr8")
    public void setHi0801ValueInfoQlfr8(String hi0801ValueInfoQlfr8) {
        this.hi0801ValueInfoQlfr8 = hi0801ValueInfoQlfr8;
    }

    public HiValueInfo withHi0801ValueInfoQlfr8(String hi0801ValueInfoQlfr8) {
        this.hi0801ValueInfoQlfr8 = hi0801ValueInfoQlfr8;
        return this;
    }

    @JsonProperty("hi08_02_valueCode8")
    public String getHi0802ValueCode8() {
        return hi0802ValueCode8;
    }

    @JsonProperty("hi08_02_valueCode8")
    public void setHi0802ValueCode8(String hi0802ValueCode8) {
        this.hi0802ValueCode8 = hi0802ValueCode8;
    }

    public HiValueInfo withHi0802ValueCode8(String hi0802ValueCode8) {
        this.hi0802ValueCode8 = hi0802ValueCode8;
        return this;
    }

    @JsonProperty("hi08_05_valueCodeAmount8")
    public String getHi0805ValueCodeAmount8() {
        return hi0805ValueCodeAmount8;
    }

    @JsonProperty("hi08_05_valueCodeAmount8")
    public void setHi0805ValueCodeAmount8(String hi0805ValueCodeAmount8) {
        this.hi0805ValueCodeAmount8 = hi0805ValueCodeAmount8;
    }

    public HiValueInfo withHi0805ValueCodeAmount8(String hi0805ValueCodeAmount8) {
        this.hi0805ValueCodeAmount8 = hi0805ValueCodeAmount8;
        return this;
    }

    @JsonProperty("hi09_valueInfo9")
    public String getHi09ValueInfo9() {
        return hi09ValueInfo9;
    }

    @JsonProperty("hi09_valueInfo9")
    public void setHi09ValueInfo9(String hi09ValueInfo9) {
        this.hi09ValueInfo9 = hi09ValueInfo9;
    }

    public HiValueInfo withHi09ValueInfo9(String hi09ValueInfo9) {
        this.hi09ValueInfo9 = hi09ValueInfo9;
        return this;
    }

    @JsonProperty("hi09_01_valueInfoQlfr9")
    public String getHi0901ValueInfoQlfr9() {
        return hi0901ValueInfoQlfr9;
    }

    @JsonProperty("hi09_01_valueInfoQlfr9")
    public void setHi0901ValueInfoQlfr9(String hi0901ValueInfoQlfr9) {
        this.hi0901ValueInfoQlfr9 = hi0901ValueInfoQlfr9;
    }

    public HiValueInfo withHi0901ValueInfoQlfr9(String hi0901ValueInfoQlfr9) {
        this.hi0901ValueInfoQlfr9 = hi0901ValueInfoQlfr9;
        return this;
    }

    @JsonProperty("hi09_02_valueCode9")
    public String getHi0902ValueCode9() {
        return hi0902ValueCode9;
    }

    @JsonProperty("hi09_02_valueCode9")
    public void setHi0902ValueCode9(String hi0902ValueCode9) {
        this.hi0902ValueCode9 = hi0902ValueCode9;
    }

    public HiValueInfo withHi0902ValueCode9(String hi0902ValueCode9) {
        this.hi0902ValueCode9 = hi0902ValueCode9;
        return this;
    }

    @JsonProperty("hi09_05_valueCodeAmount9")
    public String getHi0905ValueCodeAmount9() {
        return hi0905ValueCodeAmount9;
    }

    @JsonProperty("hi09_05_valueCodeAmount9")
    public void setHi0905ValueCodeAmount9(String hi0905ValueCodeAmount9) {
        this.hi0905ValueCodeAmount9 = hi0905ValueCodeAmount9;
    }

    public HiValueInfo withHi0905ValueCodeAmount9(String hi0905ValueCodeAmount9) {
        this.hi0905ValueCodeAmount9 = hi0905ValueCodeAmount9;
        return this;
    }

    @JsonProperty("hi10_valueInfo10")
    public String getHi10ValueInfo10() {
        return hi10ValueInfo10;
    }

    @JsonProperty("hi10_valueInfo10")
    public void setHi10ValueInfo10(String hi10ValueInfo10) {
        this.hi10ValueInfo10 = hi10ValueInfo10;
    }

    public HiValueInfo withHi10ValueInfo10(String hi10ValueInfo10) {
        this.hi10ValueInfo10 = hi10ValueInfo10;
        return this;
    }

    @JsonProperty("hi10_01_valueInfoQlfr10")
    public String getHi1001ValueInfoQlfr10() {
        return hi1001ValueInfoQlfr10;
    }

    @JsonProperty("hi10_01_valueInfoQlfr10")
    public void setHi1001ValueInfoQlfr10(String hi1001ValueInfoQlfr10) {
        this.hi1001ValueInfoQlfr10 = hi1001ValueInfoQlfr10;
    }

    public HiValueInfo withHi1001ValueInfoQlfr10(String hi1001ValueInfoQlfr10) {
        this.hi1001ValueInfoQlfr10 = hi1001ValueInfoQlfr10;
        return this;
    }

    @JsonProperty("hi10_02_valueCode10")
    public String getHi1002ValueCode10() {
        return hi1002ValueCode10;
    }

    @JsonProperty("hi10_02_valueCode10")
    public void setHi1002ValueCode10(String hi1002ValueCode10) {
        this.hi1002ValueCode10 = hi1002ValueCode10;
    }

    public HiValueInfo withHi1002ValueCode10(String hi1002ValueCode10) {
        this.hi1002ValueCode10 = hi1002ValueCode10;
        return this;
    }

    @JsonProperty("hi10_05_valueCodeAmount10")
    public String getHi1005ValueCodeAmount10() {
        return hi1005ValueCodeAmount10;
    }

    @JsonProperty("hi10_05_valueCodeAmount10")
    public void setHi1005ValueCodeAmount10(String hi1005ValueCodeAmount10) {
        this.hi1005ValueCodeAmount10 = hi1005ValueCodeAmount10;
    }

    public HiValueInfo withHi1005ValueCodeAmount10(String hi1005ValueCodeAmount10) {
        this.hi1005ValueCodeAmount10 = hi1005ValueCodeAmount10;
        return this;
    }

    @JsonProperty("hi11_valueInfo11")
    public String getHi11ValueInfo11() {
        return hi11ValueInfo11;
    }

    @JsonProperty("hi11_valueInfo11")
    public void setHi11ValueInfo11(String hi11ValueInfo11) {
        this.hi11ValueInfo11 = hi11ValueInfo11;
    }

    public HiValueInfo withHi11ValueInfo11(String hi11ValueInfo11) {
        this.hi11ValueInfo11 = hi11ValueInfo11;
        return this;
    }

    @JsonProperty("hi11_01_valueInfoQlfr11")
    public String getHi1101ValueInfoQlfr11() {
        return hi1101ValueInfoQlfr11;
    }

    @JsonProperty("hi11_01_valueInfoQlfr11")
    public void setHi1101ValueInfoQlfr11(String hi1101ValueInfoQlfr11) {
        this.hi1101ValueInfoQlfr11 = hi1101ValueInfoQlfr11;
    }

    public HiValueInfo withHi1101ValueInfoQlfr11(String hi1101ValueInfoQlfr11) {
        this.hi1101ValueInfoQlfr11 = hi1101ValueInfoQlfr11;
        return this;
    }

    @JsonProperty("hi11_02_valueCode11")
    public String getHi1102ValueCode11() {
        return hi1102ValueCode11;
    }

    @JsonProperty("hi11_02_valueCode11")
    public void setHi1102ValueCode11(String hi1102ValueCode11) {
        this.hi1102ValueCode11 = hi1102ValueCode11;
    }

    public HiValueInfo withHi1102ValueCode11(String hi1102ValueCode11) {
        this.hi1102ValueCode11 = hi1102ValueCode11;
        return this;
    }

    @JsonProperty("hi11_05_valueCodeAmount11")
    public String getHi1105ValueCodeAmount11() {
        return hi1105ValueCodeAmount11;
    }

    @JsonProperty("hi11_05_valueCodeAmount11")
    public void setHi1105ValueCodeAmount11(String hi1105ValueCodeAmount11) {
        this.hi1105ValueCodeAmount11 = hi1105ValueCodeAmount11;
    }

    public HiValueInfo withHi1105ValueCodeAmount11(String hi1105ValueCodeAmount11) {
        this.hi1105ValueCodeAmount11 = hi1105ValueCodeAmount11;
        return this;
    }

    @JsonProperty("hi12_valueInfo12")
    public String getHi12ValueInfo12() {
        return hi12ValueInfo12;
    }

    @JsonProperty("hi12_valueInfo12")
    public void setHi12ValueInfo12(String hi12ValueInfo12) {
        this.hi12ValueInfo12 = hi12ValueInfo12;
    }

    public HiValueInfo withHi12ValueInfo12(String hi12ValueInfo12) {
        this.hi12ValueInfo12 = hi12ValueInfo12;
        return this;
    }

    @JsonProperty("hi12_01_valueInfoQlfr12")
    public String getHi1201ValueInfoQlfr12() {
        return hi1201ValueInfoQlfr12;
    }

    @JsonProperty("hi12_01_valueInfoQlfr12")
    public void setHi1201ValueInfoQlfr12(String hi1201ValueInfoQlfr12) {
        this.hi1201ValueInfoQlfr12 = hi1201ValueInfoQlfr12;
    }

    public HiValueInfo withHi1201ValueInfoQlfr12(String hi1201ValueInfoQlfr12) {
        this.hi1201ValueInfoQlfr12 = hi1201ValueInfoQlfr12;
        return this;
    }

    @JsonProperty("hi12_02_valueCode12")
    public String getHi1202ValueCode12() {
        return hi1202ValueCode12;
    }

    @JsonProperty("hi12_02_valueCode12")
    public void setHi1202ValueCode12(String hi1202ValueCode12) {
        this.hi1202ValueCode12 = hi1202ValueCode12;
    }

    public HiValueInfo withHi1202ValueCode12(String hi1202ValueCode12) {
        this.hi1202ValueCode12 = hi1202ValueCode12;
        return this;
    }

    @JsonProperty("hi12_05_valueCodeAmount12")
    public String getHi1205ValueCodeAmount12() {
        return hi1205ValueCodeAmount12;
    }

    @JsonProperty("hi12_05_valueCodeAmount12")
    public void setHi1205ValueCodeAmount12(String hi1205ValueCodeAmount12) {
        this.hi1205ValueCodeAmount12 = hi1205ValueCodeAmount12;
    }

    public HiValueInfo withHi1205ValueCodeAmount12(String hi1205ValueCodeAmount12) {
        this.hi1205ValueCodeAmount12 = hi1205ValueCodeAmount12;
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

    public HiValueInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hi01ValueInfo1).append(hi0101ValueInfoQlfr1).append(hi0102ValueCode1).append(hi0105ValueCodeAmount1).append(hi02ValueInfo2).append(hi0201ValueInfoQlfr2).append(hi0202ValueCode2).append(hi0205ValueCodeAmount2).append(hi03ValueInfo3).append(hi0301ValueInfoQlfr3).append(hi0302ValueCode3).append(hi0305ValueCodeAmount3).append(hi04ValueInfo4).append(hi0401ValueInfoQlfr4).append(hi0402ValueCode4).append(hi0405ValueCodeAmount4).append(hi05ValueInfo5).append(hi0501ValueInfoQlfr5).append(hi0502ValueCode5).append(hi0505ValueCodeAmount5).append(hi06ValueInfo6).append(hi0601ValueInfoQlfr6).append(hi0602ValueCode6).append(hi0605ValueCodeAmount6).append(hi07ValueInfo7).append(hi0701ValueInfoQlfr7).append(hi0702ValueCode7).append(hi0705ValueCodeAmount7).append(hi08ValueInfo8).append(hi0801ValueInfoQlfr8).append(hi0802ValueCode8).append(hi0805ValueCodeAmount8).append(hi09ValueInfo9).append(hi0901ValueInfoQlfr9).append(hi0902ValueCode9).append(hi0905ValueCodeAmount9).append(hi10ValueInfo10).append(hi1001ValueInfoQlfr10).append(hi1002ValueCode10).append(hi1005ValueCodeAmount10).append(hi11ValueInfo11).append(hi1101ValueInfoQlfr11).append(hi1102ValueCode11).append(hi1105ValueCodeAmount11).append(hi12ValueInfo12).append(hi1201ValueInfoQlfr12).append(hi1202ValueCode12).append(hi1205ValueCodeAmount12).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiValueInfo) == false) {
            return false;
        }
        HiValueInfo rhs = ((HiValueInfo) other);
        return new EqualsBuilder().append(hi01ValueInfo1, rhs.hi01ValueInfo1).append(hi0101ValueInfoQlfr1, rhs.hi0101ValueInfoQlfr1).append(hi0102ValueCode1, rhs.hi0102ValueCode1).append(hi0105ValueCodeAmount1, rhs.hi0105ValueCodeAmount1).append(hi02ValueInfo2, rhs.hi02ValueInfo2).append(hi0201ValueInfoQlfr2, rhs.hi0201ValueInfoQlfr2).append(hi0202ValueCode2, rhs.hi0202ValueCode2).append(hi0205ValueCodeAmount2, rhs.hi0205ValueCodeAmount2).append(hi03ValueInfo3, rhs.hi03ValueInfo3).append(hi0301ValueInfoQlfr3, rhs.hi0301ValueInfoQlfr3).append(hi0302ValueCode3, rhs.hi0302ValueCode3).append(hi0305ValueCodeAmount3, rhs.hi0305ValueCodeAmount3).append(hi04ValueInfo4, rhs.hi04ValueInfo4).append(hi0401ValueInfoQlfr4, rhs.hi0401ValueInfoQlfr4).append(hi0402ValueCode4, rhs.hi0402ValueCode4).append(hi0405ValueCodeAmount4, rhs.hi0405ValueCodeAmount4).append(hi05ValueInfo5, rhs.hi05ValueInfo5).append(hi0501ValueInfoQlfr5, rhs.hi0501ValueInfoQlfr5).append(hi0502ValueCode5, rhs.hi0502ValueCode5).append(hi0505ValueCodeAmount5, rhs.hi0505ValueCodeAmount5).append(hi06ValueInfo6, rhs.hi06ValueInfo6).append(hi0601ValueInfoQlfr6, rhs.hi0601ValueInfoQlfr6).append(hi0602ValueCode6, rhs.hi0602ValueCode6).append(hi0605ValueCodeAmount6, rhs.hi0605ValueCodeAmount6).append(hi07ValueInfo7, rhs.hi07ValueInfo7).append(hi0701ValueInfoQlfr7, rhs.hi0701ValueInfoQlfr7).append(hi0702ValueCode7, rhs.hi0702ValueCode7).append(hi0705ValueCodeAmount7, rhs.hi0705ValueCodeAmount7).append(hi08ValueInfo8, rhs.hi08ValueInfo8).append(hi0801ValueInfoQlfr8, rhs.hi0801ValueInfoQlfr8).append(hi0802ValueCode8, rhs.hi0802ValueCode8).append(hi0805ValueCodeAmount8, rhs.hi0805ValueCodeAmount8).append(hi09ValueInfo9, rhs.hi09ValueInfo9).append(hi0901ValueInfoQlfr9, rhs.hi0901ValueInfoQlfr9).append(hi0902ValueCode9, rhs.hi0902ValueCode9).append(hi0905ValueCodeAmount9, rhs.hi0905ValueCodeAmount9).append(hi10ValueInfo10, rhs.hi10ValueInfo10).append(hi1001ValueInfoQlfr10, rhs.hi1001ValueInfoQlfr10).append(hi1002ValueCode10, rhs.hi1002ValueCode10).append(hi1005ValueCodeAmount10, rhs.hi1005ValueCodeAmount10).append(hi11ValueInfo11, rhs.hi11ValueInfo11).append(hi1101ValueInfoQlfr11, rhs.hi1101ValueInfoQlfr11).append(hi1102ValueCode11, rhs.hi1102ValueCode11).append(hi1105ValueCodeAmount11, rhs.hi1105ValueCodeAmount11).append(hi12ValueInfo12, rhs.hi12ValueInfo12).append(hi1201ValueInfoQlfr12, rhs.hi1201ValueInfoQlfr12).append(hi1202ValueCode12, rhs.hi1202ValueCode12).append(hi1205ValueCodeAmount12, rhs.hi1205ValueCodeAmount12).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "cas01_claimadjustmentgroupcode",
    "cas02_claimadjustmentreasoncode1",
    "cas03_adjustmentamount1",
    "cas04_adjustmentquantity1",
    "cas05_claimadjustmentgroupcode2",
    "cas06_adjustmentamount2",
    "cas07_adjustmentquantity2",
    "cas08_claimadjustmentgroupcode3",
    "cas09_adjustmentamount3",
    "cas10_adjustmentquantity3",
    "cas11_claimadjustmentgroupcode4",
    "cas12_adjustmentamount4",
    "cas13_adjustmentquantity4",
    "cas14_claimadjustmentgroupcode5",
    "cas15_adjustmentamount5",
    "cas16_adjustmentquantity5",
    "cas17_claimadjustmentgroupcode6",
    "cas18_adjustmentamount6",
    "cas19_adjustmentquantity6"
})
public class Clmadjudicationinfo__ {

    @JsonProperty("cas01_claimadjustmentgroupcode")
    private String cas01Claimadjustmentgroupcode;
    @JsonProperty("cas02_claimadjustmentreasoncode1")
    private String cas02Claimadjustmentreasoncode1;
    @JsonProperty("cas03_adjustmentamount1")
    private String cas03Adjustmentamount1;
    @JsonProperty("cas04_adjustmentquantity1")
    private String cas04Adjustmentquantity1;
    @JsonProperty("cas05_claimadjustmentgroupcode2")
    private String cas05Claimadjustmentgroupcode2;
    @JsonProperty("cas06_adjustmentamount2")
    private String cas06Adjustmentamount2;
    @JsonProperty("cas07_adjustmentquantity2")
    private String cas07Adjustmentquantity2;
    @JsonProperty("cas08_claimadjustmentgroupcode3")
    private String cas08Claimadjustmentgroupcode3;
    @JsonProperty("cas09_adjustmentamount3")
    private String cas09Adjustmentamount3;
    @JsonProperty("cas10_adjustmentquantity3")
    private String cas10Adjustmentquantity3;
    @JsonProperty("cas11_claimadjustmentgroupcode4")
    private String cas11Claimadjustmentgroupcode4;
    @JsonProperty("cas12_adjustmentamount4")
    private String cas12Adjustmentamount4;
    @JsonProperty("cas13_adjustmentquantity4")
    private String cas13Adjustmentquantity4;
    @JsonProperty("cas14_claimadjustmentgroupcode5")
    private String cas14Claimadjustmentgroupcode5;
    @JsonProperty("cas15_adjustmentamount5")
    private String cas15Adjustmentamount5;
    @JsonProperty("cas16_adjustmentquantity5")
    private String cas16Adjustmentquantity5;
    @JsonProperty("cas17_claimadjustmentgroupcode6")
    private String cas17Claimadjustmentgroupcode6;
    @JsonProperty("cas18_adjustmentamount6")
    private String cas18Adjustmentamount6;
    @JsonProperty("cas19_adjustmentquantity6")
    private String cas19Adjustmentquantity6;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cas01_claimadjustmentgroupcode")
    public String getCas01Claimadjustmentgroupcode() {
        return cas01Claimadjustmentgroupcode;
    }

    @JsonProperty("cas01_claimadjustmentgroupcode")
    public void setCas01Claimadjustmentgroupcode(String cas01Claimadjustmentgroupcode) {
        this.cas01Claimadjustmentgroupcode = cas01Claimadjustmentgroupcode;
    }

    public Clmadjudicationinfo__ withCas01Claimadjustmentgroupcode(String cas01Claimadjustmentgroupcode) {
        this.cas01Claimadjustmentgroupcode = cas01Claimadjustmentgroupcode;
        return this;
    }

    @JsonProperty("cas02_claimadjustmentreasoncode1")
    public String getCas02Claimadjustmentreasoncode1() {
        return cas02Claimadjustmentreasoncode1;
    }

    @JsonProperty("cas02_claimadjustmentreasoncode1")
    public void setCas02Claimadjustmentreasoncode1(String cas02Claimadjustmentreasoncode1) {
        this.cas02Claimadjustmentreasoncode1 = cas02Claimadjustmentreasoncode1;
    }

    public Clmadjudicationinfo__ withCas02Claimadjustmentreasoncode1(String cas02Claimadjustmentreasoncode1) {
        this.cas02Claimadjustmentreasoncode1 = cas02Claimadjustmentreasoncode1;
        return this;
    }

    @JsonProperty("cas03_adjustmentamount1")
    public String getCas03Adjustmentamount1() {
        return cas03Adjustmentamount1;
    }

    @JsonProperty("cas03_adjustmentamount1")
    public void setCas03Adjustmentamount1(String cas03Adjustmentamount1) {
        this.cas03Adjustmentamount1 = cas03Adjustmentamount1;
    }

    public Clmadjudicationinfo__ withCas03Adjustmentamount1(String cas03Adjustmentamount1) {
        this.cas03Adjustmentamount1 = cas03Adjustmentamount1;
        return this;
    }

    @JsonProperty("cas04_adjustmentquantity1")
    public String getCas04Adjustmentquantity1() {
        return cas04Adjustmentquantity1;
    }

    @JsonProperty("cas04_adjustmentquantity1")
    public void setCas04Adjustmentquantity1(String cas04Adjustmentquantity1) {
        this.cas04Adjustmentquantity1 = cas04Adjustmentquantity1;
    }

    public Clmadjudicationinfo__ withCas04Adjustmentquantity1(String cas04Adjustmentquantity1) {
        this.cas04Adjustmentquantity1 = cas04Adjustmentquantity1;
        return this;
    }

    @JsonProperty("cas05_claimadjustmentgroupcode2")
    public String getCas05Claimadjustmentgroupcode2() {
        return cas05Claimadjustmentgroupcode2;
    }

    @JsonProperty("cas05_claimadjustmentgroupcode2")
    public void setCas05Claimadjustmentgroupcode2(String cas05Claimadjustmentgroupcode2) {
        this.cas05Claimadjustmentgroupcode2 = cas05Claimadjustmentgroupcode2;
    }

    public Clmadjudicationinfo__ withCas05Claimadjustmentgroupcode2(String cas05Claimadjustmentgroupcode2) {
        this.cas05Claimadjustmentgroupcode2 = cas05Claimadjustmentgroupcode2;
        return this;
    }

    @JsonProperty("cas06_adjustmentamount2")
    public String getCas06Adjustmentamount2() {
        return cas06Adjustmentamount2;
    }

    @JsonProperty("cas06_adjustmentamount2")
    public void setCas06Adjustmentamount2(String cas06Adjustmentamount2) {
        this.cas06Adjustmentamount2 = cas06Adjustmentamount2;
    }

    public Clmadjudicationinfo__ withCas06Adjustmentamount2(String cas06Adjustmentamount2) {
        this.cas06Adjustmentamount2 = cas06Adjustmentamount2;
        return this;
    }

    @JsonProperty("cas07_adjustmentquantity2")
    public String getCas07Adjustmentquantity2() {
        return cas07Adjustmentquantity2;
    }

    @JsonProperty("cas07_adjustmentquantity2")
    public void setCas07Adjustmentquantity2(String cas07Adjustmentquantity2) {
        this.cas07Adjustmentquantity2 = cas07Adjustmentquantity2;
    }

    public Clmadjudicationinfo__ withCas07Adjustmentquantity2(String cas07Adjustmentquantity2) {
        this.cas07Adjustmentquantity2 = cas07Adjustmentquantity2;
        return this;
    }

    @JsonProperty("cas08_claimadjustmentgroupcode3")
    public String getCas08Claimadjustmentgroupcode3() {
        return cas08Claimadjustmentgroupcode3;
    }

    @JsonProperty("cas08_claimadjustmentgroupcode3")
    public void setCas08Claimadjustmentgroupcode3(String cas08Claimadjustmentgroupcode3) {
        this.cas08Claimadjustmentgroupcode3 = cas08Claimadjustmentgroupcode3;
    }

    public Clmadjudicationinfo__ withCas08Claimadjustmentgroupcode3(String cas08Claimadjustmentgroupcode3) {
        this.cas08Claimadjustmentgroupcode3 = cas08Claimadjustmentgroupcode3;
        return this;
    }

    @JsonProperty("cas09_adjustmentamount3")
    public String getCas09Adjustmentamount3() {
        return cas09Adjustmentamount3;
    }

    @JsonProperty("cas09_adjustmentamount3")
    public void setCas09Adjustmentamount3(String cas09Adjustmentamount3) {
        this.cas09Adjustmentamount3 = cas09Adjustmentamount3;
    }

    public Clmadjudicationinfo__ withCas09Adjustmentamount3(String cas09Adjustmentamount3) {
        this.cas09Adjustmentamount3 = cas09Adjustmentamount3;
        return this;
    }

    @JsonProperty("cas10_adjustmentquantity3")
    public String getCas10Adjustmentquantity3() {
        return cas10Adjustmentquantity3;
    }

    @JsonProperty("cas10_adjustmentquantity3")
    public void setCas10Adjustmentquantity3(String cas10Adjustmentquantity3) {
        this.cas10Adjustmentquantity3 = cas10Adjustmentquantity3;
    }

    public Clmadjudicationinfo__ withCas10Adjustmentquantity3(String cas10Adjustmentquantity3) {
        this.cas10Adjustmentquantity3 = cas10Adjustmentquantity3;
        return this;
    }

    @JsonProperty("cas11_claimadjustmentgroupcode4")
    public String getCas11Claimadjustmentgroupcode4() {
        return cas11Claimadjustmentgroupcode4;
    }

    @JsonProperty("cas11_claimadjustmentgroupcode4")
    public void setCas11Claimadjustmentgroupcode4(String cas11Claimadjustmentgroupcode4) {
        this.cas11Claimadjustmentgroupcode4 = cas11Claimadjustmentgroupcode4;
    }

    public Clmadjudicationinfo__ withCas11Claimadjustmentgroupcode4(String cas11Claimadjustmentgroupcode4) {
        this.cas11Claimadjustmentgroupcode4 = cas11Claimadjustmentgroupcode4;
        return this;
    }

    @JsonProperty("cas12_adjustmentamount4")
    public String getCas12Adjustmentamount4() {
        return cas12Adjustmentamount4;
    }

    @JsonProperty("cas12_adjustmentamount4")
    public void setCas12Adjustmentamount4(String cas12Adjustmentamount4) {
        this.cas12Adjustmentamount4 = cas12Adjustmentamount4;
    }

    public Clmadjudicationinfo__ withCas12Adjustmentamount4(String cas12Adjustmentamount4) {
        this.cas12Adjustmentamount4 = cas12Adjustmentamount4;
        return this;
    }

    @JsonProperty("cas13_adjustmentquantity4")
    public String getCas13Adjustmentquantity4() {
        return cas13Adjustmentquantity4;
    }

    @JsonProperty("cas13_adjustmentquantity4")
    public void setCas13Adjustmentquantity4(String cas13Adjustmentquantity4) {
        this.cas13Adjustmentquantity4 = cas13Adjustmentquantity4;
    }

    public Clmadjudicationinfo__ withCas13Adjustmentquantity4(String cas13Adjustmentquantity4) {
        this.cas13Adjustmentquantity4 = cas13Adjustmentquantity4;
        return this;
    }

    @JsonProperty("cas14_claimadjustmentgroupcode5")
    public String getCas14Claimadjustmentgroupcode5() {
        return cas14Claimadjustmentgroupcode5;
    }

    @JsonProperty("cas14_claimadjustmentgroupcode5")
    public void setCas14Claimadjustmentgroupcode5(String cas14Claimadjustmentgroupcode5) {
        this.cas14Claimadjustmentgroupcode5 = cas14Claimadjustmentgroupcode5;
    }

    public Clmadjudicationinfo__ withCas14Claimadjustmentgroupcode5(String cas14Claimadjustmentgroupcode5) {
        this.cas14Claimadjustmentgroupcode5 = cas14Claimadjustmentgroupcode5;
        return this;
    }

    @JsonProperty("cas15_adjustmentamount5")
    public String getCas15Adjustmentamount5() {
        return cas15Adjustmentamount5;
    }

    @JsonProperty("cas15_adjustmentamount5")
    public void setCas15Adjustmentamount5(String cas15Adjustmentamount5) {
        this.cas15Adjustmentamount5 = cas15Adjustmentamount5;
    }

    public Clmadjudicationinfo__ withCas15Adjustmentamount5(String cas15Adjustmentamount5) {
        this.cas15Adjustmentamount5 = cas15Adjustmentamount5;
        return this;
    }

    @JsonProperty("cas16_adjustmentquantity5")
    public String getCas16Adjustmentquantity5() {
        return cas16Adjustmentquantity5;
    }

    @JsonProperty("cas16_adjustmentquantity5")
    public void setCas16Adjustmentquantity5(String cas16Adjustmentquantity5) {
        this.cas16Adjustmentquantity5 = cas16Adjustmentquantity5;
    }

    public Clmadjudicationinfo__ withCas16Adjustmentquantity5(String cas16Adjustmentquantity5) {
        this.cas16Adjustmentquantity5 = cas16Adjustmentquantity5;
        return this;
    }

    @JsonProperty("cas17_claimadjustmentgroupcode6")
    public String getCas17Claimadjustmentgroupcode6() {
        return cas17Claimadjustmentgroupcode6;
    }

    @JsonProperty("cas17_claimadjustmentgroupcode6")
    public void setCas17Claimadjustmentgroupcode6(String cas17Claimadjustmentgroupcode6) {
        this.cas17Claimadjustmentgroupcode6 = cas17Claimadjustmentgroupcode6;
    }

    public Clmadjudicationinfo__ withCas17Claimadjustmentgroupcode6(String cas17Claimadjustmentgroupcode6) {
        this.cas17Claimadjustmentgroupcode6 = cas17Claimadjustmentgroupcode6;
        return this;
    }

    @JsonProperty("cas18_adjustmentamount6")
    public String getCas18Adjustmentamount6() {
        return cas18Adjustmentamount6;
    }

    @JsonProperty("cas18_adjustmentamount6")
    public void setCas18Adjustmentamount6(String cas18Adjustmentamount6) {
        this.cas18Adjustmentamount6 = cas18Adjustmentamount6;
    }

    public Clmadjudicationinfo__ withCas18Adjustmentamount6(String cas18Adjustmentamount6) {
        this.cas18Adjustmentamount6 = cas18Adjustmentamount6;
        return this;
    }

    @JsonProperty("cas19_adjustmentquantity6")
    public String getCas19Adjustmentquantity6() {
        return cas19Adjustmentquantity6;
    }

    @JsonProperty("cas19_adjustmentquantity6")
    public void setCas19Adjustmentquantity6(String cas19Adjustmentquantity6) {
        this.cas19Adjustmentquantity6 = cas19Adjustmentquantity6;
    }

    public Clmadjudicationinfo__ withCas19Adjustmentquantity6(String cas19Adjustmentquantity6) {
        this.cas19Adjustmentquantity6 = cas19Adjustmentquantity6;
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

    public Clmadjudicationinfo__ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cas01Claimadjustmentgroupcode).append(cas02Claimadjustmentreasoncode1).append(cas03Adjustmentamount1).append(cas04Adjustmentquantity1).append(cas05Claimadjustmentgroupcode2).append(cas06Adjustmentamount2).append(cas07Adjustmentquantity2).append(cas08Claimadjustmentgroupcode3).append(cas09Adjustmentamount3).append(cas10Adjustmentquantity3).append(cas11Claimadjustmentgroupcode4).append(cas12Adjustmentamount4).append(cas13Adjustmentquantity4).append(cas14Claimadjustmentgroupcode5).append(cas15Adjustmentamount5).append(cas16Adjustmentquantity5).append(cas17Claimadjustmentgroupcode6).append(cas18Adjustmentamount6).append(cas19Adjustmentquantity6).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Clmadjudicationinfo__) == false) {
            return false;
        }
        Clmadjudicationinfo__ rhs = ((Clmadjudicationinfo__) other);
        return new EqualsBuilder().append(cas01Claimadjustmentgroupcode, rhs.cas01Claimadjustmentgroupcode).append(cas02Claimadjustmentreasoncode1, rhs.cas02Claimadjustmentreasoncode1).append(cas03Adjustmentamount1, rhs.cas03Adjustmentamount1).append(cas04Adjustmentquantity1, rhs.cas04Adjustmentquantity1).append(cas05Claimadjustmentgroupcode2, rhs.cas05Claimadjustmentgroupcode2).append(cas06Adjustmentamount2, rhs.cas06Adjustmentamount2).append(cas07Adjustmentquantity2, rhs.cas07Adjustmentquantity2).append(cas08Claimadjustmentgroupcode3, rhs.cas08Claimadjustmentgroupcode3).append(cas09Adjustmentamount3, rhs.cas09Adjustmentamount3).append(cas10Adjustmentquantity3, rhs.cas10Adjustmentquantity3).append(cas11Claimadjustmentgroupcode4, rhs.cas11Claimadjustmentgroupcode4).append(cas12Adjustmentamount4, rhs.cas12Adjustmentamount4).append(cas13Adjustmentquantity4, rhs.cas13Adjustmentquantity4).append(cas14Claimadjustmentgroupcode5, rhs.cas14Claimadjustmentgroupcode5).append(cas15Adjustmentamount5, rhs.cas15Adjustmentamount5).append(cas16Adjustmentquantity5, rhs.cas16Adjustmentquantity5).append(cas17Claimadjustmentgroupcode6, rhs.cas17Claimadjustmentgroupcode6).append(cas18Adjustmentamount6, rhs.cas18Adjustmentamount6).append(cas19Adjustmentquantity6, rhs.cas19Adjustmentquantity6).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

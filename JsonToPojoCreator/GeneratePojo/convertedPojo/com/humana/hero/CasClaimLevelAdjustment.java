
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
    "cas01_claimAdjustmentGroupCode",
    "cas02_adjustmentReasonCode1",
    "cas03_adjustmentAmount1",
    "cas04_adjustmentQuantity1",
    "cas05_adjustmentReasonCode2",
    "cas06_adjustmentAmount2",
    "cas07_adjustmentQuantity2",
    "cas08_adjustmentReasonCode3",
    "cas09_adjustmentAmount3",
    "cas10_adjustmentQuantity3",
    "cas11_adjustmentReasonCode4",
    "cas12_adjustmentAmount4",
    "cas13_adjustmentQuantity4",
    "cas14_adjustmentReasonCode5",
    "cas15_adjustmentAmount5",
    "cas16_adjustmentQuantity5",
    "cas17_adjustmentReasonCode6",
    "cas18_adjustmentAmount6",
    "cas19_adjustmentQuantity6"
})
public class CasClaimLevelAdjustment {

    @JsonProperty("cas01_claimAdjustmentGroupCode")
    private String cas01ClaimAdjustmentGroupCode;
    @JsonProperty("cas02_adjustmentReasonCode1")
    private String cas02AdjustmentReasonCode1;
    @JsonProperty("cas03_adjustmentAmount1")
    private String cas03AdjustmentAmount1;
    @JsonProperty("cas04_adjustmentQuantity1")
    private String cas04AdjustmentQuantity1;
    @JsonProperty("cas05_adjustmentReasonCode2")
    private String cas05AdjustmentReasonCode2;
    @JsonProperty("cas06_adjustmentAmount2")
    private String cas06AdjustmentAmount2;
    @JsonProperty("cas07_adjustmentQuantity2")
    private String cas07AdjustmentQuantity2;
    @JsonProperty("cas08_adjustmentReasonCode3")
    private String cas08AdjustmentReasonCode3;
    @JsonProperty("cas09_adjustmentAmount3")
    private String cas09AdjustmentAmount3;
    @JsonProperty("cas10_adjustmentQuantity3")
    private String cas10AdjustmentQuantity3;
    @JsonProperty("cas11_adjustmentReasonCode4")
    private String cas11AdjustmentReasonCode4;
    @JsonProperty("cas12_adjustmentAmount4")
    private String cas12AdjustmentAmount4;
    @JsonProperty("cas13_adjustmentQuantity4")
    private String cas13AdjustmentQuantity4;
    @JsonProperty("cas14_adjustmentReasonCode5")
    private String cas14AdjustmentReasonCode5;
    @JsonProperty("cas15_adjustmentAmount5")
    private String cas15AdjustmentAmount5;
    @JsonProperty("cas16_adjustmentQuantity5")
    private String cas16AdjustmentQuantity5;
    @JsonProperty("cas17_adjustmentReasonCode6")
    private String cas17AdjustmentReasonCode6;
    @JsonProperty("cas18_adjustmentAmount6")
    private String cas18AdjustmentAmount6;
    @JsonProperty("cas19_adjustmentQuantity6")
    private String cas19AdjustmentQuantity6;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cas01_claimAdjustmentGroupCode")
    public String getCas01ClaimAdjustmentGroupCode() {
        return cas01ClaimAdjustmentGroupCode;
    }

    @JsonProperty("cas01_claimAdjustmentGroupCode")
    public void setCas01ClaimAdjustmentGroupCode(String cas01ClaimAdjustmentGroupCode) {
        this.cas01ClaimAdjustmentGroupCode = cas01ClaimAdjustmentGroupCode;
    }

    public CasClaimLevelAdjustment withCas01ClaimAdjustmentGroupCode(String cas01ClaimAdjustmentGroupCode) {
        this.cas01ClaimAdjustmentGroupCode = cas01ClaimAdjustmentGroupCode;
        return this;
    }

    @JsonProperty("cas02_adjustmentReasonCode1")
    public String getCas02AdjustmentReasonCode1() {
        return cas02AdjustmentReasonCode1;
    }

    @JsonProperty("cas02_adjustmentReasonCode1")
    public void setCas02AdjustmentReasonCode1(String cas02AdjustmentReasonCode1) {
        this.cas02AdjustmentReasonCode1 = cas02AdjustmentReasonCode1;
    }

    public CasClaimLevelAdjustment withCas02AdjustmentReasonCode1(String cas02AdjustmentReasonCode1) {
        this.cas02AdjustmentReasonCode1 = cas02AdjustmentReasonCode1;
        return this;
    }

    @JsonProperty("cas03_adjustmentAmount1")
    public String getCas03AdjustmentAmount1() {
        return cas03AdjustmentAmount1;
    }

    @JsonProperty("cas03_adjustmentAmount1")
    public void setCas03AdjustmentAmount1(String cas03AdjustmentAmount1) {
        this.cas03AdjustmentAmount1 = cas03AdjustmentAmount1;
    }

    public CasClaimLevelAdjustment withCas03AdjustmentAmount1(String cas03AdjustmentAmount1) {
        this.cas03AdjustmentAmount1 = cas03AdjustmentAmount1;
        return this;
    }

    @JsonProperty("cas04_adjustmentQuantity1")
    public String getCas04AdjustmentQuantity1() {
        return cas04AdjustmentQuantity1;
    }

    @JsonProperty("cas04_adjustmentQuantity1")
    public void setCas04AdjustmentQuantity1(String cas04AdjustmentQuantity1) {
        this.cas04AdjustmentQuantity1 = cas04AdjustmentQuantity1;
    }

    public CasClaimLevelAdjustment withCas04AdjustmentQuantity1(String cas04AdjustmentQuantity1) {
        this.cas04AdjustmentQuantity1 = cas04AdjustmentQuantity1;
        return this;
    }

    @JsonProperty("cas05_adjustmentReasonCode2")
    public String getCas05AdjustmentReasonCode2() {
        return cas05AdjustmentReasonCode2;
    }

    @JsonProperty("cas05_adjustmentReasonCode2")
    public void setCas05AdjustmentReasonCode2(String cas05AdjustmentReasonCode2) {
        this.cas05AdjustmentReasonCode2 = cas05AdjustmentReasonCode2;
    }

    public CasClaimLevelAdjustment withCas05AdjustmentReasonCode2(String cas05AdjustmentReasonCode2) {
        this.cas05AdjustmentReasonCode2 = cas05AdjustmentReasonCode2;
        return this;
    }

    @JsonProperty("cas06_adjustmentAmount2")
    public String getCas06AdjustmentAmount2() {
        return cas06AdjustmentAmount2;
    }

    @JsonProperty("cas06_adjustmentAmount2")
    public void setCas06AdjustmentAmount2(String cas06AdjustmentAmount2) {
        this.cas06AdjustmentAmount2 = cas06AdjustmentAmount2;
    }

    public CasClaimLevelAdjustment withCas06AdjustmentAmount2(String cas06AdjustmentAmount2) {
        this.cas06AdjustmentAmount2 = cas06AdjustmentAmount2;
        return this;
    }

    @JsonProperty("cas07_adjustmentQuantity2")
    public String getCas07AdjustmentQuantity2() {
        return cas07AdjustmentQuantity2;
    }

    @JsonProperty("cas07_adjustmentQuantity2")
    public void setCas07AdjustmentQuantity2(String cas07AdjustmentQuantity2) {
        this.cas07AdjustmentQuantity2 = cas07AdjustmentQuantity2;
    }

    public CasClaimLevelAdjustment withCas07AdjustmentQuantity2(String cas07AdjustmentQuantity2) {
        this.cas07AdjustmentQuantity2 = cas07AdjustmentQuantity2;
        return this;
    }

    @JsonProperty("cas08_adjustmentReasonCode3")
    public String getCas08AdjustmentReasonCode3() {
        return cas08AdjustmentReasonCode3;
    }

    @JsonProperty("cas08_adjustmentReasonCode3")
    public void setCas08AdjustmentReasonCode3(String cas08AdjustmentReasonCode3) {
        this.cas08AdjustmentReasonCode3 = cas08AdjustmentReasonCode3;
    }

    public CasClaimLevelAdjustment withCas08AdjustmentReasonCode3(String cas08AdjustmentReasonCode3) {
        this.cas08AdjustmentReasonCode3 = cas08AdjustmentReasonCode3;
        return this;
    }

    @JsonProperty("cas09_adjustmentAmount3")
    public String getCas09AdjustmentAmount3() {
        return cas09AdjustmentAmount3;
    }

    @JsonProperty("cas09_adjustmentAmount3")
    public void setCas09AdjustmentAmount3(String cas09AdjustmentAmount3) {
        this.cas09AdjustmentAmount3 = cas09AdjustmentAmount3;
    }

    public CasClaimLevelAdjustment withCas09AdjustmentAmount3(String cas09AdjustmentAmount3) {
        this.cas09AdjustmentAmount3 = cas09AdjustmentAmount3;
        return this;
    }

    @JsonProperty("cas10_adjustmentQuantity3")
    public String getCas10AdjustmentQuantity3() {
        return cas10AdjustmentQuantity3;
    }

    @JsonProperty("cas10_adjustmentQuantity3")
    public void setCas10AdjustmentQuantity3(String cas10AdjustmentQuantity3) {
        this.cas10AdjustmentQuantity3 = cas10AdjustmentQuantity3;
    }

    public CasClaimLevelAdjustment withCas10AdjustmentQuantity3(String cas10AdjustmentQuantity3) {
        this.cas10AdjustmentQuantity3 = cas10AdjustmentQuantity3;
        return this;
    }

    @JsonProperty("cas11_adjustmentReasonCode4")
    public String getCas11AdjustmentReasonCode4() {
        return cas11AdjustmentReasonCode4;
    }

    @JsonProperty("cas11_adjustmentReasonCode4")
    public void setCas11AdjustmentReasonCode4(String cas11AdjustmentReasonCode4) {
        this.cas11AdjustmentReasonCode4 = cas11AdjustmentReasonCode4;
    }

    public CasClaimLevelAdjustment withCas11AdjustmentReasonCode4(String cas11AdjustmentReasonCode4) {
        this.cas11AdjustmentReasonCode4 = cas11AdjustmentReasonCode4;
        return this;
    }

    @JsonProperty("cas12_adjustmentAmount4")
    public String getCas12AdjustmentAmount4() {
        return cas12AdjustmentAmount4;
    }

    @JsonProperty("cas12_adjustmentAmount4")
    public void setCas12AdjustmentAmount4(String cas12AdjustmentAmount4) {
        this.cas12AdjustmentAmount4 = cas12AdjustmentAmount4;
    }

    public CasClaimLevelAdjustment withCas12AdjustmentAmount4(String cas12AdjustmentAmount4) {
        this.cas12AdjustmentAmount4 = cas12AdjustmentAmount4;
        return this;
    }

    @JsonProperty("cas13_adjustmentQuantity4")
    public String getCas13AdjustmentQuantity4() {
        return cas13AdjustmentQuantity4;
    }

    @JsonProperty("cas13_adjustmentQuantity4")
    public void setCas13AdjustmentQuantity4(String cas13AdjustmentQuantity4) {
        this.cas13AdjustmentQuantity4 = cas13AdjustmentQuantity4;
    }

    public CasClaimLevelAdjustment withCas13AdjustmentQuantity4(String cas13AdjustmentQuantity4) {
        this.cas13AdjustmentQuantity4 = cas13AdjustmentQuantity4;
        return this;
    }

    @JsonProperty("cas14_adjustmentReasonCode5")
    public String getCas14AdjustmentReasonCode5() {
        return cas14AdjustmentReasonCode5;
    }

    @JsonProperty("cas14_adjustmentReasonCode5")
    public void setCas14AdjustmentReasonCode5(String cas14AdjustmentReasonCode5) {
        this.cas14AdjustmentReasonCode5 = cas14AdjustmentReasonCode5;
    }

    public CasClaimLevelAdjustment withCas14AdjustmentReasonCode5(String cas14AdjustmentReasonCode5) {
        this.cas14AdjustmentReasonCode5 = cas14AdjustmentReasonCode5;
        return this;
    }

    @JsonProperty("cas15_adjustmentAmount5")
    public String getCas15AdjustmentAmount5() {
        return cas15AdjustmentAmount5;
    }

    @JsonProperty("cas15_adjustmentAmount5")
    public void setCas15AdjustmentAmount5(String cas15AdjustmentAmount5) {
        this.cas15AdjustmentAmount5 = cas15AdjustmentAmount5;
    }

    public CasClaimLevelAdjustment withCas15AdjustmentAmount5(String cas15AdjustmentAmount5) {
        this.cas15AdjustmentAmount5 = cas15AdjustmentAmount5;
        return this;
    }

    @JsonProperty("cas16_adjustmentQuantity5")
    public String getCas16AdjustmentQuantity5() {
        return cas16AdjustmentQuantity5;
    }

    @JsonProperty("cas16_adjustmentQuantity5")
    public void setCas16AdjustmentQuantity5(String cas16AdjustmentQuantity5) {
        this.cas16AdjustmentQuantity5 = cas16AdjustmentQuantity5;
    }

    public CasClaimLevelAdjustment withCas16AdjustmentQuantity5(String cas16AdjustmentQuantity5) {
        this.cas16AdjustmentQuantity5 = cas16AdjustmentQuantity5;
        return this;
    }

    @JsonProperty("cas17_adjustmentReasonCode6")
    public String getCas17AdjustmentReasonCode6() {
        return cas17AdjustmentReasonCode6;
    }

    @JsonProperty("cas17_adjustmentReasonCode6")
    public void setCas17AdjustmentReasonCode6(String cas17AdjustmentReasonCode6) {
        this.cas17AdjustmentReasonCode6 = cas17AdjustmentReasonCode6;
    }

    public CasClaimLevelAdjustment withCas17AdjustmentReasonCode6(String cas17AdjustmentReasonCode6) {
        this.cas17AdjustmentReasonCode6 = cas17AdjustmentReasonCode6;
        return this;
    }

    @JsonProperty("cas18_adjustmentAmount6")
    public String getCas18AdjustmentAmount6() {
        return cas18AdjustmentAmount6;
    }

    @JsonProperty("cas18_adjustmentAmount6")
    public void setCas18AdjustmentAmount6(String cas18AdjustmentAmount6) {
        this.cas18AdjustmentAmount6 = cas18AdjustmentAmount6;
    }

    public CasClaimLevelAdjustment withCas18AdjustmentAmount6(String cas18AdjustmentAmount6) {
        this.cas18AdjustmentAmount6 = cas18AdjustmentAmount6;
        return this;
    }

    @JsonProperty("cas19_adjustmentQuantity6")
    public String getCas19AdjustmentQuantity6() {
        return cas19AdjustmentQuantity6;
    }

    @JsonProperty("cas19_adjustmentQuantity6")
    public void setCas19AdjustmentQuantity6(String cas19AdjustmentQuantity6) {
        this.cas19AdjustmentQuantity6 = cas19AdjustmentQuantity6;
    }

    public CasClaimLevelAdjustment withCas19AdjustmentQuantity6(String cas19AdjustmentQuantity6) {
        this.cas19AdjustmentQuantity6 = cas19AdjustmentQuantity6;
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

    public CasClaimLevelAdjustment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cas01ClaimAdjustmentGroupCode).append(cas02AdjustmentReasonCode1).append(cas03AdjustmentAmount1).append(cas04AdjustmentQuantity1).append(cas05AdjustmentReasonCode2).append(cas06AdjustmentAmount2).append(cas07AdjustmentQuantity2).append(cas08AdjustmentReasonCode3).append(cas09AdjustmentAmount3).append(cas10AdjustmentQuantity3).append(cas11AdjustmentReasonCode4).append(cas12AdjustmentAmount4).append(cas13AdjustmentQuantity4).append(cas14AdjustmentReasonCode5).append(cas15AdjustmentAmount5).append(cas16AdjustmentQuantity5).append(cas17AdjustmentReasonCode6).append(cas18AdjustmentAmount6).append(cas19AdjustmentQuantity6).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CasClaimLevelAdjustment) == false) {
            return false;
        }
        CasClaimLevelAdjustment rhs = ((CasClaimLevelAdjustment) other);
        return new EqualsBuilder().append(cas01ClaimAdjustmentGroupCode, rhs.cas01ClaimAdjustmentGroupCode).append(cas02AdjustmentReasonCode1, rhs.cas02AdjustmentReasonCode1).append(cas03AdjustmentAmount1, rhs.cas03AdjustmentAmount1).append(cas04AdjustmentQuantity1, rhs.cas04AdjustmentQuantity1).append(cas05AdjustmentReasonCode2, rhs.cas05AdjustmentReasonCode2).append(cas06AdjustmentAmount2, rhs.cas06AdjustmentAmount2).append(cas07AdjustmentQuantity2, rhs.cas07AdjustmentQuantity2).append(cas08AdjustmentReasonCode3, rhs.cas08AdjustmentReasonCode3).append(cas09AdjustmentAmount3, rhs.cas09AdjustmentAmount3).append(cas10AdjustmentQuantity3, rhs.cas10AdjustmentQuantity3).append(cas11AdjustmentReasonCode4, rhs.cas11AdjustmentReasonCode4).append(cas12AdjustmentAmount4, rhs.cas12AdjustmentAmount4).append(cas13AdjustmentQuantity4, rhs.cas13AdjustmentQuantity4).append(cas14AdjustmentReasonCode5, rhs.cas14AdjustmentReasonCode5).append(cas15AdjustmentAmount5, rhs.cas15AdjustmentAmount5).append(cas16AdjustmentQuantity5, rhs.cas16AdjustmentQuantity5).append(cas17AdjustmentReasonCode6, rhs.cas17AdjustmentReasonCode6).append(cas18AdjustmentAmount6, rhs.cas18AdjustmentAmount6).append(cas19AdjustmentQuantity6, rhs.cas19AdjustmentQuantity6).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

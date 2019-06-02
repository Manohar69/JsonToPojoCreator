
package com.humana.hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "svd01_otherPayerPrimaryIdentifier",
    "svd02_serviceLinePaidAmount",
    "svd03_medicalProcedureIdentifier",
    "svd03_01_productServiceIdQlfr",
    "svd03_02_procedureCode",
    "svd03_03_procedureModifier1",
    "svd03_04_procedurModifier2",
    "svd03_05_procedureModifier3",
    "svd03_06_procedureModifier4",
    "svd03_07_procedureCodeDescription",
    "svd04_serviceLineRevenueCode",
    "svd05_paidServiceUnitCount",
    "svd06_lineNo",
    "cas_claimLevelAdjustments",
    "dtp01_adjudicationPaymentDateQlfr",
    "dtp02_adjudicationPaymentDateFormatQlfr",
    "dtp03_adjudicationPaymentDate",
    "amt01_remainingPatientLiabilityQlfrCode",
    "amt02_remainingPatientLiability"
})
public class LineAdjInfo {

    @JsonProperty("svd01_otherPayerPrimaryIdentifier")
    private String svd01OtherPayerPrimaryIdentifier;
    @JsonProperty("svd02_serviceLinePaidAmount")
    private String svd02ServiceLinePaidAmount;
    @JsonProperty("svd03_medicalProcedureIdentifier")
    private String svd03MedicalProcedureIdentifier;
    @JsonProperty("svd03_01_productServiceIdQlfr")
    private String svd0301ProductServiceIdQlfr;
    @JsonProperty("svd03_02_procedureCode")
    private String svd0302ProcedureCode;
    @JsonProperty("svd03_03_procedureModifier1")
    private String svd0303ProcedureModifier1;
    @JsonProperty("svd03_04_procedurModifier2")
    private String svd0304ProcedurModifier2;
    @JsonProperty("svd03_05_procedureModifier3")
    private String svd0305ProcedureModifier3;
    @JsonProperty("svd03_06_procedureModifier4")
    private String svd0306ProcedureModifier4;
    @JsonProperty("svd03_07_procedureCodeDescription")
    private String svd0307ProcedureCodeDescription;
    @JsonProperty("svd04_serviceLineRevenueCode")
    private String svd04ServiceLineRevenueCode;
    @JsonProperty("svd05_paidServiceUnitCount")
    private String svd05PaidServiceUnitCount;
    @JsonProperty("svd06_lineNo")
    private String svd06LineNo;
    @JsonProperty("cas_claimLevelAdjustments")
    private List<CasClaimLevelAdjustment_> casClaimLevelAdjustments = new ArrayList<CasClaimLevelAdjustment_>();
    @JsonProperty("dtp01_adjudicationPaymentDateQlfr")
    private String dtp01AdjudicationPaymentDateQlfr;
    @JsonProperty("dtp02_adjudicationPaymentDateFormatQlfr")
    private String dtp02AdjudicationPaymentDateFormatQlfr;
    @JsonProperty("dtp03_adjudicationPaymentDate")
    private String dtp03AdjudicationPaymentDate;
    @JsonProperty("amt01_remainingPatientLiabilityQlfrCode")
    private String amt01RemainingPatientLiabilityQlfrCode;
    @JsonProperty("amt02_remainingPatientLiability")
    private String amt02RemainingPatientLiability;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("svd01_otherPayerPrimaryIdentifier")
    public String getSvd01OtherPayerPrimaryIdentifier() {
        return svd01OtherPayerPrimaryIdentifier;
    }

    @JsonProperty("svd01_otherPayerPrimaryIdentifier")
    public void setSvd01OtherPayerPrimaryIdentifier(String svd01OtherPayerPrimaryIdentifier) {
        this.svd01OtherPayerPrimaryIdentifier = svd01OtherPayerPrimaryIdentifier;
    }

    public LineAdjInfo withSvd01OtherPayerPrimaryIdentifier(String svd01OtherPayerPrimaryIdentifier) {
        this.svd01OtherPayerPrimaryIdentifier = svd01OtherPayerPrimaryIdentifier;
        return this;
    }

    @JsonProperty("svd02_serviceLinePaidAmount")
    public String getSvd02ServiceLinePaidAmount() {
        return svd02ServiceLinePaidAmount;
    }

    @JsonProperty("svd02_serviceLinePaidAmount")
    public void setSvd02ServiceLinePaidAmount(String svd02ServiceLinePaidAmount) {
        this.svd02ServiceLinePaidAmount = svd02ServiceLinePaidAmount;
    }

    public LineAdjInfo withSvd02ServiceLinePaidAmount(String svd02ServiceLinePaidAmount) {
        this.svd02ServiceLinePaidAmount = svd02ServiceLinePaidAmount;
        return this;
    }

    @JsonProperty("svd03_medicalProcedureIdentifier")
    public String getSvd03MedicalProcedureIdentifier() {
        return svd03MedicalProcedureIdentifier;
    }

    @JsonProperty("svd03_medicalProcedureIdentifier")
    public void setSvd03MedicalProcedureIdentifier(String svd03MedicalProcedureIdentifier) {
        this.svd03MedicalProcedureIdentifier = svd03MedicalProcedureIdentifier;
    }

    public LineAdjInfo withSvd03MedicalProcedureIdentifier(String svd03MedicalProcedureIdentifier) {
        this.svd03MedicalProcedureIdentifier = svd03MedicalProcedureIdentifier;
        return this;
    }

    @JsonProperty("svd03_01_productServiceIdQlfr")
    public String getSvd0301ProductServiceIdQlfr() {
        return svd0301ProductServiceIdQlfr;
    }

    @JsonProperty("svd03_01_productServiceIdQlfr")
    public void setSvd0301ProductServiceIdQlfr(String svd0301ProductServiceIdQlfr) {
        this.svd0301ProductServiceIdQlfr = svd0301ProductServiceIdQlfr;
    }

    public LineAdjInfo withSvd0301ProductServiceIdQlfr(String svd0301ProductServiceIdQlfr) {
        this.svd0301ProductServiceIdQlfr = svd0301ProductServiceIdQlfr;
        return this;
    }

    @JsonProperty("svd03_02_procedureCode")
    public String getSvd0302ProcedureCode() {
        return svd0302ProcedureCode;
    }

    @JsonProperty("svd03_02_procedureCode")
    public void setSvd0302ProcedureCode(String svd0302ProcedureCode) {
        this.svd0302ProcedureCode = svd0302ProcedureCode;
    }

    public LineAdjInfo withSvd0302ProcedureCode(String svd0302ProcedureCode) {
        this.svd0302ProcedureCode = svd0302ProcedureCode;
        return this;
    }

    @JsonProperty("svd03_03_procedureModifier1")
    public String getSvd0303ProcedureModifier1() {
        return svd0303ProcedureModifier1;
    }

    @JsonProperty("svd03_03_procedureModifier1")
    public void setSvd0303ProcedureModifier1(String svd0303ProcedureModifier1) {
        this.svd0303ProcedureModifier1 = svd0303ProcedureModifier1;
    }

    public LineAdjInfo withSvd0303ProcedureModifier1(String svd0303ProcedureModifier1) {
        this.svd0303ProcedureModifier1 = svd0303ProcedureModifier1;
        return this;
    }

    @JsonProperty("svd03_04_procedurModifier2")
    public String getSvd0304ProcedurModifier2() {
        return svd0304ProcedurModifier2;
    }

    @JsonProperty("svd03_04_procedurModifier2")
    public void setSvd0304ProcedurModifier2(String svd0304ProcedurModifier2) {
        this.svd0304ProcedurModifier2 = svd0304ProcedurModifier2;
    }

    public LineAdjInfo withSvd0304ProcedurModifier2(String svd0304ProcedurModifier2) {
        this.svd0304ProcedurModifier2 = svd0304ProcedurModifier2;
        return this;
    }

    @JsonProperty("svd03_05_procedureModifier3")
    public String getSvd0305ProcedureModifier3() {
        return svd0305ProcedureModifier3;
    }

    @JsonProperty("svd03_05_procedureModifier3")
    public void setSvd0305ProcedureModifier3(String svd0305ProcedureModifier3) {
        this.svd0305ProcedureModifier3 = svd0305ProcedureModifier3;
    }

    public LineAdjInfo withSvd0305ProcedureModifier3(String svd0305ProcedureModifier3) {
        this.svd0305ProcedureModifier3 = svd0305ProcedureModifier3;
        return this;
    }

    @JsonProperty("svd03_06_procedureModifier4")
    public String getSvd0306ProcedureModifier4() {
        return svd0306ProcedureModifier4;
    }

    @JsonProperty("svd03_06_procedureModifier4")
    public void setSvd0306ProcedureModifier4(String svd0306ProcedureModifier4) {
        this.svd0306ProcedureModifier4 = svd0306ProcedureModifier4;
    }

    public LineAdjInfo withSvd0306ProcedureModifier4(String svd0306ProcedureModifier4) {
        this.svd0306ProcedureModifier4 = svd0306ProcedureModifier4;
        return this;
    }

    @JsonProperty("svd03_07_procedureCodeDescription")
    public String getSvd0307ProcedureCodeDescription() {
        return svd0307ProcedureCodeDescription;
    }

    @JsonProperty("svd03_07_procedureCodeDescription")
    public void setSvd0307ProcedureCodeDescription(String svd0307ProcedureCodeDescription) {
        this.svd0307ProcedureCodeDescription = svd0307ProcedureCodeDescription;
    }

    public LineAdjInfo withSvd0307ProcedureCodeDescription(String svd0307ProcedureCodeDescription) {
        this.svd0307ProcedureCodeDescription = svd0307ProcedureCodeDescription;
        return this;
    }

    @JsonProperty("svd04_serviceLineRevenueCode")
    public String getSvd04ServiceLineRevenueCode() {
        return svd04ServiceLineRevenueCode;
    }

    @JsonProperty("svd04_serviceLineRevenueCode")
    public void setSvd04ServiceLineRevenueCode(String svd04ServiceLineRevenueCode) {
        this.svd04ServiceLineRevenueCode = svd04ServiceLineRevenueCode;
    }

    public LineAdjInfo withSvd04ServiceLineRevenueCode(String svd04ServiceLineRevenueCode) {
        this.svd04ServiceLineRevenueCode = svd04ServiceLineRevenueCode;
        return this;
    }

    @JsonProperty("svd05_paidServiceUnitCount")
    public String getSvd05PaidServiceUnitCount() {
        return svd05PaidServiceUnitCount;
    }

    @JsonProperty("svd05_paidServiceUnitCount")
    public void setSvd05PaidServiceUnitCount(String svd05PaidServiceUnitCount) {
        this.svd05PaidServiceUnitCount = svd05PaidServiceUnitCount;
    }

    public LineAdjInfo withSvd05PaidServiceUnitCount(String svd05PaidServiceUnitCount) {
        this.svd05PaidServiceUnitCount = svd05PaidServiceUnitCount;
        return this;
    }

    @JsonProperty("svd06_lineNo")
    public String getSvd06LineNo() {
        return svd06LineNo;
    }

    @JsonProperty("svd06_lineNo")
    public void setSvd06LineNo(String svd06LineNo) {
        this.svd06LineNo = svd06LineNo;
    }

    public LineAdjInfo withSvd06LineNo(String svd06LineNo) {
        this.svd06LineNo = svd06LineNo;
        return this;
    }

    @JsonProperty("cas_claimLevelAdjustments")
    public List<CasClaimLevelAdjustment_> getCasClaimLevelAdjustments() {
        return casClaimLevelAdjustments;
    }

    @JsonProperty("cas_claimLevelAdjustments")
    public void setCasClaimLevelAdjustments(List<CasClaimLevelAdjustment_> casClaimLevelAdjustments) {
        this.casClaimLevelAdjustments = casClaimLevelAdjustments;
    }

    public LineAdjInfo withCasClaimLevelAdjustments(List<CasClaimLevelAdjustment_> casClaimLevelAdjustments) {
        this.casClaimLevelAdjustments = casClaimLevelAdjustments;
        return this;
    }

    @JsonProperty("dtp01_adjudicationPaymentDateQlfr")
    public String getDtp01AdjudicationPaymentDateQlfr() {
        return dtp01AdjudicationPaymentDateQlfr;
    }

    @JsonProperty("dtp01_adjudicationPaymentDateQlfr")
    public void setDtp01AdjudicationPaymentDateQlfr(String dtp01AdjudicationPaymentDateQlfr) {
        this.dtp01AdjudicationPaymentDateQlfr = dtp01AdjudicationPaymentDateQlfr;
    }

    public LineAdjInfo withDtp01AdjudicationPaymentDateQlfr(String dtp01AdjudicationPaymentDateQlfr) {
        this.dtp01AdjudicationPaymentDateQlfr = dtp01AdjudicationPaymentDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_adjudicationPaymentDateFormatQlfr")
    public String getDtp02AdjudicationPaymentDateFormatQlfr() {
        return dtp02AdjudicationPaymentDateFormatQlfr;
    }

    @JsonProperty("dtp02_adjudicationPaymentDateFormatQlfr")
    public void setDtp02AdjudicationPaymentDateFormatQlfr(String dtp02AdjudicationPaymentDateFormatQlfr) {
        this.dtp02AdjudicationPaymentDateFormatQlfr = dtp02AdjudicationPaymentDateFormatQlfr;
    }

    public LineAdjInfo withDtp02AdjudicationPaymentDateFormatQlfr(String dtp02AdjudicationPaymentDateFormatQlfr) {
        this.dtp02AdjudicationPaymentDateFormatQlfr = dtp02AdjudicationPaymentDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_adjudicationPaymentDate")
    public String getDtp03AdjudicationPaymentDate() {
        return dtp03AdjudicationPaymentDate;
    }

    @JsonProperty("dtp03_adjudicationPaymentDate")
    public void setDtp03AdjudicationPaymentDate(String dtp03AdjudicationPaymentDate) {
        this.dtp03AdjudicationPaymentDate = dtp03AdjudicationPaymentDate;
    }

    public LineAdjInfo withDtp03AdjudicationPaymentDate(String dtp03AdjudicationPaymentDate) {
        this.dtp03AdjudicationPaymentDate = dtp03AdjudicationPaymentDate;
        return this;
    }

    @JsonProperty("amt01_remainingPatientLiabilityQlfrCode")
    public String getAmt01RemainingPatientLiabilityQlfrCode() {
        return amt01RemainingPatientLiabilityQlfrCode;
    }

    @JsonProperty("amt01_remainingPatientLiabilityQlfrCode")
    public void setAmt01RemainingPatientLiabilityQlfrCode(String amt01RemainingPatientLiabilityQlfrCode) {
        this.amt01RemainingPatientLiabilityQlfrCode = amt01RemainingPatientLiabilityQlfrCode;
    }

    public LineAdjInfo withAmt01RemainingPatientLiabilityQlfrCode(String amt01RemainingPatientLiabilityQlfrCode) {
        this.amt01RemainingPatientLiabilityQlfrCode = amt01RemainingPatientLiabilityQlfrCode;
        return this;
    }

    @JsonProperty("amt02_remainingPatientLiability")
    public String getAmt02RemainingPatientLiability() {
        return amt02RemainingPatientLiability;
    }

    @JsonProperty("amt02_remainingPatientLiability")
    public void setAmt02RemainingPatientLiability(String amt02RemainingPatientLiability) {
        this.amt02RemainingPatientLiability = amt02RemainingPatientLiability;
    }

    public LineAdjInfo withAmt02RemainingPatientLiability(String amt02RemainingPatientLiability) {
        this.amt02RemainingPatientLiability = amt02RemainingPatientLiability;
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

    public LineAdjInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(svd01OtherPayerPrimaryIdentifier).append(svd02ServiceLinePaidAmount).append(svd03MedicalProcedureIdentifier).append(svd0301ProductServiceIdQlfr).append(svd0302ProcedureCode).append(svd0303ProcedureModifier1).append(svd0304ProcedurModifier2).append(svd0305ProcedureModifier3).append(svd0306ProcedureModifier4).append(svd0307ProcedureCodeDescription).append(svd04ServiceLineRevenueCode).append(svd05PaidServiceUnitCount).append(svd06LineNo).append(casClaimLevelAdjustments).append(dtp01AdjudicationPaymentDateQlfr).append(dtp02AdjudicationPaymentDateFormatQlfr).append(dtp03AdjudicationPaymentDate).append(amt01RemainingPatientLiabilityQlfrCode).append(amt02RemainingPatientLiability).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineAdjInfo) == false) {
            return false;
        }
        LineAdjInfo rhs = ((LineAdjInfo) other);
        return new EqualsBuilder().append(svd01OtherPayerPrimaryIdentifier, rhs.svd01OtherPayerPrimaryIdentifier).append(svd02ServiceLinePaidAmount, rhs.svd02ServiceLinePaidAmount).append(svd03MedicalProcedureIdentifier, rhs.svd03MedicalProcedureIdentifier).append(svd0301ProductServiceIdQlfr, rhs.svd0301ProductServiceIdQlfr).append(svd0302ProcedureCode, rhs.svd0302ProcedureCode).append(svd0303ProcedureModifier1, rhs.svd0303ProcedureModifier1).append(svd0304ProcedurModifier2, rhs.svd0304ProcedurModifier2).append(svd0305ProcedureModifier3, rhs.svd0305ProcedureModifier3).append(svd0306ProcedureModifier4, rhs.svd0306ProcedureModifier4).append(svd0307ProcedureCodeDescription, rhs.svd0307ProcedureCodeDescription).append(svd04ServiceLineRevenueCode, rhs.svd04ServiceLineRevenueCode).append(svd05PaidServiceUnitCount, rhs.svd05PaidServiceUnitCount).append(svd06LineNo, rhs.svd06LineNo).append(casClaimLevelAdjustments, rhs.casClaimLevelAdjustments).append(dtp01AdjudicationPaymentDateQlfr, rhs.dtp01AdjudicationPaymentDateQlfr).append(dtp02AdjudicationPaymentDateFormatQlfr, rhs.dtp02AdjudicationPaymentDateFormatQlfr).append(dtp03AdjudicationPaymentDate, rhs.dtp03AdjudicationPaymentDate).append(amt01RemainingPatientLiabilityQlfrCode, rhs.amt01RemainingPatientLiabilityQlfrCode).append(amt02RemainingPatientLiability, rhs.amt02RemainingPatientLiability).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

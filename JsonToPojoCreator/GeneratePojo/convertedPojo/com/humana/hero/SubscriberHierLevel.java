
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
    "hl01_subscriberHierarchicalIdNo",
    "hl02_subscriberParentHierarchicalIdNo",
    "hl03_subscriberHierarchicalLevelCode",
    "hl04_subscriberHierarchicalChildCode",
    "sbr01_payerResponsibilitySequenceNoCode",
    "sbr02_individualRelationshipCode",
    "sbr03_subscriberGroupPolicyNo",
    "sbr04_subscriberGroupName",
    "sbr05_insuranceTypeCode",
    "sbr09_claimFilingIndicatorCode",
    "pat05_patientDeathDateQlfr",
    "pat06_patientDeathDate",
    "pat07_measurementUnitCode",
    "pat08_patientWeightPounds",
    "pat09_pregnancyIndicator"
})
public class SubscriberHierLevel {

    @JsonProperty("hl01_subscriberHierarchicalIdNo")
    private String hl01SubscriberHierarchicalIdNo;
    @JsonProperty("hl02_subscriberParentHierarchicalIdNo")
    private String hl02SubscriberParentHierarchicalIdNo;
    @JsonProperty("hl03_subscriberHierarchicalLevelCode")
    private String hl03SubscriberHierarchicalLevelCode;
    @JsonProperty("hl04_subscriberHierarchicalChildCode")
    private String hl04SubscriberHierarchicalChildCode;
    @JsonProperty("sbr01_payerResponsibilitySequenceNoCode")
    private String sbr01PayerResponsibilitySequenceNoCode;
    @JsonProperty("sbr02_individualRelationshipCode")
    private String sbr02IndividualRelationshipCode;
    @JsonProperty("sbr03_subscriberGroupPolicyNo")
    private String sbr03SubscriberGroupPolicyNo;
    @JsonProperty("sbr04_subscriberGroupName")
    private String sbr04SubscriberGroupName;
    @JsonProperty("sbr05_insuranceTypeCode")
    private String sbr05InsuranceTypeCode;
    @JsonProperty("sbr09_claimFilingIndicatorCode")
    private String sbr09ClaimFilingIndicatorCode;
    @JsonProperty("pat05_patientDeathDateQlfr")
    private String pat05PatientDeathDateQlfr;
    @JsonProperty("pat06_patientDeathDate")
    private String pat06PatientDeathDate;
    @JsonProperty("pat07_measurementUnitCode")
    private String pat07MeasurementUnitCode;
    @JsonProperty("pat08_patientWeightPounds")
    private String pat08PatientWeightPounds;
    @JsonProperty("pat09_pregnancyIndicator")
    private String pat09PregnancyIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hl01_subscriberHierarchicalIdNo")
    public String getHl01SubscriberHierarchicalIdNo() {
        return hl01SubscriberHierarchicalIdNo;
    }

    @JsonProperty("hl01_subscriberHierarchicalIdNo")
    public void setHl01SubscriberHierarchicalIdNo(String hl01SubscriberHierarchicalIdNo) {
        this.hl01SubscriberHierarchicalIdNo = hl01SubscriberHierarchicalIdNo;
    }

    public SubscriberHierLevel withHl01SubscriberHierarchicalIdNo(String hl01SubscriberHierarchicalIdNo) {
        this.hl01SubscriberHierarchicalIdNo = hl01SubscriberHierarchicalIdNo;
        return this;
    }

    @JsonProperty("hl02_subscriberParentHierarchicalIdNo")
    public String getHl02SubscriberParentHierarchicalIdNo() {
        return hl02SubscriberParentHierarchicalIdNo;
    }

    @JsonProperty("hl02_subscriberParentHierarchicalIdNo")
    public void setHl02SubscriberParentHierarchicalIdNo(String hl02SubscriberParentHierarchicalIdNo) {
        this.hl02SubscriberParentHierarchicalIdNo = hl02SubscriberParentHierarchicalIdNo;
    }

    public SubscriberHierLevel withHl02SubscriberParentHierarchicalIdNo(String hl02SubscriberParentHierarchicalIdNo) {
        this.hl02SubscriberParentHierarchicalIdNo = hl02SubscriberParentHierarchicalIdNo;
        return this;
    }

    @JsonProperty("hl03_subscriberHierarchicalLevelCode")
    public String getHl03SubscriberHierarchicalLevelCode() {
        return hl03SubscriberHierarchicalLevelCode;
    }

    @JsonProperty("hl03_subscriberHierarchicalLevelCode")
    public void setHl03SubscriberHierarchicalLevelCode(String hl03SubscriberHierarchicalLevelCode) {
        this.hl03SubscriberHierarchicalLevelCode = hl03SubscriberHierarchicalLevelCode;
    }

    public SubscriberHierLevel withHl03SubscriberHierarchicalLevelCode(String hl03SubscriberHierarchicalLevelCode) {
        this.hl03SubscriberHierarchicalLevelCode = hl03SubscriberHierarchicalLevelCode;
        return this;
    }

    @JsonProperty("hl04_subscriberHierarchicalChildCode")
    public String getHl04SubscriberHierarchicalChildCode() {
        return hl04SubscriberHierarchicalChildCode;
    }

    @JsonProperty("hl04_subscriberHierarchicalChildCode")
    public void setHl04SubscriberHierarchicalChildCode(String hl04SubscriberHierarchicalChildCode) {
        this.hl04SubscriberHierarchicalChildCode = hl04SubscriberHierarchicalChildCode;
    }

    public SubscriberHierLevel withHl04SubscriberHierarchicalChildCode(String hl04SubscriberHierarchicalChildCode) {
        this.hl04SubscriberHierarchicalChildCode = hl04SubscriberHierarchicalChildCode;
        return this;
    }

    @JsonProperty("sbr01_payerResponsibilitySequenceNoCode")
    public String getSbr01PayerResponsibilitySequenceNoCode() {
        return sbr01PayerResponsibilitySequenceNoCode;
    }

    @JsonProperty("sbr01_payerResponsibilitySequenceNoCode")
    public void setSbr01PayerResponsibilitySequenceNoCode(String sbr01PayerResponsibilitySequenceNoCode) {
        this.sbr01PayerResponsibilitySequenceNoCode = sbr01PayerResponsibilitySequenceNoCode;
    }

    public SubscriberHierLevel withSbr01PayerResponsibilitySequenceNoCode(String sbr01PayerResponsibilitySequenceNoCode) {
        this.sbr01PayerResponsibilitySequenceNoCode = sbr01PayerResponsibilitySequenceNoCode;
        return this;
    }

    @JsonProperty("sbr02_individualRelationshipCode")
    public String getSbr02IndividualRelationshipCode() {
        return sbr02IndividualRelationshipCode;
    }

    @JsonProperty("sbr02_individualRelationshipCode")
    public void setSbr02IndividualRelationshipCode(String sbr02IndividualRelationshipCode) {
        this.sbr02IndividualRelationshipCode = sbr02IndividualRelationshipCode;
    }

    public SubscriberHierLevel withSbr02IndividualRelationshipCode(String sbr02IndividualRelationshipCode) {
        this.sbr02IndividualRelationshipCode = sbr02IndividualRelationshipCode;
        return this;
    }

    @JsonProperty("sbr03_subscriberGroupPolicyNo")
    public String getSbr03SubscriberGroupPolicyNo() {
        return sbr03SubscriberGroupPolicyNo;
    }

    @JsonProperty("sbr03_subscriberGroupPolicyNo")
    public void setSbr03SubscriberGroupPolicyNo(String sbr03SubscriberGroupPolicyNo) {
        this.sbr03SubscriberGroupPolicyNo = sbr03SubscriberGroupPolicyNo;
    }

    public SubscriberHierLevel withSbr03SubscriberGroupPolicyNo(String sbr03SubscriberGroupPolicyNo) {
        this.sbr03SubscriberGroupPolicyNo = sbr03SubscriberGroupPolicyNo;
        return this;
    }

    @JsonProperty("sbr04_subscriberGroupName")
    public String getSbr04SubscriberGroupName() {
        return sbr04SubscriberGroupName;
    }

    @JsonProperty("sbr04_subscriberGroupName")
    public void setSbr04SubscriberGroupName(String sbr04SubscriberGroupName) {
        this.sbr04SubscriberGroupName = sbr04SubscriberGroupName;
    }

    public SubscriberHierLevel withSbr04SubscriberGroupName(String sbr04SubscriberGroupName) {
        this.sbr04SubscriberGroupName = sbr04SubscriberGroupName;
        return this;
    }

    @JsonProperty("sbr05_insuranceTypeCode")
    public String getSbr05InsuranceTypeCode() {
        return sbr05InsuranceTypeCode;
    }

    @JsonProperty("sbr05_insuranceTypeCode")
    public void setSbr05InsuranceTypeCode(String sbr05InsuranceTypeCode) {
        this.sbr05InsuranceTypeCode = sbr05InsuranceTypeCode;
    }

    public SubscriberHierLevel withSbr05InsuranceTypeCode(String sbr05InsuranceTypeCode) {
        this.sbr05InsuranceTypeCode = sbr05InsuranceTypeCode;
        return this;
    }

    @JsonProperty("sbr09_claimFilingIndicatorCode")
    public String getSbr09ClaimFilingIndicatorCode() {
        return sbr09ClaimFilingIndicatorCode;
    }

    @JsonProperty("sbr09_claimFilingIndicatorCode")
    public void setSbr09ClaimFilingIndicatorCode(String sbr09ClaimFilingIndicatorCode) {
        this.sbr09ClaimFilingIndicatorCode = sbr09ClaimFilingIndicatorCode;
    }

    public SubscriberHierLevel withSbr09ClaimFilingIndicatorCode(String sbr09ClaimFilingIndicatorCode) {
        this.sbr09ClaimFilingIndicatorCode = sbr09ClaimFilingIndicatorCode;
        return this;
    }

    @JsonProperty("pat05_patientDeathDateQlfr")
    public String getPat05PatientDeathDateQlfr() {
        return pat05PatientDeathDateQlfr;
    }

    @JsonProperty("pat05_patientDeathDateQlfr")
    public void setPat05PatientDeathDateQlfr(String pat05PatientDeathDateQlfr) {
        this.pat05PatientDeathDateQlfr = pat05PatientDeathDateQlfr;
    }

    public SubscriberHierLevel withPat05PatientDeathDateQlfr(String pat05PatientDeathDateQlfr) {
        this.pat05PatientDeathDateQlfr = pat05PatientDeathDateQlfr;
        return this;
    }

    @JsonProperty("pat06_patientDeathDate")
    public String getPat06PatientDeathDate() {
        return pat06PatientDeathDate;
    }

    @JsonProperty("pat06_patientDeathDate")
    public void setPat06PatientDeathDate(String pat06PatientDeathDate) {
        this.pat06PatientDeathDate = pat06PatientDeathDate;
    }

    public SubscriberHierLevel withPat06PatientDeathDate(String pat06PatientDeathDate) {
        this.pat06PatientDeathDate = pat06PatientDeathDate;
        return this;
    }

    @JsonProperty("pat07_measurementUnitCode")
    public String getPat07MeasurementUnitCode() {
        return pat07MeasurementUnitCode;
    }

    @JsonProperty("pat07_measurementUnitCode")
    public void setPat07MeasurementUnitCode(String pat07MeasurementUnitCode) {
        this.pat07MeasurementUnitCode = pat07MeasurementUnitCode;
    }

    public SubscriberHierLevel withPat07MeasurementUnitCode(String pat07MeasurementUnitCode) {
        this.pat07MeasurementUnitCode = pat07MeasurementUnitCode;
        return this;
    }

    @JsonProperty("pat08_patientWeightPounds")
    public String getPat08PatientWeightPounds() {
        return pat08PatientWeightPounds;
    }

    @JsonProperty("pat08_patientWeightPounds")
    public void setPat08PatientWeightPounds(String pat08PatientWeightPounds) {
        this.pat08PatientWeightPounds = pat08PatientWeightPounds;
    }

    public SubscriberHierLevel withPat08PatientWeightPounds(String pat08PatientWeightPounds) {
        this.pat08PatientWeightPounds = pat08PatientWeightPounds;
        return this;
    }

    @JsonProperty("pat09_pregnancyIndicator")
    public String getPat09PregnancyIndicator() {
        return pat09PregnancyIndicator;
    }

    @JsonProperty("pat09_pregnancyIndicator")
    public void setPat09PregnancyIndicator(String pat09PregnancyIndicator) {
        this.pat09PregnancyIndicator = pat09PregnancyIndicator;
    }

    public SubscriberHierLevel withPat09PregnancyIndicator(String pat09PregnancyIndicator) {
        this.pat09PregnancyIndicator = pat09PregnancyIndicator;
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

    public SubscriberHierLevel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hl01SubscriberHierarchicalIdNo).append(hl02SubscriberParentHierarchicalIdNo).append(hl03SubscriberHierarchicalLevelCode).append(hl04SubscriberHierarchicalChildCode).append(sbr01PayerResponsibilitySequenceNoCode).append(sbr02IndividualRelationshipCode).append(sbr03SubscriberGroupPolicyNo).append(sbr04SubscriberGroupName).append(sbr05InsuranceTypeCode).append(sbr09ClaimFilingIndicatorCode).append(pat05PatientDeathDateQlfr).append(pat06PatientDeathDate).append(pat07MeasurementUnitCode).append(pat08PatientWeightPounds).append(pat09PregnancyIndicator).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriberHierLevel) == false) {
            return false;
        }
        SubscriberHierLevel rhs = ((SubscriberHierLevel) other);
        return new EqualsBuilder().append(hl01SubscriberHierarchicalIdNo, rhs.hl01SubscriberHierarchicalIdNo).append(hl02SubscriberParentHierarchicalIdNo, rhs.hl02SubscriberParentHierarchicalIdNo).append(hl03SubscriberHierarchicalLevelCode, rhs.hl03SubscriberHierarchicalLevelCode).append(hl04SubscriberHierarchicalChildCode, rhs.hl04SubscriberHierarchicalChildCode).append(sbr01PayerResponsibilitySequenceNoCode, rhs.sbr01PayerResponsibilitySequenceNoCode).append(sbr02IndividualRelationshipCode, rhs.sbr02IndividualRelationshipCode).append(sbr03SubscriberGroupPolicyNo, rhs.sbr03SubscriberGroupPolicyNo).append(sbr04SubscriberGroupName, rhs.sbr04SubscriberGroupName).append(sbr05InsuranceTypeCode, rhs.sbr05InsuranceTypeCode).append(sbr09ClaimFilingIndicatorCode, rhs.sbr09ClaimFilingIndicatorCode).append(pat05PatientDeathDateQlfr, rhs.pat05PatientDeathDateQlfr).append(pat06PatientDeathDate, rhs.pat06PatientDeathDate).append(pat07MeasurementUnitCode, rhs.pat07MeasurementUnitCode).append(pat08PatientWeightPounds, rhs.pat08PatientWeightPounds).append(pat09PregnancyIndicator, rhs.pat09PregnancyIndicator).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

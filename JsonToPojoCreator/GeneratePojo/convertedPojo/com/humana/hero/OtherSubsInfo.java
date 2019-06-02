
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
    "sbr01_payerResponsibilitySequenceNoCode",
    "sbr02_individualRelationshipCode",
    "sbr03_referenceIdentification",
    "sbr04_otherInsuredGroupName",
    "sbr05_insuranceTypeCode",
    "sbr09_claimFilingIndicatorCode",
    "cas_claimLevelAdjustments",
    "amt01_payerAmountQlfrCode",
    "amt02_payerAmountPaid",
    "amt01_nonCoveredChargedAmountCode",
    "amt02_nonCoveredChargedAmount",
    "amt01_remainingPatientLiabilityCode",
    "amt02_remainingPatientLiability",
    "oi03_benefitsAssignmentCertificationIndicator",
    "oi04_patientSignatureSourceCode",
    "oi06_releaseOfInformationCode",
    "mia01_inpatientCoveredDays",
    "mia03_inpatientLifeTimePhychiatricDaysCount",
    "mia04_inpatientClaimDRGAmount",
    "mia05_inpatientClaimPaymentRemarkCode",
    "mia06_inpatientClaimDisproportionateShareAmount",
    "mia07_inpatientClaimMSPPassthroughAmount",
    "mia08_inpatientClaimPPSCapitalAmount",
    "mia09_inpatientPPSCapitalFSPDRGAmount",
    "mia10_inpatientPPSCapitalHSPDRGAmount",
    "mia11_inpatientPPSCapitalDSHDRGAmount",
    "mia12_inpatientOldCapitalAmount",
    "mia13_inpatientPPSCapitalIMEAmount",
    "mia14_inpatientPPSOperatingHospitalSpecificDRGAmount",
    "mia15_inpatientCostReportDayCount",
    "mia16_inpatientPPSOperatingFederalSpecificDRGAmount",
    "mia17_inpatientClaimPPSCapitalOutlierAmount",
    "mia18_inpatientClaimIndirectTeachingAmount",
    "mia19_inpatientNonPayableProfessionalComponentBilledAmount",
    "mia20_inpatientClaimPaymentRemarkCode1",
    "mia21_inpatientClaimPaymentRemarkCode2",
    "mia22_inpatientClaimPaymentRemarkCode3",
    "mia23_inpatientClaimPaymentRemarkCode4",
    "mia24_inpatientPPSCapitalExceptionAmount",
    "moa01_reimbursementRate",
    "moa02_hcpcsPayableAmount",
    "moa03_claimPaymentRemarkCode1",
    "moa04_claimPaymentRemarkCode2",
    "moa05_claimPaymentRemarkCode3",
    "moa06_claimPaymentRemarkCode4",
    "moa07_claimPaymentRemarkCode5",
    "moa08_endStageRenalDiseasePaymentAmount",
    "moa09_nonPayableProfessionalComponentBilledAmount"
})
public class OtherSubsInfo {

    @JsonProperty("sbr01_payerResponsibilitySequenceNoCode")
    private String sbr01PayerResponsibilitySequenceNoCode;
    @JsonProperty("sbr02_individualRelationshipCode")
    private String sbr02IndividualRelationshipCode;
    @JsonProperty("sbr03_referenceIdentification")
    private String sbr03ReferenceIdentification;
    @JsonProperty("sbr04_otherInsuredGroupName")
    private String sbr04OtherInsuredGroupName;
    @JsonProperty("sbr05_insuranceTypeCode")
    private String sbr05InsuranceTypeCode;
    @JsonProperty("sbr09_claimFilingIndicatorCode")
    private String sbr09ClaimFilingIndicatorCode;
    @JsonProperty("cas_claimLevelAdjustments")
    private List<CasClaimLevelAdjustment> casClaimLevelAdjustments = new ArrayList<CasClaimLevelAdjustment>();
    @JsonProperty("amt01_payerAmountQlfrCode")
    private String amt01PayerAmountQlfrCode;
    @JsonProperty("amt02_payerAmountPaid")
    private String amt02PayerAmountPaid;
    @JsonProperty("amt01_nonCoveredChargedAmountCode")
    private String amt01NonCoveredChargedAmountCode;
    @JsonProperty("amt02_nonCoveredChargedAmount")
    private String amt02NonCoveredChargedAmount;
    @JsonProperty("amt01_remainingPatientLiabilityCode")
    private String amt01RemainingPatientLiabilityCode;
    @JsonProperty("amt02_remainingPatientLiability")
    private String amt02RemainingPatientLiability;
    @JsonProperty("oi03_benefitsAssignmentCertificationIndicator")
    private String oi03BenefitsAssignmentCertificationIndicator;
    @JsonProperty("oi04_patientSignatureSourceCode")
    private String oi04PatientSignatureSourceCode;
    @JsonProperty("oi06_releaseOfInformationCode")
    private String oi06ReleaseOfInformationCode;
    @JsonProperty("mia01_inpatientCoveredDays")
    private String mia01InpatientCoveredDays;
    @JsonProperty("mia03_inpatientLifeTimePhychiatricDaysCount")
    private String mia03InpatientLifeTimePhychiatricDaysCount;
    @JsonProperty("mia04_inpatientClaimDRGAmount")
    private String mia04InpatientClaimDRGAmount;
    @JsonProperty("mia05_inpatientClaimPaymentRemarkCode")
    private String mia05InpatientClaimPaymentRemarkCode;
    @JsonProperty("mia06_inpatientClaimDisproportionateShareAmount")
    private String mia06InpatientClaimDisproportionateShareAmount;
    @JsonProperty("mia07_inpatientClaimMSPPassthroughAmount")
    private String mia07InpatientClaimMSPPassthroughAmount;
    @JsonProperty("mia08_inpatientClaimPPSCapitalAmount")
    private String mia08InpatientClaimPPSCapitalAmount;
    @JsonProperty("mia09_inpatientPPSCapitalFSPDRGAmount")
    private String mia09InpatientPPSCapitalFSPDRGAmount;
    @JsonProperty("mia10_inpatientPPSCapitalHSPDRGAmount")
    private String mia10InpatientPPSCapitalHSPDRGAmount;
    @JsonProperty("mia11_inpatientPPSCapitalDSHDRGAmount")
    private String mia11InpatientPPSCapitalDSHDRGAmount;
    @JsonProperty("mia12_inpatientOldCapitalAmount")
    private String mia12InpatientOldCapitalAmount;
    @JsonProperty("mia13_inpatientPPSCapitalIMEAmount")
    private String mia13InpatientPPSCapitalIMEAmount;
    @JsonProperty("mia14_inpatientPPSOperatingHospitalSpecificDRGAmount")
    private String mia14InpatientPPSOperatingHospitalSpecificDRGAmount;
    @JsonProperty("mia15_inpatientCostReportDayCount")
    private String mia15InpatientCostReportDayCount;
    @JsonProperty("mia16_inpatientPPSOperatingFederalSpecificDRGAmount")
    private String mia16InpatientPPSOperatingFederalSpecificDRGAmount;
    @JsonProperty("mia17_inpatientClaimPPSCapitalOutlierAmount")
    private String mia17InpatientClaimPPSCapitalOutlierAmount;
    @JsonProperty("mia18_inpatientClaimIndirectTeachingAmount")
    private String mia18InpatientClaimIndirectTeachingAmount;
    @JsonProperty("mia19_inpatientNonPayableProfessionalComponentBilledAmount")
    private String mia19InpatientNonPayableProfessionalComponentBilledAmount;
    @JsonProperty("mia20_inpatientClaimPaymentRemarkCode1")
    private String mia20InpatientClaimPaymentRemarkCode1;
    @JsonProperty("mia21_inpatientClaimPaymentRemarkCode2")
    private String mia21InpatientClaimPaymentRemarkCode2;
    @JsonProperty("mia22_inpatientClaimPaymentRemarkCode3")
    private String mia22InpatientClaimPaymentRemarkCode3;
    @JsonProperty("mia23_inpatientClaimPaymentRemarkCode4")
    private String mia23InpatientClaimPaymentRemarkCode4;
    @JsonProperty("mia24_inpatientPPSCapitalExceptionAmount")
    private String mia24InpatientPPSCapitalExceptionAmount;
    @JsonProperty("moa01_reimbursementRate")
    private String moa01ReimbursementRate;
    @JsonProperty("moa02_hcpcsPayableAmount")
    private String moa02HcpcsPayableAmount;
    @JsonProperty("moa03_claimPaymentRemarkCode1")
    private String moa03ClaimPaymentRemarkCode1;
    @JsonProperty("moa04_claimPaymentRemarkCode2")
    private String moa04ClaimPaymentRemarkCode2;
    @JsonProperty("moa05_claimPaymentRemarkCode3")
    private String moa05ClaimPaymentRemarkCode3;
    @JsonProperty("moa06_claimPaymentRemarkCode4")
    private String moa06ClaimPaymentRemarkCode4;
    @JsonProperty("moa07_claimPaymentRemarkCode5")
    private String moa07ClaimPaymentRemarkCode5;
    @JsonProperty("moa08_endStageRenalDiseasePaymentAmount")
    private String moa08EndStageRenalDiseasePaymentAmount;
    @JsonProperty("moa09_nonPayableProfessionalComponentBilledAmount")
    private String moa09NonPayableProfessionalComponentBilledAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sbr01_payerResponsibilitySequenceNoCode")
    public String getSbr01PayerResponsibilitySequenceNoCode() {
        return sbr01PayerResponsibilitySequenceNoCode;
    }

    @JsonProperty("sbr01_payerResponsibilitySequenceNoCode")
    public void setSbr01PayerResponsibilitySequenceNoCode(String sbr01PayerResponsibilitySequenceNoCode) {
        this.sbr01PayerResponsibilitySequenceNoCode = sbr01PayerResponsibilitySequenceNoCode;
    }

    public OtherSubsInfo withSbr01PayerResponsibilitySequenceNoCode(String sbr01PayerResponsibilitySequenceNoCode) {
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

    public OtherSubsInfo withSbr02IndividualRelationshipCode(String sbr02IndividualRelationshipCode) {
        this.sbr02IndividualRelationshipCode = sbr02IndividualRelationshipCode;
        return this;
    }

    @JsonProperty("sbr03_referenceIdentification")
    public String getSbr03ReferenceIdentification() {
        return sbr03ReferenceIdentification;
    }

    @JsonProperty("sbr03_referenceIdentification")
    public void setSbr03ReferenceIdentification(String sbr03ReferenceIdentification) {
        this.sbr03ReferenceIdentification = sbr03ReferenceIdentification;
    }

    public OtherSubsInfo withSbr03ReferenceIdentification(String sbr03ReferenceIdentification) {
        this.sbr03ReferenceIdentification = sbr03ReferenceIdentification;
        return this;
    }

    @JsonProperty("sbr04_otherInsuredGroupName")
    public String getSbr04OtherInsuredGroupName() {
        return sbr04OtherInsuredGroupName;
    }

    @JsonProperty("sbr04_otherInsuredGroupName")
    public void setSbr04OtherInsuredGroupName(String sbr04OtherInsuredGroupName) {
        this.sbr04OtherInsuredGroupName = sbr04OtherInsuredGroupName;
    }

    public OtherSubsInfo withSbr04OtherInsuredGroupName(String sbr04OtherInsuredGroupName) {
        this.sbr04OtherInsuredGroupName = sbr04OtherInsuredGroupName;
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

    public OtherSubsInfo withSbr05InsuranceTypeCode(String sbr05InsuranceTypeCode) {
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

    public OtherSubsInfo withSbr09ClaimFilingIndicatorCode(String sbr09ClaimFilingIndicatorCode) {
        this.sbr09ClaimFilingIndicatorCode = sbr09ClaimFilingIndicatorCode;
        return this;
    }

    @JsonProperty("cas_claimLevelAdjustments")
    public List<CasClaimLevelAdjustment> getCasClaimLevelAdjustments() {
        return casClaimLevelAdjustments;
    }

    @JsonProperty("cas_claimLevelAdjustments")
    public void setCasClaimLevelAdjustments(List<CasClaimLevelAdjustment> casClaimLevelAdjustments) {
        this.casClaimLevelAdjustments = casClaimLevelAdjustments;
    }

    public OtherSubsInfo withCasClaimLevelAdjustments(List<CasClaimLevelAdjustment> casClaimLevelAdjustments) {
        this.casClaimLevelAdjustments = casClaimLevelAdjustments;
        return this;
    }

    @JsonProperty("amt01_payerAmountQlfrCode")
    public String getAmt01PayerAmountQlfrCode() {
        return amt01PayerAmountQlfrCode;
    }

    @JsonProperty("amt01_payerAmountQlfrCode")
    public void setAmt01PayerAmountQlfrCode(String amt01PayerAmountQlfrCode) {
        this.amt01PayerAmountQlfrCode = amt01PayerAmountQlfrCode;
    }

    public OtherSubsInfo withAmt01PayerAmountQlfrCode(String amt01PayerAmountQlfrCode) {
        this.amt01PayerAmountQlfrCode = amt01PayerAmountQlfrCode;
        return this;
    }

    @JsonProperty("amt02_payerAmountPaid")
    public String getAmt02PayerAmountPaid() {
        return amt02PayerAmountPaid;
    }

    @JsonProperty("amt02_payerAmountPaid")
    public void setAmt02PayerAmountPaid(String amt02PayerAmountPaid) {
        this.amt02PayerAmountPaid = amt02PayerAmountPaid;
    }

    public OtherSubsInfo withAmt02PayerAmountPaid(String amt02PayerAmountPaid) {
        this.amt02PayerAmountPaid = amt02PayerAmountPaid;
        return this;
    }

    @JsonProperty("amt01_nonCoveredChargedAmountCode")
    public String getAmt01NonCoveredChargedAmountCode() {
        return amt01NonCoveredChargedAmountCode;
    }

    @JsonProperty("amt01_nonCoveredChargedAmountCode")
    public void setAmt01NonCoveredChargedAmountCode(String amt01NonCoveredChargedAmountCode) {
        this.amt01NonCoveredChargedAmountCode = amt01NonCoveredChargedAmountCode;
    }

    public OtherSubsInfo withAmt01NonCoveredChargedAmountCode(String amt01NonCoveredChargedAmountCode) {
        this.amt01NonCoveredChargedAmountCode = amt01NonCoveredChargedAmountCode;
        return this;
    }

    @JsonProperty("amt02_nonCoveredChargedAmount")
    public String getAmt02NonCoveredChargedAmount() {
        return amt02NonCoveredChargedAmount;
    }

    @JsonProperty("amt02_nonCoveredChargedAmount")
    public void setAmt02NonCoveredChargedAmount(String amt02NonCoveredChargedAmount) {
        this.amt02NonCoveredChargedAmount = amt02NonCoveredChargedAmount;
    }

    public OtherSubsInfo withAmt02NonCoveredChargedAmount(String amt02NonCoveredChargedAmount) {
        this.amt02NonCoveredChargedAmount = amt02NonCoveredChargedAmount;
        return this;
    }

    @JsonProperty("amt01_remainingPatientLiabilityCode")
    public String getAmt01RemainingPatientLiabilityCode() {
        return amt01RemainingPatientLiabilityCode;
    }

    @JsonProperty("amt01_remainingPatientLiabilityCode")
    public void setAmt01RemainingPatientLiabilityCode(String amt01RemainingPatientLiabilityCode) {
        this.amt01RemainingPatientLiabilityCode = amt01RemainingPatientLiabilityCode;
    }

    public OtherSubsInfo withAmt01RemainingPatientLiabilityCode(String amt01RemainingPatientLiabilityCode) {
        this.amt01RemainingPatientLiabilityCode = amt01RemainingPatientLiabilityCode;
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

    public OtherSubsInfo withAmt02RemainingPatientLiability(String amt02RemainingPatientLiability) {
        this.amt02RemainingPatientLiability = amt02RemainingPatientLiability;
        return this;
    }

    @JsonProperty("oi03_benefitsAssignmentCertificationIndicator")
    public String getOi03BenefitsAssignmentCertificationIndicator() {
        return oi03BenefitsAssignmentCertificationIndicator;
    }

    @JsonProperty("oi03_benefitsAssignmentCertificationIndicator")
    public void setOi03BenefitsAssignmentCertificationIndicator(String oi03BenefitsAssignmentCertificationIndicator) {
        this.oi03BenefitsAssignmentCertificationIndicator = oi03BenefitsAssignmentCertificationIndicator;
    }

    public OtherSubsInfo withOi03BenefitsAssignmentCertificationIndicator(String oi03BenefitsAssignmentCertificationIndicator) {
        this.oi03BenefitsAssignmentCertificationIndicator = oi03BenefitsAssignmentCertificationIndicator;
        return this;
    }

    @JsonProperty("oi04_patientSignatureSourceCode")
    public String getOi04PatientSignatureSourceCode() {
        return oi04PatientSignatureSourceCode;
    }

    @JsonProperty("oi04_patientSignatureSourceCode")
    public void setOi04PatientSignatureSourceCode(String oi04PatientSignatureSourceCode) {
        this.oi04PatientSignatureSourceCode = oi04PatientSignatureSourceCode;
    }

    public OtherSubsInfo withOi04PatientSignatureSourceCode(String oi04PatientSignatureSourceCode) {
        this.oi04PatientSignatureSourceCode = oi04PatientSignatureSourceCode;
        return this;
    }

    @JsonProperty("oi06_releaseOfInformationCode")
    public String getOi06ReleaseOfInformationCode() {
        return oi06ReleaseOfInformationCode;
    }

    @JsonProperty("oi06_releaseOfInformationCode")
    public void setOi06ReleaseOfInformationCode(String oi06ReleaseOfInformationCode) {
        this.oi06ReleaseOfInformationCode = oi06ReleaseOfInformationCode;
    }

    public OtherSubsInfo withOi06ReleaseOfInformationCode(String oi06ReleaseOfInformationCode) {
        this.oi06ReleaseOfInformationCode = oi06ReleaseOfInformationCode;
        return this;
    }

    @JsonProperty("mia01_inpatientCoveredDays")
    public String getMia01InpatientCoveredDays() {
        return mia01InpatientCoveredDays;
    }

    @JsonProperty("mia01_inpatientCoveredDays")
    public void setMia01InpatientCoveredDays(String mia01InpatientCoveredDays) {
        this.mia01InpatientCoveredDays = mia01InpatientCoveredDays;
    }

    public OtherSubsInfo withMia01InpatientCoveredDays(String mia01InpatientCoveredDays) {
        this.mia01InpatientCoveredDays = mia01InpatientCoveredDays;
        return this;
    }

    @JsonProperty("mia03_inpatientLifeTimePhychiatricDaysCount")
    public String getMia03InpatientLifeTimePhychiatricDaysCount() {
        return mia03InpatientLifeTimePhychiatricDaysCount;
    }

    @JsonProperty("mia03_inpatientLifeTimePhychiatricDaysCount")
    public void setMia03InpatientLifeTimePhychiatricDaysCount(String mia03InpatientLifeTimePhychiatricDaysCount) {
        this.mia03InpatientLifeTimePhychiatricDaysCount = mia03InpatientLifeTimePhychiatricDaysCount;
    }

    public OtherSubsInfo withMia03InpatientLifeTimePhychiatricDaysCount(String mia03InpatientLifeTimePhychiatricDaysCount) {
        this.mia03InpatientLifeTimePhychiatricDaysCount = mia03InpatientLifeTimePhychiatricDaysCount;
        return this;
    }

    @JsonProperty("mia04_inpatientClaimDRGAmount")
    public String getMia04InpatientClaimDRGAmount() {
        return mia04InpatientClaimDRGAmount;
    }

    @JsonProperty("mia04_inpatientClaimDRGAmount")
    public void setMia04InpatientClaimDRGAmount(String mia04InpatientClaimDRGAmount) {
        this.mia04InpatientClaimDRGAmount = mia04InpatientClaimDRGAmount;
    }

    public OtherSubsInfo withMia04InpatientClaimDRGAmount(String mia04InpatientClaimDRGAmount) {
        this.mia04InpatientClaimDRGAmount = mia04InpatientClaimDRGAmount;
        return this;
    }

    @JsonProperty("mia05_inpatientClaimPaymentRemarkCode")
    public String getMia05InpatientClaimPaymentRemarkCode() {
        return mia05InpatientClaimPaymentRemarkCode;
    }

    @JsonProperty("mia05_inpatientClaimPaymentRemarkCode")
    public void setMia05InpatientClaimPaymentRemarkCode(String mia05InpatientClaimPaymentRemarkCode) {
        this.mia05InpatientClaimPaymentRemarkCode = mia05InpatientClaimPaymentRemarkCode;
    }

    public OtherSubsInfo withMia05InpatientClaimPaymentRemarkCode(String mia05InpatientClaimPaymentRemarkCode) {
        this.mia05InpatientClaimPaymentRemarkCode = mia05InpatientClaimPaymentRemarkCode;
        return this;
    }

    @JsonProperty("mia06_inpatientClaimDisproportionateShareAmount")
    public String getMia06InpatientClaimDisproportionateShareAmount() {
        return mia06InpatientClaimDisproportionateShareAmount;
    }

    @JsonProperty("mia06_inpatientClaimDisproportionateShareAmount")
    public void setMia06InpatientClaimDisproportionateShareAmount(String mia06InpatientClaimDisproportionateShareAmount) {
        this.mia06InpatientClaimDisproportionateShareAmount = mia06InpatientClaimDisproportionateShareAmount;
    }

    public OtherSubsInfo withMia06InpatientClaimDisproportionateShareAmount(String mia06InpatientClaimDisproportionateShareAmount) {
        this.mia06InpatientClaimDisproportionateShareAmount = mia06InpatientClaimDisproportionateShareAmount;
        return this;
    }

    @JsonProperty("mia07_inpatientClaimMSPPassthroughAmount")
    public String getMia07InpatientClaimMSPPassthroughAmount() {
        return mia07InpatientClaimMSPPassthroughAmount;
    }

    @JsonProperty("mia07_inpatientClaimMSPPassthroughAmount")
    public void setMia07InpatientClaimMSPPassthroughAmount(String mia07InpatientClaimMSPPassthroughAmount) {
        this.mia07InpatientClaimMSPPassthroughAmount = mia07InpatientClaimMSPPassthroughAmount;
    }

    public OtherSubsInfo withMia07InpatientClaimMSPPassthroughAmount(String mia07InpatientClaimMSPPassthroughAmount) {
        this.mia07InpatientClaimMSPPassthroughAmount = mia07InpatientClaimMSPPassthroughAmount;
        return this;
    }

    @JsonProperty("mia08_inpatientClaimPPSCapitalAmount")
    public String getMia08InpatientClaimPPSCapitalAmount() {
        return mia08InpatientClaimPPSCapitalAmount;
    }

    @JsonProperty("mia08_inpatientClaimPPSCapitalAmount")
    public void setMia08InpatientClaimPPSCapitalAmount(String mia08InpatientClaimPPSCapitalAmount) {
        this.mia08InpatientClaimPPSCapitalAmount = mia08InpatientClaimPPSCapitalAmount;
    }

    public OtherSubsInfo withMia08InpatientClaimPPSCapitalAmount(String mia08InpatientClaimPPSCapitalAmount) {
        this.mia08InpatientClaimPPSCapitalAmount = mia08InpatientClaimPPSCapitalAmount;
        return this;
    }

    @JsonProperty("mia09_inpatientPPSCapitalFSPDRGAmount")
    public String getMia09InpatientPPSCapitalFSPDRGAmount() {
        return mia09InpatientPPSCapitalFSPDRGAmount;
    }

    @JsonProperty("mia09_inpatientPPSCapitalFSPDRGAmount")
    public void setMia09InpatientPPSCapitalFSPDRGAmount(String mia09InpatientPPSCapitalFSPDRGAmount) {
        this.mia09InpatientPPSCapitalFSPDRGAmount = mia09InpatientPPSCapitalFSPDRGAmount;
    }

    public OtherSubsInfo withMia09InpatientPPSCapitalFSPDRGAmount(String mia09InpatientPPSCapitalFSPDRGAmount) {
        this.mia09InpatientPPSCapitalFSPDRGAmount = mia09InpatientPPSCapitalFSPDRGAmount;
        return this;
    }

    @JsonProperty("mia10_inpatientPPSCapitalHSPDRGAmount")
    public String getMia10InpatientPPSCapitalHSPDRGAmount() {
        return mia10InpatientPPSCapitalHSPDRGAmount;
    }

    @JsonProperty("mia10_inpatientPPSCapitalHSPDRGAmount")
    public void setMia10InpatientPPSCapitalHSPDRGAmount(String mia10InpatientPPSCapitalHSPDRGAmount) {
        this.mia10InpatientPPSCapitalHSPDRGAmount = mia10InpatientPPSCapitalHSPDRGAmount;
    }

    public OtherSubsInfo withMia10InpatientPPSCapitalHSPDRGAmount(String mia10InpatientPPSCapitalHSPDRGAmount) {
        this.mia10InpatientPPSCapitalHSPDRGAmount = mia10InpatientPPSCapitalHSPDRGAmount;
        return this;
    }

    @JsonProperty("mia11_inpatientPPSCapitalDSHDRGAmount")
    public String getMia11InpatientPPSCapitalDSHDRGAmount() {
        return mia11InpatientPPSCapitalDSHDRGAmount;
    }

    @JsonProperty("mia11_inpatientPPSCapitalDSHDRGAmount")
    public void setMia11InpatientPPSCapitalDSHDRGAmount(String mia11InpatientPPSCapitalDSHDRGAmount) {
        this.mia11InpatientPPSCapitalDSHDRGAmount = mia11InpatientPPSCapitalDSHDRGAmount;
    }

    public OtherSubsInfo withMia11InpatientPPSCapitalDSHDRGAmount(String mia11InpatientPPSCapitalDSHDRGAmount) {
        this.mia11InpatientPPSCapitalDSHDRGAmount = mia11InpatientPPSCapitalDSHDRGAmount;
        return this;
    }

    @JsonProperty("mia12_inpatientOldCapitalAmount")
    public String getMia12InpatientOldCapitalAmount() {
        return mia12InpatientOldCapitalAmount;
    }

    @JsonProperty("mia12_inpatientOldCapitalAmount")
    public void setMia12InpatientOldCapitalAmount(String mia12InpatientOldCapitalAmount) {
        this.mia12InpatientOldCapitalAmount = mia12InpatientOldCapitalAmount;
    }

    public OtherSubsInfo withMia12InpatientOldCapitalAmount(String mia12InpatientOldCapitalAmount) {
        this.mia12InpatientOldCapitalAmount = mia12InpatientOldCapitalAmount;
        return this;
    }

    @JsonProperty("mia13_inpatientPPSCapitalIMEAmount")
    public String getMia13InpatientPPSCapitalIMEAmount() {
        return mia13InpatientPPSCapitalIMEAmount;
    }

    @JsonProperty("mia13_inpatientPPSCapitalIMEAmount")
    public void setMia13InpatientPPSCapitalIMEAmount(String mia13InpatientPPSCapitalIMEAmount) {
        this.mia13InpatientPPSCapitalIMEAmount = mia13InpatientPPSCapitalIMEAmount;
    }

    public OtherSubsInfo withMia13InpatientPPSCapitalIMEAmount(String mia13InpatientPPSCapitalIMEAmount) {
        this.mia13InpatientPPSCapitalIMEAmount = mia13InpatientPPSCapitalIMEAmount;
        return this;
    }

    @JsonProperty("mia14_inpatientPPSOperatingHospitalSpecificDRGAmount")
    public String getMia14InpatientPPSOperatingHospitalSpecificDRGAmount() {
        return mia14InpatientPPSOperatingHospitalSpecificDRGAmount;
    }

    @JsonProperty("mia14_inpatientPPSOperatingHospitalSpecificDRGAmount")
    public void setMia14InpatientPPSOperatingHospitalSpecificDRGAmount(String mia14InpatientPPSOperatingHospitalSpecificDRGAmount) {
        this.mia14InpatientPPSOperatingHospitalSpecificDRGAmount = mia14InpatientPPSOperatingHospitalSpecificDRGAmount;
    }

    public OtherSubsInfo withMia14InpatientPPSOperatingHospitalSpecificDRGAmount(String mia14InpatientPPSOperatingHospitalSpecificDRGAmount) {
        this.mia14InpatientPPSOperatingHospitalSpecificDRGAmount = mia14InpatientPPSOperatingHospitalSpecificDRGAmount;
        return this;
    }

    @JsonProperty("mia15_inpatientCostReportDayCount")
    public String getMia15InpatientCostReportDayCount() {
        return mia15InpatientCostReportDayCount;
    }

    @JsonProperty("mia15_inpatientCostReportDayCount")
    public void setMia15InpatientCostReportDayCount(String mia15InpatientCostReportDayCount) {
        this.mia15InpatientCostReportDayCount = mia15InpatientCostReportDayCount;
    }

    public OtherSubsInfo withMia15InpatientCostReportDayCount(String mia15InpatientCostReportDayCount) {
        this.mia15InpatientCostReportDayCount = mia15InpatientCostReportDayCount;
        return this;
    }

    @JsonProperty("mia16_inpatientPPSOperatingFederalSpecificDRGAmount")
    public String getMia16InpatientPPSOperatingFederalSpecificDRGAmount() {
        return mia16InpatientPPSOperatingFederalSpecificDRGAmount;
    }

    @JsonProperty("mia16_inpatientPPSOperatingFederalSpecificDRGAmount")
    public void setMia16InpatientPPSOperatingFederalSpecificDRGAmount(String mia16InpatientPPSOperatingFederalSpecificDRGAmount) {
        this.mia16InpatientPPSOperatingFederalSpecificDRGAmount = mia16InpatientPPSOperatingFederalSpecificDRGAmount;
    }

    public OtherSubsInfo withMia16InpatientPPSOperatingFederalSpecificDRGAmount(String mia16InpatientPPSOperatingFederalSpecificDRGAmount) {
        this.mia16InpatientPPSOperatingFederalSpecificDRGAmount = mia16InpatientPPSOperatingFederalSpecificDRGAmount;
        return this;
    }

    @JsonProperty("mia17_inpatientClaimPPSCapitalOutlierAmount")
    public String getMia17InpatientClaimPPSCapitalOutlierAmount() {
        return mia17InpatientClaimPPSCapitalOutlierAmount;
    }

    @JsonProperty("mia17_inpatientClaimPPSCapitalOutlierAmount")
    public void setMia17InpatientClaimPPSCapitalOutlierAmount(String mia17InpatientClaimPPSCapitalOutlierAmount) {
        this.mia17InpatientClaimPPSCapitalOutlierAmount = mia17InpatientClaimPPSCapitalOutlierAmount;
    }

    public OtherSubsInfo withMia17InpatientClaimPPSCapitalOutlierAmount(String mia17InpatientClaimPPSCapitalOutlierAmount) {
        this.mia17InpatientClaimPPSCapitalOutlierAmount = mia17InpatientClaimPPSCapitalOutlierAmount;
        return this;
    }

    @JsonProperty("mia18_inpatientClaimIndirectTeachingAmount")
    public String getMia18InpatientClaimIndirectTeachingAmount() {
        return mia18InpatientClaimIndirectTeachingAmount;
    }

    @JsonProperty("mia18_inpatientClaimIndirectTeachingAmount")
    public void setMia18InpatientClaimIndirectTeachingAmount(String mia18InpatientClaimIndirectTeachingAmount) {
        this.mia18InpatientClaimIndirectTeachingAmount = mia18InpatientClaimIndirectTeachingAmount;
    }

    public OtherSubsInfo withMia18InpatientClaimIndirectTeachingAmount(String mia18InpatientClaimIndirectTeachingAmount) {
        this.mia18InpatientClaimIndirectTeachingAmount = mia18InpatientClaimIndirectTeachingAmount;
        return this;
    }

    @JsonProperty("mia19_inpatientNonPayableProfessionalComponentBilledAmount")
    public String getMia19InpatientNonPayableProfessionalComponentBilledAmount() {
        return mia19InpatientNonPayableProfessionalComponentBilledAmount;
    }

    @JsonProperty("mia19_inpatientNonPayableProfessionalComponentBilledAmount")
    public void setMia19InpatientNonPayableProfessionalComponentBilledAmount(String mia19InpatientNonPayableProfessionalComponentBilledAmount) {
        this.mia19InpatientNonPayableProfessionalComponentBilledAmount = mia19InpatientNonPayableProfessionalComponentBilledAmount;
    }

    public OtherSubsInfo withMia19InpatientNonPayableProfessionalComponentBilledAmount(String mia19InpatientNonPayableProfessionalComponentBilledAmount) {
        this.mia19InpatientNonPayableProfessionalComponentBilledAmount = mia19InpatientNonPayableProfessionalComponentBilledAmount;
        return this;
    }

    @JsonProperty("mia20_inpatientClaimPaymentRemarkCode1")
    public String getMia20InpatientClaimPaymentRemarkCode1() {
        return mia20InpatientClaimPaymentRemarkCode1;
    }

    @JsonProperty("mia20_inpatientClaimPaymentRemarkCode1")
    public void setMia20InpatientClaimPaymentRemarkCode1(String mia20InpatientClaimPaymentRemarkCode1) {
        this.mia20InpatientClaimPaymentRemarkCode1 = mia20InpatientClaimPaymentRemarkCode1;
    }

    public OtherSubsInfo withMia20InpatientClaimPaymentRemarkCode1(String mia20InpatientClaimPaymentRemarkCode1) {
        this.mia20InpatientClaimPaymentRemarkCode1 = mia20InpatientClaimPaymentRemarkCode1;
        return this;
    }

    @JsonProperty("mia21_inpatientClaimPaymentRemarkCode2")
    public String getMia21InpatientClaimPaymentRemarkCode2() {
        return mia21InpatientClaimPaymentRemarkCode2;
    }

    @JsonProperty("mia21_inpatientClaimPaymentRemarkCode2")
    public void setMia21InpatientClaimPaymentRemarkCode2(String mia21InpatientClaimPaymentRemarkCode2) {
        this.mia21InpatientClaimPaymentRemarkCode2 = mia21InpatientClaimPaymentRemarkCode2;
    }

    public OtherSubsInfo withMia21InpatientClaimPaymentRemarkCode2(String mia21InpatientClaimPaymentRemarkCode2) {
        this.mia21InpatientClaimPaymentRemarkCode2 = mia21InpatientClaimPaymentRemarkCode2;
        return this;
    }

    @JsonProperty("mia22_inpatientClaimPaymentRemarkCode3")
    public String getMia22InpatientClaimPaymentRemarkCode3() {
        return mia22InpatientClaimPaymentRemarkCode3;
    }

    @JsonProperty("mia22_inpatientClaimPaymentRemarkCode3")
    public void setMia22InpatientClaimPaymentRemarkCode3(String mia22InpatientClaimPaymentRemarkCode3) {
        this.mia22InpatientClaimPaymentRemarkCode3 = mia22InpatientClaimPaymentRemarkCode3;
    }

    public OtherSubsInfo withMia22InpatientClaimPaymentRemarkCode3(String mia22InpatientClaimPaymentRemarkCode3) {
        this.mia22InpatientClaimPaymentRemarkCode3 = mia22InpatientClaimPaymentRemarkCode3;
        return this;
    }

    @JsonProperty("mia23_inpatientClaimPaymentRemarkCode4")
    public String getMia23InpatientClaimPaymentRemarkCode4() {
        return mia23InpatientClaimPaymentRemarkCode4;
    }

    @JsonProperty("mia23_inpatientClaimPaymentRemarkCode4")
    public void setMia23InpatientClaimPaymentRemarkCode4(String mia23InpatientClaimPaymentRemarkCode4) {
        this.mia23InpatientClaimPaymentRemarkCode4 = mia23InpatientClaimPaymentRemarkCode4;
    }

    public OtherSubsInfo withMia23InpatientClaimPaymentRemarkCode4(String mia23InpatientClaimPaymentRemarkCode4) {
        this.mia23InpatientClaimPaymentRemarkCode4 = mia23InpatientClaimPaymentRemarkCode4;
        return this;
    }

    @JsonProperty("mia24_inpatientPPSCapitalExceptionAmount")
    public String getMia24InpatientPPSCapitalExceptionAmount() {
        return mia24InpatientPPSCapitalExceptionAmount;
    }

    @JsonProperty("mia24_inpatientPPSCapitalExceptionAmount")
    public void setMia24InpatientPPSCapitalExceptionAmount(String mia24InpatientPPSCapitalExceptionAmount) {
        this.mia24InpatientPPSCapitalExceptionAmount = mia24InpatientPPSCapitalExceptionAmount;
    }

    public OtherSubsInfo withMia24InpatientPPSCapitalExceptionAmount(String mia24InpatientPPSCapitalExceptionAmount) {
        this.mia24InpatientPPSCapitalExceptionAmount = mia24InpatientPPSCapitalExceptionAmount;
        return this;
    }

    @JsonProperty("moa01_reimbursementRate")
    public String getMoa01ReimbursementRate() {
        return moa01ReimbursementRate;
    }

    @JsonProperty("moa01_reimbursementRate")
    public void setMoa01ReimbursementRate(String moa01ReimbursementRate) {
        this.moa01ReimbursementRate = moa01ReimbursementRate;
    }

    public OtherSubsInfo withMoa01ReimbursementRate(String moa01ReimbursementRate) {
        this.moa01ReimbursementRate = moa01ReimbursementRate;
        return this;
    }

    @JsonProperty("moa02_hcpcsPayableAmount")
    public String getMoa02HcpcsPayableAmount() {
        return moa02HcpcsPayableAmount;
    }

    @JsonProperty("moa02_hcpcsPayableAmount")
    public void setMoa02HcpcsPayableAmount(String moa02HcpcsPayableAmount) {
        this.moa02HcpcsPayableAmount = moa02HcpcsPayableAmount;
    }

    public OtherSubsInfo withMoa02HcpcsPayableAmount(String moa02HcpcsPayableAmount) {
        this.moa02HcpcsPayableAmount = moa02HcpcsPayableAmount;
        return this;
    }

    @JsonProperty("moa03_claimPaymentRemarkCode1")
    public String getMoa03ClaimPaymentRemarkCode1() {
        return moa03ClaimPaymentRemarkCode1;
    }

    @JsonProperty("moa03_claimPaymentRemarkCode1")
    public void setMoa03ClaimPaymentRemarkCode1(String moa03ClaimPaymentRemarkCode1) {
        this.moa03ClaimPaymentRemarkCode1 = moa03ClaimPaymentRemarkCode1;
    }

    public OtherSubsInfo withMoa03ClaimPaymentRemarkCode1(String moa03ClaimPaymentRemarkCode1) {
        this.moa03ClaimPaymentRemarkCode1 = moa03ClaimPaymentRemarkCode1;
        return this;
    }

    @JsonProperty("moa04_claimPaymentRemarkCode2")
    public String getMoa04ClaimPaymentRemarkCode2() {
        return moa04ClaimPaymentRemarkCode2;
    }

    @JsonProperty("moa04_claimPaymentRemarkCode2")
    public void setMoa04ClaimPaymentRemarkCode2(String moa04ClaimPaymentRemarkCode2) {
        this.moa04ClaimPaymentRemarkCode2 = moa04ClaimPaymentRemarkCode2;
    }

    public OtherSubsInfo withMoa04ClaimPaymentRemarkCode2(String moa04ClaimPaymentRemarkCode2) {
        this.moa04ClaimPaymentRemarkCode2 = moa04ClaimPaymentRemarkCode2;
        return this;
    }

    @JsonProperty("moa05_claimPaymentRemarkCode3")
    public String getMoa05ClaimPaymentRemarkCode3() {
        return moa05ClaimPaymentRemarkCode3;
    }

    @JsonProperty("moa05_claimPaymentRemarkCode3")
    public void setMoa05ClaimPaymentRemarkCode3(String moa05ClaimPaymentRemarkCode3) {
        this.moa05ClaimPaymentRemarkCode3 = moa05ClaimPaymentRemarkCode3;
    }

    public OtherSubsInfo withMoa05ClaimPaymentRemarkCode3(String moa05ClaimPaymentRemarkCode3) {
        this.moa05ClaimPaymentRemarkCode3 = moa05ClaimPaymentRemarkCode3;
        return this;
    }

    @JsonProperty("moa06_claimPaymentRemarkCode4")
    public String getMoa06ClaimPaymentRemarkCode4() {
        return moa06ClaimPaymentRemarkCode4;
    }

    @JsonProperty("moa06_claimPaymentRemarkCode4")
    public void setMoa06ClaimPaymentRemarkCode4(String moa06ClaimPaymentRemarkCode4) {
        this.moa06ClaimPaymentRemarkCode4 = moa06ClaimPaymentRemarkCode4;
    }

    public OtherSubsInfo withMoa06ClaimPaymentRemarkCode4(String moa06ClaimPaymentRemarkCode4) {
        this.moa06ClaimPaymentRemarkCode4 = moa06ClaimPaymentRemarkCode4;
        return this;
    }

    @JsonProperty("moa07_claimPaymentRemarkCode5")
    public String getMoa07ClaimPaymentRemarkCode5() {
        return moa07ClaimPaymentRemarkCode5;
    }

    @JsonProperty("moa07_claimPaymentRemarkCode5")
    public void setMoa07ClaimPaymentRemarkCode5(String moa07ClaimPaymentRemarkCode5) {
        this.moa07ClaimPaymentRemarkCode5 = moa07ClaimPaymentRemarkCode5;
    }

    public OtherSubsInfo withMoa07ClaimPaymentRemarkCode5(String moa07ClaimPaymentRemarkCode5) {
        this.moa07ClaimPaymentRemarkCode5 = moa07ClaimPaymentRemarkCode5;
        return this;
    }

    @JsonProperty("moa08_endStageRenalDiseasePaymentAmount")
    public String getMoa08EndStageRenalDiseasePaymentAmount() {
        return moa08EndStageRenalDiseasePaymentAmount;
    }

    @JsonProperty("moa08_endStageRenalDiseasePaymentAmount")
    public void setMoa08EndStageRenalDiseasePaymentAmount(String moa08EndStageRenalDiseasePaymentAmount) {
        this.moa08EndStageRenalDiseasePaymentAmount = moa08EndStageRenalDiseasePaymentAmount;
    }

    public OtherSubsInfo withMoa08EndStageRenalDiseasePaymentAmount(String moa08EndStageRenalDiseasePaymentAmount) {
        this.moa08EndStageRenalDiseasePaymentAmount = moa08EndStageRenalDiseasePaymentAmount;
        return this;
    }

    @JsonProperty("moa09_nonPayableProfessionalComponentBilledAmount")
    public String getMoa09NonPayableProfessionalComponentBilledAmount() {
        return moa09NonPayableProfessionalComponentBilledAmount;
    }

    @JsonProperty("moa09_nonPayableProfessionalComponentBilledAmount")
    public void setMoa09NonPayableProfessionalComponentBilledAmount(String moa09NonPayableProfessionalComponentBilledAmount) {
        this.moa09NonPayableProfessionalComponentBilledAmount = moa09NonPayableProfessionalComponentBilledAmount;
    }

    public OtherSubsInfo withMoa09NonPayableProfessionalComponentBilledAmount(String moa09NonPayableProfessionalComponentBilledAmount) {
        this.moa09NonPayableProfessionalComponentBilledAmount = moa09NonPayableProfessionalComponentBilledAmount;
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

    public OtherSubsInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sbr01PayerResponsibilitySequenceNoCode).append(sbr02IndividualRelationshipCode).append(sbr03ReferenceIdentification).append(sbr04OtherInsuredGroupName).append(sbr05InsuranceTypeCode).append(sbr09ClaimFilingIndicatorCode).append(casClaimLevelAdjustments).append(amt01PayerAmountQlfrCode).append(amt02PayerAmountPaid).append(amt01NonCoveredChargedAmountCode).append(amt02NonCoveredChargedAmount).append(amt01RemainingPatientLiabilityCode).append(amt02RemainingPatientLiability).append(oi03BenefitsAssignmentCertificationIndicator).append(oi04PatientSignatureSourceCode).append(oi06ReleaseOfInformationCode).append(mia01InpatientCoveredDays).append(mia03InpatientLifeTimePhychiatricDaysCount).append(mia04InpatientClaimDRGAmount).append(mia05InpatientClaimPaymentRemarkCode).append(mia06InpatientClaimDisproportionateShareAmount).append(mia07InpatientClaimMSPPassthroughAmount).append(mia08InpatientClaimPPSCapitalAmount).append(mia09InpatientPPSCapitalFSPDRGAmount).append(mia10InpatientPPSCapitalHSPDRGAmount).append(mia11InpatientPPSCapitalDSHDRGAmount).append(mia12InpatientOldCapitalAmount).append(mia13InpatientPPSCapitalIMEAmount).append(mia14InpatientPPSOperatingHospitalSpecificDRGAmount).append(mia15InpatientCostReportDayCount).append(mia16InpatientPPSOperatingFederalSpecificDRGAmount).append(mia17InpatientClaimPPSCapitalOutlierAmount).append(mia18InpatientClaimIndirectTeachingAmount).append(mia19InpatientNonPayableProfessionalComponentBilledAmount).append(mia20InpatientClaimPaymentRemarkCode1).append(mia21InpatientClaimPaymentRemarkCode2).append(mia22InpatientClaimPaymentRemarkCode3).append(mia23InpatientClaimPaymentRemarkCode4).append(mia24InpatientPPSCapitalExceptionAmount).append(moa01ReimbursementRate).append(moa02HcpcsPayableAmount).append(moa03ClaimPaymentRemarkCode1).append(moa04ClaimPaymentRemarkCode2).append(moa05ClaimPaymentRemarkCode3).append(moa06ClaimPaymentRemarkCode4).append(moa07ClaimPaymentRemarkCode5).append(moa08EndStageRenalDiseasePaymentAmount).append(moa09NonPayableProfessionalComponentBilledAmount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherSubsInfo) == false) {
            return false;
        }
        OtherSubsInfo rhs = ((OtherSubsInfo) other);
        return new EqualsBuilder().append(sbr01PayerResponsibilitySequenceNoCode, rhs.sbr01PayerResponsibilitySequenceNoCode).append(sbr02IndividualRelationshipCode, rhs.sbr02IndividualRelationshipCode).append(sbr03ReferenceIdentification, rhs.sbr03ReferenceIdentification).append(sbr04OtherInsuredGroupName, rhs.sbr04OtherInsuredGroupName).append(sbr05InsuranceTypeCode, rhs.sbr05InsuranceTypeCode).append(sbr09ClaimFilingIndicatorCode, rhs.sbr09ClaimFilingIndicatorCode).append(casClaimLevelAdjustments, rhs.casClaimLevelAdjustments).append(amt01PayerAmountQlfrCode, rhs.amt01PayerAmountQlfrCode).append(amt02PayerAmountPaid, rhs.amt02PayerAmountPaid).append(amt01NonCoveredChargedAmountCode, rhs.amt01NonCoveredChargedAmountCode).append(amt02NonCoveredChargedAmount, rhs.amt02NonCoveredChargedAmount).append(amt01RemainingPatientLiabilityCode, rhs.amt01RemainingPatientLiabilityCode).append(amt02RemainingPatientLiability, rhs.amt02RemainingPatientLiability).append(oi03BenefitsAssignmentCertificationIndicator, rhs.oi03BenefitsAssignmentCertificationIndicator).append(oi04PatientSignatureSourceCode, rhs.oi04PatientSignatureSourceCode).append(oi06ReleaseOfInformationCode, rhs.oi06ReleaseOfInformationCode).append(mia01InpatientCoveredDays, rhs.mia01InpatientCoveredDays).append(mia03InpatientLifeTimePhychiatricDaysCount, rhs.mia03InpatientLifeTimePhychiatricDaysCount).append(mia04InpatientClaimDRGAmount, rhs.mia04InpatientClaimDRGAmount).append(mia05InpatientClaimPaymentRemarkCode, rhs.mia05InpatientClaimPaymentRemarkCode).append(mia06InpatientClaimDisproportionateShareAmount, rhs.mia06InpatientClaimDisproportionateShareAmount).append(mia07InpatientClaimMSPPassthroughAmount, rhs.mia07InpatientClaimMSPPassthroughAmount).append(mia08InpatientClaimPPSCapitalAmount, rhs.mia08InpatientClaimPPSCapitalAmount).append(mia09InpatientPPSCapitalFSPDRGAmount, rhs.mia09InpatientPPSCapitalFSPDRGAmount).append(mia10InpatientPPSCapitalHSPDRGAmount, rhs.mia10InpatientPPSCapitalHSPDRGAmount).append(mia11InpatientPPSCapitalDSHDRGAmount, rhs.mia11InpatientPPSCapitalDSHDRGAmount).append(mia12InpatientOldCapitalAmount, rhs.mia12InpatientOldCapitalAmount).append(mia13InpatientPPSCapitalIMEAmount, rhs.mia13InpatientPPSCapitalIMEAmount).append(mia14InpatientPPSOperatingHospitalSpecificDRGAmount, rhs.mia14InpatientPPSOperatingHospitalSpecificDRGAmount).append(mia15InpatientCostReportDayCount, rhs.mia15InpatientCostReportDayCount).append(mia16InpatientPPSOperatingFederalSpecificDRGAmount, rhs.mia16InpatientPPSOperatingFederalSpecificDRGAmount).append(mia17InpatientClaimPPSCapitalOutlierAmount, rhs.mia17InpatientClaimPPSCapitalOutlierAmount).append(mia18InpatientClaimIndirectTeachingAmount, rhs.mia18InpatientClaimIndirectTeachingAmount).append(mia19InpatientNonPayableProfessionalComponentBilledAmount, rhs.mia19InpatientNonPayableProfessionalComponentBilledAmount).append(mia20InpatientClaimPaymentRemarkCode1, rhs.mia20InpatientClaimPaymentRemarkCode1).append(mia21InpatientClaimPaymentRemarkCode2, rhs.mia21InpatientClaimPaymentRemarkCode2).append(mia22InpatientClaimPaymentRemarkCode3, rhs.mia22InpatientClaimPaymentRemarkCode3).append(mia23InpatientClaimPaymentRemarkCode4, rhs.mia23InpatientClaimPaymentRemarkCode4).append(mia24InpatientPPSCapitalExceptionAmount, rhs.mia24InpatientPPSCapitalExceptionAmount).append(moa01ReimbursementRate, rhs.moa01ReimbursementRate).append(moa02HcpcsPayableAmount, rhs.moa02HcpcsPayableAmount).append(moa03ClaimPaymentRemarkCode1, rhs.moa03ClaimPaymentRemarkCode1).append(moa04ClaimPaymentRemarkCode2, rhs.moa04ClaimPaymentRemarkCode2).append(moa05ClaimPaymentRemarkCode3, rhs.moa05ClaimPaymentRemarkCode3).append(moa06ClaimPaymentRemarkCode4, rhs.moa06ClaimPaymentRemarkCode4).append(moa07ClaimPaymentRemarkCode5, rhs.moa07ClaimPaymentRemarkCode5).append(moa08EndStageRenalDiseasePaymentAmount, rhs.moa08EndStageRenalDiseasePaymentAmount).append(moa09NonPayableProfessionalComponentBilledAmount, rhs.moa09NonPayableProfessionalComponentBilledAmount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

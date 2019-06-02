
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
    "clm01_patientControlNo",
    "clm02_totalClaimChargeAmount",
    "clm05_serviceLocationInfo",
    "clm05_01_placeOfServiceCode",
    "clm05_02_placeOfServiceCodeQlfr",
    "clm05_03_claimFrequencyCode",
    "clm06_supplierSignatureIndicator",
    "clm07_planParticipationCode",
    "clm08_benefitsAssignmentCertificationIndicator",
    "clm09_releaseOfInformationCode",
    "clm10_patientSignatureSourceCode",
    "clm11_relatedCausesInfo",
    "clm11_01_relatedCausesCode",
    "clm11_02_relatedCausesCode2",
    "clm11_04_autoAccidentStateCode",
    "clm11_05_countryCode",
    "clm12_specialProgramIndicator",
    "clm19_predeterminationOfBenefitsCode",
    "clm20_delayReasonCode",
    "dtp01_onsetOfCurrentIllnessInjuryDateQlfr",
    "dtp02_onsetOfCurrentIllnessInjuryDateFormatQlfr",
    "dtp03_onsetOfCurrentIllnessInjuryDate",
    "dtp01_initialTreatmentDateQlfr",
    "dtp02_initialTreatmentDateFormatQlfr",
    "dtp03_initialTreatmentDate",
    "dtp01_lastSeenDateQlfr",
    "dtp02_lastSeenDateFormatQlfr",
    "dtp03_lastSeenDate",
    "dtp01_acuteManifestationDateQlfr",
    "dtp02_acuteManifestationDateFormatQlfr",
    "dtp03_acuteManifestationDate",
    "dtp01_accidentDateQlfr",
    "dtp02_accidentDateFormatQlfr",
    "dtp03_accidentDate",
    "dtp01_lastMenstrualPeriodDateQlfr",
    "dtp02_lastMenstrualPeriodDateFormatQlfr",
    "dtp03_lastMenstrualPeriodDate",
    "dtp01_lastXrayDateQlfr",
    "dtp02_lastXrayDateFormatQlfr",
    "dtp03_lastXrayDate",
    "dtp01_hearVisionPrescriptionDateQlfr",
    "dtp02_hearVisionPrescriptionDateFormatQlfr",
    "dtp03_hearVisionPrescriptionDate",
    "dtp01_disabilityQlfr",
    "dtp02_disabilityFormatQlfr",
    "dtp03_disability",
    "dtp01_initialDisabilityPeriodStartQlfr",
    "dtp02_initialDisabilityPeriodStartFormatQlfr",
    "dtp03_initialDisabilityPeriodStartDate",
    "dtp01_initialDisabilityPeriodEndQlfr",
    "dtp02_initialDisabilityPeriodEndFormatQlfr",
    "dtp03_initialDisabilityPeriodEndDate",
    "dtp01_lastWorkedDateQlfr",
    "dtp02_lastWorkedDateFormatQlfr",
    "dtp03_lastWorkedDate",
    "dtp01_workReturnDateQlfr",
    "dtp02_workReturnDateFormatQlfr",
    "dtp03_workReturnDate",
    "dtp01_hospitalizationAdmissionDateQlfr",
    "dtp02_hospitalizationAdmissionDateFormatQlfr",
    "dtp03_hospitalizationAdmissionDate",
    "dtp01_hospitalizationDischargeDateQlfr",
    "dtp02_hospitalizationDischargeDateFormatQlfr",
    "dtp03_hospitalizationDischargeDate",
    "dtp01_fromAndToStatementDateQlfr",
    "dtp02_fromAndToStatementDateFormatQlfr",
    "dtp03_fromAndToStatementDate",
    "dtp01_dischargeHourQlfr",
    "dtp02_dischargeTimePeriodFormatQlfr",
    "dtp03_dischargeTimePeriod",
    "dtp01_admissionDateHourQlfr",
    "dtp02admissionDateHourFormatQlfr",
    "dtp03_admissionDateHour",
    "dtp_assumedAndRelinquishedDates",
    "dtp01_propertyCasualtyFirstContactDate",
    "dtp02_propertyCasualtyFirstContactDateFormatQlfr",
    "dtp03_propertyCasualtyFirstContactDate",
    "dtp01_appliancePlacementQlfr",
    "dtp02_appliancePlacementDateFormatQlfr",
    "dtp03_orthodonticBrandingDate",
    "dtp01_serviceDateQlfr",
    "dtp02_serviceDateFormatQlfr",
    "dtp03_serviceDate",
    "dtp01_repricerReceivedDate",
    "dtp02_repricerReceivedDateFormatQlfr",
    "dtp03_repricerReceivedDate",
    "cl101_admissionTypeCode",
    "cl102_admissionSourceCode",
    "cl103_patientStatusCode",
    "dn101_orthoDonticTreatmentMonthsCount",
    "dn102_orthoDonticTreatmentMonthsRemainingCount",
    "dn104_orthoDonticTreatmentIndicator",
    "dn2_toothStatus",
    "pwk_claimSupplementInformation",
    "cn101_contractTypeCode",
    "cn102_contractAmount",
    "cn103_contractPercentage",
    "cn104_contractCode",
    "cn105_termsDiscountPercent",
    "cn106_contractVersionIdentifier",
    "amt01_patientAmountQlfrCode",
    "amt02_patientAmountPaid",
    "amt01_patientResponsibilityCode",
    "amt02_patientResponsibilityAmount",
    "ref01_predeterminationOfBenefitsIdentificationNo",
    "ref02_predeterminationOfBenefitsIdentifier",
    "ref01_specialPaymentReferenceNoQlfr",
    "ref02_specialPaymentReferenceNo",
    "ref01_medicareVersionCodeQlfr",
    "ref02_medicareVersionCode",
    "ref01_mammographyCertificationNoQlfr",
    "ref02_mammographyCertificationNo",
    "ref01_referralNoQlfr",
    "ref02_referralNo",
    "ref01_priorAuthorizationNoQlfr",
    "ref02_priorAuthorizationNo",
    "ref01_payerClaimControlNoQlfr",
    "ref02_payerClaimControlNo",
    "ref01_clinicalLabAmendmentNoQlfr",
    "ref02_clinicalLabAmendmentNo",
    "ref01_repricedClaimReferenceNoQlfr",
    "ref02_repricedClaimReferenceNo",
    "ref01_adjustedRepricedClaimRefNoQlfr",
    "ref02_adjustedRepricedClaimRefNo",
    "ref_predeterminationOfBenefitsIdentification",
    "ref_investigationalDeviceExcemption",
    "ref01_valueAddedNetworkTraceNoQlfr",
    "ref02_valueAddedNetworkTraceNo",
    "ref01_autoAccidentStateOrProvinceQlfr",
    "ref02_autoAccidentStateOrProvinceCode",
    "ref01_medicalRecordNoQlfr",
    "ref02_medicalRecordNo",
    "ref01_demonstrationProjectIdentifierQlfr",
    "ref02_demonstrationProjectIdentifier",
    "ref01_carePlanOversightNoQlfr",
    "ref02_carePlanOversightNo",
    "ref01_peerReviewAuthorizationNoQlfr",
    "ref02_peerReviewAuthorizationNo",
    "k3fileInformation",
    "nte_clmNote",
    "nte01_noteReferenceCode",
    "nte02_claimNoteText",
    "nte01_billingNoteReferenceCode",
    "nte02_billingNoteText",
    "cr101_basisForMeasurementCodePound",
    "cr102_patientWeightPounds",
    "cr104_ambulanceTransportReasonCode",
    "cr105_basisForMeasurementCodeMiles",
    "cr106_transportDistanceMiles",
    "cr109_roundTripPurposeDescription",
    "cr110_stretcherPurposeDescription",
    "cr208_natureOfConditionCode",
    "cr210_patientConditionDescription",
    "cr211_patientConditionDescription2",
    "crc_ambulanceCertification",
    "crc_patientVisionCondition",
    "crc01_homeboundConditionCodeCategory",
    "crc02_homeboundConditionCode",
    "crc03_homeboundIndicator",
    "crc01_epsdtConditionCodeCategory",
    "crc02_epsdtConditionCodeAppliesIndicator",
    "crc03_epsdtConditionIndicator1",
    "crc04_epsdtConditionIndicator2",
    "crc05_epsdtconditionIndicator3",
    "hi01_diagnosisType1",
    "hi01_01_diagnosisTypeCode1",
    "hi01_02_diagnosisCode1",
    "hi01_09_presentOnAdmissionIndicator",
    "hi02_diagnosisType2",
    "hi02_01_diagnosisTypeCode2",
    "hi02_02_diagnosisCode2",
    "hi03_diagnosisTypeCode3",
    "hi03_01_diagnosisTypeCode3",
    "hi03_02_diagnosisCode3",
    "hi04_diagnosisTypeCode4",
    "hi04_01_diagnosisTypeCode4",
    "hi04_02_diagnosisCode4",
    "hi05_diagnosisTypeCode5",
    "hi05_01_diagnosisTypeCode5",
    "hi05_02_diagnosisCode5",
    "hi06_diagnosisTypecode6",
    "hi06_01_diagnosisTypeCode6",
    "hi06_02_diagnosisCode6",
    "hi07_diagnosisTypeCode7",
    "hi07_01_diagnosisTypeCode7",
    "hi07_02_diagnosisCode7",
    "hi08_diagnosisTypeCode8",
    "hi08_01_diagnosisTypeCode8",
    "hi08_02_diagnosisCode8",
    "hi09_diagnosisType",
    "hi09_01_diagnosisTypeCode9",
    "hi09_02_diagnosisCode9",
    "hi10_diagnosisTypeCode10",
    "hi10_01_diagnosisTypeCode10",
    "hi10_02_diagnosisCode10",
    "hi11_diagnosisTypeCode11",
    "hi11_01_diagnosisTypeCode11",
    "hi11_02_diagnosisCode11",
    "hi12_diagnosisTypeCode12",
    "hi12_01_diagnosisTypeCode12",
    "hi12_02_diagnosisCode12",
    "hi01_anesthesiaSurgicalPrincipal1",
    "hi01_01_anesthesiaSurgicalPrincipleProcedureCode1",
    "hi01_02_anesthesiaSurgicalPrincipleProcedure1",
    "hi02_anesthesiaSurgicalProcedure2",
    "hi02_01_anesthesiaSurgicalProcedureCode2",
    "hi02_02_anesthesiaSurgicalProcedure2",
    "hi01_admittingDiagnosisCodeInfo",
    "hi01_01_admittingDiagnosisQlfrCode1",
    "hi01_02_admittingDiagnosisCode1",
    "hi01_patientsReasonForVisitCodeInfo1",
    "hi01_01_patientsReasonForVisitQlfrCode1",
    "hi01_02_patientsReasonForVisitCode1",
    "hi02_patientsReasonForVisitCodeInfo2",
    "hi02_01_patientsReasonForVisitQlfrCode2",
    "hi02_02_patientsReasonForVisitCode2",
    "hi03_patientsReasonForVisitCodeInfo3",
    "hi03_01_patientsReasonForVisitQlfrCode3",
    "hi03_02_patientsReasonForVisitCode3",
    "hi01_externalCauseOfInjuryInfo1",
    "hi01_01_externalCauseOfInjuryQlfrCode1",
    "hi01_02_externalCauseOfInjuryCode1",
    "hi01_09_causeOfInjuryPresentOnAdmissionIndicator1",
    "hi02_externalCauseOfInjuryInfo2",
    "hi02_01_externalCauseOfInjuryQlfrCode2",
    "hi02_02_externalCauseOfInjuryCode2",
    "hi02_09_causeOfInjuryPresentOnAdmissionIndicator2",
    "hi03_externalCauseOfInjuryInfo3",
    "hi03_01_externalCauseOfInjuryQlfrCode3",
    "hi03_02_externalCauseOfInjuryCode3",
    "hi03_09_causeOfInjuryPresentOnAdmissionIndicator3",
    "hi04_externalCauseOfInjuryInfo4",
    "hi04_01_externalCauseOfInjuryQlfrCode4",
    "hi04_02_externalCauseOfInjuryCode4",
    "hi04_09_causeOfInjuryPresentOnAdmissionIndicator4",
    "hi05_externalCauseOfInjuryInfo5",
    "hi05_01_externalCauseOfInjuryQlfrCode5",
    "hi05_02_externalCauseOfInjuryCode5",
    "hi05_09_causeOfInjuryPresentOnAdmissionIndicator5",
    "hi06_externalCauseOfInjuryInfo6",
    "hi06_01_externalCauseOfInjuryQlfrCode6",
    "hi06_02_externalCauseOfInjuryCode6",
    "hi06_09_causeOfInjuryPresentOnAdmissionIndicator6",
    "hi07_externalCauseOfInjuryInfo7",
    "hi07_01_externalCauseOfInjuryQlfrCode7",
    "hi07_02_externalCauseOfInjuryCode7",
    "hi07_09_causeOfInjuryPresentOnAdmissionIndicator7",
    "hi08_externalCauseOfInjuryInfo8",
    "hi08_01_externalCauseOfInjuryQlfrCode8",
    "hi08_02_externalCauseOfInjuryCode8",
    "hi08_09_causeOfInjuryPresentOnAdmissionIndicator8",
    "hi09_externalCauseOfInjuryInfo9",
    "hi09_01_externalCauseOfInjuryQlfrCode9",
    "hi09_02_externalCauseOfInjuryCode9",
    "hi09_09_causeOfInjuryPresentOnAdmissionIndicator9",
    "hi10_externalCauseOfInjuryInfo10",
    "hi10_01_externalCauseOfInjuryQlfrCode10",
    "hi10_02_externalCauseOfInjuryCode10",
    "hi10_09_causeOfInjuryPresentOnAdmissionIndicator10",
    "hi11_externalCauseOfInjuryInfo11",
    "hi11_01_externalCauseOfInjuryQlfrCode11",
    "hi11_02_externalCauseOfInjuryCode11",
    "hi11_09_causeOfInjuryPresentOnAdmissionIndicator11",
    "hi12_externalCauseOfInjuryInfo12",
    "hi12_01_externalCauseOfInjuryQlfrCode12",
    "hi12_02_externalCauseOfInjuryCode12",
    "hi12_09_causeOfInjuryPresentOnAdmissionIndicator12",
    "hi01_DRGInfo1",
    "hi01_01_DRGQlfrCode1",
    "hi11_02_DRGCode1",
    "hi_otherDiagnosisInfo",
    "hi01_principalProcedureInfo",
    "hi01_01_principalProcedureInfoQlfr",
    "hi01_02_principalProcedureCode",
    "hi01_03_principalProcedureDateFormatQlfr",
    "hi01_04_principalProcedureDate",
    "hi_otherProcedureInfo",
    "hi_occurrenceSpanInfo",
    "hi_occurrenceInfo",
    "hi_valueInfo",
    "hi_treatmentCodeInfo",
    "hi_conditionCode",
    "hcp01_pricingMethodology",
    "hcp02_repricedAllowedAmount",
    "hcp03_repricedSavingAmount",
    "hcp04_repricingOrgIdentifier",
    "hcp05_repricingPerDiemFlatRateAmount",
    "hcp06_repricedApprovedAmbulatoryPatientGroupCode",
    "hcp07_repricedApprovedAmbulatoryPatientGroupAmount",
    "hcp08_repricedApprovedRevenueCode",
    "hcp11_unitOrBasisOfMeasurementCode",
    "hcp12_repricedApprovedServiceUnitCount",
    "hcp13_rejectReasonCode",
    "hcp14_policyComplianceCode",
    "hcp15_exceptionCode"
})
public class ClaimInfo {

    @JsonProperty("clm01_patientControlNo")
    private String clm01PatientControlNo;
    @JsonProperty("clm02_totalClaimChargeAmount")
    private String clm02TotalClaimChargeAmount;
    @JsonProperty("clm05_serviceLocationInfo")
    private String clm05ServiceLocationInfo;
    @JsonProperty("clm05_01_placeOfServiceCode")
    private String clm0501PlaceOfServiceCode;
    @JsonProperty("clm05_02_placeOfServiceCodeQlfr")
    private String clm0502PlaceOfServiceCodeQlfr;
    @JsonProperty("clm05_03_claimFrequencyCode")
    private String clm0503ClaimFrequencyCode;
    @JsonProperty("clm06_supplierSignatureIndicator")
    private String clm06SupplierSignatureIndicator;
    @JsonProperty("clm07_planParticipationCode")
    private String clm07PlanParticipationCode;
    @JsonProperty("clm08_benefitsAssignmentCertificationIndicator")
    private String clm08BenefitsAssignmentCertificationIndicator;
    @JsonProperty("clm09_releaseOfInformationCode")
    private String clm09ReleaseOfInformationCode;
    @JsonProperty("clm10_patientSignatureSourceCode")
    private String clm10PatientSignatureSourceCode;
    @JsonProperty("clm11_relatedCausesInfo")
    private String clm11RelatedCausesInfo;
    @JsonProperty("clm11_01_relatedCausesCode")
    private String clm1101RelatedCausesCode;
    @JsonProperty("clm11_02_relatedCausesCode2")
    private String clm1102RelatedCausesCode2;
    @JsonProperty("clm11_04_autoAccidentStateCode")
    private String clm1104AutoAccidentStateCode;
    @JsonProperty("clm11_05_countryCode")
    private String clm1105CountryCode;
    @JsonProperty("clm12_specialProgramIndicator")
    private String clm12SpecialProgramIndicator;
    @JsonProperty("clm19_predeterminationOfBenefitsCode")
    private String clm19PredeterminationOfBenefitsCode;
    @JsonProperty("clm20_delayReasonCode")
    private String clm20DelayReasonCode;
    @JsonProperty("dtp01_onsetOfCurrentIllnessInjuryDateQlfr")
    private String dtp01OnsetOfCurrentIllnessInjuryDateQlfr;
    @JsonProperty("dtp02_onsetOfCurrentIllnessInjuryDateFormatQlfr")
    private String dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr;
    @JsonProperty("dtp03_onsetOfCurrentIllnessInjuryDate")
    private String dtp03OnsetOfCurrentIllnessInjuryDate;
    @JsonProperty("dtp01_initialTreatmentDateQlfr")
    private String dtp01InitialTreatmentDateQlfr;
    @JsonProperty("dtp02_initialTreatmentDateFormatQlfr")
    private String dtp02InitialTreatmentDateFormatQlfr;
    @JsonProperty("dtp03_initialTreatmentDate")
    private String dtp03InitialTreatmentDate;
    @JsonProperty("dtp01_lastSeenDateQlfr")
    private String dtp01LastSeenDateQlfr;
    @JsonProperty("dtp02_lastSeenDateFormatQlfr")
    private String dtp02LastSeenDateFormatQlfr;
    @JsonProperty("dtp03_lastSeenDate")
    private String dtp03LastSeenDate;
    @JsonProperty("dtp01_acuteManifestationDateQlfr")
    private String dtp01AcuteManifestationDateQlfr;
    @JsonProperty("dtp02_acuteManifestationDateFormatQlfr")
    private String dtp02AcuteManifestationDateFormatQlfr;
    @JsonProperty("dtp03_acuteManifestationDate")
    private String dtp03AcuteManifestationDate;
    @JsonProperty("dtp01_accidentDateQlfr")
    private String dtp01AccidentDateQlfr;
    @JsonProperty("dtp02_accidentDateFormatQlfr")
    private String dtp02AccidentDateFormatQlfr;
    @JsonProperty("dtp03_accidentDate")
    private String dtp03AccidentDate;
    @JsonProperty("dtp01_lastMenstrualPeriodDateQlfr")
    private String dtp01LastMenstrualPeriodDateQlfr;
    @JsonProperty("dtp02_lastMenstrualPeriodDateFormatQlfr")
    private String dtp02LastMenstrualPeriodDateFormatQlfr;
    @JsonProperty("dtp03_lastMenstrualPeriodDate")
    private String dtp03LastMenstrualPeriodDate;
    @JsonProperty("dtp01_lastXrayDateQlfr")
    private String dtp01LastXrayDateQlfr;
    @JsonProperty("dtp02_lastXrayDateFormatQlfr")
    private String dtp02LastXrayDateFormatQlfr;
    @JsonProperty("dtp03_lastXrayDate")
    private String dtp03LastXrayDate;
    @JsonProperty("dtp01_hearVisionPrescriptionDateQlfr")
    private String dtp01HearVisionPrescriptionDateQlfr;
    @JsonProperty("dtp02_hearVisionPrescriptionDateFormatQlfr")
    private String dtp02HearVisionPrescriptionDateFormatQlfr;
    @JsonProperty("dtp03_hearVisionPrescriptionDate")
    private String dtp03HearVisionPrescriptionDate;
    @JsonProperty("dtp01_disabilityQlfr")
    private String dtp01DisabilityQlfr;
    @JsonProperty("dtp02_disabilityFormatQlfr")
    private String dtp02DisabilityFormatQlfr;
    @JsonProperty("dtp03_disability")
    private String dtp03Disability;
    @JsonProperty("dtp01_initialDisabilityPeriodStartQlfr")
    private String dtp01InitialDisabilityPeriodStartQlfr;
    @JsonProperty("dtp02_initialDisabilityPeriodStartFormatQlfr")
    private String dtp02InitialDisabilityPeriodStartFormatQlfr;
    @JsonProperty("dtp03_initialDisabilityPeriodStartDate")
    private String dtp03InitialDisabilityPeriodStartDate;
    @JsonProperty("dtp01_initialDisabilityPeriodEndQlfr")
    private String dtp01InitialDisabilityPeriodEndQlfr;
    @JsonProperty("dtp02_initialDisabilityPeriodEndFormatQlfr")
    private String dtp02InitialDisabilityPeriodEndFormatQlfr;
    @JsonProperty("dtp03_initialDisabilityPeriodEndDate")
    private String dtp03InitialDisabilityPeriodEndDate;
    @JsonProperty("dtp01_lastWorkedDateQlfr")
    private String dtp01LastWorkedDateQlfr;
    @JsonProperty("dtp02_lastWorkedDateFormatQlfr")
    private String dtp02LastWorkedDateFormatQlfr;
    @JsonProperty("dtp03_lastWorkedDate")
    private String dtp03LastWorkedDate;
    @JsonProperty("dtp01_workReturnDateQlfr")
    private String dtp01WorkReturnDateQlfr;
    @JsonProperty("dtp02_workReturnDateFormatQlfr")
    private String dtp02WorkReturnDateFormatQlfr;
    @JsonProperty("dtp03_workReturnDate")
    private String dtp03WorkReturnDate;
    @JsonProperty("dtp01_hospitalizationAdmissionDateQlfr")
    private String dtp01HospitalizationAdmissionDateQlfr;
    @JsonProperty("dtp02_hospitalizationAdmissionDateFormatQlfr")
    private String dtp02HospitalizationAdmissionDateFormatQlfr;
    @JsonProperty("dtp03_hospitalizationAdmissionDate")
    private String dtp03HospitalizationAdmissionDate;
    @JsonProperty("dtp01_hospitalizationDischargeDateQlfr")
    private String dtp01HospitalizationDischargeDateQlfr;
    @JsonProperty("dtp02_hospitalizationDischargeDateFormatQlfr")
    private String dtp02HospitalizationDischargeDateFormatQlfr;
    @JsonProperty("dtp03_hospitalizationDischargeDate")
    private String dtp03HospitalizationDischargeDate;
    @JsonProperty("dtp01_fromAndToStatementDateQlfr")
    private String dtp01FromAndToStatementDateQlfr;
    @JsonProperty("dtp02_fromAndToStatementDateFormatQlfr")
    private String dtp02FromAndToStatementDateFormatQlfr;
    @JsonProperty("dtp03_fromAndToStatementDate")
    private String dtp03FromAndToStatementDate;
    @JsonProperty("dtp01_dischargeHourQlfr")
    private String dtp01DischargeHourQlfr;
    @JsonProperty("dtp02_dischargeTimePeriodFormatQlfr")
    private String dtp02DischargeTimePeriodFormatQlfr;
    @JsonProperty("dtp03_dischargeTimePeriod")
    private String dtp03DischargeTimePeriod;
    @JsonProperty("dtp01_admissionDateHourQlfr")
    private String dtp01AdmissionDateHourQlfr;
    @JsonProperty("dtp02admissionDateHourFormatQlfr")
    private String dtp02admissionDateHourFormatQlfr;
    @JsonProperty("dtp03_admissionDateHour")
    private String dtp03AdmissionDateHour;
    @JsonProperty("dtp_assumedAndRelinquishedDates")
    private List<DtpAssumedAndRelinquishedDate> dtpAssumedAndRelinquishedDates = new ArrayList<DtpAssumedAndRelinquishedDate>();
    @JsonProperty("dtp01_propertyCasualtyFirstContactDate")
    private String dtp01PropertyCasualtyFirstContactDate;
    @JsonProperty("dtp02_propertyCasualtyFirstContactDateFormatQlfr")
    private String dtp02PropertyCasualtyFirstContactDateFormatQlfr;
    @JsonProperty("dtp03_propertyCasualtyFirstContactDate")
    private String dtp03PropertyCasualtyFirstContactDate;
    @JsonProperty("dtp01_appliancePlacementQlfr")
    private String dtp01AppliancePlacementQlfr;
    @JsonProperty("dtp02_appliancePlacementDateFormatQlfr")
    private String dtp02AppliancePlacementDateFormatQlfr;
    @JsonProperty("dtp03_orthodonticBrandingDate")
    private String dtp03OrthodonticBrandingDate;
    @JsonProperty("dtp01_serviceDateQlfr")
    private String dtp01ServiceDateQlfr;
    @JsonProperty("dtp02_serviceDateFormatQlfr")
    private String dtp02ServiceDateFormatQlfr;
    @JsonProperty("dtp03_serviceDate")
    private String dtp03ServiceDate;
    @JsonProperty("dtp01_repricerReceivedDate")
    private String dtp01RepricerReceivedDate;
    @JsonProperty("dtp02_repricerReceivedDateFormatQlfr")
    private String dtp02RepricerReceivedDateFormatQlfr;
    @JsonProperty("dtp03_repricerReceivedDate")
    private String dtp03RepricerReceivedDate;
    @JsonProperty("cl101_admissionTypeCode")
    private String cl101AdmissionTypeCode;
    @JsonProperty("cl102_admissionSourceCode")
    private String cl102AdmissionSourceCode;
    @JsonProperty("cl103_patientStatusCode")
    private String cl103PatientStatusCode;
    @JsonProperty("dn101_orthoDonticTreatmentMonthsCount")
    private String dn101OrthoDonticTreatmentMonthsCount;
    @JsonProperty("dn102_orthoDonticTreatmentMonthsRemainingCount")
    private String dn102OrthoDonticTreatmentMonthsRemainingCount;
    @JsonProperty("dn104_orthoDonticTreatmentIndicator")
    private String dn104OrthoDonticTreatmentIndicator;
    @JsonProperty("dn2_toothStatus")
    private List<Dn2Toothstatus> dn2ToothStatus = new ArrayList<Dn2Toothstatus>();
    @JsonProperty("pwk_claimSupplementInformation")
    private List<PwkClaimSupplementInformation> pwkClaimSupplementInformation = new ArrayList<PwkClaimSupplementInformation>();
    @JsonProperty("cn101_contractTypeCode")
    private String cn101ContractTypeCode;
    @JsonProperty("cn102_contractAmount")
    private String cn102ContractAmount;
    @JsonProperty("cn103_contractPercentage")
    private String cn103ContractPercentage;
    @JsonProperty("cn104_contractCode")
    private String cn104ContractCode;
    @JsonProperty("cn105_termsDiscountPercent")
    private String cn105TermsDiscountPercent;
    @JsonProperty("cn106_contractVersionIdentifier")
    private String cn106ContractVersionIdentifier;
    @JsonProperty("amt01_patientAmountQlfrCode")
    private String amt01PatientAmountQlfrCode;
    @JsonProperty("amt02_patientAmountPaid")
    private String amt02PatientAmountPaid;
    @JsonProperty("amt01_patientResponsibilityCode")
    private String amt01PatientResponsibilityCode;
    @JsonProperty("amt02_patientResponsibilityAmount")
    private String amt02PatientResponsibilityAmount;
    @JsonProperty("ref01_predeterminationOfBenefitsIdentificationNo")
    private String ref01PredeterminationOfBenefitsIdentificationNo;
    @JsonProperty("ref02_predeterminationOfBenefitsIdentifier")
    private String ref02PredeterminationOfBenefitsIdentifier;
    @JsonProperty("ref01_specialPaymentReferenceNoQlfr")
    private String ref01SpecialPaymentReferenceNoQlfr;
    @JsonProperty("ref02_specialPaymentReferenceNo")
    private String ref02SpecialPaymentReferenceNo;
    @JsonProperty("ref01_medicareVersionCodeQlfr")
    private String ref01MedicareVersionCodeQlfr;
    @JsonProperty("ref02_medicareVersionCode")
    private String ref02MedicareVersionCode;
    @JsonProperty("ref01_mammographyCertificationNoQlfr")
    private String ref01MammographyCertificationNoQlfr;
    @JsonProperty("ref02_mammographyCertificationNo")
    private String ref02MammographyCertificationNo;
    @JsonProperty("ref01_referralNoQlfr")
    private String ref01ReferralNoQlfr;
    @JsonProperty("ref02_referralNo")
    private String ref02ReferralNo;
    @JsonProperty("ref01_priorAuthorizationNoQlfr")
    private String ref01PriorAuthorizationNoQlfr;
    @JsonProperty("ref02_priorAuthorizationNo")
    private String ref02PriorAuthorizationNo;
    @JsonProperty("ref01_payerClaimControlNoQlfr")
    private String ref01PayerClaimControlNoQlfr;
    @JsonProperty("ref02_payerClaimControlNo")
    private String ref02PayerClaimControlNo;
    @JsonProperty("ref01_clinicalLabAmendmentNoQlfr")
    private String ref01ClinicalLabAmendmentNoQlfr;
    @JsonProperty("ref02_clinicalLabAmendmentNo")
    private String ref02ClinicalLabAmendmentNo;
    @JsonProperty("ref01_repricedClaimReferenceNoQlfr")
    private String ref01RepricedClaimReferenceNoQlfr;
    @JsonProperty("ref02_repricedClaimReferenceNo")
    private String ref02RepricedClaimReferenceNo;
    @JsonProperty("ref01_adjustedRepricedClaimRefNoQlfr")
    private String ref01AdjustedRepricedClaimRefNoQlfr;
    @JsonProperty("ref02_adjustedRepricedClaimRefNo")
    private String ref02AdjustedRepricedClaimRefNo;
    @JsonProperty("ref_predeterminationOfBenefitsIdentification")
    private RefPredeterminationOfBenefitsIdentification refPredeterminationOfBenefitsIdentification;
    @JsonProperty("ref_investigationalDeviceExcemption")
    private List<RefInvestigationalDeviceExcemption> refInvestigationalDeviceExcemption = new ArrayList<RefInvestigationalDeviceExcemption>();
    @JsonProperty("ref01_valueAddedNetworkTraceNoQlfr")
    private String ref01ValueAddedNetworkTraceNoQlfr;
    @JsonProperty("ref02_valueAddedNetworkTraceNo")
    private String ref02ValueAddedNetworkTraceNo;
    @JsonProperty("ref01_autoAccidentStateOrProvinceQlfr")
    private String ref01AutoAccidentStateOrProvinceQlfr;
    @JsonProperty("ref02_autoAccidentStateOrProvinceCode")
    private String ref02AutoAccidentStateOrProvinceCode;
    @JsonProperty("ref01_medicalRecordNoQlfr")
    private String ref01MedicalRecordNoQlfr;
    @JsonProperty("ref02_medicalRecordNo")
    private String ref02MedicalRecordNo;
    @JsonProperty("ref01_demonstrationProjectIdentifierQlfr")
    private String ref01DemonstrationProjectIdentifierQlfr;
    @JsonProperty("ref02_demonstrationProjectIdentifier")
    private String ref02DemonstrationProjectIdentifier;
    @JsonProperty("ref01_carePlanOversightNoQlfr")
    private String ref01CarePlanOversightNoQlfr;
    @JsonProperty("ref02_carePlanOversightNo")
    private String ref02CarePlanOversightNo;
    @JsonProperty("ref01_peerReviewAuthorizationNoQlfr")
    private String ref01PeerReviewAuthorizationNoQlfr;
    @JsonProperty("ref02_peerReviewAuthorizationNo")
    private String ref02PeerReviewAuthorizationNo;
    @JsonProperty("k3fileInformation")
    private List<List<K3fileInformation>> k3fileInformation = new ArrayList<List<K3fileInformation>>();
    @JsonProperty("nte_clmNote")
    private List<NteClmNote> nteClmNote = new ArrayList<NteClmNote>();
    @JsonProperty("nte01_noteReferenceCode")
    private String nte01NoteReferenceCode;
    @JsonProperty("nte02_claimNoteText")
    private String nte02ClaimNoteText;
    @JsonProperty("nte01_billingNoteReferenceCode")
    private String nte01BillingNoteReferenceCode;
    @JsonProperty("nte02_billingNoteText")
    private String nte02BillingNoteText;
    @JsonProperty("cr101_basisForMeasurementCodePound")
    private String cr101BasisForMeasurementCodePound;
    @JsonProperty("cr102_patientWeightPounds")
    private String cr102PatientWeightPounds;
    @JsonProperty("cr104_ambulanceTransportReasonCode")
    private String cr104AmbulanceTransportReasonCode;
    @JsonProperty("cr105_basisForMeasurementCodeMiles")
    private String cr105BasisForMeasurementCodeMiles;
    @JsonProperty("cr106_transportDistanceMiles")
    private String cr106TransportDistanceMiles;
    @JsonProperty("cr109_roundTripPurposeDescription")
    private String cr109RoundTripPurposeDescription;
    @JsonProperty("cr110_stretcherPurposeDescription")
    private String cr110StretcherPurposeDescription;
    @JsonProperty("cr208_natureOfConditionCode")
    private String cr208NatureOfConditionCode;
    @JsonProperty("cr210_patientConditionDescription")
    private String cr210PatientConditionDescription;
    @JsonProperty("cr211_patientConditionDescription2")
    private String cr211PatientConditionDescription2;
    @JsonProperty("crc_ambulanceCertification")
    private List<CrcAmbulanceCertification> crcAmbulanceCertification = new ArrayList<CrcAmbulanceCertification>();
    @JsonProperty("crc_patientVisionCondition")
    private List<CrcPatientVisionCondition> crcPatientVisionCondition = new ArrayList<CrcPatientVisionCondition>();
    @JsonProperty("crc01_homeboundConditionCodeCategory")
    private String crc01HomeboundConditionCodeCategory;
    @JsonProperty("crc02_homeboundConditionCode")
    private String crc02HomeboundConditionCode;
    @JsonProperty("crc03_homeboundIndicator")
    private String crc03HomeboundIndicator;
    @JsonProperty("crc01_epsdtConditionCodeCategory")
    private String crc01EpsdtConditionCodeCategory;
    @JsonProperty("crc02_epsdtConditionCodeAppliesIndicator")
    private String crc02EpsdtConditionCodeAppliesIndicator;
    @JsonProperty("crc03_epsdtConditionIndicator1")
    private String crc03EpsdtConditionIndicator1;
    @JsonProperty("crc04_epsdtConditionIndicator2")
    private String crc04EpsdtConditionIndicator2;
    @JsonProperty("crc05_epsdtconditionIndicator3")
    private String crc05EpsdtconditionIndicator3;
    @JsonProperty("hi01_diagnosisType1")
    private String hi01DiagnosisType1;
    @JsonProperty("hi01_01_diagnosisTypeCode1")
    private String hi0101DiagnosisTypeCode1;
    @JsonProperty("hi01_02_diagnosisCode1")
    private String hi0102DiagnosisCode1;
    @JsonProperty("hi01_09_presentOnAdmissionIndicator")
    private String hi0109PresentOnAdmissionIndicator;
    @JsonProperty("hi02_diagnosisType2")
    private String hi02DiagnosisType2;
    @JsonProperty("hi02_01_diagnosisTypeCode2")
    private String hi0201DiagnosisTypeCode2;
    @JsonProperty("hi02_02_diagnosisCode2")
    private String hi0202DiagnosisCode2;
    @JsonProperty("hi03_diagnosisTypeCode3")
    private String hi03DiagnosisTypeCode3;
    @JsonProperty("hi03_01_diagnosisTypeCode3")
    private String hi0301DiagnosisTypeCode3;
    @JsonProperty("hi03_02_diagnosisCode3")
    private String hi0302DiagnosisCode3;
    @JsonProperty("hi04_diagnosisTypeCode4")
    private String hi04DiagnosisTypeCode4;
    @JsonProperty("hi04_01_diagnosisTypeCode4")
    private String hi0401DiagnosisTypeCode4;
    @JsonProperty("hi04_02_diagnosisCode4")
    private String hi0402DiagnosisCode4;
    @JsonProperty("hi05_diagnosisTypeCode5")
    private String hi05DiagnosisTypeCode5;
    @JsonProperty("hi05_01_diagnosisTypeCode5")
    private String hi0501DiagnosisTypeCode5;
    @JsonProperty("hi05_02_diagnosisCode5")
    private String hi0502DiagnosisCode5;
    @JsonProperty("hi06_diagnosisTypecode6")
    private String hi06DiagnosisTypecode6;
    @JsonProperty("hi06_01_diagnosisTypeCode6")
    private String hi0601DiagnosisTypeCode6;
    @JsonProperty("hi06_02_diagnosisCode6")
    private String hi0602DiagnosisCode6;
    @JsonProperty("hi07_diagnosisTypeCode7")
    private String hi07DiagnosisTypeCode7;
    @JsonProperty("hi07_01_diagnosisTypeCode7")
    private String hi0701DiagnosisTypeCode7;
    @JsonProperty("hi07_02_diagnosisCode7")
    private String hi0702DiagnosisCode7;
    @JsonProperty("hi08_diagnosisTypeCode8")
    private String hi08DiagnosisTypeCode8;
    @JsonProperty("hi08_01_diagnosisTypeCode8")
    private String hi0801DiagnosisTypeCode8;
    @JsonProperty("hi08_02_diagnosisCode8")
    private String hi0802DiagnosisCode8;
    @JsonProperty("hi09_diagnosisType")
    private String hi09DiagnosisType;
    @JsonProperty("hi09_01_diagnosisTypeCode9")
    private String hi0901DiagnosisTypeCode9;
    @JsonProperty("hi09_02_diagnosisCode9")
    private String hi0902DiagnosisCode9;
    @JsonProperty("hi10_diagnosisTypeCode10")
    private String hi10DiagnosisTypeCode10;
    @JsonProperty("hi10_01_diagnosisTypeCode10")
    private String hi1001DiagnosisTypeCode10;
    @JsonProperty("hi10_02_diagnosisCode10")
    private String hi1002DiagnosisCode10;
    @JsonProperty("hi11_diagnosisTypeCode11")
    private String hi11DiagnosisTypeCode11;
    @JsonProperty("hi11_01_diagnosisTypeCode11")
    private String hi1101DiagnosisTypeCode11;
    @JsonProperty("hi11_02_diagnosisCode11")
    private String hi1102DiagnosisCode11;
    @JsonProperty("hi12_diagnosisTypeCode12")
    private String hi12DiagnosisTypeCode12;
    @JsonProperty("hi12_01_diagnosisTypeCode12")
    private String hi1201DiagnosisTypeCode12;
    @JsonProperty("hi12_02_diagnosisCode12")
    private String hi1202DiagnosisCode12;
    @JsonProperty("hi01_anesthesiaSurgicalPrincipal1")
    private String hi01AnesthesiaSurgicalPrincipal1;
    @JsonProperty("hi01_01_anesthesiaSurgicalPrincipleProcedureCode1")
    private String hi0101AnesthesiaSurgicalPrincipleProcedureCode1;
    @JsonProperty("hi01_02_anesthesiaSurgicalPrincipleProcedure1")
    private String hi0102AnesthesiaSurgicalPrincipleProcedure1;
    @JsonProperty("hi02_anesthesiaSurgicalProcedure2")
    private String hi02AnesthesiaSurgicalProcedure2;
    @JsonProperty("hi02_01_anesthesiaSurgicalProcedureCode2")
    private String hi0201AnesthesiaSurgicalProcedureCode2;
    @JsonProperty("hi02_02_anesthesiaSurgicalProcedure2")
    private String hi0202AnesthesiaSurgicalProcedure2;
    @JsonProperty("hi01_admittingDiagnosisCodeInfo")
    private String hi01AdmittingDiagnosisCodeInfo;
    @JsonProperty("hi01_01_admittingDiagnosisQlfrCode1")
    private String hi0101AdmittingDiagnosisQlfrCode1;
    @JsonProperty("hi01_02_admittingDiagnosisCode1")
    private String hi0102AdmittingDiagnosisCode1;
    @JsonProperty("hi01_patientsReasonForVisitCodeInfo1")
    private String hi01PatientsReasonForVisitCodeInfo1;
    @JsonProperty("hi01_01_patientsReasonForVisitQlfrCode1")
    private String hi0101PatientsReasonForVisitQlfrCode1;
    @JsonProperty("hi01_02_patientsReasonForVisitCode1")
    private String hi0102PatientsReasonForVisitCode1;
    @JsonProperty("hi02_patientsReasonForVisitCodeInfo2")
    private String hi02PatientsReasonForVisitCodeInfo2;
    @JsonProperty("hi02_01_patientsReasonForVisitQlfrCode2")
    private String hi0201PatientsReasonForVisitQlfrCode2;
    @JsonProperty("hi02_02_patientsReasonForVisitCode2")
    private String hi0202PatientsReasonForVisitCode2;
    @JsonProperty("hi03_patientsReasonForVisitCodeInfo3")
    private String hi03PatientsReasonForVisitCodeInfo3;
    @JsonProperty("hi03_01_patientsReasonForVisitQlfrCode3")
    private String hi0301PatientsReasonForVisitQlfrCode3;
    @JsonProperty("hi03_02_patientsReasonForVisitCode3")
    private String hi0302PatientsReasonForVisitCode3;
    @JsonProperty("hi01_externalCauseOfInjuryInfo1")
    private String hi01ExternalCauseOfInjuryInfo1;
    @JsonProperty("hi01_01_externalCauseOfInjuryQlfrCode1")
    private String hi0101ExternalCauseOfInjuryQlfrCode1;
    @JsonProperty("hi01_02_externalCauseOfInjuryCode1")
    private String hi0102ExternalCauseOfInjuryCode1;
    @JsonProperty("hi01_09_causeOfInjuryPresentOnAdmissionIndicator1")
    private String hi0109CauseOfInjuryPresentOnAdmissionIndicator1;
    @JsonProperty("hi02_externalCauseOfInjuryInfo2")
    private String hi02ExternalCauseOfInjuryInfo2;
    @JsonProperty("hi02_01_externalCauseOfInjuryQlfrCode2")
    private String hi0201ExternalCauseOfInjuryQlfrCode2;
    @JsonProperty("hi02_02_externalCauseOfInjuryCode2")
    private String hi0202ExternalCauseOfInjuryCode2;
    @JsonProperty("hi02_09_causeOfInjuryPresentOnAdmissionIndicator2")
    private String hi0209CauseOfInjuryPresentOnAdmissionIndicator2;
    @JsonProperty("hi03_externalCauseOfInjuryInfo3")
    private String hi03ExternalCauseOfInjuryInfo3;
    @JsonProperty("hi03_01_externalCauseOfInjuryQlfrCode3")
    private String hi0301ExternalCauseOfInjuryQlfrCode3;
    @JsonProperty("hi03_02_externalCauseOfInjuryCode3")
    private String hi0302ExternalCauseOfInjuryCode3;
    @JsonProperty("hi03_09_causeOfInjuryPresentOnAdmissionIndicator3")
    private String hi0309CauseOfInjuryPresentOnAdmissionIndicator3;
    @JsonProperty("hi04_externalCauseOfInjuryInfo4")
    private String hi04ExternalCauseOfInjuryInfo4;
    @JsonProperty("hi04_01_externalCauseOfInjuryQlfrCode4")
    private String hi0401ExternalCauseOfInjuryQlfrCode4;
    @JsonProperty("hi04_02_externalCauseOfInjuryCode4")
    private String hi0402ExternalCauseOfInjuryCode4;
    @JsonProperty("hi04_09_causeOfInjuryPresentOnAdmissionIndicator4")
    private String hi0409CauseOfInjuryPresentOnAdmissionIndicator4;
    @JsonProperty("hi05_externalCauseOfInjuryInfo5")
    private String hi05ExternalCauseOfInjuryInfo5;
    @JsonProperty("hi05_01_externalCauseOfInjuryQlfrCode5")
    private String hi0501ExternalCauseOfInjuryQlfrCode5;
    @JsonProperty("hi05_02_externalCauseOfInjuryCode5")
    private String hi0502ExternalCauseOfInjuryCode5;
    @JsonProperty("hi05_09_causeOfInjuryPresentOnAdmissionIndicator5")
    private String hi0509CauseOfInjuryPresentOnAdmissionIndicator5;
    @JsonProperty("hi06_externalCauseOfInjuryInfo6")
    private String hi06ExternalCauseOfInjuryInfo6;
    @JsonProperty("hi06_01_externalCauseOfInjuryQlfrCode6")
    private String hi0601ExternalCauseOfInjuryQlfrCode6;
    @JsonProperty("hi06_02_externalCauseOfInjuryCode6")
    private String hi0602ExternalCauseOfInjuryCode6;
    @JsonProperty("hi06_09_causeOfInjuryPresentOnAdmissionIndicator6")
    private String hi0609CauseOfInjuryPresentOnAdmissionIndicator6;
    @JsonProperty("hi07_externalCauseOfInjuryInfo7")
    private String hi07ExternalCauseOfInjuryInfo7;
    @JsonProperty("hi07_01_externalCauseOfInjuryQlfrCode7")
    private String hi0701ExternalCauseOfInjuryQlfrCode7;
    @JsonProperty("hi07_02_externalCauseOfInjuryCode7")
    private String hi0702ExternalCauseOfInjuryCode7;
    @JsonProperty("hi07_09_causeOfInjuryPresentOnAdmissionIndicator7")
    private String hi0709CauseOfInjuryPresentOnAdmissionIndicator7;
    @JsonProperty("hi08_externalCauseOfInjuryInfo8")
    private String hi08ExternalCauseOfInjuryInfo8;
    @JsonProperty("hi08_01_externalCauseOfInjuryQlfrCode8")
    private String hi0801ExternalCauseOfInjuryQlfrCode8;
    @JsonProperty("hi08_02_externalCauseOfInjuryCode8")
    private String hi0802ExternalCauseOfInjuryCode8;
    @JsonProperty("hi08_09_causeOfInjuryPresentOnAdmissionIndicator8")
    private String hi0809CauseOfInjuryPresentOnAdmissionIndicator8;
    @JsonProperty("hi09_externalCauseOfInjuryInfo9")
    private String hi09ExternalCauseOfInjuryInfo9;
    @JsonProperty("hi09_01_externalCauseOfInjuryQlfrCode9")
    private String hi0901ExternalCauseOfInjuryQlfrCode9;
    @JsonProperty("hi09_02_externalCauseOfInjuryCode9")
    private String hi0902ExternalCauseOfInjuryCode9;
    @JsonProperty("hi09_09_causeOfInjuryPresentOnAdmissionIndicator9")
    private String hi0909CauseOfInjuryPresentOnAdmissionIndicator9;
    @JsonProperty("hi10_externalCauseOfInjuryInfo10")
    private String hi10ExternalCauseOfInjuryInfo10;
    @JsonProperty("hi10_01_externalCauseOfInjuryQlfrCode10")
    private String hi1001ExternalCauseOfInjuryQlfrCode10;
    @JsonProperty("hi10_02_externalCauseOfInjuryCode10")
    private String hi1002ExternalCauseOfInjuryCode10;
    @JsonProperty("hi10_09_causeOfInjuryPresentOnAdmissionIndicator10")
    private String hi1009CauseOfInjuryPresentOnAdmissionIndicator10;
    @JsonProperty("hi11_externalCauseOfInjuryInfo11")
    private String hi11ExternalCauseOfInjuryInfo11;
    @JsonProperty("hi11_01_externalCauseOfInjuryQlfrCode11")
    private String hi1101ExternalCauseOfInjuryQlfrCode11;
    @JsonProperty("hi11_02_externalCauseOfInjuryCode11")
    private String hi1102ExternalCauseOfInjuryCode11;
    @JsonProperty("hi11_09_causeOfInjuryPresentOnAdmissionIndicator11")
    private String hi1109CauseOfInjuryPresentOnAdmissionIndicator11;
    @JsonProperty("hi12_externalCauseOfInjuryInfo12")
    private String hi12ExternalCauseOfInjuryInfo12;
    @JsonProperty("hi12_01_externalCauseOfInjuryQlfrCode12")
    private String hi1201ExternalCauseOfInjuryQlfrCode12;
    @JsonProperty("hi12_02_externalCauseOfInjuryCode12")
    private String hi1202ExternalCauseOfInjuryCode12;
    @JsonProperty("hi12_09_causeOfInjuryPresentOnAdmissionIndicator12")
    private String hi1209CauseOfInjuryPresentOnAdmissionIndicator12;
    @JsonProperty("hi01_DRGInfo1")
    private String hi01DRGInfo1;
    @JsonProperty("hi01_01_DRGQlfrCode1")
    private String hi0101DRGQlfrCode1;
    @JsonProperty("hi11_02_DRGCode1")
    private String hi1102DRGCode1;
    @JsonProperty("hi_otherDiagnosisInfo")
    private List<HiOtherDiagnosisInfo> hiOtherDiagnosisInfo = new ArrayList<HiOtherDiagnosisInfo>();
    @JsonProperty("hi01_principalProcedureInfo")
    private String hi01PrincipalProcedureInfo;
    @JsonProperty("hi01_01_principalProcedureInfoQlfr")
    private String hi0101PrincipalProcedureInfoQlfr;
    @JsonProperty("hi01_02_principalProcedureCode")
    private String hi0102PrincipalProcedureCode;
    @JsonProperty("hi01_03_principalProcedureDateFormatQlfr")
    private String hi0103PrincipalProcedureDateFormatQlfr;
    @JsonProperty("hi01_04_principalProcedureDate")
    private String hi0104PrincipalProcedureDate;
    @JsonProperty("hi_otherProcedureInfo")
    private List<HiOtherProcedureInfo> hiOtherProcedureInfo = new ArrayList<HiOtherProcedureInfo>();
    @JsonProperty("hi_occurrenceSpanInfo")
    private List<HiOccurrenceSpanInfo> hiOccurrenceSpanInfo = new ArrayList<HiOccurrenceSpanInfo>();
    @JsonProperty("hi_occurrenceInfo")
    private List<HiOccurrenceInfo> hiOccurrenceInfo = new ArrayList<HiOccurrenceInfo>();
    @JsonProperty("hi_valueInfo")
    private List<HiValueInfo> hiValueInfo = new ArrayList<HiValueInfo>();
    @JsonProperty("hi_treatmentCodeInfo")
    private List<HiTreatmentCodeInfo> hiTreatmentCodeInfo = new ArrayList<HiTreatmentCodeInfo>();
    @JsonProperty("hi_conditionCode")
    private List<HiConditionCode> hiConditionCode = new ArrayList<HiConditionCode>();
    @JsonProperty("hcp01_pricingMethodology")
    private String hcp01PricingMethodology;
    @JsonProperty("hcp02_repricedAllowedAmount")
    private String hcp02RepricedAllowedAmount;
    @JsonProperty("hcp03_repricedSavingAmount")
    private String hcp03RepricedSavingAmount;
    @JsonProperty("hcp04_repricingOrgIdentifier")
    private String hcp04RepricingOrgIdentifier;
    @JsonProperty("hcp05_repricingPerDiemFlatRateAmount")
    private String hcp05RepricingPerDiemFlatRateAmount;
    @JsonProperty("hcp06_repricedApprovedAmbulatoryPatientGroupCode")
    private String hcp06RepricedApprovedAmbulatoryPatientGroupCode;
    @JsonProperty("hcp07_repricedApprovedAmbulatoryPatientGroupAmount")
    private String hcp07RepricedApprovedAmbulatoryPatientGroupAmount;
    @JsonProperty("hcp08_repricedApprovedRevenueCode")
    private String hcp08RepricedApprovedRevenueCode;
    @JsonProperty("hcp11_unitOrBasisOfMeasurementCode")
    private String hcp11UnitOrBasisOfMeasurementCode;
    @JsonProperty("hcp12_repricedApprovedServiceUnitCount")
    private String hcp12RepricedApprovedServiceUnitCount;
    @JsonProperty("hcp13_rejectReasonCode")
    private String hcp13RejectReasonCode;
    @JsonProperty("hcp14_policyComplianceCode")
    private String hcp14PolicyComplianceCode;
    @JsonProperty("hcp15_exceptionCode")
    private String hcp15ExceptionCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clm01_patientControlNo")
    public String getClm01PatientControlNo() {
        return clm01PatientControlNo;
    }

    @JsonProperty("clm01_patientControlNo")
    public void setClm01PatientControlNo(String clm01PatientControlNo) {
        this.clm01PatientControlNo = clm01PatientControlNo;
    }

    public ClaimInfo withClm01PatientControlNo(String clm01PatientControlNo) {
        this.clm01PatientControlNo = clm01PatientControlNo;
        return this;
    }

    @JsonProperty("clm02_totalClaimChargeAmount")
    public String getClm02TotalClaimChargeAmount() {
        return clm02TotalClaimChargeAmount;
    }

    @JsonProperty("clm02_totalClaimChargeAmount")
    public void setClm02TotalClaimChargeAmount(String clm02TotalClaimChargeAmount) {
        this.clm02TotalClaimChargeAmount = clm02TotalClaimChargeAmount;
    }

    public ClaimInfo withClm02TotalClaimChargeAmount(String clm02TotalClaimChargeAmount) {
        this.clm02TotalClaimChargeAmount = clm02TotalClaimChargeAmount;
        return this;
    }

    @JsonProperty("clm05_serviceLocationInfo")
    public String getClm05ServiceLocationInfo() {
        return clm05ServiceLocationInfo;
    }

    @JsonProperty("clm05_serviceLocationInfo")
    public void setClm05ServiceLocationInfo(String clm05ServiceLocationInfo) {
        this.clm05ServiceLocationInfo = clm05ServiceLocationInfo;
    }

    public ClaimInfo withClm05ServiceLocationInfo(String clm05ServiceLocationInfo) {
        this.clm05ServiceLocationInfo = clm05ServiceLocationInfo;
        return this;
    }

    @JsonProperty("clm05_01_placeOfServiceCode")
    public String getClm0501PlaceOfServiceCode() {
        return clm0501PlaceOfServiceCode;
    }

    @JsonProperty("clm05_01_placeOfServiceCode")
    public void setClm0501PlaceOfServiceCode(String clm0501PlaceOfServiceCode) {
        this.clm0501PlaceOfServiceCode = clm0501PlaceOfServiceCode;
    }

    public ClaimInfo withClm0501PlaceOfServiceCode(String clm0501PlaceOfServiceCode) {
        this.clm0501PlaceOfServiceCode = clm0501PlaceOfServiceCode;
        return this;
    }

    @JsonProperty("clm05_02_placeOfServiceCodeQlfr")
    public String getClm0502PlaceOfServiceCodeQlfr() {
        return clm0502PlaceOfServiceCodeQlfr;
    }

    @JsonProperty("clm05_02_placeOfServiceCodeQlfr")
    public void setClm0502PlaceOfServiceCodeQlfr(String clm0502PlaceOfServiceCodeQlfr) {
        this.clm0502PlaceOfServiceCodeQlfr = clm0502PlaceOfServiceCodeQlfr;
    }

    public ClaimInfo withClm0502PlaceOfServiceCodeQlfr(String clm0502PlaceOfServiceCodeQlfr) {
        this.clm0502PlaceOfServiceCodeQlfr = clm0502PlaceOfServiceCodeQlfr;
        return this;
    }

    @JsonProperty("clm05_03_claimFrequencyCode")
    public String getClm0503ClaimFrequencyCode() {
        return clm0503ClaimFrequencyCode;
    }

    @JsonProperty("clm05_03_claimFrequencyCode")
    public void setClm0503ClaimFrequencyCode(String clm0503ClaimFrequencyCode) {
        this.clm0503ClaimFrequencyCode = clm0503ClaimFrequencyCode;
    }

    public ClaimInfo withClm0503ClaimFrequencyCode(String clm0503ClaimFrequencyCode) {
        this.clm0503ClaimFrequencyCode = clm0503ClaimFrequencyCode;
        return this;
    }

    @JsonProperty("clm06_supplierSignatureIndicator")
    public String getClm06SupplierSignatureIndicator() {
        return clm06SupplierSignatureIndicator;
    }

    @JsonProperty("clm06_supplierSignatureIndicator")
    public void setClm06SupplierSignatureIndicator(String clm06SupplierSignatureIndicator) {
        this.clm06SupplierSignatureIndicator = clm06SupplierSignatureIndicator;
    }

    public ClaimInfo withClm06SupplierSignatureIndicator(String clm06SupplierSignatureIndicator) {
        this.clm06SupplierSignatureIndicator = clm06SupplierSignatureIndicator;
        return this;
    }

    @JsonProperty("clm07_planParticipationCode")
    public String getClm07PlanParticipationCode() {
        return clm07PlanParticipationCode;
    }

    @JsonProperty("clm07_planParticipationCode")
    public void setClm07PlanParticipationCode(String clm07PlanParticipationCode) {
        this.clm07PlanParticipationCode = clm07PlanParticipationCode;
    }

    public ClaimInfo withClm07PlanParticipationCode(String clm07PlanParticipationCode) {
        this.clm07PlanParticipationCode = clm07PlanParticipationCode;
        return this;
    }

    @JsonProperty("clm08_benefitsAssignmentCertificationIndicator")
    public String getClm08BenefitsAssignmentCertificationIndicator() {
        return clm08BenefitsAssignmentCertificationIndicator;
    }

    @JsonProperty("clm08_benefitsAssignmentCertificationIndicator")
    public void setClm08BenefitsAssignmentCertificationIndicator(String clm08BenefitsAssignmentCertificationIndicator) {
        this.clm08BenefitsAssignmentCertificationIndicator = clm08BenefitsAssignmentCertificationIndicator;
    }

    public ClaimInfo withClm08BenefitsAssignmentCertificationIndicator(String clm08BenefitsAssignmentCertificationIndicator) {
        this.clm08BenefitsAssignmentCertificationIndicator = clm08BenefitsAssignmentCertificationIndicator;
        return this;
    }

    @JsonProperty("clm09_releaseOfInformationCode")
    public String getClm09ReleaseOfInformationCode() {
        return clm09ReleaseOfInformationCode;
    }

    @JsonProperty("clm09_releaseOfInformationCode")
    public void setClm09ReleaseOfInformationCode(String clm09ReleaseOfInformationCode) {
        this.clm09ReleaseOfInformationCode = clm09ReleaseOfInformationCode;
    }

    public ClaimInfo withClm09ReleaseOfInformationCode(String clm09ReleaseOfInformationCode) {
        this.clm09ReleaseOfInformationCode = clm09ReleaseOfInformationCode;
        return this;
    }

    @JsonProperty("clm10_patientSignatureSourceCode")
    public String getClm10PatientSignatureSourceCode() {
        return clm10PatientSignatureSourceCode;
    }

    @JsonProperty("clm10_patientSignatureSourceCode")
    public void setClm10PatientSignatureSourceCode(String clm10PatientSignatureSourceCode) {
        this.clm10PatientSignatureSourceCode = clm10PatientSignatureSourceCode;
    }

    public ClaimInfo withClm10PatientSignatureSourceCode(String clm10PatientSignatureSourceCode) {
        this.clm10PatientSignatureSourceCode = clm10PatientSignatureSourceCode;
        return this;
    }

    @JsonProperty("clm11_relatedCausesInfo")
    public String getClm11RelatedCausesInfo() {
        return clm11RelatedCausesInfo;
    }

    @JsonProperty("clm11_relatedCausesInfo")
    public void setClm11RelatedCausesInfo(String clm11RelatedCausesInfo) {
        this.clm11RelatedCausesInfo = clm11RelatedCausesInfo;
    }

    public ClaimInfo withClm11RelatedCausesInfo(String clm11RelatedCausesInfo) {
        this.clm11RelatedCausesInfo = clm11RelatedCausesInfo;
        return this;
    }

    @JsonProperty("clm11_01_relatedCausesCode")
    public String getClm1101RelatedCausesCode() {
        return clm1101RelatedCausesCode;
    }

    @JsonProperty("clm11_01_relatedCausesCode")
    public void setClm1101RelatedCausesCode(String clm1101RelatedCausesCode) {
        this.clm1101RelatedCausesCode = clm1101RelatedCausesCode;
    }

    public ClaimInfo withClm1101RelatedCausesCode(String clm1101RelatedCausesCode) {
        this.clm1101RelatedCausesCode = clm1101RelatedCausesCode;
        return this;
    }

    @JsonProperty("clm11_02_relatedCausesCode2")
    public String getClm1102RelatedCausesCode2() {
        return clm1102RelatedCausesCode2;
    }

    @JsonProperty("clm11_02_relatedCausesCode2")
    public void setClm1102RelatedCausesCode2(String clm1102RelatedCausesCode2) {
        this.clm1102RelatedCausesCode2 = clm1102RelatedCausesCode2;
    }

    public ClaimInfo withClm1102RelatedCausesCode2(String clm1102RelatedCausesCode2) {
        this.clm1102RelatedCausesCode2 = clm1102RelatedCausesCode2;
        return this;
    }

    @JsonProperty("clm11_04_autoAccidentStateCode")
    public String getClm1104AutoAccidentStateCode() {
        return clm1104AutoAccidentStateCode;
    }

    @JsonProperty("clm11_04_autoAccidentStateCode")
    public void setClm1104AutoAccidentStateCode(String clm1104AutoAccidentStateCode) {
        this.clm1104AutoAccidentStateCode = clm1104AutoAccidentStateCode;
    }

    public ClaimInfo withClm1104AutoAccidentStateCode(String clm1104AutoAccidentStateCode) {
        this.clm1104AutoAccidentStateCode = clm1104AutoAccidentStateCode;
        return this;
    }

    @JsonProperty("clm11_05_countryCode")
    public String getClm1105CountryCode() {
        return clm1105CountryCode;
    }

    @JsonProperty("clm11_05_countryCode")
    public void setClm1105CountryCode(String clm1105CountryCode) {
        this.clm1105CountryCode = clm1105CountryCode;
    }

    public ClaimInfo withClm1105CountryCode(String clm1105CountryCode) {
        this.clm1105CountryCode = clm1105CountryCode;
        return this;
    }

    @JsonProperty("clm12_specialProgramIndicator")
    public String getClm12SpecialProgramIndicator() {
        return clm12SpecialProgramIndicator;
    }

    @JsonProperty("clm12_specialProgramIndicator")
    public void setClm12SpecialProgramIndicator(String clm12SpecialProgramIndicator) {
        this.clm12SpecialProgramIndicator = clm12SpecialProgramIndicator;
    }

    public ClaimInfo withClm12SpecialProgramIndicator(String clm12SpecialProgramIndicator) {
        this.clm12SpecialProgramIndicator = clm12SpecialProgramIndicator;
        return this;
    }

    @JsonProperty("clm19_predeterminationOfBenefitsCode")
    public String getClm19PredeterminationOfBenefitsCode() {
        return clm19PredeterminationOfBenefitsCode;
    }

    @JsonProperty("clm19_predeterminationOfBenefitsCode")
    public void setClm19PredeterminationOfBenefitsCode(String clm19PredeterminationOfBenefitsCode) {
        this.clm19PredeterminationOfBenefitsCode = clm19PredeterminationOfBenefitsCode;
    }

    public ClaimInfo withClm19PredeterminationOfBenefitsCode(String clm19PredeterminationOfBenefitsCode) {
        this.clm19PredeterminationOfBenefitsCode = clm19PredeterminationOfBenefitsCode;
        return this;
    }

    @JsonProperty("clm20_delayReasonCode")
    public String getClm20DelayReasonCode() {
        return clm20DelayReasonCode;
    }

    @JsonProperty("clm20_delayReasonCode")
    public void setClm20DelayReasonCode(String clm20DelayReasonCode) {
        this.clm20DelayReasonCode = clm20DelayReasonCode;
    }

    public ClaimInfo withClm20DelayReasonCode(String clm20DelayReasonCode) {
        this.clm20DelayReasonCode = clm20DelayReasonCode;
        return this;
    }

    @JsonProperty("dtp01_onsetOfCurrentIllnessInjuryDateQlfr")
    public String getDtp01OnsetOfCurrentIllnessInjuryDateQlfr() {
        return dtp01OnsetOfCurrentIllnessInjuryDateQlfr;
    }

    @JsonProperty("dtp01_onsetOfCurrentIllnessInjuryDateQlfr")
    public void setDtp01OnsetOfCurrentIllnessInjuryDateQlfr(String dtp01OnsetOfCurrentIllnessInjuryDateQlfr) {
        this.dtp01OnsetOfCurrentIllnessInjuryDateQlfr = dtp01OnsetOfCurrentIllnessInjuryDateQlfr;
    }

    public ClaimInfo withDtp01OnsetOfCurrentIllnessInjuryDateQlfr(String dtp01OnsetOfCurrentIllnessInjuryDateQlfr) {
        this.dtp01OnsetOfCurrentIllnessInjuryDateQlfr = dtp01OnsetOfCurrentIllnessInjuryDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_onsetOfCurrentIllnessInjuryDateFormatQlfr")
    public String getDtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr() {
        return dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr;
    }

    @JsonProperty("dtp02_onsetOfCurrentIllnessInjuryDateFormatQlfr")
    public void setDtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr(String dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr) {
        this.dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr = dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr;
    }

    public ClaimInfo withDtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr(String dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr) {
        this.dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr = dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_onsetOfCurrentIllnessInjuryDate")
    public String getDtp03OnsetOfCurrentIllnessInjuryDate() {
        return dtp03OnsetOfCurrentIllnessInjuryDate;
    }

    @JsonProperty("dtp03_onsetOfCurrentIllnessInjuryDate")
    public void setDtp03OnsetOfCurrentIllnessInjuryDate(String dtp03OnsetOfCurrentIllnessInjuryDate) {
        this.dtp03OnsetOfCurrentIllnessInjuryDate = dtp03OnsetOfCurrentIllnessInjuryDate;
    }

    public ClaimInfo withDtp03OnsetOfCurrentIllnessInjuryDate(String dtp03OnsetOfCurrentIllnessInjuryDate) {
        this.dtp03OnsetOfCurrentIllnessInjuryDate = dtp03OnsetOfCurrentIllnessInjuryDate;
        return this;
    }

    @JsonProperty("dtp01_initialTreatmentDateQlfr")
    public String getDtp01InitialTreatmentDateQlfr() {
        return dtp01InitialTreatmentDateQlfr;
    }

    @JsonProperty("dtp01_initialTreatmentDateQlfr")
    public void setDtp01InitialTreatmentDateQlfr(String dtp01InitialTreatmentDateQlfr) {
        this.dtp01InitialTreatmentDateQlfr = dtp01InitialTreatmentDateQlfr;
    }

    public ClaimInfo withDtp01InitialTreatmentDateQlfr(String dtp01InitialTreatmentDateQlfr) {
        this.dtp01InitialTreatmentDateQlfr = dtp01InitialTreatmentDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_initialTreatmentDateFormatQlfr")
    public String getDtp02InitialTreatmentDateFormatQlfr() {
        return dtp02InitialTreatmentDateFormatQlfr;
    }

    @JsonProperty("dtp02_initialTreatmentDateFormatQlfr")
    public void setDtp02InitialTreatmentDateFormatQlfr(String dtp02InitialTreatmentDateFormatQlfr) {
        this.dtp02InitialTreatmentDateFormatQlfr = dtp02InitialTreatmentDateFormatQlfr;
    }

    public ClaimInfo withDtp02InitialTreatmentDateFormatQlfr(String dtp02InitialTreatmentDateFormatQlfr) {
        this.dtp02InitialTreatmentDateFormatQlfr = dtp02InitialTreatmentDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_initialTreatmentDate")
    public String getDtp03InitialTreatmentDate() {
        return dtp03InitialTreatmentDate;
    }

    @JsonProperty("dtp03_initialTreatmentDate")
    public void setDtp03InitialTreatmentDate(String dtp03InitialTreatmentDate) {
        this.dtp03InitialTreatmentDate = dtp03InitialTreatmentDate;
    }

    public ClaimInfo withDtp03InitialTreatmentDate(String dtp03InitialTreatmentDate) {
        this.dtp03InitialTreatmentDate = dtp03InitialTreatmentDate;
        return this;
    }

    @JsonProperty("dtp01_lastSeenDateQlfr")
    public String getDtp01LastSeenDateQlfr() {
        return dtp01LastSeenDateQlfr;
    }

    @JsonProperty("dtp01_lastSeenDateQlfr")
    public void setDtp01LastSeenDateQlfr(String dtp01LastSeenDateQlfr) {
        this.dtp01LastSeenDateQlfr = dtp01LastSeenDateQlfr;
    }

    public ClaimInfo withDtp01LastSeenDateQlfr(String dtp01LastSeenDateQlfr) {
        this.dtp01LastSeenDateQlfr = dtp01LastSeenDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_lastSeenDateFormatQlfr")
    public String getDtp02LastSeenDateFormatQlfr() {
        return dtp02LastSeenDateFormatQlfr;
    }

    @JsonProperty("dtp02_lastSeenDateFormatQlfr")
    public void setDtp02LastSeenDateFormatQlfr(String dtp02LastSeenDateFormatQlfr) {
        this.dtp02LastSeenDateFormatQlfr = dtp02LastSeenDateFormatQlfr;
    }

    public ClaimInfo withDtp02LastSeenDateFormatQlfr(String dtp02LastSeenDateFormatQlfr) {
        this.dtp02LastSeenDateFormatQlfr = dtp02LastSeenDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_lastSeenDate")
    public String getDtp03LastSeenDate() {
        return dtp03LastSeenDate;
    }

    @JsonProperty("dtp03_lastSeenDate")
    public void setDtp03LastSeenDate(String dtp03LastSeenDate) {
        this.dtp03LastSeenDate = dtp03LastSeenDate;
    }

    public ClaimInfo withDtp03LastSeenDate(String dtp03LastSeenDate) {
        this.dtp03LastSeenDate = dtp03LastSeenDate;
        return this;
    }

    @JsonProperty("dtp01_acuteManifestationDateQlfr")
    public String getDtp01AcuteManifestationDateQlfr() {
        return dtp01AcuteManifestationDateQlfr;
    }

    @JsonProperty("dtp01_acuteManifestationDateQlfr")
    public void setDtp01AcuteManifestationDateQlfr(String dtp01AcuteManifestationDateQlfr) {
        this.dtp01AcuteManifestationDateQlfr = dtp01AcuteManifestationDateQlfr;
    }

    public ClaimInfo withDtp01AcuteManifestationDateQlfr(String dtp01AcuteManifestationDateQlfr) {
        this.dtp01AcuteManifestationDateQlfr = dtp01AcuteManifestationDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_acuteManifestationDateFormatQlfr")
    public String getDtp02AcuteManifestationDateFormatQlfr() {
        return dtp02AcuteManifestationDateFormatQlfr;
    }

    @JsonProperty("dtp02_acuteManifestationDateFormatQlfr")
    public void setDtp02AcuteManifestationDateFormatQlfr(String dtp02AcuteManifestationDateFormatQlfr) {
        this.dtp02AcuteManifestationDateFormatQlfr = dtp02AcuteManifestationDateFormatQlfr;
    }

    public ClaimInfo withDtp02AcuteManifestationDateFormatQlfr(String dtp02AcuteManifestationDateFormatQlfr) {
        this.dtp02AcuteManifestationDateFormatQlfr = dtp02AcuteManifestationDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_acuteManifestationDate")
    public String getDtp03AcuteManifestationDate() {
        return dtp03AcuteManifestationDate;
    }

    @JsonProperty("dtp03_acuteManifestationDate")
    public void setDtp03AcuteManifestationDate(String dtp03AcuteManifestationDate) {
        this.dtp03AcuteManifestationDate = dtp03AcuteManifestationDate;
    }

    public ClaimInfo withDtp03AcuteManifestationDate(String dtp03AcuteManifestationDate) {
        this.dtp03AcuteManifestationDate = dtp03AcuteManifestationDate;
        return this;
    }

    @JsonProperty("dtp01_accidentDateQlfr")
    public String getDtp01AccidentDateQlfr() {
        return dtp01AccidentDateQlfr;
    }

    @JsonProperty("dtp01_accidentDateQlfr")
    public void setDtp01AccidentDateQlfr(String dtp01AccidentDateQlfr) {
        this.dtp01AccidentDateQlfr = dtp01AccidentDateQlfr;
    }

    public ClaimInfo withDtp01AccidentDateQlfr(String dtp01AccidentDateQlfr) {
        this.dtp01AccidentDateQlfr = dtp01AccidentDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_accidentDateFormatQlfr")
    public String getDtp02AccidentDateFormatQlfr() {
        return dtp02AccidentDateFormatQlfr;
    }

    @JsonProperty("dtp02_accidentDateFormatQlfr")
    public void setDtp02AccidentDateFormatQlfr(String dtp02AccidentDateFormatQlfr) {
        this.dtp02AccidentDateFormatQlfr = dtp02AccidentDateFormatQlfr;
    }

    public ClaimInfo withDtp02AccidentDateFormatQlfr(String dtp02AccidentDateFormatQlfr) {
        this.dtp02AccidentDateFormatQlfr = dtp02AccidentDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_accidentDate")
    public String getDtp03AccidentDate() {
        return dtp03AccidentDate;
    }

    @JsonProperty("dtp03_accidentDate")
    public void setDtp03AccidentDate(String dtp03AccidentDate) {
        this.dtp03AccidentDate = dtp03AccidentDate;
    }

    public ClaimInfo withDtp03AccidentDate(String dtp03AccidentDate) {
        this.dtp03AccidentDate = dtp03AccidentDate;
        return this;
    }

    @JsonProperty("dtp01_lastMenstrualPeriodDateQlfr")
    public String getDtp01LastMenstrualPeriodDateQlfr() {
        return dtp01LastMenstrualPeriodDateQlfr;
    }

    @JsonProperty("dtp01_lastMenstrualPeriodDateQlfr")
    public void setDtp01LastMenstrualPeriodDateQlfr(String dtp01LastMenstrualPeriodDateQlfr) {
        this.dtp01LastMenstrualPeriodDateQlfr = dtp01LastMenstrualPeriodDateQlfr;
    }

    public ClaimInfo withDtp01LastMenstrualPeriodDateQlfr(String dtp01LastMenstrualPeriodDateQlfr) {
        this.dtp01LastMenstrualPeriodDateQlfr = dtp01LastMenstrualPeriodDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_lastMenstrualPeriodDateFormatQlfr")
    public String getDtp02LastMenstrualPeriodDateFormatQlfr() {
        return dtp02LastMenstrualPeriodDateFormatQlfr;
    }

    @JsonProperty("dtp02_lastMenstrualPeriodDateFormatQlfr")
    public void setDtp02LastMenstrualPeriodDateFormatQlfr(String dtp02LastMenstrualPeriodDateFormatQlfr) {
        this.dtp02LastMenstrualPeriodDateFormatQlfr = dtp02LastMenstrualPeriodDateFormatQlfr;
    }

    public ClaimInfo withDtp02LastMenstrualPeriodDateFormatQlfr(String dtp02LastMenstrualPeriodDateFormatQlfr) {
        this.dtp02LastMenstrualPeriodDateFormatQlfr = dtp02LastMenstrualPeriodDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_lastMenstrualPeriodDate")
    public String getDtp03LastMenstrualPeriodDate() {
        return dtp03LastMenstrualPeriodDate;
    }

    @JsonProperty("dtp03_lastMenstrualPeriodDate")
    public void setDtp03LastMenstrualPeriodDate(String dtp03LastMenstrualPeriodDate) {
        this.dtp03LastMenstrualPeriodDate = dtp03LastMenstrualPeriodDate;
    }

    public ClaimInfo withDtp03LastMenstrualPeriodDate(String dtp03LastMenstrualPeriodDate) {
        this.dtp03LastMenstrualPeriodDate = dtp03LastMenstrualPeriodDate;
        return this;
    }

    @JsonProperty("dtp01_lastXrayDateQlfr")
    public String getDtp01LastXrayDateQlfr() {
        return dtp01LastXrayDateQlfr;
    }

    @JsonProperty("dtp01_lastXrayDateQlfr")
    public void setDtp01LastXrayDateQlfr(String dtp01LastXrayDateQlfr) {
        this.dtp01LastXrayDateQlfr = dtp01LastXrayDateQlfr;
    }

    public ClaimInfo withDtp01LastXrayDateQlfr(String dtp01LastXrayDateQlfr) {
        this.dtp01LastXrayDateQlfr = dtp01LastXrayDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_lastXrayDateFormatQlfr")
    public String getDtp02LastXrayDateFormatQlfr() {
        return dtp02LastXrayDateFormatQlfr;
    }

    @JsonProperty("dtp02_lastXrayDateFormatQlfr")
    public void setDtp02LastXrayDateFormatQlfr(String dtp02LastXrayDateFormatQlfr) {
        this.dtp02LastXrayDateFormatQlfr = dtp02LastXrayDateFormatQlfr;
    }

    public ClaimInfo withDtp02LastXrayDateFormatQlfr(String dtp02LastXrayDateFormatQlfr) {
        this.dtp02LastXrayDateFormatQlfr = dtp02LastXrayDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_lastXrayDate")
    public String getDtp03LastXrayDate() {
        return dtp03LastXrayDate;
    }

    @JsonProperty("dtp03_lastXrayDate")
    public void setDtp03LastXrayDate(String dtp03LastXrayDate) {
        this.dtp03LastXrayDate = dtp03LastXrayDate;
    }

    public ClaimInfo withDtp03LastXrayDate(String dtp03LastXrayDate) {
        this.dtp03LastXrayDate = dtp03LastXrayDate;
        return this;
    }

    @JsonProperty("dtp01_hearVisionPrescriptionDateQlfr")
    public String getDtp01HearVisionPrescriptionDateQlfr() {
        return dtp01HearVisionPrescriptionDateQlfr;
    }

    @JsonProperty("dtp01_hearVisionPrescriptionDateQlfr")
    public void setDtp01HearVisionPrescriptionDateQlfr(String dtp01HearVisionPrescriptionDateQlfr) {
        this.dtp01HearVisionPrescriptionDateQlfr = dtp01HearVisionPrescriptionDateQlfr;
    }

    public ClaimInfo withDtp01HearVisionPrescriptionDateQlfr(String dtp01HearVisionPrescriptionDateQlfr) {
        this.dtp01HearVisionPrescriptionDateQlfr = dtp01HearVisionPrescriptionDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_hearVisionPrescriptionDateFormatQlfr")
    public String getDtp02HearVisionPrescriptionDateFormatQlfr() {
        return dtp02HearVisionPrescriptionDateFormatQlfr;
    }

    @JsonProperty("dtp02_hearVisionPrescriptionDateFormatQlfr")
    public void setDtp02HearVisionPrescriptionDateFormatQlfr(String dtp02HearVisionPrescriptionDateFormatQlfr) {
        this.dtp02HearVisionPrescriptionDateFormatQlfr = dtp02HearVisionPrescriptionDateFormatQlfr;
    }

    public ClaimInfo withDtp02HearVisionPrescriptionDateFormatQlfr(String dtp02HearVisionPrescriptionDateFormatQlfr) {
        this.dtp02HearVisionPrescriptionDateFormatQlfr = dtp02HearVisionPrescriptionDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_hearVisionPrescriptionDate")
    public String getDtp03HearVisionPrescriptionDate() {
        return dtp03HearVisionPrescriptionDate;
    }

    @JsonProperty("dtp03_hearVisionPrescriptionDate")
    public void setDtp03HearVisionPrescriptionDate(String dtp03HearVisionPrescriptionDate) {
        this.dtp03HearVisionPrescriptionDate = dtp03HearVisionPrescriptionDate;
    }

    public ClaimInfo withDtp03HearVisionPrescriptionDate(String dtp03HearVisionPrescriptionDate) {
        this.dtp03HearVisionPrescriptionDate = dtp03HearVisionPrescriptionDate;
        return this;
    }

    @JsonProperty("dtp01_disabilityQlfr")
    public String getDtp01DisabilityQlfr() {
        return dtp01DisabilityQlfr;
    }

    @JsonProperty("dtp01_disabilityQlfr")
    public void setDtp01DisabilityQlfr(String dtp01DisabilityQlfr) {
        this.dtp01DisabilityQlfr = dtp01DisabilityQlfr;
    }

    public ClaimInfo withDtp01DisabilityQlfr(String dtp01DisabilityQlfr) {
        this.dtp01DisabilityQlfr = dtp01DisabilityQlfr;
        return this;
    }

    @JsonProperty("dtp02_disabilityFormatQlfr")
    public String getDtp02DisabilityFormatQlfr() {
        return dtp02DisabilityFormatQlfr;
    }

    @JsonProperty("dtp02_disabilityFormatQlfr")
    public void setDtp02DisabilityFormatQlfr(String dtp02DisabilityFormatQlfr) {
        this.dtp02DisabilityFormatQlfr = dtp02DisabilityFormatQlfr;
    }

    public ClaimInfo withDtp02DisabilityFormatQlfr(String dtp02DisabilityFormatQlfr) {
        this.dtp02DisabilityFormatQlfr = dtp02DisabilityFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_disability")
    public String getDtp03Disability() {
        return dtp03Disability;
    }

    @JsonProperty("dtp03_disability")
    public void setDtp03Disability(String dtp03Disability) {
        this.dtp03Disability = dtp03Disability;
    }

    public ClaimInfo withDtp03Disability(String dtp03Disability) {
        this.dtp03Disability = dtp03Disability;
        return this;
    }

    @JsonProperty("dtp01_initialDisabilityPeriodStartQlfr")
    public String getDtp01InitialDisabilityPeriodStartQlfr() {
        return dtp01InitialDisabilityPeriodStartQlfr;
    }

    @JsonProperty("dtp01_initialDisabilityPeriodStartQlfr")
    public void setDtp01InitialDisabilityPeriodStartQlfr(String dtp01InitialDisabilityPeriodStartQlfr) {
        this.dtp01InitialDisabilityPeriodStartQlfr = dtp01InitialDisabilityPeriodStartQlfr;
    }

    public ClaimInfo withDtp01InitialDisabilityPeriodStartQlfr(String dtp01InitialDisabilityPeriodStartQlfr) {
        this.dtp01InitialDisabilityPeriodStartQlfr = dtp01InitialDisabilityPeriodStartQlfr;
        return this;
    }

    @JsonProperty("dtp02_initialDisabilityPeriodStartFormatQlfr")
    public String getDtp02InitialDisabilityPeriodStartFormatQlfr() {
        return dtp02InitialDisabilityPeriodStartFormatQlfr;
    }

    @JsonProperty("dtp02_initialDisabilityPeriodStartFormatQlfr")
    public void setDtp02InitialDisabilityPeriodStartFormatQlfr(String dtp02InitialDisabilityPeriodStartFormatQlfr) {
        this.dtp02InitialDisabilityPeriodStartFormatQlfr = dtp02InitialDisabilityPeriodStartFormatQlfr;
    }

    public ClaimInfo withDtp02InitialDisabilityPeriodStartFormatQlfr(String dtp02InitialDisabilityPeriodStartFormatQlfr) {
        this.dtp02InitialDisabilityPeriodStartFormatQlfr = dtp02InitialDisabilityPeriodStartFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_initialDisabilityPeriodStartDate")
    public String getDtp03InitialDisabilityPeriodStartDate() {
        return dtp03InitialDisabilityPeriodStartDate;
    }

    @JsonProperty("dtp03_initialDisabilityPeriodStartDate")
    public void setDtp03InitialDisabilityPeriodStartDate(String dtp03InitialDisabilityPeriodStartDate) {
        this.dtp03InitialDisabilityPeriodStartDate = dtp03InitialDisabilityPeriodStartDate;
    }

    public ClaimInfo withDtp03InitialDisabilityPeriodStartDate(String dtp03InitialDisabilityPeriodStartDate) {
        this.dtp03InitialDisabilityPeriodStartDate = dtp03InitialDisabilityPeriodStartDate;
        return this;
    }

    @JsonProperty("dtp01_initialDisabilityPeriodEndQlfr")
    public String getDtp01InitialDisabilityPeriodEndQlfr() {
        return dtp01InitialDisabilityPeriodEndQlfr;
    }

    @JsonProperty("dtp01_initialDisabilityPeriodEndQlfr")
    public void setDtp01InitialDisabilityPeriodEndQlfr(String dtp01InitialDisabilityPeriodEndQlfr) {
        this.dtp01InitialDisabilityPeriodEndQlfr = dtp01InitialDisabilityPeriodEndQlfr;
    }

    public ClaimInfo withDtp01InitialDisabilityPeriodEndQlfr(String dtp01InitialDisabilityPeriodEndQlfr) {
        this.dtp01InitialDisabilityPeriodEndQlfr = dtp01InitialDisabilityPeriodEndQlfr;
        return this;
    }

    @JsonProperty("dtp02_initialDisabilityPeriodEndFormatQlfr")
    public String getDtp02InitialDisabilityPeriodEndFormatQlfr() {
        return dtp02InitialDisabilityPeriodEndFormatQlfr;
    }

    @JsonProperty("dtp02_initialDisabilityPeriodEndFormatQlfr")
    public void setDtp02InitialDisabilityPeriodEndFormatQlfr(String dtp02InitialDisabilityPeriodEndFormatQlfr) {
        this.dtp02InitialDisabilityPeriodEndFormatQlfr = dtp02InitialDisabilityPeriodEndFormatQlfr;
    }

    public ClaimInfo withDtp02InitialDisabilityPeriodEndFormatQlfr(String dtp02InitialDisabilityPeriodEndFormatQlfr) {
        this.dtp02InitialDisabilityPeriodEndFormatQlfr = dtp02InitialDisabilityPeriodEndFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_initialDisabilityPeriodEndDate")
    public String getDtp03InitialDisabilityPeriodEndDate() {
        return dtp03InitialDisabilityPeriodEndDate;
    }

    @JsonProperty("dtp03_initialDisabilityPeriodEndDate")
    public void setDtp03InitialDisabilityPeriodEndDate(String dtp03InitialDisabilityPeriodEndDate) {
        this.dtp03InitialDisabilityPeriodEndDate = dtp03InitialDisabilityPeriodEndDate;
    }

    public ClaimInfo withDtp03InitialDisabilityPeriodEndDate(String dtp03InitialDisabilityPeriodEndDate) {
        this.dtp03InitialDisabilityPeriodEndDate = dtp03InitialDisabilityPeriodEndDate;
        return this;
    }

    @JsonProperty("dtp01_lastWorkedDateQlfr")
    public String getDtp01LastWorkedDateQlfr() {
        return dtp01LastWorkedDateQlfr;
    }

    @JsonProperty("dtp01_lastWorkedDateQlfr")
    public void setDtp01LastWorkedDateQlfr(String dtp01LastWorkedDateQlfr) {
        this.dtp01LastWorkedDateQlfr = dtp01LastWorkedDateQlfr;
    }

    public ClaimInfo withDtp01LastWorkedDateQlfr(String dtp01LastWorkedDateQlfr) {
        this.dtp01LastWorkedDateQlfr = dtp01LastWorkedDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_lastWorkedDateFormatQlfr")
    public String getDtp02LastWorkedDateFormatQlfr() {
        return dtp02LastWorkedDateFormatQlfr;
    }

    @JsonProperty("dtp02_lastWorkedDateFormatQlfr")
    public void setDtp02LastWorkedDateFormatQlfr(String dtp02LastWorkedDateFormatQlfr) {
        this.dtp02LastWorkedDateFormatQlfr = dtp02LastWorkedDateFormatQlfr;
    }

    public ClaimInfo withDtp02LastWorkedDateFormatQlfr(String dtp02LastWorkedDateFormatQlfr) {
        this.dtp02LastWorkedDateFormatQlfr = dtp02LastWorkedDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_lastWorkedDate")
    public String getDtp03LastWorkedDate() {
        return dtp03LastWorkedDate;
    }

    @JsonProperty("dtp03_lastWorkedDate")
    public void setDtp03LastWorkedDate(String dtp03LastWorkedDate) {
        this.dtp03LastWorkedDate = dtp03LastWorkedDate;
    }

    public ClaimInfo withDtp03LastWorkedDate(String dtp03LastWorkedDate) {
        this.dtp03LastWorkedDate = dtp03LastWorkedDate;
        return this;
    }

    @JsonProperty("dtp01_workReturnDateQlfr")
    public String getDtp01WorkReturnDateQlfr() {
        return dtp01WorkReturnDateQlfr;
    }

    @JsonProperty("dtp01_workReturnDateQlfr")
    public void setDtp01WorkReturnDateQlfr(String dtp01WorkReturnDateQlfr) {
        this.dtp01WorkReturnDateQlfr = dtp01WorkReturnDateQlfr;
    }

    public ClaimInfo withDtp01WorkReturnDateQlfr(String dtp01WorkReturnDateQlfr) {
        this.dtp01WorkReturnDateQlfr = dtp01WorkReturnDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_workReturnDateFormatQlfr")
    public String getDtp02WorkReturnDateFormatQlfr() {
        return dtp02WorkReturnDateFormatQlfr;
    }

    @JsonProperty("dtp02_workReturnDateFormatQlfr")
    public void setDtp02WorkReturnDateFormatQlfr(String dtp02WorkReturnDateFormatQlfr) {
        this.dtp02WorkReturnDateFormatQlfr = dtp02WorkReturnDateFormatQlfr;
    }

    public ClaimInfo withDtp02WorkReturnDateFormatQlfr(String dtp02WorkReturnDateFormatQlfr) {
        this.dtp02WorkReturnDateFormatQlfr = dtp02WorkReturnDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_workReturnDate")
    public String getDtp03WorkReturnDate() {
        return dtp03WorkReturnDate;
    }

    @JsonProperty("dtp03_workReturnDate")
    public void setDtp03WorkReturnDate(String dtp03WorkReturnDate) {
        this.dtp03WorkReturnDate = dtp03WorkReturnDate;
    }

    public ClaimInfo withDtp03WorkReturnDate(String dtp03WorkReturnDate) {
        this.dtp03WorkReturnDate = dtp03WorkReturnDate;
        return this;
    }

    @JsonProperty("dtp01_hospitalizationAdmissionDateQlfr")
    public String getDtp01HospitalizationAdmissionDateQlfr() {
        return dtp01HospitalizationAdmissionDateQlfr;
    }

    @JsonProperty("dtp01_hospitalizationAdmissionDateQlfr")
    public void setDtp01HospitalizationAdmissionDateQlfr(String dtp01HospitalizationAdmissionDateQlfr) {
        this.dtp01HospitalizationAdmissionDateQlfr = dtp01HospitalizationAdmissionDateQlfr;
    }

    public ClaimInfo withDtp01HospitalizationAdmissionDateQlfr(String dtp01HospitalizationAdmissionDateQlfr) {
        this.dtp01HospitalizationAdmissionDateQlfr = dtp01HospitalizationAdmissionDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_hospitalizationAdmissionDateFormatQlfr")
    public String getDtp02HospitalizationAdmissionDateFormatQlfr() {
        return dtp02HospitalizationAdmissionDateFormatQlfr;
    }

    @JsonProperty("dtp02_hospitalizationAdmissionDateFormatQlfr")
    public void setDtp02HospitalizationAdmissionDateFormatQlfr(String dtp02HospitalizationAdmissionDateFormatQlfr) {
        this.dtp02HospitalizationAdmissionDateFormatQlfr = dtp02HospitalizationAdmissionDateFormatQlfr;
    }

    public ClaimInfo withDtp02HospitalizationAdmissionDateFormatQlfr(String dtp02HospitalizationAdmissionDateFormatQlfr) {
        this.dtp02HospitalizationAdmissionDateFormatQlfr = dtp02HospitalizationAdmissionDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_hospitalizationAdmissionDate")
    public String getDtp03HospitalizationAdmissionDate() {
        return dtp03HospitalizationAdmissionDate;
    }

    @JsonProperty("dtp03_hospitalizationAdmissionDate")
    public void setDtp03HospitalizationAdmissionDate(String dtp03HospitalizationAdmissionDate) {
        this.dtp03HospitalizationAdmissionDate = dtp03HospitalizationAdmissionDate;
    }

    public ClaimInfo withDtp03HospitalizationAdmissionDate(String dtp03HospitalizationAdmissionDate) {
        this.dtp03HospitalizationAdmissionDate = dtp03HospitalizationAdmissionDate;
        return this;
    }

    @JsonProperty("dtp01_hospitalizationDischargeDateQlfr")
    public String getDtp01HospitalizationDischargeDateQlfr() {
        return dtp01HospitalizationDischargeDateQlfr;
    }

    @JsonProperty("dtp01_hospitalizationDischargeDateQlfr")
    public void setDtp01HospitalizationDischargeDateQlfr(String dtp01HospitalizationDischargeDateQlfr) {
        this.dtp01HospitalizationDischargeDateQlfr = dtp01HospitalizationDischargeDateQlfr;
    }

    public ClaimInfo withDtp01HospitalizationDischargeDateQlfr(String dtp01HospitalizationDischargeDateQlfr) {
        this.dtp01HospitalizationDischargeDateQlfr = dtp01HospitalizationDischargeDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_hospitalizationDischargeDateFormatQlfr")
    public String getDtp02HospitalizationDischargeDateFormatQlfr() {
        return dtp02HospitalizationDischargeDateFormatQlfr;
    }

    @JsonProperty("dtp02_hospitalizationDischargeDateFormatQlfr")
    public void setDtp02HospitalizationDischargeDateFormatQlfr(String dtp02HospitalizationDischargeDateFormatQlfr) {
        this.dtp02HospitalizationDischargeDateFormatQlfr = dtp02HospitalizationDischargeDateFormatQlfr;
    }

    public ClaimInfo withDtp02HospitalizationDischargeDateFormatQlfr(String dtp02HospitalizationDischargeDateFormatQlfr) {
        this.dtp02HospitalizationDischargeDateFormatQlfr = dtp02HospitalizationDischargeDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_hospitalizationDischargeDate")
    public String getDtp03HospitalizationDischargeDate() {
        return dtp03HospitalizationDischargeDate;
    }

    @JsonProperty("dtp03_hospitalizationDischargeDate")
    public void setDtp03HospitalizationDischargeDate(String dtp03HospitalizationDischargeDate) {
        this.dtp03HospitalizationDischargeDate = dtp03HospitalizationDischargeDate;
    }

    public ClaimInfo withDtp03HospitalizationDischargeDate(String dtp03HospitalizationDischargeDate) {
        this.dtp03HospitalizationDischargeDate = dtp03HospitalizationDischargeDate;
        return this;
    }

    @JsonProperty("dtp01_fromAndToStatementDateQlfr")
    public String getDtp01FromAndToStatementDateQlfr() {
        return dtp01FromAndToStatementDateQlfr;
    }

    @JsonProperty("dtp01_fromAndToStatementDateQlfr")
    public void setDtp01FromAndToStatementDateQlfr(String dtp01FromAndToStatementDateQlfr) {
        this.dtp01FromAndToStatementDateQlfr = dtp01FromAndToStatementDateQlfr;
    }

    public ClaimInfo withDtp01FromAndToStatementDateQlfr(String dtp01FromAndToStatementDateQlfr) {
        this.dtp01FromAndToStatementDateQlfr = dtp01FromAndToStatementDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_fromAndToStatementDateFormatQlfr")
    public String getDtp02FromAndToStatementDateFormatQlfr() {
        return dtp02FromAndToStatementDateFormatQlfr;
    }

    @JsonProperty("dtp02_fromAndToStatementDateFormatQlfr")
    public void setDtp02FromAndToStatementDateFormatQlfr(String dtp02FromAndToStatementDateFormatQlfr) {
        this.dtp02FromAndToStatementDateFormatQlfr = dtp02FromAndToStatementDateFormatQlfr;
    }

    public ClaimInfo withDtp02FromAndToStatementDateFormatQlfr(String dtp02FromAndToStatementDateFormatQlfr) {
        this.dtp02FromAndToStatementDateFormatQlfr = dtp02FromAndToStatementDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_fromAndToStatementDate")
    public String getDtp03FromAndToStatementDate() {
        return dtp03FromAndToStatementDate;
    }

    @JsonProperty("dtp03_fromAndToStatementDate")
    public void setDtp03FromAndToStatementDate(String dtp03FromAndToStatementDate) {
        this.dtp03FromAndToStatementDate = dtp03FromAndToStatementDate;
    }

    public ClaimInfo withDtp03FromAndToStatementDate(String dtp03FromAndToStatementDate) {
        this.dtp03FromAndToStatementDate = dtp03FromAndToStatementDate;
        return this;
    }

    @JsonProperty("dtp01_dischargeHourQlfr")
    public String getDtp01DischargeHourQlfr() {
        return dtp01DischargeHourQlfr;
    }

    @JsonProperty("dtp01_dischargeHourQlfr")
    public void setDtp01DischargeHourQlfr(String dtp01DischargeHourQlfr) {
        this.dtp01DischargeHourQlfr = dtp01DischargeHourQlfr;
    }

    public ClaimInfo withDtp01DischargeHourQlfr(String dtp01DischargeHourQlfr) {
        this.dtp01DischargeHourQlfr = dtp01DischargeHourQlfr;
        return this;
    }

    @JsonProperty("dtp02_dischargeTimePeriodFormatQlfr")
    public String getDtp02DischargeTimePeriodFormatQlfr() {
        return dtp02DischargeTimePeriodFormatQlfr;
    }

    @JsonProperty("dtp02_dischargeTimePeriodFormatQlfr")
    public void setDtp02DischargeTimePeriodFormatQlfr(String dtp02DischargeTimePeriodFormatQlfr) {
        this.dtp02DischargeTimePeriodFormatQlfr = dtp02DischargeTimePeriodFormatQlfr;
    }

    public ClaimInfo withDtp02DischargeTimePeriodFormatQlfr(String dtp02DischargeTimePeriodFormatQlfr) {
        this.dtp02DischargeTimePeriodFormatQlfr = dtp02DischargeTimePeriodFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_dischargeTimePeriod")
    public String getDtp03DischargeTimePeriod() {
        return dtp03DischargeTimePeriod;
    }

    @JsonProperty("dtp03_dischargeTimePeriod")
    public void setDtp03DischargeTimePeriod(String dtp03DischargeTimePeriod) {
        this.dtp03DischargeTimePeriod = dtp03DischargeTimePeriod;
    }

    public ClaimInfo withDtp03DischargeTimePeriod(String dtp03DischargeTimePeriod) {
        this.dtp03DischargeTimePeriod = dtp03DischargeTimePeriod;
        return this;
    }

    @JsonProperty("dtp01_admissionDateHourQlfr")
    public String getDtp01AdmissionDateHourQlfr() {
        return dtp01AdmissionDateHourQlfr;
    }

    @JsonProperty("dtp01_admissionDateHourQlfr")
    public void setDtp01AdmissionDateHourQlfr(String dtp01AdmissionDateHourQlfr) {
        this.dtp01AdmissionDateHourQlfr = dtp01AdmissionDateHourQlfr;
    }

    public ClaimInfo withDtp01AdmissionDateHourQlfr(String dtp01AdmissionDateHourQlfr) {
        this.dtp01AdmissionDateHourQlfr = dtp01AdmissionDateHourQlfr;
        return this;
    }

    @JsonProperty("dtp02admissionDateHourFormatQlfr")
    public String getDtp02admissionDateHourFormatQlfr() {
        return dtp02admissionDateHourFormatQlfr;
    }

    @JsonProperty("dtp02admissionDateHourFormatQlfr")
    public void setDtp02admissionDateHourFormatQlfr(String dtp02admissionDateHourFormatQlfr) {
        this.dtp02admissionDateHourFormatQlfr = dtp02admissionDateHourFormatQlfr;
    }

    public ClaimInfo withDtp02admissionDateHourFormatQlfr(String dtp02admissionDateHourFormatQlfr) {
        this.dtp02admissionDateHourFormatQlfr = dtp02admissionDateHourFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_admissionDateHour")
    public String getDtp03AdmissionDateHour() {
        return dtp03AdmissionDateHour;
    }

    @JsonProperty("dtp03_admissionDateHour")
    public void setDtp03AdmissionDateHour(String dtp03AdmissionDateHour) {
        this.dtp03AdmissionDateHour = dtp03AdmissionDateHour;
    }

    public ClaimInfo withDtp03AdmissionDateHour(String dtp03AdmissionDateHour) {
        this.dtp03AdmissionDateHour = dtp03AdmissionDateHour;
        return this;
    }

    @JsonProperty("dtp_assumedAndRelinquishedDates")
    public List<DtpAssumedAndRelinquishedDate> getDtpAssumedAndRelinquishedDates() {
        return dtpAssumedAndRelinquishedDates;
    }

    @JsonProperty("dtp_assumedAndRelinquishedDates")
    public void setDtpAssumedAndRelinquishedDates(List<DtpAssumedAndRelinquishedDate> dtpAssumedAndRelinquishedDates) {
        this.dtpAssumedAndRelinquishedDates = dtpAssumedAndRelinquishedDates;
    }

    public ClaimInfo withDtpAssumedAndRelinquishedDates(List<DtpAssumedAndRelinquishedDate> dtpAssumedAndRelinquishedDates) {
        this.dtpAssumedAndRelinquishedDates = dtpAssumedAndRelinquishedDates;
        return this;
    }

    @JsonProperty("dtp01_propertyCasualtyFirstContactDate")
    public String getDtp01PropertyCasualtyFirstContactDate() {
        return dtp01PropertyCasualtyFirstContactDate;
    }

    @JsonProperty("dtp01_propertyCasualtyFirstContactDate")
    public void setDtp01PropertyCasualtyFirstContactDate(String dtp01PropertyCasualtyFirstContactDate) {
        this.dtp01PropertyCasualtyFirstContactDate = dtp01PropertyCasualtyFirstContactDate;
    }

    public ClaimInfo withDtp01PropertyCasualtyFirstContactDate(String dtp01PropertyCasualtyFirstContactDate) {
        this.dtp01PropertyCasualtyFirstContactDate = dtp01PropertyCasualtyFirstContactDate;
        return this;
    }

    @JsonProperty("dtp02_propertyCasualtyFirstContactDateFormatQlfr")
    public String getDtp02PropertyCasualtyFirstContactDateFormatQlfr() {
        return dtp02PropertyCasualtyFirstContactDateFormatQlfr;
    }

    @JsonProperty("dtp02_propertyCasualtyFirstContactDateFormatQlfr")
    public void setDtp02PropertyCasualtyFirstContactDateFormatQlfr(String dtp02PropertyCasualtyFirstContactDateFormatQlfr) {
        this.dtp02PropertyCasualtyFirstContactDateFormatQlfr = dtp02PropertyCasualtyFirstContactDateFormatQlfr;
    }

    public ClaimInfo withDtp02PropertyCasualtyFirstContactDateFormatQlfr(String dtp02PropertyCasualtyFirstContactDateFormatQlfr) {
        this.dtp02PropertyCasualtyFirstContactDateFormatQlfr = dtp02PropertyCasualtyFirstContactDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_propertyCasualtyFirstContactDate")
    public String getDtp03PropertyCasualtyFirstContactDate() {
        return dtp03PropertyCasualtyFirstContactDate;
    }

    @JsonProperty("dtp03_propertyCasualtyFirstContactDate")
    public void setDtp03PropertyCasualtyFirstContactDate(String dtp03PropertyCasualtyFirstContactDate) {
        this.dtp03PropertyCasualtyFirstContactDate = dtp03PropertyCasualtyFirstContactDate;
    }

    public ClaimInfo withDtp03PropertyCasualtyFirstContactDate(String dtp03PropertyCasualtyFirstContactDate) {
        this.dtp03PropertyCasualtyFirstContactDate = dtp03PropertyCasualtyFirstContactDate;
        return this;
    }

    @JsonProperty("dtp01_appliancePlacementQlfr")
    public String getDtp01AppliancePlacementQlfr() {
        return dtp01AppliancePlacementQlfr;
    }

    @JsonProperty("dtp01_appliancePlacementQlfr")
    public void setDtp01AppliancePlacementQlfr(String dtp01AppliancePlacementQlfr) {
        this.dtp01AppliancePlacementQlfr = dtp01AppliancePlacementQlfr;
    }

    public ClaimInfo withDtp01AppliancePlacementQlfr(String dtp01AppliancePlacementQlfr) {
        this.dtp01AppliancePlacementQlfr = dtp01AppliancePlacementQlfr;
        return this;
    }

    @JsonProperty("dtp02_appliancePlacementDateFormatQlfr")
    public String getDtp02AppliancePlacementDateFormatQlfr() {
        return dtp02AppliancePlacementDateFormatQlfr;
    }

    @JsonProperty("dtp02_appliancePlacementDateFormatQlfr")
    public void setDtp02AppliancePlacementDateFormatQlfr(String dtp02AppliancePlacementDateFormatQlfr) {
        this.dtp02AppliancePlacementDateFormatQlfr = dtp02AppliancePlacementDateFormatQlfr;
    }

    public ClaimInfo withDtp02AppliancePlacementDateFormatQlfr(String dtp02AppliancePlacementDateFormatQlfr) {
        this.dtp02AppliancePlacementDateFormatQlfr = dtp02AppliancePlacementDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_orthodonticBrandingDate")
    public String getDtp03OrthodonticBrandingDate() {
        return dtp03OrthodonticBrandingDate;
    }

    @JsonProperty("dtp03_orthodonticBrandingDate")
    public void setDtp03OrthodonticBrandingDate(String dtp03OrthodonticBrandingDate) {
        this.dtp03OrthodonticBrandingDate = dtp03OrthodonticBrandingDate;
    }

    public ClaimInfo withDtp03OrthodonticBrandingDate(String dtp03OrthodonticBrandingDate) {
        this.dtp03OrthodonticBrandingDate = dtp03OrthodonticBrandingDate;
        return this;
    }

    @JsonProperty("dtp01_serviceDateQlfr")
    public String getDtp01ServiceDateQlfr() {
        return dtp01ServiceDateQlfr;
    }

    @JsonProperty("dtp01_serviceDateQlfr")
    public void setDtp01ServiceDateQlfr(String dtp01ServiceDateQlfr) {
        this.dtp01ServiceDateQlfr = dtp01ServiceDateQlfr;
    }

    public ClaimInfo withDtp01ServiceDateQlfr(String dtp01ServiceDateQlfr) {
        this.dtp01ServiceDateQlfr = dtp01ServiceDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_serviceDateFormatQlfr")
    public String getDtp02ServiceDateFormatQlfr() {
        return dtp02ServiceDateFormatQlfr;
    }

    @JsonProperty("dtp02_serviceDateFormatQlfr")
    public void setDtp02ServiceDateFormatQlfr(String dtp02ServiceDateFormatQlfr) {
        this.dtp02ServiceDateFormatQlfr = dtp02ServiceDateFormatQlfr;
    }

    public ClaimInfo withDtp02ServiceDateFormatQlfr(String dtp02ServiceDateFormatQlfr) {
        this.dtp02ServiceDateFormatQlfr = dtp02ServiceDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_serviceDate")
    public String getDtp03ServiceDate() {
        return dtp03ServiceDate;
    }

    @JsonProperty("dtp03_serviceDate")
    public void setDtp03ServiceDate(String dtp03ServiceDate) {
        this.dtp03ServiceDate = dtp03ServiceDate;
    }

    public ClaimInfo withDtp03ServiceDate(String dtp03ServiceDate) {
        this.dtp03ServiceDate = dtp03ServiceDate;
        return this;
    }

    @JsonProperty("dtp01_repricerReceivedDate")
    public String getDtp01RepricerReceivedDate() {
        return dtp01RepricerReceivedDate;
    }

    @JsonProperty("dtp01_repricerReceivedDate")
    public void setDtp01RepricerReceivedDate(String dtp01RepricerReceivedDate) {
        this.dtp01RepricerReceivedDate = dtp01RepricerReceivedDate;
    }

    public ClaimInfo withDtp01RepricerReceivedDate(String dtp01RepricerReceivedDate) {
        this.dtp01RepricerReceivedDate = dtp01RepricerReceivedDate;
        return this;
    }

    @JsonProperty("dtp02_repricerReceivedDateFormatQlfr")
    public String getDtp02RepricerReceivedDateFormatQlfr() {
        return dtp02RepricerReceivedDateFormatQlfr;
    }

    @JsonProperty("dtp02_repricerReceivedDateFormatQlfr")
    public void setDtp02RepricerReceivedDateFormatQlfr(String dtp02RepricerReceivedDateFormatQlfr) {
        this.dtp02RepricerReceivedDateFormatQlfr = dtp02RepricerReceivedDateFormatQlfr;
    }

    public ClaimInfo withDtp02RepricerReceivedDateFormatQlfr(String dtp02RepricerReceivedDateFormatQlfr) {
        this.dtp02RepricerReceivedDateFormatQlfr = dtp02RepricerReceivedDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_repricerReceivedDate")
    public String getDtp03RepricerReceivedDate() {
        return dtp03RepricerReceivedDate;
    }

    @JsonProperty("dtp03_repricerReceivedDate")
    public void setDtp03RepricerReceivedDate(String dtp03RepricerReceivedDate) {
        this.dtp03RepricerReceivedDate = dtp03RepricerReceivedDate;
    }

    public ClaimInfo withDtp03RepricerReceivedDate(String dtp03RepricerReceivedDate) {
        this.dtp03RepricerReceivedDate = dtp03RepricerReceivedDate;
        return this;
    }

    @JsonProperty("cl101_admissionTypeCode")
    public String getCl101AdmissionTypeCode() {
        return cl101AdmissionTypeCode;
    }

    @JsonProperty("cl101_admissionTypeCode")
    public void setCl101AdmissionTypeCode(String cl101AdmissionTypeCode) {
        this.cl101AdmissionTypeCode = cl101AdmissionTypeCode;
    }

    public ClaimInfo withCl101AdmissionTypeCode(String cl101AdmissionTypeCode) {
        this.cl101AdmissionTypeCode = cl101AdmissionTypeCode;
        return this;
    }

    @JsonProperty("cl102_admissionSourceCode")
    public String getCl102AdmissionSourceCode() {
        return cl102AdmissionSourceCode;
    }

    @JsonProperty("cl102_admissionSourceCode")
    public void setCl102AdmissionSourceCode(String cl102AdmissionSourceCode) {
        this.cl102AdmissionSourceCode = cl102AdmissionSourceCode;
    }

    public ClaimInfo withCl102AdmissionSourceCode(String cl102AdmissionSourceCode) {
        this.cl102AdmissionSourceCode = cl102AdmissionSourceCode;
        return this;
    }

    @JsonProperty("cl103_patientStatusCode")
    public String getCl103PatientStatusCode() {
        return cl103PatientStatusCode;
    }

    @JsonProperty("cl103_patientStatusCode")
    public void setCl103PatientStatusCode(String cl103PatientStatusCode) {
        this.cl103PatientStatusCode = cl103PatientStatusCode;
    }

    public ClaimInfo withCl103PatientStatusCode(String cl103PatientStatusCode) {
        this.cl103PatientStatusCode = cl103PatientStatusCode;
        return this;
    }

    @JsonProperty("dn101_orthoDonticTreatmentMonthsCount")
    public String getDn101OrthoDonticTreatmentMonthsCount() {
        return dn101OrthoDonticTreatmentMonthsCount;
    }

    @JsonProperty("dn101_orthoDonticTreatmentMonthsCount")
    public void setDn101OrthoDonticTreatmentMonthsCount(String dn101OrthoDonticTreatmentMonthsCount) {
        this.dn101OrthoDonticTreatmentMonthsCount = dn101OrthoDonticTreatmentMonthsCount;
    }

    public ClaimInfo withDn101OrthoDonticTreatmentMonthsCount(String dn101OrthoDonticTreatmentMonthsCount) {
        this.dn101OrthoDonticTreatmentMonthsCount = dn101OrthoDonticTreatmentMonthsCount;
        return this;
    }

    @JsonProperty("dn102_orthoDonticTreatmentMonthsRemainingCount")
    public String getDn102OrthoDonticTreatmentMonthsRemainingCount() {
        return dn102OrthoDonticTreatmentMonthsRemainingCount;
    }

    @JsonProperty("dn102_orthoDonticTreatmentMonthsRemainingCount")
    public void setDn102OrthoDonticTreatmentMonthsRemainingCount(String dn102OrthoDonticTreatmentMonthsRemainingCount) {
        this.dn102OrthoDonticTreatmentMonthsRemainingCount = dn102OrthoDonticTreatmentMonthsRemainingCount;
    }

    public ClaimInfo withDn102OrthoDonticTreatmentMonthsRemainingCount(String dn102OrthoDonticTreatmentMonthsRemainingCount) {
        this.dn102OrthoDonticTreatmentMonthsRemainingCount = dn102OrthoDonticTreatmentMonthsRemainingCount;
        return this;
    }

    @JsonProperty("dn104_orthoDonticTreatmentIndicator")
    public String getDn104OrthoDonticTreatmentIndicator() {
        return dn104OrthoDonticTreatmentIndicator;
    }

    @JsonProperty("dn104_orthoDonticTreatmentIndicator")
    public void setDn104OrthoDonticTreatmentIndicator(String dn104OrthoDonticTreatmentIndicator) {
        this.dn104OrthoDonticTreatmentIndicator = dn104OrthoDonticTreatmentIndicator;
    }

    public ClaimInfo withDn104OrthoDonticTreatmentIndicator(String dn104OrthoDonticTreatmentIndicator) {
        this.dn104OrthoDonticTreatmentIndicator = dn104OrthoDonticTreatmentIndicator;
        return this;
    }

    @JsonProperty("dn2_toothStatus")
    public List<Dn2Toothstatus> getDn2ToothStatus() {
        return dn2ToothStatus;
    }

    @JsonProperty("dn2_toothStatus")
    public void setDn2ToothStatus(List<Dn2Toothstatus> dn2ToothStatus) {
        this.dn2ToothStatus = dn2ToothStatus;
    }

    public ClaimInfo withDn2ToothStatus(List<Dn2Toothstatus> dn2ToothStatus) {
        this.dn2ToothStatus = dn2ToothStatus;
        return this;
    }

    @JsonProperty("pwk_claimSupplementInformation")
    public List<PwkClaimSupplementInformation> getPwkClaimSupplementInformation() {
        return pwkClaimSupplementInformation;
    }

    @JsonProperty("pwk_claimSupplementInformation")
    public void setPwkClaimSupplementInformation(List<PwkClaimSupplementInformation> pwkClaimSupplementInformation) {
        this.pwkClaimSupplementInformation = pwkClaimSupplementInformation;
    }

    public ClaimInfo withPwkClaimSupplementInformation(List<PwkClaimSupplementInformation> pwkClaimSupplementInformation) {
        this.pwkClaimSupplementInformation = pwkClaimSupplementInformation;
        return this;
    }

    @JsonProperty("cn101_contractTypeCode")
    public String getCn101ContractTypeCode() {
        return cn101ContractTypeCode;
    }

    @JsonProperty("cn101_contractTypeCode")
    public void setCn101ContractTypeCode(String cn101ContractTypeCode) {
        this.cn101ContractTypeCode = cn101ContractTypeCode;
    }

    public ClaimInfo withCn101ContractTypeCode(String cn101ContractTypeCode) {
        this.cn101ContractTypeCode = cn101ContractTypeCode;
        return this;
    }

    @JsonProperty("cn102_contractAmount")
    public String getCn102ContractAmount() {
        return cn102ContractAmount;
    }

    @JsonProperty("cn102_contractAmount")
    public void setCn102ContractAmount(String cn102ContractAmount) {
        this.cn102ContractAmount = cn102ContractAmount;
    }

    public ClaimInfo withCn102ContractAmount(String cn102ContractAmount) {
        this.cn102ContractAmount = cn102ContractAmount;
        return this;
    }

    @JsonProperty("cn103_contractPercentage")
    public String getCn103ContractPercentage() {
        return cn103ContractPercentage;
    }

    @JsonProperty("cn103_contractPercentage")
    public void setCn103ContractPercentage(String cn103ContractPercentage) {
        this.cn103ContractPercentage = cn103ContractPercentage;
    }

    public ClaimInfo withCn103ContractPercentage(String cn103ContractPercentage) {
        this.cn103ContractPercentage = cn103ContractPercentage;
        return this;
    }

    @JsonProperty("cn104_contractCode")
    public String getCn104ContractCode() {
        return cn104ContractCode;
    }

    @JsonProperty("cn104_contractCode")
    public void setCn104ContractCode(String cn104ContractCode) {
        this.cn104ContractCode = cn104ContractCode;
    }

    public ClaimInfo withCn104ContractCode(String cn104ContractCode) {
        this.cn104ContractCode = cn104ContractCode;
        return this;
    }

    @JsonProperty("cn105_termsDiscountPercent")
    public String getCn105TermsDiscountPercent() {
        return cn105TermsDiscountPercent;
    }

    @JsonProperty("cn105_termsDiscountPercent")
    public void setCn105TermsDiscountPercent(String cn105TermsDiscountPercent) {
        this.cn105TermsDiscountPercent = cn105TermsDiscountPercent;
    }

    public ClaimInfo withCn105TermsDiscountPercent(String cn105TermsDiscountPercent) {
        this.cn105TermsDiscountPercent = cn105TermsDiscountPercent;
        return this;
    }

    @JsonProperty("cn106_contractVersionIdentifier")
    public String getCn106ContractVersionIdentifier() {
        return cn106ContractVersionIdentifier;
    }

    @JsonProperty("cn106_contractVersionIdentifier")
    public void setCn106ContractVersionIdentifier(String cn106ContractVersionIdentifier) {
        this.cn106ContractVersionIdentifier = cn106ContractVersionIdentifier;
    }

    public ClaimInfo withCn106ContractVersionIdentifier(String cn106ContractVersionIdentifier) {
        this.cn106ContractVersionIdentifier = cn106ContractVersionIdentifier;
        return this;
    }

    @JsonProperty("amt01_patientAmountQlfrCode")
    public String getAmt01PatientAmountQlfrCode() {
        return amt01PatientAmountQlfrCode;
    }

    @JsonProperty("amt01_patientAmountQlfrCode")
    public void setAmt01PatientAmountQlfrCode(String amt01PatientAmountQlfrCode) {
        this.amt01PatientAmountQlfrCode = amt01PatientAmountQlfrCode;
    }

    public ClaimInfo withAmt01PatientAmountQlfrCode(String amt01PatientAmountQlfrCode) {
        this.amt01PatientAmountQlfrCode = amt01PatientAmountQlfrCode;
        return this;
    }

    @JsonProperty("amt02_patientAmountPaid")
    public String getAmt02PatientAmountPaid() {
        return amt02PatientAmountPaid;
    }

    @JsonProperty("amt02_patientAmountPaid")
    public void setAmt02PatientAmountPaid(String amt02PatientAmountPaid) {
        this.amt02PatientAmountPaid = amt02PatientAmountPaid;
    }

    public ClaimInfo withAmt02PatientAmountPaid(String amt02PatientAmountPaid) {
        this.amt02PatientAmountPaid = amt02PatientAmountPaid;
        return this;
    }

    @JsonProperty("amt01_patientResponsibilityCode")
    public String getAmt01PatientResponsibilityCode() {
        return amt01PatientResponsibilityCode;
    }

    @JsonProperty("amt01_patientResponsibilityCode")
    public void setAmt01PatientResponsibilityCode(String amt01PatientResponsibilityCode) {
        this.amt01PatientResponsibilityCode = amt01PatientResponsibilityCode;
    }

    public ClaimInfo withAmt01PatientResponsibilityCode(String amt01PatientResponsibilityCode) {
        this.amt01PatientResponsibilityCode = amt01PatientResponsibilityCode;
        return this;
    }

    @JsonProperty("amt02_patientResponsibilityAmount")
    public String getAmt02PatientResponsibilityAmount() {
        return amt02PatientResponsibilityAmount;
    }

    @JsonProperty("amt02_patientResponsibilityAmount")
    public void setAmt02PatientResponsibilityAmount(String amt02PatientResponsibilityAmount) {
        this.amt02PatientResponsibilityAmount = amt02PatientResponsibilityAmount;
    }

    public ClaimInfo withAmt02PatientResponsibilityAmount(String amt02PatientResponsibilityAmount) {
        this.amt02PatientResponsibilityAmount = amt02PatientResponsibilityAmount;
        return this;
    }

    @JsonProperty("ref01_predeterminationOfBenefitsIdentificationNo")
    public String getRef01PredeterminationOfBenefitsIdentificationNo() {
        return ref01PredeterminationOfBenefitsIdentificationNo;
    }

    @JsonProperty("ref01_predeterminationOfBenefitsIdentificationNo")
    public void setRef01PredeterminationOfBenefitsIdentificationNo(String ref01PredeterminationOfBenefitsIdentificationNo) {
        this.ref01PredeterminationOfBenefitsIdentificationNo = ref01PredeterminationOfBenefitsIdentificationNo;
    }

    public ClaimInfo withRef01PredeterminationOfBenefitsIdentificationNo(String ref01PredeterminationOfBenefitsIdentificationNo) {
        this.ref01PredeterminationOfBenefitsIdentificationNo = ref01PredeterminationOfBenefitsIdentificationNo;
        return this;
    }

    @JsonProperty("ref02_predeterminationOfBenefitsIdentifier")
    public String getRef02PredeterminationOfBenefitsIdentifier() {
        return ref02PredeterminationOfBenefitsIdentifier;
    }

    @JsonProperty("ref02_predeterminationOfBenefitsIdentifier")
    public void setRef02PredeterminationOfBenefitsIdentifier(String ref02PredeterminationOfBenefitsIdentifier) {
        this.ref02PredeterminationOfBenefitsIdentifier = ref02PredeterminationOfBenefitsIdentifier;
    }

    public ClaimInfo withRef02PredeterminationOfBenefitsIdentifier(String ref02PredeterminationOfBenefitsIdentifier) {
        this.ref02PredeterminationOfBenefitsIdentifier = ref02PredeterminationOfBenefitsIdentifier;
        return this;
    }

    @JsonProperty("ref01_specialPaymentReferenceNoQlfr")
    public String getRef01SpecialPaymentReferenceNoQlfr() {
        return ref01SpecialPaymentReferenceNoQlfr;
    }

    @JsonProperty("ref01_specialPaymentReferenceNoQlfr")
    public void setRef01SpecialPaymentReferenceNoQlfr(String ref01SpecialPaymentReferenceNoQlfr) {
        this.ref01SpecialPaymentReferenceNoQlfr = ref01SpecialPaymentReferenceNoQlfr;
    }

    public ClaimInfo withRef01SpecialPaymentReferenceNoQlfr(String ref01SpecialPaymentReferenceNoQlfr) {
        this.ref01SpecialPaymentReferenceNoQlfr = ref01SpecialPaymentReferenceNoQlfr;
        return this;
    }

    @JsonProperty("ref02_specialPaymentReferenceNo")
    public String getRef02SpecialPaymentReferenceNo() {
        return ref02SpecialPaymentReferenceNo;
    }

    @JsonProperty("ref02_specialPaymentReferenceNo")
    public void setRef02SpecialPaymentReferenceNo(String ref02SpecialPaymentReferenceNo) {
        this.ref02SpecialPaymentReferenceNo = ref02SpecialPaymentReferenceNo;
    }

    public ClaimInfo withRef02SpecialPaymentReferenceNo(String ref02SpecialPaymentReferenceNo) {
        this.ref02SpecialPaymentReferenceNo = ref02SpecialPaymentReferenceNo;
        return this;
    }

    @JsonProperty("ref01_medicareVersionCodeQlfr")
    public String getRef01MedicareVersionCodeQlfr() {
        return ref01MedicareVersionCodeQlfr;
    }

    @JsonProperty("ref01_medicareVersionCodeQlfr")
    public void setRef01MedicareVersionCodeQlfr(String ref01MedicareVersionCodeQlfr) {
        this.ref01MedicareVersionCodeQlfr = ref01MedicareVersionCodeQlfr;
    }

    public ClaimInfo withRef01MedicareVersionCodeQlfr(String ref01MedicareVersionCodeQlfr) {
        this.ref01MedicareVersionCodeQlfr = ref01MedicareVersionCodeQlfr;
        return this;
    }

    @JsonProperty("ref02_medicareVersionCode")
    public String getRef02MedicareVersionCode() {
        return ref02MedicareVersionCode;
    }

    @JsonProperty("ref02_medicareVersionCode")
    public void setRef02MedicareVersionCode(String ref02MedicareVersionCode) {
        this.ref02MedicareVersionCode = ref02MedicareVersionCode;
    }

    public ClaimInfo withRef02MedicareVersionCode(String ref02MedicareVersionCode) {
        this.ref02MedicareVersionCode = ref02MedicareVersionCode;
        return this;
    }

    @JsonProperty("ref01_mammographyCertificationNoQlfr")
    public String getRef01MammographyCertificationNoQlfr() {
        return ref01MammographyCertificationNoQlfr;
    }

    @JsonProperty("ref01_mammographyCertificationNoQlfr")
    public void setRef01MammographyCertificationNoQlfr(String ref01MammographyCertificationNoQlfr) {
        this.ref01MammographyCertificationNoQlfr = ref01MammographyCertificationNoQlfr;
    }

    public ClaimInfo withRef01MammographyCertificationNoQlfr(String ref01MammographyCertificationNoQlfr) {
        this.ref01MammographyCertificationNoQlfr = ref01MammographyCertificationNoQlfr;
        return this;
    }

    @JsonProperty("ref02_mammographyCertificationNo")
    public String getRef02MammographyCertificationNo() {
        return ref02MammographyCertificationNo;
    }

    @JsonProperty("ref02_mammographyCertificationNo")
    public void setRef02MammographyCertificationNo(String ref02MammographyCertificationNo) {
        this.ref02MammographyCertificationNo = ref02MammographyCertificationNo;
    }

    public ClaimInfo withRef02MammographyCertificationNo(String ref02MammographyCertificationNo) {
        this.ref02MammographyCertificationNo = ref02MammographyCertificationNo;
        return this;
    }

    @JsonProperty("ref01_referralNoQlfr")
    public String getRef01ReferralNoQlfr() {
        return ref01ReferralNoQlfr;
    }

    @JsonProperty("ref01_referralNoQlfr")
    public void setRef01ReferralNoQlfr(String ref01ReferralNoQlfr) {
        this.ref01ReferralNoQlfr = ref01ReferralNoQlfr;
    }

    public ClaimInfo withRef01ReferralNoQlfr(String ref01ReferralNoQlfr) {
        this.ref01ReferralNoQlfr = ref01ReferralNoQlfr;
        return this;
    }

    @JsonProperty("ref02_referralNo")
    public String getRef02ReferralNo() {
        return ref02ReferralNo;
    }

    @JsonProperty("ref02_referralNo")
    public void setRef02ReferralNo(String ref02ReferralNo) {
        this.ref02ReferralNo = ref02ReferralNo;
    }

    public ClaimInfo withRef02ReferralNo(String ref02ReferralNo) {
        this.ref02ReferralNo = ref02ReferralNo;
        return this;
    }

    @JsonProperty("ref01_priorAuthorizationNoQlfr")
    public String getRef01PriorAuthorizationNoQlfr() {
        return ref01PriorAuthorizationNoQlfr;
    }

    @JsonProperty("ref01_priorAuthorizationNoQlfr")
    public void setRef01PriorAuthorizationNoQlfr(String ref01PriorAuthorizationNoQlfr) {
        this.ref01PriorAuthorizationNoQlfr = ref01PriorAuthorizationNoQlfr;
    }

    public ClaimInfo withRef01PriorAuthorizationNoQlfr(String ref01PriorAuthorizationNoQlfr) {
        this.ref01PriorAuthorizationNoQlfr = ref01PriorAuthorizationNoQlfr;
        return this;
    }

    @JsonProperty("ref02_priorAuthorizationNo")
    public String getRef02PriorAuthorizationNo() {
        return ref02PriorAuthorizationNo;
    }

    @JsonProperty("ref02_priorAuthorizationNo")
    public void setRef02PriorAuthorizationNo(String ref02PriorAuthorizationNo) {
        this.ref02PriorAuthorizationNo = ref02PriorAuthorizationNo;
    }

    public ClaimInfo withRef02PriorAuthorizationNo(String ref02PriorAuthorizationNo) {
        this.ref02PriorAuthorizationNo = ref02PriorAuthorizationNo;
        return this;
    }

    @JsonProperty("ref01_payerClaimControlNoQlfr")
    public String getRef01PayerClaimControlNoQlfr() {
        return ref01PayerClaimControlNoQlfr;
    }

    @JsonProperty("ref01_payerClaimControlNoQlfr")
    public void setRef01PayerClaimControlNoQlfr(String ref01PayerClaimControlNoQlfr) {
        this.ref01PayerClaimControlNoQlfr = ref01PayerClaimControlNoQlfr;
    }

    public ClaimInfo withRef01PayerClaimControlNoQlfr(String ref01PayerClaimControlNoQlfr) {
        this.ref01PayerClaimControlNoQlfr = ref01PayerClaimControlNoQlfr;
        return this;
    }

    @JsonProperty("ref02_payerClaimControlNo")
    public String getRef02PayerClaimControlNo() {
        return ref02PayerClaimControlNo;
    }

    @JsonProperty("ref02_payerClaimControlNo")
    public void setRef02PayerClaimControlNo(String ref02PayerClaimControlNo) {
        this.ref02PayerClaimControlNo = ref02PayerClaimControlNo;
    }

    public ClaimInfo withRef02PayerClaimControlNo(String ref02PayerClaimControlNo) {
        this.ref02PayerClaimControlNo = ref02PayerClaimControlNo;
        return this;
    }

    @JsonProperty("ref01_clinicalLabAmendmentNoQlfr")
    public String getRef01ClinicalLabAmendmentNoQlfr() {
        return ref01ClinicalLabAmendmentNoQlfr;
    }

    @JsonProperty("ref01_clinicalLabAmendmentNoQlfr")
    public void setRef01ClinicalLabAmendmentNoQlfr(String ref01ClinicalLabAmendmentNoQlfr) {
        this.ref01ClinicalLabAmendmentNoQlfr = ref01ClinicalLabAmendmentNoQlfr;
    }

    public ClaimInfo withRef01ClinicalLabAmendmentNoQlfr(String ref01ClinicalLabAmendmentNoQlfr) {
        this.ref01ClinicalLabAmendmentNoQlfr = ref01ClinicalLabAmendmentNoQlfr;
        return this;
    }

    @JsonProperty("ref02_clinicalLabAmendmentNo")
    public String getRef02ClinicalLabAmendmentNo() {
        return ref02ClinicalLabAmendmentNo;
    }

    @JsonProperty("ref02_clinicalLabAmendmentNo")
    public void setRef02ClinicalLabAmendmentNo(String ref02ClinicalLabAmendmentNo) {
        this.ref02ClinicalLabAmendmentNo = ref02ClinicalLabAmendmentNo;
    }

    public ClaimInfo withRef02ClinicalLabAmendmentNo(String ref02ClinicalLabAmendmentNo) {
        this.ref02ClinicalLabAmendmentNo = ref02ClinicalLabAmendmentNo;
        return this;
    }

    @JsonProperty("ref01_repricedClaimReferenceNoQlfr")
    public String getRef01RepricedClaimReferenceNoQlfr() {
        return ref01RepricedClaimReferenceNoQlfr;
    }

    @JsonProperty("ref01_repricedClaimReferenceNoQlfr")
    public void setRef01RepricedClaimReferenceNoQlfr(String ref01RepricedClaimReferenceNoQlfr) {
        this.ref01RepricedClaimReferenceNoQlfr = ref01RepricedClaimReferenceNoQlfr;
    }

    public ClaimInfo withRef01RepricedClaimReferenceNoQlfr(String ref01RepricedClaimReferenceNoQlfr) {
        this.ref01RepricedClaimReferenceNoQlfr = ref01RepricedClaimReferenceNoQlfr;
        return this;
    }

    @JsonProperty("ref02_repricedClaimReferenceNo")
    public String getRef02RepricedClaimReferenceNo() {
        return ref02RepricedClaimReferenceNo;
    }

    @JsonProperty("ref02_repricedClaimReferenceNo")
    public void setRef02RepricedClaimReferenceNo(String ref02RepricedClaimReferenceNo) {
        this.ref02RepricedClaimReferenceNo = ref02RepricedClaimReferenceNo;
    }

    public ClaimInfo withRef02RepricedClaimReferenceNo(String ref02RepricedClaimReferenceNo) {
        this.ref02RepricedClaimReferenceNo = ref02RepricedClaimReferenceNo;
        return this;
    }

    @JsonProperty("ref01_adjustedRepricedClaimRefNoQlfr")
    public String getRef01AdjustedRepricedClaimRefNoQlfr() {
        return ref01AdjustedRepricedClaimRefNoQlfr;
    }

    @JsonProperty("ref01_adjustedRepricedClaimRefNoQlfr")
    public void setRef01AdjustedRepricedClaimRefNoQlfr(String ref01AdjustedRepricedClaimRefNoQlfr) {
        this.ref01AdjustedRepricedClaimRefNoQlfr = ref01AdjustedRepricedClaimRefNoQlfr;
    }

    public ClaimInfo withRef01AdjustedRepricedClaimRefNoQlfr(String ref01AdjustedRepricedClaimRefNoQlfr) {
        this.ref01AdjustedRepricedClaimRefNoQlfr = ref01AdjustedRepricedClaimRefNoQlfr;
        return this;
    }

    @JsonProperty("ref02_adjustedRepricedClaimRefNo")
    public String getRef02AdjustedRepricedClaimRefNo() {
        return ref02AdjustedRepricedClaimRefNo;
    }

    @JsonProperty("ref02_adjustedRepricedClaimRefNo")
    public void setRef02AdjustedRepricedClaimRefNo(String ref02AdjustedRepricedClaimRefNo) {
        this.ref02AdjustedRepricedClaimRefNo = ref02AdjustedRepricedClaimRefNo;
    }

    public ClaimInfo withRef02AdjustedRepricedClaimRefNo(String ref02AdjustedRepricedClaimRefNo) {
        this.ref02AdjustedRepricedClaimRefNo = ref02AdjustedRepricedClaimRefNo;
        return this;
    }

    @JsonProperty("ref_predeterminationOfBenefitsIdentification")
    public RefPredeterminationOfBenefitsIdentification getRefPredeterminationOfBenefitsIdentification() {
        return refPredeterminationOfBenefitsIdentification;
    }

    @JsonProperty("ref_predeterminationOfBenefitsIdentification")
    public void setRefPredeterminationOfBenefitsIdentification(RefPredeterminationOfBenefitsIdentification refPredeterminationOfBenefitsIdentification) {
        this.refPredeterminationOfBenefitsIdentification = refPredeterminationOfBenefitsIdentification;
    }

    public ClaimInfo withRefPredeterminationOfBenefitsIdentification(RefPredeterminationOfBenefitsIdentification refPredeterminationOfBenefitsIdentification) {
        this.refPredeterminationOfBenefitsIdentification = refPredeterminationOfBenefitsIdentification;
        return this;
    }

    @JsonProperty("ref_investigationalDeviceExcemption")
    public List<RefInvestigationalDeviceExcemption> getRefInvestigationalDeviceExcemption() {
        return refInvestigationalDeviceExcemption;
    }

    @JsonProperty("ref_investigationalDeviceExcemption")
    public void setRefInvestigationalDeviceExcemption(List<RefInvestigationalDeviceExcemption> refInvestigationalDeviceExcemption) {
        this.refInvestigationalDeviceExcemption = refInvestigationalDeviceExcemption;
    }

    public ClaimInfo withRefInvestigationalDeviceExcemption(List<RefInvestigationalDeviceExcemption> refInvestigationalDeviceExcemption) {
        this.refInvestigationalDeviceExcemption = refInvestigationalDeviceExcemption;
        return this;
    }

    @JsonProperty("ref01_valueAddedNetworkTraceNoQlfr")
    public String getRef01ValueAddedNetworkTraceNoQlfr() {
        return ref01ValueAddedNetworkTraceNoQlfr;
    }

    @JsonProperty("ref01_valueAddedNetworkTraceNoQlfr")
    public void setRef01ValueAddedNetworkTraceNoQlfr(String ref01ValueAddedNetworkTraceNoQlfr) {
        this.ref01ValueAddedNetworkTraceNoQlfr = ref01ValueAddedNetworkTraceNoQlfr;
    }

    public ClaimInfo withRef01ValueAddedNetworkTraceNoQlfr(String ref01ValueAddedNetworkTraceNoQlfr) {
        this.ref01ValueAddedNetworkTraceNoQlfr = ref01ValueAddedNetworkTraceNoQlfr;
        return this;
    }

    @JsonProperty("ref02_valueAddedNetworkTraceNo")
    public String getRef02ValueAddedNetworkTraceNo() {
        return ref02ValueAddedNetworkTraceNo;
    }

    @JsonProperty("ref02_valueAddedNetworkTraceNo")
    public void setRef02ValueAddedNetworkTraceNo(String ref02ValueAddedNetworkTraceNo) {
        this.ref02ValueAddedNetworkTraceNo = ref02ValueAddedNetworkTraceNo;
    }

    public ClaimInfo withRef02ValueAddedNetworkTraceNo(String ref02ValueAddedNetworkTraceNo) {
        this.ref02ValueAddedNetworkTraceNo = ref02ValueAddedNetworkTraceNo;
        return this;
    }

    @JsonProperty("ref01_autoAccidentStateOrProvinceQlfr")
    public String getRef01AutoAccidentStateOrProvinceQlfr() {
        return ref01AutoAccidentStateOrProvinceQlfr;
    }

    @JsonProperty("ref01_autoAccidentStateOrProvinceQlfr")
    public void setRef01AutoAccidentStateOrProvinceQlfr(String ref01AutoAccidentStateOrProvinceQlfr) {
        this.ref01AutoAccidentStateOrProvinceQlfr = ref01AutoAccidentStateOrProvinceQlfr;
    }

    public ClaimInfo withRef01AutoAccidentStateOrProvinceQlfr(String ref01AutoAccidentStateOrProvinceQlfr) {
        this.ref01AutoAccidentStateOrProvinceQlfr = ref01AutoAccidentStateOrProvinceQlfr;
        return this;
    }

    @JsonProperty("ref02_autoAccidentStateOrProvinceCode")
    public String getRef02AutoAccidentStateOrProvinceCode() {
        return ref02AutoAccidentStateOrProvinceCode;
    }

    @JsonProperty("ref02_autoAccidentStateOrProvinceCode")
    public void setRef02AutoAccidentStateOrProvinceCode(String ref02AutoAccidentStateOrProvinceCode) {
        this.ref02AutoAccidentStateOrProvinceCode = ref02AutoAccidentStateOrProvinceCode;
    }

    public ClaimInfo withRef02AutoAccidentStateOrProvinceCode(String ref02AutoAccidentStateOrProvinceCode) {
        this.ref02AutoAccidentStateOrProvinceCode = ref02AutoAccidentStateOrProvinceCode;
        return this;
    }

    @JsonProperty("ref01_medicalRecordNoQlfr")
    public String getRef01MedicalRecordNoQlfr() {
        return ref01MedicalRecordNoQlfr;
    }

    @JsonProperty("ref01_medicalRecordNoQlfr")
    public void setRef01MedicalRecordNoQlfr(String ref01MedicalRecordNoQlfr) {
        this.ref01MedicalRecordNoQlfr = ref01MedicalRecordNoQlfr;
    }

    public ClaimInfo withRef01MedicalRecordNoQlfr(String ref01MedicalRecordNoQlfr) {
        this.ref01MedicalRecordNoQlfr = ref01MedicalRecordNoQlfr;
        return this;
    }

    @JsonProperty("ref02_medicalRecordNo")
    public String getRef02MedicalRecordNo() {
        return ref02MedicalRecordNo;
    }

    @JsonProperty("ref02_medicalRecordNo")
    public void setRef02MedicalRecordNo(String ref02MedicalRecordNo) {
        this.ref02MedicalRecordNo = ref02MedicalRecordNo;
    }

    public ClaimInfo withRef02MedicalRecordNo(String ref02MedicalRecordNo) {
        this.ref02MedicalRecordNo = ref02MedicalRecordNo;
        return this;
    }

    @JsonProperty("ref01_demonstrationProjectIdentifierQlfr")
    public String getRef01DemonstrationProjectIdentifierQlfr() {
        return ref01DemonstrationProjectIdentifierQlfr;
    }

    @JsonProperty("ref01_demonstrationProjectIdentifierQlfr")
    public void setRef01DemonstrationProjectIdentifierQlfr(String ref01DemonstrationProjectIdentifierQlfr) {
        this.ref01DemonstrationProjectIdentifierQlfr = ref01DemonstrationProjectIdentifierQlfr;
    }

    public ClaimInfo withRef01DemonstrationProjectIdentifierQlfr(String ref01DemonstrationProjectIdentifierQlfr) {
        this.ref01DemonstrationProjectIdentifierQlfr = ref01DemonstrationProjectIdentifierQlfr;
        return this;
    }

    @JsonProperty("ref02_demonstrationProjectIdentifier")
    public String getRef02DemonstrationProjectIdentifier() {
        return ref02DemonstrationProjectIdentifier;
    }

    @JsonProperty("ref02_demonstrationProjectIdentifier")
    public void setRef02DemonstrationProjectIdentifier(String ref02DemonstrationProjectIdentifier) {
        this.ref02DemonstrationProjectIdentifier = ref02DemonstrationProjectIdentifier;
    }

    public ClaimInfo withRef02DemonstrationProjectIdentifier(String ref02DemonstrationProjectIdentifier) {
        this.ref02DemonstrationProjectIdentifier = ref02DemonstrationProjectIdentifier;
        return this;
    }

    @JsonProperty("ref01_carePlanOversightNoQlfr")
    public String getRef01CarePlanOversightNoQlfr() {
        return ref01CarePlanOversightNoQlfr;
    }

    @JsonProperty("ref01_carePlanOversightNoQlfr")
    public void setRef01CarePlanOversightNoQlfr(String ref01CarePlanOversightNoQlfr) {
        this.ref01CarePlanOversightNoQlfr = ref01CarePlanOversightNoQlfr;
    }

    public ClaimInfo withRef01CarePlanOversightNoQlfr(String ref01CarePlanOversightNoQlfr) {
        this.ref01CarePlanOversightNoQlfr = ref01CarePlanOversightNoQlfr;
        return this;
    }

    @JsonProperty("ref02_carePlanOversightNo")
    public String getRef02CarePlanOversightNo() {
        return ref02CarePlanOversightNo;
    }

    @JsonProperty("ref02_carePlanOversightNo")
    public void setRef02CarePlanOversightNo(String ref02CarePlanOversightNo) {
        this.ref02CarePlanOversightNo = ref02CarePlanOversightNo;
    }

    public ClaimInfo withRef02CarePlanOversightNo(String ref02CarePlanOversightNo) {
        this.ref02CarePlanOversightNo = ref02CarePlanOversightNo;
        return this;
    }

    @JsonProperty("ref01_peerReviewAuthorizationNoQlfr")
    public String getRef01PeerReviewAuthorizationNoQlfr() {
        return ref01PeerReviewAuthorizationNoQlfr;
    }

    @JsonProperty("ref01_peerReviewAuthorizationNoQlfr")
    public void setRef01PeerReviewAuthorizationNoQlfr(String ref01PeerReviewAuthorizationNoQlfr) {
        this.ref01PeerReviewAuthorizationNoQlfr = ref01PeerReviewAuthorizationNoQlfr;
    }

    public ClaimInfo withRef01PeerReviewAuthorizationNoQlfr(String ref01PeerReviewAuthorizationNoQlfr) {
        this.ref01PeerReviewAuthorizationNoQlfr = ref01PeerReviewAuthorizationNoQlfr;
        return this;
    }

    @JsonProperty("ref02_peerReviewAuthorizationNo")
    public String getRef02PeerReviewAuthorizationNo() {
        return ref02PeerReviewAuthorizationNo;
    }

    @JsonProperty("ref02_peerReviewAuthorizationNo")
    public void setRef02PeerReviewAuthorizationNo(String ref02PeerReviewAuthorizationNo) {
        this.ref02PeerReviewAuthorizationNo = ref02PeerReviewAuthorizationNo;
    }

    public ClaimInfo withRef02PeerReviewAuthorizationNo(String ref02PeerReviewAuthorizationNo) {
        this.ref02PeerReviewAuthorizationNo = ref02PeerReviewAuthorizationNo;
        return this;
    }

    @JsonProperty("k3fileInformation")
    public List<List<K3fileInformation>> getK3fileInformation() {
        return k3fileInformation;
    }

    @JsonProperty("k3fileInformation")
    public void setK3fileInformation(List<List<K3fileInformation>> k3fileInformation) {
        this.k3fileInformation = k3fileInformation;
    }

    public ClaimInfo withK3fileInformation(List<List<K3fileInformation>> k3fileInformation) {
        this.k3fileInformation = k3fileInformation;
        return this;
    }

    @JsonProperty("nte_clmNote")
    public List<NteClmNote> getNteClmNote() {
        return nteClmNote;
    }

    @JsonProperty("nte_clmNote")
    public void setNteClmNote(List<NteClmNote> nteClmNote) {
        this.nteClmNote = nteClmNote;
    }

    public ClaimInfo withNteClmNote(List<NteClmNote> nteClmNote) {
        this.nteClmNote = nteClmNote;
        return this;
    }

    @JsonProperty("nte01_noteReferenceCode")
    public String getNte01NoteReferenceCode() {
        return nte01NoteReferenceCode;
    }

    @JsonProperty("nte01_noteReferenceCode")
    public void setNte01NoteReferenceCode(String nte01NoteReferenceCode) {
        this.nte01NoteReferenceCode = nte01NoteReferenceCode;
    }

    public ClaimInfo withNte01NoteReferenceCode(String nte01NoteReferenceCode) {
        this.nte01NoteReferenceCode = nte01NoteReferenceCode;
        return this;
    }

    @JsonProperty("nte02_claimNoteText")
    public String getNte02ClaimNoteText() {
        return nte02ClaimNoteText;
    }

    @JsonProperty("nte02_claimNoteText")
    public void setNte02ClaimNoteText(String nte02ClaimNoteText) {
        this.nte02ClaimNoteText = nte02ClaimNoteText;
    }

    public ClaimInfo withNte02ClaimNoteText(String nte02ClaimNoteText) {
        this.nte02ClaimNoteText = nte02ClaimNoteText;
        return this;
    }

    @JsonProperty("nte01_billingNoteReferenceCode")
    public String getNte01BillingNoteReferenceCode() {
        return nte01BillingNoteReferenceCode;
    }

    @JsonProperty("nte01_billingNoteReferenceCode")
    public void setNte01BillingNoteReferenceCode(String nte01BillingNoteReferenceCode) {
        this.nte01BillingNoteReferenceCode = nte01BillingNoteReferenceCode;
    }

    public ClaimInfo withNte01BillingNoteReferenceCode(String nte01BillingNoteReferenceCode) {
        this.nte01BillingNoteReferenceCode = nte01BillingNoteReferenceCode;
        return this;
    }

    @JsonProperty("nte02_billingNoteText")
    public String getNte02BillingNoteText() {
        return nte02BillingNoteText;
    }

    @JsonProperty("nte02_billingNoteText")
    public void setNte02BillingNoteText(String nte02BillingNoteText) {
        this.nte02BillingNoteText = nte02BillingNoteText;
    }

    public ClaimInfo withNte02BillingNoteText(String nte02BillingNoteText) {
        this.nte02BillingNoteText = nte02BillingNoteText;
        return this;
    }

    @JsonProperty("cr101_basisForMeasurementCodePound")
    public String getCr101BasisForMeasurementCodePound() {
        return cr101BasisForMeasurementCodePound;
    }

    @JsonProperty("cr101_basisForMeasurementCodePound")
    public void setCr101BasisForMeasurementCodePound(String cr101BasisForMeasurementCodePound) {
        this.cr101BasisForMeasurementCodePound = cr101BasisForMeasurementCodePound;
    }

    public ClaimInfo withCr101BasisForMeasurementCodePound(String cr101BasisForMeasurementCodePound) {
        this.cr101BasisForMeasurementCodePound = cr101BasisForMeasurementCodePound;
        return this;
    }

    @JsonProperty("cr102_patientWeightPounds")
    public String getCr102PatientWeightPounds() {
        return cr102PatientWeightPounds;
    }

    @JsonProperty("cr102_patientWeightPounds")
    public void setCr102PatientWeightPounds(String cr102PatientWeightPounds) {
        this.cr102PatientWeightPounds = cr102PatientWeightPounds;
    }

    public ClaimInfo withCr102PatientWeightPounds(String cr102PatientWeightPounds) {
        this.cr102PatientWeightPounds = cr102PatientWeightPounds;
        return this;
    }

    @JsonProperty("cr104_ambulanceTransportReasonCode")
    public String getCr104AmbulanceTransportReasonCode() {
        return cr104AmbulanceTransportReasonCode;
    }

    @JsonProperty("cr104_ambulanceTransportReasonCode")
    public void setCr104AmbulanceTransportReasonCode(String cr104AmbulanceTransportReasonCode) {
        this.cr104AmbulanceTransportReasonCode = cr104AmbulanceTransportReasonCode;
    }

    public ClaimInfo withCr104AmbulanceTransportReasonCode(String cr104AmbulanceTransportReasonCode) {
        this.cr104AmbulanceTransportReasonCode = cr104AmbulanceTransportReasonCode;
        return this;
    }

    @JsonProperty("cr105_basisForMeasurementCodeMiles")
    public String getCr105BasisForMeasurementCodeMiles() {
        return cr105BasisForMeasurementCodeMiles;
    }

    @JsonProperty("cr105_basisForMeasurementCodeMiles")
    public void setCr105BasisForMeasurementCodeMiles(String cr105BasisForMeasurementCodeMiles) {
        this.cr105BasisForMeasurementCodeMiles = cr105BasisForMeasurementCodeMiles;
    }

    public ClaimInfo withCr105BasisForMeasurementCodeMiles(String cr105BasisForMeasurementCodeMiles) {
        this.cr105BasisForMeasurementCodeMiles = cr105BasisForMeasurementCodeMiles;
        return this;
    }

    @JsonProperty("cr106_transportDistanceMiles")
    public String getCr106TransportDistanceMiles() {
        return cr106TransportDistanceMiles;
    }

    @JsonProperty("cr106_transportDistanceMiles")
    public void setCr106TransportDistanceMiles(String cr106TransportDistanceMiles) {
        this.cr106TransportDistanceMiles = cr106TransportDistanceMiles;
    }

    public ClaimInfo withCr106TransportDistanceMiles(String cr106TransportDistanceMiles) {
        this.cr106TransportDistanceMiles = cr106TransportDistanceMiles;
        return this;
    }

    @JsonProperty("cr109_roundTripPurposeDescription")
    public String getCr109RoundTripPurposeDescription() {
        return cr109RoundTripPurposeDescription;
    }

    @JsonProperty("cr109_roundTripPurposeDescription")
    public void setCr109RoundTripPurposeDescription(String cr109RoundTripPurposeDescription) {
        this.cr109RoundTripPurposeDescription = cr109RoundTripPurposeDescription;
    }

    public ClaimInfo withCr109RoundTripPurposeDescription(String cr109RoundTripPurposeDescription) {
        this.cr109RoundTripPurposeDescription = cr109RoundTripPurposeDescription;
        return this;
    }

    @JsonProperty("cr110_stretcherPurposeDescription")
    public String getCr110StretcherPurposeDescription() {
        return cr110StretcherPurposeDescription;
    }

    @JsonProperty("cr110_stretcherPurposeDescription")
    public void setCr110StretcherPurposeDescription(String cr110StretcherPurposeDescription) {
        this.cr110StretcherPurposeDescription = cr110StretcherPurposeDescription;
    }

    public ClaimInfo withCr110StretcherPurposeDescription(String cr110StretcherPurposeDescription) {
        this.cr110StretcherPurposeDescription = cr110StretcherPurposeDescription;
        return this;
    }

    @JsonProperty("cr208_natureOfConditionCode")
    public String getCr208NatureOfConditionCode() {
        return cr208NatureOfConditionCode;
    }

    @JsonProperty("cr208_natureOfConditionCode")
    public void setCr208NatureOfConditionCode(String cr208NatureOfConditionCode) {
        this.cr208NatureOfConditionCode = cr208NatureOfConditionCode;
    }

    public ClaimInfo withCr208NatureOfConditionCode(String cr208NatureOfConditionCode) {
        this.cr208NatureOfConditionCode = cr208NatureOfConditionCode;
        return this;
    }

    @JsonProperty("cr210_patientConditionDescription")
    public String getCr210PatientConditionDescription() {
        return cr210PatientConditionDescription;
    }

    @JsonProperty("cr210_patientConditionDescription")
    public void setCr210PatientConditionDescription(String cr210PatientConditionDescription) {
        this.cr210PatientConditionDescription = cr210PatientConditionDescription;
    }

    public ClaimInfo withCr210PatientConditionDescription(String cr210PatientConditionDescription) {
        this.cr210PatientConditionDescription = cr210PatientConditionDescription;
        return this;
    }

    @JsonProperty("cr211_patientConditionDescription2")
    public String getCr211PatientConditionDescription2() {
        return cr211PatientConditionDescription2;
    }

    @JsonProperty("cr211_patientConditionDescription2")
    public void setCr211PatientConditionDescription2(String cr211PatientConditionDescription2) {
        this.cr211PatientConditionDescription2 = cr211PatientConditionDescription2;
    }

    public ClaimInfo withCr211PatientConditionDescription2(String cr211PatientConditionDescription2) {
        this.cr211PatientConditionDescription2 = cr211PatientConditionDescription2;
        return this;
    }

    @JsonProperty("crc_ambulanceCertification")
    public List<CrcAmbulanceCertification> getCrcAmbulanceCertification() {
        return crcAmbulanceCertification;
    }

    @JsonProperty("crc_ambulanceCertification")
    public void setCrcAmbulanceCertification(List<CrcAmbulanceCertification> crcAmbulanceCertification) {
        this.crcAmbulanceCertification = crcAmbulanceCertification;
    }

    public ClaimInfo withCrcAmbulanceCertification(List<CrcAmbulanceCertification> crcAmbulanceCertification) {
        this.crcAmbulanceCertification = crcAmbulanceCertification;
        return this;
    }

    @JsonProperty("crc_patientVisionCondition")
    public List<CrcPatientVisionCondition> getCrcPatientVisionCondition() {
        return crcPatientVisionCondition;
    }

    @JsonProperty("crc_patientVisionCondition")
    public void setCrcPatientVisionCondition(List<CrcPatientVisionCondition> crcPatientVisionCondition) {
        this.crcPatientVisionCondition = crcPatientVisionCondition;
    }

    public ClaimInfo withCrcPatientVisionCondition(List<CrcPatientVisionCondition> crcPatientVisionCondition) {
        this.crcPatientVisionCondition = crcPatientVisionCondition;
        return this;
    }

    @JsonProperty("crc01_homeboundConditionCodeCategory")
    public String getCrc01HomeboundConditionCodeCategory() {
        return crc01HomeboundConditionCodeCategory;
    }

    @JsonProperty("crc01_homeboundConditionCodeCategory")
    public void setCrc01HomeboundConditionCodeCategory(String crc01HomeboundConditionCodeCategory) {
        this.crc01HomeboundConditionCodeCategory = crc01HomeboundConditionCodeCategory;
    }

    public ClaimInfo withCrc01HomeboundConditionCodeCategory(String crc01HomeboundConditionCodeCategory) {
        this.crc01HomeboundConditionCodeCategory = crc01HomeboundConditionCodeCategory;
        return this;
    }

    @JsonProperty("crc02_homeboundConditionCode")
    public String getCrc02HomeboundConditionCode() {
        return crc02HomeboundConditionCode;
    }

    @JsonProperty("crc02_homeboundConditionCode")
    public void setCrc02HomeboundConditionCode(String crc02HomeboundConditionCode) {
        this.crc02HomeboundConditionCode = crc02HomeboundConditionCode;
    }

    public ClaimInfo withCrc02HomeboundConditionCode(String crc02HomeboundConditionCode) {
        this.crc02HomeboundConditionCode = crc02HomeboundConditionCode;
        return this;
    }

    @JsonProperty("crc03_homeboundIndicator")
    public String getCrc03HomeboundIndicator() {
        return crc03HomeboundIndicator;
    }

    @JsonProperty("crc03_homeboundIndicator")
    public void setCrc03HomeboundIndicator(String crc03HomeboundIndicator) {
        this.crc03HomeboundIndicator = crc03HomeboundIndicator;
    }

    public ClaimInfo withCrc03HomeboundIndicator(String crc03HomeboundIndicator) {
        this.crc03HomeboundIndicator = crc03HomeboundIndicator;
        return this;
    }

    @JsonProperty("crc01_epsdtConditionCodeCategory")
    public String getCrc01EpsdtConditionCodeCategory() {
        return crc01EpsdtConditionCodeCategory;
    }

    @JsonProperty("crc01_epsdtConditionCodeCategory")
    public void setCrc01EpsdtConditionCodeCategory(String crc01EpsdtConditionCodeCategory) {
        this.crc01EpsdtConditionCodeCategory = crc01EpsdtConditionCodeCategory;
    }

    public ClaimInfo withCrc01EpsdtConditionCodeCategory(String crc01EpsdtConditionCodeCategory) {
        this.crc01EpsdtConditionCodeCategory = crc01EpsdtConditionCodeCategory;
        return this;
    }

    @JsonProperty("crc02_epsdtConditionCodeAppliesIndicator")
    public String getCrc02EpsdtConditionCodeAppliesIndicator() {
        return crc02EpsdtConditionCodeAppliesIndicator;
    }

    @JsonProperty("crc02_epsdtConditionCodeAppliesIndicator")
    public void setCrc02EpsdtConditionCodeAppliesIndicator(String crc02EpsdtConditionCodeAppliesIndicator) {
        this.crc02EpsdtConditionCodeAppliesIndicator = crc02EpsdtConditionCodeAppliesIndicator;
    }

    public ClaimInfo withCrc02EpsdtConditionCodeAppliesIndicator(String crc02EpsdtConditionCodeAppliesIndicator) {
        this.crc02EpsdtConditionCodeAppliesIndicator = crc02EpsdtConditionCodeAppliesIndicator;
        return this;
    }

    @JsonProperty("crc03_epsdtConditionIndicator1")
    public String getCrc03EpsdtConditionIndicator1() {
        return crc03EpsdtConditionIndicator1;
    }

    @JsonProperty("crc03_epsdtConditionIndicator1")
    public void setCrc03EpsdtConditionIndicator1(String crc03EpsdtConditionIndicator1) {
        this.crc03EpsdtConditionIndicator1 = crc03EpsdtConditionIndicator1;
    }

    public ClaimInfo withCrc03EpsdtConditionIndicator1(String crc03EpsdtConditionIndicator1) {
        this.crc03EpsdtConditionIndicator1 = crc03EpsdtConditionIndicator1;
        return this;
    }

    @JsonProperty("crc04_epsdtConditionIndicator2")
    public String getCrc04EpsdtConditionIndicator2() {
        return crc04EpsdtConditionIndicator2;
    }

    @JsonProperty("crc04_epsdtConditionIndicator2")
    public void setCrc04EpsdtConditionIndicator2(String crc04EpsdtConditionIndicator2) {
        this.crc04EpsdtConditionIndicator2 = crc04EpsdtConditionIndicator2;
    }

    public ClaimInfo withCrc04EpsdtConditionIndicator2(String crc04EpsdtConditionIndicator2) {
        this.crc04EpsdtConditionIndicator2 = crc04EpsdtConditionIndicator2;
        return this;
    }

    @JsonProperty("crc05_epsdtconditionIndicator3")
    public String getCrc05EpsdtconditionIndicator3() {
        return crc05EpsdtconditionIndicator3;
    }

    @JsonProperty("crc05_epsdtconditionIndicator3")
    public void setCrc05EpsdtconditionIndicator3(String crc05EpsdtconditionIndicator3) {
        this.crc05EpsdtconditionIndicator3 = crc05EpsdtconditionIndicator3;
    }

    public ClaimInfo withCrc05EpsdtconditionIndicator3(String crc05EpsdtconditionIndicator3) {
        this.crc05EpsdtconditionIndicator3 = crc05EpsdtconditionIndicator3;
        return this;
    }

    @JsonProperty("hi01_diagnosisType1")
    public String getHi01DiagnosisType1() {
        return hi01DiagnosisType1;
    }

    @JsonProperty("hi01_diagnosisType1")
    public void setHi01DiagnosisType1(String hi01DiagnosisType1) {
        this.hi01DiagnosisType1 = hi01DiagnosisType1;
    }

    public ClaimInfo withHi01DiagnosisType1(String hi01DiagnosisType1) {
        this.hi01DiagnosisType1 = hi01DiagnosisType1;
        return this;
    }

    @JsonProperty("hi01_01_diagnosisTypeCode1")
    public String getHi0101DiagnosisTypeCode1() {
        return hi0101DiagnosisTypeCode1;
    }

    @JsonProperty("hi01_01_diagnosisTypeCode1")
    public void setHi0101DiagnosisTypeCode1(String hi0101DiagnosisTypeCode1) {
        this.hi0101DiagnosisTypeCode1 = hi0101DiagnosisTypeCode1;
    }

    public ClaimInfo withHi0101DiagnosisTypeCode1(String hi0101DiagnosisTypeCode1) {
        this.hi0101DiagnosisTypeCode1 = hi0101DiagnosisTypeCode1;
        return this;
    }

    @JsonProperty("hi01_02_diagnosisCode1")
    public String getHi0102DiagnosisCode1() {
        return hi0102DiagnosisCode1;
    }

    @JsonProperty("hi01_02_diagnosisCode1")
    public void setHi0102DiagnosisCode1(String hi0102DiagnosisCode1) {
        this.hi0102DiagnosisCode1 = hi0102DiagnosisCode1;
    }

    public ClaimInfo withHi0102DiagnosisCode1(String hi0102DiagnosisCode1) {
        this.hi0102DiagnosisCode1 = hi0102DiagnosisCode1;
        return this;
    }

    @JsonProperty("hi01_09_presentOnAdmissionIndicator")
    public String getHi0109PresentOnAdmissionIndicator() {
        return hi0109PresentOnAdmissionIndicator;
    }

    @JsonProperty("hi01_09_presentOnAdmissionIndicator")
    public void setHi0109PresentOnAdmissionIndicator(String hi0109PresentOnAdmissionIndicator) {
        this.hi0109PresentOnAdmissionIndicator = hi0109PresentOnAdmissionIndicator;
    }

    public ClaimInfo withHi0109PresentOnAdmissionIndicator(String hi0109PresentOnAdmissionIndicator) {
        this.hi0109PresentOnAdmissionIndicator = hi0109PresentOnAdmissionIndicator;
        return this;
    }

    @JsonProperty("hi02_diagnosisType2")
    public String getHi02DiagnosisType2() {
        return hi02DiagnosisType2;
    }

    @JsonProperty("hi02_diagnosisType2")
    public void setHi02DiagnosisType2(String hi02DiagnosisType2) {
        this.hi02DiagnosisType2 = hi02DiagnosisType2;
    }

    public ClaimInfo withHi02DiagnosisType2(String hi02DiagnosisType2) {
        this.hi02DiagnosisType2 = hi02DiagnosisType2;
        return this;
    }

    @JsonProperty("hi02_01_diagnosisTypeCode2")
    public String getHi0201DiagnosisTypeCode2() {
        return hi0201DiagnosisTypeCode2;
    }

    @JsonProperty("hi02_01_diagnosisTypeCode2")
    public void setHi0201DiagnosisTypeCode2(String hi0201DiagnosisTypeCode2) {
        this.hi0201DiagnosisTypeCode2 = hi0201DiagnosisTypeCode2;
    }

    public ClaimInfo withHi0201DiagnosisTypeCode2(String hi0201DiagnosisTypeCode2) {
        this.hi0201DiagnosisTypeCode2 = hi0201DiagnosisTypeCode2;
        return this;
    }

    @JsonProperty("hi02_02_diagnosisCode2")
    public String getHi0202DiagnosisCode2() {
        return hi0202DiagnosisCode2;
    }

    @JsonProperty("hi02_02_diagnosisCode2")
    public void setHi0202DiagnosisCode2(String hi0202DiagnosisCode2) {
        this.hi0202DiagnosisCode2 = hi0202DiagnosisCode2;
    }

    public ClaimInfo withHi0202DiagnosisCode2(String hi0202DiagnosisCode2) {
        this.hi0202DiagnosisCode2 = hi0202DiagnosisCode2;
        return this;
    }

    @JsonProperty("hi03_diagnosisTypeCode3")
    public String getHi03DiagnosisTypeCode3() {
        return hi03DiagnosisTypeCode3;
    }

    @JsonProperty("hi03_diagnosisTypeCode3")
    public void setHi03DiagnosisTypeCode3(String hi03DiagnosisTypeCode3) {
        this.hi03DiagnosisTypeCode3 = hi03DiagnosisTypeCode3;
    }

    public ClaimInfo withHi03DiagnosisTypeCode3(String hi03DiagnosisTypeCode3) {
        this.hi03DiagnosisTypeCode3 = hi03DiagnosisTypeCode3;
        return this;
    }

    @JsonProperty("hi03_01_diagnosisTypeCode3")
    public String getHi0301DiagnosisTypeCode3() {
        return hi0301DiagnosisTypeCode3;
    }

    @JsonProperty("hi03_01_diagnosisTypeCode3")
    public void setHi0301DiagnosisTypeCode3(String hi0301DiagnosisTypeCode3) {
        this.hi0301DiagnosisTypeCode3 = hi0301DiagnosisTypeCode3;
    }

    public ClaimInfo withHi0301DiagnosisTypeCode3(String hi0301DiagnosisTypeCode3) {
        this.hi0301DiagnosisTypeCode3 = hi0301DiagnosisTypeCode3;
        return this;
    }

    @JsonProperty("hi03_02_diagnosisCode3")
    public String getHi0302DiagnosisCode3() {
        return hi0302DiagnosisCode3;
    }

    @JsonProperty("hi03_02_diagnosisCode3")
    public void setHi0302DiagnosisCode3(String hi0302DiagnosisCode3) {
        this.hi0302DiagnosisCode3 = hi0302DiagnosisCode3;
    }

    public ClaimInfo withHi0302DiagnosisCode3(String hi0302DiagnosisCode3) {
        this.hi0302DiagnosisCode3 = hi0302DiagnosisCode3;
        return this;
    }

    @JsonProperty("hi04_diagnosisTypeCode4")
    public String getHi04DiagnosisTypeCode4() {
        return hi04DiagnosisTypeCode4;
    }

    @JsonProperty("hi04_diagnosisTypeCode4")
    public void setHi04DiagnosisTypeCode4(String hi04DiagnosisTypeCode4) {
        this.hi04DiagnosisTypeCode4 = hi04DiagnosisTypeCode4;
    }

    public ClaimInfo withHi04DiagnosisTypeCode4(String hi04DiagnosisTypeCode4) {
        this.hi04DiagnosisTypeCode4 = hi04DiagnosisTypeCode4;
        return this;
    }

    @JsonProperty("hi04_01_diagnosisTypeCode4")
    public String getHi0401DiagnosisTypeCode4() {
        return hi0401DiagnosisTypeCode4;
    }

    @JsonProperty("hi04_01_diagnosisTypeCode4")
    public void setHi0401DiagnosisTypeCode4(String hi0401DiagnosisTypeCode4) {
        this.hi0401DiagnosisTypeCode4 = hi0401DiagnosisTypeCode4;
    }

    public ClaimInfo withHi0401DiagnosisTypeCode4(String hi0401DiagnosisTypeCode4) {
        this.hi0401DiagnosisTypeCode4 = hi0401DiagnosisTypeCode4;
        return this;
    }

    @JsonProperty("hi04_02_diagnosisCode4")
    public String getHi0402DiagnosisCode4() {
        return hi0402DiagnosisCode4;
    }

    @JsonProperty("hi04_02_diagnosisCode4")
    public void setHi0402DiagnosisCode4(String hi0402DiagnosisCode4) {
        this.hi0402DiagnosisCode4 = hi0402DiagnosisCode4;
    }

    public ClaimInfo withHi0402DiagnosisCode4(String hi0402DiagnosisCode4) {
        this.hi0402DiagnosisCode4 = hi0402DiagnosisCode4;
        return this;
    }

    @JsonProperty("hi05_diagnosisTypeCode5")
    public String getHi05DiagnosisTypeCode5() {
        return hi05DiagnosisTypeCode5;
    }

    @JsonProperty("hi05_diagnosisTypeCode5")
    public void setHi05DiagnosisTypeCode5(String hi05DiagnosisTypeCode5) {
        this.hi05DiagnosisTypeCode5 = hi05DiagnosisTypeCode5;
    }

    public ClaimInfo withHi05DiagnosisTypeCode5(String hi05DiagnosisTypeCode5) {
        this.hi05DiagnosisTypeCode5 = hi05DiagnosisTypeCode5;
        return this;
    }

    @JsonProperty("hi05_01_diagnosisTypeCode5")
    public String getHi0501DiagnosisTypeCode5() {
        return hi0501DiagnosisTypeCode5;
    }

    @JsonProperty("hi05_01_diagnosisTypeCode5")
    public void setHi0501DiagnosisTypeCode5(String hi0501DiagnosisTypeCode5) {
        this.hi0501DiagnosisTypeCode5 = hi0501DiagnosisTypeCode5;
    }

    public ClaimInfo withHi0501DiagnosisTypeCode5(String hi0501DiagnosisTypeCode5) {
        this.hi0501DiagnosisTypeCode5 = hi0501DiagnosisTypeCode5;
        return this;
    }

    @JsonProperty("hi05_02_diagnosisCode5")
    public String getHi0502DiagnosisCode5() {
        return hi0502DiagnosisCode5;
    }

    @JsonProperty("hi05_02_diagnosisCode5")
    public void setHi0502DiagnosisCode5(String hi0502DiagnosisCode5) {
        this.hi0502DiagnosisCode5 = hi0502DiagnosisCode5;
    }

    public ClaimInfo withHi0502DiagnosisCode5(String hi0502DiagnosisCode5) {
        this.hi0502DiagnosisCode5 = hi0502DiagnosisCode5;
        return this;
    }

    @JsonProperty("hi06_diagnosisTypecode6")
    public String getHi06DiagnosisTypecode6() {
        return hi06DiagnosisTypecode6;
    }

    @JsonProperty("hi06_diagnosisTypecode6")
    public void setHi06DiagnosisTypecode6(String hi06DiagnosisTypecode6) {
        this.hi06DiagnosisTypecode6 = hi06DiagnosisTypecode6;
    }

    public ClaimInfo withHi06DiagnosisTypecode6(String hi06DiagnosisTypecode6) {
        this.hi06DiagnosisTypecode6 = hi06DiagnosisTypecode6;
        return this;
    }

    @JsonProperty("hi06_01_diagnosisTypeCode6")
    public String getHi0601DiagnosisTypeCode6() {
        return hi0601DiagnosisTypeCode6;
    }

    @JsonProperty("hi06_01_diagnosisTypeCode6")
    public void setHi0601DiagnosisTypeCode6(String hi0601DiagnosisTypeCode6) {
        this.hi0601DiagnosisTypeCode6 = hi0601DiagnosisTypeCode6;
    }

    public ClaimInfo withHi0601DiagnosisTypeCode6(String hi0601DiagnosisTypeCode6) {
        this.hi0601DiagnosisTypeCode6 = hi0601DiagnosisTypeCode6;
        return this;
    }

    @JsonProperty("hi06_02_diagnosisCode6")
    public String getHi0602DiagnosisCode6() {
        return hi0602DiagnosisCode6;
    }

    @JsonProperty("hi06_02_diagnosisCode6")
    public void setHi0602DiagnosisCode6(String hi0602DiagnosisCode6) {
        this.hi0602DiagnosisCode6 = hi0602DiagnosisCode6;
    }

    public ClaimInfo withHi0602DiagnosisCode6(String hi0602DiagnosisCode6) {
        this.hi0602DiagnosisCode6 = hi0602DiagnosisCode6;
        return this;
    }

    @JsonProperty("hi07_diagnosisTypeCode7")
    public String getHi07DiagnosisTypeCode7() {
        return hi07DiagnosisTypeCode7;
    }

    @JsonProperty("hi07_diagnosisTypeCode7")
    public void setHi07DiagnosisTypeCode7(String hi07DiagnosisTypeCode7) {
        this.hi07DiagnosisTypeCode7 = hi07DiagnosisTypeCode7;
    }

    public ClaimInfo withHi07DiagnosisTypeCode7(String hi07DiagnosisTypeCode7) {
        this.hi07DiagnosisTypeCode7 = hi07DiagnosisTypeCode7;
        return this;
    }

    @JsonProperty("hi07_01_diagnosisTypeCode7")
    public String getHi0701DiagnosisTypeCode7() {
        return hi0701DiagnosisTypeCode7;
    }

    @JsonProperty("hi07_01_diagnosisTypeCode7")
    public void setHi0701DiagnosisTypeCode7(String hi0701DiagnosisTypeCode7) {
        this.hi0701DiagnosisTypeCode7 = hi0701DiagnosisTypeCode7;
    }

    public ClaimInfo withHi0701DiagnosisTypeCode7(String hi0701DiagnosisTypeCode7) {
        this.hi0701DiagnosisTypeCode7 = hi0701DiagnosisTypeCode7;
        return this;
    }

    @JsonProperty("hi07_02_diagnosisCode7")
    public String getHi0702DiagnosisCode7() {
        return hi0702DiagnosisCode7;
    }

    @JsonProperty("hi07_02_diagnosisCode7")
    public void setHi0702DiagnosisCode7(String hi0702DiagnosisCode7) {
        this.hi0702DiagnosisCode7 = hi0702DiagnosisCode7;
    }

    public ClaimInfo withHi0702DiagnosisCode7(String hi0702DiagnosisCode7) {
        this.hi0702DiagnosisCode7 = hi0702DiagnosisCode7;
        return this;
    }

    @JsonProperty("hi08_diagnosisTypeCode8")
    public String getHi08DiagnosisTypeCode8() {
        return hi08DiagnosisTypeCode8;
    }

    @JsonProperty("hi08_diagnosisTypeCode8")
    public void setHi08DiagnosisTypeCode8(String hi08DiagnosisTypeCode8) {
        this.hi08DiagnosisTypeCode8 = hi08DiagnosisTypeCode8;
    }

    public ClaimInfo withHi08DiagnosisTypeCode8(String hi08DiagnosisTypeCode8) {
        this.hi08DiagnosisTypeCode8 = hi08DiagnosisTypeCode8;
        return this;
    }

    @JsonProperty("hi08_01_diagnosisTypeCode8")
    public String getHi0801DiagnosisTypeCode8() {
        return hi0801DiagnosisTypeCode8;
    }

    @JsonProperty("hi08_01_diagnosisTypeCode8")
    public void setHi0801DiagnosisTypeCode8(String hi0801DiagnosisTypeCode8) {
        this.hi0801DiagnosisTypeCode8 = hi0801DiagnosisTypeCode8;
    }

    public ClaimInfo withHi0801DiagnosisTypeCode8(String hi0801DiagnosisTypeCode8) {
        this.hi0801DiagnosisTypeCode8 = hi0801DiagnosisTypeCode8;
        return this;
    }

    @JsonProperty("hi08_02_diagnosisCode8")
    public String getHi0802DiagnosisCode8() {
        return hi0802DiagnosisCode8;
    }

    @JsonProperty("hi08_02_diagnosisCode8")
    public void setHi0802DiagnosisCode8(String hi0802DiagnosisCode8) {
        this.hi0802DiagnosisCode8 = hi0802DiagnosisCode8;
    }

    public ClaimInfo withHi0802DiagnosisCode8(String hi0802DiagnosisCode8) {
        this.hi0802DiagnosisCode8 = hi0802DiagnosisCode8;
        return this;
    }

    @JsonProperty("hi09_diagnosisType")
    public String getHi09DiagnosisType() {
        return hi09DiagnosisType;
    }

    @JsonProperty("hi09_diagnosisType")
    public void setHi09DiagnosisType(String hi09DiagnosisType) {
        this.hi09DiagnosisType = hi09DiagnosisType;
    }

    public ClaimInfo withHi09DiagnosisType(String hi09DiagnosisType) {
        this.hi09DiagnosisType = hi09DiagnosisType;
        return this;
    }

    @JsonProperty("hi09_01_diagnosisTypeCode9")
    public String getHi0901DiagnosisTypeCode9() {
        return hi0901DiagnosisTypeCode9;
    }

    @JsonProperty("hi09_01_diagnosisTypeCode9")
    public void setHi0901DiagnosisTypeCode9(String hi0901DiagnosisTypeCode9) {
        this.hi0901DiagnosisTypeCode9 = hi0901DiagnosisTypeCode9;
    }

    public ClaimInfo withHi0901DiagnosisTypeCode9(String hi0901DiagnosisTypeCode9) {
        this.hi0901DiagnosisTypeCode9 = hi0901DiagnosisTypeCode9;
        return this;
    }

    @JsonProperty("hi09_02_diagnosisCode9")
    public String getHi0902DiagnosisCode9() {
        return hi0902DiagnosisCode9;
    }

    @JsonProperty("hi09_02_diagnosisCode9")
    public void setHi0902DiagnosisCode9(String hi0902DiagnosisCode9) {
        this.hi0902DiagnosisCode9 = hi0902DiagnosisCode9;
    }

    public ClaimInfo withHi0902DiagnosisCode9(String hi0902DiagnosisCode9) {
        this.hi0902DiagnosisCode9 = hi0902DiagnosisCode9;
        return this;
    }

    @JsonProperty("hi10_diagnosisTypeCode10")
    public String getHi10DiagnosisTypeCode10() {
        return hi10DiagnosisTypeCode10;
    }

    @JsonProperty("hi10_diagnosisTypeCode10")
    public void setHi10DiagnosisTypeCode10(String hi10DiagnosisTypeCode10) {
        this.hi10DiagnosisTypeCode10 = hi10DiagnosisTypeCode10;
    }

    public ClaimInfo withHi10DiagnosisTypeCode10(String hi10DiagnosisTypeCode10) {
        this.hi10DiagnosisTypeCode10 = hi10DiagnosisTypeCode10;
        return this;
    }

    @JsonProperty("hi10_01_diagnosisTypeCode10")
    public String getHi1001DiagnosisTypeCode10() {
        return hi1001DiagnosisTypeCode10;
    }

    @JsonProperty("hi10_01_diagnosisTypeCode10")
    public void setHi1001DiagnosisTypeCode10(String hi1001DiagnosisTypeCode10) {
        this.hi1001DiagnosisTypeCode10 = hi1001DiagnosisTypeCode10;
    }

    public ClaimInfo withHi1001DiagnosisTypeCode10(String hi1001DiagnosisTypeCode10) {
        this.hi1001DiagnosisTypeCode10 = hi1001DiagnosisTypeCode10;
        return this;
    }

    @JsonProperty("hi10_02_diagnosisCode10")
    public String getHi1002DiagnosisCode10() {
        return hi1002DiagnosisCode10;
    }

    @JsonProperty("hi10_02_diagnosisCode10")
    public void setHi1002DiagnosisCode10(String hi1002DiagnosisCode10) {
        this.hi1002DiagnosisCode10 = hi1002DiagnosisCode10;
    }

    public ClaimInfo withHi1002DiagnosisCode10(String hi1002DiagnosisCode10) {
        this.hi1002DiagnosisCode10 = hi1002DiagnosisCode10;
        return this;
    }

    @JsonProperty("hi11_diagnosisTypeCode11")
    public String getHi11DiagnosisTypeCode11() {
        return hi11DiagnosisTypeCode11;
    }

    @JsonProperty("hi11_diagnosisTypeCode11")
    public void setHi11DiagnosisTypeCode11(String hi11DiagnosisTypeCode11) {
        this.hi11DiagnosisTypeCode11 = hi11DiagnosisTypeCode11;
    }

    public ClaimInfo withHi11DiagnosisTypeCode11(String hi11DiagnosisTypeCode11) {
        this.hi11DiagnosisTypeCode11 = hi11DiagnosisTypeCode11;
        return this;
    }

    @JsonProperty("hi11_01_diagnosisTypeCode11")
    public String getHi1101DiagnosisTypeCode11() {
        return hi1101DiagnosisTypeCode11;
    }

    @JsonProperty("hi11_01_diagnosisTypeCode11")
    public void setHi1101DiagnosisTypeCode11(String hi1101DiagnosisTypeCode11) {
        this.hi1101DiagnosisTypeCode11 = hi1101DiagnosisTypeCode11;
    }

    public ClaimInfo withHi1101DiagnosisTypeCode11(String hi1101DiagnosisTypeCode11) {
        this.hi1101DiagnosisTypeCode11 = hi1101DiagnosisTypeCode11;
        return this;
    }

    @JsonProperty("hi11_02_diagnosisCode11")
    public String getHi1102DiagnosisCode11() {
        return hi1102DiagnosisCode11;
    }

    @JsonProperty("hi11_02_diagnosisCode11")
    public void setHi1102DiagnosisCode11(String hi1102DiagnosisCode11) {
        this.hi1102DiagnosisCode11 = hi1102DiagnosisCode11;
    }

    public ClaimInfo withHi1102DiagnosisCode11(String hi1102DiagnosisCode11) {
        this.hi1102DiagnosisCode11 = hi1102DiagnosisCode11;
        return this;
    }

    @JsonProperty("hi12_diagnosisTypeCode12")
    public String getHi12DiagnosisTypeCode12() {
        return hi12DiagnosisTypeCode12;
    }

    @JsonProperty("hi12_diagnosisTypeCode12")
    public void setHi12DiagnosisTypeCode12(String hi12DiagnosisTypeCode12) {
        this.hi12DiagnosisTypeCode12 = hi12DiagnosisTypeCode12;
    }

    public ClaimInfo withHi12DiagnosisTypeCode12(String hi12DiagnosisTypeCode12) {
        this.hi12DiagnosisTypeCode12 = hi12DiagnosisTypeCode12;
        return this;
    }

    @JsonProperty("hi12_01_diagnosisTypeCode12")
    public String getHi1201DiagnosisTypeCode12() {
        return hi1201DiagnosisTypeCode12;
    }

    @JsonProperty("hi12_01_diagnosisTypeCode12")
    public void setHi1201DiagnosisTypeCode12(String hi1201DiagnosisTypeCode12) {
        this.hi1201DiagnosisTypeCode12 = hi1201DiagnosisTypeCode12;
    }

    public ClaimInfo withHi1201DiagnosisTypeCode12(String hi1201DiagnosisTypeCode12) {
        this.hi1201DiagnosisTypeCode12 = hi1201DiagnosisTypeCode12;
        return this;
    }

    @JsonProperty("hi12_02_diagnosisCode12")
    public String getHi1202DiagnosisCode12() {
        return hi1202DiagnosisCode12;
    }

    @JsonProperty("hi12_02_diagnosisCode12")
    public void setHi1202DiagnosisCode12(String hi1202DiagnosisCode12) {
        this.hi1202DiagnosisCode12 = hi1202DiagnosisCode12;
    }

    public ClaimInfo withHi1202DiagnosisCode12(String hi1202DiagnosisCode12) {
        this.hi1202DiagnosisCode12 = hi1202DiagnosisCode12;
        return this;
    }

    @JsonProperty("hi01_anesthesiaSurgicalPrincipal1")
    public String getHi01AnesthesiaSurgicalPrincipal1() {
        return hi01AnesthesiaSurgicalPrincipal1;
    }

    @JsonProperty("hi01_anesthesiaSurgicalPrincipal1")
    public void setHi01AnesthesiaSurgicalPrincipal1(String hi01AnesthesiaSurgicalPrincipal1) {
        this.hi01AnesthesiaSurgicalPrincipal1 = hi01AnesthesiaSurgicalPrincipal1;
    }

    public ClaimInfo withHi01AnesthesiaSurgicalPrincipal1(String hi01AnesthesiaSurgicalPrincipal1) {
        this.hi01AnesthesiaSurgicalPrincipal1 = hi01AnesthesiaSurgicalPrincipal1;
        return this;
    }

    @JsonProperty("hi01_01_anesthesiaSurgicalPrincipleProcedureCode1")
    public String getHi0101AnesthesiaSurgicalPrincipleProcedureCode1() {
        return hi0101AnesthesiaSurgicalPrincipleProcedureCode1;
    }

    @JsonProperty("hi01_01_anesthesiaSurgicalPrincipleProcedureCode1")
    public void setHi0101AnesthesiaSurgicalPrincipleProcedureCode1(String hi0101AnesthesiaSurgicalPrincipleProcedureCode1) {
        this.hi0101AnesthesiaSurgicalPrincipleProcedureCode1 = hi0101AnesthesiaSurgicalPrincipleProcedureCode1;
    }

    public ClaimInfo withHi0101AnesthesiaSurgicalPrincipleProcedureCode1(String hi0101AnesthesiaSurgicalPrincipleProcedureCode1) {
        this.hi0101AnesthesiaSurgicalPrincipleProcedureCode1 = hi0101AnesthesiaSurgicalPrincipleProcedureCode1;
        return this;
    }

    @JsonProperty("hi01_02_anesthesiaSurgicalPrincipleProcedure1")
    public String getHi0102AnesthesiaSurgicalPrincipleProcedure1() {
        return hi0102AnesthesiaSurgicalPrincipleProcedure1;
    }

    @JsonProperty("hi01_02_anesthesiaSurgicalPrincipleProcedure1")
    public void setHi0102AnesthesiaSurgicalPrincipleProcedure1(String hi0102AnesthesiaSurgicalPrincipleProcedure1) {
        this.hi0102AnesthesiaSurgicalPrincipleProcedure1 = hi0102AnesthesiaSurgicalPrincipleProcedure1;
    }

    public ClaimInfo withHi0102AnesthesiaSurgicalPrincipleProcedure1(String hi0102AnesthesiaSurgicalPrincipleProcedure1) {
        this.hi0102AnesthesiaSurgicalPrincipleProcedure1 = hi0102AnesthesiaSurgicalPrincipleProcedure1;
        return this;
    }

    @JsonProperty("hi02_anesthesiaSurgicalProcedure2")
    public String getHi02AnesthesiaSurgicalProcedure2() {
        return hi02AnesthesiaSurgicalProcedure2;
    }

    @JsonProperty("hi02_anesthesiaSurgicalProcedure2")
    public void setHi02AnesthesiaSurgicalProcedure2(String hi02AnesthesiaSurgicalProcedure2) {
        this.hi02AnesthesiaSurgicalProcedure2 = hi02AnesthesiaSurgicalProcedure2;
    }

    public ClaimInfo withHi02AnesthesiaSurgicalProcedure2(String hi02AnesthesiaSurgicalProcedure2) {
        this.hi02AnesthesiaSurgicalProcedure2 = hi02AnesthesiaSurgicalProcedure2;
        return this;
    }

    @JsonProperty("hi02_01_anesthesiaSurgicalProcedureCode2")
    public String getHi0201AnesthesiaSurgicalProcedureCode2() {
        return hi0201AnesthesiaSurgicalProcedureCode2;
    }

    @JsonProperty("hi02_01_anesthesiaSurgicalProcedureCode2")
    public void setHi0201AnesthesiaSurgicalProcedureCode2(String hi0201AnesthesiaSurgicalProcedureCode2) {
        this.hi0201AnesthesiaSurgicalProcedureCode2 = hi0201AnesthesiaSurgicalProcedureCode2;
    }

    public ClaimInfo withHi0201AnesthesiaSurgicalProcedureCode2(String hi0201AnesthesiaSurgicalProcedureCode2) {
        this.hi0201AnesthesiaSurgicalProcedureCode2 = hi0201AnesthesiaSurgicalProcedureCode2;
        return this;
    }

    @JsonProperty("hi02_02_anesthesiaSurgicalProcedure2")
    public String getHi0202AnesthesiaSurgicalProcedure2() {
        return hi0202AnesthesiaSurgicalProcedure2;
    }

    @JsonProperty("hi02_02_anesthesiaSurgicalProcedure2")
    public void setHi0202AnesthesiaSurgicalProcedure2(String hi0202AnesthesiaSurgicalProcedure2) {
        this.hi0202AnesthesiaSurgicalProcedure2 = hi0202AnesthesiaSurgicalProcedure2;
    }

    public ClaimInfo withHi0202AnesthesiaSurgicalProcedure2(String hi0202AnesthesiaSurgicalProcedure2) {
        this.hi0202AnesthesiaSurgicalProcedure2 = hi0202AnesthesiaSurgicalProcedure2;
        return this;
    }

    @JsonProperty("hi01_admittingDiagnosisCodeInfo")
    public String getHi01AdmittingDiagnosisCodeInfo() {
        return hi01AdmittingDiagnosisCodeInfo;
    }

    @JsonProperty("hi01_admittingDiagnosisCodeInfo")
    public void setHi01AdmittingDiagnosisCodeInfo(String hi01AdmittingDiagnosisCodeInfo) {
        this.hi01AdmittingDiagnosisCodeInfo = hi01AdmittingDiagnosisCodeInfo;
    }

    public ClaimInfo withHi01AdmittingDiagnosisCodeInfo(String hi01AdmittingDiagnosisCodeInfo) {
        this.hi01AdmittingDiagnosisCodeInfo = hi01AdmittingDiagnosisCodeInfo;
        return this;
    }

    @JsonProperty("hi01_01_admittingDiagnosisQlfrCode1")
    public String getHi0101AdmittingDiagnosisQlfrCode1() {
        return hi0101AdmittingDiagnosisQlfrCode1;
    }

    @JsonProperty("hi01_01_admittingDiagnosisQlfrCode1")
    public void setHi0101AdmittingDiagnosisQlfrCode1(String hi0101AdmittingDiagnosisQlfrCode1) {
        this.hi0101AdmittingDiagnosisQlfrCode1 = hi0101AdmittingDiagnosisQlfrCode1;
    }

    public ClaimInfo withHi0101AdmittingDiagnosisQlfrCode1(String hi0101AdmittingDiagnosisQlfrCode1) {
        this.hi0101AdmittingDiagnosisQlfrCode1 = hi0101AdmittingDiagnosisQlfrCode1;
        return this;
    }

    @JsonProperty("hi01_02_admittingDiagnosisCode1")
    public String getHi0102AdmittingDiagnosisCode1() {
        return hi0102AdmittingDiagnosisCode1;
    }

    @JsonProperty("hi01_02_admittingDiagnosisCode1")
    public void setHi0102AdmittingDiagnosisCode1(String hi0102AdmittingDiagnosisCode1) {
        this.hi0102AdmittingDiagnosisCode1 = hi0102AdmittingDiagnosisCode1;
    }

    public ClaimInfo withHi0102AdmittingDiagnosisCode1(String hi0102AdmittingDiagnosisCode1) {
        this.hi0102AdmittingDiagnosisCode1 = hi0102AdmittingDiagnosisCode1;
        return this;
    }

    @JsonProperty("hi01_patientsReasonForVisitCodeInfo1")
    public String getHi01PatientsReasonForVisitCodeInfo1() {
        return hi01PatientsReasonForVisitCodeInfo1;
    }

    @JsonProperty("hi01_patientsReasonForVisitCodeInfo1")
    public void setHi01PatientsReasonForVisitCodeInfo1(String hi01PatientsReasonForVisitCodeInfo1) {
        this.hi01PatientsReasonForVisitCodeInfo1 = hi01PatientsReasonForVisitCodeInfo1;
    }

    public ClaimInfo withHi01PatientsReasonForVisitCodeInfo1(String hi01PatientsReasonForVisitCodeInfo1) {
        this.hi01PatientsReasonForVisitCodeInfo1 = hi01PatientsReasonForVisitCodeInfo1;
        return this;
    }

    @JsonProperty("hi01_01_patientsReasonForVisitQlfrCode1")
    public String getHi0101PatientsReasonForVisitQlfrCode1() {
        return hi0101PatientsReasonForVisitQlfrCode1;
    }

    @JsonProperty("hi01_01_patientsReasonForVisitQlfrCode1")
    public void setHi0101PatientsReasonForVisitQlfrCode1(String hi0101PatientsReasonForVisitQlfrCode1) {
        this.hi0101PatientsReasonForVisitQlfrCode1 = hi0101PatientsReasonForVisitQlfrCode1;
    }

    public ClaimInfo withHi0101PatientsReasonForVisitQlfrCode1(String hi0101PatientsReasonForVisitQlfrCode1) {
        this.hi0101PatientsReasonForVisitQlfrCode1 = hi0101PatientsReasonForVisitQlfrCode1;
        return this;
    }

    @JsonProperty("hi01_02_patientsReasonForVisitCode1")
    public String getHi0102PatientsReasonForVisitCode1() {
        return hi0102PatientsReasonForVisitCode1;
    }

    @JsonProperty("hi01_02_patientsReasonForVisitCode1")
    public void setHi0102PatientsReasonForVisitCode1(String hi0102PatientsReasonForVisitCode1) {
        this.hi0102PatientsReasonForVisitCode1 = hi0102PatientsReasonForVisitCode1;
    }

    public ClaimInfo withHi0102PatientsReasonForVisitCode1(String hi0102PatientsReasonForVisitCode1) {
        this.hi0102PatientsReasonForVisitCode1 = hi0102PatientsReasonForVisitCode1;
        return this;
    }

    @JsonProperty("hi02_patientsReasonForVisitCodeInfo2")
    public String getHi02PatientsReasonForVisitCodeInfo2() {
        return hi02PatientsReasonForVisitCodeInfo2;
    }

    @JsonProperty("hi02_patientsReasonForVisitCodeInfo2")
    public void setHi02PatientsReasonForVisitCodeInfo2(String hi02PatientsReasonForVisitCodeInfo2) {
        this.hi02PatientsReasonForVisitCodeInfo2 = hi02PatientsReasonForVisitCodeInfo2;
    }

    public ClaimInfo withHi02PatientsReasonForVisitCodeInfo2(String hi02PatientsReasonForVisitCodeInfo2) {
        this.hi02PatientsReasonForVisitCodeInfo2 = hi02PatientsReasonForVisitCodeInfo2;
        return this;
    }

    @JsonProperty("hi02_01_patientsReasonForVisitQlfrCode2")
    public String getHi0201PatientsReasonForVisitQlfrCode2() {
        return hi0201PatientsReasonForVisitQlfrCode2;
    }

    @JsonProperty("hi02_01_patientsReasonForVisitQlfrCode2")
    public void setHi0201PatientsReasonForVisitQlfrCode2(String hi0201PatientsReasonForVisitQlfrCode2) {
        this.hi0201PatientsReasonForVisitQlfrCode2 = hi0201PatientsReasonForVisitQlfrCode2;
    }

    public ClaimInfo withHi0201PatientsReasonForVisitQlfrCode2(String hi0201PatientsReasonForVisitQlfrCode2) {
        this.hi0201PatientsReasonForVisitQlfrCode2 = hi0201PatientsReasonForVisitQlfrCode2;
        return this;
    }

    @JsonProperty("hi02_02_patientsReasonForVisitCode2")
    public String getHi0202PatientsReasonForVisitCode2() {
        return hi0202PatientsReasonForVisitCode2;
    }

    @JsonProperty("hi02_02_patientsReasonForVisitCode2")
    public void setHi0202PatientsReasonForVisitCode2(String hi0202PatientsReasonForVisitCode2) {
        this.hi0202PatientsReasonForVisitCode2 = hi0202PatientsReasonForVisitCode2;
    }

    public ClaimInfo withHi0202PatientsReasonForVisitCode2(String hi0202PatientsReasonForVisitCode2) {
        this.hi0202PatientsReasonForVisitCode2 = hi0202PatientsReasonForVisitCode2;
        return this;
    }

    @JsonProperty("hi03_patientsReasonForVisitCodeInfo3")
    public String getHi03PatientsReasonForVisitCodeInfo3() {
        return hi03PatientsReasonForVisitCodeInfo3;
    }

    @JsonProperty("hi03_patientsReasonForVisitCodeInfo3")
    public void setHi03PatientsReasonForVisitCodeInfo3(String hi03PatientsReasonForVisitCodeInfo3) {
        this.hi03PatientsReasonForVisitCodeInfo3 = hi03PatientsReasonForVisitCodeInfo3;
    }

    public ClaimInfo withHi03PatientsReasonForVisitCodeInfo3(String hi03PatientsReasonForVisitCodeInfo3) {
        this.hi03PatientsReasonForVisitCodeInfo3 = hi03PatientsReasonForVisitCodeInfo3;
        return this;
    }

    @JsonProperty("hi03_01_patientsReasonForVisitQlfrCode3")
    public String getHi0301PatientsReasonForVisitQlfrCode3() {
        return hi0301PatientsReasonForVisitQlfrCode3;
    }

    @JsonProperty("hi03_01_patientsReasonForVisitQlfrCode3")
    public void setHi0301PatientsReasonForVisitQlfrCode3(String hi0301PatientsReasonForVisitQlfrCode3) {
        this.hi0301PatientsReasonForVisitQlfrCode3 = hi0301PatientsReasonForVisitQlfrCode3;
    }

    public ClaimInfo withHi0301PatientsReasonForVisitQlfrCode3(String hi0301PatientsReasonForVisitQlfrCode3) {
        this.hi0301PatientsReasonForVisitQlfrCode3 = hi0301PatientsReasonForVisitQlfrCode3;
        return this;
    }

    @JsonProperty("hi03_02_patientsReasonForVisitCode3")
    public String getHi0302PatientsReasonForVisitCode3() {
        return hi0302PatientsReasonForVisitCode3;
    }

    @JsonProperty("hi03_02_patientsReasonForVisitCode3")
    public void setHi0302PatientsReasonForVisitCode3(String hi0302PatientsReasonForVisitCode3) {
        this.hi0302PatientsReasonForVisitCode3 = hi0302PatientsReasonForVisitCode3;
    }

    public ClaimInfo withHi0302PatientsReasonForVisitCode3(String hi0302PatientsReasonForVisitCode3) {
        this.hi0302PatientsReasonForVisitCode3 = hi0302PatientsReasonForVisitCode3;
        return this;
    }

    @JsonProperty("hi01_externalCauseOfInjuryInfo1")
    public String getHi01ExternalCauseOfInjuryInfo1() {
        return hi01ExternalCauseOfInjuryInfo1;
    }

    @JsonProperty("hi01_externalCauseOfInjuryInfo1")
    public void setHi01ExternalCauseOfInjuryInfo1(String hi01ExternalCauseOfInjuryInfo1) {
        this.hi01ExternalCauseOfInjuryInfo1 = hi01ExternalCauseOfInjuryInfo1;
    }

    public ClaimInfo withHi01ExternalCauseOfInjuryInfo1(String hi01ExternalCauseOfInjuryInfo1) {
        this.hi01ExternalCauseOfInjuryInfo1 = hi01ExternalCauseOfInjuryInfo1;
        return this;
    }

    @JsonProperty("hi01_01_externalCauseOfInjuryQlfrCode1")
    public String getHi0101ExternalCauseOfInjuryQlfrCode1() {
        return hi0101ExternalCauseOfInjuryQlfrCode1;
    }

    @JsonProperty("hi01_01_externalCauseOfInjuryQlfrCode1")
    public void setHi0101ExternalCauseOfInjuryQlfrCode1(String hi0101ExternalCauseOfInjuryQlfrCode1) {
        this.hi0101ExternalCauseOfInjuryQlfrCode1 = hi0101ExternalCauseOfInjuryQlfrCode1;
    }

    public ClaimInfo withHi0101ExternalCauseOfInjuryQlfrCode1(String hi0101ExternalCauseOfInjuryQlfrCode1) {
        this.hi0101ExternalCauseOfInjuryQlfrCode1 = hi0101ExternalCauseOfInjuryQlfrCode1;
        return this;
    }

    @JsonProperty("hi01_02_externalCauseOfInjuryCode1")
    public String getHi0102ExternalCauseOfInjuryCode1() {
        return hi0102ExternalCauseOfInjuryCode1;
    }

    @JsonProperty("hi01_02_externalCauseOfInjuryCode1")
    public void setHi0102ExternalCauseOfInjuryCode1(String hi0102ExternalCauseOfInjuryCode1) {
        this.hi0102ExternalCauseOfInjuryCode1 = hi0102ExternalCauseOfInjuryCode1;
    }

    public ClaimInfo withHi0102ExternalCauseOfInjuryCode1(String hi0102ExternalCauseOfInjuryCode1) {
        this.hi0102ExternalCauseOfInjuryCode1 = hi0102ExternalCauseOfInjuryCode1;
        return this;
    }

    @JsonProperty("hi01_09_causeOfInjuryPresentOnAdmissionIndicator1")
    public String getHi0109CauseOfInjuryPresentOnAdmissionIndicator1() {
        return hi0109CauseOfInjuryPresentOnAdmissionIndicator1;
    }

    @JsonProperty("hi01_09_causeOfInjuryPresentOnAdmissionIndicator1")
    public void setHi0109CauseOfInjuryPresentOnAdmissionIndicator1(String hi0109CauseOfInjuryPresentOnAdmissionIndicator1) {
        this.hi0109CauseOfInjuryPresentOnAdmissionIndicator1 = hi0109CauseOfInjuryPresentOnAdmissionIndicator1;
    }

    public ClaimInfo withHi0109CauseOfInjuryPresentOnAdmissionIndicator1(String hi0109CauseOfInjuryPresentOnAdmissionIndicator1) {
        this.hi0109CauseOfInjuryPresentOnAdmissionIndicator1 = hi0109CauseOfInjuryPresentOnAdmissionIndicator1;
        return this;
    }

    @JsonProperty("hi02_externalCauseOfInjuryInfo2")
    public String getHi02ExternalCauseOfInjuryInfo2() {
        return hi02ExternalCauseOfInjuryInfo2;
    }

    @JsonProperty("hi02_externalCauseOfInjuryInfo2")
    public void setHi02ExternalCauseOfInjuryInfo2(String hi02ExternalCauseOfInjuryInfo2) {
        this.hi02ExternalCauseOfInjuryInfo2 = hi02ExternalCauseOfInjuryInfo2;
    }

    public ClaimInfo withHi02ExternalCauseOfInjuryInfo2(String hi02ExternalCauseOfInjuryInfo2) {
        this.hi02ExternalCauseOfInjuryInfo2 = hi02ExternalCauseOfInjuryInfo2;
        return this;
    }

    @JsonProperty("hi02_01_externalCauseOfInjuryQlfrCode2")
    public String getHi0201ExternalCauseOfInjuryQlfrCode2() {
        return hi0201ExternalCauseOfInjuryQlfrCode2;
    }

    @JsonProperty("hi02_01_externalCauseOfInjuryQlfrCode2")
    public void setHi0201ExternalCauseOfInjuryQlfrCode2(String hi0201ExternalCauseOfInjuryQlfrCode2) {
        this.hi0201ExternalCauseOfInjuryQlfrCode2 = hi0201ExternalCauseOfInjuryQlfrCode2;
    }

    public ClaimInfo withHi0201ExternalCauseOfInjuryQlfrCode2(String hi0201ExternalCauseOfInjuryQlfrCode2) {
        this.hi0201ExternalCauseOfInjuryQlfrCode2 = hi0201ExternalCauseOfInjuryQlfrCode2;
        return this;
    }

    @JsonProperty("hi02_02_externalCauseOfInjuryCode2")
    public String getHi0202ExternalCauseOfInjuryCode2() {
        return hi0202ExternalCauseOfInjuryCode2;
    }

    @JsonProperty("hi02_02_externalCauseOfInjuryCode2")
    public void setHi0202ExternalCauseOfInjuryCode2(String hi0202ExternalCauseOfInjuryCode2) {
        this.hi0202ExternalCauseOfInjuryCode2 = hi0202ExternalCauseOfInjuryCode2;
    }

    public ClaimInfo withHi0202ExternalCauseOfInjuryCode2(String hi0202ExternalCauseOfInjuryCode2) {
        this.hi0202ExternalCauseOfInjuryCode2 = hi0202ExternalCauseOfInjuryCode2;
        return this;
    }

    @JsonProperty("hi02_09_causeOfInjuryPresentOnAdmissionIndicator2")
    public String getHi0209CauseOfInjuryPresentOnAdmissionIndicator2() {
        return hi0209CauseOfInjuryPresentOnAdmissionIndicator2;
    }

    @JsonProperty("hi02_09_causeOfInjuryPresentOnAdmissionIndicator2")
    public void setHi0209CauseOfInjuryPresentOnAdmissionIndicator2(String hi0209CauseOfInjuryPresentOnAdmissionIndicator2) {
        this.hi0209CauseOfInjuryPresentOnAdmissionIndicator2 = hi0209CauseOfInjuryPresentOnAdmissionIndicator2;
    }

    public ClaimInfo withHi0209CauseOfInjuryPresentOnAdmissionIndicator2(String hi0209CauseOfInjuryPresentOnAdmissionIndicator2) {
        this.hi0209CauseOfInjuryPresentOnAdmissionIndicator2 = hi0209CauseOfInjuryPresentOnAdmissionIndicator2;
        return this;
    }

    @JsonProperty("hi03_externalCauseOfInjuryInfo3")
    public String getHi03ExternalCauseOfInjuryInfo3() {
        return hi03ExternalCauseOfInjuryInfo3;
    }

    @JsonProperty("hi03_externalCauseOfInjuryInfo3")
    public void setHi03ExternalCauseOfInjuryInfo3(String hi03ExternalCauseOfInjuryInfo3) {
        this.hi03ExternalCauseOfInjuryInfo3 = hi03ExternalCauseOfInjuryInfo3;
    }

    public ClaimInfo withHi03ExternalCauseOfInjuryInfo3(String hi03ExternalCauseOfInjuryInfo3) {
        this.hi03ExternalCauseOfInjuryInfo3 = hi03ExternalCauseOfInjuryInfo3;
        return this;
    }

    @JsonProperty("hi03_01_externalCauseOfInjuryQlfrCode3")
    public String getHi0301ExternalCauseOfInjuryQlfrCode3() {
        return hi0301ExternalCauseOfInjuryQlfrCode3;
    }

    @JsonProperty("hi03_01_externalCauseOfInjuryQlfrCode3")
    public void setHi0301ExternalCauseOfInjuryQlfrCode3(String hi0301ExternalCauseOfInjuryQlfrCode3) {
        this.hi0301ExternalCauseOfInjuryQlfrCode3 = hi0301ExternalCauseOfInjuryQlfrCode3;
    }

    public ClaimInfo withHi0301ExternalCauseOfInjuryQlfrCode3(String hi0301ExternalCauseOfInjuryQlfrCode3) {
        this.hi0301ExternalCauseOfInjuryQlfrCode3 = hi0301ExternalCauseOfInjuryQlfrCode3;
        return this;
    }

    @JsonProperty("hi03_02_externalCauseOfInjuryCode3")
    public String getHi0302ExternalCauseOfInjuryCode3() {
        return hi0302ExternalCauseOfInjuryCode3;
    }

    @JsonProperty("hi03_02_externalCauseOfInjuryCode3")
    public void setHi0302ExternalCauseOfInjuryCode3(String hi0302ExternalCauseOfInjuryCode3) {
        this.hi0302ExternalCauseOfInjuryCode3 = hi0302ExternalCauseOfInjuryCode3;
    }

    public ClaimInfo withHi0302ExternalCauseOfInjuryCode3(String hi0302ExternalCauseOfInjuryCode3) {
        this.hi0302ExternalCauseOfInjuryCode3 = hi0302ExternalCauseOfInjuryCode3;
        return this;
    }

    @JsonProperty("hi03_09_causeOfInjuryPresentOnAdmissionIndicator3")
    public String getHi0309CauseOfInjuryPresentOnAdmissionIndicator3() {
        return hi0309CauseOfInjuryPresentOnAdmissionIndicator3;
    }

    @JsonProperty("hi03_09_causeOfInjuryPresentOnAdmissionIndicator3")
    public void setHi0309CauseOfInjuryPresentOnAdmissionIndicator3(String hi0309CauseOfInjuryPresentOnAdmissionIndicator3) {
        this.hi0309CauseOfInjuryPresentOnAdmissionIndicator3 = hi0309CauseOfInjuryPresentOnAdmissionIndicator3;
    }

    public ClaimInfo withHi0309CauseOfInjuryPresentOnAdmissionIndicator3(String hi0309CauseOfInjuryPresentOnAdmissionIndicator3) {
        this.hi0309CauseOfInjuryPresentOnAdmissionIndicator3 = hi0309CauseOfInjuryPresentOnAdmissionIndicator3;
        return this;
    }

    @JsonProperty("hi04_externalCauseOfInjuryInfo4")
    public String getHi04ExternalCauseOfInjuryInfo4() {
        return hi04ExternalCauseOfInjuryInfo4;
    }

    @JsonProperty("hi04_externalCauseOfInjuryInfo4")
    public void setHi04ExternalCauseOfInjuryInfo4(String hi04ExternalCauseOfInjuryInfo4) {
        this.hi04ExternalCauseOfInjuryInfo4 = hi04ExternalCauseOfInjuryInfo4;
    }

    public ClaimInfo withHi04ExternalCauseOfInjuryInfo4(String hi04ExternalCauseOfInjuryInfo4) {
        this.hi04ExternalCauseOfInjuryInfo4 = hi04ExternalCauseOfInjuryInfo4;
        return this;
    }

    @JsonProperty("hi04_01_externalCauseOfInjuryQlfrCode4")
    public String getHi0401ExternalCauseOfInjuryQlfrCode4() {
        return hi0401ExternalCauseOfInjuryQlfrCode4;
    }

    @JsonProperty("hi04_01_externalCauseOfInjuryQlfrCode4")
    public void setHi0401ExternalCauseOfInjuryQlfrCode4(String hi0401ExternalCauseOfInjuryQlfrCode4) {
        this.hi0401ExternalCauseOfInjuryQlfrCode4 = hi0401ExternalCauseOfInjuryQlfrCode4;
    }

    public ClaimInfo withHi0401ExternalCauseOfInjuryQlfrCode4(String hi0401ExternalCauseOfInjuryQlfrCode4) {
        this.hi0401ExternalCauseOfInjuryQlfrCode4 = hi0401ExternalCauseOfInjuryQlfrCode4;
        return this;
    }

    @JsonProperty("hi04_02_externalCauseOfInjuryCode4")
    public String getHi0402ExternalCauseOfInjuryCode4() {
        return hi0402ExternalCauseOfInjuryCode4;
    }

    @JsonProperty("hi04_02_externalCauseOfInjuryCode4")
    public void setHi0402ExternalCauseOfInjuryCode4(String hi0402ExternalCauseOfInjuryCode4) {
        this.hi0402ExternalCauseOfInjuryCode4 = hi0402ExternalCauseOfInjuryCode4;
    }

    public ClaimInfo withHi0402ExternalCauseOfInjuryCode4(String hi0402ExternalCauseOfInjuryCode4) {
        this.hi0402ExternalCauseOfInjuryCode4 = hi0402ExternalCauseOfInjuryCode4;
        return this;
    }

    @JsonProperty("hi04_09_causeOfInjuryPresentOnAdmissionIndicator4")
    public String getHi0409CauseOfInjuryPresentOnAdmissionIndicator4() {
        return hi0409CauseOfInjuryPresentOnAdmissionIndicator4;
    }

    @JsonProperty("hi04_09_causeOfInjuryPresentOnAdmissionIndicator4")
    public void setHi0409CauseOfInjuryPresentOnAdmissionIndicator4(String hi0409CauseOfInjuryPresentOnAdmissionIndicator4) {
        this.hi0409CauseOfInjuryPresentOnAdmissionIndicator4 = hi0409CauseOfInjuryPresentOnAdmissionIndicator4;
    }

    public ClaimInfo withHi0409CauseOfInjuryPresentOnAdmissionIndicator4(String hi0409CauseOfInjuryPresentOnAdmissionIndicator4) {
        this.hi0409CauseOfInjuryPresentOnAdmissionIndicator4 = hi0409CauseOfInjuryPresentOnAdmissionIndicator4;
        return this;
    }

    @JsonProperty("hi05_externalCauseOfInjuryInfo5")
    public String getHi05ExternalCauseOfInjuryInfo5() {
        return hi05ExternalCauseOfInjuryInfo5;
    }

    @JsonProperty("hi05_externalCauseOfInjuryInfo5")
    public void setHi05ExternalCauseOfInjuryInfo5(String hi05ExternalCauseOfInjuryInfo5) {
        this.hi05ExternalCauseOfInjuryInfo5 = hi05ExternalCauseOfInjuryInfo5;
    }

    public ClaimInfo withHi05ExternalCauseOfInjuryInfo5(String hi05ExternalCauseOfInjuryInfo5) {
        this.hi05ExternalCauseOfInjuryInfo5 = hi05ExternalCauseOfInjuryInfo5;
        return this;
    }

    @JsonProperty("hi05_01_externalCauseOfInjuryQlfrCode5")
    public String getHi0501ExternalCauseOfInjuryQlfrCode5() {
        return hi0501ExternalCauseOfInjuryQlfrCode5;
    }

    @JsonProperty("hi05_01_externalCauseOfInjuryQlfrCode5")
    public void setHi0501ExternalCauseOfInjuryQlfrCode5(String hi0501ExternalCauseOfInjuryQlfrCode5) {
        this.hi0501ExternalCauseOfInjuryQlfrCode5 = hi0501ExternalCauseOfInjuryQlfrCode5;
    }

    public ClaimInfo withHi0501ExternalCauseOfInjuryQlfrCode5(String hi0501ExternalCauseOfInjuryQlfrCode5) {
        this.hi0501ExternalCauseOfInjuryQlfrCode5 = hi0501ExternalCauseOfInjuryQlfrCode5;
        return this;
    }

    @JsonProperty("hi05_02_externalCauseOfInjuryCode5")
    public String getHi0502ExternalCauseOfInjuryCode5() {
        return hi0502ExternalCauseOfInjuryCode5;
    }

    @JsonProperty("hi05_02_externalCauseOfInjuryCode5")
    public void setHi0502ExternalCauseOfInjuryCode5(String hi0502ExternalCauseOfInjuryCode5) {
        this.hi0502ExternalCauseOfInjuryCode5 = hi0502ExternalCauseOfInjuryCode5;
    }

    public ClaimInfo withHi0502ExternalCauseOfInjuryCode5(String hi0502ExternalCauseOfInjuryCode5) {
        this.hi0502ExternalCauseOfInjuryCode5 = hi0502ExternalCauseOfInjuryCode5;
        return this;
    }

    @JsonProperty("hi05_09_causeOfInjuryPresentOnAdmissionIndicator5")
    public String getHi0509CauseOfInjuryPresentOnAdmissionIndicator5() {
        return hi0509CauseOfInjuryPresentOnAdmissionIndicator5;
    }

    @JsonProperty("hi05_09_causeOfInjuryPresentOnAdmissionIndicator5")
    public void setHi0509CauseOfInjuryPresentOnAdmissionIndicator5(String hi0509CauseOfInjuryPresentOnAdmissionIndicator5) {
        this.hi0509CauseOfInjuryPresentOnAdmissionIndicator5 = hi0509CauseOfInjuryPresentOnAdmissionIndicator5;
    }

    public ClaimInfo withHi0509CauseOfInjuryPresentOnAdmissionIndicator5(String hi0509CauseOfInjuryPresentOnAdmissionIndicator5) {
        this.hi0509CauseOfInjuryPresentOnAdmissionIndicator5 = hi0509CauseOfInjuryPresentOnAdmissionIndicator5;
        return this;
    }

    @JsonProperty("hi06_externalCauseOfInjuryInfo6")
    public String getHi06ExternalCauseOfInjuryInfo6() {
        return hi06ExternalCauseOfInjuryInfo6;
    }

    @JsonProperty("hi06_externalCauseOfInjuryInfo6")
    public void setHi06ExternalCauseOfInjuryInfo6(String hi06ExternalCauseOfInjuryInfo6) {
        this.hi06ExternalCauseOfInjuryInfo6 = hi06ExternalCauseOfInjuryInfo6;
    }

    public ClaimInfo withHi06ExternalCauseOfInjuryInfo6(String hi06ExternalCauseOfInjuryInfo6) {
        this.hi06ExternalCauseOfInjuryInfo6 = hi06ExternalCauseOfInjuryInfo6;
        return this;
    }

    @JsonProperty("hi06_01_externalCauseOfInjuryQlfrCode6")
    public String getHi0601ExternalCauseOfInjuryQlfrCode6() {
        return hi0601ExternalCauseOfInjuryQlfrCode6;
    }

    @JsonProperty("hi06_01_externalCauseOfInjuryQlfrCode6")
    public void setHi0601ExternalCauseOfInjuryQlfrCode6(String hi0601ExternalCauseOfInjuryQlfrCode6) {
        this.hi0601ExternalCauseOfInjuryQlfrCode6 = hi0601ExternalCauseOfInjuryQlfrCode6;
    }

    public ClaimInfo withHi0601ExternalCauseOfInjuryQlfrCode6(String hi0601ExternalCauseOfInjuryQlfrCode6) {
        this.hi0601ExternalCauseOfInjuryQlfrCode6 = hi0601ExternalCauseOfInjuryQlfrCode6;
        return this;
    }

    @JsonProperty("hi06_02_externalCauseOfInjuryCode6")
    public String getHi0602ExternalCauseOfInjuryCode6() {
        return hi0602ExternalCauseOfInjuryCode6;
    }

    @JsonProperty("hi06_02_externalCauseOfInjuryCode6")
    public void setHi0602ExternalCauseOfInjuryCode6(String hi0602ExternalCauseOfInjuryCode6) {
        this.hi0602ExternalCauseOfInjuryCode6 = hi0602ExternalCauseOfInjuryCode6;
    }

    public ClaimInfo withHi0602ExternalCauseOfInjuryCode6(String hi0602ExternalCauseOfInjuryCode6) {
        this.hi0602ExternalCauseOfInjuryCode6 = hi0602ExternalCauseOfInjuryCode6;
        return this;
    }

    @JsonProperty("hi06_09_causeOfInjuryPresentOnAdmissionIndicator6")
    public String getHi0609CauseOfInjuryPresentOnAdmissionIndicator6() {
        return hi0609CauseOfInjuryPresentOnAdmissionIndicator6;
    }

    @JsonProperty("hi06_09_causeOfInjuryPresentOnAdmissionIndicator6")
    public void setHi0609CauseOfInjuryPresentOnAdmissionIndicator6(String hi0609CauseOfInjuryPresentOnAdmissionIndicator6) {
        this.hi0609CauseOfInjuryPresentOnAdmissionIndicator6 = hi0609CauseOfInjuryPresentOnAdmissionIndicator6;
    }

    public ClaimInfo withHi0609CauseOfInjuryPresentOnAdmissionIndicator6(String hi0609CauseOfInjuryPresentOnAdmissionIndicator6) {
        this.hi0609CauseOfInjuryPresentOnAdmissionIndicator6 = hi0609CauseOfInjuryPresentOnAdmissionIndicator6;
        return this;
    }

    @JsonProperty("hi07_externalCauseOfInjuryInfo7")
    public String getHi07ExternalCauseOfInjuryInfo7() {
        return hi07ExternalCauseOfInjuryInfo7;
    }

    @JsonProperty("hi07_externalCauseOfInjuryInfo7")
    public void setHi07ExternalCauseOfInjuryInfo7(String hi07ExternalCauseOfInjuryInfo7) {
        this.hi07ExternalCauseOfInjuryInfo7 = hi07ExternalCauseOfInjuryInfo7;
    }

    public ClaimInfo withHi07ExternalCauseOfInjuryInfo7(String hi07ExternalCauseOfInjuryInfo7) {
        this.hi07ExternalCauseOfInjuryInfo7 = hi07ExternalCauseOfInjuryInfo7;
        return this;
    }

    @JsonProperty("hi07_01_externalCauseOfInjuryQlfrCode7")
    public String getHi0701ExternalCauseOfInjuryQlfrCode7() {
        return hi0701ExternalCauseOfInjuryQlfrCode7;
    }

    @JsonProperty("hi07_01_externalCauseOfInjuryQlfrCode7")
    public void setHi0701ExternalCauseOfInjuryQlfrCode7(String hi0701ExternalCauseOfInjuryQlfrCode7) {
        this.hi0701ExternalCauseOfInjuryQlfrCode7 = hi0701ExternalCauseOfInjuryQlfrCode7;
    }

    public ClaimInfo withHi0701ExternalCauseOfInjuryQlfrCode7(String hi0701ExternalCauseOfInjuryQlfrCode7) {
        this.hi0701ExternalCauseOfInjuryQlfrCode7 = hi0701ExternalCauseOfInjuryQlfrCode7;
        return this;
    }

    @JsonProperty("hi07_02_externalCauseOfInjuryCode7")
    public String getHi0702ExternalCauseOfInjuryCode7() {
        return hi0702ExternalCauseOfInjuryCode7;
    }

    @JsonProperty("hi07_02_externalCauseOfInjuryCode7")
    public void setHi0702ExternalCauseOfInjuryCode7(String hi0702ExternalCauseOfInjuryCode7) {
        this.hi0702ExternalCauseOfInjuryCode7 = hi0702ExternalCauseOfInjuryCode7;
    }

    public ClaimInfo withHi0702ExternalCauseOfInjuryCode7(String hi0702ExternalCauseOfInjuryCode7) {
        this.hi0702ExternalCauseOfInjuryCode7 = hi0702ExternalCauseOfInjuryCode7;
        return this;
    }

    @JsonProperty("hi07_09_causeOfInjuryPresentOnAdmissionIndicator7")
    public String getHi0709CauseOfInjuryPresentOnAdmissionIndicator7() {
        return hi0709CauseOfInjuryPresentOnAdmissionIndicator7;
    }

    @JsonProperty("hi07_09_causeOfInjuryPresentOnAdmissionIndicator7")
    public void setHi0709CauseOfInjuryPresentOnAdmissionIndicator7(String hi0709CauseOfInjuryPresentOnAdmissionIndicator7) {
        this.hi0709CauseOfInjuryPresentOnAdmissionIndicator7 = hi0709CauseOfInjuryPresentOnAdmissionIndicator7;
    }

    public ClaimInfo withHi0709CauseOfInjuryPresentOnAdmissionIndicator7(String hi0709CauseOfInjuryPresentOnAdmissionIndicator7) {
        this.hi0709CauseOfInjuryPresentOnAdmissionIndicator7 = hi0709CauseOfInjuryPresentOnAdmissionIndicator7;
        return this;
    }

    @JsonProperty("hi08_externalCauseOfInjuryInfo8")
    public String getHi08ExternalCauseOfInjuryInfo8() {
        return hi08ExternalCauseOfInjuryInfo8;
    }

    @JsonProperty("hi08_externalCauseOfInjuryInfo8")
    public void setHi08ExternalCauseOfInjuryInfo8(String hi08ExternalCauseOfInjuryInfo8) {
        this.hi08ExternalCauseOfInjuryInfo8 = hi08ExternalCauseOfInjuryInfo8;
    }

    public ClaimInfo withHi08ExternalCauseOfInjuryInfo8(String hi08ExternalCauseOfInjuryInfo8) {
        this.hi08ExternalCauseOfInjuryInfo8 = hi08ExternalCauseOfInjuryInfo8;
        return this;
    }

    @JsonProperty("hi08_01_externalCauseOfInjuryQlfrCode8")
    public String getHi0801ExternalCauseOfInjuryQlfrCode8() {
        return hi0801ExternalCauseOfInjuryQlfrCode8;
    }

    @JsonProperty("hi08_01_externalCauseOfInjuryQlfrCode8")
    public void setHi0801ExternalCauseOfInjuryQlfrCode8(String hi0801ExternalCauseOfInjuryQlfrCode8) {
        this.hi0801ExternalCauseOfInjuryQlfrCode8 = hi0801ExternalCauseOfInjuryQlfrCode8;
    }

    public ClaimInfo withHi0801ExternalCauseOfInjuryQlfrCode8(String hi0801ExternalCauseOfInjuryQlfrCode8) {
        this.hi0801ExternalCauseOfInjuryQlfrCode8 = hi0801ExternalCauseOfInjuryQlfrCode8;
        return this;
    }

    @JsonProperty("hi08_02_externalCauseOfInjuryCode8")
    public String getHi0802ExternalCauseOfInjuryCode8() {
        return hi0802ExternalCauseOfInjuryCode8;
    }

    @JsonProperty("hi08_02_externalCauseOfInjuryCode8")
    public void setHi0802ExternalCauseOfInjuryCode8(String hi0802ExternalCauseOfInjuryCode8) {
        this.hi0802ExternalCauseOfInjuryCode8 = hi0802ExternalCauseOfInjuryCode8;
    }

    public ClaimInfo withHi0802ExternalCauseOfInjuryCode8(String hi0802ExternalCauseOfInjuryCode8) {
        this.hi0802ExternalCauseOfInjuryCode8 = hi0802ExternalCauseOfInjuryCode8;
        return this;
    }

    @JsonProperty("hi08_09_causeOfInjuryPresentOnAdmissionIndicator8")
    public String getHi0809CauseOfInjuryPresentOnAdmissionIndicator8() {
        return hi0809CauseOfInjuryPresentOnAdmissionIndicator8;
    }

    @JsonProperty("hi08_09_causeOfInjuryPresentOnAdmissionIndicator8")
    public void setHi0809CauseOfInjuryPresentOnAdmissionIndicator8(String hi0809CauseOfInjuryPresentOnAdmissionIndicator8) {
        this.hi0809CauseOfInjuryPresentOnAdmissionIndicator8 = hi0809CauseOfInjuryPresentOnAdmissionIndicator8;
    }

    public ClaimInfo withHi0809CauseOfInjuryPresentOnAdmissionIndicator8(String hi0809CauseOfInjuryPresentOnAdmissionIndicator8) {
        this.hi0809CauseOfInjuryPresentOnAdmissionIndicator8 = hi0809CauseOfInjuryPresentOnAdmissionIndicator8;
        return this;
    }

    @JsonProperty("hi09_externalCauseOfInjuryInfo9")
    public String getHi09ExternalCauseOfInjuryInfo9() {
        return hi09ExternalCauseOfInjuryInfo9;
    }

    @JsonProperty("hi09_externalCauseOfInjuryInfo9")
    public void setHi09ExternalCauseOfInjuryInfo9(String hi09ExternalCauseOfInjuryInfo9) {
        this.hi09ExternalCauseOfInjuryInfo9 = hi09ExternalCauseOfInjuryInfo9;
    }

    public ClaimInfo withHi09ExternalCauseOfInjuryInfo9(String hi09ExternalCauseOfInjuryInfo9) {
        this.hi09ExternalCauseOfInjuryInfo9 = hi09ExternalCauseOfInjuryInfo9;
        return this;
    }

    @JsonProperty("hi09_01_externalCauseOfInjuryQlfrCode9")
    public String getHi0901ExternalCauseOfInjuryQlfrCode9() {
        return hi0901ExternalCauseOfInjuryQlfrCode9;
    }

    @JsonProperty("hi09_01_externalCauseOfInjuryQlfrCode9")
    public void setHi0901ExternalCauseOfInjuryQlfrCode9(String hi0901ExternalCauseOfInjuryQlfrCode9) {
        this.hi0901ExternalCauseOfInjuryQlfrCode9 = hi0901ExternalCauseOfInjuryQlfrCode9;
    }

    public ClaimInfo withHi0901ExternalCauseOfInjuryQlfrCode9(String hi0901ExternalCauseOfInjuryQlfrCode9) {
        this.hi0901ExternalCauseOfInjuryQlfrCode9 = hi0901ExternalCauseOfInjuryQlfrCode9;
        return this;
    }

    @JsonProperty("hi09_02_externalCauseOfInjuryCode9")
    public String getHi0902ExternalCauseOfInjuryCode9() {
        return hi0902ExternalCauseOfInjuryCode9;
    }

    @JsonProperty("hi09_02_externalCauseOfInjuryCode9")
    public void setHi0902ExternalCauseOfInjuryCode9(String hi0902ExternalCauseOfInjuryCode9) {
        this.hi0902ExternalCauseOfInjuryCode9 = hi0902ExternalCauseOfInjuryCode9;
    }

    public ClaimInfo withHi0902ExternalCauseOfInjuryCode9(String hi0902ExternalCauseOfInjuryCode9) {
        this.hi0902ExternalCauseOfInjuryCode9 = hi0902ExternalCauseOfInjuryCode9;
        return this;
    }

    @JsonProperty("hi09_09_causeOfInjuryPresentOnAdmissionIndicator9")
    public String getHi0909CauseOfInjuryPresentOnAdmissionIndicator9() {
        return hi0909CauseOfInjuryPresentOnAdmissionIndicator9;
    }

    @JsonProperty("hi09_09_causeOfInjuryPresentOnAdmissionIndicator9")
    public void setHi0909CauseOfInjuryPresentOnAdmissionIndicator9(String hi0909CauseOfInjuryPresentOnAdmissionIndicator9) {
        this.hi0909CauseOfInjuryPresentOnAdmissionIndicator9 = hi0909CauseOfInjuryPresentOnAdmissionIndicator9;
    }

    public ClaimInfo withHi0909CauseOfInjuryPresentOnAdmissionIndicator9(String hi0909CauseOfInjuryPresentOnAdmissionIndicator9) {
        this.hi0909CauseOfInjuryPresentOnAdmissionIndicator9 = hi0909CauseOfInjuryPresentOnAdmissionIndicator9;
        return this;
    }

    @JsonProperty("hi10_externalCauseOfInjuryInfo10")
    public String getHi10ExternalCauseOfInjuryInfo10() {
        return hi10ExternalCauseOfInjuryInfo10;
    }

    @JsonProperty("hi10_externalCauseOfInjuryInfo10")
    public void setHi10ExternalCauseOfInjuryInfo10(String hi10ExternalCauseOfInjuryInfo10) {
        this.hi10ExternalCauseOfInjuryInfo10 = hi10ExternalCauseOfInjuryInfo10;
    }

    public ClaimInfo withHi10ExternalCauseOfInjuryInfo10(String hi10ExternalCauseOfInjuryInfo10) {
        this.hi10ExternalCauseOfInjuryInfo10 = hi10ExternalCauseOfInjuryInfo10;
        return this;
    }

    @JsonProperty("hi10_01_externalCauseOfInjuryQlfrCode10")
    public String getHi1001ExternalCauseOfInjuryQlfrCode10() {
        return hi1001ExternalCauseOfInjuryQlfrCode10;
    }

    @JsonProperty("hi10_01_externalCauseOfInjuryQlfrCode10")
    public void setHi1001ExternalCauseOfInjuryQlfrCode10(String hi1001ExternalCauseOfInjuryQlfrCode10) {
        this.hi1001ExternalCauseOfInjuryQlfrCode10 = hi1001ExternalCauseOfInjuryQlfrCode10;
    }

    public ClaimInfo withHi1001ExternalCauseOfInjuryQlfrCode10(String hi1001ExternalCauseOfInjuryQlfrCode10) {
        this.hi1001ExternalCauseOfInjuryQlfrCode10 = hi1001ExternalCauseOfInjuryQlfrCode10;
        return this;
    }

    @JsonProperty("hi10_02_externalCauseOfInjuryCode10")
    public String getHi1002ExternalCauseOfInjuryCode10() {
        return hi1002ExternalCauseOfInjuryCode10;
    }

    @JsonProperty("hi10_02_externalCauseOfInjuryCode10")
    public void setHi1002ExternalCauseOfInjuryCode10(String hi1002ExternalCauseOfInjuryCode10) {
        this.hi1002ExternalCauseOfInjuryCode10 = hi1002ExternalCauseOfInjuryCode10;
    }

    public ClaimInfo withHi1002ExternalCauseOfInjuryCode10(String hi1002ExternalCauseOfInjuryCode10) {
        this.hi1002ExternalCauseOfInjuryCode10 = hi1002ExternalCauseOfInjuryCode10;
        return this;
    }

    @JsonProperty("hi10_09_causeOfInjuryPresentOnAdmissionIndicator10")
    public String getHi1009CauseOfInjuryPresentOnAdmissionIndicator10() {
        return hi1009CauseOfInjuryPresentOnAdmissionIndicator10;
    }

    @JsonProperty("hi10_09_causeOfInjuryPresentOnAdmissionIndicator10")
    public void setHi1009CauseOfInjuryPresentOnAdmissionIndicator10(String hi1009CauseOfInjuryPresentOnAdmissionIndicator10) {
        this.hi1009CauseOfInjuryPresentOnAdmissionIndicator10 = hi1009CauseOfInjuryPresentOnAdmissionIndicator10;
    }

    public ClaimInfo withHi1009CauseOfInjuryPresentOnAdmissionIndicator10(String hi1009CauseOfInjuryPresentOnAdmissionIndicator10) {
        this.hi1009CauseOfInjuryPresentOnAdmissionIndicator10 = hi1009CauseOfInjuryPresentOnAdmissionIndicator10;
        return this;
    }

    @JsonProperty("hi11_externalCauseOfInjuryInfo11")
    public String getHi11ExternalCauseOfInjuryInfo11() {
        return hi11ExternalCauseOfInjuryInfo11;
    }

    @JsonProperty("hi11_externalCauseOfInjuryInfo11")
    public void setHi11ExternalCauseOfInjuryInfo11(String hi11ExternalCauseOfInjuryInfo11) {
        this.hi11ExternalCauseOfInjuryInfo11 = hi11ExternalCauseOfInjuryInfo11;
    }

    public ClaimInfo withHi11ExternalCauseOfInjuryInfo11(String hi11ExternalCauseOfInjuryInfo11) {
        this.hi11ExternalCauseOfInjuryInfo11 = hi11ExternalCauseOfInjuryInfo11;
        return this;
    }

    @JsonProperty("hi11_01_externalCauseOfInjuryQlfrCode11")
    public String getHi1101ExternalCauseOfInjuryQlfrCode11() {
        return hi1101ExternalCauseOfInjuryQlfrCode11;
    }

    @JsonProperty("hi11_01_externalCauseOfInjuryQlfrCode11")
    public void setHi1101ExternalCauseOfInjuryQlfrCode11(String hi1101ExternalCauseOfInjuryQlfrCode11) {
        this.hi1101ExternalCauseOfInjuryQlfrCode11 = hi1101ExternalCauseOfInjuryQlfrCode11;
    }

    public ClaimInfo withHi1101ExternalCauseOfInjuryQlfrCode11(String hi1101ExternalCauseOfInjuryQlfrCode11) {
        this.hi1101ExternalCauseOfInjuryQlfrCode11 = hi1101ExternalCauseOfInjuryQlfrCode11;
        return this;
    }

    @JsonProperty("hi11_02_externalCauseOfInjuryCode11")
    public String getHi1102ExternalCauseOfInjuryCode11() {
        return hi1102ExternalCauseOfInjuryCode11;
    }

    @JsonProperty("hi11_02_externalCauseOfInjuryCode11")
    public void setHi1102ExternalCauseOfInjuryCode11(String hi1102ExternalCauseOfInjuryCode11) {
        this.hi1102ExternalCauseOfInjuryCode11 = hi1102ExternalCauseOfInjuryCode11;
    }

    public ClaimInfo withHi1102ExternalCauseOfInjuryCode11(String hi1102ExternalCauseOfInjuryCode11) {
        this.hi1102ExternalCauseOfInjuryCode11 = hi1102ExternalCauseOfInjuryCode11;
        return this;
    }

    @JsonProperty("hi11_09_causeOfInjuryPresentOnAdmissionIndicator11")
    public String getHi1109CauseOfInjuryPresentOnAdmissionIndicator11() {
        return hi1109CauseOfInjuryPresentOnAdmissionIndicator11;
    }

    @JsonProperty("hi11_09_causeOfInjuryPresentOnAdmissionIndicator11")
    public void setHi1109CauseOfInjuryPresentOnAdmissionIndicator11(String hi1109CauseOfInjuryPresentOnAdmissionIndicator11) {
        this.hi1109CauseOfInjuryPresentOnAdmissionIndicator11 = hi1109CauseOfInjuryPresentOnAdmissionIndicator11;
    }

    public ClaimInfo withHi1109CauseOfInjuryPresentOnAdmissionIndicator11(String hi1109CauseOfInjuryPresentOnAdmissionIndicator11) {
        this.hi1109CauseOfInjuryPresentOnAdmissionIndicator11 = hi1109CauseOfInjuryPresentOnAdmissionIndicator11;
        return this;
    }

    @JsonProperty("hi12_externalCauseOfInjuryInfo12")
    public String getHi12ExternalCauseOfInjuryInfo12() {
        return hi12ExternalCauseOfInjuryInfo12;
    }

    @JsonProperty("hi12_externalCauseOfInjuryInfo12")
    public void setHi12ExternalCauseOfInjuryInfo12(String hi12ExternalCauseOfInjuryInfo12) {
        this.hi12ExternalCauseOfInjuryInfo12 = hi12ExternalCauseOfInjuryInfo12;
    }

    public ClaimInfo withHi12ExternalCauseOfInjuryInfo12(String hi12ExternalCauseOfInjuryInfo12) {
        this.hi12ExternalCauseOfInjuryInfo12 = hi12ExternalCauseOfInjuryInfo12;
        return this;
    }

    @JsonProperty("hi12_01_externalCauseOfInjuryQlfrCode12")
    public String getHi1201ExternalCauseOfInjuryQlfrCode12() {
        return hi1201ExternalCauseOfInjuryQlfrCode12;
    }

    @JsonProperty("hi12_01_externalCauseOfInjuryQlfrCode12")
    public void setHi1201ExternalCauseOfInjuryQlfrCode12(String hi1201ExternalCauseOfInjuryQlfrCode12) {
        this.hi1201ExternalCauseOfInjuryQlfrCode12 = hi1201ExternalCauseOfInjuryQlfrCode12;
    }

    public ClaimInfo withHi1201ExternalCauseOfInjuryQlfrCode12(String hi1201ExternalCauseOfInjuryQlfrCode12) {
        this.hi1201ExternalCauseOfInjuryQlfrCode12 = hi1201ExternalCauseOfInjuryQlfrCode12;
        return this;
    }

    @JsonProperty("hi12_02_externalCauseOfInjuryCode12")
    public String getHi1202ExternalCauseOfInjuryCode12() {
        return hi1202ExternalCauseOfInjuryCode12;
    }

    @JsonProperty("hi12_02_externalCauseOfInjuryCode12")
    public void setHi1202ExternalCauseOfInjuryCode12(String hi1202ExternalCauseOfInjuryCode12) {
        this.hi1202ExternalCauseOfInjuryCode12 = hi1202ExternalCauseOfInjuryCode12;
    }

    public ClaimInfo withHi1202ExternalCauseOfInjuryCode12(String hi1202ExternalCauseOfInjuryCode12) {
        this.hi1202ExternalCauseOfInjuryCode12 = hi1202ExternalCauseOfInjuryCode12;
        return this;
    }

    @JsonProperty("hi12_09_causeOfInjuryPresentOnAdmissionIndicator12")
    public String getHi1209CauseOfInjuryPresentOnAdmissionIndicator12() {
        return hi1209CauseOfInjuryPresentOnAdmissionIndicator12;
    }

    @JsonProperty("hi12_09_causeOfInjuryPresentOnAdmissionIndicator12")
    public void setHi1209CauseOfInjuryPresentOnAdmissionIndicator12(String hi1209CauseOfInjuryPresentOnAdmissionIndicator12) {
        this.hi1209CauseOfInjuryPresentOnAdmissionIndicator12 = hi1209CauseOfInjuryPresentOnAdmissionIndicator12;
    }

    public ClaimInfo withHi1209CauseOfInjuryPresentOnAdmissionIndicator12(String hi1209CauseOfInjuryPresentOnAdmissionIndicator12) {
        this.hi1209CauseOfInjuryPresentOnAdmissionIndicator12 = hi1209CauseOfInjuryPresentOnAdmissionIndicator12;
        return this;
    }

    @JsonProperty("hi01_DRGInfo1")
    public String getHi01DRGInfo1() {
        return hi01DRGInfo1;
    }

    @JsonProperty("hi01_DRGInfo1")
    public void setHi01DRGInfo1(String hi01DRGInfo1) {
        this.hi01DRGInfo1 = hi01DRGInfo1;
    }

    public ClaimInfo withHi01DRGInfo1(String hi01DRGInfo1) {
        this.hi01DRGInfo1 = hi01DRGInfo1;
        return this;
    }

    @JsonProperty("hi01_01_DRGQlfrCode1")
    public String getHi0101DRGQlfrCode1() {
        return hi0101DRGQlfrCode1;
    }

    @JsonProperty("hi01_01_DRGQlfrCode1")
    public void setHi0101DRGQlfrCode1(String hi0101DRGQlfrCode1) {
        this.hi0101DRGQlfrCode1 = hi0101DRGQlfrCode1;
    }

    public ClaimInfo withHi0101DRGQlfrCode1(String hi0101DRGQlfrCode1) {
        this.hi0101DRGQlfrCode1 = hi0101DRGQlfrCode1;
        return this;
    }

    @JsonProperty("hi11_02_DRGCode1")
    public String getHi1102DRGCode1() {
        return hi1102DRGCode1;
    }

    @JsonProperty("hi11_02_DRGCode1")
    public void setHi1102DRGCode1(String hi1102DRGCode1) {
        this.hi1102DRGCode1 = hi1102DRGCode1;
    }

    public ClaimInfo withHi1102DRGCode1(String hi1102DRGCode1) {
        this.hi1102DRGCode1 = hi1102DRGCode1;
        return this;
    }

    @JsonProperty("hi_otherDiagnosisInfo")
    public List<HiOtherDiagnosisInfo> getHiOtherDiagnosisInfo() {
        return hiOtherDiagnosisInfo;
    }

    @JsonProperty("hi_otherDiagnosisInfo")
    public void setHiOtherDiagnosisInfo(List<HiOtherDiagnosisInfo> hiOtherDiagnosisInfo) {
        this.hiOtherDiagnosisInfo = hiOtherDiagnosisInfo;
    }

    public ClaimInfo withHiOtherDiagnosisInfo(List<HiOtherDiagnosisInfo> hiOtherDiagnosisInfo) {
        this.hiOtherDiagnosisInfo = hiOtherDiagnosisInfo;
        return this;
    }

    @JsonProperty("hi01_principalProcedureInfo")
    public String getHi01PrincipalProcedureInfo() {
        return hi01PrincipalProcedureInfo;
    }

    @JsonProperty("hi01_principalProcedureInfo")
    public void setHi01PrincipalProcedureInfo(String hi01PrincipalProcedureInfo) {
        this.hi01PrincipalProcedureInfo = hi01PrincipalProcedureInfo;
    }

    public ClaimInfo withHi01PrincipalProcedureInfo(String hi01PrincipalProcedureInfo) {
        this.hi01PrincipalProcedureInfo = hi01PrincipalProcedureInfo;
        return this;
    }

    @JsonProperty("hi01_01_principalProcedureInfoQlfr")
    public String getHi0101PrincipalProcedureInfoQlfr() {
        return hi0101PrincipalProcedureInfoQlfr;
    }

    @JsonProperty("hi01_01_principalProcedureInfoQlfr")
    public void setHi0101PrincipalProcedureInfoQlfr(String hi0101PrincipalProcedureInfoQlfr) {
        this.hi0101PrincipalProcedureInfoQlfr = hi0101PrincipalProcedureInfoQlfr;
    }

    public ClaimInfo withHi0101PrincipalProcedureInfoQlfr(String hi0101PrincipalProcedureInfoQlfr) {
        this.hi0101PrincipalProcedureInfoQlfr = hi0101PrincipalProcedureInfoQlfr;
        return this;
    }

    @JsonProperty("hi01_02_principalProcedureCode")
    public String getHi0102PrincipalProcedureCode() {
        return hi0102PrincipalProcedureCode;
    }

    @JsonProperty("hi01_02_principalProcedureCode")
    public void setHi0102PrincipalProcedureCode(String hi0102PrincipalProcedureCode) {
        this.hi0102PrincipalProcedureCode = hi0102PrincipalProcedureCode;
    }

    public ClaimInfo withHi0102PrincipalProcedureCode(String hi0102PrincipalProcedureCode) {
        this.hi0102PrincipalProcedureCode = hi0102PrincipalProcedureCode;
        return this;
    }

    @JsonProperty("hi01_03_principalProcedureDateFormatQlfr")
    public String getHi0103PrincipalProcedureDateFormatQlfr() {
        return hi0103PrincipalProcedureDateFormatQlfr;
    }

    @JsonProperty("hi01_03_principalProcedureDateFormatQlfr")
    public void setHi0103PrincipalProcedureDateFormatQlfr(String hi0103PrincipalProcedureDateFormatQlfr) {
        this.hi0103PrincipalProcedureDateFormatQlfr = hi0103PrincipalProcedureDateFormatQlfr;
    }

    public ClaimInfo withHi0103PrincipalProcedureDateFormatQlfr(String hi0103PrincipalProcedureDateFormatQlfr) {
        this.hi0103PrincipalProcedureDateFormatQlfr = hi0103PrincipalProcedureDateFormatQlfr;
        return this;
    }

    @JsonProperty("hi01_04_principalProcedureDate")
    public String getHi0104PrincipalProcedureDate() {
        return hi0104PrincipalProcedureDate;
    }

    @JsonProperty("hi01_04_principalProcedureDate")
    public void setHi0104PrincipalProcedureDate(String hi0104PrincipalProcedureDate) {
        this.hi0104PrincipalProcedureDate = hi0104PrincipalProcedureDate;
    }

    public ClaimInfo withHi0104PrincipalProcedureDate(String hi0104PrincipalProcedureDate) {
        this.hi0104PrincipalProcedureDate = hi0104PrincipalProcedureDate;
        return this;
    }

    @JsonProperty("hi_otherProcedureInfo")
    public List<HiOtherProcedureInfo> getHiOtherProcedureInfo() {
        return hiOtherProcedureInfo;
    }

    @JsonProperty("hi_otherProcedureInfo")
    public void setHiOtherProcedureInfo(List<HiOtherProcedureInfo> hiOtherProcedureInfo) {
        this.hiOtherProcedureInfo = hiOtherProcedureInfo;
    }

    public ClaimInfo withHiOtherProcedureInfo(List<HiOtherProcedureInfo> hiOtherProcedureInfo) {
        this.hiOtherProcedureInfo = hiOtherProcedureInfo;
        return this;
    }

    @JsonProperty("hi_occurrenceSpanInfo")
    public List<HiOccurrenceSpanInfo> getHiOccurrenceSpanInfo() {
        return hiOccurrenceSpanInfo;
    }

    @JsonProperty("hi_occurrenceSpanInfo")
    public void setHiOccurrenceSpanInfo(List<HiOccurrenceSpanInfo> hiOccurrenceSpanInfo) {
        this.hiOccurrenceSpanInfo = hiOccurrenceSpanInfo;
    }

    public ClaimInfo withHiOccurrenceSpanInfo(List<HiOccurrenceSpanInfo> hiOccurrenceSpanInfo) {
        this.hiOccurrenceSpanInfo = hiOccurrenceSpanInfo;
        return this;
    }

    @JsonProperty("hi_occurrenceInfo")
    public List<HiOccurrenceInfo> getHiOccurrenceInfo() {
        return hiOccurrenceInfo;
    }

    @JsonProperty("hi_occurrenceInfo")
    public void setHiOccurrenceInfo(List<HiOccurrenceInfo> hiOccurrenceInfo) {
        this.hiOccurrenceInfo = hiOccurrenceInfo;
    }

    public ClaimInfo withHiOccurrenceInfo(List<HiOccurrenceInfo> hiOccurrenceInfo) {
        this.hiOccurrenceInfo = hiOccurrenceInfo;
        return this;
    }

    @JsonProperty("hi_valueInfo")
    public List<HiValueInfo> getHiValueInfo() {
        return hiValueInfo;
    }

    @JsonProperty("hi_valueInfo")
    public void setHiValueInfo(List<HiValueInfo> hiValueInfo) {
        this.hiValueInfo = hiValueInfo;
    }

    public ClaimInfo withHiValueInfo(List<HiValueInfo> hiValueInfo) {
        this.hiValueInfo = hiValueInfo;
        return this;
    }

    @JsonProperty("hi_treatmentCodeInfo")
    public List<HiTreatmentCodeInfo> getHiTreatmentCodeInfo() {
        return hiTreatmentCodeInfo;
    }

    @JsonProperty("hi_treatmentCodeInfo")
    public void setHiTreatmentCodeInfo(List<HiTreatmentCodeInfo> hiTreatmentCodeInfo) {
        this.hiTreatmentCodeInfo = hiTreatmentCodeInfo;
    }

    public ClaimInfo withHiTreatmentCodeInfo(List<HiTreatmentCodeInfo> hiTreatmentCodeInfo) {
        this.hiTreatmentCodeInfo = hiTreatmentCodeInfo;
        return this;
    }

    @JsonProperty("hi_conditionCode")
    public List<HiConditionCode> getHiConditionCode() {
        return hiConditionCode;
    }

    @JsonProperty("hi_conditionCode")
    public void setHiConditionCode(List<HiConditionCode> hiConditionCode) {
        this.hiConditionCode = hiConditionCode;
    }

    public ClaimInfo withHiConditionCode(List<HiConditionCode> hiConditionCode) {
        this.hiConditionCode = hiConditionCode;
        return this;
    }

    @JsonProperty("hcp01_pricingMethodology")
    public String getHcp01PricingMethodology() {
        return hcp01PricingMethodology;
    }

    @JsonProperty("hcp01_pricingMethodology")
    public void setHcp01PricingMethodology(String hcp01PricingMethodology) {
        this.hcp01PricingMethodology = hcp01PricingMethodology;
    }

    public ClaimInfo withHcp01PricingMethodology(String hcp01PricingMethodology) {
        this.hcp01PricingMethodology = hcp01PricingMethodology;
        return this;
    }

    @JsonProperty("hcp02_repricedAllowedAmount")
    public String getHcp02RepricedAllowedAmount() {
        return hcp02RepricedAllowedAmount;
    }

    @JsonProperty("hcp02_repricedAllowedAmount")
    public void setHcp02RepricedAllowedAmount(String hcp02RepricedAllowedAmount) {
        this.hcp02RepricedAllowedAmount = hcp02RepricedAllowedAmount;
    }

    public ClaimInfo withHcp02RepricedAllowedAmount(String hcp02RepricedAllowedAmount) {
        this.hcp02RepricedAllowedAmount = hcp02RepricedAllowedAmount;
        return this;
    }

    @JsonProperty("hcp03_repricedSavingAmount")
    public String getHcp03RepricedSavingAmount() {
        return hcp03RepricedSavingAmount;
    }

    @JsonProperty("hcp03_repricedSavingAmount")
    public void setHcp03RepricedSavingAmount(String hcp03RepricedSavingAmount) {
        this.hcp03RepricedSavingAmount = hcp03RepricedSavingAmount;
    }

    public ClaimInfo withHcp03RepricedSavingAmount(String hcp03RepricedSavingAmount) {
        this.hcp03RepricedSavingAmount = hcp03RepricedSavingAmount;
        return this;
    }

    @JsonProperty("hcp04_repricingOrgIdentifier")
    public String getHcp04RepricingOrgIdentifier() {
        return hcp04RepricingOrgIdentifier;
    }

    @JsonProperty("hcp04_repricingOrgIdentifier")
    public void setHcp04RepricingOrgIdentifier(String hcp04RepricingOrgIdentifier) {
        this.hcp04RepricingOrgIdentifier = hcp04RepricingOrgIdentifier;
    }

    public ClaimInfo withHcp04RepricingOrgIdentifier(String hcp04RepricingOrgIdentifier) {
        this.hcp04RepricingOrgIdentifier = hcp04RepricingOrgIdentifier;
        return this;
    }

    @JsonProperty("hcp05_repricingPerDiemFlatRateAmount")
    public String getHcp05RepricingPerDiemFlatRateAmount() {
        return hcp05RepricingPerDiemFlatRateAmount;
    }

    @JsonProperty("hcp05_repricingPerDiemFlatRateAmount")
    public void setHcp05RepricingPerDiemFlatRateAmount(String hcp05RepricingPerDiemFlatRateAmount) {
        this.hcp05RepricingPerDiemFlatRateAmount = hcp05RepricingPerDiemFlatRateAmount;
    }

    public ClaimInfo withHcp05RepricingPerDiemFlatRateAmount(String hcp05RepricingPerDiemFlatRateAmount) {
        this.hcp05RepricingPerDiemFlatRateAmount = hcp05RepricingPerDiemFlatRateAmount;
        return this;
    }

    @JsonProperty("hcp06_repricedApprovedAmbulatoryPatientGroupCode")
    public String getHcp06RepricedApprovedAmbulatoryPatientGroupCode() {
        return hcp06RepricedApprovedAmbulatoryPatientGroupCode;
    }

    @JsonProperty("hcp06_repricedApprovedAmbulatoryPatientGroupCode")
    public void setHcp06RepricedApprovedAmbulatoryPatientGroupCode(String hcp06RepricedApprovedAmbulatoryPatientGroupCode) {
        this.hcp06RepricedApprovedAmbulatoryPatientGroupCode = hcp06RepricedApprovedAmbulatoryPatientGroupCode;
    }

    public ClaimInfo withHcp06RepricedApprovedAmbulatoryPatientGroupCode(String hcp06RepricedApprovedAmbulatoryPatientGroupCode) {
        this.hcp06RepricedApprovedAmbulatoryPatientGroupCode = hcp06RepricedApprovedAmbulatoryPatientGroupCode;
        return this;
    }

    @JsonProperty("hcp07_repricedApprovedAmbulatoryPatientGroupAmount")
    public String getHcp07RepricedApprovedAmbulatoryPatientGroupAmount() {
        return hcp07RepricedApprovedAmbulatoryPatientGroupAmount;
    }

    @JsonProperty("hcp07_repricedApprovedAmbulatoryPatientGroupAmount")
    public void setHcp07RepricedApprovedAmbulatoryPatientGroupAmount(String hcp07RepricedApprovedAmbulatoryPatientGroupAmount) {
        this.hcp07RepricedApprovedAmbulatoryPatientGroupAmount = hcp07RepricedApprovedAmbulatoryPatientGroupAmount;
    }

    public ClaimInfo withHcp07RepricedApprovedAmbulatoryPatientGroupAmount(String hcp07RepricedApprovedAmbulatoryPatientGroupAmount) {
        this.hcp07RepricedApprovedAmbulatoryPatientGroupAmount = hcp07RepricedApprovedAmbulatoryPatientGroupAmount;
        return this;
    }

    @JsonProperty("hcp08_repricedApprovedRevenueCode")
    public String getHcp08RepricedApprovedRevenueCode() {
        return hcp08RepricedApprovedRevenueCode;
    }

    @JsonProperty("hcp08_repricedApprovedRevenueCode")
    public void setHcp08RepricedApprovedRevenueCode(String hcp08RepricedApprovedRevenueCode) {
        this.hcp08RepricedApprovedRevenueCode = hcp08RepricedApprovedRevenueCode;
    }

    public ClaimInfo withHcp08RepricedApprovedRevenueCode(String hcp08RepricedApprovedRevenueCode) {
        this.hcp08RepricedApprovedRevenueCode = hcp08RepricedApprovedRevenueCode;
        return this;
    }

    @JsonProperty("hcp11_unitOrBasisOfMeasurementCode")
    public String getHcp11UnitOrBasisOfMeasurementCode() {
        return hcp11UnitOrBasisOfMeasurementCode;
    }

    @JsonProperty("hcp11_unitOrBasisOfMeasurementCode")
    public void setHcp11UnitOrBasisOfMeasurementCode(String hcp11UnitOrBasisOfMeasurementCode) {
        this.hcp11UnitOrBasisOfMeasurementCode = hcp11UnitOrBasisOfMeasurementCode;
    }

    public ClaimInfo withHcp11UnitOrBasisOfMeasurementCode(String hcp11UnitOrBasisOfMeasurementCode) {
        this.hcp11UnitOrBasisOfMeasurementCode = hcp11UnitOrBasisOfMeasurementCode;
        return this;
    }

    @JsonProperty("hcp12_repricedApprovedServiceUnitCount")
    public String getHcp12RepricedApprovedServiceUnitCount() {
        return hcp12RepricedApprovedServiceUnitCount;
    }

    @JsonProperty("hcp12_repricedApprovedServiceUnitCount")
    public void setHcp12RepricedApprovedServiceUnitCount(String hcp12RepricedApprovedServiceUnitCount) {
        this.hcp12RepricedApprovedServiceUnitCount = hcp12RepricedApprovedServiceUnitCount;
    }

    public ClaimInfo withHcp12RepricedApprovedServiceUnitCount(String hcp12RepricedApprovedServiceUnitCount) {
        this.hcp12RepricedApprovedServiceUnitCount = hcp12RepricedApprovedServiceUnitCount;
        return this;
    }

    @JsonProperty("hcp13_rejectReasonCode")
    public String getHcp13RejectReasonCode() {
        return hcp13RejectReasonCode;
    }

    @JsonProperty("hcp13_rejectReasonCode")
    public void setHcp13RejectReasonCode(String hcp13RejectReasonCode) {
        this.hcp13RejectReasonCode = hcp13RejectReasonCode;
    }

    public ClaimInfo withHcp13RejectReasonCode(String hcp13RejectReasonCode) {
        this.hcp13RejectReasonCode = hcp13RejectReasonCode;
        return this;
    }

    @JsonProperty("hcp14_policyComplianceCode")
    public String getHcp14PolicyComplianceCode() {
        return hcp14PolicyComplianceCode;
    }

    @JsonProperty("hcp14_policyComplianceCode")
    public void setHcp14PolicyComplianceCode(String hcp14PolicyComplianceCode) {
        this.hcp14PolicyComplianceCode = hcp14PolicyComplianceCode;
    }

    public ClaimInfo withHcp14PolicyComplianceCode(String hcp14PolicyComplianceCode) {
        this.hcp14PolicyComplianceCode = hcp14PolicyComplianceCode;
        return this;
    }

    @JsonProperty("hcp15_exceptionCode")
    public String getHcp15ExceptionCode() {
        return hcp15ExceptionCode;
    }

    @JsonProperty("hcp15_exceptionCode")
    public void setHcp15ExceptionCode(String hcp15ExceptionCode) {
        this.hcp15ExceptionCode = hcp15ExceptionCode;
    }

    public ClaimInfo withHcp15ExceptionCode(String hcp15ExceptionCode) {
        this.hcp15ExceptionCode = hcp15ExceptionCode;
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

    public ClaimInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clm01PatientControlNo).append(clm02TotalClaimChargeAmount).append(clm05ServiceLocationInfo).append(clm0501PlaceOfServiceCode).append(clm0502PlaceOfServiceCodeQlfr).append(clm0503ClaimFrequencyCode).append(clm06SupplierSignatureIndicator).append(clm07PlanParticipationCode).append(clm08BenefitsAssignmentCertificationIndicator).append(clm09ReleaseOfInformationCode).append(clm10PatientSignatureSourceCode).append(clm11RelatedCausesInfo).append(clm1101RelatedCausesCode).append(clm1102RelatedCausesCode2).append(clm1104AutoAccidentStateCode).append(clm1105CountryCode).append(clm12SpecialProgramIndicator).append(clm19PredeterminationOfBenefitsCode).append(clm20DelayReasonCode).append(dtp01OnsetOfCurrentIllnessInjuryDateQlfr).append(dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr).append(dtp03OnsetOfCurrentIllnessInjuryDate).append(dtp01InitialTreatmentDateQlfr).append(dtp02InitialTreatmentDateFormatQlfr).append(dtp03InitialTreatmentDate).append(dtp01LastSeenDateQlfr).append(dtp02LastSeenDateFormatQlfr).append(dtp03LastSeenDate).append(dtp01AcuteManifestationDateQlfr).append(dtp02AcuteManifestationDateFormatQlfr).append(dtp03AcuteManifestationDate).append(dtp01AccidentDateQlfr).append(dtp02AccidentDateFormatQlfr).append(dtp03AccidentDate).append(dtp01LastMenstrualPeriodDateQlfr).append(dtp02LastMenstrualPeriodDateFormatQlfr).append(dtp03LastMenstrualPeriodDate).append(dtp01LastXrayDateQlfr).append(dtp02LastXrayDateFormatQlfr).append(dtp03LastXrayDate).append(dtp01HearVisionPrescriptionDateQlfr).append(dtp02HearVisionPrescriptionDateFormatQlfr).append(dtp03HearVisionPrescriptionDate).append(dtp01DisabilityQlfr).append(dtp02DisabilityFormatQlfr).append(dtp03Disability).append(dtp01InitialDisabilityPeriodStartQlfr).append(dtp02InitialDisabilityPeriodStartFormatQlfr).append(dtp03InitialDisabilityPeriodStartDate).append(dtp01InitialDisabilityPeriodEndQlfr).append(dtp02InitialDisabilityPeriodEndFormatQlfr).append(dtp03InitialDisabilityPeriodEndDate).append(dtp01LastWorkedDateQlfr).append(dtp02LastWorkedDateFormatQlfr).append(dtp03LastWorkedDate).append(dtp01WorkReturnDateQlfr).append(dtp02WorkReturnDateFormatQlfr).append(dtp03WorkReturnDate).append(dtp01HospitalizationAdmissionDateQlfr).append(dtp02HospitalizationAdmissionDateFormatQlfr).append(dtp03HospitalizationAdmissionDate).append(dtp01HospitalizationDischargeDateQlfr).append(dtp02HospitalizationDischargeDateFormatQlfr).append(dtp03HospitalizationDischargeDate).append(dtp01FromAndToStatementDateQlfr).append(dtp02FromAndToStatementDateFormatQlfr).append(dtp03FromAndToStatementDate).append(dtp01DischargeHourQlfr).append(dtp02DischargeTimePeriodFormatQlfr).append(dtp03DischargeTimePeriod).append(dtp01AdmissionDateHourQlfr).append(dtp02admissionDateHourFormatQlfr).append(dtp03AdmissionDateHour).append(dtpAssumedAndRelinquishedDates).append(dtp01PropertyCasualtyFirstContactDate).append(dtp02PropertyCasualtyFirstContactDateFormatQlfr).append(dtp03PropertyCasualtyFirstContactDate).append(dtp01AppliancePlacementQlfr).append(dtp02AppliancePlacementDateFormatQlfr).append(dtp03OrthodonticBrandingDate).append(dtp01ServiceDateQlfr).append(dtp02ServiceDateFormatQlfr).append(dtp03ServiceDate).append(dtp01RepricerReceivedDate).append(dtp02RepricerReceivedDateFormatQlfr).append(dtp03RepricerReceivedDate).append(cl101AdmissionTypeCode).append(cl102AdmissionSourceCode).append(cl103PatientStatusCode).append(dn101OrthoDonticTreatmentMonthsCount).append(dn102OrthoDonticTreatmentMonthsRemainingCount).append(dn104OrthoDonticTreatmentIndicator).append(dn2ToothStatus).append(pwkClaimSupplementInformation).append(cn101ContractTypeCode).append(cn102ContractAmount).append(cn103ContractPercentage).append(cn104ContractCode).append(cn105TermsDiscountPercent).append(cn106ContractVersionIdentifier).append(amt01PatientAmountQlfrCode).append(amt02PatientAmountPaid).append(amt01PatientResponsibilityCode).append(amt02PatientResponsibilityAmount).append(ref01PredeterminationOfBenefitsIdentificationNo).append(ref02PredeterminationOfBenefitsIdentifier).append(ref01SpecialPaymentReferenceNoQlfr).append(ref02SpecialPaymentReferenceNo).append(ref01MedicareVersionCodeQlfr).append(ref02MedicareVersionCode).append(ref01MammographyCertificationNoQlfr).append(ref02MammographyCertificationNo).append(ref01ReferralNoQlfr).append(ref02ReferralNo).append(ref01PriorAuthorizationNoQlfr).append(ref02PriorAuthorizationNo).append(ref01PayerClaimControlNoQlfr).append(ref02PayerClaimControlNo).append(ref01ClinicalLabAmendmentNoQlfr).append(ref02ClinicalLabAmendmentNo).append(ref01RepricedClaimReferenceNoQlfr).append(ref02RepricedClaimReferenceNo).append(ref01AdjustedRepricedClaimRefNoQlfr).append(ref02AdjustedRepricedClaimRefNo).append(refPredeterminationOfBenefitsIdentification).append(refInvestigationalDeviceExcemption).append(ref01ValueAddedNetworkTraceNoQlfr).append(ref02ValueAddedNetworkTraceNo).append(ref01AutoAccidentStateOrProvinceQlfr).append(ref02AutoAccidentStateOrProvinceCode).append(ref01MedicalRecordNoQlfr).append(ref02MedicalRecordNo).append(ref01DemonstrationProjectIdentifierQlfr).append(ref02DemonstrationProjectIdentifier).append(ref01CarePlanOversightNoQlfr).append(ref02CarePlanOversightNo).append(ref01PeerReviewAuthorizationNoQlfr).append(ref02PeerReviewAuthorizationNo).append(k3fileInformation).append(nteClmNote).append(nte01NoteReferenceCode).append(nte02ClaimNoteText).append(nte01BillingNoteReferenceCode).append(nte02BillingNoteText).append(cr101BasisForMeasurementCodePound).append(cr102PatientWeightPounds).append(cr104AmbulanceTransportReasonCode).append(cr105BasisForMeasurementCodeMiles).append(cr106TransportDistanceMiles).append(cr109RoundTripPurposeDescription).append(cr110StretcherPurposeDescription).append(cr208NatureOfConditionCode).append(cr210PatientConditionDescription).append(cr211PatientConditionDescription2).append(crcAmbulanceCertification).append(crcPatientVisionCondition).append(crc01HomeboundConditionCodeCategory).append(crc02HomeboundConditionCode).append(crc03HomeboundIndicator).append(crc01EpsdtConditionCodeCategory).append(crc02EpsdtConditionCodeAppliesIndicator).append(crc03EpsdtConditionIndicator1).append(crc04EpsdtConditionIndicator2).append(crc05EpsdtconditionIndicator3).append(hi01DiagnosisType1).append(hi0101DiagnosisTypeCode1).append(hi0102DiagnosisCode1).append(hi0109PresentOnAdmissionIndicator).append(hi02DiagnosisType2).append(hi0201DiagnosisTypeCode2).append(hi0202DiagnosisCode2).append(hi03DiagnosisTypeCode3).append(hi0301DiagnosisTypeCode3).append(hi0302DiagnosisCode3).append(hi04DiagnosisTypeCode4).append(hi0401DiagnosisTypeCode4).append(hi0402DiagnosisCode4).append(hi05DiagnosisTypeCode5).append(hi0501DiagnosisTypeCode5).append(hi0502DiagnosisCode5).append(hi06DiagnosisTypecode6).append(hi0601DiagnosisTypeCode6).append(hi0602DiagnosisCode6).append(hi07DiagnosisTypeCode7).append(hi0701DiagnosisTypeCode7).append(hi0702DiagnosisCode7).append(hi08DiagnosisTypeCode8).append(hi0801DiagnosisTypeCode8).append(hi0802DiagnosisCode8).append(hi09DiagnosisType).append(hi0901DiagnosisTypeCode9).append(hi0902DiagnosisCode9).append(hi10DiagnosisTypeCode10).append(hi1001DiagnosisTypeCode10).append(hi1002DiagnosisCode10).append(hi11DiagnosisTypeCode11).append(hi1101DiagnosisTypeCode11).append(hi1102DiagnosisCode11).append(hi12DiagnosisTypeCode12).append(hi1201DiagnosisTypeCode12).append(hi1202DiagnosisCode12).append(hi01AnesthesiaSurgicalPrincipal1).append(hi0101AnesthesiaSurgicalPrincipleProcedureCode1).append(hi0102AnesthesiaSurgicalPrincipleProcedure1).append(hi02AnesthesiaSurgicalProcedure2).append(hi0201AnesthesiaSurgicalProcedureCode2).append(hi0202AnesthesiaSurgicalProcedure2).append(hi01AdmittingDiagnosisCodeInfo).append(hi0101AdmittingDiagnosisQlfrCode1).append(hi0102AdmittingDiagnosisCode1).append(hi01PatientsReasonForVisitCodeInfo1).append(hi0101PatientsReasonForVisitQlfrCode1).append(hi0102PatientsReasonForVisitCode1).append(hi02PatientsReasonForVisitCodeInfo2).append(hi0201PatientsReasonForVisitQlfrCode2).append(hi0202PatientsReasonForVisitCode2).append(hi03PatientsReasonForVisitCodeInfo3).append(hi0301PatientsReasonForVisitQlfrCode3).append(hi0302PatientsReasonForVisitCode3).append(hi01ExternalCauseOfInjuryInfo1).append(hi0101ExternalCauseOfInjuryQlfrCode1).append(hi0102ExternalCauseOfInjuryCode1).append(hi0109CauseOfInjuryPresentOnAdmissionIndicator1).append(hi02ExternalCauseOfInjuryInfo2).append(hi0201ExternalCauseOfInjuryQlfrCode2).append(hi0202ExternalCauseOfInjuryCode2).append(hi0209CauseOfInjuryPresentOnAdmissionIndicator2).append(hi03ExternalCauseOfInjuryInfo3).append(hi0301ExternalCauseOfInjuryQlfrCode3).append(hi0302ExternalCauseOfInjuryCode3).append(hi0309CauseOfInjuryPresentOnAdmissionIndicator3).append(hi04ExternalCauseOfInjuryInfo4).append(hi0401ExternalCauseOfInjuryQlfrCode4).append(hi0402ExternalCauseOfInjuryCode4).append(hi0409CauseOfInjuryPresentOnAdmissionIndicator4).append(hi05ExternalCauseOfInjuryInfo5).append(hi0501ExternalCauseOfInjuryQlfrCode5).append(hi0502ExternalCauseOfInjuryCode5).append(hi0509CauseOfInjuryPresentOnAdmissionIndicator5).append(hi06ExternalCauseOfInjuryInfo6).append(hi0601ExternalCauseOfInjuryQlfrCode6).append(hi0602ExternalCauseOfInjuryCode6).append(hi0609CauseOfInjuryPresentOnAdmissionIndicator6).append(hi07ExternalCauseOfInjuryInfo7).append(hi0701ExternalCauseOfInjuryQlfrCode7).append(hi0702ExternalCauseOfInjuryCode7).append(hi0709CauseOfInjuryPresentOnAdmissionIndicator7).append(hi08ExternalCauseOfInjuryInfo8).append(hi0801ExternalCauseOfInjuryQlfrCode8).append(hi0802ExternalCauseOfInjuryCode8).append(hi0809CauseOfInjuryPresentOnAdmissionIndicator8).append(hi09ExternalCauseOfInjuryInfo9).append(hi0901ExternalCauseOfInjuryQlfrCode9).append(hi0902ExternalCauseOfInjuryCode9).append(hi0909CauseOfInjuryPresentOnAdmissionIndicator9).append(hi10ExternalCauseOfInjuryInfo10).append(hi1001ExternalCauseOfInjuryQlfrCode10).append(hi1002ExternalCauseOfInjuryCode10).append(hi1009CauseOfInjuryPresentOnAdmissionIndicator10).append(hi11ExternalCauseOfInjuryInfo11).append(hi1101ExternalCauseOfInjuryQlfrCode11).append(hi1102ExternalCauseOfInjuryCode11).append(hi1109CauseOfInjuryPresentOnAdmissionIndicator11).append(hi12ExternalCauseOfInjuryInfo12).append(hi1201ExternalCauseOfInjuryQlfrCode12).append(hi1202ExternalCauseOfInjuryCode12).append(hi1209CauseOfInjuryPresentOnAdmissionIndicator12).append(hi01DRGInfo1).append(hi0101DRGQlfrCode1).append(hi1102DRGCode1).append(hiOtherDiagnosisInfo).append(hi01PrincipalProcedureInfo).append(hi0101PrincipalProcedureInfoQlfr).append(hi0102PrincipalProcedureCode).append(hi0103PrincipalProcedureDateFormatQlfr).append(hi0104PrincipalProcedureDate).append(hiOtherProcedureInfo).append(hiOccurrenceSpanInfo).append(hiOccurrenceInfo).append(hiValueInfo).append(hiTreatmentCodeInfo).append(hiConditionCode).append(hcp01PricingMethodology).append(hcp02RepricedAllowedAmount).append(hcp03RepricedSavingAmount).append(hcp04RepricingOrgIdentifier).append(hcp05RepricingPerDiemFlatRateAmount).append(hcp06RepricedApprovedAmbulatoryPatientGroupCode).append(hcp07RepricedApprovedAmbulatoryPatientGroupAmount).append(hcp08RepricedApprovedRevenueCode).append(hcp11UnitOrBasisOfMeasurementCode).append(hcp12RepricedApprovedServiceUnitCount).append(hcp13RejectReasonCode).append(hcp14PolicyComplianceCode).append(hcp15ExceptionCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimInfo) == false) {
            return false;
        }
        ClaimInfo rhs = ((ClaimInfo) other);
        return new EqualsBuilder().append(clm01PatientControlNo, rhs.clm01PatientControlNo).append(clm02TotalClaimChargeAmount, rhs.clm02TotalClaimChargeAmount).append(clm05ServiceLocationInfo, rhs.clm05ServiceLocationInfo).append(clm0501PlaceOfServiceCode, rhs.clm0501PlaceOfServiceCode).append(clm0502PlaceOfServiceCodeQlfr, rhs.clm0502PlaceOfServiceCodeQlfr).append(clm0503ClaimFrequencyCode, rhs.clm0503ClaimFrequencyCode).append(clm06SupplierSignatureIndicator, rhs.clm06SupplierSignatureIndicator).append(clm07PlanParticipationCode, rhs.clm07PlanParticipationCode).append(clm08BenefitsAssignmentCertificationIndicator, rhs.clm08BenefitsAssignmentCertificationIndicator).append(clm09ReleaseOfInformationCode, rhs.clm09ReleaseOfInformationCode).append(clm10PatientSignatureSourceCode, rhs.clm10PatientSignatureSourceCode).append(clm11RelatedCausesInfo, rhs.clm11RelatedCausesInfo).append(clm1101RelatedCausesCode, rhs.clm1101RelatedCausesCode).append(clm1102RelatedCausesCode2, rhs.clm1102RelatedCausesCode2).append(clm1104AutoAccidentStateCode, rhs.clm1104AutoAccidentStateCode).append(clm1105CountryCode, rhs.clm1105CountryCode).append(clm12SpecialProgramIndicator, rhs.clm12SpecialProgramIndicator).append(clm19PredeterminationOfBenefitsCode, rhs.clm19PredeterminationOfBenefitsCode).append(clm20DelayReasonCode, rhs.clm20DelayReasonCode).append(dtp01OnsetOfCurrentIllnessInjuryDateQlfr, rhs.dtp01OnsetOfCurrentIllnessInjuryDateQlfr).append(dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr, rhs.dtp02OnsetOfCurrentIllnessInjuryDateFormatQlfr).append(dtp03OnsetOfCurrentIllnessInjuryDate, rhs.dtp03OnsetOfCurrentIllnessInjuryDate).append(dtp01InitialTreatmentDateQlfr, rhs.dtp01InitialTreatmentDateQlfr).append(dtp02InitialTreatmentDateFormatQlfr, rhs.dtp02InitialTreatmentDateFormatQlfr).append(dtp03InitialTreatmentDate, rhs.dtp03InitialTreatmentDate).append(dtp01LastSeenDateQlfr, rhs.dtp01LastSeenDateQlfr).append(dtp02LastSeenDateFormatQlfr, rhs.dtp02LastSeenDateFormatQlfr).append(dtp03LastSeenDate, rhs.dtp03LastSeenDate).append(dtp01AcuteManifestationDateQlfr, rhs.dtp01AcuteManifestationDateQlfr).append(dtp02AcuteManifestationDateFormatQlfr, rhs.dtp02AcuteManifestationDateFormatQlfr).append(dtp03AcuteManifestationDate, rhs.dtp03AcuteManifestationDate).append(dtp01AccidentDateQlfr, rhs.dtp01AccidentDateQlfr).append(dtp02AccidentDateFormatQlfr, rhs.dtp02AccidentDateFormatQlfr).append(dtp03AccidentDate, rhs.dtp03AccidentDate).append(dtp01LastMenstrualPeriodDateQlfr, rhs.dtp01LastMenstrualPeriodDateQlfr).append(dtp02LastMenstrualPeriodDateFormatQlfr, rhs.dtp02LastMenstrualPeriodDateFormatQlfr).append(dtp03LastMenstrualPeriodDate, rhs.dtp03LastMenstrualPeriodDate).append(dtp01LastXrayDateQlfr, rhs.dtp01LastXrayDateQlfr).append(dtp02LastXrayDateFormatQlfr, rhs.dtp02LastXrayDateFormatQlfr).append(dtp03LastXrayDate, rhs.dtp03LastXrayDate).append(dtp01HearVisionPrescriptionDateQlfr, rhs.dtp01HearVisionPrescriptionDateQlfr).append(dtp02HearVisionPrescriptionDateFormatQlfr, rhs.dtp02HearVisionPrescriptionDateFormatQlfr).append(dtp03HearVisionPrescriptionDate, rhs.dtp03HearVisionPrescriptionDate).append(dtp01DisabilityQlfr, rhs.dtp01DisabilityQlfr).append(dtp02DisabilityFormatQlfr, rhs.dtp02DisabilityFormatQlfr).append(dtp03Disability, rhs.dtp03Disability).append(dtp01InitialDisabilityPeriodStartQlfr, rhs.dtp01InitialDisabilityPeriodStartQlfr).append(dtp02InitialDisabilityPeriodStartFormatQlfr, rhs.dtp02InitialDisabilityPeriodStartFormatQlfr).append(dtp03InitialDisabilityPeriodStartDate, rhs.dtp03InitialDisabilityPeriodStartDate).append(dtp01InitialDisabilityPeriodEndQlfr, rhs.dtp01InitialDisabilityPeriodEndQlfr).append(dtp02InitialDisabilityPeriodEndFormatQlfr, rhs.dtp02InitialDisabilityPeriodEndFormatQlfr).append(dtp03InitialDisabilityPeriodEndDate, rhs.dtp03InitialDisabilityPeriodEndDate).append(dtp01LastWorkedDateQlfr, rhs.dtp01LastWorkedDateQlfr).append(dtp02LastWorkedDateFormatQlfr, rhs.dtp02LastWorkedDateFormatQlfr).append(dtp03LastWorkedDate, rhs.dtp03LastWorkedDate).append(dtp01WorkReturnDateQlfr, rhs.dtp01WorkReturnDateQlfr).append(dtp02WorkReturnDateFormatQlfr, rhs.dtp02WorkReturnDateFormatQlfr).append(dtp03WorkReturnDate, rhs.dtp03WorkReturnDate).append(dtp01HospitalizationAdmissionDateQlfr, rhs.dtp01HospitalizationAdmissionDateQlfr).append(dtp02HospitalizationAdmissionDateFormatQlfr, rhs.dtp02HospitalizationAdmissionDateFormatQlfr).append(dtp03HospitalizationAdmissionDate, rhs.dtp03HospitalizationAdmissionDate).append(dtp01HospitalizationDischargeDateQlfr, rhs.dtp01HospitalizationDischargeDateQlfr).append(dtp02HospitalizationDischargeDateFormatQlfr, rhs.dtp02HospitalizationDischargeDateFormatQlfr).append(dtp03HospitalizationDischargeDate, rhs.dtp03HospitalizationDischargeDate).append(dtp01FromAndToStatementDateQlfr, rhs.dtp01FromAndToStatementDateQlfr).append(dtp02FromAndToStatementDateFormatQlfr, rhs.dtp02FromAndToStatementDateFormatQlfr).append(dtp03FromAndToStatementDate, rhs.dtp03FromAndToStatementDate).append(dtp01DischargeHourQlfr, rhs.dtp01DischargeHourQlfr).append(dtp02DischargeTimePeriodFormatQlfr, rhs.dtp02DischargeTimePeriodFormatQlfr).append(dtp03DischargeTimePeriod, rhs.dtp03DischargeTimePeriod).append(dtp01AdmissionDateHourQlfr, rhs.dtp01AdmissionDateHourQlfr).append(dtp02admissionDateHourFormatQlfr, rhs.dtp02admissionDateHourFormatQlfr).append(dtp03AdmissionDateHour, rhs.dtp03AdmissionDateHour).append(dtpAssumedAndRelinquishedDates, rhs.dtpAssumedAndRelinquishedDates).append(dtp01PropertyCasualtyFirstContactDate, rhs.dtp01PropertyCasualtyFirstContactDate).append(dtp02PropertyCasualtyFirstContactDateFormatQlfr, rhs.dtp02PropertyCasualtyFirstContactDateFormatQlfr).append(dtp03PropertyCasualtyFirstContactDate, rhs.dtp03PropertyCasualtyFirstContactDate).append(dtp01AppliancePlacementQlfr, rhs.dtp01AppliancePlacementQlfr).append(dtp02AppliancePlacementDateFormatQlfr, rhs.dtp02AppliancePlacementDateFormatQlfr).append(dtp03OrthodonticBrandingDate, rhs.dtp03OrthodonticBrandingDate).append(dtp01ServiceDateQlfr, rhs.dtp01ServiceDateQlfr).append(dtp02ServiceDateFormatQlfr, rhs.dtp02ServiceDateFormatQlfr).append(dtp03ServiceDate, rhs.dtp03ServiceDate).append(dtp01RepricerReceivedDate, rhs.dtp01RepricerReceivedDate).append(dtp02RepricerReceivedDateFormatQlfr, rhs.dtp02RepricerReceivedDateFormatQlfr).append(dtp03RepricerReceivedDate, rhs.dtp03RepricerReceivedDate).append(cl101AdmissionTypeCode, rhs.cl101AdmissionTypeCode).append(cl102AdmissionSourceCode, rhs.cl102AdmissionSourceCode).append(cl103PatientStatusCode, rhs.cl103PatientStatusCode).append(dn101OrthoDonticTreatmentMonthsCount, rhs.dn101OrthoDonticTreatmentMonthsCount).append(dn102OrthoDonticTreatmentMonthsRemainingCount, rhs.dn102OrthoDonticTreatmentMonthsRemainingCount).append(dn104OrthoDonticTreatmentIndicator, rhs.dn104OrthoDonticTreatmentIndicator).append(dn2ToothStatus, rhs.dn2ToothStatus).append(pwkClaimSupplementInformation, rhs.pwkClaimSupplementInformation).append(cn101ContractTypeCode, rhs.cn101ContractTypeCode).append(cn102ContractAmount, rhs.cn102ContractAmount).append(cn103ContractPercentage, rhs.cn103ContractPercentage).append(cn104ContractCode, rhs.cn104ContractCode).append(cn105TermsDiscountPercent, rhs.cn105TermsDiscountPercent).append(cn106ContractVersionIdentifier, rhs.cn106ContractVersionIdentifier).append(amt01PatientAmountQlfrCode, rhs.amt01PatientAmountQlfrCode).append(amt02PatientAmountPaid, rhs.amt02PatientAmountPaid).append(amt01PatientResponsibilityCode, rhs.amt01PatientResponsibilityCode).append(amt02PatientResponsibilityAmount, rhs.amt02PatientResponsibilityAmount).append(ref01PredeterminationOfBenefitsIdentificationNo, rhs.ref01PredeterminationOfBenefitsIdentificationNo).append(ref02PredeterminationOfBenefitsIdentifier, rhs.ref02PredeterminationOfBenefitsIdentifier).append(ref01SpecialPaymentReferenceNoQlfr, rhs.ref01SpecialPaymentReferenceNoQlfr).append(ref02SpecialPaymentReferenceNo, rhs.ref02SpecialPaymentReferenceNo).append(ref01MedicareVersionCodeQlfr, rhs.ref01MedicareVersionCodeQlfr).append(ref02MedicareVersionCode, rhs.ref02MedicareVersionCode).append(ref01MammographyCertificationNoQlfr, rhs.ref01MammographyCertificationNoQlfr).append(ref02MammographyCertificationNo, rhs.ref02MammographyCertificationNo).append(ref01ReferralNoQlfr, rhs.ref01ReferralNoQlfr).append(ref02ReferralNo, rhs.ref02ReferralNo).append(ref01PriorAuthorizationNoQlfr, rhs.ref01PriorAuthorizationNoQlfr).append(ref02PriorAuthorizationNo, rhs.ref02PriorAuthorizationNo).append(ref01PayerClaimControlNoQlfr, rhs.ref01PayerClaimControlNoQlfr).append(ref02PayerClaimControlNo, rhs.ref02PayerClaimControlNo).append(ref01ClinicalLabAmendmentNoQlfr, rhs.ref01ClinicalLabAmendmentNoQlfr).append(ref02ClinicalLabAmendmentNo, rhs.ref02ClinicalLabAmendmentNo).append(ref01RepricedClaimReferenceNoQlfr, rhs.ref01RepricedClaimReferenceNoQlfr).append(ref02RepricedClaimReferenceNo, rhs.ref02RepricedClaimReferenceNo).append(ref01AdjustedRepricedClaimRefNoQlfr, rhs.ref01AdjustedRepricedClaimRefNoQlfr).append(ref02AdjustedRepricedClaimRefNo, rhs.ref02AdjustedRepricedClaimRefNo).append(refPredeterminationOfBenefitsIdentification, rhs.refPredeterminationOfBenefitsIdentification).append(refInvestigationalDeviceExcemption, rhs.refInvestigationalDeviceExcemption).append(ref01ValueAddedNetworkTraceNoQlfr, rhs.ref01ValueAddedNetworkTraceNoQlfr).append(ref02ValueAddedNetworkTraceNo, rhs.ref02ValueAddedNetworkTraceNo).append(ref01AutoAccidentStateOrProvinceQlfr, rhs.ref01AutoAccidentStateOrProvinceQlfr).append(ref02AutoAccidentStateOrProvinceCode, rhs.ref02AutoAccidentStateOrProvinceCode).append(ref01MedicalRecordNoQlfr, rhs.ref01MedicalRecordNoQlfr).append(ref02MedicalRecordNo, rhs.ref02MedicalRecordNo).append(ref01DemonstrationProjectIdentifierQlfr, rhs.ref01DemonstrationProjectIdentifierQlfr).append(ref02DemonstrationProjectIdentifier, rhs.ref02DemonstrationProjectIdentifier).append(ref01CarePlanOversightNoQlfr, rhs.ref01CarePlanOversightNoQlfr).append(ref02CarePlanOversightNo, rhs.ref02CarePlanOversightNo).append(ref01PeerReviewAuthorizationNoQlfr, rhs.ref01PeerReviewAuthorizationNoQlfr).append(ref02PeerReviewAuthorizationNo, rhs.ref02PeerReviewAuthorizationNo).append(k3fileInformation, rhs.k3fileInformation).append(nteClmNote, rhs.nteClmNote).append(nte01NoteReferenceCode, rhs.nte01NoteReferenceCode).append(nte02ClaimNoteText, rhs.nte02ClaimNoteText).append(nte01BillingNoteReferenceCode, rhs.nte01BillingNoteReferenceCode).append(nte02BillingNoteText, rhs.nte02BillingNoteText).append(cr101BasisForMeasurementCodePound, rhs.cr101BasisForMeasurementCodePound).append(cr102PatientWeightPounds, rhs.cr102PatientWeightPounds).append(cr104AmbulanceTransportReasonCode, rhs.cr104AmbulanceTransportReasonCode).append(cr105BasisForMeasurementCodeMiles, rhs.cr105BasisForMeasurementCodeMiles).append(cr106TransportDistanceMiles, rhs.cr106TransportDistanceMiles).append(cr109RoundTripPurposeDescription, rhs.cr109RoundTripPurposeDescription).append(cr110StretcherPurposeDescription, rhs.cr110StretcherPurposeDescription).append(cr208NatureOfConditionCode, rhs.cr208NatureOfConditionCode).append(cr210PatientConditionDescription, rhs.cr210PatientConditionDescription).append(cr211PatientConditionDescription2, rhs.cr211PatientConditionDescription2).append(crcAmbulanceCertification, rhs.crcAmbulanceCertification).append(crcPatientVisionCondition, rhs.crcPatientVisionCondition).append(crc01HomeboundConditionCodeCategory, rhs.crc01HomeboundConditionCodeCategory).append(crc02HomeboundConditionCode, rhs.crc02HomeboundConditionCode).append(crc03HomeboundIndicator, rhs.crc03HomeboundIndicator).append(crc01EpsdtConditionCodeCategory, rhs.crc01EpsdtConditionCodeCategory).append(crc02EpsdtConditionCodeAppliesIndicator, rhs.crc02EpsdtConditionCodeAppliesIndicator).append(crc03EpsdtConditionIndicator1, rhs.crc03EpsdtConditionIndicator1).append(crc04EpsdtConditionIndicator2, rhs.crc04EpsdtConditionIndicator2).append(crc05EpsdtconditionIndicator3, rhs.crc05EpsdtconditionIndicator3).append(hi01DiagnosisType1, rhs.hi01DiagnosisType1).append(hi0101DiagnosisTypeCode1, rhs.hi0101DiagnosisTypeCode1).append(hi0102DiagnosisCode1, rhs.hi0102DiagnosisCode1).append(hi0109PresentOnAdmissionIndicator, rhs.hi0109PresentOnAdmissionIndicator).append(hi02DiagnosisType2, rhs.hi02DiagnosisType2).append(hi0201DiagnosisTypeCode2, rhs.hi0201DiagnosisTypeCode2).append(hi0202DiagnosisCode2, rhs.hi0202DiagnosisCode2).append(hi03DiagnosisTypeCode3, rhs.hi03DiagnosisTypeCode3).append(hi0301DiagnosisTypeCode3, rhs.hi0301DiagnosisTypeCode3).append(hi0302DiagnosisCode3, rhs.hi0302DiagnosisCode3).append(hi04DiagnosisTypeCode4, rhs.hi04DiagnosisTypeCode4).append(hi0401DiagnosisTypeCode4, rhs.hi0401DiagnosisTypeCode4).append(hi0402DiagnosisCode4, rhs.hi0402DiagnosisCode4).append(hi05DiagnosisTypeCode5, rhs.hi05DiagnosisTypeCode5).append(hi0501DiagnosisTypeCode5, rhs.hi0501DiagnosisTypeCode5).append(hi0502DiagnosisCode5, rhs.hi0502DiagnosisCode5).append(hi06DiagnosisTypecode6, rhs.hi06DiagnosisTypecode6).append(hi0601DiagnosisTypeCode6, rhs.hi0601DiagnosisTypeCode6).append(hi0602DiagnosisCode6, rhs.hi0602DiagnosisCode6).append(hi07DiagnosisTypeCode7, rhs.hi07DiagnosisTypeCode7).append(hi0701DiagnosisTypeCode7, rhs.hi0701DiagnosisTypeCode7).append(hi0702DiagnosisCode7, rhs.hi0702DiagnosisCode7).append(hi08DiagnosisTypeCode8, rhs.hi08DiagnosisTypeCode8).append(hi0801DiagnosisTypeCode8, rhs.hi0801DiagnosisTypeCode8).append(hi0802DiagnosisCode8, rhs.hi0802DiagnosisCode8).append(hi09DiagnosisType, rhs.hi09DiagnosisType).append(hi0901DiagnosisTypeCode9, rhs.hi0901DiagnosisTypeCode9).append(hi0902DiagnosisCode9, rhs.hi0902DiagnosisCode9).append(hi10DiagnosisTypeCode10, rhs.hi10DiagnosisTypeCode10).append(hi1001DiagnosisTypeCode10, rhs.hi1001DiagnosisTypeCode10).append(hi1002DiagnosisCode10, rhs.hi1002DiagnosisCode10).append(hi11DiagnosisTypeCode11, rhs.hi11DiagnosisTypeCode11).append(hi1101DiagnosisTypeCode11, rhs.hi1101DiagnosisTypeCode11).append(hi1102DiagnosisCode11, rhs.hi1102DiagnosisCode11).append(hi12DiagnosisTypeCode12, rhs.hi12DiagnosisTypeCode12).append(hi1201DiagnosisTypeCode12, rhs.hi1201DiagnosisTypeCode12).append(hi1202DiagnosisCode12, rhs.hi1202DiagnosisCode12).append(hi01AnesthesiaSurgicalPrincipal1, rhs.hi01AnesthesiaSurgicalPrincipal1).append(hi0101AnesthesiaSurgicalPrincipleProcedureCode1, rhs.hi0101AnesthesiaSurgicalPrincipleProcedureCode1).append(hi0102AnesthesiaSurgicalPrincipleProcedure1, rhs.hi0102AnesthesiaSurgicalPrincipleProcedure1).append(hi02AnesthesiaSurgicalProcedure2, rhs.hi02AnesthesiaSurgicalProcedure2).append(hi0201AnesthesiaSurgicalProcedureCode2, rhs.hi0201AnesthesiaSurgicalProcedureCode2).append(hi0202AnesthesiaSurgicalProcedure2, rhs.hi0202AnesthesiaSurgicalProcedure2).append(hi01AdmittingDiagnosisCodeInfo, rhs.hi01AdmittingDiagnosisCodeInfo).append(hi0101AdmittingDiagnosisQlfrCode1, rhs.hi0101AdmittingDiagnosisQlfrCode1).append(hi0102AdmittingDiagnosisCode1, rhs.hi0102AdmittingDiagnosisCode1).append(hi01PatientsReasonForVisitCodeInfo1, rhs.hi01PatientsReasonForVisitCodeInfo1).append(hi0101PatientsReasonForVisitQlfrCode1, rhs.hi0101PatientsReasonForVisitQlfrCode1).append(hi0102PatientsReasonForVisitCode1, rhs.hi0102PatientsReasonForVisitCode1).append(hi02PatientsReasonForVisitCodeInfo2, rhs.hi02PatientsReasonForVisitCodeInfo2).append(hi0201PatientsReasonForVisitQlfrCode2, rhs.hi0201PatientsReasonForVisitQlfrCode2).append(hi0202PatientsReasonForVisitCode2, rhs.hi0202PatientsReasonForVisitCode2).append(hi03PatientsReasonForVisitCodeInfo3, rhs.hi03PatientsReasonForVisitCodeInfo3).append(hi0301PatientsReasonForVisitQlfrCode3, rhs.hi0301PatientsReasonForVisitQlfrCode3).append(hi0302PatientsReasonForVisitCode3, rhs.hi0302PatientsReasonForVisitCode3).append(hi01ExternalCauseOfInjuryInfo1, rhs.hi01ExternalCauseOfInjuryInfo1).append(hi0101ExternalCauseOfInjuryQlfrCode1, rhs.hi0101ExternalCauseOfInjuryQlfrCode1).append(hi0102ExternalCauseOfInjuryCode1, rhs.hi0102ExternalCauseOfInjuryCode1).append(hi0109CauseOfInjuryPresentOnAdmissionIndicator1, rhs.hi0109CauseOfInjuryPresentOnAdmissionIndicator1).append(hi02ExternalCauseOfInjuryInfo2, rhs.hi02ExternalCauseOfInjuryInfo2).append(hi0201ExternalCauseOfInjuryQlfrCode2, rhs.hi0201ExternalCauseOfInjuryQlfrCode2).append(hi0202ExternalCauseOfInjuryCode2, rhs.hi0202ExternalCauseOfInjuryCode2).append(hi0209CauseOfInjuryPresentOnAdmissionIndicator2, rhs.hi0209CauseOfInjuryPresentOnAdmissionIndicator2).append(hi03ExternalCauseOfInjuryInfo3, rhs.hi03ExternalCauseOfInjuryInfo3).append(hi0301ExternalCauseOfInjuryQlfrCode3, rhs.hi0301ExternalCauseOfInjuryQlfrCode3).append(hi0302ExternalCauseOfInjuryCode3, rhs.hi0302ExternalCauseOfInjuryCode3).append(hi0309CauseOfInjuryPresentOnAdmissionIndicator3, rhs.hi0309CauseOfInjuryPresentOnAdmissionIndicator3).append(hi04ExternalCauseOfInjuryInfo4, rhs.hi04ExternalCauseOfInjuryInfo4).append(hi0401ExternalCauseOfInjuryQlfrCode4, rhs.hi0401ExternalCauseOfInjuryQlfrCode4).append(hi0402ExternalCauseOfInjuryCode4, rhs.hi0402ExternalCauseOfInjuryCode4).append(hi0409CauseOfInjuryPresentOnAdmissionIndicator4, rhs.hi0409CauseOfInjuryPresentOnAdmissionIndicator4).append(hi05ExternalCauseOfInjuryInfo5, rhs.hi05ExternalCauseOfInjuryInfo5).append(hi0501ExternalCauseOfInjuryQlfrCode5, rhs.hi0501ExternalCauseOfInjuryQlfrCode5).append(hi0502ExternalCauseOfInjuryCode5, rhs.hi0502ExternalCauseOfInjuryCode5).append(hi0509CauseOfInjuryPresentOnAdmissionIndicator5, rhs.hi0509CauseOfInjuryPresentOnAdmissionIndicator5).append(hi06ExternalCauseOfInjuryInfo6, rhs.hi06ExternalCauseOfInjuryInfo6).append(hi0601ExternalCauseOfInjuryQlfrCode6, rhs.hi0601ExternalCauseOfInjuryQlfrCode6).append(hi0602ExternalCauseOfInjuryCode6, rhs.hi0602ExternalCauseOfInjuryCode6).append(hi0609CauseOfInjuryPresentOnAdmissionIndicator6, rhs.hi0609CauseOfInjuryPresentOnAdmissionIndicator6).append(hi07ExternalCauseOfInjuryInfo7, rhs.hi07ExternalCauseOfInjuryInfo7).append(hi0701ExternalCauseOfInjuryQlfrCode7, rhs.hi0701ExternalCauseOfInjuryQlfrCode7).append(hi0702ExternalCauseOfInjuryCode7, rhs.hi0702ExternalCauseOfInjuryCode7).append(hi0709CauseOfInjuryPresentOnAdmissionIndicator7, rhs.hi0709CauseOfInjuryPresentOnAdmissionIndicator7).append(hi08ExternalCauseOfInjuryInfo8, rhs.hi08ExternalCauseOfInjuryInfo8).append(hi0801ExternalCauseOfInjuryQlfrCode8, rhs.hi0801ExternalCauseOfInjuryQlfrCode8).append(hi0802ExternalCauseOfInjuryCode8, rhs.hi0802ExternalCauseOfInjuryCode8).append(hi0809CauseOfInjuryPresentOnAdmissionIndicator8, rhs.hi0809CauseOfInjuryPresentOnAdmissionIndicator8).append(hi09ExternalCauseOfInjuryInfo9, rhs.hi09ExternalCauseOfInjuryInfo9).append(hi0901ExternalCauseOfInjuryQlfrCode9, rhs.hi0901ExternalCauseOfInjuryQlfrCode9).append(hi0902ExternalCauseOfInjuryCode9, rhs.hi0902ExternalCauseOfInjuryCode9).append(hi0909CauseOfInjuryPresentOnAdmissionIndicator9, rhs.hi0909CauseOfInjuryPresentOnAdmissionIndicator9).append(hi10ExternalCauseOfInjuryInfo10, rhs.hi10ExternalCauseOfInjuryInfo10).append(hi1001ExternalCauseOfInjuryQlfrCode10, rhs.hi1001ExternalCauseOfInjuryQlfrCode10).append(hi1002ExternalCauseOfInjuryCode10, rhs.hi1002ExternalCauseOfInjuryCode10).append(hi1009CauseOfInjuryPresentOnAdmissionIndicator10, rhs.hi1009CauseOfInjuryPresentOnAdmissionIndicator10).append(hi11ExternalCauseOfInjuryInfo11, rhs.hi11ExternalCauseOfInjuryInfo11).append(hi1101ExternalCauseOfInjuryQlfrCode11, rhs.hi1101ExternalCauseOfInjuryQlfrCode11).append(hi1102ExternalCauseOfInjuryCode11, rhs.hi1102ExternalCauseOfInjuryCode11).append(hi1109CauseOfInjuryPresentOnAdmissionIndicator11, rhs.hi1109CauseOfInjuryPresentOnAdmissionIndicator11).append(hi12ExternalCauseOfInjuryInfo12, rhs.hi12ExternalCauseOfInjuryInfo12).append(hi1201ExternalCauseOfInjuryQlfrCode12, rhs.hi1201ExternalCauseOfInjuryQlfrCode12).append(hi1202ExternalCauseOfInjuryCode12, rhs.hi1202ExternalCauseOfInjuryCode12).append(hi1209CauseOfInjuryPresentOnAdmissionIndicator12, rhs.hi1209CauseOfInjuryPresentOnAdmissionIndicator12).append(hi01DRGInfo1, rhs.hi01DRGInfo1).append(hi0101DRGQlfrCode1, rhs.hi0101DRGQlfrCode1).append(hi1102DRGCode1, rhs.hi1102DRGCode1).append(hiOtherDiagnosisInfo, rhs.hiOtherDiagnosisInfo).append(hi01PrincipalProcedureInfo, rhs.hi01PrincipalProcedureInfo).append(hi0101PrincipalProcedureInfoQlfr, rhs.hi0101PrincipalProcedureInfoQlfr).append(hi0102PrincipalProcedureCode, rhs.hi0102PrincipalProcedureCode).append(hi0103PrincipalProcedureDateFormatQlfr, rhs.hi0103PrincipalProcedureDateFormatQlfr).append(hi0104PrincipalProcedureDate, rhs.hi0104PrincipalProcedureDate).append(hiOtherProcedureInfo, rhs.hiOtherProcedureInfo).append(hiOccurrenceSpanInfo, rhs.hiOccurrenceSpanInfo).append(hiOccurrenceInfo, rhs.hiOccurrenceInfo).append(hiValueInfo, rhs.hiValueInfo).append(hiTreatmentCodeInfo, rhs.hiTreatmentCodeInfo).append(hiConditionCode, rhs.hiConditionCode).append(hcp01PricingMethodology, rhs.hcp01PricingMethodology).append(hcp02RepricedAllowedAmount, rhs.hcp02RepricedAllowedAmount).append(hcp03RepricedSavingAmount, rhs.hcp03RepricedSavingAmount).append(hcp04RepricingOrgIdentifier, rhs.hcp04RepricingOrgIdentifier).append(hcp05RepricingPerDiemFlatRateAmount, rhs.hcp05RepricingPerDiemFlatRateAmount).append(hcp06RepricedApprovedAmbulatoryPatientGroupCode, rhs.hcp06RepricedApprovedAmbulatoryPatientGroupCode).append(hcp07RepricedApprovedAmbulatoryPatientGroupAmount, rhs.hcp07RepricedApprovedAmbulatoryPatientGroupAmount).append(hcp08RepricedApprovedRevenueCode, rhs.hcp08RepricedApprovedRevenueCode).append(hcp11UnitOrBasisOfMeasurementCode, rhs.hcp11UnitOrBasisOfMeasurementCode).append(hcp12RepricedApprovedServiceUnitCount, rhs.hcp12RepricedApprovedServiceUnitCount).append(hcp13RejectReasonCode, rhs.hcp13RejectReasonCode).append(hcp14PolicyComplianceCode, rhs.hcp14PolicyComplianceCode).append(hcp15ExceptionCode, rhs.hcp15ExceptionCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

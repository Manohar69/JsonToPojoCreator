
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
    "lx01_assignedNo",
    "sv101_compositeMedicalProcedureIdentifier",
    "sv101_01_productServiceIdQlfr",
    "sv101_02_procedureCode",
    "sv101_03_procedureModifier1",
    "sv101_04_procedureModifier2",
    "sv101_05_procedureModifier3",
    "sv101_06_procedureModifier4",
    "sv101_07_serviceDescription",
    "sv102_lineItemChargeAmount",
    "sv103_unitForMeasurementCode",
    "sv104_serviceUnitCount",
    "sv105_placeOfServiceCode",
    "sv107_compositeDiagnosisCodePointer",
    "sv107_01_diagnosisCodePointer1",
    "sv107_02_diagnosisCodePointer2",
    "sv107_03_diagnosisCodePointer3",
    "sv107_04_diagnosisCodePointer4",
    "sv109_emergencyIndicator",
    "sv111_epsdtIndicator",
    "sv112_familyPlanningIndicator",
    "sv115_coPayStatusCode",
    "sv201_serviceLineRevenueCode",
    "sv202_serviceLineRevenueCodeProcedureIdentifier",
    "sv202_01_productOrServiceIdQlfr",
    "sv202_02_procedureCode",
    "sv202_03_procedureModifier1",
    "sv202_04_procedureModifier2",
    "sv202_05_procedureModifier3",
    "sv202_06_procedureModifier4",
    "sv202_07_procedureDescription",
    "sv203_lineItemChargeAmount",
    "sv204_unitOrBasisForMeasurementCode",
    "sv205_serviceUnitCount",
    "sv207_lineItemDeniedChargeAmount",
    "sv301_dentalServiceProcedureIdentifier",
    "sv301_01_dentalServiceProductServiceIdQlfr",
    "sv301_02_dentalServiceProcedureCode",
    "sv301_03_dentalServiceProcedureModifier1",
    "sv301_04_dentalServiceProcedureModifier2",
    "sv301_05_dentalServiceProcedureModifier3",
    "sv301_06_dentalServiceProcedureModifier4",
    "sv301_07_dentalServiceDescription",
    "sv302_lineItemChargeAmount",
    "sv303_placeOfServiceCode",
    "sv304_oralCavityDesignation",
    "sv304_01_oralCavityDesignation1",
    "sv304_02_oralCavityDesignation2",
    "sv304_03_oralCavityDesignation3",
    "sv304_04_oralCavityDesignation4",
    "sv304_05_oralCavityDesignation5",
    "sv305_prosthesisCrownOrInlayCode",
    "sv306_procedureCount",
    "sv311_diagnosisCodePointer",
    "sv311_01_diagnosisCodePointer1",
    "sv311_02_diagnosisCodePointer2",
    "sv311_03_diagnosisCodePointer3",
    "sv311_04_diagnosisCodePointer4",
    "sv501_compositeMedicalProcedureIdentifier",
    "sv501_01_procedureIdentifier",
    "sv501_02_procedureCode",
    "sv502_basisForMeasurementCode",
    "sv503_daysLengthOfMedicalNecessity",
    "sv504_dmeRentalPrice",
    "sv505_dmePurchasePrice",
    "sv506_rentalUnitPriceIndicator",
    "pwk_lineSupplementInformation",
    "pwk01_attachReportTypeCode",
    "pwk02_attachReportTransmissionCode",
    "cr101_basisForMeasurementCodePound",
    "cr102_patientWeightlbs",
    "cr104_ambulanceTransportReasonCode",
    "cr105_basisForMeasurementCodeMiles",
    "cr106_transportDistanceMiles",
    "cr109_roundTripPurposeDescription",
    "cr110_stretcherPurposeDescription",
    "cr301_dmeCertificationTypeCode",
    "cr302_dmeBasisForMeasurementCode",
    "cr303_dmeDurationMonths",
    "crc_ambulanceCertification",
    "crc01_hospiceEmployedProviderCode",
    "crc02_hospiceEmployedProviderIndicator",
    "crc03_hospiceEmployedConditionIndicator",
    "crc01_dmeConditionIndicatorCode",
    "crc02_dmeConditionIndicator",
    "crc03_dmeConditionCode1",
    "crc04_dmeConditionCode2",
    "too_toothInformation",
    "dtp01_serviceDateQlfr",
    "dtp02_serviceDateFormatQlfr",
    "dtp03_serviceDate",
    "dtp01_prescriptionDateQlfr",
    "dtp02_prescriptionFormatQlfr",
    "dtp03_prescriptionDate",
    "dtp01_certificationRevisionDateQlfr",
    "dtp02_certificationRevisionDateFormatQlfr",
    "dtp03_certificationRevisionDate",
    "dtp01_beginTherapyDateQlfr",
    "dtp02_beginTherapyDateFormatQlfr",
    "dtp03_beginTherapyDate",
    "dtp01_lastCertificateDateQlfr",
    "dtp02_lastCertificateDateFormatQlfr",
    "dtp03_lastCertificationDate",
    "dtp01_lastSeenDateQlfr",
    "dtp02_lastSeenDateFormatQlfr",
    "dtp03_lastSeenDate",
    "dtp_lastTestDate",
    "dtp01_shippedDateQlfr",
    "dtp02_shippedDateFormatQlfr",
    "dtp03_shippedDate",
    "dtp01_lastXrayDateQlfr",
    "dtp02_lastXrayDateFormatQlfr",
    "dtp03_lastXrayDate",
    "dtp01_priorPlacementDateQlfr",
    "dtp02_priorPlacementDateFormatQlfr",
    "dtp03_priorPlacementDate",
    "dtp01_orthodonticBandingDateQlfr",
    "dtp02_orthodonticBandingDateFormatQlfr",
    "dtp03_orthodonticBandingDate",
    "dtp01_replacementDateQlfr",
    "dtp02_replacementDateFormatQlfr",
    "dtp03_replacementDate",
    "dtp01_treatmentStartDateQlfr",
    "dtp02_treatmentStartDateFormatQlfr",
    "dtp03_treatmentStartDate",
    "dtp01_treatmentCompletionDateQlfr",
    "dtp02_treatmentCompletionFormatQlfr",
    "dtp03_treatmentCompletionDate",
    "dtp01_initialTreatmentDateQlfr",
    "dtp02_initialTreatmentDateFormatQlfr",
    "dtp03_initialTreatmentDate",
    "qty01_ambulancePatientCountQlfr",
    "qty02_ambulancePatientCount",
    "qty01_obstetricAdditionalUnitsQlfr",
    "qty02_obstetricAdditionalUnits",
    "mea_testResult",
    "cn101_contractTypeCode",
    "cn102_contractAmount",
    "cn103_contractPercentage",
    "cn104_contractCode",
    "cn105_contractTermsDiscountPercent",
    "cn106_contractVersionIdentifier",
    "ref01_repricedLineItemReferenceNoQlfr",
    "ref02_repricedLineItemReferenceNo",
    "ref01_adjustedRepricedLineItemReferenceNoQlfr",
    "ref02_adjustedRepricedLineItemReferenceNo",
    "ref_predeterminationOfBenefitsIdentification",
    "ref_priorAuthorization",
    "ref01_lineItemControlNoQlfr",
    "ref02_lineItemControlNo",
    "ref01_mammographyCertificationNoQlfr",
    "ref02_mammographyCertificationNo",
    "ref01_CLIAQlfr",
    "ref02_CLIANo",
    "ref01_referringCLIANoQlfr",
    "ref02_referringCLIANo",
    "ref01_immunizationBatchNoQlfr",
    "ref02_immunizationBatchNo",
    "ref_referralNo",
    "amt01_salesTaxAmountQlfrCode",
    "amt02_salesTaxAmount",
    "amt01_postageClaimedAmountQlfrCode",
    "amt02_postageClaimedAmount",
    "amt01_goodsAndServiceTaxQlfrCode",
    "amt02_serviceTaxAmount",
    "amt01_MiscellaneousQlfrCode",
    "amt02_facilityTaxAmount",
    "k3fileInformation",
    "nte01_lineNoteReferenceCode",
    "nte02_lineNoteText",
    "nte01_thirdPartyNoteCode",
    "nte02_thirdPartyText",
    "ps101_purchasedServiceProviderIdentifier",
    "ps102_purchasedServiceChargeAmount",
    "hcp01_pricingMethodologyCode",
    "hcp02_repricedAllowedAmount",
    "hcp03_repricedSavingAmount",
    "hcp04_repricingOrgIdentifier",
    "hcp05_repricingPerDiemFlatRateAmount",
    "hcp06_repricedApprovedAmbulatoryPatientGroupCode",
    "hcp07_repricedApprovedAmbulatoryPatientGroupAmount",
    "hcp09_repricedServiceIdQlfr",
    "hcp10_repricedApprovedHCPCSCode",
    "hcp11_repricedUnitMeasurementCode",
    "hcp12_repricedApprovedServiceUnitCount",
    "hcp13_repricedRejectReasonCode",
    "hcp14_repricedPolicyComplianceCode",
    "hcp15_repricedExceptionCode"
})
public class SvcLineNo {

    @JsonProperty("lx01_assignedNo")
    private String lx01AssignedNo;
    @JsonProperty("sv101_compositeMedicalProcedureIdentifier")
    private String sv101CompositeMedicalProcedureIdentifier;
    @JsonProperty("sv101_01_productServiceIdQlfr")
    private String sv10101ProductServiceIdQlfr;
    @JsonProperty("sv101_02_procedureCode")
    private String sv10102ProcedureCode;
    @JsonProperty("sv101_03_procedureModifier1")
    private String sv10103ProcedureModifier1;
    @JsonProperty("sv101_04_procedureModifier2")
    private String sv10104ProcedureModifier2;
    @JsonProperty("sv101_05_procedureModifier3")
    private String sv10105ProcedureModifier3;
    @JsonProperty("sv101_06_procedureModifier4")
    private String sv10106ProcedureModifier4;
    @JsonProperty("sv101_07_serviceDescription")
    private String sv10107ServiceDescription;
    @JsonProperty("sv102_lineItemChargeAmount")
    private String sv102LineItemChargeAmount;
    @JsonProperty("sv103_unitForMeasurementCode")
    private String sv103UnitForMeasurementCode;
    @JsonProperty("sv104_serviceUnitCount")
    private String sv104ServiceUnitCount;
    @JsonProperty("sv105_placeOfServiceCode")
    private String sv105PlaceOfServiceCode;
    @JsonProperty("sv107_compositeDiagnosisCodePointer")
    private String sv107CompositeDiagnosisCodePointer;
    @JsonProperty("sv107_01_diagnosisCodePointer1")
    private String sv10701DiagnosisCodePointer1;
    @JsonProperty("sv107_02_diagnosisCodePointer2")
    private String sv10702DiagnosisCodePointer2;
    @JsonProperty("sv107_03_diagnosisCodePointer3")
    private String sv10703DiagnosisCodePointer3;
    @JsonProperty("sv107_04_diagnosisCodePointer4")
    private String sv10704DiagnosisCodePointer4;
    @JsonProperty("sv109_emergencyIndicator")
    private String sv109EmergencyIndicator;
    @JsonProperty("sv111_epsdtIndicator")
    private String sv111EpsdtIndicator;
    @JsonProperty("sv112_familyPlanningIndicator")
    private String sv112FamilyPlanningIndicator;
    @JsonProperty("sv115_coPayStatusCode")
    private String sv115CoPayStatusCode;
    @JsonProperty("sv201_serviceLineRevenueCode")
    private String sv201ServiceLineRevenueCode;
    @JsonProperty("sv202_serviceLineRevenueCodeProcedureIdentifier")
    private String sv202ServiceLineRevenueCodeProcedureIdentifier;
    @JsonProperty("sv202_01_productOrServiceIdQlfr")
    private String sv20201ProductOrServiceIdQlfr;
    @JsonProperty("sv202_02_procedureCode")
    private String sv20202ProcedureCode;
    @JsonProperty("sv202_03_procedureModifier1")
    private String sv20203ProcedureModifier1;
    @JsonProperty("sv202_04_procedureModifier2")
    private String sv20204ProcedureModifier2;
    @JsonProperty("sv202_05_procedureModifier3")
    private String sv20205ProcedureModifier3;
    @JsonProperty("sv202_06_procedureModifier4")
    private String sv20206ProcedureModifier4;
    @JsonProperty("sv202_07_procedureDescription")
    private String sv20207ProcedureDescription;
    @JsonProperty("sv203_lineItemChargeAmount")
    private String sv203LineItemChargeAmount;
    @JsonProperty("sv204_unitOrBasisForMeasurementCode")
    private String sv204UnitOrBasisForMeasurementCode;
    @JsonProperty("sv205_serviceUnitCount")
    private String sv205ServiceUnitCount;
    @JsonProperty("sv207_lineItemDeniedChargeAmount")
    private String sv207LineItemDeniedChargeAmount;
    @JsonProperty("sv301_dentalServiceProcedureIdentifier")
    private String sv301DentalServiceProcedureIdentifier;
    @JsonProperty("sv301_01_dentalServiceProductServiceIdQlfr")
    private String sv30101DentalServiceProductServiceIdQlfr;
    @JsonProperty("sv301_02_dentalServiceProcedureCode")
    private String sv30102DentalServiceProcedureCode;
    @JsonProperty("sv301_03_dentalServiceProcedureModifier1")
    private String sv30103DentalServiceProcedureModifier1;
    @JsonProperty("sv301_04_dentalServiceProcedureModifier2")
    private String sv30104DentalServiceProcedureModifier2;
    @JsonProperty("sv301_05_dentalServiceProcedureModifier3")
    private String sv30105DentalServiceProcedureModifier3;
    @JsonProperty("sv301_06_dentalServiceProcedureModifier4")
    private String sv30106DentalServiceProcedureModifier4;
    @JsonProperty("sv301_07_dentalServiceDescription")
    private String sv30107DentalServiceDescription;
    @JsonProperty("sv302_lineItemChargeAmount")
    private String sv302LineItemChargeAmount;
    @JsonProperty("sv303_placeOfServiceCode")
    private String sv303PlaceOfServiceCode;
    @JsonProperty("sv304_oralCavityDesignation")
    private String sv304OralCavityDesignation;
    @JsonProperty("sv304_01_oralCavityDesignation1")
    private String sv30401OralCavityDesignation1;
    @JsonProperty("sv304_02_oralCavityDesignation2")
    private String sv30402OralCavityDesignation2;
    @JsonProperty("sv304_03_oralCavityDesignation3")
    private String sv30403OralCavityDesignation3;
    @JsonProperty("sv304_04_oralCavityDesignation4")
    private String sv30404OralCavityDesignation4;
    @JsonProperty("sv304_05_oralCavityDesignation5")
    private String sv30405OralCavityDesignation5;
    @JsonProperty("sv305_prosthesisCrownOrInlayCode")
    private String sv305ProsthesisCrownOrInlayCode;
    @JsonProperty("sv306_procedureCount")
    private String sv306ProcedureCount;
    @JsonProperty("sv311_diagnosisCodePointer")
    private String sv311DiagnosisCodePointer;
    @JsonProperty("sv311_01_diagnosisCodePointer1")
    private String sv31101DiagnosisCodePointer1;
    @JsonProperty("sv311_02_diagnosisCodePointer2")
    private String sv31102DiagnosisCodePointer2;
    @JsonProperty("sv311_03_diagnosisCodePointer3")
    private String sv31103DiagnosisCodePointer3;
    @JsonProperty("sv311_04_diagnosisCodePointer4")
    private String sv31104DiagnosisCodePointer4;
    @JsonProperty("sv501_compositeMedicalProcedureIdentifier")
    private String sv501CompositeMedicalProcedureIdentifier;
    @JsonProperty("sv501_01_procedureIdentifier")
    private String sv50101ProcedureIdentifier;
    @JsonProperty("sv501_02_procedureCode")
    private String sv50102ProcedureCode;
    @JsonProperty("sv502_basisForMeasurementCode")
    private String sv502BasisForMeasurementCode;
    @JsonProperty("sv503_daysLengthOfMedicalNecessity")
    private String sv503DaysLengthOfMedicalNecessity;
    @JsonProperty("sv504_dmeRentalPrice")
    private String sv504DmeRentalPrice;
    @JsonProperty("sv505_dmePurchasePrice")
    private String sv505DmePurchasePrice;
    @JsonProperty("sv506_rentalUnitPriceIndicator")
    private String sv506RentalUnitPriceIndicator;
    @JsonProperty("pwk_lineSupplementInformation")
    private List<PwkLineSupplementInformation> pwkLineSupplementInformation = new ArrayList<PwkLineSupplementInformation>();
    @JsonProperty("pwk01_attachReportTypeCode")
    private String pwk01AttachReportTypeCode;
    @JsonProperty("pwk02_attachReportTransmissionCode")
    private String pwk02AttachReportTransmissionCode;
    @JsonProperty("cr101_basisForMeasurementCodePound")
    private String cr101BasisForMeasurementCodePound;
    @JsonProperty("cr102_patientWeightlbs")
    private String cr102PatientWeightlbs;
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
    @JsonProperty("cr301_dmeCertificationTypeCode")
    private String cr301DmeCertificationTypeCode;
    @JsonProperty("cr302_dmeBasisForMeasurementCode")
    private String cr302DmeBasisForMeasurementCode;
    @JsonProperty("cr303_dmeDurationMonths")
    private String cr303DmeDurationMonths;
    @JsonProperty("crc_ambulanceCertification")
    private List<CrcAmbulanceCertification_> crcAmbulanceCertification = new ArrayList<CrcAmbulanceCertification_>();
    @JsonProperty("crc01_hospiceEmployedProviderCode")
    private String crc01HospiceEmployedProviderCode;
    @JsonProperty("crc02_hospiceEmployedProviderIndicator")
    private String crc02HospiceEmployedProviderIndicator;
    @JsonProperty("crc03_hospiceEmployedConditionIndicator")
    private String crc03HospiceEmployedConditionIndicator;
    @JsonProperty("crc01_dmeConditionIndicatorCode")
    private String crc01DmeConditionIndicatorCode;
    @JsonProperty("crc02_dmeConditionIndicator")
    private String crc02DmeConditionIndicator;
    @JsonProperty("crc03_dmeConditionCode1")
    private String crc03DmeConditionCode1;
    @JsonProperty("crc04_dmeConditionCode2")
    private String crc04DmeConditionCode2;
    @JsonProperty("too_toothInformation")
    private List<TooToothInformation> tooToothInformation = new ArrayList<TooToothInformation>();
    @JsonProperty("dtp01_serviceDateQlfr")
    private String dtp01ServiceDateQlfr;
    @JsonProperty("dtp02_serviceDateFormatQlfr")
    private String dtp02ServiceDateFormatQlfr;
    @JsonProperty("dtp03_serviceDate")
    private String dtp03ServiceDate;
    @JsonProperty("dtp01_prescriptionDateQlfr")
    private String dtp01PrescriptionDateQlfr;
    @JsonProperty("dtp02_prescriptionFormatQlfr")
    private String dtp02PrescriptionFormatQlfr;
    @JsonProperty("dtp03_prescriptionDate")
    private String dtp03PrescriptionDate;
    @JsonProperty("dtp01_certificationRevisionDateQlfr")
    private String dtp01CertificationRevisionDateQlfr;
    @JsonProperty("dtp02_certificationRevisionDateFormatQlfr")
    private String dtp02CertificationRevisionDateFormatQlfr;
    @JsonProperty("dtp03_certificationRevisionDate")
    private String dtp03CertificationRevisionDate;
    @JsonProperty("dtp01_beginTherapyDateQlfr")
    private String dtp01BeginTherapyDateQlfr;
    @JsonProperty("dtp02_beginTherapyDateFormatQlfr")
    private String dtp02BeginTherapyDateFormatQlfr;
    @JsonProperty("dtp03_beginTherapyDate")
    private String dtp03BeginTherapyDate;
    @JsonProperty("dtp01_lastCertificateDateQlfr")
    private String dtp01LastCertificateDateQlfr;
    @JsonProperty("dtp02_lastCertificateDateFormatQlfr")
    private String dtp02LastCertificateDateFormatQlfr;
    @JsonProperty("dtp03_lastCertificationDate")
    private String dtp03LastCertificationDate;
    @JsonProperty("dtp01_lastSeenDateQlfr")
    private String dtp01LastSeenDateQlfr;
    @JsonProperty("dtp02_lastSeenDateFormatQlfr")
    private String dtp02LastSeenDateFormatQlfr;
    @JsonProperty("dtp03_lastSeenDate")
    private String dtp03LastSeenDate;
    @JsonProperty("dtp_lastTestDate")
    private List<DtpLastTestDate> dtpLastTestDate = new ArrayList<DtpLastTestDate>();
    @JsonProperty("dtp01_shippedDateQlfr")
    private String dtp01ShippedDateQlfr;
    @JsonProperty("dtp02_shippedDateFormatQlfr")
    private String dtp02ShippedDateFormatQlfr;
    @JsonProperty("dtp03_shippedDate")
    private String dtp03ShippedDate;
    @JsonProperty("dtp01_lastXrayDateQlfr")
    private String dtp01LastXrayDateQlfr;
    @JsonProperty("dtp02_lastXrayDateFormatQlfr")
    private String dtp02LastXrayDateFormatQlfr;
    @JsonProperty("dtp03_lastXrayDate")
    private String dtp03LastXrayDate;
    @JsonProperty("dtp01_priorPlacementDateQlfr")
    private String dtp01PriorPlacementDateQlfr;
    @JsonProperty("dtp02_priorPlacementDateFormatQlfr")
    private String dtp02PriorPlacementDateFormatQlfr;
    @JsonProperty("dtp03_priorPlacementDate")
    private String dtp03PriorPlacementDate;
    @JsonProperty("dtp01_orthodonticBandingDateQlfr")
    private String dtp01OrthodonticBandingDateQlfr;
    @JsonProperty("dtp02_orthodonticBandingDateFormatQlfr")
    private String dtp02OrthodonticBandingDateFormatQlfr;
    @JsonProperty("dtp03_orthodonticBandingDate")
    private String dtp03OrthodonticBandingDate;
    @JsonProperty("dtp01_replacementDateQlfr")
    private String dtp01ReplacementDateQlfr;
    @JsonProperty("dtp02_replacementDateFormatQlfr")
    private String dtp02ReplacementDateFormatQlfr;
    @JsonProperty("dtp03_replacementDate")
    private String dtp03ReplacementDate;
    @JsonProperty("dtp01_treatmentStartDateQlfr")
    private String dtp01TreatmentStartDateQlfr;
    @JsonProperty("dtp02_treatmentStartDateFormatQlfr")
    private String dtp02TreatmentStartDateFormatQlfr;
    @JsonProperty("dtp03_treatmentStartDate")
    private String dtp03TreatmentStartDate;
    @JsonProperty("dtp01_treatmentCompletionDateQlfr")
    private String dtp01TreatmentCompletionDateQlfr;
    @JsonProperty("dtp02_treatmentCompletionFormatQlfr")
    private String dtp02TreatmentCompletionFormatQlfr;
    @JsonProperty("dtp03_treatmentCompletionDate")
    private String dtp03TreatmentCompletionDate;
    @JsonProperty("dtp01_initialTreatmentDateQlfr")
    private String dtp01InitialTreatmentDateQlfr;
    @JsonProperty("dtp02_initialTreatmentDateFormatQlfr")
    private String dtp02InitialTreatmentDateFormatQlfr;
    @JsonProperty("dtp03_initialTreatmentDate")
    private String dtp03InitialTreatmentDate;
    @JsonProperty("qty01_ambulancePatientCountQlfr")
    private String qty01AmbulancePatientCountQlfr;
    @JsonProperty("qty02_ambulancePatientCount")
    private String qty02AmbulancePatientCount;
    @JsonProperty("qty01_obstetricAdditionalUnitsQlfr")
    private String qty01ObstetricAdditionalUnitsQlfr;
    @JsonProperty("qty02_obstetricAdditionalUnits")
    private String qty02ObstetricAdditionalUnits;
    @JsonProperty("mea_testResult")
    private List<MeaTestResult> meaTestResult = new ArrayList<MeaTestResult>();
    @JsonProperty("cn101_contractTypeCode")
    private String cn101ContractTypeCode;
    @JsonProperty("cn102_contractAmount")
    private String cn102ContractAmount;
    @JsonProperty("cn103_contractPercentage")
    private String cn103ContractPercentage;
    @JsonProperty("cn104_contractCode")
    private String cn104ContractCode;
    @JsonProperty("cn105_contractTermsDiscountPercent")
    private String cn105ContractTermsDiscountPercent;
    @JsonProperty("cn106_contractVersionIdentifier")
    private String cn106ContractVersionIdentifier;
    @JsonProperty("ref01_repricedLineItemReferenceNoQlfr")
    private String ref01RepricedLineItemReferenceNoQlfr;
    @JsonProperty("ref02_repricedLineItemReferenceNo")
    private String ref02RepricedLineItemReferenceNo;
    @JsonProperty("ref01_adjustedRepricedLineItemReferenceNoQlfr")
    private String ref01AdjustedRepricedLineItemReferenceNoQlfr;
    @JsonProperty("ref02_adjustedRepricedLineItemReferenceNo")
    private String ref02AdjustedRepricedLineItemReferenceNo;
    @JsonProperty("ref_predeterminationOfBenefitsIdentification")
    private List<RefPredeterminationOfBenefitsIdentification_> refPredeterminationOfBenefitsIdentification = new ArrayList<RefPredeterminationOfBenefitsIdentification_>();
    @JsonProperty("ref_priorAuthorization")
    private List<RefPriorAuthorization> refPriorAuthorization = new ArrayList<RefPriorAuthorization>();
    @JsonProperty("ref01_lineItemControlNoQlfr")
    private String ref01LineItemControlNoQlfr;
    @JsonProperty("ref02_lineItemControlNo")
    private String ref02LineItemControlNo;
    @JsonProperty("ref01_mammographyCertificationNoQlfr")
    private String ref01MammographyCertificationNoQlfr;
    @JsonProperty("ref02_mammographyCertificationNo")
    private String ref02MammographyCertificationNo;
    @JsonProperty("ref01_CLIAQlfr")
    private String ref01CLIAQlfr;
    @JsonProperty("ref02_CLIANo")
    private String ref02CLIANo;
    @JsonProperty("ref01_referringCLIANoQlfr")
    private String ref01ReferringCLIANoQlfr;
    @JsonProperty("ref02_referringCLIANo")
    private String ref02ReferringCLIANo;
    @JsonProperty("ref01_immunizationBatchNoQlfr")
    private String ref01ImmunizationBatchNoQlfr;
    @JsonProperty("ref02_immunizationBatchNo")
    private String ref02ImmunizationBatchNo;
    @JsonProperty("ref_referralNo")
    private List<RefReferralNo> refReferralNo = new ArrayList<RefReferralNo>();
    @JsonProperty("amt01_salesTaxAmountQlfrCode")
    private String amt01SalesTaxAmountQlfrCode;
    @JsonProperty("amt02_salesTaxAmount")
    private String amt02SalesTaxAmount;
    @JsonProperty("amt01_postageClaimedAmountQlfrCode")
    private String amt01PostageClaimedAmountQlfrCode;
    @JsonProperty("amt02_postageClaimedAmount")
    private String amt02PostageClaimedAmount;
    @JsonProperty("amt01_goodsAndServiceTaxQlfrCode")
    private String amt01GoodsAndServiceTaxQlfrCode;
    @JsonProperty("amt02_serviceTaxAmount")
    private String amt02ServiceTaxAmount;
    @JsonProperty("amt01_MiscellaneousQlfrCode")
    private String amt01MiscellaneousQlfrCode;
    @JsonProperty("amt02_facilityTaxAmount")
    private String amt02FacilityTaxAmount;
    @JsonProperty("k3fileInformation")
    private List<List<K3fileInformation_>> k3fileInformation = new ArrayList<List<K3fileInformation_>>();
    @JsonProperty("nte01_lineNoteReferenceCode")
    private String nte01LineNoteReferenceCode;
    @JsonProperty("nte02_lineNoteText")
    private String nte02LineNoteText;
    @JsonProperty("nte01_thirdPartyNoteCode")
    private String nte01ThirdPartyNoteCode;
    @JsonProperty("nte02_thirdPartyText")
    private String nte02ThirdPartyText;
    @JsonProperty("ps101_purchasedServiceProviderIdentifier")
    private String ps101PurchasedServiceProviderIdentifier;
    @JsonProperty("ps102_purchasedServiceChargeAmount")
    private String ps102PurchasedServiceChargeAmount;
    @JsonProperty("hcp01_pricingMethodologyCode")
    private String hcp01PricingMethodologyCode;
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
    @JsonProperty("hcp09_repricedServiceIdQlfr")
    private String hcp09RepricedServiceIdQlfr;
    @JsonProperty("hcp10_repricedApprovedHCPCSCode")
    private String hcp10RepricedApprovedHCPCSCode;
    @JsonProperty("hcp11_repricedUnitMeasurementCode")
    private String hcp11RepricedUnitMeasurementCode;
    @JsonProperty("hcp12_repricedApprovedServiceUnitCount")
    private String hcp12RepricedApprovedServiceUnitCount;
    @JsonProperty("hcp13_repricedRejectReasonCode")
    private String hcp13RepricedRejectReasonCode;
    @JsonProperty("hcp14_repricedPolicyComplianceCode")
    private String hcp14RepricedPolicyComplianceCode;
    @JsonProperty("hcp15_repricedExceptionCode")
    private String hcp15RepricedExceptionCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lx01_assignedNo")
    public String getLx01AssignedNo() {
        return lx01AssignedNo;
    }

    @JsonProperty("lx01_assignedNo")
    public void setLx01AssignedNo(String lx01AssignedNo) {
        this.lx01AssignedNo = lx01AssignedNo;
    }

    public SvcLineNo withLx01AssignedNo(String lx01AssignedNo) {
        this.lx01AssignedNo = lx01AssignedNo;
        return this;
    }

    @JsonProperty("sv101_compositeMedicalProcedureIdentifier")
    public String getSv101CompositeMedicalProcedureIdentifier() {
        return sv101CompositeMedicalProcedureIdentifier;
    }

    @JsonProperty("sv101_compositeMedicalProcedureIdentifier")
    public void setSv101CompositeMedicalProcedureIdentifier(String sv101CompositeMedicalProcedureIdentifier) {
        this.sv101CompositeMedicalProcedureIdentifier = sv101CompositeMedicalProcedureIdentifier;
    }

    public SvcLineNo withSv101CompositeMedicalProcedureIdentifier(String sv101CompositeMedicalProcedureIdentifier) {
        this.sv101CompositeMedicalProcedureIdentifier = sv101CompositeMedicalProcedureIdentifier;
        return this;
    }

    @JsonProperty("sv101_01_productServiceIdQlfr")
    public String getSv10101ProductServiceIdQlfr() {
        return sv10101ProductServiceIdQlfr;
    }

    @JsonProperty("sv101_01_productServiceIdQlfr")
    public void setSv10101ProductServiceIdQlfr(String sv10101ProductServiceIdQlfr) {
        this.sv10101ProductServiceIdQlfr = sv10101ProductServiceIdQlfr;
    }

    public SvcLineNo withSv10101ProductServiceIdQlfr(String sv10101ProductServiceIdQlfr) {
        this.sv10101ProductServiceIdQlfr = sv10101ProductServiceIdQlfr;
        return this;
    }

    @JsonProperty("sv101_02_procedureCode")
    public String getSv10102ProcedureCode() {
        return sv10102ProcedureCode;
    }

    @JsonProperty("sv101_02_procedureCode")
    public void setSv10102ProcedureCode(String sv10102ProcedureCode) {
        this.sv10102ProcedureCode = sv10102ProcedureCode;
    }

    public SvcLineNo withSv10102ProcedureCode(String sv10102ProcedureCode) {
        this.sv10102ProcedureCode = sv10102ProcedureCode;
        return this;
    }

    @JsonProperty("sv101_03_procedureModifier1")
    public String getSv10103ProcedureModifier1() {
        return sv10103ProcedureModifier1;
    }

    @JsonProperty("sv101_03_procedureModifier1")
    public void setSv10103ProcedureModifier1(String sv10103ProcedureModifier1) {
        this.sv10103ProcedureModifier1 = sv10103ProcedureModifier1;
    }

    public SvcLineNo withSv10103ProcedureModifier1(String sv10103ProcedureModifier1) {
        this.sv10103ProcedureModifier1 = sv10103ProcedureModifier1;
        return this;
    }

    @JsonProperty("sv101_04_procedureModifier2")
    public String getSv10104ProcedureModifier2() {
        return sv10104ProcedureModifier2;
    }

    @JsonProperty("sv101_04_procedureModifier2")
    public void setSv10104ProcedureModifier2(String sv10104ProcedureModifier2) {
        this.sv10104ProcedureModifier2 = sv10104ProcedureModifier2;
    }

    public SvcLineNo withSv10104ProcedureModifier2(String sv10104ProcedureModifier2) {
        this.sv10104ProcedureModifier2 = sv10104ProcedureModifier2;
        return this;
    }

    @JsonProperty("sv101_05_procedureModifier3")
    public String getSv10105ProcedureModifier3() {
        return sv10105ProcedureModifier3;
    }

    @JsonProperty("sv101_05_procedureModifier3")
    public void setSv10105ProcedureModifier3(String sv10105ProcedureModifier3) {
        this.sv10105ProcedureModifier3 = sv10105ProcedureModifier3;
    }

    public SvcLineNo withSv10105ProcedureModifier3(String sv10105ProcedureModifier3) {
        this.sv10105ProcedureModifier3 = sv10105ProcedureModifier3;
        return this;
    }

    @JsonProperty("sv101_06_procedureModifier4")
    public String getSv10106ProcedureModifier4() {
        return sv10106ProcedureModifier4;
    }

    @JsonProperty("sv101_06_procedureModifier4")
    public void setSv10106ProcedureModifier4(String sv10106ProcedureModifier4) {
        this.sv10106ProcedureModifier4 = sv10106ProcedureModifier4;
    }

    public SvcLineNo withSv10106ProcedureModifier4(String sv10106ProcedureModifier4) {
        this.sv10106ProcedureModifier4 = sv10106ProcedureModifier4;
        return this;
    }

    @JsonProperty("sv101_07_serviceDescription")
    public String getSv10107ServiceDescription() {
        return sv10107ServiceDescription;
    }

    @JsonProperty("sv101_07_serviceDescription")
    public void setSv10107ServiceDescription(String sv10107ServiceDescription) {
        this.sv10107ServiceDescription = sv10107ServiceDescription;
    }

    public SvcLineNo withSv10107ServiceDescription(String sv10107ServiceDescription) {
        this.sv10107ServiceDescription = sv10107ServiceDescription;
        return this;
    }

    @JsonProperty("sv102_lineItemChargeAmount")
    public String getSv102LineItemChargeAmount() {
        return sv102LineItemChargeAmount;
    }

    @JsonProperty("sv102_lineItemChargeAmount")
    public void setSv102LineItemChargeAmount(String sv102LineItemChargeAmount) {
        this.sv102LineItemChargeAmount = sv102LineItemChargeAmount;
    }

    public SvcLineNo withSv102LineItemChargeAmount(String sv102LineItemChargeAmount) {
        this.sv102LineItemChargeAmount = sv102LineItemChargeAmount;
        return this;
    }

    @JsonProperty("sv103_unitForMeasurementCode")
    public String getSv103UnitForMeasurementCode() {
        return sv103UnitForMeasurementCode;
    }

    @JsonProperty("sv103_unitForMeasurementCode")
    public void setSv103UnitForMeasurementCode(String sv103UnitForMeasurementCode) {
        this.sv103UnitForMeasurementCode = sv103UnitForMeasurementCode;
    }

    public SvcLineNo withSv103UnitForMeasurementCode(String sv103UnitForMeasurementCode) {
        this.sv103UnitForMeasurementCode = sv103UnitForMeasurementCode;
        return this;
    }

    @JsonProperty("sv104_serviceUnitCount")
    public String getSv104ServiceUnitCount() {
        return sv104ServiceUnitCount;
    }

    @JsonProperty("sv104_serviceUnitCount")
    public void setSv104ServiceUnitCount(String sv104ServiceUnitCount) {
        this.sv104ServiceUnitCount = sv104ServiceUnitCount;
    }

    public SvcLineNo withSv104ServiceUnitCount(String sv104ServiceUnitCount) {
        this.sv104ServiceUnitCount = sv104ServiceUnitCount;
        return this;
    }

    @JsonProperty("sv105_placeOfServiceCode")
    public String getSv105PlaceOfServiceCode() {
        return sv105PlaceOfServiceCode;
    }

    @JsonProperty("sv105_placeOfServiceCode")
    public void setSv105PlaceOfServiceCode(String sv105PlaceOfServiceCode) {
        this.sv105PlaceOfServiceCode = sv105PlaceOfServiceCode;
    }

    public SvcLineNo withSv105PlaceOfServiceCode(String sv105PlaceOfServiceCode) {
        this.sv105PlaceOfServiceCode = sv105PlaceOfServiceCode;
        return this;
    }

    @JsonProperty("sv107_compositeDiagnosisCodePointer")
    public String getSv107CompositeDiagnosisCodePointer() {
        return sv107CompositeDiagnosisCodePointer;
    }

    @JsonProperty("sv107_compositeDiagnosisCodePointer")
    public void setSv107CompositeDiagnosisCodePointer(String sv107CompositeDiagnosisCodePointer) {
        this.sv107CompositeDiagnosisCodePointer = sv107CompositeDiagnosisCodePointer;
    }

    public SvcLineNo withSv107CompositeDiagnosisCodePointer(String sv107CompositeDiagnosisCodePointer) {
        this.sv107CompositeDiagnosisCodePointer = sv107CompositeDiagnosisCodePointer;
        return this;
    }

    @JsonProperty("sv107_01_diagnosisCodePointer1")
    public String getSv10701DiagnosisCodePointer1() {
        return sv10701DiagnosisCodePointer1;
    }

    @JsonProperty("sv107_01_diagnosisCodePointer1")
    public void setSv10701DiagnosisCodePointer1(String sv10701DiagnosisCodePointer1) {
        this.sv10701DiagnosisCodePointer1 = sv10701DiagnosisCodePointer1;
    }

    public SvcLineNo withSv10701DiagnosisCodePointer1(String sv10701DiagnosisCodePointer1) {
        this.sv10701DiagnosisCodePointer1 = sv10701DiagnosisCodePointer1;
        return this;
    }

    @JsonProperty("sv107_02_diagnosisCodePointer2")
    public String getSv10702DiagnosisCodePointer2() {
        return sv10702DiagnosisCodePointer2;
    }

    @JsonProperty("sv107_02_diagnosisCodePointer2")
    public void setSv10702DiagnosisCodePointer2(String sv10702DiagnosisCodePointer2) {
        this.sv10702DiagnosisCodePointer2 = sv10702DiagnosisCodePointer2;
    }

    public SvcLineNo withSv10702DiagnosisCodePointer2(String sv10702DiagnosisCodePointer2) {
        this.sv10702DiagnosisCodePointer2 = sv10702DiagnosisCodePointer2;
        return this;
    }

    @JsonProperty("sv107_03_diagnosisCodePointer3")
    public String getSv10703DiagnosisCodePointer3() {
        return sv10703DiagnosisCodePointer3;
    }

    @JsonProperty("sv107_03_diagnosisCodePointer3")
    public void setSv10703DiagnosisCodePointer3(String sv10703DiagnosisCodePointer3) {
        this.sv10703DiagnosisCodePointer3 = sv10703DiagnosisCodePointer3;
    }

    public SvcLineNo withSv10703DiagnosisCodePointer3(String sv10703DiagnosisCodePointer3) {
        this.sv10703DiagnosisCodePointer3 = sv10703DiagnosisCodePointer3;
        return this;
    }

    @JsonProperty("sv107_04_diagnosisCodePointer4")
    public String getSv10704DiagnosisCodePointer4() {
        return sv10704DiagnosisCodePointer4;
    }

    @JsonProperty("sv107_04_diagnosisCodePointer4")
    public void setSv10704DiagnosisCodePointer4(String sv10704DiagnosisCodePointer4) {
        this.sv10704DiagnosisCodePointer4 = sv10704DiagnosisCodePointer4;
    }

    public SvcLineNo withSv10704DiagnosisCodePointer4(String sv10704DiagnosisCodePointer4) {
        this.sv10704DiagnosisCodePointer4 = sv10704DiagnosisCodePointer4;
        return this;
    }

    @JsonProperty("sv109_emergencyIndicator")
    public String getSv109EmergencyIndicator() {
        return sv109EmergencyIndicator;
    }

    @JsonProperty("sv109_emergencyIndicator")
    public void setSv109EmergencyIndicator(String sv109EmergencyIndicator) {
        this.sv109EmergencyIndicator = sv109EmergencyIndicator;
    }

    public SvcLineNo withSv109EmergencyIndicator(String sv109EmergencyIndicator) {
        this.sv109EmergencyIndicator = sv109EmergencyIndicator;
        return this;
    }

    @JsonProperty("sv111_epsdtIndicator")
    public String getSv111EpsdtIndicator() {
        return sv111EpsdtIndicator;
    }

    @JsonProperty("sv111_epsdtIndicator")
    public void setSv111EpsdtIndicator(String sv111EpsdtIndicator) {
        this.sv111EpsdtIndicator = sv111EpsdtIndicator;
    }

    public SvcLineNo withSv111EpsdtIndicator(String sv111EpsdtIndicator) {
        this.sv111EpsdtIndicator = sv111EpsdtIndicator;
        return this;
    }

    @JsonProperty("sv112_familyPlanningIndicator")
    public String getSv112FamilyPlanningIndicator() {
        return sv112FamilyPlanningIndicator;
    }

    @JsonProperty("sv112_familyPlanningIndicator")
    public void setSv112FamilyPlanningIndicator(String sv112FamilyPlanningIndicator) {
        this.sv112FamilyPlanningIndicator = sv112FamilyPlanningIndicator;
    }

    public SvcLineNo withSv112FamilyPlanningIndicator(String sv112FamilyPlanningIndicator) {
        this.sv112FamilyPlanningIndicator = sv112FamilyPlanningIndicator;
        return this;
    }

    @JsonProperty("sv115_coPayStatusCode")
    public String getSv115CoPayStatusCode() {
        return sv115CoPayStatusCode;
    }

    @JsonProperty("sv115_coPayStatusCode")
    public void setSv115CoPayStatusCode(String sv115CoPayStatusCode) {
        this.sv115CoPayStatusCode = sv115CoPayStatusCode;
    }

    public SvcLineNo withSv115CoPayStatusCode(String sv115CoPayStatusCode) {
        this.sv115CoPayStatusCode = sv115CoPayStatusCode;
        return this;
    }

    @JsonProperty("sv201_serviceLineRevenueCode")
    public String getSv201ServiceLineRevenueCode() {
        return sv201ServiceLineRevenueCode;
    }

    @JsonProperty("sv201_serviceLineRevenueCode")
    public void setSv201ServiceLineRevenueCode(String sv201ServiceLineRevenueCode) {
        this.sv201ServiceLineRevenueCode = sv201ServiceLineRevenueCode;
    }

    public SvcLineNo withSv201ServiceLineRevenueCode(String sv201ServiceLineRevenueCode) {
        this.sv201ServiceLineRevenueCode = sv201ServiceLineRevenueCode;
        return this;
    }

    @JsonProperty("sv202_serviceLineRevenueCodeProcedureIdentifier")
    public String getSv202ServiceLineRevenueCodeProcedureIdentifier() {
        return sv202ServiceLineRevenueCodeProcedureIdentifier;
    }

    @JsonProperty("sv202_serviceLineRevenueCodeProcedureIdentifier")
    public void setSv202ServiceLineRevenueCodeProcedureIdentifier(String sv202ServiceLineRevenueCodeProcedureIdentifier) {
        this.sv202ServiceLineRevenueCodeProcedureIdentifier = sv202ServiceLineRevenueCodeProcedureIdentifier;
    }

    public SvcLineNo withSv202ServiceLineRevenueCodeProcedureIdentifier(String sv202ServiceLineRevenueCodeProcedureIdentifier) {
        this.sv202ServiceLineRevenueCodeProcedureIdentifier = sv202ServiceLineRevenueCodeProcedureIdentifier;
        return this;
    }

    @JsonProperty("sv202_01_productOrServiceIdQlfr")
    public String getSv20201ProductOrServiceIdQlfr() {
        return sv20201ProductOrServiceIdQlfr;
    }

    @JsonProperty("sv202_01_productOrServiceIdQlfr")
    public void setSv20201ProductOrServiceIdQlfr(String sv20201ProductOrServiceIdQlfr) {
        this.sv20201ProductOrServiceIdQlfr = sv20201ProductOrServiceIdQlfr;
    }

    public SvcLineNo withSv20201ProductOrServiceIdQlfr(String sv20201ProductOrServiceIdQlfr) {
        this.sv20201ProductOrServiceIdQlfr = sv20201ProductOrServiceIdQlfr;
        return this;
    }

    @JsonProperty("sv202_02_procedureCode")
    public String getSv20202ProcedureCode() {
        return sv20202ProcedureCode;
    }

    @JsonProperty("sv202_02_procedureCode")
    public void setSv20202ProcedureCode(String sv20202ProcedureCode) {
        this.sv20202ProcedureCode = sv20202ProcedureCode;
    }

    public SvcLineNo withSv20202ProcedureCode(String sv20202ProcedureCode) {
        this.sv20202ProcedureCode = sv20202ProcedureCode;
        return this;
    }

    @JsonProperty("sv202_03_procedureModifier1")
    public String getSv20203ProcedureModifier1() {
        return sv20203ProcedureModifier1;
    }

    @JsonProperty("sv202_03_procedureModifier1")
    public void setSv20203ProcedureModifier1(String sv20203ProcedureModifier1) {
        this.sv20203ProcedureModifier1 = sv20203ProcedureModifier1;
    }

    public SvcLineNo withSv20203ProcedureModifier1(String sv20203ProcedureModifier1) {
        this.sv20203ProcedureModifier1 = sv20203ProcedureModifier1;
        return this;
    }

    @JsonProperty("sv202_04_procedureModifier2")
    public String getSv20204ProcedureModifier2() {
        return sv20204ProcedureModifier2;
    }

    @JsonProperty("sv202_04_procedureModifier2")
    public void setSv20204ProcedureModifier2(String sv20204ProcedureModifier2) {
        this.sv20204ProcedureModifier2 = sv20204ProcedureModifier2;
    }

    public SvcLineNo withSv20204ProcedureModifier2(String sv20204ProcedureModifier2) {
        this.sv20204ProcedureModifier2 = sv20204ProcedureModifier2;
        return this;
    }

    @JsonProperty("sv202_05_procedureModifier3")
    public String getSv20205ProcedureModifier3() {
        return sv20205ProcedureModifier3;
    }

    @JsonProperty("sv202_05_procedureModifier3")
    public void setSv20205ProcedureModifier3(String sv20205ProcedureModifier3) {
        this.sv20205ProcedureModifier3 = sv20205ProcedureModifier3;
    }

    public SvcLineNo withSv20205ProcedureModifier3(String sv20205ProcedureModifier3) {
        this.sv20205ProcedureModifier3 = sv20205ProcedureModifier3;
        return this;
    }

    @JsonProperty("sv202_06_procedureModifier4")
    public String getSv20206ProcedureModifier4() {
        return sv20206ProcedureModifier4;
    }

    @JsonProperty("sv202_06_procedureModifier4")
    public void setSv20206ProcedureModifier4(String sv20206ProcedureModifier4) {
        this.sv20206ProcedureModifier4 = sv20206ProcedureModifier4;
    }

    public SvcLineNo withSv20206ProcedureModifier4(String sv20206ProcedureModifier4) {
        this.sv20206ProcedureModifier4 = sv20206ProcedureModifier4;
        return this;
    }

    @JsonProperty("sv202_07_procedureDescription")
    public String getSv20207ProcedureDescription() {
        return sv20207ProcedureDescription;
    }

    @JsonProperty("sv202_07_procedureDescription")
    public void setSv20207ProcedureDescription(String sv20207ProcedureDescription) {
        this.sv20207ProcedureDescription = sv20207ProcedureDescription;
    }

    public SvcLineNo withSv20207ProcedureDescription(String sv20207ProcedureDescription) {
        this.sv20207ProcedureDescription = sv20207ProcedureDescription;
        return this;
    }

    @JsonProperty("sv203_lineItemChargeAmount")
    public String getSv203LineItemChargeAmount() {
        return sv203LineItemChargeAmount;
    }

    @JsonProperty("sv203_lineItemChargeAmount")
    public void setSv203LineItemChargeAmount(String sv203LineItemChargeAmount) {
        this.sv203LineItemChargeAmount = sv203LineItemChargeAmount;
    }

    public SvcLineNo withSv203LineItemChargeAmount(String sv203LineItemChargeAmount) {
        this.sv203LineItemChargeAmount = sv203LineItemChargeAmount;
        return this;
    }

    @JsonProperty("sv204_unitOrBasisForMeasurementCode")
    public String getSv204UnitOrBasisForMeasurementCode() {
        return sv204UnitOrBasisForMeasurementCode;
    }

    @JsonProperty("sv204_unitOrBasisForMeasurementCode")
    public void setSv204UnitOrBasisForMeasurementCode(String sv204UnitOrBasisForMeasurementCode) {
        this.sv204UnitOrBasisForMeasurementCode = sv204UnitOrBasisForMeasurementCode;
    }

    public SvcLineNo withSv204UnitOrBasisForMeasurementCode(String sv204UnitOrBasisForMeasurementCode) {
        this.sv204UnitOrBasisForMeasurementCode = sv204UnitOrBasisForMeasurementCode;
        return this;
    }

    @JsonProperty("sv205_serviceUnitCount")
    public String getSv205ServiceUnitCount() {
        return sv205ServiceUnitCount;
    }

    @JsonProperty("sv205_serviceUnitCount")
    public void setSv205ServiceUnitCount(String sv205ServiceUnitCount) {
        this.sv205ServiceUnitCount = sv205ServiceUnitCount;
    }

    public SvcLineNo withSv205ServiceUnitCount(String sv205ServiceUnitCount) {
        this.sv205ServiceUnitCount = sv205ServiceUnitCount;
        return this;
    }

    @JsonProperty("sv207_lineItemDeniedChargeAmount")
    public String getSv207LineItemDeniedChargeAmount() {
        return sv207LineItemDeniedChargeAmount;
    }

    @JsonProperty("sv207_lineItemDeniedChargeAmount")
    public void setSv207LineItemDeniedChargeAmount(String sv207LineItemDeniedChargeAmount) {
        this.sv207LineItemDeniedChargeAmount = sv207LineItemDeniedChargeAmount;
    }

    public SvcLineNo withSv207LineItemDeniedChargeAmount(String sv207LineItemDeniedChargeAmount) {
        this.sv207LineItemDeniedChargeAmount = sv207LineItemDeniedChargeAmount;
        return this;
    }

    @JsonProperty("sv301_dentalServiceProcedureIdentifier")
    public String getSv301DentalServiceProcedureIdentifier() {
        return sv301DentalServiceProcedureIdentifier;
    }

    @JsonProperty("sv301_dentalServiceProcedureIdentifier")
    public void setSv301DentalServiceProcedureIdentifier(String sv301DentalServiceProcedureIdentifier) {
        this.sv301DentalServiceProcedureIdentifier = sv301DentalServiceProcedureIdentifier;
    }

    public SvcLineNo withSv301DentalServiceProcedureIdentifier(String sv301DentalServiceProcedureIdentifier) {
        this.sv301DentalServiceProcedureIdentifier = sv301DentalServiceProcedureIdentifier;
        return this;
    }

    @JsonProperty("sv301_01_dentalServiceProductServiceIdQlfr")
    public String getSv30101DentalServiceProductServiceIdQlfr() {
        return sv30101DentalServiceProductServiceIdQlfr;
    }

    @JsonProperty("sv301_01_dentalServiceProductServiceIdQlfr")
    public void setSv30101DentalServiceProductServiceIdQlfr(String sv30101DentalServiceProductServiceIdQlfr) {
        this.sv30101DentalServiceProductServiceIdQlfr = sv30101DentalServiceProductServiceIdQlfr;
    }

    public SvcLineNo withSv30101DentalServiceProductServiceIdQlfr(String sv30101DentalServiceProductServiceIdQlfr) {
        this.sv30101DentalServiceProductServiceIdQlfr = sv30101DentalServiceProductServiceIdQlfr;
        return this;
    }

    @JsonProperty("sv301_02_dentalServiceProcedureCode")
    public String getSv30102DentalServiceProcedureCode() {
        return sv30102DentalServiceProcedureCode;
    }

    @JsonProperty("sv301_02_dentalServiceProcedureCode")
    public void setSv30102DentalServiceProcedureCode(String sv30102DentalServiceProcedureCode) {
        this.sv30102DentalServiceProcedureCode = sv30102DentalServiceProcedureCode;
    }

    public SvcLineNo withSv30102DentalServiceProcedureCode(String sv30102DentalServiceProcedureCode) {
        this.sv30102DentalServiceProcedureCode = sv30102DentalServiceProcedureCode;
        return this;
    }

    @JsonProperty("sv301_03_dentalServiceProcedureModifier1")
    public String getSv30103DentalServiceProcedureModifier1() {
        return sv30103DentalServiceProcedureModifier1;
    }

    @JsonProperty("sv301_03_dentalServiceProcedureModifier1")
    public void setSv30103DentalServiceProcedureModifier1(String sv30103DentalServiceProcedureModifier1) {
        this.sv30103DentalServiceProcedureModifier1 = sv30103DentalServiceProcedureModifier1;
    }

    public SvcLineNo withSv30103DentalServiceProcedureModifier1(String sv30103DentalServiceProcedureModifier1) {
        this.sv30103DentalServiceProcedureModifier1 = sv30103DentalServiceProcedureModifier1;
        return this;
    }

    @JsonProperty("sv301_04_dentalServiceProcedureModifier2")
    public String getSv30104DentalServiceProcedureModifier2() {
        return sv30104DentalServiceProcedureModifier2;
    }

    @JsonProperty("sv301_04_dentalServiceProcedureModifier2")
    public void setSv30104DentalServiceProcedureModifier2(String sv30104DentalServiceProcedureModifier2) {
        this.sv30104DentalServiceProcedureModifier2 = sv30104DentalServiceProcedureModifier2;
    }

    public SvcLineNo withSv30104DentalServiceProcedureModifier2(String sv30104DentalServiceProcedureModifier2) {
        this.sv30104DentalServiceProcedureModifier2 = sv30104DentalServiceProcedureModifier2;
        return this;
    }

    @JsonProperty("sv301_05_dentalServiceProcedureModifier3")
    public String getSv30105DentalServiceProcedureModifier3() {
        return sv30105DentalServiceProcedureModifier3;
    }

    @JsonProperty("sv301_05_dentalServiceProcedureModifier3")
    public void setSv30105DentalServiceProcedureModifier3(String sv30105DentalServiceProcedureModifier3) {
        this.sv30105DentalServiceProcedureModifier3 = sv30105DentalServiceProcedureModifier3;
    }

    public SvcLineNo withSv30105DentalServiceProcedureModifier3(String sv30105DentalServiceProcedureModifier3) {
        this.sv30105DentalServiceProcedureModifier3 = sv30105DentalServiceProcedureModifier3;
        return this;
    }

    @JsonProperty("sv301_06_dentalServiceProcedureModifier4")
    public String getSv30106DentalServiceProcedureModifier4() {
        return sv30106DentalServiceProcedureModifier4;
    }

    @JsonProperty("sv301_06_dentalServiceProcedureModifier4")
    public void setSv30106DentalServiceProcedureModifier4(String sv30106DentalServiceProcedureModifier4) {
        this.sv30106DentalServiceProcedureModifier4 = sv30106DentalServiceProcedureModifier4;
    }

    public SvcLineNo withSv30106DentalServiceProcedureModifier4(String sv30106DentalServiceProcedureModifier4) {
        this.sv30106DentalServiceProcedureModifier4 = sv30106DentalServiceProcedureModifier4;
        return this;
    }

    @JsonProperty("sv301_07_dentalServiceDescription")
    public String getSv30107DentalServiceDescription() {
        return sv30107DentalServiceDescription;
    }

    @JsonProperty("sv301_07_dentalServiceDescription")
    public void setSv30107DentalServiceDescription(String sv30107DentalServiceDescription) {
        this.sv30107DentalServiceDescription = sv30107DentalServiceDescription;
    }

    public SvcLineNo withSv30107DentalServiceDescription(String sv30107DentalServiceDescription) {
        this.sv30107DentalServiceDescription = sv30107DentalServiceDescription;
        return this;
    }

    @JsonProperty("sv302_lineItemChargeAmount")
    public String getSv302LineItemChargeAmount() {
        return sv302LineItemChargeAmount;
    }

    @JsonProperty("sv302_lineItemChargeAmount")
    public void setSv302LineItemChargeAmount(String sv302LineItemChargeAmount) {
        this.sv302LineItemChargeAmount = sv302LineItemChargeAmount;
    }

    public SvcLineNo withSv302LineItemChargeAmount(String sv302LineItemChargeAmount) {
        this.sv302LineItemChargeAmount = sv302LineItemChargeAmount;
        return this;
    }

    @JsonProperty("sv303_placeOfServiceCode")
    public String getSv303PlaceOfServiceCode() {
        return sv303PlaceOfServiceCode;
    }

    @JsonProperty("sv303_placeOfServiceCode")
    public void setSv303PlaceOfServiceCode(String sv303PlaceOfServiceCode) {
        this.sv303PlaceOfServiceCode = sv303PlaceOfServiceCode;
    }

    public SvcLineNo withSv303PlaceOfServiceCode(String sv303PlaceOfServiceCode) {
        this.sv303PlaceOfServiceCode = sv303PlaceOfServiceCode;
        return this;
    }

    @JsonProperty("sv304_oralCavityDesignation")
    public String getSv304OralCavityDesignation() {
        return sv304OralCavityDesignation;
    }

    @JsonProperty("sv304_oralCavityDesignation")
    public void setSv304OralCavityDesignation(String sv304OralCavityDesignation) {
        this.sv304OralCavityDesignation = sv304OralCavityDesignation;
    }

    public SvcLineNo withSv304OralCavityDesignation(String sv304OralCavityDesignation) {
        this.sv304OralCavityDesignation = sv304OralCavityDesignation;
        return this;
    }

    @JsonProperty("sv304_01_oralCavityDesignation1")
    public String getSv30401OralCavityDesignation1() {
        return sv30401OralCavityDesignation1;
    }

    @JsonProperty("sv304_01_oralCavityDesignation1")
    public void setSv30401OralCavityDesignation1(String sv30401OralCavityDesignation1) {
        this.sv30401OralCavityDesignation1 = sv30401OralCavityDesignation1;
    }

    public SvcLineNo withSv30401OralCavityDesignation1(String sv30401OralCavityDesignation1) {
        this.sv30401OralCavityDesignation1 = sv30401OralCavityDesignation1;
        return this;
    }

    @JsonProperty("sv304_02_oralCavityDesignation2")
    public String getSv30402OralCavityDesignation2() {
        return sv30402OralCavityDesignation2;
    }

    @JsonProperty("sv304_02_oralCavityDesignation2")
    public void setSv30402OralCavityDesignation2(String sv30402OralCavityDesignation2) {
        this.sv30402OralCavityDesignation2 = sv30402OralCavityDesignation2;
    }

    public SvcLineNo withSv30402OralCavityDesignation2(String sv30402OralCavityDesignation2) {
        this.sv30402OralCavityDesignation2 = sv30402OralCavityDesignation2;
        return this;
    }

    @JsonProperty("sv304_03_oralCavityDesignation3")
    public String getSv30403OralCavityDesignation3() {
        return sv30403OralCavityDesignation3;
    }

    @JsonProperty("sv304_03_oralCavityDesignation3")
    public void setSv30403OralCavityDesignation3(String sv30403OralCavityDesignation3) {
        this.sv30403OralCavityDesignation3 = sv30403OralCavityDesignation3;
    }

    public SvcLineNo withSv30403OralCavityDesignation3(String sv30403OralCavityDesignation3) {
        this.sv30403OralCavityDesignation3 = sv30403OralCavityDesignation3;
        return this;
    }

    @JsonProperty("sv304_04_oralCavityDesignation4")
    public String getSv30404OralCavityDesignation4() {
        return sv30404OralCavityDesignation4;
    }

    @JsonProperty("sv304_04_oralCavityDesignation4")
    public void setSv30404OralCavityDesignation4(String sv30404OralCavityDesignation4) {
        this.sv30404OralCavityDesignation4 = sv30404OralCavityDesignation4;
    }

    public SvcLineNo withSv30404OralCavityDesignation4(String sv30404OralCavityDesignation4) {
        this.sv30404OralCavityDesignation4 = sv30404OralCavityDesignation4;
        return this;
    }

    @JsonProperty("sv304_05_oralCavityDesignation5")
    public String getSv30405OralCavityDesignation5() {
        return sv30405OralCavityDesignation5;
    }

    @JsonProperty("sv304_05_oralCavityDesignation5")
    public void setSv30405OralCavityDesignation5(String sv30405OralCavityDesignation5) {
        this.sv30405OralCavityDesignation5 = sv30405OralCavityDesignation5;
    }

    public SvcLineNo withSv30405OralCavityDesignation5(String sv30405OralCavityDesignation5) {
        this.sv30405OralCavityDesignation5 = sv30405OralCavityDesignation5;
        return this;
    }

    @JsonProperty("sv305_prosthesisCrownOrInlayCode")
    public String getSv305ProsthesisCrownOrInlayCode() {
        return sv305ProsthesisCrownOrInlayCode;
    }

    @JsonProperty("sv305_prosthesisCrownOrInlayCode")
    public void setSv305ProsthesisCrownOrInlayCode(String sv305ProsthesisCrownOrInlayCode) {
        this.sv305ProsthesisCrownOrInlayCode = sv305ProsthesisCrownOrInlayCode;
    }

    public SvcLineNo withSv305ProsthesisCrownOrInlayCode(String sv305ProsthesisCrownOrInlayCode) {
        this.sv305ProsthesisCrownOrInlayCode = sv305ProsthesisCrownOrInlayCode;
        return this;
    }

    @JsonProperty("sv306_procedureCount")
    public String getSv306ProcedureCount() {
        return sv306ProcedureCount;
    }

    @JsonProperty("sv306_procedureCount")
    public void setSv306ProcedureCount(String sv306ProcedureCount) {
        this.sv306ProcedureCount = sv306ProcedureCount;
    }

    public SvcLineNo withSv306ProcedureCount(String sv306ProcedureCount) {
        this.sv306ProcedureCount = sv306ProcedureCount;
        return this;
    }

    @JsonProperty("sv311_diagnosisCodePointer")
    public String getSv311DiagnosisCodePointer() {
        return sv311DiagnosisCodePointer;
    }

    @JsonProperty("sv311_diagnosisCodePointer")
    public void setSv311DiagnosisCodePointer(String sv311DiagnosisCodePointer) {
        this.sv311DiagnosisCodePointer = sv311DiagnosisCodePointer;
    }

    public SvcLineNo withSv311DiagnosisCodePointer(String sv311DiagnosisCodePointer) {
        this.sv311DiagnosisCodePointer = sv311DiagnosisCodePointer;
        return this;
    }

    @JsonProperty("sv311_01_diagnosisCodePointer1")
    public String getSv31101DiagnosisCodePointer1() {
        return sv31101DiagnosisCodePointer1;
    }

    @JsonProperty("sv311_01_diagnosisCodePointer1")
    public void setSv31101DiagnosisCodePointer1(String sv31101DiagnosisCodePointer1) {
        this.sv31101DiagnosisCodePointer1 = sv31101DiagnosisCodePointer1;
    }

    public SvcLineNo withSv31101DiagnosisCodePointer1(String sv31101DiagnosisCodePointer1) {
        this.sv31101DiagnosisCodePointer1 = sv31101DiagnosisCodePointer1;
        return this;
    }

    @JsonProperty("sv311_02_diagnosisCodePointer2")
    public String getSv31102DiagnosisCodePointer2() {
        return sv31102DiagnosisCodePointer2;
    }

    @JsonProperty("sv311_02_diagnosisCodePointer2")
    public void setSv31102DiagnosisCodePointer2(String sv31102DiagnosisCodePointer2) {
        this.sv31102DiagnosisCodePointer2 = sv31102DiagnosisCodePointer2;
    }

    public SvcLineNo withSv31102DiagnosisCodePointer2(String sv31102DiagnosisCodePointer2) {
        this.sv31102DiagnosisCodePointer2 = sv31102DiagnosisCodePointer2;
        return this;
    }

    @JsonProperty("sv311_03_diagnosisCodePointer3")
    public String getSv31103DiagnosisCodePointer3() {
        return sv31103DiagnosisCodePointer3;
    }

    @JsonProperty("sv311_03_diagnosisCodePointer3")
    public void setSv31103DiagnosisCodePointer3(String sv31103DiagnosisCodePointer3) {
        this.sv31103DiagnosisCodePointer3 = sv31103DiagnosisCodePointer3;
    }

    public SvcLineNo withSv31103DiagnosisCodePointer3(String sv31103DiagnosisCodePointer3) {
        this.sv31103DiagnosisCodePointer3 = sv31103DiagnosisCodePointer3;
        return this;
    }

    @JsonProperty("sv311_04_diagnosisCodePointer4")
    public String getSv31104DiagnosisCodePointer4() {
        return sv31104DiagnosisCodePointer4;
    }

    @JsonProperty("sv311_04_diagnosisCodePointer4")
    public void setSv31104DiagnosisCodePointer4(String sv31104DiagnosisCodePointer4) {
        this.sv31104DiagnosisCodePointer4 = sv31104DiagnosisCodePointer4;
    }

    public SvcLineNo withSv31104DiagnosisCodePointer4(String sv31104DiagnosisCodePointer4) {
        this.sv31104DiagnosisCodePointer4 = sv31104DiagnosisCodePointer4;
        return this;
    }

    @JsonProperty("sv501_compositeMedicalProcedureIdentifier")
    public String getSv501CompositeMedicalProcedureIdentifier() {
        return sv501CompositeMedicalProcedureIdentifier;
    }

    @JsonProperty("sv501_compositeMedicalProcedureIdentifier")
    public void setSv501CompositeMedicalProcedureIdentifier(String sv501CompositeMedicalProcedureIdentifier) {
        this.sv501CompositeMedicalProcedureIdentifier = sv501CompositeMedicalProcedureIdentifier;
    }

    public SvcLineNo withSv501CompositeMedicalProcedureIdentifier(String sv501CompositeMedicalProcedureIdentifier) {
        this.sv501CompositeMedicalProcedureIdentifier = sv501CompositeMedicalProcedureIdentifier;
        return this;
    }

    @JsonProperty("sv501_01_procedureIdentifier")
    public String getSv50101ProcedureIdentifier() {
        return sv50101ProcedureIdentifier;
    }

    @JsonProperty("sv501_01_procedureIdentifier")
    public void setSv50101ProcedureIdentifier(String sv50101ProcedureIdentifier) {
        this.sv50101ProcedureIdentifier = sv50101ProcedureIdentifier;
    }

    public SvcLineNo withSv50101ProcedureIdentifier(String sv50101ProcedureIdentifier) {
        this.sv50101ProcedureIdentifier = sv50101ProcedureIdentifier;
        return this;
    }

    @JsonProperty("sv501_02_procedureCode")
    public String getSv50102ProcedureCode() {
        return sv50102ProcedureCode;
    }

    @JsonProperty("sv501_02_procedureCode")
    public void setSv50102ProcedureCode(String sv50102ProcedureCode) {
        this.sv50102ProcedureCode = sv50102ProcedureCode;
    }

    public SvcLineNo withSv50102ProcedureCode(String sv50102ProcedureCode) {
        this.sv50102ProcedureCode = sv50102ProcedureCode;
        return this;
    }

    @JsonProperty("sv502_basisForMeasurementCode")
    public String getSv502BasisForMeasurementCode() {
        return sv502BasisForMeasurementCode;
    }

    @JsonProperty("sv502_basisForMeasurementCode")
    public void setSv502BasisForMeasurementCode(String sv502BasisForMeasurementCode) {
        this.sv502BasisForMeasurementCode = sv502BasisForMeasurementCode;
    }

    public SvcLineNo withSv502BasisForMeasurementCode(String sv502BasisForMeasurementCode) {
        this.sv502BasisForMeasurementCode = sv502BasisForMeasurementCode;
        return this;
    }

    @JsonProperty("sv503_daysLengthOfMedicalNecessity")
    public String getSv503DaysLengthOfMedicalNecessity() {
        return sv503DaysLengthOfMedicalNecessity;
    }

    @JsonProperty("sv503_daysLengthOfMedicalNecessity")
    public void setSv503DaysLengthOfMedicalNecessity(String sv503DaysLengthOfMedicalNecessity) {
        this.sv503DaysLengthOfMedicalNecessity = sv503DaysLengthOfMedicalNecessity;
    }

    public SvcLineNo withSv503DaysLengthOfMedicalNecessity(String sv503DaysLengthOfMedicalNecessity) {
        this.sv503DaysLengthOfMedicalNecessity = sv503DaysLengthOfMedicalNecessity;
        return this;
    }

    @JsonProperty("sv504_dmeRentalPrice")
    public String getSv504DmeRentalPrice() {
        return sv504DmeRentalPrice;
    }

    @JsonProperty("sv504_dmeRentalPrice")
    public void setSv504DmeRentalPrice(String sv504DmeRentalPrice) {
        this.sv504DmeRentalPrice = sv504DmeRentalPrice;
    }

    public SvcLineNo withSv504DmeRentalPrice(String sv504DmeRentalPrice) {
        this.sv504DmeRentalPrice = sv504DmeRentalPrice;
        return this;
    }

    @JsonProperty("sv505_dmePurchasePrice")
    public String getSv505DmePurchasePrice() {
        return sv505DmePurchasePrice;
    }

    @JsonProperty("sv505_dmePurchasePrice")
    public void setSv505DmePurchasePrice(String sv505DmePurchasePrice) {
        this.sv505DmePurchasePrice = sv505DmePurchasePrice;
    }

    public SvcLineNo withSv505DmePurchasePrice(String sv505DmePurchasePrice) {
        this.sv505DmePurchasePrice = sv505DmePurchasePrice;
        return this;
    }

    @JsonProperty("sv506_rentalUnitPriceIndicator")
    public String getSv506RentalUnitPriceIndicator() {
        return sv506RentalUnitPriceIndicator;
    }

    @JsonProperty("sv506_rentalUnitPriceIndicator")
    public void setSv506RentalUnitPriceIndicator(String sv506RentalUnitPriceIndicator) {
        this.sv506RentalUnitPriceIndicator = sv506RentalUnitPriceIndicator;
    }

    public SvcLineNo withSv506RentalUnitPriceIndicator(String sv506RentalUnitPriceIndicator) {
        this.sv506RentalUnitPriceIndicator = sv506RentalUnitPriceIndicator;
        return this;
    }

    @JsonProperty("pwk_lineSupplementInformation")
    public List<PwkLineSupplementInformation> getPwkLineSupplementInformation() {
        return pwkLineSupplementInformation;
    }

    @JsonProperty("pwk_lineSupplementInformation")
    public void setPwkLineSupplementInformation(List<PwkLineSupplementInformation> pwkLineSupplementInformation) {
        this.pwkLineSupplementInformation = pwkLineSupplementInformation;
    }

    public SvcLineNo withPwkLineSupplementInformation(List<PwkLineSupplementInformation> pwkLineSupplementInformation) {
        this.pwkLineSupplementInformation = pwkLineSupplementInformation;
        return this;
    }

    @JsonProperty("pwk01_attachReportTypeCode")
    public String getPwk01AttachReportTypeCode() {
        return pwk01AttachReportTypeCode;
    }

    @JsonProperty("pwk01_attachReportTypeCode")
    public void setPwk01AttachReportTypeCode(String pwk01AttachReportTypeCode) {
        this.pwk01AttachReportTypeCode = pwk01AttachReportTypeCode;
    }

    public SvcLineNo withPwk01AttachReportTypeCode(String pwk01AttachReportTypeCode) {
        this.pwk01AttachReportTypeCode = pwk01AttachReportTypeCode;
        return this;
    }

    @JsonProperty("pwk02_attachReportTransmissionCode")
    public String getPwk02AttachReportTransmissionCode() {
        return pwk02AttachReportTransmissionCode;
    }

    @JsonProperty("pwk02_attachReportTransmissionCode")
    public void setPwk02AttachReportTransmissionCode(String pwk02AttachReportTransmissionCode) {
        this.pwk02AttachReportTransmissionCode = pwk02AttachReportTransmissionCode;
    }

    public SvcLineNo withPwk02AttachReportTransmissionCode(String pwk02AttachReportTransmissionCode) {
        this.pwk02AttachReportTransmissionCode = pwk02AttachReportTransmissionCode;
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

    public SvcLineNo withCr101BasisForMeasurementCodePound(String cr101BasisForMeasurementCodePound) {
        this.cr101BasisForMeasurementCodePound = cr101BasisForMeasurementCodePound;
        return this;
    }

    @JsonProperty("cr102_patientWeightlbs")
    public String getCr102PatientWeightlbs() {
        return cr102PatientWeightlbs;
    }

    @JsonProperty("cr102_patientWeightlbs")
    public void setCr102PatientWeightlbs(String cr102PatientWeightlbs) {
        this.cr102PatientWeightlbs = cr102PatientWeightlbs;
    }

    public SvcLineNo withCr102PatientWeightlbs(String cr102PatientWeightlbs) {
        this.cr102PatientWeightlbs = cr102PatientWeightlbs;
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

    public SvcLineNo withCr104AmbulanceTransportReasonCode(String cr104AmbulanceTransportReasonCode) {
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

    public SvcLineNo withCr105BasisForMeasurementCodeMiles(String cr105BasisForMeasurementCodeMiles) {
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

    public SvcLineNo withCr106TransportDistanceMiles(String cr106TransportDistanceMiles) {
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

    public SvcLineNo withCr109RoundTripPurposeDescription(String cr109RoundTripPurposeDescription) {
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

    public SvcLineNo withCr110StretcherPurposeDescription(String cr110StretcherPurposeDescription) {
        this.cr110StretcherPurposeDescription = cr110StretcherPurposeDescription;
        return this;
    }

    @JsonProperty("cr301_dmeCertificationTypeCode")
    public String getCr301DmeCertificationTypeCode() {
        return cr301DmeCertificationTypeCode;
    }

    @JsonProperty("cr301_dmeCertificationTypeCode")
    public void setCr301DmeCertificationTypeCode(String cr301DmeCertificationTypeCode) {
        this.cr301DmeCertificationTypeCode = cr301DmeCertificationTypeCode;
    }

    public SvcLineNo withCr301DmeCertificationTypeCode(String cr301DmeCertificationTypeCode) {
        this.cr301DmeCertificationTypeCode = cr301DmeCertificationTypeCode;
        return this;
    }

    @JsonProperty("cr302_dmeBasisForMeasurementCode")
    public String getCr302DmeBasisForMeasurementCode() {
        return cr302DmeBasisForMeasurementCode;
    }

    @JsonProperty("cr302_dmeBasisForMeasurementCode")
    public void setCr302DmeBasisForMeasurementCode(String cr302DmeBasisForMeasurementCode) {
        this.cr302DmeBasisForMeasurementCode = cr302DmeBasisForMeasurementCode;
    }

    public SvcLineNo withCr302DmeBasisForMeasurementCode(String cr302DmeBasisForMeasurementCode) {
        this.cr302DmeBasisForMeasurementCode = cr302DmeBasisForMeasurementCode;
        return this;
    }

    @JsonProperty("cr303_dmeDurationMonths")
    public String getCr303DmeDurationMonths() {
        return cr303DmeDurationMonths;
    }

    @JsonProperty("cr303_dmeDurationMonths")
    public void setCr303DmeDurationMonths(String cr303DmeDurationMonths) {
        this.cr303DmeDurationMonths = cr303DmeDurationMonths;
    }

    public SvcLineNo withCr303DmeDurationMonths(String cr303DmeDurationMonths) {
        this.cr303DmeDurationMonths = cr303DmeDurationMonths;
        return this;
    }

    @JsonProperty("crc_ambulanceCertification")
    public List<CrcAmbulanceCertification_> getCrcAmbulanceCertification() {
        return crcAmbulanceCertification;
    }

    @JsonProperty("crc_ambulanceCertification")
    public void setCrcAmbulanceCertification(List<CrcAmbulanceCertification_> crcAmbulanceCertification) {
        this.crcAmbulanceCertification = crcAmbulanceCertification;
    }

    public SvcLineNo withCrcAmbulanceCertification(List<CrcAmbulanceCertification_> crcAmbulanceCertification) {
        this.crcAmbulanceCertification = crcAmbulanceCertification;
        return this;
    }

    @JsonProperty("crc01_hospiceEmployedProviderCode")
    public String getCrc01HospiceEmployedProviderCode() {
        return crc01HospiceEmployedProviderCode;
    }

    @JsonProperty("crc01_hospiceEmployedProviderCode")
    public void setCrc01HospiceEmployedProviderCode(String crc01HospiceEmployedProviderCode) {
        this.crc01HospiceEmployedProviderCode = crc01HospiceEmployedProviderCode;
    }

    public SvcLineNo withCrc01HospiceEmployedProviderCode(String crc01HospiceEmployedProviderCode) {
        this.crc01HospiceEmployedProviderCode = crc01HospiceEmployedProviderCode;
        return this;
    }

    @JsonProperty("crc02_hospiceEmployedProviderIndicator")
    public String getCrc02HospiceEmployedProviderIndicator() {
        return crc02HospiceEmployedProviderIndicator;
    }

    @JsonProperty("crc02_hospiceEmployedProviderIndicator")
    public void setCrc02HospiceEmployedProviderIndicator(String crc02HospiceEmployedProviderIndicator) {
        this.crc02HospiceEmployedProviderIndicator = crc02HospiceEmployedProviderIndicator;
    }

    public SvcLineNo withCrc02HospiceEmployedProviderIndicator(String crc02HospiceEmployedProviderIndicator) {
        this.crc02HospiceEmployedProviderIndicator = crc02HospiceEmployedProviderIndicator;
        return this;
    }

    @JsonProperty("crc03_hospiceEmployedConditionIndicator")
    public String getCrc03HospiceEmployedConditionIndicator() {
        return crc03HospiceEmployedConditionIndicator;
    }

    @JsonProperty("crc03_hospiceEmployedConditionIndicator")
    public void setCrc03HospiceEmployedConditionIndicator(String crc03HospiceEmployedConditionIndicator) {
        this.crc03HospiceEmployedConditionIndicator = crc03HospiceEmployedConditionIndicator;
    }

    public SvcLineNo withCrc03HospiceEmployedConditionIndicator(String crc03HospiceEmployedConditionIndicator) {
        this.crc03HospiceEmployedConditionIndicator = crc03HospiceEmployedConditionIndicator;
        return this;
    }

    @JsonProperty("crc01_dmeConditionIndicatorCode")
    public String getCrc01DmeConditionIndicatorCode() {
        return crc01DmeConditionIndicatorCode;
    }

    @JsonProperty("crc01_dmeConditionIndicatorCode")
    public void setCrc01DmeConditionIndicatorCode(String crc01DmeConditionIndicatorCode) {
        this.crc01DmeConditionIndicatorCode = crc01DmeConditionIndicatorCode;
    }

    public SvcLineNo withCrc01DmeConditionIndicatorCode(String crc01DmeConditionIndicatorCode) {
        this.crc01DmeConditionIndicatorCode = crc01DmeConditionIndicatorCode;
        return this;
    }

    @JsonProperty("crc02_dmeConditionIndicator")
    public String getCrc02DmeConditionIndicator() {
        return crc02DmeConditionIndicator;
    }

    @JsonProperty("crc02_dmeConditionIndicator")
    public void setCrc02DmeConditionIndicator(String crc02DmeConditionIndicator) {
        this.crc02DmeConditionIndicator = crc02DmeConditionIndicator;
    }

    public SvcLineNo withCrc02DmeConditionIndicator(String crc02DmeConditionIndicator) {
        this.crc02DmeConditionIndicator = crc02DmeConditionIndicator;
        return this;
    }

    @JsonProperty("crc03_dmeConditionCode1")
    public String getCrc03DmeConditionCode1() {
        return crc03DmeConditionCode1;
    }

    @JsonProperty("crc03_dmeConditionCode1")
    public void setCrc03DmeConditionCode1(String crc03DmeConditionCode1) {
        this.crc03DmeConditionCode1 = crc03DmeConditionCode1;
    }

    public SvcLineNo withCrc03DmeConditionCode1(String crc03DmeConditionCode1) {
        this.crc03DmeConditionCode1 = crc03DmeConditionCode1;
        return this;
    }

    @JsonProperty("crc04_dmeConditionCode2")
    public String getCrc04DmeConditionCode2() {
        return crc04DmeConditionCode2;
    }

    @JsonProperty("crc04_dmeConditionCode2")
    public void setCrc04DmeConditionCode2(String crc04DmeConditionCode2) {
        this.crc04DmeConditionCode2 = crc04DmeConditionCode2;
    }

    public SvcLineNo withCrc04DmeConditionCode2(String crc04DmeConditionCode2) {
        this.crc04DmeConditionCode2 = crc04DmeConditionCode2;
        return this;
    }

    @JsonProperty("too_toothInformation")
    public List<TooToothInformation> getTooToothInformation() {
        return tooToothInformation;
    }

    @JsonProperty("too_toothInformation")
    public void setTooToothInformation(List<TooToothInformation> tooToothInformation) {
        this.tooToothInformation = tooToothInformation;
    }

    public SvcLineNo withTooToothInformation(List<TooToothInformation> tooToothInformation) {
        this.tooToothInformation = tooToothInformation;
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

    public SvcLineNo withDtp01ServiceDateQlfr(String dtp01ServiceDateQlfr) {
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

    public SvcLineNo withDtp02ServiceDateFormatQlfr(String dtp02ServiceDateFormatQlfr) {
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

    public SvcLineNo withDtp03ServiceDate(String dtp03ServiceDate) {
        this.dtp03ServiceDate = dtp03ServiceDate;
        return this;
    }

    @JsonProperty("dtp01_prescriptionDateQlfr")
    public String getDtp01PrescriptionDateQlfr() {
        return dtp01PrescriptionDateQlfr;
    }

    @JsonProperty("dtp01_prescriptionDateQlfr")
    public void setDtp01PrescriptionDateQlfr(String dtp01PrescriptionDateQlfr) {
        this.dtp01PrescriptionDateQlfr = dtp01PrescriptionDateQlfr;
    }

    public SvcLineNo withDtp01PrescriptionDateQlfr(String dtp01PrescriptionDateQlfr) {
        this.dtp01PrescriptionDateQlfr = dtp01PrescriptionDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_prescriptionFormatQlfr")
    public String getDtp02PrescriptionFormatQlfr() {
        return dtp02PrescriptionFormatQlfr;
    }

    @JsonProperty("dtp02_prescriptionFormatQlfr")
    public void setDtp02PrescriptionFormatQlfr(String dtp02PrescriptionFormatQlfr) {
        this.dtp02PrescriptionFormatQlfr = dtp02PrescriptionFormatQlfr;
    }

    public SvcLineNo withDtp02PrescriptionFormatQlfr(String dtp02PrescriptionFormatQlfr) {
        this.dtp02PrescriptionFormatQlfr = dtp02PrescriptionFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_prescriptionDate")
    public String getDtp03PrescriptionDate() {
        return dtp03PrescriptionDate;
    }

    @JsonProperty("dtp03_prescriptionDate")
    public void setDtp03PrescriptionDate(String dtp03PrescriptionDate) {
        this.dtp03PrescriptionDate = dtp03PrescriptionDate;
    }

    public SvcLineNo withDtp03PrescriptionDate(String dtp03PrescriptionDate) {
        this.dtp03PrescriptionDate = dtp03PrescriptionDate;
        return this;
    }

    @JsonProperty("dtp01_certificationRevisionDateQlfr")
    public String getDtp01CertificationRevisionDateQlfr() {
        return dtp01CertificationRevisionDateQlfr;
    }

    @JsonProperty("dtp01_certificationRevisionDateQlfr")
    public void setDtp01CertificationRevisionDateQlfr(String dtp01CertificationRevisionDateQlfr) {
        this.dtp01CertificationRevisionDateQlfr = dtp01CertificationRevisionDateQlfr;
    }

    public SvcLineNo withDtp01CertificationRevisionDateQlfr(String dtp01CertificationRevisionDateQlfr) {
        this.dtp01CertificationRevisionDateQlfr = dtp01CertificationRevisionDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_certificationRevisionDateFormatQlfr")
    public String getDtp02CertificationRevisionDateFormatQlfr() {
        return dtp02CertificationRevisionDateFormatQlfr;
    }

    @JsonProperty("dtp02_certificationRevisionDateFormatQlfr")
    public void setDtp02CertificationRevisionDateFormatQlfr(String dtp02CertificationRevisionDateFormatQlfr) {
        this.dtp02CertificationRevisionDateFormatQlfr = dtp02CertificationRevisionDateFormatQlfr;
    }

    public SvcLineNo withDtp02CertificationRevisionDateFormatQlfr(String dtp02CertificationRevisionDateFormatQlfr) {
        this.dtp02CertificationRevisionDateFormatQlfr = dtp02CertificationRevisionDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_certificationRevisionDate")
    public String getDtp03CertificationRevisionDate() {
        return dtp03CertificationRevisionDate;
    }

    @JsonProperty("dtp03_certificationRevisionDate")
    public void setDtp03CertificationRevisionDate(String dtp03CertificationRevisionDate) {
        this.dtp03CertificationRevisionDate = dtp03CertificationRevisionDate;
    }

    public SvcLineNo withDtp03CertificationRevisionDate(String dtp03CertificationRevisionDate) {
        this.dtp03CertificationRevisionDate = dtp03CertificationRevisionDate;
        return this;
    }

    @JsonProperty("dtp01_beginTherapyDateQlfr")
    public String getDtp01BeginTherapyDateQlfr() {
        return dtp01BeginTherapyDateQlfr;
    }

    @JsonProperty("dtp01_beginTherapyDateQlfr")
    public void setDtp01BeginTherapyDateQlfr(String dtp01BeginTherapyDateQlfr) {
        this.dtp01BeginTherapyDateQlfr = dtp01BeginTherapyDateQlfr;
    }

    public SvcLineNo withDtp01BeginTherapyDateQlfr(String dtp01BeginTherapyDateQlfr) {
        this.dtp01BeginTherapyDateQlfr = dtp01BeginTherapyDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_beginTherapyDateFormatQlfr")
    public String getDtp02BeginTherapyDateFormatQlfr() {
        return dtp02BeginTherapyDateFormatQlfr;
    }

    @JsonProperty("dtp02_beginTherapyDateFormatQlfr")
    public void setDtp02BeginTherapyDateFormatQlfr(String dtp02BeginTherapyDateFormatQlfr) {
        this.dtp02BeginTherapyDateFormatQlfr = dtp02BeginTherapyDateFormatQlfr;
    }

    public SvcLineNo withDtp02BeginTherapyDateFormatQlfr(String dtp02BeginTherapyDateFormatQlfr) {
        this.dtp02BeginTherapyDateFormatQlfr = dtp02BeginTherapyDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_beginTherapyDate")
    public String getDtp03BeginTherapyDate() {
        return dtp03BeginTherapyDate;
    }

    @JsonProperty("dtp03_beginTherapyDate")
    public void setDtp03BeginTherapyDate(String dtp03BeginTherapyDate) {
        this.dtp03BeginTherapyDate = dtp03BeginTherapyDate;
    }

    public SvcLineNo withDtp03BeginTherapyDate(String dtp03BeginTherapyDate) {
        this.dtp03BeginTherapyDate = dtp03BeginTherapyDate;
        return this;
    }

    @JsonProperty("dtp01_lastCertificateDateQlfr")
    public String getDtp01LastCertificateDateQlfr() {
        return dtp01LastCertificateDateQlfr;
    }

    @JsonProperty("dtp01_lastCertificateDateQlfr")
    public void setDtp01LastCertificateDateQlfr(String dtp01LastCertificateDateQlfr) {
        this.dtp01LastCertificateDateQlfr = dtp01LastCertificateDateQlfr;
    }

    public SvcLineNo withDtp01LastCertificateDateQlfr(String dtp01LastCertificateDateQlfr) {
        this.dtp01LastCertificateDateQlfr = dtp01LastCertificateDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_lastCertificateDateFormatQlfr")
    public String getDtp02LastCertificateDateFormatQlfr() {
        return dtp02LastCertificateDateFormatQlfr;
    }

    @JsonProperty("dtp02_lastCertificateDateFormatQlfr")
    public void setDtp02LastCertificateDateFormatQlfr(String dtp02LastCertificateDateFormatQlfr) {
        this.dtp02LastCertificateDateFormatQlfr = dtp02LastCertificateDateFormatQlfr;
    }

    public SvcLineNo withDtp02LastCertificateDateFormatQlfr(String dtp02LastCertificateDateFormatQlfr) {
        this.dtp02LastCertificateDateFormatQlfr = dtp02LastCertificateDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_lastCertificationDate")
    public String getDtp03LastCertificationDate() {
        return dtp03LastCertificationDate;
    }

    @JsonProperty("dtp03_lastCertificationDate")
    public void setDtp03LastCertificationDate(String dtp03LastCertificationDate) {
        this.dtp03LastCertificationDate = dtp03LastCertificationDate;
    }

    public SvcLineNo withDtp03LastCertificationDate(String dtp03LastCertificationDate) {
        this.dtp03LastCertificationDate = dtp03LastCertificationDate;
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

    public SvcLineNo withDtp01LastSeenDateQlfr(String dtp01LastSeenDateQlfr) {
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

    public SvcLineNo withDtp02LastSeenDateFormatQlfr(String dtp02LastSeenDateFormatQlfr) {
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

    public SvcLineNo withDtp03LastSeenDate(String dtp03LastSeenDate) {
        this.dtp03LastSeenDate = dtp03LastSeenDate;
        return this;
    }

    @JsonProperty("dtp_lastTestDate")
    public List<DtpLastTestDate> getDtpLastTestDate() {
        return dtpLastTestDate;
    }

    @JsonProperty("dtp_lastTestDate")
    public void setDtpLastTestDate(List<DtpLastTestDate> dtpLastTestDate) {
        this.dtpLastTestDate = dtpLastTestDate;
    }

    public SvcLineNo withDtpLastTestDate(List<DtpLastTestDate> dtpLastTestDate) {
        this.dtpLastTestDate = dtpLastTestDate;
        return this;
    }

    @JsonProperty("dtp01_shippedDateQlfr")
    public String getDtp01ShippedDateQlfr() {
        return dtp01ShippedDateQlfr;
    }

    @JsonProperty("dtp01_shippedDateQlfr")
    public void setDtp01ShippedDateQlfr(String dtp01ShippedDateQlfr) {
        this.dtp01ShippedDateQlfr = dtp01ShippedDateQlfr;
    }

    public SvcLineNo withDtp01ShippedDateQlfr(String dtp01ShippedDateQlfr) {
        this.dtp01ShippedDateQlfr = dtp01ShippedDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_shippedDateFormatQlfr")
    public String getDtp02ShippedDateFormatQlfr() {
        return dtp02ShippedDateFormatQlfr;
    }

    @JsonProperty("dtp02_shippedDateFormatQlfr")
    public void setDtp02ShippedDateFormatQlfr(String dtp02ShippedDateFormatQlfr) {
        this.dtp02ShippedDateFormatQlfr = dtp02ShippedDateFormatQlfr;
    }

    public SvcLineNo withDtp02ShippedDateFormatQlfr(String dtp02ShippedDateFormatQlfr) {
        this.dtp02ShippedDateFormatQlfr = dtp02ShippedDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_shippedDate")
    public String getDtp03ShippedDate() {
        return dtp03ShippedDate;
    }

    @JsonProperty("dtp03_shippedDate")
    public void setDtp03ShippedDate(String dtp03ShippedDate) {
        this.dtp03ShippedDate = dtp03ShippedDate;
    }

    public SvcLineNo withDtp03ShippedDate(String dtp03ShippedDate) {
        this.dtp03ShippedDate = dtp03ShippedDate;
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

    public SvcLineNo withDtp01LastXrayDateQlfr(String dtp01LastXrayDateQlfr) {
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

    public SvcLineNo withDtp02LastXrayDateFormatQlfr(String dtp02LastXrayDateFormatQlfr) {
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

    public SvcLineNo withDtp03LastXrayDate(String dtp03LastXrayDate) {
        this.dtp03LastXrayDate = dtp03LastXrayDate;
        return this;
    }

    @JsonProperty("dtp01_priorPlacementDateQlfr")
    public String getDtp01PriorPlacementDateQlfr() {
        return dtp01PriorPlacementDateQlfr;
    }

    @JsonProperty("dtp01_priorPlacementDateQlfr")
    public void setDtp01PriorPlacementDateQlfr(String dtp01PriorPlacementDateQlfr) {
        this.dtp01PriorPlacementDateQlfr = dtp01PriorPlacementDateQlfr;
    }

    public SvcLineNo withDtp01PriorPlacementDateQlfr(String dtp01PriorPlacementDateQlfr) {
        this.dtp01PriorPlacementDateQlfr = dtp01PriorPlacementDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_priorPlacementDateFormatQlfr")
    public String getDtp02PriorPlacementDateFormatQlfr() {
        return dtp02PriorPlacementDateFormatQlfr;
    }

    @JsonProperty("dtp02_priorPlacementDateFormatQlfr")
    public void setDtp02PriorPlacementDateFormatQlfr(String dtp02PriorPlacementDateFormatQlfr) {
        this.dtp02PriorPlacementDateFormatQlfr = dtp02PriorPlacementDateFormatQlfr;
    }

    public SvcLineNo withDtp02PriorPlacementDateFormatQlfr(String dtp02PriorPlacementDateFormatQlfr) {
        this.dtp02PriorPlacementDateFormatQlfr = dtp02PriorPlacementDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_priorPlacementDate")
    public String getDtp03PriorPlacementDate() {
        return dtp03PriorPlacementDate;
    }

    @JsonProperty("dtp03_priorPlacementDate")
    public void setDtp03PriorPlacementDate(String dtp03PriorPlacementDate) {
        this.dtp03PriorPlacementDate = dtp03PriorPlacementDate;
    }

    public SvcLineNo withDtp03PriorPlacementDate(String dtp03PriorPlacementDate) {
        this.dtp03PriorPlacementDate = dtp03PriorPlacementDate;
        return this;
    }

    @JsonProperty("dtp01_orthodonticBandingDateQlfr")
    public String getDtp01OrthodonticBandingDateQlfr() {
        return dtp01OrthodonticBandingDateQlfr;
    }

    @JsonProperty("dtp01_orthodonticBandingDateQlfr")
    public void setDtp01OrthodonticBandingDateQlfr(String dtp01OrthodonticBandingDateQlfr) {
        this.dtp01OrthodonticBandingDateQlfr = dtp01OrthodonticBandingDateQlfr;
    }

    public SvcLineNo withDtp01OrthodonticBandingDateQlfr(String dtp01OrthodonticBandingDateQlfr) {
        this.dtp01OrthodonticBandingDateQlfr = dtp01OrthodonticBandingDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_orthodonticBandingDateFormatQlfr")
    public String getDtp02OrthodonticBandingDateFormatQlfr() {
        return dtp02OrthodonticBandingDateFormatQlfr;
    }

    @JsonProperty("dtp02_orthodonticBandingDateFormatQlfr")
    public void setDtp02OrthodonticBandingDateFormatQlfr(String dtp02OrthodonticBandingDateFormatQlfr) {
        this.dtp02OrthodonticBandingDateFormatQlfr = dtp02OrthodonticBandingDateFormatQlfr;
    }

    public SvcLineNo withDtp02OrthodonticBandingDateFormatQlfr(String dtp02OrthodonticBandingDateFormatQlfr) {
        this.dtp02OrthodonticBandingDateFormatQlfr = dtp02OrthodonticBandingDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_orthodonticBandingDate")
    public String getDtp03OrthodonticBandingDate() {
        return dtp03OrthodonticBandingDate;
    }

    @JsonProperty("dtp03_orthodonticBandingDate")
    public void setDtp03OrthodonticBandingDate(String dtp03OrthodonticBandingDate) {
        this.dtp03OrthodonticBandingDate = dtp03OrthodonticBandingDate;
    }

    public SvcLineNo withDtp03OrthodonticBandingDate(String dtp03OrthodonticBandingDate) {
        this.dtp03OrthodonticBandingDate = dtp03OrthodonticBandingDate;
        return this;
    }

    @JsonProperty("dtp01_replacementDateQlfr")
    public String getDtp01ReplacementDateQlfr() {
        return dtp01ReplacementDateQlfr;
    }

    @JsonProperty("dtp01_replacementDateQlfr")
    public void setDtp01ReplacementDateQlfr(String dtp01ReplacementDateQlfr) {
        this.dtp01ReplacementDateQlfr = dtp01ReplacementDateQlfr;
    }

    public SvcLineNo withDtp01ReplacementDateQlfr(String dtp01ReplacementDateQlfr) {
        this.dtp01ReplacementDateQlfr = dtp01ReplacementDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_replacementDateFormatQlfr")
    public String getDtp02ReplacementDateFormatQlfr() {
        return dtp02ReplacementDateFormatQlfr;
    }

    @JsonProperty("dtp02_replacementDateFormatQlfr")
    public void setDtp02ReplacementDateFormatQlfr(String dtp02ReplacementDateFormatQlfr) {
        this.dtp02ReplacementDateFormatQlfr = dtp02ReplacementDateFormatQlfr;
    }

    public SvcLineNo withDtp02ReplacementDateFormatQlfr(String dtp02ReplacementDateFormatQlfr) {
        this.dtp02ReplacementDateFormatQlfr = dtp02ReplacementDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_replacementDate")
    public String getDtp03ReplacementDate() {
        return dtp03ReplacementDate;
    }

    @JsonProperty("dtp03_replacementDate")
    public void setDtp03ReplacementDate(String dtp03ReplacementDate) {
        this.dtp03ReplacementDate = dtp03ReplacementDate;
    }

    public SvcLineNo withDtp03ReplacementDate(String dtp03ReplacementDate) {
        this.dtp03ReplacementDate = dtp03ReplacementDate;
        return this;
    }

    @JsonProperty("dtp01_treatmentStartDateQlfr")
    public String getDtp01TreatmentStartDateQlfr() {
        return dtp01TreatmentStartDateQlfr;
    }

    @JsonProperty("dtp01_treatmentStartDateQlfr")
    public void setDtp01TreatmentStartDateQlfr(String dtp01TreatmentStartDateQlfr) {
        this.dtp01TreatmentStartDateQlfr = dtp01TreatmentStartDateQlfr;
    }

    public SvcLineNo withDtp01TreatmentStartDateQlfr(String dtp01TreatmentStartDateQlfr) {
        this.dtp01TreatmentStartDateQlfr = dtp01TreatmentStartDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_treatmentStartDateFormatQlfr")
    public String getDtp02TreatmentStartDateFormatQlfr() {
        return dtp02TreatmentStartDateFormatQlfr;
    }

    @JsonProperty("dtp02_treatmentStartDateFormatQlfr")
    public void setDtp02TreatmentStartDateFormatQlfr(String dtp02TreatmentStartDateFormatQlfr) {
        this.dtp02TreatmentStartDateFormatQlfr = dtp02TreatmentStartDateFormatQlfr;
    }

    public SvcLineNo withDtp02TreatmentStartDateFormatQlfr(String dtp02TreatmentStartDateFormatQlfr) {
        this.dtp02TreatmentStartDateFormatQlfr = dtp02TreatmentStartDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_treatmentStartDate")
    public String getDtp03TreatmentStartDate() {
        return dtp03TreatmentStartDate;
    }

    @JsonProperty("dtp03_treatmentStartDate")
    public void setDtp03TreatmentStartDate(String dtp03TreatmentStartDate) {
        this.dtp03TreatmentStartDate = dtp03TreatmentStartDate;
    }

    public SvcLineNo withDtp03TreatmentStartDate(String dtp03TreatmentStartDate) {
        this.dtp03TreatmentStartDate = dtp03TreatmentStartDate;
        return this;
    }

    @JsonProperty("dtp01_treatmentCompletionDateQlfr")
    public String getDtp01TreatmentCompletionDateQlfr() {
        return dtp01TreatmentCompletionDateQlfr;
    }

    @JsonProperty("dtp01_treatmentCompletionDateQlfr")
    public void setDtp01TreatmentCompletionDateQlfr(String dtp01TreatmentCompletionDateQlfr) {
        this.dtp01TreatmentCompletionDateQlfr = dtp01TreatmentCompletionDateQlfr;
    }

    public SvcLineNo withDtp01TreatmentCompletionDateQlfr(String dtp01TreatmentCompletionDateQlfr) {
        this.dtp01TreatmentCompletionDateQlfr = dtp01TreatmentCompletionDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_treatmentCompletionFormatQlfr")
    public String getDtp02TreatmentCompletionFormatQlfr() {
        return dtp02TreatmentCompletionFormatQlfr;
    }

    @JsonProperty("dtp02_treatmentCompletionFormatQlfr")
    public void setDtp02TreatmentCompletionFormatQlfr(String dtp02TreatmentCompletionFormatQlfr) {
        this.dtp02TreatmentCompletionFormatQlfr = dtp02TreatmentCompletionFormatQlfr;
    }

    public SvcLineNo withDtp02TreatmentCompletionFormatQlfr(String dtp02TreatmentCompletionFormatQlfr) {
        this.dtp02TreatmentCompletionFormatQlfr = dtp02TreatmentCompletionFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_treatmentCompletionDate")
    public String getDtp03TreatmentCompletionDate() {
        return dtp03TreatmentCompletionDate;
    }

    @JsonProperty("dtp03_treatmentCompletionDate")
    public void setDtp03TreatmentCompletionDate(String dtp03TreatmentCompletionDate) {
        this.dtp03TreatmentCompletionDate = dtp03TreatmentCompletionDate;
    }

    public SvcLineNo withDtp03TreatmentCompletionDate(String dtp03TreatmentCompletionDate) {
        this.dtp03TreatmentCompletionDate = dtp03TreatmentCompletionDate;
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

    public SvcLineNo withDtp01InitialTreatmentDateQlfr(String dtp01InitialTreatmentDateQlfr) {
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

    public SvcLineNo withDtp02InitialTreatmentDateFormatQlfr(String dtp02InitialTreatmentDateFormatQlfr) {
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

    public SvcLineNo withDtp03InitialTreatmentDate(String dtp03InitialTreatmentDate) {
        this.dtp03InitialTreatmentDate = dtp03InitialTreatmentDate;
        return this;
    }

    @JsonProperty("qty01_ambulancePatientCountQlfr")
    public String getQty01AmbulancePatientCountQlfr() {
        return qty01AmbulancePatientCountQlfr;
    }

    @JsonProperty("qty01_ambulancePatientCountQlfr")
    public void setQty01AmbulancePatientCountQlfr(String qty01AmbulancePatientCountQlfr) {
        this.qty01AmbulancePatientCountQlfr = qty01AmbulancePatientCountQlfr;
    }

    public SvcLineNo withQty01AmbulancePatientCountQlfr(String qty01AmbulancePatientCountQlfr) {
        this.qty01AmbulancePatientCountQlfr = qty01AmbulancePatientCountQlfr;
        return this;
    }

    @JsonProperty("qty02_ambulancePatientCount")
    public String getQty02AmbulancePatientCount() {
        return qty02AmbulancePatientCount;
    }

    @JsonProperty("qty02_ambulancePatientCount")
    public void setQty02AmbulancePatientCount(String qty02AmbulancePatientCount) {
        this.qty02AmbulancePatientCount = qty02AmbulancePatientCount;
    }

    public SvcLineNo withQty02AmbulancePatientCount(String qty02AmbulancePatientCount) {
        this.qty02AmbulancePatientCount = qty02AmbulancePatientCount;
        return this;
    }

    @JsonProperty("qty01_obstetricAdditionalUnitsQlfr")
    public String getQty01ObstetricAdditionalUnitsQlfr() {
        return qty01ObstetricAdditionalUnitsQlfr;
    }

    @JsonProperty("qty01_obstetricAdditionalUnitsQlfr")
    public void setQty01ObstetricAdditionalUnitsQlfr(String qty01ObstetricAdditionalUnitsQlfr) {
        this.qty01ObstetricAdditionalUnitsQlfr = qty01ObstetricAdditionalUnitsQlfr;
    }

    public SvcLineNo withQty01ObstetricAdditionalUnitsQlfr(String qty01ObstetricAdditionalUnitsQlfr) {
        this.qty01ObstetricAdditionalUnitsQlfr = qty01ObstetricAdditionalUnitsQlfr;
        return this;
    }

    @JsonProperty("qty02_obstetricAdditionalUnits")
    public String getQty02ObstetricAdditionalUnits() {
        return qty02ObstetricAdditionalUnits;
    }

    @JsonProperty("qty02_obstetricAdditionalUnits")
    public void setQty02ObstetricAdditionalUnits(String qty02ObstetricAdditionalUnits) {
        this.qty02ObstetricAdditionalUnits = qty02ObstetricAdditionalUnits;
    }

    public SvcLineNo withQty02ObstetricAdditionalUnits(String qty02ObstetricAdditionalUnits) {
        this.qty02ObstetricAdditionalUnits = qty02ObstetricAdditionalUnits;
        return this;
    }

    @JsonProperty("mea_testResult")
    public List<MeaTestResult> getMeaTestResult() {
        return meaTestResult;
    }

    @JsonProperty("mea_testResult")
    public void setMeaTestResult(List<MeaTestResult> meaTestResult) {
        this.meaTestResult = meaTestResult;
    }

    public SvcLineNo withMeaTestResult(List<MeaTestResult> meaTestResult) {
        this.meaTestResult = meaTestResult;
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

    public SvcLineNo withCn101ContractTypeCode(String cn101ContractTypeCode) {
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

    public SvcLineNo withCn102ContractAmount(String cn102ContractAmount) {
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

    public SvcLineNo withCn103ContractPercentage(String cn103ContractPercentage) {
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

    public SvcLineNo withCn104ContractCode(String cn104ContractCode) {
        this.cn104ContractCode = cn104ContractCode;
        return this;
    }

    @JsonProperty("cn105_contractTermsDiscountPercent")
    public String getCn105ContractTermsDiscountPercent() {
        return cn105ContractTermsDiscountPercent;
    }

    @JsonProperty("cn105_contractTermsDiscountPercent")
    public void setCn105ContractTermsDiscountPercent(String cn105ContractTermsDiscountPercent) {
        this.cn105ContractTermsDiscountPercent = cn105ContractTermsDiscountPercent;
    }

    public SvcLineNo withCn105ContractTermsDiscountPercent(String cn105ContractTermsDiscountPercent) {
        this.cn105ContractTermsDiscountPercent = cn105ContractTermsDiscountPercent;
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

    public SvcLineNo withCn106ContractVersionIdentifier(String cn106ContractVersionIdentifier) {
        this.cn106ContractVersionIdentifier = cn106ContractVersionIdentifier;
        return this;
    }

    @JsonProperty("ref01_repricedLineItemReferenceNoQlfr")
    public String getRef01RepricedLineItemReferenceNoQlfr() {
        return ref01RepricedLineItemReferenceNoQlfr;
    }

    @JsonProperty("ref01_repricedLineItemReferenceNoQlfr")
    public void setRef01RepricedLineItemReferenceNoQlfr(String ref01RepricedLineItemReferenceNoQlfr) {
        this.ref01RepricedLineItemReferenceNoQlfr = ref01RepricedLineItemReferenceNoQlfr;
    }

    public SvcLineNo withRef01RepricedLineItemReferenceNoQlfr(String ref01RepricedLineItemReferenceNoQlfr) {
        this.ref01RepricedLineItemReferenceNoQlfr = ref01RepricedLineItemReferenceNoQlfr;
        return this;
    }

    @JsonProperty("ref02_repricedLineItemReferenceNo")
    public String getRef02RepricedLineItemReferenceNo() {
        return ref02RepricedLineItemReferenceNo;
    }

    @JsonProperty("ref02_repricedLineItemReferenceNo")
    public void setRef02RepricedLineItemReferenceNo(String ref02RepricedLineItemReferenceNo) {
        this.ref02RepricedLineItemReferenceNo = ref02RepricedLineItemReferenceNo;
    }

    public SvcLineNo withRef02RepricedLineItemReferenceNo(String ref02RepricedLineItemReferenceNo) {
        this.ref02RepricedLineItemReferenceNo = ref02RepricedLineItemReferenceNo;
        return this;
    }

    @JsonProperty("ref01_adjustedRepricedLineItemReferenceNoQlfr")
    public String getRef01AdjustedRepricedLineItemReferenceNoQlfr() {
        return ref01AdjustedRepricedLineItemReferenceNoQlfr;
    }

    @JsonProperty("ref01_adjustedRepricedLineItemReferenceNoQlfr")
    public void setRef01AdjustedRepricedLineItemReferenceNoQlfr(String ref01AdjustedRepricedLineItemReferenceNoQlfr) {
        this.ref01AdjustedRepricedLineItemReferenceNoQlfr = ref01AdjustedRepricedLineItemReferenceNoQlfr;
    }

    public SvcLineNo withRef01AdjustedRepricedLineItemReferenceNoQlfr(String ref01AdjustedRepricedLineItemReferenceNoQlfr) {
        this.ref01AdjustedRepricedLineItemReferenceNoQlfr = ref01AdjustedRepricedLineItemReferenceNoQlfr;
        return this;
    }

    @JsonProperty("ref02_adjustedRepricedLineItemReferenceNo")
    public String getRef02AdjustedRepricedLineItemReferenceNo() {
        return ref02AdjustedRepricedLineItemReferenceNo;
    }

    @JsonProperty("ref02_adjustedRepricedLineItemReferenceNo")
    public void setRef02AdjustedRepricedLineItemReferenceNo(String ref02AdjustedRepricedLineItemReferenceNo) {
        this.ref02AdjustedRepricedLineItemReferenceNo = ref02AdjustedRepricedLineItemReferenceNo;
    }

    public SvcLineNo withRef02AdjustedRepricedLineItemReferenceNo(String ref02AdjustedRepricedLineItemReferenceNo) {
        this.ref02AdjustedRepricedLineItemReferenceNo = ref02AdjustedRepricedLineItemReferenceNo;
        return this;
    }

    @JsonProperty("ref_predeterminationOfBenefitsIdentification")
    public List<RefPredeterminationOfBenefitsIdentification_> getRefPredeterminationOfBenefitsIdentification() {
        return refPredeterminationOfBenefitsIdentification;
    }

    @JsonProperty("ref_predeterminationOfBenefitsIdentification")
    public void setRefPredeterminationOfBenefitsIdentification(List<RefPredeterminationOfBenefitsIdentification_> refPredeterminationOfBenefitsIdentification) {
        this.refPredeterminationOfBenefitsIdentification = refPredeterminationOfBenefitsIdentification;
    }

    public SvcLineNo withRefPredeterminationOfBenefitsIdentification(List<RefPredeterminationOfBenefitsIdentification_> refPredeterminationOfBenefitsIdentification) {
        this.refPredeterminationOfBenefitsIdentification = refPredeterminationOfBenefitsIdentification;
        return this;
    }

    @JsonProperty("ref_priorAuthorization")
    public List<RefPriorAuthorization> getRefPriorAuthorization() {
        return refPriorAuthorization;
    }

    @JsonProperty("ref_priorAuthorization")
    public void setRefPriorAuthorization(List<RefPriorAuthorization> refPriorAuthorization) {
        this.refPriorAuthorization = refPriorAuthorization;
    }

    public SvcLineNo withRefPriorAuthorization(List<RefPriorAuthorization> refPriorAuthorization) {
        this.refPriorAuthorization = refPriorAuthorization;
        return this;
    }

    @JsonProperty("ref01_lineItemControlNoQlfr")
    public String getRef01LineItemControlNoQlfr() {
        return ref01LineItemControlNoQlfr;
    }

    @JsonProperty("ref01_lineItemControlNoQlfr")
    public void setRef01LineItemControlNoQlfr(String ref01LineItemControlNoQlfr) {
        this.ref01LineItemControlNoQlfr = ref01LineItemControlNoQlfr;
    }

    public SvcLineNo withRef01LineItemControlNoQlfr(String ref01LineItemControlNoQlfr) {
        this.ref01LineItemControlNoQlfr = ref01LineItemControlNoQlfr;
        return this;
    }

    @JsonProperty("ref02_lineItemControlNo")
    public String getRef02LineItemControlNo() {
        return ref02LineItemControlNo;
    }

    @JsonProperty("ref02_lineItemControlNo")
    public void setRef02LineItemControlNo(String ref02LineItemControlNo) {
        this.ref02LineItemControlNo = ref02LineItemControlNo;
    }

    public SvcLineNo withRef02LineItemControlNo(String ref02LineItemControlNo) {
        this.ref02LineItemControlNo = ref02LineItemControlNo;
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

    public SvcLineNo withRef01MammographyCertificationNoQlfr(String ref01MammographyCertificationNoQlfr) {
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

    public SvcLineNo withRef02MammographyCertificationNo(String ref02MammographyCertificationNo) {
        this.ref02MammographyCertificationNo = ref02MammographyCertificationNo;
        return this;
    }

    @JsonProperty("ref01_CLIAQlfr")
    public String getRef01CLIAQlfr() {
        return ref01CLIAQlfr;
    }

    @JsonProperty("ref01_CLIAQlfr")
    public void setRef01CLIAQlfr(String ref01CLIAQlfr) {
        this.ref01CLIAQlfr = ref01CLIAQlfr;
    }

    public SvcLineNo withRef01CLIAQlfr(String ref01CLIAQlfr) {
        this.ref01CLIAQlfr = ref01CLIAQlfr;
        return this;
    }

    @JsonProperty("ref02_CLIANo")
    public String getRef02CLIANo() {
        return ref02CLIANo;
    }

    @JsonProperty("ref02_CLIANo")
    public void setRef02CLIANo(String ref02CLIANo) {
        this.ref02CLIANo = ref02CLIANo;
    }

    public SvcLineNo withRef02CLIANo(String ref02CLIANo) {
        this.ref02CLIANo = ref02CLIANo;
        return this;
    }

    @JsonProperty("ref01_referringCLIANoQlfr")
    public String getRef01ReferringCLIANoQlfr() {
        return ref01ReferringCLIANoQlfr;
    }

    @JsonProperty("ref01_referringCLIANoQlfr")
    public void setRef01ReferringCLIANoQlfr(String ref01ReferringCLIANoQlfr) {
        this.ref01ReferringCLIANoQlfr = ref01ReferringCLIANoQlfr;
    }

    public SvcLineNo withRef01ReferringCLIANoQlfr(String ref01ReferringCLIANoQlfr) {
        this.ref01ReferringCLIANoQlfr = ref01ReferringCLIANoQlfr;
        return this;
    }

    @JsonProperty("ref02_referringCLIANo")
    public String getRef02ReferringCLIANo() {
        return ref02ReferringCLIANo;
    }

    @JsonProperty("ref02_referringCLIANo")
    public void setRef02ReferringCLIANo(String ref02ReferringCLIANo) {
        this.ref02ReferringCLIANo = ref02ReferringCLIANo;
    }

    public SvcLineNo withRef02ReferringCLIANo(String ref02ReferringCLIANo) {
        this.ref02ReferringCLIANo = ref02ReferringCLIANo;
        return this;
    }

    @JsonProperty("ref01_immunizationBatchNoQlfr")
    public String getRef01ImmunizationBatchNoQlfr() {
        return ref01ImmunizationBatchNoQlfr;
    }

    @JsonProperty("ref01_immunizationBatchNoQlfr")
    public void setRef01ImmunizationBatchNoQlfr(String ref01ImmunizationBatchNoQlfr) {
        this.ref01ImmunizationBatchNoQlfr = ref01ImmunizationBatchNoQlfr;
    }

    public SvcLineNo withRef01ImmunizationBatchNoQlfr(String ref01ImmunizationBatchNoQlfr) {
        this.ref01ImmunizationBatchNoQlfr = ref01ImmunizationBatchNoQlfr;
        return this;
    }

    @JsonProperty("ref02_immunizationBatchNo")
    public String getRef02ImmunizationBatchNo() {
        return ref02ImmunizationBatchNo;
    }

    @JsonProperty("ref02_immunizationBatchNo")
    public void setRef02ImmunizationBatchNo(String ref02ImmunizationBatchNo) {
        this.ref02ImmunizationBatchNo = ref02ImmunizationBatchNo;
    }

    public SvcLineNo withRef02ImmunizationBatchNo(String ref02ImmunizationBatchNo) {
        this.ref02ImmunizationBatchNo = ref02ImmunizationBatchNo;
        return this;
    }

    @JsonProperty("ref_referralNo")
    public List<RefReferralNo> getRefReferralNo() {
        return refReferralNo;
    }

    @JsonProperty("ref_referralNo")
    public void setRefReferralNo(List<RefReferralNo> refReferralNo) {
        this.refReferralNo = refReferralNo;
    }

    public SvcLineNo withRefReferralNo(List<RefReferralNo> refReferralNo) {
        this.refReferralNo = refReferralNo;
        return this;
    }

    @JsonProperty("amt01_salesTaxAmountQlfrCode")
    public String getAmt01SalesTaxAmountQlfrCode() {
        return amt01SalesTaxAmountQlfrCode;
    }

    @JsonProperty("amt01_salesTaxAmountQlfrCode")
    public void setAmt01SalesTaxAmountQlfrCode(String amt01SalesTaxAmountQlfrCode) {
        this.amt01SalesTaxAmountQlfrCode = amt01SalesTaxAmountQlfrCode;
    }

    public SvcLineNo withAmt01SalesTaxAmountQlfrCode(String amt01SalesTaxAmountQlfrCode) {
        this.amt01SalesTaxAmountQlfrCode = amt01SalesTaxAmountQlfrCode;
        return this;
    }

    @JsonProperty("amt02_salesTaxAmount")
    public String getAmt02SalesTaxAmount() {
        return amt02SalesTaxAmount;
    }

    @JsonProperty("amt02_salesTaxAmount")
    public void setAmt02SalesTaxAmount(String amt02SalesTaxAmount) {
        this.amt02SalesTaxAmount = amt02SalesTaxAmount;
    }

    public SvcLineNo withAmt02SalesTaxAmount(String amt02SalesTaxAmount) {
        this.amt02SalesTaxAmount = amt02SalesTaxAmount;
        return this;
    }

    @JsonProperty("amt01_postageClaimedAmountQlfrCode")
    public String getAmt01PostageClaimedAmountQlfrCode() {
        return amt01PostageClaimedAmountQlfrCode;
    }

    @JsonProperty("amt01_postageClaimedAmountQlfrCode")
    public void setAmt01PostageClaimedAmountQlfrCode(String amt01PostageClaimedAmountQlfrCode) {
        this.amt01PostageClaimedAmountQlfrCode = amt01PostageClaimedAmountQlfrCode;
    }

    public SvcLineNo withAmt01PostageClaimedAmountQlfrCode(String amt01PostageClaimedAmountQlfrCode) {
        this.amt01PostageClaimedAmountQlfrCode = amt01PostageClaimedAmountQlfrCode;
        return this;
    }

    @JsonProperty("amt02_postageClaimedAmount")
    public String getAmt02PostageClaimedAmount() {
        return amt02PostageClaimedAmount;
    }

    @JsonProperty("amt02_postageClaimedAmount")
    public void setAmt02PostageClaimedAmount(String amt02PostageClaimedAmount) {
        this.amt02PostageClaimedAmount = amt02PostageClaimedAmount;
    }

    public SvcLineNo withAmt02PostageClaimedAmount(String amt02PostageClaimedAmount) {
        this.amt02PostageClaimedAmount = amt02PostageClaimedAmount;
        return this;
    }

    @JsonProperty("amt01_goodsAndServiceTaxQlfrCode")
    public String getAmt01GoodsAndServiceTaxQlfrCode() {
        return amt01GoodsAndServiceTaxQlfrCode;
    }

    @JsonProperty("amt01_goodsAndServiceTaxQlfrCode")
    public void setAmt01GoodsAndServiceTaxQlfrCode(String amt01GoodsAndServiceTaxQlfrCode) {
        this.amt01GoodsAndServiceTaxQlfrCode = amt01GoodsAndServiceTaxQlfrCode;
    }

    public SvcLineNo withAmt01GoodsAndServiceTaxQlfrCode(String amt01GoodsAndServiceTaxQlfrCode) {
        this.amt01GoodsAndServiceTaxQlfrCode = amt01GoodsAndServiceTaxQlfrCode;
        return this;
    }

    @JsonProperty("amt02_serviceTaxAmount")
    public String getAmt02ServiceTaxAmount() {
        return amt02ServiceTaxAmount;
    }

    @JsonProperty("amt02_serviceTaxAmount")
    public void setAmt02ServiceTaxAmount(String amt02ServiceTaxAmount) {
        this.amt02ServiceTaxAmount = amt02ServiceTaxAmount;
    }

    public SvcLineNo withAmt02ServiceTaxAmount(String amt02ServiceTaxAmount) {
        this.amt02ServiceTaxAmount = amt02ServiceTaxAmount;
        return this;
    }

    @JsonProperty("amt01_MiscellaneousQlfrCode")
    public String getAmt01MiscellaneousQlfrCode() {
        return amt01MiscellaneousQlfrCode;
    }

    @JsonProperty("amt01_MiscellaneousQlfrCode")
    public void setAmt01MiscellaneousQlfrCode(String amt01MiscellaneousQlfrCode) {
        this.amt01MiscellaneousQlfrCode = amt01MiscellaneousQlfrCode;
    }

    public SvcLineNo withAmt01MiscellaneousQlfrCode(String amt01MiscellaneousQlfrCode) {
        this.amt01MiscellaneousQlfrCode = amt01MiscellaneousQlfrCode;
        return this;
    }

    @JsonProperty("amt02_facilityTaxAmount")
    public String getAmt02FacilityTaxAmount() {
        return amt02FacilityTaxAmount;
    }

    @JsonProperty("amt02_facilityTaxAmount")
    public void setAmt02FacilityTaxAmount(String amt02FacilityTaxAmount) {
        this.amt02FacilityTaxAmount = amt02FacilityTaxAmount;
    }

    public SvcLineNo withAmt02FacilityTaxAmount(String amt02FacilityTaxAmount) {
        this.amt02FacilityTaxAmount = amt02FacilityTaxAmount;
        return this;
    }

    @JsonProperty("k3fileInformation")
    public List<List<K3fileInformation_>> getK3fileInformation() {
        return k3fileInformation;
    }

    @JsonProperty("k3fileInformation")
    public void setK3fileInformation(List<List<K3fileInformation_>> k3fileInformation) {
        this.k3fileInformation = k3fileInformation;
    }

    public SvcLineNo withK3fileInformation(List<List<K3fileInformation_>> k3fileInformation) {
        this.k3fileInformation = k3fileInformation;
        return this;
    }

    @JsonProperty("nte01_lineNoteReferenceCode")
    public String getNte01LineNoteReferenceCode() {
        return nte01LineNoteReferenceCode;
    }

    @JsonProperty("nte01_lineNoteReferenceCode")
    public void setNte01LineNoteReferenceCode(String nte01LineNoteReferenceCode) {
        this.nte01LineNoteReferenceCode = nte01LineNoteReferenceCode;
    }

    public SvcLineNo withNte01LineNoteReferenceCode(String nte01LineNoteReferenceCode) {
        this.nte01LineNoteReferenceCode = nte01LineNoteReferenceCode;
        return this;
    }

    @JsonProperty("nte02_lineNoteText")
    public String getNte02LineNoteText() {
        return nte02LineNoteText;
    }

    @JsonProperty("nte02_lineNoteText")
    public void setNte02LineNoteText(String nte02LineNoteText) {
        this.nte02LineNoteText = nte02LineNoteText;
    }

    public SvcLineNo withNte02LineNoteText(String nte02LineNoteText) {
        this.nte02LineNoteText = nte02LineNoteText;
        return this;
    }

    @JsonProperty("nte01_thirdPartyNoteCode")
    public String getNte01ThirdPartyNoteCode() {
        return nte01ThirdPartyNoteCode;
    }

    @JsonProperty("nte01_thirdPartyNoteCode")
    public void setNte01ThirdPartyNoteCode(String nte01ThirdPartyNoteCode) {
        this.nte01ThirdPartyNoteCode = nte01ThirdPartyNoteCode;
    }

    public SvcLineNo withNte01ThirdPartyNoteCode(String nte01ThirdPartyNoteCode) {
        this.nte01ThirdPartyNoteCode = nte01ThirdPartyNoteCode;
        return this;
    }

    @JsonProperty("nte02_thirdPartyText")
    public String getNte02ThirdPartyText() {
        return nte02ThirdPartyText;
    }

    @JsonProperty("nte02_thirdPartyText")
    public void setNte02ThirdPartyText(String nte02ThirdPartyText) {
        this.nte02ThirdPartyText = nte02ThirdPartyText;
    }

    public SvcLineNo withNte02ThirdPartyText(String nte02ThirdPartyText) {
        this.nte02ThirdPartyText = nte02ThirdPartyText;
        return this;
    }

    @JsonProperty("ps101_purchasedServiceProviderIdentifier")
    public String getPs101PurchasedServiceProviderIdentifier() {
        return ps101PurchasedServiceProviderIdentifier;
    }

    @JsonProperty("ps101_purchasedServiceProviderIdentifier")
    public void setPs101PurchasedServiceProviderIdentifier(String ps101PurchasedServiceProviderIdentifier) {
        this.ps101PurchasedServiceProviderIdentifier = ps101PurchasedServiceProviderIdentifier;
    }

    public SvcLineNo withPs101PurchasedServiceProviderIdentifier(String ps101PurchasedServiceProviderIdentifier) {
        this.ps101PurchasedServiceProviderIdentifier = ps101PurchasedServiceProviderIdentifier;
        return this;
    }

    @JsonProperty("ps102_purchasedServiceChargeAmount")
    public String getPs102PurchasedServiceChargeAmount() {
        return ps102PurchasedServiceChargeAmount;
    }

    @JsonProperty("ps102_purchasedServiceChargeAmount")
    public void setPs102PurchasedServiceChargeAmount(String ps102PurchasedServiceChargeAmount) {
        this.ps102PurchasedServiceChargeAmount = ps102PurchasedServiceChargeAmount;
    }

    public SvcLineNo withPs102PurchasedServiceChargeAmount(String ps102PurchasedServiceChargeAmount) {
        this.ps102PurchasedServiceChargeAmount = ps102PurchasedServiceChargeAmount;
        return this;
    }

    @JsonProperty("hcp01_pricingMethodologyCode")
    public String getHcp01PricingMethodologyCode() {
        return hcp01PricingMethodologyCode;
    }

    @JsonProperty("hcp01_pricingMethodologyCode")
    public void setHcp01PricingMethodologyCode(String hcp01PricingMethodologyCode) {
        this.hcp01PricingMethodologyCode = hcp01PricingMethodologyCode;
    }

    public SvcLineNo withHcp01PricingMethodologyCode(String hcp01PricingMethodologyCode) {
        this.hcp01PricingMethodologyCode = hcp01PricingMethodologyCode;
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

    public SvcLineNo withHcp02RepricedAllowedAmount(String hcp02RepricedAllowedAmount) {
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

    public SvcLineNo withHcp03RepricedSavingAmount(String hcp03RepricedSavingAmount) {
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

    public SvcLineNo withHcp04RepricingOrgIdentifier(String hcp04RepricingOrgIdentifier) {
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

    public SvcLineNo withHcp05RepricingPerDiemFlatRateAmount(String hcp05RepricingPerDiemFlatRateAmount) {
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

    public SvcLineNo withHcp06RepricedApprovedAmbulatoryPatientGroupCode(String hcp06RepricedApprovedAmbulatoryPatientGroupCode) {
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

    public SvcLineNo withHcp07RepricedApprovedAmbulatoryPatientGroupAmount(String hcp07RepricedApprovedAmbulatoryPatientGroupAmount) {
        this.hcp07RepricedApprovedAmbulatoryPatientGroupAmount = hcp07RepricedApprovedAmbulatoryPatientGroupAmount;
        return this;
    }

    @JsonProperty("hcp09_repricedServiceIdQlfr")
    public String getHcp09RepricedServiceIdQlfr() {
        return hcp09RepricedServiceIdQlfr;
    }

    @JsonProperty("hcp09_repricedServiceIdQlfr")
    public void setHcp09RepricedServiceIdQlfr(String hcp09RepricedServiceIdQlfr) {
        this.hcp09RepricedServiceIdQlfr = hcp09RepricedServiceIdQlfr;
    }

    public SvcLineNo withHcp09RepricedServiceIdQlfr(String hcp09RepricedServiceIdQlfr) {
        this.hcp09RepricedServiceIdQlfr = hcp09RepricedServiceIdQlfr;
        return this;
    }

    @JsonProperty("hcp10_repricedApprovedHCPCSCode")
    public String getHcp10RepricedApprovedHCPCSCode() {
        return hcp10RepricedApprovedHCPCSCode;
    }

    @JsonProperty("hcp10_repricedApprovedHCPCSCode")
    public void setHcp10RepricedApprovedHCPCSCode(String hcp10RepricedApprovedHCPCSCode) {
        this.hcp10RepricedApprovedHCPCSCode = hcp10RepricedApprovedHCPCSCode;
    }

    public SvcLineNo withHcp10RepricedApprovedHCPCSCode(String hcp10RepricedApprovedHCPCSCode) {
        this.hcp10RepricedApprovedHCPCSCode = hcp10RepricedApprovedHCPCSCode;
        return this;
    }

    @JsonProperty("hcp11_repricedUnitMeasurementCode")
    public String getHcp11RepricedUnitMeasurementCode() {
        return hcp11RepricedUnitMeasurementCode;
    }

    @JsonProperty("hcp11_repricedUnitMeasurementCode")
    public void setHcp11RepricedUnitMeasurementCode(String hcp11RepricedUnitMeasurementCode) {
        this.hcp11RepricedUnitMeasurementCode = hcp11RepricedUnitMeasurementCode;
    }

    public SvcLineNo withHcp11RepricedUnitMeasurementCode(String hcp11RepricedUnitMeasurementCode) {
        this.hcp11RepricedUnitMeasurementCode = hcp11RepricedUnitMeasurementCode;
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

    public SvcLineNo withHcp12RepricedApprovedServiceUnitCount(String hcp12RepricedApprovedServiceUnitCount) {
        this.hcp12RepricedApprovedServiceUnitCount = hcp12RepricedApprovedServiceUnitCount;
        return this;
    }

    @JsonProperty("hcp13_repricedRejectReasonCode")
    public String getHcp13RepricedRejectReasonCode() {
        return hcp13RepricedRejectReasonCode;
    }

    @JsonProperty("hcp13_repricedRejectReasonCode")
    public void setHcp13RepricedRejectReasonCode(String hcp13RepricedRejectReasonCode) {
        this.hcp13RepricedRejectReasonCode = hcp13RepricedRejectReasonCode;
    }

    public SvcLineNo withHcp13RepricedRejectReasonCode(String hcp13RepricedRejectReasonCode) {
        this.hcp13RepricedRejectReasonCode = hcp13RepricedRejectReasonCode;
        return this;
    }

    @JsonProperty("hcp14_repricedPolicyComplianceCode")
    public String getHcp14RepricedPolicyComplianceCode() {
        return hcp14RepricedPolicyComplianceCode;
    }

    @JsonProperty("hcp14_repricedPolicyComplianceCode")
    public void setHcp14RepricedPolicyComplianceCode(String hcp14RepricedPolicyComplianceCode) {
        this.hcp14RepricedPolicyComplianceCode = hcp14RepricedPolicyComplianceCode;
    }

    public SvcLineNo withHcp14RepricedPolicyComplianceCode(String hcp14RepricedPolicyComplianceCode) {
        this.hcp14RepricedPolicyComplianceCode = hcp14RepricedPolicyComplianceCode;
        return this;
    }

    @JsonProperty("hcp15_repricedExceptionCode")
    public String getHcp15RepricedExceptionCode() {
        return hcp15RepricedExceptionCode;
    }

    @JsonProperty("hcp15_repricedExceptionCode")
    public void setHcp15RepricedExceptionCode(String hcp15RepricedExceptionCode) {
        this.hcp15RepricedExceptionCode = hcp15RepricedExceptionCode;
    }

    public SvcLineNo withHcp15RepricedExceptionCode(String hcp15RepricedExceptionCode) {
        this.hcp15RepricedExceptionCode = hcp15RepricedExceptionCode;
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

    public SvcLineNo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lx01AssignedNo).append(sv101CompositeMedicalProcedureIdentifier).append(sv10101ProductServiceIdQlfr).append(sv10102ProcedureCode).append(sv10103ProcedureModifier1).append(sv10104ProcedureModifier2).append(sv10105ProcedureModifier3).append(sv10106ProcedureModifier4).append(sv10107ServiceDescription).append(sv102LineItemChargeAmount).append(sv103UnitForMeasurementCode).append(sv104ServiceUnitCount).append(sv105PlaceOfServiceCode).append(sv107CompositeDiagnosisCodePointer).append(sv10701DiagnosisCodePointer1).append(sv10702DiagnosisCodePointer2).append(sv10703DiagnosisCodePointer3).append(sv10704DiagnosisCodePointer4).append(sv109EmergencyIndicator).append(sv111EpsdtIndicator).append(sv112FamilyPlanningIndicator).append(sv115CoPayStatusCode).append(sv201ServiceLineRevenueCode).append(sv202ServiceLineRevenueCodeProcedureIdentifier).append(sv20201ProductOrServiceIdQlfr).append(sv20202ProcedureCode).append(sv20203ProcedureModifier1).append(sv20204ProcedureModifier2).append(sv20205ProcedureModifier3).append(sv20206ProcedureModifier4).append(sv20207ProcedureDescription).append(sv203LineItemChargeAmount).append(sv204UnitOrBasisForMeasurementCode).append(sv205ServiceUnitCount).append(sv207LineItemDeniedChargeAmount).append(sv301DentalServiceProcedureIdentifier).append(sv30101DentalServiceProductServiceIdQlfr).append(sv30102DentalServiceProcedureCode).append(sv30103DentalServiceProcedureModifier1).append(sv30104DentalServiceProcedureModifier2).append(sv30105DentalServiceProcedureModifier3).append(sv30106DentalServiceProcedureModifier4).append(sv30107DentalServiceDescription).append(sv302LineItemChargeAmount).append(sv303PlaceOfServiceCode).append(sv304OralCavityDesignation).append(sv30401OralCavityDesignation1).append(sv30402OralCavityDesignation2).append(sv30403OralCavityDesignation3).append(sv30404OralCavityDesignation4).append(sv30405OralCavityDesignation5).append(sv305ProsthesisCrownOrInlayCode).append(sv306ProcedureCount).append(sv311DiagnosisCodePointer).append(sv31101DiagnosisCodePointer1).append(sv31102DiagnosisCodePointer2).append(sv31103DiagnosisCodePointer3).append(sv31104DiagnosisCodePointer4).append(sv501CompositeMedicalProcedureIdentifier).append(sv50101ProcedureIdentifier).append(sv50102ProcedureCode).append(sv502BasisForMeasurementCode).append(sv503DaysLengthOfMedicalNecessity).append(sv504DmeRentalPrice).append(sv505DmePurchasePrice).append(sv506RentalUnitPriceIndicator).append(pwkLineSupplementInformation).append(pwk01AttachReportTypeCode).append(pwk02AttachReportTransmissionCode).append(cr101BasisForMeasurementCodePound).append(cr102PatientWeightlbs).append(cr104AmbulanceTransportReasonCode).append(cr105BasisForMeasurementCodeMiles).append(cr106TransportDistanceMiles).append(cr109RoundTripPurposeDescription).append(cr110StretcherPurposeDescription).append(cr301DmeCertificationTypeCode).append(cr302DmeBasisForMeasurementCode).append(cr303DmeDurationMonths).append(crcAmbulanceCertification).append(crc01HospiceEmployedProviderCode).append(crc02HospiceEmployedProviderIndicator).append(crc03HospiceEmployedConditionIndicator).append(crc01DmeConditionIndicatorCode).append(crc02DmeConditionIndicator).append(crc03DmeConditionCode1).append(crc04DmeConditionCode2).append(tooToothInformation).append(dtp01ServiceDateQlfr).append(dtp02ServiceDateFormatQlfr).append(dtp03ServiceDate).append(dtp01PrescriptionDateQlfr).append(dtp02PrescriptionFormatQlfr).append(dtp03PrescriptionDate).append(dtp01CertificationRevisionDateQlfr).append(dtp02CertificationRevisionDateFormatQlfr).append(dtp03CertificationRevisionDate).append(dtp01BeginTherapyDateQlfr).append(dtp02BeginTherapyDateFormatQlfr).append(dtp03BeginTherapyDate).append(dtp01LastCertificateDateQlfr).append(dtp02LastCertificateDateFormatQlfr).append(dtp03LastCertificationDate).append(dtp01LastSeenDateQlfr).append(dtp02LastSeenDateFormatQlfr).append(dtp03LastSeenDate).append(dtpLastTestDate).append(dtp01ShippedDateQlfr).append(dtp02ShippedDateFormatQlfr).append(dtp03ShippedDate).append(dtp01LastXrayDateQlfr).append(dtp02LastXrayDateFormatQlfr).append(dtp03LastXrayDate).append(dtp01PriorPlacementDateQlfr).append(dtp02PriorPlacementDateFormatQlfr).append(dtp03PriorPlacementDate).append(dtp01OrthodonticBandingDateQlfr).append(dtp02OrthodonticBandingDateFormatQlfr).append(dtp03OrthodonticBandingDate).append(dtp01ReplacementDateQlfr).append(dtp02ReplacementDateFormatQlfr).append(dtp03ReplacementDate).append(dtp01TreatmentStartDateQlfr).append(dtp02TreatmentStartDateFormatQlfr).append(dtp03TreatmentStartDate).append(dtp01TreatmentCompletionDateQlfr).append(dtp02TreatmentCompletionFormatQlfr).append(dtp03TreatmentCompletionDate).append(dtp01InitialTreatmentDateQlfr).append(dtp02InitialTreatmentDateFormatQlfr).append(dtp03InitialTreatmentDate).append(qty01AmbulancePatientCountQlfr).append(qty02AmbulancePatientCount).append(qty01ObstetricAdditionalUnitsQlfr).append(qty02ObstetricAdditionalUnits).append(meaTestResult).append(cn101ContractTypeCode).append(cn102ContractAmount).append(cn103ContractPercentage).append(cn104ContractCode).append(cn105ContractTermsDiscountPercent).append(cn106ContractVersionIdentifier).append(ref01RepricedLineItemReferenceNoQlfr).append(ref02RepricedLineItemReferenceNo).append(ref01AdjustedRepricedLineItemReferenceNoQlfr).append(ref02AdjustedRepricedLineItemReferenceNo).append(refPredeterminationOfBenefitsIdentification).append(refPriorAuthorization).append(ref01LineItemControlNoQlfr).append(ref02LineItemControlNo).append(ref01MammographyCertificationNoQlfr).append(ref02MammographyCertificationNo).append(ref01CLIAQlfr).append(ref02CLIANo).append(ref01ReferringCLIANoQlfr).append(ref02ReferringCLIANo).append(ref01ImmunizationBatchNoQlfr).append(ref02ImmunizationBatchNo).append(refReferralNo).append(amt01SalesTaxAmountQlfrCode).append(amt02SalesTaxAmount).append(amt01PostageClaimedAmountQlfrCode).append(amt02PostageClaimedAmount).append(amt01GoodsAndServiceTaxQlfrCode).append(amt02ServiceTaxAmount).append(amt01MiscellaneousQlfrCode).append(amt02FacilityTaxAmount).append(k3fileInformation).append(nte01LineNoteReferenceCode).append(nte02LineNoteText).append(nte01ThirdPartyNoteCode).append(nte02ThirdPartyText).append(ps101PurchasedServiceProviderIdentifier).append(ps102PurchasedServiceChargeAmount).append(hcp01PricingMethodologyCode).append(hcp02RepricedAllowedAmount).append(hcp03RepricedSavingAmount).append(hcp04RepricingOrgIdentifier).append(hcp05RepricingPerDiemFlatRateAmount).append(hcp06RepricedApprovedAmbulatoryPatientGroupCode).append(hcp07RepricedApprovedAmbulatoryPatientGroupAmount).append(hcp09RepricedServiceIdQlfr).append(hcp10RepricedApprovedHCPCSCode).append(hcp11RepricedUnitMeasurementCode).append(hcp12RepricedApprovedServiceUnitCount).append(hcp13RepricedRejectReasonCode).append(hcp14RepricedPolicyComplianceCode).append(hcp15RepricedExceptionCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SvcLineNo) == false) {
            return false;
        }
        SvcLineNo rhs = ((SvcLineNo) other);
        return new EqualsBuilder().append(lx01AssignedNo, rhs.lx01AssignedNo).append(sv101CompositeMedicalProcedureIdentifier, rhs.sv101CompositeMedicalProcedureIdentifier).append(sv10101ProductServiceIdQlfr, rhs.sv10101ProductServiceIdQlfr).append(sv10102ProcedureCode, rhs.sv10102ProcedureCode).append(sv10103ProcedureModifier1, rhs.sv10103ProcedureModifier1).append(sv10104ProcedureModifier2, rhs.sv10104ProcedureModifier2).append(sv10105ProcedureModifier3, rhs.sv10105ProcedureModifier3).append(sv10106ProcedureModifier4, rhs.sv10106ProcedureModifier4).append(sv10107ServiceDescription, rhs.sv10107ServiceDescription).append(sv102LineItemChargeAmount, rhs.sv102LineItemChargeAmount).append(sv103UnitForMeasurementCode, rhs.sv103UnitForMeasurementCode).append(sv104ServiceUnitCount, rhs.sv104ServiceUnitCount).append(sv105PlaceOfServiceCode, rhs.sv105PlaceOfServiceCode).append(sv107CompositeDiagnosisCodePointer, rhs.sv107CompositeDiagnosisCodePointer).append(sv10701DiagnosisCodePointer1, rhs.sv10701DiagnosisCodePointer1).append(sv10702DiagnosisCodePointer2, rhs.sv10702DiagnosisCodePointer2).append(sv10703DiagnosisCodePointer3, rhs.sv10703DiagnosisCodePointer3).append(sv10704DiagnosisCodePointer4, rhs.sv10704DiagnosisCodePointer4).append(sv109EmergencyIndicator, rhs.sv109EmergencyIndicator).append(sv111EpsdtIndicator, rhs.sv111EpsdtIndicator).append(sv112FamilyPlanningIndicator, rhs.sv112FamilyPlanningIndicator).append(sv115CoPayStatusCode, rhs.sv115CoPayStatusCode).append(sv201ServiceLineRevenueCode, rhs.sv201ServiceLineRevenueCode).append(sv202ServiceLineRevenueCodeProcedureIdentifier, rhs.sv202ServiceLineRevenueCodeProcedureIdentifier).append(sv20201ProductOrServiceIdQlfr, rhs.sv20201ProductOrServiceIdQlfr).append(sv20202ProcedureCode, rhs.sv20202ProcedureCode).append(sv20203ProcedureModifier1, rhs.sv20203ProcedureModifier1).append(sv20204ProcedureModifier2, rhs.sv20204ProcedureModifier2).append(sv20205ProcedureModifier3, rhs.sv20205ProcedureModifier3).append(sv20206ProcedureModifier4, rhs.sv20206ProcedureModifier4).append(sv20207ProcedureDescription, rhs.sv20207ProcedureDescription).append(sv203LineItemChargeAmount, rhs.sv203LineItemChargeAmount).append(sv204UnitOrBasisForMeasurementCode, rhs.sv204UnitOrBasisForMeasurementCode).append(sv205ServiceUnitCount, rhs.sv205ServiceUnitCount).append(sv207LineItemDeniedChargeAmount, rhs.sv207LineItemDeniedChargeAmount).append(sv301DentalServiceProcedureIdentifier, rhs.sv301DentalServiceProcedureIdentifier).append(sv30101DentalServiceProductServiceIdQlfr, rhs.sv30101DentalServiceProductServiceIdQlfr).append(sv30102DentalServiceProcedureCode, rhs.sv30102DentalServiceProcedureCode).append(sv30103DentalServiceProcedureModifier1, rhs.sv30103DentalServiceProcedureModifier1).append(sv30104DentalServiceProcedureModifier2, rhs.sv30104DentalServiceProcedureModifier2).append(sv30105DentalServiceProcedureModifier3, rhs.sv30105DentalServiceProcedureModifier3).append(sv30106DentalServiceProcedureModifier4, rhs.sv30106DentalServiceProcedureModifier4).append(sv30107DentalServiceDescription, rhs.sv30107DentalServiceDescription).append(sv302LineItemChargeAmount, rhs.sv302LineItemChargeAmount).append(sv303PlaceOfServiceCode, rhs.sv303PlaceOfServiceCode).append(sv304OralCavityDesignation, rhs.sv304OralCavityDesignation).append(sv30401OralCavityDesignation1, rhs.sv30401OralCavityDesignation1).append(sv30402OralCavityDesignation2, rhs.sv30402OralCavityDesignation2).append(sv30403OralCavityDesignation3, rhs.sv30403OralCavityDesignation3).append(sv30404OralCavityDesignation4, rhs.sv30404OralCavityDesignation4).append(sv30405OralCavityDesignation5, rhs.sv30405OralCavityDesignation5).append(sv305ProsthesisCrownOrInlayCode, rhs.sv305ProsthesisCrownOrInlayCode).append(sv306ProcedureCount, rhs.sv306ProcedureCount).append(sv311DiagnosisCodePointer, rhs.sv311DiagnosisCodePointer).append(sv31101DiagnosisCodePointer1, rhs.sv31101DiagnosisCodePointer1).append(sv31102DiagnosisCodePointer2, rhs.sv31102DiagnosisCodePointer2).append(sv31103DiagnosisCodePointer3, rhs.sv31103DiagnosisCodePointer3).append(sv31104DiagnosisCodePointer4, rhs.sv31104DiagnosisCodePointer4).append(sv501CompositeMedicalProcedureIdentifier, rhs.sv501CompositeMedicalProcedureIdentifier).append(sv50101ProcedureIdentifier, rhs.sv50101ProcedureIdentifier).append(sv50102ProcedureCode, rhs.sv50102ProcedureCode).append(sv502BasisForMeasurementCode, rhs.sv502BasisForMeasurementCode).append(sv503DaysLengthOfMedicalNecessity, rhs.sv503DaysLengthOfMedicalNecessity).append(sv504DmeRentalPrice, rhs.sv504DmeRentalPrice).append(sv505DmePurchasePrice, rhs.sv505DmePurchasePrice).append(sv506RentalUnitPriceIndicator, rhs.sv506RentalUnitPriceIndicator).append(pwkLineSupplementInformation, rhs.pwkLineSupplementInformation).append(pwk01AttachReportTypeCode, rhs.pwk01AttachReportTypeCode).append(pwk02AttachReportTransmissionCode, rhs.pwk02AttachReportTransmissionCode).append(cr101BasisForMeasurementCodePound, rhs.cr101BasisForMeasurementCodePound).append(cr102PatientWeightlbs, rhs.cr102PatientWeightlbs).append(cr104AmbulanceTransportReasonCode, rhs.cr104AmbulanceTransportReasonCode).append(cr105BasisForMeasurementCodeMiles, rhs.cr105BasisForMeasurementCodeMiles).append(cr106TransportDistanceMiles, rhs.cr106TransportDistanceMiles).append(cr109RoundTripPurposeDescription, rhs.cr109RoundTripPurposeDescription).append(cr110StretcherPurposeDescription, rhs.cr110StretcherPurposeDescription).append(cr301DmeCertificationTypeCode, rhs.cr301DmeCertificationTypeCode).append(cr302DmeBasisForMeasurementCode, rhs.cr302DmeBasisForMeasurementCode).append(cr303DmeDurationMonths, rhs.cr303DmeDurationMonths).append(crcAmbulanceCertification, rhs.crcAmbulanceCertification).append(crc01HospiceEmployedProviderCode, rhs.crc01HospiceEmployedProviderCode).append(crc02HospiceEmployedProviderIndicator, rhs.crc02HospiceEmployedProviderIndicator).append(crc03HospiceEmployedConditionIndicator, rhs.crc03HospiceEmployedConditionIndicator).append(crc01DmeConditionIndicatorCode, rhs.crc01DmeConditionIndicatorCode).append(crc02DmeConditionIndicator, rhs.crc02DmeConditionIndicator).append(crc03DmeConditionCode1, rhs.crc03DmeConditionCode1).append(crc04DmeConditionCode2, rhs.crc04DmeConditionCode2).append(tooToothInformation, rhs.tooToothInformation).append(dtp01ServiceDateQlfr, rhs.dtp01ServiceDateQlfr).append(dtp02ServiceDateFormatQlfr, rhs.dtp02ServiceDateFormatQlfr).append(dtp03ServiceDate, rhs.dtp03ServiceDate).append(dtp01PrescriptionDateQlfr, rhs.dtp01PrescriptionDateQlfr).append(dtp02PrescriptionFormatQlfr, rhs.dtp02PrescriptionFormatQlfr).append(dtp03PrescriptionDate, rhs.dtp03PrescriptionDate).append(dtp01CertificationRevisionDateQlfr, rhs.dtp01CertificationRevisionDateQlfr).append(dtp02CertificationRevisionDateFormatQlfr, rhs.dtp02CertificationRevisionDateFormatQlfr).append(dtp03CertificationRevisionDate, rhs.dtp03CertificationRevisionDate).append(dtp01BeginTherapyDateQlfr, rhs.dtp01BeginTherapyDateQlfr).append(dtp02BeginTherapyDateFormatQlfr, rhs.dtp02BeginTherapyDateFormatQlfr).append(dtp03BeginTherapyDate, rhs.dtp03BeginTherapyDate).append(dtp01LastCertificateDateQlfr, rhs.dtp01LastCertificateDateQlfr).append(dtp02LastCertificateDateFormatQlfr, rhs.dtp02LastCertificateDateFormatQlfr).append(dtp03LastCertificationDate, rhs.dtp03LastCertificationDate).append(dtp01LastSeenDateQlfr, rhs.dtp01LastSeenDateQlfr).append(dtp02LastSeenDateFormatQlfr, rhs.dtp02LastSeenDateFormatQlfr).append(dtp03LastSeenDate, rhs.dtp03LastSeenDate).append(dtpLastTestDate, rhs.dtpLastTestDate).append(dtp01ShippedDateQlfr, rhs.dtp01ShippedDateQlfr).append(dtp02ShippedDateFormatQlfr, rhs.dtp02ShippedDateFormatQlfr).append(dtp03ShippedDate, rhs.dtp03ShippedDate).append(dtp01LastXrayDateQlfr, rhs.dtp01LastXrayDateQlfr).append(dtp02LastXrayDateFormatQlfr, rhs.dtp02LastXrayDateFormatQlfr).append(dtp03LastXrayDate, rhs.dtp03LastXrayDate).append(dtp01PriorPlacementDateQlfr, rhs.dtp01PriorPlacementDateQlfr).append(dtp02PriorPlacementDateFormatQlfr, rhs.dtp02PriorPlacementDateFormatQlfr).append(dtp03PriorPlacementDate, rhs.dtp03PriorPlacementDate).append(dtp01OrthodonticBandingDateQlfr, rhs.dtp01OrthodonticBandingDateQlfr).append(dtp02OrthodonticBandingDateFormatQlfr, rhs.dtp02OrthodonticBandingDateFormatQlfr).append(dtp03OrthodonticBandingDate, rhs.dtp03OrthodonticBandingDate).append(dtp01ReplacementDateQlfr, rhs.dtp01ReplacementDateQlfr).append(dtp02ReplacementDateFormatQlfr, rhs.dtp02ReplacementDateFormatQlfr).append(dtp03ReplacementDate, rhs.dtp03ReplacementDate).append(dtp01TreatmentStartDateQlfr, rhs.dtp01TreatmentStartDateQlfr).append(dtp02TreatmentStartDateFormatQlfr, rhs.dtp02TreatmentStartDateFormatQlfr).append(dtp03TreatmentStartDate, rhs.dtp03TreatmentStartDate).append(dtp01TreatmentCompletionDateQlfr, rhs.dtp01TreatmentCompletionDateQlfr).append(dtp02TreatmentCompletionFormatQlfr, rhs.dtp02TreatmentCompletionFormatQlfr).append(dtp03TreatmentCompletionDate, rhs.dtp03TreatmentCompletionDate).append(dtp01InitialTreatmentDateQlfr, rhs.dtp01InitialTreatmentDateQlfr).append(dtp02InitialTreatmentDateFormatQlfr, rhs.dtp02InitialTreatmentDateFormatQlfr).append(dtp03InitialTreatmentDate, rhs.dtp03InitialTreatmentDate).append(qty01AmbulancePatientCountQlfr, rhs.qty01AmbulancePatientCountQlfr).append(qty02AmbulancePatientCount, rhs.qty02AmbulancePatientCount).append(qty01ObstetricAdditionalUnitsQlfr, rhs.qty01ObstetricAdditionalUnitsQlfr).append(qty02ObstetricAdditionalUnits, rhs.qty02ObstetricAdditionalUnits).append(meaTestResult, rhs.meaTestResult).append(cn101ContractTypeCode, rhs.cn101ContractTypeCode).append(cn102ContractAmount, rhs.cn102ContractAmount).append(cn103ContractPercentage, rhs.cn103ContractPercentage).append(cn104ContractCode, rhs.cn104ContractCode).append(cn105ContractTermsDiscountPercent, rhs.cn105ContractTermsDiscountPercent).append(cn106ContractVersionIdentifier, rhs.cn106ContractVersionIdentifier).append(ref01RepricedLineItemReferenceNoQlfr, rhs.ref01RepricedLineItemReferenceNoQlfr).append(ref02RepricedLineItemReferenceNo, rhs.ref02RepricedLineItemReferenceNo).append(ref01AdjustedRepricedLineItemReferenceNoQlfr, rhs.ref01AdjustedRepricedLineItemReferenceNoQlfr).append(ref02AdjustedRepricedLineItemReferenceNo, rhs.ref02AdjustedRepricedLineItemReferenceNo).append(refPredeterminationOfBenefitsIdentification, rhs.refPredeterminationOfBenefitsIdentification).append(refPriorAuthorization, rhs.refPriorAuthorization).append(ref01LineItemControlNoQlfr, rhs.ref01LineItemControlNoQlfr).append(ref02LineItemControlNo, rhs.ref02LineItemControlNo).append(ref01MammographyCertificationNoQlfr, rhs.ref01MammographyCertificationNoQlfr).append(ref02MammographyCertificationNo, rhs.ref02MammographyCertificationNo).append(ref01CLIAQlfr, rhs.ref01CLIAQlfr).append(ref02CLIANo, rhs.ref02CLIANo).append(ref01ReferringCLIANoQlfr, rhs.ref01ReferringCLIANoQlfr).append(ref02ReferringCLIANo, rhs.ref02ReferringCLIANo).append(ref01ImmunizationBatchNoQlfr, rhs.ref01ImmunizationBatchNoQlfr).append(ref02ImmunizationBatchNo, rhs.ref02ImmunizationBatchNo).append(refReferralNo, rhs.refReferralNo).append(amt01SalesTaxAmountQlfrCode, rhs.amt01SalesTaxAmountQlfrCode).append(amt02SalesTaxAmount, rhs.amt02SalesTaxAmount).append(amt01PostageClaimedAmountQlfrCode, rhs.amt01PostageClaimedAmountQlfrCode).append(amt02PostageClaimedAmount, rhs.amt02PostageClaimedAmount).append(amt01GoodsAndServiceTaxQlfrCode, rhs.amt01GoodsAndServiceTaxQlfrCode).append(amt02ServiceTaxAmount, rhs.amt02ServiceTaxAmount).append(amt01MiscellaneousQlfrCode, rhs.amt01MiscellaneousQlfrCode).append(amt02FacilityTaxAmount, rhs.amt02FacilityTaxAmount).append(k3fileInformation, rhs.k3fileInformation).append(nte01LineNoteReferenceCode, rhs.nte01LineNoteReferenceCode).append(nte02LineNoteText, rhs.nte02LineNoteText).append(nte01ThirdPartyNoteCode, rhs.nte01ThirdPartyNoteCode).append(nte02ThirdPartyText, rhs.nte02ThirdPartyText).append(ps101PurchasedServiceProviderIdentifier, rhs.ps101PurchasedServiceProviderIdentifier).append(ps102PurchasedServiceChargeAmount, rhs.ps102PurchasedServiceChargeAmount).append(hcp01PricingMethodologyCode, rhs.hcp01PricingMethodologyCode).append(hcp02RepricedAllowedAmount, rhs.hcp02RepricedAllowedAmount).append(hcp03RepricedSavingAmount, rhs.hcp03RepricedSavingAmount).append(hcp04RepricingOrgIdentifier, rhs.hcp04RepricingOrgIdentifier).append(hcp05RepricingPerDiemFlatRateAmount, rhs.hcp05RepricingPerDiemFlatRateAmount).append(hcp06RepricedApprovedAmbulatoryPatientGroupCode, rhs.hcp06RepricedApprovedAmbulatoryPatientGroupCode).append(hcp07RepricedApprovedAmbulatoryPatientGroupAmount, rhs.hcp07RepricedApprovedAmbulatoryPatientGroupAmount).append(hcp09RepricedServiceIdQlfr, rhs.hcp09RepricedServiceIdQlfr).append(hcp10RepricedApprovedHCPCSCode, rhs.hcp10RepricedApprovedHCPCSCode).append(hcp11RepricedUnitMeasurementCode, rhs.hcp11RepricedUnitMeasurementCode).append(hcp12RepricedApprovedServiceUnitCount, rhs.hcp12RepricedApprovedServiceUnitCount).append(hcp13RepricedRejectReasonCode, rhs.hcp13RepricedRejectReasonCode).append(hcp14RepricedPolicyComplianceCode, rhs.hcp14RepricedPolicyComplianceCode).append(hcp15RepricedExceptionCode, rhs.hcp15RepricedExceptionCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

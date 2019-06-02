
package com.test;

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
    "claim_id",
    "intake_date",
    "create_date",
    "update_date",
    "muedsmst_clnt_clm_nbr",
    "muedsmst_clm_line_nbr",
    "muedsmst_clm_type",
    "muedsmst_ss",
    "muedsmst_dme_ind",
    "muedsmst_ecn_ind",
    "muedsmst_pend_ind",
    "muedsmst_cap_ind",
    "muedsmst_paper_ind",
    "muedsmst_coresp_ind",
    "muedsmst_npi_ind",
    "muedsmst_chr_rev_ind",
    "muedsmst_supbill_ind",
    "muedsmst_cor_ind",
    "muedsmst_den_ind",
    "muedsmst_intbl_ind",
    "muedsmst_rvs_ind",
    "muedsmst_mbr_mcare_id",
    "muedsmst_cas_provider_nbr",
    "muedsmst_cas_prov_mcare_id",
    "muedsmst_pcp_nbr",
    "muedsmst_par_nonpar_ind",
    "muedsmst_cas_prov_type",
    "muedsmst_ecn",
    "muedsmst_fst_dt_cymd",
    "muedsmst_lst_dt_cymd",
    "muedsmst_proc_dt_cymd",
    "muedsmst_proc_time",
    "muedsmst_extrct_dt_cymd",
    "muedsmst_cpt_cd",
    "muedsmst_contract_id",
    "muedsmst_mbr_first_name",
    "muedsmst_mbr_last_name",
    "muedsmst_gender_cd",
    "muedsmst_mbr_birth_date_cymd",
    "muedsmst_trsmt_cd",
    "muedsmst_cust_nbr",
    "muedsmst_grouper_nbr",
    "muedsmst_sold_ledger_nbr",
    "muedsmst_bill_type",
    "muedsmst_payee",
    "muedsmst_pot",
    "muedsmst_umid",
    "muedsmst_prov_npi",
    "muedsmst_current_status_dt",
    "muedsmst_current_status",
    "muedsmst_diag_cd_1",
    "muedsmst_diag_cd_2",
    "muedsmst_diag_cd_3",
    "muedsmst_diag_cd_4",
    "muedsmst_diag_cd_5",
    "muedsmst_diag_cd_6",
    "muedsmst_diag_cd_7",
    "muedsmst_diag_cd_8",
    "muedsmst_diag_cd_9",
    "muedsmst_type_mod",
    "muedsmst_src_entry_cd",
    "muedsmst_sent_seq_nbr",
    "muedsmst_acp_seq_nbr",
    "muedsmst_rej_seq_nbr",
    "muedsmst_adj_cd",
    "muedsmst_rep_cat",
    "muedsmst_batch_id",
    "muedsmst_tm_status",
    "muedsmst_cms_status",
    "muedsmst_prov_spec",
    "muedsmst_year",
    "muedsmst_icd10_ind",
    "muedsmst_void_seq_nbr",
    "filler"
})
public class Sample {

    @JsonProperty("claim_id")
    private Integer claimId;
    @JsonProperty("intake_date")
    private String intakeDate;
    @JsonProperty("create_date")
    private String createDate;
    @JsonProperty("update_date")
    private String updateDate;
    @JsonProperty("muedsmst_clnt_clm_nbr")
    private String muedsmstClntClmNbr;
    @JsonProperty("muedsmst_clm_line_nbr")
    private Integer muedsmstClmLineNbr;
    @JsonProperty("muedsmst_clm_type")
    private String muedsmstClmType;
    @JsonProperty("muedsmst_ss")
    private Integer muedsmstSs;
    @JsonProperty("muedsmst_dme_ind")
    private String muedsmstDmeInd;
    @JsonProperty("muedsmst_ecn_ind")
    private String muedsmstEcnInd;
    @JsonProperty("muedsmst_pend_ind")
    private String muedsmstPendInd;
    @JsonProperty("muedsmst_cap_ind")
    private String muedsmstCapInd;
    @JsonProperty("muedsmst_paper_ind")
    private String muedsmstPaperInd;
    @JsonProperty("muedsmst_coresp_ind")
    private String muedsmstCorespInd;
    @JsonProperty("muedsmst_npi_ind")
    private String muedsmstNpiInd;
    @JsonProperty("muedsmst_chr_rev_ind")
    private String muedsmstChrRevInd;
    @JsonProperty("muedsmst_supbill_ind")
    private String muedsmstSupbillInd;
    @JsonProperty("muedsmst_cor_ind")
    private String muedsmstCorInd;
    @JsonProperty("muedsmst_den_ind")
    private String muedsmstDenInd;
    @JsonProperty("muedsmst_intbl_ind")
    private String muedsmstIntblInd;
    @JsonProperty("muedsmst_rvs_ind")
    private String muedsmstRvsInd;
    @JsonProperty("muedsmst_mbr_mcare_id")
    private String muedsmstMbrMcareId;
    @JsonProperty("muedsmst_cas_provider_nbr")
    private String muedsmstCasProviderNbr;
    @JsonProperty("muedsmst_cas_prov_mcare_id")
    private String muedsmstCasProvMcareId;
    @JsonProperty("muedsmst_pcp_nbr")
    private String muedsmstPcpNbr;
    @JsonProperty("muedsmst_par_nonpar_ind")
    private String muedsmstParNonparInd;
    @JsonProperty("muedsmst_cas_prov_type")
    private String muedsmstCasProvType;
    @JsonProperty("muedsmst_ecn")
    private String muedsmstEcn;
    @JsonProperty("muedsmst_fst_dt_cymd")
    private String muedsmstFstDtCymd;
    @JsonProperty("muedsmst_lst_dt_cymd")
    private String muedsmstLstDtCymd;
    @JsonProperty("muedsmst_proc_dt_cymd")
    private String muedsmstProcDtCymd;
    @JsonProperty("muedsmst_proc_time")
    private Integer muedsmstProcTime;
    @JsonProperty("muedsmst_extrct_dt_cymd")
    private String muedsmstExtrctDtCymd;
    @JsonProperty("muedsmst_cpt_cd")
    private String muedsmstCptCd;
    @JsonProperty("muedsmst_contract_id")
    private String muedsmstContractId;
    @JsonProperty("muedsmst_mbr_first_name")
    private String muedsmstMbrFirstName;
    @JsonProperty("muedsmst_mbr_last_name")
    private String muedsmstMbrLastName;
    @JsonProperty("muedsmst_gender_cd")
    private String muedsmstGenderCd;
    @JsonProperty("muedsmst_mbr_birth_date_cymd")
    private String muedsmstMbrBirthDateCymd;
    @JsonProperty("muedsmst_trsmt_cd")
    private String muedsmstTrsmtCd;
    @JsonProperty("muedsmst_cust_nbr")
    private String muedsmstCustNbr;
    @JsonProperty("muedsmst_grouper_nbr")
    private Integer muedsmstGrouperNbr;
    @JsonProperty("muedsmst_sold_ledger_nbr")
    private Integer muedsmstSoldLedgerNbr;
    @JsonProperty("muedsmst_bill_type")
    private String muedsmstBillType;
    @JsonProperty("muedsmst_payee")
    private String muedsmstPayee;
    @JsonProperty("muedsmst_pot")
    private String muedsmstPot;
    @JsonProperty("muedsmst_umid")
    private String muedsmstUmid;
    @JsonProperty("muedsmst_prov_npi")
    private String muedsmstProvNpi;
    @JsonProperty("muedsmst_current_status_dt")
    private String muedsmstCurrentStatusDt;
    @JsonProperty("muedsmst_current_status")
    private String muedsmstCurrentStatus;
    @JsonProperty("muedsmst_diag_cd_1")
    private String muedsmstDiagCd1;
    @JsonProperty("muedsmst_diag_cd_2")
    private String muedsmstDiagCd2;
    @JsonProperty("muedsmst_diag_cd_3")
    private String muedsmstDiagCd3;
    @JsonProperty("muedsmst_diag_cd_4")
    private String muedsmstDiagCd4;
    @JsonProperty("muedsmst_diag_cd_5")
    private String muedsmstDiagCd5;
    @JsonProperty("muedsmst_diag_cd_6")
    private String muedsmstDiagCd6;
    @JsonProperty("muedsmst_diag_cd_7")
    private String muedsmstDiagCd7;
    @JsonProperty("muedsmst_diag_cd_8")
    private String muedsmstDiagCd8;
    @JsonProperty("muedsmst_diag_cd_9")
    private String muedsmstDiagCd9;
    @JsonProperty("muedsmst_type_mod")
    private String muedsmstTypeMod;
    @JsonProperty("muedsmst_src_entry_cd")
    private String muedsmstSrcEntryCd;
    @JsonProperty("muedsmst_sent_seq_nbr")
    private String muedsmstSentSeqNbr;
    @JsonProperty("muedsmst_acp_seq_nbr")
    private Integer muedsmstAcpSeqNbr;
    @JsonProperty("muedsmst_rej_seq_nbr")
    private Integer muedsmstRejSeqNbr;
    @JsonProperty("muedsmst_adj_cd")
    private String muedsmstAdjCd;
    @JsonProperty("muedsmst_rep_cat")
    private String muedsmstRepCat;
    @JsonProperty("muedsmst_batch_id")
    private String muedsmstBatchId;
    @JsonProperty("muedsmst_tm_status")
    private String muedsmstTmStatus;
    @JsonProperty("muedsmst_cms_status")
    private String muedsmstCmsStatus;
    @JsonProperty("muedsmst_prov_spec")
    private String muedsmstProvSpec;
    @JsonProperty("muedsmst_year")
    private String muedsmstYear;
    @JsonProperty("muedsmst_icd10_ind")
    private String muedsmstIcd10Ind;
    @JsonProperty("muedsmst_void_seq_nbr")
    private Integer muedsmstVoidSeqNbr;
    @JsonProperty("filler")
    private String filler;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("claim_id")
    public Integer getClaimId() {
        return claimId;
    }

    @JsonProperty("claim_id")
    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public Sample withClaimId(Integer claimId) {
        this.claimId = claimId;
        return this;
    }

    @JsonProperty("intake_date")
    public String getIntakeDate() {
        return intakeDate;
    }

    @JsonProperty("intake_date")
    public void setIntakeDate(String intakeDate) {
        this.intakeDate = intakeDate;
    }

    public Sample withIntakeDate(String intakeDate) {
        this.intakeDate = intakeDate;
        return this;
    }

    @JsonProperty("create_date")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("create_date")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Sample withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    @JsonProperty("update_date")
    public String getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("update_date")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Sample withUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    @JsonProperty("muedsmst_clnt_clm_nbr")
    public String getMuedsmstClntClmNbr() {
        return muedsmstClntClmNbr;
    }

    @JsonProperty("muedsmst_clnt_clm_nbr")
    public void setMuedsmstClntClmNbr(String muedsmstClntClmNbr) {
        this.muedsmstClntClmNbr = muedsmstClntClmNbr;
    }

    public Sample withMuedsmstClntClmNbr(String muedsmstClntClmNbr) {
        this.muedsmstClntClmNbr = muedsmstClntClmNbr;
        return this;
    }

    @JsonProperty("muedsmst_clm_line_nbr")
    public Integer getMuedsmstClmLineNbr() {
        return muedsmstClmLineNbr;
    }

    @JsonProperty("muedsmst_clm_line_nbr")
    public void setMuedsmstClmLineNbr(Integer muedsmstClmLineNbr) {
        this.muedsmstClmLineNbr = muedsmstClmLineNbr;
    }

    public Sample withMuedsmstClmLineNbr(Integer muedsmstClmLineNbr) {
        this.muedsmstClmLineNbr = muedsmstClmLineNbr;
        return this;
    }

    @JsonProperty("muedsmst_clm_type")
    public String getMuedsmstClmType() {
        return muedsmstClmType;
    }

    @JsonProperty("muedsmst_clm_type")
    public void setMuedsmstClmType(String muedsmstClmType) {
        this.muedsmstClmType = muedsmstClmType;
    }

    public Sample withMuedsmstClmType(String muedsmstClmType) {
        this.muedsmstClmType = muedsmstClmType;
        return this;
    }

    @JsonProperty("muedsmst_ss")
    public Integer getMuedsmstSs() {
        return muedsmstSs;
    }

    @JsonProperty("muedsmst_ss")
    public void setMuedsmstSs(Integer muedsmstSs) {
        this.muedsmstSs = muedsmstSs;
    }

    public Sample withMuedsmstSs(Integer muedsmstSs) {
        this.muedsmstSs = muedsmstSs;
        return this;
    }

    @JsonProperty("muedsmst_dme_ind")
    public String getMuedsmstDmeInd() {
        return muedsmstDmeInd;
    }

    @JsonProperty("muedsmst_dme_ind")
    public void setMuedsmstDmeInd(String muedsmstDmeInd) {
        this.muedsmstDmeInd = muedsmstDmeInd;
    }

    public Sample withMuedsmstDmeInd(String muedsmstDmeInd) {
        this.muedsmstDmeInd = muedsmstDmeInd;
        return this;
    }

    @JsonProperty("muedsmst_ecn_ind")
    public String getMuedsmstEcnInd() {
        return muedsmstEcnInd;
    }

    @JsonProperty("muedsmst_ecn_ind")
    public void setMuedsmstEcnInd(String muedsmstEcnInd) {
        this.muedsmstEcnInd = muedsmstEcnInd;
    }

    public Sample withMuedsmstEcnInd(String muedsmstEcnInd) {
        this.muedsmstEcnInd = muedsmstEcnInd;
        return this;
    }

    @JsonProperty("muedsmst_pend_ind")
    public String getMuedsmstPendInd() {
        return muedsmstPendInd;
    }

    @JsonProperty("muedsmst_pend_ind")
    public void setMuedsmstPendInd(String muedsmstPendInd) {
        this.muedsmstPendInd = muedsmstPendInd;
    }

    public Sample withMuedsmstPendInd(String muedsmstPendInd) {
        this.muedsmstPendInd = muedsmstPendInd;
        return this;
    }

    @JsonProperty("muedsmst_cap_ind")
    public String getMuedsmstCapInd() {
        return muedsmstCapInd;
    }

    @JsonProperty("muedsmst_cap_ind")
    public void setMuedsmstCapInd(String muedsmstCapInd) {
        this.muedsmstCapInd = muedsmstCapInd;
    }

    public Sample withMuedsmstCapInd(String muedsmstCapInd) {
        this.muedsmstCapInd = muedsmstCapInd;
        return this;
    }

    @JsonProperty("muedsmst_paper_ind")
    public String getMuedsmstPaperInd() {
        return muedsmstPaperInd;
    }

    @JsonProperty("muedsmst_paper_ind")
    public void setMuedsmstPaperInd(String muedsmstPaperInd) {
        this.muedsmstPaperInd = muedsmstPaperInd;
    }

    public Sample withMuedsmstPaperInd(String muedsmstPaperInd) {
        this.muedsmstPaperInd = muedsmstPaperInd;
        return this;
    }

    @JsonProperty("muedsmst_coresp_ind")
    public String getMuedsmstCorespInd() {
        return muedsmstCorespInd;
    }

    @JsonProperty("muedsmst_coresp_ind")
    public void setMuedsmstCorespInd(String muedsmstCorespInd) {
        this.muedsmstCorespInd = muedsmstCorespInd;
    }

    public Sample withMuedsmstCorespInd(String muedsmstCorespInd) {
        this.muedsmstCorespInd = muedsmstCorespInd;
        return this;
    }

    @JsonProperty("muedsmst_npi_ind")
    public String getMuedsmstNpiInd() {
        return muedsmstNpiInd;
    }

    @JsonProperty("muedsmst_npi_ind")
    public void setMuedsmstNpiInd(String muedsmstNpiInd) {
        this.muedsmstNpiInd = muedsmstNpiInd;
    }

    public Sample withMuedsmstNpiInd(String muedsmstNpiInd) {
        this.muedsmstNpiInd = muedsmstNpiInd;
        return this;
    }

    @JsonProperty("muedsmst_chr_rev_ind")
    public String getMuedsmstChrRevInd() {
        return muedsmstChrRevInd;
    }

    @JsonProperty("muedsmst_chr_rev_ind")
    public void setMuedsmstChrRevInd(String muedsmstChrRevInd) {
        this.muedsmstChrRevInd = muedsmstChrRevInd;
    }

    public Sample withMuedsmstChrRevInd(String muedsmstChrRevInd) {
        this.muedsmstChrRevInd = muedsmstChrRevInd;
        return this;
    }

    @JsonProperty("muedsmst_supbill_ind")
    public String getMuedsmstSupbillInd() {
        return muedsmstSupbillInd;
    }

    @JsonProperty("muedsmst_supbill_ind")
    public void setMuedsmstSupbillInd(String muedsmstSupbillInd) {
        this.muedsmstSupbillInd = muedsmstSupbillInd;
    }

    public Sample withMuedsmstSupbillInd(String muedsmstSupbillInd) {
        this.muedsmstSupbillInd = muedsmstSupbillInd;
        return this;
    }

    @JsonProperty("muedsmst_cor_ind")
    public String getMuedsmstCorInd() {
        return muedsmstCorInd;
    }

    @JsonProperty("muedsmst_cor_ind")
    public void setMuedsmstCorInd(String muedsmstCorInd) {
        this.muedsmstCorInd = muedsmstCorInd;
    }

    public Sample withMuedsmstCorInd(String muedsmstCorInd) {
        this.muedsmstCorInd = muedsmstCorInd;
        return this;
    }

    @JsonProperty("muedsmst_den_ind")
    public String getMuedsmstDenInd() {
        return muedsmstDenInd;
    }

    @JsonProperty("muedsmst_den_ind")
    public void setMuedsmstDenInd(String muedsmstDenInd) {
        this.muedsmstDenInd = muedsmstDenInd;
    }

    public Sample withMuedsmstDenInd(String muedsmstDenInd) {
        this.muedsmstDenInd = muedsmstDenInd;
        return this;
    }

    @JsonProperty("muedsmst_intbl_ind")
    public String getMuedsmstIntblInd() {
        return muedsmstIntblInd;
    }

    @JsonProperty("muedsmst_intbl_ind")
    public void setMuedsmstIntblInd(String muedsmstIntblInd) {
        this.muedsmstIntblInd = muedsmstIntblInd;
    }

    public Sample withMuedsmstIntblInd(String muedsmstIntblInd) {
        this.muedsmstIntblInd = muedsmstIntblInd;
        return this;
    }

    @JsonProperty("muedsmst_rvs_ind")
    public String getMuedsmstRvsInd() {
        return muedsmstRvsInd;
    }

    @JsonProperty("muedsmst_rvs_ind")
    public void setMuedsmstRvsInd(String muedsmstRvsInd) {
        this.muedsmstRvsInd = muedsmstRvsInd;
    }

    public Sample withMuedsmstRvsInd(String muedsmstRvsInd) {
        this.muedsmstRvsInd = muedsmstRvsInd;
        return this;
    }

    @JsonProperty("muedsmst_mbr_mcare_id")
    public String getMuedsmstMbrMcareId() {
        return muedsmstMbrMcareId;
    }

    @JsonProperty("muedsmst_mbr_mcare_id")
    public void setMuedsmstMbrMcareId(String muedsmstMbrMcareId) {
        this.muedsmstMbrMcareId = muedsmstMbrMcareId;
    }

    public Sample withMuedsmstMbrMcareId(String muedsmstMbrMcareId) {
        this.muedsmstMbrMcareId = muedsmstMbrMcareId;
        return this;
    }

    @JsonProperty("muedsmst_cas_provider_nbr")
    public String getMuedsmstCasProviderNbr() {
        return muedsmstCasProviderNbr;
    }

    @JsonProperty("muedsmst_cas_provider_nbr")
    public void setMuedsmstCasProviderNbr(String muedsmstCasProviderNbr) {
        this.muedsmstCasProviderNbr = muedsmstCasProviderNbr;
    }

    public Sample withMuedsmstCasProviderNbr(String muedsmstCasProviderNbr) {
        this.muedsmstCasProviderNbr = muedsmstCasProviderNbr;
        return this;
    }

    @JsonProperty("muedsmst_cas_prov_mcare_id")
    public String getMuedsmstCasProvMcareId() {
        return muedsmstCasProvMcareId;
    }

    @JsonProperty("muedsmst_cas_prov_mcare_id")
    public void setMuedsmstCasProvMcareId(String muedsmstCasProvMcareId) {
        this.muedsmstCasProvMcareId = muedsmstCasProvMcareId;
    }

    public Sample withMuedsmstCasProvMcareId(String muedsmstCasProvMcareId) {
        this.muedsmstCasProvMcareId = muedsmstCasProvMcareId;
        return this;
    }

    @JsonProperty("muedsmst_pcp_nbr")
    public String getMuedsmstPcpNbr() {
        return muedsmstPcpNbr;
    }

    @JsonProperty("muedsmst_pcp_nbr")
    public void setMuedsmstPcpNbr(String muedsmstPcpNbr) {
        this.muedsmstPcpNbr = muedsmstPcpNbr;
    }

    public Sample withMuedsmstPcpNbr(String muedsmstPcpNbr) {
        this.muedsmstPcpNbr = muedsmstPcpNbr;
        return this;
    }

    @JsonProperty("muedsmst_par_nonpar_ind")
    public String getMuedsmstParNonparInd() {
        return muedsmstParNonparInd;
    }

    @JsonProperty("muedsmst_par_nonpar_ind")
    public void setMuedsmstParNonparInd(String muedsmstParNonparInd) {
        this.muedsmstParNonparInd = muedsmstParNonparInd;
    }

    public Sample withMuedsmstParNonparInd(String muedsmstParNonparInd) {
        this.muedsmstParNonparInd = muedsmstParNonparInd;
        return this;
    }

    @JsonProperty("muedsmst_cas_prov_type")
    public String getMuedsmstCasProvType() {
        return muedsmstCasProvType;
    }

    @JsonProperty("muedsmst_cas_prov_type")
    public void setMuedsmstCasProvType(String muedsmstCasProvType) {
        this.muedsmstCasProvType = muedsmstCasProvType;
    }

    public Sample withMuedsmstCasProvType(String muedsmstCasProvType) {
        this.muedsmstCasProvType = muedsmstCasProvType;
        return this;
    }

    @JsonProperty("muedsmst_ecn")
    public String getMuedsmstEcn() {
        return muedsmstEcn;
    }

    @JsonProperty("muedsmst_ecn")
    public void setMuedsmstEcn(String muedsmstEcn) {
        this.muedsmstEcn = muedsmstEcn;
    }

    public Sample withMuedsmstEcn(String muedsmstEcn) {
        this.muedsmstEcn = muedsmstEcn;
        return this;
    }

    @JsonProperty("muedsmst_fst_dt_cymd")
    public String getMuedsmstFstDtCymd() {
        return muedsmstFstDtCymd;
    }

    @JsonProperty("muedsmst_fst_dt_cymd")
    public void setMuedsmstFstDtCymd(String muedsmstFstDtCymd) {
        this.muedsmstFstDtCymd = muedsmstFstDtCymd;
    }

    public Sample withMuedsmstFstDtCymd(String muedsmstFstDtCymd) {
        this.muedsmstFstDtCymd = muedsmstFstDtCymd;
        return this;
    }

    @JsonProperty("muedsmst_lst_dt_cymd")
    public String getMuedsmstLstDtCymd() {
        return muedsmstLstDtCymd;
    }

    @JsonProperty("muedsmst_lst_dt_cymd")
    public void setMuedsmstLstDtCymd(String muedsmstLstDtCymd) {
        this.muedsmstLstDtCymd = muedsmstLstDtCymd;
    }

    public Sample withMuedsmstLstDtCymd(String muedsmstLstDtCymd) {
        this.muedsmstLstDtCymd = muedsmstLstDtCymd;
        return this;
    }

    @JsonProperty("muedsmst_proc_dt_cymd")
    public String getMuedsmstProcDtCymd() {
        return muedsmstProcDtCymd;
    }

    @JsonProperty("muedsmst_proc_dt_cymd")
    public void setMuedsmstProcDtCymd(String muedsmstProcDtCymd) {
        this.muedsmstProcDtCymd = muedsmstProcDtCymd;
    }

    public Sample withMuedsmstProcDtCymd(String muedsmstProcDtCymd) {
        this.muedsmstProcDtCymd = muedsmstProcDtCymd;
        return this;
    }

    @JsonProperty("muedsmst_proc_time")
    public Integer getMuedsmstProcTime() {
        return muedsmstProcTime;
    }

    @JsonProperty("muedsmst_proc_time")
    public void setMuedsmstProcTime(Integer muedsmstProcTime) {
        this.muedsmstProcTime = muedsmstProcTime;
    }

    public Sample withMuedsmstProcTime(Integer muedsmstProcTime) {
        this.muedsmstProcTime = muedsmstProcTime;
        return this;
    }

    @JsonProperty("muedsmst_extrct_dt_cymd")
    public String getMuedsmstExtrctDtCymd() {
        return muedsmstExtrctDtCymd;
    }

    @JsonProperty("muedsmst_extrct_dt_cymd")
    public void setMuedsmstExtrctDtCymd(String muedsmstExtrctDtCymd) {
        this.muedsmstExtrctDtCymd = muedsmstExtrctDtCymd;
    }

    public Sample withMuedsmstExtrctDtCymd(String muedsmstExtrctDtCymd) {
        this.muedsmstExtrctDtCymd = muedsmstExtrctDtCymd;
        return this;
    }

    @JsonProperty("muedsmst_cpt_cd")
    public String getMuedsmstCptCd() {
        return muedsmstCptCd;
    }

    @JsonProperty("muedsmst_cpt_cd")
    public void setMuedsmstCptCd(String muedsmstCptCd) {
        this.muedsmstCptCd = muedsmstCptCd;
    }

    public Sample withMuedsmstCptCd(String muedsmstCptCd) {
        this.muedsmstCptCd = muedsmstCptCd;
        return this;
    }

    @JsonProperty("muedsmst_contract_id")
    public String getMuedsmstContractId() {
        return muedsmstContractId;
    }

    @JsonProperty("muedsmst_contract_id")
    public void setMuedsmstContractId(String muedsmstContractId) {
        this.muedsmstContractId = muedsmstContractId;
    }

    public Sample withMuedsmstContractId(String muedsmstContractId) {
        this.muedsmstContractId = muedsmstContractId;
        return this;
    }

    @JsonProperty("muedsmst_mbr_first_name")
    public String getMuedsmstMbrFirstName() {
        return muedsmstMbrFirstName;
    }

    @JsonProperty("muedsmst_mbr_first_name")
    public void setMuedsmstMbrFirstName(String muedsmstMbrFirstName) {
        this.muedsmstMbrFirstName = muedsmstMbrFirstName;
    }

    public Sample withMuedsmstMbrFirstName(String muedsmstMbrFirstName) {
        this.muedsmstMbrFirstName = muedsmstMbrFirstName;
        return this;
    }

    @JsonProperty("muedsmst_mbr_last_name")
    public String getMuedsmstMbrLastName() {
        return muedsmstMbrLastName;
    }

    @JsonProperty("muedsmst_mbr_last_name")
    public void setMuedsmstMbrLastName(String muedsmstMbrLastName) {
        this.muedsmstMbrLastName = muedsmstMbrLastName;
    }

    public Sample withMuedsmstMbrLastName(String muedsmstMbrLastName) {
        this.muedsmstMbrLastName = muedsmstMbrLastName;
        return this;
    }

    @JsonProperty("muedsmst_gender_cd")
    public String getMuedsmstGenderCd() {
        return muedsmstGenderCd;
    }

    @JsonProperty("muedsmst_gender_cd")
    public void setMuedsmstGenderCd(String muedsmstGenderCd) {
        this.muedsmstGenderCd = muedsmstGenderCd;
    }

    public Sample withMuedsmstGenderCd(String muedsmstGenderCd) {
        this.muedsmstGenderCd = muedsmstGenderCd;
        return this;
    }

    @JsonProperty("muedsmst_mbr_birth_date_cymd")
    public String getMuedsmstMbrBirthDateCymd() {
        return muedsmstMbrBirthDateCymd;
    }

    @JsonProperty("muedsmst_mbr_birth_date_cymd")
    public void setMuedsmstMbrBirthDateCymd(String muedsmstMbrBirthDateCymd) {
        this.muedsmstMbrBirthDateCymd = muedsmstMbrBirthDateCymd;
    }

    public Sample withMuedsmstMbrBirthDateCymd(String muedsmstMbrBirthDateCymd) {
        this.muedsmstMbrBirthDateCymd = muedsmstMbrBirthDateCymd;
        return this;
    }

    @JsonProperty("muedsmst_trsmt_cd")
    public String getMuedsmstTrsmtCd() {
        return muedsmstTrsmtCd;
    }

    @JsonProperty("muedsmst_trsmt_cd")
    public void setMuedsmstTrsmtCd(String muedsmstTrsmtCd) {
        this.muedsmstTrsmtCd = muedsmstTrsmtCd;
    }

    public Sample withMuedsmstTrsmtCd(String muedsmstTrsmtCd) {
        this.muedsmstTrsmtCd = muedsmstTrsmtCd;
        return this;
    }

    @JsonProperty("muedsmst_cust_nbr")
    public String getMuedsmstCustNbr() {
        return muedsmstCustNbr;
    }

    @JsonProperty("muedsmst_cust_nbr")
    public void setMuedsmstCustNbr(String muedsmstCustNbr) {
        this.muedsmstCustNbr = muedsmstCustNbr;
    }

    public Sample withMuedsmstCustNbr(String muedsmstCustNbr) {
        this.muedsmstCustNbr = muedsmstCustNbr;
        return this;
    }

    @JsonProperty("muedsmst_grouper_nbr")
    public Integer getMuedsmstGrouperNbr() {
        return muedsmstGrouperNbr;
    }

    @JsonProperty("muedsmst_grouper_nbr")
    public void setMuedsmstGrouperNbr(Integer muedsmstGrouperNbr) {
        this.muedsmstGrouperNbr = muedsmstGrouperNbr;
    }

    public Sample withMuedsmstGrouperNbr(Integer muedsmstGrouperNbr) {
        this.muedsmstGrouperNbr = muedsmstGrouperNbr;
        return this;
    }

    @JsonProperty("muedsmst_sold_ledger_nbr")
    public Integer getMuedsmstSoldLedgerNbr() {
        return muedsmstSoldLedgerNbr;
    }

    @JsonProperty("muedsmst_sold_ledger_nbr")
    public void setMuedsmstSoldLedgerNbr(Integer muedsmstSoldLedgerNbr) {
        this.muedsmstSoldLedgerNbr = muedsmstSoldLedgerNbr;
    }

    public Sample withMuedsmstSoldLedgerNbr(Integer muedsmstSoldLedgerNbr) {
        this.muedsmstSoldLedgerNbr = muedsmstSoldLedgerNbr;
        return this;
    }

    @JsonProperty("muedsmst_bill_type")
    public String getMuedsmstBillType() {
        return muedsmstBillType;
    }

    @JsonProperty("muedsmst_bill_type")
    public void setMuedsmstBillType(String muedsmstBillType) {
        this.muedsmstBillType = muedsmstBillType;
    }

    public Sample withMuedsmstBillType(String muedsmstBillType) {
        this.muedsmstBillType = muedsmstBillType;
        return this;
    }

    @JsonProperty("muedsmst_payee")
    public String getMuedsmstPayee() {
        return muedsmstPayee;
    }

    @JsonProperty("muedsmst_payee")
    public void setMuedsmstPayee(String muedsmstPayee) {
        this.muedsmstPayee = muedsmstPayee;
    }

    public Sample withMuedsmstPayee(String muedsmstPayee) {
        this.muedsmstPayee = muedsmstPayee;
        return this;
    }

    @JsonProperty("muedsmst_pot")
    public String getMuedsmstPot() {
        return muedsmstPot;
    }

    @JsonProperty("muedsmst_pot")
    public void setMuedsmstPot(String muedsmstPot) {
        this.muedsmstPot = muedsmstPot;
    }

    public Sample withMuedsmstPot(String muedsmstPot) {
        this.muedsmstPot = muedsmstPot;
        return this;
    }

    @JsonProperty("muedsmst_umid")
    public String getMuedsmstUmid() {
        return muedsmstUmid;
    }

    @JsonProperty("muedsmst_umid")
    public void setMuedsmstUmid(String muedsmstUmid) {
        this.muedsmstUmid = muedsmstUmid;
    }

    public Sample withMuedsmstUmid(String muedsmstUmid) {
        this.muedsmstUmid = muedsmstUmid;
        return this;
    }

    @JsonProperty("muedsmst_prov_npi")
    public String getMuedsmstProvNpi() {
        return muedsmstProvNpi;
    }

    @JsonProperty("muedsmst_prov_npi")
    public void setMuedsmstProvNpi(String muedsmstProvNpi) {
        this.muedsmstProvNpi = muedsmstProvNpi;
    }

    public Sample withMuedsmstProvNpi(String muedsmstProvNpi) {
        this.muedsmstProvNpi = muedsmstProvNpi;
        return this;
    }

    @JsonProperty("muedsmst_current_status_dt")
    public String getMuedsmstCurrentStatusDt() {
        return muedsmstCurrentStatusDt;
    }

    @JsonProperty("muedsmst_current_status_dt")
    public void setMuedsmstCurrentStatusDt(String muedsmstCurrentStatusDt) {
        this.muedsmstCurrentStatusDt = muedsmstCurrentStatusDt;
    }

    public Sample withMuedsmstCurrentStatusDt(String muedsmstCurrentStatusDt) {
        this.muedsmstCurrentStatusDt = muedsmstCurrentStatusDt;
        return this;
    }

    @JsonProperty("muedsmst_current_status")
    public String getMuedsmstCurrentStatus() {
        return muedsmstCurrentStatus;
    }

    @JsonProperty("muedsmst_current_status")
    public void setMuedsmstCurrentStatus(String muedsmstCurrentStatus) {
        this.muedsmstCurrentStatus = muedsmstCurrentStatus;
    }

    public Sample withMuedsmstCurrentStatus(String muedsmstCurrentStatus) {
        this.muedsmstCurrentStatus = muedsmstCurrentStatus;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_1")
    public String getMuedsmstDiagCd1() {
        return muedsmstDiagCd1;
    }

    @JsonProperty("muedsmst_diag_cd_1")
    public void setMuedsmstDiagCd1(String muedsmstDiagCd1) {
        this.muedsmstDiagCd1 = muedsmstDiagCd1;
    }

    public Sample withMuedsmstDiagCd1(String muedsmstDiagCd1) {
        this.muedsmstDiagCd1 = muedsmstDiagCd1;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_2")
    public String getMuedsmstDiagCd2() {
        return muedsmstDiagCd2;
    }

    @JsonProperty("muedsmst_diag_cd_2")
    public void setMuedsmstDiagCd2(String muedsmstDiagCd2) {
        this.muedsmstDiagCd2 = muedsmstDiagCd2;
    }

    public Sample withMuedsmstDiagCd2(String muedsmstDiagCd2) {
        this.muedsmstDiagCd2 = muedsmstDiagCd2;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_3")
    public String getMuedsmstDiagCd3() {
        return muedsmstDiagCd3;
    }

    @JsonProperty("muedsmst_diag_cd_3")
    public void setMuedsmstDiagCd3(String muedsmstDiagCd3) {
        this.muedsmstDiagCd3 = muedsmstDiagCd3;
    }

    public Sample withMuedsmstDiagCd3(String muedsmstDiagCd3) {
        this.muedsmstDiagCd3 = muedsmstDiagCd3;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_4")
    public String getMuedsmstDiagCd4() {
        return muedsmstDiagCd4;
    }

    @JsonProperty("muedsmst_diag_cd_4")
    public void setMuedsmstDiagCd4(String muedsmstDiagCd4) {
        this.muedsmstDiagCd4 = muedsmstDiagCd4;
    }

    public Sample withMuedsmstDiagCd4(String muedsmstDiagCd4) {
        this.muedsmstDiagCd4 = muedsmstDiagCd4;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_5")
    public String getMuedsmstDiagCd5() {
        return muedsmstDiagCd5;
    }

    @JsonProperty("muedsmst_diag_cd_5")
    public void setMuedsmstDiagCd5(String muedsmstDiagCd5) {
        this.muedsmstDiagCd5 = muedsmstDiagCd5;
    }

    public Sample withMuedsmstDiagCd5(String muedsmstDiagCd5) {
        this.muedsmstDiagCd5 = muedsmstDiagCd5;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_6")
    public String getMuedsmstDiagCd6() {
        return muedsmstDiagCd6;
    }

    @JsonProperty("muedsmst_diag_cd_6")
    public void setMuedsmstDiagCd6(String muedsmstDiagCd6) {
        this.muedsmstDiagCd6 = muedsmstDiagCd6;
    }

    public Sample withMuedsmstDiagCd6(String muedsmstDiagCd6) {
        this.muedsmstDiagCd6 = muedsmstDiagCd6;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_7")
    public String getMuedsmstDiagCd7() {
        return muedsmstDiagCd7;
    }

    @JsonProperty("muedsmst_diag_cd_7")
    public void setMuedsmstDiagCd7(String muedsmstDiagCd7) {
        this.muedsmstDiagCd7 = muedsmstDiagCd7;
    }

    public Sample withMuedsmstDiagCd7(String muedsmstDiagCd7) {
        this.muedsmstDiagCd7 = muedsmstDiagCd7;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_8")
    public String getMuedsmstDiagCd8() {
        return muedsmstDiagCd8;
    }

    @JsonProperty("muedsmst_diag_cd_8")
    public void setMuedsmstDiagCd8(String muedsmstDiagCd8) {
        this.muedsmstDiagCd8 = muedsmstDiagCd8;
    }

    public Sample withMuedsmstDiagCd8(String muedsmstDiagCd8) {
        this.muedsmstDiagCd8 = muedsmstDiagCd8;
        return this;
    }

    @JsonProperty("muedsmst_diag_cd_9")
    public String getMuedsmstDiagCd9() {
        return muedsmstDiagCd9;
    }

    @JsonProperty("muedsmst_diag_cd_9")
    public void setMuedsmstDiagCd9(String muedsmstDiagCd9) {
        this.muedsmstDiagCd9 = muedsmstDiagCd9;
    }

    public Sample withMuedsmstDiagCd9(String muedsmstDiagCd9) {
        this.muedsmstDiagCd9 = muedsmstDiagCd9;
        return this;
    }

    @JsonProperty("muedsmst_type_mod")
    public String getMuedsmstTypeMod() {
        return muedsmstTypeMod;
    }

    @JsonProperty("muedsmst_type_mod")
    public void setMuedsmstTypeMod(String muedsmstTypeMod) {
        this.muedsmstTypeMod = muedsmstTypeMod;
    }

    public Sample withMuedsmstTypeMod(String muedsmstTypeMod) {
        this.muedsmstTypeMod = muedsmstTypeMod;
        return this;
    }

    @JsonProperty("muedsmst_src_entry_cd")
    public String getMuedsmstSrcEntryCd() {
        return muedsmstSrcEntryCd;
    }

    @JsonProperty("muedsmst_src_entry_cd")
    public void setMuedsmstSrcEntryCd(String muedsmstSrcEntryCd) {
        this.muedsmstSrcEntryCd = muedsmstSrcEntryCd;
    }

    public Sample withMuedsmstSrcEntryCd(String muedsmstSrcEntryCd) {
        this.muedsmstSrcEntryCd = muedsmstSrcEntryCd;
        return this;
    }

    @JsonProperty("muedsmst_sent_seq_nbr")
    public String getMuedsmstSentSeqNbr() {
        return muedsmstSentSeqNbr;
    }

    @JsonProperty("muedsmst_sent_seq_nbr")
    public void setMuedsmstSentSeqNbr(String muedsmstSentSeqNbr) {
        this.muedsmstSentSeqNbr = muedsmstSentSeqNbr;
    }

    public Sample withMuedsmstSentSeqNbr(String muedsmstSentSeqNbr) {
        this.muedsmstSentSeqNbr = muedsmstSentSeqNbr;
        return this;
    }

    @JsonProperty("muedsmst_acp_seq_nbr")
    public Integer getMuedsmstAcpSeqNbr() {
        return muedsmstAcpSeqNbr;
    }

    @JsonProperty("muedsmst_acp_seq_nbr")
    public void setMuedsmstAcpSeqNbr(Integer muedsmstAcpSeqNbr) {
        this.muedsmstAcpSeqNbr = muedsmstAcpSeqNbr;
    }

    public Sample withMuedsmstAcpSeqNbr(Integer muedsmstAcpSeqNbr) {
        this.muedsmstAcpSeqNbr = muedsmstAcpSeqNbr;
        return this;
    }

    @JsonProperty("muedsmst_rej_seq_nbr")
    public Integer getMuedsmstRejSeqNbr() {
        return muedsmstRejSeqNbr;
    }

    @JsonProperty("muedsmst_rej_seq_nbr")
    public void setMuedsmstRejSeqNbr(Integer muedsmstRejSeqNbr) {
        this.muedsmstRejSeqNbr = muedsmstRejSeqNbr;
    }

    public Sample withMuedsmstRejSeqNbr(Integer muedsmstRejSeqNbr) {
        this.muedsmstRejSeqNbr = muedsmstRejSeqNbr;
        return this;
    }

    @JsonProperty("muedsmst_adj_cd")
    public String getMuedsmstAdjCd() {
        return muedsmstAdjCd;
    }

    @JsonProperty("muedsmst_adj_cd")
    public void setMuedsmstAdjCd(String muedsmstAdjCd) {
        this.muedsmstAdjCd = muedsmstAdjCd;
    }

    public Sample withMuedsmstAdjCd(String muedsmstAdjCd) {
        this.muedsmstAdjCd = muedsmstAdjCd;
        return this;
    }

    @JsonProperty("muedsmst_rep_cat")
    public String getMuedsmstRepCat() {
        return muedsmstRepCat;
    }

    @JsonProperty("muedsmst_rep_cat")
    public void setMuedsmstRepCat(String muedsmstRepCat) {
        this.muedsmstRepCat = muedsmstRepCat;
    }

    public Sample withMuedsmstRepCat(String muedsmstRepCat) {
        this.muedsmstRepCat = muedsmstRepCat;
        return this;
    }

    @JsonProperty("muedsmst_batch_id")
    public String getMuedsmstBatchId() {
        return muedsmstBatchId;
    }

    @JsonProperty("muedsmst_batch_id")
    public void setMuedsmstBatchId(String muedsmstBatchId) {
        this.muedsmstBatchId = muedsmstBatchId;
    }

    public Sample withMuedsmstBatchId(String muedsmstBatchId) {
        this.muedsmstBatchId = muedsmstBatchId;
        return this;
    }

    @JsonProperty("muedsmst_tm_status")
    public String getMuedsmstTmStatus() {
        return muedsmstTmStatus;
    }

    @JsonProperty("muedsmst_tm_status")
    public void setMuedsmstTmStatus(String muedsmstTmStatus) {
        this.muedsmstTmStatus = muedsmstTmStatus;
    }

    public Sample withMuedsmstTmStatus(String muedsmstTmStatus) {
        this.muedsmstTmStatus = muedsmstTmStatus;
        return this;
    }

    @JsonProperty("muedsmst_cms_status")
    public String getMuedsmstCmsStatus() {
        return muedsmstCmsStatus;
    }

    @JsonProperty("muedsmst_cms_status")
    public void setMuedsmstCmsStatus(String muedsmstCmsStatus) {
        this.muedsmstCmsStatus = muedsmstCmsStatus;
    }

    public Sample withMuedsmstCmsStatus(String muedsmstCmsStatus) {
        this.muedsmstCmsStatus = muedsmstCmsStatus;
        return this;
    }

    @JsonProperty("muedsmst_prov_spec")
    public String getMuedsmstProvSpec() {
        return muedsmstProvSpec;
    }

    @JsonProperty("muedsmst_prov_spec")
    public void setMuedsmstProvSpec(String muedsmstProvSpec) {
        this.muedsmstProvSpec = muedsmstProvSpec;
    }

    public Sample withMuedsmstProvSpec(String muedsmstProvSpec) {
        this.muedsmstProvSpec = muedsmstProvSpec;
        return this;
    }

    @JsonProperty("muedsmst_year")
    public String getMuedsmstYear() {
        return muedsmstYear;
    }

    @JsonProperty("muedsmst_year")
    public void setMuedsmstYear(String muedsmstYear) {
        this.muedsmstYear = muedsmstYear;
    }

    public Sample withMuedsmstYear(String muedsmstYear) {
        this.muedsmstYear = muedsmstYear;
        return this;
    }

    @JsonProperty("muedsmst_icd10_ind")
    public String getMuedsmstIcd10Ind() {
        return muedsmstIcd10Ind;
    }

    @JsonProperty("muedsmst_icd10_ind")
    public void setMuedsmstIcd10Ind(String muedsmstIcd10Ind) {
        this.muedsmstIcd10Ind = muedsmstIcd10Ind;
    }

    public Sample withMuedsmstIcd10Ind(String muedsmstIcd10Ind) {
        this.muedsmstIcd10Ind = muedsmstIcd10Ind;
        return this;
    }

    @JsonProperty("muedsmst_void_seq_nbr")
    public Integer getMuedsmstVoidSeqNbr() {
        return muedsmstVoidSeqNbr;
    }

    @JsonProperty("muedsmst_void_seq_nbr")
    public void setMuedsmstVoidSeqNbr(Integer muedsmstVoidSeqNbr) {
        this.muedsmstVoidSeqNbr = muedsmstVoidSeqNbr;
    }

    public Sample withMuedsmstVoidSeqNbr(Integer muedsmstVoidSeqNbr) {
        this.muedsmstVoidSeqNbr = muedsmstVoidSeqNbr;
        return this;
    }

    @JsonProperty("filler")
    public String getFiller() {
        return filler;
    }

    @JsonProperty("filler")
    public void setFiller(String filler) {
        this.filler = filler;
    }

    public Sample withFiller(String filler) {
        this.filler = filler;
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

    public Sample withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(claimId).append(intakeDate).append(createDate).append(updateDate).append(muedsmstClntClmNbr).append(muedsmstClmLineNbr).append(muedsmstClmType).append(muedsmstSs).append(muedsmstDmeInd).append(muedsmstEcnInd).append(muedsmstPendInd).append(muedsmstCapInd).append(muedsmstPaperInd).append(muedsmstCorespInd).append(muedsmstNpiInd).append(muedsmstChrRevInd).append(muedsmstSupbillInd).append(muedsmstCorInd).append(muedsmstDenInd).append(muedsmstIntblInd).append(muedsmstRvsInd).append(muedsmstMbrMcareId).append(muedsmstCasProviderNbr).append(muedsmstCasProvMcareId).append(muedsmstPcpNbr).append(muedsmstParNonparInd).append(muedsmstCasProvType).append(muedsmstEcn).append(muedsmstFstDtCymd).append(muedsmstLstDtCymd).append(muedsmstProcDtCymd).append(muedsmstProcTime).append(muedsmstExtrctDtCymd).append(muedsmstCptCd).append(muedsmstContractId).append(muedsmstMbrFirstName).append(muedsmstMbrLastName).append(muedsmstGenderCd).append(muedsmstMbrBirthDateCymd).append(muedsmstTrsmtCd).append(muedsmstCustNbr).append(muedsmstGrouperNbr).append(muedsmstSoldLedgerNbr).append(muedsmstBillType).append(muedsmstPayee).append(muedsmstPot).append(muedsmstUmid).append(muedsmstProvNpi).append(muedsmstCurrentStatusDt).append(muedsmstCurrentStatus).append(muedsmstDiagCd1).append(muedsmstDiagCd2).append(muedsmstDiagCd3).append(muedsmstDiagCd4).append(muedsmstDiagCd5).append(muedsmstDiagCd6).append(muedsmstDiagCd7).append(muedsmstDiagCd8).append(muedsmstDiagCd9).append(muedsmstTypeMod).append(muedsmstSrcEntryCd).append(muedsmstSentSeqNbr).append(muedsmstAcpSeqNbr).append(muedsmstRejSeqNbr).append(muedsmstAdjCd).append(muedsmstRepCat).append(muedsmstBatchId).append(muedsmstTmStatus).append(muedsmstCmsStatus).append(muedsmstProvSpec).append(muedsmstYear).append(muedsmstIcd10Ind).append(muedsmstVoidSeqNbr).append(filler).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sample) == false) {
            return false;
        }
        Sample rhs = ((Sample) other);
        return new EqualsBuilder().append(claimId, rhs.claimId).append(intakeDate, rhs.intakeDate).append(createDate, rhs.createDate).append(updateDate, rhs.updateDate).append(muedsmstClntClmNbr, rhs.muedsmstClntClmNbr).append(muedsmstClmLineNbr, rhs.muedsmstClmLineNbr).append(muedsmstClmType, rhs.muedsmstClmType).append(muedsmstSs, rhs.muedsmstSs).append(muedsmstDmeInd, rhs.muedsmstDmeInd).append(muedsmstEcnInd, rhs.muedsmstEcnInd).append(muedsmstPendInd, rhs.muedsmstPendInd).append(muedsmstCapInd, rhs.muedsmstCapInd).append(muedsmstPaperInd, rhs.muedsmstPaperInd).append(muedsmstCorespInd, rhs.muedsmstCorespInd).append(muedsmstNpiInd, rhs.muedsmstNpiInd).append(muedsmstChrRevInd, rhs.muedsmstChrRevInd).append(muedsmstSupbillInd, rhs.muedsmstSupbillInd).append(muedsmstCorInd, rhs.muedsmstCorInd).append(muedsmstDenInd, rhs.muedsmstDenInd).append(muedsmstIntblInd, rhs.muedsmstIntblInd).append(muedsmstRvsInd, rhs.muedsmstRvsInd).append(muedsmstMbrMcareId, rhs.muedsmstMbrMcareId).append(muedsmstCasProviderNbr, rhs.muedsmstCasProviderNbr).append(muedsmstCasProvMcareId, rhs.muedsmstCasProvMcareId).append(muedsmstPcpNbr, rhs.muedsmstPcpNbr).append(muedsmstParNonparInd, rhs.muedsmstParNonparInd).append(muedsmstCasProvType, rhs.muedsmstCasProvType).append(muedsmstEcn, rhs.muedsmstEcn).append(muedsmstFstDtCymd, rhs.muedsmstFstDtCymd).append(muedsmstLstDtCymd, rhs.muedsmstLstDtCymd).append(muedsmstProcDtCymd, rhs.muedsmstProcDtCymd).append(muedsmstProcTime, rhs.muedsmstProcTime).append(muedsmstExtrctDtCymd, rhs.muedsmstExtrctDtCymd).append(muedsmstCptCd, rhs.muedsmstCptCd).append(muedsmstContractId, rhs.muedsmstContractId).append(muedsmstMbrFirstName, rhs.muedsmstMbrFirstName).append(muedsmstMbrLastName, rhs.muedsmstMbrLastName).append(muedsmstGenderCd, rhs.muedsmstGenderCd).append(muedsmstMbrBirthDateCymd, rhs.muedsmstMbrBirthDateCymd).append(muedsmstTrsmtCd, rhs.muedsmstTrsmtCd).append(muedsmstCustNbr, rhs.muedsmstCustNbr).append(muedsmstGrouperNbr, rhs.muedsmstGrouperNbr).append(muedsmstSoldLedgerNbr, rhs.muedsmstSoldLedgerNbr).append(muedsmstBillType, rhs.muedsmstBillType).append(muedsmstPayee, rhs.muedsmstPayee).append(muedsmstPot, rhs.muedsmstPot).append(muedsmstUmid, rhs.muedsmstUmid).append(muedsmstProvNpi, rhs.muedsmstProvNpi).append(muedsmstCurrentStatusDt, rhs.muedsmstCurrentStatusDt).append(muedsmstCurrentStatus, rhs.muedsmstCurrentStatus).append(muedsmstDiagCd1, rhs.muedsmstDiagCd1).append(muedsmstDiagCd2, rhs.muedsmstDiagCd2).append(muedsmstDiagCd3, rhs.muedsmstDiagCd3).append(muedsmstDiagCd4, rhs.muedsmstDiagCd4).append(muedsmstDiagCd5, rhs.muedsmstDiagCd5).append(muedsmstDiagCd6, rhs.muedsmstDiagCd6).append(muedsmstDiagCd7, rhs.muedsmstDiagCd7).append(muedsmstDiagCd8, rhs.muedsmstDiagCd8).append(muedsmstDiagCd9, rhs.muedsmstDiagCd9).append(muedsmstTypeMod, rhs.muedsmstTypeMod).append(muedsmstSrcEntryCd, rhs.muedsmstSrcEntryCd).append(muedsmstSentSeqNbr, rhs.muedsmstSentSeqNbr).append(muedsmstAcpSeqNbr, rhs.muedsmstAcpSeqNbr).append(muedsmstRejSeqNbr, rhs.muedsmstRejSeqNbr).append(muedsmstAdjCd, rhs.muedsmstAdjCd).append(muedsmstRepCat, rhs.muedsmstRepCat).append(muedsmstBatchId, rhs.muedsmstBatchId).append(muedsmstTmStatus, rhs.muedsmstTmStatus).append(muedsmstCmsStatus, rhs.muedsmstCmsStatus).append(muedsmstProvSpec, rhs.muedsmstProvSpec).append(muedsmstYear, rhs.muedsmstYear).append(muedsmstIcd10Ind, rhs.muedsmstIcd10Ind).append(muedsmstVoidSeqNbr, rhs.muedsmstVoidSeqNbr).append(filler, rhs.filler).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

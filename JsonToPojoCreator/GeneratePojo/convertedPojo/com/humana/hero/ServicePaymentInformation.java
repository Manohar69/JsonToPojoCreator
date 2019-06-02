
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
    "t_pay_sl_id",
    "pay_claimp_id",
    "svc01_adjudicatedmedicalprocinfo",
    "svc01_01_adjudicatedproductserviceidqlfr",
    "svc01_02_adjudicatedprocedurecode",
    "svc01_03_adjudicatedproceduremodifier1",
    "svc01_04_adjudicatedproceduremodifier2",
    "svc01_05_adjudicatedproceduremodifier3",
    "svc01_06_adjudicatedproceduremodifier4",
    "svc02_lineitemchargeamount",
    "svc03_lineitemproviderpaymentamount",
    "svc04_nubc_revenuecode",
    "svc05_unitsofservicepaidcount",
    "svc06_submittedproductcommedprociden",
    "svc06_01_submittedproductserviceidqlfr",
    "svc06_02_submittedprocedurecode",
    "svc06_03_submittedproceduremodifier1",
    "svc06_04_submittedproceduremodifier2",
    "svc06_05_submittedproceduremodifier3",
    "svc06_06_submittedproceduremodifier4",
    "svc06_07_submittedprocedurecodedesc",
    "svc07_originalunitsofservicecount",
    "dtm01_servicedatetimeqlfr",
    "dtm02_serviceperiodstartendsvcdate",
    "clmadjudicationinfo",
    "ref01_provideridqlfr",
    "ref02_provideridentifier",
    "ref01_lineitemcontrolnumberidenqlfr",
    "ref02_lineitemcontrolnumber",
    "ref01_renderingprovideridqlfr",
    "ref02_renderingprovideridentifier",
    "ref01_healthcarepolicyidenqlfr",
    "ref02_healthcarepolicyidentification",
    "amt01_servicesupplementalqlfr",
    "amt02_servicesupplementalamount",
    "qty01_servsupplemntquantityqlfr",
    "qty02_servsupplemntquantitycount",
    "lq01_remarkcodeqlfr",
    "lq02_remarkcode"
})
public class ServicePaymentInformation {

    @JsonProperty("t_pay_sl_id")
    private Integer tPaySlId;
    @JsonProperty("pay_claimp_id")
    private Integer payClaimpId;
    @JsonProperty("svc01_adjudicatedmedicalprocinfo")
    private String svc01Adjudicatedmedicalprocinfo;
    @JsonProperty("svc01_01_adjudicatedproductserviceidqlfr")
    private String svc0101Adjudicatedproductserviceidqlfr;
    @JsonProperty("svc01_02_adjudicatedprocedurecode")
    private String svc0102Adjudicatedprocedurecode;
    @JsonProperty("svc01_03_adjudicatedproceduremodifier1")
    private String svc0103Adjudicatedproceduremodifier1;
    @JsonProperty("svc01_04_adjudicatedproceduremodifier2")
    private String svc0104Adjudicatedproceduremodifier2;
    @JsonProperty("svc01_05_adjudicatedproceduremodifier3")
    private String svc0105Adjudicatedproceduremodifier3;
    @JsonProperty("svc01_06_adjudicatedproceduremodifier4")
    private String svc0106Adjudicatedproceduremodifier4;
    @JsonProperty("svc02_lineitemchargeamount")
    private String svc02Lineitemchargeamount;
    @JsonProperty("svc03_lineitemproviderpaymentamount")
    private String svc03Lineitemproviderpaymentamount;
    @JsonProperty("svc04_nubc_revenuecode")
    private String svc04NubcRevenuecode;
    @JsonProperty("svc05_unitsofservicepaidcount")
    private String svc05Unitsofservicepaidcount;
    @JsonProperty("svc06_submittedproductcommedprociden")
    private String svc06Submittedproductcommedprociden;
    @JsonProperty("svc06_01_submittedproductserviceidqlfr")
    private String svc0601Submittedproductserviceidqlfr;
    @JsonProperty("svc06_02_submittedprocedurecode")
    private String svc0602Submittedprocedurecode;
    @JsonProperty("svc06_03_submittedproceduremodifier1")
    private String svc0603Submittedproceduremodifier1;
    @JsonProperty("svc06_04_submittedproceduremodifier2")
    private String svc0604Submittedproceduremodifier2;
    @JsonProperty("svc06_05_submittedproceduremodifier3")
    private String svc0605Submittedproceduremodifier3;
    @JsonProperty("svc06_06_submittedproceduremodifier4")
    private String svc0606Submittedproceduremodifier4;
    @JsonProperty("svc06_07_submittedprocedurecodedesc")
    private String svc0607Submittedprocedurecodedesc;
    @JsonProperty("svc07_originalunitsofservicecount")
    private String svc07Originalunitsofservicecount;
    @JsonProperty("dtm01_servicedatetimeqlfr")
    private String dtm01Servicedatetimeqlfr;
    @JsonProperty("dtm02_serviceperiodstartendsvcdate")
    private String dtm02Serviceperiodstartendsvcdate;
    @JsonProperty("clmadjudicationinfo")
    private List<Clmadjudicationinfo_> clmadjudicationinfo = new ArrayList<Clmadjudicationinfo_>();
    @JsonProperty("ref01_provideridqlfr")
    private String ref01Provideridqlfr;
    @JsonProperty("ref02_provideridentifier")
    private String ref02Provideridentifier;
    @JsonProperty("ref01_lineitemcontrolnumberidenqlfr")
    private String ref01Lineitemcontrolnumberidenqlfr;
    @JsonProperty("ref02_lineitemcontrolnumber")
    private String ref02Lineitemcontrolnumber;
    @JsonProperty("ref01_renderingprovideridqlfr")
    private String ref01Renderingprovideridqlfr;
    @JsonProperty("ref02_renderingprovideridentifier")
    private String ref02Renderingprovideridentifier;
    @JsonProperty("ref01_healthcarepolicyidenqlfr")
    private String ref01Healthcarepolicyidenqlfr;
    @JsonProperty("ref02_healthcarepolicyidentification")
    private String ref02Healthcarepolicyidentification;
    @JsonProperty("amt01_servicesupplementalqlfr")
    private String amt01Servicesupplementalqlfr;
    @JsonProperty("amt02_servicesupplementalamount")
    private String amt02Servicesupplementalamount;
    @JsonProperty("qty01_servsupplemntquantityqlfr")
    private String qty01Servsupplemntquantityqlfr;
    @JsonProperty("qty02_servsupplemntquantitycount")
    private String qty02Servsupplemntquantitycount;
    @JsonProperty("lq01_remarkcodeqlfr")
    private String lq01Remarkcodeqlfr;
    @JsonProperty("lq02_remarkcode")
    private String lq02Remarkcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("t_pay_sl_id")
    public Integer getTPaySlId() {
        return tPaySlId;
    }

    @JsonProperty("t_pay_sl_id")
    public void setTPaySlId(Integer tPaySlId) {
        this.tPaySlId = tPaySlId;
    }

    public ServicePaymentInformation withTPaySlId(Integer tPaySlId) {
        this.tPaySlId = tPaySlId;
        return this;
    }

    @JsonProperty("pay_claimp_id")
    public Integer getPayClaimpId() {
        return payClaimpId;
    }

    @JsonProperty("pay_claimp_id")
    public void setPayClaimpId(Integer payClaimpId) {
        this.payClaimpId = payClaimpId;
    }

    public ServicePaymentInformation withPayClaimpId(Integer payClaimpId) {
        this.payClaimpId = payClaimpId;
        return this;
    }

    @JsonProperty("svc01_adjudicatedmedicalprocinfo")
    public String getSvc01Adjudicatedmedicalprocinfo() {
        return svc01Adjudicatedmedicalprocinfo;
    }

    @JsonProperty("svc01_adjudicatedmedicalprocinfo")
    public void setSvc01Adjudicatedmedicalprocinfo(String svc01Adjudicatedmedicalprocinfo) {
        this.svc01Adjudicatedmedicalprocinfo = svc01Adjudicatedmedicalprocinfo;
    }

    public ServicePaymentInformation withSvc01Adjudicatedmedicalprocinfo(String svc01Adjudicatedmedicalprocinfo) {
        this.svc01Adjudicatedmedicalprocinfo = svc01Adjudicatedmedicalprocinfo;
        return this;
    }

    @JsonProperty("svc01_01_adjudicatedproductserviceidqlfr")
    public String getSvc0101Adjudicatedproductserviceidqlfr() {
        return svc0101Adjudicatedproductserviceidqlfr;
    }

    @JsonProperty("svc01_01_adjudicatedproductserviceidqlfr")
    public void setSvc0101Adjudicatedproductserviceidqlfr(String svc0101Adjudicatedproductserviceidqlfr) {
        this.svc0101Adjudicatedproductserviceidqlfr = svc0101Adjudicatedproductserviceidqlfr;
    }

    public ServicePaymentInformation withSvc0101Adjudicatedproductserviceidqlfr(String svc0101Adjudicatedproductserviceidqlfr) {
        this.svc0101Adjudicatedproductserviceidqlfr = svc0101Adjudicatedproductserviceidqlfr;
        return this;
    }

    @JsonProperty("svc01_02_adjudicatedprocedurecode")
    public String getSvc0102Adjudicatedprocedurecode() {
        return svc0102Adjudicatedprocedurecode;
    }

    @JsonProperty("svc01_02_adjudicatedprocedurecode")
    public void setSvc0102Adjudicatedprocedurecode(String svc0102Adjudicatedprocedurecode) {
        this.svc0102Adjudicatedprocedurecode = svc0102Adjudicatedprocedurecode;
    }

    public ServicePaymentInformation withSvc0102Adjudicatedprocedurecode(String svc0102Adjudicatedprocedurecode) {
        this.svc0102Adjudicatedprocedurecode = svc0102Adjudicatedprocedurecode;
        return this;
    }

    @JsonProperty("svc01_03_adjudicatedproceduremodifier1")
    public String getSvc0103Adjudicatedproceduremodifier1() {
        return svc0103Adjudicatedproceduremodifier1;
    }

    @JsonProperty("svc01_03_adjudicatedproceduremodifier1")
    public void setSvc0103Adjudicatedproceduremodifier1(String svc0103Adjudicatedproceduremodifier1) {
        this.svc0103Adjudicatedproceduremodifier1 = svc0103Adjudicatedproceduremodifier1;
    }

    public ServicePaymentInformation withSvc0103Adjudicatedproceduremodifier1(String svc0103Adjudicatedproceduremodifier1) {
        this.svc0103Adjudicatedproceduremodifier1 = svc0103Adjudicatedproceduremodifier1;
        return this;
    }

    @JsonProperty("svc01_04_adjudicatedproceduremodifier2")
    public String getSvc0104Adjudicatedproceduremodifier2() {
        return svc0104Adjudicatedproceduremodifier2;
    }

    @JsonProperty("svc01_04_adjudicatedproceduremodifier2")
    public void setSvc0104Adjudicatedproceduremodifier2(String svc0104Adjudicatedproceduremodifier2) {
        this.svc0104Adjudicatedproceduremodifier2 = svc0104Adjudicatedproceduremodifier2;
    }

    public ServicePaymentInformation withSvc0104Adjudicatedproceduremodifier2(String svc0104Adjudicatedproceduremodifier2) {
        this.svc0104Adjudicatedproceduremodifier2 = svc0104Adjudicatedproceduremodifier2;
        return this;
    }

    @JsonProperty("svc01_05_adjudicatedproceduremodifier3")
    public String getSvc0105Adjudicatedproceduremodifier3() {
        return svc0105Adjudicatedproceduremodifier3;
    }

    @JsonProperty("svc01_05_adjudicatedproceduremodifier3")
    public void setSvc0105Adjudicatedproceduremodifier3(String svc0105Adjudicatedproceduremodifier3) {
        this.svc0105Adjudicatedproceduremodifier3 = svc0105Adjudicatedproceduremodifier3;
    }

    public ServicePaymentInformation withSvc0105Adjudicatedproceduremodifier3(String svc0105Adjudicatedproceduremodifier3) {
        this.svc0105Adjudicatedproceduremodifier3 = svc0105Adjudicatedproceduremodifier3;
        return this;
    }

    @JsonProperty("svc01_06_adjudicatedproceduremodifier4")
    public String getSvc0106Adjudicatedproceduremodifier4() {
        return svc0106Adjudicatedproceduremodifier4;
    }

    @JsonProperty("svc01_06_adjudicatedproceduremodifier4")
    public void setSvc0106Adjudicatedproceduremodifier4(String svc0106Adjudicatedproceduremodifier4) {
        this.svc0106Adjudicatedproceduremodifier4 = svc0106Adjudicatedproceduremodifier4;
    }

    public ServicePaymentInformation withSvc0106Adjudicatedproceduremodifier4(String svc0106Adjudicatedproceduremodifier4) {
        this.svc0106Adjudicatedproceduremodifier4 = svc0106Adjudicatedproceduremodifier4;
        return this;
    }

    @JsonProperty("svc02_lineitemchargeamount")
    public String getSvc02Lineitemchargeamount() {
        return svc02Lineitemchargeamount;
    }

    @JsonProperty("svc02_lineitemchargeamount")
    public void setSvc02Lineitemchargeamount(String svc02Lineitemchargeamount) {
        this.svc02Lineitemchargeamount = svc02Lineitemchargeamount;
    }

    public ServicePaymentInformation withSvc02Lineitemchargeamount(String svc02Lineitemchargeamount) {
        this.svc02Lineitemchargeamount = svc02Lineitemchargeamount;
        return this;
    }

    @JsonProperty("svc03_lineitemproviderpaymentamount")
    public String getSvc03Lineitemproviderpaymentamount() {
        return svc03Lineitemproviderpaymentamount;
    }

    @JsonProperty("svc03_lineitemproviderpaymentamount")
    public void setSvc03Lineitemproviderpaymentamount(String svc03Lineitemproviderpaymentamount) {
        this.svc03Lineitemproviderpaymentamount = svc03Lineitemproviderpaymentamount;
    }

    public ServicePaymentInformation withSvc03Lineitemproviderpaymentamount(String svc03Lineitemproviderpaymentamount) {
        this.svc03Lineitemproviderpaymentamount = svc03Lineitemproviderpaymentamount;
        return this;
    }

    @JsonProperty("svc04_nubc_revenuecode")
    public String getSvc04NubcRevenuecode() {
        return svc04NubcRevenuecode;
    }

    @JsonProperty("svc04_nubc_revenuecode")
    public void setSvc04NubcRevenuecode(String svc04NubcRevenuecode) {
        this.svc04NubcRevenuecode = svc04NubcRevenuecode;
    }

    public ServicePaymentInformation withSvc04NubcRevenuecode(String svc04NubcRevenuecode) {
        this.svc04NubcRevenuecode = svc04NubcRevenuecode;
        return this;
    }

    @JsonProperty("svc05_unitsofservicepaidcount")
    public String getSvc05Unitsofservicepaidcount() {
        return svc05Unitsofservicepaidcount;
    }

    @JsonProperty("svc05_unitsofservicepaidcount")
    public void setSvc05Unitsofservicepaidcount(String svc05Unitsofservicepaidcount) {
        this.svc05Unitsofservicepaidcount = svc05Unitsofservicepaidcount;
    }

    public ServicePaymentInformation withSvc05Unitsofservicepaidcount(String svc05Unitsofservicepaidcount) {
        this.svc05Unitsofservicepaidcount = svc05Unitsofservicepaidcount;
        return this;
    }

    @JsonProperty("svc06_submittedproductcommedprociden")
    public String getSvc06Submittedproductcommedprociden() {
        return svc06Submittedproductcommedprociden;
    }

    @JsonProperty("svc06_submittedproductcommedprociden")
    public void setSvc06Submittedproductcommedprociden(String svc06Submittedproductcommedprociden) {
        this.svc06Submittedproductcommedprociden = svc06Submittedproductcommedprociden;
    }

    public ServicePaymentInformation withSvc06Submittedproductcommedprociden(String svc06Submittedproductcommedprociden) {
        this.svc06Submittedproductcommedprociden = svc06Submittedproductcommedprociden;
        return this;
    }

    @JsonProperty("svc06_01_submittedproductserviceidqlfr")
    public String getSvc0601Submittedproductserviceidqlfr() {
        return svc0601Submittedproductserviceidqlfr;
    }

    @JsonProperty("svc06_01_submittedproductserviceidqlfr")
    public void setSvc0601Submittedproductserviceidqlfr(String svc0601Submittedproductserviceidqlfr) {
        this.svc0601Submittedproductserviceidqlfr = svc0601Submittedproductserviceidqlfr;
    }

    public ServicePaymentInformation withSvc0601Submittedproductserviceidqlfr(String svc0601Submittedproductserviceidqlfr) {
        this.svc0601Submittedproductserviceidqlfr = svc0601Submittedproductserviceidqlfr;
        return this;
    }

    @JsonProperty("svc06_02_submittedprocedurecode")
    public String getSvc0602Submittedprocedurecode() {
        return svc0602Submittedprocedurecode;
    }

    @JsonProperty("svc06_02_submittedprocedurecode")
    public void setSvc0602Submittedprocedurecode(String svc0602Submittedprocedurecode) {
        this.svc0602Submittedprocedurecode = svc0602Submittedprocedurecode;
    }

    public ServicePaymentInformation withSvc0602Submittedprocedurecode(String svc0602Submittedprocedurecode) {
        this.svc0602Submittedprocedurecode = svc0602Submittedprocedurecode;
        return this;
    }

    @JsonProperty("svc06_03_submittedproceduremodifier1")
    public String getSvc0603Submittedproceduremodifier1() {
        return svc0603Submittedproceduremodifier1;
    }

    @JsonProperty("svc06_03_submittedproceduremodifier1")
    public void setSvc0603Submittedproceduremodifier1(String svc0603Submittedproceduremodifier1) {
        this.svc0603Submittedproceduremodifier1 = svc0603Submittedproceduremodifier1;
    }

    public ServicePaymentInformation withSvc0603Submittedproceduremodifier1(String svc0603Submittedproceduremodifier1) {
        this.svc0603Submittedproceduremodifier1 = svc0603Submittedproceduremodifier1;
        return this;
    }

    @JsonProperty("svc06_04_submittedproceduremodifier2")
    public String getSvc0604Submittedproceduremodifier2() {
        return svc0604Submittedproceduremodifier2;
    }

    @JsonProperty("svc06_04_submittedproceduremodifier2")
    public void setSvc0604Submittedproceduremodifier2(String svc0604Submittedproceduremodifier2) {
        this.svc0604Submittedproceduremodifier2 = svc0604Submittedproceduremodifier2;
    }

    public ServicePaymentInformation withSvc0604Submittedproceduremodifier2(String svc0604Submittedproceduremodifier2) {
        this.svc0604Submittedproceduremodifier2 = svc0604Submittedproceduremodifier2;
        return this;
    }

    @JsonProperty("svc06_05_submittedproceduremodifier3")
    public String getSvc0605Submittedproceduremodifier3() {
        return svc0605Submittedproceduremodifier3;
    }

    @JsonProperty("svc06_05_submittedproceduremodifier3")
    public void setSvc0605Submittedproceduremodifier3(String svc0605Submittedproceduremodifier3) {
        this.svc0605Submittedproceduremodifier3 = svc0605Submittedproceduremodifier3;
    }

    public ServicePaymentInformation withSvc0605Submittedproceduremodifier3(String svc0605Submittedproceduremodifier3) {
        this.svc0605Submittedproceduremodifier3 = svc0605Submittedproceduremodifier3;
        return this;
    }

    @JsonProperty("svc06_06_submittedproceduremodifier4")
    public String getSvc0606Submittedproceduremodifier4() {
        return svc0606Submittedproceduremodifier4;
    }

    @JsonProperty("svc06_06_submittedproceduremodifier4")
    public void setSvc0606Submittedproceduremodifier4(String svc0606Submittedproceduremodifier4) {
        this.svc0606Submittedproceduremodifier4 = svc0606Submittedproceduremodifier4;
    }

    public ServicePaymentInformation withSvc0606Submittedproceduremodifier4(String svc0606Submittedproceduremodifier4) {
        this.svc0606Submittedproceduremodifier4 = svc0606Submittedproceduremodifier4;
        return this;
    }

    @JsonProperty("svc06_07_submittedprocedurecodedesc")
    public String getSvc0607Submittedprocedurecodedesc() {
        return svc0607Submittedprocedurecodedesc;
    }

    @JsonProperty("svc06_07_submittedprocedurecodedesc")
    public void setSvc0607Submittedprocedurecodedesc(String svc0607Submittedprocedurecodedesc) {
        this.svc0607Submittedprocedurecodedesc = svc0607Submittedprocedurecodedesc;
    }

    public ServicePaymentInformation withSvc0607Submittedprocedurecodedesc(String svc0607Submittedprocedurecodedesc) {
        this.svc0607Submittedprocedurecodedesc = svc0607Submittedprocedurecodedesc;
        return this;
    }

    @JsonProperty("svc07_originalunitsofservicecount")
    public String getSvc07Originalunitsofservicecount() {
        return svc07Originalunitsofservicecount;
    }

    @JsonProperty("svc07_originalunitsofservicecount")
    public void setSvc07Originalunitsofservicecount(String svc07Originalunitsofservicecount) {
        this.svc07Originalunitsofservicecount = svc07Originalunitsofservicecount;
    }

    public ServicePaymentInformation withSvc07Originalunitsofservicecount(String svc07Originalunitsofservicecount) {
        this.svc07Originalunitsofservicecount = svc07Originalunitsofservicecount;
        return this;
    }

    @JsonProperty("dtm01_servicedatetimeqlfr")
    public String getDtm01Servicedatetimeqlfr() {
        return dtm01Servicedatetimeqlfr;
    }

    @JsonProperty("dtm01_servicedatetimeqlfr")
    public void setDtm01Servicedatetimeqlfr(String dtm01Servicedatetimeqlfr) {
        this.dtm01Servicedatetimeqlfr = dtm01Servicedatetimeqlfr;
    }

    public ServicePaymentInformation withDtm01Servicedatetimeqlfr(String dtm01Servicedatetimeqlfr) {
        this.dtm01Servicedatetimeqlfr = dtm01Servicedatetimeqlfr;
        return this;
    }

    @JsonProperty("dtm02_serviceperiodstartendsvcdate")
    public String getDtm02Serviceperiodstartendsvcdate() {
        return dtm02Serviceperiodstartendsvcdate;
    }

    @JsonProperty("dtm02_serviceperiodstartendsvcdate")
    public void setDtm02Serviceperiodstartendsvcdate(String dtm02Serviceperiodstartendsvcdate) {
        this.dtm02Serviceperiodstartendsvcdate = dtm02Serviceperiodstartendsvcdate;
    }

    public ServicePaymentInformation withDtm02Serviceperiodstartendsvcdate(String dtm02Serviceperiodstartendsvcdate) {
        this.dtm02Serviceperiodstartendsvcdate = dtm02Serviceperiodstartendsvcdate;
        return this;
    }

    @JsonProperty("clmadjudicationinfo")
    public List<Clmadjudicationinfo_> getClmadjudicationinfo() {
        return clmadjudicationinfo;
    }

    @JsonProperty("clmadjudicationinfo")
    public void setClmadjudicationinfo(List<Clmadjudicationinfo_> clmadjudicationinfo) {
        this.clmadjudicationinfo = clmadjudicationinfo;
    }

    public ServicePaymentInformation withClmadjudicationinfo(List<Clmadjudicationinfo_> clmadjudicationinfo) {
        this.clmadjudicationinfo = clmadjudicationinfo;
        return this;
    }

    @JsonProperty("ref01_provideridqlfr")
    public String getRef01Provideridqlfr() {
        return ref01Provideridqlfr;
    }

    @JsonProperty("ref01_provideridqlfr")
    public void setRef01Provideridqlfr(String ref01Provideridqlfr) {
        this.ref01Provideridqlfr = ref01Provideridqlfr;
    }

    public ServicePaymentInformation withRef01Provideridqlfr(String ref01Provideridqlfr) {
        this.ref01Provideridqlfr = ref01Provideridqlfr;
        return this;
    }

    @JsonProperty("ref02_provideridentifier")
    public String getRef02Provideridentifier() {
        return ref02Provideridentifier;
    }

    @JsonProperty("ref02_provideridentifier")
    public void setRef02Provideridentifier(String ref02Provideridentifier) {
        this.ref02Provideridentifier = ref02Provideridentifier;
    }

    public ServicePaymentInformation withRef02Provideridentifier(String ref02Provideridentifier) {
        this.ref02Provideridentifier = ref02Provideridentifier;
        return this;
    }

    @JsonProperty("ref01_lineitemcontrolnumberidenqlfr")
    public String getRef01Lineitemcontrolnumberidenqlfr() {
        return ref01Lineitemcontrolnumberidenqlfr;
    }

    @JsonProperty("ref01_lineitemcontrolnumberidenqlfr")
    public void setRef01Lineitemcontrolnumberidenqlfr(String ref01Lineitemcontrolnumberidenqlfr) {
        this.ref01Lineitemcontrolnumberidenqlfr = ref01Lineitemcontrolnumberidenqlfr;
    }

    public ServicePaymentInformation withRef01Lineitemcontrolnumberidenqlfr(String ref01Lineitemcontrolnumberidenqlfr) {
        this.ref01Lineitemcontrolnumberidenqlfr = ref01Lineitemcontrolnumberidenqlfr;
        return this;
    }

    @JsonProperty("ref02_lineitemcontrolnumber")
    public String getRef02Lineitemcontrolnumber() {
        return ref02Lineitemcontrolnumber;
    }

    @JsonProperty("ref02_lineitemcontrolnumber")
    public void setRef02Lineitemcontrolnumber(String ref02Lineitemcontrolnumber) {
        this.ref02Lineitemcontrolnumber = ref02Lineitemcontrolnumber;
    }

    public ServicePaymentInformation withRef02Lineitemcontrolnumber(String ref02Lineitemcontrolnumber) {
        this.ref02Lineitemcontrolnumber = ref02Lineitemcontrolnumber;
        return this;
    }

    @JsonProperty("ref01_renderingprovideridqlfr")
    public String getRef01Renderingprovideridqlfr() {
        return ref01Renderingprovideridqlfr;
    }

    @JsonProperty("ref01_renderingprovideridqlfr")
    public void setRef01Renderingprovideridqlfr(String ref01Renderingprovideridqlfr) {
        this.ref01Renderingprovideridqlfr = ref01Renderingprovideridqlfr;
    }

    public ServicePaymentInformation withRef01Renderingprovideridqlfr(String ref01Renderingprovideridqlfr) {
        this.ref01Renderingprovideridqlfr = ref01Renderingprovideridqlfr;
        return this;
    }

    @JsonProperty("ref02_renderingprovideridentifier")
    public String getRef02Renderingprovideridentifier() {
        return ref02Renderingprovideridentifier;
    }

    @JsonProperty("ref02_renderingprovideridentifier")
    public void setRef02Renderingprovideridentifier(String ref02Renderingprovideridentifier) {
        this.ref02Renderingprovideridentifier = ref02Renderingprovideridentifier;
    }

    public ServicePaymentInformation withRef02Renderingprovideridentifier(String ref02Renderingprovideridentifier) {
        this.ref02Renderingprovideridentifier = ref02Renderingprovideridentifier;
        return this;
    }

    @JsonProperty("ref01_healthcarepolicyidenqlfr")
    public String getRef01Healthcarepolicyidenqlfr() {
        return ref01Healthcarepolicyidenqlfr;
    }

    @JsonProperty("ref01_healthcarepolicyidenqlfr")
    public void setRef01Healthcarepolicyidenqlfr(String ref01Healthcarepolicyidenqlfr) {
        this.ref01Healthcarepolicyidenqlfr = ref01Healthcarepolicyidenqlfr;
    }

    public ServicePaymentInformation withRef01Healthcarepolicyidenqlfr(String ref01Healthcarepolicyidenqlfr) {
        this.ref01Healthcarepolicyidenqlfr = ref01Healthcarepolicyidenqlfr;
        return this;
    }

    @JsonProperty("ref02_healthcarepolicyidentification")
    public String getRef02Healthcarepolicyidentification() {
        return ref02Healthcarepolicyidentification;
    }

    @JsonProperty("ref02_healthcarepolicyidentification")
    public void setRef02Healthcarepolicyidentification(String ref02Healthcarepolicyidentification) {
        this.ref02Healthcarepolicyidentification = ref02Healthcarepolicyidentification;
    }

    public ServicePaymentInformation withRef02Healthcarepolicyidentification(String ref02Healthcarepolicyidentification) {
        this.ref02Healthcarepolicyidentification = ref02Healthcarepolicyidentification;
        return this;
    }

    @JsonProperty("amt01_servicesupplementalqlfr")
    public String getAmt01Servicesupplementalqlfr() {
        return amt01Servicesupplementalqlfr;
    }

    @JsonProperty("amt01_servicesupplementalqlfr")
    public void setAmt01Servicesupplementalqlfr(String amt01Servicesupplementalqlfr) {
        this.amt01Servicesupplementalqlfr = amt01Servicesupplementalqlfr;
    }

    public ServicePaymentInformation withAmt01Servicesupplementalqlfr(String amt01Servicesupplementalqlfr) {
        this.amt01Servicesupplementalqlfr = amt01Servicesupplementalqlfr;
        return this;
    }

    @JsonProperty("amt02_servicesupplementalamount")
    public String getAmt02Servicesupplementalamount() {
        return amt02Servicesupplementalamount;
    }

    @JsonProperty("amt02_servicesupplementalamount")
    public void setAmt02Servicesupplementalamount(String amt02Servicesupplementalamount) {
        this.amt02Servicesupplementalamount = amt02Servicesupplementalamount;
    }

    public ServicePaymentInformation withAmt02Servicesupplementalamount(String amt02Servicesupplementalamount) {
        this.amt02Servicesupplementalamount = amt02Servicesupplementalamount;
        return this;
    }

    @JsonProperty("qty01_servsupplemntquantityqlfr")
    public String getQty01Servsupplemntquantityqlfr() {
        return qty01Servsupplemntquantityqlfr;
    }

    @JsonProperty("qty01_servsupplemntquantityqlfr")
    public void setQty01Servsupplemntquantityqlfr(String qty01Servsupplemntquantityqlfr) {
        this.qty01Servsupplemntquantityqlfr = qty01Servsupplemntquantityqlfr;
    }

    public ServicePaymentInformation withQty01Servsupplemntquantityqlfr(String qty01Servsupplemntquantityqlfr) {
        this.qty01Servsupplemntquantityqlfr = qty01Servsupplemntquantityqlfr;
        return this;
    }

    @JsonProperty("qty02_servsupplemntquantitycount")
    public String getQty02Servsupplemntquantitycount() {
        return qty02Servsupplemntquantitycount;
    }

    @JsonProperty("qty02_servsupplemntquantitycount")
    public void setQty02Servsupplemntquantitycount(String qty02Servsupplemntquantitycount) {
        this.qty02Servsupplemntquantitycount = qty02Servsupplemntquantitycount;
    }

    public ServicePaymentInformation withQty02Servsupplemntquantitycount(String qty02Servsupplemntquantitycount) {
        this.qty02Servsupplemntquantitycount = qty02Servsupplemntquantitycount;
        return this;
    }

    @JsonProperty("lq01_remarkcodeqlfr")
    public String getLq01Remarkcodeqlfr() {
        return lq01Remarkcodeqlfr;
    }

    @JsonProperty("lq01_remarkcodeqlfr")
    public void setLq01Remarkcodeqlfr(String lq01Remarkcodeqlfr) {
        this.lq01Remarkcodeqlfr = lq01Remarkcodeqlfr;
    }

    public ServicePaymentInformation withLq01Remarkcodeqlfr(String lq01Remarkcodeqlfr) {
        this.lq01Remarkcodeqlfr = lq01Remarkcodeqlfr;
        return this;
    }

    @JsonProperty("lq02_remarkcode")
    public String getLq02Remarkcode() {
        return lq02Remarkcode;
    }

    @JsonProperty("lq02_remarkcode")
    public void setLq02Remarkcode(String lq02Remarkcode) {
        this.lq02Remarkcode = lq02Remarkcode;
    }

    public ServicePaymentInformation withLq02Remarkcode(String lq02Remarkcode) {
        this.lq02Remarkcode = lq02Remarkcode;
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

    public ServicePaymentInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tPaySlId).append(payClaimpId).append(svc01Adjudicatedmedicalprocinfo).append(svc0101Adjudicatedproductserviceidqlfr).append(svc0102Adjudicatedprocedurecode).append(svc0103Adjudicatedproceduremodifier1).append(svc0104Adjudicatedproceduremodifier2).append(svc0105Adjudicatedproceduremodifier3).append(svc0106Adjudicatedproceduremodifier4).append(svc02Lineitemchargeamount).append(svc03Lineitemproviderpaymentamount).append(svc04NubcRevenuecode).append(svc05Unitsofservicepaidcount).append(svc06Submittedproductcommedprociden).append(svc0601Submittedproductserviceidqlfr).append(svc0602Submittedprocedurecode).append(svc0603Submittedproceduremodifier1).append(svc0604Submittedproceduremodifier2).append(svc0605Submittedproceduremodifier3).append(svc0606Submittedproceduremodifier4).append(svc0607Submittedprocedurecodedesc).append(svc07Originalunitsofservicecount).append(dtm01Servicedatetimeqlfr).append(dtm02Serviceperiodstartendsvcdate).append(clmadjudicationinfo).append(ref01Provideridqlfr).append(ref02Provideridentifier).append(ref01Lineitemcontrolnumberidenqlfr).append(ref02Lineitemcontrolnumber).append(ref01Renderingprovideridqlfr).append(ref02Renderingprovideridentifier).append(ref01Healthcarepolicyidenqlfr).append(ref02Healthcarepolicyidentification).append(amt01Servicesupplementalqlfr).append(amt02Servicesupplementalamount).append(qty01Servsupplemntquantityqlfr).append(qty02Servsupplemntquantitycount).append(lq01Remarkcodeqlfr).append(lq02Remarkcode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServicePaymentInformation) == false) {
            return false;
        }
        ServicePaymentInformation rhs = ((ServicePaymentInformation) other);
        return new EqualsBuilder().append(tPaySlId, rhs.tPaySlId).append(payClaimpId, rhs.payClaimpId).append(svc01Adjudicatedmedicalprocinfo, rhs.svc01Adjudicatedmedicalprocinfo).append(svc0101Adjudicatedproductserviceidqlfr, rhs.svc0101Adjudicatedproductserviceidqlfr).append(svc0102Adjudicatedprocedurecode, rhs.svc0102Adjudicatedprocedurecode).append(svc0103Adjudicatedproceduremodifier1, rhs.svc0103Adjudicatedproceduremodifier1).append(svc0104Adjudicatedproceduremodifier2, rhs.svc0104Adjudicatedproceduremodifier2).append(svc0105Adjudicatedproceduremodifier3, rhs.svc0105Adjudicatedproceduremodifier3).append(svc0106Adjudicatedproceduremodifier4, rhs.svc0106Adjudicatedproceduremodifier4).append(svc02Lineitemchargeamount, rhs.svc02Lineitemchargeamount).append(svc03Lineitemproviderpaymentamount, rhs.svc03Lineitemproviderpaymentamount).append(svc04NubcRevenuecode, rhs.svc04NubcRevenuecode).append(svc05Unitsofservicepaidcount, rhs.svc05Unitsofservicepaidcount).append(svc06Submittedproductcommedprociden, rhs.svc06Submittedproductcommedprociden).append(svc0601Submittedproductserviceidqlfr, rhs.svc0601Submittedproductserviceidqlfr).append(svc0602Submittedprocedurecode, rhs.svc0602Submittedprocedurecode).append(svc0603Submittedproceduremodifier1, rhs.svc0603Submittedproceduremodifier1).append(svc0604Submittedproceduremodifier2, rhs.svc0604Submittedproceduremodifier2).append(svc0605Submittedproceduremodifier3, rhs.svc0605Submittedproceduremodifier3).append(svc0606Submittedproceduremodifier4, rhs.svc0606Submittedproceduremodifier4).append(svc0607Submittedprocedurecodedesc, rhs.svc0607Submittedprocedurecodedesc).append(svc07Originalunitsofservicecount, rhs.svc07Originalunitsofservicecount).append(dtm01Servicedatetimeqlfr, rhs.dtm01Servicedatetimeqlfr).append(dtm02Serviceperiodstartendsvcdate, rhs.dtm02Serviceperiodstartendsvcdate).append(clmadjudicationinfo, rhs.clmadjudicationinfo).append(ref01Provideridqlfr, rhs.ref01Provideridqlfr).append(ref02Provideridentifier, rhs.ref02Provideridentifier).append(ref01Lineitemcontrolnumberidenqlfr, rhs.ref01Lineitemcontrolnumberidenqlfr).append(ref02Lineitemcontrolnumber, rhs.ref02Lineitemcontrolnumber).append(ref01Renderingprovideridqlfr, rhs.ref01Renderingprovideridqlfr).append(ref02Renderingprovideridentifier, rhs.ref02Renderingprovideridentifier).append(ref01Healthcarepolicyidenqlfr, rhs.ref01Healthcarepolicyidenqlfr).append(ref02Healthcarepolicyidentification, rhs.ref02Healthcarepolicyidentification).append(amt01Servicesupplementalqlfr, rhs.amt01Servicesupplementalqlfr).append(amt02Servicesupplementalamount, rhs.amt02Servicesupplementalamount).append(qty01Servsupplemntquantityqlfr, rhs.qty01Servsupplemntquantityqlfr).append(qty02Servsupplemntquantitycount, rhs.qty02Servsupplemntquantitycount).append(lq01Remarkcodeqlfr, rhs.lq01Remarkcodeqlfr).append(lq02Remarkcode, rhs.lq02Remarkcode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

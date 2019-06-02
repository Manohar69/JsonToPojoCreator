
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
    "pay_claimp_id",
    "pay_detail_id",
    "clp01_patientcontrolnumber",
    "clp02_claimstatuscode",
    "clp03_totalclaimchargeamount",
    "clp04_claimpaymentamount",
    "clp05_patientrespamount",
    "clp06_claimfilingindicatorcode",
    "clp07_payerclaimcontrolnumber",
    "clp08_facilitytypecode",
    "clp09_claimfrequencycode",
    "clp11_diagrelgroupdrgcode",
    "clp12_diagrelgroupdrgweight",
    "clp13_dischargefraction",
    "clmadjudicationinfo",
    "nm101_patientidencode",
    "nm102_patienttypequal",
    "nm103_patientlastname",
    "nm104_patientfirstname",
    "nm105_patientmiddlename",
    "nm107_patientnamesuffix",
    "nm108_patientidcodeqlfr",
    "nm109_patientidentifier",
    "nm101_subscriberentityidencode",
    "nm102_subscriberentitytypeqlfr",
    "nm103_subscriberlastorgname",
    "nm104_subscriberfirstname",
    "nm105_subscribermiddlename",
    "nm107_subscribernamesuffix",
    "nm108_subscriberidcodeqlfr",
    "nm109_subscriberidentifier",
    "nm101_corrinsuredidencode",
    "nm102_corrinsuredqlfr",
    "nm103_corrinsuredlastname",
    "nm104_corrinsuredfirstname",
    "nm105_corrinsuredmiddlename",
    "nm107_corrinsurednamesuffix",
    "nm108_corrinsuredidencodeqlfr",
    "nm109_corrinsuredidindicator",
    "nm101_renderingprovidencode",
    "nm102_renderingprovtypeqlfr",
    "nm103_renderingprovlastorgname",
    "nm104_renderingprovfirstname",
    "nm105_renderingprovmiddlename",
    "nm107_renderingprovnamesuffix",
    "nm108_renderingprovidcodeqlfr",
    "nm109_renderingprovidentifier",
    "nm101_coordbenftsidencode",
    "nm102_coordbenfttypeqlfr",
    "nm103_coordbenftscarriername",
    "nm108_coordbenftscarrieridqlfr",
    "nm109_coordbenftscarrierid",
    "nm101_corrpriorityidencode",
    "nm102_corrprioritytypeqlfr",
    "nm103_corrprioritypayername",
    "nm108_corrprtyypayeridcodeqlfr",
    "nm109_corrprtypayernameid",
    "nm101_othsubscbridencode",
    "nm102_othsubscbrtypeqlfr",
    "nm103_othsubscbrlastname",
    "nm104_othsubscbrfirstname",
    "nm105_othsubscbrmiddlename",
    "nm107_othsubscbrnamesuffix",
    "nm108_othsubscbridcodeqlfr",
    "nm109_othsubscbridentifier",
    "mia01_covereddaysorvisitscount",
    "mia02_ppsoperoutlieramount",
    "mia03_lifetimepsychdayscount",
    "mia04_claimdrgamount",
    "mia05_claimpaymentremarkcode",
    "mia06_claimdisproportshareamnt",
    "mia07_claimmsppassthruamount",
    "mia08_claimppscapitalamount",
    "mia09_ppscapitalfspdrgamount",
    "mia10_ppscapitalhspdrgamount",
    "mia11_ppscapitaldshdrgamount",
    "mia12_oldcapitalamount",
    "mia13_ppscapitalimeamount",
    "mia14_ppsoperhsptlspecdrgamnt",
    "mia15_costreportdaycount",
    "mia16__ppsoperatfedspecdrgamnt",
    "mia17_claimppscapitloutlramnt",
    "mia18_claimindirectteachamnt",
    "mia19_nonpaybleprofcompontamnt",
    "mia20_claimpaymentremarkcode1",
    "mia21_claimpaymentremarkcode2",
    "mia22_claimpaymentremarkcode3",
    "mia23_claimpaymentremarkcode4",
    "mia24_ppscapitalexceptamount",
    "moa01_reimbursementrate",
    "moa02_claimhcpcspayableamount",
    "moa03_claimpaymentremarkcode1",
    "moa04_claimpaymentremarkcode2",
    "moa05_claimpaymentremarkcode3",
    "moa06_claimpaymentremarkcode4",
    "moa07_claimpaymentremarkcode5",
    "moa08_claimesrdpaymentamount",
    "moa09_nonpayprofcompontamnt",
    "ref01_othclaimrelatedidqlfr",
    "ref02_othclaimrelatedidentifr",
    "ref01_rndrprovscndryidqlfr",
    "ref02_rndrprovscndryid",
    "dtm01_claimdatetimeqlfr",
    "dtm02_claimstartorenddate",
    "dtm01_coverageexpirationdatetimeqlfr",
    "dtm02_coverageexpirationdate",
    "dtm01_claimreceiveddatetimeqlfr",
    "dtm02_claimreceiveddate",
    "per01_claimcontactfunccode",
    "per02_claimcontactname",
    "per03_claimcommnoqlfr",
    "per04_claimcontactcommno",
    "per05_claimcommnoqlfr",
    "per06_claimcontactsecondcommno",
    "per07_claimcommnoqlfr",
    "per08_claimcontactcommnoextnno",
    "amt01_claimsupplmntinfoqlfr",
    "amt02_claimsupplmntinfoamnt",
    "qty01_claimsupplmntinfoqtyqlfr",
    "qty02_claimsupplmntinfoqty",
    "service_payment_information"
})
public class ClaimPaymentInfo {

    @JsonProperty("pay_claimp_id")
    private Integer payClaimpId;
    @JsonProperty("pay_detail_id")
    private Integer payDetailId;
    @JsonProperty("clp01_patientcontrolnumber")
    private String clp01Patientcontrolnumber;
    @JsonProperty("clp02_claimstatuscode")
    private String clp02Claimstatuscode;
    @JsonProperty("clp03_totalclaimchargeamount")
    private String clp03Totalclaimchargeamount;
    @JsonProperty("clp04_claimpaymentamount")
    private String clp04Claimpaymentamount;
    @JsonProperty("clp05_patientrespamount")
    private String clp05Patientrespamount;
    @JsonProperty("clp06_claimfilingindicatorcode")
    private String clp06Claimfilingindicatorcode;
    @JsonProperty("clp07_payerclaimcontrolnumber")
    private String clp07Payerclaimcontrolnumber;
    @JsonProperty("clp08_facilitytypecode")
    private String clp08Facilitytypecode;
    @JsonProperty("clp09_claimfrequencycode")
    private String clp09Claimfrequencycode;
    @JsonProperty("clp11_diagrelgroupdrgcode")
    private String clp11Diagrelgroupdrgcode;
    @JsonProperty("clp12_diagrelgroupdrgweight")
    private String clp12Diagrelgroupdrgweight;
    @JsonProperty("clp13_dischargefraction")
    private String clp13Dischargefraction;
    @JsonProperty("clmadjudicationinfo")
    private List<Clmadjudicationinfo> clmadjudicationinfo = new ArrayList<Clmadjudicationinfo>();
    @JsonProperty("nm101_patientidencode")
    private String nm101Patientidencode;
    @JsonProperty("nm102_patienttypequal")
    private String nm102Patienttypequal;
    @JsonProperty("nm103_patientlastname")
    private String nm103Patientlastname;
    @JsonProperty("nm104_patientfirstname")
    private String nm104Patientfirstname;
    @JsonProperty("nm105_patientmiddlename")
    private String nm105Patientmiddlename;
    @JsonProperty("nm107_patientnamesuffix")
    private String nm107Patientnamesuffix;
    @JsonProperty("nm108_patientidcodeqlfr")
    private String nm108Patientidcodeqlfr;
    @JsonProperty("nm109_patientidentifier")
    private String nm109Patientidentifier;
    @JsonProperty("nm101_subscriberentityidencode")
    private String nm101Subscriberentityidencode;
    @JsonProperty("nm102_subscriberentitytypeqlfr")
    private String nm102Subscriberentitytypeqlfr;
    @JsonProperty("nm103_subscriberlastorgname")
    private String nm103Subscriberlastorgname;
    @JsonProperty("nm104_subscriberfirstname")
    private String nm104Subscriberfirstname;
    @JsonProperty("nm105_subscribermiddlename")
    private String nm105Subscribermiddlename;
    @JsonProperty("nm107_subscribernamesuffix")
    private String nm107Subscribernamesuffix;
    @JsonProperty("nm108_subscriberidcodeqlfr")
    private String nm108Subscriberidcodeqlfr;
    @JsonProperty("nm109_subscriberidentifier")
    private String nm109Subscriberidentifier;
    @JsonProperty("nm101_corrinsuredidencode")
    private String nm101Corrinsuredidencode;
    @JsonProperty("nm102_corrinsuredqlfr")
    private String nm102Corrinsuredqlfr;
    @JsonProperty("nm103_corrinsuredlastname")
    private String nm103Corrinsuredlastname;
    @JsonProperty("nm104_corrinsuredfirstname")
    private String nm104Corrinsuredfirstname;
    @JsonProperty("nm105_corrinsuredmiddlename")
    private String nm105Corrinsuredmiddlename;
    @JsonProperty("nm107_corrinsurednamesuffix")
    private String nm107Corrinsurednamesuffix;
    @JsonProperty("nm108_corrinsuredidencodeqlfr")
    private String nm108Corrinsuredidencodeqlfr;
    @JsonProperty("nm109_corrinsuredidindicator")
    private String nm109Corrinsuredidindicator;
    @JsonProperty("nm101_renderingprovidencode")
    private String nm101Renderingprovidencode;
    @JsonProperty("nm102_renderingprovtypeqlfr")
    private String nm102Renderingprovtypeqlfr;
    @JsonProperty("nm103_renderingprovlastorgname")
    private String nm103Renderingprovlastorgname;
    @JsonProperty("nm104_renderingprovfirstname")
    private String nm104Renderingprovfirstname;
    @JsonProperty("nm105_renderingprovmiddlename")
    private String nm105Renderingprovmiddlename;
    @JsonProperty("nm107_renderingprovnamesuffix")
    private String nm107Renderingprovnamesuffix;
    @JsonProperty("nm108_renderingprovidcodeqlfr")
    private String nm108Renderingprovidcodeqlfr;
    @JsonProperty("nm109_renderingprovidentifier")
    private String nm109Renderingprovidentifier;
    @JsonProperty("nm101_coordbenftsidencode")
    private String nm101Coordbenftsidencode;
    @JsonProperty("nm102_coordbenfttypeqlfr")
    private String nm102Coordbenfttypeqlfr;
    @JsonProperty("nm103_coordbenftscarriername")
    private String nm103Coordbenftscarriername;
    @JsonProperty("nm108_coordbenftscarrieridqlfr")
    private String nm108Coordbenftscarrieridqlfr;
    @JsonProperty("nm109_coordbenftscarrierid")
    private String nm109Coordbenftscarrierid;
    @JsonProperty("nm101_corrpriorityidencode")
    private String nm101Corrpriorityidencode;
    @JsonProperty("nm102_corrprioritytypeqlfr")
    private String nm102Corrprioritytypeqlfr;
    @JsonProperty("nm103_corrprioritypayername")
    private String nm103Corrprioritypayername;
    @JsonProperty("nm108_corrprtyypayeridcodeqlfr")
    private String nm108Corrprtyypayeridcodeqlfr;
    @JsonProperty("nm109_corrprtypayernameid")
    private String nm109Corrprtypayernameid;
    @JsonProperty("nm101_othsubscbridencode")
    private String nm101Othsubscbridencode;
    @JsonProperty("nm102_othsubscbrtypeqlfr")
    private String nm102Othsubscbrtypeqlfr;
    @JsonProperty("nm103_othsubscbrlastname")
    private String nm103Othsubscbrlastname;
    @JsonProperty("nm104_othsubscbrfirstname")
    private String nm104Othsubscbrfirstname;
    @JsonProperty("nm105_othsubscbrmiddlename")
    private String nm105Othsubscbrmiddlename;
    @JsonProperty("nm107_othsubscbrnamesuffix")
    private String nm107Othsubscbrnamesuffix;
    @JsonProperty("nm108_othsubscbridcodeqlfr")
    private String nm108Othsubscbridcodeqlfr;
    @JsonProperty("nm109_othsubscbridentifier")
    private String nm109Othsubscbridentifier;
    @JsonProperty("mia01_covereddaysorvisitscount")
    private String mia01Covereddaysorvisitscount;
    @JsonProperty("mia02_ppsoperoutlieramount")
    private String mia02Ppsoperoutlieramount;
    @JsonProperty("mia03_lifetimepsychdayscount")
    private String mia03Lifetimepsychdayscount;
    @JsonProperty("mia04_claimdrgamount")
    private String mia04Claimdrgamount;
    @JsonProperty("mia05_claimpaymentremarkcode")
    private String mia05Claimpaymentremarkcode;
    @JsonProperty("mia06_claimdisproportshareamnt")
    private String mia06Claimdisproportshareamnt;
    @JsonProperty("mia07_claimmsppassthruamount")
    private String mia07Claimmsppassthruamount;
    @JsonProperty("mia08_claimppscapitalamount")
    private String mia08Claimppscapitalamount;
    @JsonProperty("mia09_ppscapitalfspdrgamount")
    private String mia09Ppscapitalfspdrgamount;
    @JsonProperty("mia10_ppscapitalhspdrgamount")
    private String mia10Ppscapitalhspdrgamount;
    @JsonProperty("mia11_ppscapitaldshdrgamount")
    private String mia11Ppscapitaldshdrgamount;
    @JsonProperty("mia12_oldcapitalamount")
    private String mia12Oldcapitalamount;
    @JsonProperty("mia13_ppscapitalimeamount")
    private String mia13Ppscapitalimeamount;
    @JsonProperty("mia14_ppsoperhsptlspecdrgamnt")
    private String mia14Ppsoperhsptlspecdrgamnt;
    @JsonProperty("mia15_costreportdaycount")
    private String mia15Costreportdaycount;
    @JsonProperty("mia16__ppsoperatfedspecdrgamnt")
    private String mia16Ppsoperatfedspecdrgamnt;
    @JsonProperty("mia17_claimppscapitloutlramnt")
    private String mia17Claimppscapitloutlramnt;
    @JsonProperty("mia18_claimindirectteachamnt")
    private String mia18Claimindirectteachamnt;
    @JsonProperty("mia19_nonpaybleprofcompontamnt")
    private String mia19Nonpaybleprofcompontamnt;
    @JsonProperty("mia20_claimpaymentremarkcode1")
    private String mia20Claimpaymentremarkcode1;
    @JsonProperty("mia21_claimpaymentremarkcode2")
    private String mia21Claimpaymentremarkcode2;
    @JsonProperty("mia22_claimpaymentremarkcode3")
    private String mia22Claimpaymentremarkcode3;
    @JsonProperty("mia23_claimpaymentremarkcode4")
    private String mia23Claimpaymentremarkcode4;
    @JsonProperty("mia24_ppscapitalexceptamount")
    private String mia24Ppscapitalexceptamount;
    @JsonProperty("moa01_reimbursementrate")
    private String moa01Reimbursementrate;
    @JsonProperty("moa02_claimhcpcspayableamount")
    private String moa02Claimhcpcspayableamount;
    @JsonProperty("moa03_claimpaymentremarkcode1")
    private String moa03Claimpaymentremarkcode1;
    @JsonProperty("moa04_claimpaymentremarkcode2")
    private String moa04Claimpaymentremarkcode2;
    @JsonProperty("moa05_claimpaymentremarkcode3")
    private String moa05Claimpaymentremarkcode3;
    @JsonProperty("moa06_claimpaymentremarkcode4")
    private String moa06Claimpaymentremarkcode4;
    @JsonProperty("moa07_claimpaymentremarkcode5")
    private String moa07Claimpaymentremarkcode5;
    @JsonProperty("moa08_claimesrdpaymentamount")
    private String moa08Claimesrdpaymentamount;
    @JsonProperty("moa09_nonpayprofcompontamnt")
    private String moa09Nonpayprofcompontamnt;
    @JsonProperty("ref01_othclaimrelatedidqlfr")
    private String ref01Othclaimrelatedidqlfr;
    @JsonProperty("ref02_othclaimrelatedidentifr")
    private String ref02Othclaimrelatedidentifr;
    @JsonProperty("ref01_rndrprovscndryidqlfr")
    private String ref01Rndrprovscndryidqlfr;
    @JsonProperty("ref02_rndrprovscndryid")
    private String ref02Rndrprovscndryid;
    @JsonProperty("dtm01_claimdatetimeqlfr")
    private String dtm01Claimdatetimeqlfr;
    @JsonProperty("dtm02_claimstartorenddate")
    private String dtm02Claimstartorenddate;
    @JsonProperty("dtm01_coverageexpirationdatetimeqlfr")
    private String dtm01Coverageexpirationdatetimeqlfr;
    @JsonProperty("dtm02_coverageexpirationdate")
    private String dtm02Coverageexpirationdate;
    @JsonProperty("dtm01_claimreceiveddatetimeqlfr")
    private String dtm01Claimreceiveddatetimeqlfr;
    @JsonProperty("dtm02_claimreceiveddate")
    private String dtm02Claimreceiveddate;
    @JsonProperty("per01_claimcontactfunccode")
    private String per01Claimcontactfunccode;
    @JsonProperty("per02_claimcontactname")
    private String per02Claimcontactname;
    @JsonProperty("per03_claimcommnoqlfr")
    private String per03Claimcommnoqlfr;
    @JsonProperty("per04_claimcontactcommno")
    private String per04Claimcontactcommno;
    @JsonProperty("per05_claimcommnoqlfr")
    private String per05Claimcommnoqlfr;
    @JsonProperty("per06_claimcontactsecondcommno")
    private String per06Claimcontactsecondcommno;
    @JsonProperty("per07_claimcommnoqlfr")
    private String per07Claimcommnoqlfr;
    @JsonProperty("per08_claimcontactcommnoextnno")
    private String per08Claimcontactcommnoextnno;
    @JsonProperty("amt01_claimsupplmntinfoqlfr")
    private String amt01Claimsupplmntinfoqlfr;
    @JsonProperty("amt02_claimsupplmntinfoamnt")
    private String amt02Claimsupplmntinfoamnt;
    @JsonProperty("qty01_claimsupplmntinfoqtyqlfr")
    private String qty01Claimsupplmntinfoqtyqlfr;
    @JsonProperty("qty02_claimsupplmntinfoqty")
    private Qty02Claimsupplmntinfoqty qty02Claimsupplmntinfoqty;
    @JsonProperty("service_payment_information")
    private List<ServicePaymentInformation> servicePaymentInformation = new ArrayList<ServicePaymentInformation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pay_claimp_id")
    public Integer getPayClaimpId() {
        return payClaimpId;
    }

    @JsonProperty("pay_claimp_id")
    public void setPayClaimpId(Integer payClaimpId) {
        this.payClaimpId = payClaimpId;
    }

    public ClaimPaymentInfo withPayClaimpId(Integer payClaimpId) {
        this.payClaimpId = payClaimpId;
        return this;
    }

    @JsonProperty("pay_detail_id")
    public Integer getPayDetailId() {
        return payDetailId;
    }

    @JsonProperty("pay_detail_id")
    public void setPayDetailId(Integer payDetailId) {
        this.payDetailId = payDetailId;
    }

    public ClaimPaymentInfo withPayDetailId(Integer payDetailId) {
        this.payDetailId = payDetailId;
        return this;
    }

    @JsonProperty("clp01_patientcontrolnumber")
    public String getClp01Patientcontrolnumber() {
        return clp01Patientcontrolnumber;
    }

    @JsonProperty("clp01_patientcontrolnumber")
    public void setClp01Patientcontrolnumber(String clp01Patientcontrolnumber) {
        this.clp01Patientcontrolnumber = clp01Patientcontrolnumber;
    }

    public ClaimPaymentInfo withClp01Patientcontrolnumber(String clp01Patientcontrolnumber) {
        this.clp01Patientcontrolnumber = clp01Patientcontrolnumber;
        return this;
    }

    @JsonProperty("clp02_claimstatuscode")
    public String getClp02Claimstatuscode() {
        return clp02Claimstatuscode;
    }

    @JsonProperty("clp02_claimstatuscode")
    public void setClp02Claimstatuscode(String clp02Claimstatuscode) {
        this.clp02Claimstatuscode = clp02Claimstatuscode;
    }

    public ClaimPaymentInfo withClp02Claimstatuscode(String clp02Claimstatuscode) {
        this.clp02Claimstatuscode = clp02Claimstatuscode;
        return this;
    }

    @JsonProperty("clp03_totalclaimchargeamount")
    public String getClp03Totalclaimchargeamount() {
        return clp03Totalclaimchargeamount;
    }

    @JsonProperty("clp03_totalclaimchargeamount")
    public void setClp03Totalclaimchargeamount(String clp03Totalclaimchargeamount) {
        this.clp03Totalclaimchargeamount = clp03Totalclaimchargeamount;
    }

    public ClaimPaymentInfo withClp03Totalclaimchargeamount(String clp03Totalclaimchargeamount) {
        this.clp03Totalclaimchargeamount = clp03Totalclaimchargeamount;
        return this;
    }

    @JsonProperty("clp04_claimpaymentamount")
    public String getClp04Claimpaymentamount() {
        return clp04Claimpaymentamount;
    }

    @JsonProperty("clp04_claimpaymentamount")
    public void setClp04Claimpaymentamount(String clp04Claimpaymentamount) {
        this.clp04Claimpaymentamount = clp04Claimpaymentamount;
    }

    public ClaimPaymentInfo withClp04Claimpaymentamount(String clp04Claimpaymentamount) {
        this.clp04Claimpaymentamount = clp04Claimpaymentamount;
        return this;
    }

    @JsonProperty("clp05_patientrespamount")
    public String getClp05Patientrespamount() {
        return clp05Patientrespamount;
    }

    @JsonProperty("clp05_patientrespamount")
    public void setClp05Patientrespamount(String clp05Patientrespamount) {
        this.clp05Patientrespamount = clp05Patientrespamount;
    }

    public ClaimPaymentInfo withClp05Patientrespamount(String clp05Patientrespamount) {
        this.clp05Patientrespamount = clp05Patientrespamount;
        return this;
    }

    @JsonProperty("clp06_claimfilingindicatorcode")
    public String getClp06Claimfilingindicatorcode() {
        return clp06Claimfilingindicatorcode;
    }

    @JsonProperty("clp06_claimfilingindicatorcode")
    public void setClp06Claimfilingindicatorcode(String clp06Claimfilingindicatorcode) {
        this.clp06Claimfilingindicatorcode = clp06Claimfilingindicatorcode;
    }

    public ClaimPaymentInfo withClp06Claimfilingindicatorcode(String clp06Claimfilingindicatorcode) {
        this.clp06Claimfilingindicatorcode = clp06Claimfilingindicatorcode;
        return this;
    }

    @JsonProperty("clp07_payerclaimcontrolnumber")
    public String getClp07Payerclaimcontrolnumber() {
        return clp07Payerclaimcontrolnumber;
    }

    @JsonProperty("clp07_payerclaimcontrolnumber")
    public void setClp07Payerclaimcontrolnumber(String clp07Payerclaimcontrolnumber) {
        this.clp07Payerclaimcontrolnumber = clp07Payerclaimcontrolnumber;
    }

    public ClaimPaymentInfo withClp07Payerclaimcontrolnumber(String clp07Payerclaimcontrolnumber) {
        this.clp07Payerclaimcontrolnumber = clp07Payerclaimcontrolnumber;
        return this;
    }

    @JsonProperty("clp08_facilitytypecode")
    public String getClp08Facilitytypecode() {
        return clp08Facilitytypecode;
    }

    @JsonProperty("clp08_facilitytypecode")
    public void setClp08Facilitytypecode(String clp08Facilitytypecode) {
        this.clp08Facilitytypecode = clp08Facilitytypecode;
    }

    public ClaimPaymentInfo withClp08Facilitytypecode(String clp08Facilitytypecode) {
        this.clp08Facilitytypecode = clp08Facilitytypecode;
        return this;
    }

    @JsonProperty("clp09_claimfrequencycode")
    public String getClp09Claimfrequencycode() {
        return clp09Claimfrequencycode;
    }

    @JsonProperty("clp09_claimfrequencycode")
    public void setClp09Claimfrequencycode(String clp09Claimfrequencycode) {
        this.clp09Claimfrequencycode = clp09Claimfrequencycode;
    }

    public ClaimPaymentInfo withClp09Claimfrequencycode(String clp09Claimfrequencycode) {
        this.clp09Claimfrequencycode = clp09Claimfrequencycode;
        return this;
    }

    @JsonProperty("clp11_diagrelgroupdrgcode")
    public String getClp11Diagrelgroupdrgcode() {
        return clp11Diagrelgroupdrgcode;
    }

    @JsonProperty("clp11_diagrelgroupdrgcode")
    public void setClp11Diagrelgroupdrgcode(String clp11Diagrelgroupdrgcode) {
        this.clp11Diagrelgroupdrgcode = clp11Diagrelgroupdrgcode;
    }

    public ClaimPaymentInfo withClp11Diagrelgroupdrgcode(String clp11Diagrelgroupdrgcode) {
        this.clp11Diagrelgroupdrgcode = clp11Diagrelgroupdrgcode;
        return this;
    }

    @JsonProperty("clp12_diagrelgroupdrgweight")
    public String getClp12Diagrelgroupdrgweight() {
        return clp12Diagrelgroupdrgweight;
    }

    @JsonProperty("clp12_diagrelgroupdrgweight")
    public void setClp12Diagrelgroupdrgweight(String clp12Diagrelgroupdrgweight) {
        this.clp12Diagrelgroupdrgweight = clp12Diagrelgroupdrgweight;
    }

    public ClaimPaymentInfo withClp12Diagrelgroupdrgweight(String clp12Diagrelgroupdrgweight) {
        this.clp12Diagrelgroupdrgweight = clp12Diagrelgroupdrgweight;
        return this;
    }

    @JsonProperty("clp13_dischargefraction")
    public String getClp13Dischargefraction() {
        return clp13Dischargefraction;
    }

    @JsonProperty("clp13_dischargefraction")
    public void setClp13Dischargefraction(String clp13Dischargefraction) {
        this.clp13Dischargefraction = clp13Dischargefraction;
    }

    public ClaimPaymentInfo withClp13Dischargefraction(String clp13Dischargefraction) {
        this.clp13Dischargefraction = clp13Dischargefraction;
        return this;
    }

    @JsonProperty("clmadjudicationinfo")
    public List<Clmadjudicationinfo> getClmadjudicationinfo() {
        return clmadjudicationinfo;
    }

    @JsonProperty("clmadjudicationinfo")
    public void setClmadjudicationinfo(List<Clmadjudicationinfo> clmadjudicationinfo) {
        this.clmadjudicationinfo = clmadjudicationinfo;
    }

    public ClaimPaymentInfo withClmadjudicationinfo(List<Clmadjudicationinfo> clmadjudicationinfo) {
        this.clmadjudicationinfo = clmadjudicationinfo;
        return this;
    }

    @JsonProperty("nm101_patientidencode")
    public String getNm101Patientidencode() {
        return nm101Patientidencode;
    }

    @JsonProperty("nm101_patientidencode")
    public void setNm101Patientidencode(String nm101Patientidencode) {
        this.nm101Patientidencode = nm101Patientidencode;
    }

    public ClaimPaymentInfo withNm101Patientidencode(String nm101Patientidencode) {
        this.nm101Patientidencode = nm101Patientidencode;
        return this;
    }

    @JsonProperty("nm102_patienttypequal")
    public String getNm102Patienttypequal() {
        return nm102Patienttypequal;
    }

    @JsonProperty("nm102_patienttypequal")
    public void setNm102Patienttypequal(String nm102Patienttypequal) {
        this.nm102Patienttypequal = nm102Patienttypequal;
    }

    public ClaimPaymentInfo withNm102Patienttypequal(String nm102Patienttypequal) {
        this.nm102Patienttypequal = nm102Patienttypequal;
        return this;
    }

    @JsonProperty("nm103_patientlastname")
    public String getNm103Patientlastname() {
        return nm103Patientlastname;
    }

    @JsonProperty("nm103_patientlastname")
    public void setNm103Patientlastname(String nm103Patientlastname) {
        this.nm103Patientlastname = nm103Patientlastname;
    }

    public ClaimPaymentInfo withNm103Patientlastname(String nm103Patientlastname) {
        this.nm103Patientlastname = nm103Patientlastname;
        return this;
    }

    @JsonProperty("nm104_patientfirstname")
    public String getNm104Patientfirstname() {
        return nm104Patientfirstname;
    }

    @JsonProperty("nm104_patientfirstname")
    public void setNm104Patientfirstname(String nm104Patientfirstname) {
        this.nm104Patientfirstname = nm104Patientfirstname;
    }

    public ClaimPaymentInfo withNm104Patientfirstname(String nm104Patientfirstname) {
        this.nm104Patientfirstname = nm104Patientfirstname;
        return this;
    }

    @JsonProperty("nm105_patientmiddlename")
    public String getNm105Patientmiddlename() {
        return nm105Patientmiddlename;
    }

    @JsonProperty("nm105_patientmiddlename")
    public void setNm105Patientmiddlename(String nm105Patientmiddlename) {
        this.nm105Patientmiddlename = nm105Patientmiddlename;
    }

    public ClaimPaymentInfo withNm105Patientmiddlename(String nm105Patientmiddlename) {
        this.nm105Patientmiddlename = nm105Patientmiddlename;
        return this;
    }

    @JsonProperty("nm107_patientnamesuffix")
    public String getNm107Patientnamesuffix() {
        return nm107Patientnamesuffix;
    }

    @JsonProperty("nm107_patientnamesuffix")
    public void setNm107Patientnamesuffix(String nm107Patientnamesuffix) {
        this.nm107Patientnamesuffix = nm107Patientnamesuffix;
    }

    public ClaimPaymentInfo withNm107Patientnamesuffix(String nm107Patientnamesuffix) {
        this.nm107Patientnamesuffix = nm107Patientnamesuffix;
        return this;
    }

    @JsonProperty("nm108_patientidcodeqlfr")
    public String getNm108Patientidcodeqlfr() {
        return nm108Patientidcodeqlfr;
    }

    @JsonProperty("nm108_patientidcodeqlfr")
    public void setNm108Patientidcodeqlfr(String nm108Patientidcodeqlfr) {
        this.nm108Patientidcodeqlfr = nm108Patientidcodeqlfr;
    }

    public ClaimPaymentInfo withNm108Patientidcodeqlfr(String nm108Patientidcodeqlfr) {
        this.nm108Patientidcodeqlfr = nm108Patientidcodeqlfr;
        return this;
    }

    @JsonProperty("nm109_patientidentifier")
    public String getNm109Patientidentifier() {
        return nm109Patientidentifier;
    }

    @JsonProperty("nm109_patientidentifier")
    public void setNm109Patientidentifier(String nm109Patientidentifier) {
        this.nm109Patientidentifier = nm109Patientidentifier;
    }

    public ClaimPaymentInfo withNm109Patientidentifier(String nm109Patientidentifier) {
        this.nm109Patientidentifier = nm109Patientidentifier;
        return this;
    }

    @JsonProperty("nm101_subscriberentityidencode")
    public String getNm101Subscriberentityidencode() {
        return nm101Subscriberentityidencode;
    }

    @JsonProperty("nm101_subscriberentityidencode")
    public void setNm101Subscriberentityidencode(String nm101Subscriberentityidencode) {
        this.nm101Subscriberentityidencode = nm101Subscriberentityidencode;
    }

    public ClaimPaymentInfo withNm101Subscriberentityidencode(String nm101Subscriberentityidencode) {
        this.nm101Subscriberentityidencode = nm101Subscriberentityidencode;
        return this;
    }

    @JsonProperty("nm102_subscriberentitytypeqlfr")
    public String getNm102Subscriberentitytypeqlfr() {
        return nm102Subscriberentitytypeqlfr;
    }

    @JsonProperty("nm102_subscriberentitytypeqlfr")
    public void setNm102Subscriberentitytypeqlfr(String nm102Subscriberentitytypeqlfr) {
        this.nm102Subscriberentitytypeqlfr = nm102Subscriberentitytypeqlfr;
    }

    public ClaimPaymentInfo withNm102Subscriberentitytypeqlfr(String nm102Subscriberentitytypeqlfr) {
        this.nm102Subscriberentitytypeqlfr = nm102Subscriberentitytypeqlfr;
        return this;
    }

    @JsonProperty("nm103_subscriberlastorgname")
    public String getNm103Subscriberlastorgname() {
        return nm103Subscriberlastorgname;
    }

    @JsonProperty("nm103_subscriberlastorgname")
    public void setNm103Subscriberlastorgname(String nm103Subscriberlastorgname) {
        this.nm103Subscriberlastorgname = nm103Subscriberlastorgname;
    }

    public ClaimPaymentInfo withNm103Subscriberlastorgname(String nm103Subscriberlastorgname) {
        this.nm103Subscriberlastorgname = nm103Subscriberlastorgname;
        return this;
    }

    @JsonProperty("nm104_subscriberfirstname")
    public String getNm104Subscriberfirstname() {
        return nm104Subscriberfirstname;
    }

    @JsonProperty("nm104_subscriberfirstname")
    public void setNm104Subscriberfirstname(String nm104Subscriberfirstname) {
        this.nm104Subscriberfirstname = nm104Subscriberfirstname;
    }

    public ClaimPaymentInfo withNm104Subscriberfirstname(String nm104Subscriberfirstname) {
        this.nm104Subscriberfirstname = nm104Subscriberfirstname;
        return this;
    }

    @JsonProperty("nm105_subscribermiddlename")
    public String getNm105Subscribermiddlename() {
        return nm105Subscribermiddlename;
    }

    @JsonProperty("nm105_subscribermiddlename")
    public void setNm105Subscribermiddlename(String nm105Subscribermiddlename) {
        this.nm105Subscribermiddlename = nm105Subscribermiddlename;
    }

    public ClaimPaymentInfo withNm105Subscribermiddlename(String nm105Subscribermiddlename) {
        this.nm105Subscribermiddlename = nm105Subscribermiddlename;
        return this;
    }

    @JsonProperty("nm107_subscribernamesuffix")
    public String getNm107Subscribernamesuffix() {
        return nm107Subscribernamesuffix;
    }

    @JsonProperty("nm107_subscribernamesuffix")
    public void setNm107Subscribernamesuffix(String nm107Subscribernamesuffix) {
        this.nm107Subscribernamesuffix = nm107Subscribernamesuffix;
    }

    public ClaimPaymentInfo withNm107Subscribernamesuffix(String nm107Subscribernamesuffix) {
        this.nm107Subscribernamesuffix = nm107Subscribernamesuffix;
        return this;
    }

    @JsonProperty("nm108_subscriberidcodeqlfr")
    public String getNm108Subscriberidcodeqlfr() {
        return nm108Subscriberidcodeqlfr;
    }

    @JsonProperty("nm108_subscriberidcodeqlfr")
    public void setNm108Subscriberidcodeqlfr(String nm108Subscriberidcodeqlfr) {
        this.nm108Subscriberidcodeqlfr = nm108Subscriberidcodeqlfr;
    }

    public ClaimPaymentInfo withNm108Subscriberidcodeqlfr(String nm108Subscriberidcodeqlfr) {
        this.nm108Subscriberidcodeqlfr = nm108Subscriberidcodeqlfr;
        return this;
    }

    @JsonProperty("nm109_subscriberidentifier")
    public String getNm109Subscriberidentifier() {
        return nm109Subscriberidentifier;
    }

    @JsonProperty("nm109_subscriberidentifier")
    public void setNm109Subscriberidentifier(String nm109Subscriberidentifier) {
        this.nm109Subscriberidentifier = nm109Subscriberidentifier;
    }

    public ClaimPaymentInfo withNm109Subscriberidentifier(String nm109Subscriberidentifier) {
        this.nm109Subscriberidentifier = nm109Subscriberidentifier;
        return this;
    }

    @JsonProperty("nm101_corrinsuredidencode")
    public String getNm101Corrinsuredidencode() {
        return nm101Corrinsuredidencode;
    }

    @JsonProperty("nm101_corrinsuredidencode")
    public void setNm101Corrinsuredidencode(String nm101Corrinsuredidencode) {
        this.nm101Corrinsuredidencode = nm101Corrinsuredidencode;
    }

    public ClaimPaymentInfo withNm101Corrinsuredidencode(String nm101Corrinsuredidencode) {
        this.nm101Corrinsuredidencode = nm101Corrinsuredidencode;
        return this;
    }

    @JsonProperty("nm102_corrinsuredqlfr")
    public String getNm102Corrinsuredqlfr() {
        return nm102Corrinsuredqlfr;
    }

    @JsonProperty("nm102_corrinsuredqlfr")
    public void setNm102Corrinsuredqlfr(String nm102Corrinsuredqlfr) {
        this.nm102Corrinsuredqlfr = nm102Corrinsuredqlfr;
    }

    public ClaimPaymentInfo withNm102Corrinsuredqlfr(String nm102Corrinsuredqlfr) {
        this.nm102Corrinsuredqlfr = nm102Corrinsuredqlfr;
        return this;
    }

    @JsonProperty("nm103_corrinsuredlastname")
    public String getNm103Corrinsuredlastname() {
        return nm103Corrinsuredlastname;
    }

    @JsonProperty("nm103_corrinsuredlastname")
    public void setNm103Corrinsuredlastname(String nm103Corrinsuredlastname) {
        this.nm103Corrinsuredlastname = nm103Corrinsuredlastname;
    }

    public ClaimPaymentInfo withNm103Corrinsuredlastname(String nm103Corrinsuredlastname) {
        this.nm103Corrinsuredlastname = nm103Corrinsuredlastname;
        return this;
    }

    @JsonProperty("nm104_corrinsuredfirstname")
    public String getNm104Corrinsuredfirstname() {
        return nm104Corrinsuredfirstname;
    }

    @JsonProperty("nm104_corrinsuredfirstname")
    public void setNm104Corrinsuredfirstname(String nm104Corrinsuredfirstname) {
        this.nm104Corrinsuredfirstname = nm104Corrinsuredfirstname;
    }

    public ClaimPaymentInfo withNm104Corrinsuredfirstname(String nm104Corrinsuredfirstname) {
        this.nm104Corrinsuredfirstname = nm104Corrinsuredfirstname;
        return this;
    }

    @JsonProperty("nm105_corrinsuredmiddlename")
    public String getNm105Corrinsuredmiddlename() {
        return nm105Corrinsuredmiddlename;
    }

    @JsonProperty("nm105_corrinsuredmiddlename")
    public void setNm105Corrinsuredmiddlename(String nm105Corrinsuredmiddlename) {
        this.nm105Corrinsuredmiddlename = nm105Corrinsuredmiddlename;
    }

    public ClaimPaymentInfo withNm105Corrinsuredmiddlename(String nm105Corrinsuredmiddlename) {
        this.nm105Corrinsuredmiddlename = nm105Corrinsuredmiddlename;
        return this;
    }

    @JsonProperty("nm107_corrinsurednamesuffix")
    public String getNm107Corrinsurednamesuffix() {
        return nm107Corrinsurednamesuffix;
    }

    @JsonProperty("nm107_corrinsurednamesuffix")
    public void setNm107Corrinsurednamesuffix(String nm107Corrinsurednamesuffix) {
        this.nm107Corrinsurednamesuffix = nm107Corrinsurednamesuffix;
    }

    public ClaimPaymentInfo withNm107Corrinsurednamesuffix(String nm107Corrinsurednamesuffix) {
        this.nm107Corrinsurednamesuffix = nm107Corrinsurednamesuffix;
        return this;
    }

    @JsonProperty("nm108_corrinsuredidencodeqlfr")
    public String getNm108Corrinsuredidencodeqlfr() {
        return nm108Corrinsuredidencodeqlfr;
    }

    @JsonProperty("nm108_corrinsuredidencodeqlfr")
    public void setNm108Corrinsuredidencodeqlfr(String nm108Corrinsuredidencodeqlfr) {
        this.nm108Corrinsuredidencodeqlfr = nm108Corrinsuredidencodeqlfr;
    }

    public ClaimPaymentInfo withNm108Corrinsuredidencodeqlfr(String nm108Corrinsuredidencodeqlfr) {
        this.nm108Corrinsuredidencodeqlfr = nm108Corrinsuredidencodeqlfr;
        return this;
    }

    @JsonProperty("nm109_corrinsuredidindicator")
    public String getNm109Corrinsuredidindicator() {
        return nm109Corrinsuredidindicator;
    }

    @JsonProperty("nm109_corrinsuredidindicator")
    public void setNm109Corrinsuredidindicator(String nm109Corrinsuredidindicator) {
        this.nm109Corrinsuredidindicator = nm109Corrinsuredidindicator;
    }

    public ClaimPaymentInfo withNm109Corrinsuredidindicator(String nm109Corrinsuredidindicator) {
        this.nm109Corrinsuredidindicator = nm109Corrinsuredidindicator;
        return this;
    }

    @JsonProperty("nm101_renderingprovidencode")
    public String getNm101Renderingprovidencode() {
        return nm101Renderingprovidencode;
    }

    @JsonProperty("nm101_renderingprovidencode")
    public void setNm101Renderingprovidencode(String nm101Renderingprovidencode) {
        this.nm101Renderingprovidencode = nm101Renderingprovidencode;
    }

    public ClaimPaymentInfo withNm101Renderingprovidencode(String nm101Renderingprovidencode) {
        this.nm101Renderingprovidencode = nm101Renderingprovidencode;
        return this;
    }

    @JsonProperty("nm102_renderingprovtypeqlfr")
    public String getNm102Renderingprovtypeqlfr() {
        return nm102Renderingprovtypeqlfr;
    }

    @JsonProperty("nm102_renderingprovtypeqlfr")
    public void setNm102Renderingprovtypeqlfr(String nm102Renderingprovtypeqlfr) {
        this.nm102Renderingprovtypeqlfr = nm102Renderingprovtypeqlfr;
    }

    public ClaimPaymentInfo withNm102Renderingprovtypeqlfr(String nm102Renderingprovtypeqlfr) {
        this.nm102Renderingprovtypeqlfr = nm102Renderingprovtypeqlfr;
        return this;
    }

    @JsonProperty("nm103_renderingprovlastorgname")
    public String getNm103Renderingprovlastorgname() {
        return nm103Renderingprovlastorgname;
    }

    @JsonProperty("nm103_renderingprovlastorgname")
    public void setNm103Renderingprovlastorgname(String nm103Renderingprovlastorgname) {
        this.nm103Renderingprovlastorgname = nm103Renderingprovlastorgname;
    }

    public ClaimPaymentInfo withNm103Renderingprovlastorgname(String nm103Renderingprovlastorgname) {
        this.nm103Renderingprovlastorgname = nm103Renderingprovlastorgname;
        return this;
    }

    @JsonProperty("nm104_renderingprovfirstname")
    public String getNm104Renderingprovfirstname() {
        return nm104Renderingprovfirstname;
    }

    @JsonProperty("nm104_renderingprovfirstname")
    public void setNm104Renderingprovfirstname(String nm104Renderingprovfirstname) {
        this.nm104Renderingprovfirstname = nm104Renderingprovfirstname;
    }

    public ClaimPaymentInfo withNm104Renderingprovfirstname(String nm104Renderingprovfirstname) {
        this.nm104Renderingprovfirstname = nm104Renderingprovfirstname;
        return this;
    }

    @JsonProperty("nm105_renderingprovmiddlename")
    public String getNm105Renderingprovmiddlename() {
        return nm105Renderingprovmiddlename;
    }

    @JsonProperty("nm105_renderingprovmiddlename")
    public void setNm105Renderingprovmiddlename(String nm105Renderingprovmiddlename) {
        this.nm105Renderingprovmiddlename = nm105Renderingprovmiddlename;
    }

    public ClaimPaymentInfo withNm105Renderingprovmiddlename(String nm105Renderingprovmiddlename) {
        this.nm105Renderingprovmiddlename = nm105Renderingprovmiddlename;
        return this;
    }

    @JsonProperty("nm107_renderingprovnamesuffix")
    public String getNm107Renderingprovnamesuffix() {
        return nm107Renderingprovnamesuffix;
    }

    @JsonProperty("nm107_renderingprovnamesuffix")
    public void setNm107Renderingprovnamesuffix(String nm107Renderingprovnamesuffix) {
        this.nm107Renderingprovnamesuffix = nm107Renderingprovnamesuffix;
    }

    public ClaimPaymentInfo withNm107Renderingprovnamesuffix(String nm107Renderingprovnamesuffix) {
        this.nm107Renderingprovnamesuffix = nm107Renderingprovnamesuffix;
        return this;
    }

    @JsonProperty("nm108_renderingprovidcodeqlfr")
    public String getNm108Renderingprovidcodeqlfr() {
        return nm108Renderingprovidcodeqlfr;
    }

    @JsonProperty("nm108_renderingprovidcodeqlfr")
    public void setNm108Renderingprovidcodeqlfr(String nm108Renderingprovidcodeqlfr) {
        this.nm108Renderingprovidcodeqlfr = nm108Renderingprovidcodeqlfr;
    }

    public ClaimPaymentInfo withNm108Renderingprovidcodeqlfr(String nm108Renderingprovidcodeqlfr) {
        this.nm108Renderingprovidcodeqlfr = nm108Renderingprovidcodeqlfr;
        return this;
    }

    @JsonProperty("nm109_renderingprovidentifier")
    public String getNm109Renderingprovidentifier() {
        return nm109Renderingprovidentifier;
    }

    @JsonProperty("nm109_renderingprovidentifier")
    public void setNm109Renderingprovidentifier(String nm109Renderingprovidentifier) {
        this.nm109Renderingprovidentifier = nm109Renderingprovidentifier;
    }

    public ClaimPaymentInfo withNm109Renderingprovidentifier(String nm109Renderingprovidentifier) {
        this.nm109Renderingprovidentifier = nm109Renderingprovidentifier;
        return this;
    }

    @JsonProperty("nm101_coordbenftsidencode")
    public String getNm101Coordbenftsidencode() {
        return nm101Coordbenftsidencode;
    }

    @JsonProperty("nm101_coordbenftsidencode")
    public void setNm101Coordbenftsidencode(String nm101Coordbenftsidencode) {
        this.nm101Coordbenftsidencode = nm101Coordbenftsidencode;
    }

    public ClaimPaymentInfo withNm101Coordbenftsidencode(String nm101Coordbenftsidencode) {
        this.nm101Coordbenftsidencode = nm101Coordbenftsidencode;
        return this;
    }

    @JsonProperty("nm102_coordbenfttypeqlfr")
    public String getNm102Coordbenfttypeqlfr() {
        return nm102Coordbenfttypeqlfr;
    }

    @JsonProperty("nm102_coordbenfttypeqlfr")
    public void setNm102Coordbenfttypeqlfr(String nm102Coordbenfttypeqlfr) {
        this.nm102Coordbenfttypeqlfr = nm102Coordbenfttypeqlfr;
    }

    public ClaimPaymentInfo withNm102Coordbenfttypeqlfr(String nm102Coordbenfttypeqlfr) {
        this.nm102Coordbenfttypeqlfr = nm102Coordbenfttypeqlfr;
        return this;
    }

    @JsonProperty("nm103_coordbenftscarriername")
    public String getNm103Coordbenftscarriername() {
        return nm103Coordbenftscarriername;
    }

    @JsonProperty("nm103_coordbenftscarriername")
    public void setNm103Coordbenftscarriername(String nm103Coordbenftscarriername) {
        this.nm103Coordbenftscarriername = nm103Coordbenftscarriername;
    }

    public ClaimPaymentInfo withNm103Coordbenftscarriername(String nm103Coordbenftscarriername) {
        this.nm103Coordbenftscarriername = nm103Coordbenftscarriername;
        return this;
    }

    @JsonProperty("nm108_coordbenftscarrieridqlfr")
    public String getNm108Coordbenftscarrieridqlfr() {
        return nm108Coordbenftscarrieridqlfr;
    }

    @JsonProperty("nm108_coordbenftscarrieridqlfr")
    public void setNm108Coordbenftscarrieridqlfr(String nm108Coordbenftscarrieridqlfr) {
        this.nm108Coordbenftscarrieridqlfr = nm108Coordbenftscarrieridqlfr;
    }

    public ClaimPaymentInfo withNm108Coordbenftscarrieridqlfr(String nm108Coordbenftscarrieridqlfr) {
        this.nm108Coordbenftscarrieridqlfr = nm108Coordbenftscarrieridqlfr;
        return this;
    }

    @JsonProperty("nm109_coordbenftscarrierid")
    public String getNm109Coordbenftscarrierid() {
        return nm109Coordbenftscarrierid;
    }

    @JsonProperty("nm109_coordbenftscarrierid")
    public void setNm109Coordbenftscarrierid(String nm109Coordbenftscarrierid) {
        this.nm109Coordbenftscarrierid = nm109Coordbenftscarrierid;
    }

    public ClaimPaymentInfo withNm109Coordbenftscarrierid(String nm109Coordbenftscarrierid) {
        this.nm109Coordbenftscarrierid = nm109Coordbenftscarrierid;
        return this;
    }

    @JsonProperty("nm101_corrpriorityidencode")
    public String getNm101Corrpriorityidencode() {
        return nm101Corrpriorityidencode;
    }

    @JsonProperty("nm101_corrpriorityidencode")
    public void setNm101Corrpriorityidencode(String nm101Corrpriorityidencode) {
        this.nm101Corrpriorityidencode = nm101Corrpriorityidencode;
    }

    public ClaimPaymentInfo withNm101Corrpriorityidencode(String nm101Corrpriorityidencode) {
        this.nm101Corrpriorityidencode = nm101Corrpriorityidencode;
        return this;
    }

    @JsonProperty("nm102_corrprioritytypeqlfr")
    public String getNm102Corrprioritytypeqlfr() {
        return nm102Corrprioritytypeqlfr;
    }

    @JsonProperty("nm102_corrprioritytypeqlfr")
    public void setNm102Corrprioritytypeqlfr(String nm102Corrprioritytypeqlfr) {
        this.nm102Corrprioritytypeqlfr = nm102Corrprioritytypeqlfr;
    }

    public ClaimPaymentInfo withNm102Corrprioritytypeqlfr(String nm102Corrprioritytypeqlfr) {
        this.nm102Corrprioritytypeqlfr = nm102Corrprioritytypeqlfr;
        return this;
    }

    @JsonProperty("nm103_corrprioritypayername")
    public String getNm103Corrprioritypayername() {
        return nm103Corrprioritypayername;
    }

    @JsonProperty("nm103_corrprioritypayername")
    public void setNm103Corrprioritypayername(String nm103Corrprioritypayername) {
        this.nm103Corrprioritypayername = nm103Corrprioritypayername;
    }

    public ClaimPaymentInfo withNm103Corrprioritypayername(String nm103Corrprioritypayername) {
        this.nm103Corrprioritypayername = nm103Corrprioritypayername;
        return this;
    }

    @JsonProperty("nm108_corrprtyypayeridcodeqlfr")
    public String getNm108Corrprtyypayeridcodeqlfr() {
        return nm108Corrprtyypayeridcodeqlfr;
    }

    @JsonProperty("nm108_corrprtyypayeridcodeqlfr")
    public void setNm108Corrprtyypayeridcodeqlfr(String nm108Corrprtyypayeridcodeqlfr) {
        this.nm108Corrprtyypayeridcodeqlfr = nm108Corrprtyypayeridcodeqlfr;
    }

    public ClaimPaymentInfo withNm108Corrprtyypayeridcodeqlfr(String nm108Corrprtyypayeridcodeqlfr) {
        this.nm108Corrprtyypayeridcodeqlfr = nm108Corrprtyypayeridcodeqlfr;
        return this;
    }

    @JsonProperty("nm109_corrprtypayernameid")
    public String getNm109Corrprtypayernameid() {
        return nm109Corrprtypayernameid;
    }

    @JsonProperty("nm109_corrprtypayernameid")
    public void setNm109Corrprtypayernameid(String nm109Corrprtypayernameid) {
        this.nm109Corrprtypayernameid = nm109Corrprtypayernameid;
    }

    public ClaimPaymentInfo withNm109Corrprtypayernameid(String nm109Corrprtypayernameid) {
        this.nm109Corrprtypayernameid = nm109Corrprtypayernameid;
        return this;
    }

    @JsonProperty("nm101_othsubscbridencode")
    public String getNm101Othsubscbridencode() {
        return nm101Othsubscbridencode;
    }

    @JsonProperty("nm101_othsubscbridencode")
    public void setNm101Othsubscbridencode(String nm101Othsubscbridencode) {
        this.nm101Othsubscbridencode = nm101Othsubscbridencode;
    }

    public ClaimPaymentInfo withNm101Othsubscbridencode(String nm101Othsubscbridencode) {
        this.nm101Othsubscbridencode = nm101Othsubscbridencode;
        return this;
    }

    @JsonProperty("nm102_othsubscbrtypeqlfr")
    public String getNm102Othsubscbrtypeqlfr() {
        return nm102Othsubscbrtypeqlfr;
    }

    @JsonProperty("nm102_othsubscbrtypeqlfr")
    public void setNm102Othsubscbrtypeqlfr(String nm102Othsubscbrtypeqlfr) {
        this.nm102Othsubscbrtypeqlfr = nm102Othsubscbrtypeqlfr;
    }

    public ClaimPaymentInfo withNm102Othsubscbrtypeqlfr(String nm102Othsubscbrtypeqlfr) {
        this.nm102Othsubscbrtypeqlfr = nm102Othsubscbrtypeqlfr;
        return this;
    }

    @JsonProperty("nm103_othsubscbrlastname")
    public String getNm103Othsubscbrlastname() {
        return nm103Othsubscbrlastname;
    }

    @JsonProperty("nm103_othsubscbrlastname")
    public void setNm103Othsubscbrlastname(String nm103Othsubscbrlastname) {
        this.nm103Othsubscbrlastname = nm103Othsubscbrlastname;
    }

    public ClaimPaymentInfo withNm103Othsubscbrlastname(String nm103Othsubscbrlastname) {
        this.nm103Othsubscbrlastname = nm103Othsubscbrlastname;
        return this;
    }

    @JsonProperty("nm104_othsubscbrfirstname")
    public String getNm104Othsubscbrfirstname() {
        return nm104Othsubscbrfirstname;
    }

    @JsonProperty("nm104_othsubscbrfirstname")
    public void setNm104Othsubscbrfirstname(String nm104Othsubscbrfirstname) {
        this.nm104Othsubscbrfirstname = nm104Othsubscbrfirstname;
    }

    public ClaimPaymentInfo withNm104Othsubscbrfirstname(String nm104Othsubscbrfirstname) {
        this.nm104Othsubscbrfirstname = nm104Othsubscbrfirstname;
        return this;
    }

    @JsonProperty("nm105_othsubscbrmiddlename")
    public String getNm105Othsubscbrmiddlename() {
        return nm105Othsubscbrmiddlename;
    }

    @JsonProperty("nm105_othsubscbrmiddlename")
    public void setNm105Othsubscbrmiddlename(String nm105Othsubscbrmiddlename) {
        this.nm105Othsubscbrmiddlename = nm105Othsubscbrmiddlename;
    }

    public ClaimPaymentInfo withNm105Othsubscbrmiddlename(String nm105Othsubscbrmiddlename) {
        this.nm105Othsubscbrmiddlename = nm105Othsubscbrmiddlename;
        return this;
    }

    @JsonProperty("nm107_othsubscbrnamesuffix")
    public String getNm107Othsubscbrnamesuffix() {
        return nm107Othsubscbrnamesuffix;
    }

    @JsonProperty("nm107_othsubscbrnamesuffix")
    public void setNm107Othsubscbrnamesuffix(String nm107Othsubscbrnamesuffix) {
        this.nm107Othsubscbrnamesuffix = nm107Othsubscbrnamesuffix;
    }

    public ClaimPaymentInfo withNm107Othsubscbrnamesuffix(String nm107Othsubscbrnamesuffix) {
        this.nm107Othsubscbrnamesuffix = nm107Othsubscbrnamesuffix;
        return this;
    }

    @JsonProperty("nm108_othsubscbridcodeqlfr")
    public String getNm108Othsubscbridcodeqlfr() {
        return nm108Othsubscbridcodeqlfr;
    }

    @JsonProperty("nm108_othsubscbridcodeqlfr")
    public void setNm108Othsubscbridcodeqlfr(String nm108Othsubscbridcodeqlfr) {
        this.nm108Othsubscbridcodeqlfr = nm108Othsubscbridcodeqlfr;
    }

    public ClaimPaymentInfo withNm108Othsubscbridcodeqlfr(String nm108Othsubscbridcodeqlfr) {
        this.nm108Othsubscbridcodeqlfr = nm108Othsubscbridcodeqlfr;
        return this;
    }

    @JsonProperty("nm109_othsubscbridentifier")
    public String getNm109Othsubscbridentifier() {
        return nm109Othsubscbridentifier;
    }

    @JsonProperty("nm109_othsubscbridentifier")
    public void setNm109Othsubscbridentifier(String nm109Othsubscbridentifier) {
        this.nm109Othsubscbridentifier = nm109Othsubscbridentifier;
    }

    public ClaimPaymentInfo withNm109Othsubscbridentifier(String nm109Othsubscbridentifier) {
        this.nm109Othsubscbridentifier = nm109Othsubscbridentifier;
        return this;
    }

    @JsonProperty("mia01_covereddaysorvisitscount")
    public String getMia01Covereddaysorvisitscount() {
        return mia01Covereddaysorvisitscount;
    }

    @JsonProperty("mia01_covereddaysorvisitscount")
    public void setMia01Covereddaysorvisitscount(String mia01Covereddaysorvisitscount) {
        this.mia01Covereddaysorvisitscount = mia01Covereddaysorvisitscount;
    }

    public ClaimPaymentInfo withMia01Covereddaysorvisitscount(String mia01Covereddaysorvisitscount) {
        this.mia01Covereddaysorvisitscount = mia01Covereddaysorvisitscount;
        return this;
    }

    @JsonProperty("mia02_ppsoperoutlieramount")
    public String getMia02Ppsoperoutlieramount() {
        return mia02Ppsoperoutlieramount;
    }

    @JsonProperty("mia02_ppsoperoutlieramount")
    public void setMia02Ppsoperoutlieramount(String mia02Ppsoperoutlieramount) {
        this.mia02Ppsoperoutlieramount = mia02Ppsoperoutlieramount;
    }

    public ClaimPaymentInfo withMia02Ppsoperoutlieramount(String mia02Ppsoperoutlieramount) {
        this.mia02Ppsoperoutlieramount = mia02Ppsoperoutlieramount;
        return this;
    }

    @JsonProperty("mia03_lifetimepsychdayscount")
    public String getMia03Lifetimepsychdayscount() {
        return mia03Lifetimepsychdayscount;
    }

    @JsonProperty("mia03_lifetimepsychdayscount")
    public void setMia03Lifetimepsychdayscount(String mia03Lifetimepsychdayscount) {
        this.mia03Lifetimepsychdayscount = mia03Lifetimepsychdayscount;
    }

    public ClaimPaymentInfo withMia03Lifetimepsychdayscount(String mia03Lifetimepsychdayscount) {
        this.mia03Lifetimepsychdayscount = mia03Lifetimepsychdayscount;
        return this;
    }

    @JsonProperty("mia04_claimdrgamount")
    public String getMia04Claimdrgamount() {
        return mia04Claimdrgamount;
    }

    @JsonProperty("mia04_claimdrgamount")
    public void setMia04Claimdrgamount(String mia04Claimdrgamount) {
        this.mia04Claimdrgamount = mia04Claimdrgamount;
    }

    public ClaimPaymentInfo withMia04Claimdrgamount(String mia04Claimdrgamount) {
        this.mia04Claimdrgamount = mia04Claimdrgamount;
        return this;
    }

    @JsonProperty("mia05_claimpaymentremarkcode")
    public String getMia05Claimpaymentremarkcode() {
        return mia05Claimpaymentremarkcode;
    }

    @JsonProperty("mia05_claimpaymentremarkcode")
    public void setMia05Claimpaymentremarkcode(String mia05Claimpaymentremarkcode) {
        this.mia05Claimpaymentremarkcode = mia05Claimpaymentremarkcode;
    }

    public ClaimPaymentInfo withMia05Claimpaymentremarkcode(String mia05Claimpaymentremarkcode) {
        this.mia05Claimpaymentremarkcode = mia05Claimpaymentremarkcode;
        return this;
    }

    @JsonProperty("mia06_claimdisproportshareamnt")
    public String getMia06Claimdisproportshareamnt() {
        return mia06Claimdisproportshareamnt;
    }

    @JsonProperty("mia06_claimdisproportshareamnt")
    public void setMia06Claimdisproportshareamnt(String mia06Claimdisproportshareamnt) {
        this.mia06Claimdisproportshareamnt = mia06Claimdisproportshareamnt;
    }

    public ClaimPaymentInfo withMia06Claimdisproportshareamnt(String mia06Claimdisproportshareamnt) {
        this.mia06Claimdisproportshareamnt = mia06Claimdisproportshareamnt;
        return this;
    }

    @JsonProperty("mia07_claimmsppassthruamount")
    public String getMia07Claimmsppassthruamount() {
        return mia07Claimmsppassthruamount;
    }

    @JsonProperty("mia07_claimmsppassthruamount")
    public void setMia07Claimmsppassthruamount(String mia07Claimmsppassthruamount) {
        this.mia07Claimmsppassthruamount = mia07Claimmsppassthruamount;
    }

    public ClaimPaymentInfo withMia07Claimmsppassthruamount(String mia07Claimmsppassthruamount) {
        this.mia07Claimmsppassthruamount = mia07Claimmsppassthruamount;
        return this;
    }

    @JsonProperty("mia08_claimppscapitalamount")
    public String getMia08Claimppscapitalamount() {
        return mia08Claimppscapitalamount;
    }

    @JsonProperty("mia08_claimppscapitalamount")
    public void setMia08Claimppscapitalamount(String mia08Claimppscapitalamount) {
        this.mia08Claimppscapitalamount = mia08Claimppscapitalamount;
    }

    public ClaimPaymentInfo withMia08Claimppscapitalamount(String mia08Claimppscapitalamount) {
        this.mia08Claimppscapitalamount = mia08Claimppscapitalamount;
        return this;
    }

    @JsonProperty("mia09_ppscapitalfspdrgamount")
    public String getMia09Ppscapitalfspdrgamount() {
        return mia09Ppscapitalfspdrgamount;
    }

    @JsonProperty("mia09_ppscapitalfspdrgamount")
    public void setMia09Ppscapitalfspdrgamount(String mia09Ppscapitalfspdrgamount) {
        this.mia09Ppscapitalfspdrgamount = mia09Ppscapitalfspdrgamount;
    }

    public ClaimPaymentInfo withMia09Ppscapitalfspdrgamount(String mia09Ppscapitalfspdrgamount) {
        this.mia09Ppscapitalfspdrgamount = mia09Ppscapitalfspdrgamount;
        return this;
    }

    @JsonProperty("mia10_ppscapitalhspdrgamount")
    public String getMia10Ppscapitalhspdrgamount() {
        return mia10Ppscapitalhspdrgamount;
    }

    @JsonProperty("mia10_ppscapitalhspdrgamount")
    public void setMia10Ppscapitalhspdrgamount(String mia10Ppscapitalhspdrgamount) {
        this.mia10Ppscapitalhspdrgamount = mia10Ppscapitalhspdrgamount;
    }

    public ClaimPaymentInfo withMia10Ppscapitalhspdrgamount(String mia10Ppscapitalhspdrgamount) {
        this.mia10Ppscapitalhspdrgamount = mia10Ppscapitalhspdrgamount;
        return this;
    }

    @JsonProperty("mia11_ppscapitaldshdrgamount")
    public String getMia11Ppscapitaldshdrgamount() {
        return mia11Ppscapitaldshdrgamount;
    }

    @JsonProperty("mia11_ppscapitaldshdrgamount")
    public void setMia11Ppscapitaldshdrgamount(String mia11Ppscapitaldshdrgamount) {
        this.mia11Ppscapitaldshdrgamount = mia11Ppscapitaldshdrgamount;
    }

    public ClaimPaymentInfo withMia11Ppscapitaldshdrgamount(String mia11Ppscapitaldshdrgamount) {
        this.mia11Ppscapitaldshdrgamount = mia11Ppscapitaldshdrgamount;
        return this;
    }

    @JsonProperty("mia12_oldcapitalamount")
    public String getMia12Oldcapitalamount() {
        return mia12Oldcapitalamount;
    }

    @JsonProperty("mia12_oldcapitalamount")
    public void setMia12Oldcapitalamount(String mia12Oldcapitalamount) {
        this.mia12Oldcapitalamount = mia12Oldcapitalamount;
    }

    public ClaimPaymentInfo withMia12Oldcapitalamount(String mia12Oldcapitalamount) {
        this.mia12Oldcapitalamount = mia12Oldcapitalamount;
        return this;
    }

    @JsonProperty("mia13_ppscapitalimeamount")
    public String getMia13Ppscapitalimeamount() {
        return mia13Ppscapitalimeamount;
    }

    @JsonProperty("mia13_ppscapitalimeamount")
    public void setMia13Ppscapitalimeamount(String mia13Ppscapitalimeamount) {
        this.mia13Ppscapitalimeamount = mia13Ppscapitalimeamount;
    }

    public ClaimPaymentInfo withMia13Ppscapitalimeamount(String mia13Ppscapitalimeamount) {
        this.mia13Ppscapitalimeamount = mia13Ppscapitalimeamount;
        return this;
    }

    @JsonProperty("mia14_ppsoperhsptlspecdrgamnt")
    public String getMia14Ppsoperhsptlspecdrgamnt() {
        return mia14Ppsoperhsptlspecdrgamnt;
    }

    @JsonProperty("mia14_ppsoperhsptlspecdrgamnt")
    public void setMia14Ppsoperhsptlspecdrgamnt(String mia14Ppsoperhsptlspecdrgamnt) {
        this.mia14Ppsoperhsptlspecdrgamnt = mia14Ppsoperhsptlspecdrgamnt;
    }

    public ClaimPaymentInfo withMia14Ppsoperhsptlspecdrgamnt(String mia14Ppsoperhsptlspecdrgamnt) {
        this.mia14Ppsoperhsptlspecdrgamnt = mia14Ppsoperhsptlspecdrgamnt;
        return this;
    }

    @JsonProperty("mia15_costreportdaycount")
    public String getMia15Costreportdaycount() {
        return mia15Costreportdaycount;
    }

    @JsonProperty("mia15_costreportdaycount")
    public void setMia15Costreportdaycount(String mia15Costreportdaycount) {
        this.mia15Costreportdaycount = mia15Costreportdaycount;
    }

    public ClaimPaymentInfo withMia15Costreportdaycount(String mia15Costreportdaycount) {
        this.mia15Costreportdaycount = mia15Costreportdaycount;
        return this;
    }

    @JsonProperty("mia16__ppsoperatfedspecdrgamnt")
    public String getMia16Ppsoperatfedspecdrgamnt() {
        return mia16Ppsoperatfedspecdrgamnt;
    }

    @JsonProperty("mia16__ppsoperatfedspecdrgamnt")
    public void setMia16Ppsoperatfedspecdrgamnt(String mia16Ppsoperatfedspecdrgamnt) {
        this.mia16Ppsoperatfedspecdrgamnt = mia16Ppsoperatfedspecdrgamnt;
    }

    public ClaimPaymentInfo withMia16Ppsoperatfedspecdrgamnt(String mia16Ppsoperatfedspecdrgamnt) {
        this.mia16Ppsoperatfedspecdrgamnt = mia16Ppsoperatfedspecdrgamnt;
        return this;
    }

    @JsonProperty("mia17_claimppscapitloutlramnt")
    public String getMia17Claimppscapitloutlramnt() {
        return mia17Claimppscapitloutlramnt;
    }

    @JsonProperty("mia17_claimppscapitloutlramnt")
    public void setMia17Claimppscapitloutlramnt(String mia17Claimppscapitloutlramnt) {
        this.mia17Claimppscapitloutlramnt = mia17Claimppscapitloutlramnt;
    }

    public ClaimPaymentInfo withMia17Claimppscapitloutlramnt(String mia17Claimppscapitloutlramnt) {
        this.mia17Claimppscapitloutlramnt = mia17Claimppscapitloutlramnt;
        return this;
    }

    @JsonProperty("mia18_claimindirectteachamnt")
    public String getMia18Claimindirectteachamnt() {
        return mia18Claimindirectteachamnt;
    }

    @JsonProperty("mia18_claimindirectteachamnt")
    public void setMia18Claimindirectteachamnt(String mia18Claimindirectteachamnt) {
        this.mia18Claimindirectteachamnt = mia18Claimindirectteachamnt;
    }

    public ClaimPaymentInfo withMia18Claimindirectteachamnt(String mia18Claimindirectteachamnt) {
        this.mia18Claimindirectteachamnt = mia18Claimindirectteachamnt;
        return this;
    }

    @JsonProperty("mia19_nonpaybleprofcompontamnt")
    public String getMia19Nonpaybleprofcompontamnt() {
        return mia19Nonpaybleprofcompontamnt;
    }

    @JsonProperty("mia19_nonpaybleprofcompontamnt")
    public void setMia19Nonpaybleprofcompontamnt(String mia19Nonpaybleprofcompontamnt) {
        this.mia19Nonpaybleprofcompontamnt = mia19Nonpaybleprofcompontamnt;
    }

    public ClaimPaymentInfo withMia19Nonpaybleprofcompontamnt(String mia19Nonpaybleprofcompontamnt) {
        this.mia19Nonpaybleprofcompontamnt = mia19Nonpaybleprofcompontamnt;
        return this;
    }

    @JsonProperty("mia20_claimpaymentremarkcode1")
    public String getMia20Claimpaymentremarkcode1() {
        return mia20Claimpaymentremarkcode1;
    }

    @JsonProperty("mia20_claimpaymentremarkcode1")
    public void setMia20Claimpaymentremarkcode1(String mia20Claimpaymentremarkcode1) {
        this.mia20Claimpaymentremarkcode1 = mia20Claimpaymentremarkcode1;
    }

    public ClaimPaymentInfo withMia20Claimpaymentremarkcode1(String mia20Claimpaymentremarkcode1) {
        this.mia20Claimpaymentremarkcode1 = mia20Claimpaymentremarkcode1;
        return this;
    }

    @JsonProperty("mia21_claimpaymentremarkcode2")
    public String getMia21Claimpaymentremarkcode2() {
        return mia21Claimpaymentremarkcode2;
    }

    @JsonProperty("mia21_claimpaymentremarkcode2")
    public void setMia21Claimpaymentremarkcode2(String mia21Claimpaymentremarkcode2) {
        this.mia21Claimpaymentremarkcode2 = mia21Claimpaymentremarkcode2;
    }

    public ClaimPaymentInfo withMia21Claimpaymentremarkcode2(String mia21Claimpaymentremarkcode2) {
        this.mia21Claimpaymentremarkcode2 = mia21Claimpaymentremarkcode2;
        return this;
    }

    @JsonProperty("mia22_claimpaymentremarkcode3")
    public String getMia22Claimpaymentremarkcode3() {
        return mia22Claimpaymentremarkcode3;
    }

    @JsonProperty("mia22_claimpaymentremarkcode3")
    public void setMia22Claimpaymentremarkcode3(String mia22Claimpaymentremarkcode3) {
        this.mia22Claimpaymentremarkcode3 = mia22Claimpaymentremarkcode3;
    }

    public ClaimPaymentInfo withMia22Claimpaymentremarkcode3(String mia22Claimpaymentremarkcode3) {
        this.mia22Claimpaymentremarkcode3 = mia22Claimpaymentremarkcode3;
        return this;
    }

    @JsonProperty("mia23_claimpaymentremarkcode4")
    public String getMia23Claimpaymentremarkcode4() {
        return mia23Claimpaymentremarkcode4;
    }

    @JsonProperty("mia23_claimpaymentremarkcode4")
    public void setMia23Claimpaymentremarkcode4(String mia23Claimpaymentremarkcode4) {
        this.mia23Claimpaymentremarkcode4 = mia23Claimpaymentremarkcode4;
    }

    public ClaimPaymentInfo withMia23Claimpaymentremarkcode4(String mia23Claimpaymentremarkcode4) {
        this.mia23Claimpaymentremarkcode4 = mia23Claimpaymentremarkcode4;
        return this;
    }

    @JsonProperty("mia24_ppscapitalexceptamount")
    public String getMia24Ppscapitalexceptamount() {
        return mia24Ppscapitalexceptamount;
    }

    @JsonProperty("mia24_ppscapitalexceptamount")
    public void setMia24Ppscapitalexceptamount(String mia24Ppscapitalexceptamount) {
        this.mia24Ppscapitalexceptamount = mia24Ppscapitalexceptamount;
    }

    public ClaimPaymentInfo withMia24Ppscapitalexceptamount(String mia24Ppscapitalexceptamount) {
        this.mia24Ppscapitalexceptamount = mia24Ppscapitalexceptamount;
        return this;
    }

    @JsonProperty("moa01_reimbursementrate")
    public String getMoa01Reimbursementrate() {
        return moa01Reimbursementrate;
    }

    @JsonProperty("moa01_reimbursementrate")
    public void setMoa01Reimbursementrate(String moa01Reimbursementrate) {
        this.moa01Reimbursementrate = moa01Reimbursementrate;
    }

    public ClaimPaymentInfo withMoa01Reimbursementrate(String moa01Reimbursementrate) {
        this.moa01Reimbursementrate = moa01Reimbursementrate;
        return this;
    }

    @JsonProperty("moa02_claimhcpcspayableamount")
    public String getMoa02Claimhcpcspayableamount() {
        return moa02Claimhcpcspayableamount;
    }

    @JsonProperty("moa02_claimhcpcspayableamount")
    public void setMoa02Claimhcpcspayableamount(String moa02Claimhcpcspayableamount) {
        this.moa02Claimhcpcspayableamount = moa02Claimhcpcspayableamount;
    }

    public ClaimPaymentInfo withMoa02Claimhcpcspayableamount(String moa02Claimhcpcspayableamount) {
        this.moa02Claimhcpcspayableamount = moa02Claimhcpcspayableamount;
        return this;
    }

    @JsonProperty("moa03_claimpaymentremarkcode1")
    public String getMoa03Claimpaymentremarkcode1() {
        return moa03Claimpaymentremarkcode1;
    }

    @JsonProperty("moa03_claimpaymentremarkcode1")
    public void setMoa03Claimpaymentremarkcode1(String moa03Claimpaymentremarkcode1) {
        this.moa03Claimpaymentremarkcode1 = moa03Claimpaymentremarkcode1;
    }

    public ClaimPaymentInfo withMoa03Claimpaymentremarkcode1(String moa03Claimpaymentremarkcode1) {
        this.moa03Claimpaymentremarkcode1 = moa03Claimpaymentremarkcode1;
        return this;
    }

    @JsonProperty("moa04_claimpaymentremarkcode2")
    public String getMoa04Claimpaymentremarkcode2() {
        return moa04Claimpaymentremarkcode2;
    }

    @JsonProperty("moa04_claimpaymentremarkcode2")
    public void setMoa04Claimpaymentremarkcode2(String moa04Claimpaymentremarkcode2) {
        this.moa04Claimpaymentremarkcode2 = moa04Claimpaymentremarkcode2;
    }

    public ClaimPaymentInfo withMoa04Claimpaymentremarkcode2(String moa04Claimpaymentremarkcode2) {
        this.moa04Claimpaymentremarkcode2 = moa04Claimpaymentremarkcode2;
        return this;
    }

    @JsonProperty("moa05_claimpaymentremarkcode3")
    public String getMoa05Claimpaymentremarkcode3() {
        return moa05Claimpaymentremarkcode3;
    }

    @JsonProperty("moa05_claimpaymentremarkcode3")
    public void setMoa05Claimpaymentremarkcode3(String moa05Claimpaymentremarkcode3) {
        this.moa05Claimpaymentremarkcode3 = moa05Claimpaymentremarkcode3;
    }

    public ClaimPaymentInfo withMoa05Claimpaymentremarkcode3(String moa05Claimpaymentremarkcode3) {
        this.moa05Claimpaymentremarkcode3 = moa05Claimpaymentremarkcode3;
        return this;
    }

    @JsonProperty("moa06_claimpaymentremarkcode4")
    public String getMoa06Claimpaymentremarkcode4() {
        return moa06Claimpaymentremarkcode4;
    }

    @JsonProperty("moa06_claimpaymentremarkcode4")
    public void setMoa06Claimpaymentremarkcode4(String moa06Claimpaymentremarkcode4) {
        this.moa06Claimpaymentremarkcode4 = moa06Claimpaymentremarkcode4;
    }

    public ClaimPaymentInfo withMoa06Claimpaymentremarkcode4(String moa06Claimpaymentremarkcode4) {
        this.moa06Claimpaymentremarkcode4 = moa06Claimpaymentremarkcode4;
        return this;
    }

    @JsonProperty("moa07_claimpaymentremarkcode5")
    public String getMoa07Claimpaymentremarkcode5() {
        return moa07Claimpaymentremarkcode5;
    }

    @JsonProperty("moa07_claimpaymentremarkcode5")
    public void setMoa07Claimpaymentremarkcode5(String moa07Claimpaymentremarkcode5) {
        this.moa07Claimpaymentremarkcode5 = moa07Claimpaymentremarkcode5;
    }

    public ClaimPaymentInfo withMoa07Claimpaymentremarkcode5(String moa07Claimpaymentremarkcode5) {
        this.moa07Claimpaymentremarkcode5 = moa07Claimpaymentremarkcode5;
        return this;
    }

    @JsonProperty("moa08_claimesrdpaymentamount")
    public String getMoa08Claimesrdpaymentamount() {
        return moa08Claimesrdpaymentamount;
    }

    @JsonProperty("moa08_claimesrdpaymentamount")
    public void setMoa08Claimesrdpaymentamount(String moa08Claimesrdpaymentamount) {
        this.moa08Claimesrdpaymentamount = moa08Claimesrdpaymentamount;
    }

    public ClaimPaymentInfo withMoa08Claimesrdpaymentamount(String moa08Claimesrdpaymentamount) {
        this.moa08Claimesrdpaymentamount = moa08Claimesrdpaymentamount;
        return this;
    }

    @JsonProperty("moa09_nonpayprofcompontamnt")
    public String getMoa09Nonpayprofcompontamnt() {
        return moa09Nonpayprofcompontamnt;
    }

    @JsonProperty("moa09_nonpayprofcompontamnt")
    public void setMoa09Nonpayprofcompontamnt(String moa09Nonpayprofcompontamnt) {
        this.moa09Nonpayprofcompontamnt = moa09Nonpayprofcompontamnt;
    }

    public ClaimPaymentInfo withMoa09Nonpayprofcompontamnt(String moa09Nonpayprofcompontamnt) {
        this.moa09Nonpayprofcompontamnt = moa09Nonpayprofcompontamnt;
        return this;
    }

    @JsonProperty("ref01_othclaimrelatedidqlfr")
    public String getRef01Othclaimrelatedidqlfr() {
        return ref01Othclaimrelatedidqlfr;
    }

    @JsonProperty("ref01_othclaimrelatedidqlfr")
    public void setRef01Othclaimrelatedidqlfr(String ref01Othclaimrelatedidqlfr) {
        this.ref01Othclaimrelatedidqlfr = ref01Othclaimrelatedidqlfr;
    }

    public ClaimPaymentInfo withRef01Othclaimrelatedidqlfr(String ref01Othclaimrelatedidqlfr) {
        this.ref01Othclaimrelatedidqlfr = ref01Othclaimrelatedidqlfr;
        return this;
    }

    @JsonProperty("ref02_othclaimrelatedidentifr")
    public String getRef02Othclaimrelatedidentifr() {
        return ref02Othclaimrelatedidentifr;
    }

    @JsonProperty("ref02_othclaimrelatedidentifr")
    public void setRef02Othclaimrelatedidentifr(String ref02Othclaimrelatedidentifr) {
        this.ref02Othclaimrelatedidentifr = ref02Othclaimrelatedidentifr;
    }

    public ClaimPaymentInfo withRef02Othclaimrelatedidentifr(String ref02Othclaimrelatedidentifr) {
        this.ref02Othclaimrelatedidentifr = ref02Othclaimrelatedidentifr;
        return this;
    }

    @JsonProperty("ref01_rndrprovscndryidqlfr")
    public String getRef01Rndrprovscndryidqlfr() {
        return ref01Rndrprovscndryidqlfr;
    }

    @JsonProperty("ref01_rndrprovscndryidqlfr")
    public void setRef01Rndrprovscndryidqlfr(String ref01Rndrprovscndryidqlfr) {
        this.ref01Rndrprovscndryidqlfr = ref01Rndrprovscndryidqlfr;
    }

    public ClaimPaymentInfo withRef01Rndrprovscndryidqlfr(String ref01Rndrprovscndryidqlfr) {
        this.ref01Rndrprovscndryidqlfr = ref01Rndrprovscndryidqlfr;
        return this;
    }

    @JsonProperty("ref02_rndrprovscndryid")
    public String getRef02Rndrprovscndryid() {
        return ref02Rndrprovscndryid;
    }

    @JsonProperty("ref02_rndrprovscndryid")
    public void setRef02Rndrprovscndryid(String ref02Rndrprovscndryid) {
        this.ref02Rndrprovscndryid = ref02Rndrprovscndryid;
    }

    public ClaimPaymentInfo withRef02Rndrprovscndryid(String ref02Rndrprovscndryid) {
        this.ref02Rndrprovscndryid = ref02Rndrprovscndryid;
        return this;
    }

    @JsonProperty("dtm01_claimdatetimeqlfr")
    public String getDtm01Claimdatetimeqlfr() {
        return dtm01Claimdatetimeqlfr;
    }

    @JsonProperty("dtm01_claimdatetimeqlfr")
    public void setDtm01Claimdatetimeqlfr(String dtm01Claimdatetimeqlfr) {
        this.dtm01Claimdatetimeqlfr = dtm01Claimdatetimeqlfr;
    }

    public ClaimPaymentInfo withDtm01Claimdatetimeqlfr(String dtm01Claimdatetimeqlfr) {
        this.dtm01Claimdatetimeqlfr = dtm01Claimdatetimeqlfr;
        return this;
    }

    @JsonProperty("dtm02_claimstartorenddate")
    public String getDtm02Claimstartorenddate() {
        return dtm02Claimstartorenddate;
    }

    @JsonProperty("dtm02_claimstartorenddate")
    public void setDtm02Claimstartorenddate(String dtm02Claimstartorenddate) {
        this.dtm02Claimstartorenddate = dtm02Claimstartorenddate;
    }

    public ClaimPaymentInfo withDtm02Claimstartorenddate(String dtm02Claimstartorenddate) {
        this.dtm02Claimstartorenddate = dtm02Claimstartorenddate;
        return this;
    }

    @JsonProperty("dtm01_coverageexpirationdatetimeqlfr")
    public String getDtm01Coverageexpirationdatetimeqlfr() {
        return dtm01Coverageexpirationdatetimeqlfr;
    }

    @JsonProperty("dtm01_coverageexpirationdatetimeqlfr")
    public void setDtm01Coverageexpirationdatetimeqlfr(String dtm01Coverageexpirationdatetimeqlfr) {
        this.dtm01Coverageexpirationdatetimeqlfr = dtm01Coverageexpirationdatetimeqlfr;
    }

    public ClaimPaymentInfo withDtm01Coverageexpirationdatetimeqlfr(String dtm01Coverageexpirationdatetimeqlfr) {
        this.dtm01Coverageexpirationdatetimeqlfr = dtm01Coverageexpirationdatetimeqlfr;
        return this;
    }

    @JsonProperty("dtm02_coverageexpirationdate")
    public String getDtm02Coverageexpirationdate() {
        return dtm02Coverageexpirationdate;
    }

    @JsonProperty("dtm02_coverageexpirationdate")
    public void setDtm02Coverageexpirationdate(String dtm02Coverageexpirationdate) {
        this.dtm02Coverageexpirationdate = dtm02Coverageexpirationdate;
    }

    public ClaimPaymentInfo withDtm02Coverageexpirationdate(String dtm02Coverageexpirationdate) {
        this.dtm02Coverageexpirationdate = dtm02Coverageexpirationdate;
        return this;
    }

    @JsonProperty("dtm01_claimreceiveddatetimeqlfr")
    public String getDtm01Claimreceiveddatetimeqlfr() {
        return dtm01Claimreceiveddatetimeqlfr;
    }

    @JsonProperty("dtm01_claimreceiveddatetimeqlfr")
    public void setDtm01Claimreceiveddatetimeqlfr(String dtm01Claimreceiveddatetimeqlfr) {
        this.dtm01Claimreceiveddatetimeqlfr = dtm01Claimreceiveddatetimeqlfr;
    }

    public ClaimPaymentInfo withDtm01Claimreceiveddatetimeqlfr(String dtm01Claimreceiveddatetimeqlfr) {
        this.dtm01Claimreceiveddatetimeqlfr = dtm01Claimreceiveddatetimeqlfr;
        return this;
    }

    @JsonProperty("dtm02_claimreceiveddate")
    public String getDtm02Claimreceiveddate() {
        return dtm02Claimreceiveddate;
    }

    @JsonProperty("dtm02_claimreceiveddate")
    public void setDtm02Claimreceiveddate(String dtm02Claimreceiveddate) {
        this.dtm02Claimreceiveddate = dtm02Claimreceiveddate;
    }

    public ClaimPaymentInfo withDtm02Claimreceiveddate(String dtm02Claimreceiveddate) {
        this.dtm02Claimreceiveddate = dtm02Claimreceiveddate;
        return this;
    }

    @JsonProperty("per01_claimcontactfunccode")
    public String getPer01Claimcontactfunccode() {
        return per01Claimcontactfunccode;
    }

    @JsonProperty("per01_claimcontactfunccode")
    public void setPer01Claimcontactfunccode(String per01Claimcontactfunccode) {
        this.per01Claimcontactfunccode = per01Claimcontactfunccode;
    }

    public ClaimPaymentInfo withPer01Claimcontactfunccode(String per01Claimcontactfunccode) {
        this.per01Claimcontactfunccode = per01Claimcontactfunccode;
        return this;
    }

    @JsonProperty("per02_claimcontactname")
    public String getPer02Claimcontactname() {
        return per02Claimcontactname;
    }

    @JsonProperty("per02_claimcontactname")
    public void setPer02Claimcontactname(String per02Claimcontactname) {
        this.per02Claimcontactname = per02Claimcontactname;
    }

    public ClaimPaymentInfo withPer02Claimcontactname(String per02Claimcontactname) {
        this.per02Claimcontactname = per02Claimcontactname;
        return this;
    }

    @JsonProperty("per03_claimcommnoqlfr")
    public String getPer03Claimcommnoqlfr() {
        return per03Claimcommnoqlfr;
    }

    @JsonProperty("per03_claimcommnoqlfr")
    public void setPer03Claimcommnoqlfr(String per03Claimcommnoqlfr) {
        this.per03Claimcommnoqlfr = per03Claimcommnoqlfr;
    }

    public ClaimPaymentInfo withPer03Claimcommnoqlfr(String per03Claimcommnoqlfr) {
        this.per03Claimcommnoqlfr = per03Claimcommnoqlfr;
        return this;
    }

    @JsonProperty("per04_claimcontactcommno")
    public String getPer04Claimcontactcommno() {
        return per04Claimcontactcommno;
    }

    @JsonProperty("per04_claimcontactcommno")
    public void setPer04Claimcontactcommno(String per04Claimcontactcommno) {
        this.per04Claimcontactcommno = per04Claimcontactcommno;
    }

    public ClaimPaymentInfo withPer04Claimcontactcommno(String per04Claimcontactcommno) {
        this.per04Claimcontactcommno = per04Claimcontactcommno;
        return this;
    }

    @JsonProperty("per05_claimcommnoqlfr")
    public String getPer05Claimcommnoqlfr() {
        return per05Claimcommnoqlfr;
    }

    @JsonProperty("per05_claimcommnoqlfr")
    public void setPer05Claimcommnoqlfr(String per05Claimcommnoqlfr) {
        this.per05Claimcommnoqlfr = per05Claimcommnoqlfr;
    }

    public ClaimPaymentInfo withPer05Claimcommnoqlfr(String per05Claimcommnoqlfr) {
        this.per05Claimcommnoqlfr = per05Claimcommnoqlfr;
        return this;
    }

    @JsonProperty("per06_claimcontactsecondcommno")
    public String getPer06Claimcontactsecondcommno() {
        return per06Claimcontactsecondcommno;
    }

    @JsonProperty("per06_claimcontactsecondcommno")
    public void setPer06Claimcontactsecondcommno(String per06Claimcontactsecondcommno) {
        this.per06Claimcontactsecondcommno = per06Claimcontactsecondcommno;
    }

    public ClaimPaymentInfo withPer06Claimcontactsecondcommno(String per06Claimcontactsecondcommno) {
        this.per06Claimcontactsecondcommno = per06Claimcontactsecondcommno;
        return this;
    }

    @JsonProperty("per07_claimcommnoqlfr")
    public String getPer07Claimcommnoqlfr() {
        return per07Claimcommnoqlfr;
    }

    @JsonProperty("per07_claimcommnoqlfr")
    public void setPer07Claimcommnoqlfr(String per07Claimcommnoqlfr) {
        this.per07Claimcommnoqlfr = per07Claimcommnoqlfr;
    }

    public ClaimPaymentInfo withPer07Claimcommnoqlfr(String per07Claimcommnoqlfr) {
        this.per07Claimcommnoqlfr = per07Claimcommnoqlfr;
        return this;
    }

    @JsonProperty("per08_claimcontactcommnoextnno")
    public String getPer08Claimcontactcommnoextnno() {
        return per08Claimcontactcommnoextnno;
    }

    @JsonProperty("per08_claimcontactcommnoextnno")
    public void setPer08Claimcontactcommnoextnno(String per08Claimcontactcommnoextnno) {
        this.per08Claimcontactcommnoextnno = per08Claimcontactcommnoextnno;
    }

    public ClaimPaymentInfo withPer08Claimcontactcommnoextnno(String per08Claimcontactcommnoextnno) {
        this.per08Claimcontactcommnoextnno = per08Claimcontactcommnoextnno;
        return this;
    }

    @JsonProperty("amt01_claimsupplmntinfoqlfr")
    public String getAmt01Claimsupplmntinfoqlfr() {
        return amt01Claimsupplmntinfoqlfr;
    }

    @JsonProperty("amt01_claimsupplmntinfoqlfr")
    public void setAmt01Claimsupplmntinfoqlfr(String amt01Claimsupplmntinfoqlfr) {
        this.amt01Claimsupplmntinfoqlfr = amt01Claimsupplmntinfoqlfr;
    }

    public ClaimPaymentInfo withAmt01Claimsupplmntinfoqlfr(String amt01Claimsupplmntinfoqlfr) {
        this.amt01Claimsupplmntinfoqlfr = amt01Claimsupplmntinfoqlfr;
        return this;
    }

    @JsonProperty("amt02_claimsupplmntinfoamnt")
    public String getAmt02Claimsupplmntinfoamnt() {
        return amt02Claimsupplmntinfoamnt;
    }

    @JsonProperty("amt02_claimsupplmntinfoamnt")
    public void setAmt02Claimsupplmntinfoamnt(String amt02Claimsupplmntinfoamnt) {
        this.amt02Claimsupplmntinfoamnt = amt02Claimsupplmntinfoamnt;
    }

    public ClaimPaymentInfo withAmt02Claimsupplmntinfoamnt(String amt02Claimsupplmntinfoamnt) {
        this.amt02Claimsupplmntinfoamnt = amt02Claimsupplmntinfoamnt;
        return this;
    }

    @JsonProperty("qty01_claimsupplmntinfoqtyqlfr")
    public String getQty01Claimsupplmntinfoqtyqlfr() {
        return qty01Claimsupplmntinfoqtyqlfr;
    }

    @JsonProperty("qty01_claimsupplmntinfoqtyqlfr")
    public void setQty01Claimsupplmntinfoqtyqlfr(String qty01Claimsupplmntinfoqtyqlfr) {
        this.qty01Claimsupplmntinfoqtyqlfr = qty01Claimsupplmntinfoqtyqlfr;
    }

    public ClaimPaymentInfo withQty01Claimsupplmntinfoqtyqlfr(String qty01Claimsupplmntinfoqtyqlfr) {
        this.qty01Claimsupplmntinfoqtyqlfr = qty01Claimsupplmntinfoqtyqlfr;
        return this;
    }

    @JsonProperty("qty02_claimsupplmntinfoqty")
    public Qty02Claimsupplmntinfoqty getQty02Claimsupplmntinfoqty() {
        return qty02Claimsupplmntinfoqty;
    }

    @JsonProperty("qty02_claimsupplmntinfoqty")
    public void setQty02Claimsupplmntinfoqty(Qty02Claimsupplmntinfoqty qty02Claimsupplmntinfoqty) {
        this.qty02Claimsupplmntinfoqty = qty02Claimsupplmntinfoqty;
    }

    public ClaimPaymentInfo withQty02Claimsupplmntinfoqty(Qty02Claimsupplmntinfoqty qty02Claimsupplmntinfoqty) {
        this.qty02Claimsupplmntinfoqty = qty02Claimsupplmntinfoqty;
        return this;
    }

    @JsonProperty("service_payment_information")
    public List<ServicePaymentInformation> getServicePaymentInformation() {
        return servicePaymentInformation;
    }

    @JsonProperty("service_payment_information")
    public void setServicePaymentInformation(List<ServicePaymentInformation> servicePaymentInformation) {
        this.servicePaymentInformation = servicePaymentInformation;
    }

    public ClaimPaymentInfo withServicePaymentInformation(List<ServicePaymentInformation> servicePaymentInformation) {
        this.servicePaymentInformation = servicePaymentInformation;
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

    public ClaimPaymentInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payClaimpId).append(payDetailId).append(clp01Patientcontrolnumber).append(clp02Claimstatuscode).append(clp03Totalclaimchargeamount).append(clp04Claimpaymentamount).append(clp05Patientrespamount).append(clp06Claimfilingindicatorcode).append(clp07Payerclaimcontrolnumber).append(clp08Facilitytypecode).append(clp09Claimfrequencycode).append(clp11Diagrelgroupdrgcode).append(clp12Diagrelgroupdrgweight).append(clp13Dischargefraction).append(clmadjudicationinfo).append(nm101Patientidencode).append(nm102Patienttypequal).append(nm103Patientlastname).append(nm104Patientfirstname).append(nm105Patientmiddlename).append(nm107Patientnamesuffix).append(nm108Patientidcodeqlfr).append(nm109Patientidentifier).append(nm101Subscriberentityidencode).append(nm102Subscriberentitytypeqlfr).append(nm103Subscriberlastorgname).append(nm104Subscriberfirstname).append(nm105Subscribermiddlename).append(nm107Subscribernamesuffix).append(nm108Subscriberidcodeqlfr).append(nm109Subscriberidentifier).append(nm101Corrinsuredidencode).append(nm102Corrinsuredqlfr).append(nm103Corrinsuredlastname).append(nm104Corrinsuredfirstname).append(nm105Corrinsuredmiddlename).append(nm107Corrinsurednamesuffix).append(nm108Corrinsuredidencodeqlfr).append(nm109Corrinsuredidindicator).append(nm101Renderingprovidencode).append(nm102Renderingprovtypeqlfr).append(nm103Renderingprovlastorgname).append(nm104Renderingprovfirstname).append(nm105Renderingprovmiddlename).append(nm107Renderingprovnamesuffix).append(nm108Renderingprovidcodeqlfr).append(nm109Renderingprovidentifier).append(nm101Coordbenftsidencode).append(nm102Coordbenfttypeqlfr).append(nm103Coordbenftscarriername).append(nm108Coordbenftscarrieridqlfr).append(nm109Coordbenftscarrierid).append(nm101Corrpriorityidencode).append(nm102Corrprioritytypeqlfr).append(nm103Corrprioritypayername).append(nm108Corrprtyypayeridcodeqlfr).append(nm109Corrprtypayernameid).append(nm101Othsubscbridencode).append(nm102Othsubscbrtypeqlfr).append(nm103Othsubscbrlastname).append(nm104Othsubscbrfirstname).append(nm105Othsubscbrmiddlename).append(nm107Othsubscbrnamesuffix).append(nm108Othsubscbridcodeqlfr).append(nm109Othsubscbridentifier).append(mia01Covereddaysorvisitscount).append(mia02Ppsoperoutlieramount).append(mia03Lifetimepsychdayscount).append(mia04Claimdrgamount).append(mia05Claimpaymentremarkcode).append(mia06Claimdisproportshareamnt).append(mia07Claimmsppassthruamount).append(mia08Claimppscapitalamount).append(mia09Ppscapitalfspdrgamount).append(mia10Ppscapitalhspdrgamount).append(mia11Ppscapitaldshdrgamount).append(mia12Oldcapitalamount).append(mia13Ppscapitalimeamount).append(mia14Ppsoperhsptlspecdrgamnt).append(mia15Costreportdaycount).append(mia16Ppsoperatfedspecdrgamnt).append(mia17Claimppscapitloutlramnt).append(mia18Claimindirectteachamnt).append(mia19Nonpaybleprofcompontamnt).append(mia20Claimpaymentremarkcode1).append(mia21Claimpaymentremarkcode2).append(mia22Claimpaymentremarkcode3).append(mia23Claimpaymentremarkcode4).append(mia24Ppscapitalexceptamount).append(moa01Reimbursementrate).append(moa02Claimhcpcspayableamount).append(moa03Claimpaymentremarkcode1).append(moa04Claimpaymentremarkcode2).append(moa05Claimpaymentremarkcode3).append(moa06Claimpaymentremarkcode4).append(moa07Claimpaymentremarkcode5).append(moa08Claimesrdpaymentamount).append(moa09Nonpayprofcompontamnt).append(ref01Othclaimrelatedidqlfr).append(ref02Othclaimrelatedidentifr).append(ref01Rndrprovscndryidqlfr).append(ref02Rndrprovscndryid).append(dtm01Claimdatetimeqlfr).append(dtm02Claimstartorenddate).append(dtm01Coverageexpirationdatetimeqlfr).append(dtm02Coverageexpirationdate).append(dtm01Claimreceiveddatetimeqlfr).append(dtm02Claimreceiveddate).append(per01Claimcontactfunccode).append(per02Claimcontactname).append(per03Claimcommnoqlfr).append(per04Claimcontactcommno).append(per05Claimcommnoqlfr).append(per06Claimcontactsecondcommno).append(per07Claimcommnoqlfr).append(per08Claimcontactcommnoextnno).append(amt01Claimsupplmntinfoqlfr).append(amt02Claimsupplmntinfoamnt).append(qty01Claimsupplmntinfoqtyqlfr).append(qty02Claimsupplmntinfoqty).append(servicePaymentInformation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimPaymentInfo) == false) {
            return false;
        }
        ClaimPaymentInfo rhs = ((ClaimPaymentInfo) other);
        return new EqualsBuilder().append(payClaimpId, rhs.payClaimpId).append(payDetailId, rhs.payDetailId).append(clp01Patientcontrolnumber, rhs.clp01Patientcontrolnumber).append(clp02Claimstatuscode, rhs.clp02Claimstatuscode).append(clp03Totalclaimchargeamount, rhs.clp03Totalclaimchargeamount).append(clp04Claimpaymentamount, rhs.clp04Claimpaymentamount).append(clp05Patientrespamount, rhs.clp05Patientrespamount).append(clp06Claimfilingindicatorcode, rhs.clp06Claimfilingindicatorcode).append(clp07Payerclaimcontrolnumber, rhs.clp07Payerclaimcontrolnumber).append(clp08Facilitytypecode, rhs.clp08Facilitytypecode).append(clp09Claimfrequencycode, rhs.clp09Claimfrequencycode).append(clp11Diagrelgroupdrgcode, rhs.clp11Diagrelgroupdrgcode).append(clp12Diagrelgroupdrgweight, rhs.clp12Diagrelgroupdrgweight).append(clp13Dischargefraction, rhs.clp13Dischargefraction).append(clmadjudicationinfo, rhs.clmadjudicationinfo).append(nm101Patientidencode, rhs.nm101Patientidencode).append(nm102Patienttypequal, rhs.nm102Patienttypequal).append(nm103Patientlastname, rhs.nm103Patientlastname).append(nm104Patientfirstname, rhs.nm104Patientfirstname).append(nm105Patientmiddlename, rhs.nm105Patientmiddlename).append(nm107Patientnamesuffix, rhs.nm107Patientnamesuffix).append(nm108Patientidcodeqlfr, rhs.nm108Patientidcodeqlfr).append(nm109Patientidentifier, rhs.nm109Patientidentifier).append(nm101Subscriberentityidencode, rhs.nm101Subscriberentityidencode).append(nm102Subscriberentitytypeqlfr, rhs.nm102Subscriberentitytypeqlfr).append(nm103Subscriberlastorgname, rhs.nm103Subscriberlastorgname).append(nm104Subscriberfirstname, rhs.nm104Subscriberfirstname).append(nm105Subscribermiddlename, rhs.nm105Subscribermiddlename).append(nm107Subscribernamesuffix, rhs.nm107Subscribernamesuffix).append(nm108Subscriberidcodeqlfr, rhs.nm108Subscriberidcodeqlfr).append(nm109Subscriberidentifier, rhs.nm109Subscriberidentifier).append(nm101Corrinsuredidencode, rhs.nm101Corrinsuredidencode).append(nm102Corrinsuredqlfr, rhs.nm102Corrinsuredqlfr).append(nm103Corrinsuredlastname, rhs.nm103Corrinsuredlastname).append(nm104Corrinsuredfirstname, rhs.nm104Corrinsuredfirstname).append(nm105Corrinsuredmiddlename, rhs.nm105Corrinsuredmiddlename).append(nm107Corrinsurednamesuffix, rhs.nm107Corrinsurednamesuffix).append(nm108Corrinsuredidencodeqlfr, rhs.nm108Corrinsuredidencodeqlfr).append(nm109Corrinsuredidindicator, rhs.nm109Corrinsuredidindicator).append(nm101Renderingprovidencode, rhs.nm101Renderingprovidencode).append(nm102Renderingprovtypeqlfr, rhs.nm102Renderingprovtypeqlfr).append(nm103Renderingprovlastorgname, rhs.nm103Renderingprovlastorgname).append(nm104Renderingprovfirstname, rhs.nm104Renderingprovfirstname).append(nm105Renderingprovmiddlename, rhs.nm105Renderingprovmiddlename).append(nm107Renderingprovnamesuffix, rhs.nm107Renderingprovnamesuffix).append(nm108Renderingprovidcodeqlfr, rhs.nm108Renderingprovidcodeqlfr).append(nm109Renderingprovidentifier, rhs.nm109Renderingprovidentifier).append(nm101Coordbenftsidencode, rhs.nm101Coordbenftsidencode).append(nm102Coordbenfttypeqlfr, rhs.nm102Coordbenfttypeqlfr).append(nm103Coordbenftscarriername, rhs.nm103Coordbenftscarriername).append(nm108Coordbenftscarrieridqlfr, rhs.nm108Coordbenftscarrieridqlfr).append(nm109Coordbenftscarrierid, rhs.nm109Coordbenftscarrierid).append(nm101Corrpriorityidencode, rhs.nm101Corrpriorityidencode).append(nm102Corrprioritytypeqlfr, rhs.nm102Corrprioritytypeqlfr).append(nm103Corrprioritypayername, rhs.nm103Corrprioritypayername).append(nm108Corrprtyypayeridcodeqlfr, rhs.nm108Corrprtyypayeridcodeqlfr).append(nm109Corrprtypayernameid, rhs.nm109Corrprtypayernameid).append(nm101Othsubscbridencode, rhs.nm101Othsubscbridencode).append(nm102Othsubscbrtypeqlfr, rhs.nm102Othsubscbrtypeqlfr).append(nm103Othsubscbrlastname, rhs.nm103Othsubscbrlastname).append(nm104Othsubscbrfirstname, rhs.nm104Othsubscbrfirstname).append(nm105Othsubscbrmiddlename, rhs.nm105Othsubscbrmiddlename).append(nm107Othsubscbrnamesuffix, rhs.nm107Othsubscbrnamesuffix).append(nm108Othsubscbridcodeqlfr, rhs.nm108Othsubscbridcodeqlfr).append(nm109Othsubscbridentifier, rhs.nm109Othsubscbridentifier).append(mia01Covereddaysorvisitscount, rhs.mia01Covereddaysorvisitscount).append(mia02Ppsoperoutlieramount, rhs.mia02Ppsoperoutlieramount).append(mia03Lifetimepsychdayscount, rhs.mia03Lifetimepsychdayscount).append(mia04Claimdrgamount, rhs.mia04Claimdrgamount).append(mia05Claimpaymentremarkcode, rhs.mia05Claimpaymentremarkcode).append(mia06Claimdisproportshareamnt, rhs.mia06Claimdisproportshareamnt).append(mia07Claimmsppassthruamount, rhs.mia07Claimmsppassthruamount).append(mia08Claimppscapitalamount, rhs.mia08Claimppscapitalamount).append(mia09Ppscapitalfspdrgamount, rhs.mia09Ppscapitalfspdrgamount).append(mia10Ppscapitalhspdrgamount, rhs.mia10Ppscapitalhspdrgamount).append(mia11Ppscapitaldshdrgamount, rhs.mia11Ppscapitaldshdrgamount).append(mia12Oldcapitalamount, rhs.mia12Oldcapitalamount).append(mia13Ppscapitalimeamount, rhs.mia13Ppscapitalimeamount).append(mia14Ppsoperhsptlspecdrgamnt, rhs.mia14Ppsoperhsptlspecdrgamnt).append(mia15Costreportdaycount, rhs.mia15Costreportdaycount).append(mia16Ppsoperatfedspecdrgamnt, rhs.mia16Ppsoperatfedspecdrgamnt).append(mia17Claimppscapitloutlramnt, rhs.mia17Claimppscapitloutlramnt).append(mia18Claimindirectteachamnt, rhs.mia18Claimindirectteachamnt).append(mia19Nonpaybleprofcompontamnt, rhs.mia19Nonpaybleprofcompontamnt).append(mia20Claimpaymentremarkcode1, rhs.mia20Claimpaymentremarkcode1).append(mia21Claimpaymentremarkcode2, rhs.mia21Claimpaymentremarkcode2).append(mia22Claimpaymentremarkcode3, rhs.mia22Claimpaymentremarkcode3).append(mia23Claimpaymentremarkcode4, rhs.mia23Claimpaymentremarkcode4).append(mia24Ppscapitalexceptamount, rhs.mia24Ppscapitalexceptamount).append(moa01Reimbursementrate, rhs.moa01Reimbursementrate).append(moa02Claimhcpcspayableamount, rhs.moa02Claimhcpcspayableamount).append(moa03Claimpaymentremarkcode1, rhs.moa03Claimpaymentremarkcode1).append(moa04Claimpaymentremarkcode2, rhs.moa04Claimpaymentremarkcode2).append(moa05Claimpaymentremarkcode3, rhs.moa05Claimpaymentremarkcode3).append(moa06Claimpaymentremarkcode4, rhs.moa06Claimpaymentremarkcode4).append(moa07Claimpaymentremarkcode5, rhs.moa07Claimpaymentremarkcode5).append(moa08Claimesrdpaymentamount, rhs.moa08Claimesrdpaymentamount).append(moa09Nonpayprofcompontamnt, rhs.moa09Nonpayprofcompontamnt).append(ref01Othclaimrelatedidqlfr, rhs.ref01Othclaimrelatedidqlfr).append(ref02Othclaimrelatedidentifr, rhs.ref02Othclaimrelatedidentifr).append(ref01Rndrprovscndryidqlfr, rhs.ref01Rndrprovscndryidqlfr).append(ref02Rndrprovscndryid, rhs.ref02Rndrprovscndryid).append(dtm01Claimdatetimeqlfr, rhs.dtm01Claimdatetimeqlfr).append(dtm02Claimstartorenddate, rhs.dtm02Claimstartorenddate).append(dtm01Coverageexpirationdatetimeqlfr, rhs.dtm01Coverageexpirationdatetimeqlfr).append(dtm02Coverageexpirationdate, rhs.dtm02Coverageexpirationdate).append(dtm01Claimreceiveddatetimeqlfr, rhs.dtm01Claimreceiveddatetimeqlfr).append(dtm02Claimreceiveddate, rhs.dtm02Claimreceiveddate).append(per01Claimcontactfunccode, rhs.per01Claimcontactfunccode).append(per02Claimcontactname, rhs.per02Claimcontactname).append(per03Claimcommnoqlfr, rhs.per03Claimcommnoqlfr).append(per04Claimcontactcommno, rhs.per04Claimcontactcommno).append(per05Claimcommnoqlfr, rhs.per05Claimcommnoqlfr).append(per06Claimcontactsecondcommno, rhs.per06Claimcontactsecondcommno).append(per07Claimcommnoqlfr, rhs.per07Claimcommnoqlfr).append(per08Claimcontactcommnoextnno, rhs.per08Claimcontactcommnoextnno).append(amt01Claimsupplmntinfoqlfr, rhs.amt01Claimsupplmntinfoqlfr).append(amt02Claimsupplmntinfoamnt, rhs.amt02Claimsupplmntinfoamnt).append(qty01Claimsupplmntinfoqtyqlfr, rhs.qty01Claimsupplmntinfoqtyqlfr).append(qty02Claimsupplmntinfoqty, rhs.qty02Claimsupplmntinfoqty).append(servicePaymentInformation, rhs.servicePaymentInformation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "pay_header_id",
    "pay_ecn_id",
    "st01_transetidfrcode",
    "st02_transetcontrolno",
    "bpr01_transactionhandlingcode",
    "bpr02_totlactlprovdrpaymntamnt",
    "bpr03_creditdebitflagcode",
    "bpr04_paymentmethodcode",
    "bpr05_paymentformatcode",
    "bpr06_payerdfi_idnoqlfr",
    "bpr07_payerdfi_idno",
    "bpr08_accountnoqual",
    "bpr09_senderbankaccntno",
    "bpr10_payeridfr",
    "bpr11_origcompanysupplmntlcode",
    "bpr12_receiverdfi_idnoqlfr",
    "bpr13_receiverorprovbankidno",
    "bpr14_accountnoqual",
    "bpr15_receiverorprovaccntno",
    "bpr16_checkissueeft_effdate",
    "trn01_tracetypecode",
    "trn02_checkeft_tracenumber",
    "trn03_payeridfrein",
    "trn04_origcompysupplmntlcode",
    "cur01_entityidencode",
    "cur02_payercurrencycode",
    "ref01_receiverrefidenqlfr",
    "ref02_receiveridfr",
    "ref01_versionrefidenqlfr",
    "ref02_versionidcode",
    "dtm01_datetimequalorproduction",
    "dtm02_productiondate",
    "n101_entityidencodeorpayer",
    "n102_idencodequalororgiden",
    "n103_payername",
    "n104_payeridfr",
    "n301_payeraddress1",
    "n302_payeraddress2",
    "n401_payercityname",
    "n402_payerstatecode",
    "n403_payerpostalzipcode",
    "n404_payercountrycode",
    "n407_payercountrysubcode",
    "ref01_payeraddtlidqlfr",
    "ref02_payeraddtlidfr",
    "per01_payerclmofc",
    "per02_payercontactname",
    "per03_payercommnoqual",
    "per04_payercontactcommno",
    "per05_payersecondcommnoqual",
    "per06_payersecondcontactcommno",
    "per07_payerextnqual",
    "per08_payersecondextnqual",
    "per01_admininfocontact",
    "per03_admincommnoqual",
    "per04_admincommno",
    "n101_payeeidencode",
    "n102_payeename",
    "n103_payeecodeqlfr",
    "n104_payeeidfr",
    "n301_payeeaddress1",
    "n302_payeeaddress2",
    "n401_payeecityname",
    "n402_payeestatecode",
    "n403_payeepostalzipcode",
    "n404_payeecountrycode",
    "n407_payeecountrysubcode",
    "ref01_payeeaddtlidqlfr",
    "ref02_payeeaddtlidfr",
    "rdm01_payeeremittrnsmsncode",
    "rdm02_payeeremitname",
    "rdm03_payeeremitcommunication",
    "plb01_provideridentifier",
    "plb02_fiscalperioddate",
    "plb03_adjustmentiden",
    "plb03_01_adjustmentreasoncode",
    "plb03_02_provadjidentifier",
    "plb04_provadjamount",
    "plb05_adjustmentiden",
    "plb05_01_adjustmentreasoncode",
    "plb05_02_provideradjustmentid",
    "plb06_provideradjustmentamount",
    "plb07_adjustmentiden",
    "plb07_01_adjustmentreasoncode",
    "plb07_02_provideradjustmentid",
    "plb08_provideradjustmentamount",
    "plb09_adjustmentiden",
    "plb09_01_adjustmentreasoncode",
    "plb09_02_provideradjustmentid",
    "plb10_provideradjustmentamount",
    "plb11_adjustmentiden",
    "plb11_01_adjustmentreasoncode",
    "plb11_02_provideradjustmentid",
    "plb12_provideradjustmentamount",
    "plb13_adjustmentiden",
    "plb13_01_adjustmentreasoncode",
    "plb13_02_provideradjustmentid",
    "plb14_provideradjustmentamount"
})
public class Transaction_ {

    @JsonProperty("pay_header_id")
    private Integer payHeaderId;
    @JsonProperty("pay_ecn_id")
    private Integer payEcnId;
    @JsonProperty("st01_transetidfrcode")
    private String st01Transetidfrcode;
    @JsonProperty("st02_transetcontrolno")
    private String st02Transetcontrolno;
    @JsonProperty("bpr01_transactionhandlingcode")
    private String bpr01Transactionhandlingcode;
    @JsonProperty("bpr02_totlactlprovdrpaymntamnt")
    private String bpr02Totlactlprovdrpaymntamnt;
    @JsonProperty("bpr03_creditdebitflagcode")
    private String bpr03Creditdebitflagcode;
    @JsonProperty("bpr04_paymentmethodcode")
    private String bpr04Paymentmethodcode;
    @JsonProperty("bpr05_paymentformatcode")
    private String bpr05Paymentformatcode;
    @JsonProperty("bpr06_payerdfi_idnoqlfr")
    private String bpr06PayerdfiIdnoqlfr;
    @JsonProperty("bpr07_payerdfi_idno")
    private String bpr07PayerdfiIdno;
    @JsonProperty("bpr08_accountnoqual")
    private String bpr08Accountnoqual;
    @JsonProperty("bpr09_senderbankaccntno")
    private String bpr09Senderbankaccntno;
    @JsonProperty("bpr10_payeridfr")
    private String bpr10Payeridfr;
    @JsonProperty("bpr11_origcompanysupplmntlcode")
    private String bpr11Origcompanysupplmntlcode;
    @JsonProperty("bpr12_receiverdfi_idnoqlfr")
    private String bpr12ReceiverdfiIdnoqlfr;
    @JsonProperty("bpr13_receiverorprovbankidno")
    private String bpr13Receiverorprovbankidno;
    @JsonProperty("bpr14_accountnoqual")
    private String bpr14Accountnoqual;
    @JsonProperty("bpr15_receiverorprovaccntno")
    private String bpr15Receiverorprovaccntno;
    @JsonProperty("bpr16_checkissueeft_effdate")
    private String bpr16CheckissueeftEffdate;
    @JsonProperty("trn01_tracetypecode")
    private String trn01Tracetypecode;
    @JsonProperty("trn02_checkeft_tracenumber")
    private String trn02CheckeftTracenumber;
    @JsonProperty("trn03_payeridfrein")
    private String trn03Payeridfrein;
    @JsonProperty("trn04_origcompysupplmntlcode")
    private String trn04Origcompysupplmntlcode;
    @JsonProperty("cur01_entityidencode")
    private String cur01Entityidencode;
    @JsonProperty("cur02_payercurrencycode")
    private String cur02Payercurrencycode;
    @JsonProperty("ref01_receiverrefidenqlfr")
    private String ref01Receiverrefidenqlfr;
    @JsonProperty("ref02_receiveridfr")
    private String ref02Receiveridfr;
    @JsonProperty("ref01_versionrefidenqlfr")
    private String ref01Versionrefidenqlfr;
    @JsonProperty("ref02_versionidcode")
    private String ref02Versionidcode;
    @JsonProperty("dtm01_datetimequalorproduction")
    private String dtm01Datetimequalorproduction;
    @JsonProperty("dtm02_productiondate")
    private String dtm02Productiondate;
    @JsonProperty("n101_entityidencodeorpayer")
    private String n101Entityidencodeorpayer;
    @JsonProperty("n102_idencodequalororgiden")
    private String n102Idencodequalororgiden;
    @JsonProperty("n103_payername")
    private String n103Payername;
    @JsonProperty("n104_payeridfr")
    private String n104Payeridfr;
    @JsonProperty("n301_payeraddress1")
    private String n301Payeraddress1;
    @JsonProperty("n302_payeraddress2")
    private String n302Payeraddress2;
    @JsonProperty("n401_payercityname")
    private String n401Payercityname;
    @JsonProperty("n402_payerstatecode")
    private String n402Payerstatecode;
    @JsonProperty("n403_payerpostalzipcode")
    private String n403Payerpostalzipcode;
    @JsonProperty("n404_payercountrycode")
    private String n404Payercountrycode;
    @JsonProperty("n407_payercountrysubcode")
    private String n407Payercountrysubcode;
    @JsonProperty("ref01_payeraddtlidqlfr")
    private String ref01Payeraddtlidqlfr;
    @JsonProperty("ref02_payeraddtlidfr")
    private String ref02Payeraddtlidfr;
    @JsonProperty("per01_payerclmofc")
    private String per01Payerclmofc;
    @JsonProperty("per02_payercontactname")
    private String per02Payercontactname;
    @JsonProperty("per03_payercommnoqual")
    private String per03Payercommnoqual;
    @JsonProperty("per04_payercontactcommno")
    private String per04Payercontactcommno;
    @JsonProperty("per05_payersecondcommnoqual")
    private String per05Payersecondcommnoqual;
    @JsonProperty("per06_payersecondcontactcommno")
    private String per06Payersecondcontactcommno;
    @JsonProperty("per07_payerextnqual")
    private String per07Payerextnqual;
    @JsonProperty("per08_payersecondextnqual")
    private String per08Payersecondextnqual;
    @JsonProperty("per01_admininfocontact")
    private String per01Admininfocontact;
    @JsonProperty("per03_admincommnoqual")
    private String per03Admincommnoqual;
    @JsonProperty("per04_admincommno")
    private String per04Admincommno;
    @JsonProperty("n101_payeeidencode")
    private String n101Payeeidencode;
    @JsonProperty("n102_payeename")
    private String n102Payeename;
    @JsonProperty("n103_payeecodeqlfr")
    private String n103Payeecodeqlfr;
    @JsonProperty("n104_payeeidfr")
    private String n104Payeeidfr;
    @JsonProperty("n301_payeeaddress1")
    private String n301Payeeaddress1;
    @JsonProperty("n302_payeeaddress2")
    private String n302Payeeaddress2;
    @JsonProperty("n401_payeecityname")
    private String n401Payeecityname;
    @JsonProperty("n402_payeestatecode")
    private String n402Payeestatecode;
    @JsonProperty("n403_payeepostalzipcode")
    private String n403Payeepostalzipcode;
    @JsonProperty("n404_payeecountrycode")
    private String n404Payeecountrycode;
    @JsonProperty("n407_payeecountrysubcode")
    private String n407Payeecountrysubcode;
    @JsonProperty("ref01_payeeaddtlidqlfr")
    private String ref01Payeeaddtlidqlfr;
    @JsonProperty("ref02_payeeaddtlidfr")
    private String ref02Payeeaddtlidfr;
    @JsonProperty("rdm01_payeeremittrnsmsncode")
    private String rdm01Payeeremittrnsmsncode;
    @JsonProperty("rdm02_payeeremitname")
    private String rdm02Payeeremitname;
    @JsonProperty("rdm03_payeeremitcommunication")
    private String rdm03Payeeremitcommunication;
    @JsonProperty("plb01_provideridentifier")
    private String plb01Provideridentifier;
    @JsonProperty("plb02_fiscalperioddate")
    private String plb02Fiscalperioddate;
    @JsonProperty("plb03_adjustmentiden")
    private String plb03Adjustmentiden;
    @JsonProperty("plb03_01_adjustmentreasoncode")
    private String plb0301Adjustmentreasoncode;
    @JsonProperty("plb03_02_provadjidentifier")
    private String plb0302Provadjidentifier;
    @JsonProperty("plb04_provadjamount")
    private String plb04Provadjamount;
    @JsonProperty("plb05_adjustmentiden")
    private String plb05Adjustmentiden;
    @JsonProperty("plb05_01_adjustmentreasoncode")
    private String plb0501Adjustmentreasoncode;
    @JsonProperty("plb05_02_provideradjustmentid")
    private String plb0502Provideradjustmentid;
    @JsonProperty("plb06_provideradjustmentamount")
    private String plb06Provideradjustmentamount;
    @JsonProperty("plb07_adjustmentiden")
    private String plb07Adjustmentiden;
    @JsonProperty("plb07_01_adjustmentreasoncode")
    private String plb0701Adjustmentreasoncode;
    @JsonProperty("plb07_02_provideradjustmentid")
    private String plb0702Provideradjustmentid;
    @JsonProperty("plb08_provideradjustmentamount")
    private String plb08Provideradjustmentamount;
    @JsonProperty("plb09_adjustmentiden")
    private String plb09Adjustmentiden;
    @JsonProperty("plb09_01_adjustmentreasoncode")
    private String plb0901Adjustmentreasoncode;
    @JsonProperty("plb09_02_provideradjustmentid")
    private String plb0902Provideradjustmentid;
    @JsonProperty("plb10_provideradjustmentamount")
    private String plb10Provideradjustmentamount;
    @JsonProperty("plb11_adjustmentiden")
    private String plb11Adjustmentiden;
    @JsonProperty("plb11_01_adjustmentreasoncode")
    private String plb1101Adjustmentreasoncode;
    @JsonProperty("plb11_02_provideradjustmentid")
    private String plb1102Provideradjustmentid;
    @JsonProperty("plb12_provideradjustmentamount")
    private String plb12Provideradjustmentamount;
    @JsonProperty("plb13_adjustmentiden")
    private String plb13Adjustmentiden;
    @JsonProperty("plb13_01_adjustmentreasoncode")
    private String plb1301Adjustmentreasoncode;
    @JsonProperty("plb13_02_provideradjustmentid")
    private String plb1302Provideradjustmentid;
    @JsonProperty("plb14_provideradjustmentamount")
    private String plb14Provideradjustmentamount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pay_header_id")
    public Integer getPayHeaderId() {
        return payHeaderId;
    }

    @JsonProperty("pay_header_id")
    public void setPayHeaderId(Integer payHeaderId) {
        this.payHeaderId = payHeaderId;
    }

    public Transaction_ withPayHeaderId(Integer payHeaderId) {
        this.payHeaderId = payHeaderId;
        return this;
    }

    @JsonProperty("pay_ecn_id")
    public Integer getPayEcnId() {
        return payEcnId;
    }

    @JsonProperty("pay_ecn_id")
    public void setPayEcnId(Integer payEcnId) {
        this.payEcnId = payEcnId;
    }

    public Transaction_ withPayEcnId(Integer payEcnId) {
        this.payEcnId = payEcnId;
        return this;
    }

    @JsonProperty("st01_transetidfrcode")
    public String getSt01Transetidfrcode() {
        return st01Transetidfrcode;
    }

    @JsonProperty("st01_transetidfrcode")
    public void setSt01Transetidfrcode(String st01Transetidfrcode) {
        this.st01Transetidfrcode = st01Transetidfrcode;
    }

    public Transaction_ withSt01Transetidfrcode(String st01Transetidfrcode) {
        this.st01Transetidfrcode = st01Transetidfrcode;
        return this;
    }

    @JsonProperty("st02_transetcontrolno")
    public String getSt02Transetcontrolno() {
        return st02Transetcontrolno;
    }

    @JsonProperty("st02_transetcontrolno")
    public void setSt02Transetcontrolno(String st02Transetcontrolno) {
        this.st02Transetcontrolno = st02Transetcontrolno;
    }

    public Transaction_ withSt02Transetcontrolno(String st02Transetcontrolno) {
        this.st02Transetcontrolno = st02Transetcontrolno;
        return this;
    }

    @JsonProperty("bpr01_transactionhandlingcode")
    public String getBpr01Transactionhandlingcode() {
        return bpr01Transactionhandlingcode;
    }

    @JsonProperty("bpr01_transactionhandlingcode")
    public void setBpr01Transactionhandlingcode(String bpr01Transactionhandlingcode) {
        this.bpr01Transactionhandlingcode = bpr01Transactionhandlingcode;
    }

    public Transaction_ withBpr01Transactionhandlingcode(String bpr01Transactionhandlingcode) {
        this.bpr01Transactionhandlingcode = bpr01Transactionhandlingcode;
        return this;
    }

    @JsonProperty("bpr02_totlactlprovdrpaymntamnt")
    public String getBpr02Totlactlprovdrpaymntamnt() {
        return bpr02Totlactlprovdrpaymntamnt;
    }

    @JsonProperty("bpr02_totlactlprovdrpaymntamnt")
    public void setBpr02Totlactlprovdrpaymntamnt(String bpr02Totlactlprovdrpaymntamnt) {
        this.bpr02Totlactlprovdrpaymntamnt = bpr02Totlactlprovdrpaymntamnt;
    }

    public Transaction_ withBpr02Totlactlprovdrpaymntamnt(String bpr02Totlactlprovdrpaymntamnt) {
        this.bpr02Totlactlprovdrpaymntamnt = bpr02Totlactlprovdrpaymntamnt;
        return this;
    }

    @JsonProperty("bpr03_creditdebitflagcode")
    public String getBpr03Creditdebitflagcode() {
        return bpr03Creditdebitflagcode;
    }

    @JsonProperty("bpr03_creditdebitflagcode")
    public void setBpr03Creditdebitflagcode(String bpr03Creditdebitflagcode) {
        this.bpr03Creditdebitflagcode = bpr03Creditdebitflagcode;
    }

    public Transaction_ withBpr03Creditdebitflagcode(String bpr03Creditdebitflagcode) {
        this.bpr03Creditdebitflagcode = bpr03Creditdebitflagcode;
        return this;
    }

    @JsonProperty("bpr04_paymentmethodcode")
    public String getBpr04Paymentmethodcode() {
        return bpr04Paymentmethodcode;
    }

    @JsonProperty("bpr04_paymentmethodcode")
    public void setBpr04Paymentmethodcode(String bpr04Paymentmethodcode) {
        this.bpr04Paymentmethodcode = bpr04Paymentmethodcode;
    }

    public Transaction_ withBpr04Paymentmethodcode(String bpr04Paymentmethodcode) {
        this.bpr04Paymentmethodcode = bpr04Paymentmethodcode;
        return this;
    }

    @JsonProperty("bpr05_paymentformatcode")
    public String getBpr05Paymentformatcode() {
        return bpr05Paymentformatcode;
    }

    @JsonProperty("bpr05_paymentformatcode")
    public void setBpr05Paymentformatcode(String bpr05Paymentformatcode) {
        this.bpr05Paymentformatcode = bpr05Paymentformatcode;
    }

    public Transaction_ withBpr05Paymentformatcode(String bpr05Paymentformatcode) {
        this.bpr05Paymentformatcode = bpr05Paymentformatcode;
        return this;
    }

    @JsonProperty("bpr06_payerdfi_idnoqlfr")
    public String getBpr06PayerdfiIdnoqlfr() {
        return bpr06PayerdfiIdnoqlfr;
    }

    @JsonProperty("bpr06_payerdfi_idnoqlfr")
    public void setBpr06PayerdfiIdnoqlfr(String bpr06PayerdfiIdnoqlfr) {
        this.bpr06PayerdfiIdnoqlfr = bpr06PayerdfiIdnoqlfr;
    }

    public Transaction_ withBpr06PayerdfiIdnoqlfr(String bpr06PayerdfiIdnoqlfr) {
        this.bpr06PayerdfiIdnoqlfr = bpr06PayerdfiIdnoqlfr;
        return this;
    }

    @JsonProperty("bpr07_payerdfi_idno")
    public String getBpr07PayerdfiIdno() {
        return bpr07PayerdfiIdno;
    }

    @JsonProperty("bpr07_payerdfi_idno")
    public void setBpr07PayerdfiIdno(String bpr07PayerdfiIdno) {
        this.bpr07PayerdfiIdno = bpr07PayerdfiIdno;
    }

    public Transaction_ withBpr07PayerdfiIdno(String bpr07PayerdfiIdno) {
        this.bpr07PayerdfiIdno = bpr07PayerdfiIdno;
        return this;
    }

    @JsonProperty("bpr08_accountnoqual")
    public String getBpr08Accountnoqual() {
        return bpr08Accountnoqual;
    }

    @JsonProperty("bpr08_accountnoqual")
    public void setBpr08Accountnoqual(String bpr08Accountnoqual) {
        this.bpr08Accountnoqual = bpr08Accountnoqual;
    }

    public Transaction_ withBpr08Accountnoqual(String bpr08Accountnoqual) {
        this.bpr08Accountnoqual = bpr08Accountnoqual;
        return this;
    }

    @JsonProperty("bpr09_senderbankaccntno")
    public String getBpr09Senderbankaccntno() {
        return bpr09Senderbankaccntno;
    }

    @JsonProperty("bpr09_senderbankaccntno")
    public void setBpr09Senderbankaccntno(String bpr09Senderbankaccntno) {
        this.bpr09Senderbankaccntno = bpr09Senderbankaccntno;
    }

    public Transaction_ withBpr09Senderbankaccntno(String bpr09Senderbankaccntno) {
        this.bpr09Senderbankaccntno = bpr09Senderbankaccntno;
        return this;
    }

    @JsonProperty("bpr10_payeridfr")
    public String getBpr10Payeridfr() {
        return bpr10Payeridfr;
    }

    @JsonProperty("bpr10_payeridfr")
    public void setBpr10Payeridfr(String bpr10Payeridfr) {
        this.bpr10Payeridfr = bpr10Payeridfr;
    }

    public Transaction_ withBpr10Payeridfr(String bpr10Payeridfr) {
        this.bpr10Payeridfr = bpr10Payeridfr;
        return this;
    }

    @JsonProperty("bpr11_origcompanysupplmntlcode")
    public String getBpr11Origcompanysupplmntlcode() {
        return bpr11Origcompanysupplmntlcode;
    }

    @JsonProperty("bpr11_origcompanysupplmntlcode")
    public void setBpr11Origcompanysupplmntlcode(String bpr11Origcompanysupplmntlcode) {
        this.bpr11Origcompanysupplmntlcode = bpr11Origcompanysupplmntlcode;
    }

    public Transaction_ withBpr11Origcompanysupplmntlcode(String bpr11Origcompanysupplmntlcode) {
        this.bpr11Origcompanysupplmntlcode = bpr11Origcompanysupplmntlcode;
        return this;
    }

    @JsonProperty("bpr12_receiverdfi_idnoqlfr")
    public String getBpr12ReceiverdfiIdnoqlfr() {
        return bpr12ReceiverdfiIdnoqlfr;
    }

    @JsonProperty("bpr12_receiverdfi_idnoqlfr")
    public void setBpr12ReceiverdfiIdnoqlfr(String bpr12ReceiverdfiIdnoqlfr) {
        this.bpr12ReceiverdfiIdnoqlfr = bpr12ReceiverdfiIdnoqlfr;
    }

    public Transaction_ withBpr12ReceiverdfiIdnoqlfr(String bpr12ReceiverdfiIdnoqlfr) {
        this.bpr12ReceiverdfiIdnoqlfr = bpr12ReceiverdfiIdnoqlfr;
        return this;
    }

    @JsonProperty("bpr13_receiverorprovbankidno")
    public String getBpr13Receiverorprovbankidno() {
        return bpr13Receiverorprovbankidno;
    }

    @JsonProperty("bpr13_receiverorprovbankidno")
    public void setBpr13Receiverorprovbankidno(String bpr13Receiverorprovbankidno) {
        this.bpr13Receiverorprovbankidno = bpr13Receiverorprovbankidno;
    }

    public Transaction_ withBpr13Receiverorprovbankidno(String bpr13Receiverorprovbankidno) {
        this.bpr13Receiverorprovbankidno = bpr13Receiverorprovbankidno;
        return this;
    }

    @JsonProperty("bpr14_accountnoqual")
    public String getBpr14Accountnoqual() {
        return bpr14Accountnoqual;
    }

    @JsonProperty("bpr14_accountnoqual")
    public void setBpr14Accountnoqual(String bpr14Accountnoqual) {
        this.bpr14Accountnoqual = bpr14Accountnoqual;
    }

    public Transaction_ withBpr14Accountnoqual(String bpr14Accountnoqual) {
        this.bpr14Accountnoqual = bpr14Accountnoqual;
        return this;
    }

    @JsonProperty("bpr15_receiverorprovaccntno")
    public String getBpr15Receiverorprovaccntno() {
        return bpr15Receiverorprovaccntno;
    }

    @JsonProperty("bpr15_receiverorprovaccntno")
    public void setBpr15Receiverorprovaccntno(String bpr15Receiverorprovaccntno) {
        this.bpr15Receiverorprovaccntno = bpr15Receiverorprovaccntno;
    }

    public Transaction_ withBpr15Receiverorprovaccntno(String bpr15Receiverorprovaccntno) {
        this.bpr15Receiverorprovaccntno = bpr15Receiverorprovaccntno;
        return this;
    }

    @JsonProperty("bpr16_checkissueeft_effdate")
    public String getBpr16CheckissueeftEffdate() {
        return bpr16CheckissueeftEffdate;
    }

    @JsonProperty("bpr16_checkissueeft_effdate")
    public void setBpr16CheckissueeftEffdate(String bpr16CheckissueeftEffdate) {
        this.bpr16CheckissueeftEffdate = bpr16CheckissueeftEffdate;
    }

    public Transaction_ withBpr16CheckissueeftEffdate(String bpr16CheckissueeftEffdate) {
        this.bpr16CheckissueeftEffdate = bpr16CheckissueeftEffdate;
        return this;
    }

    @JsonProperty("trn01_tracetypecode")
    public String getTrn01Tracetypecode() {
        return trn01Tracetypecode;
    }

    @JsonProperty("trn01_tracetypecode")
    public void setTrn01Tracetypecode(String trn01Tracetypecode) {
        this.trn01Tracetypecode = trn01Tracetypecode;
    }

    public Transaction_ withTrn01Tracetypecode(String trn01Tracetypecode) {
        this.trn01Tracetypecode = trn01Tracetypecode;
        return this;
    }

    @JsonProperty("trn02_checkeft_tracenumber")
    public String getTrn02CheckeftTracenumber() {
        return trn02CheckeftTracenumber;
    }

    @JsonProperty("trn02_checkeft_tracenumber")
    public void setTrn02CheckeftTracenumber(String trn02CheckeftTracenumber) {
        this.trn02CheckeftTracenumber = trn02CheckeftTracenumber;
    }

    public Transaction_ withTrn02CheckeftTracenumber(String trn02CheckeftTracenumber) {
        this.trn02CheckeftTracenumber = trn02CheckeftTracenumber;
        return this;
    }

    @JsonProperty("trn03_payeridfrein")
    public String getTrn03Payeridfrein() {
        return trn03Payeridfrein;
    }

    @JsonProperty("trn03_payeridfrein")
    public void setTrn03Payeridfrein(String trn03Payeridfrein) {
        this.trn03Payeridfrein = trn03Payeridfrein;
    }

    public Transaction_ withTrn03Payeridfrein(String trn03Payeridfrein) {
        this.trn03Payeridfrein = trn03Payeridfrein;
        return this;
    }

    @JsonProperty("trn04_origcompysupplmntlcode")
    public String getTrn04Origcompysupplmntlcode() {
        return trn04Origcompysupplmntlcode;
    }

    @JsonProperty("trn04_origcompysupplmntlcode")
    public void setTrn04Origcompysupplmntlcode(String trn04Origcompysupplmntlcode) {
        this.trn04Origcompysupplmntlcode = trn04Origcompysupplmntlcode;
    }

    public Transaction_ withTrn04Origcompysupplmntlcode(String trn04Origcompysupplmntlcode) {
        this.trn04Origcompysupplmntlcode = trn04Origcompysupplmntlcode;
        return this;
    }

    @JsonProperty("cur01_entityidencode")
    public String getCur01Entityidencode() {
        return cur01Entityidencode;
    }

    @JsonProperty("cur01_entityidencode")
    public void setCur01Entityidencode(String cur01Entityidencode) {
        this.cur01Entityidencode = cur01Entityidencode;
    }

    public Transaction_ withCur01Entityidencode(String cur01Entityidencode) {
        this.cur01Entityidencode = cur01Entityidencode;
        return this;
    }

    @JsonProperty("cur02_payercurrencycode")
    public String getCur02Payercurrencycode() {
        return cur02Payercurrencycode;
    }

    @JsonProperty("cur02_payercurrencycode")
    public void setCur02Payercurrencycode(String cur02Payercurrencycode) {
        this.cur02Payercurrencycode = cur02Payercurrencycode;
    }

    public Transaction_ withCur02Payercurrencycode(String cur02Payercurrencycode) {
        this.cur02Payercurrencycode = cur02Payercurrencycode;
        return this;
    }

    @JsonProperty("ref01_receiverrefidenqlfr")
    public String getRef01Receiverrefidenqlfr() {
        return ref01Receiverrefidenqlfr;
    }

    @JsonProperty("ref01_receiverrefidenqlfr")
    public void setRef01Receiverrefidenqlfr(String ref01Receiverrefidenqlfr) {
        this.ref01Receiverrefidenqlfr = ref01Receiverrefidenqlfr;
    }

    public Transaction_ withRef01Receiverrefidenqlfr(String ref01Receiverrefidenqlfr) {
        this.ref01Receiverrefidenqlfr = ref01Receiverrefidenqlfr;
        return this;
    }

    @JsonProperty("ref02_receiveridfr")
    public String getRef02Receiveridfr() {
        return ref02Receiveridfr;
    }

    @JsonProperty("ref02_receiveridfr")
    public void setRef02Receiveridfr(String ref02Receiveridfr) {
        this.ref02Receiveridfr = ref02Receiveridfr;
    }

    public Transaction_ withRef02Receiveridfr(String ref02Receiveridfr) {
        this.ref02Receiveridfr = ref02Receiveridfr;
        return this;
    }

    @JsonProperty("ref01_versionrefidenqlfr")
    public String getRef01Versionrefidenqlfr() {
        return ref01Versionrefidenqlfr;
    }

    @JsonProperty("ref01_versionrefidenqlfr")
    public void setRef01Versionrefidenqlfr(String ref01Versionrefidenqlfr) {
        this.ref01Versionrefidenqlfr = ref01Versionrefidenqlfr;
    }

    public Transaction_ withRef01Versionrefidenqlfr(String ref01Versionrefidenqlfr) {
        this.ref01Versionrefidenqlfr = ref01Versionrefidenqlfr;
        return this;
    }

    @JsonProperty("ref02_versionidcode")
    public String getRef02Versionidcode() {
        return ref02Versionidcode;
    }

    @JsonProperty("ref02_versionidcode")
    public void setRef02Versionidcode(String ref02Versionidcode) {
        this.ref02Versionidcode = ref02Versionidcode;
    }

    public Transaction_ withRef02Versionidcode(String ref02Versionidcode) {
        this.ref02Versionidcode = ref02Versionidcode;
        return this;
    }

    @JsonProperty("dtm01_datetimequalorproduction")
    public String getDtm01Datetimequalorproduction() {
        return dtm01Datetimequalorproduction;
    }

    @JsonProperty("dtm01_datetimequalorproduction")
    public void setDtm01Datetimequalorproduction(String dtm01Datetimequalorproduction) {
        this.dtm01Datetimequalorproduction = dtm01Datetimequalorproduction;
    }

    public Transaction_ withDtm01Datetimequalorproduction(String dtm01Datetimequalorproduction) {
        this.dtm01Datetimequalorproduction = dtm01Datetimequalorproduction;
        return this;
    }

    @JsonProperty("dtm02_productiondate")
    public String getDtm02Productiondate() {
        return dtm02Productiondate;
    }

    @JsonProperty("dtm02_productiondate")
    public void setDtm02Productiondate(String dtm02Productiondate) {
        this.dtm02Productiondate = dtm02Productiondate;
    }

    public Transaction_ withDtm02Productiondate(String dtm02Productiondate) {
        this.dtm02Productiondate = dtm02Productiondate;
        return this;
    }

    @JsonProperty("n101_entityidencodeorpayer")
    public String getN101Entityidencodeorpayer() {
        return n101Entityidencodeorpayer;
    }

    @JsonProperty("n101_entityidencodeorpayer")
    public void setN101Entityidencodeorpayer(String n101Entityidencodeorpayer) {
        this.n101Entityidencodeorpayer = n101Entityidencodeorpayer;
    }

    public Transaction_ withN101Entityidencodeorpayer(String n101Entityidencodeorpayer) {
        this.n101Entityidencodeorpayer = n101Entityidencodeorpayer;
        return this;
    }

    @JsonProperty("n102_idencodequalororgiden")
    public String getN102Idencodequalororgiden() {
        return n102Idencodequalororgiden;
    }

    @JsonProperty("n102_idencodequalororgiden")
    public void setN102Idencodequalororgiden(String n102Idencodequalororgiden) {
        this.n102Idencodequalororgiden = n102Idencodequalororgiden;
    }

    public Transaction_ withN102Idencodequalororgiden(String n102Idencodequalororgiden) {
        this.n102Idencodequalororgiden = n102Idencodequalororgiden;
        return this;
    }

    @JsonProperty("n103_payername")
    public String getN103Payername() {
        return n103Payername;
    }

    @JsonProperty("n103_payername")
    public void setN103Payername(String n103Payername) {
        this.n103Payername = n103Payername;
    }

    public Transaction_ withN103Payername(String n103Payername) {
        this.n103Payername = n103Payername;
        return this;
    }

    @JsonProperty("n104_payeridfr")
    public String getN104Payeridfr() {
        return n104Payeridfr;
    }

    @JsonProperty("n104_payeridfr")
    public void setN104Payeridfr(String n104Payeridfr) {
        this.n104Payeridfr = n104Payeridfr;
    }

    public Transaction_ withN104Payeridfr(String n104Payeridfr) {
        this.n104Payeridfr = n104Payeridfr;
        return this;
    }

    @JsonProperty("n301_payeraddress1")
    public String getN301Payeraddress1() {
        return n301Payeraddress1;
    }

    @JsonProperty("n301_payeraddress1")
    public void setN301Payeraddress1(String n301Payeraddress1) {
        this.n301Payeraddress1 = n301Payeraddress1;
    }

    public Transaction_ withN301Payeraddress1(String n301Payeraddress1) {
        this.n301Payeraddress1 = n301Payeraddress1;
        return this;
    }

    @JsonProperty("n302_payeraddress2")
    public String getN302Payeraddress2() {
        return n302Payeraddress2;
    }

    @JsonProperty("n302_payeraddress2")
    public void setN302Payeraddress2(String n302Payeraddress2) {
        this.n302Payeraddress2 = n302Payeraddress2;
    }

    public Transaction_ withN302Payeraddress2(String n302Payeraddress2) {
        this.n302Payeraddress2 = n302Payeraddress2;
        return this;
    }

    @JsonProperty("n401_payercityname")
    public String getN401Payercityname() {
        return n401Payercityname;
    }

    @JsonProperty("n401_payercityname")
    public void setN401Payercityname(String n401Payercityname) {
        this.n401Payercityname = n401Payercityname;
    }

    public Transaction_ withN401Payercityname(String n401Payercityname) {
        this.n401Payercityname = n401Payercityname;
        return this;
    }

    @JsonProperty("n402_payerstatecode")
    public String getN402Payerstatecode() {
        return n402Payerstatecode;
    }

    @JsonProperty("n402_payerstatecode")
    public void setN402Payerstatecode(String n402Payerstatecode) {
        this.n402Payerstatecode = n402Payerstatecode;
    }

    public Transaction_ withN402Payerstatecode(String n402Payerstatecode) {
        this.n402Payerstatecode = n402Payerstatecode;
        return this;
    }

    @JsonProperty("n403_payerpostalzipcode")
    public String getN403Payerpostalzipcode() {
        return n403Payerpostalzipcode;
    }

    @JsonProperty("n403_payerpostalzipcode")
    public void setN403Payerpostalzipcode(String n403Payerpostalzipcode) {
        this.n403Payerpostalzipcode = n403Payerpostalzipcode;
    }

    public Transaction_ withN403Payerpostalzipcode(String n403Payerpostalzipcode) {
        this.n403Payerpostalzipcode = n403Payerpostalzipcode;
        return this;
    }

    @JsonProperty("n404_payercountrycode")
    public String getN404Payercountrycode() {
        return n404Payercountrycode;
    }

    @JsonProperty("n404_payercountrycode")
    public void setN404Payercountrycode(String n404Payercountrycode) {
        this.n404Payercountrycode = n404Payercountrycode;
    }

    public Transaction_ withN404Payercountrycode(String n404Payercountrycode) {
        this.n404Payercountrycode = n404Payercountrycode;
        return this;
    }

    @JsonProperty("n407_payercountrysubcode")
    public String getN407Payercountrysubcode() {
        return n407Payercountrysubcode;
    }

    @JsonProperty("n407_payercountrysubcode")
    public void setN407Payercountrysubcode(String n407Payercountrysubcode) {
        this.n407Payercountrysubcode = n407Payercountrysubcode;
    }

    public Transaction_ withN407Payercountrysubcode(String n407Payercountrysubcode) {
        this.n407Payercountrysubcode = n407Payercountrysubcode;
        return this;
    }

    @JsonProperty("ref01_payeraddtlidqlfr")
    public String getRef01Payeraddtlidqlfr() {
        return ref01Payeraddtlidqlfr;
    }

    @JsonProperty("ref01_payeraddtlidqlfr")
    public void setRef01Payeraddtlidqlfr(String ref01Payeraddtlidqlfr) {
        this.ref01Payeraddtlidqlfr = ref01Payeraddtlidqlfr;
    }

    public Transaction_ withRef01Payeraddtlidqlfr(String ref01Payeraddtlidqlfr) {
        this.ref01Payeraddtlidqlfr = ref01Payeraddtlidqlfr;
        return this;
    }

    @JsonProperty("ref02_payeraddtlidfr")
    public String getRef02Payeraddtlidfr() {
        return ref02Payeraddtlidfr;
    }

    @JsonProperty("ref02_payeraddtlidfr")
    public void setRef02Payeraddtlidfr(String ref02Payeraddtlidfr) {
        this.ref02Payeraddtlidfr = ref02Payeraddtlidfr;
    }

    public Transaction_ withRef02Payeraddtlidfr(String ref02Payeraddtlidfr) {
        this.ref02Payeraddtlidfr = ref02Payeraddtlidfr;
        return this;
    }

    @JsonProperty("per01_payerclmofc")
    public String getPer01Payerclmofc() {
        return per01Payerclmofc;
    }

    @JsonProperty("per01_payerclmofc")
    public void setPer01Payerclmofc(String per01Payerclmofc) {
        this.per01Payerclmofc = per01Payerclmofc;
    }

    public Transaction_ withPer01Payerclmofc(String per01Payerclmofc) {
        this.per01Payerclmofc = per01Payerclmofc;
        return this;
    }

    @JsonProperty("per02_payercontactname")
    public String getPer02Payercontactname() {
        return per02Payercontactname;
    }

    @JsonProperty("per02_payercontactname")
    public void setPer02Payercontactname(String per02Payercontactname) {
        this.per02Payercontactname = per02Payercontactname;
    }

    public Transaction_ withPer02Payercontactname(String per02Payercontactname) {
        this.per02Payercontactname = per02Payercontactname;
        return this;
    }

    @JsonProperty("per03_payercommnoqual")
    public String getPer03Payercommnoqual() {
        return per03Payercommnoqual;
    }

    @JsonProperty("per03_payercommnoqual")
    public void setPer03Payercommnoqual(String per03Payercommnoqual) {
        this.per03Payercommnoqual = per03Payercommnoqual;
    }

    public Transaction_ withPer03Payercommnoqual(String per03Payercommnoqual) {
        this.per03Payercommnoqual = per03Payercommnoqual;
        return this;
    }

    @JsonProperty("per04_payercontactcommno")
    public String getPer04Payercontactcommno() {
        return per04Payercontactcommno;
    }

    @JsonProperty("per04_payercontactcommno")
    public void setPer04Payercontactcommno(String per04Payercontactcommno) {
        this.per04Payercontactcommno = per04Payercontactcommno;
    }

    public Transaction_ withPer04Payercontactcommno(String per04Payercontactcommno) {
        this.per04Payercontactcommno = per04Payercontactcommno;
        return this;
    }

    @JsonProperty("per05_payersecondcommnoqual")
    public String getPer05Payersecondcommnoqual() {
        return per05Payersecondcommnoqual;
    }

    @JsonProperty("per05_payersecondcommnoqual")
    public void setPer05Payersecondcommnoqual(String per05Payersecondcommnoqual) {
        this.per05Payersecondcommnoqual = per05Payersecondcommnoqual;
    }

    public Transaction_ withPer05Payersecondcommnoqual(String per05Payersecondcommnoqual) {
        this.per05Payersecondcommnoqual = per05Payersecondcommnoqual;
        return this;
    }

    @JsonProperty("per06_payersecondcontactcommno")
    public String getPer06Payersecondcontactcommno() {
        return per06Payersecondcontactcommno;
    }

    @JsonProperty("per06_payersecondcontactcommno")
    public void setPer06Payersecondcontactcommno(String per06Payersecondcontactcommno) {
        this.per06Payersecondcontactcommno = per06Payersecondcontactcommno;
    }

    public Transaction_ withPer06Payersecondcontactcommno(String per06Payersecondcontactcommno) {
        this.per06Payersecondcontactcommno = per06Payersecondcontactcommno;
        return this;
    }

    @JsonProperty("per07_payerextnqual")
    public String getPer07Payerextnqual() {
        return per07Payerextnqual;
    }

    @JsonProperty("per07_payerextnqual")
    public void setPer07Payerextnqual(String per07Payerextnqual) {
        this.per07Payerextnqual = per07Payerextnqual;
    }

    public Transaction_ withPer07Payerextnqual(String per07Payerextnqual) {
        this.per07Payerextnqual = per07Payerextnqual;
        return this;
    }

    @JsonProperty("per08_payersecondextnqual")
    public String getPer08Payersecondextnqual() {
        return per08Payersecondextnqual;
    }

    @JsonProperty("per08_payersecondextnqual")
    public void setPer08Payersecondextnqual(String per08Payersecondextnqual) {
        this.per08Payersecondextnqual = per08Payersecondextnqual;
    }

    public Transaction_ withPer08Payersecondextnqual(String per08Payersecondextnqual) {
        this.per08Payersecondextnqual = per08Payersecondextnqual;
        return this;
    }

    @JsonProperty("per01_admininfocontact")
    public String getPer01Admininfocontact() {
        return per01Admininfocontact;
    }

    @JsonProperty("per01_admininfocontact")
    public void setPer01Admininfocontact(String per01Admininfocontact) {
        this.per01Admininfocontact = per01Admininfocontact;
    }

    public Transaction_ withPer01Admininfocontact(String per01Admininfocontact) {
        this.per01Admininfocontact = per01Admininfocontact;
        return this;
    }

    @JsonProperty("per03_admincommnoqual")
    public String getPer03Admincommnoqual() {
        return per03Admincommnoqual;
    }

    @JsonProperty("per03_admincommnoqual")
    public void setPer03Admincommnoqual(String per03Admincommnoqual) {
        this.per03Admincommnoqual = per03Admincommnoqual;
    }

    public Transaction_ withPer03Admincommnoqual(String per03Admincommnoqual) {
        this.per03Admincommnoqual = per03Admincommnoqual;
        return this;
    }

    @JsonProperty("per04_admincommno")
    public String getPer04Admincommno() {
        return per04Admincommno;
    }

    @JsonProperty("per04_admincommno")
    public void setPer04Admincommno(String per04Admincommno) {
        this.per04Admincommno = per04Admincommno;
    }

    public Transaction_ withPer04Admincommno(String per04Admincommno) {
        this.per04Admincommno = per04Admincommno;
        return this;
    }

    @JsonProperty("n101_payeeidencode")
    public String getN101Payeeidencode() {
        return n101Payeeidencode;
    }

    @JsonProperty("n101_payeeidencode")
    public void setN101Payeeidencode(String n101Payeeidencode) {
        this.n101Payeeidencode = n101Payeeidencode;
    }

    public Transaction_ withN101Payeeidencode(String n101Payeeidencode) {
        this.n101Payeeidencode = n101Payeeidencode;
        return this;
    }

    @JsonProperty("n102_payeename")
    public String getN102Payeename() {
        return n102Payeename;
    }

    @JsonProperty("n102_payeename")
    public void setN102Payeename(String n102Payeename) {
        this.n102Payeename = n102Payeename;
    }

    public Transaction_ withN102Payeename(String n102Payeename) {
        this.n102Payeename = n102Payeename;
        return this;
    }

    @JsonProperty("n103_payeecodeqlfr")
    public String getN103Payeecodeqlfr() {
        return n103Payeecodeqlfr;
    }

    @JsonProperty("n103_payeecodeqlfr")
    public void setN103Payeecodeqlfr(String n103Payeecodeqlfr) {
        this.n103Payeecodeqlfr = n103Payeecodeqlfr;
    }

    public Transaction_ withN103Payeecodeqlfr(String n103Payeecodeqlfr) {
        this.n103Payeecodeqlfr = n103Payeecodeqlfr;
        return this;
    }

    @JsonProperty("n104_payeeidfr")
    public String getN104Payeeidfr() {
        return n104Payeeidfr;
    }

    @JsonProperty("n104_payeeidfr")
    public void setN104Payeeidfr(String n104Payeeidfr) {
        this.n104Payeeidfr = n104Payeeidfr;
    }

    public Transaction_ withN104Payeeidfr(String n104Payeeidfr) {
        this.n104Payeeidfr = n104Payeeidfr;
        return this;
    }

    @JsonProperty("n301_payeeaddress1")
    public String getN301Payeeaddress1() {
        return n301Payeeaddress1;
    }

    @JsonProperty("n301_payeeaddress1")
    public void setN301Payeeaddress1(String n301Payeeaddress1) {
        this.n301Payeeaddress1 = n301Payeeaddress1;
    }

    public Transaction_ withN301Payeeaddress1(String n301Payeeaddress1) {
        this.n301Payeeaddress1 = n301Payeeaddress1;
        return this;
    }

    @JsonProperty("n302_payeeaddress2")
    public String getN302Payeeaddress2() {
        return n302Payeeaddress2;
    }

    @JsonProperty("n302_payeeaddress2")
    public void setN302Payeeaddress2(String n302Payeeaddress2) {
        this.n302Payeeaddress2 = n302Payeeaddress2;
    }

    public Transaction_ withN302Payeeaddress2(String n302Payeeaddress2) {
        this.n302Payeeaddress2 = n302Payeeaddress2;
        return this;
    }

    @JsonProperty("n401_payeecityname")
    public String getN401Payeecityname() {
        return n401Payeecityname;
    }

    @JsonProperty("n401_payeecityname")
    public void setN401Payeecityname(String n401Payeecityname) {
        this.n401Payeecityname = n401Payeecityname;
    }

    public Transaction_ withN401Payeecityname(String n401Payeecityname) {
        this.n401Payeecityname = n401Payeecityname;
        return this;
    }

    @JsonProperty("n402_payeestatecode")
    public String getN402Payeestatecode() {
        return n402Payeestatecode;
    }

    @JsonProperty("n402_payeestatecode")
    public void setN402Payeestatecode(String n402Payeestatecode) {
        this.n402Payeestatecode = n402Payeestatecode;
    }

    public Transaction_ withN402Payeestatecode(String n402Payeestatecode) {
        this.n402Payeestatecode = n402Payeestatecode;
        return this;
    }

    @JsonProperty("n403_payeepostalzipcode")
    public String getN403Payeepostalzipcode() {
        return n403Payeepostalzipcode;
    }

    @JsonProperty("n403_payeepostalzipcode")
    public void setN403Payeepostalzipcode(String n403Payeepostalzipcode) {
        this.n403Payeepostalzipcode = n403Payeepostalzipcode;
    }

    public Transaction_ withN403Payeepostalzipcode(String n403Payeepostalzipcode) {
        this.n403Payeepostalzipcode = n403Payeepostalzipcode;
        return this;
    }

    @JsonProperty("n404_payeecountrycode")
    public String getN404Payeecountrycode() {
        return n404Payeecountrycode;
    }

    @JsonProperty("n404_payeecountrycode")
    public void setN404Payeecountrycode(String n404Payeecountrycode) {
        this.n404Payeecountrycode = n404Payeecountrycode;
    }

    public Transaction_ withN404Payeecountrycode(String n404Payeecountrycode) {
        this.n404Payeecountrycode = n404Payeecountrycode;
        return this;
    }

    @JsonProperty("n407_payeecountrysubcode")
    public String getN407Payeecountrysubcode() {
        return n407Payeecountrysubcode;
    }

    @JsonProperty("n407_payeecountrysubcode")
    public void setN407Payeecountrysubcode(String n407Payeecountrysubcode) {
        this.n407Payeecountrysubcode = n407Payeecountrysubcode;
    }

    public Transaction_ withN407Payeecountrysubcode(String n407Payeecountrysubcode) {
        this.n407Payeecountrysubcode = n407Payeecountrysubcode;
        return this;
    }

    @JsonProperty("ref01_payeeaddtlidqlfr")
    public String getRef01Payeeaddtlidqlfr() {
        return ref01Payeeaddtlidqlfr;
    }

    @JsonProperty("ref01_payeeaddtlidqlfr")
    public void setRef01Payeeaddtlidqlfr(String ref01Payeeaddtlidqlfr) {
        this.ref01Payeeaddtlidqlfr = ref01Payeeaddtlidqlfr;
    }

    public Transaction_ withRef01Payeeaddtlidqlfr(String ref01Payeeaddtlidqlfr) {
        this.ref01Payeeaddtlidqlfr = ref01Payeeaddtlidqlfr;
        return this;
    }

    @JsonProperty("ref02_payeeaddtlidfr")
    public String getRef02Payeeaddtlidfr() {
        return ref02Payeeaddtlidfr;
    }

    @JsonProperty("ref02_payeeaddtlidfr")
    public void setRef02Payeeaddtlidfr(String ref02Payeeaddtlidfr) {
        this.ref02Payeeaddtlidfr = ref02Payeeaddtlidfr;
    }

    public Transaction_ withRef02Payeeaddtlidfr(String ref02Payeeaddtlidfr) {
        this.ref02Payeeaddtlidfr = ref02Payeeaddtlidfr;
        return this;
    }

    @JsonProperty("rdm01_payeeremittrnsmsncode")
    public String getRdm01Payeeremittrnsmsncode() {
        return rdm01Payeeremittrnsmsncode;
    }

    @JsonProperty("rdm01_payeeremittrnsmsncode")
    public void setRdm01Payeeremittrnsmsncode(String rdm01Payeeremittrnsmsncode) {
        this.rdm01Payeeremittrnsmsncode = rdm01Payeeremittrnsmsncode;
    }

    public Transaction_ withRdm01Payeeremittrnsmsncode(String rdm01Payeeremittrnsmsncode) {
        this.rdm01Payeeremittrnsmsncode = rdm01Payeeremittrnsmsncode;
        return this;
    }

    @JsonProperty("rdm02_payeeremitname")
    public String getRdm02Payeeremitname() {
        return rdm02Payeeremitname;
    }

    @JsonProperty("rdm02_payeeremitname")
    public void setRdm02Payeeremitname(String rdm02Payeeremitname) {
        this.rdm02Payeeremitname = rdm02Payeeremitname;
    }

    public Transaction_ withRdm02Payeeremitname(String rdm02Payeeremitname) {
        this.rdm02Payeeremitname = rdm02Payeeremitname;
        return this;
    }

    @JsonProperty("rdm03_payeeremitcommunication")
    public String getRdm03Payeeremitcommunication() {
        return rdm03Payeeremitcommunication;
    }

    @JsonProperty("rdm03_payeeremitcommunication")
    public void setRdm03Payeeremitcommunication(String rdm03Payeeremitcommunication) {
        this.rdm03Payeeremitcommunication = rdm03Payeeremitcommunication;
    }

    public Transaction_ withRdm03Payeeremitcommunication(String rdm03Payeeremitcommunication) {
        this.rdm03Payeeremitcommunication = rdm03Payeeremitcommunication;
        return this;
    }

    @JsonProperty("plb01_provideridentifier")
    public String getPlb01Provideridentifier() {
        return plb01Provideridentifier;
    }

    @JsonProperty("plb01_provideridentifier")
    public void setPlb01Provideridentifier(String plb01Provideridentifier) {
        this.plb01Provideridentifier = plb01Provideridentifier;
    }

    public Transaction_ withPlb01Provideridentifier(String plb01Provideridentifier) {
        this.plb01Provideridentifier = plb01Provideridentifier;
        return this;
    }

    @JsonProperty("plb02_fiscalperioddate")
    public String getPlb02Fiscalperioddate() {
        return plb02Fiscalperioddate;
    }

    @JsonProperty("plb02_fiscalperioddate")
    public void setPlb02Fiscalperioddate(String plb02Fiscalperioddate) {
        this.plb02Fiscalperioddate = plb02Fiscalperioddate;
    }

    public Transaction_ withPlb02Fiscalperioddate(String plb02Fiscalperioddate) {
        this.plb02Fiscalperioddate = plb02Fiscalperioddate;
        return this;
    }

    @JsonProperty("plb03_adjustmentiden")
    public String getPlb03Adjustmentiden() {
        return plb03Adjustmentiden;
    }

    @JsonProperty("plb03_adjustmentiden")
    public void setPlb03Adjustmentiden(String plb03Adjustmentiden) {
        this.plb03Adjustmentiden = plb03Adjustmentiden;
    }

    public Transaction_ withPlb03Adjustmentiden(String plb03Adjustmentiden) {
        this.plb03Adjustmentiden = plb03Adjustmentiden;
        return this;
    }

    @JsonProperty("plb03_01_adjustmentreasoncode")
    public String getPlb0301Adjustmentreasoncode() {
        return plb0301Adjustmentreasoncode;
    }

    @JsonProperty("plb03_01_adjustmentreasoncode")
    public void setPlb0301Adjustmentreasoncode(String plb0301Adjustmentreasoncode) {
        this.plb0301Adjustmentreasoncode = plb0301Adjustmentreasoncode;
    }

    public Transaction_ withPlb0301Adjustmentreasoncode(String plb0301Adjustmentreasoncode) {
        this.plb0301Adjustmentreasoncode = plb0301Adjustmentreasoncode;
        return this;
    }

    @JsonProperty("plb03_02_provadjidentifier")
    public String getPlb0302Provadjidentifier() {
        return plb0302Provadjidentifier;
    }

    @JsonProperty("plb03_02_provadjidentifier")
    public void setPlb0302Provadjidentifier(String plb0302Provadjidentifier) {
        this.plb0302Provadjidentifier = plb0302Provadjidentifier;
    }

    public Transaction_ withPlb0302Provadjidentifier(String plb0302Provadjidentifier) {
        this.plb0302Provadjidentifier = plb0302Provadjidentifier;
        return this;
    }

    @JsonProperty("plb04_provadjamount")
    public String getPlb04Provadjamount() {
        return plb04Provadjamount;
    }

    @JsonProperty("plb04_provadjamount")
    public void setPlb04Provadjamount(String plb04Provadjamount) {
        this.plb04Provadjamount = plb04Provadjamount;
    }

    public Transaction_ withPlb04Provadjamount(String plb04Provadjamount) {
        this.plb04Provadjamount = plb04Provadjamount;
        return this;
    }

    @JsonProperty("plb05_adjustmentiden")
    public String getPlb05Adjustmentiden() {
        return plb05Adjustmentiden;
    }

    @JsonProperty("plb05_adjustmentiden")
    public void setPlb05Adjustmentiden(String plb05Adjustmentiden) {
        this.plb05Adjustmentiden = plb05Adjustmentiden;
    }

    public Transaction_ withPlb05Adjustmentiden(String plb05Adjustmentiden) {
        this.plb05Adjustmentiden = plb05Adjustmentiden;
        return this;
    }

    @JsonProperty("plb05_01_adjustmentreasoncode")
    public String getPlb0501Adjustmentreasoncode() {
        return plb0501Adjustmentreasoncode;
    }

    @JsonProperty("plb05_01_adjustmentreasoncode")
    public void setPlb0501Adjustmentreasoncode(String plb0501Adjustmentreasoncode) {
        this.plb0501Adjustmentreasoncode = plb0501Adjustmentreasoncode;
    }

    public Transaction_ withPlb0501Adjustmentreasoncode(String plb0501Adjustmentreasoncode) {
        this.plb0501Adjustmentreasoncode = plb0501Adjustmentreasoncode;
        return this;
    }

    @JsonProperty("plb05_02_provideradjustmentid")
    public String getPlb0502Provideradjustmentid() {
        return plb0502Provideradjustmentid;
    }

    @JsonProperty("plb05_02_provideradjustmentid")
    public void setPlb0502Provideradjustmentid(String plb0502Provideradjustmentid) {
        this.plb0502Provideradjustmentid = plb0502Provideradjustmentid;
    }

    public Transaction_ withPlb0502Provideradjustmentid(String plb0502Provideradjustmentid) {
        this.plb0502Provideradjustmentid = plb0502Provideradjustmentid;
        return this;
    }

    @JsonProperty("plb06_provideradjustmentamount")
    public String getPlb06Provideradjustmentamount() {
        return plb06Provideradjustmentamount;
    }

    @JsonProperty("plb06_provideradjustmentamount")
    public void setPlb06Provideradjustmentamount(String plb06Provideradjustmentamount) {
        this.plb06Provideradjustmentamount = plb06Provideradjustmentamount;
    }

    public Transaction_ withPlb06Provideradjustmentamount(String plb06Provideradjustmentamount) {
        this.plb06Provideradjustmentamount = plb06Provideradjustmentamount;
        return this;
    }

    @JsonProperty("plb07_adjustmentiden")
    public String getPlb07Adjustmentiden() {
        return plb07Adjustmentiden;
    }

    @JsonProperty("plb07_adjustmentiden")
    public void setPlb07Adjustmentiden(String plb07Adjustmentiden) {
        this.plb07Adjustmentiden = plb07Adjustmentiden;
    }

    public Transaction_ withPlb07Adjustmentiden(String plb07Adjustmentiden) {
        this.plb07Adjustmentiden = plb07Adjustmentiden;
        return this;
    }

    @JsonProperty("plb07_01_adjustmentreasoncode")
    public String getPlb0701Adjustmentreasoncode() {
        return plb0701Adjustmentreasoncode;
    }

    @JsonProperty("plb07_01_adjustmentreasoncode")
    public void setPlb0701Adjustmentreasoncode(String plb0701Adjustmentreasoncode) {
        this.plb0701Adjustmentreasoncode = plb0701Adjustmentreasoncode;
    }

    public Transaction_ withPlb0701Adjustmentreasoncode(String plb0701Adjustmentreasoncode) {
        this.plb0701Adjustmentreasoncode = plb0701Adjustmentreasoncode;
        return this;
    }

    @JsonProperty("plb07_02_provideradjustmentid")
    public String getPlb0702Provideradjustmentid() {
        return plb0702Provideradjustmentid;
    }

    @JsonProperty("plb07_02_provideradjustmentid")
    public void setPlb0702Provideradjustmentid(String plb0702Provideradjustmentid) {
        this.plb0702Provideradjustmentid = plb0702Provideradjustmentid;
    }

    public Transaction_ withPlb0702Provideradjustmentid(String plb0702Provideradjustmentid) {
        this.plb0702Provideradjustmentid = plb0702Provideradjustmentid;
        return this;
    }

    @JsonProperty("plb08_provideradjustmentamount")
    public String getPlb08Provideradjustmentamount() {
        return plb08Provideradjustmentamount;
    }

    @JsonProperty("plb08_provideradjustmentamount")
    public void setPlb08Provideradjustmentamount(String plb08Provideradjustmentamount) {
        this.plb08Provideradjustmentamount = plb08Provideradjustmentamount;
    }

    public Transaction_ withPlb08Provideradjustmentamount(String plb08Provideradjustmentamount) {
        this.plb08Provideradjustmentamount = plb08Provideradjustmentamount;
        return this;
    }

    @JsonProperty("plb09_adjustmentiden")
    public String getPlb09Adjustmentiden() {
        return plb09Adjustmentiden;
    }

    @JsonProperty("plb09_adjustmentiden")
    public void setPlb09Adjustmentiden(String plb09Adjustmentiden) {
        this.plb09Adjustmentiden = plb09Adjustmentiden;
    }

    public Transaction_ withPlb09Adjustmentiden(String plb09Adjustmentiden) {
        this.plb09Adjustmentiden = plb09Adjustmentiden;
        return this;
    }

    @JsonProperty("plb09_01_adjustmentreasoncode")
    public String getPlb0901Adjustmentreasoncode() {
        return plb0901Adjustmentreasoncode;
    }

    @JsonProperty("plb09_01_adjustmentreasoncode")
    public void setPlb0901Adjustmentreasoncode(String plb0901Adjustmentreasoncode) {
        this.plb0901Adjustmentreasoncode = plb0901Adjustmentreasoncode;
    }

    public Transaction_ withPlb0901Adjustmentreasoncode(String plb0901Adjustmentreasoncode) {
        this.plb0901Adjustmentreasoncode = plb0901Adjustmentreasoncode;
        return this;
    }

    @JsonProperty("plb09_02_provideradjustmentid")
    public String getPlb0902Provideradjustmentid() {
        return plb0902Provideradjustmentid;
    }

    @JsonProperty("plb09_02_provideradjustmentid")
    public void setPlb0902Provideradjustmentid(String plb0902Provideradjustmentid) {
        this.plb0902Provideradjustmentid = plb0902Provideradjustmentid;
    }

    public Transaction_ withPlb0902Provideradjustmentid(String plb0902Provideradjustmentid) {
        this.plb0902Provideradjustmentid = plb0902Provideradjustmentid;
        return this;
    }

    @JsonProperty("plb10_provideradjustmentamount")
    public String getPlb10Provideradjustmentamount() {
        return plb10Provideradjustmentamount;
    }

    @JsonProperty("plb10_provideradjustmentamount")
    public void setPlb10Provideradjustmentamount(String plb10Provideradjustmentamount) {
        this.plb10Provideradjustmentamount = plb10Provideradjustmentamount;
    }

    public Transaction_ withPlb10Provideradjustmentamount(String plb10Provideradjustmentamount) {
        this.plb10Provideradjustmentamount = plb10Provideradjustmentamount;
        return this;
    }

    @JsonProperty("plb11_adjustmentiden")
    public String getPlb11Adjustmentiden() {
        return plb11Adjustmentiden;
    }

    @JsonProperty("plb11_adjustmentiden")
    public void setPlb11Adjustmentiden(String plb11Adjustmentiden) {
        this.plb11Adjustmentiden = plb11Adjustmentiden;
    }

    public Transaction_ withPlb11Adjustmentiden(String plb11Adjustmentiden) {
        this.plb11Adjustmentiden = plb11Adjustmentiden;
        return this;
    }

    @JsonProperty("plb11_01_adjustmentreasoncode")
    public String getPlb1101Adjustmentreasoncode() {
        return plb1101Adjustmentreasoncode;
    }

    @JsonProperty("plb11_01_adjustmentreasoncode")
    public void setPlb1101Adjustmentreasoncode(String plb1101Adjustmentreasoncode) {
        this.plb1101Adjustmentreasoncode = plb1101Adjustmentreasoncode;
    }

    public Transaction_ withPlb1101Adjustmentreasoncode(String plb1101Adjustmentreasoncode) {
        this.plb1101Adjustmentreasoncode = plb1101Adjustmentreasoncode;
        return this;
    }

    @JsonProperty("plb11_02_provideradjustmentid")
    public String getPlb1102Provideradjustmentid() {
        return plb1102Provideradjustmentid;
    }

    @JsonProperty("plb11_02_provideradjustmentid")
    public void setPlb1102Provideradjustmentid(String plb1102Provideradjustmentid) {
        this.plb1102Provideradjustmentid = plb1102Provideradjustmentid;
    }

    public Transaction_ withPlb1102Provideradjustmentid(String plb1102Provideradjustmentid) {
        this.plb1102Provideradjustmentid = plb1102Provideradjustmentid;
        return this;
    }

    @JsonProperty("plb12_provideradjustmentamount")
    public String getPlb12Provideradjustmentamount() {
        return plb12Provideradjustmentamount;
    }

    @JsonProperty("plb12_provideradjustmentamount")
    public void setPlb12Provideradjustmentamount(String plb12Provideradjustmentamount) {
        this.plb12Provideradjustmentamount = plb12Provideradjustmentamount;
    }

    public Transaction_ withPlb12Provideradjustmentamount(String plb12Provideradjustmentamount) {
        this.plb12Provideradjustmentamount = plb12Provideradjustmentamount;
        return this;
    }

    @JsonProperty("plb13_adjustmentiden")
    public String getPlb13Adjustmentiden() {
        return plb13Adjustmentiden;
    }

    @JsonProperty("plb13_adjustmentiden")
    public void setPlb13Adjustmentiden(String plb13Adjustmentiden) {
        this.plb13Adjustmentiden = plb13Adjustmentiden;
    }

    public Transaction_ withPlb13Adjustmentiden(String plb13Adjustmentiden) {
        this.plb13Adjustmentiden = plb13Adjustmentiden;
        return this;
    }

    @JsonProperty("plb13_01_adjustmentreasoncode")
    public String getPlb1301Adjustmentreasoncode() {
        return plb1301Adjustmentreasoncode;
    }

    @JsonProperty("plb13_01_adjustmentreasoncode")
    public void setPlb1301Adjustmentreasoncode(String plb1301Adjustmentreasoncode) {
        this.plb1301Adjustmentreasoncode = plb1301Adjustmentreasoncode;
    }

    public Transaction_ withPlb1301Adjustmentreasoncode(String plb1301Adjustmentreasoncode) {
        this.plb1301Adjustmentreasoncode = plb1301Adjustmentreasoncode;
        return this;
    }

    @JsonProperty("plb13_02_provideradjustmentid")
    public String getPlb1302Provideradjustmentid() {
        return plb1302Provideradjustmentid;
    }

    @JsonProperty("plb13_02_provideradjustmentid")
    public void setPlb1302Provideradjustmentid(String plb1302Provideradjustmentid) {
        this.plb1302Provideradjustmentid = plb1302Provideradjustmentid;
    }

    public Transaction_ withPlb1302Provideradjustmentid(String plb1302Provideradjustmentid) {
        this.plb1302Provideradjustmentid = plb1302Provideradjustmentid;
        return this;
    }

    @JsonProperty("plb14_provideradjustmentamount")
    public String getPlb14Provideradjustmentamount() {
        return plb14Provideradjustmentamount;
    }

    @JsonProperty("plb14_provideradjustmentamount")
    public void setPlb14Provideradjustmentamount(String plb14Provideradjustmentamount) {
        this.plb14Provideradjustmentamount = plb14Provideradjustmentamount;
    }

    public Transaction_ withPlb14Provideradjustmentamount(String plb14Provideradjustmentamount) {
        this.plb14Provideradjustmentamount = plb14Provideradjustmentamount;
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

    public Transaction_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payHeaderId).append(payEcnId).append(st01Transetidfrcode).append(st02Transetcontrolno).append(bpr01Transactionhandlingcode).append(bpr02Totlactlprovdrpaymntamnt).append(bpr03Creditdebitflagcode).append(bpr04Paymentmethodcode).append(bpr05Paymentformatcode).append(bpr06PayerdfiIdnoqlfr).append(bpr07PayerdfiIdno).append(bpr08Accountnoqual).append(bpr09Senderbankaccntno).append(bpr10Payeridfr).append(bpr11Origcompanysupplmntlcode).append(bpr12ReceiverdfiIdnoqlfr).append(bpr13Receiverorprovbankidno).append(bpr14Accountnoqual).append(bpr15Receiverorprovaccntno).append(bpr16CheckissueeftEffdate).append(trn01Tracetypecode).append(trn02CheckeftTracenumber).append(trn03Payeridfrein).append(trn04Origcompysupplmntlcode).append(cur01Entityidencode).append(cur02Payercurrencycode).append(ref01Receiverrefidenqlfr).append(ref02Receiveridfr).append(ref01Versionrefidenqlfr).append(ref02Versionidcode).append(dtm01Datetimequalorproduction).append(dtm02Productiondate).append(n101Entityidencodeorpayer).append(n102Idencodequalororgiden).append(n103Payername).append(n104Payeridfr).append(n301Payeraddress1).append(n302Payeraddress2).append(n401Payercityname).append(n402Payerstatecode).append(n403Payerpostalzipcode).append(n404Payercountrycode).append(n407Payercountrysubcode).append(ref01Payeraddtlidqlfr).append(ref02Payeraddtlidfr).append(per01Payerclmofc).append(per02Payercontactname).append(per03Payercommnoqual).append(per04Payercontactcommno).append(per05Payersecondcommnoqual).append(per06Payersecondcontactcommno).append(per07Payerextnqual).append(per08Payersecondextnqual).append(per01Admininfocontact).append(per03Admincommnoqual).append(per04Admincommno).append(n101Payeeidencode).append(n102Payeename).append(n103Payeecodeqlfr).append(n104Payeeidfr).append(n301Payeeaddress1).append(n302Payeeaddress2).append(n401Payeecityname).append(n402Payeestatecode).append(n403Payeepostalzipcode).append(n404Payeecountrycode).append(n407Payeecountrysubcode).append(ref01Payeeaddtlidqlfr).append(ref02Payeeaddtlidfr).append(rdm01Payeeremittrnsmsncode).append(rdm02Payeeremitname).append(rdm03Payeeremitcommunication).append(plb01Provideridentifier).append(plb02Fiscalperioddate).append(plb03Adjustmentiden).append(plb0301Adjustmentreasoncode).append(plb0302Provadjidentifier).append(plb04Provadjamount).append(plb05Adjustmentiden).append(plb0501Adjustmentreasoncode).append(plb0502Provideradjustmentid).append(plb06Provideradjustmentamount).append(plb07Adjustmentiden).append(plb0701Adjustmentreasoncode).append(plb0702Provideradjustmentid).append(plb08Provideradjustmentamount).append(plb09Adjustmentiden).append(plb0901Adjustmentreasoncode).append(plb0902Provideradjustmentid).append(plb10Provideradjustmentamount).append(plb11Adjustmentiden).append(plb1101Adjustmentreasoncode).append(plb1102Provideradjustmentid).append(plb12Provideradjustmentamount).append(plb13Adjustmentiden).append(plb1301Adjustmentreasoncode).append(plb1302Provideradjustmentid).append(plb14Provideradjustmentamount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction_) == false) {
            return false;
        }
        Transaction_ rhs = ((Transaction_) other);
        return new EqualsBuilder().append(payHeaderId, rhs.payHeaderId).append(payEcnId, rhs.payEcnId).append(st01Transetidfrcode, rhs.st01Transetidfrcode).append(st02Transetcontrolno, rhs.st02Transetcontrolno).append(bpr01Transactionhandlingcode, rhs.bpr01Transactionhandlingcode).append(bpr02Totlactlprovdrpaymntamnt, rhs.bpr02Totlactlprovdrpaymntamnt).append(bpr03Creditdebitflagcode, rhs.bpr03Creditdebitflagcode).append(bpr04Paymentmethodcode, rhs.bpr04Paymentmethodcode).append(bpr05Paymentformatcode, rhs.bpr05Paymentformatcode).append(bpr06PayerdfiIdnoqlfr, rhs.bpr06PayerdfiIdnoqlfr).append(bpr07PayerdfiIdno, rhs.bpr07PayerdfiIdno).append(bpr08Accountnoqual, rhs.bpr08Accountnoqual).append(bpr09Senderbankaccntno, rhs.bpr09Senderbankaccntno).append(bpr10Payeridfr, rhs.bpr10Payeridfr).append(bpr11Origcompanysupplmntlcode, rhs.bpr11Origcompanysupplmntlcode).append(bpr12ReceiverdfiIdnoqlfr, rhs.bpr12ReceiverdfiIdnoqlfr).append(bpr13Receiverorprovbankidno, rhs.bpr13Receiverorprovbankidno).append(bpr14Accountnoqual, rhs.bpr14Accountnoqual).append(bpr15Receiverorprovaccntno, rhs.bpr15Receiverorprovaccntno).append(bpr16CheckissueeftEffdate, rhs.bpr16CheckissueeftEffdate).append(trn01Tracetypecode, rhs.trn01Tracetypecode).append(trn02CheckeftTracenumber, rhs.trn02CheckeftTracenumber).append(trn03Payeridfrein, rhs.trn03Payeridfrein).append(trn04Origcompysupplmntlcode, rhs.trn04Origcompysupplmntlcode).append(cur01Entityidencode, rhs.cur01Entityidencode).append(cur02Payercurrencycode, rhs.cur02Payercurrencycode).append(ref01Receiverrefidenqlfr, rhs.ref01Receiverrefidenqlfr).append(ref02Receiveridfr, rhs.ref02Receiveridfr).append(ref01Versionrefidenqlfr, rhs.ref01Versionrefidenqlfr).append(ref02Versionidcode, rhs.ref02Versionidcode).append(dtm01Datetimequalorproduction, rhs.dtm01Datetimequalorproduction).append(dtm02Productiondate, rhs.dtm02Productiondate).append(n101Entityidencodeorpayer, rhs.n101Entityidencodeorpayer).append(n102Idencodequalororgiden, rhs.n102Idencodequalororgiden).append(n103Payername, rhs.n103Payername).append(n104Payeridfr, rhs.n104Payeridfr).append(n301Payeraddress1, rhs.n301Payeraddress1).append(n302Payeraddress2, rhs.n302Payeraddress2).append(n401Payercityname, rhs.n401Payercityname).append(n402Payerstatecode, rhs.n402Payerstatecode).append(n403Payerpostalzipcode, rhs.n403Payerpostalzipcode).append(n404Payercountrycode, rhs.n404Payercountrycode).append(n407Payercountrysubcode, rhs.n407Payercountrysubcode).append(ref01Payeraddtlidqlfr, rhs.ref01Payeraddtlidqlfr).append(ref02Payeraddtlidfr, rhs.ref02Payeraddtlidfr).append(per01Payerclmofc, rhs.per01Payerclmofc).append(per02Payercontactname, rhs.per02Payercontactname).append(per03Payercommnoqual, rhs.per03Payercommnoqual).append(per04Payercontactcommno, rhs.per04Payercontactcommno).append(per05Payersecondcommnoqual, rhs.per05Payersecondcommnoqual).append(per06Payersecondcontactcommno, rhs.per06Payersecondcontactcommno).append(per07Payerextnqual, rhs.per07Payerextnqual).append(per08Payersecondextnqual, rhs.per08Payersecondextnqual).append(per01Admininfocontact, rhs.per01Admininfocontact).append(per03Admincommnoqual, rhs.per03Admincommnoqual).append(per04Admincommno, rhs.per04Admincommno).append(n101Payeeidencode, rhs.n101Payeeidencode).append(n102Payeename, rhs.n102Payeename).append(n103Payeecodeqlfr, rhs.n103Payeecodeqlfr).append(n104Payeeidfr, rhs.n104Payeeidfr).append(n301Payeeaddress1, rhs.n301Payeeaddress1).append(n302Payeeaddress2, rhs.n302Payeeaddress2).append(n401Payeecityname, rhs.n401Payeecityname).append(n402Payeestatecode, rhs.n402Payeestatecode).append(n403Payeepostalzipcode, rhs.n403Payeepostalzipcode).append(n404Payeecountrycode, rhs.n404Payeecountrycode).append(n407Payeecountrysubcode, rhs.n407Payeecountrysubcode).append(ref01Payeeaddtlidqlfr, rhs.ref01Payeeaddtlidqlfr).append(ref02Payeeaddtlidfr, rhs.ref02Payeeaddtlidfr).append(rdm01Payeeremittrnsmsncode, rhs.rdm01Payeeremittrnsmsncode).append(rdm02Payeeremitname, rhs.rdm02Payeeremitname).append(rdm03Payeeremitcommunication, rhs.rdm03Payeeremitcommunication).append(plb01Provideridentifier, rhs.plb01Provideridentifier).append(plb02Fiscalperioddate, rhs.plb02Fiscalperioddate).append(plb03Adjustmentiden, rhs.plb03Adjustmentiden).append(plb0301Adjustmentreasoncode, rhs.plb0301Adjustmentreasoncode).append(plb0302Provadjidentifier, rhs.plb0302Provadjidentifier).append(plb04Provadjamount, rhs.plb04Provadjamount).append(plb05Adjustmentiden, rhs.plb05Adjustmentiden).append(plb0501Adjustmentreasoncode, rhs.plb0501Adjustmentreasoncode).append(plb0502Provideradjustmentid, rhs.plb0502Provideradjustmentid).append(plb06Provideradjustmentamount, rhs.plb06Provideradjustmentamount).append(plb07Adjustmentiden, rhs.plb07Adjustmentiden).append(plb0701Adjustmentreasoncode, rhs.plb0701Adjustmentreasoncode).append(plb0702Provideradjustmentid, rhs.plb0702Provideradjustmentid).append(plb08Provideradjustmentamount, rhs.plb08Provideradjustmentamount).append(plb09Adjustmentiden, rhs.plb09Adjustmentiden).append(plb0901Adjustmentreasoncode, rhs.plb0901Adjustmentreasoncode).append(plb0902Provideradjustmentid, rhs.plb0902Provideradjustmentid).append(plb10Provideradjustmentamount, rhs.plb10Provideradjustmentamount).append(plb11Adjustmentiden, rhs.plb11Adjustmentiden).append(plb1101Adjustmentreasoncode, rhs.plb1101Adjustmentreasoncode).append(plb1102Provideradjustmentid, rhs.plb1102Provideradjustmentid).append(plb12Provideradjustmentamount, rhs.plb12Provideradjustmentamount).append(plb13Adjustmentiden, rhs.plb13Adjustmentiden).append(plb1301Adjustmentreasoncode, rhs.plb1301Adjustmentreasoncode).append(plb1302Provideradjustmentid, rhs.plb1302Provideradjustmentid).append(plb14Provideradjustmentamount, rhs.plb14Provideradjustmentamount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

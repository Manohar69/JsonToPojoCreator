
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
    "pay_detail_id",
    "pay_header_id",
    "lx01_assignednumber",
    "ts301_provideridentifier",
    "ts302_providerfacilitytypecode",
    "ts303_fiscalperioddate",
    "ts304_totalclaimcount",
    "ts305_totalclaimchargeamount",
    "ts313_totalmsppayeramount",
    "ts315_totalnonlabchargeamount",
    "ts317_totalhcpcsreportedchargeamount",
    "ts318_totalhcpcspayableamount",
    "ts320_totalprofessionalcomponentamount",
    "ts321_totalmsppatientliabilitymetamount",
    "ts322_totalpatientreimbursementamount",
    "ts323_totalpipclaimcount",
    "ts324_totalpipadjustmentamount",
    "ts201_totaldrgamount",
    "ts202_totalfederalspecificamount",
    "ts203_totalhospitalspecificamount",
    "ts204_totaldisproportionateshareamount",
    "ts205_totalcapitalamount",
    "ts206_totalindirectmedicaleducationamount",
    "ts207_totaloutlierdaycount",
    "ts208_totaldayoutlieramount",
    "ts209_totalcostoutlieramount",
    "ts210_averagedrglengthofstay",
    "ts211_totaldischargecount",
    "ts212_totalcostreportdaycount",
    "ts213_totalcovereddaycount",
    "ts214_totalnoncovereddaycount",
    "ts215_totalmsppassthroughamount",
    "ts216_averagedrgweight",
    "ts217_totalppscapitalfspdrgamount",
    "ts218_totalppscapitalhspdrgamount",
    "ts219_totalppsdshdrgamount"
})
public class PaymentDetail {

    @JsonProperty("pay_detail_id")
    private Integer payDetailId;
    @JsonProperty("pay_header_id")
    private Integer payHeaderId;
    @JsonProperty("lx01_assignednumber")
    private String lx01Assignednumber;
    @JsonProperty("ts301_provideridentifier")
    private String ts301Provideridentifier;
    @JsonProperty("ts302_providerfacilitytypecode")
    private String ts302Providerfacilitytypecode;
    @JsonProperty("ts303_fiscalperioddate")
    private String ts303Fiscalperioddate;
    @JsonProperty("ts304_totalclaimcount")
    private String ts304Totalclaimcount;
    @JsonProperty("ts305_totalclaimchargeamount")
    private String ts305Totalclaimchargeamount;
    @JsonProperty("ts313_totalmsppayeramount")
    private String ts313Totalmsppayeramount;
    @JsonProperty("ts315_totalnonlabchargeamount")
    private String ts315Totalnonlabchargeamount;
    @JsonProperty("ts317_totalhcpcsreportedchargeamount")
    private String ts317Totalhcpcsreportedchargeamount;
    @JsonProperty("ts318_totalhcpcspayableamount")
    private String ts318Totalhcpcspayableamount;
    @JsonProperty("ts320_totalprofessionalcomponentamount")
    private String ts320Totalprofessionalcomponentamount;
    @JsonProperty("ts321_totalmsppatientliabilitymetamount")
    private String ts321Totalmsppatientliabilitymetamount;
    @JsonProperty("ts322_totalpatientreimbursementamount")
    private String ts322Totalpatientreimbursementamount;
    @JsonProperty("ts323_totalpipclaimcount")
    private String ts323Totalpipclaimcount;
    @JsonProperty("ts324_totalpipadjustmentamount")
    private String ts324Totalpipadjustmentamount;
    @JsonProperty("ts201_totaldrgamount")
    private String ts201Totaldrgamount;
    @JsonProperty("ts202_totalfederalspecificamount")
    private String ts202Totalfederalspecificamount;
    @JsonProperty("ts203_totalhospitalspecificamount")
    private String ts203Totalhospitalspecificamount;
    @JsonProperty("ts204_totaldisproportionateshareamount")
    private String ts204Totaldisproportionateshareamount;
    @JsonProperty("ts205_totalcapitalamount")
    private String ts205Totalcapitalamount;
    @JsonProperty("ts206_totalindirectmedicaleducationamount")
    private String ts206Totalindirectmedicaleducationamount;
    @JsonProperty("ts207_totaloutlierdaycount")
    private String ts207Totaloutlierdaycount;
    @JsonProperty("ts208_totaldayoutlieramount")
    private String ts208Totaldayoutlieramount;
    @JsonProperty("ts209_totalcostoutlieramount")
    private String ts209Totalcostoutlieramount;
    @JsonProperty("ts210_averagedrglengthofstay")
    private String ts210Averagedrglengthofstay;
    @JsonProperty("ts211_totaldischargecount")
    private String ts211Totaldischargecount;
    @JsonProperty("ts212_totalcostreportdaycount")
    private String ts212Totalcostreportdaycount;
    @JsonProperty("ts213_totalcovereddaycount")
    private String ts213Totalcovereddaycount;
    @JsonProperty("ts214_totalnoncovereddaycount")
    private String ts214Totalnoncovereddaycount;
    @JsonProperty("ts215_totalmsppassthroughamount")
    private String ts215Totalmsppassthroughamount;
    @JsonProperty("ts216_averagedrgweight")
    private String ts216Averagedrgweight;
    @JsonProperty("ts217_totalppscapitalfspdrgamount")
    private String ts217Totalppscapitalfspdrgamount;
    @JsonProperty("ts218_totalppscapitalhspdrgamount")
    private String ts218Totalppscapitalhspdrgamount;
    @JsonProperty("ts219_totalppsdshdrgamount")
    private String ts219Totalppsdshdrgamount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pay_detail_id")
    public Integer getPayDetailId() {
        return payDetailId;
    }

    @JsonProperty("pay_detail_id")
    public void setPayDetailId(Integer payDetailId) {
        this.payDetailId = payDetailId;
    }

    public PaymentDetail withPayDetailId(Integer payDetailId) {
        this.payDetailId = payDetailId;
        return this;
    }

    @JsonProperty("pay_header_id")
    public Integer getPayHeaderId() {
        return payHeaderId;
    }

    @JsonProperty("pay_header_id")
    public void setPayHeaderId(Integer payHeaderId) {
        this.payHeaderId = payHeaderId;
    }

    public PaymentDetail withPayHeaderId(Integer payHeaderId) {
        this.payHeaderId = payHeaderId;
        return this;
    }

    @JsonProperty("lx01_assignednumber")
    public String getLx01Assignednumber() {
        return lx01Assignednumber;
    }

    @JsonProperty("lx01_assignednumber")
    public void setLx01Assignednumber(String lx01Assignednumber) {
        this.lx01Assignednumber = lx01Assignednumber;
    }

    public PaymentDetail withLx01Assignednumber(String lx01Assignednumber) {
        this.lx01Assignednumber = lx01Assignednumber;
        return this;
    }

    @JsonProperty("ts301_provideridentifier")
    public String getTs301Provideridentifier() {
        return ts301Provideridentifier;
    }

    @JsonProperty("ts301_provideridentifier")
    public void setTs301Provideridentifier(String ts301Provideridentifier) {
        this.ts301Provideridentifier = ts301Provideridentifier;
    }

    public PaymentDetail withTs301Provideridentifier(String ts301Provideridentifier) {
        this.ts301Provideridentifier = ts301Provideridentifier;
        return this;
    }

    @JsonProperty("ts302_providerfacilitytypecode")
    public String getTs302Providerfacilitytypecode() {
        return ts302Providerfacilitytypecode;
    }

    @JsonProperty("ts302_providerfacilitytypecode")
    public void setTs302Providerfacilitytypecode(String ts302Providerfacilitytypecode) {
        this.ts302Providerfacilitytypecode = ts302Providerfacilitytypecode;
    }

    public PaymentDetail withTs302Providerfacilitytypecode(String ts302Providerfacilitytypecode) {
        this.ts302Providerfacilitytypecode = ts302Providerfacilitytypecode;
        return this;
    }

    @JsonProperty("ts303_fiscalperioddate")
    public String getTs303Fiscalperioddate() {
        return ts303Fiscalperioddate;
    }

    @JsonProperty("ts303_fiscalperioddate")
    public void setTs303Fiscalperioddate(String ts303Fiscalperioddate) {
        this.ts303Fiscalperioddate = ts303Fiscalperioddate;
    }

    public PaymentDetail withTs303Fiscalperioddate(String ts303Fiscalperioddate) {
        this.ts303Fiscalperioddate = ts303Fiscalperioddate;
        return this;
    }

    @JsonProperty("ts304_totalclaimcount")
    public String getTs304Totalclaimcount() {
        return ts304Totalclaimcount;
    }

    @JsonProperty("ts304_totalclaimcount")
    public void setTs304Totalclaimcount(String ts304Totalclaimcount) {
        this.ts304Totalclaimcount = ts304Totalclaimcount;
    }

    public PaymentDetail withTs304Totalclaimcount(String ts304Totalclaimcount) {
        this.ts304Totalclaimcount = ts304Totalclaimcount;
        return this;
    }

    @JsonProperty("ts305_totalclaimchargeamount")
    public String getTs305Totalclaimchargeamount() {
        return ts305Totalclaimchargeamount;
    }

    @JsonProperty("ts305_totalclaimchargeamount")
    public void setTs305Totalclaimchargeamount(String ts305Totalclaimchargeamount) {
        this.ts305Totalclaimchargeamount = ts305Totalclaimchargeamount;
    }

    public PaymentDetail withTs305Totalclaimchargeamount(String ts305Totalclaimchargeamount) {
        this.ts305Totalclaimchargeamount = ts305Totalclaimchargeamount;
        return this;
    }

    @JsonProperty("ts313_totalmsppayeramount")
    public String getTs313Totalmsppayeramount() {
        return ts313Totalmsppayeramount;
    }

    @JsonProperty("ts313_totalmsppayeramount")
    public void setTs313Totalmsppayeramount(String ts313Totalmsppayeramount) {
        this.ts313Totalmsppayeramount = ts313Totalmsppayeramount;
    }

    public PaymentDetail withTs313Totalmsppayeramount(String ts313Totalmsppayeramount) {
        this.ts313Totalmsppayeramount = ts313Totalmsppayeramount;
        return this;
    }

    @JsonProperty("ts315_totalnonlabchargeamount")
    public String getTs315Totalnonlabchargeamount() {
        return ts315Totalnonlabchargeamount;
    }

    @JsonProperty("ts315_totalnonlabchargeamount")
    public void setTs315Totalnonlabchargeamount(String ts315Totalnonlabchargeamount) {
        this.ts315Totalnonlabchargeamount = ts315Totalnonlabchargeamount;
    }

    public PaymentDetail withTs315Totalnonlabchargeamount(String ts315Totalnonlabchargeamount) {
        this.ts315Totalnonlabchargeamount = ts315Totalnonlabchargeamount;
        return this;
    }

    @JsonProperty("ts317_totalhcpcsreportedchargeamount")
    public String getTs317Totalhcpcsreportedchargeamount() {
        return ts317Totalhcpcsreportedchargeamount;
    }

    @JsonProperty("ts317_totalhcpcsreportedchargeamount")
    public void setTs317Totalhcpcsreportedchargeamount(String ts317Totalhcpcsreportedchargeamount) {
        this.ts317Totalhcpcsreportedchargeamount = ts317Totalhcpcsreportedchargeamount;
    }

    public PaymentDetail withTs317Totalhcpcsreportedchargeamount(String ts317Totalhcpcsreportedchargeamount) {
        this.ts317Totalhcpcsreportedchargeamount = ts317Totalhcpcsreportedchargeamount;
        return this;
    }

    @JsonProperty("ts318_totalhcpcspayableamount")
    public String getTs318Totalhcpcspayableamount() {
        return ts318Totalhcpcspayableamount;
    }

    @JsonProperty("ts318_totalhcpcspayableamount")
    public void setTs318Totalhcpcspayableamount(String ts318Totalhcpcspayableamount) {
        this.ts318Totalhcpcspayableamount = ts318Totalhcpcspayableamount;
    }

    public PaymentDetail withTs318Totalhcpcspayableamount(String ts318Totalhcpcspayableamount) {
        this.ts318Totalhcpcspayableamount = ts318Totalhcpcspayableamount;
        return this;
    }

    @JsonProperty("ts320_totalprofessionalcomponentamount")
    public String getTs320Totalprofessionalcomponentamount() {
        return ts320Totalprofessionalcomponentamount;
    }

    @JsonProperty("ts320_totalprofessionalcomponentamount")
    public void setTs320Totalprofessionalcomponentamount(String ts320Totalprofessionalcomponentamount) {
        this.ts320Totalprofessionalcomponentamount = ts320Totalprofessionalcomponentamount;
    }

    public PaymentDetail withTs320Totalprofessionalcomponentamount(String ts320Totalprofessionalcomponentamount) {
        this.ts320Totalprofessionalcomponentamount = ts320Totalprofessionalcomponentamount;
        return this;
    }

    @JsonProperty("ts321_totalmsppatientliabilitymetamount")
    public String getTs321Totalmsppatientliabilitymetamount() {
        return ts321Totalmsppatientliabilitymetamount;
    }

    @JsonProperty("ts321_totalmsppatientliabilitymetamount")
    public void setTs321Totalmsppatientliabilitymetamount(String ts321Totalmsppatientliabilitymetamount) {
        this.ts321Totalmsppatientliabilitymetamount = ts321Totalmsppatientliabilitymetamount;
    }

    public PaymentDetail withTs321Totalmsppatientliabilitymetamount(String ts321Totalmsppatientliabilitymetamount) {
        this.ts321Totalmsppatientliabilitymetamount = ts321Totalmsppatientliabilitymetamount;
        return this;
    }

    @JsonProperty("ts322_totalpatientreimbursementamount")
    public String getTs322Totalpatientreimbursementamount() {
        return ts322Totalpatientreimbursementamount;
    }

    @JsonProperty("ts322_totalpatientreimbursementamount")
    public void setTs322Totalpatientreimbursementamount(String ts322Totalpatientreimbursementamount) {
        this.ts322Totalpatientreimbursementamount = ts322Totalpatientreimbursementamount;
    }

    public PaymentDetail withTs322Totalpatientreimbursementamount(String ts322Totalpatientreimbursementamount) {
        this.ts322Totalpatientreimbursementamount = ts322Totalpatientreimbursementamount;
        return this;
    }

    @JsonProperty("ts323_totalpipclaimcount")
    public String getTs323Totalpipclaimcount() {
        return ts323Totalpipclaimcount;
    }

    @JsonProperty("ts323_totalpipclaimcount")
    public void setTs323Totalpipclaimcount(String ts323Totalpipclaimcount) {
        this.ts323Totalpipclaimcount = ts323Totalpipclaimcount;
    }

    public PaymentDetail withTs323Totalpipclaimcount(String ts323Totalpipclaimcount) {
        this.ts323Totalpipclaimcount = ts323Totalpipclaimcount;
        return this;
    }

    @JsonProperty("ts324_totalpipadjustmentamount")
    public String getTs324Totalpipadjustmentamount() {
        return ts324Totalpipadjustmentamount;
    }

    @JsonProperty("ts324_totalpipadjustmentamount")
    public void setTs324Totalpipadjustmentamount(String ts324Totalpipadjustmentamount) {
        this.ts324Totalpipadjustmentamount = ts324Totalpipadjustmentamount;
    }

    public PaymentDetail withTs324Totalpipadjustmentamount(String ts324Totalpipadjustmentamount) {
        this.ts324Totalpipadjustmentamount = ts324Totalpipadjustmentamount;
        return this;
    }

    @JsonProperty("ts201_totaldrgamount")
    public String getTs201Totaldrgamount() {
        return ts201Totaldrgamount;
    }

    @JsonProperty("ts201_totaldrgamount")
    public void setTs201Totaldrgamount(String ts201Totaldrgamount) {
        this.ts201Totaldrgamount = ts201Totaldrgamount;
    }

    public PaymentDetail withTs201Totaldrgamount(String ts201Totaldrgamount) {
        this.ts201Totaldrgamount = ts201Totaldrgamount;
        return this;
    }

    @JsonProperty("ts202_totalfederalspecificamount")
    public String getTs202Totalfederalspecificamount() {
        return ts202Totalfederalspecificamount;
    }

    @JsonProperty("ts202_totalfederalspecificamount")
    public void setTs202Totalfederalspecificamount(String ts202Totalfederalspecificamount) {
        this.ts202Totalfederalspecificamount = ts202Totalfederalspecificamount;
    }

    public PaymentDetail withTs202Totalfederalspecificamount(String ts202Totalfederalspecificamount) {
        this.ts202Totalfederalspecificamount = ts202Totalfederalspecificamount;
        return this;
    }

    @JsonProperty("ts203_totalhospitalspecificamount")
    public String getTs203Totalhospitalspecificamount() {
        return ts203Totalhospitalspecificamount;
    }

    @JsonProperty("ts203_totalhospitalspecificamount")
    public void setTs203Totalhospitalspecificamount(String ts203Totalhospitalspecificamount) {
        this.ts203Totalhospitalspecificamount = ts203Totalhospitalspecificamount;
    }

    public PaymentDetail withTs203Totalhospitalspecificamount(String ts203Totalhospitalspecificamount) {
        this.ts203Totalhospitalspecificamount = ts203Totalhospitalspecificamount;
        return this;
    }

    @JsonProperty("ts204_totaldisproportionateshareamount")
    public String getTs204Totaldisproportionateshareamount() {
        return ts204Totaldisproportionateshareamount;
    }

    @JsonProperty("ts204_totaldisproportionateshareamount")
    public void setTs204Totaldisproportionateshareamount(String ts204Totaldisproportionateshareamount) {
        this.ts204Totaldisproportionateshareamount = ts204Totaldisproportionateshareamount;
    }

    public PaymentDetail withTs204Totaldisproportionateshareamount(String ts204Totaldisproportionateshareamount) {
        this.ts204Totaldisproportionateshareamount = ts204Totaldisproportionateshareamount;
        return this;
    }

    @JsonProperty("ts205_totalcapitalamount")
    public String getTs205Totalcapitalamount() {
        return ts205Totalcapitalamount;
    }

    @JsonProperty("ts205_totalcapitalamount")
    public void setTs205Totalcapitalamount(String ts205Totalcapitalamount) {
        this.ts205Totalcapitalamount = ts205Totalcapitalamount;
    }

    public PaymentDetail withTs205Totalcapitalamount(String ts205Totalcapitalamount) {
        this.ts205Totalcapitalamount = ts205Totalcapitalamount;
        return this;
    }

    @JsonProperty("ts206_totalindirectmedicaleducationamount")
    public String getTs206Totalindirectmedicaleducationamount() {
        return ts206Totalindirectmedicaleducationamount;
    }

    @JsonProperty("ts206_totalindirectmedicaleducationamount")
    public void setTs206Totalindirectmedicaleducationamount(String ts206Totalindirectmedicaleducationamount) {
        this.ts206Totalindirectmedicaleducationamount = ts206Totalindirectmedicaleducationamount;
    }

    public PaymentDetail withTs206Totalindirectmedicaleducationamount(String ts206Totalindirectmedicaleducationamount) {
        this.ts206Totalindirectmedicaleducationamount = ts206Totalindirectmedicaleducationamount;
        return this;
    }

    @JsonProperty("ts207_totaloutlierdaycount")
    public String getTs207Totaloutlierdaycount() {
        return ts207Totaloutlierdaycount;
    }

    @JsonProperty("ts207_totaloutlierdaycount")
    public void setTs207Totaloutlierdaycount(String ts207Totaloutlierdaycount) {
        this.ts207Totaloutlierdaycount = ts207Totaloutlierdaycount;
    }

    public PaymentDetail withTs207Totaloutlierdaycount(String ts207Totaloutlierdaycount) {
        this.ts207Totaloutlierdaycount = ts207Totaloutlierdaycount;
        return this;
    }

    @JsonProperty("ts208_totaldayoutlieramount")
    public String getTs208Totaldayoutlieramount() {
        return ts208Totaldayoutlieramount;
    }

    @JsonProperty("ts208_totaldayoutlieramount")
    public void setTs208Totaldayoutlieramount(String ts208Totaldayoutlieramount) {
        this.ts208Totaldayoutlieramount = ts208Totaldayoutlieramount;
    }

    public PaymentDetail withTs208Totaldayoutlieramount(String ts208Totaldayoutlieramount) {
        this.ts208Totaldayoutlieramount = ts208Totaldayoutlieramount;
        return this;
    }

    @JsonProperty("ts209_totalcostoutlieramount")
    public String getTs209Totalcostoutlieramount() {
        return ts209Totalcostoutlieramount;
    }

    @JsonProperty("ts209_totalcostoutlieramount")
    public void setTs209Totalcostoutlieramount(String ts209Totalcostoutlieramount) {
        this.ts209Totalcostoutlieramount = ts209Totalcostoutlieramount;
    }

    public PaymentDetail withTs209Totalcostoutlieramount(String ts209Totalcostoutlieramount) {
        this.ts209Totalcostoutlieramount = ts209Totalcostoutlieramount;
        return this;
    }

    @JsonProperty("ts210_averagedrglengthofstay")
    public String getTs210Averagedrglengthofstay() {
        return ts210Averagedrglengthofstay;
    }

    @JsonProperty("ts210_averagedrglengthofstay")
    public void setTs210Averagedrglengthofstay(String ts210Averagedrglengthofstay) {
        this.ts210Averagedrglengthofstay = ts210Averagedrglengthofstay;
    }

    public PaymentDetail withTs210Averagedrglengthofstay(String ts210Averagedrglengthofstay) {
        this.ts210Averagedrglengthofstay = ts210Averagedrglengthofstay;
        return this;
    }

    @JsonProperty("ts211_totaldischargecount")
    public String getTs211Totaldischargecount() {
        return ts211Totaldischargecount;
    }

    @JsonProperty("ts211_totaldischargecount")
    public void setTs211Totaldischargecount(String ts211Totaldischargecount) {
        this.ts211Totaldischargecount = ts211Totaldischargecount;
    }

    public PaymentDetail withTs211Totaldischargecount(String ts211Totaldischargecount) {
        this.ts211Totaldischargecount = ts211Totaldischargecount;
        return this;
    }

    @JsonProperty("ts212_totalcostreportdaycount")
    public String getTs212Totalcostreportdaycount() {
        return ts212Totalcostreportdaycount;
    }

    @JsonProperty("ts212_totalcostreportdaycount")
    public void setTs212Totalcostreportdaycount(String ts212Totalcostreportdaycount) {
        this.ts212Totalcostreportdaycount = ts212Totalcostreportdaycount;
    }

    public PaymentDetail withTs212Totalcostreportdaycount(String ts212Totalcostreportdaycount) {
        this.ts212Totalcostreportdaycount = ts212Totalcostreportdaycount;
        return this;
    }

    @JsonProperty("ts213_totalcovereddaycount")
    public String getTs213Totalcovereddaycount() {
        return ts213Totalcovereddaycount;
    }

    @JsonProperty("ts213_totalcovereddaycount")
    public void setTs213Totalcovereddaycount(String ts213Totalcovereddaycount) {
        this.ts213Totalcovereddaycount = ts213Totalcovereddaycount;
    }

    public PaymentDetail withTs213Totalcovereddaycount(String ts213Totalcovereddaycount) {
        this.ts213Totalcovereddaycount = ts213Totalcovereddaycount;
        return this;
    }

    @JsonProperty("ts214_totalnoncovereddaycount")
    public String getTs214Totalnoncovereddaycount() {
        return ts214Totalnoncovereddaycount;
    }

    @JsonProperty("ts214_totalnoncovereddaycount")
    public void setTs214Totalnoncovereddaycount(String ts214Totalnoncovereddaycount) {
        this.ts214Totalnoncovereddaycount = ts214Totalnoncovereddaycount;
    }

    public PaymentDetail withTs214Totalnoncovereddaycount(String ts214Totalnoncovereddaycount) {
        this.ts214Totalnoncovereddaycount = ts214Totalnoncovereddaycount;
        return this;
    }

    @JsonProperty("ts215_totalmsppassthroughamount")
    public String getTs215Totalmsppassthroughamount() {
        return ts215Totalmsppassthroughamount;
    }

    @JsonProperty("ts215_totalmsppassthroughamount")
    public void setTs215Totalmsppassthroughamount(String ts215Totalmsppassthroughamount) {
        this.ts215Totalmsppassthroughamount = ts215Totalmsppassthroughamount;
    }

    public PaymentDetail withTs215Totalmsppassthroughamount(String ts215Totalmsppassthroughamount) {
        this.ts215Totalmsppassthroughamount = ts215Totalmsppassthroughamount;
        return this;
    }

    @JsonProperty("ts216_averagedrgweight")
    public String getTs216Averagedrgweight() {
        return ts216Averagedrgweight;
    }

    @JsonProperty("ts216_averagedrgweight")
    public void setTs216Averagedrgweight(String ts216Averagedrgweight) {
        this.ts216Averagedrgweight = ts216Averagedrgweight;
    }

    public PaymentDetail withTs216Averagedrgweight(String ts216Averagedrgweight) {
        this.ts216Averagedrgweight = ts216Averagedrgweight;
        return this;
    }

    @JsonProperty("ts217_totalppscapitalfspdrgamount")
    public String getTs217Totalppscapitalfspdrgamount() {
        return ts217Totalppscapitalfspdrgamount;
    }

    @JsonProperty("ts217_totalppscapitalfspdrgamount")
    public void setTs217Totalppscapitalfspdrgamount(String ts217Totalppscapitalfspdrgamount) {
        this.ts217Totalppscapitalfspdrgamount = ts217Totalppscapitalfspdrgamount;
    }

    public PaymentDetail withTs217Totalppscapitalfspdrgamount(String ts217Totalppscapitalfspdrgamount) {
        this.ts217Totalppscapitalfspdrgamount = ts217Totalppscapitalfspdrgamount;
        return this;
    }

    @JsonProperty("ts218_totalppscapitalhspdrgamount")
    public String getTs218Totalppscapitalhspdrgamount() {
        return ts218Totalppscapitalhspdrgamount;
    }

    @JsonProperty("ts218_totalppscapitalhspdrgamount")
    public void setTs218Totalppscapitalhspdrgamount(String ts218Totalppscapitalhspdrgamount) {
        this.ts218Totalppscapitalhspdrgamount = ts218Totalppscapitalhspdrgamount;
    }

    public PaymentDetail withTs218Totalppscapitalhspdrgamount(String ts218Totalppscapitalhspdrgamount) {
        this.ts218Totalppscapitalhspdrgamount = ts218Totalppscapitalhspdrgamount;
        return this;
    }

    @JsonProperty("ts219_totalppsdshdrgamount")
    public String getTs219Totalppsdshdrgamount() {
        return ts219Totalppsdshdrgamount;
    }

    @JsonProperty("ts219_totalppsdshdrgamount")
    public void setTs219Totalppsdshdrgamount(String ts219Totalppsdshdrgamount) {
        this.ts219Totalppsdshdrgamount = ts219Totalppsdshdrgamount;
    }

    public PaymentDetail withTs219Totalppsdshdrgamount(String ts219Totalppsdshdrgamount) {
        this.ts219Totalppsdshdrgamount = ts219Totalppsdshdrgamount;
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

    public PaymentDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payDetailId).append(payHeaderId).append(lx01Assignednumber).append(ts301Provideridentifier).append(ts302Providerfacilitytypecode).append(ts303Fiscalperioddate).append(ts304Totalclaimcount).append(ts305Totalclaimchargeamount).append(ts313Totalmsppayeramount).append(ts315Totalnonlabchargeamount).append(ts317Totalhcpcsreportedchargeamount).append(ts318Totalhcpcspayableamount).append(ts320Totalprofessionalcomponentamount).append(ts321Totalmsppatientliabilitymetamount).append(ts322Totalpatientreimbursementamount).append(ts323Totalpipclaimcount).append(ts324Totalpipadjustmentamount).append(ts201Totaldrgamount).append(ts202Totalfederalspecificamount).append(ts203Totalhospitalspecificamount).append(ts204Totaldisproportionateshareamount).append(ts205Totalcapitalamount).append(ts206Totalindirectmedicaleducationamount).append(ts207Totaloutlierdaycount).append(ts208Totaldayoutlieramount).append(ts209Totalcostoutlieramount).append(ts210Averagedrglengthofstay).append(ts211Totaldischargecount).append(ts212Totalcostreportdaycount).append(ts213Totalcovereddaycount).append(ts214Totalnoncovereddaycount).append(ts215Totalmsppassthroughamount).append(ts216Averagedrgweight).append(ts217Totalppscapitalfspdrgamount).append(ts218Totalppscapitalhspdrgamount).append(ts219Totalppsdshdrgamount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentDetail) == false) {
            return false;
        }
        PaymentDetail rhs = ((PaymentDetail) other);
        return new EqualsBuilder().append(payDetailId, rhs.payDetailId).append(payHeaderId, rhs.payHeaderId).append(lx01Assignednumber, rhs.lx01Assignednumber).append(ts301Provideridentifier, rhs.ts301Provideridentifier).append(ts302Providerfacilitytypecode, rhs.ts302Providerfacilitytypecode).append(ts303Fiscalperioddate, rhs.ts303Fiscalperioddate).append(ts304Totalclaimcount, rhs.ts304Totalclaimcount).append(ts305Totalclaimchargeamount, rhs.ts305Totalclaimchargeamount).append(ts313Totalmsppayeramount, rhs.ts313Totalmsppayeramount).append(ts315Totalnonlabchargeamount, rhs.ts315Totalnonlabchargeamount).append(ts317Totalhcpcsreportedchargeamount, rhs.ts317Totalhcpcsreportedchargeamount).append(ts318Totalhcpcspayableamount, rhs.ts318Totalhcpcspayableamount).append(ts320Totalprofessionalcomponentamount, rhs.ts320Totalprofessionalcomponentamount).append(ts321Totalmsppatientliabilitymetamount, rhs.ts321Totalmsppatientliabilitymetamount).append(ts322Totalpatientreimbursementamount, rhs.ts322Totalpatientreimbursementamount).append(ts323Totalpipclaimcount, rhs.ts323Totalpipclaimcount).append(ts324Totalpipadjustmentamount, rhs.ts324Totalpipadjustmentamount).append(ts201Totaldrgamount, rhs.ts201Totaldrgamount).append(ts202Totalfederalspecificamount, rhs.ts202Totalfederalspecificamount).append(ts203Totalhospitalspecificamount, rhs.ts203Totalhospitalspecificamount).append(ts204Totaldisproportionateshareamount, rhs.ts204Totaldisproportionateshareamount).append(ts205Totalcapitalamount, rhs.ts205Totalcapitalamount).append(ts206Totalindirectmedicaleducationamount, rhs.ts206Totalindirectmedicaleducationamount).append(ts207Totaloutlierdaycount, rhs.ts207Totaloutlierdaycount).append(ts208Totaldayoutlieramount, rhs.ts208Totaldayoutlieramount).append(ts209Totalcostoutlieramount, rhs.ts209Totalcostoutlieramount).append(ts210Averagedrglengthofstay, rhs.ts210Averagedrglengthofstay).append(ts211Totaldischargecount, rhs.ts211Totaldischargecount).append(ts212Totalcostreportdaycount, rhs.ts212Totalcostreportdaycount).append(ts213Totalcovereddaycount, rhs.ts213Totalcovereddaycount).append(ts214Totalnoncovereddaycount, rhs.ts214Totalnoncovereddaycount).append(ts215Totalmsppassthroughamount, rhs.ts215Totalmsppassthroughamount).append(ts216Averagedrgweight, rhs.ts216Averagedrgweight).append(ts217Totalppscapitalfspdrgamount, rhs.ts217Totalppscapitalfspdrgamount).append(ts218Totalppscapitalhspdrgamount, rhs.ts218Totalppscapitalhspdrgamount).append(ts219Totalppsdshdrgamount, rhs.ts219Totalppsdshdrgamount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

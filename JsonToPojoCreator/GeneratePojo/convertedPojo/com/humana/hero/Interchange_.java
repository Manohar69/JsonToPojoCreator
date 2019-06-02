
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
    "dbInterchangeId",
    "isa01_authorizationinfoqlfr",
    "isa02_authorizationinfo",
    "isa03_securityinfoqlfr",
    "isa04_securityinfo",
    "isa05_senderidqlfr",
    "isa06_senderid",
    "isa07_receiveridqlfr",
    "isa08_receiverid",
    "isa09_date",
    "isa10_time",
    "isa11_repetitionseparator",
    "isa12_controlversionnumber",
    "isa13_controlnumber",
    "isa14_acknowledgmentrequested",
    "isa15_usageindicator",
    "isa16_componentelementseparator",
    "iea01_noofincludedfuncgroups"
})
public class Interchange_ {

    @JsonProperty("dbInterchangeId")
    private Integer dbInterchangeId;
    @JsonProperty("isa01_authorizationinfoqlfr")
    private String isa01Authorizationinfoqlfr;
    @JsonProperty("isa02_authorizationinfo")
    private String isa02Authorizationinfo;
    @JsonProperty("isa03_securityinfoqlfr")
    private String isa03Securityinfoqlfr;
    @JsonProperty("isa04_securityinfo")
    private String isa04Securityinfo;
    @JsonProperty("isa05_senderidqlfr")
    private String isa05Senderidqlfr;
    @JsonProperty("isa06_senderid")
    private String isa06Senderid;
    @JsonProperty("isa07_receiveridqlfr")
    private String isa07Receiveridqlfr;
    @JsonProperty("isa08_receiverid")
    private String isa08Receiverid;
    @JsonProperty("isa09_date")
    private String isa09Date;
    @JsonProperty("isa10_time")
    private String isa10Time;
    @JsonProperty("isa11_repetitionseparator")
    private String isa11Repetitionseparator;
    @JsonProperty("isa12_controlversionnumber")
    private String isa12Controlversionnumber;
    @JsonProperty("isa13_controlnumber")
    private String isa13Controlnumber;
    @JsonProperty("isa14_acknowledgmentrequested")
    private String isa14Acknowledgmentrequested;
    @JsonProperty("isa15_usageindicator")
    private String isa15Usageindicator;
    @JsonProperty("isa16_componentelementseparator")
    private String isa16Componentelementseparator;
    @JsonProperty("iea01_noofincludedfuncgroups")
    private String iea01Noofincludedfuncgroups;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbInterchangeId")
    public Integer getDbInterchangeId() {
        return dbInterchangeId;
    }

    @JsonProperty("dbInterchangeId")
    public void setDbInterchangeId(Integer dbInterchangeId) {
        this.dbInterchangeId = dbInterchangeId;
    }

    public Interchange_ withDbInterchangeId(Integer dbInterchangeId) {
        this.dbInterchangeId = dbInterchangeId;
        return this;
    }

    @JsonProperty("isa01_authorizationinfoqlfr")
    public String getIsa01Authorizationinfoqlfr() {
        return isa01Authorizationinfoqlfr;
    }

    @JsonProperty("isa01_authorizationinfoqlfr")
    public void setIsa01Authorizationinfoqlfr(String isa01Authorizationinfoqlfr) {
        this.isa01Authorizationinfoqlfr = isa01Authorizationinfoqlfr;
    }

    public Interchange_ withIsa01Authorizationinfoqlfr(String isa01Authorizationinfoqlfr) {
        this.isa01Authorizationinfoqlfr = isa01Authorizationinfoqlfr;
        return this;
    }

    @JsonProperty("isa02_authorizationinfo")
    public String getIsa02Authorizationinfo() {
        return isa02Authorizationinfo;
    }

    @JsonProperty("isa02_authorizationinfo")
    public void setIsa02Authorizationinfo(String isa02Authorizationinfo) {
        this.isa02Authorizationinfo = isa02Authorizationinfo;
    }

    public Interchange_ withIsa02Authorizationinfo(String isa02Authorizationinfo) {
        this.isa02Authorizationinfo = isa02Authorizationinfo;
        return this;
    }

    @JsonProperty("isa03_securityinfoqlfr")
    public String getIsa03Securityinfoqlfr() {
        return isa03Securityinfoqlfr;
    }

    @JsonProperty("isa03_securityinfoqlfr")
    public void setIsa03Securityinfoqlfr(String isa03Securityinfoqlfr) {
        this.isa03Securityinfoqlfr = isa03Securityinfoqlfr;
    }

    public Interchange_ withIsa03Securityinfoqlfr(String isa03Securityinfoqlfr) {
        this.isa03Securityinfoqlfr = isa03Securityinfoqlfr;
        return this;
    }

    @JsonProperty("isa04_securityinfo")
    public String getIsa04Securityinfo() {
        return isa04Securityinfo;
    }

    @JsonProperty("isa04_securityinfo")
    public void setIsa04Securityinfo(String isa04Securityinfo) {
        this.isa04Securityinfo = isa04Securityinfo;
    }

    public Interchange_ withIsa04Securityinfo(String isa04Securityinfo) {
        this.isa04Securityinfo = isa04Securityinfo;
        return this;
    }

    @JsonProperty("isa05_senderidqlfr")
    public String getIsa05Senderidqlfr() {
        return isa05Senderidqlfr;
    }

    @JsonProperty("isa05_senderidqlfr")
    public void setIsa05Senderidqlfr(String isa05Senderidqlfr) {
        this.isa05Senderidqlfr = isa05Senderidqlfr;
    }

    public Interchange_ withIsa05Senderidqlfr(String isa05Senderidqlfr) {
        this.isa05Senderidqlfr = isa05Senderidqlfr;
        return this;
    }

    @JsonProperty("isa06_senderid")
    public String getIsa06Senderid() {
        return isa06Senderid;
    }

    @JsonProperty("isa06_senderid")
    public void setIsa06Senderid(String isa06Senderid) {
        this.isa06Senderid = isa06Senderid;
    }

    public Interchange_ withIsa06Senderid(String isa06Senderid) {
        this.isa06Senderid = isa06Senderid;
        return this;
    }

    @JsonProperty("isa07_receiveridqlfr")
    public String getIsa07Receiveridqlfr() {
        return isa07Receiveridqlfr;
    }

    @JsonProperty("isa07_receiveridqlfr")
    public void setIsa07Receiveridqlfr(String isa07Receiveridqlfr) {
        this.isa07Receiveridqlfr = isa07Receiveridqlfr;
    }

    public Interchange_ withIsa07Receiveridqlfr(String isa07Receiveridqlfr) {
        this.isa07Receiveridqlfr = isa07Receiveridqlfr;
        return this;
    }

    @JsonProperty("isa08_receiverid")
    public String getIsa08Receiverid() {
        return isa08Receiverid;
    }

    @JsonProperty("isa08_receiverid")
    public void setIsa08Receiverid(String isa08Receiverid) {
        this.isa08Receiverid = isa08Receiverid;
    }

    public Interchange_ withIsa08Receiverid(String isa08Receiverid) {
        this.isa08Receiverid = isa08Receiverid;
        return this;
    }

    @JsonProperty("isa09_date")
    public String getIsa09Date() {
        return isa09Date;
    }

    @JsonProperty("isa09_date")
    public void setIsa09Date(String isa09Date) {
        this.isa09Date = isa09Date;
    }

    public Interchange_ withIsa09Date(String isa09Date) {
        this.isa09Date = isa09Date;
        return this;
    }

    @JsonProperty("isa10_time")
    public String getIsa10Time() {
        return isa10Time;
    }

    @JsonProperty("isa10_time")
    public void setIsa10Time(String isa10Time) {
        this.isa10Time = isa10Time;
    }

    public Interchange_ withIsa10Time(String isa10Time) {
        this.isa10Time = isa10Time;
        return this;
    }

    @JsonProperty("isa11_repetitionseparator")
    public String getIsa11Repetitionseparator() {
        return isa11Repetitionseparator;
    }

    @JsonProperty("isa11_repetitionseparator")
    public void setIsa11Repetitionseparator(String isa11Repetitionseparator) {
        this.isa11Repetitionseparator = isa11Repetitionseparator;
    }

    public Interchange_ withIsa11Repetitionseparator(String isa11Repetitionseparator) {
        this.isa11Repetitionseparator = isa11Repetitionseparator;
        return this;
    }

    @JsonProperty("isa12_controlversionnumber")
    public String getIsa12Controlversionnumber() {
        return isa12Controlversionnumber;
    }

    @JsonProperty("isa12_controlversionnumber")
    public void setIsa12Controlversionnumber(String isa12Controlversionnumber) {
        this.isa12Controlversionnumber = isa12Controlversionnumber;
    }

    public Interchange_ withIsa12Controlversionnumber(String isa12Controlversionnumber) {
        this.isa12Controlversionnumber = isa12Controlversionnumber;
        return this;
    }

    @JsonProperty("isa13_controlnumber")
    public String getIsa13Controlnumber() {
        return isa13Controlnumber;
    }

    @JsonProperty("isa13_controlnumber")
    public void setIsa13Controlnumber(String isa13Controlnumber) {
        this.isa13Controlnumber = isa13Controlnumber;
    }

    public Interchange_ withIsa13Controlnumber(String isa13Controlnumber) {
        this.isa13Controlnumber = isa13Controlnumber;
        return this;
    }

    @JsonProperty("isa14_acknowledgmentrequested")
    public String getIsa14Acknowledgmentrequested() {
        return isa14Acknowledgmentrequested;
    }

    @JsonProperty("isa14_acknowledgmentrequested")
    public void setIsa14Acknowledgmentrequested(String isa14Acknowledgmentrequested) {
        this.isa14Acknowledgmentrequested = isa14Acknowledgmentrequested;
    }

    public Interchange_ withIsa14Acknowledgmentrequested(String isa14Acknowledgmentrequested) {
        this.isa14Acknowledgmentrequested = isa14Acknowledgmentrequested;
        return this;
    }

    @JsonProperty("isa15_usageindicator")
    public String getIsa15Usageindicator() {
        return isa15Usageindicator;
    }

    @JsonProperty("isa15_usageindicator")
    public void setIsa15Usageindicator(String isa15Usageindicator) {
        this.isa15Usageindicator = isa15Usageindicator;
    }

    public Interchange_ withIsa15Usageindicator(String isa15Usageindicator) {
        this.isa15Usageindicator = isa15Usageindicator;
        return this;
    }

    @JsonProperty("isa16_componentelementseparator")
    public String getIsa16Componentelementseparator() {
        return isa16Componentelementseparator;
    }

    @JsonProperty("isa16_componentelementseparator")
    public void setIsa16Componentelementseparator(String isa16Componentelementseparator) {
        this.isa16Componentelementseparator = isa16Componentelementseparator;
    }

    public Interchange_ withIsa16Componentelementseparator(String isa16Componentelementseparator) {
        this.isa16Componentelementseparator = isa16Componentelementseparator;
        return this;
    }

    @JsonProperty("iea01_noofincludedfuncgroups")
    public String getIea01Noofincludedfuncgroups() {
        return iea01Noofincludedfuncgroups;
    }

    @JsonProperty("iea01_noofincludedfuncgroups")
    public void setIea01Noofincludedfuncgroups(String iea01Noofincludedfuncgroups) {
        this.iea01Noofincludedfuncgroups = iea01Noofincludedfuncgroups;
    }

    public Interchange_ withIea01Noofincludedfuncgroups(String iea01Noofincludedfuncgroups) {
        this.iea01Noofincludedfuncgroups = iea01Noofincludedfuncgroups;
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

    public Interchange_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbInterchangeId).append(isa01Authorizationinfoqlfr).append(isa02Authorizationinfo).append(isa03Securityinfoqlfr).append(isa04Securityinfo).append(isa05Senderidqlfr).append(isa06Senderid).append(isa07Receiveridqlfr).append(isa08Receiverid).append(isa09Date).append(isa10Time).append(isa11Repetitionseparator).append(isa12Controlversionnumber).append(isa13Controlnumber).append(isa14Acknowledgmentrequested).append(isa15Usageindicator).append(isa16Componentelementseparator).append(iea01Noofincludedfuncgroups).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interchange_) == false) {
            return false;
        }
        Interchange_ rhs = ((Interchange_) other);
        return new EqualsBuilder().append(dbInterchangeId, rhs.dbInterchangeId).append(isa01Authorizationinfoqlfr, rhs.isa01Authorizationinfoqlfr).append(isa02Authorizationinfo, rhs.isa02Authorizationinfo).append(isa03Securityinfoqlfr, rhs.isa03Securityinfoqlfr).append(isa04Securityinfo, rhs.isa04Securityinfo).append(isa05Senderidqlfr, rhs.isa05Senderidqlfr).append(isa06Senderid, rhs.isa06Senderid).append(isa07Receiveridqlfr, rhs.isa07Receiveridqlfr).append(isa08Receiverid, rhs.isa08Receiverid).append(isa09Date, rhs.isa09Date).append(isa10Time, rhs.isa10Time).append(isa11Repetitionseparator, rhs.isa11Repetitionseparator).append(isa12Controlversionnumber, rhs.isa12Controlversionnumber).append(isa13Controlnumber, rhs.isa13Controlnumber).append(isa14Acknowledgmentrequested, rhs.isa14Acknowledgmentrequested).append(isa15Usageindicator, rhs.isa15Usageindicator).append(isa16Componentelementseparator, rhs.isa16Componentelementseparator).append(iea01Noofincludedfuncgroups, rhs.iea01Noofincludedfuncgroups).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

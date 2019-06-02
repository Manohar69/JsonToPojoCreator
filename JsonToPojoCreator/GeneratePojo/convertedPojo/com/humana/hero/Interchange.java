
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
    "isa01_authorizationInfoQlfr",
    "isa02_authorizationInfo",
    "isa03_securityInfoQlfr",
    "isa04_securityInfo",
    "isa05_senderIdQlfr",
    "isa06_senderId",
    "isa07_receiverIdQlfr",
    "isa08_receiverId",
    "isa09_interchangeDate",
    "isa10_interchangeTime",
    "isa11_repetitionSeparator",
    "isa12_controlVersionNo",
    "isa13_controlNo",
    "isa14_acknowledgmentRequested",
    "isa15_usageIndicator",
    "isa16_componentElementSeparator",
    "iea01_noOfIncludedFunctionalGroups",
    "iea02_interchangeControlNo"
})
public class Interchange {

    @JsonProperty("dbInterchangeId")
    private Integer dbInterchangeId;
    @JsonProperty("isa01_authorizationInfoQlfr")
    private String isa01AuthorizationInfoQlfr;
    @JsonProperty("isa02_authorizationInfo")
    private String isa02AuthorizationInfo;
    @JsonProperty("isa03_securityInfoQlfr")
    private String isa03SecurityInfoQlfr;
    @JsonProperty("isa04_securityInfo")
    private String isa04SecurityInfo;
    @JsonProperty("isa05_senderIdQlfr")
    private String isa05SenderIdQlfr;
    @JsonProperty("isa06_senderId")
    private String isa06SenderId;
    @JsonProperty("isa07_receiverIdQlfr")
    private String isa07ReceiverIdQlfr;
    @JsonProperty("isa08_receiverId")
    private String isa08ReceiverId;
    @JsonProperty("isa09_interchangeDate")
    private String isa09InterchangeDate;
    @JsonProperty("isa10_interchangeTime")
    private String isa10InterchangeTime;
    @JsonProperty("isa11_repetitionSeparator")
    private String isa11RepetitionSeparator;
    @JsonProperty("isa12_controlVersionNo")
    private String isa12ControlVersionNo;
    @JsonProperty("isa13_controlNo")
    private String isa13ControlNo;
    @JsonProperty("isa14_acknowledgmentRequested")
    private String isa14AcknowledgmentRequested;
    @JsonProperty("isa15_usageIndicator")
    private String isa15UsageIndicator;
    @JsonProperty("isa16_componentElementSeparator")
    private String isa16ComponentElementSeparator;
    @JsonProperty("iea01_noOfIncludedFunctionalGroups")
    private String iea01NoOfIncludedFunctionalGroups;
    @JsonProperty("iea02_interchangeControlNo")
    private String iea02InterchangeControlNo;
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

    public Interchange withDbInterchangeId(Integer dbInterchangeId) {
        this.dbInterchangeId = dbInterchangeId;
        return this;
    }

    @JsonProperty("isa01_authorizationInfoQlfr")
    public String getIsa01AuthorizationInfoQlfr() {
        return isa01AuthorizationInfoQlfr;
    }

    @JsonProperty("isa01_authorizationInfoQlfr")
    public void setIsa01AuthorizationInfoQlfr(String isa01AuthorizationInfoQlfr) {
        this.isa01AuthorizationInfoQlfr = isa01AuthorizationInfoQlfr;
    }

    public Interchange withIsa01AuthorizationInfoQlfr(String isa01AuthorizationInfoQlfr) {
        this.isa01AuthorizationInfoQlfr = isa01AuthorizationInfoQlfr;
        return this;
    }

    @JsonProperty("isa02_authorizationInfo")
    public String getIsa02AuthorizationInfo() {
        return isa02AuthorizationInfo;
    }

    @JsonProperty("isa02_authorizationInfo")
    public void setIsa02AuthorizationInfo(String isa02AuthorizationInfo) {
        this.isa02AuthorizationInfo = isa02AuthorizationInfo;
    }

    public Interchange withIsa02AuthorizationInfo(String isa02AuthorizationInfo) {
        this.isa02AuthorizationInfo = isa02AuthorizationInfo;
        return this;
    }

    @JsonProperty("isa03_securityInfoQlfr")
    public String getIsa03SecurityInfoQlfr() {
        return isa03SecurityInfoQlfr;
    }

    @JsonProperty("isa03_securityInfoQlfr")
    public void setIsa03SecurityInfoQlfr(String isa03SecurityInfoQlfr) {
        this.isa03SecurityInfoQlfr = isa03SecurityInfoQlfr;
    }

    public Interchange withIsa03SecurityInfoQlfr(String isa03SecurityInfoQlfr) {
        this.isa03SecurityInfoQlfr = isa03SecurityInfoQlfr;
        return this;
    }

    @JsonProperty("isa04_securityInfo")
    public String getIsa04SecurityInfo() {
        return isa04SecurityInfo;
    }

    @JsonProperty("isa04_securityInfo")
    public void setIsa04SecurityInfo(String isa04SecurityInfo) {
        this.isa04SecurityInfo = isa04SecurityInfo;
    }

    public Interchange withIsa04SecurityInfo(String isa04SecurityInfo) {
        this.isa04SecurityInfo = isa04SecurityInfo;
        return this;
    }

    @JsonProperty("isa05_senderIdQlfr")
    public String getIsa05SenderIdQlfr() {
        return isa05SenderIdQlfr;
    }

    @JsonProperty("isa05_senderIdQlfr")
    public void setIsa05SenderIdQlfr(String isa05SenderIdQlfr) {
        this.isa05SenderIdQlfr = isa05SenderIdQlfr;
    }

    public Interchange withIsa05SenderIdQlfr(String isa05SenderIdQlfr) {
        this.isa05SenderIdQlfr = isa05SenderIdQlfr;
        return this;
    }

    @JsonProperty("isa06_senderId")
    public String getIsa06SenderId() {
        return isa06SenderId;
    }

    @JsonProperty("isa06_senderId")
    public void setIsa06SenderId(String isa06SenderId) {
        this.isa06SenderId = isa06SenderId;
    }

    public Interchange withIsa06SenderId(String isa06SenderId) {
        this.isa06SenderId = isa06SenderId;
        return this;
    }

    @JsonProperty("isa07_receiverIdQlfr")
    public String getIsa07ReceiverIdQlfr() {
        return isa07ReceiverIdQlfr;
    }

    @JsonProperty("isa07_receiverIdQlfr")
    public void setIsa07ReceiverIdQlfr(String isa07ReceiverIdQlfr) {
        this.isa07ReceiverIdQlfr = isa07ReceiverIdQlfr;
    }

    public Interchange withIsa07ReceiverIdQlfr(String isa07ReceiverIdQlfr) {
        this.isa07ReceiverIdQlfr = isa07ReceiverIdQlfr;
        return this;
    }

    @JsonProperty("isa08_receiverId")
    public String getIsa08ReceiverId() {
        return isa08ReceiverId;
    }

    @JsonProperty("isa08_receiverId")
    public void setIsa08ReceiverId(String isa08ReceiverId) {
        this.isa08ReceiverId = isa08ReceiverId;
    }

    public Interchange withIsa08ReceiverId(String isa08ReceiverId) {
        this.isa08ReceiverId = isa08ReceiverId;
        return this;
    }

    @JsonProperty("isa09_interchangeDate")
    public String getIsa09InterchangeDate() {
        return isa09InterchangeDate;
    }

    @JsonProperty("isa09_interchangeDate")
    public void setIsa09InterchangeDate(String isa09InterchangeDate) {
        this.isa09InterchangeDate = isa09InterchangeDate;
    }

    public Interchange withIsa09InterchangeDate(String isa09InterchangeDate) {
        this.isa09InterchangeDate = isa09InterchangeDate;
        return this;
    }

    @JsonProperty("isa10_interchangeTime")
    public String getIsa10InterchangeTime() {
        return isa10InterchangeTime;
    }

    @JsonProperty("isa10_interchangeTime")
    public void setIsa10InterchangeTime(String isa10InterchangeTime) {
        this.isa10InterchangeTime = isa10InterchangeTime;
    }

    public Interchange withIsa10InterchangeTime(String isa10InterchangeTime) {
        this.isa10InterchangeTime = isa10InterchangeTime;
        return this;
    }

    @JsonProperty("isa11_repetitionSeparator")
    public String getIsa11RepetitionSeparator() {
        return isa11RepetitionSeparator;
    }

    @JsonProperty("isa11_repetitionSeparator")
    public void setIsa11RepetitionSeparator(String isa11RepetitionSeparator) {
        this.isa11RepetitionSeparator = isa11RepetitionSeparator;
    }

    public Interchange withIsa11RepetitionSeparator(String isa11RepetitionSeparator) {
        this.isa11RepetitionSeparator = isa11RepetitionSeparator;
        return this;
    }

    @JsonProperty("isa12_controlVersionNo")
    public String getIsa12ControlVersionNo() {
        return isa12ControlVersionNo;
    }

    @JsonProperty("isa12_controlVersionNo")
    public void setIsa12ControlVersionNo(String isa12ControlVersionNo) {
        this.isa12ControlVersionNo = isa12ControlVersionNo;
    }

    public Interchange withIsa12ControlVersionNo(String isa12ControlVersionNo) {
        this.isa12ControlVersionNo = isa12ControlVersionNo;
        return this;
    }

    @JsonProperty("isa13_controlNo")
    public String getIsa13ControlNo() {
        return isa13ControlNo;
    }

    @JsonProperty("isa13_controlNo")
    public void setIsa13ControlNo(String isa13ControlNo) {
        this.isa13ControlNo = isa13ControlNo;
    }

    public Interchange withIsa13ControlNo(String isa13ControlNo) {
        this.isa13ControlNo = isa13ControlNo;
        return this;
    }

    @JsonProperty("isa14_acknowledgmentRequested")
    public String getIsa14AcknowledgmentRequested() {
        return isa14AcknowledgmentRequested;
    }

    @JsonProperty("isa14_acknowledgmentRequested")
    public void setIsa14AcknowledgmentRequested(String isa14AcknowledgmentRequested) {
        this.isa14AcknowledgmentRequested = isa14AcknowledgmentRequested;
    }

    public Interchange withIsa14AcknowledgmentRequested(String isa14AcknowledgmentRequested) {
        this.isa14AcknowledgmentRequested = isa14AcknowledgmentRequested;
        return this;
    }

    @JsonProperty("isa15_usageIndicator")
    public String getIsa15UsageIndicator() {
        return isa15UsageIndicator;
    }

    @JsonProperty("isa15_usageIndicator")
    public void setIsa15UsageIndicator(String isa15UsageIndicator) {
        this.isa15UsageIndicator = isa15UsageIndicator;
    }

    public Interchange withIsa15UsageIndicator(String isa15UsageIndicator) {
        this.isa15UsageIndicator = isa15UsageIndicator;
        return this;
    }

    @JsonProperty("isa16_componentElementSeparator")
    public String getIsa16ComponentElementSeparator() {
        return isa16ComponentElementSeparator;
    }

    @JsonProperty("isa16_componentElementSeparator")
    public void setIsa16ComponentElementSeparator(String isa16ComponentElementSeparator) {
        this.isa16ComponentElementSeparator = isa16ComponentElementSeparator;
    }

    public Interchange withIsa16ComponentElementSeparator(String isa16ComponentElementSeparator) {
        this.isa16ComponentElementSeparator = isa16ComponentElementSeparator;
        return this;
    }

    @JsonProperty("iea01_noOfIncludedFunctionalGroups")
    public String getIea01NoOfIncludedFunctionalGroups() {
        return iea01NoOfIncludedFunctionalGroups;
    }

    @JsonProperty("iea01_noOfIncludedFunctionalGroups")
    public void setIea01NoOfIncludedFunctionalGroups(String iea01NoOfIncludedFunctionalGroups) {
        this.iea01NoOfIncludedFunctionalGroups = iea01NoOfIncludedFunctionalGroups;
    }

    public Interchange withIea01NoOfIncludedFunctionalGroups(String iea01NoOfIncludedFunctionalGroups) {
        this.iea01NoOfIncludedFunctionalGroups = iea01NoOfIncludedFunctionalGroups;
        return this;
    }

    @JsonProperty("iea02_interchangeControlNo")
    public String getIea02InterchangeControlNo() {
        return iea02InterchangeControlNo;
    }

    @JsonProperty("iea02_interchangeControlNo")
    public void setIea02InterchangeControlNo(String iea02InterchangeControlNo) {
        this.iea02InterchangeControlNo = iea02InterchangeControlNo;
    }

    public Interchange withIea02InterchangeControlNo(String iea02InterchangeControlNo) {
        this.iea02InterchangeControlNo = iea02InterchangeControlNo;
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

    public Interchange withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbInterchangeId).append(isa01AuthorizationInfoQlfr).append(isa02AuthorizationInfo).append(isa03SecurityInfoQlfr).append(isa04SecurityInfo).append(isa05SenderIdQlfr).append(isa06SenderId).append(isa07ReceiverIdQlfr).append(isa08ReceiverId).append(isa09InterchangeDate).append(isa10InterchangeTime).append(isa11RepetitionSeparator).append(isa12ControlVersionNo).append(isa13ControlNo).append(isa14AcknowledgmentRequested).append(isa15UsageIndicator).append(isa16ComponentElementSeparator).append(iea01NoOfIncludedFunctionalGroups).append(iea02InterchangeControlNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interchange) == false) {
            return false;
        }
        Interchange rhs = ((Interchange) other);
        return new EqualsBuilder().append(dbInterchangeId, rhs.dbInterchangeId).append(isa01AuthorizationInfoQlfr, rhs.isa01AuthorizationInfoQlfr).append(isa02AuthorizationInfo, rhs.isa02AuthorizationInfo).append(isa03SecurityInfoQlfr, rhs.isa03SecurityInfoQlfr).append(isa04SecurityInfo, rhs.isa04SecurityInfo).append(isa05SenderIdQlfr, rhs.isa05SenderIdQlfr).append(isa06SenderId, rhs.isa06SenderId).append(isa07ReceiverIdQlfr, rhs.isa07ReceiverIdQlfr).append(isa08ReceiverId, rhs.isa08ReceiverId).append(isa09InterchangeDate, rhs.isa09InterchangeDate).append(isa10InterchangeTime, rhs.isa10InterchangeTime).append(isa11RepetitionSeparator, rhs.isa11RepetitionSeparator).append(isa12ControlVersionNo, rhs.isa12ControlVersionNo).append(isa13ControlNo, rhs.isa13ControlNo).append(isa14AcknowledgmentRequested, rhs.isa14AcknowledgmentRequested).append(isa15UsageIndicator, rhs.isa15UsageIndicator).append(isa16ComponentElementSeparator, rhs.isa16ComponentElementSeparator).append(iea01NoOfIncludedFunctionalGroups, rhs.iea01NoOfIncludedFunctionalGroups).append(iea02InterchangeControlNo, rhs.iea02InterchangeControlNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

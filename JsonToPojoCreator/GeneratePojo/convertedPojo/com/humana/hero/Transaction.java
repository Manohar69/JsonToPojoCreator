
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
    "encounterId",
    "claimId",
    "intakeId",
    "submitterReceiverId",
    "partnerId",
    "claimType",
    "overrideIndicator",
    "transactionSet",
    "submitterName",
    "receiverName",
    "transactionSetTrailer"
})
public class Transaction {

    @JsonProperty("encounterId")
    private String encounterId;
    @JsonProperty("claimId")
    private Integer claimId;
    @JsonProperty("intakeId")
    private Integer intakeId;
    @JsonProperty("submitterReceiverId")
    private String submitterReceiverId;
    @JsonProperty("partnerId")
    private String partnerId;
    @JsonProperty("claimType")
    private String claimType;
    @JsonProperty("overrideIndicator")
    private String overrideIndicator;
    @JsonProperty("transactionSet")
    private TransactionSet transactionSet;
    @JsonProperty("submitterName")
    private SubmitterName submitterName;
    @JsonProperty("receiverName")
    private ReceiverName receiverName;
    @JsonProperty("transactionSetTrailer")
    private TransactionSetTrailer transactionSetTrailer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("encounterId")
    public String getEncounterId() {
        return encounterId;
    }

    @JsonProperty("encounterId")
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public Transaction withEncounterId(String encounterId) {
        this.encounterId = encounterId;
        return this;
    }

    @JsonProperty("claimId")
    public Integer getClaimId() {
        return claimId;
    }

    @JsonProperty("claimId")
    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public Transaction withClaimId(Integer claimId) {
        this.claimId = claimId;
        return this;
    }

    @JsonProperty("intakeId")
    public Integer getIntakeId() {
        return intakeId;
    }

    @JsonProperty("intakeId")
    public void setIntakeId(Integer intakeId) {
        this.intakeId = intakeId;
    }

    public Transaction withIntakeId(Integer intakeId) {
        this.intakeId = intakeId;
        return this;
    }

    @JsonProperty("submitterReceiverId")
    public String getSubmitterReceiverId() {
        return submitterReceiverId;
    }

    @JsonProperty("submitterReceiverId")
    public void setSubmitterReceiverId(String submitterReceiverId) {
        this.submitterReceiverId = submitterReceiverId;
    }

    public Transaction withSubmitterReceiverId(String submitterReceiverId) {
        this.submitterReceiverId = submitterReceiverId;
        return this;
    }

    @JsonProperty("partnerId")
    public String getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partnerId")
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Transaction withPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    @JsonProperty("claimType")
    public String getClaimType() {
        return claimType;
    }

    @JsonProperty("claimType")
    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Transaction withClaimType(String claimType) {
        this.claimType = claimType;
        return this;
    }

    @JsonProperty("overrideIndicator")
    public String getOverrideIndicator() {
        return overrideIndicator;
    }

    @JsonProperty("overrideIndicator")
    public void setOverrideIndicator(String overrideIndicator) {
        this.overrideIndicator = overrideIndicator;
    }

    public Transaction withOverrideIndicator(String overrideIndicator) {
        this.overrideIndicator = overrideIndicator;
        return this;
    }

    @JsonProperty("transactionSet")
    public TransactionSet getTransactionSet() {
        return transactionSet;
    }

    @JsonProperty("transactionSet")
    public void setTransactionSet(TransactionSet transactionSet) {
        this.transactionSet = transactionSet;
    }

    public Transaction withTransactionSet(TransactionSet transactionSet) {
        this.transactionSet = transactionSet;
        return this;
    }

    @JsonProperty("submitterName")
    public SubmitterName getSubmitterName() {
        return submitterName;
    }

    @JsonProperty("submitterName")
    public void setSubmitterName(SubmitterName submitterName) {
        this.submitterName = submitterName;
    }

    public Transaction withSubmitterName(SubmitterName submitterName) {
        this.submitterName = submitterName;
        return this;
    }

    @JsonProperty("receiverName")
    public ReceiverName getReceiverName() {
        return receiverName;
    }

    @JsonProperty("receiverName")
    public void setReceiverName(ReceiverName receiverName) {
        this.receiverName = receiverName;
    }

    public Transaction withReceiverName(ReceiverName receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    @JsonProperty("transactionSetTrailer")
    public TransactionSetTrailer getTransactionSetTrailer() {
        return transactionSetTrailer;
    }

    @JsonProperty("transactionSetTrailer")
    public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
        this.transactionSetTrailer = transactionSetTrailer;
    }

    public Transaction withTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
        this.transactionSetTrailer = transactionSetTrailer;
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

    public Transaction withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encounterId).append(claimId).append(intakeId).append(submitterReceiverId).append(partnerId).append(claimType).append(overrideIndicator).append(transactionSet).append(submitterName).append(receiverName).append(transactionSetTrailer).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return new EqualsBuilder().append(encounterId, rhs.encounterId).append(claimId, rhs.claimId).append(intakeId, rhs.intakeId).append(submitterReceiverId, rhs.submitterReceiverId).append(partnerId, rhs.partnerId).append(claimType, rhs.claimType).append(overrideIndicator, rhs.overrideIndicator).append(transactionSet, rhs.transactionSet).append(submitterName, rhs.submitterName).append(receiverName, rhs.receiverName).append(transactionSetTrailer, rhs.transactionSetTrailer).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

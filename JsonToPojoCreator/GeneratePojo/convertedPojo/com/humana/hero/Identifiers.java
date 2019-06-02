
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
    "claimECNId",
    "encounterId",
    "intakeId",
    "claimId",
    "intakeDate",
    "relatedEncounterId",
    "partnerId",
    "claimType",
    "overrideIndicator",
    "submitterReceiverId",
    "contractId"
})
public class Identifiers {

    @JsonProperty("claimECNId")
    private String claimECNId;
    @JsonProperty("encounterId")
    private String encounterId;
    @JsonProperty("intakeId")
    private String intakeId;
    @JsonProperty("claimId")
    private String claimId;
    @JsonProperty("intakeDate")
    private String intakeDate;
    @JsonProperty("relatedEncounterId")
    private String relatedEncounterId;
    @JsonProperty("partnerId")
    private String partnerId;
    @JsonProperty("claimType")
    private String claimType;
    @JsonProperty("overrideIndicator")
    private String overrideIndicator;
    @JsonProperty("submitterReceiverId")
    private String submitterReceiverId;
    @JsonProperty("contractId")
    private String contractId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("claimECNId")
    public String getClaimECNId() {
        return claimECNId;
    }

    @JsonProperty("claimECNId")
    public void setClaimECNId(String claimECNId) {
        this.claimECNId = claimECNId;
    }

    public Identifiers withClaimECNId(String claimECNId) {
        this.claimECNId = claimECNId;
        return this;
    }

    @JsonProperty("encounterId")
    public String getEncounterId() {
        return encounterId;
    }

    @JsonProperty("encounterId")
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public Identifiers withEncounterId(String encounterId) {
        this.encounterId = encounterId;
        return this;
    }

    @JsonProperty("intakeId")
    public String getIntakeId() {
        return intakeId;
    }

    @JsonProperty("intakeId")
    public void setIntakeId(String intakeId) {
        this.intakeId = intakeId;
    }

    public Identifiers withIntakeId(String intakeId) {
        this.intakeId = intakeId;
        return this;
    }

    @JsonProperty("claimId")
    public String getClaimId() {
        return claimId;
    }

    @JsonProperty("claimId")
    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public Identifiers withClaimId(String claimId) {
        this.claimId = claimId;
        return this;
    }

    @JsonProperty("intakeDate")
    public String getIntakeDate() {
        return intakeDate;
    }

    @JsonProperty("intakeDate")
    public void setIntakeDate(String intakeDate) {
        this.intakeDate = intakeDate;
    }

    public Identifiers withIntakeDate(String intakeDate) {
        this.intakeDate = intakeDate;
        return this;
    }

    @JsonProperty("relatedEncounterId")
    public String getRelatedEncounterId() {
        return relatedEncounterId;
    }

    @JsonProperty("relatedEncounterId")
    public void setRelatedEncounterId(String relatedEncounterId) {
        this.relatedEncounterId = relatedEncounterId;
    }

    public Identifiers withRelatedEncounterId(String relatedEncounterId) {
        this.relatedEncounterId = relatedEncounterId;
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

    public Identifiers withPartnerId(String partnerId) {
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

    public Identifiers withClaimType(String claimType) {
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

    public Identifiers withOverrideIndicator(String overrideIndicator) {
        this.overrideIndicator = overrideIndicator;
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

    public Identifiers withSubmitterReceiverId(String submitterReceiverId) {
        this.submitterReceiverId = submitterReceiverId;
        return this;
    }

    @JsonProperty("contractId")
    public String getContractId() {
        return contractId;
    }

    @JsonProperty("contractId")
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Identifiers withContractId(String contractId) {
        this.contractId = contractId;
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

    public Identifiers withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(claimECNId).append(encounterId).append(intakeId).append(claimId).append(intakeDate).append(relatedEncounterId).append(partnerId).append(claimType).append(overrideIndicator).append(submitterReceiverId).append(contractId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identifiers) == false) {
            return false;
        }
        Identifiers rhs = ((Identifiers) other);
        return new EqualsBuilder().append(claimECNId, rhs.claimECNId).append(encounterId, rhs.encounterId).append(intakeId, rhs.intakeId).append(claimId, rhs.claimId).append(intakeDate, rhs.intakeDate).append(relatedEncounterId, rhs.relatedEncounterId).append(partnerId, rhs.partnerId).append(claimType, rhs.claimType).append(overrideIndicator, rhs.overrideIndicator).append(submitterReceiverId, rhs.submitterReceiverId).append(contractId, rhs.contractId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

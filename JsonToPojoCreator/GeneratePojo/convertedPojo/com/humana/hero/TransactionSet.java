
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
    "st01_transactionSetIdentifierCode",
    "st02_transactionSetControlNo",
    "st03_implementationConventionRef",
    "bht01_hierarchicalStructureCode",
    "bht02_transactionSetPurposeCode",
    "bht03_RefIdentification",
    "bht04_creationDate",
    "bht05_creationTime",
    "bht06_transactionTypeCode"
})
public class TransactionSet {

    @JsonProperty("st01_transactionSetIdentifierCode")
    private String st01TransactionSetIdentifierCode;
    @JsonProperty("st02_transactionSetControlNo")
    private String st02TransactionSetControlNo;
    @JsonProperty("st03_implementationConventionRef")
    private String st03ImplementationConventionRef;
    @JsonProperty("bht01_hierarchicalStructureCode")
    private String bht01HierarchicalStructureCode;
    @JsonProperty("bht02_transactionSetPurposeCode")
    private String bht02TransactionSetPurposeCode;
    @JsonProperty("bht03_RefIdentification")
    private String bht03RefIdentification;
    @JsonProperty("bht04_creationDate")
    private String bht04CreationDate;
    @JsonProperty("bht05_creationTime")
    private String bht05CreationTime;
    @JsonProperty("bht06_transactionTypeCode")
    private String bht06TransactionTypeCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("st01_transactionSetIdentifierCode")
    public String getSt01TransactionSetIdentifierCode() {
        return st01TransactionSetIdentifierCode;
    }

    @JsonProperty("st01_transactionSetIdentifierCode")
    public void setSt01TransactionSetIdentifierCode(String st01TransactionSetIdentifierCode) {
        this.st01TransactionSetIdentifierCode = st01TransactionSetIdentifierCode;
    }

    public TransactionSet withSt01TransactionSetIdentifierCode(String st01TransactionSetIdentifierCode) {
        this.st01TransactionSetIdentifierCode = st01TransactionSetIdentifierCode;
        return this;
    }

    @JsonProperty("st02_transactionSetControlNo")
    public String getSt02TransactionSetControlNo() {
        return st02TransactionSetControlNo;
    }

    @JsonProperty("st02_transactionSetControlNo")
    public void setSt02TransactionSetControlNo(String st02TransactionSetControlNo) {
        this.st02TransactionSetControlNo = st02TransactionSetControlNo;
    }

    public TransactionSet withSt02TransactionSetControlNo(String st02TransactionSetControlNo) {
        this.st02TransactionSetControlNo = st02TransactionSetControlNo;
        return this;
    }

    @JsonProperty("st03_implementationConventionRef")
    public String getSt03ImplementationConventionRef() {
        return st03ImplementationConventionRef;
    }

    @JsonProperty("st03_implementationConventionRef")
    public void setSt03ImplementationConventionRef(String st03ImplementationConventionRef) {
        this.st03ImplementationConventionRef = st03ImplementationConventionRef;
    }

    public TransactionSet withSt03ImplementationConventionRef(String st03ImplementationConventionRef) {
        this.st03ImplementationConventionRef = st03ImplementationConventionRef;
        return this;
    }

    @JsonProperty("bht01_hierarchicalStructureCode")
    public String getBht01HierarchicalStructureCode() {
        return bht01HierarchicalStructureCode;
    }

    @JsonProperty("bht01_hierarchicalStructureCode")
    public void setBht01HierarchicalStructureCode(String bht01HierarchicalStructureCode) {
        this.bht01HierarchicalStructureCode = bht01HierarchicalStructureCode;
    }

    public TransactionSet withBht01HierarchicalStructureCode(String bht01HierarchicalStructureCode) {
        this.bht01HierarchicalStructureCode = bht01HierarchicalStructureCode;
        return this;
    }

    @JsonProperty("bht02_transactionSetPurposeCode")
    public String getBht02TransactionSetPurposeCode() {
        return bht02TransactionSetPurposeCode;
    }

    @JsonProperty("bht02_transactionSetPurposeCode")
    public void setBht02TransactionSetPurposeCode(String bht02TransactionSetPurposeCode) {
        this.bht02TransactionSetPurposeCode = bht02TransactionSetPurposeCode;
    }

    public TransactionSet withBht02TransactionSetPurposeCode(String bht02TransactionSetPurposeCode) {
        this.bht02TransactionSetPurposeCode = bht02TransactionSetPurposeCode;
        return this;
    }

    @JsonProperty("bht03_RefIdentification")
    public String getBht03RefIdentification() {
        return bht03RefIdentification;
    }

    @JsonProperty("bht03_RefIdentification")
    public void setBht03RefIdentification(String bht03RefIdentification) {
        this.bht03RefIdentification = bht03RefIdentification;
    }

    public TransactionSet withBht03RefIdentification(String bht03RefIdentification) {
        this.bht03RefIdentification = bht03RefIdentification;
        return this;
    }

    @JsonProperty("bht04_creationDate")
    public String getBht04CreationDate() {
        return bht04CreationDate;
    }

    @JsonProperty("bht04_creationDate")
    public void setBht04CreationDate(String bht04CreationDate) {
        this.bht04CreationDate = bht04CreationDate;
    }

    public TransactionSet withBht04CreationDate(String bht04CreationDate) {
        this.bht04CreationDate = bht04CreationDate;
        return this;
    }

    @JsonProperty("bht05_creationTime")
    public String getBht05CreationTime() {
        return bht05CreationTime;
    }

    @JsonProperty("bht05_creationTime")
    public void setBht05CreationTime(String bht05CreationTime) {
        this.bht05CreationTime = bht05CreationTime;
    }

    public TransactionSet withBht05CreationTime(String bht05CreationTime) {
        this.bht05CreationTime = bht05CreationTime;
        return this;
    }

    @JsonProperty("bht06_transactionTypeCode")
    public String getBht06TransactionTypeCode() {
        return bht06TransactionTypeCode;
    }

    @JsonProperty("bht06_transactionTypeCode")
    public void setBht06TransactionTypeCode(String bht06TransactionTypeCode) {
        this.bht06TransactionTypeCode = bht06TransactionTypeCode;
    }

    public TransactionSet withBht06TransactionTypeCode(String bht06TransactionTypeCode) {
        this.bht06TransactionTypeCode = bht06TransactionTypeCode;
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

    public TransactionSet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(st01TransactionSetIdentifierCode).append(st02TransactionSetControlNo).append(st03ImplementationConventionRef).append(bht01HierarchicalStructureCode).append(bht02TransactionSetPurposeCode).append(bht03RefIdentification).append(bht04CreationDate).append(bht05CreationTime).append(bht06TransactionTypeCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionSet) == false) {
            return false;
        }
        TransactionSet rhs = ((TransactionSet) other);
        return new EqualsBuilder().append(st01TransactionSetIdentifierCode, rhs.st01TransactionSetIdentifierCode).append(st02TransactionSetControlNo, rhs.st02TransactionSetControlNo).append(st03ImplementationConventionRef, rhs.st03ImplementationConventionRef).append(bht01HierarchicalStructureCode, rhs.bht01HierarchicalStructureCode).append(bht02TransactionSetPurposeCode, rhs.bht02TransactionSetPurposeCode).append(bht03RefIdentification, rhs.bht03RefIdentification).append(bht04CreationDate, rhs.bht04CreationDate).append(bht05CreationTime, rhs.bht05CreationTime).append(bht06TransactionTypeCode, rhs.bht06TransactionTypeCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

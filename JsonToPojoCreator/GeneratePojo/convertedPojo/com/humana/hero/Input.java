
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
    "identifiers",
    "interchange",
    "functionalGroup",
    "transaction",
    "provider",
    "subscriber",
    "dependant",
    "claim",
    "otherSubscriberInfo",
    "serviceLines",
    "balancingReport",
    "errorLevelHierarchy",
    "paymentAdviceObject"
})
public class Input {

    @JsonProperty("identifiers")
    private Identifiers identifiers;
    @JsonProperty("interchange")
    private Interchange interchange;
    @JsonProperty("functionalGroup")
    private FunctionalGroup functionalGroup;
    @JsonProperty("transaction")
    private Transaction transaction;
    @JsonProperty("provider")
    private Provider provider;
    @JsonProperty("subscriber")
    private Subscriber subscriber;
    @JsonProperty("dependant")
    private List<Dependant> dependant = new ArrayList<Dependant>();
    @JsonProperty("claim")
    private Claim claim;
    @JsonProperty("otherSubscriberInfo")
    private List<OtherSubscriberInfo> otherSubscriberInfo = new ArrayList<OtherSubscriberInfo>();
    @JsonProperty("serviceLines")
    private List<ServiceLine> serviceLines = new ArrayList<ServiceLine>();
    @JsonProperty("balancingReport")
    private BalancingReport balancingReport;
    @JsonProperty("errorLevelHierarchy")
    private List<ErrorLevelHierarchy> errorLevelHierarchy = new ArrayList<ErrorLevelHierarchy>();
    @JsonProperty("paymentAdviceObject")
    private PaymentAdviceObject paymentAdviceObject;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identifiers")
    public Identifiers getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("identifiers")
    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    public Input withIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    @JsonProperty("interchange")
    public Interchange getInterchange() {
        return interchange;
    }

    @JsonProperty("interchange")
    public void setInterchange(Interchange interchange) {
        this.interchange = interchange;
    }

    public Input withInterchange(Interchange interchange) {
        this.interchange = interchange;
        return this;
    }

    @JsonProperty("functionalGroup")
    public FunctionalGroup getFunctionalGroup() {
        return functionalGroup;
    }

    @JsonProperty("functionalGroup")
    public void setFunctionalGroup(FunctionalGroup functionalGroup) {
        this.functionalGroup = functionalGroup;
    }

    public Input withFunctionalGroup(FunctionalGroup functionalGroup) {
        this.functionalGroup = functionalGroup;
        return this;
    }

    @JsonProperty("transaction")
    public Transaction getTransaction() {
        return transaction;
    }

    @JsonProperty("transaction")
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Input withTransaction(Transaction transaction) {
        this.transaction = transaction;
        return this;
    }

    @JsonProperty("provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Input withProvider(Provider provider) {
        this.provider = provider;
        return this;
    }

    @JsonProperty("subscriber")
    public Subscriber getSubscriber() {
        return subscriber;
    }

    @JsonProperty("subscriber")
    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public Input withSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
        return this;
    }

    @JsonProperty("dependant")
    public List<Dependant> getDependant() {
        return dependant;
    }

    @JsonProperty("dependant")
    public void setDependant(List<Dependant> dependant) {
        this.dependant = dependant;
    }

    public Input withDependant(List<Dependant> dependant) {
        this.dependant = dependant;
        return this;
    }

    @JsonProperty("claim")
    public Claim getClaim() {
        return claim;
    }

    @JsonProperty("claim")
    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public Input withClaim(Claim claim) {
        this.claim = claim;
        return this;
    }

    @JsonProperty("otherSubscriberInfo")
    public List<OtherSubscriberInfo> getOtherSubscriberInfo() {
        return otherSubscriberInfo;
    }

    @JsonProperty("otherSubscriberInfo")
    public void setOtherSubscriberInfo(List<OtherSubscriberInfo> otherSubscriberInfo) {
        this.otherSubscriberInfo = otherSubscriberInfo;
    }

    public Input withOtherSubscriberInfo(List<OtherSubscriberInfo> otherSubscriberInfo) {
        this.otherSubscriberInfo = otherSubscriberInfo;
        return this;
    }

    @JsonProperty("serviceLines")
    public List<ServiceLine> getServiceLines() {
        return serviceLines;
    }

    @JsonProperty("serviceLines")
    public void setServiceLines(List<ServiceLine> serviceLines) {
        this.serviceLines = serviceLines;
    }

    public Input withServiceLines(List<ServiceLine> serviceLines) {
        this.serviceLines = serviceLines;
        return this;
    }

    @JsonProperty("balancingReport")
    public BalancingReport getBalancingReport() {
        return balancingReport;
    }

    @JsonProperty("balancingReport")
    public void setBalancingReport(BalancingReport balancingReport) {
        this.balancingReport = balancingReport;
    }

    public Input withBalancingReport(BalancingReport balancingReport) {
        this.balancingReport = balancingReport;
        return this;
    }

    @JsonProperty("errorLevelHierarchy")
    public List<ErrorLevelHierarchy> getErrorLevelHierarchy() {
        return errorLevelHierarchy;
    }

    @JsonProperty("errorLevelHierarchy")
    public void setErrorLevelHierarchy(List<ErrorLevelHierarchy> errorLevelHierarchy) {
        this.errorLevelHierarchy = errorLevelHierarchy;
    }

    public Input withErrorLevelHierarchy(List<ErrorLevelHierarchy> errorLevelHierarchy) {
        this.errorLevelHierarchy = errorLevelHierarchy;
        return this;
    }

    @JsonProperty("paymentAdviceObject")
    public PaymentAdviceObject getPaymentAdviceObject() {
        return paymentAdviceObject;
    }

    @JsonProperty("paymentAdviceObject")
    public void setPaymentAdviceObject(PaymentAdviceObject paymentAdviceObject) {
        this.paymentAdviceObject = paymentAdviceObject;
    }

    public Input withPaymentAdviceObject(PaymentAdviceObject paymentAdviceObject) {
        this.paymentAdviceObject = paymentAdviceObject;
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

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(identifiers).append(interchange).append(functionalGroup).append(transaction).append(provider).append(subscriber).append(dependant).append(claim).append(otherSubscriberInfo).append(serviceLines).append(balancingReport).append(errorLevelHierarchy).append(paymentAdviceObject).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return new EqualsBuilder().append(identifiers, rhs.identifiers).append(interchange, rhs.interchange).append(functionalGroup, rhs.functionalGroup).append(transaction, rhs.transaction).append(provider, rhs.provider).append(subscriber, rhs.subscriber).append(dependant, rhs.dependant).append(claim, rhs.claim).append(otherSubscriberInfo, rhs.otherSubscriberInfo).append(serviceLines, rhs.serviceLines).append(balancingReport, rhs.balancingReport).append(errorLevelHierarchy, rhs.errorLevelHierarchy).append(paymentAdviceObject, rhs.paymentAdviceObject).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "identifier",
    "interchange",
    "functionalGroup",
    "transaction",
    "paymentDetail",
    "claimPaymentInfo",
    "svcpaymentinfo"
})
public class PaymentAdviceObject {

    @JsonProperty("identifier")
    private Identifier identifier;
    @JsonProperty("interchange")
    private List<Interchange_> interchange = new ArrayList<Interchange_>();
    @JsonProperty("functionalGroup")
    private List<FunctionalGroup_> functionalGroup = new ArrayList<FunctionalGroup_>();
    @JsonProperty("transaction")
    private List<Transaction_> transaction = new ArrayList<Transaction_>();
    @JsonProperty("paymentDetail")
    private List<PaymentDetail> paymentDetail = new ArrayList<PaymentDetail>();
    @JsonProperty("claimPaymentInfo")
    private List<ClaimPaymentInfo> claimPaymentInfo = new ArrayList<ClaimPaymentInfo>();
    @JsonProperty("svcpaymentinfo")
    private List<Svcpaymentinfo> svcpaymentinfo = new ArrayList<Svcpaymentinfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public PaymentAdviceObject withIdentifier(Identifier identifier) {
        this.identifier = identifier;
        return this;
    }

    @JsonProperty("interchange")
    public List<Interchange_> getInterchange() {
        return interchange;
    }

    @JsonProperty("interchange")
    public void setInterchange(List<Interchange_> interchange) {
        this.interchange = interchange;
    }

    public PaymentAdviceObject withInterchange(List<Interchange_> interchange) {
        this.interchange = interchange;
        return this;
    }

    @JsonProperty("functionalGroup")
    public List<FunctionalGroup_> getFunctionalGroup() {
        return functionalGroup;
    }

    @JsonProperty("functionalGroup")
    public void setFunctionalGroup(List<FunctionalGroup_> functionalGroup) {
        this.functionalGroup = functionalGroup;
    }

    public PaymentAdviceObject withFunctionalGroup(List<FunctionalGroup_> functionalGroup) {
        this.functionalGroup = functionalGroup;
        return this;
    }

    @JsonProperty("transaction")
    public List<Transaction_> getTransaction() {
        return transaction;
    }

    @JsonProperty("transaction")
    public void setTransaction(List<Transaction_> transaction) {
        this.transaction = transaction;
    }

    public PaymentAdviceObject withTransaction(List<Transaction_> transaction) {
        this.transaction = transaction;
        return this;
    }

    @JsonProperty("paymentDetail")
    public List<PaymentDetail> getPaymentDetail() {
        return paymentDetail;
    }

    @JsonProperty("paymentDetail")
    public void setPaymentDetail(List<PaymentDetail> paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public PaymentAdviceObject withPaymentDetail(List<PaymentDetail> paymentDetail) {
        this.paymentDetail = paymentDetail;
        return this;
    }

    @JsonProperty("claimPaymentInfo")
    public List<ClaimPaymentInfo> getClaimPaymentInfo() {
        return claimPaymentInfo;
    }

    @JsonProperty("claimPaymentInfo")
    public void setClaimPaymentInfo(List<ClaimPaymentInfo> claimPaymentInfo) {
        this.claimPaymentInfo = claimPaymentInfo;
    }

    public PaymentAdviceObject withClaimPaymentInfo(List<ClaimPaymentInfo> claimPaymentInfo) {
        this.claimPaymentInfo = claimPaymentInfo;
        return this;
    }

    @JsonProperty("svcpaymentinfo")
    public List<Svcpaymentinfo> getSvcpaymentinfo() {
        return svcpaymentinfo;
    }

    @JsonProperty("svcpaymentinfo")
    public void setSvcpaymentinfo(List<Svcpaymentinfo> svcpaymentinfo) {
        this.svcpaymentinfo = svcpaymentinfo;
    }

    public PaymentAdviceObject withSvcpaymentinfo(List<Svcpaymentinfo> svcpaymentinfo) {
        this.svcpaymentinfo = svcpaymentinfo;
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

    public PaymentAdviceObject withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(identifier).append(interchange).append(functionalGroup).append(transaction).append(paymentDetail).append(claimPaymentInfo).append(svcpaymentinfo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentAdviceObject) == false) {
            return false;
        }
        PaymentAdviceObject rhs = ((PaymentAdviceObject) other);
        return new EqualsBuilder().append(identifier, rhs.identifier).append(interchange, rhs.interchange).append(functionalGroup, rhs.functionalGroup).append(transaction, rhs.transaction).append(paymentDetail, rhs.paymentDetail).append(claimPaymentInfo, rhs.claimPaymentInfo).append(svcpaymentinfo, rhs.svcpaymentinfo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

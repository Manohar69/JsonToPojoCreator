
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
    "dbSubscriberId",
    "subscriberHierLevel",
    "subscriberName",
    "payerName"
})
public class Subscriber {

    @JsonProperty("dbSubscriberId")
    private Integer dbSubscriberId;
    @JsonProperty("subscriberHierLevel")
    private SubscriberHierLevel subscriberHierLevel;
    @JsonProperty("subscriberName")
    private SubscriberName subscriberName;
    @JsonProperty("payerName")
    private PayerName payerName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbSubscriberId")
    public Integer getDbSubscriberId() {
        return dbSubscriberId;
    }

    @JsonProperty("dbSubscriberId")
    public void setDbSubscriberId(Integer dbSubscriberId) {
        this.dbSubscriberId = dbSubscriberId;
    }

    public Subscriber withDbSubscriberId(Integer dbSubscriberId) {
        this.dbSubscriberId = dbSubscriberId;
        return this;
    }

    @JsonProperty("subscriberHierLevel")
    public SubscriberHierLevel getSubscriberHierLevel() {
        return subscriberHierLevel;
    }

    @JsonProperty("subscriberHierLevel")
    public void setSubscriberHierLevel(SubscriberHierLevel subscriberHierLevel) {
        this.subscriberHierLevel = subscriberHierLevel;
    }

    public Subscriber withSubscriberHierLevel(SubscriberHierLevel subscriberHierLevel) {
        this.subscriberHierLevel = subscriberHierLevel;
        return this;
    }

    @JsonProperty("subscriberName")
    public SubscriberName getSubscriberName() {
        return subscriberName;
    }

    @JsonProperty("subscriberName")
    public void setSubscriberName(SubscriberName subscriberName) {
        this.subscriberName = subscriberName;
    }

    public Subscriber withSubscriberName(SubscriberName subscriberName) {
        this.subscriberName = subscriberName;
        return this;
    }

    @JsonProperty("payerName")
    public PayerName getPayerName() {
        return payerName;
    }

    @JsonProperty("payerName")
    public void setPayerName(PayerName payerName) {
        this.payerName = payerName;
    }

    public Subscriber withPayerName(PayerName payerName) {
        this.payerName = payerName;
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

    public Subscriber withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbSubscriberId).append(subscriberHierLevel).append(subscriberName).append(payerName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subscriber) == false) {
            return false;
        }
        Subscriber rhs = ((Subscriber) other);
        return new EqualsBuilder().append(dbSubscriberId, rhs.dbSubscriberId).append(subscriberHierLevel, rhs.subscriberHierLevel).append(subscriberName, rhs.subscriberName).append(payerName, rhs.payerName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

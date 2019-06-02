
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
    "payECNId",
    "claimECNId",
    "claimId"
})
public class Identifier {

    @JsonProperty("payECNId")
    private String payECNId;
    @JsonProperty("claimECNId")
    private String claimECNId;
    @JsonProperty("claimId")
    private String claimId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("payECNId")
    public String getPayECNId() {
        return payECNId;
    }

    @JsonProperty("payECNId")
    public void setPayECNId(String payECNId) {
        this.payECNId = payECNId;
    }

    public Identifier withPayECNId(String payECNId) {
        this.payECNId = payECNId;
        return this;
    }

    @JsonProperty("claimECNId")
    public String getClaimECNId() {
        return claimECNId;
    }

    @JsonProperty("claimECNId")
    public void setClaimECNId(String claimECNId) {
        this.claimECNId = claimECNId;
    }

    public Identifier withClaimECNId(String claimECNId) {
        this.claimECNId = claimECNId;
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

    public Identifier withClaimId(String claimId) {
        this.claimId = claimId;
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

    public Identifier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payECNId).append(claimECNId).append(claimId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identifier) == false) {
            return false;
        }
        Identifier rhs = ((Identifier) other);
        return new EqualsBuilder().append(payECNId, rhs.payECNId).append(claimECNId, rhs.claimECNId).append(claimId, rhs.claimId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

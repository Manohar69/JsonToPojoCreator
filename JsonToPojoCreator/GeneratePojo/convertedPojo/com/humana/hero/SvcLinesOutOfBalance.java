
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
    "outOfBalance",
    "svcLineNumber",
    "x12LineNumber"
})
public class SvcLinesOutOfBalance {

    @JsonProperty("outOfBalance")
    private String outOfBalance;
    @JsonProperty("svcLineNumber")
    private String svcLineNumber;
    @JsonProperty("x12LineNumber")
    private String x12LineNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("outOfBalance")
    public String getOutOfBalance() {
        return outOfBalance;
    }

    @JsonProperty("outOfBalance")
    public void setOutOfBalance(String outOfBalance) {
        this.outOfBalance = outOfBalance;
    }

    public SvcLinesOutOfBalance withOutOfBalance(String outOfBalance) {
        this.outOfBalance = outOfBalance;
        return this;
    }

    @JsonProperty("svcLineNumber")
    public String getSvcLineNumber() {
        return svcLineNumber;
    }

    @JsonProperty("svcLineNumber")
    public void setSvcLineNumber(String svcLineNumber) {
        this.svcLineNumber = svcLineNumber;
    }

    public SvcLinesOutOfBalance withSvcLineNumber(String svcLineNumber) {
        this.svcLineNumber = svcLineNumber;
        return this;
    }

    @JsonProperty("x12LineNumber")
    public String getX12LineNumber() {
        return x12LineNumber;
    }

    @JsonProperty("x12LineNumber")
    public void setX12LineNumber(String x12LineNumber) {
        this.x12LineNumber = x12LineNumber;
    }

    public SvcLinesOutOfBalance withX12LineNumber(String x12LineNumber) {
        this.x12LineNumber = x12LineNumber;
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

    public SvcLinesOutOfBalance withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outOfBalance).append(svcLineNumber).append(x12LineNumber).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SvcLinesOutOfBalance) == false) {
            return false;
        }
        SvcLinesOutOfBalance rhs = ((SvcLinesOutOfBalance) other);
        return new EqualsBuilder().append(outOfBalance, rhs.outOfBalance).append(svcLineNumber, rhs.svcLineNumber).append(x12LineNumber, rhs.x12LineNumber).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "se01_noOfIncludedSegments",
    "se02_transactionSetControlNo"
})
public class TransactionSetTrailer {

    @JsonProperty("se01_noOfIncludedSegments")
    private String se01NoOfIncludedSegments;
    @JsonProperty("se02_transactionSetControlNo")
    private String se02TransactionSetControlNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("se01_noOfIncludedSegments")
    public String getSe01NoOfIncludedSegments() {
        return se01NoOfIncludedSegments;
    }

    @JsonProperty("se01_noOfIncludedSegments")
    public void setSe01NoOfIncludedSegments(String se01NoOfIncludedSegments) {
        this.se01NoOfIncludedSegments = se01NoOfIncludedSegments;
    }

    public TransactionSetTrailer withSe01NoOfIncludedSegments(String se01NoOfIncludedSegments) {
        this.se01NoOfIncludedSegments = se01NoOfIncludedSegments;
        return this;
    }

    @JsonProperty("se02_transactionSetControlNo")
    public String getSe02TransactionSetControlNo() {
        return se02TransactionSetControlNo;
    }

    @JsonProperty("se02_transactionSetControlNo")
    public void setSe02TransactionSetControlNo(String se02TransactionSetControlNo) {
        this.se02TransactionSetControlNo = se02TransactionSetControlNo;
    }

    public TransactionSetTrailer withSe02TransactionSetControlNo(String se02TransactionSetControlNo) {
        this.se02TransactionSetControlNo = se02TransactionSetControlNo;
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

    public TransactionSetTrailer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(se01NoOfIncludedSegments).append(se02TransactionSetControlNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionSetTrailer) == false) {
            return false;
        }
        TransactionSetTrailer rhs = ((TransactionSetTrailer) other);
        return new EqualsBuilder().append(se01NoOfIncludedSegments, rhs.se01NoOfIncludedSegments).append(se02TransactionSetControlNo, rhs.se02TransactionSetControlNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

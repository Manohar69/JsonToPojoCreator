
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
    "dtp01_assumedAndRelinquishedStartDateQlfr",
    "dtp02_assumedAndRelinquishedStartDateFormatQlfr",
    "dtp03_assumedAndRelinquishedStartDate"
})
public class DtpAssumedAndRelinquishedDate {

    @JsonProperty("dtp01_assumedAndRelinquishedStartDateQlfr")
    private String dtp01AssumedAndRelinquishedStartDateQlfr;
    @JsonProperty("dtp02_assumedAndRelinquishedStartDateFormatQlfr")
    private String dtp02AssumedAndRelinquishedStartDateFormatQlfr;
    @JsonProperty("dtp03_assumedAndRelinquishedStartDate")
    private String dtp03AssumedAndRelinquishedStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dtp01_assumedAndRelinquishedStartDateQlfr")
    public String getDtp01AssumedAndRelinquishedStartDateQlfr() {
        return dtp01AssumedAndRelinquishedStartDateQlfr;
    }

    @JsonProperty("dtp01_assumedAndRelinquishedStartDateQlfr")
    public void setDtp01AssumedAndRelinquishedStartDateQlfr(String dtp01AssumedAndRelinquishedStartDateQlfr) {
        this.dtp01AssumedAndRelinquishedStartDateQlfr = dtp01AssumedAndRelinquishedStartDateQlfr;
    }

    public DtpAssumedAndRelinquishedDate withDtp01AssumedAndRelinquishedStartDateQlfr(String dtp01AssumedAndRelinquishedStartDateQlfr) {
        this.dtp01AssumedAndRelinquishedStartDateQlfr = dtp01AssumedAndRelinquishedStartDateQlfr;
        return this;
    }

    @JsonProperty("dtp02_assumedAndRelinquishedStartDateFormatQlfr")
    public String getDtp02AssumedAndRelinquishedStartDateFormatQlfr() {
        return dtp02AssumedAndRelinquishedStartDateFormatQlfr;
    }

    @JsonProperty("dtp02_assumedAndRelinquishedStartDateFormatQlfr")
    public void setDtp02AssumedAndRelinquishedStartDateFormatQlfr(String dtp02AssumedAndRelinquishedStartDateFormatQlfr) {
        this.dtp02AssumedAndRelinquishedStartDateFormatQlfr = dtp02AssumedAndRelinquishedStartDateFormatQlfr;
    }

    public DtpAssumedAndRelinquishedDate withDtp02AssumedAndRelinquishedStartDateFormatQlfr(String dtp02AssumedAndRelinquishedStartDateFormatQlfr) {
        this.dtp02AssumedAndRelinquishedStartDateFormatQlfr = dtp02AssumedAndRelinquishedStartDateFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_assumedAndRelinquishedStartDate")
    public String getDtp03AssumedAndRelinquishedStartDate() {
        return dtp03AssumedAndRelinquishedStartDate;
    }

    @JsonProperty("dtp03_assumedAndRelinquishedStartDate")
    public void setDtp03AssumedAndRelinquishedStartDate(String dtp03AssumedAndRelinquishedStartDate) {
        this.dtp03AssumedAndRelinquishedStartDate = dtp03AssumedAndRelinquishedStartDate;
    }

    public DtpAssumedAndRelinquishedDate withDtp03AssumedAndRelinquishedStartDate(String dtp03AssumedAndRelinquishedStartDate) {
        this.dtp03AssumedAndRelinquishedStartDate = dtp03AssumedAndRelinquishedStartDate;
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

    public DtpAssumedAndRelinquishedDate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dtp01AssumedAndRelinquishedStartDateQlfr).append(dtp02AssumedAndRelinquishedStartDateFormatQlfr).append(dtp03AssumedAndRelinquishedStartDate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DtpAssumedAndRelinquishedDate) == false) {
            return false;
        }
        DtpAssumedAndRelinquishedDate rhs = ((DtpAssumedAndRelinquishedDate) other);
        return new EqualsBuilder().append(dtp01AssumedAndRelinquishedStartDateQlfr, rhs.dtp01AssumedAndRelinquishedStartDateQlfr).append(dtp02AssumedAndRelinquishedStartDateFormatQlfr, rhs.dtp02AssumedAndRelinquishedStartDateFormatQlfr).append(dtp03AssumedAndRelinquishedStartDate, rhs.dtp03AssumedAndRelinquishedStartDate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

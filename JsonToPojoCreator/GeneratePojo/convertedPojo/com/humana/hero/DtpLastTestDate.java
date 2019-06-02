
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
    "dtp01_lastTestQlfr",
    "dtp02_lastTestFormatQlfr",
    "dtp03_lastTestDate"
})
public class DtpLastTestDate {

    @JsonProperty("dtp01_lastTestQlfr")
    private String dtp01LastTestQlfr;
    @JsonProperty("dtp02_lastTestFormatQlfr")
    private String dtp02LastTestFormatQlfr;
    @JsonProperty("dtp03_lastTestDate")
    private String dtp03LastTestDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dtp01_lastTestQlfr")
    public String getDtp01LastTestQlfr() {
        return dtp01LastTestQlfr;
    }

    @JsonProperty("dtp01_lastTestQlfr")
    public void setDtp01LastTestQlfr(String dtp01LastTestQlfr) {
        this.dtp01LastTestQlfr = dtp01LastTestQlfr;
    }

    public DtpLastTestDate withDtp01LastTestQlfr(String dtp01LastTestQlfr) {
        this.dtp01LastTestQlfr = dtp01LastTestQlfr;
        return this;
    }

    @JsonProperty("dtp02_lastTestFormatQlfr")
    public String getDtp02LastTestFormatQlfr() {
        return dtp02LastTestFormatQlfr;
    }

    @JsonProperty("dtp02_lastTestFormatQlfr")
    public void setDtp02LastTestFormatQlfr(String dtp02LastTestFormatQlfr) {
        this.dtp02LastTestFormatQlfr = dtp02LastTestFormatQlfr;
    }

    public DtpLastTestDate withDtp02LastTestFormatQlfr(String dtp02LastTestFormatQlfr) {
        this.dtp02LastTestFormatQlfr = dtp02LastTestFormatQlfr;
        return this;
    }

    @JsonProperty("dtp03_lastTestDate")
    public String getDtp03LastTestDate() {
        return dtp03LastTestDate;
    }

    @JsonProperty("dtp03_lastTestDate")
    public void setDtp03LastTestDate(String dtp03LastTestDate) {
        this.dtp03LastTestDate = dtp03LastTestDate;
    }

    public DtpLastTestDate withDtp03LastTestDate(String dtp03LastTestDate) {
        this.dtp03LastTestDate = dtp03LastTestDate;
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

    public DtpLastTestDate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dtp01LastTestQlfr).append(dtp02LastTestFormatQlfr).append(dtp03LastTestDate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DtpLastTestDate) == false) {
            return false;
        }
        DtpLastTestDate rhs = ((DtpLastTestDate) other);
        return new EqualsBuilder().append(dtp01LastTestQlfr, rhs.dtp01LastTestQlfr).append(dtp02LastTestFormatQlfr, rhs.dtp02LastTestFormatQlfr).append(dtp03LastTestDate, rhs.dtp03LastTestDate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

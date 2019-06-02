
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
    "dn201_toothNo",
    "dn202_toothStatusCode",
    "dn206_universalNationalToothDesignationSystem"
})
public class Dn2Toothstatus {

    @JsonProperty("dn201_toothNo")
    private String dn201ToothNo;
    @JsonProperty("dn202_toothStatusCode")
    private String dn202ToothStatusCode;
    @JsonProperty("dn206_universalNationalToothDesignationSystem")
    private String dn206UniversalNationalToothDesignationSystem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dn201_toothNo")
    public String getDn201ToothNo() {
        return dn201ToothNo;
    }

    @JsonProperty("dn201_toothNo")
    public void setDn201ToothNo(String dn201ToothNo) {
        this.dn201ToothNo = dn201ToothNo;
    }

    public Dn2Toothstatus withDn201ToothNo(String dn201ToothNo) {
        this.dn201ToothNo = dn201ToothNo;
        return this;
    }

    @JsonProperty("dn202_toothStatusCode")
    public String getDn202ToothStatusCode() {
        return dn202ToothStatusCode;
    }

    @JsonProperty("dn202_toothStatusCode")
    public void setDn202ToothStatusCode(String dn202ToothStatusCode) {
        this.dn202ToothStatusCode = dn202ToothStatusCode;
    }

    public Dn2Toothstatus withDn202ToothStatusCode(String dn202ToothStatusCode) {
        this.dn202ToothStatusCode = dn202ToothStatusCode;
        return this;
    }

    @JsonProperty("dn206_universalNationalToothDesignationSystem")
    public String getDn206UniversalNationalToothDesignationSystem() {
        return dn206UniversalNationalToothDesignationSystem;
    }

    @JsonProperty("dn206_universalNationalToothDesignationSystem")
    public void setDn206UniversalNationalToothDesignationSystem(String dn206UniversalNationalToothDesignationSystem) {
        this.dn206UniversalNationalToothDesignationSystem = dn206UniversalNationalToothDesignationSystem;
    }

    public Dn2Toothstatus withDn206UniversalNationalToothDesignationSystem(String dn206UniversalNationalToothDesignationSystem) {
        this.dn206UniversalNationalToothDesignationSystem = dn206UniversalNationalToothDesignationSystem;
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

    public Dn2Toothstatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dn201ToothNo).append(dn202ToothStatusCode).append(dn206UniversalNationalToothDesignationSystem).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dn2Toothstatus) == false) {
            return false;
        }
        Dn2Toothstatus rhs = ((Dn2Toothstatus) other);
        return new EqualsBuilder().append(dn201ToothNo, rhs.dn201ToothNo).append(dn202ToothStatusCode, rhs.dn202ToothStatusCode).append(dn206UniversalNationalToothDesignationSystem, rhs.dn206UniversalNationalToothDesignationSystem).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

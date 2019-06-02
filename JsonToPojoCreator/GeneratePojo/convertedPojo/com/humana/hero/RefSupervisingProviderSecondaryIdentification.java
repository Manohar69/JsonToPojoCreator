
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
    "ref01_supervisingProviderSecondaryIdQlfr",
    "ref02_supervisingProviderSecondaryId",
    "ref04_supervisngProviderSecondaryPayerIdNoIdentifierCode",
    "ref04_01_supervisngProviderSecondaryPayerIdNoQlfr",
    "ref04_02_supervisngProviderSecondaryPayerIdNo"
})
public class RefSupervisingProviderSecondaryIdentification {

    @JsonProperty("ref01_supervisingProviderSecondaryIdQlfr")
    private String ref01SupervisingProviderSecondaryIdQlfr;
    @JsonProperty("ref02_supervisingProviderSecondaryId")
    private String ref02SupervisingProviderSecondaryId;
    @JsonProperty("ref04_supervisngProviderSecondaryPayerIdNoIdentifierCode")
    private String ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode;
    @JsonProperty("ref04_01_supervisngProviderSecondaryPayerIdNoQlfr")
    private String ref0401SupervisngProviderSecondaryPayerIdNoQlfr;
    @JsonProperty("ref04_02_supervisngProviderSecondaryPayerIdNo")
    private String ref0402SupervisngProviderSecondaryPayerIdNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_supervisingProviderSecondaryIdQlfr")
    public String getRef01SupervisingProviderSecondaryIdQlfr() {
        return ref01SupervisingProviderSecondaryIdQlfr;
    }

    @JsonProperty("ref01_supervisingProviderSecondaryIdQlfr")
    public void setRef01SupervisingProviderSecondaryIdQlfr(String ref01SupervisingProviderSecondaryIdQlfr) {
        this.ref01SupervisingProviderSecondaryIdQlfr = ref01SupervisingProviderSecondaryIdQlfr;
    }

    public RefSupervisingProviderSecondaryIdentification withRef01SupervisingProviderSecondaryIdQlfr(String ref01SupervisingProviderSecondaryIdQlfr) {
        this.ref01SupervisingProviderSecondaryIdQlfr = ref01SupervisingProviderSecondaryIdQlfr;
        return this;
    }

    @JsonProperty("ref02_supervisingProviderSecondaryId")
    public String getRef02SupervisingProviderSecondaryId() {
        return ref02SupervisingProviderSecondaryId;
    }

    @JsonProperty("ref02_supervisingProviderSecondaryId")
    public void setRef02SupervisingProviderSecondaryId(String ref02SupervisingProviderSecondaryId) {
        this.ref02SupervisingProviderSecondaryId = ref02SupervisingProviderSecondaryId;
    }

    public RefSupervisingProviderSecondaryIdentification withRef02SupervisingProviderSecondaryId(String ref02SupervisingProviderSecondaryId) {
        this.ref02SupervisingProviderSecondaryId = ref02SupervisingProviderSecondaryId;
        return this;
    }

    @JsonProperty("ref04_supervisngProviderSecondaryPayerIdNoIdentifierCode")
    public String getRef04SupervisngProviderSecondaryPayerIdNoIdentifierCode() {
        return ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode;
    }

    @JsonProperty("ref04_supervisngProviderSecondaryPayerIdNoIdentifierCode")
    public void setRef04SupervisngProviderSecondaryPayerIdNoIdentifierCode(String ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode) {
        this.ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode = ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode;
    }

    public RefSupervisingProviderSecondaryIdentification withRef04SupervisngProviderSecondaryPayerIdNoIdentifierCode(String ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode) {
        this.ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode = ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode;
        return this;
    }

    @JsonProperty("ref04_01_supervisngProviderSecondaryPayerIdNoQlfr")
    public String getRef0401SupervisngProviderSecondaryPayerIdNoQlfr() {
        return ref0401SupervisngProviderSecondaryPayerIdNoQlfr;
    }

    @JsonProperty("ref04_01_supervisngProviderSecondaryPayerIdNoQlfr")
    public void setRef0401SupervisngProviderSecondaryPayerIdNoQlfr(String ref0401SupervisngProviderSecondaryPayerIdNoQlfr) {
        this.ref0401SupervisngProviderSecondaryPayerIdNoQlfr = ref0401SupervisngProviderSecondaryPayerIdNoQlfr;
    }

    public RefSupervisingProviderSecondaryIdentification withRef0401SupervisngProviderSecondaryPayerIdNoQlfr(String ref0401SupervisngProviderSecondaryPayerIdNoQlfr) {
        this.ref0401SupervisngProviderSecondaryPayerIdNoQlfr = ref0401SupervisngProviderSecondaryPayerIdNoQlfr;
        return this;
    }

    @JsonProperty("ref04_02_supervisngProviderSecondaryPayerIdNo")
    public String getRef0402SupervisngProviderSecondaryPayerIdNo() {
        return ref0402SupervisngProviderSecondaryPayerIdNo;
    }

    @JsonProperty("ref04_02_supervisngProviderSecondaryPayerIdNo")
    public void setRef0402SupervisngProviderSecondaryPayerIdNo(String ref0402SupervisngProviderSecondaryPayerIdNo) {
        this.ref0402SupervisngProviderSecondaryPayerIdNo = ref0402SupervisngProviderSecondaryPayerIdNo;
    }

    public RefSupervisingProviderSecondaryIdentification withRef0402SupervisngProviderSecondaryPayerIdNo(String ref0402SupervisngProviderSecondaryPayerIdNo) {
        this.ref0402SupervisngProviderSecondaryPayerIdNo = ref0402SupervisngProviderSecondaryPayerIdNo;
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

    public RefSupervisingProviderSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01SupervisingProviderSecondaryIdQlfr).append(ref02SupervisingProviderSecondaryId).append(ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode).append(ref0401SupervisngProviderSecondaryPayerIdNoQlfr).append(ref0402SupervisngProviderSecondaryPayerIdNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefSupervisingProviderSecondaryIdentification) == false) {
            return false;
        }
        RefSupervisingProviderSecondaryIdentification rhs = ((RefSupervisingProviderSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01SupervisingProviderSecondaryIdQlfr, rhs.ref01SupervisingProviderSecondaryIdQlfr).append(ref02SupervisingProviderSecondaryId, rhs.ref02SupervisingProviderSecondaryId).append(ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode, rhs.ref04SupervisngProviderSecondaryPayerIdNoIdentifierCode).append(ref0401SupervisngProviderSecondaryPayerIdNoQlfr, rhs.ref0401SupervisngProviderSecondaryPayerIdNoQlfr).append(ref0402SupervisngProviderSecondaryPayerIdNo, rhs.ref0402SupervisngProviderSecondaryPayerIdNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

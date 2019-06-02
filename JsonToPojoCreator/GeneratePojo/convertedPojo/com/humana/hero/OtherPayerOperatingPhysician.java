
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
    "nm101_otherPayerOperatingPhysicianQlfr",
    "nm102_otherPayerOperatingPhysician",
    "ref_otherPayerOperatingSecondaryIdentifier"
})
public class OtherPayerOperatingPhysician {

    @JsonProperty("nm101_otherPayerOperatingPhysicianQlfr")
    private String nm101OtherPayerOperatingPhysicianQlfr;
    @JsonProperty("nm102_otherPayerOperatingPhysician")
    private String nm102OtherPayerOperatingPhysician;
    @JsonProperty("ref_otherPayerOperatingSecondaryIdentifier")
    private List<RefOtherPayerOperatingSecondaryIdentifier> refOtherPayerOperatingSecondaryIdentifier = new ArrayList<RefOtherPayerOperatingSecondaryIdentifier>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherPayerOperatingPhysicianQlfr")
    public String getNm101OtherPayerOperatingPhysicianQlfr() {
        return nm101OtherPayerOperatingPhysicianQlfr;
    }

    @JsonProperty("nm101_otherPayerOperatingPhysicianQlfr")
    public void setNm101OtherPayerOperatingPhysicianQlfr(String nm101OtherPayerOperatingPhysicianQlfr) {
        this.nm101OtherPayerOperatingPhysicianQlfr = nm101OtherPayerOperatingPhysicianQlfr;
    }

    public OtherPayerOperatingPhysician withNm101OtherPayerOperatingPhysicianQlfr(String nm101OtherPayerOperatingPhysicianQlfr) {
        this.nm101OtherPayerOperatingPhysicianQlfr = nm101OtherPayerOperatingPhysicianQlfr;
        return this;
    }

    @JsonProperty("nm102_otherPayerOperatingPhysician")
    public String getNm102OtherPayerOperatingPhysician() {
        return nm102OtherPayerOperatingPhysician;
    }

    @JsonProperty("nm102_otherPayerOperatingPhysician")
    public void setNm102OtherPayerOperatingPhysician(String nm102OtherPayerOperatingPhysician) {
        this.nm102OtherPayerOperatingPhysician = nm102OtherPayerOperatingPhysician;
    }

    public OtherPayerOperatingPhysician withNm102OtherPayerOperatingPhysician(String nm102OtherPayerOperatingPhysician) {
        this.nm102OtherPayerOperatingPhysician = nm102OtherPayerOperatingPhysician;
        return this;
    }

    @JsonProperty("ref_otherPayerOperatingSecondaryIdentifier")
    public List<RefOtherPayerOperatingSecondaryIdentifier> getRefOtherPayerOperatingSecondaryIdentifier() {
        return refOtherPayerOperatingSecondaryIdentifier;
    }

    @JsonProperty("ref_otherPayerOperatingSecondaryIdentifier")
    public void setRefOtherPayerOperatingSecondaryIdentifier(List<RefOtherPayerOperatingSecondaryIdentifier> refOtherPayerOperatingSecondaryIdentifier) {
        this.refOtherPayerOperatingSecondaryIdentifier = refOtherPayerOperatingSecondaryIdentifier;
    }

    public OtherPayerOperatingPhysician withRefOtherPayerOperatingSecondaryIdentifier(List<RefOtherPayerOperatingSecondaryIdentifier> refOtherPayerOperatingSecondaryIdentifier) {
        this.refOtherPayerOperatingSecondaryIdentifier = refOtherPayerOperatingSecondaryIdentifier;
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

    public OtherPayerOperatingPhysician withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherPayerOperatingPhysicianQlfr).append(nm102OtherPayerOperatingPhysician).append(refOtherPayerOperatingSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerOperatingPhysician) == false) {
            return false;
        }
        OtherPayerOperatingPhysician rhs = ((OtherPayerOperatingPhysician) other);
        return new EqualsBuilder().append(nm101OtherPayerOperatingPhysicianQlfr, rhs.nm101OtherPayerOperatingPhysicianQlfr).append(nm102OtherPayerOperatingPhysician, rhs.nm102OtherPayerOperatingPhysician).append(refOtherPayerOperatingSecondaryIdentifier, rhs.refOtherPayerOperatingSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "nm101_otherPayerOtherOperatingPhysicianQlfr",
    "nm102_otherPayerOtherOperatingPhysician",
    "ref_otherPayerOtherOperatingSecondaryIdentifier"
})
public class OtherPayerOtherOperatingPhysician {

    @JsonProperty("nm101_otherPayerOtherOperatingPhysicianQlfr")
    private String nm101OtherPayerOtherOperatingPhysicianQlfr;
    @JsonProperty("nm102_otherPayerOtherOperatingPhysician")
    private String nm102OtherPayerOtherOperatingPhysician;
    @JsonProperty("ref_otherPayerOtherOperatingSecondaryIdentifier")
    private List<RefOtherPayerOtherOperatingSecondaryIdentifier> refOtherPayerOtherOperatingSecondaryIdentifier = new ArrayList<RefOtherPayerOtherOperatingSecondaryIdentifier>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherPayerOtherOperatingPhysicianQlfr")
    public String getNm101OtherPayerOtherOperatingPhysicianQlfr() {
        return nm101OtherPayerOtherOperatingPhysicianQlfr;
    }

    @JsonProperty("nm101_otherPayerOtherOperatingPhysicianQlfr")
    public void setNm101OtherPayerOtherOperatingPhysicianQlfr(String nm101OtherPayerOtherOperatingPhysicianQlfr) {
        this.nm101OtherPayerOtherOperatingPhysicianQlfr = nm101OtherPayerOtherOperatingPhysicianQlfr;
    }

    public OtherPayerOtherOperatingPhysician withNm101OtherPayerOtherOperatingPhysicianQlfr(String nm101OtherPayerOtherOperatingPhysicianQlfr) {
        this.nm101OtherPayerOtherOperatingPhysicianQlfr = nm101OtherPayerOtherOperatingPhysicianQlfr;
        return this;
    }

    @JsonProperty("nm102_otherPayerOtherOperatingPhysician")
    public String getNm102OtherPayerOtherOperatingPhysician() {
        return nm102OtherPayerOtherOperatingPhysician;
    }

    @JsonProperty("nm102_otherPayerOtherOperatingPhysician")
    public void setNm102OtherPayerOtherOperatingPhysician(String nm102OtherPayerOtherOperatingPhysician) {
        this.nm102OtherPayerOtherOperatingPhysician = nm102OtherPayerOtherOperatingPhysician;
    }

    public OtherPayerOtherOperatingPhysician withNm102OtherPayerOtherOperatingPhysician(String nm102OtherPayerOtherOperatingPhysician) {
        this.nm102OtherPayerOtherOperatingPhysician = nm102OtherPayerOtherOperatingPhysician;
        return this;
    }

    @JsonProperty("ref_otherPayerOtherOperatingSecondaryIdentifier")
    public List<RefOtherPayerOtherOperatingSecondaryIdentifier> getRefOtherPayerOtherOperatingSecondaryIdentifier() {
        return refOtherPayerOtherOperatingSecondaryIdentifier;
    }

    @JsonProperty("ref_otherPayerOtherOperatingSecondaryIdentifier")
    public void setRefOtherPayerOtherOperatingSecondaryIdentifier(List<RefOtherPayerOtherOperatingSecondaryIdentifier> refOtherPayerOtherOperatingSecondaryIdentifier) {
        this.refOtherPayerOtherOperatingSecondaryIdentifier = refOtherPayerOtherOperatingSecondaryIdentifier;
    }

    public OtherPayerOtherOperatingPhysician withRefOtherPayerOtherOperatingSecondaryIdentifier(List<RefOtherPayerOtherOperatingSecondaryIdentifier> refOtherPayerOtherOperatingSecondaryIdentifier) {
        this.refOtherPayerOtherOperatingSecondaryIdentifier = refOtherPayerOtherOperatingSecondaryIdentifier;
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

    public OtherPayerOtherOperatingPhysician withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherPayerOtherOperatingPhysicianQlfr).append(nm102OtherPayerOtherOperatingPhysician).append(refOtherPayerOtherOperatingSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerOtherOperatingPhysician) == false) {
            return false;
        }
        OtherPayerOtherOperatingPhysician rhs = ((OtherPayerOtherOperatingPhysician) other);
        return new EqualsBuilder().append(nm101OtherPayerOtherOperatingPhysicianQlfr, rhs.nm101OtherPayerOtherOperatingPhysicianQlfr).append(nm102OtherPayerOtherOperatingPhysician, rhs.nm102OtherPayerOtherOperatingPhysician).append(refOtherPayerOtherOperatingSecondaryIdentifier, rhs.refOtherPayerOtherOperatingSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

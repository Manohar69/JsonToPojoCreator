
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
    "nm101_otherPayerServiceFacilityLocationCode",
    "nm102_otherPayerServiceFacilityLocationQlfr",
    "ref_otherPayerServiceFacilityLocation"
})
public class OtherPayerSvcFacilityLoc {

    @JsonProperty("nm101_otherPayerServiceFacilityLocationCode")
    private String nm101OtherPayerServiceFacilityLocationCode;
    @JsonProperty("nm102_otherPayerServiceFacilityLocationQlfr")
    private String nm102OtherPayerServiceFacilityLocationQlfr;
    @JsonProperty("ref_otherPayerServiceFacilityLocation")
    private List<RefOtherPayerServiceFacilityLocation> refOtherPayerServiceFacilityLocation = new ArrayList<RefOtherPayerServiceFacilityLocation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_otherPayerServiceFacilityLocationCode")
    public String getNm101OtherPayerServiceFacilityLocationCode() {
        return nm101OtherPayerServiceFacilityLocationCode;
    }

    @JsonProperty("nm101_otherPayerServiceFacilityLocationCode")
    public void setNm101OtherPayerServiceFacilityLocationCode(String nm101OtherPayerServiceFacilityLocationCode) {
        this.nm101OtherPayerServiceFacilityLocationCode = nm101OtherPayerServiceFacilityLocationCode;
    }

    public OtherPayerSvcFacilityLoc withNm101OtherPayerServiceFacilityLocationCode(String nm101OtherPayerServiceFacilityLocationCode) {
        this.nm101OtherPayerServiceFacilityLocationCode = nm101OtherPayerServiceFacilityLocationCode;
        return this;
    }

    @JsonProperty("nm102_otherPayerServiceFacilityLocationQlfr")
    public String getNm102OtherPayerServiceFacilityLocationQlfr() {
        return nm102OtherPayerServiceFacilityLocationQlfr;
    }

    @JsonProperty("nm102_otherPayerServiceFacilityLocationQlfr")
    public void setNm102OtherPayerServiceFacilityLocationQlfr(String nm102OtherPayerServiceFacilityLocationQlfr) {
        this.nm102OtherPayerServiceFacilityLocationQlfr = nm102OtherPayerServiceFacilityLocationQlfr;
    }

    public OtherPayerSvcFacilityLoc withNm102OtherPayerServiceFacilityLocationQlfr(String nm102OtherPayerServiceFacilityLocationQlfr) {
        this.nm102OtherPayerServiceFacilityLocationQlfr = nm102OtherPayerServiceFacilityLocationQlfr;
        return this;
    }

    @JsonProperty("ref_otherPayerServiceFacilityLocation")
    public List<RefOtherPayerServiceFacilityLocation> getRefOtherPayerServiceFacilityLocation() {
        return refOtherPayerServiceFacilityLocation;
    }

    @JsonProperty("ref_otherPayerServiceFacilityLocation")
    public void setRefOtherPayerServiceFacilityLocation(List<RefOtherPayerServiceFacilityLocation> refOtherPayerServiceFacilityLocation) {
        this.refOtherPayerServiceFacilityLocation = refOtherPayerServiceFacilityLocation;
    }

    public OtherPayerSvcFacilityLoc withRefOtherPayerServiceFacilityLocation(List<RefOtherPayerServiceFacilityLocation> refOtherPayerServiceFacilityLocation) {
        this.refOtherPayerServiceFacilityLocation = refOtherPayerServiceFacilityLocation;
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

    public OtherPayerSvcFacilityLoc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101OtherPayerServiceFacilityLocationCode).append(nm102OtherPayerServiceFacilityLocationQlfr).append(refOtherPayerServiceFacilityLocation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerSvcFacilityLoc) == false) {
            return false;
        }
        OtherPayerSvcFacilityLoc rhs = ((OtherPayerSvcFacilityLoc) other);
        return new EqualsBuilder().append(nm101OtherPayerServiceFacilityLocationCode, rhs.nm101OtherPayerServiceFacilityLocationCode).append(nm102OtherPayerServiceFacilityLocationQlfr, rhs.nm102OtherPayerServiceFacilityLocationQlfr).append(refOtherPayerServiceFacilityLocation, rhs.refOtherPayerServiceFacilityLocation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

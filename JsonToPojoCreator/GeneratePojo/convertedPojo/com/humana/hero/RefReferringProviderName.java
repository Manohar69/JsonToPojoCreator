
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
    "ref01_referringProviderSecondaryIdQlfr",
    "ref02_referringProviderSecondaryId"
})
public class RefReferringProviderName {

    @JsonProperty("ref01_referringProviderSecondaryIdQlfr")
    private String ref01ReferringProviderSecondaryIdQlfr;
    @JsonProperty("ref02_referringProviderSecondaryId")
    private String ref02ReferringProviderSecondaryId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_referringProviderSecondaryIdQlfr")
    public String getRef01ReferringProviderSecondaryIdQlfr() {
        return ref01ReferringProviderSecondaryIdQlfr;
    }

    @JsonProperty("ref01_referringProviderSecondaryIdQlfr")
    public void setRef01ReferringProviderSecondaryIdQlfr(String ref01ReferringProviderSecondaryIdQlfr) {
        this.ref01ReferringProviderSecondaryIdQlfr = ref01ReferringProviderSecondaryIdQlfr;
    }

    public RefReferringProviderName withRef01ReferringProviderSecondaryIdQlfr(String ref01ReferringProviderSecondaryIdQlfr) {
        this.ref01ReferringProviderSecondaryIdQlfr = ref01ReferringProviderSecondaryIdQlfr;
        return this;
    }

    @JsonProperty("ref02_referringProviderSecondaryId")
    public String getRef02ReferringProviderSecondaryId() {
        return ref02ReferringProviderSecondaryId;
    }

    @JsonProperty("ref02_referringProviderSecondaryId")
    public void setRef02ReferringProviderSecondaryId(String ref02ReferringProviderSecondaryId) {
        this.ref02ReferringProviderSecondaryId = ref02ReferringProviderSecondaryId;
    }

    public RefReferringProviderName withRef02ReferringProviderSecondaryId(String ref02ReferringProviderSecondaryId) {
        this.ref02ReferringProviderSecondaryId = ref02ReferringProviderSecondaryId;
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

    public RefReferringProviderName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01ReferringProviderSecondaryIdQlfr).append(ref02ReferringProviderSecondaryId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefReferringProviderName) == false) {
            return false;
        }
        RefReferringProviderName rhs = ((RefReferringProviderName) other);
        return new EqualsBuilder().append(ref01ReferringProviderSecondaryIdQlfr, rhs.ref01ReferringProviderSecondaryIdQlfr).append(ref02ReferringProviderSecondaryId, rhs.ref02ReferringProviderSecondaryId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "nm01_otherPayerAssistantSurgeon",
    "nm02_otherPayerAssistantSurgeonQlfr",
    "ref_otherPayerAssistantSurgeonSecondaryIdentifier"
})
public class OtherPayerAssistantSurgeon {

    @JsonProperty("nm01_otherPayerAssistantSurgeon")
    private String nm01OtherPayerAssistantSurgeon;
    @JsonProperty("nm02_otherPayerAssistantSurgeonQlfr")
    private String nm02OtherPayerAssistantSurgeonQlfr;
    @JsonProperty("ref_otherPayerAssistantSurgeonSecondaryIdentifier")
    private List<RefOtherPayerAssistantSurgeonSecondaryIdentifier> refOtherPayerAssistantSurgeonSecondaryIdentifier = new ArrayList<RefOtherPayerAssistantSurgeonSecondaryIdentifier>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm01_otherPayerAssistantSurgeon")
    public String getNm01OtherPayerAssistantSurgeon() {
        return nm01OtherPayerAssistantSurgeon;
    }

    @JsonProperty("nm01_otherPayerAssistantSurgeon")
    public void setNm01OtherPayerAssistantSurgeon(String nm01OtherPayerAssistantSurgeon) {
        this.nm01OtherPayerAssistantSurgeon = nm01OtherPayerAssistantSurgeon;
    }

    public OtherPayerAssistantSurgeon withNm01OtherPayerAssistantSurgeon(String nm01OtherPayerAssistantSurgeon) {
        this.nm01OtherPayerAssistantSurgeon = nm01OtherPayerAssistantSurgeon;
        return this;
    }

    @JsonProperty("nm02_otherPayerAssistantSurgeonQlfr")
    public String getNm02OtherPayerAssistantSurgeonQlfr() {
        return nm02OtherPayerAssistantSurgeonQlfr;
    }

    @JsonProperty("nm02_otherPayerAssistantSurgeonQlfr")
    public void setNm02OtherPayerAssistantSurgeonQlfr(String nm02OtherPayerAssistantSurgeonQlfr) {
        this.nm02OtherPayerAssistantSurgeonQlfr = nm02OtherPayerAssistantSurgeonQlfr;
    }

    public OtherPayerAssistantSurgeon withNm02OtherPayerAssistantSurgeonQlfr(String nm02OtherPayerAssistantSurgeonQlfr) {
        this.nm02OtherPayerAssistantSurgeonQlfr = nm02OtherPayerAssistantSurgeonQlfr;
        return this;
    }

    @JsonProperty("ref_otherPayerAssistantSurgeonSecondaryIdentifier")
    public List<RefOtherPayerAssistantSurgeonSecondaryIdentifier> getRefOtherPayerAssistantSurgeonSecondaryIdentifier() {
        return refOtherPayerAssistantSurgeonSecondaryIdentifier;
    }

    @JsonProperty("ref_otherPayerAssistantSurgeonSecondaryIdentifier")
    public void setRefOtherPayerAssistantSurgeonSecondaryIdentifier(List<RefOtherPayerAssistantSurgeonSecondaryIdentifier> refOtherPayerAssistantSurgeonSecondaryIdentifier) {
        this.refOtherPayerAssistantSurgeonSecondaryIdentifier = refOtherPayerAssistantSurgeonSecondaryIdentifier;
    }

    public OtherPayerAssistantSurgeon withRefOtherPayerAssistantSurgeonSecondaryIdentifier(List<RefOtherPayerAssistantSurgeonSecondaryIdentifier> refOtherPayerAssistantSurgeonSecondaryIdentifier) {
        this.refOtherPayerAssistantSurgeonSecondaryIdentifier = refOtherPayerAssistantSurgeonSecondaryIdentifier;
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

    public OtherPayerAssistantSurgeon withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm01OtherPayerAssistantSurgeon).append(nm02OtherPayerAssistantSurgeonQlfr).append(refOtherPayerAssistantSurgeonSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerAssistantSurgeon) == false) {
            return false;
        }
        OtherPayerAssistantSurgeon rhs = ((OtherPayerAssistantSurgeon) other);
        return new EqualsBuilder().append(nm01OtherPayerAssistantSurgeon, rhs.nm01OtherPayerAssistantSurgeon).append(nm02OtherPayerAssistantSurgeonQlfr, rhs.nm02OtherPayerAssistantSurgeonQlfr).append(refOtherPayerAssistantSurgeonSecondaryIdentifier, rhs.refOtherPayerAssistantSurgeonSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

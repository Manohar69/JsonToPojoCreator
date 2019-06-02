
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
    "ref01_renderingProviderSecondaryIdQlfr",
    "ref02_renderingProviderSecondaryId"
})
public class RefRenderingProviderName {

    @JsonProperty("ref01_renderingProviderSecondaryIdQlfr")
    private String ref01RenderingProviderSecondaryIdQlfr;
    @JsonProperty("ref02_renderingProviderSecondaryId")
    private String ref02RenderingProviderSecondaryId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_renderingProviderSecondaryIdQlfr")
    public String getRef01RenderingProviderSecondaryIdQlfr() {
        return ref01RenderingProviderSecondaryIdQlfr;
    }

    @JsonProperty("ref01_renderingProviderSecondaryIdQlfr")
    public void setRef01RenderingProviderSecondaryIdQlfr(String ref01RenderingProviderSecondaryIdQlfr) {
        this.ref01RenderingProviderSecondaryIdQlfr = ref01RenderingProviderSecondaryIdQlfr;
    }

    public RefRenderingProviderName withRef01RenderingProviderSecondaryIdQlfr(String ref01RenderingProviderSecondaryIdQlfr) {
        this.ref01RenderingProviderSecondaryIdQlfr = ref01RenderingProviderSecondaryIdQlfr;
        return this;
    }

    @JsonProperty("ref02_renderingProviderSecondaryId")
    public String getRef02RenderingProviderSecondaryId() {
        return ref02RenderingProviderSecondaryId;
    }

    @JsonProperty("ref02_renderingProviderSecondaryId")
    public void setRef02RenderingProviderSecondaryId(String ref02RenderingProviderSecondaryId) {
        this.ref02RenderingProviderSecondaryId = ref02RenderingProviderSecondaryId;
    }

    public RefRenderingProviderName withRef02RenderingProviderSecondaryId(String ref02RenderingProviderSecondaryId) {
        this.ref02RenderingProviderSecondaryId = ref02RenderingProviderSecondaryId;
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

    public RefRenderingProviderName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01RenderingProviderSecondaryIdQlfr).append(ref02RenderingProviderSecondaryId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefRenderingProviderName) == false) {
            return false;
        }
        RefRenderingProviderName rhs = ((RefRenderingProviderName) other);
        return new EqualsBuilder().append(ref01RenderingProviderSecondaryIdQlfr, rhs.ref01RenderingProviderSecondaryIdQlfr).append(ref02RenderingProviderSecondaryId, rhs.ref02RenderingProviderSecondaryId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

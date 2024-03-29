
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
    "nm_otherPayerReferringProvider"
})
public class OtherPayerRefPrv {

    @JsonProperty("nm_otherPayerReferringProvider")
    private List<NmOtherPayerReferringProvider> nmOtherPayerReferringProvider = new ArrayList<NmOtherPayerReferringProvider>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm_otherPayerReferringProvider")
    public List<NmOtherPayerReferringProvider> getNmOtherPayerReferringProvider() {
        return nmOtherPayerReferringProvider;
    }

    @JsonProperty("nm_otherPayerReferringProvider")
    public void setNmOtherPayerReferringProvider(List<NmOtherPayerReferringProvider> nmOtherPayerReferringProvider) {
        this.nmOtherPayerReferringProvider = nmOtherPayerReferringProvider;
    }

    public OtherPayerRefPrv withNmOtherPayerReferringProvider(List<NmOtherPayerReferringProvider> nmOtherPayerReferringProvider) {
        this.nmOtherPayerReferringProvider = nmOtherPayerReferringProvider;
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

    public OtherPayerRefPrv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nmOtherPayerReferringProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerRefPrv) == false) {
            return false;
        }
        OtherPayerRefPrv rhs = ((OtherPayerRefPrv) other);
        return new EqualsBuilder().append(nmOtherPayerReferringProvider, rhs.nmOtherPayerReferringProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

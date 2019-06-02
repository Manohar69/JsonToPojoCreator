
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
    "nm01_otherPayerSupervisingProviderCode",
    "nm02_otherPayerSupervisingProviderCodeQlfr",
    "ref_otherPayerSupervisingProvider"
})
public class OtherPayerSupervisingProvider {

    @JsonProperty("nm01_otherPayerSupervisingProviderCode")
    private String nm01OtherPayerSupervisingProviderCode;
    @JsonProperty("nm02_otherPayerSupervisingProviderCodeQlfr")
    private String nm02OtherPayerSupervisingProviderCodeQlfr;
    @JsonProperty("ref_otherPayerSupervisingProvider")
    private List<RefOtherPayerSupervisingProvider> refOtherPayerSupervisingProvider = new ArrayList<RefOtherPayerSupervisingProvider>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm01_otherPayerSupervisingProviderCode")
    public String getNm01OtherPayerSupervisingProviderCode() {
        return nm01OtherPayerSupervisingProviderCode;
    }

    @JsonProperty("nm01_otherPayerSupervisingProviderCode")
    public void setNm01OtherPayerSupervisingProviderCode(String nm01OtherPayerSupervisingProviderCode) {
        this.nm01OtherPayerSupervisingProviderCode = nm01OtherPayerSupervisingProviderCode;
    }

    public OtherPayerSupervisingProvider withNm01OtherPayerSupervisingProviderCode(String nm01OtherPayerSupervisingProviderCode) {
        this.nm01OtherPayerSupervisingProviderCode = nm01OtherPayerSupervisingProviderCode;
        return this;
    }

    @JsonProperty("nm02_otherPayerSupervisingProviderCodeQlfr")
    public String getNm02OtherPayerSupervisingProviderCodeQlfr() {
        return nm02OtherPayerSupervisingProviderCodeQlfr;
    }

    @JsonProperty("nm02_otherPayerSupervisingProviderCodeQlfr")
    public void setNm02OtherPayerSupervisingProviderCodeQlfr(String nm02OtherPayerSupervisingProviderCodeQlfr) {
        this.nm02OtherPayerSupervisingProviderCodeQlfr = nm02OtherPayerSupervisingProviderCodeQlfr;
    }

    public OtherPayerSupervisingProvider withNm02OtherPayerSupervisingProviderCodeQlfr(String nm02OtherPayerSupervisingProviderCodeQlfr) {
        this.nm02OtherPayerSupervisingProviderCodeQlfr = nm02OtherPayerSupervisingProviderCodeQlfr;
        return this;
    }

    @JsonProperty("ref_otherPayerSupervisingProvider")
    public List<RefOtherPayerSupervisingProvider> getRefOtherPayerSupervisingProvider() {
        return refOtherPayerSupervisingProvider;
    }

    @JsonProperty("ref_otherPayerSupervisingProvider")
    public void setRefOtherPayerSupervisingProvider(List<RefOtherPayerSupervisingProvider> refOtherPayerSupervisingProvider) {
        this.refOtherPayerSupervisingProvider = refOtherPayerSupervisingProvider;
    }

    public OtherPayerSupervisingProvider withRefOtherPayerSupervisingProvider(List<RefOtherPayerSupervisingProvider> refOtherPayerSupervisingProvider) {
        this.refOtherPayerSupervisingProvider = refOtherPayerSupervisingProvider;
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

    public OtherPayerSupervisingProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm01OtherPayerSupervisingProviderCode).append(nm02OtherPayerSupervisingProviderCodeQlfr).append(refOtherPayerSupervisingProvider).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherPayerSupervisingProvider) == false) {
            return false;
        }
        OtherPayerSupervisingProvider rhs = ((OtherPayerSupervisingProvider) other);
        return new EqualsBuilder().append(nm01OtherPayerSupervisingProviderCode, rhs.nm01OtherPayerSupervisingProviderCode).append(nm02OtherPayerSupervisingProviderCodeQlfr, rhs.nm02OtherPayerSupervisingProviderCodeQlfr).append(refOtherPayerSupervisingProvider, rhs.refOtherPayerSupervisingProvider).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

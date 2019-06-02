
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
    "ref01_payerIdentificationQlfr",
    "ref02_payerIdentification"
})
public class RefPayerSecondaryIdentification {

    @JsonProperty("ref01_payerIdentificationQlfr")
    private String ref01PayerIdentificationQlfr;
    @JsonProperty("ref02_payerIdentification")
    private String ref02PayerIdentification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_payerIdentificationQlfr")
    public String getRef01PayerIdentificationQlfr() {
        return ref01PayerIdentificationQlfr;
    }

    @JsonProperty("ref01_payerIdentificationQlfr")
    public void setRef01PayerIdentificationQlfr(String ref01PayerIdentificationQlfr) {
        this.ref01PayerIdentificationQlfr = ref01PayerIdentificationQlfr;
    }

    public RefPayerSecondaryIdentification withRef01PayerIdentificationQlfr(String ref01PayerIdentificationQlfr) {
        this.ref01PayerIdentificationQlfr = ref01PayerIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_payerIdentification")
    public String getRef02PayerIdentification() {
        return ref02PayerIdentification;
    }

    @JsonProperty("ref02_payerIdentification")
    public void setRef02PayerIdentification(String ref02PayerIdentification) {
        this.ref02PayerIdentification = ref02PayerIdentification;
    }

    public RefPayerSecondaryIdentification withRef02PayerIdentification(String ref02PayerIdentification) {
        this.ref02PayerIdentification = ref02PayerIdentification;
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

    public RefPayerSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01PayerIdentificationQlfr).append(ref02PayerIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefPayerSecondaryIdentification) == false) {
            return false;
        }
        RefPayerSecondaryIdentification rhs = ((RefPayerSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01PayerIdentificationQlfr, rhs.ref01PayerIdentificationQlfr).append(ref02PayerIdentification, rhs.ref02PayerIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

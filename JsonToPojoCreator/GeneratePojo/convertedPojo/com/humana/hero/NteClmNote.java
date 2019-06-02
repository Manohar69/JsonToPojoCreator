
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
    "nte01_clmNoteReferenceCode",
    "nte02_claimNoteText"
})
public class NteClmNote {

    @JsonProperty("nte01_clmNoteReferenceCode")
    private String nte01ClmNoteReferenceCode;
    @JsonProperty("nte02_claimNoteText")
    private String nte02ClaimNoteText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nte01_clmNoteReferenceCode")
    public String getNte01ClmNoteReferenceCode() {
        return nte01ClmNoteReferenceCode;
    }

    @JsonProperty("nte01_clmNoteReferenceCode")
    public void setNte01ClmNoteReferenceCode(String nte01ClmNoteReferenceCode) {
        this.nte01ClmNoteReferenceCode = nte01ClmNoteReferenceCode;
    }

    public NteClmNote withNte01ClmNoteReferenceCode(String nte01ClmNoteReferenceCode) {
        this.nte01ClmNoteReferenceCode = nte01ClmNoteReferenceCode;
        return this;
    }

    @JsonProperty("nte02_claimNoteText")
    public String getNte02ClaimNoteText() {
        return nte02ClaimNoteText;
    }

    @JsonProperty("nte02_claimNoteText")
    public void setNte02ClaimNoteText(String nte02ClaimNoteText) {
        this.nte02ClaimNoteText = nte02ClaimNoteText;
    }

    public NteClmNote withNte02ClaimNoteText(String nte02ClaimNoteText) {
        this.nte02ClaimNoteText = nte02ClaimNoteText;
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

    public NteClmNote withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nte01ClmNoteReferenceCode).append(nte02ClaimNoteText).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NteClmNote) == false) {
            return false;
        }
        NteClmNote rhs = ((NteClmNote) other);
        return new EqualsBuilder().append(nte01ClmNoteReferenceCode, rhs.nte01ClmNoteReferenceCode).append(nte02ClaimNoteText, rhs.nte02ClaimNoteText).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

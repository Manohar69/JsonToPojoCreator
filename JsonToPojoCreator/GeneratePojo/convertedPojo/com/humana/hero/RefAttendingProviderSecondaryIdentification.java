
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
    "ref01_attendingProviderSecondaryIdentificationQlfr",
    "ref02_attendingProviderSecondaryIdentifier"
})
public class RefAttendingProviderSecondaryIdentification {

    @JsonProperty("ref01_attendingProviderSecondaryIdentificationQlfr")
    private String ref01AttendingProviderSecondaryIdentificationQlfr;
    @JsonProperty("ref02_attendingProviderSecondaryIdentifier")
    private String ref02AttendingProviderSecondaryIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref01_attendingProviderSecondaryIdentificationQlfr")
    public String getRef01AttendingProviderSecondaryIdentificationQlfr() {
        return ref01AttendingProviderSecondaryIdentificationQlfr;
    }

    @JsonProperty("ref01_attendingProviderSecondaryIdentificationQlfr")
    public void setRef01AttendingProviderSecondaryIdentificationQlfr(String ref01AttendingProviderSecondaryIdentificationQlfr) {
        this.ref01AttendingProviderSecondaryIdentificationQlfr = ref01AttendingProviderSecondaryIdentificationQlfr;
    }

    public RefAttendingProviderSecondaryIdentification withRef01AttendingProviderSecondaryIdentificationQlfr(String ref01AttendingProviderSecondaryIdentificationQlfr) {
        this.ref01AttendingProviderSecondaryIdentificationQlfr = ref01AttendingProviderSecondaryIdentificationQlfr;
        return this;
    }

    @JsonProperty("ref02_attendingProviderSecondaryIdentifier")
    public String getRef02AttendingProviderSecondaryIdentifier() {
        return ref02AttendingProviderSecondaryIdentifier;
    }

    @JsonProperty("ref02_attendingProviderSecondaryIdentifier")
    public void setRef02AttendingProviderSecondaryIdentifier(String ref02AttendingProviderSecondaryIdentifier) {
        this.ref02AttendingProviderSecondaryIdentifier = ref02AttendingProviderSecondaryIdentifier;
    }

    public RefAttendingProviderSecondaryIdentification withRef02AttendingProviderSecondaryIdentifier(String ref02AttendingProviderSecondaryIdentifier) {
        this.ref02AttendingProviderSecondaryIdentifier = ref02AttendingProviderSecondaryIdentifier;
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

    public RefAttendingProviderSecondaryIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref01AttendingProviderSecondaryIdentificationQlfr).append(ref02AttendingProviderSecondaryIdentifier).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefAttendingProviderSecondaryIdentification) == false) {
            return false;
        }
        RefAttendingProviderSecondaryIdentification rhs = ((RefAttendingProviderSecondaryIdentification) other);
        return new EqualsBuilder().append(ref01AttendingProviderSecondaryIdentificationQlfr, rhs.ref01AttendingProviderSecondaryIdentificationQlfr).append(ref02AttendingProviderSecondaryIdentifier, rhs.ref02AttendingProviderSecondaryIdentifier).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

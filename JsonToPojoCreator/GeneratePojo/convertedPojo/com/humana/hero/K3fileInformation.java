
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
    "k301_fileInformation"
})
public class K3fileInformation {

    @JsonProperty("k301_fileInformation")
    private String k301FileInformation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("k301_fileInformation")
    public String getK301FileInformation() {
        return k301FileInformation;
    }

    @JsonProperty("k301_fileInformation")
    public void setK301FileInformation(String k301FileInformation) {
        this.k301FileInformation = k301FileInformation;
    }

    public K3fileInformation withK301FileInformation(String k301FileInformation) {
        this.k301FileInformation = k301FileInformation;
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

    public K3fileInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(k301FileInformation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof K3fileInformation) == false) {
            return false;
        }
        K3fileInformation rhs = ((K3fileInformation) other);
        return new EqualsBuilder().append(k301FileInformation, rhs.k301FileInformation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

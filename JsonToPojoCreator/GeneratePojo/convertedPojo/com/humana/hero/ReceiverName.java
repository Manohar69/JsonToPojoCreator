
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
    "nm101_receiverIdentifierCode",
    "nm102_receiverTypeQlfr",
    "nm103_receiverLastOrOrganizationName",
    "nm108_receiverIdCodeQlfr",
    "nm109_receiverIdCode"
})
public class ReceiverName {

    @JsonProperty("nm101_receiverIdentifierCode")
    private String nm101ReceiverIdentifierCode;
    @JsonProperty("nm102_receiverTypeQlfr")
    private String nm102ReceiverTypeQlfr;
    @JsonProperty("nm103_receiverLastOrOrganizationName")
    private String nm103ReceiverLastOrOrganizationName;
    @JsonProperty("nm108_receiverIdCodeQlfr")
    private String nm108ReceiverIdCodeQlfr;
    @JsonProperty("nm109_receiverIdCode")
    private String nm109ReceiverIdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_receiverIdentifierCode")
    public String getNm101ReceiverIdentifierCode() {
        return nm101ReceiverIdentifierCode;
    }

    @JsonProperty("nm101_receiverIdentifierCode")
    public void setNm101ReceiverIdentifierCode(String nm101ReceiverIdentifierCode) {
        this.nm101ReceiverIdentifierCode = nm101ReceiverIdentifierCode;
    }

    public ReceiverName withNm101ReceiverIdentifierCode(String nm101ReceiverIdentifierCode) {
        this.nm101ReceiverIdentifierCode = nm101ReceiverIdentifierCode;
        return this;
    }

    @JsonProperty("nm102_receiverTypeQlfr")
    public String getNm102ReceiverTypeQlfr() {
        return nm102ReceiverTypeQlfr;
    }

    @JsonProperty("nm102_receiverTypeQlfr")
    public void setNm102ReceiverTypeQlfr(String nm102ReceiverTypeQlfr) {
        this.nm102ReceiverTypeQlfr = nm102ReceiverTypeQlfr;
    }

    public ReceiverName withNm102ReceiverTypeQlfr(String nm102ReceiverTypeQlfr) {
        this.nm102ReceiverTypeQlfr = nm102ReceiverTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_receiverLastOrOrganizationName")
    public String getNm103ReceiverLastOrOrganizationName() {
        return nm103ReceiverLastOrOrganizationName;
    }

    @JsonProperty("nm103_receiverLastOrOrganizationName")
    public void setNm103ReceiverLastOrOrganizationName(String nm103ReceiverLastOrOrganizationName) {
        this.nm103ReceiverLastOrOrganizationName = nm103ReceiverLastOrOrganizationName;
    }

    public ReceiverName withNm103ReceiverLastOrOrganizationName(String nm103ReceiverLastOrOrganizationName) {
        this.nm103ReceiverLastOrOrganizationName = nm103ReceiverLastOrOrganizationName;
        return this;
    }

    @JsonProperty("nm108_receiverIdCodeQlfr")
    public String getNm108ReceiverIdCodeQlfr() {
        return nm108ReceiverIdCodeQlfr;
    }

    @JsonProperty("nm108_receiverIdCodeQlfr")
    public void setNm108ReceiverIdCodeQlfr(String nm108ReceiverIdCodeQlfr) {
        this.nm108ReceiverIdCodeQlfr = nm108ReceiverIdCodeQlfr;
    }

    public ReceiverName withNm108ReceiverIdCodeQlfr(String nm108ReceiverIdCodeQlfr) {
        this.nm108ReceiverIdCodeQlfr = nm108ReceiverIdCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_receiverIdCode")
    public String getNm109ReceiverIdCode() {
        return nm109ReceiverIdCode;
    }

    @JsonProperty("nm109_receiverIdCode")
    public void setNm109ReceiverIdCode(String nm109ReceiverIdCode) {
        this.nm109ReceiverIdCode = nm109ReceiverIdCode;
    }

    public ReceiverName withNm109ReceiverIdCode(String nm109ReceiverIdCode) {
        this.nm109ReceiverIdCode = nm109ReceiverIdCode;
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

    public ReceiverName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101ReceiverIdentifierCode).append(nm102ReceiverTypeQlfr).append(nm103ReceiverLastOrOrganizationName).append(nm108ReceiverIdCodeQlfr).append(nm109ReceiverIdCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiverName) == false) {
            return false;
        }
        ReceiverName rhs = ((ReceiverName) other);
        return new EqualsBuilder().append(nm101ReceiverIdentifierCode, rhs.nm101ReceiverIdentifierCode).append(nm102ReceiverTypeQlfr, rhs.nm102ReceiverTypeQlfr).append(nm103ReceiverLastOrOrganizationName, rhs.nm103ReceiverLastOrOrganizationName).append(nm108ReceiverIdCodeQlfr, rhs.nm108ReceiverIdCodeQlfr).append(nm109ReceiverIdCode, rhs.nm109ReceiverIdCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

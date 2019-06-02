
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
    "nm101_submitterIdentifierCode",
    "nm102_submitterTypeQlfr",
    "nm103_submitterLastOrOrganizationName",
    "nm104_submitterFirstName",
    "nm105_submitterMiddleName",
    "nm108_submitterIdCodeQlfr",
    "nm109_submitterIdCode",
    "per_submitterEDIContactInfo"
})
public class SubmitterName {

    @JsonProperty("nm101_submitterIdentifierCode")
    private String nm101SubmitterIdentifierCode;
    @JsonProperty("nm102_submitterTypeQlfr")
    private String nm102SubmitterTypeQlfr;
    @JsonProperty("nm103_submitterLastOrOrganizationName")
    private String nm103SubmitterLastOrOrganizationName;
    @JsonProperty("nm104_submitterFirstName")
    private String nm104SubmitterFirstName;
    @JsonProperty("nm105_submitterMiddleName")
    private String nm105SubmitterMiddleName;
    @JsonProperty("nm108_submitterIdCodeQlfr")
    private String nm108SubmitterIdCodeQlfr;
    @JsonProperty("nm109_submitterIdCode")
    private String nm109SubmitterIdCode;
    @JsonProperty("per_submitterEDIContactInfo")
    private List<PerSubmitterEDIContactInfo> perSubmitterEDIContactInfo = new ArrayList<PerSubmitterEDIContactInfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_submitterIdentifierCode")
    public String getNm101SubmitterIdentifierCode() {
        return nm101SubmitterIdentifierCode;
    }

    @JsonProperty("nm101_submitterIdentifierCode")
    public void setNm101SubmitterIdentifierCode(String nm101SubmitterIdentifierCode) {
        this.nm101SubmitterIdentifierCode = nm101SubmitterIdentifierCode;
    }

    public SubmitterName withNm101SubmitterIdentifierCode(String nm101SubmitterIdentifierCode) {
        this.nm101SubmitterIdentifierCode = nm101SubmitterIdentifierCode;
        return this;
    }

    @JsonProperty("nm102_submitterTypeQlfr")
    public String getNm102SubmitterTypeQlfr() {
        return nm102SubmitterTypeQlfr;
    }

    @JsonProperty("nm102_submitterTypeQlfr")
    public void setNm102SubmitterTypeQlfr(String nm102SubmitterTypeQlfr) {
        this.nm102SubmitterTypeQlfr = nm102SubmitterTypeQlfr;
    }

    public SubmitterName withNm102SubmitterTypeQlfr(String nm102SubmitterTypeQlfr) {
        this.nm102SubmitterTypeQlfr = nm102SubmitterTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_submitterLastOrOrganizationName")
    public String getNm103SubmitterLastOrOrganizationName() {
        return nm103SubmitterLastOrOrganizationName;
    }

    @JsonProperty("nm103_submitterLastOrOrganizationName")
    public void setNm103SubmitterLastOrOrganizationName(String nm103SubmitterLastOrOrganizationName) {
        this.nm103SubmitterLastOrOrganizationName = nm103SubmitterLastOrOrganizationName;
    }

    public SubmitterName withNm103SubmitterLastOrOrganizationName(String nm103SubmitterLastOrOrganizationName) {
        this.nm103SubmitterLastOrOrganizationName = nm103SubmitterLastOrOrganizationName;
        return this;
    }

    @JsonProperty("nm104_submitterFirstName")
    public String getNm104SubmitterFirstName() {
        return nm104SubmitterFirstName;
    }

    @JsonProperty("nm104_submitterFirstName")
    public void setNm104SubmitterFirstName(String nm104SubmitterFirstName) {
        this.nm104SubmitterFirstName = nm104SubmitterFirstName;
    }

    public SubmitterName withNm104SubmitterFirstName(String nm104SubmitterFirstName) {
        this.nm104SubmitterFirstName = nm104SubmitterFirstName;
        return this;
    }

    @JsonProperty("nm105_submitterMiddleName")
    public String getNm105SubmitterMiddleName() {
        return nm105SubmitterMiddleName;
    }

    @JsonProperty("nm105_submitterMiddleName")
    public void setNm105SubmitterMiddleName(String nm105SubmitterMiddleName) {
        this.nm105SubmitterMiddleName = nm105SubmitterMiddleName;
    }

    public SubmitterName withNm105SubmitterMiddleName(String nm105SubmitterMiddleName) {
        this.nm105SubmitterMiddleName = nm105SubmitterMiddleName;
        return this;
    }

    @JsonProperty("nm108_submitterIdCodeQlfr")
    public String getNm108SubmitterIdCodeQlfr() {
        return nm108SubmitterIdCodeQlfr;
    }

    @JsonProperty("nm108_submitterIdCodeQlfr")
    public void setNm108SubmitterIdCodeQlfr(String nm108SubmitterIdCodeQlfr) {
        this.nm108SubmitterIdCodeQlfr = nm108SubmitterIdCodeQlfr;
    }

    public SubmitterName withNm108SubmitterIdCodeQlfr(String nm108SubmitterIdCodeQlfr) {
        this.nm108SubmitterIdCodeQlfr = nm108SubmitterIdCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_submitterIdCode")
    public String getNm109SubmitterIdCode() {
        return nm109SubmitterIdCode;
    }

    @JsonProperty("nm109_submitterIdCode")
    public void setNm109SubmitterIdCode(String nm109SubmitterIdCode) {
        this.nm109SubmitterIdCode = nm109SubmitterIdCode;
    }

    public SubmitterName withNm109SubmitterIdCode(String nm109SubmitterIdCode) {
        this.nm109SubmitterIdCode = nm109SubmitterIdCode;
        return this;
    }

    @JsonProperty("per_submitterEDIContactInfo")
    public List<PerSubmitterEDIContactInfo> getPerSubmitterEDIContactInfo() {
        return perSubmitterEDIContactInfo;
    }

    @JsonProperty("per_submitterEDIContactInfo")
    public void setPerSubmitterEDIContactInfo(List<PerSubmitterEDIContactInfo> perSubmitterEDIContactInfo) {
        this.perSubmitterEDIContactInfo = perSubmitterEDIContactInfo;
    }

    public SubmitterName withPerSubmitterEDIContactInfo(List<PerSubmitterEDIContactInfo> perSubmitterEDIContactInfo) {
        this.perSubmitterEDIContactInfo = perSubmitterEDIContactInfo;
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

    public SubmitterName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101SubmitterIdentifierCode).append(nm102SubmitterTypeQlfr).append(nm103SubmitterLastOrOrganizationName).append(nm104SubmitterFirstName).append(nm105SubmitterMiddleName).append(nm108SubmitterIdCodeQlfr).append(nm109SubmitterIdCode).append(perSubmitterEDIContactInfo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubmitterName) == false) {
            return false;
        }
        SubmitterName rhs = ((SubmitterName) other);
        return new EqualsBuilder().append(nm101SubmitterIdentifierCode, rhs.nm101SubmitterIdentifierCode).append(nm102SubmitterTypeQlfr, rhs.nm102SubmitterTypeQlfr).append(nm103SubmitterLastOrOrganizationName, rhs.nm103SubmitterLastOrOrganizationName).append(nm104SubmitterFirstName, rhs.nm104SubmitterFirstName).append(nm105SubmitterMiddleName, rhs.nm105SubmitterMiddleName).append(nm108SubmitterIdCodeQlfr, rhs.nm108SubmitterIdCodeQlfr).append(nm109SubmitterIdCode, rhs.nm109SubmitterIdCode).append(perSubmitterEDIContactInfo, rhs.perSubmitterEDIContactInfo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

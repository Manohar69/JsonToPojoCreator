
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
    "nm101_assistantSurgeonIdentificationCode",
    "nm102_assistantSurgeonTypeQlfr",
    "nm103_assistantSurgeonLastName",
    "nm104_assistantSurgeonFirstName",
    "nm105_assistantSurgeonMiddleName",
    "nm107_assistantSurgeonSuffix",
    "nm108_assistantSurgeonIdentifierQlfr",
    "nm109_assistantSurgeonPrimaryIdentifier",
    "prv01_assistantSurgeonProviderCode",
    "prv02_assistantSurgeonProviderTaxonomyCodeQlfr",
    "prv03_assistantSurgeonProviderTaxonomyCode",
    "ref_assistantSurgeonSecondaryIdentification"
})
public class AssistantSurgeonName {

    @JsonProperty("nm101_assistantSurgeonIdentificationCode")
    private String nm101AssistantSurgeonIdentificationCode;
    @JsonProperty("nm102_assistantSurgeonTypeQlfr")
    private String nm102AssistantSurgeonTypeQlfr;
    @JsonProperty("nm103_assistantSurgeonLastName")
    private String nm103AssistantSurgeonLastName;
    @JsonProperty("nm104_assistantSurgeonFirstName")
    private String nm104AssistantSurgeonFirstName;
    @JsonProperty("nm105_assistantSurgeonMiddleName")
    private String nm105AssistantSurgeonMiddleName;
    @JsonProperty("nm107_assistantSurgeonSuffix")
    private String nm107AssistantSurgeonSuffix;
    @JsonProperty("nm108_assistantSurgeonIdentifierQlfr")
    private String nm108AssistantSurgeonIdentifierQlfr;
    @JsonProperty("nm109_assistantSurgeonPrimaryIdentifier")
    private String nm109AssistantSurgeonPrimaryIdentifier;
    @JsonProperty("prv01_assistantSurgeonProviderCode")
    private String prv01AssistantSurgeonProviderCode;
    @JsonProperty("prv02_assistantSurgeonProviderTaxonomyCodeQlfr")
    private String prv02AssistantSurgeonProviderTaxonomyCodeQlfr;
    @JsonProperty("prv03_assistantSurgeonProviderTaxonomyCode")
    private String prv03AssistantSurgeonProviderTaxonomyCode;
    @JsonProperty("ref_assistantSurgeonSecondaryIdentification")
    private List<RefAssistantSurgeonSecondaryIdentification> refAssistantSurgeonSecondaryIdentification = new ArrayList<RefAssistantSurgeonSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_assistantSurgeonIdentificationCode")
    public String getNm101AssistantSurgeonIdentificationCode() {
        return nm101AssistantSurgeonIdentificationCode;
    }

    @JsonProperty("nm101_assistantSurgeonIdentificationCode")
    public void setNm101AssistantSurgeonIdentificationCode(String nm101AssistantSurgeonIdentificationCode) {
        this.nm101AssistantSurgeonIdentificationCode = nm101AssistantSurgeonIdentificationCode;
    }

    public AssistantSurgeonName withNm101AssistantSurgeonIdentificationCode(String nm101AssistantSurgeonIdentificationCode) {
        this.nm101AssistantSurgeonIdentificationCode = nm101AssistantSurgeonIdentificationCode;
        return this;
    }

    @JsonProperty("nm102_assistantSurgeonTypeQlfr")
    public String getNm102AssistantSurgeonTypeQlfr() {
        return nm102AssistantSurgeonTypeQlfr;
    }

    @JsonProperty("nm102_assistantSurgeonTypeQlfr")
    public void setNm102AssistantSurgeonTypeQlfr(String nm102AssistantSurgeonTypeQlfr) {
        this.nm102AssistantSurgeonTypeQlfr = nm102AssistantSurgeonTypeQlfr;
    }

    public AssistantSurgeonName withNm102AssistantSurgeonTypeQlfr(String nm102AssistantSurgeonTypeQlfr) {
        this.nm102AssistantSurgeonTypeQlfr = nm102AssistantSurgeonTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_assistantSurgeonLastName")
    public String getNm103AssistantSurgeonLastName() {
        return nm103AssistantSurgeonLastName;
    }

    @JsonProperty("nm103_assistantSurgeonLastName")
    public void setNm103AssistantSurgeonLastName(String nm103AssistantSurgeonLastName) {
        this.nm103AssistantSurgeonLastName = nm103AssistantSurgeonLastName;
    }

    public AssistantSurgeonName withNm103AssistantSurgeonLastName(String nm103AssistantSurgeonLastName) {
        this.nm103AssistantSurgeonLastName = nm103AssistantSurgeonLastName;
        return this;
    }

    @JsonProperty("nm104_assistantSurgeonFirstName")
    public String getNm104AssistantSurgeonFirstName() {
        return nm104AssistantSurgeonFirstName;
    }

    @JsonProperty("nm104_assistantSurgeonFirstName")
    public void setNm104AssistantSurgeonFirstName(String nm104AssistantSurgeonFirstName) {
        this.nm104AssistantSurgeonFirstName = nm104AssistantSurgeonFirstName;
    }

    public AssistantSurgeonName withNm104AssistantSurgeonFirstName(String nm104AssistantSurgeonFirstName) {
        this.nm104AssistantSurgeonFirstName = nm104AssistantSurgeonFirstName;
        return this;
    }

    @JsonProperty("nm105_assistantSurgeonMiddleName")
    public String getNm105AssistantSurgeonMiddleName() {
        return nm105AssistantSurgeonMiddleName;
    }

    @JsonProperty("nm105_assistantSurgeonMiddleName")
    public void setNm105AssistantSurgeonMiddleName(String nm105AssistantSurgeonMiddleName) {
        this.nm105AssistantSurgeonMiddleName = nm105AssistantSurgeonMiddleName;
    }

    public AssistantSurgeonName withNm105AssistantSurgeonMiddleName(String nm105AssistantSurgeonMiddleName) {
        this.nm105AssistantSurgeonMiddleName = nm105AssistantSurgeonMiddleName;
        return this;
    }

    @JsonProperty("nm107_assistantSurgeonSuffix")
    public String getNm107AssistantSurgeonSuffix() {
        return nm107AssistantSurgeonSuffix;
    }

    @JsonProperty("nm107_assistantSurgeonSuffix")
    public void setNm107AssistantSurgeonSuffix(String nm107AssistantSurgeonSuffix) {
        this.nm107AssistantSurgeonSuffix = nm107AssistantSurgeonSuffix;
    }

    public AssistantSurgeonName withNm107AssistantSurgeonSuffix(String nm107AssistantSurgeonSuffix) {
        this.nm107AssistantSurgeonSuffix = nm107AssistantSurgeonSuffix;
        return this;
    }

    @JsonProperty("nm108_assistantSurgeonIdentifierQlfr")
    public String getNm108AssistantSurgeonIdentifierQlfr() {
        return nm108AssistantSurgeonIdentifierQlfr;
    }

    @JsonProperty("nm108_assistantSurgeonIdentifierQlfr")
    public void setNm108AssistantSurgeonIdentifierQlfr(String nm108AssistantSurgeonIdentifierQlfr) {
        this.nm108AssistantSurgeonIdentifierQlfr = nm108AssistantSurgeonIdentifierQlfr;
    }

    public AssistantSurgeonName withNm108AssistantSurgeonIdentifierQlfr(String nm108AssistantSurgeonIdentifierQlfr) {
        this.nm108AssistantSurgeonIdentifierQlfr = nm108AssistantSurgeonIdentifierQlfr;
        return this;
    }

    @JsonProperty("nm109_assistantSurgeonPrimaryIdentifier")
    public String getNm109AssistantSurgeonPrimaryIdentifier() {
        return nm109AssistantSurgeonPrimaryIdentifier;
    }

    @JsonProperty("nm109_assistantSurgeonPrimaryIdentifier")
    public void setNm109AssistantSurgeonPrimaryIdentifier(String nm109AssistantSurgeonPrimaryIdentifier) {
        this.nm109AssistantSurgeonPrimaryIdentifier = nm109AssistantSurgeonPrimaryIdentifier;
    }

    public AssistantSurgeonName withNm109AssistantSurgeonPrimaryIdentifier(String nm109AssistantSurgeonPrimaryIdentifier) {
        this.nm109AssistantSurgeonPrimaryIdentifier = nm109AssistantSurgeonPrimaryIdentifier;
        return this;
    }

    @JsonProperty("prv01_assistantSurgeonProviderCode")
    public String getPrv01AssistantSurgeonProviderCode() {
        return prv01AssistantSurgeonProviderCode;
    }

    @JsonProperty("prv01_assistantSurgeonProviderCode")
    public void setPrv01AssistantSurgeonProviderCode(String prv01AssistantSurgeonProviderCode) {
        this.prv01AssistantSurgeonProviderCode = prv01AssistantSurgeonProviderCode;
    }

    public AssistantSurgeonName withPrv01AssistantSurgeonProviderCode(String prv01AssistantSurgeonProviderCode) {
        this.prv01AssistantSurgeonProviderCode = prv01AssistantSurgeonProviderCode;
        return this;
    }

    @JsonProperty("prv02_assistantSurgeonProviderTaxonomyCodeQlfr")
    public String getPrv02AssistantSurgeonProviderTaxonomyCodeQlfr() {
        return prv02AssistantSurgeonProviderTaxonomyCodeQlfr;
    }

    @JsonProperty("prv02_assistantSurgeonProviderTaxonomyCodeQlfr")
    public void setPrv02AssistantSurgeonProviderTaxonomyCodeQlfr(String prv02AssistantSurgeonProviderTaxonomyCodeQlfr) {
        this.prv02AssistantSurgeonProviderTaxonomyCodeQlfr = prv02AssistantSurgeonProviderTaxonomyCodeQlfr;
    }

    public AssistantSurgeonName withPrv02AssistantSurgeonProviderTaxonomyCodeQlfr(String prv02AssistantSurgeonProviderTaxonomyCodeQlfr) {
        this.prv02AssistantSurgeonProviderTaxonomyCodeQlfr = prv02AssistantSurgeonProviderTaxonomyCodeQlfr;
        return this;
    }

    @JsonProperty("prv03_assistantSurgeonProviderTaxonomyCode")
    public String getPrv03AssistantSurgeonProviderTaxonomyCode() {
        return prv03AssistantSurgeonProviderTaxonomyCode;
    }

    @JsonProperty("prv03_assistantSurgeonProviderTaxonomyCode")
    public void setPrv03AssistantSurgeonProviderTaxonomyCode(String prv03AssistantSurgeonProviderTaxonomyCode) {
        this.prv03AssistantSurgeonProviderTaxonomyCode = prv03AssistantSurgeonProviderTaxonomyCode;
    }

    public AssistantSurgeonName withPrv03AssistantSurgeonProviderTaxonomyCode(String prv03AssistantSurgeonProviderTaxonomyCode) {
        this.prv03AssistantSurgeonProviderTaxonomyCode = prv03AssistantSurgeonProviderTaxonomyCode;
        return this;
    }

    @JsonProperty("ref_assistantSurgeonSecondaryIdentification")
    public List<RefAssistantSurgeonSecondaryIdentification> getRefAssistantSurgeonSecondaryIdentification() {
        return refAssistantSurgeonSecondaryIdentification;
    }

    @JsonProperty("ref_assistantSurgeonSecondaryIdentification")
    public void setRefAssistantSurgeonSecondaryIdentification(List<RefAssistantSurgeonSecondaryIdentification> refAssistantSurgeonSecondaryIdentification) {
        this.refAssistantSurgeonSecondaryIdentification = refAssistantSurgeonSecondaryIdentification;
    }

    public AssistantSurgeonName withRefAssistantSurgeonSecondaryIdentification(List<RefAssistantSurgeonSecondaryIdentification> refAssistantSurgeonSecondaryIdentification) {
        this.refAssistantSurgeonSecondaryIdentification = refAssistantSurgeonSecondaryIdentification;
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

    public AssistantSurgeonName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101AssistantSurgeonIdentificationCode).append(nm102AssistantSurgeonTypeQlfr).append(nm103AssistantSurgeonLastName).append(nm104AssistantSurgeonFirstName).append(nm105AssistantSurgeonMiddleName).append(nm107AssistantSurgeonSuffix).append(nm108AssistantSurgeonIdentifierQlfr).append(nm109AssistantSurgeonPrimaryIdentifier).append(prv01AssistantSurgeonProviderCode).append(prv02AssistantSurgeonProviderTaxonomyCodeQlfr).append(prv03AssistantSurgeonProviderTaxonomyCode).append(refAssistantSurgeonSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssistantSurgeonName) == false) {
            return false;
        }
        AssistantSurgeonName rhs = ((AssistantSurgeonName) other);
        return new EqualsBuilder().append(nm101AssistantSurgeonIdentificationCode, rhs.nm101AssistantSurgeonIdentificationCode).append(nm102AssistantSurgeonTypeQlfr, rhs.nm102AssistantSurgeonTypeQlfr).append(nm103AssistantSurgeonLastName, rhs.nm103AssistantSurgeonLastName).append(nm104AssistantSurgeonFirstName, rhs.nm104AssistantSurgeonFirstName).append(nm105AssistantSurgeonMiddleName, rhs.nm105AssistantSurgeonMiddleName).append(nm107AssistantSurgeonSuffix, rhs.nm107AssistantSurgeonSuffix).append(nm108AssistantSurgeonIdentifierQlfr, rhs.nm108AssistantSurgeonIdentifierQlfr).append(nm109AssistantSurgeonPrimaryIdentifier, rhs.nm109AssistantSurgeonPrimaryIdentifier).append(prv01AssistantSurgeonProviderCode, rhs.prv01AssistantSurgeonProviderCode).append(prv02AssistantSurgeonProviderTaxonomyCodeQlfr, rhs.prv02AssistantSurgeonProviderTaxonomyCodeQlfr).append(prv03AssistantSurgeonProviderTaxonomyCode, rhs.prv03AssistantSurgeonProviderTaxonomyCode).append(refAssistantSurgeonSecondaryIdentification, rhs.refAssistantSurgeonSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

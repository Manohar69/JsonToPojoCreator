
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
    "nm101_renderingProviderIdentifierQlfr",
    "nm102_renderingProviderTypeQlfr",
    "nm103_renderingProviderLastOrOrganizationName",
    "nm104_renderingProviderFirstName",
    "nm105_renderingProviderMiddleName",
    "nm107_renderingProviderSuffix",
    "nm108_renderingProviderCodeQlfr",
    "nm109_renderingProviderIdentifier",
    "prv01_providerCode",
    "prv02_providerTaxonomyCodeQlfr",
    "prv03_providerTaxonomyCode",
    "ref_RenderingProviderName"
})
public class RendPrvName {

    @JsonProperty("nm101_renderingProviderIdentifierQlfr")
    private String nm101RenderingProviderIdentifierQlfr;
    @JsonProperty("nm102_renderingProviderTypeQlfr")
    private String nm102RenderingProviderTypeQlfr;
    @JsonProperty("nm103_renderingProviderLastOrOrganizationName")
    private String nm103RenderingProviderLastOrOrganizationName;
    @JsonProperty("nm104_renderingProviderFirstName")
    private String nm104RenderingProviderFirstName;
    @JsonProperty("nm105_renderingProviderMiddleName")
    private String nm105RenderingProviderMiddleName;
    @JsonProperty("nm107_renderingProviderSuffix")
    private String nm107RenderingProviderSuffix;
    @JsonProperty("nm108_renderingProviderCodeQlfr")
    private String nm108RenderingProviderCodeQlfr;
    @JsonProperty("nm109_renderingProviderIdentifier")
    private String nm109RenderingProviderIdentifier;
    @JsonProperty("prv01_providerCode")
    private String prv01ProviderCode;
    @JsonProperty("prv02_providerTaxonomyCodeQlfr")
    private String prv02ProviderTaxonomyCodeQlfr;
    @JsonProperty("prv03_providerTaxonomyCode")
    private String prv03ProviderTaxonomyCode;
    @JsonProperty("ref_RenderingProviderName")
    private List<RefRenderingProviderName> refRenderingProviderName = new ArrayList<RefRenderingProviderName>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_renderingProviderIdentifierQlfr")
    public String getNm101RenderingProviderIdentifierQlfr() {
        return nm101RenderingProviderIdentifierQlfr;
    }

    @JsonProperty("nm101_renderingProviderIdentifierQlfr")
    public void setNm101RenderingProviderIdentifierQlfr(String nm101RenderingProviderIdentifierQlfr) {
        this.nm101RenderingProviderIdentifierQlfr = nm101RenderingProviderIdentifierQlfr;
    }

    public RendPrvName withNm101RenderingProviderIdentifierQlfr(String nm101RenderingProviderIdentifierQlfr) {
        this.nm101RenderingProviderIdentifierQlfr = nm101RenderingProviderIdentifierQlfr;
        return this;
    }

    @JsonProperty("nm102_renderingProviderTypeQlfr")
    public String getNm102RenderingProviderTypeQlfr() {
        return nm102RenderingProviderTypeQlfr;
    }

    @JsonProperty("nm102_renderingProviderTypeQlfr")
    public void setNm102RenderingProviderTypeQlfr(String nm102RenderingProviderTypeQlfr) {
        this.nm102RenderingProviderTypeQlfr = nm102RenderingProviderTypeQlfr;
    }

    public RendPrvName withNm102RenderingProviderTypeQlfr(String nm102RenderingProviderTypeQlfr) {
        this.nm102RenderingProviderTypeQlfr = nm102RenderingProviderTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_renderingProviderLastOrOrganizationName")
    public String getNm103RenderingProviderLastOrOrganizationName() {
        return nm103RenderingProviderLastOrOrganizationName;
    }

    @JsonProperty("nm103_renderingProviderLastOrOrganizationName")
    public void setNm103RenderingProviderLastOrOrganizationName(String nm103RenderingProviderLastOrOrganizationName) {
        this.nm103RenderingProviderLastOrOrganizationName = nm103RenderingProviderLastOrOrganizationName;
    }

    public RendPrvName withNm103RenderingProviderLastOrOrganizationName(String nm103RenderingProviderLastOrOrganizationName) {
        this.nm103RenderingProviderLastOrOrganizationName = nm103RenderingProviderLastOrOrganizationName;
        return this;
    }

    @JsonProperty("nm104_renderingProviderFirstName")
    public String getNm104RenderingProviderFirstName() {
        return nm104RenderingProviderFirstName;
    }

    @JsonProperty("nm104_renderingProviderFirstName")
    public void setNm104RenderingProviderFirstName(String nm104RenderingProviderFirstName) {
        this.nm104RenderingProviderFirstName = nm104RenderingProviderFirstName;
    }

    public RendPrvName withNm104RenderingProviderFirstName(String nm104RenderingProviderFirstName) {
        this.nm104RenderingProviderFirstName = nm104RenderingProviderFirstName;
        return this;
    }

    @JsonProperty("nm105_renderingProviderMiddleName")
    public String getNm105RenderingProviderMiddleName() {
        return nm105RenderingProviderMiddleName;
    }

    @JsonProperty("nm105_renderingProviderMiddleName")
    public void setNm105RenderingProviderMiddleName(String nm105RenderingProviderMiddleName) {
        this.nm105RenderingProviderMiddleName = nm105RenderingProviderMiddleName;
    }

    public RendPrvName withNm105RenderingProviderMiddleName(String nm105RenderingProviderMiddleName) {
        this.nm105RenderingProviderMiddleName = nm105RenderingProviderMiddleName;
        return this;
    }

    @JsonProperty("nm107_renderingProviderSuffix")
    public String getNm107RenderingProviderSuffix() {
        return nm107RenderingProviderSuffix;
    }

    @JsonProperty("nm107_renderingProviderSuffix")
    public void setNm107RenderingProviderSuffix(String nm107RenderingProviderSuffix) {
        this.nm107RenderingProviderSuffix = nm107RenderingProviderSuffix;
    }

    public RendPrvName withNm107RenderingProviderSuffix(String nm107RenderingProviderSuffix) {
        this.nm107RenderingProviderSuffix = nm107RenderingProviderSuffix;
        return this;
    }

    @JsonProperty("nm108_renderingProviderCodeQlfr")
    public String getNm108RenderingProviderCodeQlfr() {
        return nm108RenderingProviderCodeQlfr;
    }

    @JsonProperty("nm108_renderingProviderCodeQlfr")
    public void setNm108RenderingProviderCodeQlfr(String nm108RenderingProviderCodeQlfr) {
        this.nm108RenderingProviderCodeQlfr = nm108RenderingProviderCodeQlfr;
    }

    public RendPrvName withNm108RenderingProviderCodeQlfr(String nm108RenderingProviderCodeQlfr) {
        this.nm108RenderingProviderCodeQlfr = nm108RenderingProviderCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_renderingProviderIdentifier")
    public String getNm109RenderingProviderIdentifier() {
        return nm109RenderingProviderIdentifier;
    }

    @JsonProperty("nm109_renderingProviderIdentifier")
    public void setNm109RenderingProviderIdentifier(String nm109RenderingProviderIdentifier) {
        this.nm109RenderingProviderIdentifier = nm109RenderingProviderIdentifier;
    }

    public RendPrvName withNm109RenderingProviderIdentifier(String nm109RenderingProviderIdentifier) {
        this.nm109RenderingProviderIdentifier = nm109RenderingProviderIdentifier;
        return this;
    }

    @JsonProperty("prv01_providerCode")
    public String getPrv01ProviderCode() {
        return prv01ProviderCode;
    }

    @JsonProperty("prv01_providerCode")
    public void setPrv01ProviderCode(String prv01ProviderCode) {
        this.prv01ProviderCode = prv01ProviderCode;
    }

    public RendPrvName withPrv01ProviderCode(String prv01ProviderCode) {
        this.prv01ProviderCode = prv01ProviderCode;
        return this;
    }

    @JsonProperty("prv02_providerTaxonomyCodeQlfr")
    public String getPrv02ProviderTaxonomyCodeQlfr() {
        return prv02ProviderTaxonomyCodeQlfr;
    }

    @JsonProperty("prv02_providerTaxonomyCodeQlfr")
    public void setPrv02ProviderTaxonomyCodeQlfr(String prv02ProviderTaxonomyCodeQlfr) {
        this.prv02ProviderTaxonomyCodeQlfr = prv02ProviderTaxonomyCodeQlfr;
    }

    public RendPrvName withPrv02ProviderTaxonomyCodeQlfr(String prv02ProviderTaxonomyCodeQlfr) {
        this.prv02ProviderTaxonomyCodeQlfr = prv02ProviderTaxonomyCodeQlfr;
        return this;
    }

    @JsonProperty("prv03_providerTaxonomyCode")
    public String getPrv03ProviderTaxonomyCode() {
        return prv03ProviderTaxonomyCode;
    }

    @JsonProperty("prv03_providerTaxonomyCode")
    public void setPrv03ProviderTaxonomyCode(String prv03ProviderTaxonomyCode) {
        this.prv03ProviderTaxonomyCode = prv03ProviderTaxonomyCode;
    }

    public RendPrvName withPrv03ProviderTaxonomyCode(String prv03ProviderTaxonomyCode) {
        this.prv03ProviderTaxonomyCode = prv03ProviderTaxonomyCode;
        return this;
    }

    @JsonProperty("ref_RenderingProviderName")
    public List<RefRenderingProviderName> getRefRenderingProviderName() {
        return refRenderingProviderName;
    }

    @JsonProperty("ref_RenderingProviderName")
    public void setRefRenderingProviderName(List<RefRenderingProviderName> refRenderingProviderName) {
        this.refRenderingProviderName = refRenderingProviderName;
    }

    public RendPrvName withRefRenderingProviderName(List<RefRenderingProviderName> refRenderingProviderName) {
        this.refRenderingProviderName = refRenderingProviderName;
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

    public RendPrvName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101RenderingProviderIdentifierQlfr).append(nm102RenderingProviderTypeQlfr).append(nm103RenderingProviderLastOrOrganizationName).append(nm104RenderingProviderFirstName).append(nm105RenderingProviderMiddleName).append(nm107RenderingProviderSuffix).append(nm108RenderingProviderCodeQlfr).append(nm109RenderingProviderIdentifier).append(prv01ProviderCode).append(prv02ProviderTaxonomyCodeQlfr).append(prv03ProviderTaxonomyCode).append(refRenderingProviderName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RendPrvName) == false) {
            return false;
        }
        RendPrvName rhs = ((RendPrvName) other);
        return new EqualsBuilder().append(nm101RenderingProviderIdentifierQlfr, rhs.nm101RenderingProviderIdentifierQlfr).append(nm102RenderingProviderTypeQlfr, rhs.nm102RenderingProviderTypeQlfr).append(nm103RenderingProviderLastOrOrganizationName, rhs.nm103RenderingProviderLastOrOrganizationName).append(nm104RenderingProviderFirstName, rhs.nm104RenderingProviderFirstName).append(nm105RenderingProviderMiddleName, rhs.nm105RenderingProviderMiddleName).append(nm107RenderingProviderSuffix, rhs.nm107RenderingProviderSuffix).append(nm108RenderingProviderCodeQlfr, rhs.nm108RenderingProviderCodeQlfr).append(nm109RenderingProviderIdentifier, rhs.nm109RenderingProviderIdentifier).append(prv01ProviderCode, rhs.prv01ProviderCode).append(prv02ProviderTaxonomyCodeQlfr, rhs.prv02ProviderTaxonomyCodeQlfr).append(prv03ProviderTaxonomyCode, rhs.prv03ProviderTaxonomyCode).append(refRenderingProviderName, rhs.refRenderingProviderName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

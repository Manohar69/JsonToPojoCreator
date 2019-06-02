
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
    "nm101_renderingProviderIdentifierCode",
    "nm102_renderingProviderTypeQlfr",
    "nm103_renderingProviderNameLastOrganizationName",
    "nm104_renderingProviderFirstName",
    "nm105_renderingProviderMiddleName",
    "nm107_renderingProviderSuffix",
    "nm108_renderingProviderIdentificationCodeQlfr",
    "nm109_renderingProviderIdentifier",
    "prv01_renderingProviderCode",
    "prv02_renderingProviderTaxonomyCodeQlfr",
    "prv03_renderingProviderTaxonomyCode",
    "ref_renderingProviderSecondaryIdentification"
})
public class RendPrvName_ {

    @JsonProperty("nm101_renderingProviderIdentifierCode")
    private String nm101RenderingProviderIdentifierCode;
    @JsonProperty("nm102_renderingProviderTypeQlfr")
    private String nm102RenderingProviderTypeQlfr;
    @JsonProperty("nm103_renderingProviderNameLastOrganizationName")
    private String nm103RenderingProviderNameLastOrganizationName;
    @JsonProperty("nm104_renderingProviderFirstName")
    private String nm104RenderingProviderFirstName;
    @JsonProperty("nm105_renderingProviderMiddleName")
    private String nm105RenderingProviderMiddleName;
    @JsonProperty("nm107_renderingProviderSuffix")
    private String nm107RenderingProviderSuffix;
    @JsonProperty("nm108_renderingProviderIdentificationCodeQlfr")
    private String nm108RenderingProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_renderingProviderIdentifier")
    private String nm109RenderingProviderIdentifier;
    @JsonProperty("prv01_renderingProviderCode")
    private String prv01RenderingProviderCode;
    @JsonProperty("prv02_renderingProviderTaxonomyCodeQlfr")
    private String prv02RenderingProviderTaxonomyCodeQlfr;
    @JsonProperty("prv03_renderingProviderTaxonomyCode")
    private String prv03RenderingProviderTaxonomyCode;
    @JsonProperty("ref_renderingProviderSecondaryIdentification")
    private List<RefRenderingProviderSecondaryIdentification> refRenderingProviderSecondaryIdentification = new ArrayList<RefRenderingProviderSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_renderingProviderIdentifierCode")
    public String getNm101RenderingProviderIdentifierCode() {
        return nm101RenderingProviderIdentifierCode;
    }

    @JsonProperty("nm101_renderingProviderIdentifierCode")
    public void setNm101RenderingProviderIdentifierCode(String nm101RenderingProviderIdentifierCode) {
        this.nm101RenderingProviderIdentifierCode = nm101RenderingProviderIdentifierCode;
    }

    public RendPrvName_ withNm101RenderingProviderIdentifierCode(String nm101RenderingProviderIdentifierCode) {
        this.nm101RenderingProviderIdentifierCode = nm101RenderingProviderIdentifierCode;
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

    public RendPrvName_ withNm102RenderingProviderTypeQlfr(String nm102RenderingProviderTypeQlfr) {
        this.nm102RenderingProviderTypeQlfr = nm102RenderingProviderTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_renderingProviderNameLastOrganizationName")
    public String getNm103RenderingProviderNameLastOrganizationName() {
        return nm103RenderingProviderNameLastOrganizationName;
    }

    @JsonProperty("nm103_renderingProviderNameLastOrganizationName")
    public void setNm103RenderingProviderNameLastOrganizationName(String nm103RenderingProviderNameLastOrganizationName) {
        this.nm103RenderingProviderNameLastOrganizationName = nm103RenderingProviderNameLastOrganizationName;
    }

    public RendPrvName_ withNm103RenderingProviderNameLastOrganizationName(String nm103RenderingProviderNameLastOrganizationName) {
        this.nm103RenderingProviderNameLastOrganizationName = nm103RenderingProviderNameLastOrganizationName;
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

    public RendPrvName_ withNm104RenderingProviderFirstName(String nm104RenderingProviderFirstName) {
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

    public RendPrvName_ withNm105RenderingProviderMiddleName(String nm105RenderingProviderMiddleName) {
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

    public RendPrvName_ withNm107RenderingProviderSuffix(String nm107RenderingProviderSuffix) {
        this.nm107RenderingProviderSuffix = nm107RenderingProviderSuffix;
        return this;
    }

    @JsonProperty("nm108_renderingProviderIdentificationCodeQlfr")
    public String getNm108RenderingProviderIdentificationCodeQlfr() {
        return nm108RenderingProviderIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_renderingProviderIdentificationCodeQlfr")
    public void setNm108RenderingProviderIdentificationCodeQlfr(String nm108RenderingProviderIdentificationCodeQlfr) {
        this.nm108RenderingProviderIdentificationCodeQlfr = nm108RenderingProviderIdentificationCodeQlfr;
    }

    public RendPrvName_ withNm108RenderingProviderIdentificationCodeQlfr(String nm108RenderingProviderIdentificationCodeQlfr) {
        this.nm108RenderingProviderIdentificationCodeQlfr = nm108RenderingProviderIdentificationCodeQlfr;
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

    public RendPrvName_ withNm109RenderingProviderIdentifier(String nm109RenderingProviderIdentifier) {
        this.nm109RenderingProviderIdentifier = nm109RenderingProviderIdentifier;
        return this;
    }

    @JsonProperty("prv01_renderingProviderCode")
    public String getPrv01RenderingProviderCode() {
        return prv01RenderingProviderCode;
    }

    @JsonProperty("prv01_renderingProviderCode")
    public void setPrv01RenderingProviderCode(String prv01RenderingProviderCode) {
        this.prv01RenderingProviderCode = prv01RenderingProviderCode;
    }

    public RendPrvName_ withPrv01RenderingProviderCode(String prv01RenderingProviderCode) {
        this.prv01RenderingProviderCode = prv01RenderingProviderCode;
        return this;
    }

    @JsonProperty("prv02_renderingProviderTaxonomyCodeQlfr")
    public String getPrv02RenderingProviderTaxonomyCodeQlfr() {
        return prv02RenderingProviderTaxonomyCodeQlfr;
    }

    @JsonProperty("prv02_renderingProviderTaxonomyCodeQlfr")
    public void setPrv02RenderingProviderTaxonomyCodeQlfr(String prv02RenderingProviderTaxonomyCodeQlfr) {
        this.prv02RenderingProviderTaxonomyCodeQlfr = prv02RenderingProviderTaxonomyCodeQlfr;
    }

    public RendPrvName_ withPrv02RenderingProviderTaxonomyCodeQlfr(String prv02RenderingProviderTaxonomyCodeQlfr) {
        this.prv02RenderingProviderTaxonomyCodeQlfr = prv02RenderingProviderTaxonomyCodeQlfr;
        return this;
    }

    @JsonProperty("prv03_renderingProviderTaxonomyCode")
    public String getPrv03RenderingProviderTaxonomyCode() {
        return prv03RenderingProviderTaxonomyCode;
    }

    @JsonProperty("prv03_renderingProviderTaxonomyCode")
    public void setPrv03RenderingProviderTaxonomyCode(String prv03RenderingProviderTaxonomyCode) {
        this.prv03RenderingProviderTaxonomyCode = prv03RenderingProviderTaxonomyCode;
    }

    public RendPrvName_ withPrv03RenderingProviderTaxonomyCode(String prv03RenderingProviderTaxonomyCode) {
        this.prv03RenderingProviderTaxonomyCode = prv03RenderingProviderTaxonomyCode;
        return this;
    }

    @JsonProperty("ref_renderingProviderSecondaryIdentification")
    public List<RefRenderingProviderSecondaryIdentification> getRefRenderingProviderSecondaryIdentification() {
        return refRenderingProviderSecondaryIdentification;
    }

    @JsonProperty("ref_renderingProviderSecondaryIdentification")
    public void setRefRenderingProviderSecondaryIdentification(List<RefRenderingProviderSecondaryIdentification> refRenderingProviderSecondaryIdentification) {
        this.refRenderingProviderSecondaryIdentification = refRenderingProviderSecondaryIdentification;
    }

    public RendPrvName_ withRefRenderingProviderSecondaryIdentification(List<RefRenderingProviderSecondaryIdentification> refRenderingProviderSecondaryIdentification) {
        this.refRenderingProviderSecondaryIdentification = refRenderingProviderSecondaryIdentification;
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

    public RendPrvName_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101RenderingProviderIdentifierCode).append(nm102RenderingProviderTypeQlfr).append(nm103RenderingProviderNameLastOrganizationName).append(nm104RenderingProviderFirstName).append(nm105RenderingProviderMiddleName).append(nm107RenderingProviderSuffix).append(nm108RenderingProviderIdentificationCodeQlfr).append(nm109RenderingProviderIdentifier).append(prv01RenderingProviderCode).append(prv02RenderingProviderTaxonomyCodeQlfr).append(prv03RenderingProviderTaxonomyCode).append(refRenderingProviderSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RendPrvName_) == false) {
            return false;
        }
        RendPrvName_ rhs = ((RendPrvName_) other);
        return new EqualsBuilder().append(nm101RenderingProviderIdentifierCode, rhs.nm101RenderingProviderIdentifierCode).append(nm102RenderingProviderTypeQlfr, rhs.nm102RenderingProviderTypeQlfr).append(nm103RenderingProviderNameLastOrganizationName, rhs.nm103RenderingProviderNameLastOrganizationName).append(nm104RenderingProviderFirstName, rhs.nm104RenderingProviderFirstName).append(nm105RenderingProviderMiddleName, rhs.nm105RenderingProviderMiddleName).append(nm107RenderingProviderSuffix, rhs.nm107RenderingProviderSuffix).append(nm108RenderingProviderIdentificationCodeQlfr, rhs.nm108RenderingProviderIdentificationCodeQlfr).append(nm109RenderingProviderIdentifier, rhs.nm109RenderingProviderIdentifier).append(prv01RenderingProviderCode, rhs.prv01RenderingProviderCode).append(prv02RenderingProviderTaxonomyCodeQlfr, rhs.prv02RenderingProviderTaxonomyCodeQlfr).append(prv03RenderingProviderTaxonomyCode, rhs.prv03RenderingProviderTaxonomyCode).append(refRenderingProviderSecondaryIdentification, rhs.refRenderingProviderSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

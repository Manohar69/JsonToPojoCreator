
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
    "hl01_hierarchicalIdNo",
    "hl03_hierarchicalLevelCode",
    "hl04_hierarchicalChildCode",
    "prv01_billingProviderCode",
    "prv02_billingProviderTaxonomyCodeQlfr",
    "prv03_billingProviderTaxonomyCode",
    "cur01_billingProviderIdentifierCode",
    "cur02_billingProviderCurrencyCode"
})
public class BillingPrvHierLevel {

    @JsonProperty("hl01_hierarchicalIdNo")
    private String hl01HierarchicalIdNo;
    @JsonProperty("hl03_hierarchicalLevelCode")
    private String hl03HierarchicalLevelCode;
    @JsonProperty("hl04_hierarchicalChildCode")
    private String hl04HierarchicalChildCode;
    @JsonProperty("prv01_billingProviderCode")
    private String prv01BillingProviderCode;
    @JsonProperty("prv02_billingProviderTaxonomyCodeQlfr")
    private String prv02BillingProviderTaxonomyCodeQlfr;
    @JsonProperty("prv03_billingProviderTaxonomyCode")
    private String prv03BillingProviderTaxonomyCode;
    @JsonProperty("cur01_billingProviderIdentifierCode")
    private String cur01BillingProviderIdentifierCode;
    @JsonProperty("cur02_billingProviderCurrencyCode")
    private String cur02BillingProviderCurrencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hl01_hierarchicalIdNo")
    public String getHl01HierarchicalIdNo() {
        return hl01HierarchicalIdNo;
    }

    @JsonProperty("hl01_hierarchicalIdNo")
    public void setHl01HierarchicalIdNo(String hl01HierarchicalIdNo) {
        this.hl01HierarchicalIdNo = hl01HierarchicalIdNo;
    }

    public BillingPrvHierLevel withHl01HierarchicalIdNo(String hl01HierarchicalIdNo) {
        this.hl01HierarchicalIdNo = hl01HierarchicalIdNo;
        return this;
    }

    @JsonProperty("hl03_hierarchicalLevelCode")
    public String getHl03HierarchicalLevelCode() {
        return hl03HierarchicalLevelCode;
    }

    @JsonProperty("hl03_hierarchicalLevelCode")
    public void setHl03HierarchicalLevelCode(String hl03HierarchicalLevelCode) {
        this.hl03HierarchicalLevelCode = hl03HierarchicalLevelCode;
    }

    public BillingPrvHierLevel withHl03HierarchicalLevelCode(String hl03HierarchicalLevelCode) {
        this.hl03HierarchicalLevelCode = hl03HierarchicalLevelCode;
        return this;
    }

    @JsonProperty("hl04_hierarchicalChildCode")
    public String getHl04HierarchicalChildCode() {
        return hl04HierarchicalChildCode;
    }

    @JsonProperty("hl04_hierarchicalChildCode")
    public void setHl04HierarchicalChildCode(String hl04HierarchicalChildCode) {
        this.hl04HierarchicalChildCode = hl04HierarchicalChildCode;
    }

    public BillingPrvHierLevel withHl04HierarchicalChildCode(String hl04HierarchicalChildCode) {
        this.hl04HierarchicalChildCode = hl04HierarchicalChildCode;
        return this;
    }

    @JsonProperty("prv01_billingProviderCode")
    public String getPrv01BillingProviderCode() {
        return prv01BillingProviderCode;
    }

    @JsonProperty("prv01_billingProviderCode")
    public void setPrv01BillingProviderCode(String prv01BillingProviderCode) {
        this.prv01BillingProviderCode = prv01BillingProviderCode;
    }

    public BillingPrvHierLevel withPrv01BillingProviderCode(String prv01BillingProviderCode) {
        this.prv01BillingProviderCode = prv01BillingProviderCode;
        return this;
    }

    @JsonProperty("prv02_billingProviderTaxonomyCodeQlfr")
    public String getPrv02BillingProviderTaxonomyCodeQlfr() {
        return prv02BillingProviderTaxonomyCodeQlfr;
    }

    @JsonProperty("prv02_billingProviderTaxonomyCodeQlfr")
    public void setPrv02BillingProviderTaxonomyCodeQlfr(String prv02BillingProviderTaxonomyCodeQlfr) {
        this.prv02BillingProviderTaxonomyCodeQlfr = prv02BillingProviderTaxonomyCodeQlfr;
    }

    public BillingPrvHierLevel withPrv02BillingProviderTaxonomyCodeQlfr(String prv02BillingProviderTaxonomyCodeQlfr) {
        this.prv02BillingProviderTaxonomyCodeQlfr = prv02BillingProviderTaxonomyCodeQlfr;
        return this;
    }

    @JsonProperty("prv03_billingProviderTaxonomyCode")
    public String getPrv03BillingProviderTaxonomyCode() {
        return prv03BillingProviderTaxonomyCode;
    }

    @JsonProperty("prv03_billingProviderTaxonomyCode")
    public void setPrv03BillingProviderTaxonomyCode(String prv03BillingProviderTaxonomyCode) {
        this.prv03BillingProviderTaxonomyCode = prv03BillingProviderTaxonomyCode;
    }

    public BillingPrvHierLevel withPrv03BillingProviderTaxonomyCode(String prv03BillingProviderTaxonomyCode) {
        this.prv03BillingProviderTaxonomyCode = prv03BillingProviderTaxonomyCode;
        return this;
    }

    @JsonProperty("cur01_billingProviderIdentifierCode")
    public String getCur01BillingProviderIdentifierCode() {
        return cur01BillingProviderIdentifierCode;
    }

    @JsonProperty("cur01_billingProviderIdentifierCode")
    public void setCur01BillingProviderIdentifierCode(String cur01BillingProviderIdentifierCode) {
        this.cur01BillingProviderIdentifierCode = cur01BillingProviderIdentifierCode;
    }

    public BillingPrvHierLevel withCur01BillingProviderIdentifierCode(String cur01BillingProviderIdentifierCode) {
        this.cur01BillingProviderIdentifierCode = cur01BillingProviderIdentifierCode;
        return this;
    }

    @JsonProperty("cur02_billingProviderCurrencyCode")
    public String getCur02BillingProviderCurrencyCode() {
        return cur02BillingProviderCurrencyCode;
    }

    @JsonProperty("cur02_billingProviderCurrencyCode")
    public void setCur02BillingProviderCurrencyCode(String cur02BillingProviderCurrencyCode) {
        this.cur02BillingProviderCurrencyCode = cur02BillingProviderCurrencyCode;
    }

    public BillingPrvHierLevel withCur02BillingProviderCurrencyCode(String cur02BillingProviderCurrencyCode) {
        this.cur02BillingProviderCurrencyCode = cur02BillingProviderCurrencyCode;
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

    public BillingPrvHierLevel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hl01HierarchicalIdNo).append(hl03HierarchicalLevelCode).append(hl04HierarchicalChildCode).append(prv01BillingProviderCode).append(prv02BillingProviderTaxonomyCodeQlfr).append(prv03BillingProviderTaxonomyCode).append(cur01BillingProviderIdentifierCode).append(cur02BillingProviderCurrencyCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingPrvHierLevel) == false) {
            return false;
        }
        BillingPrvHierLevel rhs = ((BillingPrvHierLevel) other);
        return new EqualsBuilder().append(hl01HierarchicalIdNo, rhs.hl01HierarchicalIdNo).append(hl03HierarchicalLevelCode, rhs.hl03HierarchicalLevelCode).append(hl04HierarchicalChildCode, rhs.hl04HierarchicalChildCode).append(prv01BillingProviderCode, rhs.prv01BillingProviderCode).append(prv02BillingProviderTaxonomyCodeQlfr, rhs.prv02BillingProviderTaxonomyCodeQlfr).append(prv03BillingProviderTaxonomyCode, rhs.prv03BillingProviderTaxonomyCode).append(cur01BillingProviderIdentifierCode, rhs.cur01BillingProviderIdentifierCode).append(cur02BillingProviderCurrencyCode, rhs.cur02BillingProviderCurrencyCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

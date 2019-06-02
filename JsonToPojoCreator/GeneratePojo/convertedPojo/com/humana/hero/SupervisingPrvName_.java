
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
    "nm101_supervisingProviderNameIdentityCode",
    "nm102_supervisingProviderNameIdentifyQlfr",
    "nm103_supervisingProviderLastName",
    "nm104_supervisingProviderFirstName",
    "nm105_supervisingProviderMiddleName",
    "nm107_supervisingProviderSuffix",
    "nm108_supervisingProviderIdentificationCodeQlfr",
    "nm109_supervisingProviderIdentifier",
    "ref_supervisingProviderSecondaryIdentification"
})
public class SupervisingPrvName_ {

    @JsonProperty("nm101_supervisingProviderNameIdentityCode")
    private String nm101SupervisingProviderNameIdentityCode;
    @JsonProperty("nm102_supervisingProviderNameIdentifyQlfr")
    private String nm102SupervisingProviderNameIdentifyQlfr;
    @JsonProperty("nm103_supervisingProviderLastName")
    private String nm103SupervisingProviderLastName;
    @JsonProperty("nm104_supervisingProviderFirstName")
    private String nm104SupervisingProviderFirstName;
    @JsonProperty("nm105_supervisingProviderMiddleName")
    private String nm105SupervisingProviderMiddleName;
    @JsonProperty("nm107_supervisingProviderSuffix")
    private String nm107SupervisingProviderSuffix;
    @JsonProperty("nm108_supervisingProviderIdentificationCodeQlfr")
    private String nm108SupervisingProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_supervisingProviderIdentifier")
    private String nm109SupervisingProviderIdentifier;
    @JsonProperty("ref_supervisingProviderSecondaryIdentification")
    private List<RefSupervisingProviderSecondaryIdentification> refSupervisingProviderSecondaryIdentification = new ArrayList<RefSupervisingProviderSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_supervisingProviderNameIdentityCode")
    public String getNm101SupervisingProviderNameIdentityCode() {
        return nm101SupervisingProviderNameIdentityCode;
    }

    @JsonProperty("nm101_supervisingProviderNameIdentityCode")
    public void setNm101SupervisingProviderNameIdentityCode(String nm101SupervisingProviderNameIdentityCode) {
        this.nm101SupervisingProviderNameIdentityCode = nm101SupervisingProviderNameIdentityCode;
    }

    public SupervisingPrvName_ withNm101SupervisingProviderNameIdentityCode(String nm101SupervisingProviderNameIdentityCode) {
        this.nm101SupervisingProviderNameIdentityCode = nm101SupervisingProviderNameIdentityCode;
        return this;
    }

    @JsonProperty("nm102_supervisingProviderNameIdentifyQlfr")
    public String getNm102SupervisingProviderNameIdentifyQlfr() {
        return nm102SupervisingProviderNameIdentifyQlfr;
    }

    @JsonProperty("nm102_supervisingProviderNameIdentifyQlfr")
    public void setNm102SupervisingProviderNameIdentifyQlfr(String nm102SupervisingProviderNameIdentifyQlfr) {
        this.nm102SupervisingProviderNameIdentifyQlfr = nm102SupervisingProviderNameIdentifyQlfr;
    }

    public SupervisingPrvName_ withNm102SupervisingProviderNameIdentifyQlfr(String nm102SupervisingProviderNameIdentifyQlfr) {
        this.nm102SupervisingProviderNameIdentifyQlfr = nm102SupervisingProviderNameIdentifyQlfr;
        return this;
    }

    @JsonProperty("nm103_supervisingProviderLastName")
    public String getNm103SupervisingProviderLastName() {
        return nm103SupervisingProviderLastName;
    }

    @JsonProperty("nm103_supervisingProviderLastName")
    public void setNm103SupervisingProviderLastName(String nm103SupervisingProviderLastName) {
        this.nm103SupervisingProviderLastName = nm103SupervisingProviderLastName;
    }

    public SupervisingPrvName_ withNm103SupervisingProviderLastName(String nm103SupervisingProviderLastName) {
        this.nm103SupervisingProviderLastName = nm103SupervisingProviderLastName;
        return this;
    }

    @JsonProperty("nm104_supervisingProviderFirstName")
    public String getNm104SupervisingProviderFirstName() {
        return nm104SupervisingProviderFirstName;
    }

    @JsonProperty("nm104_supervisingProviderFirstName")
    public void setNm104SupervisingProviderFirstName(String nm104SupervisingProviderFirstName) {
        this.nm104SupervisingProviderFirstName = nm104SupervisingProviderFirstName;
    }

    public SupervisingPrvName_ withNm104SupervisingProviderFirstName(String nm104SupervisingProviderFirstName) {
        this.nm104SupervisingProviderFirstName = nm104SupervisingProviderFirstName;
        return this;
    }

    @JsonProperty("nm105_supervisingProviderMiddleName")
    public String getNm105SupervisingProviderMiddleName() {
        return nm105SupervisingProviderMiddleName;
    }

    @JsonProperty("nm105_supervisingProviderMiddleName")
    public void setNm105SupervisingProviderMiddleName(String nm105SupervisingProviderMiddleName) {
        this.nm105SupervisingProviderMiddleName = nm105SupervisingProviderMiddleName;
    }

    public SupervisingPrvName_ withNm105SupervisingProviderMiddleName(String nm105SupervisingProviderMiddleName) {
        this.nm105SupervisingProviderMiddleName = nm105SupervisingProviderMiddleName;
        return this;
    }

    @JsonProperty("nm107_supervisingProviderSuffix")
    public String getNm107SupervisingProviderSuffix() {
        return nm107SupervisingProviderSuffix;
    }

    @JsonProperty("nm107_supervisingProviderSuffix")
    public void setNm107SupervisingProviderSuffix(String nm107SupervisingProviderSuffix) {
        this.nm107SupervisingProviderSuffix = nm107SupervisingProviderSuffix;
    }

    public SupervisingPrvName_ withNm107SupervisingProviderSuffix(String nm107SupervisingProviderSuffix) {
        this.nm107SupervisingProviderSuffix = nm107SupervisingProviderSuffix;
        return this;
    }

    @JsonProperty("nm108_supervisingProviderIdentificationCodeQlfr")
    public String getNm108SupervisingProviderIdentificationCodeQlfr() {
        return nm108SupervisingProviderIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_supervisingProviderIdentificationCodeQlfr")
    public void setNm108SupervisingProviderIdentificationCodeQlfr(String nm108SupervisingProviderIdentificationCodeQlfr) {
        this.nm108SupervisingProviderIdentificationCodeQlfr = nm108SupervisingProviderIdentificationCodeQlfr;
    }

    public SupervisingPrvName_ withNm108SupervisingProviderIdentificationCodeQlfr(String nm108SupervisingProviderIdentificationCodeQlfr) {
        this.nm108SupervisingProviderIdentificationCodeQlfr = nm108SupervisingProviderIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_supervisingProviderIdentifier")
    public String getNm109SupervisingProviderIdentifier() {
        return nm109SupervisingProviderIdentifier;
    }

    @JsonProperty("nm109_supervisingProviderIdentifier")
    public void setNm109SupervisingProviderIdentifier(String nm109SupervisingProviderIdentifier) {
        this.nm109SupervisingProviderIdentifier = nm109SupervisingProviderIdentifier;
    }

    public SupervisingPrvName_ withNm109SupervisingProviderIdentifier(String nm109SupervisingProviderIdentifier) {
        this.nm109SupervisingProviderIdentifier = nm109SupervisingProviderIdentifier;
        return this;
    }

    @JsonProperty("ref_supervisingProviderSecondaryIdentification")
    public List<RefSupervisingProviderSecondaryIdentification> getRefSupervisingProviderSecondaryIdentification() {
        return refSupervisingProviderSecondaryIdentification;
    }

    @JsonProperty("ref_supervisingProviderSecondaryIdentification")
    public void setRefSupervisingProviderSecondaryIdentification(List<RefSupervisingProviderSecondaryIdentification> refSupervisingProviderSecondaryIdentification) {
        this.refSupervisingProviderSecondaryIdentification = refSupervisingProviderSecondaryIdentification;
    }

    public SupervisingPrvName_ withRefSupervisingProviderSecondaryIdentification(List<RefSupervisingProviderSecondaryIdentification> refSupervisingProviderSecondaryIdentification) {
        this.refSupervisingProviderSecondaryIdentification = refSupervisingProviderSecondaryIdentification;
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

    public SupervisingPrvName_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101SupervisingProviderNameIdentityCode).append(nm102SupervisingProviderNameIdentifyQlfr).append(nm103SupervisingProviderLastName).append(nm104SupervisingProviderFirstName).append(nm105SupervisingProviderMiddleName).append(nm107SupervisingProviderSuffix).append(nm108SupervisingProviderIdentificationCodeQlfr).append(nm109SupervisingProviderIdentifier).append(refSupervisingProviderSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupervisingPrvName_) == false) {
            return false;
        }
        SupervisingPrvName_ rhs = ((SupervisingPrvName_) other);
        return new EqualsBuilder().append(nm101SupervisingProviderNameIdentityCode, rhs.nm101SupervisingProviderNameIdentityCode).append(nm102SupervisingProviderNameIdentifyQlfr, rhs.nm102SupervisingProviderNameIdentifyQlfr).append(nm103SupervisingProviderLastName, rhs.nm103SupervisingProviderLastName).append(nm104SupervisingProviderFirstName, rhs.nm104SupervisingProviderFirstName).append(nm105SupervisingProviderMiddleName, rhs.nm105SupervisingProviderMiddleName).append(nm107SupervisingProviderSuffix, rhs.nm107SupervisingProviderSuffix).append(nm108SupervisingProviderIdentificationCodeQlfr, rhs.nm108SupervisingProviderIdentificationCodeQlfr).append(nm109SupervisingProviderIdentifier, rhs.nm109SupervisingProviderIdentifier).append(refSupervisingProviderSecondaryIdentification, rhs.refSupervisingProviderSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

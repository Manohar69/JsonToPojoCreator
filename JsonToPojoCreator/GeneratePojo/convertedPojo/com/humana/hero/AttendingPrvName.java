
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
    "nm101_attendingProviderCode",
    "nm102_attendingProviderCodeQlfr",
    "nm103_attendingProviderLastName",
    "nm104_attendingProviderFirstName",
    "nm105_attendingProviderMiddleName",
    "nm107_attendingProviderNameSuffix",
    "nm108_attendingProviderIdentificationCodeQlfr",
    "nm109_attendingProviderIdentifier",
    "prv01_attendingProviderSpecialityInfoCode",
    "prv02_attendingProviderSpecialityTaxonomyCodeQlfr",
    "prv03_attendingProviderSpecialityTaxonomyCode",
    "ref_attendingProviderSecondaryIdentification"
})
public class AttendingPrvName {

    @JsonProperty("nm101_attendingProviderCode")
    private String nm101AttendingProviderCode;
    @JsonProperty("nm102_attendingProviderCodeQlfr")
    private String nm102AttendingProviderCodeQlfr;
    @JsonProperty("nm103_attendingProviderLastName")
    private String nm103AttendingProviderLastName;
    @JsonProperty("nm104_attendingProviderFirstName")
    private String nm104AttendingProviderFirstName;
    @JsonProperty("nm105_attendingProviderMiddleName")
    private String nm105AttendingProviderMiddleName;
    @JsonProperty("nm107_attendingProviderNameSuffix")
    private String nm107AttendingProviderNameSuffix;
    @JsonProperty("nm108_attendingProviderIdentificationCodeQlfr")
    private String nm108AttendingProviderIdentificationCodeQlfr;
    @JsonProperty("nm109_attendingProviderIdentifier")
    private String nm109AttendingProviderIdentifier;
    @JsonProperty("prv01_attendingProviderSpecialityInfoCode")
    private String prv01AttendingProviderSpecialityInfoCode;
    @JsonProperty("prv02_attendingProviderSpecialityTaxonomyCodeQlfr")
    private String prv02AttendingProviderSpecialityTaxonomyCodeQlfr;
    @JsonProperty("prv03_attendingProviderSpecialityTaxonomyCode")
    private String prv03AttendingProviderSpecialityTaxonomyCode;
    @JsonProperty("ref_attendingProviderSecondaryIdentification")
    private List<RefAttendingProviderSecondaryIdentification> refAttendingProviderSecondaryIdentification = new ArrayList<RefAttendingProviderSecondaryIdentification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_attendingProviderCode")
    public String getNm101AttendingProviderCode() {
        return nm101AttendingProviderCode;
    }

    @JsonProperty("nm101_attendingProviderCode")
    public void setNm101AttendingProviderCode(String nm101AttendingProviderCode) {
        this.nm101AttendingProviderCode = nm101AttendingProviderCode;
    }

    public AttendingPrvName withNm101AttendingProviderCode(String nm101AttendingProviderCode) {
        this.nm101AttendingProviderCode = nm101AttendingProviderCode;
        return this;
    }

    @JsonProperty("nm102_attendingProviderCodeQlfr")
    public String getNm102AttendingProviderCodeQlfr() {
        return nm102AttendingProviderCodeQlfr;
    }

    @JsonProperty("nm102_attendingProviderCodeQlfr")
    public void setNm102AttendingProviderCodeQlfr(String nm102AttendingProviderCodeQlfr) {
        this.nm102AttendingProviderCodeQlfr = nm102AttendingProviderCodeQlfr;
    }

    public AttendingPrvName withNm102AttendingProviderCodeQlfr(String nm102AttendingProviderCodeQlfr) {
        this.nm102AttendingProviderCodeQlfr = nm102AttendingProviderCodeQlfr;
        return this;
    }

    @JsonProperty("nm103_attendingProviderLastName")
    public String getNm103AttendingProviderLastName() {
        return nm103AttendingProviderLastName;
    }

    @JsonProperty("nm103_attendingProviderLastName")
    public void setNm103AttendingProviderLastName(String nm103AttendingProviderLastName) {
        this.nm103AttendingProviderLastName = nm103AttendingProviderLastName;
    }

    public AttendingPrvName withNm103AttendingProviderLastName(String nm103AttendingProviderLastName) {
        this.nm103AttendingProviderLastName = nm103AttendingProviderLastName;
        return this;
    }

    @JsonProperty("nm104_attendingProviderFirstName")
    public String getNm104AttendingProviderFirstName() {
        return nm104AttendingProviderFirstName;
    }

    @JsonProperty("nm104_attendingProviderFirstName")
    public void setNm104AttendingProviderFirstName(String nm104AttendingProviderFirstName) {
        this.nm104AttendingProviderFirstName = nm104AttendingProviderFirstName;
    }

    public AttendingPrvName withNm104AttendingProviderFirstName(String nm104AttendingProviderFirstName) {
        this.nm104AttendingProviderFirstName = nm104AttendingProviderFirstName;
        return this;
    }

    @JsonProperty("nm105_attendingProviderMiddleName")
    public String getNm105AttendingProviderMiddleName() {
        return nm105AttendingProviderMiddleName;
    }

    @JsonProperty("nm105_attendingProviderMiddleName")
    public void setNm105AttendingProviderMiddleName(String nm105AttendingProviderMiddleName) {
        this.nm105AttendingProviderMiddleName = nm105AttendingProviderMiddleName;
    }

    public AttendingPrvName withNm105AttendingProviderMiddleName(String nm105AttendingProviderMiddleName) {
        this.nm105AttendingProviderMiddleName = nm105AttendingProviderMiddleName;
        return this;
    }

    @JsonProperty("nm107_attendingProviderNameSuffix")
    public String getNm107AttendingProviderNameSuffix() {
        return nm107AttendingProviderNameSuffix;
    }

    @JsonProperty("nm107_attendingProviderNameSuffix")
    public void setNm107AttendingProviderNameSuffix(String nm107AttendingProviderNameSuffix) {
        this.nm107AttendingProviderNameSuffix = nm107AttendingProviderNameSuffix;
    }

    public AttendingPrvName withNm107AttendingProviderNameSuffix(String nm107AttendingProviderNameSuffix) {
        this.nm107AttendingProviderNameSuffix = nm107AttendingProviderNameSuffix;
        return this;
    }

    @JsonProperty("nm108_attendingProviderIdentificationCodeQlfr")
    public String getNm108AttendingProviderIdentificationCodeQlfr() {
        return nm108AttendingProviderIdentificationCodeQlfr;
    }

    @JsonProperty("nm108_attendingProviderIdentificationCodeQlfr")
    public void setNm108AttendingProviderIdentificationCodeQlfr(String nm108AttendingProviderIdentificationCodeQlfr) {
        this.nm108AttendingProviderIdentificationCodeQlfr = nm108AttendingProviderIdentificationCodeQlfr;
    }

    public AttendingPrvName withNm108AttendingProviderIdentificationCodeQlfr(String nm108AttendingProviderIdentificationCodeQlfr) {
        this.nm108AttendingProviderIdentificationCodeQlfr = nm108AttendingProviderIdentificationCodeQlfr;
        return this;
    }

    @JsonProperty("nm109_attendingProviderIdentifier")
    public String getNm109AttendingProviderIdentifier() {
        return nm109AttendingProviderIdentifier;
    }

    @JsonProperty("nm109_attendingProviderIdentifier")
    public void setNm109AttendingProviderIdentifier(String nm109AttendingProviderIdentifier) {
        this.nm109AttendingProviderIdentifier = nm109AttendingProviderIdentifier;
    }

    public AttendingPrvName withNm109AttendingProviderIdentifier(String nm109AttendingProviderIdentifier) {
        this.nm109AttendingProviderIdentifier = nm109AttendingProviderIdentifier;
        return this;
    }

    @JsonProperty("prv01_attendingProviderSpecialityInfoCode")
    public String getPrv01AttendingProviderSpecialityInfoCode() {
        return prv01AttendingProviderSpecialityInfoCode;
    }

    @JsonProperty("prv01_attendingProviderSpecialityInfoCode")
    public void setPrv01AttendingProviderSpecialityInfoCode(String prv01AttendingProviderSpecialityInfoCode) {
        this.prv01AttendingProviderSpecialityInfoCode = prv01AttendingProviderSpecialityInfoCode;
    }

    public AttendingPrvName withPrv01AttendingProviderSpecialityInfoCode(String prv01AttendingProviderSpecialityInfoCode) {
        this.prv01AttendingProviderSpecialityInfoCode = prv01AttendingProviderSpecialityInfoCode;
        return this;
    }

    @JsonProperty("prv02_attendingProviderSpecialityTaxonomyCodeQlfr")
    public String getPrv02AttendingProviderSpecialityTaxonomyCodeQlfr() {
        return prv02AttendingProviderSpecialityTaxonomyCodeQlfr;
    }

    @JsonProperty("prv02_attendingProviderSpecialityTaxonomyCodeQlfr")
    public void setPrv02AttendingProviderSpecialityTaxonomyCodeQlfr(String prv02AttendingProviderSpecialityTaxonomyCodeQlfr) {
        this.prv02AttendingProviderSpecialityTaxonomyCodeQlfr = prv02AttendingProviderSpecialityTaxonomyCodeQlfr;
    }

    public AttendingPrvName withPrv02AttendingProviderSpecialityTaxonomyCodeQlfr(String prv02AttendingProviderSpecialityTaxonomyCodeQlfr) {
        this.prv02AttendingProviderSpecialityTaxonomyCodeQlfr = prv02AttendingProviderSpecialityTaxonomyCodeQlfr;
        return this;
    }

    @JsonProperty("prv03_attendingProviderSpecialityTaxonomyCode")
    public String getPrv03AttendingProviderSpecialityTaxonomyCode() {
        return prv03AttendingProviderSpecialityTaxonomyCode;
    }

    @JsonProperty("prv03_attendingProviderSpecialityTaxonomyCode")
    public void setPrv03AttendingProviderSpecialityTaxonomyCode(String prv03AttendingProviderSpecialityTaxonomyCode) {
        this.prv03AttendingProviderSpecialityTaxonomyCode = prv03AttendingProviderSpecialityTaxonomyCode;
    }

    public AttendingPrvName withPrv03AttendingProviderSpecialityTaxonomyCode(String prv03AttendingProviderSpecialityTaxonomyCode) {
        this.prv03AttendingProviderSpecialityTaxonomyCode = prv03AttendingProviderSpecialityTaxonomyCode;
        return this;
    }

    @JsonProperty("ref_attendingProviderSecondaryIdentification")
    public List<RefAttendingProviderSecondaryIdentification> getRefAttendingProviderSecondaryIdentification() {
        return refAttendingProviderSecondaryIdentification;
    }

    @JsonProperty("ref_attendingProviderSecondaryIdentification")
    public void setRefAttendingProviderSecondaryIdentification(List<RefAttendingProviderSecondaryIdentification> refAttendingProviderSecondaryIdentification) {
        this.refAttendingProviderSecondaryIdentification = refAttendingProviderSecondaryIdentification;
    }

    public AttendingPrvName withRefAttendingProviderSecondaryIdentification(List<RefAttendingProviderSecondaryIdentification> refAttendingProviderSecondaryIdentification) {
        this.refAttendingProviderSecondaryIdentification = refAttendingProviderSecondaryIdentification;
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

    public AttendingPrvName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101AttendingProviderCode).append(nm102AttendingProviderCodeQlfr).append(nm103AttendingProviderLastName).append(nm104AttendingProviderFirstName).append(nm105AttendingProviderMiddleName).append(nm107AttendingProviderNameSuffix).append(nm108AttendingProviderIdentificationCodeQlfr).append(nm109AttendingProviderIdentifier).append(prv01AttendingProviderSpecialityInfoCode).append(prv02AttendingProviderSpecialityTaxonomyCodeQlfr).append(prv03AttendingProviderSpecialityTaxonomyCode).append(refAttendingProviderSecondaryIdentification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttendingPrvName) == false) {
            return false;
        }
        AttendingPrvName rhs = ((AttendingPrvName) other);
        return new EqualsBuilder().append(nm101AttendingProviderCode, rhs.nm101AttendingProviderCode).append(nm102AttendingProviderCodeQlfr, rhs.nm102AttendingProviderCodeQlfr).append(nm103AttendingProviderLastName, rhs.nm103AttendingProviderLastName).append(nm104AttendingProviderFirstName, rhs.nm104AttendingProviderFirstName).append(nm105AttendingProviderMiddleName, rhs.nm105AttendingProviderMiddleName).append(nm107AttendingProviderNameSuffix, rhs.nm107AttendingProviderNameSuffix).append(nm108AttendingProviderIdentificationCodeQlfr, rhs.nm108AttendingProviderIdentificationCodeQlfr).append(nm109AttendingProviderIdentifier, rhs.nm109AttendingProviderIdentifier).append(prv01AttendingProviderSpecialityInfoCode, rhs.prv01AttendingProviderSpecialityInfoCode).append(prv02AttendingProviderSpecialityTaxonomyCodeQlfr, rhs.prv02AttendingProviderSpecialityTaxonomyCodeQlfr).append(prv03AttendingProviderSpecialityTaxonomyCode, rhs.prv03AttendingProviderSpecialityTaxonomyCode).append(refAttendingProviderSecondaryIdentification, rhs.refAttendingProviderSecondaryIdentification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

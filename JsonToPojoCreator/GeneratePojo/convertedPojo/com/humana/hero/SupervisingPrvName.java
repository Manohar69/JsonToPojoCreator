
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
    "nm101_supervisingPhysicianidentificationCode",
    "nm102_supervisingPhysicianTypeQlfr",
    "nm103_supervisingPhysicianLastName",
    "nm104_supervisingPhysicianFirstName",
    "nm105_supervisingPhysicianMiddleName",
    "nm107_supervisingPhysicianSuffix",
    "nm108_supervisingPhysicianIdentifierQlfr",
    "nm109_supervisingPhysicianIdentifier",
    "ref01_supervisingPhysicianSecondaryIdQlfr",
    "ref02_supervisingPhysicianSecondaryId"
})
public class SupervisingPrvName {

    @JsonProperty("nm101_supervisingPhysicianidentificationCode")
    private String nm101SupervisingPhysicianidentificationCode;
    @JsonProperty("nm102_supervisingPhysicianTypeQlfr")
    private String nm102SupervisingPhysicianTypeQlfr;
    @JsonProperty("nm103_supervisingPhysicianLastName")
    private String nm103SupervisingPhysicianLastName;
    @JsonProperty("nm104_supervisingPhysicianFirstName")
    private String nm104SupervisingPhysicianFirstName;
    @JsonProperty("nm105_supervisingPhysicianMiddleName")
    private String nm105SupervisingPhysicianMiddleName;
    @JsonProperty("nm107_supervisingPhysicianSuffix")
    private String nm107SupervisingPhysicianSuffix;
    @JsonProperty("nm108_supervisingPhysicianIdentifierQlfr")
    private String nm108SupervisingPhysicianIdentifierQlfr;
    @JsonProperty("nm109_supervisingPhysicianIdentifier")
    private String nm109SupervisingPhysicianIdentifier;
    @JsonProperty("ref01_supervisingPhysicianSecondaryIdQlfr")
    private String ref01SupervisingPhysicianSecondaryIdQlfr;
    @JsonProperty("ref02_supervisingPhysicianSecondaryId")
    private String ref02SupervisingPhysicianSecondaryId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm101_supervisingPhysicianidentificationCode")
    public String getNm101SupervisingPhysicianidentificationCode() {
        return nm101SupervisingPhysicianidentificationCode;
    }

    @JsonProperty("nm101_supervisingPhysicianidentificationCode")
    public void setNm101SupervisingPhysicianidentificationCode(String nm101SupervisingPhysicianidentificationCode) {
        this.nm101SupervisingPhysicianidentificationCode = nm101SupervisingPhysicianidentificationCode;
    }

    public SupervisingPrvName withNm101SupervisingPhysicianidentificationCode(String nm101SupervisingPhysicianidentificationCode) {
        this.nm101SupervisingPhysicianidentificationCode = nm101SupervisingPhysicianidentificationCode;
        return this;
    }

    @JsonProperty("nm102_supervisingPhysicianTypeQlfr")
    public String getNm102SupervisingPhysicianTypeQlfr() {
        return nm102SupervisingPhysicianTypeQlfr;
    }

    @JsonProperty("nm102_supervisingPhysicianTypeQlfr")
    public void setNm102SupervisingPhysicianTypeQlfr(String nm102SupervisingPhysicianTypeQlfr) {
        this.nm102SupervisingPhysicianTypeQlfr = nm102SupervisingPhysicianTypeQlfr;
    }

    public SupervisingPrvName withNm102SupervisingPhysicianTypeQlfr(String nm102SupervisingPhysicianTypeQlfr) {
        this.nm102SupervisingPhysicianTypeQlfr = nm102SupervisingPhysicianTypeQlfr;
        return this;
    }

    @JsonProperty("nm103_supervisingPhysicianLastName")
    public String getNm103SupervisingPhysicianLastName() {
        return nm103SupervisingPhysicianLastName;
    }

    @JsonProperty("nm103_supervisingPhysicianLastName")
    public void setNm103SupervisingPhysicianLastName(String nm103SupervisingPhysicianLastName) {
        this.nm103SupervisingPhysicianLastName = nm103SupervisingPhysicianLastName;
    }

    public SupervisingPrvName withNm103SupervisingPhysicianLastName(String nm103SupervisingPhysicianLastName) {
        this.nm103SupervisingPhysicianLastName = nm103SupervisingPhysicianLastName;
        return this;
    }

    @JsonProperty("nm104_supervisingPhysicianFirstName")
    public String getNm104SupervisingPhysicianFirstName() {
        return nm104SupervisingPhysicianFirstName;
    }

    @JsonProperty("nm104_supervisingPhysicianFirstName")
    public void setNm104SupervisingPhysicianFirstName(String nm104SupervisingPhysicianFirstName) {
        this.nm104SupervisingPhysicianFirstName = nm104SupervisingPhysicianFirstName;
    }

    public SupervisingPrvName withNm104SupervisingPhysicianFirstName(String nm104SupervisingPhysicianFirstName) {
        this.nm104SupervisingPhysicianFirstName = nm104SupervisingPhysicianFirstName;
        return this;
    }

    @JsonProperty("nm105_supervisingPhysicianMiddleName")
    public String getNm105SupervisingPhysicianMiddleName() {
        return nm105SupervisingPhysicianMiddleName;
    }

    @JsonProperty("nm105_supervisingPhysicianMiddleName")
    public void setNm105SupervisingPhysicianMiddleName(String nm105SupervisingPhysicianMiddleName) {
        this.nm105SupervisingPhysicianMiddleName = nm105SupervisingPhysicianMiddleName;
    }

    public SupervisingPrvName withNm105SupervisingPhysicianMiddleName(String nm105SupervisingPhysicianMiddleName) {
        this.nm105SupervisingPhysicianMiddleName = nm105SupervisingPhysicianMiddleName;
        return this;
    }

    @JsonProperty("nm107_supervisingPhysicianSuffix")
    public String getNm107SupervisingPhysicianSuffix() {
        return nm107SupervisingPhysicianSuffix;
    }

    @JsonProperty("nm107_supervisingPhysicianSuffix")
    public void setNm107SupervisingPhysicianSuffix(String nm107SupervisingPhysicianSuffix) {
        this.nm107SupervisingPhysicianSuffix = nm107SupervisingPhysicianSuffix;
    }

    public SupervisingPrvName withNm107SupervisingPhysicianSuffix(String nm107SupervisingPhysicianSuffix) {
        this.nm107SupervisingPhysicianSuffix = nm107SupervisingPhysicianSuffix;
        return this;
    }

    @JsonProperty("nm108_supervisingPhysicianIdentifierQlfr")
    public String getNm108SupervisingPhysicianIdentifierQlfr() {
        return nm108SupervisingPhysicianIdentifierQlfr;
    }

    @JsonProperty("nm108_supervisingPhysicianIdentifierQlfr")
    public void setNm108SupervisingPhysicianIdentifierQlfr(String nm108SupervisingPhysicianIdentifierQlfr) {
        this.nm108SupervisingPhysicianIdentifierQlfr = nm108SupervisingPhysicianIdentifierQlfr;
    }

    public SupervisingPrvName withNm108SupervisingPhysicianIdentifierQlfr(String nm108SupervisingPhysicianIdentifierQlfr) {
        this.nm108SupervisingPhysicianIdentifierQlfr = nm108SupervisingPhysicianIdentifierQlfr;
        return this;
    }

    @JsonProperty("nm109_supervisingPhysicianIdentifier")
    public String getNm109SupervisingPhysicianIdentifier() {
        return nm109SupervisingPhysicianIdentifier;
    }

    @JsonProperty("nm109_supervisingPhysicianIdentifier")
    public void setNm109SupervisingPhysicianIdentifier(String nm109SupervisingPhysicianIdentifier) {
        this.nm109SupervisingPhysicianIdentifier = nm109SupervisingPhysicianIdentifier;
    }

    public SupervisingPrvName withNm109SupervisingPhysicianIdentifier(String nm109SupervisingPhysicianIdentifier) {
        this.nm109SupervisingPhysicianIdentifier = nm109SupervisingPhysicianIdentifier;
        return this;
    }

    @JsonProperty("ref01_supervisingPhysicianSecondaryIdQlfr")
    public String getRef01SupervisingPhysicianSecondaryIdQlfr() {
        return ref01SupervisingPhysicianSecondaryIdQlfr;
    }

    @JsonProperty("ref01_supervisingPhysicianSecondaryIdQlfr")
    public void setRef01SupervisingPhysicianSecondaryIdQlfr(String ref01SupervisingPhysicianSecondaryIdQlfr) {
        this.ref01SupervisingPhysicianSecondaryIdQlfr = ref01SupervisingPhysicianSecondaryIdQlfr;
    }

    public SupervisingPrvName withRef01SupervisingPhysicianSecondaryIdQlfr(String ref01SupervisingPhysicianSecondaryIdQlfr) {
        this.ref01SupervisingPhysicianSecondaryIdQlfr = ref01SupervisingPhysicianSecondaryIdQlfr;
        return this;
    }

    @JsonProperty("ref02_supervisingPhysicianSecondaryId")
    public String getRef02SupervisingPhysicianSecondaryId() {
        return ref02SupervisingPhysicianSecondaryId;
    }

    @JsonProperty("ref02_supervisingPhysicianSecondaryId")
    public void setRef02SupervisingPhysicianSecondaryId(String ref02SupervisingPhysicianSecondaryId) {
        this.ref02SupervisingPhysicianSecondaryId = ref02SupervisingPhysicianSecondaryId;
    }

    public SupervisingPrvName withRef02SupervisingPhysicianSecondaryId(String ref02SupervisingPhysicianSecondaryId) {
        this.ref02SupervisingPhysicianSecondaryId = ref02SupervisingPhysicianSecondaryId;
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

    public SupervisingPrvName withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nm101SupervisingPhysicianidentificationCode).append(nm102SupervisingPhysicianTypeQlfr).append(nm103SupervisingPhysicianLastName).append(nm104SupervisingPhysicianFirstName).append(nm105SupervisingPhysicianMiddleName).append(nm107SupervisingPhysicianSuffix).append(nm108SupervisingPhysicianIdentifierQlfr).append(nm109SupervisingPhysicianIdentifier).append(ref01SupervisingPhysicianSecondaryIdQlfr).append(ref02SupervisingPhysicianSecondaryId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupervisingPrvName) == false) {
            return false;
        }
        SupervisingPrvName rhs = ((SupervisingPrvName) other);
        return new EqualsBuilder().append(nm101SupervisingPhysicianidentificationCode, rhs.nm101SupervisingPhysicianidentificationCode).append(nm102SupervisingPhysicianTypeQlfr, rhs.nm102SupervisingPhysicianTypeQlfr).append(nm103SupervisingPhysicianLastName, rhs.nm103SupervisingPhysicianLastName).append(nm104SupervisingPhysicianFirstName, rhs.nm104SupervisingPhysicianFirstName).append(nm105SupervisingPhysicianMiddleName, rhs.nm105SupervisingPhysicianMiddleName).append(nm107SupervisingPhysicianSuffix, rhs.nm107SupervisingPhysicianSuffix).append(nm108SupervisingPhysicianIdentifierQlfr, rhs.nm108SupervisingPhysicianIdentifierQlfr).append(nm109SupervisingPhysicianIdentifier, rhs.nm109SupervisingPhysicianIdentifier).append(ref01SupervisingPhysicianSecondaryIdQlfr, rhs.ref01SupervisingPhysicianSecondaryIdQlfr).append(ref02SupervisingPhysicianSecondaryId, rhs.ref02SupervisingPhysicianSecondaryId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

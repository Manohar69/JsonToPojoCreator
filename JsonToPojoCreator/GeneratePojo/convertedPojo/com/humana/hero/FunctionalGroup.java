
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
    "dbFunctionalGroupId",
    "gs01_functionalIdentifierCode",
    "gs02_sendersCode",
    "gs03_receiversCode",
    "gs04_creationDate",
    "gs05_creationTime",
    "gs06_groupControlNo",
    "gs07_responsibleAgencyCode",
    "gs08_versionReleaseCode",
    "ge01_noOfTransactionSetsIncluded",
    "ge02_groupControlNo"
})
public class FunctionalGroup {

    @JsonProperty("dbFunctionalGroupId")
    private Integer dbFunctionalGroupId;
    @JsonProperty("gs01_functionalIdentifierCode")
    private String gs01FunctionalIdentifierCode;
    @JsonProperty("gs02_sendersCode")
    private String gs02SendersCode;
    @JsonProperty("gs03_receiversCode")
    private String gs03ReceiversCode;
    @JsonProperty("gs04_creationDate")
    private String gs04CreationDate;
    @JsonProperty("gs05_creationTime")
    private String gs05CreationTime;
    @JsonProperty("gs06_groupControlNo")
    private String gs06GroupControlNo;
    @JsonProperty("gs07_responsibleAgencyCode")
    private String gs07ResponsibleAgencyCode;
    @JsonProperty("gs08_versionReleaseCode")
    private String gs08VersionReleaseCode;
    @JsonProperty("ge01_noOfTransactionSetsIncluded")
    private String ge01NoOfTransactionSetsIncluded;
    @JsonProperty("ge02_groupControlNo")
    private String ge02GroupControlNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbFunctionalGroupId")
    public Integer getDbFunctionalGroupId() {
        return dbFunctionalGroupId;
    }

    @JsonProperty("dbFunctionalGroupId")
    public void setDbFunctionalGroupId(Integer dbFunctionalGroupId) {
        this.dbFunctionalGroupId = dbFunctionalGroupId;
    }

    public FunctionalGroup withDbFunctionalGroupId(Integer dbFunctionalGroupId) {
        this.dbFunctionalGroupId = dbFunctionalGroupId;
        return this;
    }

    @JsonProperty("gs01_functionalIdentifierCode")
    public String getGs01FunctionalIdentifierCode() {
        return gs01FunctionalIdentifierCode;
    }

    @JsonProperty("gs01_functionalIdentifierCode")
    public void setGs01FunctionalIdentifierCode(String gs01FunctionalIdentifierCode) {
        this.gs01FunctionalIdentifierCode = gs01FunctionalIdentifierCode;
    }

    public FunctionalGroup withGs01FunctionalIdentifierCode(String gs01FunctionalIdentifierCode) {
        this.gs01FunctionalIdentifierCode = gs01FunctionalIdentifierCode;
        return this;
    }

    @JsonProperty("gs02_sendersCode")
    public String getGs02SendersCode() {
        return gs02SendersCode;
    }

    @JsonProperty("gs02_sendersCode")
    public void setGs02SendersCode(String gs02SendersCode) {
        this.gs02SendersCode = gs02SendersCode;
    }

    public FunctionalGroup withGs02SendersCode(String gs02SendersCode) {
        this.gs02SendersCode = gs02SendersCode;
        return this;
    }

    @JsonProperty("gs03_receiversCode")
    public String getGs03ReceiversCode() {
        return gs03ReceiversCode;
    }

    @JsonProperty("gs03_receiversCode")
    public void setGs03ReceiversCode(String gs03ReceiversCode) {
        this.gs03ReceiversCode = gs03ReceiversCode;
    }

    public FunctionalGroup withGs03ReceiversCode(String gs03ReceiversCode) {
        this.gs03ReceiversCode = gs03ReceiversCode;
        return this;
    }

    @JsonProperty("gs04_creationDate")
    public String getGs04CreationDate() {
        return gs04CreationDate;
    }

    @JsonProperty("gs04_creationDate")
    public void setGs04CreationDate(String gs04CreationDate) {
        this.gs04CreationDate = gs04CreationDate;
    }

    public FunctionalGroup withGs04CreationDate(String gs04CreationDate) {
        this.gs04CreationDate = gs04CreationDate;
        return this;
    }

    @JsonProperty("gs05_creationTime")
    public String getGs05CreationTime() {
        return gs05CreationTime;
    }

    @JsonProperty("gs05_creationTime")
    public void setGs05CreationTime(String gs05CreationTime) {
        this.gs05CreationTime = gs05CreationTime;
    }

    public FunctionalGroup withGs05CreationTime(String gs05CreationTime) {
        this.gs05CreationTime = gs05CreationTime;
        return this;
    }

    @JsonProperty("gs06_groupControlNo")
    public String getGs06GroupControlNo() {
        return gs06GroupControlNo;
    }

    @JsonProperty("gs06_groupControlNo")
    public void setGs06GroupControlNo(String gs06GroupControlNo) {
        this.gs06GroupControlNo = gs06GroupControlNo;
    }

    public FunctionalGroup withGs06GroupControlNo(String gs06GroupControlNo) {
        this.gs06GroupControlNo = gs06GroupControlNo;
        return this;
    }

    @JsonProperty("gs07_responsibleAgencyCode")
    public String getGs07ResponsibleAgencyCode() {
        return gs07ResponsibleAgencyCode;
    }

    @JsonProperty("gs07_responsibleAgencyCode")
    public void setGs07ResponsibleAgencyCode(String gs07ResponsibleAgencyCode) {
        this.gs07ResponsibleAgencyCode = gs07ResponsibleAgencyCode;
    }

    public FunctionalGroup withGs07ResponsibleAgencyCode(String gs07ResponsibleAgencyCode) {
        this.gs07ResponsibleAgencyCode = gs07ResponsibleAgencyCode;
        return this;
    }

    @JsonProperty("gs08_versionReleaseCode")
    public String getGs08VersionReleaseCode() {
        return gs08VersionReleaseCode;
    }

    @JsonProperty("gs08_versionReleaseCode")
    public void setGs08VersionReleaseCode(String gs08VersionReleaseCode) {
        this.gs08VersionReleaseCode = gs08VersionReleaseCode;
    }

    public FunctionalGroup withGs08VersionReleaseCode(String gs08VersionReleaseCode) {
        this.gs08VersionReleaseCode = gs08VersionReleaseCode;
        return this;
    }

    @JsonProperty("ge01_noOfTransactionSetsIncluded")
    public String getGe01NoOfTransactionSetsIncluded() {
        return ge01NoOfTransactionSetsIncluded;
    }

    @JsonProperty("ge01_noOfTransactionSetsIncluded")
    public void setGe01NoOfTransactionSetsIncluded(String ge01NoOfTransactionSetsIncluded) {
        this.ge01NoOfTransactionSetsIncluded = ge01NoOfTransactionSetsIncluded;
    }

    public FunctionalGroup withGe01NoOfTransactionSetsIncluded(String ge01NoOfTransactionSetsIncluded) {
        this.ge01NoOfTransactionSetsIncluded = ge01NoOfTransactionSetsIncluded;
        return this;
    }

    @JsonProperty("ge02_groupControlNo")
    public String getGe02GroupControlNo() {
        return ge02GroupControlNo;
    }

    @JsonProperty("ge02_groupControlNo")
    public void setGe02GroupControlNo(String ge02GroupControlNo) {
        this.ge02GroupControlNo = ge02GroupControlNo;
    }

    public FunctionalGroup withGe02GroupControlNo(String ge02GroupControlNo) {
        this.ge02GroupControlNo = ge02GroupControlNo;
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

    public FunctionalGroup withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbFunctionalGroupId).append(gs01FunctionalIdentifierCode).append(gs02SendersCode).append(gs03ReceiversCode).append(gs04CreationDate).append(gs05CreationTime).append(gs06GroupControlNo).append(gs07ResponsibleAgencyCode).append(gs08VersionReleaseCode).append(ge01NoOfTransactionSetsIncluded).append(ge02GroupControlNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionalGroup) == false) {
            return false;
        }
        FunctionalGroup rhs = ((FunctionalGroup) other);
        return new EqualsBuilder().append(dbFunctionalGroupId, rhs.dbFunctionalGroupId).append(gs01FunctionalIdentifierCode, rhs.gs01FunctionalIdentifierCode).append(gs02SendersCode, rhs.gs02SendersCode).append(gs03ReceiversCode, rhs.gs03ReceiversCode).append(gs04CreationDate, rhs.gs04CreationDate).append(gs05CreationTime, rhs.gs05CreationTime).append(gs06GroupControlNo, rhs.gs06GroupControlNo).append(gs07ResponsibleAgencyCode, rhs.gs07ResponsibleAgencyCode).append(gs08VersionReleaseCode, rhs.gs08VersionReleaseCode).append(ge01NoOfTransactionSetsIncluded, rhs.ge01NoOfTransactionSetsIncluded).append(ge02GroupControlNo, rhs.ge02GroupControlNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

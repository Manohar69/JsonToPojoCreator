
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
    "dbOtherSubscriberInfoId",
    "otherSubsInfo",
    "otherSubscriberName",
    "otherPayerName",
    "otherPayerRefPrv",
    "otherPayerAttendingPrv",
    "otherPayerRendPrv",
    "otherPayerOperatingPhysician",
    "otherPayerSvcFacilityLoc",
    "otherPayerOtherOperatingPhysician",
    "otherPayerSupervisingProvider",
    "otherPayerBillingPrv",
    "otherPayerAssistantSurgeon"
})
public class OtherSubscriberInfo {

    @JsonProperty("dbOtherSubscriberInfoId")
    private Integer dbOtherSubscriberInfoId;
    @JsonProperty("otherSubsInfo")
    private OtherSubsInfo otherSubsInfo;
    @JsonProperty("otherSubscriberName")
    private OtherSubscriberName otherSubscriberName;
    @JsonProperty("otherPayerName")
    private OtherPayerName otherPayerName;
    @JsonProperty("otherPayerRefPrv")
    private OtherPayerRefPrv otherPayerRefPrv;
    @JsonProperty("otherPayerAttendingPrv")
    private OtherPayerAttendingPrv otherPayerAttendingPrv;
    @JsonProperty("otherPayerRendPrv")
    private OtherPayerRendPrv otherPayerRendPrv;
    @JsonProperty("otherPayerOperatingPhysician")
    private OtherPayerOperatingPhysician otherPayerOperatingPhysician;
    @JsonProperty("otherPayerSvcFacilityLoc")
    private OtherPayerSvcFacilityLoc otherPayerSvcFacilityLoc;
    @JsonProperty("otherPayerOtherOperatingPhysician")
    private OtherPayerOtherOperatingPhysician otherPayerOtherOperatingPhysician;
    @JsonProperty("otherPayerSupervisingProvider")
    private OtherPayerSupervisingProvider otherPayerSupervisingProvider;
    @JsonProperty("otherPayerBillingPrv")
    private OtherPayerBillingPrv otherPayerBillingPrv;
    @JsonProperty("otherPayerAssistantSurgeon")
    private OtherPayerAssistantSurgeon otherPayerAssistantSurgeon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbOtherSubscriberInfoId")
    public Integer getDbOtherSubscriberInfoId() {
        return dbOtherSubscriberInfoId;
    }

    @JsonProperty("dbOtherSubscriberInfoId")
    public void setDbOtherSubscriberInfoId(Integer dbOtherSubscriberInfoId) {
        this.dbOtherSubscriberInfoId = dbOtherSubscriberInfoId;
    }

    public OtherSubscriberInfo withDbOtherSubscriberInfoId(Integer dbOtherSubscriberInfoId) {
        this.dbOtherSubscriberInfoId = dbOtherSubscriberInfoId;
        return this;
    }

    @JsonProperty("otherSubsInfo")
    public OtherSubsInfo getOtherSubsInfo() {
        return otherSubsInfo;
    }

    @JsonProperty("otherSubsInfo")
    public void setOtherSubsInfo(OtherSubsInfo otherSubsInfo) {
        this.otherSubsInfo = otherSubsInfo;
    }

    public OtherSubscriberInfo withOtherSubsInfo(OtherSubsInfo otherSubsInfo) {
        this.otherSubsInfo = otherSubsInfo;
        return this;
    }

    @JsonProperty("otherSubscriberName")
    public OtherSubscriberName getOtherSubscriberName() {
        return otherSubscriberName;
    }

    @JsonProperty("otherSubscriberName")
    public void setOtherSubscriberName(OtherSubscriberName otherSubscriberName) {
        this.otherSubscriberName = otherSubscriberName;
    }

    public OtherSubscriberInfo withOtherSubscriberName(OtherSubscriberName otherSubscriberName) {
        this.otherSubscriberName = otherSubscriberName;
        return this;
    }

    @JsonProperty("otherPayerName")
    public OtherPayerName getOtherPayerName() {
        return otherPayerName;
    }

    @JsonProperty("otherPayerName")
    public void setOtherPayerName(OtherPayerName otherPayerName) {
        this.otherPayerName = otherPayerName;
    }

    public OtherSubscriberInfo withOtherPayerName(OtherPayerName otherPayerName) {
        this.otherPayerName = otherPayerName;
        return this;
    }

    @JsonProperty("otherPayerRefPrv")
    public OtherPayerRefPrv getOtherPayerRefPrv() {
        return otherPayerRefPrv;
    }

    @JsonProperty("otherPayerRefPrv")
    public void setOtherPayerRefPrv(OtherPayerRefPrv otherPayerRefPrv) {
        this.otherPayerRefPrv = otherPayerRefPrv;
    }

    public OtherSubscriberInfo withOtherPayerRefPrv(OtherPayerRefPrv otherPayerRefPrv) {
        this.otherPayerRefPrv = otherPayerRefPrv;
        return this;
    }

    @JsonProperty("otherPayerAttendingPrv")
    public OtherPayerAttendingPrv getOtherPayerAttendingPrv() {
        return otherPayerAttendingPrv;
    }

    @JsonProperty("otherPayerAttendingPrv")
    public void setOtherPayerAttendingPrv(OtherPayerAttendingPrv otherPayerAttendingPrv) {
        this.otherPayerAttendingPrv = otherPayerAttendingPrv;
    }

    public OtherSubscriberInfo withOtherPayerAttendingPrv(OtherPayerAttendingPrv otherPayerAttendingPrv) {
        this.otherPayerAttendingPrv = otherPayerAttendingPrv;
        return this;
    }

    @JsonProperty("otherPayerRendPrv")
    public OtherPayerRendPrv getOtherPayerRendPrv() {
        return otherPayerRendPrv;
    }

    @JsonProperty("otherPayerRendPrv")
    public void setOtherPayerRendPrv(OtherPayerRendPrv otherPayerRendPrv) {
        this.otherPayerRendPrv = otherPayerRendPrv;
    }

    public OtherSubscriberInfo withOtherPayerRendPrv(OtherPayerRendPrv otherPayerRendPrv) {
        this.otherPayerRendPrv = otherPayerRendPrv;
        return this;
    }

    @JsonProperty("otherPayerOperatingPhysician")
    public OtherPayerOperatingPhysician getOtherPayerOperatingPhysician() {
        return otherPayerOperatingPhysician;
    }

    @JsonProperty("otherPayerOperatingPhysician")
    public void setOtherPayerOperatingPhysician(OtherPayerOperatingPhysician otherPayerOperatingPhysician) {
        this.otherPayerOperatingPhysician = otherPayerOperatingPhysician;
    }

    public OtherSubscriberInfo withOtherPayerOperatingPhysician(OtherPayerOperatingPhysician otherPayerOperatingPhysician) {
        this.otherPayerOperatingPhysician = otherPayerOperatingPhysician;
        return this;
    }

    @JsonProperty("otherPayerSvcFacilityLoc")
    public OtherPayerSvcFacilityLoc getOtherPayerSvcFacilityLoc() {
        return otherPayerSvcFacilityLoc;
    }

    @JsonProperty("otherPayerSvcFacilityLoc")
    public void setOtherPayerSvcFacilityLoc(OtherPayerSvcFacilityLoc otherPayerSvcFacilityLoc) {
        this.otherPayerSvcFacilityLoc = otherPayerSvcFacilityLoc;
    }

    public OtherSubscriberInfo withOtherPayerSvcFacilityLoc(OtherPayerSvcFacilityLoc otherPayerSvcFacilityLoc) {
        this.otherPayerSvcFacilityLoc = otherPayerSvcFacilityLoc;
        return this;
    }

    @JsonProperty("otherPayerOtherOperatingPhysician")
    public OtherPayerOtherOperatingPhysician getOtherPayerOtherOperatingPhysician() {
        return otherPayerOtherOperatingPhysician;
    }

    @JsonProperty("otherPayerOtherOperatingPhysician")
    public void setOtherPayerOtherOperatingPhysician(OtherPayerOtherOperatingPhysician otherPayerOtherOperatingPhysician) {
        this.otherPayerOtherOperatingPhysician = otherPayerOtherOperatingPhysician;
    }

    public OtherSubscriberInfo withOtherPayerOtherOperatingPhysician(OtherPayerOtherOperatingPhysician otherPayerOtherOperatingPhysician) {
        this.otherPayerOtherOperatingPhysician = otherPayerOtherOperatingPhysician;
        return this;
    }

    @JsonProperty("otherPayerSupervisingProvider")
    public OtherPayerSupervisingProvider getOtherPayerSupervisingProvider() {
        return otherPayerSupervisingProvider;
    }

    @JsonProperty("otherPayerSupervisingProvider")
    public void setOtherPayerSupervisingProvider(OtherPayerSupervisingProvider otherPayerSupervisingProvider) {
        this.otherPayerSupervisingProvider = otherPayerSupervisingProvider;
    }

    public OtherSubscriberInfo withOtherPayerSupervisingProvider(OtherPayerSupervisingProvider otherPayerSupervisingProvider) {
        this.otherPayerSupervisingProvider = otherPayerSupervisingProvider;
        return this;
    }

    @JsonProperty("otherPayerBillingPrv")
    public OtherPayerBillingPrv getOtherPayerBillingPrv() {
        return otherPayerBillingPrv;
    }

    @JsonProperty("otherPayerBillingPrv")
    public void setOtherPayerBillingPrv(OtherPayerBillingPrv otherPayerBillingPrv) {
        this.otherPayerBillingPrv = otherPayerBillingPrv;
    }

    public OtherSubscriberInfo withOtherPayerBillingPrv(OtherPayerBillingPrv otherPayerBillingPrv) {
        this.otherPayerBillingPrv = otherPayerBillingPrv;
        return this;
    }

    @JsonProperty("otherPayerAssistantSurgeon")
    public OtherPayerAssistantSurgeon getOtherPayerAssistantSurgeon() {
        return otherPayerAssistantSurgeon;
    }

    @JsonProperty("otherPayerAssistantSurgeon")
    public void setOtherPayerAssistantSurgeon(OtherPayerAssistantSurgeon otherPayerAssistantSurgeon) {
        this.otherPayerAssistantSurgeon = otherPayerAssistantSurgeon;
    }

    public OtherSubscriberInfo withOtherPayerAssistantSurgeon(OtherPayerAssistantSurgeon otherPayerAssistantSurgeon) {
        this.otherPayerAssistantSurgeon = otherPayerAssistantSurgeon;
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

    public OtherSubscriberInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbOtherSubscriberInfoId).append(otherSubsInfo).append(otherSubscriberName).append(otherPayerName).append(otherPayerRefPrv).append(otherPayerAttendingPrv).append(otherPayerRendPrv).append(otherPayerOperatingPhysician).append(otherPayerSvcFacilityLoc).append(otherPayerOtherOperatingPhysician).append(otherPayerSupervisingProvider).append(otherPayerBillingPrv).append(otherPayerAssistantSurgeon).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherSubscriberInfo) == false) {
            return false;
        }
        OtherSubscriberInfo rhs = ((OtherSubscriberInfo) other);
        return new EqualsBuilder().append(dbOtherSubscriberInfoId, rhs.dbOtherSubscriberInfoId).append(otherSubsInfo, rhs.otherSubsInfo).append(otherSubscriberName, rhs.otherSubscriberName).append(otherPayerName, rhs.otherPayerName).append(otherPayerRefPrv, rhs.otherPayerRefPrv).append(otherPayerAttendingPrv, rhs.otherPayerAttendingPrv).append(otherPayerRendPrv, rhs.otherPayerRendPrv).append(otherPayerOperatingPhysician, rhs.otherPayerOperatingPhysician).append(otherPayerSvcFacilityLoc, rhs.otherPayerSvcFacilityLoc).append(otherPayerOtherOperatingPhysician, rhs.otherPayerOtherOperatingPhysician).append(otherPayerSupervisingProvider, rhs.otherPayerSupervisingProvider).append(otherPayerBillingPrv, rhs.otherPayerBillingPrv).append(otherPayerAssistantSurgeon, rhs.otherPayerAssistantSurgeon).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

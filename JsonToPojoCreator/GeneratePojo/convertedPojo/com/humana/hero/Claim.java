
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
    "dbClaimId",
    "claimInfo",
    "refPrvName",
    "attendingPrvName",
    "rendPrvName",
    "operatingPhyscianName",
    "svcFacilityLocation",
    "otherOperatingPhysicianName",
    "supervisingPrvName",
    "assistantSurgeonName",
    "ambulancePickupLoc",
    "ambulanceDropoffLoc"
})
public class Claim {

    @JsonProperty("dbClaimId")
    private Integer dbClaimId;
    @JsonProperty("claimInfo")
    private ClaimInfo claimInfo;
    @JsonProperty("refPrvName")
    private List<RefPrvName> refPrvName = new ArrayList<RefPrvName>();
    @JsonProperty("attendingPrvName")
    private AttendingPrvName attendingPrvName;
    @JsonProperty("rendPrvName")
    private RendPrvName rendPrvName;
    @JsonProperty("operatingPhyscianName")
    private OperatingPhyscianName operatingPhyscianName;
    @JsonProperty("svcFacilityLocation")
    private SvcFacilityLocation svcFacilityLocation;
    @JsonProperty("otherOperatingPhysicianName")
    private OtherOperatingPhysicianName otherOperatingPhysicianName;
    @JsonProperty("supervisingPrvName")
    private SupervisingPrvName supervisingPrvName;
    @JsonProperty("assistantSurgeonName")
    private AssistantSurgeonName assistantSurgeonName;
    @JsonProperty("ambulancePickupLoc")
    private AmbulancePickupLoc ambulancePickupLoc;
    @JsonProperty("ambulanceDropoffLoc")
    private AmbulanceDropoffLoc ambulanceDropoffLoc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbClaimId")
    public Integer getDbClaimId() {
        return dbClaimId;
    }

    @JsonProperty("dbClaimId")
    public void setDbClaimId(Integer dbClaimId) {
        this.dbClaimId = dbClaimId;
    }

    public Claim withDbClaimId(Integer dbClaimId) {
        this.dbClaimId = dbClaimId;
        return this;
    }

    @JsonProperty("claimInfo")
    public ClaimInfo getClaimInfo() {
        return claimInfo;
    }

    @JsonProperty("claimInfo")
    public void setClaimInfo(ClaimInfo claimInfo) {
        this.claimInfo = claimInfo;
    }

    public Claim withClaimInfo(ClaimInfo claimInfo) {
        this.claimInfo = claimInfo;
        return this;
    }

    @JsonProperty("refPrvName")
    public List<RefPrvName> getRefPrvName() {
        return refPrvName;
    }

    @JsonProperty("refPrvName")
    public void setRefPrvName(List<RefPrvName> refPrvName) {
        this.refPrvName = refPrvName;
    }

    public Claim withRefPrvName(List<RefPrvName> refPrvName) {
        this.refPrvName = refPrvName;
        return this;
    }

    @JsonProperty("attendingPrvName")
    public AttendingPrvName getAttendingPrvName() {
        return attendingPrvName;
    }

    @JsonProperty("attendingPrvName")
    public void setAttendingPrvName(AttendingPrvName attendingPrvName) {
        this.attendingPrvName = attendingPrvName;
    }

    public Claim withAttendingPrvName(AttendingPrvName attendingPrvName) {
        this.attendingPrvName = attendingPrvName;
        return this;
    }

    @JsonProperty("rendPrvName")
    public RendPrvName getRendPrvName() {
        return rendPrvName;
    }

    @JsonProperty("rendPrvName")
    public void setRendPrvName(RendPrvName rendPrvName) {
        this.rendPrvName = rendPrvName;
    }

    public Claim withRendPrvName(RendPrvName rendPrvName) {
        this.rendPrvName = rendPrvName;
        return this;
    }

    @JsonProperty("operatingPhyscianName")
    public OperatingPhyscianName getOperatingPhyscianName() {
        return operatingPhyscianName;
    }

    @JsonProperty("operatingPhyscianName")
    public void setOperatingPhyscianName(OperatingPhyscianName operatingPhyscianName) {
        this.operatingPhyscianName = operatingPhyscianName;
    }

    public Claim withOperatingPhyscianName(OperatingPhyscianName operatingPhyscianName) {
        this.operatingPhyscianName = operatingPhyscianName;
        return this;
    }

    @JsonProperty("svcFacilityLocation")
    public SvcFacilityLocation getSvcFacilityLocation() {
        return svcFacilityLocation;
    }

    @JsonProperty("svcFacilityLocation")
    public void setSvcFacilityLocation(SvcFacilityLocation svcFacilityLocation) {
        this.svcFacilityLocation = svcFacilityLocation;
    }

    public Claim withSvcFacilityLocation(SvcFacilityLocation svcFacilityLocation) {
        this.svcFacilityLocation = svcFacilityLocation;
        return this;
    }

    @JsonProperty("otherOperatingPhysicianName")
    public OtherOperatingPhysicianName getOtherOperatingPhysicianName() {
        return otherOperatingPhysicianName;
    }

    @JsonProperty("otherOperatingPhysicianName")
    public void setOtherOperatingPhysicianName(OtherOperatingPhysicianName otherOperatingPhysicianName) {
        this.otherOperatingPhysicianName = otherOperatingPhysicianName;
    }

    public Claim withOtherOperatingPhysicianName(OtherOperatingPhysicianName otherOperatingPhysicianName) {
        this.otherOperatingPhysicianName = otherOperatingPhysicianName;
        return this;
    }

    @JsonProperty("supervisingPrvName")
    public SupervisingPrvName getSupervisingPrvName() {
        return supervisingPrvName;
    }

    @JsonProperty("supervisingPrvName")
    public void setSupervisingPrvName(SupervisingPrvName supervisingPrvName) {
        this.supervisingPrvName = supervisingPrvName;
    }

    public Claim withSupervisingPrvName(SupervisingPrvName supervisingPrvName) {
        this.supervisingPrvName = supervisingPrvName;
        return this;
    }

    @JsonProperty("assistantSurgeonName")
    public AssistantSurgeonName getAssistantSurgeonName() {
        return assistantSurgeonName;
    }

    @JsonProperty("assistantSurgeonName")
    public void setAssistantSurgeonName(AssistantSurgeonName assistantSurgeonName) {
        this.assistantSurgeonName = assistantSurgeonName;
    }

    public Claim withAssistantSurgeonName(AssistantSurgeonName assistantSurgeonName) {
        this.assistantSurgeonName = assistantSurgeonName;
        return this;
    }

    @JsonProperty("ambulancePickupLoc")
    public AmbulancePickupLoc getAmbulancePickupLoc() {
        return ambulancePickupLoc;
    }

    @JsonProperty("ambulancePickupLoc")
    public void setAmbulancePickupLoc(AmbulancePickupLoc ambulancePickupLoc) {
        this.ambulancePickupLoc = ambulancePickupLoc;
    }

    public Claim withAmbulancePickupLoc(AmbulancePickupLoc ambulancePickupLoc) {
        this.ambulancePickupLoc = ambulancePickupLoc;
        return this;
    }

    @JsonProperty("ambulanceDropoffLoc")
    public AmbulanceDropoffLoc getAmbulanceDropoffLoc() {
        return ambulanceDropoffLoc;
    }

    @JsonProperty("ambulanceDropoffLoc")
    public void setAmbulanceDropoffLoc(AmbulanceDropoffLoc ambulanceDropoffLoc) {
        this.ambulanceDropoffLoc = ambulanceDropoffLoc;
    }

    public Claim withAmbulanceDropoffLoc(AmbulanceDropoffLoc ambulanceDropoffLoc) {
        this.ambulanceDropoffLoc = ambulanceDropoffLoc;
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

    public Claim withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbClaimId).append(claimInfo).append(refPrvName).append(attendingPrvName).append(rendPrvName).append(operatingPhyscianName).append(svcFacilityLocation).append(otherOperatingPhysicianName).append(supervisingPrvName).append(assistantSurgeonName).append(ambulancePickupLoc).append(ambulanceDropoffLoc).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Claim) == false) {
            return false;
        }
        Claim rhs = ((Claim) other);
        return new EqualsBuilder().append(dbClaimId, rhs.dbClaimId).append(claimInfo, rhs.claimInfo).append(refPrvName, rhs.refPrvName).append(attendingPrvName, rhs.attendingPrvName).append(rendPrvName, rhs.rendPrvName).append(operatingPhyscianName, rhs.operatingPhyscianName).append(svcFacilityLocation, rhs.svcFacilityLocation).append(otherOperatingPhysicianName, rhs.otherOperatingPhysicianName).append(supervisingPrvName, rhs.supervisingPrvName).append(assistantSurgeonName, rhs.assistantSurgeonName).append(ambulancePickupLoc, rhs.ambulancePickupLoc).append(ambulanceDropoffLoc, rhs.ambulanceDropoffLoc).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "dbserviceLineId",
    "svcLineNo",
    "drugIdentification",
    "rendPrvName",
    "operatingPhysicanName",
    "purchasedSvcProvName",
    "otherOperatingPhysicianName",
    "assistantSurgeonName",
    "svcFacilityLocName",
    "supervisingPrvName",
    "orderingPrvName",
    "refPrvName",
    "ambulancePickupLoc",
    "ambulanceDropoffLoc"
})
public class Line {

    @JsonProperty("dbserviceLineId")
    private Integer dbserviceLineId;
    @JsonProperty("svcLineNo")
    private SvcLineNo svcLineNo;
    @JsonProperty("drugIdentification")
    private DrugIdentification drugIdentification;
    @JsonProperty("rendPrvName")
    private RendPrvName_ rendPrvName;
    @JsonProperty("operatingPhysicanName")
    private OperatingPhysicanName operatingPhysicanName;
    @JsonProperty("purchasedSvcProvName")
    private PurchasedSvcProvName purchasedSvcProvName;
    @JsonProperty("otherOperatingPhysicianName")
    private OtherOperatingPhysicianName_ otherOperatingPhysicianName;
    @JsonProperty("assistantSurgeonName")
    private AssistantSurgeonName_ assistantSurgeonName;
    @JsonProperty("svcFacilityLocName")
    private SvcFacilityLocName svcFacilityLocName;
    @JsonProperty("supervisingPrvName")
    private SupervisingPrvName_ supervisingPrvName;
    @JsonProperty("orderingPrvName")
    private OrderingPrvName orderingPrvName;
    @JsonProperty("refPrvName")
    private List<RefPrvName_> refPrvName = new ArrayList<RefPrvName_>();
    @JsonProperty("ambulancePickupLoc")
    private AmbulancePickupLoc_ ambulancePickupLoc;
    @JsonProperty("ambulanceDropoffLoc")
    private AmbulanceDropoffLoc_ ambulanceDropoffLoc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbserviceLineId")
    public Integer getDbserviceLineId() {
        return dbserviceLineId;
    }

    @JsonProperty("dbserviceLineId")
    public void setDbserviceLineId(Integer dbserviceLineId) {
        this.dbserviceLineId = dbserviceLineId;
    }

    public Line withDbserviceLineId(Integer dbserviceLineId) {
        this.dbserviceLineId = dbserviceLineId;
        return this;
    }

    @JsonProperty("svcLineNo")
    public SvcLineNo getSvcLineNo() {
        return svcLineNo;
    }

    @JsonProperty("svcLineNo")
    public void setSvcLineNo(SvcLineNo svcLineNo) {
        this.svcLineNo = svcLineNo;
    }

    public Line withSvcLineNo(SvcLineNo svcLineNo) {
        this.svcLineNo = svcLineNo;
        return this;
    }

    @JsonProperty("drugIdentification")
    public DrugIdentification getDrugIdentification() {
        return drugIdentification;
    }

    @JsonProperty("drugIdentification")
    public void setDrugIdentification(DrugIdentification drugIdentification) {
        this.drugIdentification = drugIdentification;
    }

    public Line withDrugIdentification(DrugIdentification drugIdentification) {
        this.drugIdentification = drugIdentification;
        return this;
    }

    @JsonProperty("rendPrvName")
    public RendPrvName_ getRendPrvName() {
        return rendPrvName;
    }

    @JsonProperty("rendPrvName")
    public void setRendPrvName(RendPrvName_ rendPrvName) {
        this.rendPrvName = rendPrvName;
    }

    public Line withRendPrvName(RendPrvName_ rendPrvName) {
        this.rendPrvName = rendPrvName;
        return this;
    }

    @JsonProperty("operatingPhysicanName")
    public OperatingPhysicanName getOperatingPhysicanName() {
        return operatingPhysicanName;
    }

    @JsonProperty("operatingPhysicanName")
    public void setOperatingPhysicanName(OperatingPhysicanName operatingPhysicanName) {
        this.operatingPhysicanName = operatingPhysicanName;
    }

    public Line withOperatingPhysicanName(OperatingPhysicanName operatingPhysicanName) {
        this.operatingPhysicanName = operatingPhysicanName;
        return this;
    }

    @JsonProperty("purchasedSvcProvName")
    public PurchasedSvcProvName getPurchasedSvcProvName() {
        return purchasedSvcProvName;
    }

    @JsonProperty("purchasedSvcProvName")
    public void setPurchasedSvcProvName(PurchasedSvcProvName purchasedSvcProvName) {
        this.purchasedSvcProvName = purchasedSvcProvName;
    }

    public Line withPurchasedSvcProvName(PurchasedSvcProvName purchasedSvcProvName) {
        this.purchasedSvcProvName = purchasedSvcProvName;
        return this;
    }

    @JsonProperty("otherOperatingPhysicianName")
    public OtherOperatingPhysicianName_ getOtherOperatingPhysicianName() {
        return otherOperatingPhysicianName;
    }

    @JsonProperty("otherOperatingPhysicianName")
    public void setOtherOperatingPhysicianName(OtherOperatingPhysicianName_ otherOperatingPhysicianName) {
        this.otherOperatingPhysicianName = otherOperatingPhysicianName;
    }

    public Line withOtherOperatingPhysicianName(OtherOperatingPhysicianName_ otherOperatingPhysicianName) {
        this.otherOperatingPhysicianName = otherOperatingPhysicianName;
        return this;
    }

    @JsonProperty("assistantSurgeonName")
    public AssistantSurgeonName_ getAssistantSurgeonName() {
        return assistantSurgeonName;
    }

    @JsonProperty("assistantSurgeonName")
    public void setAssistantSurgeonName(AssistantSurgeonName_ assistantSurgeonName) {
        this.assistantSurgeonName = assistantSurgeonName;
    }

    public Line withAssistantSurgeonName(AssistantSurgeonName_ assistantSurgeonName) {
        this.assistantSurgeonName = assistantSurgeonName;
        return this;
    }

    @JsonProperty("svcFacilityLocName")
    public SvcFacilityLocName getSvcFacilityLocName() {
        return svcFacilityLocName;
    }

    @JsonProperty("svcFacilityLocName")
    public void setSvcFacilityLocName(SvcFacilityLocName svcFacilityLocName) {
        this.svcFacilityLocName = svcFacilityLocName;
    }

    public Line withSvcFacilityLocName(SvcFacilityLocName svcFacilityLocName) {
        this.svcFacilityLocName = svcFacilityLocName;
        return this;
    }

    @JsonProperty("supervisingPrvName")
    public SupervisingPrvName_ getSupervisingPrvName() {
        return supervisingPrvName;
    }

    @JsonProperty("supervisingPrvName")
    public void setSupervisingPrvName(SupervisingPrvName_ supervisingPrvName) {
        this.supervisingPrvName = supervisingPrvName;
    }

    public Line withSupervisingPrvName(SupervisingPrvName_ supervisingPrvName) {
        this.supervisingPrvName = supervisingPrvName;
        return this;
    }

    @JsonProperty("orderingPrvName")
    public OrderingPrvName getOrderingPrvName() {
        return orderingPrvName;
    }

    @JsonProperty("orderingPrvName")
    public void setOrderingPrvName(OrderingPrvName orderingPrvName) {
        this.orderingPrvName = orderingPrvName;
    }

    public Line withOrderingPrvName(OrderingPrvName orderingPrvName) {
        this.orderingPrvName = orderingPrvName;
        return this;
    }

    @JsonProperty("refPrvName")
    public List<RefPrvName_> getRefPrvName() {
        return refPrvName;
    }

    @JsonProperty("refPrvName")
    public void setRefPrvName(List<RefPrvName_> refPrvName) {
        this.refPrvName = refPrvName;
    }

    public Line withRefPrvName(List<RefPrvName_> refPrvName) {
        this.refPrvName = refPrvName;
        return this;
    }

    @JsonProperty("ambulancePickupLoc")
    public AmbulancePickupLoc_ getAmbulancePickupLoc() {
        return ambulancePickupLoc;
    }

    @JsonProperty("ambulancePickupLoc")
    public void setAmbulancePickupLoc(AmbulancePickupLoc_ ambulancePickupLoc) {
        this.ambulancePickupLoc = ambulancePickupLoc;
    }

    public Line withAmbulancePickupLoc(AmbulancePickupLoc_ ambulancePickupLoc) {
        this.ambulancePickupLoc = ambulancePickupLoc;
        return this;
    }

    @JsonProperty("ambulanceDropoffLoc")
    public AmbulanceDropoffLoc_ getAmbulanceDropoffLoc() {
        return ambulanceDropoffLoc;
    }

    @JsonProperty("ambulanceDropoffLoc")
    public void setAmbulanceDropoffLoc(AmbulanceDropoffLoc_ ambulanceDropoffLoc) {
        this.ambulanceDropoffLoc = ambulanceDropoffLoc;
    }

    public Line withAmbulanceDropoffLoc(AmbulanceDropoffLoc_ ambulanceDropoffLoc) {
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

    public Line withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbserviceLineId).append(svcLineNo).append(drugIdentification).append(rendPrvName).append(operatingPhysicanName).append(purchasedSvcProvName).append(otherOperatingPhysicianName).append(assistantSurgeonName).append(svcFacilityLocName).append(supervisingPrvName).append(orderingPrvName).append(refPrvName).append(ambulancePickupLoc).append(ambulanceDropoffLoc).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Line) == false) {
            return false;
        }
        Line rhs = ((Line) other);
        return new EqualsBuilder().append(dbserviceLineId, rhs.dbserviceLineId).append(svcLineNo, rhs.svcLineNo).append(drugIdentification, rhs.drugIdentification).append(rendPrvName, rhs.rendPrvName).append(operatingPhysicanName, rhs.operatingPhysicanName).append(purchasedSvcProvName, rhs.purchasedSvcProvName).append(otherOperatingPhysicianName, rhs.otherOperatingPhysicianName).append(assistantSurgeonName, rhs.assistantSurgeonName).append(svcFacilityLocName, rhs.svcFacilityLocName).append(supervisingPrvName, rhs.supervisingPrvName).append(orderingPrvName, rhs.orderingPrvName).append(refPrvName, rhs.refPrvName).append(ambulancePickupLoc, rhs.ambulancePickupLoc).append(ambulanceDropoffLoc, rhs.ambulanceDropoffLoc).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

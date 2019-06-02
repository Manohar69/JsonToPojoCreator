
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
    "hl01_patientHierarchicalIdNo",
    "hl02_patientHierarchicalParentIdNo",
    "hl03_patientHierarchicalLevelCode",
    "hl04_patientHierarchicalChildCode",
    "pat01_patientIndividualRelationshipCode",
    "pat05_patientDeathDateQlfr",
    "pat06_patientDeathDate",
    "pat07_unitOfMeasurementCodes",
    "pat08_patientWeightPounds",
    "pat09_pregnancyIndicator"
})
public class PatientHierLevel {

    @JsonProperty("hl01_patientHierarchicalIdNo")
    private String hl01PatientHierarchicalIdNo;
    @JsonProperty("hl02_patientHierarchicalParentIdNo")
    private String hl02PatientHierarchicalParentIdNo;
    @JsonProperty("hl03_patientHierarchicalLevelCode")
    private String hl03PatientHierarchicalLevelCode;
    @JsonProperty("hl04_patientHierarchicalChildCode")
    private String hl04PatientHierarchicalChildCode;
    @JsonProperty("pat01_patientIndividualRelationshipCode")
    private String pat01PatientIndividualRelationshipCode;
    @JsonProperty("pat05_patientDeathDateQlfr")
    private String pat05PatientDeathDateQlfr;
    @JsonProperty("pat06_patientDeathDate")
    private String pat06PatientDeathDate;
    @JsonProperty("pat07_unitOfMeasurementCodes")
    private String pat07UnitOfMeasurementCodes;
    @JsonProperty("pat08_patientWeightPounds")
    private String pat08PatientWeightPounds;
    @JsonProperty("pat09_pregnancyIndicator")
    private String pat09PregnancyIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hl01_patientHierarchicalIdNo")
    public String getHl01PatientHierarchicalIdNo() {
        return hl01PatientHierarchicalIdNo;
    }

    @JsonProperty("hl01_patientHierarchicalIdNo")
    public void setHl01PatientHierarchicalIdNo(String hl01PatientHierarchicalIdNo) {
        this.hl01PatientHierarchicalIdNo = hl01PatientHierarchicalIdNo;
    }

    public PatientHierLevel withHl01PatientHierarchicalIdNo(String hl01PatientHierarchicalIdNo) {
        this.hl01PatientHierarchicalIdNo = hl01PatientHierarchicalIdNo;
        return this;
    }

    @JsonProperty("hl02_patientHierarchicalParentIdNo")
    public String getHl02PatientHierarchicalParentIdNo() {
        return hl02PatientHierarchicalParentIdNo;
    }

    @JsonProperty("hl02_patientHierarchicalParentIdNo")
    public void setHl02PatientHierarchicalParentIdNo(String hl02PatientHierarchicalParentIdNo) {
        this.hl02PatientHierarchicalParentIdNo = hl02PatientHierarchicalParentIdNo;
    }

    public PatientHierLevel withHl02PatientHierarchicalParentIdNo(String hl02PatientHierarchicalParentIdNo) {
        this.hl02PatientHierarchicalParentIdNo = hl02PatientHierarchicalParentIdNo;
        return this;
    }

    @JsonProperty("hl03_patientHierarchicalLevelCode")
    public String getHl03PatientHierarchicalLevelCode() {
        return hl03PatientHierarchicalLevelCode;
    }

    @JsonProperty("hl03_patientHierarchicalLevelCode")
    public void setHl03PatientHierarchicalLevelCode(String hl03PatientHierarchicalLevelCode) {
        this.hl03PatientHierarchicalLevelCode = hl03PatientHierarchicalLevelCode;
    }

    public PatientHierLevel withHl03PatientHierarchicalLevelCode(String hl03PatientHierarchicalLevelCode) {
        this.hl03PatientHierarchicalLevelCode = hl03PatientHierarchicalLevelCode;
        return this;
    }

    @JsonProperty("hl04_patientHierarchicalChildCode")
    public String getHl04PatientHierarchicalChildCode() {
        return hl04PatientHierarchicalChildCode;
    }

    @JsonProperty("hl04_patientHierarchicalChildCode")
    public void setHl04PatientHierarchicalChildCode(String hl04PatientHierarchicalChildCode) {
        this.hl04PatientHierarchicalChildCode = hl04PatientHierarchicalChildCode;
    }

    public PatientHierLevel withHl04PatientHierarchicalChildCode(String hl04PatientHierarchicalChildCode) {
        this.hl04PatientHierarchicalChildCode = hl04PatientHierarchicalChildCode;
        return this;
    }

    @JsonProperty("pat01_patientIndividualRelationshipCode")
    public String getPat01PatientIndividualRelationshipCode() {
        return pat01PatientIndividualRelationshipCode;
    }

    @JsonProperty("pat01_patientIndividualRelationshipCode")
    public void setPat01PatientIndividualRelationshipCode(String pat01PatientIndividualRelationshipCode) {
        this.pat01PatientIndividualRelationshipCode = pat01PatientIndividualRelationshipCode;
    }

    public PatientHierLevel withPat01PatientIndividualRelationshipCode(String pat01PatientIndividualRelationshipCode) {
        this.pat01PatientIndividualRelationshipCode = pat01PatientIndividualRelationshipCode;
        return this;
    }

    @JsonProperty("pat05_patientDeathDateQlfr")
    public String getPat05PatientDeathDateQlfr() {
        return pat05PatientDeathDateQlfr;
    }

    @JsonProperty("pat05_patientDeathDateQlfr")
    public void setPat05PatientDeathDateQlfr(String pat05PatientDeathDateQlfr) {
        this.pat05PatientDeathDateQlfr = pat05PatientDeathDateQlfr;
    }

    public PatientHierLevel withPat05PatientDeathDateQlfr(String pat05PatientDeathDateQlfr) {
        this.pat05PatientDeathDateQlfr = pat05PatientDeathDateQlfr;
        return this;
    }

    @JsonProperty("pat06_patientDeathDate")
    public String getPat06PatientDeathDate() {
        return pat06PatientDeathDate;
    }

    @JsonProperty("pat06_patientDeathDate")
    public void setPat06PatientDeathDate(String pat06PatientDeathDate) {
        this.pat06PatientDeathDate = pat06PatientDeathDate;
    }

    public PatientHierLevel withPat06PatientDeathDate(String pat06PatientDeathDate) {
        this.pat06PatientDeathDate = pat06PatientDeathDate;
        return this;
    }

    @JsonProperty("pat07_unitOfMeasurementCodes")
    public String getPat07UnitOfMeasurementCodes() {
        return pat07UnitOfMeasurementCodes;
    }

    @JsonProperty("pat07_unitOfMeasurementCodes")
    public void setPat07UnitOfMeasurementCodes(String pat07UnitOfMeasurementCodes) {
        this.pat07UnitOfMeasurementCodes = pat07UnitOfMeasurementCodes;
    }

    public PatientHierLevel withPat07UnitOfMeasurementCodes(String pat07UnitOfMeasurementCodes) {
        this.pat07UnitOfMeasurementCodes = pat07UnitOfMeasurementCodes;
        return this;
    }

    @JsonProperty("pat08_patientWeightPounds")
    public String getPat08PatientWeightPounds() {
        return pat08PatientWeightPounds;
    }

    @JsonProperty("pat08_patientWeightPounds")
    public void setPat08PatientWeightPounds(String pat08PatientWeightPounds) {
        this.pat08PatientWeightPounds = pat08PatientWeightPounds;
    }

    public PatientHierLevel withPat08PatientWeightPounds(String pat08PatientWeightPounds) {
        this.pat08PatientWeightPounds = pat08PatientWeightPounds;
        return this;
    }

    @JsonProperty("pat09_pregnancyIndicator")
    public String getPat09PregnancyIndicator() {
        return pat09PregnancyIndicator;
    }

    @JsonProperty("pat09_pregnancyIndicator")
    public void setPat09PregnancyIndicator(String pat09PregnancyIndicator) {
        this.pat09PregnancyIndicator = pat09PregnancyIndicator;
    }

    public PatientHierLevel withPat09PregnancyIndicator(String pat09PregnancyIndicator) {
        this.pat09PregnancyIndicator = pat09PregnancyIndicator;
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

    public PatientHierLevel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hl01PatientHierarchicalIdNo).append(hl02PatientHierarchicalParentIdNo).append(hl03PatientHierarchicalLevelCode).append(hl04PatientHierarchicalChildCode).append(pat01PatientIndividualRelationshipCode).append(pat05PatientDeathDateQlfr).append(pat06PatientDeathDate).append(pat07UnitOfMeasurementCodes).append(pat08PatientWeightPounds).append(pat09PregnancyIndicator).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatientHierLevel) == false) {
            return false;
        }
        PatientHierLevel rhs = ((PatientHierLevel) other);
        return new EqualsBuilder().append(hl01PatientHierarchicalIdNo, rhs.hl01PatientHierarchicalIdNo).append(hl02PatientHierarchicalParentIdNo, rhs.hl02PatientHierarchicalParentIdNo).append(hl03PatientHierarchicalLevelCode, rhs.hl03PatientHierarchicalLevelCode).append(hl04PatientHierarchicalChildCode, rhs.hl04PatientHierarchicalChildCode).append(pat01PatientIndividualRelationshipCode, rhs.pat01PatientIndividualRelationshipCode).append(pat05PatientDeathDateQlfr, rhs.pat05PatientDeathDateQlfr).append(pat06PatientDeathDate, rhs.pat06PatientDeathDate).append(pat07UnitOfMeasurementCodes, rhs.pat07UnitOfMeasurementCodes).append(pat08PatientWeightPounds, rhs.pat08PatientWeightPounds).append(pat09PregnancyIndicator, rhs.pat09PregnancyIndicator).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "dbDependentId",
    "patientHierLevel",
    "patientName"
})
public class Dependant {

    @JsonProperty("dbDependentId")
    private Integer dbDependentId;
    @JsonProperty("patientHierLevel")
    private PatientHierLevel patientHierLevel;
    @JsonProperty("patientName")
    private PatientName patientName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbDependentId")
    public Integer getDbDependentId() {
        return dbDependentId;
    }

    @JsonProperty("dbDependentId")
    public void setDbDependentId(Integer dbDependentId) {
        this.dbDependentId = dbDependentId;
    }

    public Dependant withDbDependentId(Integer dbDependentId) {
        this.dbDependentId = dbDependentId;
        return this;
    }

    @JsonProperty("patientHierLevel")
    public PatientHierLevel getPatientHierLevel() {
        return patientHierLevel;
    }

    @JsonProperty("patientHierLevel")
    public void setPatientHierLevel(PatientHierLevel patientHierLevel) {
        this.patientHierLevel = patientHierLevel;
    }

    public Dependant withPatientHierLevel(PatientHierLevel patientHierLevel) {
        this.patientHierLevel = patientHierLevel;
        return this;
    }

    @JsonProperty("patientName")
    public PatientName getPatientName() {
        return patientName;
    }

    @JsonProperty("patientName")
    public void setPatientName(PatientName patientName) {
        this.patientName = patientName;
    }

    public Dependant withPatientName(PatientName patientName) {
        this.patientName = patientName;
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

    public Dependant withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbDependentId).append(patientHierLevel).append(patientName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dependant) == false) {
            return false;
        }
        Dependant rhs = ((Dependant) other);
        return new EqualsBuilder().append(dbDependentId, rhs.dbDependentId).append(patientHierLevel, rhs.patientHierLevel).append(patientName, rhs.patientName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

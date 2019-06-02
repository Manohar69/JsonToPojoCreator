
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
    "lin02_nationalDrugCodeQlfr",
    "lin03_nationalDrugCode",
    "ctp04_nationalDrugUnitCount",
    "ctp05_unitOfMeasurement",
    "ctp05_01_unitMeasurementCode",
    "ref01_prescriptionQlfr",
    "ref02_prescriptionNo"
})
public class DrugIdentification {

    @JsonProperty("lin02_nationalDrugCodeQlfr")
    private String lin02NationalDrugCodeQlfr;
    @JsonProperty("lin03_nationalDrugCode")
    private String lin03NationalDrugCode;
    @JsonProperty("ctp04_nationalDrugUnitCount")
    private String ctp04NationalDrugUnitCount;
    @JsonProperty("ctp05_unitOfMeasurement")
    private String ctp05UnitOfMeasurement;
    @JsonProperty("ctp05_01_unitMeasurementCode")
    private String ctp0501UnitMeasurementCode;
    @JsonProperty("ref01_prescriptionQlfr")
    private String ref01PrescriptionQlfr;
    @JsonProperty("ref02_prescriptionNo")
    private String ref02PrescriptionNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lin02_nationalDrugCodeQlfr")
    public String getLin02NationalDrugCodeQlfr() {
        return lin02NationalDrugCodeQlfr;
    }

    @JsonProperty("lin02_nationalDrugCodeQlfr")
    public void setLin02NationalDrugCodeQlfr(String lin02NationalDrugCodeQlfr) {
        this.lin02NationalDrugCodeQlfr = lin02NationalDrugCodeQlfr;
    }

    public DrugIdentification withLin02NationalDrugCodeQlfr(String lin02NationalDrugCodeQlfr) {
        this.lin02NationalDrugCodeQlfr = lin02NationalDrugCodeQlfr;
        return this;
    }

    @JsonProperty("lin03_nationalDrugCode")
    public String getLin03NationalDrugCode() {
        return lin03NationalDrugCode;
    }

    @JsonProperty("lin03_nationalDrugCode")
    public void setLin03NationalDrugCode(String lin03NationalDrugCode) {
        this.lin03NationalDrugCode = lin03NationalDrugCode;
    }

    public DrugIdentification withLin03NationalDrugCode(String lin03NationalDrugCode) {
        this.lin03NationalDrugCode = lin03NationalDrugCode;
        return this;
    }

    @JsonProperty("ctp04_nationalDrugUnitCount")
    public String getCtp04NationalDrugUnitCount() {
        return ctp04NationalDrugUnitCount;
    }

    @JsonProperty("ctp04_nationalDrugUnitCount")
    public void setCtp04NationalDrugUnitCount(String ctp04NationalDrugUnitCount) {
        this.ctp04NationalDrugUnitCount = ctp04NationalDrugUnitCount;
    }

    public DrugIdentification withCtp04NationalDrugUnitCount(String ctp04NationalDrugUnitCount) {
        this.ctp04NationalDrugUnitCount = ctp04NationalDrugUnitCount;
        return this;
    }

    @JsonProperty("ctp05_unitOfMeasurement")
    public String getCtp05UnitOfMeasurement() {
        return ctp05UnitOfMeasurement;
    }

    @JsonProperty("ctp05_unitOfMeasurement")
    public void setCtp05UnitOfMeasurement(String ctp05UnitOfMeasurement) {
        this.ctp05UnitOfMeasurement = ctp05UnitOfMeasurement;
    }

    public DrugIdentification withCtp05UnitOfMeasurement(String ctp05UnitOfMeasurement) {
        this.ctp05UnitOfMeasurement = ctp05UnitOfMeasurement;
        return this;
    }

    @JsonProperty("ctp05_01_unitMeasurementCode")
    public String getCtp0501UnitMeasurementCode() {
        return ctp0501UnitMeasurementCode;
    }

    @JsonProperty("ctp05_01_unitMeasurementCode")
    public void setCtp0501UnitMeasurementCode(String ctp0501UnitMeasurementCode) {
        this.ctp0501UnitMeasurementCode = ctp0501UnitMeasurementCode;
    }

    public DrugIdentification withCtp0501UnitMeasurementCode(String ctp0501UnitMeasurementCode) {
        this.ctp0501UnitMeasurementCode = ctp0501UnitMeasurementCode;
        return this;
    }

    @JsonProperty("ref01_prescriptionQlfr")
    public String getRef01PrescriptionQlfr() {
        return ref01PrescriptionQlfr;
    }

    @JsonProperty("ref01_prescriptionQlfr")
    public void setRef01PrescriptionQlfr(String ref01PrescriptionQlfr) {
        this.ref01PrescriptionQlfr = ref01PrescriptionQlfr;
    }

    public DrugIdentification withRef01PrescriptionQlfr(String ref01PrescriptionQlfr) {
        this.ref01PrescriptionQlfr = ref01PrescriptionQlfr;
        return this;
    }

    @JsonProperty("ref02_prescriptionNo")
    public String getRef02PrescriptionNo() {
        return ref02PrescriptionNo;
    }

    @JsonProperty("ref02_prescriptionNo")
    public void setRef02PrescriptionNo(String ref02PrescriptionNo) {
        this.ref02PrescriptionNo = ref02PrescriptionNo;
    }

    public DrugIdentification withRef02PrescriptionNo(String ref02PrescriptionNo) {
        this.ref02PrescriptionNo = ref02PrescriptionNo;
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

    public DrugIdentification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lin02NationalDrugCodeQlfr).append(lin03NationalDrugCode).append(ctp04NationalDrugUnitCount).append(ctp05UnitOfMeasurement).append(ctp0501UnitMeasurementCode).append(ref01PrescriptionQlfr).append(ref02PrescriptionNo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DrugIdentification) == false) {
            return false;
        }
        DrugIdentification rhs = ((DrugIdentification) other);
        return new EqualsBuilder().append(lin02NationalDrugCodeQlfr, rhs.lin02NationalDrugCodeQlfr).append(lin03NationalDrugCode, rhs.lin03NationalDrugCode).append(ctp04NationalDrugUnitCount, rhs.ctp04NationalDrugUnitCount).append(ctp05UnitOfMeasurement, rhs.ctp05UnitOfMeasurement).append(ctp0501UnitMeasurementCode, rhs.ctp0501UnitMeasurementCode).append(ref01PrescriptionQlfr, rhs.ref01PrescriptionQlfr).append(ref02PrescriptionNo, rhs.ref02PrescriptionNo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "dbServiceLineAdjId",
    "lineAdjInfo"
})
public class Adjustment {

    @JsonProperty("dbServiceLineAdjId")
    private Integer dbServiceLineAdjId;
    @JsonProperty("lineAdjInfo")
    private LineAdjInfo lineAdjInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbServiceLineAdjId")
    public Integer getDbServiceLineAdjId() {
        return dbServiceLineAdjId;
    }

    @JsonProperty("dbServiceLineAdjId")
    public void setDbServiceLineAdjId(Integer dbServiceLineAdjId) {
        this.dbServiceLineAdjId = dbServiceLineAdjId;
    }

    public Adjustment withDbServiceLineAdjId(Integer dbServiceLineAdjId) {
        this.dbServiceLineAdjId = dbServiceLineAdjId;
        return this;
    }

    @JsonProperty("lineAdjInfo")
    public LineAdjInfo getLineAdjInfo() {
        return lineAdjInfo;
    }

    @JsonProperty("lineAdjInfo")
    public void setLineAdjInfo(LineAdjInfo lineAdjInfo) {
        this.lineAdjInfo = lineAdjInfo;
    }

    public Adjustment withLineAdjInfo(LineAdjInfo lineAdjInfo) {
        this.lineAdjInfo = lineAdjInfo;
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

    public Adjustment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbServiceLineAdjId).append(lineAdjInfo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Adjustment) == false) {
            return false;
        }
        Adjustment rhs = ((Adjustment) other);
        return new EqualsBuilder().append(dbServiceLineAdjId, rhs.dbServiceLineAdjId).append(lineAdjInfo, rhs.lineAdjInfo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

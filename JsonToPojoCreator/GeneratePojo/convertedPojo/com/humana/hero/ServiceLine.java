
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
    "line",
    "adjustments",
    "documents"
})
public class ServiceLine {

    @JsonProperty("line")
    private Line line;
    @JsonProperty("adjustments")
    private List<Adjustment> adjustments = new ArrayList<Adjustment>();
    @JsonProperty("documents")
    private List<Document> documents = new ArrayList<Document>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("line")
    public Line getLine() {
        return line;
    }

    @JsonProperty("line")
    public void setLine(Line line) {
        this.line = line;
    }

    public ServiceLine withLine(Line line) {
        this.line = line;
        return this;
    }

    @JsonProperty("adjustments")
    public List<Adjustment> getAdjustments() {
        return adjustments;
    }

    @JsonProperty("adjustments")
    public void setAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
    }

    public ServiceLine withAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
        return this;
    }

    @JsonProperty("documents")
    public List<Document> getDocuments() {
        return documents;
    }

    @JsonProperty("documents")
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public ServiceLine withDocuments(List<Document> documents) {
        this.documents = documents;
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

    public ServiceLine withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(line).append(adjustments).append(documents).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceLine) == false) {
            return false;
        }
        ServiceLine rhs = ((ServiceLine) other);
        return new EqualsBuilder().append(line, rhs.line).append(adjustments, rhs.adjustments).append(documents, rhs.documents).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

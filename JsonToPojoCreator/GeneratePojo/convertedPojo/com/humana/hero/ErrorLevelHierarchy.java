
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
    "description",
    "ediHierarchy",
    "elementId",
    "elementPosition",
    "errorCode",
    "errorMessage",
    "id",
    "lineNumber",
    "loopId",
    "segmentId",
    "segmentIdentifier",
    "subElementId",
    "subElementPosition"
})
public class ErrorLevelHierarchy {

    @JsonProperty("description")
    private String description;
    @JsonProperty("ediHierarchy")
    private String ediHierarchy;
    @JsonProperty("elementId")
    private String elementId;
    @JsonProperty("elementPosition")
    private String elementPosition;
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("errorMessage")
    private String errorMessage;
    @JsonProperty("id")
    private String id;
    @JsonProperty("lineNumber")
    private String lineNumber;
    @JsonProperty("loopId")
    private String loopId;
    @JsonProperty("segmentId")
    private String segmentId;
    @JsonProperty("segmentIdentifier")
    private String segmentIdentifier;
    @JsonProperty("subElementId")
    private String subElementId;
    @JsonProperty("subElementPosition")
    private String subElementPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ErrorLevelHierarchy withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("ediHierarchy")
    public String getEdiHierarchy() {
        return ediHierarchy;
    }

    @JsonProperty("ediHierarchy")
    public void setEdiHierarchy(String ediHierarchy) {
        this.ediHierarchy = ediHierarchy;
    }

    public ErrorLevelHierarchy withEdiHierarchy(String ediHierarchy) {
        this.ediHierarchy = ediHierarchy;
        return this;
    }

    @JsonProperty("elementId")
    public String getElementId() {
        return elementId;
    }

    @JsonProperty("elementId")
    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public ErrorLevelHierarchy withElementId(String elementId) {
        this.elementId = elementId;
        return this;
    }

    @JsonProperty("elementPosition")
    public String getElementPosition() {
        return elementPosition;
    }

    @JsonProperty("elementPosition")
    public void setElementPosition(String elementPosition) {
        this.elementPosition = elementPosition;
    }

    public ErrorLevelHierarchy withElementPosition(String elementPosition) {
        this.elementPosition = elementPosition;
        return this;
    }

    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorLevelHierarchy withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorLevelHierarchy withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ErrorLevelHierarchy withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("lineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("lineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public ErrorLevelHierarchy withLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    @JsonProperty("loopId")
    public String getLoopId() {
        return loopId;
    }

    @JsonProperty("loopId")
    public void setLoopId(String loopId) {
        this.loopId = loopId;
    }

    public ErrorLevelHierarchy withLoopId(String loopId) {
        this.loopId = loopId;
        return this;
    }

    @JsonProperty("segmentId")
    public String getSegmentId() {
        return segmentId;
    }

    @JsonProperty("segmentId")
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public ErrorLevelHierarchy withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    @JsonProperty("segmentIdentifier")
    public String getSegmentIdentifier() {
        return segmentIdentifier;
    }

    @JsonProperty("segmentIdentifier")
    public void setSegmentIdentifier(String segmentIdentifier) {
        this.segmentIdentifier = segmentIdentifier;
    }

    public ErrorLevelHierarchy withSegmentIdentifier(String segmentIdentifier) {
        this.segmentIdentifier = segmentIdentifier;
        return this;
    }

    @JsonProperty("subElementId")
    public String getSubElementId() {
        return subElementId;
    }

    @JsonProperty("subElementId")
    public void setSubElementId(String subElementId) {
        this.subElementId = subElementId;
    }

    public ErrorLevelHierarchy withSubElementId(String subElementId) {
        this.subElementId = subElementId;
        return this;
    }

    @JsonProperty("subElementPosition")
    public String getSubElementPosition() {
        return subElementPosition;
    }

    @JsonProperty("subElementPosition")
    public void setSubElementPosition(String subElementPosition) {
        this.subElementPosition = subElementPosition;
    }

    public ErrorLevelHierarchy withSubElementPosition(String subElementPosition) {
        this.subElementPosition = subElementPosition;
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

    public ErrorLevelHierarchy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(ediHierarchy).append(elementId).append(elementPosition).append(errorCode).append(errorMessage).append(id).append(lineNumber).append(loopId).append(segmentId).append(segmentIdentifier).append(subElementId).append(subElementPosition).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErrorLevelHierarchy) == false) {
            return false;
        }
        ErrorLevelHierarchy rhs = ((ErrorLevelHierarchy) other);
        return new EqualsBuilder().append(description, rhs.description).append(ediHierarchy, rhs.ediHierarchy).append(elementId, rhs.elementId).append(elementPosition, rhs.elementPosition).append(errorCode, rhs.errorCode).append(errorMessage, rhs.errorMessage).append(id, rhs.id).append(lineNumber, rhs.lineNumber).append(loopId, rhs.loopId).append(segmentId, rhs.segmentId).append(segmentIdentifier, rhs.segmentIdentifier).append(subElementId, rhs.subElementId).append(subElementPosition, rhs.subElementPosition).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

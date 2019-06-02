
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
    "dbServiceDocumentid",
    "formIdentificationCode"
})
public class Document {

    @JsonProperty("dbServiceDocumentid")
    private Integer dbServiceDocumentid;
    @JsonProperty("formIdentificationCode")
    private FormIdentificationCode formIdentificationCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbServiceDocumentid")
    public Integer getDbServiceDocumentid() {
        return dbServiceDocumentid;
    }

    @JsonProperty("dbServiceDocumentid")
    public void setDbServiceDocumentid(Integer dbServiceDocumentid) {
        this.dbServiceDocumentid = dbServiceDocumentid;
    }

    public Document withDbServiceDocumentid(Integer dbServiceDocumentid) {
        this.dbServiceDocumentid = dbServiceDocumentid;
        return this;
    }

    @JsonProperty("formIdentificationCode")
    public FormIdentificationCode getFormIdentificationCode() {
        return formIdentificationCode;
    }

    @JsonProperty("formIdentificationCode")
    public void setFormIdentificationCode(FormIdentificationCode formIdentificationCode) {
        this.formIdentificationCode = formIdentificationCode;
    }

    public Document withFormIdentificationCode(FormIdentificationCode formIdentificationCode) {
        this.formIdentificationCode = formIdentificationCode;
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

    public Document withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbServiceDocumentid).append(formIdentificationCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Document) == false) {
            return false;
        }
        Document rhs = ((Document) other);
        return new EqualsBuilder().append(dbServiceDocumentid, rhs.dbServiceDocumentid).append(formIdentificationCode, rhs.formIdentificationCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

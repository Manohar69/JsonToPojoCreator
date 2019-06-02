
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
    "lq01_codeListQlfrCode",
    "lq02_formIdentifier",
    "frm_supportingInformation"
})
public class FormIdentificationCode {

    @JsonProperty("lq01_codeListQlfrCode")
    private String lq01CodeListQlfrCode;
    @JsonProperty("lq02_formIdentifier")
    private String lq02FormIdentifier;
    @JsonProperty("frm_supportingInformation")
    private List<FrmSupportingInformation> frmSupportingInformation = new ArrayList<FrmSupportingInformation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lq01_codeListQlfrCode")
    public String getLq01CodeListQlfrCode() {
        return lq01CodeListQlfrCode;
    }

    @JsonProperty("lq01_codeListQlfrCode")
    public void setLq01CodeListQlfrCode(String lq01CodeListQlfrCode) {
        this.lq01CodeListQlfrCode = lq01CodeListQlfrCode;
    }

    public FormIdentificationCode withLq01CodeListQlfrCode(String lq01CodeListQlfrCode) {
        this.lq01CodeListQlfrCode = lq01CodeListQlfrCode;
        return this;
    }

    @JsonProperty("lq02_formIdentifier")
    public String getLq02FormIdentifier() {
        return lq02FormIdentifier;
    }

    @JsonProperty("lq02_formIdentifier")
    public void setLq02FormIdentifier(String lq02FormIdentifier) {
        this.lq02FormIdentifier = lq02FormIdentifier;
    }

    public FormIdentificationCode withLq02FormIdentifier(String lq02FormIdentifier) {
        this.lq02FormIdentifier = lq02FormIdentifier;
        return this;
    }

    @JsonProperty("frm_supportingInformation")
    public List<FrmSupportingInformation> getFrmSupportingInformation() {
        return frmSupportingInformation;
    }

    @JsonProperty("frm_supportingInformation")
    public void setFrmSupportingInformation(List<FrmSupportingInformation> frmSupportingInformation) {
        this.frmSupportingInformation = frmSupportingInformation;
    }

    public FormIdentificationCode withFrmSupportingInformation(List<FrmSupportingInformation> frmSupportingInformation) {
        this.frmSupportingInformation = frmSupportingInformation;
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

    public FormIdentificationCode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lq01CodeListQlfrCode).append(lq02FormIdentifier).append(frmSupportingInformation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FormIdentificationCode) == false) {
            return false;
        }
        FormIdentificationCode rhs = ((FormIdentificationCode) other);
        return new EqualsBuilder().append(lq01CodeListQlfrCode, rhs.lq01CodeListQlfrCode).append(lq02FormIdentifier, rhs.lq02FormIdentifier).append(frmSupportingInformation, rhs.frmSupportingInformation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

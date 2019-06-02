
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
    "dbFunctionalGroupId",
    "gs01_functionalidfrcode",
    "gs02_senderscode",
    "gs03_receiverscode",
    "gs04_date",
    "gs05_time",
    "gs06_groupcontrolnumber",
    "gs07_responsibleagencycode",
    "gs08_versionreleasecode",
    "ge01_nooftransetsincluded"
})
public class FunctionalGroup_ {

    @JsonProperty("dbFunctionalGroupId")
    private Integer dbFunctionalGroupId;
    @JsonProperty("gs01_functionalidfrcode")
    private String gs01Functionalidfrcode;
    @JsonProperty("gs02_senderscode")
    private String gs02Senderscode;
    @JsonProperty("gs03_receiverscode")
    private String gs03Receiverscode;
    @JsonProperty("gs04_date")
    private String gs04Date;
    @JsonProperty("gs05_time")
    private String gs05Time;
    @JsonProperty("gs06_groupcontrolnumber")
    private String gs06Groupcontrolnumber;
    @JsonProperty("gs07_responsibleagencycode")
    private String gs07Responsibleagencycode;
    @JsonProperty("gs08_versionreleasecode")
    private String gs08Versionreleasecode;
    @JsonProperty("ge01_nooftransetsincluded")
    private String ge01Nooftransetsincluded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbFunctionalGroupId")
    public Integer getDbFunctionalGroupId() {
        return dbFunctionalGroupId;
    }

    @JsonProperty("dbFunctionalGroupId")
    public void setDbFunctionalGroupId(Integer dbFunctionalGroupId) {
        this.dbFunctionalGroupId = dbFunctionalGroupId;
    }

    public FunctionalGroup_ withDbFunctionalGroupId(Integer dbFunctionalGroupId) {
        this.dbFunctionalGroupId = dbFunctionalGroupId;
        return this;
    }

    @JsonProperty("gs01_functionalidfrcode")
    public String getGs01Functionalidfrcode() {
        return gs01Functionalidfrcode;
    }

    @JsonProperty("gs01_functionalidfrcode")
    public void setGs01Functionalidfrcode(String gs01Functionalidfrcode) {
        this.gs01Functionalidfrcode = gs01Functionalidfrcode;
    }

    public FunctionalGroup_ withGs01Functionalidfrcode(String gs01Functionalidfrcode) {
        this.gs01Functionalidfrcode = gs01Functionalidfrcode;
        return this;
    }

    @JsonProperty("gs02_senderscode")
    public String getGs02Senderscode() {
        return gs02Senderscode;
    }

    @JsonProperty("gs02_senderscode")
    public void setGs02Senderscode(String gs02Senderscode) {
        this.gs02Senderscode = gs02Senderscode;
    }

    public FunctionalGroup_ withGs02Senderscode(String gs02Senderscode) {
        this.gs02Senderscode = gs02Senderscode;
        return this;
    }

    @JsonProperty("gs03_receiverscode")
    public String getGs03Receiverscode() {
        return gs03Receiverscode;
    }

    @JsonProperty("gs03_receiverscode")
    public void setGs03Receiverscode(String gs03Receiverscode) {
        this.gs03Receiverscode = gs03Receiverscode;
    }

    public FunctionalGroup_ withGs03Receiverscode(String gs03Receiverscode) {
        this.gs03Receiverscode = gs03Receiverscode;
        return this;
    }

    @JsonProperty("gs04_date")
    public String getGs04Date() {
        return gs04Date;
    }

    @JsonProperty("gs04_date")
    public void setGs04Date(String gs04Date) {
        this.gs04Date = gs04Date;
    }

    public FunctionalGroup_ withGs04Date(String gs04Date) {
        this.gs04Date = gs04Date;
        return this;
    }

    @JsonProperty("gs05_time")
    public String getGs05Time() {
        return gs05Time;
    }

    @JsonProperty("gs05_time")
    public void setGs05Time(String gs05Time) {
        this.gs05Time = gs05Time;
    }

    public FunctionalGroup_ withGs05Time(String gs05Time) {
        this.gs05Time = gs05Time;
        return this;
    }

    @JsonProperty("gs06_groupcontrolnumber")
    public String getGs06Groupcontrolnumber() {
        return gs06Groupcontrolnumber;
    }

    @JsonProperty("gs06_groupcontrolnumber")
    public void setGs06Groupcontrolnumber(String gs06Groupcontrolnumber) {
        this.gs06Groupcontrolnumber = gs06Groupcontrolnumber;
    }

    public FunctionalGroup_ withGs06Groupcontrolnumber(String gs06Groupcontrolnumber) {
        this.gs06Groupcontrolnumber = gs06Groupcontrolnumber;
        return this;
    }

    @JsonProperty("gs07_responsibleagencycode")
    public String getGs07Responsibleagencycode() {
        return gs07Responsibleagencycode;
    }

    @JsonProperty("gs07_responsibleagencycode")
    public void setGs07Responsibleagencycode(String gs07Responsibleagencycode) {
        this.gs07Responsibleagencycode = gs07Responsibleagencycode;
    }

    public FunctionalGroup_ withGs07Responsibleagencycode(String gs07Responsibleagencycode) {
        this.gs07Responsibleagencycode = gs07Responsibleagencycode;
        return this;
    }

    @JsonProperty("gs08_versionreleasecode")
    public String getGs08Versionreleasecode() {
        return gs08Versionreleasecode;
    }

    @JsonProperty("gs08_versionreleasecode")
    public void setGs08Versionreleasecode(String gs08Versionreleasecode) {
        this.gs08Versionreleasecode = gs08Versionreleasecode;
    }

    public FunctionalGroup_ withGs08Versionreleasecode(String gs08Versionreleasecode) {
        this.gs08Versionreleasecode = gs08Versionreleasecode;
        return this;
    }

    @JsonProperty("ge01_nooftransetsincluded")
    public String getGe01Nooftransetsincluded() {
        return ge01Nooftransetsincluded;
    }

    @JsonProperty("ge01_nooftransetsincluded")
    public void setGe01Nooftransetsincluded(String ge01Nooftransetsincluded) {
        this.ge01Nooftransetsincluded = ge01Nooftransetsincluded;
    }

    public FunctionalGroup_ withGe01Nooftransetsincluded(String ge01Nooftransetsincluded) {
        this.ge01Nooftransetsincluded = ge01Nooftransetsincluded;
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

    public FunctionalGroup_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dbFunctionalGroupId).append(gs01Functionalidfrcode).append(gs02Senderscode).append(gs03Receiverscode).append(gs04Date).append(gs05Time).append(gs06Groupcontrolnumber).append(gs07Responsibleagencycode).append(gs08Versionreleasecode).append(ge01Nooftransetsincluded).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionalGroup_) == false) {
            return false;
        }
        FunctionalGroup_ rhs = ((FunctionalGroup_) other);
        return new EqualsBuilder().append(dbFunctionalGroupId, rhs.dbFunctionalGroupId).append(gs01Functionalidfrcode, rhs.gs01Functionalidfrcode).append(gs02Senderscode, rhs.gs02Senderscode).append(gs03Receiverscode, rhs.gs03Receiverscode).append(gs04Date, rhs.gs04Date).append(gs05Time, rhs.gs05Time).append(gs06Groupcontrolnumber, rhs.gs06Groupcontrolnumber).append(gs07Responsibleagencycode, rhs.gs07Responsibleagencycode).append(gs08Versionreleasecode, rhs.gs08Versionreleasecode).append(ge01Nooftransetsincluded, rhs.ge01Nooftransetsincluded).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

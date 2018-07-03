package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Ambr;
import org.openapitools.model.IpAddress;
import org.openapitools.model.Model5GQosProfile;
import org.openapitools.model.PduSessionTypes;
import org.openapitools.model.SscModes;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DnnConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class DnnConfiguration   {
  @JsonProperty("dnn")
  private String dnn = null;

  @JsonProperty("pduSessionTypes")
  private PduSessionTypes pduSessionTypes = null;

  @JsonProperty("sscModes")
  private SscModes sscModes = null;

  @JsonProperty("ladnIndicator")
  private Boolean ladnIndicator = null;

  @JsonProperty("5gQosProfile")
  private Model5GQosProfile _5gQosProfile = null;

  @JsonProperty("sessionAmbr")
  private Ambr sessionAmbr = null;

  @JsonProperty("3gppChargingCharacteristics")
  private String _3gppChargingCharacteristics = null;

  @JsonProperty("staticIpAddress")
  private IpAddress staticIpAddress = null;

  public DnnConfiguration dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * Get dnn
   * @return dnn
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public DnnConfiguration pduSessionTypes(PduSessionTypes pduSessionTypes) {
    this.pduSessionTypes = pduSessionTypes;
    return this;
  }

  /**
   * Get pduSessionTypes
   * @return pduSessionTypes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PduSessionTypes getPduSessionTypes() {
    return pduSessionTypes;
  }

  public void setPduSessionTypes(PduSessionTypes pduSessionTypes) {
    this.pduSessionTypes = pduSessionTypes;
  }

  public DnnConfiguration sscModes(SscModes sscModes) {
    this.sscModes = sscModes;
    return this;
  }

  /**
   * Get sscModes
   * @return sscModes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SscModes getSscModes() {
    return sscModes;
  }

  public void setSscModes(SscModes sscModes) {
    this.sscModes = sscModes;
  }

  public DnnConfiguration ladnIndicator(Boolean ladnIndicator) {
    this.ladnIndicator = ladnIndicator;
    return this;
  }

  /**
   * Get ladnIndicator
   * @return ladnIndicator
  **/
  @ApiModelProperty(value = "")


  public Boolean getLadnIndicator() {
    return ladnIndicator;
  }

  public void setLadnIndicator(Boolean ladnIndicator) {
    this.ladnIndicator = ladnIndicator;
  }

  public DnnConfiguration _5gQosProfile(Model5GQosProfile _5gQosProfile) {
    this._5gQosProfile = _5gQosProfile;
    return this;
  }

  /**
   * Get _5gQosProfile
   * @return _5gQosProfile
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Model5GQosProfile get5gQosProfile() {
    return _5gQosProfile;
  }

  public void set5gQosProfile(Model5GQosProfile _5gQosProfile) {
    this._5gQosProfile = _5gQosProfile;
  }

  public DnnConfiguration sessionAmbr(Ambr sessionAmbr) {
    this.sessionAmbr = sessionAmbr;
    return this;
  }

  /**
   * Get sessionAmbr
   * @return sessionAmbr
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Ambr getSessionAmbr() {
    return sessionAmbr;
  }

  public void setSessionAmbr(Ambr sessionAmbr) {
    this.sessionAmbr = sessionAmbr;
  }

  public DnnConfiguration _3gppChargingCharacteristics(String _3gppChargingCharacteristics) {
    this._3gppChargingCharacteristics = _3gppChargingCharacteristics;
    return this;
  }

  /**
   * Get _3gppChargingCharacteristics
   * @return _3gppChargingCharacteristics
  **/
  @ApiModelProperty(value = "")


  public String get3gppChargingCharacteristics() {
    return _3gppChargingCharacteristics;
  }

  public void set3gppChargingCharacteristics(String _3gppChargingCharacteristics) {
    this._3gppChargingCharacteristics = _3gppChargingCharacteristics;
  }

  public DnnConfiguration staticIpAddress(IpAddress staticIpAddress) {
    this.staticIpAddress = staticIpAddress;
    return this;
  }

  /**
   * Get staticIpAddress
   * @return staticIpAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IpAddress getStaticIpAddress() {
    return staticIpAddress;
  }

  public void setStaticIpAddress(IpAddress staticIpAddress) {
    this.staticIpAddress = staticIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnnConfiguration dnnConfiguration = (DnnConfiguration) o;
    return Objects.equals(this.dnn, dnnConfiguration.dnn) &&
        Objects.equals(this.pduSessionTypes, dnnConfiguration.pduSessionTypes) &&
        Objects.equals(this.sscModes, dnnConfiguration.sscModes) &&
        Objects.equals(this.ladnIndicator, dnnConfiguration.ladnIndicator) &&
        Objects.equals(this._5gQosProfile, dnnConfiguration._5gQosProfile) &&
        Objects.equals(this.sessionAmbr, dnnConfiguration.sessionAmbr) &&
        Objects.equals(this._3gppChargingCharacteristics, dnnConfiguration._3gppChargingCharacteristics) &&
        Objects.equals(this.staticIpAddress, dnnConfiguration.staticIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnn, pduSessionTypes, sscModes, ladnIndicator, _5gQosProfile, sessionAmbr, _3gppChargingCharacteristics, staticIpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnnConfiguration {\n");
    
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    pduSessionTypes: ").append(toIndentedString(pduSessionTypes)).append("\n");
    sb.append("    sscModes: ").append(toIndentedString(sscModes)).append("\n");
    sb.append("    ladnIndicator: ").append(toIndentedString(ladnIndicator)).append("\n");
    sb.append("    _5gQosProfile: ").append(toIndentedString(_5gQosProfile)).append("\n");
    sb.append("    sessionAmbr: ").append(toIndentedString(sessionAmbr)).append("\n");
    sb.append("    _3gppChargingCharacteristics: ").append(toIndentedString(_3gppChargingCharacteristics)).append("\n");
    sb.append("    staticIpAddress: ").append(toIndentedString(staticIpAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


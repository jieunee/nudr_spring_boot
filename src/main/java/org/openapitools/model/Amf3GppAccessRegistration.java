package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.model.ImsVoPS;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Amf3GppAccessRegistration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class Amf3GppAccessRegistration   {
  @JsonProperty("amfId")
  private UUID amfId = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  @JsonProperty("purgeFlag")
  private Boolean purgeFlag = null;

  @JsonProperty("pei")
  private String pei = null;

  @JsonProperty("imsVoPS")
  private ImsVoPS imsVoPS = null;

  @JsonProperty("deregCallbackUri")
  private String deregCallbackUri = null;

  @JsonProperty("pcscfRestorationCallbackUri")
  private String pcscfRestorationCallbackUri = null;

  public Amf3GppAccessRegistration amfId(UUID amfId) {
    this.amfId = amfId;
    return this;
  }

  /**
   * Get amfId
   * @return amfId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getAmfId() {
    return amfId;
  }

  public void setAmfId(UUID amfId) {
    this.amfId = amfId;
  }

  public Amf3GppAccessRegistration supportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * Get supportedFeatures
   * @return supportedFeatures
  **/
  @ApiModelProperty(value = "")


  public String getSupportedFeatures() {
    return supportedFeatures;
  }

  public void setSupportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }

  public Amf3GppAccessRegistration purgeFlag(Boolean purgeFlag) {
    this.purgeFlag = purgeFlag;
    return this;
  }

  /**
   * Get purgeFlag
   * @return purgeFlag
  **/
  @ApiModelProperty(value = "")


  public Boolean getPurgeFlag() {
    return purgeFlag;
  }

  public void setPurgeFlag(Boolean purgeFlag) {
    this.purgeFlag = purgeFlag;
  }

  public Amf3GppAccessRegistration pei(String pei) {
    this.pei = pei;
    return this;
  }

  /**
   * Get pei
   * @return pei
  **/
  @ApiModelProperty(value = "")


  public String getPei() {
    return pei;
  }

  public void setPei(String pei) {
    this.pei = pei;
  }

  public Amf3GppAccessRegistration imsVoPS(ImsVoPS imsVoPS) {
    this.imsVoPS = imsVoPS;
    return this;
  }

  /**
   * Get imsVoPS
   * @return imsVoPS
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ImsVoPS getImsVoPS() {
    return imsVoPS;
  }

  public void setImsVoPS(ImsVoPS imsVoPS) {
    this.imsVoPS = imsVoPS;
  }

  public Amf3GppAccessRegistration deregCallbackUri(String deregCallbackUri) {
    this.deregCallbackUri = deregCallbackUri;
    return this;
  }

  /**
   * Get deregCallbackUri
   * @return deregCallbackUri
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDeregCallbackUri() {
    return deregCallbackUri;
  }

  public void setDeregCallbackUri(String deregCallbackUri) {
    this.deregCallbackUri = deregCallbackUri;
  }

  public Amf3GppAccessRegistration pcscfRestorationCallbackUri(String pcscfRestorationCallbackUri) {
    this.pcscfRestorationCallbackUri = pcscfRestorationCallbackUri;
    return this;
  }

  /**
   * Get pcscfRestorationCallbackUri
   * @return pcscfRestorationCallbackUri
  **/
  @ApiModelProperty(value = "")


  public String getPcscfRestorationCallbackUri() {
    return pcscfRestorationCallbackUri;
  }

  public void setPcscfRestorationCallbackUri(String pcscfRestorationCallbackUri) {
    this.pcscfRestorationCallbackUri = pcscfRestorationCallbackUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amf3GppAccessRegistration amf3GppAccessRegistration = (Amf3GppAccessRegistration) o;
    return Objects.equals(this.amfId, amf3GppAccessRegistration.amfId) &&
        Objects.equals(this.supportedFeatures, amf3GppAccessRegistration.supportedFeatures) &&
        Objects.equals(this.purgeFlag, amf3GppAccessRegistration.purgeFlag) &&
        Objects.equals(this.pei, amf3GppAccessRegistration.pei) &&
        Objects.equals(this.imsVoPS, amf3GppAccessRegistration.imsVoPS) &&
        Objects.equals(this.deregCallbackUri, amf3GppAccessRegistration.deregCallbackUri) &&
        Objects.equals(this.pcscfRestorationCallbackUri, amf3GppAccessRegistration.pcscfRestorationCallbackUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amfId, supportedFeatures, purgeFlag, pei, imsVoPS, deregCallbackUri, pcscfRestorationCallbackUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amf3GppAccessRegistration {\n");
    
    sb.append("    amfId: ").append(toIndentedString(amfId)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    purgeFlag: ").append(toIndentedString(purgeFlag)).append("\n");
    sb.append("    pei: ").append(toIndentedString(pei)).append("\n");
    sb.append("    imsVoPS: ").append(toIndentedString(imsVoPS)).append("\n");
    sb.append("    deregCallbackUri: ").append(toIndentedString(deregCallbackUri)).append("\n");
    sb.append("    pcscfRestorationCallbackUri: ").append(toIndentedString(pcscfRestorationCallbackUri)).append("\n");
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


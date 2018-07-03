package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AmfNon3GppAccessRegistration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class AmfNon3GppAccessRegistration   {
  @JsonProperty("amfId")
  private UUID amfId = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  @JsonProperty("purgeFlag")
  private Boolean purgeFlag = null;

  @JsonProperty("pei")
  private String pei = null;

  @JsonProperty("deregCallbackUri")
  private String deregCallbackUri = null;

  @JsonProperty("pcscfRestorationCallbackUri")
  private String pcscfRestorationCallbackUri = null;

  public AmfNon3GppAccessRegistration amfId(UUID amfId) {
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

  public AmfNon3GppAccessRegistration supportedFeatures(String supportedFeatures) {
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

  public AmfNon3GppAccessRegistration purgeFlag(Boolean purgeFlag) {
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

  public AmfNon3GppAccessRegistration pei(String pei) {
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

  public AmfNon3GppAccessRegistration deregCallbackUri(String deregCallbackUri) {
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

  public AmfNon3GppAccessRegistration pcscfRestorationCallbackUri(String pcscfRestorationCallbackUri) {
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
    AmfNon3GppAccessRegistration amfNon3GppAccessRegistration = (AmfNon3GppAccessRegistration) o;
    return Objects.equals(this.amfId, amfNon3GppAccessRegistration.amfId) &&
        Objects.equals(this.supportedFeatures, amfNon3GppAccessRegistration.supportedFeatures) &&
        Objects.equals(this.purgeFlag, amfNon3GppAccessRegistration.purgeFlag) &&
        Objects.equals(this.pei, amfNon3GppAccessRegistration.pei) &&
        Objects.equals(this.deregCallbackUri, amfNon3GppAccessRegistration.deregCallbackUri) &&
        Objects.equals(this.pcscfRestorationCallbackUri, amfNon3GppAccessRegistration.pcscfRestorationCallbackUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amfId, supportedFeatures, purgeFlag, pei, deregCallbackUri, pcscfRestorationCallbackUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmfNon3GppAccessRegistration {\n");
    
    sb.append("    amfId: ").append(toIndentedString(amfId)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    purgeFlag: ").append(toIndentedString(purgeFlag)).append("\n");
    sb.append("    pei: ").append(toIndentedString(pei)).append("\n");
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


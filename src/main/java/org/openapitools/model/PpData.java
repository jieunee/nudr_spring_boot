package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CommunicationCharacteristics;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PpData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class PpData   {
  @JsonProperty("communicationCharacteristics")
  private CommunicationCharacteristics communicationCharacteristics = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  public PpData communicationCharacteristics(CommunicationCharacteristics communicationCharacteristics) {
    this.communicationCharacteristics = communicationCharacteristics;
    return this;
  }

  /**
   * Get communicationCharacteristics
   * @return communicationCharacteristics
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CommunicationCharacteristics getCommunicationCharacteristics() {
    return communicationCharacteristics;
  }

  public void setCommunicationCharacteristics(CommunicationCharacteristics communicationCharacteristics) {
    this.communicationCharacteristics = communicationCharacteristics;
  }

  public PpData supportedFeatures(String supportedFeatures) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PpData ppData = (PpData) o;
    return Objects.equals(this.communicationCharacteristics, ppData.communicationCharacteristics) &&
        Objects.equals(this.supportedFeatures, ppData.supportedFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationCharacteristics, supportedFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PpData {\n");
    
    sb.append("    communicationCharacteristics: ").append(toIndentedString(communicationCharacteristics)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SnssaiInfo;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SmfSelectionSubscriptionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class SmfSelectionSubscriptionData   {
  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  @JsonProperty("subscribedSnssaiInfo")
  @Valid
  private List<SnssaiInfo> subscribedSnssaiInfo = null;

  public SmfSelectionSubscriptionData supportedFeatures(String supportedFeatures) {
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

  public SmfSelectionSubscriptionData subscribedSnssaiInfo(List<SnssaiInfo> subscribedSnssaiInfo) {
    this.subscribedSnssaiInfo = subscribedSnssaiInfo;
    return this;
  }

  public SmfSelectionSubscriptionData addSubscribedSnssaiInfoItem(SnssaiInfo subscribedSnssaiInfoItem) {
    if (this.subscribedSnssaiInfo == null) {
      this.subscribedSnssaiInfo = new ArrayList<>();
    }
    this.subscribedSnssaiInfo.add(subscribedSnssaiInfoItem);
    return this;
  }

  /**
   * Get subscribedSnssaiInfo
   * @return subscribedSnssaiInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SnssaiInfo> getSubscribedSnssaiInfo() {
    return subscribedSnssaiInfo;
  }

  public void setSubscribedSnssaiInfo(List<SnssaiInfo> subscribedSnssaiInfo) {
    this.subscribedSnssaiInfo = subscribedSnssaiInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmfSelectionSubscriptionData smfSelectionSubscriptionData = (SmfSelectionSubscriptionData) o;
    return Objects.equals(this.supportedFeatures, smfSelectionSubscriptionData.supportedFeatures) &&
        Objects.equals(this.subscribedSnssaiInfo, smfSelectionSubscriptionData.subscribedSnssaiInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedFeatures, subscribedSnssaiInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmfSelectionSubscriptionData {\n");
    
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    subscribedSnssaiInfo: ").append(toIndentedString(subscribedSnssaiInfo)).append("\n");
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


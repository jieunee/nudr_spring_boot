package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.DnnConfiguration;
import org.openapitools.model.Snssai;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SessionManagementSubscriptionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class SessionManagementSubscriptionData   {
  @JsonProperty("singleNssai")
  private Snssai singleNssai = null;

  @JsonProperty("dnnConfiguration")
  @Valid
  private Map<String, DnnConfiguration> dnnConfiguration = null;

  public SessionManagementSubscriptionData singleNssai(Snssai singleNssai) {
    this.singleNssai = singleNssai;
    return this;
  }

  /**
   * Get singleNssai
   * @return singleNssai
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Snssai getSingleNssai() {
    return singleNssai;
  }

  public void setSingleNssai(Snssai singleNssai) {
    this.singleNssai = singleNssai;
  }

  public SessionManagementSubscriptionData dnnConfiguration(Map<String, DnnConfiguration> dnnConfiguration) {
    this.dnnConfiguration = dnnConfiguration;
    return this;
  }

  public SessionManagementSubscriptionData putDnnConfigurationItem(String key, DnnConfiguration dnnConfigurationItem) {
    if (this.dnnConfiguration == null) {
      this.dnnConfiguration = new HashMap<>();
    }
    this.dnnConfiguration.put(key, dnnConfigurationItem);
    return this;
  }

  /**
   * Get dnnConfiguration
   * @return dnnConfiguration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, DnnConfiguration> getDnnConfiguration() {
    return dnnConfiguration;
  }

  public void setDnnConfiguration(Map<String, DnnConfiguration> dnnConfiguration) {
    this.dnnConfiguration = dnnConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionManagementSubscriptionData sessionManagementSubscriptionData = (SessionManagementSubscriptionData) o;
    return Objects.equals(this.singleNssai, sessionManagementSubscriptionData.singleNssai) &&
        Objects.equals(this.dnnConfiguration, sessionManagementSubscriptionData.dnnConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singleNssai, dnnConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionManagementSubscriptionData {\n");
    
    sb.append("    singleNssai: ").append(toIndentedString(singleNssai)).append("\n");
    sb.append("    dnnConfiguration: ").append(toIndentedString(dnnConfiguration)).append("\n");
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


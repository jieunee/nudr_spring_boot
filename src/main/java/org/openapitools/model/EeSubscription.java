package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.MonitoringConfiguration;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EeSubscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class EeSubscription   {
  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("monitoringConfiguration")
  @Valid
  private Map<String, MonitoringConfiguration> monitoringConfiguration = new HashMap<>();

  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  public EeSubscription callbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

  /**
   * Get callbackReference
   * @return callbackReference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
  }

  public EeSubscription monitoringConfiguration(Map<String, MonitoringConfiguration> monitoringConfiguration) {
    this.monitoringConfiguration = monitoringConfiguration;
    return this;
  }

  public EeSubscription putMonitoringConfigurationItem(String key, MonitoringConfiguration monitoringConfigurationItem) {
    this.monitoringConfiguration.put(key, monitoringConfigurationItem);
    return this;
  }

  /**
   * A map (list of key-value pairs where ReferenceId serves as key) of MonitoringConfigurations
   * @return monitoringConfiguration
  **/
  @ApiModelProperty(required = true, value = "A map (list of key-value pairs where ReferenceId serves as key) of MonitoringConfigurations")
  @NotNull

  @Valid
@Size(min=1) 
  public Map<String, MonitoringConfiguration> getMonitoringConfiguration() {
    return monitoringConfiguration;
  }

  public void setMonitoringConfiguration(Map<String, MonitoringConfiguration> monitoringConfiguration) {
    this.monitoringConfiguration = monitoringConfiguration;
  }

  public EeSubscription supportedFeatures(String supportedFeatures) {
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
    EeSubscription eeSubscription = (EeSubscription) o;
    return Objects.equals(this.callbackReference, eeSubscription.callbackReference) &&
        Objects.equals(this.monitoringConfiguration, eeSubscription.monitoringConfiguration) &&
        Objects.equals(this.supportedFeatures, eeSubscription.supportedFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackReference, monitoringConfiguration, supportedFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EeSubscription {\n");
    
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    monitoringConfiguration: ").append(toIndentedString(monitoringConfiguration)).append("\n");
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


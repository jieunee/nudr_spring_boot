package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SdmSubscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class SdmSubscription   {
  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("monitoredResourceUris")
  @Valid
  private List<String> monitoredResourceUris = null;

  public SdmSubscription callbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

  /**
   * Get callbackReference
   * @return callbackReference
  **/
  @ApiModelProperty(value = "")


  public String getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
  }

  public SdmSubscription monitoredResourceUris(List<String> monitoredResourceUris) {
    this.monitoredResourceUris = monitoredResourceUris;
    return this;
  }

  public SdmSubscription addMonitoredResourceUrisItem(String monitoredResourceUrisItem) {
    if (this.monitoredResourceUris == null) {
      this.monitoredResourceUris = new ArrayList<>();
    }
    this.monitoredResourceUris.add(monitoredResourceUrisItem);
    return this;
  }

  /**
   * Get monitoredResourceUris
   * @return monitoredResourceUris
  **/
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getMonitoredResourceUris() {
    return monitoredResourceUris;
  }

  public void setMonitoredResourceUris(List<String> monitoredResourceUris) {
    this.monitoredResourceUris = monitoredResourceUris;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SdmSubscription sdmSubscription = (SdmSubscription) o;
    return Objects.equals(this.callbackReference, sdmSubscription.callbackReference) &&
        Objects.equals(this.monitoredResourceUris, sdmSubscription.monitoredResourceUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackReference, monitoredResourceUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdmSubscription {\n");
    
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    monitoredResourceUris: ").append(toIndentedString(monitoredResourceUris)).append("\n");
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


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
 * SubscriptionDataSubscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class SubscriptionDataSubscriptions   {
  @JsonProperty("ueId")
  private String ueId = null;

  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("originalCallbackReference")
  private String originalCallbackReference = null;

  @JsonProperty("monitoredResourceUri")
  @Valid
  private List<String> monitoredResourceUri = null;

  public SubscriptionDataSubscriptions ueId(String ueId) {
    this.ueId = ueId;
    return this;
  }

  /**
   * Get ueId
   * @return ueId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUeId() {
    return ueId;
  }

  public void setUeId(String ueId) {
    this.ueId = ueId;
  }

  public SubscriptionDataSubscriptions callbackReference(String callbackReference) {
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

  public SubscriptionDataSubscriptions originalCallbackReference(String originalCallbackReference) {
    this.originalCallbackReference = originalCallbackReference;
    return this;
  }

  /**
   * Get originalCallbackReference
   * @return originalCallbackReference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOriginalCallbackReference() {
    return originalCallbackReference;
  }

  public void setOriginalCallbackReference(String originalCallbackReference) {
    this.originalCallbackReference = originalCallbackReference;
  }

  public SubscriptionDataSubscriptions monitoredResourceUri(List<String> monitoredResourceUri) {
    this.monitoredResourceUri = monitoredResourceUri;
    return this;
  }

  public SubscriptionDataSubscriptions addMonitoredResourceUriItem(String monitoredResourceUriItem) {
    if (this.monitoredResourceUri == null) {
      this.monitoredResourceUri = new ArrayList<>();
    }
    this.monitoredResourceUri.add(monitoredResourceUriItem);
    return this;
  }

  /**
   * Get monitoredResourceUri
   * @return monitoredResourceUri
  **/
  @ApiModelProperty(value = "")


  public List<String> getMonitoredResourceUri() {
    return monitoredResourceUri;
  }

  public void setMonitoredResourceUri(List<String> monitoredResourceUri) {
    this.monitoredResourceUri = monitoredResourceUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDataSubscriptions subscriptionDataSubscriptions = (SubscriptionDataSubscriptions) o;
    return Objects.equals(this.ueId, subscriptionDataSubscriptions.ueId) &&
        Objects.equals(this.callbackReference, subscriptionDataSubscriptions.callbackReference) &&
        Objects.equals(this.originalCallbackReference, subscriptionDataSubscriptions.originalCallbackReference) &&
        Objects.equals(this.monitoredResourceUri, subscriptionDataSubscriptions.monitoredResourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ueId, callbackReference, originalCallbackReference, monitoredResourceUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDataSubscriptions {\n");
    
    sb.append("    ueId: ").append(toIndentedString(ueId)).append("\n");
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    originalCallbackReference: ").append(toIndentedString(originalCallbackReference)).append("\n");
    sb.append("    monitoredResourceUri: ").append(toIndentedString(monitoredResourceUri)).append("\n");
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


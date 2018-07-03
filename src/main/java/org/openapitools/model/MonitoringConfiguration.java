package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EventType;
import org.openapitools.model.ReportingOptions;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonitoringConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class MonitoringConfiguration   {
  @JsonProperty("referenceId")
  private Integer referenceId = null;

  @JsonProperty("eventType")
  private EventType eventType = null;

  @JsonProperty("reportingOptions")
  private ReportingOptions reportingOptions = null;

  public MonitoringConfiguration referenceId(Integer referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(value = "")


  public Integer getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }

  public MonitoringConfiguration eventType(EventType eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EventType getEventType() {
    return eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  public MonitoringConfiguration reportingOptions(ReportingOptions reportingOptions) {
    this.reportingOptions = reportingOptions;
    return this;
  }

  /**
   * Get reportingOptions
   * @return reportingOptions
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ReportingOptions getReportingOptions() {
    return reportingOptions;
  }

  public void setReportingOptions(ReportingOptions reportingOptions) {
    this.reportingOptions = reportingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringConfiguration monitoringConfiguration = (MonitoringConfiguration) o;
    return Objects.equals(this.referenceId, monitoringConfiguration.referenceId) &&
        Objects.equals(this.eventType, monitoringConfiguration.eventType) &&
        Objects.equals(this.reportingOptions, monitoringConfiguration.reportingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, eventType, reportingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringConfiguration {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    reportingOptions: ").append(toIndentedString(reportingOptions)).append("\n");
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


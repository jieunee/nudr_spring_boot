package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportingOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class ReportingOptions   {
  @JsonProperty("maxNumOfReports")
  private Integer maxNumOfReports = null;

  @JsonProperty("monitoringDuration")
  private OffsetDateTime monitoringDuration = null;

  public ReportingOptions maxNumOfReports(Integer maxNumOfReports) {
    this.maxNumOfReports = maxNumOfReports;
    return this;
  }

  /**
   * Get maxNumOfReports
   * @return maxNumOfReports
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxNumOfReports() {
    return maxNumOfReports;
  }

  public void setMaxNumOfReports(Integer maxNumOfReports) {
    this.maxNumOfReports = maxNumOfReports;
  }

  public ReportingOptions monitoringDuration(OffsetDateTime monitoringDuration) {
    this.monitoringDuration = monitoringDuration;
    return this;
  }

  /**
   * Get monitoringDuration
   * @return monitoringDuration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getMonitoringDuration() {
    return monitoringDuration;
  }

  public void setMonitoringDuration(OffsetDateTime monitoringDuration) {
    this.monitoringDuration = monitoringDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingOptions reportingOptions = (ReportingOptions) o;
    return Objects.equals(this.maxNumOfReports, reportingOptions.maxNumOfReports) &&
        Objects.equals(this.monitoringDuration, reportingOptions.monitoringDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNumOfReports, monitoringDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingOptions {\n");
    
    sb.append("    maxNumOfReports: ").append(toIndentedString(maxNumOfReports)).append("\n");
    sb.append("    monitoringDuration: ").append(toIndentedString(monitoringDuration)).append("\n");
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


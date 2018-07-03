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
 * PpSubsRegTimer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class PpSubsRegTimer   {
  @JsonProperty("subsRegTimer")
  private Integer subsRegTimer = null;

  @JsonProperty("afId")
  private UUID afId = null;

  @JsonProperty("referenceId")
  private Integer referenceId = null;

  public PpSubsRegTimer subsRegTimer(Integer subsRegTimer) {
    this.subsRegTimer = subsRegTimer;
    return this;
  }

  /**
   * Get subsRegTimer
   * @return subsRegTimer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getSubsRegTimer() {
    return subsRegTimer;
  }

  public void setSubsRegTimer(Integer subsRegTimer) {
    this.subsRegTimer = subsRegTimer;
  }

  public PpSubsRegTimer afId(UUID afId) {
    this.afId = afId;
    return this;
  }

  /**
   * Get afId
   * @return afId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getAfId() {
    return afId;
  }

  public void setAfId(UUID afId) {
    this.afId = afId;
  }

  public PpSubsRegTimer referenceId(Integer referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PpSubsRegTimer ppSubsRegTimer = (PpSubsRegTimer) o;
    return Objects.equals(this.subsRegTimer, ppSubsRegTimer.subsRegTimer) &&
        Objects.equals(this.afId, ppSubsRegTimer.afId) &&
        Objects.equals(this.referenceId, ppSubsRegTimer.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subsRegTimer, afId, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PpSubsRegTimer {\n");
    
    sb.append("    subsRegTimer: ").append(toIndentedString(subsRegTimer)).append("\n");
    sb.append("    afId: ").append(toIndentedString(afId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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


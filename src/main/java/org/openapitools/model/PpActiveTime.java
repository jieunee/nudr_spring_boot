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
 * PpActiveTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class PpActiveTime   {
  @JsonProperty("activeTime")
  private Integer activeTime = null;

  @JsonProperty("afId")
  private UUID afId = null;

  @JsonProperty("referenceId")
  private Integer referenceId = null;

  public PpActiveTime activeTime(Integer activeTime) {
    this.activeTime = activeTime;
    return this;
  }

  /**
   * Get activeTime
   * @return activeTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getActiveTime() {
    return activeTime;
  }

  public void setActiveTime(Integer activeTime) {
    this.activeTime = activeTime;
  }

  public PpActiveTime afId(UUID afId) {
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

  public PpActiveTime referenceId(Integer referenceId) {
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
    PpActiveTime ppActiveTime = (PpActiveTime) o;
    return Objects.equals(this.activeTime, ppActiveTime.activeTime) &&
        Objects.equals(this.afId, ppActiveTime.afId) &&
        Objects.equals(this.referenceId, ppActiveTime.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTime, afId, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PpActiveTime {\n");
    
    sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PpActiveTime;
import org.openapitools.model.PpSubsRegTimer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommunicationCharacteristics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class CommunicationCharacteristics   {
  @JsonProperty("ppSubsRegTimer")
  private PpSubsRegTimer ppSubsRegTimer = null;

  @JsonProperty("ppActiveTime")
  private PpActiveTime ppActiveTime = null;

  @JsonProperty("ppDlPacketCount")
  private Integer ppDlPacketCount = null;

  public CommunicationCharacteristics ppSubsRegTimer(PpSubsRegTimer ppSubsRegTimer) {
    this.ppSubsRegTimer = ppSubsRegTimer;
    return this;
  }

  /**
   * Get ppSubsRegTimer
   * @return ppSubsRegTimer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PpSubsRegTimer getPpSubsRegTimer() {
    return ppSubsRegTimer;
  }

  public void setPpSubsRegTimer(PpSubsRegTimer ppSubsRegTimer) {
    this.ppSubsRegTimer = ppSubsRegTimer;
  }

  public CommunicationCharacteristics ppActiveTime(PpActiveTime ppActiveTime) {
    this.ppActiveTime = ppActiveTime;
    return this;
  }

  /**
   * Get ppActiveTime
   * @return ppActiveTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PpActiveTime getPpActiveTime() {
    return ppActiveTime;
  }

  public void setPpActiveTime(PpActiveTime ppActiveTime) {
    this.ppActiveTime = ppActiveTime;
  }

  public CommunicationCharacteristics ppDlPacketCount(Integer ppDlPacketCount) {
    this.ppDlPacketCount = ppDlPacketCount;
    return this;
  }

  /**
   * Get ppDlPacketCount
   * @return ppDlPacketCount
  **/
  @ApiModelProperty(value = "")


  public Integer getPpDlPacketCount() {
    return ppDlPacketCount;
  }

  public void setPpDlPacketCount(Integer ppDlPacketCount) {
    this.ppDlPacketCount = ppDlPacketCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationCharacteristics communicationCharacteristics = (CommunicationCharacteristics) o;
    return Objects.equals(this.ppSubsRegTimer, communicationCharacteristics.ppSubsRegTimer) &&
        Objects.equals(this.ppActiveTime, communicationCharacteristics.ppActiveTime) &&
        Objects.equals(this.ppDlPacketCount, communicationCharacteristics.ppDlPacketCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ppSubsRegTimer, ppActiveTime, ppDlPacketCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationCharacteristics {\n");
    
    sb.append("    ppSubsRegTimer: ").append(toIndentedString(ppSubsRegTimer)).append("\n");
    sb.append("    ppActiveTime: ").append(toIndentedString(ppActiveTime)).append("\n");
    sb.append("    ppDlPacketCount: ").append(toIndentedString(ppDlPacketCount)).append("\n");
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


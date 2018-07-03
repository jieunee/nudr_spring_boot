package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PduSessionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PduSessionTypes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class PduSessionTypes   {
  @JsonProperty("defaultSessionType")
  private PduSessionType defaultSessionType = null;

  @JsonProperty("allowedSessionTypes")
  @Valid
  private List<PduSessionType> allowedSessionTypes = null;

  public PduSessionTypes defaultSessionType(PduSessionType defaultSessionType) {
    this.defaultSessionType = defaultSessionType;
    return this;
  }

  /**
   * Get defaultSessionType
   * @return defaultSessionType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PduSessionType getDefaultSessionType() {
    return defaultSessionType;
  }

  public void setDefaultSessionType(PduSessionType defaultSessionType) {
    this.defaultSessionType = defaultSessionType;
  }

  public PduSessionTypes allowedSessionTypes(List<PduSessionType> allowedSessionTypes) {
    this.allowedSessionTypes = allowedSessionTypes;
    return this;
  }

  public PduSessionTypes addAllowedSessionTypesItem(PduSessionType allowedSessionTypesItem) {
    if (this.allowedSessionTypes == null) {
      this.allowedSessionTypes = new ArrayList<>();
    }
    this.allowedSessionTypes.add(allowedSessionTypesItem);
    return this;
  }

  /**
   * Get allowedSessionTypes
   * @return allowedSessionTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PduSessionType> getAllowedSessionTypes() {
    return allowedSessionTypes;
  }

  public void setAllowedSessionTypes(List<PduSessionType> allowedSessionTypes) {
    this.allowedSessionTypes = allowedSessionTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PduSessionTypes pduSessionTypes = (PduSessionTypes) o;
    return Objects.equals(this.defaultSessionType, pduSessionTypes.defaultSessionType) &&
        Objects.equals(this.allowedSessionTypes, pduSessionTypes.allowedSessionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultSessionType, allowedSessionTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PduSessionTypes {\n");
    
    sb.append("    defaultSessionType: ").append(toIndentedString(defaultSessionType)).append("\n");
    sb.append("    allowedSessionTypes: ").append(toIndentedString(allowedSessionTypes)).append("\n");
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SscMode;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SscModes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class SscModes   {
  @JsonProperty("defaultSscMode")
  private SscMode defaultSscMode = null;

  @JsonProperty("allowedSscModes")
  @Valid
  private List<SscMode> allowedSscModes = null;

  public SscModes defaultSscMode(SscMode defaultSscMode) {
    this.defaultSscMode = defaultSscMode;
    return this;
  }

  /**
   * Get defaultSscMode
   * @return defaultSscMode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SscMode getDefaultSscMode() {
    return defaultSscMode;
  }

  public void setDefaultSscMode(SscMode defaultSscMode) {
    this.defaultSscMode = defaultSscMode;
  }

  public SscModes allowedSscModes(List<SscMode> allowedSscModes) {
    this.allowedSscModes = allowedSscModes;
    return this;
  }

  public SscModes addAllowedSscModesItem(SscMode allowedSscModesItem) {
    if (this.allowedSscModes == null) {
      this.allowedSscModes = new ArrayList<>();
    }
    this.allowedSscModes.add(allowedSscModesItem);
    return this;
  }

  /**
   * Get allowedSscModes
   * @return allowedSscModes
  **/
  @ApiModelProperty(value = "")

  @Valid
@Size(min=0,max=2) 
  public List<SscMode> getAllowedSscModes() {
    return allowedSscModes;
  }

  public void setAllowedSscModes(List<SscMode> allowedSscModes) {
    this.allowedSscModes = allowedSscModes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SscModes sscModes = (SscModes) o;
    return Objects.equals(this.defaultSscMode, sscModes.defaultSscMode) &&
        Objects.equals(this.allowedSscModes, sscModes.allowedSscModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultSscMode, allowedSscModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SscModes {\n");
    
    sb.append("    defaultSscMode: ").append(toIndentedString(defaultSscMode)).append("\n");
    sb.append("    allowedSscModes: ").append(toIndentedString(allowedSscModes)).append("\n");
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


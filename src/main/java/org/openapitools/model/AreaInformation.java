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
 * AreaInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class AreaInformation   {
  @JsonProperty("tacs")
  @Valid
  private List<String> tacs = null;

  @JsonProperty("areaCodes")
  @Valid
  private List<String> areaCodes = null;

  @JsonProperty("maxNumderTAs")
  private Integer maxNumderTAs = null;

  public AreaInformation tacs(List<String> tacs) {
    this.tacs = tacs;
    return this;
  }

  public AreaInformation addTacsItem(String tacsItem) {
    if (this.tacs == null) {
      this.tacs = new ArrayList<>();
    }
    this.tacs.add(tacsItem);
    return this;
  }

  /**
   * Get tacs
   * @return tacs
  **/
  @ApiModelProperty(value = "")


  public List<String> getTacs() {
    return tacs;
  }

  public void setTacs(List<String> tacs) {
    this.tacs = tacs;
  }

  public AreaInformation areaCodes(List<String> areaCodes) {
    this.areaCodes = areaCodes;
    return this;
  }

  public AreaInformation addAreaCodesItem(String areaCodesItem) {
    if (this.areaCodes == null) {
      this.areaCodes = new ArrayList<>();
    }
    this.areaCodes.add(areaCodesItem);
    return this;
  }

  /**
   * Get areaCodes
   * @return areaCodes
  **/
  @ApiModelProperty(value = "")


  public List<String> getAreaCodes() {
    return areaCodes;
  }

  public void setAreaCodes(List<String> areaCodes) {
    this.areaCodes = areaCodes;
  }

  public AreaInformation maxNumderTAs(Integer maxNumderTAs) {
    this.maxNumderTAs = maxNumderTAs;
    return this;
  }

  /**
   * Get maxNumderTAs
   * @return maxNumderTAs
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxNumderTAs() {
    return maxNumderTAs;
  }

  public void setMaxNumderTAs(Integer maxNumderTAs) {
    this.maxNumderTAs = maxNumderTAs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaInformation areaInformation = (AreaInformation) o;
    return Objects.equals(this.tacs, areaInformation.tacs) &&
        Objects.equals(this.areaCodes, areaInformation.areaCodes) &&
        Objects.equals(this.maxNumderTAs, areaInformation.maxNumderTAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tacs, areaCodes, maxNumderTAs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaInformation {\n");
    
    sb.append("    tacs: ").append(toIndentedString(tacs)).append("\n");
    sb.append("    areaCodes: ").append(toIndentedString(areaCodes)).append("\n");
    sb.append("    maxNumderTAs: ").append(toIndentedString(maxNumderTAs)).append("\n");
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


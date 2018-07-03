package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VarSnssai
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class VarSnssai   {
  @JsonProperty("sst")
  private Integer sst = null;

  @JsonProperty("sd")
  private String sd = null;

  public VarSnssai sst(Integer sst) {
    this.sst = sst;
    return this;
  }

  /**
   * Get sst
   * @return sst
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getSst() {
    return sst;
  }

  public void setSst(Integer sst) {
    this.sst = sst;
  }

  public VarSnssai sd(String sd) {
    this.sd = sd;
    return this;
  }

  /**
   * Get sd
   * @return sd
  **/
  @ApiModelProperty(value = "")


  public String getSd() {
    return sd;
  }

  public void setSd(String sd) {
    this.sd = sd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VarSnssai varSnssai = (VarSnssai) o;
    return Objects.equals(this.sst, varSnssai.sst) &&
        Objects.equals(this.sd, varSnssai.sd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sst, sd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VarSnssai {\n");
    
    sb.append("    sst: ").append(toIndentedString(sst)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
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


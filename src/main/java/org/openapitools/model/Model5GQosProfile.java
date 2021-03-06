package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Arp;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model5GQosProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class Model5GQosProfile   {
  @JsonProperty("5qi")
  private Integer _5qi = null;

  @JsonProperty("arp")
  private Arp arp = null;

  public Model5GQosProfile _5qi(Integer _5qi) {
    this._5qi = _5qi;
    return this;
  }

  /**
   * Get _5qi
   * @return _5qi
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer get5qi() {
    return _5qi;
  }

  public void set5qi(Integer _5qi) {
    this._5qi = _5qi;
  }

  public Model5GQosProfile arp(Arp arp) {
    this.arp = arp;
    return this;
  }

  /**
   * Get arp
   * @return arp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Arp getArp() {
    return arp;
  }

  public void setArp(Arp arp) {
    this.arp = arp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model5GQosProfile _5gQosProfile = (Model5GQosProfile) o;
    return Objects.equals(this._5qi, _5gQosProfile._5qi) &&
        Objects.equals(this.arp, _5gQosProfile.arp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5qi, arp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model5GQosProfile {\n");
    
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    arp: ").append(toIndentedString(arp)).append("\n");
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


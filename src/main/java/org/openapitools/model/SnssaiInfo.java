package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DnnInfo;
import org.openapitools.model.Snssai;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SnssaiInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class SnssaiInfo   {
  @JsonProperty("singleNssai")
  private Snssai singleNssai = null;

  @JsonProperty("dnnInfos")
  @Valid
  private List<DnnInfo> dnnInfos = new ArrayList<>();

  public SnssaiInfo singleNssai(Snssai singleNssai) {
    this.singleNssai = singleNssai;
    return this;
  }

  /**
   * Get singleNssai
   * @return singleNssai
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Snssai getSingleNssai() {
    return singleNssai;
  }

  public void setSingleNssai(Snssai singleNssai) {
    this.singleNssai = singleNssai;
  }

  public SnssaiInfo dnnInfos(List<DnnInfo> dnnInfos) {
    this.dnnInfos = dnnInfos;
    return this;
  }

  public SnssaiInfo addDnnInfosItem(DnnInfo dnnInfosItem) {
    this.dnnInfos.add(dnnInfosItem);
    return this;
  }

  /**
   * Get dnnInfos
   * @return dnnInfos
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<DnnInfo> getDnnInfos() {
    return dnnInfos;
  }

  public void setDnnInfos(List<DnnInfo> dnnInfos) {
    this.dnnInfos = dnnInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnssaiInfo snssaiInfo = (SnssaiInfo) o;
    return Objects.equals(this.singleNssai, snssaiInfo.singleNssai) &&
        Objects.equals(this.dnnInfos, snssaiInfo.dnnInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singleNssai, dnnInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnssaiInfo {\n");
    
    sb.append("    singleNssai: ").append(toIndentedString(singleNssai)).append("\n");
    sb.append("    dnnInfos: ").append(toIndentedString(dnnInfos)).append("\n");
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


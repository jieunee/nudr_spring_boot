package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Snssai;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Nssai
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class Nssai   {
  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  @JsonProperty("defaultSingleNssais")
  @Valid
  private List<Snssai> defaultSingleNssais = null;

  @JsonProperty("singleNssais")
  @Valid
  private List<Snssai> singleNssais = null;

  public Nssai supportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * Get supportedFeatures
   * @return supportedFeatures
  **/
  @ApiModelProperty(value = "")


  public String getSupportedFeatures() {
    return supportedFeatures;
  }

  public void setSupportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }

  public Nssai defaultSingleNssais(List<Snssai> defaultSingleNssais) {
    this.defaultSingleNssais = defaultSingleNssais;
    return this;
  }

  public Nssai addDefaultSingleNssaisItem(Snssai defaultSingleNssaisItem) {
    if (this.defaultSingleNssais == null) {
      this.defaultSingleNssais = new ArrayList<>();
    }
    this.defaultSingleNssais.add(defaultSingleNssaisItem);
    return this;
  }

  /**
   * Get defaultSingleNssais
   * @return defaultSingleNssais
  **/
  @ApiModelProperty(value = "")

  @Valid
@Size(max=8) 
  public List<Snssai> getDefaultSingleNssais() {
    return defaultSingleNssais;
  }

  public void setDefaultSingleNssais(List<Snssai> defaultSingleNssais) {
    this.defaultSingleNssais = defaultSingleNssais;
  }

  public Nssai singleNssais(List<Snssai> singleNssais) {
    this.singleNssais = singleNssais;
    return this;
  }

  public Nssai addSingleNssaisItem(Snssai singleNssaisItem) {
    if (this.singleNssais == null) {
      this.singleNssais = new ArrayList<>();
    }
    this.singleNssais.add(singleNssaisItem);
    return this;
  }

  /**
   * Get singleNssais
   * @return singleNssais
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Snssai> getSingleNssais() {
    return singleNssais;
  }

  public void setSingleNssais(List<Snssai> singleNssais) {
    this.singleNssais = singleNssais;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nssai nssai = (Nssai) o;
    return Objects.equals(this.supportedFeatures, nssai.supportedFeatures) &&
        Objects.equals(this.defaultSingleNssais, nssai.defaultSingleNssais) &&
        Objects.equals(this.singleNssais, nssai.singleNssais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedFeatures, defaultSingleNssais, singleNssais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nssai {\n");
    
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    defaultSingleNssais: ").append(toIndentedString(defaultSingleNssais)).append("\n");
    sb.append("    singleNssais: ").append(toIndentedString(singleNssais)).append("\n");
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


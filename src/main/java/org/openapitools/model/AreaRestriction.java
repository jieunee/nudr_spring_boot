package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AreaInformation;
import org.openapitools.model.RatType;
import org.openapitools.model.RestrictionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AreaRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class AreaRestriction   {
  @JsonProperty("restrictionType")
  private RestrictionType restrictionType = null;

  @JsonProperty("areaInformation")
  private AreaInformation areaInformation = null;

  @JsonProperty("ratTypes")
  @Valid
  private List<RatType> ratTypes = null;

  public AreaRestriction restrictionType(RestrictionType restrictionType) {
    this.restrictionType = restrictionType;
    return this;
  }

  /**
   * Get restrictionType
   * @return restrictionType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RestrictionType getRestrictionType() {
    return restrictionType;
  }

  public void setRestrictionType(RestrictionType restrictionType) {
    this.restrictionType = restrictionType;
  }

  public AreaRestriction areaInformation(AreaInformation areaInformation) {
    this.areaInformation = areaInformation;
    return this;
  }

  /**
   * Get areaInformation
   * @return areaInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AreaInformation getAreaInformation() {
    return areaInformation;
  }

  public void setAreaInformation(AreaInformation areaInformation) {
    this.areaInformation = areaInformation;
  }

  public AreaRestriction ratTypes(List<RatType> ratTypes) {
    this.ratTypes = ratTypes;
    return this;
  }

  public AreaRestriction addRatTypesItem(RatType ratTypesItem) {
    if (this.ratTypes == null) {
      this.ratTypes = new ArrayList<>();
    }
    this.ratTypes.add(ratTypesItem);
    return this;
  }

  /**
   * Get ratTypes
   * @return ratTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RatType> getRatTypes() {
    return ratTypes;
  }

  public void setRatTypes(List<RatType> ratTypes) {
    this.ratTypes = ratTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaRestriction areaRestriction = (AreaRestriction) o;
    return Objects.equals(this.restrictionType, areaRestriction.restrictionType) &&
        Objects.equals(this.areaInformation, areaRestriction.areaInformation) &&
        Objects.equals(this.ratTypes, areaRestriction.ratTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictionType, areaInformation, ratTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaRestriction {\n");
    
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
    sb.append("    areaInformation: ").append(toIndentedString(areaInformation)).append("\n");
    sb.append("    ratTypes: ").append(toIndentedString(ratTypes)).append("\n");
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


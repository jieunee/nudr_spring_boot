package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperatorSpecificDataContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class OperatorSpecificDataContainer   {
  @JsonProperty("StringTypeElements")
  @Valid
  private Map<String, String> stringTypeElements = null;

  @JsonProperty("IntegerTypeElements")
  @Valid
  private Map<String, Integer> integerTypeElements = null;

  @JsonProperty("NumberTypeElements")
  @Valid
  private Map<String, BigDecimal> numberTypeElements = null;

  @JsonProperty("BooleanTypeElements")
  @Valid
  private Map<String, Boolean> booleanTypeElements = null;

  public OperatorSpecificDataContainer stringTypeElements(Map<String, String> stringTypeElements) {
    this.stringTypeElements = stringTypeElements;
    return this;
  }

  public OperatorSpecificDataContainer putStringTypeElementsItem(String key, String stringTypeElementsItem) {
    if (this.stringTypeElements == null) {
      this.stringTypeElements = new HashMap<>();
    }
    this.stringTypeElements.put(key, stringTypeElementsItem);
    return this;
  }

  /**
   * Get stringTypeElements
   * @return stringTypeElements
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getStringTypeElements() {
    return stringTypeElements;
  }

  public void setStringTypeElements(Map<String, String> stringTypeElements) {
    this.stringTypeElements = stringTypeElements;
  }

  public OperatorSpecificDataContainer integerTypeElements(Map<String, Integer> integerTypeElements) {
    this.integerTypeElements = integerTypeElements;
    return this;
  }

  public OperatorSpecificDataContainer putIntegerTypeElementsItem(String key, Integer integerTypeElementsItem) {
    if (this.integerTypeElements == null) {
      this.integerTypeElements = new HashMap<>();
    }
    this.integerTypeElements.put(key, integerTypeElementsItem);
    return this;
  }

  /**
   * Get integerTypeElements
   * @return integerTypeElements
  **/
  @ApiModelProperty(value = "")


  public Map<String, Integer> getIntegerTypeElements() {
    return integerTypeElements;
  }

  public void setIntegerTypeElements(Map<String, Integer> integerTypeElements) {
    this.integerTypeElements = integerTypeElements;
  }

  public OperatorSpecificDataContainer numberTypeElements(Map<String, BigDecimal> numberTypeElements) {
    this.numberTypeElements = numberTypeElements;
    return this;
  }

  public OperatorSpecificDataContainer putNumberTypeElementsItem(String key, BigDecimal numberTypeElementsItem) {
    if (this.numberTypeElements == null) {
      this.numberTypeElements = new HashMap<>();
    }
    this.numberTypeElements.put(key, numberTypeElementsItem);
    return this;
  }

  /**
   * Get numberTypeElements
   * @return numberTypeElements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, BigDecimal> getNumberTypeElements() {
    return numberTypeElements;
  }

  public void setNumberTypeElements(Map<String, BigDecimal> numberTypeElements) {
    this.numberTypeElements = numberTypeElements;
  }

  public OperatorSpecificDataContainer booleanTypeElements(Map<String, Boolean> booleanTypeElements) {
    this.booleanTypeElements = booleanTypeElements;
    return this;
  }

  public OperatorSpecificDataContainer putBooleanTypeElementsItem(String key, Boolean booleanTypeElementsItem) {
    if (this.booleanTypeElements == null) {
      this.booleanTypeElements = new HashMap<>();
    }
    this.booleanTypeElements.put(key, booleanTypeElementsItem);
    return this;
  }

  /**
   * Get booleanTypeElements
   * @return booleanTypeElements
  **/
  @ApiModelProperty(value = "")


  public Map<String, Boolean> getBooleanTypeElements() {
    return booleanTypeElements;
  }

  public void setBooleanTypeElements(Map<String, Boolean> booleanTypeElements) {
    this.booleanTypeElements = booleanTypeElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatorSpecificDataContainer operatorSpecificDataContainer = (OperatorSpecificDataContainer) o;
    return Objects.equals(this.stringTypeElements, operatorSpecificDataContainer.stringTypeElements) &&
        Objects.equals(this.integerTypeElements, operatorSpecificDataContainer.integerTypeElements) &&
        Objects.equals(this.numberTypeElements, operatorSpecificDataContainer.numberTypeElements) &&
        Objects.equals(this.booleanTypeElements, operatorSpecificDataContainer.booleanTypeElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringTypeElements, integerTypeElements, numberTypeElements, booleanTypeElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatorSpecificDataContainer {\n");
    
    sb.append("    stringTypeElements: ").append(toIndentedString(stringTypeElements)).append("\n");
    sb.append("    integerTypeElements: ").append(toIndentedString(integerTypeElements)).append("\n");
    sb.append("    numberTypeElements: ").append(toIndentedString(numberTypeElements)).append("\n");
    sb.append("    booleanTypeElements: ").append(toIndentedString(booleanTypeElements)).append("\n");
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


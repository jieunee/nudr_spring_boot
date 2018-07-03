package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuthMethod;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuthenticationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class AuthenticationData   {
  @JsonProperty("authenticationMethod")
  private AuthMethod authenticationMethod = null;

  @JsonProperty("permanentKey")
  private String permanentKey = null;

  @JsonProperty("sequenceNumber")
  private Integer sequenceNumber = null;

  public AuthenticationData authenticationMethod(AuthMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  /**
   * Get authenticationMethod
   * @return authenticationMethod
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AuthMethod getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(AuthMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public AuthenticationData permanentKey(String permanentKey) {
    this.permanentKey = permanentKey;
    return this;
  }

  /**
   * Get permanentKey
   * @return permanentKey
  **/
  @ApiModelProperty(value = "")


  public String getPermanentKey() {
    return permanentKey;
  }

  public void setPermanentKey(String permanentKey) {
    this.permanentKey = permanentKey;
  }

  public AuthenticationData sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber
   * @return sequenceNumber
  **/
  @ApiModelProperty(value = "")


  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationData authenticationData = (AuthenticationData) o;
    return Objects.equals(this.authenticationMethod, authenticationData.authenticationMethod) &&
        Objects.equals(this.permanentKey, authenticationData.permanentKey) &&
        Objects.equals(this.sequenceNumber, authenticationData.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethod, permanentKey, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationData {\n");
    
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    permanentKey: ").append(toIndentedString(permanentKey)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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


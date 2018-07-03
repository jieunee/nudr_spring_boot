package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SmsSubscriptionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class SmsSubscriptionData   {
  @JsonProperty("smsSupported")
  private Boolean smsSupported = null;

  public SmsSubscriptionData smsSupported(Boolean smsSupported) {
    this.smsSupported = smsSupported;
    return this;
  }

  /**
   * Get smsSupported
   * @return smsSupported
  **/
  @ApiModelProperty(value = "")


  public Boolean getSmsSupported() {
    return smsSupported;
  }

  public void setSmsSupported(Boolean smsSupported) {
    this.smsSupported = smsSupported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsSubscriptionData smsSubscriptionData = (SmsSubscriptionData) o;
    return Objects.equals(this.smsSupported, smsSubscriptionData.smsSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smsSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsSubscriptionData {\n");
    
    sb.append("    smsSupported: ").append(toIndentedString(smsSupported)).append("\n");
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IpAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-03T14:55:43.761+09:00[Asia/Seoul]")

public class IpAddress   {
  @JsonProperty("ipv4Addr")
  private String ipv4Addr = null;

  @JsonProperty("ipv6Addr")
  private String ipv6Addr = null;

  @JsonProperty("ipv6Prefix")
  private String ipv6Prefix = null;

  public IpAddress ipv4Addr(String ipv4Addr) {
    this.ipv4Addr = ipv4Addr;
    return this;
  }

  /**
   * Get ipv4Addr
   * @return ipv4Addr
  **/
  @ApiModelProperty(value = "")


  public String getIpv4Addr() {
    return ipv4Addr;
  }

  public void setIpv4Addr(String ipv4Addr) {
    this.ipv4Addr = ipv4Addr;
  }

  public IpAddress ipv6Addr(String ipv6Addr) {
    this.ipv6Addr = ipv6Addr;
    return this;
  }

  /**
   * Get ipv6Addr
   * @return ipv6Addr
  **/
  @ApiModelProperty(value = "")


  public String getIpv6Addr() {
    return ipv6Addr;
  }

  public void setIpv6Addr(String ipv6Addr) {
    this.ipv6Addr = ipv6Addr;
  }

  public IpAddress ipv6Prefix(String ipv6Prefix) {
    this.ipv6Prefix = ipv6Prefix;
    return this;
  }

  /**
   * Get ipv6Prefix
   * @return ipv6Prefix
  **/
  @ApiModelProperty(value = "")


  public String getIpv6Prefix() {
    return ipv6Prefix;
  }

  public void setIpv6Prefix(String ipv6Prefix) {
    this.ipv6Prefix = ipv6Prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddress ipAddress = (IpAddress) o;
    return Objects.equals(this.ipv4Addr, ipAddress.ipv4Addr) &&
        Objects.equals(this.ipv6Addr, ipAddress.ipv6Addr) &&
        Objects.equals(this.ipv6Prefix, ipAddress.ipv6Prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Addr, ipv6Addr, ipv6Prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddress {\n");
    
    sb.append("    ipv4Addr: ").append(toIndentedString(ipv4Addr)).append("\n");
    sb.append("    ipv6Addr: ").append(toIndentedString(ipv6Addr)).append("\n");
    sb.append("    ipv6Prefix: ").append(toIndentedString(ipv6Prefix)).append("\n");
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


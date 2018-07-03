package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AuthMethod
 */
public enum AuthMethod {
  
  _5G_AKA("5G_AKA"),
  
  EAP_AKA_PRIME("EAP_AKA_PRIME");

  private String value;

  AuthMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuthMethod fromValue(String text) {
    for (AuthMethod b : AuthMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


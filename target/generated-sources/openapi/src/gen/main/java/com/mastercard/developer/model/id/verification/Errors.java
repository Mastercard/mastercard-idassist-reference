/*
 * Mastercard Id Verification API
 * ID Verification provides the technology platform and operational service to perform real-time user identity verification for various use cases including financial services, healthcare, travel and education. The solution is offered via APIs to prove the identity of users based on their verified phone number and social security number.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.model.id.verification;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mastercard.developer.model.id.verification.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of Errors
 */
@ApiModel(description = "List of Errors")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-08T13:32:52.448-06:00[America/Chicago]")
public class Errors {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private List<Error> error = new ArrayList<>();


  public Errors error(List<Error> error) {
    
    this.error = error;
    return this;
  }

  public Errors addErrorItem(Error errorItem) {
    this.error.add(errorItem);
    return this;
  }

   /**
   * Error Details
   * @return error
  **/
  @ApiModelProperty(required = true, value = "Error Details")

  public List<Error> getError() {
    return error;
  }


  public void setError(List<Error> error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errors errors = (Errors) o;
    return Objects.equals(this.error, errors.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errors {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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


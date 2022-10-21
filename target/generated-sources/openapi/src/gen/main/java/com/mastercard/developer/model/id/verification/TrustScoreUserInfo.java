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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TrustScoreUserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-08T13:32:52.448-06:00[America/Chicago]")
public class TrustScoreUserInfo {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_OPTED_IN_CONSENT_STATUS = "optedInConsentStatus";
  @SerializedName(SERIALIZED_NAME_OPTED_IN_CONSENT_STATUS)
  private Boolean optedInConsentStatus;

  public static final String SERIALIZED_NAME_PERFORM_ELIGIBILITY_CHECK = "performEligibilityCheck";
  @SerializedName(SERIALIZED_NAME_PERFORM_ELIGIBILITY_CHECK)
  private Boolean performEligibilityCheck = true;


  public TrustScoreUserInfo phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number being queried in standard international format. It should be prefixed with the international dialling code, without the &#39;+&#39;.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "13143039289", required = true, value = "The phone number being queried in standard international format. It should be prefixed with the international dialling code, without the '+'.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public TrustScoreUserInfo countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO-3166 Alpha-2 standard.
   * @return countryCode
  **/
  @ApiModelProperty(example = "US", required = true, value = "ISO-3166 Alpha-2 standard.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public TrustScoreUserInfo optedInConsentStatus(Boolean optedInConsentStatus) {
    
    this.optedInConsentStatus = optedInConsentStatus;
    return this;
  }

   /**
   * Should be true, validation exception will be thrown if it is false.
   * @return optedInConsentStatus
  **/
  @ApiModelProperty(example = "true", required = true, value = "Should be true, validation exception will be thrown if it is false.")

  public Boolean getOptedInConsentStatus() {
    return optedInConsentStatus;
  }


  public void setOptedInConsentStatus(Boolean optedInConsentStatus) {
    this.optedInConsentStatus = optedInConsentStatus;
  }


  public TrustScoreUserInfo performEligibilityCheck(Boolean performEligibilityCheck) {
    
    this.performEligibilityCheck = performEligibilityCheck;
    return this;
  }

   /**
   * Default true.  If true will perform an eligibility check
   * @return performEligibilityCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Default true.  If true will perform an eligibility check")

  public Boolean getPerformEligibilityCheck() {
    return performEligibilityCheck;
  }


  public void setPerformEligibilityCheck(Boolean performEligibilityCheck) {
    this.performEligibilityCheck = performEligibilityCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustScoreUserInfo trustScoreUserInfo = (TrustScoreUserInfo) o;
    return Objects.equals(this.phoneNumber, trustScoreUserInfo.phoneNumber) &&
        Objects.equals(this.countryCode, trustScoreUserInfo.countryCode) &&
        Objects.equals(this.optedInConsentStatus, trustScoreUserInfo.optedInConsentStatus) &&
        Objects.equals(this.performEligibilityCheck, trustScoreUserInfo.performEligibilityCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, countryCode, optedInConsentStatus, performEligibilityCheck);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustScoreUserInfo {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    optedInConsentStatus: ").append(toIndentedString(optedInConsentStatus)).append("\n");
    sb.append("    performEligibilityCheck: ").append(toIndentedString(performEligibilityCheck)).append("\n");
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


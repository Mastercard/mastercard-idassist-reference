/*
 * Mastercard Id Assist API
 * ID Assist provides the technology platform and operational service to allow the secure storage and transmission of Digital Identity data from the user to the Relying Party. The data is verified to a required level of assurance by an Identity Verification Provider.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * IdentityPrefill
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-08T13:32:51.698-06:00[America/Chicago]")
public class IdentityPrefill {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_LAST4SSN = "last4ssn";
  @SerializedName(SERIALIZED_NAME_LAST4SSN)
  private String last4ssn;

  public static final String SERIALIZED_NAME_NATIONAL_ID = "nationalId";
  @SerializedName(SERIALIZED_NAME_NATIONAL_ID)
  private String nationalId;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_SCOPED_FIELDS = "scopedFields";
  @SerializedName(SERIALIZED_NAME_SCOPED_FIELDS)
  private List<String> scopedFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTED_IN_CONSENT_STATUS = "optedInConsentStatus";
  @SerializedName(SERIALIZED_NAME_OPTED_IN_CONSENT_STATUS)
  private Boolean optedInConsentStatus;

  public static final String SERIALIZED_NAME_PERFORM_ELIGIBILITY_CHECK = "performEligibilityCheck";
  @SerializedName(SERIALIZED_NAME_PERFORM_ELIGIBILITY_CHECK)
  private Boolean performEligibilityCheck = true;


  public IdentityPrefill phoneNumber(String phoneNumber) {
    
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


  public IdentityPrefill dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * date of birth
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1984-01-15", value = "date of birth")

  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public IdentityPrefill last4ssn(String last4ssn) {
    
    this.last4ssn = last4ssn;
    return this;
  }

   /**
   * The User&#39;s last four social security number digits. One of either dob or last4ssn is required. If the countryCode is US then, last4ssn or nationalId is required.
   * @return last4ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "The User's last four social security number digits. One of either dob or last4ssn is required. If the countryCode is US then, last4ssn or nationalId is required.")

  public String getLast4ssn() {
    return last4ssn;
  }


  public void setLast4ssn(String last4ssn) {
    this.last4ssn = last4ssn;
  }


  public IdentityPrefill nationalId(String nationalId) {
    
    this.nationalId = nationalId;
    return this;
  }

   /**
   * The national identification number. If the countryCode is US then, last4ssn or nationalId is required. If both nationalId and last4ssn are present then, use only the nationalId. If the countryCode is US then this field must be a numeric value that is 9 digits long.
   * @return nationalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "The national identification number. If the countryCode is US then, last4ssn or nationalId is required. If both nationalId and last4ssn are present then, use only the nationalId. If the countryCode is US then this field must be a numeric value that is 9 digits long.")

  public String getNationalId() {
    return nationalId;
  }


  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }


  public IdentityPrefill countryCode(String countryCode) {
    
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


  public IdentityPrefill scopedFields(List<String> scopedFields) {
    
    this.scopedFields = scopedFields;
    return this;
  }

  public IdentityPrefill addScopedFieldsItem(String scopedFieldsItem) {
    this.scopedFields.add(scopedFieldsItem);
    return this;
  }

   /**
   * The fields to be scoped.  At least one field in the array should be present.
   * @return scopedFields
  **/
  @ApiModelProperty(example = "[\"firstName\",\"lastName\",\"emailAddress\"]", required = true, value = "The fields to be scoped.  At least one field in the array should be present.")

  public List<String> getScopedFields() {
    return scopedFields;
  }


  public void setScopedFields(List<String> scopedFields) {
    this.scopedFields = scopedFields;
  }


  public IdentityPrefill optedInConsentStatus(Boolean optedInConsentStatus) {
    
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


  public IdentityPrefill performEligibilityCheck(Boolean performEligibilityCheck) {
    
    this.performEligibilityCheck = performEligibilityCheck;
    return this;
  }

   /**
   * If false will not perform an eligibility check
   * @return performEligibilityCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If false will not perform an eligibility check")

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
    IdentityPrefill identityPrefill = (IdentityPrefill) o;
    return Objects.equals(this.phoneNumber, identityPrefill.phoneNumber) &&
        Objects.equals(this.dob, identityPrefill.dob) &&
        Objects.equals(this.last4ssn, identityPrefill.last4ssn) &&
        Objects.equals(this.nationalId, identityPrefill.nationalId) &&
        Objects.equals(this.countryCode, identityPrefill.countryCode) &&
        Objects.equals(this.scopedFields, identityPrefill.scopedFields) &&
        Objects.equals(this.optedInConsentStatus, identityPrefill.optedInConsentStatus) &&
        Objects.equals(this.performEligibilityCheck, identityPrefill.performEligibilityCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, dob, last4ssn, nationalId, countryCode, scopedFields, optedInConsentStatus, performEligibilityCheck);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityPrefill {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    last4ssn: ").append(toIndentedString(last4ssn)).append("\n");
    sb.append("    nationalId: ").append(toIndentedString(nationalId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    scopedFields: ").append(toIndentedString(scopedFields)).append("\n");
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


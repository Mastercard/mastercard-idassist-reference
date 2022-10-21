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
 * IdentityVerificationUserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-08T13:32:52.448-06:00[America/Chicago]")
public class IdentityVerificationUserInfo {
  public static final String SERIALIZED_NAME_OPTED_IN_CONSENT_STATUS = "optedInConsentStatus";
  @SerializedName(SERIALIZED_NAME_OPTED_IN_CONSENT_STATUS)
  private Boolean optedInConsentStatus;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_EXTENDED_ADDRESS = "extendedAddress";
  @SerializedName(SERIALIZED_NAME_EXTENDED_ADDRESS)
  private String extendedAddress;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_LAST4SSN = "last4ssn";
  @SerializedName(SERIALIZED_NAME_LAST4SSN)
  private String last4ssn;

  public static final String SERIALIZED_NAME_NATIONAL_ID = "nationalId";
  @SerializedName(SERIALIZED_NAME_NATIONAL_ID)
  private String nationalId;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;


  public IdentityVerificationUserInfo optedInConsentStatus(Boolean optedInConsentStatus) {
    
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


  public IdentityVerificationUserInfo phoneNumber(String phoneNumber) {
    
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


  public IdentityVerificationUserInfo firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The user&#39;s first name
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "The user's first name")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public IdentityVerificationUserInfo lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The user&#39;s last name
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "The user's last name")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public IdentityVerificationUserInfo countryCode(String countryCode) {
    
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


  public IdentityVerificationUserInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The user&#39;s address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123 Main St", value = "The user's address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public IdentityVerificationUserInfo extendedAddress(String extendedAddress) {
    
    this.extendedAddress = extendedAddress;
    return this;
  }

   /**
   * The user&#39;s address complement
   * @return extendedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Apt. 202", value = "The user's address complement")

  public String getExtendedAddress() {
    return extendedAddress;
  }


  public void setExtendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
  }


  public IdentityVerificationUserInfo city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The user&#39;s city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "San Francisco", value = "The user's city")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public IdentityVerificationUserInfo region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The user&#39;s region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CA", value = "The user's region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public IdentityVerificationUserInfo postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * If address matching is desired at a minimum &#x60;&#x60;postalCode&#x60;&#x60; is required
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "94015", value = "If address matching is desired at a minimum ``postalCode`` is required")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public IdentityVerificationUserInfo dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * The user&#39;s date of birth format YYYY-MM-DD. One of either dob or last4ssn is required.
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1984-01-15", value = "The user's date of birth format YYYY-MM-DD. One of either dob or last4ssn is required.")

  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public IdentityVerificationUserInfo last4ssn(String last4ssn) {
    
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


  public IdentityVerificationUserInfo nationalId(String nationalId) {
    
    this.nationalId = nationalId;
    return this;
  }

   /**
   * The national identification number. If the countryCode is US then, last4ssn or nationalId is required. If both nationalId and last4ssn are present then, use only the nationalId.
   * @return nationalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "The national identification number. If the countryCode is US then, last4ssn or nationalId is required. If both nationalId and last4ssn are present then, use only the nationalId.")

  public String getNationalId() {
    return nationalId;
  }


  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }


  public IdentityVerificationUserInfo emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The user&#39;s email address
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc@def.com", value = "The user's email address")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationUserInfo identityVerificationUserInfo = (IdentityVerificationUserInfo) o;
    return Objects.equals(this.optedInConsentStatus, identityVerificationUserInfo.optedInConsentStatus) &&
        Objects.equals(this.phoneNumber, identityVerificationUserInfo.phoneNumber) &&
        Objects.equals(this.firstName, identityVerificationUserInfo.firstName) &&
        Objects.equals(this.lastName, identityVerificationUserInfo.lastName) &&
        Objects.equals(this.countryCode, identityVerificationUserInfo.countryCode) &&
        Objects.equals(this.address, identityVerificationUserInfo.address) &&
        Objects.equals(this.extendedAddress, identityVerificationUserInfo.extendedAddress) &&
        Objects.equals(this.city, identityVerificationUserInfo.city) &&
        Objects.equals(this.region, identityVerificationUserInfo.region) &&
        Objects.equals(this.postalCode, identityVerificationUserInfo.postalCode) &&
        Objects.equals(this.dob, identityVerificationUserInfo.dob) &&
        Objects.equals(this.last4ssn, identityVerificationUserInfo.last4ssn) &&
        Objects.equals(this.nationalId, identityVerificationUserInfo.nationalId) &&
        Objects.equals(this.emailAddress, identityVerificationUserInfo.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optedInConsentStatus, phoneNumber, firstName, lastName, countryCode, address, extendedAddress, city, region, postalCode, dob, last4ssn, nationalId, emailAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationUserInfo {\n");
    sb.append("    optedInConsentStatus: ").append(toIndentedString(optedInConsentStatus)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    last4ssn: ").append(toIndentedString(last4ssn)).append("\n");
    sb.append("    nationalId: ").append(toIndentedString(nationalId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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


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
import com.mastercard.developer.model.id.verification.IdentityVerificationAddress;
import com.mastercard.developer.model.id.verification.IdentityVerificationEmail;
import com.mastercard.developer.model.id.verification.IdentityVerificationIdentifiers;
import com.mastercard.developer.model.id.verification.IdentityVerificationName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IdentityVerification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-08T13:32:52.448-06:00[America/Chicago]")
public class IdentityVerification {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private IdentityVerificationName name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private IdentityVerificationAddress address;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private IdentityVerificationIdentifiers identifiers;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private IdentityVerificationEmail email;

  public static final String SERIALIZED_NAME_TRUST_SCORE = "trustScore";
  @SerializedName(SERIALIZED_NAME_TRUST_SCORE)
  private Integer trustScore;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_REASON_CODES = "reasonCodes";
  @SerializedName(SERIALIZED_NAME_REASON_CODES)
  private List<String> reasonCodes = null;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_LINE_TYPE = "lineType";
  @SerializedName(SERIALIZED_NAME_LINE_TYPE)
  private String lineType;


  public IdentityVerification transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * A random 128-bit. UUID representing the MIDS transaction
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7f83-b0c4-90e0-90b3-11e10800200c9a66", value = "A random 128-bit. UUID representing the MIDS transaction")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public IdentityVerification name(IdentityVerificationName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationName getName() {
    return name;
  }


  public void setName(IdentityVerificationName name) {
    this.name = name;
  }


  public IdentityVerification address(IdentityVerificationAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationAddress getAddress() {
    return address;
  }


  public void setAddress(IdentityVerificationAddress address) {
    this.address = address;
  }


  public IdentityVerification identifiers(IdentityVerificationIdentifiers identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationIdentifiers getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(IdentityVerificationIdentifiers identifiers) {
    this.identifiers = identifiers;
  }


  public IdentityVerification email(IdentityVerificationEmail email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationEmail getEmail() {
    return email;
  }


  public void setEmail(IdentityVerificationEmail email) {
    this.email = email;
  }


  public IdentityVerification trustScore(Integer trustScore) {
    
    this.trustScore = trustScore;
    return this;
  }

   /**
   * The user&#39;s trust score
   * @return trustScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The user's trust score")

  public Integer getTrustScore() {
    return trustScore;
  }


  public void setTrustScore(Integer trustScore) {
    this.trustScore = trustScore;
  }


  public IdentityVerification phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The user&#39;s phone number
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13143039289", value = "The user's phone number")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public IdentityVerification reasonCodes(List<String> reasonCodes) {
    
    this.reasonCodes = reasonCodes;
    return this;
  }

  public IdentityVerification addReasonCodesItem(String reasonCodesItem) {
    if (this.reasonCodes == null) {
      this.reasonCodes = new ArrayList<>();
    }
    this.reasonCodes.add(reasonCodesItem);
    return this;
  }

   /**
   * An array of indicators that provide additional context about the Transaction. For complete list. |   Reason Code |   Description | |:--------------|:------------------| |AC|Normalized address was used to complete empty address fields prior to match.| |AU|Address Undeliverable.| |BA|Business Address.| |BL|Mobile Business Line.| |CN|First and Last name combined in one field.| |DA|Dual address (Ex. 123 Main St PO Box 99).| |DI|Death Indicator found on data.| |DT|Data retrieval timeout (verify API only).| |DV|High device change velocity.| |FN|Family name found and used in matching.| |GL|Mobile Government Line.| |HR|High-rise; address contains apartment or building sub-units.| |HV|High velocity of change events associated with phone.| |IA|Inactive address.| |LA|Low Tenure Address.| |LP|Low Tenure Device.| |LS|Low Tenure SIM.| |LT|Low Tenure Mobile Identity.| |MA|Address in the request associated with multiple active addresses.| |MI|Military address.| |NA|Address is valid and has been normalized prior to calculating the match score.| |NC|Name &amp; Address information is not available.| |ND|Network Status information is not available.| |NM|Not a mobile line type.| |NN|Nick name found and used in matching. For example Bill matches with William.| |NP|Non personal line.| |NS|Names were swapped (first/last).| |NU|Phone number has been updated.| |NV|Phone number not valid.| |OL|How long the identity has been associated to a phone number. Long Tenure &gt; 90 days.| |OS|How long the identity has been associated to a phone number. Short Tenure between 8 and 90 days.| |OU|The date attributes associated to the phone number is not available. Ownership Tenure is Unknown.| |OV|How long the identity has been associated to a phone number. Very Short &lt; 7 days.| |P3|Postal code submitted matched first 3 digits.| |P5|Postal code submitted matched first 5 digits.| |P9|Postal code submitted matched first 9 digits.| |PM|Address associated with a Private Mailbox operator (Ex. UPS Store).| |PN|Mobile Phone number is not active.| |PO|Address is a PO Box.| |PT|Phone Number is currently in a ported state.| |RA|Raw Address matched better than normalized Address.| |RL|Phone Number is associated with a high-risk linetype (Non-Fixed &#x60;VoIP&#x60; or Prepaid &#x60;MVNO&#x60;).| |RM|Matching used only Raw data.| |SA|Sub-account line.| |UC|Insufficient data to calculate trustScore.| |UV|Unable to verify address.| |VA|Address is vacant (unoccupied in the past 90 days).| More details see [link](http://docs.payfone.com/v1.0/reference#reason-codes) 
   * @return reasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"LP\",\"LS\"]", value = "An array of indicators that provide additional context about the Transaction. For complete list. |   Reason Code |   Description | |:--------------|:------------------| |AC|Normalized address was used to complete empty address fields prior to match.| |AU|Address Undeliverable.| |BA|Business Address.| |BL|Mobile Business Line.| |CN|First and Last name combined in one field.| |DA|Dual address (Ex. 123 Main St PO Box 99).| |DI|Death Indicator found on data.| |DT|Data retrieval timeout (verify API only).| |DV|High device change velocity.| |FN|Family name found and used in matching.| |GL|Mobile Government Line.| |HR|High-rise; address contains apartment or building sub-units.| |HV|High velocity of change events associated with phone.| |IA|Inactive address.| |LA|Low Tenure Address.| |LP|Low Tenure Device.| |LS|Low Tenure SIM.| |LT|Low Tenure Mobile Identity.| |MA|Address in the request associated with multiple active addresses.| |MI|Military address.| |NA|Address is valid and has been normalized prior to calculating the match score.| |NC|Name & Address information is not available.| |ND|Network Status information is not available.| |NM|Not a mobile line type.| |NN|Nick name found and used in matching. For example Bill matches with William.| |NP|Non personal line.| |NS|Names were swapped (first/last).| |NU|Phone number has been updated.| |NV|Phone number not valid.| |OL|How long the identity has been associated to a phone number. Long Tenure > 90 days.| |OS|How long the identity has been associated to a phone number. Short Tenure between 8 and 90 days.| |OU|The date attributes associated to the phone number is not available. Ownership Tenure is Unknown.| |OV|How long the identity has been associated to a phone number. Very Short < 7 days.| |P3|Postal code submitted matched first 3 digits.| |P5|Postal code submitted matched first 5 digits.| |P9|Postal code submitted matched first 9 digits.| |PM|Address associated with a Private Mailbox operator (Ex. UPS Store).| |PN|Mobile Phone number is not active.| |PO|Address is a PO Box.| |PT|Phone Number is currently in a ported state.| |RA|Raw Address matched better than normalized Address.| |RL|Phone Number is associated with a high-risk linetype (Non-Fixed `VoIP` or Prepaid `MVNO`).| |RM|Matching used only Raw data.| |SA|Sub-account line.| |UC|Insufficient data to calculate trustScore.| |UV|Unable to verify address.| |VA|Address is vacant (unoccupied in the past 90 days).| More details see [link](http://docs.payfone.com/v1.0/reference#reason-codes) ")

  public List<String> getReasonCodes() {
    return reasonCodes;
  }


  public void setReasonCodes(List<String> reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  public IdentityVerification verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Whether a user identity is verified
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a user identity is verified")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public IdentityVerification lineType(String lineType) {
    
    this.lineType = lineType;
    return this;
  }

   /**
   * The line type. It can be either &#x60;&#x60;Mobile&#x60;&#x60;, &#x60;&#x60;Landline&#x60;&#x60;, &#x60;&#x60;FixedVoIP&#x60;&#x60; or &#x60;&#x60;NonFixedVoIP&#x60;&#x60;
   * @return lineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mobile", value = "The line type. It can be either ``Mobile``, ``Landline``, ``FixedVoIP`` or ``NonFixedVoIP``")

  public String getLineType() {
    return lineType;
  }


  public void setLineType(String lineType) {
    this.lineType = lineType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerification identityVerification = (IdentityVerification) o;
    return Objects.equals(this.transactionId, identityVerification.transactionId) &&
        Objects.equals(this.name, identityVerification.name) &&
        Objects.equals(this.address, identityVerification.address) &&
        Objects.equals(this.identifiers, identityVerification.identifiers) &&
        Objects.equals(this.email, identityVerification.email) &&
        Objects.equals(this.trustScore, identityVerification.trustScore) &&
        Objects.equals(this.phoneNumber, identityVerification.phoneNumber) &&
        Objects.equals(this.reasonCodes, identityVerification.reasonCodes) &&
        Objects.equals(this.verified, identityVerification.verified) &&
        Objects.equals(this.lineType, identityVerification.lineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, name, address, identifiers, email, trustScore, phoneNumber, reasonCodes, verified, lineType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerification {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    trustScore: ").append(toIndentedString(trustScore)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
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


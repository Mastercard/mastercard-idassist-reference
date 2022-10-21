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
 * TrustScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-08T13:32:51.698-06:00[America/Chicago]")
public class TrustScore {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_LINE_TYPE = "lineType";
  @SerializedName(SERIALIZED_NAME_LINE_TYPE)
  private String lineType;

  public static final String SERIALIZED_NAME_TRUST_SCORE = "trustScore";
  @SerializedName(SERIALIZED_NAME_TRUST_SCORE)
  private Integer trustScore;

  public static final String SERIALIZED_NAME_REASON_CODES = "reasonCodes";
  @SerializedName(SERIALIZED_NAME_REASON_CODES)
  private List<String> reasonCodes = null;

  public static final String SERIALIZED_NAME_ELIGIBILITY = "eligibility";
  @SerializedName(SERIALIZED_NAME_ELIGIBILITY)
  private Boolean eligibility;


  public TrustScore transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * A random 128-bit. UUID representing the MIDS transaction
   * @return transactionId
  **/
  @ApiModelProperty(example = "7f83-b0c4-90e0-90b3-11e10800200c9a66", required = true, value = "A random 128-bit. UUID representing the MIDS transaction")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public TrustScore lineType(String lineType) {
    
    this.lineType = lineType;
    return this;
  }

   /**
   * A string value that denotes the line characteristics of the phone number. Possible values: &#39;landline&#39;, &#39;mobile&#39;, &#39;fixedVoIP&#39;, &#39;nonFixedVoIP&#39;, &#39;other&#39;
   * @return lineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "landline", value = "A string value that denotes the line characteristics of the phone number. Possible values: 'landline', 'mobile', 'fixedVoIP', 'nonFixedVoIP', 'other'")

  public String getLineType() {
    return lineType;
  }


  public void setLineType(String lineType) {
    this.lineType = lineType;
  }


  public TrustScore trustScore(Integer trustScore) {
    
    this.trustScore = trustScore;
    return this;
  }

   /**
   * An integer value ranging from 0 - 1000 that denotes the real-time trustworthiness of a phone number. 1000 indicates perfect trust while 0 indicates a complete lack of trust.
   * @return trustScore
  **/
  @ApiModelProperty(example = "1000", required = true, value = "An integer value ranging from 0 - 1000 that denotes the real-time trustworthiness of a phone number. 1000 indicates perfect trust while 0 indicates a complete lack of trust.")

  public Integer getTrustScore() {
    return trustScore;
  }


  public void setTrustScore(Integer trustScore) {
    this.trustScore = trustScore;
  }


  public TrustScore reasonCodes(List<String> reasonCodes) {
    
    this.reasonCodes = reasonCodes;
    return this;
  }

  public TrustScore addReasonCodesItem(String reasonCodesItem) {
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


  public TrustScore eligibility(Boolean eligibility) {
    
    this.eligibility = eligibility;
    return this;
  }

   /**
   * A flag indicating eligibility.
   * @return eligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A flag indicating eligibility.")

  public Boolean getEligibility() {
    return eligibility;
  }


  public void setEligibility(Boolean eligibility) {
    this.eligibility = eligibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustScore trustScore = (TrustScore) o;
    return Objects.equals(this.transactionId, trustScore.transactionId) &&
        Objects.equals(this.lineType, trustScore.lineType) &&
        Objects.equals(this.trustScore, trustScore.trustScore) &&
        Objects.equals(this.reasonCodes, trustScore.reasonCodes) &&
        Objects.equals(this.eligibility, trustScore.eligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, lineType, trustScore, reasonCodes, eligibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustScore {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    trustScore: ").append(toIndentedString(trustScore)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
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


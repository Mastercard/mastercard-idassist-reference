package com.mastercard.developer.component;

import com.mastercard.developer.example.DataExtractionsServiceExample;
import com.mastercard.developer.example.DeviceAuthenticationExample;
import com.mastercard.developer.example.SmsOtpExample;
import com.mastercard.developer.example.SourceVerificationExample;
import com.mastercard.developer.example.SourceVerificationMedicareExample;
import com.mastercard.developer.example.TrustScoreExample;
import com.mastercard.developer.example.UserExample;
import com.mastercard.developer.service.DataExtractionsService;
import com.mastercard.developer.service.DeviceAuthenticationService;
import com.mastercard.developer.service.MedicareSourceVerificationService;
import com.mastercard.developer.service.SmsOtpService;
import com.mastercard.developer.service.SourceVerificationService;
import com.mastercard.developer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.mastercard.developer.example.DataExtractionsServiceExample.DOCUMENT_TYPE_DRIVING_LICENSE;
import static com.mastercard.developer.example.DataExtractionsServiceExample.RETRIEVE_DOCUMENT_IMAGES;
import static com.mastercard.developer.example.DataExtractionsServiceExample.RETRIEVE_FACEMAP;
import static com.mastercard.developer.example.DataExtractionsServiceExample.RETRIEVE_SELFIE;
import static com.mastercard.developer.example.DataExtractionsServiceExample.SCAN_ID;
import static com.mastercard.developer.example.DataExtractionsServiceExample.USER_CONSENT;
import static com.mastercard.developer.example.DataExtractionsServiceExample.USER_SELECTED_COUNTRY;
import static com.mastercard.developer.example.SourceVerificationExample.DOCUMENT_ISSUING_COUNTRY;

@Component
@RequiredArgsConstructor
public class MIDSReference {

    private final UserService userService;
    private final SmsOtpService smsOtpService;
    private final DeviceAuthenticationService deviceAuthenticationService;
    private final DataExtractionsService dataExtractionsService;
    private final SourceVerificationService sourceVerificationService;
    private final MedicareSourceVerificationService medicareSourceVerificationService;

    public void performUserIdentityVerification() {
        userService.createUserVerification(UserExample.getIdentityVerificationUserInfo());
    }
    public void performUserIdentityRetrieval() {
        userService.create(UserExample.getIdentity());
    }

    public void performSmsOtpFlow() {
        callOtpFlow();
    }

    public void performTrustScore() {
        userService.trust(TrustScoreExample.getTrustScoreUserInfo());
    }

    public void performDeviceAuthentication() {
        callDeviceAuthenticationFlows();
    }

    public void performMedicalCare() {
        medicareSourceVerificationService.createMedicareCardRequest(DOCUMENT_ISSUING_COUNTRY, SourceVerificationMedicareExample.createSourceVerificationMedicareCardRequestAttributes());
    }

    public void performDataExtraction() {
        callDataExtractionFlows();
    }

    public void performDrivingLicenseSourceVerification() {
        sourceVerificationService.sourceVerificationDrivingLicense(DOCUMENT_ISSUING_COUNTRY, SourceVerificationExample.createSourceVerificationDrivingLicenseRequestAttributes());
    }
    public void performPassportSourceVerification() {
        sourceVerificationService.sourceVerificationPassport(DOCUMENT_ISSUING_COUNTRY, SourceVerificationExample.createSourceVerificationPassportRequestAttributes());
    }

    private void callDataExtractionFlows() {
        dataExtractionsService.dataExtractionAccessToken(DataExtractionsServiceExample.getAccessTokenExample());
        dataExtractionsService.extractScannedDocumentData(SCAN_ID, USER_CONSENT, RETRIEVE_SELFIE, RETRIEVE_DOCUMENT_IMAGES, RETRIEVE_FACEMAP, DOCUMENT_TYPE_DRIVING_LICENSE, USER_SELECTED_COUNTRY);
    }

    private void callDeviceAuthenticationFlows() {
        deviceAuthenticationService.createDeviceAuthentication(DeviceAuthenticationExample.getDeviceIpAddress());
        deviceAuthenticationService.createDeviceAuthenticationVerification(DeviceAuthenticationExample.getDeviceVerificationFingerprint());
    }

    private void callOtpFlow() {
        smsOtpService.createOtpsSMS(SmsOtpExample.getSmsOtp());
        smsOtpService.createVerifyOtps(SmsOtpExample.getOtpVerification());
    }
}

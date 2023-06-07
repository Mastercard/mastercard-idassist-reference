/*
 Copyright (c) 2021 Mastercard

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.mastercard.developer.example;

import com.mastercard.dis.mids.model.id.verification.DeviceIpAddress;
import com.mastercard.dis.mids.model.id.verification.DeviceVerificationFingerprint;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DeviceAuthenticationExample {

    public static com.mastercard.dis.mids.model.id.verification.DeviceIpAddress getDeviceIpAddress() {
        //Update the ip address when trying to run this test case.
        com.mastercard.dis.mids.model.id.verification.DeviceIpAddress deviceIpAddress = new DeviceIpAddress();
        deviceIpAddress.setOptedInConsentStatus(true);
        deviceIpAddress.setCountryCode("US");
        deviceIpAddress.setDeviceIp("127.0.0.1");
        return deviceIpAddress;
    }

    public static com.mastercard.dis.mids.model.id.verification.DeviceVerificationFingerprint getDeviceVerificationFingerprint() {
        com.mastercard.dis.mids.model.id.verification.DeviceVerificationFingerprint deviceVerificationFingerprint = new DeviceVerificationFingerprint();
        deviceVerificationFingerprint.setOptedInConsentStatus(true);
        deviceVerificationFingerprint.setCountryCode("US");
        deviceVerificationFingerprint.setVerificationFingerprint("4f544a6a596a4d304d3249745a4752684f5330304d3249794c5745324e7a41744d44646d5a5459314d57526a593245306644413d3a4e5af1cf7e052335e57a51f3e0b1362fa58d4c220d9adef9179895b4c4beda59");
        return deviceVerificationFingerprint;
    }
}

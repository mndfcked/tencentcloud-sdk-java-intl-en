/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceFingerprint extends AbstractModel{

    /**
    * Fingerprint information collected by device fingerprint collector. Its format must be in the following regular expression: ^[0-9a-f]{8}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{16}$
    */
    @SerializedName("Identity")
    @Expose
    private String Identity;

    /**
    * Description, such as IP and device name. Length limit: 1,024 bytes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Fingerprint information collected by device fingerprint collector. Its format must be in the following regular expression: ^[0-9a-f]{8}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{16}$ 
     * @return Identity Fingerprint information collected by device fingerprint collector. Its format must be in the following regular expression: ^[0-9a-f]{8}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{16}$
     */
    public String getIdentity() {
        return this.Identity;
    }

    /**
     * Set Fingerprint information collected by device fingerprint collector. Its format must be in the following regular expression: ^[0-9a-f]{8}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{16}$
     * @param Identity Fingerprint information collected by device fingerprint collector. Its format must be in the following regular expression: ^[0-9a-f]{8}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{14}[\-][0-9a-f]{16}$
     */
    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    /**
     * Get Description, such as IP and device name. Length limit: 1,024 bytes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Description, such as IP and device name. Length limit: 1,024 bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description, such as IP and device name. Length limit: 1,024 bytes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Description, such as IP and device name. Length limit: 1,024 bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identity", this.Identity);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmailIdentity extends AbstractModel{

    /**
    * Sender domain.
    */
    @SerializedName("IdentityName")
    @Expose
    private String IdentityName;

    /**
    * Verification type. The value is fixed to `DOMAIN`.
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * Verification passed or not.
    */
    @SerializedName("SendingEnabled")
    @Expose
    private Boolean SendingEnabled;

    /**
     * Get Sender domain. 
     * @return IdentityName Sender domain.
     */
    public String getIdentityName() {
        return this.IdentityName;
    }

    /**
     * Set Sender domain.
     * @param IdentityName Sender domain.
     */
    public void setIdentityName(String IdentityName) {
        this.IdentityName = IdentityName;
    }

    /**
     * Get Verification type. The value is fixed to `DOMAIN`. 
     * @return IdentityType Verification type. The value is fixed to `DOMAIN`.
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set Verification type. The value is fixed to `DOMAIN`.
     * @param IdentityType Verification type. The value is fixed to `DOMAIN`.
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get Verification passed or not. 
     * @return SendingEnabled Verification passed or not.
     */
    public Boolean getSendingEnabled() {
        return this.SendingEnabled;
    }

    /**
     * Set Verification passed or not.
     * @param SendingEnabled Verification passed or not.
     */
    public void setSendingEnabled(Boolean SendingEnabled) {
        this.SendingEnabled = SendingEnabled;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityName", this.IdentityName);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "SendingEnabled", this.SendingEnabled);

    }
}


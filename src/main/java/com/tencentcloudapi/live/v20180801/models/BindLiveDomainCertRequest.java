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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindLiveDomainCertRequest extends AbstractModel{

    /**
    * Certificate ID, which can be obtained through the `CreateLiveCert` API.
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * Playback domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * HTTPS status. 0: disabled, 1: enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Certificate ID, which can be obtained through the `CreateLiveCert` API. 
     * @return CertId Certificate ID, which can be obtained through the `CreateLiveCert` API.
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID, which can be obtained through the `CreateLiveCert` API.
     * @param CertId Certificate ID, which can be obtained through the `CreateLiveCert` API.
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Playback domain name. 
     * @return DomainName Playback domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Playback domain name.
     * @param DomainName Playback domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get HTTPS status. 0: disabled, 1: enabled. 
     * @return Status HTTPS status. 0: disabled, 1: enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set HTTPS status. 0: disabled, 1: enabled.
     * @param Status HTTPS status. 0: disabled, 1: enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}


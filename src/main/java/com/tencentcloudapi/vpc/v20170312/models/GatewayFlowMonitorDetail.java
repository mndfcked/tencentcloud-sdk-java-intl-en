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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayFlowMonitorDetail extends AbstractModel{

    /**
    * Origin `IP`.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * Inbound packets.
    */
    @SerializedName("InPkg")
    @Expose
    private Long InPkg;

    /**
    * Outbound packets.
    */
    @SerializedName("OutPkg")
    @Expose
    private Long OutPkg;

    /**
    * Inbound bandwidth, unit: `Byte`.
    */
    @SerializedName("InTraffic")
    @Expose
    private Long InTraffic;

    /**
    * Outbound bandwidth, unit: `Byte`.
    */
    @SerializedName("OutTraffic")
    @Expose
    private Long OutTraffic;

    /**
     * Get Origin `IP`. 
     * @return PrivateIpAddress Origin `IP`.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Origin `IP`.
     * @param PrivateIpAddress Origin `IP`.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get Inbound packets. 
     * @return InPkg Inbound packets.
     */
    public Long getInPkg() {
        return this.InPkg;
    }

    /**
     * Set Inbound packets.
     * @param InPkg Inbound packets.
     */
    public void setInPkg(Long InPkg) {
        this.InPkg = InPkg;
    }

    /**
     * Get Outbound packets. 
     * @return OutPkg Outbound packets.
     */
    public Long getOutPkg() {
        return this.OutPkg;
    }

    /**
     * Set Outbound packets.
     * @param OutPkg Outbound packets.
     */
    public void setOutPkg(Long OutPkg) {
        this.OutPkg = OutPkg;
    }

    /**
     * Get Inbound bandwidth, unit: `Byte`. 
     * @return InTraffic Inbound bandwidth, unit: `Byte`.
     */
    public Long getInTraffic() {
        return this.InTraffic;
    }

    /**
     * Set Inbound bandwidth, unit: `Byte`.
     * @param InTraffic Inbound bandwidth, unit: `Byte`.
     */
    public void setInTraffic(Long InTraffic) {
        this.InTraffic = InTraffic;
    }

    /**
     * Get Outbound bandwidth, unit: `Byte`. 
     * @return OutTraffic Outbound bandwidth, unit: `Byte`.
     */
    public Long getOutTraffic() {
        return this.OutTraffic;
    }

    /**
     * Set Outbound bandwidth, unit: `Byte`.
     * @param OutTraffic Outbound bandwidth, unit: `Byte`.
     */
    public void setOutTraffic(Long OutTraffic) {
        this.OutTraffic = OutTraffic;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "InPkg", this.InPkg);
        this.setParamSimple(map, prefix + "OutPkg", this.OutPkg);
        this.setParamSimple(map, prefix + "InTraffic", this.InTraffic);
        this.setParamSimple(map, prefix + "OutTraffic", this.OutTraffic);

    }
}


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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DstInfo extends AbstractModel{

    /**
    * Migration destination region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Migration destination port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Migration destination instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Migration destination region 
     * @return Region Migration destination region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Migration destination region
     * @param Region Migration destination region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get  
     * @return Ip 
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 
     * @param Ip 
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Migration destination port 
     * @return Port Migration destination port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Migration destination port
     * @param Port Migration destination port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Migration destination instance ID 
     * @return InstanceId Migration destination instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Migration destination instance ID
     * @param InstanceId Migration destination instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}


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

public class PlaySumStatInfo extends AbstractModel{

    /**
    * Domain name or stream ID.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Average download speed,
In MB/s.
Calculation formula: average download speed per minute.
    */
    @SerializedName("AvgFluxPerSecond")
    @Expose
    private Float AvgFluxPerSecond;

    /**
    * Total traffic in MB.
    */
    @SerializedName("TotalFlux")
    @Expose
    private Float TotalFlux;

    /**
    * Total number of requests.
    */
    @SerializedName("TotalRequest")
    @Expose
    private Long TotalRequest;

    /**
     * Get Domain name or stream ID. 
     * @return Name Domain name or stream ID.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Domain name or stream ID.
     * @param Name Domain name or stream ID.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Average download speed,
In MB/s.
Calculation formula: average download speed per minute. 
     * @return AvgFluxPerSecond Average download speed,
In MB/s.
Calculation formula: average download speed per minute.
     */
    public Float getAvgFluxPerSecond() {
        return this.AvgFluxPerSecond;
    }

    /**
     * Set Average download speed,
In MB/s.
Calculation formula: average download speed per minute.
     * @param AvgFluxPerSecond Average download speed,
In MB/s.
Calculation formula: average download speed per minute.
     */
    public void setAvgFluxPerSecond(Float AvgFluxPerSecond) {
        this.AvgFluxPerSecond = AvgFluxPerSecond;
    }

    /**
     * Get Total traffic in MB. 
     * @return TotalFlux Total traffic in MB.
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set Total traffic in MB.
     * @param TotalFlux Total traffic in MB.
     */
    public void setTotalFlux(Float TotalFlux) {
        this.TotalFlux = TotalFlux;
    }

    /**
     * Get Total number of requests. 
     * @return TotalRequest Total number of requests.
     */
    public Long getTotalRequest() {
        return this.TotalRequest;
    }

    /**
     * Set Total number of requests.
     * @param TotalRequest Total number of requests.
     */
    public void setTotalRequest(Long TotalRequest) {
        this.TotalRequest = TotalRequest;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AvgFluxPerSecond", this.AvgFluxPerSecond);
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);

    }
}


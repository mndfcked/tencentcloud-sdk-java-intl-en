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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicPodSpec extends AbstractModel{

    /**
    * Minimum number of CPU cores
    */
    @SerializedName("RequestCpu")
    @Expose
    private Float RequestCpu;

    /**
    * Maximum number of CPU cores
    */
    @SerializedName("LimitCpu")
    @Expose
    private Float LimitCpu;

    /**
    * Minimum memory in MB
    */
    @SerializedName("RequestMemory")
    @Expose
    private Float RequestMemory;

    /**
    * Maximum memory in MB
    */
    @SerializedName("LimitMemory")
    @Expose
    private Float LimitMemory;

    /**
     * Get Minimum number of CPU cores 
     * @return RequestCpu Minimum number of CPU cores
     */
    public Float getRequestCpu() {
        return this.RequestCpu;
    }

    /**
     * Set Minimum number of CPU cores
     * @param RequestCpu Minimum number of CPU cores
     */
    public void setRequestCpu(Float RequestCpu) {
        this.RequestCpu = RequestCpu;
    }

    /**
     * Get Maximum number of CPU cores 
     * @return LimitCpu Maximum number of CPU cores
     */
    public Float getLimitCpu() {
        return this.LimitCpu;
    }

    /**
     * Set Maximum number of CPU cores
     * @param LimitCpu Maximum number of CPU cores
     */
    public void setLimitCpu(Float LimitCpu) {
        this.LimitCpu = LimitCpu;
    }

    /**
     * Get Minimum memory in MB 
     * @return RequestMemory Minimum memory in MB
     */
    public Float getRequestMemory() {
        return this.RequestMemory;
    }

    /**
     * Set Minimum memory in MB
     * @param RequestMemory Minimum memory in MB
     */
    public void setRequestMemory(Float RequestMemory) {
        this.RequestMemory = RequestMemory;
    }

    /**
     * Get Maximum memory in MB 
     * @return LimitMemory Maximum memory in MB
     */
    public Float getLimitMemory() {
        return this.LimitMemory;
    }

    /**
     * Set Maximum memory in MB
     * @param LimitMemory Maximum memory in MB
     */
    public void setLimitMemory(Float LimitMemory) {
        this.LimitMemory = LimitMemory;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestCpu", this.RequestCpu);
        this.setParamSimple(map, prefix + "LimitCpu", this.LimitCpu);
        this.setParamSimple(map, prefix + "RequestMemory", this.RequestMemory);
        this.setParamSimple(map, prefix + "LimitMemory", this.LimitMemory);

    }
}


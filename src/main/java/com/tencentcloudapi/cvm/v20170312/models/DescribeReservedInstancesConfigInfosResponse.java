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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedInstancesConfigInfosResponse extends AbstractModel{

    /**
    * Static configurations of the reserved instance.
    */
    @SerializedName("ReservedInstanceConfigInfos")
    @Expose
    private ReservedInstanceConfigInfoItem [] ReservedInstanceConfigInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Static configurations of the reserved instance. 
     * @return ReservedInstanceConfigInfos Static configurations of the reserved instance.
     */
    public ReservedInstanceConfigInfoItem [] getReservedInstanceConfigInfos() {
        return this.ReservedInstanceConfigInfos;
    }

    /**
     * Set Static configurations of the reserved instance.
     * @param ReservedInstanceConfigInfos Static configurations of the reserved instance.
     */
    public void setReservedInstanceConfigInfos(ReservedInstanceConfigInfoItem [] ReservedInstanceConfigInfos) {
        this.ReservedInstanceConfigInfos = ReservedInstanceConfigInfos;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReservedInstanceConfigInfos.", this.ReservedInstanceConfigInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


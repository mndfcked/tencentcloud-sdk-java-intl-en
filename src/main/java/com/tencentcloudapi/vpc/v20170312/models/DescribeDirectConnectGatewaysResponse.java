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

public class DescribeDirectConnectGatewaysResponse extends AbstractModel{

    /**
    * The number of eligible objects.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The object array of the direct connect gateway.
    */
    @SerializedName("DirectConnectGatewaySet")
    @Expose
    private DirectConnectGateway [] DirectConnectGatewaySet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of eligible objects. 
     * @return TotalCount The number of eligible objects.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of eligible objects.
     * @param TotalCount The number of eligible objects.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The object array of the direct connect gateway. 
     * @return DirectConnectGatewaySet The object array of the direct connect gateway.
     */
    public DirectConnectGateway [] getDirectConnectGatewaySet() {
        return this.DirectConnectGatewaySet;
    }

    /**
     * Set The object array of the direct connect gateway.
     * @param DirectConnectGatewaySet The object array of the direct connect gateway.
     */
    public void setDirectConnectGatewaySet(DirectConnectGateway [] DirectConnectGatewaySet) {
        this.DirectConnectGatewaySet = DirectConnectGatewaySet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DirectConnectGatewaySet.", this.DirectConnectGatewaySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


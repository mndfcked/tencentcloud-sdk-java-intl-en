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

public class GetCcnRegionBandwidthLimitsResponse extends AbstractModel{

    /**
    * The outbound bandwidth limits of regions in a CCN instance.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("CcnBandwidthSet")
    @Expose
    private CcnBandwidthInfo [] CcnBandwidthSet;

    /**
    * The number of eligible objects.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The outbound bandwidth limits of regions in a CCN instance.
Note: this field may return null, indicating that no valid value was found. 
     * @return CcnBandwidthSet The outbound bandwidth limits of regions in a CCN instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public CcnBandwidthInfo [] getCcnBandwidthSet() {
        return this.CcnBandwidthSet;
    }

    /**
     * Set The outbound bandwidth limits of regions in a CCN instance.
Note: this field may return null, indicating that no valid value was found.
     * @param CcnBandwidthSet The outbound bandwidth limits of regions in a CCN instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setCcnBandwidthSet(CcnBandwidthInfo [] CcnBandwidthSet) {
        this.CcnBandwidthSet = CcnBandwidthSet;
    }

    /**
     * Get The number of eligible objects.
Note: this field may return null, indicating that no valid value was found. 
     * @return TotalCount The number of eligible objects.
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of eligible objects.
Note: this field may return null, indicating that no valid value was found.
     * @param TotalCount The number of eligible objects.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "CcnBandwidthSet.", this.CcnBandwidthSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


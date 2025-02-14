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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceZoneInfoResponse extends AbstractModel{

    /**
    * The number of instance node groups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The list of instance node groups
    */
    @SerializedName("ReplicaGroups")
    @Expose
    private ReplicaGroup [] ReplicaGroups;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of instance node groups 
     * @return TotalCount The number of instance node groups
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of instance node groups
     * @param TotalCount The number of instance node groups
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The list of instance node groups 
     * @return ReplicaGroups The list of instance node groups
     */
    public ReplicaGroup [] getReplicaGroups() {
        return this.ReplicaGroups;
    }

    /**
     * Set The list of instance node groups
     * @param ReplicaGroups The list of instance node groups
     */
    public void setReplicaGroups(ReplicaGroup [] ReplicaGroups) {
        this.ReplicaGroups = ReplicaGroups;
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
        this.setParamArrayObj(map, prefix + "ReplicaGroups.", this.ReplicaGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


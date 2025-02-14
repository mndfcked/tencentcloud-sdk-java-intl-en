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

public class DescribeInstancesStatusResponse extends AbstractModel{

    /**
    * Number of instance states meeting the filtering conditions.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * [Instance status](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) list.
    */
    @SerializedName("InstanceStatusSet")
    @Expose
    private InstanceStatus [] InstanceStatusSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of instance states meeting the filtering conditions. 
     * @return TotalCount Number of instance states meeting the filtering conditions.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of instance states meeting the filtering conditions.
     * @param TotalCount Number of instance states meeting the filtering conditions.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get [Instance status](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) list. 
     * @return InstanceStatusSet [Instance status](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) list.
     */
    public InstanceStatus [] getInstanceStatusSet() {
        return this.InstanceStatusSet;
    }

    /**
     * Set [Instance status](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) list.
     * @param InstanceStatusSet [Instance status](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) list.
     */
    public void setInstanceStatusSet(InstanceStatus [] InstanceStatusSet) {
        this.InstanceStatusSet = InstanceStatusSet;
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
        this.setParamArrayObj(map, prefix + "InstanceStatusSet.", this.InstanceStatusSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


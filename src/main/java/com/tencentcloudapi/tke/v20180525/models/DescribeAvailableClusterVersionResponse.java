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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAvailableClusterVersionResponse extends AbstractModel{

    /**
    * Upgradable cluster version
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Versions")
    @Expose
    private String [] Versions;

    /**
    * Cluster information
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Clusters")
    @Expose
    private ClusterVersion [] Clusters;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Upgradable cluster version
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Versions Upgradable cluster version
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String [] getVersions() {
        return this.Versions;
    }

    /**
     * Set Upgradable cluster version
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Versions Upgradable cluster version
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setVersions(String [] Versions) {
        this.Versions = Versions;
    }

    /**
     * Get Cluster information
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Clusters Cluster information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public ClusterVersion [] getClusters() {
        return this.Clusters;
    }

    /**
     * Set Cluster information
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Clusters Cluster information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setClusters(ClusterVersion [] Clusters) {
        this.Clusters = Clusters;
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
        this.setParamArraySimple(map, prefix + "Versions.", this.Versions);
        this.setParamArrayObj(map, prefix + "Clusters.", this.Clusters);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


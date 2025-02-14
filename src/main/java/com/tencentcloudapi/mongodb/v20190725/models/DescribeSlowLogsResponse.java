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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogsResponse extends AbstractModel{

    /**
    * Total number of slow logs
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Slow log details
    */
    @SerializedName("SlowLogs")
    @Expose
    private String [] SlowLogs;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of slow logs 
     * @return Count Total number of slow logs
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total number of slow logs
     * @param Count Total number of slow logs
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Slow log details 
     * @return SlowLogs Slow log details
     */
    public String [] getSlowLogs() {
        return this.SlowLogs;
    }

    /**
     * Set Slow log details
     * @param SlowLogs Slow log details
     */
    public void setSlowLogs(String [] SlowLogs) {
        this.SlowLogs = SlowLogs;
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "SlowLogs.", this.SlowLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


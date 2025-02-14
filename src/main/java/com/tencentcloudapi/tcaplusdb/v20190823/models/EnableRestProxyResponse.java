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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableRestProxyResponse extends AbstractModel{

    /**
    * RestProxy status. Valid values: 0 (disabled), 1 (enabling), 2 (enabled), 3 (disabling).
    */
    @SerializedName("RestProxyStatus")
    @Expose
    private Long RestProxyStatus;

    /**
    * `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get RestProxy status. Valid values: 0 (disabled), 1 (enabling), 2 (enabled), 3 (disabling). 
     * @return RestProxyStatus RestProxy status. Valid values: 0 (disabled), 1 (enabling), 2 (enabled), 3 (disabling).
     */
    public Long getRestProxyStatus() {
        return this.RestProxyStatus;
    }

    /**
     * Set RestProxy status. Valid values: 0 (disabled), 1 (enabling), 2 (enabled), 3 (disabling).
     * @param RestProxyStatus RestProxy status. Valid values: 0 (disabled), 1 (enabling), 2 (enabled), 3 (disabling).
     */
    public void setRestProxyStatus(Long RestProxyStatus) {
        this.RestProxyStatus = RestProxyStatus;
    }

    /**
     * Get `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters. 
     * @return TaskId `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
     * @param TaskId `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
        this.setParamSimple(map, prefix + "RestProxyStatus", this.RestProxyStatus);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


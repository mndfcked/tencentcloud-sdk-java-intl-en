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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTimerScalingPolicyRequest extends AbstractModel{

    /**
    * Unique ID of the policy
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
    * ID of the fleet to be bound with the policy
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Scheduled scaling policy name
    */
    @SerializedName("TimerName")
    @Expose
    private String TimerName;

    /**
     * Get Unique ID of the policy 
     * @return TimerId Unique ID of the policy
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set Unique ID of the policy
     * @param TimerId Unique ID of the policy
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    /**
     * Get ID of the fleet to be bound with the policy 
     * @return FleetId ID of the fleet to be bound with the policy
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set ID of the fleet to be bound with the policy
     * @param FleetId ID of the fleet to be bound with the policy
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Scheduled scaling policy name 
     * @return TimerName Scheduled scaling policy name
     */
    public String getTimerName() {
        return this.TimerName;
    }

    /**
     * Set Scheduled scaling policy name
     * @param TimerName Scheduled scaling policy name
     */
    public void setTimerName(String TimerName) {
        this.TimerName = TimerName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "TimerName", this.TimerName);

    }
}


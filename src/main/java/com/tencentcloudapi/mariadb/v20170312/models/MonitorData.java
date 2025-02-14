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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorData extends AbstractModel{

    /**
    * Start time in the format of `2018-03-24 23:59:59`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of `2018-03-24 23:59:59`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Monitoring data
    */
    @SerializedName("Data")
    @Expose
    private Float [] Data;

    /**
     * Get Start time in the format of `2018-03-24 23:59:59` 
     * @return StartTime Start time in the format of `2018-03-24 23:59:59`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of `2018-03-24 23:59:59`
     * @param StartTime Start time in the format of `2018-03-24 23:59:59`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of `2018-03-24 23:59:59` 
     * @return EndTime End time in the format of `2018-03-24 23:59:59`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of `2018-03-24 23:59:59`
     * @param EndTime End time in the format of `2018-03-24 23:59:59`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Monitoring data 
     * @return Data Monitoring data
     */
    public Float [] getData() {
        return this.Data;
    }

    /**
     * Set Monitoring data
     * @param Data Monitoring data
     */
    public void setData(Float [] Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);

    }
}


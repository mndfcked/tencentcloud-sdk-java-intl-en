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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStatisticDataRequest extends AbstractModel{

    /**
    * Module, whose value is fixed at `monitor`
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Namespace. Valid values: QCE/TKE
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Metric name list
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Dimension condition. The `=` and `in` operators are supported
    */
    @SerializedName("Conditions")
    @Expose
    private MidQueryCondition [] Conditions;

    /**
    * Statistical granularity in s. Default value: 300
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * `groupBy` by the specified dimension
    */
    @SerializedName("GroupBys")
    @Expose
    private String [] GroupBys;

    /**
     * Get Module, whose value is fixed at `monitor` 
     * @return Module Module, whose value is fixed at `monitor`
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module, whose value is fixed at `monitor`
     * @param Module Module, whose value is fixed at `monitor`
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Namespace. Valid values: QCE/TKE 
     * @return Namespace Namespace. Valid values: QCE/TKE
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. Valid values: QCE/TKE
     * @param Namespace Namespace. Valid values: QCE/TKE
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Metric name list 
     * @return MetricNames Metric name list
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric name list
     * @param MetricNames Metric name list
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Dimension condition. The `=` and `in` operators are supported 
     * @return Conditions Dimension condition. The `=` and `in` operators are supported
     */
    public MidQueryCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Dimension condition. The `=` and `in` operators are supported
     * @param Conditions Dimension condition. The `=` and `in` operators are supported
     */
    public void setConditions(MidQueryCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Statistical granularity in s. Default value: 300 
     * @return Period Statistical granularity in s. Default value: 300
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical granularity in s. Default value: 300
     * @param Period Statistical granularity in s. Default value: 300
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00 
     * @return StartTime Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     * @param StartTime Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00 
     * @return EndTime End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     * @param EndTime End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get `groupBy` by the specified dimension 
     * @return GroupBys `groupBy` by the specified dimension
     */
    public String [] getGroupBys() {
        return this.GroupBys;
    }

    /**
     * Set `groupBy` by the specified dimension
     * @param GroupBys `groupBy` by the specified dimension
     */
    public void setGroupBys(String [] GroupBys) {
        this.GroupBys = GroupBys;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "GroupBys.", this.GroupBys);

    }
}


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

public class MetricDatum extends AbstractModel{

    /**
    * Metric name.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Metric value.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Metric name. 
     * @return MetricName Metric name.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name.
     * @param MetricName Metric name.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Metric value. 
     * @return Value Metric value.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Metric value.
     * @param Value Metric value.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


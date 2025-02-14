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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorFloatMetricSeriesData extends AbstractModel{

    /**
    * Monitoring metric.
    */
    @SerializedName("Series")
    @Expose
    private MonitorFloatMetric [] Series;

    /**
    * Timestamp corresponding to monitoring metric.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long [] Timestamp;

    /**
     * Get Monitoring metric. 
     * @return Series Monitoring metric.
     */
    public MonitorFloatMetric [] getSeries() {
        return this.Series;
    }

    /**
     * Set Monitoring metric.
     * @param Series Monitoring metric.
     */
    public void setSeries(MonitorFloatMetric [] Series) {
        this.Series = Series;
    }

    /**
     * Get Timestamp corresponding to monitoring metric. 
     * @return Timestamp Timestamp corresponding to monitoring metric.
     */
    public Long [] getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp corresponding to monitoring metric.
     * @param Timestamp Timestamp corresponding to monitoring metric.
     */
    public void setTimestamp(Long [] Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamArraySimple(map, prefix + "Timestamp.", this.Timestamp);

    }
}


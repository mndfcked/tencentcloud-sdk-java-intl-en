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

public class PutMonitorDataRequest extends AbstractModel{

    /**
    * A group of metrics and data.
    */
    @SerializedName("Metrics")
    @Expose
    private MetricDatum [] Metrics;

    /**
    * IP address that is automatically specified when monitoring data is reported.
    */
    @SerializedName("AnnounceIp")
    @Expose
    private String AnnounceIp;

    /**
    * Timestamp that is automatically specified when monitoring data is reported.
    */
    @SerializedName("AnnounceTimestamp")
    @Expose
    private Long AnnounceTimestamp;

    /**
    * IP address or product instance ID that is automatically specified when monitoring data is reported.
    */
    @SerializedName("AnnounceInstance")
    @Expose
    private String AnnounceInstance;

    /**
     * Get A group of metrics and data. 
     * @return Metrics A group of metrics and data.
     */
    public MetricDatum [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set A group of metrics and data.
     * @param Metrics A group of metrics and data.
     */
    public void setMetrics(MetricDatum [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get IP address that is automatically specified when monitoring data is reported. 
     * @return AnnounceIp IP address that is automatically specified when monitoring data is reported.
     */
    public String getAnnounceIp() {
        return this.AnnounceIp;
    }

    /**
     * Set IP address that is automatically specified when monitoring data is reported.
     * @param AnnounceIp IP address that is automatically specified when monitoring data is reported.
     */
    public void setAnnounceIp(String AnnounceIp) {
        this.AnnounceIp = AnnounceIp;
    }

    /**
     * Get Timestamp that is automatically specified when monitoring data is reported. 
     * @return AnnounceTimestamp Timestamp that is automatically specified when monitoring data is reported.
     */
    public Long getAnnounceTimestamp() {
        return this.AnnounceTimestamp;
    }

    /**
     * Set Timestamp that is automatically specified when monitoring data is reported.
     * @param AnnounceTimestamp Timestamp that is automatically specified when monitoring data is reported.
     */
    public void setAnnounceTimestamp(Long AnnounceTimestamp) {
        this.AnnounceTimestamp = AnnounceTimestamp;
    }

    /**
     * Get IP address or product instance ID that is automatically specified when monitoring data is reported. 
     * @return AnnounceInstance IP address or product instance ID that is automatically specified when monitoring data is reported.
     */
    public String getAnnounceInstance() {
        return this.AnnounceInstance;
    }

    /**
     * Set IP address or product instance ID that is automatically specified when monitoring data is reported.
     * @param AnnounceInstance IP address or product instance ID that is automatically specified when monitoring data is reported.
     */
    public void setAnnounceInstance(String AnnounceInstance) {
        this.AnnounceInstance = AnnounceInstance;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "AnnounceIp", this.AnnounceIp);
        this.setParamSimple(map, prefix + "AnnounceTimestamp", this.AnnounceTimestamp);
        this.setParamSimple(map, prefix + "AnnounceInstance", this.AnnounceInstance);

    }
}


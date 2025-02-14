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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlayErrorCodeDetailInfoListRequest extends AbstractModel{

    /**
    * Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Query granularity:
1: 1-minute granularity.
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * Yes. Valid values: "4xx", "5xx". Mixed codes in the format of `4xx,5xx` are also supported.
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * Playback domain name list.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
     * Get Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return StartTime Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
     * @param StartTime Start time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day. 
     * @return EndTime End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     * @param EndTime End time (Beijing time),
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query granularity:
1: 1-minute granularity. 
     * @return Granularity Query granularity:
1: 1-minute granularity.
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Query granularity:
1: 1-minute granularity.
     * @param Granularity Query granularity:
1: 1-minute granularity.
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get Yes. Valid values: "4xx", "5xx". Mixed codes in the format of `4xx,5xx` are also supported. 
     * @return StatType Yes. Valid values: "4xx", "5xx". Mixed codes in the format of `4xx,5xx` are also supported.
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set Yes. Valid values: "4xx", "5xx". Mixed codes in the format of `4xx,5xx` are also supported.
     * @param StatType Yes. Valid values: "4xx", "5xx". Mixed codes in the format of `4xx,5xx` are also supported.
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get Playback domain name list. 
     * @return PlayDomains Playback domain name list.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set Playback domain name list.
     * @param PlayDomains Playback domain name list.
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried. 
     * @return MainlandOrOversea Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
     * @param MainlandOrOversea Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);

    }
}


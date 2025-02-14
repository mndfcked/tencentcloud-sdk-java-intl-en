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

public class DescribeVisitTopSumInfoListRequest extends AbstractModel{

    /**
    * Start point in time in the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is (0,4 hours]. Data for the last day can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Bandwidth metric. Valid values: "Domain", "StreamId".
    */
    @SerializedName("TopIndex")
    @Expose
    private String TopIndex;

    /**
    * Playback domain name. If this parameter is left empty, full data will be queried by default.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * Page number,
Value range: [1,1000],
Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page. Value range: [1,1000].
Default value: 20.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sorting metric. Valid values: "AvgFluxPerSecond", "TotalRequest" (default), "TotalFlux".
    */
    @SerializedName("OrderParam")
    @Expose
    private String OrderParam;

    /**
     * Get Start point in time in the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return StartTime Start point in time in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start point in time in the format of `yyyy-mm-dd HH:MM:SS`.
     * @param StartTime Start point in time in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is (0,4 hours]. Data for the last day can be queried. 
     * @return EndTime End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is (0,4 hours]. Data for the last day can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is (0,4 hours]. Data for the last day can be queried.
     * @param EndTime End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is (0,4 hours]. Data for the last day can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Bandwidth metric. Valid values: "Domain", "StreamId". 
     * @return TopIndex Bandwidth metric. Valid values: "Domain", "StreamId".
     */
    public String getTopIndex() {
        return this.TopIndex;
    }

    /**
     * Set Bandwidth metric. Valid values: "Domain", "StreamId".
     * @param TopIndex Bandwidth metric. Valid values: "Domain", "StreamId".
     */
    public void setTopIndex(String TopIndex) {
        this.TopIndex = TopIndex;
    }

    /**
     * Get Playback domain name. If this parameter is left empty, full data will be queried by default. 
     * @return PlayDomains Playback domain name. If this parameter is left empty, full data will be queried by default.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set Playback domain name. If this parameter is left empty, full data will be queried by default.
     * @param PlayDomains Playback domain name. If this parameter is left empty, full data will be queried by default.
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get Page number,
Value range: [1,1000],
Default value: 1. 
     * @return PageNum Page number,
Value range: [1,1000],
Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number,
Value range: [1,1000],
Default value: 1.
     * @param PageNum Page number,
Value range: [1,1000],
Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page. Value range: [1,1000].
Default value: 20. 
     * @return PageSize Number of entries per page. Value range: [1,1000].
Default value: 20.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Value range: [1,1000].
Default value: 20.
     * @param PageSize Number of entries per page. Value range: [1,1000].
Default value: 20.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sorting metric. Valid values: "AvgFluxPerSecond", "TotalRequest" (default), "TotalFlux". 
     * @return OrderParam Sorting metric. Valid values: "AvgFluxPerSecond", "TotalRequest" (default), "TotalFlux".
     */
    public String getOrderParam() {
        return this.OrderParam;
    }

    /**
     * Set Sorting metric. Valid values: "AvgFluxPerSecond", "TotalRequest" (default), "TotalFlux".
     * @param OrderParam Sorting metric. Valid values: "AvgFluxPerSecond", "TotalRequest" (default), "TotalFlux".
     */
    public void setOrderParam(String OrderParam) {
        this.OrderParam = OrderParam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TopIndex", this.TopIndex);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderParam", this.OrderParam);

    }
}


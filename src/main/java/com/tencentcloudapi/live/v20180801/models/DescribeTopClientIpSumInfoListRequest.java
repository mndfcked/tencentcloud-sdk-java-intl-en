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

public class DescribeTopClientIpSumInfoListRequest extends AbstractModel{

    /**
    * Start point in time in the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is [0,4 hours]. Data for the last day can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Playback domain name. If this parameter is left empty, full data will be queried by default.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * Page number. Value range: [1,1000]. Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page. Value range: [1,1000]. Default value: 20.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sorting metric. Valid values: TotalRequest (default value), FailedRequest, TotalFlux.
    */
    @SerializedName("OrderParam")
    @Expose
    private String OrderParam;

    /**
    * Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * Language used in the output field. Valid values: Chinese (default), English. Currently, country/region, district, and ISP parameters support multiple languages.
    */
    @SerializedName("OutLanguage")
    @Expose
    private String OutLanguage;

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
The time span is [0,4 hours]. Data for the last day can be queried. 
     * @return EndTime End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is [0,4 hours]. Data for the last day can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is [0,4 hours]. Data for the last day can be queried.
     * @param EndTime End point in time in the format of `yyyy-mm-dd HH:MM:SS`
The time span is [0,4 hours]. Data for the last day can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get Page number. Value range: [1,1000]. Default value: 1. 
     * @return PageNum Page number. Value range: [1,1000]. Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number. Value range: [1,1000]. Default value: 1.
     * @param PageNum Page number. Value range: [1,1000]. Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page. Value range: [1,1000]. Default value: 20. 
     * @return PageSize Number of entries per page. Value range: [1,1000]. Default value: 20.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Value range: [1,1000]. Default value: 20.
     * @param PageSize Number of entries per page. Value range: [1,1000]. Default value: 20.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sorting metric. Valid values: TotalRequest (default value), FailedRequest, TotalFlux. 
     * @return OrderParam Sorting metric. Valid values: TotalRequest (default value), FailedRequest, TotalFlux.
     */
    public String getOrderParam() {
        return this.OrderParam;
    }

    /**
     * Set Sorting metric. Valid values: TotalRequest (default value), FailedRequest, TotalFlux.
     * @param OrderParam Sorting metric. Valid values: TotalRequest (default value), FailedRequest, TotalFlux.
     */
    public void setOrderParam(String OrderParam) {
        this.OrderParam = OrderParam;
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
     * Get Language used in the output field. Valid values: Chinese (default), English. Currently, country/region, district, and ISP parameters support multiple languages. 
     * @return OutLanguage Language used in the output field. Valid values: Chinese (default), English. Currently, country/region, district, and ISP parameters support multiple languages.
     */
    public String getOutLanguage() {
        return this.OutLanguage;
    }

    /**
     * Set Language used in the output field. Valid values: Chinese (default), English. Currently, country/region, district, and ISP parameters support multiple languages.
     * @param OutLanguage Language used in the output field. Valid values: Chinese (default), English. Currently, country/region, district, and ISP parameters support multiple languages.
     */
    public void setOutLanguage(String OutLanguage) {
        this.OutLanguage = OutLanguage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderParam", this.OrderParam);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "OutLanguage", this.OutLanguage);

    }
}


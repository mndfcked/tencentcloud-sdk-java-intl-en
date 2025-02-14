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

public class DescribeProIspPlaySumInfoListRequest extends AbstractModel{

    /**
    * Start time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Statistics type. Valid values: Province (district), Isp (ISP), CountryOrArea (country or region).
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * Playback domain name list. If it is left empty, it refers to all playback domain names.
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
     * Get Start time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return StartTime Start time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
     * @param StartTime Start time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day. 
     * @return EndTime End time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     * @param EndTime End time (Beijing time).
In the format of `yyyy-mm-dd HH:MM:SS`.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistics type. Valid values: Province (district), Isp (ISP), CountryOrArea (country or region). 
     * @return StatType Statistics type. Valid values: Province (district), Isp (ISP), CountryOrArea (country or region).
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set Statistics type. Valid values: Province (district), Isp (ISP), CountryOrArea (country or region).
     * @param StatType Statistics type. Valid values: Province (district), Isp (ISP), CountryOrArea (country or region).
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get Playback domain name list. If it is left empty, it refers to all playback domain names. 
     * @return PlayDomains Playback domain name list. If it is left empty, it refers to all playback domain names.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set Playback domain name list. If it is left empty, it refers to all playback domain names.
     * @param PlayDomains Playback domain name list. If it is left empty, it refers to all playback domain names.
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
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "OutLanguage", this.OutLanguage);

    }
}


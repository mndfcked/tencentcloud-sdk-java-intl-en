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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgeUrlsCacheRequest extends AbstractModel{

    /**
    * List of URLs. The protocol header such as "http://" or "https://" needs to be included.
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * Purging region
The acceleration region of the acceleration domain name will be purged if this parameter is not passed in
If `mainland` is passed in, only the content cached on nodes in the Chinese mainland will be purged
If `overseas` is passed in, only the content cached on nodes outside the Chinese mainland will be purged
The specified purging region should match the domain name acceleration region
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Whether to encode Chinese characters before purge.
    */
    @SerializedName("UrlEncode")
    @Expose
    private Boolean UrlEncode;

    /**
     * Get List of URLs. The protocol header such as "http://" or "https://" needs to be included. 
     * @return Urls List of URLs. The protocol header such as "http://" or "https://" needs to be included.
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set List of URLs. The protocol header such as "http://" or "https://" needs to be included.
     * @param Urls List of URLs. The protocol header such as "http://" or "https://" needs to be included.
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get Purging region
The acceleration region of the acceleration domain name will be purged if this parameter is not passed in
If `mainland` is passed in, only the content cached on nodes in the Chinese mainland will be purged
If `overseas` is passed in, only the content cached on nodes outside the Chinese mainland will be purged
The specified purging region should match the domain name acceleration region 
     * @return Area Purging region
The acceleration region of the acceleration domain name will be purged if this parameter is not passed in
If `mainland` is passed in, only the content cached on nodes in the Chinese mainland will be purged
If `overseas` is passed in, only the content cached on nodes outside the Chinese mainland will be purged
The specified purging region should match the domain name acceleration region
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Purging region
The acceleration region of the acceleration domain name will be purged if this parameter is not passed in
If `mainland` is passed in, only the content cached on nodes in the Chinese mainland will be purged
If `overseas` is passed in, only the content cached on nodes outside the Chinese mainland will be purged
The specified purging region should match the domain name acceleration region
     * @param Area Purging region
The acceleration region of the acceleration domain name will be purged if this parameter is not passed in
If `mainland` is passed in, only the content cached on nodes in the Chinese mainland will be purged
If `overseas` is passed in, only the content cached on nodes outside the Chinese mainland will be purged
The specified purging region should match the domain name acceleration region
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Whether to encode Chinese characters before purge. 
     * @return UrlEncode Whether to encode Chinese characters before purge.
     */
    public Boolean getUrlEncode() {
        return this.UrlEncode;
    }

    /**
     * Set Whether to encode Chinese characters before purge.
     * @param UrlEncode Whether to encode Chinese characters before purge.
     */
    public void setUrlEncode(Boolean UrlEncode) {
        this.UrlEncode = UrlEncode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "UrlEncode", this.UrlEncode);

    }
}


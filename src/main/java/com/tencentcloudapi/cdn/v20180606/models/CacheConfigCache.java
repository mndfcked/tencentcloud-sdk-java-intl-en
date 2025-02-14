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

public class CacheConfigCache extends AbstractModel{

    /**
    * Cache configuration switch
on: enable
off: disable
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("CompareMaxAge")
    @Expose
    private String CompareMaxAge;

    /**
    * Force cache
on: enable
off: disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * Ignore the Set-Cookie header of an origin server.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
     * Get Cache configuration switch
on: enable
off: disable
Note: this field may return null, indicating that no valid value is obtained. 
     * @return Switch Cache configuration switch
on: enable
off: disable
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Cache configuration switch
on: enable
off: disable
Note: this field may return null, indicating that no valid value is obtained.
     * @param Switch Cache configuration switch
on: enable
off: disable
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return CacheTime Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid value is obtained.
     * @param CacheTime Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return CompareMaxAge Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getCompareMaxAge() {
        return this.CompareMaxAge;
    }

    /**
     * Set Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
     * @param CompareMaxAge Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setCompareMaxAge(String CompareMaxAge) {
        this.CompareMaxAge = CompareMaxAge;
    }

    /**
     * Get Force cache
on: enable
off: disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return IgnoreCacheControl Force cache
on: enable
off: disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Force cache
on: enable
off: disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: this field may return null, indicating that no valid value is obtained.
     * @param IgnoreCacheControl Force cache
on: enable
off: disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get Ignore the Set-Cookie header of an origin server.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return IgnoreSetCookie Ignore the Set-Cookie header of an origin server.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set Ignore the Set-Cookie header of an origin server.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
     * @param IgnoreSetCookie Ignore the Set-Cookie header of an origin server.
on: enable
off: disable
This is disabled by default.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setIgnoreSetCookie(String IgnoreSetCookie) {
        this.IgnoreSetCookie = IgnoreSetCookie;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamSimple(map, prefix + "CompareMaxAge", this.CompareMaxAge);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);
        this.setParamSimple(map, prefix + "IgnoreSetCookie", this.IgnoreSetCookie);

    }
}


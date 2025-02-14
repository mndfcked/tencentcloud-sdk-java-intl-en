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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseService extends AbstractModel{

    /**
    * Release remarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReleaseDesc")
    @Expose
    private String ReleaseDesc;

    /**
    * Published version ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReleaseVersion")
    @Expose
    private String ReleaseVersion;

    /**
     * Get Release remarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReleaseDesc Release remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReleaseDesc() {
        return this.ReleaseDesc;
    }

    /**
     * Set Release remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReleaseDesc Release remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReleaseDesc(String ReleaseDesc) {
        this.ReleaseDesc = ReleaseDesc;
    }

    /**
     * Get Published version ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReleaseVersion Published version ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReleaseVersion() {
        return this.ReleaseVersion;
    }

    /**
     * Set Published version ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReleaseVersion Published version ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReleaseVersion(String ReleaseVersion) {
        this.ReleaseVersion = ReleaseVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseDesc", this.ReleaseDesc);
        this.setParamSimple(map, prefix + "ReleaseVersion", this.ReleaseVersion);

    }
}


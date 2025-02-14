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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DvAuthDetail extends AbstractModel{

    /**
    * DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthKey")
    @Expose
    private String DvAuthKey;

    /**
    * DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthValue")
    @Expose
    private String DvAuthValue;

    /**
    * Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthDomain")
    @Expose
    private String DvAuthDomain;

    /**
    * Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthPath")
    @Expose
    private String DvAuthPath;

    /**
    * DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthKeySubDomain")
    @Expose
    private String DvAuthKeySubDomain;

    /**
    * DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuths")
    @Expose
    private DvAuths [] DvAuths;

    /**
     * Get DV authentication key
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthKey DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthKey() {
        return this.DvAuthKey;
    }

    /**
     * Set DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthKey DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthKey(String DvAuthKey) {
        this.DvAuthKey = DvAuthKey;
    }

    /**
     * Get DV authentication value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthValue DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthValue() {
        return this.DvAuthValue;
    }

    /**
     * Set DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthValue DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthValue(String DvAuthValue) {
        this.DvAuthValue = DvAuthValue;
    }

    /**
     * Get Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthDomain Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthDomain() {
        return this.DvAuthDomain;
    }

    /**
     * Set Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthDomain Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthDomain(String DvAuthDomain) {
        this.DvAuthDomain = DvAuthDomain;
    }

    /**
     * Get Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthPath Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthPath() {
        return this.DvAuthPath;
    }

    /**
     * Set Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthPath Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthPath(String DvAuthPath) {
        this.DvAuthPath = DvAuthPath;
    }

    /**
     * Get DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthKeySubDomain DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthKeySubDomain() {
        return this.DvAuthKeySubDomain;
    }

    /**
     * Set DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthKeySubDomain DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthKeySubDomain(String DvAuthKeySubDomain) {
        this.DvAuthKeySubDomain = DvAuthKeySubDomain;
    }

    /**
     * Get DV authentication information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuths DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DvAuths [] getDvAuths() {
        return this.DvAuths;
    }

    /**
     * Set DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuths DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuths(DvAuths [] DvAuths) {
        this.DvAuths = DvAuths;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DvAuthKey", this.DvAuthKey);
        this.setParamSimple(map, prefix + "DvAuthValue", this.DvAuthValue);
        this.setParamSimple(map, prefix + "DvAuthDomain", this.DvAuthDomain);
        this.setParamSimple(map, prefix + "DvAuthPath", this.DvAuthPath);
        this.setParamSimple(map, prefix + "DvAuthKeySubDomain", this.DvAuthKeySubDomain);
        this.setParamArrayObj(map, prefix + "DvAuths.", this.DvAuths);

    }
}


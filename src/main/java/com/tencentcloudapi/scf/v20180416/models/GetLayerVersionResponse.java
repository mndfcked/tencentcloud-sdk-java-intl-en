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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLayerVersionResponse extends AbstractModel{

    /**
    * Compatible runtimes
    */
    @SerializedName("CompatibleRuntimes")
    @Expose
    private String [] CompatibleRuntimes;

    /**
    * SHA256 encoding of version file on the layer
    */
    @SerializedName("CodeSha256")
    @Expose
    private String CodeSha256;

    /**
    * Download address of version file on the layer
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Version creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Version description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * License information
    */
    @SerializedName("LicenseInfo")
    @Expose
    private String LicenseInfo;

    /**
    * Version number
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
    * Layer name
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * Current status of specific layer version. Valid values:
Active: normal
Publishing: publishing
PublishFailed: publishing failed
Deleted: deleted
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Compatible runtimes 
     * @return CompatibleRuntimes Compatible runtimes
     */
    public String [] getCompatibleRuntimes() {
        return this.CompatibleRuntimes;
    }

    /**
     * Set Compatible runtimes
     * @param CompatibleRuntimes Compatible runtimes
     */
    public void setCompatibleRuntimes(String [] CompatibleRuntimes) {
        this.CompatibleRuntimes = CompatibleRuntimes;
    }

    /**
     * Get SHA256 encoding of version file on the layer 
     * @return CodeSha256 SHA256 encoding of version file on the layer
     */
    public String getCodeSha256() {
        return this.CodeSha256;
    }

    /**
     * Set SHA256 encoding of version file on the layer
     * @param CodeSha256 SHA256 encoding of version file on the layer
     */
    public void setCodeSha256(String CodeSha256) {
        this.CodeSha256 = CodeSha256;
    }

    /**
     * Get Download address of version file on the layer 
     * @return Location Download address of version file on the layer
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Download address of version file on the layer
     * @param Location Download address of version file on the layer
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Version creation time 
     * @return AddTime Version creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Version creation time
     * @param AddTime Version creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Version description 
     * @return Description Version description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Version description
     * @param Description Version description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get License information 
     * @return LicenseInfo License information
     */
    public String getLicenseInfo() {
        return this.LicenseInfo;
    }

    /**
     * Set License information
     * @param LicenseInfo License information
     */
    public void setLicenseInfo(String LicenseInfo) {
        this.LicenseInfo = LicenseInfo;
    }

    /**
     * Get Version number 
     * @return LayerVersion Version number
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set Version number
     * @param LayerVersion Version number
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    /**
     * Get Layer name 
     * @return LayerName Layer name
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set Layer name
     * @param LayerName Layer name
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get Current status of specific layer version. Valid values:
Active: normal
Publishing: publishing
PublishFailed: publishing failed
Deleted: deleted 
     * @return Status Current status of specific layer version. Valid values:
Active: normal
Publishing: publishing
PublishFailed: publishing failed
Deleted: deleted
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current status of specific layer version. Valid values:
Active: normal
Publishing: publishing
PublishFailed: publishing failed
Deleted: deleted
     * @param Status Current status of specific layer version. Valid values:
Active: normal
Publishing: publishing
PublishFailed: publishing failed
Deleted: deleted
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CompatibleRuntimes.", this.CompatibleRuntimes);
        this.setParamSimple(map, prefix + "CodeSha256", this.CodeSha256);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LicenseInfo", this.LicenseInfo);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


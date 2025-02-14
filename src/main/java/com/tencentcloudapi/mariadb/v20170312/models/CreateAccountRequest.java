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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel{

    /**
    * Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Login username, which can contain 1-32 letters, digits, underscores, and hyphens.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Host that can be logged in to, which is in the same format as the host of the MySQL account and supports wildcards, such as %, 10.%, and 10.20.%.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Account password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Whether to create a read-only account. 0: no; 1: for the account's SQL requests, the secondary will be used first, and if it is unavailable, the primary will be used; 2: the secondary will be used first, and if it is unavailable, the operation will fail.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * Account remarks, which can contain 0-256 letters, digits, and common symbols.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Determines whether the secondary is unavailable based on the passed-in time
    */
    @SerializedName("DelayThresh")
    @Expose
    private Long DelayThresh;

    /**
     * Get Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API. 
     * @return InstanceId Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     * @param InstanceId Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Login username, which can contain 1-32 letters, digits, underscores, and hyphens. 
     * @return UserName Login username, which can contain 1-32 letters, digits, underscores, and hyphens.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Login username, which can contain 1-32 letters, digits, underscores, and hyphens.
     * @param UserName Login username, which can contain 1-32 letters, digits, underscores, and hyphens.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Host that can be logged in to, which is in the same format as the host of the MySQL account and supports wildcards, such as %, 10.%, and 10.20.%. 
     * @return Host Host that can be logged in to, which is in the same format as the host of the MySQL account and supports wildcards, such as %, 10.%, and 10.20.%.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host that can be logged in to, which is in the same format as the host of the MySQL account and supports wildcards, such as %, 10.%, and 10.20.%.
     * @param Host Host that can be logged in to, which is in the same format as the host of the MySQL account and supports wildcards, such as %, 10.%, and 10.20.%.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Account password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks. 
     * @return Password Account password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Account password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
     * @param Password Account password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Whether to create a read-only account. 0: no; 1: for the account's SQL requests, the secondary will be used first, and if it is unavailable, the primary will be used; 2: the secondary will be used first, and if it is unavailable, the operation will fail. 
     * @return ReadOnly Whether to create a read-only account. 0: no; 1: for the account's SQL requests, the secondary will be used first, and if it is unavailable, the primary will be used; 2: the secondary will be used first, and if it is unavailable, the operation will fail.
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Whether to create a read-only account. 0: no; 1: for the account's SQL requests, the secondary will be used first, and if it is unavailable, the primary will be used; 2: the secondary will be used first, and if it is unavailable, the operation will fail.
     * @param ReadOnly Whether to create a read-only account. 0: no; 1: for the account's SQL requests, the secondary will be used first, and if it is unavailable, the primary will be used; 2: the secondary will be used first, and if it is unavailable, the operation will fail.
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Account remarks, which can contain 0-256 letters, digits, and common symbols. 
     * @return Description Account remarks, which can contain 0-256 letters, digits, and common symbols.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Account remarks, which can contain 0-256 letters, digits, and common symbols.
     * @param Description Account remarks, which can contain 0-256 letters, digits, and common symbols.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Determines whether the secondary is unavailable based on the passed-in time 
     * @return DelayThresh Determines whether the secondary is unavailable based on the passed-in time
     */
    public Long getDelayThresh() {
        return this.DelayThresh;
    }

    /**
     * Set Determines whether the secondary is unavailable based on the passed-in time
     * @param DelayThresh Determines whether the secondary is unavailable based on the passed-in time
     */
    public void setDelayThresh(Long DelayThresh) {
        this.DelayThresh = DelayThresh;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DelayThresh", this.DelayThresh);

    }
}


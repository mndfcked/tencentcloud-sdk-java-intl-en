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

public class SecurityGroup extends AbstractModel{

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Creation time in the format of yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group name
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * Security group remarks
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
    * Inbound rule
    */
    @SerializedName("Inbound")
    @Expose
    private SecurityGroupBound [] Inbound;

    /**
    * Outbound rule
    */
    @SerializedName("Outbound")
    @Expose
    private SecurityGroupBound [] Outbound;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Creation time in the format of yyyy-mm-dd hh:mm:ss 
     * @return CreateTime Creation time in the format of yyyy-mm-dd hh:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in the format of yyyy-mm-dd hh:mm:ss
     * @param CreateTime Creation time in the format of yyyy-mm-dd hh:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupId Security group ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupId Security group ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security group name 
     * @return SecurityGroupName Security group name
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set Security group name
     * @param SecurityGroupName Security group name
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get Security group remarks 
     * @return SecurityGroupRemark Security group remarks
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set Security group remarks
     * @param SecurityGroupRemark Security group remarks
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    /**
     * Get Inbound rule 
     * @return Inbound Inbound rule
     */
    public SecurityGroupBound [] getInbound() {
        return this.Inbound;
    }

    /**
     * Set Inbound rule
     * @param Inbound Inbound rule
     */
    public void setInbound(SecurityGroupBound [] Inbound) {
        this.Inbound = Inbound;
    }

    /**
     * Get Outbound rule 
     * @return Outbound Outbound rule
     */
    public SecurityGroupBound [] getOutbound() {
        return this.Outbound;
    }

    /**
     * Set Outbound rule
     * @param Outbound Outbound rule
     */
    public void setOutbound(SecurityGroupBound [] Outbound) {
        this.Outbound = Outbound;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);
        this.setParamArrayObj(map, prefix + "Inbound.", this.Inbound);
        this.setParamArrayObj(map, prefix + "Outbound.", this.Outbound);

    }
}


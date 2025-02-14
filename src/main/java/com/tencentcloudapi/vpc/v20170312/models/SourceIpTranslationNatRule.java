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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceIpTranslationNatRule extends AbstractModel{

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type. Valid values: SUBNET, NETWORKINTERFACE
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Source IP/IP range
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * Elastic IP address pool
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * SNAT rule ID
    */
    @SerializedName("NatGatewaySnatId")
    @Expose
    private String NatGatewaySnatId;

    /**
    * NAT Gateway ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Creation time of a SNAT rule for a NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type. Valid values: SUBNET, NETWORKINTERFACE
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceType Resource type. Valid values: SUBNET, NETWORKINTERFACE
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type. Valid values: SUBNET, NETWORKINTERFACE
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceType Resource type. Valid values: SUBNET, NETWORKINTERFACE
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Source IP/IP range 
     * @return PrivateIpAddress Source IP/IP range
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Source IP/IP range
     * @param PrivateIpAddress Source IP/IP range
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get Elastic IP address pool 
     * @return PublicIpAddresses Elastic IP address pool
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Elastic IP address pool
     * @param PublicIpAddresses Elastic IP address pool
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get SNAT rule ID 
     * @return NatGatewaySnatId SNAT rule ID
     */
    public String getNatGatewaySnatId() {
        return this.NatGatewaySnatId;
    }

    /**
     * Set SNAT rule ID
     * @param NatGatewaySnatId SNAT rule ID
     */
    public void setNatGatewaySnatId(String NatGatewaySnatId) {
        this.NatGatewaySnatId = NatGatewaySnatId;
    }

    /**
     * Get NAT Gateway ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NatGatewayId NAT Gateway ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT Gateway ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NatGatewayId NAT Gateway ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Creation time of a SNAT rule for a NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time of a SNAT rule for a NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of a SNAT rule for a NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time of a SNAT rule for a NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NatGatewaySnatId", this.NatGatewaySnatId);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}


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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerDetail extends AbstractModel{

    /**
    * CLB instance ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPv6")
    @Expose
    private String AddressIPv6;

    /**
    * IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ISP to which the CLB IP address belongs.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIsp")
    @Expose
    private String AddressIsp;

    /**
    * ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * CLB instance billing mode.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private InternetAccessible NetworkAttributes;

    /**
    * Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepaidAttributes")
    @Expose
    private LBChargePrepaid PrepaidAttributes;

    /**
    * Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * Custom configuration ID at the CLB instance level.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
    * Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetWeight")
    @Expose
    private Long TargetWeight;

    /**
    * 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Whether the CLB instance is billed by IP.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Long LoadBalancerPassToTarget;

    /**
     * Get CLB instance ID. 
     * @return LoadBalancerId CLB instance ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID.
     * @param LoadBalancerId CLB instance ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB instance name. 
     * @return LoadBalancerName CLB instance name.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name.
     * @param LoadBalancerName CLB instance name.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerType CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerType CLB instance network type:
Public: public network; Private: private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status CLB instance status, including:
0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Address CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Address CLB instance VIP.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPv6 IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPv6() {
        return this.AddressIPv6;
    }

    /**
     * Set IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressIPv6 IPv6 VIP address of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPv6(String AddressIPv6) {
        this.AddressIPv6 = AddressIPv6;
    }

    /**
     * Get IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressIPVersion IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressIPVersion IP version of the CLB instance. Valid values: IPv4, IPv6.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IPv6Mode IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IPv6Mode IPv6 address type of the CLB instance. Valid values: IPv6Nat64, IPv6FullChain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Zone Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Zone Availability zone where the CLB instance resides.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get ISP to which the CLB IP address belongs.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressIsp ISP to which the CLB IP address belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressIsp() {
        return this.AddressIsp;
    }

    /**
     * Set ISP to which the CLB IP address belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressIsp ISP to which the CLB IP address belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressIsp(String AddressIsp) {
        this.AddressIsp = AddressIsp;
    }

    /**
     * Get ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcId ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcId ID of the VPC instance to which the CLB instance belongs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId ID of the project to which the CLB instance belongs. 0: default project.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get CLB instance billing mode.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType CLB instance billing mode.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set CLB instance billing mode.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ChargeType CLB instance billing mode.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetworkAttributes CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetworkAttributes CLB instance network attribute.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkAttributes(InternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrepaidAttributes Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LBChargePrepaid getPrepaidAttributes() {
        return this.PrepaidAttributes;
    }

    /**
     * Set Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrepaidAttributes Pay-as-you-go attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepaidAttributes(LBChargePrepaid PrepaidAttributes) {
        this.PrepaidAttributes = PrepaidAttributes;
    }

    /**
     * Get Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExtraInfo Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExtraInfo Reserved field, which can be ignored generally.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Custom configuration ID at the CLB instance level.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConfigId Custom configuration ID at the CLB instance level.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Custom configuration ID at the CLB instance level.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConfigId Custom configuration ID at the CLB instance level.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListenerId CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListenerId CLB listener ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol Listener protocol.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Port Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Port Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LocationId Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LocationId Forwarding rule ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name of the forwarding rule.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url Forwarding rule path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetId ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetId ID of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetAddress Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetAddress Address of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetPort Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetPort Listening port of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * Get Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TargetWeight Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetWeight() {
        return this.TargetWeight;
    }

    /**
     * Set Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TargetWeight Forwarding weight of target real servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetWeight(Long TargetWeight) {
        this.TargetWeight = TargetWeight;
    }

    /**
     * Get 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Isolation 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Isolation 0: not isolated; 1: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SecurityGroup List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SecurityGroup List of the security groups bound to the CLB instance.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Whether the CLB instance is billed by IP.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LoadBalancerPassToTarget Whether the CLB instance is billed by IP.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Whether the CLB instance is billed by IP.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LoadBalancerPassToTarget Whether the CLB instance is billed by IP.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerPassToTarget(Long LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AddressIPv6", this.AddressIPv6);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "IPv6Mode", this.IPv6Mode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AddressIsp", this.AddressIsp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "NetworkAttributes.", this.NetworkAttributes);
        this.setParamObj(map, prefix + "PrepaidAttributes.", this.PrepaidAttributes);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);
        this.setParamSimple(map, prefix + "TargetWeight", this.TargetWeight);
        this.setParamSimple(map, prefix + "Isolation", this.Isolation);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);

    }
}


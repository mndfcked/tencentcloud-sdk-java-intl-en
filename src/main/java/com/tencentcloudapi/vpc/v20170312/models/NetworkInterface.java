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

public class NetworkInterface extends AbstractModel{

    /**
    * The ID of the ENI instance, such as `eni-f1xjkw1b`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * ENI Name
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * ENI description.
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * Subnet instance ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Bound security group.
    */
    @SerializedName("GroupSet")
    @Expose
    private String [] GroupSet;

    /**
    * Whether it is the primary ENI.
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * MAC address
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * ENI status:
<li>`PENDING`: Creating</li>
<li>`AVAILABLE`: Available</li>
<li>`ATTACHING`: Binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DELETING`: Deleting</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Private IP information.
    */
    @SerializedName("PrivateIpAddressSet")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddressSet;

    /**
    * Bound CVM object.
Note: This field may return null, indicating no valid value.
    */
    @SerializedName("Attachment")
    @Expose
    private NetworkInterfaceAttachment Attachment;

    /**
    * Availability Zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The `IPv6` address list.
    */
    @SerializedName("Ipv6AddressSet")
    @Expose
    private Ipv6Address [] Ipv6AddressSet;

    /**
    * Tag key-value pair.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * The ENI type. 0: ENI. 1: EVM ENI.
    */
    @SerializedName("EniType")
    @Expose
    private Long EniType;

    /**
    * Type of the resource bound with an ENI. Valid values: cvm, eks.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * ID of the CDC instance associated with the ENI
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get The ID of the ENI instance, such as `eni-f1xjkw1b`. 
     * @return NetworkInterfaceId The ID of the ENI instance, such as `eni-f1xjkw1b`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set The ID of the ENI instance, such as `eni-f1xjkw1b`.
     * @param NetworkInterfaceId The ID of the ENI instance, such as `eni-f1xjkw1b`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get ENI Name 
     * @return NetworkInterfaceName ENI Name
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set ENI Name
     * @param NetworkInterfaceName ENI Name
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get ENI description. 
     * @return NetworkInterfaceDescription ENI description.
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set ENI description.
     * @param NetworkInterfaceDescription ENI description.
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get Subnet instance ID. 
     * @return SubnetId Subnet instance ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID.
     * @param SubnetId Subnet instance ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Bound security group. 
     * @return GroupSet Bound security group.
     */
    public String [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set Bound security group.
     * @param GroupSet Bound security group.
     */
    public void setGroupSet(String [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get Whether it is the primary ENI. 
     * @return Primary Whether it is the primary ENI.
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set Whether it is the primary ENI.
     * @param Primary Whether it is the primary ENI.
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get MAC address 
     * @return MacAddress MAC address
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC address
     * @param MacAddress MAC address
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get ENI status:
<li>`PENDING`: Creating</li>
<li>`AVAILABLE`: Available</li>
<li>`ATTACHING`: Binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DELETING`: Deleting</li> 
     * @return State ENI status:
<li>`PENDING`: Creating</li>
<li>`AVAILABLE`: Available</li>
<li>`ATTACHING`: Binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DELETING`: Deleting</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set ENI status:
<li>`PENDING`: Creating</li>
<li>`AVAILABLE`: Available</li>
<li>`ATTACHING`: Binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DELETING`: Deleting</li>
     * @param State ENI status:
<li>`PENDING`: Creating</li>
<li>`AVAILABLE`: Available</li>
<li>`ATTACHING`: Binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DELETING`: Deleting</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Private IP information. 
     * @return PrivateIpAddressSet Private IP information.
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddressSet() {
        return this.PrivateIpAddressSet;
    }

    /**
     * Set Private IP information.
     * @param PrivateIpAddressSet Private IP information.
     */
    public void setPrivateIpAddressSet(PrivateIpAddressSpecification [] PrivateIpAddressSet) {
        this.PrivateIpAddressSet = PrivateIpAddressSet;
    }

    /**
     * Get Bound CVM object.
Note: This field may return null, indicating no valid value. 
     * @return Attachment Bound CVM object.
Note: This field may return null, indicating no valid value.
     */
    public NetworkInterfaceAttachment getAttachment() {
        return this.Attachment;
    }

    /**
     * Set Bound CVM object.
Note: This field may return null, indicating no valid value.
     * @param Attachment Bound CVM object.
Note: This field may return null, indicating no valid value.
     */
    public void setAttachment(NetworkInterfaceAttachment Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * Get Availability Zone. 
     * @return Zone Availability Zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability Zone.
     * @param Zone Availability Zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The `IPv6` address list. 
     * @return Ipv6AddressSet The `IPv6` address list.
     */
    public Ipv6Address [] getIpv6AddressSet() {
        return this.Ipv6AddressSet;
    }

    /**
     * Set The `IPv6` address list.
     * @param Ipv6AddressSet The `IPv6` address list.
     */
    public void setIpv6AddressSet(Ipv6Address [] Ipv6AddressSet) {
        this.Ipv6AddressSet = Ipv6AddressSet;
    }

    /**
     * Get Tag key-value pair. 
     * @return TagSet Tag key-value pair.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pair.
     * @param TagSet Tag key-value pair.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get The ENI type. 0: ENI. 1: EVM ENI. 
     * @return EniType The ENI type. 0: ENI. 1: EVM ENI.
     */
    public Long getEniType() {
        return this.EniType;
    }

    /**
     * Set The ENI type. 0: ENI. 1: EVM ENI.
     * @param EniType The ENI type. 0: ENI. 1: EVM ENI.
     */
    public void setEniType(Long EniType) {
        this.EniType = EniType;
    }

    /**
     * Get Type of the resource bound with an ENI. Valid values: cvm, eks.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Business Type of the resource bound with an ENI. Valid values: cvm, eks.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Type of the resource bound with an ENI. Valid values: cvm, eks.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Business Type of the resource bound with an ENI. Valid values: cvm, eks.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get ID of the CDC instance associated with the ENI
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CdcId ID of the CDC instance associated with the ENI
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set ID of the CDC instance associated with the ENI
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CdcId ID of the CDC instance associated with the ENI
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "PrivateIpAddressSet.", this.PrivateIpAddressSet);
        this.setParamObj(map, prefix + "Attachment.", this.Attachment);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "Ipv6AddressSet.", this.Ipv6AddressSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "EniType", this.EniType);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}


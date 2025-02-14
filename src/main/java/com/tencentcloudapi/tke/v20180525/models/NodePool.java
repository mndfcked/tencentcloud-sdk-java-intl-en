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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodePool extends AbstractModel{

    /**
    * Node pool ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Node pool name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cluster instance ID
    */
    @SerializedName("ClusterInstanceId")
    @Expose
    private String ClusterInstanceId;

    /**
    * Status
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * Launch configuration ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Auto-scaling group ID
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
    * Labels
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Array of taint
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * Node list
    */
    @SerializedName("NodeCountSummary")
    @Expose
    private NodeCountSummary NodeCountSummary;

    /**
    * 
    */
    @SerializedName("AutoscalingGroupStatus")
    @Expose
    private String AutoscalingGroupStatus;

    /**
    * Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("DesiredNodesNum")
    @Expose
    private Long DesiredNodesNum;

    /**
    * The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("DesiredPodNum")
    @Expose
    private Long DesiredPodNum;

    /**
    * Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
     * Get Node pool ID 
     * @return NodePoolId Node pool ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set Node pool ID
     * @param NodePoolId Node pool ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get Node pool name 
     * @return Name Node pool name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Node pool name
     * @param Name Node pool name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cluster instance ID 
     * @return ClusterInstanceId Cluster instance ID
     */
    public String getClusterInstanceId() {
        return this.ClusterInstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param ClusterInstanceId Cluster instance ID
     */
    public void setClusterInstanceId(String ClusterInstanceId) {
        this.ClusterInstanceId = ClusterInstanceId;
    }

    /**
     * Get Status 
     * @return LifeState Status
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set Status
     * @param LifeState Status
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get Launch configuration ID 
     * @return LaunchConfigurationId Launch configuration ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set Launch configuration ID
     * @param LaunchConfigurationId Launch configuration ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get Auto-scaling group ID 
     * @return AutoscalingGroupId Auto-scaling group ID
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set Auto-scaling group ID
     * @param AutoscalingGroupId Auto-scaling group ID
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    /**
     * Get Labels 
     * @return Labels Labels
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Labels
     * @param Labels Labels
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Array of taint 
     * @return Taints Array of taint
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Array of taint
     * @param Taints Array of taint
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get Node list 
     * @return NodeCountSummary Node list
     */
    public NodeCountSummary getNodeCountSummary() {
        return this.NodeCountSummary;
    }

    /**
     * Set Node list
     * @param NodeCountSummary Node list
     */
    public void setNodeCountSummary(NodeCountSummary NodeCountSummary) {
        this.NodeCountSummary = NodeCountSummary;
    }

    /**
     * Get  
     * @return AutoscalingGroupStatus 
     */
    public String getAutoscalingGroupStatus() {
        return this.AutoscalingGroupStatus;
    }

    /**
     * Set 
     * @param AutoscalingGroupStatus 
     */
    public void setAutoscalingGroupStatus(String AutoscalingGroupStatus) {
        this.AutoscalingGroupStatus = AutoscalingGroupStatus;
    }

    /**
     * Get Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MaxNodesNum Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MaxNodesNum Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MinNodesNum Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MinNodesNum Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return DesiredNodesNum Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getDesiredNodesNum() {
        return this.DesiredNodesNum;
    }

    /**
     * Set Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param DesiredNodesNum Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setDesiredNodesNum(Long DesiredNodesNum) {
        this.DesiredNodesNum = DesiredNodesNum;
    }

    /**
     * Get The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return NodePoolOs The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param NodePoolOs The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get Image ID
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ImageId Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ImageId Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return DesiredPodNum This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getDesiredPodNum() {
        return this.DesiredPodNum;
    }

    /**
     * Set This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param DesiredPodNum This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setDesiredPodNum(Long DesiredPodNum) {
        this.DesiredPodNum = DesiredPodNum;
    }

    /**
     * Get Custom script
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return UserScript Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param UserScript Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterInstanceId", this.ClusterInstanceId);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamObj(map, prefix + "NodeCountSummary.", this.NodeCountSummary);
        this.setParamSimple(map, prefix + "AutoscalingGroupStatus", this.AutoscalingGroupStatus);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamSimple(map, prefix + "DesiredNodesNum", this.DesiredNodesNum);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "DesiredPodNum", this.DesiredPodNum);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);

    }
}


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

public class BandwidthPackage extends AbstractModel{

    /**
    * The unique ID of the bandwidth package.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * The name of the bandwidth package.
    */
    @SerializedName("BandwidthPackageName")
    @Expose
    private String BandwidthPackageName;

    /**
    * The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The resource information of the bandwidth package.
    */
    @SerializedName("ResourceSet")
    @Expose
    private Resource [] ResourceSet;

    /**
    * The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get The unique ID of the bandwidth package. 
     * @return BandwidthPackageId The unique ID of the bandwidth package.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The unique ID of the bandwidth package.
     * @param BandwidthPackageId The unique ID of the bandwidth package.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST' 
     * @return NetworkType The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'
     * @param NetworkType The bandwidth package type. Valid values: 'BGP', 'SINGLEISP', and 'ANYCAST'
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH' 
     * @return ChargeType The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'
     * @param ChargeType The bandwidth package billing mode. Valid values: 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get The name of the bandwidth package. 
     * @return BandwidthPackageName The name of the bandwidth package.
     */
    public String getBandwidthPackageName() {
        return this.BandwidthPackageName;
    }

    /**
     * Set The name of the bandwidth package.
     * @param BandwidthPackageName The name of the bandwidth package.
     */
    public void setBandwidthPackageName(String BandwidthPackageName) {
        this.BandwidthPackageName = BandwidthPackageName;
    }

    /**
     * Get The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`. 
     * @return CreatedTime The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     * @param CreatedTime The creation time of the bandwidth package, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'. 
     * @return Status The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
     * @param Status The status of the bandwidth package. Valid values: 'CREATING', 'CREATED', 'DELETING', and 'DELETED'.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The resource information of the bandwidth package. 
     * @return ResourceSet The resource information of the bandwidth package.
     */
    public Resource [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set The resource information of the bandwidth package.
     * @param ResourceSet The resource information of the bandwidth package.
     */
    public void setResourceSet(Resource [] ResourceSet) {
        this.ResourceSet = ResourceSet;
    }

    /**
     * Get The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit. 
     * @return Bandwidth The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     * @param Bandwidth The limit of the bandwidth package in Mbps. The value '-1' indicates there is no limit.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageName", this.BandwidthPackageName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}


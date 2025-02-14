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

public class CreateNetworkAclRequest extends AbstractModel{

    /**
    * ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of the DescribeVpcs API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Name of the network ACL. The maximum length is 60 bytes.
    */
    @SerializedName("NetworkAclName")
    @Expose
    private String NetworkAclName;

    /**
     * Get ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of the DescribeVpcs API. 
     * @return VpcId ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of the DescribeVpcs API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of the DescribeVpcs API.
     * @param VpcId ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of the DescribeVpcs API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Name of the network ACL. The maximum length is 60 bytes. 
     * @return NetworkAclName Name of the network ACL. The maximum length is 60 bytes.
     */
    public String getNetworkAclName() {
        return this.NetworkAclName;
    }

    /**
     * Set Name of the network ACL. The maximum length is 60 bytes.
     * @param NetworkAclName Name of the network ACL. The maximum length is 60 bytes.
     */
    public void setNetworkAclName(String NetworkAclName) {
        this.NetworkAclName = NetworkAclName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkAclName", this.NetworkAclName);

    }
}


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

public class ModifyNetworkAclEntriesRequest extends AbstractModel{

    /**
    * Network ACL instance ID. Example: acl-12345678.
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * Network ACL rule set.
    */
    @SerializedName("NetworkAclEntrySet")
    @Expose
    private NetworkAclEntrySet NetworkAclEntrySet;

    /**
     * Get Network ACL instance ID. Example: acl-12345678. 
     * @return NetworkAclId Network ACL instance ID. Example: acl-12345678.
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set Network ACL instance ID. Example: acl-12345678.
     * @param NetworkAclId Network ACL instance ID. Example: acl-12345678.
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get Network ACL rule set. 
     * @return NetworkAclEntrySet Network ACL rule set.
     */
    public NetworkAclEntrySet getNetworkAclEntrySet() {
        return this.NetworkAclEntrySet;
    }

    /**
     * Set Network ACL rule set.
     * @param NetworkAclEntrySet Network ACL rule set.
     */
    public void setNetworkAclEntrySet(NetworkAclEntrySet NetworkAclEntrySet) {
        this.NetworkAclEntrySet = NetworkAclEntrySet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamObj(map, prefix + "NetworkAclEntrySet.", this.NetworkAclEntrySet);

    }
}


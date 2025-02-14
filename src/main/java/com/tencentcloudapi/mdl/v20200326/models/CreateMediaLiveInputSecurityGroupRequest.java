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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMediaLiveInputSecurityGroupRequest extends AbstractModel{

    /**
    * Input security group name, which can contain letters, digits, and underscores and must be unique at the region level.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of allowlist entries. Quantity limit: [1,10].
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
     * Get Input security group name, which can contain letters, digits, and underscores and must be unique at the region level. 
     * @return Name Input security group name, which can contain letters, digits, and underscores and must be unique at the region level.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Input security group name, which can contain letters, digits, and underscores and must be unique at the region level.
     * @param Name Input security group name, which can contain letters, digits, and underscores and must be unique at the region level.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of allowlist entries. Quantity limit: [1,10]. 
     * @return Whitelist List of allowlist entries. Quantity limit: [1,10].
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set List of allowlist entries. Quantity limit: [1,10].
     * @param Whitelist List of allowlist entries. Quantity limit: [1,10].
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);

    }
}


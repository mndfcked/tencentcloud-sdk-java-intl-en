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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceLinkedRoleRequest extends AbstractModel{

    /**
    * Authorized service, i.e., Tencent Cloud service entity with this role attached.
    */
    @SerializedName("QCSServiceName")
    @Expose
    private String [] QCSServiceName;

    /**
    * Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
    */
    @SerializedName("CustomSuffix")
    @Expose
    private String CustomSuffix;

    /**
    * Role description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Authorized service, i.e., Tencent Cloud service entity with this role attached. 
     * @return QCSServiceName Authorized service, i.e., Tencent Cloud service entity with this role attached.
     */
    public String [] getQCSServiceName() {
        return this.QCSServiceName;
    }

    /**
     * Set Authorized service, i.e., Tencent Cloud service entity with this role attached.
     * @param QCSServiceName Authorized service, i.e., Tencent Cloud service entity with this role attached.
     */
    public void setQCSServiceName(String [] QCSServiceName) {
        this.QCSServiceName = QCSServiceName;
    }

    /**
     * Get Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name. 
     * @return CustomSuffix Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
     */
    public String getCustomSuffix() {
        return this.CustomSuffix;
    }

    /**
     * Set Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
     * @param CustomSuffix Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
     */
    public void setCustomSuffix(String CustomSuffix) {
        this.CustomSuffix = CustomSuffix;
    }

    /**
     * Get Role description. 
     * @return Description Role description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Role description.
     * @param Description Role description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "QCSServiceName.", this.QCSServiceName);
        this.setParamSimple(map, prefix + "CustomSuffix", this.CustomSuffix);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


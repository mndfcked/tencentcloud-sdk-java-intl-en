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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorTypeNamespace extends AbstractModel{

    /**
    * Monitor type
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * Policy type value
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get Monitor type 
     * @return MonitorType Monitor type
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitor type
     * @param MonitorType Monitor type
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Policy type value 
     * @return Namespace Policy type value
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Policy type value
     * @param Namespace Policy type value
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}


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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagConfigureInfo extends AbstractModel{

    /**
    * Switch of intelligent tagging task. Valid values:
<li>ON: enables intelligent tagging task;</li>
<li>OFF: disables intelligent tagging task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Switch of intelligent tagging task. Valid values:
<li>ON: enables intelligent tagging task;</li>
<li>OFF: disables intelligent tagging task.</li> 
     * @return Switch Switch of intelligent tagging task. Valid values:
<li>ON: enables intelligent tagging task;</li>
<li>OFF: disables intelligent tagging task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of intelligent tagging task. Valid values:
<li>ON: enables intelligent tagging task;</li>
<li>OFF: disables intelligent tagging task.</li>
     * @param Switch Switch of intelligent tagging task. Valid values:
<li>ON: enables intelligent tagging task;</li>
<li>OFF: disables intelligent tagging task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}


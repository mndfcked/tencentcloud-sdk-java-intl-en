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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoginWhiteListRequest extends AbstractModel{

    /**
    * Whitelist rule
    */
    @SerializedName("Rules")
    @Expose
    private LoginWhiteListsRule Rules;

    /**
     * Get Whitelist rule 
     * @return Rules Whitelist rule
     */
    public LoginWhiteListsRule getRules() {
        return this.Rules;
    }

    /**
     * Set Whitelist rule
     * @param Rules Whitelist rule
     */
    public void setRules(LoginWhiteListsRule Rules) {
        this.Rules = Rules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rules.", this.Rules);

    }
}


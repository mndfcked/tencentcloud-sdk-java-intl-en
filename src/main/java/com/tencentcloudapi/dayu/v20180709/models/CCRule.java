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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCRule extends AbstractModel{

    /**
    * Key of the policy. Valid values: `host`, `cgi`, `ua`, `referer`
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * Rule condition. Valid values: `include`, `not_include`, `equal`
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Value of the policy. Length limit: 31 bytes
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Key of the policy. Valid values: `host`, `cgi`, `ua`, `referer` 
     * @return Skey Key of the policy. Valid values: `host`, `cgi`, `ua`, `referer`
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set Key of the policy. Valid values: `host`, `cgi`, `ua`, `referer`
     * @param Skey Key of the policy. Valid values: `host`, `cgi`, `ua`, `referer`
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get Rule condition. Valid values: `include`, `not_include`, `equal` 
     * @return Operator Rule condition. Valid values: `include`, `not_include`, `equal`
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Rule condition. Valid values: `include`, `not_include`, `equal`
     * @param Operator Rule condition. Valid values: `include`, `not_include`, `equal`
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Value of the policy. Length limit: 31 bytes 
     * @return Value Value of the policy. Length limit: 31 bytes
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value of the policy. Length limit: 31 bytes
     * @param Value Value of the policy. Length limit: 31 bytes
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


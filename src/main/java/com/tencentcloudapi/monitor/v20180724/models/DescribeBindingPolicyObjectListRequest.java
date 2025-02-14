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

public class DescribeBindingPolicyObjectListRequest extends AbstractModel{

    /**
    * The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Policy group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Parameter offset on each page. The value starts from 0 and the default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Dimensions of filtering objects.
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeBindingPolicyObjectListDimension [] Dimensions;

    /**
     * Get The value is fixed to monitor. 
     * @return Module The value is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The value is fixed to monitor.
     * @param Module The value is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Policy group ID. 
     * @return GroupId Policy group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID.
     * @param GroupId Policy group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20. 
     * @return Limit Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     * @param Limit Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Parameter offset on each page. The value starts from 0 and the default value is 0. 
     * @return Offset Parameter offset on each page. The value starts from 0 and the default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Parameter offset on each page. The value starts from 0 and the default value is 0.
     * @param Offset Parameter offset on each page. The value starts from 0 and the default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Dimensions of filtering objects. 
     * @return Dimensions Dimensions of filtering objects.
     */
    public DescribeBindingPolicyObjectListDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimensions of filtering objects.
     * @param Dimensions Dimensions of filtering objects.
     */
    public void setDimensions(DescribeBindingPolicyObjectListDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}


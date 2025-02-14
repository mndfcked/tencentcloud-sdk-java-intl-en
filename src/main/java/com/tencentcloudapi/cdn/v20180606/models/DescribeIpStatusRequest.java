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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpStatusRequest extends AbstractModel{

    /**
    * Acceleration domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Node type.
edge: edge server
last: intermediate server
If this parameter is left empty, edge server information will be returned by default
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * Region to be queried.
mainland: domestic nodes
overseas: overseas nodes
global: global nodes
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Acceleration domain name 
     * @return Domain Acceleration domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Acceleration domain name
     * @param Domain Acceleration domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Node type.
edge: edge server
last: intermediate server
If this parameter is left empty, edge server information will be returned by default 
     * @return Layer Node type.
edge: edge server
last: intermediate server
If this parameter is left empty, edge server information will be returned by default
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set Node type.
edge: edge server
last: intermediate server
If this parameter is left empty, edge server information will be returned by default
     * @param Layer Node type.
edge: edge server
last: intermediate server
If this parameter is left empty, edge server information will be returned by default
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get Region to be queried.
mainland: domestic nodes
overseas: overseas nodes
global: global nodes 
     * @return Area Region to be queried.
mainland: domestic nodes
overseas: overseas nodes
global: global nodes
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region to be queried.
mainland: domestic nodes
overseas: overseas nodes
global: global nodes
     * @param Area Region to be queried.
mainland: domestic nodes
overseas: overseas nodes
global: global nodes
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}


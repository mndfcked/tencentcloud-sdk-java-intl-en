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

public class DescribeRouteTablesRequest extends AbstractModel{

    /**
    * Filter condition. `RouteTableIds` and `Filters` cannot be specified at the same time.
<li>route-table-id - String - (Filter condition) Route table instance ID.</li>
<li>route-table-name - String - (Filter condition) Route table name.</li>
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>association.main - String - (Filter condition) Whether it is the main route table.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 2 for the detailed usage.</li>
<li>is-need-router-info - String - (Filter condition) Whether to obtain routing policies. It defaults to `false`. To obtain routing policies, change the parameter value to `true`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The route table instance ID, such as `rtb-azd4dt1c`.
    */
    @SerializedName("RouteTableIds")
    @Expose
    private String [] RouteTableIds;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * The number of request objects.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
     * Get Filter condition. `RouteTableIds` and `Filters` cannot be specified at the same time.
<li>route-table-id - String - (Filter condition) Route table instance ID.</li>
<li>route-table-name - String - (Filter condition) Route table name.</li>
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>association.main - String - (Filter condition) Whether it is the main route table.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 2 for the detailed usage.</li>
<li>is-need-router-info - String - (Filter condition) Whether to obtain routing policies. It defaults to `false`. To obtain routing policies, change the parameter value to `true`.</li> 
     * @return Filters Filter condition. `RouteTableIds` and `Filters` cannot be specified at the same time.
<li>route-table-id - String - (Filter condition) Route table instance ID.</li>
<li>route-table-name - String - (Filter condition) Route table name.</li>
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>association.main - String - (Filter condition) Whether it is the main route table.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 2 for the detailed usage.</li>
<li>is-need-router-info - String - (Filter condition) Whether to obtain routing policies. It defaults to `false`. To obtain routing policies, change the parameter value to `true`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `RouteTableIds` and `Filters` cannot be specified at the same time.
<li>route-table-id - String - (Filter condition) Route table instance ID.</li>
<li>route-table-name - String - (Filter condition) Route table name.</li>
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>association.main - String - (Filter condition) Whether it is the main route table.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 2 for the detailed usage.</li>
<li>is-need-router-info - String - (Filter condition) Whether to obtain routing policies. It defaults to `false`. To obtain routing policies, change the parameter value to `true`.</li>
     * @param Filters Filter condition. `RouteTableIds` and `Filters` cannot be specified at the same time.
<li>route-table-id - String - (Filter condition) Route table instance ID.</li>
<li>route-table-name - String - (Filter condition) Route table name.</li>
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>association.main - String - (Filter condition) Whether it is the main route table.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 2 for the detailed usage.</li>
<li>is-need-router-info - String - (Filter condition) Whether to obtain routing policies. It defaults to `false`. To obtain routing policies, change the parameter value to `true`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The route table instance ID, such as `rtb-azd4dt1c`. 
     * @return RouteTableIds The route table instance ID, such as `rtb-azd4dt1c`.
     */
    public String [] getRouteTableIds() {
        return this.RouteTableIds;
    }

    /**
     * Set The route table instance ID, such as `rtb-azd4dt1c`.
     * @param RouteTableIds The route table instance ID, such as `rtb-azd4dt1c`.
     */
    public void setRouteTableIds(String [] RouteTableIds) {
        this.RouteTableIds = RouteTableIds;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of request objects. 
     * @return Limit The number of request objects.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of request objects.
     * @param Limit The number of request objects.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "RouteTableIds.", this.RouteTableIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


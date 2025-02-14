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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessDBInstancesRequest extends AbstractModel{

    /**
    * Query conditions
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
    * The number of queries
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The offset value
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting metric. Currently, only "CreateTime" (instance creation time) is supported.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Ascending and descending are supported.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Query conditions 
     * @return Filter Query conditions
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set Query conditions
     * @param Filter Query conditions
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get The number of queries 
     * @return Limit The number of queries
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of queries
     * @param Limit The number of queries
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The offset value 
     * @return Offset The offset value
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset value
     * @param Offset The offset value
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting metric. Currently, only "CreateTime" (instance creation time) is supported. 
     * @return OrderBy Sorting metric. Currently, only "CreateTime" (instance creation time) is supported.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting metric. Currently, only "CreateTime" (instance creation time) is supported.
     * @param OrderBy Sorting metric. Currently, only "CreateTime" (instance creation time) is supported.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Ascending and descending are supported. 
     * @return OrderByType Sorting order. Ascending and descending are supported.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Ascending and descending are supported.
     * @param OrderByType Sorting order. Ascending and descending are supported.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}


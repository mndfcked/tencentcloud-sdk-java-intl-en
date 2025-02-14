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

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * Filter condition. Valid values: db-instance-id, db-instance-name, db-project-id, db-pay-mode, db-tag-key.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of entries returned per page. Default value: 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset which starts from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * In ascending or descending order
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Filter condition. Valid values: db-instance-id, db-instance-name, db-project-id, db-pay-mode, db-tag-key. 
     * @return Filters Filter condition. Valid values: db-instance-id, db-instance-name, db-project-id, db-pay-mode, db-tag-key.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. Valid values: db-instance-id, db-instance-name, db-project-id, db-pay-mode, db-tag-key.
     * @param Filters Filter condition. Valid values: db-instance-id, db-instance-name, db-project-id, db-pay-mode, db-tag-key.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of entries returned per page. Default value: 10. 
     * @return Limit Number of entries returned per page. Default value: 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per page. Default value: 10.
     * @param Limit Number of entries returned per page. Default value: 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset which starts from 0 
     * @return Offset Data offset which starts from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset which starts from 0
     * @param Offset Data offset which starts from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime 
     * @return OrderBy Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
     * @param OrderBy Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get In ascending or descending order 
     * @return OrderByType In ascending or descending order
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set In ascending or descending order
     * @param OrderByType In ascending or descending order
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}


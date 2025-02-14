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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectSecurityGroupsRequest extends AbstractModel{

    /**
    * Database engine name: mariadb, cdb, cynosdb, dcdb, redis, mongodb.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of security groups to be pulled.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search criteria. You can enter a security group ID or name.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get Database engine name: mariadb, cdb, cynosdb, dcdb, redis, mongodb. 
     * @return Product Database engine name: mariadb, cdb, cynosdb, dcdb, redis, mongodb.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Database engine name: mariadb, cdb, cynosdb, dcdb, redis, mongodb.
     * @param Product Database engine name: mariadb, cdb, cynosdb, dcdb, redis, mongodb.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of security groups to be pulled. 
     * @return Limit The number of security groups to be pulled.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of security groups to be pulled.
     * @param Limit The number of security groups to be pulled.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search criteria. You can enter a security group ID or name. 
     * @return SearchKey Search criteria. You can enter a security group ID or name.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search criteria. You can enter a security group ID or name.
     * @param SearchKey Search criteria. You can enter a security group ID or name.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}


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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDiagDBInstanceConfRequest extends AbstractModel{

    /**
    * Whether to enable inspection
    */
    @SerializedName("InstanceConfs")
    @Expose
    private InstanceConfs InstanceConfs;

    /**
    * Target regions of the request. If the value is `All`, it is applied to all regions.
    */
    @SerializedName("Regions")
    @Expose
    private String Regions;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * ID of the instance to modify.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Whether to enable inspection 
     * @return InstanceConfs Whether to enable inspection
     */
    public InstanceConfs getInstanceConfs() {
        return this.InstanceConfs;
    }

    /**
     * Set Whether to enable inspection
     * @param InstanceConfs Whether to enable inspection
     */
    public void setInstanceConfs(InstanceConfs InstanceConfs) {
        this.InstanceConfs = InstanceConfs;
    }

    /**
     * Get Target regions of the request. If the value is `All`, it is applied to all regions. 
     * @return Regions Target regions of the request. If the value is `All`, it is applied to all regions.
     */
    public String getRegions() {
        return this.Regions;
    }

    /**
     * Set Target regions of the request. If the value is `All`, it is applied to all regions.
     * @param Regions Target regions of the request. If the value is `All`, it is applied to all regions.
     */
    public void setRegions(String Regions) {
        this.Regions = Regions;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)). 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get ID of the instance to modify. 
     * @return InstanceIds ID of the instance to modify.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID of the instance to modify.
     * @param InstanceIds ID of the instance to modify.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceConfs.", this.InstanceConfs);
        this.setParamSimple(map, prefix + "Regions", this.Regions);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}


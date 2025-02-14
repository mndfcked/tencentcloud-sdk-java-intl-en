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

public class UpgradeDBInstanceResponse extends AbstractModel{

    /**
    * Transaction name.
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * Bill ID of frozen fees
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Transaction name. 
     * @return DealName Transaction name.
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Transaction name.
     * @param DealName Transaction name.
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get Bill ID of frozen fees 
     * @return BillId Bill ID of frozen fees
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Bill ID of frozen fees
     * @param BillId Bill ID of frozen fees
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


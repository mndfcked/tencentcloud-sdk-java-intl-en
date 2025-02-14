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

public class InquiryPriceRenewDBInstanceResponse extends AbstractModel{

    /**
    * Total cost before discount; for example, 24650 indicates 246.5 CNY
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
    * Actual amount payable; for example, 24650 indicates 246.5 CNY
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total cost before discount; for example, 24650 indicates 246.5 CNY 
     * @return OriginalPrice Total cost before discount; for example, 24650 indicates 246.5 CNY
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Total cost before discount; for example, 24650 indicates 246.5 CNY
     * @param OriginalPrice Total cost before discount; for example, 24650 indicates 246.5 CNY
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Actual amount payable; for example, 24650 indicates 246.5 CNY 
     * @return Price Actual amount payable; for example, 24650 indicates 246.5 CNY
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set Actual amount payable; for example, 24650 indicates 246.5 CNY
     * @param Price Actual amount payable; for example, 24650 indicates 246.5 CNY
     */
    public void setPrice(Long Price) {
        this.Price = Price;
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
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


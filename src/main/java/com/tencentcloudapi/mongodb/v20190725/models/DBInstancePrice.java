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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstancePrice extends AbstractModel{

    /**
    * Unit price.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Original price.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discounted price.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get Unit price.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UnitPrice Unit price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Unit price.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UnitPrice Unit price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Original price. 
     * @return OriginalPrice Original price.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price.
     * @param OriginalPrice Original price.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discounted price. 
     * @return DiscountPrice Discounted price.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price.
     * @param DiscountPrice Discounted price.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}


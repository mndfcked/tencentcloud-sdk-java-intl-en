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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel{

    /**
    * Original price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Original unit price of a postpaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Billing unit of a postpaid cloud disk. Value range: <br><li>HOUR: Billed by hour.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Postpaid cloud disk discount price. Unit: CNY.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * Highly-precise published unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalPriceHigh")
    @Expose
    private String OriginalPriceHigh;

    /**
    * Highly-precise discounted unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountPriceHigh")
    @Expose
    private String DiscountPriceHigh;

    /**
    * Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceHigh")
    @Expose
    private String UnitPriceHigh;

    /**
    * Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnitPriceDiscountHigh")
    @Expose
    private String UnitPriceDiscountHigh;

    /**
     * Get Original price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found. 
     * @return OriginalPrice Original price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     * @param OriginalPrice Original price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found. 
     * @return DiscountPrice Discount price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discount price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     * @param DiscountPrice Discount price of the advanced payment for a prepaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Original unit price of a postpaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found. 
     * @return UnitPrice Original unit price of a postpaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Original unit price of a postpaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     * @param UnitPrice Original unit price of a postpaid cloud disk (in CNY).
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Billing unit of a postpaid cloud disk. Value range: <br><li>HOUR: Billed by hour.
Note: This field may return null, indicating that no valid value was found. 
     * @return ChargeUnit Billing unit of a postpaid cloud disk. Value range: <br><li>HOUR: Billed by hour.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set Billing unit of a postpaid cloud disk. Value range: <br><li>HOUR: Billed by hour.
Note: This field may return null, indicating that no valid value was found.
     * @param ChargeUnit Billing unit of a postpaid cloud disk. Value range: <br><li>HOUR: Billed by hour.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get Postpaid cloud disk discount price. Unit: CNY.
Note: This field may return null, indicating that no valid value was found. 
     * @return UnitPriceDiscount Postpaid cloud disk discount price. Unit: CNY.
Note: This field may return null, indicating that no valid value was found.
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set Postpaid cloud disk discount price. Unit: CNY.
Note: This field may return null, indicating that no valid value was found.
     * @param UnitPriceDiscount Postpaid cloud disk discount price. Unit: CNY.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get Highly-precise published unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OriginalPriceHigh Highly-precise published unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOriginalPriceHigh() {
        return this.OriginalPriceHigh;
    }

    /**
     * Set Highly-precise published unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OriginalPriceHigh Highly-precise published unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOriginalPriceHigh(String OriginalPriceHigh) {
        this.OriginalPriceHigh = OriginalPriceHigh;
    }

    /**
     * Get Highly-precise discounted unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DiscountPriceHigh Highly-precise discounted unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDiscountPriceHigh() {
        return this.DiscountPriceHigh;
    }

    /**
     * Set Highly-precise discounted unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DiscountPriceHigh Highly-precise discounted unit price of a monthly-subscribed cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDiscountPriceHigh(String DiscountPriceHigh) {
        this.DiscountPriceHigh = DiscountPriceHigh;
    }

    /**
     * Get Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceHigh Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPriceHigh() {
        return this.UnitPriceHigh;
    }

    /**
     * Set Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceHigh Highly-precise published unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceHigh(String UnitPriceHigh) {
        this.UnitPriceHigh = UnitPriceHigh;
    }

    /**
     * Get Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnitPriceDiscountHigh Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnitPriceDiscountHigh() {
        return this.UnitPriceDiscountHigh;
    }

    /**
     * Set Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnitPriceDiscountHigh Highly-precise discounted unit price of a pay-as-you-go cloud disk, in USD.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnitPriceDiscountHigh(String UnitPriceDiscountHigh) {
        this.UnitPriceDiscountHigh = UnitPriceDiscountHigh;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "OriginalPriceHigh", this.OriginalPriceHigh);
        this.setParamSimple(map, prefix + "DiscountPriceHigh", this.DiscountPriceHigh);
        this.setParamSimple(map, prefix + "UnitPriceHigh", this.UnitPriceHigh);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHigh", this.UnitPriceDiscountHigh);

    }
}


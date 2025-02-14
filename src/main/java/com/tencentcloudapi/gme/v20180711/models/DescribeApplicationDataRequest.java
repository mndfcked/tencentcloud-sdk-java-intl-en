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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationDataRequest extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Data start date in the format of yyyy-mm-dd, such as 2018-07-13
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * Data end date in the format of yyyy-mm-dd, such as 2018-07-13
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get Application ID 
     * @return BizId Application ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID
     * @param BizId Application ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Data start date in the format of yyyy-mm-dd, such as 2018-07-13 
     * @return StartDate Data start date in the format of yyyy-mm-dd, such as 2018-07-13
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Data start date in the format of yyyy-mm-dd, such as 2018-07-13
     * @param StartDate Data start date in the format of yyyy-mm-dd, such as 2018-07-13
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get Data end date in the format of yyyy-mm-dd, such as 2018-07-13 
     * @return EndDate Data end date in the format of yyyy-mm-dd, such as 2018-07-13
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set Data end date in the format of yyyy-mm-dd, such as 2018-07-13
     * @param EndDate Data end date in the format of yyyy-mm-dd, such as 2018-07-13
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}


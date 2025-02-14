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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashRemuxSettingsInfo extends AbstractModel{

    /**
    * Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
    * Number of segments. Value range: [1,30]. Default value: 5.
    */
    @SerializedName("SegmentNumber")
    @Expose
    private Long SegmentNumber;

    /**
    * Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
    */
    @SerializedName("PeriodTriggers")
    @Expose
    private String PeriodTriggers;

    /**
     * Get Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000. 
     * @return SegmentDuration Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     * @param SegmentDuration Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
    }

    /**
     * Get Number of segments. Value range: [1,30]. Default value: 5. 
     * @return SegmentNumber Number of segments. Value range: [1,30]. Default value: 5.
     */
    public Long getSegmentNumber() {
        return this.SegmentNumber;
    }

    /**
     * Set Number of segments. Value range: [1,30]. Default value: 5.
     * @param SegmentNumber Number of segments. Value range: [1,30]. Default value: 5.
     */
    public void setSegmentNumber(Long SegmentNumber) {
        this.SegmentNumber = SegmentNumber;
    }

    /**
     * Get Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE. 
     * @return PeriodTriggers Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
     */
    public String getPeriodTriggers() {
        return this.PeriodTriggers;
    }

    /**
     * Set Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
     * @param PeriodTriggers Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
     */
    public void setPeriodTriggers(String PeriodTriggers) {
        this.PeriodTriggers = PeriodTriggers;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);
        this.setParamSimple(map, prefix + "SegmentNumber", this.SegmentNumber);
        this.setParamSimple(map, prefix + "PeriodTriggers", this.PeriodTriggers);

    }
}


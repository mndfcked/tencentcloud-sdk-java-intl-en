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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveWatermarkRequest extends AbstractModel{

    /**
    * Watermark ID returned by the `DescribeLiveWatermarks` API.
    */
    @SerializedName("WatermarkId")
    @Expose
    private Long WatermarkId;

    /**
     * Get Watermark ID returned by the `DescribeLiveWatermarks` API. 
     * @return WatermarkId Watermark ID returned by the `DescribeLiveWatermarks` API.
     */
    public Long getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set Watermark ID returned by the `DescribeLiveWatermarks` API.
     * @param WatermarkId Watermark ID returned by the `DescribeLiveWatermarks` API.
     */
    public void setWatermarkId(Long WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);

    }
}


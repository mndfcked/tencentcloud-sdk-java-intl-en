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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleKeyDeletionRequest extends AbstractModel{

    /**
    * Unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Schedule deletion time range. Value range: [7,30]
    */
    @SerializedName("PendingWindowInDays")
    @Expose
    private Long PendingWindowInDays;

    /**
     * Get Unique CMK ID 
     * @return KeyId Unique CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique CMK ID
     * @param KeyId Unique CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Schedule deletion time range. Value range: [7,30] 
     * @return PendingWindowInDays Schedule deletion time range. Value range: [7,30]
     */
    public Long getPendingWindowInDays() {
        return this.PendingWindowInDays;
    }

    /**
     * Set Schedule deletion time range. Value range: [7,30]
     * @param PendingWindowInDays Schedule deletion time range. Value range: [7,30]
     */
    public void setPendingWindowInDays(Long PendingWindowInDays) {
        this.PendingWindowInDays = PendingWindowInDays;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PendingWindowInDays", this.PendingWindowInDays);

    }
}


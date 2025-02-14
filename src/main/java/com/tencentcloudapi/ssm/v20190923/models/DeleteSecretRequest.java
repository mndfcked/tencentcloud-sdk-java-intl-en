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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecretRequest extends AbstractModel{

    /**
    * Name of the Secret to be deleted.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Scheduled deletion time, in days. If set to 0, the Secret is deleted immediately. A number in the range of 1 to 30 indicates the number of retention days. The Secret will be deleted after the set value.
    */
    @SerializedName("RecoveryWindowInDays")
    @Expose
    private Long RecoveryWindowInDays;

    /**
     * Get Name of the Secret to be deleted. 
     * @return SecretName Name of the Secret to be deleted.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of the Secret to be deleted.
     * @param SecretName Name of the Secret to be deleted.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Scheduled deletion time, in days. If set to 0, the Secret is deleted immediately. A number in the range of 1 to 30 indicates the number of retention days. The Secret will be deleted after the set value. 
     * @return RecoveryWindowInDays Scheduled deletion time, in days. If set to 0, the Secret is deleted immediately. A number in the range of 1 to 30 indicates the number of retention days. The Secret will be deleted after the set value.
     */
    public Long getRecoveryWindowInDays() {
        return this.RecoveryWindowInDays;
    }

    /**
     * Set Scheduled deletion time, in days. If set to 0, the Secret is deleted immediately. A number in the range of 1 to 30 indicates the number of retention days. The Secret will be deleted after the set value.
     * @param RecoveryWindowInDays Scheduled deletion time, in days. If set to 0, the Secret is deleted immediately. A number in the range of 1 to 30 indicates the number of retention days. The Secret will be deleted after the set value.
     */
    public void setRecoveryWindowInDays(Long RecoveryWindowInDays) {
        this.RecoveryWindowInDays = RecoveryWindowInDays;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "RecoveryWindowInDays", this.RecoveryWindowInDays);

    }
}


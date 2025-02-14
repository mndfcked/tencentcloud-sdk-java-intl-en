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

public class AttachedInputInfo extends AbstractModel{

    /**
    * Media input ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Audio selector for media input. Quantity limit: [0,20]
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioSelectors")
    @Expose
    private AudioSelectorInfo [] AudioSelectors;

    /**
     * Get Media input ID. 
     * @return Id Media input ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Media input ID.
     * @param Id Media input ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Audio selector for media input. Quantity limit: [0,20]
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioSelectors Audio selector for media input. Quantity limit: [0,20]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioSelectorInfo [] getAudioSelectors() {
        return this.AudioSelectors;
    }

    /**
     * Set Audio selector for media input. Quantity limit: [0,20]
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioSelectors Audio selector for media input. Quantity limit: [0,20]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioSelectors(AudioSelectorInfo [] AudioSelectors) {
        this.AudioSelectors = AudioSelectors;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "AudioSelectors.", this.AudioSelectors);

    }
}


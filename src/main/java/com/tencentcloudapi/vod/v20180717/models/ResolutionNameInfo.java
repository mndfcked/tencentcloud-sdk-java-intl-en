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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResolutionNameInfo extends AbstractModel{

    /**
    * Length of video short side in px.
    */
    @SerializedName("MinEdgeLength")
    @Expose
    private Long MinEdgeLength;

    /**
    * Display name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Length of video short side in px. 
     * @return MinEdgeLength Length of video short side in px.
     */
    public Long getMinEdgeLength() {
        return this.MinEdgeLength;
    }

    /**
     * Set Length of video short side in px.
     * @param MinEdgeLength Length of video short side in px.
     */
    public void setMinEdgeLength(Long MinEdgeLength) {
        this.MinEdgeLength = MinEdgeLength;
    }

    /**
     * Get Display name. 
     * @return Name Display name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Display name.
     * @param Name Display name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinEdgeLength", this.MinEdgeLength);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}


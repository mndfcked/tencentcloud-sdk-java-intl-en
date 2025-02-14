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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListMigrationTaskRequest extends AbstractModel{

    /**
    * The initial number of records, default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of records, default value: 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Project ID, the default value is empty.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get The initial number of records, default value: 0 
     * @return Offset The initial number of records, default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The initial number of records, default value: 0
     * @param Offset The initial number of records, default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of records, default value: 10 
     * @return Limit Number of records, default value: 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of records, default value: 10
     * @param Limit Number of records, default value: 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Project ID, the default value is empty. 
     * @return ProjectId Project ID, the default value is empty.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, the default value is empty.
     * @param ProjectId Project ID, the default value is empty.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}


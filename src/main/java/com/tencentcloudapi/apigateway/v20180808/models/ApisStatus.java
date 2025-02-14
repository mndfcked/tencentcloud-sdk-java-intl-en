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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApisStatus extends AbstractModel{

    /**
    * Number of eligible APIs.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * API list.
    */
    @SerializedName("ApiIdStatusSet")
    @Expose
    private DesApisStatus [] ApiIdStatusSet;

    /**
     * Get Number of eligible APIs. 
     * @return TotalCount Number of eligible APIs.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible APIs.
     * @param TotalCount Number of eligible APIs.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get API list. 
     * @return ApiIdStatusSet API list.
     */
    public DesApisStatus [] getApiIdStatusSet() {
        return this.ApiIdStatusSet;
    }

    /**
     * Set API list.
     * @param ApiIdStatusSet API list.
     */
    public void setApiIdStatusSet(DesApisStatus [] ApiIdStatusSet) {
        this.ApiIdStatusSet = ApiIdStatusSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiIdStatusSet.", this.ApiIdStatusSet);

    }
}


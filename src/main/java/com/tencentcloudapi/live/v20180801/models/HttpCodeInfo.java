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

public class HttpCodeInfo extends AbstractModel{

    /**
    * HTTP return code.
Example: "2xx", "3xx", "4xx", "5xx".
    */
    @SerializedName("HttpCode")
    @Expose
    private String HttpCode;

    /**
    * Statistics. 0 will be added for points in time when there is no data.
    */
    @SerializedName("ValueList")
    @Expose
    private HttpCodeValue [] ValueList;

    /**
     * Get HTTP return code.
Example: "2xx", "3xx", "4xx", "5xx". 
     * @return HttpCode HTTP return code.
Example: "2xx", "3xx", "4xx", "5xx".
     */
    public String getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set HTTP return code.
Example: "2xx", "3xx", "4xx", "5xx".
     * @param HttpCode HTTP return code.
Example: "2xx", "3xx", "4xx", "5xx".
     */
    public void setHttpCode(String HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get Statistics. 0 will be added for points in time when there is no data. 
     * @return ValueList Statistics. 0 will be added for points in time when there is no data.
     */
    public HttpCodeValue [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set Statistics. 0 will be added for points in time when there is no data.
     * @param ValueList Statistics. 0 will be added for points in time when there is no data.
     */
    public void setValueList(HttpCodeValue [] ValueList) {
        this.ValueList = ValueList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamArrayObj(map, prefix + "ValueList.", this.ValueList);

    }
}


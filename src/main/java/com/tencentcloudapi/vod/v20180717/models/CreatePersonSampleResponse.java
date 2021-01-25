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

public class CreatePersonSampleResponse extends AbstractModel{

    /**
    * Information of a sample.
    */
    @SerializedName("Person")
    @Expose
    private AiSamplePerson Person;

    /**
    * Information of samples that failed the verification by facial feature positioning.
    */
    @SerializedName("FailFaceInfoSet")
    @Expose
    private AiSampleFailFaceInfo [] FailFaceInfoSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of a sample. 
     * @return Person Information of a sample.
     */
    public AiSamplePerson getPerson() {
        return this.Person;
    }

    /**
     * Set Information of a sample.
     * @param Person Information of a sample.
     */
    public void setPerson(AiSamplePerson Person) {
        this.Person = Person;
    }

    /**
     * Get Information of samples that failed the verification by facial feature positioning. 
     * @return FailFaceInfoSet Information of samples that failed the verification by facial feature positioning.
     */
    public AiSampleFailFaceInfo [] getFailFaceInfoSet() {
        return this.FailFaceInfoSet;
    }

    /**
     * Set Information of samples that failed the verification by facial feature positioning.
     * @param FailFaceInfoSet Information of samples that failed the verification by facial feature positioning.
     */
    public void setFailFaceInfoSet(AiSampleFailFaceInfo [] FailFaceInfoSet) {
        this.FailFaceInfoSet = FailFaceInfoSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamArrayObj(map, prefix + "FailFaceInfoSet.", this.FailFaceInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


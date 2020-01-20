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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainErrorPageInfo extends AbstractModel{

    /**
    * Configuration ID of a custom error response
    */
    @SerializedName("ErrorPageId")
    @Expose
    private String ErrorPageId;

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Original error code
    */
    @SerializedName("ErrorNos")
    @Expose
    private Long [] ErrorNos;

    /**
    * New error code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewErrorNo")
    @Expose
    private Long NewErrorNo;

    /**
    * Response header to be cleared
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClearHeaders")
    @Expose
    private String [] ClearHeaders;

    /**
    * Response header to be set
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SetHeaders")
    @Expose
    private HttpHeaderParam [] SetHeaders;

    /**
    * Configured response body (excluding HTTP header)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get Configuration ID of a custom error response 
     * @return ErrorPageId Configuration ID of a custom error response
     */
    public String getErrorPageId() {
        return this.ErrorPageId;
    }

    /**
     * Set Configuration ID of a custom error response
     * @param ErrorPageId Configuration ID of a custom error response
     */
    public void setErrorPageId(String ErrorPageId) {
        this.ErrorPageId = ErrorPageId;
    }

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Original error code 
     * @return ErrorNos Original error code
     */
    public Long [] getErrorNos() {
        return this.ErrorNos;
    }

    /**
     * Set Original error code
     * @param ErrorNos Original error code
     */
    public void setErrorNos(Long [] ErrorNos) {
        this.ErrorNos = ErrorNos;
    }

    /**
     * Get New error code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewErrorNo New error code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNewErrorNo() {
        return this.NewErrorNo;
    }

    /**
     * Set New error code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewErrorNo New error code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewErrorNo(Long NewErrorNo) {
        this.NewErrorNo = NewErrorNo;
    }

    /**
     * Get Response header to be cleared
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClearHeaders Response header to be cleared
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getClearHeaders() {
        return this.ClearHeaders;
    }

    /**
     * Set Response header to be cleared
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClearHeaders Response header to be cleared
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClearHeaders(String [] ClearHeaders) {
        this.ClearHeaders = ClearHeaders;
    }

    /**
     * Get Response header to be set
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SetHeaders Response header to be set
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HttpHeaderParam [] getSetHeaders() {
        return this.SetHeaders;
    }

    /**
     * Set Response header to be set
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SetHeaders Response header to be set
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSetHeaders(HttpHeaderParam [] SetHeaders) {
        this.SetHeaders = SetHeaders;
    }

    /**
     * Get Configured response body (excluding HTTP header)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Body Configured response body (excluding HTTP header)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Configured response body (excluding HTTP header)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Body Configured response body (excluding HTTP header)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorPageId", this.ErrorPageId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ErrorNos.", this.ErrorNos);
        this.setParamSimple(map, prefix + "NewErrorNo", this.NewErrorNo);
        this.setParamArraySimple(map, prefix + "ClearHeaders.", this.ClearHeaders);
        this.setParamArrayObj(map, prefix + "SetHeaders.", this.SetHeaders);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}


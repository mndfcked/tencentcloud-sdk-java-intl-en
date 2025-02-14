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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachResourcesTagRequest extends AbstractModel{

    /**
    * Resource service name
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Resource ID array, which can contain up to 50 resources
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Tag key to be unbound
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Resource region. This field is not required for resources that do not have the region attribute
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Resource prefix, which is not required for COS buckets
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
     * Get Resource service name 
     * @return ServiceType Resource service name
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Resource service name
     * @param ServiceType Resource service name
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Resource ID array, which can contain up to 50 resources 
     * @return ResourceIds Resource ID array, which can contain up to 50 resources
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID array, which can contain up to 50 resources
     * @param ResourceIds Resource ID array, which can contain up to 50 resources
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Tag key to be unbound 
     * @return TagKey Tag key to be unbound
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key to be unbound
     * @param TagKey Tag key to be unbound
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Resource region. This field is not required for resources that do not have the region attribute 
     * @return ResourceRegion Resource region. This field is not required for resources that do not have the region attribute
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region. This field is not required for resources that do not have the region attribute
     * @param ResourceRegion Resource region. This field is not required for resources that do not have the region attribute
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Resource prefix, which is not required for COS buckets 
     * @return ResourcePrefix Resource prefix, which is not required for COS buckets
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set Resource prefix, which is not required for COS buckets
     * @param ResourcePrefix Resource prefix, which is not required for COS buckets
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);

    }
}


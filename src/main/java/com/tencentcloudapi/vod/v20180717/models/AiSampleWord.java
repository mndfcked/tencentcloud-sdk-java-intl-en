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

public class AiSampleWord extends AbstractModel{

    /**
    * Keyword.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Keyword tag.
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * Keyword use case.
    */
    @SerializedName("UsageSet")
    @Expose
    private String [] UsageSet;

    /**
    * Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Keyword. 
     * @return Keyword Keyword.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword.
     * @param Keyword Keyword.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Keyword tag. 
     * @return TagSet Keyword tag.
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Keyword tag.
     * @param TagSet Keyword tag.
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Keyword use case. 
     * @return UsageSet Keyword use case.
     */
    public String [] getUsageSet() {
        return this.UsageSet;
    }

    /**
     * Set Keyword use case.
     * @param UsageSet Keyword use case.
     */
    public void setUsageSet(String [] UsageSet) {
        this.UsageSet = UsageSet;
    }

    /**
     * Get Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return CreateTime Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param CreateTime Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return UpdateTime Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param UpdateTime Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "UsageSet.", this.UsageSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}


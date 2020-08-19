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

public class ModifyPersonSampleRequest extends AbstractModel{

    /**
    * Figure ID.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Name. Length limit: 128 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description. Length limit: 1,024 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Figure use case. Valid values:
1. Recognition: it is used for content recognition and equivalent to `Recognition.Face`.
2. Review: it is used for content audit and equivalent to `Review.Face`.
3. All: it is used for content recognition and content audit and equivalent to 1+2 above.
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * Face operation information.
    */
    @SerializedName("FaceOperationInfo")
    @Expose
    private AiSampleFaceOperation FaceOperationInfo;

    /**
    * Tag operation information.
    */
    @SerializedName("TagOperationInfo")
    @Expose
    private AiSampleTagOperation TagOperationInfo;

    /**
    * [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Figure ID. 
     * @return PersonId Figure ID.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Figure ID.
     * @param PersonId Figure ID.
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Name. Length limit: 128 characters. 
     * @return Name Name. Length limit: 128 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name. Length limit: 128 characters.
     * @param Name Name. Length limit: 128 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description. Length limit: 1,024 characters. 
     * @return Description Description. Length limit: 1,024 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. Length limit: 1,024 characters.
     * @param Description Description. Length limit: 1,024 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Figure use case. Valid values:
1. Recognition: it is used for content recognition and equivalent to `Recognition.Face`.
2. Review: it is used for content audit and equivalent to `Review.Face`.
3. All: it is used for content recognition and content audit and equivalent to 1+2 above. 
     * @return Usages Figure use case. Valid values:
1. Recognition: it is used for content recognition and equivalent to `Recognition.Face`.
2. Review: it is used for content audit and equivalent to `Review.Face`.
3. All: it is used for content recognition and content audit and equivalent to 1+2 above.
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set Figure use case. Valid values:
1. Recognition: it is used for content recognition and equivalent to `Recognition.Face`.
2. Review: it is used for content audit and equivalent to `Review.Face`.
3. All: it is used for content recognition and content audit and equivalent to 1+2 above.
     * @param Usages Figure use case. Valid values:
1. Recognition: it is used for content recognition and equivalent to `Recognition.Face`.
2. Review: it is used for content audit and equivalent to `Review.Face`.
3. All: it is used for content recognition and content audit and equivalent to 1+2 above.
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get Face operation information. 
     * @return FaceOperationInfo Face operation information.
     */
    public AiSampleFaceOperation getFaceOperationInfo() {
        return this.FaceOperationInfo;
    }

    /**
     * Set Face operation information.
     * @param FaceOperationInfo Face operation information.
     */
    public void setFaceOperationInfo(AiSampleFaceOperation FaceOperationInfo) {
        this.FaceOperationInfo = FaceOperationInfo;
    }

    /**
     * Get Tag operation information. 
     * @return TagOperationInfo Tag operation information.
     */
    public AiSampleTagOperation getTagOperationInfo() {
        return this.TagOperationInfo;
    }

    /**
     * Set Tag operation information.
     * @param TagOperationInfo Tag operation information.
     */
    public void setTagOperationInfo(AiSampleTagOperation TagOperationInfo) {
        this.TagOperationInfo = TagOperationInfo;
    }

    /**
     * Get [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamObj(map, prefix + "FaceOperationInfo.", this.FaceOperationInfo);
        this.setParamObj(map, prefix + "TagOperationInfo.", this.TagOperationInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}


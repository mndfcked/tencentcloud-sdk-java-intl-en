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

public class MediaBasicInfo extends AbstractModel{

    /**
    * Media filename.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Media file description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time of media file (by an operation that triggers updating of media file information such as modifying video attributes or initiating video processing) in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Expiration time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). After the expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. `9999-12-31T23:59:59Z` means "never expire".
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Category ID of media file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Category name of media file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Category path to media file separated by "-", such as "new first-level category - new second-level category".
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * Cover image address of media file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Media file container, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * URL of source media file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * Source information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceInfo")
    @Expose
    private MediaSourceData SourceInfo;

    /**
    * Storage region of media file, such as ap-guangzhou. For more information, please see [Region List](https://intl.cloud.tencent.com/document/api/213/15692?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Tag information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * Unique ID of an LVB recording file.
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * File status. Valid values: Normal, Forbidden.

*Note: this field is not supported yet.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Media filename.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name Media filename.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media filename.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name Media filename.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Media file description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Media file description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Media file description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Media file description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time of media file (by an operation that triggers updating of media file information such as modifying video attributes or initiating video processing) in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Last update time of media file (by an operation that triggers updating of media file information such as modifying video attributes or initiating video processing) in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time of media file (by an operation that triggers updating of media file information such as modifying video attributes or initiating video processing) in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Last update time of media file (by an operation that triggers updating of media file information such as modifying video attributes or initiating video processing) in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Expiration time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). After the expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. `9999-12-31T23:59:59Z` means "never expire".
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). After the expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. `9999-12-31T23:59:59Z` means "never expire".
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). After the expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. `9999-12-31T23:59:59Z` means "never expire".
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time of media file in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). After the expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. `9999-12-31T23:59:59Z` means "never expire".
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Category ID of media file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClassId Category ID of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClassId Category ID of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Category name of media file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClassName Category name of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Category name of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClassName Category name of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get Category path to media file separated by "-", such as "new first-level category - new second-level category".
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClassPath Category path to media file separated by "-", such as "new first-level category - new second-level category".
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set Category path to media file separated by "-", such as "new first-level category - new second-level category".
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClassPath Category path to media file separated by "-", such as "new first-level category - new second-level category".
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get Cover image address of media file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoverUrl Cover image address of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set Cover image address of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoverUrl Cover image address of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Media file container, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Type Media file container, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Media file container, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Type Media file container, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get URL of source media file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MediaUrl URL of source media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set URL of source media file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MediaUrl URL of source media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get Source information of media file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SourceInfo Source information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaSourceData getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set Source information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SourceInfo Source information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceInfo(MediaSourceData SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get Storage region of media file, such as ap-guangzhou. For more information, please see [Region List](https://intl.cloud.tencent.com/document/api/213/15692?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StorageRegion Storage region of media file, such as ap-guangzhou. For more information, please see [Region List](https://intl.cloud.tencent.com/document/api/213/15692?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Storage region of media file, such as ap-guangzhou. For more information, please see [Region List](https://intl.cloud.tencent.com/document/api/213/15692?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StorageRegion Storage region of media file, such as ap-guangzhou. For more information, please see [Region List](https://intl.cloud.tencent.com/document/api/213/15692?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Tag information of media file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag information of media file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Unique ID of an LVB recording file. 
     * @return Vid Unique ID of an LVB recording file.
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set Unique ID of an LVB recording file.
     * @param Vid Unique ID of an LVB recording file.
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li> 
     * @return Category File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     * @param Category File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get File status. Valid values: Normal, Forbidden.

*Note: this field is not supported yet. 
     * @return Status File status. Valid values: Normal, Forbidden.

*Note: this field is not supported yet.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set File status. Valid values: Normal, Forbidden.

*Note: this field is not supported yet.
     * @param Status File status. Valid values: Normal, Forbidden.

*Note: this field is not supported yet.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}


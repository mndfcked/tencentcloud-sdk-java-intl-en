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

public class MediaDeleteItem extends AbstractModel{

    /**
    * Type of the content to be deleted. If this field is left empty, the parameter will be invalid. Valid values:
<li>TranscodeFiles: deletes transcoded files.</li>
<li>WechatPublishFiles: deletes files published on WeChat.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ID of the template for which to delete the videos of the type specified by the `Type` parameter. For the template definition, please see [Transcoding Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Default value: 0, which indicates to delete all videos of the type specified by the `Type` parameter.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get Type of the content to be deleted. If this field is left empty, the parameter will be invalid. Valid values:
<li>TranscodeFiles: deletes transcoded files.</li>
<li>WechatPublishFiles: deletes files published on WeChat.</li> 
     * @return Type Type of the content to be deleted. If this field is left empty, the parameter will be invalid. Valid values:
<li>TranscodeFiles: deletes transcoded files.</li>
<li>WechatPublishFiles: deletes files published on WeChat.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the content to be deleted. If this field is left empty, the parameter will be invalid. Valid values:
<li>TranscodeFiles: deletes transcoded files.</li>
<li>WechatPublishFiles: deletes files published on WeChat.</li>
     * @param Type Type of the content to be deleted. If this field is left empty, the parameter will be invalid. Valid values:
<li>TranscodeFiles: deletes transcoded files.</li>
<li>WechatPublishFiles: deletes files published on WeChat.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ID of the template for which to delete the videos of the type specified by the `Type` parameter. For the template definition, please see [Transcoding Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Default value: 0, which indicates to delete all videos of the type specified by the `Type` parameter. 
     * @return Definition ID of the template for which to delete the videos of the type specified by the `Type` parameter. For the template definition, please see [Transcoding Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Default value: 0, which indicates to delete all videos of the type specified by the `Type` parameter.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set ID of the template for which to delete the videos of the type specified by the `Type` parameter. For the template definition, please see [Transcoding Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Default value: 0, which indicates to delete all videos of the type specified by the `Type` parameter.
     * @param Definition ID of the template for which to delete the videos of the type specified by the `Type` parameter. For the template definition, please see [Transcoding Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Default value: 0, which indicates to delete all videos of the type specified by the `Type` parameter.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}


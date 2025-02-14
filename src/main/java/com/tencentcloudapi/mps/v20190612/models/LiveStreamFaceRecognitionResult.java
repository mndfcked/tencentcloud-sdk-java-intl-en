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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamFaceRecognitionResult extends AbstractModel{

    /**
    * Unique ID of figure.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Figure name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: default figure library</li><li>UserDefine: custom figure library</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Start PTS time of recognized segment in seconds.
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * End PTS time of recognized segment in seconds.
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * Confidence of recognized segment. Value range: 0–100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Zone coordinates of recognition result. The array contains four elements: [x1,y1,x2,y2], i.e., the horizontal and vertical coordinates of the top-left and bottom-right corners.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get Unique ID of figure. 
     * @return Id Unique ID of figure.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of figure.
     * @param Id Unique ID of figure.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Figure name. 
     * @return Name Figure name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Figure name.
     * @param Name Figure name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: default figure library</li><li>UserDefine: custom figure library</li> 
     * @return Type Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: default figure library</li><li>UserDefine: custom figure library</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: default figure library</li><li>UserDefine: custom figure library</li>
     * @param Type Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: default figure library</li><li>UserDefine: custom figure library</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Start PTS time of recognized segment in seconds. 
     * @return StartPtsTime Start PTS time of recognized segment in seconds.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set Start PTS time of recognized segment in seconds.
     * @param StartPtsTime Start PTS time of recognized segment in seconds.
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get End PTS time of recognized segment in seconds. 
     * @return EndPtsTime End PTS time of recognized segment in seconds.
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set End PTS time of recognized segment in seconds.
     * @param EndPtsTime End PTS time of recognized segment in seconds.
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get Confidence of recognized segment. Value range: 0–100. 
     * @return Confidence Confidence of recognized segment. Value range: 0–100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of recognized segment. Value range: 0–100.
     * @param Confidence Confidence of recognized segment. Value range: 0–100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Zone coordinates of recognition result. The array contains four elements: [x1,y1,x2,y2], i.e., the horizontal and vertical coordinates of the top-left and bottom-right corners. 
     * @return AreaCoordSet Zone coordinates of recognition result. The array contains four elements: [x1,y1,x2,y2], i.e., the horizontal and vertical coordinates of the top-left and bottom-right corners.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Zone coordinates of recognition result. The array contains four elements: [x1,y1,x2,y2], i.e., the horizontal and vertical coordinates of the top-left and bottom-right corners.
     * @param AreaCoordSet Zone coordinates of recognition result. The array contains four elements: [x1,y1,x2,y2], i.e., the horizontal and vertical coordinates of the top-left and bottom-right corners.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}


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

public class WorkflowTask extends AbstractModel{

    /**
    * Video processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Disused. Please use `ErrCode` of each specific task.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Disused. Please use `Message` of each specific task.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Information of a target file of video processing.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * Execution status and result of a video processing task.
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * Execution status and result of a video content audit task.
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * Execution status and result of video content analysis task.
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * Execution status and result of a video content recognition task.
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
     * Get Video processing task ID. 
     * @return TaskId Video processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Video processing task ID.
     * @param TaskId Video processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li> 
     * @return Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     * @param Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Disused. Please use `ErrCode` of each specific task. 
     * @return ErrCode Disused. Please use `ErrCode` of each specific task.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Disused. Please use `ErrCode` of each specific task.
     * @param ErrCode Disused. Please use `ErrCode` of each specific task.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Disused. Please use `Message` of each specific task. 
     * @return Message Disused. Please use `Message` of each specific task.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Disused. Please use `Message` of each specific task.
     * @param Message Disused. Please use `Message` of each specific task.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Information of a target file of video processing.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputInfo Information of a target file of video processing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set Information of a target file of video processing.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputInfo Information of a target file of video processing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaData Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaData Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get Execution status and result of a video processing task. 
     * @return MediaProcessResultSet Execution status and result of a video processing task.
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set Execution status and result of a video processing task.
     * @param MediaProcessResultSet Execution status and result of a video processing task.
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get Execution status and result of a video content audit task. 
     * @return AiContentReviewResultSet Execution status and result of a video content audit task.
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set Execution status and result of a video content audit task.
     * @param AiContentReviewResultSet Execution status and result of a video content audit task.
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get Execution status and result of video content analysis task. 
     * @return AiAnalysisResultSet Execution status and result of video content analysis task.
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set Execution status and result of video content analysis task.
     * @param AiAnalysisResultSet Execution status and result of video content analysis task.
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get Execution status and result of a video content recognition task. 
     * @return AiRecognitionResultSet Execution status and result of a video content recognition task.
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set Execution status and result of a video content recognition task.
     * @param AiRecognitionResultSet Execution status and result of a video content recognition task.
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "MediaProcessResultSet.", this.MediaProcessResultSet);
        this.setParamArrayObj(map, prefix + "AiContentReviewResultSet.", this.AiContentReviewResultSet);
        this.setParamArrayObj(map, prefix + "AiAnalysisResultSet.", this.AiAnalysisResultSet);
        this.setParamArrayObj(map, prefix + "AiRecognitionResultSet.", this.AiRecognitionResultSet);

    }
}


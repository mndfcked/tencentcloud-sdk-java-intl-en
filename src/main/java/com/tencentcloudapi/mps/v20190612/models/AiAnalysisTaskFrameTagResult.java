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

public class AiAnalysisTaskFrameTagResult extends AbstractModel{

    /**
    * Task status. Valid values: PROCESSING, SUCCESS, FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. An empty string indicates the task is successful; otherwise it is failed. For details about the values, see [Error Code List](https://intl.cloud.tencent.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Input of intelligent frame-specific tagging task.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskFrameTagInput Input;

    /**
    * Output of intelligent frame-specific tagging task.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskFrameTagOutput Output;

    /**
     * Get Task status. Valid values: PROCESSING, SUCCESS, FAIL. 
     * @return Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     * @param Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. An empty string indicates the task is successful; otherwise it is failed. For details about the values, see [Error Code List](https://intl.cloud.tencent.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81). 
     * @return ErrCodeExt Error code. An empty string indicates the task is successful; otherwise it is failed. For details about the values, see [Error Code List](https://intl.cloud.tencent.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates the task is successful; otherwise it is failed. For details about the values, see [Error Code List](https://intl.cloud.tencent.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     * @param ErrCodeExt Error code. An empty string indicates the task is successful; otherwise it is failed. For details about the values, see [Error Code List](https://intl.cloud.tencent.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt. 
     * @return ErrCode Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
     * @param ErrCode Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Input of intelligent frame-specific tagging task. 
     * @return Input Input of intelligent frame-specific tagging task.
     */
    public AiAnalysisTaskFrameTagInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of intelligent frame-specific tagging task.
     * @param Input Input of intelligent frame-specific tagging task.
     */
    public void setInput(AiAnalysisTaskFrameTagInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of intelligent frame-specific tagging task. 
     * @return Output Output of intelligent frame-specific tagging task.
     */
    public AiAnalysisTaskFrameTagOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of intelligent frame-specific tagging task.
     * @param Output Output of intelligent frame-specific tagging task.
     */
    public void setOutput(AiAnalysisTaskFrameTagOutput Output) {
        this.Output = Output;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}


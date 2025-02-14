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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmNoticeRequest extends AbstractModel{

    /**
    * Module name. Enter "monitor" here
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Notification template name, which can contain up to 60 characters
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
    */
    @SerializedName("NoticeType")
    @Expose
    private String NoticeType;

    /**
    * Notification language. Valid values: zh-CN (Chinese), en-US (English)
    */
    @SerializedName("NoticeLanguage")
    @Expose
    private String NoticeLanguage;

    /**
    * User notifications (up to 5)
    */
    @SerializedName("UserNotices")
    @Expose
    private UserNotice [] UserNotices;

    /**
    * Callback notifications (up to 3)
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
     * Get Module name. Enter "monitor" here 
     * @return Module Module name. Enter "monitor" here
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module name. Enter "monitor" here
     * @param Module Module name. Enter "monitor" here
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Notification template name, which can contain up to 60 characters 
     * @return Name Notification template name, which can contain up to 60 characters
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Notification template name, which can contain up to 60 characters
     * @param Name Notification template name, which can contain up to 60 characters
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms) 
     * @return NoticeType Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
     */
    public String getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
     * @param NoticeType Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
     */
    public void setNoticeType(String NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get Notification language. Valid values: zh-CN (Chinese), en-US (English) 
     * @return NoticeLanguage Notification language. Valid values: zh-CN (Chinese), en-US (English)
     */
    public String getNoticeLanguage() {
        return this.NoticeLanguage;
    }

    /**
     * Set Notification language. Valid values: zh-CN (Chinese), en-US (English)
     * @param NoticeLanguage Notification language. Valid values: zh-CN (Chinese), en-US (English)
     */
    public void setNoticeLanguage(String NoticeLanguage) {
        this.NoticeLanguage = NoticeLanguage;
    }

    /**
     * Get User notifications (up to 5) 
     * @return UserNotices User notifications (up to 5)
     */
    public UserNotice [] getUserNotices() {
        return this.UserNotices;
    }

    /**
     * Set User notifications (up to 5)
     * @param UserNotices User notifications (up to 5)
     */
    public void setUserNotices(UserNotice [] UserNotices) {
        this.UserNotices = UserNotices;
    }

    /**
     * Get Callback notifications (up to 3) 
     * @return URLNotices Callback notifications (up to 3)
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set Callback notifications (up to 3)
     * @param URLNotices Callback notifications (up to 3)
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NoticeType", this.NoticeType);
        this.setParamSimple(map, prefix + "NoticeLanguage", this.NoticeLanguage);
        this.setParamArrayObj(map, prefix + "UserNotices.", this.UserNotices);
        this.setParamArrayObj(map, prefix + "URLNotices.", this.URLNotices);

    }
}


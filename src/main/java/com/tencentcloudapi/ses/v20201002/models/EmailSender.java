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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmailSender extends AbstractModel{

    /**
    * Sender address.
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * Sender name.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EmailSenderName")
    @Expose
    private String EmailSenderName;

    /**
    * Creation time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTimestamp")
    @Expose
    private Long CreatedTimestamp;

    /**
     * Get Sender address. 
     * @return EmailAddress Sender address.
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set Sender address.
     * @param EmailAddress Sender address.
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get Sender name.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EmailSenderName Sender name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEmailSenderName() {
        return this.EmailSenderName;
    }

    /**
     * Set Sender name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EmailSenderName Sender name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEmailSenderName(String EmailSenderName) {
        this.EmailSenderName = EmailSenderName;
    }

    /**
     * Get Creation time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CreatedTimestamp Creation time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getCreatedTimestamp() {
        return this.CreatedTimestamp;
    }

    /**
     * Set Creation time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CreatedTimestamp Creation time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreatedTimestamp(Long CreatedTimestamp) {
        this.CreatedTimestamp = CreatedTimestamp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "EmailSenderName", this.EmailSenderName);
        this.setParamSimple(map, prefix + "CreatedTimestamp", this.CreatedTimestamp);

    }
}


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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnIpHistory extends AbstractModel{

    /**
    * Node status. `online`: activated; `offline`: deactivated
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Operation time. If its value is `null`, it means there is no status change record.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Datetime")
    @Expose
    private String Datetime;

    /**
     * Get Node status. `online`: activated; `offline`: deactivated 
     * @return Status Node status. `online`: activated; `offline`: deactivated
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status. `online`: activated; `offline`: deactivated
     * @param Status Node status. `online`: activated; `offline`: deactivated
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Operation time. If its value is `null`, it means there is no status change record.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Datetime Operation time. If its value is `null`, it means there is no status change record.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatetime() {
        return this.Datetime;
    }

    /**
     * Set Operation time. If its value is `null`, it means there is no status change record.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Datetime Operation time. If its value is `null`, it means there is no status change record.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatetime(String Datetime) {
        this.Datetime = Datetime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Datetime", this.Datetime);

    }
}


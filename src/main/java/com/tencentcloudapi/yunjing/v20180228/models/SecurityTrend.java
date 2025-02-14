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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityTrend extends AbstractModel{

    /**
    * Event time.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Number of events.
    */
    @SerializedName("EventNum")
    @Expose
    private Long EventNum;

    /**
     * Get Event time. 
     * @return Date Event time.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Event time.
     * @param Date Event time.
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Number of events. 
     * @return EventNum Number of events.
     */
    public Long getEventNum() {
        return this.EventNum;
    }

    /**
     * Set Number of events.
     * @param EventNum Number of events.
     */
    public void setEventNum(Long EventNum) {
        this.EventNum = EventNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "EventNum", this.EventNum);

    }
}


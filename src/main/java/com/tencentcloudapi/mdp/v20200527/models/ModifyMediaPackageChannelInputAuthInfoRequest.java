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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaPackageChannelInputAuthInfoRequest extends AbstractModel{

    /**
    * Channel ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Channel input URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Authentication configuration type. Valid values: CLOSE, UPDATE.
CLOSE: disable authentication.
UPDATE: update authentication.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get Channel ID. 
     * @return Id Channel ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel ID.
     * @param Id Channel ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Channel input URL. 
     * @return Url Channel input URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Channel input URL.
     * @param Url Channel input URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Authentication configuration type. Valid values: CLOSE, UPDATE.
CLOSE: disable authentication.
UPDATE: update authentication. 
     * @return ActionType Authentication configuration type. Valid values: CLOSE, UPDATE.
CLOSE: disable authentication.
UPDATE: update authentication.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Authentication configuration type. Valid values: CLOSE, UPDATE.
CLOSE: disable authentication.
UPDATE: update authentication.
     * @param ActionType Authentication configuration type. Valid values: CLOSE, UPDATE.
CLOSE: disable authentication.
UPDATE: update authentication.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}


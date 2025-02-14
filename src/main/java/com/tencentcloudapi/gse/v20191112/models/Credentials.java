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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Credentials extends AbstractModel{

    /**
    * SSH private key
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get SSH private key 
     * @return Secret SSH private key
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set SSH private key
     * @param Secret SSH private key
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}


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

public class HistoryAccount extends AbstractModel{

    /**
    * Unique ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWP agent `Uuid`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Private IP of server.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Account name.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Account change type.
<li>CREATE: creates account</li>
<li>MODIFY: modifies account</li>
<li>DELETE: deletes account</li>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * Change time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Unique ID. 
     * @return Id Unique ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID.
     * @param Id Unique ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWP agent `Uuid`. 
     * @return Uuid CWP agent `Uuid`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `Uuid`.
     * @param Uuid CWP agent `Uuid`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Private IP of server. 
     * @return MachineIp Private IP of server.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP of server.
     * @param MachineIp Private IP of server.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Server name. 
     * @return MachineName Server name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name.
     * @param MachineName Server name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Account name. 
     * @return Username Account name.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Account name.
     * @param Username Account name.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Account change type.
<li>CREATE: creates account</li>
<li>MODIFY: modifies account</li>
<li>DELETE: deletes account</li> 
     * @return ModifyType Account change type.
<li>CREATE: creates account</li>
<li>MODIFY: modifies account</li>
<li>DELETE: deletes account</li>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Account change type.
<li>CREATE: creates account</li>
<li>MODIFY: modifies account</li>
<li>DELETE: deletes account</li>
     * @param ModifyType Account change type.
<li>CREATE: creates account</li>
<li>MODIFY: modifies account</li>
<li>DELETE: deletes account</li>
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get Change time. 
     * @return ModifyTime Change time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Change time.
     * @param ModifyTime Change time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}


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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceConfigResponse extends AbstractModel{

    /**
    * Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * Instance AZ information in the format of "ap-shanghai-1".
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Configurations of the replica node
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveConfig")
    @Expose
    private SlaveConfig SlaveConfig;

    /**
    * Configurations of the second replica node of a strong-sync instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupConfig")
    @Expose
    private BackupConfig BackupConfig;

    /**
    * This parameter is only available for multi-AZ instances. It indicates whether the source AZ is the same as the one specified upon purchase. `true`: not the same, `false`: the same.
    */
    @SerializedName("Switched")
    @Expose
    private Boolean Switched;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication). 
     * @return ProtectMode Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
     * @param ProtectMode Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ) 
     * @return DeployMode Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     * @param DeployMode Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Instance AZ information in the format of "ap-shanghai-1". 
     * @return Zone Instance AZ information in the format of "ap-shanghai-1".
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ information in the format of "ap-shanghai-1".
     * @param Zone Instance AZ information in the format of "ap-shanghai-1".
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Configurations of the replica node
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SlaveConfig Configurations of the replica node
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public SlaveConfig getSlaveConfig() {
        return this.SlaveConfig;
    }

    /**
     * Set Configurations of the replica node
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SlaveConfig Configurations of the replica node
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSlaveConfig(SlaveConfig SlaveConfig) {
        this.SlaveConfig = SlaveConfig;
    }

    /**
     * Get Configurations of the second replica node of a strong-sync instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return BackupConfig Configurations of the second replica node of a strong-sync instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public BackupConfig getBackupConfig() {
        return this.BackupConfig;
    }

    /**
     * Set Configurations of the second replica node of a strong-sync instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param BackupConfig Configurations of the second replica node of a strong-sync instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setBackupConfig(BackupConfig BackupConfig) {
        this.BackupConfig = BackupConfig;
    }

    /**
     * Get This parameter is only available for multi-AZ instances. It indicates whether the source AZ is the same as the one specified upon purchase. `true`: not the same, `false`: the same. 
     * @return Switched This parameter is only available for multi-AZ instances. It indicates whether the source AZ is the same as the one specified upon purchase. `true`: not the same, `false`: the same.
     */
    public Boolean getSwitched() {
        return this.Switched;
    }

    /**
     * Set This parameter is only available for multi-AZ instances. It indicates whether the source AZ is the same as the one specified upon purchase. `true`: not the same, `false`: the same.
     * @param Switched This parameter is only available for multi-AZ instances. It indicates whether the source AZ is the same as the one specified upon purchase. `true`: not the same, `false`: the same.
     */
    public void setSwitched(Boolean Switched) {
        this.Switched = Switched;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "SlaveConfig.", this.SlaveConfig);
        this.setParamObj(map, prefix + "BackupConfig.", this.BackupConfig);
        this.setParamSimple(map, prefix + "Switched", this.Switched);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


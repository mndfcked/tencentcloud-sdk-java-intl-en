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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupRequest extends AbstractModel{

    /**
    * Backup policy (0: instance backup, 1: multi-database backup)
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * List of names of databases to be backed up (required only for multi-database backup)
    */
    @SerializedName("DBNames")
    @Expose
    private String [] DBNames;

    /**
    * Instance ID in the format of mssql-i1z41iwd
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup name. If this parameter is left empty, a backup name in the format of "[Instance ID]_[Backup start timestamp]" will be automatically generated.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get Backup policy (0: instance backup, 1: multi-database backup) 
     * @return Strategy Backup policy (0: instance backup, 1: multi-database backup)
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Backup policy (0: instance backup, 1: multi-database backup)
     * @param Strategy Backup policy (0: instance backup, 1: multi-database backup)
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get List of names of databases to be backed up (required only for multi-database backup) 
     * @return DBNames List of names of databases to be backed up (required only for multi-database backup)
     */
    public String [] getDBNames() {
        return this.DBNames;
    }

    /**
     * Set List of names of databases to be backed up (required only for multi-database backup)
     * @param DBNames List of names of databases to be backed up (required only for multi-database backup)
     */
    public void setDBNames(String [] DBNames) {
        this.DBNames = DBNames;
    }

    /**
     * Get Instance ID in the format of mssql-i1z41iwd 
     * @return InstanceId Instance ID in the format of mssql-i1z41iwd
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-i1z41iwd
     * @param InstanceId Instance ID in the format of mssql-i1z41iwd
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup name. If this parameter is left empty, a backup name in the format of "[Instance ID]_[Backup start timestamp]" will be automatically generated. 
     * @return BackupName Backup name. If this parameter is left empty, a backup name in the format of "[Instance ID]_[Backup start timestamp]" will be automatically generated.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Backup name. If this parameter is left empty, a backup name in the format of "[Instance ID]_[Backup start timestamp]" will be automatically generated.
     * @param BackupName Backup name. If this parameter is left empty, a backup name in the format of "[Instance ID]_[Backup start timestamp]" will be automatically generated.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamArraySimple(map, prefix + "DBNames.", this.DBNames);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}


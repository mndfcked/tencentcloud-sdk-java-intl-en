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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotInfoNew extends AbstractModel{

    /**
    * The ID of the table group where the table resides
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Snapshot name
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Snapshot expiration time
    */
    @SerializedName("SnapshotDeadTime")
    @Expose
    private String SnapshotDeadTime;

    /**
     * Get The ID of the table group where the table resides 
     * @return TableGroupId The ID of the table group where the table resides
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set The ID of the table group where the table resides
     * @param TableGroupId The ID of the table group where the table resides
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Snapshot name 
     * @return SnapshotName Snapshot name
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name
     * @param SnapshotName Snapshot name
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Snapshot expiration time 
     * @return SnapshotDeadTime Snapshot expiration time
     */
    public String getSnapshotDeadTime() {
        return this.SnapshotDeadTime;
    }

    /**
     * Set Snapshot expiration time
     * @param SnapshotDeadTime Snapshot expiration time
     */
    public void setSnapshotDeadTime(String SnapshotDeadTime) {
        this.SnapshotDeadTime = SnapshotDeadTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotDeadTime", this.SnapshotDeadTime);

    }
}


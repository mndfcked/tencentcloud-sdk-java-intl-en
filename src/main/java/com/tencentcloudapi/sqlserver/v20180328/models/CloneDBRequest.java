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

public class CloneDBRequest extends AbstractModel{

    /**
    * Instance ID in the format of mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Clone and rename the databases specified in `ReNameRestoreDatabase`. Please note that the clones must be renamed.
    */
    @SerializedName("RenameRestore")
    @Expose
    private RenameRestoreDatabase [] RenameRestore;

    /**
     * Get Instance ID in the format of mssql-j8kv137v 
     * @return InstanceId Instance ID in the format of mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-j8kv137v
     * @param InstanceId Instance ID in the format of mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Clone and rename the databases specified in `ReNameRestoreDatabase`. Please note that the clones must be renamed. 
     * @return RenameRestore Clone and rename the databases specified in `ReNameRestoreDatabase`. Please note that the clones must be renamed.
     */
    public RenameRestoreDatabase [] getRenameRestore() {
        return this.RenameRestore;
    }

    /**
     * Set Clone and rename the databases specified in `ReNameRestoreDatabase`. Please note that the clones must be renamed.
     * @param RenameRestore Clone and rename the databases specified in `ReNameRestoreDatabase`. Please note that the clones must be renamed.
     */
    public void setRenameRestore(RenameRestoreDatabase [] RenameRestore) {
        this.RenameRestore = RenameRestore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "RenameRestore.", this.RenameRestore);

    }
}


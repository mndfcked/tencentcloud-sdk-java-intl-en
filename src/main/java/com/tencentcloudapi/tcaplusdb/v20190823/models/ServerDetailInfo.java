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

public class ServerDetailInfo extends AbstractModel{

    /**
    * The unique ID of the storage layer (tcapsvr)
    */
    @SerializedName("ServerUid")
    @Expose
    private String ServerUid;

    /**
    * Machine type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Memory utilization
    */
    @SerializedName("MemoryRate")
    @Expose
    private Long MemoryRate;

    /**
    * Disk utilization
    */
    @SerializedName("DiskRate")
    @Expose
    private Long DiskRate;

    /**
    * The number of reads
    */
    @SerializedName("ReadNum")
    @Expose
    private Long ReadNum;

    /**
    * The number of writes
    */
    @SerializedName("WriteNum")
    @Expose
    private Long WriteNum;

    /**
     * Get The unique ID of the storage layer (tcapsvr) 
     * @return ServerUid The unique ID of the storage layer (tcapsvr)
     */
    public String getServerUid() {
        return this.ServerUid;
    }

    /**
     * Set The unique ID of the storage layer (tcapsvr)
     * @param ServerUid The unique ID of the storage layer (tcapsvr)
     */
    public void setServerUid(String ServerUid) {
        this.ServerUid = ServerUid;
    }

    /**
     * Get Machine type 
     * @return MachineType Machine type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine type
     * @param MachineType Machine type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Memory utilization 
     * @return MemoryRate Memory utilization
     */
    public Long getMemoryRate() {
        return this.MemoryRate;
    }

    /**
     * Set Memory utilization
     * @param MemoryRate Memory utilization
     */
    public void setMemoryRate(Long MemoryRate) {
        this.MemoryRate = MemoryRate;
    }

    /**
     * Get Disk utilization 
     * @return DiskRate Disk utilization
     */
    public Long getDiskRate() {
        return this.DiskRate;
    }

    /**
     * Set Disk utilization
     * @param DiskRate Disk utilization
     */
    public void setDiskRate(Long DiskRate) {
        this.DiskRate = DiskRate;
    }

    /**
     * Get The number of reads 
     * @return ReadNum The number of reads
     */
    public Long getReadNum() {
        return this.ReadNum;
    }

    /**
     * Set The number of reads
     * @param ReadNum The number of reads
     */
    public void setReadNum(Long ReadNum) {
        this.ReadNum = ReadNum;
    }

    /**
     * Get The number of writes 
     * @return WriteNum The number of writes
     */
    public Long getWriteNum() {
        return this.WriteNum;
    }

    /**
     * Set The number of writes
     * @param WriteNum The number of writes
     */
    public void setWriteNum(Long WriteNum) {
        this.WriteNum = WriteNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerUid", this.ServerUid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MemoryRate", this.MemoryRate);
        this.setParamSimple(map, prefix + "DiskRate", this.DiskRate);
        this.setParamSimple(map, prefix + "ReadNum", this.ReadNum);
        this.setParamSimple(map, prefix + "WriteNum", this.WriteNum);

    }
}


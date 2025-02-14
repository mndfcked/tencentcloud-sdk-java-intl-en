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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMailProfileRequest extends AbstractModel{

    /**
    * Email configurations
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
    * Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). For database inspection report, it should be `User`; and for scheduled task reports, it should be `Instance`.
    */
    @SerializedName("ProfileLevel")
    @Expose
    private String ProfileLevel;

    /**
    * Configuration name, which needs to be unique. For database inspection reports, this name can be customize as needed. For scheduled task reports, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance ID bound to the configuration, which is set when the configuration level is "Instance". Only one instance can be bound at a time.
    */
    @SerializedName("BindInstanceIds")
    @Expose
    private String [] BindInstanceIds;

    /**
     * Get Email configurations 
     * @return ProfileInfo Email configurations
     */
    public ProfileInfo getProfileInfo() {
        return this.ProfileInfo;
    }

    /**
     * Set Email configurations
     * @param ProfileInfo Email configurations
     */
    public void setProfileInfo(ProfileInfo ProfileInfo) {
        this.ProfileInfo = ProfileInfo;
    }

    /**
     * Get Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). For database inspection report, it should be `User`; and for scheduled task reports, it should be `Instance`. 
     * @return ProfileLevel Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). For database inspection report, it should be `User`; and for scheduled task reports, it should be `Instance`.
     */
    public String getProfileLevel() {
        return this.ProfileLevel;
    }

    /**
     * Set Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). For database inspection report, it should be `User`; and for scheduled task reports, it should be `Instance`.
     * @param ProfileLevel Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). For database inspection report, it should be `User`; and for scheduled task reports, it should be `Instance`.
     */
    public void setProfileLevel(String ProfileLevel) {
        this.ProfileLevel = ProfileLevel;
    }

    /**
     * Get Configuration name, which needs to be unique. For database inspection reports, this name can be customize as needed. For scheduled task reports, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test". 
     * @return ProfileName Configuration name, which needs to be unique. For database inspection reports, this name can be customize as needed. For scheduled task reports, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set Configuration name, which needs to be unique. For database inspection reports, this name can be customize as needed. For scheduled task reports, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     * @param ProfileName Configuration name, which needs to be unique. For database inspection reports, this name can be customize as needed. For scheduled task reports, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report). 
     * @return ProfileType Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     * @param ProfileType Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)). 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Instance ID bound to the configuration, which is set when the configuration level is "Instance". Only one instance can be bound at a time. 
     * @return BindInstanceIds Instance ID bound to the configuration, which is set when the configuration level is "Instance". Only one instance can be bound at a time.
     */
    public String [] getBindInstanceIds() {
        return this.BindInstanceIds;
    }

    /**
     * Set Instance ID bound to the configuration, which is set when the configuration level is "Instance". Only one instance can be bound at a time.
     * @param BindInstanceIds Instance ID bound to the configuration, which is set when the configuration level is "Instance". Only one instance can be bound at a time.
     */
    public void setBindInstanceIds(String [] BindInstanceIds) {
        this.BindInstanceIds = BindInstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProfileInfo.", this.ProfileInfo);
        this.setParamSimple(map, prefix + "ProfileLevel", this.ProfileLevel);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "BindInstanceIds.", this.BindInstanceIds);

    }
}


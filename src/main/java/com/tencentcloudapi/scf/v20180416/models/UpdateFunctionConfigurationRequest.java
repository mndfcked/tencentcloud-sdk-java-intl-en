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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFunctionConfigurationRequest extends AbstractModel{

    /**
    * Name of the function to be modified
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3,072 MB in increments of 128 MB.
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Go1, Java8, CustomRuntime
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Function environment variable
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function VPC configuration
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * Role bound to the function
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * CLS logset ID to which logs are shipped
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * CLS Topic ID to which logs are shipped
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * It specifies whether to synchronously publish a new version during the update. The default value is `FALSE`, indicating not to publish a new version
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * Whether to enable L5 access. TRUE: enable; FALSE: not enable
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionSimple [] Layers;

    /**
    * Information of a dead letter queue associated with a function
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
    * Public network access configuration
    */
    @SerializedName("PublicNetConfig")
    @Expose
    private PublicNetConfigIn PublicNetConfig;

    /**
    * File system configuration input parameter, which is used for the function to bind the CFS file system
    */
    @SerializedName("CfsConfig")
    @Expose
    private CfsConfig CfsConfig;

    /**
    * Timeout period for function initialization. Default value: 15 seconds
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
     * Get Name of the function to be modified 
     * @return FunctionName Name of the function to be modified
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the function to be modified
     * @param FunctionName Name of the function to be modified
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters. 
     * @return Description Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     * @param Description Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3,072 MB in increments of 128 MB. 
     * @return MemorySize Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3,072 MB in increments of 128 MB.
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3,072 MB in increments of 128 MB.
     * @param MemorySize Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3,072 MB in increments of 128 MB.
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds 
     * @return Timeout Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
     * @param Timeout Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Go1, Java8, CustomRuntime 
     * @return Runtime Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Go1, Java8, CustomRuntime
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Go1, Java8, CustomRuntime
     * @param Runtime Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Go1, Java8, CustomRuntime
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Function environment variable 
     * @return Environment Function environment variable
     */
    public Environment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Function environment variable
     * @param Environment Function environment variable
     */
    public void setEnvironment(Environment Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Function namespace 
     * @return Namespace Function namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace
     * @param Namespace Function namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function VPC configuration 
     * @return VpcConfig Function VPC configuration
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set Function VPC configuration
     * @param VpcConfig Function VPC configuration
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get Role bound to the function 
     * @return Role Role bound to the function
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role bound to the function
     * @param Role Role bound to the function
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get CLS logset ID to which logs are shipped 
     * @return ClsLogsetId CLS logset ID to which logs are shipped
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set CLS logset ID to which logs are shipped
     * @param ClsLogsetId CLS logset ID to which logs are shipped
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get CLS Topic ID to which logs are shipped 
     * @return ClsTopicId CLS Topic ID to which logs are shipped
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set CLS Topic ID to which logs are shipped
     * @param ClsTopicId CLS Topic ID to which logs are shipped
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get It specifies whether to synchronously publish a new version during the update. The default value is `FALSE`, indicating not to publish a new version 
     * @return Publish It specifies whether to synchronously publish a new version during the update. The default value is `FALSE`, indicating not to publish a new version
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * Set It specifies whether to synchronously publish a new version during the update. The default value is `FALSE`, indicating not to publish a new version
     * @param Publish It specifies whether to synchronously publish a new version during the update. The default value is `FALSE`, indicating not to publish a new version
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    /**
     * Get Whether to enable L5 access. TRUE: enable; FALSE: not enable 
     * @return L5Enable Whether to enable L5 access. TRUE: enable; FALSE: not enable
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set Whether to enable L5 access. TRUE: enable; FALSE: not enable
     * @param L5Enable Whether to enable L5 access. TRUE: enable; FALSE: not enable
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list.  
     * @return Layers List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
     */
    public LayerVersionSimple [] getLayers() {
        return this.Layers;
    }

    /**
     * Set List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
     * @param Layers List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
     */
    public void setLayers(LayerVersionSimple [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get Information of a dead letter queue associated with a function 
     * @return DeadLetterConfig Information of a dead letter queue associated with a function
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set Information of a dead letter queue associated with a function
     * @param DeadLetterConfig Information of a dead letter queue associated with a function
     */
    public void setDeadLetterConfig(DeadLetterConfig DeadLetterConfig) {
        this.DeadLetterConfig = DeadLetterConfig;
    }

    /**
     * Get Public network access configuration 
     * @return PublicNetConfig Public network access configuration
     */
    public PublicNetConfigIn getPublicNetConfig() {
        return this.PublicNetConfig;
    }

    /**
     * Set Public network access configuration
     * @param PublicNetConfig Public network access configuration
     */
    public void setPublicNetConfig(PublicNetConfigIn PublicNetConfig) {
        this.PublicNetConfig = PublicNetConfig;
    }

    /**
     * Get File system configuration input parameter, which is used for the function to bind the CFS file system 
     * @return CfsConfig File system configuration input parameter, which is used for the function to bind the CFS file system
     */
    public CfsConfig getCfsConfig() {
        return this.CfsConfig;
    }

    /**
     * Set File system configuration input parameter, which is used for the function to bind the CFS file system
     * @param CfsConfig File system configuration input parameter, which is used for the function to bind the CFS file system
     */
    public void setCfsConfig(CfsConfig CfsConfig) {
        this.CfsConfig = CfsConfig;
    }

    /**
     * Get Timeout period for function initialization. Default value: 15 seconds 
     * @return InitTimeout Timeout period for function initialization. Default value: 15 seconds
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set Timeout period for function initialization. Default value: 15 seconds
     * @param InitTimeout Timeout period for function initialization. Default value: 15 seconds
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamObj(map, prefix + "CfsConfig.", this.CfsConfig);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);

    }
}


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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListKeyDetailRequest extends AbstractModel{

    /**
    * This parameter has the same meaning of the `Offset` in an SQL query, indicating that this acquisition starts from the "No. Offset value" element of the array arranged in a certain order. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * This parameter has the same meaning of the `Limit` in an SQL query, indicating that up to `Limit` value elements can be obtained in this request. The default value is 10 and the maximum value is 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters by creator role. 0 (default value): the CMK is created by the user; 1: the CMK is created automatically by an authorized Tencent Cloud service.
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * Sorts by CMK creation time. 0: descending; 1: ascending
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Filters by CMK status. 0: all CMKs; 1: CMKs in `Enabled` status only; 2: CMKs in `Disabled` status only; 3: CMKs in `PendingDelete` status only (i.e., keys with schedule deletion enabled); 4: CMKs in `PendingImport` status only; 5: CMKs in `Archived` status only.
    */
    @SerializedName("KeyState")
    @Expose
    private Long KeyState;

    /**
    * Performs a fuzzy query by `KeyId` or `Alias`
    */
    @SerializedName("SearchKeyAlias")
    @Expose
    private String SearchKeyAlias;

    /**
    * Filters by CMK type. "TENCENT_KMS" indicates to filter CMKs whose key materials are created by KMS; "EXTERNAL" indicates to filter CMKs of `EXTERNAL` type whose key materials are imported by users; "ALL" or empty indicates to filter CMKs of both types. This value is case-sensitive.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Filter by the `KeyUsage` field of CMKs. Valid values: `ALL` (filtering all CMKs), `ENCRYPT_DECRYPT` (it will be used when the parameter is left empty), `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, and `ASYMMETRIC_SIGN_VERIFY_SM2`.
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * Tag filter condition
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get This parameter has the same meaning of the `Offset` in an SQL query, indicating that this acquisition starts from the "No. Offset value" element of the array arranged in a certain order. The default value is 0. 
     * @return Offset This parameter has the same meaning of the `Offset` in an SQL query, indicating that this acquisition starts from the "No. Offset value" element of the array arranged in a certain order. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set This parameter has the same meaning of the `Offset` in an SQL query, indicating that this acquisition starts from the "No. Offset value" element of the array arranged in a certain order. The default value is 0.
     * @param Offset This parameter has the same meaning of the `Offset` in an SQL query, indicating that this acquisition starts from the "No. Offset value" element of the array arranged in a certain order. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get This parameter has the same meaning of the `Limit` in an SQL query, indicating that up to `Limit` value elements can be obtained in this request. The default value is 10 and the maximum value is 200. 
     * @return Limit This parameter has the same meaning of the `Limit` in an SQL query, indicating that up to `Limit` value elements can be obtained in this request. The default value is 10 and the maximum value is 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set This parameter has the same meaning of the `Limit` in an SQL query, indicating that up to `Limit` value elements can be obtained in this request. The default value is 10 and the maximum value is 200.
     * @param Limit This parameter has the same meaning of the `Limit` in an SQL query, indicating that up to `Limit` value elements can be obtained in this request. The default value is 10 and the maximum value is 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters by creator role. 0 (default value): the CMK is created by the user; 1: the CMK is created automatically by an authorized Tencent Cloud service. 
     * @return Role Filters by creator role. 0 (default value): the CMK is created by the user; 1: the CMK is created automatically by an authorized Tencent Cloud service.
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set Filters by creator role. 0 (default value): the CMK is created by the user; 1: the CMK is created automatically by an authorized Tencent Cloud service.
     * @param Role Filters by creator role. 0 (default value): the CMK is created by the user; 1: the CMK is created automatically by an authorized Tencent Cloud service.
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get Sorts by CMK creation time. 0: descending; 1: ascending 
     * @return OrderType Sorts by CMK creation time. 0: descending; 1: ascending
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorts by CMK creation time. 0: descending; 1: ascending
     * @param OrderType Sorts by CMK creation time. 0: descending; 1: ascending
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Filters by CMK status. 0: all CMKs; 1: CMKs in `Enabled` status only; 2: CMKs in `Disabled` status only; 3: CMKs in `PendingDelete` status only (i.e., keys with schedule deletion enabled); 4: CMKs in `PendingImport` status only; 5: CMKs in `Archived` status only. 
     * @return KeyState Filters by CMK status. 0: all CMKs; 1: CMKs in `Enabled` status only; 2: CMKs in `Disabled` status only; 3: CMKs in `PendingDelete` status only (i.e., keys with schedule deletion enabled); 4: CMKs in `PendingImport` status only; 5: CMKs in `Archived` status only.
     */
    public Long getKeyState() {
        return this.KeyState;
    }

    /**
     * Set Filters by CMK status. 0: all CMKs; 1: CMKs in `Enabled` status only; 2: CMKs in `Disabled` status only; 3: CMKs in `PendingDelete` status only (i.e., keys with schedule deletion enabled); 4: CMKs in `PendingImport` status only; 5: CMKs in `Archived` status only.
     * @param KeyState Filters by CMK status. 0: all CMKs; 1: CMKs in `Enabled` status only; 2: CMKs in `Disabled` status only; 3: CMKs in `PendingDelete` status only (i.e., keys with schedule deletion enabled); 4: CMKs in `PendingImport` status only; 5: CMKs in `Archived` status only.
     */
    public void setKeyState(Long KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get Performs a fuzzy query by `KeyId` or `Alias` 
     * @return SearchKeyAlias Performs a fuzzy query by `KeyId` or `Alias`
     */
    public String getSearchKeyAlias() {
        return this.SearchKeyAlias;
    }

    /**
     * Set Performs a fuzzy query by `KeyId` or `Alias`
     * @param SearchKeyAlias Performs a fuzzy query by `KeyId` or `Alias`
     */
    public void setSearchKeyAlias(String SearchKeyAlias) {
        this.SearchKeyAlias = SearchKeyAlias;
    }

    /**
     * Get Filters by CMK type. "TENCENT_KMS" indicates to filter CMKs whose key materials are created by KMS; "EXTERNAL" indicates to filter CMKs of `EXTERNAL` type whose key materials are imported by users; "ALL" or empty indicates to filter CMKs of both types. This value is case-sensitive. 
     * @return Origin Filters by CMK type. "TENCENT_KMS" indicates to filter CMKs whose key materials are created by KMS; "EXTERNAL" indicates to filter CMKs of `EXTERNAL` type whose key materials are imported by users; "ALL" or empty indicates to filter CMKs of both types. This value is case-sensitive.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Filters by CMK type. "TENCENT_KMS" indicates to filter CMKs whose key materials are created by KMS; "EXTERNAL" indicates to filter CMKs of `EXTERNAL` type whose key materials are imported by users; "ALL" or empty indicates to filter CMKs of both types. This value is case-sensitive.
     * @param Origin Filters by CMK type. "TENCENT_KMS" indicates to filter CMKs whose key materials are created by KMS; "EXTERNAL" indicates to filter CMKs of `EXTERNAL` type whose key materials are imported by users; "ALL" or empty indicates to filter CMKs of both types. This value is case-sensitive.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Filter by the `KeyUsage` field of CMKs. Valid values: `ALL` (filtering all CMKs), `ENCRYPT_DECRYPT` (it will be used when the parameter is left empty), `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, and `ASYMMETRIC_SIGN_VERIFY_SM2`. 
     * @return KeyUsage Filter by the `KeyUsage` field of CMKs. Valid values: `ALL` (filtering all CMKs), `ENCRYPT_DECRYPT` (it will be used when the parameter is left empty), `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, and `ASYMMETRIC_SIGN_VERIFY_SM2`.
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set Filter by the `KeyUsage` field of CMKs. Valid values: `ALL` (filtering all CMKs), `ENCRYPT_DECRYPT` (it will be used when the parameter is left empty), `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, and `ASYMMETRIC_SIGN_VERIFY_SM2`.
     * @param KeyUsage Filter by the `KeyUsage` field of CMKs. Valid values: `ALL` (filtering all CMKs), `ENCRYPT_DECRYPT` (it will be used when the parameter is left empty), `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, and `ASYMMETRIC_SIGN_VERIFY_SM2`.
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get Tag filter condition 
     * @return TagFilters Tag filter condition
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filter condition
     * @param TagFilters Tag filter condition
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "SearchKeyAlias", this.SearchKeyAlias);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}


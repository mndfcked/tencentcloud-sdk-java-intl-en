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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpGeolocationInfosRequest extends AbstractModel{

    /**
    * IP addresses to be queried. Both IPv4 and IPv6 addresses are supported.
    */
    @SerializedName("AddressIps")
    @Expose
    private String [] AddressIps;

    /**
    * Fields of the IP addresses to be queried, including `Country`, `Province`, `City`, `Region`, `Isp`, `AsName` and `AsId`
    */
    @SerializedName("Fields")
    @Expose
    private IpField Fields;

    /**
     * Get IP addresses to be queried. Both IPv4 and IPv6 addresses are supported. 
     * @return AddressIps IP addresses to be queried. Both IPv4 and IPv6 addresses are supported.
     */
    public String [] getAddressIps() {
        return this.AddressIps;
    }

    /**
     * Set IP addresses to be queried. Both IPv4 and IPv6 addresses are supported.
     * @param AddressIps IP addresses to be queried. Both IPv4 and IPv6 addresses are supported.
     */
    public void setAddressIps(String [] AddressIps) {
        this.AddressIps = AddressIps;
    }

    /**
     * Get Fields of the IP addresses to be queried, including `Country`, `Province`, `City`, `Region`, `Isp`, `AsName` and `AsId` 
     * @return Fields Fields of the IP addresses to be queried, including `Country`, `Province`, `City`, `Region`, `Isp`, `AsName` and `AsId`
     */
    public IpField getFields() {
        return this.Fields;
    }

    /**
     * Set Fields of the IP addresses to be queried, including `Country`, `Province`, `City`, `Region`, `Isp`, `AsName` and `AsId`
     * @param Fields Fields of the IP addresses to be queried, including `Country`, `Province`, `City`, `Region`, `Isp`, `AsName` and `AsId`
     */
    public void setFields(IpField Fields) {
        this.Fields = Fields;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIps.", this.AddressIps);
        this.setParamObj(map, prefix + "Fields.", this.Fields);

    }
}


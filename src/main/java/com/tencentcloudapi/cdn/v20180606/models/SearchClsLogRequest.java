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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchClsLogRequest extends AbstractModel{

    /**
    * ID of logset to be queried
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * List of IDs of log topics to be queried, separated by commas
    */
    @SerializedName("TopicIds")
    @Expose
    private String TopicIds;

    /**
    * Start time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of logs to be returned at a time. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Connection channel. Default value: cdn
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * Content to be queried. For more information, please visit https://intl.cloud.tencent.com/document/product/614/16982?from_cn_redirect=1
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * This field is used when loading more results. Pass through the last `context` value returned to get more log content. Up to 10,000 logs can be obtained through the cursor. Please narrow down the time range as much as possible.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Sorting by log time. Valid values: asc (ascending), desc (descending). Default value: desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
     * Get ID of logset to be queried 
     * @return LogsetId ID of logset to be queried
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set ID of logset to be queried
     * @param LogsetId ID of logset to be queried
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get List of IDs of log topics to be queried, separated by commas 
     * @return TopicIds List of IDs of log topics to be queried, separated by commas
     */
    public String getTopicIds() {
        return this.TopicIds;
    }

    /**
     * Set List of IDs of log topics to be queried, separated by commas
     * @param TopicIds List of IDs of log topics to be queried, separated by commas
     */
    public void setTopicIds(String TopicIds) {
        this.TopicIds = TopicIds;
    }

    /**
     * Get Start time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS` 
     * @return StartTime Start time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
     * @param StartTime Start time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS` 
     * @return EndTime End time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
     * @param EndTime End time of log to be queried in the format of `YYYY-mm-dd HH:MM:SS`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of logs to be returned at a time. Maximum value: 100 
     * @return Limit Number of logs to be returned at a time. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of logs to be returned at a time. Maximum value: 100
     * @param Limit Number of logs to be returned at a time. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Connection channel. Default value: cdn 
     * @return Channel Connection channel. Default value: cdn
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Connection channel. Default value: cdn
     * @param Channel Connection channel. Default value: cdn
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Content to be queried. For more information, please visit https://intl.cloud.tencent.com/document/product/614/16982?from_cn_redirect=1 
     * @return Query Content to be queried. For more information, please visit https://intl.cloud.tencent.com/document/product/614/16982?from_cn_redirect=1
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Content to be queried. For more information, please visit https://intl.cloud.tencent.com/document/product/614/16982?from_cn_redirect=1
     * @param Query Content to be queried. For more information, please visit https://intl.cloud.tencent.com/document/product/614/16982?from_cn_redirect=1
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get This field is used when loading more results. Pass through the last `context` value returned to get more log content. Up to 10,000 logs can be obtained through the cursor. Please narrow down the time range as much as possible. 
     * @return Context This field is used when loading more results. Pass through the last `context` value returned to get more log content. Up to 10,000 logs can be obtained through the cursor. Please narrow down the time range as much as possible.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set This field is used when loading more results. Pass through the last `context` value returned to get more log content. Up to 10,000 logs can be obtained through the cursor. Please narrow down the time range as much as possible.
     * @param Context This field is used when loading more results. Pass through the last `context` value returned to get more log content. Up to 10,000 logs can be obtained through the cursor. Please narrow down the time range as much as possible.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Sorting by log time. Valid values: asc (ascending), desc (descending). Default value: desc 
     * @return Sort Sorting by log time. Valid values: asc (ascending), desc (descending). Default value: desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting by log time. Valid values: asc (ascending), desc (descending). Default value: desc
     * @param Sort Sorting by log time. Valid values: asc (ascending), desc (descending). Default value: desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicIds", this.TopicIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}


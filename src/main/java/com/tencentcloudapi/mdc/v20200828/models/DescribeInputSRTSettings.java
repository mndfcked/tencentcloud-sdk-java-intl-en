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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInputSRTSettings extends AbstractModel{

    /**
    * Stream ID.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Latency.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receive latency.
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer latency.
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Peer idle timeout period.
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * Decryption key.
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * Key length.
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
     * Get Stream ID. 
     * @return StreamId Stream ID.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream ID.
     * @param StreamId Stream ID.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Latency. 
     * @return Latency Latency.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Latency.
     * @param Latency Latency.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receive latency. 
     * @return RecvLatency Receive latency.
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receive latency.
     * @param RecvLatency Receive latency.
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer latency. 
     * @return PeerLatency Peer latency.
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer latency.
     * @param PeerLatency Peer latency.
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Peer idle timeout period. 
     * @return PeerIdleTimeout Peer idle timeout period.
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Peer idle timeout period.
     * @param PeerIdleTimeout Peer idle timeout period.
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get Decryption key. 
     * @return Passphrase Decryption key.
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set Decryption key.
     * @param Passphrase Decryption key.
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get Key length. 
     * @return PbKeyLen Key length.
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set Key length.
     * @param PbKeyLen Key length.
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "PeerLatency", this.PeerLatency);
        this.setParamSimple(map, prefix + "PeerIdleTimeout", this.PeerIdleTimeout);
        this.setParamSimple(map, prefix + "Passphrase", this.Passphrase);
        this.setParamSimple(map, prefix + "PbKeyLen", this.PbKeyLen);

    }
}


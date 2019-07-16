package com.verzinen.ugm.model.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class RpcActivityForPort8010 {

// was public class Bean {

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("tag.port")
@Expose
private String tagPort;
@SerializedName("tag.Context")
@Expose
private String tagContext;
@SerializedName("tag.NumOpenConnectionsPerUser")
@Expose
private String tagNumOpenConnectionsPerUser;
@SerializedName("tag.Hostname")
@Expose
private String tagHostname;
@SerializedName("ReceivedBytes")
@Expose
private Integer receivedBytes;
@SerializedName("SentBytes")
@Expose
private Integer sentBytes;
@SerializedName("RpcQueueTimeNumOps")
@Expose
private Integer rpcQueueTimeNumOps;
@SerializedName("RpcQueueTimeAvgTime")
@Expose
private Double rpcQueueTimeAvgTime;
@SerializedName("RpcProcessingTimeNumOps")
@Expose
private Integer rpcProcessingTimeNumOps;
@SerializedName("RpcProcessingTimeAvgTime")
@Expose
private Double rpcProcessingTimeAvgTime;
@SerializedName("DeferredRpcProcessingTimeNumOps")
@Expose
private Integer deferredRpcProcessingTimeNumOps;
@SerializedName("DeferredRpcProcessingTimeAvgTime")
@Expose
private Double deferredRpcProcessingTimeAvgTime;
@SerializedName("RpcAuthenticationFailures")
@Expose
private Integer rpcAuthenticationFailures;
@SerializedName("RpcAuthenticationSuccesses")
@Expose
private Integer rpcAuthenticationSuccesses;
@SerializedName("RpcAuthorizationFailures")
@Expose
private Integer rpcAuthorizationFailures;
@SerializedName("RpcAuthorizationSuccesses")
@Expose
private Integer rpcAuthorizationSuccesses;
@SerializedName("RpcClientBackoff")
@Expose
private Integer rpcClientBackoff;
@SerializedName("RpcSlowCalls")
@Expose
private Integer rpcSlowCalls;
@SerializedName("NumOpenConnections")
@Expose
private Integer numOpenConnections;
@SerializedName("CallQueueLength")
@Expose
private Integer callQueueLength;
@SerializedName("NumDroppedConnections")
@Expose
private Integer numDroppedConnections;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getModelerType() {
return modelerType;
}

public void setModelerType(String modelerType) {
this.modelerType = modelerType;
}

public String getTagPort() {
return tagPort;
}

public void setTagPort(String tagPort) {
this.tagPort = tagPort;
}

public String getTagContext() {
return tagContext;
}

public void setTagContext(String tagContext) {
this.tagContext = tagContext;
}

public String getTagNumOpenConnectionsPerUser() {
return tagNumOpenConnectionsPerUser;
}

public void setTagNumOpenConnectionsPerUser(String tagNumOpenConnectionsPerUser) {
this.tagNumOpenConnectionsPerUser = tagNumOpenConnectionsPerUser;
}

public String getTagHostname() {
return tagHostname;
}

public void setTagHostname(String tagHostname) {
this.tagHostname = tagHostname;
}

public Integer getReceivedBytes() {
return receivedBytes;
}

public void setReceivedBytes(Integer receivedBytes) {
this.receivedBytes = receivedBytes;
}

public Integer getSentBytes() {
return sentBytes;
}

public void setSentBytes(Integer sentBytes) {
this.sentBytes = sentBytes;
}

public Integer getRpcQueueTimeNumOps() {
return rpcQueueTimeNumOps;
}

public void setRpcQueueTimeNumOps(Integer rpcQueueTimeNumOps) {
this.rpcQueueTimeNumOps = rpcQueueTimeNumOps;
}

public Double getRpcQueueTimeAvgTime() {
return rpcQueueTimeAvgTime;
}

public void setRpcQueueTimeAvgTime(Double rpcQueueTimeAvgTime) {
this.rpcQueueTimeAvgTime = rpcQueueTimeAvgTime;
}

public Integer getRpcProcessingTimeNumOps() {
return rpcProcessingTimeNumOps;
}

public void setRpcProcessingTimeNumOps(Integer rpcProcessingTimeNumOps) {
this.rpcProcessingTimeNumOps = rpcProcessingTimeNumOps;
}

public Double getRpcProcessingTimeAvgTime() {
return rpcProcessingTimeAvgTime;
}

public void setRpcProcessingTimeAvgTime(Double rpcProcessingTimeAvgTime) {
this.rpcProcessingTimeAvgTime = rpcProcessingTimeAvgTime;
}

public Integer getDeferredRpcProcessingTimeNumOps() {
return deferredRpcProcessingTimeNumOps;
}

public void setDeferredRpcProcessingTimeNumOps(Integer deferredRpcProcessingTimeNumOps) {
this.deferredRpcProcessingTimeNumOps = deferredRpcProcessingTimeNumOps;
}

public Double getDeferredRpcProcessingTimeAvgTime() {
return deferredRpcProcessingTimeAvgTime;
}

public void setDeferredRpcProcessingTimeAvgTime(Double deferredRpcProcessingTimeAvgTime) {
this.deferredRpcProcessingTimeAvgTime = deferredRpcProcessingTimeAvgTime;
}

public Integer getRpcAuthenticationFailures() {
return rpcAuthenticationFailures;
}

public void setRpcAuthenticationFailures(Integer rpcAuthenticationFailures) {
this.rpcAuthenticationFailures = rpcAuthenticationFailures;
}

public Integer getRpcAuthenticationSuccesses() {
return rpcAuthenticationSuccesses;
}

public void setRpcAuthenticationSuccesses(Integer rpcAuthenticationSuccesses) {
this.rpcAuthenticationSuccesses = rpcAuthenticationSuccesses;
}

public Integer getRpcAuthorizationFailures() {
return rpcAuthorizationFailures;
}

public void setRpcAuthorizationFailures(Integer rpcAuthorizationFailures) {
this.rpcAuthorizationFailures = rpcAuthorizationFailures;
}

public Integer getRpcAuthorizationSuccesses() {
return rpcAuthorizationSuccesses;
}

public void setRpcAuthorizationSuccesses(Integer rpcAuthorizationSuccesses) {
this.rpcAuthorizationSuccesses = rpcAuthorizationSuccesses;
}

public Integer getRpcClientBackoff() {
return rpcClientBackoff;
}

public void setRpcClientBackoff(Integer rpcClientBackoff) {
this.rpcClientBackoff = rpcClientBackoff;
}

public Integer getRpcSlowCalls() {
return rpcSlowCalls;
}

public void setRpcSlowCalls(Integer rpcSlowCalls) {
this.rpcSlowCalls = rpcSlowCalls;
}

public Integer getNumOpenConnections() {
return numOpenConnections;
}

public void setNumOpenConnections(Integer numOpenConnections) {
this.numOpenConnections = numOpenConnections;
}

public Integer getCallQueueLength() {
return callQueueLength;
}

public void setCallQueueLength(Integer callQueueLength) {
this.callQueueLength = callQueueLength;
}

public Integer getNumDroppedConnections() {
return numDroppedConnections;
}

public void setNumDroppedConnections(Integer numDroppedConnections) {
this.numDroppedConnections = numDroppedConnections;
}

}

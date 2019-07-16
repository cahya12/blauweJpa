package com.verzinen.ugm.model.error;


//package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BPServiceActor {

@SerializedName("maxDataLength")
@Expose
private String maxDataLength;
@SerializedName("LastHeartbeat")
@Expose
private String lastHeartbeat;
@SerializedName("ActorState")
@Expose
private String actorState;
@SerializedName("NamenodeAddress")
@Expose
private String namenodeAddress;
@SerializedName("BlockPoolID")
@Expose
private String blockPoolID;
@SerializedName("maxBlockReportSize")
@Expose
private String maxBlockReportSize;
@SerializedName("LastBlockReport")
@Expose
private String lastBlockReport;

public String getMaxDataLength() {
return maxDataLength;
}

public void setMaxDataLength(String maxDataLength) {
this.maxDataLength = maxDataLength;
}

public String getLastHeartbeat() {
return lastHeartbeat;
}

public void setLastHeartbeat(String lastHeartbeat) {
this.lastHeartbeat = lastHeartbeat;
}

public String getActorState() {
return actorState;
}

public void setActorState(String actorState) {
this.actorState = actorState;
}

public String getNamenodeAddress() {
return namenodeAddress;
}

public void setNamenodeAddress(String namenodeAddress) {
this.namenodeAddress = namenodeAddress;
}

public String getBlockPoolID() {
return blockPoolID;
}

public void setBlockPoolID(String blockPoolID) {
this.blockPoolID = blockPoolID;
}

public String getMaxBlockReportSize() {
return maxBlockReportSize;
}

public void setMaxBlockReportSize(String maxBlockReportSize) {
this.maxBlockReportSize = maxBlockReportSize;
}

public String getLastBlockReport() {
return lastBlockReport;
}

public void setLastBlockReport(String lastBlockReport) {
this.lastBlockReport = lastBlockReport;
}

}
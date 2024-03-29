package com.verzinen.ugm.model.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JvmMetrics {

//public class Bean {

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("tag.Context")
@Expose
private String tagContext;
@SerializedName("tag.ProcessName")
@Expose
private String tagProcessName;
@SerializedName("tag.SessionId")
@Expose
private Object tagSessionId;
@SerializedName("tag.Hostname")
@Expose
private String tagHostname;
@SerializedName("MemNonHeapUsedM")
@Expose
private Double memNonHeapUsedM;
@SerializedName("MemNonHeapCommittedM")
@Expose
private Double memNonHeapCommittedM;
@SerializedName("MemNonHeapMaxM")
@Expose
private Double memNonHeapMaxM;
@SerializedName("MemHeapUsedM")
@Expose
private Double memHeapUsedM;
@SerializedName("MemHeapCommittedM")
@Expose
private Double memHeapCommittedM;
@SerializedName("MemHeapMaxM")
@Expose
private Double memHeapMaxM;
@SerializedName("MemMaxM")
@Expose
private Double memMaxM;
@SerializedName("GcCountParNew")
@Expose
private Integer gcCountParNew;
@SerializedName("GcTimeMillisParNew")
@Expose
private Integer gcTimeMillisParNew;
@SerializedName("GcCountConcurrentMarkSweep")
@Expose
private Integer gcCountConcurrentMarkSweep;
@SerializedName("GcTimeMillisConcurrentMarkSweep")
@Expose
private Integer gcTimeMillisConcurrentMarkSweep;
@SerializedName("GcCount")
@Expose
private Integer gcCount;
@SerializedName("GcTimeMillis")
@Expose
private Integer gcTimeMillis;
@SerializedName("GcNumWarnThresholdExceeded")
@Expose
private Integer gcNumWarnThresholdExceeded;
@SerializedName("GcNumInfoThresholdExceeded")
@Expose
private Integer gcNumInfoThresholdExceeded;
@SerializedName("GcTotalExtraSleepTime")
@Expose
private Integer gcTotalExtraSleepTime;
@SerializedName("ThreadsNew")
@Expose
private Integer threadsNew;
@SerializedName("ThreadsRunnable")
@Expose
private Integer threadsRunnable;
@SerializedName("ThreadsBlocked")
@Expose
private Integer threadsBlocked;
@SerializedName("ThreadsWaiting")
@Expose
private Integer threadsWaiting;
@SerializedName("ThreadsTimedWaiting")
@Expose
private Integer threadsTimedWaiting;
@SerializedName("ThreadsTerminated")
@Expose
private Integer threadsTerminated;
@SerializedName("LogFatal")
@Expose
private Integer logFatal;
@SerializedName("LogError")
@Expose
private Integer logError;
@SerializedName("LogWarn")
@Expose
private Integer logWarn;
@SerializedName("LogInfo")
@Expose
private Integer logInfo;

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

public String getTagContext() {
return tagContext;
}

public void setTagContext(String tagContext) {
this.tagContext = tagContext;
}

public String getTagProcessName() {
return tagProcessName;
}

public void setTagProcessName(String tagProcessName) {
this.tagProcessName = tagProcessName;
}

public Object getTagSessionId() {
return tagSessionId;
}

public void setTagSessionId(Object tagSessionId) {
this.tagSessionId = tagSessionId;
}

public String getTagHostname() {
return tagHostname;
}

public void setTagHostname(String tagHostname) {
this.tagHostname = tagHostname;
}

public Double getMemNonHeapUsedM() {
return memNonHeapUsedM;
}

public void setMemNonHeapUsedM(Double memNonHeapUsedM) {
this.memNonHeapUsedM = memNonHeapUsedM;
}

public Double getMemNonHeapCommittedM() {
return memNonHeapCommittedM;
}

public void setMemNonHeapCommittedM(Double memNonHeapCommittedM) {
this.memNonHeapCommittedM = memNonHeapCommittedM;
}

public Double getMemNonHeapMaxM() {
return memNonHeapMaxM;
}

public void setMemNonHeapMaxM(Double memNonHeapMaxM) {
this.memNonHeapMaxM = memNonHeapMaxM;
}

public Double getMemHeapUsedM() {
return memHeapUsedM;
}

public void setMemHeapUsedM(Double memHeapUsedM) {
this.memHeapUsedM = memHeapUsedM;
}

public Double getMemHeapCommittedM() {
return memHeapCommittedM;
}

public void setMemHeapCommittedM(Double memHeapCommittedM) {
this.memHeapCommittedM = memHeapCommittedM;
}

public Double getMemHeapMaxM() {
return memHeapMaxM;
}

public void setMemHeapMaxM(Double memHeapMaxM) {
this.memHeapMaxM = memHeapMaxM;
}

public Double getMemMaxM() {
return memMaxM;
}

public void setMemMaxM(Double memMaxM) {
this.memMaxM = memMaxM;
}

public Integer getGcCountParNew() {
return gcCountParNew;
}

public void setGcCountParNew(Integer gcCountParNew) {
this.gcCountParNew = gcCountParNew;
}

public Integer getGcTimeMillisParNew() {
return gcTimeMillisParNew;
}

public void setGcTimeMillisParNew(Integer gcTimeMillisParNew) {
this.gcTimeMillisParNew = gcTimeMillisParNew;
}

public Integer getGcCountConcurrentMarkSweep() {
return gcCountConcurrentMarkSweep;
}

public void setGcCountConcurrentMarkSweep(Integer gcCountConcurrentMarkSweep) {
this.gcCountConcurrentMarkSweep = gcCountConcurrentMarkSweep;
}

public Integer getGcTimeMillisConcurrentMarkSweep() {
return gcTimeMillisConcurrentMarkSweep;
}

public void setGcTimeMillisConcurrentMarkSweep(Integer gcTimeMillisConcurrentMarkSweep) {
this.gcTimeMillisConcurrentMarkSweep = gcTimeMillisConcurrentMarkSweep;
}

public Integer getGcCount() {
return gcCount;
}

public void setGcCount(Integer gcCount) {
this.gcCount = gcCount;
}

public Integer getGcTimeMillis() {
return gcTimeMillis;
}

public void setGcTimeMillis(Integer gcTimeMillis) {
this.gcTimeMillis = gcTimeMillis;
}

public Integer getGcNumWarnThresholdExceeded() {
return gcNumWarnThresholdExceeded;
}

public void setGcNumWarnThresholdExceeded(Integer gcNumWarnThresholdExceeded) {
this.gcNumWarnThresholdExceeded = gcNumWarnThresholdExceeded;
}

public Integer getGcNumInfoThresholdExceeded() {
return gcNumInfoThresholdExceeded;
}

public void setGcNumInfoThresholdExceeded(Integer gcNumInfoThresholdExceeded) {
this.gcNumInfoThresholdExceeded = gcNumInfoThresholdExceeded;
}

public Integer getGcTotalExtraSleepTime() {
return gcTotalExtraSleepTime;
}

public void setGcTotalExtraSleepTime(Integer gcTotalExtraSleepTime) {
this.gcTotalExtraSleepTime = gcTotalExtraSleepTime;
}

public Integer getThreadsNew() {
return threadsNew;
}

public void setThreadsNew(Integer threadsNew) {
this.threadsNew = threadsNew;
}

public Integer getThreadsRunnable() {
return threadsRunnable;
}

public void setThreadsRunnable(Integer threadsRunnable) {
this.threadsRunnable = threadsRunnable;
}

public Integer getThreadsBlocked() {
return threadsBlocked;
}

public void setThreadsBlocked(Integer threadsBlocked) {
this.threadsBlocked = threadsBlocked;
}

public Integer getThreadsWaiting() {
return threadsWaiting;
}

public void setThreadsWaiting(Integer threadsWaiting) {
this.threadsWaiting = threadsWaiting;
}

public Integer getThreadsTimedWaiting() {
return threadsTimedWaiting;
}

public void setThreadsTimedWaiting(Integer threadsTimedWaiting) {
this.threadsTimedWaiting = threadsTimedWaiting;
}

public Integer getThreadsTerminated() {
return threadsTerminated;
}

public void setThreadsTerminated(Integer threadsTerminated) {
this.threadsTerminated = threadsTerminated;
}

public Integer getLogFatal() {
return logFatal;
}

public void setLogFatal(Integer logFatal) {
this.logFatal = logFatal;
}

public Integer getLogError() {
return logError;
}

public void setLogError(Integer logError) {
this.logError = logError;
}

public Integer getLogWarn() {
return logWarn;
}

public void setLogWarn(Integer logWarn) {
this.logWarn = logWarn;
}

public Integer getLogInfo() {
return logInfo;
}

public void setLogInfo(Integer logInfo) {
this.logInfo = logInfo;
}

}

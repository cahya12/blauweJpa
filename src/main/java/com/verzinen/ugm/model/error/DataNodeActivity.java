package com.verzinen.ugm.model.error;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataNodeActivity {



	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("tag.SessionId")
	@Expose
	private Object tagSessionId;
	@SerializedName("tag.Context")
	@Expose
	private String tagContext;
	@SerializedName("tag.Hostname")
	@Expose
	private String tagHostname;
	@SerializedName("BytesWritten")
	@Expose
	private Integer bytesWritten;
	@SerializedName("TotalWriteTime")
	@Expose
	private Integer totalWriteTime;
	@SerializedName("BytesRead")
	@Expose
	private Integer bytesRead;
	@SerializedName("TotalReadTime")
	@Expose
	private Integer totalReadTime;
	@SerializedName("BlocksWritten")
	@Expose
	private Integer blocksWritten;
	@SerializedName("BlocksRead")
	@Expose
	private Integer blocksRead;
	@SerializedName("BlocksReplicated")
	@Expose
	private Integer blocksReplicated;
	@SerializedName("BlocksRemoved")
	@Expose
	private Integer blocksRemoved;
	@SerializedName("BlocksVerified")
	@Expose
	private Integer blocksVerified;
	@SerializedName("BlockVerificationFailures")
	@Expose
	private Integer blockVerificationFailures;
	@SerializedName("BlocksCached")
	@Expose
	private Integer blocksCached;
	@SerializedName("BlocksUncached")
	@Expose
	private Integer blocksUncached;
	@SerializedName("ReadsFromLocalClient")
	@Expose
	private Integer readsFromLocalClient;
	@SerializedName("ReadsFromRemoteClient")
	@Expose
	private Integer readsFromRemoteClient;
	@SerializedName("WritesFromLocalClient")
	@Expose
	private Integer writesFromLocalClient;
	@SerializedName("WritesFromRemoteClient")
	@Expose
	private Integer writesFromRemoteClient;
	@SerializedName("BlocksGetLocalPathInfo")
	@Expose
	private Integer blocksGetLocalPathInfo;
	@SerializedName("RemoteBytesRead")
	@Expose
	private Integer remoteBytesRead;
	@SerializedName("RemoteBytesWritten")
	@Expose
	private Integer remoteBytesWritten;
	@SerializedName("RamDiskBlocksWrite")
	@Expose
	private Integer ramDiskBlocksWrite;
	@SerializedName("RamDiskBlocksWriteFallback")
	@Expose
	private Integer ramDiskBlocksWriteFallback;
	@SerializedName("RamDiskBytesWrite")
	@Expose
	private Integer ramDiskBytesWrite;
	@SerializedName("RamDiskBlocksReadHits")
	@Expose
	private Integer ramDiskBlocksReadHits;
	@SerializedName("RamDiskBlocksEvicted")
	@Expose
	private Integer ramDiskBlocksEvicted;
	@SerializedName("RamDiskBlocksEvictedWithoutRead")
	@Expose
	private Integer ramDiskBlocksEvictedWithoutRead;
	@SerializedName("RamDiskBlocksEvictionWindowMsNumOps")
	@Expose
	private Integer ramDiskBlocksEvictionWindowMsNumOps;
	@SerializedName("RamDiskBlocksEvictionWindowMsAvgTime")
	@Expose
	private Double ramDiskBlocksEvictionWindowMsAvgTime;
	@SerializedName("RamDiskBlocksLazyPersisted")
	@Expose
	private Integer ramDiskBlocksLazyPersisted;
	@SerializedName("RamDiskBlocksDeletedBeforeLazyPersisted")
	@Expose
	private Integer ramDiskBlocksDeletedBeforeLazyPersisted;
	@SerializedName("RamDiskBytesLazyPersisted")
	@Expose
	private Integer ramDiskBytesLazyPersisted;
	@SerializedName("RamDiskBlocksLazyPersistWindowMsNumOps")
	@Expose
	private Integer ramDiskBlocksLazyPersistWindowMsNumOps;
	@SerializedName("RamDiskBlocksLazyPersistWindowMsAvgTime")
	@Expose
	private Double ramDiskBlocksLazyPersistWindowMsAvgTime;
	@SerializedName("FsyncCount")
	@Expose
	private Integer fsyncCount;
	@SerializedName("VolumeFailures")
	@Expose
	private Integer volumeFailures;
	@SerializedName("DatanodeNetworkErrors")
	@Expose
	private Integer datanodeNetworkErrors;
	@SerializedName("DataNodeActiveXceiversCount")
	@Expose
	private Integer dataNodeActiveXceiversCount;
	@SerializedName("ReadBlockOpNumOps")
	@Expose
	private Integer readBlockOpNumOps;
	@SerializedName("ReadBlockOpAvgTime")
	@Expose
	private Double readBlockOpAvgTime;
	@SerializedName("WriteBlockOpNumOps")
	@Expose
	private Integer writeBlockOpNumOps;
	@SerializedName("WriteBlockOpAvgTime")
	@Expose
	private Double writeBlockOpAvgTime;
	@SerializedName("BlockChecksumOpNumOps")
	@Expose
	private Integer blockChecksumOpNumOps;
	@SerializedName("BlockChecksumOpAvgTime")
	@Expose
	private Double blockChecksumOpAvgTime;
	@SerializedName("CopyBlockOpNumOps")
	@Expose
	private Integer copyBlockOpNumOps;
	@SerializedName("CopyBlockOpAvgTime")
	@Expose
	private Double copyBlockOpAvgTime;
	@SerializedName("ReplaceBlockOpNumOps")
	@Expose
	private Integer replaceBlockOpNumOps;
	@SerializedName("ReplaceBlockOpAvgTime")
	@Expose
	private Double replaceBlockOpAvgTime;
	@SerializedName("HeartbeatsNumOps")
	@Expose
	private Integer heartbeatsNumOps;
	@SerializedName("HeartbeatsAvgTime")
	@Expose
	private Double heartbeatsAvgTime;
	@SerializedName("HeartbeatsTotalNumOps")
	@Expose
	private Integer heartbeatsTotalNumOps;
	@SerializedName("HeartbeatsTotalAvgTime")
	@Expose
	private Double heartbeatsTotalAvgTime;
	@SerializedName("LifelinesNumOps")
	@Expose
	private Integer lifelinesNumOps;
	@SerializedName("LifelinesAvgTime")
	@Expose
	private Double lifelinesAvgTime;
	@SerializedName("BlockReportsNumOps")
	@Expose
	private Integer blockReportsNumOps;
	@SerializedName("BlockReportsAvgTime")
	@Expose
	private Double blockReportsAvgTime;
	@SerializedName("IncrementalBlockReportsNumOps")
	@Expose
	private Integer incrementalBlockReportsNumOps;
	@SerializedName("IncrementalBlockReportsAvgTime")
	@Expose
	private Double incrementalBlockReportsAvgTime;
	@SerializedName("CacheReportsNumOps")
	@Expose
	private Integer cacheReportsNumOps;
	@SerializedName("CacheReportsAvgTime")
	@Expose
	private Double cacheReportsAvgTime;
	@SerializedName("PacketAckRoundTripTimeNanosNumOps")
	@Expose
	private Integer packetAckRoundTripTimeNanosNumOps;
	@SerializedName("PacketAckRoundTripTimeNanosAvgTime")
	@Expose
	private Double packetAckRoundTripTimeNanosAvgTime;
	@SerializedName("FlushNanosNumOps")
	@Expose
	private Integer flushNanosNumOps;
	@SerializedName("FlushNanosAvgTime")
	@Expose
	private Double flushNanosAvgTime;
	@SerializedName("FsyncNanosNumOps")
	@Expose
	private Integer fsyncNanosNumOps;
	@SerializedName("FsyncNanosAvgTime")
	@Expose
	private Double fsyncNanosAvgTime;
	@SerializedName("SendDataPacketBlockedOnNetworkNanosNumOps")
	@Expose
	private Integer sendDataPacketBlockedOnNetworkNanosNumOps;
	@SerializedName("SendDataPacketBlockedOnNetworkNanosAvgTime")
	@Expose
	private Double sendDataPacketBlockedOnNetworkNanosAvgTime;
	@SerializedName("SendDataPacketTransferNanosNumOps")
	@Expose
	private Integer sendDataPacketTransferNanosNumOps;
	@SerializedName("SendDataPacketTransferNanosAvgTime")
	@Expose
	private Double sendDataPacketTransferNanosAvgTime;
	@SerializedName("BlocksInPendingIBR")
	@Expose
	private Integer blocksInPendingIBR;
	@SerializedName("BlocksReceivingInPendingIBR")
	@Expose
	private Integer blocksReceivingInPendingIBR;
	@SerializedName("BlocksReceivedInPendingIBR")
	@Expose
	private Integer blocksReceivedInPendingIBR;
	@SerializedName("BlocksDeletedInPendingIBR")
	@Expose
	private Integer blocksDeletedInPendingIBR;
	@SerializedName("EcReconstructionTasks")
	@Expose
	private Integer ecReconstructionTasks;
	@SerializedName("EcFailedReconstructionTasks")
	@Expose
	private Integer ecFailedReconstructionTasks;
	@SerializedName("EcDecodingTimeNanos")
	@Expose
	private Integer ecDecodingTimeNanos;
	@SerializedName("EcReconstructionBytesRead")
	@Expose
	private Integer ecReconstructionBytesRead;
	@SerializedName("EcReconstructionBytesWritten")
	@Expose
	private Integer ecReconstructionBytesWritten;
	@SerializedName("EcReconstructionRemoteBytesRead")
	@Expose
	private Integer ecReconstructionRemoteBytesRead;
	@SerializedName("EcReconstructionReadTimeMillis")
	@Expose
	private Integer ecReconstructionReadTimeMillis;
	@SerializedName("EcReconstructionDecodingTimeMillis")
	@Expose
	private Integer ecReconstructionDecodingTimeMillis;
	@SerializedName("EcReconstructionWriteTimeMillis")
	@Expose
	private Integer ecReconstructionWriteTimeMillis;

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

	public Object getTagSessionId() {
	return tagSessionId;
	}

	public void setTagSessionId(Object tagSessionId) {
	this.tagSessionId = tagSessionId;
	}

	public String getTagContext() {
	return tagContext;
	}

	public void setTagContext(String tagContext) {
	this.tagContext = tagContext;
	}

	public String getTagHostname() {
	return tagHostname;
	}

	public void setTagHostname(String tagHostname) {
	this.tagHostname = tagHostname;
	}

	public Integer getBytesWritten() {
	return bytesWritten;
	}

	public void setBytesWritten(Integer bytesWritten) {
	this.bytesWritten = bytesWritten;
	}

	public Integer getTotalWriteTime() {
	return totalWriteTime;
	}

	public void setTotalWriteTime(Integer totalWriteTime) {
	this.totalWriteTime = totalWriteTime;
	}

	public Integer getBytesRead() {
	return bytesRead;
	}

	public void setBytesRead(Integer bytesRead) {
	this.bytesRead = bytesRead;
	}

	public Integer getTotalReadTime() {
	return totalReadTime;
	}

	public void setTotalReadTime(Integer totalReadTime) {
	this.totalReadTime = totalReadTime;
	}

	public Integer getBlocksWritten() {
	return blocksWritten;
	}

	public void setBlocksWritten(Integer blocksWritten) {
	this.blocksWritten = blocksWritten;
	}

	public Integer getBlocksRead() {
	return blocksRead;
	}

	public void setBlocksRead(Integer blocksRead) {
	this.blocksRead = blocksRead;
	}

	public Integer getBlocksReplicated() {
	return blocksReplicated;
	}

	public void setBlocksReplicated(Integer blocksReplicated) {
	this.blocksReplicated = blocksReplicated;
	}

	public Integer getBlocksRemoved() {
	return blocksRemoved;
	}

	public void setBlocksRemoved(Integer blocksRemoved) {
	this.blocksRemoved = blocksRemoved;
	}

	public Integer getBlocksVerified() {
	return blocksVerified;
	}

	public void setBlocksVerified(Integer blocksVerified) {
	this.blocksVerified = blocksVerified;
	}

	public Integer getBlockVerificationFailures() {
	return blockVerificationFailures;
	}

	public void setBlockVerificationFailures(Integer blockVerificationFailures) {
	this.blockVerificationFailures = blockVerificationFailures;
	}

	public Integer getBlocksCached() {
	return blocksCached;
	}

	public void setBlocksCached(Integer blocksCached) {
	this.blocksCached = blocksCached;
	}

	public Integer getBlocksUncached() {
	return blocksUncached;
	}

	public void setBlocksUncached(Integer blocksUncached) {
	this.blocksUncached = blocksUncached;
	}

	public Integer getReadsFromLocalClient() {
	return readsFromLocalClient;
	}

	public void setReadsFromLocalClient(Integer readsFromLocalClient) {
	this.readsFromLocalClient = readsFromLocalClient;
	}

	public Integer getReadsFromRemoteClient() {
	return readsFromRemoteClient;
	}

	public void setReadsFromRemoteClient(Integer readsFromRemoteClient) {
	this.readsFromRemoteClient = readsFromRemoteClient;
	}

	public Integer getWritesFromLocalClient() {
	return writesFromLocalClient;
	}

	public void setWritesFromLocalClient(Integer writesFromLocalClient) {
	this.writesFromLocalClient = writesFromLocalClient;
	}

	public Integer getWritesFromRemoteClient() {
	return writesFromRemoteClient;
	}

	public void setWritesFromRemoteClient(Integer writesFromRemoteClient) {
	this.writesFromRemoteClient = writesFromRemoteClient;
	}

	public Integer getBlocksGetLocalPathInfo() {
	return blocksGetLocalPathInfo;
	}

	public void setBlocksGetLocalPathInfo(Integer blocksGetLocalPathInfo) {
	this.blocksGetLocalPathInfo = blocksGetLocalPathInfo;
	}

	public Integer getRemoteBytesRead() {
	return remoteBytesRead;
	}

	public void setRemoteBytesRead(Integer remoteBytesRead) {
	this.remoteBytesRead = remoteBytesRead;
	}

	public Integer getRemoteBytesWritten() {
	return remoteBytesWritten;
	}

	public void setRemoteBytesWritten(Integer remoteBytesWritten) {
	this.remoteBytesWritten = remoteBytesWritten;
	}

	public Integer getRamDiskBlocksWrite() {
	return ramDiskBlocksWrite;
	}

	public void setRamDiskBlocksWrite(Integer ramDiskBlocksWrite) {
	this.ramDiskBlocksWrite = ramDiskBlocksWrite;
	}

	public Integer getRamDiskBlocksWriteFallback() {
	return ramDiskBlocksWriteFallback;
	}

	public void setRamDiskBlocksWriteFallback(Integer ramDiskBlocksWriteFallback) {
	this.ramDiskBlocksWriteFallback = ramDiskBlocksWriteFallback;
	}

	public Integer getRamDiskBytesWrite() {
	return ramDiskBytesWrite;
	}

	public void setRamDiskBytesWrite(Integer ramDiskBytesWrite) {
	this.ramDiskBytesWrite = ramDiskBytesWrite;
	}

	public Integer getRamDiskBlocksReadHits() {
	return ramDiskBlocksReadHits;
	}

	public void setRamDiskBlocksReadHits(Integer ramDiskBlocksReadHits) {
	this.ramDiskBlocksReadHits = ramDiskBlocksReadHits;
	}

	public Integer getRamDiskBlocksEvicted() {
	return ramDiskBlocksEvicted;
	}

	public void setRamDiskBlocksEvicted(Integer ramDiskBlocksEvicted) {
	this.ramDiskBlocksEvicted = ramDiskBlocksEvicted;
	}

	public Integer getRamDiskBlocksEvictedWithoutRead() {
	return ramDiskBlocksEvictedWithoutRead;
	}

	public void setRamDiskBlocksEvictedWithoutRead(Integer ramDiskBlocksEvictedWithoutRead) {
	this.ramDiskBlocksEvictedWithoutRead = ramDiskBlocksEvictedWithoutRead;
	}

	public Integer getRamDiskBlocksEvictionWindowMsNumOps() {
	return ramDiskBlocksEvictionWindowMsNumOps;
	}

	public void setRamDiskBlocksEvictionWindowMsNumOps(Integer ramDiskBlocksEvictionWindowMsNumOps) {
	this.ramDiskBlocksEvictionWindowMsNumOps = ramDiskBlocksEvictionWindowMsNumOps;
	}

	public Double getRamDiskBlocksEvictionWindowMsAvgTime() {
	return ramDiskBlocksEvictionWindowMsAvgTime;
	}

	public void setRamDiskBlocksEvictionWindowMsAvgTime(Double ramDiskBlocksEvictionWindowMsAvgTime) {
	this.ramDiskBlocksEvictionWindowMsAvgTime = ramDiskBlocksEvictionWindowMsAvgTime;
	}

	public Integer getRamDiskBlocksLazyPersisted() {
	return ramDiskBlocksLazyPersisted;
	}

	public void setRamDiskBlocksLazyPersisted(Integer ramDiskBlocksLazyPersisted) {
	this.ramDiskBlocksLazyPersisted = ramDiskBlocksLazyPersisted;
	}

	public Integer getRamDiskBlocksDeletedBeforeLazyPersisted() {
	return ramDiskBlocksDeletedBeforeLazyPersisted;
	}

	public void setRamDiskBlocksDeletedBeforeLazyPersisted(Integer ramDiskBlocksDeletedBeforeLazyPersisted) {
	this.ramDiskBlocksDeletedBeforeLazyPersisted = ramDiskBlocksDeletedBeforeLazyPersisted;
	}

	public Integer getRamDiskBytesLazyPersisted() {
	return ramDiskBytesLazyPersisted;
	}

	public void setRamDiskBytesLazyPersisted(Integer ramDiskBytesLazyPersisted) {
	this.ramDiskBytesLazyPersisted = ramDiskBytesLazyPersisted;
	}

	public Integer getRamDiskBlocksLazyPersistWindowMsNumOps() {
	return ramDiskBlocksLazyPersistWindowMsNumOps;
	}

	public void setRamDiskBlocksLazyPersistWindowMsNumOps(Integer ramDiskBlocksLazyPersistWindowMsNumOps) {
	this.ramDiskBlocksLazyPersistWindowMsNumOps = ramDiskBlocksLazyPersistWindowMsNumOps;
	}

	public Double getRamDiskBlocksLazyPersistWindowMsAvgTime() {
	return ramDiskBlocksLazyPersistWindowMsAvgTime;
	}

	public void setRamDiskBlocksLazyPersistWindowMsAvgTime(Double ramDiskBlocksLazyPersistWindowMsAvgTime) {
	this.ramDiskBlocksLazyPersistWindowMsAvgTime = ramDiskBlocksLazyPersistWindowMsAvgTime;
	}

	public Integer getFsyncCount() {
	return fsyncCount;
	}

	public void setFsyncCount(Integer fsyncCount) {
	this.fsyncCount = fsyncCount;
	}

	public Integer getVolumeFailures() {
	return volumeFailures;
	}

	public void setVolumeFailures(Integer volumeFailures) {
	this.volumeFailures = volumeFailures;
	}

	public Integer getDatanodeNetworkErrors() {
	return datanodeNetworkErrors;
	}

	public void setDatanodeNetworkErrors(Integer datanodeNetworkErrors) {
	this.datanodeNetworkErrors = datanodeNetworkErrors;
	}

	public Integer getDataNodeActiveXceiversCount() {
	return dataNodeActiveXceiversCount;
	}

	public void setDataNodeActiveXceiversCount(Integer dataNodeActiveXceiversCount) {
	this.dataNodeActiveXceiversCount = dataNodeActiveXceiversCount;
	}

	public Integer getReadBlockOpNumOps() {
	return readBlockOpNumOps;
	}

	public void setReadBlockOpNumOps(Integer readBlockOpNumOps) {
	this.readBlockOpNumOps = readBlockOpNumOps;
	}

	public Double getReadBlockOpAvgTime() {
	return readBlockOpAvgTime;
	}

	public void setReadBlockOpAvgTime(Double readBlockOpAvgTime) {
	this.readBlockOpAvgTime = readBlockOpAvgTime;
	}

	public Integer getWriteBlockOpNumOps() {
	return writeBlockOpNumOps;
	}

	public void setWriteBlockOpNumOps(Integer writeBlockOpNumOps) {
	this.writeBlockOpNumOps = writeBlockOpNumOps;
	}

	public Double getWriteBlockOpAvgTime() {
	return writeBlockOpAvgTime;
	}

	public void setWriteBlockOpAvgTime(Double writeBlockOpAvgTime) {
	this.writeBlockOpAvgTime = writeBlockOpAvgTime;
	}

	public Integer getBlockChecksumOpNumOps() {
	return blockChecksumOpNumOps;
	}

	public void setBlockChecksumOpNumOps(Integer blockChecksumOpNumOps) {
	this.blockChecksumOpNumOps = blockChecksumOpNumOps;
	}

	public Double getBlockChecksumOpAvgTime() {
	return blockChecksumOpAvgTime;
	}

	public void setBlockChecksumOpAvgTime(Double blockChecksumOpAvgTime) {
	this.blockChecksumOpAvgTime = blockChecksumOpAvgTime;
	}

	public Integer getCopyBlockOpNumOps() {
	return copyBlockOpNumOps;
	}

	public void setCopyBlockOpNumOps(Integer copyBlockOpNumOps) {
	this.copyBlockOpNumOps = copyBlockOpNumOps;
	}

	public Double getCopyBlockOpAvgTime() {
	return copyBlockOpAvgTime;
	}

	public void setCopyBlockOpAvgTime(Double copyBlockOpAvgTime) {
	this.copyBlockOpAvgTime = copyBlockOpAvgTime;
	}

	public Integer getReplaceBlockOpNumOps() {
	return replaceBlockOpNumOps;
	}

	public void setReplaceBlockOpNumOps(Integer replaceBlockOpNumOps) {
	this.replaceBlockOpNumOps = replaceBlockOpNumOps;
	}

	public Double getReplaceBlockOpAvgTime() {
	return replaceBlockOpAvgTime;
	}

	public void setReplaceBlockOpAvgTime(Double replaceBlockOpAvgTime) {
	this.replaceBlockOpAvgTime = replaceBlockOpAvgTime;
	}

	public Integer getHeartbeatsNumOps() {
	return heartbeatsNumOps;
	}

	public void setHeartbeatsNumOps(Integer heartbeatsNumOps) {
	this.heartbeatsNumOps = heartbeatsNumOps;
	}

	public Double getHeartbeatsAvgTime() {
	return heartbeatsAvgTime;
	}

	public void setHeartbeatsAvgTime(Double heartbeatsAvgTime) {
	this.heartbeatsAvgTime = heartbeatsAvgTime;
	}

	public Integer getHeartbeatsTotalNumOps() {
	return heartbeatsTotalNumOps;
	}

	public void setHeartbeatsTotalNumOps(Integer heartbeatsTotalNumOps) {
	this.heartbeatsTotalNumOps = heartbeatsTotalNumOps;
	}

	public Double getHeartbeatsTotalAvgTime() {
	return heartbeatsTotalAvgTime;
	}

	public void setHeartbeatsTotalAvgTime(Double heartbeatsTotalAvgTime) {
	this.heartbeatsTotalAvgTime = heartbeatsTotalAvgTime;
	}

	public Integer getLifelinesNumOps() {
	return lifelinesNumOps;
	}

	public void setLifelinesNumOps(Integer lifelinesNumOps) {
	this.lifelinesNumOps = lifelinesNumOps;
	}

	public Double getLifelinesAvgTime() {
	return lifelinesAvgTime;
	}

	public void setLifelinesAvgTime(Double lifelinesAvgTime) {
	this.lifelinesAvgTime = lifelinesAvgTime;
	}

	public Integer getBlockReportsNumOps() {
	return blockReportsNumOps;
	}

	public void setBlockReportsNumOps(Integer blockReportsNumOps) {
	this.blockReportsNumOps = blockReportsNumOps;
	}

	public Double getBlockReportsAvgTime() {
	return blockReportsAvgTime;
	}

	public void setBlockReportsAvgTime(Double blockReportsAvgTime) {
	this.blockReportsAvgTime = blockReportsAvgTime;
	}

	public Integer getIncrementalBlockReportsNumOps() {
	return incrementalBlockReportsNumOps;
	}

	public void setIncrementalBlockReportsNumOps(Integer incrementalBlockReportsNumOps) {
	this.incrementalBlockReportsNumOps = incrementalBlockReportsNumOps;
	}

	public Double getIncrementalBlockReportsAvgTime() {
	return incrementalBlockReportsAvgTime;
	}

	public void setIncrementalBlockReportsAvgTime(Double incrementalBlockReportsAvgTime) {
	this.incrementalBlockReportsAvgTime = incrementalBlockReportsAvgTime;
	}

	public Integer getCacheReportsNumOps() {
	return cacheReportsNumOps;
	}

	public void setCacheReportsNumOps(Integer cacheReportsNumOps) {
	this.cacheReportsNumOps = cacheReportsNumOps;
	}

	public Double getCacheReportsAvgTime() {
	return cacheReportsAvgTime;
	}

	public void setCacheReportsAvgTime(Double cacheReportsAvgTime) {
	this.cacheReportsAvgTime = cacheReportsAvgTime;
	}

	public Integer getPacketAckRoundTripTimeNanosNumOps() {
	return packetAckRoundTripTimeNanosNumOps;
	}

	public void setPacketAckRoundTripTimeNanosNumOps(Integer packetAckRoundTripTimeNanosNumOps) {
	this.packetAckRoundTripTimeNanosNumOps = packetAckRoundTripTimeNanosNumOps;
	}

	public Double getPacketAckRoundTripTimeNanosAvgTime() {
	return packetAckRoundTripTimeNanosAvgTime;
	}

	public void setPacketAckRoundTripTimeNanosAvgTime(Double packetAckRoundTripTimeNanosAvgTime) {
	this.packetAckRoundTripTimeNanosAvgTime = packetAckRoundTripTimeNanosAvgTime;
	}

	public Integer getFlushNanosNumOps() {
	return flushNanosNumOps;
	}

	public void setFlushNanosNumOps(Integer flushNanosNumOps) {
	this.flushNanosNumOps = flushNanosNumOps;
	}

	public Double getFlushNanosAvgTime() {
	return flushNanosAvgTime;
	}

	public void setFlushNanosAvgTime(Double flushNanosAvgTime) {
	this.flushNanosAvgTime = flushNanosAvgTime;
	}

	public Integer getFsyncNanosNumOps() {
	return fsyncNanosNumOps;
	}

	public void setFsyncNanosNumOps(Integer fsyncNanosNumOps) {
	this.fsyncNanosNumOps = fsyncNanosNumOps;
	}

	public Double getFsyncNanosAvgTime() {
	return fsyncNanosAvgTime;
	}

	public void setFsyncNanosAvgTime(Double fsyncNanosAvgTime) {
	this.fsyncNanosAvgTime = fsyncNanosAvgTime;
	}

	public Integer getSendDataPacketBlockedOnNetworkNanosNumOps() {
	return sendDataPacketBlockedOnNetworkNanosNumOps;
	}

	public void setSendDataPacketBlockedOnNetworkNanosNumOps(Integer sendDataPacketBlockedOnNetworkNanosNumOps) {
	this.sendDataPacketBlockedOnNetworkNanosNumOps = sendDataPacketBlockedOnNetworkNanosNumOps;
	}

	public Double getSendDataPacketBlockedOnNetworkNanosAvgTime() {
	return sendDataPacketBlockedOnNetworkNanosAvgTime;
	}

	public void setSendDataPacketBlockedOnNetworkNanosAvgTime(Double sendDataPacketBlockedOnNetworkNanosAvgTime) {
	this.sendDataPacketBlockedOnNetworkNanosAvgTime = sendDataPacketBlockedOnNetworkNanosAvgTime;
	}

	public Integer getSendDataPacketTransferNanosNumOps() {
	return sendDataPacketTransferNanosNumOps;
	}

	public void setSendDataPacketTransferNanosNumOps(Integer sendDataPacketTransferNanosNumOps) {
	this.sendDataPacketTransferNanosNumOps = sendDataPacketTransferNanosNumOps;
	}

	public Double getSendDataPacketTransferNanosAvgTime() {
	return sendDataPacketTransferNanosAvgTime;
	}

	public void setSendDataPacketTransferNanosAvgTime(Double sendDataPacketTransferNanosAvgTime) {
	this.sendDataPacketTransferNanosAvgTime = sendDataPacketTransferNanosAvgTime;
	}

	public Integer getBlocksInPendingIBR() {
	return blocksInPendingIBR;
	}

	public void setBlocksInPendingIBR(Integer blocksInPendingIBR) {
	this.blocksInPendingIBR = blocksInPendingIBR;
	}

	public Integer getBlocksReceivingInPendingIBR() {
	return blocksReceivingInPendingIBR;
	}

	public void setBlocksReceivingInPendingIBR(Integer blocksReceivingInPendingIBR) {
	this.blocksReceivingInPendingIBR = blocksReceivingInPendingIBR;
	}

	public Integer getBlocksReceivedInPendingIBR() {
	return blocksReceivedInPendingIBR;
	}

	public void setBlocksReceivedInPendingIBR(Integer blocksReceivedInPendingIBR) {
	this.blocksReceivedInPendingIBR = blocksReceivedInPendingIBR;
	}

	public Integer getBlocksDeletedInPendingIBR() {
	return blocksDeletedInPendingIBR;
	}

	public void setBlocksDeletedInPendingIBR(Integer blocksDeletedInPendingIBR) {
	this.blocksDeletedInPendingIBR = blocksDeletedInPendingIBR;
	}

	public Integer getEcReconstructionTasks() {
	return ecReconstructionTasks;
	}

	public void setEcReconstructionTasks(Integer ecReconstructionTasks) {
	this.ecReconstructionTasks = ecReconstructionTasks;
	}

	public Integer getEcFailedReconstructionTasks() {
	return ecFailedReconstructionTasks;
	}

	public void setEcFailedReconstructionTasks(Integer ecFailedReconstructionTasks) {
	this.ecFailedReconstructionTasks = ecFailedReconstructionTasks;
	}

	public Integer getEcDecodingTimeNanos() {
	return ecDecodingTimeNanos;
	}

	public void setEcDecodingTimeNanos(Integer ecDecodingTimeNanos) {
	this.ecDecodingTimeNanos = ecDecodingTimeNanos;
	}

	public Integer getEcReconstructionBytesRead() {
	return ecReconstructionBytesRead;
	}

	public void setEcReconstructionBytesRead(Integer ecReconstructionBytesRead) {
	this.ecReconstructionBytesRead = ecReconstructionBytesRead;
	}

	public Integer getEcReconstructionBytesWritten() {
	return ecReconstructionBytesWritten;
	}

	public void setEcReconstructionBytesWritten(Integer ecReconstructionBytesWritten) {
	this.ecReconstructionBytesWritten = ecReconstructionBytesWritten;
	}

	public Integer getEcReconstructionRemoteBytesRead() {
	return ecReconstructionRemoteBytesRead;
	}

	public void setEcReconstructionRemoteBytesRead(Integer ecReconstructionRemoteBytesRead) {
	this.ecReconstructionRemoteBytesRead = ecReconstructionRemoteBytesRead;
	}

	public Integer getEcReconstructionReadTimeMillis() {
	return ecReconstructionReadTimeMillis;
	}

	public void setEcReconstructionReadTimeMillis(Integer ecReconstructionReadTimeMillis) {
	this.ecReconstructionReadTimeMillis = ecReconstructionReadTimeMillis;
	}

	public Integer getEcReconstructionDecodingTimeMillis() {
	return ecReconstructionDecodingTimeMillis;
	}

	public void setEcReconstructionDecodingTimeMillis(Integer ecReconstructionDecodingTimeMillis) {
	this.ecReconstructionDecodingTimeMillis = ecReconstructionDecodingTimeMillis;
	}

	public Integer getEcReconstructionWriteTimeMillis() {
	return ecReconstructionWriteTimeMillis;
	}

	public void setEcReconstructionWriteTimeMillis(Integer ecReconstructionWriteTimeMillis) {
	this.ecReconstructionWriteTimeMillis = ecReconstructionWriteTimeMillis;
	}

}

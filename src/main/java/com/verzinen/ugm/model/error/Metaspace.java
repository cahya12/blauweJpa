package com.verzinen.ugm.model.error;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metaspace {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("Valid")
	@Expose
	private Boolean valid;
	@SerializedName("Usage")
	@Expose
	private Usage usage;
	@SerializedName("PeakUsage")
	@Expose
	private PeakUsage peakUsage;
	@SerializedName("MemoryManagerNames")
	@Expose
	private List<String> memoryManagerNames = null;
	@SerializedName("UsageThreshold")
	@Expose
	private Integer usageThreshold;
	@SerializedName("UsageThresholdExceeded")
	@Expose
	private Boolean usageThresholdExceeded;
	@SerializedName("UsageThresholdCount")
	@Expose
	private Integer usageThresholdCount;
	@SerializedName("UsageThresholdSupported")
	@Expose
	private Boolean usageThresholdSupported;
	@SerializedName("CollectionUsage")
	@Expose
	private Object collectionUsage;
	@SerializedName("CollectionUsageThresholdSupported")
	@Expose
	private Boolean collectionUsageThresholdSupported;
	@SerializedName("Name2")
	@Expose
	private String name2;
	@SerializedName("Type")
	@Expose
	private String type;
	@SerializedName("ObjectName")
	@Expose
	private String objectName;

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

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public Usage getUsage() {
		return usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	public PeakUsage getPeakUsage() {
		return peakUsage;
	}

	public void setPeakUsage(PeakUsage peakUsage) {
		this.peakUsage = peakUsage;
	}

	public List<String> getMemoryManagerNames() {
		return memoryManagerNames;
	}

	public void setMemoryManagerNames(List<String> memoryManagerNames) {
		this.memoryManagerNames = memoryManagerNames;
	}

	public Integer getUsageThreshold() {
		return usageThreshold;
	}

	public void setUsageThreshold(Integer usageThreshold) {
		this.usageThreshold = usageThreshold;
	}

	public Boolean getUsageThresholdExceeded() {
		return usageThresholdExceeded;
	}

	public void setUsageThresholdExceeded(Boolean usageThresholdExceeded) {
		this.usageThresholdExceeded = usageThresholdExceeded;
	}

	public Integer getUsageThresholdCount() {
		return usageThresholdCount;
	}

	public void setUsageThresholdCount(Integer usageThresholdCount) {
		this.usageThresholdCount = usageThresholdCount;
	}

	public Boolean getUsageThresholdSupported() {
		return usageThresholdSupported;
	}

	public void setUsageThresholdSupported(Boolean usageThresholdSupported) {
		this.usageThresholdSupported = usageThresholdSupported;
	}

	public Object getCollectionUsage() {
		return collectionUsage;
	}

	public void setCollectionUsage(Object collectionUsage) {
		this.collectionUsage = collectionUsage;
	}

	public Boolean getCollectionUsageThresholdSupported() {
		return collectionUsageThresholdSupported;
	}

	public void setCollectionUsageThresholdSupported(Boolean collectionUsageThresholdSupported) {
		this.collectionUsageThresholdSupported = collectionUsageThresholdSupported;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}

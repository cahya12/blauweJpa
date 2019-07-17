package com.verzinen.ugm.model.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassLoading {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("LoadedClassCount")
	@Expose
	private Integer loadedClassCount;
	@SerializedName("UnloadedClassCount")
	@Expose
	private Integer unloadedClassCount;
	@SerializedName("TotalLoadedClassCount")
	@Expose
	private Integer totalLoadedClassCount;
	@SerializedName("Verbose")
	@Expose
	private Boolean verbose;
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

	public Integer getLoadedClassCount() {
		return loadedClassCount;
	}

	public void setLoadedClassCount(Integer loadedClassCount) {
		this.loadedClassCount = loadedClassCount;
	}

	public Integer getUnloadedClassCount() {
		return unloadedClassCount;
	}

	public void setUnloadedClassCount(Integer unloadedClassCount) {
		this.unloadedClassCount = unloadedClassCount;
	}

	public Integer getTotalLoadedClassCount() {
		return totalLoadedClassCount;
	}

	public void setTotalLoadedClassCount(Integer totalLoadedClassCount) {
		this.totalLoadedClassCount = totalLoadedClassCount;
	}

	public Boolean getVerbose() {
		return verbose;
	}

	public void setVerbose(Boolean verbose) {
		this.verbose = verbose;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}
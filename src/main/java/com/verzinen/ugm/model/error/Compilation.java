package com.verzinen.ugm.model.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Compilation {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("CompilationTimeMonitoringSupported")
	@Expose
	private Boolean compilationTimeMonitoringSupported;
	@SerializedName("TotalCompilationTime")
	@Expose
	private Integer totalCompilationTime;
	@SerializedName("Name2")
	@Expose
	private String name2;
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

	public Boolean getCompilationTimeMonitoringSupported() {
		return compilationTimeMonitoringSupported;
	}

	public void setCompilationTimeMonitoringSupported(Boolean compilationTimeMonitoringSupported) {
		this.compilationTimeMonitoringSupported = compilationTimeMonitoringSupported;
	}

	public Integer getTotalCompilationTime() {
		return totalCompilationTime;
	}

	public void setTotalCompilationTime(Integer totalCompilationTime) {
		this.totalCompilationTime = totalCompilationTime;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}
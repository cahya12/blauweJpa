package com.verzinen.ugm.model.error;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CodeCacheManager {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("Valid")
	@Expose
	private Boolean valid;
	@SerializedName("MemoryPoolNames")
	@Expose
	private List<String> memoryPoolNames = null;
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

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public List<String> getMemoryPoolNames() {
		return memoryPoolNames;
	}

	public void setMemoryPoolNames(List<String> memoryPoolNames) {
		this.memoryPoolNames = memoryPoolNames;
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
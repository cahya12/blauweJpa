package com.verzinen.ugm.model.error;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PeakUsage {

	@SerializedName("committed")
	@Expose
	private Integer committed;
	@SerializedName("init")
	@Expose
	private Integer init;
	@SerializedName("max")
	@Expose
	private Integer max;
	@SerializedName("used")
	@Expose
	private Integer used;

	public Integer getCommitted() {
		return committed;
	}

	public void setCommitted(Integer committed) {
		this.committed = committed;
	}

	public Integer getInit() {
		return init;
	}

	public void setInit(Integer init) {
		this.init = init;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

}

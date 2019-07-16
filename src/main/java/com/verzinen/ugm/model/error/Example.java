package com.verzinen.ugm.model.error;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

	@SerializedName("beans")
	@Expose
	private List<Bean> beans = null;

	public List<Bean> getBeans() {
		return beans;
	}

	public void setBeans(List<Bean> beans) {
		this.beans = beans;
	}

}
package com.verzinen.telyu.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.verzinen.telyu.model.yarn.ConfigYarn;


/*
 * parsing work
 * json to POJO
 * 
 */
public class PojoUtil {
	
	
	public static ConfigYarn json2ConfigYarn(String json) {

		JsonParser parser = new JsonParser();
		
	//	Bean _bean =  null;
		ConfigYarn  _jmx = null;
		
		JsonElement jsonTree = parser.parse(json);
		

		if (jsonTree.isJsonObject()) {

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			Gson gson = new Gson();
			
			_jmx  = gson.fromJson(jsonObject, ConfigYarn.class);
			
		}

		return _jmx ;
	}
	

}

package com.verzinen.telyu.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


/*
 * parsing work
 * json to POJO
 * 
 */
public class MapUtil {
	



	public static Map<String, Object> toMap(JsonObject object) throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();

		Set<String> keysItr = object.keySet();

		//   while(keysItr.) {

		for (String key : keysItr) {
			//String key = keysItr.next();

			Object value = object.get(key);

			if(value instanceof JsonArray) {
				value = toList((JsonArray) value);
			}

			else if(value instanceof JsonObject) {
				value = toMap((JsonObject) value);
			}
			map.put(key, value);
		}
		return map;
	}


	public static List<Object> toList(JsonArray array) throws Exception {
		List<Object> list = new ArrayList<Object>();
		for(int i = 0; i < array.size(); i++) {
			Object value = array.get(i);
			if(value instanceof JsonArray) {
				value = toList((JsonArray) value);
			}

			else if(value instanceof JsonObject) {
				value = toMap((JsonObject) value);
			}
			list.add(value);
		}
		return list;
	}
}

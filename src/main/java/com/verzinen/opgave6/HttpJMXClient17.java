package com.verzinen.opgave6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * A simple Java REST GET example using the Apache HTTP library.
  curl -u admin:admin -H "X-Requested-By: ambari" -X GET  
  http://192.168.3.221:8080/api/v1/clusters/H2SO4?fields=Clusters/desired_configs

 */


public class HttpJMXClient17 {
	static String DEFAULT_USER = "admin";
	static String DEFAULT_PASS = "admin";
	static String CLUSTER = "YAVA30";// "H2SO4";
	static String HOSTNAME = "192.168.3.132";//192.168.3.132  192.168.3.221 192.168.3.164
	
	  // 		AMBARI_INFRA_SOLR, 		AMBARI_METRIC  	ATLAS  	HIVE  KAFKA  	MAPREDUCE2
	  //       	PIG  RANGER   SQOOP  YARN, ZOOKEEPER, OOZIE	


  public static void main(String[] args) {
	  
	  String host = "192.168.3.132";
	  String port = "50075";
	  
	  try {
		  
		  // curl http://192.168.3.132:50075/jmx
		  
		  UGMRestClient _client  =  new UGMRestClient("192.168.3.132","50075");
		  
		  String json =  _client.ambari_jmx_client(host, port);
 		
		 System.out.println(json);
		 
		 
	   System.out.println("----------------------------------------");
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  

   

  

  
  
  
}
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

import org.apache.commons.codec.binary.Base64;
import org.apache.http.*;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.verzinen.jsf.model.Config;
import com.verzinen.jsf.model.Configuration;
import com.verzinen.jsf.model.Item;
//import com.verzinen.jsf.model.metadata.JsonMetricsMetadata;

/**
 * A simple Java REST GET example using the Apache HTTP library.
  curl -u admin:admin -H "X-Requested-By: ambari" -X GET  
  http://192.168.3.221:8080/api/v1/clusters/H2SO4?fields=Clusters/desired_configs

 */


public class HttpJMXClient16 {
	static String DEFAULT_USER = "admin";
	static String DEFAULT_PASS = "admin";
	static String CLUSTER = "YAVA30";// "H2SO4";
	static String HOSTNAME = "192.168.3.132";//192.168.3.132  192.168.3.221 192.168.3.164
	
	  // 		AMBARI_INFRA_SOLR, 		AMBARI_METRIC  	ATLAS  	HIVE  KAFKA  	MAPREDUCE2
	  //       	PIG  RANGER   SQOOP  YARN, ZOOKEEPER, OOZIE	


  public static void main(String[] args) {
	  
	  try {
		  
		  AmbariJMXClient _client  =  new AmbariJMXClient("192.168.3.132");
		  
		  String json =  _client.ambari_jmx_client(null);
 		
		 // System.out.println(json);
		  
		//  JsonMetricsMetadata metric =  AmbariJMXUtil.json2pojo(json);
		  
		  
		  
		  
		  
		  
		 // Object beans  = AmbariJMXUtil.deserializeJSON(json);
		  
		  
		  
		//  System.out.println(new Gson().toJson(beans));
		  
    	 System.out.println("----------------------------------------");
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  

   

  

  
  
  
}
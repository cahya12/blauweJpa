package com.verzinen.opgave6;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
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
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class AmbariJMXClient {
	
	String DEFAULT_USER = "admin";
	String DEFAULT_PASS = "admin";
	
	String HOSTNAME = "192.168.3.132";//192.168.3.132  192.168.3.221 192.168.3.164
	String jmx_port = "50075";
	String DEFAULT_query = "Hadoop:service=DataNode,name=JvmMetrics";
	
	public AmbariJMXClient(String hostname, String jmx_port) {
		this.HOSTNAME = hostname;
		this.jmx_port = jmx_port;
	}
	
	public AmbariJMXClient(String hostname) {
		this.HOSTNAME = hostname;
	}

	public String ambari_jmx_client (String qry_name) throws Exception {
		  
		  String json =  null;  

			  // JMX 
			  // http://192.168.3.221:50075/jmx
		  
		  String _request_URL = "http://"+ HOSTNAME +":" + jmx_port +"/jmx";

		  HttpClient httpClient = new DefaultHttpClient();

		  HttpGet httpGetRequest = new HttpGet(_request_URL);
		  
		  HttpResponse response = httpClient.execute(httpGetRequest);

		  System.out.println("----------------------------------------");
		  System.out.println(response.getStatusLine());
		  System.out.println("----------------------------------------");

		  int statusCode = response.getStatusLine().getStatusCode();

		  System.out.println("----------------------------------------");

		  System.out.println("-- response code -- = "+ statusCode);

		  HttpEntity entity = response.getEntity();

		  Header[] headers = response.getAllHeaders();

		  for (int i = 0; i < headers.length; i++) {
			  System.out.println(headers[i]);
		  }

		  if (entity != null) {

			  json =     EntityUtils.toString(entity);

		  } 

		  System.out.println("----------------------------------------");


		  return json;
	}
}

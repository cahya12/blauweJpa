package com.verzinen.opgave5;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class JMXRestesayClient {
	
	String DEFAULT_USER = "admin";
	String DEFAULT_PASS = "admin";
	
	String HOSTNAME = "192.168.3.132";//192.168.3.132  192.168.3.221 192.168.3.164
	String jmx_port = "50075";
	String DEFAULT_query = "Hadoop:service=DataNode,name=JvmMetrics";
	
	public JMXRestesayClient(String hostname, String jmx_port) {
		this.HOSTNAME = hostname;
		this.jmx_port = jmx_port;
	}
	
	public JMXRestesayClient(String hostname) {
		this.HOSTNAME = hostname;
	}
	
	public String jmx_restesay_client (String qry_name) throws Exception {
		  
		  String json =  null;  

			  // JMX 
			  // http://192.168.3.221:50075/jmx
		  
		  String _request_URL = "http://"+ HOSTNAME +":" + jmx_port +"/jmx";
		  
		  Client client = ClientBuilder.newBuilder().build();
		  
          WebTarget target = client.target(_request_URL +"?qry=" + qry_name);
          
          
          Response response = target.request().get();
          
           json = response.readEntity(String.class);
          
          response.close();  // You should close connections!

        //  ResteasyClient client = new ResteasyClientBuilder().build();
       //   ResteasyWebTarget target = client.target("http://foo.com/resource");

		  
	
          
          
          System.out.println(json);
          
          
          

		  System.out.println("----------------------------------------");


		  return json;
	}
	
	
	
}

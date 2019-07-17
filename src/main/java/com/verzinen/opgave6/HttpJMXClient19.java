package com.verzinen.opgave6;

import java.util.List;

import com.verzinen.ugm.model.error.UgiMetrics;

/**
 * A simple Java REST GET example using the Apache HTTP library.
  curl -u admin:admin -H "X-Requested-By: ambari" -X GET  
  http://192.168.3.221:8080/api/v1/clusters/H2SO4?fields=Clusters/desired_configs

 */

public class HttpJMXClient19 {

  public static void main(String[] args) {
	  
	  String host = "192.168.3.132";
	  String port = "50075";
	  
	  // "com.sun.management:type=DiagnosticCommand"
	  /*
	   * "Hadoop:service=DataNode,name=FSDatasetState-489cd60b-b0d6-4c64-884a-1864da014516"
	   * "JMImplementation:type=MBeanServerDelegate"
	   * 
	"name" : "java.lang:type=Runtime",
    "name" : "java.lang:type=Threading",
    "name" : "java.lang:type=OperatingSystem",
    "name" : "java.lang:type=Compilation",
    "name" : "java.lang:type=ClassLoading",
    
    "name" : "java.lang:type=GarbageCollector,name=ParNew",
    "name" : "java.lang:type=GarbageCollector,name=ConcurrentMarkSweep",
    
    "name" : "java.lang:type=Memory",
    "name" : "java.lang:type=MemoryManager,name=Metaspace Manager",
    "name" : "java.lang:type=MemoryManager,name=CodeCacheManager",
    "name" : "java.lang:type=MemoryPool,name=Code Cache",
    "name" : "java.lang:type=MemoryPool,name=Metaspace",
    "name" : "java.lang:type=MemoryPool,name=Par Eden Space",
    "name" : "java.lang:type=MemoryPool,name=Compressed Class Space",
    "name" : "java.lang:type=MemoryPool,name=Par Survivor Space",
    "name" : "java.lang:type=MemoryPool,name=CMS Old Gen",

	  */
	  try {
		  // curl http://192.168.3.132:50075/jmx?qry=
		  
		  // curl http://192.168.3.132:50075/jmx?qry="java.lang:type=Threading"
		  // curl http://192.168.3.132:50075/jmx?qry="java.lang:type=OperatingSystem"
		  // curl http://192.168.3.132:50075/jmx?qry="java.lang:type=MemoryPool,name=Code Cache"
		  // curl http://192.168.3.132:50075/jmx?qry="java.lang:type=Compilation"
		  // curl http://192.168.3.132:50075/jmx?qry="java.nio:type=BufferPool,name=direct"

		  // curl http://192.168.3.132:50075/jmx?qry="Hadoop:service=DataNode,name=JvmMetrics"
		  // curl http://192.168.3.132:50075/jmx?qry="Hadoop:service=DataNode,name=UgiMetrics"
		 
		  
		  String qry_name = "Hadoop:service=DataNode,name=UgiMetrics" ;

		  UGMRestClient _client  =  new UGMRestClient("192.168.3.132","50075");
		  
		  String _url = "http://"+host+":"+port+"/jmx?qry="+ qry_name;
		  
		  String json =  _client.ambari_plain_client(_url);
 		
		 // System.out.println(json);
		 
		 
		  List<UgiMetrics> _bbs_ = AmbariJMXUtil.json2UgiMetrics(json);
		  
		  System.out.println("----------------------------------------");
	/* "tag.Context" : "ugi",
    "tag.Hostname" : "yava3-132.labs247.com",
    "LoginSuccessNumOps" : 1,
    "LoginSuccessAvgTime" : 6.0,
    "LoginFailureNumOps" : 0,
    "LoginFailureAvgTime" : 0.0,
    "GetGroupsNumOps" : 0,
    "GetGroupsAvgTime" : 0.0,
    "RenewalFailuresTotal" : 0,
    "RenewalFailures" : 0

	 * 
	 */
		  for (UgiMetrics  b: _bbs_) {
			  System.out.println( b.getName() );
			  System.out.println( b.getModelerType() );
			  System.out.println( b.getTagContext() );
			  System.out.println( b.getTagHostname() );
			  
			  System.out.println( b.getLoginSuccessNumOps() );
			  System.out.println( b.getLoginSuccessAvgTime() );
			  
			  System.out.println( b.getGetGroupsNumOps() );
			  System.out.println( b.getGetGroupsAvgTime() );
			  
		  }
		  
		  
		  
		  
		  
		 System.out.println("----------------------------------------");
    } catch (Exception e) {
      e.printStackTrace();
    }
	  
	  
	  
    
  }
  

   

  

  
  
  
}
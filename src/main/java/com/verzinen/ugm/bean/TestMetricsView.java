package com.verzinen.ugm.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;


import com.verzinen.opgave5.JMXRestesayClient;
import com.verzinen.ugm.ejb.AmbariJMXUtil;
import com.verzinen.ugm.ejb.UGMRestClient;
import com.verzinen.ugm.model.error.UgiMetrics;

@Named
@ViewScoped
public class TestMetricsView implements Serializable {
	
	static final long serialVersionUID = 1237l;
	
	static Logger logger = Logger.getLogger(TestMetricsView.class);
	  
	static  String host = "192.168.3.132";
	static  String port = "50075";
	//static  String qry_name = "java.lang:type=GarbageCollector,name=ParNew" ;
	
	List<UgiMetrics> _bbs_ = null;
		
	@PostConstruct
	public  void init()  {
		getJSON();
	}
	
	
	
	public  void getJSON()  {
		
		try {
		
			  String qry_name = "Hadoop:service=DataNode,name=UgiMetrics" ;

			  JMXRestesayClient  _client  =  new JMXRestesayClient(host,port);
			  
			  String _url = "http://"+host+":"+port+"/jmx?qry="+ qry_name;
			  
			  String json =  _client.jmx_restesay_client(qry_name);		 
			 
			  _bbs_ = AmbariJMXUtil.json2UgiMetrics(json);
	
		 
		}  catch (Exception e) {
			logger.error(e);
		}
		 		 		
	}
	
	
	public List<UgiMetrics>  getUgiMetrics() {
	   	
	   	   return _bbs_ ;
	    	   
		}
	
	
	
}

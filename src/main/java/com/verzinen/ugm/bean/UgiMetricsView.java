package com.verzinen.ugm.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;

import com.verdin.jsf.model.Configuration;
import com.verdin.jsf.model.Item;
import com.verdin.jsf.model.POJOConfigResult;
import com.verzinen.ugm.ejb.AmbariJMXUtil;
import com.verzinen.ugm.ejb.UGMRestClient;
import com.verzinen.ugm.model.error.UgiMetrics;

@Named
@ViewScoped
public class UgiMetricsView implements Serializable {
	
	static final long serialVersionUID = 1237l;
	
	static Logger logger = Logger.getLogger(UgiMetricsView.class);
	  
	static  String host = "192.168.3.132";
	static  String port = "50075";
	static  String qry_name = "Hadoop:service=DataNode,name=UgiMetrics" ;
	
	List<UgiMetrics> _bbs_ = null;
		
	@PostConstruct
	public  void init()  {
		getJSON();
	}
	
	
	
	public  void getJSON()  {
		
		try {
		
			  String qry_name = "Hadoop:service=DataNode,name=UgiMetrics" ;

			  UGMRestClient _client  =  new UGMRestClient(host,port);
			  
			  String _url = "http://"+host+":"+port+"/jmx?qry="+ qry_name;
			  
			  String json =  _client.ambari_plain_client(_url);		 
			 
			  _bbs_ = AmbariJMXUtil.json2UgiMetrics(json);
	
		 
		}  catch (Exception e) {
			logger.error(e);
		}
		 		 		
	}
	
	
	public List<UgiMetrics>  etUgiMetrics() {
	   	
	   	   return _bbs_ ;
	    	   
		}
	
	
	
}

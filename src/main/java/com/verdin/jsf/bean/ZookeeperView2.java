package com.verdin.jsf.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.jboss.logging.Logger;

import com.verdin.jsf.model.Param;
import com.verzinen.jsf.model.Configuration;
import com.verzinen.jsf.model.Item;
import com.verzinen.jsf.model.POJOItemsResult;
import com.verzinen.jsf.model.POJOItemsResultUtil;


@Named
@ViewScoped
public class ZookeeperView2 implements Serializable {
	
	static final long serialVersionUID = 1237l;
	
	static Logger logger = Logger.getLogger(ZookeeperView2.class);
		
	static String DEFAULT_USER = ContohConstants.Service.DEFAULT_USER; //"admin";
	static String DEFAULT_PASS = ContohConstants.Service.DEFAULT_PASS; //"admin";
	static String CLUSTER = ContohConstants.Service.DEFAULT_CLUSTER; //"C10H16";//"YAVA30";// "H2SO4";
	static String HOSTNAME = ContohConstants.Service.DEFAULT_HOSTNAME; //"192.168.3.132";//192.168.3.132  192.168.3.221 192.168.3.164
	
	// AMBARI_INFRA_SOLR, AMBARI_METRIC ATLAS HIVE KAFKA MAPREDUCE2
	// PIG RANGER SQOOP YARN, ZOOKEEPER, OOZIE	

	static String DEFAULT_SERVICE = "ZOOKEEPER";
	
	
	POJOItemsResult _json_as_pojo;
	List<Item> items;

	Item _current_item ;
	List<Configuration> _current_configurations;
	Configuration config;
		
	@PostConstruct
	public  void init() {
		
		try {
			
		
		AmbariRestClient _client  =  new AmbariRestClient(HOSTNAME, CLUSTER);
		  
		 String json =  _client.ambari_configurtion_rest_client (DEFAULT_SERVICE);
		  
		 _json_as_pojo = POJOItemsResultUtil.json2pojo( json);
	
		 items = _json_as_pojo.getItems();    	
		 
		 logger.info("items = "+ items.size());
		 
		 Item _current_item = items.stream()
    			 .filter(item -> item.getIsCurrent())
    			 .findAny()
    			 .orElse(null);
		 
		 _current_configurations = _current_item.getConfigurations();
		 
		 logger.info("_current_configurations size = "+ _current_configurations.size());
		 
		 config = getCurrentConfigurationByType("zookeeper-env");
		 
		for (Configuration cfg: _current_configurations) {
			logger.info("getType : "+ cfg.getType());
		}
		 
		}  catch (Exception e) {
			logger.error(e);
		}
		 		 		
	}
	
	public String   getType() {
	   	
	   	   return config.getType();
	    	   
		}
	
	public String   getTag() {
	   	
	   	   return config.getTag();
	    	   
		}
	
	public Integer   getVersion() {
	   	
	   	   return config.getVersion();
	    	   
		}
	
	public String   getClusterName() {
	   	
	   	   return config.getConfig().getClusterName();
	    	   
		}
	public String   getStackId() {
		
	   	   return config.getConfig().getStackId();
	    	   
		}
	
	public List<Param>  getProperties(String type) {
		
			// String _type = "\"" + type +"\"";
		
		       Configuration cfg = getCurrentConfigurationByType(type);
		
	   	   return cfg.get_Properties();
	    	   
		}
	
	public List<Param>  getProperties() {
	   	
	   	   return config.get_Properties();
	    	   
		}
	
	public List<Param>    getPropertiesAttributes() {
	   	
	   	   return config.get_PropertiesAttributes();
	    	   
		}
	
   private  Configuration  getCurrentConfigurationByType(String type) {
		
	   String _type = "\"" + type +"\"";
	   
		Configuration c  = _current_configurations.stream()
				 .filter(e -> _type.equalsIgnoreCase(e.getType()))
	   			 .findAny()
	   			 .orElse(null);
			
		
		return c;
	}
   
	public void   saveAction() {
	   	
		logger.info("save() ... invoked");
		
		
		for (Param e:    getProperties() ) {
    		logger.info( e.getKey() +" : "+  e.getValue());
     		 
    	}
	    	   
	}
	
	  public void doSomeLogic4() { // hbase-site
	    	logger.info("doSomeLogic4() ... hbase-site Properties size "+ getProperties("hbase-site").size());
	    	/*
	    	for (Map.Entry <String,Object> e: getProperties("metron").entrySet()) {
	    		logger.info("doSomeLogic4() ... "+ e.getKey() +" : "+  e.getValue());
	    	}  */
	    	
	    	for (Param e:    getProperties("hbase-site") ) {
	    		logger.info( e.getKey() +" : "+  e.getValue());
	     		 
	    	}
	    	
	    	
	    }
   
	  public void doSomeLogic5() {   // zoo.cfg
	    	logger.info("doSomeLogic4() ... map size "+ getProperties("zoo.cfg").size());
	    	
	    	for (Param e:    getProperties("zoo.cfg") ) {
	    		logger.info( e.getKey() +" : "+  e.getValue());
	     		 
	    	}
	    	
	    }
   
   
   
	
}

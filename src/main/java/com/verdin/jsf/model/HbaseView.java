package com.verdin.jsf.model;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;

@Named
@ViewScoped
public class HbaseView implements Serializable {
	
	static final long serialVersionUID = 1237l;
	
	 static Logger logger = Logger.getLogger(HbaseView.class);

	Configuration config;
	
	@Inject
	HBaseService  hbase;
	
	@PostConstruct
	public  void init() {
		
		config = hbase.getCurrentConfigurationByType("\"hbase-env\"");
		logger.info(config.getType());
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
	
	public Map<String, Object >  getProperties(String type) {
		
			String _type = "\"" + type +"\"";
		
		       Configuration cfg = hbase.getCurrentConfigurationByType(_type);
		
	   	   return cfg.get_Properties();
	    	   
		}
	
	public Map<String, Object >  getProperties() {
	   	
	   	   return config.get_Properties();
	    	   
		}
	
	public Map<String, Object>    getPropertiesAttributes() {
	   	
	   	   return config.get_PropertiesAttributes();
	    	   
		}
}

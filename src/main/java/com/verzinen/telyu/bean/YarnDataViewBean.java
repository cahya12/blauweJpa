package com.verzinen.telyu.bean;

import com.verzinen.telyu.ejb.YarnDataClient;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;



@Named
public class YarnDataViewBean {
    
    
    @EJB YarnDataClient data;
   // private DatanodeView data = new DatanodeView();

    @PostConstruct
    private void init() {
   
    }
    
 
    public String  getHRefURL() {
    	
    	return	data.getCurrentItem().getHref();
    	
    }
 
    public String  getGroupName() {
    	
    	return	data.getCurrentItem().getGroupName();
    	
    }
    
    public String getServiceName() {
    	
    	return	data.getCurrentItem().getServiceName();
    	
    }
    
    public String  getClusterName() {
    	
    	return	data.getCurrentItem().getClusterName();
    	
    }
    
    public String  getItemsSize() {
    	
    
    	
    	return  data.getClusterName2()	;
    	
    }
    
    
    
    
    
    
    
    
    
    
}
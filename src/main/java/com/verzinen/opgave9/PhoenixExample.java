package com.verzinen.opgave9;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.*;
//import java.util.*;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.jboss.logging.Logger;

@Named
@ApplicationScoped
public class PhoenixExample {
	
	static final long serialVersionUID = 1223l;
	static Logger logger = Logger.getLogger(PhoenixExample.class);

	@PostConstruct
	public void init() {
		logger.info("PostConstruct ... init() ... ");
	}
	
		
	 public void getData() throws Exception {
		 
		 logger.info("getData  ... () ... ");
		 
		 
		    Connection conn =  null;
		  //  Properties prop = new Properties();
		    
		    try {
		    
		    	Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
		    	//conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:/hbase-unsecure");
		    	
		    	logger.info("getting a connection");
		    	
		    	conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");

		    	if (conn !=  null) logger.info("got connection");
		    	else logger.info("got conn = null");
		    
		    	ResultSet rst = conn.createStatement().executeQuery("select * from METRIC_AGGREGATE_DAILY_UUID");
		    	
		    	while (rst.next()) {
		    		logger.info(rst.getString(1) + " " + rst.getString(2) + " " + rst.getString(3) + " " + rst.getString(4) + " " + rst.getString(5) + " " + rst.getString(6));
		    	}
		    
		    } catch (SQLException q) {
		    	q.printStackTrace();
		    	
		    } catch (Exception e) {
		    	e.printStackTrace();
		    	
		    } finally {
		    	if (conn != null)
		    		conn.close();
		    }
		  }
		  
}

//package com.verdin.jsf.rest;
//
//
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Response;
//
//import com.verzinen.ugm.bean.TestMetricsView;
//import com.verzinen.ugm.model.error.UgiMetrics;
//
////import com.verzinen.opgave9.FileTest;
////import com.verzinen.security.HarusAda;
//
//import java.util.Enumeration;
//import java.util.List;
//import java.util.Properties;
//
////import javax.inject.Inject;
//import javax.ws.rs.GET;
//import javax.ws.rs.Produces;
//
//
//@Path("/test")
//public class TestEndpoint {
//	
//	HarusAda _harusAda = new HarusAda();
//	TestMetricsView   phoenix = new  TestMetricsView();
//
//	@GET
//	@Produces("text/plain")
//	public Response doGet() {
//		
//		String resp = "Failed";
//	
//		try {
//			
//			_harusAda.initialize();
//			
//			
//			List<UgiMetrics> _bb_ = phoenix.getUgiMetrics();
//			 
//			 
//			for (UgiMetrics b: _bb_) {
//				System.out.println(b.getName());
//				System.out.println(b.getTagHostname());
//				System.out.println(b.getGetGroupsAvgTime());
//				System.out.println(b.getGetGroupsNumOps());
//				System.out.println(b.getModelerType());
//
//			}
//			
//			 
//			
//			resp = "Ok";
//			
//		
//		} catch (Exception e) {
//	    	e.printStackTrace();
//	    	
//	    }
//		
//		
//		return Response.ok("Hello, got response "+ resp).build();
//	}
//	
//	void printprop() {
//		Properties p = System.getProperties();
//		Enumeration keys = p.keys();
//		while (keys.hasMoreElements()) {
//		    String key = (String)keys.nextElement();
//		    String value = (String)p.get(key);
//		    System.out.println(key + ": " + value);
//		}
//	}
//}

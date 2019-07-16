package com.verzinen.ugm.ejb;

import com.verzinen.ugm.model.datanode.Datanode;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;


import com.verzinen.ugm.ejb.DatanodeClient;
import com.verzinen.ugm.model.datanode.Cpu;
import com.verzinen.ugm.model.datanode.Datanode;
import com.verzinen.ugm.model.datanode.Datanode__2;
import com.verzinen.ugm.model.datanode.Disk;
import com.verzinen.ugm.model.datanode.Jvm;
import com.verzinen.ugm.model.datanode.JvmMetrics;
import com.verzinen.ugm.model.datanode.Load;
import com.verzinen.ugm.model.datanode.Memory;
import com.verzinen.ugm.model.datanode.Metrics;
import com.verzinen.ugm.model.datanode.MetricsSystem;
import com.verzinen.ugm.model.datanode.Network;
import com.verzinen.ugm.model.datanode.ServiceComponentInfo;

 
@Singleton
@Startup
public class DatanodeClient {
	
	public enum States {BEFORESTARTED, STARTED, PAUSED, SHUTTINGDOWN};
	    
	private States state;

	static String host = "192.168.3.132";
	static String port = "8080";
	static Datanode _datanode = null;
	static long fire_time = System.currentTimeMillis();
	
	
	static List<Memory> _mainMemoryList = new ArrayList<Memory>();
	static List<Memory> _viewMemoryList = new ArrayList<Memory>();
	static int _element_counter = 0;
	static int _view_max_element = 10;
	
	
	static List<Double> _mainTestList = new ArrayList<Double>();
	static List<Double> _viewTestList = new ArrayList<Double>();
	
	
	public DatanodeClient() {
		
		System.out.println("DatanodeClient init ...");
		
		System.out.println("DatanodeClient init ... done");
	}
	
	public Datanode  getDatanode() {
		//System.out.println("getDatanode invoke ...");
		System.out.println("getDatanode invoked ...");
			
		return _datanode;
	}

	@PostConstruct
	public void initialize() {
		state = States.BEFORESTARTED;
		// Perform intialization

		initMemoryList();
		initTest();
		
		get_de_data();
		state = States.STARTED;
		System.out.println("Service Started");
	}
	
	//@Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
	@Schedule(minute = "*/1", hour = "*", persistent = false)
    public void atSchedule() throws InterruptedException {
		
		get_de_data();
		
        System.out.println("DeclarativeScheduler:: In atSchedule() fired get_de_data()");
        
        populateMemoryViewList();
        
        System.out.println("DeclarativeScheduler:: populateMemoryViewList() invoked");
        
    }
	
	

	public void get_de_data() {
		
		try {

			// curl -u admin:admin -H "X-Requested-By: ambari" -X GET
			// http://192.168.3.132:8080/api/v1/clusters/C10H16/services/HDFS/components/DATANODE

			String qry_name = "/api/v1/clusters/C10H16/services/HDFS/components/DATANODE";

			System.out.println("get_de_data qry " + qry_name);

			UGMRestClient _client = new UGMRestClient(host, port);

			String _url = "http://" + host + ":" + port + qry_name;

			fire_time = System.currentTimeMillis();
			String json = _client.basic_auth_client(_url);

			_datanode = JsonParsingUtil.json2DataNode(json);
			
			System.out.println(getServiceComponentInfo().getDisplayName());
			
			// populateMemoryViewList();
			
			// collect memory element
			Memory mm = getMemory();
			_mainMemoryList.add(mm);
			
			System.out.println("get_de_data () ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void terminate() {
		state = States.SHUTTINGDOWN;
		// Perform termination
		System.out.println("DatanodeClient shutdown in progress");
	}

	public States getState() {
		return state;
	}

	public void setState(States state) {
		this.state = state;
	}
	
	public long getFiretime() {
		return fire_time;
	}
	
	
	private void initMemoryList() {
		Memory m = new Memory();
		m.setMemFreeMax(0.0);
	
		for (int i =0 ; i<_view_max_element; i++) {
			_mainMemoryList.add(m);
			_viewMemoryList.add(m);
		}
	}
	
	private void initTest() {
		
		Double d = 0.0;
		
		for (int i =0 ; i<_view_max_element; i++) {
			_mainTestList.add(d);
			_viewTestList.add(d);
		}
		
	}
	
	
	public void populateMemoryViewList() {
		// calculate  _viewMemoryList element < _view_max_element
		// _view_max_element
		
		System.out.println("populateMemoryViewList ... invoke");
		
		//int index = _mainMemoryList.size() - _view_max_element;
		_viewMemoryList.clear();
		
		if (_mainMemoryList.size() > _view_max_element) {
			 int index = _mainMemoryList.size() - _view_max_element;
			 for (int i = 0 ; i< _view_max_element ; i++)
				 _viewMemoryList.add(_mainMemoryList.get(index+i));
		
		}
		
		//_viewMemoryList.add(_mainMemoryList.get(_element_counter));
       // _element_counter++;
        
        System.out.println("populateMemoryViewList ... invoked");
	}
	
	
	private void generateData() {
		
		double degrees = 45.0; 
		  
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
  
        // cos() method to get the cosine value 
        double cosValue = Math.cos(radians); 
        
		Double dd = Math.sin(radians); 
	}
	
	
	
	public String getHref() {
		
		return _datanode.getHref();
		
	}
	
    public ServiceComponentInfo getServiceComponentInfo() {
		
		return _datanode.getServiceComponentInfo();
		
	}

    public Metrics getMetrics() {
		
		return _datanode.getMetrics();
		
	}

    public Cpu getCpu() {
		
  		return _datanode.getMetrics().getCpu();
  		
  	}
  
    public Disk getDisk() {
		
  		return _datanode.getMetrics().getDisk();
  		
  	}
 
    public Memory getMemory() {
 
    	//_datanode.getMetrics().getMemory();
		
    	System.out.println("getMemory ... invoked");
    	
		return _datanode.getMetrics().getMemory();
		
	}
    
    public List<Memory> getViewMemoryList() {
    	
    	System.out.println("getViewMemoryList ... invoked size "+ _viewMemoryList.size());
    	
		return _viewMemoryList;
		
	}
    
    
 
    public Network getNetwork() {
		
		return _datanode.getMetrics().getNetwork();
		
	}
    
    public Datanode__2  getDatanode2() {
		
		return _datanode.getMetrics().getDfs().getDatanode();
		
	}
    
    public JvmMetrics  getJvmMetrics() {
		
		return _datanode.getMetrics().getJvm().getJvmMetrics();
		
	}
    
    public Jvm  getJvm() {
		
		return _datanode.getMetrics().getJvm();
		
	}
    
    public Load  getLoad() {
		
		return _datanode.getMetrics().getLoad();
		
	}
    
    public MetricsSystem  getMetricsSystem() {
		
    	return _datanode.getMetrics().getMetricssystem().getMetricsSystem();
		
	}
    
    
    
  
}
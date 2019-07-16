package com.verzinen.telyu.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.verzinen.telyu.model.yarn.ConfigYarn;
import com.verzinen.telyu.model.yarn.Configuration;
//import com.verzinen.telyu.model.yarn.Configuration;
import com.verzinen.telyu.model.yarn.Item;
import com.verzinen.ugm.ejb.UGMRestClient;
 
@Singleton
@Startup
public class YarnDataClient {
	
	public enum States {BEFORESTARTED, STARTED, PAUSED, SHUTTINGDOWN};
	    
	private States state;

	static String host = "192.168.3.132";
	static String port = "8080";
	static long fire_time = System.currentTimeMillis();
	
	static ConfigYarn _configYarndata = null;
	
	static List<Item> _items = null;
	
	static Item _item = null;
	
	
	
	
	public YarnDataClient() {
		
		System.out.println("DatanodeClient init ...");
		
		System.out.println("DatanodeClient init ... done");
	}
	


	@PostConstruct
	public void initialize() {
		state = States.BEFORESTARTED;
		// Perform intialization
		get_de_data();
		state = States.STARTED;
		System.out.println("Service Started");
		
		
	}
	
	//@Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
	@Schedule(minute = "*/5", hour = "*", persistent = false)
    public void atSchedule() throws InterruptedException {
		
		get_de_data();
		
        System.out.println("YarnDataClient: In atSchedule() fired get_de_data()");
        
    }
	
	

	private void get_de_data() {
		
		try {

			//   "href" : "http://192.168.3.132:8080/api/v1/clusters/C10H16/configurations/service_config_versions/?service_name=YARN",

			String qry_name = "/api/v1/clusters/C10H16/configurations/service_config_versions/?service_name=YARN";
					
			System.out.println("get_de_data qry " + qry_name);

			UGMRestClient _client = new UGMRestClient(host, port);

			String _url = "http://" + host + ":" + port + qry_name;

			fire_time = System.currentTimeMillis();
			
			String json = _client.basic_auth_client(_url);
			
			//System.out.println(json);

			_configYarndata = PojoUtil.json2ConfigYarn(json);
						
			System.out.println("YarnDataClient : get_de_data () ... done");
			
			_items = _configYarndata.getItems();
			
			_item = getCurrentItem();

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
	
	
	public String getHref() {
		
		return _configYarndata.getHref();
		
	}
	
	public List<Item> getItems() {
		
		return _items ;
		
	}
	
	public Item getItem() {
		
		return _item ;
		
	}
	
	
	public Item getCurrentItem() {
		
		// current item
		
		 Item item = _items.stream()                
				 .filter(e -> e.getIsCurrent()) 
				  .findAny()                       
	              .orElse(null);    	
	          	
		
		 System.out.println("getIsCurrent: " + item.getIsCurrent());
		
		
		return item ;
		
	}
	
	
	public String  getClusterName2() {
    
		
		_item.getClusterName();
		_item.getCreatetime();
		_item.getGroupId();
		_item.getGroupName();
		_item.getHref();
		_item.getServiceConfigVersion();
		_item.getServiceConfigVersionNote();
		_item.getStackId();
		
		List<Configuration> _configurations = _item.getConfigurations();
		List<Object> _hosts = _item.getHosts();
		
		System.out.println("_item size = "+ _items.size());
		System.out.println("_configurations size = "+ _configurations.size());
		
		for (Configuration c: _configurations) {
			
			System.out.println(c.getTag());
			
		}
		
		
		
		
		return  _items.size() +":"+ _configurations.size() +":"+ _hosts.size();
		
	}
		
		
	

	

  
}
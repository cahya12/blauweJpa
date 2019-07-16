package com.verzinen.ugm.ejb;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;


import com.verzinen.ugm.ejb.JMXRestClient;
import com.verzinen.ugm.model.jmx.Bean;
import com.verzinen.ugm.model.jmx.Jmx;

 
@Singleton
@Startup
public class JMXRestClient {
	
	public enum States {BEFORESTARTED, STARTED, PAUSED, SHUTTINGDOWN};
	    
	private States state;

	String host = "192.168.3.132";
	String port = "50075";
	
	static Jmx _jmx = null;
	
	static long fire_time = System.currentTimeMillis();
	
	
	public JMXRestClient() {
		
		System.out.println("JMXRestClient init ...");
		
		System.out.println("JMXRestClient init ... done");
	}
	
	public JMXRestClient(String host, String port) {
		
		System.out.println("JMXRestClient init ...");
		
		this.host = host;
		this.port = port;
		
		System.out.println("JMXRestClient init ... done");
	}
	
	
	public Jmx  getJMXData() {
		System.out.println("getJMXData invoked ...");
			
		return _jmx;
	}

	@PostConstruct
	public void initialize() {
		state = States.BEFORESTARTED;
		// Perform intialization
		get_jmxdata();
		state = States.STARTED;
		System.out.println("Service Started");
	}
	
	// fire every 5 minut
	
	//@Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
	@Schedule(minute = "*/5", hour = "*", persistent = false)
    public void atSchedule() throws InterruptedException {
		
		get_jmxdata();
		
        System.out.println("DeclarativeScheduler:: In atSchedule() fired get_jmxdata()");
        
    }
	
	

	public void get_jmxdata() {
		
		try {
			// http://192.168.3.132:50075/jmx
			
			String qry_name = "/jmx";

			System.out.println("get_jmxdata qry " + qry_name);

			UGMRestClient _client = new UGMRestClient(host, port);

			String _url = "http://" + host + ":" + port + qry_name;

			fire_time = System.currentTimeMillis();
			//String json = _client.basic_auth_client(_url);
			String json = _client.ambari_plain_client(_url);

			_jmx = JsonParsingUtil.json2JMX(json);
			
			
			System.out.println(getOperatingSystemData().getBeanname());
			
			System.out.println("get_jmxdata() ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void terminate() {
		state = States.SHUTTINGDOWN;
		// Perform termination
		System.out.println("JMXRestClient shutdown in progress");
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
	
	public Bean getBeanData(String beanname) {
		
		//i.e java.lang:type=OperatingSystem

		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> beanname.equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}
	

	public Bean getOperatingSystemData() {
		
		//	java.lang:type=OperatingSystem

		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=OperatingSystem".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		System.out.println(_de_bean.getBeanname());
		System.out.println(_de_bean.getProcessCpuLoad());
		System.out.println(_de_bean.getProcessCpuTime());
		
		return _de_bean;
	}
	
	public Bean getRuntimeData() {
		
		//	"java.lang:type=Runtime"

		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=Runtime".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}
    
	public Bean getThreadingData() {
		
		//	"java.lang:type=Threading"

		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=Threading".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}
	
public Bean getCompilationData() {
		
		// "java.lang:type=Compilation"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=Compilation".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getClassLoadingData() {
		
		//	"java.lang:type=ClassLoading"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=ClassLoading".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMemoryData() {
		
		//	"java.lang:type=Memory"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=Memory".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}


	public Bean getGCParNew() {
		
		//"java.lang:type=GarbageCollector,name=ParNew"
		
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=GarbageCollector,name=ParNew".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}


	public Bean getGCConcurrentMarkSweep() {
		
		//	"java.lang:type=GarbageCollector,name=ConcurrentMarkSweep"
		
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=GarbageCollector,name=ConcurrentMarkSweep".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}	
	
public Bean getMMCodeCacheManager() {
	
	//	"java.lang:type=MemoryManager,name=CodeCacheManager"

	Bean _de_bean  = _jmx.getBeans().stream()
			  .filter(bean -> "java.lang:type=MemoryManager,name=CodeCacheManager".equals(bean.getBeanname()))
			  .findAny()
			  .orElse(null);
	
	return _de_bean;
}


	public Bean getDNJvmMetrics() {
		
		//	Hadoop:service=DataNode,name=JvmMetrics 
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "Hadoop:service=DataNode,name=JvmMetrics".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		
		System.out.println(_de_bean.getBeanname());
		System.out.println(_de_bean.getName());
		System.out.println(_de_bean.getDatanodeHostname());
		System.out.println(_de_bean.getModelerType());
		
		return _de_bean;
	}


	public Bean getDNRpcActivityForPort8010() {
		
		//	"Hadoop:service=DataNode,name=RpcActivityForPort8010"
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "Hadoop:service=DataNode,name=RpcActivityForPort8010".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getDNFSDatasetState() {
		
		//	"Hadoop:service=DataNode,name=FSDatasetState"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "Hadoop:service=DataNode,name=FSDatasetState".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}


	public Bean getDNMetricsSystemStats() {
		
		//	"Hadoop:service=DataNode,name=MetricsSystem,sub=Stats"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "Hadoop:service=DataNode,name=MetricsSystem,sub=Stats".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}


	public Bean getDNDataNodeInfo() {
		
		//	"Hadoop:service=DataNode,name=DataNodeInfo"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "Hadoop:service=DataNode,name=DataNodeInfo".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}


	public Bean getDNMetricsSystemControl() {
		
		//	Hadoop:service=DataNode,name=MetricsSystem,sub=Control"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "Hadoop:service=DataNode,name=MetricsSystem,sub=Control".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	
	public Bean getDNUgiMetrics() {
		
		//	"Hadoop:service=DataNode,name=UgiMetrics"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "Hadoop:service=DataNode,name=UgiMetrics".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getJMMBeanServerDelegate() {
		
		//	"JMImplementation:type=MBeanServerDelegate"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "JMImplementation:type=MBeanServerDelegate".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMGTDiagnosticCommand() {
		
		//"com.sun.management:type=DiagnosticCommand"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "com.sun.management:type=DiagnosticCommand".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMGTHotSpotDiagnostic() {
		
		//	"com.sun.management:type=HotSpotDiagnostic"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "com.sun.management:type=HotSpotDiagnostic".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}


	public Bean getBPMapped() {
		
		//	"java.nio:type=BufferPool,name=mapped"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.nio:type=BufferPool,name=mapped".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getBPDirect() {
		
		//	"java.nio:type=BufferPool,name=direct"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.nio:type=BufferPool,name=direct".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMPMetaspace() {
		
		// "java.lang:type=MemoryPool,name=Metaspace"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=MemoryPool,name=Metaspace".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMPCodeCache() {
		
		// "java.lang:type=MemoryPool,name=Code Cache"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=MemoryPool,name=Code Cache".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMPParEdenSpace() {
		
		// ""java.lang:type=MemoryPool,name=Par Eden Space"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=MemoryPool,name=Par Eden Space".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMPCompressedClassSpace() {
		
		// "java.lang:type=MemoryPool,name=Compressed Class Space"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=MemoryPool,name=Compressed Class Space".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

	public Bean getMPParSurvivorSpace() {
		
		// "java.lang:type=MemoryPool,name=Par Survivor Space"
	
		Bean _de_bean  = _jmx.getBeans().stream()
				  .filter(bean -> "java.lang:type=MemoryPool,name=Par Survivor Space".equals(bean.getBeanname()))
				  .findAny()
				  .orElse(null);
		
		return _de_bean;
	}

public Bean getMPCMSOldGen() {
	
	// "java.lang:type=MemoryPool,name=CMS Old Gen"

	Bean _de_bean  = _jmx.getBeans().stream()
			  .filter(bean -> "java.lang:type=MemoryPool,name=CMS Old Gen".equals(bean.getBeanname()))
			  .findAny()
			  .orElse(null);
	
	return _de_bean;
}

  
}
package com.verzinen.ugm.model.error;


public class Application {
	  private String name;
	  private String modelerType;
	  private float OpenFileDescriptorCount;
	  private float MaxFileDescriptorCount;
	  private float CommittedVirtualMemorySize;
	  private float TotalSwapSpaceSize;
	  private float FreeSwapSpaceSize;
	  private float ProcessCpuTime;
	  private float FreePhysicalMemorySize;
	  private float TotalPhysicalMemorySize;
	  private float SystemCpuLoad;
	  private float ProcessCpuLoad;
	  private float AvailableProcessors;
	  private String Arch;
	  private String Version;
	  private float SystemLoadAverage;
	  private String Name;
	  private String ObjectName;


	 // Getter Methods 

	  public String getBeanName() {
	    return name;
	  }

	  public String getModelerType() {
	    return modelerType;
	  }

	  public float getOpenFileDescriptorCount() {
	    return OpenFileDescriptorCount;
	  }

	  public float getMaxFileDescriptorCount() {
	    return MaxFileDescriptorCount;
	  }

	  public float getCommittedVirtualMemorySize() {
	    return CommittedVirtualMemorySize;
	  }

	  public float getTotalSwapSpaceSize() {
	    return TotalSwapSpaceSize;
	  }

	  public float getFreeSwapSpaceSize() {
	    return FreeSwapSpaceSize;
	  }

	  public float getProcessCpuTime() {
	    return ProcessCpuTime;
	  }

	  public float getFreePhysicalMemorySize() {
	    return FreePhysicalMemorySize;
	  }

	  public float getTotalPhysicalMemorySize() {
	    return TotalPhysicalMemorySize;
	  }

	  public float getSystemCpuLoad() {
	    return SystemCpuLoad;
	  }

	  public float getProcessCpuLoad() {
	    return ProcessCpuLoad;
	  }

	  public float getAvailableProcessors() {
	    return AvailableProcessors;
	  }

	  public String getArch() {
	    return Arch;
	  }

	  public String getVersion() {
	    return Version;
	  }

	  public float getSystemLoadAverage() {
	    return SystemLoadAverage;
	  }

	  public String getName() {
	    return Name;
	  }

	  public String getObjectName() {
	    return ObjectName;
	  }

	 // Setter Methods 

	  public void setBeanName( String name ) {
	    this.name = name;
	  }

	  public void setModelerType( String modelerType ) {
	    this.modelerType = modelerType;
	  }

	  public void setOpenFileDescriptorCount( float OpenFileDescriptorCount ) {
	    this.OpenFileDescriptorCount = OpenFileDescriptorCount;
	  }

	  public void setMaxFileDescriptorCount( float MaxFileDescriptorCount ) {
	    this.MaxFileDescriptorCount = MaxFileDescriptorCount;
	  }

	  public void setCommittedVirtualMemorySize( float CommittedVirtualMemorySize ) {
	    this.CommittedVirtualMemorySize = CommittedVirtualMemorySize;
	  }

	  public void setTotalSwapSpaceSize( float TotalSwapSpaceSize ) {
	    this.TotalSwapSpaceSize = TotalSwapSpaceSize;
	  }

	  public void setFreeSwapSpaceSize( float FreeSwapSpaceSize ) {
	    this.FreeSwapSpaceSize = FreeSwapSpaceSize;
	  }

	  public void setProcessCpuTime( float ProcessCpuTime ) {
	    this.ProcessCpuTime = ProcessCpuTime;
	  }

	  public void setFreePhysicalMemorySize( float FreePhysicalMemorySize ) {
	    this.FreePhysicalMemorySize = FreePhysicalMemorySize;
	  }

	  public void setTotalPhysicalMemorySize( float TotalPhysicalMemorySize ) {
	    this.TotalPhysicalMemorySize = TotalPhysicalMemorySize;
	  }

	  public void setSystemCpuLoad( float SystemCpuLoad ) {
	    this.SystemCpuLoad = SystemCpuLoad;
	  }

	  public void setProcessCpuLoad( float ProcessCpuLoad ) {
	    this.ProcessCpuLoad = ProcessCpuLoad;
	  }

	  public void setAvailableProcessors( float AvailableProcessors ) {
	    this.AvailableProcessors = AvailableProcessors;
	  }

	  public void setArch( String Arch ) {
	    this.Arch = Arch;
	  }

	  public void setVersion( String Version ) {
	    this.Version = Version;
	  }

	  public void setSystemLoadAverage( float SystemLoadAverage ) {
	    this.SystemLoadAverage = SystemLoadAverage;
	  }

	  public void setName( String Name ) {
	    this.Name = Name;
	  }

	  public void setObjectName( String ObjectName ) {
	    this.ObjectName = ObjectName;
	  }
	}
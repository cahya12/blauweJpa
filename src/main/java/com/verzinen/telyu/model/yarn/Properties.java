
package com.verzinen.telyu.model.yarn;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("yarn.resource-types")
    @Expose
    private String yarnResourceTypes;
    @SerializedName("yarn.resource-types.yarn.io_gpu.maximum-allocation")
    @Expose
    private String yarnResourceTypesYarnIoGpuMaximumAllocation;
    @SerializedName("cgroup_root")
    @Expose
    private String cgroupRoot;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("docker_allowed_devices")
    @Expose
    private String dockerAllowedDevices;
    @SerializedName("docker_allowed_ro-mounts")
    @Expose
    private String dockerAllowedRoMounts;
    @SerializedName("docker_allowed_rw-mounts")
    @Expose
    private String dockerAllowedRwMounts;
    @SerializedName("docker_allowed_volume-drivers")
    @Expose
    private String dockerAllowedVolumeDrivers;
    @SerializedName("docker_binary")
    @Expose
    private String dockerBinary;
    @SerializedName("docker_module_enabled")
    @Expose
    private String dockerModuleEnabled;
    @SerializedName("docker_privileged-containers_enabled")
    @Expose
    private String dockerPrivilegedContainersEnabled;
    @SerializedName("docker_trusted_registries")
    @Expose
    private String dockerTrustedRegistries;
    @SerializedName("gpu_module_enabled")
    @Expose
    private String gpuModuleEnabled;
    @SerializedName("min_user_id")
    @Expose
    private String minUserId;
    @SerializedName("yarn_hierarchy")
    @Expose
    private String yarnHierarchy;
    @SerializedName("apptimelineserver_heapsize")
    @Expose
    private String apptimelineserverHeapsize;
    @SerializedName("is_supported_yarn_ranger")
    @Expose
    private String isSupportedYarnRanger;
    @SerializedName("nodemanager_heapsize")
    @Expose
    private String nodemanagerHeapsize;
    @SerializedName("registry.dns.bind-port")
    @Expose
    private String registryDnsBindPort;
    @SerializedName("resourcemanager_heapsize")
    @Expose
    private String resourcemanagerHeapsize;
    @SerializedName("service_check.queue.name")
    @Expose
    private String serviceCheckQueueName;
    @SerializedName("yarn_ats_user")
    @Expose
    private String yarnAtsUser;
    @SerializedName("yarn_cgroups_enabled")
    @Expose
    private String yarnCgroupsEnabled;
    @SerializedName("yarn_heapsize")
    @Expose
    private String yarnHeapsize;
    @SerializedName("yarn_log_dir_prefix")
    @Expose
    private String yarnLogDirPrefix;
    @SerializedName("yarn_pid_dir_prefix")
    @Expose
    private String yarnPidDirPrefix;
    @SerializedName("yarn_user")
    @Expose
    private String yarnUser;
    @SerializedName("yarn_user_nofile_limit")
    @Expose
    private String yarnUserNofileLimit;
    @SerializedName("yarn_user_nproc_limit")
    @Expose
    private String yarnUserNprocLimit;
    @SerializedName("hbase_java_io_tmpdir")
    @Expose
    private String hbaseJavaIoTmpdir;
    @SerializedName("is_hbase_system_service_launch")
    @Expose
    private String isHbaseSystemServiceLaunch;
    @SerializedName("yarn_hbase_client_containers")
    @Expose
    private String yarnHbaseClientContainers;
    @SerializedName("yarn_hbase_client_cpu")
    @Expose
    private String yarnHbaseClientCpu;
    @SerializedName("yarn_hbase_client_memory")
    @Expose
    private String yarnHbaseClientMemory;
    @SerializedName("yarn_hbase_heap_memory_factor")
    @Expose
    private String yarnHbaseHeapMemoryFactor;
    @SerializedName("yarn_hbase_master_containers")
    @Expose
    private String yarnHbaseMasterContainers;
    @SerializedName("yarn_hbase_master_cpu")
    @Expose
    private String yarnHbaseMasterCpu;
    @SerializedName("yarn_hbase_master_memory")
    @Expose
    private String yarnHbaseMasterMemory;
    @SerializedName("yarn_hbase_pid_dir_prefix")
    @Expose
    private String yarnHbasePidDirPrefix;
    @SerializedName("yarn_hbase_regionserver_containers")
    @Expose
    private String yarnHbaseRegionserverContainers;
    @SerializedName("yarn_hbase_regionserver_cpu")
    @Expose
    private String yarnHbaseRegionserverCpu;
    @SerializedName("yarn_hbase_regionserver_memory")
    @Expose
    private String yarnHbaseRegionserverMemory;
    @SerializedName("yarn_hbase_system_service_launch_mode")
    @Expose
    private String yarnHbaseSystemServiceLaunchMode;
    @SerializedName("yarn_hbase_system_service_queue_name")
    @Expose
    private String yarnHbaseSystemServiceQueueName;
    @SerializedName("hbase_log_maxbackupindex")
    @Expose
    private String hbaseLogMaxbackupindex;
    @SerializedName("hbase_log_maxfilesize")
    @Expose
    private String hbaseLogMaxfilesize;
    @SerializedName("hbase_security_log_maxbackupindex")
    @Expose
    private String hbaseSecurityLogMaxbackupindex;
    @SerializedName("hbase_security_log_maxfilesize")
    @Expose
    private String hbaseSecurityLogMaxfilesize;
    @SerializedName("security.admin.protocol.acl")
    @Expose
    private String securityAdminProtocolAcl;
    @SerializedName("security.client.protocol.acl")
    @Expose
    private String securityClientProtocolAcl;
    @SerializedName("security.masterregion.protocol.acl")
    @Expose
    private String securityMasterregionProtocolAcl;
    @SerializedName("dfs.domain.socket.path")
    @Expose
    private String dfsDomainSocketPath;
    @SerializedName("hbase.bucketcache.ioengine")
    @Expose
    private String hbaseBucketcacheIoengine;
    @SerializedName("hbase.bucketcache.percentage.in.combinedcache")
    @Expose
    private String hbaseBucketcachePercentageInCombinedcache;
    @SerializedName("hbase.bucketcache.size")
    @Expose
    private String hbaseBucketcacheSize;
    @SerializedName("hbase.client.keyvalue.maxsize")
    @Expose
    private String hbaseClientKeyvalueMaxsize;
    @SerializedName("hbase.client.retries.number")
    @Expose
    private String hbaseClientRetriesNumber;
    @SerializedName("hbase.client.scanner.caching")
    @Expose
    private String hbaseClientScannerCaching;
    @SerializedName("hbase.cluster.distributed")
    @Expose
    private String hbaseClusterDistributed;
    @SerializedName("hbase.coprocessor.master.classes")
    @Expose
    private String hbaseCoprocessorMasterClasses;
    @SerializedName("hbase.coprocessor.region.classes")
    @Expose
    private String hbaseCoprocessorRegionClasses;
    @SerializedName("hbase.coprocessor.regionserver.classes")
    @Expose
    private String hbaseCoprocessorRegionserverClasses;
    @SerializedName("hbase.defaults.for.version.skip")
    @Expose
    private String hbaseDefaultsForVersionSkip;
    @SerializedName("hbase.hregion.majorcompaction")
    @Expose
    private String hbaseHregionMajorcompaction;
    @SerializedName("hbase.hregion.majorcompaction.jitter")
    @Expose
    private String hbaseHregionMajorcompactionJitter;
    @SerializedName("hbase.hregion.max.filesize")
    @Expose
    private String hbaseHregionMaxFilesize;
    @SerializedName("hbase.hregion.memstore.block.multiplier")
    @Expose
    private String hbaseHregionMemstoreBlockMultiplier;
    @SerializedName("hbase.hregion.memstore.flush.size")
    @Expose
    private String hbaseHregionMemstoreFlushSize;
    @SerializedName("hbase.hregion.memstore.mslab.enabled")
    @Expose
    private String hbaseHregionMemstoreMslabEnabled;
    @SerializedName("hbase.hstore.blockingStoreFiles")
    @Expose
    private String hbaseHstoreBlockingStoreFiles;
    @SerializedName("hbase.hstore.compaction.max")
    @Expose
    private String hbaseHstoreCompactionMax;
    @SerializedName("hbase.hstore.compactionThreshold")
    @Expose
    private String hbaseHstoreCompactionThreshold;
    @SerializedName("hbase.local.dir")
    @Expose
    private String hbaseLocalDir;
    @SerializedName("hbase.master.info.bindAddress")
    @Expose
    private String hbaseMasterInfoBindAddress;
    @SerializedName("hbase.master.info.port")
    @Expose
    private String hbaseMasterInfoPort;
    @SerializedName("hbase.master.namespace.init.timeout")
    @Expose
    private String hbaseMasterNamespaceInitTimeout;
    @SerializedName("hbase.master.port")
    @Expose
    private String hbaseMasterPort;
    @SerializedName("hbase.master.ui.readonly")
    @Expose
    private String hbaseMasterUiReadonly;
    @SerializedName("hbase.master.wait.on.regionservers.timeout")
    @Expose
    private String hbaseMasterWaitOnRegionserversTimeout;
    @SerializedName("hbase.regionserver.executor.openregion.threads")
    @Expose
    private String hbaseRegionserverExecutorOpenregionThreads;
    @SerializedName("hbase.regionserver.global.memstore.size")
    @Expose
    private String hbaseRegionserverGlobalMemstoreSize;
    @SerializedName("hbase.regionserver.handler.count")
    @Expose
    private String hbaseRegionserverHandlerCount;
    @SerializedName("hbase.regionserver.info.port")
    @Expose
    private String hbaseRegionserverInfoPort;
    @SerializedName("hbase.regionserver.port")
    @Expose
    private String hbaseRegionserverPort;
    @SerializedName("hbase.rootdir")
    @Expose
    private String hbaseRootdir;
    @SerializedName("hbase.rpc.protection")
    @Expose
    private String hbaseRpcProtection;
    @SerializedName("hbase.rpc.timeout")
    @Expose
    private String hbaseRpcTimeout;
    @SerializedName("hbase.security.authentication")
    @Expose
    private String hbaseSecurityAuthentication;
    @SerializedName("hbase.security.authorization")
    @Expose
    private String hbaseSecurityAuthorization;
    @SerializedName("hbase.superuser")
    @Expose
    private String hbaseSuperuser;
    @SerializedName("hbase.tmp.dir")
    @Expose
    private String hbaseTmpDir;
    @SerializedName("hbase.zookeeper.property.clientPort")
    @Expose
    private String hbaseZookeeperPropertyClientPort;
    @SerializedName("hbase.zookeeper.quorum")
    @Expose
    private String hbaseZookeeperQuorum;
    @SerializedName("hbase.zookeeper.useMulti")
    @Expose
    private String hbaseZookeeperUseMulti;
    @SerializedName("hfile.block.cache.size")
    @Expose
    private String hfileBlockCacheSize;
    @SerializedName("zookeeper.recovery.retry")
    @Expose
    private String zookeeperRecoveryRetry;
    @SerializedName("zookeeper.session.timeout")
    @Expose
    private String zookeeperSessionTimeout;
    @SerializedName("zookeeper.znode.parent")
    @Expose
    private String zookeeperZnodeParent;
    @SerializedName("yarn_rm_summary_log_max_backup_size")
    @Expose
    private String yarnRmSummaryLogMaxBackupSize;
    @SerializedName("yarn_rm_summary_log_number_of_backup_files")
    @Expose
    private String yarnRmSummaryLogNumberOfBackupFiles;
    @SerializedName("yarn.scheduler.capacity.default.minimum-user-limit-percent")
    @Expose
    private String yarnSchedulerCapacityDefaultMinimumUserLimitPercent;
    @SerializedName("yarn.scheduler.capacity.maximum-am-resource-percent")
    @Expose
    private String yarnSchedulerCapacityMaximumAmResourcePercent;
    @SerializedName("yarn.scheduler.capacity.maximum-applications")
    @Expose
    private String yarnSchedulerCapacityMaximumApplications;
    @SerializedName("yarn.scheduler.capacity.node-locality-delay")
    @Expose
    private String yarnSchedulerCapacityNodeLocalityDelay;
    @SerializedName("yarn.scheduler.capacity.resource-calculator")
    @Expose
    private String yarnSchedulerCapacityResourceCalculator;
    @SerializedName("yarn.scheduler.capacity.root.accessible-node-labels")
    @Expose
    private String yarnSchedulerCapacityRootAccessibleNodeLabels;
    @SerializedName("yarn.scheduler.capacity.root.acl_administer_queue")
    @Expose
    private String yarnSchedulerCapacityRootAclAdministerQueue;
    @SerializedName("yarn.scheduler.capacity.root.acl_submit_applications")
    @Expose
    private String yarnSchedulerCapacityRootAclSubmitApplications;
    @SerializedName("yarn.scheduler.capacity.root.capacity")
    @Expose
    private String yarnSchedulerCapacityRootCapacity;
    @SerializedName("yarn.scheduler.capacity.root.default.acl_administer_jobs")
    @Expose
    private String yarnSchedulerCapacityRootDefaultAclAdministerJobs;
    @SerializedName("yarn.scheduler.capacity.root.default.acl_submit_applications")
    @Expose
    private String yarnSchedulerCapacityRootDefaultAclSubmitApplications;
    @SerializedName("yarn.scheduler.capacity.root.default.capacity")
    @Expose
    private String yarnSchedulerCapacityRootDefaultCapacity;
    @SerializedName("yarn.scheduler.capacity.root.default.maximum-capacity")
    @Expose
    private String yarnSchedulerCapacityRootDefaultMaximumCapacity;
    @SerializedName("yarn.scheduler.capacity.root.default.state")
    @Expose
    private String yarnSchedulerCapacityRootDefaultState;
    @SerializedName("yarn.scheduler.capacity.root.default.user-limit-factor")
    @Expose
    private String yarnSchedulerCapacityRootDefaultUserLimitFactor;
    @SerializedName("yarn.scheduler.capacity.root.queues")
    @Expose
    private String yarnSchedulerCapacityRootQueues;
    @SerializedName("yarn.scheduler.capacity.schedule-asynchronously.enable")
    @Expose
    private String yarnSchedulerCapacityScheduleAsynchronouslyEnable;
    @SerializedName("yarn.scheduler.capacity.schedule-asynchronously.maximum-threads")
    @Expose
    private String yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads;
    @SerializedName("yarn.scheduler.capacity.schedule-asynchronously.scheduling-interval-ms")
    @Expose
    private String yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs;
    @SerializedName("hadoop.http.cross-origin.allowed-origins")
    @Expose
    private String hadoopHttpCrossOriginAllowedOrigins;
    @SerializedName("hadoop.registry.dns.bind-address")
    @Expose
    private String hadoopRegistryDnsBindAddress;
    @SerializedName("hadoop.registry.dns.bind-port")
    @Expose
    private String hadoopRegistryDnsBindPort;
    @SerializedName("hadoop.registry.dns.domain-name")
    @Expose
    private String hadoopRegistryDnsDomainName;
    @SerializedName("hadoop.registry.dns.enabled")
    @Expose
    private String hadoopRegistryDnsEnabled;
    @SerializedName("hadoop.registry.dns.zone-mask")
    @Expose
    private String hadoopRegistryDnsZoneMask;
    @SerializedName("hadoop.registry.dns.zone-subnet")
    @Expose
    private String hadoopRegistryDnsZoneSubnet;
    @SerializedName("hadoop.registry.zk.quorum")
    @Expose
    private String hadoopRegistryZkQuorum;
    @SerializedName("manage.include.files")
    @Expose
    private String manageIncludeFiles;
    @SerializedName("yarn.acl.enable")
    @Expose
    private String yarnAclEnable;
    @SerializedName("yarn.admin.acl")
    @Expose
    private String yarnAdminAcl;
    @SerializedName("yarn.application.classpath")
    @Expose
    private String yarnApplicationClasspath;
    @SerializedName("yarn.client.nodemanager-connect.max-wait-ms")
    @Expose
    private String yarnClientNodemanagerConnectMaxWaitMs;
    @SerializedName("yarn.client.nodemanager-connect.retry-interval-ms")
    @Expose
    private String yarnClientNodemanagerConnectRetryIntervalMs;
    @SerializedName("yarn.http.policy")
    @Expose
    private String yarnHttpPolicy;
    @SerializedName("yarn.log-aggregation-enable")
    @Expose
    private String yarnLogAggregationEnable;
    @SerializedName("yarn.log-aggregation.retain-seconds")
    @Expose
    private String yarnLogAggregationRetainSeconds;
    @SerializedName("yarn.log.server.url")
    @Expose
    private String yarnLogServerUrl;
    @SerializedName("yarn.log.server.web-service.url")
    @Expose
    private String yarnLogServerWebServiceUrl;
    @SerializedName("yarn.node-labels.enabled")
    @Expose
    private String yarnNodeLabelsEnabled;
    @SerializedName("yarn.node-labels.fs-store.retry-policy-spec")
    @Expose
    private String yarnNodeLabelsFsStoreRetryPolicySpec;
    @SerializedName("yarn.node-labels.fs-store.root-dir")
    @Expose
    private String yarnNodeLabelsFsStoreRootDir;
    @SerializedName("yarn.nodemanager.address")
    @Expose
    private String yarnNodemanagerAddress;
    @SerializedName("yarn.nodemanager.admin-env")
    @Expose
    private String yarnNodemanagerAdminEnv;
    @SerializedName("yarn.nodemanager.aux-services")
    @Expose
    private String yarnNodemanagerAuxServices;
    @SerializedName("yarn.nodemanager.aux-services.mapreduce_shuffle.class")
    @Expose
    private String yarnNodemanagerAuxServicesMapreduceShuffleClass;
    @SerializedName("yarn.nodemanager.aux-services.spark2_shuffle.class")
    @Expose
    private String yarnNodemanagerAuxServicesSpark2ShuffleClass;
    @SerializedName("yarn.nodemanager.aux-services.spark2_shuffle.classpath")
    @Expose
    private String yarnNodemanagerAuxServicesSpark2ShuffleClasspath;
    @SerializedName("yarn.nodemanager.aux-services.spark_shuffle.class")
    @Expose
    private String yarnNodemanagerAuxServicesSparkShuffleClass;
    @SerializedName("yarn.nodemanager.aux-services.spark_shuffle.classpath")
    @Expose
    private String yarnNodemanagerAuxServicesSparkShuffleClasspath;
    @SerializedName("yarn.nodemanager.aux-services.timeline_collector.class")
    @Expose
    private String yarnNodemanagerAuxServicesTimelineCollectorClass;
    @SerializedName("yarn.nodemanager.bind-host")
    @Expose
    private String yarnNodemanagerBindHost;
    @SerializedName("yarn.nodemanager.container-executor.class")
    @Expose
    private String yarnNodemanagerContainerExecutorClass;
    @SerializedName("yarn.nodemanager.container-metrics.unregister-delay-ms")
    @Expose
    private String yarnNodemanagerContainerMetricsUnregisterDelayMs;
    @SerializedName("yarn.nodemanager.container-monitor.interval-ms")
    @Expose
    private String yarnNodemanagerContainerMonitorIntervalMs;
    @SerializedName("yarn.nodemanager.delete.debug-delay-sec")
    @Expose
    private String yarnNodemanagerDeleteDebugDelaySec;
    @SerializedName("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage")
    @Expose
    private String yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage;
    @SerializedName("yarn.nodemanager.disk-health-checker.min-free-space-per-disk-mb")
    @Expose
    private String yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb;
    @SerializedName("yarn.nodemanager.disk-health-checker.min-healthy-disks")
    @Expose
    private String yarnNodemanagerDiskHealthCheckerMinHealthyDisks;
    @SerializedName("yarn.nodemanager.health-checker.interval-ms")
    @Expose
    private String yarnNodemanagerHealthCheckerIntervalMs;
    @SerializedName("yarn.nodemanager.health-checker.script.timeout-ms")
    @Expose
    private String yarnNodemanagerHealthCheckerScriptTimeoutMs;
    @SerializedName("yarn.nodemanager.linux-container-executor.cgroups.strict-resource-usage")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage;
    @SerializedName("yarn.nodemanager.linux-container-executor.group")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorGroup;
    @SerializedName("yarn.nodemanager.linux-container-executor.nonsecure-mode.limit-users")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers;
    @SerializedName("yarn.nodemanager.local-dirs")
    @Expose
    private String yarnNodemanagerLocalDirs;
    @SerializedName("yarn.nodemanager.log-aggregation.compression-type")
    @Expose
    private String yarnNodemanagerLogAggregationCompressionType;
    @SerializedName("yarn.nodemanager.log-aggregation.debug-enabled")
    @Expose
    private String yarnNodemanagerLogAggregationDebugEnabled;
    @SerializedName("yarn.nodemanager.log-aggregation.num-log-files-per-app")
    @Expose
    private String yarnNodemanagerLogAggregationNumLogFilesPerApp;
    @SerializedName("yarn.nodemanager.log-aggregation.roll-monitoring-interval-seconds")
    @Expose
    private String yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds;
    @SerializedName("yarn.nodemanager.log-dirs")
    @Expose
    private String yarnNodemanagerLogDirs;
    @SerializedName("yarn.nodemanager.log.retain-seconds")
    @Expose
    private String yarnNodemanagerLogRetainSeconds;
    @SerializedName("yarn.nodemanager.recovery.dir")
    @Expose
    private String yarnNodemanagerRecoveryDir;
    @SerializedName("yarn.nodemanager.recovery.enabled")
    @Expose
    private String yarnNodemanagerRecoveryEnabled;
    @SerializedName("yarn.nodemanager.recovery.supervised")
    @Expose
    private String yarnNodemanagerRecoverySupervised;
    @SerializedName("yarn.nodemanager.remote-app-log-dir")
    @Expose
    private String yarnNodemanagerRemoteAppLogDir;
    @SerializedName("yarn.nodemanager.remote-app-log-dir-suffix")
    @Expose
    private String yarnNodemanagerRemoteAppLogDirSuffix;
    @SerializedName("yarn.nodemanager.resource-plugins")
    @Expose
    private String yarnNodemanagerResourcePlugins;
    @SerializedName("yarn.nodemanager.resource-plugins.gpu.allowed-gpu-devices")
    @Expose
    private String yarnNodemanagerResourcePluginsGpuAllowedGpuDevices;
    @SerializedName("yarn.nodemanager.resource-plugins.gpu.docker-plugin")
    @Expose
    private String yarnNodemanagerResourcePluginsGpuDockerPlugin;
    @SerializedName("yarn.nodemanager.resource-plugins.gpu.docker-plugin.nvidiadocker-v1.endpoint")
    @Expose
    private String yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint;
    @SerializedName("yarn.nodemanager.resource-plugins.gpu.path-to-discovery-executables")
    @Expose
    private String yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables;
    @SerializedName("yarn.nodemanager.resource.cpu-vcores")
    @Expose
    private String yarnNodemanagerResourceCpuVcores;
    @SerializedName("yarn.nodemanager.resource.memory-mb")
    @Expose
    private String yarnNodemanagerResourceMemoryMb;
    @SerializedName("yarn.nodemanager.resource.percentage-physical-cpu-limit")
    @Expose
    private String yarnNodemanagerResourcePercentagePhysicalCpuLimit;
    @SerializedName("yarn.nodemanager.runtime.linux.allowed-runtimes")
    @Expose
    private String yarnNodemanagerRuntimeLinuxAllowedRuntimes;
    @SerializedName("yarn.nodemanager.runtime.linux.docker.allowed-container-networks")
    @Expose
    private String yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks;
    @SerializedName("yarn.nodemanager.runtime.linux.docker.capabilities")
    @Expose
    private String yarnNodemanagerRuntimeLinuxDockerCapabilities;
    @SerializedName("yarn.nodemanager.runtime.linux.docker.default-container-network")
    @Expose
    private String yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork;
    @SerializedName("yarn.nodemanager.runtime.linux.docker.privileged-containers.acl")
    @Expose
    private String yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl;
    @SerializedName("yarn.nodemanager.runtime.linux.docker.privileged-containers.allowed")
    @Expose
    private String yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed;
    @SerializedName("yarn.nodemanager.vmem-check-enabled")
    @Expose
    private String yarnNodemanagerVmemCheckEnabled;
    @SerializedName("yarn.nodemanager.vmem-pmem-ratio")
    @Expose
    private String yarnNodemanagerVmemPmemRatio;
    @SerializedName("yarn.nodemanager.webapp.cross-origin.enabled")
    @Expose
    private String yarnNodemanagerWebappCrossOriginEnabled;
    @SerializedName("yarn.resourcemanager.address")
    @Expose
    private String yarnResourcemanagerAddress;
    @SerializedName("yarn.resourcemanager.admin.address")
    @Expose
    private String yarnResourcemanagerAdminAddress;
    @SerializedName("yarn.resourcemanager.am.max-attempts")
    @Expose
    private String yarnResourcemanagerAmMaxAttempts;
    @SerializedName("yarn.resourcemanager.bind-host")
    @Expose
    private String yarnResourcemanagerBindHost;
    @SerializedName("yarn.resourcemanager.connect.max-wait.ms")
    @Expose
    private String yarnResourcemanagerConnectMaxWaitMs;
    @SerializedName("yarn.resourcemanager.connect.retry-interval.ms")
    @Expose
    private String yarnResourcemanagerConnectRetryIntervalMs;
    @SerializedName("yarn.resourcemanager.display.per-user-apps")
    @Expose
    private String yarnResourcemanagerDisplayPerUserApps;
    @SerializedName("yarn.resourcemanager.fs.state-store.retry-policy-spec")
    @Expose
    private String yarnResourcemanagerFsStateStoreRetryPolicySpec;
    @SerializedName("yarn.resourcemanager.fs.state-store.uri")
    @Expose
    private String yarnResourcemanagerFsStateStoreUri;
    @SerializedName("yarn.resourcemanager.ha.enabled")
    @Expose
    private String yarnResourcemanagerHaEnabled;
    @SerializedName("yarn.resourcemanager.hostname")
    @Expose
    private String yarnResourcemanagerHostname;
    @SerializedName("yarn.resourcemanager.monitor.capacity.preemption.intra-queue-preemption.enabled")
    @Expose
    private String yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled;
    @SerializedName("yarn.resourcemanager.monitor.capacity.preemption.monitoring_interval")
    @Expose
    private String yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval;
    @SerializedName("yarn.resourcemanager.monitor.capacity.preemption.natural_termination_factor")
    @Expose
    private String yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor;
    @SerializedName("yarn.resourcemanager.monitor.capacity.preemption.total_preemption_per_round")
    @Expose
    private String yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound;
    @SerializedName("yarn.resourcemanager.nodes.exclude-path")
    @Expose
    private String yarnResourcemanagerNodesExcludePath;
    @SerializedName("yarn.resourcemanager.placement-constraints.handler")
    @Expose
    private String yarnResourcemanagerPlacementConstraintsHandler;
    @SerializedName("yarn.resourcemanager.recovery.enabled")
    @Expose
    private String yarnResourcemanagerRecoveryEnabled;
    @SerializedName("yarn.resourcemanager.resource-tracker.address")
    @Expose
    private String yarnResourcemanagerResourceTrackerAddress;
    @SerializedName("yarn.resourcemanager.scheduler.address")
    @Expose
    private String yarnResourcemanagerSchedulerAddress;
    @SerializedName("yarn.resourcemanager.scheduler.class")
    @Expose
    private String yarnResourcemanagerSchedulerClass;
    @SerializedName("yarn.resourcemanager.scheduler.monitor.enable")
    @Expose
    private String yarnResourcemanagerSchedulerMonitorEnable;
    @SerializedName("yarn.resourcemanager.state-store.max-completed-applications")
    @Expose
    private String yarnResourcemanagerStateStoreMaxCompletedApplications;
    @SerializedName("yarn.resourcemanager.store.class")
    @Expose
    private String yarnResourcemanagerStoreClass;
    @SerializedName("yarn.resourcemanager.system-metrics-publisher.dispatcher.pool-size")
    @Expose
    private String yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize;
    @SerializedName("yarn.resourcemanager.system-metrics-publisher.enabled")
    @Expose
    private String yarnResourcemanagerSystemMetricsPublisherEnabled;
    @SerializedName("yarn.resourcemanager.webapp.address")
    @Expose
    private String yarnResourcemanagerWebappAddress;
    @SerializedName("yarn.resourcemanager.webapp.cross-origin.enabled")
    @Expose
    private String yarnResourcemanagerWebappCrossOriginEnabled;
    @SerializedName("yarn.resourcemanager.webapp.delegation-token-auth-filter.enabled")
    @Expose
    private String yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled;
    @SerializedName("yarn.resourcemanager.webapp.https.address")
    @Expose
    private String yarnResourcemanagerWebappHttpsAddress;
    @SerializedName("yarn.resourcemanager.work-preserving-recovery.enabled")
    @Expose
    private String yarnResourcemanagerWorkPreservingRecoveryEnabled;
    @SerializedName("yarn.resourcemanager.work-preserving-recovery.scheduling-wait-ms")
    @Expose
    private String yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs;
    @SerializedName("yarn.resourcemanager.zk-acl")
    @Expose
    private String yarnResourcemanagerZkAcl;
    @SerializedName("yarn.resourcemanager.zk-address")
    @Expose
    private String yarnResourcemanagerZkAddress;
    @SerializedName("yarn.resourcemanager.zk-num-retries")
    @Expose
    private String yarnResourcemanagerZkNumRetries;
    @SerializedName("yarn.resourcemanager.zk-retry-interval-ms")
    @Expose
    private String yarnResourcemanagerZkRetryIntervalMs;
    @SerializedName("yarn.resourcemanager.zk-state-store.parent-path")
    @Expose
    private String yarnResourcemanagerZkStateStoreParentPath;
    @SerializedName("yarn.resourcemanager.zk-timeout-ms")
    @Expose
    private String yarnResourcemanagerZkTimeoutMs;
    @SerializedName("yarn.rm.system-metricspublisher.emit-container-events")
    @Expose
    private String yarnRmSystemMetricspublisherEmitContainerEvents;
    @SerializedName("yarn.scheduler.capacity.ordering-policy.priority-utilization.underutilized-preemption.enabled")
    @Expose
    private String yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled;
    @SerializedName("yarn.scheduler.maximum-allocation-mb")
    @Expose
    private String yarnSchedulerMaximumAllocationMb;
    @SerializedName("yarn.scheduler.maximum-allocation-vcores")
    @Expose
    private String yarnSchedulerMaximumAllocationVcores;
    @SerializedName("yarn.scheduler.minimum-allocation-mb")
    @Expose
    private String yarnSchedulerMinimumAllocationMb;
    @SerializedName("yarn.scheduler.minimum-allocation-vcores")
    @Expose
    private String yarnSchedulerMinimumAllocationVcores;
    @SerializedName("yarn.service.framework.path")
    @Expose
    private String yarnServiceFrameworkPath;
    @SerializedName("yarn.service.system-service.dir")
    @Expose
    private String yarnServiceSystemServiceDir;
    @SerializedName("yarn.system-metricspublisher.enabled")
    @Expose
    private String yarnSystemMetricspublisherEnabled;
    @SerializedName("yarn.timeline-service.address")
    @Expose
    private String yarnTimelineServiceAddress;
    @SerializedName("yarn.timeline-service.bind-host")
    @Expose
    private String yarnTimelineServiceBindHost;
    @SerializedName("yarn.timeline-service.client.max-retries")
    @Expose
    private String yarnTimelineServiceClientMaxRetries;
    @SerializedName("yarn.timeline-service.client.retry-interval-ms")
    @Expose
    private String yarnTimelineServiceClientRetryIntervalMs;
    @SerializedName("yarn.timeline-service.enabled")
    @Expose
    private String yarnTimelineServiceEnabled;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.active-dir")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreActiveDir;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.app-cache-size")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreAppCacheSize;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.cleaner-interval-seconds")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.done-dir")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreDoneDir;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.group-id-plugin-classes")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.group-id-plugin-classpath")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.retain-seconds")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreRetainSeconds;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.scan-interval-seconds")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.summary-store")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreSummaryStore;
    @SerializedName("yarn.timeline-service.generic-application-history.save-non-am-container-meta-info")
    @Expose
    private String yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo;
    @SerializedName("yarn.timeline-service.generic-application-history.store-class")
    @Expose
    private String yarnTimelineServiceGenericApplicationHistoryStoreClass;
    @SerializedName("yarn.timeline-service.hbase-schema.prefix")
    @Expose
    private String yarnTimelineServiceHbaseSchemaPrefix;
    @SerializedName("yarn.timeline-service.hbase.configuration.file")
    @Expose
    private String yarnTimelineServiceHbaseConfigurationFile;
    @SerializedName("yarn.timeline-service.hbase.coprocessor.jar.hdfs.location")
    @Expose
    private String yarnTimelineServiceHbaseCoprocessorJarHdfsLocation;
    @SerializedName("yarn.timeline-service.http-authentication.simple.anonymous.allowed")
    @Expose
    private String yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed;
    @SerializedName("yarn.timeline-service.http-authentication.type")
    @Expose
    private String yarnTimelineServiceHttpAuthenticationType;
    @SerializedName("yarn.timeline-service.http-cross-origin.enabled")
    @Expose
    private String yarnTimelineServiceHttpCrossOriginEnabled;
    @SerializedName("yarn.timeline-service.leveldb-state-store.path")
    @Expose
    private String yarnTimelineServiceLeveldbStateStorePath;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.path")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStorePath;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.read-cache-size")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreReadCacheSize;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.start-time-read-cache-size")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.start-time-write-cache-size")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.ttl-interval-ms")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs;
    @SerializedName("yarn.timeline-service.reader.webapp.address")
    @Expose
    private String yarnTimelineServiceReaderWebappAddress;
    @SerializedName("yarn.timeline-service.reader.webapp.https.address")
    @Expose
    private String yarnTimelineServiceReaderWebappHttpsAddress;
    @SerializedName("yarn.timeline-service.recovery.enabled")
    @Expose
    private String yarnTimelineServiceRecoveryEnabled;
    @SerializedName("yarn.timeline-service.state-store-class")
    @Expose
    private String yarnTimelineServiceStateStoreClass;
    @SerializedName("yarn.timeline-service.store-class")
    @Expose
    private String yarnTimelineServiceStoreClass;
    @SerializedName("yarn.timeline-service.ttl-enable")
    @Expose
    private String yarnTimelineServiceTtlEnable;
    @SerializedName("yarn.timeline-service.ttl-ms")
    @Expose
    private String yarnTimelineServiceTtlMs;
    @SerializedName("yarn.timeline-service.version")
    @Expose
    private String yarnTimelineServiceVersion;
    @SerializedName("yarn.timeline-service.versions")
    @Expose
    private String yarnTimelineServiceVersions;
    @SerializedName("yarn.timeline-service.webapp.address")
    @Expose
    private String yarnTimelineServiceWebappAddress;
    @SerializedName("yarn.timeline-service.webapp.https.address")
    @Expose
    private String yarnTimelineServiceWebappHttpsAddress;
    @SerializedName("yarn.webapp.api-service.enable")
    @Expose
    private String yarnWebappApiServiceEnable;
    @SerializedName("yarn.webapp.ui2.enable")
    @Expose
    private String yarnWebappUi2Enable;
    @SerializedName("yarn.timeline-service.http-authentication.proxyuser.ambari.groups")
    @Expose
    private String yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups;
    @SerializedName("yarn.timeline-service.http-authentication.proxyuser.ambari.hosts")
    @Expose
    private String yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts;
    @SerializedName("yarn.scheduler.capacity.root.spark.capacity")
    @Expose
    private String yarnSchedulerCapacityRootSparkCapacity;
    @SerializedName("yarn.scheduler.capacity.root.spark.maximum-capacity")
    @Expose
    private String yarnSchedulerCapacityRootSparkMaximumCapacity;
    @SerializedName("yarn.scheduler.capacity.root.spark.state")
    @Expose
    private String yarnSchedulerCapacityRootSparkState;
    @SerializedName("yarn.scheduler.capacity.root.spark.user-limit-factor")
    @Expose
    private String yarnSchedulerCapacityRootSparkUserLimitFactor;

    public String getYarnResourceTypes() {
        return yarnResourceTypes;
    }

    public void setYarnResourceTypes(String yarnResourceTypes) {
        this.yarnResourceTypes = yarnResourceTypes;
    }

    public String getYarnResourceTypesYarnIoGpuMaximumAllocation() {
        return yarnResourceTypesYarnIoGpuMaximumAllocation;
    }

    public void setYarnResourceTypesYarnIoGpuMaximumAllocation(String yarnResourceTypesYarnIoGpuMaximumAllocation) {
        this.yarnResourceTypesYarnIoGpuMaximumAllocation = yarnResourceTypesYarnIoGpuMaximumAllocation;
    }

    public String getCgroupRoot() {
        return cgroupRoot;
    }

    public void setCgroupRoot(String cgroupRoot) {
        this.cgroupRoot = cgroupRoot;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDockerAllowedDevices() {
        return dockerAllowedDevices;
    }

    public void setDockerAllowedDevices(String dockerAllowedDevices) {
        this.dockerAllowedDevices = dockerAllowedDevices;
    }

    public String getDockerAllowedRoMounts() {
        return dockerAllowedRoMounts;
    }

    public void setDockerAllowedRoMounts(String dockerAllowedRoMounts) {
        this.dockerAllowedRoMounts = dockerAllowedRoMounts;
    }

    public String getDockerAllowedRwMounts() {
        return dockerAllowedRwMounts;
    }

    public void setDockerAllowedRwMounts(String dockerAllowedRwMounts) {
        this.dockerAllowedRwMounts = dockerAllowedRwMounts;
    }

    public String getDockerAllowedVolumeDrivers() {
        return dockerAllowedVolumeDrivers;
    }

    public void setDockerAllowedVolumeDrivers(String dockerAllowedVolumeDrivers) {
        this.dockerAllowedVolumeDrivers = dockerAllowedVolumeDrivers;
    }

    public String getDockerBinary() {
        return dockerBinary;
    }

    public void setDockerBinary(String dockerBinary) {
        this.dockerBinary = dockerBinary;
    }

    public String getDockerModuleEnabled() {
        return dockerModuleEnabled;
    }

    public void setDockerModuleEnabled(String dockerModuleEnabled) {
        this.dockerModuleEnabled = dockerModuleEnabled;
    }

    public String getDockerPrivilegedContainersEnabled() {
        return dockerPrivilegedContainersEnabled;
    }

    public void setDockerPrivilegedContainersEnabled(String dockerPrivilegedContainersEnabled) {
        this.dockerPrivilegedContainersEnabled = dockerPrivilegedContainersEnabled;
    }

    public String getDockerTrustedRegistries() {
        return dockerTrustedRegistries;
    }

    public void setDockerTrustedRegistries(String dockerTrustedRegistries) {
        this.dockerTrustedRegistries = dockerTrustedRegistries;
    }

    public String getGpuModuleEnabled() {
        return gpuModuleEnabled;
    }

    public void setGpuModuleEnabled(String gpuModuleEnabled) {
        this.gpuModuleEnabled = gpuModuleEnabled;
    }

    public String getMinUserId() {
        return minUserId;
    }

    public void setMinUserId(String minUserId) {
        this.minUserId = minUserId;
    }

    public String getYarnHierarchy() {
        return yarnHierarchy;
    }

    public void setYarnHierarchy(String yarnHierarchy) {
        this.yarnHierarchy = yarnHierarchy;
    }

    public String getApptimelineserverHeapsize() {
        return apptimelineserverHeapsize;
    }

    public void setApptimelineserverHeapsize(String apptimelineserverHeapsize) {
        this.apptimelineserverHeapsize = apptimelineserverHeapsize;
    }

    public String getIsSupportedYarnRanger() {
        return isSupportedYarnRanger;
    }

    public void setIsSupportedYarnRanger(String isSupportedYarnRanger) {
        this.isSupportedYarnRanger = isSupportedYarnRanger;
    }

    public String getNodemanagerHeapsize() {
        return nodemanagerHeapsize;
    }

    public void setNodemanagerHeapsize(String nodemanagerHeapsize) {
        this.nodemanagerHeapsize = nodemanagerHeapsize;
    }

    public String getRegistryDnsBindPort() {
        return registryDnsBindPort;
    }

    public void setRegistryDnsBindPort(String registryDnsBindPort) {
        this.registryDnsBindPort = registryDnsBindPort;
    }

    public String getResourcemanagerHeapsize() {
        return resourcemanagerHeapsize;
    }

    public void setResourcemanagerHeapsize(String resourcemanagerHeapsize) {
        this.resourcemanagerHeapsize = resourcemanagerHeapsize;
    }

    public String getServiceCheckQueueName() {
        return serviceCheckQueueName;
    }

    public void setServiceCheckQueueName(String serviceCheckQueueName) {
        this.serviceCheckQueueName = serviceCheckQueueName;
    }

    public String getYarnAtsUser() {
        return yarnAtsUser;
    }

    public void setYarnAtsUser(String yarnAtsUser) {
        this.yarnAtsUser = yarnAtsUser;
    }

    public String getYarnCgroupsEnabled() {
        return yarnCgroupsEnabled;
    }

    public void setYarnCgroupsEnabled(String yarnCgroupsEnabled) {
        this.yarnCgroupsEnabled = yarnCgroupsEnabled;
    }

    public String getYarnHeapsize() {
        return yarnHeapsize;
    }

    public void setYarnHeapsize(String yarnHeapsize) {
        this.yarnHeapsize = yarnHeapsize;
    }

    public String getYarnLogDirPrefix() {
        return yarnLogDirPrefix;
    }

    public void setYarnLogDirPrefix(String yarnLogDirPrefix) {
        this.yarnLogDirPrefix = yarnLogDirPrefix;
    }

    public String getYarnPidDirPrefix() {
        return yarnPidDirPrefix;
    }

    public void setYarnPidDirPrefix(String yarnPidDirPrefix) {
        this.yarnPidDirPrefix = yarnPidDirPrefix;
    }

    public String getYarnUser() {
        return yarnUser;
    }

    public void setYarnUser(String yarnUser) {
        this.yarnUser = yarnUser;
    }

    public String getYarnUserNofileLimit() {
        return yarnUserNofileLimit;
    }

    public void setYarnUserNofileLimit(String yarnUserNofileLimit) {
        this.yarnUserNofileLimit = yarnUserNofileLimit;
    }

    public String getYarnUserNprocLimit() {
        return yarnUserNprocLimit;
    }

    public void setYarnUserNprocLimit(String yarnUserNprocLimit) {
        this.yarnUserNprocLimit = yarnUserNprocLimit;
    }

    public String getHbaseJavaIoTmpdir() {
        return hbaseJavaIoTmpdir;
    }

    public void setHbaseJavaIoTmpdir(String hbaseJavaIoTmpdir) {
        this.hbaseJavaIoTmpdir = hbaseJavaIoTmpdir;
    }

    public String getIsHbaseSystemServiceLaunch() {
        return isHbaseSystemServiceLaunch;
    }

    public void setIsHbaseSystemServiceLaunch(String isHbaseSystemServiceLaunch) {
        this.isHbaseSystemServiceLaunch = isHbaseSystemServiceLaunch;
    }

    public String getYarnHbaseClientContainers() {
        return yarnHbaseClientContainers;
    }

    public void setYarnHbaseClientContainers(String yarnHbaseClientContainers) {
        this.yarnHbaseClientContainers = yarnHbaseClientContainers;
    }

    public String getYarnHbaseClientCpu() {
        return yarnHbaseClientCpu;
    }

    public void setYarnHbaseClientCpu(String yarnHbaseClientCpu) {
        this.yarnHbaseClientCpu = yarnHbaseClientCpu;
    }

    public String getYarnHbaseClientMemory() {
        return yarnHbaseClientMemory;
    }

    public void setYarnHbaseClientMemory(String yarnHbaseClientMemory) {
        this.yarnHbaseClientMemory = yarnHbaseClientMemory;
    }

    public String getYarnHbaseHeapMemoryFactor() {
        return yarnHbaseHeapMemoryFactor;
    }

    public void setYarnHbaseHeapMemoryFactor(String yarnHbaseHeapMemoryFactor) {
        this.yarnHbaseHeapMemoryFactor = yarnHbaseHeapMemoryFactor;
    }

    public String getYarnHbaseMasterContainers() {
        return yarnHbaseMasterContainers;
    }

    public void setYarnHbaseMasterContainers(String yarnHbaseMasterContainers) {
        this.yarnHbaseMasterContainers = yarnHbaseMasterContainers;
    }

    public String getYarnHbaseMasterCpu() {
        return yarnHbaseMasterCpu;
    }

    public void setYarnHbaseMasterCpu(String yarnHbaseMasterCpu) {
        this.yarnHbaseMasterCpu = yarnHbaseMasterCpu;
    }

    public String getYarnHbaseMasterMemory() {
        return yarnHbaseMasterMemory;
    }

    public void setYarnHbaseMasterMemory(String yarnHbaseMasterMemory) {
        this.yarnHbaseMasterMemory = yarnHbaseMasterMemory;
    }

    public String getYarnHbasePidDirPrefix() {
        return yarnHbasePidDirPrefix;
    }

    public void setYarnHbasePidDirPrefix(String yarnHbasePidDirPrefix) {
        this.yarnHbasePidDirPrefix = yarnHbasePidDirPrefix;
    }

    public String getYarnHbaseRegionserverContainers() {
        return yarnHbaseRegionserverContainers;
    }

    public void setYarnHbaseRegionserverContainers(String yarnHbaseRegionserverContainers) {
        this.yarnHbaseRegionserverContainers = yarnHbaseRegionserverContainers;
    }

    public String getYarnHbaseRegionserverCpu() {
        return yarnHbaseRegionserverCpu;
    }

    public void setYarnHbaseRegionserverCpu(String yarnHbaseRegionserverCpu) {
        this.yarnHbaseRegionserverCpu = yarnHbaseRegionserverCpu;
    }

    public String getYarnHbaseRegionserverMemory() {
        return yarnHbaseRegionserverMemory;
    }

    public void setYarnHbaseRegionserverMemory(String yarnHbaseRegionserverMemory) {
        this.yarnHbaseRegionserverMemory = yarnHbaseRegionserverMemory;
    }

    public String getYarnHbaseSystemServiceLaunchMode() {
        return yarnHbaseSystemServiceLaunchMode;
    }

    public void setYarnHbaseSystemServiceLaunchMode(String yarnHbaseSystemServiceLaunchMode) {
        this.yarnHbaseSystemServiceLaunchMode = yarnHbaseSystemServiceLaunchMode;
    }

    public String getYarnHbaseSystemServiceQueueName() {
        return yarnHbaseSystemServiceQueueName;
    }

    public void setYarnHbaseSystemServiceQueueName(String yarnHbaseSystemServiceQueueName) {
        this.yarnHbaseSystemServiceQueueName = yarnHbaseSystemServiceQueueName;
    }

    public String getHbaseLogMaxbackupindex() {
        return hbaseLogMaxbackupindex;
    }

    public void setHbaseLogMaxbackupindex(String hbaseLogMaxbackupindex) {
        this.hbaseLogMaxbackupindex = hbaseLogMaxbackupindex;
    }

    public String getHbaseLogMaxfilesize() {
        return hbaseLogMaxfilesize;
    }

    public void setHbaseLogMaxfilesize(String hbaseLogMaxfilesize) {
        this.hbaseLogMaxfilesize = hbaseLogMaxfilesize;
    }

    public String getHbaseSecurityLogMaxbackupindex() {
        return hbaseSecurityLogMaxbackupindex;
    }

    public void setHbaseSecurityLogMaxbackupindex(String hbaseSecurityLogMaxbackupindex) {
        this.hbaseSecurityLogMaxbackupindex = hbaseSecurityLogMaxbackupindex;
    }

    public String getHbaseSecurityLogMaxfilesize() {
        return hbaseSecurityLogMaxfilesize;
    }

    public void setHbaseSecurityLogMaxfilesize(String hbaseSecurityLogMaxfilesize) {
        this.hbaseSecurityLogMaxfilesize = hbaseSecurityLogMaxfilesize;
    }

    public String getSecurityAdminProtocolAcl() {
        return securityAdminProtocolAcl;
    }

    public void setSecurityAdminProtocolAcl(String securityAdminProtocolAcl) {
        this.securityAdminProtocolAcl = securityAdminProtocolAcl;
    }

    public String getSecurityClientProtocolAcl() {
        return securityClientProtocolAcl;
    }

    public void setSecurityClientProtocolAcl(String securityClientProtocolAcl) {
        this.securityClientProtocolAcl = securityClientProtocolAcl;
    }

    public String getSecurityMasterregionProtocolAcl() {
        return securityMasterregionProtocolAcl;
    }

    public void setSecurityMasterregionProtocolAcl(String securityMasterregionProtocolAcl) {
        this.securityMasterregionProtocolAcl = securityMasterregionProtocolAcl;
    }

    public String getDfsDomainSocketPath() {
        return dfsDomainSocketPath;
    }

    public void setDfsDomainSocketPath(String dfsDomainSocketPath) {
        this.dfsDomainSocketPath = dfsDomainSocketPath;
    }

    public String getHbaseBucketcacheIoengine() {
        return hbaseBucketcacheIoengine;
    }

    public void setHbaseBucketcacheIoengine(String hbaseBucketcacheIoengine) {
        this.hbaseBucketcacheIoengine = hbaseBucketcacheIoengine;
    }

    public String getHbaseBucketcachePercentageInCombinedcache() {
        return hbaseBucketcachePercentageInCombinedcache;
    }

    public void setHbaseBucketcachePercentageInCombinedcache(String hbaseBucketcachePercentageInCombinedcache) {
        this.hbaseBucketcachePercentageInCombinedcache = hbaseBucketcachePercentageInCombinedcache;
    }

    public String getHbaseBucketcacheSize() {
        return hbaseBucketcacheSize;
    }

    public void setHbaseBucketcacheSize(String hbaseBucketcacheSize) {
        this.hbaseBucketcacheSize = hbaseBucketcacheSize;
    }

    public String getHbaseClientKeyvalueMaxsize() {
        return hbaseClientKeyvalueMaxsize;
    }

    public void setHbaseClientKeyvalueMaxsize(String hbaseClientKeyvalueMaxsize) {
        this.hbaseClientKeyvalueMaxsize = hbaseClientKeyvalueMaxsize;
    }

    public String getHbaseClientRetriesNumber() {
        return hbaseClientRetriesNumber;
    }

    public void setHbaseClientRetriesNumber(String hbaseClientRetriesNumber) {
        this.hbaseClientRetriesNumber = hbaseClientRetriesNumber;
    }

    public String getHbaseClientScannerCaching() {
        return hbaseClientScannerCaching;
    }

    public void setHbaseClientScannerCaching(String hbaseClientScannerCaching) {
        this.hbaseClientScannerCaching = hbaseClientScannerCaching;
    }

    public String getHbaseClusterDistributed() {
        return hbaseClusterDistributed;
    }

    public void setHbaseClusterDistributed(String hbaseClusterDistributed) {
        this.hbaseClusterDistributed = hbaseClusterDistributed;
    }

    public String getHbaseCoprocessorMasterClasses() {
        return hbaseCoprocessorMasterClasses;
    }

    public void setHbaseCoprocessorMasterClasses(String hbaseCoprocessorMasterClasses) {
        this.hbaseCoprocessorMasterClasses = hbaseCoprocessorMasterClasses;
    }

    public String getHbaseCoprocessorRegionClasses() {
        return hbaseCoprocessorRegionClasses;
    }

    public void setHbaseCoprocessorRegionClasses(String hbaseCoprocessorRegionClasses) {
        this.hbaseCoprocessorRegionClasses = hbaseCoprocessorRegionClasses;
    }

    public String getHbaseCoprocessorRegionserverClasses() {
        return hbaseCoprocessorRegionserverClasses;
    }

    public void setHbaseCoprocessorRegionserverClasses(String hbaseCoprocessorRegionserverClasses) {
        this.hbaseCoprocessorRegionserverClasses = hbaseCoprocessorRegionserverClasses;
    }

    public String getHbaseDefaultsForVersionSkip() {
        return hbaseDefaultsForVersionSkip;
    }

    public void setHbaseDefaultsForVersionSkip(String hbaseDefaultsForVersionSkip) {
        this.hbaseDefaultsForVersionSkip = hbaseDefaultsForVersionSkip;
    }

    public String getHbaseHregionMajorcompaction() {
        return hbaseHregionMajorcompaction;
    }

    public void setHbaseHregionMajorcompaction(String hbaseHregionMajorcompaction) {
        this.hbaseHregionMajorcompaction = hbaseHregionMajorcompaction;
    }

    public String getHbaseHregionMajorcompactionJitter() {
        return hbaseHregionMajorcompactionJitter;
    }

    public void setHbaseHregionMajorcompactionJitter(String hbaseHregionMajorcompactionJitter) {
        this.hbaseHregionMajorcompactionJitter = hbaseHregionMajorcompactionJitter;
    }

    public String getHbaseHregionMaxFilesize() {
        return hbaseHregionMaxFilesize;
    }

    public void setHbaseHregionMaxFilesize(String hbaseHregionMaxFilesize) {
        this.hbaseHregionMaxFilesize = hbaseHregionMaxFilesize;
    }

    public String getHbaseHregionMemstoreBlockMultiplier() {
        return hbaseHregionMemstoreBlockMultiplier;
    }

    public void setHbaseHregionMemstoreBlockMultiplier(String hbaseHregionMemstoreBlockMultiplier) {
        this.hbaseHregionMemstoreBlockMultiplier = hbaseHregionMemstoreBlockMultiplier;
    }

    public String getHbaseHregionMemstoreFlushSize() {
        return hbaseHregionMemstoreFlushSize;
    }

    public void setHbaseHregionMemstoreFlushSize(String hbaseHregionMemstoreFlushSize) {
        this.hbaseHregionMemstoreFlushSize = hbaseHregionMemstoreFlushSize;
    }

    public String getHbaseHregionMemstoreMslabEnabled() {
        return hbaseHregionMemstoreMslabEnabled;
    }

    public void setHbaseHregionMemstoreMslabEnabled(String hbaseHregionMemstoreMslabEnabled) {
        this.hbaseHregionMemstoreMslabEnabled = hbaseHregionMemstoreMslabEnabled;
    }

    public String getHbaseHstoreBlockingStoreFiles() {
        return hbaseHstoreBlockingStoreFiles;
    }

    public void setHbaseHstoreBlockingStoreFiles(String hbaseHstoreBlockingStoreFiles) {
        this.hbaseHstoreBlockingStoreFiles = hbaseHstoreBlockingStoreFiles;
    }

    public String getHbaseHstoreCompactionMax() {
        return hbaseHstoreCompactionMax;
    }

    public void setHbaseHstoreCompactionMax(String hbaseHstoreCompactionMax) {
        this.hbaseHstoreCompactionMax = hbaseHstoreCompactionMax;
    }

    public String getHbaseHstoreCompactionThreshold() {
        return hbaseHstoreCompactionThreshold;
    }

    public void setHbaseHstoreCompactionThreshold(String hbaseHstoreCompactionThreshold) {
        this.hbaseHstoreCompactionThreshold = hbaseHstoreCompactionThreshold;
    }

    public String getHbaseLocalDir() {
        return hbaseLocalDir;
    }

    public void setHbaseLocalDir(String hbaseLocalDir) {
        this.hbaseLocalDir = hbaseLocalDir;
    }

    public String getHbaseMasterInfoBindAddress() {
        return hbaseMasterInfoBindAddress;
    }

    public void setHbaseMasterInfoBindAddress(String hbaseMasterInfoBindAddress) {
        this.hbaseMasterInfoBindAddress = hbaseMasterInfoBindAddress;
    }

    public String getHbaseMasterInfoPort() {
        return hbaseMasterInfoPort;
    }

    public void setHbaseMasterInfoPort(String hbaseMasterInfoPort) {
        this.hbaseMasterInfoPort = hbaseMasterInfoPort;
    }

    public String getHbaseMasterNamespaceInitTimeout() {
        return hbaseMasterNamespaceInitTimeout;
    }

    public void setHbaseMasterNamespaceInitTimeout(String hbaseMasterNamespaceInitTimeout) {
        this.hbaseMasterNamespaceInitTimeout = hbaseMasterNamespaceInitTimeout;
    }

    public String getHbaseMasterPort() {
        return hbaseMasterPort;
    }

    public void setHbaseMasterPort(String hbaseMasterPort) {
        this.hbaseMasterPort = hbaseMasterPort;
    }

    public String getHbaseMasterUiReadonly() {
        return hbaseMasterUiReadonly;
    }

    public void setHbaseMasterUiReadonly(String hbaseMasterUiReadonly) {
        this.hbaseMasterUiReadonly = hbaseMasterUiReadonly;
    }

    public String getHbaseMasterWaitOnRegionserversTimeout() {
        return hbaseMasterWaitOnRegionserversTimeout;
    }

    public void setHbaseMasterWaitOnRegionserversTimeout(String hbaseMasterWaitOnRegionserversTimeout) {
        this.hbaseMasterWaitOnRegionserversTimeout = hbaseMasterWaitOnRegionserversTimeout;
    }

    public String getHbaseRegionserverExecutorOpenregionThreads() {
        return hbaseRegionserverExecutorOpenregionThreads;
    }

    public void setHbaseRegionserverExecutorOpenregionThreads(String hbaseRegionserverExecutorOpenregionThreads) {
        this.hbaseRegionserverExecutorOpenregionThreads = hbaseRegionserverExecutorOpenregionThreads;
    }

    public String getHbaseRegionserverGlobalMemstoreSize() {
        return hbaseRegionserverGlobalMemstoreSize;
    }

    public void setHbaseRegionserverGlobalMemstoreSize(String hbaseRegionserverGlobalMemstoreSize) {
        this.hbaseRegionserverGlobalMemstoreSize = hbaseRegionserverGlobalMemstoreSize;
    }

    public String getHbaseRegionserverHandlerCount() {
        return hbaseRegionserverHandlerCount;
    }

    public void setHbaseRegionserverHandlerCount(String hbaseRegionserverHandlerCount) {
        this.hbaseRegionserverHandlerCount = hbaseRegionserverHandlerCount;
    }

    public String getHbaseRegionserverInfoPort() {
        return hbaseRegionserverInfoPort;
    }

    public void setHbaseRegionserverInfoPort(String hbaseRegionserverInfoPort) {
        this.hbaseRegionserverInfoPort = hbaseRegionserverInfoPort;
    }

    public String getHbaseRegionserverPort() {
        return hbaseRegionserverPort;
    }

    public void setHbaseRegionserverPort(String hbaseRegionserverPort) {
        this.hbaseRegionserverPort = hbaseRegionserverPort;
    }

    public String getHbaseRootdir() {
        return hbaseRootdir;
    }

    public void setHbaseRootdir(String hbaseRootdir) {
        this.hbaseRootdir = hbaseRootdir;
    }

    public String getHbaseRpcProtection() {
        return hbaseRpcProtection;
    }

    public void setHbaseRpcProtection(String hbaseRpcProtection) {
        this.hbaseRpcProtection = hbaseRpcProtection;
    }

    public String getHbaseRpcTimeout() {
        return hbaseRpcTimeout;
    }

    public void setHbaseRpcTimeout(String hbaseRpcTimeout) {
        this.hbaseRpcTimeout = hbaseRpcTimeout;
    }

    public String getHbaseSecurityAuthentication() {
        return hbaseSecurityAuthentication;
    }

    public void setHbaseSecurityAuthentication(String hbaseSecurityAuthentication) {
        this.hbaseSecurityAuthentication = hbaseSecurityAuthentication;
    }

    public String getHbaseSecurityAuthorization() {
        return hbaseSecurityAuthorization;
    }

    public void setHbaseSecurityAuthorization(String hbaseSecurityAuthorization) {
        this.hbaseSecurityAuthorization = hbaseSecurityAuthorization;
    }

    public String getHbaseSuperuser() {
        return hbaseSuperuser;
    }

    public void setHbaseSuperuser(String hbaseSuperuser) {
        this.hbaseSuperuser = hbaseSuperuser;
    }

    public String getHbaseTmpDir() {
        return hbaseTmpDir;
    }

    public void setHbaseTmpDir(String hbaseTmpDir) {
        this.hbaseTmpDir = hbaseTmpDir;
    }

    public String getHbaseZookeeperPropertyClientPort() {
        return hbaseZookeeperPropertyClientPort;
    }

    public void setHbaseZookeeperPropertyClientPort(String hbaseZookeeperPropertyClientPort) {
        this.hbaseZookeeperPropertyClientPort = hbaseZookeeperPropertyClientPort;
    }

    public String getHbaseZookeeperQuorum() {
        return hbaseZookeeperQuorum;
    }

    public void setHbaseZookeeperQuorum(String hbaseZookeeperQuorum) {
        this.hbaseZookeeperQuorum = hbaseZookeeperQuorum;
    }

    public String getHbaseZookeeperUseMulti() {
        return hbaseZookeeperUseMulti;
    }

    public void setHbaseZookeeperUseMulti(String hbaseZookeeperUseMulti) {
        this.hbaseZookeeperUseMulti = hbaseZookeeperUseMulti;
    }

    public String getHfileBlockCacheSize() {
        return hfileBlockCacheSize;
    }

    public void setHfileBlockCacheSize(String hfileBlockCacheSize) {
        this.hfileBlockCacheSize = hfileBlockCacheSize;
    }

    public String getZookeeperRecoveryRetry() {
        return zookeeperRecoveryRetry;
    }

    public void setZookeeperRecoveryRetry(String zookeeperRecoveryRetry) {
        this.zookeeperRecoveryRetry = zookeeperRecoveryRetry;
    }

    public String getZookeeperSessionTimeout() {
        return zookeeperSessionTimeout;
    }

    public void setZookeeperSessionTimeout(String zookeeperSessionTimeout) {
        this.zookeeperSessionTimeout = zookeeperSessionTimeout;
    }

    public String getZookeeperZnodeParent() {
        return zookeeperZnodeParent;
    }

    public void setZookeeperZnodeParent(String zookeeperZnodeParent) {
        this.zookeeperZnodeParent = zookeeperZnodeParent;
    }

    public String getYarnRmSummaryLogMaxBackupSize() {
        return yarnRmSummaryLogMaxBackupSize;
    }

    public void setYarnRmSummaryLogMaxBackupSize(String yarnRmSummaryLogMaxBackupSize) {
        this.yarnRmSummaryLogMaxBackupSize = yarnRmSummaryLogMaxBackupSize;
    }

    public String getYarnRmSummaryLogNumberOfBackupFiles() {
        return yarnRmSummaryLogNumberOfBackupFiles;
    }

    public void setYarnRmSummaryLogNumberOfBackupFiles(String yarnRmSummaryLogNumberOfBackupFiles) {
        this.yarnRmSummaryLogNumberOfBackupFiles = yarnRmSummaryLogNumberOfBackupFiles;
    }

    public String getYarnSchedulerCapacityDefaultMinimumUserLimitPercent() {
        return yarnSchedulerCapacityDefaultMinimumUserLimitPercent;
    }

    public void setYarnSchedulerCapacityDefaultMinimumUserLimitPercent(String yarnSchedulerCapacityDefaultMinimumUserLimitPercent) {
        this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent = yarnSchedulerCapacityDefaultMinimumUserLimitPercent;
    }

    public String getYarnSchedulerCapacityMaximumAmResourcePercent() {
        return yarnSchedulerCapacityMaximumAmResourcePercent;
    }

    public void setYarnSchedulerCapacityMaximumAmResourcePercent(String yarnSchedulerCapacityMaximumAmResourcePercent) {
        this.yarnSchedulerCapacityMaximumAmResourcePercent = yarnSchedulerCapacityMaximumAmResourcePercent;
    }

    public String getYarnSchedulerCapacityMaximumApplications() {
        return yarnSchedulerCapacityMaximumApplications;
    }

    public void setYarnSchedulerCapacityMaximumApplications(String yarnSchedulerCapacityMaximumApplications) {
        this.yarnSchedulerCapacityMaximumApplications = yarnSchedulerCapacityMaximumApplications;
    }

    public String getYarnSchedulerCapacityNodeLocalityDelay() {
        return yarnSchedulerCapacityNodeLocalityDelay;
    }

    public void setYarnSchedulerCapacityNodeLocalityDelay(String yarnSchedulerCapacityNodeLocalityDelay) {
        this.yarnSchedulerCapacityNodeLocalityDelay = yarnSchedulerCapacityNodeLocalityDelay;
    }

    public String getYarnSchedulerCapacityResourceCalculator() {
        return yarnSchedulerCapacityResourceCalculator;
    }

    public void setYarnSchedulerCapacityResourceCalculator(String yarnSchedulerCapacityResourceCalculator) {
        this.yarnSchedulerCapacityResourceCalculator = yarnSchedulerCapacityResourceCalculator;
    }

    public String getYarnSchedulerCapacityRootAccessibleNodeLabels() {
        return yarnSchedulerCapacityRootAccessibleNodeLabels;
    }

    public void setYarnSchedulerCapacityRootAccessibleNodeLabels(String yarnSchedulerCapacityRootAccessibleNodeLabels) {
        this.yarnSchedulerCapacityRootAccessibleNodeLabels = yarnSchedulerCapacityRootAccessibleNodeLabels;
    }

    public String getYarnSchedulerCapacityRootAclAdministerQueue() {
        return yarnSchedulerCapacityRootAclAdministerQueue;
    }

    public void setYarnSchedulerCapacityRootAclAdministerQueue(String yarnSchedulerCapacityRootAclAdministerQueue) {
        this.yarnSchedulerCapacityRootAclAdministerQueue = yarnSchedulerCapacityRootAclAdministerQueue;
    }

    public String getYarnSchedulerCapacityRootAclSubmitApplications() {
        return yarnSchedulerCapacityRootAclSubmitApplications;
    }

    public void setYarnSchedulerCapacityRootAclSubmitApplications(String yarnSchedulerCapacityRootAclSubmitApplications) {
        this.yarnSchedulerCapacityRootAclSubmitApplications = yarnSchedulerCapacityRootAclSubmitApplications;
    }

    public String getYarnSchedulerCapacityRootCapacity() {
        return yarnSchedulerCapacityRootCapacity;
    }

    public void setYarnSchedulerCapacityRootCapacity(String yarnSchedulerCapacityRootCapacity) {
        this.yarnSchedulerCapacityRootCapacity = yarnSchedulerCapacityRootCapacity;
    }

    public String getYarnSchedulerCapacityRootDefaultAclAdministerJobs() {
        return yarnSchedulerCapacityRootDefaultAclAdministerJobs;
    }

    public void setYarnSchedulerCapacityRootDefaultAclAdministerJobs(String yarnSchedulerCapacityRootDefaultAclAdministerJobs) {
        this.yarnSchedulerCapacityRootDefaultAclAdministerJobs = yarnSchedulerCapacityRootDefaultAclAdministerJobs;
    }

    public String getYarnSchedulerCapacityRootDefaultAclSubmitApplications() {
        return yarnSchedulerCapacityRootDefaultAclSubmitApplications;
    }

    public void setYarnSchedulerCapacityRootDefaultAclSubmitApplications(String yarnSchedulerCapacityRootDefaultAclSubmitApplications) {
        this.yarnSchedulerCapacityRootDefaultAclSubmitApplications = yarnSchedulerCapacityRootDefaultAclSubmitApplications;
    }

    public String getYarnSchedulerCapacityRootDefaultCapacity() {
        return yarnSchedulerCapacityRootDefaultCapacity;
    }

    public void setYarnSchedulerCapacityRootDefaultCapacity(String yarnSchedulerCapacityRootDefaultCapacity) {
        this.yarnSchedulerCapacityRootDefaultCapacity = yarnSchedulerCapacityRootDefaultCapacity;
    }

    public String getYarnSchedulerCapacityRootDefaultMaximumCapacity() {
        return yarnSchedulerCapacityRootDefaultMaximumCapacity;
    }

    public void setYarnSchedulerCapacityRootDefaultMaximumCapacity(String yarnSchedulerCapacityRootDefaultMaximumCapacity) {
        this.yarnSchedulerCapacityRootDefaultMaximumCapacity = yarnSchedulerCapacityRootDefaultMaximumCapacity;
    }

    public String getYarnSchedulerCapacityRootDefaultState() {
        return yarnSchedulerCapacityRootDefaultState;
    }

    public void setYarnSchedulerCapacityRootDefaultState(String yarnSchedulerCapacityRootDefaultState) {
        this.yarnSchedulerCapacityRootDefaultState = yarnSchedulerCapacityRootDefaultState;
    }

    public String getYarnSchedulerCapacityRootDefaultUserLimitFactor() {
        return yarnSchedulerCapacityRootDefaultUserLimitFactor;
    }

    public void setYarnSchedulerCapacityRootDefaultUserLimitFactor(String yarnSchedulerCapacityRootDefaultUserLimitFactor) {
        this.yarnSchedulerCapacityRootDefaultUserLimitFactor = yarnSchedulerCapacityRootDefaultUserLimitFactor;
    }

    public String getYarnSchedulerCapacityRootQueues() {
        return yarnSchedulerCapacityRootQueues;
    }

    public void setYarnSchedulerCapacityRootQueues(String yarnSchedulerCapacityRootQueues) {
        this.yarnSchedulerCapacityRootQueues = yarnSchedulerCapacityRootQueues;
    }

    public String getYarnSchedulerCapacityScheduleAsynchronouslyEnable() {
        return yarnSchedulerCapacityScheduleAsynchronouslyEnable;
    }

    public void setYarnSchedulerCapacityScheduleAsynchronouslyEnable(String yarnSchedulerCapacityScheduleAsynchronouslyEnable) {
        this.yarnSchedulerCapacityScheduleAsynchronouslyEnable = yarnSchedulerCapacityScheduleAsynchronouslyEnable;
    }

    public String getYarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads() {
        return yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads;
    }

    public void setYarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads(String yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads) {
        this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads = yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads;
    }

    public String getYarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs() {
        return yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs;
    }

    public void setYarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs(String yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs) {
        this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs = yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs;
    }

    public String getHadoopHttpCrossOriginAllowedOrigins() {
        return hadoopHttpCrossOriginAllowedOrigins;
    }

    public void setHadoopHttpCrossOriginAllowedOrigins(String hadoopHttpCrossOriginAllowedOrigins) {
        this.hadoopHttpCrossOriginAllowedOrigins = hadoopHttpCrossOriginAllowedOrigins;
    }

    public String getHadoopRegistryDnsBindAddress() {
        return hadoopRegistryDnsBindAddress;
    }

    public void setHadoopRegistryDnsBindAddress(String hadoopRegistryDnsBindAddress) {
        this.hadoopRegistryDnsBindAddress = hadoopRegistryDnsBindAddress;
    }

    public String getHadoopRegistryDnsBindPort() {
        return hadoopRegistryDnsBindPort;
    }

    public void setHadoopRegistryDnsBindPort(String hadoopRegistryDnsBindPort) {
        this.hadoopRegistryDnsBindPort = hadoopRegistryDnsBindPort;
    }

    public String getHadoopRegistryDnsDomainName() {
        return hadoopRegistryDnsDomainName;
    }

    public void setHadoopRegistryDnsDomainName(String hadoopRegistryDnsDomainName) {
        this.hadoopRegistryDnsDomainName = hadoopRegistryDnsDomainName;
    }

    public String getHadoopRegistryDnsEnabled() {
        return hadoopRegistryDnsEnabled;
    }

    public void setHadoopRegistryDnsEnabled(String hadoopRegistryDnsEnabled) {
        this.hadoopRegistryDnsEnabled = hadoopRegistryDnsEnabled;
    }

    public String getHadoopRegistryDnsZoneMask() {
        return hadoopRegistryDnsZoneMask;
    }

    public void setHadoopRegistryDnsZoneMask(String hadoopRegistryDnsZoneMask) {
        this.hadoopRegistryDnsZoneMask = hadoopRegistryDnsZoneMask;
    }

    public String getHadoopRegistryDnsZoneSubnet() {
        return hadoopRegistryDnsZoneSubnet;
    }

    public void setHadoopRegistryDnsZoneSubnet(String hadoopRegistryDnsZoneSubnet) {
        this.hadoopRegistryDnsZoneSubnet = hadoopRegistryDnsZoneSubnet;
    }

    public String getHadoopRegistryZkQuorum() {
        return hadoopRegistryZkQuorum;
    }

    public void setHadoopRegistryZkQuorum(String hadoopRegistryZkQuorum) {
        this.hadoopRegistryZkQuorum = hadoopRegistryZkQuorum;
    }

    public String getManageIncludeFiles() {
        return manageIncludeFiles;
    }

    public void setManageIncludeFiles(String manageIncludeFiles) {
        this.manageIncludeFiles = manageIncludeFiles;
    }

    public String getYarnAclEnable() {
        return yarnAclEnable;
    }

    public void setYarnAclEnable(String yarnAclEnable) {
        this.yarnAclEnable = yarnAclEnable;
    }

    public String getYarnAdminAcl() {
        return yarnAdminAcl;
    }

    public void setYarnAdminAcl(String yarnAdminAcl) {
        this.yarnAdminAcl = yarnAdminAcl;
    }

    public String getYarnApplicationClasspath() {
        return yarnApplicationClasspath;
    }

    public void setYarnApplicationClasspath(String yarnApplicationClasspath) {
        this.yarnApplicationClasspath = yarnApplicationClasspath;
    }

    public String getYarnClientNodemanagerConnectMaxWaitMs() {
        return yarnClientNodemanagerConnectMaxWaitMs;
    }

    public void setYarnClientNodemanagerConnectMaxWaitMs(String yarnClientNodemanagerConnectMaxWaitMs) {
        this.yarnClientNodemanagerConnectMaxWaitMs = yarnClientNodemanagerConnectMaxWaitMs;
    }

    public String getYarnClientNodemanagerConnectRetryIntervalMs() {
        return yarnClientNodemanagerConnectRetryIntervalMs;
    }

    public void setYarnClientNodemanagerConnectRetryIntervalMs(String yarnClientNodemanagerConnectRetryIntervalMs) {
        this.yarnClientNodemanagerConnectRetryIntervalMs = yarnClientNodemanagerConnectRetryIntervalMs;
    }

    public String getYarnHttpPolicy() {
        return yarnHttpPolicy;
    }

    public void setYarnHttpPolicy(String yarnHttpPolicy) {
        this.yarnHttpPolicy = yarnHttpPolicy;
    }

    public String getYarnLogAggregationEnable() {
        return yarnLogAggregationEnable;
    }

    public void setYarnLogAggregationEnable(String yarnLogAggregationEnable) {
        this.yarnLogAggregationEnable = yarnLogAggregationEnable;
    }

    public String getYarnLogAggregationRetainSeconds() {
        return yarnLogAggregationRetainSeconds;
    }

    public void setYarnLogAggregationRetainSeconds(String yarnLogAggregationRetainSeconds) {
        this.yarnLogAggregationRetainSeconds = yarnLogAggregationRetainSeconds;
    }

    public String getYarnLogServerUrl() {
        return yarnLogServerUrl;
    }

    public void setYarnLogServerUrl(String yarnLogServerUrl) {
        this.yarnLogServerUrl = yarnLogServerUrl;
    }

    public String getYarnLogServerWebServiceUrl() {
        return yarnLogServerWebServiceUrl;
    }

    public void setYarnLogServerWebServiceUrl(String yarnLogServerWebServiceUrl) {
        this.yarnLogServerWebServiceUrl = yarnLogServerWebServiceUrl;
    }

    public String getYarnNodeLabelsEnabled() {
        return yarnNodeLabelsEnabled;
    }

    public void setYarnNodeLabelsEnabled(String yarnNodeLabelsEnabled) {
        this.yarnNodeLabelsEnabled = yarnNodeLabelsEnabled;
    }

    public String getYarnNodeLabelsFsStoreRetryPolicySpec() {
        return yarnNodeLabelsFsStoreRetryPolicySpec;
    }

    public void setYarnNodeLabelsFsStoreRetryPolicySpec(String yarnNodeLabelsFsStoreRetryPolicySpec) {
        this.yarnNodeLabelsFsStoreRetryPolicySpec = yarnNodeLabelsFsStoreRetryPolicySpec;
    }

    public String getYarnNodeLabelsFsStoreRootDir() {
        return yarnNodeLabelsFsStoreRootDir;
    }

    public void setYarnNodeLabelsFsStoreRootDir(String yarnNodeLabelsFsStoreRootDir) {
        this.yarnNodeLabelsFsStoreRootDir = yarnNodeLabelsFsStoreRootDir;
    }

    public String getYarnNodemanagerAddress() {
        return yarnNodemanagerAddress;
    }

    public void setYarnNodemanagerAddress(String yarnNodemanagerAddress) {
        this.yarnNodemanagerAddress = yarnNodemanagerAddress;
    }

    public String getYarnNodemanagerAdminEnv() {
        return yarnNodemanagerAdminEnv;
    }

    public void setYarnNodemanagerAdminEnv(String yarnNodemanagerAdminEnv) {
        this.yarnNodemanagerAdminEnv = yarnNodemanagerAdminEnv;
    }

    public String getYarnNodemanagerAuxServices() {
        return yarnNodemanagerAuxServices;
    }

    public void setYarnNodemanagerAuxServices(String yarnNodemanagerAuxServices) {
        this.yarnNodemanagerAuxServices = yarnNodemanagerAuxServices;
    }

    public String getYarnNodemanagerAuxServicesMapreduceShuffleClass() {
        return yarnNodemanagerAuxServicesMapreduceShuffleClass;
    }

    public void setYarnNodemanagerAuxServicesMapreduceShuffleClass(String yarnNodemanagerAuxServicesMapreduceShuffleClass) {
        this.yarnNodemanagerAuxServicesMapreduceShuffleClass = yarnNodemanagerAuxServicesMapreduceShuffleClass;
    }

    public String getYarnNodemanagerAuxServicesSpark2ShuffleClass() {
        return yarnNodemanagerAuxServicesSpark2ShuffleClass;
    }

    public void setYarnNodemanagerAuxServicesSpark2ShuffleClass(String yarnNodemanagerAuxServicesSpark2ShuffleClass) {
        this.yarnNodemanagerAuxServicesSpark2ShuffleClass = yarnNodemanagerAuxServicesSpark2ShuffleClass;
    }

    public String getYarnNodemanagerAuxServicesSpark2ShuffleClasspath() {
        return yarnNodemanagerAuxServicesSpark2ShuffleClasspath;
    }

    public void setYarnNodemanagerAuxServicesSpark2ShuffleClasspath(String yarnNodemanagerAuxServicesSpark2ShuffleClasspath) {
        this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath = yarnNodemanagerAuxServicesSpark2ShuffleClasspath;
    }

    public String getYarnNodemanagerAuxServicesSparkShuffleClass() {
        return yarnNodemanagerAuxServicesSparkShuffleClass;
    }

    public void setYarnNodemanagerAuxServicesSparkShuffleClass(String yarnNodemanagerAuxServicesSparkShuffleClass) {
        this.yarnNodemanagerAuxServicesSparkShuffleClass = yarnNodemanagerAuxServicesSparkShuffleClass;
    }

    public String getYarnNodemanagerAuxServicesSparkShuffleClasspath() {
        return yarnNodemanagerAuxServicesSparkShuffleClasspath;
    }

    public void setYarnNodemanagerAuxServicesSparkShuffleClasspath(String yarnNodemanagerAuxServicesSparkShuffleClasspath) {
        this.yarnNodemanagerAuxServicesSparkShuffleClasspath = yarnNodemanagerAuxServicesSparkShuffleClasspath;
    }

    public String getYarnNodemanagerAuxServicesTimelineCollectorClass() {
        return yarnNodemanagerAuxServicesTimelineCollectorClass;
    }

    public void setYarnNodemanagerAuxServicesTimelineCollectorClass(String yarnNodemanagerAuxServicesTimelineCollectorClass) {
        this.yarnNodemanagerAuxServicesTimelineCollectorClass = yarnNodemanagerAuxServicesTimelineCollectorClass;
    }

    public String getYarnNodemanagerBindHost() {
        return yarnNodemanagerBindHost;
    }

    public void setYarnNodemanagerBindHost(String yarnNodemanagerBindHost) {
        this.yarnNodemanagerBindHost = yarnNodemanagerBindHost;
    }

    public String getYarnNodemanagerContainerExecutorClass() {
        return yarnNodemanagerContainerExecutorClass;
    }

    public void setYarnNodemanagerContainerExecutorClass(String yarnNodemanagerContainerExecutorClass) {
        this.yarnNodemanagerContainerExecutorClass = yarnNodemanagerContainerExecutorClass;
    }

    public String getYarnNodemanagerContainerMetricsUnregisterDelayMs() {
        return yarnNodemanagerContainerMetricsUnregisterDelayMs;
    }

    public void setYarnNodemanagerContainerMetricsUnregisterDelayMs(String yarnNodemanagerContainerMetricsUnregisterDelayMs) {
        this.yarnNodemanagerContainerMetricsUnregisterDelayMs = yarnNodemanagerContainerMetricsUnregisterDelayMs;
    }

    public String getYarnNodemanagerContainerMonitorIntervalMs() {
        return yarnNodemanagerContainerMonitorIntervalMs;
    }

    public void setYarnNodemanagerContainerMonitorIntervalMs(String yarnNodemanagerContainerMonitorIntervalMs) {
        this.yarnNodemanagerContainerMonitorIntervalMs = yarnNodemanagerContainerMonitorIntervalMs;
    }

    public String getYarnNodemanagerDeleteDebugDelaySec() {
        return yarnNodemanagerDeleteDebugDelaySec;
    }

    public void setYarnNodemanagerDeleteDebugDelaySec(String yarnNodemanagerDeleteDebugDelaySec) {
        this.yarnNodemanagerDeleteDebugDelaySec = yarnNodemanagerDeleteDebugDelaySec;
    }

    public String getYarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage() {
        return yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage;
    }

    public void setYarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage(String yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage) {
        this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage = yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage;
    }

    public String getYarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb() {
        return yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb;
    }

    public void setYarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb(String yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb) {
        this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb = yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb;
    }

    public String getYarnNodemanagerDiskHealthCheckerMinHealthyDisks() {
        return yarnNodemanagerDiskHealthCheckerMinHealthyDisks;
    }

    public void setYarnNodemanagerDiskHealthCheckerMinHealthyDisks(String yarnNodemanagerDiskHealthCheckerMinHealthyDisks) {
        this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks = yarnNodemanagerDiskHealthCheckerMinHealthyDisks;
    }

    public String getYarnNodemanagerHealthCheckerIntervalMs() {
        return yarnNodemanagerHealthCheckerIntervalMs;
    }

    public void setYarnNodemanagerHealthCheckerIntervalMs(String yarnNodemanagerHealthCheckerIntervalMs) {
        this.yarnNodemanagerHealthCheckerIntervalMs = yarnNodemanagerHealthCheckerIntervalMs;
    }

    public String getYarnNodemanagerHealthCheckerScriptTimeoutMs() {
        return yarnNodemanagerHealthCheckerScriptTimeoutMs;
    }

    public void setYarnNodemanagerHealthCheckerScriptTimeoutMs(String yarnNodemanagerHealthCheckerScriptTimeoutMs) {
        this.yarnNodemanagerHealthCheckerScriptTimeoutMs = yarnNodemanagerHealthCheckerScriptTimeoutMs;
    }

    public String getYarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage() {
        return yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage;
    }

    public void setYarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage(String yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage) {
        this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage = yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage;
    }

    public String getYarnNodemanagerLinuxContainerExecutorGroup() {
        return yarnNodemanagerLinuxContainerExecutorGroup;
    }

    public void setYarnNodemanagerLinuxContainerExecutorGroup(String yarnNodemanagerLinuxContainerExecutorGroup) {
        this.yarnNodemanagerLinuxContainerExecutorGroup = yarnNodemanagerLinuxContainerExecutorGroup;
    }

    public String getYarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers() {
        return yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers;
    }

    public void setYarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers(String yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers) {
        this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers = yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers;
    }

    public String getYarnNodemanagerLocalDirs() {
        return yarnNodemanagerLocalDirs;
    }

    public void setYarnNodemanagerLocalDirs(String yarnNodemanagerLocalDirs) {
        this.yarnNodemanagerLocalDirs = yarnNodemanagerLocalDirs;
    }

    public String getYarnNodemanagerLogAggregationCompressionType() {
        return yarnNodemanagerLogAggregationCompressionType;
    }

    public void setYarnNodemanagerLogAggregationCompressionType(String yarnNodemanagerLogAggregationCompressionType) {
        this.yarnNodemanagerLogAggregationCompressionType = yarnNodemanagerLogAggregationCompressionType;
    }

    public String getYarnNodemanagerLogAggregationDebugEnabled() {
        return yarnNodemanagerLogAggregationDebugEnabled;
    }

    public void setYarnNodemanagerLogAggregationDebugEnabled(String yarnNodemanagerLogAggregationDebugEnabled) {
        this.yarnNodemanagerLogAggregationDebugEnabled = yarnNodemanagerLogAggregationDebugEnabled;
    }

    public String getYarnNodemanagerLogAggregationNumLogFilesPerApp() {
        return yarnNodemanagerLogAggregationNumLogFilesPerApp;
    }

    public void setYarnNodemanagerLogAggregationNumLogFilesPerApp(String yarnNodemanagerLogAggregationNumLogFilesPerApp) {
        this.yarnNodemanagerLogAggregationNumLogFilesPerApp = yarnNodemanagerLogAggregationNumLogFilesPerApp;
    }

    public String getYarnNodemanagerLogAggregationRollMonitoringIntervalSeconds() {
        return yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds;
    }

    public void setYarnNodemanagerLogAggregationRollMonitoringIntervalSeconds(String yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds) {
        this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds = yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds;
    }

    public String getYarnNodemanagerLogDirs() {
        return yarnNodemanagerLogDirs;
    }

    public void setYarnNodemanagerLogDirs(String yarnNodemanagerLogDirs) {
        this.yarnNodemanagerLogDirs = yarnNodemanagerLogDirs;
    }

    public String getYarnNodemanagerLogRetainSeconds() {
        return yarnNodemanagerLogRetainSeconds;
    }

    public void setYarnNodemanagerLogRetainSeconds(String yarnNodemanagerLogRetainSeconds) {
        this.yarnNodemanagerLogRetainSeconds = yarnNodemanagerLogRetainSeconds;
    }

    public String getYarnNodemanagerRecoveryDir() {
        return yarnNodemanagerRecoveryDir;
    }

    public void setYarnNodemanagerRecoveryDir(String yarnNodemanagerRecoveryDir) {
        this.yarnNodemanagerRecoveryDir = yarnNodemanagerRecoveryDir;
    }

    public String getYarnNodemanagerRecoveryEnabled() {
        return yarnNodemanagerRecoveryEnabled;
    }

    public void setYarnNodemanagerRecoveryEnabled(String yarnNodemanagerRecoveryEnabled) {
        this.yarnNodemanagerRecoveryEnabled = yarnNodemanagerRecoveryEnabled;
    }

    public String getYarnNodemanagerRecoverySupervised() {
        return yarnNodemanagerRecoverySupervised;
    }

    public void setYarnNodemanagerRecoverySupervised(String yarnNodemanagerRecoverySupervised) {
        this.yarnNodemanagerRecoverySupervised = yarnNodemanagerRecoverySupervised;
    }

    public String getYarnNodemanagerRemoteAppLogDir() {
        return yarnNodemanagerRemoteAppLogDir;
    }

    public void setYarnNodemanagerRemoteAppLogDir(String yarnNodemanagerRemoteAppLogDir) {
        this.yarnNodemanagerRemoteAppLogDir = yarnNodemanagerRemoteAppLogDir;
    }

    public String getYarnNodemanagerRemoteAppLogDirSuffix() {
        return yarnNodemanagerRemoteAppLogDirSuffix;
    }

    public void setYarnNodemanagerRemoteAppLogDirSuffix(String yarnNodemanagerRemoteAppLogDirSuffix) {
        this.yarnNodemanagerRemoteAppLogDirSuffix = yarnNodemanagerRemoteAppLogDirSuffix;
    }

    public String getYarnNodemanagerResourcePlugins() {
        return yarnNodemanagerResourcePlugins;
    }

    public void setYarnNodemanagerResourcePlugins(String yarnNodemanagerResourcePlugins) {
        this.yarnNodemanagerResourcePlugins = yarnNodemanagerResourcePlugins;
    }

    public String getYarnNodemanagerResourcePluginsGpuAllowedGpuDevices() {
        return yarnNodemanagerResourcePluginsGpuAllowedGpuDevices;
    }

    public void setYarnNodemanagerResourcePluginsGpuAllowedGpuDevices(String yarnNodemanagerResourcePluginsGpuAllowedGpuDevices) {
        this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices = yarnNodemanagerResourcePluginsGpuAllowedGpuDevices;
    }

    public String getYarnNodemanagerResourcePluginsGpuDockerPlugin() {
        return yarnNodemanagerResourcePluginsGpuDockerPlugin;
    }

    public void setYarnNodemanagerResourcePluginsGpuDockerPlugin(String yarnNodemanagerResourcePluginsGpuDockerPlugin) {
        this.yarnNodemanagerResourcePluginsGpuDockerPlugin = yarnNodemanagerResourcePluginsGpuDockerPlugin;
    }

    public String getYarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint() {
        return yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint;
    }

    public void setYarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint(String yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint) {
        this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint = yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint;
    }

    public String getYarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables() {
        return yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables;
    }

    public void setYarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables(String yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables) {
        this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables = yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables;
    }

    public String getYarnNodemanagerResourceCpuVcores() {
        return yarnNodemanagerResourceCpuVcores;
    }

    public void setYarnNodemanagerResourceCpuVcores(String yarnNodemanagerResourceCpuVcores) {
        this.yarnNodemanagerResourceCpuVcores = yarnNodemanagerResourceCpuVcores;
    }

    public String getYarnNodemanagerResourceMemoryMb() {
        return yarnNodemanagerResourceMemoryMb;
    }

    public void setYarnNodemanagerResourceMemoryMb(String yarnNodemanagerResourceMemoryMb) {
        this.yarnNodemanagerResourceMemoryMb = yarnNodemanagerResourceMemoryMb;
    }

    public String getYarnNodemanagerResourcePercentagePhysicalCpuLimit() {
        return yarnNodemanagerResourcePercentagePhysicalCpuLimit;
    }

    public void setYarnNodemanagerResourcePercentagePhysicalCpuLimit(String yarnNodemanagerResourcePercentagePhysicalCpuLimit) {
        this.yarnNodemanagerResourcePercentagePhysicalCpuLimit = yarnNodemanagerResourcePercentagePhysicalCpuLimit;
    }

    public String getYarnNodemanagerRuntimeLinuxAllowedRuntimes() {
        return yarnNodemanagerRuntimeLinuxAllowedRuntimes;
    }

    public void setYarnNodemanagerRuntimeLinuxAllowedRuntimes(String yarnNodemanagerRuntimeLinuxAllowedRuntimes) {
        this.yarnNodemanagerRuntimeLinuxAllowedRuntimes = yarnNodemanagerRuntimeLinuxAllowedRuntimes;
    }

    public String getYarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks() {
        return yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks;
    }

    public void setYarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks(String yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks) {
        this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks = yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks;
    }

    public String getYarnNodemanagerRuntimeLinuxDockerCapabilities() {
        return yarnNodemanagerRuntimeLinuxDockerCapabilities;
    }

    public void setYarnNodemanagerRuntimeLinuxDockerCapabilities(String yarnNodemanagerRuntimeLinuxDockerCapabilities) {
        this.yarnNodemanagerRuntimeLinuxDockerCapabilities = yarnNodemanagerRuntimeLinuxDockerCapabilities;
    }

    public String getYarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork() {
        return yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork;
    }

    public void setYarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork(String yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork) {
        this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork = yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork;
    }

    public String getYarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl() {
        return yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl;
    }

    public void setYarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl(String yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl) {
        this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl = yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl;
    }

    public String getYarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed() {
        return yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed;
    }

    public void setYarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed(String yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed) {
        this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed = yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed;
    }

    public String getYarnNodemanagerVmemCheckEnabled() {
        return yarnNodemanagerVmemCheckEnabled;
    }

    public void setYarnNodemanagerVmemCheckEnabled(String yarnNodemanagerVmemCheckEnabled) {
        this.yarnNodemanagerVmemCheckEnabled = yarnNodemanagerVmemCheckEnabled;
    }

    public String getYarnNodemanagerVmemPmemRatio() {
        return yarnNodemanagerVmemPmemRatio;
    }

    public void setYarnNodemanagerVmemPmemRatio(String yarnNodemanagerVmemPmemRatio) {
        this.yarnNodemanagerVmemPmemRatio = yarnNodemanagerVmemPmemRatio;
    }

    public String getYarnNodemanagerWebappCrossOriginEnabled() {
        return yarnNodemanagerWebappCrossOriginEnabled;
    }

    public void setYarnNodemanagerWebappCrossOriginEnabled(String yarnNodemanagerWebappCrossOriginEnabled) {
        this.yarnNodemanagerWebappCrossOriginEnabled = yarnNodemanagerWebappCrossOriginEnabled;
    }

    public String getYarnResourcemanagerAddress() {
        return yarnResourcemanagerAddress;
    }

    public void setYarnResourcemanagerAddress(String yarnResourcemanagerAddress) {
        this.yarnResourcemanagerAddress = yarnResourcemanagerAddress;
    }

    public String getYarnResourcemanagerAdminAddress() {
        return yarnResourcemanagerAdminAddress;
    }

    public void setYarnResourcemanagerAdminAddress(String yarnResourcemanagerAdminAddress) {
        this.yarnResourcemanagerAdminAddress = yarnResourcemanagerAdminAddress;
    }

    public String getYarnResourcemanagerAmMaxAttempts() {
        return yarnResourcemanagerAmMaxAttempts;
    }

    public void setYarnResourcemanagerAmMaxAttempts(String yarnResourcemanagerAmMaxAttempts) {
        this.yarnResourcemanagerAmMaxAttempts = yarnResourcemanagerAmMaxAttempts;
    }

    public String getYarnResourcemanagerBindHost() {
        return yarnResourcemanagerBindHost;
    }

    public void setYarnResourcemanagerBindHost(String yarnResourcemanagerBindHost) {
        this.yarnResourcemanagerBindHost = yarnResourcemanagerBindHost;
    }

    public String getYarnResourcemanagerConnectMaxWaitMs() {
        return yarnResourcemanagerConnectMaxWaitMs;
    }

    public void setYarnResourcemanagerConnectMaxWaitMs(String yarnResourcemanagerConnectMaxWaitMs) {
        this.yarnResourcemanagerConnectMaxWaitMs = yarnResourcemanagerConnectMaxWaitMs;
    }

    public String getYarnResourcemanagerConnectRetryIntervalMs() {
        return yarnResourcemanagerConnectRetryIntervalMs;
    }

    public void setYarnResourcemanagerConnectRetryIntervalMs(String yarnResourcemanagerConnectRetryIntervalMs) {
        this.yarnResourcemanagerConnectRetryIntervalMs = yarnResourcemanagerConnectRetryIntervalMs;
    }

    public String getYarnResourcemanagerDisplayPerUserApps() {
        return yarnResourcemanagerDisplayPerUserApps;
    }

    public void setYarnResourcemanagerDisplayPerUserApps(String yarnResourcemanagerDisplayPerUserApps) {
        this.yarnResourcemanagerDisplayPerUserApps = yarnResourcemanagerDisplayPerUserApps;
    }

    public String getYarnResourcemanagerFsStateStoreRetryPolicySpec() {
        return yarnResourcemanagerFsStateStoreRetryPolicySpec;
    }

    public void setYarnResourcemanagerFsStateStoreRetryPolicySpec(String yarnResourcemanagerFsStateStoreRetryPolicySpec) {
        this.yarnResourcemanagerFsStateStoreRetryPolicySpec = yarnResourcemanagerFsStateStoreRetryPolicySpec;
    }

    public String getYarnResourcemanagerFsStateStoreUri() {
        return yarnResourcemanagerFsStateStoreUri;
    }

    public void setYarnResourcemanagerFsStateStoreUri(String yarnResourcemanagerFsStateStoreUri) {
        this.yarnResourcemanagerFsStateStoreUri = yarnResourcemanagerFsStateStoreUri;
    }

    public String getYarnResourcemanagerHaEnabled() {
        return yarnResourcemanagerHaEnabled;
    }

    public void setYarnResourcemanagerHaEnabled(String yarnResourcemanagerHaEnabled) {
        this.yarnResourcemanagerHaEnabled = yarnResourcemanagerHaEnabled;
    }

    public String getYarnResourcemanagerHostname() {
        return yarnResourcemanagerHostname;
    }

    public void setYarnResourcemanagerHostname(String yarnResourcemanagerHostname) {
        this.yarnResourcemanagerHostname = yarnResourcemanagerHostname;
    }

    public String getYarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled() {
        return yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled;
    }

    public void setYarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled(String yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled) {
        this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled = yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled;
    }

    public String getYarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval() {
        return yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval;
    }

    public void setYarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval(String yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval) {
        this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval = yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval;
    }

    public String getYarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor() {
        return yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor;
    }

    public void setYarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor(String yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor) {
        this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor = yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor;
    }

    public String getYarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound() {
        return yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound;
    }

    public void setYarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound(String yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound) {
        this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound = yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound;
    }

    public String getYarnResourcemanagerNodesExcludePath() {
        return yarnResourcemanagerNodesExcludePath;
    }

    public void setYarnResourcemanagerNodesExcludePath(String yarnResourcemanagerNodesExcludePath) {
        this.yarnResourcemanagerNodesExcludePath = yarnResourcemanagerNodesExcludePath;
    }

    public String getYarnResourcemanagerPlacementConstraintsHandler() {
        return yarnResourcemanagerPlacementConstraintsHandler;
    }

    public void setYarnResourcemanagerPlacementConstraintsHandler(String yarnResourcemanagerPlacementConstraintsHandler) {
        this.yarnResourcemanagerPlacementConstraintsHandler = yarnResourcemanagerPlacementConstraintsHandler;
    }

    public String getYarnResourcemanagerRecoveryEnabled() {
        return yarnResourcemanagerRecoveryEnabled;
    }

    public void setYarnResourcemanagerRecoveryEnabled(String yarnResourcemanagerRecoveryEnabled) {
        this.yarnResourcemanagerRecoveryEnabled = yarnResourcemanagerRecoveryEnabled;
    }

    public String getYarnResourcemanagerResourceTrackerAddress() {
        return yarnResourcemanagerResourceTrackerAddress;
    }

    public void setYarnResourcemanagerResourceTrackerAddress(String yarnResourcemanagerResourceTrackerAddress) {
        this.yarnResourcemanagerResourceTrackerAddress = yarnResourcemanagerResourceTrackerAddress;
    }

    public String getYarnResourcemanagerSchedulerAddress() {
        return yarnResourcemanagerSchedulerAddress;
    }

    public void setYarnResourcemanagerSchedulerAddress(String yarnResourcemanagerSchedulerAddress) {
        this.yarnResourcemanagerSchedulerAddress = yarnResourcemanagerSchedulerAddress;
    }

    public String getYarnResourcemanagerSchedulerClass() {
        return yarnResourcemanagerSchedulerClass;
    }

    public void setYarnResourcemanagerSchedulerClass(String yarnResourcemanagerSchedulerClass) {
        this.yarnResourcemanagerSchedulerClass = yarnResourcemanagerSchedulerClass;
    }

    public String getYarnResourcemanagerSchedulerMonitorEnable() {
        return yarnResourcemanagerSchedulerMonitorEnable;
    }

    public void setYarnResourcemanagerSchedulerMonitorEnable(String yarnResourcemanagerSchedulerMonitorEnable) {
        this.yarnResourcemanagerSchedulerMonitorEnable = yarnResourcemanagerSchedulerMonitorEnable;
    }

    public String getYarnResourcemanagerStateStoreMaxCompletedApplications() {
        return yarnResourcemanagerStateStoreMaxCompletedApplications;
    }

    public void setYarnResourcemanagerStateStoreMaxCompletedApplications(String yarnResourcemanagerStateStoreMaxCompletedApplications) {
        this.yarnResourcemanagerStateStoreMaxCompletedApplications = yarnResourcemanagerStateStoreMaxCompletedApplications;
    }

    public String getYarnResourcemanagerStoreClass() {
        return yarnResourcemanagerStoreClass;
    }

    public void setYarnResourcemanagerStoreClass(String yarnResourcemanagerStoreClass) {
        this.yarnResourcemanagerStoreClass = yarnResourcemanagerStoreClass;
    }

    public String getYarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize() {
        return yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize;
    }

    public void setYarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize(String yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize) {
        this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize = yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize;
    }

    public String getYarnResourcemanagerSystemMetricsPublisherEnabled() {
        return yarnResourcemanagerSystemMetricsPublisherEnabled;
    }

    public void setYarnResourcemanagerSystemMetricsPublisherEnabled(String yarnResourcemanagerSystemMetricsPublisherEnabled) {
        this.yarnResourcemanagerSystemMetricsPublisherEnabled = yarnResourcemanagerSystemMetricsPublisherEnabled;
    }

    public String getYarnResourcemanagerWebappAddress() {
        return yarnResourcemanagerWebappAddress;
    }

    public void setYarnResourcemanagerWebappAddress(String yarnResourcemanagerWebappAddress) {
        this.yarnResourcemanagerWebappAddress = yarnResourcemanagerWebappAddress;
    }

    public String getYarnResourcemanagerWebappCrossOriginEnabled() {
        return yarnResourcemanagerWebappCrossOriginEnabled;
    }

    public void setYarnResourcemanagerWebappCrossOriginEnabled(String yarnResourcemanagerWebappCrossOriginEnabled) {
        this.yarnResourcemanagerWebappCrossOriginEnabled = yarnResourcemanagerWebappCrossOriginEnabled;
    }

    public String getYarnResourcemanagerWebappDelegationTokenAuthFilterEnabled() {
        return yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled;
    }

    public void setYarnResourcemanagerWebappDelegationTokenAuthFilterEnabled(String yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled) {
        this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled = yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled;
    }

    public String getYarnResourcemanagerWebappHttpsAddress() {
        return yarnResourcemanagerWebappHttpsAddress;
    }

    public void setYarnResourcemanagerWebappHttpsAddress(String yarnResourcemanagerWebappHttpsAddress) {
        this.yarnResourcemanagerWebappHttpsAddress = yarnResourcemanagerWebappHttpsAddress;
    }

    public String getYarnResourcemanagerWorkPreservingRecoveryEnabled() {
        return yarnResourcemanagerWorkPreservingRecoveryEnabled;
    }

    public void setYarnResourcemanagerWorkPreservingRecoveryEnabled(String yarnResourcemanagerWorkPreservingRecoveryEnabled) {
        this.yarnResourcemanagerWorkPreservingRecoveryEnabled = yarnResourcemanagerWorkPreservingRecoveryEnabled;
    }

    public String getYarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs() {
        return yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs;
    }

    public void setYarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs(String yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs) {
        this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs = yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs;
    }

    public String getYarnResourcemanagerZkAcl() {
        return yarnResourcemanagerZkAcl;
    }

    public void setYarnResourcemanagerZkAcl(String yarnResourcemanagerZkAcl) {
        this.yarnResourcemanagerZkAcl = yarnResourcemanagerZkAcl;
    }

    public String getYarnResourcemanagerZkAddress() {
        return yarnResourcemanagerZkAddress;
    }

    public void setYarnResourcemanagerZkAddress(String yarnResourcemanagerZkAddress) {
        this.yarnResourcemanagerZkAddress = yarnResourcemanagerZkAddress;
    }

    public String getYarnResourcemanagerZkNumRetries() {
        return yarnResourcemanagerZkNumRetries;
    }

    public void setYarnResourcemanagerZkNumRetries(String yarnResourcemanagerZkNumRetries) {
        this.yarnResourcemanagerZkNumRetries = yarnResourcemanagerZkNumRetries;
    }

    public String getYarnResourcemanagerZkRetryIntervalMs() {
        return yarnResourcemanagerZkRetryIntervalMs;
    }

    public void setYarnResourcemanagerZkRetryIntervalMs(String yarnResourcemanagerZkRetryIntervalMs) {
        this.yarnResourcemanagerZkRetryIntervalMs = yarnResourcemanagerZkRetryIntervalMs;
    }

    public String getYarnResourcemanagerZkStateStoreParentPath() {
        return yarnResourcemanagerZkStateStoreParentPath;
    }

    public void setYarnResourcemanagerZkStateStoreParentPath(String yarnResourcemanagerZkStateStoreParentPath) {
        this.yarnResourcemanagerZkStateStoreParentPath = yarnResourcemanagerZkStateStoreParentPath;
    }

    public String getYarnResourcemanagerZkTimeoutMs() {
        return yarnResourcemanagerZkTimeoutMs;
    }

    public void setYarnResourcemanagerZkTimeoutMs(String yarnResourcemanagerZkTimeoutMs) {
        this.yarnResourcemanagerZkTimeoutMs = yarnResourcemanagerZkTimeoutMs;
    }

    public String getYarnRmSystemMetricspublisherEmitContainerEvents() {
        return yarnRmSystemMetricspublisherEmitContainerEvents;
    }

    public void setYarnRmSystemMetricspublisherEmitContainerEvents(String yarnRmSystemMetricspublisherEmitContainerEvents) {
        this.yarnRmSystemMetricspublisherEmitContainerEvents = yarnRmSystemMetricspublisherEmitContainerEvents;
    }

    public String getYarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled() {
        return yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled;
    }

    public void setYarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled(String yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled) {
        this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled = yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled;
    }

    public String getYarnSchedulerMaximumAllocationMb() {
        return yarnSchedulerMaximumAllocationMb;
    }

    public void setYarnSchedulerMaximumAllocationMb(String yarnSchedulerMaximumAllocationMb) {
        this.yarnSchedulerMaximumAllocationMb = yarnSchedulerMaximumAllocationMb;
    }

    public String getYarnSchedulerMaximumAllocationVcores() {
        return yarnSchedulerMaximumAllocationVcores;
    }

    public void setYarnSchedulerMaximumAllocationVcores(String yarnSchedulerMaximumAllocationVcores) {
        this.yarnSchedulerMaximumAllocationVcores = yarnSchedulerMaximumAllocationVcores;
    }

    public String getYarnSchedulerMinimumAllocationMb() {
        return yarnSchedulerMinimumAllocationMb;
    }

    public void setYarnSchedulerMinimumAllocationMb(String yarnSchedulerMinimumAllocationMb) {
        this.yarnSchedulerMinimumAllocationMb = yarnSchedulerMinimumAllocationMb;
    }

    public String getYarnSchedulerMinimumAllocationVcores() {
        return yarnSchedulerMinimumAllocationVcores;
    }

    public void setYarnSchedulerMinimumAllocationVcores(String yarnSchedulerMinimumAllocationVcores) {
        this.yarnSchedulerMinimumAllocationVcores = yarnSchedulerMinimumAllocationVcores;
    }

    public String getYarnServiceFrameworkPath() {
        return yarnServiceFrameworkPath;
    }

    public void setYarnServiceFrameworkPath(String yarnServiceFrameworkPath) {
        this.yarnServiceFrameworkPath = yarnServiceFrameworkPath;
    }

    public String getYarnServiceSystemServiceDir() {
        return yarnServiceSystemServiceDir;
    }

    public void setYarnServiceSystemServiceDir(String yarnServiceSystemServiceDir) {
        this.yarnServiceSystemServiceDir = yarnServiceSystemServiceDir;
    }

    public String getYarnSystemMetricspublisherEnabled() {
        return yarnSystemMetricspublisherEnabled;
    }

    public void setYarnSystemMetricspublisherEnabled(String yarnSystemMetricspublisherEnabled) {
        this.yarnSystemMetricspublisherEnabled = yarnSystemMetricspublisherEnabled;
    }

    public String getYarnTimelineServiceAddress() {
        return yarnTimelineServiceAddress;
    }

    public void setYarnTimelineServiceAddress(String yarnTimelineServiceAddress) {
        this.yarnTimelineServiceAddress = yarnTimelineServiceAddress;
    }

    public String getYarnTimelineServiceBindHost() {
        return yarnTimelineServiceBindHost;
    }

    public void setYarnTimelineServiceBindHost(String yarnTimelineServiceBindHost) {
        this.yarnTimelineServiceBindHost = yarnTimelineServiceBindHost;
    }

    public String getYarnTimelineServiceClientMaxRetries() {
        return yarnTimelineServiceClientMaxRetries;
    }

    public void setYarnTimelineServiceClientMaxRetries(String yarnTimelineServiceClientMaxRetries) {
        this.yarnTimelineServiceClientMaxRetries = yarnTimelineServiceClientMaxRetries;
    }

    public String getYarnTimelineServiceClientRetryIntervalMs() {
        return yarnTimelineServiceClientRetryIntervalMs;
    }

    public void setYarnTimelineServiceClientRetryIntervalMs(String yarnTimelineServiceClientRetryIntervalMs) {
        this.yarnTimelineServiceClientRetryIntervalMs = yarnTimelineServiceClientRetryIntervalMs;
    }

    public String getYarnTimelineServiceEnabled() {
        return yarnTimelineServiceEnabled;
    }

    public void setYarnTimelineServiceEnabled(String yarnTimelineServiceEnabled) {
        this.yarnTimelineServiceEnabled = yarnTimelineServiceEnabled;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreActiveDir() {
        return yarnTimelineServiceEntityGroupFsStoreActiveDir;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreActiveDir(String yarnTimelineServiceEntityGroupFsStoreActiveDir) {
        this.yarnTimelineServiceEntityGroupFsStoreActiveDir = yarnTimelineServiceEntityGroupFsStoreActiveDir;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreAppCacheSize() {
        return yarnTimelineServiceEntityGroupFsStoreAppCacheSize;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreAppCacheSize(String yarnTimelineServiceEntityGroupFsStoreAppCacheSize) {
        this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize = yarnTimelineServiceEntityGroupFsStoreAppCacheSize;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds() {
        return yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds(String yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds) {
        this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds = yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreDoneDir() {
        return yarnTimelineServiceEntityGroupFsStoreDoneDir;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreDoneDir(String yarnTimelineServiceEntityGroupFsStoreDoneDir) {
        this.yarnTimelineServiceEntityGroupFsStoreDoneDir = yarnTimelineServiceEntityGroupFsStoreDoneDir;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses() {
        return yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses(String yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses) {
        this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses = yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath() {
        return yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath(String yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath) {
        this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath = yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreRetainSeconds() {
        return yarnTimelineServiceEntityGroupFsStoreRetainSeconds;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreRetainSeconds(String yarnTimelineServiceEntityGroupFsStoreRetainSeconds) {
        this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds = yarnTimelineServiceEntityGroupFsStoreRetainSeconds;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds() {
        return yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds(String yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds) {
        this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds = yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds;
    }

    public String getYarnTimelineServiceEntityGroupFsStoreSummaryStore() {
        return yarnTimelineServiceEntityGroupFsStoreSummaryStore;
    }

    public void setYarnTimelineServiceEntityGroupFsStoreSummaryStore(String yarnTimelineServiceEntityGroupFsStoreSummaryStore) {
        this.yarnTimelineServiceEntityGroupFsStoreSummaryStore = yarnTimelineServiceEntityGroupFsStoreSummaryStore;
    }

    public String getYarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo() {
        return yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo;
    }

    public void setYarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo(String yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo) {
        this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo = yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo;
    }

    public String getYarnTimelineServiceGenericApplicationHistoryStoreClass() {
        return yarnTimelineServiceGenericApplicationHistoryStoreClass;
    }

    public void setYarnTimelineServiceGenericApplicationHistoryStoreClass(String yarnTimelineServiceGenericApplicationHistoryStoreClass) {
        this.yarnTimelineServiceGenericApplicationHistoryStoreClass = yarnTimelineServiceGenericApplicationHistoryStoreClass;
    }

    public String getYarnTimelineServiceHbaseSchemaPrefix() {
        return yarnTimelineServiceHbaseSchemaPrefix;
    }

    public void setYarnTimelineServiceHbaseSchemaPrefix(String yarnTimelineServiceHbaseSchemaPrefix) {
        this.yarnTimelineServiceHbaseSchemaPrefix = yarnTimelineServiceHbaseSchemaPrefix;
    }

    public String getYarnTimelineServiceHbaseConfigurationFile() {
        return yarnTimelineServiceHbaseConfigurationFile;
    }

    public void setYarnTimelineServiceHbaseConfigurationFile(String yarnTimelineServiceHbaseConfigurationFile) {
        this.yarnTimelineServiceHbaseConfigurationFile = yarnTimelineServiceHbaseConfigurationFile;
    }

    public String getYarnTimelineServiceHbaseCoprocessorJarHdfsLocation() {
        return yarnTimelineServiceHbaseCoprocessorJarHdfsLocation;
    }

    public void setYarnTimelineServiceHbaseCoprocessorJarHdfsLocation(String yarnTimelineServiceHbaseCoprocessorJarHdfsLocation) {
        this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation = yarnTimelineServiceHbaseCoprocessorJarHdfsLocation;
    }

    public String getYarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed() {
        return yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed;
    }

    public void setYarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed(String yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed) {
        this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed = yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed;
    }

    public String getYarnTimelineServiceHttpAuthenticationType() {
        return yarnTimelineServiceHttpAuthenticationType;
    }

    public void setYarnTimelineServiceHttpAuthenticationType(String yarnTimelineServiceHttpAuthenticationType) {
        this.yarnTimelineServiceHttpAuthenticationType = yarnTimelineServiceHttpAuthenticationType;
    }

    public String getYarnTimelineServiceHttpCrossOriginEnabled() {
        return yarnTimelineServiceHttpCrossOriginEnabled;
    }

    public void setYarnTimelineServiceHttpCrossOriginEnabled(String yarnTimelineServiceHttpCrossOriginEnabled) {
        this.yarnTimelineServiceHttpCrossOriginEnabled = yarnTimelineServiceHttpCrossOriginEnabled;
    }

    public String getYarnTimelineServiceLeveldbStateStorePath() {
        return yarnTimelineServiceLeveldbStateStorePath;
    }

    public void setYarnTimelineServiceLeveldbStateStorePath(String yarnTimelineServiceLeveldbStateStorePath) {
        this.yarnTimelineServiceLeveldbStateStorePath = yarnTimelineServiceLeveldbStateStorePath;
    }

    public String getYarnTimelineServiceLeveldbTimelineStorePath() {
        return yarnTimelineServiceLeveldbTimelineStorePath;
    }

    public void setYarnTimelineServiceLeveldbTimelineStorePath(String yarnTimelineServiceLeveldbTimelineStorePath) {
        this.yarnTimelineServiceLeveldbTimelineStorePath = yarnTimelineServiceLeveldbTimelineStorePath;
    }

    public String getYarnTimelineServiceLeveldbTimelineStoreReadCacheSize() {
        return yarnTimelineServiceLeveldbTimelineStoreReadCacheSize;
    }

    public void setYarnTimelineServiceLeveldbTimelineStoreReadCacheSize(String yarnTimelineServiceLeveldbTimelineStoreReadCacheSize) {
        this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize = yarnTimelineServiceLeveldbTimelineStoreReadCacheSize;
    }

    public String getYarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize() {
        return yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize;
    }

    public void setYarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize(String yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize) {
        this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize = yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize;
    }

    public String getYarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize() {
        return yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize;
    }

    public void setYarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize(String yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize) {
        this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize = yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize;
    }

    public String getYarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs() {
        return yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs;
    }

    public void setYarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs(String yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs) {
        this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs = yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs;
    }

    public String getYarnTimelineServiceReaderWebappAddress() {
        return yarnTimelineServiceReaderWebappAddress;
    }

    public void setYarnTimelineServiceReaderWebappAddress(String yarnTimelineServiceReaderWebappAddress) {
        this.yarnTimelineServiceReaderWebappAddress = yarnTimelineServiceReaderWebappAddress;
    }

    public String getYarnTimelineServiceReaderWebappHttpsAddress() {
        return yarnTimelineServiceReaderWebappHttpsAddress;
    }

    public void setYarnTimelineServiceReaderWebappHttpsAddress(String yarnTimelineServiceReaderWebappHttpsAddress) {
        this.yarnTimelineServiceReaderWebappHttpsAddress = yarnTimelineServiceReaderWebappHttpsAddress;
    }

    public String getYarnTimelineServiceRecoveryEnabled() {
        return yarnTimelineServiceRecoveryEnabled;
    }

    public void setYarnTimelineServiceRecoveryEnabled(String yarnTimelineServiceRecoveryEnabled) {
        this.yarnTimelineServiceRecoveryEnabled = yarnTimelineServiceRecoveryEnabled;
    }

    public String getYarnTimelineServiceStateStoreClass() {
        return yarnTimelineServiceStateStoreClass;
    }

    public void setYarnTimelineServiceStateStoreClass(String yarnTimelineServiceStateStoreClass) {
        this.yarnTimelineServiceStateStoreClass = yarnTimelineServiceStateStoreClass;
    }

    public String getYarnTimelineServiceStoreClass() {
        return yarnTimelineServiceStoreClass;
    }

    public void setYarnTimelineServiceStoreClass(String yarnTimelineServiceStoreClass) {
        this.yarnTimelineServiceStoreClass = yarnTimelineServiceStoreClass;
    }

    public String getYarnTimelineServiceTtlEnable() {
        return yarnTimelineServiceTtlEnable;
    }

    public void setYarnTimelineServiceTtlEnable(String yarnTimelineServiceTtlEnable) {
        this.yarnTimelineServiceTtlEnable = yarnTimelineServiceTtlEnable;
    }

    public String getYarnTimelineServiceTtlMs() {
        return yarnTimelineServiceTtlMs;
    }

    public void setYarnTimelineServiceTtlMs(String yarnTimelineServiceTtlMs) {
        this.yarnTimelineServiceTtlMs = yarnTimelineServiceTtlMs;
    }

    public String getYarnTimelineServiceVersion() {
        return yarnTimelineServiceVersion;
    }

    public void setYarnTimelineServiceVersion(String yarnTimelineServiceVersion) {
        this.yarnTimelineServiceVersion = yarnTimelineServiceVersion;
    }

    public String getYarnTimelineServiceVersions() {
        return yarnTimelineServiceVersions;
    }

    public void setYarnTimelineServiceVersions(String yarnTimelineServiceVersions) {
        this.yarnTimelineServiceVersions = yarnTimelineServiceVersions;
    }

    public String getYarnTimelineServiceWebappAddress() {
        return yarnTimelineServiceWebappAddress;
    }

    public void setYarnTimelineServiceWebappAddress(String yarnTimelineServiceWebappAddress) {
        this.yarnTimelineServiceWebappAddress = yarnTimelineServiceWebappAddress;
    }

    public String getYarnTimelineServiceWebappHttpsAddress() {
        return yarnTimelineServiceWebappHttpsAddress;
    }

    public void setYarnTimelineServiceWebappHttpsAddress(String yarnTimelineServiceWebappHttpsAddress) {
        this.yarnTimelineServiceWebappHttpsAddress = yarnTimelineServiceWebappHttpsAddress;
    }

    public String getYarnWebappApiServiceEnable() {
        return yarnWebappApiServiceEnable;
    }

    public void setYarnWebappApiServiceEnable(String yarnWebappApiServiceEnable) {
        this.yarnWebappApiServiceEnable = yarnWebappApiServiceEnable;
    }

    public String getYarnWebappUi2Enable() {
        return yarnWebappUi2Enable;
    }

    public void setYarnWebappUi2Enable(String yarnWebappUi2Enable) {
        this.yarnWebappUi2Enable = yarnWebappUi2Enable;
    }

    public String getYarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups() {
        return yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups;
    }

    public void setYarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups(String yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups) {
        this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups = yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups;
    }

    public String getYarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts() {
        return yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts;
    }

    public void setYarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts(String yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts) {
        this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts = yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts;
    }

    public String getYarnSchedulerCapacityRootSparkCapacity() {
        return yarnSchedulerCapacityRootSparkCapacity;
    }

    public void setYarnSchedulerCapacityRootSparkCapacity(String yarnSchedulerCapacityRootSparkCapacity) {
        this.yarnSchedulerCapacityRootSparkCapacity = yarnSchedulerCapacityRootSparkCapacity;
    }

    public String getYarnSchedulerCapacityRootSparkMaximumCapacity() {
        return yarnSchedulerCapacityRootSparkMaximumCapacity;
    }

    public void setYarnSchedulerCapacityRootSparkMaximumCapacity(String yarnSchedulerCapacityRootSparkMaximumCapacity) {
        this.yarnSchedulerCapacityRootSparkMaximumCapacity = yarnSchedulerCapacityRootSparkMaximumCapacity;
    }

    public String getYarnSchedulerCapacityRootSparkState() {
        return yarnSchedulerCapacityRootSparkState;
    }

    public void setYarnSchedulerCapacityRootSparkState(String yarnSchedulerCapacityRootSparkState) {
        this.yarnSchedulerCapacityRootSparkState = yarnSchedulerCapacityRootSparkState;
    }

    public String getYarnSchedulerCapacityRootSparkUserLimitFactor() {
        return yarnSchedulerCapacityRootSparkUserLimitFactor;
    }

    public void setYarnSchedulerCapacityRootSparkUserLimitFactor(String yarnSchedulerCapacityRootSparkUserLimitFactor) {
        this.yarnSchedulerCapacityRootSparkUserLimitFactor = yarnSchedulerCapacityRootSparkUserLimitFactor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("yarnResourceTypes");
        sb.append('=');
        sb.append(((this.yarnResourceTypes == null)?"<null>":this.yarnResourceTypes));
        sb.append(',');
        sb.append("yarnResourceTypesYarnIoGpuMaximumAllocation");
        sb.append('=');
        sb.append(((this.yarnResourceTypesYarnIoGpuMaximumAllocation == null)?"<null>":this.yarnResourceTypesYarnIoGpuMaximumAllocation));
        sb.append(',');
        sb.append("cgroupRoot");
        sb.append('=');
        sb.append(((this.cgroupRoot == null)?"<null>":this.cgroupRoot));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("dockerAllowedDevices");
        sb.append('=');
        sb.append(((this.dockerAllowedDevices == null)?"<null>":this.dockerAllowedDevices));
        sb.append(',');
        sb.append("dockerAllowedRoMounts");
        sb.append('=');
        sb.append(((this.dockerAllowedRoMounts == null)?"<null>":this.dockerAllowedRoMounts));
        sb.append(',');
        sb.append("dockerAllowedRwMounts");
        sb.append('=');
        sb.append(((this.dockerAllowedRwMounts == null)?"<null>":this.dockerAllowedRwMounts));
        sb.append(',');
        sb.append("dockerAllowedVolumeDrivers");
        sb.append('=');
        sb.append(((this.dockerAllowedVolumeDrivers == null)?"<null>":this.dockerAllowedVolumeDrivers));
        sb.append(',');
        sb.append("dockerBinary");
        sb.append('=');
        sb.append(((this.dockerBinary == null)?"<null>":this.dockerBinary));
        sb.append(',');
        sb.append("dockerModuleEnabled");
        sb.append('=');
        sb.append(((this.dockerModuleEnabled == null)?"<null>":this.dockerModuleEnabled));
        sb.append(',');
        sb.append("dockerPrivilegedContainersEnabled");
        sb.append('=');
        sb.append(((this.dockerPrivilegedContainersEnabled == null)?"<null>":this.dockerPrivilegedContainersEnabled));
        sb.append(',');
        sb.append("dockerTrustedRegistries");
        sb.append('=');
        sb.append(((this.dockerTrustedRegistries == null)?"<null>":this.dockerTrustedRegistries));
        sb.append(',');
        sb.append("gpuModuleEnabled");
        sb.append('=');
        sb.append(((this.gpuModuleEnabled == null)?"<null>":this.gpuModuleEnabled));
        sb.append(',');
        sb.append("minUserId");
        sb.append('=');
        sb.append(((this.minUserId == null)?"<null>":this.minUserId));
        sb.append(',');
        sb.append("yarnHierarchy");
        sb.append('=');
        sb.append(((this.yarnHierarchy == null)?"<null>":this.yarnHierarchy));
        sb.append(',');
        sb.append("apptimelineserverHeapsize");
        sb.append('=');
        sb.append(((this.apptimelineserverHeapsize == null)?"<null>":this.apptimelineserverHeapsize));
        sb.append(',');
        sb.append("isSupportedYarnRanger");
        sb.append('=');
        sb.append(((this.isSupportedYarnRanger == null)?"<null>":this.isSupportedYarnRanger));
        sb.append(',');
        sb.append("nodemanagerHeapsize");
        sb.append('=');
        sb.append(((this.nodemanagerHeapsize == null)?"<null>":this.nodemanagerHeapsize));
        sb.append(',');
        sb.append("registryDnsBindPort");
        sb.append('=');
        sb.append(((this.registryDnsBindPort == null)?"<null>":this.registryDnsBindPort));
        sb.append(',');
        sb.append("resourcemanagerHeapsize");
        sb.append('=');
        sb.append(((this.resourcemanagerHeapsize == null)?"<null>":this.resourcemanagerHeapsize));
        sb.append(',');
        sb.append("serviceCheckQueueName");
        sb.append('=');
        sb.append(((this.serviceCheckQueueName == null)?"<null>":this.serviceCheckQueueName));
        sb.append(',');
        sb.append("yarnAtsUser");
        sb.append('=');
        sb.append(((this.yarnAtsUser == null)?"<null>":this.yarnAtsUser));
        sb.append(',');
        sb.append("yarnCgroupsEnabled");
        sb.append('=');
        sb.append(((this.yarnCgroupsEnabled == null)?"<null>":this.yarnCgroupsEnabled));
        sb.append(',');
        sb.append("yarnHeapsize");
        sb.append('=');
        sb.append(((this.yarnHeapsize == null)?"<null>":this.yarnHeapsize));
        sb.append(',');
        sb.append("yarnLogDirPrefix");
        sb.append('=');
        sb.append(((this.yarnLogDirPrefix == null)?"<null>":this.yarnLogDirPrefix));
        sb.append(',');
        sb.append("yarnPidDirPrefix");
        sb.append('=');
        sb.append(((this.yarnPidDirPrefix == null)?"<null>":this.yarnPidDirPrefix));
        sb.append(',');
        sb.append("yarnUser");
        sb.append('=');
        sb.append(((this.yarnUser == null)?"<null>":this.yarnUser));
        sb.append(',');
        sb.append("yarnUserNofileLimit");
        sb.append('=');
        sb.append(((this.yarnUserNofileLimit == null)?"<null>":this.yarnUserNofileLimit));
        sb.append(',');
        sb.append("yarnUserNprocLimit");
        sb.append('=');
        sb.append(((this.yarnUserNprocLimit == null)?"<null>":this.yarnUserNprocLimit));
        sb.append(',');
        sb.append("hbaseJavaIoTmpdir");
        sb.append('=');
        sb.append(((this.hbaseJavaIoTmpdir == null)?"<null>":this.hbaseJavaIoTmpdir));
        sb.append(',');
        sb.append("isHbaseSystemServiceLaunch");
        sb.append('=');
        sb.append(((this.isHbaseSystemServiceLaunch == null)?"<null>":this.isHbaseSystemServiceLaunch));
        sb.append(',');
        sb.append("yarnHbaseClientContainers");
        sb.append('=');
        sb.append(((this.yarnHbaseClientContainers == null)?"<null>":this.yarnHbaseClientContainers));
        sb.append(',');
        sb.append("yarnHbaseClientCpu");
        sb.append('=');
        sb.append(((this.yarnHbaseClientCpu == null)?"<null>":this.yarnHbaseClientCpu));
        sb.append(',');
        sb.append("yarnHbaseClientMemory");
        sb.append('=');
        sb.append(((this.yarnHbaseClientMemory == null)?"<null>":this.yarnHbaseClientMemory));
        sb.append(',');
        sb.append("yarnHbaseHeapMemoryFactor");
        sb.append('=');
        sb.append(((this.yarnHbaseHeapMemoryFactor == null)?"<null>":this.yarnHbaseHeapMemoryFactor));
        sb.append(',');
        sb.append("yarnHbaseMasterContainers");
        sb.append('=');
        sb.append(((this.yarnHbaseMasterContainers == null)?"<null>":this.yarnHbaseMasterContainers));
        sb.append(',');
        sb.append("yarnHbaseMasterCpu");
        sb.append('=');
        sb.append(((this.yarnHbaseMasterCpu == null)?"<null>":this.yarnHbaseMasterCpu));
        sb.append(',');
        sb.append("yarnHbaseMasterMemory");
        sb.append('=');
        sb.append(((this.yarnHbaseMasterMemory == null)?"<null>":this.yarnHbaseMasterMemory));
        sb.append(',');
        sb.append("yarnHbasePidDirPrefix");
        sb.append('=');
        sb.append(((this.yarnHbasePidDirPrefix == null)?"<null>":this.yarnHbasePidDirPrefix));
        sb.append(',');
        sb.append("yarnHbaseRegionserverContainers");
        sb.append('=');
        sb.append(((this.yarnHbaseRegionserverContainers == null)?"<null>":this.yarnHbaseRegionserverContainers));
        sb.append(',');
        sb.append("yarnHbaseRegionserverCpu");
        sb.append('=');
        sb.append(((this.yarnHbaseRegionserverCpu == null)?"<null>":this.yarnHbaseRegionserverCpu));
        sb.append(',');
        sb.append("yarnHbaseRegionserverMemory");
        sb.append('=');
        sb.append(((this.yarnHbaseRegionserverMemory == null)?"<null>":this.yarnHbaseRegionserverMemory));
        sb.append(',');
        sb.append("yarnHbaseSystemServiceLaunchMode");
        sb.append('=');
        sb.append(((this.yarnHbaseSystemServiceLaunchMode == null)?"<null>":this.yarnHbaseSystemServiceLaunchMode));
        sb.append(',');
        sb.append("yarnHbaseSystemServiceQueueName");
        sb.append('=');
        sb.append(((this.yarnHbaseSystemServiceQueueName == null)?"<null>":this.yarnHbaseSystemServiceQueueName));
        sb.append(',');
        sb.append("hbaseLogMaxbackupindex");
        sb.append('=');
        sb.append(((this.hbaseLogMaxbackupindex == null)?"<null>":this.hbaseLogMaxbackupindex));
        sb.append(',');
        sb.append("hbaseLogMaxfilesize");
        sb.append('=');
        sb.append(((this.hbaseLogMaxfilesize == null)?"<null>":this.hbaseLogMaxfilesize));
        sb.append(',');
        sb.append("hbaseSecurityLogMaxbackupindex");
        sb.append('=');
        sb.append(((this.hbaseSecurityLogMaxbackupindex == null)?"<null>":this.hbaseSecurityLogMaxbackupindex));
        sb.append(',');
        sb.append("hbaseSecurityLogMaxfilesize");
        sb.append('=');
        sb.append(((this.hbaseSecurityLogMaxfilesize == null)?"<null>":this.hbaseSecurityLogMaxfilesize));
        sb.append(',');
        sb.append("securityAdminProtocolAcl");
        sb.append('=');
        sb.append(((this.securityAdminProtocolAcl == null)?"<null>":this.securityAdminProtocolAcl));
        sb.append(',');
        sb.append("securityClientProtocolAcl");
        sb.append('=');
        sb.append(((this.securityClientProtocolAcl == null)?"<null>":this.securityClientProtocolAcl));
        sb.append(',');
        sb.append("securityMasterregionProtocolAcl");
        sb.append('=');
        sb.append(((this.securityMasterregionProtocolAcl == null)?"<null>":this.securityMasterregionProtocolAcl));
        sb.append(',');
        sb.append("dfsDomainSocketPath");
        sb.append('=');
        sb.append(((this.dfsDomainSocketPath == null)?"<null>":this.dfsDomainSocketPath));
        sb.append(',');
        sb.append("hbaseBucketcacheIoengine");
        sb.append('=');
        sb.append(((this.hbaseBucketcacheIoengine == null)?"<null>":this.hbaseBucketcacheIoengine));
        sb.append(',');
        sb.append("hbaseBucketcachePercentageInCombinedcache");
        sb.append('=');
        sb.append(((this.hbaseBucketcachePercentageInCombinedcache == null)?"<null>":this.hbaseBucketcachePercentageInCombinedcache));
        sb.append(',');
        sb.append("hbaseBucketcacheSize");
        sb.append('=');
        sb.append(((this.hbaseBucketcacheSize == null)?"<null>":this.hbaseBucketcacheSize));
        sb.append(',');
        sb.append("hbaseClientKeyvalueMaxsize");
        sb.append('=');
        sb.append(((this.hbaseClientKeyvalueMaxsize == null)?"<null>":this.hbaseClientKeyvalueMaxsize));
        sb.append(',');
        sb.append("hbaseClientRetriesNumber");
        sb.append('=');
        sb.append(((this.hbaseClientRetriesNumber == null)?"<null>":this.hbaseClientRetriesNumber));
        sb.append(',');
        sb.append("hbaseClientScannerCaching");
        sb.append('=');
        sb.append(((this.hbaseClientScannerCaching == null)?"<null>":this.hbaseClientScannerCaching));
        sb.append(',');
        sb.append("hbaseClusterDistributed");
        sb.append('=');
        sb.append(((this.hbaseClusterDistributed == null)?"<null>":this.hbaseClusterDistributed));
        sb.append(',');
        sb.append("hbaseCoprocessorMasterClasses");
        sb.append('=');
        sb.append(((this.hbaseCoprocessorMasterClasses == null)?"<null>":this.hbaseCoprocessorMasterClasses));
        sb.append(',');
        sb.append("hbaseCoprocessorRegionClasses");
        sb.append('=');
        sb.append(((this.hbaseCoprocessorRegionClasses == null)?"<null>":this.hbaseCoprocessorRegionClasses));
        sb.append(',');
        sb.append("hbaseCoprocessorRegionserverClasses");
        sb.append('=');
        sb.append(((this.hbaseCoprocessorRegionserverClasses == null)?"<null>":this.hbaseCoprocessorRegionserverClasses));
        sb.append(',');
        sb.append("hbaseDefaultsForVersionSkip");
        sb.append('=');
        sb.append(((this.hbaseDefaultsForVersionSkip == null)?"<null>":this.hbaseDefaultsForVersionSkip));
        sb.append(',');
        sb.append("hbaseHregionMajorcompaction");
        sb.append('=');
        sb.append(((this.hbaseHregionMajorcompaction == null)?"<null>":this.hbaseHregionMajorcompaction));
        sb.append(',');
        sb.append("hbaseHregionMajorcompactionJitter");
        sb.append('=');
        sb.append(((this.hbaseHregionMajorcompactionJitter == null)?"<null>":this.hbaseHregionMajorcompactionJitter));
        sb.append(',');
        sb.append("hbaseHregionMaxFilesize");
        sb.append('=');
        sb.append(((this.hbaseHregionMaxFilesize == null)?"<null>":this.hbaseHregionMaxFilesize));
        sb.append(',');
        sb.append("hbaseHregionMemstoreBlockMultiplier");
        sb.append('=');
        sb.append(((this.hbaseHregionMemstoreBlockMultiplier == null)?"<null>":this.hbaseHregionMemstoreBlockMultiplier));
        sb.append(',');
        sb.append("hbaseHregionMemstoreFlushSize");
        sb.append('=');
        sb.append(((this.hbaseHregionMemstoreFlushSize == null)?"<null>":this.hbaseHregionMemstoreFlushSize));
        sb.append(',');
        sb.append("hbaseHregionMemstoreMslabEnabled");
        sb.append('=');
        sb.append(((this.hbaseHregionMemstoreMslabEnabled == null)?"<null>":this.hbaseHregionMemstoreMslabEnabled));
        sb.append(',');
        sb.append("hbaseHstoreBlockingStoreFiles");
        sb.append('=');
        sb.append(((this.hbaseHstoreBlockingStoreFiles == null)?"<null>":this.hbaseHstoreBlockingStoreFiles));
        sb.append(',');
        sb.append("hbaseHstoreCompactionMax");
        sb.append('=');
        sb.append(((this.hbaseHstoreCompactionMax == null)?"<null>":this.hbaseHstoreCompactionMax));
        sb.append(',');
        sb.append("hbaseHstoreCompactionThreshold");
        sb.append('=');
        sb.append(((this.hbaseHstoreCompactionThreshold == null)?"<null>":this.hbaseHstoreCompactionThreshold));
        sb.append(',');
        sb.append("hbaseLocalDir");
        sb.append('=');
        sb.append(((this.hbaseLocalDir == null)?"<null>":this.hbaseLocalDir));
        sb.append(',');
        sb.append("hbaseMasterInfoBindAddress");
        sb.append('=');
        sb.append(((this.hbaseMasterInfoBindAddress == null)?"<null>":this.hbaseMasterInfoBindAddress));
        sb.append(',');
        sb.append("hbaseMasterInfoPort");
        sb.append('=');
        sb.append(((this.hbaseMasterInfoPort == null)?"<null>":this.hbaseMasterInfoPort));
        sb.append(',');
        sb.append("hbaseMasterNamespaceInitTimeout");
        sb.append('=');
        sb.append(((this.hbaseMasterNamespaceInitTimeout == null)?"<null>":this.hbaseMasterNamespaceInitTimeout));
        sb.append(',');
        sb.append("hbaseMasterPort");
        sb.append('=');
        sb.append(((this.hbaseMasterPort == null)?"<null>":this.hbaseMasterPort));
        sb.append(',');
        sb.append("hbaseMasterUiReadonly");
        sb.append('=');
        sb.append(((this.hbaseMasterUiReadonly == null)?"<null>":this.hbaseMasterUiReadonly));
        sb.append(',');
        sb.append("hbaseMasterWaitOnRegionserversTimeout");
        sb.append('=');
        sb.append(((this.hbaseMasterWaitOnRegionserversTimeout == null)?"<null>":this.hbaseMasterWaitOnRegionserversTimeout));
        sb.append(',');
        sb.append("hbaseRegionserverExecutorOpenregionThreads");
        sb.append('=');
        sb.append(((this.hbaseRegionserverExecutorOpenregionThreads == null)?"<null>":this.hbaseRegionserverExecutorOpenregionThreads));
        sb.append(',');
        sb.append("hbaseRegionserverGlobalMemstoreSize");
        sb.append('=');
        sb.append(((this.hbaseRegionserverGlobalMemstoreSize == null)?"<null>":this.hbaseRegionserverGlobalMemstoreSize));
        sb.append(',');
        sb.append("hbaseRegionserverHandlerCount");
        sb.append('=');
        sb.append(((this.hbaseRegionserverHandlerCount == null)?"<null>":this.hbaseRegionserverHandlerCount));
        sb.append(',');
        sb.append("hbaseRegionserverInfoPort");
        sb.append('=');
        sb.append(((this.hbaseRegionserverInfoPort == null)?"<null>":this.hbaseRegionserverInfoPort));
        sb.append(',');
        sb.append("hbaseRegionserverPort");
        sb.append('=');
        sb.append(((this.hbaseRegionserverPort == null)?"<null>":this.hbaseRegionserverPort));
        sb.append(',');
        sb.append("hbaseRootdir");
        sb.append('=');
        sb.append(((this.hbaseRootdir == null)?"<null>":this.hbaseRootdir));
        sb.append(',');
        sb.append("hbaseRpcProtection");
        sb.append('=');
        sb.append(((this.hbaseRpcProtection == null)?"<null>":this.hbaseRpcProtection));
        sb.append(',');
        sb.append("hbaseRpcTimeout");
        sb.append('=');
        sb.append(((this.hbaseRpcTimeout == null)?"<null>":this.hbaseRpcTimeout));
        sb.append(',');
        sb.append("hbaseSecurityAuthentication");
        sb.append('=');
        sb.append(((this.hbaseSecurityAuthentication == null)?"<null>":this.hbaseSecurityAuthentication));
        sb.append(',');
        sb.append("hbaseSecurityAuthorization");
        sb.append('=');
        sb.append(((this.hbaseSecurityAuthorization == null)?"<null>":this.hbaseSecurityAuthorization));
        sb.append(',');
        sb.append("hbaseSuperuser");
        sb.append('=');
        sb.append(((this.hbaseSuperuser == null)?"<null>":this.hbaseSuperuser));
        sb.append(',');
        sb.append("hbaseTmpDir");
        sb.append('=');
        sb.append(((this.hbaseTmpDir == null)?"<null>":this.hbaseTmpDir));
        sb.append(',');
        sb.append("hbaseZookeeperPropertyClientPort");
        sb.append('=');
        sb.append(((this.hbaseZookeeperPropertyClientPort == null)?"<null>":this.hbaseZookeeperPropertyClientPort));
        sb.append(',');
        sb.append("hbaseZookeeperQuorum");
        sb.append('=');
        sb.append(((this.hbaseZookeeperQuorum == null)?"<null>":this.hbaseZookeeperQuorum));
        sb.append(',');
        sb.append("hbaseZookeeperUseMulti");
        sb.append('=');
        sb.append(((this.hbaseZookeeperUseMulti == null)?"<null>":this.hbaseZookeeperUseMulti));
        sb.append(',');
        sb.append("hfileBlockCacheSize");
        sb.append('=');
        sb.append(((this.hfileBlockCacheSize == null)?"<null>":this.hfileBlockCacheSize));
        sb.append(',');
        sb.append("zookeeperRecoveryRetry");
        sb.append('=');
        sb.append(((this.zookeeperRecoveryRetry == null)?"<null>":this.zookeeperRecoveryRetry));
        sb.append(',');
        sb.append("zookeeperSessionTimeout");
        sb.append('=');
        sb.append(((this.zookeeperSessionTimeout == null)?"<null>":this.zookeeperSessionTimeout));
        sb.append(',');
        sb.append("zookeeperZnodeParent");
        sb.append('=');
        sb.append(((this.zookeeperZnodeParent == null)?"<null>":this.zookeeperZnodeParent));
        sb.append(',');
        sb.append("yarnRmSummaryLogMaxBackupSize");
        sb.append('=');
        sb.append(((this.yarnRmSummaryLogMaxBackupSize == null)?"<null>":this.yarnRmSummaryLogMaxBackupSize));
        sb.append(',');
        sb.append("yarnRmSummaryLogNumberOfBackupFiles");
        sb.append('=');
        sb.append(((this.yarnRmSummaryLogNumberOfBackupFiles == null)?"<null>":this.yarnRmSummaryLogNumberOfBackupFiles));
        sb.append(',');
        sb.append("yarnSchedulerCapacityDefaultMinimumUserLimitPercent");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent == null)?"<null>":this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent));
        sb.append(',');
        sb.append("yarnSchedulerCapacityMaximumAmResourcePercent");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityMaximumAmResourcePercent == null)?"<null>":this.yarnSchedulerCapacityMaximumAmResourcePercent));
        sb.append(',');
        sb.append("yarnSchedulerCapacityMaximumApplications");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityMaximumApplications == null)?"<null>":this.yarnSchedulerCapacityMaximumApplications));
        sb.append(',');
        sb.append("yarnSchedulerCapacityNodeLocalityDelay");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityNodeLocalityDelay == null)?"<null>":this.yarnSchedulerCapacityNodeLocalityDelay));
        sb.append(',');
        sb.append("yarnSchedulerCapacityResourceCalculator");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityResourceCalculator == null)?"<null>":this.yarnSchedulerCapacityResourceCalculator));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootAccessibleNodeLabels");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootAccessibleNodeLabels == null)?"<null>":this.yarnSchedulerCapacityRootAccessibleNodeLabels));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootAclAdministerQueue");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootAclAdministerQueue == null)?"<null>":this.yarnSchedulerCapacityRootAclAdministerQueue));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootAclSubmitApplications");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootAclSubmitApplications == null)?"<null>":this.yarnSchedulerCapacityRootAclSubmitApplications));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootCapacity");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootCapacity == null)?"<null>":this.yarnSchedulerCapacityRootCapacity));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootDefaultAclAdministerJobs");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootDefaultAclAdministerJobs == null)?"<null>":this.yarnSchedulerCapacityRootDefaultAclAdministerJobs));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootDefaultAclSubmitApplications");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootDefaultAclSubmitApplications == null)?"<null>":this.yarnSchedulerCapacityRootDefaultAclSubmitApplications));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootDefaultCapacity");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootDefaultCapacity == null)?"<null>":this.yarnSchedulerCapacityRootDefaultCapacity));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootDefaultMaximumCapacity");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootDefaultMaximumCapacity == null)?"<null>":this.yarnSchedulerCapacityRootDefaultMaximumCapacity));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootDefaultState");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootDefaultState == null)?"<null>":this.yarnSchedulerCapacityRootDefaultState));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootDefaultUserLimitFactor");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootDefaultUserLimitFactor == null)?"<null>":this.yarnSchedulerCapacityRootDefaultUserLimitFactor));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootQueues");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootQueues == null)?"<null>":this.yarnSchedulerCapacityRootQueues));
        sb.append(',');
        sb.append("yarnSchedulerCapacityScheduleAsynchronouslyEnable");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityScheduleAsynchronouslyEnable == null)?"<null>":this.yarnSchedulerCapacityScheduleAsynchronouslyEnable));
        sb.append(',');
        sb.append("yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads == null)?"<null>":this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads));
        sb.append(',');
        sb.append("yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs == null)?"<null>":this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs));
        sb.append(',');
        sb.append("hadoopHttpCrossOriginAllowedOrigins");
        sb.append('=');
        sb.append(((this.hadoopHttpCrossOriginAllowedOrigins == null)?"<null>":this.hadoopHttpCrossOriginAllowedOrigins));
        sb.append(',');
        sb.append("hadoopRegistryDnsBindAddress");
        sb.append('=');
        sb.append(((this.hadoopRegistryDnsBindAddress == null)?"<null>":this.hadoopRegistryDnsBindAddress));
        sb.append(',');
        sb.append("hadoopRegistryDnsBindPort");
        sb.append('=');
        sb.append(((this.hadoopRegistryDnsBindPort == null)?"<null>":this.hadoopRegistryDnsBindPort));
        sb.append(',');
        sb.append("hadoopRegistryDnsDomainName");
        sb.append('=');
        sb.append(((this.hadoopRegistryDnsDomainName == null)?"<null>":this.hadoopRegistryDnsDomainName));
        sb.append(',');
        sb.append("hadoopRegistryDnsEnabled");
        sb.append('=');
        sb.append(((this.hadoopRegistryDnsEnabled == null)?"<null>":this.hadoopRegistryDnsEnabled));
        sb.append(',');
        sb.append("hadoopRegistryDnsZoneMask");
        sb.append('=');
        sb.append(((this.hadoopRegistryDnsZoneMask == null)?"<null>":this.hadoopRegistryDnsZoneMask));
        sb.append(',');
        sb.append("hadoopRegistryDnsZoneSubnet");
        sb.append('=');
        sb.append(((this.hadoopRegistryDnsZoneSubnet == null)?"<null>":this.hadoopRegistryDnsZoneSubnet));
        sb.append(',');
        sb.append("hadoopRegistryZkQuorum");
        sb.append('=');
        sb.append(((this.hadoopRegistryZkQuorum == null)?"<null>":this.hadoopRegistryZkQuorum));
        sb.append(',');
        sb.append("manageIncludeFiles");
        sb.append('=');
        sb.append(((this.manageIncludeFiles == null)?"<null>":this.manageIncludeFiles));
        sb.append(',');
        sb.append("yarnAclEnable");
        sb.append('=');
        sb.append(((this.yarnAclEnable == null)?"<null>":this.yarnAclEnable));
        sb.append(',');
        sb.append("yarnAdminAcl");
        sb.append('=');
        sb.append(((this.yarnAdminAcl == null)?"<null>":this.yarnAdminAcl));
        sb.append(',');
        sb.append("yarnApplicationClasspath");
        sb.append('=');
        sb.append(((this.yarnApplicationClasspath == null)?"<null>":this.yarnApplicationClasspath));
        sb.append(',');
        sb.append("yarnClientNodemanagerConnectMaxWaitMs");
        sb.append('=');
        sb.append(((this.yarnClientNodemanagerConnectMaxWaitMs == null)?"<null>":this.yarnClientNodemanagerConnectMaxWaitMs));
        sb.append(',');
        sb.append("yarnClientNodemanagerConnectRetryIntervalMs");
        sb.append('=');
        sb.append(((this.yarnClientNodemanagerConnectRetryIntervalMs == null)?"<null>":this.yarnClientNodemanagerConnectRetryIntervalMs));
        sb.append(',');
        sb.append("yarnHttpPolicy");
        sb.append('=');
        sb.append(((this.yarnHttpPolicy == null)?"<null>":this.yarnHttpPolicy));
        sb.append(',');
        sb.append("yarnLogAggregationEnable");
        sb.append('=');
        sb.append(((this.yarnLogAggregationEnable == null)?"<null>":this.yarnLogAggregationEnable));
        sb.append(',');
        sb.append("yarnLogAggregationRetainSeconds");
        sb.append('=');
        sb.append(((this.yarnLogAggregationRetainSeconds == null)?"<null>":this.yarnLogAggregationRetainSeconds));
        sb.append(',');
        sb.append("yarnLogServerUrl");
        sb.append('=');
        sb.append(((this.yarnLogServerUrl == null)?"<null>":this.yarnLogServerUrl));
        sb.append(',');
        sb.append("yarnLogServerWebServiceUrl");
        sb.append('=');
        sb.append(((this.yarnLogServerWebServiceUrl == null)?"<null>":this.yarnLogServerWebServiceUrl));
        sb.append(',');
        sb.append("yarnNodeLabelsEnabled");
        sb.append('=');
        sb.append(((this.yarnNodeLabelsEnabled == null)?"<null>":this.yarnNodeLabelsEnabled));
        sb.append(',');
        sb.append("yarnNodeLabelsFsStoreRetryPolicySpec");
        sb.append('=');
        sb.append(((this.yarnNodeLabelsFsStoreRetryPolicySpec == null)?"<null>":this.yarnNodeLabelsFsStoreRetryPolicySpec));
        sb.append(',');
        sb.append("yarnNodeLabelsFsStoreRootDir");
        sb.append('=');
        sb.append(((this.yarnNodeLabelsFsStoreRootDir == null)?"<null>":this.yarnNodeLabelsFsStoreRootDir));
        sb.append(',');
        sb.append("yarnNodemanagerAddress");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAddress == null)?"<null>":this.yarnNodemanagerAddress));
        sb.append(',');
        sb.append("yarnNodemanagerAdminEnv");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAdminEnv == null)?"<null>":this.yarnNodemanagerAdminEnv));
        sb.append(',');
        sb.append("yarnNodemanagerAuxServices");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAuxServices == null)?"<null>":this.yarnNodemanagerAuxServices));
        sb.append(',');
        sb.append("yarnNodemanagerAuxServicesMapreduceShuffleClass");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAuxServicesMapreduceShuffleClass == null)?"<null>":this.yarnNodemanagerAuxServicesMapreduceShuffleClass));
        sb.append(',');
        sb.append("yarnNodemanagerAuxServicesSpark2ShuffleClass");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAuxServicesSpark2ShuffleClass == null)?"<null>":this.yarnNodemanagerAuxServicesSpark2ShuffleClass));
        sb.append(',');
        sb.append("yarnNodemanagerAuxServicesSpark2ShuffleClasspath");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath == null)?"<null>":this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath));
        sb.append(',');
        sb.append("yarnNodemanagerAuxServicesSparkShuffleClass");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAuxServicesSparkShuffleClass == null)?"<null>":this.yarnNodemanagerAuxServicesSparkShuffleClass));
        sb.append(',');
        sb.append("yarnNodemanagerAuxServicesSparkShuffleClasspath");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAuxServicesSparkShuffleClasspath == null)?"<null>":this.yarnNodemanagerAuxServicesSparkShuffleClasspath));
        sb.append(',');
        sb.append("yarnNodemanagerAuxServicesTimelineCollectorClass");
        sb.append('=');
        sb.append(((this.yarnNodemanagerAuxServicesTimelineCollectorClass == null)?"<null>":this.yarnNodemanagerAuxServicesTimelineCollectorClass));
        sb.append(',');
        sb.append("yarnNodemanagerBindHost");
        sb.append('=');
        sb.append(((this.yarnNodemanagerBindHost == null)?"<null>":this.yarnNodemanagerBindHost));
        sb.append(',');
        sb.append("yarnNodemanagerContainerExecutorClass");
        sb.append('=');
        sb.append(((this.yarnNodemanagerContainerExecutorClass == null)?"<null>":this.yarnNodemanagerContainerExecutorClass));
        sb.append(',');
        sb.append("yarnNodemanagerContainerMetricsUnregisterDelayMs");
        sb.append('=');
        sb.append(((this.yarnNodemanagerContainerMetricsUnregisterDelayMs == null)?"<null>":this.yarnNodemanagerContainerMetricsUnregisterDelayMs));
        sb.append(',');
        sb.append("yarnNodemanagerContainerMonitorIntervalMs");
        sb.append('=');
        sb.append(((this.yarnNodemanagerContainerMonitorIntervalMs == null)?"<null>":this.yarnNodemanagerContainerMonitorIntervalMs));
        sb.append(',');
        sb.append("yarnNodemanagerDeleteDebugDelaySec");
        sb.append('=');
        sb.append(((this.yarnNodemanagerDeleteDebugDelaySec == null)?"<null>":this.yarnNodemanagerDeleteDebugDelaySec));
        sb.append(',');
        sb.append("yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage");
        sb.append('=');
        sb.append(((this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage == null)?"<null>":this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage));
        sb.append(',');
        sb.append("yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb");
        sb.append('=');
        sb.append(((this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb == null)?"<null>":this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb));
        sb.append(',');
        sb.append("yarnNodemanagerDiskHealthCheckerMinHealthyDisks");
        sb.append('=');
        sb.append(((this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks == null)?"<null>":this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks));
        sb.append(',');
        sb.append("yarnNodemanagerHealthCheckerIntervalMs");
        sb.append('=');
        sb.append(((this.yarnNodemanagerHealthCheckerIntervalMs == null)?"<null>":this.yarnNodemanagerHealthCheckerIntervalMs));
        sb.append(',');
        sb.append("yarnNodemanagerHealthCheckerScriptTimeoutMs");
        sb.append('=');
        sb.append(((this.yarnNodemanagerHealthCheckerScriptTimeoutMs == null)?"<null>":this.yarnNodemanagerHealthCheckerScriptTimeoutMs));
        sb.append(',');
        sb.append("yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage == null)?"<null>":this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage));
        sb.append(',');
        sb.append("yarnNodemanagerLinuxContainerExecutorGroup");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLinuxContainerExecutorGroup == null)?"<null>":this.yarnNodemanagerLinuxContainerExecutorGroup));
        sb.append(',');
        sb.append("yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers == null)?"<null>":this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers));
        sb.append(',');
        sb.append("yarnNodemanagerLocalDirs");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLocalDirs == null)?"<null>":this.yarnNodemanagerLocalDirs));
        sb.append(',');
        sb.append("yarnNodemanagerLogAggregationCompressionType");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLogAggregationCompressionType == null)?"<null>":this.yarnNodemanagerLogAggregationCompressionType));
        sb.append(',');
        sb.append("yarnNodemanagerLogAggregationDebugEnabled");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLogAggregationDebugEnabled == null)?"<null>":this.yarnNodemanagerLogAggregationDebugEnabled));
        sb.append(',');
        sb.append("yarnNodemanagerLogAggregationNumLogFilesPerApp");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLogAggregationNumLogFilesPerApp == null)?"<null>":this.yarnNodemanagerLogAggregationNumLogFilesPerApp));
        sb.append(',');
        sb.append("yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds == null)?"<null>":this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds));
        sb.append(',');
        sb.append("yarnNodemanagerLogDirs");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLogDirs == null)?"<null>":this.yarnNodemanagerLogDirs));
        sb.append(',');
        sb.append("yarnNodemanagerLogRetainSeconds");
        sb.append('=');
        sb.append(((this.yarnNodemanagerLogRetainSeconds == null)?"<null>":this.yarnNodemanagerLogRetainSeconds));
        sb.append(',');
        sb.append("yarnNodemanagerRecoveryDir");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRecoveryDir == null)?"<null>":this.yarnNodemanagerRecoveryDir));
        sb.append(',');
        sb.append("yarnNodemanagerRecoveryEnabled");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRecoveryEnabled == null)?"<null>":this.yarnNodemanagerRecoveryEnabled));
        sb.append(',');
        sb.append("yarnNodemanagerRecoverySupervised");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRecoverySupervised == null)?"<null>":this.yarnNodemanagerRecoverySupervised));
        sb.append(',');
        sb.append("yarnNodemanagerRemoteAppLogDir");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRemoteAppLogDir == null)?"<null>":this.yarnNodemanagerRemoteAppLogDir));
        sb.append(',');
        sb.append("yarnNodemanagerRemoteAppLogDirSuffix");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRemoteAppLogDirSuffix == null)?"<null>":this.yarnNodemanagerRemoteAppLogDirSuffix));
        sb.append(',');
        sb.append("yarnNodemanagerResourcePlugins");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourcePlugins == null)?"<null>":this.yarnNodemanagerResourcePlugins));
        sb.append(',');
        sb.append("yarnNodemanagerResourcePluginsGpuAllowedGpuDevices");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices == null)?"<null>":this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices));
        sb.append(',');
        sb.append("yarnNodemanagerResourcePluginsGpuDockerPlugin");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourcePluginsGpuDockerPlugin == null)?"<null>":this.yarnNodemanagerResourcePluginsGpuDockerPlugin));
        sb.append(',');
        sb.append("yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint == null)?"<null>":this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint));
        sb.append(',');
        sb.append("yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables == null)?"<null>":this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables));
        sb.append(',');
        sb.append("yarnNodemanagerResourceCpuVcores");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourceCpuVcores == null)?"<null>":this.yarnNodemanagerResourceCpuVcores));
        sb.append(',');
        sb.append("yarnNodemanagerResourceMemoryMb");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourceMemoryMb == null)?"<null>":this.yarnNodemanagerResourceMemoryMb));
        sb.append(',');
        sb.append("yarnNodemanagerResourcePercentagePhysicalCpuLimit");
        sb.append('=');
        sb.append(((this.yarnNodemanagerResourcePercentagePhysicalCpuLimit == null)?"<null>":this.yarnNodemanagerResourcePercentagePhysicalCpuLimit));
        sb.append(',');
        sb.append("yarnNodemanagerRuntimeLinuxAllowedRuntimes");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRuntimeLinuxAllowedRuntimes == null)?"<null>":this.yarnNodemanagerRuntimeLinuxAllowedRuntimes));
        sb.append(',');
        sb.append("yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks == null)?"<null>":this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks));
        sb.append(',');
        sb.append("yarnNodemanagerRuntimeLinuxDockerCapabilities");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRuntimeLinuxDockerCapabilities == null)?"<null>":this.yarnNodemanagerRuntimeLinuxDockerCapabilities));
        sb.append(',');
        sb.append("yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork == null)?"<null>":this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork));
        sb.append(',');
        sb.append("yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl == null)?"<null>":this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl));
        sb.append(',');
        sb.append("yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed");
        sb.append('=');
        sb.append(((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed == null)?"<null>":this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed));
        sb.append(',');
        sb.append("yarnNodemanagerVmemCheckEnabled");
        sb.append('=');
        sb.append(((this.yarnNodemanagerVmemCheckEnabled == null)?"<null>":this.yarnNodemanagerVmemCheckEnabled));
        sb.append(',');
        sb.append("yarnNodemanagerVmemPmemRatio");
        sb.append('=');
        sb.append(((this.yarnNodemanagerVmemPmemRatio == null)?"<null>":this.yarnNodemanagerVmemPmemRatio));
        sb.append(',');
        sb.append("yarnNodemanagerWebappCrossOriginEnabled");
        sb.append('=');
        sb.append(((this.yarnNodemanagerWebappCrossOriginEnabled == null)?"<null>":this.yarnNodemanagerWebappCrossOriginEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerAddress");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerAddress == null)?"<null>":this.yarnResourcemanagerAddress));
        sb.append(',');
        sb.append("yarnResourcemanagerAdminAddress");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerAdminAddress == null)?"<null>":this.yarnResourcemanagerAdminAddress));
        sb.append(',');
        sb.append("yarnResourcemanagerAmMaxAttempts");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerAmMaxAttempts == null)?"<null>":this.yarnResourcemanagerAmMaxAttempts));
        sb.append(',');
        sb.append("yarnResourcemanagerBindHost");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerBindHost == null)?"<null>":this.yarnResourcemanagerBindHost));
        sb.append(',');
        sb.append("yarnResourcemanagerConnectMaxWaitMs");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerConnectMaxWaitMs == null)?"<null>":this.yarnResourcemanagerConnectMaxWaitMs));
        sb.append(',');
        sb.append("yarnResourcemanagerConnectRetryIntervalMs");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerConnectRetryIntervalMs == null)?"<null>":this.yarnResourcemanagerConnectRetryIntervalMs));
        sb.append(',');
        sb.append("yarnResourcemanagerDisplayPerUserApps");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerDisplayPerUserApps == null)?"<null>":this.yarnResourcemanagerDisplayPerUserApps));
        sb.append(',');
        sb.append("yarnResourcemanagerFsStateStoreRetryPolicySpec");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerFsStateStoreRetryPolicySpec == null)?"<null>":this.yarnResourcemanagerFsStateStoreRetryPolicySpec));
        sb.append(',');
        sb.append("yarnResourcemanagerFsStateStoreUri");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerFsStateStoreUri == null)?"<null>":this.yarnResourcemanagerFsStateStoreUri));
        sb.append(',');
        sb.append("yarnResourcemanagerHaEnabled");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerHaEnabled == null)?"<null>":this.yarnResourcemanagerHaEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerHostname");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerHostname == null)?"<null>":this.yarnResourcemanagerHostname));
        sb.append(',');
        sb.append("yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled == null)?"<null>":this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval == null)?"<null>":this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval));
        sb.append(',');
        sb.append("yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor == null)?"<null>":this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor));
        sb.append(',');
        sb.append("yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound == null)?"<null>":this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound));
        sb.append(',');
        sb.append("yarnResourcemanagerNodesExcludePath");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerNodesExcludePath == null)?"<null>":this.yarnResourcemanagerNodesExcludePath));
        sb.append(',');
        sb.append("yarnResourcemanagerPlacementConstraintsHandler");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerPlacementConstraintsHandler == null)?"<null>":this.yarnResourcemanagerPlacementConstraintsHandler));
        sb.append(',');
        sb.append("yarnResourcemanagerRecoveryEnabled");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerRecoveryEnabled == null)?"<null>":this.yarnResourcemanagerRecoveryEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerResourceTrackerAddress");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerResourceTrackerAddress == null)?"<null>":this.yarnResourcemanagerResourceTrackerAddress));
        sb.append(',');
        sb.append("yarnResourcemanagerSchedulerAddress");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerSchedulerAddress == null)?"<null>":this.yarnResourcemanagerSchedulerAddress));
        sb.append(',');
        sb.append("yarnResourcemanagerSchedulerClass");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerSchedulerClass == null)?"<null>":this.yarnResourcemanagerSchedulerClass));
        sb.append(',');
        sb.append("yarnResourcemanagerSchedulerMonitorEnable");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerSchedulerMonitorEnable == null)?"<null>":this.yarnResourcemanagerSchedulerMonitorEnable));
        sb.append(',');
        sb.append("yarnResourcemanagerStateStoreMaxCompletedApplications");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerStateStoreMaxCompletedApplications == null)?"<null>":this.yarnResourcemanagerStateStoreMaxCompletedApplications));
        sb.append(',');
        sb.append("yarnResourcemanagerStoreClass");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerStoreClass == null)?"<null>":this.yarnResourcemanagerStoreClass));
        sb.append(',');
        sb.append("yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize == null)?"<null>":this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize));
        sb.append(',');
        sb.append("yarnResourcemanagerSystemMetricsPublisherEnabled");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerSystemMetricsPublisherEnabled == null)?"<null>":this.yarnResourcemanagerSystemMetricsPublisherEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerWebappAddress");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerWebappAddress == null)?"<null>":this.yarnResourcemanagerWebappAddress));
        sb.append(',');
        sb.append("yarnResourcemanagerWebappCrossOriginEnabled");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerWebappCrossOriginEnabled == null)?"<null>":this.yarnResourcemanagerWebappCrossOriginEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled == null)?"<null>":this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerWebappHttpsAddress");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerWebappHttpsAddress == null)?"<null>":this.yarnResourcemanagerWebappHttpsAddress));
        sb.append(',');
        sb.append("yarnResourcemanagerWorkPreservingRecoveryEnabled");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerWorkPreservingRecoveryEnabled == null)?"<null>":this.yarnResourcemanagerWorkPreservingRecoveryEnabled));
        sb.append(',');
        sb.append("yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs == null)?"<null>":this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs));
        sb.append(',');
        sb.append("yarnResourcemanagerZkAcl");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerZkAcl == null)?"<null>":this.yarnResourcemanagerZkAcl));
        sb.append(',');
        sb.append("yarnResourcemanagerZkAddress");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerZkAddress == null)?"<null>":this.yarnResourcemanagerZkAddress));
        sb.append(',');
        sb.append("yarnResourcemanagerZkNumRetries");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerZkNumRetries == null)?"<null>":this.yarnResourcemanagerZkNumRetries));
        sb.append(',');
        sb.append("yarnResourcemanagerZkRetryIntervalMs");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerZkRetryIntervalMs == null)?"<null>":this.yarnResourcemanagerZkRetryIntervalMs));
        sb.append(',');
        sb.append("yarnResourcemanagerZkStateStoreParentPath");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerZkStateStoreParentPath == null)?"<null>":this.yarnResourcemanagerZkStateStoreParentPath));
        sb.append(',');
        sb.append("yarnResourcemanagerZkTimeoutMs");
        sb.append('=');
        sb.append(((this.yarnResourcemanagerZkTimeoutMs == null)?"<null>":this.yarnResourcemanagerZkTimeoutMs));
        sb.append(',');
        sb.append("yarnRmSystemMetricspublisherEmitContainerEvents");
        sb.append('=');
        sb.append(((this.yarnRmSystemMetricspublisherEmitContainerEvents == null)?"<null>":this.yarnRmSystemMetricspublisherEmitContainerEvents));
        sb.append(',');
        sb.append("yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled == null)?"<null>":this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled));
        sb.append(',');
        sb.append("yarnSchedulerMaximumAllocationMb");
        sb.append('=');
        sb.append(((this.yarnSchedulerMaximumAllocationMb == null)?"<null>":this.yarnSchedulerMaximumAllocationMb));
        sb.append(',');
        sb.append("yarnSchedulerMaximumAllocationVcores");
        sb.append('=');
        sb.append(((this.yarnSchedulerMaximumAllocationVcores == null)?"<null>":this.yarnSchedulerMaximumAllocationVcores));
        sb.append(',');
        sb.append("yarnSchedulerMinimumAllocationMb");
        sb.append('=');
        sb.append(((this.yarnSchedulerMinimumAllocationMb == null)?"<null>":this.yarnSchedulerMinimumAllocationMb));
        sb.append(',');
        sb.append("yarnSchedulerMinimumAllocationVcores");
        sb.append('=');
        sb.append(((this.yarnSchedulerMinimumAllocationVcores == null)?"<null>":this.yarnSchedulerMinimumAllocationVcores));
        sb.append(',');
        sb.append("yarnServiceFrameworkPath");
        sb.append('=');
        sb.append(((this.yarnServiceFrameworkPath == null)?"<null>":this.yarnServiceFrameworkPath));
        sb.append(',');
        sb.append("yarnServiceSystemServiceDir");
        sb.append('=');
        sb.append(((this.yarnServiceSystemServiceDir == null)?"<null>":this.yarnServiceSystemServiceDir));
        sb.append(',');
        sb.append("yarnSystemMetricspublisherEnabled");
        sb.append('=');
        sb.append(((this.yarnSystemMetricspublisherEnabled == null)?"<null>":this.yarnSystemMetricspublisherEnabled));
        sb.append(',');
        sb.append("yarnTimelineServiceAddress");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceAddress == null)?"<null>":this.yarnTimelineServiceAddress));
        sb.append(',');
        sb.append("yarnTimelineServiceBindHost");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceBindHost == null)?"<null>":this.yarnTimelineServiceBindHost));
        sb.append(',');
        sb.append("yarnTimelineServiceClientMaxRetries");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceClientMaxRetries == null)?"<null>":this.yarnTimelineServiceClientMaxRetries));
        sb.append(',');
        sb.append("yarnTimelineServiceClientRetryIntervalMs");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceClientRetryIntervalMs == null)?"<null>":this.yarnTimelineServiceClientRetryIntervalMs));
        sb.append(',');
        sb.append("yarnTimelineServiceEnabled");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEnabled == null)?"<null>":this.yarnTimelineServiceEnabled));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreActiveDir");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreActiveDir == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreActiveDir));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreAppCacheSize");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreDoneDir");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreDoneDir == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreDoneDir));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreRetainSeconds");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds));
        sb.append(',');
        sb.append("yarnTimelineServiceEntityGroupFsStoreSummaryStore");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceEntityGroupFsStoreSummaryStore == null)?"<null>":this.yarnTimelineServiceEntityGroupFsStoreSummaryStore));
        sb.append(',');
        sb.append("yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo == null)?"<null>":this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo));
        sb.append(',');
        sb.append("yarnTimelineServiceGenericApplicationHistoryStoreClass");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceGenericApplicationHistoryStoreClass == null)?"<null>":this.yarnTimelineServiceGenericApplicationHistoryStoreClass));
        sb.append(',');
        sb.append("yarnTimelineServiceHbaseSchemaPrefix");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHbaseSchemaPrefix == null)?"<null>":this.yarnTimelineServiceHbaseSchemaPrefix));
        sb.append(',');
        sb.append("yarnTimelineServiceHbaseConfigurationFile");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHbaseConfigurationFile == null)?"<null>":this.yarnTimelineServiceHbaseConfigurationFile));
        sb.append(',');
        sb.append("yarnTimelineServiceHbaseCoprocessorJarHdfsLocation");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation == null)?"<null>":this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation));
        sb.append(',');
        sb.append("yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed == null)?"<null>":this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed));
        sb.append(',');
        sb.append("yarnTimelineServiceHttpAuthenticationType");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHttpAuthenticationType == null)?"<null>":this.yarnTimelineServiceHttpAuthenticationType));
        sb.append(',');
        sb.append("yarnTimelineServiceHttpCrossOriginEnabled");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHttpCrossOriginEnabled == null)?"<null>":this.yarnTimelineServiceHttpCrossOriginEnabled));
        sb.append(',');
        sb.append("yarnTimelineServiceLeveldbStateStorePath");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceLeveldbStateStorePath == null)?"<null>":this.yarnTimelineServiceLeveldbStateStorePath));
        sb.append(',');
        sb.append("yarnTimelineServiceLeveldbTimelineStorePath");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceLeveldbTimelineStorePath == null)?"<null>":this.yarnTimelineServiceLeveldbTimelineStorePath));
        sb.append(',');
        sb.append("yarnTimelineServiceLeveldbTimelineStoreReadCacheSize");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize == null)?"<null>":this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize));
        sb.append(',');
        sb.append("yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize == null)?"<null>":this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize));
        sb.append(',');
        sb.append("yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize == null)?"<null>":this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize));
        sb.append(',');
        sb.append("yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs == null)?"<null>":this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs));
        sb.append(',');
        sb.append("yarnTimelineServiceReaderWebappAddress");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceReaderWebappAddress == null)?"<null>":this.yarnTimelineServiceReaderWebappAddress));
        sb.append(',');
        sb.append("yarnTimelineServiceReaderWebappHttpsAddress");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceReaderWebappHttpsAddress == null)?"<null>":this.yarnTimelineServiceReaderWebappHttpsAddress));
        sb.append(',');
        sb.append("yarnTimelineServiceRecoveryEnabled");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceRecoveryEnabled == null)?"<null>":this.yarnTimelineServiceRecoveryEnabled));
        sb.append(',');
        sb.append("yarnTimelineServiceStateStoreClass");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceStateStoreClass == null)?"<null>":this.yarnTimelineServiceStateStoreClass));
        sb.append(',');
        sb.append("yarnTimelineServiceStoreClass");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceStoreClass == null)?"<null>":this.yarnTimelineServiceStoreClass));
        sb.append(',');
        sb.append("yarnTimelineServiceTtlEnable");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceTtlEnable == null)?"<null>":this.yarnTimelineServiceTtlEnable));
        sb.append(',');
        sb.append("yarnTimelineServiceTtlMs");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceTtlMs == null)?"<null>":this.yarnTimelineServiceTtlMs));
        sb.append(',');
        sb.append("yarnTimelineServiceVersion");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceVersion == null)?"<null>":this.yarnTimelineServiceVersion));
        sb.append(',');
        sb.append("yarnTimelineServiceVersions");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceVersions == null)?"<null>":this.yarnTimelineServiceVersions));
        sb.append(',');
        sb.append("yarnTimelineServiceWebappAddress");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceWebappAddress == null)?"<null>":this.yarnTimelineServiceWebappAddress));
        sb.append(',');
        sb.append("yarnTimelineServiceWebappHttpsAddress");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceWebappHttpsAddress == null)?"<null>":this.yarnTimelineServiceWebappHttpsAddress));
        sb.append(',');
        sb.append("yarnWebappApiServiceEnable");
        sb.append('=');
        sb.append(((this.yarnWebappApiServiceEnable == null)?"<null>":this.yarnWebappApiServiceEnable));
        sb.append(',');
        sb.append("yarnWebappUi2Enable");
        sb.append('=');
        sb.append(((this.yarnWebappUi2Enable == null)?"<null>":this.yarnWebappUi2Enable));
        sb.append(',');
        sb.append("yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups == null)?"<null>":this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups));
        sb.append(',');
        sb.append("yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts");
        sb.append('=');
        sb.append(((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts == null)?"<null>":this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootSparkCapacity");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootSparkCapacity == null)?"<null>":this.yarnSchedulerCapacityRootSparkCapacity));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootSparkMaximumCapacity");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootSparkMaximumCapacity == null)?"<null>":this.yarnSchedulerCapacityRootSparkMaximumCapacity));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootSparkState");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootSparkState == null)?"<null>":this.yarnSchedulerCapacityRootSparkState));
        sb.append(',');
        sb.append("yarnSchedulerCapacityRootSparkUserLimitFactor");
        sb.append('=');
        sb.append(((this.yarnSchedulerCapacityRootSparkUserLimitFactor == null)?"<null>":this.yarnSchedulerCapacityRootSparkUserLimitFactor));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.hbaseZookeeperQuorum == null)? 0 :this.hbaseZookeeperQuorum.hashCode()));
        result = ((result* 31)+((this.yarnHbaseClientCpu == null)? 0 :this.yarnHbaseClientCpu.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceReaderWebappHttpsAddress == null)? 0 :this.yarnTimelineServiceReaderWebappHttpsAddress.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceLeveldbTimelineStorePath == null)? 0 :this.yarnTimelineServiceLeveldbTimelineStorePath.hashCode()));
        result = ((result* 31)+((this.securityAdminProtocolAcl == null)? 0 :this.securityAdminProtocolAcl.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerWorkPreservingRecoveryEnabled == null)? 0 :this.yarnResourcemanagerWorkPreservingRecoveryEnabled.hashCode()));
        result = ((result* 31)+((this.yarnApplicationClasspath == null)? 0 :this.yarnApplicationClasspath.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint == null)? 0 :this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint.hashCode()));
        result = ((result* 31)+((this.hbaseSecurityLogMaxbackupindex == null)? 0 :this.hbaseSecurityLogMaxbackupindex.hashCode()));
        result = ((result* 31)+((this.hbaseHregionMajorcompaction == null)? 0 :this.hbaseHregionMajorcompaction.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceAddress == null)? 0 :this.yarnTimelineServiceAddress.hashCode()));
        result = ((result* 31)+((this.manageIncludeFiles == null)? 0 :this.manageIncludeFiles.hashCode()));
        result = ((result* 31)+((this.yarnHbaseRegionserverCpu == null)? 0 :this.yarnHbaseRegionserverCpu.hashCode()));
        result = ((result* 31)+((this.yarnHbaseRegionserverContainers == null)? 0 :this.yarnHbaseRegionserverContainers.hashCode()));
        result = ((result* 31)+((this.yarnUserNofileLimit == null)? 0 :this.yarnUserNofileLimit.hashCode()));
        result = ((result* 31)+((this.yarnHttpPolicy == null)? 0 :this.yarnHttpPolicy.hashCode()));
        result = ((result* 31)+((this.yarnCgroupsEnabled == null)? 0 :this.yarnCgroupsEnabled.hashCode()));
        result = ((result* 31)+((this.yarnServiceSystemServiceDir == null)? 0 :this.yarnServiceSystemServiceDir.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts == null)? 0 :this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts.hashCode()));
        result = ((result* 31)+((this.hbaseZookeeperPropertyClientPort == null)? 0 :this.hbaseZookeeperPropertyClientPort.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRuntimeLinuxAllowedRuntimes == null)? 0 :this.yarnNodemanagerRuntimeLinuxAllowedRuntimes.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl == null)? 0 :this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRemoteAppLogDirSuffix == null)? 0 :this.yarnNodemanagerRemoteAppLogDirSuffix.hashCode()));
        result = ((result* 31)+((this.yarnHbaseMasterCpu == null)? 0 :this.yarnHbaseMasterCpu.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize == null)? 0 :this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize.hashCode()));
        result = ((result* 31)+((this.yarnUser == null)? 0 :this.yarnUser.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage == null)? 0 :this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage.hashCode()));
        result = ((result* 31)+((this.hadoopRegistryDnsBindAddress == null)? 0 :this.hadoopRegistryDnsBindAddress.hashCode()));
        result = ((result* 31)+((this.hadoopHttpCrossOriginAllowedOrigins == null)? 0 :this.hadoopHttpCrossOriginAllowedOrigins.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAuxServicesSparkShuffleClass == null)? 0 :this.yarnNodemanagerAuxServicesSparkShuffleClass.hashCode()));
        result = ((result* 31)+((this.hbaseSecurityAuthentication == null)? 0 :this.hbaseSecurityAuthentication.hashCode()));
        result = ((result* 31)+((this.hbaseSecurityAuthorization == null)? 0 :this.hbaseSecurityAuthorization.hashCode()));
        result = ((result* 31)+((this.hbaseHstoreCompactionMax == null)? 0 :this.hbaseHstoreCompactionMax.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceLeveldbStateStorePath == null)? 0 :this.yarnTimelineServiceLeveldbStateStorePath.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootAclSubmitApplications == null)? 0 :this.yarnSchedulerCapacityRootAclSubmitApplications.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootQueues == null)? 0 :this.yarnSchedulerCapacityRootQueues.hashCode()));
        result = ((result* 31)+((this.yarnHbaseClientContainers == null)? 0 :this.yarnHbaseClientContainers.hashCode()));
        result = ((result* 31)+((this.hbaseClientRetriesNumber == null)? 0 :this.hbaseClientRetriesNumber.hashCode()));
        result = ((result* 31)+((this.hbaseMasterInfoBindAddress == null)? 0 :this.hbaseMasterInfoBindAddress.hashCode()));
        result = ((result* 31)+((this.hbaseRegionserverExecutorOpenregionThreads == null)? 0 :this.hbaseRegionserverExecutorOpenregionThreads.hashCode()));
        result = ((result* 31)+((this.hbaseRegionserverInfoPort == null)? 0 :this.hbaseRegionserverInfoPort.hashCode()));
        result = ((result* 31)+((this.hbaseRegionserverPort == null)? 0 :this.hbaseRegionserverPort.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation == null)? 0 :this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation.hashCode()));
        result = ((result* 31)+((this.yarnLogDirPrefix == null)? 0 :this.yarnLogDirPrefix.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerConnectRetryIntervalMs == null)? 0 :this.yarnResourcemanagerConnectRetryIntervalMs.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceWebappHttpsAddress == null)? 0 :this.yarnTimelineServiceWebappHttpsAddress.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerBindHost == null)? 0 :this.yarnResourcemanagerBindHost.hashCode()));
        result = ((result* 31)+((this.yarnNodeLabelsFsStoreRootDir == null)? 0 :this.yarnNodeLabelsFsStoreRootDir.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAuxServicesSparkShuffleClasspath == null)? 0 :this.yarnNodemanagerAuxServicesSparkShuffleClasspath.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHttpAuthenticationType == null)? 0 :this.yarnTimelineServiceHttpAuthenticationType.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootSparkState == null)? 0 :this.yarnSchedulerCapacityRootSparkState.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRecoverySupervised == null)? 0 :this.yarnNodemanagerRecoverySupervised.hashCode()));
        result = ((result* 31)+((this.yarnHierarchy == null)? 0 :this.yarnHierarchy.hashCode()));
        result = ((result* 31)+((this.hbaseLocalDir == null)? 0 :this.hbaseLocalDir.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled == null)? 0 :this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled.hashCode()));
        result = ((result* 31)+((this.yarnNodeLabelsFsStoreRetryPolicySpec == null)? 0 :this.yarnNodeLabelsFsStoreRetryPolicySpec.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerWebappCrossOriginEnabled == null)? 0 :this.yarnResourcemanagerWebappCrossOriginEnabled.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootCapacity == null)? 0 :this.yarnSchedulerCapacityRootCapacity.hashCode()));
        result = ((result* 31)+((this.hbaseHregionMaxFilesize == null)? 0 :this.hbaseHregionMaxFilesize.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads == null)? 0 :this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads.hashCode()));
        result = ((result* 31)+((this.resourcemanagerHeapsize == null)? 0 :this.resourcemanagerHeapsize.hashCode()));
        result = ((result* 31)+((this.hbaseHregionMemstoreMslabEnabled == null)? 0 :this.hbaseHregionMemstoreMslabEnabled.hashCode()));
        result = ((result* 31)+((this.hbaseHstoreBlockingStoreFiles == null)? 0 :this.hbaseHstoreBlockingStoreFiles.hashCode()));
        result = ((result* 31)+((this.hbaseHstoreCompactionThreshold == null)? 0 :this.hbaseHstoreCompactionThreshold.hashCode()));
        result = ((result* 31)+((this.nodemanagerHeapsize == null)? 0 :this.nodemanagerHeapsize.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerStoreClass == null)? 0 :this.yarnResourcemanagerStoreClass.hashCode()));
        result = ((result* 31)+((this.hbaseRegionserverHandlerCount == null)? 0 :this.hbaseRegionserverHandlerCount.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed == null)? 0 :this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerZkAcl == null)? 0 :this.yarnResourcemanagerZkAcl.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootAccessibleNodeLabels == null)? 0 :this.yarnSchedulerCapacityRootAccessibleNodeLabels.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootDefaultState == null)? 0 :this.yarnSchedulerCapacityRootDefaultState.hashCode()));
        result = ((result* 31)+((this.yarnHeapsize == null)? 0 :this.yarnHeapsize.hashCode()));
        result = ((result* 31)+((this.hbaseMasterUiReadonly == null)? 0 :this.hbaseMasterUiReadonly.hashCode()));
        result = ((result* 31)+((this.yarnHbaseHeapMemoryFactor == null)? 0 :this.yarnHbaseHeapMemoryFactor.hashCode()));
        result = ((result* 31)+((this.hadoopRegistryDnsDomainName == null)? 0 :this.hadoopRegistryDnsDomainName.hashCode()));
        result = ((result* 31)+((this.dockerAllowedRwMounts == null)? 0 :this.dockerAllowedRwMounts.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceVersion == null)? 0 :this.yarnTimelineServiceVersion.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityScheduleAsynchronouslyEnable == null)? 0 :this.yarnSchedulerCapacityScheduleAsynchronouslyEnable.hashCode()));
        result = ((result* 31)+((this.hbaseSecurityLogMaxfilesize == null)? 0 :this.hbaseSecurityLogMaxfilesize.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks == null)? 0 :this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAddress == null)? 0 :this.yarnNodemanagerAddress.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerMinimumAllocationMb == null)? 0 :this.yarnSchedulerMinimumAllocationMb.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootDefaultCapacity == null)? 0 :this.yarnSchedulerCapacityRootDefaultCapacity.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLogAggregationCompressionType == null)? 0 :this.yarnNodemanagerLogAggregationCompressionType.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourcePluginsGpuDockerPlugin == null)? 0 :this.yarnNodemanagerResourcePluginsGpuDockerPlugin.hashCode()));
        result = ((result* 31)+((this.yarnAtsUser == null)? 0 :this.yarnAtsUser.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootSparkMaximumCapacity == null)? 0 :this.yarnSchedulerCapacityRootSparkMaximumCapacity.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerFsStateStoreRetryPolicySpec == null)? 0 :this.yarnResourcemanagerFsStateStoreRetryPolicySpec.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerSystemMetricsPublisherEnabled == null)? 0 :this.yarnResourcemanagerSystemMetricsPublisherEnabled.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerContainerExecutorClass == null)? 0 :this.yarnNodemanagerContainerExecutorClass.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize == null)? 0 :this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize.hashCode()));
        result = ((result* 31)+((this.dockerAllowedVolumeDrivers == null)? 0 :this.dockerAllowedVolumeDrivers.hashCode()));
        result = ((result* 31)+((this.zookeeperRecoveryRetry == null)? 0 :this.zookeeperRecoveryRetry.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerHealthCheckerIntervalMs == null)? 0 :this.yarnNodemanagerHealthCheckerIntervalMs.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds.hashCode()));
        result = ((result* 31)+((this.isSupportedYarnRanger == null)? 0 :this.isSupportedYarnRanger.hashCode()));
        result = ((result* 31)+((this.yarnLogServerWebServiceUrl == null)? 0 :this.yarnLogServerWebServiceUrl.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAuxServicesSpark2ShuffleClass == null)? 0 :this.yarnNodemanagerAuxServicesSpark2ShuffleClass.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAdminEnv == null)? 0 :this.yarnNodemanagerAdminEnv.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks == null)? 0 :this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerFsStateStoreUri == null)? 0 :this.yarnResourcemanagerFsStateStoreUri.hashCode()));
        result = ((result* 31)+((this.serviceCheckQueueName == null)? 0 :this.serviceCheckQueueName.hashCode()));
        result = ((result* 31)+((this.hbaseLogMaxbackupindex == null)? 0 :this.hbaseLogMaxbackupindex.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRecoveryEnabled == null)? 0 :this.yarnNodemanagerRecoveryEnabled.hashCode()));
        result = ((result* 31)+((this.yarnHbaseRegionserverMemory == null)? 0 :this.yarnHbaseRegionserverMemory.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEnabled == null)? 0 :this.yarnTimelineServiceEnabled.hashCode()));
        result = ((result* 31)+((this.hbaseRpcProtection == null)? 0 :this.hbaseRpcProtection.hashCode()));
        result = ((result* 31)+((this.yarnRmSummaryLogNumberOfBackupFiles == null)? 0 :this.yarnRmSummaryLogNumberOfBackupFiles.hashCode()));
        result = ((result* 31)+((this.dockerBinary == null)? 0 :this.dockerBinary.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourceCpuVcores == null)? 0 :this.yarnNodemanagerResourceCpuVcores.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceVersions == null)? 0 :this.yarnTimelineServiceVersions.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootSparkCapacity == null)? 0 :this.yarnSchedulerCapacityRootSparkCapacity.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootDefaultAclSubmitApplications == null)? 0 :this.yarnSchedulerCapacityRootDefaultAclSubmitApplications.hashCode()));
        result = ((result* 31)+((this.hadoopRegistryDnsZoneMask == null)? 0 :this.hadoopRegistryDnsZoneMask.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.dockerPrivilegedContainersEnabled == null)? 0 :this.dockerPrivilegedContainersEnabled.hashCode()));
        result = ((result* 31)+((this.zookeeperSessionTimeout == null)? 0 :this.zookeeperSessionTimeout.hashCode()));
        result = ((result* 31)+((this.dockerModuleEnabled == null)? 0 :this.dockerModuleEnabled.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor == null)? 0 :this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound == null)? 0 :this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLogAggregationDebugEnabled == null)? 0 :this.yarnNodemanagerLogAggregationDebugEnabled.hashCode()));
        result = ((result* 31)+((this.yarnResourceTypes == null)? 0 :this.yarnResourceTypes.hashCode()));
        result = ((result* 31)+((this.hbaseDefaultsForVersionSkip == null)? 0 :this.hbaseDefaultsForVersionSkip.hashCode()));
        result = ((result* 31)+((this.yarnWebappApiServiceEnable == null)? 0 :this.yarnWebappApiServiceEnable.hashCode()));
        result = ((result* 31)+((this.hbaseCoprocessorRegionserverClasses == null)? 0 :this.hbaseCoprocessorRegionserverClasses.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityMaximumAmResourcePercent == null)? 0 :this.yarnSchedulerCapacityMaximumAmResourcePercent.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerDeleteDebugDelaySec == null)? 0 :this.yarnNodemanagerDeleteDebugDelaySec.hashCode()));
        result = ((result* 31)+((this.securityMasterregionProtocolAcl == null)? 0 :this.securityMasterregionProtocolAcl.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLogDirs == null)? 0 :this.yarnNodemanagerLogDirs.hashCode()));
        result = ((result* 31)+((this.zookeeperZnodeParent == null)? 0 :this.zookeeperZnodeParent.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers == null)? 0 :this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers.hashCode()));
        result = ((result* 31)+((this.yarnHbaseSystemServiceQueueName == null)? 0 :this.yarnHbaseSystemServiceQueueName.hashCode()));
        result = ((result* 31)+((this.hbaseHregionMemstoreBlockMultiplier == null)? 0 :this.hbaseHregionMemstoreBlockMultiplier.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceClientMaxRetries == null)? 0 :this.yarnTimelineServiceClientMaxRetries.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs == null)? 0 :this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs.hashCode()));
        result = ((result* 31)+((this.registryDnsBindPort == null)? 0 :this.registryDnsBindPort.hashCode()));
        result = ((result* 31)+((this.yarnRmSummaryLogMaxBackupSize == null)? 0 :this.yarnRmSummaryLogMaxBackupSize.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerSchedulerAddress == null)? 0 :this.yarnResourcemanagerSchedulerAddress.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerContainerMonitorIntervalMs == null)? 0 :this.yarnNodemanagerContainerMonitorIntervalMs.hashCode()));
        result = ((result* 31)+((this.hbaseBucketcacheIoengine == null)? 0 :this.hbaseBucketcacheIoengine.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath == null)? 0 :this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLogRetainSeconds == null)? 0 :this.yarnNodemanagerLogRetainSeconds.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent == null)? 0 :this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent.hashCode()));
        result = ((result* 31)+((this.cgroupRoot == null)? 0 :this.cgroupRoot.hashCode()));
        result = ((result* 31)+((this.hbaseRpcTimeout == null)? 0 :this.hbaseRpcTimeout.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb == null)? 0 :this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerWebappHttpsAddress == null)? 0 :this.yarnResourcemanagerWebappHttpsAddress.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices == null)? 0 :this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices.hashCode()));
        result = ((result* 31)+((this.yarnSystemMetricspublisherEnabled == null)? 0 :this.yarnSystemMetricspublisherEnabled.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage == null)? 0 :this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage.hashCode()));
        result = ((result* 31)+((this.yarnNodeLabelsEnabled == null)? 0 :this.yarnNodeLabelsEnabled.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerZkNumRetries == null)? 0 :this.yarnResourcemanagerZkNumRetries.hashCode()));
        result = ((result* 31)+((this.hbaseLogMaxfilesize == null)? 0 :this.hbaseLogMaxfilesize.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerBindHost == null)? 0 :this.yarnNodemanagerBindHost.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceStateStoreClass == null)? 0 :this.yarnTimelineServiceStateStoreClass.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerZkTimeoutMs == null)? 0 :this.yarnResourcemanagerZkTimeoutMs.hashCode()));
        result = ((result* 31)+((this.yarnHbaseMasterMemory == null)? 0 :this.yarnHbaseMasterMemory.hashCode()));
        result = ((result* 31)+((this.hbaseBucketcachePercentageInCombinedcache == null)? 0 :this.hbaseBucketcachePercentageInCombinedcache.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootDefaultAclAdministerJobs == null)? 0 :this.yarnSchedulerCapacityRootDefaultAclAdministerJobs.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAuxServicesMapreduceShuffleClass == null)? 0 :this.yarnNodemanagerAuxServicesMapreduceShuffleClass.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerAmMaxAttempts == null)? 0 :this.yarnResourcemanagerAmMaxAttempts.hashCode()));
        result = ((result* 31)+((this.yarnServiceFrameworkPath == null)? 0 :this.yarnServiceFrameworkPath.hashCode()));
        result = ((result* 31)+((this.hbaseHregionMemstoreFlushSize == null)? 0 :this.hbaseHregionMemstoreFlushSize.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRuntimeLinuxDockerCapabilities == null)? 0 :this.yarnNodemanagerRuntimeLinuxDockerCapabilities.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerPlacementConstraintsHandler == null)? 0 :this.yarnResourcemanagerPlacementConstraintsHandler.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourcePercentagePhysicalCpuLimit == null)? 0 :this.yarnNodemanagerResourcePercentagePhysicalCpuLimit.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs == null)? 0 :this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerVmemCheckEnabled == null)? 0 :this.yarnNodemanagerVmemCheckEnabled.hashCode()));
        result = ((result* 31)+((this.yarnHbaseClientMemory == null)? 0 :this.yarnHbaseClientMemory.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityMaximumApplications == null)? 0 :this.yarnSchedulerCapacityMaximumApplications.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerMinimumAllocationVcores == null)? 0 :this.yarnSchedulerMinimumAllocationVcores.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAuxServicesTimelineCollectorClass == null)? 0 :this.yarnNodemanagerAuxServicesTimelineCollectorClass.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerWebappCrossOriginEnabled == null)? 0 :this.yarnNodemanagerWebappCrossOriginEnabled.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerDisplayPerUserApps == null)? 0 :this.yarnResourcemanagerDisplayPerUserApps.hashCode()));
        result = ((result* 31)+((this.hbaseZookeeperUseMulti == null)? 0 :this.hbaseZookeeperUseMulti.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerMaximumAllocationVcores == null)? 0 :this.yarnSchedulerMaximumAllocationVcores.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds.hashCode()));
        result = ((result* 31)+((this.yarnUserNprocLimit == null)? 0 :this.yarnUserNprocLimit.hashCode()));
        result = ((result* 31)+((this.hadoopRegistryDnsEnabled == null)? 0 :this.hadoopRegistryDnsEnabled.hashCode()));
        result = ((result* 31)+((this.hbaseJavaIoTmpdir == null)? 0 :this.hbaseJavaIoTmpdir.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceTtlMs == null)? 0 :this.yarnTimelineServiceTtlMs.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootDefaultUserLimitFactor == null)? 0 :this.yarnSchedulerCapacityRootDefaultUserLimitFactor.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerZkRetryIntervalMs == null)? 0 :this.yarnResourcemanagerZkRetryIntervalMs.hashCode()));
        result = ((result* 31)+((this.hbaseMasterInfoPort == null)? 0 :this.hbaseMasterInfoPort.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork == null)? 0 :this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork.hashCode()));
        result = ((result* 31)+((this.hbaseClientScannerCaching == null)? 0 :this.hbaseClientScannerCaching.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo == null)? 0 :this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo.hashCode()));
        result = ((result* 31)+((this.yarnHbasePidDirPrefix == null)? 0 :this.yarnHbasePidDirPrefix.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceClientRetryIntervalMs == null)? 0 :this.yarnTimelineServiceClientRetryIntervalMs.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerSchedulerClass == null)? 0 :this.yarnResourcemanagerSchedulerClass.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRemoteAppLogDir == null)? 0 :this.yarnNodemanagerRemoteAppLogDir.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreActiveDir == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreActiveDir.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerHealthCheckerScriptTimeoutMs == null)? 0 :this.yarnNodemanagerHealthCheckerScriptTimeoutMs.hashCode()));
        result = ((result* 31)+((this.hbaseCoprocessorMasterClasses == null)? 0 :this.hbaseCoprocessorMasterClasses.hashCode()));
        result = ((result* 31)+((this.hbaseRootdir == null)? 0 :this.hbaseRootdir.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceStoreClass == null)? 0 :this.yarnTimelineServiceStoreClass.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerResourceTrackerAddress == null)? 0 :this.yarnResourcemanagerResourceTrackerAddress.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreDoneDir == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreDoneDir.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerConnectMaxWaitMs == null)? 0 :this.yarnResourcemanagerConnectMaxWaitMs.hashCode()));
        result = ((result* 31)+((this.yarnWebappUi2Enable == null)? 0 :this.yarnWebappUi2Enable.hashCode()));
        result = ((result* 31)+((this.yarnResourceTypesYarnIoGpuMaximumAllocation == null)? 0 :this.yarnResourceTypesYarnIoGpuMaximumAllocation.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHbaseConfigurationFile == null)? 0 :this.yarnTimelineServiceHbaseConfigurationFile.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerHaEnabled == null)? 0 :this.yarnResourcemanagerHaEnabled.hashCode()));
        result = ((result* 31)+((this.yarnLogAggregationEnable == null)? 0 :this.yarnLogAggregationEnable.hashCode()));
        result = ((result* 31)+((this.hbaseSuperuser == null)? 0 :this.hbaseSuperuser.hashCode()));
        result = ((result* 31)+((this.hadoopRegistryDnsBindPort == null)? 0 :this.hadoopRegistryDnsBindPort.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled == null)? 0 :this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize == null)? 0 :this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerZkStateStoreParentPath == null)? 0 :this.yarnResourcemanagerZkStateStoreParentPath.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootDefaultMaximumCapacity == null)? 0 :this.yarnSchedulerCapacityRootDefaultMaximumCapacity.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLogAggregationNumLogFilesPerApp == null)? 0 :this.yarnNodemanagerLogAggregationNumLogFilesPerApp.hashCode()));
        result = ((result* 31)+((this.dockerAllowedDevices == null)? 0 :this.dockerAllowedDevices.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerVmemPmemRatio == null)? 0 :this.yarnNodemanagerVmemPmemRatio.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerZkAddress == null)? 0 :this.yarnResourcemanagerZkAddress.hashCode()));
        result = ((result* 31)+((this.yarnRmSystemMetricspublisherEmitContainerEvents == null)? 0 :this.yarnRmSystemMetricspublisherEmitContainerEvents.hashCode()));
        result = ((result* 31)+((this.dockerAllowedRoMounts == null)? 0 :this.dockerAllowedRoMounts.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerAuxServices == null)? 0 :this.yarnNodemanagerAuxServices.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRecoveryDir == null)? 0 :this.yarnNodemanagerRecoveryDir.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables == null)? 0 :this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled == null)? 0 :this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHttpCrossOriginEnabled == null)? 0 :this.yarnTimelineServiceHttpCrossOriginEnabled.hashCode()));
        result = ((result* 31)+((this.hbaseCoprocessorRegionClasses == null)? 0 :this.hbaseCoprocessorRegionClasses.hashCode()));
        result = ((result* 31)+((this.hbaseClientKeyvalueMaxsize == null)? 0 :this.hbaseClientKeyvalueMaxsize.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceRecoveryEnabled == null)? 0 :this.yarnTimelineServiceRecoveryEnabled.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerMaximumAllocationMb == null)? 0 :this.yarnSchedulerMaximumAllocationMb.hashCode()));
        result = ((result* 31)+((this.dfsDomainSocketPath == null)? 0 :this.dfsDomainSocketPath.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceWebappAddress == null)? 0 :this.yarnTimelineServiceWebappAddress.hashCode()));
        result = ((result* 31)+((this.dockerTrustedRegistries == null)? 0 :this.dockerTrustedRegistries.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourceMemoryMb == null)? 0 :this.yarnNodemanagerResourceMemoryMb.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerRecoveryEnabled == null)? 0 :this.yarnResourcemanagerRecoveryEnabled.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootAclAdministerQueue == null)? 0 :this.yarnSchedulerCapacityRootAclAdministerQueue.hashCode()));
        result = ((result* 31)+((this.hfileBlockCacheSize == null)? 0 :this.hfileBlockCacheSize.hashCode()));
        result = ((result* 31)+((this.gpuModuleEnabled == null)? 0 :this.gpuModuleEnabled.hashCode()));
        result = ((result* 31)+((this.yarnPidDirPrefix == null)? 0 :this.yarnPidDirPrefix.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups == null)? 0 :this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerHostname == null)? 0 :this.yarnResourcemanagerHostname.hashCode()));
        result = ((result* 31)+((this.isHbaseSystemServiceLaunch == null)? 0 :this.isHbaseSystemServiceLaunch.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityResourceCalculator == null)? 0 :this.yarnSchedulerCapacityResourceCalculator.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerAddress == null)? 0 :this.yarnResourcemanagerAddress.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize == null)? 0 :this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize.hashCode()));
        result = ((result* 31)+((this.minUserId == null)? 0 :this.minUserId.hashCode()));
        result = ((result* 31)+((this.apptimelineserverHeapsize == null)? 0 :this.apptimelineserverHeapsize.hashCode()));
        result = ((result* 31)+((this.yarnLogAggregationRetainSeconds == null)? 0 :this.yarnLogAggregationRetainSeconds.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerNodesExcludePath == null)? 0 :this.yarnResourcemanagerNodesExcludePath.hashCode()));
        result = ((result* 31)+((this.yarnAdminAcl == null)? 0 :this.yarnAdminAcl.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerWebappAddress == null)? 0 :this.yarnResourcemanagerWebappAddress.hashCode()));
        result = ((result* 31)+((this.hbaseMasterWaitOnRegionserversTimeout == null)? 0 :this.hbaseMasterWaitOnRegionserversTimeout.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceEntityGroupFsStoreSummaryStore == null)? 0 :this.yarnTimelineServiceEntityGroupFsStoreSummaryStore.hashCode()));
        result = ((result* 31)+((this.hbaseMasterNamespaceInitTimeout == null)? 0 :this.hbaseMasterNamespaceInitTimeout.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceGenericApplicationHistoryStoreClass == null)? 0 :this.yarnTimelineServiceGenericApplicationHistoryStoreClass.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityRootSparkUserLimitFactor == null)? 0 :this.yarnSchedulerCapacityRootSparkUserLimitFactor.hashCode()));
        result = ((result* 31)+((this.securityClientProtocolAcl == null)? 0 :this.securityClientProtocolAcl.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerSchedulerMonitorEnable == null)? 0 :this.yarnResourcemanagerSchedulerMonitorEnable.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerContainerMetricsUnregisterDelayMs == null)? 0 :this.yarnNodemanagerContainerMetricsUnregisterDelayMs.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLinuxContainerExecutorGroup == null)? 0 :this.yarnNodemanagerLinuxContainerExecutorGroup.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds == null)? 0 :this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds.hashCode()));
        result = ((result* 31)+((this.hbaseMasterPort == null)? 0 :this.hbaseMasterPort.hashCode()));
        result = ((result* 31)+((this.hbaseRegionserverGlobalMemstoreSize == null)? 0 :this.hbaseRegionserverGlobalMemstoreSize.hashCode()));
        result = ((result* 31)+((this.yarnClientNodemanagerConnectMaxWaitMs == null)? 0 :this.yarnClientNodemanagerConnectMaxWaitMs.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval == null)? 0 :this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval.hashCode()));
        result = ((result* 31)+((this.hadoopRegistryDnsZoneSubnet == null)? 0 :this.hadoopRegistryDnsZoneSubnet.hashCode()));
        result = ((result* 31)+((this.hadoopRegistryZkQuorum == null)? 0 :this.hadoopRegistryZkQuorum.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerLocalDirs == null)? 0 :this.yarnNodemanagerLocalDirs.hashCode()));
        result = ((result* 31)+((this.yarnSchedulerCapacityNodeLocalityDelay == null)? 0 :this.yarnSchedulerCapacityNodeLocalityDelay.hashCode()));
        result = ((result* 31)+((this.yarnLogServerUrl == null)? 0 :this.yarnLogServerUrl.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceReaderWebappAddress == null)? 0 :this.yarnTimelineServiceReaderWebappAddress.hashCode()));
        result = ((result* 31)+((this.yarnClientNodemanagerConnectRetryIntervalMs == null)? 0 :this.yarnClientNodemanagerConnectRetryIntervalMs.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceBindHost == null)? 0 :this.yarnTimelineServiceBindHost.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceHbaseSchemaPrefix == null)? 0 :this.yarnTimelineServiceHbaseSchemaPrefix.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs == null)? 0 :this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs.hashCode()));
        result = ((result* 31)+((this.hbaseClusterDistributed == null)? 0 :this.hbaseClusterDistributed.hashCode()));
        result = ((result* 31)+((this.yarnTimelineServiceTtlEnable == null)? 0 :this.yarnTimelineServiceTtlEnable.hashCode()));
        result = ((result* 31)+((this.yarnHbaseMasterContainers == null)? 0 :this.yarnHbaseMasterContainers.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerStateStoreMaxCompletedApplications == null)? 0 :this.yarnResourcemanagerStateStoreMaxCompletedApplications.hashCode()));
        result = ((result* 31)+((this.hbaseHregionMajorcompactionJitter == null)? 0 :this.hbaseHregionMajorcompactionJitter.hashCode()));
        result = ((result* 31)+((this.hbaseTmpDir == null)? 0 :this.hbaseTmpDir.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerResourcePlugins == null)? 0 :this.yarnNodemanagerResourcePlugins.hashCode()));
        result = ((result* 31)+((this.yarnResourcemanagerAdminAddress == null)? 0 :this.yarnResourcemanagerAdminAddress.hashCode()));
        result = ((result* 31)+((this.hbaseBucketcacheSize == null)? 0 :this.hbaseBucketcacheSize.hashCode()));
        result = ((result* 31)+((this.yarnAclEnable == null)? 0 :this.yarnAclEnable.hashCode()));
        result = ((result* 31)+((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed == null)? 0 :this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed.hashCode()));
        result = ((result* 31)+((this.yarnHbaseSystemServiceLaunchMode == null)? 0 :this.yarnHbaseSystemServiceLaunchMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties) == false) {
            return false;
        }
        Properties rhs = ((Properties) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.hbaseZookeeperQuorum == rhs.hbaseZookeeperQuorum)||((this.hbaseZookeeperQuorum!= null)&&this.hbaseZookeeperQuorum.equals(rhs.hbaseZookeeperQuorum)))&&((this.yarnHbaseClientCpu == rhs.yarnHbaseClientCpu)||((this.yarnHbaseClientCpu!= null)&&this.yarnHbaseClientCpu.equals(rhs.yarnHbaseClientCpu))))&&((this.yarnTimelineServiceReaderWebappHttpsAddress == rhs.yarnTimelineServiceReaderWebappHttpsAddress)||((this.yarnTimelineServiceReaderWebappHttpsAddress!= null)&&this.yarnTimelineServiceReaderWebappHttpsAddress.equals(rhs.yarnTimelineServiceReaderWebappHttpsAddress))))&&((this.yarnTimelineServiceLeveldbTimelineStorePath == rhs.yarnTimelineServiceLeveldbTimelineStorePath)||((this.yarnTimelineServiceLeveldbTimelineStorePath!= null)&&this.yarnTimelineServiceLeveldbTimelineStorePath.equals(rhs.yarnTimelineServiceLeveldbTimelineStorePath))))&&((this.securityAdminProtocolAcl == rhs.securityAdminProtocolAcl)||((this.securityAdminProtocolAcl!= null)&&this.securityAdminProtocolAcl.equals(rhs.securityAdminProtocolAcl))))&&((this.yarnResourcemanagerWorkPreservingRecoveryEnabled == rhs.yarnResourcemanagerWorkPreservingRecoveryEnabled)||((this.yarnResourcemanagerWorkPreservingRecoveryEnabled!= null)&&this.yarnResourcemanagerWorkPreservingRecoveryEnabled.equals(rhs.yarnResourcemanagerWorkPreservingRecoveryEnabled))))&&((this.yarnApplicationClasspath == rhs.yarnApplicationClasspath)||((this.yarnApplicationClasspath!= null)&&this.yarnApplicationClasspath.equals(rhs.yarnApplicationClasspath))))&&((this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint == rhs.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint)||((this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint!= null)&&this.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint.equals(rhs.yarnNodemanagerResourcePluginsGpuDockerPluginNvidiadockerV1Endpoint))))&&((this.hbaseSecurityLogMaxbackupindex == rhs.hbaseSecurityLogMaxbackupindex)||((this.hbaseSecurityLogMaxbackupindex!= null)&&this.hbaseSecurityLogMaxbackupindex.equals(rhs.hbaseSecurityLogMaxbackupindex))))&&((this.hbaseHregionMajorcompaction == rhs.hbaseHregionMajorcompaction)||((this.hbaseHregionMajorcompaction!= null)&&this.hbaseHregionMajorcompaction.equals(rhs.hbaseHregionMajorcompaction))))&&((this.yarnTimelineServiceAddress == rhs.yarnTimelineServiceAddress)||((this.yarnTimelineServiceAddress!= null)&&this.yarnTimelineServiceAddress.equals(rhs.yarnTimelineServiceAddress))))&&((this.manageIncludeFiles == rhs.manageIncludeFiles)||((this.manageIncludeFiles!= null)&&this.manageIncludeFiles.equals(rhs.manageIncludeFiles))))&&((this.yarnHbaseRegionserverCpu == rhs.yarnHbaseRegionserverCpu)||((this.yarnHbaseRegionserverCpu!= null)&&this.yarnHbaseRegionserverCpu.equals(rhs.yarnHbaseRegionserverCpu))))&&((this.yarnHbaseRegionserverContainers == rhs.yarnHbaseRegionserverContainers)||((this.yarnHbaseRegionserverContainers!= null)&&this.yarnHbaseRegionserverContainers.equals(rhs.yarnHbaseRegionserverContainers))))&&((this.yarnUserNofileLimit == rhs.yarnUserNofileLimit)||((this.yarnUserNofileLimit!= null)&&this.yarnUserNofileLimit.equals(rhs.yarnUserNofileLimit))))&&((this.yarnHttpPolicy == rhs.yarnHttpPolicy)||((this.yarnHttpPolicy!= null)&&this.yarnHttpPolicy.equals(rhs.yarnHttpPolicy))))&&((this.yarnCgroupsEnabled == rhs.yarnCgroupsEnabled)||((this.yarnCgroupsEnabled!= null)&&this.yarnCgroupsEnabled.equals(rhs.yarnCgroupsEnabled))))&&((this.yarnServiceSystemServiceDir == rhs.yarnServiceSystemServiceDir)||((this.yarnServiceSystemServiceDir!= null)&&this.yarnServiceSystemServiceDir.equals(rhs.yarnServiceSystemServiceDir))))&&((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts == rhs.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts)||((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts!= null)&&this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts.equals(rhs.yarnTimelineServiceHttpAuthenticationProxyuserAmbariHosts))))&&((this.hbaseZookeeperPropertyClientPort == rhs.hbaseZookeeperPropertyClientPort)||((this.hbaseZookeeperPropertyClientPort!= null)&&this.hbaseZookeeperPropertyClientPort.equals(rhs.hbaseZookeeperPropertyClientPort))))&&((this.yarnNodemanagerRuntimeLinuxAllowedRuntimes == rhs.yarnNodemanagerRuntimeLinuxAllowedRuntimes)||((this.yarnNodemanagerRuntimeLinuxAllowedRuntimes!= null)&&this.yarnNodemanagerRuntimeLinuxAllowedRuntimes.equals(rhs.yarnNodemanagerRuntimeLinuxAllowedRuntimes))))&&((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl == rhs.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl)||((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl!= null)&&this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl.equals(rhs.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAcl))))&&((this.yarnNodemanagerRemoteAppLogDirSuffix == rhs.yarnNodemanagerRemoteAppLogDirSuffix)||((this.yarnNodemanagerRemoteAppLogDirSuffix!= null)&&this.yarnNodemanagerRemoteAppLogDirSuffix.equals(rhs.yarnNodemanagerRemoteAppLogDirSuffix))))&&((this.yarnHbaseMasterCpu == rhs.yarnHbaseMasterCpu)||((this.yarnHbaseMasterCpu!= null)&&this.yarnHbaseMasterCpu.equals(rhs.yarnHbaseMasterCpu))))&&((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize == rhs.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize)||((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize!= null)&&this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize.equals(rhs.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize))))&&((this.yarnUser == rhs.yarnUser)||((this.yarnUser!= null)&&this.yarnUser.equals(rhs.yarnUser))))&&((this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage == rhs.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage)||((this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage!= null)&&this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage.equals(rhs.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage))))&&((this.hadoopRegistryDnsBindAddress == rhs.hadoopRegistryDnsBindAddress)||((this.hadoopRegistryDnsBindAddress!= null)&&this.hadoopRegistryDnsBindAddress.equals(rhs.hadoopRegistryDnsBindAddress))))&&((this.hadoopHttpCrossOriginAllowedOrigins == rhs.hadoopHttpCrossOriginAllowedOrigins)||((this.hadoopHttpCrossOriginAllowedOrigins!= null)&&this.hadoopHttpCrossOriginAllowedOrigins.equals(rhs.hadoopHttpCrossOriginAllowedOrigins))))&&((this.yarnNodemanagerAuxServicesSparkShuffleClass == rhs.yarnNodemanagerAuxServicesSparkShuffleClass)||((this.yarnNodemanagerAuxServicesSparkShuffleClass!= null)&&this.yarnNodemanagerAuxServicesSparkShuffleClass.equals(rhs.yarnNodemanagerAuxServicesSparkShuffleClass))))&&((this.hbaseSecurityAuthentication == rhs.hbaseSecurityAuthentication)||((this.hbaseSecurityAuthentication!= null)&&this.hbaseSecurityAuthentication.equals(rhs.hbaseSecurityAuthentication))))&&((this.hbaseSecurityAuthorization == rhs.hbaseSecurityAuthorization)||((this.hbaseSecurityAuthorization!= null)&&this.hbaseSecurityAuthorization.equals(rhs.hbaseSecurityAuthorization))))&&((this.hbaseHstoreCompactionMax == rhs.hbaseHstoreCompactionMax)||((this.hbaseHstoreCompactionMax!= null)&&this.hbaseHstoreCompactionMax.equals(rhs.hbaseHstoreCompactionMax))))&&((this.yarnTimelineServiceLeveldbStateStorePath == rhs.yarnTimelineServiceLeveldbStateStorePath)||((this.yarnTimelineServiceLeveldbStateStorePath!= null)&&this.yarnTimelineServiceLeveldbStateStorePath.equals(rhs.yarnTimelineServiceLeveldbStateStorePath))))&&((this.yarnSchedulerCapacityRootAclSubmitApplications == rhs.yarnSchedulerCapacityRootAclSubmitApplications)||((this.yarnSchedulerCapacityRootAclSubmitApplications!= null)&&this.yarnSchedulerCapacityRootAclSubmitApplications.equals(rhs.yarnSchedulerCapacityRootAclSubmitApplications))))&&((this.yarnSchedulerCapacityRootQueues == rhs.yarnSchedulerCapacityRootQueues)||((this.yarnSchedulerCapacityRootQueues!= null)&&this.yarnSchedulerCapacityRootQueues.equals(rhs.yarnSchedulerCapacityRootQueues))))&&((this.yarnHbaseClientContainers == rhs.yarnHbaseClientContainers)||((this.yarnHbaseClientContainers!= null)&&this.yarnHbaseClientContainers.equals(rhs.yarnHbaseClientContainers))))&&((this.hbaseClientRetriesNumber == rhs.hbaseClientRetriesNumber)||((this.hbaseClientRetriesNumber!= null)&&this.hbaseClientRetriesNumber.equals(rhs.hbaseClientRetriesNumber))))&&((this.hbaseMasterInfoBindAddress == rhs.hbaseMasterInfoBindAddress)||((this.hbaseMasterInfoBindAddress!= null)&&this.hbaseMasterInfoBindAddress.equals(rhs.hbaseMasterInfoBindAddress))))&&((this.hbaseRegionserverExecutorOpenregionThreads == rhs.hbaseRegionserverExecutorOpenregionThreads)||((this.hbaseRegionserverExecutorOpenregionThreads!= null)&&this.hbaseRegionserverExecutorOpenregionThreads.equals(rhs.hbaseRegionserverExecutorOpenregionThreads))))&&((this.hbaseRegionserverInfoPort == rhs.hbaseRegionserverInfoPort)||((this.hbaseRegionserverInfoPort!= null)&&this.hbaseRegionserverInfoPort.equals(rhs.hbaseRegionserverInfoPort))))&&((this.hbaseRegionserverPort == rhs.hbaseRegionserverPort)||((this.hbaseRegionserverPort!= null)&&this.hbaseRegionserverPort.equals(rhs.hbaseRegionserverPort))))&&((this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation == rhs.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation)||((this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation!= null)&&this.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation.equals(rhs.yarnTimelineServiceHbaseCoprocessorJarHdfsLocation))))&&((this.yarnLogDirPrefix == rhs.yarnLogDirPrefix)||((this.yarnLogDirPrefix!= null)&&this.yarnLogDirPrefix.equals(rhs.yarnLogDirPrefix))))&&((this.yarnResourcemanagerConnectRetryIntervalMs == rhs.yarnResourcemanagerConnectRetryIntervalMs)||((this.yarnResourcemanagerConnectRetryIntervalMs!= null)&&this.yarnResourcemanagerConnectRetryIntervalMs.equals(rhs.yarnResourcemanagerConnectRetryIntervalMs))))&&((this.yarnTimelineServiceWebappHttpsAddress == rhs.yarnTimelineServiceWebappHttpsAddress)||((this.yarnTimelineServiceWebappHttpsAddress!= null)&&this.yarnTimelineServiceWebappHttpsAddress.equals(rhs.yarnTimelineServiceWebappHttpsAddress))))&&((this.yarnResourcemanagerBindHost == rhs.yarnResourcemanagerBindHost)||((this.yarnResourcemanagerBindHost!= null)&&this.yarnResourcemanagerBindHost.equals(rhs.yarnResourcemanagerBindHost))))&&((this.yarnNodeLabelsFsStoreRootDir == rhs.yarnNodeLabelsFsStoreRootDir)||((this.yarnNodeLabelsFsStoreRootDir!= null)&&this.yarnNodeLabelsFsStoreRootDir.equals(rhs.yarnNodeLabelsFsStoreRootDir))))&&((this.yarnNodemanagerAuxServicesSparkShuffleClasspath == rhs.yarnNodemanagerAuxServicesSparkShuffleClasspath)||((this.yarnNodemanagerAuxServicesSparkShuffleClasspath!= null)&&this.yarnNodemanagerAuxServicesSparkShuffleClasspath.equals(rhs.yarnNodemanagerAuxServicesSparkShuffleClasspath))))&&((this.yarnTimelineServiceHttpAuthenticationType == rhs.yarnTimelineServiceHttpAuthenticationType)||((this.yarnTimelineServiceHttpAuthenticationType!= null)&&this.yarnTimelineServiceHttpAuthenticationType.equals(rhs.yarnTimelineServiceHttpAuthenticationType))))&&((this.yarnSchedulerCapacityRootSparkState == rhs.yarnSchedulerCapacityRootSparkState)||((this.yarnSchedulerCapacityRootSparkState!= null)&&this.yarnSchedulerCapacityRootSparkState.equals(rhs.yarnSchedulerCapacityRootSparkState))))&&((this.yarnNodemanagerRecoverySupervised == rhs.yarnNodemanagerRecoverySupervised)||((this.yarnNodemanagerRecoverySupervised!= null)&&this.yarnNodemanagerRecoverySupervised.equals(rhs.yarnNodemanagerRecoverySupervised))))&&((this.yarnHierarchy == rhs.yarnHierarchy)||((this.yarnHierarchy!= null)&&this.yarnHierarchy.equals(rhs.yarnHierarchy))))&&((this.hbaseLocalDir == rhs.hbaseLocalDir)||((this.hbaseLocalDir!= null)&&this.hbaseLocalDir.equals(rhs.hbaseLocalDir))))&&((this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled == rhs.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled)||((this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled!= null)&&this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled.equals(rhs.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled))))&&((this.yarnNodeLabelsFsStoreRetryPolicySpec == rhs.yarnNodeLabelsFsStoreRetryPolicySpec)||((this.yarnNodeLabelsFsStoreRetryPolicySpec!= null)&&this.yarnNodeLabelsFsStoreRetryPolicySpec.equals(rhs.yarnNodeLabelsFsStoreRetryPolicySpec))))&&((this.yarnResourcemanagerWebappCrossOriginEnabled == rhs.yarnResourcemanagerWebappCrossOriginEnabled)||((this.yarnResourcemanagerWebappCrossOriginEnabled!= null)&&this.yarnResourcemanagerWebappCrossOriginEnabled.equals(rhs.yarnResourcemanagerWebappCrossOriginEnabled))))&&((this.yarnSchedulerCapacityRootCapacity == rhs.yarnSchedulerCapacityRootCapacity)||((this.yarnSchedulerCapacityRootCapacity!= null)&&this.yarnSchedulerCapacityRootCapacity.equals(rhs.yarnSchedulerCapacityRootCapacity))))&&((this.hbaseHregionMaxFilesize == rhs.hbaseHregionMaxFilesize)||((this.hbaseHregionMaxFilesize!= null)&&this.hbaseHregionMaxFilesize.equals(rhs.hbaseHregionMaxFilesize))))&&((this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads == rhs.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads)||((this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads!= null)&&this.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads.equals(rhs.yarnSchedulerCapacityScheduleAsynchronouslyMaximumThreads))))&&((this.resourcemanagerHeapsize == rhs.resourcemanagerHeapsize)||((this.resourcemanagerHeapsize!= null)&&this.resourcemanagerHeapsize.equals(rhs.resourcemanagerHeapsize))))&&((this.hbaseHregionMemstoreMslabEnabled == rhs.hbaseHregionMemstoreMslabEnabled)||((this.hbaseHregionMemstoreMslabEnabled!= null)&&this.hbaseHregionMemstoreMslabEnabled.equals(rhs.hbaseHregionMemstoreMslabEnabled))))&&((this.hbaseHstoreBlockingStoreFiles == rhs.hbaseHstoreBlockingStoreFiles)||((this.hbaseHstoreBlockingStoreFiles!= null)&&this.hbaseHstoreBlockingStoreFiles.equals(rhs.hbaseHstoreBlockingStoreFiles))))&&((this.hbaseHstoreCompactionThreshold == rhs.hbaseHstoreCompactionThreshold)||((this.hbaseHstoreCompactionThreshold!= null)&&this.hbaseHstoreCompactionThreshold.equals(rhs.hbaseHstoreCompactionThreshold))))&&((this.nodemanagerHeapsize == rhs.nodemanagerHeapsize)||((this.nodemanagerHeapsize!= null)&&this.nodemanagerHeapsize.equals(rhs.nodemanagerHeapsize))))&&((this.yarnResourcemanagerStoreClass == rhs.yarnResourcemanagerStoreClass)||((this.yarnResourcemanagerStoreClass!= null)&&this.yarnResourcemanagerStoreClass.equals(rhs.yarnResourcemanagerStoreClass))))&&((this.hbaseRegionserverHandlerCount == rhs.hbaseRegionserverHandlerCount)||((this.hbaseRegionserverHandlerCount!= null)&&this.hbaseRegionserverHandlerCount.equals(rhs.hbaseRegionserverHandlerCount))))&&((this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed == rhs.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed)||((this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed!= null)&&this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed.equals(rhs.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed))))&&((this.yarnResourcemanagerZkAcl == rhs.yarnResourcemanagerZkAcl)||((this.yarnResourcemanagerZkAcl!= null)&&this.yarnResourcemanagerZkAcl.equals(rhs.yarnResourcemanagerZkAcl))))&&((this.yarnSchedulerCapacityRootAccessibleNodeLabels == rhs.yarnSchedulerCapacityRootAccessibleNodeLabels)||((this.yarnSchedulerCapacityRootAccessibleNodeLabels!= null)&&this.yarnSchedulerCapacityRootAccessibleNodeLabels.equals(rhs.yarnSchedulerCapacityRootAccessibleNodeLabels))))&&((this.yarnSchedulerCapacityRootDefaultState == rhs.yarnSchedulerCapacityRootDefaultState)||((this.yarnSchedulerCapacityRootDefaultState!= null)&&this.yarnSchedulerCapacityRootDefaultState.equals(rhs.yarnSchedulerCapacityRootDefaultState))))&&((this.yarnHeapsize == rhs.yarnHeapsize)||((this.yarnHeapsize!= null)&&this.yarnHeapsize.equals(rhs.yarnHeapsize))))&&((this.hbaseMasterUiReadonly == rhs.hbaseMasterUiReadonly)||((this.hbaseMasterUiReadonly!= null)&&this.hbaseMasterUiReadonly.equals(rhs.hbaseMasterUiReadonly))))&&((this.yarnHbaseHeapMemoryFactor == rhs.yarnHbaseHeapMemoryFactor)||((this.yarnHbaseHeapMemoryFactor!= null)&&this.yarnHbaseHeapMemoryFactor.equals(rhs.yarnHbaseHeapMemoryFactor))))&&((this.hadoopRegistryDnsDomainName == rhs.hadoopRegistryDnsDomainName)||((this.hadoopRegistryDnsDomainName!= null)&&this.hadoopRegistryDnsDomainName.equals(rhs.hadoopRegistryDnsDomainName))))&&((this.dockerAllowedRwMounts == rhs.dockerAllowedRwMounts)||((this.dockerAllowedRwMounts!= null)&&this.dockerAllowedRwMounts.equals(rhs.dockerAllowedRwMounts))))&&((this.yarnTimelineServiceVersion == rhs.yarnTimelineServiceVersion)||((this.yarnTimelineServiceVersion!= null)&&this.yarnTimelineServiceVersion.equals(rhs.yarnTimelineServiceVersion))))&&((this.yarnSchedulerCapacityScheduleAsynchronouslyEnable == rhs.yarnSchedulerCapacityScheduleAsynchronouslyEnable)||((this.yarnSchedulerCapacityScheduleAsynchronouslyEnable!= null)&&this.yarnSchedulerCapacityScheduleAsynchronouslyEnable.equals(rhs.yarnSchedulerCapacityScheduleAsynchronouslyEnable))))&&((this.hbaseSecurityLogMaxfilesize == rhs.hbaseSecurityLogMaxfilesize)||((this.hbaseSecurityLogMaxfilesize!= null)&&this.hbaseSecurityLogMaxfilesize.equals(rhs.hbaseSecurityLogMaxfilesize))))&&((this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks == rhs.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks)||((this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks!= null)&&this.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks.equals(rhs.yarnNodemanagerRuntimeLinuxDockerAllowedContainerNetworks))))&&((this.yarnNodemanagerAddress == rhs.yarnNodemanagerAddress)||((this.yarnNodemanagerAddress!= null)&&this.yarnNodemanagerAddress.equals(rhs.yarnNodemanagerAddress))))&&((this.yarnSchedulerMinimumAllocationMb == rhs.yarnSchedulerMinimumAllocationMb)||((this.yarnSchedulerMinimumAllocationMb!= null)&&this.yarnSchedulerMinimumAllocationMb.equals(rhs.yarnSchedulerMinimumAllocationMb))))&&((this.yarnSchedulerCapacityRootDefaultCapacity == rhs.yarnSchedulerCapacityRootDefaultCapacity)||((this.yarnSchedulerCapacityRootDefaultCapacity!= null)&&this.yarnSchedulerCapacityRootDefaultCapacity.equals(rhs.yarnSchedulerCapacityRootDefaultCapacity))))&&((this.yarnNodemanagerLogAggregationCompressionType == rhs.yarnNodemanagerLogAggregationCompressionType)||((this.yarnNodemanagerLogAggregationCompressionType!= null)&&this.yarnNodemanagerLogAggregationCompressionType.equals(rhs.yarnNodemanagerLogAggregationCompressionType))))&&((this.yarnNodemanagerResourcePluginsGpuDockerPlugin == rhs.yarnNodemanagerResourcePluginsGpuDockerPlugin)||((this.yarnNodemanagerResourcePluginsGpuDockerPlugin!= null)&&this.yarnNodemanagerResourcePluginsGpuDockerPlugin.equals(rhs.yarnNodemanagerResourcePluginsGpuDockerPlugin))))&&((this.yarnAtsUser == rhs.yarnAtsUser)||((this.yarnAtsUser!= null)&&this.yarnAtsUser.equals(rhs.yarnAtsUser))))&&((this.yarnSchedulerCapacityRootSparkMaximumCapacity == rhs.yarnSchedulerCapacityRootSparkMaximumCapacity)||((this.yarnSchedulerCapacityRootSparkMaximumCapacity!= null)&&this.yarnSchedulerCapacityRootSparkMaximumCapacity.equals(rhs.yarnSchedulerCapacityRootSparkMaximumCapacity))))&&((this.yarnResourcemanagerFsStateStoreRetryPolicySpec == rhs.yarnResourcemanagerFsStateStoreRetryPolicySpec)||((this.yarnResourcemanagerFsStateStoreRetryPolicySpec!= null)&&this.yarnResourcemanagerFsStateStoreRetryPolicySpec.equals(rhs.yarnResourcemanagerFsStateStoreRetryPolicySpec))))&&((this.yarnResourcemanagerSystemMetricsPublisherEnabled == rhs.yarnResourcemanagerSystemMetricsPublisherEnabled)||((this.yarnResourcemanagerSystemMetricsPublisherEnabled!= null)&&this.yarnResourcemanagerSystemMetricsPublisherEnabled.equals(rhs.yarnResourcemanagerSystemMetricsPublisherEnabled))))&&((this.yarnNodemanagerContainerExecutorClass == rhs.yarnNodemanagerContainerExecutorClass)||((this.yarnNodemanagerContainerExecutorClass!= null)&&this.yarnNodemanagerContainerExecutorClass.equals(rhs.yarnNodemanagerContainerExecutorClass))))&&((this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize == rhs.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize)||((this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize!= null)&&this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize.equals(rhs.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize))))&&((this.dockerAllowedVolumeDrivers == rhs.dockerAllowedVolumeDrivers)||((this.dockerAllowedVolumeDrivers!= null)&&this.dockerAllowedVolumeDrivers.equals(rhs.dockerAllowedVolumeDrivers))))&&((this.zookeeperRecoveryRetry == rhs.zookeeperRecoveryRetry)||((this.zookeeperRecoveryRetry!= null)&&this.zookeeperRecoveryRetry.equals(rhs.zookeeperRecoveryRetry))))&&((this.yarnNodemanagerHealthCheckerIntervalMs == rhs.yarnNodemanagerHealthCheckerIntervalMs)||((this.yarnNodemanagerHealthCheckerIntervalMs!= null)&&this.yarnNodemanagerHealthCheckerIntervalMs.equals(rhs.yarnNodemanagerHealthCheckerIntervalMs))))&&((this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds == rhs.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds)||((this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds!= null)&&this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds.equals(rhs.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds))))&&((this.isSupportedYarnRanger == rhs.isSupportedYarnRanger)||((this.isSupportedYarnRanger!= null)&&this.isSupportedYarnRanger.equals(rhs.isSupportedYarnRanger))))&&((this.yarnLogServerWebServiceUrl == rhs.yarnLogServerWebServiceUrl)||((this.yarnLogServerWebServiceUrl!= null)&&this.yarnLogServerWebServiceUrl.equals(rhs.yarnLogServerWebServiceUrl))))&&((this.yarnNodemanagerAuxServicesSpark2ShuffleClass == rhs.yarnNodemanagerAuxServicesSpark2ShuffleClass)||((this.yarnNodemanagerAuxServicesSpark2ShuffleClass!= null)&&this.yarnNodemanagerAuxServicesSpark2ShuffleClass.equals(rhs.yarnNodemanagerAuxServicesSpark2ShuffleClass))))&&((this.yarnNodemanagerAdminEnv == rhs.yarnNodemanagerAdminEnv)||((this.yarnNodemanagerAdminEnv!= null)&&this.yarnNodemanagerAdminEnv.equals(rhs.yarnNodemanagerAdminEnv))))&&((this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks == rhs.yarnNodemanagerDiskHealthCheckerMinHealthyDisks)||((this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks!= null)&&this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks.equals(rhs.yarnNodemanagerDiskHealthCheckerMinHealthyDisks))))&&((this.yarnResourcemanagerFsStateStoreUri == rhs.yarnResourcemanagerFsStateStoreUri)||((this.yarnResourcemanagerFsStateStoreUri!= null)&&this.yarnResourcemanagerFsStateStoreUri.equals(rhs.yarnResourcemanagerFsStateStoreUri))))&&((this.serviceCheckQueueName == rhs.serviceCheckQueueName)||((this.serviceCheckQueueName!= null)&&this.serviceCheckQueueName.equals(rhs.serviceCheckQueueName))))&&((this.hbaseLogMaxbackupindex == rhs.hbaseLogMaxbackupindex)||((this.hbaseLogMaxbackupindex!= null)&&this.hbaseLogMaxbackupindex.equals(rhs.hbaseLogMaxbackupindex))))&&((this.yarnNodemanagerRecoveryEnabled == rhs.yarnNodemanagerRecoveryEnabled)||((this.yarnNodemanagerRecoveryEnabled!= null)&&this.yarnNodemanagerRecoveryEnabled.equals(rhs.yarnNodemanagerRecoveryEnabled))))&&((this.yarnHbaseRegionserverMemory == rhs.yarnHbaseRegionserverMemory)||((this.yarnHbaseRegionserverMemory!= null)&&this.yarnHbaseRegionserverMemory.equals(rhs.yarnHbaseRegionserverMemory))))&&((this.yarnTimelineServiceEnabled == rhs.yarnTimelineServiceEnabled)||((this.yarnTimelineServiceEnabled!= null)&&this.yarnTimelineServiceEnabled.equals(rhs.yarnTimelineServiceEnabled))))&&((this.hbaseRpcProtection == rhs.hbaseRpcProtection)||((this.hbaseRpcProtection!= null)&&this.hbaseRpcProtection.equals(rhs.hbaseRpcProtection))))&&((this.yarnRmSummaryLogNumberOfBackupFiles == rhs.yarnRmSummaryLogNumberOfBackupFiles)||((this.yarnRmSummaryLogNumberOfBackupFiles!= null)&&this.yarnRmSummaryLogNumberOfBackupFiles.equals(rhs.yarnRmSummaryLogNumberOfBackupFiles))))&&((this.dockerBinary == rhs.dockerBinary)||((this.dockerBinary!= null)&&this.dockerBinary.equals(rhs.dockerBinary))))&&((this.yarnNodemanagerResourceCpuVcores == rhs.yarnNodemanagerResourceCpuVcores)||((this.yarnNodemanagerResourceCpuVcores!= null)&&this.yarnNodemanagerResourceCpuVcores.equals(rhs.yarnNodemanagerResourceCpuVcores))))&&((this.yarnTimelineServiceVersions == rhs.yarnTimelineServiceVersions)||((this.yarnTimelineServiceVersions!= null)&&this.yarnTimelineServiceVersions.equals(rhs.yarnTimelineServiceVersions))))&&((this.yarnSchedulerCapacityRootSparkCapacity == rhs.yarnSchedulerCapacityRootSparkCapacity)||((this.yarnSchedulerCapacityRootSparkCapacity!= null)&&this.yarnSchedulerCapacityRootSparkCapacity.equals(rhs.yarnSchedulerCapacityRootSparkCapacity))))&&((this.yarnSchedulerCapacityRootDefaultAclSubmitApplications == rhs.yarnSchedulerCapacityRootDefaultAclSubmitApplications)||((this.yarnSchedulerCapacityRootDefaultAclSubmitApplications!= null)&&this.yarnSchedulerCapacityRootDefaultAclSubmitApplications.equals(rhs.yarnSchedulerCapacityRootDefaultAclSubmitApplications))))&&((this.hadoopRegistryDnsZoneMask == rhs.hadoopRegistryDnsZoneMask)||((this.hadoopRegistryDnsZoneMask!= null)&&this.hadoopRegistryDnsZoneMask.equals(rhs.hadoopRegistryDnsZoneMask))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.dockerPrivilegedContainersEnabled == rhs.dockerPrivilegedContainersEnabled)||((this.dockerPrivilegedContainersEnabled!= null)&&this.dockerPrivilegedContainersEnabled.equals(rhs.dockerPrivilegedContainersEnabled))))&&((this.zookeeperSessionTimeout == rhs.zookeeperSessionTimeout)||((this.zookeeperSessionTimeout!= null)&&this.zookeeperSessionTimeout.equals(rhs.zookeeperSessionTimeout))))&&((this.dockerModuleEnabled == rhs.dockerModuleEnabled)||((this.dockerModuleEnabled!= null)&&this.dockerModuleEnabled.equals(rhs.dockerModuleEnabled))))&&((this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor == rhs.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor)||((this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor!= null)&&this.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor.equals(rhs.yarnResourcemanagerMonitorCapacityPreemptionNaturalTerminationFactor))))&&((this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound == rhs.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound)||((this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound!= null)&&this.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound.equals(rhs.yarnResourcemanagerMonitorCapacityPreemptionTotalPreemptionPerRound))))&&((this.yarnNodemanagerLogAggregationDebugEnabled == rhs.yarnNodemanagerLogAggregationDebugEnabled)||((this.yarnNodemanagerLogAggregationDebugEnabled!= null)&&this.yarnNodemanagerLogAggregationDebugEnabled.equals(rhs.yarnNodemanagerLogAggregationDebugEnabled))))&&((this.yarnResourceTypes == rhs.yarnResourceTypes)||((this.yarnResourceTypes!= null)&&this.yarnResourceTypes.equals(rhs.yarnResourceTypes))))&&((this.hbaseDefaultsForVersionSkip == rhs.hbaseDefaultsForVersionSkip)||((this.hbaseDefaultsForVersionSkip!= null)&&this.hbaseDefaultsForVersionSkip.equals(rhs.hbaseDefaultsForVersionSkip))))&&((this.yarnWebappApiServiceEnable == rhs.yarnWebappApiServiceEnable)||((this.yarnWebappApiServiceEnable!= null)&&this.yarnWebappApiServiceEnable.equals(rhs.yarnWebappApiServiceEnable))))&&((this.hbaseCoprocessorRegionserverClasses == rhs.hbaseCoprocessorRegionserverClasses)||((this.hbaseCoprocessorRegionserverClasses!= null)&&this.hbaseCoprocessorRegionserverClasses.equals(rhs.hbaseCoprocessorRegionserverClasses))))&&((this.yarnSchedulerCapacityMaximumAmResourcePercent == rhs.yarnSchedulerCapacityMaximumAmResourcePercent)||((this.yarnSchedulerCapacityMaximumAmResourcePercent!= null)&&this.yarnSchedulerCapacityMaximumAmResourcePercent.equals(rhs.yarnSchedulerCapacityMaximumAmResourcePercent))))&&((this.yarnNodemanagerDeleteDebugDelaySec == rhs.yarnNodemanagerDeleteDebugDelaySec)||((this.yarnNodemanagerDeleteDebugDelaySec!= null)&&this.yarnNodemanagerDeleteDebugDelaySec.equals(rhs.yarnNodemanagerDeleteDebugDelaySec))))&&((this.securityMasterregionProtocolAcl == rhs.securityMasterregionProtocolAcl)||((this.securityMasterregionProtocolAcl!= null)&&this.securityMasterregionProtocolAcl.equals(rhs.securityMasterregionProtocolAcl))))&&((this.yarnNodemanagerLogDirs == rhs.yarnNodemanagerLogDirs)||((this.yarnNodemanagerLogDirs!= null)&&this.yarnNodemanagerLogDirs.equals(rhs.yarnNodemanagerLogDirs))))&&((this.zookeeperZnodeParent == rhs.zookeeperZnodeParent)||((this.zookeeperZnodeParent!= null)&&this.zookeeperZnodeParent.equals(rhs.zookeeperZnodeParent))))&&((this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers == rhs.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers)||((this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers!= null)&&this.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers.equals(rhs.yarnNodemanagerLinuxContainerExecutorNonsecureModeLimitUsers))))&&((this.yarnHbaseSystemServiceQueueName == rhs.yarnHbaseSystemServiceQueueName)||((this.yarnHbaseSystemServiceQueueName!= null)&&this.yarnHbaseSystemServiceQueueName.equals(rhs.yarnHbaseSystemServiceQueueName))))&&((this.hbaseHregionMemstoreBlockMultiplier == rhs.hbaseHregionMemstoreBlockMultiplier)||((this.hbaseHregionMemstoreBlockMultiplier!= null)&&this.hbaseHregionMemstoreBlockMultiplier.equals(rhs.hbaseHregionMemstoreBlockMultiplier))))&&((this.yarnTimelineServiceClientMaxRetries == rhs.yarnTimelineServiceClientMaxRetries)||((this.yarnTimelineServiceClientMaxRetries!= null)&&this.yarnTimelineServiceClientMaxRetries.equals(rhs.yarnTimelineServiceClientMaxRetries))))&&((this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs == rhs.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs)||((this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs!= null)&&this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs.equals(rhs.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs))))&&((this.registryDnsBindPort == rhs.registryDnsBindPort)||((this.registryDnsBindPort!= null)&&this.registryDnsBindPort.equals(rhs.registryDnsBindPort))))&&((this.yarnRmSummaryLogMaxBackupSize == rhs.yarnRmSummaryLogMaxBackupSize)||((this.yarnRmSummaryLogMaxBackupSize!= null)&&this.yarnRmSummaryLogMaxBackupSize.equals(rhs.yarnRmSummaryLogMaxBackupSize))))&&((this.yarnResourcemanagerSchedulerAddress == rhs.yarnResourcemanagerSchedulerAddress)||((this.yarnResourcemanagerSchedulerAddress!= null)&&this.yarnResourcemanagerSchedulerAddress.equals(rhs.yarnResourcemanagerSchedulerAddress))))&&((this.yarnNodemanagerContainerMonitorIntervalMs == rhs.yarnNodemanagerContainerMonitorIntervalMs)||((this.yarnNodemanagerContainerMonitorIntervalMs!= null)&&this.yarnNodemanagerContainerMonitorIntervalMs.equals(rhs.yarnNodemanagerContainerMonitorIntervalMs))))&&((this.hbaseBucketcacheIoengine == rhs.hbaseBucketcacheIoengine)||((this.hbaseBucketcacheIoengine!= null)&&this.hbaseBucketcacheIoengine.equals(rhs.hbaseBucketcacheIoengine))))&&((this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath == rhs.yarnNodemanagerAuxServicesSpark2ShuffleClasspath)||((this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath!= null)&&this.yarnNodemanagerAuxServicesSpark2ShuffleClasspath.equals(rhs.yarnNodemanagerAuxServicesSpark2ShuffleClasspath))))&&((this.yarnNodemanagerLogRetainSeconds == rhs.yarnNodemanagerLogRetainSeconds)||((this.yarnNodemanagerLogRetainSeconds!= null)&&this.yarnNodemanagerLogRetainSeconds.equals(rhs.yarnNodemanagerLogRetainSeconds))))&&((this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent == rhs.yarnSchedulerCapacityDefaultMinimumUserLimitPercent)||((this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent!= null)&&this.yarnSchedulerCapacityDefaultMinimumUserLimitPercent.equals(rhs.yarnSchedulerCapacityDefaultMinimumUserLimitPercent))))&&((this.cgroupRoot == rhs.cgroupRoot)||((this.cgroupRoot!= null)&&this.cgroupRoot.equals(rhs.cgroupRoot))))&&((this.hbaseRpcTimeout == rhs.hbaseRpcTimeout)||((this.hbaseRpcTimeout!= null)&&this.hbaseRpcTimeout.equals(rhs.hbaseRpcTimeout))))&&((this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb == rhs.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb)||((this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb!= null)&&this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb.equals(rhs.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb))))&&((this.yarnResourcemanagerWebappHttpsAddress == rhs.yarnResourcemanagerWebappHttpsAddress)||((this.yarnResourcemanagerWebappHttpsAddress!= null)&&this.yarnResourcemanagerWebappHttpsAddress.equals(rhs.yarnResourcemanagerWebappHttpsAddress))))&&((this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices == rhs.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices)||((this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices!= null)&&this.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices.equals(rhs.yarnNodemanagerResourcePluginsGpuAllowedGpuDevices))))&&((this.yarnSystemMetricspublisherEnabled == rhs.yarnSystemMetricspublisherEnabled)||((this.yarnSystemMetricspublisherEnabled!= null)&&this.yarnSystemMetricspublisherEnabled.equals(rhs.yarnSystemMetricspublisherEnabled))))&&((this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage == rhs.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage)||((this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage!= null)&&this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage.equals(rhs.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage))))&&((this.yarnNodeLabelsEnabled == rhs.yarnNodeLabelsEnabled)||((this.yarnNodeLabelsEnabled!= null)&&this.yarnNodeLabelsEnabled.equals(rhs.yarnNodeLabelsEnabled))))&&((this.yarnResourcemanagerZkNumRetries == rhs.yarnResourcemanagerZkNumRetries)||((this.yarnResourcemanagerZkNumRetries!= null)&&this.yarnResourcemanagerZkNumRetries.equals(rhs.yarnResourcemanagerZkNumRetries))))&&((this.hbaseLogMaxfilesize == rhs.hbaseLogMaxfilesize)||((this.hbaseLogMaxfilesize!= null)&&this.hbaseLogMaxfilesize.equals(rhs.hbaseLogMaxfilesize))))&&((this.yarnNodemanagerBindHost == rhs.yarnNodemanagerBindHost)||((this.yarnNodemanagerBindHost!= null)&&this.yarnNodemanagerBindHost.equals(rhs.yarnNodemanagerBindHost))))&&((this.yarnTimelineServiceStateStoreClass == rhs.yarnTimelineServiceStateStoreClass)||((this.yarnTimelineServiceStateStoreClass!= null)&&this.yarnTimelineServiceStateStoreClass.equals(rhs.yarnTimelineServiceStateStoreClass))))&&((this.yarnResourcemanagerZkTimeoutMs == rhs.yarnResourcemanagerZkTimeoutMs)||((this.yarnResourcemanagerZkTimeoutMs!= null)&&this.yarnResourcemanagerZkTimeoutMs.equals(rhs.yarnResourcemanagerZkTimeoutMs))))&&((this.yarnHbaseMasterMemory == rhs.yarnHbaseMasterMemory)||((this.yarnHbaseMasterMemory!= null)&&this.yarnHbaseMasterMemory.equals(rhs.yarnHbaseMasterMemory))))&&((this.hbaseBucketcachePercentageInCombinedcache == rhs.hbaseBucketcachePercentageInCombinedcache)||((this.hbaseBucketcachePercentageInCombinedcache!= null)&&this.hbaseBucketcachePercentageInCombinedcache.equals(rhs.hbaseBucketcachePercentageInCombinedcache))))&&((this.yarnSchedulerCapacityRootDefaultAclAdministerJobs == rhs.yarnSchedulerCapacityRootDefaultAclAdministerJobs)||((this.yarnSchedulerCapacityRootDefaultAclAdministerJobs!= null)&&this.yarnSchedulerCapacityRootDefaultAclAdministerJobs.equals(rhs.yarnSchedulerCapacityRootDefaultAclAdministerJobs))))&&((this.yarnNodemanagerAuxServicesMapreduceShuffleClass == rhs.yarnNodemanagerAuxServicesMapreduceShuffleClass)||((this.yarnNodemanagerAuxServicesMapreduceShuffleClass!= null)&&this.yarnNodemanagerAuxServicesMapreduceShuffleClass.equals(rhs.yarnNodemanagerAuxServicesMapreduceShuffleClass))))&&((this.yarnResourcemanagerAmMaxAttempts == rhs.yarnResourcemanagerAmMaxAttempts)||((this.yarnResourcemanagerAmMaxAttempts!= null)&&this.yarnResourcemanagerAmMaxAttempts.equals(rhs.yarnResourcemanagerAmMaxAttempts))))&&((this.yarnServiceFrameworkPath == rhs.yarnServiceFrameworkPath)||((this.yarnServiceFrameworkPath!= null)&&this.yarnServiceFrameworkPath.equals(rhs.yarnServiceFrameworkPath))))&&((this.hbaseHregionMemstoreFlushSize == rhs.hbaseHregionMemstoreFlushSize)||((this.hbaseHregionMemstoreFlushSize!= null)&&this.hbaseHregionMemstoreFlushSize.equals(rhs.hbaseHregionMemstoreFlushSize))))&&((this.yarnNodemanagerRuntimeLinuxDockerCapabilities == rhs.yarnNodemanagerRuntimeLinuxDockerCapabilities)||((this.yarnNodemanagerRuntimeLinuxDockerCapabilities!= null)&&this.yarnNodemanagerRuntimeLinuxDockerCapabilities.equals(rhs.yarnNodemanagerRuntimeLinuxDockerCapabilities))))&&((this.yarnResourcemanagerPlacementConstraintsHandler == rhs.yarnResourcemanagerPlacementConstraintsHandler)||((this.yarnResourcemanagerPlacementConstraintsHandler!= null)&&this.yarnResourcemanagerPlacementConstraintsHandler.equals(rhs.yarnResourcemanagerPlacementConstraintsHandler))))&&((this.yarnNodemanagerResourcePercentagePhysicalCpuLimit == rhs.yarnNodemanagerResourcePercentagePhysicalCpuLimit)||((this.yarnNodemanagerResourcePercentagePhysicalCpuLimit!= null)&&this.yarnNodemanagerResourcePercentagePhysicalCpuLimit.equals(rhs.yarnNodemanagerResourcePercentagePhysicalCpuLimit))))&&((this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs == rhs.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs)||((this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs!= null)&&this.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs.equals(rhs.yarnSchedulerCapacityScheduleAsynchronouslySchedulingIntervalMs))))&&((this.yarnNodemanagerVmemCheckEnabled == rhs.yarnNodemanagerVmemCheckEnabled)||((this.yarnNodemanagerVmemCheckEnabled!= null)&&this.yarnNodemanagerVmemCheckEnabled.equals(rhs.yarnNodemanagerVmemCheckEnabled))))&&((this.yarnHbaseClientMemory == rhs.yarnHbaseClientMemory)||((this.yarnHbaseClientMemory!= null)&&this.yarnHbaseClientMemory.equals(rhs.yarnHbaseClientMemory))))&&((this.yarnSchedulerCapacityMaximumApplications == rhs.yarnSchedulerCapacityMaximumApplications)||((this.yarnSchedulerCapacityMaximumApplications!= null)&&this.yarnSchedulerCapacityMaximumApplications.equals(rhs.yarnSchedulerCapacityMaximumApplications))))&&((this.yarnSchedulerMinimumAllocationVcores == rhs.yarnSchedulerMinimumAllocationVcores)||((this.yarnSchedulerMinimumAllocationVcores!= null)&&this.yarnSchedulerMinimumAllocationVcores.equals(rhs.yarnSchedulerMinimumAllocationVcores))))&&((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath == rhs.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath)||((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath!= null)&&this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath.equals(rhs.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasspath))))&&((this.yarnNodemanagerAuxServicesTimelineCollectorClass == rhs.yarnNodemanagerAuxServicesTimelineCollectorClass)||((this.yarnNodemanagerAuxServicesTimelineCollectorClass!= null)&&this.yarnNodemanagerAuxServicesTimelineCollectorClass.equals(rhs.yarnNodemanagerAuxServicesTimelineCollectorClass))))&&((this.yarnNodemanagerWebappCrossOriginEnabled == rhs.yarnNodemanagerWebappCrossOriginEnabled)||((this.yarnNodemanagerWebappCrossOriginEnabled!= null)&&this.yarnNodemanagerWebappCrossOriginEnabled.equals(rhs.yarnNodemanagerWebappCrossOriginEnabled))))&&((this.yarnResourcemanagerDisplayPerUserApps == rhs.yarnResourcemanagerDisplayPerUserApps)||((this.yarnResourcemanagerDisplayPerUserApps!= null)&&this.yarnResourcemanagerDisplayPerUserApps.equals(rhs.yarnResourcemanagerDisplayPerUserApps))))&&((this.hbaseZookeeperUseMulti == rhs.hbaseZookeeperUseMulti)||((this.hbaseZookeeperUseMulti!= null)&&this.hbaseZookeeperUseMulti.equals(rhs.hbaseZookeeperUseMulti))))&&((this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize == rhs.yarnTimelineServiceEntityGroupFsStoreAppCacheSize)||((this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize!= null)&&this.yarnTimelineServiceEntityGroupFsStoreAppCacheSize.equals(rhs.yarnTimelineServiceEntityGroupFsStoreAppCacheSize))))&&((this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds == rhs.yarnTimelineServiceEntityGroupFsStoreRetainSeconds)||((this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds!= null)&&this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds.equals(rhs.yarnTimelineServiceEntityGroupFsStoreRetainSeconds))))&&((this.yarnSchedulerMaximumAllocationVcores == rhs.yarnSchedulerMaximumAllocationVcores)||((this.yarnSchedulerMaximumAllocationVcores!= null)&&this.yarnSchedulerMaximumAllocationVcores.equals(rhs.yarnSchedulerMaximumAllocationVcores))))&&((this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds == rhs.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds)||((this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds!= null)&&this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds.equals(rhs.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds))))&&((this.yarnUserNprocLimit == rhs.yarnUserNprocLimit)||((this.yarnUserNprocLimit!= null)&&this.yarnUserNprocLimit.equals(rhs.yarnUserNprocLimit))))&&((this.hadoopRegistryDnsEnabled == rhs.hadoopRegistryDnsEnabled)||((this.hadoopRegistryDnsEnabled!= null)&&this.hadoopRegistryDnsEnabled.equals(rhs.hadoopRegistryDnsEnabled))))&&((this.hbaseJavaIoTmpdir == rhs.hbaseJavaIoTmpdir)||((this.hbaseJavaIoTmpdir!= null)&&this.hbaseJavaIoTmpdir.equals(rhs.hbaseJavaIoTmpdir))))&&((this.yarnTimelineServiceTtlMs == rhs.yarnTimelineServiceTtlMs)||((this.yarnTimelineServiceTtlMs!= null)&&this.yarnTimelineServiceTtlMs.equals(rhs.yarnTimelineServiceTtlMs))))&&((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses == rhs.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses)||((this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses!= null)&&this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses.equals(rhs.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses))))&&((this.yarnSchedulerCapacityRootDefaultUserLimitFactor == rhs.yarnSchedulerCapacityRootDefaultUserLimitFactor)||((this.yarnSchedulerCapacityRootDefaultUserLimitFactor!= null)&&this.yarnSchedulerCapacityRootDefaultUserLimitFactor.equals(rhs.yarnSchedulerCapacityRootDefaultUserLimitFactor))))&&((this.yarnResourcemanagerZkRetryIntervalMs == rhs.yarnResourcemanagerZkRetryIntervalMs)||((this.yarnResourcemanagerZkRetryIntervalMs!= null)&&this.yarnResourcemanagerZkRetryIntervalMs.equals(rhs.yarnResourcemanagerZkRetryIntervalMs))))&&((this.hbaseMasterInfoPort == rhs.hbaseMasterInfoPort)||((this.hbaseMasterInfoPort!= null)&&this.hbaseMasterInfoPort.equals(rhs.hbaseMasterInfoPort))))&&((this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork == rhs.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork)||((this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork!= null)&&this.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork.equals(rhs.yarnNodemanagerRuntimeLinuxDockerDefaultContainerNetwork))))&&((this.hbaseClientScannerCaching == rhs.hbaseClientScannerCaching)||((this.hbaseClientScannerCaching!= null)&&this.hbaseClientScannerCaching.equals(rhs.hbaseClientScannerCaching))))&&((this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo == rhs.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo)||((this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo!= null)&&this.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo.equals(rhs.yarnTimelineServiceGenericApplicationHistorySaveNonAmContainerMetaInfo))))&&((this.yarnHbasePidDirPrefix == rhs.yarnHbasePidDirPrefix)||((this.yarnHbasePidDirPrefix!= null)&&this.yarnHbasePidDirPrefix.equals(rhs.yarnHbasePidDirPrefix))))&&((this.yarnTimelineServiceClientRetryIntervalMs == rhs.yarnTimelineServiceClientRetryIntervalMs)||((this.yarnTimelineServiceClientRetryIntervalMs!= null)&&this.yarnTimelineServiceClientRetryIntervalMs.equals(rhs.yarnTimelineServiceClientRetryIntervalMs))))&&((this.yarnResourcemanagerSchedulerClass == rhs.yarnResourcemanagerSchedulerClass)||((this.yarnResourcemanagerSchedulerClass!= null)&&this.yarnResourcemanagerSchedulerClass.equals(rhs.yarnResourcemanagerSchedulerClass))))&&((this.yarnNodemanagerRemoteAppLogDir == rhs.yarnNodemanagerRemoteAppLogDir)||((this.yarnNodemanagerRemoteAppLogDir!= null)&&this.yarnNodemanagerRemoteAppLogDir.equals(rhs.yarnNodemanagerRemoteAppLogDir))))&&((this.yarnTimelineServiceEntityGroupFsStoreActiveDir == rhs.yarnTimelineServiceEntityGroupFsStoreActiveDir)||((this.yarnTimelineServiceEntityGroupFsStoreActiveDir!= null)&&this.yarnTimelineServiceEntityGroupFsStoreActiveDir.equals(rhs.yarnTimelineServiceEntityGroupFsStoreActiveDir))))&&((this.yarnNodemanagerHealthCheckerScriptTimeoutMs == rhs.yarnNodemanagerHealthCheckerScriptTimeoutMs)||((this.yarnNodemanagerHealthCheckerScriptTimeoutMs!= null)&&this.yarnNodemanagerHealthCheckerScriptTimeoutMs.equals(rhs.yarnNodemanagerHealthCheckerScriptTimeoutMs))))&&((this.hbaseCoprocessorMasterClasses == rhs.hbaseCoprocessorMasterClasses)||((this.hbaseCoprocessorMasterClasses!= null)&&this.hbaseCoprocessorMasterClasses.equals(rhs.hbaseCoprocessorMasterClasses))))&&((this.hbaseRootdir == rhs.hbaseRootdir)||((this.hbaseRootdir!= null)&&this.hbaseRootdir.equals(rhs.hbaseRootdir))))&&((this.yarnTimelineServiceStoreClass == rhs.yarnTimelineServiceStoreClass)||((this.yarnTimelineServiceStoreClass!= null)&&this.yarnTimelineServiceStoreClass.equals(rhs.yarnTimelineServiceStoreClass))))&&((this.yarnResourcemanagerResourceTrackerAddress == rhs.yarnResourcemanagerResourceTrackerAddress)||((this.yarnResourcemanagerResourceTrackerAddress!= null)&&this.yarnResourcemanagerResourceTrackerAddress.equals(rhs.yarnResourcemanagerResourceTrackerAddress))))&&((this.yarnTimelineServiceEntityGroupFsStoreDoneDir == rhs.yarnTimelineServiceEntityGroupFsStoreDoneDir)||((this.yarnTimelineServiceEntityGroupFsStoreDoneDir!= null)&&this.yarnTimelineServiceEntityGroupFsStoreDoneDir.equals(rhs.yarnTimelineServiceEntityGroupFsStoreDoneDir))))&&((this.yarnResourcemanagerConnectMaxWaitMs == rhs.yarnResourcemanagerConnectMaxWaitMs)||((this.yarnResourcemanagerConnectMaxWaitMs!= null)&&this.yarnResourcemanagerConnectMaxWaitMs.equals(rhs.yarnResourcemanagerConnectMaxWaitMs))))&&((this.yarnWebappUi2Enable == rhs.yarnWebappUi2Enable)||((this.yarnWebappUi2Enable!= null)&&this.yarnWebappUi2Enable.equals(rhs.yarnWebappUi2Enable))))&&((this.yarnResourceTypesYarnIoGpuMaximumAllocation == rhs.yarnResourceTypesYarnIoGpuMaximumAllocation)||((this.yarnResourceTypesYarnIoGpuMaximumAllocation!= null)&&this.yarnResourceTypesYarnIoGpuMaximumAllocation.equals(rhs.yarnResourceTypesYarnIoGpuMaximumAllocation))))&&((this.yarnTimelineServiceHbaseConfigurationFile == rhs.yarnTimelineServiceHbaseConfigurationFile)||((this.yarnTimelineServiceHbaseConfigurationFile!= null)&&this.yarnTimelineServiceHbaseConfigurationFile.equals(rhs.yarnTimelineServiceHbaseConfigurationFile))))&&((this.yarnResourcemanagerHaEnabled == rhs.yarnResourcemanagerHaEnabled)||((this.yarnResourcemanagerHaEnabled!= null)&&this.yarnResourcemanagerHaEnabled.equals(rhs.yarnResourcemanagerHaEnabled))))&&((this.yarnLogAggregationEnable == rhs.yarnLogAggregationEnable)||((this.yarnLogAggregationEnable!= null)&&this.yarnLogAggregationEnable.equals(rhs.yarnLogAggregationEnable))))&&((this.hbaseSuperuser == rhs.hbaseSuperuser)||((this.hbaseSuperuser!= null)&&this.hbaseSuperuser.equals(rhs.hbaseSuperuser))))&&((this.hadoopRegistryDnsBindPort == rhs.hadoopRegistryDnsBindPort)||((this.hadoopRegistryDnsBindPort!= null)&&this.hadoopRegistryDnsBindPort.equals(rhs.hadoopRegistryDnsBindPort))))&&((this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled == rhs.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled)||((this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled!= null)&&this.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled.equals(rhs.yarnResourcemanagerMonitorCapacityPreemptionIntraQueuePreemptionEnabled))))&&((this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize == rhs.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize)||((this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize!= null)&&this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize.equals(rhs.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize))))&&((this.yarnResourcemanagerZkStateStoreParentPath == rhs.yarnResourcemanagerZkStateStoreParentPath)||((this.yarnResourcemanagerZkStateStoreParentPath!= null)&&this.yarnResourcemanagerZkStateStoreParentPath.equals(rhs.yarnResourcemanagerZkStateStoreParentPath))))&&((this.yarnSchedulerCapacityRootDefaultMaximumCapacity == rhs.yarnSchedulerCapacityRootDefaultMaximumCapacity)||((this.yarnSchedulerCapacityRootDefaultMaximumCapacity!= null)&&this.yarnSchedulerCapacityRootDefaultMaximumCapacity.equals(rhs.yarnSchedulerCapacityRootDefaultMaximumCapacity))))&&((this.yarnNodemanagerLogAggregationNumLogFilesPerApp == rhs.yarnNodemanagerLogAggregationNumLogFilesPerApp)||((this.yarnNodemanagerLogAggregationNumLogFilesPerApp!= null)&&this.yarnNodemanagerLogAggregationNumLogFilesPerApp.equals(rhs.yarnNodemanagerLogAggregationNumLogFilesPerApp))))&&((this.dockerAllowedDevices == rhs.dockerAllowedDevices)||((this.dockerAllowedDevices!= null)&&this.dockerAllowedDevices.equals(rhs.dockerAllowedDevices))))&&((this.yarnNodemanagerVmemPmemRatio == rhs.yarnNodemanagerVmemPmemRatio)||((this.yarnNodemanagerVmemPmemRatio!= null)&&this.yarnNodemanagerVmemPmemRatio.equals(rhs.yarnNodemanagerVmemPmemRatio))))&&((this.yarnResourcemanagerZkAddress == rhs.yarnResourcemanagerZkAddress)||((this.yarnResourcemanagerZkAddress!= null)&&this.yarnResourcemanagerZkAddress.equals(rhs.yarnResourcemanagerZkAddress))))&&((this.yarnRmSystemMetricspublisherEmitContainerEvents == rhs.yarnRmSystemMetricspublisherEmitContainerEvents)||((this.yarnRmSystemMetricspublisherEmitContainerEvents!= null)&&this.yarnRmSystemMetricspublisherEmitContainerEvents.equals(rhs.yarnRmSystemMetricspublisherEmitContainerEvents))))&&((this.dockerAllowedRoMounts == rhs.dockerAllowedRoMounts)||((this.dockerAllowedRoMounts!= null)&&this.dockerAllowedRoMounts.equals(rhs.dockerAllowedRoMounts))))&&((this.yarnNodemanagerAuxServices == rhs.yarnNodemanagerAuxServices)||((this.yarnNodemanagerAuxServices!= null)&&this.yarnNodemanagerAuxServices.equals(rhs.yarnNodemanagerAuxServices))))&&((this.yarnNodemanagerRecoveryDir == rhs.yarnNodemanagerRecoveryDir)||((this.yarnNodemanagerRecoveryDir!= null)&&this.yarnNodemanagerRecoveryDir.equals(rhs.yarnNodemanagerRecoveryDir))))&&((this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables == rhs.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables)||((this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables!= null)&&this.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables.equals(rhs.yarnNodemanagerResourcePluginsGpuPathToDiscoveryExecutables))))&&((this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled == rhs.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled)||((this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled!= null)&&this.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled.equals(rhs.yarnSchedulerCapacityOrderingPolicyPriorityUtilizationUnderutilizedPreemptionEnabled))))&&((this.yarnTimelineServiceHttpCrossOriginEnabled == rhs.yarnTimelineServiceHttpCrossOriginEnabled)||((this.yarnTimelineServiceHttpCrossOriginEnabled!= null)&&this.yarnTimelineServiceHttpCrossOriginEnabled.equals(rhs.yarnTimelineServiceHttpCrossOriginEnabled))))&&((this.hbaseCoprocessorRegionClasses == rhs.hbaseCoprocessorRegionClasses)||((this.hbaseCoprocessorRegionClasses!= null)&&this.hbaseCoprocessorRegionClasses.equals(rhs.hbaseCoprocessorRegionClasses))))&&((this.hbaseClientKeyvalueMaxsize == rhs.hbaseClientKeyvalueMaxsize)||((this.hbaseClientKeyvalueMaxsize!= null)&&this.hbaseClientKeyvalueMaxsize.equals(rhs.hbaseClientKeyvalueMaxsize))))&&((this.yarnTimelineServiceRecoveryEnabled == rhs.yarnTimelineServiceRecoveryEnabled)||((this.yarnTimelineServiceRecoveryEnabled!= null)&&this.yarnTimelineServiceRecoveryEnabled.equals(rhs.yarnTimelineServiceRecoveryEnabled))))&&((this.yarnSchedulerMaximumAllocationMb == rhs.yarnSchedulerMaximumAllocationMb)||((this.yarnSchedulerMaximumAllocationMb!= null)&&this.yarnSchedulerMaximumAllocationMb.equals(rhs.yarnSchedulerMaximumAllocationMb))))&&((this.dfsDomainSocketPath == rhs.dfsDomainSocketPath)||((this.dfsDomainSocketPath!= null)&&this.dfsDomainSocketPath.equals(rhs.dfsDomainSocketPath))))&&((this.yarnTimelineServiceWebappAddress == rhs.yarnTimelineServiceWebappAddress)||((this.yarnTimelineServiceWebappAddress!= null)&&this.yarnTimelineServiceWebappAddress.equals(rhs.yarnTimelineServiceWebappAddress))))&&((this.dockerTrustedRegistries == rhs.dockerTrustedRegistries)||((this.dockerTrustedRegistries!= null)&&this.dockerTrustedRegistries.equals(rhs.dockerTrustedRegistries))))&&((this.yarnNodemanagerResourceMemoryMb == rhs.yarnNodemanagerResourceMemoryMb)||((this.yarnNodemanagerResourceMemoryMb!= null)&&this.yarnNodemanagerResourceMemoryMb.equals(rhs.yarnNodemanagerResourceMemoryMb))))&&((this.yarnResourcemanagerRecoveryEnabled == rhs.yarnResourcemanagerRecoveryEnabled)||((this.yarnResourcemanagerRecoveryEnabled!= null)&&this.yarnResourcemanagerRecoveryEnabled.equals(rhs.yarnResourcemanagerRecoveryEnabled))))&&((this.yarnSchedulerCapacityRootAclAdministerQueue == rhs.yarnSchedulerCapacityRootAclAdministerQueue)||((this.yarnSchedulerCapacityRootAclAdministerQueue!= null)&&this.yarnSchedulerCapacityRootAclAdministerQueue.equals(rhs.yarnSchedulerCapacityRootAclAdministerQueue))))&&((this.hfileBlockCacheSize == rhs.hfileBlockCacheSize)||((this.hfileBlockCacheSize!= null)&&this.hfileBlockCacheSize.equals(rhs.hfileBlockCacheSize))))&&((this.gpuModuleEnabled == rhs.gpuModuleEnabled)||((this.gpuModuleEnabled!= null)&&this.gpuModuleEnabled.equals(rhs.gpuModuleEnabled))))&&((this.yarnPidDirPrefix == rhs.yarnPidDirPrefix)||((this.yarnPidDirPrefix!= null)&&this.yarnPidDirPrefix.equals(rhs.yarnPidDirPrefix))))&&((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups == rhs.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups)||((this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups!= null)&&this.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups.equals(rhs.yarnTimelineServiceHttpAuthenticationProxyuserAmbariGroups))))&&((this.yarnResourcemanagerHostname == rhs.yarnResourcemanagerHostname)||((this.yarnResourcemanagerHostname!= null)&&this.yarnResourcemanagerHostname.equals(rhs.yarnResourcemanagerHostname))))&&((this.isHbaseSystemServiceLaunch == rhs.isHbaseSystemServiceLaunch)||((this.isHbaseSystemServiceLaunch!= null)&&this.isHbaseSystemServiceLaunch.equals(rhs.isHbaseSystemServiceLaunch))))&&((this.yarnSchedulerCapacityResourceCalculator == rhs.yarnSchedulerCapacityResourceCalculator)||((this.yarnSchedulerCapacityResourceCalculator!= null)&&this.yarnSchedulerCapacityResourceCalculator.equals(rhs.yarnSchedulerCapacityResourceCalculator))))&&((this.yarnResourcemanagerAddress == rhs.yarnResourcemanagerAddress)||((this.yarnResourcemanagerAddress!= null)&&this.yarnResourcemanagerAddress.equals(rhs.yarnResourcemanagerAddress))))&&((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize == rhs.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize)||((this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize!= null)&&this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize.equals(rhs.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize))))&&((this.minUserId == rhs.minUserId)||((this.minUserId!= null)&&this.minUserId.equals(rhs.minUserId))))&&((this.apptimelineserverHeapsize == rhs.apptimelineserverHeapsize)||((this.apptimelineserverHeapsize!= null)&&this.apptimelineserverHeapsize.equals(rhs.apptimelineserverHeapsize))))&&((this.yarnLogAggregationRetainSeconds == rhs.yarnLogAggregationRetainSeconds)||((this.yarnLogAggregationRetainSeconds!= null)&&this.yarnLogAggregationRetainSeconds.equals(rhs.yarnLogAggregationRetainSeconds))))&&((this.yarnResourcemanagerNodesExcludePath == rhs.yarnResourcemanagerNodesExcludePath)||((this.yarnResourcemanagerNodesExcludePath!= null)&&this.yarnResourcemanagerNodesExcludePath.equals(rhs.yarnResourcemanagerNodesExcludePath))))&&((this.yarnAdminAcl == rhs.yarnAdminAcl)||((this.yarnAdminAcl!= null)&&this.yarnAdminAcl.equals(rhs.yarnAdminAcl))))&&((this.yarnResourcemanagerWebappAddress == rhs.yarnResourcemanagerWebappAddress)||((this.yarnResourcemanagerWebappAddress!= null)&&this.yarnResourcemanagerWebappAddress.equals(rhs.yarnResourcemanagerWebappAddress))))&&((this.hbaseMasterWaitOnRegionserversTimeout == rhs.hbaseMasterWaitOnRegionserversTimeout)||((this.hbaseMasterWaitOnRegionserversTimeout!= null)&&this.hbaseMasterWaitOnRegionserversTimeout.equals(rhs.hbaseMasterWaitOnRegionserversTimeout))))&&((this.yarnTimelineServiceEntityGroupFsStoreSummaryStore == rhs.yarnTimelineServiceEntityGroupFsStoreSummaryStore)||((this.yarnTimelineServiceEntityGroupFsStoreSummaryStore!= null)&&this.yarnTimelineServiceEntityGroupFsStoreSummaryStore.equals(rhs.yarnTimelineServiceEntityGroupFsStoreSummaryStore))))&&((this.hbaseMasterNamespaceInitTimeout == rhs.hbaseMasterNamespaceInitTimeout)||((this.hbaseMasterNamespaceInitTimeout!= null)&&this.hbaseMasterNamespaceInitTimeout.equals(rhs.hbaseMasterNamespaceInitTimeout))))&&((this.yarnTimelineServiceGenericApplicationHistoryStoreClass == rhs.yarnTimelineServiceGenericApplicationHistoryStoreClass)||((this.yarnTimelineServiceGenericApplicationHistoryStoreClass!= null)&&this.yarnTimelineServiceGenericApplicationHistoryStoreClass.equals(rhs.yarnTimelineServiceGenericApplicationHistoryStoreClass))))&&((this.yarnSchedulerCapacityRootSparkUserLimitFactor == rhs.yarnSchedulerCapacityRootSparkUserLimitFactor)||((this.yarnSchedulerCapacityRootSparkUserLimitFactor!= null)&&this.yarnSchedulerCapacityRootSparkUserLimitFactor.equals(rhs.yarnSchedulerCapacityRootSparkUserLimitFactor))))&&((this.securityClientProtocolAcl == rhs.securityClientProtocolAcl)||((this.securityClientProtocolAcl!= null)&&this.securityClientProtocolAcl.equals(rhs.securityClientProtocolAcl))))&&((this.yarnResourcemanagerSchedulerMonitorEnable == rhs.yarnResourcemanagerSchedulerMonitorEnable)||((this.yarnResourcemanagerSchedulerMonitorEnable!= null)&&this.yarnResourcemanagerSchedulerMonitorEnable.equals(rhs.yarnResourcemanagerSchedulerMonitorEnable))))&&((this.yarnNodemanagerContainerMetricsUnregisterDelayMs == rhs.yarnNodemanagerContainerMetricsUnregisterDelayMs)||((this.yarnNodemanagerContainerMetricsUnregisterDelayMs!= null)&&this.yarnNodemanagerContainerMetricsUnregisterDelayMs.equals(rhs.yarnNodemanagerContainerMetricsUnregisterDelayMs))))&&((this.yarnNodemanagerLinuxContainerExecutorGroup == rhs.yarnNodemanagerLinuxContainerExecutorGroup)||((this.yarnNodemanagerLinuxContainerExecutorGroup!= null)&&this.yarnNodemanagerLinuxContainerExecutorGroup.equals(rhs.yarnNodemanagerLinuxContainerExecutorGroup))))&&((this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds == rhs.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds)||((this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds!= null)&&this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds.equals(rhs.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds))))&&((this.hbaseMasterPort == rhs.hbaseMasterPort)||((this.hbaseMasterPort!= null)&&this.hbaseMasterPort.equals(rhs.hbaseMasterPort))))&&((this.hbaseRegionserverGlobalMemstoreSize == rhs.hbaseRegionserverGlobalMemstoreSize)||((this.hbaseRegionserverGlobalMemstoreSize!= null)&&this.hbaseRegionserverGlobalMemstoreSize.equals(rhs.hbaseRegionserverGlobalMemstoreSize))))&&((this.yarnClientNodemanagerConnectMaxWaitMs == rhs.yarnClientNodemanagerConnectMaxWaitMs)||((this.yarnClientNodemanagerConnectMaxWaitMs!= null)&&this.yarnClientNodemanagerConnectMaxWaitMs.equals(rhs.yarnClientNodemanagerConnectMaxWaitMs))))&&((this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval == rhs.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval)||((this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval!= null)&&this.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval.equals(rhs.yarnResourcemanagerMonitorCapacityPreemptionMonitoringInterval))))&&((this.hadoopRegistryDnsZoneSubnet == rhs.hadoopRegistryDnsZoneSubnet)||((this.hadoopRegistryDnsZoneSubnet!= null)&&this.hadoopRegistryDnsZoneSubnet.equals(rhs.hadoopRegistryDnsZoneSubnet))))&&((this.hadoopRegistryZkQuorum == rhs.hadoopRegistryZkQuorum)||((this.hadoopRegistryZkQuorum!= null)&&this.hadoopRegistryZkQuorum.equals(rhs.hadoopRegistryZkQuorum))))&&((this.yarnNodemanagerLocalDirs == rhs.yarnNodemanagerLocalDirs)||((this.yarnNodemanagerLocalDirs!= null)&&this.yarnNodemanagerLocalDirs.equals(rhs.yarnNodemanagerLocalDirs))))&&((this.yarnSchedulerCapacityNodeLocalityDelay == rhs.yarnSchedulerCapacityNodeLocalityDelay)||((this.yarnSchedulerCapacityNodeLocalityDelay!= null)&&this.yarnSchedulerCapacityNodeLocalityDelay.equals(rhs.yarnSchedulerCapacityNodeLocalityDelay))))&&((this.yarnLogServerUrl == rhs.yarnLogServerUrl)||((this.yarnLogServerUrl!= null)&&this.yarnLogServerUrl.equals(rhs.yarnLogServerUrl))))&&((this.yarnTimelineServiceReaderWebappAddress == rhs.yarnTimelineServiceReaderWebappAddress)||((this.yarnTimelineServiceReaderWebappAddress!= null)&&this.yarnTimelineServiceReaderWebappAddress.equals(rhs.yarnTimelineServiceReaderWebappAddress))))&&((this.yarnClientNodemanagerConnectRetryIntervalMs == rhs.yarnClientNodemanagerConnectRetryIntervalMs)||((this.yarnClientNodemanagerConnectRetryIntervalMs!= null)&&this.yarnClientNodemanagerConnectRetryIntervalMs.equals(rhs.yarnClientNodemanagerConnectRetryIntervalMs))))&&((this.yarnTimelineServiceBindHost == rhs.yarnTimelineServiceBindHost)||((this.yarnTimelineServiceBindHost!= null)&&this.yarnTimelineServiceBindHost.equals(rhs.yarnTimelineServiceBindHost))))&&((this.yarnTimelineServiceHbaseSchemaPrefix == rhs.yarnTimelineServiceHbaseSchemaPrefix)||((this.yarnTimelineServiceHbaseSchemaPrefix!= null)&&this.yarnTimelineServiceHbaseSchemaPrefix.equals(rhs.yarnTimelineServiceHbaseSchemaPrefix))))&&((this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs == rhs.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs)||((this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs!= null)&&this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs.equals(rhs.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs))))&&((this.hbaseClusterDistributed == rhs.hbaseClusterDistributed)||((this.hbaseClusterDistributed!= null)&&this.hbaseClusterDistributed.equals(rhs.hbaseClusterDistributed))))&&((this.yarnTimelineServiceTtlEnable == rhs.yarnTimelineServiceTtlEnable)||((this.yarnTimelineServiceTtlEnable!= null)&&this.yarnTimelineServiceTtlEnable.equals(rhs.yarnTimelineServiceTtlEnable))))&&((this.yarnHbaseMasterContainers == rhs.yarnHbaseMasterContainers)||((this.yarnHbaseMasterContainers!= null)&&this.yarnHbaseMasterContainers.equals(rhs.yarnHbaseMasterContainers))))&&((this.yarnResourcemanagerStateStoreMaxCompletedApplications == rhs.yarnResourcemanagerStateStoreMaxCompletedApplications)||((this.yarnResourcemanagerStateStoreMaxCompletedApplications!= null)&&this.yarnResourcemanagerStateStoreMaxCompletedApplications.equals(rhs.yarnResourcemanagerStateStoreMaxCompletedApplications))))&&((this.hbaseHregionMajorcompactionJitter == rhs.hbaseHregionMajorcompactionJitter)||((this.hbaseHregionMajorcompactionJitter!= null)&&this.hbaseHregionMajorcompactionJitter.equals(rhs.hbaseHregionMajorcompactionJitter))))&&((this.hbaseTmpDir == rhs.hbaseTmpDir)||((this.hbaseTmpDir!= null)&&this.hbaseTmpDir.equals(rhs.hbaseTmpDir))))&&((this.yarnNodemanagerResourcePlugins == rhs.yarnNodemanagerResourcePlugins)||((this.yarnNodemanagerResourcePlugins!= null)&&this.yarnNodemanagerResourcePlugins.equals(rhs.yarnNodemanagerResourcePlugins))))&&((this.yarnResourcemanagerAdminAddress == rhs.yarnResourcemanagerAdminAddress)||((this.yarnResourcemanagerAdminAddress!= null)&&this.yarnResourcemanagerAdminAddress.equals(rhs.yarnResourcemanagerAdminAddress))))&&((this.hbaseBucketcacheSize == rhs.hbaseBucketcacheSize)||((this.hbaseBucketcacheSize!= null)&&this.hbaseBucketcacheSize.equals(rhs.hbaseBucketcacheSize))))&&((this.yarnAclEnable == rhs.yarnAclEnable)||((this.yarnAclEnable!= null)&&this.yarnAclEnable.equals(rhs.yarnAclEnable))))&&((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed == rhs.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed)||((this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed!= null)&&this.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed.equals(rhs.yarnNodemanagerRuntimeLinuxDockerPrivilegedContainersAllowed))))&&((this.yarnHbaseSystemServiceLaunchMode == rhs.yarnHbaseSystemServiceLaunchMode)||((this.yarnHbaseSystemServiceLaunchMode!= null)&&this.yarnHbaseSystemServiceLaunchMode.equals(rhs.yarnHbaseSystemServiceLaunchMode))));
    }

}

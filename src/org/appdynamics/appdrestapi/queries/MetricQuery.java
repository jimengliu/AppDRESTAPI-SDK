/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

/**
 *
 * @author soloink
 */
public class MetricQuery {
    protected String baseURL;
    protected String application;

    
    
    public MetricQuery(String baseURL, String application){
        this.baseURL=baseURL;
        this.application=application;
    }
    
    public String queryAgentTierAppAgentAvailability(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeAppAgentAvailability(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeAppAgentAvailability(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeAppAgentAvailability(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierMachineAgentAvailability(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeMachineAgentAvailability( baseURL, application,tier,null,start, end, rollup);
    }
    
    public String queryAgentNodeMachineAgentAvailability(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeMachineAgentAvailability( baseURL, application,tier, node,start, end, rollup);
    }
    
    public String queryTierAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(String tier, 
             long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
        
    }
    
    public String queryNodeAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(String tier, 
            String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentTopSummaryStatsUploadInvalidTopSummaryStats(String tier ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadInvalidTopSummaryStats(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentTopSummaryStatsUploadInvalidTopSummaryStats(String tier, String node ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadInvalidTopSummaryStats(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(String tier ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(String tier, String node ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(String tier, String node , long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentDiscoveredBackendsRegistrationSuccessful(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationSuccessful(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentDiscoveredBackendsRegistrationSuccessful(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationSuccessful(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentDiscoveredBackendsRegistrationFailed(String baseURL, String application,String tier,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationFailed(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentDiscoveredBackendsRegistrationFailed(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationFailed(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentDiscoveredBackendsUnmonitoredCallsPerMinute(String baseURL, String application,String tier,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsUnmonitoredCallsPerMinute(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentDiscoveredBackendsUnmonitoredCallsPerMinute(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsUnmonitoredCallsPerMinute(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentConfigChannelNumberOfApplicationInfrastructureChangeSet(String baseURL, String application,String tier,
            long start, long end, boolean rollup){
        return queryNodeAgentConfigChannelNumberOfApplicationInfrastructureChangeSet(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentConfigChannelNumberOfApplicationInfrastructureChangeSet(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentConfigChannelNumberOfApplicationInfrastructureChangeSet(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryTierAgentSnapshotUploadSnapshotsUploaded(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsUploaded(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryNodeAgentSnapshotUploadSnapshotsUploaded(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsUploaded(baseURL, application, tier, node, start, end, rollup);
    }
    
   public String queryTierAgentSnapshotUploadInvalidSnapshots(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadInvalidSnapshots(baseURL, application, tier, null, start, end, rollup);
   }
    
   public String queryNodeAgentSnapshotUploadInvalidSnapshots(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadInvalidSnapshots(baseURL, application, tier, node, start, end, rollup);
   }
    
   public String queryTierAgentSnapshotUploadTimeSkewErrors(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadTimeSkewErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentSnapshotUploadTimeSkewErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadTimeSkewErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentSnapshotUploadSnapshotsExceedingLimit(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentSnapshotUploadSnapshotsExceedingLimit(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentMetricUploadRequestsLicenseErrors(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsLicenseErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentMetricUploadRequestsLicenseErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsLicenseErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentMetricUploadInvalidMetrics(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadInvalidMetrics(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentMetricUploadInvalidMetrics(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadInvalidMetrics(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentMetricUploadRequestsTimeSkewErrors(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsTimeSkewErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentMetricUploadRequestsTimeSkewErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsTimeSkewErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentMetricUploadMetricsUpload(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadMetricsUpload(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentMetricUploadMetricsUpload(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadMetricsUpload(baseURL, application, tier, node, start, end, rollup);
   }
   
   
   public String queryTierAgentMetricUploadRequestsExceedingLimit(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentMetricUploadRequestsExceedingLimit(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentEventUploadEventsUploaded(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsUploaded(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentEventUploadEventsUploaded(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsUploaded(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentEventUploadEventsExceedingLimit(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentEventUploadEventsExceedingLimit(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentEventUploadTimeSkewsErrors(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadTimeSkewsErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentEventUploadTimeSkewsErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadTimeSkewsErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentBusinessTransactionsUnmonitoredCallsPerMinute(String baseURL, String application,String tier,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsUnmonitoredCallsPerMinute(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentBusinessTransactionsUnmonitoredCallsPerMinute(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsUnmonitoredCallsPerMinute(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentBusinessTransactionsRegistrationFailed(String baseURL, String application,String tier,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationFailed(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentBusinessTransactionsRegistrationFailed(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationFailed(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryTierAgentBusinessTransactionsRegistrationSuccessful(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationSuccessful(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryNodeAgentBusinessTransactionsRegistrationSuccessful(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationSuccessful(baseURL, application, tier, node, start, end, rollup);
   }
   
   
    
    /* ************************* Hardware Resources CPU *******************************  */
    
    public String queryHDTierCPUAll(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUAll(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeCPUAll(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUAll(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryHDTierCPUBusy(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUBusy(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeCPUBusy(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUBusy(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryHDTierCPUIdle(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUIdle(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeCPUIdle(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUIdle(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryHDTierCPUStolen(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUStolen(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeCPUStolen(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeCPUStolen(baseURL, application, tier, node, start, end, rollup);
    }
    
    /* ************************* Hardware Resources Disk *******************************   */
    public String queryHDTierDisksAll(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksAll(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksAll(baseURL, application, tier, null, null, start, end, rollup);
    }
    public String queryHDNodeDisksAll(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksAll(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksAll(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierDisksKBReadPerSec(String tier, String disk, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeDisksKBReadPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    public String queryHDNodeDisksKBReadPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksKBReadPerSec(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksKBReadPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierDisksKBWrittenPerSec(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksKBWrittenPerSec(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHDNodeDisksKBWrittenPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksKBWrittenPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksKBWrittenPerSec(baseURL, application, tier, node,disk,start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksKBWrittenPerSec(baseURL, application, tier, node, null,start, end, rollup);
    }
    
    public String queryHDTierDisksReadPerSec(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksReadPerSec(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksReadPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksReadPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksReadPerSec(baseURL, application, tier, node,disk,start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksReadPerSec(baseURL, application, tier, node,null,start, end, rollup);
    }
    
    public String queryHDTierDisksWritesPerSec(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksWritesPerSec(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksWritesPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksWritesPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksWritesPerSec(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksWritesPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierDisksSpaceUsed(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceUsed(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceUsed(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksSpaceUsed(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceUsed(baseURL, application, tier, node, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceUsed(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    
    public String queryHDTierDisksAvgServiceTimeMS(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksAvgServiceTimeMS(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksAvgServiceTimeMS(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksAvgServiceTimeMS(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksAvgServiceTimeMS(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksAvgServiceTimeMS(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierDisksPerCPUTime(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksPerCPUTime(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHDNodeDisksPerCPUTime(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksPerCPUTime(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksPerCPUTime(baseURL, application, tier, node, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHDNodeDisksPerCPUTime(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierDisksSpaceAvailable(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceAvailable(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceAvailable(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksSpaceAvailable(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceAvailable(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeDisksSpaceAvailable(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierDisksAvgQueueTimeMS(String tier,String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksAvgQueueTimeMS(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHDNodeDisksAvgQueueTimeMS(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeDisksAvgQueueTimeMS(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHDNodeDisksAvgQueueTimeMS(baseURL, application, tier, node, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHDNodeDisksAvgQueueTimeMS(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    /* ************************* Hardware Resources Memory ******************************* */
    public String queryHDTierVolumesAll(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesAll(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesAll(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeVolumesAll(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesAll(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesAll(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierVolumesUsedMB(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedMB(baseURL, application, tier, null, volume, start, end, rollup); 
        return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedMB(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeVolumesUsedMB(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedMB(baseURL, application, tier, node, volume, start, end, rollup); 
        return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedMB(baseURL, application, tier, node, null, start, end, rollup);
    }

    public String queryHDTierVolumesFreeMB(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesFreeMB(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesFreeMB(baseURL, application, tier, null, null, start, end, rollup);
    }    

    public String queryHDNodeVolumesFreeMB(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesFreeMB(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesFreeMB(baseURL, application, tier, node, null, start, end, rollup);
    }

    public String queryHDTierVolumesUsedPer(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedPer(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedPer(baseURL, application, tier, null, null, start, end, rollup);
    }

    public String queryHDNodeVolumesUsedPer(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedPer(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesUsedPer(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierVolumesTotalMB(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesTotalMB(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesTotalMB(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeVolumesTotalMB(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHDNodeVolumesTotalMB(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHDNodeVolumesTotalMB(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    /* ************************* Hardware Resources Memory *******************************   */
    
    public String queryHDTierMemoryAll(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryAll(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeMemoryAll(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHDTierMemoryFreePerc(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryFreePerc(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeMemoryFreePerc(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryFreePerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHDTierMemoryFreeMB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryFreeMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeMemoryFreeMB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryFreeMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHDTierMemoryTotalMB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryTotalMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeMemoryTotalMB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryTotalMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHDTierMemoryUsedPerc(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryUsedPerc(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeMemoryUsedPerc(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryUsedPerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHDTierMemoryUsedMB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryUsedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHDNodeMemoryUsedMB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryUsedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* ************************* Hardware Resources Network *******************************   */
    
    public String queryHDTierNetworkAll(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkAll(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkAll(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkAll(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkIncomingKB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingKB(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkIncomingKB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingKB(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkIncomingKBPerSec(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingKBPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkIncomingKBPerSec(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingKBPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkIncomingPackets(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingPackets(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkIncomingPackets(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingPackets(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkIncomingPacketsPerSec(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingPacketsPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkIncomingPacketsPerSec(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingPacketsPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkOutgoingKB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingKB(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkOutgoingKB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingKB(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkOutgoingKBPerSec(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingKBPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkOutgoingKBPerSec(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingKBPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkOutgoingPackets(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingPackets(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkOutgoingPackets(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingPackets(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHDTierNetworkOutgoingPacketsPerSec(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingPacketsPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHDNodeNetworkOutgoingPacketsPerSec(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingPacketsPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    /* Hardware Resources System */
    public String queryHDTierSystemAll(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDTierSystemAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryHDNodeSystemAll(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeSystemAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHDTierSystemRQ(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDTierSystemRQ(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryHDNodeSystemRQ(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHDNodeSystemRQ(baseURL, application, tier, node,start, end, rollup);
    }
    
    /*  JVM metrics */
    
    public String queryJVMTierProcessCPUAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierProcessCPUAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeProcessCPUAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierProcessCPUBurntMSPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierProcessCPUBurntMSPerMin(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeProcessCPUBurntMSPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUBurntMSPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierProcessCPUUsagePerc(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierProcessCPUUsagePerc(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeProcessCPUUsagePerc(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUUsagePerc(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collections Memory Pools Code Cache*/
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCommittedMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collections Memory Pools PS Eden Space */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* JVM Garbage Collections Memory Pools PS Old Gen */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCommittedMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collection Memory Pools PS Perm Gen */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCommittedMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collections Memory Pools PS Survivor Space */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collections */
    public String queryJVMTierGarbageCollectionAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionGCTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionGCTimeSpentPerMin(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionGCTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* JVM Memory Heap */
    public String queryJVMTierMemoryHeapAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryHeapAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryHeapCommittedMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryHeapCurrentUsageMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryHeapMaxAvailableMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapUsedPerc(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryHeapUsedPerc(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapUsedPerc(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapUsedPerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* JVM Memory Non-Heap */
    public String queryJVMTierMemoryNonHeapAll(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapAll(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapCommittedMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapCurrentUsageMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapMaxAvailableMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapUsedPerc(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapUsedPerc(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapUsedPerc(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapUsedPerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* JVM Threads */
    public String queryJVMTierThreadsCurrentNoOfThreads(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapCurrentUsageMB(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryJVMNodeThreadsCurrentNoOfThreads(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    /*  Overall Application Performance */
    public String queryOAPAppAll(long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppAll(baseURL, application, start, end, rollup);
    }
    
    public String queryOAPTierAll(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryOAPNodeAll(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeAll(baseURL, application, tier, node, start, end, rollup);
    }
    
    //Stall Count
    public String queryOAPAppStallCount(long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppStallCount(baseURL, application, start, end, rollup);
    }
    
    public String queryOAPTierStallCount(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierStallCount(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryOAPNodeStallCount(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeStallCount(baseURL, application, tier, node, start, end, rollup);
    }
    
    //Number of Very Slow Call
    public String queryOAPAppNumberOfVerySlowCalls(long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppNumberOfVerySlowCalls(baseURL, application, start, end, rollup);
    }
    
    public String queryOAPTierNumberOfVerySlowCalls(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierNumberOfVerySlowCalls(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryOAPNodeNumberOfVerySlowCalls(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeStallCount(baseURL, application, tier, node, start, end, rollup);
    }
    //Number of Slow Calls
    public String queryOAPAppNumberOfSlowCalls(long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppNumberOfSlowCalls(baseURL, application, start, end, rollup);
    }
    
    public String queryOAPTierNumberOfSlowCalls(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierNumberOfSlowCalls(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryOAPNodeNumberOfSlowCalls(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeNumberOfSlowCalls(baseURL, application, tier, node, start, end, rollup);
    }
    //Infrastructure Errors per Minute
    public String queryOAPAppInfrastructureErrorsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppInfrastructureErrorsPerMinute(baseURL, application,start, end, rollup);
    }
    
    public  String queryOAPTierInfrastructureErrorsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierInfrastructureErrorsPerMinute(baseURL, application,tier,start, end, rollup);
    }
    
    public String queryOAPNodeInfrastructureErrorsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeInfrastructureErrorsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    //HTTP Error Codes per Minute
    public String queryOAPAppHttpErrorCodesPerMinute( long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppHttpErrorCodesPerMinute(baseURL, application,start, end, rollup);
    }
    
    public String queryOAPTierHttpErrorCodesPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierHttpErrorCodesPerMinute(baseURL, application,tier,start, end, rollup);
    }
    
    public String queryOAPNodeHttpErrorCodesPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeHttpErrorCodesPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    //Exceptions per Minute
    public String queryOAPAppExceptionsPerMinute(long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppExceptionsPerMinute(baseURL, application,start, end, rollup);
    }
    
    public String queryOAPTierExceptionsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierExceptionsPerMinute(baseURL, application,tier,start, end, rollup);
    }
    
    public String queryOAPNodeExceptionsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeExceptionsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    
    //Errors per Minute
    public String queryOAPAppErrorsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppErrorsPerMinute(baseURL, application,start, end, rollup);
    }
    
    public String queryOAPTierErrorsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierErrorsPerMinute(baseURL, application,tier,start, end, rollup);
    }
    
    public String queryOAPNodeErrorsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeErrorsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    
    //Error Page Redirects per Minute
    public String queryOAPAppErrorPageRedirectsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppErrorPageRedirectsPerMinute(baseURL, application,start, end, rollup);
    }
    
    public String queryOAPTierErrorPageRedirectsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierErrorPageRedirectsPerMinute(baseURL, application,tier,start, end, rollup);
    }
    
    public String queryOAPNodeErrorPageRedirectsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeErrorPageRedirectsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    //CallsPerMinute
    public  String queryOAPAppCallsPerMinute(long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppCallsPerMinute(baseURL, application,start, end, rollup);
    }
    
    public String queryOAPTierCallsPerMinute(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierCallsPerMinute(baseURL, application,tier,start, end, rollup);
    }
    
    public String queryOAPNodeCallsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeCallsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
     // Avg Response Time
    public String queryOAPAppAvgResponseTimeMS(long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPAppAvgResponseTimeMS(baseURL, application,start, end, rollup);
    }
    
    public  String queryOAPTierAvgResponseTimeMS(String tier, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPTierAvgResponseTimeMS(baseURL, application,tier,start, end, rollup);
    }
    
    public String queryOAPNodeAvgResponseTimeMS(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeAvgResponseTimeMS(baseURL, application,tier,node,start, end, rollup);
    }
    
    /* EUM AJAX */
    public String queryEUM_AJAX_All(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_All(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_REQUESTS_PER_MIN(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_REQUESTS_PER_MIN(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_DOC_DOWNLOAD_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_DOC_DOWNLOAD_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_DOC_PROCESSING_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_DOC_PROCESSING_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_APPLICATION_SERVER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_APPLICATION_SERVER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    
    /* EUM BASE PAGES */
    public String queryEUM_BASE_PAGES_All(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_All(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FRONT_END_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FRONT_END_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_REQUESTS_PER_MIN(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_REQUESTS_PER_MIN(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOC_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_All(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_All(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FRONT_END_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FRONT_END_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOCUMENT_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOCUMENT_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_TCP_CONNECT_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_TCP_CONNECT_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_PAGE_RENDER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_PAGE_RENDER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_REQUESTS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_REQUESTS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    
    /*
     *  ***********************************************************************
     *    Business Transaction Metric Querys 
     */
    public String queryBTAVERAGE_BLOCK_TIME_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_BLOCK_TIME_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_CPU_USED_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_CPU_USED_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_REQUEST_SIZE(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_REQUEST_SIZE(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_RESPONSE_TIME(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_RESPONSE_TIME(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_WAIT_TIME_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_WAIT_TIME_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTCALL_PER_MINUTE(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTCALL_PER_MINUTE(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTERRORS_PER_MINUTE(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTERRORS_PER_MINUTE(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTNUMBER_OF_SLOW_CALLS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTNUMBER_OF_SLOW_CALLS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTNUMBER_OF_VERY_SLOW_CALLS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTNUMBER_OF_VERY_SLOW_CALLS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTSTALL_COUNT(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTSTALL_COUNT(baseURL, application, tier, site, start, end, rollup);
    }
    
    /* Added Hugh Brian */
    public String queryAllMetricsForBT( String application, String tier, String btName, long start, long end, boolean rollup)
    {
        return BusinessTransactionQuery.queryAllMetricsPerBT( baseURL,  application,  tier, btName,  start,  end,  rollup);
    }
    
    /*
     * *************************************************************************
     *              Backends 
     */
    
    public String queryBackendAverageResponseTimeMS(String application, String tier, long start, long end, boolean rollup){
        return BackendsQuery.queryBackendAverageResponseTimeMS(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryBackendCallsPerMinute(String application, String tier, long start, long end, boolean rollup){
        return BackendsQuery.queryBackendCallsPerMinute(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryBackendErrorsPerMinute(String application, String tier, long start, long end, boolean rollup){
        return BackendsQuery.queryBackendErrorsPerMinute(baseURL, application, tier, start, end, rollup);
    }
    
}

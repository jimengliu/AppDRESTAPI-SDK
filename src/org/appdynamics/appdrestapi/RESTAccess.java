/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi;


import org.appdynamics.appdrestapi.data.AutoDiscoveryConfig;
import org.appdynamics.appdrestapi.queries.*;
import org.appdynamics.appdrestapi.data.*;
import org.appdynamics.appdrestapi.exportdata.*;
import org.appdynamics.appdrestapi.resources.*;
import org.appdynamics.appdrestapi.util.*;


import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author gilbert.solorzano@appdynamics.com
 * <p>
 * The RESTAccess is a class that allows access to AppDynamics REST API. The intention
 * is to provide a easy method to to access the AppDynamics Controller REST service. 
 * </p>
 * <p>
 * Metrics : 
 * 1 minute level data upto 4 hours
 * 10 minute level data after 4 hours upto 48 hours
 * 1 hour level data after 48 hours upto 365 days.
 * </p>
 * 
 * 
 */
public class RESTAccess extends BaseRESTAccess{
    private static final Logger logger=Logger.getLogger(RESTAccess.class.getName());
    /*
    protected RESTBaseURL baseURL;
    protected RESTAuth auth;
    protected RESTExecuter R;
    */
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller. This will default to the following :
     * useSSL false
     * account customer1
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess(String controllerURL, String port, String username, String password){
        super(controllerURL,port,username,password);
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.This will default to the following :
     * account customer1
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password){
        super(controllerURL,port,ssl,username,password);
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.This will default to the following :
     * useSSL false
     * </p>.
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     */
    public RESTAccess(String controllerURL, String port, String username, String password, String account){
        super(controllerURL,port,username,password,account);
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     */
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password, String account){
        super(controllerURL,port,ssl,username,password,account);
        
    }
    
     /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     * @param  proxy {@link RESTProxy} Proxy object with needed information
     */
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password, String account, RESTProxy proxy){
        super(controllerURL,port,ssl,username,password,account,proxy);
        
    }
    

    
    /**
     * <p>
     * This is going to execute a generic query based on the application and full metric path given.<br>
     * This will allow a user to get metrics from custom extensions.
     * </p>
     * 
     * @param application Name of the application
     * @param metricPath String that determine which metric to request
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     */
    public MetricDatas getRESTGenericMetricQuery(String application, String metricPath, long start, long end, boolean rollup){
        try{
            return R.executeMetricQuery(auth, MetricItemQuery.queryGeneralMetricQuery(baseURL.getControllerURL(), application, metricPath, start, end,rollup));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>Return the metric data for the metric path of Agent from the Tier perspective.</p>
     * <ul>
     *      <li><b>Agent Availability</b>
     *          <ul>
                        <li>Index     0: queryAgentTierAppAgentAvailability
                        <li>Index     1: queryAgentTierMachineAgentAvailability
                </ul>
             <li><b>Top Summary Stats Upload</b>
             * <ul>
                        <li>Index     2: queryAgentTierTopSummaryStatsUploadTopSummaryStatsExceedingLimit
                        <li>Index     3: queryAgentTierTopSummaryStatsUploadInvalidTopSummaryStats
                        <li>Index     4: queryAgentTierTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded
                        <li>Index     5: queryAgentTierTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors
                 </ul>
               <li><b>Discovered Backends</b>
               * <ul>
                        <li>Index     6: queryAgentTierDiscoveredBackendsRegistrationSuccessful
                        <li>Index     7: queryAgentTierDiscoveredBackendsRegistrationFailed
                        <li>Index     8: queryAgentTierDiscoveredBackendsUnmonitoredCallsPerMinute
                  </ul>
                <li><b>Config Channel</b>
                * <ul>
                        <li>Index     9: queryAgentTierConfigChannelNumberOfApplicationInfrastructureChangeSet
                   </ul>
                <li><b>Snapshot Upload</b>
                * <ul>
                        <li>Index    10: queryAgentTierSnapshotUploadSnapshotsUploaded
                        <li>Index    11: queryAgentTierSnapshotUploadInvalidSnapshots
                        <li>Index    12: queryAgentTierSnapshotUploadTimeSkewErrors
                        <li>Index    13: queryAgentTierSnapshotUploadSnapshotsExceedingLimit
                   </ul>
                <li><b>Metric Upload</b>
                * <ul>
                        <li>Index    14: queryAgentTierMetricUploadRequestsLicenseErrors
                        <li>Index    15: queryAgentTierMetricUploadInvalidMetrics
                        <li>Index    16: queryAgentTierMetricUploadRequestsTimeSkewErrors
                        <li>Index    17: queryAgentTierMetricUploadMetricsUpload
                        <li>Index    18: queryAgentTierMetricUploadRequestsExceedingLimit
                   </ul>
                 <li><b>Event Upload</b>
                 *  <ul>
                        <li>Index    19: queryAgentTierEventUploadEventsUploaded
                        <li>Index    20: queryAgentTierEventUploadEventsExceedingLimit
                        <li>Index    21: queryAgentTierEventUploadTimeSkewsErrors
                    </ul>
                 <li><b>Business Transactions</b>
                 *  <ul>
                        <li>Index    22: queryAgentTierBusinessTransactionsUnmonitoredCallsPerMinute
                        <li>Index    23: queryAgentTierBusinessTransactionsRegistrationFailed
                        <li>Index    24: queryAgentTierBusinessTransactionsRegistrationSuccessful
                    </ul>
        </ul>
     * 
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metrics
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getAgentTierAppMetricQuery(int queryIndex, String application, String tier, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                .append(application).append(" tier ").append(tier).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query = mq.queryAgentTierAppAgentAvailability(tier,start,end,rollup);
                break;
            case 1:
                query = mq.queryAgentTierMachineAgentAvailability(tier,start,end,rollup);
                break;
            case 2:
                query = mq.queryAgentTierTopSummaryStatsUploadTopSummaryStatsExceedingLimit(tier,start,end,rollup);
                break;
            case 3:
                query = mq.queryAgentTierTopSummaryStatsUploadInvalidTopSummaryStats(tier,start,end,rollup);
                break;
            case 4:
                query = mq.queryAgentTierTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(tier,start,end,rollup);
                break;
            case 5:
                query = mq.queryAgentTierTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(tier,start,end,rollup);
                break;
            case 6:
                query = mq.queryAgentTierDiscoveredBackendsRegistrationSuccessful(tier,start,end,rollup);
                break;
            case 7:
                query = mq.queryAgentTierDiscoveredBackendsRegistrationFailed(tier,start,end,rollup);
                break;
            case 8:
                query = mq.queryAgentTierDiscoveredBackendsUnmonitoredCallsPerMinute(tier,start,end,rollup);
                break;
            case 9:
                query = mq.queryAgentTierConfigChannelNumberOfApplicationInfrastructureChangeSet(tier,start,end,rollup);
                break;
            case 10:
                query = mq.queryAgentTierSnapshotUploadSnapshotsUploaded(tier,start,end,rollup);
                break;
            case 11:
                query = mq.queryAgentTierSnapshotUploadInvalidSnapshots(tier,start,end,rollup);
                break;
            case 12:
                query = mq.queryAgentTierSnapshotUploadTimeSkewErrors(tier,start,end,rollup);
                break;
            case 13:
                query = mq.queryAgentTierSnapshotUploadSnapshotsExceedingLimit(tier,start,end,rollup);
                break;
            case 14:
                query = mq.queryAgentTierMetricUploadRequestsLicenseErrors(tier,start,end,rollup);
                break;
            case 15:
                query = mq.queryAgentTierMetricUploadInvalidMetrics(tier,start,end,rollup);
                break;
            case 16:
                query = mq.queryAgentTierMetricUploadRequestsTimeSkewErrors(tier,start,end,rollup);
                break;
            case 17:
                query = mq.queryAgentTierMetricUploadMetricsUpload(tier,start,end,rollup);
                break;
            case 18:
                query = mq.queryAgentTierMetricUploadRequestsExceedingLimit(tier,start,end,rollup);
                break;
            case 19:
                query = mq.queryAgentTierEventUploadEventsUploaded(tier,start,end,rollup);
                break;
            case 20:
                query = mq.queryAgentTierEventUploadEventsExceedingLimit(tier,start,end,rollup);
                break;
            case 21:
                query = mq.queryAgentTierEventUploadTimeSkewsErrors(tier,start,end,rollup);
                break;
            case 22:
                query = mq.queryAgentTierBusinessTransactionsUnmonitoredCallsPerMinute(tier,start,end,rollup);
                break;
            case 23:
                query = mq.queryAgentTierBusinessTransactionsRegistrationFailed(tier,start,end,rollup);
                break;
            case 24:
                query = mq.queryAgentTierBusinessTransactionsRegistrationSuccessful(tier,start,end,rollup);
                break;
                
            default:
                query=null;
                break;
            
        }
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" and tier ").append(tier).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>Return the metric data for the metric path of Agent</p>
     * 
     * <ul>
     *      <li><b>Agent Availability</b>
     *          <ul>
                        <li>Index     0: queryAgentNodeAppAgentAvailability
                        <li>Index     1: queryAgentNodeMachineAgentAvailability
                </ul>
             <li><b>Top Summary Stats Upload</b>
             * <ul>
                        <li>Index     2: queryAgentNodeTopSummaryStatsUploadTopSummaryStatsExceedingLimit
                        <li>Index     3: queryAgentNodeTopSummaryStatsUploadInvalidTopSummaryStats
                        <li>Index     4: queryAgentNodeTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded
                        <li>Index     5: queryAgentNodeTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors
                 </ul>
               <li><b>Discovered Backends</b>
               * <ul>
                        <li>Index     6: queryAgentNodeDiscoveredBackendsRegistrationSuccessful
                        <li>Index     7: queryAgentNodeDiscoveredBackendsRegistrationFailed
                        <li>Index     8: queryAgentNodeDiscoveredBackendsUnmonitoredCallsPerMinute
                  </ul>
                <li><b>Config Channel</b>
                * <ul>
                        <li>Index     9: queryAgentNodeConfigChannelNumberOfApplicationInfrastructureChangeSet
                   </ul>
                <li><b>Snapshot Upload</b>
                * <ul>
                        <li>Index    10: queryAgentNodeSnapshotUploadSnapshotsUploaded
                        <li>Index    11: queryAgentNodeSnapshotUploadInvalidSnapshots
                        <li>Index    12: queryAgentNodeSnapshotUploadTimeSkewErrors
                        <li>Index    13: queryAgentNodeSnapshotUploadSnapshotsExceedingLimit
                   </ul>
                <li><b>Metric Upload</b>
                * <ul>
                        <li>Index    14: queryAgentNodeMetricUploadRequestsLicenseErrors
                        <li>Index    15: queryAgentNodeMetricUploadInvalidMetrics
                        <li>Index    16: queryAgentNodeMetricUploadRequestsTimeSkewErrors
                        <li>Index    17: queryAgentNodeMetricUploadMetricsUpload
                        <li>Index    18: queryAgentNodeMetricUploadRequestsExceedingLimit
                   </ul>
                 <li><b>Event Upload</b>
                 *  <ul>
                        <li>Index    19: queryAgentNodeEventUploadEventsUploaded
                        <li>Index    20: queryAgentNodeEventUploadEventsExceedingLimit
                        <li>Index    21: queryAgentNodeEventUploadTimeSkewsErrors
                    </ul>
                 <li><b>Business Transactions</b>
                 *  <ul>
                        <li>Index    22: queryAgentNodeBusinessTransactionsUnmonitoredCallsPerMinute
                        <li>Index    23: queryAgentNodeBusinessTransactionsRegistrationFailed
                        <li>Index    24: queryAgentNodeBusinessTransactionsRegistrationSuccessful
                    </ul>
        </ul>
        * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metrics
     * @param node Name of the node which holds the metrics
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getAgentNodeAppMetricQuery(int queryIndex, String application, String tier, String node, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query = mq.queryAgentNodeAppAgentAvailability(tier, node, start, end, rollup);
                break;
            case 1:
                query = mq.queryAgentNodeMachineAgentAvailability(tier,node,start,end,rollup);
                break;
            case 2:
                query = mq.queryAgentNodeTopSummaryStatsUploadTopSummaryStatsExceedingLimit(tier,node,start,end,rollup);
                break;
            case 3:
                query = mq.queryAgentNodeTopSummaryStatsUploadInvalidTopSummaryStats(tier,node,start,end,rollup);
                break;
            case 4:
                query = mq.queryAgentNodeTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(tier,node,start,end,rollup);
                break;
            case 5:
                query = mq.queryAgentNodeTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(tier,node,start,end,rollup);
                break;
            case 6:
                query = mq.queryAgentNodeDiscoveredBackendsRegistrationSuccessful(tier,node,start,end,rollup);
                break;
            case 7:
                query = mq.queryAgentNodeDiscoveredBackendsRegistrationFailed(tier,node,start,end,rollup);
                break;
            case 8:
                query = mq.queryAgentNodeDiscoveredBackendsUnmonitoredCallsPerMinute(tier,node,start,end,rollup);
                break;
            case 9:
                query = mq.queryAgentNodeConfigChannelNumberOfApplicationInfrastructureChangeSet(tier,node,start,end,rollup);
                break;
            case 10:
                query = mq.queryAgentNodeSnapshotUploadSnapshotsUploaded(tier,node,start,end,rollup);
                break;
            case 11:
                query = mq.queryAgentNodeSnapshotUploadInvalidSnapshots(tier,node,start,end,rollup);
                break;
            case 12:
                query = mq.queryAgentNodeSnapshotUploadTimeSkewErrors(tier,node,start,end,rollup);
                break;
            case 13:
                query = mq.queryAgentNodeSnapshotUploadSnapshotsExceedingLimit(tier,node,start,end,rollup);
                break;
            case 14:
                query = mq.queryAgentNodeMetricUploadRequestsLicenseErrors(tier,node,start,end,rollup);
                break;
            case 15:
                query = mq.queryAgentNodeMetricUploadInvalidMetrics(tier,node,start,end,rollup);
                break;
            case 16:
                query = mq.queryAgentNodeMetricUploadRequestsTimeSkewErrors(tier,node,start,end,rollup);
                break;
            case 17:
                query = mq.queryAgentNodeMetricUploadMetricsUpload(tier,node,start,end,rollup);
                break;
            case 18:
                query = mq.queryAgentNodeMetricUploadRequestsExceedingLimit(tier,node,start,end,rollup);
                break;
            case 19:
                query = mq.queryAgentNodeEventUploadEventsUploaded(tier,node,start,end,rollup);
                break;
            case 20:
                query = mq.queryAgentNodeEventUploadEventsExceedingLimit(tier,node,start,end,rollup);
                break;
            case 21:
                query = mq.queryAgentNodeEventUploadTimeSkewsErrors(tier,node,start,end,rollup);
                break;
            case 22:
                query = mq.queryAgentNodeBusinessTransactionsUnmonitoredCallsPerMinute(tier,node,start,end,rollup);
                break;
            case 23:
                query = mq.queryAgentNodeBusinessTransactionsRegistrationFailed(tier,node,start,end,rollup);
                break;
            case 24:
                query = mq.queryAgentNodeBusinessTransactionsRegistrationSuccessful(tier,node,start,end,rollup);
                break;
                
            default:
                query=null;
                break;
            
        }
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" and node").append(node).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>Hardware Level Data </p>
     * 
     * <ul>
     *      <li><b>CPU</b>
     *              <ul>
			<li>Index    0: queryHWTierCPUBusy
			<li>Index    1: queryHWTierCPUIdle
			<li>Index    2: queryHWTierCPUStolen
                     </ul>
              <li><b>Disks</b>
              *     <ul>
			<li>Index    3: queryHWTierDisksKBReadPerSec
			<li>Index    4: queryHWTierDisksKBWrittenPerSec
			<li>Index    5: queryHWTierDisksReadPerSec
			<li>Index    6: queryHWTierDisksWritesPerSec
			<li>Index    7: queryHWTierDisksSpaceUsed
			<li>Index    8: queryHWTierDisksAvgServiceTimeMS
			<li>Index    9: queryHWTierDisksPerCPUTime
			<li>Index    10: queryHWTierDisksSpaceAvailable
			<li>Index    11: queryHWTierDisksAvgQueueTimeMS
                       </ul>
                <li><b>Memory</b>
                *       <ul>
			<li>Index    12: queryHWTierMemoryFreePerc
			<li>Index    13: queryHWTierMemoryFreeMB
			<li>Index    14: queryHWTierMemoryTotalMB
			<li>Index    15: queryHWTierMemoryUsedPerc
			<li>Index    16: queryHWTierMemoryUsedMB
                        *</ul> 
                <li><b>Network</b>
                *       <ul>
			<li>Index    17: queryHWTierNetworkIncomingKB
			<li>Index    18: queryHWTierNetworkIncomingKBPerSec
			<li>Index    19: queryHWTierNetworkIncomingPackets
			<li>Index    20: queryHWTierNetworkIncomingPacketsPerSec
			<li>Index    21: queryHWTierNetworkOutgoingKB
			<li>Index    22: queryHWTierNetworkOutgoingKBPerSec
			<li>Index    23: queryHWTierNetworkOutgoingPackets
			<li>Index    24: queryHWTierNetworkOutgoingPacketsPerSec
                        </ul>
                <li><b>Volumes (Legacy) </b>
                *       <ul>
			<li>Index    25: queryHWTierVolumesUsedMB
			<li>Index    26: queryHWTierVolumesFreeMB
			<li>Index    27: queryHWTierVolumesUsedPer
			<li>Index    28: queryHWTierVolumesTotalMB
                         </ul>
                 <li><b>System (Legacy)</b>
                 *      <ul>
			<li>Index    29: queryHWTierSystemRQ
                         </ul>
                 <li><b>Multiple Queries</b>
                 * <ul>
			<li>Index    100: queryHWTierCPUAll
			<li>Index    101: queryHWTierDisksAll
			<li>Index    102: queryHWTierMemoryAll
			<li>Index    103: queryHWTierNetworkAll
			<li>Index    104: queryHWTierVolumesAll
			<li>Index    105: queryHWTierSystemAll
                     </ul>
     *  
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metrics
     * @param obj Name of the device if it applies, for example 'eth0'
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getHWTierMetricQuery(int queryIndex, String application, String tier, String obj, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application, ")
                .append(application).append(" tier, ").append(tier).append(" and obj ").append(obj).append(" - ").append(baseURL).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        
        switch(queryIndex){
            case 0:
                query = mq.queryHWTierCPUBusy(tier,start,end,rollup);
                break;
            case 1:
                query = mq.queryHWTierCPUIdle(tier,start,end,rollup);
                break;
            case 2:
                query = mq.queryHWTierCPUStolen(tier,start,end,rollup);
                break;
            case 3:
                query = mq.queryHWTierDisksKBReadPerSec(tier,obj,start,end,rollup);
                break;
            case 4:
                query = mq.queryHWTierDisksKBWrittenPerSec(tier,obj,start,end,rollup);
                break;
            case 5:
                query = mq.queryHWTierDisksReadPerSec(tier,obj,start,end,rollup);
                break;
            case 6:
                query = mq.queryHWTierDisksWritesPerSec(tier,obj,start,end,rollup);
                break;
            case 7:
                query = mq.queryHWTierDisksSpaceUsed(tier,obj,start,end,rollup);
                break;
            case 8:
                query = mq.queryHWTierDisksAvgServiceTimeMS(tier,obj,start,end,rollup);
                break;
            case 9:
                query = mq.queryHWTierDisksPerCPUTime(tier,obj,start,end,rollup);
                break;
            case 10:
                query = mq.queryHWTierDisksSpaceAvailable(tier,obj,start,end,rollup);
                break;
            case 11:
                query = mq.queryHWTierDisksAvgQueueTimeMS(tier,obj,start,end,rollup);
                break;
            case 12:           
                query = mq.queryHWTierMemoryFreePerc(tier,start,end,rollup);
                break;
            case 13:
                query = mq.queryHWTierMemoryFreeMB(tier,start,end,rollup);
                break;
            case 14:
                query = mq.queryHWTierMemoryTotalMB(tier,start,end,rollup);
                break;
            case 15:
                query = mq.queryHWTierMemoryUsedPerc(tier,start,end,rollup);
                break;
            case 16:
                query = mq.queryHWTierMemoryUsedMB(tier,start,end,rollup);
                break;
            case 17:
                query = mq.queryHWTierNetworkIncomingKB(tier,obj,start,end,rollup);
                break;
            case 18:
                query = mq.queryHWTierNetworkIncomingKBPerSec(tier,obj,start,end,rollup);
                break;
            case 19:
                query = mq.queryHWTierNetworkIncomingPackets(tier,obj,start,end,rollup);
                break;
            case 20:
                query = mq.queryHWTierNetworkIncomingPacketsPerSec(tier,obj,start,end,rollup);
                break;
            case 21:
                query = mq.queryHWTierNetworkOutgoingKB(tier,obj,start,end,rollup);
                break;
            case 22:
                query = mq.queryHWTierNetworkOutgoingKBPerSec(tier,obj,start,end,rollup);
                break;
            case 23:
                query = mq.queryHWTierNetworkOutgoingPackets(tier,obj,start,end,rollup);
                break;
            case 24:
                query = mq.queryHWTierNetworkOutgoingPacketsPerSec(tier,obj,start,end,rollup);
                break;
            case 25:
                query = mq.queryHWTierVolumesUsedMB(tier,obj,start,end,rollup);
                break;
            case 26:
                query = mq.queryHWTierVolumesFreeMB(tier,obj,start,end,rollup);
                break;
            case 27:
                query = mq.queryHWTierVolumesUsedPer(tier,obj,start,end,rollup);
                break;
            case 28:
                query = mq.queryHWTierVolumesTotalMB(tier,obj,start,end,rollup);
                break;
            case 29:
                query = mq.queryHWTierSystemRQ(tier,start,end,rollup);  
                break;


            case 100:
                query = mq.queryHWTierCPUAll(tier,start,end,rollup);
                break;
            case 101:
                query = mq.queryHWTierDisksAll(tier,obj,start,end,rollup);
                break;
            case 102:
                query = mq.queryHWTierMemoryAll(tier,start,end,rollup);    
                break;
            case 103:
                query = mq.queryHWTierNetworkAll(tier,obj,start,end,rollup);
                break;
            case 104:
                query = mq.queryHWTierVolumesAll(tier,obj,start,end,rollup);
                break;
            case 105:
                query = mq.queryHWTierSystemAll(tier,start,end,rollup);
                break;

            default:
                break;
        }
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" and tier ").append(tier).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>Returns the metric data for the metric path for hardware metrics</p>
     * 
     * <ul>
     *      <li>CPU
     *              <ul>
			<li>Index    0: queryHWNodeCPUBusy
			<li>Index    1: queryHWNodeCPUIdle
			<li>Index    2: queryHWNodeCPUStolen
                     </ul>
              <li>Disks
              *     <ul>
			<li>Index    3: queryHWNodeDisksKBReadPerSec
			<li>Index    4: queryHWNodeDisksKBWrittenPerSec
			<li>Index    5: queryHWNodeDisksReadPerSec
			<li>Index    6: queryHWNodeDisksWritesPerSec
			<li>Index    7: queryHWNodeDisksSpaceUsed
			<li>Index    8: queryHWNodeDisksAvgServiceTimeMS
			<li>Index    9: queryHWNodeDisksPerCPUTime
			<li>Index    10: queryHWNodeDisksSpaceAvailable
			<li>Index    11: queryHWNodeDisksAvgQueueTimeMS
                       </ul>
                <li>Memory
                *       <ul>
			<li>Index    12: queryHWNodeMemoryFreePerc
			<li>Index    13: queryHWNodeMemoryFreeMB
			<li>Index    14: queryHWNodeMemoryTotalMB
			<li>Index    15: queryHWNodeMemoryUsedPerc
			<li>Index    16: queryHWNodeMemoryUsedMB
                        *</ul> 
                <li>Network
                *       <ul>
			<li>Index    17: queryHWNodeNetworkIncomingKB
			<li>Index    18: queryHWNodeNetworkIncomingKBPerSec
			<li>Index    19: queryHWNodeNetworkIncomingPackets
			<li>Index    20: queryHWNodeNetworkIncomingPacketsPerSec
			<li>Index    21: queryHWNodeNetworkOutgoingKB
			<li>Index    22: queryHWNodeNetworkOutgoingKBPerSec
			<li>Index    23: queryHWNodeNetworkOutgoingPackets
			<li>Index    24: queryHWNodeNetworkOutgoingPacketsPerSec
                        </ul>
                <li>Volumes (Legacy)
                *       <ul>
			<li>Index    25: queryHWNodeVolumesUsedMB
			<li>Index    26: queryHWNodeVolumesFreeMB
			<li>Index    27: queryHWNodeVolumesUsedPer
			<li>Index    28: queryHWNodeVolumesTotalMB
                         </ul>
                 <li>System (Legacy)
                 *      <ul>
			<li>Index    29: queryHWNodeSystemRQ
                         </ul>
                 <li>Multiple Queries
                 * <ul>
			<li>Index    100: queryHWNodeCPUAll
			<li>Index    101: queryHWNodeDisksAll
			<li>Index    102: queryHWNodeMemoryAll
			<li>Index    103: queryHWNodeNetworkAll
			<li>Index    104: queryHWNodeVolumesAll
			<li>Index    105: queryHWNodeSystemAll
                     </ul>
     *  
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metrics
     * @param node Name of the node which holds the metrics
     * @param obj Name of the device if it applies, for example 'eth0'
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getHWNodeMetricQuery(int queryIndex, String application, String tier, String node, String obj, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application, ")
                .append(application).append(" tier, ").append(tier).append(" and obj ").append(obj).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query = mq.queryHWNodeCPUBusy(tier,node,start,end,rollup);
                break;
            case 1:
                query = mq.queryHWNodeCPUIdle(tier,node,start,end,rollup);
                break;
            case 2:
                query = mq.queryHWNodeCPUStolen(tier,node,start,end,rollup);                
                break;
            case 3:
                query = mq.queryHWNodeDisksKBReadPerSec(tier,node,obj,start,end,rollup);
                break;
            case 4:
                query = mq.queryHWNodeDisksKBWrittenPerSec(tier,node,obj,start,end,rollup);
                break;
            case 5:
                query = mq.queryHWNodeDisksReadPerSec(tier,node,obj,start,end,rollup);
                break;
            case 6:
                query = mq.queryHWNodeDisksWritesPerSec(tier,node,obj,start,end,rollup);
                break;
            case 7:
                query = mq.queryHWNodeDisksSpaceUsed(tier,node,obj,start,end,rollup);
                break;
            case 8:
                query = mq.queryHWNodeDisksAvgServiceTimeMS(tier,node,obj,start,end,rollup);
                break;
            case 9:
                query = mq.queryHWNodeDisksPerCPUTime(tier,node,obj,start,end,rollup);
                break;
            case 10:
                query = mq.queryHWNodeDisksSpaceAvailable(tier,node,obj,start,end,rollup);
                break;
            case 11:
                query = mq.queryHWNodeDisksAvgQueueTimeMS(tier,node,obj,start,end,rollup);
                break;
            case 12:
                query = mq.queryHWNodeMemoryFreePerc(tier,node,start,end,rollup);
                break;
            case 13:
                query = mq.queryHWNodeMemoryFreeMB(tier,node,start,end,rollup);
                break;
            case 14:
                query = mq.queryHWNodeMemoryTotalMB(tier,node,start,end,rollup);
                break;
            case 15:
                query = mq.queryHWNodeMemoryUsedPerc(tier,node,start,end,rollup);
                break;
            case 16:
                query = mq.queryHWNodeMemoryUsedMB(tier,node,start,end,rollup);
                break;
            case 17:
                query = mq.queryHWNodeNetworkIncomingKB(tier,node,obj,start,end,rollup);
                break;
            case 18:
                query = mq.queryHWNodeNetworkIncomingKBPerSec(tier,node,obj,start,end,rollup);
                break;
            case 19:
                query = mq.queryHWNodeNetworkIncomingPackets(tier,node,obj,start,end,rollup);
                break;
            case 20:
                query = mq.queryHWNodeNetworkIncomingPacketsPerSec(tier,node,obj,start,end,rollup);
                break;
            case 21:
                query = mq.queryHWNodeNetworkOutgoingKB(tier,node,obj,start,end,rollup);
                break;
            case 22:
                query = mq.queryHWNodeNetworkOutgoingKBPerSec(tier,node,obj,start,end,rollup);
                break;
            case 23:
                query = mq.queryHWNodeNetworkOutgoingPackets(tier,node,obj,start,end,rollup);
                break;
            case 24:
                query = mq.queryHWNodeNetworkOutgoingPacketsPerSec(tier,node,obj,start,end,rollup);
                break;
            case 25:
                query = mq.queryHWNodeVolumesUsedMB(tier,node,obj,start,end,rollup);
                break;
            case 26:
                query = mq.queryHWNodeVolumesFreeMB(tier,node,obj,start,end,rollup);
                break;
            case 27:
                query = mq.queryHWNodeVolumesUsedPer(tier,node,obj,start,end,rollup);
                break;
            case 28:
                query = mq.queryHWNodeVolumesTotalMB(tier,node,obj,start,end,rollup);
                break;
            case 29:
                query = mq.queryHWNodeSystemRQ(tier,node,start,end,rollup);  
                break;


            case 100:
                query = mq.queryHWNodeCPUAll(tier,node,start,end,rollup);
                break;
            case 101:
                query = mq.queryHWNodeDisksAll(tier,node,obj,start,end,rollup);
                break;
            case 102:
                query = mq.queryHWNodeMemoryAll(tier,node,start,end,rollup);
                break;
            case 103:
                query = mq.queryHWNodeNetworkAll(tier,node,obj,start,end,rollup);
                break;
            case 104:
                query = mq.queryHWNodeVolumesAll(tier,node,obj,start,end,rollup);
                break;
            case 105:
                query = mq.queryHWNodeSystemAll(tier,node,start,end,rollup);


            default:
                break;

                
        }
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application, ")
                    .append(application).append(" tier, ").append(tier).append(" node").append(node).append(" and obj").append(obj).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 




     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getJVMTierMetricQuery(int queryIndex, String application, String tier, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query = mq.queryJVMTierClassesCurrentLoadedClassCount(tier,start,end,rollup);
                break;
            case 1:
                query = mq.queryJVMTierClassesTotalClassesLoaded(tier,start,end,rollup);
                break;
            case 2:
                query = mq.queryJVMTierProcessCPUBurntMSPerMin(tier,start,end,rollup);
                break;
            case 3:
                query = mq.queryJVMTierProcessCPUUsagePerc(tier,start,end,rollup);
                break;
            case 4:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCommittedMB(tier,start,end,rollup);
                break;
            case 5:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(tier,start,end,rollup);
                break;
            case 6:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(tier,start,end,rollup);
                break;
            case 7:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 8:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(tier,start,end,rollup);
                break;
            case 9:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 10:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCommittedMB(tier,start,end,rollup);
                break;
            case 11:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(tier,start,end,rollup);
                break;
            case 12:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 13:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCommittedMB(tier,start,end,rollup);
                break;
            case 14:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(tier,start,end,rollup);
                break;
            case 15:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 16:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 17:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(tier,start,end,rollup);
                break;
            case 18:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 19:
                query = mq.queryJVMTierGarbageCollectionGCTimeSpentPerMin(tier,start,end,rollup);
                break;
            case 20:
                query = mq.queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(tier,start,end,rollup);
                break;
            case 21:
                query = mq.queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(tier,start,end,rollup);
                break;
            case 22:
                query = mq.queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier,start,end,rollup);
                break;
            case 23:
                query = mq.queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier,start,end,rollup);
                break;
            case 24:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 25:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 26:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 27:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 28:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 29:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 30:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsTenuredGenCommittedMB(tier,start,end,rollup);
                break;
            case 31:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(tier,start,end,rollup);
                break;
            case 32:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 33:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 34:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 35:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 36:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsNurseryCommittedMB(tier,start,end,rollup);
                break;
            case 37:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(tier,start,end,rollup);
                break;
            case 38:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(tier,start,end,rollup);
                break;
            case 39:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 40:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 41:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 42:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(tier,start,end,rollup);
                break;
            case 43:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(tier,start,end,rollup);
                break;
            case 44:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 45:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1PermGenCommittedMB(tier,start,end,rollup);
                break;
            case 46:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(tier,start,end,rollup);
                break;
            case 47:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 48:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 49:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 50:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 51:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 52:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 53:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 54:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPermGenCommittedMB(tier,start,end,rollup);
                break;
            case 55:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(tier,start,end,rollup);
                break;
            case 56:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 57:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 58:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 59:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 60:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsOldSpaceCommittedMB(tier,start,end,rollup);
                break;
            case 61:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 62:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 63:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(tier,start,end,rollup);
                break;
            case 64:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(tier,start,end,rollup);
                break;
            case 65:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 66:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsMetaspaceCommittedMB(tier,start,end,rollup);
                break;
            case 67:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(tier,start,end,rollup);
                break;
            case 68:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(tier,start,end,rollup);
                break;
            case 69:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1OldGenCommittedMB(tier,start,end,rollup);
                break;
            case 70:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(tier,start,end,rollup);
                break;
            case 71:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(tier,start,end,rollup);
                break;
            case 72:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(tier,start,end,rollup);
                break;
            case 73:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(tier,start,end,rollup);
                break;
            case 74:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(tier,start,end,rollup);
                break;
            case 75:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsClassMemoryCommittedMB(tier,start,end,rollup);
                break;
            case 76:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(tier,start,end,rollup);
                break;
            case 77:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(tier,start,end,rollup);
                break;
            case 78:
                query = mq.queryJVMTierMemoryHeapCommittedMB(tier,start,end,rollup);
                break;
            case 79:
                query = mq.queryJVMTierMemoryHeapCurrentUsageMB(tier,start,end,rollup);
                break;
            case 80:
                query = mq.queryJVMTierMemoryHeapMaxAvailableMB(tier,start,end,rollup);
                break;
            case 81:
                query = mq.queryJVMTierMemoryHeapUsedPerc(tier,start,end,rollup);
                break;
            case 82:
                query = mq.queryJVMTierMemoryNonHeapCommittedMB(tier,start,end,rollup);
                break;
            case 83:
                query = mq.queryJVMTierMemoryNonHeapCurrentUsageMB(tier,start,end,rollup);
                break;
            case 84:
                query = mq.queryJVMTierMemoryNonHeapMaxAvailableMB(tier,start,end,rollup);
                break;
            case 85:
                query = mq.queryJVMTierMemoryNonHeapUsedPerc(tier,start,end,rollup);
                break;
            case 86:
                query = mq.queryJVMTierThreadsCurrentNoOfThreads(tier,start,end,rollup);
                break;
            
            case 100:
                query = mq.queryJVMTierProcessCPUALL(tier,start,end,rollup);
                break;
            case 101:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheALL(tier,start,end,rollup);
                break;
            case 102:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceALL(tier,start,end,rollup);
                break;
            case 103:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenALL(tier,start,end,rollup);
                break;
            case 104:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenALL(tier,start,end,rollup);
                break;
            case 105:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(tier,start,end,rollup);
                break;
            case 106:
                query = mq.queryJVMTierGarbageCollectionALL(tier,start,end,rollup);
                break;
            case 107:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceALL(tier,start,end,rollup);
                break;
            case 108:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsTenuredGenALL(tier,start,end,rollup);
                break;
            case 109:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceALL(tier,start,end,rollup);
                break;
            case 110:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsNurseryALL(tier,start,end,rollup);
                break;
            case 111:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceALL(tier,start,end,rollup);
                break;
            case 112:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenALL(tier,start,end,rollup);
                break;
            case 113:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1PermGenALL(tier,start,end,rollup);
                break;
            case 114:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceALL(tier,start,end,rollup);
                break;
            case 115:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceALL(tier,start,end,rollup);
                break;
            case 116:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsPermGenALL(tier,start,end,rollup);
                break;
            case 117:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceALL(tier,start,end,rollup);
                break;
            case 118:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsOldSpaceALL(tier,start,end,rollup);
                break;
            case 119:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenALL(tier,start,end,rollup);
                break;
            case 120:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsMetaspaceALL(tier,start,end,rollup);
                break;
            case 121:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsG1OldGenALL(tier,start,end,rollup);
                break;
            case 122:
                query = mq.queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryALL(tier,start,end,rollup);
                break;
            case 123:
                query = mq.queryJVMTierMemoryHeapALL(tier,start,end,rollup);
                break;
            case 124:
                query = mq.queryJVMTierMemoryNonHeapALL(tier,start,end,rollup);


            default:
                query = null;



        }
        
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" and tier ").append(tier).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
        <p> Depending on the JVM version of the agent that you are trying to collect metrics from will define which set of metrics are available.</p>
        <ul>
               <li>Classes
                    <ul>
                        <li>Index     0: queryJVMNodeClassesCurrentLoadedClassCount
                        <li>Index     1: queryJVMNodeClassesTotalClassesLoaded
                     </ul>
                <li>Garbage Collection
                    <ul>
                                <li>Memory Pools
                                        <ul>
                                                <li>Code Cache
                                                   <ul>
                                                             <li>Index     2: queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
                                                             <li>Index     3: queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
                                                             <li>Index     4: queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
                                                   </ul>
                                                <li>Compressed Class Space
                                                    <ul>
                                                            <li>Index     5: queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB
                                                            <li>Index     6: queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB
                                                            <li>Index     7: queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB
                                                      </ul>
                                                <li>Metaspace
                                                    <ul>
                                                            <li>Index     8: queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCommittedMB
                                                            <li>Index     9: queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB
                                                            <li>Index     10: queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB
                                                      </ul>
                                                <li>PS Eden Space
                                                  <ul>
                                                            <li>Index     11: queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
                                                            <li>Index     12: queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
                                                            <li>Index     13: queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
                                                   </ul>
                                                <li> PS Old Gen
                                                     <ul>
                                                            <li>Index     14: queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
                                                            <li>Index     15: queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
                                                            <li>Index     16: queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
                                                      </ul>
                                                <li>PS Perm Gen
                                                    <ul>
                                                            <li>Index     17: queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
                                                            <li>Index     18: queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
                                                            <li>Index     19: queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
                                                    </ul>
                                                <li>PS Survivor Space
                                                  <ul>
                                                            <li>Index     20: queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
                                                            <li>Index     21: queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
                                                            <li>Index     22: queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
                                                    </ul>
                                                <li>Nursery
                                                    <ul>
                                                            <li>Index     23: queryJVMNodeGarbageCollectionMemoryPoolsNurseryCommittedMB
                                                            <li>Index     24: queryJVMNodeGarbageCollectionMemoryPoolsNurseryCurrentUsageMB
                                                            <li>Index     25: queryJVMNodeGarbageCollectionMemoryPoolsNurseryMaxAvailableMB
                                                      </ul>
                                                <li>Old Space
                                                    <ul>
                                                            <li>Index     26: queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCommittedMB
                                                            <li>Index     27: queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB
                                                            <li>Index     28: queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB
                                                      </ul>
                                                <li>Eden Space
                                                    <ul>
                                                            <li>Index     29: queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCommittedMB
                                                            <li>Index     30: queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB
                                                            <li>Index     31: queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB
                                                      </ul>
                                                <li>Tenured Gen
                                                    <ul>
                                                            <li>Index     32: queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCommittedMB
                                                            <li>Index     33: queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB
                                                            <li>Index     34: queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB
                                                      </ul>
                                                <li>Perm Gen
                                                    <ul>
                                                            <li>Index     35: queryJVMNodeGarbageCollectionMemoryPoolsPermGenCommittedMB
                                                            <li>Index     36: queryJVMNodeGarbageCollectionMemoryPoolsPermGenCurrentUsageMB
                                                            <li>Index     37: queryJVMNodeGarbageCollectionMemoryPoolsPermGenMaxAvailableMB
                                                     </ul>
                                                <li>Survivor Space
                                                    <ul>
                                                            <li>Index     38: queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB
                                                            <li>Index     39: queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB
                                                            <li>Index     40: queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB
                                                      </ul>
                                                <li>Par Eden Space
                                                    <ul>
                                                            <li>Index     41: queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB
                                                            <li>Index     42: queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB
                                                            <li>Index     43: queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB
                                                    </ul>
                                                <li>Par Survivor Space
                                                    <ul>
                                                            <li>Index     44: queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB
                                                            <li>Index     45: queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB
                                                            <li>Index     46: queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB
                                                      </ul>
                                                <li>CMS Old Gen
                                                    <ul>
                                                            <li>Index     47: queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCommittedMB
                                                            <li>Index     48: queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB
                                                            <li>Index     49: queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB
                                                      </ul>
                                                <li>CMS Perm Gen
                                                    <ul>
                                                            <li>Index     50: queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCommittedMB
                                                            <li>Index     51: queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB
                                                            <li>Index     52: queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB
                                                      </ul>
                                                <li>G1 Eden Space
                                                    <ul>
                                                            <li>Index     53: queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB
                                                            <li>Index     54: queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB
                                                            <li>Index     55: queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB
                                                      </ul>
                                                <li>G1 Old Gen
                                                    <ul>
                                                            <li>Index     56: queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCommittedMB
                                                            <li>Index     57: queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB
                                                            <li>Index     58: queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB
                                                      </ul>
                                                <li>G1 Survivor Space
                                                    <ul>
                                                            <li>Index     59: queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB
                                                            <li>Index     60: queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB
                                                            <li>Index     61: queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB
                                                      </ul>
                                                <li>G1 Perm Gen
                                                    <ul>
                                                            <li>Index     62: queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCommittedMB
                                                            <li>Index     63: queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB
                                                            <li>Index     64: queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB
                                                     </ul>
                                                <li>Class Block Memory
                                                    <ul>
                                                            <li>Index     65: queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB
                                                            <li>Index     66: queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB
                                                            <li>Index     67: queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB
                                                      </ul>
                                                <li>Class Memory
                                                    <ul>
                                                            <li>Index     68: queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCommittedMB
                                                            <li>Index     69: queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB
                                                            <li>Index     70: queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB
                                                      </ul>
                                        </ul>
                                 
                         
                            <li>Index     71: queryJVMNodeGarbageCollectionGCTimeSpentPerMin
                            <li>Index     72: queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin
                            <li>Index     73: queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin
                            <li>Index     74: queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
                            <li>Index     75: queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
                       </ul>
                <li>Memory 
                    <ul>
                         <li>Memory Heap
                             <ul>
                                     <li>Index     76: queryJVMNodeMemoryHeapCommittedMB
                                     <li>Index     77: queryJVMNodeMemoryHeapCurrentUsageMB
                                     <li>Index     78: queryJVMNodeMemoryHeapMaxAvailableMB
                                     <li>Index     79: queryJVMNodeMemoryHeapUsedPerc
                               </ul>
                         <li>Memory NonHeap
                             <ul>
                                     <li>Index     80: queryJVMNodeMemoryNonHeapCommittedMB
                                     <li>Index     81: queryJVMNodeMemoryNonHeapCurrentUsageMB
                                     <li>Index     82: queryJVMNodeMemoryNonHeapMaxAvailableMB
                                     <li>Index     83: queryJVMNodeMemoryNonHeapUsedPerc
                               </ul>
                    </ul>
               <li>Threads
                     <ul>
                             <li>Index     84: queryJVMNodeThreadsCurrentNoOfThreads
                       </ul>
                <li>Process
                      <ul>
                         <li>Index     85: queryJVMNodeProcessCPUBurntMSPerMin
                         <li>Index     86: queryJVMNodeProcessCPUUsagePerc
                       </ul>

  
        <li>Multiple Metrics 
                <ul>
                *              <li>Index     100: queryJVMNodeClassesALL
                                <li>Index     101: queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheALL
                                <li>Index     102: queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceALL
                                <li>Index     103: queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceALL
                                <li>Index     104: queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceALL
                                <li>Index     105: queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenALL
                                <li>Index     106: queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenALL
                                <li>Index     107: queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceALL
                                <li>Index     108: queryJVMNodeGarbageCollectionMemoryPoolsNurseryALL
                                <li>Index     109: queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceALL
                                <li>Index     110: queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceALL
                                <li>Index     111: queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenALL
                                <li>Index     112: queryJVMNodeGarbageCollectionMemoryPoolsPermGenALL
                                <li>Index     113: queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceALL
                                <li>Index     114: queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceALL
                                <li>Index     115: queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceALL
                                <li>Index     116: queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenALL
                                <li>Index     117: queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenALL
                                <li>Index     118: queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceALL
                                <li>Index     119: queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenALL
                                <li>Index     120: queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceALL
                                <li>Index     121: queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenALL
                                <li>Index     122: queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryALL
                                <li>Index     123: queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryALL
                                <li>Index     124: queryJVMNodeGarbageCollectionALL
                                <li>Index     125: queryJVMNodeMemoryHeapALL
                                <li>Index     126: queryJVMNodeMemoryNonHeapALL
                                <li>Index     127: queryJVMNodeProcessCPUALL
          
                 </ul>
        </ul>
          
        * 
        * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
       @param node Name of the node which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
    */
    public MetricDatas getJVMNodeMetricQuery(int queryIndex, String application, String tier, String node, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query = mq.queryJVMNodeClassesCurrentLoadedClassCount(tier,node,start,end,rollup);
                break;
            case 1:
                query = mq.queryJVMNodeClassesTotalClassesLoaded(tier,node,start,end,rollup);
                break;
            case 2:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(tier,node,start,end,rollup);
                break;
            case 3:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(tier,node,start,end,rollup);
                break;
            case 4:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 5:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 6:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 7:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 8:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 9:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 10:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 11:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 12:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(tier,node,start,end,rollup);
                break;
            case 13:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 14:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 15:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(tier,node,start,end,rollup);
                break;
            case 16:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 17:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 18:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(tier,node,start,end,rollup);
                break;
            case 19:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 20:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 21:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(tier,node,start,end,rollup);
                break;
            case 22:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 23:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsNurseryCommittedMB(tier,node,start,end,rollup);
                break;
            case 24:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 25:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 26:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 27:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 28:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 29:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 30:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 31:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 32:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 33:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 34:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 35:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPermGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 36:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 37:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 38:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 39:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 40:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 41:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 42:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 43:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 44:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 45:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 46:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 47:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 48:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 49:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 50:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 51:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 52:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 53:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 54:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 55:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 56:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 57:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 58:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 59:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(tier,node,start,end,rollup);
                break;
            case 60:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 61:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 62:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCommittedMB(tier,node,start,end,rollup);
                break;
            case 63:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 64:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 65:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(tier,node,start,end,rollup);
                break;
            case 66:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 67:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 68:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCommittedMB(tier,node,start,end,rollup);
                break;
            case 69:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 70:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 71:
                query = mq.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(tier,node,start,end,rollup);
                break;
            case 72:
                query = mq.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(tier,node,start,end,rollup);
                break;
            case 73:
                query = mq.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(tier,node,start,end,rollup);
                break;
            case 74:
                query = mq.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier,node,start,end,rollup);
                break;
            case 75:
                query = mq.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier,node,start,end,rollup);
                break;
            case 76:
                query = mq.queryJVMNodeMemoryHeapCommittedMB(tier,node,start,end,rollup);
                break;
            case 77:
                query = mq.queryJVMNodeMemoryHeapCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 78:
                query = mq.queryJVMNodeMemoryHeapMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 79:
                query = mq.queryJVMNodeMemoryHeapUsedPerc(tier,node,start,end,rollup);
                break;
            case 80:
                query = mq.queryJVMNodeMemoryNonHeapCommittedMB(tier,node,start,end,rollup);
                break;
            case 81:
                query = mq.queryJVMNodeMemoryNonHeapCurrentUsageMB(tier,node,start,end,rollup);
                break;
            case 82:
                query = mq.queryJVMNodeMemoryNonHeapMaxAvailableMB(tier,node,start,end,rollup);
                break;
            case 83:
                query = mq.queryJVMNodeMemoryNonHeapUsedPerc(tier,node,start,end,rollup);
                break;
            case 84:
                query = mq.queryJVMNodeThreadsCurrentNoOfThreads(tier,node,start,end,rollup);
                break;
            case 85:
                query = mq.queryJVMNodeProcessCPUBurntMSPerMin(tier,node,start,end,rollup);
                break;
            case 86:
                query = mq.queryJVMNodeProcessCPUUsagePerc(tier,node,start,end,rollup);
                break;
            

            case 100:
                query = mq.queryJVMNodeClassesALL(tier,node,start,end,rollup);
                break;
            case 101:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheALL(tier,node,start,end,rollup);
                break;
            case 102:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceALL(tier,node,start,end,rollup);
                break;
            case 103:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceALL(tier,node,start,end,rollup);
                break;
            case 104:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceALL(tier,node,start,end,rollup);
                break;
            case 105:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenALL(tier,node,start,end,rollup);
                break;
            case 106:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenALL(tier,node,start,end,rollup);
                break;
            case 107:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(tier,node,start,end,rollup);
                break;
            case 108:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsNurseryALL(tier,node,start,end,rollup);
                break;
            case 109:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceALL(tier,node,start,end,rollup);
                break;
            case 110:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceALL(tier,node,start,end,rollup);
                break;
            case 111:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenALL(tier,node,start,end,rollup);
                break;
            case 112:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsPermGenALL(tier,node,start,end,rollup);
                break;
            case 113:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceALL(tier,node,start,end,rollup);
                break;
            case 114:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceALL(tier,node,start,end,rollup);
                break;
            case 115:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceALL(tier,node,start,end,rollup);
                break;
            case 116:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenALL(tier,node,start,end,rollup);
                break;
            case 117:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenALL(tier,node,start,end,rollup);
                break;
            case 118:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceALL(tier,node,start,end,rollup);
                break;
            case 119:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenALL(tier,node,start,end,rollup);
                break;
            case 120:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceALL(tier,node,start,end,rollup);
                break;
            case 121:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenALL(tier,node,start,end,rollup);
                break;
            case 122:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryALL(tier,node,start,end,rollup);
                break;
            case 123:
                query = mq.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryALL(tier,node,start,end,rollup);
                break;
            case 124:
                query = mq.queryJVMNodeGarbageCollectionALL(tier,node,start,end,rollup);
                break;
            case 125:
                query = mq.queryJVMNodeMemoryHeapALL(tier,node,start,end,rollup);
                break;
            case 126:
                query = mq.queryJVMNodeMemoryNonHeapALL(tier,node,start,end,rollup);
                break;
            case 127:
                query = mq.queryJVMNodeProcessCPUALL(tier,node,start,end,rollup);
                break;
            

            default:
                query=null;


        }
        
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" and node").append(node).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    
    /**
     * 
     * <p>
     *  Returns the Overall Application Performance metrics from the Application perspective. 
     * There are queries for <b>'External Calls'</b> that expects an additional parameter <b>'obj'</b>, 
     * for all other queries just pass a <b>'null'</b> as a parameter.
     * </p>
     * 
     * 
     * 
     * <ul>
     *      <li>Overall Application Performance
     *          <ul>
			<li>Index    0:queryOAPNodeStallCount
			<li>Index    1:queryOAPNodeNumberOfVerySlowCalls
			<li>Index    2:queryOAPNodeNumberOfSlowCalls
			<li>Index    3:queryOAPNodeInfrastructureErrorsPerMinute
			<li>Index    4:queryOAPNodeHttpErrorCodesPerMinute
			<li>Index    5:queryOAPNodeExceptionsPerMinute
			<li>Index    6:queryOAPNodeErrorsPerMinute
			<li>Index    7:queryOAPNodeErrorPageRedirectsPerMinute
			<li>Index    8:queryOAPNodeCallsPerMinute
			<li>Index    9:queryOAPNodeAvgResponseTimeMS
                </ul>
            
            <li>All The Metrics In A Branch
            *   <ul>
			<li>Index    100:queryOAPNodeAll
                </ul>
        </ul>

     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param obj Name of the Backend that holds the metrics
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getOAPAppMetricQuery(int queryIndex, String application,  String obj, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                    query=mq.queryOAPNodeStallCount(null,null,start,end,rollup);
                    break;
            case 1:
                    query=mq.queryOAPNodeNumberOfVerySlowCalls(null,null,start,end,rollup);
                    break;
            case 2:
                    query=mq.queryOAPNodeNumberOfSlowCalls(null,null,start,end,rollup);
                    break;
            case 3:
                    query=mq.queryOAPNodeInfrastructureErrorsPerMinute(null,null,start,end,rollup);
                    break;
            case 4:
                    query=mq.queryOAPNodeHttpErrorCodesPerMinute(null,null,start,end,rollup);
                    break;
            case 5:
                    query=mq.queryOAPNodeExceptionsPerMinute(null,null,start,end,rollup);
                    break;
            case 6:
                    query=mq.queryOAPNodeErrorsPerMinute(null,null,start,end,rollup);
                    break;
            case 7:
                    query=mq.queryOAPNodeErrorPageRedirectsPerMinute(null,null,start,end,rollup);
                    break;
            case 8:
                    query=mq.queryOAPNodeCallsPerMinute(null,null,start,end,rollup);
                    break;
            case 9:
                    query=mq.queryOAPNodeAvgResponseTimeMS(null,null,start,end,rollup);
                    break;

                    
            case 100:
                    query=mq.queryOAPNodeAll(null,null,start,end,rollup);
                    break;

                
            default:
                query=null;
        }
        
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    } 
    
    
    /**
     * 
     * <p>
     *  Returns the Overall Application Performance metrics from the Tier perspective. 
     * There are queries for <b>'External Calls'</b> that expects an additional parameter <b>'obj'</b>, 
     * for all other queries just pass a <b>'null'</b> as a parameter.
     * </p>
     * 
     * 
     * 
     * <ul>
     *      <li>Overall Application Performance
     *          <ul>
			<li>Index   0:queryOAPNodeStallCount
			<li>Index   1:queryOAPNodeNumberOfVerySlowCalls
			<li>Index   2:queryOAPNodeNumberOfSlowCalls
			<li>Index   3:queryOAPNodeInfrastructureErrorsPerMinute
			<li>Index   4:queryOAPNodeHttpErrorCodesPerMinute
			<li>Index   5:queryOAPNodeExceptionsPerMinute
			<li>Index   6:queryOAPNodeErrorsPerMinute
			<li>Index   7:queryOAPNodeErrorPageRedirectsPerMinute
			<li>Index   8:queryOAPNodeCallsPerMinute
			<li>Index   9:queryOAPNodeAvgResponseTimeMS
                </ul>
            <li>External Calls
            *   <ul>
			<li>Index    10:queryOAPNodeExternalCallsCallsPerMinute
			<li>Index    11:queryOAPNodeExternalCallsErrorsPerMinute
			<li>Index    12:queryOAPNodeExternalCallsAverageResponseTimeMS
                </ul>
            <li>Thread Tasks
            *   <ul>
			<li>Index    13:queryOAPNodeThreadTasksLicenseFileTrackerCallsPerMinute
                </ul>
            
            <li>All The Metrics In A Branch
            *   <ul>
			<li>Index    100:queryOAPNodeAll
                                                <li>Index    101:queryOAPNodeExternalCallsAll
                </ul>
        </ul>

     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metrics
     * @param obj Name of the Backend that holds the metrics
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getOAPTierMetricQuery(int queryIndex, String application, String tier, String obj, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                    query=mq.queryOAPNodeStallCount(tier,null,start,end,rollup);
                    break;
            case 1:
                    query=mq.queryOAPNodeNumberOfVerySlowCalls(tier,null,start,end,rollup);
                    break;
            case 2:
                    query=mq.queryOAPNodeNumberOfSlowCalls(tier,null,start,end,rollup);
                    break;
            case 3:
                    query=mq.queryOAPNodeInfrastructureErrorsPerMinute(tier,null,start,end,rollup);
                    break;
            case 4:
                    query=mq.queryOAPNodeHttpErrorCodesPerMinute(tier,null,start,end,rollup);
                    break;
            case 5:
                    query=mq.queryOAPNodeExceptionsPerMinute(tier,null,start,end,rollup);
                    break;
            case 6:
                    query=mq.queryOAPNodeErrorsPerMinute(tier,null,start,end,rollup);
                    break;
            case 7:
                    query=mq.queryOAPNodeErrorPageRedirectsPerMinute(tier,null,start,end,rollup);
                    break;
            case 8:
                    query=mq.queryOAPNodeCallsPerMinute(tier,null,start,end,rollup);
                    break;
            case 9:
                    query=mq.queryOAPNodeAvgResponseTimeMS(tier,null,start,end,rollup);
                    break;
            case 10:
                    query=mq.queryOAPNodeExternalCallsCallsPerMinute(tier,null,obj,start,end,rollup);
                    break;
            case 11:
                    query=mq.queryOAPNodeExternalCallsErrorsPerMinute(tier,null,obj,start,end,rollup);
                    break;
            case 12:
                    query=mq.queryOAPNodeExternalCallsAverageResponseTimeMS(tier,null,obj,start,end,rollup);
                    break;
            case 13:
                    query=mq.queryOAPNodeThreadTasksLicenseFileTrackerCallsPerMinute(tier,null,start,end,rollup);
                    break;
                    
            case 100:
                    query=mq.queryOAPNodeAll(tier,null,start,end,rollup);
                    break;
            case 101:
                    query=mq.queryOAPNodeExternalCallsAll(tier,null,obj,start,end,rollup);
                    break;
                
            default:
                query=null;
        }
        
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    } 
    
    /**
     * <p>
     *  Returns the Overall Application Performance metrics from the Node perspective. 
     * There are queries for <b>'External Calls'</b> that expects an additional parameter <b>'obj'</b>, 
     * for all other queries just pass a <b>'null'</b> as a parameter.
     * </p>
     * 
     * <ul>
     *      <li>Overall Application Performance
     *          <ul>
			<li>Index    0:queryOAPNodeStallCount
			<li>Index    1:queryOAPNodeNumberOfVerySlowCalls
			<li>Index    2:queryOAPNodeNumberOfSlowCalls
			<li>Index    3:queryOAPNodeInfrastructureErrorsPerMinute
			<li>Index    4:queryOAPNodeHttpErrorCodesPerMinute
			<li>Index    5:queryOAPNodeExceptionsPerMinute
			<li>Index    6:queryOAPNodeErrorsPerMinute
			<li>Index    7:queryOAPNodeErrorPageRedirectsPerMinute
			<li>Index    8:queryOAPNodeCallsPerMinute
			<li>Index    9:queryOAPNodeAvgResponseTimeMS
                </ul>
            <li>External Calls
            *   <ul>
			<li>Index    10:queryOAPNodeExternalCallsCallsPerMinute
			<li>Index    11:queryOAPNodeExternalCallsErrorsPerMinute
			<li>Index    12:queryOAPNodeExternalCallsAverageResponseTimeMS
                </ul>
            <li>Thread Tasks
            *   <ul>
			<li>Index    13:queryOAPNodeThreadTasksLicenseFileTrackerCallsPerMinute
                </ul>
            
            <li>All The Metrics In A Branch
            *   <ul>
			<li>Index    100:queryOAPNodeAll
                                                <li>Index    101:queryOAPNodeExternalCallsAll
                </ul>
        </ul>

     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metrics
     * @param node Name of the node which holds the metrics
     * @param obj Name of the Backend that holds the metrics
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Defines whether metrics should be rolled up
     * @return {@link MetricDatas}
     */
    public MetricDatas getOAPNodeMetricQuery(int queryIndex, String application, String tier, String node, String obj, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                    query=mq.queryOAPNodeStallCount(tier,node,start,end,rollup);
                    break;
            case 1:
                    query=mq.queryOAPNodeNumberOfVerySlowCalls(tier,node,start,end,rollup);
                    break;
            case 2:
                    query=mq.queryOAPNodeNumberOfSlowCalls(tier,node,start,end,rollup);
                    break;
            case 3:
                    query=mq.queryOAPNodeInfrastructureErrorsPerMinute(tier,node,start,end,rollup);
                    break;
            case 4:
                    query=mq.queryOAPNodeHttpErrorCodesPerMinute(tier,node,start,end,rollup);
                    break;
            case 5:
                    query=mq.queryOAPNodeExceptionsPerMinute(tier,node,start,end,rollup);
                    break;
            case 6:
                    query=mq.queryOAPNodeErrorsPerMinute(tier,node,start,end,rollup);
                    break;
            case 7:
                    query=mq.queryOAPNodeErrorPageRedirectsPerMinute(tier,node,start,end,rollup);
                    break;
            case 8:
                    query=mq.queryOAPNodeCallsPerMinute(tier,node,start,end,rollup);
                    break;
            case 9:
                    query=mq.queryOAPNodeAvgResponseTimeMS(tier,node,start,end,rollup);
                    break;
            case 10:
                    query=mq.queryOAPNodeExternalCallsCallsPerMinute(tier,node,obj,start,end,rollup);
                    break;
            case 11:
                    query=mq.queryOAPNodeExternalCallsErrorsPerMinute(tier,node,obj,start,end,rollup);
                    break;
            case 12:
                    query=mq.queryOAPNodeExternalCallsAverageResponseTimeMS(tier,node,obj,start,end,rollup);
                    break;
            case 13:
                    query=mq.queryOAPNodeThreadTasksLicenseFileTrackerCallsPerMinute(tier,node,start,end,rollup);
                    break;
                    
            case 100:
                    query=mq.queryOAPNodeAll(tier,node,start,end,rollup);
                    break;
            case 101:
                    query=mq.queryOAPNodeExternalCallsAll(tier,node,obj,start,end,rollup);
                    break;
                
            default:
                query=null;
        }
        
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }    
    
    /**
     * 
     * <p>
     * Returns MetricData for general tier level metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     *
     * 
     * <ul>
     *  <li><b>Agent Availability</b>
     *      <ul>
            * <li>Index 0  : Application Agent
            * <li>Index 1  : Machine Agent
     *      </ul>
     *  <li><b>Hardware Metrics</b>
     *      <ul>
            * <li>Index 2  : queryHDTierCPUBusy
            * <li>Index 3  : queryHDTierCPUIdle
            * <li>Index 4  : queryHDTierCPUStolen
            * <li>Index 5  : queryHDTierDisksKBReadPerSec
            * <li>Index 6  : queryHDTierDisksKBWrittenPerSec
            * <li>Index 7  : queryHDTierDisksReadPerSec
            * <li>Index 8  : queryHDTierDisksWritesPerSec
            * <li>Index 9  : queryHDTierMemoryFreePerc
            * <li>Index 10 : queryHDTierMemoryFreeMB
            * <li>Index 11 : queryHDTierMemoryTotalMB
            * <li>Index 12 : queryHDTierMemoryUsedPerc
            * <li>Index 13 : queryHDTierMemoryUsedMB
            * <li>Index 14 : queryHDTierNetworkIncomingKB
            * <li>Index 15 : queryHDTierNetworkIncomingKBPerSec
            * <li>Index 16 : queryHDTierNetworkIncomingPackets
            * <li>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
            * <li>Index 18 : queryHDTierNetworkOutgoingKB
            * <li>Index 19 : queryHDTierNetworkOutgoingKBPerSec
            * <li>Index 20 : queryHDTierNetworkOutgoingPackets
            * <li>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
            * <li>Index 22 : queryHDNodeSystemRQ
     *      </ul>
     *  <li><b>JVM Metrics</b>
     *      <ul>
     *          <li><b>Process Metrics</b>
     *              <ul>
                    * <li>Index 23 : queryJVMTierProcessCPUBurntMSPerMin
                    * <li>Index 24 : queryJVMTierProcessCPUUsagePerc
            *       </ul>
            *   <li><b>Garbage Collection Metrics</b>
            *       <ul>
                    * <li>Index 25 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
                    * <li>Index 26 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
                    * <li>Index 27 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
                    * <li>Index 28 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
                    * <li>Index 29 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
                    * <li>Index 30 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
                      <li>Index 31 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
                      <li>Index 32 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
                      <li>Index 33 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
                      <li>Index 34 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
                      <li>Index 35 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
                      <li>Index 36 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
                      <li>Index 37 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
                      <li>Index 38 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
                      <li>Index 39 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
                      <li>Index 40 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
                      <li>Index 41 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
                      <li>Index 42 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
                      <li>Index 43 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
                      <li>Index 44 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
            *       </ul>
            *   <li><b>Memory</b>
            *       <ul>
                    * <li>Index 45 : queryJVMTierMemoryHeapCommittedMB
                    * <li>Index 46 : queryJVMTierMemoryHeapCurrentUsageMB
                    * <li>Index 47 : queryJVMTierMemoryHeapMaxAvailableMB
                    * <li>Index 48 : queryJVMTierMemoryHeapUsedPerc
                    * <li>Index 49 : queryJVMTierMemoryNonHeapCommittedMB
                    * <li>Index 50 : queryJVMTierMemoryNonHeapCurrentUsageMB
                    * <li>Index 51 : queryJVMTierMemoryNonHeapMaxAvailableMB
                    * <li>Index 52 : queryJVMTierMemoryNonHeapUsedPerc
            *       </ul>
            *   <li><b>Thread Metric</b>
            *       <ul>
                    * <li>Index 53 : queryJVMTierThreadsCurrentNoOfThreads
            *       </ul>
            </ul>
     *  <li><b>Overall Application Performance</b>
     *      <ul>
            * <li>Index 54 : queryOAPTierStallCount
            * <li>Index 55 : queryOAPTierNumberOfVerySlowCalls
            * <li>Index 56 : queryOAPTierNumberOfSlowCalls
            * <li>Index 57 : queryOAPTierInfrastructureErrorsPerMinute
            * <li>Index 58 : queryOAPTierHttpErrorCodesPerMinute
            * <li>Index 59 : queryOAPTierExceptionsPerMinute
            * <li>Index 60 : queryOAPTierErrorsPerMinute
            * <li>Index 61 : queryOAPTierErrorPageRedirectsPerMinute
            * <li>Index 62 : queryOAPTierCallsPerMinute
            * <li>Index 63 : queryOAPTierAvgResponseTimeMS
     *      </ul>

*       <p>
         In order to make queries more efficient the following options were added to collect multiple 
         metrics from a a single tier or node.
        </p>
        <li><b>Multi Metric Queries</b>
        * <ul>
            <li>Index 100 : queryHDNodeCPUAll
            <li>Index 101 : queryHDNodeDisksAll
            <li>Index 102 : queryHDNodeMemoryAll
            <li>Index 103 : queryHDNodeNetworkAll
            <li>Index 104 : queryHDNodeSystemAll
            <li>Index 105 : queryJVMNodeProcessCPUAll
            <li>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
            <li>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
            <li>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
            <li>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
            <li>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
            <li>Index 111 : queryJVMNodeGarbageCollectionAll
            <li>Index 112 : queryJVMNodeMemoryHeapAll
            <li>Index 113 : queryJVMNodeMemoryNonHeapAll
            <li>Index 114 : queryOAPNodeAll
        * </ul>
     * </ul>
     * 
     *  
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     */
    /*
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, long start, long end){
        return getRESTMetricQuery(queryIndex, application, tier, start, end, false);
    }
    */
    
    /**
     * 
     * <p>
     * Returns MetricData for general tier level metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * 
     * 
     * 
     * <ul>
     *  <li><b>Agent Availability</b>
     *      <ul>
            * <li>Index 0  : Application Agent
            * <li>Index 1  : Machine Agent
     *      </ul>
     *  <li><b>Hardware Metrics</b>
     *      <ul>
            * <li>Index 2  : queryHDTierCPUBusy
            * <li>Index 3  : queryHDTierCPUIdle
            * <li>Index 4  : queryHDTierCPUStolen
            * <li>Index 5  : queryHDTierDisksKBReadPerSec
            * <li>Index 6  : queryHDTierDisksKBWrittenPerSec
            * <li>Index 7  : queryHDTierDisksReadPerSec
            * <li>Index 8  : queryHDTierDisksWritesPerSec
            * <li>Index 9  : queryHDTierMemoryFreePerc
            * <li>Index 10 : queryHDTierMemoryFreeMB
            * <li>Index 11 : queryHDTierMemoryTotalMB
            * <li>Index 12 : queryHDTierMemoryUsedPerc
            * <li>Index 13 : queryHDTierMemoryUsedMB
            * <li>Index 14 : queryHDTierNetworkIncomingKB
            * <li>Index 15 : queryHDTierNetworkIncomingKBPerSec
            * <li>Index 16 : queryHDTierNetworkIncomingPackets
            * <li>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
            * <li>Index 18 : queryHDTierNetworkOutgoingKB
            * <li>Index 19 : queryHDTierNetworkOutgoingKBPerSec
            * <li>Index 20 : queryHDTierNetworkOutgoingPackets
            * <li>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
            * <li>Index 22 : queryHDNodeSystemRQ
     *      </ul>
     *  <li><b>JVM Metrics</b>
     *      <ul>
     *          <li><b>Process Metrics</b>
     *              <ul>
                    * <li>Index 23 : queryJVMTierProcessCPUBurntMSPerMin
                    * <li>Index 24 : queryJVMTierProcessCPUUsagePerc
            *       </ul>
            *   <li><b>Garbage Collection Metrics</b>
            *       <ul>
                    * <li>Index 25 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
                    * <li>Index 26 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
                    * <li>Index 27 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
                    * <li>Index 28 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
                    * <li>Index 29 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
                    * <li>Index 30 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
                      <li>Index 31 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
                      <li>Index 32 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
                      <li>Index 33 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
                      <li>Index 34 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
                      <li>Index 35 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
                      <li>Index 36 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
                      <li>Index 37 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
                      <li>Index 38 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
                      <li>Index 39 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
                      <li>Index 40 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
                      <li>Index 41 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
                      <li>Index 42 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
                      <li>Index 43 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
                      <li>Index 44 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
            *       </ul>
            *   <li><b>Memory</b>
            *       <ul>
                    * <li>Index 45 : queryJVMTierMemoryHeapCommittedMB
                    * <li>Index 46 : queryJVMTierMemoryHeapCurrentUsageMB
                    * <li>Index 47 : queryJVMTierMemoryHeapMaxAvailableMB
                    * <li>Index 48 : queryJVMTierMemoryHeapUsedPerc
                    * <li>Index 49 : queryJVMTierMemoryNonHeapCommittedMB
                    * <li>Index 50 : queryJVMTierMemoryNonHeapCurrentUsageMB
                    * <li>Index 51 : queryJVMTierMemoryNonHeapMaxAvailableMB
                    * <li>Index 52 : queryJVMTierMemoryNonHeapUsedPerc
            *       </ul>
            *   <li><b>Thread Metric</b>
            *       <ul>
                    * <li>Index 53 : queryJVMTierThreadsCurrentNoOfThreads
            *       </ul>
            </ul>
     *  <li><b>Overall Application Performance</b>
     *      <ul>
            * <li>Index 54 : queryOAPTierStallCount
            * <li>Index 55 : queryOAPTierNumberOfVerySlowCalls
            * <li>Index 56 : queryOAPTierNumberOfSlowCalls
            * <li>Index 57 : queryOAPTierInfrastructureErrorsPerMinute
            * <li>Index 58 : queryOAPTierHttpErrorCodesPerMinute
            * <li>Index 59 : queryOAPTierExceptionsPerMinute
            * <li>Index 60 : queryOAPTierErrorsPerMinute
            * <li>Index 61 : queryOAPTierErrorPageRedirectsPerMinute
            * <li>Index 62 : queryOAPTierCallsPerMinute
            * <li>Index 63 : queryOAPTierAvgResponseTimeMS
     *      </ul>

*       <p>
         In order to make queries more efficient the following options were added to collect multiple 
         metrics from a a single tier or node.
        </p>
        <li><b>Multi Metric Queries</b>
        * <ul>
            <li>Index 100 : queryHDNodeCPUAll
            <li>Index 101 : queryHDNodeDisksAll
            <li>Index 102 : queryHDNodeMemoryAll
            <li>Index 103 : queryHDNodeNetworkAll
            <li>Index 104 : queryHDNodeSystemAll
            <li>Index 105 : queryJVMNodeProcessCPUAll
            <li>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
            <li>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
            <li>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
            <li>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
            <li>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
            <li>Index 111 : queryJVMNodeGarbageCollectionAll
            <li>Index 112 : queryJVMNodeMemoryHeapAll
            <li>Index 113 : queryJVMNodeMemoryNonHeapAll
            <li>Index 114 : queryOAPNodeAll
        * </ul>
     * </ul>
     */
    /*
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryAgentTierAppAgentAvailability(tier, start, end, rollup);
                break;
            case 1:
                query=mq.queryAgentTierMachineAgentAvailability(tier, start, end, rollup);
                break;
            case 2:
                query=mq.queryHWTierCPUBusy(tier, start, end, rollup);
                break;
            case 3:
                query=mq.queryHWTierCPUIdle(tier, start, end, rollup);
                break;
            case 4:
                query=mq.queryHWTierCPUStolen(tier, start, end, rollup);
                break;
            case 5:
                query=mq.queryHWTierDisksKBReadPerSec(tier, null, start, end, rollup);
                break;
            case 6:
                query=mq.queryHWTierDisksKBWrittenPerSec(tier, null, start, end, rollup);
                break;
            case 7:
                query=mq.queryHWTierDisksReadPerSec(tier, null, start, end, rollup);
                break;
            case 8:
                query=mq.queryHWTierDisksWritesPerSec(tier, null, start, end, rollup);
                break;
            case 9:
                query=mq.queryHWTierMemoryFreePerc(tier, start, end, rollup);
                break;
            case 10:
                query=mq.queryHWTierMemoryFreeMB(tier, start, end, rollup);
                break;
            case 11:
                query=mq.queryHWTierMemoryTotalMB(tier, start, end, rollup);
                break;
            case 12:
                query=mq.queryHWTierMemoryUsedPerc(tier, start, end, rollup);
                break;
            case 13:
                query=mq.queryHWTierMemoryUsedMB(tier, start, end, rollup);
                break;
            case 14:
                query=mq.queryHWTierNetworkIncomingKB(tier, null, start, end, rollup);
                break;
            case 15:
                query=mq.queryHWTierNetworkIncomingKBPerSec(tier, null, start, end, rollup);
                break;
            case 16:
                query=mq.queryHWTierNetworkIncomingPackets(tier, null, start, end, rollup);
                break;
            case 17:
                query=mq.queryHWTierNetworkIncomingPacketsPerSec(tier, null, start, end, rollup);
                break;
            case 18:
                query=mq.queryHWTierNetworkOutgoingKB(tier, null, start, end, rollup);
                break;
            case 19:
                query=mq.queryHWTierNetworkOutgoingKBPerSec(tier, null, start, end, rollup);
                break;
            case 20:
                query=mq.queryHWTierNetworkOutgoingPackets(tier, null, start, end, rollup);
                break;
            case 21:
                query=mq.queryHWTierNetworkOutgoingPacketsPerSec(tier, null, start, end, rollup);
                break;
            case 22:
                query=mq.queryHWTierSystemRQ(tier, start, end, rollup);
                break;
            case 23:
                query=mq.queryJVMTierProcessCPUBurntMSPerMin(tier, start, end, rollup);
                break;
            case 24:
                query=mq.queryJVMTierProcessCPUUsagePerc(tier, start, end, rollup);
                break;
            case 25:
                query=mq.queryJVMTierGarbageCollectionGCTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 26:
                query=mq.queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 27:
                query=mq.queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 28:
                query=mq.queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 29:
                query=mq.queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 30:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCommittedMB(tier, start, end, rollup);
                break;
            case 31:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(tier, start, end, rollup);
                break;
            case 32:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(tier, start, end, rollup);
                break;
            case 33:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(tier, start, end, rollup);
                break;
            case 34:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(tier, start, end, rollup);
                break;
            case 35:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(tier, start, end, rollup);
                break;
            case 36:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCommittedMB(tier, start, end, rollup);
                break;
            case 37:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(tier, start, end, rollup);
                break;
            case 38:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(tier, start, end, rollup);
                break;
            case 39:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCommittedMB(tier, start, end, rollup);
                break;
            case 40:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(tier, start, end, rollup);
                break;
            case 41:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(tier, start, end, rollup);
                break;
            case 42:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(tier, start, end, rollup);
                break;
            case 43:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(tier, start, end, rollup);
                break;
            case 44:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(tier, start, end, rollup);
                break;
            case 45:
                query=mq.queryJVMTierMemoryHeapCommittedMB(tier, start, end, rollup);
                break;
            case 46:
                query=mq.queryJVMTierMemoryHeapCurrentUsageMB(tier, start, end, rollup);
                break;
            case 47:
                query=mq.queryJVMTierMemoryHeapMaxAvailableMB(tier, start, end, rollup);
                break;
            case 48:
                query=mq.queryJVMTierMemoryHeapUsedPerc(tier, start, end, rollup);
                break;
            case 49:
                query=mq.queryJVMTierMemoryNonHeapCommittedMB(tier, start, end, rollup);
                break;
            case 50:
                query=mq.queryJVMTierMemoryNonHeapCurrentUsageMB(tier, start, end, rollup);
                break;
            case 51:
                query=mq.queryJVMTierMemoryNonHeapMaxAvailableMB(tier, start, end, rollup);
                break;
            case 52:
                query=mq.queryJVMTierMemoryNonHeapUsedPerc(tier, start, end, rollup);
                break;
            case 53:
                query=mq.queryJVMTierThreadsCurrentNoOfThreads(tier, start, end, rollup);
                break;
            case 54:
                query=mq.queryOAPTierStallCount(tier, start, end, rollup);
                break;
            case 55:
                query=mq.queryOAPTierNumberOfVerySlowCalls(tier, start, end, rollup);
                break;
            case 56:
                query=mq.queryOAPTierNumberOfSlowCalls(tier, start, end, rollup);
                break;
            case 57:
                query=mq.queryOAPTierInfrastructureErrorsPerMinute(tier, start, end, rollup);
                break;
            case 58:
                query=mq.queryOAPTierHttpErrorCodesPerMinute(tier, start, end, rollup);
                break;
            case 59:
                query=mq.queryOAPTierExceptionsPerMinute(tier, start, end, rollup);
                break;
            case 60:
                query=mq.queryOAPTierErrorsPerMinute(tier, start, end, rollup);
                break;
            case 61:
                query=mq.queryOAPTierErrorPageRedirectsPerMinute(tier, start, end, rollup);
                break;
            case 62:
                query=mq.queryOAPTierCallsPerMinute(tier, start, end, rollup);
                break;
            case 63:
                query=mq.queryOAPTierAvgResponseTimeMS(tier, null,start, end, rollup);
                break;

            case 100: // All
                query=mq.queryHWTierCPUAll(tier, start, end, rollup);
                break;
            case 101:
                query=mq.queryHWTierDisksAll(tier, null, start, end, rollup);
                break;
            case 102:
                query=mq.queryHWTierMemoryAll(tier, start, end, rollup);
                break;
            case 103:
                query=mq.queryHWTierNetworkAll(tier, null, start, end, rollup);
                break;
            case 104:
                query=mq.queryHWTierSystemAll(tier, start, end, rollup);
                break;
            case 105:
                query=mq.queryJVMTierProcessCPUALL(tier, start, end, rollup);
                break;
            case 106:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheALL(tier, start, end, rollup);
                break;
            case 107:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceALL(tier, start, end, rollup);
                break;
            case 108:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenALL(tier, start, end, rollup);
                break;
            case 109:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenALL(tier, start, end, rollup);
                break;
            case 110:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(tier, start, end, rollup);
                break;
            case 111:
                query=mq.queryJVMTierGarbageCollectionALL(tier, start, end, rollup);
                break;
            case 112:
                query=mq.queryJVMTierMemoryHeapALL(tier, start, end, rollup);
                break;
            case 113:
                query=mq.queryJVMTierMemoryNonHeapALL(tier, start, end, rollup);
                break;
            case 114:
                query=mq.queryOAPTierAll(tier, start, end, rollup);
                break;

                
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    */
    
    /**
     * 
     * <p>
     * Returns MetricData for general node level metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * <ul>
     *  <li><b>Agent Availability</b>
     *      <ul>
            * <li>Index 0  : Application Agent
            * <li>Index 1  : Machine Agent
     *      </ul>
     *  <li><b>Hardware Metrics</b>
     *      <ul>
            * <li>Index 2  : queryHDTierCPUBusy
            * <li>Index 3  : queryHDTierCPUIdle
            * <li>Index 4  : queryHDTierCPUStolen
            * <li>Index 5  : queryHDTierDisksKBReadPerSec
            * <li>Index 6  : queryHDTierDisksKBWrittenPerSec
            * <li>Index 7  : queryHDTierDisksReadPerSec
            * <li>Index 8  : queryHDTierDisksWritesPerSec
            * <li>Index 9  : queryHDTierMemoryFreePerc
            * <li>Index 10 : queryHDTierMemoryFreeMB
            * <li>Index 11 : queryHDTierMemoryTotalMB
            * <li>Index 12 : queryHDTierMemoryUsedPerc
            * <li>Index 13 : queryHDTierMemoryUsedMB
            * <li>Index 14 : queryHDTierNetworkIncomingKB
            * <li>Index 15 : queryHDTierNetworkIncomingKBPerSec
            * <li>Index 16 : queryHDTierNetworkIncomingPackets
            * <li>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
            * <li>Index 18 : queryHDTierNetworkOutgoingKB
            * <li>Index 19 : queryHDTierNetworkOutgoingKBPerSec
            * <li>Index 20 : queryHDTierNetworkOutgoingPackets
            * <li>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
            * <li>Index 22 : queryHDNodeSystemRQ
     *      </ul>
     *  <li><b>JVM Metrics</b>
     *      <ul>
     *          <li><b>Process Metrics</b>
     *              <ul>
                    * <li>Index 23 : queryJVMTierProcessCPUBurntMSPerMin
                    * <li>Index 24 : queryJVMTierProcessCPUUsagePerc
            *       </ul>
            *   <li><b>Garbage Collection Metrics</b>
            *       <ul>
                    * <li>Index 25 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
                    * <li>Index 26 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
                    * <li>Index 27 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
                    * <li>Index 28 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
                    * <li>Index 29 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
                    * <li>Index 30 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
                      <li>Index 31 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
                      <li>Index 32 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
                      <li>Index 33 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
                      <li>Index 34 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
                      <li>Index 35 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
                      <li>Index 36 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
                      <li>Index 37 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
                      <li>Index 38 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
                      <li>Index 39 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
                      <li>Index 40 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
                      <li>Index 41 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
                      <li>Index 42 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
                      <li>Index 43 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
                      <li>Index 44 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
            *       </ul>
            *   <li><b>Memory</b>
            *       <ul>
                    * <li>Index 45 : queryJVMTierMemoryHeapCommittedMB
                    * <li>Index 46 : queryJVMTierMemoryHeapCurrentUsageMB
                    * <li>Index 47 : queryJVMTierMemoryHeapMaxAvailableMB
                    * <li>Index 48 : queryJVMTierMemoryHeapUsedPerc
                    * <li>Index 49 : queryJVMTierMemoryNonHeapCommittedMB
                    * <li>Index 50 : queryJVMTierMemoryNonHeapCurrentUsageMB
                    * <li>Index 51 : queryJVMTierMemoryNonHeapMaxAvailableMB
                    * <li>Index 52 : queryJVMTierMemoryNonHeapUsedPerc
            *       </ul>
            *   <li><b>Thread Metric</b>
            *       <ul>
                    * <li>Index 53 : queryJVMTierThreadsCurrentNoOfThreads
            *       </ul>
            </ul>
     *  <li><b>Overall Application Performance</b>
     *      <ul>
            * <li>Index 54 : queryOAPTierStallCount
            * <li>Index 55 : queryOAPTierNumberOfVerySlowCalls
            * <li>Index 56 : queryOAPTierNumberOfSlowCalls
            * <li>Index 57 : queryOAPTierInfrastructureErrorsPerMinute
            * <li>Index 58 : queryOAPTierHttpErrorCodesPerMinute
            * <li>Index 59 : queryOAPTierExceptionsPerMinute
            * <li>Index 60 : queryOAPTierErrorsPerMinute
            * <li>Index 61 : queryOAPTierErrorPageRedirectsPerMinute
            * <li>Index 62 : queryOAPTierCallsPerMinute
            * <li>Index 63 : queryOAPTierAvgResponseTimeMS
     *      </ul>

*       <p>
         In order to make queries more efficient the following options were added to collect multiple 
         metrics from a a single tier or node.
        </p>
        <li><b>Multi Metric Queries</b>
        * <ul>
            <li>Index 100 : queryHDNodeCPUAll
            <li>Index 101 : queryHDNodeDisksAll
            <li>Index 102 : queryHDNodeMemoryAll
            <li>Index 103 : queryHDNodeNetworkAll
            <li>Index 104 : queryHDNodeSystemAll
            <li>Index 105 : queryJVMNodeProcessCPUAll
            <li>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
            <li>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
            <li>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
            <li>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
            <li>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
            <li>Index 111 : queryJVMNodeGarbageCollectionAll
            <li>Index 112 : queryJVMNodeMemoryHeapAll
            <li>Index 113 : queryJVMNodeMemoryNonHeapAll
            <li>Index 114 : queryOAPNodeAll
        * </ul>
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param node Name of the node which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, String node, long start, long end){
        return getRESTMetricQuery(queryIndex, application, tier, node, start, end, false);
    }
    
    /**
     * <p>
     * Returns MetricData for general node metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * <ul>
     *  <li><b>Agent Availability</b>
     *      <ul>
            * <li>Index 0  : Application Agent
            * <li>Index 1  : Machine Agent
     *      </ul>
     *  <li><b>Hardware Metrics</b>
     *      <ul>
            * <li>Index 2  : queryHDTierCPUBusy
            * <li>Index 3  : queryHDTierCPUIdle
            * <li>Index 4  : queryHDTierCPUStolen
            * <li>Index 5  : queryHDTierDisksKBReadPerSec
            * <li>Index 6  : queryHDTierDisksKBWrittenPerSec
            * <li>Index 7  : queryHDTierDisksReadPerSec
            * <li>Index 8  : queryHDTierDisksWritesPerSec
            * <li>Index 9  : queryHDTierMemoryFreePerc
            * <li>Index 10 : queryHDTierMemoryFreeMB
            * <li>Index 11 : queryHDTierMemoryTotalMB
            * <li>Index 12 : queryHDTierMemoryUsedPerc
            * <li>Index 13 : queryHDTierMemoryUsedMB
            * <li>Index 14 : queryHDTierNetworkIncomingKB
            * <li>Index 15 : queryHDTierNetworkIncomingKBPerSec
            * <li>Index 16 : queryHDTierNetworkIncomingPackets
            * <li>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
            * <li>Index 18 : queryHDTierNetworkOutgoingKB
            * <li>Index 19 : queryHDTierNetworkOutgoingKBPerSec
            * <li>Index 20 : queryHDTierNetworkOutgoingPackets
            * <li>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
            * <li>Index 22 : queryHDNodeSystemRQ
     *      </ul>
     *  <li><b>JVM Metrics</b>
     *      <ul>
     *          <li><b>Process Metrics</b>
     *              <ul>
                    * <li>Index 23 : queryJVMTierProcessCPUBurntMSPerMin
                    * <li>Index 24 : queryJVMTierProcessCPUUsagePerc
            *       </ul>
            *   <li><b>Garbage Collection Metrics</b>
            *       <ul>
                    * <li>Index 25 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
                    * <li>Index 26 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
                    * <li>Index 27 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
                    * <li>Index 28 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
                    * <li>Index 29 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
                    * <li>Index 30 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
                      <li>Index 31 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
                      <li>Index 32 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
                      <li>Index 33 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
                      <li>Index 34 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
                      <li>Index 35 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
                      <li>Index 36 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
                      <li>Index 37 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
                      <li>Index 38 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
                      <li>Index 39 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
                      <li>Index 40 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
                      <li>Index 41 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
                      <li>Index 42 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
                      <li>Index 43 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
                      <li>Index 44 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
            *       </ul>
            *   <li><b>Memory</b>
            *       <ul>
                    * <li>Index 45 : queryJVMTierMemoryHeapCommittedMB
                    * <li>Index 46 : queryJVMTierMemoryHeapCurrentUsageMB
                    * <li>Index 47 : queryJVMTierMemoryHeapMaxAvailableMB
                    * <li>Index 48 : queryJVMTierMemoryHeapUsedPerc
                    * <li>Index 49 : queryJVMTierMemoryNonHeapCommittedMB
                    * <li>Index 50 : queryJVMTierMemoryNonHeapCurrentUsageMB
                    * <li>Index 51 : queryJVMTierMemoryNonHeapMaxAvailableMB
                    * <li>Index 52 : queryJVMTierMemoryNonHeapUsedPerc
            *       </ul>
            *   <li><b>Thread Metric</b>
            *       <ul>
                    * <li>Index 53 : queryJVMTierThreadsCurrentNoOfThreads
            *       </ul>
            </ul>
     *  <li><b>Overall Application Performance</b>
     *      <ul>
            * <li>Index 54 : queryOAPTierStallCount
            * <li>Index 55 : queryOAPTierNumberOfVerySlowCalls
            * <li>Index 56 : queryOAPTierNumberOfSlowCalls
            * <li>Index 57 : queryOAPTierInfrastructureErrorsPerMinute
            * <li>Index 58 : queryOAPTierHttpErrorCodesPerMinute
            * <li>Index 59 : queryOAPTierExceptionsPerMinute
            * <li>Index 60 : queryOAPTierErrorsPerMinute
            * <li>Index 61 : queryOAPTierErrorPageRedirectsPerMinute
            * <li>Index 62 : queryOAPTierCallsPerMinute
            * <li>Index 63 : queryOAPTierAvgResponseTimeMS
     *      </ul>

*       <p>
         In order to make queries more efficient the following options were added to collect multiple 
         metrics from a a single tier or node.
        </p>
        <li><b>Multi Metric Queries</b>
        * <ul>
            <li>Index 100 : queryHDNodeCPUAll
            <li>Index 101 : queryHDNodeDisksAll
            <li>Index 102 : queryHDNodeMemoryAll
            <li>Index 103 : queryHDNodeNetworkAll
            <li>Index 104 : queryHDNodeSystemAll
            <li>Index 105 : queryJVMNodeProcessCPUAll
            <li>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
            <li>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
            <li>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
            <li>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
            <li>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
            <li>Index 111 : queryJVMNodeGarbageCollectionAll
            <li>Index 112 : queryJVMNodeMemoryHeapAll
            <li>Index 113 : queryJVMNodeMemoryNonHeapAll
            <li>Index 114 : queryOAPNodeAll
        * </ul>
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param node Name of the node which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * query=mq.queryAgentNodeAppAgentAvailability(tier, node, start, end, rollup);
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, String node, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" node ").append(node).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryAgentNodeAppAgentAvailability(tier, node, start, end, rollup);
                break;
            case 1:
                query=mq.queryAgentNodeMachineAgentAvailability(tier, node, start, end, rollup);
                break;
            case 2:
                query=mq.queryHWNodeCPUBusy(tier, node, start, end, rollup);
                break;
            case 3:
                query=mq.queryHWNodeCPUIdle(tier, node, start, end, rollup);
                break;
            case 4:
                query=mq.queryHWNodeCPUStolen(tier, node, start, end, rollup);
                break;
            case 5:
                query=mq.queryHWNodeDisksKBReadPerSec(tier, node, null, start, end, rollup);
                break;
            case 6:
                query=mq.queryHWNodeDisksKBWrittenPerSec(tier, node, null, start, end, rollup);
                break;
            case 7:
                query=mq.queryHWNodeDisksReadPerSec(tier, node, null, start, end, rollup);
                break;
            case 8:
                query=mq.queryHWNodeDisksWritesPerSec(tier, node, null, start, end, rollup);
                break;
            case 9:
                query=mq.queryHWNodeMemoryFreePerc(tier, node, start, end, rollup);
                break;
            case 10:
                query=mq.queryHWNodeMemoryFreeMB(tier, node, start, end, rollup);
                break;
            case 11:
                query=mq.queryHWNodeMemoryTotalMB(tier, node, start, end, rollup);
                break;
            case 12:
                query=mq.queryHWNodeMemoryUsedPerc(tier, node, start, end, rollup);
                break;
            case 13:
                query=mq.queryHWNodeMemoryUsedMB(tier, node, start, end, rollup);
                break;
            case 14:
                query=mq.queryHWNodeNetworkIncomingKB(tier, node, null, start, end, rollup);
                break;
            case 15:
                query=mq.queryHWNodeNetworkIncomingKBPerSec(tier, node, null, start, end, rollup);
                break;
            case 16:
                query=mq.queryHWNodeNetworkIncomingPackets(tier, node, null, start, end, rollup);
                break;
            case 17:
                query=mq.queryHWNodeNetworkIncomingPacketsPerSec(tier, node, null, start, end, rollup);
                break;
            case 18:
                query=mq.queryHWNodeNetworkOutgoingKB(tier, node, null, start, end, rollup);
                break;
            case 19:
                query=mq.queryHWNodeNetworkOutgoingKBPerSec(tier, node, null, start, end, rollup);
                break;
            case 20:
                query=mq.queryHWNodeNetworkOutgoingPackets(tier, node, null, start, end, rollup);
                break;
            case 21:
                query=mq.queryHWNodeNetworkOutgoingPacketsPerSec(tier, node, null, start, end, rollup);
                break;
            case 22:
                query=mq.queryHWNodeSystemRQ(tier, node, start, end, rollup);
                break;
            case 23:
                query=mq.queryJVMNodeProcessCPUBurntMSPerMin(tier, node, start, end, rollup);
                break;
            case 24:
                query=mq.queryJVMNodeProcessCPUUsagePerc(tier, node, start, end, rollup);
                break;
            case 25:
                query=mq.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 26:
                query=mq.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 27:
                query=mq.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 28:
                query=mq.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 29:
                query=mq.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 30:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(tier, node, start, end, rollup);
                break;
            case 31:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(tier, node, start, end, rollup);
                break;
            case 32:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 33:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(tier, node, start, end, rollup);
                break;
            case 34:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(tier, node, start, end, rollup);
                break;
            case 35:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 36:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(tier, node, start, end, rollup);
                break;
            case 37:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(tier, node, start, end, rollup);
                break;
            case 38:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 39:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(tier, node, start, end, rollup);
                break;
            case 40:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(tier, node, start, end, rollup);
                break;
            case 41:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 42:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(tier, node, start, end, rollup);
                break;
            case 43:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(tier, node, start, end, rollup);
                break;
            case 44:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 45:
                query=mq.queryJVMNodeMemoryHeapCommittedMB(tier, node, start, end, rollup);
                break;
            case 46:
                query=mq.queryJVMNodeMemoryHeapCurrentUsageMB(tier, node, start, end, rollup);
                break;
            case 47:
                query=mq.queryJVMNodeMemoryHeapMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 48:
                query=mq.queryJVMNodeMemoryHeapUsedPerc(tier, node, start, end, rollup);
                break;
            case 49:
                query=mq.queryJVMNodeMemoryNonHeapCommittedMB(tier, node, start, end, rollup);
                break;
            case 50:
                query=mq.queryJVMNodeMemoryNonHeapCurrentUsageMB(tier, node, start, end, rollup);
                break;
            case 51:
                query=mq.queryJVMNodeMemoryNonHeapMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 52:
                query=mq.queryJVMNodeMemoryNonHeapUsedPerc(tier, node, start, end, rollup);
                break;
            case 53:
                query=mq.queryJVMNodeThreadsCurrentNoOfThreads(tier, node, start, end, rollup);
                break;
            case 54:
                query=mq.queryOAPNodeStallCount(tier, node, start, end, rollup);
                break;
            case 55:
                query=mq.queryOAPNodeNumberOfVerySlowCalls(tier, node, start, end, rollup);
                break;
            case 56:
                query=mq.queryOAPNodeNumberOfSlowCalls(tier, node, start, end, rollup);
                break;
            case 57:
                query=mq.queryOAPNodeInfrastructureErrorsPerMinute(tier, node, start, end, rollup);
                break;
            case 58:
                query=mq.queryOAPNodeHttpErrorCodesPerMinute(tier, node, start, end, rollup);
                break;
            case 59:
                query=mq.queryOAPNodeExceptionsPerMinute(tier, node, start, end, rollup);
                break;
            case 60:
                query=mq.queryOAPNodeErrorsPerMinute(tier, node, start, end, rollup);
                break;
            case 61:
                query=mq.queryOAPNodeErrorPageRedirectsPerMinute(tier, node, start, end, rollup);
                break;
            case 62:
                query=mq.queryOAPNodeCallsPerMinute(tier, node, start, end, rollup);
                break;
            case 63:
                query=mq.queryOAPNodeAvgResponseTimeMS(tier, node, start, end, rollup);
                break;

            case 100: // All
                query=mq.queryHWNodeCPUAll(tier,node, start, end, rollup);
                break;
            case 101:
                query=mq.queryHWNodeDisksAll(tier,node, null, start, end, rollup);
                break;
            case 102:
                query=mq.queryHWNodeMemoryAll(tier,node, start, end, rollup);
                break;
            case 103:
                query=mq.queryHWNodeNetworkAll(tier,node, null, start, end, rollup);
                break;
            case 104:
                query=mq.queryHWNodeSystemAll(tier,node, start, end, rollup);
                break;
            case 105:
                query=mq.queryJVMNodeProcessCPUALL(tier,node, start, end, rollup);
                break;
            case 106:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheALL(tier,node, start, end, rollup);
                break;
            case 107:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceALL(tier,node, start, end, rollup);
                break;
            case 108:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenALL(tier,node, start, end, rollup);
                break;
            case 109:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenALL(tier,node, start, end, rollup);
                break;
            case 110:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(tier,node, start, end, rollup);
                break;
            case 111:
                query=mq.queryJVMNodeGarbageCollectionALL(tier,node, start, end, rollup);
                break;
            case 112:
                query=mq.queryJVMNodeMemoryHeapALL(tier,node, start, end, rollup);
                break;
            case 113:
                query=mq.queryJVMNodeMemoryNonHeapALL(tier,node, start, end, rollup);
                break;
            case 114:
                query=mq.queryOAPNodeAll(tier,node, start, end, rollup);
                break;

            default:
                
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ")
                    .append(queryIndex).append(" application ").append(application)
                    .append(" tier ").append(tier).append(" node ").append(node).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for EUM's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * <ul>
     *  <li><b>EUM Ajax</b>
     *      <ul>
                <li>Index  0 : EUM_AJAX_REQUESTS_PER_MIN
                <li>Index  1 : EUM_AJAX_REQUESTS_ERRORS_PER_MIN
                <li>Index  2 : EUM_AJAX_DOC_DOWNLOAD_TIME
                <li>Index  3 : EUM_AJAX_DOC_PROCESSING_TIME
                <li>Index  4 : EUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE
                <li>Index  5 : EUM_AJAX_APPLICATION_SERVER_TIME_MS
                <li>Index  6 : EUM_AJAX_END_USER_RESPONSE_TIME
                <li>Index  7 : EUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
                <li>Index  8 : EUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
                <li>Index  9 : EUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
                <li>Index  10 : EUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
                <li>Index  11 : EUM_AJAX_FIRST_BYTE_TIME_MS
                <li>Index  12 : EUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
                <li>Index  13 : EUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
                <li>Index  14 : EUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
                <li>Index  15 : EUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        *   </ul>
        <li><b>Base Pages</b>
        *   <ul>
                <li>Index  16 : queryEUM_BASE_PAGES_FRONT_END_TIME_MS
                <li>Index  17 : queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS
                <li>Index  18 : queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
                <li>Index  19 : queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS
                <li>Index  20 : queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS
                <li>Index  21 : queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE
                <li>Index  22 : queryEUM_BASE_PAGES_REQUESTS_PER_MIN
                <li>Index  23 : queryEUM_BASE_PAGES_DOC_READY_TIME_MS
                <li>Index  24 : queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME
                <li>Index  25 : queryEUM_BASE_PAGES_DOC_PROCESSING_TIME
                <li>Index  26 : queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS
                <li>Index  27 : queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE
                <li>Index  28 : queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS
                <li>Index  29 : queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS
                <li>Index  30 : queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS
                <li>Index  31 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME
                <li>Index  32 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
                <li>Index  33 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
                <li>Index  34 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
                <li>Index  35 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
                <li>Index  36 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS
                <li>Index  37 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
                <li>Index  38 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
                <li>Index  39 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
                <li>Index  40 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
                <li>Index  41 : queryEUM_BASE_PAGES_DOM_READY_TIME_MS
                <li>Index  42 : queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS
                <li>Index  43 : queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS
                <li>Index  44 : queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS
                <li>Index  45 : queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS
        *   </ul>
        * <li><b>IFrame</b>
        *   <ul>
                <li>Index  46 : queryEUM_IFRAME_FRONT_END_TIME_MS
                <li>Index  47 : queryEUM_IFRAME_DOCUMENT_READY_TIME_MS
                <li>Index  48 : queryEUM_IFRAME_TCP_CONNECT_TIME_MS
                <li>Index  49 : queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS
                <li>Index  50 : queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS
                <li>Index  51 : queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS
                <li>Index  52 : queryEUM_IFRAME_PAGE_RENDER_TIME_MS
                <li>Index  53 : queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
                <li>Index  54 : queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS
                <li>Index  55 : queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS
                <li>Index  56 : queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS
                <li>Index  57 : queryEUM_IFRAME_REQUESTS_PER_MINUTE
                <li>Index  58 : queryEUM_IFRAME_FIRST_BYTE_TIME_MS
                <li>Index  59 : queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
                <li>Index  60 : queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
                <li>Index  61 : queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
                <li>Index  62 : queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
                <li>Index  63 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS
                <li>Index  64 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
                <li>Index  65 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
                <li>Index  66 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
                <li>Index  67 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
                <li>Index  68 : queryEUM_IFRAME_DOM_READY_TIME_MS
                <li>Index  69 : queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS
                <li>Index  70 : queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS
                <li>Index  71 : queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS
                <li>Index  72 : queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS
        *   </ul>
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param urlPath URL path that was captured
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * 
     * 
     */
    public MetricDatas getRESTEUMMetricQuery(int queryIndex, String application, String urlPath, long start, long end){
        return getRESTEUMMetricQuery(queryIndex, application, urlPath, start, end, false);
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for EUM's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * <ul>
     *  <li><b>EUM Ajax</b>
     *      <ul>
                <li>Index  0 : EUM_AJAX_REQUESTS_PER_MIN
                <li>Index  1 : EUM_AJAX_REQUESTS_ERRORS_PER_MIN
                <li>Index  2 : EUM_AJAX_DOC_DOWNLOAD_TIME
                <li>Index  3 : EUM_AJAX_DOC_PROCESSING_TIME
                <li>Index  4 : EUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE
                <li>Index  5 : EUM_AJAX_APPLICATION_SERVER_TIME_MS
                <li>Index  6 : EUM_AJAX_END_USER_RESPONSE_TIME
                <li>Index  7 : EUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
                <li>Index  8 : EUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
                <li>Index  9 : EUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
                <li>Index  10 : EUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
                <li>Index  11 : EUM_AJAX_FIRST_BYTE_TIME_MS
                <li>Index  12 : EUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
                <li>Index  13 : EUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
                <li>Index  14 : EUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
                <li>Index  15 : EUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        *   </ul>
        <li><b>Base Pages</b>
        *   <ul>
                <li>Index  16 : queryEUM_BASE_PAGES_FRONT_END_TIME_MS
                <li>Index  17 : queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS
                <li>Index  18 : queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
                <li>Index  19 : queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS
                <li>Index  20 : queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS
                <li>Index  21 : queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE
                <li>Index  22 : queryEUM_BASE_PAGES_REQUESTS_PER_MIN
                <li>Index  23 : queryEUM_BASE_PAGES_DOC_READY_TIME_MS
                <li>Index  24 : queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME
                <li>Index  25 : queryEUM_BASE_PAGES_DOC_PROCESSING_TIME
                <li>Index  26 : queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS
                <li>Index  27 : queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE
                <li>Index  28 : queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS
                <li>Index  29 : queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS
                <li>Index  30 : queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS
                <li>Index  31 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME
                <li>Index  32 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
                <li>Index  33 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
                <li>Index  34 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
                <li>Index  35 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
                <li>Index  36 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS
                <li>Index  37 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
                <li>Index  38 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
                <li>Index  39 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
                <li>Index  40 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
                <li>Index  41 : queryEUM_BASE_PAGES_DOM_READY_TIME_MS
                <li>Index  42 : queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS
                <li>Index  43 : queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS
                <li>Index  44 : queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS
                <li>Index  45 : queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS
        *   </ul>
        * <li><b>IFrame</b>
        *   <ul>
                <li>Index  46 : queryEUM_IFRAME_FRONT_END_TIME_MS
                <li>Index  47 : queryEUM_IFRAME_DOCUMENT_READY_TIME_MS
                <li>Index  48 : queryEUM_IFRAME_TCP_CONNECT_TIME_MS
                <li>Index  49 : queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS
                <li>Index  50 : queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS
                <li>Index  51 : queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS
                <li>Index  52 : queryEUM_IFRAME_PAGE_RENDER_TIME_MS
                <li>Index  53 : queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
                <li>Index  54 : queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS
                <li>Index  55 : queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS
                <li>Index  56 : queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS
                <li>Index  57 : queryEUM_IFRAME_REQUESTS_PER_MINUTE
                <li>Index  58 : queryEUM_IFRAME_FIRST_BYTE_TIME_MS
                <li>Index  59 : queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
                <li>Index  60 : queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
                <li>Index  61 : queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
                <li>Index  62 : queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
                <li>Index  63 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS
                <li>Index  64 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
                <li>Index  65 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
                <li>Index  66 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
                <li>Index  67 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
                <li>Index  68 : queryEUM_IFRAME_DOM_READY_TIME_MS
                <li>Index  69 : queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS
                <li>Index  70 : queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS
                <li>Index  71 : queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS
                <li>Index  72 : queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS
        *   </ul>
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param urlPath URL path that was captured
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics 
     * @return {@link MetricDatas}
     * 
     */
    public MetricDatas getRESTEUMMetricQuery(int queryIndex, String application, String urlPath, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" url ").append(urlPath).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                // Agent query
                query=mq.queryEUM_AJAX_REQUESTS_PER_MIN(urlPath, start, end, rollup);
                break;
            case 1: 
                // Agent query
                query=mq.queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(urlPath, start, end, rollup);
                break;
            case 2: 
                // Agent query
                query=mq.queryEUM_AJAX_DOC_DOWNLOAD_TIME(urlPath, start, end, rollup);
                break;
            case 3: 
                // Agent query
                query=mq.queryEUM_AJAX_DOC_PROCESSING_TIME(urlPath, start, end, rollup);
                break;
            case 4: 
                // Agent query
                query=mq.queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 5: 
                // Agent query
                query=mq.queryEUM_AJAX_APPLICATION_SERVER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 6: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME(urlPath, start, end, rollup);
                break;
            case 7: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 8: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;    
            case 9: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 10: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 11: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 12: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 13: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 14: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 15: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 16: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FRONT_END_TIME_MS(urlPath, start, end, rollup);
                break;
            case 17: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 18: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 19: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 20: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(urlPath, start, end, rollup);
                break;
            case 21: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 22: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_REQUESTS_PER_MIN(urlPath, start, end, rollup);
                break;
            case 23: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 24: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(urlPath, start, end, rollup);
                break;
            case 25: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(urlPath, start, end, rollup);
                break;
            case 26: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS(urlPath, start, end, rollup);
                break;
            case 27: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 28: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 29: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 30: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS(urlPath, start, end, rollup);
                break;
            case 31: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(urlPath, start, end, rollup);
                break;
            case 32: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 33: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 34: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 35: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 36: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 37: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 38: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 39: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 40: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 41: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 42: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 43: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 44: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 45: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 46: 
                // Agent query
                query=mq.queryEUM_IFRAME_FRONT_END_TIME_MS(urlPath, start, end, rollup);
                break;
            case 47: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOCUMENT_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 48: 
                // Agent query
                query=mq.queryEUM_IFRAME_TCP_CONNECT_TIME_MS(urlPath, start, end, rollup);
                break;
            case 49: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS(urlPath, start, end, rollup);
                break;
            case 50: 
                // Agent query
                query=mq.queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 51: 
                // Agent query
                query=mq.queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS(urlPath, start, end, rollup);
                break;
            case 52: 
                // Agent query
                query=mq.queryEUM_IFRAME_PAGE_RENDER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 53: 
                // Agent query
                query=mq.queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 54: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS(urlPath, start, end, rollup);
                break;
            case 55: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS(urlPath, start, end, rollup);
                break;
            case 56: 
                // Agent query
                query=mq.queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 57: 
                // Agent query
                query=mq.queryEUM_IFRAME_REQUESTS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 58: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 59: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 60: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 61: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 62: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 63: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 64: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 65: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 66: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 67: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 68: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 69: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 70: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 71: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 72: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 100: 
                // Agent query
                query=mq.queryEUM_AJAX_All(urlPath, start, end, rollup);
                break;
            case 101: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_All(urlPath, start, end, rollup);
                break;
            case 102: 
                // Agent query
                query=mq.queryEUM_IFRAME_All(urlPath, start, end, rollup);
                break;
                
                
            default:
                
                break;
                
        }
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nMatching query was not found for queryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" url ").append(urlPath).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * Returns MetricData for Business Transaction's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * <ul>
        * <li>Index  0 : queryBTAVERAGE_BLOCK_TIME_MS
        * <li>Index  1 : queryBTAVERAGE_CPU_USED_MS
        * <li>Index  2 : queryBTAVERAGE_REQUEST_SIZE
        * <li>Index  3 : queryBTAVERAGE_RESPONSE_TIME
        * <li>Index  4 : queryBTAVERAGE_WAIT_TIME_MS
        * <li>Index  5 : queryBTCALL_PER_MINUTE
        * <li>Index  6 : queryBTERRORS_PER_MINUTE
        * <li>Index  7 : queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS
        * <li>Index  8 : queryBTNUMBER_OF_SLOW_CALLS
        * <li>Index  9 : queryBTNUMBER_OF_VERY_SLOW_CALLS
        * <li>Index 10 : queryBTSTALL_COUNT
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param btName Business transaction name
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * 
     */
    public MetricDatas getRESTBTMetricQuery(int queryIndex, String application, String tier, String btName, long start, long end){
        return getRESTBTMetricQuery(queryIndex, application, tier, btName, start, end,false);
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for Business Transaction's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * <ul>
        * <li>Index  0 : queryBTAVERAGE_BLOCK_TIME_MS
        * <li>Index  1 : queryBTAVERAGE_CPU_USED_MS
        * <li>Index  2 : queryBTAVERAGE_REQUEST_SIZE
        * <li>Index  3 : queryBTAVERAGE_RESPONSE_TIME
        * <li>Index  4 : queryBTAVERAGE_WAIT_TIME_MS
        * <li>Index  5 : queryBTCALL_PER_MINUTE
        * <li>Index  6 : queryBTERRORS_PER_MINUTE
        * <li>Index  7 : queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS
        * <li>Index  8 : queryBTNUMBER_OF_SLOW_CALLS
        * <li>Index  9 : queryBTNUMBER_OF_VERY_SLOW_CALLS
        * <li>Index 10 : queryBTSTALL_COUNT
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param btName Business transaction name
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * 
     */
    public MetricDatas getRESTBTMetricQuery(int queryIndex, String application, String tier, String btName, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" BT ").append(btName).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryBTAVERAGE_BLOCK_TIME_MS(application, tier, btName, start, end, rollup);
                break;
            case 1:
                query=mq.queryBTAVERAGE_CPU_USED_MS(application, tier, btName, start, end, rollup);
                break;
            case 2:
                query=mq.queryBTAVERAGE_REQUEST_SIZE(application, tier, btName, start, end, rollup);
                break;
            case 3:
                query=mq.queryBTAVERAGE_RESPONSE_TIME(application, tier, btName, start, end, rollup);
                break;
            case 4:
                query=mq.queryBTAVERAGE_WAIT_TIME_MS(application, tier, btName, start, end, rollup);
                break;
            case 5:
                query=mq.queryBTCALL_PER_MINUTE(application, tier, btName, start, end, rollup);
                break;
            case 6:
                query=mq.queryBTERRORS_PER_MINUTE(application, tier, btName, start, end, rollup);
                break;
            case 7:
                query=mq.queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(application, tier, btName, start, end, rollup);
                break;
            case 8:
                query=mq.queryBTNUMBER_OF_SLOW_CALLS(application, tier, btName, start, end, rollup);
                break;
            case 9:
                query=mq.queryBTNUMBER_OF_VERY_SLOW_CALLS(application, tier, btName, start, end, rollup);
                break;
            case 10:
                query=mq.queryBTSTALL_COUNT(application, tier, btName, start, end, rollup);
                break;
            case 100:
                query=mq.queryAllMetricsForBT(application, tier, btName, start, end, rollup);
                break;
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(application).append(" tier ").append(tier).append(" BT ").append(btName).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for Backend's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * <ul>
        * <li>Index  0 : queryBackendAverageResponseTimeMS
        * <li>Index  1 : queryBackendCallsPerMinute
        * <li>Index  2 : queryBackendErrorsPerMinute
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param backend Name of the backend which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * 
     */
    public MetricDatas getRESTBackendMetricQuery(int queryIndex, String application, String backend, long start, long end){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" tier ").append(backend).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryBackendAverageResponseTimeMS(application, backend, start, end, false);
                break;
            case 1:
                query=mq.queryBackendCallsPerMinute(application, backend, start, end, false);
                break;
            case 2:
                query=mq.queryBackendErrorsPerMinute(application, backend, start, end, false);
                break;
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(application).append(" tier ").append(backend).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for Backend's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * <ul>
        * <li>Index  0 : queryBackendAverageResponseTimeMS
        * <li>Index  1 : queryBackendCallsPerMinute
        * <li>Index  2 : queryBackendErrorsPerMinute
     * </ul>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param backend Name of the backend which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * 
     */
    public MetricDatas getRESTBackendMetricQuery(int queryIndex, String application, String backend, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" backend ").append(backend).toString());}
        
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryBackendAverageResponseTimeMS(application, backend, start, end, rollup);
                break;
            case 1:
                query=mq.queryBackendCallsPerMinute(application, backend, start, end, rollup);
                break;
            case 2:
                query=mq.queryBackendErrorsPerMinute(application, backend, start, end, rollup);
                break;
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(application).append(" backend ").append(backend).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
        
}

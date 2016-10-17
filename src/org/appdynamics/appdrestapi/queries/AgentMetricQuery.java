/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author soloink
 */
public class AgentMetricQuery{
    
    /**
     * 
     * <p>
     *   This query will return the 'Availabitlity' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Agent|App|Availability
     * </p>
     * <p>
     *   This query will return the 'Availability' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|App|Availability
     * </p>
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryAgentNodeAppAgentAvailability(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(node).append(s.AGENT).append(s.AGENT_APP).append(s.AVAILABILITY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        return val.toString();
    }
    
    
    /**
     * 
     * <p>
     *   This query will return the 'Availabitlity' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Agent|Machine|Availability
     * </p>
     * <p>
     *   This query will return the 'Availability' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Machine|Availability
     * </p>
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryAgentNodeMachineAgentAvailability(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(node).append(s.AGENT).append(s.AGENT_MACHINE).append(s.AVAILABILITY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        return val.toString();
    }
    
    
    
    /**
     *
     * <p>
     *   This query will return the 'TopSummaryStats Exceeding Limit' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Agent|TopSummaryStats Upload|TopSummaryStats Exceeding Limit
     * </p>
     * <p>
     *   This query will return the 'TopSummaryStats Exceeding Limit' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|TopSummaryStats Upload|TopSummaryStats Exceeding Limit
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryNodeAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(String baseURL, String application,String tier, 
            String node, long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(s.AGENT).append(s.AGENT_TOP_SUMMARY_UPLOAD).append(s.AGENT_TOP_SUMMARY_STATS_EXCEED_LIMIT);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
    }
    
    
    /**
     * 
     * <p>
     *   This query will return the 'Invalid TopSummaryStats' from a Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Agent|TopSummaryStats Upload|Invalid TopSummaryStats
     * </p>
     * <p>
     * This query will return the 'Invalid TopSummaryStats' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|TopSummaryStats Upload|Invalid TopSummaryStats
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     */
    public static String queryNodeAgentTopSummaryStatsUploadInvalidTopSummaryStats(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(s.AGENT).append(s.AGENT_TOP_SUMMARY_UPLOAD).append(s.AGENT_TOP_SUMMARY_STATS_INVALID_TOPSUMMARY_STATS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
    }
    

    
    /**
     * 
     * <p>
     * This query will return the 'TopSummaryStats uploaded' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|TopSummaryStats Upload|TopSummaryStats uploaded
     * </p>
     * <p>
     * This query will return the 'TopSummaryStats uploaded' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|TopSummaryStats Upload|TopSummaryStats uploaded
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     * 
     */
    public static String queryNodeAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(s.AGENT).append(s.AGENT_TOP_SUMMARY_UPLOAD).append(s.AGENT_TOP_SUMMARY_STATS_UPLOADED);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
        
    }
    
    
    
    /**
     * 
     * <p>
     * This query will return the 'TopSummaryStats Time skew Errors' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|TopSummaryStats Upload|TopSummaryStats Time skew Errors
     * </p>
     * <p>
     * This query will return the 'TopSummaryStats Time skew Errors' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|TopSummaryStats Upload|TopSummaryStats Time skew Errors
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     * 
     */
    public static String queryNodeAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(s.AGENT).append(s.AGENT_TOP_SUMMARY_UPLOAD).append(s.AGENT_TOP_SUMMARY_STATS_TIME_SKEW_ERRORS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
        
    }
    
    
    /**
     * 
     * <p>
     * This query will return the 'Registration Successful' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Discovered Backends|Registration Successful
     * </p>
     * <p>
     * This query will return the 'Registration Successful' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Discovered Backends|Registration Successful
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     * 
     */
    public static String queryNodeAgentDiscoveredBackendsRegistrationSuccessful(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(s.AGENT).append(s.AGENT_DISCOVERED_BACKENDS).append(s.AGENT_DISCOVERED_BACKENDS_REGISTRATION_SUCCESSFUL);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
    }
    

    
    /**
     * 
     * <p>
     * This query will return the 'Registration Failed' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Discovered Backends|Registration Failed
     * </p>
     * <p>
     * This query will return the 'Registration Failed' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Discovered Backends|Registration Failed
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     * 
     */
    public static String queryNodeAgentDiscoveredBackendsRegistrationFailed(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(s.AGENT).append(s.AGENT_DISCOVERED_BACKENDS).append(s.AGENT_DISCOVERED_BACKENDS_REGISTRATION_FAILED);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
        
    }
    

    
    /**
     * 
     * <p>
     * This query will return the 'Unmonitored Calls per Minute' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Discovered Backends|Unmonitored Calls per Minute
     * </p>
     * <p>
     * This query will return the 'Unmonitored Calls per Minute' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Discovered Backends|Unmonitored Calls per Minute
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     * 
     */
    public static String queryNodeAgentDiscoveredBackendsUnmonitoredCallsPerMinute(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        bud.append(s.AGENT).append(s.AGENT_DISCOVERED_BACKENDS).append(s.AGENT_DISCOVERED_BACKENDS_UNMONITORED_CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
        
    }
    
    
    // Forced
    /**
     * 
     * <p>
     * This query will return the 'Number Of Application Infrastructure Changes Sent' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Config Channel|Number Of Application Infrastructure Changes Sent
     * </p>
     * <p>
     * This query will return the 'Number Of Application Infrastructure Changes Sent' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Config Channel|Number Of Application Infrastructure Changes Sent
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     * 
     */
    public static String queryNodeAgentConfigChannelNumberOfApplicationInfrastructureChangeSet(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        
        bud.append(s.AGENT).append(s.AGENT_CONFIG_CHANNEL).append(s.AGENT_CONFIG_CHANNEL_NUM_OF_APP_INFRA_CHANGES_SENT);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
    }
    
    /**
     * 
     * <p>
     * This query will return the 'Snapshots uploaded' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Snapshots uploaded
     * </p>
     * <p>
     * This query will return the 'Snapshots uploaded' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Snapshot Upload|Snapshots uploaded
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String 
     * 
     */
    public static String queryNodeAgentSnapshotUploadSnapshotsUploaded(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        if(node != null){
            bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        }else{
            bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        }
        
        bud.append(s.AGENT).append(s.AGENT_SNAPSHOT_UPLOAD).append(s.AGENT_SNAPSHOT_UPLOAD_SNAPSHOTS_UPLOADED);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
    }
    
/*

Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Invalid Snapshots
Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Time skew Errors
Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Snapshots Exceeding Limit
Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Requests License Errors
Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Invalid Metrics
Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Requests Time skew Errors
Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Metrics uploaded
Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Requests Exceeding Limit
Application Infrastructure Performance|[TIER]|Agent|Event Upload|Events uploaded
Application Infrastructure Performance|[TIER]|Agent|Event Upload|Events Exceeding Limit
Application Infrastructure Performance|[TIER]|Agent|Event Upload|Time skews Errors
Application Infrastructure Performance|[TIER]|Agent|Business Transactions|Unmonitored Calls per Minute
Application Infrastructure Performance|[TIER]|Agent|Business Transactions|Registration Failed
Application Infrastructure Performance|[TIER]|Agent|Business Transactions|Registration Successful
*/
    
}

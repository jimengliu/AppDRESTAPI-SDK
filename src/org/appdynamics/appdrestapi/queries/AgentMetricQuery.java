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
    public static String queryAgentNodeAppAgentAvailability(String baseURL, String application,String tier, String node, 
            long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        bud.append(s.AGENT).append(s.AGENT_APP).append(s.AVAILABILITY);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        bud.append(s.AGENT).append(s.AGENT_MACHINE).append(s.AVAILABILITY);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        bud.append(s.AGENT).append(s.AGENT_DISCOVERED_BACKENDS).append(s.AGENT_DISCOVERED_BACKENDS_UNMONITORED_CALLS_PER_MINUTE);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_SNAPSHOT_UPLOAD).append(s.AGENT_SNAPSHOT_UPLOAD_SNAPSHOTS_UPLOADED);
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
     * This query will return the 'Invalid Snapshots' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Invalid Snapshots
     * </p>
     * <p>
     * This query will return the 'Invalid Snapshots' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Snapshot Upload|Invalid Snapshots
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
    public static String queryNodeAgentSnapshotUploadInvalidSnapshots(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_SNAPSHOT_UPLOAD).append(s.AGENT_SNAPSHOT_UPLOAD_INVALID_SNAPSHOTS);
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
     * This query will return the 'Time skew Errors' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Time skew Errors
     * </p>
     * <p>
     * This query will return the 'Time skew Errors' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Snapshot Upload|Time skew Errors
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
    public static String queryNodeAgentSnapshotUploadTimeSkewErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_SNAPSHOT_UPLOAD).append(s.AGENT_SNAPSHOT_UPLOAD_TIME_SKEW_ERRORS);
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
     * This query will return the 'Snapshots Exceeding Limit' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Snapshots Exceeding Limit
     * </p>
     * <p>
     * This query will return the 'Snapshots Exceeding Limit' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Snapshot Upload|Snapshots Exceeding Limit
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
    public static String queryNodeAgentSnapshotUploadSnapshotsExceedingLimit(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_SNAPSHOT_UPLOAD).append(s.AGENT_SNAPSHOT_UPLOAD_SNAPSHOTS_EXCEEDING_LIMIT);
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
     * This query will return the 'Requests License Errors' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Requests License Errors
     * </p>
     * <p>
     * This query will return the 'Requests License Errors' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Metric Upload|Requests License Errors
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
    public static String queryNodeAgentMetricUploadRequestsLicenseErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_METRIC_UPLOAD).append(s.AGENT_METRIC_UPLOAD_REQUESTS_LICENSE_ERRORS);
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
     * This query will return the 'Invalid Metrics' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Invalid Metrics
     * </p>
     * <p>
     * This query will return the 'Invalid Metrics' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Metric Upload|Invalid Metrics
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
    public static String queryNodeAgentMetricUploadInvalidMetrics(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_METRIC_UPLOAD).append(s.AGENT_METRIC_UPLOAD_INVALID_METRICS);
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
     * This query will return the 'Requests Time skew Errors' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Requests Time skew Errors
     * </p>
     * <p>
     * This query will return the 'Requests Time skew Errors' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Metric Upload|Requests Time skew Errors
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
    public static String queryNodeAgentMetricUploadRequestsTimeSkewErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_METRIC_UPLOAD).append(s.AGENT_METRIC_UPLOAD_REQUESTS_TIME_SKEW_ERRORS);
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
     * This query will return the 'Metrics uploaded' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Metrics uploaded
     * </p>
     * <p>
     * This query will return the 'Metrics uploaded' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Metric Upload|Metrics uploaded
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
    public static String queryNodeAgentMetricUploadMetricsUpload(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_METRIC_UPLOAD).append(s.AGENT_METRIC_UPLOAD_METRICS_UPLOADED);
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
     * This query will return the 'Requests Exceeding Limit' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Metric Upload|Requests Exceeding Limit
     * </p>
     * <p>
     * This query will return the 'Requests Exceeding Limit' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Metric Upload|Requests Exceeding Limit
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
    public static String queryNodeAgentMetricUploadRequestsExceedingLimit(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_METRIC_UPLOAD).append(s.AGENT_METRIC_UPLOAD_REQUESTS_EXCEEDING_LIMIT);
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
     * This query will return the 'Events uploaded' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Event Upload|Events uploaded
     * </p>
     * <p>
     * This query will return the 'Events uploaded' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Event Upload|Events uploaded
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
    public static String queryNodeAgentEventUploadEventsUploaded(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_EVENT_UPLOAD).append(s.AGENT_EVENT_UPLOAD_EVENTS_UPLOADED);
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
     * This query will return the 'Events Exceeding Limit' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Event Upload|Events Exceeding Limit
     * </p>
     * <p>
     * This query will return the 'Events Exceeding Limit' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Event Upload|Events Exceeding Limit
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
    public static String queryNodeAgentEventUploadEventsExceedingLimit(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_EVENT_UPLOAD).append(s.AGENT_EVENT_UPLOAD_EVENTS_UPLOADED);
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
     * This query will return the 'Time skews Errors' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Event Upload|Time skews Errors
     * </p>
     * <p>
     * This query will return the 'Time skews Errors' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Event Upload|Time skews Errors
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
    public static String queryNodeAgentEventUploadTimeSkewsErrors(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_EVENT_UPLOAD).append(s.AGENT_EVENT_UPLOAD_TIME_SKEWS_ERRORS);
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
     * This query will return the 'Unmonitored Calls per Minute' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Business Transactions|Unmonitored Calls per Minute
     * </p>
     * <p>
     * This query will return the 'Unmonitored Calls per Minute' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Business Transactions|Unmonitored Calls per Minute
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
    public static String queryNodeAgentBusinessTransactionsUnmonitoredCallsPerMinute(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_BUSINESS_TRANSACTIONS).append(s.AGENT_BUSINESS_TRANSACTIONS_UNMONITORED_CALLS_PER_MINUTE);
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
     * This query will return the 'Registration Failed' from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Business Transactions|Registration Failed
     * </p>
     * <p>
     * This query will return the 'Registration Failed' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Business Transactions|Registration Failed
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
    public static String queryNodeAgentBusinessTransactionsRegistrationFailed(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_BUSINESS_TRANSACTIONS).append(s.AGENT_BUSINESS_TRANSACTIONS_REGISTRATION_FAILED);
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
     * Application Infrastructure Performance|[TIER]|Agent|Business Transactions|Registration Successful
     * </p>
     * <p>
     * This query will return the 'Registration Successful' from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Agent|Business Transactions|Registration Successful
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
    public static String queryNodeAgentBusinessTransactionsRegistrationSuccessful(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null){
            bud.append(s.INDIVIDUAL_NODES).append(node);
        }
        
        bud.append(s.AGENT).append(s.AGENT_BUSINESS_TRANSACTIONS).append(s.AGENT_BUSINESS_TRANSACTIONS_REGISTRATION_SUCCESSFUL);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
        
    }
    
    
}

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
    
    
    public static String queryAgentNodeAppAgentAvailability(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.INDIVIDUAL_NODES);
        bud.append(node).append(s.AGENT).append(s.AGENT_APP).append(s.AVAILABILITY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        return val.toString();
    }
    
    public static String queryAgentTierAppAgentAvailability(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.AGENT).append(s.AGENT_APP).append(s.AVAILABILITY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        return val.toString();
    }
    
    /*
     * 
     *  This is going to grab the node availability
     */
    public static String queryAgentNodeMachineAgentAvailability(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.INDIVIDUAL_NODES);
        bud.append(node).append(s.AGENT).append(s.AGENT_MACHINE).append(s.AVAILABILITY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        return val.toString();
    }
    
    /*
     *  This will grab the Tier availability, for the time period provided.
     *  
     */
    public static String queryAgentTierMachineAgentAvailability(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.AGENT).append(s.AGENT_MACHINE).append(s.AVAILABILITY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        return val.toString();
    }
    
    /**
     * <p>
     *   This query will return the TopSummaryStats Exceeding Limit from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Agent|TopSummaryStats Upload|TopSummaryStats Exceeding Limit
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryTierAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
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
     *   This query will return the TopSummaryStats Exceeding Limit from a Node perspective for example:
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
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
     *   This query will return the Invalid TopSummaryStats Limit from a Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Agent|TopSummaryStats Upload|Invalid TopSummaryStats
     * </p>
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryTierAgentTopSummaryStatsUploadInvalidTopSummaryStats(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        bud.append(s.AGENT).append(s.AGENT_TOP_SUMMARY_UPLOAD).append(s.AGENT_TOP_SUMMARY_STATS_INVALID_TOPSUMMARY_STATS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
    }
    
    /**
     * <p>
     * This query will return the Invalid TopSummaryStats from a Node perspective for example:
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
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
     * This query will return the TopSummaryStats uploaded from a Node perspective for example:
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
     */
    public static String queryTierAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(String baseURL, String application,String tier, 
            long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
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
     * This query will return the TopSummaryStats uploaded from a Node perspective for example:
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
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
     * This query will return the TopSummaryStats Time skew Errors from a Node perspective for example:
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
    public static String queryTierAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(String baseURL, String application,String tier,
            long start, long end, boolean rollup){
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
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
     * This query will return the TopSummaryStats Time skew Errors from a Node perspective for example:
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
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
     * This query will return the Registration Successful from a Tier perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Discovered Backends|Registration Successful
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
    public static String queryTierAgentDiscoveredBackendsRegistrationSuccessful(String baseURL, String application,String tier,
            long start, long end, boolean rollup){
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
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
     * This query will return the Registration Successful from a Node perspective for example:
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
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
     * This query will return the Registration Failed from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Discovered Backends|Registration Failed
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
    public static String queryTierAgentDiscoveredBackendsRegistrationFailed(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(node);
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
     * This query will return the Registration Failed from a Node perspective for example:
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
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
     * This query will return the RUnmonitored Calls per Minute from a Node perspective for example:
     * Application Infrastructure Performance|[TIER]|Agent|Discovered Backends|Unmonitored Calls per Minute
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
    public static String queryTierAgentDiscoveredBackendsUnmonitoredCallsPerMinute(String baseURL, String application,String tier, String node ,
            long start, long end, boolean rollup){
        
        StringBuilder val = new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
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
     * This query will return the RUnmonitored Calls per Minute from a Node perspective for example:
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
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.AGENT).append(s.AGENT_DISCOVERED_BACKENDS).append(s.AGENT_DISCOVERED_BACKENDS_UNMONITORED_CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        return val.toString();
        
    }
    
/*
Application Infrastructure Performance|[TIER]|Agent|ConfigChannel|Number Of Application Infrastructure Changes Sent
Application Infrastructure Performance|[TIER]|Agent|Snapshot Upload|Snapshots uploaded
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

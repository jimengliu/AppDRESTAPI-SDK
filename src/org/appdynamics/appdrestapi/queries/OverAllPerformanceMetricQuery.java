/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
    * 
 */
public class OverAllPerformanceMetricQuery {
    
    // This is going to grab all of the metrics    
    /**
     * 
     * <p>
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Overall Application Performance|[TIER]|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Overall Application Performance|[TIER]|Individual Nodes|[NODE]|*
     * </p>
     *  
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
    public static String queryOAPNodeAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.P).append(s._ALL_);
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
     *   This query will return 'Stall Count' from the Tier perspective for example:
     *     Overall Application Performance|[TIER]|Stall Count
     * </p>
     * <p>
     *   This query will return 'Stall Count' from a Node perspective for example:
     *     Overall Application Performance|[TIER]|Individual Nodes|[NODE]|Stall Count
     * </p>
     *  
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
    //Stall Count  Overall Application Performance|AAC-App|Stall Count
    public static String queryOAPNodeStallCount(String baseURL, String application, String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.STALL_COUNT);
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
     *   This query will return 'Number of Very Slow Calls' from the Tier perspective for example:
     *     Overall Application Performance|[TIER]|Number of Very Slow Calls
     * </p>
     * <p>
     *   This query will return 'Number of Very Slow Calls' from a Node perspective for example:
     *     Overall Application Performance|[TIER]|Individual Nodes|[NODE]|Number of Very Slow Calls
     * </p>
     *  
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
    // Overall Application Performance|AAC-App|Number of Very Slow Calls
    public static String queryOAPNodeNumberOfVerySlowCalls(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.NUMBER_OF_VERY_SLOW_CALLS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    
    // Overall Application Performance|AAC-App|Number of Slow Calls
    public static String queryOAPNodeNumberOfSlowCalls(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.NUMBER_OF_SLOW_CALLS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    
    // Overall Application Performance|AAC-App|Infrastructure Errors per Minute
    public static String queryOAPNodeInfrastructureErrorsPerMinute(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.INFRASTRUCTURE_ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    
    //Overall Application Performance|AAC-App|HTTP Error Codes per Minute
    
    public static String queryOAPNodeHttpErrorCodesPerMinute(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HTTP_ERROR_CODES_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    
    //Overall Application Performance|AAC-App|Exceptions per Minute   
    public static String queryOAPNodeExceptionsPerMinute(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.EXCEPTIONS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    // Overall Application Performance|AAC-App|Errors per Minute 
    public static String queryOAPNodeErrorsPerMinute(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    //Error Page Redirects per Minute    Overall Application Performance|AAC-App|Error Page Redirects per Minute
    public static String queryOAPNodeErrorPageRedirectsPerMinute(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.ERROR_PAGE_REDIRECTS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    //  Overall Application Performance|AAC-App|Calls per Minute  
    public static String queryOAPNodeCallsPerMinute(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    // Overall Application Performance|AAC-App|Average Response Time (ms)   
    public static String queryOAPNodeAvgResponseTimeMS(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.AVERAGE_RESPONSE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    
    // Overall Application Performance|AAC-App|External Calls|[BACKEND]|Calls per Minute
    public static String queryOAPNodeExternalCallsCallsPerMinute(String baseURL, String application,String tier, String node, String obj, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.EXTERNAL_CALLS);
        if(obj != null){ bud.append(obj);}
        else{ bud.append(s._ALL_);}
        bud.append(s.CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    // Overall Application Performance|AAC-App|External Calls|[BACKEND]|Errors per Minute
    public static String queryOAPNodeExternalCallsErrorsPerMinute(String baseURL, String application,String tier, String node, String obj, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.EXTERNAL_CALLS);
        if(obj != null){ bud.append(obj);}
        else{ bud.append(s._ALL_);}
        bud.append(s.ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    // Overall Application Performance|AAC-App|External Calls|[BACKEND]|Average Response Time (ms)
    public static String queryOAPNodeExternalCallsAverageResponseTimeMS(String baseURL, String application,String tier, String node, String obj, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.EXTERNAL_CALLS);
        if(obj != null){ bud.append(obj);}
        else{ bud.append(s._ALL_);}
        bud.append(s.AVERAGE_RESPONSE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
    
    
    // Overall Application Performance|AAC-App|Thread Tasks|LicenseFileTracker|Calls per Minute
    public static String queryOAPNodeThreadTasksLicenseFileTrackerCallsPerMinute(String baseURL, String application,String tier, String node, String obj, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.OVERALL_APPLICATION_PERF);
        if(tier != null) bud.append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.THREAD_TASKS).append(s.LICENSE_FILE_TRACKER).append(s.CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;        
        
        return val.toString();
    }
}

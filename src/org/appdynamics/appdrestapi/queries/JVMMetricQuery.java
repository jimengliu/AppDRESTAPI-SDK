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
public class JVMMetricQuery {
    //All
    /**
     * 
     * <p>
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|*
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
    public static String queryJVMNodeProcessCPUALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s._ALL_);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    // JVM 

    /**
     * 
     * <p>
     *   This query will return the 'Process CPU Burnt (ms/min)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Process CPU Burnt (ms/min)
     * </p>
     * <p>
     *   This query will return the 'Process CPU Burnt (ms/min)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Process CPU Burnt (ms/min)
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
    public static String queryJVMNodeProcessCPUBurntMSPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_PROCESS_CPU_BURNT_MS_PER_MIN);
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
     *   This query will return the 'Process CPU Usage %' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Process CPU Usage %
     * </p>
     * <p>
     *   This query will return the 'Process CPU Usage %' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Process CPU Usage %
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
    public static String queryJVMNodeProcessCPUUsagePerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_PROCESS_CPU_USAGE_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /*  *************************** GarbageCollection| Moemory Pools| Code Cache *******************************  */
    
    
    
    
    /* *************** GarbageCollection Memory Pools Code Cache *********************** */   
    /**
     * 
     * <p>
     *   This query will return all metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Code Cache|*
     * </p>
     * <p>
     *   This query will return all metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Code Cache|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CODE_CACHE).append(s._ALL_);
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
     *   This query will return the 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Code Cache|Committed (MB)
     * </p>
     * <p>
     *   This query will return the 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Code Cache|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CODE_CACHE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return the 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Code Cache|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return the 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Code Cache|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_CODE_CACHE);
        bud.append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return the 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Code Cache|Max Available (MB)
     * </p>
     * <p>
     *   This query will return the 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Code Cache|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CODE_CACHE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* *************** GarbageCollection Memory Pools PS Eden *********************** */

    // All Memory Pools PS Eden Space
    /**
     * 
     * <p>
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Eden Space|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Eden Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PS_EDEN_SPACE).append(s._ALL_);
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
     *   This query will return the 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Eden Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return the 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Eden Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_EDEN_SPACE);
        bud.append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return the 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Eden Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return the 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Eden Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_EDEN_SPACE);
        bud.append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return the 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Eden Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return the 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Eden Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_EDEN_SPACE);
        bud.append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* *************** GarbageCollection Memory Pools PS Old Gen ************* */
    // All Memory Pools PS Old Gen
    /**
     * 
     * <p>
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Old Gen|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Old Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PS_OLD_GEN).append(s._ALL_);
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
     *   This query will return the 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Old Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return the 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Old Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_OLD_GEN);
        bud.append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return the 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Old Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return the 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Old Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier).append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_OLD_GEN);
        bud.append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return the 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Old Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return the 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Old Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_OLD_GEN);
        bud.append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    
    /* *************** GarbageCollection Memory Pools PS Survivor Space ******* */
    // All Memory Pools PS Survivor Space
    /**
     * 
     * <p>
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PS_SURVIVOR_SPACE).append(s._ALL_);
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
     *   This query will return the 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return the 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_SURVIVOR_SPACE);
        bud.append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return the 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return the 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_SURVIVOR_SPACE);
        bud.append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return the 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return the 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_SURVIVOR_SPACE);
        bud.append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    /* *************** GarbageCollection Memory Pools PS Perm Gen *********** */
    // All Memory Pools PS Perm Gen
    /**
     * 
     * <p>
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PS_PERM_GEN).append(s._ALL_);
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
     *   This query will return the 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return the 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_PERM_GEN);
        bud.append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return the 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return the 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_PERM_GEN);
        bud.append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return the 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return the 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS).append(s.JVM_PS_PERM_GEN);
        bud.append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* *************** GarbageCollection ********************************* */
    
    /**
     * 
     * <p>
     *   This query will return the all metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|*
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
    public static String queryJVMNodeGarbageCollectionALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s._ALL_);
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
     *   This query will return the 'GC Time Spent Per Min (ms)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|GC Time Spent Per Min (ms)
     * </p>
     * <p>
     *   This query will return the 'GC Time Spent Per Min (ms)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|GC Time Spent Per Min (ms)
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
    public static String queryJVMNodeGarbageCollectionGCTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_GC_TIME_SPENT_PER_MIN_MS);
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
     *   This query will return the 'Major Collection Time Spent Per Min (ms)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Major Collection Time Spent Per Min (ms)
     * </p>
     * <p>
     *   This query will return the 'Major Collection Time Spent Per Min (ms)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Major Collection Time Spent Per Min (ms)
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
    public static String queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_MAJOR_COLLECTION_TIME_SPENT_PER_MIN_MS);
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
     *   This query will return the 'Minor Collection Time Spent Per Min (ms)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Minor Collection Time Spent Per Min (ms)
     * </p>
     * <p>
     *   This query will return the 'Minor Collection Time Spent Per Min (ms)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Minor Collection Time Spent Per Min (ms)
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
    public static String queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_MINOR_COLLECTION_TIME_SPENT_PER_MIN_MS);
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
     *   This query will return the 'Number of Major Collections Per Min' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Number of Major Collections Per Min
     * </p>
     * <p>
     *   This query will return the 'Number of Major Collections Per Min' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Number of Major Collections Per Min
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
    public static String queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_NUMBER_OF_MAJOR_COLLECTION_PER_MIN);
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
     *   This query will return the 'Number of Minor Collections Per Min' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Number of Minor Collections Per Min
     * </p>
     * <p>
     *   This query will return the 'Number of Minor Collections Per Min' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Number of Minor Collections Per Min
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
    public static String queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_NUMBER_OF_MINOR_COLLECTIONS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* *************************** JVM Memory Heap ****************************** */
    
    /**
     * 
     * <p>
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Heap|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Heap|*
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
    public static String queryJVMNodeMemoryHeapALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Heap|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Heap|Committed (MB)
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
    public static String queryJVMNodeMemoryHeapCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Heap|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Heap|Current Usage (MB)
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
    public static String queryJVMNodeMemoryHeapCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Heap|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Heap|Max Available (MB)
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
    public static String queryJVMNodeMemoryHeapMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return 'Used %' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Heap|Used %
     * </p>
     * <p>
     *   This query will return 'Used %' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Heap|Used %
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
    public static String queryJVMNodeMemoryHeapUsedPerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* **** JVM Memory Non-Heap ***** */
    /**
     * 
     * <p>
     *   This query will return 'Used %' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Non-Heap|*
     * </p>
     * <p>
     *   This query will return 'Used %' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Non-Heap|*
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
    public static String queryJVMNodeMemoryNonHeapALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Non-Heap|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Non-Heap|Committed (MB)
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
    public static String queryJVMNodeMemoryNonHeapCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Non-Heap|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Non-Heap|Current Usage (MB)
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
    public static String queryJVMNodeMemoryNonHeapCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Non-Heap|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Non-Heap|Max Available (MB)
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
    public static String queryJVMNodeMemoryNonHeapMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return 'Used %' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Memory|Non-Heap|Used %
     * </p>
     * <p>
     *   This query will return 'Used %' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Memory|Non-Heap|Used %
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
    public static String queryJVMNodeMemoryNonHeapUsedPerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* *************************************** Threads ****************************************************************************************************** */
    /**
     * 
     * <p>
     *   This query will return 'Current No. of Threads' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Threads|Current No. of Threads
     * </p>
     * <p>
     *   This query will return 'Current No. of Threads' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Threads|Current No. of Threads
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
    public static String queryJVMNodeCurrentNoOfThreads(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_THREADS_CURRENT_NO_OF_THREADS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* *************************************** Classes ****************************************************************************************************** */
    /**
     * 
     * <p>
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Classes|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Classes|*
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
    public static String queryJVMNodeClassesALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_CLASSES).append(s._ALL_);
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
     *   This query will return 'Current Loaded Class Count' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Classes|Current Loaded Class Count
     * </p>
     * <p>
     *   This query will return 'Current Loaded Class Count' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Classes|Current Loaded Class Count
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
    public static String queryJVMNodeClassesCurrentLoadedClassCount(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_CLASSES).append(s.JVM_CLASSES_CURRENT_LOADED_CLASS_COUNT);
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
     *   This query will return 'Total Classes Loaded' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Classes|Total Classes Loaded
     * </p>
     * <p>
     *   This query will return 'Total Classes Loaded' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Classes|Total Classes Loaded
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
    public static String queryJVMNodeClassesTotalClassesLoaded(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_CLASSES).append(s.JVM_CLASSES_TOTAL_CLASSES_LOADED);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
        
    }
    
    /* ************************************* Par Eden Space ********************************************************************************************* */
    /**
     * 
     * <p>
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Eden Space|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Eden Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_EDEN_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Eden Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Eden Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Eden Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Eden Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Eden Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Eden Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_EDEN_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
        
    }

    // Tenured 
    /**
     * 
     * <p>
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Tenured Gen|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Tenured Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_TENURED_GEN).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Tenured Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Tenured Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_TENURED_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Tenured Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Tenured Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_TENURED_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Tenured Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Tenured Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_TENURED_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_COMPRESSED_CLASS_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_COMPRESSED_CLASS_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_COMPRESSED_CLASS_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_COMPRESSED_CLASS_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Nursery|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Nursery|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsNurseryALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_NURSERY).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Nursery|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Nursery|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsNurseryCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_NURSERY).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Nursery|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Nursery|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_NURSERY).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Nursery|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Nursery|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_NURSERY).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Eden Space|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Eden Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_EDEN_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Eden Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Eden Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Eden Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Eden Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Eden Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Eden Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_EDEN_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all metrics a from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|*
     * </p>
     * <p>
     *   This query will return all metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_PERM_GEN).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_PERM_GEN).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_PERM_GEN).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_PERM_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_PERM_GEN).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_PERM_GEN).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_PERM_GEN).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_PERM_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_SURVIVOR_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PAR_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_SURVIVOR_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Perm Gen|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Perm Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPermGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PERM_GEN).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Perm Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Perm Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPermGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PERM_GEN).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Perm Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Perm Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PERM_GEN).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Perm Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Perm Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_PERM_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Survivor Space|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Survivor Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_SURVIVOR_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Survivor Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Survivor Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Survivor Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Survivor Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Survivor Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Survivor Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_SURVIVOR_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Old Space|*
     * </p>
     * <p>
     *   This query will return all the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Old Space|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_OLD_SPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Old Space|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Old Space|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_OLD_SPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Old Space|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Old Space|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_OLD_SPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Old Space|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Old Space|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_OLD_SPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_OLD_GEN).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_OLD_GEN).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_OLD_GEN).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CMS_OLD_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Metaspace|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Metaspace|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_METASPACE).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Metaspace|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Metaspace|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_METASPACE).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Metaspace|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Metaspace|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_METASPACE).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Metaspace|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Metaspace|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_METASPACE).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_OLD_GEN).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_OLD_GEN).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_OLD_GEN).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_G1_OLD_GEN).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASSBLOCK_MEMORY).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASSBLOCK_MEMORY).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASSBLOCK_MEMORY).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASSBLOCK_MEMORY).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
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
     *   This query will return all of the metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Class Memory|*
     * </p>
     * <p>
     *   This query will return all of the metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Class Memory|*
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryALL(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASS_MEMORY).append(s._ALL_);
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
     *   This query will return 'Committed (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Class Memory|Committed (MB)
     * </p>
     * <p>
     *   This query will return 'Committed (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Class Memory|Committed (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASS_MEMORY).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
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
     *   This query will return 'Current Usage (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Class Memory|Current Usage (MB)
     * </p>
     * <p>
     *   This query will return 'Current Usage (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Class Memory|Current Usage (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASS_MEMORY).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
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
     *   This query will return 'Max Available (MB)' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|JVM|Garbage Collection|Memory Pools|Class Memory|Max Available (MB)
     * </p>
     * <p>
     *   This query will return 'Max Available (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|JVM|Garbage Collection|Memory Pools|Class Memory|Max Available (MB)
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.JVM).append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_MEMORY_POOLS);
        bud.append(s.JVM_CLASS_MEMORY).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        
        return val.toString();
        
    }

}

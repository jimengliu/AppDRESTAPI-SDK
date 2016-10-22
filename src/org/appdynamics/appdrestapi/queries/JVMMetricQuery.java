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
     *   This query will return the 'Outgoing Packets/sec' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Outgoing Packets/sec
     * </p>
     * <p>
     *   This query will return the 'Outgoing Packets/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Outgoing Packets/sec
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
    public static String queryJVMNodeProcessCPUAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s._ALL_);
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
    
    /*  *************************** GarbageCollection *******************************  */
    // High All
    
    // All Memory Pools Code Cache
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    // All Memory Pools PS Old Gen
    
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    // All Memory Pools PS Perm Gen
    
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    // All Memory Pools PS Survivor Space
    
    public static String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    /* *************** GarbageCollection Memory Pools Code Cache *********************** */   
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
    public static String queryJVMNodeGarbageCollectionAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    public static String queryJVMNodeMemoryHeapAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    public static String queryJVMNodeMemoryNonHeapAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    public static String queryJVMGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    public static String queryJVMGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    public static String queryJVMGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    /* 

Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Par Eden Space|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Par Eden Space|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Par Eden Space|Max Available (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Max Available (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsTenuredGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Tenured Gen|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Tenured Gen|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Tenured Gen|Max Available (MB)
    */
    public static String queryJVMGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Current Usage (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsNurseryCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Nursery|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Nursery|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Nursery|Max Available (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Eden Space|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Eden Space|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Eden Space|Max Available (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Current Usage (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1PermGenCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Current Usage (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Current Usage (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
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
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Committed (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsPermGenCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Perm Gen|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Perm Gen|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Perm Gen|Committed (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Survivor Space|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Survivor Space|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Survivor Space|Committed (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsOldSpaceCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Old Space|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Old Space|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Old Space|Max Available (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Max Available (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsMetaspaceCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Metaspace|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Metaspace|Current Usage (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Metaspace|Max Available (MB)
    */
    
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1OldGenCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Current Usage (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Current Usage (MB)
    */
    
    public static String queryJVMGarbageCollectionMemoryPoolsClassMemoryCommittedMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(){
        
    }
    
    public static String queryJVMGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(){
        
    }
    /*
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Class Memory|Committed (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Class Memory|Max Available (MB)
Application Infrastructure Performance|AAC-App|JVM|Garbage Collection|Memory Pools|Class Memory|Current Usage (MB)
    
    */
}

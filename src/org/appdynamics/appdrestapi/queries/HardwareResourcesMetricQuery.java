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
 * 
 * This is going to provide all of the queries for hardware metrics
 * 
 * 
 */
public class HardwareResourcesMetricQuery {
    // All CPU Metrics
    
    /**
     * 
     * <p>
     *   This query will return the all CPU metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|CPU|*
     * </p>
     * <p>
     *   This query will return the all CPU metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|CPU|*
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
    public static String queryHWNodeCPUAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s._ALL_);
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
     *   This query will return the '%Busy'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|CPU|%Busy
     * </p>
     * <p>
     *   This query will return the '%Busy' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|CPU|%Busy
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
    public static String queryHWNodeCPUBusy(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_BUSY);
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
     *   This query will return the '%Idle'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|CPU|%Idle
     * </p>
     * <p>
     *   This query will return the '%Idle' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|CPU|%Idle
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
    public static String queryHWNodeCPUIdle(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_CPU).append(s.HD_CPU_IDLE);
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
     *   This query will return the '%Stolen'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|CPU|%Stolen
     * </p>
     * <p>
     *   This query will return the '%Stolen' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|CPU|%Stolen
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
    public static String queryHWNodeCPUStolen(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_STOLEN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* ***************** Disk ************************** */
    
    
    /**
     * 
     * <p>
     *   This query will return all of the disk metrics  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|*
     * </p>
     * <p>
     *   This query will return all of the disk metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|*
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksAll(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS);
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
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
     *   This query will return the 'KB read/sec'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|KB read/sec
     * </p>
     * <p>
     *   This query will return the 'KB read/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|KB read/sec
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksKBReadPerSec(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_KB_READ_PER_SEC);
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
     *   This query will return the 'KB written/sec'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|KB written/sec
     * </p>
     * <p>
     *   This query will return the 'KB written/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|KB written/sec
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksKBWrittenPerSec(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_KB_WRITE_PER_SEC);
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
     *   This query will return the 'Reads/sec'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|Reads/sec
     * </p>
     * <p>
     *   This query will return the 'Reads/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|Reads/sec
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksReadPerSec(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_READ_PER_SEC);
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
     *   This query will return the 'Writes/sec'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|Writes/sec
     * </p>
     * <p>
     *   This query will return the 'Writes/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|Writes/sec
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksWritesPerSec(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_WRITES_PER_SEC);
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
     *   This query will return the 'Space Used'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|Space Used
     * </p>
     * <p>
     *   This query will return the 'Space Used' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|Space Used
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksSpaceUsed(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_SPACE_USED);
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
     *   This query will return the 'Avg Service Time (ms)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|Avg Service Time (ms)
     * </p>
     * <p>
     *   This query will return the 'Avg Service Time (ms)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|Avg Service Time (ms)
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksAvgServiceTimeMS(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_AVG_SERVICE_TIME_MS);
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
     *   This query will return the '% CPU Time'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|% CPU Time
     * </p>
     * <p>
     *   This query will return the '% CPU Time' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|% CPU Time
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksPerCPUTime(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_PER_CPU_TIME);
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
     *   This query will return the 'Space Available'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|Space Available
     * </p>
     * <p>
     *   This query will return the 'Space Available' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|Space Available
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksSpaceAvailable(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_SPACE_AVAILABLE);
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
     *   This query will return the 'Avg Queue Time (ms)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Disks|[DISK]|Avg Queue Time (ms)
     * </p>
     * <p>
     *   This query will return the 'Avg Queue Time (ms)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Disks|[DISK]|Avg Queue Time (ms)
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param disk Name of the disk
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeDisksAvgQueueTimeMS(String baseURL, String application,String tier, String node, String disk, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_DISKS);
        
        if(disk != null){ bud.append(disk);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_DISKS_AVG_QUEUE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
        
    }
    
    /* ***************** Volumes ************************ */
    
    /**
     * 
     * <p>
     *   This query will return all of the volume metrics  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Volumes|[VOLUME]|*
     * </p>
     * <p>
     *   This query will return all of the volume metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Volumes|[VOLUME]|*
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param volume Name of the volume
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeVolumesAll(String baseURL, String application,String tier, String node, String volume, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_VOLUMES);
        
        if(volume != null){ bud.append(volume);}
        else{bud.append(s._ALL_);}
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
     *   This query will return the 'Used (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Volumes|[VOLUME]|Used (MB)
     * </p>
     * <p>
     *   This query will return the 'Used (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Volumes|[VOLUME]|Used (MB)
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param volume Name of the volume
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeVolumesUsedMB(String baseURL, String application,String tier, String node, String volume, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_VOLUMES);
        
        if(volume != null){ bud.append(volume);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_MEMORY_USED_MB);
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
     *   This query will return the 'Free (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Volumes|[VOLUME]|Free (MB)
     * </p>
     * <p>
     *   This query will return the 'Free (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Volumes|[VOLUME]|Free (MB)
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param volume Name of the volume
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeVolumesFreeMB(String baseURL, String application,String tier, String node, String volume, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_VOLUMES);
        
        if(volume != null){ bud.append(volume);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_MEMORY_FREE_MB);
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
     *   This query will return the 'Used (%)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Volumes|[VOLUME]|Used (%)
     * </p>
     * <p>
     *   This query will return the 'Used (%)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Volumes|[VOLUME]|Used (%)
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param volume Name of the volume
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeVolumesUsedPer(String baseURL, String application,String tier, String node, String volume, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_VOLUMES);
        
        if(volume != null){ bud.append(volume);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_MEMORY_USED_PERC);
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
     *   This query will return the 'Total (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Volumes|[VOLUME]|Total (MB)
     * </p>
     * <p>
     *   This query will return the 'Total (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Volumes|[VOLUME]|Total (MB)
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param volume Name of the volume
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeVolumesTotalMB(String baseURL, String application,String tier, String node, String volume, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_VOLUMES);
        
        if(volume != null){ bud.append(volume);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s.HD_VOLUMES_TOTAL_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
        
    }

    /* ***************** Memory ************************ */
    /**
     * 
     * <p>
     *   This query will return all of the memory metrics  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|*
     * </p>
     * <p>
     *   This query will return all of the memory metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|*
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
    public static String queryHWNodeMemoryAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s._ALL_);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    // Memory Free Perc

    /**
     * 
     * <p>
     *   This query will return the metric 'Free %'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Free %
     * </p>
     * <p>
     *   This query will return the metric 'Free %' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Free %
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
    public static String queryHWNodeMemoryFreePerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_FREE_PERC);
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
     *   This query will return the metric 'Free (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Free (MB)
     * </p>
     * <p>
     *   This query will return the metric 'Free (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Free (MB)
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
    public static String queryHWNodeMemoryFreeMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_FREE_MB);
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
     *   This query will return the metric 'Total (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Total (MB)
     * </p>
     * <p>
     *   This query will return the metric 'Total (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Total (MB)
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
    public static String queryHWNodeMemoryTotalMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_TOTAL_MB);
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
     *   This query will return the metric 'Used %'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Used %
     * </p>
     * <p>
     *   This query will return the metric 'Used %' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Used %
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
    public static String queryHWNodeMemoryUsedPerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_USED_PERC);
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
     *   This query will return the metric 'Used (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Used (MB)
     * </p>
     * <p>
     *   This query will return the metric 'Used (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Used (MB)
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
    public static String queryHWNodeMemoryUsedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_USED_MB);
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
     *   This query will return the metric 'Swap Free (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Swap Free (MB)
     * </p>
     * <p>
     *   This query will return the metric 'Swap Free (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Swap Free (MB)
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
    public static String queryHWNodeMemorySwapFreeMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_SWAP_FREE_MB);
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
     *   This query will return the metric 'Swap Total (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Swap Total (MB)
     * </p>
     * <p>
     *   This query will return the metric 'Swap Total (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Swap Total (MB)
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
    public static String queryHWNodeMemorySwapTotalMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_SWAP_TOTAL_MB);
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
     *   This query will return the metric 'Swap Used (MB)'  from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Memory|Swap Used (MB)
     * </p>
     * <p>
     *   This query will return the metric 'Swap User (MB)' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Memory|Swap Used (MB)
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
    public static String queryHWNodeMemorySwapUsedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_SWAP_USED_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
        
    }
    
    
    /* ***************** Network *********************** */
    //All Network
    //Application Infrastructure Performance|AAC-App|Hardware Resources|Network|eth1|Outgoing KB
    
    /**
     * 
     * <p>
     *   This query will return all of the network metrics from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|*
     * </p>
     * <p>
     *   This query will return all of the network metrics from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|*
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkAll(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        if(card != null){bud.append(card);}
        else{bud.append(s._ALL_);}
        bud.append(s.P).append(s._ALL_);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    //NetworkIncomingKB

    /**
     * 
     * <p>
     *   This query will return the 'Incoming KB' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Incoming KB
     * </p>
     * <p>
     *   This query will return the 'Incoming KB' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Incoming KB
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkIncomingKB(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_INCOMING_KB);
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
     *   This query will return the 'Incoming KB/sec' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Incoming KB/sec
     * </p>
     * <p>
     *   This query will return the 'Incoming KB/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Incoming KB/sec
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkIncomingKBPerSec(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_INCOMING_KB_PER_SEC);
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
     *   This query will return the 'Incoming Packets' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Incoming Packets
     * </p>
     * <p>
     *   This query will return the 'Incoming Packets' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Incoming Packets
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkIncomingPackets(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_INCOMING_PACKETS);
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
     *   This query will return the 'Incoming Packets/sec' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Incoming Packets/sec
     * </p>
     * <p>
     *   This query will return the 'Incoming Packets/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Incoming Packets/sec
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkIncomingPacketsPerSec(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_INCOMING_PACKETS_PER_SEC);
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
     *   This query will return the 'Outgoing KB' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Outgoing KB
     * </p>
     * <p>
     *   This query will return the 'Outgoing KB' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Outgoing KB
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkOutgoingKB(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_OUTGOING_KB);
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
     *   This query will return the 'Outgoing KB/sec' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Outgoing KB/sec
     * </p>
     * <p>
     *   This query will return the 'Outgoing KB/sec' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Outgoing KB/sec
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkOutgoingKBPerSec(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_OUTGOING_KB_PER_SEC);
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
     *   This query will return the 'Outgoing Packets' from the Tier perspective for example:
     *     Application Infrastructure Performance|[TIER]|Hardware Resources|Network|[CARD]|Outgoing Packets
     * </p>
     * <p>
     *   This query will return the 'Outgoing Packets' from a Node perspective for example:
     *     Application Infrastructure Performance|[TIER]|Individual Nodes|[NODE]|Hardware Resources|Network|[CARD]|Outgoing Packets
     * </p>
     *  
     * 
     * @param baseURL Base URL for the controller
     * @param application Name of the application
     * @param tier Name of the tier
     * @param node Name of the node
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkOutgoingPackets(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_OUTGOING_PACKETS);
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
     * @param card Name of the network device
     * @param start Start time for the metric query
     * @param end End time for the metric query
     * @param rollup Whether to rollup the values
     * @return String
     */
    public static String queryHWNodeNetworkOutgoingPacketsPerSec(String baseURL, String application,String tier, String node, String card, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF).append(tier);
        if(node != null) bud.append(s.INDIVIDUAL_NODES).append(node);
        bud.append(s.HARDWARE_RESOURCES).append(s.HD_NETWORK);
        if(card != null){
            bud.append(card);
        }else{
            bud.append(s._ALL_);
        }
        bud.append(s.P).append(s.HD_NETWORK_OUTGOING_PACKETS_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        
        return val.toString();
    }
    
    /* ******************************** System *********************************** */
    //System All
    public static String queryHWTierSystemAll(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_SYSTEM).append(s._ALL_);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        
        return val.toString();
    }
    
    public static String queryHWNodeSystemAll(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_SYSTEM).append(s._ALL_);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);
        
        
        return val.toString();
    }
    //System
    public static String queryHWTierSystemRQ(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_SYSTEM).append(s.HD_RQ);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHWNodeSystemRQ(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_SYSTEM).append(s.HD_RQ);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
            
}

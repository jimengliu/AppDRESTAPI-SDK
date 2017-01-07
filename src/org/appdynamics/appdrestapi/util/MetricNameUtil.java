/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * Updated for 2.5.2
 * The key for this function is to find the name of the metric and be able to 
 * return the proper name, title or identification for the 
 */

/*




*/
public class MetricNameUtil {
    private static final String INDIV_NODES="Individual Nodes";
    private static final String DT="Default Type";
    private static final String DO="Default Object";
    
    
    public static String[] parse(String metricPath){
        
        if(metricPath != null){
            return metricPath.split("\\|");
        }
        return null;
    }

    /**
     * <p> Get the metric type
     * </p>
     * <ul>
     *      <li> Agent Status
     *      <ul>
                <li>Application Infrastructure Performance|ACME-App|Agent|App|Availability 0
                <li>Application Infrastructure Performance|ACME-App|Agent|Machine|Availability 1
            </ul>
            <li> Agent TopSummaryStats Upload
            <ul>
                <li>Application Infrastructure Performance|ACME-App|Agent|TopSummaryStats Upload|TopSummaryStats Exceeding Limit 2
                <li>Application Infrastructure Performance|ACME-App|Agent|TopSummaryStats Upload|Invalid TopSummaryStats 3
                <li>Application Infrastructure Performance|ACME-App|Agent|TopSummaryStats Upload|TopSummaryStats uploaded 4
                <li>Application Infrastructure Performance|ACME-App|Agent|TopSummaryStats Upload|TopSummaryStats Time skew Errors 5
*           </ul>
*           <li> Agent Discovered Backends
*           <ul>
            <li>Application Infrastructure Performance|ACME-App|Agent|Discovered Backends|Registration Successful 6
            <li>Application Infrastructure Performance|ACME-App|Agent|Discovered Backends|Registration Failed 7
            <li>Application Infrastructure Performance|ACME-App|Agent|Discovered Backends|Unmonitored Calls per Minute 8
*           </ul>
*           <li> Agent ConfigChannel
*           <ul>
            <li>Application Infrastructure Performance|ACME-App|Agent|ConfigChannel|Number Of Application Infrastructure Changes Sent 9
            </ul>
            <li> Agent Snapshots Upload
            <ul>
            <li>Application Infrastructure Performance|ACME-App|Agent|Snapshot Upload|Snapshots uploaded 10
            <li>Application Infrastructure Performance|ACME-App|Agent|Snapshot Upload|Invalid Snapshots 11
            <li>Application Infrastructure Performance|ACME-App|Agent|Snapshot Upload|Time skew Errors 12
            <li>Application Infrastructure Performance|ACME-App|Agent|Snapshot Upload|Snapshots Exceeding Limit 13
*           </ul>
*           <li> Agent Metric Upload
*           <ul>
            <li>Application Infrastructure Performance|ACME-App|Agent|Metric Upload|Requests License Errors 14
            <li>Application Infrastructure Performance|ACME-App|Agent|Metric Upload|Invalid Metrics 15
            <li>Application Infrastructure Performance|ACME-App|Agent|Metric Upload|Requests Time skew Errors 16
            <li>Application Infrastructure Performance|ACME-App|Agent|Metric Upload|Metrics uploaded 17
            <li>Application Infrastructure Performance|ACME-App|Agent|Metric Upload|Requests Exceeding Limit 18
*           </ul>
*           <li> Agent Event Upload
*           <ul>
            <li>Application Infrastructure Performance|ACME-App|Agent|Event Upload|Events uploaded 19
            <li>Application Infrastructure Performance|ACME-App|Agent|Event Upload|Events Exceeding Limit 20
            <li>Application Infrastructure Performance|ACME-App|Agent|Event Upload|Time skews Errors 21
*           </ul>
*           <li> Agent Business Transactions
*           <ul>
            <li>Application Infrastructure Performance|ACME-App|Agent|Business Transactions|Unmonitored Calls per Minute 22
            <li>Application Infrastructure Performance|ACME-App|Agent|Business Transactions|Registration Failed 23
            <li>Application Infrastructure Performance|ACME-App|Agent|Business Transactions|Registration Successful 24
*           </ul>
*    </ul>
     * @param mPath Metric Path
     * @param metricType Metric type 
     * @param metricQuery Metric query index
     * @param shortV If short value is needed
     * @return String[]
    */

    public static String[] getAgentMetricType(String[] mPath, int metricType, int metricQuery, boolean shortV){
        
        if(metricType > 0 && metricType < 2){
            switch(metricQuery){
                case 0:
                    return new String[]{"App Agent",DO};
                    
                case 1:
                    return new String[]{"Machine Agent",DO};
            }
        }
        if(metricType == 4) return new String[]{mPath[3],DO};
        if(metricType == 8) return new String[]{mPath[5],DO};
        return new String[]{DT,DO};
    }
    /**
     * <p>
     *  HW queries.
     * </p>
     * 
                Application Infrastructure Performance|ACME-App|Hardware Resources|CPU|%Stolen 0
                Application Infrastructure Performance|ACME-App|Hardware Resources|CPU|%Busy 1
                Application Infrastructure Performance|ACME-App|Hardware Resources|CPU|%Idle 2
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|Reads/sec 3
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|Space Used 4
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|Avg Service Time (ms) 5
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|% CPU Time 6
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|KB written/sec 7
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|Space Available 8
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|Avg Queue Time (ms) 9
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|Writes/sec 10
                Application Infrastructure Performance|ACME-App|Hardware Resources|Disks|dev-mapper-vglocal00-usr00|KB read/sec 11
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Swap Total (MB) 12
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Swap Used (MB) 13
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Total (MB) 14
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Used (MB) 15
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Free % 16
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Used % 17
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Free (MB) 18
                Application Infrastructure Performance|ACME-App|Hardware Resources|Memory|Swap Free (MB) 19
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Outgoing KB 20
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Outgoing KB/sec 21
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Incoming KB 22
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Outgoing packets 23
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Incoming KB/sec 24
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Outgoing packets/sec 25
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Incoming packets 26
                Application Infrastructure Performance|ACME-App|Hardware Resources|Network|eth1|Incoming packets/sec 27
                Application Infrastructure Performance|ACME-App|Hardware Resources|Volumes|/usr|Used (MB) 28
                Application Infrastructure Performance|ACME-App|Hardware Resources|Volumes|/usr|Free (MB) 29
                Application Infrastructure Performance|ACME-App|Hardware Resources|Volumes|/usr|Used (%) 30
                Application Infrastructure Performance|ACME-App|Hardware Resources|Volumes|/usr|Total (MB) 31
        
     * 
     * @param mPath Metric path
     * @param metricType Metric type
     * @param metricQuery Metric query index
     * @param shortV If the short value is needed
     * @return String[]
     */
    public static String[] getHWMetricType(String[] mPath, int metricType, int metricQuery, boolean shortV){
        if( (metricQuery > 19 && metricQuery < 32) || (metricQuery >2 && metricQuery < 12)){
            if(metricType == 5) return new String[]{mPath[3],mPath[4]};
            if(metricType == 9) return new String[]{mPath[5],mPath[6]};
        }
        
        if( (metricQuery < 3) || (metricQuery > 12 && metricQuery < 20) ){
            if(metricType == 5) return new String[]{mPath[3],DO};
            if(metricType == 9) return new String[]{mPath[5],DO};
        }
        return new String[]{DT,DO};
    }
    
    /**
     * 
     * <p> The types of queries
     * </p>
     * 
Application Infrastructure Performance|ACME-App|JVM|Classes|Current Loaded Class Count 0
Application Infrastructure Performance|ACME-App|JVM|Classes|Total Classes Loaded 1
* 
* 
Application Infrastructure Performance|ACME-App|JVM|Memory|Non-Heap|Current Usage (MB) 76
Application Infrastructure Performance|ACME-App|JVM|Memory|Non-Heap|Used % 77
Application Infrastructure Performance|ACME-App|JVM|Memory|Non-Heap|Max Available (MB) 78
Application Infrastructure Performance|ACME-App|JVM|Memory|Non-Heap|Committed (MB) 79
Application Infrastructure Performance|ACME-App|JVM|Memory|Heap|Max Available (MB) 80
Application Infrastructure Performance|ACME-App|JVM|Memory|Heap|Current Usage (MB) 81
Application Infrastructure Performance|ACME-App|JVM|Memory|Heap|Committed (MB) 82
Application Infrastructure Performance|ACME-App|JVM|Memory|Heap|Used % 83
* 
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Par Eden Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Par Eden Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Par Eden Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Survivor Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Eden Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Old Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Old Gen|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Old Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Tenured Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Tenured Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Tenured Gen|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Compressed Class Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Nursery|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Nursery|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Nursery|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Eden Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Eden Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Eden Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|CMS Perm Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Code Cache|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Code Cache|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Code Cache|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Perm Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Par Survivor Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Survivor Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Perm Gen|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Perm Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Perm Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Survivor Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Survivor Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Survivor Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Old Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Old Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Old Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|CMS Old Gen|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Metaspace|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Metaspace|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Metaspace|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Eden Space|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Eden Space|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Eden Space|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|G1 Old Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|ClassBlock Memory|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Class Memory|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Class Memory|Max Available (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|Class Memory|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Committed (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Current Usage (MB)
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Memory Pools|PS Perm Gen|Max Available (MB)
* 
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|GC Time Spent Per Min (ms) 71
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Major Collection Time Spent Per Min (ms) 72
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Minor Collection Time Spent Per Min (ms) 73
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Number of Major Collections Per Min 74
Application Infrastructure Performance|ACME-App|JVM|Garbage Collection|Number of Minor Collections Per Min 75
* 
Application Infrastructure Performance|ACME-App|JVM|Threads|Current No. of Threads 84
* 
Application Infrastructure Performance|ACME-App|JVM|Process CPU Usage % 85
Application Infrastructure Performance|ACME-App|JVM|Process CPU Burnt (ms/min) 86
     * 
     * 
     * 
     * @param mPath Metric path
     * @param metricType Metric type
     * @param metricQuery Metric query index
     * @param shortV If we need a short value
     * @return String[]
     */
    public static String[] getJVMMetricType(String[] mPath, int metricType, int metricQuery, boolean shortV){
        //Threads
       
        //Classes
        if(metricType == 0 || metricType == 1 || metricType == 84){ 
            if(metricType == 6) return new String[]{"GC."+mPath[3],DO}; 
            if(metricType == 10) return new String[]{"GC."+mPath[5],DO};
        }
        //Process
        if(metricType == 85 || metricType == 86) return new String[]{"Process",DO};
        
        // GC Memory Pools
        if(metricType < 71 && metricType > 1){ 
            if(metricType == 6) return new String[]{"GC."+mPath[4],DO}; 
            if(metricType == 10) return new String[]{"GC."+mPath[6],DO};
        }
        
        // Base GC
        if(metricType > 70 && metricType < 76){
            return new String[]{"GC.",DO}; 
        }
        
        // Memory
        if(metricType > 76 && metricType < 84){
            if(metricType == 6) return new String[]{"GC."+mPath[3]+"."+mPath[4],DO};
            if(metricType == 10) return new String[]{"GC."+mPath[5]+"."+mPath[6],DO};
        }
        
        return new String[]{DT,DO};
    }
    
    public static String[] getOAPMetricType(String[] mPath, int metricType, int metricQuery, boolean shortV){
        if(metricQuery > 9){
            if(metricType == 7) return new String[]{mPath[2],mPath[3]};
            if(metricType == 11) return new String[]{mPath[4],mPath[5]};
        }
        return new String[]{DT,DO};
    }
    
    public static String[] getGeneralMetricType(String[] mPath, int metricType, int metricQuery, boolean shortV){
       
        
        if(metricType == 0){
            return new String[]{s.SHORT_METRIC_TYPES[0],DO};
        }
        
        if(metricType == 1){
            return new String[]{s.SHORT_METRIC_TYPES[1],DO};
        }
        
        // EUM 
        if(metricType == 2){
            if(metricQuery < 16){return new String[]{new StringBuilder().append(s.SHORT_METRIC_TYPES[6]).append(s.D_).append(s.SHORT_METRIC_TYPES[8]).toString(),DO};} //Ajax
            if(metricQuery < 46){return new String[]{new StringBuilder().append(s.SHORT_METRIC_TYPES[6]).append(s.D_).append(s.SHORT_METRIC_TYPES[9]).toString(),DO};} //BASE
            return new String[]{new StringBuilder().append(s.SHORT_METRIC_TYPES[6]).append(s.D_).append(s.SHORT_METRIC_TYPES[10]).toString(),DO};
        }
        
        // CUSTOM
        if(metricType == 5){
            return  new String[]{s.SHORT_METRIC_TYPES[7],DO};
        }
        
        return new String[]{DT,DO};
    }
   
    
    /*
     * Metric Type:
    <ul>
                <li>Metric Type:
               *   <ul>  
               *        <li>0  - BT
               *        <li>1  - BE
               *        <li>2  - EUM
               *        <li>3  - Custom
               *        <li>4  - Agent Tier Metric
                *       <li>5  - HW Tier Metric
                *       <li>6  - JVM Tier Metric
                *       <li>7  - OAP Tier Metric
                *       <li>8  - Agent Node Metric
                *       <li>9  - HW Node Metric
                *       <li>10 - JVM Node Metric
                *       <li>11 - OAP Node Metric
               * </ul>
     * </ul>
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - Custom
     */
    public static String getObjectPlusMetricName(int metricType, int queryIndex, String metricPath){
        String[] nameParts = parse(metricPath);
        if( nameParts == null) return "Default Name";
        
        if(metricType == 0){
            return new StringBuilder().append(nameParts[2]).append(" - ").append(nameParts[3]).append(" ").append(nameParts[4]).toString();
        }
        
        if(metricType == 1){
            return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[2]).toString();
        }
        
        //Tier
        if(metricType == 2){
            if(queryIndex < 38){
                if(queryIndex < 2) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append(" ").append(nameParts[2]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 22) return new StringBuilder().append(nameParts[1]).append(" - ").append("HW - ").append(nameParts[3]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 24) return new StringBuilder().append(nameParts[1]).append(" - ").append("JVM - ").append(nameParts[3]).toString();
                if(queryIndex < 29) return new StringBuilder().append(nameParts[1]).append(" - ").append("JVM - GC - ").append(nameParts[4]).toString();
                return new StringBuilder().append(nameParts[1]).append(" - ").append("JVM - ").append(nameParts[4]).append(" ").append(nameParts[3]).append(" ").append(nameParts[5]).toString();
            }else{
                return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[2]).toString();
            }
            
        }
        
        //Node
        if(metricType == 3){
            if(queryIndex == 0 || queryIndex < 38){
                //5 4 6
                if(queryIndex < 2) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append(" - ").append(nameParts[5]).append(" ").append(nameParts[4]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 22) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("HW - ").append(nameParts[5]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 24) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("JVM - ").append(nameParts[5]).toString();
                if(queryIndex < 29) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("JVM - GC - ").append(nameParts[6]).toString();
                return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("JVM - ").append(nameParts[6]).append(" ").append(nameParts[5]).append(" ").append(nameParts[7]).toString();
            }else{
                return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append(" - ").append(nameParts[4]).toString();
            }
            
        }
        return "Default Name";
    }
    
    /*
     * Metric Type:
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - EUM
     *   5 - Custom
     */
    public static String getSimpleShortMetricName(int metricType, int queryIndex, String metricPath){
        String[] nameParts = parse(metricPath);
        if( nameParts == null) return "Default Name";
        
        if(metricType == 0){
            return new StringBuilder().append("BT - ").append(nameParts[4]).toString();
        }
        
        if(metricType == 1){
            return new StringBuilder().append("BE - ").append(nameParts[2]).toString();
        }
        
        //Tier
        if(metricType == 2){
            if(queryIndex < 38){
                if(queryIndex < 2) return new StringBuilder().append(nameParts[3]).append(" ").append(nameParts[2]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 22) return new StringBuilder().append("HW - ").append(nameParts[3]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 24) return new StringBuilder().append("JVM - ").append(nameParts[3]).toString();
                if(queryIndex < 29) return new StringBuilder().append("JVM - GC - ").append(nameParts[4]).toString();
                return new StringBuilder().append("JVM - ").append(nameParts[4]).append(" ").append(nameParts[3]).append(" ").append(nameParts[5]).toString();
            }else{
                return  new StringBuilder().append("OAP - ").append(nameParts[2]).toString();
            }
            
        }
        
        //Node
        if(metricType == 3){
            if(queryIndex == 0 || queryIndex < 38){
                //5 4 6
                if(queryIndex < 2) return new StringBuilder().append(nameParts[5]).append(" ").append(nameParts[4]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 22) return new StringBuilder().append("HW - ").append(nameParts[5]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 24) return new StringBuilder().append("JVM - ").append(nameParts[5]).toString();
                if(queryIndex < 29) return new StringBuilder().append("JVM - GC - ").append(nameParts[6]).toString();
                return new StringBuilder().append("JVM - ").append(nameParts[6]).append(" ").append(nameParts[5]).append(" ").append(nameParts[7]).toString();
            }else{
                return new StringBuilder().append("OAP - ").append(nameParts[4]).toString();
            }
            
        }
        return "Default Name";
    }
    
    
        /*
     * Metric Type:
    <ul>
                <li>Metric Type:
               *   <ul>  
               *        <li>0  - BT
               *        <li>1  - BE
               *        <li>2  - EUM
               *        <li>3  - Custom
               *        <li>4  - Agent Tier Metric
                *       <li>5  - HW Tier Metric
                *       <li>6  - JVM Tier Metric
                *       <li>7  - OAP Tier Metric
                *       <li>8  - Agent Node Metric
                *       <li>9  - HW Node Metric
                *       <li>10 - JVM Node Metric
                *       <li>11 - OAP Node Metric
               * </ul>
     * </ul>
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - EUM
     *   5 - Custom
     */
    public static String[] getObjectType(int metricType, int queryIndex, String[] nameParts){
        
        if(metricType == 4 || metricType == 8 ) return getAgentMetricType(nameParts,metricType,queryIndex,true);
        if(metricType == 5 || metricType == 9 ) return getHWMetricType(nameParts,metricType,queryIndex,true);
        if(metricType == 6 || metricType == 10 ) return getJVMMetricType(nameParts,metricType,queryIndex,true);
        if(metricType == 7 || metricType == 11 ) return getOAPMetricType(nameParts,metricType,queryIndex,true);
        
        return new String[]{"Default Type",DO};
    }
    
    public static String getJustMetricName(String metricPath){
        String[] nameParts = parse(metricPath);
        if(nameParts == null)
        return "Default Name";
        
        return nameParts[nameParts.length-1];
    }
    
    public static String getMetricName(String metricPath){
        
        String[] nameParts = parse(metricPath);
        
        if( nameParts == null) return "Default Name";
        
        boolean node=false;
        
        if(metricPath.contains(s.INDIVIDUAL_NODES)) node=true;

        
        // The problem, how can we determine which is the tier name because it will be hidden or will it?
        if(metricPath.startsWith(s.APPLICATION_INFRA_PERF) ){ 
            if(node) return nameParts[3];
            return nameParts[1];
        }
        if(metricPath.startsWith(s.BUSINESS_TRANSACTIONS)) return nameParts[3];
        if(metricPath.startsWith(s.EUM_USER_EXPERIENCE))  return nameParts[2];
        if(metricPath.startsWith(s.OVERALL_APPLICATION_PERF)){ if(nameParts.length == 3 ) return nameParts[1]; return nameParts[0];}
        // Need to add errors and informataion points

        
        return null;
    }
    
}

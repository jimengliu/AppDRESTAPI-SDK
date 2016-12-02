/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * 
 * <p>This has been updated to work with 2.5.2</p>
 * This is going to be used to help key items
 *  - controller
 *  - application 
 *  - metricGroup
 *  - metricType
 *  - metricName
 */
public class MetricPathKey {
    private String controller;
    private String application;
    private String applicationId;
    private String metricGroup; //tierName/appname
    private String metricType; // Tier/BT/BE/
    private String metricName; //Node/BT-name/BE/
    private String metricTier;
    private String metricSite;
    private String metricNode;
    private String metricFreq;
    
    /**
     * <p>
     The MetricPathKey helps extract the different parts of the metric path of a metric,
     * this can then be used to push the metrics into another data source.   
     * </p>
     * @param controller Name of the controller where the metric came from
     * @param application Name of the application where the metric came from
     * @param applicationId ID in string format where the metric came from
     */
    public MetricPathKey(String controller, String application, String applicationId){
        this.controller=controller;
        this.application=application;
        this.applicationId=applicationId;
    }
    
    /**
     * <p>
     * The method call shortMetricKey will parse the metric path and get the different components
     * out of the metric path. The array returned can be used directly as the main object to name
     * an entry.
     * </p>
     * 
     * @param metricType Integer the defines the type of metric query
     * @param metricQuery Integer index for the query
     * @param path Metric path string
     * @param freq Metric aggregation level, One minute, 10 minute and 1 hour
     * @return String[]
     * 

     * <ul>
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
     * 
     */
    public String[] shortMetricKey(int metricType, int metricQuery, String path, String freq){
        String[] pPath = MetricNameUtil.parse(path);
        this.metricFreq=freq;
        metricGroup=getObjectGroup(metricType,metricQuery,pPath);
        this.metricType=getObjectType(metricType,metricQuery,pPath,true);
        metricName=getObjectName(metricType,pPath);
        setTierSiteNode(metricType,pPath);
        return new String[]{controller,application,metricGroup,this.metricType,metricName};
        
    }
    
        /*
     * Metric Type:
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - EUM // change to 2
     *   5 - Custom // change to 3
     * 
     * End User Experience|Base Pages|/|First Byte Time (ms)
     */
    
    // Business Transaction Performance|Business Transactions|1stTier|/processorder/electronics|Average Response Time (ms)
    // Backends|Discovered backend call - MYSQL-AppDynamics-LOCALHOST|Average Response Time (ms)
    public void setTierSiteNode(int metricType, String[] pPath){
       //Node and tier, numbers will change
       if(metricType >=4 ){ metricTier=pPath[1];}
       if(metricType >=8){metricNode=pPath[3];}
       
       
       if(metricType == 2) {metricSite=pPath[2];}
       if(metricType == 3){
           // Application Infrastructure Performance|cas|Custom Metrics|Amazon Cloud Watch|eu-west-1|EC2|Instance|i-00f571e6|CPUUtilization
           //Application Infrastructure Performance|2ndTier|Individual Nodes|2ndTierNode1|Custom Metrics|Uptime|myTier|Nodes Down
           metricTier=null;metricTier=pPath[1]; // This is the tier, now lets check if the node is present
           if(pPath[2].equals("Individual Nodes")){metricNode=pPath[3];}
       }
       
       if(metricType == 0){
           metricTier=pPath[2];
           metricNode=pPath[3];
       }
       
       if(metricType == 1){
           metricNode=pPath[1];
       }

    }
    
    /*
      For 'Custom Metrics' this should be custom metrics
     * <ul>
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
    */
    public String getObjectType(int metricType, int metricQuery, String[] pPath, boolean shortVal){
        
        if(shortVal){
            
            return MetricNameUtil.getObjectType(metricType, metricQuery, pPath);
 
        }else{
            if(metricType == 0) return s.LONG_METRIC_TYPES[0];
            if(metricType == 1) return s.LONG_METRIC_TYPES[1];
            if(metricType == 2)  return s.LONG_METRIC_TYPES[6];
            if(metricType == 3) return s.LONG_METRIC_TYPES[7];
            // 
            if(metricType > 3){
                if(metricType == 4 || metricType==8) return s.LONG_METRIC_TYPES[2]; // query < 2
                if(metricType == 5 || metricType == 9) return s.LONG_METRIC_TYPES[3]; // query < 22
                if(metricType == 6 || metricType == 10) return s.LONG_METRIC_TYPES[4]; // query < 37
                return s.LONG_METRIC_TYPES[5];
            }
        }
        return "Type";
    }
    
    public String getObjectGroup(int metricType, int metricQuery, String[] path){
        if(metricType == 0) return s.SHORT_METRIC_TYPES[0];
        if(metricType == 1) return s.SHORT_METRIC_TYPES[1];
        if(metricType == 2) return path[1];
        if(metricType == 3){
            // We need to find everything after Custom Metric but before metric name
            // Application Infrastructure Performance|cas|Custom Metrics|Amazon Cloud Watch|eu-west-1|EC2|Instance|i-00f571e6|CPUUtilization
            int nameIndex=2;
            if(path.length==4) return "Custom Metric";
            StringBuilder bud=new StringBuilder();
            boolean fnd=false;
            int count=0;
            for(int i=1; i < (path.length - 1); i++){
                if(!fnd){
                    if(path[i].equals("Custom Metrics")) fnd=true;
                }else{
                    if(count > 0) bud.append("|");
                    bud.append(path[i]);
                    count++;
                }
            }
            
            return bud.toString();
        }
        //
        if(metricType >3){
                if(metricType == 4 || metricType == 8) return s.SHORT_METRIC_TYPES[2]; // query < 2
                if(metricType == 5 || metricType == 9) return s.SHORT_METRIC_TYPES[3]; // query < 22
                if(metricType == 6 || metricType == 10) return s.SHORT_METRIC_TYPES[4]; // query < 37
                return s.SHORT_METRIC_TYPES[5];    
        }
        return application;
    }
    
    /*
        This is going to get the name of the metric
    */
    public String getObjectName(int metricType, String[] path){
        if(metricType == 0) return path[path.length-1];
        if(metricType == 1) return path[1];
        if(metricType >= 2) return path[path.length-1];

        return application;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    
    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMetricGroup() {
        return metricGroup;
    }

    public void setMetricGroup(String metricGroup) {
        this.metricGroup = metricGroup;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getMetricTier() {
        return metricTier;
    }

    public void setMetricTier(String metricTier) {
        this.metricTier = metricTier;
    }

    public String getMetricSite() {
        return metricSite;
    }

    public void setMetricSite(String metricSite) {
        this.metricSite = metricSite;
    }

    public String getMetricNode() {
        return metricNode;
    }

    public void setMetricNode(String metricNode) {
        this.metricNode = metricNode;
    }

    public String getMetricFreq() {
        return metricFreq;
    }

    public void setMetricFreq(String metricFreq) {
        this.metricFreq = metricFreq;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\ncontroller :: ").append(controller);
        bud.append("\napplication :: ").append(application);
        bud.append("\nfrequency :: ").append(metricFreq);
        if(metricTier != null) bud.append("\nTier :: ").append(metricTier);
        if(metricNode != null) bud.append("\nNode :: ").append(metricNode);
        if(metricSite != null) bud.append("\nSite :: ").append(metricSite);
        bud.append("\nMetricGroup :: ").append(metricGroup);
        bud.append("\nMetricType :: ").append(metricType);
        bud.append("\nMetricName :: ").append(metricName);
        return bud.toString();
    }
    
}

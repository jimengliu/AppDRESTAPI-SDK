/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 * 
 * L3
 * 
 */
/*
                    <metric-definition>
                        <type>LOGICAL_METRIC</type>
                        <logical-metric-name>JVM|Garbage Collection|GC Time Spent Per Min (ms)</logical-metric-name>
                    </metric-definition>
                    * 
 */
public class MetricDefinition {
    private String type;
    private String logicalMetricName;
    
    public MetricDefinition(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.LOGICAL_METRIC_NAME)
    public String getLogicalMetricName() {
        return logicalMetricName;
    }

    public void setLogicalMetricName(String logicalMetricName) {
        this.logicalMetricName = logicalMetricName;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L3).append(AppExportS.METRIC_DEFINITION);
            bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
            bud.append(AppExportS.L3_1).append(AppExportS.LOGICAL_METRIC_NAME).append(AppExportS.VE).append(logicalMetricName);
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L3).append(AppExportS.XOpen(AppExportS.METRIC_DEFINITION));
            bud.append(AppExportS.XElement(6, AppExportS.TYPE, type));
            bud.append(AppExportS.XElement(6, AppExportS.LOGICAL_METRIC_NAME, logicalMetricName));
            bud.append(AppExportS.L3).append(AppExportS.XClose(AppExportS.METRIC_DEFINITION));
        return bud.toString();
    }
}

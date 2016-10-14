/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
/**
 *
 * @author soloink
 */

/*
 * <metricPath>Application Infrastructure Performance|activemq-instance-mytrees|JVM|Memory|Heap|Committed (MB)</metricPath>
  <frequency>ONE_MIN</frequency>
  <metricValues>
    <metric-value>
 * 
 */
@XmlSeeAlso(MetricValue.class)
public class MetricValues {
    private ArrayList<MetricValue> metricValue=new ArrayList<>();
    
    public MetricValues(){}

    @XmlElement(name=s.METRIC_VALUE)
    public ArrayList<MetricValue> getMetricValue() {
        return metricValue;
    }

    public void setMetricValues(ArrayList<MetricValue> metricValue) {
        this.metricValue = metricValue;
    }
    
    /**
     * <p>
     *      This is going to get a single value from the array list.
     * </p>
     * @return {@link MetricValue}
     */
    public MetricValue getSingleValue(){
        if(metricValue != null && ! metricValue.isEmpty() ) return metricValue.get(0);
        return null;
    }
    
    /**
        <p>
            This function provides a quick way to check if the returned values have data.
        </p>
    * @return {@link Boolean}

    */
    public boolean hasNoValues(){
        boolean empty=true;
        if(metricValue != null && metricValue.size()>0) empty=false;
        return empty;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\t\tMetric Value Size : ").append(metricValue.size()).append("\n");
        for(MetricValue val : metricValue) bud.append(val.toString());
        return bud.toString();
    }
    
}

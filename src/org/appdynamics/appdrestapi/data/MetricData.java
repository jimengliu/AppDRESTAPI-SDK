/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author soloink
 */

@XmlSeeAlso({MetricValues.class,MetricValue.class})
public class MetricData {
    protected int metricId;
    protected String metricPath;
    protected String frequency;
    protected ArrayList<MetricValues> metricValues=new ArrayList<MetricValues>();

    public MetricData(){}

    @XmlElement(name=s.METRIC_ID)
    public int getMetricId() {
        return metricId;
    }

    public void setMetricId(int metricId) {
        this.metricId = metricId;
    }
    
    
    @XmlElement(name=s.METRIC_PATH)
    public String getMetricPath() {
        return metricPath;
    }

    public void setMetricPath(String metricPath) {
        this.metricPath = metricPath;
    }

    @XmlElement(name=s.FREQUENCY)
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @XmlElement(name=s.METRIC_VALUES)
    public ArrayList<MetricValues> getMetricValues() {
        return metricValues;
    }

    public void setMetricValues(ArrayList<MetricValues> metricValues) {
        this.metricValues = metricValues;
    }
    
    /**
     * <p>
            This function will return a single metric value from the first entry if it exists.
        </p>

     * @return {@link MetricValue}

    */

    public MetricValue getSingleValue(){
        if(metricValues != null && !metricValues.isEmpty()) return metricValues.get(0).getSingleValue();
        return null;
    }
    
    /**
        <p>
            This function will return the array of metric values from the first entry if it exists.
        </p>

    * @return {@link ArrayList}

    */
    public ArrayList<MetricValue> getSingleMetricValues(){
        if(metricValues != null && !metricValues.isEmpty()) return metricValues.get(0).getMetricValue();
        return null;
    }
    
    public MetricValues getFirstMetricValues(){
        if(metricValues != null && !metricValues.isEmpty()) return metricValues.get(0);
        return null;
    }
    
    public boolean hasNoValues(){
        boolean empty=true;
        if(metricValues.size()>0)  empty=metricValues.get(0).hasNoValues();
        return empty;
        
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\tMetricId :: ").append(metricId).append("\n");
        bud.append("\tFrequency :: ").append(frequency).append("\n");
        bud.append("\tMetricPath :: ").append(metricPath).append("\n");
        bud.append("\tMetrics :: " ).append(metricValues.size());
        for(MetricValues val: metricValues) bud.append(val.toString()).append("\n");
        return bud.toString();
    }
    
    
}


/*
<metric-data>
    <metricId>80793</metricId>
    <metricPath>
    Overall Application Performance|cat-01|Individual Nodes|lvsp01cat005|Errors per Minute
    </metricPath>
    <metricName>...</metricName>
    <frequency>ONE_MIN</frequency>
    <metricValues>
    <metric-value>
    <startTimeInMillis>1454005620000</startTimeInMillis>
    <value>0</value>
    <min>0</min>
    <max>0</max>
    <current>0</current>
    <sum>0</sum>
    <count>15</count>
    <standardDeviation>0.0</standardDeviation>
    <occurrences>0</occurrences>
    <useRange>true</useRange>
    </metric-value>
    </metricValues>
</metric-data>
*/
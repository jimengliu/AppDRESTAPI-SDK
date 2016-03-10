/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author soloink
 */
@XmlRootElement(name=s.METRIC_DATAS)
@XmlSeeAlso({MetricData.class,MetricValues.class,MetricValue.class})
public class MetricDatas {
    private ArrayList<MetricData> metric_data=new ArrayList<MetricData>();

    @XmlElement(name=s.METRIC_DATA)
    public ArrayList<MetricData> getMetric_data() {
        return metric_data;
    }

    public void setMetric_data(ArrayList<MetricData> metric_data) {
        this.metric_data = metric_data;
    }
    
    /**
        <p>
            This function give quick access to a single metric value or returns null if no value exists.
        </p>
    */
    public MetricValue getSingleRollUpMetricValue(){
        
        if(metric_data != null && !metric_data.isEmpty() ) return metric_data.get(0).getSingleValue();

        return null;
    }
    
    /**
        <p>
            This function give quick access to a array of metric values or returns null if no values exists.
        </p>
    */
    public ArrayList<MetricValue> getSingleMetricValues(){
        
        if(metric_data != null && !metric_data.isEmpty() ) return metric_data.get(0).getSingleMetricValues();
        
        return null;
    }
    
    public boolean hasNoValues(){
        boolean empty=true;
        if(metric_data != null && metric_data.size() > 0) empty=metric_data.get(0).hasNoValues();
        return empty;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        for(MetricData data: metric_data) bud.append("\nMetric Datas --\n").append(data.toString());
        return bud.toString();
    }
}

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
    private ArrayList<MetricData> metric_data=new ArrayList<>();

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
        * 
    
    * @return {@link MetricValue}

    */
    public MetricValue getSingleRollUpMetricValue(){
        
        if(metric_data != null && !metric_data.isEmpty() ) return metric_data.get(0).getSingleValue();

        return null;
    }
    
    /**
     *  <p>
            This function give quick access to a array of metric values or returns null if no values exists.
        </p>
    @return {@link ArrayList}

     */

    public ArrayList<MetricValue> getSingleMetricValues(){
        
        if(metric_data != null && !metric_data.isEmpty() ) return metric_data.get(0).getSingleMetricValues();
        
        return null;
    }
    
    public MetricValues getFirstMetricValues(){
        if(metric_data != null && !metric_data.isEmpty()) {
            if(metric_data.get(0).getMetricValues() != null && !metric_data.get(0).getMetricValues().isEmpty()){
                return metric_data.get(0).getMetricValues().get(0);
            }
            
        }
        // We don't have anything so we return null;
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
    
    
    public void merge(MetricDatas datas){
        if(datas == null) return;
        
        for(MetricData _data: datas.getMetric_data()){
            boolean fnd=false;
            for(MetricData data:getMetric_data()){
                if(_data.getMetricPath().equals(data.getMetricPath())){
                    fnd=true;
                    // This is going to add all of the entries, we need to sort these as well
                    data.getMetricValues().get(0).getMetricValue().addAll(_data.getMetricValues().get(0).getMetricValue());
                    // This will sort the metrics in ascending order by timestamp
                    java.util.Collections.sort(data.getMetricValues().get(0).getMetricValue());
                }
            }
            if(!fnd){
                // We did not find it so just add it.
                getMetric_data().add(_data);
            }
        }
        
    }
}

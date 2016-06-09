/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 */
@XmlRootElement(name=s.METRIC_ITEMS)
public class MetricItems {
    private String parent;
    ArrayList<MetricItem> metricItems=new ArrayList<MetricItem>();
    
    public MetricItems(){}

    @XmlTransient
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getNewParent(String folder){
        return new StringBuilder().append(parent).append(s.P).append(folder).toString();
    }
    
    @XmlElement(name=s.METRIC_ITEM)
    public ArrayList<MetricItem> getMetricItems() {
        return metricItems;
    }

    public void setMetricItems(ArrayList<MetricItem> metricItems) {
        this.metricItems = metricItems;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(s.METRIC_ITEMS);
        bud.append(AppExportS.L0_1).append(s.METRIC_PATH).append(AppExportS.VE).append(parent);
        for(MetricItem mi: metricItems) bud.append(mi.toString());
        return bud.toString();
    }
}

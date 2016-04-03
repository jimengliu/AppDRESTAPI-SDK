/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author soloink
 */
public class MetricItem {
    private String type;
    private String name;

    public MetricItem(){}
    
    @XmlElement(name=s.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=s.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @XmlTransient
    public boolean isFolder(){
        return type.equals(s.METRIC_ITEM_FOLDER);
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(s.METRIC_ITEM);
        bud.append(AppExportS.L2).append(s.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(s.TYPE).append(AppExportS.VE).append(type);
        return bud.toString();
    }
    
}

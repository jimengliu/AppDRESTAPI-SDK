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
 * L2
 * 
 */
/*
            <entity-aggregation-scope>
                <type>ANY</type>
                <value>0</value>
            </entity-aggregation-scope>
 */
public class EntityAggregationScope {
    private String type;
    private String value;
    
    public EntityAggregationScope(){}

    @XmlElement(name=AppExportS.ENTITY_AGGREGATION_SCOPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.VALUE)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L2).append(AppExportS.ENTITY_AGGREGATION_SCOPE);
            bud.append(AppExportS.L2_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
            bud.append(AppExportS.L2_1).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L2).append(AppExportS.XOpen(AppExportS.ENTITY_AGGREGATION_SCOPE));
            bud.append(AppExportS.XElement(4, AppExportS.TYPE, type));
            bud.append(AppExportS.XElement(4, AppExportS.VALUE, value));
            bud.append(AppExportS.L2).append(AppExportS.XClose(AppExportS.ENTITY_AGGREGATION_SCOPE));
        return bud.toString();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 *
 */
/*
<name-value>
        <id>0</id>
        <name>MAJOR_VERSION</name>
        <value>5.6</value>
    </name-value>
 * 
 */
public class NameValue {
    private int id;
    private String name;
    private String value;
    
    public NameValue(){}

    @XmlElement(name=s.ID)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name=s.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=s.VALUE)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.NAME_VALUE);
        bud.append(AppExportS.L4).append(s.ID).append(AppExportS.VE).append(id);
        bud.append(AppExportS.L4).append(s.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L4).append(s.VALUE).append(AppExportS.VE).append(value);
        return bud.toString();
    }
    
}

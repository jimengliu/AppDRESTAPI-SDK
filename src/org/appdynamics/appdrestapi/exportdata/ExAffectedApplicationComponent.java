/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlTransient;



/**
 *
 * @author gilbert.solorzano
 */
public class ExAffectedApplicationComponent {
    private String name;
    private int level=5;

    public ExAffectedApplicationComponent(){}
    
    @XmlValue
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(name);
        return bud.toString();
    }
}


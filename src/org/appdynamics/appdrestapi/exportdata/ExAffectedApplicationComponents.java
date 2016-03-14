/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExAffectedApplicationComponent.class)
public class ExAffectedApplicationComponents {
    private ArrayList<ExAffectedApplicationComponent> applicationComponents=new ArrayList<ExAffectedApplicationComponent>();
    private int level=4;
    
    public ExAffectedApplicationComponents(){}

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public ArrayList<ExAffectedApplicationComponent> getApplicationComponents() {
        return applicationComponents;
    }

    public void setApplicationComponents(ArrayList<ExAffectedApplicationComponent> applicationComponents) {
        this.applicationComponents = applicationComponents;
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
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENTS);
        level++;
        for(ExAffectedApplicationComponent ap:applicationComponents){ap.setLevel(level); bud.append(ap);}
        level++;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExAffectedApplicationComponents obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENTS);
        level++;
        
        for(ExAffectedApplicationComponent value:applicationComponents){
            value.setLevel(level);
            boolean fnd=false;
            for(ExAffectedApplicationComponent _value:obj.getApplicationComponents()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd) bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
        }
        
        for(ExAffectedApplicationComponent value:obj.getApplicationComponents()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExAffectedApplicationComponent _value:applicationComponents){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd) bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
        }
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.applicationComponents);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExAffectedApplicationComponents other = (ExAffectedApplicationComponents) obj;
        
        for(ExAffectedApplicationComponent value:applicationComponents){
            value.setLevel(level);
            boolean fnd=false;
            for(ExAffectedApplicationComponent _value:other.getApplicationComponents()){
                if(value.equals(_value)){
                    fnd=true;
                }
            }
            
            if(!fnd) return false;
        }

        return true;
    }
    
    
}

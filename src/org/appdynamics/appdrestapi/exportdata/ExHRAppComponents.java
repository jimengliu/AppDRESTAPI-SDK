/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 */

public class ExHRAppComponents {
    private ArrayList<String> appComponent;
    private int level=8;
    
    public ExHRAppComponents(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    
    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public ArrayList<String> getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(ArrayList<String> appComponent) {
        this.appComponent = appComponent;
    }
    
    public String whatIsDifferent(ExHRAppComponents obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENTS);
        level++;
        for(String value: appComponent){
            if(!obj.getAppComponent().contains(value)){
                bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
                level--;
            }
        }
        
        for(String value: obj.getAppComponent()){
            if(!appComponent.contains(value)){
                bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);
                level--;
            }
        }
        
        level++;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENTS);
        level++;
        for(String app:appComponent){
            bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(app);
        }
        level--;
        return bud.toString();
    }
    

    public String toXML(){
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.XOpen(AppExportS.APPLICATION_COMPONENTS));
        level++;
        for(String app:appComponent){
            bud.append(AppExportS.XElement(level, AppExportS.APPLICATION_COMPONENT, app));
        }
        level--;
        bud.append(AppExportS.I[level]).append(AppExportS.XClose(AppExportS.APPLICATION_COMPONENTS));
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.appComponent != null ? this.appComponent.hashCode() : 0);
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
        final ExHRAppComponents other = (ExHRAppComponents) obj;
        
        if(appComponent.size() != other.getAppComponent().size()) return false;
        
        for(String value: appComponent){
            if(!other.getAppComponent().contains(value)){
                return false;
            }
        }
        return true;
    }
    
    
}


/*
 * <application-components>
<application-component>1stTier</application-component>
</application-components>
 */
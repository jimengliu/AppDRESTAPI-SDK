/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */


@XmlSeeAlso({ExBackendIdentityOptions.class,ExBackendDiscoveryConditions.class})
public class ExBackendDiscoveryConfiguration {
    private String name;
    private ExBackendIdentityOptions backendIdentityOptions;
    private ExBackendDiscoveryConditions backendDiscoveryConditions; //I don't have an example
    private boolean discoveryEnabled;
    private boolean correlationEnabled;
    private boolean supportsCorrelation;
    private int priority;
    private String exitPointType;
    private int level=6;
    
    public ExBackendDiscoveryConfiguration(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.BACKEND_IDENTITY_OPTIONS)
    public ExBackendIdentityOptions getBackendIdentityOptions() {
        return backendIdentityOptions;
    }

    public void setBackendIdentityOptions(ExBackendIdentityOptions backendIdentityOptions) {
        this.backendIdentityOptions = backendIdentityOptions;
    }

    @XmlElement(name=AppExportS.BACKEND_DISCOVERY_CONDITIONS)
    public ExBackendDiscoveryConditions getBackendDiscoveryConditions() {
        return backendDiscoveryConditions;
    }

    public void setBackendDiscoveryConditions(ExBackendDiscoveryConditions backendDiscoveryConditions) {
        this.backendDiscoveryConditions = backendDiscoveryConditions;
    }

    @XmlElement(name=AppExportS.DISCOVERY_ENABLED)
    public boolean isDiscoveryEnabled() {
        return discoveryEnabled;
    }

    public void setDiscoveryEnabled(boolean discoveryEnabled) {
        this.discoveryEnabled = discoveryEnabled;
    }

    @XmlElement(name=AppExportS.CORRELATION_ENABLED)
    public boolean isCorrelationEnabled() {
        return correlationEnabled;
    }

    public void setCorrelationEnabled(boolean correlationEnabled) {
        this.correlationEnabled = correlationEnabled;
    }

    @XmlElement(name=AppExportS.SUPPORTS_CORRELATION)
    public boolean isSupportsCorrelation() {
        return supportsCorrelation;
    }

    public void setSupportsCorrelation(boolean supportsCorrelation) {
        this.supportsCorrelation = supportsCorrelation;
    }

    @XmlElement(name=AppExportS.PRIORITY)
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @XmlElement(name=AppExportS.EXIT_POINT_TYPE)
    public String getExitPointType() {
        return exitPointType;
    }

    public void setExitPointType(String exitPointType) {
        this.exitPointType = exitPointType;
    }
    
    /*
    private String name;
    private ExBackendIdentityOptions backendIdentityOptions;
    private Object backendDiscoveryConditions; //I don't have an example
    private boolean discoveryEnabled;
    private boolean correlationEnabled;
    private boolean supportsCorrelation;
    private int priority;
    private String exitPointType;
    */
    public String whatIsDifferent(ExBackendDiscoveryConfiguration obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!exitPointType.equals(obj.getExitPointType())){
            bud.append(AppExportS.I[level]).append(AppExportS.EXIT_POINT_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(exitPointType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getExitPointType()); 
            level--;
            
        }
        if(discoveryEnabled != obj.isDiscoveryEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.DISCOVERY_ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(discoveryEnabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isDiscoveryEnabled()); 
            level--;
        }
        
        if(correlationEnabled != obj.isCorrelationEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.CORRELATION_ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(correlationEnabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isCorrelationEnabled()); 
            level--;
        }
        
        if(supportsCorrelation != obj.isSupportsCorrelation()){
            bud.append(AppExportS.I[level]).append(AppExportS.SUPPORTS_CORRELATION);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(supportsCorrelation);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isSupportsCorrelation()); 
            level--;
        }
        
        if(priority != obj.getPriority()){
            bud.append(AppExportS.I[level]).append(AppExportS.PRIORITY);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(priority);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPriority()); 
            level--;
        }
        if(backendIdentityOptions != null) backendIdentityOptions.setLevel(level);
        bud.append(backendIdentityOptions.whatIsDifferent(obj.getBackendIdentityOptions()));
        if(backendDiscoveryConditions != null) backendDiscoveryConditions.setLevel(level);
        bud.append(backendDiscoveryConditions.whatIsDifferent(obj.getBackendDiscoveryConditions()));
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.DISCOVERY_ENABLED).append(AppExportS.VE).append(discoveryEnabled);
        bud.append(AppExportS.I[level]).append(AppExportS.CORRELATION_ENABLED).append(AppExportS.VE).append(correlationEnabled);
        bud.append(AppExportS.I[level]).append(AppExportS.SUPPORTS_CORRELATION).append(AppExportS.VE).append(supportsCorrelation);
        bud.append(AppExportS.I[level]).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);
        bud.append(AppExportS.I[level]).append(AppExportS.EXIT_POINT_TYPE).append(AppExportS.VE).append(exitPointType);
        
        if(backendIdentityOptions != null) backendIdentityOptions.setLevel(level);
        bud.append(backendIdentityOptions);
        
        if(backendDiscoveryConditions != null) backendDiscoveryConditions.setLevel(level);
        bud.append(backendDiscoveryConditions);
        
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 59 * hash + (this.backendIdentityOptions != null ? this.backendIdentityOptions.hashCode() : 0);
        hash = 59 * hash + (this.backendDiscoveryConditions != null ? this.backendDiscoveryConditions.hashCode() : 0);
        hash = 59 * hash + (this.discoveryEnabled ? 1 : 0);
        hash = 59 * hash + (this.correlationEnabled ? 1 : 0);
        hash = 59 * hash + (this.supportsCorrelation ? 1 : 0);
        hash = 59 * hash + this.priority;
        hash = 59 * hash + (this.exitPointType != null ? this.exitPointType.hashCode() : 0);
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
        final ExBackendDiscoveryConfiguration other = (ExBackendDiscoveryConfiguration) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.backendIdentityOptions != other.backendIdentityOptions && (this.backendIdentityOptions == null || !this.backendIdentityOptions.equals(other.backendIdentityOptions))) {
            return false;
        }
        if (this.backendDiscoveryConditions != other.backendDiscoveryConditions && (this.backendDiscoveryConditions == null || !this.backendDiscoveryConditions.equals(other.backendDiscoveryConditions))) {
            return false;
        }
        if (this.discoveryEnabled != other.discoveryEnabled) {
            return false;
        }
        if (this.correlationEnabled != other.correlationEnabled) {
            return false;
        }
        if (this.supportsCorrelation != other.supportsCorrelation) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        if ((this.exitPointType == null) ? (other.exitPointType != null) : !this.exitPointType.equals(other.exitPointType)) {
            return false;
        }
        return true;
    }
    
    
    
}


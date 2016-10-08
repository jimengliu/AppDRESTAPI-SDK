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
 */
/*
<auto-discovery>
=======
/*<auto-discovery>
>>>>>>> 7cc1ab8a3e9df71c8bcfbb4b205d015854a79058
        <name>NODEJS_WEB</name>
        <properties>uri-length;first-n-segments;segment-length;2;</properties>
        <discovery-resolution>URI</discovery-resolution>
        <transaction-detection-enabled>true</transaction-detection-enabled>
        <enabled>true</enabled>
    </auto-discovery>
 */
public class AutoDiscovery {
    private String name;
    private String properties;
    private String discoveryResolution;
    private String transactionDetectionEnabled;
    private String enabled;
    
    public AutoDiscovery(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.PROPERTIES)
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @XmlElement(name=AppExportS.DISCOVERY_RESOLUTION)
    public String getDiscoveryResolution() {
        return discoveryResolution;
    }

    public void setDiscoveryResolution(String discoveryResolution) {
        this.discoveryResolution = discoveryResolution;
    }

    @XmlElement(name=AppExportS.TRANSACTION_DETECTION_ENABLED)
    public String getTransactionDetectionEnabled() {
        return transactionDetectionEnabled;
    }

    public void setTransactionDetectionEnabled(String transactionDetectionEnabled) {
        this.transactionDetectionEnabled = transactionDetectionEnabled;
    }

    @XmlElement(name=AppExportS.ENABLED)
    public String isEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    
    @Override
    public String toString(){
        StringBuilder bud= new StringBuilder();

        bud.append(AppExportS.L1_1).append(AppExportS.AUTO_DISCOVERY);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.PROPERTIES).append(AppExportS.VE).append(properties);
        bud.append(AppExportS.L2).append(AppExportS.DISCOVERY_RESOLUTION).append(AppExportS.VE).append(discoveryResolution);
        bud.append(AppExportS.L2).append(AppExportS.TRANSACTION_DETECTION_ENABLED).append(AppExportS.VE).append(transactionDetectionEnabled);
        bud.append(AppExportS.L2).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.XOpen(AppExportS.AUTO_DISCOVERY));
        bud.append(AppExportS.XElement(2, AppExportS.NAME, name));
        bud.append(AppExportS.XElement(2, AppExportS.PROPERTIES, properties));
        bud.append(AppExportS.XElement(2, AppExportS.DISCOVERY_RESOLUTION, discoveryResolution));
        bud.append(AppExportS.XElement(2, AppExportS.TRANSACTION_DETECTION_ENABLED, transactionDetectionEnabled));
        bud.append(AppExportS.XElement(2, AppExportS.ENABLED, enabled));
        bud.append(AppExportS.L1).append(AppExportS.XClose(AppExportS.AUTO_DISCOVERY));
        
        return bud.toString();
    }
    
}

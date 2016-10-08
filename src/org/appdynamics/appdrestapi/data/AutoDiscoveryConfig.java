/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
>>>>>>> 7cc1ab8a3e9df71c8bcfbb4b205d015854a79058
 */
/*
 * <auto-discovery-config controller-version="003-009-003-000">
    <auto-discovery>
        <name>NODEJS_WEB</name>
        <properties>uri-length;first-n-segments;segment-length;2;</properties>
        <discovery-resolution>URI</discovery-resolution>
        <transaction-detection-enabled>true</transaction-detection-enabled>
        <enabled>true</enabled>
    </auto-discovery>
    <auto-discovery>
        <name>BINARY_REMOTING</name>
        <discovery-resolution>SIMPLE_CLASS_NAME_AND_METHOD_NAME</discovery-resolution>
        <transaction-detection-enabled>true</transaction-detection-enabled>
        <enabled>true</enabled>
    </auto-discovery>
 * 
 */
@XmlRootElement(name=AppExportS.AUTO_DISCOVERY_CONFIG)
@XmlSeeAlso(AutoDiscovery.class)
public class AutoDiscoveryConfig {
    private String controllerVersion;
    private ArrayList<AutoDiscovery> autoDiscovery=new ArrayList<AutoDiscovery>();
    
    public AutoDiscoveryConfig(){}

    @XmlAttribute(name=AppExportS.CONTROLLER_VERSION)
    public String getControllerVersion() {
        return controllerVersion;
    }

    public void setControllerVersion(String controllerVersion) {
        this.controllerVersion = controllerVersion;
    }

    @XmlElement(name=AppExportS.AUTO_DISCOVERY)
    public ArrayList<AutoDiscovery> getAutoDiscovery() {
        return autoDiscovery;
    }

    public void setAutoDiscovery(ArrayList<AutoDiscovery> autoDiscovery) {
        this.autoDiscovery = autoDiscovery;
    }
    
    @Override
    public String toString(){
        StringBuilder bud= new StringBuilder();

        bud.append(AppExportS.L1).append(AppExportS.AUTO_DISCOVERY_CONFIG);
        bud.append(AppExportS.L1_1).append(AppExportS.CONTROLLER_VERSION).append(AppExportS.VE).append(controllerVersion);
        for(AutoDiscovery auto:autoDiscovery) bud.append(auto.toString());

        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append(AppExportS.XOpenAttr(AppExportS.AUTO_DISCOVERY_CONFIG));
        bud.append(AppExportS.XAttribute(AppExportS.CONTROLLER_VERSION, controllerVersion)).append(AppExportS.XC);
        for(AutoDiscovery auto:autoDiscovery) bud.append(auto.toXML());
        bud.append(AppExportS.L0).append(AppExportS.XClose(AppExportS.AUTO_DISCOVERY_CONFIG));
        return bud.toString();
    }
    
}

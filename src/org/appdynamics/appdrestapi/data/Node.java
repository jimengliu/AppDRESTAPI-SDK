/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author soloink
 */
/*
 * <node>
  <id>11088</id>
  <name>cf_8f756145-6d81-4217-bba3-93d7af5d7372</name>
  <type>Tomcat 6.x</type>
  <tierId>200</tierId>
  <tierName>start</tierName>
  <machineId>91</machineId>
  <machineName>41308e8a-517c-4ca9-adc2-b2003ea03a5d</machineName>
  <machineOSType>Linux</machineOSType>
  <machineAgentPresent>true</machineAgentPresent>
  <machineAgentVersion>Machine Agent v3.7.11.0 GA Build Date 2013-09-27 11:07:47</machineAgentVersion>
  <appAgentPresent>true</appAgentPresent>
  <appAgentVersion>Server Agent v3.7.11.0 GA #2013-09-27_11-05-45 re280bc92c2f193d92459c97836bba1297e1057cb 7</appAgentVersion>
  <ipAddresses>
    <ipAddress>fe80:0:0:0:250:56ff:feab:55c3%2</ipAddress>
    <ipAddress>10.33.151.72</ipAddress>
  </ipAddresses>
</node>
</nodes>
 * 
 */

@XmlSeeAlso({IPAddresses.class,IPAddress.class})
public class Node {
    private int id;
    private String name;
    private String type;
    private int tierId;
    private String tierName;
    private int machineId;
    private String machineName;
    private String machineOSType;
    private boolean machineAgentPresent;
    private String machineAgentVersion;
    private boolean appAgentPresent;
    private String appAgentVersion;
    private IPAddresses ipAddresses;
    // Added for 4.2
    private String agentType;
    
    public Node(){}

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

    @XmlElement(name=s.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @XmlElement(name=s.AGENT_TYPE)
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    @XmlElement(name=s.TIER_ID)
    public int getTierId() {
        return tierId;
    }

    public void setTierId(int tierId) {
        this.tierId = tierId;
    }

    @XmlElement(name=s.TIER_NAME)
    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    @XmlElement(name=s.MACHINE_ID)
    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    @XmlElement(name=s.MACHINE_NAME)
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @XmlElement(name=s.MACHINE_OS_TYPE)
    public String getMachineOSType() {
        return machineOSType;
    }

    public void setMachineOSType(String machineOSType) {
        this.machineOSType = machineOSType;
    }

    //@XmlElement(name=s.MACHINE_AGENT_PRESENT)
    

    @XmlElement(name=s.MACHINE_AGENT_VERSION)
    public String getMachineAgentVersion() {
        return machineAgentVersion;
    }

    public void setMachineAgentVersion(String machineAgentVersion) {
        this.machineAgentVersion = machineAgentVersion;
    }

    @XmlElement(name=s.IPADDRESSES)
    public IPAddresses getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(IPAddresses ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    @XmlElement(name=s.MACHINE_AGENT_PRESENT)
    public boolean isMachineAgentPresent() {
        return machineAgentPresent;
    }

    public void setMachineAgentPresent(boolean machineAgentPresent) {
        this.machineAgentPresent = machineAgentPresent;
    }

    @XmlElement(name=s.APP_AGENT_PRESENT)
    public boolean isAppAgentPresent() {
        return appAgentPresent;
    }

    public void setAppAgentPresent(boolean appAgentPresent) {
        this.appAgentPresent = appAgentPresent;
    }

    @XmlElement(name=s.APP_AGENT_VERSION)
    public String getAppAgentVersion() {
        return appAgentVersion;
    }

    public void setAppAgentVersion(String appAgentVersion) {
        this.appAgentVersion = appAgentVersion;
    }

    
    
    @Override
    public String toString() {
        StringBuilder bud = new StringBuilder();
        bud.append("\tNode Name : ").append(name).append("\n");
        bud.append("\tNode ID : ").append(id).append("\n");
        bud.append("\tNode Type: ").append(type).append("\n");
        bud.append("\tTier Name: ").append(tierName).append("\n");
        bud.append("\tTier ID: ").append(tierId).append("\n");
        bud.append("\tMachine ID: ").append(machineId).append("\n");
        bud.append("\tMachine Name: ").append(machineName).append("\n");
        bud.append("\tMachine Agent Present: ").append(machineAgentPresent).append("\n");
        bud.append("\tMachine Agent Version: ").append(machineAgentVersion).append("\n");
        bud.append("\tApplication Agent Present: ").append(appAgentPresent).append("\n");
        bud.append("\tApplication Agent Version: ").append(appAgentVersion).append("\n");
        bud.append(ipAddresses);
        bud.append("\t ******************** End Node ***************************\n");        
        return bud.toString();
    
    }
    
    
}

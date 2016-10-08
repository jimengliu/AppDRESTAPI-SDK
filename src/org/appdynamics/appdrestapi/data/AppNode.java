/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import java.util.ArrayList;

/**
 *
 * @author soloink
 * 
 */
/* 
 <node>
=======
/*<node>
>>>>>>> 7cc1ab8a3e9df71c8bcfbb4b205d015854a79058
  <id>9</id>
  <name>2ndTierNode2</name>
  <type>Other</type>
  <tierId>6</tierId>
  <tierName>2ndTier</tierName>
  <machineId>2</machineId>
  <machineName>appdyn01.soloinkto.com</machineName>
  <machineOSType>Linux</machineOSType>
  <machineAgentPresent>false</machineAgentPresent>
  <appAgentPresent>true</appAgentPresent>
  <appAgentVersion>Server Agent v3.7.7.1 GA #2013-07-31_11-46-46 r2d61b3d9cb526ed366749d47cd2f84f944232929 2</appAgentVersion>
  <ipAddresses>
    <ipAddress>fe80:0:0:0:a00:27ff:fe01:fc51%3</ipAddress>
    <ipAddress>192.168.56.113</ipAddress>
    <ipAddress>fe80:0:0:0:a00:27ff:fe09:e259%2</ipAddress>
    <ipAddress>192.168.10.103</ipAddress>
  </ipAddresses>
</node>
 * 
 */
public class AppNode {
    private int id;
    private String name;
    private String type;
    private int tierId;
    private String tierName;
    private int machineId;
    private String machineName;
    private String machineOSType;
    private boolean machineAgentPresent;
    private boolean appAgentPresent;
    private String appAgentVersion;
    private ArrayList<String> ipaddresses=new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTierId() {
        return tierId;
    }

    public void setTierId(int tierId) {
        this.tierId = tierId;
    }

    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineOSType() {
        return machineOSType;
    }

    public void setMachineOSType(String machineOSType) {
        this.machineOSType = machineOSType;
    }

    public boolean isMachineAgentPresent() {
        return machineAgentPresent;
    }

    public void setMachineAgentPresent(boolean machineAgentPresent) {
        this.machineAgentPresent = machineAgentPresent;
    }

    public boolean isAppAgentPresent() {
        return appAgentPresent;
    }

    public void setAppAgentPresent(boolean appAgentPresent) {
        this.appAgentPresent = appAgentPresent;
    }

    public String getAppAgentVersion() {
        return appAgentVersion;
    }

    public void setAppAgentVersion(String appAgentVersion) {
        this.appAgentVersion = appAgentVersion;
    }

    public ArrayList<String> getIpaddresses() {
        return ipaddresses;
    }

    public void setIpaddresses(ArrayList<String> ipaddresses) {
        this.ipaddresses = ipaddresses;
    }
    
    
}

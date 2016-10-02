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
 * This XML file does not appear to have any style information associated with it. The document tree is shown below.
 */
/*
<backends>

* 
<backend>
<id>9</id>
<name>NEWSCHEMA-MYSQL-LOCALHOST</name>
<exitPointType>JDBC</exitPointType>
<properties>
    <name-value>
        <id>0</id>
        <name>HOST</name>
        <value>LOCALHOST</value>
    </name-value>
    <name-value>
        <id>0</id>
        <name>MAJOR_VERSION</name>
        <value>5.6</value>
    </name-value>
    <name-value>
        <id>0</id>
        <name>PORT</name>
        <value>3308</value>
    </name-value>
    <name-value>
    <id>0</id>
    <name>SCHEMA</name>
    <value>NEWSCHEMA</value>
    </name-value>
    <name-value>
    <id>0</id>
    <name>URL</name>
    <value>jdbc:mysql://localhost:3308/newschema</value>
    </name-value>
    <name-value>
    <id>0</id>
    <name>VENDOR</name>
    <value>MYSQL</value>
    </name-value>
</properties>
<applicationComponentNodeId>0</applicationComponentNodeId>
<tierId>0</tierId>
</backend>
* 
</backends>
 * 
 */

@XmlSeeAlso({Properties.class,NameValue.class})
public class Backend {
    private int id;
    private String name;
    private String exitPointType;
    private Properties properties;
    private int applicationComponentNodeId;
    private int tierId;

    public Backend(){}
    
    
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

    @XmlElement(name=AppExportS.BC_EXIT_POINT_TYPE)
    public String getExitPointType() {
        return exitPointType;
    }

    public void setExitPointType(String exitPointType) {
        this.exitPointType = exitPointType;
    }

    @XmlElement(name=AppExportS.PROPERTIES)
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT_NODE_ID)
    public int getApplicationComponentNodeId() {
        return applicationComponentNodeId;
    }

    public void setApplicationComponentNodeId(int applicationComponentNodeId) {
        this.applicationComponentNodeId = applicationComponentNodeId;
    }

    @XmlElement(name=AppExportS.TIER_ID)
    public int getTierId() {
        return tierId;
    }

    public void setTierId(int tierId) {
        this.tierId = tierId;
    }
    
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.BACKEND);
        bud.append(AppExportS.L2).append(s.ID).append(AppExportS.VE).append(id);
        bud.append(AppExportS.L2).append(s.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.BC_EXIT_POINT_TYPE).append(AppExportS.VE).append(exitPointType);
        bud.append(properties.toString());
        bud.append(AppExportS.L2).append(AppExportS.APPLICATION_COMPONENT_NODE_ID).append(AppExportS.VE).append(applicationComponentNodeId);
        bud.append(AppExportS.L2).append(AppExportS.TIER_ID).append(AppExportS.VE).append(tierId);
        
        return bud.toString();
    }
    
}

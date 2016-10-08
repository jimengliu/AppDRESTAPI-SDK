/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import javax.xml.bind.annotation.XmlElement;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author soloink

 */

/*

>>>>>>> 7cc1ab8a3e9df71c8bcfbb4b205d015854a79058
 * <tier>
  <id>6</id>
  <name>2ndTier</name>
  <type>Application Server</type>
  <agentType>APP_AGENT</agentType>
  <numberOfNodes>2</numberOfNodes>
</tier>

 * 
 */
public class Tier {
    private int id;
    private String name;
    private String type;
    private String agentType;
    private int numberOfNodes;

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

    @XmlElement(name=s.NUMBER_OF_NODES)
    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public void setNumberOfNodes(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\tTier Name: ").append(name).append("\n");
        bud.append("\tTier ID: ").append(id).append("\n");
        bud.append("\tTier Type: ").append(type).append("\n");
        bud.append("\tTier Agent Type : ").append(agentType).append("\n");
        bud.append("\t ***************** End of tier *********************\n");
        return bud.toString();
    }
    
}

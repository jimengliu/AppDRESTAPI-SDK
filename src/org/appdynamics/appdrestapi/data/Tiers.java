/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
/**
 *
 * @author soloink
 * 
 */

/*
 * <tiers>
 <tier>
  <id>443</id>
  <name>volunteer-backend-stage</name>
  <type>Application Server</type>
  <agentType>APP_AGENT</agentType>
  <numberOfNodes>3</numberOfNodes>
</tier>
</tiers>s
 */

@XmlRootElement(name=s.TIERS)
@XmlSeeAlso(Tier.class)
public class Tiers {
    private ArrayList<Tier> tiers=new ArrayList<Tier>();

    @XmlElement(name=s.TIER)
    public ArrayList<Tier> getTiers() {
        return tiers;
    }

    public void setTiers(ArrayList<Tier> tiers) {
        this.tiers = tiers;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        for(Tier tier: tiers){
            bud.append(tier.toString());
        }
        return bud.toString();
    }
}

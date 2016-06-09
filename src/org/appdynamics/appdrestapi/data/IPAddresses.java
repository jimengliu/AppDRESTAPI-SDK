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

@XmlSeeAlso(IPAddress.class)
public class IPAddresses {
    
    private ArrayList<IPAddress> ipaddresses=new ArrayList<IPAddress>();

    @XmlElement(name=s.IPADDRESS)
    public ArrayList<IPAddress> getIpaddresses() {
        return ipaddresses;
    }

    public void setIpaddresses(ArrayList<IPAddress> ipaddresses) {
        this.ipaddresses = ipaddresses;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\tIPAddresses : \n");
        for(IPAddress ip: ipaddresses) bud.append(ip);
        return bud.toString();
    }
    
    
}

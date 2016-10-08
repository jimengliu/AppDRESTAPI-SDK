/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import javax.xml.bind.annotation.XmlValue;
import org.appdynamics.appdrestapi.resources.s;
/**
 *
 * @author soloink
 * 
 */

/*
 <ipAddresses>
=======
 */
/*
 * <ipAddresses>
>>>>>>> 7cc1ab8a3e9df71c8bcfbb4b205d015854a79058
    <ipAddress>fe80:0:0:0:250:56ff:feab:55c3%2</ipAddress>
    <ipAddress>10.33.151.72</ipAddress>
  </ipAddresses>
 * 
 */
public class IPAddress {
    
    private String ipAddress;

    public IPAddress(){}
    
    //@XmlElement(name=s.IPADDRESS)
    @XmlValue
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    @Override 
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\t\tIPAddress: ").append(ipAddress).append("\n");
        
        return bud.toString();
    }
    
}

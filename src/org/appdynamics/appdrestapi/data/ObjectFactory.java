/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public HealthRules createHealthRules() {
        return new HealthRules();
    }

    public CustomMatchPoints createCustomMatchPoints(){
        return new CustomMatchPoints();
    }
    
    
}
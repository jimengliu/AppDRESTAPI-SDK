/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 */
public class LicenseQuery {
    
    public static String queryLicenseProperties(String baseURL){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_RESTUI);
        val.append(s.ACCOUNT_LICENSE_PROPERTIES);
        return val.toString();
    }
    
    public static String queryAccountEUM(String baseURL){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_RESTUI);
        val.append(s.ACCOUNT_EUM);
        return val.toString();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 */
public class AuthActionQuery {
    
    public static String queryAuthAction(String baseURL){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_AUTH_ACTION);

        return val.toString();
    }
    
}

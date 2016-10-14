/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 */
public class DashboardQuery {
    
    public static String queryDashboardExportById(String baseURL,  int number){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_DASHBOARD_EX).append(number);
        return bud.toString();
    }
    
    public static String queryDashboardImport(String baseURL){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_DASHBOARD);
        return bud.toString();
    }
    
    public static String queryDashboardList(String baseURL){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_DASHBOARD_LIST);
        return bud.toString();
    }
    
}

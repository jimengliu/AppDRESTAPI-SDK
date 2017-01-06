/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */
public class DashboardList {
    private ArrayList<DashboardListObj> dashboardList = new ArrayList<DashboardListObj>();

    public ArrayList<DashboardListObj> getDashboardList() {
        return dashboardList;
    }

    public void setDashboardList(ArrayList<DashboardListObj> dashboardList) {
        this.dashboardList = dashboardList;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        for(DashboardListObj node:dashboardList) bud.append(node.toString());
        return bud.toString();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import java.util.Calendar;
import org.appdynamics.appdrestapi.data.RESTBaseURL;

/**
 *
 * @author soloink
 */
public class MeticQueryStringTester {
    
    public static void main(String[] args){
        
        //String controller="appdyn02";
        String controller="dtv.saas.appdynamics.com";
        //String port="8090";
        String port="443";
        String tier="DSM-ADM";
        String node="p0xvaepw0019_MS01";
        String app="DTVUS-IT-Prod";

        RESTBaseURL baseRestURL=new RESTBaseURL(controller, port, true);
        String baseURL=baseRestURL.getControllerURL();
        boolean rollup=false;
        MetricQuery mq = new MetricQuery( baseURL,app);
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.MINUTE, -10);
        long start=cal2.getTimeInMillis();
        long end = cal1.getTimeInMillis();
        
        System.out.println("Hardware Cpu Queries ");
        System.out.println(mq.queryTierAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(tier, start, end, rollup));
        System.out.println(mq.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(tier, node, start, end, rollup));
        
    }
    
}

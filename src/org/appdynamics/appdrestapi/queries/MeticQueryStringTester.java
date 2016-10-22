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
        System.out.println("curl -k -u gilbert.solorzano@dtv \""+ mq.queryHWTierDisksAll(tier, null, start, end, rollup)+"\"");
        System.out.println("curl -k -u gilbert.solorzano@dtv \""+ mq.queryHWNodeDisksAll(tier, node, null, start, end, rollup)+"\"");
        

        /*
        curl -k -u gilbert.solorzano@dtv "https://dtv.saas.appdynamics.com:443/controller/rest/applications/DTVUS-IT-Prod/metric-data?metric-path=Application%20Infrastructure%20Performance|DSM-ADM|Hardware%20Resources|Disks|*|*&time-range-type=BETWEEN_TIMES&start-time=1477064286281&end-time=1477064886272&rollup=false"
curl -k -u gilbert.solorzano@dtv "https://dtv.saas.appdynamics.com:443/controller/rest/applications/DTVUS-IT-Prod/metric-data?metric-path=Application%20Infrastructure%20Performance|DSM-ADM|Individual%20Nodes|p0xvaepw0019_MS01|Hardware%20Resources|Disks|*|*&time-range-type=BETWEEN_TIMES&start-time=1477064286281&end-time=1477064886272&rollup=false"

        */
    }
    
}

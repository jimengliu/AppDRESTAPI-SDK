/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;


/**
 *
 * @author gilbert.solorzano
 */
public class TransactionDetectionQuery {
    private static final Logger logger=Logger.getLogger(TransactionDetectionQuery.class.getName());
    protected String baseURL;
    protected String application;
    
    /*
        This is going to be the queries for all the transaction detection export for both app and tier level.
    */
    // export all auto created BTs in APP
    // http://<CONTROLLER_PORT>/controller/transactiondetection/<APPLICATION>/auto
    public static String queryTransactionDetectionAutoAll(String baseURL, String application){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_BT_AUTO);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionAutoAll(String baseURL, String application, String tier){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_BT_AUTO);
        return bud.toString();
    }
    
    
    
    // export single BTs from app
    // http://<CONTROLLER_PORT>/controller/transactiondetection/<APPLICATION>/auto/Servlet   
    public static String queryTransactionDetectionAutoSingle(String baseURL, String application, String entryPoint){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_BT_AUTO).append(s.F).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    public static String queryTransactionDetectionAutoSingle(String baseURL, String application, String tier, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_BT_AUTO).append(s.F).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    
    /*
        This is going to be the export
    */
    public static String queryTransactionDetectionExportAllPojo(String baseURL, String application){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_POJO_CUSTOM);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExportAllPojo(String baseURL, String application, String tier){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_POJO_CUSTOM);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExportPojo(String baseURL, String application, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_POJO_CUSTOM).append(QueryEncoder.encode(entryPoint));
        
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExportPojo(String baseURL, String application, String tier, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_POJO_CUSTOM).append(QueryEncoder.encode(entryPoint));
        //logger.log(Level.INFO,new StringBuilder().append(bud.toString()).toString());
        return bud.toString();
    }
    
    
    public static String queryTransactionDetectionImportPojo(String baseURL, String application, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(queryTransactionDetectionExportPojo(baseURL,application,entryPoint));
        bud.append(s.URL_OVERWRITE);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionImportPojo(String baseURL, String application, String tier, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(queryTransactionDetectionExportPojo(baseURL,application,tier,entryPoint));
        bud.append(s.URL_OVERWRITE);
        //logger.log(Level.INFO,new StringBuilder().append(bud.toString()).toString());
        return bud.toString();
    }
    
    
    public static String queryGenericTransactionDetectionExport(String baseURL, String application, String type, String entryPoint){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_CUSTOM_MATCH).append(s.F).append(type);
        if(entryPoint != null) bud.append(s.F).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    public static String queryGenericTransactionDetectionExport(String baseURL, String application,String tier, String type, String entryPoint){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_CUSTOM_MATCH).append(s.F).append(type); //.append(QueryEncoder.encode(entryPoint));
         if(entryPoint != null) bud.append(s.F).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    public static String queryGenericTransactionDetectionImport(String baseURL, String application, String type, String entryPoint){
        StringBuilder bud = new StringBuilder();
        bud.append(queryGenericTransactionDetectionExport(baseURL,application,type,entryPoint)).append(s.URL_OVERWRITE);
        return bud.toString();
    }
    
    public static String queryGenericTransactionDetectionImport(String baseURL, String application,String tier, String type, String entryPoint){
        StringBuilder bud = new StringBuilder();
        bud.append(queryGenericTransactionDetectionExport(baseURL,application,tier,type,entryPoint)).append(s.URL_OVERWRITE);
        return bud.toString();
    }
    
    
    
}

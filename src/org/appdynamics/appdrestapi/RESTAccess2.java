/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi;

import org.appdynamics.appdrestapi.data.AutoDiscoveryConfig;
import org.appdynamics.appdrestapi.queries.*;
import org.appdynamics.appdrestapi.data.*;
import org.appdynamics.appdrestapi.exportdata.*;
import org.appdynamics.appdrestapi.resources.*;
import org.appdynamics.appdrestapi.util.PostEvent;


import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author gilbert.solorzano
 */
public class RESTAccess2 extends RESTAccess{
    private static Logger logger=Logger.getLogger(RESTAccess.class.getName());
    
     /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess2(String controllerURL, String port, String username, String password){
        super(controllerURL,port,username,password);
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess2(String controllerURL, String port, boolean ssl, String username, String password){
        super(controllerURL,port,ssl,username,password);
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * </p>.
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     */
    public RESTAccess2(String controllerURL, String port, String username, String password, String account){
        super(controllerURL,port,username,password,account);
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     */
    public RESTAccess2(String controllerURL, String port, boolean ssl, String username, String password, String account){
        super(controllerURL,port,ssl,username,password,account);  
    }
    
     /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     * @param  proxy Proxy object with needed information
     */
    public RESTAccess2(String controllerURL, String port, boolean ssl, String username, String password, String account, RESTProxy proxy){
        super(controllerURL,port,ssl,username,password,account,proxy);
        
    }
    
    /**
     * <p>
     *  This will export a single custom pojo into the application.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     *  
     *  
     * <p>
     * <br>Index  0 : Collects all of the custom match rules of type binaryRemoting for the application
     * <br>Index  1 : Collects the custom match rules of type binaryRemoting with the name objNode
     * <br>Index  2 : Collects all of the custom match rules of type servlet for the application
     * <br>Index  3 : Collects the custom match rules of type servlet with the name objNode
     * <br>Index  4 : Collects all of the custom match rules of type strutsAction for the application
     * <br>Index  5 : Collects the custom match rules of type strutsAction with the name objNode
     * <br>Index  6 : Collects all of the custom match rules of type springBean for the application
     * <br>Index  7 : Collects the custom match rules of type springBean with the name objNode
     * <br>Index  8 : Collects all of the custom match rules of type ejb for the application
     * <br>Index  9 : Collects the custom match rules of type ejb with the name objNode
     * <br>Index  10 : Collects all of the custom match rules of type pojo for the application
     * <br>Index  11 : Collects the custom match rules of type pojo with the name objNode
     * <br>Index  12 : Collects all of the custom match rules of type jms for the application
     * <br>Index  13 : Collects the custom match rules of type jms with the name objNode
     * <br>Index  14 : Collects all of the custom match rules of type webService for the application
     * <br>Index  15 : Collects the custom match rules of type webService with the name objNode
     * </p>
     */
    public CustomMatchPoints getRESTCustomJavaExportObj(int queryIndex,String app,String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).append(" for custom pojo ").append(objNode).toString());}
        
        switch(queryIndex){
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[7],objNode);

        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeTDObjQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will export a single custom pojo into the application.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     *  
     *  
     * <p>
     * <br>Index  0 : Collects all of the custom match rules of type binaryRemoting for the application
     * <br>Index  1 : Collects the custom match rules of type binaryRemoting with the name objNode
     * <br>Index  2 : Collects all of the custom match rules of type servlet for the application
     * <br>Index  3 : Collects the custom match rules of type servlet with the name objNode
     * <br>Index  4 : Collects all of the custom match rules of type strutsAction for the application
     * <br>Index  5 : Collects the custom match rules of type strutsAction with the name objNode
     * <br>Index  6 : Collects all of the custom match rules of type springBean for the application
     * <br>Index  7 : Collects the custom match rules of type springBean with the name objNode
     * <br>Index  8 : Collects all of the custom match rules of type ejb for the application
     * <br>Index  9 : Collects the custom match rules of type ejb with the name objNode
     * <br>Index  10 : Collects all of the custom match rules of type pojo for the application
     * <br>Index  11 : Collects the custom match rules of type pojo with the name objNode
     * <br>Index  12 : Collects all of the custom match rules of type jms for the application
     * <br>Index  13 : Collects the custom match rules of type jms with the name objNode
     * <br>Index  14 : Collects all of the custom match rules of type webService for the application
     * <br>Index  15 : Collects the custom match rules of type webService with the name objNode
     * </p>
     */
    public String getRESTCustomJavaExport(int queryIndex,String app,String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).append(" for custom pojo ").append(objNode).toString());}
        
        switch(queryIndex){
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[7],objNode);

        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeTDQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    
     /**
     * <p>
     *  This will export a single custom pojo into the application.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     *  
     * <p>
     * <br>Index  0 : Collects all of the custom match rules of type <b>binaryRemoting</b> for the tier
     * <br>Index  1 : Collects the custom match rules of type binaryRemoting with the name objNode
     * <br>Index  2 : Collects all of the custom match rules of type servlet for the tier
     * <br>Index  3 : Collects the custom match rules of type servlet with the name objNode
     * <br>Index  4 : Collects all of the custom match rules of type strutsAction for the tier
     * <br>Index  5 : Collects the custom match rules of type strutsAction with the name objNode
     * <br>Index  6 : Collects all of the custom match rules of type springBean for the tier
     * <br>Index  7 : Collects the custom match rules of type springBean with the name objNode
     * <br>Index  8 : Collects all of the custom match rules of type ejb for the tier
     * <br>Index  9 : Collects the custom match rules of type ejb with the name objNode
     * <br>Index  10 : Collects all of the custom match rules of type pojo for the tier
     * <br>Index  11 : Collects the custom match rules of type pojo with the name objNode
     * <br>Index  12 : Collects all of the custom match rules of type jms for the tier
     * <br>Index  13 : Collects the custom match rules of type jms with the name objNode
     * <br>Index  14 : Collects all of the custom match rules of type webService for the tier
     * <br>Index  15 : Collects the custom match rules of type webService with the name objNode

     * </p>
     */
    public CustomMatchPoints getRESTCustomJavaExportObj(int queryIndex,String app, String tier, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nCustome match rule export query for application ").append(app).append(" for custom  ").append(tier).toString());}
        
        switch(queryIndex){
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
        }

        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeTDObjQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    

     
     /**
     * <p>
     *  This will export a single custom pojo into the application.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     *  
     * <p>
     * <br>Index  0 : Collects all of the custom match rules of type <b>binaryRemoting</b> for the tier
     * <br>Index  1 : Collects the custom match rules of type binaryRemoting with the name objNode
     * <br>Index  2 : Collects all of the custom match rules of type servlet for the tier
     * <br>Index  3 : Collects the custom match rules of type servlet with the name objNode
     * <br>Index  4 : Collects all of the custom match rules of type strutsAction for the tier
     * <br>Index  5 : Collects the custom match rules of type strutsAction with the name objNode
     * <br>Index  6 : Collects all of the custom match rules of type springBean for the tier
     * <br>Index  7 : Collects the custom match rules of type springBean with the name objNode
     * <br>Index  8 : Collects all of the custom match rules of type ejb for the tier
     * <br>Index  9 : Collects the custom match rules of type ejb with the name objNode
     * <br>Index  10 : Collects all of the custom match rules of type pojo for the tier
     * <br>Index  11 : Collects the custom match rules of type pojo with the name objNode
     * <br>Index  12 : Collects all of the custom match rules of type jms for the tier
     * <br>Index  13 : Collects the custom match rules of type jms with the name objNode
     * <br>Index  14 : Collects all of the custom match rules of type webService for the tier
     * <br>Index  15 : Collects the custom match rules of type webService with the name objNode

     * </p>
     */
    public String getRESTCustomJavaExport(int queryIndex,String app, String tier, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nCustome match rule export query for application ").append(app).append(" for custom  ").append(tier).toString());}
        
        switch(queryIndex){
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
        }

        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeTDQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    /**
     * <p>
     *  This will export a single or all .Net custom match rules for an application and tier.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     *  
     *  <p>
     * <br>Index  0 : Collects all of the custom match rules of type aspDotNet for the tier
     * <br>Index  1 : Collects the custom match rules of type aspDotNet with the name objNode
     * <br>Index  2 : Collects all of the custom match rules of type dotNetWebService for the tier
     * <br>Index  3 : Collects the custom match rules of type dotNetWebService with the name objNode
     * <br>Index  4 : Collects all of the custom match rules of type wcf for the tier
     * <br>Index  5 : Collects the custom match rules of type wcf with the name objNode
     * <br>Index  6 : Collects all of the custom match rules of type poco for the tier
     * <br>Index  7 : Collects the custom match rules of type poco with the name objNode
     * <br>Index  8 : Collects all of the custom match rules of type dotNetJms for the tier
     * <br>Index  9 : Collects the custom match rules of type dotNetJms with the name objNode
     * <br>Index  10 : Collects all of the custom match rules of type dotNetRemoting for the application
     * <br>Index  11 : Collects the custom match rules of type dotNetRemoting with the name objNode
     * </p>
     */
    public String getRESTCustomDotNetExport(int queryIndex,String app, String tier, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nCustome match rule export query for application ").append(app).append(" for custom  ").append(tier).toString());}
        
        switch(queryIndex){
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
        }

        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeTDQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will export a single custom .Net into the application.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     * <p>
     * <br>Index  0 : Collects all of the custom match rules of type aspDotNet for the application
     * <br>Index  1 : Collects the custom match rules of type aspDotNet with the name objNode
     * <br>Index  2 : Collects all of the custom match rules of type dotNetWebService for the application
     * <br>Index  3 : Collects the custom match rules of type dotNetWebService with the name objNode
     * <br>Index  4 : Collects all of the custom match rules of type wcf for the application
     * <br>Index  5 : Collects the custom match rules of type wcf with the name objNode
     * <br>Index  6 : Collects all of the custom match rules of type poco for the application
     * <br>Index  7 : Collects the custom match rules of type poco with the name objNode
     * <br>Index  8 : Collects all of the custom match rules of type dotNetJms for the application
     * <br>Index  9 : Collects the custom match rules of type dotNetJms with the name objNode
     * <br>Index  10 : Collects all of the custom match rules of type dotNetRemoting for the application
     * <br>Index  11 : Collects the custom match rules of type dotNetRemoting with the name objNode
     * </p>
     */
    public String getRESTCustomDotNetExport(int queryIndex,String app,String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).append(" for custom pojo ").append(objNode).toString());}
        
        switch(queryIndex){
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;

        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeTDQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    
    /**
     * <p>
     *  This will import a custom pojo into the application and tier given.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param objNode The name of the custom pojo
     * @param xml Xml string for the custom pojo
     * @return {@link String}
     * 
     * 
     * <p> 
     * <br>Index 0: Import Java custom match rule binaryRemoting
     * <br>Index 1: Import Java custom match rule servlet
     * <br>Index 2: Import Java custom match rule strutsAction
     * <br>Index 3: Import Java custom match rule springBean
     * <br>Index 4: Import Java custom match rule ejb
     * <br>Index 5: Import Java custom match rule pojo
     * <br>Index 6: Import Java custom match rule jms
     * <br>Index 7: Import Java custom match rule webService
     * <br>Index 8: Import DotNet custom match rule aspDotNet
     * <br>Index 9: Import DotNet custom match rule dotNetWebService
     * <br>Index 10: Import DotNet custom match rule wcf
     * <br>Index 11: Import DotNet custom match rule poco
     * <br>Index 12: Import DotNet custom match rule dotNetJms
     * <br>Index 13: Import DotNet custom match rule dotNetRemoting
     * </p>
     */
    public String postRESTCustomMatch(int queryIndex, String app, String objNode, String xml){
        
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo POST for application ").append(app)
                .append(" tier ").append(" for custom pojo ").append(objNode).toString());}
        
        switch(queryIndex){
            case 0://"binaryRemoting",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 1://"servlet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 2://"strutsAction"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 3://,"springBean",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 4://"ejb"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 5://"pojo"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 6://"jms"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 7://"webService"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 8://"aspDotNet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 9://"dotNetWebService",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 10://"wcf",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 11://"poco",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 12://"dotNetJms",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 13://"dotNetRemoting"}
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;

        }
        
        
        try{
            //return R.executeTDPostQuery(auth, query, objNode,xml);
            return R.executeAutoPostQuery(auth, query,objNode,xml);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will import a custom pojo into the application and tier given.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param objNode The name of the custom pojo
     * @param xml1 Xml File for the custom pojo
     * @return {@link String}
     * 
     * 
     * <p> 
     * <br>Index 0: Import Java custom match rule binaryRemoting
     * <br>Index 1: Import Java custom match rule servlet
     * <br>Index 2: Import Java custom match rule strutsAction
     * <br>Index 3: Import Java custom match rule springBean
     * <br>Index 4: Import Java custom match rule ejb
     * <br>Index 5: Import Java custom match rule pojo
     * <br>Index 6: Import Java custom match rule jms
     * <br>Index 7: Import Java custom match rule webService
     * <br>Index 8: Import DotNet custom match rule aspDotNet
     * <br>Index 9: Import DotNet custom match rule dotNetWebService
     * <br>Index 10: Import DotNet custom match rule wcf
     * <br>Index 11: Import DotNet custom match rule poco
     * <br>Index 12: Import DotNet custom match rule dotNetJms
     * <br>Index 13: Import DotNet custom match rule dotNetRemoting
     * </p>
     */
    public String postRESTCustomMatch(int queryIndex, String app, String objNode, java.io.FileReader xml1){
        
        String query=null;
        String xml=null;
        
        try{
            java.io.BufferedReader br=new java.io.BufferedReader(xml1);
            StringBuilder bud = new StringBuilder();
            String s;
            while((s= br.readLine()) != null){
                bud.append(s);
            }

            xml=bud.toString();
        }catch(Exception e){ logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred while attempting to open the file ").append(e.getMessage()).toString());return null;}
        
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo POST for application ").append(app)
                .append(" tier ").append(" for custom pojo ").append(objNode).toString());}
        
        switch(queryIndex){
            case 0://"binaryRemoting",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 1://"servlet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 2://"strutsAction"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 3://,"springBean",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 4://"ejb"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 5://"pojo"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 6://"jms"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 7://"webService"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 8://"aspDotNet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 9://"dotNetWebService",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 10://"wcf",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 11://"poco",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 12://"dotNetJms",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 13://"dotNetRemoting"}
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;

        }
        
        
        try{
            //return R.executeTDPostQuery(auth, query, objNode,xml);
            return R.executeAutoPostQuery(auth, query,objNode,xml);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will import a custom pojo into the application and tier given.
     * </p>
     * 
     * @param queryIndex The index of the query
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom pojo
     * @param xml Xml string for the custom pojo
     * @return {@link String}
     * 
     * <p> 
     * <br>Index 0: Import Java custom match rule binaryRemoting
     * <br>Index 1: Import Java custom match rule servlet
     * <br>Index 2: Import Java custom match rule strutsAction
     * <br>Index 3: Import Java custom match rule springBean
     * <br>Index 4: Import Java custom match rule ejb
     * <br>Index 5: Import Java custom match rule pojo
     * <br>Index 6: Import Java custom match rule jms
     * <br>Index 7: Import Java custom match rule webService
     * <br>Index 8: Import DotNet custom match rule aspDotNet
     * <br>Index 9: Import DotNet custom match rule dotNetWebService
     * <br>Index 10: Import DotNet custom match rule wcf
     * <br>Index 11: Import DotNet custom match rule poco
     * <br>Index 12: Import DotNet custom match rule dotNetJms
     * <br>Index 13: Import DotNet custom match rule dotNetRemoting
     * </p>
     */
    public String postRESTCustomMatch(int queryIndex, String app, String tier, String objNode, String xml){
        
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo POST for application ").append(app)
                .append(" tier ").append(tier).append(" for custom pojo ").append(objNode).toString());}
        
        switch(queryIndex){
            case 0://"binaryRemoting",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 1://"servlet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 2://"strutsAction"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 3://,"springBean",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 4://"ejb"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 5://"pojo"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 6://"jms"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 7://"webService"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 8://"aspDotNet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 9://"dotNetWebService",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 10://"wcf",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 11://"poco",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 12://"dotNetJms",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 13://"dotNetRemoting"}
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;

        }
        
        
        try{
           
            return R.executeAutoPostQuery(auth, query,objNode,xml);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will import a custom pojo into the application and tier given.
     * </p>
     * 
     * @param queryIndex The index of the query
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom pojo
     * @param xml1 Xml FileReader for the custom pojo
     * @return {@link String}
     * 
     * <p> 
     * <br>Index 0: Import Java custom match rule binaryRemoting
     * <br>Index 1: Import Java custom match rule servlet
     * <br>Index 2: Import Java custom match rule strutsAction
     * <br>Index 3: Import Java custom match rule springBean
     * <br>Index 4: Import Java custom match rule ejb
     * <br>Index 5: Import Java custom match rule pojo
     * <br>Index 6: Import Java custom match rule jms
     * <br>Index 7: Import Java custom match rule webService
     * <br>Index 8: Import DotNet custom match rule aspDotNet
     * <br>Index 9: Import DotNet custom match rule dotNetWebService
     * <br>Index 10: Import DotNet custom match rule wcf
     * <br>Index 11: Import DotNet custom match rule poco
     * <br>Index 12: Import DotNet custom match rule dotNetJms
     * <br>Index 13: Import DotNet custom match rule dotNetRemoting
     * </p>
     */
    public String postRESTCustomMatch(int queryIndex, String app, String tier, String objNode, java.io.FileReader xml1){
        
        String query=null;
        String xml=null;
        
        try{
            java.io.BufferedReader br=new java.io.BufferedReader(xml1);
            StringBuilder bud = new StringBuilder();
            String s;
            while((s= br.readLine()) != null){
                bud.append(s);
            }

            xml=bud.toString();
        }catch(Exception e){ logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred while attempting to open the file ").append(e.getMessage()).toString());return null;}
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo POST for application ").append(app)
                .append(" tier ").append(tier).append(" for custom pojo ").append(objNode).toString());}
        
        switch(queryIndex){
            case 0://"binaryRemoting",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 1://"servlet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 2://"strutsAction"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 3://,"springBean",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 4://"ejb"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 5://"pojo"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 6://"jms"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 7://"webService"
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 8://"aspDotNet",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 9://"dotNetWebService",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 10://"wcf",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 11://"poco",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 12://"dotNetJms",
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 13://"dotNetRemoting"}
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, tier,  s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;

        }
        
        
        try{
           
            return R.executeAutoPostQuery(auth, query,objNode,xml);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    
}

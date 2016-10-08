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
     *  This will export the custom match object of either a single java customer match of the type provide or the set of custom match rules. 
     *  If you want the set of custom match rules then provide null as the objNode otherwise we will return a single rule.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param objNode The name of the custom match rule
     * @return {@link CustomeMatchPoints}
     * 
     *  
     *  
     * <ul>
        * <li>Index  0 : Exports all of the custom match rules of type <b>binaryRemoting</b> for the application
        * <li>Index  1 : Exports the custom match rules of type <b>binaryRemoting</b> with the name objNode
        * <li>Index  2 : Exports all of the custom match rules of type <b>servlet</b> for the application
        * <li>Index  3 : Exports the custom match rules of type <b>servlet</b> with the name objNode
        * <li>Index  4 : Exports all of the custom match rules of type <b>strutsAction</b> for the application
        * <li>Index  5 : Exports the custom match rules of type <b>strutsAction</b> with the name objNode
        * <li>Index  6 : Exports all of the custom match rules of type <b>springBean</b> for the application
        * <li>Index  7 : Exports the custom match rules of type <b>springBean</b> with the name objNode
        * <li>Index  8 : Exports all of the custom match rules of type <b>ejb</b> for the application
        * <li>Index  9 : Exports the custom match rules of type <b>ejb</b> with the name objNode
        * <li>Index  10 : Exports all of the custom match rules of type <b>pojo</b> for the application
        * <li>Index  11 : Exports the custom match rules of type <b>pojo</b> with the name objNode
        * <li>Index  12 : Exports all of the custom match rules of type <b>jms</b> for the application
        * <li>Index  13 : Exports the custom match rules of type <b>jms</b> with the name objNode
        * <li>Index  14 : Exports all of the custom match rules of type <b>webService</b> for the application
        * <li>Index  15 : Exports the custom match rules of type <b>webService</b> with the name objNode
        * 
        * <li>Index  16 : Exports all of the custom match rules of type <b>aspDotNet</b> for the application
        * <li>Index  17 : Exports the custom match rule of type <b>aspDotNet</b> with the name objNode
        * <li>Index  18: Exports all of the custom match rules of type <b>dotNetWebService</b> for the application
        * <li>Index  19 : Exports the custom match rule of type <b>dotNetWebService</b> with the name objNode
        * <li>Index  20 : Exports all of the custom match rules of type <b>wcf</b> for the application
        * <li>Index  21 : Exports the custom match rule of type <b>wcf</b> with the name objNode
        * <li>Index  22 : Exports all of the custom match rules of type <b>poco</b> for the application
        * <li>Index  23 : Exports the custom match rule of type <b>poco</b> with the name objNode
        * <li>Index  24 : Exports all of the custom match rules of type <b>dotNetJms</b> for the application
        * <li>Index  25 : Exports the custom match rule of type <b>dotNetJms</b> with the name objNode
        * <li>Index  26 : Exports all of the custom match rules of type <b>dotNetRemoting</b> for the application
        * <li>Index  27 : Exports the custom match rule of type <b>dotNetRemoting</b> with the name objNode
        * 
        * <li>Index  28 : Exports all of the custom match rules of type <b>phpWeb</b> for the application
        * <li>Index  29 : Exports the custom match rule of type <b>phpWeb</b> with the name objNode
        * <li>Index  30 : Exports all of the custom match rules of type <b>phpMvc</b> for the application
        * <li>Index  31 : Exports the custom match rule of type <b>phpMvc</b> with the name objNode
        * <li>Index  32 : Exports all of the custom match rules of type <b>phpDrupal</b> for the application
        * <li>Index  33 : Exports the custom match rule of type <b>phpDrupal</b> with the name objNode
        * <li>Index  34 : Exports all of the custom match rules of type <b>phpWordpress</b> for the application
        * <li>Index  35 : Exports the custom match rule of type <b>phpWordpress</b> with the name objNode
        * <li>Index  36 : Exports all of the custom match rules of type <b>phpCli</b> for the application
        * <li>Index  37 : Exports the custom match rule of type <b>phpCli</b> with the name objNode
        * <li>Index  38 : Exports all of the custom match rules of type <b>phpWebService</b> for the application
        * <li>Index  39 : Exports the custom match rule of type <b>phpWebService</b> with the name objNode
        * <li>Index  40 : Exports all of the custom match rules of type <b>nodeJsWeb</b> for the application
        * 
        * <li>Index  41 : Exports the custom match rule of type <b>nodeJsWeb</b> with the name objNode

     * </ul>
     */
    public CustomMatchPoints getRESTCustomMatchRuleExportObj(int queryIndex,String app,String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nCustomer Match Export query for application ").append(app).append(" for ").append(objNode).toString());}
        
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
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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
     *  This will export the custom match object of either a single java customer match of the type provide or the set of custom match rules. 
     *  If you want the set of custom match rules then provide null as the objNode otherwise we will return a single rule.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     *  
     *  
     * <ul>
        * <li>Index  0 : Exports all of the custom match rules of type <b>binaryRemoting</b> for the application
        * <li>Index  1 : Exports the custom match rules of type <b>binaryRemoting</b> with the name objNode
        * <li>Index  2 : Exports all of the custom match rules of type <b>servlet</b> for the application
        * <li>Index  3 : Exports the custom match rules of type <b>servlet</b> with the name objNode
        * <li>Index  4 : Exports all of the custom match rules of type <b>strutsAction</b> for the application
        * <li>Index  5 : Exports the custom match rules of type <b>strutsAction</b> with the name objNode
        * <li>Index  6 : Exports all of the custom match rules of type <b>springBean</b> for the application
        * <li>Index  7 : Exports the custom match rules of type <b>springBean</b> with the name objNode
        * <li>Index  8 : Exports all of the custom match rules of type <b>ejb</b> for the application
        * <li>Index  9 : Exports the custom match rules of type <b>ejb</b> with the name objNode
        * <li>Index  10 : Exports all of the custom match rules of type <b>pojo</b> for the application
        * <li>Index  11 : Exports the custom match rules of type <b>pojo</b> with the name objNode
        * <li>Index  12 : Exports all of the custom match rules of type <b>jms</b> for the application
        * <li>Index  13 : Exports the custom match rules of type <b>jms</b> with the name objNode
        * <li>Index  14 : Exports all of the custom match rules of type <b>webService</b> for the application
        * <li>Index  15 : Exports the custom match rules of type <b>webService</b> with the name objNode
        * 
        * <li>Index  16 : Exports all of the custom match rules of type <b>aspDotNet</b> for the application
        * <li>Index  17 : Exports the custom match rule of type <b>aspDotNet</b> with the name objNode
        * <li>Index  18: Exports all of the custom match rules of type <b>dotNetWebService</b> for the application
        * <li>Index  19 : Exports the custom match rule of type <b>dotNetWebService</b> with the name objNode
        * <li>Index  20 : Exports all of the custom match rules of type <b>wcf</b> for the application
        * <li>Index  21 : Exports the custom match rule of type <b>wcf</b> with the name objNode
        * <li>Index  22 : Exports all of the custom match rules of type <b>poco</b> for the application
        * <li>Index  23 : Exports the custom match rule of type <b>poco</b> with the name objNode
        * <li>Index  24 : Exports all of the custom match rules of type <b>dotNetJms</b> for the application
        * <li>Index  25 : Exports the custom match rule of type <b>dotNetJms</b> with the name objNode
        * <li>Index  26 : Exports all of the custom match rules of type <b>dotNetRemoting</b> for the application
        * <li>Index  27 : Exports the custom match rule of type <b>dotNetRemoting</b> with the name objNode
        * 
        * <li>Index  28 : Exports all of the custom match rules of type <b>phpWeb</b> for the application
        * <li>Index  29 : Exports the custom match rule of type <b>phpWeb</b> with the name objNode
        * <li>Index  30 : Exports all of the custom match rules of type <b>phpMvc</b> for the application
        * <li>Index  31 : Exports the custom match rule of type <b>phpMvc</b> with the name objNode
        * <li>Index  32 : Exports all of the custom match rules of type <b>phpDrupal</b> for the application
        * <li>Index  33 : Exports the custom match rule of type <b>phpDrupal</b> with the name objNode
        * <li>Index  34 : Exports all of the custom match rules of type <b>phpWordpress</b> for the application
        * <li>Index  35 : Exports the custom match rule of type <b>phpWordpress</b> with the name objNode
        * <li>Index  36 : Exports all of the custom match rules of type <b>phpCli</b> for the application
        * <li>Index  37 : Exports the custom match rule of type <b>phpCli</b> with the name objNode
        * <li>Index  38 : Exports all of the custom match rules of type <b>phpWebService</b> for the application
        * <li>Index  39 : Exports the custom match rule of type <b>phpWebService</b> with the name objNode
        * <li>Index  40 : Exports all of the custom match rules of type <b>nodeJsWeb</b> for the application
        * 
        * <li>Index  41 : Exports the custom match rule of type <b>nodeJsWeb</b> with the name objNode

     * </ul>
     */
    public String getRESTCustomMatchRuleExport(int queryIndex,String app,String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nCustomer Match Export query for application ").append(app).append(" for ").append(objNode).toString());}
        
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
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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
     *  This will export the custom match object of either a single java customer match of the type provide or the set of custom match rules. 
     *  If you want the set of custom match rules then provide null as the objNode otherwise we will return a single rule.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom match rule
     * @return {@link CustomeMatchPoints}
     * 
     *  
     *  
     * <ul>
        * <li>Index  0 : Exports all of the custom match rules of type <b>binaryRemoting</b> for the application
        * <li>Index  1 : Exports the custom match rules of type <b>binaryRemoting</b> with the name objNode
        * <li>Index  2 : Exports all of the custom match rules of type <b>servlet</b> for the application
        * <li>Index  3 : Exports the custom match rules of type <b>servlet</b> with the name objNode
        * <li>Index  4 : Exports all of the custom match rules of type <b>strutsAction</b> for the application
        * <li>Index  5 : Exports the custom match rules of type <b>strutsAction</b> with the name objNode
        * <li>Index  6 : Exports all of the custom match rules of type <b>springBean</b> for the application
        * <li>Index  7 : Exports the custom match rules of type <b>springBean</b> with the name objNode
        * <li>Index  8 : Exports all of the custom match rules of type <b>ejb</b> for the application
        * <li>Index  9 : Exports the custom match rules of type <b>ejb</b> with the name objNode
        * <li>Index  10 : Exports all of the custom match rules of type <b>pojo</b> for the application
        * <li>Index  11 : Exports the custom match rules of type <b>pojo</b> with the name objNode
        * <li>Index  12 : Exports all of the custom match rules of type <b>jms</b> for the application
        * <li>Index  13 : Exports the custom match rules of type <b>jms</b> with the name objNode
        * <li>Index  14 : Exports all of the custom match rules of type <b>webService</b> for the application
        * <li>Index  15 : Exports the custom match rules of type <b>webService</b> with the name objNode
        * 
        * <li>Index  16 : Exports all of the custom match rules of type <b>aspDotNet</b> for the application
        * <li>Index  17 : Exports the custom match rule of type <b>aspDotNet</b> with the name objNode
        * <li>Index  18: Exports all of the custom match rules of type <b>dotNetWebService</b> for the application
        * <li>Index  19 : Exports the custom match rule of type <b>dotNetWebService</b> with the name objNode
        * <li>Index  20 : Exports all of the custom match rules of type <b>wcf</b> for the application
        * <li>Index  21 : Exports the custom match rule of type <b>wcf</b> with the name objNode
        * <li>Index  22 : Exports all of the custom match rules of type <b>poco</b> for the application
        * <li>Index  23 : Exports the custom match rule of type <b>poco</b> with the name objNode
        * <li>Index  24 : Exports all of the custom match rules of type <b>dotNetJms</b> for the application
        * <li>Index  25 : Exports the custom match rule of type <b>dotNetJms</b> with the name objNode
        * <li>Index  26 : Exports all of the custom match rules of type <b>dotNetRemoting</b> for the application
        * <li>Index  27 : Exports the custom match rule of type <b>dotNetRemoting</b> with the name objNode
        * 
        * <li>Index  28 : Exports all of the custom match rules of type <b>phpWeb</b> for the application
        * <li>Index  29 : Exports the custom match rule of type <b>phpWeb</b> with the name objNode
        * <li>Index  30 : Exports all of the custom match rules of type <b>phpMvc</b> for the application
        * <li>Index  31 : Exports the custom match rule of type <b>phpMvc</b> with the name objNode
        * <li>Index  32 : Exports all of the custom match rules of type <b>phpDrupal</b> for the application
        * <li>Index  33 : Exports the custom match rule of type <b>phpDrupal</b> with the name objNode
        * <li>Index  34 : Exports all of the custom match rules of type <b>phpWordpress</b> for the application
        * <li>Index  35 : Exports the custom match rule of type <b>phpWordpress</b> with the name objNode
        * <li>Index  36 : Exports all of the custom match rules of type <b>phpCli</b> for the application
        * <li>Index  37 : Exports the custom match rule of type <b>phpCli</b> with the name objNode
        * <li>Index  38 : Exports all of the custom match rules of type <b>phpWebService</b> for the application
        * <li>Index  39 : Exports the custom match rule of type <b>phpWebService</b> with the name objNode
        * <li>Index  40 : Exports all of the custom match rules of type <b>nodeJsWeb</b> for the application
        * 
        * <li>Index  41 : Exports the custom match rule of type <b>nodeJsWeb</b> with the name objNode

     * </ul>
     */
    public CustomMatchPoints getRESTCustomMatchRuleExportObj(int queryIndex,String app, String tier, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nCustomer Match Export query for application ").append(app).append(" for ").append(objNode).toString());}
        
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
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  tier,s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  tier,s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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
     *  This will export the custom match object of either a single java customer match of the type provide or the set of custom match rules. 
     *  If you want the set of custom match rules then provide null as the objNode otherwise we will return a single rule.
     * </p>
     * 
     * @param queryIndex The index for this query
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom match rule
     * @return {@link String}
     * 
     *  
     *  
     * <ul>
        * <li>Index  0 : Exports all of the custom match rules of type <b>binaryRemoting</b> for the application
        * <li>Index  1 : Exports the custom match rules of type <b>binaryRemoting</b> with the name objNode
        * <li>Index  2 : Exports all of the custom match rules of type <b>servlet</b> for the application
        * <li>Index  3 : Exports the custom match rules of type <b>servlet</b> with the name objNode
        * <li>Index  4 : Exports all of the custom match rules of type <b>strutsAction</b> for the application
        * <li>Index  5 : Exports the custom match rules of type <b>strutsAction</b> with the name objNode
        * <li>Index  6 : Exports all of the custom match rules of type <b>springBean</b> for the application
        * <li>Index  7 : Exports the custom match rules of type <b>springBean</b> with the name objNode
        * <li>Index  8 : Exports all of the custom match rules of type <b>ejb</b> for the application
        * <li>Index  9 : Exports the custom match rules of type <b>ejb</b> with the name objNode
        * <li>Index  10 : Exports all of the custom match rules of type <b>pojo</b> for the application
        * <li>Index  11 : Exports the custom match rules of type <b>pojo</b> with the name objNode
        * <li>Index  12 : Exports all of the custom match rules of type <b>jms</b> for the application
        * <li>Index  13 : Exports the custom match rules of type <b>jms</b> with the name objNode
        * <li>Index  14 : Exports all of the custom match rules of type <b>webService</b> for the application
        * <li>Index  15 : Exports the custom match rules of type <b>webService</b> with the name objNode
        * 
        * <li>Index  16 : Exports all of the custom match rules of type <b>aspDotNet</b> for the application
        * <li>Index  17 : Exports the custom match rule of type <b>aspDotNet</b> with the name objNode
        * <li>Index  18: Exports all of the custom match rules of type <b>dotNetWebService</b> for the application
        * <li>Index  19 : Exports the custom match rule of type <b>dotNetWebService</b> with the name objNode
        * <li>Index  20 : Exports all of the custom match rules of type <b>wcf</b> for the application
        * <li>Index  21 : Exports the custom match rule of type <b>wcf</b> with the name objNode
        * <li>Index  22 : Exports all of the custom match rules of type <b>poco</b> for the application
        * <li>Index  23 : Exports the custom match rule of type <b>poco</b> with the name objNode
        * <li>Index  24 : Exports all of the custom match rules of type <b>dotNetJms</b> for the application
        * <li>Index  25 : Exports the custom match rule of type <b>dotNetJms</b> with the name objNode
        * <li>Index  26 : Exports all of the custom match rules of type <b>dotNetRemoting</b> for the application
        * <li>Index  27 : Exports the custom match rule of type <b>dotNetRemoting</b> with the name objNode
        * 
        * <li>Index  28 : Exports all of the custom match rules of type <b>phpWeb</b> for the application
        * <li>Index  29 : Exports the custom match rule of type <b>phpWeb</b> with the name objNode
        * <li>Index  30 : Exports all of the custom match rules of type <b>phpMvc</b> for the application
        * <li>Index  31 : Exports the custom match rule of type <b>phpMvc</b> with the name objNode
        * <li>Index  32 : Exports all of the custom match rules of type <b>phpDrupal</b> for the application
        * <li>Index  33 : Exports the custom match rule of type <b>phpDrupal</b> with the name objNode
        * <li>Index  34 : Exports all of the custom match rules of type <b>phpWordpress</b> for the application
        * <li>Index  35 : Exports the custom match rule of type <b>phpWordpress</b> with the name objNode
        * <li>Index  36 : Exports all of the custom match rules of type <b>phpCli</b> for the application
        * <li>Index  37 : Exports the custom match rule of type <b>phpCli</b> with the name objNode
        * <li>Index  38 : Exports all of the custom match rules of type <b>phpWebService</b> for the application
        * <li>Index  39 : Exports the custom match rule of type <b>phpWebService</b> with the name objNode
        * <li>Index  40 : Exports all of the custom match rules of type <b>nodeJsWeb</b> for the application
        * 
        * <li>Index  41 : Exports the custom match rule of type <b>nodeJsWeb</b> with the name objNode

     * </ul>
     */
    public String getRESTCustomMatchRuleExport(int queryIndex,String app, String tier, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nCustomer Match Export query for application ").append(app).append(" for ").append(objNode).toString());}
        
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
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  tier,s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,  tier,s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier, s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app, tier,s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionExport(baseURL.getControllerURL(), app,tier, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app,s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), app, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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
            case 0:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[0],null);
                break;
            case 1:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[0],objNode);
                break;
            case 2:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[1],null);
                break;
            case 3:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[1],objNode);
                break;
            case 4:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[2],null);
                break;
            case 5:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[2],objNode);
                break;
            case 6:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[3],null);
                break;
            case 7:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[3],objNode);
                break;
            case 8:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[4],null);
                break;
            case 9:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[4],objNode);
                break;
            case 10:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[5],null);
                break;
            case 11:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[5],objNode);
                break;
            case 12:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[6],null);
                break;
            case 13:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[6],objNode);
                break;
            case 14:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.JAVA_CUSTOM_MATCHES[7],null);
                break;
            case 15:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.JAVA_CUSTOM_MATCHES[7],objNode);
                break;
            case 16:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[0],null);
                break;
            case 17:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[0],objNode);
                break;
            case 18:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[1],null);
                break;
            case 19:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[1],objNode);
                break;
            case 20:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[2],null);
                break;
            case 21:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[2],objNode);
                break;
            case 22:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[3],null);
                break;
            case 23:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.DOTNET_CUSTOM_MATCHES[3],objNode);
                break;
            case 24:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[4],null);
                break;
            case 25:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[4],objNode);
                break;
            case 26:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[5],null);
                break;
            case 27:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.DOTNET_CUSTOM_MATCHES[5],objNode);
                break;
            case 28:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[0],null);
                break;
            case 29:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[0],objNode);
                break;
            case 30:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[1],null);
                break;
            case 31:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[1],objNode);
                break;
            case 32:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[2],null);
                break;
            case 33:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[2],objNode);
                break;
            case 34:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[3],null);
                break;
            case 35:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,  s.PHP_CUSTOM_MATCHES[3],objNode);
                break;
            case 36:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.PHP_CUSTOM_MATCHES[4],null);
                break;
            case 37:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[4],objNode);
                break;
            case 38:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[5],null);
                break;
            case 39:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.PHP_CUSTOM_MATCHES[5],objNode);
                break;
            case 40:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app,s.NODEJS_CUSTOM_MATCHES[0],null);
                break;
            case 41:
                query=TransactionDetectionQuery.queryGenericTransactionDetectionImport(baseURL.getControllerURL(), tier, app, s.NODEJS_CUSTOM_MATCHES[0],objNode);
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

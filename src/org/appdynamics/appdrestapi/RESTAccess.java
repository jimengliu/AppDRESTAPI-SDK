/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi;


import org.appdynamics.appdrestapi.data.AutoDiscoveryConfig;
import org.appdynamics.appdrestapi.queries.*;
import org.appdynamics.appdrestapi.data.*;
import org.appdynamics.appdrestapi.exportdata.*;
import org.appdynamics.appdrestapi.resources.*;
import org.appdynamics.appdrestapi.util.*;


import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author gilbert.solorzano@appdynamics.com
 * <p>
 * The RESTAccess is a class that allows access to AppDynamics REST API. The intention
 * is to provide a easy method to to access the AppDynamics Controller REST service. 
 * </p>
 * <p>
 * Metrics : 
 * 1 minute level data upto 4 hours
 * 10 minute level data after 4 hours upto 48 hours
 * 1 hour level data after 48 hours upto 365 days.
 * </p>
 * 
 * 
 */
public class RESTAccess {
    private static final Logger logger=Logger.getLogger(RESTAccess.class.getName());
    protected RESTBaseURL baseURL;
    protected RESTAuth auth;
    protected RESTExecuter R;
    
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller. This will default to the following :
     * useSSL false
     * account customer1
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess(String controllerURL, String port, String username, String password){
        baseURL=new RESTBaseURL(controllerURL, port);
        auth=new RESTAuth(username, password);
        R=new RESTExecuter(baseURL.getControllerURL());
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.This will default to the following :
     * account customer1
     * </p>
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password){
        baseURL=new RESTBaseURL(controllerURL, port, ssl);
        auth=new RESTAuth(username,password);
        R=new RESTExecuter(baseURL.getControllerURL());
    }
    
    /**
     * <p>
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.This will default to the following :
     * useSSL false
     * </p>.
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     */
    public RESTAccess(String controllerURL, String port, String username, String password, String account){
        baseURL=new RESTBaseURL(controllerURL, port);
        auth=new RESTAuth(username, password, account, true);
        R=new RESTExecuter(baseURL.getControllerURL());
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
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password, String account){
        baseURL=new RESTBaseURL(controllerURL, port, ssl);
        auth=new RESTAuth(username, password, account, true);
        R=new RESTExecuter(baseURL.getControllerURL());
        
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
     * @param  proxy {@link RESTProxy} Proxy object with needed information
     */
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password, String account, RESTProxy proxy){
        baseURL=new RESTBaseURL(controllerURL, port, ssl);
        auth=new RESTAuth(username, password, account, true,proxy);
        R=new RESTExecuter(baseURL.getControllerURL());
        
    }
    
    /**
     * <p>
     * Turns debug level on, this will produce a lot of logging output and 
     * should only be run when troubleshooting an issue.
     * </p>
     * 
     * @param level Debug level 0-4, 0 being the default minimal logging
     */
    public void setDebugLevel(int level){
        if(level >= 0 || level < 4) s.debugLevel=level;
    }
    
    /**
     * <p>
     * Returns the list of application in the controller for the account provided in the authentication.
     * </p>
     * 
     * @return {@link Applications}
     */
    public Applications getApplications(){
        try{
            return R.executeApplicationQuery(auth, ApplicationQuery.queryAllApplications(baseURL.getControllerURL()));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This will return a string of the AppDynamics application export based on the
     * application id given.
     * </p>
     * 
     * @param appId Id of the application 
     * @return {@link String}
     */
    public String getApplicationExportById(int appId){
        try{
            return R.executeApplicationExportByIdQuery(auth, ApplicationExportQuery.queryApplicationExportByID(baseURL.getControllerURL(), appId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This will return a Java object of the AppDynamics application export based on the
     * application id given. This can then be used to extract or check on configuration.
     * </p>
     * 
     * 
     * @param appId Id of the application 
     * @return {@link ExApplication}
     */
    public ExApplication getApplicationExportObjById(int appId){
        try{
            return R.executeApplicationExportObjByIdQuery(auth, ApplicationExportQuery.queryApplicationExportByID(baseURL.getControllerURL(), appId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
     /**
     * <p>
     * This will return a Dashboard object which consists of a name, value (xml string) and boolean exists
     * that checks to insure the dashboard exists.
     * </p>
     * 
     * @param dashId Id of the application 
     * @return {@link Dashboard}
     */
    public Dashboard getDashboardExportById(int dashId){
        try{
            return R.executeDashboardExportByIdQuery(auth, DashboardQuery.queryDashboardExportById(baseURL.getControllerURL(), dashId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This will return the list of the metric base paths available for example:
     * </p>

     * 
     *  <ul>
            <li>metric-items
     *          <ul>   <li>metric-item
		   <ul><li>name = Business Transaction Performance
		   <li>type = folder</ul>
                </ul>
	<ul>   <li>metric-item
		   <ul><li>name = Mobile
		   <li>type = folder<li></ul></ul>
	<ul>   <li>metric-item
		   <ul><li>name = Overall Application Performance
		   <li>type = folder<li></ul></ul>
	<ul>   <li>metric-item
		   <ul><li>name = Service End Points
		   <li>type = folder<li></ul></ul>
	<ul>   <li>metric-item
		   <ul><li>name = End User Experience
		   <li>type = folder<li></ul></ul>
	<ul>   <li>metric-item
		   <ul><li>name = Backends
		   <li>type = folder<li></ul></ul>
	<ul>   <li>metric-item
		   <ul><li>name = Information Points
		   <li>type = folder<li></ul></ul>
	<ul>   <li>metric-item
		   <ul><li>name = Errors
		   <li>type = folder<li></ul></ul>
	<ul>   <li>metric-item
		   <ul><li>name = Application Infrastructure Performance
		   <li>type = folder<li></ul></ul>


        </ul>
     *
     *  <p>
     *      These paths can then be used to traverse custom metrics paths with AppDynamics.
     *  </p>
     * 
     * @param application Name of the application
     * @return {@link MetricItems}
     * 
     */
    public MetricItems getBaseMetricList(String application){
        try{
            MetricItems mis = R.executeMetricItems(auth, MetricItemQuery.queryMetricList(baseURL.getControllerURL(), application));
            mis.setParent(s._S);
            return mis;
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This will allow the user to provide the metric path they wish to walk. 
     * The metricPaths parameter is the metric path and needs to be separated by the character '|'.
     * </p>
     * 
     *  <ul><li>metric-items
	<ul>   <li>metric-item
	<ul>	   <li>name = Business Transactions
		   <li>type = folder</ul></ul>
	<ul><li>   metric-item
	<ul>	   <li>name = Business Transaction Groups
		   <li>type = folder</ul></ul>
        </ul>     * 
      
        <p>
        As long as the metric-item type is "folder" you can add it to the path
        of the metric path separated by '|'. Once you reach the type "leaf" you can 
        request the metric using {@link #getBaseMetricListPath(String, String) getBaseMetricListPath}
        </p>
	<ul><li>metric-item
	<ul>	<li>name = Average CPU Used (ms)
		<li>type = leaf</ul></ul>

     * 
     * 
     * @param application Name of the application
     * @param metricPath Metric path to the metric list requested
     * @return {@link MetricItems}
     * 
     */
    public MetricItems getBaseMetricListPath(String application, String metricPath){
        try{
            MetricItems mis = R.executeMetricItems(auth, MetricItemQuery.queryMetricListForPath(baseURL.getControllerURL(), application,metricPath));
            mis.setParent(metricPath);
            return mis;
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This is going to execute a generic query based on the application and full metric path given.<br>
     * This will allow a user to get metrics from custom extensions.
     * </p>
     * 
     * @param application Name of the application
     * @param metricPath String that determine which metric to request
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     */
    public MetricDatas getRESTGenericMetricQuery(String application, String metricPath, long start, long end, boolean rollup){
        try{
            return R.executeMetricQuery(auth, MetricItemQuery.queryGeneralMetricQuery(baseURL.getControllerURL(), application, metricPath, start, end,rollup));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    /**
     * <p>
     * Returns the Business Transactions for an application name given.
     * </p>
     * @param application Name of the application
     * @return {@link BusinessTransactions}
     * 
     */
    public BusinessTransactions getBTSForApplication(String application){
        try{
            return R.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTSFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the Business Transactions for an application id given.
     * </p>
     * @param appId The id for the application
     * @return {@link BusinessTransactions}
     * 
     */
    public BusinessTransactions getBTSForApplication(int appId){
        try{
            return R.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTSFromApps(baseURL.getControllerURL(), appId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Returns the Business Transaction for application name and business transaction id given.
     * </p>
     * 
     * @param application Name of the application
     * @param btId Id of the Business Transaction
     * @return {@link BusinessTransactions}
     * 
     */
    public BusinessTransactions getBTForApplication(String application,int btId){
        try{
            return R.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTFromApps(baseURL.getControllerURL(), application, btId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Returns the Business Transaction for application id and business transaction id given.
     * </p>
     * 
     * @param appId The id for the application
     * @param btId Id of the Business Transaction
     * @return {@link BusinessTransactions}
     */
    public BusinessTransactions getBTForApplication(int appId,int btId){
        try{
            return R.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTFromApps(baseURL.getControllerURL(), appId, btId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    
    /**
     * 
     * <p>
     * Returns the list of snapshots for the application name given.
     * </p>
     * 
     * @param application Name of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @return {@link Snapshots}
     * 
     */
    public Snapshots getSnapshots(String application, long start, long end){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * <p>
     * Returns the list of snapshots for the application id given.
     * </p>
     * 
     * @param application Id of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @return {@link Snapshots}
     * 
     */
    public Snapshots getSnapshots(int application, long start, long end){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the list of snapshot for the application id given and filtering provided in the RequestSnapshots object.
     * </p>
     * @param application Id of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param req {@link RequestSnapshots}
     * @return {@link Snapshots}
     */
    public Snapshots getSnapshots(int application, long start, long end, RequestSnapshots req){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end, req));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the list of snapshot for the application id given and filtering provided in the RequestSnapshots object.
     * </p>
     * @param application Name of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param req {@link RequestSnapshots}
     * @return {@link Snapshots}
     */
    public Snapshots getSnapshots(String application, long start, long end, RequestSnapshots req){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end, req));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Returns the list of snapshots with detailed snapshot properties for the application name given.
     * </p>
     * 
     * @param application Name of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param needProps Return Detailed Properties in Snapshot
     * @return {@link Snapshots}
     * 
     */
    public Snapshots getSnapshots(String application, long start, long end, boolean needProps){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end, needProps));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Returns the list of snapshots with detailed snapshot properties for the application id. 
     * </p>
     * 
     * @param application Id of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param needProps Return Detailed Properties in Snapshot
     * @return {@link Snapshots}
     */
    public Snapshots getSnapshots(int application, long start, long end, boolean needProps){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end, needProps));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Returns the list of snapshots with detailed snapshot properties for the application name with additional parameters.
     * </p>
     * 
     * @param application Name of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param needProps Return Detailed Properties in Snapshot

     * @param dataCollectorName Name of the data collector
     * @param dataCollectorType Type of the data collector
     * @param dataCollectorValue Value of the data collector
     * @return {@link Snapshots}
     * 
     */
    public Snapshots getSnapshots(String application, long start, long end, boolean needProps, String dataCollectorName, String dataCollectorValue, String dataCollectorType){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end, needProps, dataCollectorName, dataCollectorValue, dataCollectorType));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Returns the list of snapshots with detailed snapshot properties for the application id with additional parameters.
     * </p>
     * 
     * @param application Id of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @param needProps Return Detailed Properties in Snapshot
     * @param dataCollectorName Name of the data collector
     * @param dataCollectorType Type of the data collector
     * @param dataCollectorValue Value of the data collector
     * @return {@link Snapshots}
     * 
     */
    
    public Snapshots getSnapshots(int application, long start, long end, boolean needProps, String dataCollectorName, String dataCollectorValue, String dataCollectorType){
        try{
            return R.executeSnapshots(auth, SnapshotQuery.queryRequestSnapshot(baseURL.getControllerURL(), application, start, end, needProps, dataCollectorName, dataCollectorValue, dataCollectorType));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the tiers for an application name given.
     * </p>
     * 
     * @param application Name of the application
     * @return {@link Tiers}
     * 
     */
    public Tiers getTiersForApplication(String application){
        try{
            return R.executeTierQuery(auth, TierQuery.queryTiersFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the list of tiers for an application id given.
     * </p>
     * @param application ExApplication id
     * @return {@link Tiers}
     */
    public Tiers getTiersForApplication(int application){
        try{
            return R.executeTierQuery(auth, TierQuery.queryTiersFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Return the tier for the application name and tier id given.
     * </p>
     * 
     * @param application Name of the application
     * @param tierId ID of the Tier
     * @return {@link Tiers}
     */
    public Tiers getTierForApplication(String application, int tierId){
        try{
            return R.executeTierQuery(auth, TierQuery.queryTierFromApps(baseURL.getControllerURL(), application,tierId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     * 
     * <p>
     * Return the tier for the application id and tier id given.
     * </p>
     * 
     * @param application ExApplication id
     * @param tierId ID of the Tier
     * @return {@link Tiers}
     */
    public Tiers getTierForApplication(int application, int tierId){
        try{
            return R.executeTierQuery(auth, TierQuery.queryTierFromApps(baseURL.getControllerURL(), application, tierId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *  
     * <p>
     * Return the list of nodes for the application name and tier name given.
     * </p>
     * @param application Name of the application
     * @param tier Name of the tier
     * @return {@link Nodes}
     */
    public Nodes getNodesFromTier(String application, String tier){
        try{
            return R.executeNodeQuery(auth, TierQuery.queryNodesFromTier(baseURL.getControllerURL(), application,tier));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     *  
     * <p>
     * Return the list of nodes for the application id and tier name given.
     * </p>
     * @param application Id of the application
     * @param tier Name of the tier
     * @return {@link Nodes}
     */
    public Nodes getNodesFromTier(int application, String tier){
        try{
            return R.executeNodeQuery(auth, TierQuery.queryNodesFromTier(baseURL.getControllerURL(), application,tier));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     *  
     * <p>
     * Return the list of nodes for the application name and tier id given.
     * </p>
     * 
     * @param application Name of the application
     * @param tier Id of the tier
     * @return {@link Nodes}
     */
    public Nodes getNodesFromTier(String application, int tier){
        try{
            return R.executeNodeQuery(auth, TierQuery.queryNodesFromTier(baseURL.getControllerURL(), application,tier));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * <p>
     * Return the list of nodes for the application id and tier id given.
     * </p>
     * @param application Id of the application
     * @param tier Id of the tier
     * @return {@link Nodes}
     */
    public Nodes getNodesFromTier(int application, int tier){
        try{
            return R.executeNodeQuery(auth, TierQuery.queryNodesFromTier(baseURL.getControllerURL(), application,tier));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    
    /**
     * <p>
     * Returns the nodes for an application name given.
     * </p>
     * @param application Name of the application
     * @return {@link Nodes}
     */
    public Nodes getNodesForApplication(String application){
        try{
            return R.executeNodeQuery(auth, NodeQuery.queryNodesFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the nodes for an application id given.
     * </p>
     * @param application Id of the application 
     * @return {@link Nodes}
     */
    public Nodes getNodesForApplication(int application){
        try{
            return R.executeNodeQuery(auth, NodeQuery.queryNodesFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * <p>
     * Returns the node for the application name and node id given.
     * </p>
     * @param application Name of the application
     * @param nodeId id of the Node
     * @return {@link Nodes}
     */
    public Nodes getNodeForApplication(String application, int nodeId){
        try{
            return R.executeNodeQuery(auth, NodeQuery.queryNodeFromApps(baseURL.getControllerURL(), application,nodeId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     * <p>
     * Returns the node for the application id and node id given.
     * </p>
     *
     * @param application Id of the application
     * @param nodeId Id of the Node
     * @return {@link Nodes}
     */
    public Nodes getNodeForApplication(int application,int nodeId){
        try{
            return R.executeNodeQuery(auth, NodeQuery.queryNodeFromApps(baseURL.getControllerURL(), application, nodeId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     * <p>
     * Returns the backends for an application name given.
     * </p>
     * @param application Name of the application
     * @return {@link Backends}
     */
    public Backends getBackendsForApplication(String application){
        try{
            return R.executeBackends(auth, BackendsQuery.queryBackendsFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the health rule violations for an application name given.
     * </p>
     * @param application Name of the application
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @return {@link PolicyViolations}
     */
    public PolicyViolations getHealthRuleViolations(String application, long start, long end){
        try{
            return R.executePolicyViolations(auth, PolicyViolationQuery.queryHealthRuleViolationsFromApps(baseURL.getControllerURL(), application,start,end));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * <p>
     * Returns the policy violations for an application name given.
     * </p>
     * @param application Name of the application
     * @param start Timestamp for the start time
     * @param end Timestamp for the end time
     * @return {@link PolicyViolations}
     */
    public PolicyViolations getPolicyViolations(String application, long start, long end){
        try{
            return R.executePolicyViolations(auth, PolicyViolationQuery.queryPolicyViolationsFromApps(baseURL.getControllerURL(), application, start, end));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * Returns the events for an application name, event types and severities given.
     * </p>
     * @param application Name of the application
     * @param eventTypes Event types to request, comma delimited list
     * @param severities Severities to request, comma delimited list
     * @param start Timestamp of the start time
     * @param end Timestamp of the end time
     * @return {@link Events}
     */
    public Events getEvents(String application, String eventTypes, String severities, long start, long end){
        StringBuilder bud = new StringBuilder();
        try{
            bud.append("\nCreating the query::");
            String query=EventsQuery.queryPolicyViolationsSFromApps(baseURL.getControllerURL(), application, eventTypes, severities, start, end);
            bud.append("\nBuiltQuery::").append(query);
            return R.executeEvents(auth, query);
        }catch(Exception e){
            bud.append("\nApplication::").append(application).append("\nEventTypes::").append(eventTypes);
            bud.append("\nSeverities::").append(severities).append("\nStartTime::").append(start);
            bud.append("\nEndTime::").append(end);
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append(bud.toString()).toString());
        }
        return null;
    }
    
     /**
     * 
     * <p>
     * Returns MetricData for general tier level metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br>Index 0  : queyrAgentTierAppAgentAvailability
     * <br>Index 1  : queryAgentTierMachineAgentAvailability
     * <br>Index 2  : queryHDTierCPUBusy
     * <br>Index 3  : queryHDTierCPUIdle
     * <br>Index 4  : queryHDTierCPUStolen
     * <br>Index 5  : queryHDTierDisksKBReadPerSec
     * <br>Index 6  : queryHDTierDisksKBWrittenPerSec
     * <br>Index 7  : queryHDTierDisksReadPerSec
     * <br>Index 8  : queryHDTierDisksWritesPerSec
     * <br>Index 9  : queryHDTierMemoryFreePerc
     * <br>Index 10 : queryHDTierMemoryFreeMB
     * <br>Index 11 : queryHDTierMemoryTotalMB
     * <br>Index 12 : queryHDTierMemoryUsedPerc
     * <br>Index 13 : queryHDTierMemoryUsedMB
     * <br>Index 14 : queryHDTierNetworkIncomingKB
     * <br>Index 15 : queryHDTierNetworkIncomingKBPerSec
     * <br>Index 16 : queryHDTierNetworkIncomingPackets
     * <br>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
     * <br>Index 18 : queryHDTierNetworkOutgoingKB
     * <br>Index 19 : queryHDTierNetworkOutgoingKBPerSec
     * <br>Index 20 : queryHDTierNetworkOutgoingPackets
     * <br>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
     * <br>Index 22 : queryJVMTierProcessCPUBurntMSPerMin
     * <br>Index 23 : queryJVMTierProcessCPUUsagePerc
     * <br>Index 24 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
     * <br>Index 25 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
     * <br>Index 26 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
     * <br>Index 27 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
     * <br>Index 28 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
     * <br>Index 29 : queryJVMTierMemoryHeapCommittedMB
     * <br>Index 30 : queryJVMTierMemoryHeapCurrentUsageMB
     * <br>Index 31 : queryJVMTierMemoryHeapMaxAvailableMB
     * <br>Index 32 : queryJVMTierMemoryHeapUsedPerc
     * <br>Index 33 : queryJVMTierMemoryNonHeapCommittedMB
     * <br>Index 34 : queryJVMTierMemoryNonHeapCurrentUsageMB
     * <br>Index 35 : queryJVMTierMemoryNonHeapMaxAvailableMB
     * <br>Index 36 : queryJVMTierMemoryNonHeapUsedPerc
     * <br>Index 37 : queryJVMTierThreadsCurrentNoOfThreads
     * <br>Index 38 : queryOAPTierStallCount
     * <br>Index 39 : queryOAPTierNumberOfVerySlowCalls
     * <br>Index 40 : queryOAPTierNumberOfSlowCalls
     * <br>Index 41 : queryOAPTierInfrastructureErrorsPerMinute
     * <br>Index 42 : queryOAPTierHttpErrorCodesPerMinute
     * <br>Index 43 : queryOAPTierExceptionsPerMinute
     * <br>Index 44 : queryOAPTierErrorsPerMinute
     * <br>Index 45 : queryOAPTierErrorPageRedirectsPerMinute
     * <br>Index 46 : queryOAPTierCallsPerMinute
     * <br>Index 47 : queryOAPTierAvgResponseTimeMS
     * <br>Index 48 : queryHDNodeSystemRQ
     * <br>Index 49 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
        <br>Index 50 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
        <br>Index 51 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
        <br>Index 52 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
        <br>Index 53 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
        <br>Index 54 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
        <br>Index 55 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
        <br>Index 56 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
        <br>Index 57 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
        <br>Index 58 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
        <br>Index 59 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
        <br>Index 60 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
        <br>Index 61 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
        <br>Index 62 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
        <br>Index 63 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
        </p>
        <p>
        * In order to make queries more efficient the following options were added to collect multiple 
        * metrics from a a single tier or node.
        <br>Index 100 : queryHDNodeCPUAll
        <br>Index 101 : queryHDNodeDisksAll
        <br>Index 102 : queryHDNodeMemoryAll
        <br>Index 103 : queryHDNodeNetworkAll
        <br>Index 104 : queryHDNodeSystemAll
        <br>Index 105 : queryJVMNodeProcessCPUAll
        <br>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
        <br>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
        <br>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
        <br>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
        <br>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
        <br>Index 111 : queryJVMNodeGarbageCollectionAll
        <br>Index 112 : queryJVMNodeMemoryHeapAll
        <br>Index 113 : queryJVMNodeMemoryNonHeapAll
        <br>Index 114 : queryOAPNodeAll
     * </p>
     * 
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, long start, long end){
        return getRESTMetricQuery(queryIndex, application, tier, start, end, false);
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for general tier level metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br>Index 0  : queyrAgentTierAppAgentAvailability
     * <br>Index 1  : queryAgentTierMachineAgentAvailability
     * <br>Index 2  : queryHDTierCPUBusy
     * <br>Index 3  : queryHDTierCPUIdle
     * <br>Index 4  : queryHDTierCPUStolen
     * <br>Index 5  : queryHDTierDisksKBReadPerSec
     * <br>Index 6  : queryHDTierDisksKBWrittenPerSec
     * <br>Index 7  : queryHDTierDisksReadPerSec
     * <br>Index 8  : queryHDTierDisksWritesPerSec
     * <br>Index 9  : queryHDTierMemoryFreePerc
     * <br>Index 10 : queryHDTierMemoryFreeMB
     * <br>Index 11 : queryHDTierMemoryTotalMB
     * <br>Index 12 : queryHDTierMemoryUsedPerc
     * <br>Index 13 : queryHDTierMemoryUsedMB
     * <br>Index 14 : queryHDTierNetworkIncomingKB
     * <br>Index 15 : queryHDTierNetworkIncomingKBPerSec
     * <br>Index 16 : queryHDTierNetworkIncomingPackets
     * <br>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
     * <br>Index 18 : queryHDTierNetworkOutgoingKB
     * <br>Index 19 : queryHDTierNetworkOutgoingKBPerSec
     * <br>Index 20 : queryHDTierNetworkOutgoingPackets
     * <br>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
     * <br>Index 22 : queryJVMTierProcessCPUBurntMSPerMin
     * <br>Index 23 : queryJVMTierProcessCPUUsagePerc
     * <br>Index 24 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
     * <br>Index 25 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
     * <br>Index 26 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
     * <br>Index 27 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
     * <br>Index 28 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
     * <br>Index 29 : queryJVMTierMemoryHeapCommittedMB
     * <br>Index 30 : queryJVMTierMemoryHeapCurrentUsageMB
     * <br>Index 31 : queryJVMTierMemoryHeapMaxAvailableMB
     * <br>Index 32 : queryJVMTierMemoryHeapUsedPerc
     * <br>Index 33 : queryJVMTierMemoryNonHeapCommittedMB
     * <br>Index 34 : queryJVMTierMemoryNonHeapCurrentUsageMB
     * <br>Index 35 : queryJVMTierMemoryNonHeapMaxAvailableMB
     * <br>Index 36 : queryJVMTierMemoryNonHeapUsedPerc
     * <br>Index 37 : queryJVMTierThreadsCurrentNoOfThreads
     * <br>Index 38 : queryOAPTierStallCount
     * <br>Index 39 : queryOAPTierNumberOfVerySlowCalls
     * <br>Index 40 : queryOAPTierNumberOfSlowCalls
     * <br>Index 41 : queryOAPTierInfrastructureErrorsPerMinute
     * <br>Index 42 : queryOAPTierHttpErrorCodesPerMinute
     * <br>Index 43 : queryOAPTierExceptionsPerMinute
     * <br>Index 44 : queryOAPTierErrorsPerMinute
     * <br>Index 45 : queryOAPTierErrorPageRedirectsPerMinute
     * <br>Index 46 : queryOAPTierCallsPerMinute
     * <br>Index 47 : queryOAPTierAvgResponseTimeMS
     * <br>Index 48 : queryHDNodeSystemRQ
     * <br>Index 49 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
        <br>Index 50 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
        <br>Index 51 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
        <br>Index 52 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
        <br>Index 53 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
        <br>Index 54 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
        <br>Index 55 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
        <br>Index 56 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
        <br>Index 57 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
        <br>Index 58 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
        <br>Index 59 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
        <br>Index 60 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
        <br>Index 61 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
        <br>Index 62 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
        <br>Index 63 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
        </p>
        <p>
        * In order to make queries more efficient the following options were added to collect multiple 
        * metrics from a a single tier or node.
        <br>Index 100 : queryHDNodeCPUAll
        <br>Index 101 : queryHDNodeDisksAll
        <br>Index 102 : queryHDNodeMemoryAll
        <br>Index 103 : queryHDNodeNetworkAll
        <br>Index 104 : queryHDNodeSystemAll
        <br>Index 105 : queryJVMNodeProcessCPUAll
        <br>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
        <br>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
        <br>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
        <br>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
        <br>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
        <br>Index 111 : queryJVMNodeGarbageCollectionAll
        <br>Index 112 : queryJVMNodeMemoryHeapAll
        <br>Index 113 : queryJVMNodeMemoryNonHeapAll
        <br>Index 114 : queryOAPNodeAll
     * </p>
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryAgentTierAppAgentAvailability(tier, start, end, rollup);
                break;
            case 1:
                query=mq.queryAgentTierMachineAgentAvailability(tier, start, end, rollup);
                break;
            case 2:
                query=mq.queryHDTierCPUBusy(tier, start, end, rollup);
                break;
            case 3:
                query=mq.queryHDTierCPUIdle(tier, start, end, rollup);
                break;
            case 4:
                query=mq.queryHDTierCPUStolen(tier, start, end, rollup);
                break;
            case 5:
                query=mq.queryHDTierDisksKBReadPerSec(tier, start, end, rollup);
                break;
            case 6:
                query=mq.queryHDTierDisksKBWrittenPerSec(tier, start, end, rollup);
                break;
            case 7:
                query=mq.queryHDTierDisksReadPerSec(tier, start, end, rollup);
                break;
            case 8:
                query=mq.queryHDTierDisksWritesPerSec(tier, start, end, rollup);
                break;
            case 9:
                query=mq.queryHDTierMemoryFreePerc(tier, start, end, rollup);
                break;
            case 10:
                query=mq.queryHDTierMemoryFreeMB(tier, start, end, rollup);
                break;
            case 11:
                query=mq.queryHDTierMemoryTotalMB(tier, start, end, rollup);
                break;
            case 12:
                query=mq.queryHDTierMemoryUsedPerc(tier, start, end, rollup);
                break;
            case 13:
                query=mq.queryHDTierMemoryUsedMB(tier, start, end, rollup);
                break;
            case 14:
                query=mq.queryHDTierNetworkIncomingKB(tier, start, end, rollup);
                break;
            case 15:
                query=mq.queryHDTierNetworkIncomingKBPerSec(tier, start, end, rollup);
                break;
            case 16:
                query=mq.queryHDTierNetworkIncomingPackets(tier, start, end, rollup);
                break;
            case 17:
                query=mq.queryHDTierNetworkIncomingPacketsPerSec(tier, start, end, rollup);
                break;
            case 18:
                query=mq.queryHDTierNetworkOutgoingKB(tier, start, end, rollup);
                break;
            case 19:
                query=mq.queryHDTierNetworkOutgoingKBPerSec(tier, start, end, rollup);
                break;
            case 20:
                query=mq.queryHDTierNetworkOutgoingPackets(tier, start, end, rollup);
                break;
            case 21:
                query=mq.queryHDTierNetworkOutgoingPacketsPerSec(tier, start, end, rollup);
                break;
            case 22:
                query=mq.queryJVMTierProcessCPUBurntMSPerMin(tier, start, end, rollup);
                break;
            case 23:
                query=mq.queryJVMTierProcessCPUUsagePerc(tier, start, end, rollup);
                break;
            case 24:
                query=mq.queryJVMTierGarbageCollectionGCTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 25:
                query=mq.queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 26:
                query=mq.queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 27:
                query=mq.queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 28:
                query=mq.queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, start, end, rollup);
                break;
            case 29:
                query=mq.queryJVMTierMemoryHeapCommittedMB(tier, start, end, rollup);
                break;
            case 30:
                query=mq.queryJVMTierMemoryHeapCurrentUsageMB(tier, start, end, rollup);
                break;
            case 31:
                query=mq.queryJVMTierMemoryHeapMaxAvailableMB(tier, start, end, rollup);
                break;
            case 32:
                query=mq.queryJVMTierMemoryHeapUsedPerc(tier, start, end, rollup);
                break;
            case 33:
                query=mq.queryJVMTierMemoryNonHeapCommittedMB(tier, start, end, rollup);
                break;
            case 34:
                query=mq.queryJVMTierMemoryNonHeapCurrentUsageMB(tier, start, end, rollup);
                break;
            case 35:
                query=mq.queryJVMTierMemoryNonHeapMaxAvailableMB(tier, start, end, rollup);
                break;
            case 36:
                query=mq.queryJVMTierMemoryNonHeapUsedPerc(tier, start, end, rollup);
                break;
            case 37:
                query=mq.queryJVMTierThreadsCurrentNoOfThreads(tier, start, end, rollup);
                break;
            case 38 :
                query=mq.queryOAPTierStallCount(tier, start, end, rollup);
                break;
            case 39 :
                query=mq.queryOAPTierNumberOfVerySlowCalls(tier, start, end, rollup);
                break;
            case 40 :
                query=mq.queryOAPTierNumberOfSlowCalls(tier, start, end, rollup);
                break;
            case 41 :
                query=mq.queryOAPTierInfrastructureErrorsPerMinute(tier, start, end, rollup);
                break;
            case 42 :
                query=mq.queryOAPTierHttpErrorCodesPerMinute(tier, start, end, rollup);
                break;
            case 43 :
                query=mq.queryOAPTierExceptionsPerMinute(tier, start, end, rollup);
                break;
            case 44 :
                query=mq.queryOAPTierErrorsPerMinute(tier, start, end, rollup);
                break;
            case 45 :
                query=mq.queryOAPTierErrorPageRedirectsPerMinute(tier, start, end, rollup);
                break;
            case 46 :
                query=mq.queryOAPTierCallsPerMinute(tier, start, end, rollup);
                break;
            case 47 :
                query=mq.queryOAPTierAvgResponseTimeMS(tier, start, end, rollup);
                break;
            case 48:
                query=mq.queryHDTierSystemRQ(tier, start, end, rollup);
                break;
            case 49:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCommittedMB(tier, start, end, rollup);
                break;
            case 50:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(tier, start, end, rollup);
                break;
            case 51:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(tier, start, end, rollup);
                break;
            case 52:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(tier, start, end, rollup);
                break;
            case 53:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(tier, start, end, rollup);
                break;
            case 54:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(tier, start, end, rollup);
                break;
            case 55:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCommittedMB(tier, start, end, rollup);
                break;
            case 56:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(tier, start, end, rollup);
                break;
            case 57:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(tier, start, end, rollup);
                break;
            case 58:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCommittedMB(tier, start, end, rollup);
                break;
            case 59:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(tier, start, end, rollup);
                break;
            case 60:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(tier, start, end, rollup);
                break;
            case 61:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(tier, start, end, rollup);
                break;
            case 62:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(tier, start, end, rollup);
                break;
            case 63:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(tier, start, end, rollup);
                break;

            case 100: // All
                query=mq.queryHDTierCPUAll(tier, start, end, rollup);
                break;
            case 101:
                query=mq.queryHDTierDisksAll(tier, start, end, rollup);
                break;
            case 102:
                query=mq.queryHDTierMemoryAll(tier, start, end, rollup);
                break;
            case 103:
                query=mq.queryHDTierNetworkAll(tier, start, end, rollup);
                break;
            case 104:
                query=mq.queryHDTierSystemAll(tier, start, end, rollup);
                break;
            case 105:
                query=mq.queryJVMTierProcessCPUAll(tier, start, end, rollup);
                break;
            case 106:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsCodeCacheAll(tier, start, end, rollup);
                break;
            case 107:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceAll(tier, start, end, rollup);
                break;
            case 108:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsOldGenAll(tier, start, end, rollup);
                break;
            case 109:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsPermGenAll(tier, start, end, rollup);
                break;
            case 110:
                query=mq.queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceAll(tier, start, end, rollup);
                break;
            case 111:
                query=mq.queryJVMTierGarbageCollectionAll(tier, start, end, rollup);
                break;
            case 112:
                query=mq.queryJVMTierMemoryHeapAll(tier, start, end, rollup);
                break;
            case 113:
                query=mq.queryJVMTierMemoryNonHeapAll(tier, start, end, rollup);
                break;
            case 114:
                query=mq.queryOAPTierAll(tier, start, end, rollup);
                break;

                
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
    
    /**
     * 
     * <p>
     * Returns MetricData for general node level metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param node Name of the node which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * <p>
     * <br>Index 0  : queyrAgentTierAppAgentAvailability
     * <br>Index 1  : queryAgentTierMachineAgentAvailability
     * <br>Index 2  : queryHDTierCPUBusy
     * <br>Index 3  : queryHDTierCPUIdle
     * <br>Index 4  : queryHDTierCPUStolen
     * <br>Index 5  : queryHDTierDisksKBReadPerSec
     * <br>Index 6  : queryHDTierDisksKBWrittenPerSec
     * <br>Index 7  : queryHDTierDisksReadPerSec
     * <br>Index 8  : queryHDTierDisksWritesPerSec
     * <br>Index 9  : queryHDTierMemoryFreePerc
     * <br>Index 10 : queryHDTierMemoryFreeMB
     * <br>Index 11 : queryHDTierMemoryTotalMB
     * <br>Index 12 : queryHDTierMemoryUsedPerc
     * <br>Index 13 : queryHDTierMemoryUsedMB
     * <br>Index 14 : queryHDTierNetworkIncomingKB
     * <br>Index 15 : queryHDTierNetworkIncomingKBPerSec
     * <br>Index 16 : queryHDTierNetworkIncomingPackets
     * <br>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
     * <br>Index 18 : queryHDTierNetworkOutgoingKB
     * <br>Index 19 : queryHDTierNetworkOutgoingKBPerSec
     * <br>Index 20 : queryHDTierNetworkOutgoingPackets
     * <br>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
     * <br>Index 22 : queryJVMTierProcessCPUBurntMSPerMin
     * <br>Index 23 : queryJVMTierProcessCPUUsagePerc
     * <br>Index 24 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
     * <br>Index 25 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
     * <br>Index 26 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
     * <br>Index 27 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
     * <br>Index 28 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
     * <br>Index 29 : queryJVMTierMemoryHeapCommittedMB
     * <br>Index 30 : queryJVMTierMemoryHeapCurrentUsageMB
     * <br>Index 31 : queryJVMTierMemoryHeapMaxAvailableMB
     * <br>Index 32 : queryJVMTierMemoryHeapUsedPerc
     * <br>Index 33 : queryJVMTierMemoryNonHeapCommittedMB
     * <br>Index 34 : queryJVMTierMemoryNonHeapCurrentUsageMB
     * <br>Index 35 : queryJVMTierMemoryNonHeapMaxAvailableMB
     * <br>Index 36 : queryJVMTierMemoryNonHeapUsedPerc
     * <br>Index 37 : queryJVMTierThreadsCurrentNoOfThreads
     * <br>Index 38 : queryOAPTierStallCount
     * <br>Index 39 : queryOAPTierNumberOfVerySlowCalls
     * <br>Index 40 : queryOAPTierNumberOfSlowCalls
     * <br>Index 41 : queryOAPTierInfrastructureErrorsPerMinute
     * <br>Index 42 : queryOAPTierHttpErrorCodesPerMinute
     * <br>Index 43 : queryOAPTierExceptionsPerMinute
     * <br>Index 44 : queryOAPTierErrorsPerMinute
     * <br>Index 45 : queryOAPTierErrorPageRedirectsPerMinute
     * <br>Index 46 : queryOAPTierCallsPerMinute
     * <br>Index 47 : queryOAPTierAvgResponseTimeMS
     * <br>Index 48 : queryHDNodeSystemRQ
     * <br>Index 49 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
        <br>Index 50 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
        <br>Index 51 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
        <br>Index 52 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
        <br>Index 53 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
        <br>Index 54 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
        <br>Index 55 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
        <br>Index 56 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
        <br>Index 57 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
        <br>Index 58 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
        <br>Index 59 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
        <br>Index 60 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
        <br>Index 61 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
        <br>Index 62 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
        <br>Index 63 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
        </p>
        <p>
        * In order to make queries more efficient the following options were added to collect multiple 
        * metrics from a a single tier or node.
        <br>Index 100 : queryHDNodeCPUAll
        <br>Index 101 : queryHDNodeDisksAll
        <br>Index 102 : queryHDNodeMemoryAll
        <br>Index 103 : queryHDNodeNetworkAll
        <br>Index 104 : queryHDNodeSystemAll
        <br>Index 105 : queryJVMNodeProcessCPUAll
        <br>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
        <br>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
        <br>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
        <br>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
        <br>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
        <br>Index 111 : queryJVMNodeGarbageCollectionAll
        <br>Index 112 : queryJVMNodeMemoryHeapAll
        <br>Index 113 : queryJVMNodeMemoryNonHeapAll
        <br>Index 114 : queryOAPNodeAll
     * </p>
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, String node, long start, long end){
        return getRESTMetricQuery(queryIndex, application, tier, node, start, end, false);
    }
    
    /**
     * <p>
     * Returns MetricData for general node metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param node Name of the node which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br>Index 0  : queyrAgentTierAppAgentAvailability
     * <br>Index 1  : queryAgentTierMachineAgentAvailability
     * <br>Index 2  : queryHDTierCPUBusy
     * <br>Index 3  : queryHDTierCPUIdle
     * <br>Index 4  : queryHDTierCPUStolen
     * <br>Index 5  : queryHDTierDisksKBReadPerSec
     * <br>Index 6  : queryHDTierDisksKBWrittenPerSec
     * <br>Index 7  : queryHDTierDisksReadPerSec
     * <br>Index 8  : queryHDTierDisksWritesPerSec
     * <br>Index 9  : queryHDTierMemoryFreePerc
     * <br>Index 10 : queryHDTierMemoryFreeMB
     * <br>Index 11 : queryHDTierMemoryTotalMB
     * <br>Index 12 : queryHDTierMemoryUsedPerc
     * <br>Index 13 : queryHDTierMemoryUsedMB
     * <br>Index 14 : queryHDTierNetworkIncomingKB
     * <br>Index 15 : queryHDTierNetworkIncomingKBPerSec
     * <br>Index 16 : queryHDTierNetworkIncomingPackets
     * <br>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
     * <br>Index 18 : queryHDTierNetworkOutgoingKB
     * <br>Index 19 : queryHDTierNetworkOutgoingKBPerSec
     * <br>Index 20 : queryHDTierNetworkOutgoingPackets
     * <br>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
     * <br>Index 22 : queryJVMTierProcessCPUBurntMSPerMin
     * <br>Index 23 : queryJVMTierProcessCPUUsagePerc
     * <br>Index 24 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
     * <br>Index 25 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
     * <br>Index 26 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
     * <br>Index 27 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
     * <br>Index 28 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
     * <br>Index 29 : queryJVMTierMemoryHeapCommittedMB
     * <br>Index 30 : queryJVMTierMemoryHeapCurrentUsageMB
     * <br>Index 31 : queryJVMTierMemoryHeapMaxAvailableMB
     * <br>Index 32 : queryJVMTierMemoryHeapUsedPerc
     * <br>Index 33 : queryJVMTierMemoryNonHeapCommittedMB
     * <br>Index 34 : queryJVMTierMemoryNonHeapCurrentUsageMB
     * <br>Index 35 : queryJVMTierMemoryNonHeapMaxAvailableMB
     * <br>Index 36 : queryJVMTierMemoryNonHeapUsedPerc
     * <br>Index 37 : queryJVMTierThreadsCurrentNoOfThreads
     * <br>Index 38 : queryOAPTierStallCount
     * <br>Index 39 : queryOAPTierNumberOfVerySlowCalls
     * <br>Index 40 : queryOAPTierNumberOfSlowCalls
     * <br>Index 41 : queryOAPTierInfrastructureErrorsPerMinute
     * <br>Index 42 : queryOAPTierHttpErrorCodesPerMinute
     * <br>Index 43 : queryOAPTierExceptionsPerMinute
     * <br>Index 44 : queryOAPTierErrorsPerMinute
     * <br>Index 45 : queryOAPTierErrorPageRedirectsPerMinute
     * <br>Index 46 : queryOAPTierCallsPerMinute
     * <br>Index 47 : queryOAPTierAvgResponseTimeMS
     * <br>Index 48 : queryHDNodeSystemRQ
     * <br>Index 49 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB
        <br>Index 50 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage
        <br>Index 51 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB
        <br>Index 52 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB
        <br>Index 53 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage
        <br>Index 54 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB
        <br>Index 55 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB
        <br>Index 56 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage
        <br>Index 57 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB
        <br>Index 58 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB
        <br>Index 59 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage
        <br>Index 60 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB
        <br>Index 61 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB
        <br>Index 62 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage
        <br>Index 63 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB
        </p>
        <p>
        * In order to make queries more efficient the following options were added to collect multiple 
        * metrics from a a single tier or node.
        <br>Index 100 : queryHDNodeCPUAll
        <br>Index 101 : queryHDNodeDisksAll
        <br>Index 102 : queryHDNodeMemoryAll
        <br>Index 103 : queryHDNodeNetworkAll
        <br>Index 104 : queryHDNodeSystemAll
        <br>Index 105 : queryJVMNodeProcessCPUAll
        <br>Index 106 : queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll
        <br>Index 107 : queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll
        <br>Index 108 : queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll
        <br>Index 109 : queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll
        <br>Index 110 : queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll
        <br>Index 111 : queryJVMNodeGarbageCollectionAll
        <br>Index 112 : queryJVMNodeMemoryHeapAll
        <br>Index 113 : queryJVMNodeMemoryNonHeapAll
        <br>Index 114 : queryOAPNodeAll
     * </p>
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, String node, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" node ").append(node).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                // Agent query
                query=mq.queryAgentNodeAppAgentAvailability(tier, node, start, end, rollup);
                break;
            case 1:
                query=mq.queryAgentNodeMachineAgentAvailability(tier, node, start, end, rollup);
                break;
            case 2:
                query=mq.queryHDNodeCPUBusy(tier, node, start, end, rollup);
                break;
            case 3:
                query=mq.queryHDNodeCPUIdle(tier, node, start, end, rollup);
                break;
            case 4:
                query=mq.queryHDNodeCPUStolen(tier, node, start, end, rollup);
                break;
            case 5:    
                query=mq.queryHDNodeDisksKBReadPerSec(tier, node, start, end, rollup);
                break;
            case 6:
                query=mq.queryHDNodeDisksKBWrittenPerSec(tier, node, start, end, rollup);
                break;
            case 7:
                query=mq.queryHDNodeDisksReadPerSec(tier, node, start, end, rollup);
                break;
            case 8:
                query=mq.queryHDNodeDisksWritesPerSec(tier, node, start, end, rollup);
                break;
            case 9:
                query=mq.queryHDNodeMemoryFreePerc(tier, node, start, end, rollup);
                break;
            case 10:
                query=mq.queryHDNodeMemoryFreeMB(tier, node, start, end, rollup);
                break;
            case 11:
                query=mq.queryHDNodeMemoryTotalMB(tier, node, start, end, rollup);
                break;
            case 12:
                query=mq.queryHDNodeMemoryUsedPerc(tier, node, start, end, rollup);
                break;
            case 13:
                query=mq.queryHDNodeMemoryUsedMB(tier, node, start, end, rollup);
                break;
            case 14:
                query=mq.queryHDNodeNetworkIncomingKB(tier, node, start, end, rollup);
                break;
            case 15:
                query=mq.queryHDNodeNetworkIncomingKBPerSec(tier, node, start, end, rollup);
                break;
            case 16:
                query=mq.queryHDNodeNetworkIncomingPackets(tier, node, start, end, rollup);
                break;
            case 17:
                query=mq.queryHDNodeNetworkIncomingPacketsPerSec(tier, node, start, end, rollup);
                break;
            case 18:
                query=mq.queryHDNodeNetworkOutgoingKB(tier, node, start, end, rollup);
                break;
            case 19:
                query=mq.queryHDNodeNetworkOutgoingKBPerSec(tier, node, start, end, rollup);
                break;
            case 20:
                query=mq.queryHDNodeNetworkOutgoingPackets(tier, node, start, end, rollup);
                break;
            case 21:
                query=mq.queryHDNodeNetworkOutgoingPacketsPerSec(tier, node, start, end, rollup);
                break;
            case 22:
                query=mq.queryJVMNodeProcessCPUBurntMSPerMin(tier, node, start, end, rollup);
                break;
            case 23:
                query=mq.queryJVMNodeProcessCPUUsagePerc(tier, node, start, end, rollup);
                break;
            case 24:
                query=mq.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 25:
                query=mq.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 26:
                query=mq.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 27:
                query=mq.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 28:
                query=mq.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, node, start, end, rollup);
                break;
            case 29:
                query=mq.queryJVMNodeMemoryHeapCommittedMB(tier, node, start, end, rollup);
                break;
            case 30:
                query=mq.queryJVMNodeMemoryHeapCurrentUsageMB(tier, node, start, end, rollup);
                break;
            case 31:
                query=mq.queryJVMNodeMemoryHeapMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 32:
                query=mq.queryJVMNodeMemoryHeapUsedPerc(tier, node, start, end, rollup);
                break;
            case 33:
                query=mq.queryJVMNodeMemoryNonHeapCommittedMB(tier, node, start, end, rollup);
                break;
            case 34:
                query=mq.queryJVMNodeMemoryNonHeapCurrentUsageMB(tier, node, start, end, rollup);
                break;
            case 35:
                query=mq.queryJVMNodeMemoryNonHeapMaxAvailableMB(tier, node, start, end, rollup);
                break;
            case 36:
                query=mq.queryJVMNodeMemoryNonHeapUsedPerc(tier, node, start, end, rollup);
                break;
            case 37:
                query=mq.queryJVMNodeThreadsCurrentNoOfThreads(tier, node, start, end, rollup);
                break;
            case 38 :
                query=mq.queryOAPNodeStallCount(tier,node, start, end, rollup);
                break;
            case 39 :
                query=mq.queryOAPNodeNumberOfVerySlowCalls(tier,node, start, end, rollup);
                break;
            case 40 :
                query=mq.queryOAPNodeNumberOfSlowCalls(tier,node, start, end, rollup);
                break;
            case 41 :
                query=mq.queryOAPNodeInfrastructureErrorsPerMinute(tier,node, start, end, rollup);
                break;
            case 42 :
                query=mq.queryOAPNodeHttpErrorCodesPerMinute(tier,node, start, end, rollup);
                break;
            case 43 :
                query=mq.queryOAPNodeExceptionsPerMinute(tier,node, start, end, rollup);
                break;
            case 44 :
                query=mq.queryOAPNodeErrorsPerMinute(tier,node, start, end, rollup);
                break;
            case 45 :
                query=mq.queryOAPNodeErrorPageRedirectsPerMinute(tier,node, start, end, rollup);
                break;
            case 46 :
                query=mq.queryOAPNodeCallsPerMinute(tier,node, start, end, rollup);
                break;
            case 47 :
                query=mq.queryOAPNodeAvgResponseTimeMS(tier,node, start, end, rollup);
                break;
            case 48:
                query=mq.queryHDNodeSystemRQ(tier,node, start, end, rollup);
                break;
            case 49:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(tier,node, start, end, rollup);
                break;
            case 50:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(tier,node, start, end, rollup);
                break;
            case 51:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(tier,node, start, end, rollup);
                break;
            case 52:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(tier,node, start, end, rollup);
                break;
            case 53:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(tier,node, start, end, rollup);
                break;
            case 54:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(tier,node, start, end, rollup);
                break;
            case 55:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(tier,node, start, end, rollup);
                break;
            case 56:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(tier,node, start, end, rollup);
                break;
            case 57:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(tier,node, start, end, rollup);
                break;
            case 58:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(tier,node, start, end, rollup);
                break;
            case 59:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(tier,node, start, end, rollup);
                break;
            case 60:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(tier,node, start, end, rollup);
                break;
            case 61:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(tier,node, start, end, rollup);
                break;
            case 62:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(tier,node, start, end, rollup);
                break;
            case 63:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(tier,node, start, end, rollup);
                break;

            case 100: // All
                query=mq.queryHDNodeCPUAll(tier,node, start, end, rollup);
                break;
            case 101:
                query=mq.queryHDNodeDisksAll(tier,node, start, end, rollup);
                break;
            case 102:
                query=mq.queryHDNodeMemoryAll(tier,node, start, end, rollup);
                break;
            case 103:
                query=mq.queryHDNodeNetworkAll(tier,node, start, end, rollup);
                break;
            case 104:
                query=mq.queryHDNodeSystemAll(tier,node, start, end, rollup);
                break;
            case 105:
                query=mq.queryJVMNodeProcessCPUAll(tier,node, start, end, rollup);
                break;
            case 106:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheAll(tier,node, start, end, rollup);
                break;
            case 107:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceAll(tier,node, start, end, rollup);
                break;
            case 108:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenAll(tier,node, start, end, rollup);
                break;
            case 109:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenAll(tier,node, start, end, rollup);
                break;
            case 110:
                query=mq.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceAll(tier,node, start, end, rollup);
                break;
            case 111:
                query=mq.queryJVMNodeGarbageCollectionAll(tier,node, start, end, rollup);
                break;
            case 112:
                query=mq.queryJVMNodeMemoryHeapAll(tier,node, start, end, rollup);
                break;
            case 113:
                query=mq.queryJVMNodeMemoryNonHeapAll(tier,node, start, end, rollup);
                break;
            case 114:
                query=mq.queryOAPNodeAll(tier,node, start, end, rollup);
                break;

            default:
                
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ")
                    .append(queryIndex).append(" application ").append(application)
                    .append(" tier ").append(tier).append(" node ").append(node).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for EUM's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param urlPath URL path that was captured
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * <p>
        <br>Index  0 : queryEUM_AJAX_REQUESTS_PER_MIN
        <br>Index  1 : queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN
        <br>Index  2 : queryEUM_AJAX_DOC_DOWNLOAD_TIME
        <br>Index  3 : queryEUM_AJAX_DOC_PROCESSING_TIME
        <br>Index  4 : queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE
        <br>Index  5 : queryEUM_AJAX_APPLICATION_SERVER_TIME_MS
        <br>Index  6 : queryEUM_AJAX_END_USER_RESPONSE_TIME
        <br>Index  7 : queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
        <br>Index  8 : queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
        <br>Index  9 : queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
        <br>Index  10 : queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
        <br>Index  11 : queryEUM_AJAX_FIRST_BYTE_TIME_MS
        <br>Index  12 : queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
        <br>Index  13 : queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
        <br>Index  14 : queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
        <br>Index  15 : queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        <br>Index  16 : queryEUM_BASE_PAGES_FRONT_END_TIME_MS
        <br>Index  17 : queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS
        <br>Index  18 : queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
        <br>Index  19 : queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS
        <br>Index  20 : queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS
        <br>Index  21 : queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE
        <br>Index  22 : queryEUM_BASE_PAGES_REQUESTS_PER_MIN
        <br>Index  23 : queryEUM_BASE_PAGES_DOC_READY_TIME_MS
        <br>Index  24 : queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME
        <br>Index  25 : queryEUM_BASE_PAGES_DOC_PROCESSING_TIME
        <br>Index  26 : queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS
        <br>Index  27 : queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE
        <br>Index  28 : queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS
        <br>Index  29 : queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS
        <br>Index  30 : queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS
        <br>Index  31 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME
        <br>Index  32 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
        <br>Index  33 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
        <br>Index  34 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
        <br>Index  35 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
        <br>Index  36 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS
        <br>Index  37 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
        <br>Index  38 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
        <br>Index  39 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
        <br>Index  40 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        <br>Index  41 : queryEUM_BASE_PAGES_DOM_READY_TIME_MS
        <br>Index  42 : queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS
        <br>Index  43 : queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS
        <br>Index  44 : queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS
        <br>Index  45 : queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS
        <br>Index  46 : queryEUM_IFRAME_FRONT_END_TIME_MS
        <br>Index  47 : queryEUM_IFRAME_DOCUMENT_READY_TIME_MS
        <br>Index  48 : queryEUM_IFRAME_TCP_CONNECT_TIME_MS
        <br>Index  49 : queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS
        <br>Index  50 : queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS
        <br>Index  51 : queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS
        <br>Index  52 : queryEUM_IFRAME_PAGE_RENDER_TIME_MS
        <br>Index  53 : queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
        <br>Index  54 : queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS
        <br>Index  55 : queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS
        <br>Index  56 : queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS
        <br>Index  57 : queryEUM_IFRAME_REQUESTS_PER_MINUTE
        <br>Index  58 : queryEUM_IFRAME_FIRST_BYTE_TIME_MS
        <br>Index  59 : queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
        <br>Index  60 : queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
        <br>Index  61 : queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
        <br>Index  62 : queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        <br>Index  63 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS
        <br>Index  64 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
        <br>Index  65 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
        <br>Index  66 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
        <br>Index  67 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
        <br>Index  68 : queryEUM_IFRAME_DOM_READY_TIME_MS
        <br>Index  69 : queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS
        <br>Index  70 : queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS
        <br>Index  71 : queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS
        <br>Index  72 : queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS
     * </p>
     */
    public MetricDatas getRESTEUMMetricQuery(int queryIndex, String application, String urlPath, long start, long end){
        return getRESTEUMMetricQuery(queryIndex, application, urlPath, start, end, false);
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for EUM's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param urlPath URL path that was captured
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics 
     * @return {@link MetricDatas}
     * 
     * <p>
        <br>Index  0 : queryEUM_AJAX_REQUESTS_PER_MIN
        <br>Index  1 : queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN
        <br>Index  2 : queryEUM_AJAX_DOC_DOWNLOAD_TIME
        <br>Index  3 : queryEUM_AJAX_DOC_PROCESSING_TIME
        <br>Index  4 : queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE
        <br>Index  5 : queryEUM_AJAX_APPLICATION_SERVER_TIME_MS
        <br>Index  6 : queryEUM_AJAX_END_USER_RESPONSE_TIME
        <br>Index  7 : queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
        <br>Index  8 : queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
        <br>Index  9 : queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
        <br>Index  10 : queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
        <br>Index  11 : queryEUM_AJAX_FIRST_BYTE_TIME_MS
        <br>Index  12 : queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
        <br>Index  13 : queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
        <br>Index  14 : queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
        <br>Index  15 : queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        <br>Index  16 : queryEUM_BASE_PAGES_FRONT_END_TIME_MS
        <br>Index  17 : queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS
        <br>Index  18 : queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
        <br>Index  19 : queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS
        <br>Index  20 : queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS
        <br>Index  21 : queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE
        <br>Index  22 : queryEUM_BASE_PAGES_REQUESTS_PER_MIN
        <br>Index  23 : queryEUM_BASE_PAGES_DOC_READY_TIME_MS
        <br>Index  24 : queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME
        <br>Index  25 : queryEUM_BASE_PAGES_DOC_PROCESSING_TIME
        <br>Index  26 : queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS
        <br>Index  27 : queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE
        <br>Index  28 : queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS
        <br>Index  29 : queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS
        <br>Index  30 : queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS
        <br>Index  31 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME
        <br>Index  32 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
        <br>Index  33 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
        <br>Index  34 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
        <br>Index  35 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
        <br>Index  36 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS
        <br>Index  37 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
        <br>Index  38 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
        <br>Index  39 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
        <br>Index  40 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        <br>Index  41 : queryEUM_BASE_PAGES_DOM_READY_TIME_MS
        <br>Index  42 : queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS
        <br>Index  43 : queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS
        <br>Index  44 : queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS
        <br>Index  45 : queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS
        <br>Index  46 : queryEUM_IFRAME_FRONT_END_TIME_MS
        <br>Index  47 : queryEUM_IFRAME_DOCUMENT_READY_TIME_MS
        <br>Index  48 : queryEUM_IFRAME_TCP_CONNECT_TIME_MS
        <br>Index  49 : queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS
        <br>Index  50 : queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS
        <br>Index  51 : queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS
        <br>Index  52 : queryEUM_IFRAME_PAGE_RENDER_TIME_MS
        <br>Index  53 : queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
        <br>Index  54 : queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS
        <br>Index  55 : queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS
        <br>Index  56 : queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS
        <br>Index  57 : queryEUM_IFRAME_REQUESTS_PER_MINUTE
        <br>Index  58 : queryEUM_IFRAME_FIRST_BYTE_TIME_MS
        <br>Index  59 : queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS
        <br>Index  60 : queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS
        <br>Index  61 : queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS
        <br>Index  62 : queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS
        <br>Index  63 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS
        <br>Index  64 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS
        <br>Index  65 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS
        <br>Index  66 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS
        <br>Index  67 : queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS
        <br>Index  68 : queryEUM_IFRAME_DOM_READY_TIME_MS
        <br>Index  69 : queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS
        <br>Index  70 : queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS
        <br>Index  71 : queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS
        <br>Index  72 : queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS
        <br>Index 100: queryEUM_AJAX_All
        <br>Index 101: queryEUM_BASE_PAGES_All
        <br>Index 102 : queryEUM_IFRAME_All
     * </p>
     */
    public MetricDatas getRESTEUMMetricQuery(int queryIndex, String application, String urlPath, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" url ").append(urlPath).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                // Agent query
                query=mq.queryEUM_AJAX_REQUESTS_PER_MIN(urlPath, start, end, rollup);
                break;
            case 1: 
                // Agent query
                query=mq.queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(urlPath, start, end, rollup);
                break;
            case 2: 
                // Agent query
                query=mq.queryEUM_AJAX_DOC_DOWNLOAD_TIME(urlPath, start, end, rollup);
                break;
            case 3: 
                // Agent query
                query=mq.queryEUM_AJAX_DOC_PROCESSING_TIME(urlPath, start, end, rollup);
                break;
            case 4: 
                // Agent query
                query=mq.queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 5: 
                // Agent query
                query=mq.queryEUM_AJAX_APPLICATION_SERVER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 6: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME(urlPath, start, end, rollup);
                break;
            case 7: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 8: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;    
            case 9: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 10: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 11: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 12: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 13: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 14: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 15: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 16: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FRONT_END_TIME_MS(urlPath, start, end, rollup);
                break;
            case 17: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 18: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 19: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 20: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(urlPath, start, end, rollup);
                break;
            case 21: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 22: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_REQUESTS_PER_MIN(urlPath, start, end, rollup);
                break;
            case 23: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 24: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(urlPath, start, end, rollup);
                break;
            case 25: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(urlPath, start, end, rollup);
                break;
            case 26: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS(urlPath, start, end, rollup);
                break;
            case 27: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 28: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 29: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 30: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS(urlPath, start, end, rollup);
                break;
            case 31: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(urlPath, start, end, rollup);
                break;
            case 32: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 33: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 34: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 35: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 36: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 37: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 38: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 39: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 40: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 41: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 42: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 43: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 44: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 45: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 46: 
                // Agent query
                query=mq.queryEUM_IFRAME_FRONT_END_TIME_MS(urlPath, start, end, rollup);
                break;
            case 47: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOCUMENT_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 48: 
                // Agent query
                query=mq.queryEUM_IFRAME_TCP_CONNECT_TIME_MS(urlPath, start, end, rollup);
                break;
            case 49: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS(urlPath, start, end, rollup);
                break;
            case 50: 
                // Agent query
                query=mq.queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 51: 
                // Agent query
                query=mq.queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS(urlPath, start, end, rollup);
                break;
            case 52: 
                // Agent query
                query=mq.queryEUM_IFRAME_PAGE_RENDER_TIME_MS(urlPath, start, end, rollup);
                break;
            case 53: 
                // Agent query
                query=mq.queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 54: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS(urlPath, start, end, rollup);
                break;
            case 55: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS(urlPath, start, end, rollup);
                break;
            case 56: 
                // Agent query
                query=mq.queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 57: 
                // Agent query
                query=mq.queryEUM_IFRAME_REQUESTS_PER_MINUTE(urlPath, start, end, rollup);
                break;
            case 58: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 59: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 60: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 61: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 62: 
                // Agent query
                query=mq.queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 63: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS(urlPath, start, end, rollup);
                break;
            case 64: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 65: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 66: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 67: 
                // Agent query
                query=mq.queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 68: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_MS(urlPath, start, end, rollup);
                break;
            case 69: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 70: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 71: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 72: 
                // Agent query
                query=mq.queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS(urlPath, start, end, rollup);
                break;
            case 100: 
                // Agent query
                query=mq.queryEUM_AJAX_All(urlPath, start, end, rollup);
                break;
            case 101: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_All(urlPath, start, end, rollup);
                break;
            case 102: 
                // Agent query
                query=mq.queryEUM_IFRAME_All(urlPath, start, end, rollup);
                break;
                
                
            default:
                
                break;
                
        }
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nMatching query was not found for queryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" url ").append(urlPath).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * Returns MetricData for Business Transaction's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param btName Business transaction name
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br>Index  0 : queryBTAVERAGE_BLOCK_TIME_MS
     * <br>Index  1 : queryBTAVERAGE_CPU_USED_MS
     * <br>Index  2 : queryBTAVERAGE_REQUEST_SIZE
     * <br>Index  3 : queryBTAVERAGE_RESPONSE_TIME
     * <br>Index  4 : queryBTAVERAGE_WAIT_TIME_MS
     * <br>Index  5 : queryBTCALL_PER_MINUTE
     * <br>Index  6 : queryBTERRORS_PER_MINUTE
     * <br>Index  7 : queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS
     * <br>Index  8 : queryBTNUMBER_OF_SLOW_CALLS
     * <br>Index  9 : queryBTNUMBER_OF_VERY_SLOW_CALLS
     * <br>Index 10 : queryBTSTALL_COUNT
     * </p>
     */
    public MetricDatas getRESTBTMetricQuery(int queryIndex, String application, String tier, String btName, long start, long end){
        return getRESTBTMetricQuery(queryIndex, application, tier, btName, start, end,false);
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for Business Transaction's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param btName Business transaction name
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br>Index  0 : queryBTAVERAGE_BLOCK_TIME_MS
     * <br>Index  1 : queryBTAVERAGE_CPU_USED_MS
     * <br>Index  2 : queryBTAVERAGE_REQUEST_SIZE
     * <br>Index  3 : queryBTAVERAGE_RESPONSE_TIME
     * <br>Index  4 : queryBTAVERAGE_WAIT_TIME_MS
     * <br>Index  5 : queryBTCALL_PER_MINUTE
     * <br>Index  6 : queryBTERRORS_PER_MINUTE
     * <br>Index  7 : queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS
     * <br>Index  8 : queryBTNUMBER_OF_SLOW_CALLS
     * <br>Index  9 : queryBTNUMBER_OF_VERY_SLOW_CALLS
     * <br>Index 10 : queryBTSTALL_COUNT
     * <br>Index 100: queryAllMetricsForBT
     * </p>
     */
    public MetricDatas getRESTBTMetricQuery(int queryIndex, String application, String tier, String btName, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" BT ").append(btName).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryBTAVERAGE_BLOCK_TIME_MS(application, tier, btName, start, end, rollup);
                break;
            case 1:
                query=mq.queryBTAVERAGE_CPU_USED_MS(application, tier, btName, start, end, rollup);
                break;
            case 2:
                query=mq.queryBTAVERAGE_REQUEST_SIZE(application, tier, btName, start, end, rollup);
                break;
            case 3:
                query=mq.queryBTAVERAGE_RESPONSE_TIME(application, tier, btName, start, end, rollup);
                break;
            case 4:
                query=mq.queryBTAVERAGE_WAIT_TIME_MS(application, tier, btName, start, end, rollup);
                break;
            case 5:
                query=mq.queryBTCALL_PER_MINUTE(application, tier, btName, start, end, rollup);
                break;
            case 6:
                query=mq.queryBTERRORS_PER_MINUTE(application, tier, btName, start, end, rollup);
                break;
            case 7:
                query=mq.queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(application, tier, btName, start, end, rollup);
                break;
            case 8:
                query=mq.queryBTNUMBER_OF_SLOW_CALLS(application, tier, btName, start, end, rollup);
                break;
            case 9:
                query=mq.queryBTNUMBER_OF_VERY_SLOW_CALLS(application, tier, btName, start, end, rollup);
                break;
            case 10:
                query=mq.queryBTSTALL_COUNT(application, tier, btName, start, end, rollup);
                break;
            case 100:
                query=mq.queryAllMetricsForBT(application, tier, btName, start, end, rollup);
                break;
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(application).append(" tier ").append(tier).append(" BT ").append(btName).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for Backend's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param backend Name of the backend which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br>Index  0 : queryBackendAverageResponseTimeMS
     * <br>Index  1 : queryBackendCallsPerMinute
     * <br>Index  2 : queryBackendErrorsPerMinute
     * </p>
     */
    public MetricDatas getRESTBackendMetricQuery(int queryIndex, String application, String backend, long start, long end){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" tier ").append(backend).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryBackendAverageResponseTimeMS(application, backend, start, end, false);
                break;
            case 1:
                query=mq.queryBackendCallsPerMinute(application, backend, start, end, false);
                break;
            case 2:
                query=mq.queryBackendErrorsPerMinute(application, backend, start, end, false);
                break;
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(application).append(" tier ").append(backend).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
    /**
     * 
     * <p>
     * Returns MetricData for Backend's metrics that can be parsed 
     * Case statement looks at the queryIndex to determine the proper Query string.
     * </p>
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param backend Name of the backend which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @param rollup Boolean determines whether to roll up the metrics
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br>Index  0 : queryBackendAverageResponseTimeMS
     * <br>Index  1 : queryBackendCallsPerMinute
     * <br>Index  2 : queryBackendErrorsPerMinute
     * </p>
     * 
     */
    public MetricDatas getRESTBackendMetricQuery(int queryIndex, String application, String backend, long start, long end, boolean rollup){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" backend ").append(backend).toString());}
        
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryBackendAverageResponseTimeMS(application, backend, start, end, rollup);
                break;
            case 1:
                query=mq.queryBackendCallsPerMinute(application, backend, start, end, rollup);
                break;
            case 2:
                query=mq.queryBackendErrorsPerMinute(application, backend, start, end, rollup);
                break;
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(application).append(" backend ").append(backend).toString());
            return null;
        }
        
        try{
            return R.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
    /**
     * <p>
     * Returns transaction detection auto discovery rules for the application.
     * </p>
     * @param app Name of the application which holds the metric
     * @return {@link AutoDiscoveryConfig}
     * 
     * <p>
     * <br>Index  0 : queryTransactionDetectionAutoAll
     * </p>
     */
    public AutoDiscoveryConfig getRESTExportOfAutoObj( String app){
        String query=null;
        if(s.debugLevel >= 2) logger.log(Level.INFO,new StringBuilder().append("\nQuery for application ").append(app).toString());
        
        
        query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
            return null;
        }
        
        
        
        try{
            return R.executeExportAuto(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * Returns transaction detection auto discovery rules for the application.
     * </p>
     * 
     * 
     * @param app Name of the application which holds the metric
     * @return {@link String}
     * 
     * <p>
     * <br>Index  0 : queryTransactionDetectionAutoAll
     * </p>
     */
    public String getRESTExportOfAuto(String app){
        String query=null;
        if(s.debugLevel >= 2) logger.log(Level.INFO,new StringBuilder().append("\nQuery for application ").append(app).toString());
        
        query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
            return null;
        }
        
        
        try{
            return R.executeExportAuto(auth, query).toXML();
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    /**
     * <p>
     * Returns transaction detection auto discovery rules for the application.
     * </p>
     * @param queryIndex Index of the type of query to run
     * @param app Name of the application which holds the rules
     * @param objNode Depending on the query this can be the tier name for all rules or the name of the single rule to export
     * @return {@link AutoDiscoveryConfig}
     * 
     * <p>
     * <br>Index  0 : queryTransactionDetectionAutoAll
     * <br>Index  1 : queryTransactionDetectionAutoSingle 
     * </p>
     */
    public AutoDiscoveryConfig getRESTExportOfAutoObj(int queryIndex, String app, String objNode){
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" for application ").append(app).append(" automatic rule ").append(objNode).toString());}
        
        switch(queryIndex){
            
            case 0: // All auto on a tier
                query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app, objNode); //tested
                break;
            
            case 1: // Auto for single 
                query=TransactionDetectionQuery.queryTransactionDetectionAutoSingle(baseURL.getControllerURL(), app, objNode); //tested
                break;

            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(app).append(" automatic rule ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeExportAuto(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * Returns transaction detection auto discovery rules for the application.
     * </p>
     * @param queryIndex Index of the type of query to run
     * @param app Name of the application which holds the rules
     * @param objNode Depending on the query this can be the tier name for all rules or the name of the single rule to export
     * @return {@link String}
     * 
     * <p>
     * <br>Index  0 : queryTransactionDetectionAutoAll
     * <br>Index  1 : queryTransactionDetectionAutoSingle 
     * </p>
     */
    public String getRESTExportOfAuto(int queryIndex, String app, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" for application ").append(app).append(" automatic rule ").append(objNode).toString());}
        
        switch(queryIndex){
            
            case 0: // All auto on a tier
                query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app, objNode); //tested
                break;
            
            case 1: // Auto for single 
                query=TransactionDetectionQuery.queryTransactionDetectionAutoSingle(baseURL.getControllerURL(), app, objNode); //tested
                break;

            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(app).append(" automatic ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeExportAuto(auth, query).toXML();
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * Returns transaction detection auto discovery rules for the application.
     * </p>
     * 
     * 
     * @param app Name of the application which holds the rules
     * @param tier Name of the tier which holds the rules
     * @param objNode Depending on the query this can be the tier name for all rules or the name of the single rule to export
     * @return {@link AutoDiscoveryConfig}
     * 
     * <p>
     * <br>queryTransactionDetectionAutoSingle 
     * </p>
     */
    public AutoDiscoveryConfig getRESTExportOfAutoObj(String app, String tier, String objNode){
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex ")
                    .append(" for application ").append(app).append(" automatic rule ").append(objNode).toString());}
        
        if(objNode != null){
            query=TransactionDetectionQuery.queryTransactionDetectionAutoSingle(baseURL.getControllerURL(), app, tier, objNode); //tested
        }else{
            query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app, tier);
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        try{
            return R.executeExportAuto(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
     /**
     * <p>
     * Returns transaction detection auto discovery rules for the application.
     * </p>
     * 
     * @param app Name of the application which holds the rules
     * @param tier Name of the tier which holds the rules
     * @param objNode Depending on the query this can be the tier name for all rules or the name of the single rule to export
     * @return {@link AutoDiscoveryConfig}
     * 
     * <p>
     * <br>queryTransactionDetectionAutoSingle 
     * </p>
     */
    public String getRESTExportOfAuto(String app, String tier, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQuery for application ").append(app)
                .append(" automatic rule ").append(objNode).toString());}
        
        if(objNode != null){
            query=TransactionDetectionQuery.queryTransactionDetectionAutoSingle(baseURL.getControllerURL(), app, tier, objNode); //tested
        }else{
            query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app, tier);
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).append(" objNode ").append(objNode).toString());
            return null;
        }
        
        
        
        try{
            return R.executeExportAuto(auth, query).toXML();
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    /**
     * <p>
     *  This will import a single auto discovery rule into the application and tier.
     * </p>
     * 
     * @param app The name of the application
     * @param entityName Name of the auto discovery rule
     * @param xml Xml string of the auto discovery rule
     * @return {@link String}
     * 
     * <p>
     * <br>queryTransactionDetectionAutoAll
     * </p>
     */
    public String postRESTAutoSingle(String app, String entityName, String xml){
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nPOST for application ")
                .append(app).append(" automatic rule ").append(entityName).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
            return null;
        }
        
        
        
        try{
            return R.executeAutoPostQuery(auth, query,entityName,xml);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        
        return null;
    }
    
    /**
     * <p>
     *  This will import a single auto discovery rule into the application and tier.
     * </p>
     * 
     * @param app The name of the application
     * @param tier The name of the tier
     * @param entityName Name of the auto discovery rule
     * @param xml Xml string of the auto discovery rule
     * @return {@link String}
     * 
     * <p>
     * <br>queryTransactionDetectionAutoAll
     * </p>
     */
    public String postRESTAutoSingle(String app, String tier, String entityName, String xml){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nPOST for application ")
                .append(app).append(" for tier ").append(tier).append(" automatic rule ").append(entityName).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionAutoAll(baseURL.getControllerURL(), app); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
            return null;
        }

        
        
        try{
            return R.executeAutoPostQuery(auth, query,entityName,xml);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        
        return null;
    }
    

    /**
     * <p>
     *  This will export all custom pojo into the application.
     * </p>
     * 
     * @param app The name of the application
     * @return {@link String}
     * 
     * <p>
     * <br>queryTransactionDetectionExportAllPojo
     * </p>
     */
    public String getRESTCustomPojoExportAll(String app){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionExportAllPojo(baseURL.getControllerURL(), app); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
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
     *  This will export all custom pojo into the application and tier.
     * </p>
     * 
     * @param app The name of the application
     * @param tier The name of the tier
     * @return {@link String}
     * 
     * <p>
     * <br>queryTransactionDetectionExportAllPojo
     * </p>
     */
    public String getRESTCustomPojoExportAll(String app, String tier){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).append(" tier ").append(tier).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionExportAllPojo(baseURL.getControllerURL(), app, tier); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
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
     *  This will export all custom pojo into the application and tier.
     * </p>
     * 
     * @param app The name of the application
     * @return  {@link CustomMatchPoints}
     * 
     * <p>
     * <br>queryTransactionDetectionExportAllPojo
     * </p>
     */
    public CustomMatchPoints getRESTCustomPojoExportAllObj(String app){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionExportAllPojo(baseURL.getControllerURL(), app); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
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
     *  This will export all custom pojo into the application and tier.
     * </p>
     * 
     * @param app The name of the application
     * @param tier The name of the tier
     * @return {@link CustomMatchPoints}
     * 
     * <p>
     * <br>queryTransactionDetectionExportAllPojo
     * </p>
     */
    public CustomMatchPoints getRESTCustomPojoExportAllObj(String app, String tier){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).append(" tier ").append(tier).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionExportAllPojo(baseURL.getControllerURL(), app, tier); //tested
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(" application ")
                    .append(app).toString());
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
     * @param app The name of the application
     * @param objNode The name of the custom pojo
     * @return {@link String}
     * 
     * <p>
     * <br>queryTransactionDetectionExportPojo
     * </p>
     */
    public String getRESTCustomPojoExport(String app, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app).append(" for custom pojo ").append(objNode).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionExportPojo(baseURL.getControllerURL(), app, objNode); //tested
        
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
     *  This will export a single custom pojo into the application and tier.
     * </p>
     * 
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom pojo
     * @return {@link String}
     * 
     * <p>
     * <br>Index  0 : queryTransactionDetectionExportPojo
     * </p>
     */
    public String getRESTCustomPojoExport(String app, String tier, String objNode){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo Export query for application ").append(app)
                .append(" tier ").append(tier).append(" for custom pojo ").append(objNode).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionExportPojo(baseURL.getControllerURL(), app, tier, objNode); //tested
        
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
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will import a custom pojo into the application and tier.
     * </p>
     * 
     * @param app The name of the application
     * @param objNode The name of the custom pojo
     * @param xml Xml string for the custom pojo
     * @return {@link String}
     * 
     * <p>
     * <br> queryTransactionDetectionImportPojo
     * </p>
     */
    public String postRESTCustomPojo(String app, String objNode, String xml){
        
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo POST for application ").append(app).append(" for custom pojo ").append(objNode).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionImportPojo(baseURL.getControllerURL(), app, objNode); //tested
        logger.log(Level.INFO,new StringBuilder().append("The query is ").append(query).toString());
        
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
     * @param app The name of the application
     * @param tier The name of the tier
     * @param objNode The name of the custom pojo
     * @param xml Xml string for the custom pojo
     * @return {@link String}
     * 
     * <p> queryTransactionDetectionImportPojo</p>
     */
    public String postRESTCustomPojo(String app, String tier, String objNode, String xml){
        
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nPojo POST for application ").append(app)
                .append(" tier ").append(tier).append(" for custom pojo ").append(objNode).toString());}
        
        query=TransactionDetectionQuery.queryTransactionDetectionImportPojo(baseURL.getControllerURL(), app,tier, objNode); //tested
        
        
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
     *  This will export all health rules for the application name,
     * <br> this functionality is only in the controller version 3.9.x and above. 
     * </p>
     * 
     * @param app Name of the application
     * @param app The name of the application

     * @return {@link String}
     * 
     */
    public String getRESTHealthRuleExportAll(String app){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nQuery to get health rules for application ").append(app).toString());}

        query=HealthRuleQuery.queryHealthRulesExportAll(baseURL.getControllerURL(), app); //tested

        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nHealthRule query for ")
                    .append(app).toString());
            return null;
        }
        
        
        try{
            return R.executeExportHealthRule(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will export all health rules for the application name,
     * <br> this functionality is only in the controller version 3.9.x and above. 
     * </p>
     * 

     * @param app Name of the application
     * @param app The name of the application

     * @return {@link HealthRules}
     * 
     */
    public HealthRules getRESTHealthRuleObjExportAll(String app){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nQuery to get health rules for application ").append(app).toString());}

        query=HealthRuleQuery.queryHealthRulesExportAll(baseURL.getControllerURL(), app); //tested

        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nHealthRule query for ")
                    .append(app).toString());
            return null;
        }
        
        
        try{
            return R.executeExportHealthRuleObj(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    
    /**
     * <p>
     *  This will export a single health rule for the application name and rule
     * <br> name given, this functionality is only 
     * <br> in the controller version 3.9.x and above. 
     * </p>
     * 
     * @param app Application name
     * @param name Health rule name
     * @return {@link String}
     */
    public String getRESTHealthRuleExportSingle(String app, String name){
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nQuery to get health rule for application ").append(app)
                .append(" for rule ").append(name).toString());}

        query=HealthRuleQuery.queryHealthRulesExportSingle(baseURL.getControllerURL(), app, name); 

        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nHealthRule query for ")
                    .append(app).toString());
            return null;
        }
        
        
        try{
            return R.executeExportHealthRule(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will export a single health rule for the application name and rule
     * <br> name given, this functionality is only 
     * <br> in the controller version 3.9.x and above. 
     * </p>
     * 
     * @param app Application name
     * @param name Health rule name
     * @return {@link HealthRules}
     */
    public HealthRules getRESTHealthRuleObjExportSingle(String app, String name){
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nQuery to get health rule for application ").append(app)
                .append(" for rule ").append(name).toString());}

        query=HealthRuleQuery.queryHealthRulesExportSingle(baseURL.getControllerURL(), app, name); 

        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nHealthRule query for ")
                    .append(app).toString());
            return null;
        }
        
        
        try{
            return R.executeExportHealthRuleObj(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }    
    
    /**
     * <p>
     *  This will import a single health rule for the application name and rule
     * <br> name given, this functionality is only 
     * <br> in the controller version 3.9.x and above. 
     * </p>
     * 
     * @param app Application name
     * @param entityName Health rule name
     * @param xml Xml String for the health rule entry
     * @return {@link String}
     */
    public String postRESTHealthRule(String app, String entityName, String xml){
        
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nHealth rule POST for application ").append(app)
                .append(" for rule ").append(entityName).toString());}
        

        query=HealthRuleQuery.queryHealthRulesImportSingle(baseURL.getControllerURL(), app, entityName); //tested

        
        try{
            return R.executeAutoPostQuery(auth, query,entityName,xml);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * This method will allow a user to post an event to the controller, the PostEvent
     * has its own set of requirements. {@link PostEvent}
     * </p>
     * @param app Name of the application to post the event too
     * @param postEvent PostEvent object that contains the information for the event.
     * @return {@link String}
     */
    public String postRESTCustomEvent(String app, PostEvent postEvent){
        
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nEvent POST for application ").append(app).append(" for custom event ").toString());}

        try{
            query=EventsQuery.queryPostEvent(baseURL.getControllerURL(), app, postEvent);
            
            //return R.executeTDPostQuery(auth, query, objNode,xml);
            return R.executeEventPostQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * This method will allow a user to post an event to the controller, the PostEvent
     * has its own set of requirements. {@link PostEvent}
     * </p>
     * @param app Name of the application to post the event too
     * @param summary Summary of the event
     * @param comment Comment for the event
     * @return {@link String}
     */
    public String postRESTCustomEvent(String app, String summary, String comment){
        
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nEvent POST for application ").append(app).append(" for custom event ").toString());}

        try{
            query=EventsQuery.queryPostEvent(baseURL.getControllerURL(), app, new PostEvent(summary,comment));
            
            //return R.executeTDPostQuery(auth, query, objNode,xml);
            return R.executeEventPostQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
     /**
     * <p>
     * This method will allow a user to mark nodes historical
     * </p>
     * @param ids The id or ids that should be marked for deletion
     * @return {@link String}
     */
    public String postRESTMarkNodeHistorical(String ids){
        
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nMark Node Historical with ids = ").append(ids).toString());}

        try{
            query=MarkHistoricalQuery.queryMarkNodeHistorical(baseURL.getControllerURL(), ids);
            
            //return R.executeTDPostQuery(auth, query, objNode,xml);
            return R.executeEventPostQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * This method will allow a user to add a user
     * </p>
     * @param user The user object
     * @return {@link String}
     */
    public String postRESTAddUser(User user){
        
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nUser to be created or updated = ").append(user).toString());}
        
        if(!user.ableToCreate()){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Unable to create user because the user object does not have all of the mandatory objects.").append(user).toString());
        }
        try{
            query=UserQuery.queryPostUser(baseURL.getControllerURL(), user.createURL());
            
            return R.executeEventPostQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     * This method will allow a user to update a user
     * </p>
     * @param user The user object
     * @return {@link String}
     */
    public String postRESTUpdateUser(User user){
        
        String query=null;
        
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nUser to be created or updated = ").append(user).toString());}
        if(!user.ableToUpdate()){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Unable to create user because the user object does not have all of the mandatory objects.").append(user).toString());
        }
        try{
            query=UserQuery.queryPostUser(baseURL.getControllerURL(), user.createURL());
            
            return R.executeEventPostQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * <p>
     *  This will import a dashboard file into the controller, the filePath must be the full path
     * to the dashboard file.
     * </p>
     * 
     * @param filePath Full path to the file
     * @return {@link String}
     */
    public String postRESTImportDashboard(String filePath){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder()
                .append("\nThe dashboard being import is  ").append(filePath).toString());}
 
        try{
            query=DashboardQuery.queryDashboardImport(baseURL.getControllerURL());
            
            return R.executePostDashboardQuery(auth, query, filePath);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        
        return null;
        
    }
    
    /**
     * <p>
     * This will return the controller's configuration properties.
     * </p>
     * @param application The application name that has the information
     * @return {@link ConfigurationItems}
     */
    public ConfigurationItems getConfigurationItems(String application){
        try{
            return R.executeConfigurationItems(auth, 
                    ConfigurationItemQuery.queryConfiguration(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This will return the controller's configuration properties.
     * </p>
     * @param application The application name that has the information
     * @param metricName The name of the metric you want
     * @return {@link ConfigurationItems}
     */
    public ConfigurationItems getConfigurationItems(String application, String metricName){
        try{
            return R.executeConfigurationItems(auth, 
                    ConfigurationItemQuery.queryConfiguration(baseURL.getControllerURL(), application, metricName));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This will return the controller's license properties, the REST user must have account owner rights
     * </p>
     * @return {@link LicenseProperties}
     */
    public LicenseProperties getLicenseProperties(){
        try{
            return R.executeLicenseProperties(auth, 
                    LicenseQuery.queryLicenseProperties(baseURL.getControllerURL()));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * <p>
     * This will return the controller's license EUM properties, the REST user must have account owner rights
     * </p>
     * @return {@link LicenseProperties}
     */
    public AccountEUM getAccountEUM(){
        try{
            return R.executeAccountEUM(auth, 
                    LicenseQuery.queryAccountEUM(baseURL.getControllerURL()));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n")
                    .append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
}

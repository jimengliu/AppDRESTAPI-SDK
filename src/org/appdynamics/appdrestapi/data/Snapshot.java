/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 * 
 */
/*
 * <request-segment-datas>
 * <request-segment-data>
        <id>0</id>
        <archived>false</archived>
        <requestGUID>103b98e6-4b33-4a8d-9511-d572e9c828c8</requestGUID>
        <businessTransactionId>7204</businessTransactionId>
        <applicationId>81</applicationId>
        <applicationComponentId>650</applicationComponentId>
        <applicationComponentNodeId>19155</applicationComponentNodeId>
        <async>false</async>
        <threadID>59</threadID>
        <threadName>http-8080-19</threadName>
        <localStartTime>1398266842227</localStartTime>
        <serverStartTime>1398266842227</serverStartTime>
        <firstInChain>true</firstInChain>
        <callChain>Component:650</callChain>
        <localID>0</localID>
        <errorOccured>false</errorOccured>
        <hasDeepDiveData>true</hasDeepDiveData>
        <userExperience>VERY_SLOW</userExperience>
        <timeTakenInMilliSecs>2005</timeTakenInMilliSecs>
        <cpuTimeTakenInMilliSecs>0</cpuTimeTakenInMilliSecs>
        <warningThreshold>3.0 standard deviations = 666 ms. (For the last 120 mins, the moving average was 42 ms and the standard deviation was 222 ms)3.0x of standard deviation [222.07039] for moving average [42.759327] for the last [120] minutes.</warningThreshold>
        <criticalThreshold>4.0 standard deviations = 888 ms. (For the last 120 mins, the moving average was 42 ms and the standard deviation was 222 ms)4.0x of standard deviation [222.07039] for moving average [42.759327] for the last [120] minutes.</criticalThreshold>
        <summary>Request was slower than the average by one of the thresholds below - </summary>
        <errorSummary></errorSummary>
        <diagnosticSessionGUID></diagnosticSessionGUID>
        <deepDivePolicy>INFLIGHT_SLOW_SESSION</deepDivePolicy>
        <delayedDeepDive>true</delayedDeepDive>
        <delayedDeepDiveOffSet>868</delayedDeepDiveOffSet>
        <exitCallsDataTruncated>false</exitCallsDataTruncated>
        <URL>/patron/v2/apid:TH-303-44951-93-50/original.txt</URL>
        <errorIDs/>
        <errorDetails/>
        <httpParameters/>
        <businessData/>
        <cookies/>
        <httpHeaders/>
        <sessionKeys/>
        <responseHeaders/>
        <logMessages/>
        <transactionProperties/>
        <transactionEvents/>
        <unresolvedCallInCallChain>false</unresolvedCallInCallChain>
        <dotnetProperty/>
</request-segment-data>
 * 
 */
public class Snapshot {
    private int id;
    private boolean archived;
    private String requestGUID;
    private int businessTransactionId;
    private int applicationId;
    private int applicationComponentId;
    private int applicationComponentNodeId;
    private boolean async;
    private int threadID;
    private String threadName;
    private long localStartTime;
    private long serverStartTime;
    private boolean firstInChain;
    private String callChain;
    private int localID;
    private boolean errorOccured;
    private boolean hasDeepDiveData;
    private String userExperience;
    private long timeTakenInMilliSecs;
    private long cpuTimeTakenInMilliSecs;
    private String warningThreshold;
    private String criticalThreshold;
    private String summary;
    private String errorSummary;
    private String diagnosticSessionGUID;
    private String deepDivePolicy;
    private boolean delayedDeepDive;
    private long delayedDeepDiveOffSet;
    private boolean exitCallsDataTruncated;
    private String URL;
    private String errorIDs;
    private String errorDetails;
    private String httpParameters;
    private String businessData;
    private String cookies;
    private String httpHeaders;
    private String sessionKeys;
    private String responseHeaders;
    private String logMessages;
    private String transactionProperties;
    private String transactionEvents;
    private boolean unresolvedCallInCallChain;
    private String dotnetProperty;
    
    public Snapshot(){}

    @XmlElement(name=s.ID)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name=s.ARCHIVED)
    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    @XmlElement(name=s.REQUEST_GUID)
    public String getRequestGUID() {
        return requestGUID;
    }

    public void setRequestGUID(String requestGUID) {
        this.requestGUID = requestGUID;
    }

    @XmlElement(name=s.BUSINESS_TRANSACTION_ID)
    public int getBusinessTransactionId() {
        return businessTransactionId;
    }

    public void setBusinessTransactionId(int businessTransactionId) {
        this.businessTransactionId = businessTransactionId;
    }

    @XmlElement(name=s.APPLICATION_ID)
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    @XmlElement(name=s.APPLICATION_COMPONENT_ID)
    public int getApplicationComponentId() {
        return applicationComponentId;
    }

    public void setApplicationComponentId(int applicationComponentId) {
        this.applicationComponentId = applicationComponentId;
    }

    @XmlElement(name=s.APPLICATION_COMPONENT_NODE_ID)
    public int getApplicationComponentNodeId() {
        return applicationComponentNodeId;
    }

    public void setApplicationComponentNodeId(int applicationComponentNodeId) {
        this.applicationComponentNodeId = applicationComponentNodeId;
    }

    @XmlElement(name=s.ASYNC)
    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }

    @XmlElement(name=s.THREAD_ID)
    public int getThreadID() {
        return threadID;
    }

    public void setThreadID(int threadID) {
        this.threadID = threadID;
    }

    @XmlElement(name=s.THREAD_NAME)
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @XmlElement(name=s.LOCAL_START_TIME)
    public long getLocalStartTime() {
        return localStartTime;
    }

    public void setLocalStartTime(long localStartTime) {
        this.localStartTime = localStartTime;
    }

    @XmlElement(name=s.SERVER_START_TIME)
    public long getServerStartTime() {
        return serverStartTime;
    }

    public void setServerStartTime(long serverStartTime) {
        this.serverStartTime = serverStartTime;
    }

    @XmlElement(name=s.FIRST_IN_CHAIN)
    public boolean isFirstInChain() {
        return firstInChain;
    }

    public void setFirstInChain(boolean firstInChain) {
        this.firstInChain = firstInChain;
    }

    @XmlElement(name=s.CALL_CHAIN)
    public String getCallChain() {
        return callChain;
    }

    public void setCallChain(String callChain) {
        this.callChain = callChain;
    }

    @XmlElement(name=s.LOCAL_ID)
    public int getLocalID() {
        return localID;
    }

    public void setLocalID(int localID) {
        this.localID = localID;
    }

    @XmlElement(name=s.ERROR_OCCURRED)
    public boolean isErrorOccured() {
        return errorOccured;
    }

    public void setErrorOccured(boolean errorOccured) {
        this.errorOccured = errorOccured;
    }

    @XmlElement(name=s.HAS_DEEP_DIVE_DATA)
    public boolean isHasDeepDiveData() {
        return hasDeepDiveData;
    }

    public void setHasDeepDiveData(boolean hasDeepDiveData) {
        this.hasDeepDiveData = hasDeepDiveData;
    }

    @XmlElement(name=s.USER_EXPERIENCE)
    public String getUserExperience() {
        return userExperience;
    }

    public void setUserExperience(String userExperience) {
        this.userExperience = userExperience;
    }

    @XmlElement(name=s.TIME_TAKEN_IN_MILLISECS)
    public long getTimeTakenInMilliSecs() {
        return timeTakenInMilliSecs;
    }

    public void setTimeTakenInMilliSecs(long timeTakenInMilliSecs) {
        this.timeTakenInMilliSecs = timeTakenInMilliSecs;
    }

    @XmlElement(name=s.CPU_TIME_TAKEN_IN_MILLISSECS)
    public long getCpuTimeTakenInMilliSecs() {
        return cpuTimeTakenInMilliSecs;
    }

    public void setCpuTimeTakenInMilliSecs(long cpuTimeTakenInMilliSecs) {
        this.cpuTimeTakenInMilliSecs = cpuTimeTakenInMilliSecs;
    }

    @XmlElement(name=s.WARNING_THRESHOLD)
    public String getWarningThreshold() {
        return warningThreshold;
    }

    public void setWarningThreshold(String warningThreshold) {
        this.warningThreshold = warningThreshold;
    }

    @XmlElement(name=s.CRITICAL_THRESHOLD)
    public String getCriticalThreshold() {
        return criticalThreshold;
    }

    public void setCriticalThreshold(String criticalThreshold) {
        this.criticalThreshold = criticalThreshold;
    }

    @XmlElement(name=s.SUMMARY)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @XmlElement(name=s.ERROR_SUMMARY)
    public String getErrorSummary() {
        return errorSummary;
    }

    public void setErrorSummary(String errorSummary) {
        this.errorSummary = errorSummary;
    }

    @XmlElement(name=s.DIAGNOSTIC_SESSION_GUID)
    public String getDiagnosticSessionGUID() {
        return diagnosticSessionGUID;
    }

    public void setDiagnosticSessionGUID(String diagnosticSessionGUID) {
        this.diagnosticSessionGUID = diagnosticSessionGUID;
    }

    @XmlElement(name=s.DEEP_DIVE_POLICY)
    public String getDeepDivePolicy() {
        return deepDivePolicy;
    }

    public void setDeepDivePolicy(String deepDivePolicy) {
        this.deepDivePolicy = deepDivePolicy;
    }

    @XmlElement(name=s.DELAY_DEEP_DIVE)
    public boolean isDelayedDeepDive() {
        return delayedDeepDive;
    }

    public void setDelayedDeepDive(boolean delayedDeepDive) {
        this.delayedDeepDive = delayedDeepDive;
    }

    @XmlElement(name=s.DELAY_DEEP_DIVE_OFFSET)
    public long getDelayedDeepDiveOffSet() {
        return delayedDeepDiveOffSet;
    }

    public void setDelayedDeepDiveOffSet(long delayedDeepDiveOffSet) {
        this.delayedDeepDiveOffSet = delayedDeepDiveOffSet;
    }

    @XmlElement(name=s.EXIT_CALLS_DATA_TRUNCATED)
    public boolean isExitCallsDataTruncated() {
        return exitCallsDataTruncated;
    }

    public void setExitCallsDataTruncated(boolean exitCallsDataTruncated) {
        this.exitCallsDataTruncated = exitCallsDataTruncated;
    }

    @XmlElement(name=s.URL)
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @XmlElement(name=s.ERROR_IDS)
    public String getErrorIDs() {
        return errorIDs;
    }

    public void setErrorIDs(String errorIDs) {
        this.errorIDs = errorIDs;
    }

    @XmlElement(name=s.ERROR_DETAILS)
    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    @XmlElement(name=s.HTTP_PARAMETERS)
    public String getHttpParameters() {
        return httpParameters;
    }

    public void setHttpParameters(String httpParameters) {
        this.httpParameters = httpParameters;
    }

    @XmlElement(name=s.BUSINESS_DATA)
    public String getBusinessData() {
        return businessData;
    }

    public void setBusinessData(String businessData) {
        this.businessData = businessData;
    }

    @XmlElement(name=s.COOKIES)
    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    @XmlElement(name=s.HTTP_HEADERS)
    public String getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(String httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    @XmlElement(name=s.SESSION_KEYS)
    public String getSessionKeys() {
        return sessionKeys;
    }

    public void setSessionKeys(String sessionKeys) {
        this.sessionKeys = sessionKeys;
    }

    @XmlElement(name=s.RESPONSE_HEADERS)
    public String getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(String responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    @XmlElement(name=s.LOG_MESSAGES)
    public String getLogMessages() {
        return logMessages;
    }

    public void setLogMessages(String logMessages) {
        this.logMessages = logMessages;
    }

    @XmlElement(name=s.TRANSACTION_PROPERTIES)
    public String getTransactionProperties() {
        return transactionProperties;
    }

    public void setTransactionProperties(String transactionProperties) {
        this.transactionProperties = transactionProperties;
    }

    @XmlElement(name=s.TRANSACTION_EVENTS)
    public String getTransactionEvents() {
        return transactionEvents;
    }

    public void setTransactionEvents(String transactionEvents) {
        this.transactionEvents = transactionEvents;
    }

    @XmlElement(name=s.UNRESOLVED_CALL_IN_CALL_CHAIN)
    public boolean isUnresolvedCallInCallChain() {
        return unresolvedCallInCallChain;
    }

    public void setUnresolvedCallInCallChain(boolean unresolvedCallInCallChain) {
        this.unresolvedCallInCallChain = unresolvedCallInCallChain;
    }

    @XmlElement(name=s.DOT_NET_PROPERTY)
    public String getDotnetProperty() {
        return dotnetProperty;
    }

    public void setDotnetProperty(String dotnetProperty) {
        this.dotnetProperty = dotnetProperty;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(s.REQUEST_SEGMENT_DATA);
        bud.append(AppExportS.L2).append(s.ID).append(AppExportS.VE).append(id);
        bud.append(AppExportS.L2).append(s.ARCHIVED).append(AppExportS.VE).append(archived);
        bud.append(AppExportS.L2).append(s.REQUEST_GUID).append(AppExportS.VE).append(requestGUID);
        bud.append(AppExportS.L2).append(s.BUSINESS_TRANSACTION_ID).append(AppExportS.VE).append(businessTransactionId);
        bud.append(AppExportS.L2).append(s.APPLICATION_ID).append(AppExportS.VE).append(applicationId);
        bud.append(AppExportS.L2).append(s.APPLICATION_COMPONENT_ID).append(AppExportS.VE).append(applicationComponentId);
        bud.append(AppExportS.L2).append(s.APPLICATION_COMPONENT_NODE_ID).append(AppExportS.VE).append(applicationComponentNodeId);
        bud.append(AppExportS.L2).append(s.ASYNC).append(AppExportS.VE).append(async);
        bud.append(AppExportS.L2).append(s.THREAD_ID).append(AppExportS.VE).append(threadID);
        bud.append(AppExportS.L2).append(s.THREAD_NAME).append(AppExportS.VE).append(threadName);
        bud.append(AppExportS.L2).append(s.LOCAL_START_TIME).append(AppExportS.VE).append(localStartTime);
        bud.append(AppExportS.L2).append(s.SERVER_START_TIME).append(AppExportS.VE).append(serverStartTime);
        bud.append(AppExportS.L2).append(s.FIRST_IN_CHAIN).append(AppExportS.VE).append(firstInChain);
        bud.append(AppExportS.L2).append(s.CALL_CHAIN).append(AppExportS.VE).append(callChain);
        bud.append(AppExportS.L2).append(s.LOCAL_ID).append(AppExportS.VE).append(localID);
        bud.append(AppExportS.L2).append(s.ERROR_OCCURRED).append(AppExportS.VE).append(errorOccured);
        bud.append(AppExportS.L2).append(s.HAS_DEEP_DIVE_DATA).append(AppExportS.VE).append(hasDeepDiveData);
        bud.append(AppExportS.L2).append(s.USER_EXPERIENCE).append(AppExportS.VE).append(userExperience);
        bud.append(AppExportS.L2).append(s.TIME_TAKEN_IN_MILLISECS).append(AppExportS.VE).append(timeTakenInMilliSecs);
        bud.append(AppExportS.L2).append(s.CPU_TIME_TAKEN_IN_MILLISSECS).append(AppExportS.VE).append(cpuTimeTakenInMilliSecs);
        bud.append(AppExportS.L2).append(s.WARNING_THRESHOLD).append(AppExportS.VE).append(warningThreshold);
        bud.append(AppExportS.L2).append(s.CRITICAL_THRESHOLD).append(AppExportS.VE).append(criticalThreshold);
        bud.append(AppExportS.L2).append(s.SUMMARY).append(AppExportS.VE).append(summary);
        bud.append(AppExportS.L2).append(s.ERROR_SUMMARY).append(AppExportS.VE).append(errorSummary);
        bud.append(AppExportS.L2).append(s.DIAGNOSTIC_SESSION_GUID).append(AppExportS.VE).append(diagnosticSessionGUID);
        bud.append(AppExportS.L2).append(s.DEEP_DIVE_POLICY).append(AppExportS.VE).append(deepDivePolicy);
        bud.append(AppExportS.L2).append(s.DELAY_DEEP_DIVE).append(AppExportS.VE).append(delayedDeepDive);
        bud.append(AppExportS.L2).append(s.DELAY_DEEP_DIVE_OFFSET).append(AppExportS.VE).append(delayedDeepDiveOffSet);
        bud.append(AppExportS.L2).append(s.EXIT_CALLS_DATA_TRUNCATED).append(AppExportS.VE).append(exitCallsDataTruncated);
        bud.append(AppExportS.L2).append(s.URL).append(AppExportS.VE).append(URL);
        bud.append(AppExportS.L2).append(s.ERROR_IDS).append(AppExportS.VE).append(errorIDs);
        bud.append(AppExportS.L2).append(s.ERROR_DETAILS).append(AppExportS.VE).append(errorDetails);
        bud.append(AppExportS.L2).append(s.HTTP_PARAMETERS).append(AppExportS.VE).append(httpParameters);
        bud.append(AppExportS.L2).append(s.BUSINESS_DATA).append(AppExportS.VE).append(businessData);
        bud.append(AppExportS.L2).append(s.COOKIES).append(AppExportS.VE).append(cookies);
        bud.append(AppExportS.L2).append(s.HTTP_HEADERS).append(AppExportS.VE).append(httpHeaders);
        bud.append(AppExportS.L2).append(s.SESSION_KEYS).append(AppExportS.VE).append(sessionKeys);
        bud.append(AppExportS.L2).append(s.RESPONSE_HEADERS).append(AppExportS.VE).append(responseHeaders);
        bud.append(AppExportS.L2).append(s.LOG_MESSAGES).append(AppExportS.VE).append(logMessages);
        bud.append(AppExportS.L2).append(s.TRANSACTION_PROPERTIES).append(AppExportS.VE).append(transactionProperties);
        bud.append(AppExportS.L2).append(s.TRANSACTION_EVENTS).append(AppExportS.VE).append(transactionEvents);
        bud.append(AppExportS.L2).append(s.UNRESOLVED_CALL_IN_CALL_CHAIN).append(AppExportS.VE).append(unresolvedCallInCallChain);
        bud.append(AppExportS.L2).append(s.DOT_NET_PROPERTY).append(AppExportS.VE).append(dotnetProperty);
        
        return bud.toString();
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.s;

/**
 * <p>RequestSnapshots is used when you need to provide additional parameters to better filter the result set. Once you built your instance you can check the construction with getParameters() method.</p>
 * 
 * @author gilbert.solorzano
 */
public class RequestSnapshots {
    private String guids;
    private boolean archived;
    private boolean archivedSet;
    private String deepDivePolicy;
    private String applicationComponentIds;
    private String applicationComponentNodeIds;
    private String businessTransactionIds;
    private String userExperience;
    private boolean firstInChain;
    private boolean firstInChainSet;
    private boolean needProps, needPropsSet;
    private boolean needExitCalls, needExitCallsSet;
    private long executionTimeInMillis;
    private String sessionId;
    private String userPrincipalId;
    private String errorIds;
    private String startingRequestId,endingRequestId;
    private boolean errorOccurred,errorOccurredSet;
    private boolean diagnosticSnapshot,diagnosticSnapshotSet;
    private boolean badRequest, badRequestSet;
    private String diagnosticSessionGuid;
    private String dataCollectorName;
    private String dataCollectorValue;
    private String dataCollectorType;

    /**
     * <p>Snapshots guids</p>
     * @return Comma separated list of guids to look for
     */
    public String getGuids() {
        return guids;
    }

    /**
     * <p>Comma separated list of GUIDs to filter the snapshots on</p>
     * @param guids The guids
     */
    public void setGuids(String guids) {
        this.guids = guids;
    }

    /**
     * <p>Defines whether we are retrieving archived snapshots</p> 
     * @return boolean 
     */
    public boolean isArchived() {
        return archived;
    }

    /**
     * <p>Defines whether we are retrieving archived snapshots</p>
     * @param archived Whether to show archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
        this.archivedSet=true;
    }

    /**
     * <p>The set of possible policy filters are contained within the string array s.SNAPSHOT_DEEP_DIVE_POLICY_VALUES</p>
     * @return Comma separated list of policy filters
     */
    public String getDeepDivePolicy() {
        return deepDivePolicy;
    }

    /**
     * <p>The set of filters that can be applied to snapshots</p>
     * @param deepDeivePolicy Filter
     */
    public void setDeepDivePolicy(String deepDeivePolicy) {
        this.deepDivePolicy = deepDeivePolicy;
    }

    /**
     * 
     * @return Comma separated list of tier Ids
     */
    public String getApplicationComponentIds() {
        return applicationComponentIds;
    }

    /**
     * <p>Tier Ids that will be used to filter snapshots</p>
     * @param applicationComponentIds Tier Ids
     */
    public void setApplicationComponentIds(String applicationComponentIds) {
        this.applicationComponentIds = applicationComponentIds;
    }

    /**
     * 
     * @return Comma separated list of node Ids
     */
    public String getApplicationComponentNodeIds() {
        return applicationComponentNodeIds;
    }

    /**
     * <p>Node Ids that will be used to filter snapshots</p>
     * @param applicationComponentNodeIds Node Ids
     */
    public void setApplicationComponentNodeIds(String applicationComponentNodeIds) {
        this.applicationComponentNodeIds = applicationComponentNodeIds;
    }

    /**
     * 
     * @return Comma separated list of business transaction Ids
     */
    public String getBusinessTransactionIds() {
        return businessTransactionIds;
    }

    /**
     * <p>Business transaction Ids that will be used to filter snapshots</p>
     * @param businessTransactionIds BT Ids
     */
    public void setBusinessTransactionIds(String businessTransactionIds) {
        this.businessTransactionIds = businessTransactionIds;
    }

    /**
     * <p>The set of possible filters are contained within the string array s.SNAPSHOT_USER_EXP_VALUES</p>
     * @return Comma separated list of user experience filters
     */
    public String getUserExperience() {
        return userExperience;
    }

    /**
     * <p>User experience filters to use to filter snapshots</p>
     * @param userExperience User exp codes
     */
    public void setUserExperience(String userExperience) {
        this.userExperience = userExperience;
    }

    /**
     * 
     * @return boolean whether to only return the first request from the chain
     */
    public boolean getFirstInChain() {
        return firstInChain;
    }

    /**
     * <p>If set we limit the snapshots to the first chain</p>
     * @param firstInChain Limit to first chain
     */
    public void setFirstInChain(boolean firstInChain) {
        this.firstInChain = firstInChain;
        this.firstInChainSet=true;
    }

    /**
     * 
     * @return boolean if true you will get additional information such as errorDetails
     */
    public boolean getNeedProps() {
        return needProps;
    }

    /**
     * <p>If set to true then you will get additional properties populated in the snapshot</p>
     * @param needProps Provide additional information if set to true
     */
    public void setNeedProps(boolean needProps) {
        this.needProps = needProps;
        this.needPropsSet=true;
    }

    /**
     * 
     * @return boolean if true you will get additional exit call information
     */
    public boolean getNeedExitCalls() {
        return needExitCalls;
    }

    public void setNeedExitCalls(boolean needExitCalls) {
        this.needExitCalls = needExitCalls;
        this.needExitCallsSet=true;
    }

    /**
     * 
     * @return long the number of milli seconds the snapshot must exceed to be present 
     */
    public long getExecutionTimeInMillis() {
        return executionTimeInMillis;
    }

    public void setExecutionTimeInMillis(long executionTimeInMillis) {
        this.executionTimeInMillis = executionTimeInMillis;
    }

    /**
     * 
     * @return String, return only snapshots that have this session Id 
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 
     * @return String, return only snapshots that have this user-principal
     */
    public String getUserPrincipalId() {
        return userPrincipalId;
    }

    /**
     * <p>Filter the snapshots on the user-principle-id</p>
     * @param userPrincipalId The user principal Id
     */
    public void setUserPrincipalId(String userPrincipalId) {
        this.userPrincipalId = userPrincipalId;
    }

    /**
     * 
     * @return String, comma separated list of ERROR Ids 
     */
    public String getErrorIds() {
        return errorIds;
    }

    /**
     * <p>Comma separate list of ERROR Ids to filter on</p>
     * @param errorIds The error Ids
     */
    public void setErrorIds(String errorIds) {
        this.errorIds = errorIds;
    }

    /**
     * 
     * @return String, start of the request Ids for the snapshots you want to retrieve  
     */
    public String getStartingRequestId() {
        return startingRequestId;
    }

    /**
     * <p>The start of the request Ids for the snapshots you want to retrieve, must set the ending request Ids for this to take effect</p>
     * @param startingRequestId The starting of the request Ids
     */
    public void setStartingRequestId(String startingRequestId) {
        this.startingRequestId = startingRequestId;
    }

    /**
     * 
     * @return String, end of the request Ids for the snapshots you want to retrieve  
     */
    public String getEndingRequestId() {
        return endingRequestId;
    }

    /**
     * <p>The end of the request Ids for the snapshots you want to retrieve</p>
     * @param endingRequestId The end of the request Id
     */
    public void setEndingRequestId(String endingRequestId) {
        this.endingRequestId = endingRequestId;
    }

    /**
     * 
     * @return boolean, if true only snapshots with errors are returned
     */
    public boolean getErrorOccurred() {
        return errorOccurred;
    }

    /**
     * <p>If true only snapshots with errors are returned</p>
     * @param errorOccurred Whether errors are being looked for
     */
    public void setErrorOccurred(boolean errorOccurred) {
        this.errorOccurred = errorOccurred;
        this.errorOccurredSet=true;
    }

    /**
     * 
     * @return boolean, if true only snapshots in SLOW and ERROR are returned 
     */
    public boolean isBadRequest() {
        return badRequest;
    }

    /**
     * <p>If true only snapshots that are SLOW and ERROR are returned.</p>
     * @param badRequest Check if looking for bad requests
     */
    public void setBadRequest(boolean badRequest) {
        this.badRequest = badRequest;
        this.badRequestSet = true;
    }

    /**
     * 
     * @return String, comma separated diagnostic session guids to filter on 
     */
    public String getDiagnosticSessionGuid() {
        return diagnosticSessionGuid;
    }

    /**
     * <p>Comma separated diagnostic session GUIDs to filter on</p>
     * @param diagnosticSessionGuid The guid of the diagnostic snapshots
     */
    public void setDiagnosticSessionGuid(String diagnosticSessionGuid) {
        this.diagnosticSessionGuid = diagnosticSessionGuid;
    }

    
    /**
     * 
     * @return boolean, if true only diagnostic snapshots are returned  
     */
    public boolean getDiagnosticSnapshot() {
        return diagnosticSnapshot;
    }

    /**
     * <p>If true only diagnostic snapshots are returned</p>
     * @param diagnosticSnapshot Looking for diagnostic snapshots
     */
    public void setDiagnosticSnapshot(boolean diagnosticSnapshot) {
        this.diagnosticSnapshot = diagnosticSnapshot;
        this.diagnosticSnapshotSet=true;
    }

    /**
     * <p>If you use data-collector-name, then you must provide values for data-collector-value and data-collector-type</p>
     * @return String, used to filter snapshots based on the name of the data-collector 
     */
    public String getDataCollectorName() {
        return dataCollectorName;
    }

    /**
     * <p>If you use data-collector-name, then you must provide values for data-collector-value and data-collector-type</p>
     * @param dataCollectorName Name of the collector
     */
    public void setDataCollectorName(String dataCollectorName) {
        this.dataCollectorName = dataCollectorName;
    }

    /**
     * 
     * @return String, used to filter snapshots based on the value of data-collector-name 
     */
    public String getDataCollectorValue() {
        return dataCollectorValue;
    }

    /**
     * <p> Value that will be used to filter snapshots based on the value</p>
     * @param dataCollectorValue Value of the collector
     */
    public void setDataCollectorValue(String dataCollectorValue) {
        this.dataCollectorValue = dataCollectorValue;
    }

    /**
     * 
     * @return String, The type of data collector to return s.SNAPSHOT_DATA_COLLECTOR_TYPE_VALUES has the valid values 
     */
    public String getDataCollectorType() {
        return dataCollectorType;
    }

    /**
     * <p>The type of data collector to return s.SNAPSHOT_DATA_COLLECTOR_TYPE_VALUES has the valid values</p>
     * @param dataCollectorType Type of the collector
     */
    public void setDataCollectorType(String dataCollectorType) {
        this.dataCollectorType = dataCollectorType;
    }
    
    /**
     * <p>This method will build the URL parameters, there are some requirements for this to work as you expect it to</p>
     * @return String
     */
    public String getParameters(){
        StringBuilder bud = new StringBuilder();
        if(guids != null) bud.append(s.SNAPSHOT_GUIDS).append(guids);
        if(archivedSet) bud.append(s.SNAPSHOT_ARCHIVED).append(archived);
        if(deepDivePolicy != null){ 
            // We need to check the values again the array before adding
            String[] userList = deepDivePolicy.split(",");
            StringBuilder ddp = new StringBuilder();
            int cnt=0;
            for(int i=0; i < userList.length;i++){
                boolean fnd=false;
                for(int a=0; a < s.SNAPSHOT_DEEP_DIVE_POLICY_VALUES.length;a++){
                    if(userList[i].equalsIgnoreCase(s.SNAPSHOT_DEEP_DIVE_POLICY_VALUES[a])){
                        if(cnt == 0){
                            ddp.append(s.SNAPSHOT_DEEP_DIVE_POLICY_VALUES[a]);
                        }else{
                            ddp.append(s._C).append(s.SNAPSHOT_DEEP_DIVE_POLICY_VALUES[a]);
                        }
                        cnt++;
                        fnd=true;
                    }
                }
                // If we did not find it, then what ?
            }
            if(cnt > 0) bud.append(s.SNAPSHOT_DEEP_DIVE_POLICY).append(ddp.toString());
        }
        if(applicationComponentIds != null) bud.append(s.SNAPSHOT_APPLICATION_COMPONENT_IDS).append(applicationComponentIds);
        if(applicationComponentNodeIds != null) bud.append(s.SNAPSHOT_APPLICATION_COMPONENT_NODE_IDS).append(applicationComponentNodeIds);
        if(businessTransactionIds != null) bud.append(s.SNAPSHOT_BUSINESS_TRANSACTION_IDS).append(businessTransactionIds);
        if(userExperience != null){
            // We need to insure that only falues that exist within the list are added
            String[] userList = userExperience.split(",");
            StringBuilder ddp = new StringBuilder();
            int cnt=0;
            for(int i=0; i < userList.length;i++){
                boolean fnd=false;
                for(int a=0; a < s.SNAPSHOT_USER_EXP_VALUES.length;a++){
                    if(userList[i].equalsIgnoreCase(s.SNAPSHOT_USER_EXP_VALUES[a])){
                        if(cnt == 0){
                            ddp.append(s.SNAPSHOT_USER_EXP_VALUES[a]);
                        }else{
                            ddp.append(s._C).append(s.SNAPSHOT_USER_EXP_VALUES[a]);
                        }
                        cnt++;
                        fnd=true;
                    }
                }
                // If we did not find it, then what ?
            }
            if(cnt > 0) bud.append(s.SNAPSHOT_USER_EXPERIENCE).append(ddp.toString());
        }
        if(firstInChainSet)bud.append(s.SNAPSHOT_FIRST_IN_CHAIN).append(firstInChain);
        if(needPropsSet)bud.append(s.SNAPSHOT_NEED_PROPS).append(needProps);
        if(needExitCallsSet)bud.append(s.SNAPSHOT_NEED_EXIT_CALLS).append(needExitCalls);
        if(executionTimeInMillis > 0) bud.append(s.SNAPSHOT_EXECUTION_TIME_IN_MILIS).append(executionTimeInMillis);
        if(sessionId != null) bud.append(s.SNAPSHOT_SESSION_ID).append(sessionId);
        if(userPrincipalId != null) bud.append(s.SNAPSHOT_USER_PRINCIPLE_ID).append(userPrincipalId);
        if(errorIds != null) bud.append(s.SNAPSHOT_ERROR_IDS).append(errorIds);
        if(startingRequestId != null && endingRequestId != null){
            // We need to check if we have both of these
            bud.append(s.SNAPSHOT_STARTING_REQUEST_ID).append(startingRequestId).append(s.SNAPSHOT_ENDING_REQUEST_ID).append(endingRequestId);
        }
        if(errorOccurredSet) bud.append(s.SNAPSHOT_ERROR_OCCURED).append(errorOccurred);
        if(diagnosticSnapshotSet) bud.append(s.SNAPSHOT_DIAGNOSTIC_SNAPSHOT).append(diagnosticSnapshot);
        if(badRequestSet) bud.append(s.SNAPSHOT_BAD_REQUEST).append(badRequest);
        if(diagnosticSessionGuid != null) bud.append(s.SNAPSHOT_DIAGNOSTIC_SESSION_GUID).append(diagnosticSessionGuid);
        if(dataCollectorName != null && dataCollectorValue != null && dataCollectorType != null){

            StringBuilder ddp = new StringBuilder();
            int cnt=0;
            ddp.append(s.SNAPSHOT_DATA_COLLECTOR_NAME).append(dataCollectorName);
            ddp.append(s.SNAPSHOT_DATA_COLLECTOR_VALUE).append(dataCollectorValue);
            boolean fnd=false;
            for(int a=0; a < s.SNAPSHOT_DATA_COLLECTOR_TYPE_VALUES.length;a++){
                if(dataCollectorType.equalsIgnoreCase(s.SNAPSHOT_DATA_COLLECTOR_TYPE_VALUES[a])){
                    ddp.append(s.SNAPSHOT_DATA_COLLECTOR_TYPE).append(s.SNAPSHOT_DATA_COLLECTOR_TYPE_VALUES[a]);
                    cnt++;
                    fnd=true;
                }
            }
                // If we did not find it, then what ?
            
            if(cnt > 0) bud.append(ddp.toString());
        }
        
        
        return bud.toString();
    }
    
    
}

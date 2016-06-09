/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

/**
 *
 * @author gilbert.solorzano
 */
public class AppExportS {
    
    
    public static final String _U="";
    public static final String VE=" = ";
    public static final String VS=" :: ";
    public static final String L0="\n";
    public static final String L0_1="\n   ";
    public static final String L1="\n\t";
    public static final String L1_1="\n\t   ";
    public static final String L2="\n\t\t";
    public static final String L2_1="\n\t\t   ";
    public static final String L3="\n\t\t\t";
    public static final String L3_1="\n\t\t\t   ";
    public static final String L4="\n\t\t\t\t";
    public static final String L4_1="\n\t\t\t\t   ";
    public static final String L5="\n\t\t\t\t\t";
    public static final String L5_1="\n\t\t\t\t\t   ";
    public static final String L6="\n\t\t\t\t\t\t";
    public static final String L6_1="\n\t\t\t\t\t\t   ";
    public static final String L7="\n\t\t\t\t\t\t\t ";
    public static final String L7_1="\n\t\t\t\t\t\t\t   ";
    public static final String L8="\n\t\t\t\t\t\t\t\t ";
    public static final String L8_1="\n\t\t\t\t\t\t\t\t   ";
    public static final String L9="\n\t\t\t\t\t\t\t\t\t ";
    public static final String L9_1="\n\t\t\t\t\t\t\t\t\t   ";
    public static final String L10="\n\t\t\t\t\t\t\t\t\t\t ";
    public static final String L10_1="\n\t\t\t\t\t\t\t\t\t\t   ";
    public static final String L11="\n\t\t\t\t\t\t\t\t\t\t\t ";
    public static final String L11_1="\n\t\t\t\t\t\t\t\t\t\t\t   ";
    public static final String L12="\n\t\t\t\t\t\t\t\t\t\t\t\t ";
    public static final String L12_1="\n\t\t\t\t\t\t\t\t\t\t\t\t   ";
    public static final String[] I={L0,L1,L1_1,L2,L2_1,L3,L3_1,L4,L4_1,L5,L5_1,L6,L6_1,L7,L7_1,L8,L8_1,L9,L9_1,L10,L10_1,L11,L11_1,L12,L12_1};
    public static final String S4="    ";
    public static final String TRUE="true";
    public static final String FALSE="false";
    public static final String ZERO="0";
    
    public static final String EJB_NAME="ejb-name";
    public static final String EJB_RULE="ejb-rule";
    public static final String APPLICATION="application";
    public static final String CONTROLLER_VERSION="controller-version";
    public static final String NAME="name";
    public static final String DESCRIPTION="description";
    public static final String ENV_PROPERTIES="env-properties";
    public static final String SRC=" ====SRC ";
    public static final String DEST=" ===DEST ";
    
    public static final String CUSTOM_DASHBOARD_VERSION="custom-dashboard-version";
    public static final String CUSTOM_DASHBOARD="custom-dashboard";
    public static final String HEIGHT="height";
    public static final String WIDTH="'width";
    public static final String CONFIGURATION="configuration";
    public static final String APPLICATION_INSTRUMENTATION_LEVEL="application-instrumentation-level";
    public static final String SNAPSHOT_EVALUATION_INTERVAL="snapshot-evaluation-interval";
    public static final String SNAPSHOT_QUIET_TIME_POST_SLA_FAILURE="snapshot-quiet-time-post-sla-failure";
    public static final String POLICY_ENGINE_ENABLED="policy-engine-enabled";
    public static final String CALL_GRAPH="call-graph";
    public static final String SAMPLING_RATE="sampling-rate";
    public static final String RAW_SQL="raw-sql";
    public static final String EXCLUDE_PACKAGES="exclude-packages";
    public static final String INCLUDE_PACKAGES="include-packages";
    public static final String MIN_DURATION_FOR_DB_CALLS="min-duration-for-db-calls";
    public static final String HOTSPOTS_ENABLED="hotspots-enabled";
    public static final String SLA="sla";
    public static final String ART="art";
    public static final String EPM="epm";
    public static final String ENABLED="enabled";
    public static final String CRITICAL="critical";
    public static final String WARNING="warning";
    public static final String BACKGROUND_BUSINESS_TRANSACTION_CONFIG="background-business-transaction-config";
    public static final String SNAPSHOT_COLLECTION_POLICY="snapshot-collection-policy";
    public static final String MINUTE_FREQUENCY="minute-frequency";
    public static final String NTH_OCCURANCE="nth-occurance";
    public static final String SLA_VIOLATION="sla-violation";
    public static final String COLLECT_OUTLIERS_ONLY="collect-outliers-only";
    public static final String DURATION="duration";
    public static final String MAX_ATTEMPTS_FOR_OUTLIERS="max-attempts-for-outliers";
    public static final String WARNING_VIOLATION="warning-violation";
    public static final String AUTOMATIC_COLLECTION_ENABLED="automatic-collection-enabled";
    public static final String AUTOMATIC_SLOW_VOLUME_PERCENTAGE_THRESHOLD="automatic-slow-volume-percentage-threshold";
    public static final String AUTOMATIC_ERROR_VOLUME_PERCENTAGE_THRESHOLD="automatic-error-volume-percentage-threshold";
    public static final String BT_REQUEST_THRESHOLD="bt-request-threshold";
    public static final String STARTING_NODE_SLOW_THRESHOLD="starting-node-slow-threshold";
    public static final String EVALUATION_TYPE="evaluation-type";
    public static final String EVALUATION_MINS="evaluation-mins";
    public static final String STANDARD_DEVIATION_THRESHOLD="standard-deviation-threshold";
    public static final String PERCENTAGE_THRESHOLD="percentage-threshold";
    public static final String STATIC_THRESHOLD_IN_MILLIS="static-threshold-in-millis";
    public static final String CONTINUING_SEGMENT_SLOW_THRESHOLD="continuing-segment-slow-threshold";
    public static final String EXIT_CALL_SLOW_THRESHOLD="exit-call-slow-threshold";
    public static final String STARTING_NODE_EXTREMELY_SLOW_THRESHOLD="starting-node-extremely-slow-threshold";
    public static final String STALL_CONFIGURATION="stall-configuration";
    public static final String ABSOLUTE="absolute";
    public static final String ABSOLUTE_TIME_IN_SECS="absolute-time-in-secs";
    public static final String BT_SLA_VIOLATION_MULTIPLIER="bt-sla-violation-multiplier";
    public static final String BUSINESS_TRANSACTION_CONFIG="business-transaction-config";
    public static final String ERROR_CONFIGURATION="error-configuration";
    public static final String DETECT_PHP_ERRORS="detect-php-errors";
    public static final String PHP_ERROR_LEVEL="php-error-level";
    public static final String DISABLE_SYSTEM_TRACE="disable-system-trace";
    public static final String DISABLE_EVENT_LOG="disable-event-log";
    public static final String DISABLE_N_LOG="disable-n-log";
    public static final String DISABLE_LOG4NET_LOGGING="disable-log4net-logging";
    public static final String DISABLE_DEFAULT_HTTP_ERROR_CODE="disable_default_http_error_code";
    public static final String IGNORE_EXCEPTIONS="ignore-exceptions";
    public static final String IGNORE_LOGGER_NAME="ignore-logger-names";
    public static final String IGNORE_EXCEPTION_MSG_PATTERNS="ignore-exception-msg-patterns";
    public static final String IGNORE_LOGGER_MSG_PATTERNS="ignore-logger-msg-patterns";
    public static final String CAPTURE_LOGGER_ERROR_AND_FATAL_MESSAGE="capture-logger-error-and-fatal-messages";
    public static final String CUSTOM_LOGGER_DEFINITION="custom-logger-definition";
    public static final String MAX_FRAMES_IN_ROOT_CAUSE="max-frames-in-root-cause";
    public static final String STACK_TRACE_LINE_LIMIT="stack-trace-line-limit";
    public static final String MARK_TRANACTION_AS_ERROR_ON_ERROR_MESSAGE="mark-transaction-as-error-on-error-message-log-tag";
    public static final String ASYNC_ACTIVITY_SUPPORTED="async-activity-supported";
    public static final String DISABLE_JAVA_LOGGING="disable-java-logging";
    public static final String DISABLE_LOG4J_LOGGING="disable-log4j-logging";
    public static final String JAVA_APP_AGENT="java-app-agent";
    public static final String DOTNET_APP_AGENT="dotnet-app-agent";
    public static final String PHP_APP_AGENT="php-app-agent";
    public static final String NODEJS_APP_AGENT="nodejs-app-agent";
    public static final String DISABLE="disable";
    public static final String ERROR_REDIRECT_PAGE="error-redirect-page";
    public static final String HTTP_ERROR_RETURN_CODE="http-error-return-code";
    public static final String LOWER_BOUND="lower-bound";
    public static final String UPPER_BOUND="upper-bound"; 
    public static final String[] SLOWTHRESHOLD_TYPES={"STANDARD_DEVIATION","STATIC","PERCENTAGE_DEVIATION"};
    
    
    /*
     * 
     */
    
    
    public static final String EUM_CONFIGURATION="eum-configuration";
    public static final String EXTERNAL_JS_FETCH_RUL="external-js-fetch-url";
    public static final String HEART_BEAT_URL="heart-beat-url";
    public static final String AUTOMATIC="automatic";
    public static final String FRAMEWORKS_TO_ENABLE_ATTRIBUTE_INJECTION="frameworks-to-enable-attribute-injection";
    public static final String MANUAL="manual";
    public static final String EUM_PARSER_RULES="eum-parser-rules";
    public static final String EUM_INJECTION_RULES="eum-injection-rules";
    public static final String EXCLUDE_RULES="exclude-rules";
    public static final String INCLUDE_RULES="include-rules";
    public static final String EUM_CLOUD_APPLICATION_KEY="eum-cloud-application-key";
    public static final String EUM_BEACON_URL="eum-beacon-url";
    public static final String EUM_JS_URL="eum-js-url";
    public static final String EUM_TARGET_TIERS="eum-target-tiers";
    public static final String ENABLE_FOR_ANALYTICS="enabled-for-analytics";
    public static final String ENABLE_FOR_APM="enabled-for-apm";
    
    
    public static final String DATA_GATHERER_CONFIGS="data-gatherer-configs";
    public static final String HTTP_DATA_GATHERER_CONFIG="http-data-gatherer-config";
    public static final String ATTACH_TO_NEW_BTS="attach-to-new-bts";
    public static final String PARAMETERS="parameters";
    public static final String PARAMETER="parameter";
    public static final String HEADERS="headers";
    public static final String HEADER="header";
    public static final String GATHER_URL="gather-url";
    public static final String GATHER_SESSION_ID="gather-session-id";
    public static final String GATHER_USER_PRINCIPAL="gather-user-principal";
    public static final String SQL_DATA_GATHERER_CONFIG="sql-data-gatherer-config";
    public static final String MATCH_TYPE="match-type";
    public static final String MATCH_PATTERN="match-pattern";
    public static final String INVERSE="inverse";
    
    /* Businnes transaction group */
    public static final String BUSINESS_TRANSACTION_GROUPS="business-transaction-groups";
    public static final String BUSINESS_TRANSACTION_GROUP="business-transaction-group";
    public static final String MEMBERS="members";
    /* Need application component */
    public static final String APPLICATION_COMPONENTS="application-components";
    public static final String APPLICATION_COMPONENT="application-component";
    
    /* Need business transaction */
    public static final String BUSINESS_TRANSACTION_COMPONENTS="business-transaction-components";
    
    public static final String ENTRY_MATCH_POINT_CONFIGURATIONS="entry-match-point-configurations";
    public static final String ENTRY_MATCH_POINT_CONFIGURATION="entry-match-point-configuration";
    public static final String TRANSACTION_CONFIGURATIONS="transaction-configurations";
    public static final String TRANSACTION_ENTRY_POINT_TYPE="transaction-entry-point-type";
    public static final String ENABLE="enable";
    public static final String DISCOVERY_CONFIG="discovery-config";
    public static final String DISCOVERY_CONFIG_ENABLED="discovery-config-enabled";
    public static final String DISCOVERY_RESOLUTION="discovery-resolution";
    public static final String IDENTITY_NAME="identity-name";
    public static final String BACKEND_DISCOVERY_CONDITIONS="backend-discovery-conditions";
    public static final String BACKEND_DISCOVERY_CONDITION="backend-discovery-condition";
    public static final String APPLICATION_COMPONENT_NODE="application-component-node";
    public static final String APPLICATION_COMPONENT_NODES="application-component-nodes";
    
    
    
    public static final String BACKEND_MATCH_POINT_CONFIGURATIONS="backend-match-point-configurations"; 
    public static final String BACKEND_MATCH_POINT_CONFIGURATION="backend-match-point-configuration";
    public static final String CUSTOM_EXIT_POINT_DEFINITION="custom-exit-point-definition";
    public static final String BACKEND_DISCOVERY_CONFIGURATIONS="backend-discovery-configurations";
    public static final String BACKEND_DISCOVERY_CONFIGURATION="backend-discovery-configuration";
    public static final String BACKEND_IDENTITY_OPTIONS="backend-identity-options";
    public static final String BACKEND_IDENTITY_OPTION="backend-identity-option";
    public static final String NAMING_OPTIONS="naming-options";
    public static final String NAME_VALUE="name-value";
    public static final String VALUE="value";
    public static final String DISCOVERY_ENABLED="discovery-enabled";
    public static final String CORRELATION_ENABLED="correlation-enabled";
    public static final String SUPPORTS_CORRELATION="supports-correlation";
    public static final String PRIORITY="priority";
    public static final String EXIT_POINT_TYPE="exit-point-type";//exitPointType
    
    
    public static final String METRIC_BASELINES="metric-baselines";
    public static final String METRIC_BASELINE="metric-baseline";
    public static final String SEASONALITY="seasonality";
    public static final String FIXED="fixed";
    public static final String IS_DEFAULT="is-default";
    public static final String ALL_DATE="all-date";
    public static final String NUMBER_OF_DAYS="number-of-days";
    
    /* Need to create info points  */
    public static final String INFO_POINT_GATHERER_CONFIGS="info-point-gatherer-configs";
    public static final String INFO_POINT_GATHERER_CONFIG="info-point-gatherer-config";
    
    /* Need to create tasks */
    public static final String TASKS="tasks";
    
    /* Need to create workflows */
    public static final String WORKFLOWS="workflows";
    
    /* For agent configuration you will different xml structures for properties 
     * depending on the type String, Boolean, Integer...
     */
    public static final String AGENT_CONFIGURATIONS="agent-configurations";
    public static final String AGENT_CONFIGURATION="agent_configuration";
    public static final String OVERRIDE="override";
    public static final String AGENT_TYPE="agent-type";
    public static final String PROPERTY_DEFINITIONS="property-definitions";
    public static final String PROPERTY_DEFINITION="property-definition";
    public static final String TYPE="type";
    public static final String REQUIRED="required";
    public static final String DEFAULT_STRING_VALUE="default-string-value";
    public static final String UPPER_NUMERIC_BOUND="upper-numeric-bound";
    public static final String LOWER_NUMERIC_BOUND="lower-numeric-bound";
    public static final String STRING_MAX_LENGTH="string-max-length";
    public static final String ALLOWED_STRING_VALUES="allowed-string-values";
    public static final String PROPERTIES="properties";
    public static final String PROPERTY="property";
    public static final String STRING_VALUE="string-value";
    public static final String INTEGER_TYPE="INTEGER";
    public static final String STRING_TYPE="STRING";
    public static final String BOOLEAN_TYPE="BOOLEAN";
    
    
    public static final String EUM_CLOUD_CONFIG="eum-cloud-config";
    public static final String APPLICATION_DIAGNOSTIC_DATA="application-diagnostic-data";
    public static final String SUMMARY="summary";
    public static final String DIAGNOSTIC_TYPE="diagnostic-type";
    public static final String KEY="key";
    public static final String EXCLUDE_CONFIG="exclude-config";
    public static final String PAGE_CONFIG="page-config";
    public static final String PAGE_CONFIG_VERSION="page-config-version";
    
    // Policy Violation & Event
    public static final String POLICY_VIOLATIONS="policy-violations";
    public static final String POLICY_VIOLATION="policy-violation";
    public static final String START_TIME_IN_MILLIS="startTimeInMillis";
    public static final String DETECTED_TIME_IN_MILLIS="detectedTimeInMillis";
    public static final String END_TIME_IN_MILLIS="endTimeInMillis";
    public static final String INCIDENT_STATUS="incidentStatus";
    public static final String SEVERITY="severity";
    public static final String TRIGGERED_ENTITY_DEFINITION="triggeredEntityDefinition";
    public static final String AFFECTED_ENTITY_DEFINITION="affectedEntityDefinition";
    public static final String ENTITY_TYPE="entityType";
    public static final String ENTITY_ID="entityId";
    public static final String DEEP_LINK_URL="deepLinkUrl";
    public static final String EVENT="event";
    public static final String EVENTS="events";
    public static final String EVENT_TIME="eventTime";
    public static final String ARCHIVED="archived";
    public static final String MARKED_AS_RESOLVED="markedAsResolved";
    public static final String MARKED_AS_READ="markedAsRead";
    public static final String AFFECTED_ENTITIES="affectedEntities";
    public static final String ENTITY_DEFINITION="entity-definition";
    
    //Backends
    public static final String BACKENDS="backends";
    public static final String BACKEND="backend";
    public static final String APPLICATION_COMPONENT_NODE_ID="applicationComponentNodeId";
    public static final String TIER_ID="tierId";
    public static final String BC_EXIT_POINT_TYPE="exitPointType";
    
    public static final String CUSTOM_EXIT_POINT_DEFINITIONS="custom-exit-point-definitions";
    
    public static final String BT_REQUEST_THRESHOLDS="bt-request-thresholds";
    
    public static final String DYNAMIC_SCALING_ENABLED="dynamic-scaling-enabled";
    /*
     * <error-configuration agent-type="php-app-agent">
            <detect-php-errors>true</detect-php-errors>
            <php-error-level>ERROR</php-error-level>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions/>
            <ignore-logger-names/>
            <capture-logger-error-and-fatal-messages>false</capture-logger-error-and-fatal-messages>
            <max-frames-in-root-cause>0</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>
     */
    

    public static final String DATA_GATHERER_CONFIG="data-gatherer-config";

    public static final String METHOD_INVOCATION_DATA_GATHERER_CONFIG="method-invocation-data-gatherer-config";
    public static final String GATHERER_TYPE="gatherer-type";
    public static final String POSITION="position";
    public static final String TRANSFORMER_TYPE="transformer-type";
    public static final String INFO_POINT_METRIC_DEFINITION="info-point-metric-definition";
    public static final String METHOD_NAME="method-name";
    public static final String METHOD_PARAMETER_TYPES="method-parameter-types";
    public static final String METHOD_PARAMETER_TRANSFORMER="method-parameter-transformer";
    public static final String POJO_METHOD_DEFINITION="pojo-method-definition";
    public static final String POJO_DATA_GATHERER_CONFIG="pojo-data-gatherer-config";
    public static final String ROLLUP_TYPE="rollup-type";
    public static final String INSTRUMENTATION_POINT="instrumentation-point";
    public static final String APPLY_TO_ALL_BTS="apply-to-all-bts";
    public static final String MATCH_CONDITION="match-condition";
    public static final String TRANSFORMER_VALUE="transformer-value";
   
    
    
    /* Need application component */
 //   public static final String APPLICATION_COMPONENT="application-component";
    public static final String NAMING_CONFIG="naming-config";
    public static final String SCHEME="scheme";
    public static final String BUSINESS_TRANSACTIONS="business-transactions";
    public static final String BUSINESS_TRANSACTION="business-transaction";
    public static final String BUSINESS_TRANSACTION_NAME="business-transaction-name";
    public static final String BACKGROUND="background";
    public static final String ENABLED_FOR_EUM="enabled-for-eum";
    public static final String EUM_AUTO_ENABLE_POSSIBLE="eum-auto-enable-possible";
    public static final String MEMORY_CONFIGURATION="memory-configuration";
    public static final String SIZE_POLLING_INTERVAL="size-polling-interval";
    public static final String ENABLE_CACHE_FRAMEWORK_SIZE_MONITORING="enable-cache-framework-size-monitoring";
    public static final String ENABLE_MEMORY_MONITORING="enable-memory-monitoring";
    public static final String CACHE_CONFIGURATION="cache-configuration";
    public static final String DISABLE_CACHE_MONITORING="disable-cache-monitoring";
    public static final String DISABLE_STANDARD_CACHE_FRAMEWORKS="disable-standard-cache-frameworks";
    public static final String COMPONENT_TYPE="component-type";
    public static final String INSTANCE_TRACKER_CONFIGURATIONS="instance-tracker-configurations";
    public static final String CUSTOM_CACHE_CONFIGURATIONS="custom-cache-configurations";
    

    public static final String EXCLUDES="excludes";
    public static final String CLASS_NAME="class-name";
    public static final String FILTER_TYPE="filter-type";
    public static final String FILTER_VALUE="filter-value";
    public static final String DISPLAY_NAME="display-name";
    
    
    public static final String NAME_VALUES="name-values";
    public static final String EXCLUDE="exclude";
    public static final String SERVLET_RULE="servlet-rule";
    
    public static final String PERCENTILE_VALUE="percentile-value";
    public static final String PERCENTILE_VALUES="percentile-values";
    public static final String PERCENTILE_CONFIG="percentile-config";
    
    /*
     * Custom Match Rule
     */
    public static final String CUSTOM_MATCH_POINT_DEFINITIONS="custom-match-point-definitions";
    public static final String CUSTOM_MATCH_POINT_DEFINITION="custom-match-point-definition";
    public static final String CUSTOM_BUSINESS_TRANSACTION_NAME="custom-business-transaction-name";
    public static final String MATCH_RULE="match-rule";
    public static final String POJO_RULE="pojo-rule";
    public static final String POCO_RULE="poco-rule";
    public static final String WEB_RULE="web-rule";
    public static final String ASP_DOTNET_RULE="asp-dotnet-rule";
    public static final String MATCH_CLASS="match-class";
    public static final String SPLIT_CONFIG="split-config";
    public static final String MATCH_METHOD="match-method";
    public static final String NAMING_ACTIONS="naming-actions";
    public static final String OPERATION="operation";
    public static final String URI="uri";
    public static final String SERVLET_NAME="servlet-name";
    public static final String HOST="host";
    public static final String PORT="port";
    public static final String HTTP_METHOD="http-method";
    public static final String GENERIC_METHOD_CONFIG="generic-method-config";
    public static final String COOKIE="cookie";
    public static final String COOKIES="cookies";
    public static final String METHOD_CONFIG="method-config";
    public static final String RETURN_TYPE="return-type";
    
    /*
     *  Health Rules
     * 
     */
    
    
    public static final String AFFECTED_BT_MATCH_CRITERIA="affected-bt-match-criteria";
    public static final String AFFECTED_INFRA_MATCH_CRITERIA="affected-infra-match-criteria";
    public static final String AFFECTED_ENTITIES_MATCH_CRITERIA="affected-entities-match-criteria";
    public static final String AFFECTED_ADD_MATCH_CRITERIA="affected-add-match-criteria";
    public static final String WAIT_TIME_MIN="wait-time-min";
    public static final String DURATION_MIN="duration-min";
    public static final String ALWAYS_ENABLED="always-enabled";
    public static final String FUNCTION_TYPE="function-type";
    public static final String CONDITION_1="condition1";
    public static final String CONDITION_2="condition2";
    public static final String CONDITION_3="condition3";
    public static final String CONDITION_4="condition4";
    public static final String NODE_MATCH_CRITERIA="node-match-criteria";
    public static final String NODE_META_INFO_MATCH_CRITERIA="node-meta-info-match-criteria";
    public static final String VM_SYS_PROPERTIES="vm-sys-properties";
    public static final String HEALTH_RULE="health-rule";
    public static final String HEALTH_RULES="health-rules";
    public static final String NODE_TYPES="node-types";
    public static final String NODE_TYPE="node-type";
    public static final String COMPONENTS="components";
    public static final String NODES="nodes";
    public static final String ADD_TYPES="add-types";
    public static final String ADD_TYPE="add-type";
    public static final String NODE_UNIQUE_LOCAL_ID="node-unique-local-id";
   
    /*
     *  Object Import Export
     */
    public static final String TRANSACTION_DETECTION_ENABLED="transaction-detection-enabled";
    public static final String AUTO_DISCOVERY_CONFIG="auto-discovery-config";
    public static final String AUTO_DISCOVERY="auto-discovery";
    public static final String METRIC_DEFINITION="metric-definition";
    public static final String LOGICAL_METRIC_NAME="logical-metric-name";
    public static final String METRIC_EXPRESSION="metric-expression";
    public static final String IS_LITERAL_EXPRESSION="is-literal-expression";
    public static final String CONDITION_VALUE_TYPE="condition-value-type";
    public static final String CONDITION_VALUE="condition-value";
    public static final String OPERATOR="operator";
    public static final String CONDITION_EXPRESSION="condition-expression";
    public static final String USE_ACTIVE_BASELINE="use-active-baseline";
    public static final String POLICY_CONDITION="policy-condition";
    public static final String ENTITY_AGGREGATION_SCOPE="entity-aggregation-scope";
    public static final String CRITICAL_EXECUTION_CRITERIA="critical-execution-criteria";
    public static final String WARNING_EXECUTION_CRITERIA="warning-execution-criteria";
    public static final String SCHEDULE="schedule";
    public static final String OVERALL_AFFECTED_ENTITIES_MATCH_CRITERIA="overall-affected-entities-match-criteria";
    //public static final String 
    /*
     * This will help build xml structures
     */
    
    public static final String XO="<";
    public static final String XC=">";
    public static final String XCT="/>";
    public static final String XT="</";
    public static final String Q_="\"";
    public static final String VE_="=";
    
    public static String XOpen(String xmlType){
        return new StringBuilder().append(XO).append(xmlType).append(XC).toString();
    }
    
    public static String XOpenPosition(int position, String xmlType){
        return new StringBuilder().append(I[position]).append(XO).append(xmlType).append(XC).toString();
    }
    
    public static String XOpenAttr(String xmlType){
        return new StringBuilder().append(XO).append(xmlType).toString();
    }
    
    public static String XClose(String xmlType){
        return new StringBuilder().append(XT).append(xmlType).append(XC).toString();
    }
    
    public static String XClosePosition(int position,String xmlType){
        return new StringBuilder().append(I[position]).append(XT).append(xmlType).append(XC).toString();
    }
    
    public static String XElement(int position, String xmlType, String value){
        StringBuilder bud = new StringBuilder();
        bud.append(I[position]);
        bud.append(XOpen(xmlType)).append(value).append(XClose(xmlType));
        
        return bud.toString();
    }
    
    public static String XElement(int position, String xmlType, boolean value){
        if(value){
            return XElement(position,xmlType,TRUE);
        }else{
            return XElement(position,xmlType,FALSE);
        }
        
    }
    
    public static String XElement(int position, String xmlType, Integer value){
        return XElement(position,xmlType,value.toString());
    }
    
    public static String XElement(int position, String xmlType, Double value){
        return XElement(position,xmlType,value.toString());
    }
    
    public static String XAttribute(String name, String value){
        return new StringBuilder().append(" ").append(name).append(VE_).append(Q_).append(value).append(Q_).toString();
    }
            
}

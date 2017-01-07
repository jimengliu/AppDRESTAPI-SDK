package org.appdynamics.appdrestapi.data;

/**
 * These types, in combination with event subTypes and RSDs, need to clear and understandable to the end user and fit
 * into a category in the Unified Event Model (summer12 release).
 *
 * Unified Event Model - High Level Categories:
 *
 * Every event visible to the end user should be in one of the following categories.  Any new event that is to be added must be added to a category,
 * and code used by the events feature in the UI will need to be updated!
 *
 * Policy Violations
 * Slow Requests / Slow Response Times
 * Errors
 * Application Changes
 * Code Problems
 * Server Problems
 * AppDynamics Configuration Warnings
 * AppDynamics Internal Diagnostics
 * AppDynamics Data
 * Custom Events
 */
public enum EventType {

    /**
     * This is the old error event.  Was used for RSDs that have errors.  May still be used to hack notifications off error RSDS.
     *
     * Unified Event Model Category:  NA (not visible in UI)
     *
     * UI Display Name: Business Transaction Error
     *
     * Notes:
     * This enum value is referenced directly in the velocity email templates - Do not remove it!
     * @deprecated
     */
    ERROR,

    /**
     * This is thrown when the agent detects and error NOT during a BT (no BT id on thread).
     *
     * Unified Event Model Category: ERROR
     *
     * UI Display Name: Application Server Exception
     */
    APPLICATION_ERROR,

    /**
     * This was used by agent for things like connection pools reaching their limit, etc.  It is no longer user.
     *
     * Unified Event Model Category:  NA (not visible in UI)
     *
     * Display Name: NA
     * @deprecated
     */
    APPLICATION_INFO,

    /**
     * Old stall request event. Still used by the alert digest mechanism.
     *
     * Unified Event Model Category:  NA (not visible in UI)
     *
     * Display Name: Transaction Stall
     */
    STALL,

    /**
     * Old event for when a BT was slower than thresholds.  No longer used.
     *
     * Unified Event Model Category:  NA (not visible in UI)
     *
     * Display Name: Slow Business Transaction
     * @deprecated
     */
    BT_SLA_VIOLATION,

    /**
     * Code deadlock detected by Agent.
     *
     * Unified Event Model Category:  Code Problems
     *
     * Display Name: Code Deadlock
     */
    DEADLOCK,

    /**
     * Not currently used.  When used it goes in code problems.
     *
     * Unified Event Model Category:  Code Problems.
     *
     * Display Name: Memory Leak
     */
    MEMORY_LEAK,

    /**
     * Internal event agent sends with mem leak data.  UI uses this on the memory monitoring screens for a nodes (ALC, OIT, CMS)
     *
     * Unified Event Model Category:  AppDynamics Data (not visible in UI)
     *
     * Display Name: Memory Leak Diagnostics
     */
    MEMORY_LEAK_DIAGNOSTICS,

    /**
     * Not used currently.
     *
     * Unified Event Model Category: Code Problems
     *
     * Display Name: Low Heap Memory
     *
     * TODO - should this be in Server Problems?
     */
    LOW_HEAP_MEMORY,

    /**
     * Old event was used for policy violations
     *
     * Unified Event Model Category:  NA (not visible in events view)
     *
     * Display Name: [display name use in the UI, emails, etc]
     * @deprecated
     */
    ALERT,

    /**
     * Custom Events thrown by API calls using REST or machine agent API.
     *
     * Unified Event Model Category:  Custom
     *
     * Display Name: Custom
     */
    CUSTOM,

    /**
     * App Server Restart
     *
     * Unified Event Model Category:  Application Changes
     *
     * Display Name: App Server Restart
     */
    APP_SERVER_RESTART,

    /**
     * CLR Crash
     *
     * Unified Event Model Category:  AD Infrastructure events
     *
     * Display Name: CLR Crash
     */
    CLR_CRASH,

    /**
     * Old slow BT event.  Not used anymore.
     *
     * Unified Event Model Category:  NA - not visible in events view
     *
     * Display Name: Slow Business Transaction
     * @deprecated
     */
    BT_SLOW,

    /**
     * We use them right now for events that happen during workflow execution.
     *
     * Unified Event Model Category:  AppDynamics Data
     *
     * Display Name: Automation Event
     */
    SYSTEM_LOG,

    /**
     * Bytecode Transformer Log
     *
     * Unified Event Model Category:  AppDynamics Internal Diagnostics
     *
     * Display Name: Bytecode Transformer Log
     */
    INFO_INSTRUMENTATION_VISIBILITY,

    /**
     * Internal events
     *
     * Unified Event Model Category:  AppDynamics Internal Diagnostics
     *
     * Display Name: Agent Event
     */
    AGENT_EVENT,

    /**
     * DB agent event.
     * Fired when DBMS server parameters get changed.
     */
    DB_SERVER_PARAMTER_CHANGE,

    /**
     * No longer used.
     *
     * Unified Event Model Category:  NA - not visible in event view
     *
     * Display Name: Periodic Request Snapshot
     * @deprecated
     */
    INFO_BT_SNAPSHOT,

    /**
     * This is thrown when the agent is enabled or disabled
     *
     * Unified Event Model Category:  AppDynamics Internal Diagnostics
     *
     * Display Name: Agent Enabled / Disabled
     */
    AGENT_STATUS,

    /**
     * No longer used.  This was the old diagnostic session event.
     *
     * Unified Event Model Category:  NA - not visible in event view
     *
     * Display Name: Series of Slow Requests for a Transaction
     * @deprecated
     */
    SERIES_SLOW,

    /**
     * No longer used.  This was the old diagnostic session event..
     *
     * Unified Event Model Category:  NA - not visible in event view
     *
     * Display Name: Series of Errors for a Transaction
     * @deprecated
     */
    SERIES_ERROR,

    /**
     * Internal Event sent by agent with activity traces
     *
     * Unified Event Model Category:   AppDynamics data (not visible in UI, unless in debug mode)
     *
     * Display Name: NA
     */
    ACTIVITY_TRACE,

    /**
     * Internal Event sent by agent with object content summary for collections, caches
     *
     * Unified Event Model Category:   AppDynamics data (not visible in UI, unless in debug mode)
     *
     * Display Name: NA
     */
    OBJECT_CONTENT_SUMMARY,

    /**
     * Diagnostic session.  There are several subTypes for this.
     *
     * Unified Event Model Category:  AppDynamics Internal Diagnostics
     *
     * Display Name: Diagnostic Session
     */
    DIAGNOSTIC_SESSION,

    /**
     * Unsed for now.
     *
     * Unified Event Model Category:  NA - not visible in events view
     *
     * Display Name: High End to End Message Latency
     */
    HIGH_END_TO_END_LATENCY,

    /**
     * Thrown when application parameters change, like JVM options, etc.
     *
     * Unified Event Model Category:  Application Changes
     *
     * Display Name: Application Configuration Change
     */
    APPLICATION_CONFIG_CHANGE,

    /**
     * This is injected by user / REST API.
     *
     * Unified Event Model Category:  Application Changes
     *
     * Display Name: Application Deployment
     */
    APPLICATION_DEPLOYMENT,

    /**
     * Diagnostics for agent activity (BT overflow, HTTP error code diagnostics, etc)
     *
     * Unified Event Model Category:  AppDynamics Data
     * NOTE!!!! Despite calling this AGENT_DIAGNOSTICS, it is in the DATA category!!! (legacy reasons)
     *
     * Display Name: Agent Diagnostics
     */
    AGENT_DIAGNOSTICS,

    /**
     * This used for sending events for automatic leak detection, custom memory structers,
     *
     * Unified Event Model Category:  AppDynamics Data
     *
     * Display Name: AppDynamics data
     */
    MEMORY,

    /**
     * This is thrown when the license is expired
     *
     * Unified Event Model Category:  AppDynamics Configuration Warnings
     *
     * Display Name: License Expired
     */
    LICENSE,

    /**
     * Agent Version is newer than Controller version
     *
     * Unified Event Model Category:  AppDynamics Configuration Warnings
     *
     * Display Name: Agent Version is newer than Controller version
     */
    CONTROLLER_AGENT_VERSION_INCOMPATIBILITY,

    /**
     * Agent has a configuration error
     *
     * Unified Event Model Category:  AppDynamics Configuration Warnings
     *
     * Display Name: Agent Configuration error
     */
    AGENT_CONFIGURATION_ERROR,

    /**
     * This is thrown when the controller event upload limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_EVENT_UPLOAD_LIMIT_REACHED,

    /**
     * This is thrown when the controller RSD upload limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_RSD_UPLOAD_LIMIT_REACHED,

    /**
     * This is thrown when the controller PSD upload limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_PSD_UPLOAD_LIMIT_REACHED,

    /**
     * This is thrown when the controller metric registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_METRIC_REG_LIMIT_REACHED,

    /**
     * This is thrown when the controller metric data buffer overflows.
     *
     * Display Name: NA
     */
    CONTROLLER_METRIC_DATA_BUFFER_OVERFLOW,

    /**
     * This is thrown when the controller ERROR ADD registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_ERROR_ADD_REG_LIMIT_REACHED,

    /**
     * This is thrown when the controller ASYNC (THREAD) ADD registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_ASYNC_ADD_REG_LIMIT_REACHED,

    /**
     * This is thrown when the controller STACK_TRACE ADD registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_STACKTRACE_ADD_REG_LIMIT_REACHED,

    /**
     * This is thrown when the controller MEMORY ADD registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_MEMORY_ADD_REG_LIMIT_REACHED,

    /**
     * This is thrown when the controller TRACKED_OBJECT ADD registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_TRACKED_OBJECT_ADD_REG_LIMIT_REACHED,

    /**
     * This is thrown when the controller COLLECTIONS ADD registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_COLLECTIONS_ADD_REG_LIMIT_REACHED,

    /**
     * This is thrown when the controller SERVICE_ENDPOINT ADD registration limit has been reached for an account.
     *
     * Display Name: NA
     */
    CONTROLLER_SEP_ADD_REG_LIMIT_REACHED,

    /**
     * This is thrown when the agent metric registration limit has been reached.
     *
     * Display Name: NA
     */
    AGENT_METRIC_REG_LIMIT_REACHED,

    AGENT_ADD_BLACKLIST_REG_LIMIT_REACHED,

    AGENT_ASYNC_ADD_REG_LIMIT_REACHED,

    AGENT_ERROR_ADD_REG_LIMIT_REACHED,

    AGENT_METRIC_BLACKLIST_REG_LIMIT_REACHED,

    /**
     * Thrown when the controller is running out of disk space
     *
     * Unified Event Model Category:  AppDynamics Configuration Warnings
     *
     * Display Name: Controller Disk Space Low
     */
    DISK_SPACE,

    /**
     * XResponder.handleGeneralServerFaultEvent will report failures as events with that type
     *
     * Unified Event Model Category:  AppDynamics Internal Diagnostics
     *
     * Display Name: Controller API Call Threw an Exception
     */
    INTERNAL_UI_EVENT,

    /**
     * These events are an internal mechanism use to send data from the agent to controller to UI.  They are not user facing.  Ideally, things like
     * BTOverflowDetails and MemoryLeakDiagnostics shoudl be move into this bucket.
     *
     * Unified Event Model Category:  AppDynamics Data
     *
     * Display Name: NA
     */
    APPDYNAMICS_DATA,

    /**
     * Unified Event Model Category:  AppDynamics Internal Diagnostics
     *
     * Display Name: NA
     */
    APPDYNAMICS_INTERNAL_DIAGNOSTICS,

    /**
     * Placeholder for now.  Not used.
     *
     * Unified Event Model Category:  AppDynamics Configuration Warnings
     *
     * Display Name: NA
     */
    APPDYNAMICS_CONFIGURATION_WARNINGS,

    /**
     * These are shown at bottom of Azure auto scaling screen.  Internal mechanism to show progress with UI.
     * Do not modify this Enum. Azure autoscaling will fail.
     *
     * Unified Event Model Category:  AppDynamics Data (not visible in UI)
     *
     * Display Name: Azure Auto-Scaling
     */
    AZURE_AUTO_SCALING,

    /**
     * We have decided to split this into two different events POLICY_OPEN_WARNING
     * and POLICY_OPEN_CRITICAL
     * @deprecated
     */
    POLICY_OPEN,

    POLICY_OPEN_WARNING,

    POLICY_OPEN_CRITICAL,

    /**
     * We have decided to split this into two different events POLICY_CLOSE_WARNING
     * and POLICY_CLOSE_CRITICAL
     * @deprecated
     */
    POLICY_CLOSE,

    POLICY_CLOSE_WARNING,

    POLICY_CLOSE_CRITICAL,

    POLICY_UPGRADED,
    //Warning to Critical

    POLICY_DOWNGRADED,
    //Critical to Warning;

    POLICY_CONTINUES_WARNING,

    POLICY_CONTINUES_CRITICAL,

    /**
     * We have decided to split this into two different events POLICY_CANCELED_WARNING
     * and POLICY_CANCELED_CRITICAL
     * @deprecated
     */
    POLICY_CANCELLED,

    POLICY_CANCELED_WARNING,

    POLICY_CANCELED_CRITICAL,

    /**
     * This is thrown when any resource pool size is reached, thread pool, connection pool etc. fall into this category
     */
    RESOURCE_POOL_LIMIT,

    // Browser snapshots
    EUM_CLOUD_BROWSER_EVENT,

    // Synthetic browser snapshots
    // Synthetic browser snapshots are conceptually browser snapshots with extra info,
    // so effectively they are a sub-class of browser snapshots
    EUM_CLOUD_SYNTHETIC_BROWSER_EVENT,

    // Synthetic availability events
    EUM_CLOUD_SYNTHETIC_HEALTHY_EVENT,
    EUM_CLOUD_SYNTHETIC_WARNING_EVENT,
    EUM_CLOUD_SYNTHETIC_CONFIRMED_WARNING_EVENT,
    EUM_CLOUD_SYNTHETIC_ONGOING_WARNING_EVENT,
    EUM_CLOUD_SYNTHETIC_ERROR_EVENT,
    EUM_CLOUD_SYNTHETIC_CONFIRMED_ERROR_EVENT,
    EUM_CLOUD_SYNTHETIC_ONGOING_ERROR_EVENT,

    // Synthetic performance events
    EUM_CLOUD_SYNTHETIC_PERF_HEALTHY_EVENT,
    EUM_CLOUD_SYNTHETIC_PERF_WARNING_EVENT,
    EUM_CLOUD_SYNTHETIC_PERF_CONFIRMED_WARNING_EVENT,
    EUM_CLOUD_SYNTHETIC_PERF_ONGOING_WARNING_EVENT,
    EUM_CLOUD_SYNTHETIC_PERF_CRITICAL_EVENT,
    EUM_CLOUD_SYNTHETIC_PERF_CONFIRMED_CRITICAL_EVENT,
    EUM_CLOUD_SYNTHETIC_PERF_ONGOING_CRITICAL_EVENT,

    MOBILE_SNAPSHOT_IOS_EVENT,

    MOBILE_SNAPSHOT_ANDROID_EVENT,

    MOBILE_CRASH_IOS_EVENT,

    MOBILE_CRASH_ANDROID_EVENT,

    //TODO_RUNBOOK_ANDREW - need to classify these events in the unified event model
    THREAD_DUMP_ACTION_STARTED,

    THREAD_DUMP_ACTION_END,

    THREAD_DUMP_ACTION_FAILED,

    HTTP_REQUEST_ACTION_STARTED,

    HTTP_REQUEST_ACTION_END,

    HTTP_REQUEST_ACTION_FAILED,

    CUSTOM_EMAIL_ACTION_STARTED,

    CUSTOM_EMAIL_ACTION_END,

    CUSTOM_EMAIL_ACTION_FAILED,

    RUN_LOCAL_SCRIPT_ACTION_STARTED,

    RUN_LOCAL_SCRIPT_ACTION_END,

    RUN_LOCAL_SCRIPT_ACTION_FAILED,

    RUNBOOK_DIAGNOSTIC_SESSION_STARTED,

    RUNBOOK_DIAGNOSTIC_SESSION_END,

    RUNBOOK_DIAGNOSTIC_SESSION_FAILED,

    CUSTOM_ACTION_STARTED,

    CUSTOM_ACTION_END,

    CUSTOM_ACTION_FAILED,

    WORKFLOW_ACTION_STARTED,

    WORKFLOW_ACTION_END,

    WORKFLOW_ACTION_FAILED,

    NORMAL,

    SLOW,

    VERY_SLOW,

    BUSINESS_ERROR,

    ALREADY_ADJUDICATED,

    ADJUDICATION_CANCELLED,

    EMAIL_SENT,

    SMS_SENT,

    /**
     * @deprecated
     */
    SNOOZE_START,

    /**
     * @deprecated
     */
    SNOOZE_END,

    APPLICATION_CRASH,


    /**
     * This event indicates Controller EUM Cloud communication channel is encountering errors
     *
     * The Event is a summary event and will be generated every 5 minutes capturing
     * a summary of the various errors
     */
    EUM_INTERNAL_ERROR,

    //These next event types are for getting started discovery events

    APPLICATION_DISCOVERED,
    TIER_DISCOVERED,
    NODE_DISCOVERED,
    MACHINE_DISCOVERED,
    BT_DISCOVERED,
    SERVICE_ENDPOINT_DISCOVERED,
    BACKEND_DISCOVERED,
    WARROOM_NOTE,

    /**
     * This event indicates Machine Agent is logging information
     *
     * The Event is the log data provided by the Machine Agent
     */
    MACHINE_AGENT_LOG,

    /**
     * This event type indicates log data provided by NPM Agent is logged by NPM Dynamic service
     */
    NETWORK,
}

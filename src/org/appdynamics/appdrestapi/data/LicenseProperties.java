/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;


/**
 *
 * @author gilbert.solorzano
 */
public class LicenseProperties {
    private LicenseProperty appAgentLicenseProperties,dotNetLicenseProperties,nativeLicenseProperties,nativeSDKLicenseProperties,nativeDynamicLicenseProperties,nativeWebServerLicenseProperties,phpLicenseProperties;
    private LicenseProperty nodeJsLicenseProperties,pythonLicenseProperties,dbLicenseProperties,machineLicenseProperties,transactionAnalyticsLicenseProperties,logAnalyticsLicenseProperties,mobileAnalyticsLicenseProperties;
    private LicenseProperty browserAnalyticsLicenseProperties,apmAgentLicenseProperties,simAgentLicenseProperties,serverAvailMonLicenseProperties;

    public LicenseProperty getServerAvailMonLicenseProperties() {
        return serverAvailMonLicenseProperties;
    }

    public void setServerAvailMonLicenseProperties(LicenseProperty serverAvailMonLicenseProperties) {
        this.serverAvailMonLicenseProperties = serverAvailMonLicenseProperties;
    }

    
    public LicenseProperty getSimAgentLicenseProperties() {
        return simAgentLicenseProperties;
    }

    public void setSimAgentLicenseProperties(LicenseProperty simAgentLicenseProperties) {
        this.simAgentLicenseProperties = simAgentLicenseProperties;
    }

    
    
    public LicenseProperty getApmAgentLicenseProperties() {
        return apmAgentLicenseProperties;
    }

    public void setApmAgentLicenseProperties(LicenseProperty apmAgentLicenseProperties) {
        this.apmAgentLicenseProperties = apmAgentLicenseProperties;
    }

    
    
    public LicenseProperty getMobileAnalyticsLicenseProperties() {
        return mobileAnalyticsLicenseProperties;
    }

    public void setMobileAnalyticsLicenseProperties(LicenseProperty mobileAnalyticsLicenseProperties) {
        this.mobileAnalyticsLicenseProperties = mobileAnalyticsLicenseProperties;
    }

    public LicenseProperty getBrowserAnalyticsLicenseProperties() {
        return browserAnalyticsLicenseProperties;
    }

    public void setBrowserAnalyticsLicenseProperties(LicenseProperty browserAnalyticsLicenseProperties) {
        this.browserAnalyticsLicenseProperties = browserAnalyticsLicenseProperties;
    }

    
    public LicenseProperty getAppAgentLicenseProperties() {
        return appAgentLicenseProperties;
    }

    public void setAppAgentLicenseProperties(LicenseProperty appAgentLicenseProperties) {
        this.appAgentLicenseProperties = appAgentLicenseProperties;
    }

    public LicenseProperty getDotNetLicenseProperties() {
        return dotNetLicenseProperties;
    }

    public void setDotNetLicenseProperties(LicenseProperty dotNetLicenseProperties) {
        this.dotNetLicenseProperties = dotNetLicenseProperties;
    }

    public LicenseProperty getNativeLicenseProperties() {
        return nativeLicenseProperties;
    }

    public void setNativeLicenseProperties(LicenseProperty nativeLicenseProperties) {
        this.nativeLicenseProperties = nativeLicenseProperties;
    }

    public LicenseProperty getNativeSDKLicenseProperties() {
        return nativeSDKLicenseProperties;
    }

    public void setNativeSDKLicenseProperties(LicenseProperty nativeSDKLicenseProperties) {
        this.nativeSDKLicenseProperties = nativeSDKLicenseProperties;
    }

    public LicenseProperty getNativeDynamicLicenseProperties() {
        return nativeDynamicLicenseProperties;
    }

    public void setNativeDynamicLicenseProperties(LicenseProperty nativeDynamicLicenseProperties) {
        this.nativeDynamicLicenseProperties = nativeDynamicLicenseProperties;
    }

    public LicenseProperty getNativeWebServerLicenseProperties() {
        return nativeWebServerLicenseProperties;
    }

    public void setNativeWebServerLicenseProperties(LicenseProperty nativeWebServerLicenseProperties) {
        this.nativeWebServerLicenseProperties = nativeWebServerLicenseProperties;
    }

    public LicenseProperty getPhpLicenseProperties() {
        return phpLicenseProperties;
    }

    public void setPhpLicenseProperties(LicenseProperty phpLicenseProperties) {
        this.phpLicenseProperties = phpLicenseProperties;
    }

    public LicenseProperty getNodeJsLicenseProperties() {
        return nodeJsLicenseProperties;
    }

    public void setNodeJsLicenseProperties(LicenseProperty nodeJsLicenseProperties) {
        this.nodeJsLicenseProperties = nodeJsLicenseProperties;
    }

    public LicenseProperty getPythonLicenseProperties() {
        return pythonLicenseProperties;
    }

    public void setPythonLicenseProperties(LicenseProperty pythonLicenseProperties) {
        this.pythonLicenseProperties = pythonLicenseProperties;
    }

    public LicenseProperty getDbLicenseProperties() {
        return dbLicenseProperties;
    }

    public void setDbLicenseProperties(LicenseProperty dbLicenseProperties) {
        this.dbLicenseProperties = dbLicenseProperties;
    }

    public LicenseProperty getMachineLicenseProperties() {
        return machineLicenseProperties;
    }

    public void setMachineLicenseProperties(LicenseProperty machineLicenseProperties) {
        this.machineLicenseProperties = machineLicenseProperties;
    }

    public LicenseProperty getTransactionAnalyticsLicenseProperties() {
        return transactionAnalyticsLicenseProperties;
    }

    public void setTransactionAnalyticsLicenseProperties(LicenseProperty transactionAnalyticsLicenseProperties) {
        this.transactionAnalyticsLicenseProperties = transactionAnalyticsLicenseProperties;
    }

    public LicenseProperty getLogAnalyticsLicenseProperties() {
        return logAnalyticsLicenseProperties;
    }

    public void setLogAnalyticsLicenseProperties(LicenseProperty logAnalyticsLicenseProperties) {
        this.logAnalyticsLicenseProperties = logAnalyticsLicenseProperties;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append(s.LICENSE_PROPERTIES);        
        bud.append(AppExportS.L1).append(s.APP_AGENT_LICENSE_PROPERTIES).append(AppExportS.VE).append(appAgentLicenseProperties);
        bud.append(AppExportS.L1).append(s.DOT_NET_LICENSE_PROPERTIES).append(AppExportS.VE).append(dotNetLicenseProperties);
        bud.append(AppExportS.L1).append(s.NATIVE_LICENSE_PROPERTIES).append(AppExportS.VE).append(nativeLicenseProperties);
        bud.append(AppExportS.L1).append(s.NATIVE_SDK_LICENSE_PROPERTIES).append(AppExportS.VE).append(nativeSDKLicenseProperties);
        bud.append(AppExportS.L1).append(s.NATIVE_DYNAMIC_LICENSE_PROPERTIES).append(AppExportS.VE).append(nativeDynamicLicenseProperties);
        bud.append(AppExportS.L1).append(s.NATIVE_WEB_SERVER_LICENSE_PROPERTIES).append(AppExportS.VE).append(nativeWebServerLicenseProperties);
        bud.append(AppExportS.L1).append(s.PHP_LICENSE_PROPERTIES).append(AppExportS.VE).append(phpLicenseProperties);
        bud.append(AppExportS.L1).append(s.NODEJS_LICENSE_PROPERTIES).append(AppExportS.VE).append(nodeJsLicenseProperties);
        bud.append(AppExportS.L1).append(s.PYTHON_LICENSE_PROPERTIES).append(AppExportS.VE).append(pythonLicenseProperties);
        bud.append(AppExportS.L1).append(s.DB_LICENSE_PROPERTIES).append(AppExportS.VE).append(dbLicenseProperties);
        bud.append(AppExportS.L1).append(s.MACHINE_LICENSE_PROPERTIES).append(AppExportS.VE).append(machineLicenseProperties);
        bud.append(AppExportS.L1).append(s.TRANSACTION_ANALYTICS_LICENSE_PROPERTIES).append(AppExportS.VE).append(transactionAnalyticsLicenseProperties);
        bud.append(AppExportS.L1).append(s.LOG_ANALYTICS_LICENSE_PROPERTIES).append(AppExportS.VE).append(logAnalyticsLicenseProperties);
       
        return bud.toString();
    }
}

/*

{
"appAgentLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"1900","maxAllowedLicenses":"1900","lastHourUsage":"1682","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"dotNetLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"300","maxAllowedLicenses":"300","lastHourUsage":"200","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"nativeLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"0","maxAllowedLicenses":"0","lastHourUsage":"-1","isLicensed":"false","isExpired":"false","dataRetentionPeriod":null},
"nativeSDKLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"1","maxAllowedLicenses":"1","lastHourUsage":"0","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"nativeDynamicLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"0","maxAllowedLicenses":"0","lastHourUsage":"-1","isLicensed":"false","isExpired":"false","dataRetentionPeriod":null},
"nativeWebServerLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"100","maxAllowedLicenses":"100","lastHourUsage":"32","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"phpLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"1","maxAllowedLicenses":"1","lastHourUsage":"0","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"nodeJsLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"49","maxAllowedLicenses":"49","lastHourUsage":"1","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"pythonLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"1","maxAllowedLicenses":"1","lastHourUsage":"0","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"dbLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"15","maxAllowedLicenses":"15","lastHourUsage":"1","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"machineLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"2352","maxAllowedLicenses":"2352","lastHourUsage":"1141","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
"transactionAnalyticsLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"100","maxAllowedLicenses":"100","lastHourUsage":"0","isLicensed":"true","isExpired":"false","dataRetentionPeriod":"7"},
"logAnalyticsLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"1","maxAllowedLicenses":"1","lastHourUsage":"0","isLicensed":"true","isExpired":"false","dataRetentionPeriod":"7"}

}
*/

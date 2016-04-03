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
public class AccountEUM {
    
    private String licenseKey;
    private long allocatedPageViews;
    private long consumedPageViews;
    private long currentUsagePeriodStartMillis;
    private long currentUsagePeriodEndMillis;
    private String licenseType;
    private int licenseUnits;
    private boolean licenseAllowsOverages;
    private long mobileCurrentUsagePeriodStartMillis;
    private long mobileCurrentUsagePeriodEndMillis;
    private int allocatedMobileAgents;
    private int consumedMobileAgents;
    private String mobileLicenseType;
    private int mobileLicenseUnits;
    private boolean mobileLicenseAllowsOverages;
    private long syntheticCurrentUsagePeriodStartMillis;
    private long syntheticCurrentUsagePeriodEndMillis;
    private int allocatedSyntheticMeasurementUnits;
    private int consumedSyntheticMeasurementUnits;
    private String syntheticLicenseType;
    private int syntheticLicenseUnits;
    private String errorMessage;
    
    public AccountEUM(){}

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public long getAllocatedPageViews() {
        return allocatedPageViews;
    }

    public void setAllocatedPageViews(long allocatedPageViews) {
        this.allocatedPageViews = allocatedPageViews;
    }

    public long getConsumedPageViews() {
        return consumedPageViews;
    }

    public void setConsumedPageViews(long consumedPageViews) {
        this.consumedPageViews = consumedPageViews;
    }

    public long getCurrentUsagePeriodStartMillis() {
        return currentUsagePeriodStartMillis;
    }

    public void setCurrentUsagePeriodStartMillis(long currentUsagePeriodStartMillis) {
        this.currentUsagePeriodStartMillis = currentUsagePeriodStartMillis;
    }

    public long getCurrentUsagePeriodEndMillis() {
        return currentUsagePeriodEndMillis;
    }

    public void setCurrentUsagePeriodEndMillis(long currentUsagePeriodEndMillis) {
        this.currentUsagePeriodEndMillis = currentUsagePeriodEndMillis;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public int getLicenseUnits() {
        return licenseUnits;
    }

    public void setLicenseUnits(int licenseUnits) {
        this.licenseUnits = licenseUnits;
    }

    public boolean isLicenseAllowsOverages() {
        return licenseAllowsOverages;
    }

    public void setLicenseAllowsOverages(boolean licenseAllowsOverages) {
        this.licenseAllowsOverages = licenseAllowsOverages;
    }

    public long getMobileCurrentUsagePeriodStartMillis() {
        return mobileCurrentUsagePeriodStartMillis;
    }

    public void setMobileCurrentUsagePeriodStartMillis(long mobileCurrentUsagePeriodStartMillis) {
        this.mobileCurrentUsagePeriodStartMillis = mobileCurrentUsagePeriodStartMillis;
    }

    public long getMobileCurrentUsagePeriodEndMillis() {
        return mobileCurrentUsagePeriodEndMillis;
    }

    public void setMobileCurrentUsagePeriodEndMillis(long mobileCurrentUsagePeriodEndMillis) {
        this.mobileCurrentUsagePeriodEndMillis = mobileCurrentUsagePeriodEndMillis;
    }

    public int getAllocatedMobileAgents() {
        return allocatedMobileAgents;
    }

    public void setAllocatedMobileAgents(int allocatedMobileAgents) {
        this.allocatedMobileAgents = allocatedMobileAgents;
    }

    public int getConsumedMobileAgents() {
        return consumedMobileAgents;
    }

    public void setConsumedMobileAgents(int consumedMobileAgents) {
        this.consumedMobileAgents = consumedMobileAgents;
    }

    public String getMobileLicenseType() {
        return mobileLicenseType;
    }

    public void setMobileLicenseType(String mobileLicenseType) {
        this.mobileLicenseType = mobileLicenseType;
    }

    public int getMobileLicenseUnits() {
        return mobileLicenseUnits;
    }

    public void setMobileLicenseUnits(int mobileLicenseUnits) {
        this.mobileLicenseUnits = mobileLicenseUnits;
    }

    public boolean isMobileLicenseAllowsOverages() {
        return mobileLicenseAllowsOverages;
    }

    public void setMobileLicenseAllowsOverages(boolean mobileLicenseAllowsOverages) {
        this.mobileLicenseAllowsOverages = mobileLicenseAllowsOverages;
    }

    public long getSyntheticCurrentUsagePeriodStartMillis() {
        return syntheticCurrentUsagePeriodStartMillis;
    }

    public void setSyntheticCurrentUsagePeriodStartMillis(long syntheticCurrentUsagePeriodStartMillis) {
        this.syntheticCurrentUsagePeriodStartMillis = syntheticCurrentUsagePeriodStartMillis;
    }

    public long getSyntheticCurrentUsagePeriodEndMillis() {
        return syntheticCurrentUsagePeriodEndMillis;
    }

    public void setSyntheticCurrentUsagePeriodEndMillis(long syntheticCurrentUsagePeriodEndMillis) {
        this.syntheticCurrentUsagePeriodEndMillis = syntheticCurrentUsagePeriodEndMillis;
    }

    public int getAllocatedSyntheticMeasurementUnits() {
        return allocatedSyntheticMeasurementUnits;
    }

    public void setAllocatedSyntheticMeasurementUnits(int allocatedSyntheticMeasurementUnits) {
        this.allocatedSyntheticMeasurementUnits = allocatedSyntheticMeasurementUnits;
    }

    public int getConsumedSyntheticMeasurementUnits() {
        return consumedSyntheticMeasurementUnits;
    }

    public void setConsumedSyntheticMeasurementUnits(int consumedSyntheticMeasurementUnits) {
        this.consumedSyntheticMeasurementUnits = consumedSyntheticMeasurementUnits;
    }

    public String getSyntheticLicenseType() {
        return syntheticLicenseType;
    }

    public void setSyntheticLicenseType(String syntheticLicenseType) {
        this.syntheticLicenseType = syntheticLicenseType;
    }

    public int getSyntheticLicenseUnits() {
        return syntheticLicenseUnits;
    }

    public void setSyntheticLicenseUnits(int syntheticLicenseUnits) {
        this.syntheticLicenseUnits = syntheticLicenseUnits;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append(s.LIC_ACCOUNT_EUM);
        bud.append(AppExportS.L1).append(s.ALLOCATED_PAGE_VIEWS).append(AppExportS.VE).append(allocatedPageViews);
        bud.append(AppExportS.L1).append(s.CONSUMED_PAGE_VIEWS).append(AppExportS.VE).append(consumedPageViews);
        bud.append(AppExportS.L1).append(s.CURRENT_USAGE_PERIOD_START_MILLIS).append(AppExportS.VE).append(currentUsagePeriodStartMillis);
        bud.append(AppExportS.L1).append(s.CURRENT_USAGE_PERIOD_END_MILLIS).append(AppExportS.VE).append(currentUsagePeriodEndMillis);
        bud.append(AppExportS.L1).append(s.LICENSE_TYPE).append(AppExportS.VE).append(licenseType);
        bud.append(AppExportS.L1).append(s.LICENSE_UNITS).append(AppExportS.VE).append(licenseUnits);
        bud.append(AppExportS.L1).append(s.LICENSE_ALLOWED_OVERAGES).append(AppExportS.VE).append(licenseAllowsOverages);
        bud.append(AppExportS.L1).append(s.MOBILE_CURRENT_USAGE_PERIOD_START_MILLIS).append(AppExportS.VE).append(mobileCurrentUsagePeriodStartMillis);
        bud.append(AppExportS.L1).append(s.MOBILE_CURRENT_USAGE_PERIOD_END_MILLIS).append(AppExportS.VE).append(mobileCurrentUsagePeriodEndMillis);
        bud.append(AppExportS.L1).append(s.ALLOCATED_MOBILE_AGENTS).append(AppExportS.VE).append(allocatedMobileAgents);
        bud.append(AppExportS.L1).append(s.CONSUMED_MOBILE_AGENTS).append(AppExportS.VE).append(consumedMobileAgents);
        bud.append(AppExportS.L1).append(s.MOBILE_LICENSE_TYPE).append(AppExportS.VE).append(mobileLicenseType);
        bud.append(AppExportS.L1).append(s.MOBILE_LICENSE_UNIT).append(AppExportS.VE).append(mobileLicenseUnits);
        bud.append(AppExportS.L1).append(s.MOBILE_LICENSE_ALLOWS_OVERAGES).append(AppExportS.VE).append(mobileLicenseAllowsOverages);
        bud.append(AppExportS.L1).append(s.SYNTHETIC_CURRENT_USAGE_PERIOD_START_MILLIS).append(AppExportS.VE).append(syntheticCurrentUsagePeriodStartMillis);
        bud.append(AppExportS.L1).append(s.SYNTHETIC_CURRENT_USAGE_PERIOD_END_MILLIS).append(AppExportS.VE).append(syntheticCurrentUsagePeriodEndMillis);
        bud.append(AppExportS.L1).append(s.ALLOCATED_SYNTHETIC_MEASUREMENT).append(AppExportS.VE).append(allocatedSyntheticMeasurementUnits);
        bud.append(AppExportS.L1).append(s.CONSUMED_SYNTHETIC_MEASUREMENT_UNITS).append(AppExportS.VE).append(consumedSyntheticMeasurementUnits);
        bud.append(AppExportS.L1).append(s.SYNTHETIC_LICENSE_TYPE).append(AppExportS.VE).append(syntheticLicenseType);
        bud.append(AppExportS.L1).append(s.SYNTHETIC_LICENSE_UNIT).append(AppExportS.VE).append(syntheticLicenseUnits);
        bud.append(AppExportS.L1).append(s.ERROR_MESSAGE).append(AppExportS.VE).append(errorMessage);
        
        return bud.toString();
    }
}

/*
{ 
   "licenseKey":"b57c1fdf-54bc-4431-b72e-5224f0007b64",
    "allocatedPageViews":1700000000,
   "consumedPageViews":5003461,
   "currentUsagePeriodStartMillis":1448913600000,
   "currentUsagePeriodEndMillis":1480536000000,
   "licenseType":"EUM_PRO",
   "licenseUnits":170,
   "licenseAllowsOverages":true,
   "mobileCurrentUsagePeriodStartMillis":1459537200000,
   "mobileCurrentUsagePeriodEndMillis":1462129200000,
   "allocatedMobileAgents":5000000,
   "consumedMobileAgents":0,
   "mobileLicenseType":"MOBILE_LITE",
   "mobileLicenseUnits":1,
   "mobileLicenseAllowsOverages":false,
   "syntheticCurrentUsagePeriodStartMillis":1459537200000,
   "syntheticCurrentUsagePeriodEndMillis":1462129200000,
   "allocatedSyntheticMeasurementUnits":4000,
   "consumedSyntheticMeasurementUnits":0,
   "syntheticLicenseType":"LITE",
   "syntheticLicenseUnits":1,
   "errorMessage":null
}

*/

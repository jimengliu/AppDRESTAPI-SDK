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
public class LicenseProperty {
    private String  edition, expirationDate,licenseModel,numOfProvisionedLicense,maxAllowedLicenses,lastHourUsage,isLicensed,isExpired,dataRetentionPeriod; //numOfProvisionedLicense
    
    public LicenseProperty(){}

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLicenseModel() {
        return licenseModel;
    }

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    public String getNumOfProvisionedLicense() {
        return numOfProvisionedLicense;
    }

    public void setNumOfProvisionedLicense(String numOfProvisionedLicese) {
        this.numOfProvisionedLicense = numOfProvisionedLicese;
    }

    public String getMaxAllowedLicenses() {
        return maxAllowedLicenses;
    }

    public void setMaxAllowedLicenses(String maxAllowedLicenses) {
        this.maxAllowedLicenses = maxAllowedLicenses;
    }

    public String getLastHourUsage() {
        return lastHourUsage;
    }

    public void setLastHourUsage(String lastHourUsage) {
        this.lastHourUsage = lastHourUsage;
    }

    public String getIsLicensed() {
        return isLicensed;
    }

    public void setIsLicensed(String isLicensed) {
        this.isLicensed = isLicensed;
    }

    public String getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(String isExpired) {
        this.isExpired = isExpired;
    }

    public String getDataRetentionPeriod() {
        return dataRetentionPeriod;
    }

    public void setDataRetentionPeriod(String dataRetentionPeriod) {
        this.dataRetentionPeriod = dataRetentionPeriod;
    }

    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L1_1).append(s.EDITION).append(AppExportS.VE).append(edition);
        bud.append(AppExportS.L1_1).append(s.EXPIRATION_DATE).append(AppExportS.VE).append(expirationDate);
        bud.append(AppExportS.L1_1).append(s.LICENSE_MODEL).append(AppExportS.VE).append(licenseModel);
        bud.append(AppExportS.L1_1).append(s.NUM_OF_PROVISIONED_LICENSE).append(AppExportS.VE).append(numOfProvisionedLicense);
        bud.append(AppExportS.L1_1).append(s.MAX_ALLOWED_LICENSES).append(AppExportS.VE).append(maxAllowedLicenses);
        bud.append(AppExportS.L1_1).append(s.LAST_HOUR_USAGE).append(AppExportS.VE).append(lastHourUsage);
        bud.append(AppExportS.L1_1).append(s.IS_LICENSED).append(AppExportS.VE).append(isLicensed);
        bud.append(AppExportS.L1_1).append(s.IS_EXPIRED).append(AppExportS.VE).append(isExpired);
        bud.append(AppExportS.L1_1).append(s.DATA_RETENTION_PERIOD).append(AppExportS.VE).append(dataRetentionPeriod);
        
        return bud.toString();
    }
    
    
}

/*
"appAgentLicenseProperties":{"edition":"PRO","expirationDate":"1477810800000","licenseModel":"FIXED","numOfProvisionedLicense":"1900","maxAllowedLicenses":"1900",
"lastHourUsage":"1682","isLicensed":"true","isExpired":"false","dataRetentionPeriod":null},
*/
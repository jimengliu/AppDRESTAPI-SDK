/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * 
 * Whether the call is for policy violations or health rule violation.


 */


/*
 * <policy-violation>
  <id>143518</id>
  <name>JVM Heap utilization is too high</name>
  <startTimeInMillis>1396925759376</startTimeInMillis>
  <detectedTimeInMillis>0</detectedTimeInMillis>
  <endTimeInMillis>0</endTimeInMillis>
  <incidentStatus>OPEN</incidentStatus>
  <severity>WARNING</severity>
  <triggeredEntityDefinition>
    <entityType>POLICY</entityType>
    <entityId>373</entityId>
  </triggeredEntityDefinition>
  <affectedEntityDefinition>
    <entityType>APPLICATION_COMPONENT_NODE</entityType>
    <entityId>19903</entityId>
  </affectedEntityDefinition>
  <deepLinkUrl>https://paid1.saas.appdynamics.com/controller/#location=APP_INCIDENT_DETAIL&amp;incident=143518</deepLinkUrl>
  <description>JVM Heap utilization is too high</description>
</policy-violation>
 * 
 */
@XmlSeeAlso(EntityDefinition.class)
public class PolicyViolation {
    private int id;
    private String name;
    private long startTimeInMillis;
    private long detectedTimeInMillis;
    private long endTimeInMillis;
    private String incidentStatus;
    private String severity;
    private TriggeredEntityDefinition triggeredEntity;
    private AffectedEntityDefinition affectedEntityDefinition;
    private String deepURL;
    private String description;
    
    public PolicyViolation(){}

    @XmlElement(name=s.ID)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name=s.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.START_TIME_IN_MILLIS)
    public long getStartTimeInMillis() {
        return startTimeInMillis;
    }

    public void setStartTimeInMillis(long startTimeInMillis) {
        this.startTimeInMillis = startTimeInMillis;
    }

    @XmlElement(name=AppExportS.DETECTED_TIME_IN_MILLIS)
    public long getDetectedTimeInMillis() {
        return detectedTimeInMillis;
    }

    public void setDetectedTimeInMillis(long detectedTimeInMillis) {
        this.detectedTimeInMillis = detectedTimeInMillis;
    }

    @XmlElement(name=AppExportS.END_TIME_IN_MILLIS)
    public long getEndTimeInMillis() {
        return endTimeInMillis;
    }

    public void setEndTimeInMillis(long endTimeInMillis) {
        this.endTimeInMillis = endTimeInMillis;
    }

    @XmlElement(name=AppExportS.INCIDENT_STATUS)
    public String getIncidentStatus() {
        return incidentStatus;
    }

    public void setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    @XmlElement(name=AppExportS.SEVERITY)
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @XmlElement(name = AppExportS.TRIGGERED_ENTITY_DEFINITION)
    public TriggeredEntityDefinition getTriggeredEntity() {
        return triggeredEntity;
    }

    public void setTriggeredEntity(TriggeredEntityDefinition triggeredEntity) {
        this.triggeredEntity = triggeredEntity;
    }

    @XmlElement(name=AppExportS.AFFECTED_ENTITY_DEFINITION)
    public AffectedEntityDefinition getAffectedEntityDefinition() {
        return affectedEntityDefinition;
    }

    public void setAffectedEntityDefinition(AffectedEntityDefinition affectedEntityDefinition) {
        this.affectedEntityDefinition = affectedEntityDefinition;
    }

    @XmlElement(name=AppExportS.DEEP_LINK_URL)
    public String getDeepURL() {
        return deepURL;
    }

    public void setDeepURL(String deepURL) {
        this.deepURL = deepURL;
    }

    @XmlElement(name=AppExportS.DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    
    @Override
    public String toString(){
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.POLICY_VIOLATION);
        bud.append(AppExportS.L2).append(s.ID).append(AppExportS.VE).append(id);
        bud.append(AppExportS.L2).append(s.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.START_TIME_IN_MILLIS).append(AppExportS.VE).append(startTimeInMillis);
        bud.append(AppExportS.L2).append(AppExportS.DETECTED_TIME_IN_MILLIS).append(AppExportS.VE).append(detectedTimeInMillis);
        bud.append(AppExportS.L2).append(AppExportS.END_TIME_IN_MILLIS).append(AppExportS.VE).append(endTimeInMillis);
        bud.append(AppExportS.L2).append(AppExportS.INCIDENT_STATUS).append(AppExportS.VE).append(incidentStatus);
        bud.append(AppExportS.L2).append(AppExportS.SEVERITY).append(AppExportS.VE).append(severity);
        bud.append(affectedEntityDefinition.toString());
        bud.append(triggeredEntity.toString());
        bud.append(AppExportS.L2).append(AppExportS.DEEP_LINK_URL).append(AppExportS.VE).append(deepURL);
        bud.append(AppExportS.L2).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
        return bud.toString();
    }
    
    
    
}

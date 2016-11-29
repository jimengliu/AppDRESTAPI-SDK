/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;



import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author soloink
 */
public class EventInfo {
    
    private enum NotificationSeverity { INFO, WARN, ERROR }

      //EventType eventType;
    private long id;
    private String guid,eventTypeKey,displayName,summaryMessage,eventMessage,deepLink;
    private Date eventTime;
    private EntityInfo application,tier,node;
    private List<EntityInfo> affectedEntities;
    boolean healthRuleEvent;
    private EntityInfo healthRule ;// * Only defined when healthRuleEvent == true
    private EntityInfo incident ;// * Only defined when healthRuleEvent == true
    private boolean healthRuleViolationEvent,btPerformanceEvent; // * btPerformanceEvent is true when eventType matches one of the BT performance event types
    private NotificationSeverity severity;
    private ImageInfo severityImage;

    public EventInfo(){}
  
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getEventTypeKey() {
        return eventTypeKey;
    }

    public void setEventTypeKey(String eventTypeKey) {
        this.eventTypeKey = eventTypeKey;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSummaryMessage() {
        return summaryMessage;
    }

    public void setSummaryMessage(String summaryMessage) {
        this.summaryMessage = summaryMessage;
    }

    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public EntityInfo getApplication() {
        return application;
    }

    public void setApplication(EntityInfo application) {
        this.application = application;
    }

    public EntityInfo getTier() {
        return tier;
    }

    public void setTier(EntityInfo tier) {
        this.tier = tier;
    }

    public EntityInfo getNode() {
        return node;
    }

    public void setNode(EntityInfo node) {
        this.node = node;
    }

    public List<EntityInfo> getAffectedEntities() {
        return affectedEntities;
    }

    public void setAffectedEntities(List<EntityInfo> affectedEntities) {
        this.affectedEntities = affectedEntities;
    }

    public boolean isHealthRuleEvent() {
        return healthRuleEvent;
    }

    public void setHealthRuleEvent(boolean healthRuleEvent) {
        this.healthRuleEvent = healthRuleEvent;
    }

    public EntityInfo getHealthRule() {
        return healthRule;
    }

    public void setHealthRule(EntityInfo healthRule) {
        this.healthRule = healthRule;
    }

    public EntityInfo getIncident() {
        return incident;
    }

    public void setIncident(EntityInfo incident) {
        this.incident = incident;
    }

    public boolean isHealthRuleViolationEvent() {
        return healthRuleViolationEvent;
    }

    public void setHealthRuleViolationEvent(boolean healthRuleViolationEvent) {
        this.healthRuleViolationEvent = healthRuleViolationEvent;
    }

    public boolean isBtPerformanceEvent() {
        return btPerformanceEvent;
    }

    public void setBtPerformanceEvent(boolean btPerformanceEvent) {
        this.btPerformanceEvent = btPerformanceEvent;
    }

    public NotificationSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(NotificationSeverity severity) {
        this.severity = severity;
    }

    public ImageInfo getSeverityImage() {
        return severityImage;
    }

    public void setSeverityImage(ImageInfo severityImage) {
        this.severityImage = severityImage;
    }
   
 
  
    
}

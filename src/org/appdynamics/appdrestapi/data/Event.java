/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 */

/*
 <event>
  <id>390707767</id>
  <type>APPLICATION_ERROR</type>
  <eventTime>1397173474210</eventTime>
  <severity>ERROR</severity>
  <summary>com.sun.jersey.core.impl.provider.xml.SAXParserContextProvider::JAXP feature XMLConstants.FEATURE_SECURE_PROCESSING cannot be set on a SAXParserFactory. External general entity processing is disabled but other potential security related features will not be enabled. : SAXNotRecognizedException: Feature &apos;http://javax.xml.XMLConstants/feature/secure-processing&apos; is not recognized.</summary>
  <affectedEntities>
    <entity-definition>
      <entityType>APPLICATION_COMPONENT_NODE</entityType>
      <entityId>17948</entityId>
    </entity-definition>
    <entity-definition>
      <entityType>APPLICATION</entityType>
      <entityId>53</entityId>
    </entity-definition>
    <entity-definition>
      <entityType>MACHINE_INSTANCE</entityType>
      <entityId>5212</entityId>
    </entity-definition>
    <entity-definition>
      <entityType>APPLICATION_COMPONENT</entityType>
      <entityId>179</entityId>
    </entity-definition>
  </affectedEntities>
  <markedAsRead>false</markedAsRead>
  <markedAsResolved>false</markedAsResolved>
  <archived>false</archived>
  <deepLinkUrl>https://paid1.saas.appdynamics.com/controller/#location=APP_EVENT_VIEWER_MODAL&amp;eventSummary=390707767</deepLinkUrl>
</event>
 * 
 */

@XmlSeeAlso({EntityDefinition.class,AffectedEntities.class})
public class Event {
    private int id;
    private String type;
    private long eventTime;
    private String severity;
    private String summary;
    private AffectedEntities affectedEntities;
    private boolean markedAsRead;
    private boolean markedAsResolved;
    private boolean archived;
    private String deepURL;
    
    public Event(){}

    @XmlElement(name=s.ID)
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name=s.TYPE)
    public String getType() {
        return type;
    }

    
    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.EVENT_TIME)
    public long getEventTime() {
        return eventTime;
    }

    public void setEventTime(long eventTime) {
        this.eventTime = eventTime;
    }

    @XmlElement(name=AppExportS.SEVERITY)
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @XmlElement(name=AppExportS.SUMMARY)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    @XmlElement(name=AppExportS.MARKED_AS_READ)
    public boolean isMarkedAsRead() {
        return markedAsRead;
    }

    public void setMarkedAsRead(boolean markedAsRead) {
        this.markedAsRead = markedAsRead;
    }

    @XmlElement(name=AppExportS.MARKED_AS_RESOLVED)
    public boolean isMarkedAsResolved() {
        return markedAsResolved;
    }

    public void setMarkedAsResolved(boolean markedAsResolved) {
        this.markedAsResolved = markedAsResolved;
    }

    @XmlElement(name=AppExportS.ARCHIVED)
    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    @XmlElement(name=AppExportS.DEEP_LINK_URL)
    public String getDeepURL() {
        return deepURL;
    }

    public void setDeepURL(String deepURL) {
        this.deepURL = deepURL;
    }

    @XmlElement(name=AppExportS.AFFECTED_ENTITIES)
    public AffectedEntities getAffectedEntities() {
        return affectedEntities;
    }

    public void setAffectedEntities(AffectedEntities affectedEntities) {
        this.affectedEntities = affectedEntities;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.EVENT);
        bud.append(AppExportS.L2).append(s.ID).append(AppExportS.VE).append(id);
        bud.append(AppExportS.L2).append(s.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L2).append(AppExportS.EVENT_TIME).append(AppExportS.VE).append(eventTime);
        bud.append(AppExportS.L2).append(AppExportS.SEVERITY).append(AppExportS.VE).append(severity);
        bud.append(AppExportS.L2).append(AppExportS.SUMMARY).append(AppExportS.VE).append(summary);
        bud.append(AppExportS.L2).append(AppExportS.AFFECTED_ENTITIES);
        bud.append(affectedEntities.toString());
        bud.append(AppExportS.L2).append(AppExportS.MARKED_AS_READ).append(AppExportS.VE).append(markedAsRead);
        bud.append(AppExportS.L2).append(AppExportS.MARKED_AS_RESOLVED).append(AppExportS.VE).append(markedAsResolved);
        bud.append(AppExportS.L2).append(AppExportS.ARCHIVED).append(AppExportS.VE).append(archived);
        bud.append(AppExportS.L2).append(AppExportS.DEEP_LINK_URL).append(AppExportS.VE).append(deepURL);
        return bud.toString();
    }
    
}

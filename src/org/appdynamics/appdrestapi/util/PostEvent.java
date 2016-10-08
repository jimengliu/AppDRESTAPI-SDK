/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 */
public class PostEvent {
    private String summary;
    private String severity=s.SEVERITY_INFO;
    private String comment;
    private String eventType;
    private String customEventType=s.CUSTOM_V;
    private String node;
    private String tier;
    private String bt;
    private ArrayList<String> propertyKey=new ArrayList<String>();
    private ArrayList<String> propertyValue=new ArrayList<String>();
    
    /**
     * <p>
     *  The main requirement for the object is that a summary be provided.
     * If the user does provide either a node or bt value, then the user 
     * must provide a tier value, otherwise an exception will be thrown
     * during the URL creation method.
     * </p>
     * @param summary The summary for the event
     */
    public PostEvent(String summary){
        this.summary=summary;
    }
    
    public PostEvent(String summary, String comment){
        this.comment=comment;
        this.summary=summary;
    }
    
    public PostEvent(String summary,String comment, String customEventType){
        
        this.comment=comment;
        this.summary=summary;
        this.customEventType=customEventType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getCustomEventType() {
        return customEventType;
    }

    public void setCustomEventType(String customerEventType) {
        this.customEventType = customerEventType;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    
    public void addProperty(String key, String value){
        propertyKey.add(QueryEncoder.encode(key));
        propertyValue.add(QueryEncoder.encode(value));
    }
    
    //events?eventtype=CUSTOM&customeventtype=nagios&summary=test1&propertynames=key1&propertynames=key2&propertyvalues=value1&propertyvalues=value2
    public String createURL() throws Exception{
        
        if( (node != null || bt != null) && tier == null) throw new Exception("When providing a node or bt value, the tier value must also be provided.");
        
        if( summary == null ) throw new Exception("The summary parameter must be provided");
        
        StringBuilder bud = new StringBuilder();
        bud.append(s.EVENT_TYPE_CUSTOM);
        bud.append(s.EVENT_SUMMARY).append(QueryEncoder.encode(summary));
        if(customEventType != null)bud.append(s.CUSTOM_EVENT_TYPE).append(QueryEncoder.encode(customEventType));
        if(comment != null) bud.append(s.EVENT_COMMENT).append(QueryEncoder.encode(comment));
        if(tier != null) bud.append(s.EVENT_TIER).append(QueryEncoder.encode(tier));
        if(node != null) bud.append(s.EVENT_NODE).append(QueryEncoder.encode(node));
        if(bt != null) bud.append(s.EVENT_BT).append(QueryEncoder.encode(bt));
        if(severity != null) bud.append(s.EVENT_SEVERITY).append(severity);
        if(propertyKey.size() > 0){
            for(String key:propertyKey) bud.append(s.PROPERTY_NAMES).append(key);
            for(String val:propertyValue) bud.append(s.PROPERTY_VALUES).append(val);
        }
        return bud.toString();
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        
        boolean fnd=false;
        if(severity.equalsIgnoreCase(s.SEVERITY_WARN)) {this.severity=s.SEVERITY_WARN;fnd=true;}
        if(severity.equalsIgnoreCase(s.SEVERITY_ERROR)){this.severity=s.SEVERITY_ERROR;fnd=true;}
        if(severity.equalsIgnoreCase(s.SEVERITY_INFO)){this.severity=s.SEVERITY_INFO;fnd=true;}
        
        if(!fnd)
           this.severity = s.SEVERITY_INFO;
    }

    public ArrayList<String> getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(ArrayList<String> propertyKey) {
        this.propertyKey = propertyKey;
    }

    public ArrayList<String> getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(ArrayList<String> propertyValue) {
        this.propertyValue = propertyValue;
    }
    
    
   
}

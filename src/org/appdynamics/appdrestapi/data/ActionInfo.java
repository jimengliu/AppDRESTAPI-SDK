/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import java.util.Date;

/**
 *
 * @author soloink
 */
public class ActionInfo {
    private EntityType entityType;
    private String entityTypeDisplayName, name;
    private long id;
    private Date triggerTime;
  
    public ActionInfo(){}

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public String getEntityTypeDisplayName() {
        return entityTypeDisplayName;
    }

    public void setEntityTypeDisplayName(String entityTypeDisplayName) {
        this.entityTypeDisplayName = entityTypeDisplayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }
  
  
  
    
}

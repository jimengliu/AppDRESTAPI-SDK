/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

/**
 *
 * @author soloink
 */
public class EntityInfo {
    private EntityType entityType;
    private String entityTypeDisplayName,name;
    private long id;
    
    public EntityInfo(){}

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
  
  
  
    
}

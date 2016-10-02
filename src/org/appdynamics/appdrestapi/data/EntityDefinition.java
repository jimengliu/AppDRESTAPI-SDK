/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author gilbert.solorzano
 *
 */
/*
 * <affectedEntityDefinition>
    <entityType>APPLICATION_COMPONENT_NODE</entityType>
    <entityId>19903</entityId>
  </affectedEntityDefinition>
  * 
 */
public class EntityDefinition {
    private String entityType;
    private int entityId;
    
    public EntityDefinition(){}

    @XmlElement(name=AppExportS.ENTITY_TYPE)
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @XmlElement(name=AppExportS.ENTITY_ID)
    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.L3).append("EntityType :: ").append(entityType);
        bud.append(AppExportS.L3).append("EntityId :: ").append(entityId);
        return bud.toString();
    }
}

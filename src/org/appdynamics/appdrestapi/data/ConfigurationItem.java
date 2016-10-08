/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author gilbert.solorzano
 * 
 */

/*
<configuration-item>
=======
 */
/*
 * <configuration-item>
<name>machine.agent.max.new.actions.per.min</name>
<value>15</value>
<description>
Maximum number of new actions dispatched per minute for each machine agent
</description>
<updateable>true</updateable>
<scope>cluster</scope>
</configuration-item>
 */
public class ConfigurationItem {
    private String name,description,updateable,scope, value;
    
    public ConfigurationItem(){}

    @XmlElement(name=s.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=s.DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name=s.UPDATEABLE)
    public String getUpdateable() {
        return updateable;
    }

    public void setUpdateable(String updateable) {
        this.updateable = updateable;
    }

    @XmlElement(name=s.SCOPE)
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @XmlElement(name=s.VALUE)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(s.CONFIGURATION_ITEM);
        bud.append(AppExportS.L2).append(s.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(s.VALUE).append(AppExportS.VE).append(value);
        bud.append(AppExportS.L2).append(s.DESCRIPTION).append(AppExportS.VE).append(description);
        bud.append(AppExportS.L2).append(s.UPDATEABLE).append(AppExportS.VE).append(updateable);
        bud.append(AppExportS.L2).append(s.SCOPE).append(AppExportS.VE).append(scope); 
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + (this.updateable != null ? this.updateable.hashCode() : 0);
        hash = 53 * hash + (this.scope != null ? this.scope.hashCode() : 0);
        hash = 53 * hash + (this.value != null ? this.value.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConfigurationItem other = (ConfigurationItem) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if ((this.updateable == null) ? (other.updateable != null) : !this.updateable.equals(other.updateable)) {
            return false;
        }
        if ((this.scope == null) ? (other.scope != null) : !this.scope.equals(other.scope)) {
            return false;
        }
        if ((this.value == null) ? (other.value != null) : !this.value.equals(other.value)) {
            return false;
        }
        return true;
    }
    
    
    
}

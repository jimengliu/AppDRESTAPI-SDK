/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author gilbert.solorzano
 */
public class DashboardListObj {
    private int id;
    private String name, description,createdBy,modifiedBy;
    private long modifiedOn, createdOn;
    private boolean nameUnique, builtIn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isNameUnique() {
        return nameUnique;
    }

    public void setNameUnique(boolean nameUnique) {
        this.nameUnique = nameUnique;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("id=").append(id).append(", name=").append(name).append("\n");
        return bud.toString();
    }
    
    
    
}

/*
"id":525,"version":4,"name":"ATTUverse-IT-Prod_UVEnabler-MCM_JVMStats","nameUnique":false,"builtIn":false,
"createdBy":"vb599p","createdOn":1462904668950,"modifiedBy":"vb599p","modifiedOn":1462904765198,"description"
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 * L2_1
 * 
 */

@XmlSeeAlso({ExNodeMatchCriteria.class,ExHRNodeComponents.class,ExHRAppComponents .class})
public class ExAffectedInfraMatchCriteria {
    private String type;
    private ExNodeMatchCriteria nodeMatchCriteria;
    private ExHRNodeComponents nodeComp;
    private ExHRAppComponents  appComponents;
    private int level=7;
    
    public ExAffectedInfraMatchCriteria(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.NODE_MATCH_CRITERIA)
    public ExNodeMatchCriteria getNodeMatchCriteria() {
        return nodeMatchCriteria;
    }

    public void setNodeMatchCriteria(ExNodeMatchCriteria nodeMatchCriteria) {
        this.nodeMatchCriteria = nodeMatchCriteria;
    }

    @XmlElement(name=AppExportS.COMPONENTS)
    public ExHRNodeComponents getNodeComp() {
        return nodeComp;
    }

    public void setNodeComp(ExHRNodeComponents nodeComp) {
        this.nodeComp = nodeComp;
    }

    @XmlElement(name=AppExportS.APPLICATION_COMPONENTS)
    public ExHRAppComponents  getAppComponents() {
        return appComponents;
    }

    public void setAppComponents(ExHRAppComponents  appComponents) {
        this.appComponents = appComponents;
    }
    
    
    
    public String whatIsDifferent(ExAffectedInfraMatchCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_INFRA_MATCH_CRITERIA);
        level++;
        if(!type.equals(obj.getType())){     
            bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
            level--;
        }
        
        if(nodeMatchCriteria != null){
            nodeMatchCriteria.setLevel(level);
            bud.append(nodeMatchCriteria.whatIsDifferent(obj.getNodeMatchCriteria()));
        }else{
            if(obj.getNodeMatchCriteria() != null){
                obj.getNodeMatchCriteria().setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeMatchCriteria());
            }
        }
        
        if(nodeComp != null){
            nodeComp.setLevel(level);
            bud.append(nodeComp.whatIsDifferent(obj.getNodeComp()));
        }else{
            if(obj.getNodeComp() != null){
                obj.getNodeComp().setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeComp());
            }
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_INFRA_MATCH_CRITERIA);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(nodeMatchCriteria != null){ nodeMatchCriteria.setLevel(level);bud.append(nodeMatchCriteria);}
        if(nodeComp != null){ nodeComp.setLevel(level);bud.append(nodeComp);}
        if(appComponents != null){appComponents.setLevel(level);bud.append(appComponents);}
        level--;
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.XOpenPosition(level,AppExportS.AFFECTED_INFRA_MATCH_CRITERIA));
        level++;
        bud.append(AppExportS.XElement(level,AppExportS.TYPE,type));
        if(nodeMatchCriteria != null){ nodeMatchCriteria.setLevel(level);bud.append(nodeMatchCriteria);}
        if(nodeComp != null){ nodeComp.setLevel(level);bud.append(nodeComp);}
        if(appComponents != null){appComponents.setLevel(level);bud.append(appComponents.toXML());}
        level--;
        bud.append(AppExportS.XClosePosition(level,AppExportS.AFFECTED_INFRA_MATCH_CRITERIA));
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final ExAffectedInfraMatchCriteria other = (ExAffectedInfraMatchCriteria) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.nodeMatchCriteria != other.nodeMatchCriteria && (this.nodeMatchCriteria == null || !this.nodeMatchCriteria.equals(other.nodeMatchCriteria))) {
            return false;
        }
        if (this.nodeComp != other.nodeComp && (this.nodeComp == null || !this.nodeComp.equals(other.nodeComp))) {
            return false;
        }
        return true;
    }
    
    
}


/*
                <affected-infra-match-criteria>
                    <type>NODES</type>
                    <node-match-criteria>
                        <type>ANY</type>
                        <node-meta-info-match-criteria/>
                        <vm-sys-properties/>
                        <env-properties/>
                    </node-match-criteria>
                </affected-infra-match-criteria>


            <affected-infra-match-criteria>
                <type>SPECIFIC_TIERS</type>
                <application-components>
                    <application-component>rfi-02</application-component>
                </application-components>
            </affected-infra-match-criteria>

 * 
 */
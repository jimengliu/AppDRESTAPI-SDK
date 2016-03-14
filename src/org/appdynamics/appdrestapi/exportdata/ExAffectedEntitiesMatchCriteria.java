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
 * L2
 * 
 */

@XmlSeeAlso({ExAffectedBTMatchCriteria.class,ExAffectedInfraMatchCriteria.class,ExAffectedOverallCriteria.class})
public class ExAffectedEntitiesMatchCriteria {
    private ExAffectedBTMatchCriteria btCriteria;
    private ExAffectedInfraMatchCriteria infraCriteria;
    private ExAffectedOverallCriteria overallCriteria;

    private int level=6;
    
    public ExAffectedEntitiesMatchCriteria(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.AFFECTED_BT_MATCH_CRITERIA)
    public ExAffectedBTMatchCriteria getBtCriteria() {
        return btCriteria;
    }

    public void setBtCriteria(ExAffectedBTMatchCriteria btCriteria) {
        this.btCriteria = btCriteria;
    }

    @XmlElement(name=AppExportS.AFFECTED_INFRA_MATCH_CRITERIA)
    public ExAffectedInfraMatchCriteria getInfraCriteria() {
        return infraCriteria;
    }

    public void setInfraCriteria(ExAffectedInfraMatchCriteria infraCriteria) {
        this.infraCriteria = infraCriteria;
    }

    @XmlElement(name=AppExportS.OVERALL_AFFECTED_ENTITIES_MATCH_CRITERIA)
    public ExAffectedOverallCriteria getOverallCriteria() {
        return overallCriteria;
    }

    public void setOverallCriteria(ExAffectedOverallCriteria overallCriteria) {
        this.overallCriteria = overallCriteria;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA);
        level++;
        if(btCriteria != null){btCriteria.setLevel(level);bud.append(btCriteria);}
        if(infraCriteria != null){ infraCriteria.setLevel(level);bud.append(infraCriteria);}
        if(overallCriteria != null){ overallCriteria.setLevel(level);bud.append(overallCriteria);}
 
        level--;
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.XOpenPosition(level,AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA));
        level++;
        if(btCriteria != null){btCriteria.setLevel(level);bud.append(btCriteria);}
        if(infraCriteria != null){ infraCriteria.setLevel(level);bud.append(infraCriteria);}
        if(overallCriteria != null){ overallCriteria.setLevel(level);bud.append(overallCriteria);}
        
        level--;
        bud.append(AppExportS.XClosePosition(level,AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA));
        return bud.toString();
    }

    public String whatIsDifferent(ExAffectedEntitiesMatchCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA);
        level++;
        
        if(btCriteria != null){
            btCriteria.setLevel(level);
            bud.append(btCriteria.whatIsDifferent(obj.getBtCriteria()));
        }else{
            if(obj.getBtCriteria() != null){
                obj.getBtCriteria().setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getBtCriteria());
            }
        }
        if(infraCriteria != null){
            infraCriteria.setLevel(level);
            bud.append(infraCriteria.whatIsDifferent(obj.getInfraCriteria()));
        }else{
            if(obj.getInfraCriteria() != null){
                obj.getInfraCriteria().setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getInfraCriteria());
            }
        }
        
        if(overallCriteria != null){
            overallCriteria.setLevel(level);
            bud.append(overallCriteria.whatIsDifferent(obj.getOverallCriteria()));
        }else{
            if(obj.getOverallCriteria()!= null){
                obj.getOverallCriteria().setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getOverallCriteria());
            }
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.btCriteria != null ? this.btCriteria.hashCode() : 0);
        hash = 83 * hash + (this.infraCriteria != null ? this.infraCriteria.hashCode() : 0);
        hash = 83 * hash + (this.overallCriteria != null ? this.overallCriteria.hashCode() : 0);
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
        final ExAffectedEntitiesMatchCriteria other = (ExAffectedEntitiesMatchCriteria) obj;
        if (this.btCriteria != other.btCriteria && (this.btCriteria == null || !this.btCriteria.equals(other.btCriteria))) {
            return false;
        }
        if (this.infraCriteria != other.infraCriteria && (this.infraCriteria == null || !this.infraCriteria.equals(other.infraCriteria))) {
            return false;
        }
        if (this.overallCriteria != other.overallCriteria && (this.overallCriteria == null || !this.overallCriteria.equals(other.overallCriteria))) {
            return false;
        }
        return true;
    }
    
    
}


/*
            <affected-entities-match-criteria>
                <affected-bt-match-criteria>
                    <type>ALL</type>
                </affected-bt-match-criteria>
            </affected-entities-match-criteria>

        <affected-entities-match-criteria>
            <affected-infra-match-criteria>
                <type>SPECIFIC_TIERS</type>
                <application-components>
                    <application-component>rfi-02</application-component>
                </application-components>
            </affected-infra-match-criteria>
        </affected-entities-match-criteria>
            * 
 */
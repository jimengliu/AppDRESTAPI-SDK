/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 */

/*
            <ejb-rule>
                <enabled>true</enabled>
                <priority>0</priority>
                <ejb-name filter-type="CONTAINS" filter-value="CM9TaxServices"/>
                <match-method>
                    <name filter-type="CONTAINS" filter-value="updateFeeWaiver"/>
                </match-method>
            </ejb-rule>
*/
@XmlSeeAlso({ExMatchMethod.class,ExMatchEJBName.class})
public class ExEJBRule {
    private boolean enabled;
    private int priority;
    private int level=8;
    
    private ExMatchMethod matchMethod;
    private ExMatchEJBName matchEJB;
    
    public ExEJBRule(){}

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.PRIORITY)
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @XmlElement(name=AppExportS.MATCH_METHOD)
    public ExMatchMethod getMatchMethod() {
        return matchMethod;
    }

    public void setMatchMethod(ExMatchMethod matchMethod) {
        this.matchMethod = matchMethod;
    }

    @XmlElement(name=AppExportS.EJB_NAME)
    public ExMatchEJBName getMatchEJB() {
        return matchEJB;
    }

    public void setMatchEJB(ExMatchEJBName matchEJB) {
        this.matchEJB = matchEJB;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    

    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.EJB_RULE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.I[level]).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);

        
        if(matchMethod != null) matchMethod.setLevel(level);
        if(matchEJB != null) matchEJB.setLevel(level);

        bud.append(AppExportS.I[level]).append(AppExportS.EJB_NAME).append(matchEJB);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_METHOD).append(matchMethod);
        level--;
        return bud.toString();
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.enabled ? 1 : 0);
        hash = 47 * hash + this.priority;
        hash = 47 * hash + Objects.hashCode(this.matchMethod);
        hash = 47 * hash + Objects.hashCode(this.matchEJB);
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
        final ExEJBRule other = (ExEJBRule) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        if (!Objects.equals(this.matchMethod, other.matchMethod)) {
            return false;
        }
        if (!Objects.equals(this.matchEJB, other.matchEJB)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

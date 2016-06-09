/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 */

@XmlSeeAlso({ExPojoRule.class,ExPocoRule.class,ExServletRule.class,ExWebRule.class,ExEJBRule.class})
public class ExMatchRule {
    private ExPojoRule pojoRule;
    private ExPocoRule pocoRule;
    private ExServletRule servletRule;
    private ExWebRule webRule;
    private ExEJBRule ejbRule;
    private int level=7;
    
    public ExMatchRule(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.WEB_RULE)
    public ExWebRule getWebRule() {
        return webRule;
    }

    public void setWebRule(ExWebRule webRule) {
        this.webRule = webRule;
    }

    
    @XmlElement(name=AppExportS.POCO_RULE)
    public ExPocoRule getPocoRule() {
        return pocoRule;
    }

    public void setPocoRule(ExPocoRule pocoRule) {
        this.pocoRule = pocoRule;
    }
    
    @XmlElement(name=AppExportS.POJO_RULE)
    public ExPojoRule getPojoRule() {
        return pojoRule;
    }

    public void setPojoRule(ExPojoRule pojoRule) {
        this.pojoRule = pojoRule;
    }

    @XmlElement(name=AppExportS.SERVLET_RULE)
    public ExServletRule getServletRule() {
        return servletRule;
    }

    public void setServletRule(ExServletRule servletRule) {
        this.servletRule = servletRule;
    }

    @XmlElement(name=AppExportS.EJB_RULE)
    public ExEJBRule getEjbRule() {
        return ejbRule;
    }

    public void setEjbRule(ExEJBRule ejbRule) {
        this.ejbRule = ejbRule;
    }
    
    
    
    public String whatIsDifferent(ExMatchRule obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_RULE);
        level++;
        if(pojoRule != null && obj.getPojoRule() != null){
            pojoRule.setLevel(level);
            pojoRule.whatIsDifferent(obj.getPojoRule());
        }
        
        if(servletRule != null && obj.getServletRule()!= null){
            servletRule.setLevel(level);
            servletRule.whatIsDifferent(obj.getServletRule());
        }
        
        if(pocoRule != null && obj.getPocoRule() != null){
            pocoRule.setLevel(level);
            pocoRule.whatIsDifferent(obj.getPocoRule());
        }
        
        if(webRule != null && obj.getWebRule() != null){
            webRule.setLevel(level);
            webRule.whatIsDifferent(obj.getWebRule());
        }
        
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_RULE);
        level++;
        if(pojoRule != null) {pojoRule.setLevel(level);bud.append(pojoRule);}
        if(pocoRule != null) {pocoRule.setLevel(level);bud.append(pocoRule);}
        if(servletRule != null){servletRule.setLevel(level); bud.append(servletRule);}
        if(webRule != null){ webRule.setLevel(level);bud.append(webRule);}
        if(ejbRule != null){ejbRule.setLevel(level);bud.append(ejbRule);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.pojoRule);
        hash = 59 * hash + Objects.hashCode(this.pocoRule);
        hash = 59 * hash + Objects.hashCode(this.servletRule);
        hash = 59 * hash + Objects.hashCode(this.webRule);
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
        final ExMatchRule other = (ExMatchRule) obj;
        if (!Objects.equals(this.pojoRule, other.pojoRule)) {
            return false;
        }
        if (!Objects.equals(this.pocoRule, other.pocoRule)) {
            return false;
        }
        if (!Objects.equals(this.servletRule, other.servletRule)) {
            return false;
        }
        if (!Objects.equals(this.webRule, other.webRule)) {
            return false;
        }
        return true;
    }

    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.XOpen(s.MATCH_RULE));
        bud.append(servletRule.toXML());
        bud.append(AppExportS.I[level]).append(AppExportS.XClose(s.MATCH_RULE));
        return bud.toString();
    }
    
}

/*
        <match-rule>
            <servlet-rule>
                <enabled>true</enabled>
                <priority>10</priority>
                <uri filter-type="[CONTAINS]" filter-value="[CHECK]"/>
                <properties/>
            </servlet-rule>
        </match-rule>
*/

/*
                    <match-rule>
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>Cron4J</display-name>
                            <background>true</background>
                            <match-class type="inherits-from-class">
                                <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
                            </match-class>
                            <split-config type="4"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
                        </pojo-rule>
                    </match-rule>
 * 3
 */
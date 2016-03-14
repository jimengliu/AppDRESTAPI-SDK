/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.exportdata.ExHealthRule;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */

/*
 * <health-rules controller-version="003-009-003-000">
    <health-rule>
        <name>Check Node Metric</name>
        <type>INFRASTRUCTURE</type>
        <description/>
        <enabled>true</enabled>
        <is-default>false</is-default>
        <always-enabled>true</always-enabled>
        <duration-min>30</duration-min>
        <wait-time-min>30</wait-time-min>
        <affected-entities-match-criteria>
            <affected-infra-match-criteria>
                <type>ALL_TIERS</type>
            </affected-infra-match-criteria>
        </affected-entities-match-criteria>
        <critical-execution-criteria>
            <entity-aggregation-scope>
                <type>ANY</type>
                <value>0</value>
            </entity-aggregation-scope>
            <policy-condition>
                <type>leaf</type>
                <display-name>condition 1</display-name>
                <condition-value-type>BASELINE_STANDARD_DEVIATION</condition-value-type>
                <condition-value>1</condition-value>
                <operator>NOT_EQUALS</operator>
                <condition-expression/>
                <use-active-baseline>true</use-active-baseline>
                <metric-expression>
                    <type>leaf</type>
                    <function-type>VALUE</function-type>
                    <value>0</value>
                    <is-literal-expression>false</is-literal-expression>
                    <display-name>null</display-name>
                    <metric-definition>
                        <type>LOGICAL_METRIC</type>
                        <logical-metric-name>JVM|Garbage Collection|GC Time Spent Per Min (ms)</logical-metric-name>
                    </metric-definition>
                </metric-expression>
            </policy-condition>
        </critical-execution-criteria>
    </health-rule>
</health-rules>
 * 
 */
@XmlSeeAlso(ExHealthRule.class)
@XmlRootElement(name=AppExportS.HEALTH_RULES)
public class HealthRules {
    private int level=0;
    private String controllerVersion;
    private ArrayList<ExHealthRule> healthRules=new ArrayList<ExHealthRule>();
    
    public HealthRules(){}

    @XmlAttribute(name=AppExportS.CONTROLLER_VERSION)
    public String getControllerVersion() {
        return controllerVersion;
    }

    public void setControllerVersion(String controllerVersion) {
        this.controllerVersion = controllerVersion;
    }

    @XmlElement(name=AppExportS.HEALTH_RULE)
    public ArrayList<ExHealthRule> getHealthRules() {
        return healthRules;
    }

    public void setHealthRules(ArrayList<ExHealthRule> healthRules) {
        this.healthRules = healthRules;
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
        bud.append(AppExportS.I[level]).append(AppExportS.HEALTH_RULES);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.CONTROLLER_VERSION).append(AppExportS.VE).append(controllerVersion);
        for(ExHealthRule val: healthRules){val.setLevel(level); bud.append(val);}
        level--;
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.XOpenAttr(AppExportS.HEALTH_RULES));
        bud.append(AppExportS.XAttribute(AppExportS.CONTROLLER_VERSION, controllerVersion));
        level++;
        for(ExHealthRule val: healthRules){val.setLevel(level); bud.append(val);}
        level--;
        bud.append(AppExportS.I[level]).append(AppExportS.XClose(AppExportS.HEALTH_RULES));
        return bud.toString();
    }
}

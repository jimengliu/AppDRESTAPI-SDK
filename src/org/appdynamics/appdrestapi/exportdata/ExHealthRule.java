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
 * L1_1
 * 
 */
//@XmlSeeAlso({ExAffectedEntitiesMatchCriteria.class,ExHRExecutionCriteria.class})
public class ExHealthRule {
    private String name,type,descr,schedule;
    private boolean enabled,isDefault,alwaysEnabled;
    private Integer durationMin,waitTime;
    private ExAffectedEntitiesMatchCriteria affectedEntitiesMC;
    private ExHRExecutionCriteria critical,warning;
    private int level=2;
    
    
    public ExHealthRule(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.DESCRIPTION)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.IS_DEFAULT)
    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @XmlElement(name=AppExportS.ALWAYS_ENABLED)
    public boolean isAlwaysEnabled() {
        return alwaysEnabled;
    }

    public void setAlwaysEnabled(boolean alwaysEnabled) {
        this.alwaysEnabled = alwaysEnabled;
    }

    @XmlElement(name=AppExportS.DURATION_MIN)
    public Integer getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
    }

    @XmlElement(name=AppExportS.WAIT_TIME_MIN)
    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    @XmlElement(name=AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA)
    public ExAffectedEntitiesMatchCriteria getAffectedEntitiesMC() {
        return affectedEntitiesMC;
    }

    public void setAffectedEntitiesMC(ExAffectedEntitiesMatchCriteria affectedEntitiesMC) {
        this.affectedEntitiesMC = affectedEntitiesMC;
    }

    @XmlElement(name=AppExportS.CRITICAL_EXECUTION_CRITERIA)
    public ExHRExecutionCriteria getCritical() {
        return critical;
    }

    public void setCritical(ExHRExecutionCriteria critical) {
        this.critical = critical;
        this.critical.setName(AppExportS.CRITICAL_EXECUTION_CRITERIA);
    }

    @XmlElement(name=AppExportS.WARNING_EXECUTION_CRITERIA)
    public ExHRExecutionCriteria getWarning() {
        return warning;
    }

    public void setWarning(ExHRExecutionCriteria warning) {
        this.warning = warning;
        this.warning.setName(AppExportS.WARNING_EXECUTION_CRITERIA);
    }

    @XmlElement(name=AppExportS.SCHEDULE)
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.XOpen(AppExportS.HEALTH_RULE));
        level++;
        bud.append(AppExportS.XElement(level, AppExportS.NAME, name));
        bud.append(AppExportS.XElement(level, AppExportS.TYPE,type));
        bud.append(AppExportS.XElement(level, AppExportS.DESCRIPTION,descr));
        bud.append(AppExportS.XElement(level, AppExportS.ENABLED,enabled));
        bud.append(AppExportS.XElement(level, AppExportS.IS_DEFAULT,isDefault));
        bud.append(AppExportS.XElement(level, AppExportS.ALWAYS_ENABLED,alwaysEnabled));
        bud.append(AppExportS.XElement(level, AppExportS.DURATION_MIN,durationMin));
        bud.append(AppExportS.XElement(level, AppExportS.WAIT_TIME_MIN,waitTime));
        if(schedule != null) { bud.append(AppExportS.XElement(level, AppExportS.SCHEDULE,schedule));}
        level--;
        bud.append(AppExportS.I[level]).append(AppExportS.XClose(AppExportS.HEALTH_RULE));
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.HEALTH_RULE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(descr);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.I[level]).append(AppExportS.IS_DEFAULT).append(AppExportS.VE).append(isDefault);
        bud.append(AppExportS.I[level]).append(AppExportS.ALWAYS_ENABLED).append(AppExportS.VE).append(alwaysEnabled);
        bud.append(AppExportS.I[level]).append(AppExportS.DURATION_MIN).append(AppExportS.VE).append(durationMin);
        bud.append(AppExportS.I[level]).append(AppExportS.WAIT_TIME_MIN).append(AppExportS.VE).append(waitTime);
        
        if(schedule != null){ bud.append(AppExportS.I[level]).append(AppExportS.SCHEDULE).append(AppExportS.VE).append(schedule);}
        
        if(affectedEntitiesMC != null) affectedEntitiesMC.setLevel(level);
        bud.append(affectedEntitiesMC);
        
        if(critical != null){critical.setLevel(level);bud.append(critical);}
        if(warning != null){warning.setLevel(level);bud.append(warning);}
        level--;
        return bud.toString();
    }

    public String whatIsDifferent(ExHealthRule obj){
        if(this.equals(obj)) return AppExportS._U;
        if(!name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.HEALTH_RULE);
        level++;
         bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
         if(!type.equals(obj.getType())){     
            bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
            level--;
        }
         
         if(!descr.equals(obj.getDescr())){     
            bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(descr);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDescr());   
            level--;
        }
         
         if(enabled != obj.isEnabled()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());   
            level--;
        }
         // -- here
         if(isDefault != obj.isIsDefault()){     
            bud.append(AppExportS.I[level]).append(AppExportS.IS_DEFAULT);
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(isDefault);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isIsDefault());   
        }
         if(enabled != obj.isEnabled()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());   
            level--;
        }
         
         if(durationMin != obj.getDurationMin()){     
            bud.append(AppExportS.I[level]).append(AppExportS.DURATION_MIN);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(durationMin);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDurationMin());  
            level--;
        }
         
         if(waitTime != obj.getWaitTime()){     
            bud.append(AppExportS.I[level]).append(AppExportS.WAIT_TIME_MIN);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(waitTime);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getWaitTime());   
            level--;
        }
        
         if(schedule != null ){
              if(!schedule.equals(obj.getSchedule())){     
                    bud.append(AppExportS.I[level]).append(AppExportS.SCHEDULE);
                    level++;
                    bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(schedule);
                    bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getSchedule());   
                    level--;
             }
         }else{
             if(obj.getSchedule()!= null){
                    bud.append(AppExportS.I[level]).append(AppExportS.SCHEDULE);
                    level++;
                    bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(schedule);
                    bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getSchedule());
                    level++;
             }
         }
         
         // affectedEntitiesMC
         //critical,warning
         if(affectedEntitiesMC != null){
             affectedEntitiesMC.setLevel(level);
            bud.append(affectedEntitiesMC.whatIsDifferent(obj.getAffectedEntitiesMC()));
         }else{
             if(obj.getAffectedEntitiesMC()!= null){
                 obj.getAffectedEntitiesMC().setLevel(level);
                    bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_ENTITIES);
                    bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(schedule);
                    bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getAffectedEntitiesMC().toString());
             }
         }
         
         if(critical != null){
             critical.setName(AppExportS.CRITICAL_EXECUTION_CRITERIA);
             critical.setLevel(level);
             bud.append(critical.whatIsDifferent(obj.getCritical()));
         }else{
             if(obj.getCritical()!=null){
                    obj.getCritical().setName(AppExportS.CRITICAL_EXECUTION_CRITERIA);
                    obj.setLevel(level);
                    bud.append(AppExportS.I[level]).append(AppExportS.CRITICAL);
                    bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(critical);
                    bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getCritical());
             }
         }
         
         if(warning != null){
             warning.setLevel(level);
             warning.setName(AppExportS.WARNING_EXECUTION_CRITERIA);
             bud.append(warning.whatIsDifferent(obj.getWarning()));
         }else{
             if(obj.getWarning()!=null){
                    obj.getWarning().setLevel(level);
                    obj.getWarning().setName(AppExportS.WARNING_EXECUTION_CRITERIA);
                    bud.append(AppExportS.I[level]).append(AppExportS.WARNING);
                    bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getWarning());
             }
         }
         
         level--;
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 53 * hash + (this.descr != null ? this.descr.hashCode() : 0);
        hash = 53 * hash + (this.schedule != null ? this.schedule.hashCode() : 0);
        hash = 53 * hash + (this.enabled ? 1 : 0);
        hash = 53 * hash + (this.isDefault ? 1 : 0);
        hash = 53 * hash + (this.alwaysEnabled ? 1 : 0);
        hash = 53 * hash + (this.durationMin != null ? this.durationMin.hashCode() : 0);
        hash = 53 * hash + (this.waitTime != null ? this.waitTime.hashCode() : 0);
        hash = 53 * hash + (this.affectedEntitiesMC != null ? this.affectedEntitiesMC.hashCode() : 0);
        hash = 53 * hash + (this.critical != null ? this.critical.hashCode() : 0);
        hash = 53 * hash + (this.warning != null ? this.warning.hashCode() : 0);
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
        final ExHealthRule other = (ExHealthRule) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.descr == null) ? (other.descr != null) : !this.descr.equals(other.descr)) {
            return false;
        }
        if ((this.schedule == null) ? (other.schedule != null) : !this.schedule.equals(other.schedule)) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.isDefault != other.isDefault) {
            return false;
        }
        if (this.alwaysEnabled != other.alwaysEnabled) {
            return false;
        }
        if (this.durationMin != other.durationMin && (this.durationMin == null || !this.durationMin.equals(other.durationMin))) {
            return false;
        }
        if (this.waitTime != other.waitTime && (this.waitTime == null || !this.waitTime.equals(other.waitTime))) {
            return false;
        }
        if (this.affectedEntitiesMC != other.affectedEntitiesMC && (this.affectedEntitiesMC == null || !this.affectedEntitiesMC.equals(other.affectedEntitiesMC))) {
            return false;
        }
        if (this.critical != other.critical && (this.critical == null || !this.critical.equals(other.critical))) {
            return false;
        }
        if (this.warning != other.warning && (this.warning == null || !this.warning.equals(other.warning))) {
            return false;
        }
        return true;
    }
    
    
    
}
/*
 * <health-rule>
            <name>Business Transaction response time is much higher than normal</name>
            <type>BUSINESS_TRANSACTION</type>
            <description>Average Response Time (ms) is &gt; 2 : 3 standard deviation of the default baseline and CALLS_PER_MINUTE is &gt; 50 per minute for the last 30 minutes</description>
            <enabled>true</enabled>
            <is-default>true</is-default>
            <always-enabled>true</always-enabled>
            <duration-min>30</duration-min>
            <wait-time-min>30</wait-time-min>
            <affected-entities-match-criteria>
                <affected-bt-match-criteria>
                    <type>ALL</type>
                </affected-bt-match-criteria>
            </affected-entities-match-criteria>
            <critical-execution-criteria>
                <entity-aggregation-scope>
                    <type>AGGREGATE</type>
                    <value>0</value>
                </entity-aggregation-scope>
                <policy-condition>
                    <type>boolean</type>
                    <operator>AND</operator>
                    <condition1>
                        <type>leaf</type>
                        <display-name>Average Response Time (ms) Baseline Condition</display-name>
                        <condition-value-type>BASELINE_STANDARD_DEVIATION</condition-value-type>
                        <condition-value>3</condition-value>
                        <operator>GREATER_THAN</operator>
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
                                <logical-metric-name>Average Response Time (ms)</logical-metric-name>
                            </metric-definition>
                        </metric-expression>
                    </condition1>
                    <condition2>
                        <type>leaf</type>
                        <display-name>Calls per Minute Condition</display-name>
                        <condition-value-type>ABSOLUTE</condition-value-type>
                        <condition-value>50</condition-value>
                        <operator>GREATER_THAN</operator>
                        <condition-expression/>
                        <use-active-baseline>false</use-active-baseline>
                        <metric-expression>
                            <type>leaf</type>
                            <function-type>VALUE</function-type>
                            <value>0</value>
                            <is-literal-expression>false</is-literal-expression>
                            <display-name>null</display-name>
                            <metric-definition>
                                <type>LOGICAL_METRIC</type>
                                <logical-metric-name>Calls per Minute</logical-metric-name>
                            </metric-definition>
                        </metric-expression>
                    </condition2>
                </policy-condition>
            </critical-execution-criteria>
            <warning-execution-criteria>
                <entity-aggregation-scope>
                    <type>AGGREGATE</type>
                    <value>0</value>
                </entity-aggregation-scope>
                <policy-condition>
                    <type>boolean</type>
                    <operator>AND</operator>
                    <condition1>
                        <type>leaf</type>
                        <display-name>Average Response Time (ms) Baseline Condition</display-name>
                        <condition-value-type>BASELINE_STANDARD_DEVIATION</condition-value-type>
                        <condition-value>2</condition-value>
                        <operator>GREATER_THAN</operator>
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
                                <logical-metric-name>Average Response Time (ms)</logical-metric-name>
                            </metric-definition>
                        </metric-expression>
                    </condition1>
                    <condition2>
                        <type>leaf</type>
                        <display-name>Calls per Minute Condition</display-name>
                        <condition-value-type>ABSOLUTE</condition-value-type>
                        <condition-value>100</condition-value>
                        <operator>GREATER_THAN</operator>
                        <condition-expression/>
                        <use-active-baseline>false</use-active-baseline>
                        <metric-expression>
                            <type>leaf</type>
                            <function-type>VALUE</function-type>
                            <value>0</value>
                            <is-literal-expression>false</is-literal-expression>
                            <display-name>null</display-name>
                            <metric-definition>
                                <type>LOGICAL_METRIC</type>
                                <logical-metric-name>Calls per Minute</logical-metric-name>
                            </metric-definition>
                        </metric-expression>
                    </condition2>
                </policy-condition>
            </warning-execution-criteria>
        </health-rule>
 */

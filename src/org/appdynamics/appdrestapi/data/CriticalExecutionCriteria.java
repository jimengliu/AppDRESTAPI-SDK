/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 * 
 */
/*
 * L1_1
 *      <critical-execution-criteria>
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
        * 
 */
@XmlSeeAlso({EntityAggregationScope.class,PolicyCondition.class,MetricExpression.class,MetricDefinition.class})
public class CriticalExecutionCriteria {
    private EntityAggregationScope entityAggregationScope;
    private PolicyCondition policyCondition;
    
    public CriticalExecutionCriteria(){}

    @XmlElement(name=AppExportS.ENTITY_AGGREGATION_SCOPE)
    public EntityAggregationScope getEntityAggregationScope() {
        return entityAggregationScope;
    }

    public void setEntityAggregationScope(EntityAggregationScope entityAggregationScope) {
        this.entityAggregationScope = entityAggregationScope;
    }

    @XmlElement(name=AppExportS.POLICY_CONDITION)
    public PolicyCondition getPolicyCondition() {
        return policyCondition;
    }

    public void setPolicyCondition(PolicyCondition policyCondition) {
        this.policyCondition = policyCondition;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L1_1).append(AppExportS.CRITICAL_EXECUTION_CRITERIA);
            bud.append(entityAggregationScope.toString());
            bud.append(policyCondition.toString());
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L1_1).append(AppExportS.XOpen(AppExportS.CRITICAL_EXECUTION_CRITERIA));
            bud.append(entityAggregationScope.toXML());
            bud.append(policyCondition.toXML());
            bud.append(AppExportS.L1_1).append(AppExportS.XClose(AppExportS.CRITICAL_EXECUTION_CRITERIA));
        return bud.toString();
    }
    
}

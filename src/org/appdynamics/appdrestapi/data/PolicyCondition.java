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
 * L2
 * 
 */
/*
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
            * 
 */

@XmlSeeAlso({MetricExpression.class,MetricDefinition.class})
public class PolicyCondition {
    private String type;
    private String displayName;
    private String conditionValueType;
    private String conditionValue;
    private String operator;
    private String conditionExpression;
    private String useActiveBaseline;
    private MetricExpression metricExpression;
    
    public PolicyCondition(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.DISPLAY_NAME)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @XmlElement(name=AppExportS.CONDITION_VALUE_TYPE)
    public String getConditionValueType() {
        return conditionValueType;
    }

    public void setConditionValueType(String conditionValueType) {
        this.conditionValueType = conditionValueType;
    }

    @XmlElement(name=AppExportS.CONDITION_VALUE)
    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    @XmlElement(name=AppExportS.OPERATOR)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @XmlElement(name=AppExportS.CONDITION_EXPRESSION)
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    @XmlElement(name=AppExportS.USE_ACTIVE_BASELINE)
    public String getUseActiveBaseline() {
        return useActiveBaseline;
    }

    public void setUseActiveBaseline(String useActiveBaseline) {
        this.useActiveBaseline = useActiveBaseline;
    }

    @XmlElement(name=AppExportS.METRIC_EXPRESSION)
    public MetricExpression getMetricExpression() {
        return metricExpression;
    }

    public void setMetricExpression(MetricExpression metricExpression) {
        this.metricExpression = metricExpression;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.POLICY_CONDITION);
        bud.append(AppExportS.L2_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L2_1).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
        bud.append(AppExportS.L2_1).append(AppExportS.CONDITION_VALUE_TYPE).append(AppExportS.VE).append(conditionValueType);
        bud.append(AppExportS.L2_1).append(AppExportS.CONDITION_VALUE).append(AppExportS.VE).append(conditionValue);
        bud.append(AppExportS.L2_1).append(AppExportS.OPERATOR).append(AppExportS.VE).append(operator);
        bud.append(AppExportS.L2_1).append(AppExportS.CONDITION_EXPRESSION).append(AppExportS.VE).append(conditionExpression);
        bud.append(AppExportS.L2_1).append(AppExportS.USE_ACTIVE_BASELINE).append(AppExportS.VE).append(useActiveBaseline);
        bud.append(metricExpression.toString());
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L2).append(AppExportS.XOpen(AppExportS.POLICY_CONDITION));
            bud.append(AppExportS.XElement(4, AppExportS.TYPE, type));
            bud.append(AppExportS.XElement(4, AppExportS.DISPLAY_NAME, displayName));
            bud.append(AppExportS.XElement(4, AppExportS.CONDITION_VALUE_TYPE, conditionValueType));
            bud.append(AppExportS.XElement(4, AppExportS.CONDITION_VALUE, conditionValue));
            bud.append(AppExportS.XElement(4, AppExportS.OPERATOR, operator));
            bud.append(AppExportS.XElement(4, AppExportS.CONDITION_EXPRESSION, conditionExpression));
            bud.append(AppExportS.XElement(4, AppExportS.USE_ACTIVE_BASELINE, useActiveBaseline));
            bud.append(metricExpression.toXML());
            bud.append(AppExportS.L2).append(AppExportS.XClose(AppExportS.POLICY_CONDITION));
        return bud.toString();
    }
}

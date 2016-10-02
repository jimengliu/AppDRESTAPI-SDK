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
 */
/*
 * L2_1
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
                * 
 */
@XmlSeeAlso(MetricDefinition.class)
public class MetricExpression {
    private String type;
    private String value;
    private String isLiteralExpression;
    private String displayName;
    private MetricDefinition metricDef;
    
    
    public MetricExpression(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.VALUE)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlElement(name=AppExportS.IS_LITERAL_EXPRESSION)
    public String getIsLiteralExpression() {
        return isLiteralExpression;
    }

    public void setIsLiteralExpression(String isLiteralExpression) {
        this.isLiteralExpression = isLiteralExpression;
    }
    
    @XmlElement(name=AppExportS.DISPLAY_NAME)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @XmlElement(name=AppExportS.METRIC_DEFINITION)
    public MetricDefinition getMetricDef() {
        return metricDef;
    }

    public void setMetricDef(MetricDefinition metricDef) {
        this.metricDef = metricDef;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L2_1).append(AppExportS.METRIC_EXPRESSION);
            bud.append(AppExportS.L3).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
            bud.append(AppExportS.L3).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
            bud.append(AppExportS.L3).append(AppExportS.IS_LITERAL_EXPRESSION).append(AppExportS.VE).append(isLiteralExpression);
            bud.append(AppExportS.L3).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
            bud.append(metricDef.toString());
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
            bud.append(AppExportS.L2_1).append(AppExportS.XOpen(AppExportS.METRIC_EXPRESSION));
            bud.append(AppExportS.XElement(5, AppExportS.TYPE, type));
            bud.append(AppExportS.XElement(5, AppExportS.VALUE, value));
            bud.append(AppExportS.XElement(5, AppExportS.IS_LITERAL_EXPRESSION, isLiteralExpression));
            bud.append(AppExportS.XElement(5, AppExportS.DISPLAY_NAME, displayName));
            bud.append(AppExportS.L2_1).append(AppExportS.XClose(AppExportS.METRIC_EXPRESSION));
        return bud.toString();
    }
}

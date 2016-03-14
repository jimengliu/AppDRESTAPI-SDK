/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 */

public class ExHRNameValueCriteria {
    private String name;
    private ArrayList<ExNameValue> nameValues=new ArrayList<ExNameValue>();
    private int level=7;
    
    public ExHRNameValueCriteria(){}

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.NAME_VALUE)
    public ArrayList<ExNameValue> getNameValues() {
        return nameValues;
    }

    public void setNameValues(ArrayList<ExNameValue> nameValues) {
        this.nameValues = nameValues;
    }
    
     public String whatIsDifferent(ExHRNameValueCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(name);
        level++;
        for(ExNameValue value:nameValues){
            boolean fnd=false;
            value.setLevel(level);
            for(ExNameValue _value:obj.getNameValues()){
                if(value.getName().equals(_value.getName())){
                    bud.append(value.whatIsDifferent(_value));fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.NAME_VALUE);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            }
        }
        
        for(ExNameValue value:obj.getNameValues()){
            boolean fnd=false;
            value.setLevel(level);
            for(ExNameValue _value:nameValues){
                if(value.getName().equals(_value.getName())){
                    bud.append(value.whatIsDifferent(_value));fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.NAME_VALUE);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);
            }
        }
        
        
        level--;
        return bud.toString();
     }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(name);
        level++;
        for(ExNameValue val: nameValues){val.setLevel(level);bud.append(val);}
        level--;
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.XOpenPosition(level, name));
        level++;
        for(ExNameValue val: nameValues){val.setLevel(level);bud.append(val);}
        level--;
        bud.append(AppExportS.XClosePosition(level, name));
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.nameValues != null ? this.nameValues.hashCode() : 0);
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
        final ExHRNameValueCriteria other = (ExHRNameValueCriteria) obj;
        
        for(ExNameValue value:nameValues){
            boolean fnd=false;
            value.setLevel(level);
            for(ExNameValue _value:other.getNameValues()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value)) fnd=true;
                }
            }
            if(!fnd){
                return false;
            }
        }
        return true;
    }
    
    
}

/*
 * <node-meta-info-match-criteria>
<name-value>
<name>meta1</name>
<value>yup</value>
</name-value>
<name-value>
<name>meta2</name>
<value>yup1</value>
</name-value>
</node-meta-info-match-criteria> ExNameValue
 * 
 */
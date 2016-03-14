/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author gilbert.solorzano
 * 
 * L3
 */

@XmlSeeAlso({ExHRAppComponents.class,ExHRAppComponents.class,ExHRBusinessTransaction.class})
public class ExAffectedBTMatchCriteria {
    private String type;
    private ExHRAppComponents appComponents;
    private ArrayList<ExHRBusinessTransaction> bts=new ArrayList<ExHRBusinessTransaction>();
    private String matchType,matchPattern;
    private boolean inverse;
    private int level=7;
    
    public ExAffectedBTMatchCriteria(){}

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

    @XmlElement(name=AppExportS.APPLICATION_COMPONENTS)
    public ExHRAppComponents getAppComponents() {
        return appComponents;
    }

    public void setAppComponents(ExHRAppComponents appComponents) {
        this.appComponents = appComponents;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION)
    public ArrayList<ExHRBusinessTransaction> getBts() {
        return bts;
    }

    public void setBts(ArrayList<ExHRBusinessTransaction> bts) {
        this.bts = bts;
    }

    @XmlElement(name=AppExportS.MATCH_TYPE)
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @XmlElement(name=AppExportS.MATCH_PATTERN)
    public String getMatchPattern() {
        return matchPattern;
    }

    public void setMatchPattern(String matchPattern) {
        this.matchPattern = matchPattern;
    }

    @XmlElement(name=AppExportS.INVERSE)
    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }
    
    public String whatIsDifferent(ExAffectedBTMatchCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_BT_MATCH_CRITERIA);
        
        if(!type.equals(obj.getType())){     
            bud.append(AppExportS.L2_1).append(AppExportS.DESCRIPTION);
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
        }
        
        if(appComponents != null){
            appComponents.setLevel(level);
            bud.append(appComponents.whatIsDifferent(obj.getAppComponents()));
        }else{
            if(obj.getAppComponents()!=null){
                        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
                        level++;
                    for(String value: obj.getAppComponents().getAppComponent()){
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);
                    }
                    level--;
            }
        }
        
        for(ExHRBusinessTransaction value: bts){
            boolean fnd=false;
            value.setLevel(level);
            for(ExHRBusinessTransaction _value:obj.getBts()){
                  if(value.equals(_value))fnd=true;
            }
            if(!fnd) bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
        }
        
        for(ExHRBusinessTransaction value: obj.getBts()){
            boolean fnd=false;
            value.setLevel(level);
            for(ExHRBusinessTransaction _value:bts){
                  if(value.equals(_value))fnd=true;
            }
            if(!fnd) bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);
        }
        
        if(matchType != null ){
            if(!matchType.equals(obj.getMatchType())){
                bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(matchType);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType()); 
                level--;
            }
            if(!matchPattern.equals(obj.getMatchPattern())){
                bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(matchPattern);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchPattern()); 
                level--;
            }
            if(inverse != obj.isInverse()){
                bud.append(AppExportS.I[level]).append(AppExportS.INVERSE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(inverse);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isInverse());  
                level--;
            }
        }
        
        level--;
        return bud.toString();
     }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_BT_MATCH_CRITERIA);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(appComponents != null){appComponents.setLevel(level);bud.append(appComponents);}
        if(!bts.isEmpty()){
            for(ExHRBusinessTransaction bt:bts){bt.setLevel(level); bud.append(bt);}
        }
        if(matchType != null){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.I[level]).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        }
        
        //private String matchType,matchPattern;
        //private boolean inverse;
        
        level--;
        return bud.toString();
    }
    
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.XOpenPosition(level,AppExportS.AFFECTED_BT_MATCH_CRITERIA));
        level++;
        bud.append(AppExportS.XElement(level, AppExportS.TYPE, type));
        if(appComponents != null){
            appComponents.setLevel(level);bud.append(appComponents.toXML());
        }
        if(bts.size() > 0){
            for(ExHRBusinessTransaction bt:bts){ bt.setLevel(level);bud.append(bt.toXML());}
        }
        if(matchType != null){
            bud.append(AppExportS.XElement(level, AppExportS.MATCH_TYPE, matchType));
            bud.append(AppExportS.XElement(level, AppExportS.MATCH_PATTERN, matchPattern));
            bud.append(AppExportS.XElement(level, AppExportS.INVERSE, inverse));
        }
        level--;
        bud.append(AppExportS.I[level]).append(AppExportS.XClose(AppExportS.AFFECTED_BT_MATCH_CRITERIA));
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.type);
        hash = 13 * hash + Objects.hashCode(this.appComponents);
        hash = 13 * hash + Objects.hashCode(this.bts);
        hash = 13 * hash + Objects.hashCode(this.matchType);
        hash = 13 * hash + Objects.hashCode(this.matchPattern);
        hash = 13 * hash + (this.inverse ? 1 : 0);
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
        final ExAffectedBTMatchCriteria other = (ExAffectedBTMatchCriteria) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }

        if (!Objects.equals(this.bts, other.bts)) {
            return false;
        }
        if (!Objects.equals(this.matchType, other.matchType)) {
            return false;
        }
        if (!Objects.equals(this.matchPattern, other.matchPattern)) {
            return false;
        }
        if (this.inverse != other.inverse) {
            return false;
        }
        
        if(bts.size() != other.getBts().size()) return false;
        
        for(ExHRBusinessTransaction value: bts){
            boolean fnd=false;
            value.setLevel(level);
            for(ExHRBusinessTransaction _value:other.getBts()){
                  if(value.equals(_value))fnd=true;
            }
            if(!fnd) return false;
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
 */
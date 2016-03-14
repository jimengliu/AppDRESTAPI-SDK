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
 * L3
 */

@XmlSeeAlso({ExHRNodeTypes.class,ExHRNodes.class,ExHRNameValueCriteria.class})
public class ExNodeMatchCriteria {
    private String type;
    private String matchType,matchPattern;
    private boolean inverse;
    private ExHRNameValueCriteria nodeMetaInfoMatchCriteria;
    private ExHRNameValueCriteria vmSysProperties;
    private ExHRNameValueCriteria envProperties;
    private ExHRNodeTypes nodeTypes;
    private ExHRNodes nodes;
    private int level=5;
    
    
    public ExNodeMatchCriteria(){}

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

    @XmlElement(name=AppExportS.NODE_META_INFO_MATCH_CRITERIA)
    public ExHRNameValueCriteria getNodeMetaInfoMatchCriteria() {
        return nodeMetaInfoMatchCriteria;
    }

    public void setNodeMetaInfoMatchCriteria(ExHRNameValueCriteria nodeMetaInfoMatchCriteria) {
        this.nodeMetaInfoMatchCriteria = nodeMetaInfoMatchCriteria;
        this.nodeMetaInfoMatchCriteria.setName(AppExportS.NODE_META_INFO_MATCH_CRITERIA);
    }

    @XmlElement(name=AppExportS.VM_SYS_PROPERTIES)
    public ExHRNameValueCriteria getVmSysProperties() {
        return vmSysProperties;
    }

    public void setVmSysProperties(ExHRNameValueCriteria vmSysProperties) {
        this.vmSysProperties = vmSysProperties;
        this.vmSysProperties.setName(AppExportS.VM_SYS_PROPERTIES);
    }

    @XmlElement(name=AppExportS.ENV_PROPERTIES)
    public ExHRNameValueCriteria getEnvProperties() {
        return envProperties;
    }

    public void setEnvProperties(ExHRNameValueCriteria envProperties) {
        this.envProperties = envProperties;
        this.envProperties.setName(AppExportS.ENV_PROPERTIES);
    }

    @XmlElement(name=AppExportS.NODE_TYPES)
    public ExHRNodeTypes getNodeTypes() {
        return nodeTypes;
    }

    public void setNodeTypes(ExHRNodeTypes nodeTypes) {
        this.nodeTypes = nodeTypes;
    }

    @XmlElement(name=AppExportS.NODES)
    public ExHRNodes getNodes() {
        return nodes;
    }

    public void setNodes(ExHRNodes nodes) {
        this.nodes = nodes;
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
    
    public String whatIsDifferent(ExNodeMatchCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.NODE_MATCH_CRITERIA);
        level++;
        
        
        if(!type.equals(obj.getType())){
                bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType()); 
                level--;
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
        
        if(nodeTypes != null){
                nodeTypes.setLevel(level);
                bud.append(nodeTypes.whatIsDifferent(obj.getNodeTypes()));
        }else{
            if(obj.getNodeTypes() != null){
                obj.getNodeTypes().setLevel(level);
               bud.append(AppExportS.I[level]).append(AppExportS.NODE_TYPES);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeTypes());
            }
        }
        
        if(nodes != null){
                nodes.setLevel(level);
                bud.append(nodes.whatIsDifferent(obj.getNodes()));
        }else{
            if(obj.getNodes() != null){
                obj.getNodes().setLevel(level);
               bud.append(AppExportS.I[level]).append(AppExportS.NODES);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodes());
            }
            
        }
        
        if(nodeMetaInfoMatchCriteria != null){
                nodeMetaInfoMatchCriteria.setLevel(level);
                bud.append(nodeMetaInfoMatchCriteria.whatIsDifferent(obj.getNodeMetaInfoMatchCriteria()));
        }else{
            if(obj.getNodeMetaInfoMatchCriteria() != null){
                obj.getNodeMetaInfoMatchCriteria().setLevel(level);
               bud.append(AppExportS.I[level]).append(AppExportS.NODE_META_INFO_MATCH_CRITERIA);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeMetaInfoMatchCriteria());
            }
            
        }
        
        if(vmSysProperties != null){
            vmSysProperties.setLevel(level);
            bud.append(vmSysProperties.whatIsDifferent(obj.getVmSysProperties()));
        }else{
            if(obj.getVmSysProperties()!= null){
                obj.getVmSysProperties().setLevel(level);
               bud.append(AppExportS.I[level]).append(AppExportS.VM_SYS_PROPERTIES);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeMetaInfoMatchCriteria());
            }
            
        }
        
        if(envProperties != null){
            envProperties.setLevel(level);
            bud.append(envProperties.whatIsDifferent(obj.getEnvProperties()));
        }else{
            if(obj.getEnvProperties() != null){
                obj.getEnvProperties().setLevel(level);
               bud.append(AppExportS.I[level]).append(AppExportS.ENV_PROPERTIES);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEnvProperties());
            }
            
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NODE_MATCH_CRITERIA);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(matchType != null){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.I[level]).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        }
        if(nodeTypes != null){ nodeTypes.setLevel(level);bud.append(nodeTypes);}
        if(nodes != null){nodes.setLevel(level); bud.append(nodes);}
        if(nodeMetaInfoMatchCriteria != null){ nodeMetaInfoMatchCriteria.setLevel(level);bud.append(AppExportS.L3).append(AppExportS.NODE_META_INFO_MATCH_CRITERIA);bud.append(nodeMetaInfoMatchCriteria);}
        if(vmSysProperties != null){ vmSysProperties.setLevel(level);bud.append(AppExportS.L3).append(AppExportS.VM_SYS_PROPERTIES);bud.append(vmSysProperties);}
        if(envProperties != null){ envProperties.setLevel(level);bud.append(AppExportS.L3).append(AppExportS.ENV_PROPERTIES);bud.append(envProperties);}
        
        level--;
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.XOpenPosition(level,AppExportS.NODE_MATCH_CRITERIA));
        level++;
        bud.append(AppExportS.XElement(level,AppExportS.TYPE,type));
        if(matchType != null){
            bud.append(AppExportS.XElement(level,AppExportS.MATCH_TYPE,matchType));
            bud.append(AppExportS.XElement(level,AppExportS.MATCH_PATTERN,matchPattern));
            bud.append(AppExportS.XElement(level,AppExportS.INVERSE,inverse));
        }
        if(nodeTypes != null){ nodeTypes.setLevel(level);bud.append(nodeTypes);}
        if(nodes != null){nodes.setLevel(level); bud.append(nodes);}
        if(nodeMetaInfoMatchCriteria != null){ nodeMetaInfoMatchCriteria.setLevel(level);bud.append(AppExportS.L3).append(AppExportS.NODE_META_INFO_MATCH_CRITERIA);bud.append(nodeMetaInfoMatchCriteria);}
        if(vmSysProperties != null){ vmSysProperties.setLevel(level);bud.append(AppExportS.L3).append(AppExportS.VM_SYS_PROPERTIES);bud.append(vmSysProperties);}
        if(envProperties != null){ envProperties.setLevel(level);bud.append(AppExportS.L3).append(AppExportS.ENV_PROPERTIES);bud.append(envProperties);}
        
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 79 * hash + (this.matchType != null ? this.matchType.hashCode() : 0);
        hash = 79 * hash + (this.matchPattern != null ? this.matchPattern.hashCode() : 0);
        hash = 79 * hash + (this.inverse ? 1 : 0);
        hash = 79 * hash + (this.nodeMetaInfoMatchCriteria != null ? this.nodeMetaInfoMatchCriteria.hashCode() : 0);
        hash = 79 * hash + (this.vmSysProperties != null ? this.vmSysProperties.hashCode() : 0);
        hash = 79 * hash + (this.envProperties != null ? this.envProperties.hashCode() : 0);
        hash = 79 * hash + (this.nodeTypes != null ? this.nodeTypes.hashCode() : 0);
        hash = 79 * hash + (this.nodes != null ? this.nodes.hashCode() : 0);
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
        final ExNodeMatchCriteria other = (ExNodeMatchCriteria) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.matchType == null) ? (other.matchType != null) : !this.matchType.equals(other.matchType)) {
            return false;
        }
        if ((this.matchPattern == null) ? (other.matchPattern != null) : !this.matchPattern.equals(other.matchPattern)) {
            return false;
        }
        if (this.inverse != other.inverse) {
            return false;
        }
        if (this.nodeMetaInfoMatchCriteria != other.nodeMetaInfoMatchCriteria && (this.nodeMetaInfoMatchCriteria == null || !this.nodeMetaInfoMatchCriteria.equals(other.nodeMetaInfoMatchCriteria))) {
            return false;
        }
        if (this.vmSysProperties != other.vmSysProperties && (this.vmSysProperties == null || !this.vmSysProperties.equals(other.vmSysProperties))) {
            return false;
        }
        if (this.envProperties != other.envProperties && (this.envProperties == null || !this.envProperties.equals(other.envProperties))) {
            return false;
        }
        if (this.nodeTypes != other.nodeTypes && (this.nodeTypes == null || !this.nodeTypes.equals(other.nodeTypes))) {
            return false;
        }
        if (this.nodes != other.nodes && (this.nodes == null || !this.nodes.equals(other.nodes))) {
            return false;
        }
        return true;
    }
    
    
}


/*
                      
                   
                    <node-match-criteria>
                        <type>ANY</type>
                        <node-meta-info-match-criteria/>
                        <vm-sys-properties/>
                        <env-properties/>
                    </node-match-criteria>
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * 
 * 
 * @author gilbert.solorzano
 */
/*
 * <ejb-name filter-type="CONTAINS" filter-value="CM9TaxServices"/>
 *  We should make the filter-type an enumeration but this will work as well.

 */
public class ExMatchEJBName {
    private String filterType;
    private String filterValue;
    private int level=10;
    
    public ExMatchEJBName(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlAttribute(name=AppExportS.FILTER_TYPE)
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @XmlAttribute(name=AppExportS.FILTER_VALUE)
    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }
    
    
    public String whatIsDifferent(ExMatchEJBName obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
    
        if(!filterType.equals(obj.getFilterType())){
            bud.append(AppExportS.I[level]).append(AppExportS.FILTER_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(filterType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getFilterType()); 
            level--;
        }
        
        if(!filterValue.equals(obj.getFilterValue())){
            bud.append(AppExportS.I[level]).append(AppExportS.FILTER_VALUE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(filterValue);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getFilterValue());
            level--;
        }
        
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.FILTER_TYPE).append(AppExportS.VE).append(filterType);
        bud.append(AppExportS.I[level]).append(AppExportS.FILTER_VALUE).append(AppExportS.VE).append(filterValue);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.filterType != null ? this.filterType.hashCode() : 0);
        hash = 97 * hash + (this.filterValue != null ? this.filterValue.hashCode() : 0);
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
        final ExMatchEJBName other = (ExMatchEJBName) obj;
        if ((this.filterType == null) ? (other.filterType != null) : !this.filterType.equals(other.filterType)) {
            return false;
        }
        if ((this.filterValue == null) ? (other.filterValue != null) : !this.filterValue.equals(other.filterValue)) {
            return false;
        }
        return true;
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.XOpenAttr("uri"))
                .append(AppExportS.XAttribute(AppExportS.FILTER_TYPE, filterType))
                .append(AppExportS.XAttribute(AppExportS.FILTER_VALUE, filterValue))
                .append(AppExportS.XCT);
        return bud.toString();
    }
    
}

/*
<uri filter-type="[CONTAINS]" filter-value="[CHECK]"/>
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
        

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */
@XmlRootElement(name=AppExportS.APPLICATION)
@XmlSeeAlso(ExDashboardWidget.class)
public class ExDashboardJson {
    private String schemaVersion, dashboardFormatVersion, name, description, properties, templateEntityType, startDate, endDate, canvasType, layoutType;
    private long minutesBeforeAnchorTime, refreshInterval, backgroundColor, height, width;
    private boolean template, warRoom;
    private int level=1;
    private ArrayList<ExDashboardWidget> widgetTemplates=new ArrayList<ExDashboardWidget>();
    
    
    public ExDashboardJson(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.WIDGET_TEMPLATES)
    public ArrayList<ExDashboardWidget> getWidgetTemplates() {
        return widgetTemplates;
    }

    public void setWidgetTemplates(ArrayList<ExDashboardWidget> widgetTemplates) {
        this.widgetTemplates = widgetTemplates;
    }

    @XmlElement(name=AppExportS.SCHEMA_VERSION)
    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    @XmlElement(name=AppExportS.DASHBOARD_FORMAT_VERSION)
    public String getDashboardFormatVersion() {
        return dashboardFormatVersion;
    }

    public void setDashboardFormatVersion(String dashboardFormatVersion) {
        this.dashboardFormatVersion = dashboardFormatVersion;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name=AppExportS.PROPERTIES)
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @XmlElement(name=AppExportS.TEMPLATE_ENTITY_TYPE)
    public String getTemplateEntityType() {
        return templateEntityType;
    }

    public void setTemplateEntityType(String templateEntityType) {
        this.templateEntityType = templateEntityType;
    }

    @XmlElement(name=AppExportS.START_DATE)
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @XmlElement(name=AppExportS.END_DATE)
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @XmlElement(name=AppExportS.CANVAS_TYPE)
    public String getCanvasType() {
        return canvasType;
    }

    public void setCanvasType(String canvasType) {
        this.canvasType = canvasType;
    }

    @XmlElement(name=AppExportS.LAYOUT_TYPE)
    public String getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    @XmlElement(name=AppExportS.MINUTES_BEFORE_ANCHOR_TIME)
    public long getMinutesBeforeAnchorTime() {
        return minutesBeforeAnchorTime;
    }

    public void setMinutesBeforeAnchorTime(long minutesBeforeAnchorTime) {
        this.minutesBeforeAnchorTime = minutesBeforeAnchorTime;
    }

    @XmlElement(name=AppExportS.REFRESH_INTERVAL)
    public long getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(long refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    @XmlElement(name=AppExportS.BACKGROUND_COLOR)
    public long getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(long backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @XmlElement(name=AppExportS.HEIGHT)
    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @XmlElement(name=AppExportS.WIDTH)
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @XmlElement(name=AppExportS.TEMPLATE)
    public boolean isTemplate() {
        return template;
    }

    public void setTemplate(boolean template) {
        this.template = template;
    }

    @XmlElement(name=AppExportS.WAR_ROOM)
    public boolean isWarRoom() {
        return warRoom;
    }

    public void setWarRoom(boolean warRoom) {
        this.warRoom = warRoom;
    }
    
    /*
        This is going to be the base for the call so the level is 1
    
    */
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.CANVAS_TYPE).append(AppExportS.VE).append(canvasType);
        bud.append(AppExportS.I[level]).append(AppExportS.TEMPLATE).append(AppExportS.VE).append(template);
        bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
        for(ExDashboardWidget wid:widgetTemplates) {wid.setLevel(level);bud.append(wid);}
        level--;
        return bud.toString();
    }
    
}

/*
     "schemaVersion": null,
    "dashboardFormatVersion": "3.0",
    "name": "QA Dashboard",
    "description": "",
    "properties": null,
    "templateEntityType": null,
    "associatedEntityTemplates": null,
    "minutesBeforeAnchorTime": 30,
    "startDate": "01/01/1970 03:00:00",
    "endDate": "01/01/1970 03:00:00",
    "refreshInterval": 120000,
    "backgroundColor": 13685977,
    "color": 13685977,
    "height": 768,
    "width": 1024,
    "canvasType": "CANVAS_TYPE_GRID",
    "layoutType": "",
    "widgetTemplates": [
    "template": false,
    "warRoom": false
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */
public class ExDashboardWidget {
    private String widgetType, title, label, description, drillDownUrl, backgroundColors, useAutomaticFontSize, legendPosition, isGlobal, propertiesMap, dataSeriesTemplates, verticalAxisLabel, horizontalAxisLabel, axisType;
    private String stackMode, multipleYAxis, showEvents, eventFilterTemplate,backgroundColorStr;
    private long legendColumnCount, startTime, endTime, minutesBeforeAnchorTime,backgroundColor, color, fontSize, borderThickness, borderColor, backgroundAlpha, height, width, x, y;
    private int level=2;
    private boolean borderEnabled, showValues, compactMode, showTimeRange, renderIn3D, showLegend, useMetricBrowserAsDrillDown, interpolateDataGaps, hideHorizontalAxis;

    public ExDashboardWidget(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    @XmlElement(name=AppExportS.WIDGET_TYPE)
    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    @XmlElement(name=AppExportS.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name=AppExportS.LABEL)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @XmlElement(name=AppExportS.DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name=AppExportS.DRILL_DOWN_URL)
    public String getDrillDownUrl() {
        return drillDownUrl;
    }

    public void setDrillDownUrl(String drillDownUrl) {
        this.drillDownUrl = drillDownUrl;
    }

    @XmlElement(name=AppExportS.BACKGROUND_COLORS)
    public String getBackgroundColors() {
        return backgroundColors;
    }

    public void setBackgroundColors(String backgroundColors) {
        this.backgroundColors = backgroundColors;
    }

    @XmlElement(name=AppExportS.USE_AUTOMATIC_FONT_SIZE)
    public String getUseAutomaticFontSize() {
        return useAutomaticFontSize;
    }

    public void setUseAutomaticFontSize(String useAutomaticFontSize) {
        this.useAutomaticFontSize = useAutomaticFontSize;
    }

    @XmlElement(name=AppExportS.LEGEND_POSITION)
    public String getLegendPosition() {
        return legendPosition;
    }

    public void setLegendPosition(String legendPosition) {
        this.legendPosition = legendPosition;
    }

    @XmlElement(name=AppExportS.IS_GLOBAL)
    public String getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(String isGlobal) {
        this.isGlobal = isGlobal;
    }

    @XmlElement(name=AppExportS.PROPERTIES_MAP)
    public String getPropertiesMap() {
        return propertiesMap;
    }

    public void setPropertiesMap(String propertiesMap) {
        this.propertiesMap = propertiesMap;
    }

    @XmlElement(name=AppExportS.DATA_SERIES_TEMPLATES)
    public String getDataSeriesTemplates() {
        return dataSeriesTemplates;
    }

    public void setDataSeriesTemplates(String dataSeriesTemplates) {
        this.dataSeriesTemplates = dataSeriesTemplates;
    }

    @XmlElement(name=AppExportS.VERTICAL_AXIS_LABEL)
    public String getVerticalAxisLabel() {
        return verticalAxisLabel;
    }

    public void setVerticalAxisLabel(String verticalAxisLabel) {
        this.verticalAxisLabel = verticalAxisLabel;
    }

    @XmlElement(name=AppExportS.HORIZONTAL_AXIS_LABEL)
    public String getHorizontalAxisLabel() {
        return horizontalAxisLabel;
    }

    public void setHorizontalAxisLabel(String horizontalAxisLabel) {
        this.horizontalAxisLabel = horizontalAxisLabel;
    }

    @XmlElement(name=AppExportS.AXIS_TYPE)
    public String getAxisType() {
        return axisType;
    }

    public void setAxisType(String axisType) {
        this.axisType = axisType;
    }

    @XmlElement(name=AppExportS.STACK_MODE)
    public String getStackMode() {
        return stackMode;
    }

    public void setStackMode(String stackMode) {
        this.stackMode = stackMode;
    }

    @XmlElement(name=AppExportS.MULTIPLE_Y_AXIS)
    public String getMultipleYAxis() {
        return multipleYAxis;
    }

    public void setMultipleYAxis(String multipleYAxis) {
        this.multipleYAxis = multipleYAxis;
    }

    @XmlElement(name=AppExportS.SHOW_EVENTS)
    public String getShowEvents() {
        return showEvents;
    }

    public void setShowEvents(String showEvents) {
        this.showEvents = showEvents;
    }

    @XmlElement(name=AppExportS.EVENT_FILTER_TEMPLATE)
    public String getEventFilterTemplate() {
        return eventFilterTemplate;
    }

    public void setEventFilterTemplate(String eventFilterTemplate) {
        this.eventFilterTemplate = eventFilterTemplate;
    }

    @XmlElement(name=AppExportS.BACKGROUND_COLOR_STR)
    public String getBackgroundColorStr() {
        return backgroundColorStr;
    }

    public void setBackgroundColorStr(String backgroundColorStr) {
        this.backgroundColorStr = backgroundColorStr;
    }

    @XmlElement(name=AppExportS.LEGEND_COLUMN_COUNT)
    public long getLegendColumnCount() {
        return legendColumnCount;
    }

    public void setLegendColumnCount(long legendColumnCount) {
        this.legendColumnCount = legendColumnCount;
    }

    @XmlElement(name=AppExportS.START_TIME)
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    @XmlElement(name=AppExportS.END_TIME)
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @XmlElement(name=AppExportS.MINUTES_BEFORE_ANCHOR_TIME)
    public long getMinutesBeforeAnchorTime() {
        return minutesBeforeAnchorTime;
    }

    public void setMinutesBeforeAnchorTime(long minutesBeforeAnchorTime) {
        this.minutesBeforeAnchorTime = minutesBeforeAnchorTime;
    }

    @XmlElement(name=AppExportS.BACKGROUND_COLOR)
    public long getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(long backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @XmlElement(name=AppExportS.COLOR)
    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    @XmlElement(name=AppExportS.FONT_SIZE)
    public long getFontSize() {
        return fontSize;
    }

    public void setFontSize(long fontSize) {
        this.fontSize = fontSize;
    }

    @XmlElement(name=AppExportS.BORDER_THICKNESS)
    public long getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(long borderThickness) {
        this.borderThickness = borderThickness;
    }

    @XmlElement(name=AppExportS.BORDER_COLOR)
    public long getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(long borderColor) {
        this.borderColor = borderColor;
    }

    @XmlElement(name=AppExportS.BACKGROUND_ALPHA)
    public long getBackgroundAlpha() {
        return backgroundAlpha;
    }

    public void setBackgroundAlpha(long backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
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

    @XmlElement(name=AppExportS.X)
    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    @XmlElement(name=AppExportS.Y)
    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    @XmlElement(name=AppExportS.BORDER_ENABLED)
    public boolean isBorderEnabled() {
        return borderEnabled;
    }

    public void setBorderEnabled(boolean borderEnabled) {
        this.borderEnabled = borderEnabled;
    }

    @XmlElement(name=AppExportS.SHOW_VALUES)
    public boolean isShowValues() {
        return showValues;
    }

    public void setShowValues(boolean showValues) {
        this.showValues = showValues;
    }

    @XmlElement(name=AppExportS.COMPACT_MODE)
    public boolean isCompactMode() {
        return compactMode;
    }

    public void setCompactMode(boolean compactMode) {
        this.compactMode = compactMode;
    }

    @XmlElement(name=AppExportS.SHOW_TIME_RANGE)
    public boolean isShowTimeRange() {
        return showTimeRange;
    }

    public void setShowTimeRange(boolean showTimeRange) {
        this.showTimeRange = showTimeRange;
    }

    @XmlElement(name=AppExportS.RENDER_IN_3D)
    public boolean isRenderIn3D() {
        return renderIn3D;
    }

    public void setRenderIn3D(boolean renderIn3D) {
        this.renderIn3D = renderIn3D;
    }

    @XmlElement(name=AppExportS.SHOW_LEGEND)
    public boolean isShowLegend() {
        return showLegend;
    }

    public void setShowLegend(boolean showLegend) {
        this.showLegend = showLegend;
    }

    @XmlElement(name=AppExportS.USE_METRIC_BROWSER_AS_DRILL_DOWN)
    public boolean isUseMetricBrowserAsDrillDown() {
        return useMetricBrowserAsDrillDown;
    }

    public void setUseMetricBrowserAsDrillDown(boolean useMetricBrowserAsDrillDown) {
        this.useMetricBrowserAsDrillDown = useMetricBrowserAsDrillDown;
    }

    @XmlElement(name=AppExportS.INTERPOLATE_DATA_GAPS)
    public boolean isInterpolateDataGaps() {
        return interpolateDataGaps;
    }

    public void setInterpolateDataGaps(boolean interpolateDataGaps) {
        this.interpolateDataGaps = interpolateDataGaps;
    }

    @XmlElement(name=AppExportS.HIDE_HORIZONTAL_AXIS)
    public boolean isHideHorizontalAxis() {
        return hideHorizontalAxis;
    }

    public void setHideHorizontalAxis(boolean hideHorizontalAxis) {
        this.hideHorizontalAxis = hideHorizontalAxis;
    }
    
    
    /*
    private String widgetType, title, label, description, drillDownUrl, backgroundColors, useAutomaticFontSize, legendPosition, isGlobal, propertiesMap, dataSeriesTemplates, verticalAxisLabel, horizontalAxisLabel, axisType;
    private String stackMode, multipleYAxis, showEvents, eventFilterTemplate,backgroundColorStr;
    private long legendColumnCount, startTime, endTime, minutesBeforeAnchorTime,backgroundColor, color, fontSize, borderThickness, borderColor, backgroundAlpha, height, width, x, y;
    private boolean borderEnabled, showValues, compactMode, showTimeRange, renderIn3D, showLegend, useMetricBrowserAsDrillDown, interpolateDataGaps, hideHorizontalAxis;
    */
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.TITLE).append(AppExportS.VE).append(title);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.WIDGET_TYPE).append(AppExportS.VE).append(widgetType);
        bud.append(AppExportS.I[level]).append(AppExportS.LABEL).append(AppExportS.VE).append(label);
        bud.append(AppExportS.I[level]).append(AppExportS.DRILL_DOWN_URL).append(AppExportS.VE).append(drillDownUrl);
        level--;
        return bud.toString();
    }
    
}

/*

            "borderEnabled": false,
            "showValues": false,
            "compactMode": false,
            "showTimeRange": false,
            "renderIn3D": false,
            "showLegend": true,
            "useMetricBrowserAsDrillDown": true,
            "interpolateDataGaps": false,
            "hideHorizontalAxis": true,
            "widgetType": "GraphWidget",
            "title": "Business Transaction Response Time",
            "label": null,
            "description": "",
            "drillDownUrl": "",
            "backgroundColors": null,
            "useAutomaticFontSize": null,
            "legendPosition": "POSITION_BOTTOM",
            "isGlobal": true,
            "propertiesMap": null,
            "dataSeriesTemplates": null,
            "verticalAxisLabel": "",
            "horizontalAxisLabel": "",
            "axisType": "LINEAR",
            "stackMode": null,
            "multipleYAxis": null,
            "showEvents": null,
            "eventFilterTemplate": null,
            "legendColumnCount": 3,
            "startTime": 10800000,
            "endTime": 10800000,
            "minutesBeforeAnchorTime": 30
            "backgroundColorsStr": "16777215,16777215",
            "backgroundColor": 16777215,
            "color": 4210752,
            "fontSize": 12,
            "borderThickness": 0,
            "borderColor": 14408667,
            "backgroundAlpha": 1,
            "height": 4,
            "width": 8,
            "x": 0,
            "y": 0,

*/

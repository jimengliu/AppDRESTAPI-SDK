/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;


import java.util.Calendar;

/**
 *
 * @author soloink
 * 
 * This class is meant to help manage time ranges using long type variables.
 */
public class TimeRange {
    protected String name;
    protected long start;
    protected long end;
    
    public TimeRange(){};
    
    public TimeRange(String name){this.name=name;}
    
    public TimeRange(long start, long end){
        this.start=start;
        this.end=end;
    }
    
    /**
     * <p> This will create a time range with all of the parameters necessary
     * </p>
     * @param name The name of the time range
     * @param start The start time in milliseconds
     * @param end The end time in milliseconds
     */
    public TimeRange(String name, long start, long end){
        this.name=name;
        this.start=start;
        this.end=end;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
    
    /**
     * <p>This will determine if a particular timestamp is within the time range.
     * </p>
     * @param time The time in milliseconds
     * @return True or False if the time is within
     */
    public boolean withIn(long time){
        if(time >= start && time <= end) return true;
        return false;
        
    }
    
    /**
     * <p> 
     *    This will check if a TimeRange is within this instance of the time range.
     * </p>
     * @param time The time in milliseconds
     * @return True or False if the time is within
     */
    public boolean withIn(TimeRange time){
        if(time.start >= start && time.end <= end) return true;
        return false;
    }
    
    public String getDate(long val){
        java.util.Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(val);
        
        return cal.getTime().toString();
    }
    
    public String createName(){
        Calendar cal1=Calendar.getInstance();
        Calendar cal2=Calendar.getInstance();
        cal1.setTimeInMillis(start);
        cal2.setTimeInMillis(end);
        
        StringBuilder bud=new StringBuilder();
        bud.append(cal1.getTime().toString()).append(" thru ").append(cal2.getTime().toString());
        return bud.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getColumnName(){
        StringBuilder bud=new StringBuilder();
        Calendar cal=Calendar.getInstance();
        cal.setTimeInMillis(start);
        bud.append(cal.get(Calendar.MONTH) + 1).append("/");
        bud.append(cal.get(Calendar.DAY_OF_MONTH)).append("/").append(cal.get(Calendar.YEAR));
        return bud.toString();
    }
    
    public String getHourColumnName(){
        StringBuilder bud=new StringBuilder();
        Calendar cal=Calendar.getInstance();
        cal.setTimeInMillis(start);
        bud.append(cal.get(Calendar.MONTH) + 1).append("/");
        bud.append(cal.get(Calendar.DAY_OF_MONTH)).append("/").append(cal.get(Calendar.YEAR));
        bud.append(" ").append(cal.get(Calendar.HOUR_OF_DAY)).append(":00");
        return bud.toString();
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append("Time range\n");
        bud.append("\t\tStart time ").append(getDate(start)).append(" :: ").append(start).append("\n");
        bud.append("\t\tEnd time ").append(getDate(end)).append(" :: ").append(end).append("\n");
        
        return bud.toString();
    }
    
    
}

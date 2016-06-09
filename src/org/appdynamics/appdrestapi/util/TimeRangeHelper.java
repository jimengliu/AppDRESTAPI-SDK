/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;


import java.util.logging.Logger;
import java.util.logging.Level;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 */
public class TimeRangeHelper {
    private static Logger logger=Logger.getLogger(TimeRangeHelper.class.getName());
    
    public static ArrayList<TimeRange> getTimeRanges(int interval){
        Calendar cal1=Calendar.getInstance();
        // First we are going to zero out the time 0000
        cal1.set(Calendar.HOUR_OF_DAY, 0);cal1.set(Calendar.SECOND,0);cal1.set(Calendar.MINUTE, 0);
        Calendar cal2=Calendar.getInstance();cal2.setTimeInMillis(cal1.getTimeInMillis());
        cal2.add(Calendar.HOUR, -24);
        
        ArrayList<TimeRange> value = new ArrayList<TimeRange>();
        
        value.add(new TimeRange(cal2.getTimeInMillis(),cal1.getTimeInMillis()));
        
        for(int i=1; i < interval;i++){
            cal1.add(Calendar.HOUR, -24);
            cal2.add(Calendar.HOUR, -24);
            value.add(new TimeRange(cal2.getTimeInMillis(),cal1.getTimeInMillis()));
        }
        Collections.reverse(value);
        return value;
    }
    
    public static TimeRange getTimeRange(int interval){
        Calendar cal1=Calendar.getInstance();
        // First we are going to zero out the time 0000
        cal1.set(Calendar.HOUR_OF_DAY, 0);cal1.set(Calendar.SECOND,0);
        cal1.set(Calendar.MINUTE, 0);cal1.set(Calendar.MILLISECOND, 0);
        Calendar cal2=Calendar.getInstance();cal2.setTimeInMillis(cal1.getTimeInMillis());
        cal2.add(Calendar.HOUR, -24);
        
        for(int i=1; i < interval; i++)  cal2.add(Calendar.HOUR, -24);
        
        return new TimeRange(cal2.getTimeInMillis(),cal1.getTimeInMillis());
    }
    
    /*
            Start is 15 : 15 - 5 = 10
            Start is 10 : 10 - 5 = 5
    */
    public static TimeRange getTimeRange(int interval, int subset){
        Calendar cal1=Calendar.getInstance();
        // First we are going to zero out the time 0000
        cal1.set(Calendar.HOUR_OF_DAY, 0);cal1.set(Calendar.SECOND,0);
        cal1.set(Calendar.MINUTE, 0);cal1.set(Calendar.MILLISECOND, 0);
        Calendar cal2=Calendar.getInstance();cal2.setTimeInMillis(cal1.getTimeInMillis());
        logger.log(Level.INFO,"The end is  " + cal1.getTime().toString());
        cal1.add(Calendar.HOUR, -1 * (24 * (interval - subset)) );
        logger.log(Level.INFO,"The end after is " + cal1.getTime().toString() + " subtracting " + (interval - subset));
        // 
        
        cal2.add(Calendar.HOUR, -1 * (24 * (interval )) );
        
        if(s.debugLevel > 2) { 
            logger.log(Level.INFO,new StringBuilder().append("The end is ").append((24 * (interval - subset))/24).append(" start is ").append((24 * (interval ))/24).toString());
            logger.log(Level.INFO,new StringBuilder().append("The start time is ").append(cal2.getTime().toString()).append("\nThe end time is ").append(cal1.getTime().toString()).toString());
        }
        
        return new TimeRange(cal2.getTimeInMillis(),cal1.getTimeInMillis());
        
    }
    
    /*
     *  In this example cal2 points to the start and cal1 points to the end.
     */
    public static TimeRange getTimeRange(long start, long end){
        return new TimeRange(start,end);
    }
    
    public static ArrayList<TimeRange> getTimeRanges(long start, long end){
        Calendar cal1=Calendar.getInstance();
        Calendar cal2=Calendar.getInstance();
        cal1.setTimeInMillis(end);
        cal2.setTimeInMillis(start);
        boolean createdOne=true;
        int count=0;
        
        ArrayList<TimeRange> value=new ArrayList<TimeRange>();
        while(createdOne){
            Calendar cal3=Calendar.getInstance();
            cal3.setTimeInMillis(cal2.getTimeInMillis());
            cal3.add(Calendar.HOUR, 24);
            if(count==0 && (cal3.getTimeInMillis() > cal1.getTimeInMillis())){
                // This case will cover when the time stamp is smaller than 24 hours
                value.add(new TimeRange(cal2.getTimeInMillis(),cal1.getTimeInMillis()));
                createdOne=false;
                count++;
            }else{
                if(cal3.getTimeInMillis() > cal1.getTimeInMillis() && cal1.getTimeInMillis() > cal2.getTimeInMillis()){
                    value.add(new TimeRange(cal2.getTimeInMillis(),cal1.getTimeInMillis()));
                    count++;
                    createdOne=false;
                }else{
                    value.add(new TimeRange(cal2.getTimeInMillis(),cal3.getTimeInMillis()));
                    cal2.setTimeInMillis(cal3.getTimeInMillis());
                    count++;
                    
                }
                
            }
        }
        
        
        return value;
    }
    
    public static ArrayList<TimeRange> getHourlyTimeRanges(long start, long end){
        ArrayList<TimeRange> value=new ArrayList<TimeRange>();
        Calendar cal1=Calendar.getInstance();
        Calendar cal2=Calendar.getInstance();
       
       
        // We are going to zero out the seconds and minutes
        cal1.setTimeInMillis(start);
        cal1.set(Calendar.SECOND,0);cal1.set(Calendar.MINUTE, 0);cal1.set(Calendar.MILLISECOND, 0);
        cal2.setTimeInMillis(end);
        cal2.set(Calendar.SECOND,0);cal2.set(Calendar.MINUTE, 0);cal2.set(Calendar.MILLISECOND, 0);
        //logger.log(Level.INFO,new StringBuilder().append("Start with ").append(cal1.getTime().toString()).append(" ending ").append(cal2.getTime()).toString());
        int count=0;
        boolean createOne=true;
        Calendar cal3;
        while(createOne){
            cal3=Calendar.getInstance();
            cal3.setTimeInMillis(cal1.getTimeInMillis());
            cal3.add(Calendar.HOUR, 1);
            if(count==0 && (cal3.getTimeInMillis() > cal2.getTimeInMillis())){
                // This case will cover when the time stamp is smaller than 24 hours
                value.add(new TimeRange(cal1.getTimeInMillis(),cal2.getTimeInMillis()));
                createOne=false;
                count++;
            }else{
                //logger.log(Level.INFO,new StringBuilder().append("\nCheck of ").append(cal3.getTime().toString()).append(" > ").append(cal2.getTime())
                //        .append(" and ").append(cal2.getTime().toString()).append(" > ").append(cal1.getTime()).toString());
                if(cal3.getTimeInMillis() >= cal2.getTimeInMillis() && cal2.getTimeInMillis() > cal1.getTimeInMillis()){
                    //logger.log(Level.INFO,new StringBuilder().append("Last start of ").append(cal1.getTime().toString()).append(" ending ").append(cal2.getTime()).toString());
                    value.add(new TimeRange(cal1.getTimeInMillis(),cal2.getTimeInMillis()));
                    count++;
                    createOne=false;
                }else{
                    //logger.log(Level.INFO,new StringBuilder().append("Adding start of ").append(cal1.getTime().toString()).append(" ending ").append(cal2.getTime()).toString());
                    value.add(new TimeRange(cal1.getTimeInMillis(),cal3.getTimeInMillis()));
                    cal1.setTimeInMillis(cal3.getTimeInMillis());
                    
                    count++;
                    
                }
                
            }
        }
        
        return value;
    }
}

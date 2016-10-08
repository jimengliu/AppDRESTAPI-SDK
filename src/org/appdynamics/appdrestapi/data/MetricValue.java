/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.s;


import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author soloink
 * 
 */

/*
<metric-value>
<startTimeInMillis>1403903580000</startTimeInMillis>
<value>0</value>
<min>0</min>
<max>3</max>
<current>0</current>
<sum>2168</sum>
<count>5390</count>
<standardDeviation>0.0</standardDeviation>
<occurrences>0</occurrences>
<useRange>true</useRange>
</metric-value>
 * 
 */
public class MetricValue implements Comparable{
    
    protected long startTimeInMillis;
    protected long value;
    protected long min;
    protected long max;
    protected long current;
    // Available 3.8 only
    protected long sum=-1;
    protected long count=-1;
    protected double stdDev=-1.0;
    protected long occurrences=-1;
    protected boolean useRange;

    public MetricValue(){}
    
    @XmlElement(name=s.CURRENT)
    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }

    @XmlElement(name=s.MAX)
    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    @XmlElement(name=s.MIN)
    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    @XmlElement(name=s.START_TIME_IN_MILLIS)
    public long getStartTimeInMillis() {
        return startTimeInMillis;
    }

    public void setStartTimeInMillis(long startTimeInMillis) {
        this.startTimeInMillis = startTimeInMillis;
    }

    @XmlElement(name=s.VALUE)
    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getSum() {
        return sum;
    }

    @XmlElement(name=s.SUM)
    public void setSum(long sum) {
        this.sum = sum;
    }

    public long getCount() {
        return count;
    }

    @XmlElement(name=s.COUNT)
    public void setCount(long count) {
        this.count = count;
    }

    public double getStdDev() {
        return stdDev;
    }

    @XmlElement(name=s.STD_DEVIATION)
    public void setStdDev(double stdDev) {
        this.stdDev = stdDev;
    }

    public long getOccurrences() {
        return occurrences;
    }

    @XmlElement(name=s.OCCURRENCES)
    public void setOccurrences(long occurrences) {
        this.occurrences = occurrences;
    }

    public boolean isUseRange() {
        return useRange;
    }
    @XmlElement(name=s.USERANGE)
    public void setUseRange(boolean useRange) {
        this.useRange = useRange;
    }
    
    
    @Override
    public int compareTo(Object obj){
        Long _val = startTimeInMillis - ((MetricValue) obj).getStartTimeInMillis();
        
        return _val.intValue();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\n\tCurrent ::").append(current);
        bud.append("\n\tValue :: ").append(value);
        bud.append("\n\tMin :: ").append(min);
        bud.append("\n\tMax :: ").append(max);
        if(sum != -1)bud.append("\n\tSum :: ").append(sum);
        if(count != -1)bud.append("\n\tCount :: ").append(count);
        if(stdDev != -1.0) bud.append("\n\tStd Dev :: ").append(stdDev);
        if(occurrences != -1) bud.append("\n\tOccurrences :: ").append(occurrences);
        bud.append("\n\tUse Range :: ").append(useRange);
        bud.append("\n\tTimestamp :: ").append(startTimeInMillis);
        bud.append("\n\tDateTime :: ").append(new java.util.Date(startTimeInMillis).toString());
        bud.append("\n\t ------------------------- End ------------------------------\n");
        
        
        return bud.toString();
    }
    
    
}

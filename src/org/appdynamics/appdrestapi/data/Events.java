/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */

@XmlRootElement(name=AppExportS.EVENTS)
@XmlSeeAlso({Event.class,EntityDefinition.class})
public class Events {
    private ArrayList<Event> events=new ArrayList<Event>();
    
    public Events(){}

    @XmlElement(name=AppExportS.EVENT)
    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.EVENTS);
        for(Event ev: events) bud.append(ev.toString());
        return bud.toString();
    }
}

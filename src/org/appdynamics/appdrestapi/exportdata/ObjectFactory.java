/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import javax.xml.bind.annotation.XmlRegistry;

/**
 *
 * @author gilbert.solorzano
 */
@XmlRegistry
public class ObjectFactory {

    public ExHealthRule createExHealthRule() {
        return new ExHealthRule();
    }

}

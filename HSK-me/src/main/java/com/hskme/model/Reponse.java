/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author root
 */
@XmlType(name="Reponse", propOrder={"valid","reponse"})
@XmlRootElement(name="reponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reponse {
    @XmlAttribute(required=true)
    private boolean valid ;
    @XmlValue
    private String reponse ;

    public Reponse() {
    }

    /**
     * @return the reponse
     */
    public String getReponse() {
        return reponse;
    }

    /**
     * @param reponse the reponse to set
     */
    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author root
 */
@XmlType(name="Entree", propOrder={"question", "reponse"})
@XmlRootElement(name="entree")
@XmlAccessorType(XmlAccessType.FIELD)
public class Entree {
    @XmlValue
    private Question question;
    @XmlValue
    private List<Reponse> reponse;

    public Entree() {
        question = new Question();
        reponse = new ArrayList<Reponse>();
    }
    
    /**
     * @return the question
     */
    public Question getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(Question question) {
        this.question = question;
    }

    /**
     * @return the reponse
     */
    public List<Reponse> getReponse() {
        return reponse;
    }

    /**
     * @param reponse the reponse to set
     */
    public void setReponse(List<Reponse> reponse) {
        this.reponse = reponse;
    }
    
    
    
}

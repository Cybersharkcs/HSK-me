/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.model.Dictionnaire;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
/**
 *
 * @author root
 */
@Service("dictionnaireServiceImpl")
public class DictionnaireServiceImpl implements DictionnaireService{
    @Resource(name="dico")
    private Dictionnaire dico;
    


    /**
     * @return the dico
     */
    public Dictionnaire getDico() {
        return dico;
    }
    
    /**
    * @param dictionnaire the dictionnaire to set
    */
    public void setDico(Dictionnaire dico) {
        this.dico = dico;
    }
    
}

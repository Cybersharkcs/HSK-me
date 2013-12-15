/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.model.Dictionnaire;
import java.io.File;

/**
 *
 * @author root
 */
public class DictionnaireServiceImpl implements DictionnaireService{
    
    private Dictionnaire dictionnaire;
    /**
     *
     * @return
     */
    @Override
    public Dictionnaire unmarshallDictionnaire(){
        dictionnaire = new Dictionnaire();
        return dictionnaire.unmarshallDictionnaire();
    }
    
    @Override
    public void marshallDictionnaire(Dictionnaire dictionnaire, File file){
        dictionnaire.marshallDictionnaire(file);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.model.Dictionnaire;

/**
 *
 * @author root
 */
public class DictionnaireService {
    public Dictionnaire instanciateDictionnaire(){
        return new Dictionnaire().unmarshallDictionnaire();
    }
}

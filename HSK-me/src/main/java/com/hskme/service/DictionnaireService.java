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
public interface DictionnaireService {
    /**
     *
     * @return
     */
    public void marshallDictionnaire(Dictionnaire dictionnaire, File file);
    public Dictionnaire unmarshallDictionnaire();
}

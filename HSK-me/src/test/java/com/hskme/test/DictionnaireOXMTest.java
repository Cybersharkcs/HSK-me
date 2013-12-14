/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.test;

import com.hskme.model.Dictionnaire;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXB;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author root
 */
public class DictionnaireOXMTest {
    
    private Dictionnaire dictionnaire;
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @Test
    public void testMarshallingDictionnaire() {
        try {
            dictionnaire = new Dictionnaire();
            dictionnaire.loadVocab(new File("hsk3"));
        } catch (IOException ex) {
            Logger.getLogger(DictionnaireOXMTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dictionnaire.loadVocab(new File("hsk3"));
        Assert.assertNotNull("dictionnaire non null", dictionnaire);
        JAXB.marshal(dictionnaire, new File("dictionnaire_3.xml"));
    }
    
    @Test
    public void testUnmarshallingDictionnaire(){
        dictionnaire = JAXB.unmarshal(new File("dictionnaire.xml"), Dictionnaire.class);
        Assert.assertNotNull("dictionnaire non null", dictionnaire);
        Assert.assertNotNull("dictionnaire non vide", dictionnaire.getListCaractere());
        System.out.println(dictionnaire.getListCaractere().size());
        System.out.println(dictionnaire.getListCaractere().get(0).getSinogramme());
        System.out.println(dictionnaire.getListCaractere().get(0).getCategorie());
        System.out.println(dictionnaire.getListCaractere().get(0).getPinyin());
        System.out.println(dictionnaire.getListCaractere().get(0).getTraduction());
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.test;

import com.hskme.model.Dictionnaire;
import com.hskme.service.DictionnaireService;
import com.hskme.service.DictionnaireServiceImpl;
import java.io.File;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author root
 */
public class DictionnaireServiceTest {
    
    private DictionnaireService dictionnaireService;
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @Test
    public void testUnmarshallingDictionnaire(){
        dictionnaireService = new DictionnaireServiceImpl();
        Dictionnaire dictionnaire = dictionnaireService.unmarshallDictionnaire();
        Assert.assertNotNull("dictionnaire non null", dictionnaire);
        Assert.assertNotNull("dictionnaire non vide", dictionnaire.getListCaractere());
        System.out.println(dictionnaire.getListCaractere().size());
        System.out.println(dictionnaire.getListCaractere().get(0).getSinogramme());
        System.out.println(dictionnaire.getListCaractere().get(0).getCategorie());
        System.out.println(dictionnaire.getListCaractere().get(0).getPinyin());
        System.out.println(dictionnaire.getListCaractere().get(0).getTraduction());
    }
    
    @Test
    public void testMarshallingDictionnaire() {
        File file = new File("test_dictionnaire.xml");
        Dictionnaire dictionnaire = new Dictionnaire();
        dictionnaireService = new DictionnaireServiceImpl();
        dictionnaireService.marshallDictionnaire(dictionnaire, file);
        Assert.assertNotNull("Le fichier a été crée", file.exists());
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.test;

import com.hskme.model.Dictionnaire;
import com.hskme.model.Questionnaire;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class QuestionnaireTest {
    
    private Dictionnaire dico;
    public QuestionnaireTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dico = new Dictionnaire();
    }
    
    @After
    public void tearDown() {
        dico = null;
    }

    @Test
    public void testCreationQuestionnaire() throws Exception {
        //dico.loadVocab(new File("/home/maxime/NetBeansProjects/HSKme/web/WEB-INF/dico/hsk2"));

        Assert.assertNotNull("dictionnaire vide", dico);
        
    }
}
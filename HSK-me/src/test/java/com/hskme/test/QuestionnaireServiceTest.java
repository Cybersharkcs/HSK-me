/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.test;

import com.hskme.model.Dictionnaire;
import com.hskme.model.Questionnaire;
import com.hskme.service.QuestionnaireService;
import com.hskme.service.QuestionnaireServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author root
 */
public class QuestionnaireServiceTest {
    
    private QuestionnaireService questionnaireService;
    public QuestionnaireServiceTest() {
        
    }
      
    @Before
    public void setUp() {
        questionnaireService = new QuestionnaireServiceImpl();
    }

    @Test
    public void testCreationQuestionnaire() throws Exception {
        Dictionnaire dictionnaire = Dictionnaire.unmarshallDictionnaire();
        Questionnaire questionnaire = questionnaireService.setUpQuestionnaire(10, dictionnaire, "caractere", "pinyin");
        Assert.assertNotNull("dictionnaire non vide", questionnaire);
        System.out.println(questionnaire.getEntree().get(0).getQuestion().getQuestion());
        
    }
    
    @After
    public void tearDown() {
        questionnaireService = null;
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.testService;

import com.hskme.dto.DictionnaireDto;
import com.hskme.model.Dictionnaire;
import com.hskme.model.Questionnaire;
import com.hskme.service.QuestionnaireService;
import com.hskme.service.QuestionnaireServiceImpl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context-services.cfg.xml");
        questionnaireService = new QuestionnaireServiceImpl();
    }

    @Test
    public void testVoid(){
        
    }
    
    public void testCreationQuestionnaire() throws Exception {
        DictionnaireDto dictionnaire = DictionnaireDto.unmarshallDictionnaire();
//        Questionnaire questionnaire = questionnaireService.setUpQuestionnaire(10, dictionnaire, "caractere", "pinyin");
//        Assert.assertNotNull("dictionnaire non vide", questionnaire);
//        System.out.println(questionnaire.getEntree().get(0).getQuestion().getQuestion());
        
    }
    
    @After
    public void tearDown() {
        questionnaireService = null;
    }
}
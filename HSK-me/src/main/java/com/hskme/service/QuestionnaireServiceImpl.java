/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.model.Dictionnaire;
import com.hskme.model.Questionnaire;

/**
 *
 * @author root
 */
public class QuestionnaireServiceImpl implements QuestionnaireService{
    
    private Questionnaire questionnaire;
    
    /**
     *
     * @return
     */
    @Override
    public Questionnaire setUpQuestionnaire(int nb, Dictionnaire dictionnaire, String from, String to){
        questionnaire = new Questionnaire();
        questionnaire.initQuestionnaire(nb, dictionnaire, from, to);
        return questionnaire;
    }
}

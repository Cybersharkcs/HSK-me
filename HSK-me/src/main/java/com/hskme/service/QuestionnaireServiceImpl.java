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
    
    private Questionnaire quest;

    public QuestionnaireServiceImpl() {
    }
    
    /**
     *
     * @return
     */
    @Override
    public Questionnaire setUpQuestionnaire(int nb, Dictionnaire dictionnaire, String from, String to){
//        getQuest().initQuestionnaire(nb, dictionnaire, from, to);
        return getQuest();
    }

    /**
     * @param questionnaire the questionnaire to set
     */
    public void setQuest(Questionnaire quest) {
        this.quest = quest;
    }

    /**
     * @return the quest
     */
    public Questionnaire getQuest() {
        return quest;
    }
}

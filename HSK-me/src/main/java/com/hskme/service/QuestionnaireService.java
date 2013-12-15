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
public interface QuestionnaireService {
    public Questionnaire setUpQuestionnaire(int nb, Dictionnaire dictionnaire, String from, String to);
}

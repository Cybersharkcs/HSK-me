/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author root
 */

@RunWith(Suite.class)
@SuiteClasses(value={DictionnaireServiceTest.class,QuestionnaireServiceTest.class,UtilisateurDaoJdbcServiceTest.class,UtilisateurDaoHibernateServiceTest.class})
public class AllTest {
    
}

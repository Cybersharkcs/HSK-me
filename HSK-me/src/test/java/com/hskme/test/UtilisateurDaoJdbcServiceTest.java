/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.test;

import com.hskme.model.Utilisateur;
import com.hskme.service.UtilisateurDaoJdbcService;
import com.hskme.service.UtilisateurDaoJdbcServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author root
 */
public class UtilisateurDaoJdbcServiceTest {

    private UtilisateurDaoJdbcService daoJdbcService;
      
    @Before
    public void setUp() throws Exception {
        daoJdbcService = new UtilisateurDaoJdbcServiceImpl();
    }

    @Test
    public void testCreationQuestionnaire() throws Exception {
        Utilisateur utilisateur = daoJdbcService.recupererInfosUtilisateur();
        Assert.assertEquals("utilisateurs egaux", "maxime.popelin@dalongma.fr", utilisateur.getEmail());
    }
    
    @After
    public void tearDown() {
        daoJdbcService = null;
    }
    
}

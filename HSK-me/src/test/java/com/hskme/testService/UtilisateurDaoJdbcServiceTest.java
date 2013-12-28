/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.testService;

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
        Utilisateur utilisateur = daoJdbcService.selectInfosUtilisateur();
        Assert.assertEquals("utilisateurs egaux", "maxime", utilisateur.getEmail());
        Assert.assertEquals("password egaux", "lamepassword", utilisateur.getPassword());
        System.out.println(utilisateur.getPassword());
    }
    
    @After
    public void tearDown() {
        daoJdbcService = null;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.testService;

import com.hskme.model.Utilisateur;
import com.hskme.service.UtilisateurDaoHibernateService;
import com.hskme.service.UtilisateurDaoHibernateServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author root
 */
public class UtilisateurDaoHibernateServiceTest {
    
        private UtilisateurDaoHibernateService daoHibernateService;
      
    @Before
    public void setUp() throws Exception {
        daoHibernateService = new UtilisateurDaoHibernateServiceImpl();
    }


    public void testSelectUtilisateur() throws Exception {
        Utilisateur utilisateur = daoHibernateService.selectUtilisateur("maxime");
        Assert.assertEquals("utilisateurs egaux", "maxime", utilisateur.getEmail());
        Assert.assertEquals("password egaux", "lamepassword", utilisateur.getPassword());
    }
    
    @After
    public void tearDown() {
        daoHibernateService = null;
    }
    
}

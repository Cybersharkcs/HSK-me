/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.test;

import com.hskme.dao.Connector;
import com.hskme.dao.UtilisateurDaoJdbc;
import com.hskme.model.Utilisateur;
import java.io.File;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dbunit.DBTestCase;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author root
 */
public class UtilisateurTest extends Connector{

    private UtilisateurDaoJdbc dao;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        dao = new UtilisateurDaoJdbc();
    }
    
    @After
    public void tearDown() {
        dao = null;
    }

   
    public void testCreationQuestionnaire() throws Exception {
        Utilisateur utilisateur = dao.recupererInfosUtilisateur();
        Assert.assertEquals("utilisateurs egaux", "maxime.popelin@dalongma.fr", utilisateur.getEmail());
    }
    

    public void testSupprInsert() {
        try {
            IDatabaseConnection dbConnection = null;
            try {
                dbConnection = super.getConnection();
            } catch (Exception ex) {
                Logger.getLogger(UtilisateurTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
            IDataSet data = builder.build(new File("test/data.xml"));
            try {
                DatabaseOperation.CLEAN_INSERT.execute(dbConnection, data);
            } catch (DatabaseUnitException ex) {
                Logger.getLogger(UtilisateurTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(UtilisateurTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                dbConnection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UtilisateurTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(UtilisateurTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DataSetException ex) {
            Logger.getLogger(UtilisateurTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

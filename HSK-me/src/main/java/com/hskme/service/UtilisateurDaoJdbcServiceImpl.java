/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.dao.UtilisateurDaoJdbc;
import com.hskme.model.Utilisateur;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class UtilisateurDaoJdbcServiceImpl implements UtilisateurDaoJdbcService{

    UtilisateurDaoJdbc dao ;

    public UtilisateurDaoJdbcServiceImpl() {
        dao = new UtilisateurDaoJdbc();
    }
    
    @Override
    public Utilisateur recupererInfosUtilisateur() throws SQLException {
        return dao.recupererInfosUtilisateur();
    }
    
}

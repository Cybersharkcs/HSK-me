/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.model.Utilisateur;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public interface UtilisateurDaoJdbcService {
    public Utilisateur recupererInfosUtilisateur() throws SQLException;
}

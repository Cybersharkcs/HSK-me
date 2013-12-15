/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.model.Utilisateur;

/**
 *
 * @author root
 */
public interface UtilisateurDaoHibernateService {
    public Utilisateur selectUtilisateur(String name) ;
}

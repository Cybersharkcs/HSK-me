/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.service;

import com.hskme.dao.UtilisateurDaoHibernate;
import com.hskme.model.Utilisateur;

/**
 *
 * @author root
 */
public class UtilisateurDaoHibernateServiceImpl implements UtilisateurDaoHibernateService{

    private UtilisateurDaoHibernate dao;

    public UtilisateurDaoHibernateServiceImpl() {
        dao = new UtilisateurDaoHibernate();
    }
    
    @Override
    public Utilisateur selectUtilisateur(String name) {
        return dao.selectUtilisateur("maxime");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.dao;

import static com.hskme.dao.AbstractDao.factory;
import com.hskme.model.Utilisateur;
import org.hibernate.Session;

/**
 *
 * @author root
 */
public class UtilisateurDaoHibernate extends AbstractDao {
    
    public UtilisateurDaoHibernate() {
    }
    
    public Utilisateur selectUtilisateur(String name){
        Session session = factory.openSession();
        Utilisateur utilisateur = (Utilisateur)session.get(Utilisateur.class, name);
        session.close();
        return utilisateur;
    }
    
}

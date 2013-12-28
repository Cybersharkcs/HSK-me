package com.hskme.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hskme.model.Caractere;

public class CaractereDaoHibernate extends AbstractDao{

	Transaction transaction = null;
	
    public void insertCaractere(Caractere caractere){
        Session session = factory.openSession();
        transaction = session.beginTransaction();
        session.save(caractere);
        transaction.commit();
        session.close();
    }
	
	
}

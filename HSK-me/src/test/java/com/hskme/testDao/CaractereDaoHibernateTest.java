package com.hskme.testDao;

import java.util.ArrayList;

import org.junit.Test;

import com.hskme.dao.CaractereDaoHibernate;
import com.hskme.model.Caractere;
import com.hskme.model.Traduction;

public class CaractereDaoHibernateTest {
	CaractereDaoHibernate cdh = new CaractereDaoHibernate();
	
	@Test
	public void testInsertCaractere(){
		Caractere caractere = new Caractere();
		caractere.setCategorie("categorie");
		caractere.setPinyin("pinyin");
		caractere.setSinogramme("sinogramme");
		Traduction trad1 = new Traduction("traduction1");
		Traduction trad2 = new Traduction("traduction2");
		caractere.setTraduction(new ArrayList<Traduction>());
		caractere.getTraduction().add(trad1);
		caractere.getTraduction().add(trad2);
		cdh.insertCaractere(caractere);
	}
	
}

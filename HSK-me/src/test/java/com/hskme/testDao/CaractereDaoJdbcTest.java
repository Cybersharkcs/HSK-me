package com.hskme.testDao;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.util.Assert;

import com.hskme.dao.CaractereDaoJdbc;
import com.hskme.model.Caractere;

public class CaractereDaoJdbcTest {
	CaractereDaoJdbc cara = new CaractereDaoJdbc();
	
	@Test
	public void testSelectAllCaractere() {
		try {
			List<Caractere> caraList = cara.selectAllCaractere();
			Assert.notNull(caraList);
			System.out.println(caraList.get(0).getPinyin());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSelectCaractereById() {
		try {
			Caractere ca = cara.selectCaractereById(5);
			assertNotNull("caractere non null", ca);
			System.out.println(ca.getPinyin());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

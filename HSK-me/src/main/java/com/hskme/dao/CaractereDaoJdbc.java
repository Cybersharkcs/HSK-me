package com.hskme.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hskme.model.Caractere;

public class CaractereDaoJdbc extends AbstractDao{

    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
 
    public CaractereDaoJdbc(){
        try {
            connectionJDBC();
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
    
    public List<Caractere> selectAllCaractere() throws SQLException {
        List<Caractere> listCaractere = new ArrayList();
        Caractere caractere = null;
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT categorie, pinyin, sinogramme FROM `caractere`");
        while(resultSet.next()){
	        caractere = new Caractere();
	        caractere.setCategorie(resultSet.getString(1));
	        caractere.setPinyin(resultSet.getString(2));
	        caractere.setSinogramme(resultSet.getString(3));
	        listCaractere.add(caractere);
        }
        return listCaractere;
    }
    
    public Caractere selectCaractereById(int id) throws SQLException {
        Caractere caractere = null;
    	preparedStatement = connection.prepareStatement("SELECT * FROM `caractere` WHERE id= ?");
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
        	caractere = new Caractere();
        	caractere.setId(resultSet.getInt(1));
	        caractere.setCategorie(resultSet.getString(2));
	        caractere.setPinyin(resultSet.getString(3));
	        caractere.setSinogramme(resultSet.getString(4));
        }
        return caractere;
    }
	
}

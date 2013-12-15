/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author root
 */
public abstract class AbstractDao {
    
    protected Connection connection = null;
    protected static final SessionFactory factory = buildSessionFactory();
            
    /**
    * TODO Datasource
    */
    
    /**
    * JDBC
    */
    public void connectionJDBC() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/HSKme?user=root&password=lamepassword");
    }
    
    /**
    * DBUnit
    */
    public IDatabaseConnection getConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/HSKme?user=root&password=lamepassword");
        IDatabaseConnection cx = new DatabaseConnection(connection);
        return cx;
    }
    
    /**
    * Hibernate
    */
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
}

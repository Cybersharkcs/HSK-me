/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author root
 */
@Entity
@Table(name="utilisateur")
public class Utilisateur {
    @Id
    private String email;
    private String password;

    public Utilisateur() {
    }

    public Utilisateur(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}

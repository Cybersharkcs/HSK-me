package com.hskme.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * 
 */

/**
 * @author Maxime
 *
 */
@Entity @Table(name="caractere")
@Component("caractere")
public class Caractere {

	@Id @GeneratedValue @Column(name="caractere_id")
	private int id;
	@Column(name="categorie")
	private String categorie;
	@Column(name="pinyin")
	private String pinyin;
	@Column(name="sinogramme")
	private String sinogramme;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="caractere_id")
	private List<Traduction> traduction;

        /**
	 * No-args constructor for JAXB
	 */
    public Caractere() {
    }
        
	public Caractere(String caractere, String pinyin, List<Traduction> traduction) {
		this.sinogramme = caractere;
		this.pinyin = pinyin;
		this.traduction = traduction;
	}

	/**
	 * @return the traduction
	 */
	public List<Traduction> getTraduction() {
		return traduction;
	}

	/**
	 * @param traduction the traduction to set
	 */
	public void setTraduction(List<Traduction> traduction) {
		this.traduction = traduction;
	}

	/**
	 * @return the pinyin
	 */
	public String getPinyin() {
		return pinyin;
	}

	/**
	 * @param pinyin the pinyin to set
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

        /**
         * @return the categorie
         */
        public String getCategorie() {
            return categorie;
        }

        /**
         * @param categorie the categorie to set
         */
        public void setCategorie(String categorie) {
            this.categorie = categorie;
        }

        /**
         * @return the sinogramme
         */
        public String getSinogramme() {
            return sinogramme;
        }

        /**
         * @param sinogramme the sinogramme to set
         */
        public void setSinogramme(String sinogramme) {
            this.sinogramme = sinogramme;
        }
        
        public int getId() {
    		return id;
    	}

    	public void setId(int id) {
    		this.id = id;
    	}

}

package com.hskme.model;


import javax.xml.bind.Element;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.springframework.stereotype.Component;

/**
 * 
 */

/**
 * @author Maxime
 *
 */
@Component("caractere")
public class Caractere implements Comparable<Caractere>{

	/**
	 * 
	 */
    private String categorie;
	private String traduction;
	private String pinyin;
	private String sinogramme;

        /**
	 * No-args constructor for JAXB
	 */
        public Caractere() {
        }
        
	public Caractere(String caractere, String pinyin, String traduction) {
		this.sinogramme = caractere;
		this.pinyin = pinyin;
		this.traduction = traduction;
	}

	/**
	 * @return the traduction
	 */
	public String getTraduction() {
		return traduction;
	}

	/**
	 * @param traduction the traduction to set
	 */
	public void setTraduction(String traduction) {
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


	@Override
	public int compareTo(Caractere c) {
		// TODO Auto-generated method stub
		return pinyin.compareTo(c.pinyin);
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

}

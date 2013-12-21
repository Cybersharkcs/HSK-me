package com.hskme.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */

/**
 * @author Maxime
 *
 */
@XmlType(name="CaractereDto", propOrder={"categorie","pinyin", "sinogramme", "traduction"})
@XmlRootElement(name="caractere")
@XmlAccessorType(XmlAccessType.FIELD)
public class CaractereDto implements Comparable<CaractereDto>{

	/**
	 * 
	*/
    @XmlElement(required=true)
    private String categorie;
    @XmlElement(required=true)
	private String pinyin;
    @XmlElement(required=true)
	private String sinogramme;
    @XmlElementWrapper(name="traductions")
    @XmlElement(required=true)
	private List<String> traduction;
	
	/**
	* No-args constructor for JAXB
	*/
	public CaractereDto() {
	}
        
	public CaractereDto(String categorie, String caractere, String pinyin, String trad) {
		traduction = new ArrayList<String>();
		this.categorie = categorie;
		this.sinogramme = caractere;
		this.pinyin = pinyin;
		this.traduction.add(trad);
	}

	/**
	 * @return the traduction
	 */
	public List<String> getTraduction() {
		return traduction;
	}

	/**
	 * @param traduction the traduction to set
	 */
	public void setTraduction(List<String> traduction) {
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
	public int compareTo(CaractereDto c) {
		return pinyin.compareTo(c.pinyin);
	}

//    /**
//     * @return the categorie
//     */
//    public String getCategorie() {
//        return categorie;
//    }
//
//    /**
//     * @param categorie the categorie to set
//     */
//    public void setCategorie(String categorie) {
//        this.categorie = categorie;
//    }

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

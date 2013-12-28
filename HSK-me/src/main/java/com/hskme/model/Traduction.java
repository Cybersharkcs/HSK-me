package com.hskme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="traduction")
public class Traduction {
	@Id @GeneratedValue @Column(name="traduction_id")
	private int id;
	@Column(name="traduction")
	private String traduction;
	@ManyToOne @JoinColumn(name="caractere_id")
	private Caractere caractere;

	public Traduction() {
	}

	public Traduction(String traduction) {
		this.traduction = traduction;
	}
	
	public Caractere getCaractere() {
		return caractere;
	}

	public void setCaractere(Caractere caractere) {
		this.caractere = caractere;
	}
	
	public String getTraduction() {
		return traduction;
	}

	public void setTraduction(String traduction) {
		this.traduction = traduction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

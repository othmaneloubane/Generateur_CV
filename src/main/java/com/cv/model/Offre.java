package com.cv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "offre")
public class Offre {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private String description;
	
	@ManyToOne
	private Recruteur recruteur;
	
	@ManyToOne
	private Chercheur chercheur;
	
	public Offre() {
		super();
	}

	public Offre(long id, String description, Recruteur recruteur, Chercheur chercheur) {
		super();
		this.id = id;
		this.description = description;
		this.recruteur = recruteur;
		this.chercheur = chercheur;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Recruteur getRecruteur() {
		return recruteur;
	}

	public void setRecruteur(Recruteur recruteur) {
		this.recruteur = recruteur;
	}

	public Chercheur getChercheur() {
		return chercheur;
	}

	public void setChercheur(Chercheur chercheur) {
		this.chercheur = chercheur;
	}
	
	
}

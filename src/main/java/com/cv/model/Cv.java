package com.cv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cv")
public class Cv {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@ManyToOne
	private Recruteur recruteur;
	
	@OneToOne
	private Chercheur chercheur;

	public Cv() {
		super();
	}

	public Cv(long id, Recruteur recruteur, Chercheur chercheur) {
		super();
		this.id = id;
		this.recruteur = recruteur;
		this.chercheur = chercheur;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

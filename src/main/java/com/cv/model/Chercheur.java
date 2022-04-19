package com.cv.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chercheur")
public class Chercheur extends User {

	private String specialite;
	private Date dateNaissance;
	
	@OneToOne(mappedBy = "chercheur")
	private Cv cv;
	
	@OneToMany(mappedBy = "chercheur")
	private Collection<Offre> offres;
	

	public Chercheur() {
		super();
	}

	public Chercheur(String specialite, Date dateNaissance, Cv cv, Collection<Offre> offres) {
		super();
		this.specialite = specialite;
		this.dateNaissance = dateNaissance;
		this.cv = cv;
		this.offres = offres;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

	public Collection<Offre> getOffres() {
		return offres;
	}

	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}
	
	
}

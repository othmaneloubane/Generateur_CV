package com.cv.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "recruteur")
public class Recruteur extends User{

	private String titre;
	private String secteur;
	private double chiffre_affaire;
	
	@OneToMany(mappedBy = "recruteur")
	private Collection<Cv> cvs;
	
	@OneToMany(mappedBy = "recruteur")
	private Collection<Offre> offres;

	public Recruteur() {
		super();
	}

	public Recruteur(String titre, String secteur, double chiffre_affaire, Collection<Cv> cvs,
			Collection<Offre> offres) {
		super();
		this.titre = titre;
		this.secteur = secteur;
		this.chiffre_affaire = chiffre_affaire;
		this.cvs = cvs;
		this.offres = offres;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public double getChiffre_affaire() {
		return chiffre_affaire;
	}

	public void setChiffre_affaire(double chiffre_affaire) {
		this.chiffre_affaire = chiffre_affaire;
	}

	public Collection<Cv> getCvs() {
		return cvs;
	}

	public void setCvs(Collection<Cv> cvs) {
		this.cvs = cvs;
	}

	public Collection<Offre> getOffres() {
		return offres;
	}

	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}
	
	
}

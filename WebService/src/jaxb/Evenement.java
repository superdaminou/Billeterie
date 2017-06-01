package jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import billeterie.Lieu;

@XmlRootElement(name="evenement")
@XmlType(propOrder={"id","nbplace", "nom", "lieu",  "description", "date", "prix"})
public class Evenement {
	
	public Evenement(){
		
	}
	
	@XmlAttribute(name="id")
	private int id;
	
	@XmlAttribute(name="nbplace")
	private int nbPlace;
	
	@XmlAttribute(name="nom")
	private String nom;
	
	@XmlAttribute(name="lieu")
	private Lieu lieu;
		
	@XmlAttribute(name="description")
	private String Decription;
	
	@XmlAttribute(name="date")
	private  Date date;
	
	@XmlAttribute(name="prix")
	private int prix;

	/**
	 * @return
	 */
	public int getNbPlace() {
		return nbPlace;
	}

	/**
	 * @param nbPlace
	 */
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	/**
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return
	 */
	public Lieu getLieu() {
		return lieu;
	}

	/**
	 * @param lieu
	 */
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getDecription() {
		return Decription;
	}

	/**
	 * @param decription
	 */
	public void setDecription(String decription) {
		Decription = decription;
	}

	/**
	 * @return
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	

}

package jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import billeterie.Lieu;

@XmlRootElement(name = "evenement")

public class Evenement {

	private int id;
	private int nbPlace;
	private String nom;
	private Lieu lieu;
	private String decription;
	private Date date;
	private int prix;

	public Evenement(int nbPlace, String nom, Lieu lieu, String decription, Date date, int prix) {

		this.nbPlace = nbPlace;
		this.nom = nom;
		this.lieu = lieu;
		this.decription = decription;
		this.date = date;
		this.prix = prix;
		this.id = 10;
	}

	public Evenement() {

	}

	/**
	 * @return
	 */
	@XmlElement
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
	@XmlElement
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
	@XmlElement
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
	@XmlElement
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
	@XmlElement
	public String getDecription() {
		return decription;
	}

	/**
	 * @param decription
	 */
	public void setDecription(String decription) {
		this.decription = decription;
	}

	/**
	 * @return
	 */
	@XmlElement
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
	@XmlElement
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

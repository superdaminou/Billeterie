package billeterie;

import java.util.Date;

/**
 * @author Nicolas
 *
 */
/**
 * @author Nicolas
 *
 */
/**
 * @author Nicolas
 *
 */
public class Evenement {
	
	/**
	 * 
	 */
	public Evenement(){
		
	}
	
	private int nbPlace;
	
	private String nom;
	
	private Lieu lieu;
	
	private int id;
	
	private String Decription;
	
	private  Date date;
	
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

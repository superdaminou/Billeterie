package jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="User")
@XmlType(propOrder={"ID","nom", "prenom", "mail", "admin" })
public class User{
	
	public User(){
		
	}
	
	
	private int ID;
	
	private String nom;
	
	private String prenom;
	
	private String mail;
	

	
	
	private boolean admin;
	
	@XmlElement
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElement
	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@XmlElement
	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}

	@XmlElement
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}

	@XmlElement
	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public boolean equals(User user){
		return this.equals(user);
	}

}

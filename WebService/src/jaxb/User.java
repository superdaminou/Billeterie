package jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="User")
@XmlType(propOrder={"id","nom", "prenom", "mail" })
public class User{
	
	public User(){
		
	}
	
	@XmlAttribute(name="id")
	private int ID;
	
	@XmlAttribute(name="nom")
	private String nom;
	
	@XmlAttribute(name="prenom")
	private String prenom;
	
	@XmlAttribute(name="mail")
	private String mail;
	

	
	
	private boolean admin;
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


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

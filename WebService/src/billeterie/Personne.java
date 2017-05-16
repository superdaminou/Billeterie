package billeterie;


public class Personne {
	
	private String nom;
	private String prenom;
	
	public Personne(){
		this.setNom("Bruel");
		this.setPrenom("Patrick");
	}

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

}

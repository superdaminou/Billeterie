package billeterie;

public class Lieu {
	
	
	public Lieu(){
		
	}
	
	public Lieu(String nom, String adresse, int codePostal, String ville){
		this.setNom(nom);
		this.setAdresse(adresse);
		this.setCodePostal(codePostal);
		this.setVille(ville);
	}
	
	private String adresse;
	
	private String nom;
	
	private int codePostal;
	
	private String Ville;
	
	private int ID;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	
	

}

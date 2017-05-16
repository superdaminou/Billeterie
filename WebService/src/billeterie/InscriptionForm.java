package billeterie;

import javax.servlet.http.HttpServletRequest;

public class InscriptionForm {
	
	private static final String CHAMP_NOM= "nom";
	private static final String CHAMP_PRENOM= "prenom";
	private static final String CHAMP_MAIL= "mail";
	
	
	public void inscrire(HttpServletRequest request){
		String nom = getValeur(request, CHAMP_NOM);
		String prenom = getValeur(request, CHAMP_PRENOM);
		String mail = getValeur(request, CHAMP_MAIL);
		User user = new User();
		user.setMail(mail);
		user.setPrenom(prenom);
		user.setNom(nom);
		
		InscriptionService.InscrireUser(user);
		
	}
	
	
	private static String getValeur(HttpServletRequest request, String champ){
		String valeur = request.getParameter(champ);
		if(valeur=="")
			return null;
		else
			return valeur.trim();
	}

}

package billeterie;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jaxb.User;

public class InscriptionForm {
	
	private static final String CHAMP_NOM= "nom";
	private static final String CHAMP_PRENOM= "prenom";
	private static final String CHAMP_MAIL= "mail";
	private List<User> listUser= new ArrayList<User>();
	
	public List<User> getListUser() {
		return listUser;
	}


	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}


	/**
	 * @param request
	 */
	public void inscrire(HttpServletRequest request){
		String nom = getValeur(request, CHAMP_NOM);
		String prenom = getValeur(request, CHAMP_PRENOM);
		String mail = getValeur(request, CHAMP_MAIL);
		User user = new User();
		user.setMail(mail);
		user.setPrenom(prenom);
		user.setNom(nom);
		System.out.println(nom);
		listUser.add(InscriptionService.InscireUser(user));
		
	}
	
	
	/**
	 * @param request
	 * @param champ
	 * @return
	 */
	private static String getValeur(HttpServletRequest request, String champ){
		String valeur = request.getParameter(champ);
		if(valeur=="" || valeur==null)
			return null;
		else
			return valeur.trim();
	}
	
	

}

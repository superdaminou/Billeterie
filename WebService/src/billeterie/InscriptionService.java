package billeterie;

import jaxb.User;

public interface InscriptionService {
	
	public static User InscireUser(User user){
		try{
			if(checkInscription(user)){
				return user;
			}
			else{
				throw new InvalideUserException("tout les champs ne sont pas remplis");
			}
		}catch (InvalideUserException e){
		}
		return null;
		
	}
	
	public static boolean test(){
		return true;
	}
	
	static boolean checkInscription(User user){
		return (user.getNom()!=null && user.getPrenom()!=null);
	}

}

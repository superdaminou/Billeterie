package billeterie;

public interface InscriptionService {
	
	public static void InscireUser(User user){
		try{
			if(!checkInscription(user)){
				
			}
			else{
				throw new InvalideUserException("tout les champs ne sont pas remplis");
			}
		}catch (InvalideUserException e){
		}
		
		
	}
	
	public static boolean test(){
		return true;
	}
	
	static boolean checkInscription(User user){
		return (user.getMail()!=null || user.getNom()!=null || user.getPrenom()!=null);
	}

}

package billeterie;

public class InscriptionService {
	
	public void InscireUser(User user){
		try{
			if(!checkInscription(user)){
				
			}
			else{
				throw new InvalideUserException("tout les champs ne sont pas remplis");
			}
		}catch (InvalideUserException e){
			
		}
		
		
	}
	
	public boolean test(){
		return true;
	}
	
	public boolean checkInscription(User user){
		return (user.getMail()!=null || user.getNom()!=null || user.getPrenom()!=null);
	}

}

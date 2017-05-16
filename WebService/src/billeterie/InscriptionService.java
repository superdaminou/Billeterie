package billeterie;

public class InscriptionService {
	
	public void InscireUser(User user){
		if(!checkInscription(user)){
			
		}
		
	}
	
	
	public boolean test(){
		return true;
	}
	
	public boolean checkInscription(User user){
		return (user.getMail()!=null || user.getNom()!=null || user.getPrenom()!=null);
	}

}

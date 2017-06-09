package billeterie;

import jaxb.Evenement;
import jaxb.Reservation;
import jaxb.User;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.RPC)
public abstract class ServiceReservation {

	
	/**
	 * @param reservation
	 * @param idevent
	 * @param user
	 * @return
	 */
	@WebMethod
	public boolean doReservation(Reservation reservation, int  idevent, User user)
	{
		//On récupère l'évènement avec JAXB
		
		Evenement event = new Evenement();//ici on appelle la méthode JAXB à la place de new Event
		
		event.setNbPlace(event.getNbPlace()- reservation.getNbPlaceReserve());
		
		//Appel de la méthode de modification d'un événement
		//Appel de la méthode d'écriture d'une résa
		
		return true;
	}
	
	
	
	
	
}

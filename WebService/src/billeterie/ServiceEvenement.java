package billeterie;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import jaxb.Evenement;
import jaxb.EvenementJaxb;


@WebService
@SOAPBinding(style=Style.RPC) 
public class ServiceEvenement {

	
	public ServiceEvenement() {

	}

	/**
	 * @param event
	 * @return
	 */
	@WebMethod
	public boolean addEvent(Evenement event)
	{
		EvenementJaxb ejb = new EvenementJaxb();
		ejb.marshall(event);
		
		return true;
	}
	
	/**
	 * @param idEventASuppr
	 * @return
	 */
	@WebMethod
	public boolean deleteEvent(int idEventASuppr)
	{
		return true;
	}
	
	/**
	 * @param newEvent
	 * @param idEventAModifier
	 * @return
	 */
	@WebMethod
	public boolean modifyEvent(Evenement newEvent, int idEventAModifier)
	{
		EvenementJaxb ejb = new EvenementJaxb();
		return true;
	}

	/**
	 * @return
	 */
	@WebMethod
	public List<Evenement> getAllEvents()
	{
		List<Evenement> liste = new ArrayList<Evenement>();
		return liste;
	}
	
	/**
	 * @param idEvent
	 * @return
	 */
	@WebMethod
	public Evenement getEvent(int idEvent)
	{
		
		Evenement event = new Evenement();
		return event ;
	}

}

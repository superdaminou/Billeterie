package billeterie;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import jaxb.Evenement;
import jaxb.EvenementJaxb;
import jaxb.Evenements;
import jaxb.*;

@WebService
@SOAPBinding(style=Style.RPC) 
public abstract class ServiceEvenement {

	

	/**
	 * @param event
	 * On va recuperer l'ensemble des evennements présents dans le fichier xml
	 * ajouter l'evennement à la liste des evennements
	 * reecrire le fichier xml avec la liste des events
	 * @return
	 */
	@WebMethod
	public boolean addEvent(Evenements events, String nomFichierXml)
	{
		EvenementJaxb ejb = new EvenementJaxb(nomFichierXml);
		ejb.marshall(events);
		
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
		EvenementJaxb ejb = new EvenementJaxb("Evenement");
		return true;
	}

	/**
	 * @return
	 */
	@WebMethod
	public static List<Evenement> getAllEvents()
	{
		Evenements list = new Evenements();
		return list.getEvents();
	}
	
	/**
	 * @param idEvent
	 * @return
	 */
	@WebMethod
	public static Evenement getEvent(int idEvent)
	{
		
		Evenement event = new Evenement();
		return event ;
	}

}

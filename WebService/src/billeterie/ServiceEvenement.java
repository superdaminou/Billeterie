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
	
	private static final String nomFichierXml = "evenements.xml";
	

	/**
	 * @param event
	 * On ajoute la liste de tous les evennements aux fichier xml
	 * @return
	 */
	@WebMethod
	public static boolean addEvents(Evenements events)
	{
		EvenementJaxb ejb = new EvenementJaxb(nomFichierXml);
		ejb.marshall(events);
		
		return true;
	}
	
	public static void addUnEvent(Evenement newEvent){
		Evenements events = getAllEvents();
		events.addevent(newEvent);
		addEvents(events);
		
	}
	
	/**
	 * @param idEventASuppr
	 * Récupère la liste des events
	 * accède à l'event à supprimer
	 * supprime l'event
	 * renvoie la liste des events dans l'xml
	 * @return
	 */
	@WebMethod
	public boolean deleteEvent(int idEventASuppr)
	{
		Evenements events = getAllEvents();
		Evenement e = getEvent(events,idEventASuppr);
		events.getEvents().remove(e.getId());
		addEvents(events);
		
		return true;
	}
	
	/**
	 * @param newEvent
	 * @param idEventAModifier
	 * Récupère la liste des events, accède à la l event
	 * Modifie l event
	 * Renvoi la liste des events dans l'xml
	 * @return
	 */
	@WebMethod
	public boolean modifyEvent(Evenement newEvent, int idEventAModifier)
	{
		
		Evenements events = getAllEvents();
		deleteEvent(idEventAModifier);
		addUnEvent(newEvent);
		return true;
	}

	/**
	 * @param nomFichierXml
	 * Récupère tous les events dans une liste d'event -> Evenements
	 * @return
	 */
	@WebMethod
	public static Evenements getAllEvents()
	{
		EvenementJaxb ejb = new EvenementJaxb(nomFichierXml);
		Evenements listAllEvents = new Evenements();
		listAllEvents = ejb.unmarshall();
		return listAllEvents;
	}
	
	/**
	 * @param idEvent
	 * @return
	 */
	@WebMethod
	public static Evenement getEvent(Evenements events, int idEvent)
	{
		List<Evenement> event = events.getEvents();
		event.get(0).getId();
		for (int i = 0; i < event.size() ; i++) {
			if (events.getEvents().get(i).getId() == idEvent) {
				return events.getEvents().get(i);
			}
		}
		
		return null;
	}

}

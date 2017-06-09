package billeterie;

import java.util.ArrayList;
import java.util.Date;
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
	public  static boolean addEvents(Evenements events)
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
	public static boolean deleteEvent(int idEventASuppr)
	{
		Evenements events = getAllEvents();
		int e = getEvent(events,idEventASuppr);
		System.out.println(e);
		events.getEvents().remove(e);
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
	public static boolean modifyEvent(Evenement newEvent, int idEventAModifier)
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
	public  static int getEvent(Evenements events, int idEvent)
	{
		List<Evenement> event = events.getEvents();
		event.get(0).getId();
		for (int i = 0; i < event.size() ; i++) {
			if (events.getEvents().get(i).getId() == idEvent) {
				return i;
			}
		}
		
		return 0;
	}
	
	public  static Evenement nouvelEvenement(int nbPlace, String nom, Lieu lieu, String decription, Date date, int prix){
		/*On récupere l'ensembles des events
		 * on calcul le dernier id
		 * on incrémente
		 * on cre un event avec le bon id
		 */
		int id = compteNbEvent()+1;
		Evenement event; 
		return event = new Evenement(id, nbPlace, nom, lieu, decription, date, prix);

	}
	
	public static int compteNbEvent(){
		Evenements events = getAllEvents();
		return events.getEvents().size();
		
	}

}

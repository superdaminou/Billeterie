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
	 * On ajoute la liste de tous les evennements aux fichier xml
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
	 * Récupère la liste des events
	 * accède à l'event à supprimer
	 * supprime l'event
	 * renvoie la liste des events dans l'xml
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
	 * Récupère la liste des events, accède à la l event
	 * Modifie l event
	 * Renvoi la liste des events dans l'xml
	 * @return
	 */
	@WebMethod
	public boolean modifyEvent(Evenement newEvent, int idEventAModifier)
	{
		
		EvenementJaxb ejb = new EvenementJaxb("Evenement");
		return true;
	}

	/**
	 * @param nomFichierXml
	 * Récupère tous les events dans une liste d'event -> Evenements
	 * @return
	 */
	@WebMethod
	public static Evenements getAllEvents(String nomFichierXml)
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
	public static Evenement getEvent(int idEvent)
	{
		
		Evenement event = new Evenement();
		return event ;
	}

}

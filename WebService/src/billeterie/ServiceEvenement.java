package billeterie;

import java.util.ArrayList;
import java.util.List;



public class ServiceEvenement {

	
	/**
	 * @param event
	 * @return
	 */
	public boolean addEvent(Evenement event)
	{
		return true;
	}
	
	/**
	 * @param idEventASuppr
	 * @return
	 */
	public boolean deleteEvent(int idEventASuppr)
	{
		return true;
	}
	
	/**
	 * @param newEvent
	 * @param idEventAModifier
	 * @return
	 */
	public boolean modifyEvent(Evenement newEvent, int idEventAModifier)
	{
		return true;
	}

	/**
	 * @return
	 */
	public List<Evenement> getAllEvents()
	{
		List<Evenement> liste = new ArrayList<Evenement>();
		return liste;
	}
	
	/**
	 * @param idEvent
	 * @return
	 */
	public Evenement getEvent(int idEvent)
	{
		
		Evenement event = new Evenement();
		return event ;
	}

}

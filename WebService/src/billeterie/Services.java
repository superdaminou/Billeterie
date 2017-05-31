package billeterie;

import java.util.ArrayList;
import java.util.List;

public class Services {

	
	public boolean addEvent(Evenement event)
	{
		return true;
	}
	
	public boolean deleteEvent(int idEventASuppr)
	{
		return true;
	}
	
	public boolean modifyEvent(Evenement newEvent, int idEventAModifier)
	{
		return true;
	}
	
	public boolean doReservation(Reservation reservation, Evenement event, User user)
	{
		return true;
	}
	
	public List<Evenement> getAllEvents()
	{
		
		List<Evenement> liste = new ArrayList<Evenement>();
		return liste;
	}
	
	public Evenement getEvent(int idEvent)
	{
		
		Evenement event = new Evenement();
		return event ;
	}

	
	
	
	
}

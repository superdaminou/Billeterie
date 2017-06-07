package demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import billeterie.Lieu;
import billeterie.ServiceEvenement;
import jaxb.*;
import sun.tools.jar.resources.jar;

public class Main {
	public static void main(String[] args) {
		EvenementJaxb obj = new EvenementJaxb("evenements.xml");
		Lieu lieu = new Lieu();
		Date date = new Date();
		Evenements events = new Evenements();
		Evenement event = new Evenement(130, "BOOBA",lieu, "description",date, 25);
		events.addevent(event);
		event = new Evenement(150, "Hilight Tribe",lieu, "Psy - Trance",date, 25);
		events.addevent(event);

		ServiceEvenement servEvent = new ServiceEvenement();
		servEvent.addEvent(events,"evenements.xml");

		obj.unmarshall(events);
	}

}

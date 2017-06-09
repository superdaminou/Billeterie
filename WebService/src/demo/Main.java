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
		Evenement event = new Evenement(10,130, "Parov Stelar",lieu, "description",date, 25);
		System.out.println( event.toString());
		events.addevent(event);
		
		event = new Evenement(20,150, "Hilight Tribe",lieu, "Psy - Trance",date, 25);
		System.out.println( event.toString());
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                        addEvents                            ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		ServiceEvenement.addEvents(events);

		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       addUnEvent                            ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		ServiceEvenement.addUnEvent(event);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       deleteEvent                           ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		System.out.println(event.getId());
		ServiceEvenement.deleteEvent(event.getId());

		

		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       modifyEvent                           ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		Evenement newEvent = new Evenement(2,150, "LEJ",lieu, "POP",date, 25);
		ServiceEvenement.modifyEvent(newEvent, event.getId());

		obj.unmarshall();
	}

}

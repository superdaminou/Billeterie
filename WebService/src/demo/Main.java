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
		
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                        addEvents                            ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		Evenement event = new Evenement();//1,130, "Parov Stelar",lieu, "description",date, 25);
		ServiceEvenement.addUnEvent(ServiceEvenement.nouvelEvenement(130, "Parov Stelar",lieu, "description",date, 25));
		
		//event = new Evenement(2,150, "Hilight Tribe",lieu, "Psy - Trance",date, 25);
		


		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       addUnEvent                            ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		event = ServiceEvenement.nouvelEvenement(150, "Hilight Tribe",lieu, "Psy - Trance",date, 25);
		ServiceEvenement.addUnEvent(event);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       deleteEvent                           ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		ServiceEvenement.deleteEvent(event.getId());

		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       modifyEvent                           ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		Evenement newEvent = new Evenement();
		newEvent = ServiceEvenement.nouvelEvenement(150, "LEJ",lieu, "POP",date, 25);
		ServiceEvenement.modifyEvent(newEvent, event.getId());
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       Test		                             ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Nombre d'evenements présent : "+ServiceEvenement.compteNbEvent());
		
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("                       Unmarshall                            ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
		obj.unmarshall();
	}

}

package demo;

import java.util.Date;

import billeterie.Lieu;
import billeterie.ServiceEvenement;
import jaxb.*;

public class Main {
	public static void main(String[] args) {
		EvenementJaxb obj = new EvenementJaxb();
		Lieu lieu = new Lieu();
		Date date = new Date();
		Evenement event = new Evenement(130, "BOOBA",lieu, "description",date, 25);

		
		
		ServiceEvenement servEvent = new ServiceEvenement();
		servEvent.addEvent(event);

		obj.unmarshall(event);
	}

}

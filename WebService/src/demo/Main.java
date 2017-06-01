package demo;

import billeterie.Lieu;
import jaxb.*;

public class Main {
	public static void main(String[] args) {
		EvenementJaxb obj = new EvenementJaxb();
		Lieu lieu = new Lieu();
		Evenement event = new Evenement();
				//new Evenement(001,130, "BOOBA",lieu, "description","10/12/2017", 25);
		obj.marshall(event);
		obj.unmarshall(event);
		
	}

}

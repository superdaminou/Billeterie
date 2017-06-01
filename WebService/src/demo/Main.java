package demo;

import jaxb.*;

public class Main {
	public static void main(String[] args) {
		EvenementJaxb obj = new EvenementJaxb();
		Evenement event = new Evenement("A001", "BOOBA", "Zenit", 10122017);
		obj.marshall(Evenement.class,event);
		obj.unmarshall(Evenement.class,event);
		
	}

}

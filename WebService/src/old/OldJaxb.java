package old;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import javax.xml.bind.*;
import javax.xml.transform.Result;

import jaxb.Reservation;

import java.io.*;


public class OldJaxb {
	
	public void marshall(Reservation resa) {
		try {
			String nomFichier = Reservation.class.toString().substring(11);
			
			JAXBContext contextObj = JAXBContext.newInstance(Reservation.class);
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshallerObj.marshal(resa, System.out);
		    marshallerObj.marshal(resa, new File("data/"+nomFichier+".xml"));  

		
		
		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void unmarshall(Reservation resa) {
		try {
			String nomFichier = Reservation.class.toString().substring(11);

		
			JAXBContext contextObj = JAXBContext.newInstance(Reservation.class);
			Unmarshaller uns = contextObj.createUnmarshaller();
			resa = (Reservation) uns.unmarshal(new File("data/"+nomFichier+".xml"));
				System.out.println("Evenement Informations");
				System.out.println("id: "+resa.getNbPlaceReserve());

		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}

}

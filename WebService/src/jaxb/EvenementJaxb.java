package jaxb;


import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.io.*;

public class EvenementJaxb {
	
	
	
	
	public EvenementJaxb() {

	}

	public void marshall(Evenement event) {
		try {
			String nomFichier = Evenement.class.toString().substring(11);
			
			JAXBContext contextObj = JAXBContext.newInstance(Evenement.class);
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshallerObj.marshal(event, System.out);
		    marshallerObj.marshal(event, new File("data/"+nomFichier+".xml"));  

		
		
		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void unmarshall(Evenement event) {
		try {
			String nomFichier = Evenement.class.toString().substring(11);

		
			JAXBContext contextObj = JAXBContext.newInstance(Evenement.class);
			Unmarshaller uns = contextObj.createUnmarshaller();
			event = (Evenement) uns.unmarshal(new File("data/"+nomFichier+".xml"));
				System.out.println("Evenement Informations");
				System.out.println("id: "+event.getId());
				System.out.println("name: "+event.getNom());
				System.out.println("lieu: "+event.getLieu());
				System.out.println("date: "+event.getDate());
			
		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}

}

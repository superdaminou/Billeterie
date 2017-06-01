package jaxb;


import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.io.*;

public class EvenementJaxb {
	
	public void marshall(Class a,Object event) {
		try {
			String nomFichier = a.toString().substring(11);
			
			JAXBContext contextObj = JAXBContext.newInstance(a);
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshallerObj.marshal(event, System.out);
		    marshallerObj.marshal(event, new File("data/"+nomFichier+".xml"));  

		
		
		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void unmarshall(Class a,Evenement event) {
		try {
			String nomFichier = a.toString().substring(11);

		
			JAXBContext contextObj = JAXBContext.newInstance(a);
			Unmarshaller uns = contextObj.createUnmarshaller();
			event = (Evenement) uns.unmarshal(new File("data/"+nomFichier+".xml"));
				System.out.println("Evenement Informations");
				System.out.println("id: "+event.getId());
				System.out.println("name: "+event.getName());
				System.out.println("lieu: "+event.getLieu());
				System.out.println("date: "+event.getDate());
			
		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}

}

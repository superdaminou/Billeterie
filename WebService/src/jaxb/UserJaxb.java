package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class UserJaxb {

	public void marshall(User utilisateur) {
		try {
			String nomFichier = User.class.toString().substring(11);
			
			JAXBContext contextObj = JAXBContext.newInstance(User.class);
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshallerObj.marshal(utilisateur, System.out);
		    marshallerObj.marshal(utilisateur, new File("data/"+nomFichier+".xml"));  

		
		
		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void unmarshall(User utilisateur) {
		try {
			String nomFichier = User.class.toString().substring(11);

		
			JAXBContext contextObj = JAXBContext.newInstance(User.class);
			Unmarshaller uns = contextObj.createUnmarshaller();
			utilisateur = (User) uns.unmarshal(new File("data/"+nomFichier+".xml"));
				System.out.println("Evenement Informations");
				System.out.println("id: "+utilisateur.getID());

			
		} catch (JAXBException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}

}

package jaxb;

import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.io.*;
import java.util.Iterator;

import org.w3c.dom.Element;

public class EvenementJaxb {

	public String nomFichier;

	public EvenementJaxb(String nomFichier) {
		super();
		this.nomFichier = nomFichier;
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public void marshall(Evenements event) {

		StringWriter writer = new StringWriter();
		JAXB.marshal(event, new File("src/jaxb/"+nomFichier));
		JAXB.marshal(event, writer);
		String xmlString = writer.toString();
		System.out.println(xmlString);

	}

	public Evenements unmarshall(Evenements events) {

		InputStream xmlStream = Evenements.class.getResourceAsStream(nomFichier);
		events = JAXB.unmarshal(xmlStream, Evenements.class);
		Iterator<Evenements> it = events.iterator();
		System.out.println("Evenement Informations");
		System.out.println("id: " + events.toString());
		
		return events;
	}
	
	/*Old marshalling
	 * try { 
	 * JAXBContext contextObj = JAXBContext.newInstance(Evenements.class); 
	 * Marshaller marshallerObj = contextObj.createMarshaller();
	 * marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 * marshallerObj.marshal(event, System.out);
	 * marshallerObj.marshal(event, new File("data/" + nomFichier +".xml"));
	 * 
	 * } catch (JAXBException e) { 
	 * System.out.println("" + e.getMessage());
	 * e.printStackTrace(); 
	 * }
	 */

	//old unmarshalling
	//try{ 
	//JAXBContext contextObj = JAXBContext.newInstance(Reservation.class);
	// Unmarshaller uns = contextObj.createUnmarshaller();
	// event = (Evenement) uns.unmarshal(new
	// File("data/"+nomFichier+".xml")); 
	//} catch (JAXBException e) {
	// System.out.println(""+e.getMessage());
	// e.printStackTrace();
	// }
	
	/*
	 * 
	 * ReadXMLFile fileXML = new ReadXMLFile("data/"+nomFichier+".xml"); Element
	 * racine = fileXML.recupRacine(); return racine;
	 * 
	 * 
	 */

}

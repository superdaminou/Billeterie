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
		
		// Affichage
		String xmlString = writer.toString();
		System.out.println(xmlString);

	}

	public Evenements unmarshall() {

		
		InputStream xmlStream = Evenements.class.getResourceAsStream(nomFichier);
		Evenements events = JAXB.unmarshal(xmlStream, Evenements.class);
		
		// Affichage
		System.out.println("Evenement Informations");
		System.out.println("id: " + events.toString());
		
		return events;
	}

}

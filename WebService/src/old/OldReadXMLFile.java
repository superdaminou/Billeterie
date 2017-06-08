package old;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class OldReadXMLFile {
	
	public static String xmlWay;
	
	
    public OldReadXMLFile(String xmlWay) {
		this.xmlWay = xmlWay;
	}


	public String getXmlFile() {
		return xmlWay;
	}


	public void setXmlFile(String xmlWay) {
		this.xmlWay = xmlWay;
	}


	public Element recupRacine() {
        //récupération d'une instance de la classe "DocumentBuilderFactory"
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Element racine = null;
        try {
        	//création d'un parseur
            DocumentBuilder builder = factory.newDocumentBuilder();
		    
            //création d'un Document
		    Document document= builder.parse(new File(xmlWay));	
		    
		    //Affiche du prologue
		    System.out.println("*************PROLOGUE************");
		    System.out.println("version : " + document.getXmlVersion());
		    System.out.println("encodage : " + document.getXmlEncoding());		
	        System.out.println("standalone : " + document.getXmlStandalone());
						
		    //récupération de l'Element racine
		    racine = document.getDocumentElement();
			
		    //Affichage de l'élément racine
		    System.out.println("\n*************RACINE************");
		    System.out.println(racine.getNodeName());
		    
					
        }
        catch (final ParserConfigurationException e) {
            e.printStackTrace();
        }
        catch (final SAXException e) {
            e.printStackTrace();
        }
        catch (final IOException e) {
            e.printStackTrace();
        }	
		return racine; 
    }
}

package billeterie;
import java.io.FileOutputStream;  

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;  

public class ObjectToXml {
	public static void main(String nomClasse, String nomFichier ) throws JAXBException{ 
		try {
		   /*  // création d'un contexte JAXB sur la classe Marin
			JAXBContext contextObj = JAXBContext.newInstance(nomClasse.class);
		     
			// création d'un marshaller à partir de ce contexte
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		   
		    // et l'on demande à JAXB de formatter ce fichier de façon 
		    // à pouvoir le lire à l'oeil nu
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		  
		    Employee emp1=new Employee(1,"Vimal Jaiswal",50000);  
		     
		    // écriture finale du document XML dans un fichier
		    marshallerObj.marshal(emp1, new FileOutputStream(nomFichier+".xml"));  

*/
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

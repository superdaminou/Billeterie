package billeterie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaxb.*;

public class CreationAction extends HttpServlet {

	
	public static final String vue="/WEB-INF/ajoutEvent.jsp";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(HttpServletRequest request){
		
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		this.getServletContext().getRequestDispatcher( vue ).forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  {

		if(request.getParameter("creer")!= null)
		{
			try{
				
			String nom= (String) request.getAttribute("nom");
			String description= (String) request.getAttribute("description");
			int prix= (Integer) request.getAttribute("prix");
			Date date= (Date) request.getAttribute("date");
			int nbPlace = (int) request.getAttribute("nbPlace");
			
			String adresse= (String) request.getAttribute("adresse");
			String nomLieu = (String) request.getAttribute("nomLieu");
			int codePostal = (int) request.getAttribute("codePostale");
			String ville = (String) request.getAttribute("ville");

			Lieu lieu = new Lieu(nomLieu, adresse, codePostal, ville);
			
			Evenement evt= ServiceEvenement.nouvelEvenement( nbPlace,  nom,  lieu,  description,  date,  prix);
			
			ServiceEvenement.addUnEvent(evt);
			}catch (NullPointerException e ){
				e.printStackTrace();
			}
			
		}
	  }
	
	public Evenement nouvelEvenement(HttpServletRequest request){
		String nom= (String) request.getAttribute("nom");
		String description= (String) request.getAttribute("description");
		int prix= (Integer) request.getAttribute("prix");
		Date date= (Date) request.getAttribute("date");
		int nbPlace = (int) request.getAttribute("nbPlace");
		
		String adresse= (String) request.getAttribute("adresse");
		String nomLieu = (String) request.getAttribute("nomLieu");
		int codePostal = (int) request.getAttribute("codePostale");
		String ville = (String) request.getAttribute("ville");

		Lieu lieu = new Lieu(nomLieu, adresse, codePostal, ville);
		
		Evenement event=new Evenement(4,nbPlace,nom, lieu, description, date, prix);
		return event;
	}
	

	
}

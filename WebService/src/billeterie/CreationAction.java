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
		System.out.println("reussi");
		int id= (int) request.getAttribute("idEvent");
		
		Evenement event= new Evenement();
		event = ServiceEvenement.getEvent(id);
		request.setAttribute("event", event);
		
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		this.getServletContext().getRequestDispatcher( vue ).forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  {

		if(request.getParameter("creer")!= null)
		{
			String nom= (String) request.getAttribute("nom");
			String description= (String) request.getAttribute("description");
			int prix= (int) request.getAttribute("prix");
			Date date= (Date) request.getAttribute("date");
			int nbPlace = (int) request.getAttribute("nbPlace");
			
			

			String adresse= (String) request.getAttribute("adresse");
			String nomLieu = (String) request.getAttribute("nomLieu");
			int codePostal = (int) request.getAttribute("codePostale");
			String ville = (String) request.getAttribute("ville");

			Lieu lieu = new Lieu(nomLieu, adresse, codePostal, ville);
			
			Evenement event=new Evenement(nbPlace,nom, lieu, description, date, prix);
			
			ServiceEvenement.addEvent(event);
			
		
		
		}
	  }

	
}

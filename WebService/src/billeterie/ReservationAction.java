package billeterie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaxb.Evenement;
import jaxb.*;
public class ReservationAction extends HttpServlet {
	
	
	int idEvent;
	
	public static final String vue="/WEB-INF/reservation.jsp";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(HttpServletRequest request){
		idEvent= (int) request.getAttribute("idEvent");
		
		Evenement event= new Evenement();
		//event = ServiceEvenement.getUnEvent(idEvent);
		request.setAttribute("event", event);
		
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		this.getServletContext().getRequestDispatcher( vue ).forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  {

		if(request.getParameter("reserver")!= null)
		{
			String nom= (String) request.getAttribute("nom");
			String prenom= (String) request.getAttribute("prenom");
			String email= (String) request.getAttribute("email");
			User user = new User();
			user.setNom(nom);
			user.setPrenom(prenom);
			user.setMail(email);
			
			String nbPlace= (String) request.getAttribute("nbPlace");
			Reservation resa = new Reservation();
			resa.setNbPlaceReserve(Integer.parseInt(nbPlace));
			resa.setUser(user);
			//ServiceReservation.addResa(event);
			
		
		
		}
	  }

	
}

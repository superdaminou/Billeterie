package billeterie;

import jaxb.*;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaxb.User;


public class AccueilAction extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	public static final String vue="/WEB-INF/index.jsp";
	public static final String vueCrea="/CreationAction";
	Collection<Evenement> set = new HashSet<Evenement>();
	
	
	
	
	
	public void init(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);
		
	}
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		AccueilForm f = new AccueilForm();
		f.setListEvent(ServiceEvenement.getAllEvents().getEvents());
		this.getServletContext().setAttribute("set", f.getListEvent());
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);
		
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//On regarde si l'utilisateur a cliqué sur le bouton Réservation
		
				if(request.getParameter("btnResa")!= null)
				{	
					request.setAttribute("idEvt", request.getParameter("btnResa"));
					try{
						this.getServletContext().getRequestDispatcher("/ReservationAction").forward(request, response);
					}catch(Exception e){
						e.printStackTrace();
					}
				
				}
				
				
				//Si non, alors il a cliqué sur Création, on le redirige.
				else
				{
					
					try{
						this.getServletContext().getRequestDispatcher("/CreationAction").forward(request, response);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
	}

}
